package bo.app;

import com.braze.enums.CardKey;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class bn extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f293a = Boolean.TRUE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CardKey f294b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bn(CardKey cardKey) {
        super(0);
        this.f294b = cardKey;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Failed to update card json field to " + this.f293a + " with key: " + this.f294b;
    }
}
