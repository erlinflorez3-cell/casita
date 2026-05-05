package com.google.zxing.client.result;

import com.google.zxing.Result;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class SMSMMSResultParser extends ResultParser {
    private static void addNumberVia(Collection<String> collection, Collection<String> collection2, String str) {
        int iIndexOf = str.indexOf(59);
        if (iIndexOf < 0) {
            collection.add(str);
            collection2.add(null);
        } else {
            collection.add(str.substring(0, iIndexOf));
            String strSubstring = str.substring(iIndexOf + 1);
            collection2.add(strSubstring.startsWith("via=") ? strSubstring.substring(4) : null);
        }
    }

    @Override // com.google.zxing.client.result.ResultParser
    public SMSParsedResult parse(Result result) {
        boolean z2;
        String str;
        String massagedText = getMassagedText(result);
        String str2 = null;
        if (!massagedText.startsWith("sms:") && !massagedText.startsWith("SMS:") && !massagedText.startsWith("mms:") && !massagedText.startsWith("MMS:")) {
            return null;
        }
        Map<String, String> nameValuePairs = parseNameValuePairs(massagedText);
        if (nameValuePairs == null || nameValuePairs.isEmpty()) {
            z2 = false;
            str = null;
        } else {
            str2 = nameValuePairs.get("subject");
            str = nameValuePairs.get("body");
            z2 = true;
        }
        int iIndexOf = massagedText.indexOf(63, 4);
        String strSubstring = (iIndexOf < 0 || !z2) ? massagedText.substring(4) : massagedText.substring(4, iIndexOf);
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        int i2 = -1;
        while (true) {
            int i3 = i2 + 1;
            int iIndexOf2 = strSubstring.indexOf(44, i3);
            if (iIndexOf2 <= i2) {
                addNumberVia(arrayList, arrayList2, strSubstring.substring(i3));
                return new SMSParsedResult((String[]) arrayList.toArray(EMPTY_STR_ARRAY), (String[]) arrayList2.toArray(EMPTY_STR_ARRAY), str2, str);
            }
            addNumberVia(arrayList, arrayList2, strSubstring.substring(i3, iIndexOf2));
            i2 = iIndexOf2;
        }
    }
}
