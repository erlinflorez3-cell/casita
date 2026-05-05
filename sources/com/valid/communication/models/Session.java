package com.valid.communication.models;

import yg.C1593ug;
import yg.C1633zX;
import yg.ZN;

/* JADX INFO: loaded from: classes5.dex */
public class Session {
    private ExchangeKey exchangeKey;
    private String tokenAuth;

    public class IOException extends RuntimeException {
    }

    public Session() {
    }

    public Session(String str, ExchangeKey exchangeKey) {
        this.tokenAuth = str;
        this.exchangeKey = exchangeKey;
    }

    public ExchangeKey getExchangeKey() {
        return this.exchangeKey;
    }

    public String getTokenAuth() {
        return this.tokenAuth;
    }

    public String getUniqueIdSigned() {
        Integer numValueOf = 0;
        String uniqueIdSigned = this.exchangeKey.getUniqueIdSigned();
        String strZd = C1593ug.zd("'", (short) (ZN.Xd() ^ (C1633zX.Xd() ^ (1258716010 ^ (-1062678521)))), (short) (ZN.Xd() ^ (ZN.Xd() ^ 864700022)));
        if (uniqueIdSigned != null) {
            numValueOf = Integer.valueOf((Integer.parseInt(strZd) != 0 ? null : Integer.valueOf(this.exchangeKey.getUniqueIdSigned())).intValue() + 1);
        }
        ExchangeKey exchangeKey = this.exchangeKey;
        if (Integer.parseInt(strZd) == 0) {
            exchangeKey.setUniqueIdSigned(numValueOf.toString());
        }
        return this.exchangeKey.getUniqueIdSigned();
    }

    public void setExchangeKey(ExchangeKey exchangeKey) {
        try {
            this.exchangeKey = exchangeKey;
        } catch (IOException unused) {
        }
    }

    public void setTokenAuth(String str) {
        try {
            this.tokenAuth = str;
        } catch (IOException unused) {
        }
    }
}
