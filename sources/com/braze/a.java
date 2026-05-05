package com.braze;

import android.content.Context;
import bo.app.ci0;
import bo.app.e50;
import bo.app.i70;
import bo.app.j0;
import bo.app.jr;
import bo.app.k0;
import bo.app.l0;
import bo.app.m0;
import bo.app.mz;
import bo.app.n0;
import bo.app.p00;
import bo.app.s60;
import bo.app.v00;
import bo.app.yy;
import bo.app.z00;
import com.amazon.device.messaging.development.ADMManifest;
import com.braze.Braze;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.support.BrazeLogger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Braze f2632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f2633b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Braze braze, Context context) {
        super(0);
        this.f2632a = braze;
        this.f2633b = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f2632a.applyPendingRuntimeConfiguration$android_sdk_base_release();
        this.f2632a.setConfigurationProvider$android_sdk_base_release(new BrazeConfigurationProvider(this.f2632a.applicationContext));
        Braze braze = this.f2632a;
        Braze.Companion companion = Braze.Companion;
        String configuredApiKey = companion.getConfiguredApiKey(braze.getConfigurationProvider$android_sdk_base_release());
        braze.setApiKeyPresent$android_sdk_base_release(Boolean.valueOf(!(configuredApiKey == null || StringsKt.isBlank(configuredApiKey))));
        BrazeLogger.setInitialLogLevelFromConfiguration(this.f2632a.getConfigurationProvider$android_sdk_base_release().getLoggerInitialLogLevel());
        z00 z00Var = null;
        BrazeLogger.checkForSystemLogLevelProperty$default(false, 1, null);
        if (companion.getSdkEnablementProvider(this.f2633b).a()) {
            companion.setOutboundNetworkRequestsOffline(true);
        }
        String str = this.f2632a.getConfigurationProvider$android_sdk_base_release().getBrazeApiKey().f1746a;
        Braze braze2 = this.f2632a;
        braze2.setPushDeliveryManager$android_sdk_base_release(new s60(braze2.applicationContext, str));
        Braze braze3 = this.f2632a;
        braze3.setDeviceIdProvider$android_sdk_base_release(new jr(braze3.applicationContext, str));
        Braze braze4 = this.f2632a;
        braze4.offlineUserStorageProvider = new e50(braze4.applicationContext);
        Braze braze5 = this.f2632a;
        braze5.registrationDataProvider = new i70(braze5.applicationContext, this.f2632a.getConfigurationProvider$android_sdk_base_release());
        String customEndpoint = this.f2632a.getConfigurationProvider$android_sdk_base_release().getCustomEndpoint();
        if (customEndpoint != null && !StringsKt.isBlank(customEndpoint)) {
            companion.setConfiguredCustomEndpoint$android_sdk_base_release(this.f2632a.getConfigurationProvider$android_sdk_base_release().getCustomEndpoint());
        }
        try {
            if (this.f2632a.getConfigurationProvider$android_sdk_base_release().isFirebaseCloudMessagingRegistrationEnabled()) {
                Context context = this.f2633b;
                z00 z00Var2 = this.f2632a.registrationDataProvider;
                if (z00Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("registrationDataProvider");
                    z00Var2 = null;
                }
                mz mzVar = new mz(context, z00Var2);
                if (!com.braze.support.h.a(context)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) mzVar, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) yy.f2334a, 6, (Object) null);
                } else if (((Boolean) mzVar.f1326c.getValue()).booleanValue() || ((Boolean) mzVar.f1325b.getValue()).booleanValue()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this.f2632a, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) bo.app.g0.f695a, 6, (Object) null);
                    String firebaseCloudMessagingSenderIdKey = this.f2632a.getConfigurationProvider$android_sdk_base_release().getFirebaseCloudMessagingSenderIdKey();
                    if (firebaseCloudMessagingSenderIdKey != null) {
                        mzVar.a(firebaseCloudMessagingSenderIdKey);
                    }
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this.f2632a, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) bo.app.h0.f790a, 6, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this.f2632a, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) bo.app.i0.f861a, 6, (Object) null);
            }
            if (this.f2632a.getConfigurationProvider$android_sdk_base_release().isAdmMessagingRegistrationEnabled()) {
                bo.app.i iVar = bo.app.l.f1149c;
                Context context2 = this.f2632a.applicationContext;
                Intrinsics.checkNotNullParameter(context2, "context");
                try {
                    Class.forName("com.amazon.device.messaging.ADM");
                    try {
                        ADMManifest.checkManifestAuthoredProperly(context2);
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this.f2632a, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) j0.f963a, 6, (Object) null);
                        Context context3 = this.f2632a.applicationContext;
                        z00 z00Var3 = this.f2632a.registrationDataProvider;
                        if (z00Var3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("registrationDataProvider");
                            z00Var3 = null;
                        }
                        new bo.app.l(context3, z00Var3).a();
                    } catch (Exception e2) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) iVar, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new bo.app.h(e2), 6, (Object) null);
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this.f2632a, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) k0.f1042a, 6, (Object) null);
                    }
                } catch (Exception unused) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) iVar, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) bo.app.g.f694a, 6, (Object) null);
                }
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this.f2632a, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) l0.f1152a, 6, (Object) null);
            }
            this.f2632a.verifyProperSdkSetup();
        } catch (Exception e3) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this.f2632a, BrazeLogger.Priority.E, (Throwable) e3, false, (Function0) m0.f1242a, 4, (Object) null);
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        Braze braze6 = this.f2632a;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) braze6, priority, (Throwable) null, false, (Function0) n0.f1329a, 6, (Object) null);
        try {
            Braze braze7 = this.f2632a;
            Context context4 = braze7.applicationContext;
            e50 e50Var = this.f2632a.offlineUserStorageProvider;
            if (e50Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("offlineUserStorageProvider");
                e50Var = null;
            }
            BrazeConfigurationProvider configurationProvider$android_sdk_base_release = this.f2632a.getConfigurationProvider$android_sdk_base_release();
            v00 externalIEventMessenger$android_sdk_base_release = this.f2632a.getExternalIEventMessenger$android_sdk_base_release();
            p00 deviceIdProvider$android_sdk_base_release = this.f2632a.getDeviceIdProvider$android_sdk_base_release();
            z00 z00Var4 = this.f2632a.registrationDataProvider;
            if (z00Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("registrationDataProvider");
            } else {
                z00Var = z00Var4;
            }
            braze7.setUserSpecificMemberVariablesAndStartDispatch(new ci0(context4, e50Var, configurationProvider$android_sdk_base_release, externalIEventMessenger$android_sdk_base_release, deviceIdProvider$android_sdk_base_release, z00Var, this.f2632a.getPushDeliveryManager$android_sdk_base_release(), Braze.shouldMockNetworkRequestsAndDropEvents, Braze.areOutboundNetworkRequestsOffline, this.f2632a.getDeviceDataProvider(), Braze.Companion.getShouldRequestFrameworkListenToNetworkUpdates$android_sdk_base_release()));
            BrazeLogger.brazelog$default(brazeLogger, (Object) this.f2632a, priority, (Throwable) null, false, (Function0) bo.app.d0.f446a, 6, (Object) null);
        } catch (Exception e4) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this.f2632a, BrazeLogger.Priority.E, (Throwable) e4, false, (Function0) bo.app.e0.f533a, 4, (Object) null);
            this.f2632a.publishError(e4);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this.f2632a, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) bo.app.f0.f601a, 6, (Object) null);
        return Unit.INSTANCE;
    }
}
