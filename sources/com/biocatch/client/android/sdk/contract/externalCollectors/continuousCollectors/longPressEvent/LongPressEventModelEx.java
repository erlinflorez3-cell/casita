package com.biocatch.client.android.sdk.contract.externalCollectors.continuousCollectors.longPressEvent;

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
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004O\u000b8\u000b4I\u0007\":\u001b\u007f\u0007ljA0RkP\u008cZS8\u001bsڔ:Ša:ڎs;\u0004\u0019>5\u0019S\\g\u007fnx[\u001bG\u001d\b.x\u0019-֒Yxk\u0015W9PvW3{p\u0004˧a==\u0013(J\"fzKі\u001brc\u001e\u007f\u0013CyÈB6FpHR%M3\u001bB\fD \u000f tg|7\u000fȔ\\\u0003@1\r\u0002B|2\u00106\u000bY%Hj&;u(Գ,\t>C\"=S1\u0015\u0019Đ>KF\u007fL\u001dhU7qʵr(Ef\u007f,\u0015YPոax.ؘ\u001dSf\u001050 rYR&(&{ԫ\u0011B\f\u05fa\u001e)N4;\u001fǺ\f\u001f"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ541$hnB\u0003j\nX}.GJ]6i`<;\u001e\u001bi\u0012W;\u0017\u0015g\u001f.uK7\u001d\u00176V\u0010\u0005o\u000b\u0015\u0018xBj~P6!G\u0003$?(3qHDlyUO%s*m\u001bG'[:A\u0004'G", "", "F", "", "G", "uE5uI", "5dc%", "u(5", "5dc&", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class LongPressEventModelEx {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final float f2624x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final float f2625y;

    public LongPressEventModelEx(float f2, float f3) {
        this.f2624x = f2;
        this.f2625y = f3;
    }

    public static /* synthetic */ LongPressEventModelEx copy$default(LongPressEventModelEx longPressEventModelEx, float f2, float f3, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            f2 = longPressEventModelEx.f2624x;
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            f3 = longPressEventModelEx.f2625y;
        }
        return longPressEventModelEx.copy(f2, f3);
    }

    public final float component1() {
        return this.f2624x;
    }

    public final float component2() {
        return this.f2625y;
    }

    public final LongPressEventModelEx copy(float f2, float f3) {
        return new LongPressEventModelEx(f2, f3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LongPressEventModelEx)) {
            return false;
        }
        LongPressEventModelEx longPressEventModelEx = (LongPressEventModelEx) obj;
        return Intrinsics.areEqual((Object) Float.valueOf(this.f2624x), (Object) Float.valueOf(longPressEventModelEx.f2624x)) && Intrinsics.areEqual((Object) Float.valueOf(this.f2625y), (Object) Float.valueOf(longPressEventModelEx.f2625y));
    }

    public final float getX() {
        return this.f2624x;
    }

    public final float getY() {
        return this.f2625y;
    }

    public int hashCode() {
        return (Float.hashCode(this.f2624x) * 31) + Float.hashCode(this.f2625y);
    }

    public String toString() {
        return "LongPressEventModelEx(x=" + this.f2624x + ", y=" + this.f2625y + ')';
    }
}
