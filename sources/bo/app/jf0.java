package bo.app;

import com.braze.support.JsonUtils;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class jf0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g10 f1011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f1012b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf0(g10 g10Var, Ref.ObjectRef objectRef) {
        super(0);
        this.f1011a = g10Var;
        this.f1012b = objectRef;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sb = new StringBuilder("\n     Found best triggered action for incoming trigger event ");
        e00 e00Var = ((we0) this.f1011a).f2141c;
        return StringsKt.trimIndent(sb.append(e00Var != null ? JsonUtils.getPrettyPrintedString(((ba) e00Var).forJsonPut()) : "").append(".\n     Matched Action id: ").append(((bh0) ((k10) this.f1012b.element)).f280a).append(".\n                ").toString());
    }
}
