package androidx.compose.foundation.layout;

import kotlin.Metadata;
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
/* JADX INFO: compiled from: FlowLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004O\u000b8\u000b4G\u0007\":\u001b\u007f\u0007ljA0RkP\u008cZS8\u001bsڔ:Śa:ڎs;\u0004\u0019>-\u0019S\\g\u007fnx[ŲG\u000f\u0014\u0018Aq:Omx\f\u0013U̷C8PAT\b=gś%<\u000b @\"Py3\u0002`ޙGX\b\tKc\f@9pvH\\%O\u001b\u0019@\u0005\u0005ſ\u0002fcuYNH\u001bi\u0001ș\"KpP[?_^\u000b\u0014ЌE%?\u001bvy\u001eYA\u000eߕ!ȏW\u000f\u000fѸsA\tB\u007fA%j-,9K־[E"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7v5WU\"gH(%w@5\u0016_\u0002", "", "4h[969Ha'Z\u000eb:]\u0016+c\u000f,\u0006I", "", "uE\u0018#", "5dc\u0013\\3E1&\t\tl\b\u0010\r=F\r$yO\u0005! ", "u(5", "Adc\u0013\\3E1&\t\tl\b\u0010\r=F\r$yO\u0005! ", "1n\\=b5>\\(J", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class FlowLayoutData {
    public static final int $stable = 8;
    private float fillCrossAxisFraction;

    public static /* synthetic */ FlowLayoutData copy$default(FlowLayoutData flowLayoutData, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = flowLayoutData.fillCrossAxisFraction;
        }
        return flowLayoutData.copy(f2);
    }

    public final float component1() {
        return this.fillCrossAxisFraction;
    }

    public final FlowLayoutData copy(float f2) {
        return new FlowLayoutData(f2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FlowLayoutData) && Float.compare(this.fillCrossAxisFraction, ((FlowLayoutData) obj).fillCrossAxisFraction) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.fillCrossAxisFraction);
    }

    public String toString() {
        return "FlowLayoutData(fillCrossAxisFraction=" + this.fillCrossAxisFraction + ')';
    }

    public FlowLayoutData(float f2) {
        this.fillCrossAxisFraction = f2;
    }

    public final float getFillCrossAxisFraction() {
        return this.fillCrossAxisFraction;
    }

    public final void setFillCrossAxisFraction(float f2) {
        this.fillCrossAxisFraction = f2;
    }
}
