package o.ef;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import cz.msebera.android.httpclient.message.TokenParser;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.a.f;
import o.a.n;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class e {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f23815a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f23816b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f23817d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f23818e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f23819g = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static long f23820i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f23821j = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f23822o = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private StringBuilder f23823c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f23824f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<b> f23825h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static final class b {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f23826a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f23827b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f23828c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f23829d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f23830e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static int f23831f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static boolean f23832g = false;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static char[] f23833h = null;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ b[] f23834i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final b f23835j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static int f23836k = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static int f23837l = 0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static int f23838m = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static int f23839n = 0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static boolean f23840o = false;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:5:0x0017). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$c(byte r8, int r9, short r10) {
            /*
                int r0 = r8 * 6
                int r0 = r0 + 67
                byte[] r8 = o.ef.e.b.$$a
                int r1 = r10 * 2
                int r7 = 4 - r1
                int r2 = r9 * 3
                int r1 = 1 - r2
                byte[] r6 = new byte[r1]
                r5 = 0
                int r4 = 0 - r2
                if (r8 != 0) goto L2e
                r2 = r7
                r3 = r5
            L17:
                int r0 = -r0
                int r7 = r7 + 1
                int r0 = r0 + r2
                r2 = r3
            L1c:
                byte r1 = (byte) r0
                r6[r2] = r1
                int r3 = r2 + 1
                if (r2 != r4) goto L29
                java.lang.String r0 = new java.lang.String
                r0.<init>(r6, r5)
                return r0
            L29:
                r1 = r8[r7]
                r2 = r0
                r0 = r1
                goto L17
            L2e:
                r2 = r5
                goto L1c
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ef.e.b.$$c(byte, int, short):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f23837l = 0;
            f23838m = 1;
            f23836k = 0;
            f23839n = 1;
            b();
            Object[] objArr = new Object[1];
            p((ViewConfiguration.getTapTimeout() >> 16) + 127, null, null, "\u0085\u0087\u0088\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
            f23826a = new b(((String) objArr[0]).intern(), 0);
            Object[] objArr2 = new Object[1];
            p(127 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), null, null, "\u0085\u0087\u0088\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081\u0089\u008a\u0089", objArr2);
            f23829d = new b(((String) objArr2[0]).intern(), 1);
            Object[] objArr3 = new Object[1];
            p(Color.red(0) + 127, null, null, "\u0084\u008d\u0081\u008c\u008b\u008a\u0086\u0085\u0084\u0083\u0082\u0081", objArr3);
            f23828c = new b(((String) objArr3[0]).intern(), 2);
            Object[] objArr4 = new Object[1];
            p(TextUtils.indexOf((CharSequence) "", '0', 0) + 128, null, null, "\u0085\u0081\u0092\u0086\u008f\u0089\u0091\u0090\u008f\u0089\u0087\u008e", objArr4);
            f23830e = new b(((String) objArr4[0]).intern(), 3);
            Object[] objArr5 = new Object[1];
            p((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 128, null, null, "\u0084\u008d\u0081\u008c\u008b\u008a\u0086\u0085\u0084\u0083\u0082\u0081\u0089\u008a\u0089", objArr5);
            f23827b = new b(((String) objArr5[0]).intern(), 4);
            Object[] objArr6 = new Object[1];
            p(127 - (KeyEvent.getMaxKeyCode() >> 16), null, null, "\u0090\u0090\u0093\u0089", objArr6);
            f23835j = new b(((String) objArr6[0]).intern(), 5);
            f23834i = c();
            int i2 = f23838m + 117;
            f23837l = i2 % 128;
            int i3 = i2 % 2;
        }

        private b(String str, int i2) {
        }

        static void b() {
            f23833h = new char[]{2071, 2079, 2074, 2054, 2051, 2061, 2091, 2072, 2076, 2077, 2088, 2064, 2089, 2070, 2069, 2078, 2067, 2065, 2055};
            f23831f = 2040399978;
            f23832g = true;
            f23840o = true;
        }

        private static /* synthetic */ b[] c() {
            b[] bVarArr;
            int i2 = 2 % 2;
            int i3 = f23839n + 59;
            int i4 = i3 % 128;
            f23836k = i4;
            if (i3 % 2 != 0) {
                bVarArr = new b[68];
                bVarArr[1] = f23826a;
                bVarArr[0] = f23829d;
                bVarArr[3] = f23828c;
                bVarArr[3] = f23830e;
                bVarArr[4] = f23827b;
                bVarArr[2] = f23835j;
            } else {
                bVarArr = new b[]{f23826a, f23829d, f23828c, f23830e, f23827b, f23835j};
            }
            int i5 = i4 + 103;
            f23839n = i5 % 128;
            int i6 = i5 % 2;
            return bVarArr;
        }

        static void init$0() {
            $$a = new byte[]{54, -126, MessagePack.Code.INT32, 96};
            $$b = 61;
        }

        private static void p(int i2, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
            String str3 = str;
            String str4 = str2;
            int i3 = 2;
            int i4 = 2 % 2;
            int i5 = $10 + 113;
            $11 = i5 % 128;
            Object bytes = str4;
            if (i5 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (str4 != null) {
                bytes = str4.getBytes("ISO-8859-1");
            }
            byte[] bArr = (byte[]) bytes;
            Object charArray = str3;
            if (str3 != null) {
                charArray = str3.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            f fVar = new f();
            char[] cArr2 = f23833h;
            int i6 = 0;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i7 = 0;
                while (i7 < length) {
                    int i8 = $10 + 15;
                    $11 = i8 % 128;
                    if (i8 % i3 == 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                            Object objA = o.d.d.a(1618406102);
                            if (objA == null) {
                                byte b2 = (byte) i6;
                                byte b3 = b2;
                                objA = o.d.d.a(TextUtils.getOffsetBefore("", i6) + 593, (char) (KeyEvent.getDeadChar(i6, i6) + 13181), 11 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -1225586509, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            cArr3[i7] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i7])};
                        Object objA2 = o.d.d.a(1618406102);
                        if (objA2 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objA2 = o.d.d.a(593 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (13181 - TextUtils.getOffsetBefore("", 0)), 12 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -1225586509, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                        }
                        cArr3[i7] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                        i7++;
                    }
                    i3 = 2;
                    i6 = 0;
                }
                cArr2 = cArr3;
            }
            Object[] objArr4 = {Integer.valueOf(f23831f)};
            Object objA3 = o.d.d.a(-1503702982);
            if (objA3 == null) {
                objA3 = o.d.d.a((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 31, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 10 - TextUtils.lastIndexOf("", '0'), 1893380703, false, "F", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
            if (f23840o) {
                fVar.f19923e = bArr.length;
                char[] cArr4 = new char[fVar.f19923e];
                fVar.f19922a = 0;
                int i9 = $11 + 69;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                while (fVar.f19922a < fVar.f19923e) {
                    cArr4[fVar.f19922a] = (char) (cArr2[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i2] - iIntValue);
                    Object[] objArr5 = {fVar, fVar};
                    Object objA4 = o.d.d.a(1540807955);
                    if (objA4 == null) {
                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 458;
                        char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0));
                        int edgeSlop = 11 - (ViewConfiguration.getEdgeSlop() >> 16);
                        byte b6 = (byte) ($$b & 3);
                        byte b7 = (byte) (b6 - 1);
                        objA4 = o.d.d.a(tapTimeout, cLastIndexOf, edgeSlop, -1923924106, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA4).invoke(null, objArr5);
                }
                objArr[0] = new String(cArr4);
                return;
            }
            int i11 = 0;
            if (f23832g) {
                fVar.f19923e = cArr.length;
                char[] cArr5 = new char[fVar.f19923e];
                fVar.f19922a = 0;
                while (fVar.f19922a < fVar.f19923e) {
                    cArr5[fVar.f19922a] = (char) (cArr2[cArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                    Object[] objArr6 = {fVar, fVar};
                    Object objA5 = o.d.d.a(1540807955);
                    if (objA5 == null) {
                        int i12 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 457;
                        char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int i13 = 11 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        byte b8 = (byte) ((-1) - (((-1) - $$b) | ((-1) - 3)));
                        byte b9 = (byte) (b8 - 1);
                        objA5 = o.d.d.a(i12, scrollDefaultDelay, i13, -1923924106, false, $$c(b8, b9, b9), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA5).invoke(null, objArr6);
                }
                objArr[0] = new String(cArr5);
                return;
            }
            fVar.f19923e = iArr.length;
            char[] cArr6 = new char[fVar.f19923e];
            while (true) {
                fVar.f19922a = i11;
                if (fVar.f19922a >= fVar.f19923e) {
                    objArr[0] = new String(cArr6);
                    return;
                }
                int i14 = $11 + 79;
                $10 = i14 % 128;
                if (i14 % 2 != 0) {
                    cArr6[fVar.f19922a] = (char) (cArr2[iArr[(fVar.f19923e >>> 1) % fVar.f19922a] % i2] / iIntValue);
                    i11 = fVar.f19922a / 0;
                } else {
                    cArr6[fVar.f19922a] = (char) (cArr2[iArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                    i11 = fVar.f19922a + 1;
                }
            }
        }

        public static b valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = f23839n + 75;
            f23836k = i3 % 128;
            int i4 = i3 % 2;
            b bVar = (b) Enum.valueOf(b.class, str);
            int i5 = f23836k + 105;
            f23839n = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 71 / 0;
            }
            return bVar;
        }

        public static b[] values() {
            int i2 = 2 % 2;
            int i3 = f23839n + 17;
            f23836k = i3 % 128;
            int i4 = i3 % 2;
            b[] bVarArr = (b[]) f23834i.clone();
            int i5 = f23839n + 75;
            f23836k = i5 % 128;
            int i6 = i5 % 2;
            return bVarArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r7, short r8, byte r9) {
        /*
            int r0 = r7 * 2
            int r7 = 4 - r0
            byte[] r6 = o.ef.e.$$a
            int r0 = r8 * 2
            int r5 = r0 + 1
            int r4 = r9 + 71
            byte[] r3 = new byte[r5]
            r2 = 0
            if (r6 != 0) goto L26
            r0 = r5
            r1 = r2
        L13:
            int r7 = r7 + 1
            int r4 = r4 + r0
        L16:
            byte r0 = (byte) r4
            r3[r1] = r0
            int r1 = r1 + 1
            if (r1 != r5) goto L23
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            return r0
        L23:
            r0 = r6[r7]
            goto L13
        L26:
            r1 = r2
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ef.e.$$c(short, short, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f23815a = 1113657327;
        f23816b = -1455623941;
        f23817d = 1000056907;
        f23818e = 325320475;
        f23821j = 0;
        f23822o = 1;
        f23819g = -1270219463;
        f23820i = 5129433361902779053L;
    }

    public e() {
        this.f23823c = new StringBuilder();
        this.f23825h = new ArrayList();
        this.f23824f = null;
    }

    e(int i2) {
        this.f23823c = new StringBuilder();
        this.f23825h = new ArrayList();
        char[] cArr = new char[4];
        Arrays.fill(cArr, TokenParser.SP);
        this.f23824f = new String(cArr);
    }

    private e a(b bVar, b bVar2, String str) throws o.ef.b {
        int iMyUid = Process.myUid();
        int iMyPid = Process.myPid();
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i2 = f23818e * 1231766960;
        f23818e = i2;
        return (e) e(iFreeMemory, -761252135, 761252135, iMyPid, new Object[]{this, bVar, bVar2, str}, iMyUid, i2);
    }

    private void a(b bVar) throws Throwable {
        int i2 = f23815a * (-739066741);
        f23815a = i2;
        int iNextInt = new Random().nextInt(21096672);
        e((int) Runtime.getRuntime().totalMemory(), 1015721252, -1015721250, iNextInt, new Object[]{this, bVar}, i2, new Random().nextInt());
    }

    private void b(String str) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f23821j + 7;
        f23822o = i3 % 128;
        int i4 = i3 % 2;
        StringBuilder sb = this.f23823c;
        Object[] objArr = new Object[1];
        l("럀", 48437 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr);
        sb.append(((String) objArr[0]).intern());
        int length = str.length();
        int i5 = 0;
        while (i5 < length) {
            char cCharAt = str.charAt(i5);
            if (cCharAt == '\f') {
                StringBuilder sb2 = this.f23823c;
                Object[] objArr2 = new Object[1];
                k(Color.rgb(0, 0, 0) + 16777218, "\ufffb\u0005", true, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 131, -TextUtils.lastIndexOf("", '0', 0), objArr2);
                sb2.append(((String) objArr2[0]).intern());
            } else if (cCharAt == '\r') {
                StringBuilder sb3 = this.f23823c;
                Object[] objArr3 = new Object[1];
                l("랾趷", TextUtils.getCapsMode("", 0, 0) + 14887, objArr3);
                sb3.append(((String) objArr3[0]).intern());
            } else if (cCharAt != '\"' && cCharAt != '/' && cCharAt != '\\') {
                switch (cCharAt) {
                    case '\b':
                        StringBuilder sb4 = this.f23823c;
                        Object[] objArr4 = new Object[1];
                        l("랾퓟", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 25439, objArr4);
                        sb4.append(((String) objArr4[0]).intern());
                        int i6 = f23821j + 97;
                        f23822o = i6 % 128;
                        if (i6 % 2 == 0) {
                            int i7 = 4 % 4;
                        }
                        break;
                    case '\t':
                        StringBuilder sb5 = this.f23823c;
                        Object[] objArr5 = new Object[1];
                        k(3 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), "\f\ufff4", true, 138 - ExpandableListView.getPackedPositionGroup(0L), 1 - TextUtils.lastIndexOf("", '0', 0, 0), objArr5);
                        sb5.append(((String) objArr5[0]).intern());
                        break;
                    case '\n':
                        StringBuilder sb6 = this.f23823c;
                        Object[] objArr6 = new Object[1];
                        k(2 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), "\ufff7\t", false, View.MeasureSpec.makeMeasureSpec(0, 0) + 135, 2 - (Process.myTid() >> 22), objArr6);
                        sb6.append(((String) objArr6[0]).intern());
                        break;
                    default:
                        if (cCharAt > 31) {
                            this.f23823c.append(cCharAt);
                        } else {
                            int i8 = f23822o + 117;
                            f23821j = i8 % 128;
                            int i9 = i8 % 2;
                            StringBuilder sb7 = this.f23823c;
                            Object[] objArr7 = new Object[1];
                            k(ExpandableListView.getPackedPositionChild(0L) + 7, "+\uffe7￣\uffd8(\u000f", true, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 110, KeyEvent.keyCodeFromString("") + 6, objArr7);
                            sb7.append(String.format(((String) objArr7[0]).intern(), Integer.valueOf(cCharAt)));
                        }
                        break;
                }
            } else {
                this.f23823c.append('\\').append(cCharAt);
            }
            i5++;
            int i10 = f23821j + 105;
            f23822o = i10 % 128;
            int i11 = i10 % 2;
        }
        StringBuilder sb8 = this.f23823c;
        Object[] objArr8 = new Object[1];
        l("럀", 48437 - TextUtils.indexOf("", "", 0, 0), objArr8);
        sb8.append(((String) objArr8[0]).intern());
    }

    private e c(b bVar, String str) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f23822o + 79;
        f23821j = i3 % 128;
        if (i3 % 2 != 0) {
            this.f23825h.isEmpty();
            throw null;
        }
        if (this.f23825h.isEmpty() && this.f23823c.length() > 0) {
            Object[] objArr = new Object[1];
            l("랬黢\ue55b쮹ሟ祵俛阁ﲺ쌝⩿烗䜲궦\uf409\udb33→࠺庍ꗱ豲틂㤼ྜྷ囿봟菔\uea2aゞ\u07be湘뒼鬴\ue182죤Ἅ斤䰔鍳淋쁙", 10597 - Color.green(0), objArr);
            throw new o.ef.b(((String) objArr[0]).intern());
        }
        i();
        this.f23825h.add(bVar);
        this.f23823c.append(str);
        int i4 = f23822o + 41;
        f23821j = i4 % 128;
        if (i4 % 2 == 0) {
            return this;
        }
        throw null;
    }

    public static /* synthetic */ Object e(int i2, int i3, int i4, int i5, Object[] objArr, int i6, int i7) throws Throwable {
        int i8 = ~i4;
        int i9 = ~i6;
        int i10 = ~((-1) - (((-1) - i8) & ((-1) - i9)));
        int i11 = ~(i8 | i3);
        int i12 = (i10 + i11) - (i10 & i11);
        int i13 = ~((i9 + i3) - (i9 & i3));
        int i14 = (i12 + i13) - (i12 & i13);
        int i15 = ~i3;
        int i16 = (~(i15 | i4)) | (~((i9 + i4) - (i9 & i4)));
        int i17 = ~((-1) - (((-1) - i9) & ((-1) - ((-1) - (((-1) - i8) & ((-1) - i15))))));
        int i18 = i3 + i4 + i5 + ((-2109949842) * i2) + (2078889904 * i7);
        int i19 = i18 * i18;
        int i20 = ((-1963971821) * i3) + 932184064 + (61854959 * i4) + (1134570258 * i14) + (i16 * (-1134570258)) + ((-1134570258) * i17) + (1196425216 * i5) + (610271232 * i2) + (922746880 * i7) + (671350784 * i19);
        int i21 = (i3 * (-573803825)) + 196542130 + (i4 * (-573802789)) + (i14 * (-518)) + (i16 * 518) + (i17 * 518) + (i5 * (-573803307)) + (i2 * (-843101306)) + (i7 * (-1524517520)) + (i19 * 458489856);
        int i22 = i20 + (i21 * i21 * 64749568);
        if (i22 == 1) {
            e eVar = (e) objArr[0];
            int i23 = 2 % 2;
            int i24 = f23821j + 125;
            f23822o = i24 % 128;
            int i25 = i24 % 2;
            if (eVar.f23825h.isEmpty()) {
                Object[] objArr2 = new Object[1];
                k(15 - TextUtils.getOffsetBefore("", 0), "\u0001\u000f\u0010\u0005\n\u0003ﾼ\f\u000e\u000b\ufffe\b\u0001\t￪", false, (ViewConfiguration.getTouchSlop() >> 8) + 134, TextUtils.lastIndexOf("", '0', 0, 0) + 15, objArr2);
                throw new o.ef.b(((String) objArr2[0]).intern());
            }
            List<b> list = eVar.f23825h;
            b bVar = list.get(list.size() - 1);
            int i26 = f23822o + 43;
            f23821j = i26 % 128;
            int i27 = i26 % 2;
            return bVar;
        }
        if (i22 == 2) {
            e eVar2 = (e) objArr[0];
            b bVar2 = (b) objArr[1];
            int i28 = 2 % 2;
            int i29 = f23822o + 19;
            f23821j = i29 % 128;
            if (i29 % 2 != 0) {
                List<b> list2 = eVar2.f23825h;
                list2.set(list2.size() << 1, bVar2);
            } else {
                List<b> list3 = eVar2.f23825h;
                list3.set(list3.size() - 1, bVar2);
            }
            int i30 = f23822o + 105;
            f23821j = i30 % 128;
            int i31 = i30 % 2;
            return null;
        }
        e eVar3 = (e) objArr[0];
        b bVar3 = (b) objArr[1];
        b bVar4 = (b) objArr[2];
        String str = (String) objArr[3];
        int i32 = 2 % 2;
        int i33 = f23822o + 75;
        f23821j = i33 % 128;
        int i34 = i33 % 2;
        int i35 = f23817d * 1062709955;
        f23817d = i35;
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i36 = (-297711609) * f23816b;
        f23816b = i36;
        b bVar5 = (b) e(i36, 194074240, -194074239, iElapsedRealtime, new Object[]{eVar3}, i35, Thread.activeCount());
        if (bVar5 != bVar4) {
            int i37 = f23822o + 71;
            f23821j = i37 % 128;
            int i38 = i37 % 2;
            if (bVar5 != bVar3) {
                Object[] objArr3 = new Object[1];
                k(TextUtils.indexOf("", "", 0) + 15, "\u0001\u000f\u0010\u0005\n\u0003ﾼ\f\u000e\u000b\ufffe\b\u0001\t￪", false, Color.red(0) + 134, TextUtils.indexOf("", "") + 14, objArr3);
                throw new o.ef.b(((String) objArr3[0]).intern());
            }
        }
        List<b> list4 = eVar3.f23825h;
        list4.remove(list4.size() - 1);
        if (bVar5 == bVar4) {
            eVar3.g();
        }
        eVar3.f23823c.append(str);
        return eVar3;
    }

    private b f() throws o.ef.b {
        int i2 = f23817d * 1062709955;
        f23817d = i2;
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i3 = f23816b * (-297711609);
        f23816b = i3;
        return (b) e(i3, 194074240, -194074239, iElapsedRealtime, new Object[]{this}, i2, Thread.activeCount());
    }

    private void g() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f23821j;
        int i4 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f23822o = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        if (this.f23824f == null) {
            int i5 = i3 + 89;
            f23822o = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        StringBuilder sb = this.f23823c;
        int i7 = 0;
        Object[] objArr = new Object[1];
        l("럨", 48109 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr);
        sb.append(((String) objArr[0]).intern());
        while (i7 < this.f23825h.size()) {
            this.f23823c.append(this.f23824f);
            i7++;
            int i8 = f23821j + 1;
            f23822o = i8 % 128;
            int i9 = i8 % 2;
        }
    }

    private void i() throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        int i3 = f23822o + 49;
        f23821j = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 8 / 0;
            if (this.f23825h.isEmpty()) {
                return;
            }
        } else if (this.f23825h.isEmpty()) {
            return;
        }
        int i5 = f23817d * 1062709955;
        f23817d = i5;
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i6 = (-297711609) * f23816b;
        f23816b = i6;
        b bVar = (b) e(i6, 194074240, -194074239, iElapsedRealtime, new Object[]{this}, i5, Thread.activeCount());
        if (bVar == b.f23826a) {
            int i7 = f23821j + 87;
            f23822o = i7 % 128;
            int i8 = i7 % 2;
            Object[] objArr = {this, b.f23829d};
            int i9 = f23815a * (-739066741);
            f23815a = i9;
            e((int) Runtime.getRuntime().totalMemory(), 1015721252, -1015721250, new Random().nextInt(21096672), objArr, i9, new Random().nextInt());
            g();
            return;
        }
        if (bVar == b.f23829d) {
            int i10 = f23822o + 3;
            f23821j = i10 % 128;
            int i11 = i10 % 2;
            this.f23823c.append(AbstractJsonLexerKt.COMMA);
            g();
            return;
        }
        if (bVar != b.f23830e) {
            if (bVar == b.f23835j) {
                return;
            }
            Object[] objArr2 = new Object[1];
            k(16 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), "\u0001\u000f\u0010\u0005\n\u0003ﾼ\f\u000e\u000b\ufffe\b\u0001\t￪", false, 134 - ExpandableListView.getPackedPositionType(0L), 14 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr2);
            throw new o.ef.b(((String) objArr2[0]).intern());
        }
        int i12 = f23821j + 73;
        int i13 = i12 % 128;
        f23822o = i13;
        if (i12 % 2 == 0) {
            throw null;
        }
        StringBuilder sb = this.f23823c;
        if (this.f23824f == null) {
            int i14 = i13 + 25;
            f23821j = i14 % 128;
            int i15 = i14 % 2;
            Object[] objArr3 = new Object[1];
            l("럘", Color.blue(0) + 25087, objArr3);
            obj = objArr3[0];
        } else {
            Object[] objArr4 = new Object[1];
            k(TextUtils.lastIndexOf("", '0', 0, 0) + 3, "\ufff3\r", true, 79 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2, objArr4);
            obj = objArr4[0];
        }
        sb.append(((String) obj).intern());
        Object[] objArr5 = {this, b.f23827b};
        int i16 = f23815a * (-739066741);
        f23815a = i16;
        e((int) Runtime.getRuntime().totalMemory(), 1015721252, -1015721250, new Random().nextInt(21096672), objArr5, i16, new Random().nextInt());
    }

    static void init$0() {
        $$a = new byte[]{64, -9, -71, 106};
        $$b = 20;
    }

    private void j() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f23822o + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f23821j = i3 % 128;
        int i4 = i3 % 2;
        int i5 = f23817d * 1062709955;
        f23817d = i5;
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i6 = (-297711609) * f23816b;
        f23816b = i6;
        b bVar = (b) e(i6, 194074240, -194074239, iElapsedRealtime, new Object[]{this}, i5, Thread.activeCount());
        if (bVar == b.f23827b) {
            this.f23823c.append(AbstractJsonLexerKt.COMMA);
            int i7 = f23821j + 65;
            f23822o = i7 % 128;
            int i8 = i7 % 2;
        } else if (bVar != b.f23828c) {
            Object[] objArr = new Object[1];
            k(15 - (ViewConfiguration.getLongPressTimeout() >> 16), "\u0001\u000f\u0010\u0005\n\u0003ﾼ\f\u000e\u000b\ufffe\b\u0001\t￪", false, Color.green(0) + 134, View.MeasureSpec.makeMeasureSpec(0, 0) + 14, objArr);
            throw new o.ef.b(((String) objArr[0]).intern());
        }
        g();
        Object[] objArr2 = {this, b.f23830e};
        int i9 = f23815a * (-739066741);
        f23815a = i9;
        e((int) Runtime.getRuntime().totalMemory(), 1015721252, -1015721250, new Random().nextInt(21096672), objArr2, i9, new Random().nextInt());
    }

    private static void k(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
        Object charArray;
        String str2 = str;
        int i5 = 2 % 2;
        int i6 = $11 + 31;
        $10 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 29 / 0;
            charArray = str2 != null ? str2.toCharArray() : str2;
        } else {
            if (str2 != null) {
            }
        }
        char[] cArr = (char[]) charArray;
        n nVar = new n();
        char[] cArr2 = new char[i2];
        nVar.f19944a = 0;
        while (nVar.f19944a < i2) {
            nVar.f19946e = cArr[nVar.f19944a];
            cArr2[nVar.f19944a] = (char) (i3 + nVar.f19946e);
            int i8 = nVar.f19944a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(f23819g)};
                Object objA = o.d.d.a(1376241034);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 269, (char) KeyEvent.getDeadChar(0, 0), 11 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -2071844881, false, $$c(b2, b3, (byte) ((b3 + 44) - (44 & b3))), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nVar, nVar};
                Object objA2 = o.d.d.a(-202660535);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a(522 - KeyEvent.normalizeMetaState(0), (char) (Process.myTid() >> 22), Process.getGidForName("") + 13, 627984172, false, $$c(b4, b5, (byte) ((b5 + 42) - (42 & b5))), new Class[]{Object.class, Object.class});
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
        if (i4 > 0) {
            int i9 = $11 + 101;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            nVar.f19945b = i4;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - nVar.f19945b, nVar.f19945b);
            System.arraycopy(cArr3, nVar.f19945b, cArr2, 0, i2 - nVar.f19945b);
        }
        if (z2) {
            char[] cArr4 = new char[i2];
            nVar.f19944a = 0;
            while (nVar.f19944a < i2) {
                int i11 = $10 + 33;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                Object[] objArr4 = {nVar, nVar};
                Object objA3 = o.d.d.a(-202660535);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA3 = o.d.d.a(View.resolveSizeAndState(0, 0, 0) + 522, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 13 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 627984172, false, $$c(b6, b7, (byte) (42 | b7)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        String str3 = new String(cArr2);
        int i13 = $10 + 99;
        $11 = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
        objArr[0] = str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void l(java.lang.String r23, int r24, java.lang.Object[] r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 383
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ef.e.l(java.lang.String, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        if (r4.f23823c.length() == 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        return r4.f23823c.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r4.f23823c.length() == 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        r2 = o.ef.e.f23821j + 29;
        o.ef.e.f23822o = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
    
        if ((r2 % 2) != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        r0 = 12 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        return "";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a() {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = o.ef.e.f23822o
            int r1 = r0 + 123
            int r0 = r1 % 128
            o.ef.e.f23821j = r0
            int r1 = r1 % r3
            if (r1 == 0) goto L2c
            java.lang.StringBuilder r0 = r4.f23823c
            int r1 = r0.length()
            r0 = 31
            int r0 = r0 / 0
            if (r1 != 0) goto L35
        L1a:
            int r0 = o.ef.e.f23821j
            int r2 = r0 + 29
            int r0 = r2 % 128
            o.ef.e.f23822o = r0
            int r2 = r2 % r3
            java.lang.String r1 = ""
            if (r2 != 0) goto L2b
            r0 = 12
            int r0 = r0 / 0
        L2b:
            return r1
        L2c:
            java.lang.StringBuilder r0 = r4.f23823c
            int r0 = r0.length()
            if (r0 != 0) goto L35
            goto L1a
        L35:
            java.lang.StringBuilder r0 = r4.f23823c
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ef.e.a():java.lang.String");
    }

    public final e b() throws o.ef.b {
        int i2 = 2 % 2;
        int i3 = f23821j + 109;
        f23822o = i3 % 128;
        int i4 = i3 % 2;
        b bVar = b.f23828c;
        Object[] objArr = new Object[1];
        k(1 - (ViewConfiguration.getScrollBarSize() >> 8), WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, true, 157 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1 - TextUtils.getCapsMode("", 0, 0), objArr);
        e eVarC = c(bVar, ((String) objArr[0]).intern());
        int i5 = f23822o + 63;
        f23821j = i5 % 128;
        int i6 = i5 % 2;
        return eVarC;
    }

    public final e c() throws o.ef.b {
        int i2 = 2 % 2;
        int i3 = f23822o + 43;
        f23821j = i3 % 128;
        int i4 = i3 % 2;
        b bVar = b.f23826a;
        b bVar2 = b.f23829d;
        Object[] objArr = new Object[1];
        l("랿", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 35490, objArr);
        Object[] objArr2 = {this, bVar, bVar2, ((String) objArr[0]).intern()};
        int iMyUid = Process.myUid();
        int iMyPid = Process.myPid();
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i5 = f23818e * 1231766960;
        f23818e = i5;
        e eVar = (e) e(iFreeMemory, -761252135, 761252135, iMyPid, objArr2, iMyUid, i5);
        int i6 = f23821j + 79;
        f23822o = i6 % 128;
        int i7 = i6 % 2;
        return eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o.ef.e c(java.lang.Object r11) throws o.ef.b {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ef.e.c(java.lang.Object):o.ef.e");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        r1 = new java.lang.Object[1];
        l("랬㝶뙥㕘둅㌋눱ㄤ뀹㼋빐㴇볻㮳뫪㧖룜➊ꚶ▸꒪⎗", android.text.TextUtils.lastIndexOf("", '0', 0, 0) + 33014, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        throw new o.ef.b(((java.lang.String) r1[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r6 != null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        j();
        b(r6);
        r1 = o.ef.e.f23821j + 53;
        o.ef.e.f23822o = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (r6 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o.ef.e c(java.lang.String r6) throws java.lang.Throwable {
        /*
            r5 = this;
            r2 = 2
            int r0 = r2 % r2
            int r0 = o.ef.e.f23822o
            int r1 = r0 + 121
            int r0 = r1 % 128
            o.ef.e.f23821j = r0
            int r1 = r1 % r2
            r4 = 0
            if (r1 == 0) goto L24
            r0 = 69
            int r0 = r0 / r4
            if (r6 == 0) goto L27
        L14:
            r5.j()
            r5.b(r6)
            int r0 = o.ef.e.f23821j
            int r1 = r0 + 53
            int r0 = r1 % 128
            o.ef.e.f23822o = r0
            int r1 = r1 % r2
            return r5
        L24:
            if (r6 == 0) goto L27
            goto L14
        L27:
            o.ef.b r3 = new o.ef.b
            java.lang.String r1 = ""
            r0 = 48
            int r2 = android.text.TextUtils.lastIndexOf(r1, r0, r4, r4)
            r0 = 33014(0x80f6, float:4.6262E-41)
            int r2 = r2 + r0
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r0 = "랬㝶뙥㕘둅㌋눱ㄤ뀹㼋빐㴇볻㮳뫪㧖룜➊ꚶ▸꒪⎗"
            l(r0, r2, r1)
            r0 = r1[r4]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ef.e.c(java.lang.String):o.ef.e");
    }

    public final e d() throws o.ef.b {
        int i2 = 2 % 2;
        int i3 = f23822o + 27;
        f23821j = i3 % 128;
        int i4 = i3 % 2;
        b bVar = b.f23828c;
        b bVar2 = b.f23827b;
        Object[] objArr = new Object[1];
        l("랟", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12049, objArr);
        Object[] objArr2 = {this, bVar, bVar2, ((String) objArr[0]).intern()};
        int iMyUid = Process.myUid();
        int iMyPid = Process.myPid();
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i5 = f23818e * 1231766960;
        f23818e = i5;
        e eVar = (e) e(iFreeMemory, -761252135, 761252135, iMyPid, objArr2, iMyUid, i5);
        int i6 = f23821j + 101;
        f23822o = i6 % 128;
        if (i6 % 2 != 0) {
            return eVar;
        }
        throw null;
    }

    public final e e() throws o.ef.b {
        int i2 = 2 % 2;
        int i3 = f23822o + 15;
        f23821j = i3 % 128;
        int i4 = i3 % 2;
        b bVar = b.f23826a;
        Object[] objArr = new Object[1];
        k(1 - TextUtils.getOffsetAfter("", 0), WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, false, 125 - (ViewConfiguration.getEdgeSlop() >> 16), 1 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr);
        e eVarC = c(bVar, ((String) objArr[0]).intern());
        int i5 = f23821j + 123;
        f23822o = i5 % 128;
        if (i5 % 2 != 0) {
            return eVarC;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
