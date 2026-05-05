package org.springframework.core.convert.support;

import com.dynatrace.android.agent.AdkSettings;
import com.facebook.hermes.intl.Constants;
import java.util.HashSet;
import java.util.Set;
import kotlinx.coroutines.DebugKt;
import org.springframework.core.convert.converter.Converter;

/* JADX INFO: loaded from: classes2.dex */
final class StringToBooleanConverter implements Converter<String, Boolean> {
    private static final Set<String> falseValues;
    private static final Set<String> trueValues;

    static {
        HashSet hashSet = new HashSet(4);
        trueValues = hashSet;
        HashSet hashSet2 = new HashSet(4);
        falseValues = hashSet2;
        hashSet.add("true");
        hashSet.add("on");
        hashSet.add("yes");
        hashSet.add("1");
        hashSet2.add(Constants.CASEFIRST_FALSE);
        hashSet2.add(DebugKt.DEBUG_PROPERTY_VALUE_OFF);
        hashSet2.add("no");
        hashSet2.add(AdkSettings.PLATFORM_TYPE_MOBILE);
    }

    StringToBooleanConverter() {
    }

    @Override // org.springframework.core.convert.converter.Converter
    public Boolean convert(String str) {
        String strTrim = str.trim();
        if ("".equals(strTrim)) {
            return null;
        }
        String lowerCase = strTrim.toLowerCase();
        if (trueValues.contains(lowerCase)) {
            return Boolean.TRUE;
        }
        if (falseValues.contains(lowerCase)) {
            return Boolean.FALSE;
        }
        throw new IllegalArgumentException("Invalid boolean value '" + str + "'");
    }
}
