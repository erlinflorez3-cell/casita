package com.swmansion.rnscreens.utils;

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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004O\u000b8\u000b4I\u0007\":\u001b\u007f\u0007ljA0RkP\u008cZS8\u001bsڔ:Ša:ڎs;\u0004\u0019>5\u0019S\\g\u007fnx[\u001bG\u001d\b.x\u0019-֒Yxk\u0015W9PvW3{p\u0004˧a==\u0013(J\"fzKі\u001brc\u001e\u007f\u0013CyÈB6FpHR%M3\u001bB\fD \u000f tg|7\u000fȔ\\\u0003@1\r\u0002B|2\u00106\u000bY%Hj&;u(Գ,\t>C\"=S1\u0015\u0019Đ>KF\u007fL\u001dhU7qʵr(Ef\u0002,\u0015YPոax.ؘ\u001dSf\u001050 rYP&(&{ԫ\u0011B\f\u05fa\u001e)N4;\u001fǺ\f\u001f"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011\u007f\u001d@}3~Dy\u001f6q\u001f0*SDj;\u001ej", "", ">`S1\\5@A(z\bm", "", ">`S1\\5@3\"}", "uE5uI", "5dc\u001dT+=W\"\u0001Zg+", "u(5", "5dc\u001dT+=W\"\u0001hm(\n\u0018", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class PaddingBundle {
    private final float paddingEnd;
    private final float paddingStart;

    public PaddingBundle(float f2, float f3) {
        this.paddingStart = f2;
        this.paddingEnd = f3;
    }

    public static /* synthetic */ PaddingBundle copy$default(PaddingBundle paddingBundle, float f2, float f3, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            f2 = paddingBundle.paddingStart;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            f3 = paddingBundle.paddingEnd;
        }
        return paddingBundle.copy(f2, f3);
    }

    public final float component1() {
        return this.paddingStart;
    }

    public final float component2() {
        return this.paddingEnd;
    }

    public final PaddingBundle copy(float f2, float f3) {
        return new PaddingBundle(f2, f3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaddingBundle)) {
            return false;
        }
        PaddingBundle paddingBundle = (PaddingBundle) obj;
        return Float.compare(this.paddingStart, paddingBundle.paddingStart) == 0 && Float.compare(this.paddingEnd, paddingBundle.paddingEnd) == 0;
    }

    public final float getPaddingEnd() {
        return this.paddingEnd;
    }

    public final float getPaddingStart() {
        return this.paddingStart;
    }

    public int hashCode() {
        return (Float.hashCode(this.paddingStart) * 31) + Float.hashCode(this.paddingEnd);
    }

    public String toString() {
        return "PaddingBundle(paddingStart=" + this.paddingStart + ", paddingEnd=" + this.paddingEnd + ")";
    }
}
