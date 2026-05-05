package androidx.camera.core;

/* JADX INFO: loaded from: classes.dex */
public final class FocusMeteringResult {
    private boolean mIsFocusSuccessful;

    public static FocusMeteringResult emptyInstance() {
        return new FocusMeteringResult(false);
    }

    public static FocusMeteringResult create(boolean z2) {
        return new FocusMeteringResult(z2);
    }

    private FocusMeteringResult(boolean z2) {
        this.mIsFocusSuccessful = z2;
    }

    public boolean isFocusSuccessful() {
        return this.mIsFocusSuccessful;
    }
}
