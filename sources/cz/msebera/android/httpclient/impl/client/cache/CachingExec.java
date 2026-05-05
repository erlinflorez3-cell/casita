package cz.msebera.android.httpclient.impl.client.cache;

import androidx.webkit.ProxyConfig;
import com.dynatrace.android.agent.AdkSettings;
import cz.msebera.android.httpclient.Header;
import cz.msebera.android.httpclient.HeaderElement;
import cz.msebera.android.httpclient.HttpException;
import cz.msebera.android.httpclient.HttpHost;
import cz.msebera.android.httpclient.HttpMessage;
import cz.msebera.android.httpclient.HttpRequest;
import cz.msebera.android.httpclient.HttpResponse;
import cz.msebera.android.httpclient.HttpVersion;
import cz.msebera.android.httpclient.ProtocolException;
import cz.msebera.android.httpclient.ProtocolVersion;
import cz.msebera.android.httpclient.RequestLine;
import cz.msebera.android.httpclient.client.cache.CacheResponseStatus;
import cz.msebera.android.httpclient.client.cache.HeaderConstants;
import cz.msebera.android.httpclient.client.cache.HttpCacheContext;
import cz.msebera.android.httpclient.client.cache.HttpCacheEntry;
import cz.msebera.android.httpclient.client.cache.HttpCacheStorage;
import cz.msebera.android.httpclient.client.cache.ResourceFactory;
import cz.msebera.android.httpclient.client.methods.CloseableHttpResponse;
import cz.msebera.android.httpclient.client.methods.HttpExecutionAware;
import cz.msebera.android.httpclient.client.methods.HttpRequestWrapper;
import cz.msebera.android.httpclient.client.protocol.HttpClientContext;
import cz.msebera.android.httpclient.client.utils.DateUtils;
import cz.msebera.android.httpclient.client.utils.URIUtils;
import cz.msebera.android.httpclient.conn.routing.HttpRoute;
import cz.msebera.android.httpclient.extras.HttpClientAndroidLog;
import cz.msebera.android.httpclient.impl.execchain.ClientExecChain;
import cz.msebera.android.httpclient.message.BasicHttpResponse;
import cz.msebera.android.httpclient.protocol.HttpContext;
import cz.msebera.android.httpclient.util.Args;
import cz.msebera.android.httpclient.util.VersionInfo;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes5.dex */
public class CachingExec implements ClientExecChain {
    private static final boolean SUPPORTS_RANGE_AND_CONTENT_RANGE_HEADERS = false;
    private final AsynchronousValidator asynchRevalidator;
    private final ClientExecChain backend;
    private final CacheConfig cacheConfig;
    private final AtomicLong cacheHits;
    private final AtomicLong cacheMisses;
    private final AtomicLong cacheUpdates;
    private final CacheableRequestPolicy cacheableRequestPolicy;
    private final ConditionalRequestBuilder conditionalRequestBuilder;
    public HttpClientAndroidLog log;
    private final RequestProtocolCompliance requestCompliance;
    private final HttpCache responseCache;
    private final ResponseCachingPolicy responseCachingPolicy;
    private final ResponseProtocolCompliance responseCompliance;
    private final CachedHttpResponseGenerator responseGenerator;
    private final CachedResponseSuitabilityChecker suitabilityChecker;
    private final CacheValidityPolicy validityPolicy;
    private final Map<ProtocolVersion, String> viaHeaders;

    public CachingExec(ClientExecChain clientExecChain) {
        this(clientExecChain, new BasicHttpCache(), CacheConfig.DEFAULT);
    }

    public CachingExec(ClientExecChain clientExecChain, ResourceFactory resourceFactory, HttpCacheStorage httpCacheStorage, CacheConfig cacheConfig) {
        this(clientExecChain, new BasicHttpCache(resourceFactory, httpCacheStorage, cacheConfig), cacheConfig);
    }

    public CachingExec(ClientExecChain clientExecChain, HttpCache httpCache, CacheConfig cacheConfig) {
        this(clientExecChain, httpCache, cacheConfig, (AsynchronousValidator) null);
    }

    public CachingExec(ClientExecChain clientExecChain, HttpCache httpCache, CacheConfig cacheConfig, AsynchronousValidator asynchronousValidator) {
        this.cacheHits = new AtomicLong();
        this.cacheMisses = new AtomicLong();
        this.cacheUpdates = new AtomicLong();
        this.viaHeaders = new HashMap(4);
        this.log = new HttpClientAndroidLog(getClass());
        Args.notNull(clientExecChain, "HTTP backend");
        Args.notNull(httpCache, "HttpCache");
        cacheConfig = cacheConfig == null ? CacheConfig.DEFAULT : cacheConfig;
        this.cacheConfig = cacheConfig;
        this.backend = clientExecChain;
        this.responseCache = httpCache;
        CacheValidityPolicy cacheValidityPolicy = new CacheValidityPolicy();
        this.validityPolicy = cacheValidityPolicy;
        this.responseGenerator = new CachedHttpResponseGenerator(cacheValidityPolicy);
        this.cacheableRequestPolicy = new CacheableRequestPolicy();
        this.suitabilityChecker = new CachedResponseSuitabilityChecker(cacheValidityPolicy, cacheConfig);
        this.conditionalRequestBuilder = new ConditionalRequestBuilder();
        this.responseCompliance = new ResponseProtocolCompliance();
        this.requestCompliance = new RequestProtocolCompliance(cacheConfig.isWeakETagOnPutDeleteAllowed());
        this.responseCachingPolicy = new ResponseCachingPolicy(cacheConfig.getMaxObjectSize(), cacheConfig.isSharedCache(), cacheConfig.isNeverCacheHTTP10ResponsesWithQuery(), cacheConfig.is303CachingEnabled());
        this.asynchRevalidator = asynchronousValidator;
    }

