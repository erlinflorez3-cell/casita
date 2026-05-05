package com.incode.welcome_sdk.ui.camera.review_photo;

import android.R;
import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.callback.Callback;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.commons.extensions.ViewExtensionsKt;
import com.incode.welcome_sdk.commons.h;
import com.incode.welcome_sdk.commons.ui.AnimatorListenerWrapper;
import com.incode.welcome_sdk.commons.utils.LayoutUtils;
import com.incode.welcome_sdk.commons.utils.t;
import com.incode.welcome_sdk.d.w;
import com.incode.welcome_sdk.data.Event;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.ui.BaseActivity;
import com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType;
import com.incode.welcome_sdk.ui.camera.review_photo.ReviewPhotoContract;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1553lQ;
import yg.C1561oA;
import yg.C1580rY;
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
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public final class ReviewPhotoActivity extends BaseActivity implements ReviewPhotoContract.View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Companion f11929b = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f11930f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f11931g = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f11932i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f11933j = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private w f11934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Inject
    public ReviewPhotoPresenter f11935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private DocumentType f11936e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f11937h;

    public static /* synthetic */ Object d(Object[] objArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = ~i6;
        int i9 = ~i4;
        int i10 = (~(i8 | i9)) | (~(i9 | i7));
        int i11 = ~i7;
        int i12 = i10 | (~(i11 | i6 | i4));
        int i13 = i9 | i6;
        int i14 = (~(i7 | i6)) | (~i13);
        int i15 = i13 | i11;
        int i16 = i6 + i4 + i2 + ((-1468046718) * i5) + (327422179 * i3);
        int i17 = i16 * i16;
        int i18 = (677926197 * i6) + 1810235392 + (1154460365 * i4) + (i12 * (-238267084)) + ((-238267084) * i14) + (238267084 * i15) + (916193280 * i2) + (1933049856 * i5) + (743702528 * i3) + (286654464 * i17);
        int i19 = (i6 * (-645773371)) + 280972133 + (i4 * (-645772067)) + (i12 * (-652)) + (i14 * (-652)) + (i15 * 652) + (i2 * (-645772719)) + (i5 * 1523302178) + (i3 * 1475409363) + (i17 * (-1007288320));
        return i18 + ((i19 * i19) * (-492175360)) != 1 ? e(objArr) : d(objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$1$safeOnCreate$-Landroid-os-Bundle--V, reason: not valid java name */
    public static /* synthetic */ void m8329instrumented$1$safeOnCreate$LandroidosBundleV(ReviewPhotoActivity reviewPhotoActivity, View view) {
        Callback.onClick_enter(view);
        try {
            e(reviewPhotoActivity, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$2$safeOnCreate$-Landroid-os-Bundle--V, reason: not valid java name */
    public static /* synthetic */ void m8330instrumented$2$safeOnCreate$LandroidosBundleV(ReviewPhotoActivity reviewPhotoActivity, View view) {
        Callback.onClick_enter(view);
        try {
            a(reviewPhotoActivity, view);
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
            String strKd = Qg.kd("ZG\rJ.", (short) (C1607wl.Xd() ^ ((1387001004 ^ 618502168) ^ 1987468807)), (short) (C1607wl.Xd() ^ (264190825 ^ 264195597)));
            String strVd = hg.Vd("UB", (short) (Od.Xd() ^ ((283440765 ^ 1815385608) ^ (-2094021002))), (short) (Od.Xd() ^ (1161250676 ^ (-1161233241))));
            try {
                Class<?> cls = Class.forName(strKd);
                Field field = 0 != 0 ? cls.getField(strVd) : cls.getDeclaredField(strVd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strUd = C1561oA.ud("\ry?|`", (short) (ZN.Xd() ^ ((2071076244 ^ 933531494) ^ 1289153375)));
                short sXd = (short) (C1633zX.Xd() ^ (288654170 ^ (-288678240)));
                int[] iArr = new int["5!".length()];
                QB qb = new QB("5!");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
                    i2++;
                }
                String str = new String(iArr, 0, i2);
                try {
                    Class<?> cls2 = Class.forName(strUd);
                    Field field2 = 0 != 0 ? cls2.getField(str) : cls2.getDeclaredField(str);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    short sXd2 = (short) (OY.Xd() ^ ((421304684 ^ 785025815) ^ 936788710));
                    int[] iArr2 = new int["o^&eK".length()];
                    QB qb2 = new QB("o^&eK");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd2 + sXd2) + sXd2) + i3));
                        i3++;
                    }
                    String str2 = new String(iArr2, 0, i3);
                    short sXd3 = (short) (Od.Xd() ^ (2102760491 ^ (-2102769723)));
                    short sXd4 = (short) (Od.Xd() ^ (184554463 ^ (-184554301)));
                    int[] iArr3 = new int["\u001a\u0010".length()];
                    QB qb3 = new QB("\u001a\u0010");
                    int i4 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i4] = xuXd3.fK((xuXd3.CK(iKK3) - (sXd3 + i4)) + sXd4);
                        i4++;
                    }
                    String str3 = new String(iArr3, 0, i4);
                    try {
                        Class<?> cls3 = Class.forName(str2);
                        Field field3 = 0 != 0 ? cls3.getField(str3) : cls3.getDeclaredField(str3);
                        field3.setAccessible(true);
                        obj3 = field3.get(null);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    if (((WindowManager) obj3) == null) {
                        Class<?> cls4 = Class.forName(Jg.Wd("\u000em^\u0017*", (short) (OY.Xd() ^ ((1372539901 ^ 987423479) ^ 1796595700)), (short) (OY.Xd() ^ ((1034503005 ^ 315388392) ^ 795151149))));
                        Class<?>[] clsArr = new Class[0];
                        Object[] objArr = new Object[0];
                        short sXd5 = (short) (C1633zX.Xd() ^ ((591580903 ^ 2016128116) ^ (-1533640455)));
                        short sXd6 = (short) (C1633zX.Xd() ^ (286633597 ^ (-286646888)));
                        int[] iArr4 = new int["nH".length()];
                        QB qb4 = new QB("nH");
                        int i5 = 0;
                        while (qb4.YK()) {
                            int iKK4 = qb4.KK();
                            Xu xuXd4 = Xu.Xd(iKK4);
                            iArr4[i5] = xuXd4.fK(xuXd4.CK(iKK4) - (C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((i5 * sXd6) + sXd5)));
                            i5++;
                        }
                        Method declaredMethod = cls4.getDeclaredMethod(new String(iArr4, 0, i5), clsArr);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                Object[] objArr2 = {C1626yg.Ud("&n\u000f0e\t", (short) (Od.Xd() ^ ((1486083260 ^ 998931003) ^ (-1662640946))), (short) (Od.Xd() ^ (1326346945 ^ (-1326319186))))};
                                Method method = Class.forName(Ig.wd("!_\u0004=j@\u000b,+ZS_\u0002\u0019\u0007\"n9_*T#x", (short) (C1580rY.Xd() ^ ((1930726874 ^ 1592552923) ^ (-771277003))))).getMethod(C1561oA.Qd("pm{Y~wwgnSdpse^_", (short) (FB.Xd() ^ ((127883167 ^ 1299735139) ^ 1256662193))), Class.forName(EO.Od("f&\t[oktAi$CFote@", (short) (Od.Xd() ^ (112989528 ^ (-113009211))))));
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    short sXd7 = (short) (Od.Xd() ^ ((1357440745 ^ 1688598196) ^ (-877476773)));
                                    short sXd8 = (short) (Od.Xd() ^ (2121508254 ^ (-2121528887)));
                                    int[] iArr5 = new int["A0w7\u001d".length()];
                                    QB qb5 = new QB("A0w7\u001d");
                                    int i6 = 0;
                                    while (qb5.YK()) {
                                        int iKK5 = qb5.KK();
                                        Xu xuXd5 = Xu.Xd(iKK5);
                                        iArr5[i6] = xuXd5.fK((xuXd5.CK(iKK5) - (sXd7 + i6)) - sXd8);
                                        i6++;
                                    }
                                    String str4 = new String(iArr5, 0, i6);
                                    String strOd = C1561oA.od("\\P", (short) (C1580rY.Xd() ^ ((1380789835 ^ 2088872611) ^ (-785160142))));
                                    try {
                                        Class<?> cls5 = Class.forName(str4);
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
                    String strKd2 = C1561oA.Kd("(\u0017^\u001e\u0004", (short) (OY.Xd() ^ ((681997676 ^ 922417524) ^ 509380069)));
                    String strZd = Wg.Zd("}R", (short) (C1633zX.Xd() ^ ((1494186489 ^ 95889806) ^ (-1555591333))), (short) (C1633zX.Xd() ^ ((1576284036 ^ 405127010) ^ (-1171384684))));
                    try {
                        Class<?> cls6 = Class.forName(strKd2);
                        Field field5 = 0 != 0 ? cls6.getField(strZd) : cls6.getDeclaredField(strZd);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        String strXd = C1561oA.Xd("\u000byA\u0001f", (short) (C1607wl.Xd() ^ (111986328 ^ 111984251)));
                        String strVd2 = Wg.vd("I=", (short) (C1499aX.Xd() ^ (19221633 ^ (-19214221))));
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
                        int i7 = 1537300212 ^ 1537300159;
                        if (x2 > i7 && x2 < displayMetrics.widthPixels - i7 && y2 > i7 && y2 < displayMetrics.heightPixels - i7) {
                            C1553lQ.vd(motionEvent);
                            C1553lQ.Od(motionEvent);
                        }
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public static final /* synthetic */ void access$rotateImageViewInPlace(ReviewPhotoActivity reviewPhotoActivity) {
        int i2 = 2 % 2;
        int i3 = f11931g + 5;
        f11930f = i3 % 128;
        int i4 = i3 % 2;
        reviewPhotoActivity.d();
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = f11931g + 51;
        f11930f = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void access$scaleDownImageView(ReviewPhotoActivity reviewPhotoActivity) {
        int i2 = 2 % 2;
        int i3 = f11931g + 33;
        f11930f = i3 % 128;
        int i4 = i3 % 2;
        reviewPhotoActivity.e();
        if (i4 == 0) {
            int i5 = 17 / 0;
        }
        int i6 = f11930f + 55;
        f11931g = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final /* synthetic */ boolean access$shouldRotateDocument(ReviewPhotoActivity reviewPhotoActivity) {
        int i2 = 2 % 2;
        int i3 = f11930f + 11;
        f11931g = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {reviewPhotoActivity};
        int iE = h.e();
        boolean zBooleanValue = ((Boolean) d(objArr, h.e(), h.e(), -597806257, h.e(), 597806257, iE)).booleanValue();
        int i5 = f11930f + 35;
        f11931g = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 54 / 0;
        }
        return zBooleanValue;
    }

    public final ReviewPhotoPresenter getMReviewPhotoPresenter() {
        int i2 = 2 % 2;
        int i3 = f11930f;
        int i4 = i3 + 109;
        f11931g = i4 % 128;
        int i5 = i4 % 2;
        ReviewPhotoPresenter reviewPhotoPresenter = this.f11935d;
        if (reviewPhotoPresenter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i6 = i3 + 95;
        f11931g = i6 % 128;
        int i7 = i6 % 2;
        return reviewPhotoPresenter;
    }

    public final void setMReviewPhotoPresenter(ReviewPhotoPresenter reviewPhotoPresenter) {
        int i2 = 2 % 2;
        int i3 = f11931g + 95;
        f11930f = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(reviewPhotoPresenter, "");
        this.f11935d = reviewPhotoPresenter;
        int i5 = f11931g + 39;
        f11930f = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    @Override // com.incode.welcome_sdk.ui.BaseView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.incode.welcome_sdk.ScreenName getScreenName() {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.ui.camera.review_photo.ReviewPhotoActivity.f11931g
            int r1 = r0 + 101
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.review_photo.ReviewPhotoActivity.f11930f = r0
            int r1 = r1 % r3
            if (r1 != 0) goto L2f
            com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType r2 = r4.f11936e
            r0 = 88
            int r0 = r0 / 0
            if (r2 != 0) goto L1c
        L16:
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r2 = 0
        L1c:
            int[] r1 = com.incode.welcome_sdk.ui.camera.review_photo.ReviewPhotoActivity.WhenMappings.f11940b
            int r0 = r2.ordinal()
            r1 = r1[r0]
            r0 = 1
            if (r1 == r0) goto L37
            if (r1 == r3) goto L37
            r0 = 3
            if (r1 == r0) goto L34
            com.incode.welcome_sdk.ScreenName r0 = com.incode.welcome_sdk.ScreenName.DOCUMENT_REVIEW_PHOTO
            return r0
        L2f:
            com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType r2 = r4.f11936e
            if (r2 != 0) goto L1c
            goto L16
        L34:
            com.incode.welcome_sdk.ScreenName r0 = com.incode.welcome_sdk.ScreenName.BACK_ID_REVIEW_PHOTO
            return r0
        L37:
            com.incode.welcome_sdk.ScreenName r2 = com.incode.welcome_sdk.ScreenName.FRONT_ID_REVIEW_PHOTO
            int r0 = com.incode.welcome_sdk.ui.camera.review_photo.ReviewPhotoActivity.f11930f
            int r1 = r0 + 113
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.review_photo.ReviewPhotoActivity.f11931g = r0
            int r1 = r1 % r3
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.review_photo.ReviewPhotoActivity.getScreenName():com.incode.welcome_sdk.ScreenName");
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final Modules getModule() {
        int i2 = 2 % 2;
        int i3 = f11930f + 21;
        f11931g = i3 % 128;
        int i4 = i3 % 2;
        DocumentType documentType = this.f11936e;
        if (documentType == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i5 = f11931g + 77;
            f11930f = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 5 / 4;
            }
            documentType = null;
        }
        int i7 = WhenMappings.f11940b[documentType.ordinal()];
        if (i7 == 1 || i7 == 2 || i7 == 3) {
            return Modules.ID;
        }
        return Modules.DOCUMENT_CAPTURE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(ReviewPhotoActivity reviewPhotoActivity) {
        int i2 = 2 % 2;
        int i3 = f11930f + 113;
        f11931g = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(reviewPhotoActivity, "");
        View[] viewArr = new View[2];
        w wVar = reviewPhotoActivity.f11934c;
        Object obj = null;
        if (wVar == null) {
            int i5 = f11931g + 77;
            f11930f = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            wVar = null;
        }
        viewArr[0] = wVar.f7387a;
        w wVar2 = reviewPhotoActivity.f11934c;
        if (wVar2 == null) {
            int i7 = f11930f + 37;
            f11931g = i7 % 128;
            int i8 = i7 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i8 != 0) {
                obj.hashCode();
                throw null;
            }
            wVar2 = null;
        }
        viewArr[1] = wVar2.f7388b;
        LayoutUtils.equalizeWidths(viewArr);
        int i9 = f11931g + 7;
        f11930f = i9 % 128;
        if (i9 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static final void e(ReviewPhotoActivity reviewPhotoActivity, View view) {
        int i2 = 2 % 2;
        int i3 = f11930f + 107;
        f11931g = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(reviewPhotoActivity, "");
            Intrinsics.checkNotNull(view);
            ViewExtensionsKt.preventDoubleClick(view);
            reviewPhotoActivity.b();
            return;
        }
        Intrinsics.checkNotNullParameter(reviewPhotoActivity, "");
        Intrinsics.checkNotNull(view);
        ViewExtensionsKt.preventDoubleClick(view);
        reviewPhotoActivity.b();
        int i4 = 83 / 0;
    }

    private static final void a(ReviewPhotoActivity reviewPhotoActivity, View view) {
        int i2 = 2 % 2;
        int i3 = f11931g + 7;
        f11930f = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(reviewPhotoActivity, "");
        Intrinsics.checkNotNull(view);
        ViewExtensionsKt.preventDoubleClick(view);
        reviewPhotoActivity.i();
        int i5 = f11931g + 87;
        f11930f = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void safeOnCreate(Bundle bundle) {
        int i2 = 2 % 2;
        if (IncodeWelcome.Companion.getInstance().isUnsafeEnvironmentDetected()) {
            int i3 = f11930f + 93;
            f11931g = i3 % 128;
            int i4 = i3 % 2;
            finish();
        }
        super.safeOnCreate(bundle);
        w wVarB = w.b(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(wVarB, "");
        this.f11934c = wVarB;
        w wVar = null;
        if (wVarB == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            wVarB = null;
        }
        setContentView(wVarB.e());
        DaggerReviewPhotoComponent.builder().incodeWelcomeRepositoryComponent(IncodeWelcome.Companion.getInstance().getIncodeWelcomeRepositoryComponent()).reviewPhotoPresenterModule(new ReviewPhotoPresenterModule(this)).build().inject(this);
        w wVar2 = this.f11934c;
        if (wVar2 == null) {
            int i5 = f11931g + 51;
            f11930f = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i7 = f11930f + 111;
            f11931g = i7 % 128;
            int i8 = i7 % 2;
            wVar2 = null;
        }
        wVar2.f7387a.post(new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.review_photo.ReviewPhotoActivity$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ReviewPhotoActivity.c(this.f$0);
            }
        });
        DocumentType documentTypeD = t.d(getIntent());
        Intrinsics.checkNotNullExpressionValue(documentTypeD, "");
        this.f11936e = documentTypeD;
        if (documentTypeD == null) {
            int i9 = f11931g + 7;
            f11930f = i9 % 128;
            if (i9 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            documentTypeD = null;
        }
        d(new Object[]{this, documentTypeD}, h.e(), h.e(), 985245454, h.e(), -985245453, h.e());
        a();
        c();
        w wVar3 = this.f11934c;
        if (wVar3 == null) {
            int i10 = f11930f + 53;
            f11931g = i10 % 128;
            int i11 = i10 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            wVar3 = null;
        }
        wVar3.f7387a.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.camera.review_photo.ReviewPhotoActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReviewPhotoActivity.m8329instrumented$1$safeOnCreate$LandroidosBundleV(this.f$0, view);
            }
        });
        w wVar4 = this.f11934c;
        if (wVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            wVar = wVar4;
        }
        wVar.f7388b.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.camera.review_photo.ReviewPhotoActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReviewPhotoActivity.m8330instrumented$2$safeOnCreate$LandroidosBundleV(this.f$0, view);
            }
        });
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final boolean isDelayedOnboardingSupported() {
        int i2 = 2 % 2;
        int i3 = f11931g + 1;
        f11930f = i3 % 128;
        return i3 % 2 != 0;
    }

    private final void c() {
        int i2 = 2 % 2;
        int i3 = f11930f + 67;
        f11931g = i3 % 128;
        if (i3 % 2 != 0) {
            Window window = getWindow();
            Transition transitionInflateTransition = TransitionInflater.from(this).inflateTransition(R.transition.move);
            transitionInflateTransition.setDuration(900L);
            window.setSharedElementEnterTransition(transitionInflateTransition);
            getWindow().getSharedElementEnterTransition();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Window window2 = getWindow();
        Transition transitionInflateTransition2 = TransitionInflater.from(this).inflateTransition(R.transition.move);
        transitionInflateTransition2.setDuration(900L);
        window2.setSharedElementEnterTransition(transitionInflateTransition2);
        Transition sharedElementEnterTransition = getWindow().getSharedElementEnterTransition();
        if (sharedElementEnterTransition != null) {
            sharedElementEnterTransition.addListener(new Transition.TransitionListener() { // from class: com.incode.welcome_sdk.ui.camera.review_photo.ReviewPhotoActivity$handleScreenTransition$2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private static int f11943b = 1;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private static int f11944e = 0;

                @Override // android.transition.Transition.TransitionListener
                public final void onTransitionEnd(Transition transition) {
                    int i4 = 2 % 2;
                    int i5 = f11944e + 93;
                    f11943b = i5 % 128;
                    int i6 = i5 % 2;
                    Intrinsics.checkNotNullParameter(transition, "");
                    if (ReviewPhotoActivity.access$shouldRotateDocument(this.f11945a)) {
                        ReviewPhotoActivity.access$rotateImageViewInPlace(this.f11945a);
                        int i7 = f11943b + 105;
                        f11944e = i7 % 128;
                        int i8 = i7 % 2;
                    }
                    int i9 = f11943b + 89;
                    f11944e = i9 % 128;
                    if (i9 % 2 != 0) {
                        int i10 = 92 / 0;
                    }
                }

                @Override // android.transition.Transition.TransitionListener
                public final void onTransitionStart(Transition transition) {
                    int i4 = 2 % 2;
                    int i5 = f11943b + 23;
                    f11944e = i5 % 128;
                    int i6 = i5 % 2;
                    Intrinsics.checkNotNullParameter(transition, "");
                    int i7 = f11943b + 7;
                    f11944e = i7 % 128;
                    if (i7 % 2 != 0) {
                        int i8 = 68 / 0;
                    }
                }

                @Override // android.transition.Transition.TransitionListener
                public final void onTransitionCancel(Transition transition) {
                    int i4 = 2 % 2;
                    int i5 = f11943b + 29;
                    f11944e = i5 % 128;
                    int i6 = i5 % 2;
                    Intrinsics.checkNotNullParameter(transition, "");
                    int i7 = f11943b + 77;
                    f11944e = i7 % 128;
                    if (i7 % 2 == 0) {
                        return;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }

                @Override // android.transition.Transition.TransitionListener
                public final void onTransitionPause(Transition transition) {
                    int i4 = 2 % 2;
                    int i5 = f11943b + 55;
                    f11944e = i5 % 128;
                    int i6 = i5 % 2;
                    Intrinsics.checkNotNullParameter(transition, "");
                    int i7 = f11944e + 81;
                    f11943b = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 74 / 0;
                    }
                }

                @Override // android.transition.Transition.TransitionListener
                public final void onTransitionResume(Transition transition) {
                    int i4 = 2 % 2;
                    int i5 = f11944e + 83;
                    f11943b = i5 % 128;
                    int i6 = i5 % 2;
                    Intrinsics.checkNotNullParameter(transition, "");
                    int i7 = f11944e + 25;
                    f11943b = i7 % 128;
                    int i8 = i7 % 2;
                }
            });
            return;
        }
        int i4 = f11930f + 47;
        f11931g = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void a() {
        int i2 = 2 % 2;
        w wVar = this.f11934c;
        if (wVar == null) {
            int i3 = f11930f + 55;
            f11931g = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i5 = f11931g + 99;
            f11930f = i5 % 128;
            int i6 = i5 % 2;
            wVar = null;
        }
        wVar.f7391e.setText(getString(com.incode.welcome_sdk.R.string.onboard_sdk_bullet_point) + Global.BLANK + getString(com.incode.welcome_sdk.R.string.onboard_sdk_review_your_photo_hint1));
        wVar.f7390d.setText(getString(com.incode.welcome_sdk.R.string.onboard_sdk_bullet_point) + Global.BLANK + getString(com.incode.welcome_sdk.R.string.onboard_sdk_review_your_photo_hint2));
    }

    private final void d() {
        int i2 = 2 % 2;
        w wVar = this.f11934c;
        w wVar2 = null;
        if (wVar == null) {
            int i3 = f11930f + 37;
            f11931g = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            wVar = null;
        }
        this.f11937h = wVar.f7389c.getMeasuredHeight();
        w wVar3 = this.f11934c;
        if (wVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            wVar3 = null;
        }
        ImageView imageView = wVar3.f7389c;
        w wVar4 = this.f11934c;
        if (wVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            wVar4 = null;
        }
        imageView.setPivotX(wVar4.f7389c.getWidth() / 2);
        w wVar5 = this.f11934c;
        if (wVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            wVar5 = null;
        }
        ImageView imageView2 = wVar5.f7389c;
        w wVar6 = this.f11934c;
        if (wVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            wVar6 = null;
        }
        imageView2.setPivotY(wVar6.f7389c.getHeight() / 2);
        w wVar7 = this.f11934c;
        if (wVar7 == null) {
            int i4 = f11930f + 67;
            f11931g = i4 % 128;
            if (i4 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            wVar2 = wVar7;
        }
        wVar2.f7389c.animate().rotation(90.0f).setListener(new AnimatorListenerWrapper() { // from class: com.incode.welcome_sdk.ui.camera.review_photo.ReviewPhotoActivity$rotateImageViewInPlace$1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f11946b = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f11947d = 1;

            @Override // com.incode.welcome_sdk.commons.ui.AnimatorListenerWrapper, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                int i5 = 2 % 2;
                int i6 = f11946b + 45;
                f11947d = i6 % 128;
                int i7 = i6 % 2;
                Intrinsics.checkNotNullParameter(animator, "");
                ReviewPhotoActivity.access$scaleDownImageView(this.f11948c);
                int i8 = f11946b + 59;
                f11947d = i8 % 128;
                int i9 = i8 % 2;
            }
        }).start();
    }

    private final void e() {
        float f2;
        int i2 = 2 % 2;
        int i3 = f11931g + 25;
        f11930f = i3 % 128;
        int i4 = i3 % 2;
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        if (this.f11937h >= displayMetrics.widthPixels) {
            f2 = 0.8f;
        } else if (displayMetrics.widthPixels - this.f11937h >= 150) {
            int i5 = f11930f + 69;
            f11931g = i5 % 128;
            int i6 = i5 % 2;
            f2 = 1.1f;
        } else {
            f2 = 1.0f;
        }
        w wVar = this.f11934c;
        if (wVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            wVar = null;
        }
        wVar.f7389c.animate().scaleX(f2).setListener(null).start();
        w wVar2 = this.f11934c;
        if (wVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            wVar2 = null;
        }
        wVar2.f7389c.animate().scaleY(f2).setListener(null).start();
        int i7 = f11931g + 89;
        f11930f = i7 % 128;
        int i8 = i7 % 2;
    }

    private final void b() {
        int i2 = 2 % 2;
        getMReviewPhotoPresenter().sendEvent(Event.RETAKE_TRY_AGAIN, getModule(), getScreenName());
        setResult(-1, new Intent().putExtra("extraReviewPhotoResult", ReviewPhotoResult.SCAN_AGAIN));
        finish();
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        int i3 = f11930f + 105;
        f11931g = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    private final void i() {
        int i2 = 2 % 2;
        getMReviewPhotoPresenter().sendEvent(Event.RETAKE_CONTINUE, getModule(), getScreenName());
        setResult(-1, new Intent().putExtra("extraReviewPhotoResult", ReviewPhotoResult.CONTINUE));
        finish();
        int i3 = f11931g + 63;
        f11930f = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object e(java.lang.Object[] r7) {
        /*
            r0 = 0
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            r3 = r7[r0]
            com.incode.welcome_sdk.ui.camera.review_photo.ReviewPhotoActivity r3 = (com.incode.welcome_sdk.ui.camera.review_photo.ReviewPhotoActivity) r3
            r5 = 2
            int r0 = r5 % r5
            com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType r1 = r3.f11936e
            java.lang.String r4 = ""
            r2 = 0
            if (r1 != 0) goto L22
            int r0 = com.incode.welcome_sdk.ui.camera.review_photo.ReviewPhotoActivity.f11930f
            int r1 = r0 + 121
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.review_photo.ReviewPhotoActivity.f11931g = r0
            int r1 = r1 % r5
            if (r1 != 0) goto L83
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            r1 = r2
        L22:
            com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType.FRONT_ID
            if (r1 == r0) goto L64
            int r0 = com.incode.welcome_sdk.ui.camera.review_photo.ReviewPhotoActivity.f11931g
            int r1 = r0 + 99
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.review_photo.ReviewPhotoActivity.f11930f = r0
            int r1 = r1 % r5
            com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType r1 = r3.f11936e
            if (r1 != 0) goto L37
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            r1 = r2
        L37:
            com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType.BACK_ID
            if (r1 == r0) goto L64
            com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType r1 = r3.f11936e
            if (r1 != 0) goto L55
            int r0 = com.incode.welcome_sdk.ui.camera.review_photo.ReviewPhotoActivity.f11931g
            int r1 = r0 + 43
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.review_photo.ReviewPhotoActivity.f11930f = r0
            int r1 = r1 % r5
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            int r0 = com.incode.welcome_sdk.ui.camera.review_photo.ReviewPhotoActivity.f11930f
            int r1 = r0 + 103
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.review_photo.ReviewPhotoActivity.f11931g = r0
            int r1 = r1 % r5
            r1 = r2
        L55:
            com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType.PASSPORT
            if (r1 == r0) goto L64
            com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType r0 = r3.f11936e
            if (r0 != 0) goto L7a
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
        L60:
            com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType.MEDICAL_DOC
            if (r2 != r0) goto L82
        L64:
            com.incode.welcome_sdk.data.IncodeWelcomeRepository r0 = r3.getRepo()
            boolean r0 = r0.isEnabledRotationOnRetakeScreen()
            if (r0 == 0) goto L82
            int r0 = com.incode.welcome_sdk.ui.camera.review_photo.ReviewPhotoActivity.f11931g
            int r1 = r0 + 105
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.review_photo.ReviewPhotoActivity.f11930f = r0
            int r1 = r1 % r5
            if (r1 != 0) goto L7c
            return r6
        L7a:
            r2 = r0
            goto L60
        L7c:
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L82:
            return r6
        L83:
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            r2.hashCode()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.review_photo.ReviewPhotoActivity.e(java.lang.Object[]):java.lang.Object");
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void onBackButtonPressed() {
        int i2 = 2 % 2;
        int i3 = f11931g + 5;
        f11930f = i3 % 128;
        int i4 = i3 % 2;
        b();
        int i5 = f11931g + 53;
        f11930f = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object d(java.lang.Object[] r8) {
        /*
            r7 = 0
            r6 = r8[r7]
            com.incode.welcome_sdk.ui.camera.review_photo.ReviewPhotoActivity r6 = (com.incode.welcome_sdk.ui.camera.review_photo.ReviewPhotoActivity) r6
            r0 = 1
            r2 = r8[r0]
            com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType r2 = (com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType) r2
            r5 = 2
            int r0 = r5 % r5
            int r0 = com.incode.welcome_sdk.ui.camera.review_photo.ReviewPhotoActivity.f11931g
            int r1 = r0 + 65
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.review_photo.ReviewPhotoActivity.f11930f = r0
            int r1 = r1 % r5
            com.incode.welcome_sdk.ui.camera.review_photo.ReviewPhotoPresenter r0 = r6.getMReviewPhotoPresenter()
            java.io.File r4 = r0.getImageFile(r2)
            r3 = 0
            if (r4 == 0) goto L52
            int r0 = com.incode.welcome_sdk.ui.camera.review_photo.ReviewPhotoActivity.f11931g
            int r0 = r0 + 51
            int r2 = r0 % 128
            com.incode.welcome_sdk.ui.camera.review_photo.ReviewPhotoActivity.f11930f = r2
            int r0 = r0 % r5
            if (r0 != 0) goto L57
            com.incode.welcome_sdk.d.w r1 = r6.f11934c
            r0 = 11
            int r0 = r0 / r7
            if (r1 != 0) goto L45
        L33:
            int r1 = r2 + 113
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.review_photo.ReviewPhotoActivity.f11931g = r0
            int r1 = r1 % r5
            java.lang.String r0 = ""
            if (r1 == 0) goto L53
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r0 = 84
            int r0 = r0 / r7
        L44:
            r1 = r3
        L45:
            android.widget.ImageView r1 = r1.f7389c
            java.lang.String r0 = r4.getAbsolutePath()
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFile(r0)
            r1.setImageBitmap(r0)
        L52:
            return r3
        L53:
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            goto L44
        L57:
            com.incode.welcome_sdk.d.w r1 = r6.f11934c
            if (r1 != 0) goto L45
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.review_photo.ReviewPhotoActivity.d(java.lang.Object[]):java.lang.Object");
    }

    public static final class Companion {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f11938b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f11939c = 0;

        private Companion() {
        }

        @JvmStatic
        public final void startForResult(Activity activity, DocumentType documentType, Bundle bundle) throws Exception {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(documentType, "");
            Intrinsics.checkNotNullParameter(bundle, "");
            Intent intent = new Intent(activity, (Class<?>) ReviewPhotoActivity.class);
            intent.putExtra("extraDocumentType", documentType);
            CX.ud();
            activity.startActivityForResult(intent, 18087, bundle);
            activity.overridePendingTransition(0, 0);
            int i3 = f11939c + 67;
            f11938b = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 24 / 0;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int i2 = f11933j + 35;
        f11932i = i2 % 128;
        int i3 = i2 % 2;
    }

    @JvmStatic
    public static final void startForResult(Activity activity, DocumentType documentType, Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = f11931g + 53;
        f11930f = i3 % 128;
        int i4 = i3 % 2;
        f11929b.startForResult(activity, documentType, bundle);
        if (i4 == 0) {
            throw null;
        }
    }

    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f11940b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f11941d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f11942e = 1;

        static {
            int[] iArr = new int[DocumentType.values().length];
            try {
                iArr[DocumentType.FRONT_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DocumentType.PASSPORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DocumentType.BACK_ID.ordinal()] = 3;
                int i2 = f11941d + 55;
                f11942e = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            f11940b = iArr;
            int i5 = f11942e + 13;
            f11941d = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 28 / 0;
            }
        }
    }

    private final void d(DocumentType documentType) {
        int iE = h.e();
        d(new Object[]{this, documentType}, h.e(), h.e(), 985245454, h.e(), -985245453, iE);
    }

    private final boolean j() {
        int iE = h.e();
        return ((Boolean) d(new Object[]{this}, h.e(), h.e(), -597806257, h.e(), 597806257, iE)).booleanValue();
    }
}
