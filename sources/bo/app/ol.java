package bo.app;

import com.braze.models.cards.Card;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ol extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Card f1451a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ol(Card card) {
        super(0);
        this.f1451a = card;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Logging impression event for card with id: " + this.f1451a.getId();
    }
}
