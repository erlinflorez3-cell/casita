package com.google.common.collect;

import com.google.errorprone.annotations.DoNotMock;
import java.util.Iterator;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes7.dex */
@DoNotMock("^}l(Nzhvr\u0007~\u0003\u0001<{q^e`f\\?gYscsoo")
@InterfaceC1492Gx
@ElementTypesAreNonnullByDefault
public interface PeekingIterator<E> extends Iterator<E> {
    @Override // java.util.Iterator
    @ParametricNullness
    E next();

    @ParametricNullness
    E peek();

    @Override // java.util.Iterator
    void remove();
}
