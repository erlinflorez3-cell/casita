package com.facebook.react.uimanager.style;

import com.facebook.react.uimanager.PixelUtil;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000eӵLш|\u0004O\u000b8\u000b4I\u0007\":\u001b\u007f\u0007ljA0RkP.XS2\u000fy\b<řaҜwYП\u0006\u001a,!If^mmnXZ#C=\u0007&~p,WW\u0011]@\u0010̓FoM6\u0016vK@xtd\u0006fތ#\u0001\u0001\u0013\t2*v\u0011=ڠD\u0014' 9Xphĥ=S\u000b\u001a \u0006V /\u001f\rmT6Vnu:]$IފA\u00178m:\u0015M;Q\u0005-\u001b\u0003y A?e4[ɃTK\u000e`hW\u0003m\u007f\u0004\u07b2go+9X\fWdݙH\u001b#;g\r\f\u0004lٯ\u0004\"o\u001a'CO\u0012Lח\u0012.\u007f\u07be\u0014\u000fB\b\u001c\u000bwW</2f6\u000f\u07baxx[óh\u0004dH\u000e\u007fˑ:)"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004nCh\u0012'77s8ZL;x!\u001a\u0014le\u000f", "", "6na6m6Gb\u0015\u0006", "", "DdaA\\*:Z", "uE5uI", "5dc\u0015b9Bh#\b\nZ3", "u(5", "5dc#X9MW\u0017z\u0002", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "Bn?6k,E4&\t\u0003=\u0010g", "BnBAe0GU", "", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class CornerRadii {
    private final float horizontal;
    private final float vertical;

    /* JADX WARN: Illegal instructions before constructor call */
    public CornerRadii() {
        float f2 = 0.0f;
        this(f2, f2, 3, null);
    }

    public CornerRadii(float f2, float f3) {
        this.horizontal = f2;
        this.vertical = f3;
    }

    public /* synthetic */ CornerRadii(float f2, float f3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i2) | ((-1) - 1)) != 0 ? 0.0f : f2, (-1) - (((-1) - i2) | ((-1) - 2)) != 0 ? 0.0f : f3);
    }

    public static /* synthetic */ CornerRadii copy$default(CornerRadii cornerRadii, float f2, float f3, int i2, Object obj) {
        if ((1 & i2) != 0) {
            f2 = cornerRadii.horizontal;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            f3 = cornerRadii.vertical;
        }
        return cornerRadii.copy(f2, f3);
    }

    public final float component1() {
        return this.horizontal;
    }

    public final float component2() {
        return this.vertical;
    }

    public final CornerRadii copy(float f2, float f3) {
        return new CornerRadii(f2, f3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CornerRadii)) {
            return false;
        }
        CornerRadii cornerRadii = (CornerRadii) obj;
        return Float.compare(this.horizontal, cornerRadii.horizontal) == 0 && Float.compare(this.vertical, cornerRadii.vertical) == 0;
    }

    public final float getHorizontal() {
        return this.horizontal;
    }

    public final float getVertical() {
        return this.vertical;
    }

    public int hashCode() {
        return (Float.hashCode(this.horizontal) * 31) + Float.hashCode(this.vertical);
    }

    public final CornerRadii toPixelFromDIP() {
        return new CornerRadii(PixelUtil.toPixelFromDIP(this.horizontal), PixelUtil.toPixelFromDIP(this.vertical));
    }

    public String toString() {
        return "CornerRadii(horizontal=" + this.horizontal + ", vertical=" + this.vertical + ")";
    }
}
