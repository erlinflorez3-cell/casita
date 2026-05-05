package androidx.camera.core.internal.utils;

/* JADX INFO: loaded from: classes.dex */
public interface RingBuffer<T> {

    public interface OnRemoveCallback<T> {
        void onRemove(T t2);
    }

    T dequeue();

    void enqueue(T t2);

    int getMaxCapacity();

    boolean isEmpty();
}
