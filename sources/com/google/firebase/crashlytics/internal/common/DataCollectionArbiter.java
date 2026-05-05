package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseApp;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsTasks;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes7.dex */
public class DataCollectionArbiter {
    private static final String FIREBASE_CRASHLYTICS_COLLECTION_ENABLED = "firebase_crashlytics_collection_enabled";
    private Boolean crashlyticsDataCollectionEnabled;
    TaskCompletionSource<Void> dataCollectionEnabledTask;
    private final TaskCompletionSource<Void> dataCollectionExplicitlyApproved;
    private final FirebaseApp firebaseApp;
    private boolean setInManifest;
    private final SharedPreferences sharedPreferences;
    private final Object taskLock;
    boolean taskResolved;

    public DataCollectionArbiter(FirebaseApp firebaseApp) {
        Object obj = new Object();
        this.taskLock = obj;
        this.dataCollectionEnabledTask = new TaskCompletionSource<>();
        this.taskResolved = false;
        this.setInManifest = false;
        this.dataCollectionExplicitlyApproved = new TaskCompletionSource<>();
        Context applicationContext = firebaseApp.getApplicationContext();
        this.firebaseApp = firebaseApp;
        this.sharedPreferences = CommonUtils.getSharedPrefs(applicationContext);
        Boolean dataCollectionValueFromSharedPreferences = getDataCollectionValueFromSharedPreferences();
        this.crashlyticsDataCollectionEnabled = dataCollectionValueFromSharedPreferences == null ? getDataCollectionValueFromManifest(applicationContext) : dataCollectionValueFromSharedPreferences;
        synchronized (obj) {
            if (isAutomaticDataCollectionEnabled()) {
                this.dataCollectionEnabledTask.trySetResult(null);
                this.taskResolved = true;
            }
        }
    }

    private Boolean getDataCollectionValueFromManifest(Context context) throws Throwable {
        Boolean crashlyticsDataCollectionEnabledFromManifest = readCrashlyticsDataCollectionEnabledFromManifest(context);
        if (crashlyticsDataCollectionEnabledFromManifest == null) {
            this.setInManifest = false;
            return null;
        }
        this.setInManifest = true;
        return Boolean.valueOf(Boolean.TRUE.equals(crashlyticsDataCollectionEnabledFromManifest));
    }

    private Boolean getDataCollectionValueFromSharedPreferences() {
        if (!this.sharedPreferences.contains(FIREBASE_CRASHLYTICS_COLLECTION_ENABLED)) {
            return null;
        }
        this.setInManifest = false;
        return Boolean.valueOf(this.sharedPreferences.getBoolean(FIREBASE_CRASHLYTICS_COLLECTION_ENABLED, true));
    }

