package androidx.compose.foundation.text.selection;

import androidx.collection.LongObjectMap;
import androidx.collection.LongObjectMapKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: compiled from: SelectionLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯN\u001d<K!&i\u0016DLш|\u0004O\u000f8é6B\r(4\u0012}\u0007njO0L͜P.hS2\u000fq{<$q$yCAi\"}8\tWNmgvJh\u000bKƤ\u000e\u0016\u000fj4I[ye\u0012\u001d>JoE3SoSʠ~!f\u0005N1Z7&E.*.V\u0010\u000fzqL\u001c\u0016>B\t:\u0001\u0010]\t(\u0016\u001e>N\u0004.buSNJ\u0003\\h53\u0007wIf'\u000e8ƊQ\rT]o!\u0005\u000361P9E\u0015SY1)\u0003_M&Wqk\u000b/;oEW\u0018o6\u0007%D%9u%i\u0003(l\u0005\u007fh\u001c);O\u0012p~5n\fC\f\u001bd\u001c\u000e4(x4;C~\n$2#q\u001aT\u0019\bll\u0018z\u0010a]9PE9C3f\u007flqm%Ѱ}˿\u0011\";\u0003t-ia^r#)lw\u007f9\b\u0015\u0014ˇP̆]A\u0006\u0006vq\u0010:TBU\u0011G{?6My\u000eٚ;؝%o\u001aJJy\u0005\u00151zamjHn%Eނ9Ҋ\r\u0012bե|\u0007qcbl|#[1l\u0007,\u0010It3ʓ>Ƽ)\u0014fQn\u007fx].\u001636~7\bvBސYߍb3=ȡ4\"oR\u000f\u0014m=9ۊZڋFY\u0014ȗt*(2V\u0002`\n\n\\f\fA:uFrِ.֞\u001d`-J\t7PQM\u001dm_\u0001\u0012\u0015Sa*YȄ&ڲ\r\u0007Xʔ\tqm\u0013WGMr0IYQc\u001c\\*xג6č'\u000b\u0017u\u0006du`\u0018^z4\u000eU*(Ln\u0010֮1ˮ\u0017\u0013\u0017+8!;U\u001d\u0005sSe\u0012U}SɁ\u0011³l4oō\u0003r2\u0001x^\u05cbXD"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003lj;\u000ec\u001aN}'E[R6e9nQ\u001e\"ic", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r0X\u007f\u000eC`X<k(", "7rBAT9M6\u0015\bye,", "", "AsP?g\u001aE](", "", "3mS _6M", ">qTC\\6Na\u0007~\u0002^*\f\r9n", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r0X\u007f|", "7mU<", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r(K}'+UO62", "uY8\u0016?(GR&\t~]?F\u00079m\u000b2\n@J\u0018!Wx\r8\u0006)?bG/7\u0001%w[CBk2-\u0019rj\u0003tc3Nt6KVW\u0002CN{<!\u001c^\rat\u000b\u000faL.|D\u0001 \u0012<R\u00017w\u0005\u0016\u001fWDj\u0004Q \u001eG\u0001\u0015sP-rO#MyNACq&a\u0013_\u0001e;DyWb", "1q^@f\u001aMO(\u000f\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=grukG\u0015Q;J\u00067U\"", "5dc\u0010e6La\u0007\u000evm<\u000b", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7$.TC9z8(\u001e2?F\u0011q:<\u0006#V\\\\\u0002", "1ta?X5M7\"\u007f\u0005", "5dc\u0010h9KS\"\u000e^g-\u0007", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7$.TC9z8(\u001e2O9\u000ec*]r$NL25]\\H", "3mS\u0016a-H", "5dc\u0012a+\"\\\u001a\t", "5dc\u0012a+,Z#\u000e", "u(8", "4ha@g\u0010GT#", "5dc\u0013\\9Lb|\b{h", "u(I", ":`bA<5?]", "5dc\u0019T:M7\"\u007f\u0005", "5dc\u001de,OW#\u000f\tL,\u0004\t-t\u00042\u0005", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7$.TC9z8(\u001e2O9\u000ec*]z1P\"", "Ahi2", "5dc \\A>", "AsP?g\u0010GT#", "5dc g(Kb|\b{h", "5dc g(Kb\u0007\u0006\u0005m", "1qT.g,,c\u0016lze,z\u00183o\t6", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\ng! IY\u000bAv#DAy+\r", "Ad[2V;B]\"", "4na\u0012T*A;\u001d}ye,`\u00120o", "", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "Ag^B_++S\u0017\t\u0003i<\f\t\u001de\u0007(yO\u0005! ", "=sW2e", "BnBAe0GU", "", "\u0011n\\=T5B]\"", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class SingleSelectionLayout implements SelectionLayout {
    public static final Companion Companion = new Companion(null);
    public static final long DEFAULT_SELECTABLE_ID = 1;
    public static final int DEFAULT_SLOT = 1;
    private final int endSlot;
    private final SelectableInfo info;
    private final boolean isStartHandle;
    private final Selection previousSelection;
    private final int startSlot;

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public void forEachMiddleInfo(Function1<? super SelectableInfo, Unit> function1) {
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public int getSize() {
        return 1;
    }

    public SingleSelectionLayout(boolean z2, int i2, int i3, Selection selection, SelectableInfo selectableInfo) {
        this.isStartHandle = z2;
        this.startSlot = i2;
        this.endSlot = i3;
        this.previousSelection = selection;
        this.info = selectableInfo;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public boolean isStartHandle() {
        return this.isStartHandle;
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
    public Selection getPreviousSelection() {
        return this.previousSelection;
    }

    /* JADX INFO: compiled from: SelectionLayout.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00126Ȑ\u0007\":\u0018\u007fјlʘ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$BOIV2}P\u000b&ȥ:̊rJbŏ\u0014\u001b\u0014\u0019\u0011jZM,ޓ0ܫ\u00132JģЩ7R"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003lj;\u000ec\u001aN}'E[R6e9nQ\u001e\"iL,5\u0015\u0010UJ(xM\r", "", "u(E", "\u0012D5\u000eH\u0013-M\u0007^a>\nkd\fL_\"_\u001f", "", "\u0012D5\u000eH\u0013-M\u0007edM", "", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public CrossStatus getCrossStatus() {
        return getStartSlot() < getEndSlot() ? CrossStatus.NOT_CROSSED : getStartSlot() > getEndSlot() ? CrossStatus.CROSSED : this.info.getRawCrossStatus();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public SelectableInfo getStartInfo() {
        return this.info;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public SelectableInfo getEndInfo() {
        return this.info;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public SelectableInfo getCurrentInfo() {
        return this.info;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public SelectableInfo getFirstInfo() {
        return this.info;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public SelectableInfo getLastInfo() {
        return this.info;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public boolean shouldRecomputeSelection(SelectionLayout selectionLayout) {
        if (getPreviousSelection() != null && selectionLayout != null && (selectionLayout instanceof SingleSelectionLayout)) {
            SingleSelectionLayout singleSelectionLayout = (SingleSelectionLayout) selectionLayout;
            if (getStartSlot() == singleSelectionLayout.getStartSlot() && getEndSlot() == singleSelectionLayout.getEndSlot() && isStartHandle() == singleSelectionLayout.isStartHandle() && !this.info.shouldRecomputeSelection(singleSelectionLayout.info)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public LongObjectMap<Selection> createSubSelections(Selection selection) {
        Selection selectionCopy$default = selection;
        if ((!selectionCopy$default.getHandlesCrossed() && selectionCopy$default.getStart().getOffset() > selectionCopy$default.getEnd().getOffset()) || (selectionCopy$default.getHandlesCrossed() && selectionCopy$default.getStart().getOffset() <= selectionCopy$default.getEnd().getOffset())) {
            selectionCopy$default = Selection.copy$default(selectionCopy$default, null, null, !selectionCopy$default.getHandlesCrossed(), 3, null);
        }
        return LongObjectMapKt.longObjectMapOf(this.info.getSelectableId(), selectionCopy$default);
    }

    public String toString() {
        return "SingleSelectionLayout(isStartHandle=" + isStartHandle() + ", crossed=" + getCrossStatus() + ", info=\n\t" + this.info + ')';
    }
}
