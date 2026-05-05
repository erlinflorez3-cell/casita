package com.facebook.soloader;

import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
class MergedSoMapping {
    MergedSoMapping() {
    }

    static void invokeJniOnload(String str) {
        throw new IllegalArgumentException("Unknown library: " + str);
    }

    @Nullable
    static String mapLibName(String str) {
        return null;
    }
}
