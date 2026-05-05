package io.sentry.internal.modules;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class NoOpModulesLoader implements IModulesLoader {
    private static final NoOpModulesLoader instance = new NoOpModulesLoader();

    private NoOpModulesLoader() {
    }

    public static NoOpModulesLoader getInstance() {
        return instance;
    }

    @Override // io.sentry.internal.modules.IModulesLoader
    public Map<String, String> getOrLoadModules() {
        return null;
    }
}
