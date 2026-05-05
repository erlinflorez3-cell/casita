package com.incode.welcome_sdk.commons.utils;

import com.google.android.gms.common.util.Strings;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f6497a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f6498b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Pattern f6499c = Pattern.compile("([A-Z][AEIOUX][A-Z]{2}\\d{2}(?:0[1-9]|1[0-2])(?:0[1-9]|[12]\\d|3[01])[HM](?:AS|B[CS]|C[CLMSH]|D[FG]|G[TR]|HG|JC|M[CNS]|N[ETL]|OC|PL|Q[TR]|S[PLR]|T[CSL]|VZ|YN|ZS)[B-DF-HJ-NP-TV-Z]{3}[A-Z\\d])(\\d)$");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f6500d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f6501e = 1;

    static {
        int i2 = f6497a + 1;
        f6501e = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static boolean a(CharSequence charSequence) {
        int i2 = 2 % 2;
        int i3 = f6500d + 65;
        f6498b = i3 % 128;
        int i4 = i3 % 2;
        if (!(!Strings.isEmptyOrWhitespace(charSequence.toString())) || !f6499c.matcher(charSequence.toString().toUpperCase()).matches()) {
            return false;
        }
        int i5 = f6500d + 85;
        f6498b = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }
}
