package o.bg;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import o.a.n;
import o.a.q;
import o.d.d;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends Enum<e> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;
    private static e A = null;
    public static final e B;
    public static final e C;
    private static e D = null;
    private static e E = null;
    private static e F = null;
    private static long G = 0;
    private static final /* synthetic */ e[] H;
    private static e I = null;
    private static int J = 0;
    private static int K = 0;
    private static int L = 0;
    private static int M = 0;
    private static int N = 0;

    /* JADX INFO: renamed from: a */
    public static final e f21103a;

    /* JADX INFO: renamed from: b */
    public static final e f21104b;

    /* JADX INFO: renamed from: c */
    public static final e f21105c;

    /* JADX INFO: renamed from: d */
    public static final e f21106d;

    /* JADX INFO: renamed from: e */
    public static final e f21107e;

    /* JADX INFO: renamed from: f */
    public static final e f21108f;

    /* JADX INFO: renamed from: g */
    public static final e f21109g;

    /* JADX INFO: renamed from: h */
    public static final e f21110h;

    /* JADX INFO: renamed from: i */
    public static final e f21111i;

    /* JADX INFO: renamed from: j */
    public static final e f21112j;

    /* JADX INFO: renamed from: k */
    public static final e f21113k;

    /* JADX INFO: renamed from: l */
    public static final e f21114l;

    /* JADX INFO: renamed from: m */
    public static final e f21115m;

    /* JADX INFO: renamed from: n */
    public static final e f21116n;

    /* JADX INFO: renamed from: o */
    public static final e f21117o;

    /* JADX INFO: renamed from: p */
    public static final e f21118p;

    /* JADX INFO: renamed from: q */
    public static final e f21119q;

    /* JADX INFO: renamed from: r */
    public static final e f21120r;

    /* JADX INFO: renamed from: s */
    public static final e f21121s;

    /* JADX INFO: renamed from: t */
    public static final e f21122t;

    /* JADX INFO: renamed from: u */
    public static final e f21123u;

    /* JADX INFO: renamed from: v */
    public static final e f21124v;

    /* JADX INFO: renamed from: w */
    public static final e f21125w;

    /* JADX INFO: renamed from: x */
    public static final e f21126x;

    /* JADX INFO: renamed from: y */
    public static final e f21127y;

    /* JADX INFO: renamed from: z */
    public static final e f21128z;

    /* JADX WARN: Removed duplicated region for block: B:20:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0025 -> B:17:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r8, short r9, int r10) {
        /*
            int r0 = r8 * 4
            int r8 = 3 - r0
            byte[] r7 = o.bg.e.$$a
            int r0 = 115 - r10
            int r1 = r9 * 3
            int r6 = r1 + 1
            byte[] r5 = new byte[r6]
            r4 = 0
            if (r7 != 0) goto L28
            r3 = r8
            r2 = r4
        L13:
            int r0 = -r0
            int r8 = r8 + r0
            r1 = r2
        L16:
            int r2 = r1 + 1
            int r3 = r3 + 1
            byte r0 = (byte) r8
            r5[r1] = r0
            if (r2 != r6) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L25:
            r0 = r7[r3]
            goto L13
        L28:
            r1 = r4
            r3 = r8
            r8 = r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bg.e.$$c(byte, short, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        M = 0;
        L = 1;
        K = 0;
        J = 1;
        a();
        Object[] objArr = new Object[1];
        O("崬埓䣇緸盦殓Ᲊ", 2803 - (ViewConfiguration.getEdgeSlop() >> 16), objArr);
        f21105c = new e(((String) objArr[0]).intern(), 0);
        Object[] objArr2 = new Object[1];
        O("崮芵\ue209쏭⍝Ó悭䀉ꇨ腀", 57241 - View.resolveSize(0, 0), objArr2);
        f21104b = new e(((String) objArr2[0]).intern(), 1);
        Object[] objArr3 = new Object[1];
        O("崻椮㔈섘走奱敞ㆾﶾ見喟", 13332 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr3);
        f21106d = new e(((String) objArr3[0]).intern(), 2);
        Object[] objArr4 = new Object[1];
        O("崬ꈌꍼꂭꆈꛧ\ua639꜐ꑶꖢꪒ꯷ꬨꠔꥼ꺥꾑곫갦괋뉧뎫낒뇿넢", TextUtils.getOffsetAfter("", 0) + 65323, objArr4);
        D = new e(((String) objArr4[0]).intern(), 3);
        Object[] objArr5 = new Object[1];
        O("崬禈ᑴ㌡쾘\uea5b脰巪硞ᜏ㏰캨\ue512臀岴筺ំ", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 9390, objArr5);
        f21103a = new e(((String) objArr5[0]).intern(), 4);
        Object[] objArr6 = new Object[1];
        P(12 - TextUtils.getTrimmedLength(""), "\u0003\ufffa\u0001￼\u0001\u0002￼\u0006￼\t\u0002\u0005", true, View.resolveSizeAndState(0, 0, 0) + 88, (ViewConfiguration.getTapTimeout() >> 16) + 1, objArr6);
        f21107e = new e(((String) objArr6[0]).intern(), 5);
        Object[] objArr7 = new Object[1];
        O("崣Ǚ\ue4de䯏", ((Process.getThreadPriority(0) + 20) >> 6) + 23801, objArr7);
        f21109g = new e(((String) objArr7[0]).intern(), 6);
        Object[] objArr8 = new Object[1];
        O("崫俗磙旝ᛏϛⳞ\ud9d3쫆\uf7c6\ue0c1践뻧", 4861 - View.MeasureSpec.getSize(0), objArr8);
        f21110h = new e(((String) objArr8[0]).intern(), 7);
        Object[] objArr9 = new Object[1];
        O("崣肟\ue656쐝⯆ঀ", 56767 - Gravity.getAbsoluteGravity(0, 0), objArr9);
        f21108f = new e(((String) objArr9[0]).intern(), 8);
        Object[] objArr10 = new Object[1];
        P(Color.rgb(0, 0, 0) + 16777234, "\u0001\u0002￼\u0007\ufff4\ufff6￼\ufff9￼\u0007\u0002\u0001\u0012\uffff\uffff\b\u0003\u0006", true, 87 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 17 - Color.blue(0), objArr10);
        A = new e(((String) objArr10[0]).intern(), 9);
        Object[] objArr11 = new Object[1];
        O("崬␘꽠㙁릯\u0093诮യ鐆ὰ\ue659", 31013 - Color.argb(0, 0, 0, 0), objArr11);
        f21111i = new e(((String) objArr11[0]).intern(), 10);
        Object[] objArr12 = new Object[1];
        P(29 - (ViewConfiguration.getKeyRepeatDelay() >> 16), "\u0001\u0002\ufff6\u0012\ufff7\u0001\ufff4\u0012\u0006\u0000\u0005\ufff8\u0007\u0012\ufff8\u0007\ufff4\ufff7￼\uffff\ufff4\t\u0006\u0001\u0002￼\u0007￼\ufff7", true, 88 - Color.red(0), 22 - View.MeasureSpec.getMode(0), objArr12);
        f21112j = new e(((String) objArr12[0]).intern(), 11);
        Object[] objArr13 = new Object[1];
        P(11 - TextUtils.getOffsetAfter("", 0), "\ufff8\t\ufffb\ufffb￼\u0003￼\u000b￼\u0016\ufffa", false, TextUtils.lastIndexOf("", '0', 0, 0) + 85, TextUtils.indexOf("", "") + 3, objArr13);
        f21114l = new e(((String) objArr13[0]).intern(), 12);
        Object[] objArr14 = new Object[1];
        O("崬│굠㕃붰։跤ᐼ鰃摣\uec49璽", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 30757, objArr14);
        f21115m = new e(((String) objArr14[0]).intern(), 13);
        Object[] objArr15 = new Object[1];
        O("崺滑ᕝ놟췗栍葒₱糸鬲㝧厯\uefec", 42043 - ((Process.getThreadPriority(0) + 20) >> 6), objArr15);
        f21117o = new e(((String) objArr15[0]).intern(), 14);
        Object[] objArr16 = new Object[1];
        P(TextUtils.getOffsetAfter("", 0) + 24, "\ufff7\ufff5\u0002\u0003�\b\ufff5\ufff7�\u0000\u0004\u0004\ufff5\u0013\n\u0001\ufff9\u0013\ufff9\b\ufff5\n�\b", true, 87 - TextUtils.getTrimmedLength(""), 2 - View.resolveSize(0, 0), objArr16);
        f21113k = new e(((String) objArr16[0]).intern(), 15);
        Object[] objArr17 = new Object[1];
        O("崽鲗\ude44᠍寞閍흕ᄛ僆銉챙ู䧥讷앭ܵ䛰肬쉺㰫翤릪ﬔ", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 49597, objArr17);
        E = new e(((String) objArr17[0]).intern(), 16);
        Object[] objArr18 = new Object[1];
        O("崮败ﴅ\u2d7aᵖ䶺북\uedff\uddd4హ簍걿鱄첿㲈泭峋輯，⽧ὑ", TextUtils.indexOf("", "", 0, 0) + 53279, objArr18);
        F = new e(((String) objArr18[0]).intern(), 17);
        Object[] objArr19 = new Object[1];
        P(TextUtils.getTrimmedLength("") + 16, "\ufffa\b\ufffa\ufff8\ufff6\ufffb\u0007\ufffa\t\u0003\ufffe\u0014\ufffa\u0007\n\ufff8", true, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 85, 2 - Color.red(0), objArr19);
        I = new e(((String) objArr19[0]).intern(), 18);
        Object[] objArr20 = new Object[1];
        P(28 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "\u0003\b\u0013\ufff8\u0006\ufff5\ufff7\u0013\b\ufff9\ufffb\u0013\ufff8\u0006\ufff5\ufff7\u0013\u0000\ufff5\b�\ufffb�\ufff8\u0007\u0002\ufff9\uffff", true, KeyEvent.normalizeMetaState(0) + 87, 24 - TextUtils.indexOf("", ""), objArr20);
        f21116n = new e(((String) objArr20[0]).intern(), 19);
        Object[] objArr21 = new Object[1];
        O("崫늵舎鎟\ue377\uf0f1쁑퀵↴ㄅڃᙺ柔睟䜠咦ꐀ뗸蕶髍\uea56郞쮒\udb08⣢㡥\u09d4ᦫ椨纜业忰", 61331 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr21);
        f21120r = new e(((String) objArr21[0]).intern(), 20);
        Object[] objArr22 = new Object[1];
        P(27 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), "\u0000\u0004\t\u0014\ufffa￼\ufff6\u0003\ufff6\u0002\u0014\ufff9\u0007\ufff6\ufff8\u0014\u0001\ufff6\t\ufffe￼\ufffe\ufff9\b\u0003\ufffa", true, 86 - (ViewConfiguration.getTapTimeout() >> 16), Color.alpha(0) + 23, objArr22);
        f21119q = new e(((String) objArr22[0]).intern(), 21);
        Object[] objArr23 = new Object[1];
        O("崫\uf1c1Ӧ宓\ueea7㶭偉\ue761㨔䤱鰻テ䟤骓⦈粲鍀♻甐蠘\udf27珃蛣헭梉뾳", 44263 - ((Process.getThreadPriority(0) + 20) >> 6), objArr23);
        f21118p = new e(((String) objArr23[0]).intern(), 22);
        Object[] objArr24 = new Object[1];
        O("崫䩑珆ᭃç⡽퇩辰\ue694踁랛弶䒤氩ᖬ˘⩞폏ﭴ\ue0e5衵뇯夛", 6007 - View.MeasureSpec.getMode(0), objArr24);
        f21122t = new e(((String) objArr24[0]).intern(), 23);
        Object[] objArr25 = new Object[1];
        P(TextUtils.lastIndexOf("", '0', 0) + 27, "\u0007\u0005\ufffa\u0011\ufff5\ufff3\u0004\ufff6\u0011\u0006\u0001\u0011\ufff6\ufff7\b\ufffb\ufff5\ufff7\u0011\t\ufff3\ufffe\ufffe\ufff7\u0006\u0002", false, TextUtils.lastIndexOf("", '0', 0) + 90, 26 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr25);
        f21121s = new e(((String) objArr25[0]).intern(), 24);
        Object[] objArr26 = new Object[1];
        O("崬\u1cc9\udef3颞媬ᒿ홀遽刂ఢ츬觝䯿֝잞膶䍓㵹（", Color.red(0) + 16871, objArr26);
        f21124v = new e(((String) objArr26[0]).intern(), 25);
        Object[] objArr27 = new Object[1];
        O("崬䭒燀ṳӰ\u2d79\udb92쀎\uee82霶붸ꨦ假绗杈\u0df8㩬", TextUtils.indexOf("", "") + 5749, objArr27);
        f21126x = new e(((String) objArr27[0]).intern(), 26);
        Object[] objArr28 = new Object[1];
        P(21 - ExpandableListView.getPackedPositionGroup(0L), "\t\ufffe￼\ufffe\ufff9\ufffa\t\ufff6\u000b\ufffe\t\ufff8\ufff6\u0014\ufff9\u0007\ufff6\ufff8\u0014\u0001\ufff6", true, 86 - (ViewConfiguration.getJumpTapTimeout() >> 16), 4 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr28);
        f21127y = new e(((String) objArr28[0]).intern(), 27);
        Object[] objArr29 = new Object[1];
        O("崫酿얚㠭江ꂓ霵쭟㿤爏ꙇ髸줜㶸燴ꐈ颶쳈", 52313 - View.resolveSize(0, 0), objArr29);
        f21123u = new e(((String) objArr29[0]).intern(), 28);
        Object[] objArr30 = new Object[1];
        P(37 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), "\u0012\ufffa\ufff8\u0007\u0012\u0007\u0005\ufff4\u0001\u0006\ufff4\ufff6\u0007￼\u0002\u0001\u0012\ufff6\u0002\u0001\u0007\u0005\u0002\uffff\ufff7￼\ufffa￼\u0007\ufff4\uffff\u0012\ufff6\ufff4\u0005\ufff7", false, 89 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 24, objArr30);
        f21125w = new e(((String) objArr30[0]).intern(), 29);
        Object[] objArr31 = new Object[1];
        P(Color.alpha(0) + 49, "\u0002\ufff6\u0012\u0001\u0002￼\u0007\ufff6\ufff4\u0006\u0001\ufff4\u0005\u0007\u0012\ufff8\u0007\ufff4\ufff7\u0003\b\u0012\u0005\u0002\u0012\ufff8\u0007\ufff4\ufff8\u0005\ufff6\u0012\ufff7\u0005\ufff4\ufff6\u0012\uffff\ufff4\u0007￼\ufffa￼\ufff7\uffff\u0002\u0005\u0007\u0001", true, 88 - Color.red(0), 44 - Color.blue(0), objArr31);
        f21128z = new e(((String) objArr31[0]).intern(), 30);
        Object[] objArr32 = new Object[1];
        O("崫﹕ᯎ띿탷民覑┕䚴\ue225㽃壚\uf454ᇼ굠캞樚螘⌼粹駖㕃囂\uf277\u0ff8\uab07쒕怏붯\ud921穖韝㍛䳳\ue862֓ꄍ", 41891 - AndroidCharacter.getMirror('0'), objArr32);
        C = new e(((String) objArr32[0]).intern(), 31);
        Object[] objArr33 = new Object[1];
        P(Color.red(0) + 16, "\u0016\ufffb\t\ufff8\ufffa\u0016\u0003\ufff8\u000b\u0000\ufffe\u0000\ufffb\u0007￩\ufffa", true, Gravity.getAbsoluteGravity(0, 0) + 84, 14 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr33);
        B = new e(((String) objArr33[0]).intern(), 32);
        H = e();
        int i2 = L + 115;
        M = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 19 / 0;
        }
    }

    private e(String str, int i2) {
        super(str, i2);
    }

    private static void O(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
        q qVar = new q();
        qVar.f19949d = i2;
        int length = cArr.length;
        long[] jArr = new long[length];
        qVar.f19948a = 0;
        while (qVar.f19948a < cArr.length) {
            int i4 = qVar.f19948a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                Object objA = d.a(-1011865131);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = d.a(731 - KeyEvent.getDeadChar(0, 0), (char) ((KeyEvent.getMaxKeyCode() >> 16) + 7933), 11 - (Process.myPid() >> 22), 355847088, false, $$c(b2, b3, (byte) ((-1) - (((-1) - b3) & ((-1) - 44)))), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i4] = ((Long) ((Method) objA).invoke(null, objArr2)).longValue() ^ (G ^ 4743694005979712847L);
                Object[] objArr3 = {qVar, qVar};
                Object objA2 = d.a(1452497747);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = d.a(836 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (27278 - TextUtils.indexOf((CharSequence) "", '0', 0)), 10 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -2145994442, false, $$c(b4, b5, (byte) ((b5 + 37) - (37 & b5))), new Class[]{Object.class, Object.class});
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
        int i5 = $10 + 125;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (qVar.f19948a < cArr.length) {
            int i7 = $11 + 55;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
            Object[] objArr4 = {qVar, qVar};
            Object objA3 = d.a(1452497747);
            if (objA3 == null) {
                byte b6 = (byte) 0;
                byte b7 = b6;
                objA3 = d.a(836 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (27279 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 11 - (KeyEvent.getMaxKeyCode() >> 16), -2145994442, false, $$c(b6, b7, (byte) ((b7 + 37) - (37 & b7))), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    private static void P(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
        String str2 = str;
        int i5 = 2 % 2;
        int i6 = $10 + 27;
        $11 = i6 % 128;
        Object obj = null;
        Object charArray = str2;
        if (i6 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (str2 != null) {
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        n nVar = new n();
        char[] cArr2 = new char[i2];
        nVar.f19944a = 0;
        while (nVar.f19944a < i2) {
            nVar.f19946e = cArr[nVar.f19944a];
            cArr2[nVar.f19944a] = (char) (i3 + nVar.f19946e);
            int i7 = nVar.f19944a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(N)};
                Object objA = d.a(1376241034);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = d.a(270 - (ViewConfiguration.getTouchSlop() >> 8), (char) TextUtils.indexOf("", ""), 12 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -2071844881, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nVar, nVar};
                Object objA2 = d.a(-202660535);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = d.a(((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.VT, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 12 - View.resolveSize(0, 0), 627984172, false, $$c(b4, b5, (byte) (b5 + 2)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA2).invoke(null, objArr3);
                int i8 = $11 + 109;
                $10 = i8 % 128;
                int i9 = i8 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i4 > 0) {
            int i10 = $10 + 39;
            $11 = i10 % 128;
            int i11 = i10 % 2;
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
                cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                Object[] objArr4 = {nVar, nVar};
                Object objA3 = d.a(-202660535);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA3 = d.a(TextUtils.indexOf("", "") + 522, (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (ViewConfiguration.getWindowTouchSlop() >> 8) + 12, 627984172, false, $$c(b6, b7, (byte) (b7 + 2)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        String str3 = new String(cArr2);
        int i12 = $11 + 73;
        $10 = i12 % 128;
        if (i12 % 2 == 0) {
            objArr[0] = str3;
        } else {
            obj.hashCode();
            throw null;
        }
    }

    static void a() {
        G = 2334860212331761696L;
        N = -1270219504;
    }

    private static /* synthetic */ e[] e() {
        int i2 = 2 % 2;
        int i3 = K + 25;
        int i4 = i3 % 128;
        J = i4;
        int i5 = i3 % 2;
        e[] eVarArr = {f21105c, f21104b, f21106d, D, f21103a, f21107e, f21109g, f21110h, f21108f, A, f21111i, f21112j, f21114l, f21115m, f21117o, f21113k, E, F, I, f21116n, f21120r, f21119q, f21118p, f21122t, f21121s, f21124v, f21126x, f21127y, f21123u, f21125w, f21128z, C, B};
        int i6 = i4 + 9;
        K = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 60 / 0;
        }
        return eVarArr;
    }

    static void init$0() {
        $$a = new byte[]{100, 68, -66, 16};
        $$b = 124;
    }

    public static e valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = K + 3;
        J = i3 % 128;
        int i4 = i3 % 2;
        e eVar = (e) Enum.valueOf(e.class, str);
        int i5 = K + 117;
        J = i5 % 128;
        int i6 = i5 % 2;
        return eVar;
    }

    public static e[] values() {
        int i2 = 2 % 2;
        int i3 = J + 105;
        K = i3 % 128;
        int i4 = i3 % 2;
        e[] eVarArr = (e[]) H.clone();
        int i5 = J + 33;
        K = i5 % 128;
        int i6 = i5 % 2;
        return eVarArr;
    }
}
