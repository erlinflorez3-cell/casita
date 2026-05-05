package androidx.compose.material3;

import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import com.braze.models.inappmessage.InAppMessageBase;
import com.google.firebase.messaging.Constants;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: NavigationItem.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯP\u001d<K!&i\u0016DLш|\u0004O\u000f8é6B\u0015\"4\u0012\u0006\fnʑA0ZeP.X`2\u000fy\u0002<$q$yّCU(\u001c*\teNogtJb\u000bY\u000f\u000e\u0016\u000fj4Ikxe܈\u00172XoG3SpC9vҚf\u0005N1bq\n\t\u000f\u001aBH>w\u000bMY\u000e*6PrJR;Q3\u001d\"\nL%\u0019\u001e\u000bm^:Vsu:])\u0013mPV?_^\u0003]\u0011T]?\r%gӿ/@E?]Ea\u0018\u001fR\nU+? T5r5?CO\u0004YFX..CD\u007f\u0011k\u000e>\\3g' oU]\u007fcP<E z*+l\u000e\u001c\u001e?N>/*f6-a\u000e#WNp\u001a^p!Auڠ\u0016ӛő7-?=tt2P'PO\u0002\u0015\u000f.#/rO^ڍ\u0012f\u001dÑlyW<_L\u000eW\\\nq=\u001c\u0005Ͳf\b2ʶHI\u0006<\n\u001f~.3<s9Q'ɶ\u0001҆جfuݶdp[i`YX$t%E:Y#hL|\u0005\u001aVղW\u008cԃL\u001bΤ\u000b\u0006\u0010\u0013.m\u0010>'7\u001e^ \u007fwqe]8+ĽeŽףmjް[Af3Cb{\u0012ge\u0005$\u0010Sp\u000epfpY݇Y٢Ξ!1ʮn\u0018\u007f{R_$\u00158S\u007f,ؼ,:!_\u001bȟ\u001fLAI|\u000f~˜l4"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e/@={*@W#\u0012KMDU=%)Pa5\u0015s9Na1NPL@2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7X 5QAOA", "6`b\u0019T)>Z", "", "/mX:T;B]\"i\bh.\n\t=s", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "7mS6V(M]&a\u0005k0\u0012\u00138t{/f<\u007f\u0016\u001bPq", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "7mS6V(M]&ozk;\u0001\u0007+lj$z?\u0005 \u0019", "7mS6V(M]&m\u0005E(y\t6V\u007f5\u000bD~\u0013\u001e2k\r;z.7", "Bn_\u0016V6G7(~\u0003O,\n\u00183c{/f<\u007f\u0016\u001bPq", "uY;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHu\u0018Nv\u000f4IEz;\"\u001e2fJ\u000f-0W\u0006'TUJ3&1r>\u0010\"a\u001d,5\u0016\u0013hN4lSA,o(V\b;uVO\u0007", "5dc\u000ea0FO(\u0003\u0005g\u0017\n\u00131r\u007f6\n", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHu", "5dc\u0015T:%O\u0016~\u0002", "u(I", "5dc\u0016a+BQ\u0015\u000e\u0005k\u000f\u0007\u00163z\n1\u000b<\b\u0002\u0013Fn\u0012Exl\u0014-]%\u0007n}", "u(5", "\u0014", "5dc\u0016a+BQ\u0015\u000e\u0005k\u001b\u0007o+b\u007f/l@\u000e&\u001bEk\u0015'r$4]\u0007\"~Li\u000eR\u0013<S", "5dc\u0016a+BQ\u0015\u000e\u0005k\u001d|\u0016>i}$\u0003+|\u0016\u0016Kx\u0010\u0004Ux\u0015^M!\u001f", "5dc!b7\"Q#\b^m,\u0005y/r\u000f,y<\b\u0002\u0013Fn\u0012Exl\u0014-]%\u0007n}", ";`g\u0016a;KW\"\r~\\\u000f|\r1h\u000f", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006Z.Df\u0002)Eq\u0014\u0016M?I{A\u001e\u0003fkD\u00079", ";dP@h9:P ~\t", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006Z.Df\u0002)Eq\u0014\u0016M?I{A\u001a\u0012oa\u000f", "EhSA[", ";dP@h9>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7[\u00148XC\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-3j\u001d.#", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", ";dP@h9>\u001bf\nGl~G\u0017", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\r5U\f0Dm\u0004,WN;A\u001b#\u0011y]\u0003\u0017r0U@\u000eKZ]\u0002A\u0016Y9\u001d\u0011g\u0018R* NWK,yNE\u001fQ<MKBd\u0015\u0016&\u001d~Rp>d Ty\u0002uO9oU/", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class TopIconOrIconOnlyMeasurePolicy implements MeasurePolicy {
    private final Function0<Float> animationProgress;
    private final boolean hasLabel;
    private final float indicatorHorizontalPadding;
    private final float indicatorToLabelVerticalPadding;
    private final float indicatorVerticalPadding;
    private final float topIconItemVerticalPadding;

    public /* synthetic */ TopIconOrIconOnlyMeasurePolicy(boolean z2, Function0 function0, float f2, float f3, float f4, float f5, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2, function0, f2, f3, f4, f5);
    }

    private TopIconOrIconOnlyMeasurePolicy(boolean z2, Function0<Float> function0, float f2, float f3, float f4, float f5) {
        this.hasLabel = z2;
        this.animationProgress = function0;
        this.indicatorHorizontalPadding = f2;
        this.indicatorVerticalPadding = f3;
        this.indicatorToLabelVerticalPadding = f4;
        this.topIconItemVerticalPadding = f5;
    }

    public final boolean getHasLabel() {
        return this.hasLabel;
    }

    public final Function0<Float> getAnimationProgress() {
        return this.animationProgress;
    }

    /* JADX INFO: renamed from: getIndicatorHorizontalPadding-D9Ej5fM, reason: not valid java name */
    public final float m2883getIndicatorHorizontalPaddingD9Ej5fM() {
        return this.indicatorHorizontalPadding;
    }

    /* JADX INFO: renamed from: getIndicatorVerticalPadding-D9Ej5fM, reason: not valid java name */
    public final float m2885getIndicatorVerticalPaddingD9Ej5fM() {
        return this.indicatorVerticalPadding;
    }

    /* JADX INFO: renamed from: getIndicatorToLabelVerticalPadding-D9Ej5fM, reason: not valid java name */
    public final float m2884getIndicatorToLabelVerticalPaddingD9Ej5fM() {
        return this.indicatorToLabelVerticalPadding;
    }

    /* JADX INFO: renamed from: getTopIconItemVerticalPadding-D9Ej5fM, reason: not valid java name */
    public final float m2886getTopIconItemVerticalPaddingD9Ej5fM() {
        return this.topIconItemVerticalPadding;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo375measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j2) {
        float fFloatValue = this.animationProgress.invoke().floatValue();
        long jM6582copyZbe2FdA$default = Constraints.m6582copyZbe2FdA$default(j2, 0, 0, 0, 0, 10, null);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Measurable measurable = list.get(i2);
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), InAppMessageBase.ICON)) {
                float f2 = 2;
                Placeable placeableMo5514measureBRTryo0 = measurable.mo5514measureBRTryo0(ConstraintsKt.m6610offsetNN6EwU(jM6582copyZbe2FdA$default, -measureScope.mo704roundToPx0680j_4(Dp.m6638constructorimpl(this.indicatorHorizontalPadding * f2)), -measureScope.mo704roundToPx0680j_4(Dp.m6638constructorimpl(this.indicatorVerticalPadding * f2))));
                int width = placeableMo5514measureBRTryo0.getWidth() + measureScope.mo704roundToPx0680j_4(Dp.m6638constructorimpl(this.indicatorHorizontalPadding * f2));
                int height = placeableMo5514measureBRTryo0.getHeight() + measureScope.mo704roundToPx0680j_4(Dp.m6638constructorimpl(this.indicatorVerticalPadding * f2));
                int iRoundToInt = MathKt.roundToInt(width * fFloatValue);
                int size2 = list.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    Measurable measurable2 = list.get(i3);
                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "indicatorRipple")) {
                        Placeable placeableMo5514measureBRTryo02 = measurable2.mo5514measureBRTryo0(ConstraintsKt.m6606constrainN9IONVI(jM6582copyZbe2FdA$default, Constraints.Companion.m6601fixedJhjzzOo(width, height)));
                        int size3 = list.size();
                        for (int i4 = 0; i4 < size3; i4++) {
                            Measurable measurable3 = list.get(i4);
                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable3), "indicator")) {
                                Placeable placeableMo5514measureBRTryo03 = measurable3.mo5514measureBRTryo0(ConstraintsKt.m6606constrainN9IONVI(jM6582copyZbe2FdA$default, Constraints.Companion.m6601fixedJhjzzOo(iRoundToInt, height)));
                                if (!this.hasLabel) {
                                    return NavigationItemKt.m2335placeIconX9ElhV4(measureScope, placeableMo5514measureBRTryo0, placeableMo5514measureBRTryo02, placeableMo5514measureBRTryo03, j2);
                                }
                                int size4 = list.size();
                                for (int i5 = 0; i5 < size4; i5++) {
                                    Measurable measurable4 = list.get(i5);
                                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable4), Constants.ScionAnalytics.PARAM_LABEL)) {
                                        return NavigationItemKt.m2337placeLabelAndTopIconqoqLrGI(measureScope, measurable4.mo5514measureBRTryo0(ConstraintsKt.m6611offsetNN6EwU$default(jM6582copyZbe2FdA$default, 0, -(placeableMo5514measureBRTryo03.getHeight() + measureScope.mo704roundToPx0680j_4(this.indicatorToLabelVerticalPadding)), 1, null)), placeableMo5514measureBRTryo0, placeableMo5514measureBRTryo02, placeableMo5514measureBRTryo03, j2, this.indicatorToLabelVerticalPadding, this.indicatorVerticalPadding, this.topIconItemVerticalPadding);
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        IntrinsicMeasurable intrinsicMeasurable;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            IntrinsicMeasurable intrinsicMeasurable2 = list.get(i3);
            if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable2), InAppMessageBase.ICON)) {
                int iMaxIntrinsicHeight = intrinsicMeasurable2.maxIntrinsicHeight(i2);
                int size2 = list.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size2) {
                        intrinsicMeasurable = null;
                        break;
                    }
                    intrinsicMeasurable = list.get(i4);
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable), Constants.ScionAnalytics.PARAM_LABEL)) {
                        break;
                    }
                    i4++;
                }
                IntrinsicMeasurable intrinsicMeasurable3 = intrinsicMeasurable;
                int iMaxIntrinsicHeight2 = intrinsicMeasurable3 != null ? intrinsicMeasurable3.maxIntrinsicHeight(i2) : 0;
                float f2 = 2;
                return iMaxIntrinsicHeight + iMaxIntrinsicHeight2 + intrinsicMeasureScope.mo704roundToPx0680j_4(Dp.m6638constructorimpl(Dp.m6638constructorimpl(Dp.m6638constructorimpl(this.topIconItemVerticalPadding * f2) + Dp.m6638constructorimpl(this.indicatorVerticalPadding * f2)) + this.indicatorToLabelVerticalPadding));
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
