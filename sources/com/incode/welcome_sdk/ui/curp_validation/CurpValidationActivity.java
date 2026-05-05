package com.incode.welcome_sdk.ui.curp_validation;

import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.WindowManager;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.utils.StringUtils;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.results.CurpValidationResult;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.ui.BaseActivity;
import com.incode.welcome_sdk.ui.curp_validation.CurpValidationContract;
import com.incode.welcome_sdk.ui.curp_validation.EnterCurpFragment;
import com.incode.welcome_sdk.ui.curp_validation.GenerateCurpFragment;
import com.incode.welcome_sdk.ui.curp_validation.GeneratingCurpFragment;
import com.incode.welcome_sdk.ui.curp_validation.ValidatingCurpFragment;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import yg.C1499aX;
import yg.C1553lQ;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public class CurpValidationActivity extends BaseActivity implements CurpValidationContract.View, EnterCurpFragment.EnterCurpFragmentInterface, GenerateCurpFragment.GenerateCurpFragmentInterface, GeneratingCurpFragment.GeneratingCurpFragmentInterface, ValidatingCurpFragment.ValidatingCurpFragmentInterface {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f13087f = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f13088i = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Inject
    CurpValidationPresenter f13090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f13091d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f13092e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f13089b = 0;

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        synchronized (C1553lQ.class) {
            String strKd = Qg.kd("7$i'\u000b", (short) (C1580rY.Xd() ^ (1418557024 ^ (-1418551064))), (short) (C1580rY.Xd() ^ (1121647294 ^ (-1121631840))));
            String strVd = hg.Vd("A.", (short) (OY.Xd() ^ ((26264312 ^ 1756873684) ^ 1764165957)), (short) (OY.Xd() ^ (1703648540 ^ 1703673769)));
            try {
                Class<?> cls = Class.forName(strKd);
                Field field = 0 != 0 ? cls.getField(strVd) : cls.getDeclaredField(strVd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strUd = C1561oA.ud(">+p.\u0012", (short) (ZN.Xd() ^ (404239697 ^ 404255077)));
                short sXd = (short) (OY.Xd() ^ (1493935668 ^ 1493952852));
                int[] iArr = new int["\u0010}".length()];
                QB qb = new QB("\u0010}");
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
                    String strYd = C1561oA.Yd("9(o/\u0015", (short) (C1607wl.Xd() ^ (296115506 ^ 296113804)));
                    short sXd2 = (short) (ZN.Xd() ^ ((100340715 ^ 436990782) ^ 535887057));
                    short sXd3 = (short) (ZN.Xd() ^ ((683731955 ^ 281787872) ^ 940258019));
                    int[] iArr2 = new int["tj".length()];
                    QB qb2 = new QB("tj");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) + sXd3);
                        i3++;
                    }
                    String str2 = new String(iArr2, 0, i3);
                    try {
                        Class<?> cls3 = Class.forName(strYd);
                        Field field3 = 0 != 0 ? cls3.getField(str2) : cls3.getDeclaredField(str2);
                        field3.setAccessible(true);
                        obj3 = field3.get(null);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    if (((WindowManager) obj3) == null) {
                        Object[] objArr = new Object[0];
                        Method declaredMethod = Class.forName(Jg.Wd("\u0002a\u001aX+", (short) (C1580rY.Xd() ^ ((462381267 ^ 2106384302) ^ (-1711510764))), (short) (C1580rY.Xd() ^ ((1709128326 ^ 1032371602) ^ (-1482154844))))).getDeclaredMethod(ZO.xd("\u00033", (short) (C1499aX.Xd() ^ ((681514810 ^ 491719682) ^ (-902847345))), (short) (C1499aX.Xd() ^ ((709930907 ^ 1777750882) ^ (-1134986747)))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                String strUd2 = C1626yg.Ud("Te\u0012!iG", (short) (OY.Xd() ^ (437311344 ^ 437317108)), (short) (OY.Xd() ^ ((944750937 ^ 1929834373) ^ 1263103429)));
                                Class<?> cls4 = Class.forName(Ig.wd("\u001cw;*v#R,6\u000f\u0010w9H&B\"<\u0014q'\u000f<", (short) (OY.Xd() ^ ((1634582439 ^ 553681255) ^ 1080914306))));
                                Class<?>[] clsArr = new Class[1];
                                short sXd4 = (short) (C1580rY.Xd() ^ ((1665405310 ^ 65363739) ^ (-1621173800)));
                                int[] iArr3 = new int["=~\"0\u0015\u0001]Z2Yx\u007fH=\u001ey".length()];
                                QB qb3 = new QB("=~\"0\u0015\u0001]Z2Yx\u007fH=\u001ey");
                                int i4 = 0;
                                while (qb3.YK()) {
                                    int iKK3 = qb3.KK();
                                    Xu xuXd3 = Xu.Xd(iKK3);
                                    iArr3[i4] = xuXd3.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd4 + sXd4) + i4)) + xuXd3.CK(iKK3));
                                    i4++;
                                }
                                clsArr[0] = Class.forName(new String(iArr3, 0, i4));
                                Object[] objArr2 = {strUd2};
                                Method method = cls4.getMethod(C1561oA.Qd("\u0013\u0010\u001e{!\u001a\u001a\n\u0011u\u0007\u0013\u0016\b\u0001\u0002", (short) (OY.Xd() ^ (403443631 ^ 403455598))), clsArr);
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    String strZd = C1593ug.zd("wf.mS", (short) (FB.Xd() ^ (967511194 ^ 967526856)), (short) (FB.Xd() ^ (1556320743 ^ 1556333081)));
                                    String strOd = C1561oA.od("dX", (short) (FB.Xd() ^ ((1230598365 ^ 1137007179) ^ 177999932)));
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
                    String strKd2 = C1561oA.Kd("C2y9\u001f", (short) (C1499aX.Xd() ^ ((1183188623 ^ 95819899) ^ (-1127230171))));
                    String strZd2 = Wg.Zd("T\u0013", (short) (ZN.Xd() ^ (714283781 ^ 714286816)), (short) (ZN.Xd() ^ ((284945980 ^ 815499242) ^ 543188954)));
                    try {
                        Class<?> cls6 = Class.forName(strKd2);
                        Field field5 = 0 != 0 ? cls6.getField(strZd2) : cls6.getDeclaredField(strZd2);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        short sXd5 = (short) (FB.Xd() ^ ((2112369643 ^ 1800480900) ^ 381233852));
                        int[] iArr4 = new int["\u0019\bO\u000ft".length()];
                        QB qb4 = new QB("\u0019\bO\u000ft");
                        int i5 = 0;
                        while (qb4.YK()) {
                            int iKK4 = qb4.KK();
                            Xu xuXd4 = Xu.Xd(iKK4);
                            iArr4[i5] = xuXd4.fK(xuXd4.CK(iKK4) - (sXd5 + i5));
                            i5++;
                        }
                        String str3 = new String(iArr4, 0, i5);
                        String strVd2 = Wg.vd("\r\u0003", (short) (ZN.Xd() ^ ((30766142 ^ 1334840511) ^ 1313160346)));
                        try {
                            Class<?> cls7 = Class.forName(str3);
                            Field field6 = 0 != 0 ? cls7.getField(strVd2) : cls7.getDeclaredField(strVd2);
                            field6.setAccessible(true);
                            obj5 = field6.get(null);
                        } catch (Throwable th6) {
                            obj5 = null;
                        }
                        ((WindowManager) obj5).getDefaultDisplay().getMetrics(displayMetrics);
                        int x2 = (int) motionEvent.getX();
                        int y2 = (int) motionEvent.getY();
                        int i6 = (964599302 ^ 1342699438) ^ 1769564643;
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

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public BaseActivity.Config getConfig() {
        int i2 = 2 % 2;
        BaseActivity.Config config = new BaseActivity.Config(false, true, false, true, null);
        int i3 = f13088i + 97;
        f13087f = i3 % 128;
        int i4 = i3 % 2;
        return config;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public void safeOnCreate(Bundle bundle) {
        int i2 = 2 % 2;
        DaggerCurpValidationComponent.builder().incodeWelcomeRepositoryComponent(this.f10724a.getIncodeWelcomeRepositoryComponent()).curpValidationModule(new CurpValidationModule(this)).build().inject(this);
        this.f13091d = getIntent().getStringExtra("extraCurp");
        super.safeOnCreate(bundle);
        int i3 = f13087f + 29;
        f13088i = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public void onReadyToShowFragment() {
        boolean z2;
        int i2 = 2 % 2;
        super.onReadyToShowFragment();
        if ((!this.f10724a.getInternalConfig().isValidationEnabled()) || !StringUtils.isNotBlank(this.f13091d)) {
            z2 = false;
        } else {
            int i3 = f13087f + 21;
            f13088i = i3 % 128;
            int i4 = i3 % 2;
            z2 = true;
        }
        showFragment(z2 ? ValidatingCurpFragment.newInstance(this.f13091d, false) : EnterCurpFragment.newInstance(), !z2);
        int i5 = f13087f + 81;
        f13088i = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 82 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public ScreenName getScreenName() {
        int i2 = 2 % 2;
        int i3 = f13087f + 5;
        f13088i = i3 % 128;
        int i4 = i3 % 2;
        ScreenName screenName = ScreenName.VALIDATE_CURP;
        int i5 = f13088i + 5;
        f13087f = i5 % 128;
        if (i5 % 2 != 0) {
            return screenName;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public Modules getModule() {
        int i2 = 2 % 2;
        int i3 = f13088i + 25;
        f13087f = i3 % 128;
        int i4 = i3 % 2;
        Modules modules = Modules.CURP_VALIDATION;
        int i5 = f13087f + 111;
        f13088i = i5 % 128;
        int i6 = i5 % 2;
        return modules;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public boolean isScreenCloseable() {
        int i2 = 2 % 2;
        int i3 = f13087f + 59;
        int i4 = i3 % 128;
        f13088i = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 109;
        f13087f = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    @Override // com.incode.welcome_sdk.ui.curp_validation.EnterCurpFragment.EnterCurpFragmentInterface
    public void enterCurp_onContinue(String str) {
        int i2 = 2 % 2;
        int i3 = f13088i + 81;
        f13087f = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            if (!this.f10724a.getInternalConfig().isValidationEnabled()) {
                c(str, false, null);
                return;
            }
            int i4 = f13087f + 121;
            f13088i = i4 % 128;
            int i5 = i4 % 2;
            showFragment(ValidatingCurpFragment.newInstance(str, true), true);
            int i6 = f13088i + 97;
            f13087f = i6 % 128;
            if (i6 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        this.f10724a.getInternalConfig().isValidationEnabled();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.curp_validation.EnterCurpFragment.EnterCurpFragmentInterface
    public void enterCurp_onInvalid(String str) {
        int i2 = 2 % 2;
        int i3 = f13087f + 81;
        f13088i = i3 % 128;
        int i4 = i3 % 2;
        d(str, false, (Map<String, Object>) null);
        int i5 = f13087f + 41;
        f13088i = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.curp_validation.EnterCurpFragment.EnterCurpFragmentInterface
    public void enterCurp_onGenerate() {
        int i2 = 2 % 2;
        int i3 = f13087f + 97;
        f13088i = i3 % 128;
        int i4 = i3 % 2;
        showFragment(GenerateCurpFragment.newInstance(), true);
        int i5 = f13087f + 23;
        f13088i = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.curp_validation.ValidatingCurpFragment.ValidatingCurpFragmentInterface
    public void validatingCurp_onComplete(String str, boolean z2, Map<String, Object> map) {
        int i2;
        int i3 = 2 % 2;
        int i4 = f13087f + 13;
        f13088i = i4 % 128;
        if (i4 % 2 != 0) {
            i2 = this.f13089b;
            this.f13089b = i2;
        } else {
            i2 = this.f13089b;
            this.f13089b = i2 + 1;
        }
        a(str, z2, map, i2);
        int i5 = f13088i + 53;
        f13087f = i5 % 128;
        int i6 = i5 % 2;
    }

    private void c(String str, boolean z2, Map<String, Object> map) {
        int i2 = 2 % 2;
        this.f13090c.publishResult(new CurpValidationResult(ResultCode.SUCCESS, str, z2, map, true));
        int i3 = f13088i + 47;
        f13087f = i3 % 128;
        int i4 = i3 % 2;
    }

    private void d(String str, boolean z2, Map<String, Object> map) {
        int i2 = 2 % 2;
        this.f13090c.notifyResult(new CurpValidationResult(ResultCode.SUCCESS, str, z2, map, false));
        int i3 = f13088i + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f13087f = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.curp_validation.GenerateCurpFragment.GenerateCurpFragmentInterface
    public void generateCurp_onContinue(String str, String str2, String str3, int i2, String str4, int i3) {
        boolean z2;
        int i4 = 2 % 2;
        if (this.f13092e <= 0) {
            int i5 = f13088i + 71;
            f13087f = i5 % 128;
            int i6 = i5 % 2;
            z2 = true;
        } else {
            int i7 = f13088i + 15;
            f13087f = i7 % 128;
            int i8 = i7 % 2;
            z2 = false;
        }
        showFragment(GeneratingCurpFragment.newInstance(str, str2, str3, i2, str4, i3, z2), true);
    }

    @Override // com.incode.welcome_sdk.ui.curp_validation.GeneratingCurpFragment.GeneratingCurpFragmentInterface
    public void generatingCurp_onComplete(String str, boolean z2, Map<String, Object> map) {
        int i2 = 2 % 2;
        int i3 = f13088i + 63;
        f13087f = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.f13092e;
        this.f13092e = i5 + 1;
        a(str, z2, map, i5);
        int i6 = f13088i + 61;
        f13087f = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public void publishUserCancelled() {
        int i2 = 2 % 2;
        this.f13090c.publishResult(new CurpValidationResult(ResultCode.USER_CANCELLED));
        int i3 = f13088i + 109;
        f13087f = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 75 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        r1 = com.incode.welcome_sdk.ui.curp_validation.CurpValidationActivity.f13088i + 121;
        com.incode.welcome_sdk.ui.curp_validation.CurpValidationActivity.f13087f = r1 % 128;
        r1 = r1 % 2;
        destroyCurrentFragment();
        showFragment(com.incode.welcome_sdk.ui.curp_validation.EnterCurpFragment.newInstance(), true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
    
        if (r9 <= 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
    
        if (r9 <= 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        com.incode.welcome_sdk.commons.utils.EventUtils.sendEvent(getRepo(), com.incode.welcome_sdk.data.Event.CURP_VALIDATION_FAILED, com.incode.welcome_sdk.modules.Modules.CURP_VALIDATION, getScreenName());
        d(r6, r7, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        if (goToPreviousFragmentInStack() != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(java.lang.String r6, boolean r7, java.util.Map<java.lang.String, java.lang.Object> r8, int r9) {
        /*
            r5 = this;
            r4 = 2
            int r0 = r4 % r4
            if (r7 != 0) goto L46
            int r0 = com.incode.welcome_sdk.ui.curp_validation.CurpValidationActivity.f13088i
            int r1 = r0 + 83
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.curp_validation.CurpValidationActivity.f13087f = r0
            int r1 = r1 % r4
            if (r1 != 0) goto L43
            r0 = 86
            int r0 = r0 / 0
            if (r9 > 0) goto L46
        L16:
            com.incode.welcome_sdk.data.IncodeWelcomeRepository r3 = r5.getRepo()
            com.incode.welcome_sdk.data.Event r2 = com.incode.welcome_sdk.data.Event.CURP_VALIDATION_FAILED
            com.incode.welcome_sdk.modules.Modules r1 = com.incode.welcome_sdk.modules.Modules.CURP_VALIDATION
            com.incode.welcome_sdk.ScreenName r0 = r5.getScreenName()
            com.incode.welcome_sdk.commons.utils.EventUtils.sendEvent(r3, r2, r1, r0)
            r5.d(r6, r7, r8)
            boolean r0 = r5.goToPreviousFragmentInStack()
            if (r0 != 0) goto L5a
            int r0 = com.incode.welcome_sdk.ui.curp_validation.CurpValidationActivity.f13088i
            int r1 = r0 + 121
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.curp_validation.CurpValidationActivity.f13087f = r0
            int r1 = r1 % r4
            r5.destroyCurrentFragment()
            com.incode.welcome_sdk.ui.curp_validation.EnterCurpFragment r1 = com.incode.welcome_sdk.ui.curp_validation.EnterCurpFragment.newInstance()
            r0 = 1
            r5.showFragment(r1, r0)
            return
        L43:
            if (r9 > 0) goto L46
            goto L16
        L46:
            if (r7 == 0) goto L5b
            com.incode.welcome_sdk.data.Event r3 = com.incode.welcome_sdk.data.Event.CURP_VALIDATION_SUCCEEDED
        L4a:
            com.incode.welcome_sdk.data.IncodeWelcomeRepository r2 = r5.getRepo()
            com.incode.welcome_sdk.modules.Modules r1 = com.incode.welcome_sdk.modules.Modules.CURP_VALIDATION
            com.incode.welcome_sdk.ScreenName r0 = r5.getScreenName()
            com.incode.welcome_sdk.commons.utils.EventUtils.sendEvent(r2, r3, r1, r0)
            r5.c(r6, r7, r8)
        L5a:
            return
        L5b:
            com.incode.welcome_sdk.data.Event r3 = com.incode.welcome_sdk.data.Event.CURP_VALIDATION_FAILED
            goto L4a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.curp_validation.CurpValidationActivity.a(java.lang.String, boolean, java.util.Map, int):void");
    }
}
