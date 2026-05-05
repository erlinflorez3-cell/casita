package com.reactnativecommunity.netinfo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import androidx.core.content.ContextCompat;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public class NetInfoUtils {
    public static void compatRegisterReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, boolean z2) throws Throwable {
        Object obj;
        if (Build.VERSION.SDK_INT >= 34) {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1593ug.zd("Q_Vec^Z%[hhoakr-Cppwi}z", (short) (C1633zX.Xd() ^ (-21532)), (short) (C1633zX.Xd() ^ (-4162)))).getMethod(C1561oA.od("\u0004\u0001\u000fZ\t\b\u0003~wt\u0007z\u007f}W{rz", (short) (ZN.Xd() ^ 24772)), new Class[0]);
            try {
                method.setAccessible(true);
                ApplicationInfo applicationInfo = (ApplicationInfo) method.invoke(context, objArr);
                String strKd = C1561oA.Kd("w\u0006|\f\n\u0005\u0001K\u0002\u000f\u000f\u0016\b\u0012\u0019S\u0017\u0015Vj\u001b\u001c\u0019\u0017\u0012\u0011%\u001b\"\"}$\u001d'", (short) (C1607wl.Xd() ^ 31985));
                String strZd = Wg.Zd("J\u001a\u001e5&\u0018)\u001dV$&UI\"Z<", (short) (Od.Xd() ^ (-26299)), (short) (Od.Xd() ^ (-32172)));
                try {
                    Class<?> cls = Class.forName(strKd);
                    Field field = 1 != 0 ? cls.getField(strZd) : cls.getDeclaredField(strZd);
                    field.setAccessible(true);
                    obj = field.get(applicationInfo);
                } catch (Throwable th) {
                    obj = null;
                }
                if (((Integer) obj).intValue() >= 34) {
                    int i2 = z2 ? 2 : 4;
                    Class<?> cls2 = Class.forName(C1561oA.Xd("N\\Sb`[W\"Xeel^ho*@mmtfzw", (short) (C1633zX.Xd() ^ (-21696))));
                    Class<?>[] clsArr = {Class.forName(Wg.vd("x\u0007}\r\u0003}yD\u0003\u0010\u0010\u0017\u0001\u000b\u0012Li\u001b\u0019\f\b\b\u0007\u001a$\u0003\u0017\u0016\u0011\u0016$\u0014*", (short) (Od.Xd() ^ (-32018)))), Class.forName(Qg.kd("\u0007\u0013\b\u0015\u0011\n\u0004L\u0001\f\n\u000f~\u0007\fD^\u0003\bw\u007f\u0005Uwy\u0001p|", (short) (FB.Xd() ^ 11792), (short) (FB.Xd() ^ 8026))), Integer.TYPE};
                    Object[] objArr2 = {broadcastReceiver, intentFilter, Integer.valueOf(i2)};
                    Method method2 = cls2.getMethod(hg.Vd("\n{|}\u0007\u0007v\u0003aspqt\u0001nz", (short) (C1580rY.Xd() ^ (-4752)), (short) (C1580rY.Xd() ^ (-1077))), clsArr);
                    try {
                        method2.setAccessible(true);
                        method2.invoke(context, objArr2);
                        return;
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        Class<?> cls3 = Class.forName(C1561oA.ud("\u000e\u001a\u000f\u001c\u0018\u0011\u000bS\b\u0013\u0011\u0016\u0006\u000e\u0013K_\u000b\t\u000e}\u0010\u000b", (short) (OY.Xd() ^ 20855)));
        Class<?>[] clsArr2 = new Class[2];
        short sXd = (short) (ZN.Xd() ^ 3771);
        int[] iArr = new int["\u000e\u001a\u000f\u001c \u0019\u0013[\b\u0013\u0011\u0016\u000e\u0016\u001bS~.*\u001b%# 1)\u0006\u0018\u0015\u001e!-\u001b?".length()];
        QB qb = new QB("\u000e\u001a\u000f\u001c \u0019\u0013[\b\u0013\u0011\u0016\u000e\u0016\u001bS~.*\u001b%# 1)\u0006\u0018\u0015\u001e!-\u001b?");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i3));
            i3++;
        }
        clsArr2[0] = Class.forName(new String(iArr, 0, i3));
        clsArr2[1] = Class.forName(C1561oA.Yd("|\u000b\u0002\u0011\u000f\n\u0006P\u0007\u0014\u0014\u001b\r\u0017\u001eXt\u001b\"\u0014\u001e%w\u001c )\u001b)", (short) (FB.Xd() ^ 27825)));
        Object[] objArr3 = {broadcastReceiver, intentFilter};
        Method method3 = cls3.getMethod(Xg.qd("3'*-8:,:\u001b/.16D4B", (short) (C1580rY.Xd() ^ (-30982)), (short) (C1580rY.Xd() ^ (-6145))), clsArr2);
        try {
            method3.setAccessible(true);
            method3.invoke(context, objArr3);
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    public static boolean isAccessWifiStatePermissionGranted(Context context) {
        return ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_WIFI_STATE") == 0;
    }

    public static void reverseByteArray(byte[] bArr) {
        for (int i2 = 0; i2 < bArr.length / 2; i2++) {
            byte b2 = bArr[i2];
            bArr[i2] = bArr[(bArr.length - i2) - 1];
            bArr[(bArr.length - i2) - 1] = b2;
        }
    }
}
