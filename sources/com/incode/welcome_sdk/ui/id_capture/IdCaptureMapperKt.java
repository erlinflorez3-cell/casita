package com.incode.welcome_sdk.ui.id_capture;

import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.c.a.e;
import com.drew.metadata.iptc.IptcDirectory;
import com.incode.camera.analysis.document.CaptureInfo;
import com.incode.camera.analysis.document.DocumentAnalysisEvent;
import com.incode.camera.commons.utils.Side;
import com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes5.dex */
public final class IdCaptureMapperKt {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f14777a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int[] f14778c = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f14779e = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0012). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r9, short r10, int r11) {
        /*
            int r8 = r10 * 2
            int r1 = r8 + 1
            int r7 = r11 + 4
            int r0 = r9 + 98
            byte[] r6 = com.incode.welcome_sdk.ui.id_capture.IdCaptureMapperKt.$$a
            byte[] r5 = new byte[r1]
            r4 = 0
            if (r6 != 0) goto L2a
            r3 = r8
            r2 = r7
            r1 = r4
        L12:
            int r0 = -r3
            int r7 = r7 + r0
            r3 = r1
            r0 = r7
            r7 = r2
        L17:
            int r2 = r7 + 1
            byte r1 = (byte) r0
            r5[r3] = r1
            int r1 = r3 + 1
            if (r3 != r8) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L26:
            r3 = r6[r2]
            r7 = r0
            goto L12
        L2a:
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.IdCaptureMapperKt.$$c(byte, short, int):java.lang.String");
    }

    static void init$0() {
        $$a = new byte[]{70, MessagePack.Code.FLOAT32, 7, 50};
        $$b = 2;
    }

    public static final DocumentType getDocumentType(CaptureInfo captureInfo) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f14777a + 37;
        f14779e = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(captureInfo, "");
        DocumentType documentTypeC = c(captureInfo.getIdType(), captureInfo.getSide());
        int i5 = f14779e + 23;
        f14777a = i5 % 128;
        if (i5 % 2 == 0) {
            return documentTypeC;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        return com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType.NONE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        r0 = com.incode.welcome_sdk.ui.id_capture.IdCaptureMapperKt.WhenMappings.f14782d[r8.ordinal()];
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r7, "id") != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        r2 = com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType.BACK_ID;
        r1 = com.incode.welcome_sdk.ui.id_capture.IdCaptureMapperKt.f14779e + 13;
        com.incode.welcome_sdk.ui.id_capture.IdCaptureMapperKt.f14777a = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        if ((r1 % 2) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        r0 = 36 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        return com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType.FRONT_ID;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
    
        r0 = new java.lang.Object[1];
        b(new int[]{-1536936004, 1577781334, -2059760589, 1311470829}, 8 - android.view.KeyEvent.getDeadChar(0, 0), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r7, ((java.lang.String) r0[0]).intern()) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007c, code lost:
    
        r2 = com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType.PASSPORT;
        r1 = com.incode.welcome_sdk.ui.id_capture.IdCaptureMapperKt.f14777a + 73;
        com.incode.welcome_sdk.ui.id_capture.IdCaptureMapperKt.f14779e = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0087, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
    
        return com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType.NONE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r7, "id")) != true) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001c, code lost:
    
        if (r8 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        r1 = com.incode.welcome_sdk.ui.id_capture.IdCaptureMapperKt.f14779e + 45;
        com.incode.welcome_sdk.ui.id_capture.IdCaptureMapperKt.f14777a = r1 % 128;
        r1 = r1 % 2;
        r0 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r0 == 1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        if (r0 == 2) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType c(java.lang.String r7, com.incode.camera.commons.utils.Side r8) throws java.lang.Throwable {
        /*
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.ui.id_capture.IdCaptureMapperKt.f14779e
            int r1 = r0 + 75
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_capture.IdCaptureMapperKt.f14777a = r0
            int r1 = r1 % r3
            java.lang.String r0 = "id"
            r6 = 1
            r5 = 0
            if (r1 == 0) goto L38
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r0)
            r0 = 77
            int r0 = r0 / r5
            r1 = r1 ^ r6
            if (r1 == r6) goto L53
        L1c:
            if (r8 != 0) goto L2f
            int r0 = com.incode.welcome_sdk.ui.id_capture.IdCaptureMapperKt.f14779e
            int r1 = r0 + 45
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_capture.IdCaptureMapperKt.f14777a = r0
            int r1 = r1 % r3
            r0 = -1
        L28:
            if (r0 == r6) goto L50
            if (r0 == r3) goto L3f
            com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType.NONE
            return r0
        L2f:
            int[] r1 = com.incode.welcome_sdk.ui.id_capture.IdCaptureMapperKt.WhenMappings.f14782d
            int r0 = r8.ordinal()
            r0 = r1[r0]
            goto L28
        L38:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r0)
            if (r0 == 0) goto L53
            goto L1c
        L3f:
            com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType r2 = com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType.BACK_ID
            int r0 = com.incode.welcome_sdk.ui.id_capture.IdCaptureMapperKt.f14779e
            int r1 = r0 + 13
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_capture.IdCaptureMapperKt.f14777a = r0
            int r1 = r1 % r3
            if (r1 == 0) goto L4f
            r0 = 36
            int r0 = r0 / r5
        L4f:
            return r2
        L50:
            com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType.FRONT_ID
            return r0
        L53:
            r4 = -2059760589(0xffffffff853a8c33, float:-8.7714285E-36)
            r2 = 1311470829(0x4e2b74ed, float:7.191417E8)
            r1 = -1536936004(0xffffffffa46437bc, float:-4.9486828E-17)
            r0 = 1577781334(0x5e0b0856, float:2.504588E18)
            int[] r2 = new int[]{r1, r0, r4, r2}
            int r0 = android.view.KeyEvent.getDeadChar(r5, r5)
            int r1 = 8 - r0
            java.lang.Object[] r0 = new java.lang.Object[r6]
            b(r2, r1, r0)
            r0 = r0[r5]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r0)
            if (r0 == 0) goto L88
            com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType r2 = com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType.PASSPORT
            int r0 = com.incode.welcome_sdk.ui.id_capture.IdCaptureMapperKt.f14777a
            int r1 = r0 + 73
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_capture.IdCaptureMapperKt.f14779e = r0
            int r1 = r1 % r3
            return r2
        L88:
            com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType.NONE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.IdCaptureMapperKt.c(java.lang.String, com.incode.camera.commons.utils.Side):com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType");
    }

    public static final DocumentType getDocumentType(DocumentAnalysisEvent.IdTypeExtracted idTypeExtracted) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f14777a + 115;
        f14779e = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(idTypeExtracted, "");
            return c(idTypeExtracted.getIdType(), idTypeExtracted.getSide());
        }
        Intrinsics.checkNotNullParameter(idTypeExtracted, "");
        c(idTypeExtracted.getIdType(), idTypeExtracted.getSide());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void b(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i3;
        int i4 = 2;
        int i5 = 2 % 2;
        e eVar = new e();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = f14778c;
        int i6 = 1605946101;
        long j2 = 0;
        int i7 = 16;
        if (iArr3 != null) {
            int i8 = $11 + 91;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                length = iArr3.length;
                iArr2 = new int[length];
                i3 = 1;
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
                i3 = 0;
            }
            while (i3 < length) {
                int i9 = $10 + 73;
                $11 = i9 % 128;
                int i10 = i9 % i4;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i3])};
                    Object objC = com.c.a.e.e.c(i6);
                    if (objC == null) {
                        char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> i7);
                        int jumpTapTimeout2 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 19;
                        int i11 = 555 - (SystemClock.elapsedRealtime() > j2 ? 1 : (SystemClock.elapsedRealtime() == j2 ? 0 : -1));
                        byte b2 = (byte) ($$b - 1);
                        byte b3 = (byte) (b2 - 1);
                        objC = com.c.a.e.e.e(jumpTapTimeout, jumpTapTimeout2, i11, 1596115084, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                    }
                    iArr2[i3] = ((Integer) ((Method) objC).invoke(null, objArr2)).intValue();
                    i3++;
                    i4 = 2;
                    i6 = 1605946101;
                    j2 = 0;
                    i7 = 16;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = f14778c;
        float f2 = 0.0f;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i12 = 0;
            while (i12 < length3) {
                Object[] objArr3 = {Integer.valueOf(iArr5[i12])};
                Object objC2 = com.c.a.e.e.c(1605946101);
                if (objC2 == null) {
                    byte b4 = (byte) ($$b - 1);
                    byte b5 = (byte) (b4 - 1);
                    objC2 = com.c.a.e.e.e((char) (AudioTrack.getMinVolume() > f2 ? 1 : (AudioTrack.getMinVolume() == f2 ? 0 : -1)), 19 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), TextUtils.indexOf("", "") + IptcDirectory.TAG_ACTION_ADVISED, 1596115084, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE});
                }
                iArr6[i12] = ((Integer) ((Method) objC2).invoke(null, objArr3)).intValue();
                i12++;
                f2 = 0.0f;
            }
            iArr5 = iArr6;
        }
        char c2 = 0;
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        eVar.f2735a = 0;
        while (eVar.f2735a < iArr.length) {
            cArr[c2] = (char) (iArr[eVar.f2735a] >> 16);
            cArr[1] = (char) iArr[eVar.f2735a];
            cArr[2] = (char) (iArr[eVar.f2735a + 1] >> 16);
            cArr[3] = (char) iArr[eVar.f2735a + 1];
            eVar.f2736c = (cArr[0] << 16) + cArr[1];
            eVar.f2737d = (cArr[2] << 16) + cArr[3];
            e.b(iArr4);
            int i13 = 0;
            for (int i14 = 16; i13 < i14; i14 = 16) {
                int i15 = $11 + 61;
                $10 = i15 % 128;
                if (i15 % 2 != 0) {
                    eVar.f2736c ^= iArr4[i13];
                    Object[] objArr4 = {eVar, Integer.valueOf(e.c(eVar.f2736c)), eVar, eVar};
                    Object objC3 = com.c.a.e.e.c(-190252621);
                    if (objC3 == null) {
                        char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        int keyRepeatTimeout = 19 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        int i16 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 167;
                        byte b6 = (byte) ($$b - 2);
                        byte b7 = b6;
                        objC3 = com.c.a.e.e.e(maximumFlingVelocity, keyRepeatTimeout, i16, -197985334, false, $$c(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objC3).invoke(null, objArr4)).intValue();
                    eVar.f2736c = eVar.f2737d;
                    eVar.f2737d = iIntValue;
                    i13 += 55;
                } else {
                    eVar.f2736c ^= iArr4[i13];
                    Object[] objArr5 = {eVar, Integer.valueOf(e.c(eVar.f2736c)), eVar, eVar};
                    Object objC4 = com.c.a.e.e.c(-190252621);
                    if (objC4 == null) {
                        char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int scrollDefaultDelay = 19 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int i17 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 166;
                        byte b8 = (byte) ($$b - 2);
                        byte b9 = b8;
                        objC4 = com.c.a.e.e.e(maximumDrawingCacheSize, scrollDefaultDelay, i17, -197985334, false, $$c(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objC4).invoke(null, objArr5)).intValue();
                    eVar.f2736c = eVar.f2737d;
                    eVar.f2737d = iIntValue2;
                    i13++;
                }
            }
            int i18 = eVar.f2736c;
            eVar.f2736c = eVar.f2737d;
            eVar.f2737d = i18;
            eVar.f2737d ^= iArr4[16];
            eVar.f2736c ^= iArr4[17];
            int i19 = eVar.f2736c;
            int i20 = eVar.f2737d;
            cArr[0] = (char) (eVar.f2736c >>> 16);
            cArr[1] = (char) eVar.f2736c;
            cArr[2] = (char) (eVar.f2737d >>> 16);
            cArr[3] = (char) eVar.f2737d;
            e.b(iArr4);
            cArr2[eVar.f2735a * 2] = cArr[0];
            cArr2[(eVar.f2735a * 2) + 1] = cArr[1];
            cArr2[(eVar.f2735a * 2) + 2] = cArr[2];
            cArr2[(eVar.f2735a * 2) + 3] = cArr[3];
            Object[] objArr6 = {eVar, eVar};
            Object objC5 = com.c.a.e.e.c(-1176571471);
            if (objC5 == null) {
                objC5 = com.c.a.e.e.e((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 42780), ExpandableListView.getPackedPositionType(0L) + 16, 134 - (ViewConfiguration.getPressedStateDuration() >> 16), -1186663480, false, "a", new Class[]{Object.class, Object.class});
            }
            ((Method) objC5).invoke(null, objArr6);
            int i21 = $10 + 85;
            $11 = i21 % 128;
            int i22 = i21 % 2;
            c2 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f14780a = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f14781c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f14782d;

        static {
            int[] iArr = new int[Side.values().length];
            try {
                iArr[Side.FRONT.ordinal()] = 1;
                int i2 = f14780a + 27;
                f14781c = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Side.BACK.ordinal()] = 2;
                int i5 = f14780a + 73;
                f14781c = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            f14782d = iArr;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f14777a = 0;
        f14779e = 1;
        f14778c = new int[]{-1272613331, -1838619522, -164743028, 604354128, 160553819, -916514331, -1037712292, -548569268, -1497555669, 2054001996, -2099075837, -328846914, -275217909, -1961686613, 1941753768, 1469285745, -283075520, -910807104};
    }
}
