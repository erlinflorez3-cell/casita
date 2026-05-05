package io.invertase.firebase.utils;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.IntentSender;
import android.os.Environment;
import android.provider.Settings;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import io.invertase.firebase.app.ReactNativeFirebaseApp;
import io.invertase.firebase.common.ReactNativeFirebaseModule;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
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
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
public class ReactNativeFirebaseUtilsModule extends ReactNativeFirebaseModule {
    private static final String FIREBASE_TEST_LAB = "firebase.test.lab";
    private static final String KEY_CACHE_DIRECTORY = "CACHES_DIRECTORY";
    private static final String KEY_DOCUMENT_DIRECTORY = "DOCUMENT_DIRECTORY";
    private static final String KEY_EXTERNAL_DIRECTORY = "EXTERNAL_DIRECTORY";
    private static final String KEY_EXT_STORAGE_DIRECTORY = "EXTERNAL_STORAGE_DIRECTORY";
    private static final String KEY_LIBRARY_DIRECTORY = "LIBRARY_DIRECTORY";
    private static final String KEY_MAIN_BUNDLE = "MAIN_BUNDLE";
    private static final String KEY_MOVIES_DIRECTORY = "MOVIES_DIRECTORY";
    private static final String KEY_PICS_DIRECTORY = "PICTURES_DIRECTORY";
    private static final String KEY_TEMP_DIRECTORY = "TEMP_DIRECTORY";
    private static final String TAG = "Utils";

    public ReactNativeFirebaseUtilsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, TAG);
    }

    private WritableMap getPlayServicesStatusMap() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        int iIsGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(getContext());
        writableMapCreateMap.putInt("status", iIsGooglePlayServicesAvailable);
        if (iIsGooglePlayServicesAvailable == 0) {
            writableMapCreateMap.putBoolean("isAvailable", true);
        } else {
            writableMapCreateMap.putBoolean("isAvailable", false);
            writableMapCreateMap.putString("error", googleApiAvailability.getErrorString(iIsGooglePlayServicesAvailable));
            writableMapCreateMap.putBoolean("isUserResolvableError", googleApiAvailability.isUserResolvableError(iIsGooglePlayServicesAvailable));
            writableMapCreateMap.putBoolean("hasResolution", new ConnectionResult(iIsGooglePlayServicesAvailable).hasResolution());
        }
        return writableMapCreateMap;
    }

    private int isGooglePlayServicesAvailable() {
        return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(getContext());
    }

    private static Boolean isRunningInTestLab() throws Throwable {
        Context applicationContext = ReactNativeFirebaseApp.getApplicationContext();
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.ud("9E:GC<6~3><A19>v\u000b649);6", (short) (C1580rY.Xd() ^ (-29126)))).getMethod(C1561oA.yd("vs\u0006S\u0003\u0001\ny\u0006\u000bk}\u000f\n\n\u0013\u0005\u0011", (short) (Od.Xd() ^ (-11564))), new Class[0]);
        try {
            method.setAccessible(true);
            return Boolean.valueOf(Xg.qd("\r\f\u0010\u0001", (short) (C1633zX.Xd() ^ (-23267)), (short) (C1633zX.Xd() ^ (-10391))).equals(Settings.System.getString((ContentResolver) method.invoke(applicationContext, objArr), C1561oA.Yd("\u000f\u0013\u001d\u0011\u000f\u000f\"\u0015^&\u0018')c#\u0019\u001b", (short) (C1499aX.Xd() ^ (-7673))))));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @ReactMethod
    public void androidGetPlayServicesStatus(Promise promise) {
        promise.resolve(getPlayServicesStatusMap());
    }

    @ReactMethod
    public void androidMakePlayServicesAvailable() {
        Activity activity;
        if (isGooglePlayServicesAvailable() == 0 || (activity = getActivity()) == null) {
            return;
        }
        GoogleApiAvailability.getInstance().makeGooglePlayServicesAvailable(activity);
    }

    @ReactMethod
    public void androidPromptForPlayServices() {
        Activity activity;
        int iIsGooglePlayServicesAvailable = isGooglePlayServicesAvailable();
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        if (iIsGooglePlayServicesAvailable == 0 || !googleApiAvailability.isUserResolvableError(iIsGooglePlayServicesAvailable) || (activity = getActivity()) == null) {
            return;
        }
        googleApiAvailability.getErrorDialog(activity, iIsGooglePlayServicesAvailable, iIsGooglePlayServicesAvailable).show();
    }

    @ReactMethod
    public void androidResolutionForPlayServices() {
        Activity activity;
        int iIsGooglePlayServicesAvailable = isGooglePlayServicesAvailable();
        ConnectionResult connectionResult = new ConnectionResult(iIsGooglePlayServicesAvailable);
        if (connectionResult.isSuccess() || !connectionResult.hasResolution() || (activity = getActivity()) == null) {
            return;
        }
        try {
            connectionResult.startResolutionForResult(activity, iIsGooglePlayServicesAvailable);
        } catch (IntentSender.SendIntentException e2) {
        }
    }

    @Override // io.invertase.firebase.common.ReactNativeFirebaseModule, com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() throws Throwable {
        HashMap map = new HashMap();
        map.put(Jg.Wd("}1<\u000f4^l\u0018ER$X\u0015M\u0003\u0002+V", (short) (C1499aX.Xd() ^ (-17987)), (short) (C1499aX.Xd() ^ (-21457))), isRunningInTestLab());
        short sXd = (short) (C1607wl.Xd() ^ 22357);
        short sXd2 = (short) (C1607wl.Xd() ^ 13821);
        int[] iArr = new int["z\"HfF\u001dLS3,x\t\\|\u001d+GfH".length()];
        QB qb = new QB("z\"HfF\u001dLS3,x\t\\|\u001d+GfH");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
            i2++;
        }
        map.put(new String(iArr, 0, i2), getPlayServicesStatusMap());
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        map.put(C1626yg.Ud("LY~#F\u0013fc\u0012^^", (short) (FB.Xd() ^ 6142), (short) (FB.Xd() ^ 4284)), "");
        Object[] objArr = new Object[0];
        Method method = Class.forName(Ig.wd("\u0010C7&z\u001fF8*#,\f-4:N\u000eH\u0010m\u001b\u0003h", (short) (C1633zX.Xd() ^ (-9131)))).getMethod(EO.Od(",|M\bjBO}\u0011\u000b\n", (short) (C1499aX.Xd() ^ (-22989))), new Class[0]);
        try {
            method.setAccessible(true);
            map.put(C1561oA.Qd("\u0005\u0001x\bu\u0006\f\u0011tx\u0001ro\u007fy{\u0002", (short) (FB.Xd() ^ 32275)), ((File) method.invoke(reactApplicationContext, objArr)).getAbsolutePath());
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(C1593ug.zd("\u001f-$31,(r)66=/9@z\u0011>>E7KH", (short) (ZN.Xd() ^ 22876), (short) (ZN.Xd() ^ 9593))).getMethod(C1561oA.od("mjxFcdhdBfn", (short) (C1633zX.Xd() ^ (-30968))), new Class[0]);
            try {
                method2.setAccessible(true);
                map.put(C1561oA.Kd("\u007fqz~\u000ftz\u0005xw\n\u0006\n\u0012", (short) (FB.Xd() ^ 17098)), ((File) method2.invoke(reactApplicationContext, objArr2)).getAbsolutePath());
                Object[] objArr3 = new Object[0];
                Method method3 = Class.forName(Wg.Zd("\u007fe\u007f4'EV\u0005O\u0002%\u0011(U@\u001fH\u001bo\u001aA9Z", (short) (C1499aX.Xd() ^ (-11100)), (short) (C1499aX.Xd() ^ (-7234)))).getMethod(C1561oA.Xd("+*:\n),20\u00106@", (short) (OY.Xd() ^ 8455)), new Class[0]);
                try {
                    method3.setAccessible(true);
                    map.put(Wg.vd("zyx~\u0001\u0010\u0019~\t\u0013\u0003\u0002\u0018\u0014\u0014\u001c", (short) (C1607wl.Xd() ^ 22247)), ((File) method3.invoke(reactApplicationContext, objArr3)).getAbsolutePath());
                    Class<?> cls = Class.forName(Qg.kd("lxmzvoi2fqotdlq*>igl\\ni", (short) (C1633zX.Xd() ^ (-9964)), (short) (C1633zX.Xd() ^ (-10205))));
                    Class<?>[] clsArr = {Class.forName(hg.Vd("\u0004y\u000ewC\u0001t\u0001x>b\u0003\u007fuyq", (short) (C1633zX.Xd() ^ (-5405)), (short) (C1633zX.Xd() ^ (-24408))))};
                    Object[] objArr4 = {null};
                    short sXd3 = (short) (C1580rY.Xd() ^ (-28127));
                    int[] iArr2 = new int["2/=\r?:*61#-\u0006(*\"/~#+".length()];
                    QB qb2 = new QB("2/=\r?:*61#-\u0006(*\"/~#+");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(sXd3 + i3 + xuXd2.CK(iKK2));
                        i3++;
                    }
                    Method method4 = cls.getMethod(new String(iArr2, 0, i3), clsArr);
                    try {
                        method4.setAccessible(true);
                        File file = (File) method4.invoke(reactApplicationContext, objArr4);
                        String strYd = C1561oA.yd("|\u0007}\u000f\u0002x\u0005\n \u0004\f\u0014\u0002~\u0013\r\u001b!", (short) (C1499aX.Xd() ^ (-32407)));
                        if (file != null) {
                            map.put(strYd, file.getAbsolutePath());
                        } else {
                            Object[] objArr5 = new Object[0];
                            Method method5 = Class.forName(C1561oA.Yd("\u000b\u0019\u0010\u001f\u001d\u0018\u0014^\u0015\"\")\u001b%,f|**1#74", (short) (C1580rY.Xd() ^ (-1289)))).getMethod(Xg.qd("BAQ$HLFU'MW", (short) (OY.Xd() ^ 22350), (short) (OY.Xd() ^ 14309)), new Class[0]);
                            try {
                                method5.setAccessible(true);
                                map.put(strYd, ((File) method5.invoke(reactApplicationContext, objArr5)).getAbsolutePath());
                            } catch (InvocationTargetException e2) {
                                throw e2.getCause();
                            }
                        }
                        if (!map.containsKey(strYd)) {
                            Object[] objArr6 = new Object[0];
                            Method method6 = Class.forName(Jg.Wd("\u0015?.\u001f\n|z4`_OI?93SWfmhFA2", (short) (ZN.Xd() ^ 7064), (short) (ZN.Xd() ^ 22447))).getMethod(ZO.xd("f\u00183\r\nEVErS(", (short) (C1607wl.Xd() ^ 1932), (short) (C1607wl.Xd() ^ 22924)), new Class[0]);
                            try {
                                method6.setAccessible(true);
                                map.put(strYd, ((File) method6.invoke(reactApplicationContext, objArr6)).getAbsolutePath());
                            } catch (InvocationTargetException e3) {
                                throw e3.getCause();
                            }
                        }
                        map.put(C1626yg.Ud("RH\u0001EQYwYfGU\u0013c'Wg\u0012/", (short) (C1499aX.Xd() ^ (-28026)), (short) (C1499aX.Xd() ^ (-19014))), Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getAbsolutePath());
                        map.put(Ig.wd("\r?B\u0014=u,/p\\W-nezZ", (short) (OY.Xd() ^ 22774)), Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES).getAbsolutePath());
                        File externalStorageDirectory = Environment.getExternalStorageDirectory();
                        if (externalStorageDirectory != null) {
                            map.put(EO.Od("\u0019eO\u001cA\u0003&0\u001b^a:\tm\u0018o76rW\u00023*!\f\u000b", (short) (C1633zX.Xd() ^ (-3447))), externalStorageDirectory.getAbsolutePath());
                        }
                        if (file != null) {
                            short sXd4 = (short) (C1580rY.Xd() ^ (-15962));
                            int[] iArr3 = new int["p\u0003}mytfp\u0003fjrdaqkms".length()];
                            QB qb3 = new QB("p\u0003}mytfp\u0003fjrdaqkms");
                            int i4 = 0;
                            while (qb3.YK()) {
                                int iKK3 = qb3.KK();
                                Xu xuXd3 = Xu.Xd(iKK3);
                                iArr3[i4] = xuXd3.fK(sXd4 + sXd4 + sXd4 + i4 + xuXd3.CK(iKK3));
                                i4++;
                            }
                            map.put(new String(iArr3, 0, i4), file.getAbsolutePath());
                        }
                        return map;
                    } catch (InvocationTargetException e4) {
                        throw e4.getCause();
                    }
                } catch (InvocationTargetException e5) {
                    throw e5.getCause();
                }
            } catch (InvocationTargetException e6) {
                throw e6.getCause();
            }
        } catch (InvocationTargetException e7) {
            throw e7.getCause();
        }
    }
}
