package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TextLayoutStateKt;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
/* JADX INFO: compiled from: TextFieldMagnifier.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d̉=!4i\bӵLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP.XTB?yڔL$\n#\"GIU2}P\n\u007fRui\u0007J\t\u000es\u0013\u0014\u001a\u0011jZN\u0006|k\u0018'2pv\u0006\u074c߲nމ˃dv<\r.;ĵ8~\r\u0004 ݴd>uڂGU"}, d2 = {"1`[0h3:b\u0019lze,z\u00183o\t\u0010wB\n\u001b\u0018Ko\u001b\u001av.DY\u000b{@l#8QB", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "BdgA90>Z\u0018l\nZ;|", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR9J\u007f5HV[4\\Qa='!;\u0012N2\frh=3n\u001a", "Ad[2V;B]\"l\nZ;|", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@Pq,Uv%VPX5&ArP#r^\u000eU*z\u0005`A\"}HA(u;E\u0011;>", "BdgA?(R])\u000ehm(\f\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR,a\u0006\u000eC`X<k@\u00029#\u00120", ";`V;\\-BS&l~s,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "1`[0h3:b\u0019lze,z\u00183o\t\u0010wB\n\u001b\u0018Ko\u001b\u001av.DY\u000b{@l#8QB\u0003n$%yZK\u0019", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001q\u001f9]R\u0005o=-\u0015uj5\u000e-\u001b[r0UMX9dRq,\u0014%inR+\u0014\u0004GP }D\r\u0006\u00045H\u000fEl\u007f\u001f_\f?r{Ld\u0010\u0011z\u001f\u0006J(dU]i\u0003\u0011PEu9.\u0010h(lI\u0004(\u001d\u0001\u0019(qL5S\nS\u0018rP\tkqPbi87MN_FLnC<{'\u001dZ\u007f\u0002\u001b gp:t\u0003j035q\u000fOf+\b\\\u0003\u001d7fO'o7F#HJ_\u0005pH\u00172.a\u001b\u001d,9:$ut-L\u0018\u0016]$d1h)o7e\u0015%E\u0004\u001f7UlQW\t\u0015^kgR", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TextFieldMagnifierKt {

    /* JADX INFO: compiled from: TextFieldMagnifier.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Handle.values().length];
            try {
                iArr[Handle.Cursor.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Handle.SelectionStart.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Handle.SelectionEnd.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: calculateSelectionMagnifierCenterAndroid-hUlJWOE */
    public static final long m1583calculateSelectionMagnifierCenterAndroidhUlJWOE(TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, TextLayoutState textLayoutState, long j2) {
        int iM6123getStartimpl;
        long jM1607getHandleDragPositionF1C5BW0 = textFieldSelectionState.m1607getHandleDragPositionF1C5BW0();
        if (OffsetKt.m3958isUnspecifiedk4lQ0M(jM1607getHandleDragPositionF1C5BW0) || transformedTextFieldState.getVisualText().length() == 0) {
            return Offset.Companion.m3952getUnspecifiedF1C5BW0();
        }
        long jM1446getSelectiond9O1mEE = transformedTextFieldState.getVisualText().m1446getSelectiond9O1mEE();
        Handle draggingHandle = textFieldSelectionState.getDraggingHandle();
        int i2 = draggingHandle == null ? -1 : WhenMappings.$EnumSwitchMapping$0[draggingHandle.ordinal()];
        if (i2 == -1) {
            return Offset.Companion.m3952getUnspecifiedF1C5BW0();
        }
        if (i2 == 1 || i2 == 2) {
            iM6123getStartimpl = TextRange.m6123getStartimpl(jM1446getSelectiond9O1mEE);
        } else if (i2 == 3) {
            iM6123getStartimpl = TextRange.m6118getEndimpl(jM1446getSelectiond9O1mEE);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        TextLayoutResult layoutResult = textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            return Offset.Companion.m3952getUnspecifiedF1C5BW0();
        }
        float fM3937getXimpl = Offset.m3937getXimpl(jM1607getHandleDragPositionF1C5BW0);
        int lineForOffset = layoutResult.getLineForOffset(iM6123getStartimpl);
        float lineLeft = layoutResult.getLineLeft(lineForOffset);
        float lineRight = layoutResult.getLineRight(lineForOffset);
        float fCoerceIn = RangesKt.coerceIn(fM3937getXimpl, Math.min(lineLeft, lineRight), Math.max(lineLeft, lineRight));
        if (!IntSize.m6806equalsimpl0(j2, IntSize.Companion.m6813getZeroYbymL2g()) && Math.abs(fM3937getXimpl - fCoerceIn) > IntSize.m6808getWidthimpl(j2) / 2) {
            return Offset.Companion.m3952getUnspecifiedF1C5BW0();
        }
        float lineTop = layoutResult.getLineTop(lineForOffset);
        long jOffset = OffsetKt.Offset(fCoerceIn, ((layoutResult.getLineBottom(lineForOffset) - lineTop) / 2) + lineTop);
        LayoutCoordinates textLayoutNodeCoordinates = textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates != null) {
            if (!textLayoutNodeCoordinates.isAttached()) {
                textLayoutNodeCoordinates = null;
            }
            if (textLayoutNodeCoordinates != null) {
                jOffset = TextLayoutStateKt.m1558coerceIn3MmeM6k(jOffset, SelectionManagerKt.visibleBounds(textLayoutNodeCoordinates));
            }
        }
        return TextLayoutStateKt.m1560fromTextLayoutToCoreUv8p0NA(textLayoutState, jOffset);
    }
}
