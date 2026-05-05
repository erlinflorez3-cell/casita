package com.google.zxing.client.result;

import com.facebook.hermes.intl.Constants;
import com.google.zxing.Result;

/* JADX INFO: loaded from: classes7.dex */
public final class WifiResultParser extends ResultParser {
    @Override // com.google.zxing.client.result.ResultParser
    public WifiParsedResult parse(Result result) {
        String strSubstring;
        String strMatchSinglePrefixedField;
        boolean z2;
        String massagedText = getMassagedText(result);
        if (!massagedText.startsWith("WIFI:") || (strMatchSinglePrefixedField = matchSinglePrefixedField("S:", (strSubstring = massagedText.substring(5)), ';', false)) == null || strMatchSinglePrefixedField.isEmpty()) {
            return null;
        }
        String strMatchSinglePrefixedField2 = matchSinglePrefixedField("P:", strSubstring, ';', false);
        String strMatchSinglePrefixedField3 = matchSinglePrefixedField("T:", strSubstring, ';', false);
        if (strMatchSinglePrefixedField3 == null) {
            strMatchSinglePrefixedField3 = "nopass";
        }
        String strMatchSinglePrefixedField4 = matchSinglePrefixedField("PH2:", strSubstring, ';', false);
        String strMatchSinglePrefixedField5 = matchSinglePrefixedField("H:", strSubstring, ';', false);
        if (strMatchSinglePrefixedField5 == null) {
            z2 = false;
        } else if (strMatchSinglePrefixedField4 != null || "true".equalsIgnoreCase(strMatchSinglePrefixedField5) || Constants.CASEFIRST_FALSE.equalsIgnoreCase(strMatchSinglePrefixedField5)) {
            z2 = Boolean.parseBoolean(strMatchSinglePrefixedField5);
        } else {
            strMatchSinglePrefixedField4 = strMatchSinglePrefixedField5;
            z2 = false;
        }
        return new WifiParsedResult(strMatchSinglePrefixedField3, strMatchSinglePrefixedField, strMatchSinglePrefixedField2, z2, matchSinglePrefixedField("I:", strSubstring, ';', false), matchSinglePrefixedField("A:", strSubstring, ';', false), matchSinglePrefixedField("E:", strSubstring, ';', false), strMatchSinglePrefixedField4);
    }
}
