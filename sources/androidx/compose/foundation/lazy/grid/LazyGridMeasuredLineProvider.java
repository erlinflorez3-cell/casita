package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
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
/* JADX INFO: compiled from: LazyGridMeasuredLineProvider.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\\\u001d<K!&i\u000eӵLш|\u0004O\u000f8é6B\u0015\"4ߚ\u007f\u0007tpA0JeP.hS2şs{J$c$wCCU0}*\tUOog\u0005Jb\u000bI\u0012\u000e\u0016\u000fj4I[xe\u0012\u001dAJoU3UڎE9n\u0013>\u000562*8\u007f\t\u00078@Ϻ@v)B\f?\"4NpRR;N\u0015\u001e \bV /!lk\\:`l\f??'\u0011oZNUd@\u0001[\u0014^TU\u0015\u0007e,4X7c\u001fȏW\u0003\u0015]$b\u0011O\n=3yW+9[\fWd]0\u0018#>g\r\fwlؘ՝PӠѨ&*յgMV\"6\rC3\u001bR\u001c\u000e4>x2;2~\b<8%|aYh\bnD\u0010z\u0010QE?0=9U3lacK\u0019|U*\"=\"1 \u0007!\nYT\u0005ڠ\u001fT\u0006qy]N^`N8pmq\u0012\u0013z\u0002X\txS\u000eR\u0014\u0011\\\u001cU;iQ;!\u001a\u0007\u0019Puz\u001d`\u0017X@ɰJغ&n\u001eճz\u0015\u001aZ\\d3l'ӼZ¯\u0015M$\u0381W\r\u0016\u001f8\\&IWiŎRS\u0001kp[k\u0019u;t>qn\u001a\u0016.ޭ`ۋ9Qk߄2^\u0005\u0016W<\u0011\b/٫Dΐ\u0010Zd̥r>Vp(w*I%ۿ\u0015\u0558Cq$ع|='e-H1(\u0019ˉ~ȤcZpɭкT<,\u0003oC|\f\u0007˨x\u001fnψ|m"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`!\u0007_:^\u0004'F3R5\\=\u007fG%\u0016Y\u000e[\u0001", "", "7rE2e;BQ\u0015\u0006", "", "Ak^Af", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`'\u000em;\\L", "5qX1<;>['\\\u0005n5\f", "", "AoP0X\t>b+~zg\u0013\u0001\u0012/s", ";dP@h9>R|\u000ezf\u0017\n\u0013@i~(\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`!\u0007_:^\u0004'F0],d=\u007fG%\u0016Y\u000e[\u0001", "AoP;?(R])\u000eek6\u000e\r.e\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`'\u0012_55r;Q\\]\u0017i\\\u0004A\u0013\u0012gc", "uY;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y5K7\u0018;QB\u0005R03)Jn=\u0006Q3X\u00065\u001d02\u0013X[qJ\u001e\u0016Y!\u0018)\u0017\rdK2n\u000e8)\u00185H}Jl\u000b\u0015_\u00151\u007f\u0005\fX\u001dKx^\\=>|(fcx/AAp:q\f^\u0001k:B\u000f!{*\u001fgP;_bO\u001aq_\u0004kfZbxB,IwiF\u000fp_L}&\u001bZ\u007f\u0002\u001b{_p@\tv\u0006A.5.kG|, k|\u0014\u001ag=0\r2P\u001dOZN\u0003vO\u0012g\u001fn]QS", "9dh\u0016a+>f\u0001z\u0006", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;4v;+UM,o:nHi", "5dc\u0018X@\"\\\u0018~\u000eF(\b", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y5K7\u001d*aMKz}\u0005\u0011}u \u0003w6^\u0006\rG`25[R\u0006%\u0010\u001d0", "1gX9W\nH\\'\u000e\bZ0\u0006\u0018=", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "AsP?g\u001aE](", "AoP;", "1gX9W\nH\\'\u000e\bZ0\u0006\u0018=-d+\u0001U\u0016\u0001!\u0006p\u0018L\u007f$1h\u0002*@g#.TC7y4", "uH8u=", "1qT.g,%W\"~", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`!\u0007_:^\u0004'F3R5\\(", "7mS2k", "7sT:f", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`!\u0007_:^\u0004'F0],d(", "AoP;f", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017%Ho3\u0002$hi'\u0012_5$", ";`X;4?Ba\u0007\nv\\0\u0006\u000b", "uHJ\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0002!'Pn\nKz/>#\u0005\u001cL\u0002_0ZG:5\u001b\u001a*|CF\u000bb\u0014Nr5WYN+@arEix_\n_'V\u0015hE+8+;-\u0017\u0002-E\"d\n\u000b#\u00189i\u0004\fT\u001aO\u0005\u001f\u0004AriPihxCPIl3.\u0013[2p\u0004<1\u0018pb\u0002deBk\tW\u0010ZRuuwT\u0019y\u001f(Gm1", "5dc\u000ea+&S\u0015\r\u000bk,", ":h]2<5=S,", "AoP;B-", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class LazyGridMeasuredLineProvider {
    public static final int $stable = 8;
    private final int gridItemsCount;
    private final boolean isVertical;
    private final LazyGridMeasuredItemProvider measuredItemProvider;
    private final LazyGridSlots slots;
    private final int spaceBetweenLines;
    private final LazyGridSpanLayoutProvider spanLayoutProvider;

    public abstract LazyGridMeasuredLine createLine(int i2, LazyGridMeasuredItem[] lazyGridMeasuredItemArr, List<GridItemSpan> list, int i3);

    public LazyGridMeasuredLineProvider(boolean z2, LazyGridSlots lazyGridSlots, int i2, int i3, LazyGridMeasuredItemProvider lazyGridMeasuredItemProvider, LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider) {
        this.isVertical = z2;
        this.slots = lazyGridSlots;
        this.gridItemsCount = i2;
        this.spaceBetweenLines = i3;
        this.measuredItemProvider = lazyGridMeasuredItemProvider;
        this.spanLayoutProvider = lazyGridSpanLayoutProvider;
    }

    /* JADX INFO: renamed from: childConstraints-JhjzzOo$foundation_release, reason: not valid java name */
    public final long m1163childConstraintsJhjzzOo$foundation_release(int i2, int i3) {
        int i4;
        if (i3 == 1) {
            i4 = this.slots.getSizes()[i2];
        } else {
            int i5 = (i3 + i2) - 1;
            i4 = (this.slots.getPositions()[i5] + this.slots.getSizes()[i5]) - this.slots.getPositions()[i2];
        }
        int iCoerceAtLeast = RangesKt.coerceAtLeast(i4, 0);
        return this.isVertical ? Constraints.Companion.m6603fixedWidthOenEA2s(iCoerceAtLeast) : Constraints.Companion.m6602fixedHeightOenEA2s(iCoerceAtLeast);
    }

    public final int spanOf(int i2) {
        LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider = this.spanLayoutProvider;
        return lazyGridSpanLayoutProvider.spanOf(i2, lazyGridSpanLayoutProvider.getSlotsPerLine());
    }

    public final LazyGridMeasuredLine getAndMeasure(int i2) {
        LazyGridSpanLayoutProvider.LineConfiguration lineConfiguration = this.spanLayoutProvider.getLineConfiguration(i2);
        int size = lineConfiguration.getSpans().size();
        int i3 = (size == 0 || lineConfiguration.getFirstItemIndex() + size == this.gridItemsCount) ? 0 : this.spaceBetweenLines;
        LazyGridMeasuredItem[] lazyGridMeasuredItemArr = new LazyGridMeasuredItem[size];
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            int iM1141getCurrentLineSpanimpl = GridItemSpan.m1141getCurrentLineSpanimpl(lineConfiguration.getSpans().get(i5).m1144unboximpl());
            LazyGridMeasuredItem lazyGridMeasuredItemM1162getAndMeasurem8Kt_7k = this.measuredItemProvider.m1162getAndMeasurem8Kt_7k(lineConfiguration.getFirstItemIndex() + i5, m1163childConstraintsJhjzzOo$foundation_release(i4, iM1141getCurrentLineSpanimpl), i4, iM1141getCurrentLineSpanimpl, i3);
            i4 += iM1141getCurrentLineSpanimpl;
            Unit unit = Unit.INSTANCE;
            lazyGridMeasuredItemArr[i5] = lazyGridMeasuredItemM1162getAndMeasurem8Kt_7k;
        }
        return createLine(i2, lazyGridMeasuredItemArr, lineConfiguration.getSpans(), i3);
    }

    public final LazyLayoutKeyIndexMap getKeyIndexMap() {
        return this.measuredItemProvider.getKeyIndexMap();
    }
}
