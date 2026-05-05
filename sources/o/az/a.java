package o.az;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import o.a.g;
import o.d.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class a {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f20790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f20791b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ a[] f20792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static char f20793e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static char f20794f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static char f20795g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static char f20796h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f20797i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f20798j = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f20799l = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f20800n = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f20801c;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r7, short r8, int r9) {
        /*
            int r7 = r7 * 2
            int r1 = r7 + 1
            int r0 = r8 * 3
            int r6 = 72 - r0
            int r5 = r9 + 4
            byte[] r4 = o.az.a.$$a
            byte[] r3 = new byte[r1]
            r2 = 0
            if (r4 != 0) goto L27
            r0 = r7
            r1 = r2
        L13:
            int r0 = -r0
            int r6 = r6 + r0
        L15:
            byte r0 = (byte) r6
            r3[r1] = r0
            int r5 = r5 + 1
            if (r1 != r7) goto L22
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            return r0
        L22:
            r0 = r4[r5]
            int r1 = r1 + 1
            goto L13
        L27:
            r1 = r2
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: o.az.a.$$c(byte, short, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f20800n = 0;
        f20799l = 1;
        f20798j = 0;
        f20797i = 1;
        e();
        Object[] objArr = new Object[1];
        k("䧧壜䭸컋", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 3, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        k("䙞뀟偯춝", TextUtils.getOffsetBefore("", 0) + 4, objArr2);
        f20791b = new a(strIntern, 0, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        k("쯭뇿̂ೀꇃ勸ⷎ䏹G\ufff3陷楎薣⅔蕕㿘", Color.argb(0, 0, 0, 0) + 15, objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        k("㏜讉ޝ라ἄꠖ⸺纙蝳⳥ᾙ뇤眄腐", Color.red(0) + 14, objArr4);
        f20790a = new a(strIntern2, 1, ((String) objArr4[0]).intern());
        f20792d = b();
        int i2 = f20800n + 91;
        f20799l = i2 % 128;
        int i3 = i2 % 2;
    }

    private a(String str, int i2, String str2) {
        this.f20801c = str2;
    }

    private static /* synthetic */ a[] b() {
        int i2 = 2 % 2;
        int i3 = f20797i + 3;
        f20798j = i3 % 128;
        a[] aVarArr = new a[2];
        if (i3 % 2 != 0) {
            aVarArr[1] = f20791b;
            aVarArr[0] = f20790a;
        } else {
            aVarArr[0] = f20791b;
            aVarArr[1] = f20790a;
        }
        return aVarArr;
    }

    public static a c(String str) {
        int i2 = 2 % 2;
        a[] aVarArrValues = values();
        int length = aVarArrValues.length;
        int i3 = 0;
        while (i3 < length) {
            int i4 = f20797i + 123;
            f20798j = i4 % 128;
            if (i4 % 2 != 0) {
                str.equals(aVarArrValues[i3].f20801c);
                throw null;
            }
            a aVar = aVarArrValues[i3];
            if (str.equals(aVar.f20801c)) {
                return aVar;
            }
            i3++;
            int i5 = f20797i + 93;
            f20798j = i5 % 128;
            int i6 = i5 % 2;
        }
        return null;
    }

    static void e() {
        f20793e = (char) 12529;
        f20795g = (char) 41488;
        f20796h = (char) 63909;
        f20794f = (char) 62719;
    }

    static void init$0() {
        $$a = new byte[]{88, 0, 126, -69};
        $$b = 180;
    }

    private static void k(String str, int i2, Object[] objArr) throws Throwable {
        int i3;
        String str2 = str;
        int i4 = 2;
        int i5 = 2 % 2;
        Object charArray = str2;
        if (str2 != null) {
            int i6 = $11 + 93;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        g gVar = new g();
        char[] cArr2 = new char[cArr.length];
        gVar.f19924d = 0;
        char[] cArr3 = new char[2];
        while (gVar.f19924d < cArr.length) {
            int i8 = $11 + 65;
            $10 = i8 % 128;
            int i9 = 58224;
            if (i8 % i4 != 0) {
                cArr3[0] = cArr[gVar.f19924d];
                cArr3[0] = cArr[gVar.f19924d + 1];
                i3 = 1;
            } else {
                cArr3[0] = cArr[gVar.f19924d];
                cArr3[1] = cArr[gVar.f19924d + 1];
                i3 = 0;
            }
            while (i3 < 16) {
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                int i10 = (c3 + i9) ^ ((c3 << 4) + ((char) (((long) f20796h) ^ (-7511683281764982996L))));
                int i11 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(f20794f);
                    objArr2[i4] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objA = d.a(1603517628);
                    if (objA == null) {
                        int iIndexOf = 269 - TextUtils.indexOf((CharSequence) "", '0');
                        char trimmedLength = (char) TextUtils.getTrimmedLength("");
                        int i12 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 10;
                        byte b2 = $$a[1];
                        byte b3 = (byte) (b2 + 1);
                        objA = d.a(iIndexOf, trimmedLength, i12, -1995022631, false, $$c(b2, b3, (byte) (-b3)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i9) ^ ((cCharValue << 4) + ((char) (((long) f20793e) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f20795g)};
                    Object objA2 = d.a(1603517628);
                    if (objA2 == null) {
                        int i13 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 10;
                        byte b4 = $$a[1];
                        byte b5 = (byte) (b4 + 1);
                        objA2 = d.a(TextUtils.getCapsMode("", 0, 0) + 270, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), i13, -1995022631, false, $$c(b4, b5, (byte) (-b5)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i9 -= 40503;
                    i3++;
                    i4 = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[gVar.f19924d] = cArr3[0];
            cArr2[gVar.f19924d + 1] = cArr3[1];
            Object[] objArr4 = {gVar, gVar};
            Object objA3 = d.a(1390051551);
            if (objA3 == null) {
                int iMyPid = (Process.myPid() >> 22) + 270;
                char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0') + 12;
                byte b6 = $$a[1];
                byte b7 = b6;
                objA3 = d.a(iMyPid, packedPositionType, iIndexOf2, -2074123590, false, $$c(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
            i4 = 2;
        }
        String str3 = new String(cArr2, 0, i2);
        int i14 = $11 + 103;
        $10 = i14 % 128;
        int i15 = i14 % 2;
        objArr[0] = str3;
    }

    public static a valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f20797i + 65;
        f20798j = i3 % 128;
        int i4 = i3 % 2;
        a aVar = (a) Enum.valueOf(a.class, str);
        int i5 = f20797i + 115;
        f20798j = i5 % 128;
        int i6 = i5 % 2;
        return aVar;
    }

    public static a[] values() {
        int i2 = 2 % 2;
        int i3 = f20798j + 71;
        f20797i = i3 % 128;
        int i4 = i3 % 2;
        a[] aVarArr = (a[]) f20792d.clone();
        int i5 = f20798j + 29;
        f20797i = i5 % 128;
        int i6 = i5 % 2;
        return aVarArr;
    }

    @Override // java.lang.Enum
    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f20797i;
        int i4 = i3 + 39;
        f20798j = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.f20801c;
        int i5 = i3 + 55;
        f20798j = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
