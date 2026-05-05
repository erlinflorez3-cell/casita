package com.incode.welcome_sdk.data.remote.b;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends Throwable {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static char f9051b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char f9052c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char f9053d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f9054f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static char f9055g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f9056h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9057a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f9058e;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r8, short r9, byte r10) {
        /*
            int r0 = r8 * 3
            int r8 = r0 + 1
            int r0 = r10 * 5
            int r7 = 110 - r0
            int r0 = r9 * 4
            int r6 = 3 - r0
            byte[] r5 = com.incode.welcome_sdk.data.remote.b.b.$$a
            byte[] r4 = new byte[r8]
            r3 = 0
            if (r5 != 0) goto L2c
            r7 = r8
            r0 = r6
            r2 = r3
        L16:
            int r6 = r6 + r7
            r1 = r2
            r7 = r6
            r6 = r0
        L1a:
            byte r0 = (byte) r7
            int r2 = r1 + 1
            r4[r1] = r0
            if (r2 != r8) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L27:
            int r0 = r6 + 1
            r6 = r5[r0]
            goto L16
        L2c:
            r1 = r3
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.remote.b.b.$$c(short, short, byte):java.lang.String");
    }

    static void init$0() {
        $$a = new byte[]{52, -20, 7, -120};
        $$b = 86;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private /* synthetic */ b(byte b2) throws Throwable {
        Object[] objArr = new Object[1];
        i("ࡐ\uf131젘䆷飷ィ⬼\ue2a9䩲\ue7a0\ue564陾䴲㵥\ue877죅", 15 - View.MeasureSpec.getMode(0), objArr);
        this(((String) objArr[0]).intern(), 2);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        int i2 = 2 % 2;
        int i3 = f9056h;
        int i4 = i3 + 19;
        f9054f = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f9057a;
        int i6 = i3 + 41;
        f9054f = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final int c() {
        int i2 = 2 % 2;
        int i3 = f9054f + 73;
        int i4 = i3 % 128;
        f9056h = i4;
        int i5 = i3 % 2;
        int i6 = this.f9058e;
        int i7 = i4 + 93;
        f9054f = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    private b(String str, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f9057a = str;
        this.f9058e = 2;
    }

    private static void i(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $10 + 103;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
        com.c.a.h hVar = new com.c.a.h();
        char[] cArr2 = new char[cArr.length];
        hVar.f2753d = 0;
        char[] cArr3 = new char[2];
        while (hVar.f2753d < cArr.length) {
            cArr3[0] = cArr[hVar.f2753d];
            cArr3[1] = cArr[hVar.f2753d + 1];
            int i6 = 58224;
            for (int i7 = 0; i7 < 16; i7++) {
                int i8 = $10 + 121;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                try {
                    Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i6) ^ ((c3 << 4) + ((char) (((long) f9051b) ^ (-995256607575678378L))))), Integer.valueOf(c3 >>> 5), Integer.valueOf(f9055g)};
                    Object objC = com.c.a.e.e.c(1785266233);
                    if (objC == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objC = com.c.a.e.e.e((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 17 - ((byte) KeyEvent.getModifierMetaStateMask()), 600 - View.MeasureSpec.makeMeasureSpec(0, 0), 1794310720, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objC).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) f9052c) ^ (-995256607575678378L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f9053d)};
                    Object objC2 = com.c.a.e.e.c(1785266233);
                    if (objC2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objC2 = com.c.a.e.e.e((char) Color.red(0), TextUtils.lastIndexOf("", '0', 0) + 19, 599 - TextUtils.lastIndexOf("", '0', 0), 1794310720, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objC2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[hVar.f2753d] = cArr3[0];
            cArr2[hVar.f2753d + 1] = cArr3[1];
            Object[] objArr4 = {hVar, hVar};
            Object objC3 = com.c.a.e.e.c(-1055823967);
            if (objC3 == null) {
                byte b6 = (byte) 0;
                byte b7 = b6;
                objC3 = com.c.a.e.e.e((char) (MotionEvent.axisFromString("") + 1), 18 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 675, -1047829032, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objC3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f9054f = 0;
        f9056h = 1;
        f9052c = (char) 13724;
        f9053d = (char) 10710;
        f9051b = (char) 20090;
        f9055g = (char) 58123;
    }

    public b() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f9056h;
        int i4 = i3 + 97;
        int i5 = i4 % 128;
        f9054f = i5;
        int i6 = i4 % 2;
        if (this == obj) {
            int i7 = i5 + 111;
            f9056h = i7 % 128;
            int i8 = i7 % 2;
            return true;
        }
        if (!(obj instanceof b)) {
            int i9 = i3 + 99;
            f9054f = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        b bVar = (b) obj;
        if ((!Intrinsics.areEqual(this.f9057a, bVar.f9057a)) || this.f9058e != bVar.f9058e) {
            return false;
        }
        int i11 = f9056h + 123;
        f9054f = i11 % 128;
        int i12 = i11 % 2;
        return true;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f9056h + 75;
        f9054f = i3 % 128;
        int iHashCode = i3 % 2 != 0 ? (this.f9057a.hashCode() * 115) >> Integer.hashCode(this.f9058e) : (this.f9057a.hashCode() * 31) + Integer.hashCode(this.f9058e);
        int i4 = f9056h + 21;
        f9054f = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        String str;
        int i2 = 2 % 2;
        int i3 = f9056h + 107;
        f9054f = i3 % 128;
        if (i3 % 2 != 0) {
            str = "ScanFacesNotFoundServerError(message=" + this.f9057a + ", errorCode=" + this.f9058e + ")";
            int i4 = 81 / 0;
        } else {
            str = "ScanFacesNotFoundServerError(message=" + this.f9057a + ", errorCode=" + this.f9058e + ")";
        }
        int i5 = f9056h + 83;
        f9054f = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
