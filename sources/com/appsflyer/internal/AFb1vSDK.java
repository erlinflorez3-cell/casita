package com.appsflyer.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.appsflyer.AFLogger;
import com.drew.metadata.exif.makernotes.OlympusCameraSettingsMakernoteDirectory;
import com.drew.metadata.iptc.IptcDirectory;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
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
@Deprecated
public final class AFb1vSDK {

    static final class AFa1tSDK implements IInterface {
        private final IBinder getCurrencyIso4217Code;

        AFa1tSDK(IBinder iBinder) {
            this.getCurrencyIso4217Code = iBinder;
        }

        final boolean AFAdRevenueData() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                parcelObtain.writeInt(1);
                this.getCurrencyIso4217Code.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0;
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.getCurrencyIso4217Code;
        }

        public final String getRevenue() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.getCurrencyIso4217Code.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
    }

    public static final class AFa1ySDK {
        public final String getCurrencyIso4217Code;
        private final boolean getMediationNetwork;

        AFa1ySDK(String str, boolean z2) {
            this.getCurrencyIso4217Code = str;
            this.getMediationNetwork = z2;
        }

        public final boolean AFAdRevenueData() {
            return this.getMediationNetwork;
        }
    }

    static final class AFa1zSDK implements ServiceConnection {
        final LinkedBlockingQueue<IBinder> getRevenue = new LinkedBlockingQueue<>(1);
        boolean AFAdRevenueData = false;

        AFa1zSDK() {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.getRevenue.put(iBinder);
            } catch (InterruptedException e2) {
                AFLogger.afErrorLogForExcManagerOnly("onServiceConnected Interrupted", e2);
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public static AFa1ySDK AFAdRevenueData(Context context) throws Exception {
        Looper looperMyLooper = Looper.myLooper();
        short sXd = (short) (Od.Xd() ^ (-16895));
        int[] iArr = new int["]kbqojf1sx4Swxzp~".length()];
        QB qb = new QB("]kbqojf1sx4Swxzp~");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(Xg.qd("\r\f\u001cu\u000b\u0014\u001ax\u001d\u001e \u0016$", (short) (FB.Xd() ^ 31338), (short) (FB.Xd() ^ 10848)), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            if (looperMyLooper == ((Looper) declaredMethod.invoke(null, objArr))) {
                throw new IllegalStateException(C1593ug.zd("b\u0002\u0010\u0011\u0013\u0019E\t\rH\r\f\u0018\u0019\u0013\u0013O\u0017$\"!T*\u001f\u001dX'\u001c%+]3(3'$(", (short) (ZN.Xd() ^ 429), (short) (ZN.Xd() ^ 30917)));
            }
            Object[] objArr2 = new Object[0];
            Method method = Class.forName(Jg.Wd("C eG\u0014\u001dk\u0005\niwM\u0012j\u007f\rqm@U\u0016|H", (short) (C1499aX.Xd() ^ (-6388)), (short) (C1499aX.Xd() ^ (-19573)))).getMethod(ZO.xd("R?M.\u00150#/6zE)0\u0014;y@", (short) (C1499aX.Xd() ^ (-25720)), (short) (C1499aX.Xd() ^ (-21587))), new Class[0]);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr2);
                String strUd = C1626yg.Ud("\u001e^*\u0010$ET\b!6fz|VI\u0010iA1", (short) (FB.Xd() ^ 2725), (short) (FB.Xd() ^ OlympusCameraSettingsMakernoteDirectory.TagToneLevel));
                short sXd2 = (short) (C1633zX.Xd() ^ (-29715));
                int[] iArr2 = new int["(\bYF`\u0015*\"\u0004\u0003iG\t\u001e\u0006\u00185\u001e5}K\u0014scF\u0016\u001aU\u0017\u00155L\b".length()];
                QB qb2 = new QB("(\bYF`\u0015*\"\u0004\u0003iG\t\u001e\u0006\u00185\u001e5}K\u0014scF\u0016\u001aU\u0017\u00155L\b");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd2 + i3)));
                    i3++;
                }
                Object[] objArr3 = {strUd, 0};
                Method method2 = Class.forName(new String(iArr2, 0, i3)).getMethod(C1561oA.Qd("qn|WghodifImdl", (short) (ZN.Xd() ^ 11507)), Class.forName(EO.Od("b\nOSq\u000eX?\b[|B\f\u0013\u0002\u001e", (short) (C1633zX.Xd() ^ (-7461)))), Integer.TYPE);
                try {
                    method2.setAccessible(true);
                    method2.invoke(packageManager, objArr3);
                    AFa1zSDK aFa1zSDK = new AFa1zSDK();
                    Intent intent = new Intent(C1593ug.zd("o|{=w\u0001\u0002z\u0001zDx\u0007}\r\u000b\u0006\u0002L\u0007\u000e\u0015P\u0005\t\u0019T\u0011\r\u000f\u0019 \u0016\u0014\u0018\u0015#_&\u0019', \u001b\u001eg\u000e\u0010}\u0010\u0013", (short) (C1607wl.Xd() ^ 19848), (short) (C1607wl.Xd() ^ IptcDirectory.TAG_IMAGE_ORIENTATION)));
                    intent.setPackage(C1561oA.od(",74s,32)-%l\u001f+ -)\"\u001cd\u001d\"'", (short) (Od.Xd() ^ (-304))));
                    try {
                        Class<?> cls = Class.forName(C1561oA.Kd("=KBQOJF\u0011GTT[MW^\u0019/\\\\cUif", (short) (C1499aX.Xd() ^ (-30297))));
                        Class<?>[] clsArr = new Class[3];
                        clsArr[0] = Class.forName(Wg.Zd("g\u0005~\u001d60?'Xt\u0018.\u001bB\\\u0016M\u0003\r\f17", (short) (ZN.Xd() ^ 2039), (short) (ZN.Xd() ^ 13429)));
                        short sXd3 = (short) (Od.Xd() ^ (-19223));
                        int[] iArr3 = new int["_mdsqlh3ivv}oy\u0001;at\u0003\b{vyX\u0006\u0006\u0007~}\u0010\u0006\r\r".length()];
                        QB qb3 = new QB("_mdsqlh3ivv}oy\u0001;at\u0003\b{vyX\u0006\u0006\u0007~}\u0010\u0006\r\r");
                        int i4 = 0;
                        while (qb3.YK()) {
                            int iKK3 = qb3.KK();
                            Xu xuXd3 = Xu.Xd(iKK3);
                            iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (sXd3 + i4));
                            i4++;
                        }
                        clsArr[1] = Class.forName(new String(iArr3, 0, i4));
                        clsArr[2] = Integer.TYPE;
                        Object[] objArr4 = {intent, aFa1zSDK, 1};
                        short sXd4 = (short) (C1580rY.Xd() ^ (-10522));
                        int[] iArr4 = new int["`hneUhv{_Z]".length()];
                        QB qb4 = new QB("`hneUhv{_Z]");
                        int i5 = 0;
                        while (qb4.YK()) {
                            int iKK4 = qb4.KK();
                            Xu xuXd4 = Xu.Xd(iKK4);
                            iArr4[i5] = xuXd4.fK((sXd4 ^ i5) + xuXd4.CK(iKK4));
                            i5++;
                        }
                        Method method3 = cls.getMethod(new String(iArr4, 0, i5), clsArr);
                        try {
                            method3.setAccessible(true);
                            if (!((Boolean) method3.invoke(context, objArr4)).booleanValue()) {
                                if (context != null) {
                                    Object[] objArr5 = {aFa1zSDK};
                                    Method method4 = Class.forName(Xg.qd("Xf]ljea,boovhry4Jww~p\u0005\u0002", (short) (ZN.Xd() ^ 1665), (short) (ZN.Xd() ^ 22504))).getMethod(ZO.xd("\u001e(9V\u0001\n\b\"O\u0013N)\u001f", (short) (C1580rY.Xd() ^ (-13692)), (short) (C1580rY.Xd() ^ (-5665))), Class.forName(Jg.Wd("'{<\"i2x\u0019\u001at>\u0014W(\u0001\t\u0002Z;\u000eS\u0015a\u0016\u000e['t=\u001e]3\u0005", (short) (FB.Xd() ^ 28401), (short) (FB.Xd() ^ 7636))));
                                    try {
                                        method4.setAccessible(true);
                                        method4.invoke(context, objArr5);
                                    } catch (InvocationTargetException e2) {
                                        throw e2.getCause();
                                    }
                                }
                                throw new IOException(C1626yg.Ud("aSrh\u000b(\u000b\tPi\"J\u001c&o0&V\fD0j\u0005C<\u001eB\u00067", (short) (C1607wl.Xd() ^ 6145), (short) (C1607wl.Xd() ^ 14929)));
                            }
                            if (aFa1zSDK.AFAdRevenueData) {
                                throw new IllegalStateException(C1561oA.Yd("3R`aci\u0016ZYef\u001bcbr\u001foo\"wlny'kxxyqp\u0003x\u007f\u007f2\u0001\u0004\b{7\r\u0002{\n<\r\r\u0003\u0006", (short) (C1607wl.Xd() ^ 12278)));
                            }
                            aFa1zSDK.AFAdRevenueData = true;
                            IBinder iBinderPoll = aFa1zSDK.getRevenue.poll(10L, TimeUnit.SECONDS);
                            if (iBinderPoll == null) {
                                throw new TimeoutException(C1561oA.yd("Rhib^\u001bgnj\u0017kV[gY_U\u000fR\\\\\u000b\\QK\u0007WJTYIDC~?LHI=<J@CC", (short) (C1633zX.Xd() ^ (-15115))));
                            }
                            AFa1tSDK aFa1tSDK = new AFa1tSDK(iBinderPoll);
                            AFa1ySDK aFa1ySDK = new AFa1ySDK(aFa1tSDK.getRevenue(), aFa1tSDK.AFAdRevenueData());
                            if (context != null) {
                                Object[] objArr6 = {aFa1zSDK};
                                Method method5 = Class.forName(Qg.kd("'3(51*$l!,*/\u001f',dx$\"'\u0017)$", (short) (C1633zX.Xd() ^ (-13890)), (short) (C1633zX.Xd() ^ (-21707)))).getMethod(C1561oA.ud("C;.48-\u001b,8;-&'", (short) (C1499aX.Xd() ^ (-2497))), Class.forName(hg.Vd("LXMZVOI\u0012FQOTDLQ\n.?KN@9:\u0017B@?52B6;9", (short) (C1580rY.Xd() ^ (-7655)), (short) (C1580rY.Xd() ^ (-15288)))));
                                try {
                                    method5.setAccessible(true);
                                    method5.invoke(context, objArr6);
                                } catch (InvocationTargetException e3) {
                                    throw e3.getCause();
                                }
                            }
                            return aFa1ySDK;
                        } catch (InvocationTargetException e4) {
                            throw e4.getCause();
                        }
                    } catch (Throwable th) {
                        if (context != null) {
                            Object[] objArr7 = {aFa1zSDK};
                            Method method6 = Class.forName(Ig.wd("m&H\t\u001cpAig\u0006|\u000f0Ee\u007fK{!a\u000bD ", (short) (FB.Xd() ^ 21542))).getMethod(C1561oA.Qd("&\u001e\u0011\u0017\u001b\u0010}\u000f\u001b\u001e\u0010\t\n", (short) (C1607wl.Xd() ^ 12204)), Class.forName(EO.Od("\u001bY}'t<\u001f0%`Y\u0006\");\u0016h\u00059\n<Y\nc\u000f]<\bOO,\u0015s", (short) (FB.Xd() ^ 18535))));
                            try {
                                method6.setAccessible(true);
                                method6.invoke(context, objArr7);
                            } catch (InvocationTargetException e5) {
                                throw e5.getCause();
                            }
                        }
                        throw th;
                    }
                } catch (InvocationTargetException e6) {
                    throw e6.getCause();
                }
            } catch (InvocationTargetException e7) {
                throw e7.getCause();
            }
        } catch (InvocationTargetException e8) {
            throw e8.getCause();
        }
    }
}
