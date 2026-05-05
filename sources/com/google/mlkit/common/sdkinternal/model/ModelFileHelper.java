package com.google.mlkit.common.sdkinternal.model;

import android.content.Context;
import com.facebook.hermes.intl.Constants;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.ModelType;
import io.reactivex.annotations.SchedulerSupport;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.EO;
import yg.FB;
import yg.OY;
import yg.QB;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes7.dex */
public class ModelFileHelper {
    public static final int INVALID_INDEX = -1;
    private final MlKitContext zze;
    private static final GmsLogger zzd = new GmsLogger("ModelFileHelper", "");
    public static final String zza = String.format("com.google.mlkit.%s.models", "translate");
    public static final String zzb = String.format("com.google.mlkit.%s.models", SchedulerSupport.CUSTOM);
    static final String zzc = String.format("com.google.mlkit.%s.models", Constants.SENSITIVITY_BASE);

    public ModelFileHelper(MlKitContext mlKitContext) {
        this.zze = mlKitContext;
    }

    private final File zzc(String str, ModelType modelType, boolean z2) throws Throwable {
        File modelDirUnsafe = getModelDirUnsafe(str, modelType, z2);
        if (!modelDirUnsafe.exists()) {
            zzd.d("ModelFileHelper", "model folder does not exist, creating one: ".concat(String.valueOf(modelDirUnsafe.getAbsolutePath())));
            if (!modelDirUnsafe.mkdirs()) {
                throw new MlKitException("Failed to create model folder: ".concat(String.valueOf(String.valueOf(modelDirUnsafe))), 13);
            }
        } else if (!modelDirUnsafe.isDirectory()) {
            throw new MlKitException("Can not create model folder, since an existing file has the same name: ".concat(String.valueOf(String.valueOf(modelDirUnsafe))), 6);
        }
        return modelDirUnsafe;
    }

