package org.currency.service;

import org.currency.entity.Currency;
import org.currency.service.impl.NbrbCurrencyConversionService;

public interface CurrencyConversionService {
    static CurrencyConversionService getInstance() {
        return new NbrbCurrencyConversionService();
    }
    double getConversionRatio(Currency original, Currency target);
}
