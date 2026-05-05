package o.ag;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.photoshop.PhotoshopDirectory;
import com.facebook.imageutils.JfifUtil;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import o.a.i;
import o.a.q;
import o.ab.j;
import o.cg.f;
import o.d.d;
import o.ef.c;
import o.er.k;
import o.er.m;
import o.er.n;
import o.er.o;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends o.ab.e<e> {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static boolean f20195k = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static boolean f20196m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static char[] f20197n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f20198o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static int f20199p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static int f20200q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static int f20201r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static int f20202s = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    List<o> f20203f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    n f20204g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    k f20205j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    List<m> f20206l;

    static final class a extends j<b> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static final byte[] $$k = null;
        private static final int $$l = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f20207b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f20208c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static int f20209d = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f20210f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static int f20211g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static int f20212h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static int f20213i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static long f20214j = 0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static int f20215k = 0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static char f20216m = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static int f20217n = 0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static long f20218o = 0;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static int f20219v = 0;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static int f20220z = 0;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0016). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$m(byte r8, short r9, byte r10) {
            /*
                int r0 = r9 * 2
                int r7 = 3 - r0
                int r6 = 122 - r10
                byte[] r5 = o.ag.b.a.$$k
                int r1 = r8 * 2
                int r0 = 1 - r1
                byte[] r4 = new byte[r0]
                r3 = 0
                int r2 = 0 - r1
                if (r5 != 0) goto L2b
                r6 = r2
                r0 = r7
                r1 = r3
            L16:
                int r7 = r7 + r6
                r6 = r7
                r7 = r0
            L19:
                byte r0 = (byte) r6
                r4[r1] = r0
                int r0 = r7 + 1
                if (r1 != r2) goto L26
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                return r0
            L26:
                int r1 = r1 + 1
                r7 = r5[r0]
                goto L16
            L2b:
                r1 = r3
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ag.b.a.$$m(byte, short, byte):java.lang.String");
        }

        static {
            init$2();
            $10 = 0;
            $11 = 1;
            init$1();
            f20220z = 2134545370;
            f20219v = -435447747;
            init$0();
            f20210f = 1900279492;
            f20211g = 1251255138;
            f20212h = 2020148667;
            f20207b = -932156570;
            f20208c = -737261551;
            f20209d = 1506219460;
            f20215k = 0;
            f20217n = 1;
            f20214j = 740602047300126166L;
            f20213i = 1564493270;
            f20216m = (char) 20247;
            f20218o = 9080252920386400611L;
        }

        a(b bVar) {
            super(bVar, true);
        }

        private static void A(char c2, String str, String str2, String str3, int i2, Object[] objArr) throws Throwable {
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            int i3 = 2;
            int i4 = 2 % 2;
            int i5 = $10 + 27;
            $11 = i5 % 128;
            Object obj = null;
            Object charArray = str6;
            if (i5 % 2 == 0) {
                throw null;
            }
            if (str6 != null) {
                charArray = str6.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            Object obj2 = str5;
            if (str5 != null) {
                char[] charArray2 = str5.toCharArray();
                int i6 = $10 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                obj2 = charArray2;
            }
            char[] cArr2 = (char[]) obj2;
            Object charArray3 = str4;
            if (str4 != null) {
                int i8 = $10 + 35;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                charArray3 = str4.toCharArray();
            }
            i iVar = new i();
            int length = cArr.length;
            char[] cArr3 = new char[length];
            int length2 = cArr2.length;
            char[] cArr4 = new char[length2];
            System.arraycopy(cArr, 0, cArr3, 0, length);
            System.arraycopy(cArr2, 0, cArr4, 0, length2);
            cArr3[0] = (char) (cArr3[0] ^ c2);
            cArr4[2] = (char) (cArr4[2] + ((char) i2));
            int length3 = ((char[]) charArray3).length;
            char[] cArr5 = new char[length3];
            iVar.f19932b = 0;
            while (iVar.f19932b < length3) {
                int i10 = $10 + 73;
                $11 = i10 % 128;
                int i11 = i10 % i3;
                try {
                    Object[] objArr2 = {iVar};
                    Object objA = d.a(540069882);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = d.a(106 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 11 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -155898465, false, $$m(b2, b3, (byte) ((b3 + 57) - (57 & b3))), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objA).invoke(obj, objArr2)).intValue();
                    Object[] objArr3 = {iVar};
                    Object objA2 = d.a(2068572);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = d.a(847 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 6488), 12 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -694521287, false, $$m(b4, b5, (byte) ((-1) - (((-1) - b5) & ((-1) - 54)))), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objA2).invoke(obj, objArr3)).intValue();
                    Object[] objArr4 = {iVar, Integer.valueOf(cArr3[iVar.f19932b % 4] * 32718), Integer.valueOf(cArr4[iIntValue])};
                    Object objA3 = d.a(-1122996612);
                    if (objA3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objA3 = d.a((ViewConfiguration.getKeyRepeatDelay() >> 16) + 458, (char) (ViewConfiguration.getScrollBarSize() >> 8), 11 - (ViewConfiguration.getScrollBarSize() >> 8), 1804962841, false, $$m(b6, b7, (byte) ((b7 + 56) - (56 & b7))), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr3[iIntValue2] * 32718), Integer.valueOf(cArr4[iIntValue])};
                    Object objA4 = d.a(-1223178239);
                    if (objA4 == null) {
                        int iResolveSizeAndState = 639 - View.resolveSizeAndState(0, 0, 0);
                        char c3 = (char) (65101 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                        int i12 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 11;
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        String str$$m = $$m(b8, b9, b9);
                        i3 = 2;
                        objA4 = d.a(iResolveSizeAndState, c3, i12, 1636969060, false, str$$m, new Class[]{Integer.TYPE, Integer.TYPE});
                    } else {
                        i3 = 2;
                    }
                    cArr4[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                    cArr3[iIntValue2] = iVar.f19933e;
                    cArr5[iVar.f19932b] = (char) (((((long) (cArr3[iIntValue2] ^ r9[iVar.f19932b])) ^ (f20214j ^ 740602047300126166L)) ^ ((long) ((int) (((long) f20213i) ^ 740602047300126166L)))) ^ ((long) ((char) (((long) f20216m) ^ 740602047300126166L))));
                    iVar.f19932b++;
                    obj = null;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArr5);
        }

        private static void B(String str, int i2, Object[] objArr) throws Throwable {
            String str2 = str;
            int i3 = 2 % 2;
            int i4 = $11 + 75;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
            q qVar = new q();
            qVar.f19949d = i2;
            int length = cArr.length;
            long[] jArr = new long[length];
            qVar.f19948a = 0;
            int i6 = $10 + 27;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 3 / 2;
            }
            while (qVar.f19948a < cArr.length) {
                int i8 = $10 + 69;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = qVar.f19948a;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                        Object objA = d.a(-1011865131);
                        if (objA == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objA = d.a(731 - ExpandableListView.getPackedPositionGroup(0L), (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 7933), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 10, 355847088, false, $$m(b2, b3, (byte) (51 | b3)), new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i9] = (-1) - (((-1) - ((Long) ((Method) objA).invoke(null, objArr2)).longValue()) & ((-1) - (f20218o & 4743694005979712847L)));
                        Object[] objArr3 = {qVar, qVar};
                        Object objA2 = d.a(1452497747);
                        if (objA2 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objA2 = d.a(836 - (ViewConfiguration.getTouchSlop() >> 8), (char) ((Process.myTid() >> 22) + 27279), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 11, -2145994442, false, $$m(b4, b5, (byte) (44 | b5)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objA2).invoke(null, objArr3);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    int i10 = qVar.f19948a;
                    Object[] objArr4 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                    Object objA3 = d.a(-1011865131);
                    if (objA3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objA3 = d.a(730 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (7933 - (Process.myPid() >> 22)), (KeyEvent.getMaxKeyCode() >> 16) + 11, 355847088, false, $$m(b6, b7, (byte) (51 | b7)), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i10] = ((Long) ((Method) objA3).invoke(null, objArr4)).longValue() ^ (f20218o ^ 4743694005979712847L);
                    Object[] objArr5 = {qVar, qVar};
                    Object objA4 = d.a(1452497747);
                    if (objA4 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        objA4 = d.a(836 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 27280), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 10, -2145994442, false, $$m(b8, b9, (byte) ((b9 + 44) - (44 & b9))), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA4).invoke(null, objArr5);
                }
            }
            char[] cArr2 = new char[length];
            qVar.f19948a = 0;
            while (qVar.f19948a < cArr.length) {
                cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
                Object[] objArr6 = {qVar, qVar};
                Object objA5 = d.a(1452497747);
                if (objA5 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    objA5 = d.a(836 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) ((Process.myPid() >> 22) + 27279), 10 - TextUtils.lastIndexOf("", '0', 0), -2145994442, false, $$m(b10, b11, (byte) (44 | b11)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA5).invoke(null, objArr6);
            }
            objArr[0] = new String(cArr2);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0014). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void E(byte r8, int r9, short r10, java.lang.Object[] r11) {
            /*
                int r7 = r10 + 4
                byte[] r6 = o.ag.b.a.$$a
                int r0 = r8 * 5
                int r5 = 106 - r0
                int r4 = r9 * 3
                int r0 = r4 + 1
                byte[] r3 = new byte[r0]
                r2 = 0
                if (r6 != 0) goto L29
                r0 = r5
                r5 = r4
                r1 = r2
            L14:
                int r5 = r5 + r0
            L15:
                int r7 = r7 + 1
                byte r0 = (byte) r5
                r3[r1] = r0
                if (r1 != r4) goto L24
                java.lang.String r0 = new java.lang.String
                r0.<init>(r3, r2)
                r11[r2] = r0
                return
            L24:
                int r1 = r1 + 1
                r0 = r6[r7]
                goto L14
            L29:
                r1 = r2
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ag.b.a.E(byte, int, short, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:5:0x0016). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void F(int r7, byte r8, short r9, java.lang.Object[] r10) {
            /*
                int r8 = r8 * 7
                int r1 = r8 + 1
                int r0 = r7 * 14
                int r7 = 111 - r0
                byte[] r6 = o.ag.b.a.$$d
                int r0 = r9 * 7
                int r5 = 11 - r0
                byte[] r4 = new byte[r1]
                r3 = 0
                if (r6 != 0) goto L30
                r7 = r8
                r1 = r5
                r2 = r3
            L16:
                int r7 = r7 + r5
                int r7 = r7 + (-5)
                int r5 = r1 + 1
                r1 = r2
            L1c:
                byte r0 = (byte) r7
                r4[r1] = r0
                int r2 = r1 + 1
                if (r1 != r8) goto L2b
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                r10[r3] = r0
                return
            L2b:
                r0 = r6[r5]
                r1 = r5
                r5 = r0
                goto L16
            L30:
                r1 = r3
                goto L1c
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ag.b.a.F(int, byte, short, java.lang.Object[]):void");
        }

        private static /* synthetic */ Object a(Object[] objArr) {
            a aVar = (a) objArr[0];
            int iIntValue = ((Number) objArr[1]).intValue();
            int i2 = 2 % 2;
            Object obj = null;
            if (iIntValue == 6000) {
                int i3 = f20217n + 33;
                f20215k = i3 % 128;
                if (i3 % 2 == 0) {
                    return o.bg.a.aI;
                }
                o.bg.a aVar2 = o.bg.a.aI;
                obj.hashCode();
                throw null;
            }
            o.bg.a aVarB = super.b(iIntValue);
            int i4 = f20215k + 9;
            f20217n = i4 % 128;
            if (i4 % 2 != 0) {
                return aVarB;
            }
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ Object c(int i2, int i3, Object[] objArr, int i4, int i5, int i6, int i7) throws Throwable {
            int i8 = ~i5;
            int i9 = ~i7;
            int i10 = (-1) - (((-1) - (~((-1) - (((-1) - i8) & ((-1) - i9))))) & ((-1) - i3));
            int i11 = (i7 + i8) - (i7 & i8);
            int i12 = ~i3;
            int i13 = ~(((i8 + i12) - (i8 & i12)) | i9);
            int i14 = ~((i3 + i5) - (i3 & i5));
            int i15 = (-1) - (((-1) - (~((i7 + i3) - (i7 & i3)))) & ((-1) - ((i13 + i14) - (i13 & i14))));
            int i16 = i3 + i5 + i6 + (764943627 * i2) + (189947931 * i4);
            int i17 = i16 * i16;
            int i18 = ((i3 * (-973936384)) - 801505280) + ((-973936384) * i5) + (1838296578 * i10) + (1228335359 * i11) + ((-1228335359) * i15) + (2092695552 * i6) + ((-1475084288) * i2) + ((-1479278592) * i4) + ((-626393088) * i17);
            int i19 = (i3 * 1860537600) + 224780607 + (i5 * 1860537600) + (i10 * PhotoshopDirectory.TAG_COPYRIGHT) + (i11 * (-517)) + (i15 * 517) + (i6 * 1860538117) + (i2 * (-1861700041)) + (i4 * (-831392377)) + (i17 * 995229696);
            if (i18 + (i19 * i19 * 1053163520) == 1) {
                return a(objArr);
            }
            Context context = (Context) objArr[1];
            int i20 = 2 % 2;
            int i21 = f20217n + 51;
            f20215k = i21 % 128;
            int i22 = i21 % 2;
            o.cg.b bVarE = e(context);
            int i23 = f20217n + 43;
            f20215k = i23 % 128;
            int i24 = i23 % 2;
            return bVarE;
        }

        private static o.cg.b e(Context context) throws Throwable {
            int i2 = 2 % 2;
            Object[] objArr = new Object[1];
            B("밞‵葃梚첶냂ᔚ櫓嵃솖ꖺৄ\uee10刻㙇骞纩\ue2c7䜒", 39979 - Color.argb(0, 0, 0, 0), objArr);
            o.cg.b bVar = new o.cg.b(context, 52, ((String) objArr[0]).intern());
            int i3 = f20217n + 115;
            f20215k = i3 % 128;
            if (i3 % 2 == 0) {
                return bVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static void init$0() {
            $$a = new byte[]{Ascii.NAK, 117, 119, 110};
            $$b = 239;
        }

        static void init$1() {
            $$d = new byte[]{Ascii.SYN, -5, 39, 97, MessagePack.Code.BIN8, 58, 5, MessagePack.Code.INT8, 59, MessagePack.Code.BIN16, 19};
            $$e = 27;
        }

        static void init$2() {
            $$k = new byte[]{98, -110, MessagePack.Code.BIN16, -94};
            $$l = 175;
        }

        @Override // o.ab.j
        public final /* synthetic */ f a(Context context) {
            int i2 = f20209d * 506136562;
            f20209d = i2;
            int i3 = f20208c * (-1238102863);
            f20208c = i3;
            int i4 = 30461090 * f20207b;
            f20207b = i4;
            return (f) c(i4, -1096264400, new Object[]{this, context}, Process.myPid(), 1096264400, i3, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j
        public final void a(o.ef.a aVar) throws Throwable {
            m.b bVar;
            int i2 = 2 % 2;
            Object[] objArr = new Object[1];
            B("뱏᷺Ｐ奭㪃铱瘉큙뇄ጱ\ued65互⣝訔摝연Ꜹ", 41400 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr);
            c cVarT = aVar.t(((String) objArr[0]).intern());
            ArrayList arrayList = new ArrayList();
            if (cVarT != null) {
                int i3 = f20215k + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                f20217n = i3 % 128;
                int i4 = i3 % 2;
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int i5 = 1567746851;
                int i6 = c.f23799b * 1567746851;
                c.f23799b = i6;
                int i7 = 1136425123;
                int i8 = c.f23798a * 1136425123;
                c.f23798a = i8;
                int i9 = -1513293186;
                if (((Integer) c.b((int) Runtime.getRuntime().maxMemory(), i8, i6, -1513293186, elapsedCpuTime, 1513293186, new Object[]{cVarT})).intValue() > 0) {
                    int i10 = 0;
                    while (true) {
                        int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
                        int i11 = c.f23799b * i5;
                        c.f23799b = i11;
                        int i12 = c.f23798a * i7;
                        c.f23798a = i12;
                        if (i10 >= ((Integer) c.b((int) Runtime.getRuntime().maxMemory(), i12, i11, i9, elapsedCpuTime2, 1513293186, new Object[]{cVarT})).intValue()) {
                            break;
                        }
                        o.ef.a aVarD = cVarT.d(i10);
                        Object[] objArr2 = new Object[1];
                        A((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 7281), "\uf74b磾鞗慃ေᚊ", "\u0000\u0000\u0000\u0000", "蓫ॎ瀤縜", ViewConfiguration.getKeyRepeatTimeout() >> 16, objArr2);
                        Object[] objArr3 = {aVarD, ((String) objArr2[0]).intern()};
                        int i13 = o.ef.a.f23782p * (-1576737484);
                        o.ef.a.f23782p = i13;
                        String str = (String) o.ef.a.a(-781664457, objArr3, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i13, Thread.currentThread().getPriority());
                        Object[] objArr4 = new Object[1];
                        B("뱉䓟䵜嗀幚曤潏矘硗Äुᇂ", 63617 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr4);
                        Object[] objArr5 = {aVarD, ((String) objArr4[0]).intern()};
                        int i14 = o.ef.a.f23782p * (-1576737484);
                        o.ef.a.f23782p = i14;
                        String str2 = (String) o.ef.a.a(-781664457, objArr5, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i14, Thread.currentThread().getPriority());
                        Object[] objArr6 = new Object[1];
                        B("뱉\uf1cb❴哼訊㾆洽ꍛ탡", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 19861, objArr6);
                        Object[] objArr7 = {aVarD, ((String) objArr6[0]).intern()};
                        int i15 = o.ef.a.f23782p * (-1576737484);
                        o.ef.a.f23782p = i15;
                        String str3 = (String) o.ef.a.a(-781664457, objArr7, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i15, Thread.currentThread().getPriority());
                        m.b[] bVarArrValues = m.b.values();
                        int length = bVarArrValues.length;
                        int i16 = 0;
                        while (true) {
                            if (i16 >= length) {
                                bVar = null;
                                break;
                            }
                            bVar = bVarArrValues[i16];
                            if (bVar.name().equals(str3)) {
                                int i17 = f20215k;
                                int i18 = i17 + 113;
                                f20217n = i18 % 128;
                                int i19 = i18 % 2;
                                int i20 = i17 + 49;
                                f20217n = i20 % 128;
                                int i21 = i20 % 2;
                                break;
                            }
                            i16++;
                            int i22 = f20215k + 85;
                            f20217n = i22 % 128;
                            int i23 = i22 % 2;
                        }
                        if (bVar == null) {
                            if (o.ea.f.a()) {
                                Object[] objArr8 = new Object[1];
                                B("뱯咍浚ׅḕ㚀켶\ue06a\uf8c1酴ꧦ䈒媥猾єᳰ㕲춋\ue639ﺤ霢ꡇ䃽奚熋ਚ⊯㯌챖\ue4ef", View.getDefaultSize(0, 0) + 59539, objArr8);
                                String strIntern = ((String) objArr8[0]).intern();
                                Object[] objArr9 = new Object[1];
                                B("뱩க폈鬢捲⫻\uf28d뫎Ȑ쩪釢姼⇛\ue943녘碼샰蠻", 47051 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr9);
                                o.ea.f.b(strIntern, ((String) objArr9[0]).intern());
                            }
                            bVar = m.b.f25079k;
                        }
                        arrayList.add(new m(str, str2, bVar));
                        i10++;
                        i9 = -1513293186;
                        i5 = 1567746851;
                        i7 = 1136425123;
                    }
                }
            }
            ((b) e()).f20206l = arrayList;
        }

        @Override // o.ab.j
        public final o.bg.a b(int i2) {
            Object[] objArr = {this, Integer.valueOf(i2)};
            int i3 = f20212h * 359585964;
            f20212h = i3;
            int i4 = f20211g * 392498668;
            f20211g = i4;
            int i5 = (-607484249) * f20210f;
            f20210f = i5;
            return (o.bg.a) c(i5, 1997636724, objArr, Process.myUid(), -1997636723, i4, i3);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0232  */
        @Override // o.ab.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void b(o.bg.c r28) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1077
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ag.b.a.b(o.bg.c):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.c
        public final void c(o.bg.c cVar) {
            int i2 = 2 % 2;
            int i3 = f20215k + 109;
            f20217n = i3 % 128;
            if (i3 % 2 != 0) {
                ((b) e()).g().b(((b) e()).f20206l);
                return;
            }
            ((b) e()).g().b(((b) e()).f20206l);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.ab.j
        public final o.cg.j k() {
            int i2 = 2 % 2;
            int i3 = f20217n + 77;
            f20215k = i3 % 128;
            if (i3 % 2 == 0) {
                return null;
            }
            int i4 = 35 / 0;
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j
        public final o.ef.a m() throws Throwable {
            int i2 = 2;
            int i3 = 2 % 2;
            o.ef.a aVar = new o.ef.a();
            o.ef.a aVar2 = new o.ef.a();
            char c2 = '0';
            int i4 = 1;
            Object[] objArr = new Object[1];
            A((char) (TextUtils.lastIndexOf("", '0', 0) + 1), "ߍᮇ㕐춥鶐⛎ϛ沌幯", "\u0000\u0000\u0000\u0000", "榲빽폐쵎", Drawable.resolveOpacity(0, 0) - 792822423, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = {((b) e()).f20205j};
            int iNextInt = new Random().nextInt();
            int iMyPid = Process.myPid();
            k.f25018b = k.f25018b * (-91568461);
            k.f25017a = k.f25017a * (-1816306970);
            aVar2.a(strIntern, k.c(iMyPid, 2051927583, r16, iNextInt, objArr2, r19, -2051927583));
            Object[] objArr3 = new Object[1];
            B("뱀봐뻥롏뤖몜둯뗂", 349 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr3);
            aVar2.a(((String) objArr3[0]).intern(), (Object) ((b) e()).f20205j.b());
            Object[] objArr4 = new Object[1];
            B("뱉⤊雛Τ\ue96c", 38219 - Color.green(0), objArr4);
            aVar2.a(((String) objArr4[0]).intern(), (Object) ((b) e()).f20205j.d());
            o.ef.a aVar3 = new o.ef.a();
            Object[] objArr5 = new Object[1];
            B("뱏ꁮ萃\ue8c5쳬タᕛ祔崫䇝ꖋ", TextUtils.indexOf("", "") + 7213, objArr5);
            aVar3.a(((String) objArr5[0]).intern(), (Object) ((b) e()).f20205j.e());
            Object[] objArr6 = new Object[1];
            B("뱜Ꮭ\ue371늉ȭ톟ꇏ煮삆逨枤", (ViewConfiguration.getScrollBarSize() >> 8) + 44953, objArr6);
            String strIntern2 = ((String) objArr6[0]).intern();
            Object[] objArr7 = {((b) e()).f20205j};
            k.f25019c = k.f25019c * (-1583409397);
            int iMyTid = Process.myTid();
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            k.f25022g = (-1155363413) * k.f25022g;
            aVar3.a(strIntern2, k.c(iMyTid, 357010820, r16, r17, objArr7, iMaxMemory, -357010818));
            Object[] objArr8 = new Object[1];
            B("뱁馚\uf7fc췎⬤Ŵ彴뒶銉\ue8ef옳ᰍ", 9689 - (KeyEvent.getMaxKeyCode() >> 16), objArr8);
            aVar2.a(((String) objArr8[0]).intern(), aVar3);
            Object[] objArr9 = new Object[1];
            B("뱀ⷐ齸࢜鶴摜헥䜂ょꋆ౪ﷶ", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 37277, objArr9);
            String strIntern3 = ((String) objArr9[0]).intern();
            Object[] objArr10 = {((b) e()).f20205j};
            int priority = Thread.currentThread().getPriority();
            int i5 = (int) Runtime.getRuntime().totalMemory();
            k.f25021e = k.f25021e * (-460678624);
            k.f25020d = k.f25020d * 1879643041;
            aVar2.a(strIntern3, k.c(i5, -377784092, r16, priority, objArr10, r19, 377784093));
            Object[] objArr11 = new Object[1];
            B("뱏ꁮ萃\ue8c5쳬タᕛ祔崫䇝ꖋ", 7213 - KeyEvent.normalizeMetaState(0), objArr11);
            aVar2.a(((String) objArr11[0]).intern(), (Object) ((b) e()).f20205j.g());
            long j2 = 0;
            Object[] objArr12 = new Object[1];
            B("뱏\ueb34ኅ먟\ue1f7ॠ냇\udfa5܍꺗혈緬", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 22381, objArr12);
            aVar.a(((String) objArr12[0]).intern(), aVar2);
            if (((b) e()).f20203f != null) {
                c cVar = new c();
                for (o oVar : ((b) e()).f20203f) {
                    o.ef.a aVar4 = new o.ef.a();
                    Object[] objArr13 = new Object[i4];
                    A((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 7280), "\uf74b磾鞗慃ေᚊ", "\u0000\u0000\u0000\u0000", "蓫ॎ瀤縜", KeyEvent.keyCodeFromString(""), objArr13);
                    aVar4.a(((String) objArr13[0]).intern(), (Object) oVar.c());
                    if (oVar.d() != null) {
                        Object[] objArr14 = new Object[i4];
                        A((char) (18591 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), "\u074b崐炵ᩥ倣搟\ue40e빟⮩舣㉆馹\uf8cb鼳", "\u0000\u0000\u0000\u0000", "ኧ苓黄䝈", ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0), objArr14);
                        aVar4.a(((String) objArr14[0]).intern(), (Object) oVar.d());
                        int i6 = f20217n + 51;
                        f20215k = i6 % 128;
                        int i7 = i6 % i2;
                    }
                    if (oVar.a() != null) {
                        o.ef.a aVar5 = new o.ef.a();
                        Object[] objArr15 = new Object[i4];
                        A((char) (13300 - (ViewConfiguration.getWindowTouchSlop() >> 8)), "롍驪颒휃皇", "\u0000\u0000\u0000\u0000", "蔕\ue88f\uf48bᄳ", (-1947693179) - TextUtils.getCapsMode("", 0, 0), objArr15);
                        aVar5.a(((String) objArr15[0]).intern(), (Object) oVar.a().c());
                        Object[] objArr16 = new Object[i4];
                        B("뱀ꨬ邐ｲ\ue5ba", TextUtils.lastIndexOf("", c2) + 5738, objArr16);
                        aVar5.a(((String) objArr16[0]).intern(), (Object) oVar.a().d());
                        Object[] objArr17 = new Object[i4];
                        A((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 18949), "桦䥲脆垻", "\u0000\u0000\u0000\u0000", "娞\uec55ԙ\ued4a", View.combineMeasuredStates(0, 0), objArr17);
                        String strIntern4 = ((String) objArr17[0]).intern();
                        Object[] objArr18 = {oVar.a()};
                        o.e.f25108b = o.e.f25108b * (-315355158);
                        o.e.f25109c = o.e.f25109c * 1761739739;
                        o.e.f25110d = o.e.f25110d * 1489632990;
                        aVar5.a(strIntern4, o.e.d(1099404672, (int) Process.getElapsedCpuTime(), r21, r22, objArr18, r24, -1099404672));
                        Object[] objArr19 = new Object[1];
                        B("뱟詟큃ṍ摕", 13831 - (ExpandableListView.getPackedPositionForGroup(0) > j2 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j2 ? 0 : -1)), objArr19);
                        String strIntern5 = ((String) objArr19[0]).intern();
                        Object[] objArr20 = {oVar.a()};
                        o.e.f25112h = o.e.f25112h * 918936327;
                        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                        o.e.f25113i = o.e.f25113i * 1875991940;
                        aVar5.a(strIntern5, o.e.d(-764060794, r20, iFreeMemory, r22, objArr20, iElapsedRealtime, 764060796));
                        Object[] objArr21 = new Object[1];
                        B("뱜\uec8a᷍七ｩ⾭壙褼㨀歘", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 20681, objArr21);
                        String strIntern6 = ((String) objArr21[0]).intern();
                        Object[] objArr22 = {oVar.a()};
                        o.e.f25107a = o.e.f25107a * (-2020098597);
                        o.e.f25111e = o.e.f25111e * 461577263;
                        aVar5.a(strIntern6, o.e.d(581231350, new Random().nextInt(), (int) SystemClock.elapsedRealtime(), r22, objArr22, r24, -581231349));
                        Object[] objArr23 = new Object[1];
                        A((char) Color.red(0), "놣ァ⟿普淪ᇠ鼭", "\u0000\u0000\u0000\u0000", "⥵⬿䊼\u2d9f", (-1138016471) - Color.green(0), objArr23);
                        aVar5.a(((String) objArr23[0]).intern(), (Object) oVar.a().i());
                        Object[] objArr24 = new Object[1];
                        A((char) (38057 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), "\uff00㊶떁任燎觔\ueff3覠㼙濚\uec69о⯧緍", "\u0000\u0000\u0000\u0000", "ሆ蝈꪿솔", TextUtils.getOffsetBefore("", 0), objArr24);
                        aVar4.a(((String) objArr24[0]).intern(), aVar5);
                        int i8 = f20215k + 87;
                        f20217n = i8 % 128;
                        int i9 = i8 % 2;
                    }
                    cVar.a(aVar4);
                    i2 = 2;
                    c2 = '0';
                    i4 = 1;
                    j2 = 0;
                }
                Object[] objArr25 = new Object[1];
                B("뱏ᯞ\uf378䫱∓", Color.argb(0, 0, 0, 0) + 42899, objArr25);
                aVar.a(((String) objArr25[0]).intern(), cVar);
                int i10 = f20215k + 63;
                f20217n = i10 % 128;
                int i11 = i10 % 2;
            } else {
                Object[] objArr26 = new Object[1];
                B("뱏ᯞ\uf378䫱∓", 42899 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr26);
                aVar.a(((String) objArr26[0]).intern(), (Object) null);
            }
            Object[] objArr27 = new Object[1];
            B("뱞ನ\udd9e껣翉젪餏橊㭈让", (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 45281, objArr27);
            aVar.b(((String) objArr27[0]).intern(), false);
            if (((b) e()).f20204g != null) {
                o.ef.a aVar6 = new o.ef.a();
                Object[] objArr28 = new Object[1];
                A((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 26179), "矯ꋏ僗␗螲㑔媜\uec95\ue007췈⭥䊃满\ue1dd\ue560ꄋ間", "\u0000\u0000\u0000\u0000", "\u0e5f\ud91f䉴䡦", TextUtils.indexOf((CharSequence) "", '0') + 1960386319, objArr28);
                aVar6.a(((String) objArr28[0]).intern(), (Object) ((b) e()).f20204g.a());
                Object[] objArr29 = new Object[1];
                A((char) (59941 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), "ﯩড়졢理\uedd0\uda91", "\u0000\u0000\u0000\u0000", "笾吸\u2451飪", ViewConfiguration.getTapTimeout() >> 16, objArr29);
                String strIntern7 = ((String) objArr29[0]).intern();
                Object[] objArr30 = {((b) e()).f20204g};
                n.f25090b = 366820712 * n.f25090b;
                n.f25092d = n.f25092d * (-107017395);
                aVar6.a(strIntern7, n.b(r11, (int) SystemClock.elapsedRealtime(), Process.myUid(), objArr30, 445238705, r16, -445238705));
                Object[] objArr31 = new Object[1];
                A((char) (53571 - (Process.myPid() >> 22)), "\ue993\u0bd1꽪쪭崦椫톏\uefffꢣ䍗퀛邸꽄薌勋\udc4fᇩ널", "\u0000\u0000\u0000\u0000", "舗岩䍏\ud8d1", ViewConfiguration.getMaximumDrawingCacheSize() >> 24, objArr31);
                aVar.a(((String) objArr31[0]).intern(), aVar6);
            }
            return aVar;
        }

        @Override // o.ab.j
        public final String o() throws Throwable {
            Object obj;
            int i2 = 2 % 2;
            int i3 = f20217n + 91;
            f20215k = i3 % 128;
            if (i3 % 2 != 0) {
                Object[] objArr = new Object[1];
                A((char) TextUtils.indexOf("", ""), "䯳笍蹹쁭餳流ई㧴휲ᯄ貧⛦돰袧牰愁磂蠛\ufde3隀\ue767\ue90bᩅ", "\u0000\u0000\u0000\u0000", "㼶퉺∨䤎", (KeyEvent.getMaxKeyCode() % 82) + 684882495, objArr);
                obj = objArr[0];
            } else {
                Object[] objArr2 = new Object[1];
                A((char) TextUtils.indexOf("", ""), "䯳笍蹹쁭餳流ई㧴휲ᯄ貧⛦돰袧牰愁磂蠛\ufde3隀\ue767\ue90bᩅ", "\u0000\u0000\u0000\u0000", "㼶퉺∨䤎", (KeyEvent.getMaxKeyCode() >> 16) + 684882495, objArr2);
                obj = objArr2[0];
            }
            String strIntern = ((String) obj).intern();
            int i4 = f20215k + 73;
            f20217n = i4 % 128;
            if (i4 % 2 != 0) {
                return strIntern;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override // o.ab.j
        public final byte[][] p() {
            int i2 = 2 % 2;
            int i3 = f20217n + 13;
            f20215k = i3 % 128;
            if (i3 % 2 == 0) {
                return null;
            }
            throw null;
        }

        @Override // o.ab.j
        public final void s() {
            int i2 = 2 % 2;
            int i3 = f20215k + 9;
            f20217n = i3 % 128;
            if (i3 % 2 != 0) {
                super.s();
            } else {
                super.s();
                int i4 = 97 / 0;
            }
        }
    }

    public interface e {
        void b(List<m> list);

        void e(o.bg.c cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$j(int r5, byte r6, byte r7) {
        /*
            int r0 = r7 * 6
            int r7 = r0 + 67
            int r6 = r6 * 3
            int r1 = r6 + 1
            int r0 = r5 * 4
            int r5 = r0 + 4
            byte[] r4 = o.ag.b.$$d
            byte[] r3 = new byte[r1]
            r2 = 0
            if (r4 != 0) goto L29
            r0 = r6
            r1 = r2
        L15:
            int r0 = -r0
            int r5 = r5 + 1
            int r7 = r7 + r0
        L19:
            byte r0 = (byte) r7
            r3[r1] = r0
            if (r1 != r6) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            return r0
        L24:
            int r1 = r1 + 1
            r0 = r4[r5]
            goto L15
        L29:
            r1 = r2
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ag.b.$$j(int, byte, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f20200q = 0;
        f20202s = 1;
        f20201r = 0;
        f20199p = 1;
        k();
        TypedValue.complexToFloat(0);
        View.MeasureSpec.makeMeasureSpec(0, 0);
        int i2 = f20200q + 17;
        f20202s = i2 % 128;
        int i3 = i2 % 2;
    }

    public b(Context context, e eVar, o.en.b bVar) {
        super(context, eVar, bVar, o.bg.e.B);
    }

    static void init$0() {
        $$d = new byte[]{54, MessagePack.Code.BIN8, MessagePack.Code.UINT64, -16};
        $$e = JfifUtil.MARKER_SOI;
    }

    static void k() {
        f20197n = new char[]{2350, 2353, 2323, 2556, 2558, 2315, 2559, 2546, 2548, 2316, 2545, 2336, 2549, 2319, 2304, 2334, 2547, 2330, 2312};
        f20198o = 2040400227;
        f20196m = true;
        f20195k = true;
    }

    private a n() {
        int i2 = 2 % 2;
        a aVar = new a(this);
        int i3 = f20201r + 91;
        f20199p = i3 % 128;
        int i4 = i3 % 2;
        return aVar;
    }

    private static void t(int i2, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
        int i3;
        char[] cArr;
        int i4;
        char[] cArr2;
        String str3 = str;
        String str4 = str2;
        int i5 = 2;
        int i6 = 2 % 2;
        Object bytes = str4;
        if (str4 != null) {
            bytes = str4.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr3 = (char[]) charArray;
        o.a.f fVar = new o.a.f();
        char[] cArr4 = f20197n;
        long j2 = 0;
        int i7 = 0;
        if (cArr4 != null) {
            int length = cArr4.length;
            char[] cArr5 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $10 + 65;
                $11 = i9 % 128;
                if (i9 % i5 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr4[i8])};
                        Object objA = d.a(1618406102);
                        if (objA == null) {
                            byte b2 = (byte) i7;
                            byte b3 = b2;
                            objA = d.a(593 - ((Process.getThreadPriority(i7) + 20) >> 6), (char) (13182 - (SystemClock.elapsedRealtime() > j2 ? 1 : (SystemClock.elapsedRealtime() == j2 ? 0 : -1))), MotionEvent.axisFromString("") + 12, -1225586509, false, $$j(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        cArr5[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr4[i8])};
                    Object objA2 = d.a(1618406102);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = d.a(593 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 13182), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 11, -1225586509, false, $$j(b4, b5, b5), new Class[]{Integer.TYPE});
                    }
                    cArr5[i8] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i8++;
                }
                i5 = 2;
                j2 = 0;
                i7 = 0;
            }
            int i10 = $11 + 91;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            cArr4 = cArr5;
        }
        Object[] objArr4 = {Integer.valueOf(f20198o)};
        Object objA3 = d.a(-1503702982);
        if (objA3 == null) {
            objA3 = d.a(32 - Gravity.getAbsoluteGravity(0, 0), (char) ExpandableListView.getPackedPositionGroup(0L), TextUtils.indexOf("", "") + 11, 1893380703, false, "F", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
        if (f20195k) {
            int i12 = $10 + 61;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                fVar.f19923e = bArr.length;
                cArr2 = new char[fVar.f19923e];
                i4 = 0;
            } else {
                i4 = 0;
                fVar.f19923e = bArr.length;
                cArr2 = new char[fVar.f19923e];
            }
            fVar.f19922a = i4;
            while (fVar.f19922a < fVar.f19923e) {
                cArr2[fVar.f19922a] = (char) (cArr4[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i2] - iIntValue);
                Object[] objArr5 = {fVar, fVar};
                Object objA4 = d.a(1540807955);
                if (objA4 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA4 = d.a(459 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 11 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -1923924106, false, $$j(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr2);
            return;
        }
        if (!f20196m) {
            fVar.f19923e = iArr.length;
            char[] cArr6 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            int i13 = $11 + 105;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            while (fVar.f19922a < fVar.f19923e) {
                int i15 = $11 + 33;
                $10 = i15 % 128;
                int i16 = i15 % 2;
                cArr6[fVar.f19922a] = (char) (cArr4[iArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                fVar.f19922a++;
            }
            objArr[0] = new String(cArr6);
            return;
        }
        int i17 = $11 + 35;
        $10 = i17 % 128;
        if (i17 % 2 != 0) {
            fVar.f19923e = cArr3.length;
            cArr = new char[fVar.f19923e];
            i3 = 0;
        } else {
            i3 = 0;
            fVar.f19923e = cArr3.length;
            cArr = new char[fVar.f19923e];
        }
        fVar.f19922a = i3;
        int i18 = $11 + 45;
        $10 = i18 % 128;
        int i19 = i18 % 2;
        while (fVar.f19922a < fVar.f19923e) {
            int i20 = $11 + 57;
            $10 = i20 % 128;
            if (i20 % 2 != 0) {
                cArr[fVar.f19922a] = (char) (cArr4[cArr3[(fVar.f19923e - 1) - fVar.f19922a] * i2] % iIntValue);
                Object[] objArr6 = {fVar, fVar};
                Object objA5 = d.a(1540807955);
                if (objA5 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objA5 = d.a(458 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) Color.green(0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 11, -1923924106, false, $$j(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA5).invoke(null, objArr6);
            } else {
                cArr[fVar.f19922a] = (char) (cArr4[cArr3[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                Object[] objArr7 = {fVar, fVar};
                Object objA6 = d.a(1540807955);
                if (objA6 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    objA6 = d.a(458 - (Process.myPid() >> 22), (char) Color.green(0), KeyEvent.getDeadChar(0, 0) + 11, -1923924106, false, $$j(b10, b11, (byte) (b11 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA6).invoke(null, objArr7);
            }
        }
        String str5 = new String(cArr);
        int i21 = $11 + 69;
        $10 = i21 % 128;
        int i22 = i21 % 2;
        objArr[0] = str5;
    }

    @Override // o.ab.e
    public final /* synthetic */ o.ab.c c() {
        int i2 = 2 % 2;
        int i3 = f20201r + 15;
        f20199p = i3 % 128;
        int i4 = i3 % 2;
        a aVarN = n();
        int i5 = f20201r + 9;
        f20199p = i5 % 128;
        int i6 = i5 % 2;
        return aVarN;
    }

    @Override // o.ab.e
    public final String e() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f20199p + 89;
        f20201r = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        t(126 - MotionEvent.axisFromString(""), null, null, "\u008e\u008d\u008f\u0089\u0089\u0088\u0081\u0085\u008e\u008b\u008f\u0081\u008e\u008d\u008c\u008b\u008a\u0089\u0088\u0087\u0085\u0084\u0081\u0086\u0085\u0084\u0083\u0083\u0082\u0081", objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i5 = f20201r + 11;
        f20199p = i5 % 128;
        if (i5 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    public final void e(k kVar, List<o> list, n nVar) {
        int i2 = 2 % 2;
        if (o.ea.f.a()) {
            int i3 = f20201r + 111;
            f20199p = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            t(127 - Color.blue(0), null, null, "\u008e\u008d\u008f\u0089\u0089\u0088\u0081\u0085\u008e\u008b\u008f\u0081\u008e\u008d\u008c\u008b\u008a\u0089\u0088\u0087\u0085\u0084\u0081\u0086\u0085\u0084\u0083\u0083\u0082\u0081", objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            t(127 - View.resolveSize(0, 0), null, null, "\u0085\u008e\u008b\u008f\u0081\u0086\u0085\u0084\u0083\u0088\u008e", objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        this.f20205j = kVar;
        this.f20203f = list;
        this.f20204g = nVar;
        a();
        int i5 = f20201r + 91;
        f20199p = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 49 / 0;
        }
    }

    public final void e(k kVar, n nVar) {
        String strIntern;
        Object obj;
        int i2 = 2 % 2;
        Object obj2 = null;
        if (o.ea.f.a()) {
            int i3 = f20201r + 21;
            f20199p = i3 % 128;
            if (i3 % 2 == 0) {
                Object[] objArr = new Object[1];
                t(28569 % (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), null, null, "\u008e\u008d\u008f\u0089\u0089\u0088\u0081\u0085\u008e\u008b\u008f\u0081\u008e\u008d\u008c\u008b\u008a\u0089\u0088\u0087\u0085\u0084\u0081\u0086\u0085\u0084\u0083\u0083\u0082\u0081", objArr);
                strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                t(TextUtils.indexOf("", "") * 104, null, null, "\u0085\u008e\u008b\u008f\u0081\u0086\u0087\u0093\u0092\u008b\u008a\u0089\u0088\u0087\u0085\u0084\u0081\u0091\u0084\u0087\u008a\u0090\u0088\u008e", objArr2);
                obj = objArr2[0];
            } else {
                Object[] objArr3 = new Object[1];
                t(128 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), null, null, "\u008e\u008d\u008f\u0089\u0089\u0088\u0081\u0085\u008e\u008b\u008f\u0081\u008e\u008d\u008c\u008b\u008a\u0089\u0088\u0087\u0085\u0084\u0081\u0086\u0085\u0084\u0083\u0083\u0082\u0081", objArr3);
                strIntern = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                t(127 - TextUtils.indexOf("", ""), null, null, "\u0085\u008e\u008b\u008f\u0081\u0086\u0087\u0093\u0092\u008b\u008a\u0089\u0088\u0087\u0085\u0084\u0081\u0091\u0084\u0087\u008a\u0090\u0088\u008e", objArr4);
                obj = objArr4[0];
            }
            o.ea.f.c(strIntern, ((String) obj).intern());
        }
        this.f20205j = kVar;
        this.f20203f = null;
        this.f20204g = nVar;
        a();
        int i4 = f20201r + 107;
        f20199p = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }
}
