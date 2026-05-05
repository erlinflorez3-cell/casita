package io.sentry.cache.tape;

import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ObjectQueue<T> implements Iterable<T>, Closeable {

    public interface Converter<T> {
        T from(byte[] bArr) throws IOException;

        void toStream(T t2, OutputStream outputStream) throws IOException;
    }

    public static <T> ObjectQueue<T> create(QueueFile queueFile, Converter<T> converter) {
        return new FileObjectQueue(queueFile, converter);
    }

    public static <T> ObjectQueue<T> createEmpty() {
        return new EmptyObjectQueue();
    }

    public abstract void add(T t2) throws IOException;

    public List<T> asList() throws IOException {
        return peek(size());
    }

    public void clear() throws IOException {
        remove(size());
    }

    public abstract QueueFile file();

    public boolean isEmpty() {
        return size() == 0;
    }

    public abstract T peek() throws IOException;

    public List<T> peek(int i2) throws IOException {
        int iMin = Math.min(i2, size());
        ArrayList arrayList = new ArrayList(iMin);
        Iterator<T> it = iterator();
        for (int i3 = 0; i3 < iMin; i3++) {
            arrayList.add(it.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void remove() throws IOException {
        remove(1);
    }

    public abstract void remove(int i2) throws IOException;

    public abstract int size();
}
