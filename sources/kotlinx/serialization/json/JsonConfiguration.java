package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
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
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004O\u000f8\u000b4F\u0007\":\u001e\u007f\u0007lnA0ZeP.Xg@ş\u001c{b#\u001cҡpIПe \u0004\"\u0017Ofg\u0016oZ`\u0011C\u001d\b.x\u0019-Y[~] \u0012JB\u001e@CSu=Gd\r63!B(>y\u0013\u00062*v\u0011\u0007\u0001IK\u001a\u0018H@\u001f;b\u0013S\u0005(\u0019\u001e>N\t.bmNDQ\u0005]h03\toB\\1w0+N\u001dLZ'\u001b\u0002y\u001eYHG;\u001b%a\u000f\u001fR\n@\u0013Ew=\u0013u?'YJ\u0004_<X\u000e\"--e\f\f\u0002͉`\u0005_pT-9s{K~\u0016n\fK\u000b\u001bH\u001c\u000e4(ρ23\"Ǒ \u00109\u0006\u0001e\u0011_\u0010bZ\u007f)bي\u001b+\bđC;!y_s\f(\\B\u0014\u0005;&ţ\u0005t)żl\u0010f))iH`?ZX=vŎ]CuՎ\td\b@\u0012B\u0018\u000f={).E&ھ_?+ܩ\u0004\u0004N[u\tUzvY\u0002RvAXrlջ,Á\u0010fLߟ\u0015mVlfE)O\"n\u0015\u0010X\".^\u0010<O&ŎRUpȉ\u0003Oc%3A7Fgq\u0004\u000e\u0006:ӷ7;Yү(cXy\"Q\r~\u0013f~Di\u000b\tk^&\tʓlݻ{\bL\u0088\u001c\u00158[\u007f5L.76j3\u0019\u0012,GY|7`˖l\u0016\u0007ԞK&\t\t2\u0007Y\u001b^c\to\u0016\u0001\u007f0Sʨ$έE]=ӧ6W(\tB\u0016;\t\u0005\u0015\u000e\\8[UY\u0005\u0016$Vދ$\u001c\"ߙi1C5\u001d\u0011yA\u00107]L!f˛Q\u0018/ϕ\u0015{\u0015^v@Կ\f\u0010"}, d2 = {"\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006[3?b[*@n\u001a0]P7z8(\u001e>", "", "3mR<W,\u001dS\u001az\u000be;\u000b", "", "7f]<e,.\\\u001f\b\u0005p5b\tCs", "7r;2a0>\\(", "/k[<j\u001aM`)|\nn9|\b\u0017a\u000b\u000e{T\u000f", ">qTAg@)`\u001d\b\n", "3w_9\\*Bb\u0002\u000f\u0002e:", ">qTAg@)`\u001d\b\nB5{\t8t", "", "1nT?V,\"\\$\u000f\nO(\u0004\u0019/s", "CrT\u000ee9:g\u0004\t\u0002r4\u0007\u0016:h\u00046\u0004", "1kP@f\u000bBa\u0017\f~f0\u0006\u0005>o\r", "/k[<j\u001aIS\u0017\u0003ve\r\u0004\u0013+t\u00041}+\u000b\u001b V`\nC\u0007%C", "CrT\u000e_;>`\"z\nb=|q+m\u007f6", "<`\\6a.,b&z\n^.\u0011", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006[3?bf\u001c?q\u001f0;RHgC\u001e\u0017|7", "uYI'M!3:\u001ez\fZu\u0004\u00058gI\u0016\u000bM\u0005 \u0019\u001dd\u0003#{!FUG'3v\u0018w;RHo= j]V \rm;Uz0Z\u0016\\,iVnD\u0018'V\u001dR5\u0016N^O.w\u000e\u001c-\u001252}Cl\n\u000e\u0004\u001dBf\u007fBX$\u001d=\u0006", "5dc\u000e_3He\u0007\nz\\0x\u0010\u0010l\n$\u000bD\n\u0019\u0002Qs\u0017Kg!<i}.", "u(I", "5dc\u000e_3He\u0007\u000e\bn*\f\u0019<e~\u0010wKf\u0017+U", "5dc\u0010_(Law\u0003\t\\9\u0001\u00113n{7\u0006M", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u0010b,KQ\u0019b\u0004i<\fy+l\u0010(\n", "5dc\u0012a*HR\u0019]z_(\r\u0010>s", "5dc\u0012k7EW\u0017\u0003\nG<\u0004\u0010=${1\u0005J\u0010\u0013&Ky\u0017J", "u(E", "5dc\u0012k7EW\u0017\u0003\nG<\u0004\u0010=", "5dc\u0016Z5H`\u0019n\u0004d5\u0007\u001b8K\u007f<\n", "5dc\u001bT4B\\\u001bl\nk(\f\t1y>$\u0005I\u000b&\u0013Vs\u0018E\u0005", "5dc\u001bT4B\\\u001bl\nk(\f\t1y", "u(;8b;EW\"\u0012Dl,\n\r+l\u0004=wO\u0005! \u0011t\u001cF\u007fn\u001ag\b) i\u001e2VE)zA\u001a$hcM\\", "5dc\u001de,Mb-i\bb5\f", "5dc\u001de,Mb-i\bb5\fl8d\u007f1\u000b~|  Q~\nKz/>g", "5dc\u001de,Mb-i\bb5\fl8d\u007f1\u000b", "5dc\"f,\u001aZ(~\bg(\f\r@eh$\u0004@\u000f", "5dc\"f,\u001a`&z\u000fI6\u0004\u001d7o\r3~D\u000f\u001f", "BnBAe0GU", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u001c%Qx"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class JsonConfiguration {
    private final boolean allowSpecialFloatingPointValues;
    private final boolean allowStructuredMapKeys;
    private final String classDiscriminator;
    private final boolean coerceInputValues;
    private final boolean encodeDefaults;
    private final boolean explicitNulls;
    private final boolean ignoreUnknownKeys;
    private final boolean isLenient;
    private final JsonNamingStrategy namingStrategy;
    private final boolean prettyPrint;
    private final String prettyPrintIndent;
    private final boolean useAlternativeNames;
    private final boolean useArrayPolymorphism;

    public JsonConfiguration() {
        this(false, false, false, false, false, false, null, false, false, null, false, false, null, 8191, null);
    }

    public JsonConfiguration(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String prettyPrintIndent, boolean z8, boolean z9, String classDiscriminator, boolean z10, boolean z11, JsonNamingStrategy jsonNamingStrategy) {
        Intrinsics.checkNotNullParameter(prettyPrintIndent, "prettyPrintIndent");
        Intrinsics.checkNotNullParameter(classDiscriminator, "classDiscriminator");
        this.encodeDefaults = z2;
        this.ignoreUnknownKeys = z3;
        this.isLenient = z4;
        this.allowStructuredMapKeys = z5;
        this.prettyPrint = z6;
        this.explicitNulls = z7;
        this.prettyPrintIndent = prettyPrintIndent;
        this.coerceInputValues = z8;
        this.useArrayPolymorphism = z9;
        this.classDiscriminator = classDiscriminator;
        this.allowSpecialFloatingPointValues = z10;
        this.useAlternativeNames = z11;
        this.namingStrategy = jsonNamingStrategy;
    }

    public /* synthetic */ JsonConfiguration(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str, boolean z8, boolean z9, String str2, boolean z10, boolean z11, JsonNamingStrategy jsonNamingStrategy, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 + 1) - (i2 | 1) != 0 ? false : z2, (i2 & 2) != 0 ? false : z3, (i2 & 4) != 0 ? false : z4, (i2 + 8) - (i2 | 8) != 0 ? false : z5, (-1) - (((-1) - i2) | ((-1) - 16)) != 0 ? false : z6, (i2 & 32) != 0 ? true : z7, (i2 & 64) != 0 ? "    " : str, (i2 + 128) - (i2 | 128) != 0 ? false : z8, (i2 & 256) != 0 ? false : z9, (-1) - (((-1) - i2) | ((-1) - 512)) != 0 ? "type" : str2, (i2 & 1024) == 0 ? z10 : false, (-1) - (((-1) - i2) | ((-1) - 2048)) == 0 ? z11 : true, (i2 + 4096) - (i2 | 4096) != 0 ? null : jsonNamingStrategy);
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

    public final boolean getUseAlternativeNames() {
        return this.useAlternativeNames;
    }

    public final boolean getUseArrayPolymorphism() {
        return this.useArrayPolymorphism;
    }

    public final boolean isLenient() {
        return this.isLenient;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("JsonConfiguration(encodeDefaults=");
        sb.append(this.encodeDefaults).append(", ignoreUnknownKeys=").append(this.ignoreUnknownKeys).append(", isLenient=").append(this.isLenient).append(", allowStructuredMapKeys=").append(this.allowStructuredMapKeys).append(", prettyPrint=").append(this.prettyPrint).append(", explicitNulls=").append(this.explicitNulls).append(", prettyPrintIndent='").append(this.prettyPrintIndent).append("', coerceInputValues=").append(this.coerceInputValues).append(", useArrayPolymorphism=").append(this.useArrayPolymorphism).append(", classDiscriminator='").append(this.classDiscriminator).append("', allowSpecialFloatingPointValues=").append(this.allowSpecialFloatingPointValues).append(", useAlternativeNames=");
        sb.append(this.useAlternativeNames).append(", namingStrategy=").append(this.namingStrategy).append(')');
        return sb.toString();
    }
}
