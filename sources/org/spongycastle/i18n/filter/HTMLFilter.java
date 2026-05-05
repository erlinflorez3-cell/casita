package org.spongycastle.i18n.filter;

/* JADX INFO: loaded from: classes2.dex */
public class HTMLFilter implements Filter {
    @Override // org.spongycastle.i18n.filter.Filter
    public String doFilter(String str) {
        StringBuffer stringBuffer = new StringBuffer(str);
        int i2 = 0;
        while (i2 < stringBuffer.length()) {
            char cCharAt = stringBuffer.charAt(i2);
            if (cCharAt == '\"') {
                stringBuffer.replace(i2, i2 + 1, "&#34");
            } else if (cCharAt == '#') {
                stringBuffer.replace(i2, i2 + 1, "&#35");
            } else if (cCharAt == '+') {
                stringBuffer.replace(i2, i2 + 1, "&#43");
            } else if (cCharAt == '-') {
                stringBuffer.replace(i2, i2 + 1, "&#45");
            } else if (cCharAt == '>') {
                stringBuffer.replace(i2, i2 + 1, "&#62");
            } else if (cCharAt == ';') {
                stringBuffer.replace(i2, i2 + 1, "&#59");
            } else if (cCharAt != '<') {
                switch (cCharAt) {
                    case '%':
                        stringBuffer.replace(i2, i2 + 1, "&#37");
                        break;
                    case '&':
                        stringBuffer.replace(i2, i2 + 1, "&#38");
                        break;
                    case '\'':
                        stringBuffer.replace(i2, i2 + 1, "&#39");
                        break;
                    case '(':
                        stringBuffer.replace(i2, i2 + 1, "&#40");
                        break;
                    case ')':
                        stringBuffer.replace(i2, i2 + 1, "&#41");
                        break;
                    default:
                        i2 -= 3;
                        break;
                }
            } else {
                stringBuffer.replace(i2, i2 + 1, "&#60");
            }
            i2 += 4;
        }
        return stringBuffer.toString();
    }

    @Override // org.spongycastle.i18n.filter.Filter
    public String doFilterUrl(String str) {
        return doFilter(str);
    }
}
