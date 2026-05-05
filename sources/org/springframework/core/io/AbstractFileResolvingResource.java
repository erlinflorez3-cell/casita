package org.springframework.core.io;

import com.dynatrace.android.callback.Callback;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import org.springframework.util.ResourceUtils;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractFileResolvingResource extends AbstractResource {
    @Override // org.springframework.core.io.AbstractResource, org.springframework.core.io.Resource
    public long contentLength() throws IOException {
        URL url = getURL();
        if (ResourceUtils.isFileURL(url)) {
            return getFile().length();
        }
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        Callback.openConnection(uRLConnectionOpenConnection);
        customizeConnection(uRLConnectionOpenConnection);
        return Callback.getContentLength(uRLConnectionOpenConnection);
    }

    protected void customizeConnection(HttpURLConnection httpURLConnection) throws IOException {
        httpURLConnection.setRequestMethod("HEAD");
    }

    protected void customizeConnection(URLConnection uRLConnection) throws IOException {
        ResourceUtils.useCachesIfNecessary(uRLConnection);
        if (uRLConnection instanceof HttpURLConnection) {
            customizeConnection((HttpURLConnection) uRLConnection);
        }
    }

    @Override // org.springframework.core.io.AbstractResource, org.springframework.core.io.Resource
    public boolean exists() throws Exception {
        try {
            URL url = getURL();
            if (ResourceUtils.isFileURL(url)) {
                return getFile().exists();
            }
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            Callback.openConnection(uRLConnectionOpenConnection);
            customizeConnection(uRLConnectionOpenConnection);
            HttpURLConnection httpURLConnection = uRLConnectionOpenConnection instanceof HttpURLConnection ? (HttpURLConnection) uRLConnectionOpenConnection : null;
            if (httpURLConnection != null) {
                int responseCode = Callback.getResponseCode(httpURLConnection);
                if (responseCode == 200) {
                    return true;
                }
                if (responseCode == 404) {
                    return false;
                }
            }
            if (Callback.getContentLength(uRLConnectionOpenConnection) >= 0) {
                return true;
            }
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
                return false;
            }
            getInputStream().close();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // org.springframework.core.io.AbstractResource, org.springframework.core.io.Resource
    public File getFile() throws IOException {
        return ResourceUtils.getFile(getURL(), getDescription());
    }

    protected File getFile(URI uri) throws IOException {
        return ResourceUtils.getFile(uri, getDescription());
    }

    @Override // org.springframework.core.io.AbstractResource
    protected File getFileForLastModifiedCheck() throws IOException {
        URL url = getURL();
        return ResourceUtils.isJarURL(url) ? ResourceUtils.getFile(ResourceUtils.extractJarFileURL(url), "Jar URL") : getFile();
    }

    @Override // org.springframework.core.io.AbstractResource, org.springframework.core.io.Resource
    public boolean isReadable() {
        try {
            if (!ResourceUtils.isFileURL(getURL())) {
                return true;
            }
            File file = getFile();
            if (file.canRead()) {
                return !file.isDirectory();
            }
            return false;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // org.springframework.core.io.AbstractResource, org.springframework.core.io.Resource
    public long lastModified() throws IOException {
        URL url = getURL();
        if (ResourceUtils.isFileURL(url) || ResourceUtils.isJarURL(url)) {
            return super.lastModified();
        }
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        Callback.openConnection(uRLConnectionOpenConnection);
        customizeConnection(uRLConnectionOpenConnection);
        return Callback.getLastModified(uRLConnectionOpenConnection);
    }
}
