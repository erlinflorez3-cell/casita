package com.ticnow.sdk.idnowsecurity.security.root;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.biocatch.client.android.sdk.core.RootCheckConstants;
import com.dynatrace.android.agent.AdkSettings;
import com.dynatrace.android.agent.Global;
import com.ticnow.sdk.idnowsecurity.security.root.util.QLog;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.Qg;
import yg.Wg;
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public class RootBeer {
    private boolean loggingEnabled = true;
    private final Context mContext;

    public RootBeer(Context context) {
        this.mContext = context;
    }

    private boolean isAnyPackageFromListInstalled(List<String> list) throws Throwable {
        Context context = this.mContext;
        Object[] objArr = new Object[0];
        Method method = Class.forName(Wg.vd("*6+8<5/w$/-2*27o\u001cGEJBTO", (short) (C1607wl.Xd() ^ 21230))).getMethod(Qg.kd("`]kFVW^SXU<O[MRO[", (short) (C1633zX.Xd() ^ (-4283)), (short) (C1633zX.Xd() ^ (-24670))), new Class[0]);
        try {
            method.setAccessible(true);
            PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
            boolean z2 = false;
            for (String str : list) {
                try {
                    Class<?> cls = Class.forName(hg.Vd("@LANJC=\u0006:ECH8@E}?;z\u001c,-4).+\u0012%1#(%1", (short) (C1580rY.Xd() ^ (-7042)), (short) (C1580rY.Xd() ^ (-1569))));
                    Class<?>[] clsArr = new Class[2];
                    clsArr[0] = Class.forName(C1561oA.ud("si}g3pdph.Rroeia", (short) (C1607wl.Xd() ^ 26321)));
                    clsArr[1] = Integer.TYPE;
                    Object[] objArr2 = {str, 0};
                    Method method2 = cls.getMethod(C1561oA.yd("32>\u001b),1(+*\u000b1&0", (short) (C1607wl.Xd() ^ 11668)), clsArr);
                    try {
                        method2.setAccessible(true);
                        method2.invoke(packageManager, objArr2);
                        z2 = true;
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    continue;
                }
            }
            return z2;
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private String[] mountReader() {
        String[] strArrSplit = new String[0];
        try {
            strArrSplit = new Scanner(Runtime.getRuntime().exec("mount").getInputStream()).useDelimiter("\\A").next().split("\n");
            return strArrSplit;
        } catch (IOException | NoSuchElementException e2) {
            e2.printStackTrace();
            return strArrSplit;
        }
    }

    private String[] propsReader() {
        String[] strArrSplit = new String[0];
        try {
            strArrSplit = new Scanner(Runtime.getRuntime().exec("getprop").getInputStream()).useDelimiter("\\A").next().split("\n");
            return strArrSplit;
        } catch (IOException | NoSuchElementException e2) {
            e2.printStackTrace();
            return strArrSplit;
        }
    }

    public boolean checkForBinary(String str) {
        boolean z2 = false;
        for (String str2 : Const.FsuPaths) {
            String str3 = str2 + str;
            if (new File(str2, str).exists()) {
                QLog.v(str3 + " binary detected!");
                z2 = true;
            }
        }
        return z2;
    }

    public boolean checkForBusyBoxBinary() {
        return checkForBinary("busybox");
    }

    public boolean checkForDangerousProps() {
        HashMap map = new HashMap();
        map.put("ro.debuggable", "1");
        map.put("ro.secure", AdkSettings.PLATFORM_TYPE_MOBILE);
        boolean z2 = false;
        for (String str : propsReader()) {
            for (String str2 : map.keySet()) {
                if (str.contains(str2)) {
                    String str3 = "[" + ((String) map.get(str2)) + "]";
                    if (str.contains(str3)) {
                        QLog.v(str2 + " = " + str3 + " detected!");
                        z2 = true;
                    }
                }
            }
        }
        return z2;
    }

    public boolean checkForMagiskBinary() {
        return checkForBinary("magisk");
    }

    public boolean checkForRWPaths() {
        String[] strArrMountReader = mountReader();
        int i2 = 0;
        if (strArrMountReader == null) {
            return false;
        }
        int length = strArrMountReader.length;
        int i3 = 0;
        boolean z2 = false;
        while (i3 < length) {
            String str = strArrMountReader[i3];
            String[] strArrSplit = str.split(Global.BLANK);
            if (strArrSplit.length >= 4) {
                String str2 = strArrSplit[1];
                String str3 = strArrSplit[3];
                String[] strArr = Const.FpathsThatShouldNotBeWrtiable;
                int length2 = strArr.length;
                int i4 = i2;
                while (i4 < length2) {
                    String str4 = strArr[i4];
                    if (str2.equalsIgnoreCase(str4)) {
                        String[] strArrSplit2 = str3.split(",");
                        int length3 = strArrSplit2.length;
                        while (true) {
                            if (i2 >= length3) {
                                break;
                            }
                            if (strArrSplit2[i2].equalsIgnoreCase("rw")) {
                                QLog.v(str4 + " path is mounted with rw permissions! " + str);
                                z2 = true;
                                break;
                            }
                            i2++;
                        }
                    }
                    i4++;
                    i2 = 0;
                }
            }
            i3++;
            i2 = 0;
        }
        return z2;
    }

    public boolean checkForSuBinary() {
        return checkForBinary(RootCheckConstants.BINARY_SU);
    }

    public boolean checkSuExists() {
        Process processExec = null;
        try {
            processExec = Runtime.getRuntime().exec(new String[]{"which", RootCheckConstants.BINARY_SU});
            boolean z2 = new BufferedReader(new InputStreamReader(processExec.getInputStream())).readLine() != null;
            if (processExec != null) {
                processExec.destroy();
            }
            return z2;
        } catch (Throwable unused) {
            if (processExec != null) {
                processExec.destroy();
            }
            return false;
        }
    }

    public boolean detectPotentiallyDangerousApps() {
        return detectPotentiallyDangerousApps(null);
    }

    public boolean detectPotentiallyDangerousApps(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(Const.FknownDangerousAppsPackages));
        if (strArr != null && strArr.length > 0) {
            arrayList.addAll(Arrays.asList(strArr));
        }
        return isAnyPackageFromListInstalled(arrayList);
    }

    public boolean detectRootCloakingApps() {
        return detectRootCloakingApps(null);
    }

    public boolean detectRootCloakingApps(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(Const.FknownRootCloakingPackages));
        if (strArr != null && strArr.length > 0) {
            arrayList.addAll(Arrays.asList(strArr));
        }
        return isAnyPackageFromListInstalled(arrayList);
    }

    public boolean detectRootManagementApps() {
        return detectRootManagementApps(null);
    }

    public boolean detectRootManagementApps(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(Const.FknownRootAppsPackages));
        if (strArr != null && strArr.length > 0) {
            arrayList.addAll(Arrays.asList(strArr));
        }
        return isAnyPackageFromListInstalled(arrayList);
    }

    public boolean detectTestKeys() {
        String str = Build.TAGS;
        return str != null && str.contains("test-keys");
    }

    public boolean isRooted() {
        return detectRootManagementApps() || detectPotentiallyDangerousApps() || checkForBinary(RootCheckConstants.BINARY_SU) || checkForBinary("busybox") || checkForDangerousProps() || checkForRWPaths() || detectTestKeys() || checkSuExists() || checkForMagiskBinary();
    }

    public boolean isRootedWithoutBusyBoxCheck() {
        return detectRootManagementApps() || detectPotentiallyDangerousApps() || checkForBinary(RootCheckConstants.BINARY_SU) || checkForDangerousProps() || checkForRWPaths() || detectTestKeys() || checkSuExists() || checkForMagiskBinary();
    }

    public void setLogging(boolean z2) {
        this.loggingEnabled = z2;
        QLog.LOGGING_LEVEL = z2 ? 5 : 0;
    }
}
