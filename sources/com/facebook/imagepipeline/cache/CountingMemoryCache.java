package com.facebook.imagepipeline.cache;

import android.graphics.Bitmap;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.memory.MemoryTrimmable;
import com.facebook.common.references.CloseableReference;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface CountingMemoryCache<K, V> extends MemoryCache<K, V>, MemoryTrimmable {

    public static class Entry<K, V> {
        public final K key;

        @Nullable
        public final EntryStateObserver<K> observer;
        public int size;
        public final CloseableReference<V> valueRef;
        public int clientCount = 0;
        public boolean isOrphan = false;
        public int accessCount = 0;

        private Entry(K k2, CloseableReference<V> closeableReference, @Nullable EntryStateObserver<K> entryStateObserver, int i2) {
            this.key = (K) Preconditions.checkNotNull(k2);
            this.valueRef = (CloseableReference) Preconditions.checkNotNull(CloseableReference.cloneOrNull(closeableReference));
            this.observer = entryStateObserver;
            this.size = i2;
        }

        public static <K, V> Entry<K, V> of(K k2, CloseableReference<V> closeableReference, int i2, @Nullable EntryStateObserver<K> entryStateObserver) {
            return new Entry<>(k2, closeableReference, entryStateObserver, i2);
        }

        public static <K, V> Entry<K, V> of(K k2, CloseableReference<V> closeableReference, @Nullable EntryStateObserver<K> entryStateObserver) {
            return of(k2, closeableReference, -1, entryStateObserver);
        }
    }

    public interface EntryStateObserver<K> {
        void onExclusivityChanged(K k2, boolean z2);
    }

    @Nullable
    CloseableReference<V> cache(K k2, CloseableReference<V> closeableReference, EntryStateObserver<K> entryStateObserver);

    void clear();

    @Nullable
    CountingLruMap<K, Entry<K, V>> getCachedEntries();

    int getEvictionQueueCount();

    int getEvictionQueueSizeInBytes();

    int getInUseSizeInBytes();

    MemoryCacheParams getMemoryCacheParams();

    @Nullable
    Map<Bitmap, Object> getOtherEntries();

    void maybeEvictEntries();

    @Nullable
    CloseableReference<V> reuse(K k2);
}
