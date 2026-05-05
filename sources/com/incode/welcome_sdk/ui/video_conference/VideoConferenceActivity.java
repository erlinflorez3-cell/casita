package com.incode.welcome_sdk.ui.video_conference;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentManager;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.dynatrace.android.callback.Callback;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.utils.EventUtils;
import com.incode.welcome_sdk.d.bq;
import com.incode.welcome_sdk.data.Event;
import com.incode.welcome_sdk.data.EventValues;
import com.incode.welcome_sdk.data.local.db.c.a.a;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.results.VideoConferenceResult;
import com.incode.welcome_sdk.ui.BaseActivity;
import com.incode.welcome_sdk.ui.permissions.PermissionsMandatoryDialog;
import com.incode.welcome_sdk.ui.video_conference.VideoConferenceContract;
import com.incode.welcome_sdk.ui.video_conference.VideoConferencePresenter;
import io.reactivex.subjects.PublishSubject;
import io.sentry.protocol.SentryStackFrame;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import yg.C1499aX;
import yg.C1553lQ;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.CX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes5.dex */
public class VideoConferenceActivity extends BaseActivity implements VideoConferenceContract.View {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f18068l = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f18069n = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f18070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f18071c = "android.permission.RECORD_AUDIO";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Inject
    VideoConferencePresenter f18072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AudioManager f18073e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f18074f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f18075g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f18076h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f18077i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f18078j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private bq f18079k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private VideoConferenceChatFragment f18080m;

