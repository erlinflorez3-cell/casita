package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.WindowManager;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import yg.C1499aX;
import yg.C1553lQ;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
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
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
    protected int zaa = 0;

    public static Intent zaa(Context context, PendingIntent pendingIntent, int i2, boolean z2) {
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra(CloudMessagingReceiver.IntentKeys.PENDING_INTENT, pendingIntent);
        intent.putExtra("failing_client_id", i2);
        intent.putExtra("notify_manager", z2);
        return intent;
    }

    private final void zab() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            finish();
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) extras.get(CloudMessagingReceiver.IntentKeys.PENDING_INTENT);
        Integer num = (Integer) extras.get("error_code");
        if (pendingIntent == null && num == null) {
            finish();
            return;
        }
        if (pendingIntent == null) {
            GoogleApiAvailability.getInstance().showErrorDialogFragment(this, ((Integer) Preconditions.checkNotNull(num)).intValue(), 2, this);
            this.zaa = 1;
            return;
        }
        try {
            startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
            this.zaa = 1;
        } catch (ActivityNotFoundException e2) {
            if (extras.getBoolean("notify_manager", true)) {
                GoogleApiManager.zak(this).zax(new ConnectionResult(22, null), getIntent().getIntExtra("failing_client_id", -1));
            } else {
                String str = "Activity not found while launching " + pendingIntent.toString() + ".";
                if (Build.FINGERPRINT.contains("generic")) {
                    str.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                }
            }
            this.zaa = 1;
            finish();
        } catch (IntentSender.SendIntentException e3) {
            finish();
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
            String strYd = C1561oA.Yd("]L\u0014S9", (short) (C1499aX.Xd() ^ ((1422369787 ^ 1739668717) ^ (-863411283))));
            short sXd = (short) (OY.Xd() ^ (1492795452 ^ 1492793573));
            short sXd2 = (short) (OY.Xd() ^ (164721219 ^ 164715724));
            int[] iArr = new int["UD".length()];
            QB qb = new QB("UD");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
                i2++;
            }
            String str = new String(iArr, 0, i2);
            try {
                Class<?> cls = Class.forName(strYd);
                Field field = 0 != 0 ? cls.getField(str) : cls.getDeclaredField(str);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strWd = Jg.Wd("7\u0001Ak&", (short) (OY.Xd() ^ (1348495921 ^ 1348494957)), (short) (OY.Xd() ^ ((470376884 ^ 587437560) ^ 1057680353)));
                String strXd = ZO.xd(" j", (short) (C1633zX.Xd() ^ (583683862 ^ (-583668113))), (short) (C1633zX.Xd() ^ ((752562459 ^ 187958777) ^ (-669983081))));
                try {
                    Class<?> cls2 = Class.forName(strWd);
                    Field field2 = 0 != 0 ? cls2.getField(strXd) : cls2.getDeclaredField(strXd);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strUd = C1626yg.Ud("\u007f7o*>", (short) (Od.Xd() ^ (532909793 ^ (-532910062))), (short) (Od.Xd() ^ ((894674070 ^ 1135220077) ^ (-1996088107))));
                    String strWd2 = Ig.wd("Dk", (short) (C1633zX.Xd() ^ ((1388064117 ^ 911524837) ^ (-1692965400))));
                    try {
                        Class<?> cls3 = Class.forName(strUd);
                        Field field3 = 0 != 0 ? cls3.getField(strWd2) : cls3.getDeclaredField(strWd2);
                        field3.setAccessible(true);
                        obj3 = field3.get(null);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    if (((WindowManager) obj3) == null) {
                        Object[] objArr = new Object[0];
                        Method declaredMethod = Class.forName(EO.Od("Jf\u001dFH", (short) (C1633zX.Xd() ^ ((1493014448 ^ 1864923142) ^ (-936743463))))).getDeclaredMethod(C1561oA.Qd("IT", (short) (FB.Xd() ^ ((1761637071 ^ 2010426818) ^ 517255612))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                Object[] objArr2 = {C1593ug.zd("A4:1=F", (short) (FB.Xd() ^ (382376144 ^ 382389927)), (short) (FB.Xd() ^ ((1722947742 ^ 1873740117) ^ 152901288)))};
                                Method method = Class.forName(C1561oA.od("frgtpic,`kin^fk$8cafVhc", (short) (ZN.Xd() ^ ((2373115 ^ 1484577472) ^ 1482200440)))).getMethod(Wg.Zd("e\u007fja$6\u0013\u001c>\u007f*So>Pn", (short) (C1607wl.Xd() ^ ((1311573075 ^ 1199257591) ^ 156635358)), (short) (C1607wl.Xd() ^ (123580001 ^ 123569877))), Class.forName(C1561oA.Kd("og}i7vlzt<b\u0005\u0004{\u0002{", (short) (C1499aX.Xd() ^ ((426994792 ^ 687357087) ^ (-831207335))))));
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    String strXd2 = C1561oA.Xd("\u0001o7v\\", (short) (OY.Xd() ^ ((1392339857 ^ 911626670) ^ 1688944186)));
                                    short sXd3 = (short) (OY.Xd() ^ ((1407968764 ^ 1120032340) ^ 287949177));
                                    int[] iArr2 = new int["@6".length()];
                                    QB qb2 = new QB("@6");
                                    int i3 = 0;
                                    while (qb2.YK()) {
                                        int iKK2 = qb2.KK();
                                        Xu xuXd2 = Xu.Xd(iKK2);
                                        iArr2[i3] = xuXd2.fK((sXd3 ^ i3) + xuXd2.CK(iKK2));
                                        i3++;
                                    }
                                    String str2 = new String(iArr2, 0, i3);
                                    try {
                                        Class<?> cls4 = Class.forName(strXd2);
                                        Field field4 = 0 != 0 ? cls4.getField(str2) : cls4.getDeclaredField(str2);
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
                    String strKd = Qg.kd("aN\u0014Q5", (short) (C1633zX.Xd() ^ (1195766874 ^ (-1195755893))), (short) (C1633zX.Xd() ^ ((389179810 ^ 587712749) ^ (-875944845))));
                    String strVd = hg.Vd("\r\u0001", (short) (C1633zX.Xd() ^ ((803247894 ^ 534388061) ^ (-809158022))), (short) (C1633zX.Xd() ^ ((1772045491 ^ 1282674001) ^ (-636164340))));
                    try {
                        Class<?> cls5 = Class.forName(strKd);
                        Field field5 = 0 != 0 ? cls5.getField(strVd) : cls5.getDeclaredField(strVd);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        String strUd2 = C1561oA.ud("=*o-\u0011", (short) (FB.Xd() ^ (407588054 ^ 407569802)));
                        String strYd2 = C1561oA.yd("C9", (short) (OY.Xd() ^ ((1973403332 ^ 1269900408) ^ 1043255116)));
                        try {
                            Class<?> cls6 = Class.forName(strUd2);
                            Field field6 = 0 != 0 ? cls6.getField(strYd2) : cls6.getDeclaredField(strYd2);
                            field6.setAccessible(true);
                            obj5 = field6.get(null);
                        } catch (Throwable th6) {
                            obj5 = null;
                        }
                        ((WindowManager) obj5).getDefaultDisplay().getMetrics(displayMetrics);
                        int x2 = (int) motionEvent.getX();
                        int y2 = (int) motionEvent.getY();
                        int i4 = (279538874 ^ 1515577491) ^ 1258064994;
                        if (x2 > i4 && x2 < displayMetrics.widthPixels - i4 && y2 > i4 && y2 < displayMetrics.heightPixels - i4) {
                            C1553lQ.vd(motionEvent);
                            C1553lQ.Od(motionEvent);
                        }
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.zaa = 0;
            setResult(i3, intent);
            if (booleanExtra) {
                GoogleApiManager googleApiManagerZak = GoogleApiManager.zak(this);
                if (i3 == -1) {
                    googleApiManagerZak.zay();
                } else if (i3 == 0) {
                    googleApiManagerZak.zax(new ConnectionResult(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i2 == 2) {
            this.zaa = 0;
            setResult(i3, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.zaa = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.zaa = bundle.getInt("resolution");
        }
        if (this.zaa != 1) {
            zab();
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.zaa);
        super.onSaveInstanceState(bundle);
    }
}
