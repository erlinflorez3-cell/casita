package androidx.compose.foundation.selection;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.state.ToggleableState;
import com.dynatrace.android.compose.ToggleableComposeCallback_1_7;
import com.dynatrace.android.compose.ToggleableDataProvider;
import com.dynatrace.android.compose.TriToggleableComposeCallback_1_7;
import com.facebook.react.uimanager.ViewProps;
import io.sentry.protocol.SentryThread;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
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
/* JADX INFO: compiled from: Toggleable.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я>\u001d̉=!4i\bӵLc\u0003\rIي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nj?0Le^.Zݷ2\u000f\u0002{<$i$yCAW\"}8\tWȞog\u0005Jb\u000bI\u0010\u001el\u0007̓DI\u0004w\u0006\u0012=1rsM3eok:\u0011zD\u00078487(\b1 8L(x\u0011By\u0011B6FpHX%M3\u001bB\u000eD \u000f%tid5vt\u000eJ=,\u001buRP7_^}]\u000fVTU\u0018%kՕ*¨˝9\u0015+_\u001bI`¹W\u0003mpe\u0005\u0017&W/Wso6\u0007\u0001D\u001b1O\u001bc\u000b&\u000b\u0006\u0002h\u0012'9V{Mf\rV\u007f+\f\u001bE\u001c\u001a\u0016)X.[\u001bv\n\u001e3#}\u0002J҉\u0001މ۰\u0004zgC/u\u000eAC9Ieyai\u0018~;\n\u0014%\u001eQ\u0011\u001f'iV&b+\u001a\u0003z\u00027_DUJd\t\bB\u001e\nvb\u00100\u001c0u\u0001_\u0004\u0017.%,O]O\"Os2RRx\u000f\u000bpjci\u0001Sn4Ļ\u0015ճҊ\r\f`W|Ay^lXZ\u0010u\u001c\u0003\u0006.\f!/twj1U\u0016TOvo\u0003M\f\u000bU7l7gu\u0004\u0010m8\r;e[q!yX\u0007\u0016O<\u0011\u0010\u0007xδRێȺ`((Fʎj\u0015\u007f~Jª(A1Ɩu1"}, d2 = {"BnV4_,:P ~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "D`[BX", "", "7mc2e(<b\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005SD-\u0011eh9jl;N\u0004#E[R6e@|M!\u0010Zc", "7mS6V(MW#\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\t>X\u0002\u001e3|\u001a8V\u0019", "3mP/_,=", "@n[2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~F\b'7C", "=mE._<>1\u001cz\u0004`,", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "BnV4_,:P ~BHx\u000eu-RJ", "BnV4_,:P ~BQ\u000f\u000fSBAc", "BqX g(MS\b\t|`3|\u0005,l\u007f", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f&\u0013VoW+\u0001'7`}\u001c4t\u0016\u001c\\?Jk\n", "=m29\\*D", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "BqX g(MS\b\t|`3|\u0005,l\u007foe\r\u0012\u0004\u00154:", "BqX g(MS\b\t|`3|\u0005,l\u007fon#\u0013a*#S", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ToggleableKt {
    /* JADX INFO: renamed from: toggleable-XHw0xAI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m1277toggleableXHw0xAI$default(Modifier modifier, boolean z2, boolean z3, Role role, Function1 function1, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            z3 = true;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            role = null;
        }
        return m1276toggleableXHw0xAI(modifier, z2, z3, role, function1);
    }

    /* JADX INFO: renamed from: toggleable-O2vRcR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m1275toggleableO2vRcR0$default(Modifier modifier, boolean z2, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z3, Role role, Function1 function1, int i2, Object obj) {
        if ((8 & i2) != 0) {
            z3 = true;
        }
        if ((i2 + 16) - (i2 | 16) != 0) {
            role = null;
        }
        return m1274toggleableO2vRcR0(modifier, z2, mutableInteractionSource, indication, z3, role, function1);
    }

    /* JADX INFO: renamed from: triStateToggleable-XHw0xAI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m1281triStateToggleableXHw0xAI$default(Modifier modifier, ToggleableState toggleableState, boolean z2, Role role, Function0 function0, int i2, Object obj) {
        if ((2 & i2) != 0) {
            z2 = true;
        }
        if ((i2 & 4) != 0) {
            role = null;
        }
        return m1280triStateToggleableXHw0xAI(modifier, toggleableState, z2, role, function0);
    }

    /* JADX INFO: renamed from: triStateToggleable-O2vRcR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m1279triStateToggleableO2vRcR0$default(Modifier modifier, ToggleableState toggleableState, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z2, Role role, Function0 function0, int i2, Object obj) {
        if ((8 & i2) != 0) {
            z2 = true;
        }
        if ((i2 & 16) != 0) {
            role = null;
        }
        return m1278triStateToggleableO2vRcR0(modifier, toggleableState, mutableInteractionSource, indication, z2, role, function0);
    }

    /* JADX INFO: renamed from: toggleable-XHw0xAI, reason: not valid java name */
    public static final Modifier m1276toggleableXHw0xAI(Modifier modifier, final boolean z2, final boolean z3, final Role role, final Function1<? super Boolean, Unit> function1) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.selection.ToggleableKt$toggleable-XHw0xAI$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("toggleable");
                inspectorInfo.getProperties().set("value", Boolean.valueOf(z2));
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z3));
                inspectorInfo.getProperties().set(ViewProps.ROLE, role);
                inspectorInfo.getProperties().set("onValueChange", function1);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.selection.ToggleableKt$toggleable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier modifier2, Composer composer, int i2) {
                MutableInteractionSource mutableInteractionSource;
                composer.startReplaceGroup(290332169);
                ComposerKt.sourceInformation(composer, "C74@3197L7:Toggleable.kt#gro6r2");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(290332169, i2, -1, "androidx.compose.foundation.selection.toggleable.<anonymous> (Toggleable.kt:74)");
                }
                ProvidableCompositionLocal<Indication> localIndication = IndicationKt.getLocalIndication();
                ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume = composer.consume(localIndication);
                ComposerKt.sourceInformationMarkerEnd(composer);
                Indication indication = (Indication) objConsume;
                if (indication instanceof IndicationNodeFactory) {
                    composer.startReplaceGroup(-2130154122);
                    composer.endReplaceGroup();
                    mutableInteractionSource = null;
                } else {
                    composer.startReplaceGroup(-2130046149);
                    ComposerKt.sourceInformation(composer, "81@3561L39");
                    ComposerKt.sourceInformationMarkerStart(composer, 1178220304, "CC(remember):Toggleable.kt#9igjgp");
                    Object objRememberedValue = composer.rememberedValue();
                    if (objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    composer.endReplaceGroup();
                }
                Modifier modifierM1274toggleableO2vRcR0 = ToggleableKt.m1274toggleableO2vRcR0(Modifier.Companion, z2, mutableInteractionSource, indication, z3, role, function1);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierM1274toggleableO2vRcR0;
            }
        });
    }

    /* JADX INFO: renamed from: toggleable-O2vRcR0, reason: not valid java name */
    public static final Modifier m1274toggleableO2vRcR0(Modifier modifier, final boolean z2, MutableInteractionSource mutableInteractionSource, final Indication indication, final boolean z3, final Role role, Function1<? super Boolean, Unit> function1) {
        ToggleableElement toggleableElementComposed$default;
        ToggleableElement toggleableElement;
        final ToggleableComposeCallback_1_7 toggleableComposeCallback_1_7 = new ToggleableComposeCallback_1_7(function1, role, null);
        if (indication instanceof IndicationNodeFactory) {
            toggleableElement = new ToggleableElement(z2, mutableInteractionSource, (IndicationNodeFactory) indication, z3, role, toggleableComposeCallback_1_7, null);
        } else {
            if (indication != null) {
                if (mutableInteractionSource != null) {
                    toggleableElementComposed$default = IndicationKt.indication(Modifier.Companion, mutableInteractionSource, indication).then(new ToggleableElement(z2, mutableInteractionSource, null, z3, role, toggleableComposeCallback_1_7, null));
                } else {
                    toggleableElementComposed$default = ComposedModifierKt.composed$default(Modifier.Companion, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.selection.ToggleableKt$toggleable-O2vRcR0$$inlined$clickableWithIndicationIfNeeded$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                            return invoke(modifier2, composer, num.intValue());
                        }

                        public final Modifier invoke(Modifier modifier2, Composer composer, int i2) {
                            composer.startReplaceGroup(-1525724089);
                            ComposerKt.sourceInformation(composer, "C375@17877L39:Clickable.kt#71ulvw");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1525724089, i2, -1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:375)");
                            }
                            ComposerKt.sourceInformationMarkerStart(composer, -442650590, "CC(remember):Clickable.kt#9igjgp");
                            Object objRememberedValue = composer.rememberedValue();
                            if (objRememberedValue == Composer.Companion.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            MutableInteractionSource mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            Modifier modifierThen = IndicationKt.indication(Modifier.Companion, mutableInteractionSource2, indication).then(new ToggleableElement(z2, mutableInteractionSource2, null, z3, role, toggleableComposeCallback_1_7, null));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer.endReplaceGroup();
                            return modifierThen;
                        }
                    }, 1, null);
                }
                return modifier.then(toggleableElementComposed$default);
            }
            toggleableElement = new ToggleableElement(z2, mutableInteractionSource, null, z3, role, toggleableComposeCallback_1_7, null);
        }
        toggleableElementComposed$default = toggleableElement;
        return modifier.then(toggleableElementComposed$default);
    }

    /* JADX INFO: renamed from: triStateToggleable-XHw0xAI, reason: not valid java name */
    public static final Modifier m1280triStateToggleableXHw0xAI(Modifier modifier, final ToggleableState toggleableState, final boolean z2, final Role role, final Function0<Unit> function0) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.selection.ToggleableKt$triStateToggleable-XHw0xAI$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("triStateToggleable");
                inspectorInfo.getProperties().set(SentryThread.JsonKeys.STATE, toggleableState);
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z2));
                inspectorInfo.getProperties().set(ViewProps.ROLE, role);
                inspectorInfo.getProperties().set("onClick", function0);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.selection.ToggleableKt$triStateToggleable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier modifier2, Composer composer, int i2) {
                MutableInteractionSource mutableInteractionSource;
                composer.startReplaceGroup(-1808118329);
                ComposerKt.sourceInformation(composer, "C306@12494L7:Toggleable.kt#gro6r2");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1808118329, i2, -1, "androidx.compose.foundation.selection.triStateToggleable.<anonymous> (Toggleable.kt:306)");
                }
                ProvidableCompositionLocal<Indication> localIndication = IndicationKt.getLocalIndication();
                ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume = composer.consume(localIndication);
                ComposerKt.sourceInformationMarkerEnd(composer);
                Indication indication = (Indication) objConsume;
                if (indication instanceof IndicationNodeFactory) {
                    composer.startReplaceGroup(-1060535216);
                    composer.endReplaceGroup();
                    mutableInteractionSource = null;
                } else {
                    composer.startReplaceGroup(-1060427243);
                    ComposerKt.sourceInformation(composer, "313@12858L39");
                    ComposerKt.sourceInformationMarkerStart(composer, -588391178, "CC(remember):Toggleable.kt#9igjgp");
                    Object objRememberedValue = composer.rememberedValue();
                    if (objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    composer.endReplaceGroup();
                }
                Modifier modifierM1278triStateToggleableO2vRcR0 = ToggleableKt.m1278triStateToggleableO2vRcR0(Modifier.Companion, toggleableState, mutableInteractionSource, indication, z2, role, function0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierM1278triStateToggleableO2vRcR0;
            }
        });
    }

    /* JADX INFO: renamed from: triStateToggleable-O2vRcR0, reason: not valid java name */
    public static final Modifier m1278triStateToggleableO2vRcR0(Modifier modifier, final ToggleableState toggleableState, MutableInteractionSource mutableInteractionSource, final Indication indication, final boolean z2, final Role role, Function0<Unit> function0) {
        TriStateToggleableElement triStateToggleableElementComposed$default;
        TriStateToggleableElement triStateToggleableElement;
        Function0<Unit> triToggleableComposeCallback_1_7 = function0;
        if (!(triToggleableComposeCallback_1_7 instanceof ToggleableDataProvider)) {
            triToggleableComposeCallback_1_7 = new TriToggleableComposeCallback_1_7(triToggleableComposeCallback_1_7, toggleableState);
        }
        if (indication instanceof IndicationNodeFactory) {
            triStateToggleableElement = new TriStateToggleableElement(toggleableState, mutableInteractionSource, (IndicationNodeFactory) indication, z2, role, triToggleableComposeCallback_1_7, null);
        } else {
            if (indication != null) {
                if (mutableInteractionSource != null) {
                    triStateToggleableElementComposed$default = IndicationKt.indication(Modifier.Companion, mutableInteractionSource, indication).then(new TriStateToggleableElement(toggleableState, mutableInteractionSource, null, z2, role, triToggleableComposeCallback_1_7, null));
                } else {
                    final Function0<Unit> function02 = triToggleableComposeCallback_1_7;
                    triStateToggleableElementComposed$default = ComposedModifierKt.composed$default(Modifier.Companion, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.selection.ToggleableKt$triStateToggleable-O2vRcR0$$inlined$clickableWithIndicationIfNeeded$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                            return invoke(modifier2, composer, num.intValue());
                        }

                        public final Modifier invoke(Modifier modifier2, Composer composer, int i2) {
                            composer.startReplaceGroup(-1525724089);
                            ComposerKt.sourceInformation(composer, "C375@17877L39:Clickable.kt#71ulvw");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1525724089, i2, -1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:375)");
                            }
                            ComposerKt.sourceInformationMarkerStart(composer, -442650590, "CC(remember):Clickable.kt#9igjgp");
                            Object objRememberedValue = composer.rememberedValue();
                            if (objRememberedValue == Composer.Companion.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            MutableInteractionSource mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            Modifier modifierThen = IndicationKt.indication(Modifier.Companion, mutableInteractionSource2, indication).then(new TriStateToggleableElement(toggleableState, mutableInteractionSource2, null, z2, role, function02, null));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer.endReplaceGroup();
                            return modifierThen;
                        }
                    }, 1, null);
                }
                return modifier.then(triStateToggleableElementComposed$default);
            }
            triStateToggleableElement = new TriStateToggleableElement(toggleableState, mutableInteractionSource, null, z2, role, triToggleableComposeCallback_1_7, null);
        }
        triStateToggleableElementComposed$default = triStateToggleableElement;
        return modifier.then(triStateToggleableElementComposed$default);
    }
}
