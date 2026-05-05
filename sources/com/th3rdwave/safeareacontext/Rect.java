package com.th3rdwave.safeareacontext;

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
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004O\u000b8\u000b4O\u0007\":\u001b\u007f\u0007ljA0RkP\u008cZS8\u001bsڔ:Ša:ڎs;\u0004\u0019>E\u0019S\\g\u007fnx[\u001bG\u001d\b.x\u0019-YY\u0007`*\u000f`C\u007fCAQ\b=gaҽ:\u0005.7j?\b\u0010\u0019\u001aXIVΓ{\fR\u001a\u001eH@\u001f;\u0019ӏNM! \u0013V /\u001f#ʨO~OzkR/Q\u00040ŰOo\u000f>\fe\rtÖW\u0013|a,+X7c\u0016UY\t\u0007`]W\u0003mrm\u000bn'5.as\u00067\t\u0006\u001a\u00159S%]!'#ԫP)\u001d5;gcya>.\u0006\r\u0014\u000fR\u0003<\u0005mϵ/u!t\u001b&3#\u0007\u001aŊOJeP\u0015\u0013ad-kƅ2{H)jiai\u001a\u05ee;\u0002\rټ6%\u0007t/b%\u001dn\u00183T&RśUFEʰf\f_E{\u000bAq\u0010*\u001c0u\u0001\u009e\u007f\u00176Ϗ=9aB1(<\u0011VF\u007fv3aĈWoZ̲X$t E1Ç\u0010q"}, d2 = {"\u001ab^:\";A!&}\rZ=|R=a\u0001(wM\u0001\u0013\u0015Qx\u001d<\n4~F}\u001eFC", "", "F", "", "G", "EhSA[", "6dX4[;", "uE5\u00139o/", "5dc\u0015X0@V(", "u(5", "5dc$\\+MV", "5dc%", "5dc&", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "@dP0gsGO(\u0003\f^s\u000b\u00050eG$\t@|^\u0015Qx\u001d<\n4/f}'7i$."}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class Rect {
    private final float height;
    private final float width;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final float f18222x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final float f18223y;

    public Rect(float f2, float f3, float f4, float f5) {
        this.f18222x = f2;
        this.f18223y = f3;
        this.width = f4;
        this.height = f5;
    }

    public static /* synthetic */ Rect copy$default(Rect rect, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((1 & i2) != 0) {
            f2 = rect.f18222x;
        }
        if ((i2 + 2) - (2 | i2) != 0) {
            f3 = rect.f18223y;
        }
        if ((4 & i2) != 0) {
            f4 = rect.width;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            f5 = rect.height;
        }
        return rect.copy(f2, f3, f4, f5);
    }

    public final float component1() {
        return this.f18222x;
    }

    public final float component2() {
        return this.f18223y;
    }

    public final float component3() {
        return this.width;
    }

    public final float component4() {
        return this.height;
    }

    public final Rect copy(float f2, float f3, float f4, float f5) {
        return new Rect(f2, f3, f4, f5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rect)) {
            return false;
        }
        Rect rect = (Rect) obj;
        return Float.compare(this.f18222x, rect.f18222x) == 0 && Float.compare(this.f18223y, rect.f18223y) == 0 && Float.compare(this.width, rect.width) == 0 && Float.compare(this.height, rect.height) == 0;
    }

    public final float getHeight() {
        return this.height;
    }

    public final float getWidth() {
        return this.width;
    }

    public final float getX() {
        return this.f18222x;
    }

    public final float getY() {
        return this.f18223y;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f18222x) * 31) + Float.hashCode(this.f18223y)) * 31) + Float.hashCode(this.width)) * 31) + Float.hashCode(this.height);
    }

    public String toString() {
        return "Rect(x=" + this.f18222x + ", y=" + this.f18223y + ", width=" + this.width + ", height=" + this.height + ")";
    }
}
