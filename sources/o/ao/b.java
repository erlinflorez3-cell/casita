package o.ao;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.Date;
import java.util.Map;
import java.util.Random;
import kotlin.jvm.internal.CharCompanionObject;
import o.ab.e;
import o.ab.j;
import o.cg.f;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends e<a> {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static char[] f20383j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static char f20384k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f20385l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f20386m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f20387n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f20388o = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    String f20389f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    o.ar.b f20390g;

    /* JADX INFO: renamed from: o.ao.b$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f20391a = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f20392d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final /* synthetic */ int[] f20393e;

        static {
            int[] iArr = new int[o.bg.a.values().length];
            f20393e = iArr;
            try {
                iArr[o.bg.a.aA.ordinal()] = 1;
                int i2 = f20392d + 21;
                f20391a = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20393e[o.bg.a.aB.ordinal()] = 2;
                int i4 = f20391a + 105;
                f20392d = i4 % 128;
                int i5 = i4 % 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public interface a {
        void b(o.ar.b bVar);

        void e(o.bg.c cVar);
    }

    static final class c extends j<b> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f20394b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f20395c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static int f20396d = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static int f20397f = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static char[] f20398h = null;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static int f20399i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static int f20400j = 0;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0015). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$d(short r7, int r8, int r9) {
            /*
                int r0 = r7 * 3
                int r7 = r0 + 1
                int r0 = r8 * 4
                int r6 = 4 - r0
                int r0 = r9 * 4
                int r5 = r0 + 116
                byte[] r4 = o.ao.b.c.$$a
                byte[] r3 = new byte[r7]
                r2 = 0
                if (r4 != 0) goto L28
                r0 = r6
                r1 = r2
            L15:
                int r6 = r6 + 1
                int r5 = r5 + r0
            L18:
                byte r0 = (byte) r5
                r3[r1] = r0
                int r1 = r1 + 1
                if (r1 != r7) goto L25
                java.lang.String r0 = new java.lang.String
                r0.<init>(r3, r2)
                return r0
            L25:
                r0 = r4[r6]
                goto L15
            L28:
                r1 = r2
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ao.b.c.$$d(short, int, int):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f20400j = -416457944;
            f20395c = -1380855045;
            f20396d = 1033530836;
            f20394b = -1425569429;
            f20399i = 0;
            f20397f = 1;
            f20398h = new char[]{56502, 56557, 56560, 56563, 56561, 56558, 56537, 56531, 56555, 56553, 56530, 56539, 56556, 56550, 56476, 56502, 56502, 56501, 56498, 56500, 56501, 56501, 56504, 56501, 56500, 56504, 56503, 56502, 56504, 56501, 56499, 56498, 56498, 56549, 56393, 56400, 56402, 56381, 56381, 56498, 56550, 56332, 56729, 56733, 56734, 56436, 56438, 56731, 56433, 56415, 56435, 56417, 56403, 56403, 56431, 56729, 56733, 56731, 56732, 56734, 56729, 56712, 56720, 56728, 56721, 56724, 56723, 56709, 56715, 56731, 56734, 56715, 56708, 56729, 56735, 56726, 56725, 56523, 56350, 56348, 56324, 56331, 56352, 56350, 56352, 56348, 56341, 56349, 56348, 56505, 56556, 56552, 56560, 56563, 56516, CharCompanionObject.MIN_LOW_SURROGATE, 56321, 56330, 56324, 56559, 56566, 56329, 56326, 56566, 56560, 56574, 56575, 56572, 56323, 56571, 56563, 56324, 56329, 56327, 56326, 56328, 56324, 56538, 56510, 56510, 56542, 56575, CharCompanionObject.MIN_LOW_SURROGATE, 56544, 56540, 56326, 56545, 56538, 56321, 56326, 56330, 56334};
        }

        c(b bVar) {
            super(bVar, true);
        }

        public static /* synthetic */ Object a(int i2, int i3, int i4, int i5, int i6, int i7, Object[] objArr) {
            int i8 = ~i7;
            int i9 = ~((-1) - (((-1) - i8) & ((-1) - i2)));
            int i10 = (-1) - (((-1) - (~((i6 + i7) - (i6 & i7)))) & ((-1) - i9));
            int i11 = ~i6;
            int i12 = ~((i11 + i8) - (i11 & i8));
            int i13 = ~((-1) - (((-1) - i7) & ((-1) - (~i2))));
            int i14 = (i13 + i12) - (i13 & i12);
            int i15 = (i14 + i9) - (i14 & i9);
            int i16 = i8 | ((-1) - (((-1) - i6) & ((-1) - i2)));
            int i17 = i6 + i2 + i3 + (1050315579 * i4) + (2086215248 * i5);
            int i18 = i17 * i17;
            int i19 = (i6 * (-1156115713)) + 1671168000 + ((-1156115713) * i2) + ((-1856302338) * i10) + (i15 * 1856302338) + (1856302338 * i16) + (700186624 * i3) + ((-1303117824) * i4) + (314572800 * i5) + (431423488 * i18);
            int i20 = ((i6 * (-961373039)) - 1316831794) + (i2 * (-961373039)) + (i10 * (-990)) + (i15 * 990) + (i16 * 990) + (i3 * (-961372049)) + (i4 * 755842709) + (i5 * (-1858722640)) + (i18 * (-2040987648));
            return i19 + ((i20 * i20) * 1361641472) != 1 ? b(objArr) : e(objArr);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static /* synthetic */ Object b(Object[] objArr) {
            c cVar = (c) objArr[0];
            int i2 = 2 % 2;
            int i3 = f20399i + 121;
            f20397f = i3 % 128;
            if (i3 % 2 != 0) {
                ((b) cVar.e()).g().b(((b) cVar.e()).f20390g);
                return null;
            }
            ((b) cVar.e()).g().b(((b) cVar.e()).f20390g);
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static /* synthetic */ Object e(Object[] objArr) throws Throwable {
            c cVar = (c) objArr[0];
            int i2 = 2 % 2;
            o.ef.a aVar = new o.ef.a();
            Object[] objArr2 = new Object[1];
            v("\u0000\u0000\u0001\u0000\u0001\u0001", new int[]{33, 6, 103, 6}, false, objArr2);
            aVar.a(((String) objArr2[0]).intern(), (Object) ((b) cVar.e()).f20389f);
            int i3 = f20397f + 35;
            f20399i = i3 % 128;
            if (i3 % 2 == 0) {
                return aVar;
            }
            throw null;
        }

        static void init$0() {
            $$a = new byte[]{68, -115, MessagePack.Code.BIN16, -123};
            $$b = 148;
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x00d5 A[Catch: all -> 0x01e9, TryCatch #0 {all -> 0x01e9, blocks: (B:12:0x0035, B:14:0x0046, B:15:0x0077, B:30:0x00bd, B:32:0x00d5, B:33:0x0108, B:45:0x0199, B:47:0x01aa, B:48:0x01e1, B:38:0x0125, B:40:0x013e, B:41:0x0178), top: B:78:0x0035 }] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x013e A[Catch: all -> 0x01e9, TryCatch #0 {all -> 0x01e9, blocks: (B:12:0x0035, B:14:0x0046, B:15:0x0077, B:30:0x00bd, B:32:0x00d5, B:33:0x0108, B:45:0x0199, B:47:0x01aa, B:48:0x01e1, B:38:0x0125, B:40:0x013e, B:41:0x0178), top: B:78:0x0035 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void v(java.lang.String r21, int[] r22, boolean r23, java.lang.Object[] r24) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 625
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ao.b.c.v(java.lang.String, int[], boolean, java.lang.Object[]):void");
        }

        @Override // o.ab.j
        public final f a(Context context) throws Throwable {
            int i2 = 2 % 2;
            Object[] objArr = new Object[1];
            v("\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001", new int[]{14, 19, 0, 5}, false, objArr);
            o.cg.b bVar = new o.cg.b(context, 44, ((String) objArr[0]).intern());
            int i3 = f20397f + 65;
            f20399i = i3 % 128;
            if (i3 % 2 == 0) {
                return bVar;
            }
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j
        public final void a(o.ef.a aVar) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f20399i + 21;
            f20397f = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            v("\u0000\u0001", new int[]{39, 2, 0, 0}, true, objArr);
            if (aVar.s(((String) objArr[0]).intern()) == null) {
                int i5 = f20399i + 45;
                f20397f = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 91 / 0;
                    if (!o.ea.f.a()) {
                        return;
                    }
                } else if (!o.ea.f.a()) {
                    return;
                }
                String strD = d();
                Object[] objArr2 = new Object[1];
                v("\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001", new int[]{41, 36, 173, 0}, true, objArr2);
                o.ea.f.d(strD, ((String) objArr2[0]).intern());
                return;
            }
            Object[] objArr3 = new Object[1];
            v("\u0000\u0001", new int[]{39, 2, 0, 0}, true, objArr3);
            Object[] objArr4 = {aVar, ((String) objArr3[0]).intern()};
            int i7 = o.ef.a.f23782p * (-1576737484);
            o.ef.a.f23782p = i7;
            String str = (String) o.ef.a.a(-781664457, objArr4, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i7, Thread.currentThread().getPriority());
            Object[] objArr5 = new Object[1];
            v("\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001", new int[]{77, 12, 50, 0}, true, objArr5);
            Date dateA = aVar.a(((String) objArr5[0]).intern(), false);
            Object[] objArr6 = new Object[1];
            v("\u0001\u0000\u0001\u0001\u0001", new int[]{89, 5, 0, 0}, true, objArr6);
            o.ef.a aVarV = aVar.v(((String) objArr6[0]).intern());
            if (aVarV != null) {
                Map<o.ex.c, Object> mapB = o.ar.c.b(aVarV);
                ((b) e()).f20390g = new o.ar.b(str, dateA, mapB);
                return;
            }
            int i8 = f20397f + 47;
            f20399i = i8 % 128;
            int i9 = i8 % 2;
            if (o.ea.f.a()) {
                String strD2 = d();
                Object[] objArr7 = new Object[1];
                v("\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001", new int[]{94, 38, 24, 0}, false, objArr7);
                o.ea.f.d(strD2, ((String) objArr7[0]).intern());
            }
        }

        @Override // o.ab.j
        public final o.bg.a b(int i2) {
            int i3 = 2 % 2;
            int i4 = f20399i + 47;
            f20397f = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            if (i2 != 5001) {
                return i2 != 5002 ? super.b(i2) : o.bg.a.aB;
            }
            o.bg.a aVar = o.bg.a.aA;
            int i5 = f20397f + 3;
            f20399i = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 98 / 0;
            }
            return aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.c
        public final void b(o.bg.c cVar) {
            int i2 = 2 % 2;
            int i3 = f20397f + 27;
            f20399i = i3 % 128;
            if (i3 % 2 != 0) {
                ((b) e()).g().e(cVar);
                int i4 = 41 / 0;
            } else {
                ((b) e()).g().e(cVar);
            }
            int i5 = f20399i + 109;
            f20397f = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // o.ab.c
        public final void c(o.bg.c cVar) {
            int i2 = f20394b * 1064984711;
            f20394b = i2;
            int i3 = f20396d * 1102393754;
            f20396d = i3;
            a(-832163971, i3, (int) Runtime.getRuntime().maxMemory(), new Random().nextInt(), 832163971, i2, new Object[]{this, cVar});
        }

        @Override // o.ab.j
        public final o.cg.j k() {
            int i2 = 2 % 2;
            int i3 = f20399i;
            int i4 = i3 + 125;
            f20397f = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 80 / 0;
            }
            int i6 = i3 + 51;
            f20397f = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 10 / 0;
            }
            return null;
        }

        @Override // o.ab.j
        public final o.ef.a m() throws o.ef.b {
            int iMyUid = Process.myUid();
            int id = (int) Thread.currentThread().getId();
            int i2 = (-619114506) * f20395c;
            f20395c = i2;
            int i3 = 1653596973 * f20400j;
            f20400j = i3;
            return (o.ef.a) a(-1650771075, id, i2, i3, 1650771076, iMyUid, new Object[]{this});
        }

        @Override // o.ab.j
        public final String o() throws Throwable {
            int i2 = 2 % 2;
            int i3 = f20397f + 105;
            f20399i = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            v("\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000", new int[]{0, 14, 0, 0}, true, objArr);
            String strIntern = ((String) objArr[0]).intern();
            int i5 = f20397f + 9;
            f20399i = i5 % 128;
            if (i5 % 2 == 0) {
                return strIntern;
            }
            throw null;
        }

        @Override // o.ab.j
        public final byte[][] p() {
            int i2 = 2 % 2;
            int i3 = f20399i + 39;
            f20397f = i3 % 128;
            if (i3 % 2 != 0) {
                return null;
            }
            int i4 = 61 / 0;
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j
        public final void s() throws Throwable {
            int i2 = 2 % 2;
            int i3 = f20399i + 47;
            f20397f = i3 % 128;
            int i4 = i3 % 2;
            int i5 = AnonymousClass2.f20393e[f().c().ordinal()];
            if (i5 != 1) {
                if (i5 != 2) {
                    super.s();
                    return;
                } else {
                    j().d(h(), ((b) e()).f20389f);
                    return;
                }
            }
            j().c(h(), ((b) e()).f20389f);
            int i6 = f20399i + 63;
            f20397f = i6 % 128;
            if (i6 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$j(short r9, byte r10, byte r11) {
        /*
            byte[] r8 = o.ao.b.$$d
            int r7 = 111 - r11
            int r0 = r9 * 4
            int r6 = r0 + 1
            int r0 = r10 * 4
            int r5 = r0 + 4
            byte[] r4 = new byte[r6]
            r3 = 0
            if (r8 != 0) goto L28
            r0 = r6
            r7 = r5
            r2 = r3
        L14:
            int r5 = r5 + 1
            int r7 = r7 + r0
            r1 = r2
        L18:
            byte r0 = (byte) r7
            int r2 = r1 + 1
            r4[r1] = r0
            if (r2 != r6) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L25:
            r0 = r8[r5]
            goto L14
        L28:
            r1 = r3
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ao.b.$$j(short, byte, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f20385l = 0;
        f20386m = 1;
        f20388o = 0;
        f20387n = 1;
        o();
        View.resolveSizeAndState(0, 0, 0);
        KeyEvent.keyCodeFromString("");
        PointF.length(0.0f, 0.0f);
        Color.green(0);
        int i2 = f20385l + 121;
        f20386m = i2 % 128;
        int i3 = i2 % 2;
    }

    public b(Context context, a aVar, o.en.b bVar) {
        super(context, aVar, bVar, o.bg.e.f21125w);
        this.f20390g = null;
    }

    static void init$0() {
        $$d = new byte[]{34, -117, -98, -86};
        $$e = 56;
    }

    static void o() {
        f20383j = new char[]{64588, 64587, 64580, 64578, 64576, 64614, 64577, 64610, 64586, 64593, 64584, 64582, 64599, 64625, 64598, 64585};
        f20384k = (char) 51643;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void q(int r26, java.lang.String r27, byte r28, java.lang.Object[] r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 918
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ao.b.q(int, java.lang.String, byte, java.lang.Object[]):void");
    }

    public final void a(String str) {
        int i2 = 2 % 2;
        int i3 = f20388o + 97;
        f20387n = i3 % 128;
        if (i3 % 2 == 0) {
            this.f20389f = str;
            a();
            throw null;
        }
        this.f20389f = str;
        a();
        int i4 = f20388o + 97;
        f20387n = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.ab.e
    public final o.ab.c<?> c() {
        int i2 = 2 % 2;
        c cVar = new c(this);
        int i3 = f20387n + 85;
        f20388o = i3 % 128;
        int i4 = i3 % 2;
        return cVar;
    }

    @Override // o.ab.e
    public final String e() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f20387n + 83;
        f20388o = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        q((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 27, "\u0004\u0005\r\u0001\u000e\u0000\u0002\r\u0003\n\b\u0001\t\u0000\u0004\t\u0005\r\u0000\f\r\u0007\t\u000b\u000e\u0006\u0002\u0005", (byte) (58 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i5 = f20388o + 73;
        f20387n = i5 % 128;
        int i6 = i5 % 2;
        return strIntern;
    }
}
