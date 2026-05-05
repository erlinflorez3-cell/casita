package com.braze;

import android.content.Context;
import bo.app.b1;
import bo.app.bi0;
import bo.app.c1;
import bo.app.ci0;
import bo.app.e1;
import bo.app.e50;
import bo.app.f1;
import bo.app.g1;
import bo.app.i1;
import bo.app.j1;
import bo.app.l10;
import bo.app.oe;
import bo.app.p00;
import bo.app.tf;
import bo.app.v00;
import bo.app.vw;
import bo.app.z00;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.FeedUpdatedEvent;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.StringUtils;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Braze f2655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f2656c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(Braze braze, String str, String str2) {
        super(0);
        this.f2654a = str;
        this.f2655b = braze;
        this.f2656c = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str = this.f2654a;
        if (str == null || str.length() == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this.f2655b, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) b1.f234a, 6, (Object) null);
        } else if (StringUtils.getByteSize(this.f2654a) > 997) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this.f2655b, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new c1(this.f2654a), 6, (Object) null);
        } else {
            BrazeUser brazeUser = this.f2655b.brazeUser;
            if (brazeUser == null) {
                Intrinsics.throwUninitializedPropertyAccessException("brazeUser");
                brazeUser = null;
            }
            String userId = brazeUser.getUserId();
            if (Intrinsics.areEqual(userId, this.f2654a)) {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.brazelog$default(brazeLogger, (Object) this.f2655b, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new e1(this.f2654a), 6, (Object) null);
                String str2 = this.f2656c;
                if (str2 != null && !StringsKt.isBlank(str2)) {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) this.f2655b, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new f1(this.f2656c), 7, (Object) null);
                    ((ci0) this.f2655b.getUdm$android_sdk_base_release()).f399r.a(this.f2656c);
                }
            } else {
                vw vwVar = ((ci0) this.f2655b.getUdm$android_sdk_base_release()).f392k;
                ReentrantLock reentrantLock = vwVar.f2080g;
                reentrantLock.lock();
                try {
                    reentrantLock.unlock();
                    ((ci0) this.f2655b.getUdm$android_sdk_base_release()).f398q.b();
                    if (Intrinsics.areEqual(userId, "")) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this.f2655b, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new g1(this.f2654a), 6, (Object) null);
                        e50 e50Var = this.f2655b.offlineUserStorageProvider;
                        if (e50Var == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("offlineUserStorageProvider");
                            e50Var = null;
                        }
                        e50Var.a(this.f2654a);
                        BrazeUser brazeUser2 = this.f2655b.brazeUser;
                        if (brazeUser2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("brazeUser");
                            brazeUser2 = null;
                        }
                        brazeUser2.setUserId(this.f2654a);
                    } else {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this.f2655b, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new i1(userId, this.f2654a), 6, (Object) null);
                        ((vw) this.f2655b.getExternalIEventMessenger$android_sdk_base_release()).b(FeedUpdatedEvent.class, new FeedUpdatedEvent(new ArrayList(), this.f2654a, false, DateTimeUtils.nowInSeconds()));
                    }
                    tf tfVar = ((ci0) this.f2655b.getUdm$android_sdk_base_release()).f403v;
                    if (tfVar.f1846i.f1095a.getBoolean("appboy_sdk_disabled", false)) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) tfVar, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) oe.f1439a, 6, (Object) null);
                    } else {
                        tfVar.f1858u = null;
                        tfVar.f1840c.g();
                    }
                    ((ci0) this.f2655b.getUdm$android_sdk_base_release()).f393l.a();
                    e50 e50Var2 = this.f2655b.offlineUserStorageProvider;
                    if (e50Var2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("offlineUserStorageProvider");
                        e50Var2 = null;
                    }
                    e50Var2.a(this.f2654a);
                    l10 udm$android_sdk_base_release = this.f2655b.getUdm$android_sdk_base_release();
                    Context context = this.f2655b.applicationContext;
                    e50 e50Var3 = this.f2655b.offlineUserStorageProvider;
                    if (e50Var3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("offlineUserStorageProvider");
                        e50Var3 = null;
                    }
                    BrazeConfigurationProvider configurationProvider$android_sdk_base_release = this.f2655b.getConfigurationProvider$android_sdk_base_release();
                    v00 externalIEventMessenger$android_sdk_base_release = this.f2655b.getExternalIEventMessenger$android_sdk_base_release();
                    p00 deviceIdProvider$android_sdk_base_release = this.f2655b.getDeviceIdProvider$android_sdk_base_release();
                    z00 z00Var = this.f2655b.registrationDataProvider;
                    if (z00Var == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("registrationDataProvider");
                        z00Var = null;
                    }
                    this.f2655b.setUserSpecificMemberVariablesAndStartDispatch(new ci0(context, e50Var3, configurationProvider$android_sdk_base_release, externalIEventMessenger$android_sdk_base_release, deviceIdProvider$android_sdk_base_release, z00Var, this.f2655b.getPushDeliveryManager$android_sdk_base_release(), Braze.shouldMockNetworkRequestsAndDropEvents, Braze.areOutboundNetworkRequestsOffline, this.f2655b.getDeviceDataProvider(), Braze.Companion.getShouldRequestFrameworkListenToNetworkUpdates$android_sdk_base_release()));
                    String str3 = this.f2656c;
                    if (str3 != null && !StringsKt.isBlank(str3)) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this.f2655b, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new j1(this.f2656c), 7, (Object) null);
                        ((ci0) this.f2655b.getUdm$android_sdk_base_release()).f399r.a(this.f2656c);
                    }
                    ((ci0) this.f2655b.getUdm$android_sdk_base_release()).x().d();
                    ((ci0) this.f2655b.getUdm$android_sdk_base_release()).f403v.b();
                    ci0 ci0Var = (ci0) udm$android_sdk_base_release;
                    ci0Var.getClass();
                    BuildersKt__Builders_commonKt.launch$default(BrazeCoroutineScope.INSTANCE, null, null, new bi0(ci0Var, null), 3, null);
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
