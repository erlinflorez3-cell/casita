package y0;

import com.google.protobuf.Internal;
import org.apache.commons.codec.language.bm.Rule;

/* JADX WARN: $VALUES field not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class guilt implements Internal.EnumLite {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final guilt f28481b = new guilt(Rule.ALL, 0, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final guilt f28482c = new guilt("SELFIE", 1, 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final guilt f28483d = new guilt("SMS", 2, 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final guilt f28484e = new guilt("OVERLAY", 3, 3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final guilt f28485f = new guilt("TASK_INJECTION", 4, 4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final guilt f28486g = new guilt("MOCK_LOCATION", 5, 5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final guilt f28487h = new guilt("VPN", 6, 6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final guilt f28488i = new guilt("NFC", 7, 7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28489a;

    public guilt(String str, int i2, int i3) {
        this.f28489a = i3;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.f28489a;
    }
}
