package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.android.installreferrer.commons.InstallReferrerCommons;
import com.google.android.finsky.externalreferrer.IGetInstallReferrerService;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
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

/* JADX INFO: loaded from: classes2.dex */
class InstallReferrerClientImpl extends InstallReferrerClient {
    private static final int PLAY_STORE_MIN_APP_VER = 80837300;
    private static final String SERVICE_ACTION_NAME = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE";
    private static final String SERVICE_NAME = "com.google.android.finsky.externalreferrer.GetInstallReferrerService";
    private static final String SERVICE_PACKAGE_NAME = "com.android.vending";
    private static final String TAG = "InstallReferrerClient";
    private int clientState = 0;
    private final Context mApplicationContext;
    private IGetInstallReferrerService service;
    private ServiceConnection serviceConnection;

    /* JADX INFO: loaded from: classes.dex */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ClientState {
        public static final int CLOSED = 3;
        public static final int CONNECTED = 2;
        public static final int CONNECTING = 1;
        public static final int DISCONNECTED = 0;
    }

    /* JADX INFO: loaded from: classes.dex */
    private final class InstallReferrerServiceConnection implements ServiceConnection {
        private final InstallReferrerStateListener mListener;

        private InstallReferrerServiceConnection(InstallReferrerStateListener installReferrerStateListener) {
            if (installReferrerStateListener == null) {
                throw new RuntimeException("Please specify a listener to know when setup is done.");
            }
            this.mListener = installReferrerStateListener;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            InstallReferrerCommons.logVerbose(InstallReferrerClientImpl.TAG, "Install Referrer service connected.");
            InstallReferrerClientImpl.this.service = IGetInstallReferrerService.Stub.b(iBinder);
            InstallReferrerClientImpl.this.clientState = 2;
            this.mListener.onInstallReferrerSetupFinished(0);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            InstallReferrerCommons.logWarn(InstallReferrerClientImpl.TAG, "Install Referrer service disconnected.");
            InstallReferrerClientImpl.this.service = null;
            InstallReferrerClientImpl.this.clientState = 0;
            this.mListener.onInstallReferrerServiceDisconnected();
        }
    }

