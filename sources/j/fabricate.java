package j;

import android.app.Application;
import com.cleafy.mobile.detection.agent.configuration.CleafyConfiguration;
import java.util.Map;
import k.profile;
import kotlin.Unit;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class fabricate {

    /* JADX INFO: renamed from: a */
    public final slide f19788a;

    /* JADX INFO: renamed from: b */
    public final slide f19789b;

    public fabricate(c.civilian civilianVar, e1.pair pairVar) {
        Application application = civilianVar.f2449c;
        CleafyConfiguration cleafyConfiguration = civilianVar.f2448b;
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        Application application2 = civilianVar.f2449c;
        CleafyConfiguration cleafyConfiguration2 = civilianVar.f2448b;
        if (cleafyConfiguration2.f2800l.f2809i) {
            mapCreateMapBuilder.put(k.misplace.f19818a, new k.misplace());
        }
        if (cleafyConfiguration2.f2795g) {
            mapCreateMapBuilder.put(k.skate.f19823c, new k.skate(application2, cleafyConfiguration2.f2800l.f2815o));
            mapCreateMapBuilder.put(k.civilian.f19811d, new k.civilian(application2));
        }
        if (cleafyConfiguration2.f2800l.f2808h) {
            mapCreateMapBuilder.put(profile.f19820b, new profile(application2));
        }
        if (cleafyConfiguration2.f2800l.f2813m) {
            mapCreateMapBuilder.put(k.fabricate.f19815c, new k.fabricate(application2));
        }
        Unit unit = Unit.INSTANCE;
        slide slideVar = new slide(application, cleafyConfiguration, MapsKt.build(mapCreateMapBuilder), pairVar.f18484b);
        this.f19788a = slideVar;
        this.f19789b = civilianVar.f2448b.f2800l.f2804d ? slideVar : null;
    }
}
