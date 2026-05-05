package io.reactivex.internal.util;

import io.reactivex.functions.BiFunction;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class MergerBiFunction<T> implements BiFunction<List<T>, List<T>, List<T>> {
    final Comparator<? super T> comparator;

    public MergerBiFunction(Comparator<? super T> comparator) {
        this.comparator = comparator;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0033, code lost:
    
        r1 = null;
     */
    @Override // io.reactivex.functions.BiFunction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<T> apply(java.util.List<T> r8, java.util.List<T> r9) throws java.lang.Exception {
        /*
            r7 = this;
            int r1 = r8.size()
            int r0 = r9.size()
            int r1 = r1 + r0
            if (r1 != 0) goto L11
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        L11:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r1)
            java.util.Iterator r6 = r8.iterator()
            java.util.Iterator r4 = r9.iterator()
            boolean r0 = r6.hasNext()
            r3 = 0
            if (r0 == 0) goto L5f
            java.lang.Object r2 = r6.next()
        L29:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L5d
            java.lang.Object r1 = r4.next()
        L33:
            if (r2 == 0) goto L61
            if (r1 == 0) goto L61
            java.util.Comparator<? super T> r0 = r7.comparator
            int r0 = r0.compare(r2, r1)
            if (r0 >= 0) goto L4f
            r5.add(r2)
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L4d
            java.lang.Object r2 = r6.next()
            goto L33
        L4d:
            r2 = r3
            goto L33
        L4f:
            r5.add(r1)
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L5d
            java.lang.Object r1 = r4.next()
            goto L33
        L5d:
            r1 = r3
            goto L33
        L5f:
            r2 = r3
            goto L29
        L61:
            if (r2 == 0) goto L74
            r5.add(r2)
        L66:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L85
            java.lang.Object r0 = r6.next()
            r5.add(r0)
            goto L66
        L74:
            r5.add(r1)
        L77:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L85
            java.lang.Object r0 = r4.next()
            r5.add(r0)
            goto L77
        L85:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.util.MergerBiFunction.apply(java.util.List, java.util.List):java.util.List");
    }
}
