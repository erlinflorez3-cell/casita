package io.sentry.internal.debugmeta;

import java.util.List;
import java.util.Properties;

/* JADX INFO: loaded from: classes6.dex */
public final class NoOpDebugMetaLoader implements IDebugMetaLoader {
    private static final NoOpDebugMetaLoader instance = new NoOpDebugMetaLoader();

    private NoOpDebugMetaLoader() {
    }

    public static NoOpDebugMetaLoader getInstance() {
        return instance;
    }

    @Override // io.sentry.internal.debugmeta.IDebugMetaLoader
    public List<Properties> loadDebugMeta() {
        return null;
    }
}
