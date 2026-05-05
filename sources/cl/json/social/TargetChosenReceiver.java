package cl.json.social;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes4.dex */
public class TargetChosenReceiver extends BroadcastReceiver {
    private static final String EXTRA_RECEIVER_TOKEN = "receiver_token";
    private static final Object LOCK = new Object();
    private static Promise callback = null;
    private static TargetChosenReceiver sLastRegisteredReceiver = null;
    private static String sTargetChosenReceiveAction = null;

    public static void callbackReject(String str) {
        Promise promise = callback;
        if (promise != null) {
            promise.reject(str);
        }
        callback = null;
    }

    public static void callbackResolve(Object obj) {
        Promise promise = callback;
        if (promise != null) {
            promise.resolve(obj);
        }
        callback = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x02bc A[Catch: all -> 0x0363, LOOP:3: B:129:0x02b6->B:131:0x02bc, LOOP_END, TryCatch #1 {, blocks: (B:83:0x0003, B:85:0x0009, B:86:0x0048, B:88:0x004e, B:89:0x0066, B:90:0x0076, B:92:0x007e, B:93:0x00d2, B:95:0x00db, B:96:0x00df, B:97:0x00e0, B:99:0x00ed, B:100:0x0119, B:101:0x0120, B:110:0x016a, B:112:0x0172, B:113:0x019b, B:115:0x01a1, B:116:0x01c4, B:117:0x01f0, B:119:0x01f6, B:120:0x021b, B:121:0x0264, B:134:0x0319, B:123:0x026e, B:124:0x0272, B:126:0x0274, B:127:0x0278, B:128:0x0279, B:129:0x02b6, B:131:0x02bc, B:132:0x02d5, B:133:0x0312, B:138:0x035e, B:139:0x0362), top: B:145:0x0003, inners: #0, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00ed A[Catch: all -> 0x0363, TRY_LEAVE, TryCatch #1 {, blocks: (B:83:0x0003, B:85:0x0009, B:86:0x0048, B:88:0x004e, B:89:0x0066, B:90:0x0076, B:92:0x007e, B:93:0x00d2, B:95:0x00db, B:96:0x00df, B:97:0x00e0, B:99:0x00ed, B:100:0x0119, B:101:0x0120, B:110:0x016a, B:112:0x0172, B:113:0x019b, B:115:0x01a1, B:116:0x01c4, B:117:0x01f0, B:119:0x01f6, B:120:0x021b, B:121:0x0264, B:134:0x0319, B:123:0x026e, B:124:0x0272, B:126:0x0274, B:127:0x0278, B:128:0x0279, B:129:0x02b6, B:131:0x02bc, B:132:0x02d5, B:133:0x0312, B:138:0x035e, B:139:0x0362), top: B:145:0x0003, inners: #0, #3, #4, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.content.IntentSender getSharingSenderIntent(com.facebook.react.bridge.ReactContext r19) {
        /*
            Method dump skipped, instruction units count: 870
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cl.json.social.TargetChosenReceiver.getSharingSenderIntent(com.facebook.react.bridge.ReactContext):android.content.IntentSender");
    }

    public static boolean isSupported() {
        return true;
    }

    public static void registerCallbacks(Promise promise) {
        callback = promise;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        synchronized (LOCK) {
            if (sLastRegisteredReceiver != this) {
                return;
            }
            Class<?> cls = Class.forName(C1561oA.Xd("HVM\\ZUQ\u001cR__fXbi$:ggn`tq", (short) (ZN.Xd() ^ 6503)));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd = (short) (ZN.Xd() ^ AuthApiStatusCodes.AUTH_API_SERVER_ERROR);
            int[] iArr = new int["10@\u000e674254H>==\u0013@(/!5*".length()];
            QB qb = new QB("10@\u000e674254H>==\u0013@(/!5*");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                Context context2 = (Context) method.invoke(context, objArr);
                TargetChosenReceiver targetChosenReceiver = sLastRegisteredReceiver;
                short sXd2 = (short) (C1580rY.Xd() ^ (-16040));
                short sXd3 = (short) (C1580rY.Xd() ^ (-9913));
                int[] iArr2 = new int["^j_lha[$XcafV^c\u001c0[Y^N`[".length()];
                QB qb2 = new QB("^j_lha[$XcafV^c\u001c0[Y^N`[");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(((sXd2 + i3) + xuXd2.CK(iKK2)) - sXd3);
                    i3++;
                }
                Class<?> cls2 = Class.forName(new String(iArr2, 0, i3));
                Class<?>[] clsArr2 = {Class.forName(hg.Vd("WcXeaZT\u001dQ\\Z_OW\\\u0015(WSDFDARR/A>?BN<H", (short) (Od.Xd() ^ (-25995)), (short) (Od.Xd() ^ (-22979))))};
                Object[] objArr2 = {targetChosenReceiver};
                short sXd4 = (short) (C1607wl.Xd() ^ 14004);
                int[] iArr3 = new int["<47)*+44$0\u000f!\u001e\u001f\".\u001c(".length()];
                QB qb3 = new QB("<47)*+44$0\u000f!\u001e\u001f\".\u001c(");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK(sXd4 + i4 + xuXd3.CK(iKK3));
                    i4++;
                }
                Method method2 = cls2.getMethod(new String(iArr3, 0, i4), clsArr2);
                try {
                    method2.setAccessible(true);
                    method2.invoke(context2, objArr2);
                    sLastRegisteredReceiver = null;
                    short sXd5 = (short) (FB.Xd() ^ 8336);
                    int[] iArr4 = new int["6(%&1=+7+?945=".length()];
                    QB qb4 = new QB("6(%&1=+7+?945=");
                    int i5 = 0;
                    while (qb4.YK()) {
                        int iKK4 = qb4.KK();
                        Xu xuXd4 = Xu.Xd(iKK4);
                        iArr4[i5] = xuXd4.fK(xuXd4.CK(iKK4) - (sXd5 ^ i5));
                        i5++;
                    }
                    if (intent.hasExtra(new String(iArr4, 0, i5))) {
                        short sXd6 = (short) (C1499aX.Xd() ^ (-22092));
                        int[] iArr5 = new int["%\u0019\u0018\u001b .\u001e,\u001a0,)$.".length()];
                        QB qb5 = new QB("%\u0019\u0018\u001b .\u001e,\u001a0,)$.");
                        int i6 = 0;
                        while (qb5.YK()) {
                            int iKK5 = qb5.KK();
                            Xu xuXd5 = Xu.Xd(iKK5);
                            iArr5[i6] = xuXd5.fK(xuXd5.CK(iKK5) - (((sXd6 + sXd6) + sXd6) + i6));
                            i6++;
                        }
                        if (intent.getIntExtra(new String(iArr5, 0, i6), 0) != hashCode()) {
                            return;
                        }
                        short sXd7 = (short) (C1607wl.Xd() ^ 27929);
                        short sXd8 = (short) (C1607wl.Xd() ^ 22004);
                        int[] iArr6 = new int["hvm|zuq<x~\u0006w\u0002\tC{\u0010\r\f{I_emreo\u0002fsrvvvnx\u007f".length()];
                        QB qb6 = new QB("hvm|zuq<x~\u0006w\u0002\tC{\u0010\r\f{I_emreo\u0002fsrvvvnx\u007f");
                        int i7 = 0;
                        while (qb6.YK()) {
                            int iKK6 = qb6.KK();
                            Xu xuXd6 = Xu.Xd(iKK6);
                            iArr6[i7] = xuXd6.fK((xuXd6.CK(iKK6) - (sXd7 + i7)) + sXd8);
                            i7++;
                        }
                        ComponentName componentName = (ComponentName) intent.getParcelableExtra(new String(iArr6, 0, i7));
                        WritableMap writableMapCreateMap = Arguments.createMap();
                        writableMapCreateMap.putBoolean(Jg.Wd("|J\u0003b0\nh", (short) (C1633zX.Xd() ^ (-30972)), (short) (C1633zX.Xd() ^ (-27987))), true);
                        if (componentName != null) {
                            short sXd9 = (short) (Od.Xd() ^ (-11919));
                            short sXd10 = (short) (Od.Xd() ^ (-12425));
                            int[] iArr7 = new int["\u001dAw4\u001e\u0002\\".length()];
                            QB qb7 = new QB("\u001dAw4\u001e\u0002\\");
                            int i8 = 0;
                            while (qb7.YK()) {
                                int iKK7 = qb7.KK();
                                Xu xuXd7 = Xu.Xd(iKK7);
                                iArr7[i8] = xuXd7.fK(xuXd7.CK(iKK7) - (C1561oA.Xd[i8 % C1561oA.Xd.length] ^ ((i8 * sXd10) + sXd9)));
                                i8++;
                            }
                            writableMapCreateMap.putString(new String(iArr7, 0, i8), componentName.flattenToString());
                        } else {
                            short sXd11 = (short) (C1580rY.Xd() ^ (-1913));
                            short sXd12 = (short) (C1580rY.Xd() ^ (-28279));
                            int[] iArr8 = new int["S:?9#=i".length()];
                            QB qb8 = new QB("S:?9#=i");
                            int i9 = 0;
                            while (qb8.YK()) {
                                int iKK8 = qb8.KK();
                                Xu xuXd8 = Xu.Xd(iKK8);
                                iArr8[i9] = xuXd8.fK((C1561oA.Xd[i9 % C1561oA.Xd.length] ^ ((sXd11 + sXd11) + (i9 * sXd12))) + xuXd8.CK(iKK8));
                                i9++;
                            }
                            writableMapCreateMap.putString(new String(iArr8, 0, i9), Ig.wd("@u", (short) (OY.Xd() ^ 10456)));
                        }
                        callbackResolve(writableMapCreateMap);
                    }
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
    }
}
