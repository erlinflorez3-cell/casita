package com.learnium.RNDeviceInfo;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.PrintStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import yg.C1561oA;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes5.dex */
public class RNInstallReferrerClient {
    private static Class<?> InstallReferrerClientClazz = null;
    private static Class<?> InstallReferrerStateListenerClazz = null;
    private static final int R_RESPONSE_FEATURE_NOT_SUPPORTED = 2;
    private static final int R_RESPONSE_OK = 0;
    private static final int R_RESPONSE_SERVICE_UNAVAILABLE = 1;
    private static Class<?> ReferrerDetailsClazz = null;
    private Object installReferrerStateListener;
    private Object mReferrerClient;
    private final SharedPreferences sharedPreferences;

    private class InstallReferrerStateListenerProxy implements InvocationHandler {
        private InstallReferrerStateListenerProxy() {
        }

        /* synthetic */ InstallReferrerStateListenerProxy(RNInstallReferrerClient rNInstallReferrerClient, InstallReferrerStateListenerProxyIA installReferrerStateListenerProxyIA) {
            this();
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            try {
                if (name.equals("onInstallReferrerSetupFinished") && objArr != null) {
                    Object obj2 = objArr[0];
                    if (obj2 instanceof Integer) {
                        onInstallReferrerSetupFinished(((Integer) obj2).intValue());
                        return null;
                    }
                }
                if (!name.equals("onInstallReferrerServiceDisconnected")) {
                    return null;
                }
                onInstallReferrerServiceDisconnected();
                return null;
            } catch (Exception e2) {
                throw new RuntimeException("unexpected invocation exception: " + e2.getMessage());
            }
        }

        public void onInstallReferrerServiceDisconnected() {
        }

        public void onInstallReferrerSetupFinished(int i2) {
            if (i2 != 0) {
                if (i2 == 1 || i2 != 2) {
                    return;
                } else {
                    return;
                }
            }
            try {
                String str = (String) RNInstallReferrerClient.ReferrerDetailsClazz.getMethod("getInstallReferrer", new Class[0]).invoke(RNInstallReferrerClient.InstallReferrerClientClazz.getMethod("getInstallReferrer", new Class[0]).invoke(RNInstallReferrerClient.this.mReferrerClient, new Object[0]), new Object[0]);
                SharedPreferences.Editor editorEdit = RNInstallReferrerClient.this.sharedPreferences.edit();
                editorEdit.putString("installReferrer", str);
                editorEdit.apply();
                RNInstallReferrerClient.InstallReferrerClientClazz.getMethod("endConnection", new Class[0]).invoke(RNInstallReferrerClient.this.mReferrerClient, new Object[0]);
            } catch (Exception e2) {
                System.err.println("RNInstallReferrerClient exception. getInstallReferrer will be unavailable: " + e2.getMessage());
                e2.printStackTrace(System.err);
            }
        }
    }

    static {
        try {
            InstallReferrerClientClazz = Class.forName("com.android.installreferrer.api.InstallReferrerClient");
            InstallReferrerStateListenerClazz = Class.forName("com.android.installreferrer.api.InstallReferrerStateListener");
            ReferrerDetailsClazz = Class.forName("com.android.installreferrer.api.ReferrerDetails");
        } catch (Exception unused) {
            System.err.println("RNInstallReferrerClient exception. 'installreferrer' APIs are unavailable.");
        }
    }

    RNInstallReferrerClient(Context context) throws Throwable {
        Object[] objArr = {C1561oA.Yd("\u000e\u0002~\u0002\u0014M\u0010\u0004\u0018\u000e\u001c\fT\r\u000f!\u0015\u0010\u0013[\u0019\u001f\u0018\"", (short) (C1633zX.Xd() ^ (-139))), 0};
        Method method = Class.forName(Xg.qd("lzq\u0001~yu@v\u0004\u0004\u000b|\u0007\u000eH^\f\f\u0013\u0005\u0019\u0016", (short) (OY.Xd() ^ 32288), (short) (OY.Xd() ^ 11657))).getMethod(ZO.xd("CT|\r3&\u0013HR\f\u00187.x\u001blW:]\n", (short) (C1633zX.Xd() ^ (-13216)), (short) (C1633zX.Xd() ^ (-12310))), Class.forName(Jg.Wd("_4\u0013Bpt3\u001e_krX!tC\u0002", (short) (ZN.Xd() ^ 10033), (short) (ZN.Xd() ^ 31657))), Integer.TYPE);
        try {
            method.setAccessible(true);
            this.sharedPreferences = (SharedPreferences) method.invoke(context, objArr);
            Class<?> cls = InstallReferrerClientClazz;
            if (cls == null || InstallReferrerStateListenerClazz == null || ReferrerDetailsClazz == null) {
                return;
            }
            try {
                Object objInvoke = cls.getMethod(C1626yg.Ud("dLAc?4L\u0004mW", (short) (FB.Xd() ^ 13922), (short) (FB.Xd() ^ 4016)), Context.class).invoke(null, context);
                Class<?> cls2 = objInvoke.getClass();
                short sXd = (short) (OY.Xd() ^ 12995);
                int[] iArr = new int["\u0003a%\u000f\u0005".length()];
                QB qb = new QB("\u0003a%\u000f\u0005");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
                    i2++;
                }
                this.mReferrerClient = cls2.getMethod(new String(iArr, 0, i2), new Class[0]).invoke(objInvoke, new Object[0]);
                this.installReferrerStateListener = Proxy.newProxyInstance(InstallReferrerStateListenerClazz.getClassLoader(), new Class[]{InstallReferrerStateListenerClazz}, new InstallReferrerStateListenerProxy());
                InstallReferrerClientClazz.getMethod(EO.Od("X\u0011mXThCC\u001b_aN\u000f\r\u000e", (short) (FB.Xd() ^ 2609)), InstallReferrerStateListenerClazz).invoke(this.mReferrerClient, this.installReferrerStateListener);
            } catch (Exception e2) {
                PrintStream printStream = System.err;
                short sXd2 = (short) (FB.Xd() ^ 24508);
                int[] iArr2 = new int["\u007fzt\u0019\u001d\u001d\t\u0013\u0012v\t\t\u0007\u0013\u0012\u0004\u0010_\b\u0004~\u0007\f6z\rvw\u0002\u0005x}{:+qn|PtxxdnmRddbnm_k\u0018n_a`\u0013TV\u0010d\\NbLSUIIRJ\u001e\u0003".length()];
                QB qb2 = new QB("\u007fzt\u0019\u001d\u001d\t\u0013\u0012v\t\t\u0007\u0013\u0012\u0004\u0010_\b\u0004~\u0007\f6z\rvw\u0002\u0005x}{:+qn|PtxxdnmRddbnm_k\u0018n_a`\u0013TV\u0010d\\NbLSUIIRJ\u001e\u0003");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(sXd2 + sXd2 + sXd2 + i3 + xuXd2.CK(iKK2));
                    i3++;
                }
                printStream.println(new String(iArr2, 0, i3) + e2.getMessage());
                e2.printStackTrace(System.err);
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }
}
