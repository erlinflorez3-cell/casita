package io.reactivex.internal.util;

import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Predicate;

/* JADX INFO: loaded from: classes6.dex */
public class AppendOnlyLinkedArrayList<T> {
    final int capacity;
    final Object[] head;
    int offset;
    Object[] tail;

    public interface NonThrowingPredicate<T> extends Predicate<T> {
        @Override // io.reactivex.functions.Predicate
        boolean test(T t2);
    }

    public AppendOnlyLinkedArrayList(int i2) {
        this.capacity = i2;
        Object[] objArr = new Object[i2 + 1];
        this.head = objArr;
        this.tail = objArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x000d, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <U> boolean accept(io.reactivex.Observer<? super U> r5) {
        /*
            r4 = this;
            java.lang.Object[] r0 = r4.head
            int r3 = r4.capacity
        L4:
            r2 = 0
            if (r0 == 0) goto L1f
        L7:
            if (r2 >= r3) goto Ld
            r1 = r0[r2]
            if (r1 != 0) goto L14
        Ld:
            r0 = r0[r3]
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto L4
        L14:
            boolean r1 = io.reactivex.internal.util.NotificationLite.acceptFull(r1, r5)
            if (r1 == 0) goto L1c
            r0 = 1
            return r0
        L1c:
            int r2 = r2 + 1
            goto L7
        L1f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.util.AppendOnlyLinkedArrayList.accept(io.reactivex.Observer):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x000d, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <U> boolean accept(org.reactivestreams.Subscriber<? super U> r5) {
        /*
            r4 = this;
            java.lang.Object[] r0 = r4.head
            int r3 = r4.capacity
        L4:
            r2 = 0
            if (r0 == 0) goto L1f
        L7:
            if (r2 >= r3) goto Ld
            r1 = r0[r2]
            if (r1 != 0) goto L14
        Ld:
            r0 = r0[r3]
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto L4
        L14:
            boolean r1 = io.reactivex.internal.util.NotificationLite.acceptFull(r1, r5)
            if (r1 == 0) goto L1c
            r0 = 1
            return r0
        L1c:
            int r2 = r2 + 1
            goto L7
        L1f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.util.AppendOnlyLinkedArrayList.accept(org.reactivestreams.Subscriber):boolean");
    }

    public void add(T t2) {
        int i2 = this.capacity;
        int i3 = this.offset;
        if (i3 == i2) {
            Object[] objArr = new Object[i2 + 1];
            this.tail[i2] = objArr;
            this.tail = objArr;
            i3 = 0;
        }
        this.tail[i3] = t2;
        this.offset = i3 + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x000d, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void forEachWhile(io.reactivex.internal.util.AppendOnlyLinkedArrayList.NonThrowingPredicate<? super T> r5) {
        /*
            r4 = this;
            java.lang.Object[] r0 = r4.head
            int r3 = r4.capacity
        L4:
            if (r0 == 0) goto L1e
            r2 = 0
        L7:
            if (r2 >= r3) goto Ld
            r1 = r0[r2]
            if (r1 != 0) goto L14
        Ld:
            r0 = r0[r3]
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto L4
        L14:
            boolean r1 = r5.test(r1)
            if (r1 == 0) goto L1b
            return
        L1b:
            int r2 = r2 + 1
            goto L7
        L1e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.util.AppendOnlyLinkedArrayList.forEachWhile(io.reactivex.internal.util.AppendOnlyLinkedArrayList$NonThrowingPredicate):void");
    }

    public <S> void forEachWhile(S s2, BiPredicate<? super S, ? super T> biPredicate) throws Exception {
        Object[] objArr = this.head;
        int i2 = this.capacity;
        while (true) {
            for (int i3 = 0; i3 < i2; i3++) {
                Object obj = objArr[i3];
                if (obj == null || biPredicate.test(s2, obj)) {
                    return;
                }
            }
            objArr = (Object[]) objArr[i2];
        }
    }

    public void setFirst(T t2) {
        this.head[0] = t2;
    }
}
