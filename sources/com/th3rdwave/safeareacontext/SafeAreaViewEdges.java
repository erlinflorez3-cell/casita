package com.th3rdwave.safeareacontext;

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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4O\u0007\":\u001b\u007f\u0007ljA0RkP\u008cZS8\u001bsڔ:Ša:ڎs;\u0004\u0019>E\u0019S\\g\u007fnx[\u001bG\u001d\b.x\u0019-YY\u0007`*\u000f`C\u007fCAQ\b=gaҽ:\u0005.7j?\b\u0010\u0019\u001aXIVΓ{\fR\u001a\u001eH@\u001f;\u0019ӏNM! \u0013V /\u001f#ʨO~OzkR/Q\u00040ŰOo\u000f>\fe\rtÖW\u0013|a,+X7c\u0016UY\t\u0007`]W\u0003mrm\u000bn'5.as\u00067\t\u0006\u001a\u00159S%]!'#ԫP)\u001d5;gcya>.\u0006\r\u0014\u000fR\u0003<\u0005mϵ/u!t\u001b&3#\u0007\u001aŊOJeP\u0015\u0013ad-kƅ2{H)iiai\u001a\u05ee;\u0002\rټ6%\u0007t/b%\u001dn\u00193T&RśUFEʰf\f_E{\u000bAq\u0010,\u001c0u\u0001\u009e\u007f\u00176Ϗ=9aB1(<\u0011VD\u007fv3aĈWoZ̲X$t E1Ç\u0010q"}, d2 = {"\u001ab^:\";A!&}\rZ=|R=a\u0001(wM\u0001\u0013\u0015Qx\u001d<\n4~Gy!7I#.I4?kF}\u0014jaG\\", "", "Bn_", "\u001ab^:\";A!&}\rZ=|R=a\u0001(wM\u0001\u0013\u0015Qx\u001d<\n4~Gy!7I#.I4?kF}\u0014ja!\u0011b,\\L", "@hV5g", "0ncAb4", ":dUA", "uKR<`uMVf\fyp(\u000e\txs{){<\u000e\u0017\u0013Ey\u0017Kv8D#k\u001c8mq;M?,o40tgc9nm+N\u0005|.JX4&au\u000b!\u0011l\n_+V\u0013UB$jQ7\u001b\u00066R\u0011;{\u0010U\u0004\n6jLOV\f8}\u0015\b!(jFAixGO\u001bI(n\u0014),_\bG#&m*\u001b2^*\u000b{O\u001erNwqpV\u0019\u000eGm,i\\F!|U8e+\u001f][v\u00142@~*t;Y\u001b(@lNZjeK]\u000b\u0011=\\\u000b5\"7<\u000fLK_svG\u001dh2pQ{^61tre_9\u0013\u0007ovZ7aG\u000b6R\u0014\u0014\r`", "5dc\u000fb;M]!", "u(;0b4\bb\u001cL\b]>x\u001a//\u000e$|@|$\u0017Cm\u0018E\u0006%HhG\u000e3n\u0016\nZC7\\8\u001e'H`;\u0007K6Mv5\u001d", "5dc\u0019X-M", "5dc\u001f\\.Ab", "5dc!b7", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "@dP0gsGO(\u0003\f^s\u000b\u00050eG$\t@|^\u0015Qx\u001d<\n4/f}'7i$."}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class SafeAreaViewEdges {
    private final SafeAreaViewEdgeModes bottom;
    private final SafeAreaViewEdgeModes left;
    private final SafeAreaViewEdgeModes right;
    private final SafeAreaViewEdgeModes top;

    public SafeAreaViewEdges(SafeAreaViewEdgeModes top, SafeAreaViewEdgeModes right, SafeAreaViewEdgeModes bottom, SafeAreaViewEdgeModes left) {
        Intrinsics.checkNotNullParameter(top, "top");
        Intrinsics.checkNotNullParameter(right, "right");
        Intrinsics.checkNotNullParameter(bottom, "bottom");
        Intrinsics.checkNotNullParameter(left, "left");
        this.top = top;
        this.right = right;
        this.bottom = bottom;
        this.left = left;
    }

    public static /* synthetic */ SafeAreaViewEdges copy$default(SafeAreaViewEdges safeAreaViewEdges, SafeAreaViewEdgeModes safeAreaViewEdgeModes, SafeAreaViewEdgeModes safeAreaViewEdgeModes2, SafeAreaViewEdgeModes safeAreaViewEdgeModes3, SafeAreaViewEdgeModes safeAreaViewEdgeModes4, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            safeAreaViewEdgeModes = safeAreaViewEdges.top;
        }
        if ((2 & i2) != 0) {
            safeAreaViewEdgeModes2 = safeAreaViewEdges.right;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            safeAreaViewEdgeModes3 = safeAreaViewEdges.bottom;
        }
        if ((i2 & 8) != 0) {
            safeAreaViewEdgeModes4 = safeAreaViewEdges.left;
        }
        return safeAreaViewEdges.copy(safeAreaViewEdgeModes, safeAreaViewEdgeModes2, safeAreaViewEdgeModes3, safeAreaViewEdgeModes4);
    }

    public final SafeAreaViewEdgeModes component1() {
        return this.top;
    }

    public final SafeAreaViewEdgeModes component2() {
        return this.right;
    }

    public final SafeAreaViewEdgeModes component3() {
        return this.bottom;
    }

    public final SafeAreaViewEdgeModes component4() {
        return this.left;
    }

    public final SafeAreaViewEdges copy(SafeAreaViewEdgeModes top, SafeAreaViewEdgeModes right, SafeAreaViewEdgeModes bottom, SafeAreaViewEdgeModes left) {
        Intrinsics.checkNotNullParameter(top, "top");
        Intrinsics.checkNotNullParameter(right, "right");
        Intrinsics.checkNotNullParameter(bottom, "bottom");
        Intrinsics.checkNotNullParameter(left, "left");
        return new SafeAreaViewEdges(top, right, bottom, left);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SafeAreaViewEdges)) {
            return false;
        }
        SafeAreaViewEdges safeAreaViewEdges = (SafeAreaViewEdges) obj;
        return this.top == safeAreaViewEdges.top && this.right == safeAreaViewEdges.right && this.bottom == safeAreaViewEdges.bottom && this.left == safeAreaViewEdges.left;
    }

    public final SafeAreaViewEdgeModes getBottom() {
        return this.bottom;
    }

    public final SafeAreaViewEdgeModes getLeft() {
        return this.left;
    }

    public final SafeAreaViewEdgeModes getRight() {
        return this.right;
    }

    public final SafeAreaViewEdgeModes getTop() {
        return this.top;
    }

    public int hashCode() {
        return (((((this.top.hashCode() * 31) + this.right.hashCode()) * 31) + this.bottom.hashCode()) * 31) + this.left.hashCode();
    }

    public String toString() {
        return "SafeAreaViewEdges(top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + ", left=" + this.left + ")";
    }
}
