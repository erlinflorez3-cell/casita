package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: LazyListMeasuredItemProvider.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯL\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u0006\u0010nʑA0ZeP\u008cZS@\u000fs{:(c$\bCCU \u007f*\t]To˧vJhŏK\u000f\f\u0016\u0001j:g]xs\u0012\u00172HwEQcڎm?pvF\u0005N2P7:*\u0007\u001f:L\u001ew\u0013Cy\u000e\"4NsRR;Q\u0015\u001e \u000bV /$lk\\=`l\fBǥ'\u0003wK\u0017gmB\u0015M;F\u0005+\u001b\ny\u001eYTg9#:k\u00035h\fE\u0011V\n?\u001bgU=[S\u0002oN^\u0010\u0016%+}'\f\fV`\u0013Rx\fU-\u0016\bؘOʫ߭{|\u0002(J V&5eF-Hf8\u0012A\b\u000bSnd2dH\u007f\tbN\u0017S\u0002Ɗ*ݍӸjSgY'm\u007f,\u0013*6#/nQ_b!x\u0015Ih(U?qX=vb:]K\u000f\u001cp\u0011\u0016Z\b>H\u0018/*\u0013t+ğ6كޠ'#q$Vg8\u000e\u0013j\u0001S\u0018TΫ?̎Ļ\u00156Ҋ\r\u0014bDr\u0012\u0004RZc:\u001d\u001e(b\f\u0016\bA&3ɿ>Ƽ)\u0010Vи9xx[u\nS>\u001d{֍ro&Y?nAF\"o\u001ehjvBG\u0013ϸ\u0007ֽjB[ێȚ\\1*5Nм,&zLN\u00122՞C\u0016"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i\u001ei+B4GIz\u001c\u001e\u0011vqF\u0007b\u0010]v/2YX=`QrJi", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;6v#U\\[,[6\u0002=\u001c|g\u0018_/\f\u0005f\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i\u001ei+B4GIz\u001c\u001e\u0011vqF\u0007b\u0010]v/\u001d", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "7rE2e;BQ\u0015\u0006", "", "7sT:C9Hd\u001d}zk", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i\u001ei+B4GIz\u0018-\u0015pLF\u0011t0Mv4\u001d", ";dP@h9>A\u0017\t\u0006^", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;6v#U\\[,JP|H\u0014g", "uII\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0002!'Pn\nKz/>#\u0005\u001cL\u0002_\u0015IXOR8,$Lp9\u000fN9X\b+FL[\u0002CN{<!\u001c^\rat\u000b\u000faL.|D\u0001 \u0012<R\u00017w\u0005\u0016\u001fW<f\u0006V \u0017C\u000e\u001f\u0006PrOBns`CUOr9L\f[+lG:\u0012\u0012{$\u001b>74\u0014\u000bZ\u0015{\u001c~xo\u0011\u001d\u0004G$KvWM\u000fNU=p7&ZY\u0002\u001b@g\u0002;r<\u000eA\u00122q\u000bKtm\u0002O", "1gX9W\nH\\'\u000e\bZ0\u0006\u0018=", "5dc\u0010[0ERv\t\u0004l;\n\u00053n\u000f6CH\u000fv{CN\u0014", "u(9", "\u0018", "9dh\u0016a+>f\u0001z\u0006", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;4v;+UM,o:nHi", "5dc\u0018X@\"\\\u0018~\u000eF(\b", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y5K7\u001d*aMKz}\u0005\u0011}u \u0003w6^\u0006\rG`25[R\u0006%\u0010\u001d0", "1qT.g,\"b\u0019\u0007", "7mS2k", "", "9dh", "", "1n]AX5MB-\nz", ">kP0X(;Z\u0019\r", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016\u0004", "1qT.g,\"b\u0019\u0007BQ\u007f\\\u00102VN", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u00044H7|0g%we@PJ0\\\u0006|,\u00105(eQ\u007fG\u0018\u0011mWL5\u0015\u0010cO$8EA/\u0011+E\u0011?r\nU\u001d\nJ~:)R%[`\u0019\u0004P\u0011hBgo\u0007G@)q*la", "5dc\u000ea+&S\u0015\r\u000bk,", "5dc\u000ea+&S\u0015\r\u000bk,DS5L\f\u0005\bR", "uH9u?(GR&\t~]?F\u00079m\u000b2\n@J\u0018!Wx\r8\u0006)?bG'3\u0003*w4?P\u007f\u001b\"#wI9\u0003q<[v&+[N42", ":`]2", "AoP;", "5dc\u000ea+&S\u0015\r\u000bk,DP2Bo+\u0007>", "uH8\u0016=o%O\"}\bh0{\u001cxc\n0\u0007J\u000f\u0017`Hy\u001eEu!D]\b)\u0001t\u0012Ca\r\"gI2{loHnc(\\\u00074GK2;\\ZH", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class LazyListMeasuredItemProvider implements LazyLayoutMeasuredItemProvider<LazyListMeasuredItem> {
    public static final int $stable = 0;
    private final long childConstraints;
    private final LazyListItemProvider itemProvider;
    private final LazyLayoutMeasureScope measureScope;

    public /* synthetic */ LazyListMeasuredItemProvider(long j2, boolean z2, LazyListItemProvider lazyListItemProvider, LazyLayoutMeasureScope lazyLayoutMeasureScope, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, z2, lazyListItemProvider, lazyLayoutMeasureScope);
    }

    /* JADX INFO: renamed from: createItem-X9ElhV4 */
    public abstract LazyListMeasuredItem mo1121createItemX9ElhV4(int i2, Object obj, Object obj2, List<? extends Placeable> list, long j2);

    private LazyListMeasuredItemProvider(long j2, boolean z2, LazyListItemProvider lazyListItemProvider, LazyLayoutMeasureScope lazyLayoutMeasureScope) {
        this.itemProvider = lazyListItemProvider;
        this.measureScope = lazyLayoutMeasureScope;
        this.childConstraints = ConstraintsKt.Constraints$default(0, z2 ? Constraints.m6591getMaxWidthimpl(j2) : Integer.MAX_VALUE, 0, z2 ? Integer.MAX_VALUE : Constraints.m6590getMaxHeightimpl(j2), 5, null);
    }

    /* JADX INFO: renamed from: getChildConstraints-msEJaDk, reason: not valid java name */
    public final long m1134getChildConstraintsmsEJaDk() {
        return this.childConstraints;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider
    /* JADX INFO: renamed from: getAndMeasure--hBUhpc, reason: not valid java name */
    public LazyListMeasuredItem mo1132getAndMeasurehBUhpc(int i2, int i3, int i4, long j2) {
        return m1133getAndMeasure0kLqBqw(i2, j2);
    }

    /* JADX INFO: renamed from: getAndMeasure-0kLqBqw$default, reason: not valid java name */
    public static /* synthetic */ LazyListMeasuredItem m1131getAndMeasure0kLqBqw$default(LazyListMeasuredItemProvider lazyListMeasuredItemProvider, int i2, long j2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAndMeasure-0kLqBqw");
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            j2 = lazyListMeasuredItemProvider.childConstraints;
        }
        return lazyListMeasuredItemProvider.m1133getAndMeasure0kLqBqw(i2, j2);
    }

    /* JADX INFO: renamed from: getAndMeasure-0kLqBqw, reason: not valid java name */
    public final LazyListMeasuredItem m1133getAndMeasure0kLqBqw(int i2, long j2) {
        return mo1121createItemX9ElhV4(i2, this.itemProvider.getKey(i2), this.itemProvider.getContentType(i2), this.measureScope.mo1189measure0kLqBqw(i2, j2), j2);
    }

    public final LazyLayoutKeyIndexMap getKeyIndexMap() {
        return this.itemProvider.getKeyIndexMap();
    }
}
