package io.sentry.cache.tape;

import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes6.dex */
final class EmptyObjectQueue<T> extends ObjectQueue<T> {

    private static final class EmptyIterator<T> implements Iterator<T> {
        private EmptyIterator() {
        }

        /* synthetic */ EmptyIterator(AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            throw new NoSuchElementException("No elements in EmptyIterator!");
        }
    }

    EmptyObjectQueue() {
    }

    @Override // io.sentry.cache.tape.ObjectQueue
    public void add(T t2) throws IOException {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    @Override // io.sentry.cache.tape.ObjectQueue
    public QueueFile file() {
        return null;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return new EmptyIterator();
    }

    @Override // io.sentry.cache.tape.ObjectQueue
    public T peek() throws IOException {
        return null;
    }

    @Override // io.sentry.cache.tape.ObjectQueue
    public void remove(int i2) throws IOException {
    }

    @Override // io.sentry.cache.tape.ObjectQueue
    public int size() {
        return 0;
    }
}
