package com.google.common.graph;

import com.google.errorprone.annotations.DoNotMock;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes7.dex */
@DoNotMock("Rwwtjshr\u00062\u0007y\u0002v+m\u0019fXeWZT !qq rq`\u001c0\\HXM(XM]VTb\rbZ\f;O@D9u4s(T@PE}RE>3g=.,c)7F9C33k2\u001e\"\u001d,")
@InterfaceC1492Gx
@ElementTypesAreNonnullByDefault
public interface PredecessorsFunction<N> {
    Iterable<? extends N> predecessors(N node);
}
