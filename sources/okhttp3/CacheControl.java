package okhttp3;

import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004O\u000f8\u000b4B\u0007\":\u0018\u007f\u0007lrA0RqP.Xb@ş\n\u001bd$\n#*CYtZm(\t_Rug\u0007J\t\fS\u0013\u0014\u0018\u0011jZJe|k\u0015'2psO7[tU9\u000fxF\t.8:8(\u0006\u0011\u001e8O(v)D[\u0010 8XphS\u001dQ\u0013#*\u0006l$\u0011\"jqf6vpm>=.\u001bipO7c>\te\rtU7\u0011\u0005n6+n8E\u001b3a\u001b\thZm\u0012ӭu=\u0013xo29V\fWdYF\u0019Ʀ/O\u0013p;1j\bi`:+qTӍOP\u0014<@\u0006\n\u0016T\u0004<\nmMͶ1\u001al\u001dV>\u0003|k@~\u0006%Gȸ~a<-m\u000bA3Q\u001b\u0015R(@ϭR7\u0002\u001cU)1\u0001\u0007!\nUTeڠ\u001fT}iy\\N?`N8Z\u0004rձtb\bCL;U\fG{?/]*ھ_9);4\rVO\u007fv3a/XׂVHF=7!E/!\f\tH+\n\u07fbTT^HYS*q\u001f}6\"fpHJ/3(Peg\u0018y$έ\u0016ɻ3f?ժ?|\u001cdQ^a6\bhߧeX~ܝW>h\u0012fw\u0013b\u001a`t(P3ʮn\u0016\u007fӻ\\P\u0012\u0019@PB+B3I\u0019\u000b\u0016Ƞ\u0007$Jˆ\u0015\u000beav!OeA'\u001biRx?\u0006˩`vwΟ\u0011K2\u007fn4}R_>1&\u0004&\u001f9č'\r\u0007͞\u0018ImUU^='\u0004_\u0014 D\u001eoVȠA\u0019\u0017ȯA4\b7S^Cv_U*')}0\u0014³l4oō\u0003r2hx[ e%\"\u000f^!$>iѣ}gNک_eZ\u000biO\u001a\u0004\u0011[TNf};$Ǫ)\u0007wܲ\u001573E5.f\t\";-a\fj&3ԃf\u0015.۩}\u00062o$\u00013bk=S8wZ5Cѐ(r\u000bܩ`l}\u0013P\u001a\u0005\u001eAMYd\u001fZnRߵ3\u0004n߿D\u000fv[iLݍs\u001e"}, d2 = {"\u001anZ5g;I!b\\v\\/|f9n\u000f5\u0006GV", "", "<n2.V/>", "", "<nBAb9>", ";`g\u000eZ,,S\u0017\t\u0004]:", "", "ALPE4.>A\u0019|\u0005g+\u000b", "7r??\\=:b\u0019", "7r?BU3BQ", ";tbAE,OO \u0003yZ;|", ";`g g(ES\u0007~xh5{\u0017", ";h]\u0013e,LV\u0007~xh5{\u0017", "=m[F<-\u001cO\u0017\u0002z]", "<nC?T5LT#\f\u0003", "7l\\Bg(;Z\u0019", "6dP1X9/O \u000fz", "", "uYI\u0016<!3H|boS!c\u000e+v{q\u0003<\n\u0019`5~\u001b@\u007f'\u000b\u001dn", "u(I", "u(8", "zcT=e,<O(~yX0\u0005\u0011?t{%\u0003@", "zcT=e,<O(~yX4x\u001c\u000bg\u007f\u0016{>\u000b \u0016U", "zcT=e,<O(~yX4x\u001c\u001dt{/{.\u0001\u0015!Pn\u001c", "zcT=e,<O(~yX4\u0001\u0012\u0010r\u007f6~.\u0001\u0015!Pn\u001c", "zcT=e,<O(~yX4\r\u0017>R\u007f9wG\u0005\u0016\u0013Vo", "zcT=e,<O(~yX5\u0007f+c\u0003(", "zcT=e,<O(~yX5\u0007v>o\r(", "zcT=e,<O(~yX5\u0007w<a\t6|J\u000e\u001f", "zcT=e,<O(~yX6\u0006\u0010CI\u0001\u0006w>\u0004\u0017\u0016", "zcT=e,<O(~yX:d\u0005BA\u0002(i@~! F}", "BnBAe0GU", "\u0010tX9W,K", "\u0011n\\=T5B]\"", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class CacheControl {
    private String headerValue;
    private final boolean immutable;
    private final boolean isPrivate;
    private final boolean isPublic;
    private final int maxAgeSeconds;
    private final int maxStaleSeconds;
    private final int minFreshSeconds;
    private final boolean mustRevalidate;
    private final boolean noCache;
    private final boolean noStore;
    private final boolean noTransform;
    private final boolean onlyIfCached;
    private final int sMaxAgeSeconds;
    public static final Companion Companion = new Companion(null);
    public static final CacheControl FORCE_NETWORK = new Builder().noCache().build();
    public static final CacheControl FORCE_CACHE = new Builder().onlyIfCached().maxStale(Integer.MAX_VALUE, TimeUnit.SECONDS).build();

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00146Ȑ\u0007\":\u0018\u007f\u0007loA0ZeP.XS2\u000f\u0002{<$a%yCI\\\"Ԃ8ޛ\u007fN\u0016f/MҼ\u000fC\u001d\u0006^|x7aU'iZ\u0013@C\b?aݹ8QGm\r63ړb&F\u0007\u001d\u0001H.x\u0014\u0005\t[K:!xT~Jj\r{ĨJ\u0016\u0014N8\u0001L`\u0018RDV\u0005]h>k\u0017wSf'\u000eܞ-Q\u001bWl';z\u0012\"9NO5C4\u001c\u0007\u0015Ys?1ӊ:A\u0013p?'Yɞ<[Da\u0018\u0014Cۀ\u0018\u0011k|>\\3ĩ)\u00165=gcyT6(&\u000eB\r\r\u0010\u001c\u0007?H\\/pǔ\u0014ԧ7tzԟ\u0011\\\u0010aZ\u007f)e\rА1ő7+Aӕ7]o@1Ne\u007f[ٿ*ţ\u0005n)ż%\u001an\u001b3T&U\b҈LףLN\u0012ԯ\u000ey\u0012wz\u0002X\u0006\u0007ϝ\f\u009e\u007f\u00116ϏuCiA;!\u001a\u0004\u001fֶsЛ\t`pׅ:^VI:nD9\u0001¡\u0018ʑHd\rߘ!`f6)MJV]å\u0014˙$\\\u007f˓ǂ)$"}, d2 = {"\u001anZ5g;I!b\\v\\/|f9n\u000f5\u0006G?s'Kv\r<\u0004z", "", "u(E", "7l\\Bg(;Z\u0019", "", ";`g\u000eZ,,S\u0017\t\u0004]:", "", ";`g g(ES\u0007~xh5{\u0017", ";h]\u0013e,LV\u0007~xh5{\u0017", "<n2.V/>", "<nBAb9>", "<nC?T5LT#\f\u0003", "=m[F<-\u001cO\u0017\u0002z]", "0tX9W", "\u001anZ5g;I!b\\v\\/|f9n\u000f5\u0006GV", ";`g\u000eZ,", "Bh\\2H5Bb", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0006\u001bOo}Ez4\u000b", ";`g g(ES", ";h]\u0013e,LV", "1kP:c\u001bH7\"\u000e", "", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Builder {
        private boolean immutable;
        private int maxAgeSeconds = -1;
        private int maxStaleSeconds = -1;
        private int minFreshSeconds = -1;
        private boolean noCache;
        private boolean noStore;
        private boolean noTransform;
        private boolean onlyIfCached;

        private final int clampToInt(long j2) {
            if (j2 > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            return (int) j2;
        }

        public final CacheControl build() {
            return new CacheControl(this.noCache, this.noStore, this.maxAgeSeconds, -1, false, false, false, this.maxStaleSeconds, this.minFreshSeconds, this.onlyIfCached, this.noTransform, this.immutable, null, null);
        }

        public final Builder immutable() {
            this.immutable = true;
            return this;
        }

        public final Builder maxAge(int i2, TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            if (i2 < 0) {
                throw new IllegalArgumentException(("maxAge < 0: " + i2).toString());
            }
            this.maxAgeSeconds = clampToInt(timeUnit.toSeconds(i2));
            return this;
        }

        public final Builder maxStale(int i2, TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            if (i2 < 0) {
                throw new IllegalArgumentException(("maxStale < 0: " + i2).toString());
            }
            this.maxStaleSeconds = clampToInt(timeUnit.toSeconds(i2));
            return this;
        }

        public final Builder minFresh(int i2, TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            if (i2 < 0) {
                throw new IllegalArgumentException(("minFresh < 0: " + i2).toString());
            }
            this.minFreshSeconds = clampToInt(timeUnit.toSeconds(i2));
            return this;
        }

        public final Builder noCache() {
            this.noCache = true;
            return this;
        }

        public final Builder noStore() {
            this.noStore = true;
            return this;
        }

        public final Builder noTransform() {
            this.noTransform = true;
            return this;
        }

        public final Builder onlyIfCached() {
            this.onlyIfCached = true;
            return this;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005#4\u0012\u000e\u0007nʑA0RkP.`_2\u000fq|:Š\\:ڎs;\u0004\u0019>'\u000fOɁkg|J#\u0019Q\u0013\u001e\u0016'l\\Mc}u\u0012=8\tt\bO[vU9\u000f|^\u0005N;R<\b\u000f\u0019\u001aXQ@|\u0001CY\u0017*0nx\u0001R][\u0013\u001b*\u0006l\"7\"3ɩPɇLleŽ\u007f1\u0011lZNUaf\u0001$νHù+\r~ѭԅ/L"}, d2 = {"\u001anZ5g;I!b\\v\\/|f9n\u000f5\u0006G?t!Oz\nEz/>/", "", "u(E", "\u0014NA\u00108&\u001c/vaZ", "\u001anZ5g;I!b\\v\\/|f9n\u000f5\u0006GV", "\u0014NA\u00108&'3\bpdK\u0012", ">`a@X", "6dP1X9L", "\u001anZ5g;I!bazZ+|\u0016=;", "7mS2k\u0016?3 ~\u0003^5\f", "", "", "1gP?T*MS&\r", "AsP?g\u0010GR\u0019\u0012", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int indexOfElement(String str, String str2, int i2) {
            int length = str.length();
            while (i2 < length) {
                if (StringsKt.contains$default((CharSequence) str2, str.charAt(i2), false, 2, (Object) null)) {
                    return i2;
                }
                i2++;
            }
            return str.length();
        }

        static /* synthetic */ int indexOfElement$default(Companion companion, String str, String str2, int i2, int i3, Object obj) {
            if ((i3 & 2) != 0) {
                i2 = 0;
            }
            return companion.indexOfElement(str, str2, i2);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0041  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final okhttp3.CacheControl parse(okhttp3.Headers r31) {
            /*
                Method dump skipped, instruction units count: 372
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.CacheControl.Companion.parse(okhttp3.Headers):okhttp3.CacheControl");
        }
    }

    private CacheControl(boolean z2, boolean z3, int i2, int i3, boolean z4, boolean z5, boolean z6, int i4, int i5, boolean z7, boolean z8, boolean z9, String str) {
        this.noCache = z2;
        this.noStore = z3;
        this.maxAgeSeconds = i2;
        this.sMaxAgeSeconds = i3;
        this.isPrivate = z4;
        this.isPublic = z5;
        this.mustRevalidate = z6;
        this.maxStaleSeconds = i4;
        this.minFreshSeconds = i5;
        this.onlyIfCached = z7;
        this.noTransform = z8;
        this.immutable = z9;
        this.headerValue = str;
    }

    public /* synthetic */ CacheControl(boolean z2, boolean z3, int i2, int i3, boolean z4, boolean z5, boolean z6, int i4, int i5, boolean z7, boolean z8, boolean z9, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2, z3, i2, i3, z4, z5, z6, i4, i5, z7, z8, z9, str);
    }

    @JvmStatic
    public static final CacheControl parse(Headers headers) {
        return Companion.parse(headers);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "immutable", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_immutable, reason: not valid java name */
    public final boolean m10672deprecated_immutable() {
        return this.immutable;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "maxAgeSeconds", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_maxAgeSeconds, reason: not valid java name */
    public final int m10673deprecated_maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "maxStaleSeconds", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_maxStaleSeconds, reason: not valid java name */
    public final int m10674deprecated_maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "minFreshSeconds", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_minFreshSeconds, reason: not valid java name */
    public final int m10675deprecated_minFreshSeconds() {
        return this.minFreshSeconds;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "mustRevalidate", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_mustRevalidate, reason: not valid java name */
    public final boolean m10676deprecated_mustRevalidate() {
        return this.mustRevalidate;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "noCache", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_noCache, reason: not valid java name */
    public final boolean m10677deprecated_noCache() {
        return this.noCache;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "noStore", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_noStore, reason: not valid java name */
    public final boolean m10678deprecated_noStore() {
        return this.noStore;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "noTransform", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_noTransform, reason: not valid java name */
    public final boolean m10679deprecated_noTransform() {
        return this.noTransform;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "onlyIfCached", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_onlyIfCached, reason: not valid java name */
    public final boolean m10680deprecated_onlyIfCached() {
        return this.onlyIfCached;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "sMaxAgeSeconds", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_sMaxAgeSeconds, reason: not valid java name */
    public final int m10681deprecated_sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    public final boolean immutable() {
        return this.immutable;
    }

    public final boolean isPrivate() {
        return this.isPrivate;
    }

    public final boolean isPublic() {
        return this.isPublic;
    }

    public final int maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    public final int maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    public final int minFreshSeconds() {
        return this.minFreshSeconds;
    }

    public final boolean mustRevalidate() {
        return this.mustRevalidate;
    }

    public final boolean noCache() {
        return this.noCache;
    }

    public final boolean noStore() {
        return this.noStore;
    }

    public final boolean noTransform() {
        return this.noTransform;
    }

    public final boolean onlyIfCached() {
        return this.onlyIfCached;
    }

    public final int sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    public String toString() {
        String str = this.headerValue;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.noCache) {
            sb.append("no-cache, ");
        }
        if (this.noStore) {
            sb.append("no-store, ");
        }
        if (this.maxAgeSeconds != -1) {
            sb.append("max-age=").append(this.maxAgeSeconds).append(", ");
        }
        if (this.sMaxAgeSeconds != -1) {
            sb.append("s-maxage=").append(this.sMaxAgeSeconds).append(", ");
        }
        if (this.isPrivate) {
            sb.append("private, ");
        }
        if (this.isPublic) {
            sb.append("public, ");
        }
        if (this.mustRevalidate) {
            sb.append("must-revalidate, ");
        }
        if (this.maxStaleSeconds != -1) {
            sb.append("max-stale=").append(this.maxStaleSeconds).append(", ");
        }
        if (this.minFreshSeconds != -1) {
            sb.append("min-fresh=").append(this.minFreshSeconds).append(", ");
        }
        if (this.onlyIfCached) {
            sb.append("only-if-cached, ");
        }
        if (this.noTransform) {
            sb.append("no-transform, ");
        }
        if (this.immutable) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        this.headerValue = string;
        return string;
    }
}