    private boolean isFirebaseDataCollectionDefaultEnabled() {
        try {
            return this.firebaseApp.isDataCollectionDefaultEnabled();
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    private void logDataCollectionState(boolean z2) {
        Logger.getLogger().d(String.format("Crashlytics automatic data collection %s by %s.", z2 ? "ENABLED" : "DISABLED", this.crashlyticsDataCollectionEnabled == null ? "global Firebase setting" : this.setInManifest ? "firebase_crashlytics_collection_enabled manifest flag" : "API"));
    }

    private static Boolean readCrashlyticsDataCollectionEnabledFromManifest(Context context) throws Throwable {
        short sXd = (short) (C1633zX.Xd() ^ (-26370));
        short sXd2 = (short) (C1633zX.Xd() ^ (-13094));
        int[] iArr = new int["kmugcarc\\_m[l`coi]VePS^ZYQN^RWUEJRDDMEC".length()];
        QB qb = new QB("kmugcarc\\_m[l`coi]VePS^ZYQN^RWUEJRDDMEC");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
            i2++;
        }
        String str = new String(iArr, 0, i2);
        try {
            Class<?> cls = Class.forName(hg.Vd("MYN[WPJ\u0013GRPUEMR\u000b\u001fJHM=OJ", (short) (C1580rY.Xd() ^ (-11072)), (short) (C1580rY.Xd() ^ (-86))));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd3 = (short) (C1580rY.Xd() ^ (-7513));
            int[] iArr2 = new int["\u000f\f\u001at\u0005\u0006\r\u0002\u0007\u0004j}\n{\u0001}\n".length()];
            QB qb2 = new QB("\u000f\f\u001at\u0005\u0006\r\u0002\u0007\u0004j}\n{\u0001}\n");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(sXd3 + i3 + xuXd2.CK(iKK2));
                i3++;
            }
            Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                if (packageManager == null) {
                    return null;
                }
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(C1561oA.yd("\u001b'\u001c)-& h%0.3+38p\r86;3E@", (short) (C1499aX.Xd() ^ (-11697)))).getMethod(C1561oA.Yd("VUeBTW`W^]G[ha", (short) (C1607wl.Xd() ^ 27265)), new Class[0]);
                try {
                    method2.setAccessible(true);
                    String str2 = (String) method2.invoke(context, objArr2);
                    Class<?> cls2 = Class.forName(Xg.qd("t\u0003y\t\u0007\u0002}H~\f\f\u0013\u0005\u000f\u0016P\u0014\u0012Sv\t\f\u0015\f\u0013\u0012z\u0010\u001e\u0012\u0019\u0018&", (short) (FB.Xd() ^ 27222), (short) (FB.Xd() ^ 7360)));
                    Class<?>[] clsArr2 = new Class[2];
                    clsArr2[0] = Class.forName(Jg.Wd("DI-FA*p\bOD8c3X\b3", (short) (C1633zX.Xd() ^ (-831)), (short) (C1633zX.Xd() ^ (-8605))));
                    clsArr2[1] = Integer.TYPE;
                    Object[] objArr3 = {str2, 128};
                    Method method3 = cls2.getMethod(ZO.xd("N;&o\u0003C\u001d8Rgl{?~A)qM", (short) (OY.Xd() ^ 19891), (short) (OY.Xd() ^ 19301)), clsArr2);
                    try {
                        method3.setAccessible(true);
                        ApplicationInfo applicationInfo = (ApplicationInfo) method3.invoke(packageManager, objArr3);
                        if (applicationInfo == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey(str)) {
                            return null;
                        }
                        return Boolean.valueOf(applicationInfo.metaData.getBoolean(str));
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (PackageManager.NameNotFoundException e5) {
            Logger logger = Logger.getLogger();
            short sXd4 = (short) (C1607wl.Xd() ^ 32295);
            short sXd5 = (short) (C1607wl.Xd() ^ 20831);
            int[] iArr3 = new int["\u000e\u0006H\u0013urg\u0016\u0007E\u00127xsD\u0017de\u0003qy\u007f\u0019\u0017FD\u007fxP=>l/\u001c\u0010S~3\u00160Zr\u0006{\u000b\u001dleq!\u0017H7G(".length()];
            QB qb3 = new QB("\u000e\u0006H\u0013urg\u0016\u0007E\u00127xsD\u0017de\u0003qy\u007f\u0019\u0017FD\u007fxP=>l/\u001c\u0010S~3\u00160Zr\u0006{\u000b\u001dleq!\u0017H7G(");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd4 + sXd4) + (i4 * sXd5))) + xuXd3.CK(iKK3));
                i4++;
            }
            logger.e(new String(iArr3, 0, i4), e5);
            return null;
        }
    }

    private static void storeDataCollectionValueInSharedPreferences(SharedPreferences sharedPreferences, Boolean bool) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        if (bool != null) {
            editorEdit.putBoolean(FIREBASE_CRASHLYTICS_COLLECTION_ENABLED, bool.booleanValue());
        } else {
            editorEdit.remove(FIREBASE_CRASHLYTICS_COLLECTION_ENABLED);
        }
        editorEdit.apply();
    }

    public void grantDataCollectionPermission(boolean z2) {
        if (!z2) {
            throw new IllegalStateException("An invalid data collection token was used.");
        }
        this.dataCollectionExplicitlyApproved.trySetResult(null);
    }

    public synchronized boolean isAutomaticDataCollectionEnabled() {
        boolean zBooleanValue;
        Boolean bool = this.crashlyticsDataCollectionEnabled;
        zBooleanValue = bool != null ? bool.booleanValue() : isFirebaseDataCollectionDefaultEnabled();
        logDataCollectionState(zBooleanValue);
        return zBooleanValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0008  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x000a A[Catch: all -> 0x0046, TryCatch #1 {, blocks: (B:38:0x0004, B:42:0x0014, B:43:0x001d, B:58:0x0045, B:41:0x000a, B:44:0x001e, B:46:0x0024, B:48:0x0028, B:49:0x0031, B:51:0x0033, B:53:0x0037), top: B:64:0x0004, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x001e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void setCrashlyticsDataCollectionEnabled(java.lang.Boolean r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            r1 = 0
            if (r4 == 0) goto L6
            r3.setInManifest = r1     // Catch: java.lang.Throwable -> L46
        L6:
            if (r4 == 0) goto La
            r0 = r4
            goto L14
        La:
            com.google.firebase.FirebaseApp r0 = r3.firebaseApp     // Catch: java.lang.Throwable -> L46
            android.content.Context r0 = r0.getApplicationContext()     // Catch: java.lang.Throwable -> L46
            java.lang.Boolean r0 = r3.getDataCollectionValueFromManifest(r0)     // Catch: java.lang.Throwable -> L46
        L14:
            r3.crashlyticsDataCollectionEnabled = r0     // Catch: java.lang.Throwable -> L46
            android.content.SharedPreferences r0 = r3.sharedPreferences     // Catch: java.lang.Throwable -> L46
            storeDataCollectionValueInSharedPreferences(r0, r4)     // Catch: java.lang.Throwable -> L46
            java.lang.Object r2 = r3.taskLock     // Catch: java.lang.Throwable -> L46
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L46
            boolean r0 = r3.isAutomaticDataCollectionEnabled()     // Catch: java.lang.Throwable -> L43
            if (r0 == 0) goto L33
            boolean r0 = r3.taskResolved     // Catch: java.lang.Throwable -> L43
            if (r0 != 0) goto L31
            com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> r1 = r3.dataCollectionEnabledTask     // Catch: java.lang.Throwable -> L43
            r0 = 0
            r1.trySetResult(r0)     // Catch: java.lang.Throwable -> L43
            r0 = 1
            r3.taskResolved = r0     // Catch: java.lang.Throwable -> L43
        L31:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L43
            goto L41
        L33:
            boolean r0 = r3.taskResolved     // Catch: java.lang.Throwable -> L43
            if (r0 == 0) goto L31
            com.google.android.gms.tasks.TaskCompletionSource r0 = new com.google.android.gms.tasks.TaskCompletionSource     // Catch: java.lang.Throwable -> L43
            r0.<init>()     // Catch: java.lang.Throwable -> L43
            r3.dataCollectionEnabledTask = r0     // Catch: java.lang.Throwable -> L43
            r3.taskResolved = r1     // Catch: java.lang.Throwable -> L43
            goto L31
        L41:
            monitor-exit(r3)
            return
        L43:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L43
            throw r0     // Catch: java.lang.Throwable -> L46
        L46:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L46
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.common.DataCollectionArbiter.setCrashlyticsDataCollectionEnabled(java.lang.Boolean):void");
    }

    public Task<Void> waitForAutomaticDataCollectionEnabled() {
        Task<Void> task;
        synchronized (this.taskLock) {
            task = this.dataCollectionEnabledTask.getTask();
        }
        return task;
    }

    public Task<Void> waitForDataCollectionPermission() {
        return CrashlyticsTasks.race(this.dataCollectionExplicitlyApproved.getTask(), waitForAutomaticDataCollectionEnabled());
    }
}
