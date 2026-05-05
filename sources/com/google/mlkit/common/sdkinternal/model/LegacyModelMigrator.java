package com.google.mlkit.common.sdkinternal.model;

import android.content.Context;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.mlkit.common.sdkinternal.MLTaskExecutor;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import yg.C1607wl;
import yg.OY;
import yg.QB;
import yg.Wg;
import yg.Xu;

/* JADX INFO: loaded from: classes7.dex */
public abstract class LegacyModelMigrator {
    protected final ModelFileHelper modelFileHelper;
    private final Context zzb;
    private final TaskCompletionSource zza = new TaskCompletionSource();
    private final Executor zzc = MLTaskExecutor.workerThreadExecutor();

    protected LegacyModelMigrator(Context context, ModelFileHelper modelFileHelper) {
        this.zzb = context;
        this.modelFileHelper = modelFileHelper;
    }

    protected static void deleteIfEmpty(File file) {
        File[] fileArrListFiles = file.listFiles();
        if ((fileArrListFiles == null || fileArrListFiles.length == 0) && !file.delete()) {
            "Error deleting model directory ".concat(String.valueOf(String.valueOf(file)));
        }
    }

    protected static boolean isValidFirebasePersistenceKey(String str) throws Throwable {
        String[] strArrSplit = str.split("\\+", -1);
        if (strArrSplit.length != 2) {
            return false;
        }
        try {
            Base64Utils.decodeUrlSafeNoPadding(strArrSplit[0]);
            Base64Utils.decodeUrlSafeNoPadding(strArrSplit[1]);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public static void migrateFile(File file, File file2) {
        if (file.exists()) {
            if (!file2.exists() && !file.renameTo(file2)) {
                String str = "Error moving model file " + String.valueOf(file) + " to " + String.valueOf(file2);
            }
            if (!file.exists() || file.delete()) {
                return;
            }
            "Error deleting model file ".concat(String.valueOf(String.valueOf(file)));
        }
    }

    protected abstract String getLegacyModelDirName();

    public File getLegacyRootDir() throws Throwable {
        Context context = this.zzb;
        String legacyModelDirName = getLegacyModelDirName();
        short sXd = (short) (OY.Xd() ^ 17839);
        int[] iArr = new int["DRIXVQM\u0018N[[bT^e 6ccj\\pm".length()];
        QB qb = new QB("DRIXVQM\u0018N[[bT^e 6ccj\\pm");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Wg.vd("BAQ,F\u001a:=>IE\u001c8<6E\u000f5?", (short) (C1607wl.Xd() ^ 21369)), new Class[0]);
        try {
            method.setAccessible(true);
            return new File((File) method.invoke(context, objArr), legacyModelDirName);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public Task<Void> getMigrationTask() {
        return this.zza.getTask();
    }

    protected abstract void migrateAllModelDirs(File file);

    public void start() {
        this.zzc.execute(new Runnable() { // from class: com.google.mlkit.common.sdkinternal.model.zza
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.zza.zza();
            }
        });
    }

    final /* synthetic */ void zza() throws Throwable {
        File legacyRootDir = getLegacyRootDir();
        File[] fileArrListFiles = legacyRootDir.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                migrateAllModelDirs(file);
            }
            deleteIfEmpty(legacyRootDir);
        }
        this.zza.setResult(null);
    }
}
