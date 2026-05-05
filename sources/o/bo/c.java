package o.bo;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.push.RemoteMessage;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import o.a.l;
import o.ea.m;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends o.bv.a<o.bv.e> implements d {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f21444c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char[] f21445d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f21446e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f21447f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f21448g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int[] f21449h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f21450i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f21451j = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f21452n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0343c f21453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o.bk.c f21454b;

    /* JADX INFO: renamed from: o.bo.c$c, reason: collision with other inner class name */
    static final class C0343c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final boolean f21455c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final HmsInstanceId f21456d;

        C0343c(Context context, String str, String str2) {
            this.f21456d = HmsInstanceId.getInstance(context);
            this.f21455c = str2.equals(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0017). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r8, int r9, byte r10) {
        /*
            int r0 = r9 * 2
            int r7 = r0 + 67
            byte[] r6 = o.bo.c.$$a
            int r2 = r8 * 2
            int r1 = 1 - r2
            int r0 = r10 * 3
            int r0 = 3 - r0
            byte[] r5 = new byte[r1]
            r4 = 0
            int r3 = 0 - r2
            if (r6 != 0) goto L2b
            r2 = r0
            r1 = r4
        L17:
            int r7 = r7 + r0
            r0 = r2
        L19:
            int r2 = r0 + 1
            byte r0 = (byte) r7
            r5[r1] = r0
            if (r1 != r3) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L26:
            int r1 = r1 + 1
            r0 = r6[r2]
            goto L17
        L2b:
            r1 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bo.c.$$c(short, int, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f21448g = 0;
        f21452n = 1;
        f21450i = 0;
        f21447f = 1;
        a();
        TextUtils.indexOf("", "", 0, 0);
        ViewConfiguration.getKeyRepeatDelay();
        Process.myTid();
        View.getDefaultSize(0, 0);
        int i2 = f21452n + 53;
        f21448g = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public c(Context context, o.bv.e eVar, o.bk.c cVar) {
        super(eVar);
        this.f21454b = cVar;
        this.f21453a = c(context);
    }

    static void a() {
        f21445d = new char[]{2551, 2512, 2522, 2559, 2520, 2519, 2545, 2526, 2523, 2516, 2537, 2538, 2540, 2513, 2525, 2521, 2539, 2536, 2527, 2351, 2320, 2515, 2517, 2518, 2313, 2548, 2544, 2554, 2314, 2555, 2514};
        f21446e = 2040400207;
        f21444c = true;
        f21451j = true;
        f21449h = new int[]{1681136609, -710531183, -473802037, 2066467087, 735127656, 348889551, -471042257, -2063568661, 1657084738, 1151617618, -1552878611, 1216241888, 2127552250, 1071242479, -39095053, -1256841848, 1955010428, 1285474892};
    }

    private C0343c c(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f21450i + 101;
        f21447f = i3 % 128;
        int i4 = i3 % 2;
        String strE = this.f21454b.e();
        Object[] objArr = {this.f21454b};
        int iMyTid = Process.myTid();
        int i5 = o.bk.c.f21310c * 1985526646;
        o.bk.c.f21310c = i5;
        String str = (String) o.bk.c.d((int) SystemClock.uptimeMillis(), 1235691696, -1235691696, i5, iMyTid, objArr, (int) SystemClock.uptimeMillis());
        String strD = this.f21454b.d();
        if (!str.isEmpty()) {
            int i6 = f21447f + 21;
            f21450i = i6 % 128;
            int i7 = i6 % 2;
            if (!strE.isEmpty()) {
                C0343c c0343c = new C0343c(context, str, strD);
                if (o.ea.f.a()) {
                    Object[] objArr2 = new Object[1];
                    k(127 - (ViewConfiguration.getScrollBarSize() >> 8), null, null, "\u008f\u0092\u0091\u008a\u0090\u0088\u008f\u0084\u008e\u0088\u008a\u0089\u008d\u008c\u008a\u008b\u008a\u0089\u0088\u0087\u0086\u0083\u0085\u0084\u0083\u0082\u0081", objArr2);
                    String strIntern = ((String) objArr2[0]).intern();
                    StringBuilder sb = new StringBuilder();
                    Object[] objArr3 = new Object[1];
                    l(new int[]{1352176674, 722158962, -691605384, -20016768, 249431957, -1770136714, -312346635, -2121224300, -1496168686, 342566960, -24542842, 462629295, 1070662828, 1499318788, -2088487957, -562614668, -271427551, 1593155401, 193053888, -645710910, 1032893278, -497466497, 481001325, -851615870, -959402251, 1272276563, -41558985, 2085824674, 2040327695, -735551407, -1361790454, -1350075680, -271427551, 1593155401, 453855844, 268936926}, 72 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr3);
                    o.ea.f.c(strIntern, sb.append(((String) objArr3[0]).intern()).append(c0343c.f21455c).toString());
                }
                int i8 = f21447f + 47;
                f21450i = i8 % 128;
                int i9 = i8 % 2;
                return c0343c;
            }
        }
        if (o.ea.f.a()) {
            Object[] objArr4 = new Object[1];
            k((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 127, null, null, "\u008f\u0092\u0091\u008a\u0090\u0088\u008f\u0084\u008e\u0088\u008a\u0089\u008d\u008c\u008a\u008b\u008a\u0089\u0088\u0087\u0086\u0083\u0085\u0084\u0083\u0082\u0081", objArr4);
            String strIntern2 = ((String) objArr4[0]).intern();
            Object[] objArr5 = new Object[1];
            l(new int[]{1352176674, 722158962, -691605384, -20016768, 249431957, -1770136714, -312346635, -2121224300, -1496168686, 342566960, -24542842, 462629295, 1070662828, 1499318788, 1302573961, 882814023, -1504464319, 1084823821, -400913759, -2132617274, -506044261, 1583789579, -1670844678, -621684178, -1654039550, -347348544}, View.resolveSize(0, 0) + 50, objArr5);
            o.ea.f.c(strIntern2, ((String) objArr5[0]).intern());
        }
        Object[] objArr6 = new Object[1];
        l(new int[]{1254001284, -1779953524, -782726473, 262029313, -1109874191, 94160886, -903274059, -1203416134, -1624598214, 1502001461, 710759618, -545429041, 2093758267, -1697553550}, 25 - TextUtils.getCapsMode("", 0, 0), objArr6);
        throw new IllegalArgumentException(((String) objArr6[0]).intern());
    }

    public static h d(Object obj) throws Throwable {
        String strIntern;
        Object obj2;
        int i2 = 2 % 2;
        RemoteMessage remoteMessage = (RemoteMessage) obj;
        if (remoteMessage.getData() == null || remoteMessage.getData().isEmpty()) {
            if (o.ea.f.a()) {
                Object[] objArr = new Object[1];
                k(ExpandableListView.getPackedPositionChild(0L) + 128, null, null, "\u008f\u0092\u0091\u008a\u0090\u0088\u008f\u0084\u008e\u0088\u008a\u0089\u008d\u008c\u008a\u008b\u008a\u0089\u0088\u0087\u0086\u0083\u0085\u0084\u0083\u0082\u0081", objArr);
                String strIntern2 = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                l(new int[]{-1083131036, -706535802, -125450001, -1550481481, -728431408, -1497860564, 710759618, -545429041, 1061809475, 412126505, 1828668950, 744124765, -2103717872, 1985867345, -1587786085, 889800238, -1804081032, 323023143, 499674565, 524442998, 1119185905, 1637599156, -722792635, -1412125344, -1954195442, -1631273168}, (ViewConfiguration.getScrollBarSize() >> 8) + 52, objArr2);
                o.ea.f.d(strIntern2, ((String) objArr2[0]).intern());
            }
            return null;
        }
        HashMap map = new HashMap();
        try {
            Object[] objArr3 = {remoteMessage.getData()};
            int i3 = m.f23563d * 691068131;
            m.f23563d = i3;
            int i4 = m.f23561b * (-1916120846);
            m.f23561b = i4;
            o.ef.a aVar = new o.ef.a((String) m.c(objArr3, (int) SystemClock.uptimeMillis(), i4, -327535505, i3, 327535505, Process.myUid()));
            int i5 = o.ef.a.f23769c * (-1989011043);
            o.ef.a.f23769c = i5;
            int i6 = o.ef.a.f23776j * 720337855;
            o.ef.a.f23776j = i6;
            int i7 = o.ef.a.f23775i * 253749855;
            o.ef.a.f23775i = i7;
            int i8 = o.ef.a.f23774h * 1380085454;
            o.ef.a.f23774h = i8;
            Iterator it = (Iterator) o.ef.a.a(1890943914, new Object[]{aVar}, i7, i8, -1890943912, i5, i6);
            while (it.hasNext()) {
                String str = (String) it.next();
                int i9 = o.ef.a.f23783q * 704632834;
                o.ef.a.f23783q = i9;
                int i10 = (int) Runtime.getRuntime().totalMemory();
                int i11 = (-1582463295) * o.ef.a.f23787u;
                o.ef.a.f23787u = i11;
                int i12 = 1024294213 * o.ef.a.f23788v;
                o.ef.a.f23788v = i12;
                if (!((Boolean) o.ef.a.a(322886991, new Object[]{aVar, str}, i11, i12, -322886980, i9, i10)).booleanValue()) {
                    int i13 = f21450i + 39;
                    f21447f = i13 % 128;
                    if (i13 % 2 == 0) {
                        map.put(str, aVar.a(str).toString());
                        int i14 = 63 / 0;
                    } else {
                        map.put(str, aVar.a(str).toString());
                    }
                }
            }
            if (o.ea.f.a()) {
                int i15 = f21450i + 81;
                f21447f = i15 % 128;
                if (i15 % 2 == 0) {
                    Object[] objArr4 = new Object[1];
                    k(ExpandableListView.getPackedPositionChild(0L) * 32446, null, null, "\u008f\u0092\u0091\u008a\u0090\u0088\u008f\u0084\u008e\u0088\u008a\u0089\u008d\u008c\u008a\u008b\u008a\u0089\u0088\u0087\u0086\u0083\u0085\u0084\u0083\u0082\u0081", objArr4);
                    strIntern = ((String) objArr4[0]).intern();
                    Object[] objArr5 = new Object[1];
                    l(new int[]{-1083131036, -706535802, -125450001, -1550481481, -728431408, -1497860564, 710759618, -545429041, 1061809475, 412126505, -225862301, 2112433411, -1716482536, -923637767, 478832361, 1264945009, -996241227, 1856581467, 35836056, -1335159381, -421574313, -629676502, 2091117012, -765114568}, 20 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr5);
                    obj2 = objArr5[0];
                } else {
                    Object[] objArr6 = new Object[1];
                    k(ExpandableListView.getPackedPositionChild(0L) + 128, null, null, "\u008f\u0092\u0091\u008a\u0090\u0088\u008f\u0084\u008e\u0088\u008a\u0089\u008d\u008c\u008a\u008b\u008a\u0089\u0088\u0087\u0086\u0083\u0085\u0084\u0083\u0082\u0081", objArr6);
                    strIntern = ((String) objArr6[0]).intern();
                    Object[] objArr7 = new Object[1];
                    l(new int[]{-1083131036, -706535802, -125450001, -1550481481, -728431408, -1497860564, 710759618, -545429041, 1061809475, 412126505, -225862301, 2112433411, -1716482536, -923637767, 478832361, 1264945009, -996241227, 1856581467, 35836056, -1335159381, -421574313, -629676502, 2091117012, -765114568}, 49 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr7);
                    obj2 = objArr7[0];
                }
                o.ea.f.c(strIntern, ((String) obj2).intern());
            }
            return new h(map, remoteMessage);
        } catch (o.ef.b e2) {
            if (o.ea.f.a()) {
                Object[] objArr8 = new Object[1];
                k((ViewConfiguration.getJumpTapTimeout() >> 16) + 127, null, null, "\u008f\u0092\u0091\u008a\u0090\u0088\u008f\u0084\u008e\u0088\u008a\u0089\u008d\u008c\u008a\u008b\u008a\u0089\u0088\u0087\u0086\u0083\u0085\u0084\u0083\u0082\u0081", objArr8);
                String strIntern3 = ((String) objArr8[0]).intern();
                Object[] objArr9 = new Object[1];
                k((ViewConfiguration.getFadingEdgeLength() >> 16) + 127, null, null, "\u0089\u008d\u0082\u008f\u0088\u008b\u0094\u008e\u0088\u0083\u0097\u0094\u0091\u008a\u0096\u008d\u0090\u008e\u008a\u0094\u008e\u008d\u0094\u0083\u008d\u0086\u0094\u008d\u0089\u008d\u0091\u0094\u0095\u0094\u008e\u0088\u008a\u0089\u008d\u008c\u008a\u008b\u008a\u0089\u0088\u0087\u0092\u0083\u008f\u008d\u0093", objArr9);
                o.ea.f.e(strIntern3, ((String) objArr9[0]).intern(), e2);
            }
            return null;
        }
    }

    static void init$0() {
        $$a = new byte[]{69, -20, MessagePack.Code.INT64, -20};
        $$b = 234;
    }

    private static void k(int i2, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
        char[] cArr;
        String str3 = str;
        String str4 = str2;
        int i3 = 2;
        int i4 = 2 % 2;
        int i5 = $10 + 97;
        int i6 = i5 % 128;
        $11 = i6;
        int i7 = i5 % 2;
        Object bytes = str4;
        if (str4 != null) {
            int i8 = i6 + 29;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            bytes = str4.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr2 = (char[]) charArray;
        o.a.f fVar = new o.a.f();
        char[] cArr3 = f21445d;
        char c2 = '0';
        int i10 = 0;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i11 = 0;
            while (i11 < length) {
                int i12 = $11 + 69;
                $10 = i12 % 128;
                int i13 = i12 % i3;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i11])};
                    Object objA = o.d.d.a(1618406102);
                    if (objA == null) {
                        byte b2 = (byte) i10;
                        byte b3 = b2;
                        objA = o.d.d.a((KeyEvent.getMaxKeyCode() >> 16) + 593, (char) (TextUtils.lastIndexOf("", c2) + 13182), 11 - Color.argb(i10, i10, i10, i10), -1225586509, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i11++;
                    i3 = 2;
                    c2 = '0';
                    i10 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        Object[] objArr3 = {Integer.valueOf(f21446e)};
        Object objA2 = o.d.d.a(-1503702982);
        long j2 = 0;
        if (objA2 == null) {
            objA2 = o.d.d.a(32 - ExpandableListView.getPackedPositionGroup(0L), (char) TextUtils.getOffsetBefore("", 0), View.MeasureSpec.getSize(0) + 11, 1893380703, false, "F", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
        if (f21451j) {
            int i14 = $11 + 55;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            fVar.f19923e = bArr.length;
            char[] cArr5 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                int i16 = $10 + 33;
                $11 = i16 % 128;
                int i17 = i16 % 2;
                cArr5[fVar.f19922a] = (char) (cArr3[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i2] - iIntValue);
                Object[] objArr4 = {fVar, fVar};
                Object objA3 = o.d.d.a(1540807955);
                if (objA3 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 3);
                    objA3 = o.d.d.a((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 458, (char) (Process.getGidForName("") + 1), 11 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -1923924106, false, $$c(b4, b5, (byte) (b5 - 3)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        if (f21444c) {
            int i18 = $10 + 105;
            $11 = i18 % 128;
            if (i18 % 2 == 0) {
                fVar.f19923e = cArr2.length;
                cArr = new char[fVar.f19923e];
                fVar.f19922a = 1;
            } else {
                fVar.f19923e = cArr2.length;
                cArr = new char[fVar.f19923e];
                fVar.f19922a = 0;
            }
            while (fVar.f19922a < fVar.f19923e) {
                int i19 = $10 + 83;
                $11 = i19 % 128;
                if (i19 % 2 == 0) {
                    cArr[fVar.f19922a] = (char) (cArr3[cArr2[(fVar.f19923e << 1) - fVar.f19922a] >> i2] / iIntValue);
                    Object[] objArr5 = {fVar, fVar};
                    Object objA4 = o.d.d.a(1540807955);
                    if (objA4 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = (byte) (b6 + 3);
                        objA4 = o.d.d.a(459 - (ViewConfiguration.getGlobalActionKeyTimeout() > j2 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j2 ? 0 : -1)), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 10 - TextUtils.lastIndexOf("", '0', 0), -1923924106, false, $$c(b6, b7, (byte) (b7 - 3)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA4).invoke(null, objArr5);
                } else {
                    cArr[fVar.f19922a] = (char) (cArr3[cArr2[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                    Object[] objArr6 = {fVar, fVar};
                    Object objA5 = o.d.d.a(1540807955);
                    if (objA5 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = (byte) (b8 + 3);
                        objA5 = o.d.d.a(458 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) ('0' - AndroidCharacter.getMirror('0')), 11 - TextUtils.indexOf("", "", 0), -1923924106, false, $$c(b8, b9, (byte) (b9 - 3)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA5).invoke(null, objArr6);
                }
                j2 = 0;
            }
            objArr[0] = new String(cArr);
            return;
        }
        int i20 = 0;
        fVar.f19923e = iArr.length;
        char[] cArr6 = new char[fVar.f19923e];
        while (true) {
            fVar.f19922a = i20;
            if (fVar.f19922a >= fVar.f19923e) {
                objArr[0] = new String(cArr6);
                return;
            }
            int i21 = $10 + 123;
            $11 = i21 % 128;
            if (i21 % 2 == 0) {
                cArr6[fVar.f19922a] = (char) (cArr3[iArr[fVar.f19923e >> fVar.f19922a] >> i2] / iIntValue);
                i20 = fVar.f19922a - 1;
            } else {
                cArr6[fVar.f19922a] = (char) (cArr3[iArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                i20 = fVar.f19922a + 1;
            }
        }
    }

    private static void l(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        l lVar = new l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = f21449h;
        int i5 = 989264422;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 1;
                $10 = i8 % 128;
                if (i8 % i3 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                        Object objA = o.d.d.a(i5);
                        if (objA == null) {
                            byte b2 = (byte) 0;
                            objA = o.d.d.a((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 674, (char) View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.getMode(0) + 12, -328001469, false, $$c(b2, (byte) (27 | b2), b2), new Class[]{Integer.TYPE});
                        }
                        iArr3[i7] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(iArr2[i7])};
                    Object objA2 = o.d.d.a(989264422);
                    if (objA2 == null) {
                        byte b3 = (byte) 0;
                        objA2 = o.d.d.a(Color.alpha(0) + 675, (char) TextUtils.getTrimmedLength(""), 12 - Drawable.resolveOpacity(0, 0), -328001469, false, $$c(b3, (byte) ((-1) - (((-1) - b3) & ((-1) - 27))), b3), new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                    i7++;
                }
                i3 = 2;
                i5 = 989264422;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = f21449h;
        char c2 = '0';
        if (iArr5 != null) {
            int i9 = $10 + 107;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i11 = 0;
            while (i11 < length3) {
                Object[] objArr4 = {Integer.valueOf(iArr5[i11])};
                Object objA3 = o.d.d.a(989264422);
                if (objA3 == null) {
                    byte b4 = (byte) i6;
                    objA3 = o.d.d.a(675 - Color.alpha(i6), (char) ((-1) - TextUtils.indexOf("", c2, i6)), KeyEvent.getDeadChar(i6, i6) + 12, -328001469, false, $$c(b4, (byte) (27 | b4), b4), new Class[]{Integer.TYPE});
                }
                iArr6[i11] = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                i11++;
                c2 = '0';
                i6 = 0;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, i6, iArr4, i6, length2);
        lVar.f19941d = i6;
        int i12 = $10 + 29;
        $11 = i12 % 128;
        while (true) {
            int i13 = i12 % 2;
            if (lVar.f19941d >= iArr.length) {
                break;
            }
            cArr[0] = (char) (iArr[lVar.f19941d] >> 16);
            cArr[1] = (char) iArr[lVar.f19941d];
            cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
            cArr[3] = (char) iArr[lVar.f19941d + 1];
            lVar.f19942e = (cArr[0] << 16) + cArr[1];
            lVar.f19940a = (cArr[2] << 16) + cArr[3];
            l.a(iArr4);
            int i14 = $10 + 93;
            $11 = i14 % 128;
            int i15 = 2;
            int i16 = i14 % 2;
            int i17 = 0;
            while (i17 < 16) {
                int i18 = $11 + 5;
                $10 = i18 % 128;
                if (i18 % i15 != 0) {
                    lVar.f19942e ^= iArr4[i17];
                    Object[] objArr5 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                    Object objA4 = o.d.d.a(2098218801);
                    if (objA4 == null) {
                        byte b5 = (byte) 0;
                        objA4 = o.d.d.a(301 - (ViewConfiguration.getEdgeSlop() >> 16), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 52696), 11 - (KeyEvent.getMaxKeyCode() >> 16), -1416256172, false, $$c(b5, (byte) ((b5 + Ascii.SUB) - (26 & b5)), b5), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                    lVar.f19942e = lVar.f19940a;
                    lVar.f19940a = iIntValue;
                    i17 += 63;
                } else {
                    lVar.f19942e ^= iArr4[i17];
                    Object[] objArr6 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                    Object objA5 = o.d.d.a(2098218801);
                    if (objA5 == null) {
                        byte b6 = (byte) 0;
                        objA5 = o.d.d.a(300 - Process.getGidForName(""), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 52696), 11 - TextUtils.getTrimmedLength(""), -1416256172, false, $$c(b6, (byte) ((b6 + Ascii.SUB) - (26 & b6)), b6), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objA5).invoke(null, objArr6)).intValue();
                    lVar.f19942e = lVar.f19940a;
                    lVar.f19940a = iIntValue2;
                    i17++;
                }
                i15 = 2;
            }
            int i19 = lVar.f19942e;
            lVar.f19942e = lVar.f19940a;
            lVar.f19940a = i19;
            lVar.f19940a ^= iArr4[16];
            lVar.f19942e ^= iArr4[17];
            int i20 = lVar.f19942e;
            int i21 = lVar.f19940a;
            cArr[0] = (char) (lVar.f19942e >>> 16);
            cArr[1] = (char) lVar.f19942e;
            cArr[2] = (char) (lVar.f19940a >>> 16);
            cArr[3] = (char) lVar.f19940a;
            l.a(iArr4);
            cArr2[lVar.f19941d * 2] = cArr[0];
            cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
            cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
            cArr2[(lVar.f19941d * 2) + 3] = cArr[3];
            Object[] objArr7 = {lVar, lVar};
            Object objA6 = o.d.d.a(986820978);
            if (objA6 == null) {
                byte b7 = (byte) 0;
                objA6 = o.d.d.a(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 230, (char) (51004 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 9 - (ViewConfiguration.getLongPressTimeout() >> 16), -330018025, false, $$c(b7, (byte) ((-1) - (((-1) - b7) & ((-1) - 25))), b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objA6).invoke(null, objArr7);
            i12 = $11 + 77;
            $10 = i12 % 128;
        }
        String str = new String(cArr2, 0, i2);
        int i22 = $11 + 67;
        $10 = i22 % 128;
        if (i22 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0079, code lost:
    
        throw new o.bo.f(((java.lang.String) r0[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0091, code lost:
    
        if (b(r17) == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009a, code lost:
    
        if (r16.f21453a.f21455c != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x009c, code lost:
    
        r2 = r16.f21453a.f21456d.getToken(r16.f21454b.d());
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ab, code lost:
    
        r1 = o.bo.c.f21447f + 81;
        o.bo.c.f21450i = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b4, code lost:
    
        if ((r1 % 2) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b7, code lost:
    
        r10 = r16.f21453a.f21456d;
        r5 = r16.f21454b.e();
        r0 = new java.lang.Object[1];
        k(127 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), null, null, "\u009b\u009d\u0081", r0);
        r0 = ((java.lang.String) r0[0]).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00db, code lost:
    
        r10 = r16.f21453a.f21456d;
        r5 = r16.f21454b.e();
        r0 = new java.lang.Object[1];
        k(53 / (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(1) > 1.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(1) == 1.0d ? 0 : -1)), null, null, "\u009b\u009d\u0081", r0);
        r0 = ((java.lang.String) r0[0]).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ff, code lost:
    
        r2 = r10.getToken(r5, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0103, code lost:
    
        if (r2 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0109, code lost:
    
        if (o.ea.f.a() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x010b, code lost:
    
        r1 = new java.lang.Object[1];
        k(127 - (android.view.ViewConfiguration.getTapTimeout() >> 16), null, null, "\u0096\u0096\u0085\u008e\u0094\u0083\u008a\u0094\u0091\u0092\u0086\u008c\u0089\u0092\u008b\u0094\u008e\u0092\u009f\u0088\u0089\u0094\u0092\u0086\u0089\u0094\u0095\u0094\u008e\u0092\u009f\u0088\u009e\u0086\u008c\u0089\u0092\u008b", r1);
        o.ea.f.d(r3, ((java.lang.String) r1[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0125, code lost:
    
        r0 = new java.lang.Object[1];
        l(new int[]{-264643625, -341875485, -2087893576, -57721140, 159529579, -189213390, -1675625423, 33398012, 457098574, -1269012370, -574167931, -4262682}, 24 - android.text.TextUtils.indexOf("", "", 0), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0148, code lost:
    
        throw new o.bo.f(((java.lang.String) r0[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x014d, code lost:
    
        if (o.ea.f.a() == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x014f, code lost:
    
        r5 = new java.lang.StringBuilder();
        r0 = new java.lang.Object[1];
        l(new int[]{-1428796862, 842247570, 886350204, 613190144, -191199653, 902229019, -2056701832, -1953949964, 1090068157, 220977455, -192690454, -1128751490, 1059373048, 1949844092, 1240639134, -1745217400}, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29, r0);
        o.ea.f.c(r3, r5.append(((java.lang.String) r0[0]).intern()).append(r2).toString());
        r1 = o.bo.c.f21447f + 33;
        o.bo.c.f21450i = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0187, code lost:
    
        r6 = o.ea.m.f23563d * 691068131;
        o.ea.m.f23563d = r6;
        r4 = o.ea.m.f23561b * (-1916120846);
        o.ea.m.f23561b = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x01b0, code lost:
    
        return (java.lang.String) o.ea.m.c(new java.lang.Object[]{r2}, (int) android.os.SystemClock.uptimeMillis(), r4, -327535505, r6, 327535505, android.os.Process.myUid());
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01b1, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01b6, code lost:
    
        if (o.ea.f.a() != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01b8, code lost:
    
        r0 = new java.lang.Object[1];
        l(new int[]{-1428796862, 842247570, 886350204, 613190144, -191199653, 902229019, 523802075, -388126566, 1053652031, -978368362, -1304982712, -1273850632, 2093758267, -1697553550}, 26 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1)), r0);
        o.ea.f.e(r3, ((java.lang.String) r0[0]).intern(), r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01da, code lost:
    
        if (o.ea.f.a() != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01dc, code lost:
    
        r0 = new java.lang.Object[1];
        l(new int[]{-1428796862, 842247570, 886350204, 613190144, -191199653, 902229019, -679992965, 1344034391, -1057532168, -270476946, -653815022, -963482572, -1815029632, -2094336971, -1607947130, 881037525, -782514431, -758806163, -203345212, 1562490335, -1782637134, 495802640, 895902290, 815886152, -693194878, -1854058518, 2093758267, -1697553550}, 53 - android.view.View.combineMeasuredStates(0, 0), r0);
        o.ea.f.d(r3, ((java.lang.String) r0[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01f9, code lost:
    
        r3 = new java.lang.StringBuilder();
        r0 = new java.lang.Object[1];
        l(new int[]{1913248378, -1117615140, -2033360731, -2139910574, -1304982712, -1273850632, 1264739645, -1886120607}, (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 16, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x022e, code lost:
    
        throw new o.bo.f(r3.append(((java.lang.String) r0[0]).intern()).append(r5.getMessage()).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0033, code lost:
    
        if (b(r17) == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0039, code lost:
    
        if (o.ea.f.a() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003b, code lost:
    
        r0 = new java.lang.Object[1];
        l(new int[]{-1428796862, 842247570, 886350204, 613190144, -191199653, 902229019, -1867125628, -1544913266, 2100465203, 766489900, -479625830, 228429670, -1103606931, -1506579840, 179278774, -593272066, -1897389601, -1254390218, 381865785, -1726070906, 1309047123, -480038100, -1545470403, 1022466573, 766681543, 317068144}, 50 - (android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1)), r0);
        o.ea.f.d(r3, ((java.lang.String) r0[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0058, code lost:
    
        r0 = new java.lang.Object[1];
        l(new int[]{-1214485354, 1931299461, 1555551666, 215648497, 1913165505, 2011796543, -2017079461, 30575662, -817749833, 474418306, 2038724187, -89258775, -269670503, -305465440, -424058864, -1504525671, -1339906940, 1596147667}, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1)) + 35, r0);
     */
    @Override // o.bo.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a(android.content.Context r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 832
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bo.c.a(android.content.Context):java.lang.String");
    }

    @Override // o.bo.d
    public final void b() {
        int i2 = 2 % 2;
        int i3 = f21450i + 107;
        f21447f = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.bo.d
    public final boolean b(h hVar) throws Throwable {
        int i2 = 2 % 2;
        String strD = this.f21454b.d();
        Object[] objArr = {((RemoteMessage) hVar.e()).getFrom()};
        int i3 = m.f23563d * 691068131;
        m.f23563d = i3;
        int i4 = m.f23561b * (-1916120846);
        m.f23561b = i4;
        boolean zEquals = Objects.equals(strD, (String) m.c(objArr, (int) SystemClock.uptimeMillis(), i4, -327535505, i3, 327535505, Process.myUid()));
        Object obj = null;
        if (!zEquals) {
            if (o.ea.f.a()) {
                Object[] objArr2 = new Object[1];
                k(ExpandableListView.getPackedPositionType(0L) + 127, null, null, "\u008f\u0092\u0091\u008a\u0090\u0088\u008f\u0084\u008e\u0088\u008a\u0089\u008d\u008c\u008a\u008b\u008a\u0089\u0088\u0087\u0086\u0083\u0085\u0084\u0083\u0082\u0081", objArr2);
                String strIntern = ((String) objArr2[0]).intern();
                Object[] objArr3 = new Object[1];
                l(new int[]{1503704304, -670448262, 1486402208, 1937412813, 1732074750, 631114550, -1086475740, -446341274, 1292109912, -8294139, -134850902, -1166154010, 1088001127, -1700509351, 472713383, 419429431, -959402251, 1272276563, -136149268, -775843601, 2029379236, -1930259489, 368225482, 2051553913, 1758438941, -708862824, -912539052, -1724295494, 881350932, -767402237, -495222642, 928258555, 929293910, 267679989, -1062151710, -593607018, -1134771630, -87125921, -1407588598, 76338397, -826194004, 1894954482, -1144666500, 882754742}, KeyEvent.getDeadChar(0, 0) + 88, objArr3);
                o.ea.f.c(strIntern, ((String) objArr3[0]).intern());
            }
            return false;
        }
        int i5 = f21447f + 111;
        f21450i = i5 % 128;
        if (i5 % 2 != 0) {
            o.ea.f.a();
            obj.hashCode();
            throw null;
        }
        if (o.ea.f.a()) {
            Object[] objArr4 = new Object[1];
            k(126 - Process.getGidForName(""), null, null, "\u008f\u0092\u0091\u008a\u0090\u0088\u008f\u0084\u008e\u0088\u008a\u0089\u008d\u008c\u008a\u008b\u008a\u0089\u0088\u0087\u0086\u0083\u0085\u0084\u0083\u0082\u0081", objArr4);
            String strIntern2 = ((String) objArr4[0]).intern();
            Object[] objArr5 = new Object[1];
            l(new int[]{1503704304, -670448262, 1486402208, 1937412813, 1732074750, 631114550, -1086475740, -446341274, 1292109912, -8294139, -134850902, -1166154010, 1088001127, -1700509351, 472713383, 419429431, -959402251, 1272276563, -136149268, -775843601, 2029379236, -1930259489, 368225482, 2051553913, 1758438941, -708862824, 1791324429, 826482860, -495222642, 928258555, 929293910, 267679989, -1062151710, -593607018, -1134771630, -87125921, -1407588598, 76338397, -826194004, 1894954482, -1144666500, 882754742}, 84 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr5);
            o.ea.f.c(strIntern2, ((String) objArr5[0]).intern());
        }
        int i6 = f21450i + 19;
        f21447f = i6 % 128;
        if (i6 % 2 != 0) {
            return true;
        }
        throw null;
    }

    @Override // o.bo.d
    public final String c() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f21447f + 5;
        f21450i = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        k((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 126, null, null, "\u009c\u009b\u0081", objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i5 = f21447f + 43;
        f21450i = i5 % 128;
        int i6 = i5 % 2;
        return strIntern;
    }

    @Override // o.bo.d
    public final String d() throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        int i3 = f21447f + 77;
        f21450i = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = new Object[1];
            l(new int[]{-16610707, -1086373123, -1131359675, -1846789652, 36784794, -1730195829, -426449118, 754814722, -1273767846, 186087561}, 16777234 - Color.rgb(0, 0, 1), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            l(new int[]{-16610707, -1086373123, -1131359675, -1846789652, 36784794, -1730195829, -426449118, 754814722, -1273767846, 186087561}, Color.rgb(0, 0, 0) + 16777234, objArr2);
            obj = objArr2[0];
        }
        return ((String) obj).intern();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0095, code lost:
    
        if (r2 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0097, code lost:
    
        r11 = o.ea.m.f23563d * 691068131;
        o.ea.m.f23563d = r11;
        r9 = o.ea.m.f23561b * (-1916120846);
        o.ea.m.f23561b = r9;
        r2 = (java.lang.String) o.ea.m.c(new java.lang.Object[]{r2}, (int) android.os.SystemClock.uptimeMillis(), r9, -327535505, r11, 327535505, android.os.Process.myUid());
        r1 = o.bo.c.f21447f + 5;
        o.bo.c.f21450i = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c9, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ca, code lost:
    
        if (r2 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00cd, code lost:
    
        r1 = new java.lang.Object[1];
        k((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 126, null, null, "\u0091\u008a\u0094\u0092\u008c\u008e\u008d\u0089\u0083\u008e\u008a\u0094\u0083\u0082\u0086\u0094\u0092\u0090\u0096\u0088\u0083\u0092\u008f\u0094\u0089\u0088\u008e\u008e\u008d\u008c", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e9, code lost:
    
        throw new o.bo.f(((java.lang.String) r1[0]).intern());
     */
    @Override // o.bo.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String d(android.content.Context r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 462
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bo.c.d(android.content.Context):java.lang.String");
    }
}
