package com.google.android.gms.internal.mlkit_vision_object_detection_bundled;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.drew.metadata.iptc.IptcDirectory;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.Xg;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
public final class zzwa {
    public static final long zza;
    private static final ExecutorService zzb;
    private static final ExecutorService zzc;
    private static zzwa zzd = null;
    private final Executor zze;
    private final Executor zzf;
    private final zzuk zzg;
    private final zzvu zzh;
    private volatile zzat zzi;
    private volatile zzat zzj;
    private final Map zzk;
    private final zzwf zzl;
    private final zzwd zzm;
    private String zzn;

    static {
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(hg.Vd("XNbL\u0018^\\PR\u0013GRPDUQPBJO\b\u001eP<9JHBDD", (short) (C1499aX.Xd() ^ (-10301)), (short) (C1499aX.Xd() ^ (-7902)))).getDeclaredMethod(C1561oA.ud("!\u0017(\u0003\u0018\u001c\u0014\u0018\u0010}\u0011\u001a\f\u0007\th\u001b\u0007\u0004\u0015\u0013\r\u000f", (short) (Od.Xd() ^ (-10352))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            zzb = (ExecutorService) declaredMethod.invoke(null, objArr);
            Object[] objArr2 = new Object[0];
            Method declaredMethod2 = Class.forName(C1561oA.yd("\u0002y\fwA\n\u0006{\fN\u0001\u000e\n\u007f\u000f\rymsz1Iygr\u0006\u0002}}\u007f", (short) (FB.Xd() ^ 28581))).getDeclaredMethod(C1561oA.Yd("3+>\u001b28282\"7B637\u0019M;:MMIM", (short) (FB.Xd() ^ IptcDirectory.TAG_TIME_SENT)), new Class[0]);
            try {
                declaredMethod2.setAccessible(true);
                zzc = (ExecutorService) declaredMethod2.invoke(null, objArr2);
                zza = TimeUnit.HOURS.toSeconds(12L);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private zzwa(Context context, zzuk zzukVar, zzwd zzwdVar, zzuj zzujVar) throws Throwable {
        ExecutorService executorService = zzb;
        ExecutorService executorService2 = zzc;
        this.zzk = new TreeMap();
        Object[] objArr = new Object[0];
        Method method = Class.forName(Xg.qd("[i`omhd/erryku|7Mzz\u0002s\b\u0005", (short) (FB.Xd() ^ 7596), (short) (FB.Xd() ^ 8090))).getMethod(Jg.Wd("t6z\u000f\u0014W\u0011Md&n+\u0007I[Gc+S0\u007f", (short) (C1607wl.Xd() ^ 17075), (short) (C1607wl.Xd() ^ 21278)), new Class[0]);
        try {
            method.setAccessible(true);
            method.invoke(context, objArr);
            this.zzg = zzukVar;
            this.zze = executorService;
            this.zzf = executorService2;
            this.zzm = zzwdVar;
            this.zzh = new zzvu(context, zzujVar.zzb(), zzujVar.zza(), ZO.xd("\u00069J>vCb>", (short) (OY.Xd() ^ 25644), (short) (OY.Xd() ^ 15082)), 5L, 5L, zzwdVar);
            this.zzl = new zzwf(context);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static synchronized zzwa zzf(Context context) {
        if (zzd == null) {
            zzd = new zzwa(context, zzuk.zzb(context), new zzwd(context), zzur.zza);
        }
        return zzd;
    }

    private final Pair zzl(zzum zzumVar, boolean z2) {
        zzvt zzvtVarZza = this.zzl.zza(zzumVar);
        if (zzvtVarZza == null) {
            return null;
        }
        JSONObject jSONObjectZzc = zzvtVarZza.zzc();
        try {
            zzat zzatVarZzm = zzm(jSONObjectZzc);
            this.zzj = zzatVarZzm;
            if (z2) {
                zzum zzumVar2 = new zzum();
                zzumVar2.zzg();
                this.zzi = this.zzj;
                zzumVar2.zze();
                this.zzm.zzb(zzumVar2);
            }
            zzumVar.zzh();
            return Pair.create(zzatVarZzm, zzvtVarZza.zzb());
        } catch (JSONException e2) {
            zzumVar.zzc(zzsw.FILE_READ_RETURNED_MALFORMED_DATA);
            "Saved remote config setting has invalid format: ".concat(String.valueOf(String.valueOf(jSONObjectZzc)));
            return null;
        }
    }

    public static zzat zzm(JSONObject jSONObject) throws JSONException {
        String string;
        zzvx zzvxVar = new zzvx(jSONObject);
        zzas zzasVar = new zzas();
        Iterator<String> itKeys = zzvxVar.zza.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                String string2 = jSONObject.getString(next);
                if (string2 == null) {
                    string = null;
                } else if (string2.isEmpty()) {
                    string = "";
                } else {
                    string = new JSONObject("{ \"value\": " + string2 + " }").getString("value");
                }
                zzasVar.zza(next, string);
            } catch (JSONException e2) {
                String str = "Getting JSON string value for remote config key " + next + " failed";
                throw e2;
            }
        }
        return zzasVar.zzb();
    }

    public final Task zza(final long j2) {
        final Date date = new Date(System.currentTimeMillis());
        final zzum zzumVar = new zzum();
        zzumVar.zzg();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        final boolean z2 = false;
        this.zzf.execute(new Runnable(date, j2, zzumVar, z2, taskCompletionSource) { // from class: com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzvy
            public final /* synthetic */ Date zzb;
            public final /* synthetic */ long zzc;
            public final /* synthetic */ zzum zzd;
            public final /* synthetic */ TaskCompletionSource zze;

            {
                this.zze = taskCompletionSource;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzi(this.zzb, this.zzc, this.zzd, false, this.zze);
            }
        });
        return taskCompletionSource.getTask();
    }

    public final Task zzb() {
        final zzum zzumVar = new zzum();
        zzumVar.zzg();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        final boolean z2 = true;
        this.zze.execute(new Runnable(zzumVar, z2, taskCompletionSource) { // from class: com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzvw
            public final /* synthetic */ zzum zzb;
            public final /* synthetic */ TaskCompletionSource zzc;

            {
                this.zzc = taskCompletionSource;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzj(this.zzb, true, this.zzc);
            }
        });
        return taskCompletionSource.getTask();
    }

    public final String zzh(String str) {
        String str2;
        zzat zzatVar = this.zzi;
        if (zzatVar != null && zzatVar.containsKey("vision_object_detection_enable_acceleration")) {
            return (String) zzatVar.get("vision_object_detection_enable_acceleration");
        }
        synchronized (this.zzk) {
            str2 = (String) this.zzk.get("vision_object_detection_enable_acceleration");
        }
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final /* synthetic */ void zzi(java.util.Date r8, long r9, com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzum r11, boolean r12, com.google.android.gms.tasks.TaskCompletionSource r13) {
        /*
            r7 = this;
            java.lang.String r0 = "MLKit RemoteConfigRestC"
            r0 = 0
            android.util.Pair r0 = r7.zzl(r11, r0)     // Catch: com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzwc -> L83 java.lang.InterruptedException -> L85 java.lang.RuntimeException -> L87 java.lang.Throwable -> L96
            r2 = 0
            if (r0 != 0) goto Lb
            goto L2b
        Lb:
            java.lang.Object r3 = r0.first     // Catch: com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzwc -> L83 java.lang.InterruptedException -> L85 java.lang.RuntimeException -> L87 java.lang.Throwable -> L96
            com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzat r3 = (com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzat) r3     // Catch: com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzwc -> L83 java.lang.InterruptedException -> L85 java.lang.RuntimeException -> L87 java.lang.Throwable -> L96
            java.lang.Object r0 = r0.second     // Catch: com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzwc -> L83 java.lang.InterruptedException -> L85 java.lang.RuntimeException -> L87 java.lang.Throwable -> L96
            java.util.Date r0 = (java.util.Date) r0     // Catch: com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzwc -> L83 java.lang.InterruptedException -> L85 java.lang.RuntimeException -> L87 java.lang.Throwable -> L96
            java.util.Date r6 = new java.util.Date     // Catch: com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzwc -> L83 java.lang.InterruptedException -> L85 java.lang.RuntimeException -> L87 java.lang.Throwable -> L96
            long r0 = r0.getTime()     // Catch: com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzwc -> L83 java.lang.InterruptedException -> L85 java.lang.RuntimeException -> L87 java.lang.Throwable -> L96
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch: com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzwc -> L83 java.lang.InterruptedException -> L85 java.lang.RuntimeException -> L87 java.lang.Throwable -> L96
            long r4 = r4.toMillis(r9)     // Catch: com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzwc -> L83 java.lang.InterruptedException -> L85 java.lang.RuntimeException -> L87 java.lang.Throwable -> L96
            long r0 = r0 + r4
            r6.<init>(r0)     // Catch: com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzwc -> L83 java.lang.InterruptedException -> L85 java.lang.RuntimeException -> L87 java.lang.Throwable -> L96
            boolean r0 = r8.after(r6)     // Catch: com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzwc -> L83 java.lang.InterruptedException -> L85 java.lang.RuntimeException -> L87 java.lang.Throwable -> L96
            if (r0 == 0) goto L2c
            java.lang.String r0 = "Saved remote config is past its expiration time."
        L2b:
            r3 = r2
        L2c:
            if (r3 != 0) goto L77
            java.lang.String r0 = "Getting installation id..."
            com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzuk r0 = r7.zzg     // Catch: java.io.IOException -> L6e com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzwc -> L83 java.lang.InterruptedException -> L85 java.lang.RuntimeException -> L87 java.lang.Throwable -> L96
            r0.zzd()     // Catch: java.io.IOException -> L6e com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzwc -> L83 java.lang.InterruptedException -> L85 java.lang.RuntimeException -> L87 java.lang.Throwable -> L96
            java.lang.String r0 = "Got installation id. Checking temporary token for expiry..."
            com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzuk r0 = r7.zzg     // Catch: com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzwc -> L83 java.lang.InterruptedException -> L85 java.lang.RuntimeException -> L87 java.lang.Throwable -> L96
            java.lang.String r1 = r0.zzc()     // Catch: com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzwc -> L83 java.lang.InterruptedException -> L85 java.lang.RuntimeException -> L87 java.lang.Throwable -> L96
            java.lang.String r0 = "Got valid temporary auth token. Fetching remote config..."
            com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzvz r4 = new com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzvz     // Catch: com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzwc -> L83 java.lang.InterruptedException -> L85 java.lang.RuntimeException -> L87 java.lang.Throwable -> L96
            r4.<init>(r7, r1, r8, r11)     // Catch: com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzwc -> L83 java.lang.InterruptedException -> L85 java.lang.RuntimeException -> L87 java.lang.Throwable -> L96
            boolean r0 = com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzwj.zza(r4)     // Catch: com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzwc -> L83 java.lang.InterruptedException -> L85 java.lang.RuntimeException -> L87 java.lang.Throwable -> L96
            if (r0 != 0) goto L50
            com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzsw r0 = com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzsw.RPC_EXPONENTIAL_BACKOFF_FAILED     // Catch: com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzwc -> L83 java.lang.InterruptedException -> L85 java.lang.RuntimeException -> L87 java.lang.Throwable -> L96
            r11.zzd(r0)     // Catch: com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzwc -> L83 java.lang.InterruptedException -> L85 java.lang.RuntimeException -> L87 java.lang.Throwable -> L96
            goto L76
        L50:
            com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzat r3 = r4.zzb()     // Catch: com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzwc -> L83 java.lang.InterruptedException -> L85 java.lang.RuntimeException -> L87 java.lang.Throwable -> L96
            java.lang.String r0 = java.lang.String.valueOf(r3)     // Catch: com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzwc -> L83 java.lang.InterruptedException -> L85 java.lang.RuntimeException -> L87 java.lang.Throwable -> L96
            java.lang.String r1 = "writeAndSetFetchedConfig: "
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzwc -> L83 java.lang.InterruptedException -> L85 java.lang.RuntimeException -> L87 java.lang.Throwable -> L96
            java.lang.String r0 = r1.concat(r0)     // Catch: com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzwc -> L83 java.lang.InterruptedException -> L85 java.lang.RuntimeException -> L87 java.lang.Throwable -> L96
            com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzwf r1 = r7.zzl     // Catch: com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzwc -> L83 java.lang.InterruptedException -> L85 java.lang.RuntimeException -> L87 java.lang.Throwable -> L96
            com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzvt r0 = r4.zzc()     // Catch: com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzwc -> L83 java.lang.InterruptedException -> L85 java.lang.RuntimeException -> L87 java.lang.Throwable -> L96
            r1.zzb(r0, r11)     // Catch: com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzwc -> L83 java.lang.InterruptedException -> L85 java.lang.RuntimeException -> L87 java.lang.Throwable -> L96
            r7.zzj = r3     // Catch: com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzwc -> L83 java.lang.InterruptedException -> L85 java.lang.RuntimeException -> L87 java.lang.Throwable -> L96
            goto L77
        L6e:
            r0 = move-exception
            com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzsw r0 = com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzsw.UNKNOWN_ERROR     // Catch: com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzwc -> L83 java.lang.InterruptedException -> L85 java.lang.RuntimeException -> L87 java.lang.Throwable -> L96
            r11.zzd(r0)     // Catch: com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzwc -> L83 java.lang.InterruptedException -> L85 java.lang.RuntimeException -> L87 java.lang.Throwable -> L96
            java.lang.String r0 = "Initializing installation id failed"
        L76:
            r3 = r2
        L77:
            if (r3 != 0) goto L7a
            goto L7d
        L7a:
            java.lang.String r0 = "Got remote config."
            goto L7f
        L7d:
            java.lang.String r0 = "Remote config was null!"
        L7f:
            r13.setResult(r2)     // Catch: com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzwc -> L83 java.lang.InterruptedException -> L85 java.lang.RuntimeException -> L87 java.lang.Throwable -> L96
            goto L8d
        L83:
            r1 = move-exception
            goto L88
        L85:
            r1 = move-exception
            goto L88
        L87:
            r1 = move-exception
        L88:
            java.lang.String r0 = "Fetch failed"
            r13.setException(r1)     // Catch: java.lang.Throwable -> L96
        L8d:
            r11.zze()
            com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzwd r0 = r7.zzm
            r0.zzc(r11)
            return
        L96:
            r1 = move-exception
            r11.zze()
            com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzwd r0 = r7.zzm
            r0.zzc(r11)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzwa.zzi(java.util.Date, long, com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzum, boolean, com.google.android.gms.tasks.TaskCompletionSource):void");
    }

    final /* synthetic */ void zzj(zzum zzumVar, boolean z2, TaskCompletionSource taskCompletionSource) {
        try {
            try {
                if (zzl(zzumVar, true) == null) {
                }
                taskCompletionSource.setResult(null);
            } catch (RuntimeException e2) {
                taskCompletionSource.setException(e2);
            }
        } finally {
            zzumVar.zze();
            this.zzm.zze(zzumVar);
        }
    }

    public final void zzk(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.zzn = str;
    }
}
