package okhttp3.internal.http2;

import com.dynatrace.android.agent.Global;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;
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
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4B\u0007\"B\u0012\u007f\u0007lkA0RkP.XU2\u000fy\u0005<$a'w٘Akڼ\u001c39O|f m[\u001b I#\u0016\u001a\u0007jDI\u0004ym\u0016\u001d4Zom4ޜs=Gc5K\u000b4B&Fy\u001d\u0001H.X\u0014\u0005|[K:\u0013ضDpHWM`\u0015\u001e \u0006V /\"lk\\8`l\f>ǥ'\u0003wH\u0017.m9\u0015M;J\u001bݒ\u000e?h,5X7c\u0019kڌ\u0004OmiJ\u001b? ܵ5n-'9I\fWd\\0\u001a\u001b+]\u000furT`KŰ_T89[{K~\u001bX}\t\n%>\u001a\r4&\u000fΪ.bm\u0016\u001dKt![\u0007ѧ\u0001'H\u000e\u000by6E&FG{G)miai!\u0005;Rˤ\u000f̷'\u0001vď,b\u001c`-\u001b\u0003{\b5(̽?˓R\naƝ>\u0012~d\u001a*24}\u0004\u0006ɍ\u0013ѧ\u001b%?كަ'3"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`*o\n;v2\u000b", "", "<`\\2", "", "D`[BX", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@okq>", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "uK^8\\6\b0-\u000ezL;\n\r8gU\u000f\u0001<\u0012\u0013`Nk\u0017>@\u0013Df\u0002)9CY\u001f", "uK^8\\6\b0-\u000ezL;\n\r8gU\u000f\u0006F\u0005!`$\u0004\u001d<d4B]\u0007\"\r1\u0007", "6oP0^\u001aBh\u0019", "", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "BnBAe0GU", "\u0011n\\=T5B]\"", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Header {
    public final int hpackSize;
    public final ByteString name;
    public final ByteString value;
    public static final Companion Companion = new Companion(null);
    public static final ByteString PSEUDO_PREFIX = ByteString.Companion.encodeUtf8(Global.COLON);
    public static final String RESPONSE_STATUS_UTF8 = ":status";
    public static final ByteString RESPONSE_STATUS = ByteString.Companion.encodeUtf8(RESPONSE_STATUS_UTF8);
    public static final String TARGET_METHOD_UTF8 = ":method";
    public static final ByteString TARGET_METHOD = ByteString.Companion.encodeUtf8(TARGET_METHOD_UTF8);
    public static final String TARGET_PATH_UTF8 = ":path";
    public static final ByteString TARGET_PATH = ByteString.Companion.encodeUtf8(TARGET_PATH_UTF8);
    public static final String TARGET_SCHEME_UTF8 = ":scheme";
    public static final ByteString TARGET_SCHEME = ByteString.Companion.encodeUtf8(TARGET_SCHEME_UTF8);
    public static final String TARGET_AUTHORITY_UTF8 = ":authority";
    public static final ByteString TARGET_AUTHORITY = ByteString.Companion.encodeUtf8(TARGET_AUTHORITY_UTF8);

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005\"4\u0012\u0006\u0013nj?7JͣIDɟ\u0004*=j<9*[ҸuCIUj\f0\ngN\u0016i%N1ŗEǇ\n\u0016\u0001̓|Wc{u\u0012=4xs\u0016ݔOڱA9hҚ\u0007\u0011.6:8(\nWɤ|Н\u0014v\u0003ŏ\u001c\u001a 6XphTCQ[܍\u0014ĂB \tȦ-s\\=`l\f?\u0006ݑUݦFN/ڿ\u0001\u000b[\u0015^TU\u000f-etѰB˝9\u0015-مS\u0013`dW\u0003mv\u0014ݢ;Ҋ++Q֕(Df\n,\u0015YQCaI̮^ԇU`\u0014ʬ{[qVh\u000eV|Qԏ_ʀ\b\u000e\u000eΩ\u0019<;&~\b<5+v*ûRؿbB\bЭ2B%2\u00183Y>qƟ$ň?\u0019Vљߏ\t\u001b"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`*o\n;v2s7\b(Bi\u001f2WL\u0011", "", "u(E", "\u001eR4\"7\u00168>\u0006^[B\u001f", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", " DB\u001dB\u0015,3\u0013li:\u001blv", " DB\u001dB\u0015,3\u0013li:\u001blv)Un\tN", "", "\"@A\u00148\u001b8/\tm]H\u0019`w#", "\"@A\u00148\u001b8/\tm]H\u0019`w#_o\u0017\\\u0013", "\"@A\u00148\u001b8;xm]H\u000b", "\"@A\u00148\u001b8;xm]H\u000bvx\u001eFR", "\"@A\u00148\u001b8>tm]", "\"@A\u00148\u001b8>tm]X\u001cki\u0002", "\"@A\u00148\u001b8AvaZF\f", "\"@A\u00148\u001b8AvaZF\fvx\u001eFR", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(String name, String value) {
        this(ByteString.Companion.encodeUtf8(name), ByteString.Companion.encodeUtf8(value));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(ByteString name, String value) {
        this(name, ByteString.Companion.encodeUtf8(value));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
    }

    public Header(ByteString name, ByteString value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.name = name;
        this.value = value;
        this.hpackSize = name.size() + 32 + value.size();
    }

    public static /* synthetic */ Header copy$default(Header header, ByteString byteString, ByteString byteString2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            byteString = header.name;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            byteString2 = header.value;
        }
        return header.copy(byteString, byteString2);
    }

    public final ByteString component1() {
        return this.name;
    }

    public final ByteString component2() {
        return this.value;
    }

    public final Header copy(ByteString name, ByteString value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        return new Header(name, value);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        return Intrinsics.areEqual(this.name, header.name) && Intrinsics.areEqual(this.value, header.value);
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.value.hashCode();
    }

    public String toString() {
        return this.name.utf8() + ": " + this.value.utf8();
    }
}
