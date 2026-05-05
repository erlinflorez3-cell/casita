package com.google.zxing.client.result;

/* JADX INFO: loaded from: classes7.dex */
abstract class AbstractDoCoMoResultParser extends ResultParser {
    AbstractDoCoMoResultParser() {
    }

    static String[] matchDoCoMoPrefixedField(String str, String str2) {
        return matchPrefixedField(str, str2, ';', true);
    }

    static String matchSingleDoCoMoPrefixedField(String str, String str2, boolean z2) {
        return matchSinglePrefixedField(str, str2, ';', z2);
    }
}
