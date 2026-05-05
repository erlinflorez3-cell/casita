package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.unit.Dp;
import com.drew.metadata.photoshop.PhotoshopDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
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
/* JADX INFO: compiled from: Button.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4G\u0007\"B\u0012\u007fјnjG9L͜P.hS2\u000fq}<$i*yCAV \u00038ޛ\u007fN\u0016f/w`ŏS\u0013\u0014\u0016\u0011jZJe|k\u0014'2ppO7[rU9\u000fuF\t.6:8(\u0006\u0011\u001e8M(v)Dƚ\u0010\u0012>F9[`\u0015e\u000b*\u0014\u0016>N\u0002Le\u0018RDR\u0005]h:S\u0007wNf'\u000e=CNϘJT5\u001b?r,:X7c UY\u0011\u0017j]U\u0002mp\u0004ݲho-9Z\fWdjF(]N] ux6^\u0015Q\u000f\rU4\u007fgYZ&(&\u0006,\u0011J\u0010&\u0006UUt,բj\n\u0014G\u0003\u0001$T^\u0002vB.{8ت\u0019Ք~đ۸8\u001aƻUcC\u0019\\>L\u0019\u001b#;\u0001\u001d\"2٭\u0010ؤ\u0014ÑȑvPśUBEH\\\u0011*Q{\u0007\tb0+Z΅IƂ.Ʌö-\u0016É;]A#/rR\\Rk\u000f\u0005\u000fi*֢TΫ?̎Ļ\u00156Ҋ\r\u000ebDr\f<dbZD\u0011{\u001d+\u0378\u007fު\u0012\u05feиv;Ƽ)\u0012VOvpҗMf\u0012(5ϫS\bms\u000e]Xӽ7J"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006S5Dh\b)\u0017t\u0016?IR?u=s", "", "2dU.h3M3 ~\fZ;\u0001\u00138", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", ">qT@f,=3 ~\fZ;\u0001\u00138", "4nRBf,=3 ~\fZ;\u0001\u00138", "6ne2e,=3 ~\fZ;\u0001\u00138", "2hb.U3>Rx\u0006zo(\f\r9n", "uE5\u00139\r%Y#\u000e\u0002b5F\u000e@mI,\u0005O\u0001$ CvW\u001bv&1i\u0005/\u0015w\u001f<\\PKiC(\"P]F\rc9$:\u0018", "\u0014", "/mX:T;>3 ~\fZ;\u0001\u00138", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", "3mP/_,=", "", "7mc2e(<b\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005O=-\u0015u]7\u0016g6Wd1WYL,2", "uY;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~]\u0007/7z\u0012,\\GEt}\u0002\u001ewaF\u0003a;R\u000105V^9ZRH$\u0010\u001bY\u001bX/\f\u0018#?.vOA-\buV\u0012Dw\u0005\u0014\u0016W\u0013txM`\u001eG\u0007jY\u0005\u0010dOXl\u0004K@X,(n\u0014j'j:\u00041$z(\u001fpPww\u000bO r(", "3pd._:", "=sW2e", "6`b566=S", "", "AgP1b>\u001eZ\u0019\u0010vm0\u0007\u0012", "AgP1b>\u001eZ\u0019\u0010vm0\u0007\u0012mm{7{M\u0005\u0013\u001e\u0015i\u001b<}%1g}", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ButtonElevation {
    public static final int $stable = 0;
    private final float defaultElevation;
    private final float disabledElevation;
    private final float focusedElevation;
    private final float hoveredElevation;
    private final float pressedElevation;

    public /* synthetic */ ButtonElevation(float f2, float f3, float f4, float f5, float f6, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f3, f4, f5, f6);
    }

    private ButtonElevation(float f2, float f3, float f4, float f5, float f6) {
        this.defaultElevation = f2;
        this.pressedElevation = f3;
        this.focusedElevation = f4;
        this.hoveredElevation = f5;
        this.disabledElevation = f6;
    }

    public final State<Dp> shadowElevation$material3_release(boolean z2, InteractionSource interactionSource, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -2045116089, "C(shadowElevation)931@43193L74:Button.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2045116089, i2, -1, "androidx.compose.material3.ButtonElevation.shadowElevation (Button.kt:930)");
        }
        State<Dp> stateAnimateElevation = animateElevation(z2, interactionSource, composer, (i2 + PhotoshopDirectory.TAG_QUICK_MASK_INFORMATION) - (i2 | PhotoshopDirectory.TAG_QUICK_MASK_INFORMATION));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stateAnimateElevation;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final State<Dp> animateElevation(boolean z2, InteractionSource interactionSource, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1312510462, "C(animateElevation)939@43442L46,940@43531L1077,940@43497L1111,982@45105L51,984@45189L863,984@45166L886:Button.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1312510462, i2, -1, "androidx.compose.material3.ButtonElevation.animateElevation (Button.kt:938)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, -842871664, "CC(remember):Button.kt#9igjgp");
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt.mutableStateListOf();
            composer.updateRememberedValue(objRememberedValue);
        }
        SnapshotStateList snapshotStateList = (SnapshotStateList) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, -842867785, "CC(remember):Button.kt#9igjgp");
        int i3 = 1;
        byte b2 = (((112 & i2) ^ 48) > 32 && composer.changed(interactionSource)) || (48 & i2) == 32;
        Object objRememberedValue2 = composer.rememberedValue();
        if (b2 != false || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = (Function2) new ButtonElevation$animateElevation$1$1(interactionSource, snapshotStateList, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer, (-1) - (((-1) - (i2 >> 3)) | ((-1) - 14)));
        Interaction interaction = (Interaction) CollectionsKt.lastOrNull((List) snapshotStateList);
        float f2 = !z2 ? this.disabledElevation : interaction instanceof PressInteraction.Press ? this.pressedElevation : interaction instanceof HoverInteraction.Enter ? this.hoveredElevation : interaction instanceof FocusInteraction.Focus ? this.focusedElevation : this.defaultElevation;
        ComposerKt.sourceInformationMarkerStart(composer, -842818443, "CC(remember):Button.kt#9igjgp");
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == Composer.Companion.getEmpty()) {
            objRememberedValue3 = new Animatable(Dp.m6636boximpl(f2), VectorConvertersKt.getVectorConverter(Dp.Companion), null, null, 12, null);
            composer.updateRememberedValue(objRememberedValue3);
        }
        Animatable animatable = (Animatable) objRememberedValue3;
        ComposerKt.sourceInformationMarkerEnd(composer);
        Dp dpM6636boximpl = Dp.m6636boximpl(f2);
        ComposerKt.sourceInformationMarkerStart(composer, -842814943, "CC(remember):Button.kt#9igjgp");
        boolean zChangedInstance = composer.changedInstance(animatable);
        boolean zChanged = composer.changed(f2);
        int i4 = ((zChangedInstance ? 1 : 0) + (zChanged ? 1 : 0)) - ((zChangedInstance ? 1 : 0) & (zChanged ? 1 : 0)) != 1 ? 0 : 1;
        int i5 = (((((i2 + 14) - (14 | i2)) ^ 6) <= 4 || !composer.changed(z2)) && (i2 + 6) - (6 | i2) != 4) ? 0 : 1;
        int i6 = (i4 + i5) - (i4 & i5);
        if (((((i2 + 896) - (896 | i2)) ^ BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) <= 256 || !composer.changed(this)) && (-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) != 256) {
            i3 = 0;
        }
        boolean z3 = (-1) - (((-1) - ((i6 + i3) - (i6 & i3))) & ((-1) - (composer.changedInstance(interaction) ? 1 : 0))) == 1;
        Object objRememberedValue4 = composer.rememberedValue();
        if (z3 || objRememberedValue4 == Composer.Companion.getEmpty()) {
            animatable = animatable;
            objRememberedValue4 = (Function2) new ButtonElevation$animateElevation$2$1(animatable, f2, z2, this, interaction, null);
            composer.updateRememberedValue(objRememberedValue4);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        EffectsKt.LaunchedEffect(dpM6636boximpl, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composer, 0);
        State<Dp> stateAsState = animatable.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stateAsState;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ButtonElevation)) {
            return false;
        }
        ButtonElevation buttonElevation = (ButtonElevation) obj;
        return Dp.m6643equalsimpl0(this.defaultElevation, buttonElevation.defaultElevation) && Dp.m6643equalsimpl0(this.pressedElevation, buttonElevation.pressedElevation) && Dp.m6643equalsimpl0(this.focusedElevation, buttonElevation.focusedElevation) && Dp.m6643equalsimpl0(this.hoveredElevation, buttonElevation.hoveredElevation) && Dp.m6643equalsimpl0(this.disabledElevation, buttonElevation.disabledElevation);
    }

    public int hashCode() {
        return (((((((Dp.m6644hashCodeimpl(this.defaultElevation) * 31) + Dp.m6644hashCodeimpl(this.pressedElevation)) * 31) + Dp.m6644hashCodeimpl(this.focusedElevation)) * 31) + Dp.m6644hashCodeimpl(this.hoveredElevation)) * 31) + Dp.m6644hashCodeimpl(this.disabledElevation);
    }
}
