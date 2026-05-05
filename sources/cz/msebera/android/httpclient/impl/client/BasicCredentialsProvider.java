package cz.msebera.android.httpclient.impl.client;

import cz.msebera.android.httpclient.auth.AuthScope;
import cz.msebera.android.httpclient.auth.Credentials;
import cz.msebera.android.httpclient.client.CredentialsProvider;
import cz.msebera.android.httpclient.util.Args;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public class BasicCredentialsProvider implements CredentialsProvider {
    private final ConcurrentHashMap<AuthScope, Credentials> credMap = new ConcurrentHashMap<>();

    private static Credentials matchCredentials(Map<AuthScope, Credentials> map, AuthScope authScope) {
        Credentials credentials = map.get(authScope);
        if (credentials != null) {
            return credentials;
        }
        int i2 = -1;
        AuthScope authScope2 = null;
        for (AuthScope authScope3 : map.keySet()) {
            int iMatch = authScope.match(authScope3);
            if (iMatch > i2) {
                authScope2 = authScope3;
                i2 = iMatch;
            }
        }
        return authScope2 != null ? map.get(authScope2) : credentials;
    }

    @Override // cz.msebera.android.httpclient.client.CredentialsProvider
    public void clear() {
        this.credMap.clear();
    }

    @Override // cz.msebera.android.httpclient.client.CredentialsProvider
    public Credentials getCredentials(AuthScope authScope) {
        Args.notNull(authScope, "Authentication scope");
        return matchCredentials(this.credMap, authScope);
    }

    @Override // cz.msebera.android.httpclient.client.CredentialsProvider
    public void setCredentials(AuthScope authScope, Credentials credentials) {
        Args.notNull(authScope, "Authentication scope");
        this.credMap.put(authScope, credentials);
    }

    public String toString() {
        return this.credMap.toString();
    }
}
