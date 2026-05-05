package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.tokens.BadgeTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
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
/* JADX INFO: compiled from: Badge.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯD\u001d̉=!4i\bDJk|\u0004O\u00068é6B\u0015\"4ߚ\u007f\u0007|jA0JeP.hS2\u000f\u0002{<$q$yCQU\"}(\u000bWN}gvJ`\fK\u000f\u0014\u001b\u0001j2JmIk\u001b'2pyo9SoKDxtd\u0011P8(8\b\u0012\u0019\u001aXV@|\u0001CY\u001b*0n~jp\u0013M\u0013**\u001eN\"\u0011\u001e\u000by^8Xl\fDE\"1zŌR'eCƊQ\rLhm\u0012ɱ`ӜҋD9;*3i\u001bX`rW\u0003m{m\u001fv??AYug6\u0007\u0019$\u0017;O;g!7ػ\tQf\u001fˏ/Oi_\u0001\u0014.w\t\u0007%<2\u001a6AV>E0v\n\u001e3#\fcB`\u0002\rL.\fˋ:\u0017+\u0013Ĵ/9!z\u0018fޅ\u001dNE\u0016%!,ŀ\u0019nOZ+זbڠ\u001f\\\u007fQ?SX?NN\u0018Z]\u0002\u0012sz\u0002X\u0003\u0007ϛ\u0002\u009e\u007f\u00196\u001739s;)%y\u0003hXu{\u001d`\u0017R@ɮJغ&v\u001e78\u000b$\\Jj\u0013lphf3)MJS]ã\n˙$d\u007f</'(PUpwkܗ]\u000f-2lƟu\u001dj\u07b6[Tԇ7=_\u007f(a\u0001\u0014j̾\u05c9bۦ\\nPq$Z\u000bExĀʚjދ{\u0004Rm$\u0013`\\Hʔو,֮\u001dd#h\u001b\u001ep^SȌݯZ"}, d2 = {"\u0010`S4X\u0016?T'~\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "5dc\u000fT+@S\u0003\u007f{l,\f", "u(5", "\u0014", "\u0010`S4X\u001eBb\u001c\\\u0005g;|\u0012>H\n5\u007fU\u000b &Cvw=w35h", "5dc\u000fT+@S\u000b\u0003\na\n\u0007\u0012>e\t7^J\u000e\u001b,Qx\u001d8}\u000f6Z\f F", "\u0010`S4X\u001eBb\u001c\\\u0005g;|\u0012>H\n5\u007fU\u000b &Cvx8u$9b\u007f", "5dc\u000fT+@S\u000b\u0003\na\n\u0007\u0012>e\t7^J\u000e\u001b,Qx\u001d8}\u00101X|$@o", "\u0010`S4X\u001eBb\u001c\\\u0005g;|\u0012>V\u007f5\u000bD~\u0013\u001e1p\u000fJv4", "5dc\u000fT+@S\u000b\u0003\na\n\u0007\u0012>e\t7l@\u000e&\u001bEk\u0015&w&CY\r", "\u0010`S4X", "", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "1n]AT0GS&\\\u0005e6\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "1n]AX5M1#\u0006\u0005k", "1n]AX5M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u00038_19u?\u001ej", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "\u0010`S4Xs>]$[\u007fAv", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b>b\u0007=w%5QL\u0005pE&^iqB\u0005r0X\u007f5\u0011-^5ZavG\u001d_0tJ4\f\u0012cE#\u0002\u000e5)\u00107S\u0010;2\u000e\u001c\u001f\u001d9rp\f4\u001aO\u0005\u001f\u0004A6>*=#j", "\u0010`S4X+\u001b],", "0`S4X", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7r8`19u?\u001ej", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>'S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu^zp/VM0]VrJix`\u0018]2\u0011\u000e#F5v\u000e8/\u0011*X\u0006Eq\u000fUv\u001e>h\u007fF`\u0019\u0015O{qJ(uP]^\r\u0011?Oj5n\u001a_fiJC3\u0018y\u0019dFZ6\u0015\u0006a\u0011\u007f(]K+8", ";`c2e0:Zfx\b^3|\u0005=e", ":`h<h;\u001aP'\t\u0002n;|o/f\u000f", "", ":`h<h;\u001aP'\t\u0002n;|w9p", "5qT.g\u000eKO\"}eZ9|\u0012>A|6\u0006G\u0011&\u00174s\u0010?\u0006", "5qT.g\u000eKO\"}eZ9|\u0012>A|6\u0006G\u0011&\u00176y\u0019"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class BadgeKt {
    private static final float BadgeWithContentHorizontalPadding = Dp.m6638constructorimpl(4);
    private static final float BadgeWithContentHorizontalOffset = Dp.m6638constructorimpl(12);
    private static final float BadgeWithContentVerticalOffset = Dp.m6638constructorimpl(14);
    private static final float BadgeOffset = Dp.m6638constructorimpl(6);

    public static final void BadgedBox(final Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function3, Modifier modifier, final Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function32, Composer composer, final int i2, final int i3) {
        int i4;
        final Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(1404022535);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(BadgedBox)P(!1,2)73@2898L36,74@2964L36,77@3183L57,78@3280L57,90@3679L680,102@4366L2713,80@3343L3736:Badge.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = (i2 + 6) - (i2 & 6);
        } else if ((i2 & 6) == 0) {
            i4 = (-1) - (((-1) - (composerStartRestartGroup.changedInstance(function3) ? 4 : 2)) & ((-1) - i2));
        } else {
            i4 = i2;
        }
        int i5 = (i3 + 2) - (i3 | 2);
        if (i5 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 48));
        } else if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            i4 |= composerStartRestartGroup.changed(companion) ? 32 : 16;
        }
        if ((i3 + 4) - (i3 | 4) != 0) {
            i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function32) ? 256 : 128;
        }
        if ((i4 + 147) - (147 | i4) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i5 != 0) {
                companion = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1404022535, i4, -1, "androidx.compose.material3.BadgedBox (Badge.kt:72)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 437752587, "CC(remember):Badge.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableFloatState mutableFloatState = (MutableFloatState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 437754699, "CC(remember):Badge.kt#9igjgp");
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final MutableFloatState mutableFloatState2 = (MutableFloatState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 437761728, "CC(remember):Badge.kt#9igjgp");
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = PrimitiveSnapshotStateKt.mutableFloatStateOf(Float.POSITIVE_INFINITY);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final MutableFloatState mutableFloatState3 = (MutableFloatState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 437764832, "CC(remember):Badge.kt#9igjgp");
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = PrimitiveSnapshotStateKt.mutableFloatStateOf(Float.NEGATIVE_INFINITY);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            final MutableFloatState mutableFloatState4 = (MutableFloatState) objRememberedValue4;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 437778223, "CC(remember):Badge.kt#9igjgp");
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                objRememberedValue5 = (Function1) new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.material3.BadgeKt$BadgedBox$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                        invoke2(layoutCoordinates);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(LayoutCoordinates layoutCoordinates) {
                        LayoutCoordinates parentLayoutCoordinates;
                        Rect rectBoundsInWindow = LayoutCoordinatesKt.boundsInWindow(layoutCoordinates);
                        mutableFloatState.setFloatValue(rectBoundsInWindow.getLeft());
                        mutableFloatState2.setFloatValue(rectBoundsInWindow.getTop());
                        LayoutCoordinates parentLayoutCoordinates2 = layoutCoordinates.getParentLayoutCoordinates();
                        LayoutCoordinates parentCoordinates = (parentLayoutCoordinates2 == null || (parentLayoutCoordinates = parentLayoutCoordinates2.getParentLayoutCoordinates()) == null) ? null : parentLayoutCoordinates.getParentCoordinates();
                        if (parentCoordinates != null) {
                            MutableFloatState mutableFloatState5 = mutableFloatState3;
                            MutableFloatState mutableFloatState6 = mutableFloatState4;
                            Rect rectBoundsInWindow2 = LayoutCoordinatesKt.boundsInWindow(parentCoordinates);
                            mutableFloatState5.setFloatValue(rectBoundsInWindow2.getRight());
                            mutableFloatState6.setFloatValue(rectBoundsInWindow2.getTop());
                        }
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(companion, (Function1) objRememberedValue5);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 437802240, "CC(remember):Badge.kt#9igjgp");
            MeasurePolicy measurePolicyRememberedValue = composerStartRestartGroup.rememberedValue();
            if (measurePolicyRememberedValue == Composer.Companion.getEmpty()) {
                measurePolicyRememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.BadgeKt$BadgedBox$3$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* JADX INFO: renamed from: measure-3p2s80s */
                    public final MeasureResult mo375measure3p2s80s(final MeasureScope measureScope, List<? extends Measurable> list, long j2) {
                        int size = list.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            Measurable measurable = list.get(i6);
                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "badge")) {
                                final Placeable placeableMo5514measureBRTryo0 = measurable.mo5514measureBRTryo0(Constraints.m6582copyZbe2FdA$default(j2, 0, 0, 0, 0, 11, null));
                                int size2 = list.size();
                                for (int i7 = 0; i7 < size2; i7++) {
                                    Measurable measurable2 = list.get(i7);
                                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "anchor")) {
                                        final Placeable placeableMo5514measureBRTryo02 = measurable2.mo5514measureBRTryo0(j2);
                                        int i8 = placeableMo5514measureBRTryo02.get(AlignmentLineKt.getFirstBaseline());
                                        int i9 = placeableMo5514measureBRTryo02.get(AlignmentLineKt.getLastBaseline());
                                        int width = placeableMo5514measureBRTryo02.getWidth();
                                        int height = placeableMo5514measureBRTryo02.getHeight();
                                        Map<AlignmentLine, Integer> mapMapOf = MapsKt.mapOf(TuplesKt.to(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(i8)), TuplesKt.to(AlignmentLineKt.getLastBaseline(), Integer.valueOf(i9)));
                                        final MutableFloatState mutableFloatState5 = mutableFloatState2;
                                        final MutableFloatState mutableFloatState6 = mutableFloatState;
                                        final MutableFloatState mutableFloatState7 = mutableFloatState3;
                                        final MutableFloatState mutableFloatState8 = mutableFloatState4;
                                        return measureScope.layout(width, height, mapMapOf, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.BadgeKt$BadgedBox$3$1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                invoke2(placementScope);
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(Placeable.PlacementScope placementScope) {
                                                boolean z2 = placeableMo5514measureBRTryo0.getWidth() > measureScope.mo704roundToPx0680j_4(BadgeTokens.INSTANCE.m3033getSizeD9Ej5fM());
                                                float badgeWithContentHorizontalOffset = z2 ? BadgeKt.getBadgeWithContentHorizontalOffset() : BadgeKt.getBadgeOffset();
                                                float badgeWithContentVerticalOffset = z2 ? BadgeKt.getBadgeWithContentVerticalOffset() : BadgeKt.getBadgeOffset();
                                                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo5514measureBRTryo02, 0, 0, 0.0f, 4, null);
                                                int width2 = placeableMo5514measureBRTryo02.getWidth() - measureScope.mo704roundToPx0680j_4(badgeWithContentHorizontalOffset);
                                                int iRoundToInt = (-placeableMo5514measureBRTryo0.getHeight()) + measureScope.mo704roundToPx0680j_4(badgeWithContentVerticalOffset);
                                                float fBadgedBox$lambda$4 = BadgeKt.BadgedBox$lambda$4(mutableFloatState5) + iRoundToInt;
                                                float fBadgedBox$lambda$7 = BadgeKt.BadgedBox$lambda$7(mutableFloatState7) - ((BadgeKt.BadgedBox$lambda$1(mutableFloatState6) + width2) + placeableMo5514measureBRTryo0.getWidth());
                                                float fBadgedBox$lambda$10 = fBadgedBox$lambda$4 - BadgeKt.BadgedBox$lambda$10(mutableFloatState8);
                                                if (fBadgedBox$lambda$7 < 0.0f) {
                                                    width2 += MathKt.roundToInt(fBadgedBox$lambda$7);
                                                }
                                                if (fBadgedBox$lambda$10 < 0.0f) {
                                                    iRoundToInt -= MathKt.roundToInt(fBadgedBox$lambda$10);
                                                }
                                                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo5514measureBRTryo0, width2, iRoundToInt, 0.0f, 4, null);
                                            }
                                        });
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                composerStartRestartGroup.updateRememberedValue(measurePolicyRememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) measurePolicyRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierOnGloballyPositioned);
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3671constructorimpl = Updater.m3671constructorimpl(composerStartRestartGroup);
            Updater.m3678setimpl(composerM3671constructorimpl, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -800356556, "C82@3373L161,87@3547L59:Badge.kt#uh7d8r");
            Modifier modifierLayoutId = LayoutIdKt.layoutId(Modifier.Companion, "anchor");
            Alignment center = Alignment.Companion.getCenter();
            int i6 = ((i4 << 3) & 7168) | 54;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierLayoutId);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3671constructorimpl2 = Updater.m3671constructorimpl(composerStartRestartGroup);
            Updater.m3678setimpl(composerM3671constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM3671constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM3671constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m3678setimpl(composerM3671constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            function32.invoke(BoxScopeInstance.INSTANCE, composerStartRestartGroup, Integer.valueOf(((i6 >> 6) & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) | 6));
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Modifier modifierLayoutId2 = LayoutIdKt.layoutId(Modifier.Companion, "badge");
            int i7 = (-1) - (((-1) - ((-1) - (((-1) - (i4 << 9)) | ((-1) - 7168)))) & ((-1) - 6));
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierLayoutId2);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3671constructorimpl3 = Updater.m3671constructorimpl(composerStartRestartGroup);
            Updater.m3678setimpl(composerM3671constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM3671constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM3671constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m3678setimpl(composerM3671constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i8 = i7 >> 6;
            int i9 = (i8 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i8 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION);
            function3.invoke(boxScopeInstance, composerStartRestartGroup, Integer.valueOf((i9 + 6) - (i9 & 6)));
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.BadgeKt.BadgedBox.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i10) {
                    Function3<BoxScope, Composer, Integer, Unit> function33 = function3;
                    Modifier modifier2 = companion;
                    Function3<BoxScope, Composer, Integer, Unit> function34 = function32;
                    int i11 = i2;
                    BadgeKt.BadgedBox(function33, modifier2, function34, composer2, RecomposeScopeImplKt.updateChangedFlags((i11 + 1) - (i11 & 1)), i3);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float BadgedBox$lambda$1(MutableFloatState mutableFloatState) {
        return mutableFloatState.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float BadgedBox$lambda$4(MutableFloatState mutableFloatState) {
        return mutableFloatState.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float BadgedBox$lambda$7(MutableFloatState mutableFloatState) {
        return mutableFloatState.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float BadgedBox$lambda$10(MutableFloatState mutableFloatState) {
        return mutableFloatState.getFloatValue();
    }

    /* JADX INFO: renamed from: Badge-eopBjH0, reason: not valid java name */
    public static final void m1806BadgeeopBjH0(Modifier modifier, long j2, long j3, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i2, final int i3) {
        int i4;
        Shape value;
        Modifier.Companion companionM1020paddingVpY3zN4$default;
        final long jM1947contentColorForek8zF_U = j3;
        final long containerColor = j2;
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32 = function3;
        final Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(1298144073);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Badge)P(3,0:c#ui.graphics.Color,2:c#ui.graphics.Color)180@8028L14,181@8070L31,193@8428L874:Badge.kt#uh7d8r");
        int i5 = (i3 + 1) - (i3 | 1);
        if (i5 != 0) {
            i4 = (-1) - (((-1) - i2) & ((-1) - 6));
        } else if ((i2 + 6) - (i2 | 6) == 0) {
            int i6 = composerStartRestartGroup.changed(companion) ? 4 : 2;
            i4 = (i6 + i2) - (i6 & i2);
        } else {
            i4 = i2;
        }
        if ((i2 + 48) - (i2 | 48) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (((i3 & 2) == 0 && composerStartRestartGroup.changed(containerColor)) ? 32 : 16)));
        }
        if ((i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i2 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 |= ((-1) - (((-1) - i3) | ((-1) - 4)) == 0 && composerStartRestartGroup.changed(jM1947contentColorForek8zF_U)) ? 256 : 128;
        }
        int i7 = (i3 + 8) - (i3 | 8);
        if (i7 != 0) {
            i4 = (i4 + 3072) - (i4 & 3072);
        } else if ((i2 + 3072) - (i2 | 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function32) ? 2048 : 1024;
        }
        if ((i4 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i2 + 1) - (i2 | 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    companion = Modifier.Companion;
                }
                if ((i3 + 2) - (i3 | 2) != 0) {
                    containerColor = BadgeDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    i4 &= -113;
                }
                if ((i3 & 4) != 0) {
                    int i8 = i4 >> 3;
                    jM1947contentColorForek8zF_U = ColorSchemeKt.m1947contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i8 + 14) - (i8 | 14));
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-897)));
                }
                if (i7 != 0) {
                    function32 = null;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-113)));
                }
                if ((i3 + 4) - (i3 | 4) != 0) {
                    i4 &= -897;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1298144073, i4, -1, "androidx.compose.material3.Badge (Badge.kt:183)");
            }
            BadgeTokens badgeTokens = BadgeTokens.INSTANCE;
            float fM3032getLargeSizeD9Ej5fM = function32 != null ? badgeTokens.m3032getLargeSizeD9Ej5fM() : badgeTokens.m3033getSizeD9Ej5fM();
            if (function32 != null) {
                composerStartRestartGroup.startReplaceGroup(-1271801170);
                ComposerKt.sourceInformation(composerStartRestartGroup, "187@8325L5");
                value = ShapesKt.getValue(BadgeTokens.INSTANCE.getLargeShape(), composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1271743789);
                ComposerKt.sourceInformation(composerStartRestartGroup, "189@8378L5");
                value = ShapesKt.getValue(BadgeTokens.INSTANCE.getShape(), composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            }
            Modifier modifierM572backgroundbw27NRU = BackgroundKt.m572backgroundbw27NRU(SizeKt.m1047defaultMinSizeVpY3zN4(companion, fM3032getLargeSizeD9Ej5fM, fM3032getLargeSizeD9Ej5fM), containerColor, value);
            if (function32 != null) {
                companionM1020paddingVpY3zN4$default = PaddingKt.m1020paddingVpY3zN4$default(Modifier.Companion, BadgeWithContentHorizontalPadding, 0.0f, 2, null);
            } else {
                companionM1020paddingVpY3zN4$default = Modifier.Companion;
            }
            Modifier modifierThen = modifierM572backgroundbw27NRU.then(companionM1020paddingVpY3zN4$default);
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composerStartRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen);
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3671constructorimpl = Updater.m3671constructorimpl(composerStartRestartGroup);
            Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407918630, "C100@5047L9:Row.kt#2w3rfo");
            final RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1324532516, "C:Badge.kt#uh7d8r");
            composerStartRestartGroup.startReplaceGroup(-1705294841);
            ComposerKt.sourceInformation(composerStartRestartGroup, "208@9105L5,212@9259L13,209@9123L163");
            if (function32 != null) {
                int i9 = (-1) - (((-1) - (i4 >> 6)) | ((-1) - 14));
                ProvideContentColorTextStyleKt.m2921ProvideContentColorTextStyle3JVO9M(jM1947contentColorForek8zF_U, TypographyKt.getValue(BadgeTokens.INSTANCE.getLargeLabelTextFont(), composerStartRestartGroup, 6), ComposableLambdaKt.rememberComposableLambda(719214594, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.BadgeKt$Badge$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i10) {
                        ComposerKt.sourceInformation(composer2, "C212@9261L9:Badge.kt#uh7d8r");
                        if ((i10 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(719214594, i10, -1, "androidx.compose.material3.Badge.<anonymous>.<anonymous> (Badge.kt:212)");
                        }
                        function32.invoke(rowScopeInstance, composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, (i9 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i9 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
            }
            composerStartRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.BadgeKt$Badge$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i10) {
                    BadgeKt.m1806BadgeeopBjH0(companion, containerColor, jM1947contentColorForek8zF_U, function32, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i2) & ((-1) - 1))), i3);
                }
            });
        }
    }

    public static final float getBadgeWithContentHorizontalPadding() {
        return BadgeWithContentHorizontalPadding;
    }

    public static final float getBadgeWithContentHorizontalOffset() {
        return BadgeWithContentHorizontalOffset;
    }

    public static final float getBadgeWithContentVerticalOffset() {
        return BadgeWithContentVerticalOffset;
    }

    public static final float getBadgeOffset() {
        return BadgeOffset;
    }
}
