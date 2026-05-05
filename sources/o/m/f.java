package o.m;

import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import fr.antelop.sdk.authentication.CustomerAuthenticationMethodUsage;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.msgpack.core.MessagePack;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class f implements o.ea.d<CustomerAuthenticationMethodUsage>, o.en.a {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f26436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f26437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f26438c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f26439e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ f[] f26440f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f26441g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f26442h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static char[] f26443i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f26444j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f26445k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f26446l = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f26447n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f26448o = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f26449d;

    /* JADX INFO: renamed from: o.m.f$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f26450b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f26451c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f26452d = 1;

        static {
            int[] iArr = new int[f.values().length];
            f26451c = iArr;
            try {
                iArr[f.f26437b.ordinal()] = 1;
                int i2 = f26452d + 53;
                f26450b = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26451c[f.f26439e.ordinal()] = 2;
                int i5 = f26450b;
                int i6 = (i5 & 109) + (i5 | 109);
                f26452d = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26451c[f.f26438c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26451c[f.f26436a.ordinal()] = 4;
                int i8 = f26450b;
                int i9 = ((-1) - (((-1) - i8) | ((-1) - 121))) + ((i8 + 121) - (i8 & 121));
                f26452d = i9 % 128;
                if (i9 % 2 == 0) {
                    throw null;
                }
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0018). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r6, int r7, int r8) {
        /*
            int r2 = r7 * 2
            int r1 = 1 - r2
            int r0 = r6 * 4
            int r7 = 3 - r0
            int r0 = r8 * 6
            int r0 = 73 - r0
            byte[] r6 = o.m.f.$$a
            byte[] r5 = new byte[r1]
            r4 = 0
            int r3 = 0 - r2
            r2 = -1
            if (r6 != 0) goto L2c
            r1 = r7
            r0 = r3
        L18:
            int r0 = -r0
            int r7 = r7 + r0
        L1a:
            int r2 = r2 + 1
            byte r0 = (byte) r7
            r5[r2] = r0
            if (r2 != r3) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L27:
            int r1 = r1 + 1
            r0 = r6[r1]
            goto L18
        L2c:
            r1 = r7
            r7 = r0
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.m.f.$$c(int, int, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f26445k = 0;
        f26446l = 1;
        f26447n = 0;
        f26448o = 1;
        d();
        Object[] objArr = new Object[1];
        Object obj = null;
        m((KeyEvent.getMaxKeyCode() >> 16) + 127, null, null, "\u0087\u0082\u0083\u0091\u0090\u008b\u008f", objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        m(TextUtils.getOffsetBefore("", 0) + 127, null, null, "\u0097\u0096\u0095\u0094\u0093\u0092\u008f", objArr2);
        f26437b = new f(strIntern, 0, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        m(ExpandableListView.getPackedPositionChild(0L) + 128, null, null, "\u0087\u0082\u0083\u0091\u0083\u0099\u008b\u0082\u008b\u0094\u0087\u0083\u008c\u008c\u008b\u0098", objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        m((Process.myPid() >> 22) + 127, null, null, "\u0097\u0096\u0095\u0094\u0095\u009c\u0092\u0096\u0092\u0094\u009b\u0097\u0095\u009a\u009a\u0092\u0098", objArr4);
        f26439e = new f(strIntern2, 1, ((String) objArr4[0]).intern());
        Object[] objArr5 = new Object[1];
        m((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 127, null, null, "\u008b\u0086\u009d", objArr5);
        String strIntern3 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        m(127 - TextUtils.getOffsetAfter("", 0), null, null, "\u0092\u009e\u009d", objArr6);
        f26438c = new f(strIntern3, 2, ((String) objArr6[0]).intern());
        Object[] objArr7 = new Object[1];
        m((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 127, null, null, "\u0088¡\u008b\u009e\u008c\u008b\u0087 \u0099 \u009f", objArr7);
        String strIntern4 = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        m(127 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), null, null, "\u009f£\u0092\u009e\u009b\u009a\u0092\u0097¢\u009c¢\u009f", objArr8);
        f26436a = new f(strIntern4, 3, ((String) objArr8[0]).intern());
        f26440f = b();
        int i2 = f26446l + 99;
        f26445k = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private f(String str, int i2, String str2) {
        this.f26449d = str2;
    }

    public static Set<CustomerAuthenticationMethodUsage> a(Set<f> set) {
        int i2 = 2 % 2;
        HashSet hashSet = new HashSet(set.size());
        Iterator<f> it = set.iterator();
        while (it.hasNext()) {
            int i3 = f26447n + 123;
            f26448o = i3 % 128;
            if (i3 % 2 == 0) {
                hashSet.add(it.next().c());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            hashSet.add(it.next().c());
        }
        int i4 = f26447n + 73;
        f26448o = i4 % 128;
        int i5 = i4 % 2;
        return hashSet;
    }

    private static /* synthetic */ f[] b() {
        int i2 = 2 % 2;
        int i3 = f26448o + 117;
        int i4 = i3 % 128;
        f26447n = i4;
        int i5 = i3 % 2;
        f[] fVarArr = {f26437b, f26439e, f26438c, f26436a};
        int i6 = i4 + 35;
        f26448o = i6 % 128;
        int i7 = i6 % 2;
        return fVarArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        if ((r1 % 2) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if (r0 == 4) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
    
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        r3 = new java.lang.StringBuilder();
        r1 = new java.lang.Object[1];
        m(android.text.TextUtils.indexOf("", "") + 127, null, null, "\u0089\u008e\u0083\u008d\u008c\u008b\u008a\u0089\u0088\u0083\u0087\u0086\u0083\u0085\u0084\u0083\u0082\u0081", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007a, code lost:
    
        throw new java.lang.UnsupportedOperationException(r3.append(((java.lang.String) r1[0]).intern()).append(name()).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (r1 == 4) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        r2 = fr.antelop.sdk.authentication.CustomerAuthenticationMethodUsage.DigitalCard;
        r1 = o.m.f.f26448o + 55;
        o.m.f.f26447n = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private fr.antelop.sdk.authentication.CustomerAuthenticationMethodUsage c() throws java.lang.Throwable {
        /*
            r8 = this;
            r4 = 2
            int r0 = r4 % r4
            int r0 = o.m.f.f26447n
            int r1 = r0 + 103
            int r0 = r1 % 128
            o.m.f.f26448o = r0
            int r1 = r1 % r4
            r7 = 0
            r3 = 4
            r2 = 3
            r6 = 1
            r5 = 0
            if (r1 != 0) goto L34
            int[] r1 = o.m.f.AnonymousClass2.f26451c
            int r0 = r8.ordinal()
            r1 = r1[r0]
            r0 = 48
            int r0 = r0 / r7
            if (r1 == r6) goto L81
            if (r1 == r4) goto L7e
            if (r1 == r2) goto L7b
            if (r1 != r3) goto L49
        L26:
            fr.antelop.sdk.authentication.CustomerAuthenticationMethodUsage r2 = fr.antelop.sdk.authentication.CustomerAuthenticationMethodUsage.DigitalCard
            int r0 = o.m.f.f26448o
            int r1 = r0 + 55
            int r0 = r1 % 128
            o.m.f.f26447n = r0
            int r1 = r1 % r4
            if (r1 != 0) goto L45
            return r2
        L34:
            int[] r1 = o.m.f.AnonymousClass2.f26451c
            int r0 = r8.ordinal()
            r0 = r1[r0]
            if (r0 == r6) goto L81
            if (r0 == r4) goto L7e
            if (r0 == r2) goto L7b
            if (r0 != r3) goto L49
            goto L26
        L45:
            r5.hashCode()
            throw r5
        L49:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = ""
            int r0 = android.text.TextUtils.indexOf(r0, r0)
            int r2 = r0 + 127
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.String r0 = "\u0089\u008e\u0083\u008d\u008c\u008b\u008a\u0089\u0088\u0083\u0087\u0086\u0083\u0085\u0084\u0083\u0082\u0081"
            m(r2, r5, r5, r0, r1)
            r0 = r1[r7]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.StringBuilder r1 = r3.append(r0)
            java.lang.String r0 = r8.name()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L7b:
            fr.antelop.sdk.authentication.CustomerAuthenticationMethodUsage r0 = fr.antelop.sdk.authentication.CustomerAuthenticationMethodUsage.Sca
            return r0
        L7e:
            fr.antelop.sdk.authentication.CustomerAuthenticationMethodUsage r0 = fr.antelop.sdk.authentication.CustomerAuthenticationMethodUsage.WalletManagement
            return r0
        L81:
            fr.antelop.sdk.authentication.CustomerAuthenticationMethodUsage r0 = fr.antelop.sdk.authentication.CustomerAuthenticationMethodUsage.Payment
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.m.f.c():fr.antelop.sdk.authentication.CustomerAuthenticationMethodUsage");
    }

    static void d() {
        f26443i = new char[]{2348, 2309, 2332, 2315, 2307, 2334, 2319, 2335, 2387, 2349, 2320, 2311, 2316, 2377, 2339, 2312, 2308, 2352, 2344, 2340, 2364, 2341, 2351, 2346, 2330, 2343, 2322, 2362, 2350, 2366, 2367, 2328, 2305, 2360, 2337};
        f26442h = 2040400243;
        f26441g = true;
        f26444j = true;
    }

    static void init$0() {
        $$a = new byte[]{78, MessagePack.Code.UINT64, MessagePack.Code.NIL, -88};
        $$b = 189;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m(int r22, java.lang.String r23, int[] r24, java.lang.String r25, java.lang.Object[] r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 604
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.m.f.m(int, java.lang.String, int[], java.lang.String, java.lang.Object[]):void");
    }

    public static f valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f26447n + 67;
        f26448o = i3 % 128;
        int i4 = i3 % 2;
        f fVar = (f) Enum.valueOf(f.class, str);
        int i5 = f26448o + 93;
        f26447n = i5 % 128;
        int i6 = i5 % 2;
        return fVar;
    }

    public static f[] values() {
        int i2 = 2 % 2;
        int i3 = f26447n + 115;
        f26448o = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        f[] fVarArr = (f[]) f26440f.clone();
        int i4 = f26447n + 21;
        f26448o = i4 % 128;
        if (i4 % 2 != 0) {
            return fVarArr;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.en.a
    public final String a() {
        int i2 = 2 % 2;
        int i3 = f26447n + 91;
        f26448o = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f26449d;
        if (i4 == 0) {
            int i5 = 81 / 0;
        }
        return str;
    }

    @Override // o.ea.a
    public final /* synthetic */ Object e() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26448o + 19;
        f26447n = i3 % 128;
        int i4 = i3 % 2;
        CustomerAuthenticationMethodUsage customerAuthenticationMethodUsageC = c();
        int i5 = f26448o + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f26447n = i5 % 128;
        int i6 = i5 % 2;
        return customerAuthenticationMethodUsageC;
    }
}
