package com.incode.welcome_sdk.ui.user_consent;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.SystemClock;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.CompoundButton;
import android.widget.ToggleButton;
import androidx.appcompat.app.AlertDialog;
import com.c.a.a;
import com.c.a.d;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.extensions.ViewExtensionsKt;
import com.incode.welcome_sdk.commons.utils.EventUtils;
import com.incode.welcome_sdk.commons.utils.b;
import com.incode.welcome_sdk.d.ag;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.modules.UserConsent;
import com.incode.welcome_sdk.ui.BaseActivity;
import com.incode.welcome_sdk.ui.user_consent.UserConsentContract;
import com.incode.welcome_sdk.views.IncodeButton;
import com.incode.welcome_sdk.views.IncodeTextView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
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
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public final class UserConsentActivity extends BaseActivity implements UserConsentContract.View {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Companion f18003d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final byte[] f18004i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static long f18005j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f18006k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f18007l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f18008m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f18009n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f18010o = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Inject
    public UserConsentPresenter f18011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ag f18012c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ScreenName f18013e = ScreenName.USER_CONSENT;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Modules f18014f = Modules.USER_CONSENT;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f18015g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f18016h;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$0$safeOnCreate$-Landroid-os-Bundle--V, reason: not valid java name */
    public static /* synthetic */ void m8590instrumented$0$safeOnCreate$LandroidosBundleV(UserConsentActivity userConsentActivity, View view) {
        Callback.onClick_enter(view);
        try {
            e(userConsentActivity, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$1$d$--V, reason: not valid java name */
    public static /* synthetic */ void m8591instrumented$1$d$V(UserConsentActivity userConsentActivity, View view) {
        Callback.onClick_enter(view);
        try {
            a(userConsentActivity, view);
        } finally {
            Callback.onClick_exit();
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
            String strKd = Qg.kd("\\I\u000fL0", (short) (Od.Xd() ^ ((1628483423 ^ 292263986) ^ (-1887134855))), (short) (Od.Xd() ^ ((655327526 ^ 339706552) ^ (-858810791))));
            String strVd = hg.Vd("\u001b\b", (short) (ZN.Xd() ^ ((1482137923 ^ 655595903) ^ 2135186541)), (short) (ZN.Xd() ^ (1584604298 ^ 1584602625)));
            try {
                Class<?> cls = Class.forName(strKd);
                Field field = 0 != 0 ? cls.getField(strVd) : cls.getDeclaredField(strVd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strUd = C1561oA.ud("aN\u0014Q5", (short) (OY.Xd() ^ (2023361636 ^ 2023385137)));
                String strYd = C1561oA.yd("vb", (short) (Od.Xd() ^ ((2074439196 ^ 1094868027) ^ (-988225671))));
                try {
                    Class<?> cls2 = Class.forName(strUd);
                    Field field2 = 0 != 0 ? cls2.getField(strYd) : cls2.getDeclaredField(strYd);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strYd2 = C1561oA.Yd(">-t4\u001a", (short) (C1633zX.Xd() ^ ((1418832701 ^ 1114393239) ^ (-385726935))));
                    short sXd = (short) (FB.Xd() ^ ((899663164 ^ 1305207954) ^ 2018791752));
                    short sXd2 = (short) (FB.Xd() ^ (1432267555 ^ 1432259983));
                    int[] iArr = new int["QG".length()];
                    QB qb = new QB("QG");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
                        i2++;
                    }
                    String str = new String(iArr, 0, i2);
                    try {
                        Class<?> cls3 = Class.forName(strYd2);
                        Field field3 = 0 != 0 ? cls3.getField(str) : cls3.getDeclaredField(str);
                        field3.setAccessible(true);
                        obj3 = field3.get(null);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    if (((WindowManager) obj3) == null) {
                        short sXd3 = (short) (ZN.Xd() ^ ((799402944 ^ 1991995617) ^ 1495181412));
                        short sXd4 = (short) (ZN.Xd() ^ ((177244469 ^ 1558518800) ^ 1450553310));
                        int[] iArr2 = new int["J9\\\u0010.".length()];
                        QB qb2 = new QB("J9\\\u0010.");
                        int i3 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((i3 * sXd4) ^ sXd3));
                            i3++;
                        }
                        Object[] objArr = new Object[0];
                        Method declaredMethod = Class.forName(new String(iArr2, 0, i3)).getDeclaredMethod(ZO.xd("sK", (short) (C1607wl.Xd() ^ (1322476259 ^ 1322467011)), (short) (C1607wl.Xd() ^ (548162165 ^ 548174841))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                Object[] objArr2 = {C1626yg.Ud("\u0015=\u0003LM\u0014", (short) (C1607wl.Xd() ^ (1831436818 ^ 1831436761)), (short) (C1607wl.Xd() ^ ((1179406665 ^ 1531651155) ^ 487021273)))};
                                Method method = Class.forName(Ig.wd("\u0003X^\u0013\u0006:\u0007O-{v!FWK)\u00115z6o]u", (short) (Od.Xd() ^ ((1722563630 ^ 2124971129) ^ (-402941434))))).getMethod(C1561oA.Qd("DAO-RKK;B'8DG923", (short) (OY.Xd() ^ ((880156749 ^ 1661653390) ^ 1467807158))), Class.forName(EO.Od("Iv<@\u0017\u000b]\\|\u0001*g\u0011\u0010\u0007\u001b", (short) (C1499aX.Xd() ^ (478979824 ^ (-478993654))))));
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    String strZd = C1593ug.zd("hW\u001f^D", (short) (C1580rY.Xd() ^ ((1415393509 ^ 1337439898) ^ (-468358591))), (short) (C1580rY.Xd() ^ ((936194757 ^ 1695276106) ^ (-1388755049))));
                                    String strOd = C1561oA.od("k_", (short) (C1607wl.Xd() ^ (445942983 ^ 445971237)));
                                    try {
                                        Class<?> cls4 = Class.forName(strZd);
                                        Field field4 = 0 != 0 ? cls4.getField(strOd) : cls4.getDeclaredField(strOd);
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
                    short sXd5 = (short) (OY.Xd() ^ ((194762290 ^ 1801012649) ^ 1623385474));
                    int[] iArr3 = new int["[J\u0012Q7".length()];
                    QB qb3 = new QB("[J\u0012Q7");
                    int i4 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - ((sXd5 + sXd5) + i4));
                        i4++;
                    }
                    String str2 = new String(iArr3, 0, i4);
                    String strZd2 = Wg.Zd("]S", (short) (Od.Xd() ^ (190477037 ^ (-190461041))), (short) (Od.Xd() ^ ((1697557912 ^ 1568936553) ^ (-950715384))));
                    try {
                        Class<?> cls5 = Class.forName(str2);
                        Field field5 = 0 != 0 ? cls5.getField(strZd2) : cls5.getDeclaredField(strZd2);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        String strXd = C1561oA.Xd(":)p0\u0016", (short) (C1607wl.Xd() ^ (626346912 ^ 626343563)));
                        String strVd2 = Wg.vd("\u0003v", (short) (C1580rY.Xd() ^ (903561195 ^ (-903553188))));
                        try {
                            Class<?> cls6 = Class.forName(strXd);
                            Field field6 = 0 != 0 ? cls6.getField(strVd2) : cls6.getDeclaredField(strVd2);
                            field6.setAccessible(true);
                            obj5 = field6.get(null);
                        } catch (Throwable th6) {
                            obj5 = null;
                        }
                        ((WindowManager) obj5).getDefaultDisplay().getMetrics(displayMetrics);
                        int x2 = (int) motionEvent.getX();
                        int y2 = (int) motionEvent.getY();
                        int i5 = (1475263797 ^ 1164146601) ^ 311282391;
                        if (x2 > i5 && x2 < displayMetrics.widthPixels - i5 && y2 > i5 && y2 < displayMetrics.heightPixels - i5) {
                            C1553lQ.vd(motionEvent);
                            C1553lQ.Od(motionEvent);
                        }
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final UserConsentPresenter getPresenter() {
        int i2 = 2 % 2;
        int i3 = f18009n;
        int i4 = i3 + 105;
        f18008m = i4 % 128;
        int i5 = i4 % 2;
        UserConsentPresenter userConsentPresenter = this.f18011b;
        if (userConsentPresenter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i6 = i3 + 91;
        f18008m = i6 % 128;
        int i7 = i6 % 2;
        return userConsentPresenter;
    }

    public final void setPresenter(UserConsentPresenter userConsentPresenter) {
        int i2 = 2 % 2;
        int i3 = f18008m + 97;
        f18009n = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(userConsentPresenter, "");
            this.f18011b = userConsentPresenter;
            int i4 = 44 / 0;
        } else {
            Intrinsics.checkNotNullParameter(userConsentPresenter, "");
            this.f18011b = userConsentPresenter;
        }
        int i5 = f18008m + 115;
        f18009n = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final ScreenName getScreenName() {
        int i2 = 2 % 2;
        int i3 = f18009n + 35;
        f18008m = i3 % 128;
        int i4 = i3 % 2;
        ScreenName screenName = this.f18013e;
        if (i4 == 0) {
            int i5 = 3 / 0;
        }
        return screenName;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final Modules getModule() {
        Modules modules;
        int i2 = 2 % 2;
        int i3 = f18008m;
        int i4 = i3 + 47;
        f18009n = i4 % 128;
        if (i4 % 2 != 0) {
            modules = this.f18014f;
            int i5 = 40 / 0;
        } else {
            modules = this.f18014f;
        }
        int i6 = i3 + 89;
        f18009n = i6 % 128;
        if (i6 % 2 == 0) {
            return modules;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        r1 = com.incode.welcome_sdk.ui.user_consent.UserConsentActivity.f18008m + 41;
        com.incode.welcome_sdk.ui.user_consent.UserConsentActivity.f18009n = r1 % 128;
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        if ((r1 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r1 != null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r1 != null) goto L6;
     */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String getTitle() {
        /*
            r3 = this;
            r2 = 2
            int r0 = r2 % r2
            int r0 = com.incode.welcome_sdk.ui.user_consent.UserConsentActivity.f18008m
            int r1 = r0 + 11
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.user_consent.UserConsentActivity.f18009n = r0
            int r1 = r1 % r2
            if (r1 == 0) goto L17
            java.lang.String r1 = r3.f18016h
            r0 = 96
            int r0 = r0 / 0
            if (r1 == 0) goto L1c
        L16:
            return r1
        L17:
            java.lang.String r1 = r3.f18016h
            if (r1 == 0) goto L1c
            goto L16
        L1c:
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            int r0 = com.incode.welcome_sdk.ui.user_consent.UserConsentActivity.f18008m
            int r1 = r0 + 41
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.user_consent.UserConsentActivity.f18009n = r0
            int r1 = r1 % r2
            r0 = 0
            if (r1 != 0) goto L2e
            return r0
        L2e:
            r0.hashCode()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.user_consent.UserConsentActivity.getTitle():java.lang.String");
    }

    public final void setTitle(String str) {
        int i2 = 2 % 2;
        int i3 = f18008m + 25;
        f18009n = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.f18016h = str;
        int i5 = f18008m + 91;
        f18009n = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getContent() {
        int i2 = 2 % 2;
        String str = this.f18015g;
        if (str != null) {
            int i3 = f18009n + 111;
            f18008m = i3 % 128;
            int i4 = i3 % 2;
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i5 = f18009n + 69;
        f18008m = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public final void setContent(String str) {
        int i2 = 2 % 2;
        int i3 = f18008m + 33;
        f18009n = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.f18015g = str;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.f18015g = str;
            throw null;
        }
    }

    private static final void e(UserConsentActivity userConsentActivity, View view) {
        int i2 = 2 % 2;
        int i3 = f18008m + 67;
        f18009n = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(userConsentActivity, "");
        ag agVar = userConsentActivity.f18012c;
        if (agVar == null) {
            int i5 = f18008m + 17;
            f18009n = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            agVar = null;
        }
        IncodeButton incodeButton = agVar.f6849e;
        Intrinsics.checkNotNullExpressionValue(incodeButton, "");
        ViewExtensionsKt.preventDoubleClick(incodeButton);
        userConsentActivity.getPresenter().submitUserConsent(userConsentActivity.getTitle(), userConsentActivity.getContent(), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008b  */
    @Override // com.incode.welcome_sdk.ui.BaseActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void safeOnCreate(android.os.Bundle r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.user_consent.UserConsentActivity.safeOnCreate(android.os.Bundle):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(UserConsentActivity userConsentActivity, CompoundButton compoundButton, boolean z2) {
        int i2 = 2 % 2;
        int i3 = f18009n + 5;
        f18008m = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(userConsentActivity, "");
        ag agVar = userConsentActivity.f18012c;
        if (agVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i5 = f18009n + 115;
            f18008m = i5 % 128;
            int i6 = i5 % 2;
            agVar = null;
        }
        agVar.f6849e.setEnabled(z2);
    }

    private static final void a(UserConsentActivity userConsentActivity, View view) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(userConsentActivity, "");
        ag agVar = userConsentActivity.f18012c;
        ag agVar2 = null;
        if (agVar == null) {
            int i3 = f18009n + 109;
            f18008m = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i4 = 60 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            int i5 = f18009n + 117;
            f18008m = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 4 / 3;
            }
            agVar = null;
        }
        ToggleButton toggleButton = agVar.f6846b;
        ag agVar3 = userConsentActivity.f18012c;
        if (agVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            agVar2 = agVar3;
        }
        toggleButton.setChecked(!agVar2.f6846b.isChecked());
        int i7 = f18008m + 117;
        f18009n = i7 % 128;
        int i8 = i7 % 2;
    }

    private final void d() {
        int i2 = 2 % 2;
        int i3 = f18008m + 109;
        f18009n = i3 % 128;
        ag agVar = null;
        if (i3 % 2 == 0) {
            ag agVar2 = this.f18012c;
            if (agVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                agVar2 = null;
            }
            agVar2.f6846b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.incode.welcome_sdk.ui.user_consent.UserConsentActivity$$ExternalSyntheticLambda3
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                    UserConsentActivity.d(this.f$0, compoundButton, z2);
                }
            });
            ag agVar3 = this.f18012c;
            if (agVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                agVar = agVar3;
            }
            IncodeTextView incodeTextView = agVar.f6848d;
            incodeTextView.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.user_consent.UserConsentActivity$$ExternalSyntheticLambda4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UserConsentActivity.m8591instrumented$1$d$V(this.f$0, view);
                }
            });
            b bVar = b.f6439a;
            String string = getString(R.string.onboard_sdk_user_consent_checkbox);
            Intrinsics.checkNotNullExpressionValue(string, "");
            incodeTextView.setText(b.c(this, string));
            incodeTextView.setMovementMethod(LinkMovementMethod.getInstance());
            int i4 = f18009n + 91;
            f18008m = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        agVar.hashCode();
        throw null;
    }

    private InputStream c(InputStream inputStream, byte[] bArr, int i2, int i3, int i4) throws IOException {
        long j2 = f18005j;
        return new d(new a(inputStream, new int[]{((int) (j2 >>> 32)) ^ i3, i3 ^ ((int) j2)}, bArr, i4, i4 <= 6, i2));
    }

    private final void e(WebView webView, String str) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f18008m + 121;
        f18009n = i3 % 128;
        int i4 = i3 % 2;
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setBlockNetworkLoads(true);
        AssetManager assets = getAssets();
        byte[] bArr = f18004i;
        Object[] objArr = new Object[1];
        z(bArr[44], (byte) 42, bArr[18], objArr);
        try {
            Object[] objArr2 = {(String) objArr[0]};
            byte b2 = bArr[5];
            Object[] objArr3 = new Object[1];
            z(b2, (byte) (b2 | Ascii.US), bArr[3], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b3 = bArr[3];
            byte b4 = bArr[5];
            Object[] objArr4 = new Object[1];
            z(b3, b4, b4, objArr4);
            InputStream inputStreamC = c((InputStream) cls.getMethod((String) objArr4[0], String.class).invoke(assets, objArr2), null, 1 - (ViewConfiguration.getWindowTouchSlop() >> 8), TextUtils.indexOf((CharSequence) "", '0') + 611344290, (ViewConfiguration.getPressedStateDuration() >> 16) + 8);
            Intrinsics.checkNotNullExpressionValue(inputStreamC, "");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamC, Charsets.UTF_8), 8192);
            try {
                String text = TextStreamsKt.readText(bufferedReader);
                CloseableKt.closeFinally(bufferedReader, null);
                int i5 = f18008m + 11;
                f18009n = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 3 / 5;
                }
                webView.loadDataWithBaseURL("file:///android_asset/", StringsKt.replace$default(text, "content = ''", "content = '" + StringsKt.replace$default(StringsKt.replace$default(str, "\n", "\\n", false, 4, (Object) null), "'", "\\'", false, 4, (Object) null) + "'", false, 4, (Object) null), "text/html", "UTF-8", null);
                int i7 = f18008m + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                f18009n = i7 % 128;
                if (i7 % 2 != 0) {
                    throw null;
                }
            } finally {
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void onBackButtonPressed() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f18009n + 31;
        f18008m = i3 % 128;
        int i4 = i3 % 2;
        showCancelDialog();
        int i5 = f18008m + 79;
        f18009n = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(UserConsentActivity userConsentActivity, DialogInterface dialogInterface, int i2) {
        int i3 = 2 % 2;
        int i4 = f18009n + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f18008m = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(userConsentActivity, "");
        EventUtils.sendExitConfirmedEvent(userConsentActivity.getRepo(), userConsentActivity.getScreenName().name(), userConsentActivity.getModule(), "yes");
        userConsentActivity.getPresenter().submitUserConsent(userConsentActivity.getTitle(), userConsentActivity.getContent(), false);
        int i6 = f18008m + 53;
        f18009n = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(UserConsentActivity userConsentActivity, DialogInterface dialogInterface, int i2) {
        int i3 = 2 % 2;
        int i4 = f18008m + 53;
        f18009n = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(userConsentActivity, "");
        EventUtils.sendExitConfirmedEvent(userConsentActivity.getRepo(), userConsentActivity.getScreenName().name(), userConsentActivity.getModule(), "no");
        int i6 = f18008m + 63;
        f18009n = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(UserConsentActivity userConsentActivity, DialogInterface dialogInterface) {
        int i2 = 2 % 2;
        int i3 = f18008m + 65;
        f18009n = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(userConsentActivity, "");
        EventUtils.sendExitConfirmedEvent(userConsentActivity.getRepo(), userConsentActivity.getScreenName().name(), userConsentActivity.getModule(), "no");
        int i5 = f18009n + 107;
        f18008m = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.user_consent.UserConsentContract.View
    public final void showCancelDialog() throws Throwable {
        int i2 = 2 % 2;
        EventUtils.sendExitPromptEvent(getRepo(), getScreenName().name(), getModule());
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.onboard_sdk_user_consent_cancel_dialog_title);
        builder.setMessage(R.string.onboard_sdk_user_consent_cancel_dialog_message);
        builder.setPositiveButton(R.string.onboard_sdk_user_consent_cancel_dialog_button_positive, new DialogInterface.OnClickListener() { // from class: com.incode.welcome_sdk.ui.user_consent.UserConsentActivity$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                UserConsentActivity.e(this.f$0, dialogInterface, i3);
            }
        });
        builder.setNegativeButton(R.string.onboard_sdk_user_consent_cancel_dialog_button_negative, new DialogInterface.OnClickListener() { // from class: com.incode.welcome_sdk.ui.user_consent.UserConsentActivity$$ExternalSyntheticLambda1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                UserConsentActivity.b(this.f$0, dialogInterface, i3);
            }
        });
        builder.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.incode.welcome_sdk.ui.user_consent.UserConsentActivity$$ExternalSyntheticLambda2
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                UserConsentActivity.d(this.f$0, dialogInterface);
            }
        });
        builder.create().show();
        int i3 = f18008m + 11;
        f18009n = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 88 / 0;
        }
    }

    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f18017a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f18018b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f18019c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static int f18020d = 0;

        private Companion() {
        }

        @JvmStatic
        public final void start(Context context, UserConsent userConsent) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(userConsent, "");
            Intent intent = new Intent(context, (Class<?>) UserConsentActivity.class);
            intent.putExtra("extraTitle", userConsent.getTitle());
            intent.putExtra("extraContent", userConsent.getContent());
            CX.ud();
            context.startActivity(intent);
            int i3 = f18018b + 35;
            f18019c = i3 % 128;
            int i4 = i3 % 2;
        }

        public static int b() {
            int i2 = f18017a;
            int i3 = i2 % 6431216;
            f18017a = i2 + 1;
            if (i3 != 0) {
                return f18020d;
            }
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            f18020d = iElapsedRealtime;
            return iElapsedRealtime;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void z(short r8, short r9, byte r10, java.lang.Object[] r11) {
        /*
            int r0 = r8 * 2
            int r8 = r0 + 97
            byte[] r7 = com.incode.welcome_sdk.ui.user_consent.UserConsentActivity.f18004i
            int r0 = 45 - r9
            int r1 = r10 * 4
            int r6 = r1 + 4
            byte[] r5 = new byte[r6]
            r4 = 0
            if (r7 != 0) goto L2e
            r1 = r0
            r8 = r6
            r3 = r4
        L14:
            int r0 = -r0
            int r8 = r8 + r0
            int r8 = r8 + (-1)
            r0 = r1
            r2 = r3
        L1a:
            int r1 = r0 + 1
            int r3 = r2 + 1
            byte r0 = (byte) r8
            r5[r2] = r0
            if (r3 != r6) goto L2b
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            r11[r4] = r0
            return
        L2b:
            r0 = r7[r1]
            goto L14
        L2e:
            r2 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.user_consent.UserConsentActivity.z(short, short, byte, java.lang.Object[]):void");
    }

    static void b() {
        f18004i = new byte[]{47, 75, -118, 7, -13, 0, -6, Ascii.CR, -10, -7, 69, MessagePack.Code.BIN16, -13, 6, 0, -14, 9, -15, 2, 5, 4, 53, MessagePack.Code.FLOAT32, -13, 0, -7, Ascii.SO, -10, -7, 69, -69, Ascii.FF, -15, 68, -20, MessagePack.Code.UINT16, -1, Ascii.CR, -16, 38, -21, -14, Ascii.FF, -7, 1, -14, -2, 10, -10};
        f18010o = 5;
    }

    static void c() {
        f18005j = 804113604503773563L;
    }

    static {
        b();
        c();
        f18003d = new Companion(null);
        int i2 = f18007l + 57;
        f18006k = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 92 / 0;
        }
    }

    @JvmStatic
    public static final void start(Context context, UserConsent userConsent) {
        int i2 = 2 % 2;
        int i3 = f18008m + 1;
        f18009n = i3 % 128;
        int i4 = i3 % 2;
        f18003d.start(context, userConsent);
        int i5 = f18009n + 7;
        f18008m = i5 % 128;
        int i6 = i5 % 2;
    }
}
