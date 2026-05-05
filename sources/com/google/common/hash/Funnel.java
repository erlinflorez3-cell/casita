package com.google.common.hash;

import com.google.errorprone.annotations.DoNotMock;
import java.io.Serializable;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes7.dex */
@DoNotMock("Rwwtjshr\u00062\u0007y\u0002v+m\u0019fXeWZT")
@InterfaceC1492Gx
@ElementTypesAreNonnullByDefault
public interface Funnel<T> extends Serializable {
    void funnel(@ParametricNullness T from, PrimitiveSink into);
}
