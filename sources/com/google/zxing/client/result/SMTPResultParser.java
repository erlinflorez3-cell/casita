package com.google.zxing.client.result;

import com.google.zxing.Result;

/* JADX INFO: loaded from: classes7.dex */
public final class SMTPResultParser extends ResultParser {
    @Override // com.google.zxing.client.result.ResultParser
    public EmailAddressParsedResult parse(Result result) {
        String strSubstring;
        String massagedText = getMassagedText(result);
        String strSubstring2 = null;
        if (!massagedText.startsWith("smtp:") && !massagedText.startsWith("SMTP:")) {
            return null;
        }
        String strSubstring3 = massagedText.substring(5);
        int iIndexOf = strSubstring3.indexOf(58);
        if (iIndexOf >= 0) {
            strSubstring = strSubstring3.substring(iIndexOf + 1);
            strSubstring3 = strSubstring3.substring(0, iIndexOf);
            int iIndexOf2 = strSubstring.indexOf(58);
            if (iIndexOf2 >= 0) {
                strSubstring2 = strSubstring.substring(iIndexOf2 + 1);
                strSubstring = strSubstring.substring(0, iIndexOf2);
            }
        } else {
            strSubstring = null;
            strSubstring2 = null;
        }
        return new EmailAddressParsedResult(new String[]{strSubstring3}, null, null, strSubstring, strSubstring2);
    }
}
