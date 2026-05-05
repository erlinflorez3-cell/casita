package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.unit.Dp;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.photoshop.PhotoshopDirectory;
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
/* JADX INFO: compiled from: Chip.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4O\u0007\"B\u0012\u007fјnjG9L͜P.hS2\u000fq}<$i*yCAW\"}8\tUS}˧\u001fJ\t\n\u0004B\u0016\u001a\u0007jDI\u0004ym\u0016\u001d4Zom4]sK<xtd\u0006060<\u0012\u0005/\u001b:L\u001e{\u0013Cy\r\"4NvRR;Nŋ\u001e\u0012\u0014Eh\",l\u007fTFJ|]h0Q\u0014\u001aF\\9w0+`=Jb;%v\u00103qA˝9\u00153iK\u0018`rW\u0003m\u0005m\u000bv??-_r\u00065\u001fó\u0014]1]&urTvKe)/5Fgi[R\u001e(&{*\u001el\b\u001c\u0018?H\\@Jj\u0016\"Kt!h\u0007OؿbD\u0006\u0017oLg<\u000e9C9Igј`ݢуM6߉\t\u0015&#\u000fx9]Z\u0016n\u001ekk\u0006VIQn>̩Mˣ֨<lձtj\n*\u0012:_\u00025\u0007\u001f7g<E[Q#OlʮGֳђu\u0004¾l[qRVJ:p\u001cC8\u0012\\qRg\u001dk~U҉+Ҋݬ\u001bSΘ\u0002\u0010\u001b j\u0002T#+\u001d\\X9\u0001xQu\nS0т6ժ̝j\rĆ=f;5_m(cX\u0005\"H\ry\u0013Z~B\u0002\rʐ[̥Ш1Gн\u0014\u007f\u0004D\\\u0016+4E\u0001*=μ1\"d\u0018Nҳ:p@\u0005\teyӹ\u0014\u001cՑ7.\u0011\b<v\u001f\u007f~{Gלήx"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d%<Y{/3j\u001d.+F?v\u0014%\u0015y]H\u000bm5$", "", "3kTCT;B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", ">qT@f,=3 ~\fZ;\u0001\u00138", "4nRBf,=3 ~\fZ;\u0001\u00138", "6ne2e,=3 ~\fZ;\u0001\u00138", "2qP4Z,=3 ~\fZ;\u0001\u00138", "2hb.U3>Rx\u0006zo(\f\r9n", "uE5\u00139\r\u001f:\u001f\t\ne0\u0006R4v\bq\u007fI\u0010\u0017$Pk\u0015\u0006U%6U\u000e'FK 7[RH{2-\u001fuI5\u0014i,[Lj8", "5dc\u0011\\::P ~y>3|\u001a+t\u00042\u0005\b_jvL?\u000f$", "u(5", "\u0014", "5dc\u0011e(@U\u0019}Ze,\u000e\u0005>i\n1C\u001fTv\u001c\u0017pu", "5dc\u0012_,OO(\u0003\u0005gs[\\\u000fjO)c", "5dc\u0013b*Na\u0019}Ze,\u000e\u0005>i\n1C\u001fTv\u001c\u0017pu", "5dc\u0015b=>`\u0019}Ze,\u000e\u0005>i\n1C\u001fTv\u001c\u0017pu", "5dc\u001de,La\u0019}Ze,\u000e\u0005>i\n1C\u001fTv\u001c\u0017pu", "/mX:T;>3 ~\fZ;\u0001\u00138", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", "3mP/_,=", "", "7mc2e(<b\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005O=-\u0015u]7\u0016g6Wd1WYL,2", "uY;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~]\u0007/7z\u0012,\\GEt}\u0002\u001ewaF\u0003a;R\u000105V^9ZRH$\u0010\u001bY\u001bX/\f\u0018#?.vOA-\buV\u0012Dw\u0005\u0014\u0016W\u0013txM`\u001eG\u0007jY\u0005\u0010dOXl\u0004K@X,(n\u0014j'j:\u00041$z(\u001fpPww\u000bO r(", "3pd._:", "=sW2e", "6`b566=S", "", "AgP1b>\u001eZ\u0019\u0010vm0\u0007\u0012", "AgP1b>\u001eZ\u0019\u0010vm0\u0007\u0012mm{7{M\u0005\u0013\u001e\u0015i\u001b<}%1g}", ";`c2e0:Zfx\b^3|\u0005=e", ":`bA<5MS&zxm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005O=-\u0015u]7\u0016g6WL"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SelectableChipElevation {
    public static final int $stable = 0;
    private final float disabledElevation;
    private final float draggedElevation;
    private final float elevation;
    private final float focusedElevation;
    private final float hoveredElevation;
    private final float pressedElevation;

    public /* synthetic */ SelectableChipElevation(float f2, float f3, float f4, float f5, float f6, float f7, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f3, f4, f5, f6, f7);
    }

    private SelectableChipElevation(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.elevation = f2;
        this.pressedElevation = f3;
        this.focusedElevation = f4;
        this.hoveredElevation = f5;
        this.draggedElevation = f6;
        this.disabledElevation = f7;
    }

    /* JADX INFO: renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m2484getElevationD9Ej5fM() {
        return this.elevation;
    }

    /* JADX INFO: renamed from: getPressedElevation-D9Ej5fM, reason: not valid java name */
    public final float m2487getPressedElevationD9Ej5fM() {
        return this.pressedElevation;
    }

    /* JADX INFO: renamed from: getFocusedElevation-D9Ej5fM, reason: not valid java name */
    public final float m2485getFocusedElevationD9Ej5fM() {
        return this.focusedElevation;
    }

    /* JADX INFO: renamed from: getHoveredElevation-D9Ej5fM, reason: not valid java name */
    public final float m2486getHoveredElevationD9Ej5fM() {
        return this.hoveredElevation;
    }

    /* JADX INFO: renamed from: getDraggedElevation-D9Ej5fM, reason: not valid java name */
    public final float m2483getDraggedElevationD9Ej5fM() {
        return this.draggedElevation;
    }

    /* JADX INFO: renamed from: getDisabledElevation-D9Ej5fM, reason: not valid java name */
    public final float m2482getDisabledElevationD9Ej5fM() {
        return this.disabledElevation;
    }

    public final State<Dp> shadowElevation$material3_release(boolean z2, InteractionSource interactionSource, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1888175651, "C(shadowElevation)2311@110081L74:Chip.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1888175651, i2, -1, "androidx.compose.material3.SelectableChipElevation.shadowElevation (Chip.kt:2310)");
        }
        State<Dp> stateAnimateElevation = animateElevation(z2, interactionSource, composer, (-1) - (((-1) - i2) | ((-1) - PhotoshopDirectory.TAG_QUICK_MASK_INFORMATION)));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stateAnimateElevation;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final State<Dp> animateElevation(boolean z2, InteractionSource interactionSource, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 664514136, "C(animateElevation)2319@110330L46,2320@110408L47,2321@110498L1473,2321@110464L1507,2373@112526L51,2375@112610L514,2375@112587L537:Chip.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(664514136, i2, -1, "androidx.compose.material3.SelectableChipElevation.animateElevation (Chip.kt:2318)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, -208085728, "CC(remember):Chip.kt#9igjgp");
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt.mutableStateListOf();
            composer.updateRememberedValue(objRememberedValue);
        }
        SnapshotStateList snapshotStateList = (SnapshotStateList) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, -208083231, "CC(remember):Chip.kt#9igjgp");
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        MutableState mutableState = (MutableState) objRememberedValue2;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, -208078925, "CC(remember):Chip.kt#9igjgp");
        int i3 = 1;
        byte b2 = ((((-1) - (((-1) - i2) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION))) ^ 48) > 32 && composer.changed(interactionSource)) || (i2 + 48) - (48 | i2) == 32;
        Object objRememberedValue3 = composer.rememberedValue();
        if (b2 != false || objRememberedValue3 == Composer.Companion.getEmpty()) {
            objRememberedValue3 = (Function2) new SelectableChipElevation$animateElevation$1$1(interactionSource, snapshotStateList, null);
            composer.updateRememberedValue(objRememberedValue3);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        int i4 = i2 >> 3;
        EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composer, (i4 + 14) - (i4 | 14));
        Interaction interaction = (Interaction) CollectionsKt.lastOrNull((List) snapshotStateList);
        float f2 = !z2 ? this.disabledElevation : interaction instanceof PressInteraction.Press ? this.pressedElevation : interaction instanceof HoverInteraction.Enter ? this.hoveredElevation : interaction instanceof FocusInteraction.Focus ? this.focusedElevation : interaction instanceof DragInteraction.Start ? this.draggedElevation : this.elevation;
        ComposerKt.sourceInformationMarkerStart(composer, -208015451, "CC(remember):Chip.kt#9igjgp");
        Object objRememberedValue4 = composer.rememberedValue();
        if (objRememberedValue4 == Composer.Companion.getEmpty()) {
            objRememberedValue4 = new Animatable(Dp.m6636boximpl(f2), VectorConvertersKt.getVectorConverter(Dp.Companion), null, null, 12, null);
            composer.updateRememberedValue(objRememberedValue4);
        }
        Animatable animatable = (Animatable) objRememberedValue4;
        ComposerKt.sourceInformationMarkerEnd(composer);
        Dp dpM6636boximpl = Dp.m6636boximpl(f2);
        ComposerKt.sourceInformationMarkerStart(composer, -208012300, "CC(remember):Chip.kt#9igjgp");
        boolean zChangedInstance = composer.changedInstance(animatable);
        boolean zChanged = composer.changed(f2);
        int i5 = ((zChangedInstance ? 1 : 0) + (zChanged ? 1 : 0)) - ((zChangedInstance ? 1 : 0) & (zChanged ? 1 : 0)) != 1 ? 0 : 1;
        if (((((-1) - (((-1) - i2) | ((-1) - 14))) ^ 6) <= 4 || !composer.changed(z2)) && (-1) - (((-1) - i2) | ((-1) - 6)) != 4) {
            i3 = 0;
        }
        int i6 = (i5 + i3) - (i5 & i3);
        boolean zChangedInstance2 = composer.changedInstance(interaction);
        boolean z3 = (i6 + (zChangedInstance2 ? 1 : 0)) - (i6 & (zChangedInstance2 ? 1 : 0)) == 1;
        Object objRememberedValue5 = composer.rememberedValue();
        if (z3 || objRememberedValue5 == Composer.Companion.getEmpty()) {
            animatable = animatable;
            objRememberedValue5 = (Function2) new SelectableChipElevation$animateElevation$2$1(animatable, f2, z2, interaction, mutableState, null);
            composer.updateRememberedValue(objRememberedValue5);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        EffectsKt.LaunchedEffect(dpM6636boximpl, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composer, 0);
        State<Dp> stateAsState = animatable.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stateAsState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Interaction animateElevation$lambda$2(MutableState<Interaction> mutableState) {
        return mutableState.getValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SelectableChipElevation)) {
            return false;
        }
        SelectableChipElevation selectableChipElevation = (SelectableChipElevation) obj;
        return Dp.m6643equalsimpl0(this.elevation, selectableChipElevation.elevation) && Dp.m6643equalsimpl0(this.pressedElevation, selectableChipElevation.pressedElevation) && Dp.m6643equalsimpl0(this.focusedElevation, selectableChipElevation.focusedElevation) && Dp.m6643equalsimpl0(this.hoveredElevation, selectableChipElevation.hoveredElevation) && Dp.m6643equalsimpl0(this.disabledElevation, selectableChipElevation.disabledElevation);
    }

    public int hashCode() {
        return (((((((Dp.m6644hashCodeimpl(this.elevation) * 31) + Dp.m6644hashCodeimpl(this.pressedElevation)) * 31) + Dp.m6644hashCodeimpl(this.focusedElevation)) * 31) + Dp.m6644hashCodeimpl(this.hoveredElevation)) * 31) + Dp.m6644hashCodeimpl(this.disabledElevation);
    }
}
