package androidx.compose.foundation.lazy.grid;

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
/* JADX INFO: compiled from: LazyGridMeasuredLine.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eӵLш|\u0004O\f8é6B\r14\u0012\u000e\u0007nʑA0ZeP\u008cZS8-s{J$cҕyCI^\"}(\u0019UȞ}˧\u001fJ\t\n\u0004N\u0016\u001a\u0007jDI\u0004ym\u001c\u001d4ZuO5]ok=\u000fwF\t.7:8(\u000b\u0011$8O(|\u000bE[\f@9nxJV\u001bW\u001d\u001a@\u0011N$\u000f*tg|7Ղp]H<k\u0007wYf'\u000e;Et\u001b^l-\u001dxq\u001eYDe8E)a\u001c\u001fR\n@3C\u007fW\u001dhU([M\u0002rNX.\u0015Ʀ/O\u001byC5j\u0005i`:(˦SiSִ&*}\t\n\u001c\r\u0010\u001c\u0010?H\\8pǔ\nԧ7tzԟ\u0011g\u0010`Z\u0006\u000bcF\u0017S\u0004a.ݰ\u001fnYaI+f9\u0002\u0015\u001b/s\u0010|4sT<aڠ\u001fZ\u007f\u0383ISFQV]ZhK\u0003\u001cp\u0011\u0003ò\b6OĉG}\u0017D%4\bgG/9k0I\u001bϜxݶdh[֟#TN'\u0007\u0016e0_ȴ\\ֈh\u0005s¬%j:\u0018e\"d\t\u000e\bA)\u000b\u007f\u0013Ɯ'ŎROpȉҽQz"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`!\u0007_:^\u0004'F3R5\\(", "", "7mS2k", "", "7sT:f", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`!\u0007_:^\u0004'F0],d(", "Ak^Af", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`'\u000em;\\L", "AoP;f", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017%Ho3\u0002$hi'\u0012_5$", "7rE2e;BQ\u0015\u0006", "", ";`X;4?Ba\u0007\nv\\0\u0006\u000b", "uHJ\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0002!'Pn\nKz/>#\u0005\u001cL\u0002_0ZG:5\u001b\u001a*|CF\u000bb\u0014Nr5WYN+@arEixV\u0017M8\u0017\tXTmlN?*\u0012:IK<r\u0011\u0015\u0015\nDnzK \u0017C\u000f)?C6lE#Fu\\U'o.cyf'kH\u0010\u000b\u0019m*\u00172`=\u000e\u0003\u001dwv`\t=\\+\\k", "5dc\u0016a+>f", "u(8", "5dc\u0016g,Fa", "u(J\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0002!'Pn\nKz/>#\u0005\u001cL\u0002_0ZG:5\u001b\u001a*|CF\u000bb\u0014Nr5WYN+@arEi", ")KP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001o#2L\r\"gI2vue8nc(\\\u00074GK2;\\ZH", ";`X;4?Ba\u0007\u0003\u0010^", "5dc\u001aT0G/,\u0003\tL0\u0012\t", ";`X;4?Ba\u0007\u0003\u0010^\u001e\u0001\u00182S\u000b$yD\n\u0019%", "5dc\u001aT0G/,\u0003\tL0\u0012\t!i\u000f+iK|\u0015\u001bPq\u001c", "7r4:c;R", ">nb6g0H\\", "=eU@X;", ":`h<h;0W\u0018\u000e}", ":`h<h;!S\u001d\u0001}m", "uH8\u0016\u001c\"%O\"}\bh0{\u001cxc\n0\u0007J\u000f\u0017`Hy\u001eEu!D]\b)\u0001t\u0012Ca\r=x8\u001d^O]N\u001bE9Ru\u000fGH\\<iRq!#\u0012bc", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LazyGridMeasuredLine {
    public static final int $stable = 8;
    private final int index;
    private final boolean isVertical;
    private final LazyGridMeasuredItem[] items;
    private final int mainAxisSize;
    private final int mainAxisSizeWithSpacings;
    private final int mainAxisSpacing;
    private final LazyGridSlots slots;
    private final List<GridItemSpan> spans;

    public LazyGridMeasuredLine(int i2, LazyGridMeasuredItem[] lazyGridMeasuredItemArr, LazyGridSlots lazyGridSlots, List<GridItemSpan> list, boolean z2, int i3) {
        this.index = i2;
        this.items = lazyGridMeasuredItemArr;
        this.slots = lazyGridSlots;
        this.spans = list;
        this.isVertical = z2;
        this.mainAxisSpacing = i3;
        int iMax = 0;
        for (LazyGridMeasuredItem lazyGridMeasuredItem : lazyGridMeasuredItemArr) {
            iMax = Math.max(iMax, lazyGridMeasuredItem.getMainAxisSize());
        }
        this.mainAxisSize = iMax;
        this.mainAxisSizeWithSpacings = RangesKt.coerceAtLeast(iMax + this.mainAxisSpacing, 0);
    }

    public final int getIndex() {
        return this.index;
    }

    public final LazyGridMeasuredItem[] getItems() {
        return this.items;
    }

    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    public final int getMainAxisSizeWithSpacings() {
        return this.mainAxisSizeWithSpacings;
    }

    public final boolean isEmpty() {
        return this.items.length == 0;
    }

    public final LazyGridMeasuredItem[] position(int i2, int i3, int i4) {
        LazyGridMeasuredItem[] lazyGridMeasuredItemArr = this.items;
        int length = lazyGridMeasuredItemArr.length;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i5 < length) {
            LazyGridMeasuredItem lazyGridMeasuredItem = lazyGridMeasuredItemArr[i5];
            int i8 = i6 + 1;
            int iM1141getCurrentLineSpanimpl = GridItemSpan.m1141getCurrentLineSpanimpl(this.spans.get(i6).m1144unboximpl());
            int i9 = this.slots.getPositions()[i7];
            boolean z2 = this.isVertical;
            lazyGridMeasuredItem.position(i2, i9, i3, i4, z2 ? this.index : i7, z2 ? i7 : this.index);
            Unit unit = Unit.INSTANCE;
            i7 += iM1141getCurrentLineSpanimpl;
            i5++;
            i6 = i8;
        }
        return this.items;
    }
}
