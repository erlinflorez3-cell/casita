package bo.app;

import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class eo extends uu {

    /* JADX INFO: renamed from: l */
    public static final String f585l = BrazeLogger.getBrazeLogTag((Class<?>) eo.class);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eo(cs dispatchDataProvider) {
        super(k00.V3_DATA, dispatchDataProvider);
        Intrinsics.checkNotNullParameter(dispatchDataProvider, "dispatchDataProvider");
    }

    @Override // bo.app.uu
    public final void a(long j2) {
        ca caVar;
        ca caVar2;
        ArrayList arrayList = this.f1973f;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            a90 a90Var = ((z80) obj).f2366d;
            if (a90Var == a90.PENDING_START || a90Var == a90.PENDING_RETRY) {
                arrayList2.add(obj);
            }
        }
        List listSortedWith = CollectionsKt.sortedWith(arrayList2, new bo());
        int size = listSortedWith.size();
        if (size < 2) {
            return;
        }
        z80 z80Var = (z80) CollectionsKt.first(listSortedWith);
        List<z80> listSubList = listSortedWith.subList(1, size);
        l00 l00Var = z80Var != null ? z80Var.f2363a : null;
        cp cpVar = l00Var instanceof cp ? (cp) l00Var : null;
        if (cpVar == null) {
            return;
        }
        for (z80 z80Var2 : listSubList) {
            l00 l00Var2 = z80Var2.f2363a;
            cp cpVar2 = l00Var2 instanceof cp ? (cp) l00Var2 : null;
            if (cpVar2 != null && ((cpVar.f419l == null || cpVar2.f419l == null) && (((caVar = cpVar.f420m) == null || caVar.f329b) && ((caVar2 = cpVar2.f420m) == null || caVar2.f329b)))) {
                k50 k50Var = cpVar2.f417j;
                Boolean bool = (cpVar.f417j.b() || k50Var.b()) ? Boolean.TRUE : null;
                Boolean bool2 = (cpVar.f417j.c() || k50Var.c()) ? Boolean.TRUE : null;
                i50 outboundConfigParams = cpVar.f417j.f1076d;
                if (outboundConfigParams != null) {
                    Intrinsics.checkNotNullParameter(outboundConfigParams, "outboundConfigParams");
                } else {
                    outboundConfigParams = null;
                }
                i50 outboundConfigParams2 = k50Var.f1076d;
                if (outboundConfigParams2 != null) {
                    Intrinsics.checkNotNullParameter(outboundConfigParams2, "outboundConfigParams");
                    outboundConfigParams = outboundConfigParams2;
                }
                String str = cpVar.f417j.f1073a;
                if (str == null) {
                    str = null;
                }
                String str2 = k50Var.f1073a;
                if (str2 != null) {
                    str = str2;
                }
                cpVar.f417j = new k50(str, bool, bool2, outboundConfigParams);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f585l, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new co(z80Var2, j2, z80Var), 14, (Object) null);
                z80Var2.a(j2, a90.BATCHED);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Cdo(cpVar2, z80Var), 7, (Object) null);
            }
        }
    }
}
