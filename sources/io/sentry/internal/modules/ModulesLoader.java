package io.sentry.internal.modules;

import io.sentry.ILogger;
import io.sentry.SentryLevel;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ModulesLoader implements IModulesLoader {
    public static final String EXTERNAL_MODULES_FILENAME = "sentry-external-modules.txt";
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    protected final ILogger logger;
    private final Object modulesLock = new Object();
    private volatile Map<String, String> cachedModules = null;

    public ModulesLoader(ILogger iLogger) {
        this.logger = iLogger;
    }

    @Override // io.sentry.internal.modules.IModulesLoader
    public Map<String, String> getOrLoadModules() {
        if (this.cachedModules == null) {
            synchronized (this.modulesLock) {
                if (this.cachedModules == null) {
                    this.cachedModules = loadModules();
                }
            }
        }
        return this.cachedModules;
    }

    protected abstract Map<String, String> loadModules();

    protected Map<String, String> parseStream(InputStream inputStream) {
        TreeMap treeMap = new TreeMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, UTF_8));
            try {
                for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                    int iLastIndexOf = line.lastIndexOf(58);
                    treeMap.put(line.substring(0, iLastIndexOf), line.substring(iLastIndexOf + 1));
                }
                this.logger.log(SentryLevel.DEBUG, "Extracted %d modules from resources.", Integer.valueOf(treeMap.size()));
                bufferedReader.close();
            } finally {
            }
        } catch (IOException e2) {
            this.logger.log(SentryLevel.ERROR, "Error extracting modules.", e2);
        } catch (RuntimeException e3) {
            this.logger.log(SentryLevel.ERROR, e3, "%s file is malformed.", EXTERNAL_MODULES_FILENAME);
        }
        return treeMap;
    }
}
