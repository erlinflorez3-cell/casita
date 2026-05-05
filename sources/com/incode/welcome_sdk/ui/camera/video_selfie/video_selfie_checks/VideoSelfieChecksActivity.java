package com.incode.welcome_sdk.ui.camera.video_selfie.video_selfie_checks;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.dynatrace.android.callback.Callback;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.d.br;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.ui.BaseActivity;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
import yg.QB;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public final class VideoSelfieChecksActivity extends BaseActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Companion f12582b = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f12583g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f12584h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f12585i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f12586j = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private br f12587c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Modules f12589e = Modules.VIDEO_ONBOARDING;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ScreenName f12588d = ScreenName.VIDEO_SELFIE;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$0$safeOnCreate$-Landroid-os-Bundle--V, reason: not valid java name */
    public static /* synthetic */ void m8416instrumented$0$safeOnCreate$LandroidosBundleV(VideoSelfieChecksActivity videoSelfieChecksActivity, View view) {
        Callback.onClick_enter(view);
        try {
            c(videoSelfieChecksActivity, view);
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
            short sXd = (short) (C1607wl.Xd() ^ ((1794556928 ^ 752537084) ^ 1177304331));
            short sXd2 = (short) (C1607wl.Xd() ^ (147986002 ^ 147995996));
            int[] iArr = new int["D1v4\u0018".length()];
            QB qb = new QB("D1v4\u0018");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
                i2++;
            }
            String str = new String(iArr, 0, i2);
            String strVd = hg.Vd("\u000f{", (short) (ZN.Xd() ^ (439986538 ^ 439992891)), (short) (ZN.Xd() ^ ((1438495820 ^ 249570039) ^ 1532864988)));
            try {
                Class<?> cls = Class.forName(str);
                Field field = 0 != 0 ? cls.getField(strVd) : cls.getDeclaredField(strVd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strUd = C1561oA.ud("UB\bE)", (short) (C1607wl.Xd() ^ ((16604176 ^ 725360245) ^ 734083049)));
                String strYd = C1561oA.yd("\u0006s", (short) (C1580rY.Xd() ^ (767706881 ^ (-767715260))));
                try {
                    Class<?> cls2 = Class.forName(strUd);
                    Field field2 = 0 != 0 ? cls2.getField(strYd) : cls2.getDeclaredField(strYd);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strYd2 = C1561oA.Yd("!\u0010W\u0017|", (short) (ZN.Xd() ^ (770855201 ^ 770861909)));
                    String strQd = Xg.qd("aW", (short) (C1607wl.Xd() ^ ((623580234 ^ 1478864445) ^ 2098119296)), (short) (C1607wl.Xd() ^ (1489303447 ^ 1489288095)));
                    try {
                        Class<?> cls3 = Class.forName(strYd2);
                        Field field3 = 0 != 0 ? cls3.getField(strQd) : cls3.getDeclaredField(strQd);
                        field3.setAccessible(true);
                        obj3 = field3.get(null);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    if (((WindowManager) obj3) == null) {
                        Object[] objArr = new Object[0];
                        Method declaredMethod = Class.forName(Jg.Wd("uCj\u0015U", (short) (C1499aX.Xd() ^ ((1495664757 ^ 57015995) ^ (-1514405570))), (short) (C1499aX.Xd() ^ (43853986 ^ (-43861922))))).getDeclaredMethod(ZO.xd(":(", (short) (C1633zX.Xd() ^ ((1000654041 ^ 794673819) ^ (-351877850))), (short) (C1633zX.Xd() ^ ((1051822470 ^ 1835332483) ^ (-1406499413)))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                String strUd2 = C1626yg.Ud("%Ky\u0007wK", (short) (C1633zX.Xd() ^ ((38709602 ^ 965140129) ^ (-1002995514))), (short) (C1633zX.Xd() ^ (1881823743 ^ (-1881818332))));
                                Class<?> cls4 = Class.forName(Ig.wd("\u001db\t1s0\u0019!'QTz@9%zr;`!R\u001c\u007f", (short) (FB.Xd() ^ (79397418 ^ 79411209))));
                                Class<?>[] clsArr = {Class.forName(EO.Od("\bTy\u0002Y=\u001c\u000b;#L\u0006n]tJ", (short) (C1607wl.Xd() ^ (457555900 ^ 457549820))))};
                                Object[] objArr2 = {strUd2};
                                short sXd3 = (short) (C1499aX.Xd() ^ (1508243537 ^ (-1508227980)));
                                int[] iArr2 = new int[".+9\u0017<55%,\u0011\".1#\u001c\u001d".length()];
                                QB qb2 = new QB(".+9\u0017<55%,\u0011\".1#\u001c\u001d");
                                int i3 = 0;
                                while (qb2.YK()) {
                                    int iKK2 = qb2.KK();
                                    Xu xuXd2 = Xu.Xd(iKK2);
                                    iArr2[i3] = xuXd2.fK(sXd3 + sXd3 + sXd3 + i3 + xuXd2.CK(iKK2));
                                    i3++;
                                }
                                Method method = cls4.getMethod(new String(iArr2, 0, i3), clsArr);
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    String strZd = C1593ug.zd("TC\u000bJ0", (short) (C1633zX.Xd() ^ ((1311227432 ^ 57060525) ^ (-1296128131))), (short) (C1633zX.Xd() ^ ((1914784956 ^ 1855730996) ^ (-482153234))));
                                    String strOd = C1561oA.od("}q", (short) (C1607wl.Xd() ^ (1817027917 ^ 1817036166)));
                                    try {
                                        Class<?> cls5 = Class.forName(strZd);
                                        Field field4 = 0 != 0 ? cls5.getField(strOd) : cls5.getDeclaredField(strOd);
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
                    String strKd = C1561oA.Kd(",\u001bb\"\b", (short) (C1499aX.Xd() ^ ((2132354721 ^ 1808685485) ^ (-349659709))));
                    short sXd4 = (short) (FB.Xd() ^ (655789265 ^ 655817742));
                    short sXd5 = (short) (FB.Xd() ^ (326141009 ^ 326167166));
                    int[] iArr3 = new int["C6".length()];
                    QB qb3 = new QB("C6");
                    int i4 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i4] = xuXd3.fK(((i4 * sXd5) ^ sXd4) + xuXd3.CK(iKK3));
                        i4++;
                    }
                    String str2 = new String(iArr3, 0, i4);
                    try {
                        Class<?> cls6 = Class.forName(strKd);
                        Field field5 = 0 != 0 ? cls6.getField(str2) : cls6.getDeclaredField(str2);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        String strXd = C1561oA.Xd("L;\u0003B(", (short) (C1499aX.Xd() ^ ((1302031407 ^ 589473628) ^ (-1857677735))));
                        String strVd2 = Wg.vd("^T", (short) (C1607wl.Xd() ^ (1242271339 ^ 1242274232)));
                        try {
                            Class<?> cls7 = Class.forName(strXd);
                            Field field6 = 0 != 0 ? cls7.getField(strVd2) : cls7.getDeclaredField(strVd2);
                            field6.setAccessible(true);
                            obj5 = field6.get(null);
                        } catch (Throwable th6) {
                            obj5 = null;
                        }
                        ((WindowManager) obj5).getDefaultDisplay().getMetrics(displayMetrics);
                        int x2 = (int) motionEvent.getX();
                        int y2 = (int) motionEvent.getY();
                        int i5 = 428692657 ^ 428692730;
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

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final Modules getModule() {
        Modules modules;
        int i2 = 2 % 2;
        int i3 = f12584h;
        int i4 = i3 + 89;
        f12585i = i4 % 128;
        if (i4 % 2 != 0) {
            modules = this.f12589e;
            int i5 = 17 / 0;
        } else {
            modules = this.f12589e;
        }
        int i6 = i3 + 53;
        f12585i = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 98 / 0;
        }
        return modules;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final ScreenName getScreenName() {
        int i2 = 2 % 2;
        int i3 = f12584h;
        int i4 = i3 + 105;
        f12585i = i4 % 128;
        int i5 = i4 % 2;
        ScreenName screenName = this.f12588d;
        int i6 = i3 + 7;
        f12585i = i6 % 128;
        int i7 = i6 % 2;
        return screenName;
    }

    private static final void c(VideoSelfieChecksActivity videoSelfieChecksActivity, View view) {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f12584h + 33;
        f12585i = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(videoSelfieChecksActivity, "");
            z2 = false;
        } else {
            Intrinsics.checkNotNullParameter(videoSelfieChecksActivity, "");
            z2 = true;
        }
        videoSelfieChecksActivity.b(z2);
        int i4 = f12585i + 31;
        f12584h = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0026  */
    @Override // com.incode.welcome_sdk.ui.BaseActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void safeOnCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            r6 = 2
            int r0 = r6 % r6
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_selfie_checks.VideoSelfieChecksActivity.f12584h
            int r2 = r0 + 117
            int r0 = r2 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.video_selfie_checks.VideoSelfieChecksActivity.f12585i = r0
            int r2 = r2 % r6
            r5 = 0
            java.lang.String r1 = ""
            if (r2 == 0) goto L6c
            super.safeOnCreate(r8)
            android.view.LayoutInflater r0 = r7.getLayoutInflater()
            com.incode.welcome_sdk.d.br r4 = com.incode.welcome_sdk.d.br.a(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r1)
            r7.f12587c = r4
            r0 = 4
            int r0 = r0 / 0
            if (r4 != 0) goto L2a
        L26:
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            r4 = r5
        L2a:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r4.c()
            android.view.View r0 = (android.view.View) r0
            r7.setContentView(r0)
            com.incode.welcome_sdk.ui.camera.video_selfie.video_selfie_checks.VideoSelfieChecksAdapter r3 = new com.incode.welcome_sdk.ui.camera.video_selfie.video_selfie_checks.VideoSelfieChecksAdapter
            r3.<init>()
            androidx.recyclerview.widget.RecyclerView r2 = r4.f7153e
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            r0 = r7
            android.content.Context r0 = (android.content.Context) r0
            r1.<init>(r0)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = (androidx.recyclerview.widget.RecyclerView.LayoutManager) r1
            r2.setLayoutManager(r1)
            androidx.recyclerview.widget.RecyclerView r1 = r4.f7153e
            r0 = r3
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = (androidx.recyclerview.widget.RecyclerView.Adapter) r0
            r1.setAdapter(r0)
            java.util.List r0 = r7.c()
            r3.addItems(r0)
            com.incode.welcome_sdk.views.IncodeButton r1 = r4.f7151c
            com.incode.welcome_sdk.ui.camera.video_selfie.video_selfie_checks.VideoSelfieChecksActivity$$ExternalSyntheticLambda1 r0 = new com.incode.welcome_sdk.ui.camera.video_selfie.video_selfie_checks.VideoSelfieChecksActivity$$ExternalSyntheticLambda1
            r0.<init>()
            r1.setOnClickListener(r0)
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_selfie_checks.VideoSelfieChecksActivity.f12585i
            int r1 = r0 + 13
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.video_selfie_checks.VideoSelfieChecksActivity.f12584h = r0
            int r1 = r1 % r6
            if (r1 == 0) goto L7f
            return
        L6c:
            super.safeOnCreate(r8)
            android.view.LayoutInflater r0 = r7.getLayoutInflater()
            com.incode.welcome_sdk.d.br r4 = com.incode.welcome_sdk.d.br.a(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r1)
            r7.f12587c = r4
            if (r4 != 0) goto L2a
            goto L26
        L7f:
            r5.hashCode()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.video_selfie.video_selfie_checks.VideoSelfieChecksActivity.safeOnCreate(android.os.Bundle):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(VideoSelfieChecksActivity videoSelfieChecksActivity, DialogInterface dialogInterface, int i2) {
        int i3 = 2 % 2;
        int i4 = f12585i + 33;
        f12584h = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(videoSelfieChecksActivity, "");
        videoSelfieChecksActivity.b(false);
        int i6 = f12585i + 35;
        f12584h = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void onBackButtonPressed() {
        int i2 = 2 % 2;
        int i3 = f12585i + 29;
        f12584h = i3 % 128;
        int i4 = i3 % 2;
        handleExit(new DialogInterface.OnClickListener() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_selfie_checks.VideoSelfieChecksActivity$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i5) {
                VideoSelfieChecksActivity.e(this.f$0, dialogInterface, i5);
            }
        });
        int i5 = f12584h + 53;
        f12585i = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void b(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f12584h + 95;
        f12585i = i3 % 128;
        if (i3 % 2 == 0) {
            IncodeWelcome.Companion.getInstance().getVideoSelfiePermissionChecksBus().onNext(Boolean.valueOf(z2));
            finish();
        } else {
            IncodeWelcome.Companion.getInstance().getVideoSelfiePermissionChecksBus().onNext(Boolean.valueOf(z2));
            finish();
            throw null;
        }
    }

    private final List<VideoSelfieIntroCheck> c() {
        int i2 = 2 % 2;
        boolean booleanExtra = getIntent().getBooleanExtra("extraSelfieScanEnabled", false);
        boolean booleanExtra2 = getIntent().getBooleanExtra("extraIdScanEnabled", false);
        boolean booleanExtra3 = getIntent().getBooleanExtra("extraRandomQuestionsEnabled", false);
        boolean booleanExtra4 = getIntent().getBooleanExtra("extraVoiceConsentEnabled", false);
        boolean booleanExtra5 = getIntent().getBooleanExtra("extraIsAudioDisabled", false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VideoSelfieIntroCheck(R.drawable.onboard_sdk_ic_user_permission_checkmark, R.string.onboard_sdk_video_selfie_check_recording_permission));
        if (booleanExtra2) {
            arrayList.add(new VideoSelfieIntroCheck(R.drawable.onboard_sdk_ic_front_id, R.string.onboard_sdk_video_selfie_check_front_id_scan));
            arrayList.add(new VideoSelfieIntroCheck(R.drawable.onboard_sdk_ic_back_id, R.string.onboard_sdk_video_selfie_check_back_id_scan));
        }
        if (booleanExtra) {
            arrayList.add(new VideoSelfieIntroCheck(R.drawable.onboard_sdk_ic_selfie_scan, R.string.onboard_sdk_video_selfie_check_selfie_scan));
            int i3 = f12584h + 9;
            f12585i = i3 % 128;
            int i4 = i3 % 2;
        }
        if (booleanExtra3) {
            int i5 = f12584h + 53;
            f12585i = i5 % 128;
            int i6 = i5 % 2;
            if (!booleanExtra5) {
                arrayList.add(new VideoSelfieIntroCheck(R.drawable.onboard_sdk_ic_questions, R.string.onboard_sdk_video_selfie_check_random_questions));
            }
        }
        if (!(!booleanExtra4) && !booleanExtra5) {
            arrayList.add(new VideoSelfieIntroCheck(R.drawable.onboard_sdk_ic_message, R.string.onboard_sdk_video_selfie_check_voice_consent));
        }
        return arrayList;
    }

    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f12590a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f12591b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f12592c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f12593d = 0;

        private Companion() {
        }

        @JvmStatic
        public final void start(Context context, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intent intent = new Intent(context, (Class<?>) VideoSelfieChecksActivity.class);
            intent.putExtra("extraIdScanEnabled", z2);
            intent.putExtra("extraSelfieScanEnabled", z3);
            intent.putExtra("extraRandomQuestionsEnabled", z4);
            intent.putExtra("extraVoiceConsentEnabled", z5);
            intent.putExtra("extraIsAudioDisabled", z6);
            CX.ud();
            context.startActivity(intent);
            int i3 = f12593d + 45;
            f12591b = i3 % 128;
            int i4 = i3 % 2;
        }

        public static int c() {
            int i2 = f12590a;
            int i3 = i2 % 8580412;
            f12590a = i2 + 1;
            if (i3 != 0) {
                return f12592c;
            }
            int i4 = (int) Runtime.getRuntime().totalMemory();
            f12592c = i4;
            return i4;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int i2 = f12583g + 63;
        f12586j = i2 % 128;
        int i3 = i2 % 2;
    }

    @JvmStatic
    public static final void start(Context context, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        int i2 = 2 % 2;
        int i3 = f12585i + 41;
        f12584h = i3 % 128;
        int i4 = i3 % 2;
        f12582b.start(context, z2, z3, z4, z5, z6);
        int i5 = f12584h + 77;
        f12585i = i5 % 128;
        int i6 = i5 % 2;
    }
}
