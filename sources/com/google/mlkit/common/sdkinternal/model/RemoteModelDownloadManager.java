package com.google.mlkit.common.sdkinternal.model;

import android.app.DownloadManager;
import android.content.Context;
import android.content.IntentFilter;
import android.database.Cursor;
import android.os.ParcelFileDescriptor;
import android.util.LongSparseArray;
import androidx.core.content.ContextCompat;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_common.zzmu;
import com.google.android.gms.internal.mlkit_common.zzna;
import com.google.android.gms.internal.mlkit_common.zzry;
import com.google.android.gms.internal.mlkit_common.zzsh;
import com.google.android.gms.internal.mlkit_common.zzsk;
import com.google.android.gms.internal.mlkit_common.zzss;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.model.DownloadConditions;
import com.google.mlkit.common.model.RemoteModel;
import com.google.mlkit.common.sdkinternal.CommonUtils;
import com.google.mlkit.common.sdkinternal.MLTaskExecutor;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.ModelInfo;
import com.google.mlkit.common.sdkinternal.ModelType;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import io.sentry.clientreport.DiscardedEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import yg.C1561oA;
import yg.C1580rY;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.hg;

/* JADX INFO: loaded from: classes7.dex */
public class RemoteModelDownloadManager {
    private static final GmsLogger zza = new GmsLogger("ModelDownloadManager", "");
    private static final Map zzb = new HashMap();
    private final LongSparseArray zzc = new LongSparseArray();
    private final LongSparseArray zzd = new LongSparseArray();
    private final MlKitContext zze;
    private final DownloadManager zzf;
    private final RemoteModel zzg;
    private final ModelType zzh;
    private final zzsh zzi;
    private final SharedPrefManager zzj;
    private final ModelFileHelper zzk;
    private final ModelInfoRetrieverInterop zzl;
    private final RemoteModelFileManager zzm;
    private DownloadConditions zzn;

