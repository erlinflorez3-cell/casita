package o.z;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import cz.msebera.android.httpclient.HttpStatus;
import fr.antelop.sdk.card.CreateCardRequestPanSource;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Random;
import o.a.k;
import o.a.q;
import o.ab.j;
import o.cg.f;
import o.dd.g;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends o.ab.e<d> {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final byte[] $$j = null;
    private static final int $$k = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f27372k = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static long f27373n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static long f27374o = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static int f27375q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static int f27376r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static int f27377s = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    c f27378f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    o.en.e f27379g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    o.z.d f27380j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    String f27381l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    String f27382m;

    /* JADX INFO: renamed from: o.z.a$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f27383a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f27384b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f27385c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final /* synthetic */ int[] f27386d;

        static {
            int[] iArr = new int[CreateCardRequestPanSource.values().length];
            f27383a = iArr;
            try {
                iArr[CreateCardRequestPanSource.IssuerPush.ordinal()] = 1;
                int i2 = f27384b;
                int i3 = (((-1) - (((-1) - i2) & ((-1) - 91))) << 1) - (i2 ^ 91);
                f27385c = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27383a[CreateCardRequestPanSource.ManualEntry.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27383a[CreateCardRequestPanSource.NfcScan.ordinal()] = 3;
                int i6 = f27384b;
                int i7 = ((-1) - (((-1) - i6) | ((-1) - 109))) + ((-1) - (((-1) - i6) & ((-1) - 109)));
                f27385c = i7 % 128;
                int i8 = i7 % 2;
                int i9 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27383a[CreateCardRequestPanSource.CameraScan.ordinal()] = 4;
                int i10 = f27385c;
                int i11 = (i10 ^ 113) + ((i10 & 113) << 1);
                f27384b = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 2 % 2;
                }
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[o.en.e.values().length];
            f27386d = iArr2;
            try {
                iArr2[o.en.e.f24190c.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f27386d[o.en.e.f24191e.ordinal()] = 2;
                int i13 = f27384b + 43;
                f27385c = i13 % 128;
                int i14 = i13 % 2;
                int i15 = 2 % 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f27386d[o.en.e.f24189b.ordinal()] = 3;
                int i16 = f27384b;
                int i17 = (((i16 + 87) - (87 & i16)) << 1) - (i16 ^ 87);
                f27385c = i17 % 128;
                if (i17 % 2 != 0) {
                    int i18 = 89 / 0;
                }
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b {
        b() {
        }
    }

    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f27387a = -970831458;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f27388b = -365741486;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f27389c = -423463748;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static int f27390d = 617672600;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static int f27391e = -1888586254;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static int f27392f = 1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static int f27393h = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private o.ef.a f27396j;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private byte[][] f27395i = new byte[10][];

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f27394g = 0;

        c() {
        }

        private static /* synthetic */ Object b(Object[] objArr) {
            c cVar = (c) objArr[0];
            o.ef.a aVar = (o.ef.a) objArr[1];
            int i2 = 2 % 2;
            int i3 = f27393h;
            int i4 = ((67 | i3) << 1) - (i3 ^ 67);
            f27392f = i4 % 128;
            if (i4 % 2 != 0) {
                cVar.f27396j = aVar;
                return null;
            }
            cVar.f27396j = aVar;
            int i5 = 2 / 0;
            return null;
        }

        private static /* synthetic */ Object c(Object[] objArr) {
            byte[][] bArr;
            c cVar = (c) objArr[0];
            int i2 = 2 % 2;
            int i3 = f27393h;
            int i4 = (i3 ^ 39) + ((i3 & 39) << 1);
            f27392f = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = cVar.f27394g;
                bArr = new byte[i5][];
                System.arraycopy(cVar.f27395i, 0, bArr, 0, i5);
            } else {
                int i6 = cVar.f27394g;
                bArr = new byte[i6][];
                System.arraycopy(cVar.f27395i, 0, bArr, 0, i6);
            }
            int i7 = f27392f;
            int i8 = (i7 & 5) + ((i7 + 5) - (i7 & 5));
            f27393h = i8 % 128;
            if (i8 % 2 == 0) {
                return bArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ Object e(int i2, int i3, int i4, Object[] objArr, int i5, int i6, int i7) {
            int i8 = ~i5;
            int i9 = ~i2;
            int i10 = (-1) - (((-1) - (~(i8 | i9))) & ((-1) - (~((i9 + i3) - (i9 & i3)))));
            int i11 = ~i3;
            int i12 = (i11 + i5) - (i11 & i5);
            int i13 = ~((i12 + i2) - (i12 & i2));
            int i14 = (i10 + i13) - (i10 & i13);
            int i15 = ~(i3 | i9 | i5);
            int i16 = (i15 + i13) - (i15 & i13);
            int i17 = i5 | i2;
            int i18 = i5 + i2 + i6 + ((-1865910757) * i7) + ((-1665280692) * i4);
            int i19 = i18 * i18;
            int i20 = ((i5 * (-906343980)) - 215482368) + ((-906343980) * i2) + (i14 * (-2063747539)) + (2063747539 * i16) + ((-2063747539) * i17) + (1324875776 * i6) + ((-1540882432) * i7) + ((-912261120) * i4) + (1566179328 * i19);
            int i21 = (i5 * (-52584228)) + 761582770 + (i2 * (-52584228)) + (i14 * HttpStatus.SC_UNSUPPORTED_MEDIA_TYPE) + (i16 * (-415)) + (i17 * HttpStatus.SC_UNSUPPORTED_MEDIA_TYPE) + (i6 * (-52583813)) + (i7 * (-195242759)) + (i4 * 1657508740) + (i19 * (-834797568));
            return i20 + ((i21 * i21) * 1251344384) != 1 ? b(objArr) : c(objArr);
        }

        final void a() {
            int i2 = 2 % 2;
            int i3 = f27392f + 73;
            f27393h = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 0;
            while (i5 < this.f27394g) {
                int i6 = f27392f;
                int i7 = (i6 ^ 79) + ((i6 & 79) << 1);
                f27393h = i7 % 128;
                if (i7 % 2 != 0) {
                    Arrays.fill(this.f27395i[i5], (byte) 0);
                    i5 += 89;
                } else {
                    Arrays.fill(this.f27395i[i5], (byte) 0);
                    i5++;
                }
                int i8 = f27393h;
                int i9 = (i8 ^ 89) + ((i8 & 89) << 1);
                f27392f = i9 % 128;
                int i10 = i9 % 2;
            }
            int i11 = f27392f;
            int i12 = (((-1) - (((-1) - i11) & ((-1) - 83))) << 1) - (i11 ^ 83);
            f27393h = i12 % 128;
            int i13 = i12 % 2;
        }

        public final void a(o.ef.a aVar) {
            int iNextInt = new Random().nextInt(1672229714);
            int iNextInt2 = new Random().nextInt(649353103);
            int id = (int) Thread.currentThread().getId();
            int i2 = f27391e * 1256060988;
            f27391e = i2;
            e(948712497, iNextInt, i2, new Object[]{this, aVar}, -948712497, iNextInt2, id);
        }

        final byte[][] c() {
            int i2 = (-2026356971) * f27389c;
            f27389c = i2;
            int i3 = f27390d * (-1969131550);
            f27390d = i3;
            int i4 = f27387a * 1380350138;
            f27387a = i4;
            int i5 = (-1790037317) * f27388b;
            f27388b = i5;
            return (byte[][]) e(1022572729, i2, i5, new Object[]{this}, -1022572728, i3, i4);
        }

        final o.ef.a d() {
            int i2 = 2 % 2;
            int i3 = f27393h + 95;
            int i4 = i3 % 128;
            f27392f = i4;
            int i5 = i3 % 2;
            o.ef.a aVar = this.f27396j;
            int i6 = i4 + 87;
            f27393h = i6 % 128;
            if (i6 % 2 == 0) {
                return aVar;
            }
            throw null;
        }

        final int e(byte[] bArr) {
            int i2 = 2 % 2;
            int i3 = f27393h;
            int i4 = (i3 ^ 5) + (((-1) - (((-1) - i3) | ((-1) - 5))) << 1);
            f27392f = i4 % 128;
            int i5 = i4 % 2;
            int i6 = this.f27394g;
            if (i6 == 10) {
                throw new ArrayIndexOutOfBoundsException();
            }
            this.f27395i[i6] = bArr;
            this.f27394g = (i6 ^ 1) + ((1 & i6) << 1);
            int i7 = (((-1) - (((-1) - i3) & ((-1) - 3))) << 1) - (i3 ^ 3);
            f27392f = i7 % 128;
            int i8 = i7 % 2;
            return i6;
        }
    }

    public interface d {
        void a();

        void b(o.bg.c cVar);
    }

    static final class e extends j<a> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f27397b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f27398c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f27399d = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static short[] f27400f = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static int f27401g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static byte[] f27402h = null;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static int f27403i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static int f27404j = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static int f27405l = 0;

        /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:5:0x0016). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$k(byte r7, int r8, byte r9) {
            /*
                int r3 = r8 * 3
                int r2 = 1 - r3
                int r0 = r7 + 103
                byte[] r8 = o.z.a.e.$$d
                int r1 = r9 * 2
                int r7 = r1 + 4
                byte[] r6 = new byte[r2]
                r5 = 0
                int r4 = 0 - r3
                if (r8 != 0) goto L2f
                r2 = r4
                r1 = r7
                r3 = r5
            L16:
                int r0 = -r2
                int r7 = r7 + r0
                int r1 = r1 + 1
                r2 = r3
                r0 = r7
                r7 = r1
            L1d:
                byte r1 = (byte) r0
                r6[r2] = r1
                int r3 = r2 + 1
                if (r2 != r4) goto L2a
                java.lang.String r0 = new java.lang.String
                r0.<init>(r6, r5)
                return r0
            L2a:
                r2 = r8[r7]
                r1 = r7
                r7 = r0
                goto L16
            L2f:
                r2 = r5
                goto L1d
            */
            throw new UnsupportedOperationException("Method not decompiled: o.z.a.e.$$k(byte, int, byte):java.lang.String");
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            f27397b = -1794350800;
            f27398c = -1308283144;
            f27403i = 0;
            f27405l = 1;
            f27399d = -1632623265;
            f27401g = 1150422449;
            f27404j = -728723459;
            f27402h = new byte[]{126, -97, -110, 82, 127, -103, 112, 121, -99, 99, 99, 99, 103, 125, 97, 127, 104, 123, 99, 100, 126, 100, 97, 96, 98, 121, 99, 38, -8, Ascii.SI, 44, 3, 45, -25, -6, Ascii.ESC, 46, MessagePack.Code.STR32, Ascii.US, -8, 10, 8, 2, -115, -115, -115, -115};
        }

        e(a aVar) {
            super(aVar, true);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static /* synthetic */ Object b(Object[] objArr) throws Throwable {
            e eVar = (e) objArr[0];
            int i2 = 2 % 2;
            Object[] objArr2 = {eVar.j().e().j(), ((a) eVar.e()).f27382m, ((a) eVar.e()).f27381l, ((a) eVar.e()).f27379g};
            int i3 = o.ek.e.f24026e * (-1277290283);
            o.ek.e.f24026e = i3;
            int i4 = o.ek.e.f24025d * (-660549863);
            o.ek.e.f24025d = i4;
            o.ek.e.b(i3, 1607389248, (int) SystemClock.uptimeMillis(), i4, objArr2, (int) Runtime.getRuntime().freeMemory(), -1607389246);
            eVar.j().e(eVar.h());
            eVar.j().e().f().e(new o.dk.a(eVar.h()));
            Object[] objArr3 = {((a) eVar.e()).d()};
            int i5 = 1232037242 * o.bg.c.f21082a;
            o.bg.c.f21082a = i5;
            int iMyUid = Process.myUid();
            int i6 = 1942342535 * o.bg.c.f21083c;
            o.bg.c.f21083c = i6;
            if (((Boolean) o.bg.c.a(i5, i6, iMyUid, -1017985026, objArr3, 1017985027, new Random().nextInt())).booleanValue()) {
                int i7 = f27405l + 51;
                f27403i = i7 % 128;
                if (i7 % 2 != 0) {
                    o.z.d dVar = ((a) eVar.e()).f27380j;
                    byte b2 = (byte) (-1);
                    byte b3 = (byte) (b2 + 1);
                    Object[] objArr4 = new Object[1];
                    z(b2, b3, b3, objArr4);
                    Class.forName((String) objArr4[0]).isInstance(dVar);
                    throw null;
                }
                o.z.d dVar2 = ((a) eVar.e()).f27380j;
                byte b4 = (byte) (-1);
                byte b5 = (byte) (b4 + 1);
                Object[] objArr5 = new Object[1];
                z(b4, b5, b5, objArr5);
                if (Class.forName((String) objArr5[0]).isInstance(dVar2)) {
                    eVar.i().a(new o.dd.e(o.az.a.f20791b, g.C));
                    int i8 = f27405l + 29;
                    f27403i = i8 % 128;
                    int i9 = i8 % 2;
                }
            }
            return null;
        }

        private static o.cg.b b(Context context) {
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int iNextInt = new Random().nextInt();
            int i2 = f27397b * 1132251217;
            f27397b = i2;
            return (o.cg.b) c(iElapsedRealtime, 1885853451, new Object[]{context}, i2, elapsedCpuTime, iNextInt, -1885853450);
        }

        public static /* synthetic */ Object c(int i2, int i3, Object[] objArr, int i4, int i5, int i6, int i7) {
            int i8 = ~i7;
            int i9 = (~(i8 | i5)) | i3;
            int i10 = (-1) - (((-1) - i5) & ((-1) - i3));
            int i11 = (i10 + i8) - (i10 & i8);
            int i12 = i3 + i7 + i2 + (1159740906 * i6) + ((-617157175) * i4);
            int i13 = i12 * i12;
            int i14 = ((i3 * 934236018) - 2089811968) + (934236018 * i7) + (i9 * (-953110385)) + ((-953110385) * i11) + (953110385 * i8) + ((-18874368) * i2) + (1488977920 * i6) + (2111832064 * i4) + (2070937600 * i13);
            int i15 = (i3 * (-824977050)) + 1921657099 + (i7 * (-824977050)) + (i9 * (-923)) + (i11 * (-923)) + (i8 * 923) + (i2 * (-824977973)) + (i6 * (-135083378)) + (i4 * 1125239651) + (i13 * 298844160);
            return i14 + ((i15 * i15) * 2098200576) != 1 ? b(objArr) : d(objArr);
        }

        private static /* synthetic */ Object d(Object[] objArr) throws Throwable {
            Context context = (Context) objArr[0];
            int i2 = 2 % 2;
            Object[] objArr2 = new Object[1];
            v((short) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 18), 635295543 - (Process.myTid() >> 22), 1878883778 - Color.argb(0, 0, 0, 0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 41, (byte) View.MeasureSpec.getSize(0), objArr2);
            o.cg.b bVar = new o.cg.b(context, 21, ((String) objArr2[0]).intern());
            int i3 = f27403i + 57;
            f27405l = i3 % 128;
            if (i3 % 2 != 0) {
                return bVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static void init$0() {
            $$a = new byte[]{120, 46, 101, 90, 65, -76, 76, MessagePack.Code.UINT8};
            $$b = 205;
        }

        static void init$1() {
            $$d = new byte[]{Ascii.VT, -11, 98, 72};
            $$e = 111;
        }

        private static void v(short s2, int i2, int i3, int i4, byte b2, Object[] objArr) throws Throwable {
            boolean z2;
            long j2;
            int i5;
            int length;
            byte[] bArr;
            int i6 = 2 % 2;
            o.a.j jVar = new o.a.j();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(f27401g)};
                Object objA = o.d.d.a(-727631768);
                if (objA == null) {
                    int iMyTid = (Process.myTid() >> 22) + 238;
                    char cLastIndexOf = (char) (44530 - TextUtils.lastIndexOf("", '0', 0));
                    int i7 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 11;
                    byte b3 = (byte) ($$e & 1);
                    byte b4 = (byte) (b3 - 1);
                    objA = o.d.d.a(iMyTid, cLastIndexOf, i7, 35969549, false, $$k(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                if (iIntValue == -1) {
                    int i8 = $10 + 17;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    byte[] bArr2 = f27402h;
                    if (bArr2 != null) {
                        int length2 = bArr2.length;
                        byte[] bArr3 = new byte[length2];
                        for (int i10 = 0; i10 < length2; i10++) {
                            Object[] objArr3 = {Integer.valueOf(bArr2[i10])};
                            Object objA2 = o.d.d.a(-1239398195);
                            if (objA2 == null) {
                                byte b5 = (byte) 0;
                                byte b6 = b5;
                                objA2 = o.d.d.a(628 - (KeyEvent.getMaxKeyCode() >> 16), (char) ((Process.myTid() >> 22) + 28649), 11 - View.MeasureSpec.getMode(0), 1621469864, false, $$k(b5, b6, b6), new Class[]{Integer.TYPE});
                            }
                            bArr3[i10] = ((Byte) ((Method) objA2).invoke(null, objArr3)).byteValue();
                        }
                        bArr2 = bArr3;
                    }
                    if (bArr2 != null) {
                        byte[] bArr4 = f27402h;
                        Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(f27399d)};
                        Object objA3 = o.d.d.a(-727631768);
                        if (objA3 == null) {
                            int i11 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 237;
                            char c2 = (char) (44532 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                            int doubleTapTimeout = 11 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                            byte b7 = (byte) ($$e & 1);
                            byte b8 = (byte) (b7 - 1);
                            objA3 = o.d.d.a(i11, c2, doubleTapTimeout, 35969549, false, $$k(b7, b8, b8), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (((long) bArr4[((Integer) ((Method) objA3).invoke(null, objArr4)).intValue()]) ^ (-7649639543924978291L))) + ((int) (((long) f27401g) ^ (-7649639543924978291L))));
                        j2 = -7649639543924978291L;
                    } else {
                        j2 = -7649639543924978291L;
                        iIntValue = (short) (((short) (((long) f27400f[i2 + ((int) (((long) f27399d) ^ (-7649639543924978291L)))]) ^ (-7649639543924978291L))) + ((int) (((long) f27401g) ^ (-7649639543924978291L))));
                    }
                } else {
                    j2 = -7649639543924978291L;
                }
                if (iIntValue > 0) {
                    int i12 = ((i2 + iIntValue) - 2) + ((int) (((long) f27399d) ^ j2));
                    if (z2) {
                        int i13 = $10 + 69;
                        $11 = i13 % 128;
                        int i14 = i13 % 2;
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                    jVar.f19936d = i12 + i5;
                    Object[] objArr5 = {jVar, Integer.valueOf(i3), Integer.valueOf(f27404j), sb};
                    Object objA4 = o.d.d.a(1819197256);
                    if (objA4 == null) {
                        objA4 = o.d.d.a(View.combineMeasuredStates(0, 0), (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 5358), TextUtils.lastIndexOf("", '0', 0, 0) + 12, -1158980307, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objA4).invoke(null, objArr5)).append(jVar.f19937e);
                    jVar.f19935c = jVar.f19937e;
                    byte[] bArr5 = f27402h;
                    if (bArr5 != null) {
                        int i15 = $10 + 7;
                        $11 = i15 % 128;
                        if (i15 % 2 == 0) {
                            length = bArr5.length;
                            bArr = new byte[length];
                        } else {
                            length = bArr5.length;
                            bArr = new byte[length];
                        }
                        for (int i16 = 0; i16 < length; i16++) {
                            bArr[i16] = (byte) (((long) bArr5[i16]) ^ (-7649639543924978291L));
                        }
                        bArr5 = bArr;
                    }
                    boolean z3 = bArr5 != null;
                    jVar.f19934b = 1;
                    while (jVar.f19934b < iIntValue) {
                        if (z3) {
                            byte[] bArr6 = f27402h;
                            jVar.f19936d = jVar.f19936d - 1;
                            jVar.f19937e = (char) (jVar.f19935c + (((byte) (((byte) (((long) bArr6[r3]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                        } else {
                            short[] sArr = f27400f;
                            jVar.f19936d = jVar.f19936d - 1;
                            jVar.f19937e = (char) (jVar.f19935c + (((short) (((short) (((long) sArr[r3]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                        }
                        sb.append(jVar.f19937e);
                        jVar.f19935c = jVar.f19937e;
                        jVar.f19934b++;
                        int i17 = $11 + 125;
                        $10 = i17 % 128;
                        if (i17 % 2 != 0) {
                            int i18 = 5 / 3;
                        }
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

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0016). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void z(int r6, int r7, short r8, java.lang.Object[] r9) {
            /*
                int r0 = r8 * 2
                int r8 = 111 - r0
                int r1 = r7 * 4
                int r0 = r1 + 5
                int r7 = r6 + 4
                byte[] r6 = o.z.a.e.$$a
                byte[] r5 = new byte[r0]
                int r4 = r1 + 4
                r3 = 0
                if (r6 != 0) goto L2f
                r0 = r8
                r2 = r3
                r1 = r7
            L16:
                int r0 = -r0
                int r7 = r7 + r0
                r8 = r7
                r7 = r1
            L1a:
                byte r0 = (byte) r8
                r5[r2] = r0
                if (r2 != r4) goto L27
                java.lang.String r0 = new java.lang.String
                r0.<init>(r5, r3)
                r9[r3] = r0
                return
            L27:
                int r2 = r2 + 1
                int r1 = r7 + 1
                r0 = r6[r1]
                r7 = r8
                goto L16
            L2f:
                r2 = r3
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: o.z.a.e.z(int, int, short, java.lang.Object[]):void");
        }

        @Override // o.ab.j
        public final /* synthetic */ f a(Context context) {
            int i2 = 2 % 2;
            int i3 = f27405l + 103;
            f27403i = i3 % 128;
            int i4 = i3 % 2;
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int iNextInt = new Random().nextInt();
            int i5 = f27397b * 1132251217;
            f27397b = i5;
            o.cg.b bVar = (o.cg.b) c(iElapsedRealtime, 1885853451, new Object[]{context}, i5, elapsedCpuTime, iNextInt, -1885853450);
            int i6 = f27405l + 69;
            f27403i = i6 % 128;
            int i7 = i6 % 2;
            return bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j
        public final void a(o.ef.a aVar) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f27403i + 73;
            f27405l = i3 % 128;
            int i4 = i3 % 2;
            a aVar2 = (a) e();
            Object[] objArr = new Object[1];
            v((short) (112 - Color.green(0)), 635295560 + (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), Color.rgb(0, 0, 0) + 1895661043, (-53) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), objArr);
            Object[] objArr2 = {aVar, ((String) objArr[0]).intern()};
            int i5 = o.ef.a.f23782p * (-1576737484);
            o.ef.a.f23782p = i5;
            aVar2.f27382m = (String) o.ef.a.a(-781664457, objArr2, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i5, Thread.currentThread().getPriority());
            a aVar3 = (a) e();
            Object[] objArr3 = new Object[1];
            v((short) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 123), 635295566 + (ViewConfiguration.getWindowTouchSlop() >> 8), 1878883833 + (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) - 48, (byte) (ViewConfiguration.getTouchSlop() >> 8), objArr3);
            aVar3.f27381l = aVar.s(((String) objArr3[0]).intern());
            int i6 = f27403i + 45;
            f27405l = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 77 / 0;
            }
        }

        @Override // o.ab.j
        public final o.bg.a b(int i2) {
            int i3 = 2 % 2;
            if (i2 != 2100) {
                int i4 = f27403i + 101;
                f27405l = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 81 / 0;
                }
                return null;
            }
            int i6 = f27403i + 57;
            f27405l = i6 % 128;
            if (i6 % 2 != 0) {
                return o.bg.a.at;
            }
            o.bg.a aVar = o.bg.a.at;
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
        @Override // o.ab.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final o.bg.a b(o.cg.i r5) {
            /*
                r4 = this;
                r3 = 2
                int r0 = r3 % r3
                int r0 = o.z.a.e.f27405l
                int r1 = r0 + 41
                int r0 = r1 % 128
                o.z.a.e.f27403i = r0
                int r1 = r1 % r3
                if (r1 == 0) goto L38
                o.cg.d r0 = r5.c()
                o.cg.c r2 = r0.e()
                o.cg.c r1 = o.cg.c.f22266s
                r0 = 19
                int r0 = r0 / 0
                if (r2 != r1) goto L45
            L1e:
                o.cg.h r1 = r5.j()
                o.cg.h r0 = o.cg.h.f22342e
                if (r1 != r0) goto L45
                o.bg.a r2 = o.bg.a.aw
                int r0 = o.z.a.e.f27405l
                int r1 = r0 + 39
                int r0 = r1 % 128
                o.z.a.e.f27403i = r0
                int r1 = r1 % r3
                if (r1 == 0) goto L37
                r0 = 62
                int r0 = r0 / 0
            L37:
                return r2
            L38:
                o.cg.d r0 = r5.c()
                o.cg.c r1 = r0.e()
                o.cg.c r0 = o.cg.c.f22266s
                if (r1 != r0) goto L45
                goto L1e
            L45:
                o.bg.a r2 = super.b(r5)
                int r0 = o.z.a.e.f27405l
                int r1 = r0 + 111
                int r0 = r1 % 128
                o.z.a.e.f27403i = r0
                int r1 = r1 % r3
                if (r1 != 0) goto L55
                return r2
            L55:
                r0 = 0
                r0.hashCode()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.z.a.e.b(o.cg.i):o.bg.a");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.c
        public final void b(o.bg.c cVar) {
            int i2 = 2 % 2;
            int i3 = f27405l + 31;
            f27403i = i3 % 128;
            int i4 = i3 % 2;
            ((a) e()).g().b(cVar);
            int i5 = f27403i + 41;
            f27405l = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.c
        public final void c(o.bg.c cVar) {
            int i2 = 2 % 2;
            int i3 = f27403i + 93;
            f27405l = i3 % 128;
            int i4 = i3 % 2;
            ((a) e()).g().a();
            int i5 = f27403i + 95;
            f27405l = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // o.ab.j
        public final o.cg.j k() {
            int i2 = 2 % 2;
            int i3 = f27403i + 109;
            int i4 = i3 % 128;
            f27405l = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 55;
            f27403i = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 1 / 0;
            }
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j
        public final o.ef.a m() throws o.ef.b {
            int i2 = 2 % 2;
            int i3 = f27403i + 91;
            f27405l = i3 % 128;
            int i4 = i3 % 2;
            c cVar = ((a) e()).f27378f;
            if (i4 != 0) {
                return cVar.d();
            }
            cVar.d();
            throw null;
        }

        @Override // o.ab.j
        public final String o() throws Throwable {
            int i2 = 2 % 2;
            int i3 = f27405l + 29;
            f27403i = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            v((short) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) - 1), 635295534 - View.getDefaultSize(0, 0), 1878883827 + (ViewConfiguration.getScrollBarFadeDuration() >> 16), (-50) - (ViewConfiguration.getKeyRepeatDelay() >> 16), (byte) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), objArr);
            String strIntern = ((String) objArr[0]).intern();
            int i5 = f27405l + 45;
            f27403i = i5 % 128;
            int i6 = i5 % 2;
            return strIntern;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j
        public final byte[][] p() {
            int i2 = 2 % 2;
            int i3 = f27405l + 9;
            f27403i = i3 % 128;
            if (i3 % 2 == 0) {
                Object[] objArr = {((a) e()).f27378f};
                int i4 = c.f27389c * (-2026356971);
                c.f27389c = i4;
                int i5 = c.f27390d * (-1969131550);
                c.f27390d = i5;
                int i6 = c.f27387a * 1380350138;
                c.f27387a = i6;
                int i7 = c.f27388b * (-1790037317);
                c.f27388b = i7;
                return (byte[][]) c.e(1022572729, i4, i7, objArr, -1022572728, i5, i6);
            }
            Object[] objArr2 = {((a) e()).f27378f};
            int i8 = c.f27389c * (-2026356971);
            c.f27389c = i8;
            int i9 = c.f27390d * (-1969131550);
            c.f27390d = i9;
            int i10 = c.f27387a * 1380350138;
            c.f27387a = i10;
            int i11 = c.f27388b * (-1790037317);
            c.f27388b = i11;
            throw null;
        }

        @Override // o.ab.j
        public final void q() {
            int iMyUid = Process.myUid();
            int id = (int) Thread.currentThread().getId();
            int id2 = (int) Thread.currentThread().getId();
            int i2 = (-1460006530) * f27398c;
            f27398c = i2;
            c(id, -1974460894, new Object[]{this}, i2, iMyUid, id2, 1974460894);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$l(short r8, int r9, int r10) {
        /*
            int r8 = r8 + 71
            int r1 = r9 * 2
            int r0 = 1 - r1
            byte[] r7 = o.z.a.$$j
            int r6 = r10 + 4
            byte[] r5 = new byte[r0]
            r4 = 0
            int r3 = 0 - r1
            if (r7 != 0) goto L29
            r1 = r6
            r2 = r4
        L13:
            int r8 = r8 + r6
            r6 = r1
        L15:
            byte r0 = (byte) r8
            r5[r2] = r0
            int r1 = r6 + 1
            if (r2 != r3) goto L22
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L22:
            int r2 = r2 + 1
            r0 = r7[r1]
            r6 = r8
            r8 = r0
            goto L13
        L29:
            r2 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: o.z.a.$$l(short, int, int):java.lang.String");
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        f27376r = 0;
        f27377s = 1;
        f27372k = 0;
        f27375q = 1;
        m();
        ViewConfiguration.getKeyRepeatDelay();
        View.resolveSizeAndState(0, 0, 0);
        AndroidCharacter.getMirror('0');
        int i2 = f27377s + 71;
        f27376r = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 19 / 0;
        }
    }

    public a(Context context, d dVar, o.en.b bVar) {
        super(context, dVar, bVar, o.bg.e.f21111i);
    }

    private static o.ef.a b(Object obj) throws Throwable {
        int i2 = 2 % 2;
        o.ef.a aVar = new o.ef.a();
        Object[] objArr = new Object[1];
        u("퇏ﭢ蒨凭笞ъ톈醙", ExpandableListView.getPackedPositionType(0L) + 10937, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        t("ㅉㄊ쒲\u2457줷࠘ˇ", ViewConfiguration.getDoubleTapTimeout() >> 16, objArr2);
        aVar.a(strIntern, (Object) ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        u("퇏纔轄\udc2b", ExpandableListView.getPackedPositionChild(0L) + 44880, objArr3);
        aVar.a(((String) objArr3[0]).intern(), obj);
        int i3 = f27375q + 31;
        f27372k = i3 % 128;
        int i4 = i3 % 2;
        return aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:220:0x09ad  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x09ae  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x02f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02c6 A[Catch: ArrayIndexOutOfBoundsException -> 0x0c7d, b -> 0x0c7f, TRY_ENTER, TRY_LEAVE, TryCatch #13 {ArrayIndexOutOfBoundsException -> 0x0c7d, b -> 0x0c7f, blocks: (B:4:0x002d, B:15:0x009d, B:17:0x00c6, B:24:0x013c, B:26:0x0190, B:29:0x01a5, B:32:0x01c4, B:34:0x01ca, B:45:0x0279, B:51:0x0281, B:55:0x0292, B:57:0x029c, B:59:0x02ab, B:81:0x035b, B:82:0x0363, B:85:0x0377, B:87:0x0393, B:90:0x03a5, B:217:0x0982, B:218:0x099e, B:236:0x0a73, B:238:0x0a9d, B:240:0x0acf, B:242:0x0b28, B:244:0x0b54, B:246:0x0b82, B:248:0x0bd8, B:250:0x0c06, B:231:0x0a0a, B:233:0x0a35, B:235:0x0a5b, B:222:0x09c4, B:77:0x034e, B:79:0x0354, B:61:0x02bc, B:62:0x02c3, B:65:0x02c6, B:93:0x03e0, B:98:0x040a, B:100:0x043d, B:102:0x0471, B:103:0x0477, B:122:0x052e, B:123:0x0530, B:105:0x0481, B:106:0x0485, B:108:0x0494, B:110:0x04bd, B:116:0x0518, B:117:0x051e, B:118:0x0525, B:120:0x0529, B:121:0x052d, B:124:0x0533, B:127:0x054f, B:129:0x0570, B:131:0x059c, B:132:0x05a2, B:136:0x05b0, B:134:0x05ab, B:135:0x05af, B:137:0x05b5, B:144:0x05fe, B:146:0x0625, B:148:0x0651, B:149:0x0657, B:153:0x0665, B:151:0x0660, B:152:0x0664, B:154:0x066a, B:156:0x0670, B:158:0x068b, B:160:0x06ba, B:161:0x06d4, B:170:0x0720, B:172:0x074e, B:174:0x077a, B:175:0x0780, B:190:0x0821, B:191:0x0823, B:177:0x078a, B:178:0x078e, B:180:0x07a5, B:182:0x07d7, B:184:0x080b, B:185:0x0811, B:186:0x0818, B:188:0x081c, B:189:0x0820, B:192:0x0826, B:195:0x086d, B:196:0x0889, B:211:0x093d, B:212:0x0954, B:210:0x0925, B:213:0x0957, B:216:0x096b, B:35:0x01fd, B:37:0x022c, B:252:0x0c56, B:254:0x0c66, B:255:0x0c7c, B:12:0x007b), top: B:302:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0317 A[Catch: ArrayIndexOutOfBoundsException -> 0x0c85, b -> 0x0ce6, TRY_LEAVE, TryCatch #14 {ArrayIndexOutOfBoundsException -> 0x0c85, b -> 0x0ce6, blocks: (B:74:0x0311, B:76:0x0317, B:66:0x02d4), top: B:300:0x02d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x034e A[Catch: ArrayIndexOutOfBoundsException -> 0x0c7d, b -> 0x0c7f, TRY_ENTER, TryCatch #13 {ArrayIndexOutOfBoundsException -> 0x0c7d, b -> 0x0c7f, blocks: (B:4:0x002d, B:15:0x009d, B:17:0x00c6, B:24:0x013c, B:26:0x0190, B:29:0x01a5, B:32:0x01c4, B:34:0x01ca, B:45:0x0279, B:51:0x0281, B:55:0x0292, B:57:0x029c, B:59:0x02ab, B:81:0x035b, B:82:0x0363, B:85:0x0377, B:87:0x0393, B:90:0x03a5, B:217:0x0982, B:218:0x099e, B:236:0x0a73, B:238:0x0a9d, B:240:0x0acf, B:242:0x0b28, B:244:0x0b54, B:246:0x0b82, B:248:0x0bd8, B:250:0x0c06, B:231:0x0a0a, B:233:0x0a35, B:235:0x0a5b, B:222:0x09c4, B:77:0x034e, B:79:0x0354, B:61:0x02bc, B:62:0x02c3, B:65:0x02c6, B:93:0x03e0, B:98:0x040a, B:100:0x043d, B:102:0x0471, B:103:0x0477, B:122:0x052e, B:123:0x0530, B:105:0x0481, B:106:0x0485, B:108:0x0494, B:110:0x04bd, B:116:0x0518, B:117:0x051e, B:118:0x0525, B:120:0x0529, B:121:0x052d, B:124:0x0533, B:127:0x054f, B:129:0x0570, B:131:0x059c, B:132:0x05a2, B:136:0x05b0, B:134:0x05ab, B:135:0x05af, B:137:0x05b5, B:144:0x05fe, B:146:0x0625, B:148:0x0651, B:149:0x0657, B:153:0x0665, B:151:0x0660, B:152:0x0664, B:154:0x066a, B:156:0x0670, B:158:0x068b, B:160:0x06ba, B:161:0x06d4, B:170:0x0720, B:172:0x074e, B:174:0x077a, B:175:0x0780, B:190:0x0821, B:191:0x0823, B:177:0x078a, B:178:0x078e, B:180:0x07a5, B:182:0x07d7, B:184:0x080b, B:185:0x0811, B:186:0x0818, B:188:0x081c, B:189:0x0820, B:192:0x0826, B:195:0x086d, B:196:0x0889, B:211:0x093d, B:212:0x0954, B:210:0x0925, B:213:0x0957, B:216:0x096b, B:35:0x01fd, B:37:0x022c, B:252:0x0c56, B:254:0x0c66, B:255:0x0c7c, B:12:0x007b), top: B:302:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0393 A[Catch: ArrayIndexOutOfBoundsException -> 0x0c7d, b -> 0x0c7f, TryCatch #13 {ArrayIndexOutOfBoundsException -> 0x0c7d, b -> 0x0c7f, blocks: (B:4:0x002d, B:15:0x009d, B:17:0x00c6, B:24:0x013c, B:26:0x0190, B:29:0x01a5, B:32:0x01c4, B:34:0x01ca, B:45:0x0279, B:51:0x0281, B:55:0x0292, B:57:0x029c, B:59:0x02ab, B:81:0x035b, B:82:0x0363, B:85:0x0377, B:87:0x0393, B:90:0x03a5, B:217:0x0982, B:218:0x099e, B:236:0x0a73, B:238:0x0a9d, B:240:0x0acf, B:242:0x0b28, B:244:0x0b54, B:246:0x0b82, B:248:0x0bd8, B:250:0x0c06, B:231:0x0a0a, B:233:0x0a35, B:235:0x0a5b, B:222:0x09c4, B:77:0x034e, B:79:0x0354, B:61:0x02bc, B:62:0x02c3, B:65:0x02c6, B:93:0x03e0, B:98:0x040a, B:100:0x043d, B:102:0x0471, B:103:0x0477, B:122:0x052e, B:123:0x0530, B:105:0x0481, B:106:0x0485, B:108:0x0494, B:110:0x04bd, B:116:0x0518, B:117:0x051e, B:118:0x0525, B:120:0x0529, B:121:0x052d, B:124:0x0533, B:127:0x054f, B:129:0x0570, B:131:0x059c, B:132:0x05a2, B:136:0x05b0, B:134:0x05ab, B:135:0x05af, B:137:0x05b5, B:144:0x05fe, B:146:0x0625, B:148:0x0651, B:149:0x0657, B:153:0x0665, B:151:0x0660, B:152:0x0664, B:154:0x066a, B:156:0x0670, B:158:0x068b, B:160:0x06ba, B:161:0x06d4, B:170:0x0720, B:172:0x074e, B:174:0x077a, B:175:0x0780, B:190:0x0821, B:191:0x0823, B:177:0x078a, B:178:0x078e, B:180:0x07a5, B:182:0x07d7, B:184:0x080b, B:185:0x0811, B:186:0x0818, B:188:0x081c, B:189:0x0820, B:192:0x0826, B:195:0x086d, B:196:0x0889, B:211:0x093d, B:212:0x0954, B:210:0x0925, B:213:0x0957, B:216:0x096b, B:35:0x01fd, B:37:0x022c, B:252:0x0c56, B:254:0x0c66, B:255:0x0c7c, B:12:0x007b), top: B:302:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03e0 A[Catch: ArrayIndexOutOfBoundsException -> 0x0c7d, b -> 0x0c7f, TRY_ENTER, TryCatch #13 {ArrayIndexOutOfBoundsException -> 0x0c7d, b -> 0x0c7f, blocks: (B:4:0x002d, B:15:0x009d, B:17:0x00c6, B:24:0x013c, B:26:0x0190, B:29:0x01a5, B:32:0x01c4, B:34:0x01ca, B:45:0x0279, B:51:0x0281, B:55:0x0292, B:57:0x029c, B:59:0x02ab, B:81:0x035b, B:82:0x0363, B:85:0x0377, B:87:0x0393, B:90:0x03a5, B:217:0x0982, B:218:0x099e, B:236:0x0a73, B:238:0x0a9d, B:240:0x0acf, B:242:0x0b28, B:244:0x0b54, B:246:0x0b82, B:248:0x0bd8, B:250:0x0c06, B:231:0x0a0a, B:233:0x0a35, B:235:0x0a5b, B:222:0x09c4, B:77:0x034e, B:79:0x0354, B:61:0x02bc, B:62:0x02c3, B:65:0x02c6, B:93:0x03e0, B:98:0x040a, B:100:0x043d, B:102:0x0471, B:103:0x0477, B:122:0x052e, B:123:0x0530, B:105:0x0481, B:106:0x0485, B:108:0x0494, B:110:0x04bd, B:116:0x0518, B:117:0x051e, B:118:0x0525, B:120:0x0529, B:121:0x052d, B:124:0x0533, B:127:0x054f, B:129:0x0570, B:131:0x059c, B:132:0x05a2, B:136:0x05b0, B:134:0x05ab, B:135:0x05af, B:137:0x05b5, B:144:0x05fe, B:146:0x0625, B:148:0x0651, B:149:0x0657, B:153:0x0665, B:151:0x0660, B:152:0x0664, B:154:0x066a, B:156:0x0670, B:158:0x068b, B:160:0x06ba, B:161:0x06d4, B:170:0x0720, B:172:0x074e, B:174:0x077a, B:175:0x0780, B:190:0x0821, B:191:0x0823, B:177:0x078a, B:178:0x078e, B:180:0x07a5, B:182:0x07d7, B:184:0x080b, B:185:0x0811, B:186:0x0818, B:188:0x081c, B:189:0x0820, B:192:0x0826, B:195:0x086d, B:196:0x0889, B:211:0x093d, B:212:0x0954, B:210:0x0925, B:213:0x0957, B:216:0x096b, B:35:0x01fd, B:37:0x022c, B:252:0x0c56, B:254:0x0c66, B:255:0x0c7c, B:12:0x007b), top: B:302:0x002d }] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, o.ef.a] */
    /* JADX WARN: Type inference failed for: r2v139, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v140 */
    /* JADX WARN: Type inference failed for: r2v141, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v151, types: [java.lang.Integer] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private o.z.a.c d(o.z.d r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.z.a.d(o.z.d):o.z.a$c");
    }

    static void init$0() {
        $$d = new byte[]{111, MessagePack.Code.MAP16, MessagePack.Code.TRUE, Ascii.DC4, 65, -76, 76, MessagePack.Code.UINT8};
        $$e = 38;
    }

    static void init$1() {
        $$j = new byte[]{100, 68, -66, 16};
        $$k = 96;
    }

    static void m() {
        f27374o = 5615487431569601228L;
        f27373n = -1462460591269618463L;
    }

    private static void t(String str, int i2, Object[] objArr) throws Throwable {
        Object obj;
        String str2 = str;
        int i3 = 2 % 2;
        if (str2 != null) {
            int i4 = $10 + 61;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            char[] charArray = str2.toCharArray();
            int i6 = $10 + 85;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            obj = charArray;
        } else {
            obj = str2;
        }
        k kVar = new k();
        char[] cArrC = k.c(f27374o ^ (-5882309809461882246L), (char[]) obj, i2);
        kVar.f19939c = 4;
        while (kVar.f19939c < cArrC.length) {
            kVar.f19938a = kVar.f19939c - 4;
            int i8 = kVar.f19939c;
            try {
                Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f27374o)};
                Object objA = o.d.d.a(-1093976004);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    objA = o.d.d.a((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 228, (char) (51003 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 9 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1749983833, false, $$l((byte) 36, b2, (byte) (b2 - 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrC[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {kVar, kVar};
                Object objA2 = o.d.d.a(-912105096);
                if (objA2 == null) {
                    byte b3 = (byte) 0;
                    objA2 = o.d.d.a((ViewConfiguration.getEdgeSlop() >> 16) + 675, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 13, 522683165, false, $$l((byte) 43, b3, (byte) (b3 - 1)), new Class[]{Object.class, Object.class});
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

    private static void u(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $10 + 37;
        $11 = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
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
            int i5 = $10 + 77;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = qVar.f19948a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                Object objA = o.d.d.a(-1011865131);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a(Gravity.getAbsoluteGravity(0, 0) + 731, (char) (KeyEvent.normalizeMetaState(0) + 7933), 11 - KeyEvent.getDeadChar(0, 0), 355847088, false, $$l(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i7] = ((Long) ((Method) objA).invoke(null, objArr2)).longValue() ^ (f27373n ^ 4743694005979712847L);
                Object[] objArr3 = {qVar, qVar};
                Object objA2 = o.d.d.a(1452497747);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    objA2 = o.d.d.a((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 835, (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 27279), Color.argb(0, 0, 0, 0) + 11, -2145994442, false, $$l((byte) 7, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
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
            int i8 = $10 + 67;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
            Object[] objArr4 = {qVar, qVar};
            Object objA3 = o.d.d.a(1452497747);
            if (objA3 == null) {
                byte b5 = (byte) 0;
                objA3 = o.d.d.a(837 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (27280 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), TextUtils.getOffsetAfter("", 0) + 11, -2145994442, false, $$l((byte) 7, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
            int i10 = $11 + 23;
            $10 = i10 % 128;
            int i11 = i10 % 2;
        }
        objArr[0] = new String(cArr2);
    }

    private static void v(short s2, short s3, short s4, Object[] objArr) {
        byte[] bArr = $$d;
        int i2 = s4 * 3;
        int i3 = (s2 * 3) + 111;
        int i4 = s3 + 4;
        byte[] bArr2 = new byte[5 - i2];
        int i5 = 4 - i2;
        int i6 = -1;
        if (bArr == null) {
            i3 = (-i3) + i4;
            i4 = i4;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i3;
            int i7 = i4 + 1;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i3 = (-bArr[i7]) + i3;
                i4 = i7;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(o.z.d r9, o.en.e r10) throws java.lang.Throwable {
        /*
            r8 = this;
            r7 = 2
            int r0 = r7 % r7
            int r0 = o.z.a.f27375q
            int r1 = r0 + 17
            int r0 = r1 % 128
            o.z.a.f27372k = r0
            int r1 = r1 % r7
            r6 = 0
            if (r1 == 0) goto L72
            r8.f27379g = r10
            o.z.a$c r0 = r8.d(r9)
            r8.f27378f = r0
            r8.f27380j = r9
            boolean r1 = o.ea.f.a()
            r0 = 23
            int r0 = r0 / r6
            if (r1 == 0) goto L6e
        L22:
            java.lang.String r0 = ""
            int r2 = android.text.TextUtils.indexOf(r0, r0)
            r5 = 1
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r0 = "폐펓㬬\udbe8뙵郷睼兼㊴렃㍻ᘯ혒㷪뀣锉嬵늻㻩ᡰ\ud8d4"
            t(r0, r2, r1)
            r0 = r1[r6]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r4 = r0.intern()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            int r2 = android.view.View.MeasureSpec.getMode(r6)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r0 = "冲凖ᡤ\uf8bd㭸╓練팏蜃魒빧ꎜ呁Ẻ㴹₵\ud91a醮뎃극媳ᓒ㛷⫮\udfeb阷뗓뜩䃐ञ⡛㑐숨豆꽧넩䝈\u0feb"
            t(r0, r2, r1)
            r0 = r1[r6]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.StringBuilder r1 = r3.append(r0)
            o.z.a$c r0 = r8.f27378f
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            o.ea.f.c(r4, r0)
            int r0 = o.z.a.f27375q
            int r1 = r0 + 29
            int r0 = r1 % 128
            o.z.a.f27372k = r0
            int r1 = r1 % r7
        L6e:
            r8.a()
            return
        L72:
            r8.f27379g = r10
            o.z.a$c r0 = r8.d(r9)
            r8.f27378f = r0
            r8.f27380j = r9
            boolean r0 = o.ea.f.a()
            if (r0 == 0) goto L6e
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: o.z.a.b(o.z.d, o.en.e):void");
    }

    @Override // o.ab.e
    public final o.ab.c<?> c() {
        int i2 = 2 % 2;
        e eVar = new e(this);
        int i3 = f27372k + 117;
        f27375q = i3 % 128;
        int i4 = i3 % 2;
        return eVar;
    }

    @Override // o.ab.e
    public final String e() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f27372k + 29;
        f27375q = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        t("폐펓㬬\udbe8뙵郷睼兼㊴렃㍻ᘯ혒㷪뀣锉嬵늻㻩ᡰ\ud8d4", Drawable.resolveOpacity(0, 0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i5 = f27372k + 109;
        f27375q = i5 % 128;
        if (i5 % 2 != 0) {
            return strIntern;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
