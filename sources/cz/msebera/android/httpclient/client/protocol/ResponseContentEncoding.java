package cz.msebera.android.httpclient.client.protocol;

import cz.msebera.android.httpclient.Header;
import cz.msebera.android.httpclient.HeaderElement;
import cz.msebera.android.httpclient.HttpEntity;
import cz.msebera.android.httpclient.HttpException;
import cz.msebera.android.httpclient.HttpResponse;
import cz.msebera.android.httpclient.HttpResponseInterceptor;
import cz.msebera.android.httpclient.client.entity.DecompressingEntity;
import cz.msebera.android.httpclient.client.entity.DeflateInputStreamFactory;
import cz.msebera.android.httpclient.client.entity.GZIPInputStreamFactory;
import cz.msebera.android.httpclient.client.entity.InputStreamFactory;
import cz.msebera.android.httpclient.config.Lookup;
import cz.msebera.android.httpclient.config.RegistryBuilder;
import cz.msebera.android.httpclient.protocol.HttpContext;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public class ResponseContentEncoding implements HttpResponseInterceptor {
    public static final String UNCOMPRESSED = "http.client.response.uncompressed";
    private final Lookup<InputStreamFactory> decoderRegistry;
    private final boolean ignoreUnknown;

    public ResponseContentEncoding() {
        this((Lookup<InputStreamFactory>) null);
    }

    public ResponseContentEncoding(Lookup<InputStreamFactory> lookup) {
        this(lookup, true);
    }

    public ResponseContentEncoding(Lookup<InputStreamFactory> lookup, boolean z2) {
        this.decoderRegistry = lookup == null ? RegistryBuilder.create().register("gzip", GZIPInputStreamFactory.getInstance()).register("x-gzip", GZIPInputStreamFactory.getInstance()).register("deflate", DeflateInputStreamFactory.getInstance()).build() : lookup;
        this.ignoreUnknown = z2;
    }

    public ResponseContentEncoding(boolean z2) {
        this(null, z2);
    }

    @Override // cz.msebera.android.httpclient.HttpResponseInterceptor
    public void process(HttpResponse httpResponse, HttpContext httpContext) throws HttpException, IOException {
        Header contentEncoding;
        HttpEntity entity = httpResponse.getEntity();
        if (!HttpClientContext.adapt(httpContext).getRequestConfig().isContentCompressionEnabled() || entity == null || entity.getContentLength() == 0 || (contentEncoding = entity.getContentEncoding()) == null) {
            return;
        }
        for (HeaderElement headerElement : contentEncoding.getElements()) {
            String lowerCase = headerElement.getName().toLowerCase(Locale.ROOT);
            InputStreamFactory inputStreamFactoryLookup = this.decoderRegistry.lookup(lowerCase);
            if (inputStreamFactoryLookup != null) {
                httpResponse.setEntity(new DecompressingEntity(httpResponse.getEntity(), inputStreamFactoryLookup));
                httpResponse.removeHeaders("Content-Length");
                httpResponse.removeHeaders("Content-Encoding");
                httpResponse.removeHeaders("Content-MD5");
            } else if (!"identity".equals(lowerCase) && !this.ignoreUnknown) {
                throw new HttpException("Unsupported Content-Encoding: " + headerElement.getName());
            }
        }
    }
}
