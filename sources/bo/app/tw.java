package bo.app;

import cz.msebera.android.httpclient.message.TokenParser;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class tw extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Class f1893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vw f1894b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tw(Class cls, vw vwVar) {
        super(0);
        this.f1893a = cls;
        this.f1894b = vwVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Event was published, but no subscribers were found. But not saving event for publishing later. Event class: " + this.f1893a + TokenParser.SP + this.f1894b;
    }
}
