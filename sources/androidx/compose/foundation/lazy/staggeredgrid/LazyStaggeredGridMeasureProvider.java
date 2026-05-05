package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;
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
/* JADX INFO: compiled from: LazyStaggeredGridMeasure.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\\\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000b<K\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP\u008cZS@\u000fs{:$c$\bCCU ~*\teNo˧vJh\u0011K\u000f\f\u001b\u0001j:կ]xc\u0012\u00172P\u000eG3coE9fv>\u000562*8\u007f\b\u00078@Ϻ@|\u000bE[\f@0nozu\u001dQ\u0013\u001b*\u0006l\"\u0011\"jjf6vpm>=(\u001bipT7c>\u0004e\rt\\ܮ\u0011vo'scEC-%\u0002\u00127ViO\u001b? N5l59CI\"h|Xŕ\u0013ƃܹN\fǁv(b\u0018_tTw9d{K~\u000eX{\t\u0012%<2\u001f6+VEE\u001a\u0015\u0019>7\u0003\u0005k@~\u0013\u000fF\u000e\u0013y6E>099S3hg`i2~A\n %$3\u0003~!\nq<|E\u001fb\u0016i1\u007fO\u0004l߉\tXǀq\u0006v\u0002\u0010JLNU!G{?.G)EqQ#O|2LRy\u000f\u0005\u000f\u000bؾhQ͕D$t9ENQ<he|\u0005\u001aP\u0005\\:'e\u001c\u0003\u0018.\f!7twj2U\u0014\\a\u0001i\u0019^\u000e\u000e3M~7\b}2\"Ŝ8]ۋ9Si5oxG M=z\u0005\u0007h\u0019Ͱ\u000eȺ`(*õ\u0019v\u001ez\u0014D|\u0010iԸAۇ 44ջik#R\u001b\u001epL3Mރ^l(\u0001Z?2\u0010:0\u0003\u000e\u0019P\u000bvF\u03a2zͅ0|hõ}M_<1&\u0004*?ؗ~ɠ\u000b~{ÒûgUOLr5}X\u0002¯2H8׀3d"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003m_Abd6CNP,iRq\u001f!\u0016YuN'\u001b\u0015fA\u000f{NH#\u0007,VW", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;6v#U\\[,[6\u0002=\u001c|g\u0018_/\f\u0005f\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003m_Abd6CNP,iRq\u001f!\u0016YuN'\u001b\u0015fA#RS7']", "7rE2e;BQ\u0015\u0006", "", "7sT:C9Hd\u001d}zk", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003m_Abd6CNP,iRq\u001f!\u0016Yq]+\u0015ofK5rC7,]", ";dP@h9>A\u0017\t\u0006^", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;6v#U\\[,JP|H\u0014g", "@db<_=>R\u0007\u0006\u0005m:", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003m_Abd6CNP,iRq\u001f!\u0016Y{U5\u001c\u0013/", "uY;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y5K7$=IE=kA\u001e\u0014jn=\u0006-\u0013J\f;5[J.^R\u007f=\u0013sg\u0012M\u000f\u001c\u0005a,1xU;\u001e\b9\u001fh7q\u007f\u0019 \u00124}:@`\u0018R\u0004#u\u000b*rVb^uVEOksk\bt1&A68\u001e\u0002(dOLC\u001ebO%|b\tOgC'\u000bE$,keQEE<8}&,U\u007fv%{V~3\u007f7\u00124s7n\u0015Tf\u0014Mb\u0003\u001euc=<:\u007fJ\";Meuy>\rj,e\u0007WI1F-St_J\u0011\u0007j\u0017Z\u0017nc\u007f%Y\u0010MWEX\u0018", "9dh\u0016a+>f\u0001z\u0006", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;4v;+UM,o:nHi", "5dc\u0018X@\"\\\u0018~\u000eF(\b", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y5K7\u001d*aMKz}\u0005\u0011}u \u0003w6^\u0006\rG`25[R\u0006%\u0010\u001d0", "1gX9W\nH\\'\u000e\bZ0\u0006\u0018=", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "Ak^A", "", "AoP;", "1gX9W\nH\\'\u000e\bZ0\u0006\u0018=-d+\u0001U\u0016\u0001!", "uH8u=", "1qT.g,\"b\u0019\u0007", "7mS2k", ":`]2", "9dh", "", "1n]AX5MB-\nz", ">kP0X(;Z\u0019\r", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016\u0004", "1n]@g9:W\"\u000e\t", "1qT.g,\"b\u0019\u0007Bi0\fv\u0016O[", "uH8\u0016?1:d\u0015H\u0002Z5~R\u0019b\u0005(yOV}\u001cC\u0001\n\u0006}!>[G\n4r\u0016,\\\u0019\"p0/\u00112qH\u000bju5z5V\"3oCN{<!\u001c^\rat\u000b\u000faL.|D\u0001 \u0012<R\u00017w\u0005\u0016\u001fW<f\u0006V \u001eVu\u0017wA6hE[l}F\u000b,^?xyn\u0019^<:1\u0014pz(lO\u0016\nwa!\u007fRxKvG!P", "5dc\u000ea+&S\u0015\r\u000bk,", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003tn(Wc#PNN\u0002", "5dc\u000ea+&S\u0015\r\u000bk,D\u000eC6^\u0016y,", "uH9u?(GR&\t~]?F\u00079m\u000b2\n@J\u0018!Wx\r8\u0006)?bG'3\u0003*w[R7m6\u001e\"h`;\u0014g+\u0018]#\\`<;XTt=!\u0012Yo[/\flY=2~Q7\u001ek;I\n\u0011", "5dc\u000ea+&S\u0015\r\u000bk,DP2Bo+\u0007>", "uH8\u0016=o%O\"}\bh0{\u001cxc\n0\u0007J\u000f\u0017`Hy\u001eEu!D]\b)\u0001t\u0012Ca\rIz0 \u0017hn9\u0006e9Rup.Hc@Jan?\u0016\u0012g\u000eM\r\u001a\tX)$jRG,\b+-\u0011;pV", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class LazyStaggeredGridMeasureProvider implements LazyLayoutMeasuredItemProvider<LazyStaggeredGridMeasuredItem> {
    public static final int $stable = 8;
    private final boolean isVertical;
    private final LazyStaggeredGridItemProvider itemProvider;
    private final LazyLayoutMeasureScope measureScope;
    private final LazyStaggeredGridSlots resolvedSlots;

    /* JADX INFO: renamed from: createItem-pitSLOA */
    public abstract LazyStaggeredGridMeasuredItem mo1226createItempitSLOA(int i2, int i3, int i4, Object obj, Object obj2, List<? extends Placeable> list, long j2);

    public LazyStaggeredGridMeasureProvider(boolean z2, LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, LazyLayoutMeasureScope lazyLayoutMeasureScope, LazyStaggeredGridSlots lazyStaggeredGridSlots) {
        this.isVertical = z2;
        this.itemProvider = lazyStaggeredGridItemProvider;
        this.measureScope = lazyLayoutMeasureScope;
        this.resolvedSlots = lazyStaggeredGridSlots;
    }

    /* JADX INFO: renamed from: childConstraints-JhjzzOo, reason: not valid java name */
    private final long m1232childConstraintsJhjzzOo(int i2, int i3) {
        int i4;
        if (i3 == 1) {
            i4 = this.resolvedSlots.getSizes()[i2];
        } else {
            int i5 = this.resolvedSlots.getPositions()[i2];
            int i6 = (i2 + i3) - 1;
            i4 = (this.resolvedSlots.getPositions()[i6] + this.resolvedSlots.getSizes()[i6]) - i5;
        }
        return this.isVertical ? Constraints.Companion.m6603fixedWidthOenEA2s(i4) : Constraints.Companion.m6602fixedHeightOenEA2s(i4);
    }

    /* JADX INFO: renamed from: getAndMeasure-jy6DScQ, reason: not valid java name */
    public final LazyStaggeredGridMeasuredItem m1233getAndMeasurejy6DScQ(int i2, long j2) {
        Object key = this.itemProvider.getKey(i2);
        Object contentType = this.itemProvider.getContentType(i2);
        int length = this.resolvedSlots.getSizes().length;
        int i3 = (int) (j2 >> 32);
        int iCoerceAtMost = RangesKt.coerceAtMost(i3, length - 1);
        int iCoerceAtMost2 = RangesKt.coerceAtMost(((int) ((-1) - (((-1) - j2) | ((-1) - 4294967295L)))) - i3, length - iCoerceAtMost);
        long jM1232childConstraintsJhjzzOo = m1232childConstraintsJhjzzOo(iCoerceAtMost, iCoerceAtMost2);
        return mo1226createItempitSLOA(i2, iCoerceAtMost, iCoerceAtMost2, key, contentType, this.measureScope.mo1189measure0kLqBqw(i2, jM1232childConstraintsJhjzzOo), jM1232childConstraintsJhjzzOo);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider
    /* JADX INFO: renamed from: getAndMeasure--hBUhpc */
    public LazyStaggeredGridMeasuredItem mo1132getAndMeasurehBUhpc(int i2, int i3, int i4, long j2) {
        return mo1226createItempitSLOA(i2, i3, i4, this.itemProvider.getKey(i2), this.itemProvider.getContentType(i2), this.measureScope.mo1189measure0kLqBqw(i2, j2), j2);
    }

    public final LazyLayoutKeyIndexMap getKeyIndexMap() {
        return this.itemProvider.getKeyIndexMap();
    }
}
