package o.fm;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.InputDeviceCompat;
import com.drew.metadata.exif.makernotes.CasioType2MakernoteDirectory;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.cert.X509Certificate;
import java.util.Random;
import kotlin.text.Typography;
import o.a.o;
import o.ea.f;
import org.msgpack.core.MessagePack;
import yg.C1580rY;
import yg.C1626yg;
import yg.Ig;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes6.dex */
public final class g {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;
    private static int A = 0;
    private static int B = 0;
    private static int C = 0;
    private static long D = 0;

    /* JADX INFO: renamed from: a */
    public static int f26056a = 0;

    /* JADX INFO: renamed from: b */
    public static int f26057b = 0;

    /* JADX INFO: renamed from: c */
    public static int f26058c = 0;

    /* JADX INFO: renamed from: d */
    public static int f26059d = 0;

    /* JADX INFO: renamed from: e */
    public static int f26060e = 0;

    /* JADX INFO: renamed from: f */
    public static int f26061f = 0;

    /* JADX INFO: renamed from: g */
    public static int f26062g = 0;

    /* JADX INFO: renamed from: h */
    public static int f26063h = 0;

    /* JADX INFO: renamed from: i */
    public static int f26064i = 0;

    /* JADX INFO: renamed from: j */
    public static int f26065j = 0;

    /* JADX INFO: renamed from: y */
    private static char[] f26066y = null;

    /* JADX INFO: renamed from: z */
    private static int f26067z = 0;

    /* JADX INFO: renamed from: p */
    private String f26073p;

    /* JADX INFO: renamed from: q */
    private String f26074q;

    /* JADX INFO: renamed from: r */
    private String f26075r;

    /* JADX INFO: renamed from: s */
    private String f26076s;

    /* JADX INFO: renamed from: u */
    private long f26078u;

    /* JADX INFO: renamed from: v */
    private X509Certificate f26079v;

    /* JADX INFO: renamed from: x */
    private X509Certificate f26081x;

    /* JADX INFO: renamed from: o */
    private a f26072o = new a();

    /* JADX INFO: renamed from: n */
    private j f26071n = new j();

    /* JADX INFO: renamed from: m */
    private b f26070m = new b();

    /* JADX INFO: renamed from: l */
    private c f26069l = new c();

    /* JADX INFO: renamed from: k */
    private h f26068k = new h();

    /* JADX INFO: renamed from: t */
    private d f26077t = new d();

    /* JADX INFO: renamed from: w */
    private o.ef.a f26080w = new o.ef.a();

