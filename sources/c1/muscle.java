package c1;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.collections.CollectionsKt;
import y0.inspire;
import y0.match;
import y0.survey;
import y0.wardrobe;

/* JADX INFO: loaded from: classes4.dex */
public final class muscle extends b1.superior {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final muscle f2501b = new muscle();

    @Override // b1.superior
    public final List b(Object obj) {
        d0.slide slideVar = (d0.slide) obj;
        wardrobe wardrobeVarA = inspire.a();
        slideVar.getClass();
        match matchVarA = ((match) this.f157a.invoke()).a((inspire) wardrobeVarA.a(FirebaseAnalytics.Param.LOCATION).b(slideVar.f18416a).build());
        slideVar.f18417b.a(matchVarA);
        return CollectionsKt.listOf((survey) matchVarA.build());
    }
}
