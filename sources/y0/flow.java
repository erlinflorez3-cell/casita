package y0;

import com.google.protobuf.Internal;

/* JADX WARN: $VALUES field not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class flow implements Internal.EnumLite {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final flow f28476b = new flow("UNKNOWN", 0, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final flow f28477c = new flow("NOT_SECURE", 1, 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final flow f28478d = new flow("BIOMETRIC", 2, 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final flow f28479e = new flow("PASSCODE", 3, 3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28480a;

    public flow(String str, int i2, int i3) {
        this.f28480a = i3;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.f28480a;
    }
}
