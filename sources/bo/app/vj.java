package bo.app;

import com.braze.enums.Gender;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class vj extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Gender f2051a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vj(Gender gender) {
        super(0);
        this.f2051a = gender;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Failed to set gender to: " + this.f2051a;
    }
}
