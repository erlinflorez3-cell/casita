package o.by;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.common.base.Ascii;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o.a.q;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1633zX;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.Qg;
import yg.Wg;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes6.dex */
public final class a {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f21790a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f21791c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long f21792d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f21793e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f21794g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f21795h = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f21796b = null;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r9, byte r10, byte r11) {
        /*
            byte[] r8 = o.by.a.$$a
            int r1 = r9 + 4
            int r0 = r10 * 3
            int r7 = 1 - r0
            int r0 = r11 * 7
            int r6 = 78 - r0
            byte[] r5 = new byte[r7]
            r4 = 0
            if (r8 != 0) goto L2a
            r3 = r4
            r0 = r1
        L13:
            int r1 = -r1
            int r1 = r1 + r6
            r2 = r3
            r6 = r1
            r1 = r0
        L18:
            int r0 = r1 + 1
            int r3 = r2 + 1
            byte r1 = (byte) r6
            r5[r2] = r1
            if (r3 != r7) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L27:
            r1 = r8[r0]
            goto L13
        L2a:
            r2 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.by.a.$$c(short, byte, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f21795h = 0;
        f21794g = 1;
        f21793e = 0;
        f21791c = 1;
        a();
        ViewConfiguration.getEdgeSlop();
        f21790a = new Object();
        int i2 = f21794g + 41;
        f21795h = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 13 / 0;
        }
    }

    static void a() {
        f21792d = -4242092498449496818L;
    }

    private static long d(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f21793e + 5;
        f21791c = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        f(C1593ug.zd("⍬\ud8c0Ꙅ譃塔▢\udaddꠞ綳嫮⠄\ued53ꪔ習䴭⪾\uf013봾艢価ᳩ\uf22a뿉锈剈Ὗ\ue4b8쇫靃擙∊\ue75b둸馳曾㑍\ue9de뜨豝榤㚹ﯰ륍軜尟㥣ﺟ", (short) (C1580rY.Xd() ^ (-11440)), (short) (C1580rY.Xd() ^ (-20107))), 52553 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr);
        Object[] objArr2 = {((String) objArr[0]).intern(), 0};
        Method method = Class.forName(C1561oA.od("eqfsohb+_jhm]ej#7b`eUgb", (short) (OY.Xd() ^ 22579))).getMethod(Wg.Zd("^KO+7%+\u0015\u0011ijRP>@00\u001a\u0011\u0016", (short) (C1633zX.Xd() ^ (-25161)), (short) (C1633zX.Xd() ^ (-5348))), Class.forName(C1561oA.Kd("*\"8$q1'5/v\u001d?>6<6", (short) (C1580rY.Xd() ^ (-29070)))), Integer.TYPE);
        try {
            method.setAccessible(true);
            SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr2);
            Object[] objArr3 = new Object[1];
            f(C1561oA.Xd("ﱊ㪭惣鼻얶ﯻ䨐炾꼈픗ᎅ姺ޏ빫\ue506⍇榖蟾칕\uf466㊸祊靱\udd7b᱇䊞胀ꝙ\ued70⮮凳邥뛨ﳯ㮎懗ꀌ왆ᓬ䫻煘꿗혞ᑒ嫝Ě뽑", (short) (ZN.Xd() ^ 19130)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 13906, objArr3);
            long j2 = sharedPreferences.getLong(((String) objArr3[0]).intern(), 0L);
            int i5 = f21791c + 67;
            f21793e = i5 % 128;
            int i6 = i5 % 2;
            return j2;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static void d(Context context, long j2) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f21791c + 49;
        f21793e = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        f(Wg.vd("熾⼒\uf492\ud991ꚞ珬ㄣ\uf664찅ꥀ癒䎡\uf8de츜魳礄䙅፰킐鷏欓䡔ᗯ\ue32eꁺ涑㫦᠙\ue56d댃瀰㶁\u0aca\ue805때芛䀨൲\udaa3럪蔋剂ྛ\udd2aꩩ螭哥", (short) (Od.Xd() ^ (-32196))), AndroidCharacter.getMirror('0') + 52505, objArr);
        Object[] objArr2 = {((String) objArr[0]).intern(), 0};
        Method method = Class.forName(Qg.kd("\u0006\u0012\u0007\u0014\u0010\t\u0003K\u007f\u000b\t\u000e}\u0006\u000bCW\u0003\u0001\u0006u\b\u0003", (short) (Od.Xd() ^ (-1454)), (short) (Od.Xd() ^ (-29566)))).getMethod(C1561oA.ud("*'5\u0013'\u001f/!\u001f\n+\u001d\u001d\u001b'\u0019!\u0015\u0016#", (short) (FB.Xd() ^ 14780)), Class.forName(hg.Vd("0&:$o-!-%j\u000f/,\"&\u001e", (short) (OY.Xd() ^ 27943), (short) (OY.Xd() ^ 13896))), Integer.TYPE);
        try {
            method.setAccessible(true);
            SharedPreferences.Editor editorEdit = ((SharedPreferences) method.invoke(context, objArr2)).edit();
            Object[] objArr3 = new Object[1];
            f(C1561oA.yd("鮏퇰\uf824㹺擳鬶\ue149\u0ff5丽瑊ꪶ\uf129È嶖萯멮ࣛ❁涖鎥짵ᢅ㚪粲덼\ud9d1\u1ff1䚈貝싙\ue91c⿌嘭鰲틏烙㽉斁갥\ue232ႍ伊畏ꮁ\uf20aǒ幺", (short) (C1499aX.Xd() ^ (-29853))), TextUtils.indexOf("", "") + 13907, objArr3);
            editorEdit.putLong(((String) objArr3[0]).intern(), j2).commit();
            int i5 = f21791c + 125;
            f21793e = i5 % 128;
            int i6 = i5 % 2;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static void f(String str, int i2, Object[] objArr) throws Throwable {
        Object obj;
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $11 + 13;
        $10 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 30 / 0;
            if (str2 != null) {
                char[] charArray = str2.toCharArray();
                int i6 = $11 + 95;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                obj = charArray;
            } else {
                obj = str2;
            }
        } else {
            if (str2 != null) {
                char[] charArray2 = str2.toCharArray();
                int i62 = $11 + 95;
                $10 = i62 % 128;
                int i72 = i62 % 2;
                obj = charArray2;
            }
            obj = str2;
        }
        char[] cArr = (char[]) obj;
        q qVar = new q();
        qVar.f19949d = i2;
        int length = cArr.length;
        long[] jArr = new long[length];
        qVar.f19948a = 0;
        while (qVar.f19948a < cArr.length) {
            int i8 = $10 + 31;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            int i10 = qVar.f19948a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                Object objA = o.d.d.a(-1011865131);
                if (objA == null) {
                    byte b2 = (byte) (-1);
                    byte b3 = (byte) (b2 + 1);
                    objA = o.d.d.a(731 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (View.getDefaultSize(0, 0) + 7933), View.MeasureSpec.getSize(0) + 11, 355847088, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i10] = ((Long) ((Method) objA).invoke(null, objArr2)).longValue() ^ (f21792d ^ 4743694005979712847L);
                Object[] objArr3 = {qVar, qVar};
                Object objA2 = o.d.d.a(1452497747);
                if (objA2 == null) {
                    byte b4 = (byte) (-1);
                    byte b5 = (byte) (b4 + 1);
                    objA2 = o.d.d.a(835 - TextUtils.lastIndexOf("", '0', 0, 0), (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 27279), 11 - (KeyEvent.getMaxKeyCode() >> 16), -2145994442, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
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
            cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
            Object[] objArr4 = {qVar, qVar};
            Object objA3 = o.d.d.a(1452497747);
            if (objA3 == null) {
                byte b6 = (byte) (-1);
                byte b7 = (byte) (b6 + 1);
                objA3 = o.d.d.a(837 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 27278), 11 - TextUtils.indexOf("", ""), -2145994442, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    static void init$0() {
        $$a = new byte[]{90, -4, -67, Ascii.NAK};
        $$b = 153;
    }

    public final boolean c(Context context) {
        boolean zBooleanValue;
        synchronized (f21790a) {
            if (this.f21796b == null) {
                o.ea.c.a();
                long jL = o.ea.b.l(context);
                if (d(context) != jL) {
                    d(context, jL);
                    this.f21796b = Boolean.TRUE;
                } else {
                    this.f21796b = Boolean.FALSE;
                }
            }
            if (o.ea.f.a()) {
                Object[] objArr = new Object[1];
                f("蠀｀曓\uee44嗠\udd06䒔찿㎦뫖≥ꧯᅠ颞\n瞬＜暡\ueddd啃\udcf2䑡쮅", 30577 - View.getDefaultSize(0, 0), objArr);
                String strIntern = ((String) objArr[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr2 = new Object[1];
                f("蠨\uda99ⵖ瀰슝ᕃ砳쪋ᵫ怣늋ս栁몋൯倡ꊒ\uf56e堢ꪔﵛ䀴銜\ue571䠅骓\ued6a〦芖핶㡫諙\udd01\u202b犇앐⡭窃쵓ါ抋땃ᠫ檝봅*办ꕐ࠴媙굓\uf035䊙锆\uf86c䫜", 21164 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr2);
                o.ea.f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(this.f21796b).toString());
            }
            zBooleanValue = this.f21796b.booleanValue();
        }
        return zBooleanValue;
    }
}
