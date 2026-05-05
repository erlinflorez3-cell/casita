package bo.app;

import cz.msebera.android.httpclient.message.TokenParser;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class kd extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Exception f1102b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kd(String str, Exception exc) {
        super(0);
        this.f1101a = str;
        this.f1102b = exc;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Exception in image bitmap download for Uri: " + this.f1101a + TokenParser.SP + this.f1102b.getMessage();
    }
}
