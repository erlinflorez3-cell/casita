package o.ac;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import java.lang.reflect.Method;
import o.a.m;
import o.ab.j;
import o.bg.c;
import o.cg.f;
import o.d.d;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends o.ab.e<b> {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static char f20119f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static char[] f20120g = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f20121l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f20122m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f20123n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f20124o = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    String f20125j;

    public interface b {
        void b(c cVar);

        void e();
    }

    static final class e extends j<a> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f20126b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f20127c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static int f20128d = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static int f20129f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static int f20130g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static char[] f20131h = null;

        /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:5:0x0016). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$d(short r9, int r10, short r11) {
            /*
                byte[] r8 = o.ac.a.e.$$a
                int r0 = r11 * 4
                int r7 = 120 - r0
                int r0 = r9 * 3
                int r6 = 1 - r0
                int r0 = r10 * 4
                int r5 = r0 + 4
                byte[] r4 = new byte[r6]
                r3 = 0
                if (r8 != 0) goto L2f
                r0 = r6
                r1 = r5
                r2 = r3
            L16:
                int r0 = -r0
                int r5 = r5 + r0
                int r0 = r1 + 1
                r1 = r2
                r7 = r5
                r5 = r0
            L1d:
                int r2 = r1 + 1
                byte r0 = (byte) r7
                r4[r1] = r0
                if (r2 != r6) goto L2a
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                return r0
            L2a:
                r0 = r8[r5]
                r1 = r5
                r5 = r7
                goto L16
            L2f:
                r1 = r3
                goto L1d
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ac.a.e.$$d(short, int, short):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f20127c = 1719352630;
            f20126b = 1202839754;
            f20128d = 1542522765;
            f20129f = 0;
            f20130g = 1;
            f20131h = new char[]{56498, 56548, 56552, 56552, 56556, 56556, 56532, 56530, 56553, 56555, 56522, 56342, 56344, 56342, 56342, 56346, 56346, 56342, 56341, 56341, 56341, 56345, 56346, 56343, 56340, 56341, 56342, 56342, 56521, 56324, 56324, 56345, 56343, 56336, 56503, 56558, 56557, 56551, 56551, 56553, 56532, 56532, 56552, 56552, 56556, 56556, 56532, 56530, 56553, 56555, 56531, 56557, 56417, 56417, 56428, 56717, 56740, 56742, 56445, 56443, 56737, 56746, 56742, 56734, 56733, 56745, 56711, 56445, 56735, 56739, 56739, 56743, 56743, 56735, 56707, 56417, 56444, 56740, 56745, 56748, 56745, 56742, 56748, 56744, 56445, 56443, 56741, 56708, 56708, 56751, 56743, 56734, 56735, 56743, 56750, 56748, 56749, 56744, 56742, 56749, 56744, 56737, 56735, 56720, 56726, 56749, 56747, 56747, 56734, 56732, 56732, 56735, 56743, 56734, 56735, 56743, 56750};
        }

        e(a aVar) {
            super(aVar, true);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object e(int i2, int i3, Object[] objArr, int i4, int i5, int i6, int i7) throws Throwable {
            Object obj;
            int i8 = ~i5;
            int i9 = ~i7;
            int i10 = (~((i8 + i9) - (i8 & i9))) | (~((i9 + i6) - (i9 & i6)));
            int i11 = ~i6;
            int i12 = ~(i11 | i5 | i7);
            int i13 = (i10 + i12) - (i10 & i12);
            int i14 = (i9 + i5) - (i9 & i5);
            int i15 = ~i14;
            int i16 = ~(i6 | i5);
            int i17 = (i16 + i15) - (i16 & i15);
            int i18 = (-1) - (((-1) - i14) & ((-1) - i11));
            int i19 = i5 + i7 + i4 + ((-1468046718) * i3) + (327422179 * i2);
            int i20 = i19 * i19;
            int i21 = (677926197 * i5) + 1810235392 + (1154460365 * i7) + (i13 * (-238267084)) + ((-238267084) * i17) + (238267084 * i18) + (916193280 * i4) + (1933049856 * i3) + (743702528 * i2) + (286654464 * i20);
            int i22 = (i5 * (-645773371)) + 280972133 + (i7 * (-645772067)) + (i13 * (-652)) + (i17 * (-652)) + (i18 * 652) + (i4 * (-645772719)) + (i3 * 1523302178) + (i2 * 1475409363) + (i20 * (-1007288320));
            if (i21 + (i22 * i22 * (-492175360)) == 1) {
                e eVar = (e) objArr[0];
                int i23 = 2 % 2;
                o.ef.a aVar = new o.ef.a();
                Object[] objArr2 = new Object[1];
                v("\u0000\u0001\u0001\u0000\u0001\u0000", new int[]{28, 6, 46, 0}, true, objArr2);
                aVar.a(((String) objArr2[0]).intern(), (Object) ((a) eVar.e()).f20125j);
                int i24 = f20130g + 115;
                f20129f = i24 % 128;
                int i25 = i24 % 2;
                return aVar;
            }
            int i26 = 2 % 2;
            int i27 = f20129f + 65;
            f20130g = i27 % 128;
            int[] iArr = {0, 10, 0, 0};
            if (i27 % 2 == 0) {
                Object[] objArr3 = new Object[1];
                v("\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000", iArr, true, objArr3);
                obj = objArr3[0];
            } else {
                Object[] objArr4 = new Object[1];
                v("\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000", iArr, false, objArr4);
                obj = objArr4[0];
            }
            return ((String) obj).intern();
        }

        static void init$0() {
            $$a = new byte[]{111, -103, -70, 103};
            $$b = 163;
        }

        private static void v(String str, int[] iArr, boolean z2, Object[] objArr) throws Throwable {
            int i2;
            byte b2;
            char[] cArr;
            char c2;
            String str2 = str;
            int i3 = 2 % 2;
            Object bytes = str2;
            if (str2 != null) {
                int i4 = $11 + 37;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                bytes = str2.getBytes("ISO-8859-1");
            }
            byte[] bArr = (byte[]) bytes;
            m mVar = new m();
            int i6 = 0;
            int i7 = iArr[0];
            int i8 = iArr[1];
            int i9 = iArr[2];
            int i10 = iArr[3];
            char[] cArr2 = f20131h;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i11 = 0;
                while (i11 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i11])};
                        Object objA = d.a(-2071388435);
                        if (objA == null) {
                            byte b3 = (byte) i6;
                            byte b4 = b3;
                            objA = d.a(TextUtils.getCapsMode("", i6, i6) + 249, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getPressedStateDuration() >> 16) + 11, 1376582792, false, $$d(b3, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE});
                        }
                        cArr3[i11] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                        i11++;
                        i6 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                int i12 = $11 + 5;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                cArr2 = cArr3;
            }
            char[] cArr4 = new char[i8];
            System.arraycopy(cArr2, i7, cArr4, 0, i8);
            if (bArr != null) {
                int i14 = $10 + 81;
                $11 = i14 % 128;
                if (i14 % 2 == 0) {
                    cArr = new char[i8];
                    b2 = 1;
                    mVar.f19943d = 1;
                    c2 = 1;
                } else {
                    b2 = 1;
                    cArr = new char[i8];
                    mVar.f19943d = 0;
                    c2 = 0;
                }
                while (mVar.f19943d < i8) {
                    if (bArr[mVar.f19943d] == b2) {
                        int i15 = mVar.f19943d;
                        char c3 = cArr4[mVar.f19943d];
                        Object[] objArr3 = new Object[2];
                        objArr3[b2] = Integer.valueOf(c2);
                        objArr3[0] = Integer.valueOf(c3);
                        Object objA2 = d.a(120026474);
                        if (objA2 == null) {
                            objA2 = d.a((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 10, (char) TextUtils.indexOf("", "", 0), TextUtils.getOffsetBefore("", 0) + 10, -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr[i15] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    } else {
                        int i16 = mVar.f19943d;
                        Object[] objArr4 = {Integer.valueOf(cArr4[mVar.f19943d]), Integer.valueOf(c2)};
                        Object objA3 = d.a(1632715197);
                        if (objA3 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            objA3 = d.a(836 - KeyEvent.normalizeMetaState(0), (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 27279), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 11, -1210801192, false, $$d(b5, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr[i16] = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
                    }
                    c2 = cArr[mVar.f19943d];
                    Object[] objArr5 = {mVar, mVar};
                    Object objA4 = d.a(-1041906996);
                    if (objA4 == null) {
                        objA4 = d.a(20 - Process.getGidForName(""), (char) (KeyEvent.keyCodeFromString("") + 35715), (ViewConfiguration.getPressedStateDuration() >> 16) + 11, 392175785, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA4).invoke(null, objArr5);
                    b2 = 1;
                }
                cArr4 = cArr;
            }
            if (i10 > 0) {
                int i17 = $11 + 107;
                $10 = i17 % 128;
                if (i17 % 2 != 0) {
                    char[] cArr5 = new char[i8];
                    i2 = 0;
                    System.arraycopy(cArr4, 0, cArr5, 0, i8);
                    System.arraycopy(cArr5, 0, cArr4, i8 + i10, i10);
                    System.arraycopy(cArr5, i10, cArr4, 1, i8 / i10);
                } else {
                    i2 = 0;
                    char[] cArr6 = new char[i8];
                    System.arraycopy(cArr4, 0, cArr6, 0, i8);
                    int i18 = i8 - i10;
                    System.arraycopy(cArr6, 0, cArr4, i18, i10);
                    System.arraycopy(cArr6, i10, cArr4, 0, i18);
                }
            } else {
                i2 = 0;
            }
            if (z2) {
                char[] cArr7 = new char[i8];
                while (true) {
                    mVar.f19943d = i2;
                    if (mVar.f19943d >= i8) {
                        break;
                    }
                    int i19 = $11 + 33;
                    $10 = i19 % 128;
                    int i20 = i19 % 2;
                    cArr7[mVar.f19943d] = cArr4[(i8 - mVar.f19943d) - 1];
                    i2 = mVar.f19943d + 1;
                }
                cArr4 = cArr7;
            }
            if (i9 > 0) {
                mVar.f19943d = 0;
                int i21 = $10 + 107;
                $11 = i21 % 128;
                int i22 = i21 % 2;
                while (mVar.f19943d < i8) {
                    cArr4[mVar.f19943d] = (char) (cArr4[mVar.f19943d] - iArr[2]);
                    mVar.f19943d++;
                }
            }
            objArr[0] = new String(cArr4);
        }

        @Override // o.ab.j
        public final f a(Context context) throws Throwable {
            int i2 = 2 % 2;
            Object[] objArr = new Object[1];
            v("\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001", new int[]{10, 18, 98, 0}, false, objArr);
            o.cg.b bVar = new o.cg.b(context, 22, ((String) objArr[0]).intern());
            int i3 = f20130g + 91;
            f20129f = i3 % 128;
            if (i3 % 2 == 0) {
                return bVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.ab.j
        public final void a(o.ef.a aVar) throws o.ef.b {
            int i2 = 2 % 2;
            int i3 = f20130g + 65;
            f20129f = i3 % 128;
            int i4 = i3 % 2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.c
        public final void b(c cVar) {
            int i2 = 2 % 2;
            int i3 = f20129f + 125;
            f20130g = i3 % 128;
            if (i3 % 2 != 0) {
                ((a) e()).g().b(cVar);
            } else {
                ((a) e()).g().b(cVar);
                throw null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.c
        public final void c(c cVar) {
            int i2 = 2 % 2;
            int i3 = f20129f + 83;
            f20130g = i3 % 128;
            if (i3 % 2 == 0) {
                ((a) e()).g().e();
                int i4 = 4 / 0;
            } else {
                ((a) e()).g().e();
            }
            int i5 = f20129f + 101;
            f20130g = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // o.ab.j
        public final boolean e(int i2) throws Throwable {
            String strIntern;
            Object obj;
            int i3 = 2 % 2;
            int i4 = f20129f + 39;
            f20130g = i4 % 128;
            if (i4 % 2 != 0 ? i2 != 5002 : i2 != 25783) {
                return super.e(i2);
            }
            if (!(!o.ea.f.a())) {
                int i5 = f20129f + 121;
                f20130g = i5 % 128;
                if (i5 % 2 == 0) {
                    Object[] objArr = new Object[1];
                    v("\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001", new int[]{34, 17, 0, 6}, false, objArr);
                    strIntern = ((String) objArr[0]).intern();
                    Object[] objArr2 = new Object[1];
                    v("\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000", new int[]{51, 66, 187, 44}, false, objArr2);
                    obj = objArr2[0];
                } else {
                    Object[] objArr3 = new Object[1];
                    v("\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001", new int[]{34, 17, 0, 6}, false, objArr3);
                    strIntern = ((String) objArr3[0]).intern();
                    Object[] objArr4 = new Object[1];
                    v("\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000", new int[]{51, 66, 187, 44}, false, objArr4);
                    obj = objArr4[0];
                }
                o.ea.f.c(strIntern, ((String) obj).intern());
            }
            return true;
        }

        @Override // o.ab.j
        public final o.cg.j k() {
            int i2 = 2 % 2;
            int i3 = f20129f + 49;
            int i4 = i3 % 128;
            f20130g = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 123;
            f20129f = i6 % 128;
            if (i6 % 2 == 0) {
                return null;
            }
            throw null;
        }

        @Override // o.ab.j
        public final o.ef.a m() throws o.ef.b {
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i2 = f20128d * 197551862;
            f20128d = i2;
            int i3 = (-94573648) * f20126b;
            f20126b = i3;
            int i4 = f20127c * (-1050649570);
            f20127c = i4;
            return (o.ef.a) e(i4, i3, new Object[]{this}, i2, -1137125698, elapsedCpuTime, 1137125699);
        }

        @Override // o.ab.j
        public final String o() {
            int id = (int) Thread.currentThread().getId();
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i2 = (int) Runtime.getRuntime().totalMemory();
            return (String) e(Process.myPid(), i2, new Object[]{this}, iMaxMemory, -1467155150, id, 1467155150);
        }

        @Override // o.ab.j
        public final byte[][] p() {
            int i2 = 2 % 2;
            int i3 = f20130g;
            int i4 = i3 + 17;
            f20129f = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 109;
            f20129f = i6 % 128;
            int i7 = i6 % 2;
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j
        public final void q() throws Throwable {
            int i2 = 2 % 2;
            int i3 = f20129f + 47;
            f20130g = i3 % 128;
            int i4 = i3 % 2;
            j().d(h(), ((a) e()).f20125j);
            int i5 = f20130g + 57;
            f20129f = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x001f -> B:5:0x0011). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$j(short r8, byte r9, int r10) {
        /*
            int r7 = r10 * 2
            int r0 = r7 + 1
            int r6 = 111 - r9
            byte[] r5 = o.ac.a.$$d
            int r4 = r8 + 4
            byte[] r3 = new byte[r0]
            r2 = 0
            if (r5 != 0) goto L24
            r0 = r7
            r1 = r2
        L11:
            int r6 = r6 + r0
        L12:
            byte r0 = (byte) r6
            r3[r1] = r0
            int r4 = r4 + 1
            if (r1 != r7) goto L1f
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            return r0
        L1f:
            int r1 = r1 + 1
            r0 = r5[r4]
            goto L11
        L24:
            r1 = r2
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ac.a.$$j(short, byte, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f20121l = 0;
        f20122m = 1;
        f20123n = 0;
        f20124o = 1;
        o();
        AudioTrack.getMinVolume();
        View.resolveSize(0, 0);
        Drawable.resolveOpacity(0, 0);
        ViewConfiguration.getScrollFriction();
        int i2 = f20121l + 13;
        f20122m = i2 % 128;
        int i3 = i2 % 2;
    }

    public a(Context context, b bVar, o.en.b bVar2) {
        super(context, bVar, bVar2, o.bg.e.f21114l);
    }

    static void init$0() {
        $$d = new byte[]{125, 113, 52, MessagePack.Code.FLOAT32};
        $$e = PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION;
    }

    private e n() {
        int i2 = 2 % 2;
        e eVar = new e(this);
        int i3 = f20124o + 3;
        f20123n = i3 % 128;
        int i4 = i3 % 2;
        return eVar;
    }

    static void o() {
        f20120g = new char[]{64593, 64599, 64586, 64517, 64614, 64577, 64609, 64580, 64587, 64584, 64543, 64592, 64576, 64582, 64520, 64585};
        f20119f = (char) 51643;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void q(int r25, java.lang.String r26, byte r27, java.lang.Object[] r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 988
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ac.a.q(int, java.lang.String, byte, java.lang.Object[]):void");
    }

    public final void a(String str) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f20124o + 11;
        f20123n = i3 % 128;
        int i4 = i3 % 2;
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            q(16 - TextUtils.lastIndexOf("", '0'), "\u0004\u000e\f\r\u0004\u0000\u0005\u0004\u0005\t\u0006\u0000㘗㘗\u0004\u000b㘞", (byte) (32 - (ViewConfiguration.getTapTimeout() >> 16)), objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            q(TextUtils.lastIndexOf("", '0', 0, 0) + 33, "\u0006\u0001\u0004\u000e\f\r\u0004\u0000\u0005\u0004\u0005\t\u0002\u000f\u0001\u000f\u0005\u0003\u0007\u0001\u0001\u0003\u0001\u0007\r\f\u0000\u0004\u000f\u0000\u000b\u0002", (byte) (KeyEvent.normalizeMetaState(0) + 36), objArr2);
            o.ea.f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(str).toString());
        }
        this.f20125j = str;
        a();
        int i5 = f20123n + 91;
        f20124o = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // o.ab.e
    public final /* synthetic */ o.ab.c c() {
        int i2 = 2 % 2;
        int i3 = f20124o + 117;
        f20123n = i3 % 128;
        int i4 = i3 % 2;
        e eVarN = n();
        if (i4 != 0) {
            int i5 = 81 / 0;
        }
        return eVarN;
    }

    @Override // o.ab.e
    public final String e() throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        int i3 = f20124o + 19;
        f20123n = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = new Object[1];
            q(91 / View.MeasureSpec.makeMeasureSpec(0, 0), "\u0004\u000e\f\r\u0004\u0000\u0005\u0004\u0005\t\u0006\u0000㘗㘗\u0004\u000b㘞", (byte) (View.MeasureSpec.getMode(0) * 52), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            q(17 - View.MeasureSpec.makeMeasureSpec(0, 0), "\u0004\u000e\f\r\u0004\u0000\u0005\u0004\u0005\t\u0006\u0000㘗㘗\u0004\u000b㘞", (byte) (32 - View.MeasureSpec.getMode(0)), objArr2);
            obj = objArr2[0];
        }
        return ((String) obj).intern();
    }
}
