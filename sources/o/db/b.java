package o.db;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.ViewCompat;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.Random;
import o.a.i;
import o.en.f;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class b {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f22721a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f22722b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char f22723c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long f22724d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f22725e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f22726g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f22727h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f22728j = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r9, int r10, int r11) {
        /*
            byte[] r8 = o.db.b.$$a
            int r7 = r9 + 65
            int r0 = r10 * 2
            int r6 = r0 + 4
            int r5 = r11 * 3
            int r0 = r5 + 1
            byte[] r4 = new byte[r0]
            r3 = 0
            if (r8 != 0) goto L28
            r2 = r6
            r0 = r3
        L13:
            int r7 = r7 + r6
            int r6 = r2 + 1
        L16:
            byte r1 = (byte) r7
            r4[r0] = r1
            if (r0 != r5) goto L21
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L21:
            r1 = r8[r6]
            int r0 = r0 + 1
            r2 = r6
            r6 = r1
            goto L13
        L28:
            r0 = r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.db.b.$$c(short, int, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f22726g = 0;
        f22728j = 1;
        f22721a = 0;
        f22727h = 1;
        a();
        KeyEvent.getMaxKeyCode();
        int i2 = f22728j + 69;
        f22726g = i2 % 128;
        int i3 = i2 % 2;
    }

    static void a() {
        f22724d = 1085255249131841616L;
        f22722b = -1384029884996859357L;
        f22725e = 1564493270;
        f22723c = (char) 17878;
    }

    public static o.fm.a e(o.ef.a aVar) throws f {
        int i2 = 2 % 2;
        int i3 = f22727h + 49;
        f22721a = i3 % 128;
        int i4 = i3 % 2;
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            f("ꕓꚱꋼ긣꩷랏돦뼋뭕蒉肸賾蠢鑾醘鷄", TextUtils.indexOf("", "", 0, 0) + 967, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            i((char) (AndroidCharacter.getMirror('0') + 6850), "㾲樠笓\ue1fb肻5隅菒\ue146∄\ufbc6鏎ﭺ㢐匜铪⢹蛄Ӥ顈놗핯籖좐硿畅缨ᦱ\u2d76", "迵坼햄\ue68d", "鴳ƚ\uf215樚", View.getDefaultSize(0, 0) + 352426653, objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        try {
            Object[] objArr3 = new Object[1];
            f("ꕲ⬝릡\u0e62鳡抑\uf323䇙홦ꐇ⪵묷\u09d4鹶水\uf2bf䍀퇹ꞇ㐲", Color.blue(0) + 36451, objArr3);
            BigDecimal bigDecimalM = aVar.m(((String) objArr3[0]).intern());
            Object[] objArr4 = new Object[1];
            f("ꕲਲ਼ﯻꢿ\u187f줵뻎澥\udf69谪緤⊝鉏䌑ペ\ue19c养\u0605\uf7c4ꒃᑌ씕ꪩ", 44867 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr4);
            Object[] objArr5 = {aVar, ((String) objArr4[0]).intern(), 60};
            int priority = Thread.currentThread().getPriority();
            int i5 = o.ef.a.f23777k * (-845283131);
            o.ef.a.f23777k = i5;
            int iIntValue = ((Integer) o.ef.a.a(1647814368, objArr5, (int) SystemClock.uptimeMillis(), (int) Thread.currentThread().getId(), -1647814363, priority, i5)).intValue();
            Object[] objArr6 = new Object[1];
            f("ꕼ鵼핬൝䕘뵼\uf52fⴳ攩崏锐촅ׯ緹뗪\uedd4◠᷑喭趭얬㶕疈궶\ue47e\udc61ᑤ䱙葞ﱔ", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 14346, objArr6);
            Object[] objArr7 = {aVar, ((String) objArr6[0]).intern()};
            int i6 = o.ef.a.f23778l * 493926616;
            o.ef.a.f23778l = i6;
            int i7 = o.ef.a.f23779m * 1131312688;
            o.ef.a.f23779m = i7;
            int iIntValue2 = ((Integer) o.ef.a.a(1122077797, objArr7, (int) SystemClock.elapsedRealtime(), new Random().nextInt(1747993327), -1122077791, i6, i7)).intValue();
            if (iIntValue2 < 0) {
                Object[] objArr8 = new Object[1];
                i((char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), "嶖繋洙ࡵ싀铻㶼\uf4da跹ꀩ㵻\uef7c謴檦핼ﮝ\ueeb1\ue03b൬\uec2c\u1ad3剁綑\uee71䌔狩辡抵똏큺굈틒攕\ueecb꯶㨂\ue8ae柵鱈ጩ桌튫隮뫆䤟鰩撳⭱는搝⟂鋅䞍Ứ쎁귈\ue016⸎꣬魰干", "迵坼햄\ue68d", "翑䘳⃪আ", Gravity.getAbsoluteGravity(0, 0) - 364498049, objArr8);
                throw new f(((String) objArr8[0]).intern());
            }
            Object[] objArr9 = new Object[1];
            f("ꕼ㻺鉠矛쭀겊#\ue5a5礙튙뛼ੳ\ueff7䍟Ⓠ렲ᶀ\uf137䪁⸋艴柣ﭤ峤え閶椡슩ꘝ㮁", 39821 - Drawable.resolveOpacity(0, 0), objArr9);
            Object[] objArr10 = {aVar, ((String) objArr9[0]).intern()};
            int i8 = o.ef.a.f23778l * 493926616;
            o.ef.a.f23778l = i8;
            int i9 = o.ef.a.f23779m * 1131312688;
            o.ef.a.f23779m = i9;
            int iIntValue3 = ((Integer) o.ef.a.a(1122077797, objArr10, (int) SystemClock.elapsedRealtime(), new Random().nextInt(1747993327), -1122077791, i8, i9)).intValue();
            if (iIntValue3 < 0) {
                Object[] objArr11 = new Object[1];
                f("ꕼ㷆鐘潯잰幊ㅍ覺惶רּ历⫥贰斖ﳘ圯\u2e61蛾ᤂ\uf049䢿⏹멆ን\uf5e2䱶⒕뿛ᘯ\ue97e䇈\ud81e던௮\ue2eb䕍\udd97듿༼\ue7c8绔턧\ua87b\u0083鬇爢쪳괅Џ鲒矢츫Ꚏ㧈適歬쏏娗㵫间汓", View.MeasureSpec.getSize(0) + 39089, objArr11);
                throw new f(((String) objArr11[0]).intern());
            }
            Object[] objArr12 = new Object[1];
            f("ꕯ護拾⽻ᵋ䍿녫\ue771핸㭲", KeyEvent.keyCodeFromString("") + 11777, objArr12);
            Object[] objArr13 = {aVar, ((String) objArr12[0]).intern(), -1};
            int priority2 = Thread.currentThread().getPriority();
            int i10 = o.ef.a.f23777k * (-845283131);
            o.ef.a.f23777k = i10;
            int iIntValue4 = ((Integer) o.ef.a.a(1647814368, objArr13, (int) SystemClock.uptimeMillis(), (int) Thread.currentThread().getId(), -1647814363, priority2, i10)).intValue();
            Object[] objArr14 = new Object[1];
            f("ꕯ즱糿\ue32dᙂ몟⧞尪썂瞌骸৫", TextUtils.indexOf("", "") + 27847, objArr14);
            Object[] objArr15 = {aVar, ((String) objArr14[0]).intern(), -1};
            int priority3 = Thread.currentThread().getPriority();
            int i11 = o.ef.a.f23777k * (-845283131);
            o.ef.a.f23777k = i11;
            int iIntValue5 = ((Integer) o.ef.a.a(1647814368, objArr15, (int) SystemClock.uptimeMillis(), (int) Thread.currentThread().getId(), -1647814363, priority3, i11)).intValue();
            Object[] objArr16 = new Object[1];
            f("ꕻힽ䃐ﷶ渗魍ᑥ蚬㏂곣\ud91c䩖읟熝\ue2b0ΰ蠀ԭ뙵", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29399, objArr16);
            Object[] objArr17 = {aVar, ((String) objArr16[0]).intern(), -1};
            int priority4 = Thread.currentThread().getPriority();
            int i12 = o.ef.a.f23777k * (-845283131);
            o.ef.a.f23777k = i12;
            o.fm.a aVar2 = new o.fm.a(bigDecimalM, iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue5, ((Integer) o.ef.a.a(1647814368, objArr17, (int) SystemClock.uptimeMillis(), (int) Thread.currentThread().getId(), -1647814363, priority4, i12)).intValue());
            int i13 = f22727h + 111;
            f22721a = i13 % 128;
            int i14 = i13 % 2;
            return aVar2;
        } catch (o.ef.b e2) {
            StringBuilder sb = new StringBuilder();
            Object[] objArr18 = new Object[1];
            f("ꕕ\udf95傂햚仛쎇䒱靈犲\uf7ae棑\uedc5曜鯔Ს釭ૡ迵ò蔑㸅댆㐜ꤲ∢Ꜫ\ud875崫홋䭃챝䅝﨟罶\uf07f畻\uee78悇\ue59aẃ鎞ᒐ覢ˬ螿㢳뷌㛁ꯛⳅꆝ\udabe徫", 31481 - View.combineMeasuredStates(0, 0), objArr18);
            throw new f(sb.append(((String) objArr18[0]).intern()).append(e2.getMessage()).toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void f(java.lang.String r23, int r24, java.lang.Object[] r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 481
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.db.b.f(java.lang.String, int, java.lang.Object[]):void");
    }

    private static void i(char c2, String str, String str2, String str3, int i2, Object[] objArr) throws Throwable {
        String str4 = str2;
        String str5 = str;
        String str6 = str3;
        int i3 = 2;
        int i4 = 2 % 2;
        int i5 = $10 + 87;
        int i6 = i5 % 128;
        $11 = i6;
        Object obj = null;
        if (i5 % 2 == 0) {
            throw null;
        }
        Object obj2 = str6;
        if (str6 != null) {
            int i7 = i6 + 73;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            char[] charArray = str6.toCharArray();
            int i9 = $11 + 41;
            $10 = i9 % 128;
            obj2 = charArray;
            if (i9 % 2 != 0) {
                int i10 = 2 / 3;
                obj2 = charArray;
            }
        }
        char[] cArr = (char[]) obj2;
        Object charArray2 = str4;
        if (str4 != null) {
            charArray2 = str4.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str5;
        if (str5 != null) {
            charArray3 = str5.toCharArray();
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
            int i11 = $11 + 29;
            $10 = i11 % 128;
            int i12 = i11 % i3;
            try {
                Object[] objArr2 = {iVar};
                Object objA = o.d.d.a(540069882);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a(106 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) View.combineMeasuredStates(0, 0), 12 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -155898465, false, $$c(b2, b3, b3), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA).invoke(obj, objArr2)).intValue();
                Object[] objArr3 = {iVar};
                Object objA2 = o.d.d.a(2068572);
                if (objA2 == null) {
                    byte b4 = (byte) 3;
                    byte b5 = (byte) (b4 - 3);
                    objA2 = o.d.d.a(847 - Color.alpha(0), (char) (6488 - Color.argb(0, 0, 0, 0)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 11, -694521287, false, $$c(b4, b5, b5), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objA2).invoke(obj, objArr3)).intValue();
                Object[] objArr4 = {iVar, Integer.valueOf(cArr3[iVar.f19932b % 4] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objA3 = o.d.d.a(-1122996612);
                if (objA3 == null) {
                    byte b6 = (byte) 1;
                    byte b7 = (byte) (b6 - 1);
                    objA3 = o.d.d.a(458 - KeyEvent.normalizeMetaState(0), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 10 - TextUtils.indexOf((CharSequence) "", '0', 0), 1804962841, false, $$c(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objA3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr3[iIntValue2] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objA4 = o.d.d.a(-1223178239);
                if (objA4 == null) {
                    byte b8 = (byte) 0;
                    objA4 = o.d.d.a((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 639, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 65099), 12 - (ViewConfiguration.getTouchSlop() >> 8), 1636969060, false, $$c((byte) 57, b8, b8), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr4[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                cArr3[iIntValue2] = iVar.f19933e;
                cArr5[iVar.f19932b] = (char) ((((long) ((int) (((long) f22725e) ^ 740602047300126166L))) ^ (((long) (cArr3[iIntValue2] ^ r9[iVar.f19932b])) ^ (f22722b ^ 740602047300126166L))) ^ ((long) ((char) (((long) f22723c) ^ 740602047300126166L))));
                iVar.f19932b++;
                i3 = 2;
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

    static void init$0() {
        $$a = new byte[]{54, -126, MessagePack.Code.INT32, 96};
        $$b = 188;
    }
}
