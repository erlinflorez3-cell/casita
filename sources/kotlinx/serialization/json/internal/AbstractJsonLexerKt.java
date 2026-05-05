package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d̉=!,s\bDJe|\u0004O\f8\u000b4E\u0007\":\u001e\u007f\u0007lkA0RhP.XgB\u001dy\u001dL$\n2\"GIw2}P\b\u0016Ȟ\u007fu|mr\u000bq\u000e6\u001a\u0007\rDI\u0004|$܈/>PģW3{n\u0014ʡ3ҽ:\u0005(݅BD\b\u0005\u0019\u001aXGf͍MŲO\f\u001aؓ`|HS%M3\u0019hà\u0011ŋ\u0005\u001edɡnBVnu:]\"Y݄\u0015Ě+_8ŧm\u0019TW?\r%etѫ\u0013˝9\u0015-م#\u0013``W\u0003mp\u0014ݜ;Ҋ++Q֕wBf\u0006,\u0015YNcƟE͉`\u0005YӠ,39V{K~\u0012~¾Mԫ\u0011<\f\u05fa&3V6E\u001a\u0015\u0007dޘGɤW@X\u061c~N\u000e\u0004y6E/VĒ}ݰ\u001ffYĥ[%\\B\u0014\u0005;\u001dyШAĲ_T\u0016֫5'b\u0004i1\u007f?\u0014ʱ!̆]=uՎ\u0011n\u00107\u001c0u\u000e\u0006Ɇcѧ\u001b%?كY//z\u001aHruMݔ3ĈWiZ̲`.|&O*7\u001a1զ7ʰoP\\АL\u001d[-l\u0007,\u0016i\u05ff/ʟ@!-īn[v{\u0003M\f\u0018{Å9Ơ]nsލwElFMQ\u0012\u001e8\u05edI݀C<jڳxrPg$Z\u000b6xö\u001bн\u0014w\u0004ͩn\u0018!GWqJB\u0003ռkÅ\u0019H\u000bٜbM\u000b\u001fwZ\u0017\u001eUԟ\u0006ʗ\u0007i,ڏ)\r^s\to\u0016\u0007 ؔO˃&-IٛU%4m:hb\u000byȕQ\u0381\u0004GoնgXz/\u000eU*.l֞\fֺ3=\u001bÁ\u001f5@\u001cEEzq<ʹ ɟ+z\u0005Ȫ/GvI\u007f\b\u0019z\u0003ߍ=ߝST\u001fǱ\u0017j\u0001? d.}8ÀMĕgT\u0013ϵ^U\u0001 q<|BSÿqǪ)\u0001wܲ\u001dA;a?\u001dD\u0002j٭g˸aiwЃ\u001an\u001dE\re26:ܟB͈U]:ծXUg\u001fV\"RvYܪ\u001bܖ{\bJކΒ\u0011W"}, d2 = {"\u0010D6\u0016A&%7\u0007m", "", "\u0010D6\u0016A&(0}", "\u0011N;\u001cA", "\u0011N<\u001a4", "\u0011S2,@\b1", "", "\u0013M3,?\u0010,B", "\u0013M3,B\t#", "\u0013R2~6&&/\f", "\u0017ME\u000e?\u0010\u001d", "\u001cT;\u0019", "", "!SA\u0016A\u000e", "!SA\u0016A\u000e83\u0007\\", "\"BN\u000f8\u000e\"<\u0013e^L\u001b", "", "\"BN\u000f8\u000e\"<\u0013hWC", "\"BN\u0010B\u0013(<", "\"BN\u0010B\u0014&/", "\"BN\u0012A\u000b8:|li", "\"BN\u0012A\u000b8=uc", "\"BN\u0012B\r", "\"BN\u0016A\u001d\u001a:|]", "\"BN\u001cG\u000f\u001e@", "\"BN G\u0019\"<z", "\"BN G\u0019\"<zxZL\n", "\"BN$;\u0010-3\u0007iV<\f", "#M8\u0010B\u000b\u001eMxlX", "/k[<j\u001aM`)|\nn9|\b\u0017a\u000b\u000e{T\u000fy\u001bP~", "/rR6\\\n:a\u0019fvl2", "1nT?V,\"\\$\u000f\nO(\u0004\u0019/sb,\u0005O", "7f]<e,.\\\u001f\b\u0005p5b\tCsb,\u0005O", ":d]6X5M6\u001d\b\n", "AoT0\\(E4 \t\rb5~y+l\u0010(\n#\u0005 &", "1gP?G6-]\u001f~\u0004<3x\u0017=", "1", "3rR.c,-]v\u0002vk", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u001c%Qx"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AbstractJsonLexerKt {
    public static final char BEGIN_LIST = '[';
    public static final char BEGIN_OBJ = '{';
    public static final char COLON = ':';
    public static final char COMMA = ',';
    private static final int CTC_MAX = 126;
    public static final char END_LIST = ']';
    public static final char END_OBJ = '}';
    private static final int ESC2C_MAX = 117;
    public static final char INVALID = 0;
    public static final String NULL = "null";
    public static final char STRING = '\"';
    public static final char STRING_ESC = '\\';
    public static final byte TC_BEGIN_LIST = 8;
    public static final byte TC_BEGIN_OBJ = 6;
    public static final byte TC_COLON = 5;
    public static final byte TC_COMMA = 4;
    public static final byte TC_END_LIST = 9;
    public static final byte TC_END_OBJ = 7;
    public static final byte TC_EOF = 10;
    public static final byte TC_INVALID = 127;
    public static final byte TC_OTHER = 0;
    public static final byte TC_STRING = 1;
    public static final byte TC_STRING_ESC = 2;
    public static final byte TC_WHITESPACE = 3;
    public static final char UNICODE_ESC = 'u';
    public static final String allowStructuredMapKeysHint = "Use 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.";
    public static final int asciiCaseMask = 32;
    public static final String coerceInputValuesHint = "Use 'coerceInputValues = true' in 'Json {}` builder to coerce nulls to default values.";
    public static final String ignoreUnknownKeysHint = "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.";
    public static final String lenientHint = "Use 'isLenient = true' in 'Json {}` builder to accept non-compliant JSON.";
    public static final String specialFlowingValuesHint = "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'";

    public static final byte charToTokenClass(char c2) {
        if (c2 < '~') {
            return CharMappings.CHAR_TO_TOKEN[c2];
        }
        return (byte) 0;
    }

    public static final char escapeToChar(int i2) {
        if (i2 < ESC2C_MAX) {
            return CharMappings.ESCAPE_2_CHAR[i2];
        }
        return (char) 0;
    }
}
