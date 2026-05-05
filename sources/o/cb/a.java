package o.cb;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.ExifDirectoryBase;
import com.google.common.base.Ascii;
import fr.antelop.sdk.exception.WalletValidationErrorCode;
import fr.antelop.sdk.exception.WalletValidationException;
import java.lang.reflect.Method;
import kotlin.io.encoding.Base64;
import o.a.j;
import o.a.l;
import o.bl.b;
import o.bl.e;
import o.d.d;
import o.ea.f;
import o.en.b;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class a {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int[] f22014b = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f22015d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f22016f = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f22017i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f22018j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f22019a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    c f22020c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f22021e;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:5:0x0017). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r8, byte r9, byte r10) {
        /*
            int r0 = r8 * 2
            int r0 = 121 - r0
            byte[] r8 = o.cb.a.$$a
            int r1 = r10 * 2
            int r7 = r1 + 4
            int r2 = r9 * 4
            int r1 = 1 - r2
            byte[] r6 = new byte[r1]
            r5 = 0
            int r4 = 0 - r2
            if (r8 != 0) goto L2f
            r1 = r7
            r3 = r5
        L17:
            int r0 = -r0
            int r0 = r0 + r7
            int r7 = r1 + 1
            r2 = r3
        L1c:
            byte r1 = (byte) r0
            r6[r2] = r1
            int r3 = r2 + 1
            if (r2 != r4) goto L29
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L29:
            r2 = r8[r7]
            r1 = r7
            r7 = r0
            r0 = r2
            goto L17
        L2f:
            r2 = r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cb.a.$$c(byte, byte, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f22018j = 0;
        f22016f = 1;
        f22015d = 0;
        f22017i = 1;
        a();
        ViewConfiguration.getWindowTouchSlop();
        int i2 = f22016f + 113;
        f22018j = i2 % 128;
        int i3 = i2 % 2;
    }

    public a(Context context, c cVar, b bVar) {
        this.f22021e = context;
        this.f22020c = cVar;
        this.f22019a = bVar;
    }

    static void a() {
        f22014b = new int[]{2000894534, 1547366746, -1928190700, 797127951, 1951879032, 1596816514, 665915622, 1725229847, 1483492170, -503550275, 1359492850, 1468719047, -239817289, 899338284, -1151850865, 1374547780, 1857458454, 2023894538};
    }

    private static void g(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        l lVar = new l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = f22014b;
        int i4 = 989264422;
        char c2 = '0';
        int i5 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i6])};
                    Object objA = d.a(i4);
                    if (objA == null) {
                        byte b2 = (byte) i5;
                        byte b3 = b2;
                        objA = d.a(675 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (TextUtils.indexOf("", c2, i5, i5) + 1), KeyEvent.getDeadChar(i5, i5) + 12, -328001469, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    iArr3[i6] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    i6++;
                    i4 = 989264422;
                    c2 = '0';
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = f22014b;
        if (iArr5 != null) {
            int i7 = $11;
            int i8 = i7 + 29;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i10 = i7 + 11;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 2 % 3;
            }
            for (int i12 = 0; i12 < length3; i12++) {
                Object[] objArr3 = {Integer.valueOf(iArr5[i12])};
                Object objA2 = d.a(989264422);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = d.a(TextUtils.lastIndexOf("", '0', 0) + 676, (char) TextUtils.indexOf("", ""), View.MeasureSpec.makeMeasureSpec(0, 0) + 12, -328001469, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                }
                iArr6[i12] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        lVar.f19941d = 0;
        while (lVar.f19941d < iArr.length) {
            int i13 = $10 + 43;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            cArr[0] = (char) (iArr[lVar.f19941d] >> 16);
            cArr[1] = (char) iArr[lVar.f19941d];
            cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
            cArr[3] = (char) iArr[lVar.f19941d + 1];
            lVar.f19942e = (cArr[0] << 16) + cArr[1];
            lVar.f19940a = (cArr[2] << 16) + cArr[3];
            l.a(iArr4);
            int i15 = 0;
            for (int i16 = 16; i15 < i16; i16 = 16) {
                lVar.f19942e ^= iArr4[i15];
                Object[] objArr4 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                Object objA3 = d.a(2098218801);
                if (objA3 == null) {
                    byte b6 = (byte) 1;
                    byte b7 = (byte) (b6 - 1);
                    objA3 = d.a(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 302, (char) (52697 - TextUtils.indexOf("", "", 0, 0)), (Process.myTid() >> 22) + 11, -1416256172, false, $$c(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = iIntValue;
                i15++;
            }
            int i17 = lVar.f19942e;
            lVar.f19942e = lVar.f19940a;
            lVar.f19940a = i17;
            lVar.f19940a ^= iArr4[16];
            lVar.f19942e ^= iArr4[17];
            int i18 = lVar.f19942e;
            int i19 = lVar.f19940a;
            cArr[0] = (char) (lVar.f19942e >>> 16);
            cArr[1] = (char) lVar.f19942e;
            cArr[2] = (char) (lVar.f19940a >>> 16);
            cArr[3] = (char) lVar.f19940a;
            l.a(iArr4);
            cArr2[lVar.f19941d * 2] = cArr[0];
            cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
            cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
            cArr2[(lVar.f19941d * 2) + 3] = cArr[3];
            Object[] objArr5 = {lVar, lVar};
            Object objA4 = d.a(986820978);
            if (objA4 == null) {
                int capsMode = TextUtils.getCapsMode("", 0, 0) + 229;
                char cMyTid = (char) ((Process.myTid() >> 22) + 51004);
                int i20 = 10 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                byte b8 = (byte) ((-1) - (((-1) - $$b) | ((-1) - 7)));
                byte b9 = (byte) (b8 - 2);
                objA4 = d.a(capsMode, cMyTid, i20, -330018025, false, $$c(b8, b9, b9), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
        }
        String str = new String(cArr2, 0, i2);
        int i21 = $10 + 35;
        $11 = i21 % 128;
        int i22 = i21 % 2;
        objArr[0] = str;
    }

    static void init$0() {
        $$a = new byte[]{49, 53, Ascii.ETB, 7};
        $$b = 202;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(o.i.d r11) throws fr.antelop.sdk.exception.WalletValidationException {
        /*
            Method dump skipped, instruction units count: 440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cb.a.a(o.i.d):void");
    }

    public final void b(o.i.d dVar) throws WalletValidationException {
        String strIntern;
        Object obj;
        int i2 = 2 % 2;
        if (f.a()) {
            int i3 = f22015d + 63;
            f22017i = i3 % 128;
            if (i3 % 2 == 0) {
                Object[] objArr = new Object[1];
                g(new int[]{1598241264, 834005358, -1994686266, -1632607968, -43487123, 1974845283, 1144732266, -940791238, 2078680419, -1251456898, 528621020, -1784974125}, 106 >> TextUtils.getOffsetAfter("", 0), objArr);
                strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                g(new int[]{-2046535960, -2037243142, -1284687218, -1151713138, 1360276819, 1264475737, -1389952284, 1790779674}, 20 << TextUtils.lastIndexOf("", '?'), objArr2);
                obj = objArr2[0];
            } else {
                Object[] objArr3 = new Object[1];
                g(new int[]{1598241264, 834005358, -1994686266, -1632607968, -43487123, 1974845283, 1144732266, -940791238, 2078680419, -1251456898, 528621020, -1784974125}, TextUtils.getOffsetAfter("", 0) + 24, objArr3);
                strIntern = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                g(new int[]{-2046535960, -2037243142, -1284687218, -1151713138, 1360276819, 1264475737, -1389952284, 1790779674}, 15 - TextUtils.lastIndexOf("", '0'), objArr4);
                obj = objArr4[0];
            }
            f.c(strIntern, ((String) obj).intern());
        }
        if (this.f22019a.s()) {
            new o.bl.b(this.f22021e, new b.d() { // from class: o.cb.a.5
                private static final byte[] $$a = null;
                private static final int $$b = 0;
                private static int $10 = 0;
                private static int $11 = 0;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private static int f22064b = 0;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private static byte[] f22065c = null;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static int f22066d = 0;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private static int f22067e = 0;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private static short[] f22068f = null;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private static int f22069i = 0;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private static int f22070j = 0;

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:5:0x0014). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                private static java.lang.String $$c(byte r8, byte r9, short r10) {
                    /*
                        byte[] r7 = o.cb.a.AnonymousClass5.$$a
                        int r6 = 104 - r10
                        int r5 = r9 * 3
                        int r1 = r5 + 1
                        int r0 = r8 * 4
                        int r4 = r0 + 4
                        byte[] r3 = new byte[r1]
                        r2 = 0
                        if (r7 != 0) goto L28
                        r6 = r4
                        r0 = r5
                        r1 = r2
                    L14:
                        int r0 = -r0
                        int r4 = r4 + 1
                        int r6 = r6 + r0
                    L18:
                        byte r0 = (byte) r6
                        r3[r1] = r0
                        if (r1 != r5) goto L23
                        java.lang.String r0 = new java.lang.String
                        r0.<init>(r3, r2)
                        return r0
                    L23:
                        int r1 = r1 + 1
                        r0 = r7[r4]
                        goto L14
                    L28:
                        r1 = r2
                        goto L18
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.cb.a.AnonymousClass5.$$c(byte, byte, short):java.lang.String");
                }

                static {
                    init$0();
                    $10 = 0;
                    $11 = 1;
                    f22070j = 0;
                    f22069i = 1;
                    f22066d = -1406305304;
                    f22067e = 1150422434;
                    f22064b = -44192495;
                    f22065c = new byte[]{-128, 115, -117, 126, -128, -103, 101, 124, -98, 112, 121, -106, 111, -118, -122, 117, 120, -117, -124, -116, 114, 126, -94, -115, -125, -113, -115, 99, -81, 97, 115, -114, 117, 114, -95, 83, 124, -98, 112, 121, -106, 106, 114, MessagePack.Code.FALSE, 107, -105, 56, -123, -113, 114, 123, -115, -122, 115, MessagePack.Code.UINT32, 126, -128, 32, -118, -122, 117, 120, -117, -124, -116, 114, 126, -94, 85, -123, 115, 112, -120, -118, -122, 117, 120, -117, -124, -116, 114, 126, -126, MessagePack.Code.UINT32, 52, 116, 114, 112, 118, MessagePack.Code.STR16, 107, -105, 54, 126, 112, -124, -114, -123, -106, 82, 115, -114, 117, 114, -95, 83, 124, -98, 112, 121, -106, 106, 114, MessagePack.Code.FALSE, 107, -105, 56, -123, -113, 114, 123, -115, -122, 115, MessagePack.Code.UINT32, 126, -128, 32, -118, -122, 117, 120, -117, -124, -116, 114, 126, -94, 85, -123, 115, 112, -120, -114, 112, -115, -128, MessagePack.Code.EXT16, 35, -128, 112, 121, -120, MessagePack.Code.FALSE, 107, -105, 54, 126, 112, -124, -114, -123, -106, 82, 115, -114, 117, 114, -95, 83, 124, -98, 112, 121, -106, 106, 114, MessagePack.Code.FALSE, 107, -105, 56, -123, -113, 114, 123, -115, -122, 115, MessagePack.Code.UINT32, 126, -128, 32, -118, -122, 117, 120, -117, -124, -116, 114, 126, -94, 85, -123, 115, 112, -120, -115, -115, -115, -115};
                }

                private static void g(short s2, int i4, int i5, int i6, byte b2, Object[] objArr5) throws Throwable {
                    boolean z2;
                    int i7;
                    int i8 = 2 % 2;
                    j jVar = new j();
                    StringBuilder sb = new StringBuilder();
                    try {
                        Object[] objArr6 = {Integer.valueOf(i6), Integer.valueOf(f22067e)};
                        Object objA = d.a(-727631768);
                        if (objA == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objA = d.a((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 238, (char) (44531 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 11, 35969549, false, $$c(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr6)).intValue();
                        if (iIntValue == -1) {
                            int i9 = $11 + 125;
                            $10 = i9 % 128;
                            int i10 = i9 % 2;
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            byte[] bArr = f22065c;
                            if (bArr != null) {
                                int length = bArr.length;
                                byte[] bArr2 = new byte[length];
                                for (int i11 = 0; i11 < length; i11++) {
                                    Object[] objArr7 = {Integer.valueOf(bArr[i11])};
                                    Object objA2 = d.a(-1239398195);
                                    if (objA2 == null) {
                                        byte b5 = (byte) 0;
                                        byte b6 = b5;
                                        objA2 = d.a(TextUtils.lastIndexOf("", '0', 0) + 629, (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 28649), (ViewConfiguration.getEdgeSlop() >> 16) + 11, 1621469864, false, $$c(b5, b6, (byte) (b6 + 1)), new Class[]{Integer.TYPE});
                                    }
                                    bArr2[i11] = ((Byte) ((Method) objA2).invoke(null, objArr7)).byteValue();
                                }
                                bArr = bArr2;
                            }
                            if (bArr != null) {
                                int i12 = $10 + 81;
                                $11 = i12 % 128;
                                int i13 = i12 % 2;
                                byte[] bArr3 = f22065c;
                                Object[] objArr8 = {Integer.valueOf(i4), Integer.valueOf(f22066d)};
                                Object objA3 = d.a(-727631768);
                                if (objA3 == null) {
                                    byte b7 = (byte) 0;
                                    byte b8 = b7;
                                    objA3 = d.a(238 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (44532 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), View.resolveSize(0, 0) + 11, 35969549, false, $$c(b7, b8, b8), new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objA3).invoke(null, objArr8)).intValue()]) ^ (-7649639543924978291L))) + ((int) (((long) f22067e) ^ (-7649639543924978291L))));
                            } else {
                                iIntValue = (short) (((short) (((long) f22068f[i4 + ((int) (((long) f22066d) ^ (-7649639543924978291L)))]) ^ (-7649639543924978291L))) + ((int) (((long) f22067e) ^ (-7649639543924978291L))));
                            }
                        }
                        if (iIntValue > 0) {
                            int i14 = ((i4 + iIntValue) - 2) + ((int) (((long) f22066d) ^ (-7649639543924978291L)));
                            if (z2) {
                                int i15 = $11 + 81;
                                $10 = i15 % 128;
                                int i16 = i15 % 2;
                                i7 = 1;
                            } else {
                                i7 = 0;
                            }
                            jVar.f19936d = i14 + i7;
                            Object[] objArr9 = {jVar, Integer.valueOf(i5), Integer.valueOf(f22064b), sb};
                            Object objA4 = d.a(1819197256);
                            if (objA4 == null) {
                                objA4 = d.a((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1, (char) ((-16771858) - Color.rgb(0, 0, 0)), (ViewConfiguration.getLongPressTimeout() >> 16) + 11, -1158980307, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                            }
                            ((StringBuilder) ((Method) objA4).invoke(null, objArr9)).append(jVar.f19937e);
                            jVar.f19935c = jVar.f19937e;
                            byte[] bArr4 = f22065c;
                            if (bArr4 != null) {
                                int length2 = bArr4.length;
                                byte[] bArr5 = new byte[length2];
                                for (int i17 = 0; i17 < length2; i17++) {
                                    bArr5[i17] = (byte) (((long) bArr4[i17]) ^ (-7649639543924978291L));
                                }
                                bArr4 = bArr5;
                            }
                            boolean z3 = bArr4 != null;
                            jVar.f19934b = 1;
                            while (jVar.f19934b < iIntValue) {
                                if (z3) {
                                    byte[] bArr6 = f22065c;
                                    jVar.f19936d = jVar.f19936d - 1;
                                    jVar.f19937e = (char) (jVar.f19935c + (((byte) (((byte) (((long) bArr6[r3]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                                    int i18 = $11 + 5;
                                    $10 = i18 % 128;
                                    int i19 = i18 % 2;
                                } else {
                                    short[] sArr = f22068f;
                                    jVar.f19936d = jVar.f19936d - 1;
                                    jVar.f19937e = (char) (jVar.f19935c + (((short) (((short) (((long) sArr[r3]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                                }
                                sb.append(jVar.f19937e);
                                jVar.f19935c = jVar.f19937e;
                                jVar.f19934b++;
                            }
                        }
                        objArr5[0] = sb.toString();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }

                static void init$0() {
                    $$a = new byte[]{121, Base64.padSymbol, 92, -93};
                    $$b = 247;
                }

                @Override // o.bl.b.d
                public final void d() throws Throwable {
                    int i4 = 2 % 2;
                    if (a.this.f22020c != null) {
                        int i5 = f22070j + 7;
                        f22069i = i5 % 128;
                        int i6 = i5 % 2;
                        if (f.a()) {
                            int i7 = f22069i + 31;
                            f22070j = i7 % 128;
                            int i8 = i7 % 2;
                            Object[] objArr5 = new Object[1];
                            g((short) View.MeasureSpec.getMode(0), 390105499 - (ViewConfiguration.getEdgeSlop() >> 16), 1177575335 - (ViewConfiguration.getFadingEdgeLength() >> 16), View.MeasureSpec.makeMeasureSpec(0, 0) - 23, (byte) (ViewConfiguration.getPressedStateDuration() >> 16), objArr5);
                            String strIntern2 = ((String) objArr5[0]).intern();
                            Object[] objArr6 = new Object[1];
                            g((short) Color.alpha(0), 390105522 + (ViewConfiguration.getEdgeSlop() >> 16), 1177575368 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), ((Process.getThreadPriority(0) + 20) >> 6) + 4, (byte) Color.red(0), objArr6);
                            f.c(strIntern2, ((String) objArr6[0]).intern());
                        }
                        a.this.f22020c.o();
                    }
                }

                @Override // o.bl.b.d
                public final void d(o.bg.c cVar) throws Throwable {
                    int i4 = 2 % 2;
                    int i5 = f22069i + 87;
                    f22070j = i5 % 128;
                    int i6 = i5 % 2;
                    if (cVar.c() == o.bg.a.ai) {
                        if (a.this.f22020c != null) {
                            if (f.a()) {
                                int i7 = f22070j + 45;
                                f22069i = i7 % 128;
                                int i8 = i7 % 2;
                                Object[] objArr5 = new Object[1];
                                g((short) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 390105498 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 1177575335 - View.MeasureSpec.makeMeasureSpec(0, 0), TextUtils.getCapsMode("", 0, 0) - 23, (byte) TextUtils.indexOf("", "", 0, 0), objArr5);
                                String strIntern2 = ((String) objArr5[0]).intern();
                                Object[] objArr6 = new Object[1];
                                g((short) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 390105572 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0, 0) + 1177575368, 24 - KeyEvent.getDeadChar(0, 0), (byte) Color.argb(0, 0, 0, 0), objArr6);
                                f.c(strIntern2, ((String) objArr6[0]).intern());
                            }
                            a.this.f22020c.m();
                            return;
                        }
                        return;
                    }
                    if (a.this.f22020c != null) {
                        int i9 = f22069i + 45;
                        f22070j = i9 % 128;
                        int i10 = i9 % 2;
                        if (f.a()) {
                            int i11 = f22070j + 43;
                            f22069i = i11 % 128;
                            int i12 = i11 % 2;
                            Object[] objArr7 = new Object[1];
                            g((short) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 390105499 - TextUtils.indexOf("", "", 0, 0), 1160798119 - Color.rgb(0, 0, 0), (-23) - Gravity.getAbsoluteGravity(0, 0), (byte) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr7);
                            String strIntern3 = ((String) objArr7[0]).intern();
                            Object[] objArr8 = new Object[1];
                            g((short) (ViewConfiguration.getKeyRepeatTimeout() >> 16), Color.green(0) + 390105642, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1177575367, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 18, (byte) ((-1) - MotionEvent.axisFromString("")), objArr8);
                            f.c(strIntern3, ((String) objArr8[0]).intern());
                            int i13 = f22070j + 87;
                            f22069i = i13 % 128;
                            int i14 = i13 % 2;
                        }
                        a.this.f22020c.b(cVar);
                    }
                }
            }, this.f22019a).a(dVar, null, new e() { // from class: o.cb.a.1

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private static int f22022h = 1;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private static int f22023j = 0;

                @Override // o.bl.e
                public final o.bg.c a(o.bg.c cVar) {
                    int i4 = 2 % 2;
                    int i5 = f22022h;
                    int i6 = (i5 & 79) + (i5 | 79);
                    int i7 = i6 % 128;
                    f22023j = i7;
                    if (i6 % 2 != 0) {
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    int i8 = (((-1) - (((-1) - i7) & ((-1) - 15))) << 1) - (i7 ^ 15);
                    f22022h = i8 % 128;
                    int i9 = i8 % 2;
                    return cVar;
                }

                @Override // o.bl.e
                public final o.ef.a e() throws o.ef.b {
                    int i4 = 2 % 2;
                    int i5 = f22023j + 105;
                    f22022h = i5 % 128;
                    if (i5 % 2 != 0) {
                        return null;
                    }
                    throw null;
                }
            });
            int i4 = f22015d + 1;
            f22017i = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            return;
        }
        WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.WrongState;
        Object[] objArr5 = new Object[1];
        g(new int[]{606423526, -719006533, 817402656, 1940274703}, Color.rgb(0, 0, 0) + 16777222, objArr5);
        String strIntern2 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        g(new int[]{606423526, -719006533, -928063600, 956950748, -2124147182, 203527973, -482725619, -2044041542, 1174756562, -178486110, 494124448, -1329372758, 1104188506, 1029887213, 1056382186, 1772124454, -854545336, -1619488037, -1291966503, -585286196, 322403728, 1939674173}, 41 - MotionEvent.axisFromString(""), objArr6);
        throw new WalletValidationException(walletValidationErrorCode, strIntern2, ((String) objArr6[0]).intern());
    }

    public final void c() {
        String strIntern;
        Object obj;
        int i2 = 2 % 2;
        if (f.a()) {
            int i3 = f22015d + 63;
            f22017i = i3 % 128;
            if (i3 % 2 == 0) {
                Object[] objArr = new Object[1];
                g(new int[]{1598241264, 834005358, -1994686266, -1632607968, -43487123, 1974845283, 1144732266, -940791238, 2078680419, -1251456898, 528621020, -1784974125}, TextUtils.indexOf((CharSequence) "", 'I', 1) + 116, objArr);
                strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                g(new int[]{-1668382384, 1249883059, 1104188506, 1029887213, 786935647, 1029695977}, 29 >> Color.blue(1), objArr2);
                obj = objArr2[0];
            } else {
                Object[] objArr3 = new Object[1];
                g(new int[]{1598241264, 834005358, -1994686266, -1632607968, -43487123, 1974845283, 1144732266, -940791238, 2078680419, -1251456898, 528621020, -1784974125}, 23 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr3);
                strIntern = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                g(new int[]{-1668382384, 1249883059, 1104188506, 1029887213, 786935647, 1029695977}, Color.blue(0) + 10, objArr4);
                obj = objArr4[0];
            }
            f.c(strIntern, ((String) obj).intern());
        }
        Object obj2 = null;
        this.f22020c = null;
        int i4 = f22015d + 73;
        f22017i = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    public final void d(o.i.d dVar, o.h.d dVar2) throws WalletValidationException {
        String strIntern;
        Object obj;
        int i2 = 2 % 2;
        int i3 = f22015d + 9;
        f22017i = i3 % 128;
        int i4 = i3 % 2;
        if (f.a()) {
            int i5 = f22015d + 95;
            f22017i = i5 % 128;
            if (i5 % 2 == 0) {
                Object[] objArr = new Object[1];
                g(new int[]{1598241264, 834005358, -1994686266, -1632607968, -43487123, 1974845283, 1144732266, -940791238, 2078680419, -1251456898, 528621020, -1784974125}, 51 >>> TextUtils.lastIndexOf("", '~'), objArr);
                strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                g(new int[]{-971234635, -1744097898, -952733149, -1981806850, 940900081, -819192861, 1472204062, 540788276, 1592105431, -2056275810}, TextUtils.getOffsetBefore("", 1) * 121, objArr2);
                obj = objArr2[0];
            } else {
                Object[] objArr3 = new Object[1];
                g(new int[]{1598241264, 834005358, -1994686266, -1632607968, -43487123, 1974845283, 1144732266, -940791238, 2078680419, -1251456898, 528621020, -1784974125}, TextUtils.lastIndexOf("", '0') + 25, objArr3);
                strIntern = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                g(new int[]{-971234635, -1744097898, -952733149, -1981806850, 940900081, -819192861, 1472204062, 540788276, 1592105431, -2056275810}, TextUtils.getOffsetBefore("", 0) + 17, objArr4);
                obj = objArr4[0];
            }
            f.c(strIntern, ((String) obj).intern());
        }
        if (this.f22019a.s()) {
            new o.bl.b(this.f22021e, new b.d() { // from class: o.cb.a.4
                private static final byte[] $$a = null;
                private static final int $$b = 0;
                private static int $10 = 0;
                private static int $11 = 0;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private static char f22059b = 0;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private static int f22060c = 0;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static char[] f22061d = null;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private static int f22062e = 0;

                /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x001f -> B:5:0x0011). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                private static java.lang.String $$c(byte r6, byte r7, int r8) {
                    /*
                        int r7 = r7 + 4
                        int r6 = r6 * 2
                        int r0 = r6 + 1
                        int r5 = r8 + 102
                        byte[] r4 = o.cb.a.AnonymousClass4.$$a
                        byte[] r3 = new byte[r0]
                        r2 = 0
                        if (r4 != 0) goto L24
                        r0 = r6
                        r1 = r2
                    L11:
                        int r5 = r5 + r0
                    L12:
                        byte r0 = (byte) r5
                        int r7 = r7 + 1
                        r3[r1] = r0
                        if (r1 != r6) goto L1f
                        java.lang.String r0 = new java.lang.String
                        r0.<init>(r3, r2)
                        return r0
                    L1f:
                        r0 = r4[r7]
                        int r1 = r1 + 1
                        goto L11
                    L24:
                        r1 = r2
                        goto L12
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.cb.a.AnonymousClass4.$$c(byte, byte, int):java.lang.String");
                }

                static {
                    init$0();
                    $10 = 0;
                    $11 = 1;
                    f22060c = 0;
                    f22062e = 1;
                    f22061d = new char[]{64599, 65470, 64594, 64586, 64582, 64517, 64593, 65468, 64580, 64543, 64584, 64579, 64587, 65469, 64595, 64630, 64597, 64592, 64611, 64588, 64624, 64596, 64589, 64578, 64520, 64590, 65471, 64583, 64577, 64616, 64581, 64598, 64585, 64591, 64576, 64614};
                    f22059b = (char) 51641;
                }

                /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                private static void f(int r29, java.lang.String r30, byte r31, java.lang.Object[] r32) throws java.lang.Throwable {
                    /*
                        Method dump skipped, instruction units count: 911
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.cb.a.AnonymousClass4.f(int, java.lang.String, byte, java.lang.Object[]):void");
                }

                static void init$0() {
                    $$a = new byte[]{90, -4, -67, Ascii.NAK};
                    $$b = 34;
                }

                @Override // o.bl.b.d
                public final void d() throws Throwable {
                    int i6 = 2 % 2;
                    if (a.this.f22020c != null) {
                        int i7 = f22060c + 111;
                        f22062e = i7 % 128;
                        int i8 = i7 % 2;
                        if (f.a()) {
                            int i9 = f22062e + 77;
                            f22060c = i9 % 128;
                            int i10 = i9 % 2;
                            Object[] objArr5 = new Object[1];
                            f(24 - Gravity.getAbsoluteGravity(0, 0), "\u001e\u0005\u0004\"\u001e\u0010\u0007\u0012\u000e\u0002 \u0013\u0016\"\t\u0007#\u001c\u0006\u000e\u000b\u0014\u001e\u0004", (byte) (117 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), objArr5);
                            String strIntern2 = ((String) objArr5[0]).intern();
                            Object[] objArr6 = new Object[1];
                            f(52 - ExpandableListView.getPackedPositionGroup(0L), "\n\u001c\u0006\u000e\u0016#\u001e\u0005\u0004\"\u001e\u0010\u0007\u0012\u000e\u0002#\u0001\u001d\u0000\u0002\n㘆㘆\u001a\t\u0001\u001c\u0003\u000b\u0000\u0004\u000e\u0012\u0016\"\t\u0007#\u001e\u0000\u000f\u0007\u0017\u0015\u0011\u0010\u0005\n\u0004㗹㗹", (byte) (KeyEvent.getDeadChar(0, 0) + 16), objArr6);
                            f.c(strIntern2, ((String) objArr6[0]).intern());
                            int i11 = f22060c + 87;
                            f22062e = i11 % 128;
                            int i12 = i11 % 2;
                        }
                        o.f.b.b();
                        a.this.f22020c.l();
                    }
                }

                @Override // o.bl.b.d
                public final void d(o.bg.c cVar) throws Throwable {
                    int i6 = 2 % 2;
                    int i7 = f22060c + 61;
                    f22062e = i7 % 128;
                    if (i7 % 2 == 0) {
                        c cVar2 = a.this.f22020c;
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    if (a.this.f22020c != null) {
                        int i8 = f22062e + 105;
                        f22060c = i8 % 128;
                        int i9 = i8 % 2;
                        if (!(!f.a())) {
                            Object[] objArr5 = new Object[1];
                            f(24 - KeyEvent.getDeadChar(0, 0), "\u001e\u0005\u0004\"\u001e\u0010\u0007\u0012\u000e\u0002 \u0013\u0016\"\t\u0007#\u001c\u0006\u000e\u000b\u0014\u001e\u0004", (byte) (117 - TextUtils.getTrimmedLength("")), objArr5);
                            String strIntern2 = ((String) objArr5[0]).intern();
                            Object[] objArr6 = new Object[1];
                            f((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 52, "\n\u001c\u0006\u000e\u0016#\u001e\u0005\u0004\"\u001e\u0010\u0007\u0012\u000e\u0002#\u0001\u001d\u0000\u0002\n㘎㘎\u001a\t\u0001\u001c\u0003\u000b\u0000\u0004\u000e\u0012\u0016\"\t\u0007#\u001e\u0000\u000f\u0007\u0017\u0012\u0013\u0007\u0014#\u000e\u0004\u001e", (byte) (AndroidCharacter.getMirror('0') - 24), objArr6);
                            f.c(strIntern2, ((String) objArr6[0]).intern());
                            int i10 = f22060c + 13;
                            f22062e = i10 % 128;
                            int i11 = i10 % 2;
                        }
                        a.this.f22020c.d(cVar);
                    }
                }
            }, this.f22019a).a(dVar, dVar2, new e() { // from class: o.cb.a.3

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public static int f22054c = 1533105801;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private static int f22055f = 0;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public static int f22056g = 1266738151;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private static int f22057h = 1;

                @Override // o.bl.e
                public final o.bg.c a(o.bg.c cVar) {
                    int i6 = 2 % 2;
                    int i7 = f22057h;
                    int i8 = ((i7 + 57) - (57 | i7)) + (i7 | 57);
                    f22055f = i8 % 128;
                    if (i8 % 2 == 0) {
                        return cVar;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }

                @Override // o.bl.e
                public final o.ef.a e() throws o.ef.b {
                    int i6 = 2 % 2;
                    int i7 = f22054c * 1824548937;
                    f22054c = i7;
                    int i8 = ~i7;
                    int i9 = ~((729281755 & i8) | (729281755 ^ i8));
                    int i10 = (-85901044) - (~(((-1) - (((-1) - ((i9 + 268960032) - (i9 | 268960032))) & ((-1) - (268960032 ^ i9)))) * 168));
                    int i11 = (~(((-1) - (((-1) - (-268960033)) | ((-1) - i7))) | ((-268960033) ^ i7))) * 168;
                    int i12 = (((-1) - (((-1) - i10) & ((-1) - i11))) << 1) - (i11 ^ i10);
                    int i13 = ~((-1) - (((-1) - (i8 & (-421175730))) & ((-1) - ((-421175730) ^ i8))));
                    int i14 = (-1) - (((-1) - ((i13 + 152215697) - (i13 | 152215697))) & ((-1) - (i13 ^ 152215697)));
                    int i15 = ~((-1) - (((-1) - (i7 & 998241787)) & ((-1) - (998241787 ^ i7))));
                    int i16 = -(-(((i15 & i14) | (i14 ^ i15)) * 168));
                    int i17 = (i12 ^ i16) + (((i16 + i12) - (i16 | i12)) << 1);
                    int i18 = f22056g * 284543180;
                    f22056g = i18;
                    int i19 = ~i18;
                    int i20 = (~((-1) - (((-1) - (i19 & 527535203)) & ((-1) - (527535203 ^ i19))))) | 222299171;
                    int i21 = (-527535204) ^ i18;
                    int i22 = (-1) - (((-1) - (-527535204)) | ((-1) - i18));
                    int i23 = ~((i22 + i21) - (i22 & i21));
                    int i24 = 1281249036 - (~(((i20 + i23) - (i20 & i23)) * (-338)));
                    int i25 = ~i18;
                    int i26 = ~((-1) - (((-1) - ((-1) - (((-1) - i25) | ((-1) - 527535203)))) & ((-1) - (527535203 ^ i25))));
                    Object obj2 = null;
                    if (i17 > (i24 - (~(((-1) - (((-1) - (~((-1) - (((-1) - i18) & ((-1) - (-305236033)))))) & ((-1) - i26))) * ExifDirectoryBase.TAG_EXTRA_SAMPLES))) - 1) {
                        return null;
                    }
                    obj2.hashCode();
                    throw null;
                }
            });
            int i6 = f22017i + 1;
            f22015d = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.WrongState;
        Object[] objArr5 = new Object[1];
        g(new int[]{606423526, -719006533, 817402656, 1940274703}, 7 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr5);
        String strIntern2 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        g(new int[]{606423526, -719006533, -928063600, 956950748, -2124147182, 203527973, -482725619, -2044041542, 1174756562, -178486110, 494124448, -1329372758, 1104188506, 1029887213, 1056382186, 1772124454, -854545336, -1619488037, -1291966503, -585286196, 322403728, 1939674173}, (ViewConfiguration.getPressedStateDuration() >> 16) + 42, objArr6);
        throw new WalletValidationException(walletValidationErrorCode, strIntern2, ((String) objArr6[0]).intern());
    }
}
