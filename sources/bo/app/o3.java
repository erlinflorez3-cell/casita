package bo.app;

import com.braze.Braze;
import com.braze.support.BrazeLogger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o3 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Braze f1413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1414b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(Braze braze, String str) {
        super(0);
        this.f1413a = braze;
        this.f1414b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        tf tfVar = ((ci0) this.f1413a.getUdm$android_sdk_base_release()).f403v;
        String campaignId = this.f1414b;
        tfVar.getClass();
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) tfVar, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) bf.f274a, 7, (Object) null);
        tfVar.f1847j.a(campaignId);
        return Unit.INSTANCE;
    }
}
