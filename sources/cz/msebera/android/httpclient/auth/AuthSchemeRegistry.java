package cz.msebera.android.httpclient.auth;

import com.reactnativeincodesdk.ModuleNames;
import cz.msebera.android.httpclient.HttpRequest;
import cz.msebera.android.httpclient.config.Lookup;
import cz.msebera.android.httpclient.params.HttpParams;
import cz.msebera.android.httpclient.protocol.HttpContext;
import cz.msebera.android.httpclient.util.Args;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public final class AuthSchemeRegistry implements Lookup<AuthSchemeProvider> {
    private final ConcurrentHashMap<String, AuthSchemeFactory> registeredSchemes = new ConcurrentHashMap<>();

    public AuthScheme getAuthScheme(String str, HttpParams httpParams) throws IllegalStateException {
        Args.notNull(str, ModuleNames.NAME);
        AuthSchemeFactory authSchemeFactory = this.registeredSchemes.get(str.toLowerCase(Locale.ENGLISH));
        if (authSchemeFactory != null) {
            return authSchemeFactory.newInstance(httpParams);
        }
        throw new IllegalStateException("Unsupported authentication scheme: " + str);
    }

    public List<String> getSchemeNames() {
        return new ArrayList(this.registeredSchemes.keySet());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // cz.msebera.android.httpclient.config.Lookup
    public AuthSchemeProvider lookup(final String str) {
        return new AuthSchemeProvider() { // from class: cz.msebera.android.httpclient.auth.AuthSchemeRegistry.1
            @Override // cz.msebera.android.httpclient.auth.AuthSchemeProvider
            public AuthScheme create(HttpContext httpContext) {
                return AuthSchemeRegistry.this.getAuthScheme(str, ((HttpRequest) httpContext.getAttribute("http.request")).getParams());
            }
        };
    }

    public void register(String str, AuthSchemeFactory authSchemeFactory) {
        Args.notNull(str, ModuleNames.NAME);
        Args.notNull(authSchemeFactory, "Authentication scheme factory");
        this.registeredSchemes.put(str.toLowerCase(Locale.ENGLISH), authSchemeFactory);
    }

    public void setItems(Map<String, AuthSchemeFactory> map) {
        if (map == null) {
            return;
        }
        this.registeredSchemes.clear();
        this.registeredSchemes.putAll(map);
    }

    public void unregister(String str) {
        Args.notNull(str, ModuleNames.NAME);
        this.registeredSchemes.remove(str.toLowerCase(Locale.ENGLISH));
    }
}
