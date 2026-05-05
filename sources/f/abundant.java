package f;

import java.io.ByteArrayInputStream;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.ranges.RangesKt;
import kotlin.text.Charsets;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponse;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.EntityUtils;

/* JADX INFO: loaded from: classes5.dex */
public final class abundant {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final fabricate f18486b = new fabricate();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gregarious f18487a = new PropertyReference0Impl() { // from class: f.gregarious
        {
            i1.close closeVar = i1.close.f19714a;
        }

        @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
        public final Object get() {
            ((i1.close) this.receiver).getClass();
            return i1.close.a();
        }
    };

    public final i0.pair a(pair pairVar, boolean z2, f0.tongue tongueVar) {
        String string;
        List listEmptyList;
        Header firstHeader;
        HttpContext httpContext = pairVar.f18498a;
        HttpResponse httpResponse = pairVar.f18499b;
        String value = httpResponse.getFirstHeader("uniqueid").getValue();
        if (value == null || value.length() == 0) {
            return null;
        }
        int statusCode = httpResponse.getStatusLine().getStatusCode();
        HttpEntity entity = httpResponse.getEntity();
        try {
            string = EntityUtils.toString(entity);
            if (entity instanceof BasicHttpEntity) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(string.getBytes(Charsets.UTF_8));
                try {
                    ((BasicHttpEntity) entity).setContent(byteArrayInputStream);
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(byteArrayInputStream, null);
                } finally {
                }
            } else {
                String str = "Unable to rewind content of entity " + entity;
            }
        } catch (Throwable th) {
            String str2 = "Error in getApiIntegrityHttpResult: " + th.getMessage() + ". Returning empty string.";
        }
        if (string == null) {
            string = "";
        }
        Object attribute = httpContext.getAttribute("http.request");
        HttpMessage httpMessage = attribute instanceof HttpMessage ? (HttpMessage) attribute : null;
        String value2 = (httpMessage == null || (firstHeader = httpMessage.getFirstHeader("User-Agent")) == null) ? null : firstHeader.getValue();
        if (value2 == null) {
            value2 = "";
        }
        Object attribute2 = httpContext.getAttribute("request.uri");
        String str3 = attribute2 instanceof String ? (String) attribute2 : null;
        String str4 = str3 != null ? str3 : "";
        if (z2) {
            Object attribute3 = httpContext.getAttribute("SSL_CERT_DETAILS");
            listEmptyList = attribute3 instanceof List ? (List) attribute3 : null;
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        Header[] allHeaders = httpResponse.getAllHeaders();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(allHeaders.length), 16));
        for (Header header : allHeaders) {
            Pair pair = TuplesKt.to(header.getName(), header.getValue());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        gregarious gregariousVar = this.f18487a;
        if (value.length() == 0 || Intrinsics.areEqual(value, "api-marker")) {
            value = (String) gregariousVar.invoke();
        }
        return new i0.pair(listEmptyList, value, str4, value2, statusCode, linkedHashMap, string, tongueVar);
    }
}
