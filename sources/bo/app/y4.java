package bo.app;

import com.braze.events.IEventSubscriber;
import cz.msebera.android.httpclient.message.TokenParser;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class y4 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Class f2264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IEventSubscriber f2265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f2266c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(Class cls, IEventSubscriber iEventSubscriber, boolean z2) {
        super(0);
        this.f2264a = cls;
        this.f2265b = iEventSubscriber;
        this.f2266c = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Did remove the background " + this.f2264a + TokenParser.SP + this.f2265b + "? " + this.f2266c;
    }
}
