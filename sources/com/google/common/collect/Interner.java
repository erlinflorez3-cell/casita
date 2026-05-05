package com.google.common.collect;

import com.google.errorprone.annotations.DoNotMock;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes7.dex */
@DoNotMock("^}l(Ntwi\u0004\u0001t\u0003\u0001<yqp$@fi[ebft")
@InterfaceC1492Gx
@ElementTypesAreNonnullByDefault
public interface Interner<E> {
    E intern(E sample);
}
