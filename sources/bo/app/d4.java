package bo.app;

import com.braze.Braze;
import com.braze.support.BrazeLogger;
import com.braze.support.ValidationUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class d4 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Braze f458c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(Braze braze, String str, String str2) {
        super(0);
        this.f456a = str;
        this.f457b = str2;
        this.f458c = braze;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (ValidationUtils.isValidPushStoryClickInput(this.f456a, this.f457b)) {
            z9 z9Var = ba.f257g;
            String campaignId = this.f456a;
            Intrinsics.checkNotNull(campaignId);
            String pageId = this.f457b;
            Intrinsics.checkNotNull(pageId);
            z9Var.getClass();
            Intrinsics.checkNotNullParameter(campaignId, "campaignId");
            Intrinsics.checkNotNullParameter(pageId, "pageId");
            e00 e00VarA = z9Var.a(new q9(campaignId, pageId));
            if (e00VarA != null) {
                ((ci0) this.f458c.getUdm$android_sdk_base_release()).f403v.a(e00VarA);
            }
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this.f458c, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) c4.f314a, 6, (Object) null);
        }
        return Unit.INSTANCE;
    }
}
