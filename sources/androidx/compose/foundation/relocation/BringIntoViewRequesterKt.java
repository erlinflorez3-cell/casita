package androidx.compose.foundation.relocation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNode;
import kotlin.Metadata;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Upw-#\t\u0001`-&2Ocq3i]o\u001c6k\u0005\f\u0005_tS\u0018*\u0014/S*\u000eE;\u0018{\u0019<%\fH\n90.Cne\u0006~ 2W[R<Mn4XxsV+\u001d1B^%~\u0002 \u0017W#)\u001eS--Df)h\u0011{\u0015", "Upw-#\t\u0001`-&2Ocq3i]o\u001c6k\u0005\f\u0005_tS\u0018*\u0014/S*\u000eE;\u0018{\u0019<%\fH\n90.Cne\u0006~ 2W[R<Mn4XxsV+\u001d1B^%~\u0002 \u0017W#)\u001eS/(Na\u0019h\u0011{\u0015"}, d2 = {}, k = 4, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class BringIntoViewRequesterKt {
    public static final BringIntoViewRequester BringIntoViewRequester() {
        return BringIntoViewRequesterKt__BringIntoViewRequesterKt.BringIntoViewRequester();
    }

    public static final Modifier bringIntoViewRequester(Modifier modifier, BringIntoViewRequester bringIntoViewRequester) {
        return BringIntoViewRequesterKt__BringIntoViewRequesterKt.bringIntoViewRequester(modifier, bringIntoViewRequester);
    }

    public static final Modifier bringIntoViewResponder(Modifier modifier, BringIntoViewResponder bringIntoViewResponder) {
        return BringIntoViewRequesterKt__BringIntoViewResponderKt.bringIntoViewResponder(modifier, bringIntoViewResponder);
    }

    public static final BringIntoViewParent findBringIntoViewParent(DelegatableNode delegatableNode) {
        return BringIntoViewRequesterKt__BringIntoViewResponderKt.findBringIntoViewParent(delegatableNode);
    }
}
