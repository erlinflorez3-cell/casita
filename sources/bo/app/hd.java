package bo.app;

import java.net.URL;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class hd extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ URL f824b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hd(int i2, URL url) {
        super(0);
        this.f823a = i2;
        this.f824b = url;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "HTTP response code was " + this.f823a + ". Bitmap with url " + this.f824b + " could not be downloaded.";
    }
}
