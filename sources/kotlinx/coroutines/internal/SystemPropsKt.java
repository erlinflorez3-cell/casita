package kotlinx.coroutines.internal;

import kotlin.Metadata;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"_q\b'\u001d\u000e\u0015\u0017a25Qhv)r\u0014|[*k\u0015\u0010\u0003dfQ\u0018\u000b(6X,\u001a!D\u0018}]E'\u00029ui5.9\u0006L\u0013v>@1Z", "_q\b'\u001d\u000e\u0015\u0017a25Qhv)r\u0014|[*k\u0015\u0010\u0003dfQ\u0018\u000b(6X,\u001a!D\u0018}]E'\u00029ui5.9\u0006L\u0013v>@EI\\6Fx0Xx"}, d2 = {}, k = 4, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class SystemPropsKt {
    public static final int getAVAILABLE_PROCESSORS() {
        return SystemPropsKt__SystemPropsKt.getAVAILABLE_PROCESSORS();
    }

    public static final int systemProp(String str, int i2, int i3, int i4) {
        return SystemPropsKt__SystemProps_commonKt.systemProp(str, i2, i3, i4);
    }

    public static final long systemProp(String str, long j2, long j3, long j4) {
        return SystemPropsKt__SystemProps_commonKt.systemProp(str, j2, j3, j4);
    }

    public static final String systemProp(String str) {
        return SystemPropsKt__SystemPropsKt.systemProp(str);
    }

    public static final String systemProp(String str, String str2) {
        return SystemPropsKt__SystemProps_commonKt.systemProp(str, str2);
    }

    public static final boolean systemProp(String str, boolean z2) {
        return SystemPropsKt__SystemProps_commonKt.systemProp(str, z2);
    }
}
