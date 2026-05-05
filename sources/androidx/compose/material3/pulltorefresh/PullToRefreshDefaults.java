package androidx.compose.material3.pulltorefresh;

import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.tokens.ElevationTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
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
/* JADX INFO: compiled from: PullToRefresh.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005&4\u0012\u000e\u0007nj?3Le^.ZS0\u0010s{B$cҕyCQU\"Ԃ*\t]Wo˧vJp\u000bK\u000f\f\u0019~͛,_ǁ)]@\u000erGu?ݯQoK9)=D\u001782PK*\t\u000f.BH>\f+GY\"*0n\bjX\u0013M\u00132*\u0006l91$bg\\>`l\fC_)\tiPh?_^\u0006}\u0013LT5(\u000faL-\u0007<Æ\u0014Ǭ٨\u0007\tXwM \u0010\tK\u0006\u0001'U-˗rɎΥW~Џ\u00193W\rkw>^\u000bTn\u0010wB]icP<*ĴyԈʗ;\u0003؝\n/P.;\u001f~\n\u0014:\u0003v$U^\nvB.\u0004\u0018{҆$ĮƊ*8ӸjUy=\u001fXE\u0007U\",/\u0019nOd\u000bSؤ\u0014ÑȑvPśUDUJT\u0017gH>\u0013~p\u001a*2?Ͻ\u00045\u0004߾F\u0019+GiJ\u05fd!t\nKJϻ\u00133_pSoq͛D@"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006\u00025<`\r*Dm\u0017;MQ>5\u001f.\u001coPCsc-[v5J+N-XbyL\"g", "", "u(E", "\u0013kTCT;B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "5dc\u0012_,OO(\u0003\u0005gs[\\\u000fjO)c", "u(5", "\u0014", "\u001enb6g0H\\\u0015\u0006ia9|\u00172o\u0007'", "5dc\u001db:Bb\u001d\t\u0004Z3k\f<e\u000e+\u0006G\u007f^u\u001bO\u0013\fw\r", "1n]AT0GS&\\\u0005e6\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "5dc\u0010b5MO\u001d\bzk\n\u0007\u00109r", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq2", "7mS6V(M]&\\\u0005e6\n", "5dc\u0016a+BQ\u0015\u000e\u0005k\n\u0007\u00109r", "AgP=X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y+7C", "5dc [(IS", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#k#3x\u0016\u0004", "\u0017mS6V(M]&", "", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006\u00025<`\r*Dm\u0017;MQ>5\u001f.\u001coPCsc-[v5J:](kRH", "7rA2Y9>a\u001c\u0003\u0004`", "", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "1n[<e", "Bga2f/HZ\u0018", "\u0017mS6V(M]&FGi6\t\u001324", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@0E`\u0005/Az\u0016/ZCIn}\t%oh(\u0011P,O\u0004'UO<;Xar\u0013\txV\u0017M8\u0017\tXTmlN?*\u0012:IKKlJs \r9ktBce,^u\\=2gSccxZ\u000bCl2o\u0016m\u001d&GJ-#u!\u001b2.8\u0012\u0007]\u001fr_OKK\u000b\n", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PullToRefreshDefaults {
    public static final int $stable = 0;
    public static final PullToRefreshDefaults INSTANCE = new PullToRefreshDefaults();
    private static final Shape shape = RoundedCornerShapeKt.getCircleShape();
    private static final float PositionalThreshold = Dp.m6638constructorimpl(80);
    private static final float Elevation = ElevationTokens.INSTANCE.m3193getLevel2D9Ej5fM();

    private PullToRefreshDefaults() {
    }

    public final Shape getShape() {
        return shape;
    }

    public final long getContainerColor(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1066257972, "C419@15907L11:PullToRefresh.kt#djiw08");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1066257972, i2, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.<get-containerColor> (PullToRefresh.kt:419)");
        }
        long jM1936getSurfaceContainerHigh0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1936getSurfaceContainerHigh0d7_KjU();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return jM1936getSurfaceContainerHigh0d7_KjU;
    }

    public final long getIndicatorColor(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1441334156, "C423@16068L11:PullToRefresh.kt#djiw08");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1441334156, i2, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.<get-indicatorColor> (PullToRefresh.kt:423)");
        }
        long jM1923getOnSurfaceVariant0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1923getOnSurfaceVariant0d7_KjU();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return jM1923getOnSurfaceVariant0d7_KjU;
    }

    /* JADX INFO: renamed from: getPositionalThreshold-D9Ej5fM, reason: not valid java name */
    public final float m3004getPositionalThresholdD9Ej5fM() {
        return PositionalThreshold;
    }

    /* JADX INFO: renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m3003getElevationD9Ej5fM() {
        return Elevation;
    }

    /* JADX INFO: renamed from: Indicator-2poqoh4, reason: not valid java name */
    public final void m3002Indicator2poqoh4(final PullToRefreshState pullToRefreshState, final boolean z2, Modifier modifier, long j2, long j3, float f2, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        final long indicatorColor = j3;
        long containerColor = j2;
        float f3 = f2;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1076870256);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Indicator)P(4,2,3,1:c#ui.graphics.Color,0:c#ui.graphics.Color,5:c#ui.unit.Dp)437@16566L14,438@16627L14,441@16704L1007:PullToRefresh.kt#djiw08");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 + 6) - (i2 | 6) == 0) {
            i4 = (composerStartRestartGroup.changed(pullToRefreshState) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            i4 |= 48;
        } else if ((i2 + 48) - (i2 | 48) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(z2) ? 32 : 16)));
        }
        int i6 = (-1) - (((-1) - i3) | ((-1) - 4));
        if (i6 != 0) {
            i4 = (i4 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i4 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            int i7 = composerStartRestartGroup.changed(companion) ? 256 : 128;
            i4 = (i4 + i7) - (i4 & i7);
        }
        if ((i2 & 3072) == 0) {
            i4 |= ((i3 + 8) - (i3 | 8) == 0 && composerStartRestartGroup.changed(containerColor)) ? 2048 : 1024;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 24576)) == 0) {
            int i8 = ((i3 + 16) - (i3 | 16) == 0 && composerStartRestartGroup.changed(indicatorColor)) ? 16384 : 8192;
            i4 = (i4 + i8) - (i4 & i8);
        }
        if ((ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE + i2) - (196608 | i2) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (((i3 & 32) == 0 && composerStartRestartGroup.changed(f3)) ? 131072 : 65536)));
        }
        if ((i3 & 64) != 0) {
            i4 = (i4 + 1572864) - (i4 & 1572864);
        } else if ((i2 + 1572864) - (i2 | 1572864) == 0) {
            int i9 = composerStartRestartGroup.changed(this) ? 1048576 : 524288;
            i4 = (i4 + i9) - (i4 & i9);
        }
        if ((599187 & i4) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i6 != 0) {
                    companion = Modifier.Companion;
                }
                if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
                    containerColor = INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    i4 &= -7169;
                }
                if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
                    indicatorColor = INSTANCE.getIndicatorColor(composerStartRestartGroup, 6);
                    i4 &= -57345;
                }
                if ((i3 & 32) != 0) {
                    f3 = PositionalThreshold;
                    i5 = (i4 - 458753) - (i4 | (-458753));
                } else {
                    i5 = i4;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
                    i4 = (i4 - 7169) - (i4 | (-7169));
                }
                if ((i3 & 16) != 0) {
                    i4 = (i4 - 57345) - (i4 | (-57345));
                }
                if ((i3 & 32) != 0) {
                    i4 &= -458753;
                }
                i5 = i4;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1076870256, i5, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.Indicator (PullToRefresh.kt:440)");
            }
            Modifier modifierM3018pullToRefreshIndicatorwUdLESc$default = PullToRefreshKt.m3018pullToRefreshIndicatorwUdLESc$default(companion, pullToRefreshState, z2, f3, null, containerColor, 0.0f, 40, null);
            Alignment center = Alignment.Companion.getCenter();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM3018pullToRefreshIndicatorwUdLESc$default);
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
            Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 396611011, "C454@17197L504,451@17052L649:PullToRefresh.kt#djiw08");
            int i10 = i5 >> 3;
            int i11 = (i10 + 14) - (i10 | 14);
            CrossfadeKt.Crossfade(Boolean.valueOf(z2), (Modifier) null, AnimationSpecKt.tween$default(100, 0, null, 6, null), (String) null, ComposableLambdaKt.rememberComposableLambda(167807595, true, new Function3<Boolean, Composer, Integer, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshDefaults$Indicator$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Composer composer2, Integer num) {
                    invoke(bool.booleanValue(), composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(boolean z3, Composer composer2, int i12) {
                    ComposerKt.sourceInformation(composer2, "C:PullToRefresh.kt#djiw08");
                    if ((-1) - (((-1) - i12) | ((-1) - 6)) == 0) {
                        i12 |= composer2.changed(z3) ? 4 : 2;
                    }
                    if ((i12 & 19) != 18 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(167807595, i12, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.Indicator.<anonymous>.<anonymous> (PullToRefresh.kt:455)");
                        }
                        if (z3) {
                            composer2.startReplaceGroup(576835739);
                            ComposerKt.sourceInformation(composer2, "456@17267L201");
                            ProgressIndicatorKt.m2385CircularProgressIndicatorLxG7B9w(SizeKt.m1063size3ABfNKs(Modifier.Companion, PullToRefreshKt.getSpinnerSize()), indicatorColor, PullToRefreshKt.StrokeWidth, 0L, 0, composer2, 390, 24);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(577079337);
                            ComposerKt.sourceInformation(composer2, "463@17581L26,462@17514L155");
                            ComposerKt.sourceInformationMarkerStart(composer2, -1505402512, "CC(remember):PullToRefresh.kt#9igjgp");
                            boolean zChanged = composer2.changed(pullToRefreshState);
                            final PullToRefreshState pullToRefreshState2 = pullToRefreshState;
                            Object objRememberedValue = composer2.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                                objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshDefaults$Indicator$1$1$1$1
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Float invoke() {
                                        return Float.valueOf(pullToRefreshState2.getDistanceFraction());
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue);
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            PullToRefreshKt.m3009CircularArrowProgressIndicatorRPmYEkk((Function0) objRememberedValue, indicatorColor, composer2, 0);
                            composer2.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i11 + 24960) - (i11 & 24960), 10);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final float f4 = f3;
            final long j4 = containerColor;
            final long j5 = indicatorColor;
            final Modifier modifier2 = companion;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshDefaults$Indicator$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i12) {
                    PullToRefreshDefaults pullToRefreshDefaults = this.$tmp0_rcvr;
                    PullToRefreshState pullToRefreshState2 = pullToRefreshState;
                    boolean z3 = z2;
                    Modifier modifier3 = modifier2;
                    long j6 = j4;
                    long j7 = j5;
                    float f5 = f4;
                    int i13 = i2;
                    pullToRefreshDefaults.m3002Indicator2poqoh4(pullToRefreshState2, z3, modifier3, j6, j7, f5, composer2, RecomposeScopeImplKt.updateChangedFlags((i13 + 1) - (i13 & 1)), i3);
                }
            });
        }
    }
}
