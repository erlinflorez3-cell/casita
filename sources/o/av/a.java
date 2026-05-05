package o.av;

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
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import o.a.l;
import o.a.m;
import o.ab.e;
import o.ab.j;
import o.cg.b;
import o.cg.f;
import o.ep.h;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends e<c> {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static char[] f20693f = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f20694k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f20695l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f20696m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f20697n = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    List<h> f20698g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    String f20699j;

    /* JADX INFO: renamed from: o.av.a$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f20700a = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final /* synthetic */ int[] f20701d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f20702e = 0;

        static {
            int[] iArr = new int[o.bg.a.values().length];
            f20701d = iArr;
            try {
                iArr[o.bg.a.aA.ordinal()] = 1;
                int i2 = f20702e;
                int i3 = (i2 ^ 11) + (((i2 + 11) - (i2 | 11)) << 1);
                f20700a = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20701d[o.bg.a.aB.ordinal()] = 2;
                int i6 = f20700a;
                int i7 = (i6 ^ 67) + (((-1) - (((-1) - i6) | ((-1) - 67))) << 1);
                f20702e = i7 % 128;
                if (i7 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public interface c {
        void b(List<h> list);

        void e(o.bg.c cVar);
    }

    static final class d extends j<a> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f20703b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f20704c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static int f20705d = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static int f20706f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static long f20707g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static int f20708h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static int f20709i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static int f20710j = 0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static int f20711k = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static int[] f20712l = null;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static char f20713n = 0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static int f20714o = 0;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0013). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$d(int r8, short r9, short r10) {
            /*
                int r0 = r8 * 4
                int r8 = 1 - r0
                int r0 = r9 * 4
                int r7 = 4 - r0
                int r6 = 122 - r10
                byte[] r5 = o.av.a.d.$$a
                byte[] r4 = new byte[r8]
                r3 = 0
                if (r5 != 0) goto L27
                r0 = r7
                r2 = r3
            L13:
                int r7 = r7 + 1
                int r6 = r6 + r0
                r1 = r2
            L17:
                int r2 = r1 + 1
                byte r0 = (byte) r6
                r4[r1] = r0
                if (r2 != r8) goto L24
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                return r0
            L24:
                r0 = r5[r7]
                goto L13
            L27:
                r1 = r3
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: o.av.a.d.$$d(int, short, short):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f20710j = 1224000454;
            f20709i = 1358616395;
            f20708h = 1610072758;
            f20705d = -163122371;
            f20704c = -405411270;
            f20703b = 795077965;
            f20711k = 0;
            f20714o = 1;
            f20707g = 740602047300126166L;
            f20706f = -1715101522;
            f20713n = (char) 17878;
            f20712l = new int[]{118695457, 1250259177, 1857727845, -1828515362, 1552276164, 1314202730, -1552332041, -1117381925, -294862696, -1913693895, -1745755854, -1580701139, 1989833129, -703673269, 1274049334, 1147692472, -75596812, -2030064244};
        }

        d(a aVar) {
            super(aVar, true);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object c(int i2, Object[] objArr, int i3, int i4, int i5, int i6, int i7) {
            int i8 = ~i5;
            int i9 = ((-1) - (((-1) - i6) & ((-1) - i8))) | (~i7);
            int i10 = ~i6;
            int i11 = ~((i8 + i10) - (i8 & i10));
            int i12 = ~(i7 | i8);
            int i13 = (i12 + i11) - (i12 & i11);
            int i14 = i5 + i6 + i2 + ((-92689393) * i3) + (1942122663 * i4);
            int i15 = i14 * i14;
            int i16 = (((-665130586) * i5) - 357761024) + ((-674687396) * i6) + (4778405 * i9) + (i10 * (-4778405)) + ((-4778405) * i13) + ((-669908992) * i2) + ((-1056047104) * i3) + ((-742522880) * i4) + ((-592117760) * i15);
            int i17 = (i5 * 1048061654) + 1366922925 + (i6 * 1048062268) + (i9 * (-307)) + (i10 * 307) + (i13 * 307) + (i2 * 1048061961) + (i3 * 439444615) + (i4 * (-1279783457)) + (i15 * 173867008);
            if (i16 + (i17 * i17 * (-1898250240)) == 1) {
                return e(objArr);
            }
            d dVar = (d) objArr[0];
            int i18 = 2 % 2;
            int i19 = f20711k + 13;
            f20714o = i19 % 128;
            int i20 = i19 % 2;
            ((a) dVar.e()).g().b(((a) dVar.e()).f20698g);
            int i21 = f20711k + 35;
            f20714o = i21 % 128;
            int i22 = i21 % 2;
            return null;
        }

        private static /* synthetic */ Object e(Object[] objArr) {
            int i2 = 2 % 2;
            int i3 = f20714o + 93;
            int i4 = i3 % 128;
            f20711k = i4;
            if (i3 % 2 != 0) {
                throw null;
            }
            int i5 = i4 + 41;
            f20714o = i5 % 128;
            int i6 = i5 % 2;
            return null;
        }

        static void init$0() {
            $$a = new byte[]{44, 115, -31, MessagePack.Code.FLOAT32};
            $$b = 246;
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x001a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void v(char r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, int r26, java.lang.Object[] r27) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 558
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.av.a.d.v(char, java.lang.String, java.lang.String, java.lang.String, int, java.lang.Object[]):void");
        }

        private static void z(int[] iArr, int i2, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            l lVar = new l();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = f20712l;
            int i4 = 989264422;
            long j2 = 0;
            int i5 = 16;
            int i6 = 0;
            if (iArr2 != null) {
                int i7 = $10 + 37;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i9 = 0;
                while (i9 < length) {
                    int i10 = $10 + 13;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i9])};
                        Object objA = o.d.d.a(i4);
                        if (objA == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objA = o.d.d.a((ViewConfiguration.getKeyRepeatDelay() >> i5) + 675, (char) ExpandableListView.getPackedPositionType(j2), 12 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -328001469, false, $$d(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                        }
                        iArr3[i9] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                        i9++;
                        i4 = 989264422;
                        j2 = 0;
                        i5 = 16;
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
            int[] iArr5 = f20712l;
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i12 = $10 + 77;
                $11 = i12 % 128;
                int i13 = i12 % 2;
                int i14 = 0;
                while (i14 < length3) {
                    Object[] objArr3 = {Integer.valueOf(iArr5[i14])};
                    Object objA2 = o.d.d.a(989264422);
                    if (objA2 == null) {
                        byte b4 = (byte) i6;
                        byte b5 = b4;
                        objA2 = o.d.d.a(675 - ExpandableListView.getPackedPositionGroup(0L), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', i6)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 11, -328001469, false, $$d(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE});
                    }
                    iArr6[i14] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                    i14++;
                    int i15 = $10 + 53;
                    $11 = i15 % 128;
                    int i16 = i15 % 2;
                    i6 = 0;
                }
                iArr5 = iArr6;
            }
            System.arraycopy(iArr5, i6, iArr4, i6, length2);
            lVar.f19941d = i6;
            while (lVar.f19941d < iArr.length) {
                cArr[i6] = (char) (iArr[lVar.f19941d] >> 16);
                cArr[1] = (char) iArr[lVar.f19941d];
                cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
                cArr[3] = (char) iArr[lVar.f19941d + 1];
                lVar.f19942e = (cArr[0] << 16) + cArr[1];
                lVar.f19940a = (cArr[2] << 16) + cArr[3];
                l.a(iArr4);
                int i17 = 0;
                for (int i18 = 16; i17 < i18; i18 = 16) {
                    lVar.f19942e ^= iArr4[i17];
                    Object[] objArr4 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                    Object objA3 = o.d.d.a(2098218801);
                    if (objA3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objA3 = o.d.d.a(301 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (View.resolveSize(0, 0) + 52697), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 11, -1416256172, false, $$d(b6, b7, (byte) (b7 + 3)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                    lVar.f19942e = lVar.f19940a;
                    lVar.f19940a = iIntValue;
                    i17++;
                }
                int i19 = lVar.f19942e;
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = i19;
                lVar.f19940a ^= iArr4[16];
                lVar.f19942e ^= iArr4[17];
                int i20 = lVar.f19942e;
                int i21 = lVar.f19940a;
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
                Object objA4 = o.d.d.a(986820978);
                if (objA4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objA4 = o.d.d.a(229 - Color.alpha(0), (char) (51004 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), Color.red(0) + 9, -330018025, false, $$d(b8, b9, (byte) (b9 + 5)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
                i6 = 0;
            }
            objArr[0] = new String(cArr2, 0, i2);
        }

        @Override // o.ab.j
        public final f a(Context context) throws Throwable {
            int i2 = 2 % 2;
            Object[] objArr = new Object[1];
            z(new int[]{-1191396560, 1221201890, 1051469944, -59111751, 87263674, 1136592246, -588516903, 1653790709, -1474204116, -178004538}, 18 - Process.getGidForName(""), objArr);
            b bVar = new b(context, 37, ((String) objArr[0]).intern());
            int i3 = f20714o + 85;
            f20711k = i3 % 128;
            int i4 = i3 % 2;
            return bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j
        public final void a(o.ef.a aVar) throws Throwable {
            int i2 = 2 % 2;
            int i3 = 0;
            long j2 = 0;
            int i4 = 1;
            Object[] objArr = new Object[1];
            v((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 46816), "쥲숤ൠ攤뿬삐꺪葎飯洙徖⾐藭젚\uf1b5䒣쮷喉", "\u0000\u0000\u0000\u0000", "列㑪\udfa8鎶", View.MeasureSpec.getMode(0), objArr);
            o.ef.c cVarT = aVar.t(((String) objArr[0]).intern());
            ArrayList arrayList = new ArrayList();
            if (cVarT != null) {
                int i5 = f20711k + 99;
                f20714o = i5 % 128;
                int i6 = i5 % 2;
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int i7 = 1567746851;
                int i8 = o.ef.c.f23799b * 1567746851;
                o.ef.c.f23799b = i8;
                int i9 = o.ef.c.f23798a * 1136425123;
                o.ef.c.f23798a = i9;
                int i10 = -1513293186;
                if (((Integer) o.ef.c.b((int) Runtime.getRuntime().maxMemory(), i9, i8, -1513293186, elapsedCpuTime, 1513293186, new Object[]{cVarT})).intValue() > 0) {
                    int i11 = f20714o + 29;
                    f20711k = i11 % 128;
                    int i12 = i11 % 2;
                    int i13 = 0;
                    while (true) {
                        int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
                        int i14 = o.ef.c.f23799b * i7;
                        o.ef.c.f23799b = i14;
                        int i15 = o.ef.c.f23798a * 1136425123;
                        o.ef.c.f23798a = i15;
                        if (i13 >= ((Integer) o.ef.c.b((int) Runtime.getRuntime().maxMemory(), i15, i14, i10, elapsedCpuTime2, 1513293186, new Object[]{cVarT})).intValue()) {
                            break;
                        }
                        o.ef.a aVarD = cVarT.d(i13);
                        Object[] objArr2 = new Object[i4];
                        v((char) (27910 - (Process.myTid() >> 22)), "墐콢", "\u0000\u0000\u0000\u0000", "첬ࠋڻ煭", View.getDefaultSize(i3, i3), objArr2);
                        Object[] objArr3 = {aVarD, ((String) objArr2[i3]).intern()};
                        int i16 = o.ef.a.f23782p * (-1576737484);
                        o.ef.a.f23782p = i16;
                        String str = (String) o.ef.a.a(-781664457, objArr3, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i16, Thread.currentThread().getPriority());
                        Object[] objArr4 = new Object[i4];
                        z(new int[]{1752905108, -2025796537, 1342709025, 212720742}, (SystemClock.elapsedRealtimeNanos() > j2 ? 1 : (SystemClock.elapsedRealtimeNanos() == j2 ? 0 : -1)) + 5, objArr4);
                        h.e eVar = (h.e) aVarD.e(h.e.class, ((String) objArr4[i3]).intern());
                        Object[] objArr5 = new Object[i4];
                        z(new int[]{-1500470365, 1839123959, -513582026, -1740082681, -48224247, 728977303, -945069387, -881854946}, View.MeasureSpec.getSize(i3) + 13, objArr5);
                        Object[] objArr6 = {aVarD, ((String) objArr5[i3]).intern()};
                        int i17 = o.ef.a.f23782p * (-1576737484);
                        o.ef.a.f23782p = i17;
                        String str2 = (String) o.ef.a.a(-781664457, objArr6, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i17, Thread.currentThread().getPriority());
                        Object[] objArr7 = new Object[i4];
                        v((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 4861), "見㢧ꖯ", "\u0000\u0000\u0000\u0000", "빣籿\ufdd8\ue112", (SystemClock.elapsedRealtimeNanos() > j2 ? 1 : (SystemClock.elapsedRealtimeNanos() == j2 ? 0 : -1)) - 662929475, objArr7);
                        Object[] objArr8 = {aVarD, ((String) objArr7[i3]).intern()};
                        int i18 = o.ef.a.f23782p * (-1576737484);
                        o.ef.a.f23782p = i18;
                        String str3 = (String) o.ef.a.a(-781664457, objArr8, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i18, Thread.currentThread().getPriority());
                        Object[] objArr9 = new Object[i4];
                        v((char) (Process.myPid() >> 22), "柖鷗䟟㲷㾓‸䝣浘⠓\ue71f", "\u0000\u0000\u0000\u0000", "鍖䓋浣豰", Color.alpha(i3), objArr9);
                        Object[] objArr10 = {aVarD, ((String) objArr9[i3]).intern()};
                        int i19 = o.ef.a.f23782p * (-1576737484);
                        o.ef.a.f23782p = i19;
                        String str4 = (String) o.ef.a.a(-781664457, objArr10, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i19, Thread.currentThread().getPriority());
                        Object[] objArr11 = new Object[i4];
                        z(new int[]{1175109082, 1692010548, 1823414115, 676937247, -1248208669, -448670685}, 9 - TextUtils.lastIndexOf("", '0', i3, i3), objArr11);
                        Object[] objArr12 = {aVarD, ((String) objArr11[i3]).intern()};
                        int i20 = o.ef.a.f23782p * (-1576737484);
                        o.ef.a.f23782p = i20;
                        String str5 = (String) o.ef.a.a(-781664457, objArr12, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i20, Thread.currentThread().getPriority());
                        Object[] objArr13 = new Object[i4];
                        z(new int[]{1982947715, 633763552, -1295923246, -1176363397}, (ViewConfiguration.getTapTimeout() >> 16) + 6, objArr13);
                        Object[] objArr14 = {aVarD, ((String) objArr13[0]).intern()};
                        int i21 = o.ef.a.f23782p * (-1576737484);
                        o.ef.a.f23782p = i21;
                        String str6 = (String) o.ef.a.a(-781664457, objArr14, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i21, Thread.currentThread().getPriority());
                        Object[] objArr15 = new Object[1];
                        z(new int[]{-239799924, -30028246}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 3, objArr15);
                        Object[] objArr16 = {aVarD, ((String) objArr15[0]).intern()};
                        int i22 = o.ef.a.f23782p * (-1576737484);
                        o.ef.a.f23782p = i22;
                        String str7 = (String) o.ef.a.a(-781664457, objArr16, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i22, Thread.currentThread().getPriority());
                        j2 = 0;
                        Object[] objArr17 = new Object[1];
                        z(new int[]{-2108134891, 943292218, -1468345699, -570925656, 1427593796, -1743198014}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 11, objArr17);
                        Date dateE = aVarD.e(((String) objArr17[0]).intern(), false);
                        Object[] objArr18 = new Object[1];
                        v((char) ((ViewConfiguration.getTapTimeout() >> 16) + 56125), "ﬄ皾꼋\ue0f5\uf4eb\ud8d2䉯䦵殂䎱头ⓔ綋藎ヿ㫩썪", "\u0000\u0000\u0000\u0000", "ꉁ겛㷊\ue7db", (-894657630) - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr18);
                        Integer numG = aVarD.g(((String) objArr18[0]).intern());
                        Object[] objArr19 = new Object[1];
                        v((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 5887), "ʹ簑鰄ḙඎ\ue9b3\udc02☖渏\u0febꪽ팪邞㾆\u1ae7", "\u0000\u0000\u0000\u0000", "ﺪ๒￥밖", (-452046082) - KeyEvent.keyCodeFromString(""), objArr19);
                        Date dateE2 = aVarD.e(((String) objArr19[0]).intern(), false);
                        GregorianCalendar gregorianCalendar = new GregorianCalendar();
                        int i23 = Integer.parseInt(str5.substring(0, 2));
                        int i24 = Integer.parseInt(str5.substring(2, 4));
                        gregorianCalendar.set(1, i23 + 2000);
                        gregorianCalendar.set(2, i24);
                        gregorianCalendar.set(5, 0);
                        gregorianCalendar.set(11, 0);
                        gregorianCalendar.set(12, 0);
                        gregorianCalendar.set(13, 0);
                        gregorianCalendar.set(14, 0);
                        gregorianCalendar.roll(11, false);
                        gregorianCalendar.roll(12, false);
                        gregorianCalendar.roll(13, false);
                        gregorianCalendar.roll(14, false);
                        Date time = gregorianCalendar.getTime();
                        if (dateE2 == null || dateE2.getTime() >= time.getTime()) {
                            i3 = 0;
                            dateE2 = time;
                        } else {
                            int i25 = f20711k + 57;
                            f20714o = i25 % 128;
                            if (i25 % 2 == 0) {
                                i3 = 0;
                                int i26 = 93 / 0;
                            } else {
                                i3 = 0;
                            }
                        }
                        arrayList.add(new h(str, eVar, str2, str3, str4, dateE2, str6, str7, dateE, numG));
                        i13++;
                        i4 = 1;
                        i10 = -1513293186;
                        i7 = 1567746851;
                    }
                }
            }
            ((a) e()).f20698g = arrayList;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
        
            if (r6 != 5002) goto L7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
        
            return o.bg.a.aB;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
        
            if (r6 != 5002) goto L7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
        
            r2 = super.b(r6);
            r1 = o.av.a.d.f20711k + 31;
            o.av.a.d.f20714o = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
        
            return r2;
         */
        @Override // o.ab.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final o.bg.a b(int r6) {
            /*
                r5 = this;
                r4 = 2
                int r0 = r4 % r4
                int r0 = o.av.a.d.f20711k
                int r3 = r0 + 59
                int r0 = r3 % 128
                o.av.a.d.f20714o = r0
                int r3 = r3 % r4
                r2 = 5002(0x138a, float:7.009E-42)
                r1 = 5001(0x1389, float:7.008E-42)
                if (r3 != 0) goto L28
                r0 = 73
                int r0 = r0 / 0
                if (r6 == r1) goto L30
                if (r6 == r2) goto L2d
            L1a:
                o.bg.a r2 = super.b(r6)
                int r0 = o.av.a.d.f20711k
                int r1 = r0 + 31
                int r0 = r1 % 128
                o.av.a.d.f20714o = r0
                int r1 = r1 % r4
                return r2
            L28:
                if (r6 == r1) goto L30
                if (r6 == r2) goto L2d
                goto L1a
            L2d:
                o.bg.a r0 = o.bg.a.aB
                return r0
            L30:
                o.bg.a r0 = o.bg.a.aA
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.av.a.d.b(int):o.bg.a");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.c
        public final void b(o.bg.c cVar) {
            int i2 = 2 % 2;
            int i3 = f20711k + 65;
            f20714o = i3 % 128;
            if (i3 % 2 != 0) {
                ((a) e()).g().e(cVar);
                return;
            }
            ((a) e()).g().e(cVar);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.ab.c
        public final void c(o.bg.c cVar) {
            int i2 = f20703b * (-1790741470);
            f20703b = i2;
            int i3 = 474915397 * f20704c;
            f20704c = i3;
            int i4 = (-1982438807) * f20705d;
            f20705d = i4;
            c(i3, new Object[]{this, cVar}, i4, (int) SystemClock.uptimeMillis(), 303814052, -303814052, i2);
        }

        @Override // o.ab.j
        public final o.cg.j k() {
            int i2 = f20708h * 2027830927;
            f20708h = i2;
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i3 = f20709i * (-1250165027);
            f20709i = i3;
            int i4 = f20710j * 300335303;
            f20710j = i4;
            return (o.cg.j) c(iUptimeMillis, new Object[]{this}, i3, i4, -1521603632, 1521603633, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j
        public final o.ef.a m() throws Throwable {
            int i2 = 2 % 2;
            o.ef.a aVar = new o.ef.a();
            Object[] objArr = new Object[1];
            v((char) (55643 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), "蟪궴쾙憇䔈郬", "\u0000\u0000\u0000\u0000", "ᯝ䲮宛㣙", (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr);
            aVar.a(((String) objArr[0]).intern(), (Object) ((a) e()).f20699j);
            int i3 = f20711k + 93;
            f20714o = i3 % 128;
            if (i3 % 2 != 0) {
                return aVar;
            }
            throw null;
        }

        @Override // o.ab.j
        public final String o() throws Throwable {
            int i2 = 2 % 2;
            int i3 = f20711k + 77;
            f20714o = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            v((char) ((Process.getThreadPriority(0) + 20) >> 6), "㋙ߺ\uf705뇴\ue27c诲渭ￖ偖粊\ue566", "\u0000\u0000\u0000\u0000", "\u1affᮐ컆溵", TextUtils.lastIndexOf("", '0', 0) - 971272165, objArr);
            String strIntern = ((String) objArr[0]).intern();
            int i5 = f20714o + 29;
            f20711k = i5 % 128;
            int i6 = i5 % 2;
            return strIntern;
        }

        @Override // o.ab.j
        public final byte[][] p() {
            int i2 = 2 % 2;
            int i3 = f20714o + 11;
            int i4 = i3 % 128;
            f20711k = i4;
            Object obj = null;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = i4 + 79;
            f20714o = i5 % 128;
            int i6 = i5 % 2;
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j
        public final void s() throws Throwable {
            int i2 = 2 % 2;
            int i3 = f20711k + 75;
            f20714o = i3 % 128;
            int i4 = i3 % 2;
            int i5 = AnonymousClass5.f20701d[f().c().ordinal()];
            if (i5 == 1) {
                j().c(h(), ((a) e()).f20699j);
                return;
            }
            if (i5 != 2) {
                super.s();
                return;
            }
            j().d(h(), ((a) e()).f20699j);
            int i6 = f20711k + 39;
            f20714o = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$j(byte r9, int r10, short r11) {
        /*
            int r0 = r11 * 4
            int r8 = r0 + 116
            byte[] r7 = o.av.a.$$d
            int r0 = r9 * 4
            int r6 = 4 - r0
            int r0 = r10 * 4
            int r5 = r0 + 1
            byte[] r4 = new byte[r5]
            r3 = 0
            if (r7 != 0) goto L2d
            r2 = r8
            r1 = r3
            r0 = r6
        L16:
            int r6 = r6 + r2
            int r0 = r0 + 1
            r8 = r6
            r6 = r0
        L1b:
            byte r0 = (byte) r8
            r4[r1] = r0
            int r1 = r1 + 1
            if (r1 != r5) goto L28
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L28:
            r2 = r7[r6]
            r0 = r6
            r6 = r8
            goto L16
        L2d:
            r1 = r3
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: o.av.a.$$j(byte, int, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f20695l = 0;
        f20694k = 1;
        f20696m = 0;
        f20697n = 1;
        n();
        int i2 = f20694k + 67;
        f20695l = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public a(Context context, c cVar, o.en.b bVar) {
        super(context, cVar, bVar, o.bg.e.f21118p);
    }

    static void init$0() {
        $$d = new byte[]{Ascii.CR, Ascii.ESC, 39, 17};
        $$e = 179;
    }

    static void n() {
        f20693f = new char[]{56506, 56539, 56530, 56553, 56555, 56541, 56540, 56552, 56560, 56539, 56537, 56558, 56557, 56551, 56551, 56553, 56533, 56534, 56541, 56391, 56391, 56412, 56709, 56707, 56444, 56411, 56384, 56384, 56419, 56714, 56706, 56438, 56439, 56709, 56707, 56428, 56437, 56710, 56432, 56437, 56707, 56559, 56414, 56420, 56403, 56394, 56417, 56419, 56405, 56404, 56416, 56424};
    }

    private d o() {
        int i2 = 2 % 2;
        d dVar = new d(this);
        int i3 = f20696m + 99;
        f20697n = i3 % 128;
        if (i3 % 2 != 0) {
            return dVar;
        }
        throw null;
    }

    private static void q(String str, int[] iArr, boolean z2, Object[] objArr) throws Throwable {
        int length;
        char[] cArr;
        String str2 = str;
        int i2 = 2;
        int i3 = 2 % 2;
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        m mVar = new m();
        int i4 = 0;
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr2 = f20693f;
        float f2 = 0.0f;
        if (cArr2 != null) {
            int i9 = $11 + 61;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            int i10 = 0;
            while (i10 < length) {
                int i11 = $11 + 27;
                $10 = i11 % 128;
                if (i11 % i2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i10])};
                        Object objA = o.d.d.a(-2071388435);
                        if (objA == null) {
                            byte b2 = (byte) i4;
                            byte b3 = b2;
                            objA = o.d.d.a(249 - TextUtils.indexOf("", "", i4), (char) (AudioTrack.getMinVolume() > f2 ? 1 : (AudioTrack.getMinVolume() == f2 ? 0 : -1)), (ViewConfiguration.getTapTimeout() >> 16) + 11, 1376582792, false, $$j(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        cArr[i10] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i10])};
                    Object objA2 = o.d.d.a(-2071388435);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = o.d.d.a(250 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) View.resolveSize(0, 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 11, 1376582792, false, $$j(b4, b5, b5), new Class[]{Integer.TYPE});
                    }
                    cArr[i10] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i10++;
                }
                i2 = 2;
                i4 = 0;
                f2 = 0.0f;
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i6];
        System.arraycopy(cArr2, i5, cArr3, 0, i6);
        if (bArr != null) {
            char[] cArr4 = new char[i6];
            mVar.f19943d = 0;
            char c2 = 0;
            while (mVar.f19943d < i6) {
                if (bArr[mVar.f19943d] == 1) {
                    int i12 = mVar.f19943d;
                    Object[] objArr4 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA3 = o.d.d.a(120026474);
                    if (objA3 == null) {
                        objA3 = o.d.d.a(View.MeasureSpec.getMode(0) + 11, (char) TextUtils.getOffsetBefore("", 0), AndroidCharacter.getMirror('0') - '&', -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
                    int i13 = $10 + 117;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                } else {
                    int i15 = mVar.f19943d;
                    Object[] objArr5 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA4 = o.d.d.a(1632715197);
                    if (objA4 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objA4 = o.d.d.a((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 835, (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 27279), View.MeasureSpec.getSize(0) + 11, -1210801192, false, $$j(b6, b7, (byte) (b7 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i15] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                }
                c2 = cArr4[mVar.f19943d];
                Object[] objArr6 = {mVar, mVar};
                Object objA5 = o.d.d.a(-1041906996);
                if (objA5 == null) {
                    objA5 = o.d.d.a((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 22, (char) (Color.blue(0) + 35715), View.combineMeasuredStates(0, 0) + 11, 392175785, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objA5).invoke(null, objArr6);
            }
            int i16 = $11 + 101;
            $10 = i16 % 128;
            int i17 = i16 % 2;
            cArr3 = cArr4;
        }
        if (i8 > 0) {
            char[] cArr5 = new char[i6];
            System.arraycopy(cArr3, 0, cArr5, 0, i6);
            int i18 = i6 - i8;
            System.arraycopy(cArr5, 0, cArr3, i18, i8);
            System.arraycopy(cArr5, i8, cArr3, 0, i18);
        }
        if (z2) {
            int i19 = $11 + 65;
            $10 = i19 % 128;
            int i20 = i19 % 2;
            char[] cArr6 = new char[i6];
            int i21 = 0;
            while (true) {
                mVar.f19943d = i21;
                if (mVar.f19943d >= i6) {
                    break;
                }
                cArr6[mVar.f19943d] = cArr3[(i6 - mVar.f19943d) - 1];
                i21 = mVar.f19943d + 1;
            }
            cArr3 = cArr6;
        }
        if (i7 > 0) {
            int i22 = 0;
            while (true) {
                mVar.f19943d = i22;
                if (mVar.f19943d >= i6) {
                    break;
                }
                cArr3[mVar.f19943d] = (char) (cArr3[mVar.f19943d] - iArr[2]);
                i22 = mVar.f19943d + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    public final void b(String str) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f20697n + 79;
        f20696m = i3 % 128;
        int i4 = i3 % 2;
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            q("\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000", new int[]{0, 18, 0, 16}, false, objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            q("\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001", new int[]{18, 23, 154, 0}, true, objArr2);
            o.ea.f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(str).toString());
            int i5 = f20697n + 3;
            f20696m = i5 % 128;
            int i6 = i5 % 2;
        }
        this.f20699j = str;
        a();
    }

    @Override // o.ab.e
    public final /* synthetic */ o.ab.c c() {
        int i2 = 2 % 2;
        int i3 = f20697n + 91;
        f20696m = i3 % 128;
        int i4 = i3 % 2;
        d dVarO = o();
        int i5 = f20696m + 33;
        f20697n = i5 % 128;
        int i6 = i5 % 2;
        return dVarO;
    }

    @Override // o.ab.e
    public final String e() throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        int i3 = f20696m + 83;
        f20697n = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = new Object[1];
            q("\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000", new int[]{0, 18, 0, 16}, false, objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            q("\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000", new int[]{0, 18, 0, 16}, false, objArr2);
            obj = objArr2[0];
        }
        return ((String) obj).intern();
    }
}
