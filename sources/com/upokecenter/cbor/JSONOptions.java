package com.upokecenter.cbor;

import com.dynatrace.android.agent.AdkSettings;
import com.facebook.hermes.intl.Constants;

/* JADX INFO: loaded from: classes5.dex */
public final class JSONOptions {
    public static final JSONOptions Default = new JSONOptions();
    private final boolean propVarallowduplicatekeys;
    private final boolean propVarbase64padding;
    private final boolean propVarkeepkeyorder;
    private final ConversionMode propVarnumberconversion;
    private final boolean propVarpreservenegativezero;
    private final boolean propVarreplacesurrogates;
    private final boolean propVarwritebasic;

    public enum ConversionMode {
        Full,
        Double,
        IntOrFloat,
        IntOrFloatFromDouble,
        Decimal128
    }

    public JSONOptions() {
        this("");
    }

    public JSONOptions(String str) {
        if (str == null) {
            throw new NullPointerException("paramString");
        }
        OptionsParser optionsParser = new OptionsParser(str);
        this.propVarpreservenegativezero = optionsParser.GetBoolean("preservenegativezero", true);
        this.propVarallowduplicatekeys = optionsParser.GetBoolean("allowduplicatekeys", false);
        this.propVarkeepkeyorder = optionsParser.GetBoolean("keepkeyorder", false);
        this.propVarbase64padding = optionsParser.GetBoolean("base64padding", true);
        this.propVarreplacesurrogates = optionsParser.GetBoolean("replacesurrogates", false);
        this.propVarnumberconversion = ToNumberConversion(optionsParser.GetLCString("numberconversion", null));
        this.propVarwritebasic = optionsParser.GetBoolean("writebasic", false);
    }

    @Deprecated
    public JSONOptions(boolean z2) {
        this("base64Padding=".concat(z2 ? "1" : AdkSettings.PLATFORM_TYPE_MOBILE));
    }

    @Deprecated
    public JSONOptions(boolean z2, boolean z3) {
        this("base64Padding=" + (z2 ? "1" : AdkSettings.PLATFORM_TYPE_MOBILE) + ";replacesurrogates=" + (z3 ? "1" : AdkSettings.PLATFORM_TYPE_MOBILE));
    }

    private String FromNumberConversion() {
        ConversionMode numberConversion = getNumberConversion();
        return numberConversion == ConversionMode.Full ? "full" : numberConversion == ConversionMode.Double ? "double" : numberConversion == ConversionMode.Decimal128 ? "decimal128" : numberConversion == ConversionMode.IntOrFloat ? "intorfloat" : numberConversion == ConversionMode.IntOrFloatFromDouble ? "intorfloatfromdouble" : "full";
    }

    private static ConversionMode ToNumberConversion(String str) {
        if (str != null && !str.equals("full")) {
            if (str.equals("double")) {
                return ConversionMode.Double;
            }
            if (str.equals("decimal128")) {
                return ConversionMode.Decimal128;
            }
            if (str.equals("intorfloat")) {
                return ConversionMode.IntOrFloat;
            }
            if (str.equals("intorfloatfromdouble")) {
                return ConversionMode.IntOrFloatFromDouble;
            }
            throw new IllegalArgumentException("Unrecognized conversion mode");
        }
        return ConversionMode.Full;
    }

    public final boolean getAllowDuplicateKeys() {
        return this.propVarallowduplicatekeys;
    }

    @Deprecated
    public final boolean getBase64Padding() {
        return this.propVarbase64padding;
    }

    public final boolean getKeepKeyOrder() {
        return this.propVarkeepkeyorder;
    }

    public final ConversionMode getNumberConversion() {
        return this.propVarnumberconversion;
    }

    public final boolean getPreserveNegativeZero() {
        return this.propVarpreservenegativezero;
    }

    public final boolean getReplaceSurrogates() {
        return this.propVarreplacesurrogates;
    }

    public final boolean getWriteBasic() {
        return this.propVarwritebasic;
    }

    public String toString() {
        return "base64padding=" + (getBase64Padding() ? "true" : Constants.CASEFIRST_FALSE) + ";replacesurrogates=" + (getReplaceSurrogates() ? "true" : Constants.CASEFIRST_FALSE) + ";preservenegativezero=" + (getPreserveNegativeZero() ? "true" : Constants.CASEFIRST_FALSE) + ";keepkeyorder=" + (getKeepKeyOrder() ? "true" : Constants.CASEFIRST_FALSE) + ";numberconversion=" + FromNumberConversion() + ";allowduplicatekeys=" + (getAllowDuplicateKeys() ? "true" : Constants.CASEFIRST_FALSE) + ";writebasic=" + (getWriteBasic() ? "true" : Constants.CASEFIRST_FALSE);
    }
}