    RemoteModelDownloadManager(MlKitContext mlKitContext, RemoteModel remoteModel, ModelFileHelper modelFileHelper, RemoteModelFileManager remoteModelFileManager, ModelInfoRetrieverInterop modelInfoRetrieverInterop, zzsh zzshVar) throws Throwable {
        this.zze = mlKitContext;
        this.zzh = remoteModel.getModelType();
        this.zzg = remoteModel;
        Context applicationContext = mlKitContext.getApplicationContext();
        Object[] objArr = {Wg.Zd("uwhT;5>*", (short) (C1580rY.Xd() ^ (-12138)), (short) (C1580rY.Xd() ^ (-25993)))};
        Method method = Class.forName(C1561oA.Xd("\\japnie0fsszlv}8N{{\u0003t\t\u0006", (short) (C1580rY.Xd() ^ (-17365)))).getMethod(Qg.kd("-*8\u0016;44$+\u0010!-0\"\u001b\u001c", (short) (FB.Xd() ^ 14022), (short) (FB.Xd() ^ 6578)), Class.forName(Wg.vd("\u001a\u0012(\u0014a!\u0017%\u001ff\r/.&,&", (short) (OY.Xd() ^ 6215))));
        try {
            method.setAccessible(true);
            DownloadManager downloadManager = (DownloadManager) method.invoke(applicationContext, objArr);
            this.zzf = downloadManager;
            this.zzi = zzshVar;
            if (downloadManager == null) {
                GmsLogger gmsLogger = zza;
                String strVd = hg.Vd("EfZZ`7ah^[]NP8KWINKW", (short) (Od.Xd() ^ (-6452)), (short) (Od.Xd() ^ (-15603)));
                short sXd = (short) (Od.Xd() ^ (-23491));
                int[] iArr = new int["z%,\"\u001f!\u0012\u0014N\u001b\u000e\u001a\f\u0011\u000e\u001aF\u0019\n\u0016\u0019\u000b\u0004\u0005>\u0007\u0010;\t\t\r7w\fu|~rr{s-uy*}pl&xiuxjcd,".length()];
                QB qb = new QB("z%,\"\u001f!\u0012\u0014N\u001b\u000e\u001a\f\u0011\u000e\u001aF\u0019\n\u0016\u0019\u000b\u0004\u0005>\u0007\u0010;\t\t\r7w\fu|~rr{s-uy*}pl&xiuxjcd,");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
                    i2++;
                }
                gmsLogger.d(strVd, new String(iArr, 0, i2));
            }
            this.zzk = modelFileHelper;
            this.zzj = SharedPrefManager.getInstance(mlKitContext);
            this.zzl = modelInfoRetrieverInterop;
            this.zzm = remoteModelFileManager;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static synchronized RemoteModelDownloadManager getInstance(MlKitContext mlKitContext, RemoteModel remoteModel, ModelFileHelper modelFileHelper, RemoteModelFileManager remoteModelFileManager, ModelInfoRetrieverInterop modelInfoRetrieverInterop) {
        Map map;
        map = zzb;
        if (!map.containsKey(remoteModel)) {
            map.put(remoteModel, new RemoteModelDownloadManager(mlKitContext, remoteModel, modelFileHelper, remoteModelFileManager, modelInfoRetrieverInterop, zzss.zzb("common")));
        }
        return (RemoteModelDownloadManager) map.get(remoteModel);
    }

    private final Task zzj(long j2) {
        MlKitContext mlKitContext = this.zze;
        ContextCompat.registerReceiver(mlKitContext.getApplicationContext(), zzm(j2), new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"), null, MLTaskExecutor.getInstance().getHandler(), 2);
        return zzk(j2).getTask();
    }

    private final synchronized TaskCompletionSource zzk(long j2) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.zzd.get(j2);
        if (taskCompletionSource != null) {
            return taskCompletionSource;
        }
        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        this.zzd.put(j2, taskCompletionSource2);
        return taskCompletionSource2;
    }

    public final MlKitException zzl(Long l2) {
        DownloadManager downloadManager = this.zzf;
        Cursor cursorQuery = null;
        if (downloadManager != null && l2 != null) {
            cursorQuery = downloadManager.query(new DownloadManager.Query().setFilterById(l2.longValue()));
        }
        int i2 = 13;
        String str = "Model downloading failed";
        if (cursorQuery != null && cursorQuery.moveToFirst()) {
            int i3 = cursorQuery.getInt(cursorQuery.getColumnIndex(DiscardedEvent.JsonKeys.REASON));
            if (i3 == 1006) {
                str = "Model downloading failed due to insufficient space on the device.";
                i2 = 101;
            } else {
                str = "Model downloading failed due to error code: " + i3 + " from Android DownloadManager";
            }
        }
        return new MlKitException(str, i2);
    }

    private final synchronized zzc zzm(long j2) {
        zzc zzcVar = (zzc) this.zzc.get(j2);
        if (zzcVar != null) {
            return zzcVar;
        }
        zzc zzcVar2 = new zzc(this, j2, zzk(j2), null);
        this.zzc.put(j2, zzcVar2);
        return zzcVar2;
    }

    private final synchronized Long zzn(DownloadManager.Request request, ModelInfo modelInfo) {
        DownloadManager downloadManager = this.zzf;
        if (downloadManager == null) {
            return null;
        }
        long jEnqueue = downloadManager.enqueue(request);
        zza.d("ModelDownloadManager", "Schedule a new downloading task: " + jEnqueue);
        this.zzj.setDownloadingModelInfo(jEnqueue, modelInfo);
        this.zzi.zzf(zzsk.zzg(), this.zzg, zzmu.NO_ERROR, false, modelInfo.getModelType(), zzna.SCHEDULED);
        return Long.valueOf(jEnqueue);
    }

    private final synchronized Long zzo(ModelInfo modelInfo, DownloadConditions downloadConditions) throws MlKitException {
        Preconditions.checkNotNull(downloadConditions, "DownloadConditions can not be null");
        String downloadingModelHash = this.zzj.getDownloadingModelHash(this.zzg);
        Integer downloadingModelStatusCode = getDownloadingModelStatusCode();
        if (downloadingModelHash != null && downloadingModelHash.equals(modelInfo.getModelHash()) && downloadingModelStatusCode != null) {
            Integer downloadingModelStatusCode2 = getDownloadingModelStatusCode();
            if (downloadingModelStatusCode2 == null || (downloadingModelStatusCode2.intValue() != 8 && downloadingModelStatusCode2.intValue() != 16)) {
                zzsh zzshVar = this.zzi;
                RemoteModel remoteModel = this.zzg;
                zzshVar.zzf(zzsk.zzg(), remoteModel, zzmu.NO_ERROR, false, remoteModel.getModelType(), zzna.DOWNLOADING);
            }
            zza.d("ModelDownloadManager", "New model is already in downloading, do nothing.");
            return null;
        }
        GmsLogger gmsLogger = zza;
        gmsLogger.d("ModelDownloadManager", "Need to download a new model.");
        removeOrCancelDownload();
        DownloadManager.Request request = new DownloadManager.Request(modelInfo.getModelUri());
        if (this.zzk.modelExistsLocally(modelInfo.getModelNameForPersist(), modelInfo.getModelType())) {
            gmsLogger.d("ModelDownloadManager", "Model update is enabled and have a previous downloaded model, use download condition");
            this.zzi.zzf(zzsk.zzg(), this.zzg, zzmu.NO_ERROR, false, modelInfo.getModelType(), zzna.UPDATE_AVAILABLE);
        }
        request.setRequiresCharging(downloadConditions.isChargingRequired());
        if (downloadConditions.isWifiRequired()) {
            request.setAllowedNetworkTypes(2);
        }
        return zzn(request, modelInfo);
    }

    public Task<Void> ensureModelDownloaded() {
        ModelInfo modelInfoZzg;
        this.zzi.zzf(zzsk.zzg(), this.zzg, zzmu.NO_ERROR, false, ModelType.UNKNOWN, zzna.EXPLICITLY_REQUESTED);
        try {
            modelInfoZzg = zzg();
            e = null;
        } catch (MlKitException e2) {
            e = e2;
            modelInfoZzg = null;
        }
        try {
            Integer downloadingModelStatusCode = getDownloadingModelStatusCode();
            Long downloadingId = getDownloadingId();
            if (!modelExistsLocally() && (downloadingModelStatusCode == null || downloadingModelStatusCode.intValue() != 8)) {
                if (downloadingModelStatusCode != null && downloadingModelStatusCode.intValue() == 16) {
                    MlKitException mlKitExceptionZzl = zzl(downloadingId);
                    removeOrCancelDownload();
                    return Tasks.forException(mlKitExceptionZzl);
                }
                if (downloadingModelStatusCode == null || (!(downloadingModelStatusCode.intValue() == 4 || downloadingModelStatusCode.intValue() == 2 || downloadingModelStatusCode.intValue() == 1) || downloadingId == null || getDownloadingModelHash() == null)) {
                    Long lZzo = modelInfoZzg != null ? zzo(modelInfoZzg, this.zzn) : null;
                    return lZzo == null ? Tasks.forException(new MlKitException("Failed to schedule the download task", 13, e)) : zzj(lZzo.longValue());
                }
                zzsh zzshVar = this.zzi;
                zzry zzryVarZzg = zzsk.zzg();
                RemoteModel remoteModel = this.zzg;
                zzshVar.zzf(zzryVarZzg, remoteModel, zzmu.NO_ERROR, false, remoteModel.getModelType(), zzna.DOWNLOADING);
                return zzj(downloadingId.longValue());
            }
            if (modelInfoZzg != null) {
                Long lZzo2 = zzo(modelInfoZzg, this.zzn);
                if (lZzo2 != null) {
                    return zzj(lZzo2.longValue());
                }
                zza.i("ModelDownloadManager", "Didn't schedule download for the updated model");
            }
            return Tasks.forResult(null);
        } catch (MlKitException e3) {
            return Tasks.forException(new MlKitException("Failed to ensure the model is downloaded.", 13, e3));
        }
    }

    public synchronized ParcelFileDescriptor getDownloadedFile() {
        DownloadManager downloadManager = this.zzf;
        Long downloadingId = getDownloadingId();
        ParcelFileDescriptor parcelFileDescriptorOpenDownloadedFile = null;
        if (downloadManager == null || downloadingId == null) {
            return null;
        }
        try {
            parcelFileDescriptorOpenDownloadedFile = downloadManager.openDownloadedFile(downloadingId.longValue());
        } catch (FileNotFoundException unused) {
            zza.e("ModelDownloadManager", "Downloaded file is not found");
        }
        return parcelFileDescriptorOpenDownloadedFile;
    }

    public synchronized Long getDownloadingId() {
        return this.zzj.getDownloadingModelId(this.zzg);
    }

    public synchronized String getDownloadingModelHash() {
        return this.zzj.getDownloadingModelHash(this.zzg);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0045 A[Catch: all -> 0x0070, TRY_ENTER, TryCatch #0 {all -> 0x0070, blocks: (B:55:0x0027, B:57:0x002d, B:62:0x0045, B:64:0x004c, B:66:0x0053, B:68:0x0059, B:70:0x0061), top: B:85:0x0027, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized java.lang.Integer getDownloadingModelStatusCode() {
        /*
            r8 = this;
            monitor-enter(r8)
            android.app.DownloadManager r7 = r8.zzf     // Catch: java.lang.Throwable -> L7a
            java.lang.Long r0 = r8.getDownloadingId()     // Catch: java.lang.Throwable -> L7a
            r6 = 0
            if (r7 == 0) goto Lc
            if (r0 != 0) goto Le
        Lc:
            monitor-exit(r8)
            return r6
        Le:
            android.app.DownloadManager$Query r5 = new android.app.DownloadManager$Query     // Catch: java.lang.Throwable -> L7a
            r5.<init>()     // Catch: java.lang.Throwable -> L7a
            long r2 = r0.longValue()     // Catch: java.lang.Throwable -> L7a
            r4 = 1
            long[] r1 = new long[r4]     // Catch: java.lang.Throwable -> L7a
            r0 = 0
            r1[r0] = r2     // Catch: java.lang.Throwable -> L7a
            android.app.DownloadManager$Query r0 = r5.setFilterById(r1)     // Catch: java.lang.Throwable -> L7a
            android.database.Cursor r3 = r7.query(r0)     // Catch: java.lang.Throwable -> L7a
            if (r3 == 0) goto L3c
            boolean r0 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L3c
            java.lang.String r0 = "status"
            int r0 = r3.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L70
            int r0 = r3.getInt(r0)     // Catch: java.lang.Throwable -> L70
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L70
            goto L3d
        L3c:
            r2 = r6
        L3d:
            if (r2 != 0) goto L45
            if (r3 == 0) goto Lc
            r3.close()     // Catch: java.lang.Throwable -> L7a
            goto Lc
        L45:
            int r1 = r2.intValue()     // Catch: java.lang.Throwable -> L70
            r0 = 2
            if (r1 == r0) goto L6a
            int r1 = r2.intValue()     // Catch: java.lang.Throwable -> L70
            r0 = 4
            if (r1 == r0) goto L6a
            int r0 = r2.intValue()     // Catch: java.lang.Throwable -> L70
            if (r0 == r4) goto L6a
            int r1 = r2.intValue()     // Catch: java.lang.Throwable -> L70
            r0 = 8
            if (r1 == r0) goto L6a
            int r1 = r2.intValue()     // Catch: java.lang.Throwable -> L70
            r0 = 16
            if (r1 == r0) goto L6a
            goto L6b
        L6a:
            r6 = r2
        L6b:
            r3.close()     // Catch: java.lang.Throwable -> L7a
            monitor-exit(r8)
            return r6
        L70:
            r1 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L75
            goto L79
        L75:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch: java.lang.Throwable -> L7a
        L79:
            throw r1     // Catch: java.lang.Throwable -> L7a
        L7a:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L7a
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager.getDownloadingModelStatusCode():java.lang.Integer");
    }

    public int getFailureReason(Long l2) {
        int columnIndex;
        DownloadManager downloadManager = this.zzf;
        Cursor cursorQuery = null;
        if (downloadManager != null && l2 != null) {
            cursorQuery = downloadManager.query(new DownloadManager.Query().setFilterById(l2.longValue()));
        }
        if (cursorQuery == null || !cursorQuery.moveToFirst() || (columnIndex = cursorQuery.getColumnIndex(DiscardedEvent.JsonKeys.REASON)) == -1) {
            return 0;
        }
        return cursorQuery.getInt(columnIndex);
    }

    public boolean isModelDownloadedAndValid() throws MlKitException {
        try {
            if (modelExistsLocally()) {
                return true;
            }
        } catch (MlKitException unused) {
            zza.d("ModelDownloadManager", "Failed to check if the model exist locally.");
        }
        Long downloadingId = getDownloadingId();
        String downloadingModelHash = getDownloadingModelHash();
        if (downloadingId == null || downloadingModelHash == null) {
            zza.d("ModelDownloadManager", "No new model is downloading.");
            removeOrCancelDownload();
            return false;
        }
        Integer downloadingModelStatusCode = getDownloadingModelStatusCode();
        GmsLogger gmsLogger = zza;
        new StringBuilder("Download Status code: ").append(downloadingModelStatusCode);
        gmsLogger.d("ModelDownloadManager", "Download Status code: ".concat(String.valueOf(downloadingModelStatusCode)));
        if (downloadingModelStatusCode != null) {
            return Objects.equal(downloadingModelStatusCode, 8) && zzi(downloadingModelHash) != null;
        }
        removeOrCancelDownload();
        return false;
    }

    public boolean modelExistsLocally() throws MlKitException {
        return this.zzk.modelExistsLocally(this.zzg.getUniqueModelNameForPersist(), this.zzh);
    }

    public synchronized void removeOrCancelDownload() throws MlKitException {
        DownloadManager downloadManager = this.zzf;
        Long downloadingId = getDownloadingId();
        if (downloadManager != null && downloadingId != null) {
            GmsLogger gmsLogger = zza;
            new StringBuilder("Cancel or remove existing downloading task: ").append(downloadingId);
            gmsLogger.d("ModelDownloadManager", "Cancel or remove existing downloading task: ".concat(downloadingId.toString()));
            if (this.zzf.remove(downloadingId.longValue()) > 0 || getDownloadingModelStatusCode() == null) {
                ModelFileHelper modelFileHelper = this.zzk;
                RemoteModel remoteModel = this.zzg;
                modelFileHelper.deleteTempFilesInPrivateFolder(remoteModel.getUniqueModelNameForPersist(), remoteModel.getModelType());
                this.zzj.clearDownloadingModelInfo(this.zzg);
            }
        }
    }

    public void setDownloadConditions(DownloadConditions downloadConditions) {
        Preconditions.checkNotNull(downloadConditions, "DownloadConditions can not be null");
        this.zzn = downloadConditions;
    }

    public synchronized void updateLatestModelHashAndType(String str) throws MlKitException {
        this.zzj.setLatestModelHash(this.zzg, str);
        removeOrCancelDownload();
    }

    final synchronized ModelInfo zzg() throws MlKitException {
        boolean zModelExistsLocally = modelExistsLocally();
        if (zModelExistsLocally) {
            zzsh zzshVar = this.zzi;
            RemoteModel remoteModel = this.zzg;
            zzshVar.zzf(zzsk.zzg(), remoteModel, zzmu.NO_ERROR, false, remoteModel.getModelType(), zzna.LIVE);
        }
        ModelInfoRetrieverInterop modelInfoRetrieverInterop = this.zzl;
        if (modelInfoRetrieverInterop == null) {
            throw new MlKitException("Please include com.google.mlkit:linkfirebase sdk as your dependency when you try to download from Firebase.", 14);
        }
        ModelInfo modelInfoRetrieveRemoteModelInfo = modelInfoRetrieverInterop.retrieveRemoteModelInfo(this.zzg);
        if (modelInfoRetrieveRemoteModelInfo == null) {
            return null;
        }
        MlKitContext mlKitContext = this.zze;
        RemoteModel remoteModel2 = this.zzg;
        String modelHash = modelInfoRetrieveRemoteModelInfo.getModelHash();
        SharedPrefManager sharedPrefManager = SharedPrefManager.getInstance(mlKitContext);
        boolean z2 = false;
        boolean z3 = true;
        if (modelHash.equals(sharedPrefManager.getIncompatibleModelHash(remoteModel2)) && CommonUtils.getAppVersion(mlKitContext.getApplicationContext()).equals(sharedPrefManager.getPreviousAppVersion())) {
            zza.e("ModelDownloadManager", "The model is incompatible with TFLite and the app is not upgraded, do not download");
            z3 = false;
        }
        if (!zModelExistsLocally) {
            this.zzj.clearLatestModelHash(this.zzg);
        }
        boolean zEquals = modelInfoRetrieveRemoteModelInfo.getModelHash().equals(SharedPrefManager.getInstance(this.zze).getLatestModelHash(this.zzg));
        boolean z4 = !zEquals;
        if (!z3) {
            z2 = z4;
        } else if (!zModelExistsLocally || !zEquals) {
            return modelInfoRetrieveRemoteModelInfo;
        }
        if (zModelExistsLocally && (z2 ^ z3)) {
            return null;
        }
        throw new MlKitException("The model " + this.zzg.getModelName() + " is incompatible with TFLite runtime", 100);
    }

    public final File zzi(String str) throws MlKitException {
        GmsLogger gmsLogger = zza;
        gmsLogger.d("ModelDownloadManager", "Model downloaded successfully");
        this.zzi.zzf(zzsk.zzg(), this.zzg, zzmu.NO_ERROR, true, this.zzh, zzna.SUCCEEDED);
        ParcelFileDescriptor downloadedFile = getDownloadedFile();
        if (downloadedFile == null) {
            removeOrCancelDownload();
            return null;
        }
        gmsLogger.d("ModelDownloadManager", "moving downloaded model from external storage to private folder.");
        try {
            return this.zzm.moveModelToPrivateFolder(downloadedFile, str, this.zzg);
        } finally {
            removeOrCancelDownload();
        }
    }
}
