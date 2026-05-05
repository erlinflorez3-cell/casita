package com.biocatch.client.android.sdk.contract.externalCollectors.continuousCollectors.flingEvent;

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
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004O\u000b8\u000b4O\u0007\":\u001b\u007f\u0007ljA0RkP\u008cZS8\u001bsڔ:Ša:ڎs;\u0004\u0019>E\u0019S\\g\u007fnx[\u001bG\u001d\b.x\u0019-YY\u0007`*\u000f`C\u007fCAQ\b=gaҽ:\u0005.7j?\b\u0010\u0019\u001aXIVΓ{\fR\u001a\u001eH@\u001f;\u0019ӏNM! \u0013V /\u001f#ʨO~OzkR/Q\u00040ŰOo\u000f>\fe\rtÖW\u0013|a,+X7c\u0016UY\t\u0007`]W\u0003mrm\u000bn'5.as\u00067\t\u0006\u001a\u00159S%]!'#ԫP)\u001d5;gcya>.\u0006\r\u0014\u000fR\u0003<\u0005mϵ/u!t\u001b&3#\u0007\u001aŊOJeP\u0015\u0013ad-kƅ2{H)fiai\u001a\u05ee;\u0002\rټ6%\u0007t/b%\u001dn\u00173T&RśUFEʰf\f_E{\u000bAq\u0010-\u001c0u\u0001\u009e\u007f\u00176Ϗ=9aB1(<\u0011VH\u007fv3aĈWoZ̲X$t E1Ç\u0010q"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ541$hnB\u0003j\nX}.GJ]6i`<;\u001e\u001bi\u0012W;\u0017\u0015g\u001f.uK7\u001d\u00176V\u0010\u0005i\b\u0010\u001f\u0010\u0015{pKeY(\u0001\u0019~C\tyFbnaQ@Ei\nwa", "", "AsP?g\u001f", "", "AsP?g ", "Dd[<V0Mg\f", "Dd[<V0Mg\r", "uE5\u00139o/", "5dc g(Kb\f", "u(5", "5dc g(Kb\r", "5dc#X3HQ\u001d\u000e\u000fQ", "5dc#X3HQ\u001d\u000e\u000fR", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class FlingEventModelEx {
    private final float startX;
    private final float startY;
    private final float velocityX;
    private final float velocityY;

    public FlingEventModelEx(float f2, float f3, float f4, float f5) {
        this.startX = f2;
        this.startY = f3;
        this.velocityX = f4;
        this.velocityY = f5;
    }

    public static /* synthetic */ FlingEventModelEx copy$default(FlingEventModelEx flingEventModelEx, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            f2 = flingEventModelEx.startX;
        }
        if ((i2 + 2) - (2 | i2) != 0) {
            f3 = flingEventModelEx.startY;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            f4 = flingEventModelEx.velocityX;
        }
        if ((i2 & 8) != 0) {
            f5 = flingEventModelEx.velocityY;
        }
        return flingEventModelEx.copy(f2, f3, f4, f5);
    }

    public final float component1() {
        return this.startX;
    }

    public final float component2() {
        return this.startY;
    }

    public final float component3() {
        return this.velocityX;
    }

    public final float component4() {
        return this.velocityY;
    }

    public final FlingEventModelEx copy(float f2, float f3, float f4, float f5) {
        return new FlingEventModelEx(f2, f3, f4, f5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlingEventModelEx)) {
            return false;
        }
        FlingEventModelEx flingEventModelEx = (FlingEventModelEx) obj;
        return Intrinsics.areEqual((Object) Float.valueOf(this.startX), (Object) Float.valueOf(flingEventModelEx.startX)) && Intrinsics.areEqual((Object) Float.valueOf(this.startY), (Object) Float.valueOf(flingEventModelEx.startY)) && Intrinsics.areEqual((Object) Float.valueOf(this.velocityX), (Object) Float.valueOf(flingEventModelEx.velocityX)) && Intrinsics.areEqual((Object) Float.valueOf(this.velocityY), (Object) Float.valueOf(flingEventModelEx.velocityY));
    }

    public final float getStartX() {
        return this.startX;
    }

    public final float getStartY() {
        return this.startY;
    }

    public final float getVelocityX() {
        return this.velocityX;
    }

    public final float getVelocityY() {
        return this.velocityY;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.startX) * 31) + Float.hashCode(this.startY)) * 31) + Float.hashCode(this.velocityX)) * 31) + Float.hashCode(this.velocityY);
    }

    public String toString() {
        return "FlingEventModelEx(startX=" + this.startX + ", startY=" + this.startY + ", velocityX=" + this.velocityX + ", velocityY=" + this.velocityY + ')';
    }
}
