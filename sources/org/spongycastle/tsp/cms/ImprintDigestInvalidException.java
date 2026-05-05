package org.spongycastle.tsp.cms;

import org.spongycastle.tsp.TimeStampToken;

/* JADX INFO: loaded from: classes2.dex */
public class ImprintDigestInvalidException extends Exception {
    private TimeStampToken token;

    public ImprintDigestInvalidException(String str, TimeStampToken timeStampToken) {
        super(str);
        this.token = timeStampToken;
    }

    public TimeStampToken getTimeStampToken() {
        return this.token;
    }
}
