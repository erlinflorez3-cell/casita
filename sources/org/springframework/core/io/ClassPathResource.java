package org.springframework.core.io;

import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.springframework.util.Assert;
import org.springframework.util.ClassUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

/* JADX INFO: loaded from: classes2.dex */
public class ClassPathResource extends AbstractFileResolvingResource {
    private ClassLoader classLoader;
    private Class<?> clazz;
    private final String path;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClassPathResource(String str) {
        this(str, (ClassLoader) null);
    }

    public ClassPathResource(String str, Class<?> cls) {
        Assert.notNull(str, "Path must not be null");
        this.path = StringUtils.cleanPath(str);
        this.clazz = cls;
    }

    public ClassPathResource(String str, ClassLoader classLoader) {
        Assert.notNull(str, "Path must not be null");
        String strCleanPath = StringUtils.cleanPath(str);
        this.path = strCleanPath.startsWith(RemoteSettings.FORWARD_SLASH_STRING) ? strCleanPath.substring(1) : strCleanPath;
        this.classLoader = classLoader == null ? ClassUtils.getDefaultClassLoader() : classLoader;
    }

    protected ClassPathResource(String str, ClassLoader classLoader, Class<?> cls) {
        this.path = StringUtils.cleanPath(str);
        this.classLoader = classLoader;
        this.clazz = cls;
    }

    @Override // org.springframework.core.io.AbstractResource, org.springframework.core.io.Resource
    public Resource createRelative(String str) {
        return new ClassPathResource(StringUtils.applyRelativePath(this.path, str), this.classLoader, this.clazz);
    }

    @Override // org.springframework.core.io.AbstractResource
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClassPathResource)) {
            return false;
        }
        ClassPathResource classPathResource = (ClassPathResource) obj;
        return this.path.equals(classPathResource.path) && ObjectUtils.nullSafeEquals(this.classLoader, classPathResource.classLoader) && ObjectUtils.nullSafeEquals(this.clazz, classPathResource.clazz);
    }

    @Override // org.springframework.core.io.AbstractFileResolvingResource, org.springframework.core.io.AbstractResource, org.springframework.core.io.Resource
    public boolean exists() {
        return resolveURL() != null;
    }

    public final ClassLoader getClassLoader() {
        Class<?> cls = this.clazz;
        return cls != null ? cls.getClassLoader() : this.classLoader;
    }

    @Override // org.springframework.core.io.Resource
    public String getDescription() {
        StringBuilder sb = new StringBuilder("class path resource [");
        String strSubstring = this.path;
        if (this.clazz != null && !strSubstring.startsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
            sb.append(ClassUtils.classPackageAsResourcePath(this.clazz));
            sb.append('/');
        }
        if (strSubstring.startsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
            strSubstring = strSubstring.substring(1);
        }
        sb.append(strSubstring);
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    @Override // org.springframework.core.io.AbstractResource, org.springframework.core.io.Resource
    public String getFilename() {
        return StringUtils.getFilename(this.path);
    }

    @Override // org.springframework.core.io.InputStreamSource
    public InputStream getInputStream() throws IOException {
        InputStream resourceAsStream;
        Class<?> cls = this.clazz;
        if (cls != null) {
            resourceAsStream = cls.getResourceAsStream(this.path);
        } else {
            ClassLoader classLoader = this.classLoader;
            resourceAsStream = classLoader != null ? classLoader.getResourceAsStream(this.path) : ClassLoader.getSystemResourceAsStream(this.path);
        }
        if (resourceAsStream != null) {
            return resourceAsStream;
        }
        throw new FileNotFoundException(getDescription() + " cannot be opened because it does not exist");
    }

    public final String getPath() {
        return this.path;
    }

    @Override // org.springframework.core.io.AbstractResource, org.springframework.core.io.Resource
    public URL getURL() throws IOException {
        URL urlResolveURL = resolveURL();
        if (urlResolveURL != null) {
            return urlResolveURL;
        }
        throw new FileNotFoundException(getDescription() + " cannot be resolved to URL because it does not exist");
    }

    @Override // org.springframework.core.io.AbstractResource
    public int hashCode() {
        return this.path.hashCode();
    }

    protected URL resolveURL() {
        Class<?> cls = this.clazz;
        if (cls != null) {
            return cls.getResource(this.path);
        }
        ClassLoader classLoader = this.classLoader;
        return classLoader != null ? classLoader.getResource(this.path) : ClassLoader.getSystemResource(this.path);
    }
}
