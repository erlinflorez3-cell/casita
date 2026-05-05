package o.bm;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import fr.antelop.sdk.WalletLockReason;
import java.lang.reflect.Method;
import o.a.i;
import o.a.o;
import o.ab.j;
import o.cg.b;
import o.cg.f;
import o.d.d;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends o.ab.e<c> {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static long f21379g = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static char f21380k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f21381l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f21382m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f21383n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f21384o = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static int f21385q = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    WalletLockReason f21386f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f21387j;

    /* JADX INFO: renamed from: o.bm.a$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f21388c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f21389d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final /* synthetic */ int[] f21390e;

        static {
            int[] iArr = new int[WalletLockReason.values().length];
            f21390e = iArr;
            try {
                iArr[WalletLockReason.FraudulentUseSuspected.ordinal()] = 1;
                int i2 = f21389d;
                int i3 = (i2 ^ 13) + (((i2 + 13) - (i2 | 13)) << 1);
                f21388c = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21390e[WalletLockReason.StopService.ordinal()] = 2;
                int i6 = f21389d;
                int i7 = ((i6 + 65) - (65 | i6)) + (i6 | 65);
                f21388c = i7 % 128;
                int i8 = i7 % 2;
                int i9 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21390e[WalletLockReason.StrongestCvmAttemptCountExceeded.ordinal()] = 3;
                int i10 = f21389d;
                int i11 = ((7 | i10) << 1) - (i10 ^ 7);
                f21388c = i11 % 128;
                int i12 = i11 % 2;
                int i13 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21390e[WalletLockReason.OtherReason.ordinal()] = 4;
                int i14 = f21389d + 35;
                f21388c = i14 % 128;
                if (i14 % 2 != 0) {
                    throw null;
                }
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public interface c {
        void a();

        void a(o.bg.c cVar);
    }

    static final class e extends j<a> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static long f21391b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f21392c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static char[] f21393d = null;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static int f21394i = 0;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0015). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$d(int r8, short r9, byte r10) {
            /*
                int r0 = r8 * 2
                int r8 = 4 - r0
                int r7 = r9 + 99
                byte[] r6 = o.bm.a.e.$$a
                int r1 = r10 * 2
                int r0 = 1 - r1
                byte[] r5 = new byte[r0]
                r4 = 0
                int r3 = 0 - r1
                if (r6 != 0) goto L2a
                r0 = r3
                r2 = r4
            L15:
                int r0 = -r0
                int r7 = r7 + r0
                int r8 = r8 + 1
                r1 = r2
            L1a:
                byte r0 = (byte) r7
                r5[r1] = r0
                int r2 = r1 + 1
                if (r1 != r3) goto L27
                java.lang.String r0 = new java.lang.String
                r0.<init>(r5, r4)
                return r0
            L27:
                r0 = r6[r8]
                goto L15
            L2a:
                r1 = r4
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: o.bm.a.e.$$d(int, short, byte):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f21392c = 0;
            f21394i = 1;
            f21393d = new char[]{38046, 27948, 26611, 31114, 34091, 31889, 30272, 26675, 25570, 25943, 24325, 22257, 18606, 16927, 17871, 16305, 12651, 10455, 8837, 9342, 7732, 4582, 2900, 38016, 27942, 26609, 31122, 29273, 29929};
            f21391b = 2283054630305492291L;
        }

        e(a aVar) {
            super(aVar, true);
        }

        static void init$0() {
            $$a = new byte[]{119, -27, 45, 98};
            $$b = 51;
        }

        private static void v(char c2, int i2, int i3, Object[] objArr) throws Throwable {
            int i4 = 2 % 2;
            o oVar = new o();
            long[] jArr = new long[i3];
            oVar.f19947b = 0;
            while (oVar.f19947b < i3) {
                int i5 = oVar.f19947b;
                try {
                    Object[] objArr2 = {Integer.valueOf(f21393d[i2 + i5])};
                    Object objA = d.a(-214519724);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = d.a((KeyEvent.getMaxKeyCode() >> 16) + 742, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 11, 632508977, false, $$d(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(f21391b), Integer.valueOf(c2)};
                    Object objA2 = d.a(-1567654649);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 + 1);
                        objA2 = d.a(766 - Drawable.resolveOpacity(0, 0), (char) (12470 - Color.alpha(0)), TextUtils.lastIndexOf("", '0', 0) + 13, 1946853218, false, $$d(b4, b5, (byte) (b5 - 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i5] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {oVar, oVar};
                    Object objA3 = d.a(-723636472);
                    if (objA3 == null) {
                        byte b6 = (byte) 0;
                        objA3 = d.a(387 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 18 - Color.green(0), 39570797, false, $$d(b6, (byte) ((-1) - (((-1) - b6) & ((-1) - 6))), b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                    int i6 = $11 + 51;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr = new char[i3];
            oVar.f19947b = 0;
            while (oVar.f19947b < i3) {
                int i8 = $10 + 115;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
                Object[] objArr5 = {oVar, oVar};
                Object objA4 = d.a(-723636472);
                if (objA4 == null) {
                    byte b7 = (byte) 0;
                    objA4 = d.a(388 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (ExpandableListView.getPackedPositionChild(0L) + 1), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 17, 39570797, false, $$d(b7, (byte) ((-1) - (((-1) - b7) & ((-1) - 6))), b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr);
        }

        @Override // o.ab.j
        public final f a(Context context) throws Throwable {
            int i2 = 2 % 2;
            Object[] objArr = new Object[1];
            v((char) (4577 - Color.alpha(0)), KeyEvent.normalizeMetaState(0) + 4, TextUtils.getOffsetAfter("", 0) + 19, objArr);
            b bVar = new b(context, 8, ((String) objArr[0]).intern());
            int i3 = f21394i + 97;
            f21392c = i3 % 128;
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
            int i3 = f21394i + 49;
            f21392c = i3 % 128;
            int i4 = i3 % 2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.c
        public final void b(o.bg.c cVar) {
            int i2 = 2 % 2;
            int i3 = f21394i + 53;
            f21392c = i3 % 128;
            if (i3 % 2 != 0) {
                ((a) e()).g().a(cVar);
                int i4 = 55 / 0;
            } else {
                ((a) e()).g().a(cVar);
            }
            int i5 = f21394i + 37;
            f21392c = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.c
        public final void c(o.bg.c cVar) {
            int i2 = 2 % 2;
            int i3 = f21394i + 57;
            f21392c = i3 % 128;
            int i4 = i3 % 2;
            ((a) e()).g().a();
            int i5 = f21392c + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f21394i = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // o.ab.j
        public final o.cg.j k() {
            int i2 = 2 % 2;
            int i3 = f21392c;
            int i4 = i3 + 9;
            f21394i = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 71 / 0;
            }
            int i6 = i3 + 29;
            f21394i = i6 % 128;
            int i7 = i6 % 2;
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j
        public final o.ef.a m() throws Throwable {
            int i2 = 2 % 2;
            o.ef.a aVar = new o.ef.a();
            Object[] objArr = new Object[1];
            v((char) (ImageFormat.getBitsPerPixel(0) + 1), TextUtils.lastIndexOf("", '0', 0) + 24, 6 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr);
            aVar.c(((String) objArr[0]).intern(), ((a) e()).f21387j);
            int i3 = f21392c + 93;
            f21394i = i3 % 128;
            int i4 = i3 % 2;
            return aVar;
        }

        @Override // o.ab.j
        public final String o() throws Throwable {
            int i2 = 2 % 2;
            int i3 = f21394i + 13;
            f21392c = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            v((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), ViewConfiguration.getMinimumFlingVelocity() >> 16, Color.argb(0, 0, 0, 0) + 4, objArr);
            String strIntern = ((String) objArr[0]).intern();
            int i5 = f21394i + 113;
            f21392c = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 21 / 0;
            }
            return strIntern;
        }

        @Override // o.ab.j
        public final byte[][] p() {
            int i2 = 2 % 2;
            int i3 = f21394i;
            int i4 = i3 + 55;
            f21392c = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 103;
            f21392c = i6 % 128;
            if (i6 % 2 == 0) {
                return null;
            }
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j
        public final void q() throws Throwable {
            int i2 = 2 % 2;
            int i3 = f21392c + 101;
            f21394i = i3 % 128;
            if (i3 % 2 != 0) {
                o.c.a.c(h());
                i().d(((a) e()).f21386f);
            } else {
                o.c.a.c(h());
                i().d(((a) e()).f21386f);
                int i4 = 56 / 0;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$j(byte r9, int r10, short r11) {
        /*
            byte[] r8 = o.bm.a.$$d
            int r7 = r11 + 65
            int r0 = r10 * 4
            int r6 = r0 + 1
            int r0 = r9 * 2
            int r5 = r0 + 4
            byte[] r4 = new byte[r6]
            r3 = 0
            if (r8 != 0) goto L2c
            r1 = r7
            r2 = r3
            r0 = r5
        L14:
            int r5 = r5 + r1
            int r0 = r0 + 1
            r1 = r2
            r7 = r5
            r5 = r0
        L1a:
            int r2 = r1 + 1
            byte r0 = (byte) r7
            r4[r1] = r0
            if (r2 != r6) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L27:
            r1 = r8[r5]
            r0 = r5
            r5 = r7
            goto L14
        L2c:
            r1 = r3
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bm.a.$$j(byte, int, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f21381l = 0;
        f21385q = 1;
        f21384o = 0;
        f21383n = 1;
        o();
        ViewConfiguration.getMinimumFlingVelocity();
        TextUtils.getCapsMode("", 0, 0);
        Process.getThreadPriority(0);
        KeyEvent.getMaxKeyCode();
        int i2 = f21381l + 111;
        f21385q = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public a(Context context, c cVar, o.en.b bVar) {
        super(context, cVar, bVar, o.bg.e.f21109g);
    }

    static void init$0() {
        $$d = new byte[]{68, -108, -67, 58};
        $$e = 20;
    }

    private e n() {
        int i2 = 2 % 2;
        e eVar = new e(this);
        int i3 = f21384o + 15;
        f21383n = i3 % 128;
        if (i3 % 2 != 0) {
            return eVar;
        }
        throw null;
    }

    static void o() {
        f21379g = 740602047300126166L;
        f21382m = -1376820688;
        f21380k = (char) 17878;
    }

    private static void r(char c2, String str, String str2, String str3, int i2, Object[] objArr) throws Throwable {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        int i3 = 2;
        int i4 = 2 % 2;
        int i5 = $10 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        $11 = i5 % 128;
        Object obj = null;
        Object charArray = str6;
        if (i5 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (str6 != null) {
            charArray = str6.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object obj2 = str5;
        if (str5 != null) {
            int i6 = $11 + 45;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            char[] charArray2 = str5.toCharArray();
            int i8 = $10 + 65;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            obj2 = charArray2;
        }
        char[] cArr2 = (char[]) obj2;
        Object charArray3 = str4;
        if (str4 != null) {
            int i10 = $10 + 3;
            $11 = i10 % 128;
            int i11 = i10 % 2;
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
            int i12 = $11 + 25;
            $10 = i12 % 128;
            int i13 = i12 % i3;
            try {
                Object[] objArr2 = {iVar};
                Object objA = d.a(540069882);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = d.a(106 - KeyEvent.keyCodeFromString(""), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), 11 - View.combineMeasuredStates(0, 0), -155898465, false, $$j(b2, b3, b3), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA).invoke(obj, objArr2)).intValue();
                Object[] objArr3 = {iVar};
                Object objA2 = d.a(2068572);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = d.a(ExpandableListView.getPackedPositionChild(0L) + 848, (char) (Color.alpha(0) + 6488), 12 - ExpandableListView.getPackedPositionType(0L), -694521287, false, $$j(b4, b5, (byte) (b5 + 3)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {iVar, Integer.valueOf(cArr3[iVar.f19932b % 4] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objA3 = d.a(-1122996612);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA3 = d.a(458 - TextUtils.getOffsetAfter("", 0), (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), 11 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1804962841, false, $$j(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objA3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr3[iIntValue2] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objA4 = d.a(-1223178239);
                if (objA4 == null) {
                    int i14 = 640 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                    char c3 = (char) (65099 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                    int gidForName = Process.getGidForName("") + 13;
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    String str$$j = $$j(b8, b9, (byte) (57 | b9));
                    i3 = 2;
                    objA4 = d.a(i14, c3, gidForName, 1636969060, false, str$$j, new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    i3 = 2;
                }
                cArr4[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                cArr3[iIntValue2] = iVar.f19933e;
                cArr5[iVar.f19932b] = (char) (((((long) (cArr3[iIntValue2] ^ r9[iVar.f19932b])) ^ (f21379g ^ 740602047300126166L)) ^ ((long) ((int) (((long) f21382m) ^ 740602047300126166L)))) ^ ((long) ((char) (((long) f21380k) ^ 740602047300126166L))));
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

    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(fr.antelop.sdk.WalletLockReason r5) {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = o.bm.a.f21384o
            int r1 = r0 + 37
            int r0 = r1 % 128
            o.bm.a.f21383n = r0
            int r1 = r1 % r3
            r2 = 1
            if (r1 != 0) goto L2c
            r4.f21386f = r5
            int[] r1 = o.bm.a.AnonymousClass3.f21390e
            int r0 = r5.ordinal()
            r1 = r1[r0]
            int r0 = r3 / 0
            if (r1 == r2) goto L3f
            if (r1 == r3) goto L3b
        L1f:
            r4.a()
            int r0 = o.bm.a.f21383n
            int r1 = r0 + 9
            int r0 = r1 % 128
            o.bm.a.f21384o = r0
            int r1 = r1 % r3
            return
        L2c:
            r4.f21386f = r5
            int[] r1 = o.bm.a.AnonymousClass3.f21390e
            int r0 = r5.ordinal()
            r0 = r1[r0]
            if (r0 == r2) goto L3f
            if (r0 == r3) goto L3b
            goto L1f
        L3b:
            r0 = 3
            r4.f21387j = r0
            goto L1f
        L3f:
            r4.f21387j = r3
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bm.a.b(fr.antelop.sdk.WalletLockReason):void");
    }

    @Override // o.ab.e
    public final /* synthetic */ o.ab.c c() {
        e eVarN;
        int i2 = 2 % 2;
        int i3 = f21384o + 15;
        f21383n = i3 % 128;
        if (i3 % 2 == 0) {
            eVarN = n();
            int i4 = 45 / 0;
        } else {
            eVarN = n();
        }
        int i5 = f21383n + 27;
        f21384o = i5 % 128;
        int i6 = i5 % 2;
        return eVarN;
    }

    @Override // o.ab.e
    public final String e() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f21384o + 29;
        f21383n = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        r((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 10062), "击陋ٸ賴㜋༘\ue0b0\uf377\udd57ꗮ䊗쓎ࣉ챱\ue939⢱\uf7f0", "\u0000\u0000\u0000\u0000", "\udadf\u187d佲㘧", 1914207706 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i5 = f21383n + 13;
        f21384o = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 57 / 0;
        }
        return strIntern;
    }
}
