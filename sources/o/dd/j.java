package o.dd;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;
import o.a.o;
import o.a.q;
import o.ea.f;
import org.msgpack.core.MessagePack;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes6.dex */
public final class j {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f22893b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f22894c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char[] f22895d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static long f22896e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f22897g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f22898h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f22899i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f22900a;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r8, int r9, short r10) {
        /*
            int r0 = r8 * 2
            int r8 = 4 - r0
            int r0 = r9 * 3
            int r7 = 1 - r0
            byte[] r6 = o.dd.j.$$a
            int r5 = r10 + 71
            byte[] r4 = new byte[r7]
            r3 = 0
            if (r6 != 0) goto L2c
            r1 = r8
            r5 = r7
            r2 = r3
        L14:
            int r8 = r8 + r5
            int r0 = r1 + 1
            r1 = r2
            r5 = r8
            r8 = r0
        L1a:
            int r2 = r1 + 1
            byte r0 = (byte) r5
            r4[r1] = r0
            if (r2 != r7) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L27:
            r0 = r6[r8]
            r1 = r8
            r8 = r0
            goto L14
        L2c:
            r1 = r3
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dd.j.$$c(short, int, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f22899i = 0;
        f22898h = 1;
        f22893b = 0;
        f22897g = 1;
        a();
        MotionEvent.axisFromString("");
        Process.getThreadPriority(0);
        Color.rgb(0, 0, 0);
        Process.myPid();
        Process.getElapsedCpuTime();
        TextUtils.lastIndexOf("", '0', 0, 0);
        TextUtils.indexOf("", "", 0, 0);
        ViewConfiguration.getTouchSlop();
        ViewConfiguration.getScrollDefaultDelay();
        Color.green(0);
        ViewConfiguration.getScrollBarFadeDuration();
        Color.green(0);
        int i2 = f22898h + 5;
        f22899i = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static String a(c cVar) throws Throwable {
        int i2 = 2 % 2;
        try {
            o.ef.a aVar = new o.ef.a();
            Object[] objArr = new Object[1];
            j("≙\uf4b1辋ꚱ秿ტ⯘숫锯갃䜕ṏㅛ졛\ue2b7떤䲧柯㻭퇁", ImageFormat.getBitsPerPixel(0) + 55022, objArr);
            aVar.c(((String) objArr[0]).intern(), cVar.c().getTime());
            Object[] objArr2 = new Object[1];
            f((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 127 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (Process.myPid() >> 22) + 22, objArr2);
            aVar.a(((String) objArr2[0]).intern(), (Object) cVar.e().toString());
            Object[] objArr3 = new Object[1];
            j("≁ᑭ丱胰益ⵇ朥姜鎊쩔㰘盝ꢎ", 13883 - Color.alpha(0), objArr3);
            aVar.a(((String) objArr3[0]).intern(), (Object) cVar.a().b());
            Object[] objArr4 = new Object[1];
            f((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 148 - TextUtils.indexOf((CharSequence) "", '0', 0), 8 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr4);
            aVar.a(((String) objArr4[0]).intern(), (Object) cVar.d().toString());
            Object[] objArr5 = new Object[1];
            j("≚垇짬䏝\uf533潧\ue144᪨貞ۀ렼㈎ꑞ\ude5a厁엫翔\uf13f欕", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 30168, objArr5);
            aVar.b(((String) objArr5[0]).intern(), cVar.b());
            String strE = aVar.e();
            int i3 = f22893b + 21;
            f22897g = i3 % 128;
            int i4 = i3 % 2;
            return strE;
        } catch (o.ef.b e2) {
            if (!f.a()) {
                return null;
            }
            Object[] objArr6 = new Object[1];
            f((char) (24142 - KeyEvent.normalizeMetaState(0)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1, Color.green(0) + 19, objArr6);
            String strIntern = ((String) objArr6[0]).intern();
            Object[] objArr7 = new Object[1];
            f((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 37673), TextUtils.getOffsetAfter("", 0) + 156, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 39, objArr7);
            f.e(strIntern, ((String) objArr7[0]).intern(), e2);
            return null;
        }
    }

    static void a() {
        f22895d = new char[]{51951, 41364, 7234, 35640, 26612, 53950, 18706, 9684, 36992, 3925, 64061, 22247, 52597, 47122, 5320, 33720, 32363, 54562, 16776, 56198, 45273, 3416, 39520, 30370, 50147, 22599, 13441, 33239, 7731, 60192, 18360, 56330, 43355, 1439, 37609, 28479, 50283, 20686, 11538, 47705, 5803, 58363, 30783, 54426, 41426, 15884, 35696, 26507, 64748, 18754, 9620, 45810, 3886, 58482, 28926, 52508, 23109, 13991, 33771, 6205, 62609, 16843, 56855, 43879, 1962, 40169, 38037, 65500, 16912, 54592, 14781, 36077, 5973, 31643, 52959, 20797, 42105, 2223, 37692, 58962, 19082, 56798, 8236, 35695, 8155, 25155, 62723, 23029, 44274, 14122, 39822, 61139, 28933, 50302, 10416, 46052, 1622, 27264, 64946, 16435, 43883, 16337, 33374, 5452, 31166, 52473, 22309, 48081, 3802, 37145, 58489, 18608, 54184, 9811, 35467, 7642, 24639, 52003, 24547, 41557, 13636, 39310, 60654, 30496, 55852, 11905, 45382, 38033, 65489, 16897, 54640, 14773, 36048, 5952, 31643, 52939, 20773, 42105, 2182, 37651, 58958, 19099, 56822, 8229, 35692, 8160, 25114, 62814, 22960, 38022, 65483, 16909, 54644, 14777, 36064, 5954, 1960, 27893, 53567, 18003, 43670, 8128, 33904, 59564, 24038, 49714, 14170, 39808, 22, 30074, 55719, 20177, 45899, 6157, 36029, 61707, 26217, 51848, 16332, 41994, 2236, 32248, 57871, 22337, 48000, 8394, 38228, 63926, 28376, 54037, 14429, 44270, 4414, 34403, 60055, 38038, 65500, 16919, 54646, 14764, 36076, 5969, 31635, 52931, 20779, 42105, 2177, 37657, 58975, 19105, 56825, 8228, 35686, 8084, 25166, 62734, 22932, 44270, 14139, 39839, 61133, 28931, 50283, 10380, 46078, 1623, 27273, 64983, 16417, 43879, 16342, 33294, 5457, 31161, 52464, 22308};
        f22894c = -8689087461147476039L;
        f22896e = 6062890614921834364L;
    }

    private static c e(String str) throws Throwable {
        int i2 = 2 % 2;
        try {
            o.ef.a aVar = new o.ef.a(str);
            Object[] objArr = new Object[1];
            j("≙\uf4b1辋ꚱ秿ტ⯘숫锯갃䜕ṏㅛ졛\ue2b7떤䲧柯㻭퇁", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 55021, objArr);
            Date date = new Date(aVar.n(((String) objArr[0]).intern()).longValue());
            Object[] objArr2 = new Object[1];
            f((char) Color.alpha(0), 127 - (ViewConfiguration.getJumpTapTimeout() >> 16), (-16777194) - Color.rgb(0, 0, 0), objArr2);
            Object[] objArr3 = {aVar, ((String) objArr2[0]).intern()};
            int i3 = o.ef.a.f23782p * (-1576737484);
            o.ef.a.f23782p = i3;
            o.az.a aVarC = o.az.a.c((String) o.ef.a.a(-781664457, objArr3, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i3, Thread.currentThread().getPriority()));
            if (aVarC == null) {
                int i4 = f22893b + 11;
                f22897g = i4 % 128;
                int i5 = i4 % 2;
                if (f.a()) {
                    Object[] objArr4 = new Object[1];
                    f((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 24142), 1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 19, objArr4);
                    String strIntern = ((String) objArr4[0]).intern();
                    StringBuilder sb = new StringBuilder();
                    Object[] objArr5 = new Object[1];
                    j("≗싡\ue32e聳ꂝ䇉昘ݞ⟢쐦\ue570薤\uaac8䬚桸ࣤ⤥칻\ueecd辋걟䵥淧ሣ㍹펀\uf0c0酞뙃囧睡ᑪ㒲헖﨎魓뮯場祠ᦢ㻎\udf46ﰕ", 57527 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr5);
                    StringBuilder sbAppend = sb.append(((String) objArr5[0]).intern());
                    Object[] objArr6 = new Object[1];
                    f((char) (ViewConfiguration.getLongPressTimeout() >> 16), AndroidCharacter.getMirror('0') + 'O', 22 - TextUtils.indexOf("", ""), objArr6);
                    Object[] objArr7 = {aVar, ((String) objArr6[0]).intern()};
                    int i6 = o.ef.a.f23782p * (-1576737484);
                    o.ef.a.f23782p = i6;
                    f.d(strIntern, sbAppend.append((String) o.ef.a.a(-781664457, objArr7, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i6, Thread.currentThread().getPriority())).toString());
                }
                return null;
            }
            Object[] objArr8 = new Object[1];
            j("≁ᑭ丱胰益ⵇ朥姜鎊쩔㰘盝ꢎ", 13883 - View.resolveSize(0, 0), objArr8);
            Object[] objArr9 = {aVar, ((String) objArr8[0]).intern()};
            int i7 = o.ef.a.f23782p * (-1576737484);
            o.ef.a.f23782p = i7;
            String str2 = (String) o.ef.a.a(-781664457, objArr9, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i7, Thread.currentThread().getPriority());
            o.de.c cVar = new o.de.c();
            o.de.e eVar = new o.de.e();
            o.de.d bVar = new o.de.b();
            if (str2.equals(eVar.b())) {
                bVar = eVar;
            } else if (str2.equals(bVar.b())) {
                int i8 = f22897g;
                int i9 = i8 + 123;
                f22893b = i9 % 128;
                int i10 = i9 % 2;
                int i11 = i8 + 93;
                f22893b = i11 % 128;
                int i12 = i11 % 2;
            } else {
                bVar = cVar;
            }
            Object[] objArr10 = new Object[1];
            f((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), Color.red(0) + 149, 7 - TextUtils.getOffsetAfter("", 0), objArr10);
            Object[] objArr11 = {aVar, ((String) objArr10[0]).intern()};
            int i13 = o.ef.a.f23782p * (-1576737484);
            o.ef.a.f23782p = i13;
            g gVarD = g.d((String) o.ef.a.a(-781664457, objArr11, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i13, Thread.currentThread().getPriority()));
            if (gVarD != null) {
                Object[] objArr12 = new Object[1];
                j("≚垇짬䏝\uf533潧\ue144᪨貞ۀ렼㈎ꑞ\ude5a厁엫翔\uf13f欕", TextUtils.lastIndexOf("", '0', 0) + 30170, objArr12);
                return new c(date, aVarC, bVar, gVarD, aVar.h(((String) objArr12[0]).intern()).booleanValue());
            }
            if (f.a()) {
                Object[] objArr13 = new Object[1];
                f((char) (24142 - (ViewConfiguration.getLongPressTimeout() >> 16)), (Process.getThreadPriority(0) + 20) >> 6, 19 - TextUtils.indexOf("", ""), objArr13);
                String strIntern2 = ((String) objArr13[0]).intern();
                Object[] objArr14 = new Object[1];
                j("≗\uf1e7蔢奅沅/푴\ueb88뿒印暼㫢츐鶬뇔䔂᥅ⲝ쁡鐽ꯇ翚፬⚲龜踙嶰燻ԃ\ud95b\uecc7耳呱殶㿃퍩\ue6b0뫁丐ᶶㆻ씃饊겨䀱ᑛ⮑＠", 54192 - TextUtils.lastIndexOf("", '0'), objArr14);
                f.d(strIntern2, ((String) objArr14[0]).intern());
            }
            return null;
        } catch (o.ef.b e2) {
            if (f.a()) {
                Object[] objArr15 = new Object[1];
                f((char) (View.MeasureSpec.getSize(0) + 24142), ViewConfiguration.getTapTimeout() >> 16, 19 - (ViewConfiguration.getEdgeSlop() >> 16), objArr15);
                String strIntern3 = ((String) objArr15[0]).intern();
                Object[] objArr16 = new Object[1];
                f((char) View.getDefaultSize(0, 0), View.MeasureSpec.getSize(0) + 195, 42 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr16);
                f.e(strIntern3, ((String) objArr16[0]).intern(), e2);
            }
            return null;
        }
    }

    private static void f(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i5 = $10 + 37;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = oVar.f19947b;
            try {
                Object[] objArr2 = {Integer.valueOf(f22895d[i2 + i7])};
                Object objA = o.d.d.a(-214519724);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a(742 - TextUtils.getCapsMode("", 0, 0), (char) (TextUtils.lastIndexOf("", '0', 0) + 1), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 12, 632508977, false, $$c(b2, b3, (byte) ((-1) - (((-1) - b3) & ((-1) - 28)))), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(f22894c), Integer.valueOf(c2)};
                Object objA2 = o.d.d.a(-1567654649);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a(TextUtils.indexOf((CharSequence) "", '0', 0) + 767, (char) (12470 - Gravity.getAbsoluteGravity(0, 0)), Gravity.getAbsoluteGravity(0, 0) + 12, 1946853218, false, $$c(b4, b5, (byte) (29 | b5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {oVar, oVar};
                Object objA3 = o.d.d.a(-723636472);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA3 = o.d.d.a(387 - (ViewConfiguration.getEdgeSlop() >> 16), (char) View.getDefaultSize(0, 0), Gravity.getAbsoluteGravity(0, 0) + 18, 39570797, false, $$c(b6, b7, (byte) ((b7 + 34) - (34 & b7))), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
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
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr5 = {oVar, oVar};
            Object objA4 = o.d.d.a(-723636472);
            if (objA4 == null) {
                byte b8 = (byte) 0;
                byte b9 = b8;
                objA4 = o.d.d.a((ViewConfiguration.getPressedStateDuration() >> 16) + 387, (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), ExpandableListView.getPackedPositionGroup(0L) + 18, 39570797, false, $$c(b8, b9, (byte) (34 | b9)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
        }
        String str = new String(cArr);
        int i8 = $10 + 49;
        $11 = i8 % 128;
        if (i8 % 2 != 0) {
            objArr[0] = str;
        } else {
            int i9 = 22 / 0;
            objArr[0] = str;
        }
    }

    static void init$0() {
        $$a = new byte[]{Ascii.ETB, 121, MessagePack.Code.FALSE, Ascii.SI};
        $$b = 80;
    }

    private static void j(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $10 + 87;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        Object charArray = str2;
        if (str2 != null) {
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        q qVar = new q();
        qVar.f19949d = i2;
        int length = cArr.length;
        long[] jArr = new long[length];
        qVar.f19948a = 0;
        while (qVar.f19948a < cArr.length) {
            int i6 = qVar.f19948a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                Object objA = o.d.d.a(-1011865131);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a(Color.red(0) + 731, (char) (7933 - (ViewConfiguration.getTouchSlop() >> 8)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 10, 355847088, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i6] = ((Long) ((Method) objA).invoke(null, objArr2)).longValue() ^ (f22896e ^ 4743694005979712847L);
                Object[] objArr3 = {qVar, qVar};
                Object objA2 = o.d.d.a(1452497747);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a(835 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (27279 - (ViewConfiguration.getTouchSlop() >> 8)), (-16777205) - Color.rgb(0, 0, 0), -2145994442, false, $$c(b4, b5, (byte) ((b5 + 7) - (7 & b5))), new Class[]{Object.class, Object.class});
                }
                ((Method) objA2).invoke(null, objArr3);
                int i7 = $11 + 83;
                $10 = i7 % 128;
                int i8 = i7 % 2;
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
            cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
            Object[] objArr4 = {qVar, qVar};
            Object objA3 = o.d.d.a(1452497747);
            if (objA3 == null) {
                byte b6 = (byte) 0;
                byte b7 = b6;
                objA3 = o.d.d.a(836 - Gravity.getAbsoluteGravity(0, 0), (char) (Process.getGidForName("") + 27280), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 11, -2145994442, false, $$c(b6, b7, (byte) ((b7 + 7) - (7 & b7))), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.content.Context r14, o.dd.c r15) {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dd.j.a(android.content.Context, o.dd.c):void");
    }

    public final void c(Context context) {
        int i2 = 2 % 2;
        int i3 = f22897g + 123;
        f22893b = i3 % 128;
        int i4 = i3 % 2;
        this.f22900a = null;
        Object[] objArr = new Object[1];
        f((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 20241), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 19, Gravity.getAbsoluteGravity(0, 0) + 47, objArr);
        Object[] objArr2 = {((String) objArr[0]).intern(), 0};
        Method method = Class.forName(C1561oA.Kd("\u001c*!0.)%o&33:,6=w\u000e;;B4HE", (short) (C1607wl.Xd() ^ 18748))).getMethod(C1561oA.Xd("\u007f~\u000fn\u0005~\u0011\u0005\u0005q\u0015\t\u000b\u000b\u0019\r\u0017\r\u0010\u001f", (short) (C1607wl.Xd() ^ 20808)), Class.forName(Wg.Zd("J\u001a\bk\u000fF\u0014\u0018i)%?\u0016\u0004aS", (short) (C1499aX.Xd() ^ (-24381)), (short) (C1499aX.Xd() ^ (-29908)))), Integer.TYPE);
        try {
            method.setAccessible(true);
            SharedPreferences.Editor editorEdit = ((SharedPreferences) method.invoke(context, objArr2)).edit();
            Object[] objArr3 = new Object[1];
            j(Wg.vd("\uf313\udd71塂蝙犔ꆓᏩ䋀", (short) (Od.Xd() ^ (-19687))), Color.argb(0, 0, 0, 0) + 12007, objArr3);
            editorEdit.remove(((String) objArr3[0]).intern()).commit();
            int i5 = f22893b + 59;
            f22897g = i5 % 128;
            int i6 = i5 % 2;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final c e(Context context) throws Throwable {
        int i2 = 2 % 2;
        c cVar = this.f22900a;
        if (cVar != null) {
            int i3 = f22897g + 5;
            f22893b = i3 % 128;
            int i4 = i3 % 2;
            return cVar;
        }
        Object[] objArr = new Object[1];
        f((char) (20242 - View.MeasureSpec.getMode(0)), 19 - Color.blue(0), TextUtils.lastIndexOf("", '0', 0) + 48, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Class<?> cls = Class.forName(Qg.kd("LXMZVOI\u0012FQOTDLQ\n\u001eIGL<NI", (short) (OY.Xd() ^ 31395), (short) (OY.Xd() ^ 16325)));
        Class<?>[] clsArr = new Class[2];
        short sXd = (short) (C1499aX.Xd() ^ (-30347));
        short sXd2 = (short) (C1499aX.Xd() ^ (-19240));
        int[] iArr = new int["!\u0017+\u0015`\u001e\u0012\u001e\u0016[\u007f \u001d\u0013\u0017\u000f".length()];
        QB qb = new QB("!\u0017+\u0015`\u001e\u0012\u001e\u0016[\u007f \u001d\u0013\u0017\u000f");
        int i5 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i5] = xuXd.fK(sXd + i5 + xuXd.CK(iKK) + sXd2);
            i5++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i5));
        clsArr[1] = Integer.TYPE;
        Object[] objArr2 = {strIntern, 0};
        short sXd3 = (short) (ZN.Xd() ^ 3926);
        int[] iArr2 = new int["]ZhFZRbTR=^PPNZLTHIV".length()];
        QB qb2 = new QB("]ZhFZRbTR=^PPNZLTHIV");
        int i6 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i6] = xuXd2.fK(sXd3 + i6 + xuXd2.CK(iKK2));
            i6++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i6), clsArr);
        try {
            method.setAccessible(true);
            SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr2);
            Object[] objArr3 = new Object[1];
            j(C1561oA.yd("醖篴\ueec5◜ᄏ䀎ꩤ\ud93b", (short) (C1633zX.Xd() ^ (-2820))), 12007 - KeyEvent.getDeadChar(0, 0), objArr3);
            String string = sharedPreferences.getString(((String) objArr3[0]).intern(), "");
            if (f.a()) {
                Object[] objArr4 = new Object[1];
                f((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 24142), ViewConfiguration.getMaximumFlingVelocity() >> 16, TextUtils.getCapsMode("", 0, 0) + 19, objArr4);
                String strIntern2 = ((String) objArr4[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr5 = new Object[1];
                f((char) ((-1) - ImageFormat.getBitsPerPixel(0)), TextUtils.getOffsetBefore("", 0) + 66, 62 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr5);
                f.c(strIntern2, sb.append(((String) objArr5[0]).intern()).append(string).toString());
            }
            if (!string.isEmpty()) {
                c cVarE = e(string);
                this.f22900a = cVarE;
                return cVarE;
            }
            int i7 = f22897g + 85;
            f22893b = i7 % 128;
            int i8 = i7 % 2;
            return null;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