    CachingExec(ClientExecChain clientExecChain, HttpCache httpCache, CacheValidityPolicy cacheValidityPolicy, ResponseCachingPolicy responseCachingPolicy, CachedHttpResponseGenerator cachedHttpResponseGenerator, CacheableRequestPolicy cacheableRequestPolicy, CachedResponseSuitabilityChecker cachedResponseSuitabilityChecker, ConditionalRequestBuilder conditionalRequestBuilder, ResponseProtocolCompliance responseProtocolCompliance, RequestProtocolCompliance requestProtocolCompliance, CacheConfig cacheConfig, AsynchronousValidator asynchronousValidator) {
        this.cacheHits = new AtomicLong();
        this.cacheMisses = new AtomicLong();
        this.cacheUpdates = new AtomicLong();
        this.viaHeaders = new HashMap(4);
        this.log = new HttpClientAndroidLog(getClass());
        this.cacheConfig = cacheConfig == null ? CacheConfig.DEFAULT : cacheConfig;
        this.backend = clientExecChain;
        this.responseCache = httpCache;
        this.validityPolicy = cacheValidityPolicy;
        this.responseCachingPolicy = responseCachingPolicy;
        this.responseGenerator = cachedHttpResponseGenerator;
        this.cacheableRequestPolicy = cacheableRequestPolicy;
        this.suitabilityChecker = cachedResponseSuitabilityChecker;
        this.conditionalRequestBuilder = conditionalRequestBuilder;
        this.responseCompliance = responseProtocolCompliance;
        this.requestCompliance = requestProtocolCompliance;
        this.asynchRevalidator = asynchronousValidator;
    }

    private boolean alreadyHaveNewerCacheEntry(HttpHost httpHost, HttpRequestWrapper httpRequestWrapper, HttpResponse httpResponse) {
        HttpCacheEntry cacheEntry;
        Header firstHeader;
        Header firstHeader2;
        try {
            cacheEntry = this.responseCache.getCacheEntry(httpHost, httpRequestWrapper);
        } catch (IOException unused) {
            cacheEntry = null;
        }
        if (cacheEntry == null || (firstHeader = cacheEntry.getFirstHeader("Date")) == null || (firstHeader2 = httpResponse.getFirstHeader("Date")) == null) {
            return false;
        }
        Date date = DateUtils.parseDate(firstHeader.getValue());
        Date date2 = DateUtils.parseDate(firstHeader2.getValue());
        if (date == null || date2 == null) {
            return false;
        }
        return date2.before(date);
    }

    private boolean explicitFreshnessRequest(HttpRequestWrapper httpRequestWrapper, HttpCacheEntry httpCacheEntry, Date date) {
        for (Header header : httpRequestWrapper.getHeaders("Cache-Control")) {
            for (HeaderElement headerElement : header.getElements()) {
                if (HeaderConstants.CACHE_CONTROL_MAX_STALE.equals(headerElement.getName())) {
                    try {
                    } catch (NumberFormatException unused) {
                    }
                    if (this.validityPolicy.getCurrentAgeSecs(httpCacheEntry, date) - this.validityPolicy.getFreshnessLifetimeSecs(httpCacheEntry) > Integer.parseInt(headerElement.getValue())) {
                        return true;
                    }
                } else if (HeaderConstants.CACHE_CONTROL_MIN_FRESH.equals(headerElement.getName()) || "max-age".equals(headerElement.getName())) {
                    return true;
                }
            }
        }
        return false;
    }

    private void flushEntriesInvalidatedByRequest(HttpHost httpHost, HttpRequestWrapper httpRequestWrapper) {
        try {
            this.responseCache.flushInvalidatedCacheEntriesFor(httpHost, httpRequestWrapper);
        } catch (IOException e2) {
            this.log.warn("Unable to flush invalidated entries from cache", e2);
        }
    }

    private CloseableHttpResponse generateCachedResponse(HttpRequestWrapper httpRequestWrapper, HttpContext httpContext, HttpCacheEntry httpCacheEntry, Date date) {
        CloseableHttpResponse closeableHttpResponseGenerateNotModifiedResponse = (httpRequestWrapper.containsHeader("If-None-Match") || httpRequestWrapper.containsHeader("If-Modified-Since")) ? this.responseGenerator.generateNotModifiedResponse(httpCacheEntry) : this.responseGenerator.generateResponse(httpRequestWrapper, httpCacheEntry);
        setResponseStatus(httpContext, CacheResponseStatus.CACHE_HIT);
        if (this.validityPolicy.getStalenessSecs(httpCacheEntry, date) > 0) {
            closeableHttpResponseGenerateNotModifiedResponse.addHeader("Warning", "110 localhost \"Response is stale\"");
        }
        return closeableHttpResponseGenerateNotModifiedResponse;
    }

