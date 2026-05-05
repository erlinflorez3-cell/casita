package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInApi;
import com.google.android.gms.auth.api.signin.GoogleSignInStatusCodes;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Status;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import yg.C1499aX;
import yg.C1553lQ;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
public class SignInHubActivity extends FragmentActivity {
    private static boolean zba = false;
    private boolean zbb = false;
    private SignInConfiguration zbc;
    private boolean zbd;
    private int zbe;
    private Intent zbf;

    private final void zbc() {
        getSupportLoaderManager().initLoader(0, null, new zbw(this, null));
        zba = false;
    }

    private final void zbd(int i2) {
        Status status = new Status(i2);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        zba = false;
    }

    private final void zbe(String str) {
        Intent intent = new Intent(str);
        if (str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent.setPackage("com.google.android.gms");
        } else {
            intent.setPackage(getPackageName());
        }
        intent.putExtra("config", this.zbc);
        try {
            startActivityForResult(intent, 40962);
        } catch (ActivityNotFoundException unused) {
            this.zbb = true;
            zbd(17);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        synchronized (C1553lQ.class) {
            String strKd = C1561oA.Kd("UD\fK1", (short) (OY.Xd() ^ (277597006 ^ 277606194)));
            String strZd = Wg.Zd("\u0016h", (short) (FB.Xd() ^ (282721832 ^ 282709183)), (short) (FB.Xd() ^ ((686056659 ^ 2099498126) ^ 1439142432)));
            try {
                Class<?> cls = Class.forName(strKd);
                Field field = 0 != 0 ? cls.getField(strZd) : cls.getDeclaredField(strZd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                short sXd = (short) (ZN.Xd() ^ (1436479435 ^ 1436460949));
                int[] iArr = new int["\u0017\u0006M\rr".length()];
                QB qb = new QB("\u0017\u0006M\rr");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
                    i2++;
                }
                String str = new String(iArr, 0, i2);
                String strVd = Wg.vd("\\J", (short) (C1499aX.Xd() ^ (792979134 ^ (-792958301))));
                try {
                    Class<?> cls2 = Class.forName(str);
                    Field field2 = 0 != 0 ? cls2.getField(strVd) : cls2.getDeclaredField(strVd);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strKd2 = Qg.kd("Q>\u0004A%", (short) (C1580rY.Xd() ^ (213405430 ^ (-213416857))), (short) (C1580rY.Xd() ^ ((92895846 ^ 1632515755) ^ (-1690791245))));
                    String strVd2 = hg.Vd("\u001a\u000e", (short) (C1499aX.Xd() ^ ((1719038259 ^ 1820065854) ^ (-168434147))), (short) (C1499aX.Xd() ^ ((84382777 ^ 618045724) ^ (-567351839))));
                    try {
                        Class<?> cls3 = Class.forName(strKd2);
                        Field field3 = 0 != 0 ? cls3.getField(strVd2) : cls3.getDeclaredField(strVd2);
                        field3.setAccessible(true);
                        obj3 = field3.get(null);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    if (((WindowManager) obj3) == null) {
                        Object[] objArr = new Object[0];
                        Method declaredMethod = Class.forName(C1561oA.ud("TA\u0007P0", (short) (C1580rY.Xd() ^ ((216863353 ^ 2136985071) ^ (-1941087696))))).getDeclaredMethod(C1561oA.yd("_j", (short) (C1633zX.Xd() ^ ((486308194 ^ 1733956887) ^ (-2074508889)))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                Object[] objArr2 = {C1561oA.Yd("\t{\u0002x\u0005\u000e", (short) (C1633zX.Xd() ^ ((1197008603 ^ 1461966249) ^ (-276528922))))};
                                Method method = Class.forName(Xg.qd("\u0001\u000f\u0006\u0015\u0013\u000e\nT\u000b\u0018\u0018\u001f\u0011\u001b\"\\r  '\u0019-*", (short) (C1607wl.Xd() ^ ((745686951 ^ 1558897907) ^ 1889059196)), (short) (C1607wl.Xd() ^ ((1851394321 ^ 549923379) ^ 1318919065)))).getMethod(ZO.xd("\u0011Cww'\u0002\u00195^\u007f\u0013Wl\u0017\u0019\f", (short) (OY.Xd() ^ ((2118891166 ^ 1740461619) ^ 435604388)), (short) (OY.Xd() ^ ((866535565 ^ 1683056167) ^ 1475823610))), Class.forName(Jg.Wd("\u0017\f'\fN\u0017\"98l\u0018c\b\t\u0004v", (short) (ZN.Xd() ^ (678244782 ^ 678233160)), (short) (ZN.Xd() ^ ((168181781 ^ 1473411384) ^ 1574196542)))));
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    short sXd2 = (short) (C1580rY.Xd() ^ ((488465001 ^ 1537181342) ^ (-1182977439)));
                                    short sXd3 = (short) (C1580rY.Xd() ^ ((1977733851 ^ 255419924) ^ (-2061025048)));
                                    int[] iArr2 = new int["\u0014R\u001dk\u0007".length()];
                                    QB qb2 = new QB("\u0014R\u001dk\u0007");
                                    int i3 = 0;
                                    while (qb2.YK()) {
                                        int iKK2 = qb2.KK();
                                        Xu xuXd2 = Xu.Xd(iKK2);
                                        iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd2 + sXd2) + (i3 * sXd3))) + xuXd2.CK(iKK2));
                                        i3++;
                                    }
                                    String str2 = new String(iArr2, 0, i3);
                                    short sXd4 = (short) (FB.Xd() ^ (1076383215 ^ 1076378846));
                                    int[] iArr3 = new int[".u".length()];
                                    QB qb3 = new QB(".u");
                                    int i4 = 0;
                                    while (qb3.YK()) {
                                        int iKK3 = qb3.KK();
                                        Xu xuXd3 = Xu.Xd(iKK3);
                                        iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ (sXd4 + i4)));
                                        i4++;
                                    }
                                    String str3 = new String(iArr3, 0, i4);
                                    try {
                                        Class<?> cls4 = Class.forName(str2);
                                        Field field4 = 0 != 0 ? cls4.getField(str3) : cls4.getDeclaredField(str3);
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
                    String strOd = EO.Od("5KF'U", (short) (OY.Xd() ^ ((338852145 ^ 1694818844) ^ 1899408372)));
                    String strQd = C1561oA.Qd("\u0016\n", (short) (C1633zX.Xd() ^ (1345068009 ^ (-1345078036))));
                    try {
                        Class<?> cls5 = Class.forName(strOd);
                        Field field5 = 0 != 0 ? cls5.getField(strQd) : cls5.getDeclaredField(strQd);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        String strZd2 = C1593ug.zd("kZ\"aG", (short) (OY.Xd() ^ (1136948923 ^ 1136936777)), (short) (OY.Xd() ^ ((992282999 ^ 242606864) ^ 894491261)));
                        String strOd2 = C1561oA.od("\u0006y", (short) (C1499aX.Xd() ^ (45388432 ^ (-45403393))));
                        try {
                            Class<?> cls6 = Class.forName(strZd2);
                            Field field6 = 0 != 0 ? cls6.getField(strOd2) : cls6.getDeclaredField(strOd2);
                            field6.setAccessible(true);
                            obj5 = field6.get(null);
                        } catch (Throwable th6) {
                            obj5 = null;
                        }
                        ((WindowManager) obj5).getDefaultDisplay().getMetrics(displayMetrics);
                        int x2 = (int) motionEvent.getX();
                        int y2 = (int) motionEvent.getY();
                        int i5 = (1344803227 ^ 1707498970) ^ 904809482;
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

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected final void onActivityResult(int i2, int i3, Intent intent) {
        if (this.zbb) {
            return;
        }
        setResult(0);
        if (i2 != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra(GoogleSignInApi.EXTRA_SIGN_IN_ACCOUNT);
            if (signInAccount != null && signInAccount.zba() != null) {
                GoogleSignInAccount googleSignInAccountZba = signInAccount.zba();
                if (googleSignInAccountZba == null) {
                    zbd(GoogleSignInStatusCodes.SIGN_IN_FAILED);
                    return;
                }
                zbn.zbc(this).zbe(this.zbc.zba(), googleSignInAccountZba);
                intent.removeExtra(GoogleSignInApi.EXTRA_SIGN_IN_ACCOUNT);
                intent.putExtra("googleSignInAccount", googleSignInAccountZba);
                this.zbd = true;
                this.zbe = i3;
                this.zbf = intent;
                zbc();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = GoogleSignInStatusCodes.SIGN_IN_CANCELLED;
                }
                zbd(intExtra);
                return;
            }
        }
        zbd(8);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if (action == null) {
            zbd(GoogleSignInStatusCodes.SIGN_IN_FAILED);
            return;
        }
        if (action.equals("com.google.android.gms.auth.NO_IMPL")) {
            zbd(GoogleSignInStatusCodes.SIGN_IN_FAILED);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            "Unknown action: ".concat(String.valueOf(intent.getAction()));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("config");
        if (bundleExtra == null) {
            setResult(0);
            finish();
            return;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
        if (signInConfiguration == null) {
            setResult(0);
            finish();
            return;
        }
        this.zbc = signInConfiguration;
        if (bundle == null) {
            if (zba) {
                setResult(0);
                zbd(GoogleSignInStatusCodes.SIGN_IN_CURRENTLY_IN_PROGRESS);
                return;
            } else {
                zba = true;
                zbe(action);
                return;
            }
        }
        boolean z2 = bundle.getBoolean("signingInGoogleApiClients");
        this.zbd = z2;
        if (z2) {
            this.zbe = bundle.getInt("signInResultCode");
            Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
            if (intent2 == null) {
                setResult(0);
                finish();
            } else {
                this.zbf = intent2;
                zbc();
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        zba = false;
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.zbd);
        if (this.zbd) {
            bundle.putInt("signInResultCode", this.zbe);
            bundle.putParcelable("signInResultData", this.zbf);
        }
    }
}
