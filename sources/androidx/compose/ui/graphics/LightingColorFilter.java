package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: ColorFilter.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4C\u0007\"B\u0012\u007f\u0007|jA0JiP.`\\2şs{BřcҕyCI[\"Ԃ*\t]Zo˧tOpŏs\u000f4\u00159\u007f2]e|k\u0012'2ppO7[qU9\u000fuȥ\t @%x\u001b\u000bЏ*.V\u0010\u000fzqL\u001c\u0016>B\t:\u0001\u000e]\r(\u0016\u001eBN\u0006\u0007\\FTɇLlkAw4\u0011uZNUl`\u0003[\u001b^V=\f%pdѿ@\u007f;#5k\u00035c\"SKE\u007fO\u001dhU:q]DnDZ\u0018\u0014C,Ͷ\fƞů%[ԇUh\u0014'9Y{MV\u00166\u0001K\u0013\u001b<\u001c\u000e4(З-Ʀָe\u0007ԧ7|zSNZ\u001a`H\u000b\tjت\u0017.\b61ݯ7\u0015Pi;\u001fm҂\u007f\u0019"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u001c]\u007f#Fq\u001f0+MBuA~\u0019op9\u00149", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DN\u001a5\\CHA", ";t[A\\7Eg", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "/cS", "uI9\u0019^6MZ\u001d\bDc=\u0005R3n\u000f(\tI|\u001e`&o\u000f8\u0007,D7\b)E|#>KREx\u001c\u001a\"naF\\'\u001d", "<`c6i,\u001c] \t\b?0\u0004\u0018/r", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0006\u0006G\u000b$wKv\u001d<\u0004z", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u001eU\r$Hms8TMHL8%$hn\u000f", "uI9\u0019T5=`#\u0003y(.\n\u0005:h\u0004&\n\n^!\u001eQ|n@}45fS\u0007=w%5QL\u0005pE&^ljH\u0007p5J}p&LO(lY\u0002\u001b\u001e\u001bh\u001d[;\u000b\u0014cN\fjQ=\u001f\u0015\u0002\rr", "5dc\u000eW+\u0006\u001e\u0018PtD1l", "u(9", "\u0018", "5dc\u001ah3MW$\u0006\u000f&v{Z)K\u0005\u0018", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LightingColorFilter extends ColorFilter {
    private final long add;
    private final long multiply;

    public /* synthetic */ LightingColorFilter(long j2, long j3, android.graphics.ColorFilter colorFilter, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, colorFilter);
    }

    public /* synthetic */ LightingColorFilter(long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3);
    }

    /* JADX INFO: renamed from: getMultiply-0d7_KjU */
    public final long m4406getMultiply0d7_KjU() {
        return this.multiply;
    }

    /* JADX INFO: renamed from: getAdd-0d7_KjU */
    public final long m4405getAdd0d7_KjU() {
        return this.add;
    }

    private LightingColorFilter(long j2, long j3, android.graphics.ColorFilter colorFilter) {
        super(colorFilter);
        this.multiply = j2;
        this.add = j3;
    }

    private LightingColorFilter(long j2, long j3) {
        this(j2, j3, AndroidColorFilter_androidKt.m4043actualLightingColorFilterOWjLjI(j2, j3), null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LightingColorFilter)) {
            return false;
        }
        LightingColorFilter lightingColorFilter = (LightingColorFilter) obj;
        return Color.m4179equalsimpl0(this.multiply, lightingColorFilter.multiply) && Color.m4179equalsimpl0(this.add, lightingColorFilter.add);
    }

    public int hashCode() {
        return (Color.m4185hashCodeimpl(this.multiply) * 31) + Color.m4185hashCodeimpl(this.add);
    }

    public String toString() {
        return "LightingColorFilter(multiply=" + ((Object) Color.m4186toStringimpl(this.multiply)) + ", add=" + ((Object) Color.m4186toStringimpl(this.add)) + ')';
    }
}