    private CloseableHttpResponse generateGatewayTimeout(HttpContext httpContext) {
        setResponseStatus(httpContext, CacheResponseStatus.CACHE_MODULE_RESPONSE);
        return Proxies.enhanceResponse(new BasicHttpResponse(HttpVersion.HTTP_1_1, 504, "Gateway Timeout"));
    }

    private String generateViaHeader(HttpMessage httpMessage) {
        ProtocolVersion protocolVersion = httpMessage.getProtocolVersion();
        String str = this.viaHeaders.get(protocolVersion);
        if (str != null) {
            return str;
        }
        VersionInfo versionInfoLoadVersionInfo = VersionInfo.loadVersionInfo("cz.msebera.android.httpclient.client", getClass().getClassLoader());
        String release = versionInfoLoadVersionInfo != null ? versionInfoLoadVersionInfo.getRelease() : VersionInfo.UNAVAILABLE;
        int major = protocolVersion.getMajor();
        int minor = protocolVersion.getMinor();
        String str2 = "http".equalsIgnoreCase(protocolVersion.getProtocol()) ? String.format("%d.%d localhost (Apache-HttpClient/%s (cache))", Integer.valueOf(major), Integer.valueOf(minor), release) : String.format("%s/%d.%d localhost (Apache-HttpClient/%s (cache))", protocolVersion.getProtocol(), Integer.valueOf(major), Integer.valueOf(minor), release);
        this.viaHeaders.put(protocolVersion, str2);
        return str2;
    }

    private Map<String, Variant> getExistingCacheVariants(HttpHost httpHost, HttpRequestWrapper httpRequestWrapper) {
        try {
            return this.responseCache.getVariantCacheEntriesWithEtags(httpHost, httpRequestWrapper);
        } catch (IOException e2) {
            this.log.warn("Unable to retrieve variant entries from cache", e2);
            return null;
        }
    }

    private HttpResponse getFatallyNoncompliantResponse(HttpRequestWrapper httpRequestWrapper, HttpContext httpContext) {
        HttpResponse errorForRequest = null;
        for (RequestProtocolError requestProtocolError : this.requestCompliance.requestIsFatallyNonCompliant(httpRequestWrapper)) {
            setResponseStatus(httpContext, CacheResponseStatus.CACHE_MODULE_RESPONSE);
            errorForRequest = this.requestCompliance.getErrorForRequest(requestProtocolError);
        }
        return errorForRequest;
    }

    private HttpCacheEntry getUpdatedVariantEntry(HttpHost httpHost, HttpRequestWrapper httpRequestWrapper, Date date, Date date2, CloseableHttpResponse closeableHttpResponse, Variant variant, HttpCacheEntry httpCacheEntry) throws IOException {
        HttpCacheEntry httpCacheEntryUpdateVariantCacheEntry = httpCacheEntry;
        try {
            try {
                httpCacheEntryUpdateVariantCacheEntry = this.responseCache.updateVariantCacheEntry(httpHost, httpRequestWrapper, httpCacheEntryUpdateVariantCacheEntry, closeableHttpResponse, date, date2, variant.getCacheKey());
            } catch (IOException e2) {
                this.log.warn("Could not update cache entry", e2);
            }
            return httpCacheEntryUpdateVariantCacheEntry;
        } finally {
            closeableHttpResponse.close();
        }
    }

    private CloseableHttpResponse handleCacheHit(HttpRoute httpRoute, HttpRequestWrapper httpRequestWrapper, HttpClientContext httpClientContext, HttpExecutionAware httpExecutionAware, HttpCacheEntry httpCacheEntry) throws IOException, HttpException {
        CloseableHttpResponse closeableHttpResponseGenerateGatewayTimeout;
        HttpHost targetHost = httpClientContext.getTargetHost();
        recordCacheHit(targetHost, httpRequestWrapper);
        Date currentDate = getCurrentDate();
        if (this.suitabilityChecker.canCachedResponseBeUsed(targetHost, httpRequestWrapper, httpCacheEntry, currentDate)) {
            this.log.debug("Cache hit");
            closeableHttpResponseGenerateGatewayTimeout = generateCachedResponse(httpRequestWrapper, httpClientContext, httpCacheEntry, currentDate);
        } else {
            if (mayCallBackend(httpRequestWrapper)) {
                if (httpCacheEntry.getStatusCode() != 304 || this.suitabilityChecker.isConditional(httpRequestWrapper)) {
                    this.log.debug("Revalidating cache entry");
                    return revalidateCacheEntry(httpRoute, httpRequestWrapper, httpClientContext, httpExecutionAware, httpCacheEntry, currentDate);
                }
                this.log.debug("Cache entry not usable; calling backend");
                return callBackend(httpRoute, httpRequestWrapper, httpClientContext, httpExecutionAware);
            }
            this.log.debug("Cache entry not suitable but only-if-cached requested");
            closeableHttpResponseGenerateGatewayTimeout = generateGatewayTimeout(httpClientContext);
        }
        httpClientContext.setAttribute("http.route", httpRoute);
        httpClientContext.setAttribute("http.target_host", targetHost);
        httpClientContext.setAttribute("http.request", httpRequestWrapper);
        httpClientContext.setAttribute("http.response", closeableHttpResponseGenerateGatewayTimeout);
        httpClientContext.setAttribute("http.request_sent", Boolean.TRUE);
        return closeableHttpResponseGenerateGatewayTimeout;
    }

