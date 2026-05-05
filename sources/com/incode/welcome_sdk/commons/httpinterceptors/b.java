package com.incode.welcome_sdk.commons.httpinterceptors;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.commons.utils.StringUtils;
import com.incode.welcome_sdk.modules.SelfieScan;
import java.lang.reflect.Method;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes5.dex */
@Singleton
public final class b implements Interceptor {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static char[] f5170b = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f5171d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f5172e = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r8, int r9, byte r10) {
        /*
            int r7 = r10 + 102
            int r0 = r8 * 4
            int r6 = 3 - r0
            byte[] r5 = com.incode.welcome_sdk.commons.httpinterceptors.b.$$a
            int r4 = r9 * 3
            int r0 = r4 + 1
            byte[] r3 = new byte[r0]
            r2 = 0
            if (r5 != 0) goto L26
            r0 = r4
            r1 = r2
        L13:
            int r7 = r7 + r0
        L14:
            int r6 = r6 + 1
            byte r0 = (byte) r7
            r3[r1] = r0
            if (r1 != r4) goto L21
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            return r0
        L21:
            r0 = r5[r6]
            int r1 = r1 + 1
            goto L13
        L26:
            r1 = r2
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.httpinterceptors.b.$$c(int, int, byte):java.lang.String");
    }

    static void init$0() {
        $$a = new byte[]{123, -109, MessagePack.Code.STR32, -17};
        $$b = 144;
    }

    @Inject
    public b() {
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0021 A[PHI: r4
  0x0021: PHI (r4v2 okhttp3.Request) = (r4v0 okhttp3.Request), (r4v3 okhttp3.Request) binds: [B:11:0x008a, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.httpinterceptors.b.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }

    private static boolean d(HttpUrl httpUrl) {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f5172e + 55;
        f5171d = i3 % 128;
        int i4 = i3 % 2;
        if (d() && StringUtils.isBlank(com.incode.welcome_sdk.commons.c.f4652d)) {
            int i5 = f5172e + 57;
            f5171d = i5 % 128;
            int i6 = i5 % 2;
            z2 = true;
        } else {
            int i7 = f5172e + 17;
            f5171d = i7 % 128;
            int i8 = i7 % 2;
            z2 = false;
        }
        if (IncodeWelcome.Companion.getInstance().isExternalTokenUsed() || !(!z2) || b(httpUrl)) {
            return false;
        }
        int i9 = f5171d + 107;
        f5172e = i9 % 128;
        int i10 = i9 % 2;
        return true;
    }

    private static boolean d() {
        int i2 = 2 % 2;
        IncodeWelcome.InternalConfig internalConfig = IncodeWelcome.Companion.getInstance().getInternalConfig();
        if (internalConfig != null) {
            int i3 = f5172e + 23;
            f5171d = i3 % 128;
            int i4 = i3 % 2;
            SelfieScan.Mode selfieMode = internalConfig.getSelfieMode();
            if (selfieMode != null && selfieMode.equals(SelfieScan.Mode.LOGIN)) {
                int i5 = f5171d + 75;
                f5172e = i5 % 128;
                if (i5 % 2 == 0) {
                    return true;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        return false;
    }

    private static boolean b(HttpUrl httpUrl) {
        int i2 = 2 % 2;
        int i3 = f5172e + 5;
        f5171d = i3 % 128;
        int i4 = i3 % 2;
        String path = httpUrl.url().getPath();
        Intrinsics.checkNotNullExpressionValue(path, "");
        return StringsKt.contains$default((CharSequence) path, (CharSequence) "/0/", false, i4 == 0 ? 3 : 2, (Object) null);
    }

    private static void a(int[] iArr, boolean z2, String str, Object[] objArr) throws Throwable {
        int i2;
        char[] cArr;
        String str2 = str;
        int i3 = 2 % 2;
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        com.c.a.o oVar = new com.c.a.o();
        int i4 = 0;
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr2 = f5170b;
        long j2 = 0;
        char c2 = '0';
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i9])};
                    Object objC = com.c.a.e.e.c(-1916745907);
                    if (objC == null) {
                        byte b2 = (byte) i4;
                        byte b3 = b2;
                        objC = com.c.a.e.e.e((char) ((-1) - TextUtils.lastIndexOf("", c2, i4)), (ExpandableListView.getPackedPositionForGroup(i4) > j2 ? 1 : (ExpandableListView.getPackedPositionForGroup(i4) == j2 ? 0 : -1)) + 27, 961 - (ViewConfiguration.getTouchSlop() >> 8), -1923431116, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i9] = ((Character) ((Method) objC).invoke(null, objArr2)).charValue();
                    i9++;
                    i4 = 0;
                    j2 = 0;
                    c2 = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i6];
        System.arraycopy(cArr2, i5, cArr4, 0, i6);
        if (bArr != null) {
            char[] cArr5 = new char[i6];
            oVar.f2783d = 0;
            char c3 = 0;
            while (oVar.f2783d < i6) {
                if (bArr[oVar.f2783d] == 1) {
                    int i10 = $11 + 103;
                    $10 = i10 % 128;
                    if (i10 % 2 != 0) {
                        int i11 = oVar.f2783d;
                        Object[] objArr3 = {Integer.valueOf(cArr4[oVar.f2783d]), Integer.valueOf(c3)};
                        Object objC2 = com.c.a.e.e.c(83881166);
                        if (objC2 == null) {
                            objC2 = com.c.a.e.e.e((char) (Process.getGidForName("") + 60231), 17 - View.MeasureSpec.getMode(0), ExpandableListView.getPackedPositionType(0L) + 33, 73789111, false, "j", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        Object obj = null;
                        cArr5[i11] = ((Character) ((Method) objC2).invoke(null, objArr3)).charValue();
                        obj.hashCode();
                        throw null;
                    }
                    int i12 = oVar.f2783d;
                    Object[] objArr4 = {Integer.valueOf(cArr4[oVar.f2783d]), Integer.valueOf(c3)};
                    Object objC3 = com.c.a.e.e.c(83881166);
                    if (objC3 == null) {
                        objC3 = com.c.a.e.e.e((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 60230), 17 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (-16777183) - Color.rgb(0, 0, 0), 73789111, false, "j", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i12] = ((Character) ((Method) objC3).invoke(null, objArr4)).charValue();
                } else {
                    int i13 = oVar.f2783d;
                    Object[] objArr5 = {Integer.valueOf(cArr4[oVar.f2783d]), Integer.valueOf(c3)};
                    Object objC4 = com.c.a.e.e.c(1697816169);
                    if (objC4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objC4 = com.c.a.e.e.e((char) (60521 - KeyEvent.normalizeMetaState(0)), 20 - KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 922, 1705548816, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i13] = ((Character) ((Method) objC4).invoke(null, objArr5)).charValue();
                }
                c3 = cArr5[oVar.f2783d];
                Object[] objArr6 = {oVar, oVar};
                Object objC5 = com.c.a.e.e.c(-2143286564);
                if (objC5 == null) {
                    objC5 = com.c.a.e.e.e((char) (48810 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 15 - TextUtils.indexOf((CharSequence) "", '0', 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 101, -2133194587, false, "h", new Class[]{Object.class, Object.class});
                }
                ((Method) objC5).invoke(null, objArr6);
            }
            cArr4 = cArr5;
        }
        if (i8 > 0) {
            int i14 = $11 + 27;
            $10 = i14 % 128;
            if (i14 % 2 != 0) {
                char[] cArr6 = new char[i6];
                System.arraycopy(cArr4, 1, cArr6, 1, i6);
                int i15 = i6 >> i8;
                System.arraycopy(cArr6, 0, cArr4, i15, i8);
                System.arraycopy(cArr6, i8, cArr4, 1, i15);
            } else {
                char[] cArr7 = new char[i6];
                System.arraycopy(cArr4, 0, cArr7, 0, i6);
                int i16 = i6 - i8;
                System.arraycopy(cArr7, 0, cArr4, i16, i8);
                System.arraycopy(cArr7, i8, cArr4, 0, i16);
            }
        }
        if (z2) {
            int i17 = $11 + 9;
            $10 = i17 % 128;
            if (i17 % 2 != 0) {
                cArr = new char[i6];
                i2 = 1;
                oVar.f2783d = 1;
            } else {
                i2 = 1;
                cArr = new char[i6];
                oVar.f2783d = 0;
            }
            while (oVar.f2783d < i6) {
                cArr[oVar.f2783d] = cArr4[(i6 - oVar.f2783d) - i2];
                oVar.f2783d += i2;
                i2 = 1;
            }
            cArr4 = cArr;
        }
        if (i7 > 0) {
            int i18 = 0;
            while (true) {
                oVar.f2783d = i18;
                if (oVar.f2783d >= i6) {
                    break;
                }
                cArr4[oVar.f2783d] = (char) (cArr4[oVar.f2783d] - iArr[2]);
                i18 = oVar.f2783d + 1;
            }
        }
        objArr[0] = new String(cArr4);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f5172e = 0;
        f5171d = 1;
        f5170b = new char[]{30817, 30763, 30761, 30769, 30773, 30773, 30737, 30730, 30774, 30783, 30775, 30764, 30771, 30772, 30761, 30771, 30740, 30740, 30771, 30773, 30774};
    }
}
