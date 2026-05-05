package com.valid.communication.managers.exchangemanager;

import com.valid.communication.events.BaseErrorEvent;
import com.valid.communication.models.ExchangeKey;

/* JADX INFO: loaded from: classes5.dex */
public interface ExchangeManagerCallback {

    public class ParseException extends RuntimeException {
    }

    void exchangeKeyCompletion(ExchangeKey exchangeKey, BaseErrorEvent baseErrorEvent);
}
