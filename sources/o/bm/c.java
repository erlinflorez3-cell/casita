package o.bm;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import o.a.k;
import o.d.d;
import org.msgpack.core.MessagePack;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class c {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f21395a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f21396c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ c[] f21397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f21398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f21399f = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f21400h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f21401i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f21402j = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f21403b;

    /* JADX INFO: renamed from: o.bm.c$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f21404a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f21405c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f21406d = 1;

        static {
            int[] iArr = new int[c.values().length];
            f21404a = iArr;
            try {
                iArr[c.f21398e.ordinal()] = 1;
                int i2 = f21406d + 19;
                f21405c = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21404a[c.f21395a.ordinal()] = 2;
                int i4 = f21406d;
                int i5 = (i4 ^ 117) + ((i4 & 117) << 1);
                f21405c = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r8, short r9, byte r10) {
        /*
            int r0 = r8 * 3
            int r8 = r0 + 1
            int r0 = r10 * 2
            int r7 = r0 + 4
            byte[] r6 = o.bm.c.$$a
            int r0 = r9 * 7
            int r5 = r0 + 107
            byte[] r4 = new byte[r8]
            r3 = 0
            if (r6 != 0) goto L2b
            r0 = r7
            r2 = r3
        L15:
            int r7 = r7 + 1
            int r5 = r5 + r0
            r1 = r2
        L19:
            int r2 = r1 + 1
            byte r0 = (byte) r5
            r4[r1] = r0
            if (r2 != r8) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L26:
            r1 = r6[r7]
            r0 = r5
            r5 = r1
            goto L15
        L2b:
            r1 = r3
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bm.c.$$c(short, short, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f21402j = 0;
        f21400h = 1;
        f21399f = 0;
        f21401i = 1;
        a();
        Object[] objArr = new Object[1];
        g("雼ﬓ隯텊䟲∃揰쮱\uf302얀쥷똽嶨忔곔დ꘍\uf173㉆וֹÑ铇頶旝浃⹒羼쁺\uf7d9솯씁ꨛ偩嬣ꢗᒊ", (-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr);
        f21398e = new c(((String) objArr[0]).intern(), 0, 1000);
        Object[] objArr2 = new Object[1];
        g("鵩뚳鴦㕟밮澣蟿で\uf88b蠕ⵢ䷳嘺ቘ䣙", Color.alpha(0), objArr2);
        f21395a = new c(((String) objArr2[0]).intern(), 1, 9999);
        f21397d = d();
        int i2 = f21400h + 37;
        f21402j = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 33 / 0;
        }
    }

    private c(String str, int i2, int i3) {
        this.f21403b = i3;
    }

    static void a() {
        f21396c = 7012981913110465310L;
    }

    public static c c(int i2) {
        c[] cVarArrValues;
        int length;
        int i3 = 2 % 2;
        int i4 = f21399f + 19;
        f21401i = i4 % 128;
        if (i4 % 2 == 0) {
            cVarArrValues = values();
            length = cVarArrValues.length;
        } else {
            cVarArrValues = values();
            length = cVarArrValues.length;
        }
        int i5 = f21401i + 31;
        f21399f = i5 % 128;
        int i6 = i5 % 2;
        for (int i7 = 0; i7 < length; i7++) {
            int i8 = f21399f + 7;
            f21401i = i8 % 128;
            int i9 = i8 % 2;
            c cVar = cVarArrValues[i7];
            if (i2 == cVar.f21403b) {
                return cVar;
            }
        }
        return f21395a;
    }

    private static /* synthetic */ c[] d() {
        c[] cVarArr;
        int i2 = 2 % 2;
        int i3 = f21399f + 95;
        int i4 = i3 % 128;
        f21401i = i4;
        if (i3 % 2 == 0) {
            cVarArr = new c[4];
            cVarArr[1] = f21398e;
            cVarArr[1] = f21395a;
        } else {
            cVarArr = new c[]{f21398e, f21395a};
        }
        int i5 = i4 + 47;
        f21399f = i5 % 128;
        int i6 = i5 % 2;
        return cVarArr;
    }

    private static void g(String str, int i2, Object[] objArr) throws Throwable {
        Object obj;
        String str2 = str;
        int i3 = 2 % 2;
        if (str2 != null) {
            int i4 = $10 + 51;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            char[] charArray = str2.toCharArray();
            int i6 = $11 + 81;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            obj = charArray;
        } else {
            obj = str2;
        }
        k kVar = new k();
        char[] cArrC = k.c(f21396c ^ (-5882309809461882246L), (char[]) obj, i2);
        kVar.f19939c = 4;
        while (kVar.f19939c < cArrC.length) {
            int i8 = $10 + 35;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            kVar.f19938a = kVar.f19939c - 4;
            int i10 = kVar.f19939c;
            try {
                Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f21396c)};
                Object objA = d.a(-1093976004);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = d.a(TextUtils.indexOf((CharSequence) "", '0', 0) + 230, (char) (51003 - TextUtils.lastIndexOf("", '0')), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 8, 1749983833, false, $$c(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrC[i10] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {kVar, kVar};
                Object objA2 = d.a(-912105096);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 1);
                    objA2 = d.a(Color.alpha(0) + 675, (char) (MotionEvent.axisFromString("") + 1), 12 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 522683165, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
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
        $$a = new byte[]{76, -81, MessagePack.Code.EXT16, -107};
        $$b = 83;
    }

    public static c valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f21401i + 3;
        f21399f = i3 % 128;
        int i4 = i3 % 2;
        c cVar = (c) Enum.valueOf(c.class, str);
        int i5 = f21401i + 25;
        f21399f = i5 % 128;
        int i6 = i5 % 2;
        return cVar;
    }

    public static c[] values() {
        int i2 = 2 % 2;
        int i3 = f21399f + 97;
        f21401i = i3 % 128;
        int i4 = i3 % 2;
        c[] cVarArr = f21397d;
        if (i4 != 0) {
            return (c[]) cVarArr.clone();
        }
        c[] cVarArr2 = (c[]) cVarArr.clone();
        int i5 = 37 / 0;
        return cVarArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        if (r0 != 2) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        return fr.antelop.sdk.WalletLockReason.OtherReason;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (r1 != 2) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        r2 = fr.antelop.sdk.WalletLockReason.OtherReason;
        r1 = o.bm.c.f21399f + 25;
        o.bm.c.f21401i = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final fr.antelop.sdk.WalletLockReason b() {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = o.bm.c.f21401i
            int r1 = r0 + 115
            int r0 = r1 % 128
            o.bm.c.f21399f = r0
            int r1 = r1 % r3
            r2 = 1
            if (r1 == 0) goto L2b
            int[] r1 = o.bm.c.AnonymousClass4.f21404a
            int r0 = r4.ordinal()
            r1 = r1[r0]
            r0 = 26
            int r0 = r0 / 0
            if (r1 == r2) goto L3b
            if (r1 == r3) goto L38
        L1f:
            fr.antelop.sdk.WalletLockReason r2 = fr.antelop.sdk.WalletLockReason.OtherReason
            int r0 = o.bm.c.f21399f
            int r1 = r0 + 25
            int r0 = r1 % 128
            o.bm.c.f21401i = r0
            int r1 = r1 % r3
            return r2
        L2b:
            int[] r1 = o.bm.c.AnonymousClass4.f21404a
            int r0 = r4.ordinal()
            r0 = r1[r0]
            if (r0 == r2) goto L3b
            if (r0 == r3) goto L38
            goto L1f
        L38:
            fr.antelop.sdk.WalletLockReason r0 = fr.antelop.sdk.WalletLockReason.OtherReason
            return r0
        L3b:
            fr.antelop.sdk.WalletLockReason r0 = fr.antelop.sdk.WalletLockReason.StrongestCvmAttemptCountExceeded
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bm.c.b():fr.antelop.sdk.WalletLockReason");
    }
}
