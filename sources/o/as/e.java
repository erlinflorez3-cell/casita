package o.as;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.iptc.IptcDirectory;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import java.util.Random;
import kotlin.io.encoding.Base64;
import o.a.m;
import o.ab.j;
import o.cg.f;
import o.ep.i;
import o.i.d;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends o.ab.e<a> {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f20597k = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f20598m = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static char[] f20599o = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static int f20600q = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static int f20601t = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    c f20602f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    d f20603g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    String f20604j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    i f20605l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    o.ep.d f20606n;

    /* JADX INFO: renamed from: o.as.e$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f20607a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f20608b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f20609c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final /* synthetic */ int[] f20610d;

        static {
            int[] iArr = new int[c.values().length];
            f20607a = iArr;
            try {
                iArr[c.f20616a.ordinal()] = 1;
                int i2 = f20609c;
                int i3 = (((-1) - (((-1) - i2) & ((-1) - 39))) << 1) - (i2 ^ 39);
                f20608b = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20607a[c.f20619e.ordinal()] = 2;
                int i6 = f20609c;
                int i7 = ((i6 + 21) - (21 | i6)) + ((-1) - (((-1) - i6) & ((-1) - 21)));
                f20608b = i7 % 128;
                int i8 = i7 % 2;
                int i9 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20607a[c.f20618d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[o.bg.a.values().length];
            f20610d = iArr2;
            try {
                iArr2[o.bg.a.aA.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20610d[o.bg.a.aB.ordinal()] = 2;
                int i10 = f20609c;
                int i11 = (i10 ^ 111) + ((i10 & 111) << 1);
                f20608b = i11 % 128;
                int i12 = i11 % 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public interface a {
        void e();

        void e(o.bg.c cVar);
    }

    static final class b extends j<e> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static char[] f20611b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f20612c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static int f20613d = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static int f20614f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static int f20615g = 0;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0017). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$d(byte r8, short r9, byte r10) {
            /*
                byte[] r7 = o.as.e.b.$$a
                int r0 = r8 * 3
                int r6 = r0 + 4
                int r2 = r10 * 4
                int r1 = 1 - r2
                int r0 = r9 * 4
                int r0 = r0 + 116
                byte[] r5 = new byte[r1]
                r4 = 0
                int r3 = 0 - r2
                if (r7 != 0) goto L2b
                r2 = r4
                r1 = r6
            L17:
                int r0 = -r0
                int r6 = r6 + r0
                int r1 = r1 + 1
            L1b:
                byte r0 = (byte) r6
                r5[r2] = r0
                if (r2 != r3) goto L26
                java.lang.String r0 = new java.lang.String
                r0.<init>(r5, r4)
                return r0
            L26:
                int r2 = r2 + 1
                r0 = r7[r1]
                goto L17
            L2b:
                r2 = r4
                r1 = r6
                r6 = r0
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: o.as.e.b.$$d(byte, short, byte):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f20613d = 233205171;
            f20612c = 700649752;
            f20615g = 0;
            f20614f = 1;
            f20611b = new char[]{56566, 56422, 56422, 56422, 56419, 56421, 56411, 56416, 56428, 56423, 56424, 56472, 56497, 56497, 56500, 56501, 56500, 56499, 56501, 56500, 56500, 56502, 56498, 56496, 56498, 56498, 56500, 56503, 56503, 56504, 56545, 56387, 56385, 56387, 56384, 56375, 56556, 56422, 56435, 56434, 56441, 56443, 56515, 56327, 56326, 56506, 56556, 56534, 56539, 56553, 56552, 56557, 56545, 56546, 56561, 56498, 56534, 56541, 56560, 56561, 56563, 56556, 56557, 56563, 56555, 56539, 56544, 56553, 56552, 56557, 56545, 56546, 56561, 56563, 56334, 56740, 56746, 56742, 56737, 56738, 56726, 56720, 56572, 56566, 56557, 56563, 56567};
        }

        b(e eVar) {
            super(eVar, true);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object a(int i2, int i3, int i4, int i5, Object[] objArr, int i6, int i7) {
            int i8 = ~i7;
            int i9 = ~i3;
            int i10 = ~i2;
            int i11 = ~((i9 + i10) - (i9 & i10));
            int i12 = ~((-1) - (((-1) - i2) & ((-1) - i3)));
            int i13 = (-1) - (((-1) - ((i11 + i8) - (i11 & i8))) & ((-1) - i12));
            int i14 = (~((i8 + i3) - (i8 & i3))) | (~(i8 | i10)) | (~((i10 + i3) - (i10 & i3)));
            int i15 = i3 + i7 + i5 + (669352129 * i4) + (266941808 * i6);
            int i16 = i15 * i15;
            int i17 = (720661947 * i3) + 1572077568 + ((-1243901369) * i7) + (1165201990 * i13) + (i12 * (-1165201990)) + ((-1165201990) * i14) + (1885863936 * i5) + ((-1100480512) * i4) + ((-1249902592) * i6) + ((-491520000) * i16);
            int i18 = (i3 * 1617402437) + 56426783 + (i7 * 1617401273) + (i13 * (-582)) + (i12 * IptcDirectory.TAG_PROGRAM_VERSION) + (i14 * IptcDirectory.TAG_PROGRAM_VERSION) + (i5 * 1617401855) + (i4 * 1244927807) + (i6 * (-404665712)) + (i16 * (-45350912));
            if (i17 + (i18 * i18 * 1565261824) != 1) {
                return e(objArr);
            }
            b bVar = (b) objArr[0];
            int i19 = 2 % 2;
            o.cg.j jVar = new o.cg.j(((e) bVar.e()).f20604j, ((e) bVar.e()).f20603g);
            int i20 = f20615g + 1;
            f20614f = i20 % 128;
            int i21 = i20 % 2;
            return jVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static /* synthetic */ Object e(Object[] objArr) throws Throwable {
            b bVar = (b) objArr[0];
            int i2 = 2 % 2;
            int i3 = f20615g + 37;
            f20614f = i3 % 128;
            int i4 = i3 % 2;
            bVar.j().j().c(bVar.h(), ((e) bVar.e()).f20606n.b(), ((e) bVar.e()).f20605l, ((e) bVar.e()).f20602f.b());
            int i5 = f20614f + 109;
            f20615g = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 20 / 0;
            }
            return null;
        }

        static void init$0() {
            $$a = new byte[]{76, -81, MessagePack.Code.EXT16, -107};
            $$b = 227;
        }

        private static void v(String str, int[] iArr, boolean z2, Object[] objArr) throws Throwable {
            int i2;
            int i3;
            String str2 = str;
            int i4 = 2 % 2;
            Object bytes = str2;
            if (str2 != null) {
                bytes = str2.getBytes("ISO-8859-1");
            }
            byte[] bArr = (byte[]) bytes;
            m mVar = new m();
            int i5 = 0;
            int i6 = iArr[0];
            int i7 = iArr[1];
            int i8 = iArr[2];
            int i9 = iArr[3];
            char[] cArr = f20611b;
            char c2 = '0';
            if (cArr != null) {
                int i10 = $11 + 107;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i12 = 0;
                while (i12 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i12])};
                        Object objA = o.d.d.a(-2071388435);
                        if (objA == null) {
                            int iLastIndexOf = 10 - TextUtils.lastIndexOf("", c2, i5, i5);
                            byte b2 = (byte) i5;
                            byte b3 = b2;
                            objA = o.d.d.a(248 - MotionEvent.axisFromString(""), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), iLastIndexOf, 1376582792, false, $$d(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        cArr2[i12] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                        i12++;
                        i5 = 0;
                        c2 = '0';
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                int i13 = $11 + 77;
                $10 = i13 % 128;
                int i14 = i13 % 2;
                cArr = cArr2;
            }
            char[] cArr3 = new char[i7];
            System.arraycopy(cArr, i6, cArr3, 0, i7);
            if (bArr != null) {
                char[] cArr4 = new char[i7];
                mVar.f19943d = 0;
                char c3 = 0;
                while (mVar.f19943d < i7) {
                    int i15 = $10 + 101;
                    $11 = i15 % 128;
                    int i16 = i15 % 2;
                    if (bArr[mVar.f19943d] == 1) {
                        int i17 = mVar.f19943d;
                        Object[] objArr3 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c3)};
                        Object objA2 = o.d.d.a(120026474);
                        if (objA2 == null) {
                            objA2 = o.d.d.a(11 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) TextUtils.getCapsMode("", 0, 0), 10 - Color.red(0), -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i17] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    } else {
                        int i18 = mVar.f19943d;
                        Object[] objArr4 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c3)};
                        Object objA3 = o.d.d.a(1632715197);
                        if (objA3 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = (byte) (b4 + 1);
                            objA3 = o.d.d.a((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 835, (char) (27278 - TextUtils.indexOf((CharSequence) "", '0')), Color.alpha(0) + 11, -1210801192, false, $$d(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i18] = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
                    }
                    c3 = cArr4[mVar.f19943d];
                    Object[] objArr5 = {mVar, mVar};
                    Object objA4 = o.d.d.a(-1041906996);
                    if (objA4 == null) {
                        objA4 = o.d.d.a(21 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (35714 - MotionEvent.axisFromString("")), (ViewConfiguration.getEdgeSlop() >> 16) + 11, 392175785, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA4).invoke(null, objArr5);
                }
                cArr3 = cArr4;
            }
            if (i9 > 0) {
                int i19 = $11 + 59;
                $10 = i19 % 128;
                if (i19 % 2 != 0) {
                    char[] cArr5 = new char[i7];
                    i2 = 0;
                    System.arraycopy(cArr3, 0, cArr5, 1, i7);
                    System.arraycopy(cArr5, 1, cArr3, i7 >> i9, i9);
                    System.arraycopy(cArr5, i9, cArr3, 0, i7 % i9);
                } else {
                    i2 = 0;
                    char[] cArr6 = new char[i7];
                    System.arraycopy(cArr3, 0, cArr6, 0, i7);
                    int i20 = i7 - i9;
                    System.arraycopy(cArr6, 0, cArr3, i20, i9);
                    System.arraycopy(cArr6, i9, cArr3, 0, i20);
                }
            } else {
                i2 = 0;
            }
            if (z2) {
                char[] cArr7 = new char[i7];
                mVar.f19943d = i2;
                while (mVar.f19943d < i7) {
                    int i21 = $10 + 61;
                    $11 = i21 % 128;
                    if (i21 % 2 == 0) {
                        cArr7[mVar.f19943d] = cArr3[mVar.f19943d + i7 + 1];
                        i3 = mVar.f19943d - 1;
                    } else {
                        cArr7[mVar.f19943d] = cArr3[(i7 - mVar.f19943d) - 1];
                        i3 = mVar.f19943d + 1;
                    }
                    mVar.f19943d = i3;
                }
                cArr3 = cArr7;
            }
            if (i8 > 0) {
                int i22 = 0;
                while (true) {
                    mVar.f19943d = i22;
                    if (mVar.f19943d >= i7) {
                        break;
                    }
                    cArr3[mVar.f19943d] = (char) (cArr3[mVar.f19943d] - iArr[2]);
                    i22 = mVar.f19943d + 1;
                }
            }
            objArr[0] = new String(cArr3);
        }

        @Override // o.ab.j
        public final f a(Context context) throws Throwable {
            int i2 = 2 % 2;
            Object[] objArr = new Object[1];
            v("\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001", new int[]{11, 19, 0, 14}, true, objArr);
            o.cg.b bVar = new o.cg.b(context, 34, ((String) objArr[0]).intern());
            int i3 = f20615g + 67;
            f20614f = i3 % 128;
            if (i3 % 2 != 0) {
                return bVar;
            }
            throw null;
        }

        @Override // o.ab.j
        public final void a(o.ef.a aVar) throws o.ef.b {
            int iMyUid = Process.myUid();
            int iMyPid = Process.myPid();
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i2 = f20612c * 1510655518;
            f20612c = i2;
            a(iMyUid, -2017177985, iFreeMemory, iMyPid, new Object[]{this, aVar}, i2, 2017177985);
        }

        @Override // o.ab.j
        public final o.bg.a b(int i2) {
            int i3 = 2 % 2;
            int i4 = f20614f + 115;
            f20615g = i4 % 128;
            int i5 = i4 % 2;
            if (i2 != 5001) {
                return i2 != 5002 ? super.b(i2) : o.bg.a.aB;
            }
            o.bg.a aVar = o.bg.a.aA;
            int i6 = f20615g + 15;
            f20614f = i6 % 128;
            if (i6 % 2 != 0) {
                return aVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.c
        public final void b(o.bg.c cVar) {
            int i2 = 2 % 2;
            int i3 = f20615g + 61;
            f20614f = i3 % 128;
            if (i3 % 2 != 0) {
                ((e) e()).g().e(cVar);
            } else {
                ((e) e()).g().e(cVar);
                int i4 = 7 / 0;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.c
        public final void c(o.bg.c cVar) {
            int i2 = 2 % 2;
            int i3 = f20614f + 53;
            f20615g = i3 % 128;
            int i4 = i3 % 2;
            ((e) e()).g().e();
            int i5 = f20614f + 55;
            f20615g = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // o.ab.j
        public final o.cg.j k() {
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i2 = f20613d * (-48057240);
            f20613d = i2;
            return (o.cg.j) a(iUptimeMillis, -698550297, (int) SystemClock.uptimeMillis(), i2, new Object[]{this}, (int) Runtime.getRuntime().totalMemory(), 698550298);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j
        public final o.ef.a m() throws Throwable {
            int i2 = 2 % 2;
            o.ef.a aVar = new o.ef.a();
            Object[] objArr = new Object[1];
            v("\u0001\u0001\u0000\u0001\u0001\u0000", new int[]{30, 6, 85, 0}, true, objArr);
            aVar.a(((String) objArr[0]).intern(), (Object) ((e) e()).f20602f.a());
            Object[] objArr2 = new Object[1];
            v("\u0001\u0001\u0001\u0000\u0001\u0000", new int[]{36, 6, 144, 2}, false, objArr2);
            aVar.a(((String) objArr2[0]).intern(), (Object) ((e) e()).f20606n.b());
            o.ef.a aVar2 = new o.ef.a();
            Object[] objArr3 = new Object[1];
            v("\u0001\u0001\u0000", new int[]{42, 3, 20, 2}, true, objArr3);
            aVar2.a(((String) objArr3[0]).intern(), (Object) ((e) e()).f20605l.d().a());
            Object[] objArr4 = new Object[1];
            v("\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001", new int[]{45, 10, 0, 1}, true, objArr4);
            String strIntern = ((String) objArr4[0]).intern();
            Object[] objArr5 = {((e) e()).f20605l};
            int iNextInt = new Random().nextInt(829335317);
            i.f24595m = i.f24595m * 1091325868;
            aVar2.a(strIntern, i.d((int) Runtime.getRuntime().freeMemory(), -2118374406, iNextInt, Thread.currentThread().getPriority(), r12, objArr5, 2118374413));
            Object[] objArr6 = new Object[1];
            v("\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001", new int[]{55, 19, 0, 0}, true, objArr6);
            aVar2.a(((String) objArr6[0]).intern(), (Object) ((e) e()).f20605l.e());
            Object[] objArr7 = new Object[1];
            v("\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000", new int[]{74, 8, 185, 1}, false, objArr7);
            aVar2.a(((String) objArr7[0]).intern(), (Object) ((e) e()).f20605l.m());
            Object[] objArr8 = new Object[1];
            v(null, new int[]{82, 5, 8, 1}, true, objArr8);
            aVar.a(((String) objArr8[0]).intern(), aVar2);
            int i3 = f20614f + 79;
            f20615g = i3 % 128;
            int i4 = i3 % 2;
            return aVar;
        }

        @Override // o.ab.j
        public final String o() throws Throwable {
            int i2 = 2 % 2;
            int i3 = f20615g + 93;
            f20614f = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            v("\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001", new int[]{0, 11, 127, 0}, false, objArr);
            String strIntern = ((String) objArr[0]).intern();
            int i5 = f20614f + 37;
            f20615g = i5 % 128;
            int i6 = i5 % 2;
            return strIntern;
        }

        @Override // o.ab.j
        public final byte[][] p() {
            int i2 = 2 % 2;
            int i3 = f20614f;
            int i4 = i3 + 75;
            f20615g = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 105;
            f20615g = i6 % 128;
            int i7 = i6 % 2;
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j
        public final void s() throws Throwable {
            int i2 = 2 % 2;
            int i3 = f20614f + 109;
            f20615g = i3 % 128;
            int i4 = i3 % 2;
            int i5 = AnonymousClass4.f20610d[f().c().ordinal()];
            if (i5 == 1) {
                j().c(h(), ((e) e()).f20606n.b());
                return;
            }
            if (i5 == 2) {
                j().d(h(), ((e) e()).f20606n.b());
                return;
            }
            super.s();
            int i6 = f20615g + 21;
            f20614f = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c implements o.en.a {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static final int $$f = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f20616a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ c[] f20617c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f20618d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c f20619e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static short[] f20620f = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static int f20621g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static int f20622h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static byte[] f20623i = null;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static int f20624j = 0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static int f20625k = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static int f20626l = 0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static char f20627m = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static char[] f20628n = null;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static int f20629o = 0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static int f20630p = 0;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static int f20631r = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f20632b;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0013). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$g(byte r8, short r9, short r10) {
            /*
                int r8 = r8 + 102
                byte[] r7 = o.as.e.c.$$c
                int r0 = r9 + 4
                int r2 = r10 * 2
                int r1 = 1 - r2
                byte[] r6 = new byte[r1]
                r5 = 0
                int r4 = 0 - r2
                if (r7 != 0) goto L29
                r1 = r0
                r3 = r5
            L13:
                int r0 = -r0
                int r8 = r8 + r0
                r0 = r1
                r2 = r3
            L17:
                int r1 = r0 + 1
                byte r0 = (byte) r8
                r6[r2] = r0
                int r3 = r2 + 1
                if (r2 != r4) goto L26
                java.lang.String r0 = new java.lang.String
                r0.<init>(r6, r5)
                return r0
            L26:
                r0 = r7[r1]
                goto L13
            L29:
                r2 = r5
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: o.as.e.c.$$g(byte, short, short):java.lang.String");
        }

        static {
            init$2();
            $10 = 0;
            $11 = 1;
            init$1();
            f20630p = -861763776;
            init$0();
            f20629o = 0;
            f20631r = 1;
            f20625k = 0;
            f20626l = 1;
            e();
            Object[] objArr = new Object[1];
            t(5 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), "\u0003\u0007\u0005\u0016\u000f\n", (byte) (75 - TextUtils.lastIndexOf("", '0', 0, 0)), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            t(6 - ((Process.getThreadPriority(0) + 20) >> 6), "\u0003\u0007\u0005\u0016\u000f\n", (byte) (76 - TextUtils.getCapsMode("", 0, 0)), objArr2);
            f20616a = new c(strIntern, 0, ((String) objArr2[0]).intern());
            Object[] objArr3 = new Object[1];
            s((short) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 2070348481 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), AndroidCharacter.getMirror('0') + 35562, (-55) - Color.alpha(0), (byte) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 11), objArr3);
            String strIntern2 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            s((short) Color.argb(0, 0, 0, 0), 2070348481 - KeyEvent.keyCodeFromString(""), View.MeasureSpec.makeMeasureSpec(0, 0) + 2065861402, View.MeasureSpec.getSize(0) - 55, (byte) ((-11) - ExpandableListView.getPackedPositionType(0L)), objArr4);
            f20619e = new c(strIntern2, 1, ((String) objArr4[0]).intern());
            Object[] objArr5 = new Object[1];
            s((short) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2070348486, 2065861387 - ExpandableListView.getPackedPositionType(0L), (-55) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (byte) ((-113) - ((Process.getThreadPriority(0) + 20) >> 6)), objArr5);
            String strIntern3 = ((String) objArr5[0]).intern();
            Object[] objArr6 = new Object[1];
            s((short) ExpandableListView.getPackedPositionGroup(0L), 2070348487 - ExpandableListView.getPackedPositionGroup(0L), ExpandableListView.getPackedPositionChild(0L) + 2065861388, Color.red(0) - 56, (byte) (TextUtils.indexOf((CharSequence) "", '0', 0) - 112), objArr6);
            f20618d = new c(strIntern3, 2, ((String) objArr6[0]).intern());
            f20617c = c();
            int i2 = f20629o + 55;
            f20631r = i2 % 128;
            int i3 = i2 % 2;
        }

        private c(String str, int i2, String str2) {
            this.f20632b = str2;
        }

        private static /* synthetic */ c[] c() {
            int i2 = 2 % 2;
            int i3 = f20625k + 85;
            int i4 = i3 % 128;
            f20626l = i4;
            int i5 = i3 % 2;
            c[] cVarArr = {f20616a, f20619e, f20618d};
            int i6 = i4 + 41;
            f20625k = i6 % 128;
            if (i6 % 2 == 0) {
                return cVarArr;
            }
            throw null;
        }

        static void e() {
            f20622h = -1073025009;
            f20621g = 1150422451;
            f20624j = -1068533580;
            f20623i = new byte[]{-28, Ascii.CAN, -17, MessagePack.Code.BIN16, 58, -28, Ascii.GS, -19, Ascii.SYN, MessagePack.Code.FLOAT32, MessagePack.Code.EXT32, 87, -24, -83, 38, Ascii.ETB, Ascii.SYN, 17, -30, Ascii.SUB, -31, 37, MessagePack.Code.STR8, 40, MessagePack.Code.FIXEXT2, MessagePack.Code.FIXEXT4, 33, MessagePack.Code.UINT32, 51, 34, 47, MessagePack.Code.MAP16, MessagePack.Code.INT32, 40, MessagePack.Code.STR16, 62, MessagePack.Code.EXT8, 55, MessagePack.Code.UINT8, 16, 19, -15, MessagePack.Code.UINT64, 59, MessagePack.Code.TRUE, 8, -5, MessagePack.Code.ARRAY32, 35, MessagePack.Code.NEVER_USED, Ascii.CR, 62, Ascii.ESC, -30, MessagePack.Code.NEGFIXINT_PREFIX, MessagePack.Code.NEGFIXINT_PREFIX, MessagePack.Code.ARRAY32, 87, Ascii.DC4, Ascii.SUB, -6, Ascii.NAK, Ascii.RS, 19, -8, Ascii.FS, -14, -114, 113, -115, -123, -122, 122, -13, Ascii.CR, -5, 5, 3, -115, -115, -115, -115, -115, -115};
            f20628n = new char[]{64587, 64631, 64577, 65467, 64630, 64581, 64614, 64595, 64580, 64608, 64593, 64625, 64582, 64599, 64578, 65468, 64616, 64597, 64592, 64585, 64598, 64621, 64579, 64624, 64583, 65470, 64584, 64589, 64523, 64612, 64588, 65469, 65471, 64586, 64576, 64604};
            f20627m = (char) 51641;
        }

        static void init$0() {
            $$a = new byte[]{116, 109, 87, -103};
            $$b = 173;
        }

        static void init$1() {
            $$d = new byte[]{93, 121, -117, 60, MessagePack.Code.BIN16, Base64.padSymbol, Ascii.DC2, MessagePack.Code.TRUE, 58, MessagePack.Code.EXT16, Ascii.NAK};
            $$e = 25;
        }

        static void init$2() {
            $$c = new byte[]{49, -6, 40, 32};
            $$f = 234;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0013). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void q(byte r8, byte r9, short r10, java.lang.Object[] r11) {
            /*
                int r0 = r8 * 2
                int r8 = 1 - r0
                int r0 = r10 * 2
                int r7 = r0 + 4
                int r0 = r9 + 97
                byte[] r6 = o.as.e.c.$$a
                byte[] r5 = new byte[r8]
                r4 = 0
                if (r6 != 0) goto L2c
                r3 = r4
                r2 = r8
            L13:
                int r0 = -r0
                int r7 = r7 + 1
                int r0 = r0 + r2
                r2 = r3
            L18:
                int r3 = r2 + 1
                byte r1 = (byte) r0
                r5[r2] = r1
                if (r3 != r8) goto L27
                java.lang.String r0 = new java.lang.String
                r0.<init>(r5, r4)
                r11[r4] = r0
                return
            L27:
                r1 = r6[r7]
                r2 = r0
                r0 = r1
                goto L13
            L2c:
                r2 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: o.as.e.c.q(byte, byte, short, java.lang.Object[]):void");
        }

        private static void s(short s2, int i2, int i3, int i4, byte b2, Object[] objArr) throws Throwable {
            int i5;
            boolean z2;
            int i6 = 2;
            int i7 = 2 % 2;
            o.a.j jVar = new o.a.j();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(f20621g)};
                Object objA = o.d.d.a(-727631768);
                long j2 = 0;
                if (objA == null) {
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 239;
                    char c2 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 44530);
                    int iGreen = Color.green(0) + 11;
                    byte b3 = (byte) ($$f & 7);
                    byte b4 = (byte) (b3 - 3);
                    objA = o.d.d.a(iIndexOf, c2, iGreen, 35969549, false, $$g(b3, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                boolean z3 = iIntValue == -1;
                if (z3) {
                    byte[] bArr = f20623i;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        int i8 = 0;
                        while (i8 < length) {
                            int i9 = $10 + 107;
                            $11 = i9 % 128;
                            int i10 = i9 % i6;
                            Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                            Object objA2 = o.d.d.a(-1239398195);
                            if (objA2 == null) {
                                byte b5 = (byte) 1;
                                byte b6 = (byte) (-b5);
                                objA2 = o.d.d.a(View.getDefaultSize(0, 0) + IptcDirectory.TAG_COPYRIGHT_NOTICE, (char) ((ExpandableListView.getPackedPositionForGroup(0) > j2 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j2 ? 0 : -1)) + 28649), 11 - TextUtils.indexOf("", "", 0), 1621469864, false, $$g(b5, b6, (byte) (b6 + 1)), new Class[]{Integer.TYPE});
                            }
                            bArr2[i8] = ((Byte) ((Method) objA2).invoke(null, objArr3)).byteValue();
                            i8++;
                            i6 = 2;
                            j2 = 0;
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        byte[] bArr3 = f20623i;
                        Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(f20622h)};
                        Object objA3 = o.d.d.a(-727631768);
                        if (objA3 == null) {
                            int iIndexOf2 = TextUtils.indexOf("", "") + 238;
                            char c3 = (char) (44532 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                            int maximumDrawingCacheSize = 11 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                            int i11 = $$f;
                            byte b7 = (byte) ((i11 + 7) - (i11 | 7));
                            byte b8 = (byte) (b7 - 3);
                            objA3 = o.d.d.a(iIndexOf2, c3, maximumDrawingCacheSize, 35969549, false, $$g(b7, b8, (byte) (b8 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objA3).invoke(null, objArr4)).intValue()]) ^ (-7649639543924978291L))) + ((int) (((long) f20621g) ^ (-7649639543924978291L))));
                    } else {
                        iIntValue = (short) (((short) (((long) f20620f[i2 + ((int) (((long) f20622h) ^ (-7649639543924978291L)))]) ^ (-7649639543924978291L))) + ((int) (((long) f20621g) ^ (-7649639543924978291L))));
                    }
                }
                if (iIntValue > 0) {
                    int i12 = $10 + 37;
                    int i13 = i12 % 128;
                    $11 = i13;
                    int i14 = i12 % 2;
                    int i15 = ((i2 + iIntValue) - 2) + ((int) (((long) f20622h) ^ (-7649639543924978291L)));
                    if (z3) {
                        int i16 = i13 + 1;
                        int i17 = i16 % 128;
                        $10 = i17;
                        i5 = i16 % 2 != 0 ? 0 : 1;
                        int i18 = i17 + 3;
                        $11 = i18 % 128;
                        int i19 = i18 % 2;
                    } else {
                        i5 = 0;
                    }
                    jVar.f19936d = i15 + i5;
                    Object[] objArr5 = {jVar, Integer.valueOf(i3), Integer.valueOf(f20624j), sb};
                    Object objA4 = o.d.d.a(1819197256);
                    if (objA4 == null) {
                        objA4 = o.d.d.a(TextUtils.lastIndexOf("", '0', 0, 0) + 1, (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 5358), 12 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), -1158980307, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objA4).invoke(null, objArr5)).append(jVar.f19937e);
                    jVar.f19935c = jVar.f19937e;
                    byte[] bArr4 = f20623i;
                    if (bArr4 != null) {
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        int i20 = 0;
                        while (i20 < length2) {
                            int i21 = $11 + 61;
                            $10 = i21 % 128;
                            if (i21 % 2 != 0) {
                                bArr5[i20] = (byte) (((long) bArr4[i20]) - (-7649639543924978291L));
                                i20--;
                            } else {
                                bArr5[i20] = (byte) (((long) bArr4[i20]) ^ (-7649639543924978291L));
                                i20++;
                            }
                        }
                        bArr4 = bArr5;
                    }
                    if (bArr4 != null) {
                        int i22 = $11 + 39;
                        $10 = i22 % 128;
                        int i23 = i22 % 2;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    jVar.f19934b = 1;
                    while (jVar.f19934b < iIntValue) {
                        if (z2) {
                            byte[] bArr6 = f20623i;
                            jVar.f19936d = jVar.f19936d - 1;
                            jVar.f19937e = (char) (jVar.f19935c + (((byte) (((byte) (((long) bArr6[r3]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                        } else {
                            short[] sArr = f20620f;
                            jVar.f19936d = jVar.f19936d - 1;
                            jVar.f19937e = (char) (jVar.f19935c + (((short) (((short) (((long) sArr[r3]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                        }
                        sb.append(jVar.f19937e);
                        jVar.f19935c = jVar.f19937e;
                        jVar.f19934b++;
                    }
                }
                objArr[0] = sb.toString();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x0129  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x015d  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void t(int r26, java.lang.String r27, byte r28, java.lang.Object[] r29) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 896
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.as.e.c.t(int, java.lang.String, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:5:0x0014). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void u(byte r9, int r10, byte r11, java.lang.Object[] r12) {
            /*
                int r0 = r9 * 7
                int r9 = 8 - r0
                int r0 = r10 * 10
                int r0 = r0 + 101
                byte[] r8 = o.as.e.c.$$d
                int r7 = r11 + 4
                byte[] r6 = new byte[r9]
                r5 = 0
                if (r8 != 0) goto L2e
                r1 = r9
                r2 = r7
                r4 = r5
            L14:
                int r7 = r7 + r1
                int r0 = r7 + (-6)
                r3 = r4
                r7 = r2
            L19:
                int r2 = r7 + 1
                int r4 = r3 + 1
                byte r1 = (byte) r0
                r6[r3] = r1
                if (r4 != r9) goto L2a
                java.lang.String r0 = new java.lang.String
                r0.<init>(r6, r5)
                r12[r5] = r0
                return
            L2a:
                r1 = r8[r2]
                r7 = r0
                goto L14
            L2e:
                r3 = r5
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: o.as.e.c.u(byte, int, byte, java.lang.Object[]):void");
        }

        public static c valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = f20626l + 43;
            f20625k = i3 % 128;
            int i4 = i3 % 2;
            c cVar = (c) Enum.valueOf(c.class, str);
            int i5 = f20626l + 41;
            f20625k = i5 % 128;
            int i6 = i5 % 2;
            return cVar;
        }

        public static c[] values() {
            int i2 = 2 % 2;
            int i3 = f20625k + 11;
            f20626l = i3 % 128;
            int i4 = i3 % 2;
            c[] cVarArr = f20617c;
            if (i4 != 0) {
                return (c[]) cVarArr.clone();
            }
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x020e  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x02c0  */
        @Override // o.en.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String a() throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1422
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.as.e.c.a():java.lang.String");
        }

        public final i.b b() throws Throwable {
            int i2 = 2 % 2;
            int i3 = f20625k + 87;
            f20626l = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = AnonymousClass4.f20607a[ordinal()];
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = AnonymousClass4.f20607a[ordinal()];
            if (i5 == 1) {
                i.b bVar = i.b.f24655e;
                int i6 = f20625k + 79;
                f20626l = i6 % 128;
                int i7 = i6 % 2;
                return bVar;
            }
            if (i5 == 2) {
                return i.b.f24653c;
            }
            if (i5 == 3) {
                return i.b.f24652a;
            }
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            s((short) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 2070348464 + (KeyEvent.getMaxKeyCode() >> 16), 2065861403 - MotionEvent.axisFromString(""), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 45, (byte) (102 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), objArr);
            throw new UnsupportedOperationException(sb.append(((String) objArr[0]).intern()).append(name()).toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0017). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$j(short r5, int r6, int r7) {
        /*
            int r2 = r7 * 2
            int r1 = 1 - r2
            int r0 = r6 * 3
            int r7 = r0 + 4
            int r0 = r5 * 4
            int r0 = r0 + 116
            byte[] r6 = o.as.e.$$d
            byte[] r5 = new byte[r1]
            r4 = 0
            int r3 = 0 - r2
            if (r6 != 0) goto L2b
            r2 = r7
            r1 = r4
        L17:
            int r0 = -r0
            int r7 = r7 + r0
            int r2 = r2 + 1
        L1b:
            byte r0 = (byte) r7
            r5[r1] = r0
            if (r1 != r3) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L26:
            r0 = r6[r2]
            int r1 = r1 + 1
            goto L17
        L2b:
            r1 = r4
            r2 = r7
            r7 = r0
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: o.as.e.$$j(short, int, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f20601t = 0;
        f20600q = 1;
        f20598m = 0;
        f20597k = 1;
        l();
        int i2 = f20601t + 59;
        f20600q = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 70 / 0;
        }
    }

    public e(Context context, a aVar, o.en.b bVar) {
        super(context, aVar, bVar, o.bg.e.f21119q);
    }

    static void init$0() {
        $$d = new byte[]{95, MessagePack.Code.FALSE, -107, -90};
        $$e = 50;
    }

    static void l() {
        f20599o = new char[]{56498, 56553, 56551, 56551, 56557, 56558, 56537, 56536, 56553, 56552, 56557, 56545, 56540, 56550, 56548, 56551, 56551, 56535, 56330, 56729, 56718, 56711, 56727, 56727, 56724, 56726, 56716, 56721, 56733, 56728, 56729, 56439, 56406, 56406, 56422, 56711, 56727, 56727, 56724, 56726, 56434, 56418, 56710, 56728, 56728, 56734, 56730, 56726, 56438, 56417, 56706, 56729, 56731, 56434, 56413, 56413, 56503, 56553, 56552, 56557, 56545, 56540, 56550, 56548, 56551, 56551, 56551};
    }

    private b m() {
        int i2 = 2 % 2;
        b bVar = new b(this);
        int i3 = f20597k + 65;
        f20598m = i3 % 128;
        if (i3 % 2 == 0) {
            return bVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void r(String str, int[] iArr, boolean z2, Object[] objArr) throws Throwable {
        int i2;
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $10 + 113;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        m mVar = new m();
        int i6 = 0;
        int i7 = iArr[0];
        int i8 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        char[] cArr = f20599o;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i11 = 0;
            while (i11 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i11])};
                    Object objA = o.d.d.a(-2071388435);
                    if (objA == null) {
                        byte b2 = (byte) i6;
                        byte b3 = b2;
                        objA = o.d.d.a((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 249, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 11 - TextUtils.getOffsetAfter("", i6), 1376582792, false, $$j(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr2[i11] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i11++;
                    int i12 = $11 + 93;
                    $10 = i12 % 128;
                    if (i12 % 2 != 0) {
                        int i13 = 4 % 2;
                    }
                    i6 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i8];
        System.arraycopy(cArr, i7, cArr3, 0, i8);
        if (bArr != null) {
            char[] cArr4 = new char[i8];
            mVar.f19943d = 0;
            int i14 = $10 + 31;
            $11 = i14 % 128;
            int i15 = i14 % 2;
            char c2 = 0;
            while (mVar.f19943d < i8) {
                if (bArr[mVar.f19943d] == 1) {
                    int i16 = mVar.f19943d;
                    Object[] objArr3 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA2 = o.d.d.a(120026474);
                    if (objA2 == null) {
                        objA2 = o.d.d.a(Color.green(0) + 11, (char) (ImageFormat.getBitsPerPixel(0) + 1), Color.red(0) + 10, -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i16] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                } else {
                    int i17 = mVar.f19943d;
                    Object[] objArr4 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA3 = o.d.d.a(1632715197);
                    if (objA3 == null) {
                        byte b4 = (byte) 1;
                        byte b5 = (byte) (b4 - 1);
                        objA3 = o.d.d.a(Color.alpha(0) + 836, (char) (27278 - ImageFormat.getBitsPerPixel(0)), 11 - TextUtils.indexOf("", "", 0, 0), -1210801192, false, $$j(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i17] = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[mVar.f19943d];
                Object[] objArr5 = {mVar, mVar};
                Object objA4 = o.d.d.a(-1041906996);
                if (objA4 == null) {
                    objA4 = o.d.d.a(21 - Color.green(0), (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 35715), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 11, 392175785, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i10 > 0) {
            char[] cArr5 = new char[i8];
            i2 = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i8);
            int i18 = i8 - i10;
            System.arraycopy(cArr5, 0, cArr3, i18, i10);
            System.arraycopy(cArr5, i10, cArr3, 0, i18);
        } else {
            i2 = 0;
        }
        if (z2) {
            char[] cArr6 = new char[i8];
            while (true) {
                mVar.f19943d = i2;
                if (mVar.f19943d >= i8) {
                    break;
                }
                int i19 = $10 + 3;
                $11 = i19 % 128;
                int i20 = i19 % 2;
                cArr6[mVar.f19943d] = cArr3[(i8 - mVar.f19943d) - 1];
                i2 = mVar.f19943d + 1;
            }
            cArr3 = cArr6;
        }
        if (i9 > 0) {
            int i21 = $10 + 117;
            $11 = i21 % 128;
            int i22 = i21 % 2;
            int i23 = 0;
            while (true) {
                mVar.f19943d = i23;
                if (mVar.f19943d >= i8) {
                    break;
                }
                cArr3[mVar.f19943d] = (char) (cArr3[mVar.f19943d] - iArr[2]);
                i23 = mVar.f19943d + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    public final void b(d dVar, String str, c cVar, o.ep.d dVar2, i iVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f20597k + 11;
        f20598m = i3 % 128;
        int i4 = i3 % 2;
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            r("\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000", new int[]{0, 18, 0, 0}, true, objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            r("\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000", new int[]{18, 38, 176, 0}, false, objArr2);
            o.ea.f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(dVar2.b()).toString());
        }
        this.f20603g = dVar;
        this.f20604j = str;
        this.f20602f = cVar;
        this.f20606n = dVar2;
        this.f20605l = iVar;
        a();
        int i5 = f20598m + 125;
        f20597k = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // o.ab.e
    public final /* synthetic */ o.ab.c c() {
        int i2 = 2 % 2;
        int i3 = f20597k + 125;
        f20598m = i3 % 128;
        int i4 = i3 % 2;
        b bVarM = m();
        int i5 = f20597k + 15;
        f20598m = i5 % 128;
        if (i5 % 2 == 0) {
            return bVarM;
        }
        throw null;
    }

    @Override // o.ab.e
    public final String e() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f20598m + 103;
        f20597k = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        r("\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000", new int[]{0, 18, 0, 0}, true, objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i5 = f20598m + 11;
        f20597k = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 25 / 0;
        }
        return strIntern;
    }
}
