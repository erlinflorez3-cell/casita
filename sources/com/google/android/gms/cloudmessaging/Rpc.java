package com.google.android.gms.cloudmessaging;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import com.dynatrace.android.agent.Global;
import com.google.android.gms.iid.InstanceID;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.Constants;
import io.sentry.protocol.App;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;

/* JADX INFO: loaded from: classes8.dex */
public class Rpc {
    private static int zza = 0;
    private static PendingIntent zzb = null;
    private static final Executor zzc = new Executor() { // from class: com.google.android.gms.cloudmessaging.zzy
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    };
    private static final Pattern zzd = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    private final SimpleArrayMap zze = new SimpleArrayMap();
    private final Context zzf;
    private final zzw zzg;
    private final ScheduledExecutorService zzh;
    private final Messenger zzi;
    private Messenger zzj;
    private zzd zzk;

    public Rpc(Context context) throws Throwable {
        this.zzf = context;
        this.zzg = new zzw(context);
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1561oA.Qd("z\u0007{\t\u0005}w@\u0001\u0004=Z|{{o{", (short) (C1499aX.Xd() ^ (-3291)))).getDeclaredMethod(C1593ug.zd("+*:\u0014)28\u0017;<>4B", (short) (C1580rY.Xd() ^ (-31628)), (short) (C1580rY.Xd() ^ (-13848))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            this.zzi = new Messenger(new zzae(this, (Looper) declaredMethod.invoke(null, objArr)));
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
            scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
            scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
            this.zzh = scheduledThreadPoolExecutor;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static /* synthetic */ Task zza(Bundle bundle) throws Exception {
        return zzi(bundle) ? Tasks.forResult(null) : Tasks.forResult(bundle);
    }

    static /* bridge */ /* synthetic */ void zzc(Rpc rpc, Message message) {
        if (message == null || !(message.obj instanceof Intent)) {
            return;
        }
        Intent intent = (Intent) message.obj;
        intent.setExtrasClassLoader(new zzc());
        if (intent.hasExtra("google.messenger")) {
            Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
            if (parcelableExtra instanceof zzd) {
                rpc.zzk = (zzd) parcelableExtra;
            }
            if (parcelableExtra instanceof Messenger) {
                rpc.zzj = (Messenger) parcelableExtra;
            }
        }
        Intent intent2 = (Intent) message.obj;
        String action = intent2.getAction();
        if (!Objects.equals(action, "com.google.android.c2dm.intent.REGISTRATION")) {
            if (Log.isLoggable("Rpc", 3)) {
                "Unexpected response action: ".concat(String.valueOf(action));
                return;
            }
            return;
        }
        String stringExtra = intent2.getStringExtra("registration_id");
        if (stringExtra == null) {
            stringExtra = intent2.getStringExtra("unregistered");
        }
        if (stringExtra != null) {
            Matcher matcher = zzd.matcher(stringExtra);
            if (!matcher.matches()) {
                if (Log.isLoggable("Rpc", 3)) {
                    "Unexpected response string: ".concat(stringExtra);
                    return;
                }
                return;
            }
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                Bundle extras = intent2.getExtras();
                extras.putString("registration_id", strGroup2);
                rpc.zzh(strGroup, extras);
                return;
            }
            return;
        }
        String stringExtra2 = intent2.getStringExtra("error");
        if (stringExtra2 == null) {
            "Unexpected response, no error or registration id ".concat(String.valueOf(String.valueOf(intent2.getExtras())));
            return;
        }
        if (Log.isLoggable("Rpc", 3)) {
            "Received InstanceID error ".concat(stringExtra2);
        }
        if (!stringExtra2.startsWith("|")) {
            synchronized (rpc.zze) {
                for (int i2 = 0; i2 < rpc.zze.size(); i2++) {
                    rpc.zzh((String) rpc.zze.keyAt(i2), intent2.getExtras());
                }
            }
            return;
        }
        String[] strArrSplit = stringExtra2.split("\\|");
        if (strArrSplit.length <= 2 || !Objects.equals(strArrSplit[1], "ID")) {
            "Unexpected structured response ".concat(stringExtra2);
            return;
        }
        String str = strArrSplit[2];
        String strSubstring = strArrSplit[3];
        if (strSubstring.startsWith(Global.COLON)) {
            strSubstring = strSubstring.substring(1);
        }
        rpc.zzh(str, intent2.putExtra("error", strSubstring).getExtras());
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x028c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.google.android.gms.tasks.Task zze(android.os.Bundle r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 824
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cloudmessaging.Rpc.zze(android.os.Bundle):com.google.android.gms.tasks.Task");
    }

    private static synchronized String zzf() {
        int i2;
        i2 = zza;
        zza = i2 + 1;
        return Integer.toString(i2);
    }

    private static synchronized void zzg(Context context, Intent intent) {
        if (zzb == null) {
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            zzb = PendingIntent.getBroadcast(context, 0, intent2, com.google.android.gms.internal.cloudmessaging.zza.zza);
        }
        intent.putExtra(App.TYPE, zzb);
    }

    private final void zzh(String str, Bundle bundle) {
        synchronized (this.zze) {
            TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.zze.remove(str);
            if (taskCompletionSource != null) {
                taskCompletionSource.setResult(bundle);
                return;
            }
            String str2 = "Missing callback for " + str;
        }
    }

    private static boolean zzi(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    public Task<CloudMessage> getProxiedNotificationData() {
        return this.zzg.zza() >= 241100000 ? zzv.zzb(this.zzf).zzd(5, Bundle.EMPTY).continueWith(zzc, new Continuation() { // from class: com.google.android.gms.cloudmessaging.zzab
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Intent intent = (Intent) ((Bundle) task.getResult()).getParcelable("notification_data");
                if (intent != null) {
                    return new CloudMessage(intent);
                }
                return null;
            }
        }) : Tasks.forException(new IOException(InstanceID.ERROR_SERVICE_NOT_AVAILABLE));
    }

    public Task<Void> messageHandled(CloudMessage cloudMessage) {
        if (this.zzg.zza() < 233700000) {
            return Tasks.forException(new IOException(InstanceID.ERROR_SERVICE_NOT_AVAILABLE));
        }
        Bundle bundle = new Bundle();
        bundle.putString(Constants.MessagePayloadKeys.MSGID, cloudMessage.getMessageId());
        Integer numZza = cloudMessage.zza();
        if (numZza != null) {
            bundle.putInt(Constants.MessagePayloadKeys.PRODUCT_ID, numZza.intValue());
        }
        return zzv.zzb(this.zzf).zzc(3, bundle);
    }

    public Task<Bundle> send(final Bundle bundle) {
        return this.zzg.zza() < 12000000 ? this.zzg.zzb() != 0 ? zze(bundle).continueWithTask(zzc, new Continuation() { // from class: com.google.android.gms.cloudmessaging.zzz
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return this.zza.zzb(bundle, task);
            }
        }) : Tasks.forException(new IOException(InstanceID.ERROR_MISSING_INSTANCEID_SERVICE)) : zzv.zzb(this.zzf).zzd(1, bundle).continueWith(zzc, new Continuation() { // from class: com.google.android.gms.cloudmessaging.zzaa
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) throws IOException {
                if (task.isSuccessful()) {
                    return (Bundle) task.getResult();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    "Error making request: ".concat(String.valueOf(String.valueOf(task.getException())));
                }
                throw new IOException(InstanceID.ERROR_SERVICE_NOT_AVAILABLE, task.getException());
            }
        });
    }

    public Task<Void> setRetainProxiedNotifications(boolean z2) {
        if (this.zzg.zza() < 241100000) {
            return Tasks.forException(new IOException(InstanceID.ERROR_SERVICE_NOT_AVAILABLE));
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("proxy_retention", z2);
        return zzv.zzb(this.zzf).zzc(4, bundle);
    }

    final /* synthetic */ Task zzb(Bundle bundle, Task task) throws Exception {
        return (task.isSuccessful() && zzi((Bundle) task.getResult())) ? zze(bundle).onSuccessTask(zzc, new SuccessContinuation() { // from class: com.google.android.gms.cloudmessaging.zzx
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return Rpc.zza((Bundle) obj);
            }
        }) : task;
    }

    final /* synthetic */ void zzd(String str, ScheduledFuture scheduledFuture, Task task) {
        synchronized (this.zze) {
            this.zze.remove(str);
        }
        scheduledFuture.cancel(false);
    }
}
