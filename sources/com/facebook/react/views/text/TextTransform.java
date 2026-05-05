package com.facebook.react.views.text;

import java.text.BreakIterator;

/* JADX INFO: loaded from: classes3.dex */
public enum TextTransform {
    NONE,
    UPPERCASE,
    LOWERCASE,
    CAPITALIZE,
    UNSET;

    /* JADX INFO: renamed from: com.facebook.react.views.text.TextTransform$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$views$text$TextTransform;

        static {
            int[] iArr = new int[TextTransform.values().length];
            $SwitchMap$com$facebook$react$views$text$TextTransform = iArr;
            try {
                iArr[TextTransform.UPPERCASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$react$views$text$TextTransform[TextTransform.LOWERCASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$react$views$text$TextTransform[TextTransform.CAPITALIZE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static String apply(String str, TextTransform textTransform) {
        if (str == null) {
            return null;
        }
        int i2 = AnonymousClass1.$SwitchMap$com$facebook$react$views$text$TextTransform[textTransform.ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? str : capitalize(str) : str.toLowerCase() : str.toUpperCase();
    }

    private static String capitalize(String str) {
        BreakIterator wordInstance = BreakIterator.getWordInstance();
        wordInstance.setText(str);
        StringBuilder sb = new StringBuilder(str.length());
        int iFirst = wordInstance.first();
        while (true) {
            int i2 = iFirst;
            iFirst = wordInstance.next();
            if (iFirst == -1) {
                return sb.toString();
            }
            String strSubstring = str.substring(i2, iFirst);
            if (Character.isLetterOrDigit(strSubstring.charAt(0))) {
                sb.append(Character.toUpperCase(strSubstring.charAt(0)));
                sb.append(strSubstring.substring(1).toLowerCase());
            } else {
                sb.append(strSubstring);
            }
        }
    }
}
