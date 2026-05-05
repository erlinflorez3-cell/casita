package o.aj;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import com.drew.metadata.iptc.IptcDirectory;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import o.a.h;
import o.a.l;
import o.ab.j;
import o.bg.a;
import o.cg.f;
import o.d.d;
import o.ep.i;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends o.ab.e<e> {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: f */
    private static char[] f20264f = null;

    /* JADX INFO: renamed from: k */
    private static char f20265k = 0;

    /* JADX INFO: renamed from: l */
    private static int f20266l = 0;

    /* JADX INFO: renamed from: m */
    private static int f20267m = 0;

    /* JADX INFO: renamed from: n */
    private static int f20268n = 0;

    /* JADX INFO: renamed from: o */
    private static int f20269o = 0;

    /* JADX INFO: renamed from: g */
    List<i> f20270g;

    /* JADX INFO: renamed from: j */
    String f20271j;

    /* JADX INFO: renamed from: o.aj.b$2 */
    static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: a */
        private static int f20272a = 0;

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f20273b;

        /* JADX INFO: renamed from: e */
        private static int f20274e = 1;

        static {
            int[] iArr = new int[a.values().length];
            f20273b = iArr;
            try {
                iArr[a.aA.ordinal()] = 1;
                int i2 = f20274e + 63;
                f20272a = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20273b[a.aB.ordinal()] = 2;
                int i5 = f20274e;
                int i6 = (i5 ^ 55) + ((i5 & 55) << 1);
                f20272a = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 71 / 0;
                }
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static final class c extends j<b> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: b */
        private static int[] f20275b = null;

        /* JADX INFO: renamed from: c */
        public static int f20276c = 0;

        /* JADX INFO: renamed from: d */
        public static int f20277d = 0;

        /* JADX INFO: renamed from: f */
        private static char f20278f = 0;

        /* JADX INFO: renamed from: g */
        private static int f20279g = 0;

        /* JADX INFO: renamed from: h */
        private static int f20280h = 0;

        /* JADX INFO: renamed from: i */
        private static long f20281i = 0;

        /* JADX INFO: renamed from: j */
        private static int f20282j = 0;

        /* JADX WARN: Removed duplicated region for block: B:20:0x001e  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0024 -> B:17:0x0012). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$d(short r7, int r8, short r9) {
            /*
                int r0 = r8 + 4
                byte[] r8 = o.aj.b.c.$$a
                int r7 = 122 - r7
                int r1 = r9 * 2
                int r6 = r1 + 1
                byte[] r5 = new byte[r6]
                r4 = 0
                if (r8 != 0) goto L27
                r1 = r0
                r7 = r6
                r3 = r4
            L12:
                int r7 = r7 + r0
                r0 = r1
                r2 = r3
            L15:
                int r1 = r0 + 1
                byte r0 = (byte) r7
                int r3 = r2 + 1
                r5[r2] = r0
                if (r3 != r6) goto L24
                java.lang.String r0 = new java.lang.String
                r0.<init>(r5, r4)
                return r0
            L24:
                r0 = r8[r1]
                goto L12
            L27:
                r2 = r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: o.aj.b.c.$$d(short, int, short):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f20277d = -1418402983;
            f20276c = 1871443620;
            f20280h = 0;
            f20279g = 1;
            f20275b = new int[]{-1877531122, 78109071, -1295144947, 148474241, 879324580, 1018561829, -1816639771, -1080061462, 838871399, -995083054, 553453991, -37973538, 1789062969, -1469737091, -1489450278, 250789094, 821235908, -638655201};
            f20281i = 2000029007568254119L;
            f20282j = 1564493270;
            f20278f = (char) 17878;
        }

        c(b bVar) {
            super(bVar, true);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object d(int i2, int i3, int i4, Object[] objArr, int i5, int i6, int i7) throws Throwable {
            int i8 = ~i6;
            int i9 = i5 | i8;
            int i10 = ~i4;
            int i11 = ~((~i5) | i8);
            int i12 = i6 + i4 + i2 + (1977613057 * i3) + (454551927 * i7);
            int i13 = i12 * i12;
            int i14 = (1378041352 * i6) + 473956352 + (953991674 * i4) + (212024839 * i9) + (i10 * (-212024839)) + ((-212024839) * i11) + (1166016512 * i2) + ((-981467136) * i3) + ((-830472192) * i7) + ((-499122176) * i13);
            int i15 = (i6 * (-1131120504)) + 246467939 + (i4 * (-1131119078)) + (i9 * (-713)) + (i10 * IptcDirectory.TAG_OBJECT_PREVIEW_FILE_FORMAT_VERSION) + (i11 * IptcDirectory.TAG_OBJECT_PREVIEW_FILE_FORMAT_VERSION) + ((-1131119791) * i2) + ((-1039407535) * i3) + (1820920743 * i7) + (i13 * 1447034880);
            if (i14 + (i15 * i15 * 1170210816) == 1) {
                return e(objArr);
            }
            c cVar = (c) objArr[0];
            o.ef.a aVar = (o.ef.a) objArr[1];
            int i16 = 2 % 2;
            Object[] objArr2 = new Object[1];
            z((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 43215), "\ue5f5\ufbcd排썹繢쐉", "煱痕ꉪᆆ", "鍰﹇켘殨", ViewConfiguration.getMaximumFlingVelocity() >> 16, objArr2);
            o.ef.c cVarT = aVar.t(((String) objArr2[0]).intern());
            ArrayList arrayList = new ArrayList();
            if (cVarT != null) {
                int i17 = f20280h + 23;
                f20279g = i17 % 128;
                int i18 = i17 % 2;
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int i19 = 1567746851;
                int i20 = o.ef.c.f23799b * 1567746851;
                o.ef.c.f23799b = i20;
                int i21 = 1136425123;
                int i22 = o.ef.c.f23798a * 1136425123;
                o.ef.c.f23798a = i22;
                int i23 = -1513293186;
                int i24 = 1513293186;
                if (((Integer) o.ef.c.b((int) Runtime.getRuntime().maxMemory(), i22, i20, -1513293186, elapsedCpuTime, 1513293186, new Object[]{cVarT})).intValue() > 0) {
                    int i25 = f20279g + 37;
                    f20280h = i25 % 128;
                    if (i25 % 2 != 0) {
                        int i26 = 3 % 5;
                    }
                    int i27 = 0;
                    while (true) {
                        int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
                        int i28 = o.ef.c.f23799b * i19;
                        o.ef.c.f23799b = i28;
                        int i29 = o.ef.c.f23798a * i21;
                        o.ef.c.f23798a = i29;
                        if (i27 >= ((Integer) o.ef.c.b((int) Runtime.getRuntime().maxMemory(), i29, i28, i23, elapsedCpuTime2, i24, new Object[]{cVarT})).intValue()) {
                            break;
                        }
                        o.ef.a aVarD = cVarT.d(i27);
                        Object[] objArr3 = new Object[1];
                        v(new int[]{519138210, 891065899}, 3 - (ViewConfiguration.getTouchSlop() >> 8), objArr3);
                        i.a aVar2 = (i.a) aVarD.e(i.a.class, ((String) objArr3[0]).intern());
                        Object[] objArr4 = new Object[1];
                        z((char) Color.green(0), "絯⎬∩쁐㣒胿⠑閜掚\u1f5a", "煱痕ꉪᆆ", "䎭、费㗦", View.getDefaultSize(0, 0), objArr4);
                        Object[] objArr5 = {aVarD, ((String) objArr4[0]).intern()};
                        int i30 = o.ef.a.f23782p * (-1576737484);
                        o.ef.a.f23782p = i30;
                        String str = (String) o.ef.a.a(-781664457, objArr5, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i30, Thread.currentThread().getPriority());
                        Object[] objArr6 = new Object[1];
                        z((char) (Process.myTid() >> 22), "ͯ쀐삺供豯⩎䞉\ua62fޢḢ\ue0b8쇟Ὧ恴璍ᶁ蛪폍\uf6fc\ue1af䣓쑞", "煱痕ꉪᆆ", "쁒볰界獪", ViewConfiguration.getJumpTapTimeout() >> 16, objArr6);
                        String strS = aVarD.s(((String) objArr6[0]).intern());
                        Object[] objArr7 = new Object[1];
                        z((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), "强闋㑐녯췦廣넂\ue9dd漥", "煱痕ꉪᆆ", "\u0bc3捒\uf45f㊃", 1600344587 + Color.argb(0, 0, 0, 0), objArr7);
                        String strS2 = aVarD.s(((String) objArr7[0]).intern());
                        Object[] objArr8 = new Object[1];
                        z((char) (34889 - Gravity.getAbsoluteGravity(0, 0)), "踌젝緤\ue242ꡛ\uf013⫱\uf271ꝣ嚋ꞌ녒楃龸鈄䝛䟢홱\u09d9", "煱痕ꉪᆆ", "㠦쟺䧬좈", (ViewConfiguration.getTapTimeout() >> 16) - 322438600, objArr8);
                        Object[] objArr9 = {aVarD, ((String) objArr8[0]).intern()};
                        int i31 = o.ef.a.f23782p * (-1576737484);
                        o.ef.a.f23782p = i31;
                        String str2 = (String) o.ef.a.a(-781664457, objArr9, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i31, Thread.currentThread().getPriority());
                        Object[] objArr10 = new Object[1];
                        v(new int[]{379655856, -772311693, 1632982152, 842644102, 2083629678, -2104803994, 1323966796, 520366762, -682589995, 1837245381}, TextUtils.getOffsetBefore("", 0) + 18, objArr10);
                        String strS3 = aVarD.s(((String) objArr10[0]).intern());
                        Object[] objArr11 = new Object[1];
                        z((char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), "឵㼀碢䵹❠⌍蛴먺䬱䰺갪쭰\ue01b⢫\ue1fa鋋瘟룑\uefc2ᴋ鴍", "煱痕ꉪᆆ", "\ue2eb⼤\ue30f힌", 254747873 - TextUtils.lastIndexOf("", '0', 0, 0), objArr11);
                        String strS4 = aVarD.s(((String) objArr11[0]).intern());
                        o.dx.c cVar2 = strS4 != null ? new o.dx.c(strS4) : null;
                        Object[] objArr12 = new Object[1];
                        z((char) (62228 - (KeyEvent.getMaxKeyCode() >> 16)), "ᤒ놁蝯࣪㩾紋롡ᚻ鈬쁏ٖमᦐ⾐\ued06甂;\uf244", "煱痕ꉪᆆ", "ᄱ㔞ᒓ௳", View.MeasureSpec.getSize(0), objArr12);
                        i.c cVar3 = (i.c) ((Enum) o.ef.a.a(-303551916, new Object[]{aVarD, i.c.class, ((String) objArr12[0]).intern()}, Process.myPid(), Process.myUid(), 303551919, (int) Thread.currentThread().getId(), (int) SystemClock.elapsedRealtime()));
                        Object[] objArr13 = new Object[1];
                        z((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 51901), "舙\ue6b5\uf23f筠", "煱痕ꉪᆆ", "䘩ᤤ븞\ue8ca", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1, objArr13);
                        i.d dVar = (i.d) ((Enum) o.ef.a.a(-303551916, new Object[]{aVarD, i.d.class, ((String) objArr13[0]).intern()}, Process.myPid(), Process.myUid(), 303551919, (int) Thread.currentThread().getId(), (int) SystemClock.elapsedRealtime()));
                        Object[] objArr14 = new Object[1];
                        z((char) (ExpandableListView.getPackedPositionType(0L) + 39777), "鵠孝嶡\ue7bd熻\u20c3", "煱痕ꉪᆆ", "븪韭憼ᖛ", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1, objArr14);
                        i.b bVar = (i.b) aVarD.b(i.b.class, ((String) objArr14[0]).intern(), i.b.f24652a);
                        Object[] objArr15 = new Object[1];
                        z((char) (ExpandableListView.getPackedPositionGroup(0L) + 3555), "\ue439頧崥씢\ua87f댯\uea16砱㮸腘檮꽛羶\u20ca", "煱痕ꉪᆆ", "⌳ប\ue322\uf10d", TextUtils.getOffsetAfter("", 0), objArr15);
                        Long lK = aVarD.k(((String) objArr15[0]).intern());
                        Object[] objArr16 = new Object[1];
                        v(new int[]{-1121167323, 830504298, 644629791, 687869373, -682589995, 1837245381}, (-16777206) - Color.rgb(0, 0, 0), objArr16);
                        String strS5 = aVarD.s(((String) objArr16[0]).intern());
                        Object[] objArr17 = new Object[1];
                        z((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), "裏올몀媙껠潺Ẻ\ue4b9", "煱痕ꉪᆆ", "댾\uf0f6飘鸠", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, objArr17);
                        Object[] objArr18 = {aVarD, ((String) objArr17[0]).intern()};
                        int i32 = o.ef.a.f23782p * (-1576737484);
                        o.ef.a.f23782p = i32;
                        arrayList.add(new i(aVar2, str, strS, strS2, str2, strS3, cVar2, cVar3, dVar, bVar, lK, strS5, (String) o.ef.a.a(-781664457, objArr18, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i32, Thread.currentThread().getPriority())));
                        i27++;
                        i19 = 1567746851;
                        i21 = 1136425123;
                        i23 = -1513293186;
                        i24 = 1513293186;
                    }
                }
            }
            ((b) cVar.e()).f20270g = arrayList;
            int i33 = f20280h + 77;
            f20279g = i33 % 128;
            int i34 = i33 % 2;
            return null;
        }

        private static o.cg.b d(Context context) throws Throwable {
            int i2 = 2 % 2;
            Object[] objArr = new Object[1];
            v(new int[]{-1102615473, 1280476101, -1147182467, -1877706556, 22553658, 1767335087, 1437323902, -1688209285, 822532333, 203965166}, (ViewConfiguration.getWindowTouchSlop() >> 8) + 19, objArr);
            o.cg.b bVar = new o.cg.b(context, 33, ((String) objArr[0]).intern());
            int i3 = f20280h + 123;
            f20279g = i3 % 128;
            int i4 = i3 % 2;
            return bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0041 A[EXC_TOP_SPLITTER, PHI: r3
  0x0041: PHI (r3v2 o.ep.i) = (r3v1 o.ep.i), (r3v5 o.ep.i) binds: [B:39:0x0032, B:42:0x003f] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static /* synthetic */ java.lang.Object e(java.lang.Object[] r9) throws java.lang.Throwable {
            /*
                r8 = 0
                r5 = r9[r8]
                o.aj.b$c r5 = (o.aj.b.c) r5
                r7 = 2
                int r0 = r7 % r7
                o.ab.e r0 = r5.e()
                o.aj.b r0 = (o.aj.b) r0
                java.util.List<o.ep.i> r0 = r0.f20270g
                java.util.Iterator r6 = r0.iterator()
            L14:
                boolean r0 = r6.hasNext()
                if (r0 == 0) goto L86
                int r0 = o.aj.b.c.f20280h
                int r1 = r0 + 99
                int r0 = r1 % 128
                o.aj.b.c.f20279g = r0
                int r1 = r1 % r7
                if (r1 != 0) goto L35
                java.lang.Object r3 = r6.next()
                o.ep.i r3 = (o.ep.i) r3
                o.dx.c r1 = r3.i()
                r0 = 96
                int r0 = r0 / r8
                if (r1 == 0) goto L14
                goto L41
            L35:
                java.lang.Object r3 = r6.next()
                o.ep.i r3 = (o.ep.i) r3
                o.dx.c r0 = r3.i()
                if (r0 == 0) goto L14
            L41:
                o.dx.e r2 = o.dx.e.e()     // Catch: o.dx.a -> L51
                android.content.Context r1 = r5.h()     // Catch: o.dx.a -> L51
                o.dx.c r0 = r3.i()     // Catch: o.dx.a -> L51
                r2.d(r1, r0)     // Catch: o.dx.a -> L51
                goto L14
            L51:
                r4 = move-exception
                boolean r0 = o.ea.f.a()
                if (r0 == 0) goto L14
                java.lang.String r3 = r5.d()
                r0 = 30
                int[] r2 = new int[r0]
                r2 = {x0088: FILL_ARRAY_DATA , data: [845619066, -1066230519, -307823293, 1494518578, -1901344092, 904011985, -1513442065, -308233880, 1193217396, 736236557, -1274560743, 1047066852, 1316640279, -220689708, 1689117562, 641142216, 2111445881, 1948924626, -1831498804, -1294836740, -193681594, 782962697, -2124790014, 627351933, 2083629678, -2104803994, -1197722445, -121735050, -653078016, 1927131197} // fill-array
                int r0 = android.view.ViewConfiguration.getTapTimeout()
                int r0 = r0 >> 16
                int r1 = 59 - r0
                r0 = 1
                java.lang.Object[] r0 = new java.lang.Object[r0]
                v(r2, r1, r0)
                r0 = r0[r8]
                java.lang.String r0 = (java.lang.String) r0
                java.lang.String r0 = r0.intern()
                o.ea.f.e(r3, r0, r4)
                int r0 = o.aj.b.c.f20280h
                int r1 = r0 + 9
                int r0 = r1 % 128
                o.aj.b.c.f20279g = r0
                int r1 = r1 % r7
                goto L14
            L86:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.aj.b.c.e(java.lang.Object[]):java.lang.Object");
        }

        static void init$0() {
            $$a = new byte[]{7, 42, -92, 85};
            $$b = 64;
        }

        private static void v(int[] iArr, int i2, Object[] objArr) throws Throwable {
            int i3 = 2;
            int i4 = 2 % 2;
            l lVar = new l();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = f20275b;
            int i5 = 989264422;
            int i6 = 16;
            int i7 = 1;
            int i8 = 0;
            if (iArr2 != null) {
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i9 = 0;
                while (i9 < length) {
                    int i10 = $11 + 111;
                    $10 = i10 % 128;
                    if (i10 % i3 != 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(iArr2[i9])};
                            Object objA = d.a(i5);
                            if (objA == null) {
                                byte b2 = (byte) 1;
                                byte b3 = (byte) (-b2);
                                objA = d.a(675 - (ViewConfiguration.getKeyRepeatTimeout() >> i6), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 12 - Color.red(0), -328001469, false, $$d(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                            }
                            iArr3[i9] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        Object[] objArr3 = {Integer.valueOf(iArr2[i9])};
                        Object objA2 = d.a(989264422);
                        if (objA2 == null) {
                            byte b4 = (byte) 1;
                            byte b5 = (byte) (-b4);
                            objA2 = d.a(675 - (Process.myPid() >> 22), (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 12 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -328001469, false, $$d(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE});
                        }
                        iArr3[i9] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                        i9++;
                    }
                    i3 = 2;
                    i5 = 989264422;
                    i6 = 16;
                }
                iArr2 = iArr3;
            }
            int length2 = iArr2.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = f20275b;
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i11 = 0;
                while (i11 < length3) {
                    int i12 = $11 + 75;
                    $10 = i12 % 128;
                    if (i12 % 2 != 0) {
                        Object[] objArr4 = {Integer.valueOf(iArr5[i11])};
                        Object objA3 = d.a(989264422);
                        if (objA3 == null) {
                            byte b6 = (byte) i7;
                            byte b7 = (byte) (-b6);
                            objA3 = d.a((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 675, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 12 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -328001469, false, $$d(b6, b7, (byte) (b7 + 1)), new Class[]{Integer.TYPE});
                        }
                        iArr6[i11] = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                        i11 /= 0;
                    } else {
                        Object[] objArr5 = {Integer.valueOf(iArr5[i11])};
                        Object objA4 = d.a(989264422);
                        if (objA4 == null) {
                            byte b8 = (byte) 1;
                            byte b9 = (byte) (-b8);
                            objA4 = d.a(View.resolveSizeAndState(0, 0, 0) + 675, (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 12, -328001469, false, $$d(b8, b9, (byte) (b9 + 1)), new Class[]{Integer.TYPE});
                        }
                        iArr6[i11] = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                        i11++;
                    }
                    i7 = 1;
                    i8 = 0;
                }
                iArr5 = iArr6;
            }
            System.arraycopy(iArr5, i8, iArr4, i8, length2);
            lVar.f19941d = i8;
            int i13 = $10 + 91;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            while (lVar.f19941d < iArr.length) {
                int i15 = $11 + 115;
                $10 = i15 % 128;
                int i16 = i15 % 2;
                cArr[0] = (char) (iArr[lVar.f19941d] >> 16);
                cArr[1] = (char) iArr[lVar.f19941d];
                cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
                cArr[3] = (char) iArr[lVar.f19941d + 1];
                lVar.f19942e = (cArr[0] << 16) + cArr[1];
                lVar.f19940a = (cArr[2] << 16) + cArr[3];
                l.a(iArr4);
                int i17 = 0;
                for (int i18 = 16; i17 < i18; i18 = 16) {
                    lVar.f19942e ^= iArr4[i17];
                    Object[] objArr6 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                    Object objA5 = d.a(2098218801);
                    if (objA5 == null) {
                        byte b10 = (byte) 3;
                        byte b11 = (byte) (b10 - 4);
                        objA5 = d.a(301 - Color.blue(0), (char) (52698 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), ((Process.getThreadPriority(0) + 20) >> 6) + 11, -1416256172, false, $$d(b10, b11, (byte) (b11 + 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objA5).invoke(null, objArr6)).intValue();
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
                Object[] objArr7 = {lVar, lVar};
                Object objA6 = d.a(986820978);
                if (objA6 == null) {
                    byte b12 = (byte) (-1);
                    objA6 = d.a(228 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 51004), 8 - ImageFormat.getBitsPerPixel(0), -330018025, false, $$d((byte) 5, b12, (byte) (b12 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA6).invoke(null, objArr7);
            }
            objArr[0] = new String(cArr2, 0, i2);
        }

        /* JADX WARN: Removed duplicated region for block: B:58:0x001a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void z(char r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, int r25, java.lang.Object[] r26) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 577
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.aj.b.c.z(char, java.lang.String, java.lang.String, java.lang.String, int, java.lang.Object[]):void");
        }

        @Override // o.ab.j
        public final /* synthetic */ f a(Context context) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f20280h + 75;
            f20279g = i3 % 128;
            int i4 = i3 % 2;
            o.cg.b bVarD = d(context);
            int i5 = f20280h + 39;
            f20279g = i5 % 128;
            if (i5 % 2 != 0) {
                return bVarD;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.ab.j
        public final void a(o.ef.a aVar) throws Throwable {
            int iMyPid = Process.myPid();
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int iMaxMemory2 = (int) Runtime.getRuntime().maxMemory();
            int i2 = f20276c * 2056458567;
            f20276c = i2;
            d(iMaxMemory, iMaxMemory2, 2104584116, new Object[]{this, aVar}, iMyPid, -2104584116, i2);
        }

        @Override // o.ab.j
        public final a b(int i2) {
            int i3 = 2 % 2;
            int i4 = f20280h + 83;
            f20279g = i4 % 128;
            int i5 = i4 % 2;
            if (i2 == 5001) {
                return a.aA;
            }
            if (i2 == 5002) {
                return a.aB;
            }
            a aVarB = super.b(i2);
            int i6 = f20279g + 125;
            f20280h = i6 % 128;
            if (i6 % 2 == 0) {
                return aVarB;
            }
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.c
        public final void b(o.bg.c cVar) {
            int i2 = 2 % 2;
            int i3 = f20279g + 31;
            f20280h = i3 % 128;
            if (i3 % 2 == 0) {
                ((b) e()).g().c(cVar);
            } else {
                ((b) e()).g().c(cVar);
                int i4 = 8 / 0;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.c
        public final void c(o.bg.c cVar) {
            int i2 = 2 % 2;
            int i3 = f20280h + 13;
            f20279g = i3 % 128;
            int i4 = i3 % 2;
            ((b) e()).g().b(((b) e()).f20270g);
            int i5 = f20279g + 1;
            f20280h = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.ab.j
        public final o.cg.j k() {
            int i2 = 2 % 2;
            int i3 = f20279g + 43;
            int i4 = i3 % 128;
            f20280h = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 63;
            f20279g = i6 % 128;
            int i7 = i6 % 2;
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j
        public final o.ef.a m() throws Throwable {
            int i2 = 2 % 2;
            o.ef.a aVar = new o.ef.a();
            Object[] objArr = new Object[1];
            v(new int[]{492662115, 264770189, -1994699760, -330515655}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 5, objArr);
            aVar.a(((String) objArr[0]).intern(), (Object) ((b) e()).f20271j);
            int i3 = f20279g + 9;
            f20280h = i3 % 128;
            if (i3 % 2 == 0) {
                return aVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.ab.j
        public final String o() throws Throwable {
            Object obj;
            int i2 = 2 % 2;
            int i3 = f20280h + 95;
            f20279g = i3 % 128;
            if (i3 % 2 == 0) {
                Object[] objArr = new Object[1];
                v(new int[]{1321505737, -11816055, 1436676647, 761845410, -193681594, 782962697, -526718900, 1020261076}, 75 >>> TextUtils.getTrimmedLength(""), objArr);
                obj = objArr[0];
            } else {
                Object[] objArr2 = new Object[1];
                v(new int[]{1321505737, -11816055, 1436676647, 761845410, -193681594, 782962697, -526718900, 1020261076}, 13 - TextUtils.getTrimmedLength(""), objArr2);
                obj = objArr2[0];
            }
            String strIntern = ((String) obj).intern();
            int i4 = f20280h + 123;
            f20279g = i4 % 128;
            int i5 = i4 % 2;
            return strIntern;
        }

        @Override // o.ab.j
        public final byte[][] p() {
            int i2 = 2 % 2;
            int i3 = f20279g;
            int i4 = i3 + 69;
            f20280h = i4 % 128;
            Object obj = null;
            if (i4 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = i3 + 17;
            f20280h = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 3 / 0;
            }
            return null;
        }

        @Override // o.ab.j
        public final void q() throws Throwable {
            int i2 = f20277d * 1491215964;
            f20277d = i2;
            d((int) Runtime.getRuntime().freeMemory(), Process.myTid(), -758665218, new Object[]{this}, i2, 758665219, (int) Process.getElapsedCpuTime());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j
        public final void s() throws Throwable {
            int i2 = 2 % 2;
            int i3 = f20280h + 115;
            f20279g = i3 % 128;
            int i4 = i3 % 2;
            int i5 = AnonymousClass2.f20273b[f().c().ordinal()];
            if (i5 != 1) {
                if (i5 != 2) {
                    super.s();
                    return;
                } else {
                    j().d(h(), ((b) e()).f20271j);
                    return;
                }
            }
            j().c(h(), ((b) e()).f20271j);
            int i6 = f20280h + 107;
            f20279g = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    public interface e {
        void b(List<i> list);

        void c(o.bg.c cVar);
    }

    private static String $$j(int i2, byte b2, int i3) {
        int i4 = b2 * 2;
        int i5 = i3 + 4;
        int i6 = i2 + 102;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[i4 + 1];
        int i7 = -1;
        if (bArr == null) {
            i6 += -i4;
        }
        while (true) {
            i7++;
            bArr2[i7] = (byte) i6;
            i5++;
            if (i7 == i4) {
                return new String(bArr2, 0);
            }
            i6 += -bArr[i5];
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f20268n = 0;
        f20266l = 1;
        f20269o = 0;
        f20267m = 1;
        n();
        ViewConfiguration.getPressedStateDuration();
        Color.argb(0, 0, 0, 0);
        TextUtils.indexOf("", "", 0);
        TextUtils.getCapsMode("", 0, 0);
        int i2 = f20266l + 83;
        f20268n = i2 % 128;
        int i3 = i2 % 2;
    }

    public b(Context context, e eVar, o.en.b bVar) {
        super(context, eVar, bVar, o.bg.e.f21116n);
    }

    static void init$0() {
        $$d = new byte[]{Ascii.ETB, 121, MessagePack.Code.FALSE, Ascii.SI};
        $$e = 186;
    }

    static void n() {
        f20264f = new char[]{64580, 64610, 64599, 64586, 65469, 64578, 65468, 64587, 64579, 64614, 64625, 64582, 64584, 64577, 65470, 65471, 64520, 64590, 65466, 64598, 64517, 64576, 64543, 65467, 64593};
        f20265k = (char) 51642;
    }

    private c o() {
        int i2 = 2 % 2;
        c cVar = new c(this);
        int i3 = f20267m + 63;
        f20269o = i3 % 128;
        int i4 = i3 % 2;
        return cVar;
    }

    private static void q(int i2, String str, byte b2, Object[] objArr) throws Throwable {
        int i3;
        int i4;
        String str2 = str;
        int i5 = 2 % 2;
        int i6 = $10 + 51;
        $11 = i6 % 128;
        Object obj = null;
        Object charArray = str2;
        if (i6 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (str2 != null) {
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        h hVar = new h();
        char[] cArr2 = f20264f;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i7 = 0; i7 < length; i7++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                    Object objA = d.a(421932776);
                    if (objA == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objA = d.a(Color.rgb(0, 0, 0) + 16777486, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), View.resolveSize(0, 0) + 11, -811348851, false, $$j(b3, b4, (byte) (b4 - 1)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
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
        Object[] objArr3 = {Integer.valueOf(f20265k)};
        Object objA2 = d.a(421932776);
        if (objA2 == null) {
            byte b5 = (byte) 0;
            byte b6 = b5;
            objA2 = d.a(270 - View.getDefaultSize(0, 0), (char) KeyEvent.normalizeMetaState(0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 11, -811348851, false, $$j(b5, b6, (byte) (b6 - 1)), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i2];
        if (i2 % 2 != 0) {
            i3 = i2 - 1;
            cArr4[i3] = (char) (cArr[i3] - b2);
        } else {
            i3 = i2;
        }
        if (i3 > 1) {
            hVar.f19926b = 0;
            while (hVar.f19926b < i3) {
                hVar.f19927c = cArr[hVar.f19926b];
                hVar.f19925a = cArr[hVar.f19926b + 1];
                if (hVar.f19927c == hVar.f19925a) {
                    cArr4[hVar.f19926b] = (char) (hVar.f19927c - b2);
                    cArr4[hVar.f19926b + 1] = (char) (hVar.f19925a - b2);
                } else {
                    Object[] objArr4 = {hVar, hVar, Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), hVar};
                    Object objA3 = d.a(219124184);
                    if (objA3 == null) {
                        byte b7 = (byte) 0;
                        objA3 = d.a(825 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), View.MeasureSpec.getMode(0) + 11, -611683395, false, $$j((byte) 9, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objA3).invoke(null, objArr4)).intValue() == hVar.f19930g) {
                        Object[] objArr5 = {hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, Integer.valueOf(cCharValue), hVar};
                        Object objA4 = d.a(-634864343);
                        if (objA4 == null) {
                            byte b8 = (byte) 0;
                            objA4 = d.a(217 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 10, 212688716, false, $$j((byte) 7, b8, (byte) (b8 - 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                        int i8 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                        cArr4[hVar.f19926b] = cArr2[iIntValue];
                        cArr4[hVar.f19926b + 1] = cArr2[i8];
                        i4 = $11 + 93;
                    } else if (hVar.f19928d == hVar.f19929e) {
                        hVar.f19931i = ((hVar.f19931i + cCharValue) - 1) % cCharValue;
                        hVar.f19930g = ((hVar.f19930g + cCharValue) - 1) % cCharValue;
                        int i9 = (hVar.f19928d * cCharValue) + hVar.f19931i;
                        int i10 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                        cArr4[hVar.f19926b] = cArr2[i9];
                        cArr4[hVar.f19926b + 1] = cArr2[i10];
                        i4 = $11 + 67;
                    } else {
                        int i11 = (hVar.f19928d * cCharValue) + hVar.f19930g;
                        int i12 = (hVar.f19929e * cCharValue) + hVar.f19931i;
                        cArr4[hVar.f19926b] = cArr2[i11];
                        cArr4[hVar.f19926b + 1] = cArr2[i12];
                    }
                    $10 = i4 % 128;
                    int i13 = i4 % 2;
                }
                hVar.f19926b += 2;
            }
        }
        for (int i14 = 0; i14 < i2; i14++) {
            cArr4[i14] = (char) (cArr4[i14] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.String r13) throws java.lang.Throwable {
        /*
            r12 = this;
            r11 = 2
            int r0 = r11 % r11
            int r0 = o.aj.b.f20267m
            int r1 = r0 + 41
            int r0 = r1 % 128
            o.aj.b.f20269o = r0
            int r1 = r1 % r11
            r8 = 0
            if (r1 == 0) goto L7c
            boolean r1 = o.ea.f.a()
            r0 = 49
            int r0 = r0 / r8
            if (r1 == 0) goto L76
        L18:
            java.lang.String r10 = ""
            int r0 = android.text.TextUtils.indexOf(r10, r10, r8, r8)
            int r3 = 20 - r0
            r0 = 48
            int r0 = android.text.TextUtils.indexOf(r10, r0, r8, r8)
            int r0 = 109 - r0
            byte r2 = (byte) r0
            r9 = 1
            java.lang.Object[] r1 = new java.lang.Object[r9]
            java.lang.String r0 = "\u0006\u0001\u0004\u000e\u0001\u0003\u000e\u000b\u0002\u0012\u0016\u0006\u0018\u000e\u0002\r\n\u0002\b\f"
            q(r3, r0, r2, r1)
            r0 = r1[r8]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r4 = r0.intern()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            long r6 = android.os.SystemClock.uptimeMillis()
            r1 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            int r3 = 40 - r0
            int r0 = android.os.Process.getGidForName(r10)
            int r0 = 13 - r0
            byte r2 = (byte) r0
            java.lang.Object[] r1 = new java.lang.Object[r9]
            java.lang.String r0 = "\u0012\b\u0006\u0001\u0004\u000e\u0001\u0003\u000e\u000b\u0002\u0012\u0016\u0006\u000f\u0018\u000f\u0015\n\u0001\u0003\f\u0015\u0014\u0000\u0017\u0006\u0014\u0014\u0015\u0017\u0004\u0010\u0016\t\u0011\u0015\u0017㗈"
            q(r3, r0, r2, r1)
            r0 = r1[r8]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.StringBuilder r0 = r5.append(r0)
            java.lang.StringBuilder r0 = r0.append(r13)
            java.lang.String r0 = r0.toString()
            o.ea.f.c(r4, r0)
            int r0 = o.aj.b.f20269o
            int r1 = r0 + 123
            int r0 = r1 % 128
            o.aj.b.f20267m = r0
            int r1 = r1 % r11
        L76:
            r12.f20271j = r13
            r12.a()
            return
        L7c:
            boolean r0 = o.ea.f.a()
            if (r0 == 0) goto L76
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.aj.b.a(java.lang.String):void");
    }

    @Override // o.ab.e
    public final /* synthetic */ o.ab.c c() {
        int i2 = 2 % 2;
        int i3 = f20267m + 55;
        f20269o = i3 % 128;
        int i4 = i3 % 2;
        c cVarO = o();
        int i5 = f20267m + 73;
        f20269o = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 34 / 0;
        }
        return cVarO;
    }

    @Override // o.ab.e
    public final String e() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f20269o + 95;
        f20267m = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        q(View.MeasureSpec.makeMeasureSpec(0, 0) + 20, "\u0006\u0001\u0004\u000e\u0001\u0003\u000e\u000b\u0002\u0012\u0016\u0006\u0018\u000e\u0002\r\n\u0002\b\f", (byte) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 110), objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i5 = f20269o + 87;
        f20267m = i5 % 128;
        int i6 = i5 % 2;
        return strIntern;
    }
}
