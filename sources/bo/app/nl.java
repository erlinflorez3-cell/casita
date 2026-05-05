package bo.app;

import com.braze.models.cards.Card;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class nl extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Card f1371a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nl(Card card) {
        super(0);
        this.f1371a = card;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Failed to log card as clicked for id: " + this.f1371a.getId();
    }
}
