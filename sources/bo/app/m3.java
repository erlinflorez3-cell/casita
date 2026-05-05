package bo.app;

import com.braze.Braze;
import com.braze.support.BrazeLogger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class m3 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Braze f1247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f1249c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(Braze braze, String str, long j2) {
        super(0);
        this.f1247a = braze;
        this.f1248b = str;
        this.f1249c = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        tf tfVar = ((ci0) this.f1247a.getUdm$android_sdk_base_release()).f403v;
        String campaignId = this.f1248b;
        tfVar.getClass();
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) tfVar, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new af(campaignId), 7, (Object) null);
        tfVar.f1848k.a(campaignId);
        this.f1247a.schedulePushDelivery$android_sdk_base_release(this.f1249c);
        return Unit.INSTANCE;
    }
}
