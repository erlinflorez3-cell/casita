package bo.app;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class dg0 {

    /* JADX INFO: renamed from: b */
    public static final Comparator f489b = new Comparator() { // from class: bo.app.dg0$$ExternalSyntheticLambda0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return dg0.a((k10) obj, (k10) obj2);
        }
    };

    /* JADX INFO: renamed from: a */
    public final PriorityQueue f490a;

    public dg0(ArrayList fallbackActions) {
        Intrinsics.checkNotNullParameter(fallbackActions, "fallbackActions");
        PriorityQueue priorityQueue = new PriorityQueue(12, f489b);
        this.f490a = priorityQueue;
        priorityQueue.addAll(fallbackActions);
    }

    public static final int a(k10 actionA, k10 actionB) {
        Intrinsics.checkNotNullParameter(actionA, "actionA");
        Intrinsics.checkNotNullParameter(actionB, "actionB");
        bh0 bh0Var = (bh0) actionA;
        int i2 = bh0Var.f281b.f731c;
        bh0 bh0Var2 = (bh0) actionB;
        int i3 = bh0Var2.f281b.f731c;
        if (i2 > i3) {
            return -1;
        }
        if (i2 < i3) {
            return 1;
        }
        return bh0Var.f280a.compareTo(bh0Var2.f280a);
    }
}
