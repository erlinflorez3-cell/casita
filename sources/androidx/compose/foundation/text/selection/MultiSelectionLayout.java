package androidx.compose.foundation.text.selection;

import androidx.collection.LongIntMap;
import androidx.collection.LongObjectMap;
import androidx.collection.LongObjectMapKt;
import androidx.collection.MutableLongObjectMap;
import androidx.compose.foundation.text.selection.Selection;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: SelectionLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яf\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\r@4\u0012\u000e\u0007nʑA0RkP.XS2\u000fy\u0005<řc$\bCCU }*\teNogtbb\u000bY\u000f\u000e\u0016~j4Icxe܈\u00172XoG3SoE9n{>\u0005&9*8\b\u0011\tɝ2H&v\u0003CQ\u000e\u00180V\u0081jR;LEU\"\nL \u0019\u001e\u000bh^@Vnu@?%\u0013ipRUb@\u0001[\u0012^TU\u0013\u0007e,2X7c\u001b5W\u0011\u000fj[m\fOwK\u000f\u0001)=*w~ɱ:X\u000e ]?]5ux6^\u0015Q\u000f\u0017UT\u007fgYz&(&\u0006B!\u0005\u001e\u001c1?H\\YJv\u0016;K\u0001\u0003UPP0bR\u0002\u000badCS.y?\u0002)t\u0001y;GTg\u007f\u0013=6#/ g[\u001d\u001cnG3T&ZaUNp`N8ԯ\u0004mL\u0001p6B\u0004^P05\nDF\u0019;6\n8i54\u0018Vy\u007fv3f\u0019Ww\t`@PtF;8@$ZrmKk\u0019jfd)MJZ7\u0002\u0016I8\\&BQ)\u001e\bgh\u0018s\u0014]R+=!OY\u001d'Tk\u0002\u000fAqic>\u000ez|$ALb3c\u0015\u007f\u0004\u0010h\u0007@\"`S\u001b\u0014\u0006:\\N:\u0017bC\u007f[L,_\u001f\r\u0019VC6Bo\u0003O_+z\u001e\fl3R\u0011 xKվ\u0003˩`t\bi~X:\r14;Ri5G*\fv?ث~ɠ\u000b\u0003\f\u0002MyZZ\u001d~$\nm{N\u001aP\u000e(Ȕ?т\u0013\u0003A4\bBS_Cw_T*')\u0003Pӏ=ÿ2m\u0010ξ\t.f\u0001Xf%)0\u000fvrQ\f\u001bTPӪHیKgl\raWW\u0006SnJPP\u0003\u0015!.%/sP\u007fީ1I/ݴ.y\u001aI#|.{}6\u0012b=/KИ\u0006Нg\u001cw̥i_8CFe*\u0011L?<l1F~?NٻDީ8\u0011KJG\u0003~i\ta\u00199\u0016h\u001d+;{-݁<݇s\u0004<ʝw,yb\f4/R3\u0011eS\u0016nߑOb\u0013ͧ'\f\u0011\u001d?\u0011b.KCnW\u0011\u000ffZJ͏8װ?f\u001d>\u000fHBC\r\u001a\u0019hli4\u00141T\u001d݁\u0011ł6F\f=\\4b\f-hV\nxE\u000f'\u0001ܗ\u0001ܓ7$\u0001߶I\u0007smbFқ6B"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g|xhH\u000bQ,Uv%VPX5CN\u0007G$!0", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r0X\u007f\u000eC`X<k(", "Ad[2V;:P ~^]\u001b\u0007l8f\n\u000f\u007fN\u0010z Fo!", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\ng! IS\u0017K^!@/", "7mU<?0Lb", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r(K}'+UO62", "AsP?g\u001aE](", "", "3mS _6M", "7rBAT9M6\u0015\bye,", "", ">qTC\\6Na\u0007~\u0002^*\f\r9n", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r0X\u007f|", "uKP;W9HW\u0018\u0012D\\6\u0004\u0010/c\u000f,\u0006IJ}!PqqE\u0006\r1dS\u0007<i'*\u0017SJo;g{loH\\G\u0010C]#PK[6`Q\u0006\u0007\u0012\u001cb\u0019X9\rNZK4wC3.\f6RKJh\u0014\u001b_\u001c5qp@e\u0014Q\u0003^cA0hDhc\u0004P\u0017\tS", "1q^@f\u001aMO(\u000f\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=grukG\u0015Q;J\u00067U\"", "5dc\u0010e6La\u0007\u000evm<\u000b", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7$.TC9z8(\u001e2?F\u0011q:<\u0006#V\\\\\u0002", "1ta?X5M7\"\u007f\u0005", "5dc\u0010h9KS\"\u000e^g-\u0007", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7$.TC9z8(\u001e2O9\u000ec*]r$NL25]\\H", "3mS\u0016a-H", "5dc\u0012a+\"\\\u001a\t", "5dc\u0012a+,Z#\u000e", "u(8", "4ha@g\u0010GT#", "5dc\u0013\\9Lb|\b{h", "5dc\u0016a-H:\u001d\r\n", "u(;7T=:\u001d)\u000e~euc\r=tU", "u(I", ":`bA<5?]", "5dc\u0019T:M7\"\u007f\u0005", "5dc\u001de,OW#\u000f\tL,\u0004\t-t\u00042\u0005", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7$.TC9z8(\u001e2O9\u000ec*]z1P\"", "5dc X3>Q(zwe,`\b\u001eoc1|Jg\u001b%VS\u0017;v8", "u(;.a+K]\u001d}\u000e(*\u0007\u00106e}7\u007fJ\n`}Qx\u0010 \u007f4\u001dU\tu", "Ahi2", "5dc \\A>", "AsP?g\u0010GT#", "5dc g(Kb|\b{h", "5dc g(Kb\u0007\u0006\u0005m", "1qT.g,,c\u0016lze,z\u00183o\t6", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\ng! IY\u000bAv#DAy+\r", "Ad[2V;B]\"", "4na\u0012T*A;\u001d}ye,`\u00120o", "", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "5dc\u0016a-H:\u001d\r\nB5{\tBB\u0014\u0016{G\u0001\u0015&Cl\u0015<Z$", "7c", "", "Ag^B_+\u001a\\-b\u0004_6i\t-o\b3\fO\u0001\u0005\u0017No\fKz/>", "=sW2e", "Ag^B_++S\u0017\t\u0003i<\f\t\u001de\u0007(yO\u0005! ", "Ak^AG6\"\\\u0018~\u000e", "Ak^A", "7r<6a0Fc!l\u0002h;", "AsP?g\u0016K3\"}he6\fw9I\t'{S", "7rBAT9MA \t\n", "BnBAe0GU", "", "1qT.g,\u001a\\\u0018i\u000bm\u001a\r\u0006\u001de\u0007(yO\u0005! ", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<]/>[g\u001d<m\u0014=5?FA", "7mU<", ";h]\u001cY-LS(", ";`g\u001cY-LS(", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class MultiSelectionLayout implements SelectionLayout {
    private final int endSlot;
    private final List<SelectableInfo> infoList;
    private final boolean isStartHandle;
    private final Selection previousSelection;
    private final LongIntMap selectableIdToInfoListIndex;
    private final int startSlot;

    /* JADX INFO: compiled from: SelectionLayout.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CrossStatus.values().length];
            try {
                iArr[CrossStatus.COLLAPSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CrossStatus.NOT_CROSSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CrossStatus.CROSSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MultiSelectionLayout(LongIntMap longIntMap, List<SelectableInfo> list, int i2, int i3, boolean z2, Selection selection) {
        this.selectableIdToInfoListIndex = longIntMap;
        this.infoList = list;
        this.startSlot = i2;
        this.endSlot = i3;
        this.isStartHandle = z2;
        this.previousSelection = selection;
        if (list.size() <= 1) {
            throw new IllegalStateException(("MultiSelectionLayout requires an infoList size greater than 1, was " + list.size() + '.').toString());
        }
    }

    public final LongIntMap getSelectableIdToInfoListIndex() {
        return this.selectableIdToInfoListIndex;
    }

    public final List<SelectableInfo> getInfoList() {
        return this.infoList;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public int getStartSlot() {
        return this.startSlot;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public int getEndSlot() {
        return this.endSlot;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public boolean isStartHandle() {
        return this.isStartHandle;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public Selection getPreviousSelection() {
        return this.previousSelection;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public int getSize() {
        return this.infoList.size();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public CrossStatus getCrossStatus() {
        return getStartSlot() < getEndSlot() ? CrossStatus.NOT_CROSSED : getStartSlot() > getEndSlot() ? CrossStatus.CROSSED : this.infoList.get(getStartSlot() / 2).getRawCrossStatus();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public SelectableInfo getStartInfo() {
        return this.infoList.get(startOrEndSlotToIndex(getStartSlot(), true));
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public SelectableInfo getEndInfo() {
        return this.infoList.get(startOrEndSlotToIndex(getEndSlot(), false));
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public SelectableInfo getCurrentInfo() {
        return isStartHandle() ? getStartInfo() : getEndInfo();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public SelectableInfo getFirstInfo() {
        return getCrossStatus() == CrossStatus.CROSSED ? getEndInfo() : getStartInfo();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public SelectableInfo getLastInfo() {
        return getCrossStatus() == CrossStatus.CROSSED ? getStartInfo() : getEndInfo();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public void forEachMiddleInfo(Function1<? super SelectableInfo, Unit> function1) {
        int infoListIndexBySelectableId = getInfoListIndexBySelectableId(getFirstInfo().getSelectableId());
        int infoListIndexBySelectableId2 = getInfoListIndexBySelectableId(getLastInfo().getSelectableId());
        int i2 = infoListIndexBySelectableId + 1;
        if (i2 >= infoListIndexBySelectableId2) {
            return;
        }
        while (i2 < infoListIndexBySelectableId2) {
            function1.invoke(this.infoList.get(i2));
            i2++;
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public boolean shouldRecomputeSelection(SelectionLayout selectionLayout) {
        if (getPreviousSelection() != null && selectionLayout != null && (selectionLayout instanceof MultiSelectionLayout)) {
            MultiSelectionLayout multiSelectionLayout = (MultiSelectionLayout) selectionLayout;
            if (isStartHandle() == multiSelectionLayout.isStartHandle() && getStartSlot() == multiSelectionLayout.getStartSlot() && getEndSlot() == multiSelectionLayout.getEndSlot() && !shouldAnyInfoRecomputeSelection(multiSelectionLayout)) {
                return false;
            }
        }
        return true;
    }

    private final boolean shouldAnyInfoRecomputeSelection(MultiSelectionLayout multiSelectionLayout) {
        if (getSize() != multiSelectionLayout.getSize()) {
            return true;
        }
        int size = this.infoList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.infoList.get(i2).shouldRecomputeSelection(multiSelectionLayout.infoList.get(i2))) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public LongObjectMap<Selection> createSubSelections(final Selection selection) {
        Selection.AnchorInfo start;
        Selection.AnchorInfo end;
        if (selection.getStart().getSelectableId() == selection.getEnd().getSelectableId()) {
            if ((selection.getHandlesCrossed() && selection.getStart().getOffset() >= selection.getEnd().getOffset()) || (!selection.getHandlesCrossed() && selection.getStart().getOffset() <= selection.getEnd().getOffset())) {
                return LongObjectMapKt.longObjectMapOf(selection.getStart().getSelectableId(), selection);
            }
            throw new IllegalStateException(("unexpectedly miss-crossed selection: " + selection).toString());
        }
        final MutableLongObjectMap<Selection> mutableLongObjectMapMutableLongObjectMapOf = LongObjectMapKt.mutableLongObjectMapOf();
        if (selection.getHandlesCrossed()) {
            start = selection.getEnd();
        } else {
            start = selection.getStart();
        }
        createAndPutSubSelection(mutableLongObjectMapMutableLongObjectMapOf, selection, getFirstInfo(), start.getOffset(), getFirstInfo().getTextLength());
        forEachMiddleInfo(new Function1<SelectableInfo, Unit>() { // from class: androidx.compose.foundation.text.selection.MultiSelectionLayout$createSubSelections$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SelectableInfo selectableInfo) {
                invoke2(selectableInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SelectableInfo selectableInfo) {
                this.this$0.createAndPutSubSelection(mutableLongObjectMapMutableLongObjectMapOf, selection, selectableInfo, 0, selectableInfo.getTextLength());
            }
        });
        if (selection.getHandlesCrossed()) {
            end = selection.getStart();
        } else {
            end = selection.getEnd();
        }
        createAndPutSubSelection(mutableLongObjectMapMutableLongObjectMapOf, selection, getLastInfo(), 0, end.getOffset());
        return mutableLongObjectMapMutableLongObjectMapOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createAndPutSubSelection(MutableLongObjectMap<Selection> mutableLongObjectMap, Selection selection, SelectableInfo selectableInfo, int i2, int i3) {
        Selection selectionMakeSingleLayoutSelection;
        if (selection.getHandlesCrossed()) {
            selectionMakeSingleLayoutSelection = selectableInfo.makeSingleLayoutSelection(i3, i2);
        } else {
            selectionMakeSingleLayoutSelection = selectableInfo.makeSingleLayoutSelection(i2, i3);
        }
        if (i2 > i3) {
            throw new IllegalStateException(("minOffset should be less than or equal to maxOffset: " + selectionMakeSingleLayoutSelection).toString());
        }
        mutableLongObjectMap.put(selectableInfo.getSelectableId(), selectionMakeSingleLayoutSelection);
    }

    public String toString() {
        boolean z2 = true;
        float f2 = 2;
        StringBuilder sbAppend = new StringBuilder("MultiSelectionLayout(isStartHandle=").append(isStartHandle()).append(", startPosition=").append((getStartSlot() + 1) / f2).append(", endPosition=").append((getEndSlot() + 1) / f2).append(", crossed=").append(getCrossStatus()).append(", infos=");
        StringBuilder sb = new StringBuilder("[\n\t");
        List<SelectableInfo> list = this.infoList;
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            SelectableInfo selectableInfo = list.get(i2);
            if (z2) {
                z2 = false;
            } else {
                sb.append(",\n\t");
            }
            i2++;
            sb.append(i2 + " -> " + selectableInfo);
        }
        sb.append("\n]");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return sbAppend.append(string).append(')').toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int startOrEndSlotToIndex(int r4, boolean r5) {
        /*
            r3 = this;
            androidx.compose.foundation.text.selection.CrossStatus r0 = r3.getCrossStatus()
            int[] r1 = androidx.compose.foundation.text.selection.MultiSelectionLayout.WhenMappings.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r2 = r1[r0]
            r1 = 1
            if (r2 == r1) goto L17
            r0 = 2
            if (r2 == r0) goto L18
            r0 = 3
            if (r2 != r0) goto L1f
            if (r5 != 0) goto L1d
        L17:
            r5 = r1
        L18:
            int r0 = r3.slotToIndex(r4, r5)
            return r0
        L1d:
            r5 = 0
            goto L18
        L1f:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.MultiSelectionLayout.startOrEndSlotToIndex(int, boolean):int");
    }

    private final int slotToIndex(int i2, boolean z2) {
        return (i2 - (!z2 ? 1 : 0)) / 2;
    }

    private final int getInfoListIndexBySelectableId(long j2) {
        try {
            return this.selectableIdToInfoListIndex.get(j2);
        } catch (NoSuchElementException e2) {
            throw new IllegalStateException("Invalid selectableId: " + j2, e2);
        }
    }
}
