package androidx.compose.foundation;

import androidx.compose.foundation.gestures.ScrollableContainerNode;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.Role;
import com.dynatrace.android.compose.ClickableComposeCallback;
import com.facebook.react.uimanager.ViewProps;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: compiled from: Clickable.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яt\u001d̉=!4i\bӵLc\u000b\u0004I\u0006>\u000b6Ȑ\u0007\":\u001e\u007f\u0007lkA0ZeP\u008cZS@\u000fsڔ<$i-yCAU\"}8\tWNmgvJp\u000bKƤ\u000e\u0016\u000fj4I[ze\u0012%2JoE6UoS9hҚ>\u0005.U*8\u0010\u0005\t\u001a@H\u0018͌\u0003Ca\f\u001a0VpBR\u0013M\r\u001a(\u0006FĨ\u0019\u0015jɡf6vk\u000eD=#\u001boRP7_^~{\u000evZ5\u0010\u000fc4*n;e!3X\u001b\u000fb]O\u0003msS\u0004\u0017(W7Wyo>h\u0002$\u0015YQ#\\!'\r\u000b_g$)AN\u0012S\u0001\u00146\u0001\u0013}#;2\u00186+V9E\u001a\u0015\u0014>9\u0003\u007fkBf\u0001\rF0\u0001oD/'\u00162YHakј`ݢϭR7\u0002\u0015%r1\u0012\u0007!\nf6`C-\u0005}_8iBSG|\u0012\nC{\u0017\td\u0018)2Dw\u00065{\u001f9/%egi+'k\u0010U\\i\r\u0004\u000fl\u0004qXHN0\u0007\u0018M)7\u001b\u000bNr\u0005\u0004VdZ<\u0011{\u001e\u0003\bś\u0007ʶء`wB6=P\\`\u0001i\u0019_\u0006\nSA\u0017=_ny\u0019o9\r?eYi\u0010o_\u000f\u0016U;\u0011\t\tnHS\u001aht*81vy@\u0002\nDf\u0012#4OqJ6Z2ɂ[éȠ\u0007\u001eHW\u0015Hmq\u0001\u0010-f[$1{Tz\u0017\bh^\u0007n\u0016\u0001y2\u000bs:/WPc-Vq(jB\u0015;\u001d\u000fw\u0010I}KuT|\u001a\u0006W\u0012\u001fD$IS?=A!-Bxĉ3]ɬqske\u0012U\r%y=M\u00194u\u000f\u0003rB_\u0019R\u007fZ%5\u000f`\t\"6x0\u007fgF\tR{T9gnQx\u0003gIf:\u0013\u0004M\"U\tu\"\u000bCEE=\u001cD\u0007D7\u001bakl\b0\u0010a=*%s\n,q\u001b\bja_B;fKo}l#Tz\tBVp\u0010\u0010R\u000bD\raJWc\u001fWhW\u0019/\u0016l\u0017.\u001dp\u0005]h\u00146\u0003ԧ-ɾͫwC\u0004/v63+eS\u0016\u007f\u0016K\u000b\u001dz\u0015\u0010\u000b\n<\u0007\u0012JIP^]b\u0017=\u001eu.5o?\u0013\rB\t2BD>\u001e\nqc\u001a\u000e\u0016z\u000eIw\u0011-1pwkd\u0014T\u0007anP\u0015bU`O,\u0017}=4N\u0007;1\u0013s^\\?eB\u0001\u0002\u001f\u001f\u001a\u0019P/p3+\\ZI\u001d8X/\rs^\nNϲ5ߤھ-mq\f$գ\u0017\u000b:Z\u0018IKy\u0011\u000e\t`b\u0019\\|N\u0013~Bl`a:+\u0015y+\"l\u000e\u001d)1O!\u000f\u0013=Zn\u0010CS\u001c\u0011\u0017rK\u0017\u000e\rct>['e7Km\u0003\u001a7}gSi$6EP-\nt/go\u000e\u0015\u0016\u000e#@\u0016\u007f#z\u0004\u001f\u0012~$46Pt\u0001\u0018F\nLN0B2\u001bdYyz9B=*\u001b\nrYnx\u0018h\u0005k~W\u001b\u0003\u00153lx\u001d.\u0001'\u0017'e4#Zj:?UNYW֧ɭ\u0014ұ̢:\bhP(Yq\u0011\tk}g5+]\u0015pԝɸ0W&\u0001%ݹ\u00122)Ľ,?"}, d2 = {"\u0011n\\/\\5>Rv\u0006~\\2x\u00066eh2z@", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u0003?az$@m\u0015\fTG9q0\u001b\u001chJC\u0006c\u0002", "=m29\\*D", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "=m;<a.\u001cZ\u001d|\u0001E(y\t6", "", "=m;<a.\u001cZ\u001d|\u0001", "=m3<h)ESv\u0006~\\2", "7mc2e(<b\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005SD-\u0011eh9jl;N\u0004#E[R6e@|M!\u0010Zc", "7mS6V(MW#\bch+|i+c\u000f2\tT", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\t>X\u0002\u001e3|\u001a8V,Ej4~\u0011fpC\u0014w\u0002", "3mP/_,=", "", "=m29\\*D:\u0015{ze", "@n[2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~F\b'7C", "\u0011n\\/\\5>Rv\u0006~\\2x\u00066eh2z@H \u0005\\]\n\u001at", "1kX0^(;Z\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "7mS6V(MW#\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\t>X\u0002\u001e3|\u001a8V\u0019", "1kX0^(;Z\u0019Fd+=i\u0007\u001c0", "1kX0^(;Z\u0019FmA>G\u001c\u000bI", "1kX0^(;Z\u0019p~m/`\u0012.i}$\u000bD\u000b zHX\u000e<u%4", "1qT.g,\u001cZ\u001d|\u0001Z)\u0004\t", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "1n\\/\\5>Rv\u0006~\\2x\u00066e", "1n\\/\\5>Rv\u0006~\\2x\u00066eG\u001bl5\u0016w\u000bE", "1n\\/\\5>Rv\u0006~\\2x\u00066eG&`\"z|~Y", "5d]2e0<1 \u0003xd(y\u0010/W\u00047~J\u0011&xG}\u001dL\u0004%", "7mS6V(MW#\bh\\6\b\t", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "1ta?X5M9\u0019\u0013ek,\u000b\u0017\u0013n\u000f(\t<~&\u001bQx\u001c", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WBv9~?}4\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005VA\u001e#vEB\u0016c9Jt6KVWjG_rK\"g", "9dh\u0010_0<Y\u0003\u007f{l,\f", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "5d]2e0<1 \u0003xd(y\u0010/W\u00047~J\u0011&xG}\u001dL\u0004%|?\n1~J$0", "6`b V9HZ zwe,Z\u00138t{,\u0005@\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9|Ir65f\f\u001c4t\u0016\u0017WB;A", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ClickableKt {
    /* JADX INFO: renamed from: clickable-XHw0xAI$default */
    public static /* synthetic */ Modifier m606clickableXHw0xAI$default(Modifier modifier, boolean z2, String str, Role role, Function0 function0, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            z2 = true;
        }
        if ((2 & i2) != 0) {
            str = null;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            role = null;
        }
        return m605clickableXHw0xAI(modifier, z2, str, role, function0);
    }

    /* JADX INFO: renamed from: clickable-O2vRcR0$default */
    public static /* synthetic */ Modifier m604clickableO2vRcR0$default(Modifier modifier, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z2, String str, Role role, Function0 function0, int i2, Object obj) {
        String str2 = str;
        boolean z3 = z2;
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            z3 = true;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            str2 = null;
        }
        return m603clickableO2vRcR0(modifier, mutableInteractionSource, indication, z3, str2, (i2 & 16) == 0 ? role : null, function0);
    }

    /* JADX INFO: renamed from: combinedClickable-cJG_KMw$default */
    public static /* synthetic */ Modifier m610combinedClickablecJG_KMw$default(Modifier modifier, boolean z2, String str, Role role, String str2, Function0 function0, Function0 function02, Function0 function03, int i2, Object obj) {
        Function0 function04 = function0;
        String str3 = str2;
        String str4 = str;
        Role role2 = role;
        boolean z3 = z2;
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            z3 = true;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            str4 = null;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            role2 = null;
        }
        if ((i2 & 8) != 0) {
            str3 = null;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 16)) != 0) {
            function04 = null;
        }
        return m609combinedClickablecJG_KMw(modifier, z3, str4, role2, str3, function04, (-1) - (((-1) - i2) | ((-1) - 32)) == 0 ? function02 : null, function03);
    }

    /* JADX INFO: renamed from: combinedClickable-XVZzFYc$default */
    public static /* synthetic */ Modifier m608combinedClickableXVZzFYc$default(Modifier modifier, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z2, String str, Role role, String str2, Function0 function0, Function0 function02, Function0 function03, int i2, Object obj) {
        Function0 function04 = function0;
        String str3 = str2;
        String str4 = str;
        Role role2 = role;
        boolean z3 = z2;
        if ((i2 + 4) - (i2 | 4) != 0) {
            z3 = true;
        }
        if ((i2 + 8) - (i2 | 8) != 0) {
            str4 = null;
        }
        if ((i2 + 16) - (i2 | 16) != 0) {
            role2 = null;
        }
        if ((i2 + 32) - (i2 | 32) != 0) {
            str3 = null;
        }
        if ((i2 + 64) - (i2 | 64) != 0) {
            function04 = null;
        }
        return m607combinedClickableXVZzFYc(modifier, mutableInteractionSource, indication, z3, str4, role2, str3, function04, (i2 & 128) == 0 ? function02 : null, function03);
    }

    public static final Modifier clickableWithIndicationIfNeeded(Modifier modifier, MutableInteractionSource mutableInteractionSource, Indication indication, Function2<? super MutableInteractionSource, ? super IndicationNodeFactory, ? extends Modifier> function2) {
        Modifier modifierComposed$default;
        if (indication instanceof IndicationNodeFactory) {
            modifierComposed$default = function2.invoke(mutableInteractionSource, indication);
        } else if (indication == null) {
            modifierComposed$default = function2.invoke(mutableInteractionSource, null);
        } else if (mutableInteractionSource == null) {
            modifierComposed$default = ComposedModifierKt.composed$default(Modifier.Companion, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.ClickableKt.clickableWithIndicationIfNeeded.1
                final /* synthetic */ Function2<MutableInteractionSource, IndicationNodeFactory, Modifier> $createClickable;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass1(Function2<? super MutableInteractionSource, ? super IndicationNodeFactory, ? extends Modifier> function22) {
                    super(3);
                    function2 = function22;
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
                    Modifier modifierThen = IndicationKt.indication(Modifier.Companion, mutableInteractionSource2, indication).then(function2.invoke(mutableInteractionSource2, null));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceGroup();
                    return modifierThen;
                }
            }, 1, null);
        } else {
            modifierComposed$default = IndicationKt.indication(Modifier.Companion, mutableInteractionSource, indication).then(function22.invoke(mutableInteractionSource, null));
        }
        return modifier.then(modifierComposed$default);
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.ClickableKt$clickableWithIndicationIfNeeded$1 */
    /* JADX INFO: compiled from: Clickable.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!4i\bDJc\u0003İY\u0006^\nVB-!r\u001bէ\u000bhp9>E"}, d2 = {"\n`]<a@F])\rS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@y)6z 2LV\u0005i>& ro9Pp<W\u0006+OL\u0018\nfZ}G\"\u0012gc2ns\u0001b@1xH62Q*S\nFr\u000f\f_\u001e94XLU\u0014H}\u0015\u0003\u0017"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass1 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
        final /* synthetic */ Function2<MutableInteractionSource, IndicationNodeFactory, Modifier> $createClickable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function2<? super MutableInteractionSource, ? super IndicationNodeFactory, ? extends Modifier> function22) {
            super(3);
            function2 = function22;
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
            Modifier modifierThen = IndicationKt.indication(Modifier.Companion, mutableInteractionSource2, indication).then(function2.invoke(mutableInteractionSource2, null));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return modifierThen;
        }
    }

    /* JADX INFO: renamed from: genericClickableWithoutGesture-Kqv-Bsg$default */
    public static /* synthetic */ Modifier m612genericClickableWithoutGestureKqvBsg$default(Modifier modifier, MutableInteractionSource mutableInteractionSource, Indication indication, CoroutineScope coroutineScope, Map map, State state, boolean z2, String str, Role role, String str2, Function0 function0, Function0 function02, int i2, Object obj) {
        boolean z3 = z2;
        String str3 = str2;
        Role role2 = role;
        String str4 = str;
        if ((i2 + 32) - (i2 | 32) != 0) {
            z3 = true;
        }
        if ((i2 + 64) - (i2 | 64) != 0) {
            str4 = null;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 128)) != 0) {
            role2 = null;
        }
        if ((i2 + 256) - (i2 | 256) != 0) {
            str3 = null;
        }
        return m611genericClickableWithoutGestureKqvBsg(modifier, mutableInteractionSource, indication, coroutineScope, map, state, z3, str4, role2, str3, (i2 & 512) == 0 ? function0 : null, function02);
    }

    private static final Modifier genericClickableWithoutGesture_Kqv_Bsg$detectPressAndClickFromKey(Modifier modifier, final boolean z2, final Map<Key, PressInteraction.Press> map, final State<Offset> state, final CoroutineScope coroutineScope, final Function0<Unit> function0, final MutableInteractionSource mutableInteractionSource) {
        return KeyInputModifierKt.onKeyEvent(modifier, new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                return m613invokeZmokQxo(keyEvent.m5232unboximpl());
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0086  */
            /* JADX INFO: renamed from: invoke-ZmokQxo, reason: not valid java name */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Boolean m613invokeZmokQxo(android.view.KeyEvent r13) {
                /*
                    r12 = this;
                    boolean r0 = r2
                    r5 = 1
                    r4 = 0
                    r3 = 0
                    if (r0 == 0) goto L52
                    boolean r0 = androidx.compose.foundation.Clickable_androidKt.m620isPressZmokQxo(r13)
                    if (r0 == 0) goto L52
                    java.util.Map<androidx.compose.ui.input.key.Key, androidx.compose.foundation.interaction.PressInteraction$Press> r2 = r3
                    long r0 = androidx.compose.ui.input.key.KeyEvent_androidKt.m5243getKeyZmokQxo(r13)
                    androidx.compose.ui.input.key.Key r0 = androidx.compose.ui.input.key.Key.m4932boximpl(r0)
                    boolean r0 = r2.containsKey(r0)
                    if (r0 != 0) goto L86
                    androidx.compose.foundation.interaction.PressInteraction$Press r4 = new androidx.compose.foundation.interaction.PressInteraction$Press
                    androidx.compose.runtime.State<androidx.compose.ui.geometry.Offset> r0 = r4
                    java.lang.Object r0 = r0.getValue()
                    androidx.compose.ui.geometry.Offset r0 = (androidx.compose.ui.geometry.Offset) r0
                    long r0 = r0.m3947unboximpl()
                    r4.<init>(r0, r3)
                    java.util.Map<androidx.compose.ui.input.key.Key, androidx.compose.foundation.interaction.PressInteraction$Press> r2 = r3
                    long r0 = androidx.compose.ui.input.key.KeyEvent_androidKt.m5243getKeyZmokQxo(r13)
                    androidx.compose.ui.input.key.Key r0 = androidx.compose.ui.input.key.Key.m4932boximpl(r0)
                    r2.put(r0, r4)
                    kotlinx.coroutines.CoroutineScope r6 = r5
                    androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$1 r9 = new androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$1
                    androidx.compose.foundation.interaction.MutableInteractionSource r0 = r7
                    r9.<init>(r0, r4, r3)
                    kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
                    r10 = 3
                    r11 = 0
                    r7 = 0
                    r8 = 0
                    kotlinx.coroutines.BuildersKt.launch$default(r6, r7, r8, r9, r10, r11)
                L4d:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
                    return r0
                L52:
                    boolean r0 = r2
                    if (r0 == 0) goto L86
                    boolean r0 = androidx.compose.foundation.Clickable_androidKt.m618isClickZmokQxo(r13)
                    if (r0 == 0) goto L86
                    java.util.Map<androidx.compose.ui.input.key.Key, androidx.compose.foundation.interaction.PressInteraction$Press> r2 = r3
                    long r0 = androidx.compose.ui.input.key.KeyEvent_androidKt.m5243getKeyZmokQxo(r13)
                    androidx.compose.ui.input.key.Key r0 = androidx.compose.ui.input.key.Key.m4932boximpl(r0)
                    java.lang.Object r1 = r2.remove(r0)
                    androidx.compose.foundation.interaction.PressInteraction$Press r1 = (androidx.compose.foundation.interaction.PressInteraction.Press) r1
                    if (r1 == 0) goto L80
                    kotlinx.coroutines.CoroutineScope r6 = r5
                    androidx.compose.foundation.interaction.MutableInteractionSource r0 = r7
                    androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$2$1 r9 = new androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$2$1
                    r9.<init>(r0, r1, r3)
                    kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
                    r10 = 3
                    r11 = 0
                    r7 = 0
                    r8 = 0
                    kotlinx.coroutines.BuildersKt.launch$default(r6, r7, r8, r9, r10, r11)
                L80:
                    kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r6
                    r0.invoke()
                    goto L4d
                L86:
                    r5 = r4
                    goto L4d
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1.m613invokeZmokQxo(android.view.KeyEvent):java.lang.Boolean");
            }

            /* JADX INFO: renamed from: androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$1, reason: invalid class name */
            /* JADX INFO: compiled from: Clickable.kt */
            @InterfaceC1492Gx
            @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
            @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fLb\r\u000b\u0006\u000f\u0006\b\u0013\rs\u001eN\u0013\u0012\u001c\u0014\"\u001a\u0015u \u001e\u0019\"\u0019\u001b& \u0013&2'/66\n)8:<:.m/1A32D!D8GH\u0017E<\u001cFD?H$QON-H]\t\u0017\u000b\u0019", f = "\u001084-4))2*q.6", i = {}, l = {434}, m = "8>GA>9(KJH>H?", n = {}, s = {})
            static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ MutableInteractionSource $interactionSource;
                final /* synthetic */ PressInteraction.Press $press;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(MutableInteractionSource mutableInteractionSource, PressInteraction.Press press, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$interactionSource = mutableInteractionSource;
                    this.$press = press;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.$interactionSource, this.$press, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.label = 1;
                        if (this.$interactionSource.emit(this.$press, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }
        });
    }

    /* JADX INFO: renamed from: genericClickableWithoutGesture-Kqv-Bsg */
    public static final Modifier m611genericClickableWithoutGestureKqvBsg(Modifier modifier, MutableInteractionSource mutableInteractionSource, Indication indication, CoroutineScope coroutineScope, Map<Key, PressInteraction.Press> map, State<Offset> state, boolean z2, String str, Role role, String str2, Function0<Unit> function0, Function0<Unit> function02) {
        return modifier.then(FocusableKt.focusableInNonTouchMode(HoverableKt.hoverable(IndicationKt.indication(genericClickableWithoutGesture_Kqv_Bsg$detectPressAndClickFromKey(new ClickableSemanticsElement(z2, role, str2, function0, str, function02, null), z2, map, state, coroutineScope, function02, mutableInteractionSource), mutableInteractionSource, indication), mutableInteractionSource, z2), z2, mutableInteractionSource));
    }

    /* JADX INFO: renamed from: CombinedClickableNode-nSzSaCc */
    public static final CombinedClickableNode m602CombinedClickableNodenSzSaCc(Function0<Unit> function0, String str, Function0<Unit> function02, Function0<Unit> function03, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z2, String str2, Role role) {
        return new CombinedClickableNodeImpl(function0, str, function02, function03, mutableInteractionSource, indicationNodeFactory, z2, str2, role, null);
    }

    public static final boolean hasScrollableContainer(TraversableNode traversableNode) {
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        TraversableNodeKt.traverseAncestors(traversableNode, ScrollableContainerNode.TraverseKey, new Function1<TraversableNode, Boolean>() { // from class: androidx.compose.foundation.ClickableKt.hasScrollableContainer.1
            C04271() {
                super(1);
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0014  */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Boolean invoke(androidx.compose.ui.node.TraversableNode r4) {
                /*
                    r3 = this;
                    kotlin.jvm.internal.Ref$BooleanRef r2 = r2
                    boolean r0 = r2.element
                    r1 = 1
                    if (r0 != 0) goto L14
                    java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableContainerNode"
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r4, r0)
                    androidx.compose.foundation.gestures.ScrollableContainerNode r4 = (androidx.compose.foundation.gestures.ScrollableContainerNode) r4
                    boolean r0 = r4.getEnabled()
                    if (r0 == 0) goto L21
                L14:
                    r0 = r1
                L15:
                    r2.element = r0
                    kotlin.jvm.internal.Ref$BooleanRef r0 = r2
                    boolean r0 = r0.element
                    r0 = r0 ^ r1
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                    return r0
                L21:
                    r0 = 0
                    goto L15
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.ClickableKt.C04271.invoke(androidx.compose.ui.node.TraversableNode):java.lang.Boolean");
            }
        });
        return booleanRef.element;
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.ClickableKt$hasScrollableContainer$1 */
    /* JADX INFO: compiled from: Clickable.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,r\bӵLc\u000b\u0004I\u00066\u000b<Ȑ\u0017\"Z\u0011(\u000btjQ0rf\u000f6ʂW,\u0015m\n7"}, d2 = {"\n`]<a@F])\rS", "", "<nS2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9|Ir65f\f\u001c4t\u0016\u0017WB;A", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ !FoW+\u0004!FY\u000b.3j\u001d.6M:k\na{m]J\u0003-3J\u007f)\u0011)X6cRnFi"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C04271 extends Lambda implements Function1<TraversableNode, Boolean> {
        C04271() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(TraversableNode v2) {
            /*
                this = this;
                kotlin.jvm.internal.Ref$BooleanRef r2 = r2
                boolean r0 = r2.element
                r1 = 1
                if (r0 != 0) goto L14
                java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableContainerNode"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r4, r0)
                androidx.compose.foundation.gestures.ScrollableContainerNode r4 = (androidx.compose.foundation.gestures.ScrollableContainerNode) r4
                boolean r0 = r4.getEnabled()
                if (r0 == 0) goto L21
            L14:
                r0 = r1
            L15:
                r2.element = r0
                kotlin.jvm.internal.Ref$BooleanRef r0 = r2
                boolean r0 = r0.element
                r0 = r0 ^ r1
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            L21:
                r0 = 0
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.ClickableKt.C04271.invoke(androidx.compose.ui.node.TraversableNode):java.lang.Boolean");
        }
    }

    /* JADX INFO: renamed from: clickable-XHw0xAI */
    public static final Modifier m605clickableXHw0xAI(Modifier modifier, final boolean z2, final String str, final Role role, final Function0<Unit> function0) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.ClickableKt$clickable-XHw0xAI$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("clickable");
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z2));
                inspectorInfo.getProperties().set("onClickLabel", str);
                inspectorInfo.getProperties().set(ViewProps.ROLE, role);
                inspectorInfo.getProperties().set("onClick", function0);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.ClickableKt$clickable$2
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
                composer.startReplaceGroup(-756081143);
                ComposerKt.sourceInformation(composer, "C112@5124L7:Clickable.kt#71ulvw");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-756081143, i2, -1, "androidx.compose.foundation.clickable.<anonymous> (Clickable.kt:112)");
                }
                ProvidableCompositionLocal<Indication> localIndication = IndicationKt.getLocalIndication();
                ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume = composer.consume(localIndication);
                ComposerKt.sourceInformationMarkerEnd(composer);
                Indication indication = (Indication) objConsume;
                if (indication instanceof IndicationNodeFactory) {
                    composer.startReplaceGroup(617140216);
                    composer.endReplaceGroup();
                    mutableInteractionSource = null;
                } else {
                    composer.startReplaceGroup(617248189);
                    ComposerKt.sourceInformation(composer, "119@5488L39");
                    ComposerKt.sourceInformationMarkerStart(composer, 1266842702, "CC(remember):Clickable.kt#9igjgp");
                    Object objRememberedValue = composer.rememberedValue();
                    if (objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    composer.endReplaceGroup();
                }
                Modifier modifierM603clickableO2vRcR0 = ClickableKt.m603clickableO2vRcR0(Modifier.Companion, mutableInteractionSource, indication, z2, str, role, function0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierM603clickableO2vRcR0;
            }
        });
    }

    /* JADX INFO: renamed from: clickable-O2vRcR0 */
    public static final Modifier m603clickableO2vRcR0(Modifier modifier, MutableInteractionSource mutableInteractionSource, final Indication indication, final boolean z2, final String str, final Role role, Function0<Unit> function0) {
        ClickableElement clickableElementComposed$default;
        ClickableElement clickableElement;
        final Function0<Unit> clickableComposeCallback = function0 != null ? new ClickableComposeCallback(function0, role, "click", null) : function0;
        if (indication instanceof IndicationNodeFactory) {
            clickableElement = new ClickableElement(mutableInteractionSource, (IndicationNodeFactory) indication, z2, str, role, clickableComposeCallback, null);
        } else {
            if (indication != null) {
                if (mutableInteractionSource != null) {
                    clickableElementComposed$default = IndicationKt.indication(Modifier.Companion, mutableInteractionSource, indication).then(new ClickableElement(mutableInteractionSource, null, z2, str, role, clickableComposeCallback, null));
                } else {
                    clickableElementComposed$default = ComposedModifierKt.composed$default(Modifier.Companion, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.ClickableKt$clickable-O2vRcR0$$inlined$clickableWithIndicationIfNeeded$1
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
                            Modifier modifierThen = IndicationKt.indication(Modifier.Companion, mutableInteractionSource2, indication).then(new ClickableElement(mutableInteractionSource2, null, z2, str, role, clickableComposeCallback, null));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer.endReplaceGroup();
                            return modifierThen;
                        }
                    }, 1, null);
                }
                return modifier.then(clickableElementComposed$default);
            }
            clickableElement = new ClickableElement(mutableInteractionSource, null, z2, str, role, clickableComposeCallback, null);
        }
        clickableElementComposed$default = clickableElement;
        return modifier.then(clickableElementComposed$default);
    }

    /* JADX INFO: renamed from: combinedClickable-cJG_KMw */
    public static final Modifier m609combinedClickablecJG_KMw(Modifier modifier, final boolean z2, final String str, final Role role, final String str2, final Function0<Unit> function0, final Function0<Unit> function02, final Function0<Unit> function03) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable-cJG_KMw$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("combinedClickable");
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z2));
                inspectorInfo.getProperties().set("onClickLabel", str);
                inspectorInfo.getProperties().set(ViewProps.ROLE, role);
                inspectorInfo.getProperties().set("onClick", function03);
                inspectorInfo.getProperties().set("onDoubleClick", function02);
                inspectorInfo.getProperties().set("onLongClick", function0);
                inspectorInfo.getProperties().set("onLongClickLabel", str2);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable$2
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
                composer.startReplaceGroup(1969174843);
                ComposerKt.sourceInformation(composer, "C252@11777L7:Clickable.kt#71ulvw");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1969174843, i2, -1, "androidx.compose.foundation.combinedClickable.<anonymous> (Clickable.kt:252)");
                }
                ProvidableCompositionLocal<Indication> localIndication = IndicationKt.getLocalIndication();
                ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume = composer.consume(localIndication);
                ComposerKt.sourceInformationMarkerEnd(composer);
                Indication indication = (Indication) objConsume;
                if (indication instanceof IndicationNodeFactory) {
                    composer.startReplaceGroup(-1726989699);
                    composer.endReplaceGroup();
                    mutableInteractionSource = null;
                } else {
                    composer.startReplaceGroup(-1726881726);
                    ComposerKt.sourceInformation(composer, "259@12141L39");
                    ComposerKt.sourceInformationMarkerStart(composer, -1995363031, "CC(remember):Clickable.kt#9igjgp");
                    Object objRememberedValue = composer.rememberedValue();
                    if (objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    composer.endReplaceGroup();
                }
                Modifier modifierM607combinedClickableXVZzFYc = ClickableKt.m607combinedClickableXVZzFYc(Modifier.Companion, mutableInteractionSource, indication, z2, str, role, str2, function0, function02, function03);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierM607combinedClickableXVZzFYc;
            }
        });
    }

    /* JADX INFO: renamed from: combinedClickable-XVZzFYc */
    public static final Modifier m607combinedClickableXVZzFYc(Modifier modifier, MutableInteractionSource mutableInteractionSource, final Indication indication, final boolean z2, final String str, final Role role, final String str2, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
        CombinedClickableElement combinedClickableElementComposed$default;
        CombinedClickableElement combinedClickableElement;
        final Function0<Unit> clickableComposeCallback = function0 != null ? new ClickableComposeCallback(function0, role, "long click", null) : function0;
        final Function0<Unit> clickableComposeCallback2 = function02 != null ? new ClickableComposeCallback(function02, role, "double click", null) : function02;
        final Function0<Unit> clickableComposeCallback3 = function03 != null ? new ClickableComposeCallback(function03, role, "click", null) : function03;
        if (indication instanceof IndicationNodeFactory) {
            combinedClickableElement = new CombinedClickableElement(mutableInteractionSource, (IndicationNodeFactory) indication, z2, str, role, clickableComposeCallback3, str2, clickableComposeCallback, clickableComposeCallback2, null);
        } else {
            if (indication != null) {
                if (mutableInteractionSource != null) {
                    combinedClickableElementComposed$default = IndicationKt.indication(Modifier.Companion, mutableInteractionSource, indication).then(new CombinedClickableElement(mutableInteractionSource, null, z2, str, role, clickableComposeCallback3, str2, clickableComposeCallback, clickableComposeCallback2, null));
                } else {
                    combinedClickableElementComposed$default = ComposedModifierKt.composed$default(Modifier.Companion, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable-XVZzFYc$$inlined$clickableWithIndicationIfNeeded$1
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
                            Modifier modifierThen = IndicationKt.indication(Modifier.Companion, mutableInteractionSource2, indication).then(new CombinedClickableElement(mutableInteractionSource2, null, z2, str, role, clickableComposeCallback3, str2, clickableComposeCallback, clickableComposeCallback2, null));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer.endReplaceGroup();
                            return modifierThen;
                        }
                    }, 1, null);
                }
                return modifier.then(combinedClickableElementComposed$default);
            }
            combinedClickableElement = new CombinedClickableElement(mutableInteractionSource, null, z2, str, role, clickableComposeCallback3, str2, clickableComposeCallback, clickableComposeCallback2, null);
        }
        combinedClickableElementComposed$default = combinedClickableElement;
        return modifier.then(combinedClickableElementComposed$default);
    }
}
