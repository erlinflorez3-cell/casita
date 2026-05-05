package androidx.camera.core.impl;

/* JADX INFO: loaded from: classes.dex */
public class MutableStateObservable<T> extends StateObservable<T> {
    private MutableStateObservable(Object obj, boolean z2) {
        super(obj, z2);
    }

    public static <T> MutableStateObservable<T> withInitialState(T t2) {
        return new MutableStateObservable<>(t2, false);
    }

    public static <T> MutableStateObservable<T> withInitialError(Throwable th) {
        return new MutableStateObservable<>(th, true);
    }

    public void setState(T t2) {
        updateState(t2);
    }

    public void setError(Throwable th) {
        updateStateAsError(th);
    }
}
