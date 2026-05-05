package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class si0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1775a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si0(String str) {
        super(0);
        this.f1775a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Could not download zip file to local storage. " + this.f1775a;
    }
}
