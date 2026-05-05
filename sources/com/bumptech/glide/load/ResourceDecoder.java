package com.bumptech.glide.load;

import com.bumptech.glide.load.engine.Resource;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public interface ResourceDecoder<T, Z> {
    Resource<Z> decode(T t2, int i2, int i3, Options options) throws IOException;

    boolean handles(T t2, Options options) throws IOException;
}
