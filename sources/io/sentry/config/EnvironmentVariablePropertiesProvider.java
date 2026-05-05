package io.sentry.config;

import com.dynatrace.android.agent.Global;
import io.sentry.util.StringUtils;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
final class EnvironmentVariablePropertiesProvider implements PropertiesProvider {
    private static final String PREFIX = "SENTRY";

    EnvironmentVariablePropertiesProvider() {
    }

    private String propertyToEnvironmentVariableName(String str) {
        return "SENTRY_" + str.replace(".", Global.UNDERSCORE).replace(Global.HYPHEN, Global.UNDERSCORE).toUpperCase(Locale.ROOT);
    }

    @Override // io.sentry.config.PropertiesProvider
    public Map<String, String> getMap(String str) {
        String strRemoveSurrounding;
        String str2 = propertyToEnvironmentVariableName(str) + Global.UNDERSCORE;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry<String, String> entry : System.getenv().entrySet()) {
            String key = entry.getKey();
            if (key.startsWith(str2) && (strRemoveSurrounding = StringUtils.removeSurrounding(entry.getValue(), "\"")) != null) {
                concurrentHashMap.put(key.substring(str2.length()).toLowerCase(Locale.ROOT), strRemoveSurrounding);
            }
        }
        return concurrentHashMap;
    }

    @Override // io.sentry.config.PropertiesProvider
    public String getProperty(String str) {
        return StringUtils.removeSurrounding(System.getenv(propertyToEnvironmentVariableName(str)), "\"");
    }
}
