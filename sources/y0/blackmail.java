package y0;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes2.dex */
public final class blackmail implements Internal.EnumVerifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final blackmail f28465a = new blackmail();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i2) {
        guilt guiltVar;
        switch (i2) {
            case 0:
                guiltVar = guilt.f28481b;
                break;
            case 1:
                guiltVar = guilt.f28482c;
                break;
            case 2:
                guiltVar = guilt.f28483d;
                break;
            case 3:
                guiltVar = guilt.f28484e;
                break;
            case 4:
                guiltVar = guilt.f28485f;
                break;
            case 5:
                guiltVar = guilt.f28486g;
                break;
            case 6:
                guiltVar = guilt.f28487h;
                break;
            case 7:
                guiltVar = guilt.f28488i;
                break;
            default:
                guiltVar = null;
                break;
        }
        return guiltVar != null;
    }
}
