package androidx.compose.foundation;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
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
/* JADX INFO: compiled from: RectListNode.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007\"B\u0012\u007f\u0007|jA0JeP.hS2\u000fq}<$q$yCAX\"}8\tWȞog|Jb\u000bI\u0014\f4\u000f̓\\I\u0004w\u000e\u0012=2\u0003\tOE[pUGpvF\u0005N52:\n\u0005/\u001e@G>xټGK\u001a\u0017xV~Ij\r{\fJ\u0016\u0014N8\u0001L_\u0018RDI\u0005]h3i\u00032N\\8w6\rO\u001dF\u0003.;\t(BsFEH-%\u0002\u0017Mf$M\u0011T\n=3|W+9_\fWd[F(];]$urTp5Wn$?-ebyWT(@\u000f\n&T\u0004<\u001aWR<G2l\u0018\u0010Ct!ZnbH\u0003\u0013\u000e\tgN\u0019;~a2\u0010ӘrЂe;!\u05cb\b\"\u0013\u000e61\u0011p1[\u0003\u0011p\u0017+T&UGPn?\u001fݧ\u0016ՒAy\f͏z\u00040\f>P 1\u0002\u001b<\u001cuIiD;!\u001a\u000e~\u0007>Ͻ\u0007¾lW\u0002TNM0|ޔ;E"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u00125W\r\u0007;{%\u0017WB;A", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004c\u001ec| \r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9oC\u0001\"1`h*Eq%2WL\u0017}0+\u0015Pk8\u000bd0N\u0004\u0010QKN\u0002", "@dRA", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/\u0015w ;LGDgC\u001e#>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%Sc(", "/mS?b0=@\u0019|\n", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0015{>\u0010l", "5dc\u001fX*M", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "Adc\u001fX*M", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "5dc#\\,P", "u(;.a+K]\u001d}Do0|\u001bxV\u0004(\u000e\u0016", "1`[056N\\\u0018\r", ":`h<h;\u001c]#\fyb5x\u0018/s", "1ta?X5M@\u0019|\nl", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\fF},5W\r$Av_\u0016]R7h;\u001e\u0006h_H\u0011p\u0002", "=m32g(<V", "", "=m69b):Z \u0013eh:\u0001\u00183o\t(z", "1n^?W0GO(~\t", "@d_9T*>@\u0019|\n", "<df\u001fX*M", "CoS.g,+S\u0017\u000e\t", "@dRAf", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class RectListNode extends Modifier.Node implements GlobalPositionAwareModifierNode {
    public static final int $stable = 8;
    private Rect androidRect;
    private Function1<? super LayoutCoordinates, androidx.compose.ui.geometry.Rect> rect;

    public abstract MutableVector<Rect> currentRects();

    public abstract void updateRects(MutableVector<Rect> mutableVector);

    public Function1<LayoutCoordinates, androidx.compose.ui.geometry.Rect> getRect() {
        return this.rect;
    }

    public void setRect(Function1<? super LayoutCoordinates, androidx.compose.ui.geometry.Rect> function1) {
        this.rect = function1;
    }

    public RectListNode(Function1<? super LayoutCoordinates, androidx.compose.ui.geometry.Rect> function1) {
        this.rect = function1;
    }

    protected final View getView() {
        return DelegatableNode_androidKt.requireView(this);
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates layoutCoordinates) {
        Rect rectCalcBounds;
        if (getRect() == null) {
            androidx.compose.ui.geometry.Rect rectBoundsInRoot = LayoutCoordinatesKt.boundsInRoot(layoutCoordinates);
            rectCalcBounds = new Rect(MathKt.roundToInt(rectBoundsInRoot.getLeft()), MathKt.roundToInt(rectBoundsInRoot.getTop()), MathKt.roundToInt(rectBoundsInRoot.getRight()), MathKt.roundToInt(rectBoundsInRoot.getBottom()));
        } else {
            Function1<LayoutCoordinates, androidx.compose.ui.geometry.Rect> rect = getRect();
            Intrinsics.checkNotNull(rect);
            rectCalcBounds = calcBounds(layoutCoordinates, rect.invoke(layoutCoordinates));
        }
        replaceRect(rectCalcBounds);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        super.onDetach();
        replaceRect(null);
    }

    private final void replaceRect(Rect rect) {
        MutableVector<Rect> mutableVectorCurrentRects = currentRects();
        Rect rect2 = this.androidRect;
        if (rect2 != null) {
            mutableVectorCurrentRects.remove(rect2);
        }
        if (rect != null && !rect.isEmpty()) {
            mutableVectorCurrentRects.add(rect);
        }
        updateRects(mutableVectorCurrentRects);
        this.androidRect = rect;
    }

    private final Rect calcBounds(LayoutCoordinates layoutCoordinates, androidx.compose.ui.geometry.Rect rect) {
        LayoutCoordinates layoutCoordinatesFindRootCoordinates = LayoutCoordinatesKt.findRootCoordinates(layoutCoordinates);
        long jMo5523localPositionOfR5De75A = layoutCoordinatesFindRootCoordinates.mo5523localPositionOfR5De75A(layoutCoordinates, rect.m3972getTopLeftF1C5BW0());
        long jMo5523localPositionOfR5De75A2 = layoutCoordinatesFindRootCoordinates.mo5523localPositionOfR5De75A(layoutCoordinates, rect.m3973getTopRightF1C5BW0());
        long jMo5523localPositionOfR5De75A3 = layoutCoordinatesFindRootCoordinates.mo5523localPositionOfR5De75A(layoutCoordinates, rect.m3965getBottomLeftF1C5BW0());
        long jMo5523localPositionOfR5De75A4 = layoutCoordinatesFindRootCoordinates.mo5523localPositionOfR5De75A(layoutCoordinates, rect.m3966getBottomRightF1C5BW0());
        return new Rect(MathKt.roundToInt(ComparisonsKt.minOf(Offset.m3937getXimpl(jMo5523localPositionOfR5De75A), Offset.m3937getXimpl(jMo5523localPositionOfR5De75A2), Offset.m3937getXimpl(jMo5523localPositionOfR5De75A3), Offset.m3937getXimpl(jMo5523localPositionOfR5De75A4))), MathKt.roundToInt(ComparisonsKt.minOf(Offset.m3938getYimpl(jMo5523localPositionOfR5De75A), Offset.m3938getYimpl(jMo5523localPositionOfR5De75A2), Offset.m3938getYimpl(jMo5523localPositionOfR5De75A3), Offset.m3938getYimpl(jMo5523localPositionOfR5De75A4))), MathKt.roundToInt(ComparisonsKt.maxOf(Offset.m3937getXimpl(jMo5523localPositionOfR5De75A), Offset.m3937getXimpl(jMo5523localPositionOfR5De75A2), Offset.m3937getXimpl(jMo5523localPositionOfR5De75A3), Offset.m3937getXimpl(jMo5523localPositionOfR5De75A4))), MathKt.roundToInt(ComparisonsKt.maxOf(Offset.m3938getYimpl(jMo5523localPositionOfR5De75A), Offset.m3938getYimpl(jMo5523localPositionOfR5De75A2), Offset.m3938getYimpl(jMo5523localPositionOfR5De75A3), Offset.m3938getYimpl(jMo5523localPositionOfR5De75A4))));
    }
}
