package bo.app;

import com.braze.Braze;
import com.braze.events.FeatureFlagsUpdatedEvent;
import com.braze.models.FeatureFlag;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class a7 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Braze f176a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a7(Braze braze) {
        super(0);
        this.f176a = braze;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this.f176a, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) z6.f2355a, 7, (Object) null);
        if (((ci0) this.f176a.getUdm$android_sdk_base_release()).f389h.z()) {
            gy gyVar = ((ci0) this.f176a.getUdm$android_sdk_base_release()).f407z;
            if (gyVar.f783f.get()) {
                List list = gyVar.f782e;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((FeatureFlag) it.next()).deepcopy$android_sdk_base_release());
                }
                ((vw) gyVar.f779b).b(FeatureFlagsUpdatedEvent.class, new FeatureFlagsUpdatedEvent(arrayList));
            }
        } else {
            ((ci0) this.f176a.getUdm$android_sdk_base_release()).f392k.b(iy.class, new iy());
        }
        return Unit.INSTANCE;
    }
}
