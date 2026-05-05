package g;

import c.civilian;
import com.cleafy.mobile.detection.agent.configuration.CleafyConfiguration;
import com.cleafy.mobile.detection.agent.configuration.CleafyDetectorsConfiguration;
import w0.taste;

/* JADX INFO: loaded from: classes4.dex */
public final class apparatus {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tongue f19642a;

    public apparatus(civilian civilianVar, taste tasteVar, v0.taste tasteVar2, l.pair pairVar) {
        CleafyConfiguration cleafyConfiguration = civilianVar.f2448b;
        CleafyDetectorsConfiguration cleafyDetectorsConfiguration = cleafyConfiguration.f2800l;
        this.f19642a = cleafyDetectorsConfiguration.f2802b ? new tongue(cleafyDetectorsConfiguration.f2803c, tasteVar.f28406b, tasteVar2.f28362a, cleafyConfiguration.f2790b, pairVar.f19847a) : null;
    }
}
