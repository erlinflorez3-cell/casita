package o.aq;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import o.a.k;
import o.a.q;
import o.ab.e;
import o.ab.j;
import o.cg.f;
import o.i.d;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends e<a> {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static long f20558n = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static int f20559p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static int f20560q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static int f20561r = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static int f20562t = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    d f20563f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    String f20564g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    Map<o.ex.c, Object> f20565j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    Map<o.ex.c, Object> f20566k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    String f20567l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    Date f20568m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    String f20569o;

    /* JADX INFO: renamed from: o.aq.b$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f20570a = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f20571c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f20572e = 0;

        static {
            int[] iArr = new int[o.bg.a.values().length];
            f20571c = iArr;
            try {
                iArr[o.bg.a.aA.ordinal()] = 1;
                int i2 = f20570a + 61;
                f20572e = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20571c[o.bg.a.aB.ordinal()] = 2;
                int i5 = f20572e;
                int i6 = (i5 ^ 87) + ((i5 & 87) << 1);
                f20570a = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 58 / 0;
                }
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public interface a {
        void b(Map<o.ex.c, Object> map, String str, Date date);

        void d(o.bg.c cVar);
    }

    static final class c extends j<b> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f20573b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f20574c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static int f20575d = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static long f20576f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static int f20577g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static int f20578h = 0;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0015). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$d(int r9, byte r10, byte r11) {
            /*
                byte[] r8 = o.aq.b.c.$$a
                int r0 = r11 * 7
                int r7 = r0 + 107
                int r0 = r9 * 2
                int r6 = 4 - r0
                int r0 = r10 * 3
                int r5 = 1 - r0
                byte[] r4 = new byte[r5]
                r3 = 0
                if (r8 != 0) goto L2a
                r0 = r6
                r2 = r3
            L15:
                int r6 = r6 + 1
                int r0 = -r0
                int r7 = r7 + r0
                r1 = r2
            L1a:
                int r2 = r1 + 1
                byte r0 = (byte) r7
                r4[r1] = r0
                if (r2 != r5) goto L27
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                return r0
            L27:
                r0 = r8[r6]
                goto L15
            L2a:
                r1 = r3
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: o.aq.b.c.$$d(int, byte, byte):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f20573b = 498768716;
            f20574c = -1412166453;
            f20575d = 1369188733;
            f20578h = 0;
            f20577g = 1;
            f20576f = -8390873130356096938L;
        }

        c(b bVar) {
            super(bVar, true);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static /* synthetic */ Object a(Object[] objArr) {
            c cVar = (c) objArr[0];
            int i2 = 2 % 2;
            int i3 = f20577g + 81;
            f20578h = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                ((b) cVar.e()).g().b(((b) cVar.e()).f20566k, ((b) cVar.e()).f20569o, ((b) cVar.e()).f20568m);
                return null;
            }
            ((b) cVar.e()).g().b(((b) cVar.e()).f20566k, ((b) cVar.e()).f20569o, ((b) cVar.e()).f20568m);
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ Object b(int i2, int i3, int i4, int i5, Object[] objArr, int i6, int i7) {
            int i8 = ~i3;
            int i9 = ~i6;
            int i10 = i8 | i9;
            int i11 = ~((-1) - (((-1) - i10) & ((-1) - i4)));
            int i12 = (-1) - (((-1) - (~i4)) & ((-1) - i8));
            int i13 = ~((-1) - (((-1) - i12) & ((-1) - i6)));
            int i14 = (i11 + i13) - (i11 & i13);
            int i15 = (-1) - (((-1) - (~(i4 | i8))) & ((-1) - (~i10)));
            int i16 = (-1) - (((-1) - (~i12)) & ((-1) - (~((-1) - (((-1) - i9) & ((-1) - i3))))));
            int i17 = i3 + i6 + i2 + (783392123 * i5) + ((-786872706) * i7);
            int i18 = i17 * i17;
            int i19 = ((-1525980173) * i3) + 1729888256 + (218870266 * i6) + (i14 * 1744850439) + ((-805266418) * i15) + (1744850439 * i16) + (1963720704 * i2) + ((-1731985408) * i5) + ((-471334912) * i7) + ((-600899584) * i18);
            int i20 = (i3 * 375823119) + 1642083618 + (i6 * 375823682) + (i14 * 563) + (i15 * 1126) + (i16 * 563) + (i2 * 375824245) + (i5 * (-117547465)) + (i7 * 763984278) + (i18 * (-763691008));
            return i19 + ((i20 * i20) * 1830354944) != 1 ? d(objArr) : a(objArr);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static /* synthetic */ Object d(Object[] objArr) {
            c cVar = (c) objArr[0];
            o.bg.c cVar2 = (o.bg.c) objArr[1];
            int i2 = 2 % 2;
            int i3 = f20577g + 109;
            f20578h = i3 % 128;
            if (i3 % 2 != 0) {
                ((b) cVar.e()).g().d(cVar2);
                throw null;
            }
            ((b) cVar.e()).g().d(cVar2);
            int i4 = f20578h + 51;
            f20577g = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 29 / 0;
            }
            return null;
        }

        static void init$0() {
            $$a = new byte[]{46, -113, 33, 42};
            $$b = 4;
        }

        private static void v(String str, int i2, Object[] objArr) throws Throwable {
            String str2 = str;
            int i3 = 2 % 2;
            int i4 = $10 + 5;
            $11 = i4 % 128;
            Object obj = null;
            if (i4 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            Object charArray = str2 != null ? str2.toCharArray() : str2;
            k kVar = new k();
            char[] cArrC = k.c(f20576f ^ (-5882309809461882246L), (char[]) charArray, i2);
            kVar.f19939c = 4;
            int i5 = $10 + 109;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 / 5;
            }
            while (kVar.f19939c < cArrC.length) {
                kVar.f19938a = kVar.f19939c - 4;
                int i7 = kVar.f19939c;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f20576f)};
                    Object objA = o.d.d.a(-1093976004);
                    if (objA == null) {
                        int touchSlop = 229 - (ViewConfiguration.getTouchSlop() >> 8);
                        char maximumFlingVelocity = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 51004);
                        int touchSlop2 = (ViewConfiguration.getTouchSlop() >> 8) + 9;
                        byte b2 = (byte) ($$b - 4);
                        byte b3 = b2;
                        objA = o.d.d.a(touchSlop, maximumFlingVelocity, touchSlop2, 1749983833, false, $$d(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrC[i7] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {kVar, kVar};
                    Object objA2 = o.d.d.a(-912105096);
                    if (objA2 == null) {
                        int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 675;
                        char cArgb = (char) Color.argb(0, 0, 0, 0);
                        int packedPositionGroup = 12 - ExpandableListView.getPackedPositionGroup(0L);
                        byte b4 = (byte) ($$b - 4);
                        byte b5 = b4;
                        objA2 = o.d.d.a(pressedStateDuration, cArgb, packedPositionGroup, 522683165, false, $$d(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArrC, 4, cArrC.length - 4);
        }

        @Override // o.ab.j
        public final f a(Context context) throws Throwable {
            int i2 = 2 % 2;
            Object[] objArr = new Object[1];
            v("ṛ\uedbdṬ㾢쁊搪䞤ㄗ四\uf754⵰\uf8a2輏踄\uf5c6䁳쑳䆸븗ᜈ㲢ᥠݤ", 1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr);
            o.cg.b bVar = new o.cg.b(context, 45, ((String) objArr[0]).intern());
            int i3 = f20578h + 39;
            f20577g = i3 % 128;
            int i4 = i3 % 2;
            return bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j
        public final void a(o.ef.a aVar) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f20577g + 69;
            f20578h = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            v("ꍫ⾺ꌈﷷ\uef32䬘郍\ue62d\ueb98㔉ɔ⾍㉹䱙\udae6", TextUtils.lastIndexOf("", '0', 0, 0) + 1, objArr);
            o.ef.a aVarX = aVar.x(((String) objArr[0]).intern());
            b bVar = (b) e();
            Object[] objArr2 = new Object[1];
            v("↠硻⇉ꨳ枙Ύ", ViewConfiguration.getLongPressTimeout() >> 16, objArr2);
            Object[] objArr3 = {aVarX, ((String) objArr2[0]).intern()};
            int i5 = o.ef.a.f23782p * (-1576737484);
            o.ef.a.f23782p = i5;
            bVar.f20569o = (String) o.ef.a.a(-781664457, objArr3, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i5, Thread.currentThread().getPriority());
            b bVar2 = (b) e();
            Object[] objArr4 = new Object[1];
            v("儔켳具ᵭ닯ᛒ僣☆᧐햆很\uefb9쀰곞蜣坢", ViewConfiguration.getMaximumFlingVelocity() >> 16, objArr4);
            bVar2.f20568m = aVarX.a(((String) objArr4[0]).intern(), false);
            Object[] objArr5 = new Object[1];
            v("韛敫請뜲便嵑ᣩ済눊", TextUtils.indexOf("", "", 0), objArr5);
            o.ef.a aVarX2 = aVarX.x(((String) objArr5[0]).intern());
            ((b) e()).f20566k = o.ar.c.b(aVarX2);
            int i6 = f20577g + 101;
            f20578h = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
        }

        @Override // o.ab.j
        public final o.bg.a b(int i2) {
            int i3 = 2 % 2;
            int i4 = f20577g + 93;
            f20578h = i4 % 128;
            int i5 = i4 % 2;
            if (i2 == 5001) {
                return o.bg.a.aA;
            }
            if (i2 != 5002) {
                return super.b(i2);
            }
            o.bg.a aVar = o.bg.a.aB;
            int i6 = f20577g + 39;
            f20578h = i6 % 128;
            if (i6 % 2 == 0) {
                return aVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.ab.c
        public final void b(o.bg.c cVar) {
            int iNextInt = new Random().nextInt();
            b((int) Runtime.getRuntime().maxMemory(), -1001491087, iNextInt, Thread.activeCount(), new Object[]{this, cVar}, 1001491087, (int) Runtime.getRuntime().maxMemory());
        }

        @Override // o.ab.c
        public final void c(o.bg.c cVar) {
            int i2 = f20575d * (-355268263);
            f20575d = i2;
            int i3 = (-1054062733) * f20574c;
            f20574c = i3;
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i4 = f20573b * 1429740072;
            f20573b = i4;
            b(i3, -196306325, i2, iMaxMemory, new Object[]{this, cVar}, 196306326, i4);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j
        public final o.cg.j k() {
            int i2 = 2 % 2;
            o.cg.j jVar = new o.cg.j(((b) e()).f20567l, ((b) e()).f20563f);
            int i3 = f20577g + 99;
            f20578h = i3 % 128;
            int i4 = i3 % 2;
            return jVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j
        public final o.ef.a m() throws Throwable {
            int i2 = 2 % 2;
            o.ef.a aVar = new o.ef.a();
            Object[] objArr = new Object[1];
            v("츛\u206d칸\uf220촜椶鬱\uedd1蛢㫕", ViewConfiguration.getTapTimeout() >> 16, objArr);
            aVar.a(((String) objArr[0]).intern(), (Object) ((b) e()).f20564g);
            o.ef.a aVarB = o.ar.c.b(((b) e()).f20565j);
            Object[] objArr2 = new Object[1];
            v("韛敫請뜲便嵑ᣩ済눊", ViewConfiguration.getWindowTouchSlop() >> 8, objArr2);
            aVar.a(((String) objArr2[0]).intern(), aVarB);
            int i3 = f20577g + 25;
            f20578h = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 74 / 0;
            }
            return aVar;
        }

        @Override // o.ab.j
        public final String o() throws Throwable {
            Object obj;
            int i2 = 2 % 2;
            int i3 = f20577g + 45;
            f20578h = i3 % 128;
            if (i3 % 2 != 0) {
                Object[] objArr = new Object[1];
                v("峄똨岧摶乾\uea43ѷ犒᐀겑ꌹ묱췱헔箢ϲ蚠ᩱさ咂繶䊠褥鵜㟚诀䇄\ue5ec\ue888", ViewConfiguration.getKeyRepeatDelay() / 116, objArr);
                obj = objArr[0];
            } else {
                Object[] objArr2 = new Object[1];
                v("峄똨岧摶乾\uea43ѷ犒᐀겑ꌹ묱췱헔箢ϲ蚠ᩱさ咂繶䊠褥鵜㟚诀䇄\ue5ec\ue888", ViewConfiguration.getKeyRepeatDelay() >> 16, objArr2);
                obj = objArr2[0];
            }
            return ((String) obj).intern();
        }

        @Override // o.ab.j
        public final byte[][] p() {
            int i2 = 2 % 2;
            int i3 = f20577g;
            int i4 = i3 + 113;
            f20578h = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 51;
            f20578h = i6 % 128;
            Object obj = null;
            if (i6 % 2 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j
        public final void s() throws Throwable {
            int i2 = 2 % 2;
            int i3 = f20578h + 23;
            f20577g = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                int i4 = AnonymousClass3.f20571c[f().c().ordinal()];
                throw null;
            }
            int i5 = AnonymousClass3.f20571c[f().c().ordinal()];
            if (i5 == 1) {
                j().c(h(), ((b) e()).f20564g);
                return;
            }
            if (i5 != 2) {
                super.s();
                return;
            }
            j().d(h(), ((b) e()).f20564g);
            int i6 = f20577g + 15;
            f20578h = i6 % 128;
            if (i6 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$j(short r8, short r9, int r10) {
        /*
            byte[] r7 = o.aq.b.$$d
            int r6 = r10 * 2
            int r1 = r6 + 1
            int r0 = r9 * 2
            int r5 = 4 - r0
            int r0 = r8 * 7
            int r4 = r0 + 71
            byte[] r3 = new byte[r1]
            r2 = 0
            if (r7 != 0) goto L29
            r0 = r4
            r4 = r6
            r1 = r2
        L16:
            int r4 = r4 + r0
            int r5 = r5 + 1
        L19:
            byte r0 = (byte) r4
            r3[r1] = r0
            if (r1 != r6) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            return r0
        L24:
            r0 = r7[r5]
            int r1 = r1 + 1
            goto L16
        L29:
            r1 = r2
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.aq.b.$$j(short, short, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f20560q = 0;
        f20559p = 1;
        f20561r = 0;
        f20562t = 1;
        k();
        AudioTrack.getMinVolume();
        TextUtils.getOffsetBefore("", 0);
        int i2 = f20560q + 49;
        f20559p = i2 % 128;
        int i3 = i2 % 2;
    }

    public b(Context context, a aVar, o.en.b bVar) {
        super(context, aVar, bVar, o.bg.e.f21128z);
        this.f20566k = new HashMap();
        this.f20569o = "";
        this.f20568m = new Date();
    }

    static void init$0() {
        $$d = new byte[]{82, -6, -97, -22};
        $$e = 191;
    }

    static void k() {
        f20558n = -4519125190396484466L;
    }

    private static void s(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $11 + 91;
        $10 = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
        q qVar = new q();
        qVar.f19949d = i2;
        int length = cArr.length;
        long[] jArr = new long[length];
        qVar.f19948a = 0;
        while (qVar.f19948a < cArr.length) {
            int i5 = qVar.f19948a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                Object objA = o.d.d.a(-1011865131);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a(732 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) ((KeyEvent.getMaxKeyCode() >> 16) + 7933), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 11, 355847088, false, $$j(b2, b3, b3), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objA).invoke(null, objArr2)).longValue() ^ (f20558n ^ 4743694005979712847L);
                Object[] objArr3 = {qVar, qVar};
                Object objA2 = o.d.d.a(1452497747);
                if (objA2 == null) {
                    int i6 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 835;
                    char c2 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 27278);
                    int i7 = 10 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    int i8 = $$e;
                    byte b4 = (byte) ((i8 + 1) - (i8 | 1));
                    byte b5 = (byte) (b4 - 1);
                    objA2 = o.d.d.a(i6, c2, i7, -2145994442, false, $$j(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objA2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        qVar.f19948a = 0;
        while (qVar.f19948a < cArr.length) {
            int i9 = $11 + 27;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
                Object[] objArr4 = {qVar, qVar};
                Object objA3 = o.d.d.a(1452497747);
                if (objA3 == null) {
                    int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 836;
                    char gidForName = (char) (Process.getGidForName("") + 27280);
                    int iGreen = 11 - Color.green(0);
                    byte b6 = (byte) ((-1) - (((-1) - $$e) | ((-1) - 1)));
                    byte b7 = (byte) (b6 - 1);
                    objA3 = o.d.d.a(windowTouchSlop, gidForName, iGreen, -2145994442, false, $$j(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
                int i10 = 20 / 0;
            } else {
                cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
                Object[] objArr5 = {qVar, qVar};
                Object objA4 = o.d.d.a(1452497747);
                if (objA4 == null) {
                    int i11 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 836;
                    char cRed = (char) (Color.red(0) + 27279);
                    int modifierMetaStateMask = 10 - ((byte) KeyEvent.getModifierMetaStateMask());
                    byte b8 = (byte) ((-1) - (((-1) - $$e) | ((-1) - 1)));
                    byte b9 = (byte) (b8 - 1);
                    objA4 = o.d.d.a(i11, cRed, modifierMetaStateMask, -2145994442, false, $$j(b8, b9, b9), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            }
        }
        objArr[0] = new String(cArr2);
    }

    @Override // o.ab.e
    public final o.ab.c<?> c() {
        int i2 = 2 % 2;
        c cVar = new c(this);
        int i3 = f20562t + 97;
        f20561r = i3 % 128;
        int i4 = i3 % 2;
        return cVar;
    }

    @Override // o.ab.e
    public final String e() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f20562t + 115;
        f20561r = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        s("\ue982ꖲ熦ඣ\ud9b1閡ↈﶴ覜䖸ᆯ궫禹㖩솛鶼⦰\ue5be놠䶳ᦶ햠憾㶹즷薛冴\uedb4릩疮ư\uddb2", 19457 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i5 = f20561r + 45;
        f20562t = i5 % 128;
        if (i5 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    public final void e(String str, Map<o.ex.c, Object> map, d dVar, String str2) {
        int i2 = 2 % 2;
        int i3 = f20561r + 105;
        f20562t = i3 % 128;
        int i4 = i3 % 2;
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            s("\ue982ꖲ熦ඣ\ud9b1閡ↈﶴ覜䖸ᆯ궫禹㖩솛鶼⦰\ue5be놠䶳ᦶ햠憾㶹즷薛冴\uedb4릩疮ư\uddb2", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 19457, objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            s("\ue9a5盽휤㑊铨\uf53f則닡\u1316灘킪ㄠ鹁ﺗ弿뱹Ჲ紭\uda79㪜鯏\uf861墏릔ؤ曺쟌⑲蒰\ue5c7䈏ꊩ\u0381思삵↸踘\uef4e俷갅്淯쩿⭤请\ue837䥅ꦏ㘰靁\uf783吡땲ᖀ爀퍻㎇郎\uf17d冏뻙ή翻\udcca㵮鶠慎嬛뮬ᣬ礗\ud9e4⚣蝊", 40787 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr2);
            o.ea.f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(str).toString());
            int i5 = f20561r + 109;
            f20562t = i5 % 128;
            int i6 = i5 % 2;
        }
        this.f20564g = str;
        this.f20565j = map;
        this.f20563f = dVar;
        this.f20567l = str2;
        a();
    }
}
