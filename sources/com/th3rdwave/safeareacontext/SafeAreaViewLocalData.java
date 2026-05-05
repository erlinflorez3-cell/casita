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
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jA0JoP.`\\2\u000fq{<$i*yّCU(\n*ޛUȥm}ñzZ9BO!&|x,aU'^\"\u0013@D\b?aP\u007fAGd\r63%ݨ&8\b\u000bI!8U(v)D\u0012ď\u0013xG~Hj\r{\b`Ǝ\u0007\u0007'\u000f-tg|;\u000fȔ^\u0003T1\u0013\u0002B|ϋ\u00106\u0003M\u001bFl';w\u0012$1@E7-%\u0002\u00067Xa?\u0011C\n=3mmޗ*\u0012\u0005eGp\u007fB'[U\u001bp\u000b(r\u0004\u007f_R̃,\u0018jYd&(&\u0010Bɵ;L\u0015\u0014=`.[1-۳\r\u0004\u0004\u0001WXP0c۰\u0004\u0001iا/'\u0006:9Aku_aS\u0019|8߉\t\u0013&ŀ\u0019p'db\u00181$)V\u0010Q_T͘ANVˣq?s\u000f~n͌.\u001c"}, d2 = {"\u001ab^:\";A!&}\rZ=|R=a\u0001(wM\u0001\u0013\u0015Qx\u001d<\n4~Gy!7I#.I4?kF\u0005\u001ff]@e_;JL", "", "7mb2g:", "\u001ab^:\";A!&}\rZ=|R=a\u0001(wM\u0001\u0013\u0015Qx\u001d<\n4~9|\"7Q\u001f<MRIA", ";nS2", "\u001ab^:\";A!&}\rZ=|R=a\u0001(wM\u0001\u0013\u0015Qx\u001d<\n4~Gy!7I#.I4?kF\u0006\u001fga\u000f", "3cV2f", "\u001ab^:\";A!&}\rZ=|R=a\u0001(wM\u0001\u0013\u0015Qx\u001d<\n4~Gy!7I#.I4?kF}\u0014jaG\\", "uKR<`uMVf\fyp(\u000e\txs{){<\u000e\u0017\u0013Ey\u0017Kv8D#]\u001f9my7[CJy\n\u0005\u0013ri\u0003\u0016fy[u9C]NujNs=\u0010\u001fZ\nL5\u0016\u0014YT3823 \b\bV\u00027Y\u0005\f(u?ip\u0018=\u000eQ\u0002^\u0005DvuEk[\u000bG\u000bS^+d\bl\u001dX8D-#q,*2>*\u000b{/\u001erNjkgYxy:$LC\u001f7", "5dc\u0012W.>a", "u(;0b4\bb\u001cL\b]>x\u001a//\u000e$|@|$\u0017Cm\u0018E\u0006%HhG\u000e3n\u0016\nZC7\\8\u001e'H`;\u0007q\u0002", "5dc\u0016a:>b'", "u(;0b4\bb\u001cL\b]>x\u001a//\u000e$|@|$\u0017Cm\u0018E\u0006%HhG\u007f6o\u0016\u0012VQ;zBs", "5dc\u001ab+>", "u(;0b4\bb\u001cL\b]>x\u001a//\u000e$|@|$\u0017Cm\u0018E\u0006%HhG\u000e3n\u0016\nZC7\\8\u001e'Pk8\u00079", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "@dP0gsGO(\u0003\f^s\u000b\u00050eG$\t@|^\u0015Qx\u001d<\n4/f}'7i$."}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class SafeAreaViewLocalData {
    private final SafeAreaViewEdges edges;
    private final EdgeInsets insets;
    private final SafeAreaViewMode mode;

    public SafeAreaViewLocalData(EdgeInsets insets, SafeAreaViewMode mode, SafeAreaViewEdges edges) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(edges, "edges");
        this.insets = insets;
        this.mode = mode;
        this.edges = edges;
    }

    public static /* synthetic */ SafeAreaViewLocalData copy$default(SafeAreaViewLocalData safeAreaViewLocalData, EdgeInsets edgeInsets, SafeAreaViewMode safeAreaViewMode, SafeAreaViewEdges safeAreaViewEdges, int i2, Object obj) {
        if ((1 & i2) != 0) {
            edgeInsets = safeAreaViewLocalData.insets;
        }
        if ((2 & i2) != 0) {
            safeAreaViewMode = safeAreaViewLocalData.mode;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            safeAreaViewEdges = safeAreaViewLocalData.edges;
        }
        return safeAreaViewLocalData.copy(edgeInsets, safeAreaViewMode, safeAreaViewEdges);
    }

    public final EdgeInsets component1() {
        return this.insets;
    }

    public final SafeAreaViewMode component2() {
        return this.mode;
    }

    public final SafeAreaViewEdges component3() {
        return this.edges;
    }

    public final SafeAreaViewLocalData copy(EdgeInsets insets, SafeAreaViewMode mode, SafeAreaViewEdges edges) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(edges, "edges");
        return new SafeAreaViewLocalData(insets, mode, edges);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SafeAreaViewLocalData)) {
            return false;
        }
        SafeAreaViewLocalData safeAreaViewLocalData = (SafeAreaViewLocalData) obj;
        return Intrinsics.areEqual(this.insets, safeAreaViewLocalData.insets) && this.mode == safeAreaViewLocalData.mode && Intrinsics.areEqual(this.edges, safeAreaViewLocalData.edges);
    }

    public final SafeAreaViewEdges getEdges() {
        return this.edges;
    }

    public final EdgeInsets getInsets() {
        return this.insets;
    }

    public final SafeAreaViewMode getMode() {
        return this.mode;
    }

    public int hashCode() {
        return (((this.insets.hashCode() * 31) + this.mode.hashCode()) * 31) + this.edges.hashCode();
    }

    public String toString() {
        return "SafeAreaViewLocalData(insets=" + this.insets + ", mode=" + this.mode + ", edges=" + this.edges + ")";
    }
}
