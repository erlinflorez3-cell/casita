package com.upokecenter.cbor;

/* JADX INFO: loaded from: classes5.dex */
public interface ICBORToFromConverter<T> extends ICBORConverter<T> {
    T FromCBORObject(CBORObject cBORObject);
}
