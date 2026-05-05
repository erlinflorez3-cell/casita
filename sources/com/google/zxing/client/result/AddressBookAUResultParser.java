package com.google.zxing.client.result;

import com.google.zxing.Result;
import cz.msebera.android.httpclient.message.TokenParser;
import java.util.ArrayList;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public final class AddressBookAUResultParser extends ResultParser {
    private static String[] matchMultipleValuePrefix(String str, String str2) {
        String strMatchSinglePrefixedField;
        ArrayList arrayList = null;
        for (int i2 = 1; i2 <= 3 && (strMatchSinglePrefixedField = matchSinglePrefixedField(str + i2 + AbstractJsonLexerKt.COLON, str2, TokenParser.CR, true)) != null; i2++) {
            if (arrayList == null) {
                arrayList = new ArrayList(3);
            }
            arrayList.add(strMatchSinglePrefixedField);
        }
        if (arrayList == null) {
            return null;
        }
        return (String[]) arrayList.toArray(EMPTY_STR_ARRAY);
    }

    @Override // com.google.zxing.client.result.ResultParser
    public AddressBookParsedResult parse(Result result) {
        String massagedText = getMassagedText(result);
        if (!massagedText.contains("MEMORY") || !massagedText.contains("\r\n")) {
            return null;
        }
        String strMatchSinglePrefixedField = matchSinglePrefixedField("NAME1:", massagedText, TokenParser.CR, true);
        String strMatchSinglePrefixedField2 = matchSinglePrefixedField("NAME2:", massagedText, TokenParser.CR, true);
        String[] strArrMatchMultipleValuePrefix = matchMultipleValuePrefix("TEL", massagedText);
        String[] strArrMatchMultipleValuePrefix2 = matchMultipleValuePrefix("MAIL", massagedText);
        String strMatchSinglePrefixedField3 = matchSinglePrefixedField("MEMORY:", massagedText, TokenParser.CR, false);
        String strMatchSinglePrefixedField4 = matchSinglePrefixedField("ADD:", massagedText, TokenParser.CR, true);
        return new AddressBookParsedResult(maybeWrap(strMatchSinglePrefixedField), null, strMatchSinglePrefixedField2, strArrMatchMultipleValuePrefix, null, strArrMatchMultipleValuePrefix2, null, null, strMatchSinglePrefixedField3, strMatchSinglePrefixedField4 != null ? new String[]{strMatchSinglePrefixedField4} : null, null, null, null, null, null, null);
    }
}
