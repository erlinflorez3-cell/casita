package com.incode.welcome_sdk.ui.camera.id_validation.base;

import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.c.a.e.e;
import com.c.a.m;
import com.incode.welcome_sdk.modules.IdScan;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes5.dex */
public final class SwitchCaptureKt {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f11834a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f11835c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f11836e = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r9, byte r10, int r11) {
        /*
            int r0 = r11 * 3
            int r8 = r0 + 4
            int r0 = r9 * 3
            int r7 = r0 + 112
            int r6 = r10 * 4
            int r0 = r6 + 1
            byte[] r5 = com.incode.welcome_sdk.ui.camera.id_validation.base.SwitchCaptureKt.$$a
            byte[] r4 = new byte[r0]
            r3 = 0
            if (r5 != 0) goto L2a
            r2 = r6
            r1 = r8
            r0 = r3
        L16:
            int r8 = r8 + r2
            int r1 = r1 + 1
            r2 = r0
        L1a:
            byte r0 = (byte) r8
            r4[r2] = r0
            int r0 = r2 + 1
            if (r2 != r6) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L27:
            r2 = r5[r1]
            goto L16
        L2a:
            r2 = r3
            r1 = r8
            r8 = r7
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.id_validation.base.SwitchCaptureKt.$$c(short, byte, int):java.lang.String");
    }

    static void init$0() {
        $$a = new byte[]{110, -7, -8, 89};
        $$b = 78;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0097, code lost:
    
        if (r0 == 3) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a4, code lost:
    
        throw new java.lang.IllegalArgumentException("Only an ID Scan ValidationPhase is valid for getting capture events");
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0028, code lost:
    
        if (r1 == 3) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        r5 = com.incode.welcome_sdk.data.Event.SWITCH_TO_MANUAL_CAPTURE_BACK_ID;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.incode.welcome_sdk.ui.camera.id_validation.base.SwitchCapture switchCaptureOf(com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationPhase r9, com.incode.welcome_sdk.IdCategory r10, com.incode.welcome_sdk.modules.IdScan.IdType r11) {
        /*
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.SwitchCaptureKt.f11836e
            int r1 = r0 + 91
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.id_validation.base.SwitchCaptureKt.f11835c = r0
            int r1 = r1 % r3
            r2 = 3
            r8 = 0
            r7 = 1
            java.lang.String r0 = ""
            if (r1 == 0) goto L85
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            int[] r1 = com.incode.welcome_sdk.ui.camera.id_validation.base.SwitchCaptureKt.WhenMappings.f11839c
            int r0 = r9.ordinal()
            r1 = r1[r0]
            r0 = 11
            int r0 = r0 / r8
            if (r1 == r7) goto L9a
            if (r1 == r3) goto L9a
            if (r1 != r2) goto L9d
        L2a:
            com.incode.welcome_sdk.data.Event r5 = com.incode.welcome_sdk.data.Event.SWITCH_TO_MANUAL_CAPTURE_BACK_ID
        L2c:
            com.incode.welcome_sdk.IdCategory r0 = com.incode.welcome_sdk.IdCategory.FIRST
            if (r10 != r0) goto L82
            int r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.SwitchCaptureKt.f11835c
            int r1 = r0 + 91
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.id_validation.base.SwitchCaptureKt.f11836e = r0
            int r1 = r1 % r3
            java.lang.String r6 = "primary"
            if (r1 != 0) goto L40
            r0 = 77
            int r0 = r0 / r8
        L40:
            com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationPhase r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationPhase.SCAN_ID_FRONT
            r4 = 0
            if (r9 != r0) goto L4c
            if (r11 != 0) goto L79
            r0 = -1
        L48:
            if (r0 == r7) goto L76
            if (r0 == r3) goto L5b
        L4c:
            com.incode.welcome_sdk.ui.camera.id_validation.base.SwitchCapture r2 = new com.incode.welcome_sdk.ui.camera.id_validation.base.SwitchCapture
            r2.<init>(r5, r6, r4)
            int r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.SwitchCaptureKt.f11835c
            int r1 = r0 + 51
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.id_validation.base.SwitchCaptureKt.f11836e = r0
            int r1 = r1 % r3
            return r2
        L5b:
            int r0 = android.view.KeyEvent.getMaxKeyCode()
            int r0 = r0 >> 16
            r2 = 38083(0x94c3, float:5.3366E-41)
            int r2 = r2 - r0
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r0 = "泻\uf829䕾튱㿷謫ၫ綪"
            b(r0, r2, r1)
            r0 = r1[r8]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r4 = r0.intern()
            goto L4c
        L76:
            java.lang.String r4 = "id"
            goto L4c
        L79:
            int[] r1 = com.incode.welcome_sdk.ui.camera.id_validation.base.SwitchCaptureKt.WhenMappings.f11838b
            int r0 = r11.ordinal()
            r0 = r1[r0]
            goto L48
        L82:
            java.lang.String r6 = "secondary"
            goto L40
        L85:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            int[] r1 = com.incode.welcome_sdk.ui.camera.id_validation.base.SwitchCaptureKt.WhenMappings.f11839c
            int r0 = r9.ordinal()
            r0 = r1[r0]
            if (r0 == r7) goto L9a
            if (r0 == r3) goto L9a
            if (r0 != r2) goto L9d
            goto L2a
        L9a:
            com.incode.welcome_sdk.data.Event r5 = com.incode.welcome_sdk.data.Event.SWITCH_TO_MANUAL_CAPTURE_FRONT_ID
            goto L2c
        L9d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Only an ID Scan ValidationPhase is valid for getting capture events"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.id_validation.base.SwitchCaptureKt.switchCaptureOf(com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationPhase, com.incode.welcome_sdk.IdCategory, com.incode.welcome_sdk.modules.IdScan$IdType):com.incode.welcome_sdk.ui.camera.id_validation.base.SwitchCapture");
    }

    private static void b(String str, int i2, Object[] objArr) throws Throwable {
        Object obj;
        String str2 = str;
        char c2 = 2;
        int i3 = 2 % 2;
        if (str2 != null) {
            char[] charArray = str2.toCharArray();
            int i4 = $10 + 63;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            obj = charArray;
        } else {
            obj = str2;
        }
        char[] cArr = (char[]) obj;
        m mVar = new m();
        mVar.f2778b = i2;
        int length = cArr.length;
        long[] jArr = new long[length];
        mVar.f2779e = 0;
        int i6 = $10 + 91;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        while (mVar.f2779e < cArr.length) {
            int i8 = mVar.f2779e;
            char c3 = cArr[mVar.f2779e];
            try {
                Object[] objArr2 = new Object[3];
                objArr2[c2] = mVar;
                objArr2[1] = mVar;
                objArr2[0] = Integer.valueOf(c3);
                Object objC = e.c(-1726804722);
                if (objC == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objC = e.e((char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 18 - (ViewConfiguration.getJumpTapTimeout() >> 16), 884 - TextUtils.indexOf("", "", 0, 0), -1719070857, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i8] = ((Long) ((Method) objC).invoke(null, objArr2)).longValue() ^ (f11834a ^ (-7382027491817826291L));
                Object[] objArr3 = {mVar, mVar};
                Object objC2 = e.c(1025650959);
                if (objC2 == null) {
                    byte b4 = (byte) 1;
                    byte b5 = (byte) (b4 - 1);
                    objC2 = e.e((char) ((Process.getThreadPriority(0) + 20) >> 6), 19 - ImageFormat.getBitsPerPixel(0), 988 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1035481974, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objC2).invoke(null, objArr3);
                c2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        mVar.f2779e = 0;
        int i9 = $11 + 107;
        $10 = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 2 % 4;
        }
        while (mVar.f2779e < cArr.length) {
            cArr2[mVar.f2779e] = (char) jArr[mVar.f2779e];
            Object[] objArr4 = {mVar, mVar};
            Object objC3 = e.c(1025650959);
            if (objC3 == null) {
                byte b6 = (byte) 1;
                byte b7 = (byte) (b6 - 1);
                objC3 = e.e((char) View.getDefaultSize(0, 0), 20 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), KeyEvent.normalizeMetaState(0) + 988, 1035481974, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objC3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f11837a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f11838b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f11839c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f11840e = 0;

        static {
            int[] iArr = new int[ValidationPhase.values().length];
            try {
                iArr[ValidationPhase.SCAN_ID_FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ValidationPhase.SCAN_PASSPORT.ordinal()] = 2;
                int i2 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ValidationPhase.SCAN_ID_BACK.ordinal()] = 3;
                int i3 = f11837a + 55;
                f11840e = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 2 % 2;
                }
            } catch (NoSuchFieldError unused3) {
            }
            f11839c = iArr;
            int[] iArr2 = new int[IdScan.IdType.values().length];
            try {
                iArr2[IdScan.IdType.ID.ordinal()] = 1;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[IdScan.IdType.PASSPORT.ordinal()] = 2;
                int i6 = f11840e + 21;
                f11837a = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 2 % 2;
                }
            } catch (NoSuchFieldError unused5) {
            }
            f11838b = iArr2;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f11835c = 0;
        f11836e = 1;
        f11834a = 8669341939253163142L;
    }
}
