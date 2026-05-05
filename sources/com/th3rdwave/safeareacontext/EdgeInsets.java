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
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004O\u000b8\u000b4O\u0007\":\u001b\u007f\u0007ljA0RkP\u008cZS8\u001bsڔ:Ša:ڎs;\u0004\u0019>E\u0019S\\g\u007fnx[\u001bG\u001d\b.x\u0019-YY\u0007`*\u000f`C\u007fCAQ\b=gaҽ:\u0005.7j?\b\u0010\u0019\u001aXIVΓ{\fR\u001a\u001eH@\u001f;\u0019ӏNM! \u0013V /\u001f#ʨO~OzkR/Q\u00040ŰOo\u000f>\fe\rtÖW\u0013|a,+X7c\u0016UY\t\u0007`]W\u0003mrm\u000bn'5.as\u00067\t\u0006\u001a\u00159S%]!'#ԫP)\u001d5;gcya>.\u0006\r\u0014\u000fR\u0003<\u0005mϵ/u!t\u001b&3#\u0007\u001aŊOJeP\u0015\u0013ad-kƅ2{H)iiai\u001a\u05ee;\u0002\rټ6%\u0007t/b%\u001dn\u00193T&RśUFEʰf\f_E{\u000bAq\u0010,\u001c0u\u0001\u009e\u007f\u00176Ϗ=9aB1(<\u0011VD\u007fv3aĈWoZ̲X$t E1Ç\u0010q"}, d2 = {"\u001ab^:\";A!&}\rZ=|R=a\u0001(wM\u0001\u0013\u0015Qx\u001d<\n4~9|\"7Q\u001f<MRIA", "", "Bn_", "", "@hV5g", "0ncAb4", ":dUA", "uE5\u00139o/", "5dc\u000fb;M]!", "u(5", "5dc\u0019X-M", "5dc\u001f\\.Ab", "5dc!b7", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "@dP0gsGO(\u0003\f^s\u000b\u00050eG$\t@|^\u0015Qx\u001d<\n4/f}'7i$."}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class EdgeInsets {
    private final float bottom;
    private final float left;
    private final float right;
    private final float top;

    public EdgeInsets(float f2, float f3, float f4, float f5) {
        this.top = f2;
        this.right = f3;
        this.bottom = f4;
        this.left = f5;
    }

    public static /* synthetic */ EdgeInsets copy$default(EdgeInsets edgeInsets, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            f2 = edgeInsets.top;
        }
        if ((2 & i2) != 0) {
            f3 = edgeInsets.right;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            f4 = edgeInsets.bottom;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            f5 = edgeInsets.left;
        }
        return edgeInsets.copy(f2, f3, f4, f5);
    }

    public final float component1() {
        return this.top;
    }

    public final float component2() {
        return this.right;
    }

    public final float component3() {
        return this.bottom;
    }

    public final float component4() {
        return this.left;
    }

    public final EdgeInsets copy(float f2, float f3, float f4, float f5) {
        return new EdgeInsets(f2, f3, f4, f5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EdgeInsets)) {
            return false;
        }
        EdgeInsets edgeInsets = (EdgeInsets) obj;
        return Float.compare(this.top, edgeInsets.top) == 0 && Float.compare(this.right, edgeInsets.right) == 0 && Float.compare(this.bottom, edgeInsets.bottom) == 0 && Float.compare(this.left, edgeInsets.left) == 0;
    }

    public final float getBottom() {
        return this.bottom;
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getRight() {
        return this.right;
    }

    public final float getTop() {
        return this.top;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.top) * 31) + Float.hashCode(this.right)) * 31) + Float.hashCode(this.bottom)) * 31) + Float.hashCode(this.left);
    }

    public String toString() {
        return "EdgeInsets(top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + ", left=" + this.left + ")";
    }
}
