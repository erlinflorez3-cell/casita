package v0;

import android.app.Application;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import androidx.core.content.ContextCompat;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: loaded from: classes2.dex */
public final class civilian {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f28355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f28356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Mutex f28357c = MutexKt.Mutex(true);

    public civilian(Application application, CoroutineScope coroutineScope) {
        this.f28355a = application;
        this.f28356b = coroutineScope;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof v0.apparatus
            if (r0 == 0) goto L2b
            r6 = r8
            v0.apparatus r6 = (v0.apparatus) r6
            int r3 = r6.f28354d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = (-1) - r3
            int r0 = (-1) - r2
            r1 = r1 | r0
            int r0 = (-1) - r1
            if (r0 == 0) goto L2b
            int r3 = r3 - r2
            r6.f28354d = r3
        L17:
            java.lang.Object r5 = r6.f28352b
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r6.f28354d
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L39
            if (r0 != r3) goto L31
            kotlinx.coroutines.sync.Mutex r1 = r6.f28351a
            kotlin.ResultKt.throwOnFailure(r5)
            goto L51
        L2b:
            v0.apparatus r6 = new v0.apparatus
            r6.<init>(r7, r8)
            goto L17
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L39:
            kotlin.ResultKt.throwOnFailure(r5)
            kotlinx.coroutines.sync.Mutex r0 = r7.f28357c
            boolean r0 = r0.isLocked()
            if (r0 == 0) goto L5c
            kotlinx.coroutines.sync.Mutex r1 = r7.f28357c
            r6.f28351a = r1
            r6.f28354d = r3
            java.lang.Object r0 = r1.lock(r2, r6)
            if (r0 != r4) goto L51
            return r4
        L51:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L54
            goto L59
        L54:
            r0 = move-exception
            r1.unlock(r2)
            throw r0
        L59:
            r1.unlock(r2)
        L5c:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.civilian.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void a() {
        NetworkCapabilities networkCapabilities;
        List listListOf = Build.VERSION.SDK_INT >= 35 ? CollectionsKt.listOf((Object[]) new Integer[]{0, 1, 3, 10}) : CollectionsKt.listOf((Object[]) new Integer[]{0, 1, 3});
        ConnectivityManager connectivityManager = (ConnectivityManager) ContextCompat.getSystemService(this.f28355a, ConnectivityManager.class);
        if (connectivityManager == null) {
            return;
        }
        tongue tongueVar = new tongue(listListOf, this);
        connectivityManager.registerDefaultNetworkCallback(tongueVar);
        BuildersKt__Builders_commonKt.launch$default(this.f28356b, null, null, new pair(null), 3, null).invokeOnCompletion(new superior(connectivityManager, tongueVar, this));
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return;
        }
        if ((listListOf instanceof Collection) && listListOf.isEmpty()) {
            return;
        }
        Iterator it = listListOf.iterator();
        while (it.hasNext()) {
            if (networkCapabilities.hasTransport(((Number) it.next()).intValue())) {
                try {
                    Mutex.DefaultImpls.unlock$default(this.f28357c, null, 1, null);
                    return;
                } catch (IllegalStateException unused) {
                    return;
                }
            }
        }
    }
}
