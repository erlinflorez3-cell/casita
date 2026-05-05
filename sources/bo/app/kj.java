package bo.app;

import com.braze.enums.Month;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.apache.commons.codec.language.Soundex;

/* JADX INFO: loaded from: classes4.dex */
public final class kj extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Month f1116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1117c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj(int i2, Month month, int i3) {
        super(0);
        this.f1115a = i2;
        this.f1116b = month;
        this.f1117c = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Failed to set date of birth to: " + this.f1115a + Soundex.SILENT_MARKER + this.f1116b.getValue() + Soundex.SILENT_MARKER + this.f1117c;
    }
}
