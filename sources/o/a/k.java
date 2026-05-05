package o.a;

/* JADX INFO: loaded from: classes6.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19938a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19939c;

    public static char[] c(long j2, char[] cArr, int i2) {
        int length = cArr.length;
        char[] cArr2 = new char[length];
        int i3 = 0;
        int i4 = 0;
        int i5 = 4;
        while (i3 < cArr.length) {
            long j3 = j2 >>> i3;
            if (((j3 + 1) - (j3 | 1) != i2 || i4 >= 4) && i5 < length) {
                cArr2[i5] = cArr[i3];
                i5++;
                i3++;
            } else {
                cArr2[i4] = cArr[i3];
                i4++;
                i3++;
            }
        }
        return cArr2;
    }
}
