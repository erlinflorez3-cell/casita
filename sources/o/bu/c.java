package o.bu;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import o.a.k;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f21666b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f21667c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final EnumC0345c f21668d;

    /* JADX INFO: renamed from: o.bu.c$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f21669a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f21670b = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f21671e = 1;

        static {
            int[] iArr = new int[EnumC0345c.values().length];
            f21669a = iArr;
            try {
                iArr[EnumC0345c.f21673b.ordinal()] = 1;
                int i2 = f21671e + 13;
                f21670b = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21669a[EnumC0345c.f21674c.ordinal()] = 2;
                int i5 = f21671e;
                int i6 = (i5 ^ 51) + (((-1) - (((-1) - i5) | ((-1) - 51))) << 1);
                f21670b = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21669a[EnumC0345c.f21672a.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: o.bu.c$c, reason: collision with other inner class name */
    public static final class EnumC0345c {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EnumC0345c f21672a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final EnumC0345c f21673b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final EnumC0345c f21674c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ EnumC0345c[] f21675d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static long f21676e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static int f21677f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static int f21678g = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static int f21679i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static int f21680j = 0;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0016). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$c(short r8, int r9, int r10) {
            /*
                int r0 = r8 * 4
                int r8 = r0 + 1
                int r0 = r9 * 4
                int r7 = 4 - r0
                int r0 = r10 * 7
                int r6 = 114 - r0
                byte[] r5 = o.bu.c.EnumC0345c.$$a
                byte[] r4 = new byte[r8]
                r3 = 0
                if (r5 != 0) goto L2a
                r0 = r6
                r2 = r3
                r6 = r8
            L16:
                int r6 = r6 + r0
                int r7 = r7 + 1
                r1 = r2
            L1a:
                int r2 = r1 + 1
                byte r0 = (byte) r6
                r4[r1] = r0
                if (r2 != r8) goto L27
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                return r0
            L27:
                r0 = r5[r7]
                goto L16
            L2a:
                r1 = r3
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: o.bu.c.EnumC0345c.$$c(short, int, int):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f21679i = 0;
            f21677f = 1;
            f21678g = 0;
            f21680j = 1;
            d();
            Object[] objArr = new Object[1];
            h("\udd8d搛\udddaซ᮹雲\ueb52찆ឆ\ud94fꇀ맩䤖\ue309瑷睴芚㖰䨐Ⳙ\uf458", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr);
            f21673b = new EnumC0345c(((String) objArr[0]).intern(), 0);
            Object[] objArr2 = new Object[1];
            h("즫걃짦씍\ueeb6庹⁕㤃Φᄰ櫀䳹崊⭠뽦艭隂ﷵ脄\ud9d0\ue072끧쮅", 1 - (ViewConfiguration.getScrollBarSize() >> 8), objArr2);
            f21674c = new EnumC0345c(((String) objArr2[0]).intern(), 1);
            Object[] objArr3 = new Object[1];
            h("㗓吽㖝ᅗ\udd36ꛉ\uf415મ\uffd1\ue953뺁罢ꅪ팢欰뇥櫲ֆ", 1 - Color.green(0), objArr3);
            f21672a = new EnumC0345c(((String) objArr3[0]).intern(), 2);
            f21675d = c();
            int i2 = f21677f + 65;
            f21679i = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 19 / 0;
            }
        }

        private EnumC0345c(String str, int i2) {
        }

        private static /* synthetic */ EnumC0345c[] c() {
            int i2 = 2 % 2;
            int i3 = f21678g;
            int i4 = i3 + 67;
            f21680j = i4 % 128;
            int i5 = i4 % 2;
            EnumC0345c[] enumC0345cArr = {f21673b, f21674c, f21672a};
            int i6 = i3 + 99;
            f21680j = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 40 / 0;
            }
            return enumC0345cArr;
        }

        static void d() {
            f21676e = 3223724220344787169L;
        }

        private static void h(String str, int i2, Object[] objArr) throws Throwable {
            Object charArray;
            String str2 = str;
            int i3 = 2 % 2;
            int i4 = $11;
            int i5 = i4 + 57;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            if (str2 != null) {
                int i7 = i4 + 21;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                charArray = str2.toCharArray();
            } else {
                charArray = str2;
            }
            k kVar = new k();
            char[] cArrC = k.c(f21676e ^ (-5882309809461882246L), (char[]) charArray, i2);
            kVar.f19939c = 4;
            while (kVar.f19939c < cArrC.length) {
                kVar.f19938a = kVar.f19939c - 4;
                int i9 = kVar.f19939c;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f21676e)};
                    Object objA = o.d.d.a(-1093976004);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a(Color.rgb(0, 0, 0) + 16777445, (char) (51004 - View.resolveSize(0, 0)), 9 - TextUtils.indexOf("", "", 0), 1749983833, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrC[i9] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {kVar, kVar};
                    Object objA2 = o.d.d.a(-912105096);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = o.d.d.a(TextUtils.indexOf("", "", 0, 0) + 675, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 12 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 522683165, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
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

        static void init$0() {
            $$a = new byte[]{6, 32, -91, MessagePack.Code.BIN16};
            $$b = 63;
        }

        public static EnumC0345c valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = f21680j + 97;
            f21678g = i3 % 128;
            int i4 = i3 % 2;
            EnumC0345c enumC0345c = (EnumC0345c) Enum.valueOf(EnumC0345c.class, str);
            if (i4 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = f21680j + 5;
            f21678g = i5 % 128;
            int i6 = i5 % 2;
            return enumC0345c;
        }

        public static EnumC0345c[] values() {
            int i2 = 2 % 2;
            int i3 = f21680j + 87;
            f21678g = i3 % 128;
            int i4 = i3 % 2;
            EnumC0345c[] enumC0345cArr = f21675d;
            if (i4 == 0) {
                return (EnumC0345c[]) enumC0345cArr.clone();
            }
            throw null;
        }

        public final o.bg.a a() throws Throwable {
            int i2 = 2 % 2;
            int i3 = f21678g + 13;
            f21680j = i3 % 128;
            int i4 = i3 % 2;
            int i5 = AnonymousClass2.f21669a[ordinal()];
            if (i5 == 1) {
                return o.bg.a.f21050s;
            }
            if (i5 == 2) {
                return o.bg.a.f21045n;
            }
            if (i5 == 3) {
                o.bg.a aVar = o.bg.a.f21056y;
                int i6 = f21678g + 57;
                f21680j = i6 % 128;
                int i7 = i6 % 2;
                return aVar;
            }
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            h("\uf180诰\uf1d5൴\ue742礅\ue827ル㮜㚒ꊵ䔋攽೧睚讽꺥\uda43䥻퀲\ud80a鞛", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr);
            throw new UnsupportedOperationException(sb.append(((String) objArr[0]).intern()).append(name()).toString());
        }
    }

    public c(EnumC0345c enumC0345c) {
        this.f21668d = enumC0345c;
    }

    public final EnumC0345c c() {
        int i2 = 2 % 2;
        int i3 = f21666b;
        int i4 = (i3 ^ 117) + (((i3 + 117) - (i3 | 117)) << 1);
        int i5 = i4 % 128;
        f21667c = i5;
        int i6 = i4 % 2;
        EnumC0345c enumC0345c = this.f21668d;
        int i7 = (i5 & 31) + ((i5 + 31) - (i5 & 31));
        f21666b = i7 % 128;
        if (i7 % 2 == 0) {
            return enumC0345c;
        }
        throw null;
    }
}
