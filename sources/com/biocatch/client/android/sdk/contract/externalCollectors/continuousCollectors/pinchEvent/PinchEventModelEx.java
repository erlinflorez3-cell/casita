package com.biocatch.client.android.sdk.contract.externalCollectors.continuousCollectors.pinchEvent;

import kotlin.Metadata;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004O\u000b8\u000b4L\u0007\":\u001b\u007f\u0007ljA0RkP\u008cZS8\u001bsڔ:Ša:ڎs;\u0004\u0019>=\u0019S\\g\u007fnx[\u001bG\u001d\b.x\u0019-YY\u0007`*\u000f`CņC3[s\u0006@n}N\u0005N3hهzM\b(4`\u0010%{\nƾ\rZ7N{RR;NK\u074c\u0013Nc.\r6\\\u0016ޮfNr]H/;\u0003\u0018C~-e0\u000bO%F\u0003(=|g\u001e9CO5C&\u001aϏ\u0006\u001blM\u0010Wqk\u0013\u0019-5:aum5\u0007~Zǚ,\u0018\u0014k\u0003>\\3b'ц&sVq]h\u000eV\u000bA՟\f\r\u0013\u001c\t?H\\.բj\u000e\u0016ޗ\rtYE^\b/Q\u000ezy6E&ő71Aӕ~SgB'T\b\u000b\u0013\u000f6#/oĲ_Z\u0016֫-\u001dZ\u007f_7ҮDQ"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ541$hnB\u0003j\nX}.GJ]6i`<;\u001e\u001bi\u0012W;\u0017\u0015g\u001f.uK7\u001d\u00176V\u0010\u0005s\u0005\u0015\u0014\u0011\u0015{pKeY2}\u001esD\tyFbnaQ@Ei\nwa", "", "F", "", "G", "AbP9X", "uE5\u0013\u001c\u001d", "5dc V(ES", "u(5", "5dc%", "5dc&", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class PinchEventModelEx {
    private final float scale;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final float f2626x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final float f2627y;

    public PinchEventModelEx(float f2, float f3, float f4) {
        this.f2626x = f2;
        this.f2627y = f3;
        this.scale = f4;
    }

    public static /* synthetic */ PinchEventModelEx copy$default(PinchEventModelEx pinchEventModelEx, float f2, float f3, float f4, int i2, Object obj) {
        if ((1 & i2) != 0) {
            f2 = pinchEventModelEx.f2626x;
        }
        if ((2 & i2) != 0) {
            f3 = pinchEventModelEx.f2627y;
        }
        if ((i2 & 4) != 0) {
            f4 = pinchEventModelEx.scale;
        }
        return pinchEventModelEx.copy(f2, f3, f4);
    }

    public final float component1() {
        return this.f2626x;
    }

    public final float component2() {
        return this.f2627y;
    }

    public final float component3() {
        return this.scale;
    }

    public final PinchEventModelEx copy(float f2, float f3, float f4) {
        return new PinchEventModelEx(f2, f3, f4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PinchEventModelEx)) {
            return false;
        }
        PinchEventModelEx pinchEventModelEx = (PinchEventModelEx) obj;
        return Intrinsics.areEqual((Object) Float.valueOf(this.f2626x), (Object) Float.valueOf(pinchEventModelEx.f2626x)) && Intrinsics.areEqual((Object) Float.valueOf(this.f2627y), (Object) Float.valueOf(pinchEventModelEx.f2627y)) && Intrinsics.areEqual((Object) Float.valueOf(this.scale), (Object) Float.valueOf(pinchEventModelEx.scale));
    }

    public final float getScale() {
        return this.scale;
    }

    public final float getX() {
        return this.f2626x;
    }

    public final float getY() {
        return this.f2627y;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f2626x) * 31) + Float.hashCode(this.f2627y)) * 31) + Float.hashCode(this.scale);
    }

    public String toString() {
        return "PinchEventModelEx(x=" + this.f2626x + ", y=" + this.f2627y + ", scale=" + this.scale + ')';
    }
}
