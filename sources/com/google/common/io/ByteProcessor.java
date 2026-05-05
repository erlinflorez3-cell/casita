package com.google.common.io;

import com.google.errorprone.annotations.DoNotMock;
import java.io.IOException;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes7.dex */
@ElementTypesAreNonnullByDefault
@DoNotMock("Rwwtjshr\u00062x\u0005-|z~f[cdn")
@InterfaceC1492Gx
public interface ByteProcessor<T> {
    @ParametricNullness
    T getResult();

    boolean processBytes(byte[] buf, int off, int len) throws IOException;
}
