package cz.msebera.android.httpclient.impl.client.cache;

import cz.msebera.android.httpclient.client.cache.Resource;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
public class HeapResource implements Resource {
    private static final long serialVersionUID = -2078599905620463394L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f18368b;

    public HeapResource(byte[] bArr) {
        this.f18368b = bArr;
    }

    @Override // cz.msebera.android.httpclient.client.cache.Resource
    public void dispose() {
    }

    byte[] getByteArray() {
        return this.f18368b;
    }

    @Override // cz.msebera.android.httpclient.client.cache.Resource
    public InputStream getInputStream() {
        return new ByteArrayInputStream(this.f18368b);
    }

    @Override // cz.msebera.android.httpclient.client.cache.Resource
    public long length() {
        return this.f18368b.length;
    }
}
