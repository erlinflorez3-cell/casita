package androidx.compose.foundation.layout;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: RowColumnImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLш|\u0004O\u000b8é6B\r+4ߚ\u007f\u0007|jAӄLe^.ZS0&s{B*cҕyCIa\"Ԃ(ޜUdʴ\u0018nxYKr\u001f\f\u001cxx,aU'^\"\u00158B}AKM\u001e@Ihz6\u0013$J$Nx3\u0006*2N\u0010\u0005\u0001[M\"\u0011^G¤>R\u001bUM! \u001fV /\u001f#ʨO~OzwR/Q\u00060ŰOoh>\u0018e\u000f\\SU\u0012=Ҵ\u001fsIEQ-'i\u00025Y\"ϱ\u0004\b%K\"\u0001'UǢyy]6f\u007f,\u0015YP=cx&j\u0007i`:*[WiK^\u0012@y\u0011z;A4\u0016\f'V4E\u001c|\u0007<:;ʈR\ta\u0010|Z\u007f)df\u001d3\u001fK-O\u001a\u0015P(\u07b9\u001a\u0017>\n%%\u001eQ\"5ŦZ\u001d\u0015n73T&twӜ?\u000eb\\\u000eq?\u0004\u0003\u001fgXÖ\u0010ΥK\f7Ʌ)0\u001d.EeY%'v\u0010T\u0015\u007f\u0005\u0007xh\u0002l)̹Ḻr\"?ѧ!\u000e`Qr\u0013\fRZg:!\u001e6b\r\u0016\n)\u001f\u000b~\u0013Ơ1ŎR[pȉ\u0003Oc\u001b3A\u00079_\u0002y\"(Ql3MQ\u0012\u00118׳\u0003݀CHjڳphHh\u001ap|*(IV\u0003ށ{ "}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u00038_!ErD&\u001eS]F\u0007l;-r6C\"", "", "EdX4[;", "", "4h[9", "", "1q^@f\bQW'Z\u0002b.\u0006\u0011/n\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7s;WQIGG\"#Dh=\tl4N\u007f6\u001d", "4k^D?(R])\u000eYZ;x", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7v5WU\"gH(%w@5\u0016_\u0002", "uEI\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0002!'Pn\nKz/>#\u0005\u001cKw&=\u0017!HuB,p{eGbj0P\u007f/GU]\u0002CN{<!\u001c^\rat\u000b\u000faL.|D\u0001 \u0012<R\u00017w\u0005\u0016\u001fW<f\u0005Lf\u001f\u0011Z\u001c\u007fS\u0010dZco\t&=T^\u007f(|", "5dc\u0010e6Lat\u0012~l\b\u0004\r1n\b(\u0005O", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y4A}%w+PEyBy(lo\u0015\u000eg.W~'P[$", "Adc\u0010e6Lat\u0012~l\b\u0004\r1n\b(\u0005O", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u0012*G|_\fZMIy\u00101\u0019v=@\u000be5Vv0V\"\u0012\u001d", "5dc\u0013\\3E", "u(I", "Adc\u0013\\3E", "uY\u0018#", "5dc\u0013_6P:\u0015\u0013\u0005n;[\u0005>a", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y4A}%w.JE}\u001b\u001a)rqHe_;JL", "Adc\u0013_6P:\u0015\u0013\u0005n;[\u0005>a", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u0012*G|_\u000fTMMR02\u001fxp\u0018\u0003r($:\u0018", "5dc$X0@V(", "u(5", "Adc$X0@V(", "uE\u0018#", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n_F", "3pd._:", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class RowColumnParentData {
    public static final int $stable = 8;
    private CrossAxisAlignment crossAxisAlignment;
    private boolean fill;
    private FlowLayoutData flowLayoutData;
    private float weight;

    public RowColumnParentData() {
        this(0.0f, false, null, null, 15, null);
    }

    public static /* synthetic */ RowColumnParentData copy$default(RowColumnParentData rowColumnParentData, float f2, boolean z2, CrossAxisAlignment crossAxisAlignment, FlowLayoutData flowLayoutData, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            f2 = rowColumnParentData.weight;
        }
        if ((i2 + 2) - (2 | i2) != 0) {
            z2 = rowColumnParentData.fill;
        }
        if ((4 & i2) != 0) {
            crossAxisAlignment = rowColumnParentData.crossAxisAlignment;
        }
        if ((i2 & 8) != 0) {
            flowLayoutData = rowColumnParentData.flowLayoutData;
        }
        return rowColumnParentData.copy(f2, z2, crossAxisAlignment, flowLayoutData);
    }

    public final float component1() {
        return this.weight;
    }

    public final boolean component2() {
        return this.fill;
    }

    public final CrossAxisAlignment component3() {
        return this.crossAxisAlignment;
    }

    public final FlowLayoutData component4() {
        return this.flowLayoutData;
    }

    public final RowColumnParentData copy(float f2, boolean z2, CrossAxisAlignment crossAxisAlignment, FlowLayoutData flowLayoutData) {
        return new RowColumnParentData(f2, z2, crossAxisAlignment, flowLayoutData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RowColumnParentData)) {
            return false;
        }
        RowColumnParentData rowColumnParentData = (RowColumnParentData) obj;
        return Float.compare(this.weight, rowColumnParentData.weight) == 0 && this.fill == rowColumnParentData.fill && Intrinsics.areEqual(this.crossAxisAlignment, rowColumnParentData.crossAxisAlignment) && Intrinsics.areEqual(this.flowLayoutData, rowColumnParentData.flowLayoutData);
    }

    public int hashCode() {
        int iHashCode = ((Float.hashCode(this.weight) * 31) + Boolean.hashCode(this.fill)) * 31;
        CrossAxisAlignment crossAxisAlignment = this.crossAxisAlignment;
        int iHashCode2 = (iHashCode + (crossAxisAlignment == null ? 0 : crossAxisAlignment.hashCode())) * 31;
        FlowLayoutData flowLayoutData = this.flowLayoutData;
        return iHashCode2 + (flowLayoutData != null ? flowLayoutData.hashCode() : 0);
    }

    public String toString() {
        return "RowColumnParentData(weight=" + this.weight + ", fill=" + this.fill + ", crossAxisAlignment=" + this.crossAxisAlignment + ", flowLayoutData=" + this.flowLayoutData + ')';
    }

    public RowColumnParentData(float f2, boolean z2, CrossAxisAlignment crossAxisAlignment, FlowLayoutData flowLayoutData) {
        this.weight = f2;
        this.fill = z2;
        this.crossAxisAlignment = crossAxisAlignment;
        this.flowLayoutData = flowLayoutData;
    }

    public /* synthetic */ RowColumnParentData(float f2, boolean z2, CrossAxisAlignment crossAxisAlignment, FlowLayoutData flowLayoutData, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 + 1) - (1 | i2) != 0 ? 0.0f : f2, (i2 + 2) - (2 | i2) != 0 ? true : z2, (4 & i2) != 0 ? null : crossAxisAlignment, (i2 + 8) - (i2 | 8) != 0 ? null : flowLayoutData);
    }

    public final float getWeight() {
        return this.weight;
    }

    public final void setWeight(float f2) {
        this.weight = f2;
    }

    public final boolean getFill() {
        return this.fill;
    }

    public final void setFill(boolean z2) {
        this.fill = z2;
    }

    public final CrossAxisAlignment getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    public final void setCrossAxisAlignment(CrossAxisAlignment crossAxisAlignment) {
        this.crossAxisAlignment = crossAxisAlignment;
    }

    public final FlowLayoutData getFlowLayoutData() {
        return this.flowLayoutData;
    }

    public final void setFlowLayoutData(FlowLayoutData flowLayoutData) {
        this.flowLayoutData = flowLayoutData;
    }
}