    /* JADX WARN: Removed duplicated region for block: B:20:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0025 -> B:17:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r9, int r10, int r11) {
        /*
            byte[] r8 = o.fm.g.$$a
            int r7 = r11 * 3
            int r1 = r7 + 1
            int r6 = r9 + 99
            int r0 = r10 * 3
            int r5 = 3 - r0
            byte[] r4 = new byte[r1]
            r3 = 0
            if (r8 != 0) goto L28
            r0 = r7
            r2 = r3
        L13:
            int r0 = -r0
            int r6 = r6 + r0
            r1 = r2
        L16:
            byte r0 = (byte) r6
            r4[r1] = r0
            int r5 = r5 + 1
            int r2 = r1 + 1
            if (r1 != r7) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L25:
            r0 = r8[r5]
            goto L13
        L28:
            r1 = r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fm.g.$$c(short, int, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f26061f = 1196758429;
        f26065j = 1399220470;
        f26063h = -465934227;
        f26062g = -1273732428;
        f26064i = -74981868;
        f26058c = 187754457;
        f26060e = 727497464;
        f26059d = -393130331;
        f26057b = 671457222;
        f26056a = -548903129;
        C = 0;
        B = 1;
        f26067z = 0;
        A = 1;
        o();
        AndroidCharacter.getMirror('0');
        ViewConfiguration.getDoubleTapTimeout();
        Color.rgb(0, 0, 0);
        Process.myPid();
        ViewConfiguration.getScrollFriction();
        TextUtils.indexOf("", "");
        TextUtils.lastIndexOf("", '0');
        KeyEvent.getModifierMetaStateMask();
        TextUtils.getTrimmedLength("");
        TextUtils.getCapsMode("", 0, 0);
        ViewConfiguration.getFadingEdgeLength();
        ExpandableListView.getPackedPositionGroup(0L);
        Drawable.resolveOpacity(0, 0);
        ExpandableListView.getPackedPositionForChild(0, 0);
        ViewConfiguration.getJumpTapTimeout();
        ViewConfiguration.getLongPressTimeout();
        ViewConfiguration.getScrollDefaultDelay();
        ViewConfiguration.getFadingEdgeLength();
        Color.red(0);
        SystemClock.uptimeMillis();
        View.MeasureSpec.getMode(0);
        ViewConfiguration.getMaximumDrawingCacheSize();
        Process.getThreadPriority(0);
        ViewConfiguration.getScrollFriction();
        ViewConfiguration.getGlobalActionKeyTimeout();
        ExpandableListView.getPackedPositionType(0L);
        ViewConfiguration.getZoomControlsTimeout();
        ViewConfiguration.getTouchSlop();
        ExpandableListView.getPackedPositionType(0L);
        AudioTrack.getMaxVolume();
        TypedValue.complexToFraction(0, 0.0f, 0.0f);
        TextUtils.lastIndexOf("", '0');
        ExpandableListView.getPackedPositionChild(0L);
        AudioTrack.getMaxVolume();
        TextUtils.getTrimmedLength("");
        AndroidCharacter.getMirror('0');
        TextUtils.indexOf((CharSequence) "", '0', 0, 0);
        ExpandableListView.getPackedPositionChild(0L);
        ViewConfiguration.getMaximumDrawingCacheSize();
        AudioTrack.getMaxVolume();
        ExpandableListView.getPackedPositionForChild(0, 0);
        View.MeasureSpec.makeMeasureSpec(0, 0);
        SystemClock.uptimeMillis();
        Drawable.resolveOpacity(0, 0);
        ViewConfiguration.getTouchSlop();
        TextUtils.getOffsetBefore("", 0);
        Color.rgb(0, 0, 0);
        ViewConfiguration.getTapTimeout();
        int i2 = B + 69;
        C = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static void E(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i5 = oVar.f19947b;
            try {
                Object[] objArr2 = {Integer.valueOf(f26066y[i2 + i5])};
                Object objA = o.d.d.a(-214519724);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a((Process.myTid() >> 22) + 742, (char) TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 12, 632508977, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(D), Integer.valueOf(c2)};
                Object objA2 = o.d.d.a(-1567654649);
                if (objA2 == null) {
                    int iResolveOpacity = 766 - Drawable.resolveOpacity(0, 0);
                    char c3 = (char) (12470 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 12;
                    int i6 = $$b;
                    byte b4 = (byte) ((i6 + 3) - (i6 | 3));
                    byte b5 = (byte) (b4 - 1);
                    objA2 = o.d.d.a(iResolveOpacity, c3, iMakeMeasureSpec, 1946853218, false, $$c(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i5] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {oVar, oVar};
                Object objA3 = o.d.d.a(-723636472);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    objA3 = o.d.d.a(TextUtils.indexOf("", "") + 387, (char) KeyEvent.getDeadChar(0, 0), 18 - (Process.myTid() >> 22), 39570797, false, $$c((byte) 6, b6, b6), new Class[]{Object.class, Object.class});
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
            int i7 = $11 + 15;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
                Object[] objArr5 = {oVar, oVar};
                Object objA4 = o.d.d.a(-723636472);
                if (objA4 == null) {
                    byte b7 = (byte) 0;
                    objA4 = o.d.d.a(387 - TextUtils.indexOf("", "", 0), (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), TextUtils.getOffsetAfter("", 0) + 18, 39570797, false, $$c((byte) 6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
                int i8 = 8 / 0;
            } else {
                cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
                Object[] objArr6 = {oVar, oVar};
                Object objA5 = o.d.d.a(-723636472);
                if (objA5 == null) {
                    byte b8 = (byte) 0;
                    objA5 = o.d.d.a(387 - (Process.myTid() >> 22), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), KeyEvent.keyCodeFromString("") + 18, 39570797, false, $$c((byte) 6, b8, b8), new Class[]{Object.class, Object.class});
                }
                ((Method) objA5).invoke(null, objArr6);
            }
        }
        String str = new String(cArr);
        int i9 = $10 + 59;
        $11 = i9 % 128;
        int i10 = i9 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(android.content.Context r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fm.g.a(android.content.Context):void");
    }

    public static /* synthetic */ Object b(int i2, int i3, int i4, int i5, int i6, int i7, Object[] objArr) throws Throwable {
        int i8 = ~i6;
        int i9 = ~i5;
        int i10 = (-1) - (((-1) - ((-1) - (((-1) - (~((i8 + i9) - (i8 & i9)))) & ((-1) - (~((-1) - (((-1) - i8) & ((-1) - i7)))))))) & ((-1) - (~(i9 | i7))));
        int i11 = ~((i5 + i8) - (i5 & i8));
        int i12 = i7 | i11;
        int i13 = ~((i9 + i6) - (i9 & i6));
        int i14 = (i12 + i13) - (i12 & i13);
        int i15 = i7 + i6 + i3 + ((-393945980) * i4) + (1728320405 * i2);
        int i16 = i15 * i15;
        int i17 = ((-1552544754) * i7) + 1566572544 + ((-1100352524) * i6) + (i10 * (-226096115)) + ((-226096115) * i11) + (226096115 * i14) + ((-1326448640) * i3) + (2076180480 * i4) + ((-877658112) * i2) + (214302720 * i16);
        int i18 = ((i7 * (-252835662)) - 192251156) + (i6 * (-252834676)) + (i10 * (-493)) + (i11 * (-493)) + (i14 * 493) + (i3 * (-252835169)) + (i4 * 1574575612) + (i2 * 147979147) + (i16 * (-1426456576));
        int i19 = i17 + (i18 * i18 * 2075787264);
        if (i19 != 1) {
            if (i19 == 2) {
                return e(objArr);
            }
            if (i19 == 3) {
                return c(objArr);
            }
            g gVar = (g) objArr[0];
            int i20 = 2 % 2;
            int i21 = A + 81;
            f26067z = i21 % 128;
            int i22 = i21 % 2;
            if (f.a()) {
                int i23 = A + 77;
                f26067z = i23 % 128;
                int i24 = i23 % 2;
                Object[] objArr2 = new Object[1];
                E((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getEdgeSlop() >> 16) + 49, 17 - KeyEvent.getDeadChar(0, 0), objArr2);
                String strIntern = ((String) objArr2[0]).intern();
                Object[] objArr3 = new Object[1];
                E((char) ((-16740425) - Color.rgb(0, 0, 0)), TextUtils.indexOf((CharSequence) "", '0') + 1775, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 30, objArr3);
                f.c(strIntern, ((String) objArr3[0]).intern());
            }
            gVar.f26068k = new h();
            o.ef.a aVar = gVar.f26080w;
            Object[] objArr4 = new Object[1];
            E((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), AndroidCharacter.getMirror('0') + 993, Color.rgb(0, 0, 0) + InputDeviceCompat.SOURCE_JOYSTICK, objArr4);
            aVar.b(((String) objArr4[0]).intern());
            return null;
        }
        g gVar2 = (g) objArr[0];
        Context context = (Context) objArr[1];
        int i25 = 2 % 2;
        if (f.a()) {
            int i26 = f26067z + 47;
            A = i26 % 128;
            int i27 = i26 % 2;
            Object[] objArr5 = new Object[1];
            E((char) (Process.myTid() >> 22), 49 - TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getTapTimeout() >> 16) + 17, objArr5);
            String strIntern2 = ((String) objArr5[0]).intern();
            Object[] objArr6 = new Object[1];
            E((char) (1812 - ExpandableListView.getPackedPositionGroup(0L)), (ViewConfiguration.getPressedStateDuration() >> 16) + 1836, 9 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr6);
            f.c(strIntern2, ((String) objArr6[0]).intern());
            int i28 = A + 81;
            f26067z = i28 % 128;
            int i29 = i28 % 2;
        }
        gVar2.a(context);
        gVar2.m();
        gVar2.q();
        gVar2.r();
        int i30 = f26056a * (-767894898);
        f26056a = i30;
        int i31 = f26057b * 1774904935;
        f26057b = i31;
        int i32 = f26059d * (-1793337310);
        f26059d = i32;
        int i33 = f26060e * (-1703172253);
        f26060e = i33;
        b(i33, i31, i32, i30, 450349739, -450349739, new Object[]{gVar2});
        gVar2.f26080w = new o.ef.a();
        gVar2.f26079v = null;
        gVar2.f26081x = null;
        return null;
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        g gVar = (g) objArr[0];
        int i2 = 2 % 2;
        int i3 = A + 75;
        f26067z = i3 % 128;
        int i4 = i3 % 2;
        Long lValueOf = Long.valueOf(gVar.f26078u);
        int i5 = f26067z + 125;
        A = i5 % 128;
        if (i5 % 2 != 0) {
            return lValueOf;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0241  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean c(android.content.Context r25, o.ef.a r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 618
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fm.g.c(android.content.Context, o.ef.a):boolean");
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        g gVar = (g) objArr[0];
        int i2 = 2 % 2;
        int i3 = A + 15;
        f26067z = i3 % 128;
        int i4 = i3 % 2;
        String str = gVar.f26075r;
        if (i4 == 0) {
            return str;
        }
        throw null;
    }

    static void init$0() {
        $$a = new byte[]{54, MessagePack.Code.BIN8, MessagePack.Code.UINT64, -16};
        $$b = 125;
    }

    private void m() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26067z + 57;
        A = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            f.a();
            obj.hashCode();
            throw null;
        }
        if (f.a()) {
            Object[] objArr = new Object[1];
            E((char) KeyEvent.getDeadChar(0, 0), KeyEvent.normalizeMetaState(0) + 49, 17 - (ViewConfiguration.getEdgeSlop() >> 16), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            E((char) (Drawable.resolveOpacity(0, 0) + 37127), Color.alpha(0) + 1738, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 16, objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
            int i4 = A + 95;
            f26067z = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 4 % 4;
            }
        }
        this.f26074q = null;
        o.ef.a aVar = this.f26080w;
        Object[] objArr3 = new Object[1];
        E((char) (19694 - (ViewConfiguration.getPressedStateDuration() >> 16)), 960 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 7, objArr3);
        aVar.b(((String) objArr3[0]).intern());
    }

