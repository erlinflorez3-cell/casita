package c1;

import java.util.List;
import kotlin.collections.CollectionsKt;
import y0.inspire;
import y0.match;
import y0.survey;

/* JADX INFO: loaded from: classes4.dex */
public final class crisis extends b1.superior {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final crisis f2495b = new crisis();

    @Override // b1.superior
    public final List b(Object obj) {
        d0.fabricate fabricateVar = (d0.fabricate) obj;
        return CollectionsKt.listOf((survey) ((match) this.f157a.invoke()).a((inspire) inspire.a().a(fabricateVar.getKey()).b(fabricateVar.getValue()).build()).build());
    }
}
