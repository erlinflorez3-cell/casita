package okhttp3;

import androidx.webkit.ProxyConfig;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.ForwardingSink;
import okio.ForwardingSource;
import okio.Okio;
import okio.Sink;
import okio.Source;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message end-group tag did not match expected tag.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidEndTag(InvalidProtocolBufferException.java:94)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.checkLastTagWas(CodedInputStream.java:180)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:194)
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
    	... 5 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яt\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u0006\u000enj?0Le^.ZS0\u000fs{J$c$wECU(\u0004*ޛWNupvJ`\u0015K\u000f\u0014\u0016\u0001̓4Ikxe\u0012\u00156JoU3UڎE9vt>\u0005&3*8\u0010\u0005\t\u001a0O\u0018v\u0011CS\f\u00184HpHy\u0015M\u0013&\u001a\u0006D#\u0017Ȧz)~6vk\u000e:]#;k\u0003\u0010i#p\u0012S!VX5\u000e\u000faL-P;C\u0018=S1\u000bқ_?\u0011D2Z\u000bؒ7+9J\fWdZ\u0010\u0018#.g\r\fv6`\u0013Wx\fU2յgK^\u0016p\f\t\u0019%<2,61VME |\u0007<SEr\u0002J\u0017\u0002'H\u000e\u001cy6ECFGs=)\tiai7\u0017B\n\u0006%\u001eQ\u00035&ƟX\u000ef8cX\u0006uIQn[\u0011T\u0018~Um2\u000f)\u0016r\u0019>m\u00181\u0012\u0010\\>U;ia;!\u001a+\u000fֳϼz\u0005f\u0013\u001cm`VX\"\u001d%\u007f.\u00177rD\u0013#4Tb[D\u0011{ \u001d\u000b\f\u001b+ \u000b\u0007\u000563<fQ~h\u0019z\u000e\u000e3]~7\b\u00162ލĆ=^9d\u001av\u001e\u0012jvB]lf\u0013\u0001~B\u00025!٢͈&2N\u001cX{\nXf\fAA\bu*fD1G`]S\u0011QZA+'&ʳӳ\u0014~Zgl\u0016wY\r\t/n\rt}\u001e\u0011IZ4'õέEQ;Qnp0\"L|Q%/w\u000e\u0002\u007fLus\u001d\u001a\u0004\u0011\u0014 DA\u007f֗ȠA\u0013\u0015;q<\u0010j]R\u0003gaM@f);B\u0013I}Fg6y90n\u0005bO\u0003&r\tl{;\b\u0013\nPӔHیKi\\ެs@O}\u0011e\r]F}\u001d\u001fL'75ݕ\u00019EE-\u001e$\u0005d;#oui\u001e=Pʯ\u001b֑xe\fϺ4%}ri]`Ln\u000e˕\u0003B:&r\u0013PZ;\u0004\u0016U!4;B\u001fЫpވZ8Uߒ\u007f\nt\u001bD\r\u001fe2ƨ\u001f̭\u000246ɾz\fQ\u0013,^q4g\u07be_ܭqySŌ#L\u0015 \u0019\u0013Qp\u00184K9'op#H\u0006\"'\r\u05ceGك\tH\u0011ӗL.B#\u0019Ztk\f,\t\u0019ʴcS"}, d2 = {"\u001anZ5g;I!b\\v\\/|^", "\u001aiPCTuB]b\\\u0002h:|\u0005,l\u007f}", "\u001aiPCTuB]b_\u0002n:\u007f\u0005,l\u007f}", "2ha2V;H`-", "\u001aiPCTuB]b_~e,R", ";`g \\A>", "", "uKY.i(\bW#H[b3|^\u0014)p", "4h[2F@Lb\u0019\u0007", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI,\u0006\na\u001b\u001eG]\"J\u0006%=/", "uKY.i(\bW#H[b3|^\u0014L\n.~O\u0010\"d\u0011s\u0017Kv2>U\u0005i;w_\u000fQJ;YH,$hi\u000fJT", "1`R5X", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&w>\u0004\u0017`&s\u001cB]2E7y\u001e:mk", "5dc\u0010T*ASW\t\u0001a;\f\u0014", "u(;<^/Mb$LDb5\f\t<n{/E>|\u0015\u001aG9l@\u0005+\u001cf\u000e}3k\u0019.#", "u(;7T=:\u001d\u001d\tD?0\u0004\t\u0005", "6hc\u0010b<Gb", "", "7r29b:>R", "", "u(I", "<dcDb9D1#\u000f\u0004m", "@d`BX:M1#\u000f\u0004m", "EqXAX\b;]&\u000eXh<\u0006\u0018", "5dc$e0MSt{\u0005k;Z\u0013?n\u000ff\u0006F\u0004&&R", "u(8", "Adc$e0MSt{\u0005k;Z\u0013?n\u000ff\u0006F\u0004&&R", "uH\u0018#", "EqXAX\u001aNQ\u0017~\tl\n\u0007\u00198t", "5dc$e0MS\u0007\u000fx\\,\u000b\u0017\ro\u00101\u000b~\u000b\u001d\u001aV~\u0019", "Adc$e0MS\u0007\u000fx\\,\u000b\u0017\ro\u00101\u000b~\u000b\u001d\u001aV~\u0019", "/a^?g\u0018NW\u0019\u000e\u0002r", "", "3cXAb9", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&w>\u0004\u0017`&s\u001cB]2E7y\u001e:mT\u000eLGJuAs", "1k^@X", "2d[2g,", "zcT=e,<O(~yX+\u0001\u0016/c\u000f2\tT", "3uX0g\bEZ", "4kd@[", "5dc", "\u001anZ5g;I!bkzl7\u0007\u0012=eU", "@d`BX:M", "\u001anZ5g;I!bkzj<|\u0017>;", "5dcpb2Ab(\n", "7mXA\\(EW.~", ">tc", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&w>\u0004\u0017`%k\f?v\u00125e\u000e E|k", "@db=b5LS", ">tcpb2Ab(\n", "@d\\<i,", "@d\\<i,|]\u001f\u0002\nm7", "Ahi2", "BqP0^\nH\\\u0018\u0003\nb6\u0006\u00056C{&~@c\u001b&", "BqP0^\nH\\\u0018\u0003\nb6\u0006\u00056C{&~@c\u001b&\u0006y\u0014?\u00064@", "BqP0^\u0019>a$\t\u0004l,", "1`R5X\u001aM`\u0015\u000ez`@", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&w>\u0004\u0017`%k\f?v\u0013Dfy/7o*\u0004", "BqP0^\u0019>a$\t\u0004l,;\u00135h\u000f7\u0007", "CoS.g,", "1`R5X+", "<dcDb9D", "CoS.g,|]\u001f\u0002\nm7", "Cq[@", "", "", "\u0011`R5X\u0019>a$\t\u0004l,Y\u0013.y", "\u0011n\\=T5B]\"", "\u0013mc?l", " dP96(<V\u0019kzj<|\u0017>", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Cache implements Closeable, Flushable {
    public static final Companion Companion = new Companion(null);
    private static final int ENTRY_BODY = 1;
    private static final int ENTRY_COUNT = 2;
    private static final int ENTRY_METADATA = 0;
    private static final int VERSION = 201105;
    private final DiskLruCache cache;
    private int hitCount;
    private int networkCount;
    private int requestCount;
    private int writeAbortCount;
    private int writeSuccessCount;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u0016DLш|\u0004W\u00068\u000bDB\u0007Ӭ4\u0012\u0006\u0013nj?1Le^.ZS0\u000fs{B+c$\bCCU }(\teȞ\u0018g\u001dI\u001b.S\u0017\u0014\u0016\u0011nZJ&x\f\u0014\u001f8PrW5cnk=pzD\n8487(\tв\u001e*V\u0016?\u0001QP$\u0012^K7N\u001b\u0015[\b2\u0014\u001c=N\rdp0TDU\u0005]h7i\u0017:N\\.w0+UcЂVܮ\u0011viӜ{NE:-'i\u00025V2έ\u0005ӭu=\rؒw59L\fYLW.\u0018kۃQոar.ؘUdn\f?/}d\u001cP<*Þ~\u0002\u0015ɝ\u001c\u0010\f0V8Ǐ\u001et"}, d2 = {"\u001anZ5g;I!b\\v\\/|G\ra}+{-\u0001%\"Qx\u001c<S/4mS", "\u001anZ5g;I!bkzl7\u0007\u0012=e\\2zTV", "AmP=f/Hb", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&w>\u0004\u0017`&s\u001cB]2E7y\u001e:mT\u001cV?Fy7($>", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&w>\u0004\u0017`&s\u001cB]2E7y\u001e:mk", "1n]AX5MB-\nz", "", "1n]AX5M:\u0019\b|m/", "uK^8[;M^fH~g;|\u00168a\u0007qy<~\u001a\u0017\u0011N\u0012J|\fBi[\u001c5p\u0016l;L7vB!\u001fw7 \f_=J@.CUPuJa\u007fA\u001d\u00140tS'\u001e\u0001#H wF\u0001\r\u00179M\u000b=>D|", "0nSFF6N`\u0017~", "\u001anZ6bu\u001bc\u001a\u007fzk,{v9u\r&{\u0016", "5dc a(Ia\u001c\t\n", "u(;<^/Mb$LDb5\f\t<n{/E>|\u0015\u001aG9l@\u0005+\u001cf\u000e}3k\u0019.\f1Dg?,\u0018rp\u000f", "", "\u001anZ5g;I!bfz]0xwCp\u007f}", "And?V,", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class CacheResponseBody extends ResponseBody {
        private final BufferedSource bodySource;
        private final String contentLength;
        private final String contentType;
        private final DiskLruCache.Snapshot snapshot;

        public CacheResponseBody(DiskLruCache.Snapshot snapshot, String str, String str2) {
            Intrinsics.checkNotNullParameter(snapshot, "snapshot");
            this.snapshot = snapshot;
            this.contentType = str;
            this.contentLength = str2;
            this.bodySource = Okio.buffer(new ForwardingSource(snapshot.getSource(1)) { // from class: okhttp3.Cache.CacheResponseBody.1
                @Override // okio.ForwardingSource, okio.Source, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    this.getSnapshot().close();
                    super.close();
                }
            });
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            String str = this.contentLength;
            if (str != null) {
                return Util.toLongOrDefault(str, -1L);
            }
            return -1L;
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
            String str = this.contentType;
            if (str != null) {
                return MediaType.Companion.parse(str);
            }
            return null;
        }

        public final DiskLruCache.Snapshot getSnapshot() {
            return this.snapshot;
        }

        @Override // okhttp3.ResponseBody
        public BufferedSource source() {
            return this.bodySource;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯP\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005$4\u0012\u0006\u0013nʑA0ZeP.XS2\u000f\u0002{<$a$yCQU\"}(\nWNupvϺb\u000bY\u000f\u000e\u0016~j4Ikxe\u0012\u00152JoMSUڎCʧa\u000bȂ5 `!x~\u000b\u0001ʀ.H\u001evCQY\u0012*0nwjV\u001bU\u001d\u001a@\u000f\u0005%I1jqf6vn\u000e>=.\u001bipZmڿ݁\u0001M\u0013S\u001d=\u001b\u0005y\u001eYOg9#5k\u00035a\fC\u0011P\n=3wm'se\u0002iNX.'E/]!urTq5Un\"?+}r{T\u001c?\u0010z*%\u0005\f\u001c\u001f?H\\@Bf6#{\u0005\u0001mXV\u0012`R\u007f)hd2M\u007fa:\u007f\u001b/YoI1Ne\u000b-\rL8Qz/\\l\u000e\u000f\u0017qƛJΦ5QH׀\u0019Z\u0018\\Um2r9̦|˙4G\b\u07fcL\u001d<\u001b=7\n;yܬ>ɘLDoϸUlvX\u0002RvBxÅh֖.\t\u0014ɮ֎h!"}, d2 = {"\u001anZ5g;I!b\\v\\/|G\ro\b3wI\u0005! \u001d", "", "u(E", "\u0013MC\u001fL&\u001b=wr", "", "\u0013MC\u001fL&\u001c=\tgi", "\u0013MC\u001fL&&3\bZY:\u001bX", "$DA <\u0016'", "9dh", "", "Cq[", "\u001anZ5g;I!ba\nm7l\u00166;", "@dP1<5M", "And?V,", "\u001anZ6bu\u001bc\u001a\u007fzk,{v9u\r&{\u0016", "@dP1<5M\u0012#\u0005}m;\b", "D`aF;,:R\u0019\f\t", "\u001anZ5g;I!bazZ+|\u0016=;", "@d`BX:M6\u0019zy^9\u000b", "@db=b5LS{~v],\n\u0017", "D`aF@(MQ\u001c~\t", "", "1`R5X++S'\n\u0005g:|", "\u001anZ5g;I!bkzl7\u0007\u0012=eU", "1`R5X++S%\u000fzl;", "<df\u001fX8NS'\u000e", "\u001anZ5g;I!bkzj<|\u0017>;", "6`b#T9R/ \u0006", "D`aF90>Z\u0018\r", "", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Set<String> varyFields(Headers headers) {
            int size = headers.size();
            TreeSet treeSet = null;
            for (int i2 = 0; i2 < size; i2++) {
                if (StringsKt.equals("Vary", headers.name(i2), true)) {
                    String strValue = headers.value(i2);
                    if (treeSet == null) {
                        treeSet = new TreeSet(StringsKt.getCASE_INSENSITIVE_ORDER(StringCompanionObject.INSTANCE));
                    }
                    Iterator it = StringsKt.split$default((CharSequence) strValue, new char[]{AbstractJsonLexerKt.COMMA}, false, 0, 6, (Object) null).iterator();
                    while (it.hasNext()) {
                        treeSet.add(StringsKt.trim((CharSequence) it.next()).toString());
                    }
                }
            }
            return treeSet == null ? SetsKt.emptySet() : treeSet;
        }

        private final Headers varyHeaders(Headers headers, Headers headers2) {
            Set<String> setVaryFields = varyFields(headers2);
            if (setVaryFields.isEmpty()) {
                return Util.EMPTY_HEADERS;
            }
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            for (int i2 = 0; i2 < size; i2++) {
                String strName = headers.name(i2);
                if (setVaryFields.contains(strName)) {
                    builder.add(strName, headers.value(i2));
                }
            }
            return builder.build();
        }

        public final boolean hasVaryAll(Response response) {
            Intrinsics.checkNotNullParameter(response, "<this>");
            return varyFields(response.headers()).contains(ProxyConfig.MATCH_ALL_SCHEMES);
        }

        @JvmStatic
        public final String key(HttpUrl url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return ByteString.Companion.encodeUtf8(url.toString()).md5().hex();
        }

        public final int readInt$okhttp(BufferedSource source) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            try {
                long decimalLong = source.readDecimalLong();
                String utf8LineStrict = source.readUtf8LineStrict();
                if (decimalLong < 0 || decimalLong > 2147483647L || utf8LineStrict.length() > 0) {
                    throw new IOException("expected an int but was \"" + decimalLong + utf8LineStrict + '\"');
                }
                return (int) decimalLong;
            } catch (NumberFormatException e2) {
                throw new IOException(e2.getMessage());
            }
        }

        public final Headers varyHeaders(Response response) {
            Intrinsics.checkNotNullParameter(response, "<this>");
            Response responseNetworkResponse = response.networkResponse();
            Intrinsics.checkNotNull(responseNetworkResponse);
            return varyHeaders(responseNetworkResponse.request().headers(), response.headers());
        }

        public final boolean varyMatches(Response cachedResponse, Headers cachedRequest, Request newRequest) {
            Intrinsics.checkNotNullParameter(cachedResponse, "cachedResponse");
            Intrinsics.checkNotNullParameter(cachedRequest, "cachedRequest");
            Intrinsics.checkNotNullParameter(newRequest, "newRequest");
            Set<String> setVaryFields = varyFields(cachedResponse.headers());
            if ((setVaryFields instanceof Collection) && setVaryFields.isEmpty()) {
                return true;
            }
            for (String str : setVaryFields) {
                if (!Intrinsics.areEqual(cachedRequest.values(str), newRequest.headers(str))) {
                    return false;
                }
            }
            return true;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Яď\u0014D57\u001eq\u007fR܀kŞ\fA\u001c0\u0013.H~*,(w\u000ffp98DsN6ɟ[*%k\u0004é,[2zK;[\u001a\u0006\"\u0017[Vʴon`Z\u0013¼\u0017\u0006$\u007fr,OU\u0001](\u000f:Bu?;M\u0006=A`z7\r H\"@ц\r\u0001(HP\u0010\rzKŷ\u0014\u0012F@xíZ\rc\u0005\"\u0012\u001c>(ҵ&\\uN>ԟt]P/+\u0003oCV'u0\u0005M\u0013FZ'#Ǹ\u007fK[@e4M$\u0001C\u0014XoO\u0007MqU\u0005\u0017(ݳ/I\u0002Yve\u0006(%/]\u0010urT`ԇU`\u001a,scqeh\u000eV\u0003+\u007f\u001bW\u001c\u000e4Cx2;\u001d~\b<7=\u0007a]h\bnD\u0010z\u0010UEC079Y3f\u007f\u0003\u0002\u0019\u0017G\n\b%\u001eQ\u0005\u001f)iv&dC>%w\u007fU\u001a\\Kmf\n\bc\u001e\b~\n\u001a*2Xw\n=%)4''G[gBO\nHH\rw\u0005/xh\u0002\u0010\u0003PNM\u0007\u001aeVY\f\th5\u0011yVlXZ\u0018$ȿVΘ\u0002\b\u001b\u05fe-\u0006J)=\u0012dN\u0017rAܗ_ܦ)/nŽ*\u0001y\u0018o9\r>k\u0012:߇c؏z\u0018W>h\u000ffr\u0013_\u001agt(P@\u001fН\u0012ȑ\u007fDVۼc>M\u000144ZAo¥\u0017Ƞ\u0007\u001eJˆM\u0015mk\u0001\u0010-f\nɷ\u0005Ȑ(t\u0011ɖ!h~\u0003\u007fxw:Sʣ$έEQ=ӧva0|L|Q\u001cU͡\u0002ěkLOƂ=\"\u0004k\u0014 D,\u0010֚1ˮ\u0017\u000f\u0007ǻ\u0003\u000e;\\dr\u0014i$ȿ)ϸ\u0001y\u0017\u00909:u!\u0003pZuA\u07bdQݚ\u001b\"~ܥљ'6"}, d2 = {"\u001anZ5g;I!b\\v\\/|G\u000fn\u000f5\u0010\u0016", "", "@`f b<KQ\u0019", "\u001anZ6bu,])\fx^\u0002", "uK^8\\6\bA#\u000f\b\\,RL ", "@db=b5LS", "\u001anZ5g;I!bkzl7\u0007\u0012=eU", "uK^8[;M^fHg^:\b\u00138s\u007f}?1", "1nS2", "", "6`]1f/:Y\u0019", "\u001anZ5g;I!bavg+\u000b\f+k\u007f}", "7r7Ag7L", "", "u(I", ";db@T.>", "", ">q^Ab*HZ", "\u001anZ5g;I!bi\bh;\u0007\u00079lU", "@dR2\\=>R\u0006~\ti6\u0006\u0017/M\u0004/\u0003D\u000f", "", "@d`BX:M;\u0019\u000e}h+", "@db=b5LS{~v],\n\u0017", "\u001anZ5g;I!bazZ+|\u0016=;", "Ad]AE,Jc\u0019\r\nF0\u0004\u00103s", "Cq[", "\u001anZ5g;I!ba\nm7l\u00166;", "D`aF;,:R\u0019\f\t", ";`c0[,L", "@d`BX:M", "\u001anZ5g;I!bkzj<|\u0017>;", "@dP16,Kb\u001d\u007f~\\(\f\t\u0016i\u000e7", "", "\u001aiPCTuLS\u0017\u000f\bb;\u0011R-e\r7E\u001e\u0001$&Kp\u0012:r45/", "And?V,", "\u001anZ6bu\u001bc\u001a\u007fzk,{v9u\r&{\u0016", "AmP=f/Hb", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&w>\u0004\u0017`&s\u001cB]2E7y\u001e:mT\u001cV?Fy7($>", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&w>\u0004\u0017`&s\u001cB]2E7y\u001e:mk", "EqXAX\n>`(e~l;", "", "Ah]8", "\u001anZ6bu\u001bc\u001a\u007fzk,{v3n\u0006}", "1daA\\-BQ\u0015\u000ezl", "EqXAX\u001bH", "3cXAb9", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&w>\u0004\u0017`&s\u001cB]2E7y\u001e:mT\u000eLGJuAs", "\u0011n\\=T5B]\"", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class Entry {
        private final int code;
        private final Handshake handshake;
        private final String message;
        private final Protocol protocol;
        private final long receivedResponseMillis;
        private final String requestMethod;
        private final Headers responseHeaders;
        private final long sentRequestMillis;
        private final HttpUrl url;
        private final Headers varyHeaders;
        public static final Companion Companion = new Companion(null);
        private static final String SENT_MILLIS = Platform.Companion.get().getPrefix() + "-Sent-Millis";
        private static final String RECEIVED_MILLIS = Platform.Companion.get().getPrefix() + "-Received-Millis";

        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005\"2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00050i%\nCiWpԅ$\u07beSNo˧?Vh\u000e[\u000f4\u0018O̖.֒Yxe܈ƪ6F"}, d2 = {"\u001anZ5g;I!b\\v\\/|G\u000fn\u000f5\u0010~^!\u001fRk\u0017@\u0001.\u000b", "", "u(E", " D2\u0012<\u001d\u001e2\u0013f^E\u0013`v", "", "!D=!R\u0014\":\u007fbh", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public Entry(Response response) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.url = response.request().url();
            this.varyHeaders = Cache.Companion.varyHeaders(response);
            this.requestMethod = response.request().method();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.responseHeaders = response.headers();
            this.handshake = response.handshake();
            this.sentRequestMillis = response.sentRequestAtMillis();
            this.receivedResponseMillis = response.receivedResponseAtMillis();
        }

        public Entry(Source rawSource) throws IOException {
            Intrinsics.checkNotNullParameter(rawSource, "rawSource");
            Source source = rawSource;
            try {
                BufferedSource bufferedSourceBuffer = Okio.buffer(rawSource);
                String utf8LineStrict = bufferedSourceBuffer.readUtf8LineStrict();
                HttpUrl httpUrl = HttpUrl.Companion.parse(utf8LineStrict);
                if (httpUrl == null) {
                    IOException iOException = new IOException("Cache corruption for " + utf8LineStrict);
                    Platform.Companion.get().log("cache corruption", 5, iOException);
                    throw iOException;
                }
                this.url = httpUrl;
                this.requestMethod = bufferedSourceBuffer.readUtf8LineStrict();
                Headers.Builder builder = new Headers.Builder();
                int int$okhttp = Cache.Companion.readInt$okhttp(bufferedSourceBuffer);
                for (int i2 = 0; i2 < int$okhttp; i2++) {
                    builder.addLenient$okhttp(bufferedSourceBuffer.readUtf8LineStrict());
                }
                this.varyHeaders = builder.build();
                StatusLine statusLine = StatusLine.Companion.parse(bufferedSourceBuffer.readUtf8LineStrict());
                this.protocol = statusLine.protocol;
                this.code = statusLine.code;
                this.message = statusLine.message;
                Headers.Builder builder2 = new Headers.Builder();
                int int$okhttp2 = Cache.Companion.readInt$okhttp(bufferedSourceBuffer);
                for (int i3 = 0; i3 < int$okhttp2; i3++) {
                    builder2.addLenient$okhttp(bufferedSourceBuffer.readUtf8LineStrict());
                }
                String str = SENT_MILLIS;
                String str2 = builder2.get(str);
                String str3 = RECEIVED_MILLIS;
                String str4 = builder2.get(str3);
                builder2.removeAll(str);
                builder2.removeAll(str3);
                this.sentRequestMillis = str2 != null ? Long.parseLong(str2) : 0L;
                this.receivedResponseMillis = str4 != null ? Long.parseLong(str4) : 0L;
                this.responseHeaders = builder2.build();
                if (isHttps()) {
                    String utf8LineStrict2 = bufferedSourceBuffer.readUtf8LineStrict();
                    if (utf8LineStrict2.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + utf8LineStrict2 + '\"');
                    }
                    this.handshake = Handshake.Companion.get(!bufferedSourceBuffer.exhausted() ? TlsVersion.Companion.forJavaName(bufferedSourceBuffer.readUtf8LineStrict()) : TlsVersion.SSL_3_0, CipherSuite.Companion.forJavaName(bufferedSourceBuffer.readUtf8LineStrict()), readCertificateList(bufferedSourceBuffer), readCertificateList(bufferedSourceBuffer));
                } else {
                    this.handshake = null;
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(source, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(source, th);
                    throw th2;
                }
            }
        }

        private final boolean isHttps() {
            return Intrinsics.areEqual(this.url.scheme(), "https");
        }

        private final List<Certificate> readCertificateList(BufferedSource bufferedSource) throws Throwable {
            int int$okhttp = Cache.Companion.readInt$okhttp(bufferedSource);
            if (int$okhttp == -1) {
                return CollectionsKt.emptyList();
            }
            String strUd = C1626yg.Ud("G>#qK", (short) (C1607wl.Xd() ^ 13862), (short) (C1607wl.Xd() ^ 4948));
            try {
                Class<?> cls = Class.forName(Ig.wd("8cd6 8DH\f.%P\u0007?\u0017@t~mhL\u0003\u0019,.s\r^q\u0012\rQe\u001e@\u000b/", (short) (C1633zX.Xd() ^ (-28174))));
                Class<?>[] clsArr = new Class[1];
                clsArr[0] = Class.forName(EO.Od("J\u001bq<\u0011t\u000eBn)$k9\"'E", (short) (C1499aX.Xd() ^ (-1753))));
                Object[] objArr = {strUd};
                Method declaredMethod = cls.getDeclaredMethod(C1561oA.Qd("1.<\u0010488$0$%", (short) (C1607wl.Xd() ^ 11336)), clsArr);
                try {
                    declaredMethod.setAccessible(true);
                    CertificateFactory certificateFactory = (CertificateFactory) declaredMethod.invoke(null, objArr);
                    ArrayList arrayList = new ArrayList(int$okhttp);
                    for (int i2 = 0; i2 < int$okhttp; i2++) {
                        String utf8LineStrict = bufferedSource.readUtf8LineStrict();
                        Buffer buffer = new Buffer();
                        ByteString byteStringDecodeBase64 = ByteString.Companion.decodeBase64(utf8LineStrict);
                        if (byteStringDecodeBase64 == null) {
                            short sXd = (short) (ZN.Xd() ^ 20473);
                            short sXd2 = (short) (ZN.Xd() ^ 16085);
                            int[] iArr = new int["V_K(s[84`?\u0015sQ\u001brY \u0010i\u0001\u0013\t\u0013#\nh6\u0010/A#\u0016\\@".length()];
                            QB qb = new QB("V_K(s[84`?\u0015sQ\u001brY \u0010i\u0001\u0013\t\u0013#\nh6\u0010/A#\u0016\\@");
                            int i3 = 0;
                            while (qb.YK()) {
                                int iKK = qb.KK();
                                Xu xuXd = Xu.Xd(iKK);
                                iArr[i3] = xuXd.fK(((i3 * sXd2) ^ sXd) + xuXd.CK(iKK));
                                i3++;
                            }
                            throw new IOException(new String(iArr, 0, i3));
                        }
                        buffer.write(byteStringDecodeBase64);
                        InputStream inputStream = buffer.inputStream();
                        Class<?> cls2 = Class.forName(C1593ug.zd("\u001a\u0012(\u0014a(\u001b\u001a-+#/5j!$25o\u0006)7:0.2-,@2\u001403EAEM", (short) (Od.Xd() ^ (-13478)), (short) (Od.Xd() ^ (-24676))));
                        Class<?>[] clsArr2 = new Class[1];
                        clsArr2[0] = Class.forName(C1561oA.od("=3G1|7<y\u001489=;\u001996(#.", (short) (FB.Xd() ^ 25715)));
                        Object[] objArr2 = {inputStream};
                        Method method = cls2.getMethod(C1561oA.Kd("hgqiwg{mLo}\u0001vtxsr\u0007x", (short) (ZN.Xd() ^ 18364)), clsArr2);
                        try {
                            method.setAccessible(true);
                            arrayList.add((Certificate) method.invoke(certificateFactory, objArr2));
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    }
                    return arrayList;
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (CertificateException e4) {
                throw new IOException(e4.getMessage());
            }
        }

        private final void writeCertList(BufferedSink bufferedSink, List<? extends Certificate> list) throws Throwable {
            try {
                bufferedSink.writeDecimalLong(list.size()).writeByte(10);
                for (Certificate certificate : list) {
                    Object[] objArr = new Object[0];
                    Method method = Class.forName(C1561oA.Xd("\u0002y\u0010{I\u0010\u0003\u0002\u0015\u0013\u000b\u0017\u001dR\t\f\u001a\u001dWm\u0011\u001f\"\u0018\u0016\u001a\u0015\u0014(\u001a", (short) (OY.Xd() ^ 16876))).getMethod(Wg.vd("{z\u000b\\~t\u0002wqq", (short) (ZN.Xd() ^ 17795)), new Class[0]);
                    try {
                        method.setAccessible(true);
                        byte[] bArr = (byte[]) method.invoke(certificate, objArr);
                        ByteString.Companion companion = ByteString.Companion;
                        Intrinsics.checkNotNullExpressionValue(bArr, Qg.kd("\n \u001a\n\u0017", (short) (ZN.Xd() ^ 31755), (short) (ZN.Xd() ^ 28924)));
                        bufferedSink.writeUtf8(ByteString.Companion.of$default(companion, bArr, 0, 0, 3, null).base64()).writeByte(10);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
            } catch (CertificateEncodingException e3) {
                throw new IOException(e3.getMessage());
            }
        }

        public final boolean matches(Request request, Response response) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(response, "response");
            return Intrinsics.areEqual(this.url, request.url()) && Intrinsics.areEqual(this.requestMethod, request.method()) && Cache.Companion.varyMatches(response, this.varyHeaders, request);
        }

        public final Response response(DiskLruCache.Snapshot snapshot) {
            Intrinsics.checkNotNullParameter(snapshot, "snapshot");
            String str = this.responseHeaders.get("Content-Type");
            String str2 = this.responseHeaders.get("Content-Length");
            return new Response.Builder().request(new Request.Builder().url(this.url).method(this.requestMethod, null).headers(this.varyHeaders).build()).protocol(this.protocol).code(this.code).message(this.message).headers(this.responseHeaders).body(new CacheResponseBody(snapshot, str, str2)).handshake(this.handshake).sentRequestAtMillis(this.sentRequestMillis).receivedResponseAtMillis(this.receivedResponseMillis).build();
        }

        public final void writeTo(DiskLruCache.Editor editor) throws IOException {
            Intrinsics.checkNotNullParameter(editor, "editor");
            BufferedSink bufferedSinkBuffer = Okio.buffer(editor.newSink(0));
            try {
                BufferedSink bufferedSink = bufferedSinkBuffer;
                bufferedSink.writeUtf8(this.url.toString()).writeByte(10);
                bufferedSink.writeUtf8(this.requestMethod).writeByte(10);
                bufferedSink.writeDecimalLong(this.varyHeaders.size()).writeByte(10);
                int size = this.varyHeaders.size();
                for (int i2 = 0; i2 < size; i2++) {
                    bufferedSink.writeUtf8(this.varyHeaders.name(i2)).writeUtf8(": ").writeUtf8(this.varyHeaders.value(i2)).writeByte(10);
                }
                bufferedSink.writeUtf8(new StatusLine(this.protocol, this.code, this.message).toString()).writeByte(10);
                bufferedSink.writeDecimalLong(this.responseHeaders.size() + 2).writeByte(10);
                int size2 = this.responseHeaders.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    bufferedSink.writeUtf8(this.responseHeaders.name(i3)).writeUtf8(": ").writeUtf8(this.responseHeaders.value(i3)).writeByte(10);
                }
                bufferedSink.writeUtf8(SENT_MILLIS).writeUtf8(": ").writeDecimalLong(this.sentRequestMillis).writeByte(10);
                bufferedSink.writeUtf8(RECEIVED_MILLIS).writeUtf8(": ").writeDecimalLong(this.receivedResponseMillis).writeByte(10);
                if (isHttps()) {
                    bufferedSink.writeByte(10);
                    Handshake handshake = this.handshake;
                    Intrinsics.checkNotNull(handshake);
                    bufferedSink.writeUtf8(handshake.cipherSuite().javaName()).writeByte(10);
                    writeCertList(bufferedSink, this.handshake.peerCertificates());
                    writeCertList(bufferedSink, this.handshake.localCertificates());
                    bufferedSink.writeUtf8(this.handshake.tlsVersion().javaName()).writeByte(10);
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(bufferedSinkBuffer, null);
            } finally {
            }
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u0016DLш|\u0004W\u00068\u000bDB\u0007\"2\u0012\u007f\u0007|jA0JeP.`\\2\u000fq~<$i$yّA٨\u001c\u0014̝9O|f(}Zb\u0019C'\nDy;,wWޯa\u0012\u001d5\u000buM@eokG'\t~\u000b.6:8(\nG.zT\u001ez\u0013Cy\u0011hؖB¤>R\u0015˟U& \fV /#3ɤPɇLleŽ\u007f;\u0011pZNUg\u0007ŮYϘJ`/˙\u000fc$4NAU\u0017+^\u0011\u0013#kM\u0003Wuk\u00069'U- ֘Y͏\\\u007f\u001cƃ۩S\u001c"}, d2 = {"\u001anZ5g;I!b\\v\\/|G\u001ce{/Y<~\u001a\u00174o\u001aLv3D/", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&w>\u0004\u0017`%k\f?v\u00125e\u000e E|k", "3cXAb9", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&w>\u0004\u0017`&s\u001cB]2E7y\u001e:mT\u000eLGJuAs", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&w>\u0004\u0017`&s\u001cB]2E7y\u001e:mk", "uK^8[;M^fHXZ*\u007f\t\u0005L\n.~O\u0010\"d\u0011s\u0017Kv2>U\u0005i5i\u00141M\r\u001aoB${uq\u0017\u0003a/N5\u0007FP]6i(6.", "0nSF", "\u001anZ6bu,W\"\u0005P", "1`R5X\u0016Nb", "2n]2", "", "5dc\u0011b5>", "u(I", "Adc\u0011b5>", "uY\u0018#", "/a^?g", "", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private final class RealCacheRequest implements CacheRequest {
        private final Sink body;
        private final Sink cacheOut;
        private boolean done;
        private final DiskLruCache.Editor editor;
        final /* synthetic */ Cache this$0;

        public RealCacheRequest(final Cache cache, DiskLruCache.Editor editor) {
            Intrinsics.checkNotNullParameter(editor, "editor");
            this.this$0 = cache;
            this.editor = editor;
            Sink sinkNewSink = editor.newSink(1);
            this.cacheOut = sinkNewSink;
            this.body = new ForwardingSink(sinkNewSink) { // from class: okhttp3.Cache.RealCacheRequest.1
                @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    Cache cache2 = cache;
                    RealCacheRequest realCacheRequest = this;
                    synchronized (cache2) {
                        if (realCacheRequest.getDone()) {
                            return;
                        }
                        realCacheRequest.setDone(true);
                        cache2.setWriteSuccessCount$okhttp(cache2.getWriteSuccessCount$okhttp() + 1);
                        super.close();
                        this.editor.commit();
                    }
                }
            };
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public void abort() {
            Cache cache = this.this$0;
            synchronized (cache) {
                if (this.done) {
                    return;
                }
                this.done = true;
                cache.setWriteAbortCount$okhttp(cache.getWriteAbortCount$okhttp() + 1);
                Util.closeQuietly(this.cacheOut);
                try {
                    this.editor.abort();
                } catch (IOException unused) {
                }
            }
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public Sink body() {
            return this.body;
        }

        public final boolean getDone() {
            return this.done;
        }

        public final void setDone(boolean z2) {
            this.done = z2;
        }
    }

    /* JADX INFO: renamed from: okhttp3.Cache$urls$1, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я)\u001d̉=!,\u0011\bDRo|İI\u0006>\u00146Ȑ\u0007\"B\u0012\u007f\u0007|jA0JgP.`S2ş\u0014zé*c:ڎsAe\u001c\u000e\"7O|f0uXa#C=\b\\ѥjtPc\u0001u\u0012=2\tĺ?{S}FQ`#@K4\u0003.Fz\u001d\u0001H,\u001fƸ\u0003ټGK\u0014۵\u0001V~=j\u0017]\u000b*\u00164Bp\u0001La\u0016M\rԢnҺ>/+Ʌ:P\\-w2\u0013L;F+\u070e\u0019țe\u001e3¨ˣ9 "}, d2 = {"=jWAg7\f\u001dvzxa,;\u0019<l\u000efG", "", "", "1`]\u001fX4Hd\u0019", "", "2d[2Z(MS", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&w>\u0004\u0017`&s\u001cB]2E7y\u001e:mT\u001cV?Fy7($>", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&w>\u0004\u0017`&s\u001cB]2E7y\u001e:mk", "<dgAH9E", "6`b\u001bX?M", "<dgA", "@d\\<i,", "", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass1 implements Iterator<String>, KMutableIterator {
        private boolean canRemove;
        private final Iterator<DiskLruCache.Snapshot> delegate;
        private String nextUrl;

        AnonymousClass1(Cache cache) {
            this.delegate = cache.getCache$okhttp().snapshots();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.nextUrl != null) {
                return true;
            }
            this.canRemove = false;
            while (this.delegate.hasNext()) {
                try {
                    DiskLruCache.Snapshot next = this.delegate.next();
                    try {
                        continue;
                        this.nextUrl = Okio.buffer(next.getSource(0)).readUtf8LineStrict();
                        CloseableKt.closeFinally(next, null);
                        return true;
                    } finally {
                        try {
                            continue;
                        } catch (Throwable th) {
                        }
                    }
                } catch (IOException unused) {
                }
            }
            return false;
        }

        @Override // java.util.Iterator
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.nextUrl;
            Intrinsics.checkNotNull(str);
            this.nextUrl = null;
            this.canRemove = true;
            return str;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.canRemove) {
                throw new IllegalStateException("remove() before next()".toString());
            }
            this.delegate.remove();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Cache(File directory, long j2) {
        this(directory, j2, FileSystem.SYSTEM);
        Intrinsics.checkNotNullParameter(directory, "directory");
    }

    public Cache(File directory, long j2, FileSystem fileSystem) {
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        this.cache = new DiskLruCache(fileSystem, directory, VERSION, 2, j2, TaskRunner.INSTANCE);
    }

    private final void abortQuietly(DiskLruCache.Editor editor) {
        if (editor != null) {
            try {
                editor.abort();
            } catch (IOException unused) {
            }
        }
    }

    @JvmStatic
    public static final String key(HttpUrl httpUrl) {
        return Companion.key(httpUrl);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "directory", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_directory, reason: not valid java name */
    public final File m10671deprecated_directory() {
        return this.cache.getDirectory();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.cache.close();
    }

    public final void delete() throws IOException {
        this.cache.delete();
    }

    public final File directory() {
        return this.cache.getDirectory();
    }

    public final void evictAll() throws IOException {
        this.cache.evictAll();
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        this.cache.flush();
    }

    public final Response get$okhttp(Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        try {
            DiskLruCache.Snapshot snapshot = this.cache.get(Companion.key(request.url()));
            if (snapshot == null) {
                return null;
            }
            try {
                Entry entry = new Entry(snapshot.getSource(0));
                Response response = entry.response(snapshot);
                if (entry.matches(request, response)) {
                    return response;
                }
                ResponseBody responseBodyBody = response.body();
                if (responseBodyBody != null) {
                    Util.closeQuietly(responseBodyBody);
                }
                return null;
            } catch (IOException unused) {
                Util.closeQuietly(snapshot);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    public final DiskLruCache getCache$okhttp() {
        return this.cache;
    }

    public final int getWriteAbortCount$okhttp() {
        return this.writeAbortCount;
    }

    public final int getWriteSuccessCount$okhttp() {
        return this.writeSuccessCount;
    }

    public final synchronized int hitCount() {
        return this.hitCount;
    }

    public final void initialize() throws IOException {
        this.cache.initialize();
    }

    public final boolean isClosed() {
        return this.cache.isClosed();
    }

    public final long maxSize() {
        return this.cache.getMaxSize();
    }

    public final synchronized int networkCount() {
        return this.networkCount;
    }

    public final CacheRequest put$okhttp(Response response) {
        DiskLruCache.Editor editorEdit$default;
        Intrinsics.checkNotNullParameter(response, "response");
        String strMethod = response.request().method();
        if (HttpMethod.INSTANCE.invalidatesCache(response.request().method())) {
            try {
                remove$okhttp(response.request());
            } catch (IOException unused) {
            }
            return null;
        }
        if (!Intrinsics.areEqual(strMethod, "GET")) {
            return null;
        }
        Companion companion = Companion;
        if (companion.hasVaryAll(response)) {
            return null;
        }
        Entry entry = new Entry(response);
        try {
            editorEdit$default = DiskLruCache.edit$default(this.cache, companion.key(response.request().url()), 0L, 2, null);
            if (editorEdit$default == null) {
                return null;
            }
            try {
                entry.writeTo(editorEdit$default);
                return new RealCacheRequest(this, editorEdit$default);
            } catch (IOException unused2) {
                abortQuietly(editorEdit$default);
                return null;
            }
        } catch (IOException unused3) {
            editorEdit$default = null;
        }
    }

    public final void remove$okhttp(Request request) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        this.cache.remove(Companion.key(request.url()));
    }

    public final synchronized int requestCount() {
        return this.requestCount;
    }

    public final void setWriteAbortCount$okhttp(int i2) {
        this.writeAbortCount = i2;
    }

    public final void setWriteSuccessCount$okhttp(int i2) {
        this.writeSuccessCount = i2;
    }

    public final long size() throws IOException {
        return this.cache.size();
    }

    public final synchronized void trackConditionalCacheHit$okhttp() {
        this.hitCount++;
    }

    public final synchronized void trackResponse$okhttp(CacheStrategy cacheStrategy) {
        Intrinsics.checkNotNullParameter(cacheStrategy, "cacheStrategy");
        this.requestCount++;
        if (cacheStrategy.getNetworkRequest() != null) {
            this.networkCount++;
        } else if (cacheStrategy.getCacheResponse() != null) {
            this.hitCount++;
        }
    }

    public final void update$okhttp(Response cached, Response network) {
        DiskLruCache.Editor editorEdit;
        Intrinsics.checkNotNullParameter(cached, "cached");
        Intrinsics.checkNotNullParameter(network, "network");
        Entry entry = new Entry(network);
        ResponseBody responseBodyBody = cached.body();
        Intrinsics.checkNotNull(responseBodyBody, "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        try {
            editorEdit = ((CacheResponseBody) responseBodyBody).getSnapshot().edit();
            if (editorEdit == null) {
                return;
            }
            try {
                entry.writeTo(editorEdit);
                editorEdit.commit();
            } catch (IOException unused) {
                abortQuietly(editorEdit);
            }
        } catch (IOException unused2) {
            editorEdit = null;
        }
    }

    public final Iterator<String> urls() throws IOException {
        return new AnonymousClass1(this);
    }

    public final synchronized int writeAbortCount() {
        return this.writeAbortCount;
    }

    public final synchronized int writeSuccessCount() {
        return this.writeSuccessCount;
    }
}
