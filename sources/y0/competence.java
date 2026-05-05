package y0;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes2.dex */
public final class competence implements Internal.EnumVerifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final competence f28467a = new competence();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i2) {
        return (i2 != 0 ? i2 != 1 ? i2 != 2 ? null : dressing.f28471d : dressing.f28470c : dressing.f28469b) != null;
    }
}
