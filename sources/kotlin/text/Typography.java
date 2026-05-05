package kotlin.text;

import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.ReplaceWith;
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
@Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00156B\u0005M2 w\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00050i%\nCiWpԉt\u07beSNo˧?Vh\u000e[\u000f4\u0018O̚~֒Yxe܈_>PsW3{q\u0014ʧ3ҽ:\u0005(݅rD\b\n\u0019\u001aXJf͓MŲO\f\u001aؓ\u0011|HX%M3\u001chæ\u0011ŋ\u0005\u001edɡ\u001fBVsu:]%Y݊\u0015Ě+_8ŧ\u001e\u0019T\\?\r%ctѯ\u0013˝9\u0015-مS\u0013`dW\u0003ms\u0014ݢ;Ҋ++Q֕(Bf\n,\u0015YQcƥE͉`\u0005YӠ\\39Z{K~\u0010~ÂMԫ\u0011<\f\u05faV3V:E\u001a\u0015\ndޞGɤW@X\u061c/N\u000e\by6E'VĘ}ݰ\u001ffYĥ\f%\\E\u0014\u0005; yЮAĲ_T\u0016֫e'b\u0007i1\u007fB\u0014ʷ!̆]=uՎAn\u0010:\u001c0u\u0002\u0006Ɍcѧ\u001b%?ك\n//|\u001aHriMݚ3ĈWiZ̲\u00116|(O*7\u000e\u0011H;ʕ>ÏX^4Ҋ]\u001eZ\u001a\f\bc4j\fT!S\u0012\u0005S?ȑ=ܷa\u0010-Äv9_\u0004y\u000e(ElIMQ\u0012\u00128׳I݀C<jڳ)rPj$Z\u000b*xü\u001bн\u0014w\u0004ͩ\u001f\u0018!JWqJ6\u0003ւkÅ\u0019H\u000bٜ\u0013M\u000b\"wZ\u0017\u0012Uԥ\u0006ʗ\u0007i,ڏY\r^v\to\u0016z ؚO˃&-Iٛ\u0006%4p:hb~yțQ\u0381\u0004Goն\u0018Xz2\u000eU*\"l֤\fֺ3=\u001bÁO5@\u001fEEzt<ʿ ɟ+z\u0005Ȫ_GvL\u007f\b\u0019r\u0003ߓ=ߝST\u001fǱGj\u0001B d.{8ÆMĕgT\u0013ϵ\u000fU\u0001#q<|:SąqǪ)\u0001wܲMA;d?\u001dDyjٳg˸aiwЃJn\u001dH\re2.:ܥB͈U]:ծ\tUg\"V\"RnYܰ\u001bܖ{\bJކ\u0005\u0019AlYd\u001fX\u000fԎ]ɣ\u0002f\u000fԭ]|d\u0001R\u0013\u001e\u007f\u000bʤ2ͫwC\u0006ж/O37eS\u0016oDн/\u05c8N\u000f\u0012ΚLE|94=NX\u000ef_ݽX֯\u001c<Iݥr\u0007B124|P\u00164[T\u0018\bF~Vʓ2ʸ\u001b8JƽKX\u0014~\u0007\\'T\u0013\f]`O,WϚaʟ\"x=̍UyT\u0001Gc`\u0003*\u0000[ƨnO\u0007ܺu7R\u0002Q\u001bVZWՑ\u0018زGI\nԍTS7\u001c\u0004o::nԄoÐ\u001c\u001bAܱςc&"}, d2 = {"\u001aj^A_0G\u001d(~\u000emuk\u001d:o\u00025wK\u0004+l", "", "u(E", "/k\\<f;\u001e_)z\u0002", "", "/l_", "0t[9X;", "1d]A", "1n_Fe0@V(", "2`V4X9", "2dV?X,", "2n[9T9", "2nd/_,\u001dO\u001b\u0001zk", "2nd/_,)`\u001d\u0007z", "3k[6c:Ba", "3ta<", "5qT.g,K", "5qT.g,K=&^\u0007n(\u0004", "6`[3", ":dUA76NP ~fn6\f\t", ":dUA:<BZ ~\u0003^;", "5dc\u0019X-M5)\u0003\u0002e,\u0005\t>${1\u0005J\u0010\u0013&Ky\u0017J", ":dUA:<BZ ~\u0003^;|", "5dc\u0019X-M5)\u0003\u0002e,\u0005\t>e>$\u0005I\u000b&\u0013Vs\u0018E\u0005", ":dUAF0GU ~fn6\f\t", ":db@", ":db@B9\u001e_)z\u0002", ":nf\u0011b<;Z\u0019j\u000bh;|", ":nf \\5@Z\u0019j\u000bh;|", ";cP@[", ";hS1_,\u001d](", "<ab=", "<cP@[", "<nc\u0012d<:Z", ">`a.Z9:^\u001c", ">kd@@0Gc'", ">nd;W", ">qX:X", "?t^AX", "@dV6f;>`\u0019}", "@hV5g\u000bHc\u0016\u0006zJ<\u0007\u0018/", "@hV5g\u000eNW \u0006zf,\f", "5dc\u001f\\.Abz\u000f~e3|\u0011/t>$\u0005I\u000b&\u0013Vs\u0018E\u0005", "@hV5g\u000eNW \u0006zf,\f\t", "5dc\u001f\\.Abz\u000f~e3|\u0011/t\u007ffwI\n!&C~\u0012F\u007f3", "@hV5g\u001aB\\\u001b\u0006zJ<\u0007\u0018/", "AdRA\\6G", "Bh\\2f", "Bl", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class Typography {
    public static final Typography INSTANCE = new Typography();
    public static final char almostEqual = 8776;
    public static final char amp = '&';
    public static final char bullet = 8226;
    public static final char cent = 162;
    public static final char copyright = 169;

    /* JADX INFO: renamed from: dagger, reason: collision with root package name */
    public static final char f19840dagger = 8224;
    public static final char degree = 176;
    public static final char dollar = '$';
    public static final char doubleDagger = 8225;
    public static final char doublePrime = 8243;
    public static final char ellipsis = 8230;
    public static final char euro = 8364;
    public static final char greater = '>';
    public static final char greaterOrEqual = 8805;
    public static final char half = 189;
    public static final char leftDoubleQuote = 8220;
    public static final char leftGuillemet = 171;
    public static final char leftGuillemete = 171;
    public static final char leftSingleQuote = 8216;
    public static final char less = '<';
    public static final char lessOrEqual = 8804;
    public static final char lowDoubleQuote = 8222;
    public static final char lowSingleQuote = 8218;
    public static final char mdash = 8212;
    public static final char middleDot = 183;
    public static final char nbsp = 160;
    public static final char ndash = 8211;
    public static final char notEqual = 8800;
    public static final char paragraph = 182;
    public static final char plusMinus = 177;
    public static final char pound = 163;
    public static final char prime = 8242;
    public static final char quote = '\"';
    public static final char registered = 174;
    public static final char rightDoubleQuote = 8221;
    public static final char rightGuillemet = 187;
    public static final char rightGuillemete = 187;
    public static final char rightSingleQuote = 8217;
    public static final char section = 167;
    public static final char times = 215;
    public static final char tm = 8482;

    private Typography() {
    }

    public static /* synthetic */ void getLeftGuillemet$annotations() {
    }

    @Deprecated(message = "\u0017N\u0005H1w$ek[)\tdT4Oo\f\nf\u0019\u0002\u001ca6O|*b|)&vMqG\u001b\u001c]LK]??\u0018j3\u000f+dT@rCHQ\u0015U'X w8O", replaceWith = @ReplaceWith(expression = "Typography.leftGuillemet", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "", hiddenSince = "", warningSince = "\u000bcA")
    public static /* synthetic */ void getLeftGuillemete$annotations() {
    }

    public static /* synthetic */ void getRightGuillemet$annotations() {
    }

    @Deprecated(message = "\u0017N\u0005H1w$ek[)\tdT4Oo\f\nf\u0019\u0002\u001ca6O|*b|)&vMqG\u001b\u001c]LK]EC\u0019^``7aTGjK9&KP\"W/{5\u0006@", replaceWith = @ReplaceWith(expression = "Typography.rightGuillemet", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "", hiddenSince = "", warningSince = "\u000bcA")
    public static /* synthetic */ void getRightGuillemete$annotations() {
    }
}
