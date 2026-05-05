package com.upokecenter.cbor;

import com.dynatrace.android.agent.Global;
import com.upokecenter.util.DataUtilities;
import io.sentry.rrweb.RRWebOptionsEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class OptionsParser {
    private final Map<String, String> dict = new HashMap();

    public OptionsParser(String str) {
        if (str == null) {
            throw new NullPointerException(RRWebOptionsEvent.EVENT_TAG);
        }
        if (str.length() > 0) {
            for (String str2 : SplitAt(str, Global.SEMICOLON)) {
                int iIndexOf = str2.indexOf(61);
                if (iIndexOf < 0) {
                    throw new IllegalArgumentException("Invalid options String: " + str);
                }
                this.dict.put(DataUtilities.ToLowerCaseAscii(str2.substring(0, iIndexOf)), str2.substring(iIndexOf + 1));
            }
        }
    }

    private static String[] SplitAt(String str, String str2) {
        if (str2 == null) {
            throw new NullPointerException("delimiter");
        }
        if (str2.length() == 0) {
            throw new IllegalArgumentException("delimiter is empty.");
        }
        if (str == null || str.length() == 0) {
            return new String[]{""};
        }
        int length = str2.length();
        ArrayList arrayList = null;
        boolean z2 = true;
        int i2 = 0;
        while (true) {
            int iIndexOf = str.indexOf(str2, i2);
            if (iIndexOf < 0) {
                break;
            }
            String strSubstring = str.substring(i2, (iIndexOf - i2) + i2);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(strSubstring);
            i2 = iIndexOf + length;
            z2 = false;
        }
        if (z2) {
            return new String[]{str};
        }
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        arrayList.add(str.substring(i2));
        return (String[]) arrayList.toArray(new String[0]);
    }

    public boolean GetBoolean(String str, boolean z2) {
        String strToLowerCaseAscii = DataUtilities.ToLowerCaseAscii(str);
        if (!this.dict.containsKey(strToLowerCaseAscii)) {
            return z2;
        }
        String strToLowerCaseAscii2 = DataUtilities.ToLowerCaseAscii(this.dict.get(strToLowerCaseAscii));
        return strToLowerCaseAscii2.equals("1") || strToLowerCaseAscii2.equals("yes") || strToLowerCaseAscii2.equals("on") || strToLowerCaseAscii2.equals("true");
    }

    public String GetLCString(String str, String str2) {
        String strToLowerCaseAscii = DataUtilities.ToLowerCaseAscii(str);
        return this.dict.containsKey(strToLowerCaseAscii) ? DataUtilities.ToLowerCaseAscii(this.dict.get(strToLowerCaseAscii)) : str2;
    }
}
