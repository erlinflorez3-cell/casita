package com.incode.welcome_sdk.ui.signature_form;

import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ProgressBar;
import com.dynatrace.android.callback.Callback;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.extensions.ViewExtensionsKt;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.results.SignatureFormResult;
import com.incode.welcome_sdk.ui.signature_form.SignatureFormContract;
import com.incode.welcome_sdk.ui.signature_form.base.BaseSignatureFormActivity;
import com.incode.welcome_sdk.views.IncodeButton;
import com.incode.welcome_sdk.views.IncodeTextView;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1553lQ;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
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

/* JADX INFO: loaded from: classes5.dex */
public final class SignatureFormActivity extends BaseSignatureFormActivity implements SignatureFormContract.View {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f17448g = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f17449i = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SignatureFormPresenter f17451d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScreenName f17450b = ScreenName.SIGNATURE_INPUT;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Modules f17452j = Modules.SIGNATURE;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$0$safeOnCreate$-Landroid-os-Bundle--V, reason: not valid java name */
    public static /* synthetic */ void m8560instrumented$0$safeOnCreate$LandroidosBundleV(SignatureFormActivity signatureFormActivity, View view) {
        Callback.onClick_enter(view);
        try {
            c(signatureFormActivity, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$1$safeOnCreate$-Landroid-os-Bundle--V, reason: not valid java name */
    public static /* synthetic */ void m8561instrumented$1$safeOnCreate$LandroidosBundleV(SignatureFormActivity signatureFormActivity, View view) {
        Callback.onClick_enter(view);
        try {
            e(signatureFormActivity, view);
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
            String strKd = Qg.kd("\u000ez@}a", (short) (C1633zX.Xd() ^ ((962619077 ^ 892174188) ^ (-206376440))), (short) (C1633zX.Xd() ^ (508728279 ^ (-508731476))));
            String strVd = hg.Vd("7$", (short) (C1607wl.Xd() ^ ((501414828 ^ 1761192520) ^ 1964710538)), (short) (C1607wl.Xd() ^ ((1935599947 ^ 1241774416) ^ 962420817)));
            try {
                Class<?> cls = Class.forName(strKd);
                Field field = 0 != 0 ? cls.getField(strVd) : cls.getDeclaredField(strVd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strUd = C1561oA.ud(";(m+\u000f", (short) (ZN.Xd() ^ (489586313 ^ 489576567)));
                short sXd = (short) (C1607wl.Xd() ^ (206467631 ^ 206439423));
                int[] iArr = new int["G5".length()];
                QB qb = new QB("G5");
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
                    String strYd = C1561oA.Yd(")\u0018_\u001f\u0005", (short) (OY.Xd() ^ ((375771152 ^ 256194986) ^ 421561249)));
                    String strQd = Xg.qd("\u000b\u0001", (short) (OY.Xd() ^ ((199386157 ^ 1804560868) ^ 1617775561)), (short) (OY.Xd() ^ (1357600596 ^ 1357604548)));
                    try {
                        Class<?> cls3 = Class.forName(strYd);
                        Field field3 = 0 != 0 ? cls3.getField(strQd) : cls3.getDeclaredField(strQd);
                        field3.setAccessible(true);
                        obj3 = field3.get(null);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    if (((WindowManager) obj3) == null) {
                        short sXd2 = (short) (ZN.Xd() ^ ((1097770835 ^ 104809122) ^ 1196524925));
                        short sXd3 = (short) (ZN.Xd() ^ (2005136238 ^ 2005123076));
                        int[] iArr2 = new int["4v\u0002\u001a?".length()];
                        QB qb2 = new QB("4v\u0002\u001a?");
                        int i3 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((i3 * sXd3) ^ sXd2));
                            i3++;
                        }
                        Object[] objArr = new Object[0];
                        Method declaredMethod = Class.forName(new String(iArr2, 0, i3)).getDeclaredMethod(ZO.xd("{L", (short) (Od.Xd() ^ (1315434558 ^ (-1315406073))), (short) (Od.Xd() ^ (877006740 ^ (-877005477)))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                short sXd4 = (short) (OY.Xd() ^ (391065156 ^ 391053994));
                                short sXd5 = (short) (OY.Xd() ^ (570027876 ^ 570031158));
                                int[] iArr3 = new int["Z\u0014\fm\nQ".length()];
                                QB qb3 = new QB("Z\u0014\fm\nQ");
                                int i4 = 0;
                                while (qb3.YK()) {
                                    int iKK3 = qb3.KK();
                                    Xu xuXd3 = Xu.Xd(iKK3);
                                    iArr3[i4] = xuXd3.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd4 + sXd4) + (i4 * sXd5))) + xuXd3.CK(iKK3));
                                    i4++;
                                }
                                String str2 = new String(iArr3, 0, i4);
                                Class<?> cls4 = Class.forName(Ig.wd("R9?k7[@hZ\r\u00102OP\rb\u001eV\u001c(U7S", (short) (ZN.Xd() ^ ((1087876048 ^ 1355377549) ^ 270436690))));
                                Class<?>[] clsArr = {Class.forName(EO.Od("T\u0004;A\u0006\nf;\bM\tT\u0002j >", (short) (ZN.Xd() ^ (618237780 ^ 618261239))))};
                                Object[] objArr2 = {str2};
                                short sXd6 = (short) (FB.Xd() ^ ((702328803 ^ 966230935) ^ 273355916));
                                int[] iArr4 = new int["sp~\\\u0002zzjqVgsvhab".length()];
                                QB qb4 = new QB("sp~\\\u0002zzjqVgsvhab");
                                int i5 = 0;
                                while (qb4.YK()) {
                                    int iKK4 = qb4.KK();
                                    Xu xuXd4 = Xu.Xd(iKK4);
                                    iArr4[i5] = xuXd4.fK(sXd6 + sXd6 + sXd6 + i5 + xuXd4.CK(iKK4));
                                    i5++;
                                }
                                Method method = cls4.getMethod(new String(iArr4, 0, i5), clsArr);
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    short sXd7 = (short) (Od.Xd() ^ ((2085860976 ^ 1137562313) ^ (-1067323933)));
                                    short sXd8 = (short) (Od.Xd() ^ ((1744756243 ^ 2098895448) ^ (-451157868)));
                                    int[] iArr5 = new int["/\u001ee%\u000b".length()];
                                    QB qb5 = new QB("/\u001ee%\u000b");
                                    int i6 = 0;
                                    while (qb5.YK()) {
                                        int iKK5 = qb5.KK();
                                        Xu xuXd5 = Xu.Xd(iKK5);
                                        iArr5[i6] = xuXd5.fK((xuXd5.CK(iKK5) - (sXd7 + i6)) - sXd8);
                                        i6++;
                                    }
                                    String str3 = new String(iArr5, 0, i6);
                                    String strOd = C1561oA.od("zn", (short) (OY.Xd() ^ (1111020596 ^ 1111009299)));
                                    try {
                                        Class<?> cls5 = Class.forName(str3);
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
                    String strKd2 = C1561oA.Kd("ud,kQ", (short) (C1607wl.Xd() ^ ((97126709 ^ 1606037792) ^ 1517307756)));
                    String strZd = Wg.Zd("B/", (short) (C1633zX.Xd() ^ (1135550769 ^ (-1135560622))), (short) (C1633zX.Xd() ^ ((15682476 ^ 1396803225) ^ (-1403972510))));
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
                        String strXd = C1561oA.Xd("\bv>}c", (short) (C1499aX.Xd() ^ ((1988577144 ^ 1771634804) ^ (-522069857))));
                        String strVd2 = Wg.vd("OC", (short) (C1607wl.Xd() ^ (706205065 ^ 706194199)));
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
                        int i7 = (81124957 ^ 831192408) ^ 895427406;
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

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final ScreenName getScreenName() {
        int i2 = 2 % 2;
        int i3 = f17448g;
        int i4 = i3 + 95;
        f17449i = i4 % 128;
        int i5 = i4 % 2;
        ScreenName screenName = this.f17450b;
        int i6 = i3 + 47;
        f17449i = i6 % 128;
        if (i6 % 2 != 0) {
            return screenName;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final Modules getModule() {
        int i2 = 2 % 2;
        int i3 = f17449i + 77;
        int i4 = i3 % 128;
        f17448g = i4;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        Modules modules = this.f17452j;
        int i5 = i4 + 15;
        f17449i = i5 % 128;
        if (i5 % 2 != 0) {
            return modules;
        }
        obj.hashCode();
        throw null;
    }

    private static final void c(SignatureFormActivity signatureFormActivity, View view) {
        int i2 = 2 % 2;
        int i3 = f17449i + 93;
        f17448g = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(signatureFormActivity, "");
            Intrinsics.checkNotNull(view);
            ViewExtensionsKt.preventDoubleClick(view);
            signatureFormActivity.e();
            int i4 = 25 / 0;
        } else {
            Intrinsics.checkNotNullParameter(signatureFormActivity, "");
            Intrinsics.checkNotNull(view);
            ViewExtensionsKt.preventDoubleClick(view);
            signatureFormActivity.e();
        }
        int i5 = f17448g + 45;
        f17449i = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final void e(SignatureFormActivity signatureFormActivity, View view) {
        int i2 = 2 % 2;
        int i3 = f17449i + 63;
        f17448g = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(signatureFormActivity, "");
        signatureFormActivity.c();
        int i5 = f17449i + 97;
        f17448g = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 37 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.signature_form.base.BaseSignatureFormActivity, com.incode.welcome_sdk.ui.BaseActivity
    public final void safeOnCreate(Bundle bundle) {
        int i2 = 2 % 2;
        super.safeOnCreate(bundle);
        this.f17451d = new SignatureFormPresenter(((BaseSignatureFormActivity) this).f17461e, this);
        int intExtra = getIntent().getIntExtra("extraTitleResId", 0);
        int intExtra2 = getIntent().getIntExtra("extraDescriptionResId", 0);
        if (intExtra != 0) {
            ((BaseSignatureFormActivity) this).f17460c.f6806j.setText(intExtra);
            int i3 = f17448g + 5;
            f17449i = i3 % 128;
            int i4 = i3 % 2;
        }
        if (intExtra2 != 0) {
            ((BaseSignatureFormActivity) this).f17460c.f6801c.setText(intExtra2);
            int i5 = f17449i + 73;
            f17448g = i5 % 128;
            int i6 = i5 % 2;
        }
        ((BaseSignatureFormActivity) this).f17460c.f6802d.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.signature_form.SignatureFormActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SignatureFormActivity.m8560instrumented$0$safeOnCreate$LandroidosBundleV(this.f$0, view);
            }
        });
        ((BaseSignatureFormActivity) this).f17460c.f6800b.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.signature_form.SignatureFormActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SignatureFormActivity.m8561instrumented$1$safeOnCreate$LandroidosBundleV(this.f$0, view);
            }
        });
    }

    private final void e() {
        int i2 = 2 % 2;
        int i3 = f17449i + 125;
        f17448g = i3 % 128;
        int i4 = i3 % 2;
        a(true);
        SignatureFormPresenter signatureFormPresenter = this.f17451d;
        if (signatureFormPresenter == null) {
            int i5 = f17448g + 89;
            f17449i = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            signatureFormPresenter = null;
        }
        signatureFormPresenter.onClickDone();
    }

    private final void a(boolean z2) {
        int i2;
        int i3 = 2 % 2;
        int i4 = f17449i + 21;
        f17448g = i4 % 128;
        int i5 = i4 % 2;
        ProgressBar progressBar = ((BaseSignatureFormActivity) this).f17460c.f6799a;
        Intrinsics.checkNotNullExpressionValue(progressBar, "");
        ProgressBar progressBar2 = progressBar;
        boolean z3 = true;
        if (z2) {
            int i6 = f17449i + 43;
            f17448g = i6 % 128;
            i2 = i6 % 2 != 0 ? 1 : 0;
        } else {
            i2 = 8;
        }
        progressBar2.setVisibility(i2);
        IncodeButton incodeButton = ((BaseSignatureFormActivity) this).f17460c.f6802d;
        if (z2) {
            z3 = false;
        } else {
            int i7 = f17449i + 47;
            f17448g = i7 % 128;
            int i8 = i7 % 2;
        }
        incodeButton.setEnabled(z3);
    }

    private final void c() {
        int i2 = 2 % 2;
        int i3 = f17449i;
        int i4 = i3 + 77;
        f17448g = i4 % 128;
        int i5 = i4 % 2;
        SignatureFormPresenter signatureFormPresenter = this.f17451d;
        if (signatureFormPresenter == null) {
            int i6 = i3 + 41;
            f17448g = i6 % 128;
            signatureFormPresenter = null;
            if (i6 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
                signatureFormPresenter.hashCode();
                throw null;
            }
        }
        signatureFormPresenter.onClickClear();
    }

    @Override // com.incode.welcome_sdk.ui.signature_form.base.BaseSignatureFormContract.View
    public final void onSignatureTouched() {
        int i2 = 2 % 2;
        int i3 = f17449i + 51;
        f17448g = i3 % 128;
        boolean z2 = false;
        if (i3 % 2 != 0) {
            setSignHereLabelVisibility(false);
            setClearButtonEnabled(false);
            z2 = true;
        } else {
            setSignHereLabelVisibility(false);
            setClearButtonEnabled(false);
        }
        setDoneButtonEnabled(z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0015  */
    @Override // com.incode.welcome_sdk.ui.signature_form.base.BaseSignatureFormContract.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onSignatureUpdated(boolean r6) {
        /*
            r5 = this;
            r4 = 2
            int r0 = r4 % r4
            r5.setSignHereLabelVisibility(r6)
            r3 = 1
            r2 = 0
            if (r6 != 0) goto L15
            int r0 = com.incode.welcome_sdk.ui.signature_form.SignatureFormActivity.f17448g
            int r1 = r0 + 109
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.signature_form.SignatureFormActivity.f17449i = r0
            int r1 = r1 % r4
            if (r1 != 0) goto L2c
        L15:
            r0 = r2
        L16:
            r5.setClearButtonEnabled(r0)
            r6 = r6 ^ r3
            r5.setDoneButtonEnabled(r6)
            int r0 = com.incode.welcome_sdk.ui.signature_form.SignatureFormActivity.f17448g
            int r1 = r0 + 47
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.signature_form.SignatureFormActivity.f17449i = r0
            int r1 = r1 % r4
            if (r1 != 0) goto L2b
            r0 = 65
            int r0 = r0 / r2
        L2b:
            return
        L2c:
            r0 = r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.signature_form.SignatureFormActivity.onSignatureUpdated(boolean):void");
    }

    @Override // com.incode.welcome_sdk.ui.signature_form.SignatureFormContract.View
    public final void setSignHereLabelVisibility(boolean z2) {
        int i2;
        int i3 = 2 % 2;
        int i4 = f17448g + 125;
        f17449i = i4 % 128;
        if (i4 % 2 != 0) {
            IncodeTextView incodeTextView = ((BaseSignatureFormActivity) this).f17460c.f6805i;
            Intrinsics.checkNotNullExpressionValue(incodeTextView, "");
            IncodeTextView incodeTextView2 = incodeTextView;
            if (z2) {
                i2 = 0;
            } else {
                int i5 = f17448g + 29;
                f17449i = i5 % 128;
                int i6 = i5 % 2;
                i2 = 8;
            }
            incodeTextView2.setVisibility(i2);
            int i7 = f17448g + 67;
            f17449i = i7 % 128;
            int i8 = i7 % 2;
            return;
        }
        Intrinsics.checkNotNullExpressionValue(((BaseSignatureFormActivity) this).f17460c.f6805i, "");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.signature_form.SignatureFormContract.View
    public final void setClearButtonEnabled(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f17449i + 11;
        f17448g = i3 % 128;
        int i4 = i3 % 2;
        ((BaseSignatureFormActivity) this).f17460c.f6800b.setEnabled(z2);
        int i5 = f17448g + 5;
        f17449i = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.signature_form.SignatureFormContract.View
    public final void setDoneButtonEnabled(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f17449i + 91;
        f17448g = i3 % 128;
        int i4 = i3 % 2;
        ((BaseSignatureFormActivity) this).f17460c.f6802d.setEnabled(z2);
        int i5 = f17448g + 33;
        f17449i = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.signature_form.SignatureFormContract.View
    public final void setUploadProgress(int i2) {
        int i3 = 2 % 2;
        int i4 = f17448g + 99;
        f17449i = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.signature_form.SignatureFormContract.View
    public final void onUploadFinished(SignatureFormResult signatureFormResult) {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f17449i + 107;
        f17448g = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(signatureFormResult, "");
            z2 = true;
        } else {
            Intrinsics.checkNotNullParameter(signatureFormResult, "");
            z2 = false;
        }
        a(z2);
        super.goToNextStep(signatureFormResult);
        int i4 = f17449i + 99;
        f17448g = i4 % 128;
        int i5 = i4 % 2;
    }
}
