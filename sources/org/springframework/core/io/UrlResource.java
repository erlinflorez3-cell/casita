package org.springframework.core.io;

import com.dynatrace.android.callback.Callback;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import org.springframework.util.Assert;
import org.springframework.util.ResourceUtils;
import org.springframework.util.StringUtils;

/* JADX INFO: loaded from: classes2.dex */
public class UrlResource extends AbstractFileResolvingResource {
    private final URL cleanedUrl;
    private final URI uri;
    private final URL url;

    public UrlResource(String str) throws MalformedURLException {
        Assert.notNull(str, "Path must not be null");
        this.uri = null;
        URL url = new URL(str);
        this.url = url;
        this.cleanedUrl = getCleanedUrl(url, str);
    }

    public UrlResource(String str, String str2) throws MalformedURLException {
        this(str, str2, null);
    }

    public UrlResource(String str, String str2, String str3) throws MalformedURLException {
        try {
            URI uri = new URI(str, str2, str3);
            this.uri = uri;
            URL url = uri.toURL();
            this.url = url;
            this.cleanedUrl = getCleanedUrl(url, uri.toString());
        } catch (URISyntaxException e2) {
            MalformedURLException malformedURLException = new MalformedURLException(e2.getMessage());
            malformedURLException.initCause(e2);
            throw malformedURLException;
        }
    }

    public UrlResource(URI uri) throws MalformedURLException {
        Assert.notNull(uri, "URI must not be null");
        this.uri = uri;
        URL url = uri.toURL();
        this.url = url;
        this.cleanedUrl = getCleanedUrl(url, uri.toString());
    }

    public UrlResource(URL url) {
        Assert.notNull(url, "URL must not be null");
        this.url = url;
        this.cleanedUrl = getCleanedUrl(url, url.toString());
        this.uri = null;
    }

    private URL getCleanedUrl(URL url, String str) {
        try {
            return new URL(StringUtils.cleanPath(str));
        } catch (MalformedURLException unused) {
            return url;
        }
    }

    @Override // org.springframework.core.io.AbstractResource, org.springframework.core.io.Resource
    public Resource createRelative(String str) throws MalformedURLException {
        if (str.startsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
            str = str.substring(1);
        }
        return new UrlResource(new URL(this.url, str));
    }

    @Override // org.springframework.core.io.AbstractResource
    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof UrlResource) && this.cleanedUrl.equals(((UrlResource) obj).cleanedUrl));
    }

    @Override // org.springframework.core.io.Resource
    public String getDescription() {
        return "URL [" + this.url + "]";
    }

    @Override // org.springframework.core.io.AbstractFileResolvingResource, org.springframework.core.io.AbstractResource, org.springframework.core.io.Resource
    public File getFile() throws IOException {
        URI uri = this.uri;
        return uri != null ? super.getFile(uri) : super.getFile();
    }

    @Override // org.springframework.core.io.AbstractResource, org.springframework.core.io.Resource
    public String getFilename() {
        return new File(this.url.getFile()).getName();
    }

    @Override // org.springframework.core.io.InputStreamSource
    public InputStream getInputStream() throws IOException {
        URLConnection uRLConnectionOpenConnection = this.url.openConnection();
        Callback.openConnection(uRLConnectionOpenConnection);
        ResourceUtils.useCachesIfNecessary(uRLConnectionOpenConnection);
        try {
            return Callback.getInputStream(uRLConnectionOpenConnection);
        } catch (IOException e2) {
            if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                ((HttpURLConnection) uRLConnectionOpenConnection).disconnect();
            }
            throw e2;
        }
    }

    @Override // org.springframework.core.io.AbstractResource, org.springframework.core.io.Resource
    public URI getURI() throws IOException {
        URI uri = this.uri;
        return uri != null ? uri : super.getURI();
    }

    @Override // org.springframework.core.io.AbstractResource, org.springframework.core.io.Resource
    public URL getURL() throws IOException {
        return this.url;
    }

    @Override // org.springframework.core.io.AbstractResource
    public int hashCode() {
        return this.cleanedUrl.hashCode();
    }
}
