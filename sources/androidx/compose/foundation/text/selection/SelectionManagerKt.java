package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
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
/* JADX INFO: compiled from: SelectionManager.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯH\u001d̉=!4i\bӵLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nj?2Le^.ZS0\u0011s{BBc$\bCCU0}*\teNo˧vJp\u000bK\u000f\f\u0018\u0001j:R]xc\u0017'RPoW3{pm=nvN\u0005N5R<\b\t\u0019\u001aXMV͌ےBŷë\u00162FvHY%u\u0013\"*\u0006l!1\"jif6vo\u000e>='\u001bipSWc>\u0006e\rt^m\rɱ`ӜҋD9; 3_\u001b/`hW\u0003mpm\u001bv5?=Y\u0002gBh\u0002$\u0015Y`\u001d_\u0003&\u000b\u0017\u007fp:6[Sq^h\u000eV\fAz%X\u0012#\u001e)^-[,\u0017\u000e\u001cI\rti?~\u0014\u000fH\u000e\u0012y8-$.Eqݍ3\u0003_yS\u0019|P$\u0005;\u001dS\u0005|;sT<a[Ñȑv\u0383śUBCc\\&qY{!\th\u0012,\u00140\u000e\u001e]\u000b10\u001d¦Eya)1m\u0012H\u000b\u0006%\u0014'hks`gX\"\u001d\u0015_*7 !ե\u0005\u0011y¬lXZ\u0010$ȿVΘ\u0002\b\u001b\u05feςwA)(\u0016ʼk\u0017hҽQ}"}, d2 = {"7me2e;>R|\b{b5\u0001\u0018/R\u007f&\u000b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "1`[0h3:b\u0019lze,z\u00183o\t\u0010wB\n\u001b\u0018Ko\u001b\u001av.DY\u000b{@l#8QB", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", ";`].Z,K", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r0X\u007f\u000fCUJ.\\_H", ";`V;\\-BS&l~s,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "1`[0h3:b\u0019lze,z\u00183o\t\u0010wB\n\u001b\u0018Ko\u001b\u001av.DY\u000b{@l#8QB\u0003U~$|u[7", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001{\u00165MAJo>'^Va@\u0007a;R\u00010/HW(^R\u007f\u0013xU?", "5dc\u001aT.GW\u001a\u0003zk\n|\u0012>e\r", "/mR5b9", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r0X\u007fe#UL/f_VF\u0015\u001c0", "5dc\u001aT.GW\u001a\u0003zk\n|\u0012>e\ro`1\u0010|b5>", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001{\u00165MAJo>'^Va@\u0007a;R\u00010/HW(^R\u007f\u0013xxV\u0017M8\u0017\tXTmlN?*\u0012:IK<r\u0011\u0015\u0015\nDnzK \u001fG\r$?O)oFWn}QJ\u000fP*k\f],`DCboz\u0017\u001er]\u0012\u0013|]f67", "5dc X3>Q(~yK,~\r9nl(yO", "Ad[2V;:P ~hn)j\t6e}7\u007fJ\n\u0002\u0013K|\u001c", "", "\u001aj^A_0G\u001d\u0004z~k\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r(K}'\u001d", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r0X\u007f|", "1n]AT0GS&\\\u0005h9{\r8a\u000f(\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/\u0015w ;LGDgC\u001e#>", ";da4X", ":gb", "@gb", "1n]AT0Ga|\bxe<\u000b\r@e", "", "=eU@X;", "1n]AT0Ga|\bxe<\u000b\r@eG\u0018\r\u0013\fa\u007f#", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019\u0017Qw\u000eK\u00049~F}\u001eFCzqB", "4ha@g\bGR\u007fz\tm", "\"", "Dhb6U3>0#\u000f\u0004]:", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SelectionManagerKt {
    private static final Rect invertedInfiniteRect = new Rect(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: compiled from: SelectionManager.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Handle.values().length];
            try {
                iArr[Handle.SelectionStart.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Handle.SelectionEnd.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Handle.Cursor.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Selection merge(Selection selection, Selection selection2) {
        Selection selectionMerge;
        return (selection == null || (selectionMerge = selection.merge(selection2)) == null) ? selection2 : selectionMerge;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> firstAndLast(List<? extends T> list) {
        int size = list.size();
        return (size == 0 || size == 1) ? list : CollectionsKt.listOf(CollectionsKt.first((List) list), CollectionsKt.last((List) list));
    }

    public static final Rect getSelectedRegionRect(List<? extends Pair<? extends Selectable, Selection>> list, LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates layoutCoordinates2;
        int[] iArr;
        if (list.isEmpty()) {
            return invertedInfiniteRect;
        }
        Rect rect = invertedInfiniteRect;
        float fComponent1 = rect.component1();
        float fComponent2 = rect.component2();
        float fComponent3 = rect.component3();
        float fComponent4 = rect.component4();
        int size = list.size();
        char c2 = 0;
        int i2 = 0;
        while (i2 < size) {
            Pair<? extends Selectable, Selection> pair = list.get(i2);
            Selectable selectableComponent1 = pair.component1();
            Selection selectionComponent2 = pair.component2();
            int offset = selectionComponent2.getStart().getOffset();
            int offset2 = selectionComponent2.getEnd().getOffset();
            if (offset != offset2 && (layoutCoordinates2 = selectableComponent1.getLayoutCoordinates()) != null) {
                int iMin = Math.min(offset, offset2);
                int iMax = Math.max(offset, offset2) - 1;
                if (iMin == iMax) {
                    iArr = new int[1];
                    iArr[c2] = iMin;
                } else {
                    iArr = new int[2];
                    iArr[c2] = iMin;
                    iArr[1] = iMax;
                }
                Rect rect2 = invertedInfiniteRect;
                float fComponent12 = rect2.component1();
                float fComponent22 = rect2.component2();
                float fComponent32 = rect2.component3();
                float fComponent42 = rect2.component4();
                for (int i3 : iArr) {
                    Rect boundingBox = selectableComponent1.getBoundingBox(i3);
                    fComponent12 = Math.min(fComponent12, boundingBox.getLeft());
                    fComponent22 = Math.min(fComponent22, boundingBox.getTop());
                    fComponent32 = Math.max(fComponent32, boundingBox.getRight());
                    fComponent42 = Math.max(fComponent42, boundingBox.getBottom());
                }
                long jOffset = OffsetKt.Offset(fComponent12, fComponent22);
                long jOffset2 = OffsetKt.Offset(fComponent32, fComponent42);
                long jMo5523localPositionOfR5De75A = layoutCoordinates.mo5523localPositionOfR5De75A(layoutCoordinates2, jOffset);
                long jMo5523localPositionOfR5De75A2 = layoutCoordinates.mo5523localPositionOfR5De75A(layoutCoordinates2, jOffset2);
                fComponent1 = Math.min(fComponent1, Offset.m3937getXimpl(jMo5523localPositionOfR5De75A));
                fComponent2 = Math.min(fComponent2, Offset.m3938getYimpl(jMo5523localPositionOfR5De75A));
                fComponent3 = Math.max(fComponent3, Offset.m3937getXimpl(jMo5523localPositionOfR5De75A2));
                fComponent4 = Math.max(fComponent4, Offset.m3938getYimpl(jMo5523localPositionOfR5De75A2));
            }
            i2++;
            c2 = 0;
        }
        return new Rect(fComponent1, fComponent2, fComponent3, fComponent4);
    }

    /* JADX INFO: renamed from: calculateSelectionMagnifierCenterAndroid-O0kMr_c, reason: not valid java name */
    public static final long m1717calculateSelectionMagnifierCenterAndroidO0kMr_c(SelectionManager selectionManager, long j2) {
        Selection selection = selectionManager.getSelection();
        if (selection == null) {
            return Offset.Companion.m3952getUnspecifiedF1C5BW0();
        }
        Handle draggingHandle = selectionManager.getDraggingHandle();
        int i2 = draggingHandle == null ? -1 : WhenMappings.$EnumSwitchMapping$0[draggingHandle.ordinal()];
        if (i2 == -1) {
            return Offset.Companion.m3952getUnspecifiedF1C5BW0();
        }
        if (i2 == 1) {
            return m1719getMagnifierCenterJVtK1S4(selectionManager, j2, selection.getStart());
        }
        if (i2 == 2) {
            return m1719getMagnifierCenterJVtK1S4(selectionManager, j2, selection.getEnd());
        }
        if (i2 == 3) {
            throw new IllegalStateException("SelectionContainer does not support cursor".toString());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: getMagnifierCenter-JVtK1S4, reason: not valid java name */
    private static final long m1719getMagnifierCenterJVtK1S4(SelectionManager selectionManager, long j2, Selection.AnchorInfo anchorInfo) {
        LayoutCoordinates containerLayoutCoordinates;
        LayoutCoordinates layoutCoordinates;
        int offset;
        float fCoerceIn;
        Selectable anchorSelectable$foundation_release = selectionManager.getAnchorSelectable$foundation_release(anchorInfo);
        if (anchorSelectable$foundation_release != null && (containerLayoutCoordinates = selectionManager.getContainerLayoutCoordinates()) != null && (layoutCoordinates = anchorSelectable$foundation_release.getLayoutCoordinates()) != null && (offset = anchorInfo.getOffset()) <= anchorSelectable$foundation_release.getLastVisibleOffset()) {
            Offset offsetM1706getCurrentDragPosition_m7T9E = selectionManager.m1706getCurrentDragPosition_m7T9E();
            Intrinsics.checkNotNull(offsetM1706getCurrentDragPosition_m7T9E);
            float fM3937getXimpl = Offset.m3937getXimpl(layoutCoordinates.mo5523localPositionOfR5De75A(containerLayoutCoordinates, offsetM1706getCurrentDragPosition_m7T9E.m3947unboximpl()));
            long jMo1667getRangeOfLineContainingjx7JFs = anchorSelectable$foundation_release.mo1667getRangeOfLineContainingjx7JFs(offset);
            if (TextRange.m6117getCollapsedimpl(jMo1667getRangeOfLineContainingjx7JFs)) {
                fCoerceIn = anchorSelectable$foundation_release.getLineLeft(offset);
            } else {
                float lineLeft = anchorSelectable$foundation_release.getLineLeft(TextRange.m6123getStartimpl(jMo1667getRangeOfLineContainingjx7JFs));
                float lineRight = anchorSelectable$foundation_release.getLineRight(TextRange.m6118getEndimpl(jMo1667getRangeOfLineContainingjx7JFs) - 1);
                fCoerceIn = RangesKt.coerceIn(fM3937getXimpl, Math.min(lineLeft, lineRight), Math.max(lineLeft, lineRight));
            }
            if (fCoerceIn == -1.0f) {
                return Offset.Companion.m3952getUnspecifiedF1C5BW0();
            }
            if (!IntSize.m6806equalsimpl0(j2, IntSize.Companion.m6813getZeroYbymL2g()) && Math.abs(fM3937getXimpl - fCoerceIn) > IntSize.m6808getWidthimpl(j2) / 2) {
                return Offset.Companion.m3952getUnspecifiedF1C5BW0();
            }
            float centerYForOffset = anchorSelectable$foundation_release.getCenterYForOffset(offset);
            if (centerYForOffset == -1.0f) {
                return Offset.Companion.m3952getUnspecifiedF1C5BW0();
            }
            return containerLayoutCoordinates.mo5523localPositionOfR5De75A(layoutCoordinates, OffsetKt.Offset(fCoerceIn, centerYForOffset));
        }
        return Offset.Companion.m3952getUnspecifiedF1C5BW0();
    }

    public static final Rect visibleBounds(LayoutCoordinates layoutCoordinates) {
        Rect rectBoundsInWindow = LayoutCoordinatesKt.boundsInWindow(layoutCoordinates);
        return RectKt.m3975Rect0a9Yr6o(layoutCoordinates.mo5531windowToLocalMKHz9U(rectBoundsInWindow.m3972getTopLeftF1C5BW0()), layoutCoordinates.mo5531windowToLocalMKHz9U(rectBoundsInWindow.m3966getBottomRightF1C5BW0()));
    }

    /* JADX INFO: renamed from: containsInclusive-Uv8p0NA, reason: not valid java name */
    public static final boolean m1718containsInclusiveUv8p0NA(Rect rect, long j2) {
        float left = rect.getLeft();
        float right = rect.getRight();
        float fM3937getXimpl = Offset.m3937getXimpl(j2);
        if (left <= fM3937getXimpl && fM3937getXimpl <= right) {
            float top = rect.getTop();
            float bottom = rect.getBottom();
            float fM3938getYimpl = Offset.m3938getYimpl(j2);
            if (top <= fM3938getYimpl && fM3938getYimpl <= bottom) {
                return true;
            }
        }
        return false;
    }
}
