package okhttp3.internal.connection;

import androidx.exifinterface.media.ExifInterface;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Address;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RouteSelector;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message tag had invalid wire type.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidWireType(InvalidProtocolBufferException.java:99)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:268)
    	at kotlin.metadata.internal.protobuf.GeneratedMessageLite.parseUnknownField(GeneratedMessageLite.java:73)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:110)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яt\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.ZS0\u0011s{B*cҕyCQU\"}(\nWN}gvϺb\u000bY\u000f\u000eǝ\u0001jBI]ތe\u0012%2JģG3coEʠhtL\u0005(2(;\u0002\u0005\u000f#2H\u0016z\u0003Ca\f\u001aؓHpHR\u0015˟\r\u001a(\u0006FĨ\u0017Ȧ\rg|5\t\u0010m>=#\u001bipO7c>~e\rtW7\u0011\u0005e6+n<E\u00193Y\u001b\u0007\u0001bύ\u0007?\u007fEM|5<CI\"mf\\\u000e+-+}%\u000ev4u\u001dQ\u000f&oY]~cP<D(~\n*T\u0004<\u0012WL<K2f6\u001acx\u0001rXP0jr\u0004\t\u0002N\u0017S\fc/G<~Q\u0010]_N\u007f2\u001306#/\u000bQ_b+x\u0015I`(U?oX=vZ:]K\r\u001cp\u0011\u000eZ\b>g\u0018/*\u001d^\u001b3Xs9QC\u001c\u0006Vh\u007fv3\u0003/S2VVe:nDYr\u0011\u001a\u0001\\f\u001bj~b\u001f,YY*{\u001f}65P`\u0006d9%>w\u0018tw\u0015e]8P_jE\u0006\u0007k<\u0005\npA7ic>d)Ι\u0016͖@h\r֚~DY\u0015hfx.@L\u0003\u0010&\u0001\u001b\u008b\u000eƱ6?yʉ\u00058?\u0019t\u0015v\u0004tՖCҴ\r_bӐ`\u000bb><\u0003\u00180Kժ\r˩`pwΟIU:\u0003x\"[H(ڄ\u001błY\"pؔM1\u0015\f\f\u0002]fzU#́\"\u0091Y{(چjE_>U\u0013=\u000b\u007fɈ\u000eβILzό\"Y 7\u0013|(\u001b\u0012ß:Թ\fjxݚ1xX`l\u00198u\r\u0005yΫpѣ}aNک\u0018qb\u001es@_q1m\u0013ҁD٫\t\u001f&ݒ̃sP"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&\u0006I\n\u0017\u0015Vs\u0018E@\u0005HW\u0001\u001c@o\u0016\u000fQL:kAs", "", "1n];X*MW#\beh6\u0004", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&\u0006I\n\u0017\u0015Vs\u0018E@\u00125U\u0005}Av\u001f.KR?u=\t\u001frh\u000f", "/cS?X:L", "\u001anZ5g;I!bZy]9|\u0017=;", "1`[9", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&\u0006I\n\u0017\u0015Vs\u0018E@\u00125U\u0005}3t\u001d\u0004", "3uT;g\u0013Ba(~\u0004^9", "\u001anZ5g;I!b^\f^5\fo3s\u000f(\u0005@\u000el", "uK^8[;M^fH~g;|\u00168a\u0007qyJ\n \u0017E~\u0012F\u007fn\"Yy'\u0015w\u001f7MAJo>'\u007frk@\\J6Ty6VW\u001cu8QqJ\u0014 hc55\u0013\bhP/<\u000e;(\u0017,V\u000b7oJ\n \u0017>jnQZ\u001aPC\u0002u=0FB`fO.KKe9s\u0017-f<K:-#X\u001d)wP7\n\t)Tc", "5dc\u000eW+KS'\r9h2\u007f\u0018>p", "u(;<^/Mb$LD:+{\u0016/s\u000e}", "1n];X*MW#\bha<\f\b9w\t\u0006\u0006P\n&", "", "<dgAE6Nb\u0019m\u0005M9\u0011", "\u001anZ5g;I!bk\u0005n;|^", "=sW2e\r:W \u000f\b^\n\u0007\u00198t", "@dUBf,=A(\fzZ4Z\u0013?n\u000f", "@ndAX\u001a>Z\u0019|\nb6\u0006", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&\u0006I\n\u0017\u0015Vs\u0018E@\u0012?i\r %m\u001d.KRExr\f\u0015oa7\u0016g6WL", "@ndAX\u001a>Z\u0019|\nh9", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&\u0006I\n\u0017\u0015Vs\u0018E@\u0012?i\r %m\u001d.KREx\n", "4h]1", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\f`vZm\u00118\u007f'57\b\u001f7kk", "1kX2a;", "\u001anZ5g;I!bh\u0001A;\f\u0014\rl\u0004(\u0005OV", "1gP6a", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\f`\u0004Gk\u0015 \u007f45f{ B| ;+F7o=s", "4h]166G\\\u0019|\nb6\u0006", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&\u0006I\n\u0017\u0015Vs\u0018E@\u00125U\u0005}Av\u001f.KR?u=s", "1n];X*MB\u001d\u0007zh<\f", "@dP1G0FS#\u000f\n", "EqXAX\u001bB[\u0019\t\u000bm", ">h]4<5MS&\u0010ve\u0014\u0001\u00106i\u000e", "1n];X*MW#\bg^;\n\u001d\u000fn{%\u0003@\u007f", "", "4h]1;,:Z(\u0002\u000f<6\u0006\u0012/c\u000f,\u0006I", "2n4Eg,Ga\u001d\u0010zA,x\u0010>h]+{>\u0007%", "@dc?l\b?b\u0019\f[Z0\u0004\u0019<e", "@dc?l\u0019Hc(~", "A`\\2;6Lbt\byI6\n\u0018", "Cq[", "\u001anZ5g;I!ba\nm7l\u00166;", "BqP0^\r:W \u000f\b^", "", ExifInterface.GPS_MEASUREMENT_3D, "\u001aiPCTuB]bbd>?z\t:t\u00042\u0005\u0016", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ExchangeFinder {
    private final Address address;
    private final RealCall call;
    private final RealConnectionPool connectionPool;
    private int connectionShutdownCount;
    private final EventListener eventListener;
    private Route nextRouteToTry;
    private int otherFailureCount;
    private int refusedStreamCount;
    private RouteSelector.Selection routeSelection;
    private RouteSelector routeSelector;

    public ExchangeFinder(RealConnectionPool connectionPool, Address address, RealCall call, EventListener eventListener) {
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.connectionPool = connectionPool;
        this.address = address;
        this.call = call;
        this.eventListener = eventListener;
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final okhttp3.internal.connection.RealConnection findConnection(int r16, int r17, int r18, int r19, boolean r20) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.ExchangeFinder.findConnection(int, int, int, int, boolean):okhttp3.internal.connection.RealConnection");
    }

    private final RealConnection findHealthyConnection(int i2, int i3, int i4, int i5, boolean z2, boolean z3) throws IOException {
        while (true) {
            RealConnection realConnectionFindConnection = findConnection(i2, i3, i4, i5, z2);
            if (realConnectionFindConnection.isHealthy(z3)) {
                return realConnectionFindConnection;
            }
            realConnectionFindConnection.noNewExchanges$okhttp();
            if (this.nextRouteToTry == null) {
                RouteSelector.Selection selection = this.routeSelection;
                if (selection != null ? selection.hasNext() : true) {
                    continue;
                } else {
                    RouteSelector routeSelector = this.routeSelector;
                    if (!(routeSelector != null ? routeSelector.hasNext() : true)) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
        }
    }

    private final Route retryRoute() {
        RealConnection connection;
        if (this.refusedStreamCount > 1 || this.connectionShutdownCount > 1 || this.otherFailureCount > 0 || (connection = this.call.getConnection()) == null) {
            return null;
        }
        synchronized (connection) {
            if (connection.getRouteFailureCount$okhttp() != 0) {
                return null;
            }
            if (Util.canReuseConnectionFor(connection.route().address().url(), this.address.url())) {
                return connection.route();
            }
            return null;
        }
    }

    public final ExchangeCodec find(OkHttpClient client, RealInterceptorChain chain) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(chain, "chain");
        try {
            return findHealthyConnection(chain.getConnectTimeoutMillis$okhttp(), chain.getReadTimeoutMillis$okhttp(), chain.getWriteTimeoutMillis$okhttp(), client.pingIntervalMillis(), client.retryOnConnectionFailure(), !Intrinsics.areEqual(chain.getRequest$okhttp().method(), "GET")).newCodec$okhttp(client, chain);
        } catch (IOException e2) {
            trackFailure(e2);
            throw new RouteException(e2);
        } catch (RouteException e3) {
            trackFailure(e3.getLastConnectException());
            throw e3;
        }
    }

    public final Address getAddress$okhttp() {
        return this.address;
    }

    public final boolean retryAfterFailure() {
        RouteSelector routeSelector;
        if (this.refusedStreamCount == 0 && this.connectionShutdownCount == 0 && this.otherFailureCount == 0) {
            return false;
        }
        if (this.nextRouteToTry != null) {
            return true;
        }
        Route routeRetryRoute = retryRoute();
        if (routeRetryRoute != null) {
            this.nextRouteToTry = routeRetryRoute;
            return true;
        }
        RouteSelector.Selection selection = this.routeSelection;
        if ((selection == null || !selection.hasNext()) && (routeSelector = this.routeSelector) != null) {
            return routeSelector.hasNext();
        }
        return true;
    }

    public final boolean sameHostAndPort(HttpUrl url) {
        Intrinsics.checkNotNullParameter(url, "url");
        HttpUrl httpUrlUrl = this.address.url();
        return url.port() == httpUrlUrl.port() && Intrinsics.areEqual(url.host(), httpUrlUrl.host());
    }

    public final void trackFailure(IOException e2) {
        Intrinsics.checkNotNullParameter(e2, "e");
        this.nextRouteToTry = null;
        if ((e2 instanceof StreamResetException) && ((StreamResetException) e2).errorCode == ErrorCode.REFUSED_STREAM) {
            this.refusedStreamCount++;
        } else if (e2 instanceof ConnectionShutdownException) {
            this.connectionShutdownCount++;
        } else {
            this.otherFailureCount++;
        }
    }
}
