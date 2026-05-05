package com.google.crypto.tink.prf;

import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes7.dex */
@Immutable(containerOf = {})
public interface Prf {
    byte[] compute(byte[] input, int outputLength) throws GeneralSecurityException;
}
