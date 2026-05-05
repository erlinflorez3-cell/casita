package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: compiled from: SelectionAdjustment.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я0\u001d̉=!4i\bӵLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007njO0L͜P.`\\2\u000fq{<$i*yCAc2\u00140ޛgN\u0016f\u001fNh\u000b[\u000f4\u0017)n:Kmx\f\u0015U2Z\u001aM7eok>\ttd\u000bP60?\u0012\u0005/\"ZL\u001e\u007f\u0013Cy\u0014B4NzRR;X5\u001e \bV /!#gfPVxu:](+ipSWc>\ne\rtZW\u0011\u0005o6+nB{\u0015=e\u0011\u0016j[m\u0002gqk\u0004\u0019+5+as\u00067\u001fÜ,'9_%]!%\u0005\u0005\u007f_<+9O{K~\u000fnw\u0013\u0016\u001bM\u001c\u000e4/p.[ \u0017\f\u001cE\rr\u0002K\u0001\u0006lK\u0018z\u0010>]%\u0018e9L3f\u007ffc\u0019|=,\t\u001b2;\u0001\u001d,\fX\u001cu-\u001b\u0003\u0003\u00025_VUH|\u0015\nA{\r\tb0244U\u0007G{?6]%OuG:9k0Mlg%\u0006\u0011lavjHn(\u001f\u001aEB!\f\tI+\u0005\u0080Tmу0\u0019[6l\u0007,\u0013i؉τw̆%-\u001eigh\u0018o$ε܈%"}, d2 = {"/cYBf;-]u\t\u000bg+x\u00163e\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r0X\u007f|", ":`h<h;", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r0X\u007f\u000eC`X<k(", "0nd;W(Kgy\u000f\u0004\\;\u0001\u00138", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=gqrqB\u0006_9bW7PJ]0f[H", "/mR5b9(\\u\t\u000bg+x\u0016C", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r0X\u007fe#UL/f_VF\u0015\u001c0", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r(K}'+UO62", "1q^@f,=", "", "7rBAT9M", "Ak^A", "", "1gP;Z,(T\u001a\rzm", "7mU<", "<df\u001cY-LS(", "3mbBe,\u001ab\u007f~vl;f\u0012/C\u0003$\t", "3w_.a+(\\\u0019\\}Z9", "7r4Ec(GR\u001d\b|", "1ta?X5M@\u0015\u0011d_-\u000b\t>", "AmP=G60]&}Wh<\u0006\b+r\u0014", "1ta?X5M:\u001d\bz", "1ta?X5M=\u001a\u007f\t^;", "=sW2e\u0016?T'~\n", "CoS.g,,S ~xm0\u0007\u0012\fo\u00101z<\u000e+", ">qTC\\6Na\u0007~\u0002^*\f\r9n[1yC\u000b$", "4nd;W(MW#\btk,\u0004\t+s\u007f", "1ta?X5M@\u0015\u0011ab5|", "/mR5b9,\\\u0015\n\u0006^+k\u0013!o\r'XJ\u0011 \u0016C|\""}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SelectionAdjustmentKt {
    public static final Selection.AnchorInfo updateSelectionBoundary(final SelectionLayout selectionLayout, final SelectableInfo selectableInfo, Selection.AnchorInfo anchorInfo) {
        int endSlot;
        final int rawStartHandleOffset = selectionLayout.isStartHandle() ? selectableInfo.getRawStartHandleOffset() : selectableInfo.getRawEndHandleOffset();
        if (selectionLayout.isStartHandle()) {
            endSlot = selectionLayout.getStartSlot();
        } else {
            endSlot = selectionLayout.getEndSlot();
        }
        if (endSlot != selectableInfo.getSlot()) {
            return selectableInfo.anchorForOffset(rawStartHandleOffset);
        }
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<Integer>() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustmentKt$updateSelectionBoundary$currentRawLine$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                return Integer.valueOf(selectableInfo.getTextLayoutResult().getLineForOffset(rawStartHandleOffset));
            }
        });
        final int rawEndHandleOffset = selectionLayout.isStartHandle() ? selectableInfo.getRawEndHandleOffset() : selectableInfo.getRawStartHandleOffset();
        Lazy lazy2 = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<Selection.AnchorInfo>() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustmentKt$updateSelectionBoundary$anchorSnappedToWordBoundary$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Selection.AnchorInfo invoke() {
                return SelectionAdjustmentKt.snapToWordBoundary(selectableInfo, SelectionAdjustmentKt.updateSelectionBoundary$lambda$0(lazy), rawStartHandleOffset, rawEndHandleOffset, selectionLayout.isStartHandle(), selectionLayout.getCrossStatus() == CrossStatus.CROSSED);
            }
        });
        if (selectableInfo.getSelectableId() != anchorInfo.getSelectableId()) {
            return updateSelectionBoundary$lambda$1(lazy2);
        }
        int rawPreviousHandleOffset = selectableInfo.getRawPreviousHandleOffset();
        if (rawStartHandleOffset == rawPreviousHandleOffset) {
            return anchorInfo;
        }
        if (updateSelectionBoundary$lambda$0(lazy) != selectableInfo.getTextLayoutResult().getLineForOffset(rawPreviousHandleOffset)) {
            return updateSelectionBoundary$lambda$1(lazy2);
        }
        int offset = anchorInfo.getOffset();
        long jM6097getWordBoundaryjx7JFs = selectableInfo.getTextLayoutResult().m6097getWordBoundaryjx7JFs(offset);
        if (!isExpanding(selectableInfo, rawStartHandleOffset, selectionLayout.isStartHandle())) {
            return selectableInfo.anchorForOffset(rawStartHandleOffset);
        }
        if (offset == TextRange.m6123getStartimpl(jM6097getWordBoundaryjx7JFs) || offset == TextRange.m6118getEndimpl(jM6097getWordBoundaryjx7JFs)) {
            return updateSelectionBoundary$lambda$1(lazy2);
        }
        return selectableInfo.anchorForOffset(rawStartHandleOffset);
    }

    public static final int updateSelectionBoundary$lambda$0(Lazy<Integer> lazy) {
        return lazy.getValue().intValue();
    }

    private static final Selection.AnchorInfo updateSelectionBoundary$lambda$1(Lazy<Selection.AnchorInfo> lazy) {
        return lazy.getValue();
    }

    private static final boolean isExpanding(SelectableInfo selectableInfo, int i2, boolean z2) {
        if (selectableInfo.getRawPreviousHandleOffset() == -1) {
            return true;
        }
        if (i2 == selectableInfo.getRawPreviousHandleOffset()) {
            return false;
        }
        if (z2 ^ (selectableInfo.getRawCrossStatus() == CrossStatus.CROSSED)) {
            if (i2 < selectableInfo.getRawPreviousHandleOffset()) {
                return true;
            }
        } else if (i2 > selectableInfo.getRawPreviousHandleOffset()) {
            return true;
        }
        return false;
    }

    public static final Selection.AnchorInfo snapToWordBoundary(SelectableInfo selectableInfo, int i2, int i3, int i4, boolean z2, boolean z3) {
        int lineStart;
        int lineEnd$default;
        long jM6097getWordBoundaryjx7JFs = selectableInfo.getTextLayoutResult().m6097getWordBoundaryjx7JFs(i3);
        if (selectableInfo.getTextLayoutResult().getLineForOffset(TextRange.m6123getStartimpl(jM6097getWordBoundaryjx7JFs)) == i2) {
            lineStart = TextRange.m6123getStartimpl(jM6097getWordBoundaryjx7JFs);
        } else if (i2 >= selectableInfo.getTextLayoutResult().getLineCount()) {
            lineStart = selectableInfo.getTextLayoutResult().getLineStart(selectableInfo.getTextLayoutResult().getLineCount() - 1);
        } else {
            lineStart = selectableInfo.getTextLayoutResult().getLineStart(i2);
        }
        if (selectableInfo.getTextLayoutResult().getLineForOffset(TextRange.m6118getEndimpl(jM6097getWordBoundaryjx7JFs)) == i2) {
            lineEnd$default = TextRange.m6118getEndimpl(jM6097getWordBoundaryjx7JFs);
        } else if (i2 >= selectableInfo.getTextLayoutResult().getLineCount()) {
            lineEnd$default = TextLayoutResult.getLineEnd$default(selectableInfo.getTextLayoutResult(), selectableInfo.getTextLayoutResult().getLineCount() - 1, false, 2, null);
        } else {
            lineEnd$default = TextLayoutResult.getLineEnd$default(selectableInfo.getTextLayoutResult(), i2, false, 2, null);
        }
        if (lineStart == i4) {
            return selectableInfo.anchorForOffset(lineEnd$default);
        }
        if (lineEnd$default == i4) {
            return selectableInfo.anchorForOffset(lineStart);
        }
        if (!(z2 ^ z3) ? i3 >= lineStart : i3 > lineEnd$default) {
            lineStart = lineEnd$default;
        }
        return selectableInfo.anchorForOffset(lineStart);
    }

    public static final Selection adjustToBoundaries(SelectionLayout selectionLayout, BoundaryFunction boundaryFunction) {
        boolean z2 = selectionLayout.getCrossStatus() == CrossStatus.CROSSED;
        return new Selection(anchorOnBoundary(selectionLayout.getStartInfo(), z2, true, selectionLayout.getStartSlot(), boundaryFunction), anchorOnBoundary(selectionLayout.getEndInfo(), z2, false, selectionLayout.getEndSlot(), boundaryFunction), z2);
    }

    private static final Selection.AnchorInfo anchorOnBoundary(SelectableInfo selectableInfo, boolean z2, boolean z3, int i2, BoundaryFunction boundaryFunction) {
        int rawStartHandleOffset = z3 ? selectableInfo.getRawStartHandleOffset() : selectableInfo.getRawEndHandleOffset();
        if (i2 != selectableInfo.getSlot()) {
            return selectableInfo.anchorForOffset(rawStartHandleOffset);
        }
        long jMo1665getBoundaryfzxv0v0 = boundaryFunction.mo1665getBoundaryfzxv0v0(selectableInfo, rawStartHandleOffset);
        return selectableInfo.anchorForOffset(z2 ^ z3 ? TextRange.m6123getStartimpl(jMo1665getBoundaryfzxv0v0) : TextRange.m6118getEndimpl(jMo1665getBoundaryfzxv0v0));
    }

    public static final Selection ensureAtLeastOneChar(Selection selection, SelectionLayout selectionLayout) {
        if (SelectionLayoutKt.isCollapsed(selection, selectionLayout)) {
            return (selectionLayout.getSize() > 1 || selectionLayout.getPreviousSelection() == null || selectionLayout.getCurrentInfo().getInputText().length() == 0) ? selection : expandOneChar(selection, selectionLayout);
        }
        return selection;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final androidx.compose.foundation.text.selection.Selection expandOneChar(androidx.compose.foundation.text.selection.Selection r9, androidx.compose.foundation.text.selection.SelectionLayout r10) {
        /*
            androidx.compose.foundation.text.selection.SelectableInfo r2 = r10.getCurrentInfo()
            java.lang.String r4 = r2.getInputText()
            int r3 = r2.getRawStartHandleOffset()
            int r0 = r4.length()
            r1 = 0
            r5 = r9
            if (r3 != 0) goto L40
            int r1 = androidx.compose.foundation.text.StringHelpers_androidKt.findFollowingBreak(r4, r1)
            boolean r0 = r10.isStartHandle()
            if (r0 == 0) goto L2f
            androidx.compose.foundation.text.selection.Selection$AnchorInfo r0 = r5.getStart()
            androidx.compose.foundation.text.selection.Selection$AnchorInfo r6 = changeOffset(r0, r2, r1)
            r9 = 2
            r10 = 0
            r7 = 0
            r8 = 1
            androidx.compose.foundation.text.selection.Selection r0 = androidx.compose.foundation.text.selection.Selection.copy$default(r5, r6, r7, r8, r9, r10)
        L2e:
            return r0
        L2f:
            androidx.compose.foundation.text.selection.Selection$AnchorInfo r0 = r5.getEnd()
            androidx.compose.foundation.text.selection.Selection$AnchorInfo r7 = changeOffset(r0, r2, r1)
            r9 = 1
            r10 = 0
            r6 = 0
            r8 = 0
            androidx.compose.foundation.text.selection.Selection r0 = androidx.compose.foundation.text.selection.Selection.copy$default(r5, r6, r7, r8, r9, r10)
            goto L2e
        L40:
            if (r3 != r0) goto L6e
            int r1 = androidx.compose.foundation.text.StringHelpers_androidKt.findPrecedingBreak(r4, r0)
            boolean r0 = r10.isStartHandle()
            if (r0 == 0) goto L5d
            androidx.compose.foundation.text.selection.Selection$AnchorInfo r0 = r5.getStart()
            androidx.compose.foundation.text.selection.Selection$AnchorInfo r6 = changeOffset(r0, r2, r1)
            r9 = 2
            r10 = 0
            r7 = 0
            r8 = 0
            androidx.compose.foundation.text.selection.Selection r0 = androidx.compose.foundation.text.selection.Selection.copy$default(r5, r6, r7, r8, r9, r10)
            goto L2e
        L5d:
            androidx.compose.foundation.text.selection.Selection$AnchorInfo r0 = r5.getEnd()
            androidx.compose.foundation.text.selection.Selection$AnchorInfo r7 = changeOffset(r0, r2, r1)
            r9 = 1
            r10 = 0
            r6 = 0
            r8 = 1
            androidx.compose.foundation.text.selection.Selection r0 = androidx.compose.foundation.text.selection.Selection.copy$default(r5, r6, r7, r8, r9, r10)
            goto L2e
        L6e:
            androidx.compose.foundation.text.selection.Selection r0 = r10.getPreviousSelection()
            if (r0 == 0) goto La1
            boolean r0 = r0.getHandlesCrossed()
            r8 = 1
            if (r0 != r8) goto La1
        L7b:
            boolean r0 = r10.isStartHandle()
            r0 = r0 ^ r8
            if (r0 == 0) goto L9c
            int r1 = androidx.compose.foundation.text.StringHelpers_androidKt.findPrecedingBreak(r4, r3)
        L86:
            boolean r0 = r10.isStartHandle()
            if (r0 == 0) goto La3
            androidx.compose.foundation.text.selection.Selection$AnchorInfo r0 = r5.getStart()
            androidx.compose.foundation.text.selection.Selection$AnchorInfo r6 = changeOffset(r0, r2, r1)
            r9 = 2
            r10 = 0
            r7 = 0
            androidx.compose.foundation.text.selection.Selection r0 = androidx.compose.foundation.text.selection.Selection.copy$default(r5, r6, r7, r8, r9, r10)
            goto L2e
        L9c:
            int r1 = androidx.compose.foundation.text.StringHelpers_androidKt.findFollowingBreak(r4, r3)
            goto L86
        La1:
            r8 = r1
            goto L7b
        La3:
            androidx.compose.foundation.text.selection.Selection$AnchorInfo r0 = r5.getEnd()
            androidx.compose.foundation.text.selection.Selection$AnchorInfo r7 = changeOffset(r0, r2, r1)
            r9 = 1
            r10 = 0
            r6 = 0
            androidx.compose.foundation.text.selection.Selection r0 = androidx.compose.foundation.text.selection.Selection.copy$default(r5, r6, r7, r8, r9, r10)
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionAdjustmentKt.expandOneChar(androidx.compose.foundation.text.selection.Selection, androidx.compose.foundation.text.selection.SelectionLayout):androidx.compose.foundation.text.selection.Selection");
    }

    private static final Selection.AnchorInfo changeOffset(Selection.AnchorInfo anchorInfo, SelectableInfo selectableInfo, int i2) {
        return Selection.AnchorInfo.copy$default(anchorInfo, selectableInfo.getTextLayoutResult().getBidiRunDirection(i2), i2, 0L, 4, null);
    }
}
