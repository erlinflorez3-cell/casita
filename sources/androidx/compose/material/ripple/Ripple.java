package androidx.compose.material.ripple;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationInstance;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: Ripple.kt */
/* JADX INFO: loaded from: classes.dex */
@Deprecated(message = "\u0015K\fArw\u001a[\u0018IA:d\u001d1\u000ejQ fvq\u001cb\u0003K\\yRycou\\pGZavMG2<I ")
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯL\u001d<K!&i\u0016DLш|\u0004O\u000f8é6B\u0015\"4ߚ\u007f\u0007|jA0ZeP.XU2\u000fyڔ<řc$\u007fIC٥\"}8\tWȞog\u0005Jb\u000bI\u000f\u000e\u0016\u000fj4կ]xs\u0012\u00172HpERcڎm9\u000fsv&0608\u0012\u0005/\u001b:L\u001ex\u0013Cy\u000f\":NtRX\u001dO\u0015\u001a@\fl%Ә\"\\uU~YzfR/Q\u0004\u001aH\\1w2\u0013L;Q\u001bܢ\r?g,7X7c\"kgK\u001a`iW\u0003m\u0001m\tv7?+w\u0005\u001e;ݼ\u0004\u0014#=\u0018Qk\u0006>\\3e\u0011\u00105;gcya>,\u0006z\u0014\rj\u0005>\n5JF-Hi8\u0018Ax\u000bYPR\u0012^p\u0006)ff!3\u0015K1I\u001dvQ\u0010QGS}!͕\f̔ţ\u0005p'rb&1!)T\u0010Q_R\u0017׃Jݳ\u000eYEЧT\u0003p\u0006B\n@I\u0010/*\u0017\\\u001c{ڞ]ޠ'!sȵ\u0019Xux\u001d`\u0017V@ɰJڐ!Âߤ6)Á\u0010\\Ld\u0013s¯Ta4\u0014Sɞp5|\u0010\u0013&{ʥ@:"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCvWIz0@`}i$q!9TC\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\t>X\u0002\u001e3|\u001a8V\u0019", "0nd;W,=", "", "@`S6h:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "1n[<e", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "uY5\u0019T5=`#\u0003yquz\u00137p\n6{\n\u000e' Vs\u0016<@\u0013DU\r \rT\u001c8\\J?t}#&p+=\u0010r,[\u007f#N\u0016-,]N\u0003D#od\u0017\\:\u001a\u0015WP.{,3,\u000e,VW~Y", "\u0014", "3pd._:", "=sW2e", "", "6`b566=S", "", "@d\\2`)>`\t\nyZ;|\b\u0013n\u000e7wI~\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\t>X\u0002\u001e3|\u001a8V'DyC\u001a\u001efa\u000f", "7mc2e(<b\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005O=-\u0015u]7\u0016g6Wd1WYL,2", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn9b\r Di\u0014=QMD5\u0018'$hn5\u0005r0X\u007f\u0015Q\\[*\\(Y9\u001d\u0011g\u0018R* NWK,yNE\u001fQ9Y\u000bJl\t\f_k?r{Ld\u0010TOx9(%qEfi}FT\u000f`4l\u0017i+\\\u0004;.$z\u0018\u0017wT8\u0013E7\u001aqVwcvK#\u0004\u001c-L|WOCo+", "@d\\2`)>`\t\nyZ;|\b\u001ci\u000b3\u0003@d %Vk\u0017:v", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCvWIz0@`}i$q!9TC\u001ft3\"\u0013dp=\u0011l\u0010W\u00056CUL,2", "@h_=_,\u001aZ$\u0002v", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCvWIz0@`}i$q!9TC\u0017r?!\u0011>", "@d\\2`)>`\t\nyZ;|\b\u001ci\u000b3\u0003@d %Vk\u0017:vl\t(J-=R ", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn9b\r Di\u0014=QMD5\u0018'$hn5\u0005r0X\u007f\u0015Q\\[*\\(g\u001ez\u000ec\r[5\u0011\u0004l\u000b\"xLB)\u0016,\u0013\u000fKq\u0010\u0010\u001e\u000e~X\u007f>e\u0010\u001d`\u0011~@6rJXrCEKMm4r\f)*lCI(\u001cqb\twL=\nQ:\r{Q\u0007qkF,D6.FxeTE9bL}6#S{Ao<`\u007f5\u0003-\u0011\n\u000eyK\u0001Tf%Hbw(uZK/1@J\u0013\tS_\u0005lK\u0012d&+\u0015\u0012m@8\u0019/RgS\u001a\u000e]zd4e]|FV\u0010G-x#6B\b@[O", ";`c2e0:Z`\f~i7\u0004\t)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class Ripple implements Indication {
    public static final int $stable = 0;
    private final boolean bounded;
    private final State<Color> color;
    private final float radius;

    public /* synthetic */ Ripple(boolean z2, float f2, State state, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2, f2, state);
    }

    /* JADX INFO: renamed from: rememberUpdatedRippleInstance-942rkJo */
    public abstract RippleIndicationInstance mo1752rememberUpdatedRippleInstance942rkJo(InteractionSource interactionSource, boolean z2, float f2, State<Color> state, State<RippleAlpha> state2, Composer composer, int i2);

    private Ripple(boolean z2, float f2, State<Color> state) {
        this.bounded = z2;
        this.radius = f2;
        this.color = state;
    }

    @Override // androidx.compose.foundation.Indication
    @Deprecated(message = "\u0016[\f:\u00044\"\\lO7~\u0010\u001e?\u000e`Q\u00199\nk\rf{J")
    @InterfaceC1492Gx
    public final IndicationInstance rememberUpdatedInstance(InteractionSource interactionSource, Composer composer, int i2) {
        long jMo1754defaultColorWaAFU9c;
        composer.startReplaceGroup(988743187);
        ComposerKt.sourceInformation(composer, "C(rememberUpdatedInstance)197@9514L7,198@9542L221,207@9856L13,207@9829L41,209@9895L155,217@10104L491,217@10060L535:Ripple.kt#vhb33q");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(988743187, i2, -1, "androidx.compose.material.ripple.Ripple.rememberUpdatedInstance (Ripple.kt:196)");
        }
        ProvidableCompositionLocal<RippleTheme> localRippleTheme = RippleThemeKt.getLocalRippleTheme();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localRippleTheme);
        ComposerKt.sourceInformationMarkerEnd(composer);
        RippleTheme rippleTheme = (RippleTheme) objConsume;
        if (this.color.getValue().m4188unboximpl() != Color.Companion.m4214getUnspecified0d7_KjU()) {
            composer.startReplaceGroup(-303571590);
            composer.endReplaceGroup();
            jMo1754defaultColorWaAFU9c = this.color.getValue().m4188unboximpl();
        } else {
            composer.startReplaceGroup(-303521246);
            ComposerKt.sourceInformation(composer, "203@9725L14");
            jMo1754defaultColorWaAFU9c = rippleTheme.mo1754defaultColorWaAFU9c(composer, 0);
            composer.endReplaceGroup();
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m4168boximpl(jMo1754defaultColorWaAFU9c), composer, 0);
        State<RippleAlpha> stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(rippleTheme.rippleAlpha(composer, 0), composer, 0);
        int i3 = (-1) - (((-1) - i2) | ((-1) - 14));
        int i4 = i2 << 12;
        RippleIndicationInstance rippleIndicationInstanceMo1752rememberUpdatedRippleInstance942rkJo = mo1752rememberUpdatedRippleInstance942rkJo(interactionSource, this.bounded, this.radius, stateRememberUpdatedState, stateRememberUpdatedState2, composer, (-1) - (((-1) - i3) & ((-1) - ((i4 + 458752) - (i4 | 458752)))));
        ComposerKt.sourceInformationMarkerStart(composer, -9776216, "CC(remember):Ripple.kt#9igjgp");
        int i5 = (((i3 ^ 6) > 4 && composer.changed(interactionSource)) || (i2 + 6) - (6 | i2) == 4) ? 1 : 0;
        boolean zChangedInstance = composer.changedInstance(rippleIndicationInstanceMo1752rememberUpdatedRippleInstance942rkJo);
        int i6 = ((zChangedInstance ? 1 : 0) + i5) - ((zChangedInstance ? 1 : 0) & i5);
        Ripple$rememberUpdatedInstance$1$1 ripple$rememberUpdatedInstance$1$1RememberedValue = composer.rememberedValue();
        if (i6 != 0 || ripple$rememberUpdatedInstance$1$1RememberedValue == Composer.Companion.getEmpty()) {
            ripple$rememberUpdatedInstance$1$1RememberedValue = new Ripple$rememberUpdatedInstance$1$1(interactionSource, rippleIndicationInstanceMo1752rememberUpdatedRippleInstance942rkJo, null);
            composer.updateRememberedValue(ripple$rememberUpdatedInstance$1$1RememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        EffectsKt.LaunchedEffect(rippleIndicationInstanceMo1752rememberUpdatedRippleInstance942rkJo, interactionSource, (Function2) ripple$rememberUpdatedInstance$1$1RememberedValue, composer, (i2 << 3) & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return rippleIndicationInstanceMo1752rememberUpdatedRippleInstance942rkJo;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ripple)) {
            return false;
        }
        Ripple ripple = (Ripple) obj;
        return this.bounded == ripple.bounded && Dp.m6643equalsimpl0(this.radius, ripple.radius) && Intrinsics.areEqual(this.color, ripple.color);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.bounded) * 31) + Dp.m6644hashCodeimpl(this.radius)) * 31) + this.color.hashCode();
    }
}
