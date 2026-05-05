package com.facetec.sdk;

import com.dynatrace.android.agent.Global;
import java.lang.reflect.Field;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public enum ch implements cj {
    IDENTITY { // from class: com.facetec.sdk.ch.2
        @Override // com.facetec.sdk.cj
        public final String V(Field field) {
            return field.getName();
        }
    },
    UPPER_CAMEL_CASE { // from class: com.facetec.sdk.ch.3
        @Override // com.facetec.sdk.cj
        public final String V(Field field) {
            return V(field.getName());
        }
    },
    UPPER_CAMEL_CASE_WITH_SPACES { // from class: com.facetec.sdk.ch.4
        @Override // com.facetec.sdk.cj
        public final String V(Field field) {
            return V(Z(field.getName(), Global.BLANK));
        }
    },
    LOWER_CASE_WITH_UNDERSCORES { // from class: com.facetec.sdk.ch.1
        @Override // com.facetec.sdk.cj
        public final String V(Field field) {
            return Z(field.getName(), Global.UNDERSCORE).toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DASHES { // from class: com.facetec.sdk.ch.5
        @Override // com.facetec.sdk.cj
        public final String V(Field field) {
            return Z(field.getName(), Global.HYPHEN).toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DOTS { // from class: com.facetec.sdk.ch.9
        @Override // com.facetec.sdk.cj
        public final String V(Field field) {
            return Z(field.getName(), ".").toLowerCase(Locale.ENGLISH);
        }
    };

    /* synthetic */ ch(byte b2) {
        this();
    }

    static String V(String str) {
        int length = str.length() - 1;
        int i2 = 0;
        while (!Character.isLetter(str.charAt(i2)) && i2 < length) {
            i2++;
        }
        char cCharAt = str.charAt(i2);
        if (Character.isUpperCase(cCharAt)) {
            return str;
        }
        char upperCase = Character.toUpperCase(cCharAt);
        return i2 == 0 ? new StringBuilder().append(upperCase).append(str.substring(1)).toString() : new StringBuilder().append(str.substring(0, i2)).append(upperCase).append(str.substring(i2 + 1)).toString();
    }

    static String Z(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (Character.isUpperCase(cCharAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }
}