    private boolean n() {
        int i2 = 2 % 2;
        if (!this.f26072o.b()) {
            return false;
        }
        int i3 = f26067z + 1;
        A = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            this.f26070m.b();
            throw null;
        }
        if (!this.f26070m.b() || !this.f26071n.b()) {
            return false;
        }
        int i4 = f26067z + 71;
        A = i4 % 128;
        if (i4 % 2 != 0) {
            return this.f26069l.b() && this.f26077t.b() && this.f26074q != null;
        }
        this.f26069l.b();
        obj.hashCode();
        throw null;
    }

    static void o() {
        char[] cArr = new char[1844];
        ByteBuffer.wrap("\u0094\u00940åÜ\u0016y¼\u0005\b¡\u007fNÉê]·µS\u000fÿ.\u0084Ä  Í§i\u00115uÒÍ~7\u001b\u0080§îCsè×´5Q\u0083ýø\u0099N&ÂÂ,o¡\u000bð×L|¨\u0018 ¥\u0092Aüíb\u008a¶V\u0019òi\u009f÷;_À\u00adl\u0005\bkÕÍqV\u001e§rDÖ\"\u0094¡0òÜLy©\u0005\u000f¡eNËêB·\u0088S\u001aÿs\u0084Ê ;Í¡i\u00175|ÒÑ\u0094\u009b0ùÜQy©\u0005\u000f¡jNÀêX· S\u001aÿ \u0084\u0088 nÍ½i\u001b59ÒÑ~\"\u001b\u009c§ùC\u007fèÕ´;Q\u0092ýª\u0099]&ÕÂ&o\u0091\u000bö×V|ª\u00187¥\u0084A¸íN\u008a²V\u0004ò~\u009fô;^ÀÿlZ\b%ÕÝqG\u001e»º\tFrãÎ\u008f&T\u008aðV\u009ck9ÎÅ.b\u0089\u000eêªcwÆ\u00137¸\u008dDã^íú\u008f\u0016'³ßÏyk\u001c\u0084¶ .}Ö\u0099l5VNþê\u0018\u0007Ä£\"ÿ\u001c\u0018±´EÑêm\u0092\u0089\u000e\"ª~Y\u009b·7\u008eS<ìµ\bL¥ýÁ\u0087\u001d1¶ÚÒWo¡\u008b\u0087'8@\u0090\u009cn8\u000eU\u0088ñ>\nÌ¦rÂS\u001f·»+Ô\u0082pk\u008c\u001d)¢EU\u009d»9ÙÕqp\u0089\f/¨JGàãx¾\u0080Z:ö\u0000\u008d¨)NÄ\u0097`1<ZÛðw\u001e\u0012¸®ÙJSáÿ½\\X²ôÏ\u0090{/äË\u001cf°\u0002ÄÞwuÉ\u0011\u0000¬²HËär\u0083\u0093_9ûO\u0096Ô2iÉßez\u0001\u0005¯\u0012\u000b_çíB\f>º\u009a\u008euzÑñ\u008c\u000bh®ÄÌ¿n\u001b\u008cö\u0005Rñ\u000eÎébE\u0091 \"\u009c]xÁÓ}\u008f\u009cj7Æ\u000f¢î\u001dpù\u0093T)0_ìñG\u0018#\u0092\u009e6¥h\u0001\u001bí¥H@4æ\u0090\u008c\u007f\"Û«\u0086ebóÎ\u009bµ?\u0011ÎüUXó\u0004¶ã$OÜ*l\u0096\u0005r\u008b\u0094Â0¡\u000b\u000e¯lCÄæ<\u009a\u009a>ÿÑUuÍ(5Ì\u008f`µ\u001b\u001d¿ûR4ö\u0084ªøMEá»\u0084\u00188nÜæwJ+éÎ\u0007bz\u0006Î¹Q]©ð\u0005\u0094qHÂã|\u0087¡:\rÞ\u007frÅ\u00152É\u008am¹\u0000r¤Ê_8ó\u0086\u0097ùJTîÈ\u0081a%\u0085Ùä|\u0012\u0010¨Ë\boÃ\u0003ú¦FZôý\u001b\u0091{5ñèE\u008cë'[Û1\u007fÊ\u0012B¶°i\u001e\ra¡ÜD0øÙ\u0093^7/\u0094\u009b0ùÜQy©\u0005\u000f¡jNÀêX· S\u001aÿ \u0084\u0088 nÍ¡i\u00115mÒÐ~.\u001b\u008d§ûCsèß´|Q\u0092ýï\u0099[&ÄÂ<o\u0090\u000bä×W|é\u00184¥\u0098AêíP\u008a§V\u001fò,\u009fç;_À\u00adl\u0013\blÕÁq]\u001eôº\u0010Fqã\u0087\u008f'T\u008fð\u0005\u009ct9ÐÅ$b\u009e\u000eêª0w\u0098\u0013~¸\u0082DæàF\u008dÀ)#ö\u0091\u0092ó>AÛëg\u0005\f\u009f¨ótK\u0011©½\u0004Ybæú\u0082N/¸Ë\u0016\u0097n<ÇØ#Jüî\u009e\u00026§ÎÛh\u007f\r\u0090§4?iÇ\u008dy!\u0013Z«þF\u0013Ú·3ë\u001b\f· RÅày\u0098\u009dQ6æj\u001b\u008fõ#\u0099G'ø¥\u001cW±ýÕÄ\t0¢ËÆA{ä\u009f\u009634TÆ\u0088\u007f,KA\u0090å2\u001eÊ²jÖ\u0003\u000b½¯tÀÚdm\u0098E=¯QM\u008aù.~B\u0010ç¾\u001bR¼è+¤\u008fÆcnÆ\u0096º0\u001eUñÿUg\b\u009fì%@\u001f;·\u009fQr\u009eÖ.\u008aRmïÁ\u0011¤²\u0018ÄüLWà\u000bCî\u00adBÐ&d\u0099û}\u0003Ð¯´ÛhhÃÖ§\u000b\u001a§þÕRo5\u0098é M\u0013 Ø\u0084`\u007f\u0092Ó,·SjþÎb¡Ë\u0005/ùN\\¸0\u0019ë½O=#\u0004\u0086÷z\u0011Ýõ±Ô\u0015NÈþ¬\u0004\u0007üû\u0096_62û\u0096\rIµ-Ñ\u0081pd\u009bØ=³î\u0017\u009fË 8q\u009c\u0013p»ÕC©å\r\u0080â*F²\u001bJÿðSÊ(b\u008c\u0084aWÅñ\u0099Ó~;ÒÈ·v\u000b\u0013ï\u0095D?\u0018ÑýxQ@5£\u008a5nÍÃy§\b{ºÐ\u0003´Î\txí\u0000A¤&Eúî^\u00883[\u0097¢lPÀþ¤\u009dy-Ý¼²H\u0016öê\u008cOm#\u008fø'\\ý0\u0093\u00959iÙÎt¢\f\u0006\u0094Û8¿\u0094\u0014`è\u0000Lª!,\u0085ÔZs>\u001b\u0092¥w[Ëç o\u0004\u0019Øº½D\u0094\u009b0ùÜQy©\u0005\u000f¡jNÀêX· S\u001eÿt\u0084Ì !Í½iT5|ÒÐ~5\u001b\u0087§ÿC6è\u0081´|Q\u008fýå\u0099\u000f&ÃÂ0o\u008a\u000b÷×M|§\u00185¥\u0084A¸í[\u008a©V\u0019òa\u009fð;NÀÿl\u0016\b`ÕÜq@\u001e½º\u0016Flã\u0087\u008f:T\u0088ð\u0002\u009ci9ÕÅ$b\u009c\u000eêªt{\u0085ßç3P\u0096¢ê\u0014N|¡Ö\u0005\u000fX®¼\u0012\u0010qkÕÏp\"½\u0086\u000fÚu=Ï\u00910ô\u0085Hç¬a\u0007Ë[%¾ß\u0012çvTÉÚ-?\u0080\u0089äó8]\u0093¤÷lJ\u009b®ã\u0002Pe·¹\u0000\u001d`pìÔA/²Mxé\u000b\u0005µ PÜöx\u009c\u009723»\u0094\u00870çÜ\\y¼\u0005\u0012¡nN\u008cê\u001c·úS\fÿe\u0084Ñ :Íºi\u001a5~ÒÑ~g\u001b\u0086§âCrèÞ´|Q\u0087ýå\u0099Z&ÞÂ1oÞ\u000b®×\u0004|¼\u0018\"¥\u0093AùíI\u008a¯V\u0005òk\u009f±;IÀºl\u0014\bqÕÇq]\u001e³º\n\u0094\u00910øÜMy³\u0005\u0012¡nNÞêB\u0094\u00870çÜ\\y¼\u0005\u0012¡nN\u008cê\u001c·úS\u001cÿo\u0084Ð  Í§i\u00115kÒÑ~g\u001b\u0086§âCrèÞ´|Q\u0087ýå\u0099Z&ÞÂ1oÞ\u000b®×\u0004|¼\u0018\"¥\u0093AùíI\u008a¯V\u0005òk\u009f±;YÀ°l\u0015\bkÕÚqV\u001e¦º\n`ÙÄ¹(\u0002\u008dâñLU0ºÒ\u001eBC¤§D\u000b3p\u008bÔd9ô\u009d\nÁ$&\u0093\u008alïØS§·-\u001c\u0097@q¥\u009f\tµm\u0003Ò\u009c6j\u009bÙÿñ#Z\u0088ùìcQ\u0089µ³\u0019\u0013~ü¢T\u0006&kª\u0094\u00910ÿÜ]y¾\u0005\r¡HNÃê_·¼S\u0016ÿg\u0084ð >Í·i\u00155mÒÇ~\u0003\u001b\u0089§ùCs\u0094\u00870çÜ\\y¼\u0005\u0012¡nN\u008cê\u001c·úS\nÿp\u0084Á /Í§i\u001d5wÒÅ~g\u001b\u008b§åCsèØ´7QÁýé\u0099@&ÞÂ3o\u0097\u000bä×\u0004|¼\u0018\"¥\u0093AùíI\u008a£VKòh\u009fð;NÀºØk|\u0018\u0090º5_Iíí\u0091\u0002\u000b¦»\u0094\u00870çÜ\\y¼\u0005\u0012¡nN\u008cê\u001c·úS\nÿp\u0084Á /Í§i\u001d5wÒÅ~g\u001b\u009f§ìCzè×´9Q\u0095ýª\u0099f&Ô\u0094\u00820åÜWy¹\u0005\u0013¡hNØêB·\u0089S\u000bÿa\u0084Ñ ;Í \u0094\u00870çÜ\\y¼\u0005\u0012¡nN\u008cê\u001c·úS\nÿp\u0084Á /Í§i\u001d5wÒÅ~g\u001b\u0098§ÿCyèß´)Q\u0082ýþ\u0099\u000f&ÃÂ!o\u009f\u000b÷×Q|º\u0094\u00970ûÜQyº\u0005\u000f¡iNÀêT·\u008aS\rÿo\u0084Á ;Í°i\u00005j\u0094\u00870çÜ\\y¼\u0005\u0012¡nN\u008cê\u001c·úS\nÿp\u0084Á /Í§i\u001d5wÒÅ~g\u001b\u0098§ÿCyèß´)Q\u0082ýþ\u0099\u000f&ÕÂ9o\u0097\u000bä×M|«\u0018;¥\u009bAñíI\u008a¿\u0094\u009b0äÜKy¨\u0005\u0003¡yNèêP·®S\u001eó%WZ»õ\u001e\u0016b½ÆÇ)E\u008dîÐ\b4\u00ad\u0098ÛãoG¹ª\t\u0094\u009b0äÜKy¨\u0005\u0003¡yNïê]·³S\u001aÿn\u0084Ñ \u0007Í·ò\u000fVzº×8«\u009cËppÕ\u0090©>\rBâ F0\u001bÖÿ\u0015SI(ý\u008c\u0001a\u0097Åx\u0099B~ïÒ\u0007·¨\u000bÄïND·\u0018_ýíQÕ5f\u008aÿn\fÃ §Ê{(Ð\u0081´\u0017\t¨íÄA}&\u008bú>^\u00003Þ\u0097sl\u0081À8¤@yäÝv²\u009b\u00164êZOî#\u0017ò]V=º\u0086\u001ffcÈÇ´(V\u008cÆÑ 5ë\u0099¯â\u0013Fø«)\u000fùS¢´\u0014\u0018ñ}WÁ#%ì\u008e\"Òã7I\u009b$ÿ\u009c@\f¤æ\tGm8±\u008a\u001av\u0094ß0ºÜ\u0015yð\u0005K¡INéêv·\u0093S1ÿ \u0084æ \u000bÍ\u0081i 5PÒä~\u000e\u001b«§ÌCBèþ´qQÌý§\u0099\u0002&\u009d\u0094ß0ºÜ\u0015yð\u0005K¡NNâêu·úS<ÿE\u0084÷ \u001aÍ\u009ai25PÒá~\u0006\u001b¼§ÈC;è\u0096´qQÌý§0\u0017\u0094ø°Ú\u0014ºø\u0001]á!O\u00853jÑÎA\u0093§wuÛ< \u0094\u0004\u007féëM]\u0011dö¼Z\u007f?Ç\u0083¤g\"Ì\u0080\u0090hußÙ¶½\u0006\u0002\u0088æ2K\u0083©â\rñáED¥8\u0017\tó\u00ad\u0093A(äÈ\u0098f<\u001aÓøwh*\u008eÎ\\b\u0015\u0019½½VPÂôt¨MO\u0095ãV\u0086î:\u008dÞ\u000bu©)AÌö`\u009f\u0004/»¡\u0094\u00870çÜ\\y¼\u0005\u0012¡nN\u008cê\u001c·úS1ÿo\u0084\u0085 \u001dÍ¶i\u00175lÒÐ~\"\u001bÈ§ÉC\u007fèÈ´,Q\u008dýë\u0099V&\u0090Â\u0016o\u009b\u000bñ×P| \u00184¥\u009eAûí\\\u008a²V\u000e\u0094\u00870çÜ\\y¼\u0005\u0012¡nN\u008cê\u001c·úS,ÿe\u0084Æ ;Í¡i\u001159Òæ~.\u001b\u009b§ýCzèÚ´%QÁýÉ\u0099J&ÂÂ!o\u0097\u000bå×M|ª\u00183¥\u0083Aýí\u0007\u008aæ\u0094\u00870çÜ\\y¼\u0005\u0012¡nN\u008cê\u001c·úS,ÿe\u0084Æ ;Í¡i\u001159Òæ~.\u001b\u009b§ýCzèÚ´%QÁýÉ\u0099J&ÂÂ!o\u0097\u000bå×M|ª\u00183¥\u0083Aý\u0094¸0äÜWy³\u0005#¡sNÏêT·ªS\u000bÿi\u0084Ê  Íói\u00035qÒË~+\u001b\u008d§\u00adCcèË´8Q\u0080ýþ\u0099F&ÞÂ2oÞ\u000bð×A|½\u0018&¥\u009eAöíZ\u008aµVKò!\u009f±_µûÕ\u0017n²\u008eÎ j\\\u0085Í!f|\u009c\u009894[Oùë\u001b\u0006\u0092\u0094\u009e0þÜUy´\u0005\u0012¡x\u0094\u009e0øÜ[y¼\u0005\n¡n\u0000]¤.H\u0087ít\u0091È5¾Ú\u0004~\u0094\u0094\u00930âÜLyµ\u0005\u0003¡eNØêX·¹S\u001eÿt\u0084Ì !Í½i95|ÒÖ~/\u001b\u0087§éCe\u0094\u00930âÜLyµ\u0005\u0003¡eNØêX·¹S\u001eÿt\u0084Ì !Í½i$5xÒÖ~3\u001b\u008d§ÿCxèÈ\u0094\u00910øÜUy°\u0005\u000f¡\u007fNøê^·\u009eS\u0016ÿs\u0084Î nÍþiT5jÒÇ~5\u001b\u0081§ìCzèÒ´&Q\u0084ýî\u0099\u000f&ÚÂ&o\u0091\u000bí×\u0004|ó\u0018r8\u009b\u009còp_Õº©\u0005\ruâòFT\u001b\u0094ÿ\u001cSy(Ä\u008cdaôÅ^\u0099v~ÅÒ=·\u0096\u000bþï<DÃ\u00183ý\u0098Qï5P\u008aÈn<Ã\u0091§ú\u009f½;Ô×yr\u009c\u000e#ªSEÔár¼²X:ô_\u008fâ+BÆÒbx>FÙúu\u0004\u0010¶¬ÈHTãð¿PZ®öÏ\u0092s-ôÉ\u001cd \u0000ÊÜlwÅ\u0013\u0014®¨JÛæ\u007f\u0081Ê]3ùO\u0094\u009d0rË\u009ag?\u0003B\u0094¸0äÜWy³\u0005F¡nNÔêR·¿S\u000fÿt\u0084Ì !Í½iT5nÒÊ~.\u001b\u0084§èC6èÈ´9Q\u0095ýþ\u0099F&ÞÂ2oÞ\u000bô×E|¥\u0018>¥\u0092Aìí\u001d\u008a\u008fV/ò,\u009f«;\u001a\u0094\u00940ûÜMy®\u0005\u000e¡bNÂêV·úS\fÿe\u0084Ñ :Íºi\u001a5~ÒÑ~g\u001b\u0089§ãCrè\u009b´?Q\u008eýÿ\u0099A&ÄÂ0o\u008c\u000bð\u0005\u0093¡üMJè©\u0094\t0eßÅ{Q&ýÂ\u000fnf\u0015Î±%\\±ø\u0007¤WCÁ~xÚ\u00176¡\u0093BïâK\u008e¤.\u0000º]\u0016¹ú\u0015\u009fn:Ê×'Z\u0083êß±8/\u0094ßñe\u001b#¿LSúö\u0019\u008a¹.ÕÁueá8MÜ¸pÅ\u000b}¯\u009dB\u0011æ ºÚ]5ñ\u0085\u0094,([ÌÆgi;ËÞ;r\\\u0016ö©fM\u0085à,\u0084F4)\u0090F|ðÙ\u0013¥³\u0001ßî\u007fJë\u0017Gó®_Ü$k\u0080\u0087mNÉª\u0095ËrqÞ\u009c»<\u0007Wã\u008bHs\u0014\u0091ñ8]V9æ\u0086hbÈÏ\u0007«_wíÜ\u0011\u0093\u00807ïÛY~º\u0002\u001a¦vIÖíB".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1844);
        f26066y = cArr;
        D = 555737359160979607L;
    }

    private void p() throws Throwable {
        int i2 = f26056a * (-767894898);
        f26056a = i2;
        int i3 = 1774904935 * f26057b;
        f26057b = i3;
        int i4 = (-1793337310) * f26059d;
        f26059d = i4;
        int i5 = f26060e * (-1703172253);
        f26060e = i5;
        b(i5, i3, i4, i2, 450349739, -450349739, new Object[]{this});
    }

    private void q() throws Throwable {
        int i2 = 2 % 2;
        int i3 = A + 123;
        f26067z = i3 % 128;
        if (i3 % 2 != 0) {
            f.a();
            throw null;
        }
        if (f.a()) {
            int i4 = f26067z + 77;
            A = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            E((char) Gravity.getAbsoluteGravity(0, 0), 49 - (Process.myTid() >> 22), (ViewConfiguration.getFadingEdgeLength() >> 16) + 17, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            E((char) (60140 - (KeyEvent.getMaxKeyCode() >> 16)), 1755 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 19, objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
            int i6 = A + 75;
            f26067z = i6 % 128;
            int i7 = i6 % 2;
        }
        this.f26076s = null;
        o.ef.a aVar = this.f26080w;
        Object[] objArr3 = new Object[1];
        E((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1093, 10 - (ViewConfiguration.getScrollBarSize() >> 8), objArr3);
        aVar.b(((String) objArr3[0]).intern());
    }

    private void r() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26067z + 117;
        A = i3 % 128;
        if (i3 % 2 == 0) {
            f.a();
            throw null;
        }
        if (f.a()) {
            Object[] objArr = new Object[1];
            E((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 49, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 17, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            E((char) (41150 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 1804 - View.getDefaultSize(0, 0), 33 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
        }
        this.f26078u = 0L;
        o.ef.a aVar = this.f26080w;
        Object[] objArr3 = new Object[1];
        E((char) View.resolveSize(0, 0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 896, 22 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr3);
        aVar.b(((String) objArr3[0]).intern());
        int i4 = A + 107;
        f26067z = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:266:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x02fe A[Catch: b -> 0x0f64, TRY_ENTER, TryCatch #2 {b -> 0x0f64, blocks: (B:246:0x005b, B:248:0x0090, B:251:0x009f, B:252:0x00c4, B:254:0x016d, B:258:0x01a5, B:263:0x024e, B:264:0x0277, B:268:0x02bd, B:270:0x02c3, B:271:0x02f1, B:272:0x02f5, B:273:0x02f8, B:277:0x02fe, B:278:0x032d, B:280:0x035f, B:282:0x0367, B:283:0x038b, B:284:0x03e9, B:286:0x0414, B:288:0x041a, B:289:0x0441, B:290:0x04c4, B:292:0x04ca, B:297:0x0512, B:298:0x0516, B:299:0x0519, B:314:0x0691, B:316:0x0697, B:317:0x06c0, B:318:0x06d3, B:321:0x0709, B:322:0x075f, B:324:0x078b, B:325:0x07e4, B:327:0x0810, B:334:0x0873, B:336:0x0878, B:333:0x086f, B:338:0x087d, B:340:0x08b8, B:342:0x08ea, B:347:0x08fd, B:349:0x094d, B:348:0x0925, B:350:0x0950, B:352:0x0964, B:408:0x0cad, B:409:0x0caf, B:411:0x0cbe, B:413:0x0cc4, B:414:0x0cec, B:417:0x0d00, B:419:0x0d16, B:421:0x0d44, B:422:0x0d4a, B:423:0x0d51, B:425:0x0d59, B:426:0x0e44, B:428:0x0e7b, B:430:0x0e91, B:432:0x0eb3, B:433:0x0eb9, B:434:0x0ec0, B:436:0x0ed0, B:438:0x0ee6, B:440:0x0f08, B:441:0x0f0d, B:442:0x0f14, B:444:0x0f1c, B:445:0x0f20, B:447:0x0f22, B:448:0x0f26, B:450:0x0f28, B:452:0x0f2e, B:453:0x0f53, B:455:0x0f58, B:456:0x0f5c, B:356:0x0977, B:363:0x09e6, B:365:0x09fc, B:371:0x0a4e, B:372:0x0a54, B:373:0x0a5b, B:375:0x0a63, B:376:0x0b4f, B:378:0x0b8d, B:384:0x0bd8, B:386:0x0bfa, B:387:0x0c00, B:388:0x0c07, B:390:0x0c1f, B:392:0x0c3d, B:394:0x0c57, B:395:0x0c5c, B:396:0x0c63, B:398:0x0c6b, B:399:0x0c6f, B:401:0x0c71, B:402:0x0c75, B:404:0x0c77, B:406:0x0c7d, B:407:0x0ca9, B:458:0x0f5e, B:459:0x0f62, B:302:0x051c, B:304:0x054a, B:309:0x055d, B:311:0x05a7, B:310:0x0582, B:312:0x05aa, B:261:0x01fc), top: B:466:0x005b, inners: #0, #1, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x051c A[Catch: b -> 0x0f64, TRY_ENTER, TryCatch #2 {b -> 0x0f64, blocks: (B:246:0x005b, B:248:0x0090, B:251:0x009f, B:252:0x00c4, B:254:0x016d, B:258:0x01a5, B:263:0x024e, B:264:0x0277, B:268:0x02bd, B:270:0x02c3, B:271:0x02f1, B:272:0x02f5, B:273:0x02f8, B:277:0x02fe, B:278:0x032d, B:280:0x035f, B:282:0x0367, B:283:0x038b, B:284:0x03e9, B:286:0x0414, B:288:0x041a, B:289:0x0441, B:290:0x04c4, B:292:0x04ca, B:297:0x0512, B:298:0x0516, B:299:0x0519, B:314:0x0691, B:316:0x0697, B:317:0x06c0, B:318:0x06d3, B:321:0x0709, B:322:0x075f, B:324:0x078b, B:325:0x07e4, B:327:0x0810, B:334:0x0873, B:336:0x0878, B:333:0x086f, B:338:0x087d, B:340:0x08b8, B:342:0x08ea, B:347:0x08fd, B:349:0x094d, B:348:0x0925, B:350:0x0950, B:352:0x0964, B:408:0x0cad, B:409:0x0caf, B:411:0x0cbe, B:413:0x0cc4, B:414:0x0cec, B:417:0x0d00, B:419:0x0d16, B:421:0x0d44, B:422:0x0d4a, B:423:0x0d51, B:425:0x0d59, B:426:0x0e44, B:428:0x0e7b, B:430:0x0e91, B:432:0x0eb3, B:433:0x0eb9, B:434:0x0ec0, B:436:0x0ed0, B:438:0x0ee6, B:440:0x0f08, B:441:0x0f0d, B:442:0x0f14, B:444:0x0f1c, B:445:0x0f20, B:447:0x0f22, B:448:0x0f26, B:450:0x0f28, B:452:0x0f2e, B:453:0x0f53, B:455:0x0f58, B:456:0x0f5c, B:356:0x0977, B:363:0x09e6, B:365:0x09fc, B:371:0x0a4e, B:372:0x0a54, B:373:0x0a5b, B:375:0x0a63, B:376:0x0b4f, B:378:0x0b8d, B:384:0x0bd8, B:386:0x0bfa, B:387:0x0c00, B:388:0x0c07, B:390:0x0c1f, B:392:0x0c3d, B:394:0x0c57, B:395:0x0c5c, B:396:0x0c63, B:398:0x0c6b, B:399:0x0c6f, B:401:0x0c71, B:402:0x0c75, B:404:0x0c77, B:406:0x0c7d, B:407:0x0ca9, B:458:0x0f5e, B:459:0x0f62, B:302:0x051c, B:304:0x054a, B:309:0x055d, B:311:0x05a7, B:310:0x0582, B:312:0x05aa, B:261:0x01fc), top: B:466:0x005b, inners: #0, #1, #8, #9 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o.fj.c a(android.content.Context r28, o.ef.a r29, boolean r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 4004
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fm.g.a(android.content.Context, o.ef.a, boolean):o.fj.c");
    }

    public final d a() {
        int i2 = 2 % 2;
        int i3 = A + 89;
        f26067z = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f26077t;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final a b() {
        int i2 = 2 % 2;
        int i3 = A + 17;
        int i4 = i3 % 128;
        f26067z = i4;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        a aVar = this.f26072o;
        int i5 = i4 + 45;
        A = i5 % 128;
        int i6 = i5 % 2;
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0196 A[PHI: r4
  0x0196: PHI (r4v12 android.content.SharedPreferences) = (r4v7 android.content.SharedPreferences), (r4v20 android.content.SharedPreferences) binds: [B:71:0x018b, B:74:0x0194] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0243  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.content.Context r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 866
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fm.g.b(android.content.Context):void");
    }

    public final void b(String str) throws Throwable {
        o.ef.a aVar;
        String strIntern;
        int i2 = 2 % 2;
        int i3 = f26067z + 27;
        A = i3 % 128;
        try {
            if (i3 % 2 == 0) {
                this.f26074q = str;
                aVar = this.f26080w;
                Object[] objArr = new Object[1];
                E((char) (CasioType2MakernoteDirectory.TAG_BESTSHOT_MODE >>> (ViewConfiguration.getGlobalActionKeyTimeout() > 1L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 1L ? 0 : -1))), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) * 10718, 61 % (ViewConfiguration.getScrollBarSize() - 62), objArr);
                strIntern = ((String) objArr[0]).intern();
            } else {
                this.f26074q = str;
                aVar = this.f26080w;
                Object[] objArr2 = new Object[1];
                E((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 19693), 961 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (ViewConfiguration.getScrollBarSize() >> 8) + 8, objArr2);
                strIntern = ((String) objArr2[0]).intern();
            }
            aVar.a(strIntern, (Object) str);
            int i4 = A + 85;
            f26067z = i4 % 128;
            int i5 = i4 % 2;
        } catch (o.ef.b e2) {
            if (f.a()) {
                Object[] objArr3 = new Object[1];
                E((char) TextUtils.getCapsMode("", 0, 0), 49 - TextUtils.getOffsetAfter("", 0), 16 - MotionEvent.axisFromString(""), objArr3);
                String strIntern2 = ((String) objArr3[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr4 = new Object[1];
                E((char) (ViewConfiguration.getTapTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1668, 41 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr4);
                f.c(strIntern2, sb.append(((String) objArr4[0]).intern()).append(e2.getMessage()).toString());
                int i6 = f26067z + 17;
                A = i6 % 128;
                int i7 = i6 % 2;
            }
        }
    }

    public final j c() {
        int i2 = 2 % 2;
        int i3 = A + 67;
        int i4 = i3 % 128;
        f26067z = i4;
        int i5 = i3 % 2;
        j jVar = this.f26071n;
        int i6 = i4 + 123;
        A = i6 % 128;
        if (i6 % 2 != 0) {
            return jVar;
        }
        throw null;
    }

    public final b d() {
        int i2 = 2 % 2;
        int i3 = A + 23;
        int i4 = i3 % 128;
        f26067z = i4;
        int i5 = i3 % 2;
        b bVar = this.f26070m;
        int i6 = i4 + 37;
        A = i6 % 128;
        int i7 = i6 % 2;
        return bVar;
    }

    public final void d(Context context) throws Throwable {
        int iActiveCount = Thread.activeCount();
        int priority = Thread.currentThread().getPriority();
        int i2 = f26058c * 186554553;
        f26058c = i2;
        int i3 = 1606129317 * f26064i;
        f26064i = i3;
        b(i3, priority, i2, iActiveCount, -181456863, 181456864, new Object[]{this, context});
    }

    public final h e() {
        int i2 = 2 % 2;
        int i3 = f26067z + 65;
        A = i3 % 128;
        int i4 = i3 % 2;
        h hVar = this.f26068k;
        if (i4 == 0) {
            int i5 = 83 / 0;
        }
        return hVar;
    }

    public final void e(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26067z + 125;
        A = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        E((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 50 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getScrollBarSize() >> 8) + 17, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        E((char) View.resolveSizeAndState(0, 0, 0), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1, (ViewConfiguration.getFadingEdgeLength() >> 16) + 47, objArr2);
        Object[] objArr3 = {((String) objArr2[0]).intern(), 0};
        Method method = Class.forName(ZO.xd("k\rS3\u001du\r%SB*S8JvI$,nJH\u0011\"", (short) (ZN.Xd() ^ 1023), (short) (ZN.Xd() ^ 9694))).getMethod(Ig.wd("\u001baB\u0002v\"Gz\u001e\u000b+\u00041B\u001btT7\u0002g", (short) (C1580rY.Xd() ^ (-21438))), Class.forName(C1626yg.Ud("Fos,\u0010\u0016R`#\u0004I`\r\r\r*", (short) (C1580rY.Xd() ^ (-28036)), (short) (C1580rY.Xd() ^ (-30773)))), Integer.TYPE);
        try {
            method.setAccessible(true);
            SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr3);
            Object[] objArr4 = new Object[1];
            E((char) (59078 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), TextUtils.getOffsetAfter("", 0) + 47, 2 - ExpandableListView.getPackedPositionGroup(0L), objArr4);
            String string = sharedPreferences.getString(((String) objArr4[0]).intern(), "");
            if (string.isEmpty()) {
                if (f.a()) {
                    int i5 = A + 5;
                    f26067z = i5 % 128;
                    int i6 = i5 % 2;
                    Object[] objArr5 = new Object[1];
                    E((char) (Process.getGidForName("") + 1), 67 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 63 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr5);
                    f.c(strIntern, ((String) objArr5[0]).intern());
                    return;
                }
                return;
            }
            if (f.a()) {
                int i7 = f26067z + 113;
                A = i7 % 128;
                int i8 = i7 % 2;
                Object[] objArr6 = new Object[1];
                E((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 51831), 129 - View.MeasureSpec.getMode(0), 51 - Gravity.getAbsoluteGravity(0, 0), objArr6);
                f.c(strIntern, ((String) objArr6[0]).intern());
            }
            String strC = new o.dk.a(context).c(string);
            if (f.a()) {
                StringBuilder sb = new StringBuilder();
                Object[] objArr7 = new Object[1];
                E((char) (View.resolveSizeAndState(0, 0, 0) + 2336), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 180, 44 - TextUtils.getTrimmedLength(""), objArr7);
                f.c(strIntern, sb.append(((String) objArr7[0]).intern()).append(strC).toString());
            }
            if (strC == null || strC.isEmpty()) {
                Object[] objArr8 = new Object[1];
                E((char) (((Process.getThreadPriority(0) + 20) >> 6) + 15269), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 223, 34 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr8);
                throw new o.en.f(((String) objArr8[0]).intern());
            }
            try {
                o.ef.a aVar = new o.ef.a(strC);
                E((char) (12777 - View.MeasureSpec.getSize(0)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 257, 20 - TextUtils.indexOf((CharSequence) "", '0'), new Object[1]);
                try {
                    if (!aVar.d(((String) r0[0]).intern())) {
                        if (f.a()) {
                            int i9 = f26067z + 15;
                            A = i9 % 128;
                            int i10 = i9 % 2;
                            Object[] objArr9 = new Object[1];
                            E((char) (TextUtils.getOffsetAfter("", 0) + 44266), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 568, 75 - (Process.myTid() >> 22), objArr9);
                            f.d(strIntern, ((String) objArr9[0]).intern());
                        }
                        Object[] objArr10 = new Object[1];
                        E((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 644 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), Color.argb(0, 0, 0, 0) + 59, objArr10);
                        throw new o.en.f(((String) objArr10[0]).intern());
                    }
                    int i11 = f26067z + 49;
                    A = i11 % 128;
                    int i12 = i11 % 2;
                    Object[] objArr11 = new Object[1];
                    E((char) (12777 - KeyEvent.getDeadChar(0, 0)), 306 - AndroidCharacter.getMirror('0'), (ViewConfiguration.getLongPressTimeout() >> 16) + 21, objArr11);
                    Object[] objArr12 = {aVar, ((String) objArr11[0]).intern()};
                    int i13 = o.ef.a.f23782p * (-1576737484);
                    o.ef.a.f23782p = i13;
                    String str = (String) o.ef.a.a(-781664457, objArr12, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i13, Thread.currentThread().getPriority());
                    Object[] objArr13 = new Object[1];
                    E((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), Color.argb(0, 0, 0, 0) + 279, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2, objArr13);
                    if (str.equals(((String) objArr13[0]).intern())) {
                        int i14 = f26067z + 11;
                        A = i14 % 128;
                        int i15 = i14 % 2;
                        if (f.a()) {
                            StringBuilder sb2 = new StringBuilder();
                            Object[] objArr14 = new Object[1];
                            E((char) (40853 - (ViewConfiguration.getLongPressTimeout() >> 16)), 280 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 73 - (ViewConfiguration.getTapTimeout() >> 16), objArr14);
                            f.c(strIntern, sb2.append(((String) objArr14[0]).intern()).append(str).toString());
                        }
                    } else {
                        if (Integer.parseInt(str) < 4) {
                            if (f.a()) {
                                Object[] objArr15 = new Object[1];
                                E((char) View.resolveSize(0, 0), 354 - Color.green(0), AndroidCharacter.getMirror('0') + Typography.dollar, objArr15);
                                f.d(strIntern, ((String) objArr15[0]).intern());
                            }
                            Object[] objArr16 = new Object[1];
                            E((char) (56935 - Color.red(0)), TextUtils.getOffsetAfter("", 0) + 438, View.resolveSize(0, 0) + 57, objArr16);
                            throw new o.en.f(((String) objArr16[0]).intern());
                        }
                        if (f.a()) {
                            StringBuilder sb3 = new StringBuilder();
                            Object[] objArr17 = new Object[1];
                            E((char) (48959 - TextUtils.getOffsetAfter("", 0)), KeyEvent.keyCodeFromString("") + 495, 74 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr17);
                            f.c(strIntern, sb3.append(((String) objArr17[0]).intern()).append(str).toString());
                        }
                    }
                    a(context, aVar, true);
                } catch (o.ef.b unused) {
                    Object[] objArr18 = new Object[1];
                    E((char) (61213 - MotionEvent.axisFromString("")), TextUtils.indexOf((CharSequence) "", '0') + TypedValues.TransitionType.TYPE_AUTO_TRANSITION, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 42, objArr18);
                    throw new o.en.f(((String) objArr18[0]).intern());
                }
            } catch (o.ef.b unused2) {
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final String f() {
        int i2 = 2 % 2;
        int i3 = f26067z;
        int i4 = i3 + 123;
        A = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        String str = this.f26074q;
        int i5 = i3 + 49;
        A = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String g() {
        int i2 = 2 % 2;
        int i3 = A;
        int i4 = i3 + 15;
        f26067z = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f26073p;
        int i6 = i3 + 63;
        f26067z = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Long h() {
        int i2 = f26061f * 390633709;
        f26061f = i2;
        int iNextInt = new Random().nextInt(983859859);
        int iActiveCount = Thread.activeCount();
        return (Long) b((int) Thread.currentThread().getId(), iNextInt, iActiveCount, i2, 540695712, -540695709, new Object[]{this});
    }

    public final String i() {
        int i2 = f26062g * 917650304;
        f26062g = i2;
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i3 = (-918422679) * f26063h;
        f26063h = i3;
        int i4 = f26065j * (-2029725721);
        f26065j = i4;
        return (String) b(i4, iMaxMemory, i3, i2, -1062169248, 1062169250, new Object[]{this});
    }

    public final String j() {
        int i2 = 2 % 2;
        int i3 = A + 63;
        int i4 = i3 % 128;
        f26067z = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.f26076s;
        int i5 = i4 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        A = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final X509Certificate k() {
        int i2 = 2 % 2;
        int i3 = f26067z + 103;
        A = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f26079v;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final X509Certificate l() {
        int i2 = 2 % 2;
        int i3 = A + 85;
        int i4 = i3 % 128;
        f26067z = i4;
        int i5 = i3 % 2;
        X509Certificate x509Certificate = this.f26081x;
        if (x509Certificate == null) {
            return this.f26079v;
        }
        int i6 = i4 + 13;
        A = i6 % 128;
        if (i6 % 2 != 0) {
            return x509Certificate;
        }
        throw null;
    }
}
