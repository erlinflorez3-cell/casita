package fr.antelop.sdk.digitalcard;

import android.content.Context;
import android.graphics.drawable.Drawable;
import fr.antelop.sdk.exception.WalletValidationException;
import fr.antelop.sdk.util.OperationCallback;
import java.util.Arrays;
import o.ea.m;
import o.ep.d;
import o.er.w;

/* JADX INFO: loaded from: classes5.dex */
public final class TokenRequestor {
    private final d digitalCard;
    private final w innerTokenRequestor;

    public enum Type {
        Wallet,
        Ecommerce
    }

    public TokenRequestor(d dVar, w wVar) {
        this.digitalCard = dVar;
        this.innerTokenRequestor = wVar;
    }

    public final String getId() {
        return this.innerTokenRequestor.e();
    }

    public final Drawable getLogo(Context context) {
        return this.innerTokenRequestor.d(context);
    }

    public final String getName() {
        return this.innerTokenRequestor.c();
    }

    public final SecureCardPushToTokenRequestor getSecureCardPush() throws WalletValidationException {
        return this.innerTokenRequestor.b(this.digitalCard);
    }

    public final Type[] getTypes() {
        return (Type[]) m.c(Type.class, this.innerTokenRequestor.b());
    }

    public final void pushCard(Context context, String str, OperationCallback<CardPushUrl> operationCallback) throws Throwable {
        this.innerTokenRequestor.d(context, str, this.digitalCard, operationCallback);
    }

    public final String toString() {
        return new StringBuilder("TokenRequestor{id='").append(getId()).append("', types=").append(Arrays.toString(getTypes())).append(", name='").append(getName()).append("', logo='").append(this.innerTokenRequestor.d()).append("'}").toString();
    }
}
