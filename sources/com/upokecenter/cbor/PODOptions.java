package com.upokecenter.cbor;

import com.facebook.hermes.intl.Constants;

/* JADX INFO: loaded from: classes5.dex */
public class PODOptions {
    public static final PODOptions Default = new PODOptions();
    private final boolean propVarusecamelcase;

    public PODOptions() {
        this("");
    }

    public PODOptions(String str) {
        if (str == null) {
            throw new NullPointerException("paramString");
        }
        this.propVarusecamelcase = new OptionsParser(str).GetBoolean("usecamelcase", true);
    }

    @Deprecated
    public PODOptions(boolean z2, boolean z3) {
        this.propVarusecamelcase = z3;
    }

    public final boolean getUseCamelCase() {
        return this.propVarusecamelcase;
    }

    public String toString() {
        return "usecamelcase=".concat(getUseCamelCase() ? "true" : Constants.CASEFIRST_FALSE);
    }
}
