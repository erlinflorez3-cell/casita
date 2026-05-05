package bo.app;

import com.braze.Braze;
import com.braze.enums.GeofenceTransitionType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class m4 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GeofenceTransitionType f1252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Braze f1253c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(String str, GeofenceTransitionType geofenceTransitionType, Braze braze) {
        super(0);
        this.f1251a = str;
        this.f1252b = geofenceTransitionType;
        this.f1253c = braze;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str = this.f1251a;
        if (str != null && !StringsKt.isBlank(str) && this.f1252b != null) {
            ((ci0) this.f1253c.getUdm$android_sdk_base_release()).f405x.postGeofenceReport(this.f1251a, this.f1252b);
        }
        return Unit.INSTANCE;
    }
}
