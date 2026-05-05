package androidx.camera.camera2.internal;

/* JADX INFO: loaded from: classes2.dex */
public class LensFacingUtil {
    private LensFacingUtil() {
    }

    public static int getCameraSelectorLensFacing(int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (i2 == 1) {
            return 1;
        }
        if (i2 == 2) {
            return 2;
        }
        throw new IllegalArgumentException("The given lens facing integer: " + i2 + " can not be recognized.");
    }

    public static int getLensFacingInt(int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (i2 == 1) {
            return 1;
        }
        if (i2 == 2) {
            return 2;
        }
        throw new IllegalArgumentException("The given lens facing: " + i2 + " can not be recognized.");
    }
}
