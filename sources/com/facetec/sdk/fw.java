package com.facetec.sdk;

import java.nio.charset.Charset;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class fw {
    private final String B;

    @Nullable
    private final String Code;
    private static final Pattern Z = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    private static final Pattern V = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    private fw(String str, @Nullable String str2) {
        this.B = str;
        this.Code = str2;
    }

    public static fw I(String str) {
        Matcher matcher = Z.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException(new StringBuilder("No subtype found for: \"").append(str).append('\"').toString());
        }
        matcher.group(1);
        matcher.group(2);
        Matcher matcher2 = V.matcher(str);
        String str2 = null;
        for (int iEnd = matcher.end(); iEnd < str.length(); iEnd = matcher2.end()) {
            matcher2.region(iEnd, str.length());
            if (!matcher2.lookingAt()) {
                throw new IllegalArgumentException(new StringBuilder("Parameter is not formatted correctly: \"").append(str.substring(iEnd)).append("\" for: \"").append(str).append('\"').toString());
            }
            String strGroup = matcher2.group(1);
            if (strGroup != null && strGroup.equalsIgnoreCase("charset")) {
                String strGroup2 = matcher2.group(2);
                if (strGroup2 == null) {
                    strGroup2 = matcher2.group(3);
                } else if (strGroup2.startsWith("'") && strGroup2.endsWith("'") && strGroup2.length() > 2) {
                    strGroup2 = strGroup2.substring(1, strGroup2.length() - 1);
                }
                if (str2 != null && !strGroup2.equalsIgnoreCase(str2)) {
                    throw new IllegalArgumentException(new StringBuilder("Multiple charsets defined: \"").append(str2).append("\" and: \"").append(strGroup2).append("\" for: \"").append(str).append('\"').toString());
                }
                str2 = strGroup2;
            }
        }
        return new fw(str, str2);
    }

    @Nullable
    public static fw V(String str) {
        try {
            return I(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Nullable
    public final Charset Code() {
        return I((Charset) null);
    }

    @Nullable
    public final Charset I(@Nullable Charset charset) {
        try {
            String str = this.Code;
            return str != null ? Charset.forName(str) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof fw) && ((fw) obj).B.equals(this.B);
    }

    public final int hashCode() {
        return this.B.hashCode();
    }

    public final String toString() {
        return this.B;
    }
}
