package com.bumptech.glide.manager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import com.bumptech.glide.manager.ConnectivityMonitor;
import com.bumptech.glide.util.Preconditions;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
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

/* JADX INFO: loaded from: classes3.dex */
final class DefaultConnectivityMonitor implements ConnectivityMonitor {
    private static final String TAG = "ConnectivityMonitor";
    private final BroadcastReceiver connectivityReceiver = new BroadcastReceiver() { // from class: com.bumptech.glide.manager.DefaultConnectivityMonitor.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            boolean z2 = DefaultConnectivityMonitor.this.isConnected;
            DefaultConnectivityMonitor defaultConnectivityMonitor = DefaultConnectivityMonitor.this;
            defaultConnectivityMonitor.isConnected = defaultConnectivityMonitor.isConnected(context);
            if (z2 != DefaultConnectivityMonitor.this.isConnected) {
                if (Log.isLoggable(DefaultConnectivityMonitor.TAG, 3)) {
                    String str = "connectivity changed, isConnected: " + DefaultConnectivityMonitor.this.isConnected;
                }
                DefaultConnectivityMonitor.this.listener.onConnectivityChanged(DefaultConnectivityMonitor.this.isConnected);
            }
        }
    };
    private final Context context;
    boolean isConnected;
    private boolean isRegistered;
    final ConnectivityMonitor.ConnectivityListener listener;

    DefaultConnectivityMonitor(Context context, ConnectivityMonitor.ConnectivityListener connectivityListener) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Xd("\u0013!\u0018'% \u001cf\u001d**1#-4n\u0005229+?<", (short) (Od.Xd() ^ (-30304)))).getMethod(Wg.vd("vs\u0002M\u0004\u0003}yzw\n}\u000b\t\\\b\u000e\u0013\u0003\u0015\u0018", (short) (OY.Xd() ^ 12564)), new Class[0]);
        try {
            method.setAccessible(true);
            this.context = (Context) method.invoke(context, objArr);
            this.listener = connectivityListener;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private void register() throws Throwable {
        if (this.isRegistered) {
            return;
        }
        this.isConnected = isConnected(this.context);
        try {
            Context context = this.context;
            BroadcastReceiver broadcastReceiver = this.connectivityReceiver;
            IntentFilter intentFilter = new IntentFilter(Qg.kd("u\u0002v\u0004\u007fxr;zp~7kvts2FQONDAQEQCMQV9=5A96", (short) (FB.Xd() ^ 16142), (short) (FB.Xd() ^ 7486)));
            short sXd = (short) (C1607wl.Xd() ^ 3966);
            short sXd2 = (short) (C1607wl.Xd() ^ 1602);
            int[] iArr = new int["@LANJC=\u0006:ECH8@E}\u0012=;@0B=".length()];
            QB qb = new QB("@LANJC=\u0006:ECH8@E}\u0012=;@0B=");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
                i2++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Class<?>[] clsArr = new Class[2];
            short sXd3 = (short) (C1633zX.Xd() ^ (-23570));
            int[] iArr2 = new int["KWLYUNH\u0011EPNSCKP\t\u001cKG8:85FF#5236B0<".length()];
            QB qb2 = new QB("KWLYUNH\u0011EPNSCKP\t\u001cKG8:85FF#5236B0<");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(sXd3 + i3 + xuXd2.CK(iKK2));
                i3++;
            }
            clsArr[0] = Class.forName(new String(iArr2, 0, i3));
            clsArr[1] = Class.forName(C1561oA.yd("\"0'64/+u\u001c))0\",3my '\u0019#*|!\u0015\u001e\u0010\u001e", (short) (C1499aX.Xd() ^ (-29452))));
            Object[] objArr = {broadcastReceiver, intentFilter};
            Method method = cls.getMethod(C1561oA.Yd("xlor}\u007fq\u007f`tsv{\ny\b", (short) (C1499aX.Xd() ^ (-28285))), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(context, objArr);
                this.isRegistered = true;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (SecurityException e3) {
            if (Log.isLoggable(Xg.qd("Fsstlk}s\u0002u\u0002\b\\\u007f\u007f{\b\u0004\b", (short) (FB.Xd() ^ 28037), (short) (FB.Xd() ^ 19651)), 5)) {
                Jg.Wd("5i7c\u0002J+h\u0019\u0003z\u0017^IxCi\u0010", (short) (Od.Xd() ^ (-28621)), (short) (Od.Xd() ^ (-15920)));
            }
        }
    }

    private void unregister() throws Throwable {
        if (this.isRegistered) {
            Context context = this.context;
            BroadcastReceiver broadcastReceiver = this.connectivityReceiver;
            short sXd = (short) (FB.Xd() ^ 31281);
            short sXd2 = (short) (FB.Xd() ^ 32690);
            int[] iArr = new int["\u000e\u00141\u0004}{5Y\u0014.\u0014\u0018\u001czk)y}\";\u0014\u001b\u0007".length()];
            QB qb = new QB("\u000e\u00141\u0004}{5Y\u0014.\u0014\u0018\u001czk)y}\";\u0014\u001b\u0007");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
                i2++;
            }
            Object[] objArr = {broadcastReceiver};
            Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Ig.wd("X\u001c<T<\n}D\u0013!\t4\u0004\u0002\u0018<vg", (short) (OY.Xd() ^ 678)), Class.forName(C1626yg.Ud("^ <l;lD\u0004`g+G]l\u0011\u0012#$\fv\u0014Z+wng\u001agJ0\u0018dZ", (short) (C1499aX.Xd() ^ (-16998)), (short) (C1499aX.Xd() ^ (-14323)))));
            try {
                method.setAccessible(true);
                method.invoke(context, objArr);
                this.isRegistered = false;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    boolean isConnected(Context context) throws Throwable {
        short sXd = (short) (FB.Xd() ^ 2060);
        int[] iArr = new int["E)kGF\u001aCO bcR".length()];
        QB qb = new QB("E)kGF\u001aCO bcR");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        short sXd2 = (short) (OY.Xd() ^ 15908);
        int[] iArr2 = new int["2>3@<5/w,75:*27o\u0004/-2\"4/".length()];
        QB qb2 = new QB("2>3@<5/w,75:*27o\u0004/-2\"4/");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(sXd2 + sXd2 + sXd2 + i3 + xuXd2.CK(iKK2));
            i3++;
        }
        Object[] objArr = {str};
        Method method = Class.forName(new String(iArr2, 0, i3)).getMethod(C1561oA.od(" \u001d+\t.''\u0017\u001e\u0003\u0014 #\u0015\u000e\u000f", (short) (C1499aX.Xd() ^ (-8518))), Class.forName(C1593ug.zd("tl\u0003n<{q\u007fyAg\n\t\u0001\u0007\u0001", (short) (FB.Xd() ^ 23444), (short) (FB.Xd() ^ 28096))));
        try {
            method.setAccessible(true);
            try {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) Preconditions.checkNotNull((ConnectivityManager) method.invoke(context, objArr))).getActiveNetworkInfo();
                return activeNetworkInfo != null && activeNetworkInfo.isConnected();
            } catch (RuntimeException e2) {
                if (Log.isLoggable(C1561oA.Kd("\u0002//0('9/=1=C\u0018;;7C?C", (short) (Od.Xd() ^ (-1045))), 5)) {
                    Wg.Zd("q7y':cYXmHGr\u001c7~$;j\u001c\u0001^\u0015Nx\n2}\u001dDa'V\u0016\u0014Of\u0014?wN@[\u0013F\u0012\u007fFo\u000b,d /f\u0014Ih97fy1d\r%", (short) (C1633zX.Xd() ^ (-25213)), (short) (C1633zX.Xd() ^ (-3121)));
                }
                return true;
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onStart() throws Throwable {
        register();
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onStop() throws Throwable {
        unregister();
    }
}
