package bo.app;

import android.content.Context;
import com.braze.support.BrazeLogger;
import com.braze.support.ReflectionUtils;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class mz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z00 f1324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f1325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f1326c;

    public mz(Context context, z00 registrationDataProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(registrationDataProvider, "registrationDataProvider");
        this.f1324a = registrationDataProvider;
        this.f1325b = LazyKt.lazy(zy.f2444a);
        this.f1326c = LazyKt.lazy(az.f229a);
    }

    public static final void a(mz this$0, Task task) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(task, "task");
        if (!task.isSuccessful()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this$0, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new bz(task), 6, (Object) null);
            return;
        }
        String str = (String) task.getResult();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this$0, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new cz(str), 6, (Object) null);
        ((i70) this$0.f1324a).a(str);
    }

    public final void a(String firebaseSenderId) {
        Intrinsics.checkNotNullParameter(firebaseSenderId, "firebaseSenderId");
        try {
            if (((Boolean) this.f1326c.getValue()).booleanValue()) {
                FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new OnCompleteListener() { // from class: bo.app.mz$$ExternalSyntheticLambda0
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        mz.a(this.f$0, task);
                    }
                });
            } else if (((Boolean) this.f1325b.getValue()).booleanValue()) {
                b(firebaseSenderId);
            }
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) dz.f529a, 4, (Object) null);
        }
    }

    public final void b(String str) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new ez(str), 6, (Object) null);
        try {
            Method methodQuietly = ReflectionUtils.getMethodQuietly("com.google.firebase.iid.FirebaseInstanceId", "getInstance", (Class<?>[]) new Class[0]);
            if (methodQuietly == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) fz.f693a, 7, (Object) null);
                return;
            }
            Pair<Boolean, Object> pairInvokeMethodQuietly = ReflectionUtils.invokeMethodQuietly(null, methodQuietly, new Object[0]);
            if (!pairInvokeMethodQuietly.getFirst().booleanValue()) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) gz.f788a, 7, (Object) null);
                return;
            }
            Object second = pairInvokeMethodQuietly.getSecond();
            if (second == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) hz.f860a, 7, (Object) null);
                return;
            }
            Method methodQuietly2 = ReflectionUtils.getMethodQuietly(second.getClass(), "getToken", (Class<?>[]) new Class[]{String.class, String.class});
            if (methodQuietly2 == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) iz.f961a, 7, (Object) null);
                return;
            }
            Pair<Boolean, Object> pairInvokeMethodQuietly2 = ReflectionUtils.invokeMethodQuietly(second, methodQuietly2, str, FirebaseMessaging.INSTANCE_ID_SCOPE);
            if (!pairInvokeMethodQuietly2.getFirst().booleanValue()) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) jz.f1040a, 7, (Object) null);
                return;
            }
            Object second2 = pairInvokeMethodQuietly2.getSecond();
            if (second2 instanceof String) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new kz(second2), 6, (Object) null);
                ((i70) this.f1324a).a((String) second2);
            }
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) lz.f1241a, 4, (Object) null);
        }
    }
}
