package androidx.compose.foundation.text.selection;

import androidx.collection.LongIntMapKt;
import androidx.collection.MutableLongIntMap;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
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
/* JADX INFO: compiled from: SelectionLayout.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яh\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007fјnjG9L͜P.hS2şs{J$c$\u007fJCU0}*\tUSog|Pb\u000bI\u000f\u000e\u0016\u0007\n4Ikxe\u0012\u00157JoU3UoC<htL\u0005(2(<\u0002\u0005\u0017\u001a2Ϻ\u0018v\u0011CS\f\u00183F\u0081Pĥ=M3\u0019RKN$\u000f\u001etg|7Xpk<G#1jRR5bH|{\u0011VX5\u0012\u000faL1P=C\u001c=U\u0019\u0006\u0001cO\u0017MzU\u0015x)7+w~\u0006@A\u0006$\u0017;O;hQ2ػ\tQn\u0019ow]\u0006cP<@(~\n0T\u0004<\u0011WL<Q2f6\"cx\u0001xXP0\u0005r\u0004\t\tN\u0017S&c/GC~Q\u0010OIRE%\u001d\rLI1r/\u0006l\u000e\u000f;KX\u0006|IQnQxR\u0018\u0006Um2\u001e+\u000682HG.^D/<G=7\nMS%y3`D\u0016\u000b5dv\u0006\u0002RvfRr$jB\t:\u0001\u000bdUz^Wp,?QɟX\r\u0006ܱ+\"b\u0006J0u'\\O\u0001i\u0019NУ\tɘĽe6֍rs\u0016WGpK7Ws\u001er#\u0003\"RTb3l=̾_۱^\\0ί\u0003Tx%\u0010{rbbƑ>Ɛu\u001c<ι\u0002+j+`\t.DQ|7w\t\u007ffкVտ(\u0003q˅E\u0018\u000fUtp\u001em֑M2\u0005ʠ:/GVC2vl0jL|Q\bӡrÒűfKܤPt\u001euc\u000e8\u0018 S_@\u000e$\u001d\u0006A4\u0018,sTȌiWUȼ?|\u0003\u0015\u001dW9Mu\u0011\u0003\u0001<bzJ}_E,_d\u0003%\u0018d.\u0005@RیKi\\ެs@O\u0010\u0011w\rZF\u001c\u001d\u001fLEWǾ$Ŀ9-Kگm\"\u00065G\u0015\u0010q@۳:ԃf\u000f.۩Є\u00045k\u0019u͇m\f1C8Ox̃BV"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r0X\u007f\u000eC`X<k/\u0003A\u001b\u0011Z\u001b$", "", "1ta?X5M>#\r~m0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", ">qTC\\6Na{z\u0004]3|s9s\u00047\u007fJ\n", "1n]AT0GS&\\\u0005h9{\r8a\u000f(\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/\u0015w ;LGDgC\u001e#>", "7rBAT9M6\u0015\bye,", "", ">qTC\\6Na\u0007~\u0002^*\f\r9n", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r0X\u007f|", "Ad[2V;:P ~^]\u0016\n\b/r\u00041}\u001e\u000b\u001f\"C|\nK\u00012", "\u001aiPCTuNb\u001d\u0006D<6\u0005\u0014+r{7\u0006MV", "", "\u001aj^A_0G\u001dv\t\u0003i(\n\u0005>o\r}", "uI9\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`Nk\"F\u00074~@y4A}%\fWMHj8'\u0011waG\\X\u0013J\u007f&TVR+o\u001cpG\u001c\u001dd\u001cNt\u000e\u000fiJ#jS;)\u0011uX\u0002NwJ\u001a\u0016\u00155h\u007fF`\u0019\u0011g\u0015|A'wJchO.FAs&.\u001cn!c\u0004\u0018.\u001c|\u0015(d_8\u0017Q:\u0017|a\u0001kp\u0011\u001e\f@mBvjFRxQC>\u0006\u001fLw\b\u0019A6~4\u0003<\u0011D(En\u00123c%D^\u0006joM", "5dc\u0010b5MO\u001d\bzk\n\u0007\u0013<d\u00041wO\u0001%", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n\u001cU\u0012*G|s8WP:o=\u001a$ho\u000f", "5dc\u0010h9KS\"\u000eeh:\u0001\u00183o\to\\\f^fs9:", "u(9", "\u0018", "1ta?X5MA \t\n", "", "3mS _6M", "7mU<?0Lb", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r(K}'+UO62", "u(I", "5dc\u001de,OW#\u000f\tA(\u0006\b6ej2\nD\u0010\u001b!P7n\bTt\u0012KH", "5dc\u001de,OW#\u000f\tL,\u0004\t-t\u00042\u0005", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7$.TC9z8(\u001e2O9\u000ec*]z1P\"", "5dc X3>Q(zwe,`\b\u0019r~(\tD\n\u0019tQw\u00198\u0004!Dc\u000b", "u(;7T=:\u001d)\u000e~euZ\u00137p{5wO\u000b$l", "Ad[2V;:P ~^]\u001b\u0007l8f\n\u000f\u007fN\u0010z Fo!", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<]/>[a)FU\u00129#", "AsP?g\u001aE](", "/o_2a+\"\\\u001a\t", "Ad[2V;:P ~^]", "@`f g(Kb{z\u0004]3|r0f\u000e(\u000b", "AsP?g\u001f!O\"}\u0002^\u000b\u0001\u0016/c\u000f,\u0006I", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=gsln9\u0005r0X\u007f|", "AsP?g !O\"}\u0002^\u000b\u0001\u0016/c\u000f,\u0006I", "@`f\u0012a+!O\"}\u0002^\u0016}\n=e\u000f", "3mS%;(GR ~Yb9|\u0007>i\n1", "3mS&;(GR ~Yb9|\u0007>i\n1", "@`f\u001de,OW#\u000f\tA(\u0006\b6ei)|N\u0001&", "BdgA?(R])\u000eg^:\r\u0010>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u001cU\u0012*G|\u0003.[SBz\n", "0tX9W", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r0X\u007f\u000eC`X<k(", "CoS.g,,Z#\u000e", "Ak^A", "FO^@\\;B]\"]~k,z\u00183o\t", "GO^@\\;B]\"]~k,z\u00183o\t", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SelectionLayoutBuilder {
    public static final int $stable = 8;
    private final LayoutCoordinates containerCoordinates;
    private final long currentPosition;
    private int currentSlot;
    private int endSlot;
    private final List<SelectableInfo> infoList;
    private final boolean isStartHandle;
    private final long previousHandlePosition;
    private final Selection previousSelection;
    private final Comparator<Long> selectableIdOrderingComparator;
    private final MutableLongIntMap selectableIdToInfoListIndex;
    private int startSlot;

    /* JADX INFO: compiled from: SelectionLayout.kt */
    /* JADX INFO: loaded from: classes.dex */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Direction.values().length];
            try {
                iArr[Direction.BEFORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Direction.ON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Direction.AFTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ SelectionLayoutBuilder(long j2, long j3, LayoutCoordinates layoutCoordinates, boolean z2, Selection selection, Comparator comparator, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, layoutCoordinates, z2, selection, comparator);
    }

    private SelectionLayoutBuilder(long j2, long j3, LayoutCoordinates layoutCoordinates, boolean z2, Selection selection, Comparator<Long> comparator) {
        this.currentPosition = j2;
        this.previousHandlePosition = j3;
        this.containerCoordinates = layoutCoordinates;
        this.isStartHandle = z2;
        this.previousSelection = selection;
        this.selectableIdOrderingComparator = comparator;
        this.selectableIdToInfoListIndex = LongIntMapKt.mutableLongIntMapOf();
        this.infoList = new ArrayList();
        this.startSlot = -1;
        this.endSlot = -1;
        this.currentSlot = -1;
    }

    /* JADX INFO: renamed from: getCurrentPosition-F1C5BW0, reason: not valid java name */
    public final long m1682getCurrentPositionF1C5BW0() {
        return this.currentPosition;
    }

    /* JADX INFO: renamed from: getPreviousHandlePosition-F1C5BW0, reason: not valid java name */
    public final long m1683getPreviousHandlePositionF1C5BW0() {
        return this.previousHandlePosition;
    }

    public final LayoutCoordinates getContainerCoordinates() {
        return this.containerCoordinates;
    }

    public final boolean isStartHandle() {
        return this.isStartHandle;
    }

    public final Selection getPreviousSelection() {
        return this.previousSelection;
    }

    public final Comparator<Long> getSelectableIdOrderingComparator() {
        return this.selectableIdOrderingComparator;
    }

    public final SelectionLayout build() {
        int i2 = this.currentSlot + 1;
        int size = this.infoList.size();
        if (size == 0) {
            throw new IllegalStateException("SelectionLayout must not be empty.");
        }
        if (size == 1) {
            SelectableInfo selectableInfo = (SelectableInfo) CollectionsKt.single((List) this.infoList);
            int i3 = this.startSlot;
            if (i3 == -1) {
                i3 = i2;
            }
            int i4 = this.endSlot;
            if (i4 != -1) {
                i2 = i4;
            }
            return new SingleSelectionLayout(this.isStartHandle, i3, i2, this.previousSelection, selectableInfo);
        }
        MutableLongIntMap mutableLongIntMap = this.selectableIdToInfoListIndex;
        List<SelectableInfo> list = this.infoList;
        int i5 = this.startSlot;
        if (i5 == -1) {
            i5 = i2;
        }
        int i6 = this.endSlot;
        if (i6 != -1) {
            i2 = i6;
        }
        return new MultiSelectionLayout(mutableLongIntMap, list, i5, i2, this.isStartHandle, this.previousSelection);
    }

    public final SelectableInfo appendInfo(long j2, int i2, Direction direction, Direction direction2, int i3, Direction direction3, Direction direction4, int i4, TextLayoutResult textLayoutResult) {
        this.currentSlot += 2;
        SelectableInfo selectableInfo = new SelectableInfo(j2, this.currentSlot, i2, i3, i4, textLayoutResult);
        this.startSlot = updateSlot(this.startSlot, direction, direction2);
        this.endSlot = updateSlot(this.endSlot, direction3, direction4);
        this.selectableIdToInfoListIndex.set(j2, this.infoList.size());
        this.infoList.add(selectableInfo);
        return selectableInfo;
    }

    private final int updateSlot(int i2, Direction direction, Direction direction2) {
        if (i2 != -1) {
            return i2;
        }
        int i3 = WhenMappings.$EnumSwitchMapping$0[SelectionLayoutKt.resolve2dDirection(direction, direction2).ordinal()];
        if (i3 == 1) {
            return this.currentSlot - 1;
        }
        if (i3 == 2) {
            return this.currentSlot;
        }
        if (i3 == 3) {
            return i2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
