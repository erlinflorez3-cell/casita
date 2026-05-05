package y0;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes2.dex */
public final class calculation implements Internal.EnumVerifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final calculation f28466a = new calculation();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i2) {
        return (i2 != 0 ? i2 != 1 ? null : exempt.f28474c : exempt.f28473b) != null;
    }
}
