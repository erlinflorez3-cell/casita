package com.upokecenter.cbor;

import com.facebook.hermes.intl.Constants;

/* JADX INFO: loaded from: classes5.dex */
public final class CBOREncodeOptions {
    public static final CBOREncodeOptions Default = new CBOREncodeOptions();
    public static final CBOREncodeOptions DefaultCtap2Canonical = new CBOREncodeOptions("ctap2canonical=true");
    private final boolean propVarallowduplicatekeys;
    private final boolean propVarallowempty;
    private final boolean propVarctap2canonical;
    private final boolean propVarfloat64;
    private final boolean propVarkeepkeyorder;
    private final boolean propVarresolvereferences;
    private final boolean propVaruseindeflengthstrings;

    public CBOREncodeOptions() {
        this("");
    }

    public CBOREncodeOptions(String str) {
        if (str == null) {
            throw new NullPointerException("paramString");
        }
        OptionsParser optionsParser = new OptionsParser(str);
        this.propVarresolvereferences = optionsParser.GetBoolean("resolvereferences", false);
        this.propVaruseindeflengthstrings = optionsParser.GetBoolean("useindeflengthstrings", false);
        this.propVarfloat64 = optionsParser.GetBoolean("float64", false);
        this.propVarallowduplicatekeys = optionsParser.GetBoolean("allowduplicatekeys", false);
        this.propVarkeepkeyorder = optionsParser.GetBoolean("keepkeyorder", false);
        this.propVarallowempty = optionsParser.GetBoolean("allowempty", false);
        this.propVarctap2canonical = optionsParser.GetBoolean("ctap2canonical", false);
    }

    @Deprecated
    public CBOREncodeOptions(boolean z2, boolean z3) {
        this(z2, z3, false);
    }

    @Deprecated
    public CBOREncodeOptions(boolean z2, boolean z3, boolean z4) {
        this.propVarresolvereferences = false;
        this.propVarallowempty = false;
        this.propVarfloat64 = false;
        this.propVarkeepkeyorder = false;
        this.propVaruseindeflengthstrings = z2;
        this.propVarallowduplicatekeys = z3;
        this.propVarctap2canonical = z4;
    }

    public final boolean getAllowDuplicateKeys() {
        return this.propVarallowduplicatekeys;
    }

    public final boolean getAllowEmpty() {
        return this.propVarallowempty;
    }

    public final boolean getCtap2Canonical() {
        return this.propVarctap2canonical;
    }

    public final boolean getFloat64() {
        return this.propVarfloat64;
    }

    public final boolean getKeepKeyOrder() {
        return this.propVarkeepkeyorder;
    }

    public final boolean getResolveReferences() {
        return this.propVarresolvereferences;
    }

    public final boolean getUseIndefLengthStrings() {
        return this.propVaruseindeflengthstrings;
    }

    public String toString() {
        return "allowduplicatekeys=" + (getAllowDuplicateKeys() ? "true" : Constants.CASEFIRST_FALSE) + ";useindeflengthstrings=" + (getUseIndefLengthStrings() ? "true" : Constants.CASEFIRST_FALSE) + ";float64=" + (getFloat64() ? "true" : Constants.CASEFIRST_FALSE) + ";ctap2canonical=" + (getCtap2Canonical() ? "true" : Constants.CASEFIRST_FALSE) + ";keepkeyorder=" + (getKeepKeyOrder() ? "true" : Constants.CASEFIRST_FALSE) + ";resolvereferences=" + (getResolveReferences() ? "true" : Constants.CASEFIRST_FALSE) + ";allowempty=" + (getAllowEmpty() ? "true" : Constants.CASEFIRST_FALSE);
    }
}
