package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
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
/* JADX INFO: compiled from: FloatingActionButton.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4F\u0007\"B\u0012\u007fјnjO0LeN.ZS8\u0018s{:$c$\u007fICU \u0002(\u001eeȞ\u0018g\u001dI\u001b0IƤ\u0016\u001a\u0007jDI\u0004ym\u0016\u001d4Zom4]sK<xtd\u0006060<\u0012\u0005/\u001bݵL\u0010\u0005\u007f\fd\u001a\u0019HF\u0001<b\r{\u0006H\u001a6B.\n6\\\u0016X|Iǰa:=.KzPZ?_^\n}\u0013Tb?\u000f\r`L*\u0007ˑ5]+a\u0012\u001fR\nOIS:X\u0013y?-;K\u0004WdY.\u001cE/]\u0016urTfKPԃ\u0010)1aqV\u0019!6\u000b\u0013{;=J\u05faϳ&Gό,ԿǴ\f\u00109\t\u0001h\u0011d\u0010^Z\u007f)b\rА'Ƨ2ٿ߆\u001aeЂe=!NE\u0002U!,&\u0019nO\\+טb۶\u001aƘʦP0ҨD?PN\u0018_\u000e\u0002\u0012tz\u0002X\u0005\u0007ϝ\u0002ôz߾ҽ\u0016$ھ_;+!y\b\u0019Xux\u001d`\u0017T@ɰJڐ!Âߤ6)Á\u0010\\Ld\u0013q¯Ta4\u0014Sɞp5|\u0010\u0013&{ʥ@7"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006W,?U\r$@oq,\\GEt\u0011.$wkBfj,_r6KVW\u0002", "", "2dU.h3M3 ~\fZ;\u0001\u00138", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", ">qT@f,=3 ~\fZ;\u0001\u00138", "4nRBf,=3 ~\fZ;\u0001\u00138", "6ne2e,=3 ~\fZ;\u0001\u00138", "uE5\u00139\u0013D](\u0006~gu\u0002\u001a7/\u00041\u000b@\u000e \u0013N9l<w!E`\r}Av$=ZS9z>+|dn?\u0007p\u0002\u0012g", "\u0014", "/mX:T;>3 ~\fZ;\u0001\u00138", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", "7mc2e(<b\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005O=-\u0015u]7\u0016g6Wd1WYL,2", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn9b\r Di\u0014=QMD5\u0018'$hn5\u0005r0X\u007f\u0015Q\\[*\\(Y9\u001d\u0011g\u0018R* NWK,yNE\u001fQ9Y\u000bJl\t\f_k?r{Ld\u0010TOx9(%qEfi}FT\u000f`4l\u0017i+\\\u0004G4\u001d\u0001\u001d#h\u001a\u001c\u0019wb\u0011H", "3pd._:", "", "=sW2e", "6`b566=S", "", "AgP1b>\u001eZ\u0019\u0010vm0\u0007\u0012", "AgP1b>\u001eZ\u0019\u0010vm0\u0007\u0012mm{7{M\u0005\u0013\u001e\u0015i\u001b<}%1g}", "Bn]._\fES*z\nb6\u0006", "Bn]._\fES*z\nb6\u0006P\u000e9_-KAhU\u001fC~\u000eIz!<'w-7t\u0016*[C", "u(5", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class FloatingActionButtonElevation {
    public static final int $stable = 0;
    private final float defaultElevation;
    private final float focusedElevation;
    private final float hoveredElevation;
    private final float pressedElevation;

    public /* synthetic */ FloatingActionButtonElevation(float f2, float f3, float f4, float f5, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f3, f4, f5);
    }

    private FloatingActionButtonElevation(float f2, float f3, float f4, float f5) {
        this.defaultElevation = f2;
        this.pressedElevation = f3;
        this.focusedElevation = f4;
        this.hoveredElevation = f5;
    }

    public final State<Dp> shadowElevation$material3_release(InteractionSource interactionSource, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -424810125, "C(shadowElevation)517@24051L55:FloatingActionButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-424810125, i2, -1, "androidx.compose.material3.FloatingActionButtonElevation.shadowElevation (FloatingActionButton.kt:516)");
        }
        State<Dp> stateAnimateElevation = animateElevation(interactionSource, composer, i2 & 126);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stateAnimateElevation;
    }

    /* JADX INFO: renamed from: tonalElevation-D9Ej5fM$material3_release, reason: not valid java name */
    public final float m2138tonalElevationD9Ej5fM$material3_release() {
        return this.defaultElevation;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final State<Dp> animateElevation(InteractionSource interactionSource, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1845106002, "C(animateElevation)527@24330L345,536@24706L276,536@24685L297,545@25026L1282,545@24992L1316:FloatingActionButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1845106002, i2, -1, "androidx.compose.material3.FloatingActionButtonElevation.animateElevation (FloatingActionButton.kt:525)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 1492982391, "CC(remember):FloatingActionButton.kt#9igjgp");
        int i3 = (-1) - (((-1) - i2) | ((-1) - 14));
        int i4 = i3 ^ 6;
        byte b2 = (i4 > 4 && composer.changed(interactionSource)) || (i2 + 6) - (6 | i2) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (b2 != false || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new FloatingActionButtonElevationAnimatable(this.defaultElevation, this.pressedElevation, this.hoveredElevation, this.focusedElevation, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable = (FloatingActionButtonElevationAnimatable) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, 1492994354, "CC(remember):FloatingActionButton.kt#9igjgp");
        boolean zChangedInstance = composer.changedInstance(floatingActionButtonElevationAnimatable);
        int i5 = ((((112 & i2) ^ 48) <= 32 || !composer.changed(this)) && (48 & i2) != 32) ? 0 : 1;
        int i6 = ((zChangedInstance ? 1 : 0) + i5) - ((zChangedInstance ? 1 : 0) & i5);
        Object objRememberedValue2 = composer.rememberedValue();
        if (i6 != 0 || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = (Function2) new FloatingActionButtonElevation$animateElevation$1$1(floatingActionButtonElevationAnimatable, this, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        EffectsKt.LaunchedEffect(this, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer, (-1) - (((-1) - (i2 >> 3)) | ((-1) - 14)));
        ComposerKt.sourceInformationMarkerStart(composer, 1493005600, "CC(remember):FloatingActionButton.kt#9igjgp");
        int i7 = ((i4 > 4 && composer.changed(interactionSource)) || (-1) - (((-1) - i2) | ((-1) - 6)) == 4) ? 1 : 0;
        boolean zChangedInstance2 = composer.changedInstance(floatingActionButtonElevationAnimatable);
        int i8 = ((zChangedInstance2 ? 1 : 0) + i7) - ((zChangedInstance2 ? 1 : 0) & i7);
        Object objRememberedValue3 = composer.rememberedValue();
        if (i8 != 0 || objRememberedValue3 == Composer.Companion.getEmpty()) {
            objRememberedValue3 = (Function2) new FloatingActionButtonElevation$animateElevation$2$1(interactionSource, floatingActionButtonElevationAnimatable, null);
            composer.updateRememberedValue(objRememberedValue3);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composer, i3);
        State<Dp> stateAsState = floatingActionButtonElevationAnimatable.asState();
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
        if (obj == null || !(obj instanceof FloatingActionButtonElevation)) {
            return false;
        }
        FloatingActionButtonElevation floatingActionButtonElevation = (FloatingActionButtonElevation) obj;
        if (Dp.m6643equalsimpl0(this.defaultElevation, floatingActionButtonElevation.defaultElevation) && Dp.m6643equalsimpl0(this.pressedElevation, floatingActionButtonElevation.pressedElevation) && Dp.m6643equalsimpl0(this.focusedElevation, floatingActionButtonElevation.focusedElevation)) {
            return Dp.m6643equalsimpl0(this.hoveredElevation, floatingActionButtonElevation.hoveredElevation);
        }
        return false;
    }

    public int hashCode() {
        return (((((Dp.m6644hashCodeimpl(this.defaultElevation) * 31) + Dp.m6644hashCodeimpl(this.pressedElevation)) * 31) + Dp.m6644hashCodeimpl(this.focusedElevation)) * 31) + Dp.m6644hashCodeimpl(this.hoveredElevation);
    }
}