    public InstallReferrerClientImpl(Context context) throws Throwable {
        short sXd = (short) (C1633zX.Xd() ^ (-22948));
        int[] iArr = new int["t\u0003y\t\u0007\u0002}H~\f\f\u0013\u0005\u000f\u0016Pf\u0014\u0014\u001b\r!\u001e".length()];
        QB qb = new QB("t\u0003y\t\u0007\u0002}H~\f\f\u0013\u0005\u000f\u0016Pf\u0014\u0014\u001b\r!\u001e");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Wg.vd("\u0011\u0010 m\u0016\u0017\u0014\u0012\u0005\u0004\u0018\u000e\r\rb\u0010\b\u000f\u0001\u0015\n", (short) (C1633zX.Xd() ^ (-28152))), new Class[0]);
        try {
            method.setAccessible(true);
            this.mApplicationContext = (Context) method.invoke(context, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private boolean isPlayStoreCompatible() throws Throwable {
        Object[] objArr;
        Method method;
        Context context = this.mApplicationContext;
        Class<?> cls = Class.forName(Qg.kd("#/$1-& h\u001d(&+\u001b#(`t \u001e#\u0013% ", (short) (ZN.Xd() ^ 16340), (short) (ZN.Xd() ^ 28080)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr2 = new Object[0];
        short sXd = (short) (C1607wl.Xd() ^ 3250);
        short sXd2 = (short) (C1607wl.Xd() ^ 9758);
        int[] iArr = new int["\u0010\r\u001bu\u0006\u0007\u000e\u0003\b\u0005k~\u000b|\u0002~\u000b".length()];
        QB qb = new QB("\u0010\r\u001bu\u0006\u0007\u000e\u0003\b\u0005k~\u000b|\u0002~\u000b");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
            i2++;
        }
        Method method2 = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method2.setAccessible(true);
            PackageManager packageManager = (PackageManager) method2.invoke(context, objArr2);
            String strUd = C1561oA.ud("mxu5gshuqjd-tbj_cg_", (short) (OY.Xd() ^ 27715));
            try {
                Class<?> cls2 = Class.forName(C1561oA.yd(">JCPPIG\u0010HSUZNV_\u0018=9|\u001e23>3<9$7G9B?o", (short) (C1607wl.Xd() ^ 5643)));
                Class<?>[] clsArr2 = new Class[2];
                clsArr2[0] = Class.forName(C1561oA.Yd("\u000f\u0007\u001d\tV\u0016\f\u001a\u0014[\u0002$#\u001b!\u001b", (short) (Od.Xd() ^ (-22926))));
                clsArr2[1] = Integer.TYPE;
                objArr = new Object[]{strUd, 128};
                method = cls2.getMethod(Xg.qd("\u001d\u001c,\t\u001b\u001e'\u001e%$\t/(2", (short) (C1580rY.Xd() ^ (-2482)), (short) (C1580rY.Xd() ^ (-23436))), clsArr2);
                try {
                    method.setAccessible(true);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return ((PackageInfo) method.invoke(packageManager, objArr)).versionCode >= PLAY_STORE_MIN_APP_VER;
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public void endConnection() throws Throwable {
        this.clientState = 3;
        if (this.serviceConnection != null) {
            InstallReferrerCommons.logVerbose(Jg.Wd("\u00194\u0013IO\u0016k\u000b7oH\u000f$R9?\u0002:\fNm", (short) (FB.Xd() ^ 24542), (short) (FB.Xd() ^ 8347)), ZO.xd("e\u0003\u0001\u0011TvI:Z(\b\u0003\u0006avQ\u0018D`)+\b\u000e", (short) (Od.Xd() ^ (-24079)), (short) (Od.Xd() ^ (-2114))));
            Context context = this.mApplicationContext;
            Object[] objArr = {this.serviceConnection};
            Method method = Class.forName(C1626yg.Ud("bTx\u001a;X+\\ \u0005x4,\u000b0JOi6W\u00108F", (short) (C1633zX.Xd() ^ (-31415)), (short) (C1633zX.Xd() ^ (-5973)))).getMethod(EO.Od("\u0004L\u000e}#m8#v\u001f\u0014(t", (short) (C1580rY.Xd() ^ (-20721))), Class.forName(Ig.wd("J\u0002*[H\u0016`\n\u0005$!I\bb\u0005$\u0001\u0015I1i\u0013jPn];iIH\rx[", (short) (Od.Xd() ^ (-24954)))));
            try {
                method.setAccessible(true);
                method.invoke(context, objArr);
                this.serviceConnection = null;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        this.service = null;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public ReferrerDetails getInstallReferrer() throws Throwable {
        if (!isReady()) {
            throw new IllegalStateException(C1561oA.Xd("y\r\u001b \u0014\u000f\u0012M\u001d\u001f%Q\u0016##$\u001c\u001b-\u001f\u001fi\\\u000e+%\"5(c8:(:=i,k0==>65G=DDv:>@JNB}TSJPJ\u0004YNL\b\\O]bVQT\u001e", (short) (Od.Xd() ^ (-18892))));
        }
        Bundle bundle = new Bundle();
        Context context = this.mApplicationContext;
        short sXd = (short) (OY.Xd() ^ 19598);
        int[] iArr = new int["\u0012\u001e\u0013 \u001c\u0015\u000fW\f\u0017\u0015\u001a\n\u0012\u0017Oc\u000f\r\u0012\u0002\u0014\u000f".length()];
        QB qb = new QB("\u0012\u001e\u0013 \u001c\u0015\u000fW\f\u0017\u0015\u001a\n\u0012\u0017Oc\u000f\r\u0012\u0002\u0014\u000f");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1593ug.zd(":9I&8;D;BA+?LE", (short) (C1580rY.Xd() ^ (-32618)), (short) (C1580rY.Xd() ^ (-843))), new Class[0]);
        try {
            method.setAccessible(true);
            bundle.putString(C1561oA.od("}mnujolesepg", (short) (ZN.Xd() ^ 14428)), (String) method.invoke(context, objArr));
            try {
                return new ReferrerDetails(this.service.c(bundle));
            } catch (RemoteException e2) {
                InstallReferrerCommons.logWarn(C1561oA.Kd("Lrxzhtu\\prr\u0001\u0002u\u0004U\u007f}z\u0005\f", (short) (OY.Xd() ^ 1866)), Wg.Zd(">\u0012Hh,\u0013An\u001a.k\n=9\u00076>\u000b\u0010Ra\u0011$\u001d\\0+ru/E=\u0002G\u000b\u0004_U\u00050\fg/!|q17\u00014P\u0006", (short) (C1499aX.Xd() ^ (-7567)), (short) (C1499aX.Xd() ^ (-11773))));
                this.clientState = 0;
                throw e2;
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public boolean isReady() {
        return (this.clientState != 2 || this.service == null || this.serviceConnection == null) ? false : true;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public void startConnection(InstallReferrerStateListener installReferrerStateListener) throws Throwable {
        boolean zIsReady = isReady();
        String strVd = Wg.vd("f\u000b\u000f\u000f\u0003\r\fp\u000b\u000b\t\u0015\u001c\u000e\u001aiyupx\u0006", (short) (ZN.Xd() ^ 17564));
        if (zIsReady) {
            short sXd = (short) (Od.Xd() ^ (-14457));
            short sXd2 = (short) (Od.Xd() ^ (-18808));
            int[] iArr = new int["{\r\u0019\u001c\u000e\u0007\bA\u0004\u000f\r\f\u0002~\u000f\u0003\b\u00066~\b3\tr|xr;,Yy)vlki$wq!rd+fjdnbYc_oY!".length()];
            QB qb = new QB("{\r\u0019\u001c\u000e\u0007\bA\u0004\u000f\r\f\u0002~\u000f\u0003\b\u00066~\b3\tr|xr;,Yy)vlki$wq!rd+fjdnbYc_oY!");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
                i2++;
            }
            InstallReferrerCommons.logVerbose(strVd, new String(iArr, 0, i2));
            installReferrerStateListener.onInstallReferrerSetupFinished(0);
            return;
        }
        int i3 = this.clientState;
        if (i3 == 1) {
            short sXd3 = (short) (FB.Xd() ^ 21179);
            short sXd4 = (short) (FB.Xd() ^ 12753);
            int[] iArr2 = new int["\u001eFB=EJt=Fq2<A3.0Di26f:-)b23/\"#0/Z)\u001fW\u001a%#\"\u0018\u0015%\u0019\u001d\u0015L \u001aI\u001d\u0010\fE\u0018\t\u0015\u0018\n\u0003\u0004K".length()];
            QB qb2 = new QB("\u001eFB=EJt=Fq2<A3.0Di26f:-)b23/\"#0/Z)\u001fW\u001a%#\"\u0018\u0015%\u0019\u001d\u0015L \u001aI\u001d\u0010\fE\u0018\t\u0015\u0018\n\u0003\u0004K");
            int i4 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i4] = xuXd2.fK(sXd3 + i4 + xuXd2.CK(iKK2) + sXd4);
                i4++;
            }
            InstallReferrerCommons.logWarn(strVd, new String(iArr2, 0, i4));
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
            return;
        }
        if (i3 == 3) {
            InstallReferrerCommons.logWarn(strVd, C1561oA.ud("z#\u001f\u001a\"'Q(\u0011\"M\u000e\u0018\u001d\u000f\n\f E\b\u0010\u0012\u0015\u0006\u0004>~\u000b\u007f:|y\u0006=\n4uw1\u0003t\u0004\u0001qo8)Xskfwh\"drd_qa\u001b[ggk^Zf\u0013[_ccO[OP\u0018", (short) (OY.Xd() ^ 4860)));
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
            return;
        }
        InstallReferrerCommons.logVerbose(strVd, C1561oA.yd("Wwcsthld,tx||hrq4\u0006wwu\u0002\u0001r\u000f;\u000e~\u000b\u000e\u007fx\nC\u0016\u0007\u0015\u0015\u000fK", (short) (C1607wl.Xd() ^ 28253)));
        Intent intent = new Intent(C1561oA.Yd("*76w2;<5;5~3A8GE@<\u0007@DJPIX\u000e#+1(D-,<H39?A/;<PD8::HI=KYNAOTHCF", (short) (C1499aX.Xd() ^ (-14883))));
        String strQd = Xg.qd("-:9z5>?8>8\u00026D;JHC?\nCGMSL[\u0011I]ZLZWKW^RTTbcWe\"<[kAgmo]ijQegguvjxZm{\u0001tor", (short) (C1499aX.Xd() ^ (-15852)), (short) (C1499aX.Xd() ^ (-5360)));
        String strWd = Jg.Wd("S\u0013G<*h0}/U\r\fg\u000fHv7i8", (short) (C1580rY.Xd() ^ (-16989)), (short) (C1580rY.Xd() ^ (-17738)));
        intent.setComponent(new ComponentName(strWd, strQd));
        Context context = this.mApplicationContext;
        Object[] objArr = new Object[0];
        Method method = Class.forName(ZO.xd("9r\u0015>\u0003ZOWL\u0011RH\u0006}$\t&/B\u0018\u0019{@", (short) (Od.Xd() ^ (-11007)), (short) (Od.Xd() ^ (-137)))).getMethod(C1626yg.Ud("=s\bC\u001e8B{<\u001b-G*\t\u0001p\u000e", (short) (C1633zX.Xd() ^ (-23831)), (short) (C1633zX.Xd() ^ (-19474))), new Class[0]);
        try {
            method.setAccessible(true);
            PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
            Class<?> cls = Class.forName(Ig.wd("f&Lw\"wDcb\u007fz%+<`}s\u0001f/\n5\u0019\t\tx@\u007ftW/\u0013\u0006", (short) (C1633zX.Xd() ^ (-31841))));
            Class<?>[] clsArr = {Class.forName(EO.Od("-g\u000e5d<\r05NIs0I\u0019uN\fKv?z", (short) (C1633zX.Xd() ^ (-24869)))), Integer.TYPE};
            Object[] objArr2 = {intent, 0};
            short sXd5 = (short) (C1499aX.Xd() ^ (-29811));
            int[] iArr3 = new int["Y\\KW],PUEMR0AMPB;<I".length()];
            QB qb3 = new QB("Y\\KW],PUEMR0AMPB;<I");
            int i5 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i5] = xuXd3.fK(sXd5 + sXd5 + sXd5 + i5 + xuXd3.CK(iKK3));
                i5++;
            }
            Method method2 = cls.getMethod(new String(iArr3, 0, i5), clsArr);
            try {
                method2.setAccessible(true);
                List list = (List) method2.invoke(packageManager, objArr2);
                if (list != null && !list.isEmpty()) {
                    ResolveInfo resolveInfo = (ResolveInfo) list.get(0);
                    if (resolveInfo.serviceInfo != null) {
                        String str = resolveInfo.serviceInfo.packageName;
                        String str2 = resolveInfo.serviceInfo.name;
                        if (!strWd.equals(str) || str2 == null || !isPlayStoreCompatible()) {
                            InstallReferrerCommons.logWarn(strVd, hg.Vd("1L@W|/OIK=vC>GF;?7n=?k48,746&8,$-%l]\u0013!--\"'%Ulae_gbN\u001d\u001fK\u0017\u000b\u001d\r\u0019E\u0017\t\u0014\u0017\n\u0012\u0004\u0002J", (short) (C1580rY.Xd() ^ (-2463)), (short) (C1580rY.Xd() ^ (-27129))));
                            this.clientState = 0;
                            installReferrerStateListener.onInstallReferrerSetupFinished(2);
                            return;
                        }
                        Intent intent2 = new Intent(intent);
                        InstallReferrerServiceConnection installReferrerServiceConnection = new InstallReferrerServiceConnection(installReferrerStateListener);
                        this.serviceConnection = installReferrerServiceConnection;
                        try {
                            Context context2 = this.mApplicationContext;
                            Class<?> cls2 = Class.forName(C1593ug.zd("\"0'64/+u,99@2<C}\u0014AAH:NK", (short) (C1499aX.Xd() ^ (-14505)), (short) (C1499aX.Xd() ^ (-3067))));
                            Class<?>[] clsArr2 = new Class[3];
                            short sXd6 = (short) (Od.Xd() ^ (-4760));
                            int[] iArr4 = new int["~\u000b\u007f\r\t\u0002{Dx\u0004\u0002\u0007v~\u0004<Vz\u007fow|".length()];
                            QB qb4 = new QB("~\u000b\u007f\r\t\u0002{Dx\u0004\u0002\u0007v~\u0004<Vz\u007fow|");
                            int i6 = 0;
                            while (qb4.YK()) {
                                int iKK4 = qb4.KK();
                                Xu xuXd4 = Xu.Xd(iKK4);
                                iArr4[i6] = xuXd4.fK(sXd6 + sXd6 + i6 + xuXd4.CK(iKK4));
                                i6++;
                            }
                            clsArr2[0] = Class.forName(new String(iArr4, 0, i6));
                            clsArr2[1] = Class.forName(C1561oA.Kd("\u000b\u0019\u0010\u001f\u001d\u0018\u0014^\u0015\"\")\u001b%,f\r .3'\"%\u0004112*);188", (short) (ZN.Xd() ^ 5134)));
                            clsArr2[2] = Integer.TYPE;
                            Object[] objArr3 = {intent2, installReferrerServiceConnection, 1};
                            Method method3 = cls2.getMethod(Wg.Zd("$5\b\bd@Z(hl\\", (short) (ZN.Xd() ^ 14046), (short) (ZN.Xd() ^ 20539)), clsArr2);
                            try {
                                method3.setAccessible(true);
                                if (((Boolean) method3.invoke(context2, objArr3)).booleanValue()) {
                                    InstallReferrerCommons.logVerbose(strVd, C1561oA.Xd("~\u0012 %\u0019\u0014\u0017R+\u0016)V\u001a((\u001f!!]25$%(78,<45Cx", (short) (C1580rY.Xd() ^ (-21557))));
                                    return;
                                }
                                InstallReferrerCommons.logWarn(strVd, Wg.vd("\u001bFHG96J>?=qE;jA2Z]SLI\u0003OX\u007fANP?FCAe", (short) (OY.Xd() ^ 1018)));
                                this.clientState = 0;
                                installReferrerStateListener.onInstallReferrerSetupFinished(1);
                                return;
                            } catch (InvocationTargetException e2) {
                                throw e2.getCause();
                            }
                        } catch (SecurityException unused) {
                            InstallReferrerCommons.logWarn(strVd, Qg.kd("+KzJ>JD?HG<A?oC=l/:87-*:d82a4%14&\u001f g", (short) (OY.Xd() ^ 5783), (short) (OY.Xd() ^ 16608)));
                            this.clientState = 0;
                            installReferrerStateListener.onInstallReferrerSetupFinished(4);
                            return;
                        }
                    }
                }
                this.clientState = 0;
                short sXd7 = (short) (C1633zX.Xd() ^ (-17286));
                int[] iArr5 = new int["Hlpp\\fe\u0018I[[YedVb\u000faR^aSLM\u0007[SEYCJL@@IAzIGw;;K=67~".length()];
                QB qb5 = new QB("Hlpp\\fe\u0018I[[YedVb\u000faR^aSLM\u0007[SEYCJL@@IAzIGw;;K=67~");
                int i7 = 0;
                while (qb5.YK()) {
                    int iKK5 = qb5.KK();
                    Xu xuXd5 = Xu.Xd(iKK5);
                    iArr5[i7] = xuXd5.fK(sXd7 + i7 + xuXd5.CK(iKK5));
                    i7++;
                }
                InstallReferrerCommons.logVerbose(strVd, new String(iArr5, 0, i7));
                installReferrerStateListener.onInstallReferrerSetupFinished(2);
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }
}
