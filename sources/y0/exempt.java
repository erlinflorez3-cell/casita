package y0;

import com.google.protobuf.Internal;
import org.spongycastle.pqc.jcajce.spec.McElieceCCA2ParameterSpec;

/* JADX WARN: $VALUES field not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class exempt implements Internal.EnumLite {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final exempt f28473b = new exempt("NONE", 0, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final exempt f28474c = new exempt(McElieceCCA2ParameterSpec.DEFAULT_MD, 1, 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28475a;

    public exempt(String str, int i2, int i3) {
        this.f28475a = i3;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.f28475a;
    }
}
