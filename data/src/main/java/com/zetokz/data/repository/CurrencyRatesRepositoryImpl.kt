package com.zetokz.data.repository

import com.zetokz.data.database.dao.CurrencyDao
import com.zetokz.data.model.Conversion
import com.zetokz.data.model.Currency
import com.zetokz.data.model.toConversionList
import com.zetokz.data.network.CurrencyRateService
import com.zetokz.data.network.ExchangeRateService
import dagger.Reusable
import io.reactivex.Completable
import io.reactivex.Flowable
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

/**
 * Created by Yevhenii Rechun on 1/16/18.
 * Copyright © 2017. All rights reserved.
 */
@Reusable
internal class CurrencyRatesRepositoryImpl @Inject constructor(
    private val currencyRateService: CurrencyRateService,
    private val exchangeRateService: ExchangeRateService,
    private val currencyDao: CurrencyDao
) : CurrencyRatesRepository {

    override fun getAvailableCurrencies(): Single<List<Currency>> =
        currencyRateService.fetchAvailableCurrencies()
            .map { it.data.asSequence().map { it.value }.toList() }
            .subscribeOn(Schedulers.io())

    override fun getChosenCurrencies(): Flowable<List<Currency>> = currencyDao.findAll()
        .subscribeOn(Schedulers.io())

    override fun saveCurrencies(currencies: List<Currency>) =
        Completable.fromAction { currencyDao.updateChosenCurrencies(currencies) }
            .subscribeOn(Schedulers.io())

    override fun removeCurrencyById(currencyId: Int) =
        Completable.fromAction { currencyDao.deleteCurrencyById(currencyId) }
            .subscribeOn(Schedulers.io())

    override fun getExchangeRates(baseCurrency: String): Single<List<Conversion>> =
        exchangeRateService.fetchExchangeRate(baseCurrency)
            .subscribeOn(Schedulers.io())
            .map { it.toConversionList(baseCurrency) }
}