package com.google.zxing.client.android;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.dynatrace.android.agent.AdkSettings;
import com.facebook.hermes.intl.Constants;
import com.google.zxing.DecodeHintType;
import cz.msebera.android.httpclient.message.TokenParser;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public final class DecodeHintManager {
    private static final Pattern COMMA = Pattern.compile(",");
    private static final String TAG = "DecodeHintManager";

    private DecodeHintManager() {
    }

    public static Map<DecodeHintType, Object> parseDecodeHints(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null || extras.isEmpty()) {
            return null;
        }
        EnumMap enumMap = new EnumMap(DecodeHintType.class);
        for (DecodeHintType decodeHintType : DecodeHintType.values()) {
            if (decodeHintType != DecodeHintType.CHARACTER_SET && decodeHintType != DecodeHintType.NEED_RESULT_POINT_CALLBACK && decodeHintType != DecodeHintType.POSSIBLE_FORMATS) {
                String strName = decodeHintType.name();
                if (extras.containsKey(strName)) {
                    if (decodeHintType.getValueType().equals(Void.class)) {
                        enumMap.put(decodeHintType, Boolean.TRUE);
                    } else {
                        Object obj = extras.get(strName);
                        if (decodeHintType.getValueType().isInstance(obj)) {
                            enumMap.put(decodeHintType, obj);
                        } else {
                            String str = TAG;
                            String str2 = "Ignoring hint " + decodeHintType + " because it is not assignable from " + obj;
                        }
                    }
                }
            }
        }
        String str3 = TAG;
        String str4 = "Hints from the Intent: " + enumMap;
        return enumMap;
    }

    static Map<DecodeHintType, ?> parseDecodeHints(Uri uri) {
        String strSubstring;
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null || encodedQuery.isEmpty()) {
            return null;
        }
        Map<String, String> mapSplitQuery = splitQuery(encodedQuery);
        EnumMap enumMap = new EnumMap(DecodeHintType.class);
        for (DecodeHintType decodeHintType : DecodeHintType.values()) {
            if (decodeHintType != DecodeHintType.CHARACTER_SET && decodeHintType != DecodeHintType.NEED_RESULT_POINT_CALLBACK && decodeHintType != DecodeHintType.POSSIBLE_FORMATS && (strSubstring = mapSplitQuery.get(decodeHintType.name())) != null) {
                if (decodeHintType.getValueType().equals(Object.class)) {
                    enumMap.put(decodeHintType, strSubstring);
                } else if (decodeHintType.getValueType().equals(Void.class)) {
                    enumMap.put(decodeHintType, Boolean.TRUE);
                } else if (decodeHintType.getValueType().equals(String.class)) {
                    enumMap.put(decodeHintType, strSubstring);
                } else if (decodeHintType.getValueType().equals(Boolean.class)) {
                    if (strSubstring.isEmpty()) {
                        enumMap.put(decodeHintType, Boolean.TRUE);
                    } else if (AdkSettings.PLATFORM_TYPE_MOBILE.equals(strSubstring) || Constants.CASEFIRST_FALSE.equalsIgnoreCase(strSubstring) || "no".equalsIgnoreCase(strSubstring)) {
                        enumMap.put(decodeHintType, Boolean.FALSE);
                    } else {
                        enumMap.put(decodeHintType, Boolean.TRUE);
                    }
                } else if (decodeHintType.getValueType().equals(int[].class)) {
                    if (!strSubstring.isEmpty() && strSubstring.charAt(strSubstring.length() - 1) == ',') {
                        strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
                    }
                    String[] strArrSplit = COMMA.split(strSubstring);
                    int[] iArr = new int[strArrSplit.length];
                    int i2 = 0;
                    while (i2 < strArrSplit.length) {
                        try {
                            iArr[i2] = Integer.parseInt(strArrSplit[i2]);
                            i2++;
                        } catch (NumberFormatException unused) {
                            String str = TAG;
                            String str2 = "Skipping array of integers hint " + decodeHintType + " due to invalid numeric value: '" + strArrSplit[i2] + '\'';
                            iArr = null;
                        }
                    }
                    if (iArr != null) {
                        enumMap.put(decodeHintType, iArr);
                    }
                } else {
                    String str3 = TAG;
                    String str4 = "Unsupported hint type '" + decodeHintType + "' of type " + decodeHintType.getValueType();
                }
            }
        }
        String str5 = TAG;
        String str6 = "Hints from the URI: " + enumMap;
        return enumMap;
    }

    private static Map<String, String> splitQuery(String str) {
        String strDecode;
        HashMap map = new HashMap();
        int i2 = 0;
        while (true) {
            if (i2 >= str.length()) {
                break;
            }
            if (str.charAt(i2) == '&') {
                i2++;
            } else {
                int iIndexOf = str.indexOf(38, i2);
                int iIndexOf2 = str.indexOf(61, i2);
                String strDecode2 = "";
                if (iIndexOf < 0) {
                    if (iIndexOf2 < 0) {
                        strDecode = Uri.decode(str.substring(i2).replace('+', TokenParser.SP));
                    } else {
                        strDecode = Uri.decode(str.substring(i2, iIndexOf2).replace('+', TokenParser.SP));
                        strDecode2 = Uri.decode(str.substring(iIndexOf2 + 1).replace('+', TokenParser.SP));
                    }
                    if (!map.containsKey(strDecode)) {
                        map.put(strDecode, strDecode2);
                    }
                } else {
                    if (iIndexOf2 < 0 || iIndexOf2 > iIndexOf) {
                        String strDecode3 = Uri.decode(str.substring(i2, iIndexOf).replace('+', TokenParser.SP));
                        if (!map.containsKey(strDecode3)) {
                            map.put(strDecode3, "");
                        }
                    } else {
                        String strDecode4 = Uri.decode(str.substring(i2, iIndexOf2).replace('+', TokenParser.SP));
                        String strDecode5 = Uri.decode(str.substring(iIndexOf2 + 1, iIndexOf).replace('+', TokenParser.SP));
                        if (!map.containsKey(strDecode4)) {
                            map.put(strDecode4, strDecode5);
                        }
                    }
                    i2 = iIndexOf + 1;
                }
            }
        }
        return map;
    }
}
