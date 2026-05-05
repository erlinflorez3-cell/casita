package com.google.crypto.tink.tinkkey;

import com.google.crypto.tink.KeyTemplate;
import com.google.errorprone.annotations.Immutable;

/* JADX INFO: loaded from: classes7.dex */
@Immutable(containerOf = {})
@Deprecated
public interface TinkKey {
    KeyTemplate getKeyTemplate();

    boolean hasSecret();
}
