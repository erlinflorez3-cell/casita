package bo.app;

import com.braze.Braze;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.support.BrazeLogger;
import com.braze.support.ValidationUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes4.dex */
public final class u2 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Braze f1905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BrazeProperties f1906c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(String str, Braze braze, BrazeProperties brazeProperties) {
        super(0);
        this.f1904a = str;
        this.f1905b = braze;
        this.f1906c = brazeProperties;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v0, types: [T, java.lang.Object, java.lang.String] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? r2 = this.f1904a;
        objectRef.element = r2;
        if (ValidationUtils.isValidLogCustomEventInput(r2, ((ci0) this.f1905b.getUdm$android_sdk_base_release()).f389h)) {
            BrazeProperties brazeProperties = this.f1906c;
            if (brazeProperties == null || !brazeProperties.isInvalid()) {
                ?? eventName = ValidationUtils.ensureBrazeFieldLength((String) objectRef.element);
                objectRef.element = eventName;
                z9 z9Var = ba.f257g;
                BrazeProperties brazeProperties2 = this.f1906c;
                z9Var.getClass();
                Intrinsics.checkNotNullParameter(eventName, "eventName");
                e00 e00VarA = z9Var.a(new y8(eventName, brazeProperties2));
                if (e00VarA != null) {
                    if (this.f1905b.isEphemeralEventKey((String) objectRef.element) ? ((ci0) this.f1905b.getUdm$android_sdk_base_release()).f389h.y() : ((ci0) this.f1905b.getUdm$android_sdk_base_release()).f403v.a(e00VarA)) {
                        ((ci0) this.f1905b.getUdm$android_sdk_base_release()).f404w.b(new yn((String) objectRef.element, this.f1906c, e00VarA));
                    }
                }
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this.f1905b, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new t2(objectRef), 6, (Object) null);
            }
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this.f1905b, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new s2(objectRef), 6, (Object) null);
        }
        return Unit.INSTANCE;
    }
}