    private CloseableHttpResponse handleCacheMiss(HttpRoute httpRoute, HttpRequestWrapper httpRequestWrapper, HttpClientContext httpClientContext, HttpExecutionAware httpExecutionAware) throws IOException, HttpException {
        HttpHost targetHost = httpClientContext.getTargetHost();
        recordCacheMiss(targetHost, httpRequestWrapper);
        if (!mayCallBackend(httpRequestWrapper)) {
            return Proxies.enhanceResponse(new BasicHttpResponse(HttpVersion.HTTP_1_1, 504, "Gateway Timeout"));
        }
        Map<String, Variant> existingCacheVariants = getExistingCacheVariants(targetHost, httpRequestWrapper);
        return (existingCacheVariants == null || existingCacheVariants.isEmpty()) ? callBackend(httpRoute, httpRequestWrapper, httpClientContext, httpExecutionAware) : negotiateResponseFromVariants(httpRoute, httpRequestWrapper, httpClientContext, httpExecutionAware, existingCacheVariants);
    }

    private CloseableHttpResponse handleRevalidationFailure(HttpRequestWrapper httpRequestWrapper, HttpContext httpContext, HttpCacheEntry httpCacheEntry, Date date) {
        return staleResponseNotAllowed(httpRequestWrapper, httpCacheEntry, date) ? generateGatewayTimeout(httpContext) : unvalidatedCacheHit(httpRequestWrapper, httpContext, httpCacheEntry);
    }

    private boolean mayCallBackend(HttpRequestWrapper httpRequestWrapper) {
        for (Header header : httpRequestWrapper.getHeaders("Cache-Control")) {
            for (HeaderElement headerElement : header.getElements()) {
                if ("only-if-cached".equals(headerElement.getName())) {
                    this.log.trace("Request marked only-if-cached");
                    return false;
                }
            }
        }
        return true;
    }

    private void recordCacheHit(HttpHost httpHost, HttpRequestWrapper httpRequestWrapper) {
        this.cacheHits.getAndIncrement();
        if (this.log.isTraceEnabled()) {
            this.log.trace("Cache hit [host: " + httpHost + "; uri: " + httpRequestWrapper.getRequestLine().getUri() + "]");
        }
    }

    private void recordCacheMiss(HttpHost httpHost, HttpRequestWrapper httpRequestWrapper) {
        this.cacheMisses.getAndIncrement();
        if (this.log.isTraceEnabled()) {
            this.log.trace("Cache miss [host: " + httpHost + "; uri: " + httpRequestWrapper.getRequestLine().getUri() + "]");
        }
    }

    private void recordCacheUpdate(HttpContext httpContext) {
        this.cacheUpdates.getAndIncrement();
        setResponseStatus(httpContext, CacheResponseStatus.VALIDATED);
    }

