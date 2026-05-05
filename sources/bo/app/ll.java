package bo.app;

import com.braze.models.cards.Card;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ll extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Card f1202a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ll(Card card) {
        super(0);
        this.f1202a = card;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Logged click for card with id: " + this.f1202a.getId();
    }
}
