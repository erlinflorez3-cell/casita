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
@Metadata(bv = {}, d1 = {"ЯJ\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b<G\u0007Ӭ4\u0012\u000e\u0007nj?9LeV4ZS@\u000fsڔ<$iByCQU\"}(\u000bWN}gvJp\u000bK\u000f\u001c\u0016\u0001̓4Ikxe\u0012\u00153HoU\u074c}ok8!\u001eF\u000f.2:>\n\u0007\u0011\u001aXJ>w\u000bGY\u000f*0ntJV\u001bR\u001d\u001a@\nN$\u000f$tg|:Ղp]H6k#wQf'\u000e@%M;W\u00051\u001b\ty$;BG5C9\u0002\u00167ViT\u001b? MK|oG9_\fWdh(\u0014C<\u007f\u0017k\u0005>b\u0015Sp\fU?}v{T\u001c?\u0010z*\u001d\u0003\u0018V05`F-H\u007f0\u000ea\u000f#]Nb\u001adR\u0002\u000bad2S\u0013c/G7~Q\u0010X_bӒz˜ڟ\"%\u0007\r/z%#n\u00153Z\bSAQn?vŎ]CuՎ\td\b2\u00129\u0018\u0017=~).E)ܔZݽٳ jɘLLov\u0013l\u0001Uo\\VKr\u0006$<B\t:^מcʍÐOSг0\u0019U\u001cb\u0013\u0016\n\u0019-j\u0003\r83\u0016fO\u0017mԍLΪݼ$.Ϭ;avk\u001ccQ`9C_n߇a[~\u0017Eל~3WnBY+ɀ`H"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d41f\r\u00045w\u001f\u0016M?I{A\u001e\u007frh=\u0005w\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7X 5QAOA", "/mX:T;B]\"i\bh.\n\t=s", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "7mS6V(M]&a\u0005k0\u0012\u00138t{/f<\u007f\u0016\u001bPq", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "7mS6V(M]&ozk;\u0001\u0007+lj$z?\u0005 \u0019", "AsP?g\u0010<]\"m\u0005E(y\t6H\n5\u007fU\u000b &Cvx8u$9b\u007f", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$S\u0001\u0018N|4WRBo=g\u001ayi\u0003\u000bl;N\u00040CS\u0018\u000b\\SnM\u001b!8\u0018W9\u001c\u0012i?3xQ\u001f\u001b\u00152I\u000f\u0011,q", "5dc\u000ea0FO(\u0003\u0005g\u0017\n\u00131r\u007f6\n", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHu", "5dc\u0016a+BQ\u0015\u000e\u0005k\u000f\u0007\u00163z\n1\u000b<\b\u0002\u0013Fn\u0012Exl\u0014-]%\u0007n}", "u(5", "\u0014", "5dc\u0016a+BQ\u0015\u000e\u0005k\u001d|\u0016>i}$\u0003+|\u0016\u0016Kx\u0010\u0004Ux\u0015^M!\u001f", "5dc g(Kb||\u0005g\u001b\u0007o+b\u007f/^J\u000e\u001b,Qx\u001d8}\u00101X|$@o]\r!#@;5\u0006", ";`g\u0016a;KW\"\r~\\\u000f|\r1h\u000f", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006Z.Df\u0002)Eq\u0014\u0016M?I{A\u001e\u0003fkD\u00079", ";dP@h9:P ~\t", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006Z.Df\u0002)Eq\u0014\u0016M?I{A\u001a\u0012oa\u000f", "EhSA[", ";`g\u0016a;KW\"\r~\\\u001e\u0001\b>h", "6dX4[;", ";dP@h9>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7[\u00148XC\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-3j\u001d.#", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", ";dP@h9>\u001bf\nGl~G\u0017", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\r5U\f0Dm\u0004,WN;A\u001b#\u0011y]\u0003\u0017r0U@\u000eKZ]\u0002A\u0016Y9\u001d\u0011g\u0018R* NWK,yNE\u001fQ<MKBd\u0015\u0016&\u001d~Rp>d Ty\u0002uO9oU/", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class StartIconMeasurePolicy implements MeasurePolicy {
    private final Function0<Float> animationProgress;
    private final float indicatorHorizontalPadding;
    private final float indicatorVerticalPadding;
    private final float startIconToLabelHorizontalPadding;

    public /* synthetic */ StartIconMeasurePolicy(Function0 function0, float f2, float f3, float f4, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, f2, f3, f4);
    }

    private StartIconMeasurePolicy(Function0<Float> function0, float f2, float f3, float f4) {
        this.animationProgress = function0;
        this.indicatorHorizontalPadding = f2;
        this.indicatorVerticalPadding = f3;
        this.startIconToLabelHorizontalPadding = f4;
    }

    public final Function0<Float> getAnimationProgress() {
        return this.animationProgress;
    }

    /* JADX INFO: renamed from: getIndicatorHorizontalPadding-D9Ej5fM, reason: not valid java name */
    public final float m2550getIndicatorHorizontalPaddingD9Ej5fM() {
        return this.indicatorHorizontalPadding;
    }

    /* JADX INFO: renamed from: getIndicatorVerticalPadding-D9Ej5fM, reason: not valid java name */
    public final float m2551getIndicatorVerticalPaddingD9Ej5fM() {
        return this.indicatorVerticalPadding;
    }

    /* JADX INFO: renamed from: getStartIconToLabelHorizontalPadding-D9Ej5fM, reason: not valid java name */
    public final float m2552getStartIconToLabelHorizontalPaddingD9Ej5fM() {
        return this.startIconToLabelHorizontalPadding;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo375measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j2) {
        float fFloatValue = this.animationProgress.invoke().floatValue();
        long jM6582copyZbe2FdA$default = Constraints.m6582copyZbe2FdA$default(j2, 0, 0, 0, 0, 10, null);
        float f2 = 2;
        long jM6610offsetNN6EwU = ConstraintsKt.m6610offsetNN6EwU(jM6582copyZbe2FdA$default, -measureScope.mo704roundToPx0680j_4(Dp.m6638constructorimpl(this.indicatorHorizontalPadding * f2)), -measureScope.mo704roundToPx0680j_4(Dp.m6638constructorimpl(this.indicatorVerticalPadding * f2)));
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Measurable measurable = list.get(i2);
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), InAppMessageBase.ICON)) {
                Placeable placeableMo5514measureBRTryo0 = measurable.mo5514measureBRTryo0(jM6610offsetNN6EwU);
                int size2 = list.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    Measurable measurable2 = list.get(i3);
                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), Constants.ScionAnalytics.PARAM_LABEL)) {
                        Placeable placeableMo5514measureBRTryo02 = measurable2.mo5514measureBRTryo0(ConstraintsKt.m6611offsetNN6EwU$default(jM6610offsetNN6EwU, -(placeableMo5514measureBRTryo0.getWidth() + measureScope.mo704roundToPx0680j_4(this.startIconToLabelHorizontalPadding)), 0, 2, null));
                        int width = placeableMo5514measureBRTryo0.getWidth() + placeableMo5514measureBRTryo02.getWidth() + measureScope.mo704roundToPx0680j_4(Dp.m6638constructorimpl(this.startIconToLabelHorizontalPadding + Dp.m6638constructorimpl(this.indicatorHorizontalPadding * f2)));
                        int iMax = Math.max(placeableMo5514measureBRTryo0.getHeight(), placeableMo5514measureBRTryo02.getHeight()) + measureScope.mo704roundToPx0680j_4(Dp.m6638constructorimpl(this.indicatorVerticalPadding * f2));
                        int iRoundToInt = MathKt.roundToInt(width * fFloatValue);
                        int size3 = list.size();
                        for (int i4 = 0; i4 < size3; i4++) {
                            Measurable measurable3 = list.get(i4);
                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable3), "indicatorRipple")) {
                                Placeable placeableMo5514measureBRTryo03 = measurable3.mo5514measureBRTryo0(ConstraintsKt.m6606constrainN9IONVI(jM6582copyZbe2FdA$default, Constraints.Companion.m6601fixedJhjzzOo(width, iMax)));
                                int size4 = list.size();
                                for (int i5 = 0; i5 < size4; i5++) {
                                    Measurable measurable4 = list.get(i5);
                                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable4), "indicator")) {
                                        return NavigationItemKt.m2336placeLabelAndStartIconnru01g4(measureScope, placeableMo5514measureBRTryo02, placeableMo5514measureBRTryo0, placeableMo5514measureBRTryo03, measurable4.mo5514measureBRTryo0(ConstraintsKt.m6606constrainN9IONVI(jM6582copyZbe2FdA$default, Constraints.Companion.m6601fixedJhjzzOo(iRoundToInt, iMax))), j2, this.startIconToLabelHorizontalPadding);
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
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i3);
            if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable), InAppMessageBase.ICON)) {
                int iMaxIntrinsicWidth = intrinsicMeasurable.maxIntrinsicWidth(i2);
                int size2 = list.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    IntrinsicMeasurable intrinsicMeasurable2 = list.get(i4);
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable2), Constants.ScionAnalytics.PARAM_LABEL)) {
                        return iMaxIntrinsicWidth + intrinsicMeasurable2.maxIntrinsicWidth(i2) + intrinsicMeasureScope.mo704roundToPx0680j_4(Dp.m6638constructorimpl(Dp.m6638constructorimpl(this.indicatorHorizontalPadding * 2) + this.startIconToLabelHorizontalPadding));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i3);
            if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable), InAppMessageBase.ICON)) {
                int iMaxIntrinsicHeight = intrinsicMeasurable.maxIntrinsicHeight(i2);
                int size2 = list.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    IntrinsicMeasurable intrinsicMeasurable2 = list.get(i4);
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable2), Constants.ScionAnalytics.PARAM_LABEL)) {
                        return Math.max(iMaxIntrinsicHeight, intrinsicMeasurable2.maxIntrinsicHeight(i2)) + intrinsicMeasureScope.mo704roundToPx0680j_4(Dp.m6638constructorimpl(this.indicatorVerticalPadding * 2));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
