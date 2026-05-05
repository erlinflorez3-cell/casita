package bo.app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class l80 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ v80 f1174a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f1175b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l80(v80 v80Var, long j2) {
        super(0);
        this.f1174a = v80Var;
        this.f1175b = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        v80 v80Var = this.f1174a;
        long j2 = this.f1175b;
        LinkedHashMap linkedHashMap = v80Var.f2015e;
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((uu) ((Map.Entry) it.next()).getValue());
        }
        return StringsKt.trimMargin$default("RequestFramework->\n            |mockAllNetworkRequests=" + v80Var.f2013c + "\n            |lastSdkAuthFailureError=" + v80Var.f2018h + "\n            |lastSdkAuthFailureAt=" + (v80Var.f2019i - j2) + "\n            |sdkAuthFailureBackoffUntil=" + (v80Var.f2020j - j2) + "\n            |invalidApiKeyErrorCounter=" + v80Var.f2021k.get() + "\n            |globalRequestRateLimiter=" + v80Var.f2022l + "\n            |lastNetworkLevel=" + v80Var.f2023m + "\n            |endpointQueues=\n            | \n            |" + CollectionsKt.joinToString$default(arrayList, "\n\n", null, null, 0, null, new u80(j2), 30, null) + "\n            |  \n            |\n        ", null, 1, null);
    }
}
