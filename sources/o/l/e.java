package o.l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.drew.metadata.exif.makernotes.OlympusImageProcessingMakernoteDirectory;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.iptc.IptcDirectory;
import fr.antelop.sdk.R;
import fr.antelop.sdk.WalletManager;
import fr.antelop.sdk.exception.WalletValidationException;
import fr.antelop.sdk.ui.LocaleManager;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import o.a.g;
import o.a.m;
import o.a.n;
import o.ea.f;
import o.l.b;
import org.msgpack.core.MessagePack;
import yg.C1499aX;
import yg.C1553lQ;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.CX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends AppCompatActivity {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f26368a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final b f26369b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f26370d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static char f26371f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f26372g = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static char f26373k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f26374l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f26375m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static char f26376n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static char f26377o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static int f26378p = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static int f26379r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static int f26380s = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    CancellationSignal f26381c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    long f26382e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private WalletManager f26383h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f26384i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private c f26385j;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r9, short r10, byte r11) {
        /*
            int r0 = r10 * 2
            int r8 = 4 - r0
            int r7 = r11 + 69
            byte[] r6 = o.l.e.$$a
            int r0 = r9 * 3
            int r5 = 1 - r0
            byte[] r4 = new byte[r5]
            r3 = 0
            if (r6 != 0) goto L28
            r0 = r8
            r2 = r3
        L13:
            int r8 = r8 + 1
            int r0 = -r0
            int r7 = r7 + r0
            r1 = r2
        L18:
            int r2 = r1 + 1
            byte r0 = (byte) r7
            r4[r1] = r0
            if (r2 != r5) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L25:
            r0 = r6[r8]
            goto L13
        L28:
            r1 = r3
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.l.e.$$c(short, short, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f26372g = 1851279429;
        f26370d = -1728103063;
        f26368a = -2090350925;
        f26380s = 0;
        f26378p = 1;
        f26374l = 0;
        f26379r = 1;
        d();
        ViewConfiguration.getMaximumFlingVelocity();
        ViewConfiguration.getPressedStateDuration();
        TextUtils.lastIndexOf("", '0', 0);
        ViewConfiguration.getGlobalActionKeyTimeout();
        f26369b = new b();
        int i2 = f26378p + 45;
        f26380s = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 20 / 0;
        }
    }

    public static /* synthetic */ Object a(int i2, int i3, int i4, Object[] objArr, int i5, int i6, int i7) {
        int i8 = ~i6;
        int i9 = ~i4;
        int i10 = ~i5;
        int i11 = ~(i9 | i10);
        int i12 = ~((-1) - (((-1) - i5) & ((-1) - i4)));
        int i13 = ((i11 + i8) - (i11 & i8)) | i12;
        int i14 = (-1) - (((-1) - ((-1) - (((-1) - (~((i8 + i4) - (i8 & i4)))) & ((-1) - (~((i8 + i10) - (i8 & i10))))))) & ((-1) - (~((-1) - (((-1) - i10) & ((-1) - i4))))));
        int i15 = i4 + i6 + i3 + (669352129 * i7) + (266941808 * i2);
        int i16 = i15 * i15;
        int i17 = (720661947 * i4) + 1572077568 + ((-1243901369) * i6) + (1165201990 * i13) + (i12 * (-1165201990)) + ((-1165201990) * i14) + (1885863936 * i3) + ((-1100480512) * i7) + ((-1249902592) * i2) + ((-491520000) * i16);
        int i18 = (i4 * 1617402437) + 56426783 + (i6 * 1617401273) + (i13 * (-582)) + (i12 * IptcDirectory.TAG_PROGRAM_VERSION) + (i14 * IptcDirectory.TAG_PROGRAM_VERSION) + (i3 * 1617401855) + (i7 * 1244927807) + (i2 * (-404665712)) + (i16 * (-45350912));
        return i17 + ((i18 * i18) * 1565261824) != 1 ? a(objArr) : e(objArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        if ((!o.ea.f.a()) == true) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        r1 = o.l.e.f26379r + 69;
        o.l.e.f26374l = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if ((r1 % 2) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        r0 = new java.lang.Object[1];
        q("廰뫙놭뾇⎿뤾\u0991ꋓᔮ⯂묱牳痥躒ꚩ屮겈꺡ꚩ屮ۂ皿捽䈾⎿뤾\u0cdf\ufdd1偨吾ꚩ屮㯡⠚ꦨ뼭", 67 << android.view.View.MeasureSpec.makeMeasureSpec(1, 1), r0);
        r2 = ((java.lang.String) r0[0]).intern();
        r0 = new java.lang.Object[1];
        q("땀麭鋽厤ᡍ叁᪫뀯㿮㻝㜙㎸䵝ﳙ", android.view.View.MeasureSpec.getSize(1) * 68, r0);
        r0 = r0[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0059, code lost:
    
        o.ea.f.c(r2, ((java.lang.String) r0).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0062, code lost:
    
        r4.f26385j.e(r4, fr.antelop.sdk.R.id.container, r4.f26381c, new o.l.e.AnonymousClass3(r4));
        r1 = o.l.e.f26379r + 31;
        o.l.e.f26374l = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
    
        if ((r1 % 2) != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
    
        r0 = new java.lang.Object[1];
        q("廰뫙놭뾇⎿뤾\u0991ꋓᔮ⯂묱牳痥躒ꚩ屮겈꺡ꚩ屮ۂ皿捽䈾⎿뤾\u0cdf\ufdd1偨吾ꚩ屮㯡⠚ꦨ뼭", android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 36, r0);
        r2 = ((java.lang.String) r0[0]).intern();
        r0 = new java.lang.Object[1];
        q("땀麭鋽厤ᡍ叁᪫뀯㿮㻝㜙㎸䵝ﳙ", android.view.View.MeasureSpec.getSize(0) + 13, r0);
        r0 = r0[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (r4.f26384i == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r4.f26384i == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object a(java.lang.Object[] r8) throws java.lang.Throwable {
        /*
            r3 = 0
            r4 = r8[r3]
            o.l.e r4 = (o.l.e) r4
            r8 = 2
            int r0 = r8 % r8
            int r0 = o.l.e.f26379r
            int r1 = r0 + 109
            int r0 = r1 % 128
            o.l.e.f26374l = r0
            int r1 = r1 % r8
            r7 = 0
            if (r1 == 0) goto L1c
            boolean r1 = r4.f26384i
            r0 = 57
            int r0 = r0 / r3
            if (r1 != 0) goto L21
        L1b:
            return r7
        L1c:
            boolean r0 = r4.f26384i
            if (r0 != 0) goto L21
            goto L1b
        L21:
            boolean r0 = o.ea.f.a()
            r6 = 1
            r0 = r0 ^ r6
            if (r0 == r6) goto L62
            int r0 = o.l.e.f26379r
            int r1 = r0 + 69
            int r0 = r1 % 128
            o.l.e.f26374l = r0
            int r1 = r1 % r8
            java.lang.String r5 = "땀麭鋽厤ᡍ叁᪫뀯㿮㻝㜙㎸䵝ﳙ"
            java.lang.String r2 = "廰뫙놭뾇⎿뤾\u0991ꋓᔮ⯂묱牳痥躒ꚩ屮겈꺡ꚩ屮ۂ皿捽䈾⎿뤾\u0cdf\ufdd1偨吾ꚩ屮㯡⠚ꦨ뼭"
            if (r1 == 0) goto L7c
            r1 = 67
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r6)
            int r1 = r1 << r0
            java.lang.Object[] r0 = new java.lang.Object[r6]
            q(r2, r1, r0)
            r0 = r0[r3]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = r0.intern()
            int r0 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = r0 * 68
            java.lang.Object[] r0 = new java.lang.Object[r6]
            q(r5, r1, r0)
            r0 = r0[r3]
        L59:
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            o.ea.f.c(r2, r0)
        L62:
            o.l.c r3 = r4.f26385j
            int r2 = fr.antelop.sdk.R.id.container
            android.os.CancellationSignal r1 = r4.f26381c
            o.l.e$3 r0 = new o.l.e$3
            r0.<init>()
            r3.e(r4, r2, r1, r0)
            int r0 = o.l.e.f26379r
            int r1 = r0 + 31
            int r0 = r1 % 128
            o.l.e.f26374l = r0
            int r1 = r1 % r8
            if (r1 != 0) goto L9d
            return r7
        L7c:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
            int r1 = r0 + 36
            java.lang.Object[] r0 = new java.lang.Object[r6]
            q(r2, r1, r0)
            r0 = r0[r3]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = r0.intern()
            int r0 = android.view.View.MeasureSpec.getSize(r3)
            int r1 = r0 + 13
            java.lang.Object[] r0 = new java.lang.Object[r6]
            q(r5, r1, r0)
            r0 = r0[r3]
            goto L59
        L9d:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.l.e.a(java.lang.Object[]):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26374l + 61;
        f26379r = i3 % 128;
        int i4 = i3 % 2;
        if (f.a()) {
            Object[] objArr = new Object[1];
            q("廰뫙놭뾇⎿뤾\u0991ꋓᔮ⯂묱牳痥躒ꚩ屮겈꺡ꚩ屮ۂ皿捽䈾⎿뤾\u0cdf\ufdd1偨吾ꚩ屮㯡⠚ꦨ뼭", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 36, objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            q("ۂ皿\uf68b曦⸨\ufada匁턌鸢늪櫵虍", (ViewConfiguration.getWindowTouchSlop() >> 8) + 11, objArr2);
            StringBuilder sbAppend = sb.append(((String) objArr2[0]).intern());
            Object[] objArr3 = {this.f26385j};
            int i5 = c.f26344j * 1328650834;
            c.f26344j = i5;
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i6 = 888483883 * c.f26341g;
            c.f26341g = i6;
            int i7 = (-671371960) * c.f26340f;
            c.f26340f = i7;
            f.c(strIntern, sbAppend.append((String) c.b(i6, i7, elapsedCpuTime, 1230426459, objArr3, -1230426456, i5)).toString());
        }
        finish();
        int i8 = f26374l + 25;
        f26379r = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 77 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01dd A[LOOP:1: B:33:0x01d7->B:35:0x01dd, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(android.content.Intent r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 602
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.l.e.a(android.content.Intent):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ WindowInsetsCompat d(View view, WindowInsetsCompat windowInsetsCompat) {
        WindowInsetsCompat windowInsetsCompat2;
        int i2 = 2 % 2;
        int i3 = f26374l + 47;
        f26379r = i3 % 128;
        if (i3 % 2 == 0) {
            Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.topMargin = insets.top;
            marginLayoutParams.bottomMargin = insets.bottom;
            view.setLayoutParams(marginLayoutParams);
            windowInsetsCompat2 = WindowInsetsCompat.CONSUMED;
            int i4 = 51 / 0;
        } else {
            Insets insets2 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams2.topMargin = insets2.top;
            marginLayoutParams2.bottomMargin = insets2.bottom;
            view.setLayoutParams(marginLayoutParams2);
            windowInsetsCompat2 = WindowInsetsCompat.CONSUMED;
        }
        int i5 = f26379r + 11;
        f26374l = i5 % 128;
        int i6 = i5 % 2;
        return windowInsetsCompat2;
    }

    static void d() {
        f26371f = (char) 49791;
        f26377o = (char) 32698;
        f26376n = (char) 18965;
        f26373k = (char) 61245;
        f26375m = -1270219297;
    }

    private static /* synthetic */ Object e(Object[] objArr) throws Throwable {
        e eVar = (e) objArr[0];
        int i2 = 2 % 2;
        int i3 = f26379r + 95;
        f26374l = i3 % 128;
        int i4 = i3 % 2;
        super.onResume();
        if (f.a()) {
            Object[] objArr2 = new Object[1];
            q("廰뫙놭뾇⎿뤾\u0991ꋓᔮ⯂묱牳痥躒ꚩ屮겈꺡ꚩ屮ۂ皿捽䈾⎿뤾\u0cdf\ufdd1偨吾ꚩ屮㯡⠚ꦨ뼭", 36 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr2);
            String strIntern = ((String) objArr2[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr3 = new Object[1];
            t((ViewConfiguration.getDoubleTapTimeout() >> 16) + 11, "\u001d\u000f￼\u0018\u0019ￊￗￊ\u000f\u0017\u001f", true, 282 - TextUtils.indexOf("", "", 0), 4 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr3);
            f.c(strIntern, sb.append(((String) objArr3[0]).intern()).append(eVar.f26384i).toString());
        }
        Object obj = null;
        if (eVar.f26384i && eVar.f26383h == null) {
            try {
                WalletManager walletManager = new WalletManager(eVar, null);
                eVar.f26383h = walletManager;
                walletManager.connect();
                int i5 = f26374l + 85;
                f26379r = i5 % 128;
                if (i5 % 2 != 0) {
                    return null;
                }
                obj.hashCode();
                throw null;
            } catch (WalletValidationException e2) {
                if (f.a()) {
                    Object[] objArr4 = new Object[1];
                    q("廰뫙놭뾇⎿뤾\u0991ꋓᔮ⯂묱牳痥躒ꚩ屮겈꺡ꚩ屮ۂ皿捽䈾⎿뤾\u0cdf\ufdd1偨吾ꚩ屮㯡⠚ꦨ뼭", 35 - TextUtils.lastIndexOf("", '0', 0, 0), objArr4);
                    String strIntern2 = ((String) objArr4[0]).intern();
                    Object[] objArr5 = new Object[1];
                    q("ۂ皿擋ኲ䈰\ue4bb삼긾鸢늪쐪\ue1a8墹ੳ䇀揸뉲繢ⳙ\uf5f2쨗ꑅ悶䲺쮃譀죇ᕕ〾装Ᏺཌ쉫⊥墹ੳ齏䞡폱頋", View.MeasureSpec.getSize(0) + 39, objArr5);
                    f.e(strIntern2, ((String) objArr5[0]).intern(), e2);
                }
            }
        }
        return null;
    }

    private void e() throws Throwable {
        Object[] objArr = {this};
        int iMyPid = Process.myPid();
        int i2 = (-639615114) * f26368a;
        f26368a = i2;
        String strQd = Xg.qd("\\japnie0dtu4Hk}s\u0002u\u0002\bcx\u0004wtx", (short) (FB.Xd() ^ 15349), (short) (FB.Xd() ^ 6326));
        Class<?> cls = Class.forName(strQd);
        Class<?>[] clsArr = new Class[0];
        short sXd = (short) (C1607wl.Xd() ^ 13421);
        short sXd2 = (short) (C1607wl.Xd() ^ 6757);
        int[] iArr = new int["jZ&r3)}\u0018\u0016R<\u0006N\u0019\u001c]2\r".length()];
        QB qb = new QB("jZ&r3)}\u0018\u0016R<\u0006N\u0019\u001c]2\r");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(xuXd.CK(iKK) - ((i3 * sXd2) ^ sXd));
            i3++;
        }
        String str = new String(iArr, 0, i3);
        Context context = (Context) cls.getMethod(str, clsArr).invoke(null, null);
        String strXd = ZO.xd("(\f_/X", (short) (FB.Xd() ^ 16468), (short) (FB.Xd() ^ 13149));
        short sXd3 = (short) (OY.Xd() ^ 26092);
        short sXd4 = (short) (OY.Xd() ^ 32655);
        int[] iArr2 = new int["\"\b\u0017,3OikT9C\u0013x\u0001T1%doau8\f".length()];
        QB qb2 = new QB("\"\b\u0017,3OikT9C\u0013x\u0001T1%doau8\f");
        int i4 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i4] = xuXd2.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + (i4 * sXd4))) + xuXd2.CK(iKK2));
            i4++;
        }
        Class<?> cls2 = Class.forName(new String(iArr2, 0, i4));
        Class<?>[] clsArr2 = new Class[1];
        short sXd5 = (short) (Od.Xd() ^ (-26195));
        int[] iArr3 = new int["~.5w[m~\u001b6/X\u0016H?Zo".length()];
        QB qb3 = new QB("~.5w[m~\u001b6/X\u0016H?Zo");
        int i5 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i5] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i5 % C1561oA.Xd.length] ^ (sXd5 + i5)));
            i5++;
        }
        clsArr2[0] = Class.forName(new String(iArr3, 0, i5));
        Object[] objArr2 = {strXd};
        short sXd6 = (short) (Od.Xd() ^ (-22973));
        int[] iArr4 = new int["q __7fE0_r\t2a\\x\u0016".length()];
        QB qb4 = new QB("q __7fE0_r\t2a\\x\u0016");
        int i6 = 0;
        while (qb4.YK()) {
            int iKK4 = qb4.KK();
            Xu xuXd4 = Xu.Xd(iKK4);
            iArr4[i6] = xuXd4.fK((C1561oA.Xd[i6 % C1561oA.Xd.length] ^ ((sXd6 + sXd6) + i6)) + xuXd4.CK(iKK4));
            i6++;
        }
        Method method = cls2.getMethod(new String(iArr4, 0, i6), clsArr2);
        try {
            method.setAccessible(true);
            int streamMaxVolume = ((AudioManager) method.invoke(context, objArr2)).getStreamMaxVolume(3);
            Context context2 = (Context) Class.forName(strQd).getMethod(str, new Class[0]).invoke(null, null);
            short sXd7 = (short) (FB.Xd() ^ 25709);
            int[] iArr5 = new int["\u0003\u000f\u0004\u0011\r\u0006\u007fH|\b\u0006\u000bz\u0003\b@T\u007f}\u0003r\u0005\u007f".length()];
            QB qb5 = new QB("\u0003\u000f\u0004\u0011\r\u0006\u007fH|\b\u0006\u000bz\u0003\b@T\u007f}\u0003r\u0005\u007f");
            int i7 = 0;
            while (qb5.YK()) {
                int iKK5 = qb5.KK();
                Xu xuXd5 = Xu.Xd(iKK5);
                iArr5[i7] = xuXd5.fK(sXd7 + sXd7 + sXd7 + i7 + xuXd5.CK(iKK5));
                i7++;
            }
            Object[] objArr3 = new Object[0];
            Method method2 = Class.forName(new String(iArr5, 0, i7)).getMethod(C1593ug.zd("\"!1\u0010$3075'*9", (short) (ZN.Xd() ^ 3932), (short) (ZN.Xd() ^ 3769)), new Class[0]);
            try {
                method2.setAccessible(true);
                a(((Resources) method2.invoke(context2, objArr3)).getDisplayMetrics().widthPixels, i2, 69626986, objArr, iMyPid, -69626986, streamMaxVolume);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public static void e(Context context, c cVar, a aVar, CancellationSignal cancellationSignal) {
        int i2 = 2 % 2;
        int i3 = f26379r + 31;
        f26374l = i3 % 128;
        int i4 = i3 % 2;
        if (f.a()) {
            Object[] objArr = new Object[1];
            q(C1561oA.od("辒\ueb7a\ue24d\uf026呝\ue9db㨭퍮䗈屛\uebc9ꌊꙻ뼧휽贁\udd1a\udf32휹賽ɪꝌ鐉狉呉\ue9c7㵧㙘胮蓃휭賱汣墛\uda28\uefac", (short) (Od.Xd() ^ (-2054))), ImageFormat.getBitsPerPixel(0) + 37, objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            int doubleTapTimeout = 16 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
            Object[] objArr2 = new Object[1];
            short sXd = (short) (OY.Xd() ^ 14943);
            int[] iArr = new int["⊮జ\uf86d뤕綿뤴耟ᶤꕤꑔ鲑餱㣽\uf0bb줏Ꝙ".length()];
            QB qb = new QB("⊮జ\uf86d뤕綿뤴耟ᶤꕤꑔ鲑餱㣽\uf0bb줏Ꝙ");
            int i5 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i5] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i5));
                i5++;
            }
            q(new String(iArr, 0, i5), doubleTapTimeout, objArr2);
            StringBuilder sbAppend = sb.append(((String) objArr2[0]).intern());
            int i6 = c.f26344j * 1328650834;
            c.f26344j = i6;
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i7 = c.f26341g * 888483883;
            c.f26341g = i7;
            int i8 = c.f26340f * (-671371960);
            c.f26340f = i8;
            f.c(strIntern, sbAppend.append((String) c.b(i7, i8, elapsedCpuTime, 1230426459, new Object[]{cVar}, -1230426456, i6)).toString());
            int i9 = f26374l + 39;
            f26379r = i9 % 128;
            int i10 = i9 % 2;
        }
        Intent intent = new Intent(context, (Class<?>) e.class);
        Object[] objArr3 = new Object[1];
        t(59 - Color.blue(0), Wg.Zd("b+|X&o<\u000bi1\bYⱲlN\u0017\u0006Mỳ\u007fG\u001aoCႺQ3{S\u0017tM\uf53f眣\uf188牘\uec15滣\ue73d\ue114插\udd9d巬\ud8d0媎퍥喵W偱쫄䲒액䜭솂&밙㻝뜫}", (short) (C1633zX.Xd() ^ (-9352)), (short) (C1633zX.Xd() ^ (-6758))), false, 288 - Color.green(0), 57 - (KeyEvent.getMaxKeyCode() >> 16), objArr3);
        intent.putExtra(((String) objArr3[0]).intern(), cVar.b());
        f26369b.e(cVar, aVar, cancellationSignal);
        intent.addFlags(536870912);
        if (!(context instanceof Activity)) {
            int i11 = f26379r + 45;
            f26374l = i11 % 128;
            if (i11 % 2 != 0) {
                intent.addFlags(268435456);
                int i12 = 2 / 0;
            } else {
                intent.addFlags(268435456);
            }
        }
        CX.ud();
        Object[] objArr4 = {intent};
        Method method = Class.forName(C1561oA.Xd("O]Tca\\X#Yffm_ip+Annug{x", (short) (C1499aX.Xd() ^ (-24037)))).getMethod(Qg.kd("\u0016\u0016\u0002\u0012\u0013^\u007f\u0010\u0004\u0010\u0002\f\u0010", (short) (C1499aX.Xd() ^ (-13191)), (short) (C1499aX.Xd() ^ (-24190))), Class.forName(Wg.vd("\u0001\r\u0002\u000f\u000b\u0004}F\u000b\u0016\u0014\u0019\t\u0011\u0016Nx\u001d\"\u0012\u001a\u001f", (short) (C1633zX.Xd() ^ (-16429)))));
        try {
            method.setAccessible(true);
            method.invoke(context, objArr4);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static void init$0() {
        $$a = new byte[]{114, MessagePack.Code.FIXEXT8, -31, MessagePack.Code.FIXEXT4};
        $$b = 250;
    }

    private static void q(String str, int i2, Object[] objArr) throws Throwable {
        int i3;
        String str2 = str;
        int i4 = 2;
        int i5 = 2 % 2;
        int i6 = $10 + 51;
        $11 = i6 % 128;
        Object charArray = str2;
        if (i6 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (str2 != null) {
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        g gVar = new g();
        char[] cArr2 = new char[cArr.length];
        gVar.f19924d = 0;
        char[] cArr3 = new char[2];
        int i7 = $11 + 113;
        $10 = i7 % 128;
        int i8 = i7 % 2;
        while (gVar.f19924d < cArr.length) {
            int i9 = $11 + 113;
            $10 = i9 % 128;
            int i10 = 58224;
            if (i9 % i4 != 0) {
                cArr3[1] = cArr[gVar.f19924d];
                cArr3[0] = cArr[gVar.f19924d % 1];
                i3 = 1;
            } else {
                cArr3[0] = cArr[gVar.f19924d];
                cArr3[1] = cArr[gVar.f19924d + 1];
                i3 = 0;
            }
            while (i3 < 16) {
                int i11 = $10 + 85;
                $11 = i11 % 128;
                int i12 = i11 % i4;
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                int i13 = (c3 + i10) ^ ((c3 << 4) + ((char) (((long) f26376n) ^ (-7511683281764982996L))));
                int i14 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(f26373k);
                    objArr2[i4] = Integer.valueOf(i14);
                    objArr2[1] = Integer.valueOf(i13);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objA = o.d.d.a(1603517628);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a(270 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) Gravity.getAbsoluteGravity(0, 0), TextUtils.lastIndexOf("", '0') + 12, -1995022631, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i10) ^ ((cCharValue << 4) + ((char) (((long) f26371f) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f26377o)};
                    Object objA2 = o.d.d.a(1603517628);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = o.d.d.a((-16776946) - Color.rgb(0, 0, 0), (char) TextUtils.getOffsetBefore("", 0), ExpandableListView.getPackedPositionGroup(0L) + 11, -1995022631, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i10 -= 40503;
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
            Object objA3 = o.d.d.a(1390051551);
            if (objA3 == null) {
                byte b6 = (byte) 0;
                byte b7 = b6;
                objA3 = o.d.d.a(270 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (ViewConfiguration.getPressedStateDuration() >> 16), 11 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -2074123590, false, $$c(b6, b7, (byte) (b7 + 3)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
            int i15 = $11 + 63;
            $10 = i15 % 128;
            i4 = 2;
            if (i15 % 2 != 0) {
                int i16 = 5 % 4;
            }
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    private static void t(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
        Object obj;
        String str2 = str;
        int i5 = 2 % 2;
        if (str2 != null) {
            int i6 = $10 + 71;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            char[] charArray = str2.toCharArray();
            int i8 = $11 + 45;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            obj = charArray;
        } else {
            obj = str2;
        }
        char[] cArr = (char[]) obj;
        n nVar = new n();
        char[] cArr2 = new char[i2];
        nVar.f19944a = 0;
        while (nVar.f19944a < i2) {
            int i10 = $11 + 53;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            nVar.f19946e = cArr[nVar.f19944a];
            cArr2[nVar.f19944a] = (char) (i3 + nVar.f19946e);
            int i12 = nVar.f19944a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i12]), Integer.valueOf(f26375m)};
                Object objA = o.d.d.a(1376241034);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a(270 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (KeyEvent.getMaxKeyCode() >> 16), 11 - View.MeasureSpec.getMode(0), -2071844881, false, $$c(b2, b3, (byte) ((b3 + 46) - (46 & b3))), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i12] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nVar, nVar};
                Object objA2 = o.d.d.a(-202660535);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a(521 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) Color.argb(0, 0, 0, 0), ExpandableListView.getPackedPositionType(0L) + 12, 627984172, false, $$c(b4, b5, (byte) ((b5 + 44) - (44 & b5))), new Class[]{Object.class, Object.class});
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
            nVar.f19945b = i4;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - nVar.f19945b, nVar.f19945b);
            System.arraycopy(cArr3, nVar.f19945b, cArr2, 0, i2 - nVar.f19945b);
        }
        if (z2) {
            int i13 = $11 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            char[] cArr4 = new char[i2];
            nVar.f19944a = 0;
            while (nVar.f19944a < i2) {
                cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                Object[] objArr4 = {nVar, nVar};
                Object objA3 = o.d.d.a(-202660535);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA3 = o.d.d.a(522 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 12, 627984172, false, $$c(b6, b7, (byte) ((-1) - (((-1) - b7) & ((-1) - 44)))), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected final void attachBaseContext(Context context) {
        int i2 = 2 % 2;
        int i3 = f26374l + 113;
        f26379r = i3 % 128;
        if (i3 % 2 == 0) {
            super.attachBaseContext(LocaleManager.getInstance().getLocalizedContext(context));
            throw null;
        }
        super.attachBaseContext(LocaleManager.getInstance().getLocalizedContext(context));
        int i4 = f26374l + 73;
        f26379r = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 61 / 0;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        synchronized (C1553lQ.class) {
            short sXd = (short) (C1607wl.Xd() ^ (1961567666 ^ 1961565943));
            short sXd2 = (short) (C1607wl.Xd() ^ (2090122199 ^ 2090113369));
            int[] iArr = new int["Q>\u0004A%".length()];
            QB qb = new QB("Q>\u0004A%");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
                i2++;
            }
            String str = new String(iArr, 0, i2);
            String strUd = C1561oA.ud("\u0010|", (short) (ZN.Xd() ^ ((2142848275 ^ 1124804375) ^ 1018329709)));
            try {
                Class<?> cls = Class.forName(str);
                Field field = 0 != 0 ? cls.getField(strUd) : cls.getDeclaredField(strUd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strYd = C1561oA.yd("ve)hR", (short) (C1499aX.Xd() ^ ((1731165495 ^ 1200743173) ^ (-549368268))));
                short sXd3 = (short) (C1499aX.Xd() ^ ((706241876 ^ 1229383269) ^ (-1667169108)));
                int[] iArr2 = new int["\tv".length()];
                QB qb2 = new QB("\tv");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd3 + sXd3) + sXd3) + i3));
                    i3++;
                }
                String str2 = new String(iArr2, 0, i3);
                try {
                    Class<?> cls2 = Class.forName(strYd);
                    Field field2 = 0 != 0 ? cls2.getField(str2) : cls2.getDeclaredField(str2);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strQd = Xg.qd("*\u0019` \u0006", (short) (C1499aX.Xd() ^ ((1503634936 ^ 989812875) ^ (-1667272540))), (short) (C1499aX.Xd() ^ (1155215060 ^ (-1155213201))));
                    String strWd = Jg.Wd("Ms", (short) (ZN.Xd() ^ (682460974 ^ 682479408)), (short) (ZN.Xd() ^ (636125699 ^ 636143465)));
                    try {
                        Class<?> cls3 = Class.forName(strQd);
                        Field field3 = 0 != 0 ? cls3.getField(strWd) : cls3.getDeclaredField(strWd);
                        field3.setAccessible(true);
                        obj3 = field3.get(null);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    if (((WindowManager) obj3) == null) {
                        Class<?> cls4 = Class.forName(ZO.xd("8\u007fJ5l", (short) (C1633zX.Xd() ^ (1269175398 ^ (-1269183211))), (short) (C1633zX.Xd() ^ ((1517827474 ^ 767186991) ^ (-2009227226)))));
                        Class<?>[] clsArr = new Class[0];
                        Object[] objArr = new Object[0];
                        short sXd4 = (short) (ZN.Xd() ^ ((304760725 ^ 664609222) ^ 901210065));
                        short sXd5 = (short) (ZN.Xd() ^ (1593123373 ^ 1593125473));
                        int[] iArr3 = new int["V`".length()];
                        QB qb3 = new QB("V`");
                        int i4 = 0;
                        while (qb3.YK()) {
                            int iKK3 = qb3.KK();
                            Xu xuXd3 = Xu.Xd(iKK3);
                            iArr3[i4] = xuXd3.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd4 + sXd4) + (i4 * sXd5))) + xuXd3.CK(iKK3));
                            i4++;
                        }
                        Method declaredMethod = cls4.getDeclaredMethod(new String(iArr3, 0, i4), clsArr);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                Object[] objArr2 = {Ig.wd("`\u00056MF\u0012", (short) (C1499aX.Xd() ^ (475083303 ^ (-475078246))))};
                                Method method = Class.forName(EO.Od("<\u007fYF\\\u001b8\f\u0014byc\u0003\u007f\u00146o,U\"U\u0017v", (short) (C1607wl.Xd() ^ (1985777106 ^ 1985776043)))).getMethod(C1593ug.zd("\u001a\u0019)\t0+-\u001f(\u000f\"05)$'", (short) (C1633zX.Xd() ^ ((1560812850 ^ 1652442437) ^ (-1064718163))), (short) (C1633zX.Xd() ^ ((249564731 ^ 726196854) ^ (-631801445)))), Class.forName(C1561oA.Qd("PFZD\u0010MAME\u000b/OLBF>", (short) (Od.Xd() ^ ((1480558529 ^ 1138034338) ^ (-468358270))))));
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    short sXd6 = (short) (C1633zX.Xd() ^ (1961009656 ^ (-1961005995)));
                                    int[] iArr4 = new int["Q>\u0004A%".length()];
                                    QB qb4 = new QB("Q>\u0004A%");
                                    int i5 = 0;
                                    while (qb4.YK()) {
                                        int iKK4 = qb4.KK();
                                        Xu xuXd4 = Xu.Xd(iKK4);
                                        iArr4[i5] = xuXd4.fK(sXd6 + sXd6 + i5 + xuXd4.CK(iKK4));
                                        i5++;
                                    }
                                    String str3 = new String(iArr4, 0, i5);
                                    short sXd7 = (short) (C1607wl.Xd() ^ (1729994345 ^ 1729995545));
                                    int[] iArr5 = new int["\u007fu".length()];
                                    QB qb5 = new QB("\u007fu");
                                    int i6 = 0;
                                    while (qb5.YK()) {
                                        int iKK5 = qb5.KK();
                                        Xu xuXd5 = Xu.Xd(iKK5);
                                        iArr5[i6] = xuXd5.fK(xuXd5.CK(iKK5) - ((sXd7 + sXd7) + i6));
                                        i6++;
                                    }
                                    String str4 = new String(iArr5, 0, i6);
                                    try {
                                        Class<?> cls5 = Class.forName(str3);
                                        Field field4 = 0 != 0 ? cls5.getField(str4) : cls5.getDeclaredField(str4);
                                        field4.setAccessible(true);
                                        field4.set(null, windowManager);
                                    } catch (Throwable th4) {
                                    }
                                } catch (InvocationTargetException e2) {
                                    throw e2.getCause();
                                }
                            }
                        } catch (InvocationTargetException e3) {
                            throw e3.getCause();
                        }
                    }
                    String strZd = Wg.Zd("\u0018JU8_", (short) (Od.Xd() ^ (228901143 ^ (-228889171))), (short) (Od.Xd() ^ (1151378118 ^ (-1151375436))));
                    String strXd = C1561oA.Xd("\u001e\u0014", (short) (C1499aX.Xd() ^ (1749045442 ^ (-1749025558))));
                    try {
                        Class<?> cls6 = Class.forName(strZd);
                        Field field5 = 0 != 0 ? cls6.getField(strXd) : cls6.getDeclaredField(strXd);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        short sXd8 = (short) (Od.Xd() ^ (252933133 ^ (-252923536)));
                        int[] iArr6 = new int[".\u001b`\u001e\u0002".length()];
                        QB qb6 = new QB(".\u001b`\u001e\u0002");
                        int i7 = 0;
                        while (qb6.YK()) {
                            int iKK6 = qb6.KK();
                            Xu xuXd6 = Xu.Xd(iKK6);
                            iArr6[i7] = xuXd6.fK((sXd8 ^ i7) + xuXd6.CK(iKK6));
                            i7++;
                        }
                        String str5 = new String(iArr6, 0, i7);
                        String strKd = Qg.kd("YM", (short) (FB.Xd() ^ (1314572927 ^ 1314560283)), (short) (FB.Xd() ^ ((631575248 ^ 469751478) ^ 1046128245)));
                        try {
                            Class<?> cls7 = Class.forName(str5);
                            Field field6 = 0 != 0 ? cls7.getField(strKd) : cls7.getDeclaredField(strKd);
                            field6.setAccessible(true);
                            obj5 = field6.get(null);
                        } catch (Throwable th6) {
                            obj5 = null;
                        }
                        ((WindowManager) obj5).getDefaultDisplay().getMetrics(displayMetrics);
                        int x2 = (int) motionEvent.getX();
                        int y2 = (int) motionEvent.getY();
                        int i8 = 231033955 ^ 231033896;
                        if (x2 > i8 && x2 < displayMetrics.widthPixels - i8 && y2 > i8 && y2 < displayMetrics.heightPixels - i8) {
                            C1553lQ.vd(motionEvent);
                            C1553lQ.Od(motionEvent);
                        }
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26374l + 51;
        f26379r = i3 % 128;
        int i4 = i3 % 2;
        if (f.a()) {
            int i5 = f26374l + 93;
            f26379r = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr = new Object[1];
            q("廰뫙놭뾇⎿뤾\u0991ꋓᔮ⯂묱牳痥躒ꚩ屮겈꺡ꚩ屮ۂ皿捽䈾⎿뤾\u0cdf\ufdd1偨吾ꚩ屮㯡⠚ꦨ뼭", 36 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            t((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 8, "\u000e\uffff\t\b\uffdd\f\uffff\ufffb", false, ExpandableListView.getPackedPositionGroup(0L) + 298, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1, objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
        }
        getWindow().addFlags(524288);
        getWindow().addFlags(2097152);
        getWindow().addFlags(4194304);
        getWindow().addFlags(128);
        super.onCreate(bundle);
        if (o.bk.b.e()) {
            int i7 = f26374l + 23;
            f26379r = i7 % 128;
            if (i7 % 2 == 0) {
                o.eb.a.c(this);
                int i8 = 26 / 0;
            } else {
                o.eb.a.c(this);
            }
        }
        if (Build.VERSION.SDK_INT != 26) {
            int i9 = f26374l + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f26379r = i9 % 128;
            int i10 = i9 % 2;
            setRequestedOrientation(1);
        }
        a(getIntent());
        setContentView(R.layout.antelop_activity_authentication_method_prompt);
        getWindow().getDecorView().setLayoutDirection(0);
        ViewCompat.setOnApplyWindowInsetsListener((FrameLayout) findViewById(R.id.container), new OnApplyWindowInsetsListener() { // from class: o.l.e$$ExternalSyntheticLambda1
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return e.d(view, windowInsetsCompat);
            }
        });
        this.f26384i = true;
        getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback() { // from class: o.l.e.1
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static int $10 = 0;
            private static int $11 = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static char[] f26386c = null;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f26387d = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f26388e = 0;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:5:0x0015). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static java.lang.String $$c(int r9, int r10, int r11) {
                /*
                    int r0 = r11 * 4
                    int r8 = r0 + 116
                    int r0 = r10 * 3
                    int r7 = 4 - r0
                    byte[] r6 = o.l.e.AnonymousClass1.$$a
                    int r0 = r9 * 3
                    int r5 = r0 + 1
                    byte[] r4 = new byte[r5]
                    r3 = 0
                    if (r6 != 0) goto L2d
                    r2 = r3
                    r1 = r7
                L15:
                    int r7 = r7 + r8
                    int r0 = r1 + 1
                    r1 = r2
                    r8 = r7
                    r7 = r0
                L1b:
                    byte r0 = (byte) r8
                    int r2 = r1 + 1
                    r4[r1] = r0
                    if (r2 != r5) goto L28
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r4, r3)
                    return r0
                L28:
                    r0 = r6[r7]
                    r1 = r7
                    r7 = r0
                    goto L15
                L2d:
                    r1 = r3
                    goto L1b
                */
                throw new UnsupportedOperationException("Method not decompiled: o.l.e.AnonymousClass1.$$c(int, int, int):java.lang.String");
            }

            static {
                init$0();
                $10 = 0;
                $11 = 1;
                f26387d = 0;
                f26388e = 1;
                f26386c = new char[]{56508, 56566, 56558, 56559, 56559, 56558, 56555, 56530, 56538, 56562, 56558, 56558, 56560, 56545, 56543, 56558, 56556, 56558, 56554, 56546, 56550, 56558, 56561, 56553, 56550, 56558, 56564, 56539, 56537, 56555, 56553, 56558, 56561, 56563, 56564, 56540, 56503, 56558, 56536, 56529, 56546, 56551, 56541, 56545, 56555, 56556, 56563, 56556, 56548};
            }

            private static void f(String str, int[] iArr, boolean z2, Object[] objArr3) throws Throwable {
                int i11;
                String str2 = str;
                int i12 = 2 % 2;
                Object obj = null;
                Object obj2 = str2;
                if (str2 != null) {
                    int i13 = $11 + 67;
                    $10 = i13 % 128;
                    if (i13 % 2 != 0) {
                        str2.getBytes("ISO-8859-1");
                        obj.hashCode();
                        throw null;
                    }
                    byte[] bytes = str2.getBytes("ISO-8859-1");
                    int i14 = $10 + 15;
                    $11 = i14 % 128;
                    int i15 = i14 % 2;
                    obj2 = bytes;
                }
                byte[] bArr = (byte[]) obj2;
                m mVar = new m();
                int i16 = 0;
                int i17 = iArr[0];
                int i18 = iArr[1];
                int i19 = iArr[2];
                int i20 = iArr[3];
                char[] cArr = f26386c;
                if (cArr != null) {
                    int length = cArr.length;
                    char[] cArr2 = new char[length];
                    int i21 = $11 + 109;
                    $10 = i21 % 128;
                    int i22 = i21 % 2;
                    int i23 = 0;
                    while (i23 < length) {
                        try {
                            Object[] objArr4 = {Integer.valueOf(cArr[i23])};
                            Object objA = o.d.d.a(-2071388435);
                            if (objA == null) {
                                byte b2 = (byte) i16;
                                byte b3 = b2;
                                objA = o.d.d.a(249 - (ViewConfiguration.getTouchSlop() >> 8), (char) (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getPressedStateDuration() >> 16) + 11, 1376582792, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            cArr2[i23] = ((Character) ((Method) objA).invoke(null, objArr4)).charValue();
                            i23++;
                            i16 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr = cArr2;
                }
                char[] cArr3 = new char[i18];
                System.arraycopy(cArr, i17, cArr3, 0, i18);
                if (bArr != null) {
                    char[] cArr4 = new char[i18];
                    mVar.f19943d = 0;
                    char c2 = 0;
                    while (mVar.f19943d < i18) {
                        int i24 = $10 + 69;
                        $11 = i24 % 128;
                        if (i24 % 2 != 0 ? bArr[mVar.f19943d] != 1 : bArr[mVar.f19943d] != 1) {
                            int i25 = mVar.f19943d;
                            Object[] objArr5 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                            Object objA2 = o.d.d.a(1632715197);
                            if (objA2 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objA2 = o.d.d.a(836 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 27278), KeyEvent.getDeadChar(0, 0) + 11, -1210801192, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i25] = ((Character) ((Method) objA2).invoke(null, objArr5)).charValue();
                        } else {
                            int i26 = $10 + 29;
                            $11 = i26 % 128;
                            if (i26 % 2 == 0) {
                                int i27 = mVar.f19943d;
                                Object[] objArr6 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                                Object objA3 = o.d.d.a(120026474);
                                if (objA3 == null) {
                                    objA3 = o.d.d.a(11 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) Color.argb(0, 0, 0, 0), 10 - ExpandableListView.getPackedPositionType(0L), -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                cArr4[i27] = ((Character) ((Method) objA3).invoke(null, objArr6)).charValue();
                                int i28 = 10 / 0;
                            } else {
                                int i29 = mVar.f19943d;
                                Object[] objArr7 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                                Object objA4 = o.d.d.a(120026474);
                                if (objA4 == null) {
                                    objA4 = o.d.d.a(11 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (TextUtils.lastIndexOf("", '0', 0) + 1), 10 - Drawable.resolveOpacity(0, 0), -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                cArr4[i29] = ((Character) ((Method) objA4).invoke(null, objArr7)).charValue();
                            }
                        }
                        c2 = cArr4[mVar.f19943d];
                        Object[] objArr8 = {mVar, mVar};
                        Object objA5 = o.d.d.a(-1041906996);
                        if (objA5 == null) {
                            objA5 = o.d.d.a(21 - KeyEvent.getDeadChar(0, 0), (char) (TextUtils.indexOf((CharSequence) "", '0') + 35716), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 12, 392175785, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objA5).invoke(null, objArr8);
                    }
                    cArr3 = cArr4;
                }
                if (i20 > 0) {
                    char[] cArr5 = new char[i18];
                    i11 = 0;
                    System.arraycopy(cArr3, 0, cArr5, 0, i18);
                    int i30 = i18 - i20;
                    System.arraycopy(cArr5, 0, cArr3, i30, i20);
                    System.arraycopy(cArr5, i20, cArr3, 0, i30);
                } else {
                    i11 = 0;
                }
                if (z2) {
                    char[] cArr6 = new char[i18];
                    mVar.f19943d = i11;
                    while (mVar.f19943d < i18) {
                        cArr6[mVar.f19943d] = cArr3[(i18 - mVar.f19943d) - 1];
                        mVar.f19943d++;
                        int i31 = $10 + 87;
                        $11 = i31 % 128;
                        int i32 = i31 % 2;
                    }
                    cArr3 = cArr6;
                }
                if (i19 > 0) {
                    int i33 = $10 + 31;
                    $11 = i33 % 128;
                    int i34 = i33 % 2;
                    int i35 = 0;
                    while (true) {
                        mVar.f19943d = i35;
                        if (mVar.f19943d >= i18) {
                            break;
                        }
                        cArr3[mVar.f19943d] = (char) (cArr3[mVar.f19943d] - iArr[2]);
                        i35 = mVar.f19943d + 1;
                    }
                }
                objArr3[0] = new String(cArr3);
            }

            static void init$0() {
                $$a = new byte[]{112, 68, MessagePack.Code.BIN8, -81};
                $$b = 219;
            }

            @Override // androidx.activity.OnBackPressedCallback
            public final void handleOnBackPressed() throws Throwable {
                int i11 = 2 % 2;
                int i12 = f26387d + 69;
                f26388e = i12 % 128;
                int i13 = i12 % 2;
                if (f.a()) {
                    int i14 = f26387d + 47;
                    f26388e = i14 % 128;
                    int i15 = i14 % 2;
                    Object[] objArr3 = new Object[1];
                    f("\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000", new int[]{0, 36, 0, 0}, true, objArr3);
                    String strIntern2 = ((String) objArr3[0]).intern();
                    Object[] objArr4 = new Object[1];
                    f("\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001", new int[]{36, 13, 0, 0}, false, objArr4);
                    f.c(strIntern2, ((String) objArr4[0]).intern());
                    int i16 = f26388e + 47;
                    f26387d = i16 % 128;
                    int i17 = i16 % 2;
                }
                e.this.finish();
                b.c cVarE = e.f26369b.e(e.this.f26382e);
                if (e.this.f26381c != null && !e.this.f26381c.isCanceled()) {
                    e.this.f26381c.cancel();
                }
                if (cVarE != null) {
                    int i18 = f26387d + 65;
                    f26388e = i18 % 128;
                    int i19 = i18 % 2;
                    cVarE.d().c(d.f26353b, cVarE.a());
                }
            }
        });
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected final void onDestroy() throws Throwable {
        String strIntern;
        Object obj;
        int i2 = 2 % 2;
        int i3 = f26379r + 73;
        f26374l = i3 % 128;
        if (i3 % 2 != 0) {
            super.onDestroy();
            f.a();
            throw null;
        }
        super.onDestroy();
        if (f.a()) {
            int i4 = f26374l + 121;
            f26379r = i4 % 128;
            if (i4 % 2 == 0) {
                Object[] objArr = new Object[1];
                q("廰뫙놭뾇⎿뤾\u0991ꋓᔮ⯂묱牳痥躒ꚩ屮겈꺡ꚩ屮ۂ皿捽䈾⎿뤾\u0cdf\ufdd1偨吾ꚩ屮㯡⠚ꦨ뼭", 89 << Color.red(0), objArr);
                strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                q("ۂ皿뷘虈놭뾇㿮㻝ᛴ蜎", 49 >>> ExpandableListView.getPackedPositionGroup(1L), objArr2);
                obj = objArr2[0];
            } else {
                Object[] objArr3 = new Object[1];
                q("廰뫙놭뾇⎿뤾\u0991ꋓᔮ⯂묱牳痥躒ꚩ屮겈꺡ꚩ屮ۂ皿捽䈾⎿뤾\u0cdf\ufdd1偨吾ꚩ屮㯡⠚ꦨ뼭", 36 - Color.red(0), objArr3);
                strIntern = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                q("ۂ皿뷘虈놭뾇㿮㻝ᛴ蜎", 9 - ExpandableListView.getPackedPositionGroup(0L), objArr4);
                obj = objArr4[0];
            }
            f.c(strIntern, ((String) obj).intern());
        }
        WalletManager walletManager = this.f26383h;
        if (walletManager != null) {
            walletManager.disconnect();
            this.f26383h = null;
        }
        CancellationSignal cancellationSignal = this.f26381c;
        if (cancellationSignal != null) {
            cancellationSignal.setOnCancelListener(null);
        }
        f26369b.e(this.f26382e);
        this.f26385j = null;
        this.f26381c = null;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected final void onNewIntent(Intent intent) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26374l + 85;
        f26379r = i3 % 128;
        int i4 = i3 % 2;
        super.onNewIntent(intent);
        if (f.a()) {
            int i5 = f26379r + 111;
            f26374l = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 35 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            Object[] objArr = new Object[1];
            short sXd = (short) (OY.Xd() ^ 25031);
            short sXd2 = (short) (OY.Xd() ^ 22126);
            int[] iArr = new int["輻\ueb23\ue1f6\uefcf吆\ue984㧖팗䕱射\ueb72ꊳ꘤뻐훦貪\udcc3\udedb훢貦ȓ꛵鎲牲史\ue970㴐㘁肗葬훖貚氌塄\ud9d1\uef55".length()];
            QB qb = new QB("輻\ueb23\ue1f6\uefcf吆\ue984㧖팗䕱射\ueb72ꊳ꘤뻐훦貪\udcc3\udedb훢貦ȓ꛵鎲牲史\ue970㴐㘁肗葬훖貚氌塄\ud9d1\uef55");
            int i8 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i8] = xuXd.fK(sXd + i8 + xuXd.CK(iKK) + sXd2);
                i8++;
            }
            q(new String(iArr, 0, i8), i7, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            t(11 - (KeyEvent.getMaxKeyCode() >> 16), C1561oA.ud("n\uf07b\uf063bbf_\uf075c\\\uf056", (short) (Od.Xd() ^ (-25644))), true, (ViewConfiguration.getTapTimeout() >> 16) + 300, 5 - Color.alpha(0), objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
            int i9 = f26379r + 33;
            f26374l = i9 % 128;
            int i10 = i9 % 2;
        }
        this.f26384i = true;
        a(intent);
        Object[] objArr3 = {this};
        int iMyPid = Process.myPid();
        int i11 = f26368a * (-639615114);
        f26368a = i11;
        short sXd3 = (short) (C1499aX.Xd() ^ (-14855));
        int[] iArr2 = new int["2>7D<53{:HK\b\u00167K?7)7;\u0011$1#*,".length()];
        QB qb2 = new QB("2>7D<53{:HK\b\u00167K?7)7;\u0011$1#*,");
        int i12 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i12] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 ^ i12));
            i12++;
        }
        String str = new String(iArr2, 0, i12);
        String strYd = C1561oA.Yd("K^\\]Q[b0`a^\\WVj`gg", (short) (ZN.Xd() ^ 11552));
        Context context = (Context) Class.forName(str).getMethod(strYd, new Class[0]).invoke(null, null);
        String strQd = Xg.qd("&;+18", (short) (C1633zX.Xd() ^ (-27885)), (short) (C1633zX.Xd() ^ (-3176)));
        Class<?> cls = Class.forName(Jg.Wd("\u000f;5\trl*\u0018\n[zE\u0001.9s%TW\u0002{S4", (short) (OY.Xd() ^ 24755), (short) (OY.Xd() ^ 28033)));
        Class<?>[] clsArr = new Class[1];
        short sXd4 = (short) (ZN.Xd() ^ 24132);
        short sXd5 = (short) (ZN.Xd() ^ 8291);
        int[] iArr3 = new int["aowJ4p!\u0018c\u0015\u0016Dbb5s".length()];
        QB qb3 = new QB("aowJ4p!\u0018c\u0015\u0016Dbb5s");
        int i13 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i13] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i13 % C1561oA.Xd.length] ^ ((i13 * sXd5) + sXd4)));
            i13++;
        }
        clsArr[0] = Class.forName(new String(iArr3, 0, i13));
        Object[] objArr4 = {strQd};
        Method method = cls.getMethod(C1626yg.Ud("\u001e\u00019I!GW@e/][\u000bq[q", (short) (FB.Xd() ^ 2086), (short) (FB.Xd() ^ 11861)), clsArr);
        try {
            method.setAccessible(true);
            int streamMaxVolume = ((AudioManager) method.invoke(context, objArr4)).getStreamMaxVolume(3);
            Context context2 = (Context) Class.forName(str).getMethod(strYd, new Class[0]).invoke(null, null);
            Object[] objArr5 = new Object[0];
            Method method2 = Class.forName(Ig.wd("lC\ty\u001dQbjHC>,QbFdL\\\"R\feA", (short) (C1633zX.Xd() ^ (-22289)))).getMethod(EO.Od("P{;?E\b]^\u0002%+Q", (short) (OY.Xd() ^ TypedValues.MotionType.TYPE_ANIMATE_CIRCLEANGLE_TO)), new Class[0]);
            try {
                method2.setAccessible(true);
                a(((Resources) method2.invoke(context2, objArr5)).getDisplayMetrics().widthPixels, i11, 69626986, objArr3, iMyPid, -69626986, streamMaxVolume);
                this.f26384i = false;
                int i14 = f26379r + 5;
                f26374l = i14 % 128;
                int i15 = i14 % 2;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected final void onPause() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26374l + 95;
        f26379r = i3 % 128;
        if (i3 % 2 == 0) {
            super.onPause();
            f.a();
            throw null;
        }
        super.onPause();
        if (f.a()) {
            int i4 = f26374l + 39;
            f26379r = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            q("廰뫙놭뾇⎿뤾\u0991ꋓᔮ⯂묱牳痥躒ꚩ屮겈꺡ꚩ屮ۂ皿捽䈾⎿뤾\u0cdf\ufdd1偨吾ꚩ屮㯡⠚ꦨ뼭", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 35, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            t(View.MeasureSpec.makeMeasureSpec(0, 0) + 7, "\u0007�\u000b\r\ufff9￨\u0006", true, (ViewConfiguration.getWindowTouchSlop() >> 8) + 300, TextUtils.getTrimmedLength("") + 1, objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
        }
        if (this.f26384i) {
            overridePendingTransition(0, 0);
            int i6 = f26379r + 113;
            f26374l = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 25 / 0;
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected final void onResume() throws Throwable {
        Object[] objArr = {this};
        int i2 = f26370d * 1007507385;
        f26370d = i2;
        int i3 = (-1583828788) * f26372g;
        f26372g = i3;
        String strQd = C1561oA.Qd("FRGTPIC\f>LK\b\u001a;K?K=GK%8A3.0", (short) (FB.Xd() ^ 13539));
        String strZd = C1593ug.zd("`sqrfpwEuvsqlk\u007fu||", (short) (C1580rY.Xd() ^ (-18131)), (short) (C1580rY.Xd() ^ (-20301)));
        Context context = (Context) Class.forName(strQd).getMethod(strZd, new Class[0]).invoke(null, null);
        short sXd = (short) (ZN.Xd() ^ 780);
        int[] iArr = new int["o{p}yrl5itrwgot-Aljo_ql".length()];
        QB qb = new QB("o{p}yrl5itrwgot-Aljo_ql");
        int i4 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i4] = xuXd.fK(sXd + sXd + i4 + xuXd.CK(iKK));
            i4++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i4));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr2 = new Object[0];
        short sXd2 = (short) (FB.Xd() ^ 9995);
        int[] iArr2 = new int["zy\nh|\f\t\u0010\u000e\u007f\u0003\u0012".length()];
        QB qb2 = new QB("zy\nh|\f\t\u0010\u000e\u007f\u0003\u0012");
        int i5 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i5] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd2 + sXd2) + i5));
            i5++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i5), clsArr);
        try {
            method.setAccessible(true);
            int i6 = ((Resources) method.invoke(context, objArr2)).getConfiguration().screenHeightDp;
            Context context2 = (Context) Class.forName(strQd).getMethod(strZd, new Class[0]).invoke(null, null);
            Object[] objArr3 = new Object[0];
            Method method2 = Class.forName(Wg.Zd("W\u0019O\u0002?U\t\u000fl5T\u000f@m4\nW@_*;\u0003?", (short) (OY.Xd() ^ 3350), (short) (OY.Xd() ^ 19409))).getMethod(C1561oA.Xd("A@P/CROVTFIX", (short) (C1580rY.Xd() ^ (-4434))), new Class[0]);
            try {
                method2.setAccessible(true);
                a(((Resources) method2.invoke(context2, objArr3)).getConfiguration().smallestScreenWidthDp, i3, -864035473, objArr, i2, 864035474, i6);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected final void onStart() throws Throwable {
        int i2 = 2 % 2;
        super.onStart();
        if (f.a()) {
            Object[] objArr = new Object[1];
            q("廰뫙놭뾇⎿뤾\u0991ꋓᔮ⯂묱牳痥躒ꚩ屮겈꺡ꚩ屮ۂ皿捽䈾⎿뤾\u0cdf\ufdd1偨吾ꚩ屮㯡⠚ꦨ뼭", (ViewConfiguration.getJumpTapTimeout() >> 16) + 36, objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            t(Color.rgb(0, 0, 0) + 16777226, "\u001f\u001d\f\u001f\ufffe\u0019\u001aￋ\uffd8ￋ", true, TextUtils.indexOf("", "", 0) + 281, 8 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr2);
            f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(getIntent()).toString());
            int i3 = f26374l + 99;
            f26379r = i3 % 128;
            int i4 = i3 % 2;
        }
        if (this.f26384i) {
            overridePendingTransition(0, 0);
            int i5 = f26374l + 29;
            f26379r = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected final void onStop() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26374l + 9;
        f26379r = i3 % 128;
        if (i3 % 2 == 0) {
            super.onStop();
            f.a();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        super.onStop();
        if (f.a()) {
            Object[] objArr = new Object[1];
            q("廰뫙놭뾇⎿뤾\u0991ꋓᔮ⯂묱牳痥躒ꚩ屮겈꺡ꚩ屮ۂ皿捽䈾⎿뤾\u0cdf\ufdd1偨吾ꚩ屮㯡⠚ꦨ뼭", 36 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            q("ۂ皿鱳緱犒虏", 6 - View.getDefaultSize(0, 0), objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
            int i4 = f26374l + 85;
            f26379r = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z2) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26374l + 111;
        f26379r = i3 % 128;
        int i4 = i3 % 2;
        super.onWindowFocusChanged(z2);
        if (f.a()) {
            int packedPositionChild = 35 - ExpandableListView.getPackedPositionChild(0L);
            Object[] objArr = new Object[1];
            short sXd = (short) (Od.Xd() ^ (-16776));
            int[] iArr = new int["㓃邭蝾镙\uf196輖흦碩\ue309咽鄊䡍䯄摲粆㉌艋葥籪㈰Ȏ䲇㥂᠄\uf18a輊\udaa8펛☷⨎籶㈼ᇔ\uf60e羙锟".length()];
            QB qb = new QB("㓃邭蝾镙\uf196輖흦碩\ue309咽鄊䡍䯄摲粆㉌艋葥籪㈰Ȏ䲇㥂᠄\uf18a輊\udaa8펛☷⨎籶㈼ᇔ\uf60e羙锟");
            int i5 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i5] = xuXd.fK((sXd ^ i5) + xuXd.CK(iKK));
                i5++;
            }
            q(new String(iArr, 0, i5), packedPositionChild, objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            t(35 - TextUtils.getCapsMode("", 0, 0), Qg.kd("￡( 1\uffdd\"*\u001d.+ￗ\ufff0ￕ#!ࠉ\u001a\u001e\u0013\u001d$\ufff2\u001a\r\u001e\u001b￪\u000e\u0006\u0012\n\u0007\u0005\uffc0ￌ", (short) (C1633zX.Xd() ^ (-14099)), (short) (C1633zX.Xd() ^ (-14198))), false, ExpandableListView.getPackedPositionChild(0L) + OlympusImageProcessingMakernoteDirectory.TagWbGLevel, 13 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr2);
            f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(z2).toString());
            int i6 = f26379r + 23;
            f26374l = i6 % 128;
            int i7 = i6 % 2;
        }
        if (this.f26384i && z2) {
            Object[] objArr3 = {this};
            int iMyPid = Process.myPid();
            int i8 = f26368a * (-639615114);
            f26368a = i8;
            String strVd = hg.Vd("!-\"/+$\u001ef\u0019'&bt\u0016&\u001a&\u0018\"&\u007f\u0013\u001c\u000e\t\u000b", (short) (C1607wl.Xd() ^ 5291), (short) (C1607wl.Xd() ^ 11157));
            String strUd = C1561oA.ud("bson`hm9gfa]VSeY^\\", (short) (C1580rY.Xd() ^ (-71)));
            Context context = (Context) Class.forName(strVd).getMethod(strUd, new Class[0]).invoke(null, null);
            String strYd = C1561oA.yd("#8(.5", (short) (C1580rY.Xd() ^ (-135)));
            Class<?> cls = Class.forName(C1561oA.Yd("#1(750,v-::A3=D~\u0015BBI;OL", (short) (FB.Xd() ^ 15918)));
            Class<?>[] clsArr = {Class.forName(Xg.qd("%\u001d3\u001fl,\"0*q\u0018:9171", (short) (Od.Xd() ^ (-11409)), (short) (Od.Xd() ^ (-15175))))};
            Object[] objArr4 = {strYd};
            short sXd2 = (short) (C1633zX.Xd() ^ (-21182));
            short sXd3 = (short) (C1633zX.Xd() ^ (-8856));
            int[] iArr2 = new int["^q>\u0002[Nx\u001b\u000e)2\u0007$\b+$".length()];
            QB qb2 = new QB("^q>\u0002[Nx\u001b\u000e)2\u0007$\b+$");
            int i9 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i9] = xuXd2.fK(xuXd2.CK(iKK2) - ((i9 * sXd3) ^ sXd2));
                i9++;
            }
            Method method = cls.getMethod(new String(iArr2, 0, i9), clsArr);
            try {
                method.setAccessible(true);
                int streamMaxVolume = ((AudioManager) method.invoke(context, objArr4)).getStreamMaxVolume(3);
                Context context2 = (Context) Class.forName(strVd).getMethod(strUd, new Class[0]).invoke(null, null);
                Object[] objArr5 = new Object[0];
                Method method2 = Class.forName(ZO.xd("R &\u0015x\u001da\tgB{\u000e\u001d?>*D:Q~n\fN", (short) (C1580rY.Xd() ^ (-8473)), (short) (C1580rY.Xd() ^ (-14892)))).getMethod(C1626yg.Ud("?L\u001b\\QF\u0013\u001f4??.", (short) (OY.Xd() ^ 28588), (short) (OY.Xd() ^ 4600)), new Class[0]);
                try {
                    method2.setAccessible(true);
                    a(((Resources) method2.invoke(context2, objArr5)).getDisplayMetrics().widthPixels, i8, 69626986, objArr3, iMyPid, -69626986, streamMaxVolume);
                    this.f26384i = false;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
    }
}
