package c1;

import android.content.pm.Signature;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class misplace extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ skate f2500a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public misplace(skate skateVar) {
        super(1);
        this.f2500a = skateVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return (String) this.f2500a.f2509c.invoke((Signature) obj);
    }
}
