package com.facebook.react.fabric;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.function.ToLongFunction;

/* JADX INFO: loaded from: classes3.dex */
class LongStreamingStats {
    private final Queue<Long> minHeap = new PriorityQueue(11, Comparator.comparingLong(new ToLongFunction() { // from class: com.facebook.react.fabric.LongStreamingStats$$ExternalSyntheticLambda0
        @Override // java.util.function.ToLongFunction
        public final long applyAsLong(Object obj) {
            return ((Long) obj).longValue();
        }
    }));
    private final Queue<Long> maxHeap = new PriorityQueue(11, new Comparator() { // from class: com.facebook.react.fabric.LongStreamingStats$$ExternalSyntheticLambda1
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Long.compare(((Long) obj2).longValue(), ((Long) obj).longValue());
        }
    });
    private double streamingAverage = 0.0d;
    private int len = 0;
    private long max = 0;

    LongStreamingStats() {
    }

    public void add(long j2) {
        if (j2 != 0) {
            if (this.minHeap.size() == this.maxHeap.size()) {
                this.maxHeap.offer(Long.valueOf(j2));
                this.minHeap.offer(this.maxHeap.poll());
            } else {
                this.minHeap.offer(Long.valueOf(j2));
                this.maxHeap.offer(this.minHeap.poll());
            }
        }
        int i2 = this.len;
        int i3 = i2 + 1;
        this.len = i3;
        if (i3 == 1) {
            this.streamingAverage = j2;
        } else {
            this.streamingAverage = (this.streamingAverage / ((double) (i3 / i2))) + (j2 / ((long) i3));
        }
        long j3 = this.max;
        if (j2 <= j3) {
            j2 = j3;
        }
        this.max = j2;
    }

    public double getAverage() {
        return this.streamingAverage;
    }

    public long getMax() {
        return this.max;
    }

    public double getMedian() {
        if (this.minHeap.size() == 0 && this.maxHeap.size() == 0) {
            return 0.0d;
        }
        return this.minHeap.size() > this.maxHeap.size() ? this.minHeap.peek().longValue() : (this.minHeap.peek().longValue() + this.maxHeap.peek().longValue()) / 2;
    }
}
