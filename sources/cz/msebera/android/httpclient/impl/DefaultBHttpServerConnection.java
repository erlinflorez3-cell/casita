package cz.msebera.android.httpclient.impl;

import cz.msebera.android.httpclient.HttpEntity;
import cz.msebera.android.httpclient.HttpEntityEnclosingRequest;
import cz.msebera.android.httpclient.HttpException;
import cz.msebera.android.httpclient.HttpRequest;
import cz.msebera.android.httpclient.HttpResponse;
import cz.msebera.android.httpclient.HttpServerConnection;
import cz.msebera.android.httpclient.config.MessageConstraints;
import cz.msebera.android.httpclient.entity.ContentLengthStrategy;
import cz.msebera.android.httpclient.impl.entity.DisallowIdentityContentLengthStrategy;
import cz.msebera.android.httpclient.impl.io.DefaultHttpRequestParserFactory;
import cz.msebera.android.httpclient.impl.io.DefaultHttpResponseWriterFactory;
import cz.msebera.android.httpclient.io.HttpMessageParser;
import cz.msebera.android.httpclient.io.HttpMessageParserFactory;
import cz.msebera.android.httpclient.io.HttpMessageWriter;
import cz.msebera.android.httpclient.io.HttpMessageWriterFactory;
import cz.msebera.android.httpclient.util.Args;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

/* JADX INFO: loaded from: classes5.dex */
public class DefaultBHttpServerConnection extends BHttpConnectionBase implements HttpServerConnection {
    private final HttpMessageParser<HttpRequest> requestParser;
    private final HttpMessageWriter<HttpResponse> responseWriter;

    public DefaultBHttpServerConnection(int i2) {
        this(i2, i2, null, null, null, null, null, null, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DefaultBHttpServerConnection(int i2, int i3, CharsetDecoder charsetDecoder, CharsetEncoder charsetEncoder, MessageConstraints messageConstraints, ContentLengthStrategy contentLengthStrategy, ContentLengthStrategy contentLengthStrategy2, HttpMessageParserFactory<HttpRequest> httpMessageParserFactory, HttpMessageWriterFactory<HttpResponse> httpMessageWriterFactory) {
        ContentLengthStrategy contentLengthStrategy3 = contentLengthStrategy;
        HttpMessageParserFactory<HttpRequest> httpMessageParserFactory2 = httpMessageParserFactory;
        HttpMessageWriterFactory<HttpResponse> httpMessageWriterFactory2 = httpMessageWriterFactory;
        super(i2, i3, charsetDecoder, charsetEncoder, messageConstraints, contentLengthStrategy3 == null ? DisallowIdentityContentLengthStrategy.INSTANCE : contentLengthStrategy3, contentLengthStrategy2);
        this.requestParser = (httpMessageParserFactory2 == null ? DefaultHttpRequestParserFactory.INSTANCE : httpMessageParserFactory2).create(getSessionInputBuffer(), messageConstraints);
        this.responseWriter = (httpMessageWriterFactory2 == null ? DefaultHttpResponseWriterFactory.INSTANCE : httpMessageWriterFactory2).create(getSessionOutputBuffer());
    }

    public DefaultBHttpServerConnection(int i2, CharsetDecoder charsetDecoder, CharsetEncoder charsetEncoder, MessageConstraints messageConstraints) {
        this(i2, i2, charsetDecoder, charsetEncoder, messageConstraints, null, null, null, null);
    }

    @Override // cz.msebera.android.httpclient.impl.BHttpConnectionBase
    public void bind(Socket socket) throws IOException {
        super.bind(socket);
    }

    @Override // cz.msebera.android.httpclient.HttpServerConnection
    public void flush() throws IOException {
        ensureOpen();
        doFlush();
    }

    protected void onRequestReceived(HttpRequest httpRequest) {
    }

    protected void onResponseSubmitted(HttpResponse httpResponse) {
    }

    @Override // cz.msebera.android.httpclient.HttpServerConnection
    public void receiveRequestEntity(HttpEntityEnclosingRequest httpEntityEnclosingRequest) throws HttpException, IOException {
        Args.notNull(httpEntityEnclosingRequest, "HTTP request");
        ensureOpen();
        httpEntityEnclosingRequest.setEntity(prepareInput(httpEntityEnclosingRequest));
    }

    @Override // cz.msebera.android.httpclient.HttpServerConnection
    public HttpRequest receiveRequestHeader() throws HttpException, IOException {
        ensureOpen();
        HttpRequest httpRequest = (HttpRequest) this.requestParser.parse();
        onRequestReceived(httpRequest);
        incrementRequestCount();
        return httpRequest;
    }

    @Override // cz.msebera.android.httpclient.HttpServerConnection
    public void sendResponseEntity(HttpResponse httpResponse) throws IOException, HttpException {
        Args.notNull(httpResponse, "HTTP response");
        ensureOpen();
        HttpEntity entity = httpResponse.getEntity();
        if (entity == null) {
            return;
        }
        OutputStream outputStreamPrepareOutput = prepareOutput(httpResponse);
        entity.writeTo(outputStreamPrepareOutput);
        outputStreamPrepareOutput.close();
    }

    @Override // cz.msebera.android.httpclient.HttpServerConnection
    public void sendResponseHeader(HttpResponse httpResponse) throws IOException, HttpException {
        Args.notNull(httpResponse, "HTTP response");
        ensureOpen();
        this.responseWriter.write(httpResponse);
        onResponseSubmitted(httpResponse);
        if (httpResponse.getStatusLine().getStatusCode() >= 200) {
            incrementResponseCount();
        }
    }
}
