package o.dp;

import fr.antelop.sdk.transaction.hce.HceTransactionStepName;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f23232b = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f23233d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HceTransactionStepName f23234c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f23235e;

    public final int a() {
        int i2;
        int i3 = 2 % 2;
        int i4 = f23233d + 65;
        int i5 = i4 % 128;
        f23232b = i5;
        if (i4 % 2 == 0) {
            i2 = this.f23235e;
            int i6 = 59 / 0;
        } else {
            i2 = this.f23235e;
        }
        int i7 = (((-1) - (((-1) - i5) & ((-1) - 87))) << 1) - (i5 ^ 87);
        f23233d = i7 % 128;
        if (i7 % 2 == 0) {
            return i2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final HceTransactionStepName c() {
        int i2 = 2 % 2;
        int i3 = f23232b + 109;
        f23233d = i3 % 128;
        int i4 = i3 % 2;
        HceTransactionStepName hceTransactionStepName = this.f23234c;
        if (i4 != 0) {
            int i5 = 93 / 0;
        }
        return hceTransactionStepName;
    }
}
