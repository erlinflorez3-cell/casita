package bo.app;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class gc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f742a = {1, 2, 3, 4};

    public static /* synthetic */ int a(int i2) {
        if (i2 != 0) {
            return i2 - 1;
        }
        throw null;
    }

    public static /* synthetic */ int[] b(int i2) {
        int[] iArr = new int[i2];
        System.arraycopy(f742a, 0, iArr, 0, i2);
        return iArr;
    }
}
