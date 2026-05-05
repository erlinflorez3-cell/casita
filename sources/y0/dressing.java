package y0;

import com.google.protobuf.Internal;

/* JADX WARN: $VALUES field not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class dressing implements Internal.EnumLite {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final dressing f28469b = new dressing("ON_CALL_TYPE_UNKNOWN", 0, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final dressing f28470c = new dressing("ON_CALL_TYPE_PHONE", 1, 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final dressing f28471d = new dressing("ON_CALL_TYPE_VOIP", 2, 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28472a;

    public dressing(String str, int i2, int i3) {
        this.f28472a = i3;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.f28472a;
    }
}