    public static /* synthetic */ Object a(Object[] objArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = ~i5;
        int i9 = ~i7;
        int i10 = ~(i8 | i9);
        int i11 = ~i3;
        int i12 = i10 | (~(i11 | i7));
        int i13 = i9 | i5;
        int i14 = ~(i13 | i3);
        int i15 = (~(i7 | i8)) | (~(i9 | i11)) | (~i13);
        int i16 = i5 + i3 + i4 + (1650861130 * i6) + ((-924421097) * i2);
        int i17 = i16 * i16;
        int i18 = (i5 * (-405912681)) + 1474035712 + ((-405912681) * i3) + (i12 * (-1619411862)) + (1619411862 * i14) + ((-1619411862) * i15) + ((-2025324544) * i4) + (986710016 * i6) + ((-948436992) * i2) + ((-1864630272) * i17);
        int i19 = ((i5 * (-959335331)) - 587927435) + (i3 * (-959335331)) + (i12 * 462) + (i14 * (-462)) + (i15 * 462) + (i4 * (-959334869)) + (i6 * 22983790) + (i2 * 637852125) + (i17 * (-1124859904));
        return i18 + ((i19 * i19) * (-1807482880)) != 1 ? a(objArr) : e(objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$0$safeOnCreate$-Landroid-os-Bundle--V, reason: not valid java name */
    public static /* synthetic */ void m8593instrumented$0$safeOnCreate$LandroidosBundleV(VideoConferenceActivity videoConferenceActivity, View view) {
        Callback.onClick_enter(view);
        try {
            videoConferenceActivity.e(view);
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$1$safeOnCreate$-Landroid-os-Bundle--V, reason: not valid java name */
    public static /* synthetic */ void m8594instrumented$1$safeOnCreate$LandroidosBundleV(VideoConferenceActivity videoConferenceActivity, View view) {
        Callback.onClick_enter(view);
        try {
            videoConferenceActivity.b(view);
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$2$safeOnCreate$-Landroid-os-Bundle--V, reason: not valid java name */
    public static /* synthetic */ void m8595instrumented$2$safeOnCreate$LandroidosBundleV(VideoConferenceActivity videoConferenceActivity, View view) {
        Callback.onClick_enter(view);
        try {
            videoConferenceActivity.d(view);
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
            String strKd = Qg.kd("WD\nG+", (short) (OY.Xd() ^ ((583520581 ^ 678601897) ^ 179644643)), (short) (OY.Xd() ^ (1880526379 ^ 1880532845)));
            short sXd = (short) (C1607wl.Xd() ^ (2098283795 ^ 2098267552));
            short sXd2 = (short) (C1607wl.Xd() ^ ((1105855601 ^ 148808704) ^ 1228179759));
            int[] iArr = new int["kX".length()];
            QB qb = new QB("kX");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
                i2++;
            }
            String str = new String(iArr, 0, i2);
            try {
                Class<?> cls = Class.forName(strKd);
                Field field = 0 != 0 ? cls.getField(str) : cls.getDeclaredField(str);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                short sXd3 = (short) (C1580rY.Xd() ^ ((1167717996 ^ 1185793541) ^ (-53742929)));
                int[] iArr2 = new int["\u007fl2oS".length()];
                QB qb2 = new QB("\u007fl2oS");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(sXd3 + i3 + xuXd2.CK(iKK2));
                    i3++;
                }
                String str2 = new String(iArr2, 0, i3);
                short sXd4 = (short) (FB.Xd() ^ (609732561 ^ 609719704));
                int[] iArr3 = new int["m[".length()];
                QB qb3 = new QB("m[");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (sXd4 ^ i4));
                    i4++;
                }
                String str3 = new String(iArr3, 0, i4);
                try {
                    Class<?> cls2 = Class.forName(str2);
                    Field field2 = 0 != 0 ? cls2.getField(str3) : cls2.getDeclaredField(str3);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strYd = C1561oA.Yd("A0w7\u001d", (short) (C1580rY.Xd() ^ (1049253236 ^ (-1049246372))));
                    String strQd = Xg.qd("KA", (short) (C1633zX.Xd() ^ ((1619229211 ^ 382846227) ^ (-1985122470))), (short) (C1633zX.Xd() ^ ((4322758 ^ 1840016823) ^ (-1844293484))));
                    try {
                        Class<?> cls3 = Class.forName(strYd);
                        Field field3 = 0 != 0 ? cls3.getField(strQd) : cls3.getDeclaredField(strQd);
                        field3.setAccessible(true);
                        obj3 = field3.get(null);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    if (((WindowManager) obj3) == null) {
                        Object[] objArr = new Object[0];
                        Method declaredMethod = Class.forName(Jg.Wd("&E4\u000b\u0014", (short) (ZN.Xd() ^ ((593203823 ^ 1531842928) ^ 2014692956)), (short) (ZN.Xd() ^ ((636846283 ^ 1885161691) ^ 1437123871)))).getDeclaredMethod(ZO.xd("\u0001\u0004", (short) (C1607wl.Xd() ^ (360239890 ^ 360224829)), (short) (C1607wl.Xd() ^ (1947219690 ^ 1947221956))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                short sXd5 = (short) (FB.Xd() ^ ((19723868 ^ 2077447854) ^ 2063594203));
                                short sXd6 = (short) (FB.Xd() ^ (1929410903 ^ 1929385723));
                                int[] iArr4 = new int["MrfR\\J".length()];
                                QB qb4 = new QB("MrfR\\J");
                                int i5 = 0;
                                while (qb4.YK()) {
                                    int iKK4 = qb4.KK();
                                    Xu xuXd4 = Xu.Xd(iKK4);
                                    iArr4[i5] = xuXd4.fK((C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((sXd5 + sXd5) + (i5 * sXd6))) + xuXd4.CK(iKK4));
                                    i5++;
                                }
                                Object[] objArr2 = {new String(iArr4, 0, i5)};
                                Method method = Class.forName(Ig.wd("B\"&SP}T\u0006\r\u0018\u0019A\u0004\u0013\u0019{Xf=\u000b=\u0018*", (short) (C1607wl.Xd() ^ ((1433203741 ^ 1256859966) ^ 528926000)))).getMethod(C1561oA.Qd("SP^<aZZJQ6GSVHAB", (short) (C1499aX.Xd() ^ ((410678525 ^ 1901057341) ^ (-1765118684)))), Class.forName(EO.Od("#qH\u00138\u001c5i\u0016@;\u0003P9Nl", (short) (ZN.Xd() ^ (563610949 ^ 563638398)))));
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    String strZd = C1593ug.zd("\u000f}E\u0005j", (short) (C1580rY.Xd() ^ (967424198 ^ (-967432726))), (short) (C1580rY.Xd() ^ (1426800971 ^ (-1426801147))));
                                    String strOd = C1561oA.od("-!", (short) (C1633zX.Xd() ^ ((1843889953 ^ 198829190) ^ (-1715355556))));
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
                    String strKd2 = C1561oA.Kd("\tw?~d", (short) (OY.Xd() ^ (434304081 ^ 434287759)));
                    String strZd2 = Wg.Zd("ry", (short) (C1499aX.Xd() ^ ((1382066221 ^ 436531370) ^ (-1214530198))), (short) (C1499aX.Xd() ^ ((1124708738 ^ 238314720) ^ (-1295882959))));
                    try {
                        Class<?> cls5 = Class.forName(strKd2);
                        Field field5 = 0 != 0 ? cls5.getField(strZd2) : cls5.getDeclaredField(strZd2);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        String strXd = C1561oA.Xd("_N\u0016U;", (short) (ZN.Xd() ^ ((1054019981 ^ 565743205) ^ 527154485)));
                        String strVd = Wg.vd("\f\u0002", (short) (C1607wl.Xd() ^ (2076053466 ^ 2076071121)));
                        try {
                            Class<?> cls6 = Class.forName(strXd);
                            Field field6 = 0 != 0 ? cls6.getField(strVd) : cls6.getDeclaredField(strVd);
                            field6.setAccessible(true);
                            obj5 = field6.get(null);
                        } catch (Throwable th6) {
                            obj5 = null;
                        }
                        ((WindowManager) obj5).getDefaultDisplay().getMetrics(displayMetrics);
                        int x2 = (int) motionEvent.getX();
                        int y2 = (int) motionEvent.getY();
                        int i6 = (1413629176 ^ 1461858017) ^ 56650322;
                        if (x2 > i6 && x2 < displayMetrics.widthPixels - i6 && y2 > i6 && y2 < displayMetrics.heightPixels - i6) {
                            C1553lQ.vd(motionEvent);
                            C1553lQ.Od(motionEvent);
                        }
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    private /* synthetic */ void e(View view) throws Exception {
        int i2 = 2 % 2;
        int i3 = f18068l + 65;
        f18069n = i3 % 128;
        int i4 = i3 % 2;
        j();
        if (i4 != 0) {
            int i5 = 72 / 0;
        }
        int i6 = f18068l + 57;
        f18069n = i6 % 128;
        int i7 = i6 % 2;
    }

    private /* synthetic */ void b(View view) {
        int i2 = 2 % 2;
        int i3 = f18069n + 73;
        f18068l = i3 % 128;
        int i4 = i3 % 2;
        a();
        if (i4 == 0) {
            int i5 = 48 / 0;
        }
    }

    private /* synthetic */ void d(View view) {
        int i2 = 2 % 2;
        int i3 = f18068l + 75;
        f18069n = i3 % 128;
        int i4 = i3 % 2;
        c((ImageButton) view);
        if (i4 != 0) {
            int i5 = 62 / 0;
        }
        int i6 = f18069n + 47;
        f18068l = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public void safeOnCreate(Bundle bundle) {
        int i2 = 2 % 2;
        super.safeOnCreate(bundle);
        bq bqVarD = bq.d(getLayoutInflater());
        this.f18079k = bqVarD;
        setContentView(bqVarD.b());
        HashMap map = new HashMap();
        map.put(EventValues.SCREEN_NAME.getValue(), getScreenName().name());
        EventUtils.sendEvent(getRepo(), Event.START_VIDEO_CONFERENCE, getModule(), (HashMap<String, Object>) map);
        getWindow().addFlags(128);
        DaggerVideoConferenceComponent.builder().incodeWelcomeRepositoryComponent(IncodeWelcome.getInstance().getIncodeWelcomeRepositoryComponent()).videoConferencePresenterModule(new VideoConferencePresenterModule(this)).build().inject(this);
        this.f18075g = getIntent().getBooleanExtra("extraDisableMicOnStartup", false);
        int iC = a.c();
        a(new Object[]{this}, a.c(), 1600132222, a.c(), -1600132222, a.c(), iC);
        this.f18073e = (AudioManager) getSystemService("audio");
        this.f18079k.f7136d.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.video_conference.VideoConferenceActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoConferenceActivity.m8593instrumented$0$safeOnCreate$LandroidosBundleV(this.f$0, view);
            }
        });
        this.f18079k.f7134b.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.video_conference.VideoConferenceActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoConferenceActivity.m8594instrumented$1$safeOnCreate$LandroidosBundleV(this.f$0, view);
            }
        });
        this.f18079k.f7137e.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.video_conference.VideoConferenceActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoConferenceActivity.m8595instrumented$2$safeOnCreate$LandroidosBundleV(this.f$0, view);
            }
        });
        int i3 = f18068l + 67;
        f18069n = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        int i2 = 2 % 2;
        int i3 = f18068l + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f18069n = i3 % 128;
        if (i3 % 2 != 0) {
            super.onStart();
            checkPermissionsAndInitConference();
            int i4 = 2 / 0;
        } else {
            super.onStart();
            checkPermissionsAndInitConference();
        }
    }

    public void requestAudioPermission() {
        int i2 = 2 % 2;
        int i3 = f18069n + 113;
        f18068l = i3 % 128;
        if (i3 % 2 == 0) {
            ActivityCompat.requestPermissions(this, new String[]{"android.permission.RECORD_AUDIO"}, 15203);
        } else {
            ActivityCompat.requestPermissions(this, new String[]{"android.permission.RECORD_AUDIO"}, 1003);
        }
    }

    private void a() {
        int i2 = 2 % 2;
        int i3 = f18068l + 7;
        f18069n = i3 % 128;
        int i4 = i3 % 2;
        this.f18072d.hangUp();
        int i5 = f18068l + 67;
        f18069n = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 25 / 0;
        }
    }

    private boolean e() {
        int i2 = 2 % 2;
        int i3 = f18069n + 113;
        f18068l = i3 % 128;
        int i4 = i3 % 2;
        if (ContextCompat.checkSelfPermission(this, "android.permission.RECORD_AUDIO") != 0) {
            return false;
        }
        int i5 = f18069n;
        int i6 = i5 + 63;
        f18068l = i6 % 128;
        int i7 = i6 % 2;
        int i8 = i5 + 81;
        f18068l = i8 % 128;
        int i9 = i8 % 2;
        return true;
    }

    protected void checkPermissionsAndInitConference() {
        int i2 = 2 % 2;
        int i3 = f18069n + 29;
        f18068l = i3 % 128;
        int i4 = i3 % 2;
        if (!e()) {
            requestAudioPermission();
            return;
        }
        int i5 = f18069n + 87;
        f18068l = i5 % 128;
        int i6 = i5 % 2;
        this.f18072d.waitForMyTurn();
        int i7 = f18068l + 15;
        f18069n = i7 % 128;
        int i8 = i7 % 2;
    }

    private void b() {
        int i2 = 2 % 2;
        if (isFinishing() || this.f18076h) {
            this.f18077i = true;
            return;
        }
        int i3 = f18069n + 51;
        f18068l = i3 % 128;
        int i4 = i3 % 2;
        d();
        int i5 = f18068l + 5;
        f18069n = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 54 / 0;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        int i3 = 2 % 2;
        if (!e()) {
            b();
            return;
        }
        int i4 = f18069n + 93;
        f18068l = i4 % 128;
        int i5 = i4 % 2;
        this.f18072d.waitForMyTurn();
        int i6 = f18068l + 81;
        f18069n = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void d() {
        int i2 = 2 % 2;
        int i3 = f18069n + 109;
        f18068l = i3 % 128;
        int i4 = i3 % 2;
        PermissionsMandatoryDialog.newInstance(R.drawable.onboard_sdk_microphone_permission_image, R.string.onboard_sdk_dialog_microphone_permissions_mandatory_title, R.string.onboard_sdk_dialog_microphone_permissions_mandatory_subtitle, "android.permission.RECORD_AUDIO", getModule(), getRepo()).show(getSupportFragmentManager(), PermissionsMandatoryDialog.TAG);
        int i5 = f18069n + 29;
        f18068l = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    @Override // androidx.fragment.app.FragmentActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onResumeFragments() {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.ui.video_conference.VideoConferenceActivity.f18069n
            int r1 = r0 + 85
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.video_conference.VideoConferenceActivity.f18068l = r0
            int r1 = r1 % r3
            r2 = 0
            if (r1 != 0) goto L2a
            super.onResumeFragments()
            boolean r1 = r4.f18077i
            r0 = 43
            int r0 = r0 / r2
            if (r1 == 0) goto L1e
        L19:
            r4.d()
            r4.f18077i = r2
        L1e:
            int r0 = com.incode.welcome_sdk.ui.video_conference.VideoConferenceActivity.f18068l
            int r1 = r0 + 15
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.video_conference.VideoConferenceActivity.f18069n = r0
            int r1 = r1 % r3
            if (r1 != 0) goto L32
            return
        L2a:
            super.onResumeFragments()
            boolean r0 = r4.f18077i
            if (r0 == 0) goto L1e
            goto L19
        L32:
            r0 = 0
            r0.hashCode()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.video_conference.VideoConferenceActivity.onResumeFragments():void");
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = f18068l + 27;
        f18069n = i3 % 128;
        int i4 = i3 % 2;
        super.onSaveInstanceState(bundle);
        this.f18076h = true;
        int i5 = f18069n + 83;
        f18068l = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        ConstraintLayout constraintLayout;
        int i2 = 0;
        VideoConferenceActivity videoConferenceActivity = (VideoConferenceActivity) objArr[0];
        int i3 = 2 % 2;
        int i4 = f18068l + 105;
        f18069n = i4 % 128;
        if (i4 % 2 != 0) {
            constraintLayout = videoConferenceActivity.f18079k.f7141i;
            i2 = 1;
        } else {
            constraintLayout = videoConferenceActivity.f18079k.f7141i;
        }
        constraintLayout.setVisibility(i2);
        int i5 = f18069n + 59;
        f18068l = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.video_conference.VideoConferenceContract.View
    public void showLoadingSpinner() {
        int i2 = 2 % 2;
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(this, R.anim.onboard_sdk_rotate);
        animationLoadAnimation.setFillAfter(true);
        animationLoadAnimation.setInterpolator(new LinearInterpolator());
        this.f18079k.f7139g.startAnimation(animationLoadAnimation);
        int i3 = f18069n + 109;
        f18068l = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.video_conference.VideoConferenceContract.View
    public void hideLoadingSpinner() {
        int i2 = 2 % 2;
        int i3 = f18068l + 5;
        f18069n = i3 % 128;
        int i4 = i3 % 2;
        this.f18079k.f7139g.clearAnimation();
        this.f18079k.f7141i.setVisibility(8);
        int i5 = f18068l + 111;
        f18069n = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 92 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.video_conference.VideoConferenceContract.View
    public void enterVideoConference(VideoConferencePresenter.VideoConferenceData videoConferenceData) {
        int i2 = 2 % 2;
        int i3 = f18069n + 125;
        f18068l = i3 % 128;
        int i4 = i3 % 2;
        this.f18078j = videoConferenceData.getInterviewerName();
        this.f18079k.f7135c.setText(videoConferenceData.getInterviewerName());
        this.f18072d.enterVideoConference(this, videoConferenceData);
        int i5 = f18068l + 67;
        f18069n = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.video_conference.VideoConferenceContract.View
    public void onVideoConferenceError(Throwable th) {
        int i2 = 2 % 2;
        Toast.makeText(this, R.string.onboard_sdk_unknown_server_error, 1).show();
        onVideoConferenceEnded(new VideoConferenceResult(ResultCode.ERROR, th));
        int i3 = f18068l + 85;
        f18069n = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        ViewGroup viewGroup = (ViewGroup) objArr[0];
        View view = (View) objArr[1];
        int i2 = 2 % 2;
        int i3 = f18069n + 51;
        f18068l = i3 % 128;
        int i4 = i3 % 2;
        if (view.getParent() != null) {
            int i5 = f18068l + 31;
            f18069n = i5 % 128;
            if (i5 % 2 != 0) {
                viewGroup.removeView(view);
                throw null;
            }
            viewGroup.removeView(view);
        }
        int i6 = f18069n + 121;
        f18068l = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    @Override // com.incode.welcome_sdk.ui.video_conference.VideoConferenceContract.View
    public void showMyVideo(View view) {
        int i2 = 2 % 2;
        int i3 = f18068l + 89;
        f18069n = i3 % 128;
        int i4 = i3 % 2;
        this.f18070b = view;
        Object[] objArr = {this.f18079k.f7140h, this.f18070b};
        int iC = a.c();
        a(objArr, a.c(), -736962080, a.c(), 736962081, a.c(), iC);
        this.f18079k.f7140h.addView(this.f18070b);
        int i5 = f18068l + 83;
        f18069n = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.video_conference.VideoConferenceContract.View
    public void showInterviewerVideo(View view) {
        int i2 = 2 % 2;
        int i3 = f18068l + 5;
        f18069n = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this.f18079k.f7133a, view};
        int iC = a.c();
        a(objArr, a.c(), -736962080, a.c(), 736962081, a.c(), iC);
        this.f18079k.f7133a.addView(view);
        int i5 = f18068l + 43;
        f18069n = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private void c(ImageButton imageButton) {
        int i2 = 2 % 2;
        int i3 = f18068l + 95;
        f18069n = i3 % 128;
        int i4 = i3 % 2;
        this.f18072d.toggleMute(imageButton);
        int i5 = f18068l + 3;
        f18069n = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 12 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.video_conference.VideoConferenceContract.View
    public void onVideoConferenceEnded(VideoConferenceResult videoConferenceResult) {
        Window window;
        int i2;
        int i3 = 2 % 2;
        int i4 = f18069n + 95;
        f18068l = i4 % 128;
        if (i4 % 2 == 0) {
            window = getWindow();
            i2 = 6714;
        } else {
            window = getWindow();
            i2 = 128;
        }
        window.clearFlags(i2);
        this.f18072d.publishResult(videoConferenceResult);
        int i5 = f18069n + 81;
        f18068l = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 35 / 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(DialogInterface dialogInterface, int i2) {
        int i3 = 2 % 2;
        int i4 = f18068l + 13;
        f18069n = i4 % 128;
        if (i4 % 2 != 0) {
            this.f18072d.hangUp();
            int i5 = 71 / 0;
        } else {
            this.f18072d.hangUp();
        }
        int i6 = f18069n + 43;
        f18068l = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public void onBackButtonPressed() throws Exception {
        int i2 = 2 % 2;
        int i3 = f18069n + 39;
        f18068l = i3 % 128;
        int i4 = i3 % 2;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.getBackStackEntryCount() <= 0) {
            handleExit(new DialogInterface.OnClickListener() { // from class: com.incode.welcome_sdk.ui.video_conference.VideoConferenceActivity$$ExternalSyntheticLambda3
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i5) {
                    this.f$0.b(dialogInterface, i5);
                }
            });
            return;
        }
        int i5 = f18069n + 47;
        f18068l = i5 % 128;
        if (i5 % 2 == 0) {
            CX.ud();
            supportFragmentManager.popBackStack();
            Object[] objArr = {this.f18079k.f7140h, this.f18070b};
            int iC = a.c();
            a(objArr, a.c(), -736962080, a.c(), 736962081, a.c(), iC);
        } else {
            CX.ud();
            supportFragmentManager.popBackStack();
            Object[] objArr2 = {this.f18079k.f7140h, this.f18070b};
            int iC2 = a.c();
            a(objArr2, a.c(), -736962080, a.c(), 736962081, a.c(), iC2);
        }
        this.f18079k.f7140h.addView(this.f18070b);
        this.f18079k.f7136d.setEnabled(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void j() throws java.lang.Exception {
        /*
            r4 = this;
            r2 = 2
            int r0 = r2 % r2
            int r0 = com.incode.welcome_sdk.ui.video_conference.VideoConferenceActivity.f18069n
            int r1 = r0 + 77
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.video_conference.VideoConferenceActivity.f18068l = r0
            int r1 = r1 % r2
            r3 = 0
            if (r1 != 0) goto L60
            com.incode.welcome_sdk.d.bq r0 = r4.f18079k
            android.widget.ImageButton r0 = r0.f7136d
            r0.setEnabled(r3)
            com.incode.welcome_sdk.d.bq r0 = r4.f18079k
            android.widget.FrameLayout r1 = r0.f7140h
            android.view.View r0 = r4.f18070b
            r1.removeView(r0)
            com.incode.welcome_sdk.ui.video_conference.VideoConferenceChatFragment r0 = r4.f18080m
            if (r0 != 0) goto L3a
        L23:
            java.lang.String r1 = r4.f18078j
            com.incode.welcome_sdk.ui.video_conference.VideoConferencePresenter r0 = r4.f18072d
            java.io.File r0 = r0.getSelfieFile()
            com.incode.welcome_sdk.ui.video_conference.VideoConferenceChatFragment r0 = com.incode.welcome_sdk.ui.video_conference.VideoConferenceChatFragment.newInstance(r1, r0)
            r4.f18080m = r0
            int r0 = com.incode.welcome_sdk.ui.video_conference.VideoConferenceActivity.f18068l
            int r1 = r0 + 65
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.video_conference.VideoConferenceActivity.f18069n = r0
            int r1 = r1 % r2
        L3a:
            androidx.fragment.app.FragmentManager r0 = r4.getSupportFragmentManager()
            yg.CX.ud()
            androidx.fragment.app.FragmentTransaction r2 = r0.beginTransaction()
            int r1 = com.incode.welcome_sdk.R.id.container_chat_fragment
            com.incode.welcome_sdk.ui.video_conference.VideoConferenceChatFragment r0 = r4.f18080m
            androidx.fragment.app.FragmentTransaction r1 = r2.add(r1, r0)
            r0 = 0
            androidx.fragment.app.FragmentTransaction r0 = r1.addToBackStack(r0)
            r0.commit()
            r4.f18074f = r3
            com.incode.welcome_sdk.d.bq r0 = r4.f18079k
            com.incode.welcome_sdk.views.IncodeTextView r1 = r0.f7142j
            r0 = 4
            r1.setVisibility(r0)
            return
        L60:
            com.incode.welcome_sdk.d.bq r0 = r4.f18079k
            android.widget.ImageButton r0 = r0.f7136d
            r0.setEnabled(r3)
            com.incode.welcome_sdk.d.bq r0 = r4.f18079k
            android.widget.FrameLayout r1 = r0.f7140h
            android.view.View r0 = r4.f18070b
            r1.removeView(r0)
            com.incode.welcome_sdk.ui.video_conference.VideoConferenceChatFragment r0 = r4.f18080m
            if (r0 != 0) goto L3a
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.video_conference.VideoConferenceActivity.j():void");
    }

    @Override // com.incode.welcome_sdk.ui.video_conference.VideoConferenceContract.View
    public void onVideoConferenceSet() {
        int i2 = 2 % 2;
        int i3 = f18069n + 83;
        f18068l = i3 % 128;
        int i4 = i3 % 2;
        if (this.f18075g) {
            c(this.f18079k.f7137e);
            int i5 = f18069n + 39;
            f18068l = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    @Override // com.incode.welcome_sdk.ui.video_conference.VideoConferenceContract.View
    public void updateNewChatMessageIndicator() {
        int i2 = 2 % 2;
        int i3 = f18068l + 85;
        f18069n = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 14 / 0;
            if (getSupportFragmentManager().getBackStackEntryCount() != 0) {
                return;
            }
        } else if (getSupportFragmentManager().getBackStackEntryCount() != 0) {
            return;
        }
        this.f18074f++;
        this.f18079k.f7142j.setText(String.valueOf(this.f18074f));
        this.f18079k.f7142j.setVisibility(0);
        int i5 = f18069n + 45;
        f18068l = i5 % 128;
        int i6 = i5 % 2;
    }

    public List<VideoConferenceChatMessage> getChatMessages() {
        int i2 = 2 % 2;
        int i3 = f18069n + 55;
        f18068l = i3 % 128;
        int i4 = i3 % 2;
        List<VideoConferenceChatMessage> chatMessages = this.f18072d.getChatMessages();
        if (i4 == 0) {
            int i5 = 76 / 0;
        }
        return chatMessages;
    }

    public PublishSubject<VideoConferenceChatMessage> getUserChatPublishSubject() {
        int i2 = 2 % 2;
        int i3 = f18069n + 49;
        f18068l = i3 % 128;
        int i4 = i3 % 2;
        PublishSubject<VideoConferenceChatMessage> userChatPublishSubject = this.f18072d.getUserChatPublishSubject();
        int i5 = f18068l + 55;
        f18069n = i5 % 128;
        if (i5 % 2 == 0) {
            return userChatPublishSubject;
        }
        throw null;
    }

    public PublishSubject<Boolean> getNewChatMessagePublishSubject() {
        int i2 = 2 % 2;
        int i3 = f18069n + 115;
        f18068l = i3 % 128;
        if (i3 % 2 == 0) {
            this.f18072d.getNewChatMessagePublishSubject();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        PublishSubject<Boolean> newChatMessagePublishSubject = this.f18072d.getNewChatMessagePublishSubject();
        int i4 = f18068l + 105;
        f18069n = i4 % 128;
        int i5 = i4 % 2;
        return newChatMessagePublishSubject;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        int i2 = 2 % 2;
        int i3 = f18068l + 91;
        f18069n = i3 % 128;
        int i4 = i3 % 2;
        super.onResume();
        this.f18072d.onResume();
        this.f18073e.setMode(2);
        int i5 = f18068l + 63;
        f18069n = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public ScreenName getScreenName() {
        int i2 = 2 % 2;
        int i3 = f18068l + 43;
        f18069n = i3 % 128;
        int i4 = i3 % 2;
        ScreenName screenName = ScreenName.CONFERENCE_VIDEO_CHAT;
        int i5 = f18068l + 19;
        f18069n = i5 % 128;
        int i6 = i5 % 2;
        return screenName;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public Modules getModule() {
        int i2 = 2 % 2;
        int i3 = f18068l + 31;
        f18069n = i3 % 128;
        if (i3 % 2 != 0) {
            Modules modules = Modules.CONFERENCE;
            throw null;
        }
        Modules modules2 = Modules.CONFERENCE;
        int i4 = f18069n + 123;
        f18068l = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 96 / 0;
        }
        return modules2;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        int i2 = 2 % 2;
        int i3 = f18069n + 53;
        f18068l = i3 % 128;
        int i4 = i3 % 2;
        super.onPause();
        this.f18072d.onPause();
        this.f18073e.setMode(0);
        int i5 = f18068l + 9;
        f18069n = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public void safeOnDestroy() {
        int i2 = 2 % 2;
        int i3 = f18068l + 11;
        f18069n = i3 % 128;
        int i4 = i3 % 2;
        this.f18072d.onDestroy();
        super.safeOnDestroy();
        int i5 = f18069n + 3;
        f18068l = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.permissions.PermissionsMandatoryContract.View
    public void onBtnOpenSettingsClicked() throws Exception {
        int i2 = 2 % 2;
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.addFlags(268435456);
        intent.setData(Uri.fromParts(SentryStackFrame.JsonKeys.PACKAGE, getPackageName(), null));
        CX.ud();
        startActivity(intent);
        int i3 = f18069n + 91;
        f18068l = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.permissions.PermissionsMandatoryContract.View
    public void onPermissionMandatoryDialogClosed(Exception exc) {
        int i2 = 2 % 2;
        if (getSupportFragmentManager().getBackStackEntryCount() <= 0) {
            finish();
            return;
        }
        int i3 = f18069n + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f18068l = i3 % 128;
        int i4 = i3 % 2;
        onBackButtonPressed();
        int i5 = f18069n + 43;
        f18068l = i5 % 128;
        int i6 = i5 % 2;
    }

    private static void d(ViewGroup viewGroup, View view) {
        Object[] objArr = {viewGroup, view};
        int iC = a.c();
        a(objArr, a.c(), -736962080, a.c(), 736962081, a.c(), iC);
    }

    private void c() {
        int iC = a.c();
        a(new Object[]{this}, a.c(), 1600132222, a.c(), -1600132222, a.c(), iC);
    }
}
