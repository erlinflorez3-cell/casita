package fr.antelop.sdk.card;

import o.cs.c;

/* JADX INFO: loaded from: classes5.dex */
public enum EmvApplicationActivationMethodType {
    Sms(c.f22567a.b()),
    Email(c.f22570d.b()),
    OnlineBanking(c.f22568b.b()),
    CustomerService(c.f22569c.b()),
    App(c.f22571e.b()),
    OutboundCall(c.f22572g.b()),
    Ivr(c.f22573h.b());

    private final boolean hasToSubmitActivationCode;

    EmvApplicationActivationMethodType(boolean z2) {
        this.hasToSubmitActivationCode = z2;
    }

    public final boolean hasToSubmitActivationCode() {
        return this.hasToSubmitActivationCode;
    }
}
