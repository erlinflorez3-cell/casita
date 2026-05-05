package com.google.crypto.tink.internal;

import com.google.crypto.tink.util.Bytes;
import com.google.errorprone.annotations.Immutable;

/* JADX INFO: loaded from: classes7.dex */
@Immutable(containerOf = {})
public interface Serialization {
    Bytes getObjectIdentifier();
}
