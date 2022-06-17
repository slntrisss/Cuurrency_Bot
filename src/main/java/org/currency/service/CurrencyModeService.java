package org.currency.service;

import org.currency.entity.Currency;
import org.currency.service.impl.HashMapCurrencyModeService;

public interface CurrencyModeService {
    static HashMapCurrencyModeService getInstance(){
        return new HashMapCurrencyModeService();
    }
    Currency getOriginalCurrency(long chatId);

    Currency getTargetCurrency(long chatId);

    void setOriginalCurrency(long chatId, Currency currency);

    void setTargetCurrency(long chatId, Currency currency);
}
