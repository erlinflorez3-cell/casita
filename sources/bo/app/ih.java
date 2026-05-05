package bo.app;

import com.braze.events.NoMatchingTriggerEvent;
import com.braze.support.BrazeLogger;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ih {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v00 f907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v00 f908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xy f909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vb0 f910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kn f911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f912f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l00 f913g;

    public ih(z80 requestInfo, x00 httpConnector, v00 internalPublisher, v00 externalPublisher, xy feedStorageProvider, h00 brazeManager, vb0 serverConfigStorage, kn contentCardsStorage, ju endpointMetadataProvider, a80 requestDispatchCallback) {
        Intrinsics.checkNotNullParameter(requestInfo, "requestInfo");
        Intrinsics.checkNotNullParameter(httpConnector, "httpConnector");
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        Intrinsics.checkNotNullParameter(externalPublisher, "externalPublisher");
        Intrinsics.checkNotNullParameter(feedStorageProvider, "feedStorageProvider");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        Intrinsics.checkNotNullParameter(serverConfigStorage, "serverConfigStorage");
        Intrinsics.checkNotNullParameter(contentCardsStorage, "contentCardsStorage");
        Intrinsics.checkNotNullParameter(endpointMetadataProvider, "endpointMetadataProvider");
        Intrinsics.checkNotNullParameter(requestDispatchCallback, "requestDispatchCallback");
        this.f907a = internalPublisher;
        this.f908b = externalPublisher;
        this.f909c = feedStorageProvider;
        this.f910d = serverConfigStorage;
        this.f911e = contentCardsStorage;
        HashMap mapA = w80.a();
        this.f912f = mapA;
        l00 l00VarA = requestInfo.a();
        this.f913g = l00VarA;
        l00VarA.a(mapA);
    }

    public final void a(d10 responseError) {
        Intrinsics.checkNotNullParameter(responseError, "responseError");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new gh(responseError), 6, (Object) null);
        ((vw) this.f907a).b(wb0.class, new wb0(responseError));
        l00 l00Var = this.f913g;
        if (l00Var instanceof gd0) {
            v00 v00Var = this.f908b;
            String strA = ((gd0) l00Var).f745k.a();
            Intrinsics.checkNotNullExpressionValue(strA, "request.triggerEvent.triggerEventType");
            ((vw) v00Var).b(NoMatchingTriggerEvent.class, new NoMatchingTriggerEvent(strA));
        }
    }
}
