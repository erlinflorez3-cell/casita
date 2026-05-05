package com.google.mlkit.common.sdkinternal.model;

import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_common.zzsh;
import com.google.android.gms.internal.mlkit_common.zzss;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.model.CustomRemoteModel;
import com.google.mlkit.common.model.LocalModel;
import com.google.mlkit.common.model.RemoteModel;
import com.google.mlkit.common.sdkinternal.Constants;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class CustomModelLoader {
    private static final GmsLogger zza = new GmsLogger("CustomModelLoader", "");
    private static final Map zzb = new HashMap();
    private final MlKitContext zzc;
    private final LocalModel zzd;
    private final CustomRemoteModel zze;
    private final RemoteModelDownloadManager zzf;
    private final RemoteModelFileManager zzg;
    private final zzsh zzh;
    private boolean zzi;

    public interface CustomModelLoaderHelper {
        void logLoad() throws MlKitException;

        boolean tryLoad(LocalModel localModel) throws MlKitException;
    }

    private CustomModelLoader(MlKitContext mlKitContext, LocalModel localModel, CustomRemoteModel customRemoteModel) {
        if (customRemoteModel != null) {
            RemoteModelFileManager remoteModelFileManager = new RemoteModelFileManager(mlKitContext, customRemoteModel, null, new ModelFileHelper(mlKitContext), new com.google.mlkit.common.internal.model.zza(mlKitContext, customRemoteModel.getUniqueModelNameForPersist()));
            this.zzg = remoteModelFileManager;
            this.zzf = RemoteModelDownloadManager.getInstance(mlKitContext, customRemoteModel, new ModelFileHelper(mlKitContext), remoteModelFileManager, (ModelInfoRetrieverInterop) mlKitContext.get(ModelInfoRetrieverInterop.class));
            this.zzi = true;
        } else {
            this.zzg = null;
            this.zzf = null;
        }
        this.zzc = mlKitContext;
        this.zzd = localModel;
        this.zze = customRemoteModel;
        this.zzh = zzss.zzb("common");
    }

    public static synchronized CustomModelLoader getInstance(MlKitContext mlKitContext, LocalModel localModel, CustomRemoteModel customRemoteModel) {
        String string;
        Map map;
        string = customRemoteModel == null ? ((LocalModel) Preconditions.checkNotNull(localModel)).toString() : customRemoteModel.getUniqueModelNameForPersist();
        map = zzb;
        if (!map.containsKey(string)) {
            map.put(string, new CustomModelLoader(mlKitContext, localModel, customRemoteModel));
        }
        return (CustomModelLoader) map.get(string);
    }

    private final File zza() throws MlKitException {
        String strZzb = ((RemoteModelFileManager) Preconditions.checkNotNull(this.zzg)).zzb();
        if (strZzb == null) {
            zza.d("CustomModelLoader", "No existing model file");
            return null;
        }
        File file = new File(strZzb);
        File[] fileArrListFiles = file.listFiles();
        return ((File[]) Preconditions.checkNotNull(fileArrListFiles)).length == 1 ? fileArrListFiles[0] : file;
    }

    private final void zzb() throws MlKitException {
        ((RemoteModelDownloadManager) Preconditions.checkNotNull(this.zzf)).removeOrCancelDownload();
    }

    private static final LocalModel zzc(File file) {
        if (file.isDirectory()) {
            LocalModel.Builder builder = new LocalModel.Builder();
            builder.setAbsoluteManifestFilePath(new File(file.getAbsolutePath(), Constants.AUTOML_IMAGE_LABELING_MANIFEST_JSON_FILE_NAME).toString());
            return builder.build();
        }
        LocalModel.Builder builder2 = new LocalModel.Builder();
        builder2.setAbsoluteFilePath(file.getAbsolutePath());
        return builder2.build();
    }

    public synchronized LocalModel createLocalModelByLatestExistingModel() throws MlKitException {
        zza.d("CustomModelLoader", "Try to get the latest existing model file.");
        File fileZza = zza();
        if (fileZza == null) {
            return null;
        }
        return zzc(fileZza);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a4 A[Catch: all -> 0x00aa, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:8:0x0024, B:10:0x002c, B:25:0x00a4, B:11:0x0030, B:13:0x004f, B:16:0x0058, B:17:0x0071, B:19:0x0079, B:20:0x0095), top: B:31:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized com.google.mlkit.common.model.LocalModel createLocalModelByNewlyDownloadedModel() throws com.google.mlkit.common.MlKitException {
        /*
            r8 = this;
            java.lang.String r3 = "Download Status code: "
            monitor-enter(r8)
            com.google.android.gms.common.internal.GmsLogger r4 = com.google.mlkit.common.sdkinternal.model.CustomModelLoader.zza     // Catch: java.lang.Throwable -> Laa
            java.lang.String r1 = "CustomModelLoader"
            java.lang.String r0 = "Try to get newly downloaded model file."
            r4.d(r1, r0)     // Catch: java.lang.Throwable -> Laa
            com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager r0 = r8.zzf     // Catch: java.lang.Throwable -> Laa
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch: java.lang.Throwable -> Laa
            com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager r0 = (com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager) r0     // Catch: java.lang.Throwable -> Laa
            java.lang.Long r6 = r0.getDownloadingId()     // Catch: java.lang.Throwable -> Laa
            com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager r0 = r8.zzf     // Catch: java.lang.Throwable -> Laa
            java.lang.String r5 = r0.getDownloadingModelHash()     // Catch: java.lang.Throwable -> Laa
            r7 = 0
            if (r6 == 0) goto L95
            if (r5 != 0) goto L24
            goto L95
        L24:
            com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager r0 = r8.zzf     // Catch: java.lang.Throwable -> Laa
            java.lang.Integer r2 = r0.getDownloadingModelStatusCode()     // Catch: java.lang.Throwable -> Laa
            if (r2 != 0) goto L30
            r8.zzb()     // Catch: java.lang.Throwable -> Laa
            goto L9f
        L30:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Laa
            r0.<init>(r3)     // Catch: java.lang.Throwable -> Laa
            java.lang.String r1 = "Download Status code: "
            r0.append(r2)     // Catch: java.lang.Throwable -> Laa
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> Laa
            java.lang.String r1 = r1.concat(r0)     // Catch: java.lang.Throwable -> Laa
            java.lang.String r0 = "CustomModelLoader"
            r4.d(r0, r1)     // Catch: java.lang.Throwable -> Laa
            int r1 = r2.intValue()     // Catch: java.lang.Throwable -> Laa
            r0 = 8
            if (r1 != r0) goto L71
            com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager r0 = r8.zzf     // Catch: java.lang.Throwable -> Laa
            java.io.File r3 = r0.zzi(r5)     // Catch: java.lang.Throwable -> Laa
            if (r3 != 0) goto L58
            goto L9f
        L58:
            java.lang.String r0 = r3.getParent()     // Catch: java.lang.Throwable -> Laa
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> Laa
            java.lang.String r0 = "Moved the downloaded model to private folder successfully: "
            java.lang.String r1 = "CustomModelLoader"
            java.lang.String r0 = r0.concat(r2)     // Catch: java.lang.Throwable -> Laa
            r4.d(r1, r0)     // Catch: java.lang.Throwable -> Laa
            com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager r0 = r8.zzf     // Catch: java.lang.Throwable -> Laa
            r0.updateLatestModelHashAndType(r5)     // Catch: java.lang.Throwable -> Laa
            goto La0
        L71:
            int r1 = r2.intValue()     // Catch: java.lang.Throwable -> Laa
            r0 = 16
            if (r1 != r0) goto L9f
            com.google.android.gms.internal.mlkit_common.zzsh r4 = r8.zzh     // Catch: java.lang.Throwable -> Laa
            com.google.mlkit.common.model.CustomRemoteModel r0 = r8.zze     // Catch: java.lang.Throwable -> Laa
            com.google.android.gms.internal.mlkit_common.zzry r3 = com.google.android.gms.internal.mlkit_common.zzsk.zzg()     // Catch: java.lang.Throwable -> Laa
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch: java.lang.Throwable -> Laa
            com.google.mlkit.common.model.RemoteModel r2 = (com.google.mlkit.common.model.RemoteModel) r2     // Catch: java.lang.Throwable -> Laa
            com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager r0 = r8.zzf     // Catch: java.lang.Throwable -> Laa
            int r1 = r0.getFailureReason(r6)     // Catch: java.lang.Throwable -> Laa
            r0 = 0
            r4.zze(r3, r2, r0, r1)     // Catch: java.lang.Throwable -> Laa
            r8.zzb()     // Catch: java.lang.Throwable -> Laa
            goto L9f
        L95:
            java.lang.String r1 = "CustomModelLoader"
            java.lang.String r0 = "No new model is downloading."
            r4.d(r1, r0)     // Catch: java.lang.Throwable -> Laa
            r8.zzb()     // Catch: java.lang.Throwable -> Laa
        L9f:
            r3 = r7
        La0:
            if (r3 != 0) goto La4
            monitor-exit(r8)
            return r7
        La4:
            com.google.mlkit.common.model.LocalModel r0 = zzc(r3)     // Catch: java.lang.Throwable -> Laa
            monitor-exit(r8)
            return r0
        Laa:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Laa
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.common.sdkinternal.model.CustomModelLoader.createLocalModelByNewlyDownloadedModel():com.google.mlkit.common.model.LocalModel");
    }

    public void deleteLatestExistingModel() throws MlKitException {
        File fileZza = zza();
        if (fileZza != null) {
            ((RemoteModelFileManager) Preconditions.checkNotNull(this.zzg)).zzc(fileZza);
            SharedPrefManager.getInstance(this.zzc).clearLatestModelHash((RemoteModel) Preconditions.checkNotNull(this.zze));
        }
    }

    public void deleteOldModels(LocalModel localModel) throws MlKitException {
        File parentFile = new File((String) Preconditions.checkNotNull(localModel.getAbsoluteFilePath())).getParentFile();
        if (!((RemoteModelFileManager) Preconditions.checkNotNull(this.zzg)).zzd((File) Preconditions.checkNotNull(parentFile))) {
            zza.e("CustomModelLoader", "Failed to delete old models");
        } else {
            zza.d("CustomModelLoader", "All old models are deleted.");
            this.zzg.zza(parentFile);
        }
    }

    public synchronized void load(CustomModelLoaderHelper customModelLoaderHelper) throws MlKitException {
        LocalModel localModelCreateLocalModelByLatestExistingModel = this.zzd;
        if (localModelCreateLocalModelByLatestExistingModel == null) {
            localModelCreateLocalModelByLatestExistingModel = createLocalModelByNewlyDownloadedModel();
        }
        if (localModelCreateLocalModelByLatestExistingModel == null) {
            localModelCreateLocalModelByLatestExistingModel = createLocalModelByLatestExistingModel();
        }
        if (localModelCreateLocalModelByLatestExistingModel == null) {
            throw new MlKitException("Model is not available.", 14);
        }
        while (!customModelLoaderHelper.tryLoad(localModelCreateLocalModelByLatestExistingModel)) {
            if (this.zze != null) {
                deleteLatestExistingModel();
                localModelCreateLocalModelByLatestExistingModel = createLocalModelByLatestExistingModel();
            } else {
                localModelCreateLocalModelByLatestExistingModel = null;
            }
            if (localModelCreateLocalModelByLatestExistingModel == null) {
                customModelLoaderHelper.logLoad();
                return;
            }
        }
        if (this.zze != null && this.zzi) {
            deleteOldModels((LocalModel) Preconditions.checkNotNull(localModelCreateLocalModelByLatestExistingModel));
            this.zzi = false;
        }
        customModelLoaderHelper.logLoad();
    }
}
