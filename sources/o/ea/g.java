package o.ea;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f23521a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f23522b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f23523c = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f23526j = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Charset f23525e = StandardCharsets.UTF_8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Locale f23524d = Locale.getDefault();

    static {
        int i2 = f23523c;
        int i3 = (i2 ^ 23) + ((i2 & 23) << 1);
        f23526j = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public static Charset c() {
        int i2 = 2 % 2;
        int i3 = f23521a;
        int i4 = (((-1) - (((-1) - i3) & ((-1) - 117))) << 1) - (i3 ^ 117);
        int i5 = i4 % 128;
        f23522b = i5;
        int i6 = i4 % 2;
        Charset charset = f23525e;
        int i7 = i5 + 99;
        f23521a = i7 % 128;
        if (i7 % 2 == 0) {
            return charset;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static Locale d() {
        int i2 = 2 % 2;
        int i3 = f23521a;
        int i4 = i3 + 105;
        f23522b = i4 % 128;
        int i5 = i4 % 2;
        Locale locale = f23524d;
        int i6 = i3 + 51;
        f23522b = i6 % 128;
        int i7 = i6 % 2;
        return locale;
    }
}
