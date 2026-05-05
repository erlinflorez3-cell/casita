package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.modules.SerializersModule;
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
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\":\u001b\u007f\u0007lpA0RqP.Xf2\u000f\u0002{<$a/yCQU\"}(\u0012WN}gvJ`\u000bYƤ6\u0016'ilV[ތm\u0016\u001d2Zom4ޜs=Gb=A\u0013\\J\"f7KЏʀ.H\u00165K[Y\u000f*0nt\u0011Ĭ\u0019̂\t&\u001aßV\"\u0007#jmn8NskB\u007f;\u0011rZNUc\u0007ŮYϘJ`/˙\u000fc$5N=U\u0017+^\u0011\u000f#sM\u000fWqk\u0012?Ѯ3ȅM\u007f_̬p\u0002\u001a#9^-_x6j\u0016\"x\u001a9CO\u0012O'ʲ4Þ~\b\u0015ɝ\u001c\u0010\f:V4M\u001cl\u001c\u001c;E\u000baUh\u0002\rFVдmي\u001b1\bđC;!|_g[\u001bTN\n\r]@1\u0019\u0007!\nXDdS\u001f+ȵ]śUREʰ^\f_V{\u001e\td\bE\u00126g\u00025\u0018\u001f6g=ExQ#OoXҍPϼz\u0011håkkXfN(\u000f\u0018=I\u0017\u0014+\\r%\u0004P\u0003\\\u0003ґYɟX\u0013\u0006ܱ+\"b\u0018J'E\u0012Tpvq;qk,=1|6\b\u0012\"\u0012\u0016=5ڰAɄg\"i\u05ec\u0007\u0016E`p\u001fphHx\u001a\u0001|*(YV\u0013`\u0010\nmf\fA6\u0016ګ(ٜ0=!¢-J\tHPG\u001d\u000be\u0006v\u0018OvAP\u001biR\u0002?\u0005\u000f`Gיs֑M>\u0005ʠ2/G~C3>W(\u0017B\fC\t\u0005#\u000eX8dU|\u0005\u0016$\u0007R\u0094\"׀=]7ˋ+\u0011\u0005[@5MGR's\u0007\u001e*51\u0015y=??ֲsŰn|4ߌ\u0003LU\f%(\u0017`x[\u0016lP\u0012o\u007f\u0013G\u0012XaϼJϗv\u000faߢf:\u0003?-$E\u0003u]\u000b=ԯGf"}, d2 = {"\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006[3?bZ0;t\u0015.Z\u0019", "", "8r^;", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006[3?bS", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `L}\u0018E@\nCc\u0007uz^", "/k[<j\u001aIS\u0017\u0003ve\r\u0004\u0013+t\u00041}+\u000b\u001b V`\nC\u0007%C", "", "5dc\u000e_3He\u0007\nz\\0x\u0010\u0010l\n$\u000bD\n\u0019\u0002Qs\u0017Kg!<i}.", "u(I", "Adc\u000e_3He\u0007\nz\\0x\u0010\u0010l\n$\u000bD\n\u0019\u0002Qs\u0017Kg!<i}.", "uY\u0018#", "/k[<j\u001aM`)|\nn9|\b\u0017a\u000b\u000e{T\u000f", "5dc\u000e_3He\u0007\u000e\bn*\f\u0019<e~\u0010wKf\u0017+U", "Adc\u000e_3He\u0007\u000e\bn*\f\u0019<e~\u0010wKf\u0017+U", "1kP@f\u000bBa\u0017\f~f0\u0006\u0005>o\r", "", "5dc\u0010_(Law\u0003\t\\9\u0001\u00113n{7\u0006M", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u0010_(Law\u0003\t\\9\u0001\u00113n{7\u0006M", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "1nT?V,\"\\$\u000f\nO(\u0004\u0019/s", "5dc\u0010b,KQ\u0019b\u0004i<\fy+l\u0010(\n", "Adc\u0010b,KQ\u0019b\u0004i<\fy+l\u0010(\n", "3mR<W,\u001dS\u001az\u000be;\u000b", "5dc\u0012a*HR\u0019]z_(\r\u0010>s", "Adc\u0012a*HR\u0019]z_(\r\u0010>s", "3w_9\\*Bb\u0002\u000f\u0002e:", "5dc\u0012k7EW\u0017\u0003\nG<\u0004\u0010=${1\u0005J\u0010\u0013&Ky\u0017J", "u(E", "5dc\u0012k7EW\u0017\u0003\nG<\u0004\u0010=", "Adc\u0012k7EW\u0017\u0003\nG<\u0004\u0010=", "7f]<e,.\\\u001f\b\u0005p5b\tCs", "5dc\u0016Z5H`\u0019n\u0004d5\u0007\u001b8K\u007f<\n", "Adc\u0016Z5H`\u0019n\u0004d5\u0007\u001b8K\u007f<\n", "7r;2a0>\\(", "Adc\u0019X5BS\"\u000e", "<`\\6a.,b&z\n^.\u0011", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006[3?bf\u001c?q\u001f0;RHgC\u001e\u0017|7", "5dc\u001bT4B\\\u001bl\nk(\f\t1y>$\u0005I\u000b&\u0013Vs\u0018E\u0005", "5dc\u001bT4B\\\u001bl\nk(\f\t1y", "u(;8b;EW\"\u0012Dl,\n\r+l\u0004=wO\u0005! \u0011t\u001cF\u007fn\u001ag\b) i\u001e2VE)zA\u001a$hcM\\", "Adc\u001bT4B\\\u001bl\nk(\f\t1y", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `L}\u0018E@\nCc\u0007\t3u\u001a7O1Jx0-\u0015ju\u000fJT", ">qTAg@)`\u001d\b\n", "5dc\u001de,Mb-i\bb5\f", "Adc\u001de,Mb-i\bb5\f", ">qTAg@)`\u001d\b\nB5{\t8t", "5dc\u001de,Mb-i\bb5\fl8d\u007f1\u000b~|  Q~\nKz/>g", "5dc\u001de,Mb-i\bb5\fl8d\u007f1\u000b", "Adc\u001de,Mb-i\bb5\fl8d\u007f1\u000b", "Ada6T3Bh\u0019\f\tF6{\u00196e", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001fQn\u001eCv3~G}-;i\u001d2bCHy\u001c(\u0014xh9\\", "5dc X9BO \u0003\u0010^9\u000bp9d\u0010/{", "u(;8b;EW\"\u0012Dl,\n\r+l\u0004=wO\u0005! \u0011w\u0018;\u0007,5gG\u000e7z\u001a*TGPkA,|r`I\u000ec\u0002", "Adc X9BO \u0003\u0010^9\u000bp9d\u0010/{", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `Oy\rL}%C#k Dq\u00125QX;xB\u0006\u001fgq@\u00079o?", "CrT\u000e_;>`\"z\nb=|q+m\u007f6", "5dc\"f,\u001aZ(~\bg(\f\r@eh$\u0004@\u000f", "Adc\"f,\u001aZ(~\bg(\f\r@eh$\u0004@\u000f", "CrT\u000ee9:g\u0004\t\u0002r4\u0007\u0016:h\u00046\u0004", "5dc\"f,\u001a`&z\u000fI6\u0004\u001d7o\r3~D\u000f\u001f", "Adc\"f,\u001a`&z\u000fI6\u0004\u001d7o\r3~D\u000f\u001f", "0tX9W", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006[3?b[*@n\u001a0]P7z8(\u001e>", "0tX9WjD](\u0006~g?v\u0017/r\u0004$\u0003D\u0016\u0013&Ky\u00176{3?b", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u001c%Qx"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class JsonBuilder {
    private boolean allowSpecialFloatingPointValues;
    private boolean allowStructuredMapKeys;
    private String classDiscriminator;
    private boolean coerceInputValues;
    private boolean encodeDefaults;
    private boolean explicitNulls;
    private boolean ignoreUnknownKeys;
    private boolean isLenient;
    private JsonNamingStrategy namingStrategy;
    private boolean prettyPrint;
    private String prettyPrintIndent;
    private SerializersModule serializersModule;
    private boolean useAlternativeNames;
    private boolean useArrayPolymorphism;

    public JsonBuilder(Json json) {
        Intrinsics.checkNotNullParameter(json, "json");
        this.encodeDefaults = json.getConfiguration().getEncodeDefaults();
        this.explicitNulls = json.getConfiguration().getExplicitNulls();
        this.ignoreUnknownKeys = json.getConfiguration().getIgnoreUnknownKeys();
        this.isLenient = json.getConfiguration().isLenient();
        this.allowStructuredMapKeys = json.getConfiguration().getAllowStructuredMapKeys();
        this.prettyPrint = json.getConfiguration().getPrettyPrint();
        this.prettyPrintIndent = json.getConfiguration().getPrettyPrintIndent();
        this.coerceInputValues = json.getConfiguration().getCoerceInputValues();
        this.useArrayPolymorphism = json.getConfiguration().getUseArrayPolymorphism();
        this.classDiscriminator = json.getConfiguration().getClassDiscriminator();
        this.allowSpecialFloatingPointValues = json.getConfiguration().getAllowSpecialFloatingPointValues();
        this.useAlternativeNames = json.getConfiguration().getUseAlternativeNames();
        this.namingStrategy = json.getConfiguration().getNamingStrategy();
        this.serializersModule = json.getSerializersModule();
    }

    @ExperimentalSerializationApi
    public static /* synthetic */ void getExplicitNulls$annotations() {
    }

    @ExperimentalSerializationApi
    public static /* synthetic */ void getNamingStrategy$annotations() {
    }

    @ExperimentalSerializationApi
    public static /* synthetic */ void getPrettyPrintIndent$annotations() {
    }

    public final JsonConfiguration build$kotlinx_serialization_json() {
        if (this.useArrayPolymorphism && !Intrinsics.areEqual(this.classDiscriminator, "type")) {
            throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified".toString());
        }
        if (this.prettyPrint) {
            if (!Intrinsics.areEqual(this.prettyPrintIndent, "    ")) {
                String str = this.prettyPrintIndent;
                for (int i2 = 0; i2 < str.length(); i2++) {
                    char cCharAt = str.charAt(i2);
                    if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != '\r' && cCharAt != '\n') {
                        throw new IllegalArgumentException(("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had " + this.prettyPrintIndent).toString());
                    }
                }
            }
        } else if (!Intrinsics.areEqual(this.prettyPrintIndent, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used".toString());
        }
        return new JsonConfiguration(this.encodeDefaults, this.ignoreUnknownKeys, this.isLenient, this.allowStructuredMapKeys, this.prettyPrint, this.explicitNulls, this.prettyPrintIndent, this.coerceInputValues, this.useArrayPolymorphism, this.classDiscriminator, this.allowSpecialFloatingPointValues, this.useAlternativeNames, this.namingStrategy);
    }

    public final boolean getAllowSpecialFloatingPointValues() {
        return this.allowSpecialFloatingPointValues;
    }

    public final boolean getAllowStructuredMapKeys() {
        return this.allowStructuredMapKeys;
    }

    public final String getClassDiscriminator() {
        return this.classDiscriminator;
    }

    public final boolean getCoerceInputValues() {
        return this.coerceInputValues;
    }

    public final boolean getEncodeDefaults() {
        return this.encodeDefaults;
    }

    public final boolean getExplicitNulls() {
        return this.explicitNulls;
    }

    public final boolean getIgnoreUnknownKeys() {
        return this.ignoreUnknownKeys;
    }

    public final JsonNamingStrategy getNamingStrategy() {
        return this.namingStrategy;
    }

    public final boolean getPrettyPrint() {
        return this.prettyPrint;
    }

    public final String getPrettyPrintIndent() {
        return this.prettyPrintIndent;
    }

    public final SerializersModule getSerializersModule() {
        return this.serializersModule;
    }

    public final boolean getUseAlternativeNames() {
        return this.useAlternativeNames;
    }

    public final boolean getUseArrayPolymorphism() {
        return this.useArrayPolymorphism;
    }

    public final boolean isLenient() {
        return this.isLenient;
    }

    public final void setAllowSpecialFloatingPointValues(boolean z2) {
        this.allowSpecialFloatingPointValues = z2;
    }

    public final void setAllowStructuredMapKeys(boolean z2) {
        this.allowStructuredMapKeys = z2;
    }

    public final void setClassDiscriminator(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.classDiscriminator = str;
    }

    public final void setCoerceInputValues(boolean z2) {
        this.coerceInputValues = z2;
    }

    public final void setEncodeDefaults(boolean z2) {
        this.encodeDefaults = z2;
    }

    public final void setExplicitNulls(boolean z2) {
        this.explicitNulls = z2;
    }

    public final void setIgnoreUnknownKeys(boolean z2) {
        this.ignoreUnknownKeys = z2;
    }

    public final void setLenient(boolean z2) {
        this.isLenient = z2;
    }

    public final void setNamingStrategy(JsonNamingStrategy jsonNamingStrategy) {
        this.namingStrategy = jsonNamingStrategy;
    }

    public final void setPrettyPrint(boolean z2) {
        this.prettyPrint = z2;
    }

    public final void setPrettyPrintIndent(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.prettyPrintIndent = str;
    }

    public final void setSerializersModule(SerializersModule serializersModule) {
        Intrinsics.checkNotNullParameter(serializersModule, "<set-?>");
        this.serializersModule = serializersModule;
    }

    public final void setUseAlternativeNames(boolean z2) {
        this.useAlternativeNames = z2;
    }

    public final void setUseArrayPolymorphism(boolean z2) {
        this.useArrayPolymorphism = z2;
    }
}
