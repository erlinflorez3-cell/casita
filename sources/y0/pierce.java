package y0;

import com.google.protobuf.Internal;

/* JADX WARN: $VALUES field not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class pierce implements Internal.EnumLite {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final pierce f28492b = new pierce("ON_CALL_STATUS_UNKNOWN", 0, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final pierce f28493c = new pierce("ON_CALL_STATUS_NOT_ON_CALL", 1, 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final pierce f28494d = new pierce("ON_CALL_STATUS_ON_CALL", 2, 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28495a;

    public pierce(String str, int i2, int i3) {
        this.f28495a = i3;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.f28495a;
    }
}