    public synchronized void deleteAllModels(ModelType modelType, String str) {
        deleteRecursively(getModelDirUnsafe(str, modelType, false));
        deleteRecursively(getModelDirUnsafe(str, modelType, true));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean deleteRecursively(java.io.File r8) {
        /*
            r7 = this;
            r6 = 0
            if (r8 != 0) goto L4
            return r6
        L4:
            boolean r0 = r8.isDirectory()
            r5 = 1
            if (r0 == 0) goto L2c
            java.io.File[] r0 = r8.listFiles()
            java.lang.Object r4 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            java.io.File[] r4 = (java.io.File[]) r4
            int r3 = r4.length
            r2 = r6
            r1 = r5
        L18:
            if (r2 >= r3) goto L2a
            r0 = r4[r2]
            if (r1 == 0) goto L28
            boolean r0 = r7.deleteRecursively(r0)
            if (r0 == 0) goto L28
            r1 = r5
        L25:
            int r2 = r2 + 1
            goto L18
        L28:
            r1 = r6
            goto L25
        L2a:
            if (r1 == 0) goto L33
        L2c:
            boolean r0 = r8.delete()
            if (r0 == 0) goto L33
            return r5
        L33:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.common.sdkinternal.model.ModelFileHelper.deleteRecursively(java.io.File):boolean");
    }

    public void deleteTempFilesInPrivateFolder(String str, ModelType modelType) throws Throwable {
        File fileZzc = zzc(str, modelType, true);
        if (deleteRecursively(fileZzc)) {
            return;
        }
        zzd.e("ModelFileHelper", "Failed to delete the temp labels file directory: ".concat(String.valueOf(fileZzc != null ? fileZzc.getAbsolutePath() : null)));
    }

    public int getLatestCachedModelVersion(File file) {
        File[] fileArrListFiles = file.listFiles();
        int iMax = -1;
        if (fileArrListFiles != null && (fileArrListFiles.length) != 0) {
            for (File file2 : fileArrListFiles) {
                try {
                    iMax = Math.max(iMax, Integer.parseInt(file2.getName()));
                } catch (NumberFormatException unused) {
                    zzd.d("ModelFileHelper", "Contains non-integer file name ".concat(String.valueOf(file2.getName())));
                }
            }
        }
        return iMax;
    }

    public File getModelDir(String str, ModelType modelType) throws MlKitException {
        return zzc(str, modelType, false);
    }

    public File getModelDirUnsafe(String str, ModelType modelType, boolean z2) throws Throwable {
        String str2;
        ModelType modelType2 = ModelType.UNKNOWN;
        int iOrdinal = modelType.ordinal();
        if (iOrdinal == 1) {
            str2 = zzc;
        } else if (iOrdinal == 2) {
            str2 = zza;
        } else {
            if (iOrdinal != 4) {
                String strName = modelType.name();
                StringBuilder sb = new StringBuilder(EO.Od(";\u00052ZM\u000b[\u0007{/(As/&FzsW", (short) (C1580rY.Xd() ^ (-28297))));
                sb.append(strName);
                short sXd = (short) (OY.Xd() ^ 8408);
                int[] iArr = new int["+\u001c>[gffj\u0015Z\\`U\u0010P\u000eQU]\n]W\u0007YYSUG\u0001TGC|@JQGDF7997q>?339y".length()];
                QB qb = new QB("+\u001c>[gffj\u0015Z\\`U\u0010P\u000eQU]\n]W\u0007YYSUG\u0001TGC|@JQGDF7997q>?339y");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
                    i2++;
                }
                sb.append(new String(iArr, 0, i2));
                throw new IllegalArgumentException(sb.toString());
            }
            str2 = zzb;
        }
        Context applicationContext = this.zze.getApplicationContext();
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1593ug.zd("\u0003\u0011\b\u0017\u0015\u0010\fV\r\u001a\u001a!\u0013\u001d$^t\"\")\u001b/,", (short) (FB.Xd() ^ 29054), (short) (FB.Xd() ^ 13166))).getMethod(C1561oA.od("vs\u0002ZzLjkr{uJlnfsCgo", (short) (ZN.Xd() ^ 8944)), new Class[0]);
        try {
            method.setAccessible(true);
            File file = new File((File) method.invoke(applicationContext, objArr), str2);
            if (z2) {
                short sXd2 = (short) (FB.Xd() ^ 27620);
                int[] iArr2 = new int["6(15".length()];
                QB qb2 = new QB("6(15");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd2 + sXd2) + i3));
                    i3++;
                }
                file = new File(file, new String(iArr2, 0, i3));
            }
            return new File(file, str);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public File getModelTempDir(String str, ModelType modelType) throws MlKitException {
        return zzc(str, modelType, true);
    }

    public File getTempFileInPrivateFolder(String str, ModelType modelType, String str2) throws Throwable {
        File fileZzc = zzc(str, modelType, true);
        if (fileZzc.exists() && fileZzc.isFile() && !fileZzc.delete()) {
            throw new MlKitException("Failed to delete the temp labels file: ".concat(String.valueOf(fileZzc.getAbsolutePath())), 13);
        }
        if (!fileZzc.exists()) {
            zzd.d("ModelFileHelper", "Temp labels folder does not exist, creating one: ".concat(String.valueOf(fileZzc.getAbsolutePath())));
            if (!fileZzc.mkdirs()) {
                throw new MlKitException("Failed to create a directory to hold the AutoML model's labels file.", 13);
            }
        }
        return new File(fileZzc, str2);
    }

    public boolean modelExistsLocally(String str, ModelType modelType) throws MlKitException {
        String strZzb;
        if (modelType == ModelType.UNKNOWN || (strZzb = zzb(str, modelType)) == null) {
            return false;
        }
        File file = new File(strZzb);
        if (!file.exists()) {
            return false;
        }
        File file2 = new File(file, com.google.mlkit.common.sdkinternal.Constants.MODEL_FILE_NAME);
        zzd.i("ModelFileHelper", "Model file path: ".concat(String.valueOf(file2.getAbsolutePath())));
        return file2.exists();
    }

    public final File zza(String str, ModelType modelType) throws MlKitException {
        return zzc(str, modelType, true);
    }

    public final String zzb(String str, ModelType modelType) throws MlKitException {
        File modelDir = getModelDir(str, modelType);
        int latestCachedModelVersion = getLatestCachedModelVersion(modelDir);
        if (latestCachedModelVersion == -1) {
            return null;
        }
        return modelDir.getAbsolutePath() + RemoteSettings.FORWARD_SLASH_STRING + latestCachedModelVersion;
    }
}