    private CloseableHttpResponse retryRequestUnconditionally(HttpRoute httpRoute, HttpRequestWrapper httpRequestWrapper, HttpClientContext httpClientContext, HttpExecutionAware httpExecutionAware, HttpCacheEntry httpCacheEntry) throws IOException, HttpException {
        return callBackend(httpRoute, this.conditionalRequestBuilder.buildUnconditionalRequest(httpRequestWrapper, httpCacheEntry), httpClientContext, httpExecutionAware);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0033: INVOKE (r0 I:cz.msebera.android.httpclient.client.methods.CloseableHttpResponse) = 
  (r8v0 ?? I:cz.msebera.android.httpclient.impl.client.cache.CachingExec)
  (r4 I:cz.msebera.android.httpclient.client.methods.HttpRequestWrapper)
  (r5 I:cz.msebera.android.httpclient.protocol.HttpContext)
  (r7 I:cz.msebera.android.httpclient.client.cache.HttpCacheEntry)
  (r14 I:java.util.Date)
 DIRECT call: cz.msebera.android.httpclient.impl.client.cache.CachingExec.handleRevalidationFailure(cz.msebera.android.httpclient.client.methods.HttpRequestWrapper, cz.msebera.android.httpclient.protocol.HttpContext, cz.msebera.android.httpclient.client.cache.HttpCacheEntry, java.util.Date):cz.msebera.android.httpclient.client.methods.CloseableHttpResponse A[MD:(cz.msebera.android.httpclient.client.methods.HttpRequestWrapper, cz.msebera.android.httpclient.protocol.HttpContext, cz.msebera.android.httpclient.client.cache.HttpCacheEntry, java.util.Date):cz.msebera.android.httpclient.client.methods.CloseableHttpResponse (m)], block:B:27:0x0033 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0033: INVOKE (r0 I:cz.msebera.android.httpclient.client.methods.CloseableHttpResponse) = 
  (r8v0 ?? I:cz.msebera.android.httpclient.impl.client.cache.CachingExec)
  (r4v0 ?? I:cz.msebera.android.httpclient.client.methods.HttpRequestWrapper)
  (r5 I:cz.msebera.android.httpclient.protocol.HttpContext)
  (r7 I:cz.msebera.android.httpclient.client.cache.HttpCacheEntry)
  (r14 I:java.util.Date)
 DIRECT call: cz.msebera.android.httpclient.impl.client.cache.CachingExec.handleRevalidationFailure(cz.msebera.android.httpclient.client.methods.HttpRequestWrapper, cz.msebera.android.httpclient.protocol.HttpContext, cz.msebera.android.httpclient.client.cache.HttpCacheEntry, java.util.Date):cz.msebera.android.httpclient.client.methods.CloseableHttpResponse A[MD:(cz.msebera.android.httpclient.client.methods.HttpRequestWrapper, cz.msebera.android.httpclient.protocol.HttpContext, cz.msebera.android.httpclient.client.cache.HttpCacheEntry, java.util.Date):cz.msebera.android.httpclient.client.methods.CloseableHttpResponse (m)], block:B:27:0x0033 */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0033: INVOKE (r0 I:cz.msebera.android.httpclient.client.methods.CloseableHttpResponse) = 
  (r8v0 ?? I:cz.msebera.android.httpclient.impl.client.cache.CachingExec)
  (r4v0 ?? I:cz.msebera.android.httpclient.client.methods.HttpRequestWrapper)
  (r5v0 ?? I:cz.msebera.android.httpclient.protocol.HttpContext)
  (r7 I:cz.msebera.android.httpclient.client.cache.HttpCacheEntry)
  (r14 I:java.util.Date)
 DIRECT call: cz.msebera.android.httpclient.impl.client.cache.CachingExec.handleRevalidationFailure(cz.msebera.android.httpclient.client.methods.HttpRequestWrapper, cz.msebera.android.httpclient.protocol.HttpContext, cz.msebera.android.httpclient.client.cache.HttpCacheEntry, java.util.Date):cz.msebera.android.httpclient.client.methods.CloseableHttpResponse A[MD:(cz.msebera.android.httpclient.client.methods.HttpRequestWrapper, cz.msebera.android.httpclient.protocol.HttpContext, cz.msebera.android.httpclient.client.cache.HttpCacheEntry, java.util.Date):cz.msebera.android.httpclient.client.methods.CloseableHttpResponse (m)], block:B:27:0x0033 */
    /* JADX WARN: Type inference failed for: r4v0, types: [cz.msebera.android.httpclient.client.methods.HttpRequestWrapper] */
    /* JADX WARN: Type inference failed for: r5v0, types: [cz.msebera.android.httpclient.protocol.HttpContext] */
    /* JADX WARN: Type inference failed for: r7v0, types: [cz.msebera.android.httpclient.client.cache.HttpCacheEntry] */
    private CloseableHttpResponse revalidateCacheEntry(HttpRoute httpRoute, HttpRequestWrapper httpRequestWrapper, HttpClientContext httpClientContext, HttpExecutionAware httpExecutionAware, HttpCacheEntry httpCacheEntry, Date date) throws HttpException {
        ?? HandleRevalidationFailure;
        ?? HandleRevalidationFailure2;
        ?? HandleRevalidationFailure3;
        try {
            if (this.asynchRevalidator == null || staleResponseNotAllowed(httpRequestWrapper, httpCacheEntry, date) || !this.validityPolicy.mayReturnStaleWhileRevalidating(httpCacheEntry, date)) {
                return revalidateCacheEntry(httpRoute, httpRequestWrapper, httpClientContext, httpExecutionAware, httpCacheEntry);
            }
            this.log.trace("Serving stale with asynchronous revalidation");
            CloseableHttpResponse closeableHttpResponseGenerateCachedResponse = generateCachedResponse(httpRequestWrapper, httpClientContext, httpCacheEntry, date);
            this.asynchRevalidator.revalidateCacheEntry(this, httpRoute, httpRequestWrapper, httpClientContext, httpExecutionAware, httpCacheEntry);
            return closeableHttpResponseGenerateCachedResponse;
        } catch (IOException unused) {
            return handleRevalidationFailure(HandleRevalidationFailure, HandleRevalidationFailure2, HandleRevalidationFailure3, date);
        }
    }

    private boolean revalidationResponseIsTooOld(HttpResponse httpResponse, HttpCacheEntry httpCacheEntry) {
        Header firstHeader = httpCacheEntry.getFirstHeader("Date");
        Header firstHeader2 = httpResponse.getFirstHeader("Date");
        if (firstHeader != null && firstHeader2 != null) {
            Date date = DateUtils.parseDate(firstHeader.getValue());
            Date date2 = DateUtils.parseDate(firstHeader2.getValue());
            if (date != null && date2 != null && date2.before(date)) {
                return true;
            }
        }
        return false;
    }

    private HttpCacheEntry satisfyFromCache(HttpHost httpHost, HttpRequestWrapper httpRequestWrapper) {
        try {
            return this.responseCache.getCacheEntry(httpHost, httpRequestWrapper);
        } catch (IOException e2) {
            this.log.warn("Unable to retrieve entries from cache", e2);
            return null;
        }
    }

    private void setResponseStatus(HttpContext httpContext, CacheResponseStatus cacheResponseStatus) {
        if (httpContext != null) {
            httpContext.setAttribute(HttpCacheContext.CACHE_RESPONSE_STATUS, cacheResponseStatus);
        }
    }

    private boolean shouldSendNotModifiedResponse(HttpRequestWrapper httpRequestWrapper, HttpCacheEntry httpCacheEntry) {
        return this.suitabilityChecker.isConditional(httpRequestWrapper) && this.suitabilityChecker.allConditionalsMatch(httpRequestWrapper, httpCacheEntry, new Date());
    }

    private boolean staleIfErrorAppliesTo(int i2) {
        return i2 == 500 || i2 == 502 || i2 == 503 || i2 == 504;
    }

    private boolean staleResponseNotAllowed(HttpRequestWrapper httpRequestWrapper, HttpCacheEntry httpCacheEntry, Date date) {
        return this.validityPolicy.mustRevalidate(httpCacheEntry) || (this.cacheConfig.isSharedCache() && this.validityPolicy.proxyRevalidate(httpCacheEntry)) || explicitFreshnessRequest(httpRequestWrapper, httpCacheEntry, date);
    }

    private void storeRequestIfModifiedSinceFor304Response(HttpRequest httpRequest, HttpResponse httpResponse) {
        Header firstHeader;
        if (httpResponse.getStatusLine().getStatusCode() != 304 || (firstHeader = httpRequest.getFirstHeader("If-Modified-Since")) == null) {
            return;
        }
        httpResponse.addHeader("Last-Modified", firstHeader.getValue());
    }

    private void tryToUpdateVariantMap(HttpHost httpHost, HttpRequestWrapper httpRequestWrapper, Variant variant) {
        try {
            this.responseCache.reuseVariantEntryFor(httpHost, httpRequestWrapper, variant);
        } catch (IOException e2) {
            this.log.warn("Could not update cache entry to reuse variant", e2);
        }
    }

    private CloseableHttpResponse unvalidatedCacheHit(HttpRequestWrapper httpRequestWrapper, HttpContext httpContext, HttpCacheEntry httpCacheEntry) {
        CloseableHttpResponse closeableHttpResponseGenerateResponse = this.responseGenerator.generateResponse(httpRequestWrapper, httpCacheEntry);
        setResponseStatus(httpContext, CacheResponseStatus.CACHE_HIT);
        closeableHttpResponseGenerateResponse.addHeader("Warning", "111 localhost \"Revalidation failed\"");
        return closeableHttpResponseGenerateResponse;
    }

    CloseableHttpResponse callBackend(HttpRoute httpRoute, HttpRequestWrapper httpRequestWrapper, HttpClientContext httpClientContext, HttpExecutionAware httpExecutionAware) throws IOException, HttpException {
        Date currentDate = getCurrentDate();
        this.log.trace("Calling the backend");
        CloseableHttpResponse closeableHttpResponseExecute = this.backend.execute(httpRoute, httpRequestWrapper, httpClientContext, httpExecutionAware);
        try {
            closeableHttpResponseExecute.addHeader("Via", generateViaHeader(closeableHttpResponseExecute));
            return handleBackendResponse(httpRequestWrapper, httpClientContext, currentDate, getCurrentDate(), closeableHttpResponseExecute);
        } catch (IOException e2) {
            closeableHttpResponseExecute.close();
            throw e2;
        } catch (RuntimeException e3) {
            closeableHttpResponseExecute.close();
            throw e3;
        }
    }

    boolean clientRequestsOurOptions(HttpRequest httpRequest) {
        RequestLine requestLine = httpRequest.getRequestLine();
        return "OPTIONS".equals(requestLine.getMethod()) && ProxyConfig.MATCH_ALL_SCHEMES.equals(requestLine.getUri()) && AdkSettings.PLATFORM_TYPE_MOBILE.equals(httpRequest.getFirstHeader("Max-Forwards").getValue());
    }

    public CloseableHttpResponse execute(HttpRoute httpRoute, HttpRequestWrapper httpRequestWrapper) throws IOException, HttpException {
        return execute(httpRoute, httpRequestWrapper, HttpClientContext.create(), null);
    }

    public CloseableHttpResponse execute(HttpRoute httpRoute, HttpRequestWrapper httpRequestWrapper, HttpClientContext httpClientContext) throws IOException, HttpException {
        return execute(httpRoute, httpRequestWrapper, httpClientContext, null);
    }

    @Override // cz.msebera.android.httpclient.impl.execchain.ClientExecChain
    public CloseableHttpResponse execute(HttpRoute httpRoute, HttpRequestWrapper httpRequestWrapper, HttpClientContext httpClientContext, HttpExecutionAware httpExecutionAware) throws IOException, HttpException {
        HttpHost targetHost = httpClientContext.getTargetHost();
        String strGenerateViaHeader = generateViaHeader(httpRequestWrapper.getOriginal());
        setResponseStatus(httpClientContext, CacheResponseStatus.CACHE_MISS);
        if (clientRequestsOurOptions(httpRequestWrapper)) {
            setResponseStatus(httpClientContext, CacheResponseStatus.CACHE_MODULE_RESPONSE);
            return Proxies.enhanceResponse(new OptionsHttp11Response());
        }
        HttpResponse fatallyNoncompliantResponse = getFatallyNoncompliantResponse(httpRequestWrapper, httpClientContext);
        if (fatallyNoncompliantResponse != null) {
            return Proxies.enhanceResponse(fatallyNoncompliantResponse);
        }
        this.requestCompliance.makeRequestCompliant(httpRequestWrapper);
        httpRequestWrapper.addHeader("Via", strGenerateViaHeader);
        if (!this.cacheableRequestPolicy.isServableFromCache(httpRequestWrapper)) {
            this.log.debug("Request is not servable from cache");
            flushEntriesInvalidatedByRequest(httpClientContext.getTargetHost(), httpRequestWrapper);
            return callBackend(httpRoute, httpRequestWrapper, httpClientContext, httpExecutionAware);
        }
        HttpCacheEntry httpCacheEntrySatisfyFromCache = satisfyFromCache(targetHost, httpRequestWrapper);
        if (httpCacheEntrySatisfyFromCache != null) {
            return handleCacheHit(httpRoute, httpRequestWrapper, httpClientContext, httpExecutionAware, httpCacheEntrySatisfyFromCache);
        }
        this.log.debug("Cache miss");
        return handleCacheMiss(httpRoute, httpRequestWrapper, httpClientContext, httpExecutionAware);
    }

    public long getCacheHits() {
        return this.cacheHits.get();
    }

    public long getCacheMisses() {
        return this.cacheMisses.get();
    }

    public long getCacheUpdates() {
        return this.cacheUpdates.get();
    }

    Date getCurrentDate() {
        return new Date();
    }

    CloseableHttpResponse handleBackendResponse(HttpRequestWrapper httpRequestWrapper, HttpClientContext httpClientContext, Date date, Date date2, CloseableHttpResponse closeableHttpResponse) throws IOException {
        this.log.trace("Handling Backend response");
        this.responseCompliance.ensureProtocolCompliance(httpRequestWrapper, closeableHttpResponse);
        HttpHost targetHost = httpClientContext.getTargetHost();
        boolean zIsResponseCacheable = this.responseCachingPolicy.isResponseCacheable(httpRequestWrapper, closeableHttpResponse);
        this.responseCache.flushInvalidatedCacheEntriesFor(targetHost, httpRequestWrapper, closeableHttpResponse);
        if (zIsResponseCacheable && !alreadyHaveNewerCacheEntry(targetHost, httpRequestWrapper, closeableHttpResponse)) {
            storeRequestIfModifiedSinceFor304Response(httpRequestWrapper, closeableHttpResponse);
            return this.responseCache.cacheAndReturnResponse(targetHost, (HttpRequest) httpRequestWrapper, closeableHttpResponse, date, date2);
        }
        if (!zIsResponseCacheable) {
            try {
                this.responseCache.flushCacheEntriesFor(targetHost, httpRequestWrapper);
            } catch (IOException e2) {
                this.log.warn("Unable to flush invalid cache entries", e2);
            }
        }
        return closeableHttpResponse;
    }

    CloseableHttpResponse negotiateResponseFromVariants(HttpRoute httpRoute, HttpRequestWrapper httpRequestWrapper, HttpClientContext httpClientContext, HttpExecutionAware httpExecutionAware, Map<String, Variant> map) throws IOException, HttpException {
        HttpRequestWrapper httpRequestWrapperBuildConditionalRequestFromVariants = this.conditionalRequestBuilder.buildConditionalRequestFromVariants(httpRequestWrapper, map);
        Date currentDate = getCurrentDate();
        CloseableHttpResponse closeableHttpResponseExecute = this.backend.execute(httpRoute, httpRequestWrapperBuildConditionalRequestFromVariants, httpClientContext, httpExecutionAware);
        try {
            Date currentDate2 = getCurrentDate();
            closeableHttpResponseExecute.addHeader("Via", generateViaHeader(closeableHttpResponseExecute));
            if (closeableHttpResponseExecute.getStatusLine().getStatusCode() != 304) {
                return handleBackendResponse(httpRequestWrapper, httpClientContext, currentDate, currentDate2, closeableHttpResponseExecute);
            }
            Header firstHeader = closeableHttpResponseExecute.getFirstHeader("ETag");
            if (firstHeader == null) {
                this.log.warn("304 response did not contain ETag");
                IOUtils.consume(closeableHttpResponseExecute.getEntity());
                closeableHttpResponseExecute.close();
                return callBackend(httpRoute, httpRequestWrapper, httpClientContext, httpExecutionAware);
            }
            Variant variant = map.get(firstHeader.getValue());
            if (variant == null) {
                this.log.debug("304 response did not contain ETag matching one sent in If-None-Match");
                IOUtils.consume(closeableHttpResponseExecute.getEntity());
                closeableHttpResponseExecute.close();
                return callBackend(httpRoute, httpRequestWrapper, httpClientContext, httpExecutionAware);
            }
            HttpCacheEntry entry = variant.getEntry();
            if (revalidationResponseIsTooOld(closeableHttpResponseExecute, entry)) {
                IOUtils.consume(closeableHttpResponseExecute.getEntity());
                closeableHttpResponseExecute.close();
                return retryRequestUnconditionally(httpRoute, httpRequestWrapper, httpClientContext, httpExecutionAware, entry);
            }
            recordCacheUpdate(httpClientContext);
            HttpCacheEntry updatedVariantEntry = getUpdatedVariantEntry(httpClientContext.getTargetHost(), httpRequestWrapperBuildConditionalRequestFromVariants, currentDate, currentDate2, closeableHttpResponseExecute, variant, entry);
            closeableHttpResponseExecute.close();
            CloseableHttpResponse closeableHttpResponseGenerateResponse = this.responseGenerator.generateResponse(httpRequestWrapper, updatedVariantEntry);
            tryToUpdateVariantMap(httpClientContext.getTargetHost(), httpRequestWrapper, variant);
            return shouldSendNotModifiedResponse(httpRequestWrapper, updatedVariantEntry) ? this.responseGenerator.generateNotModifiedResponse(updatedVariantEntry) : closeableHttpResponseGenerateResponse;
        } catch (IOException e2) {
            closeableHttpResponseExecute.close();
            throw e2;
        } catch (RuntimeException e3) {
            closeableHttpResponseExecute.close();
            throw e3;
        }
    }

    CloseableHttpResponse revalidateCacheEntry(HttpRoute httpRoute, HttpRequestWrapper httpRequestWrapper, HttpClientContext httpClientContext, HttpExecutionAware httpExecutionAware, HttpCacheEntry httpCacheEntry) throws IOException, HttpException {
        HttpRequestWrapper httpRequestWrapperBuildConditionalRequest = this.conditionalRequestBuilder.buildConditionalRequest(httpRequestWrapper, httpCacheEntry);
        URI uri = httpRequestWrapperBuildConditionalRequest.getURI();
        if (uri != null) {
            try {
                httpRequestWrapperBuildConditionalRequest.setURI(URIUtils.rewriteURIForRoute(uri, httpRoute, httpClientContext.getRequestConfig().isNormalizeUri()));
            } catch (URISyntaxException e2) {
                throw new ProtocolException("Invalid URI: " + uri, e2);
            }
        }
        Date currentDate = getCurrentDate();
        CloseableHttpResponse closeableHttpResponseExecute = this.backend.execute(httpRoute, httpRequestWrapperBuildConditionalRequest, httpClientContext, httpExecutionAware);
        Date currentDate2 = getCurrentDate();
        if (revalidationResponseIsTooOld(closeableHttpResponseExecute, httpCacheEntry)) {
            closeableHttpResponseExecute.close();
            HttpRequestWrapper httpRequestWrapperBuildUnconditionalRequest = this.conditionalRequestBuilder.buildUnconditionalRequest(httpRequestWrapper, httpCacheEntry);
            currentDate = getCurrentDate();
            closeableHttpResponseExecute = this.backend.execute(httpRoute, httpRequestWrapperBuildUnconditionalRequest, httpClientContext, httpExecutionAware);
            currentDate2 = getCurrentDate();
        }
        closeableHttpResponseExecute.addHeader("Via", generateViaHeader(closeableHttpResponseExecute));
        int statusCode = closeableHttpResponseExecute.getStatusLine().getStatusCode();
        if (statusCode == 304 || statusCode == 200) {
            recordCacheUpdate(httpClientContext);
        }
        if (statusCode == 304) {
            HttpCacheEntry httpCacheEntryUpdateCacheEntry = this.responseCache.updateCacheEntry(httpClientContext.getTargetHost(), httpRequestWrapper, httpCacheEntry, closeableHttpResponseExecute, currentDate, currentDate2);
            return (this.suitabilityChecker.isConditional(httpRequestWrapper) && this.suitabilityChecker.allConditionalsMatch(httpRequestWrapper, httpCacheEntryUpdateCacheEntry, new Date())) ? this.responseGenerator.generateNotModifiedResponse(httpCacheEntryUpdateCacheEntry) : this.responseGenerator.generateResponse(httpRequestWrapper, httpCacheEntryUpdateCacheEntry);
        }
        if (!staleIfErrorAppliesTo(statusCode) || staleResponseNotAllowed(httpRequestWrapper, httpCacheEntry, getCurrentDate()) || !this.validityPolicy.mayReturnStaleIfError(httpRequestWrapper, httpCacheEntry, currentDate2)) {
            return handleBackendResponse(httpRequestWrapperBuildConditionalRequest, httpClientContext, currentDate, currentDate2, closeableHttpResponseExecute);
        }
        try {
            CloseableHttpResponse closeableHttpResponseGenerateResponse = this.responseGenerator.generateResponse(httpRequestWrapper, httpCacheEntry);
            closeableHttpResponseGenerateResponse.addHeader("Warning", "110 localhost \"Response is stale\"");
            return closeableHttpResponseGenerateResponse;
        } finally {
            closeableHttpResponseExecute.close();
        }
    }

    public boolean supportsRangeAndContentRangeHeaders() {
        return false;
    }
}
