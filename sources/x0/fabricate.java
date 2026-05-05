package x0;

import com.biocatch.client.android.sdk.core.Constants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes2.dex */
public final class fabricate extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f28438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0.pair f28439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ abundant f28440c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fabricate(String str, k0.pair pairVar, abundant abundantVar) {
        super(1);
        this.f28438a = str;
        this.f28439b = pairVar;
        this.f28440c = abundantVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, w0.misplace] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        w0.slide slideVar = (w0.slide) ((w0.gregarious) obj);
        slideVar.f28398a.element = w0.misplace.f28394b;
        slideVar.a(this.f28438a, Charsets.UTF_8);
        slideVar.f28401d.put("Content-Type", Constants.WUP_CONTENT_TYPE);
        slideVar.f28401d.put("x-ma-sid", String.valueOf(this.f28439b.f19829a));
        if (!Intrinsics.areEqual(this.f28440c.f28425d, "")) {
            slideVar.f28401d.put("x-integration-token", String.valueOf(this.f28440c.f28425d));
        }
        Ref.BooleanRef booleanRef = slideVar.f28399b;
        booleanRef.element = booleanRef.element;
        return Unit.INSTANCE;
    }
}
