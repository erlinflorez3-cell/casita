package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.unit.IntSize;
import java.util.Comparator;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: MultiWidgetSelectionDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯT\u001d̉=!,o\bӵLc\u000b\u0004Iي8\u000bDB\u0007\"2\u0013\u007f\u0007|jAӄLe^.ZS0\u0012s{B-c$wDCU(}*\teNogtKb\u000bQ\u0016\u000e\u0016~n4Ikxe܈\u00172XoG3coE9ftN%.݅:8(\u00041\u001e8H(v)D{\u0010 2XphUSMơ\u0019ŇĂB\"\u0007\"jlfVVru:]*3mPN?_^}}\u0011T\\?\r%jd+ġ6ߎչ)U\t\u0011`fW#M}U\u0005\u0017.W/Wso6\u0007\u0001D\u00199W%]!/#\u0005Ƣ_ϯˏ/QiX^\u0019@\u000e\t\n%<2\u001d6+V>E\u001a\u0015\u000f>7\u0003\u0004k@~\t%B\u0018/oH/%.FS9Iz\u0002eI\u001bf7*\b=\"1\u0016\u0007!\nU>d#1lw\u007f2\u0002DK_f\n\bU4Վψạò\b2M\u0019=\u0016)H%@O[g*Ik0\\tk\u0005!xh\u0002\u0002\u0003LN?\u0007\u0016eBO\frvr#\u0004P\u0003WT\u0011{;\u0005\u001b\f(+0lyL!S(|pQozOm\nSGEY\nry+o9\rKeUq3yR%\u0013\u0006<ϸ\u0005]nEY۰v\u000b'Ϙ6l"}, d2 = {"5dc\u001cY-LS(_\u0005k\u0017\u0007\u00173t\u00042\u0005", "", ">nb6g0H\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "BdgA?(R])\u000eg^:\r\u0010>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u001cU\u0012*G|\u0003.[SBz\n", "5dc\u001cY-LS(_\u0005k\u0017\u0007\u00173t\u00042\u0005\bN~\u001fGW^B", "uI;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006e%Hhd\u001cKw&=:CI{;-j,E", "5dc%70KS\u0017\u000e~h5", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=gsln9\u0005r0X\u007f|", "0nd;W:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "5dc%70KS\u0017\u000e~h5DV\u0017m\u007f\u0010LF", "uI;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Gy\u0016<\u00062I#j 5|kq4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016O6l[q9#\u0016d\u0017\u0018:\r\u0018h\u000b2nK7\u001d\u00170S\u000b\u0005G\u0005\u0019\u0016\fDnzK,", "5dc&70KS\u0017\u000e~h5", "5dc&70KS\u0017\u000e~h5DV\u0017m\u007f\u0010LF", "7rB2_,<b\u0019}", "", "1ta?X5M2\u001d\fz\\;\u0001\u00138", "=sW2e\u000bB`\u0019|\nb6\u0006", "/o_2a+,S ~xm(y\u0010/I\t)\u0006", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r0X\u007f\u000eC`X<k/\u0003A\u001b\u0011Z\u001b$", ":nR._\u0017Ha\u001d\u000e~h5", ">qTC\\6Na{z\u0004]3|s9s\u00047\u007fJ\n", "Ad[2V;:P ~^]", "", "/o_2a+,S ~xm(y\u0010/I\t)\u0006\bk\u0013$Y{^\u0018", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001{\u00165MAJo>'^Va@\u0007a;R\u00010.Hb6laOM\u0018\u0019Y\u000e[\u0001s\u0001b@1xH62Q*S\nFr\u000f\f_\u001e94\u007fBi\u001f\u0011h\u0015\tP\u0010dZco\t4ASr1saD\u0002A}+", "5dc\u0011\\9>Q(\u0003\u0005g\t\u0011l.", "/mR5b9,S ~xm(y\u0010/I~", "1ta?X5MA\u0019\u0006z\\;x\u00066ec'", "5dc\u001de,OW#\u000f\t:+\u0002\u0019=t\u007f'eA\u0002%\u0017V", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r0X\u007fe#UL/f_VF\u0015\u001c0", "Ad[2V;:P ~^]\u0016\n\b/r\u00041}\u001e\u000b\u001f\"C|\nK\u00012", "\u001aiPCTuNb\u001d\u0006D<6\u0005\u0014+r{7\u0006MV", "\u001aj^A_0G\u001dv\t\u0003i(\n\u0005>o\r}", "1ta?X5MB\u0019\u0012\nE,\u0006\u000b>h", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MultiWidgetSelectionDelegateKt {
    /* JADX INFO: renamed from: appendSelectableInfo-Parwq6A, reason: not valid java name */
    public static final void m1668appendSelectableInfoParwq6A(SelectionLayoutBuilder selectionLayoutBuilder, TextLayoutResult textLayoutResult, long j2, long j3, long j4) {
        Direction directionAppendSelectableInfo_Parwq6A$otherDirection;
        Direction direction;
        Direction direction2;
        Direction direction3;
        Direction direction4;
        int iM1669getOffsetForPosition3MmeM6k;
        int previousAdjustedOffset;
        Selection.AnchorInfo start;
        Selection.AnchorInfo end;
        Rect rect = new Rect(0.0f, 0.0f, IntSize.m6808getWidthimpl(textLayoutResult.m6096getSizeYbymL2g()), IntSize.m6807getHeightimpl(textLayoutResult.m6096getSizeYbymL2g()));
        Direction directionM1670getXDirection3MmeM6k = m1670getXDirection3MmeM6k(j2, rect);
        Direction directionM1671getYDirection3MmeM6k = m1671getYDirection3MmeM6k(j2, rect);
        if (selectionLayoutBuilder.isStartHandle()) {
            Selection previousSelection = selectionLayoutBuilder.getPreviousSelection();
            directionAppendSelectableInfo_Parwq6A$otherDirection = appendSelectableInfo_Parwq6A$otherDirection(directionM1670getXDirection3MmeM6k, directionM1671getYDirection3MmeM6k, selectionLayoutBuilder, j4, previousSelection != null ? previousSelection.getEnd() : null);
            direction3 = directionAppendSelectableInfo_Parwq6A$otherDirection;
            direction4 = direction3;
            direction = directionM1670getXDirection3MmeM6k;
            direction2 = directionM1671getYDirection3MmeM6k;
        } else {
            Selection previousSelection2 = selectionLayoutBuilder.getPreviousSelection();
            directionAppendSelectableInfo_Parwq6A$otherDirection = appendSelectableInfo_Parwq6A$otherDirection(directionM1670getXDirection3MmeM6k, directionM1671getYDirection3MmeM6k, selectionLayoutBuilder, j4, previousSelection2 != null ? previousSelection2.getStart() : null);
            direction = directionAppendSelectableInfo_Parwq6A$otherDirection;
            direction2 = direction;
            direction3 = directionM1670getXDirection3MmeM6k;
            direction4 = directionM1671getYDirection3MmeM6k;
        }
        if (isSelected(SelectionLayoutKt.resolve2dDirection(directionM1670getXDirection3MmeM6k, directionM1671getYDirection3MmeM6k), directionAppendSelectableInfo_Parwq6A$otherDirection)) {
            int length = textLayoutResult.getLayoutInput().getText().length();
            if (selectionLayoutBuilder.isStartHandle()) {
                previousAdjustedOffset = m1669getOffsetForPosition3MmeM6k(j2, textLayoutResult);
                Selection previousSelection3 = selectionLayoutBuilder.getPreviousSelection();
                iM1669getOffsetForPosition3MmeM6k = (previousSelection3 == null || (end = previousSelection3.getEnd()) == null) ? previousAdjustedOffset : getPreviousAdjustedOffset(end, selectionLayoutBuilder.getSelectableIdOrderingComparator(), j4, length);
            } else {
                iM1669getOffsetForPosition3MmeM6k = m1669getOffsetForPosition3MmeM6k(j2, textLayoutResult);
                Selection previousSelection4 = selectionLayoutBuilder.getPreviousSelection();
                previousAdjustedOffset = (previousSelection4 == null || (start = previousSelection4.getStart()) == null) ? iM1669getOffsetForPosition3MmeM6k : getPreviousAdjustedOffset(start, selectionLayoutBuilder.getSelectableIdOrderingComparator(), j4, length);
            }
            selectionLayoutBuilder.appendInfo(j4, previousAdjustedOffset, direction, direction2, iM1669getOffsetForPosition3MmeM6k, direction3, direction4, OffsetKt.m3958isUnspecifiedk4lQ0M(j3) ? -1 : m1669getOffsetForPosition3MmeM6k(j3, textLayoutResult), textLayoutResult);
        }
    }

    private static final Direction appendSelectableInfo_Parwq6A$otherDirection(Direction direction, Direction direction2, SelectionLayoutBuilder selectionLayoutBuilder, long j2, Selection.AnchorInfo anchorInfo) {
        Direction directionById;
        return (anchorInfo == null || (directionById = getDirectionById(selectionLayoutBuilder, anchorInfo.getSelectableId(), j2)) == null) ? SelectionLayoutKt.resolve2dDirection(direction, direction2) : directionById;
    }

    private static final int getPreviousAdjustedOffset(Selection.AnchorInfo anchorInfo, Comparator<Long> comparator, long j2, int i2) {
        int iCompare = comparator.compare(Long.valueOf(anchorInfo.getSelectableId()), Long.valueOf(j2));
        if (iCompare < 0) {
            return 0;
        }
        return iCompare > 0 ? i2 : anchorInfo.getOffset();
    }

    /* JADX INFO: renamed from: getXDirection-3MmeM6k, reason: not valid java name */
    private static final Direction m1670getXDirection3MmeM6k(long j2, Rect rect) {
        return Offset.m3937getXimpl(j2) < rect.getLeft() ? Direction.BEFORE : Offset.m3937getXimpl(j2) > rect.getRight() ? Direction.AFTER : Direction.ON;
    }

    /* JADX INFO: renamed from: getYDirection-3MmeM6k, reason: not valid java name */
    private static final Direction m1671getYDirection3MmeM6k(long j2, Rect rect) {
        return Offset.m3938getYimpl(j2) < rect.getTop() ? Direction.BEFORE : Offset.m3938getYimpl(j2) > rect.getBottom() ? Direction.AFTER : Direction.ON;
    }

    private static final Direction getDirectionById(SelectionLayoutBuilder selectionLayoutBuilder, long j2, long j3) {
        int iCompare = selectionLayoutBuilder.getSelectableIdOrderingComparator().compare(Long.valueOf(j2), Long.valueOf(j3));
        if (iCompare < 0) {
            return Direction.BEFORE;
        }
        if (iCompare > 0) {
            return Direction.AFTER;
        }
        return Direction.ON;
    }

    private static final boolean isSelected(Direction direction, Direction direction2) {
        return direction == Direction.ON || direction != direction2;
    }

    /* JADX INFO: renamed from: getOffsetForPosition-3MmeM6k, reason: not valid java name */
    private static final int m1669getOffsetForPosition3MmeM6k(long j2, TextLayoutResult textLayoutResult) {
        if (Offset.m3938getYimpl(j2) <= 0.0f) {
            return 0;
        }
        return Offset.m3938getYimpl(j2) >= textLayoutResult.getMultiParagraph().getHeight() ? textLayoutResult.getLayoutInput().getText().length() : textLayoutResult.m6095getOffsetForPositionk4lQ0M(j2);
    }
}
