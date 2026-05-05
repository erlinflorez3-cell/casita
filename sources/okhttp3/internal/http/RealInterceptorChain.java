package okhttp3.internal.http;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
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
@Metadata(bv = {}, d1 = {"ЯN\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\r@4\u0012\u000e\u0007nʑA0RkP\u008cZS@\u000fsڔ<$q$yCAb\"}8\tWȞog\u0005Jb\u000bI\u0010\u000e\u0016\u000fj4I[ye\u0012%2JoE4cڎm9\u000fsvP0608\u0012\u0005/\u001b:R\u001ex\u0013I[\u000e\"0nthU\u001dQ\u0013\u001f*\u0006l&\u0011$jnf8^k\fB?'\u0011rZNUi@\u0001[\u0018^TU\u0013\u0007e,7X7c\u001b5W\u0011\u0014j[m\tӭu=\u0013vo-9I\fWdrF(]1]\u0018urTbKe)\u00145FgeaO<D>\u000fDVJ!&\u0006UΞ^3 f\u0016\u0013Kt!YpX\b^P\u0007\u0013cL\u0016S\bc1?\u001btZy;GXg\u0002\u000b\r,.\u0019nOa\u0005\u0014f\u0015)`\u0010Q_WpCNN\u0018fUm2v)̣ò\b0M\u001ew\n\u001fM/%e{i'/t\u001aHrq=\u0019)naujHn(5*\u007f0\u0017\u0015rD\u0013\u000f2d\u001dn:2e\u001c\u0003\u0006.\f!Btwj'U\u0014\\r\u0001i\u0019q$\u001emEt\\qn\u001a\r\b=lUMQ\u0012\u0016\u0012V\u00057W<\u0011)\u001fz\u000bi\u001a\u0001t(P1xn\u001e\u001a\u0014D|\u0012C6M\u001544ZU_p]N\u0011+ZA+\u000f&n9\"\rTK$1jzڐ\u000bɹTbxב\u007fzO;\u000bpr9ObM\u0019T[x־@č'\u0007\u0007͞PYuW_L\u001b\u001cLɞ}°\u001a A֗G?\u0019!\r<\u0003\u0016;Ldt{P{\u001a}ϖ~ɍ\u0013Ap֫\u007f\np\u0005:u;V]Y/\"%dIֿ\nܐ\u0004yi¿KYqV#aNK\u0003\u0003\b@|;Sā!Ǫ)\u0001wܲMG;O?\u001dD}j٭\u0017˸aowЃ\u0012d\u0015<\u0003xT>q\u001f\bb\u007fg\tկ:ա]\u0005FЭ<n\tYV\u0003H\u001aP\u0016L\raN\u0018Эrެ<S\u0013ɀ\u0016h\rE\u001b\u0004Ì_a"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\f`\u0004Gk\u0015 \u007f45f{ B| ;+F7o=s", "\u001anZ5g;I!bb\u0004m,\n\u0007/p\u000f2\t~^\u001a\u0013Kxc", "1`[9", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&\u0006I\n\u0017\u0015Vs\u0018E@\u00125U\u0005}3t\u001d\u0004", "7mc2e*>^(\t\bl", "", "\u001anZ5g;I!bb\u0004m,\n\u0007/p\u000f2\t\u0016", "7mS2k", "", "3wR5T5@S", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&\u0006I\n\u0017\u0015Vs\u0018E@\u0005HW\u0001\u001c@o\u0016\u0004", "@d`BX:M", "\u001anZ5g;I!bkzj<|\u0017>;", "1n];X*MB\u001d\u0007zh<\fp3l\u0007,\n", "@dP1G0FS#\u000f\nF0\u0004\u00103s", "EqXAX\u001bB[\u0019\t\u000bm\u0014\u0001\u00106i\u000e", "uK^8[;M^fH~g;|\u00168a\u0007qyJ\n \u0017E~\u0012F\u007fn\"Yy'\u0015i\u001d5#*@gE\u001a^xp=\u000e-\u0013R\u00056\u001d056bU\u0002L\u001f_$\u0012W:\r\u0012b=+8BA(\u0011,G\u0011?r\nUu!3mlKX\u0010\u001d`\u001f{D8wQ')fGMUb8saC\u0001@}+", "5dc\u0010T3E\u0012#\u0005}m;\b", "u(;<^/Mb$LDb5\f\t<n{/E>\u000b  Gm\u001d@\u0001.~F}\u001c>K\u00125T\u0019", "1`[9f", "5dc\u0010b5GS\u0017\u000eib4|\u0013?tg,\u0003G\u0005%UQu\u0011K\u00060", "u(8", "5dc\u0012k*AO\"\u0001z\u001d6\u0003\f>t\u000b", "u(;<^/Mb$LDb5\f\t<n{/E>\u000b  Gm\u001d@\u0001.~9\u0011\u001e:i\u001f0M\u0019", "5dc\u001fX(=B\u001d\u0007zh<\fp3l\u0007,\n~\u000b\u001d\u001aV~\u0019", "5dc\u001fX8NS'\u000e9h2\u007f\u0018>p", "u(;<^/Mb$LDK,\t\u0019/s\u000f}", "5dc$e0MS\b\u0003\u0003^6\r\u0018\u0017i\u0007/\u007fN?!\u001dJ~\u001dG", "\u001anZ5g;I!b\\ve3R", "1n];X*MW#\b", "\u001anZ5g;I!b\\\u0005g5|\u0007>i\n1Q", "1n_F", "1n_F\u00176DV(\u000e\u0006", ">q^0X,=", "\u001anZ5g;I!bkzl7\u0007\u0012=eU", "Ehc566G\\\u0019|\nM0\u0005\t9u\u000f", "Bh\\2b<M", "CmXA", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0006\u001bOo}Ez4\u000b", "Ehc5E,:R\b\u0003\u0003^6\r\u0018", "Ehc5J9Bb\u0019m~f,\u0007\u0019>", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class RealInterceptorChain implements Interceptor.Chain {
    private final RealCall call;
    private int calls;
    private final int connectTimeoutMillis;
    private final Exchange exchange;
    private final int index;
    private final List<Interceptor> interceptors;
    private final int readTimeoutMillis;
    private final Request request;
    private final int writeTimeoutMillis;

    /* JADX WARN: Multi-variable type inference failed */
    public RealInterceptorChain(RealCall call, List<? extends Interceptor> interceptors, int i2, Exchange exchange, Request request, int i3, int i4, int i5) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(request, "request");
        this.call = call;
        this.interceptors = interceptors;
        this.index = i2;
        this.exchange = exchange;
        this.request = request;
        this.connectTimeoutMillis = i3;
        this.readTimeoutMillis = i4;
        this.writeTimeoutMillis = i5;
    }

    public static /* synthetic */ RealInterceptorChain copy$okhttp$default(RealInterceptorChain realInterceptorChain, int i2, Exchange exchange, Request request, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 + 1) - (1 | i6) != 0) {
            i2 = realInterceptorChain.index;
        }
        if ((-1) - (((-1) - i6) | ((-1) - 2)) != 0) {
            exchange = realInterceptorChain.exchange;
        }
        if ((i6 + 4) - (4 | i6) != 0) {
            request = realInterceptorChain.request;
        }
        if ((8 & i6) != 0) {
            i3 = realInterceptorChain.connectTimeoutMillis;
        }
        if ((i6 + 16) - (16 | i6) != 0) {
            i4 = realInterceptorChain.readTimeoutMillis;
        }
        if ((-1) - (((-1) - i6) | ((-1) - 32)) != 0) {
            i5 = realInterceptorChain.writeTimeoutMillis;
        }
        return realInterceptorChain.copy$okhttp(i2, exchange, request, i3, i4, i5);
    }

    @Override // okhttp3.Interceptor.Chain
    public Call call() {
        return this.call;
    }

    @Override // okhttp3.Interceptor.Chain
    public int connectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    @Override // okhttp3.Interceptor.Chain
    public Connection connection() {
        Exchange exchange = this.exchange;
        return exchange != null ? exchange.getConnection$okhttp() : null;
    }

    public final RealInterceptorChain copy$okhttp(int i2, Exchange exchange, Request request, int i3, int i4, int i5) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new RealInterceptorChain(this.call, this.interceptors, i2, exchange, request, i3, i4, i5);
    }

    public final RealCall getCall$okhttp() {
        return this.call;
    }

    public final int getConnectTimeoutMillis$okhttp() {
        return this.connectTimeoutMillis;
    }

    public final Exchange getExchange$okhttp() {
        return this.exchange;
    }

    public final int getReadTimeoutMillis$okhttp() {
        return this.readTimeoutMillis;
    }

    public final Request getRequest$okhttp() {
        return this.request;
    }

    public final int getWriteTimeoutMillis$okhttp() {
        return this.writeTimeoutMillis;
    }

    @Override // okhttp3.Interceptor.Chain
    public Response proceed(Request request) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.index >= this.interceptors.size()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.calls++;
        Exchange exchange = this.exchange;
        if (exchange != null) {
            if (!exchange.getFinder$okhttp().sameHostAndPort(request.url())) {
                throw new IllegalStateException(("network interceptor " + this.interceptors.get(this.index - 1) + " must retain the same host and port").toString());
            }
            if (this.calls != 1) {
                throw new IllegalStateException(("network interceptor " + this.interceptors.get(this.index - 1) + " must call proceed() exactly once").toString());
            }
        }
        RealInterceptorChain realInterceptorChainCopy$okhttp$default = copy$okhttp$default(this, this.index + 1, null, request, 0, 0, 0, 58, null);
        Interceptor interceptor = this.interceptors.get(this.index);
        Response responseIntercept = interceptor.intercept(realInterceptorChainCopy$okhttp$default);
        if (responseIntercept == null) {
            throw new NullPointerException("interceptor " + interceptor + " returned null");
        }
        if (this.exchange != null && this.index + 1 < this.interceptors.size() && realInterceptorChainCopy$okhttp$default.calls != 1) {
            throw new IllegalStateException(("network interceptor " + interceptor + " must call proceed() exactly once").toString());
        }
        if (responseIntercept.body() != null) {
            return responseIntercept;
        }
        throw new IllegalStateException(("interceptor " + interceptor + " returned a response with no body").toString());
    }

    @Override // okhttp3.Interceptor.Chain
    public int readTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    @Override // okhttp3.Interceptor.Chain
    public Request request() {
        return this.request;
    }

    @Override // okhttp3.Interceptor.Chain
    public Interceptor.Chain withConnectTimeout(int i2, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (this.exchange == null) {
            return copy$okhttp$default(this, 0, null, null, Util.checkDuration("connectTimeout", i2, unit), 0, 0, 55, null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor".toString());
    }

    @Override // okhttp3.Interceptor.Chain
    public Interceptor.Chain withReadTimeout(int i2, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (this.exchange == null) {
            return copy$okhttp$default(this, 0, null, null, 0, Util.checkDuration("readTimeout", i2, unit), 0, 47, null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor".toString());
    }

    @Override // okhttp3.Interceptor.Chain
    public Interceptor.Chain withWriteTimeout(int i2, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (this.exchange == null) {
            return copy$okhttp$default(this, 0, null, null, 0, 0, Util.checkDuration("writeTimeout", i2, unit), 31, null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor".toString());
    }

    @Override // okhttp3.Interceptor.Chain
    public int writeTimeoutMillis() {
        return this.writeTimeoutMillis;
    }
}
