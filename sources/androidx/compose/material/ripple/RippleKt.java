package androidx.compose.material.ripple;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.unit.Dp;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
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
/* JADX INFO: compiled from: Ripple.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯR\u001d̉=!4i\bDRh|İI\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjG9L͜P.hS2şs{J$cҕyCQU\"}8\tWNmhvJp\u000bKƤ\u000e\u0016\u000fj4I[xe\u0012%2JoU3UoC:x1D\u000682P:*\t\u000f\u001dBH>z+GY\u0011*0nvjV\u001bT\u001d\u001a@\u000en$\u000f'tg|@xvkEG)\u0013kRNUl^\tת\fϿù+\u000f|o,:XKC%=Y\u0013\tb[m\u0003m\u0003m\tv9?+w\u0007\u001e6p\u0016\")CU\u001d_\u0003&\u000b\u0005\u007fq<-9a{Mf\rV\u000bA{%j\u0012#\u001e'vD] l\b\u001c8\rr\u0002F\u0001\bdB\u000e\u0002y6E-0919)oiai0\u0015<\u009e\u0004ټ̷'\u0003t9im.r#Ñl}a3a@kH|\t0Ơoձtb\nÏʹ0L\b2\u0002\u009fJE$ۄ_S"}, d2 = {"\u0012dU.h3MB+~zg\u001a\b\t-", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fIm\u00167;N;i\n", "", "1qT.g,+W$\n\u0002^\u0014\u0007\b3f\u0004(\t)\u000b\u0016\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9l<}%7U\r\u001c4t\u0016\u0017WB;A", "7mc2e(<b\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005O=-\u0015u]7\u0016g6Wd1WYL,2", "0nd;W,=", "", "@`S6h:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "1n[<e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DX#8LS9kAs", "@h_=_,\u001aZ$\u0002v", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCvWIz0@`}i$q!9TC\u0017r?!\u0011>", "1qT.g,+W$\n\u0002^\u0014\u0007\b3f\u0004(\t)\u000b\u0016\u0017\u000f^l\u001ed1\u0015_", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn9b\r Di\u0014=QMD5\u0018'$hn5\u0005r0X\u007f\u0015Q\\[*\\(g\u001ez\u000ec\r[5\u0011\u0004l\u000b\"xLB)\u0016,\u0013\u0012?2\u0003\u0019\u0012\u00198nnP mQ\u0001\u001f\u0003,6rEi]yT\u0017,h4s\u0013c&&?K,]r)$f_2\u0014\u0005aZSb\u0003evK#\u0004\u0003y\u0002TWOD|_@s:hI\u0006\u007f\u001d<ftt\u00051M=45dN*g\u001f>`t$(YH'\u000f@;\u0013\u0015", "7mR<`0GU\u0007\u000evm,c\u0005Ce\r\u0004\u0005D\t\u0013&Ky\u0017*\u0002%3:\b-", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\")\u0015f7", "7mc2e(<b\u001d\t\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005O=-\u0015u]7\u0016g6WL", "=tc4b0GU\u0007\u000evm,c\u0005Ce\r\u0004\u0005D\t\u0013&Ky\u0017*\u0002%3:\b-", "@d\\2`)>`\u0006\u0003\u0006i3|", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\t>X\u0002\u001e3|\u001a8V\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "@d\\2`)>`\u0006\u0003\u0006i3|P\u0003Itzm@\u000b", "uY5\u0017?(GR&\t~]?F\u00079m\u000b2\n@J$'P~\u0012Dvn\u0013c\u0006+A{\u0016;#'\u001f/\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001csG$\u001bY\n]/\u0017\u000e#%-mH5\u001b\u00170S\u000b\u0011", ";`c2e0:Z`\f~i7\u0004\t)r\u007f/{<\u000f\u0017"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class RippleKt {
    private static final TweenSpec<Float> DefaultTweenSpec = new TweenSpec<>(15, 0, EasingKt.getLinearEasing(), 2, null);

    /* JADX INFO: renamed from: createRippleModifierNode-TDGSqEk */
    public static final DelegatableNode m1762createRippleModifierNodeTDGSqEk(InteractionSource interactionSource, boolean z2, float f2, ColorProducer colorProducer, Function0<RippleAlpha> function0) {
        return Ripple_androidKt.m1768createPlatformRippleNodeTDGSqEk(interactionSource, z2, f2, colorProducer, function0);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "5K\t:~v\u001aiJP8\u000b\\\u001akV]_H)\nm\u001a\u0012zK~|Sw%zmP$\u000f\re|xX#GO$d_9#f\bJqBsz\u001aK\u001dG\u001c\u000b=\u0011\u0001KxD,W\u0003\tb0\u001c|\\\u0019N\t\u0001B02g/Df[|\u000b45%S\u001d6\u007f/\u001e\rEWQ7(R?%\u000f\u001f+\u0001I[t\u000b\u001a*SB5o9iB&?es\u0018w+,LXkI/4\nN\u0006X\u00026R-={j|O\u001fp3\u001etw\u001ew\u0019<kS\"}uk`+]kV\u001eh<2.\u0005 \u001aTEMM&'\u000b5BR_\u001doguuvj/8=cD ne^\u000fm5g\u000f\u0014\u0013I\u0007I:kpF-ZOd\u001e{B\u007fE\u0018\u001c57\u007f!Y\\7O*[r#npeURu|\u000bbULvm6B.~7$\r\b\u0016;LR\u0006A\u0017ax$M?\rK(;\u0001 6$+&\u0015d\u0002\\\u001bM>ric8| >p\u0019\u000bkY-T9_>w'CDosv\u00100W\n|k[MQHEJ}b\u007f|KvxZ<TpII\r\nHW!_\u0010\r|]\u0010LA;T\u00127=}`)@\u001b-\u0014\u001c\u00149Iy,\u0004P6]JQ\u0018r\u0015C\u0017)KH\"],\u0004.C\u0004Er5=\u001b3\tW%|\u0001\u0001X\u001adl\u0017\u001c:<+\u000f\fS\tbn\u0017 \u0014>sdx)A\n$\u001f2d;3e8y6)h\u0004I=vkp8#\u0004\u0010}q\u0007RU[\u001db\u0017T\u007fBWA\u001d^X\u000f*\"ti\u001f\u001bz12u\u0006r\u000e,v\u0012NE5\u0005^@@QGZ4\u0014*[\u0007\u0001m\u001ce\u0007><])#UmQ\u0015kw\u0004\u001dbTn,")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: rememberRipple-9IZ8Weo */
    public static final Indication m1763rememberRipple9IZ8Weo(boolean z2, float f2, long j2, Composer composer, int i2, int i3) {
        ComposerKt.sourceInformationMarkerStart(composer, 1635163520, "C(rememberRipple)P(!1,2:c#ui.unit.Dp,1:c#ui.graphics.Color)147@7571L27,148@7610L85:Ripple.kt#vhb33q");
        int i4 = 1;
        if ((1 & i3) != 0) {
            z2 = true;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            f2 = Dp.Companion.m6658getUnspecifiedD9Ej5fM();
        }
        if ((i3 & 4) != 0) {
            j2 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1635163520, i2, -1, "androidx.compose.material.ripple.rememberRipple (Ripple.kt:146)");
        }
        int i5 = i2 >> 6;
        State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m4168boximpl(j2), composer, (i5 + 14) - (i5 | 14));
        ComposerKt.sourceInformationMarkerStart(composer, 487972074, "CC(remember):Ripple.kt#9igjgp");
        int i6 = ((((14 & i2) ^ 6) <= 4 || !composer.changed(z2)) && (6 & i2) != 4) ? 0 : 1;
        if (((((i2 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (112 | i2)) ^ 48) <= 32 || !composer.changed(f2)) && (-1) - (((-1) - i2) | ((-1) - 48)) != 32) {
            i4 = 0;
        }
        int i7 = (i6 + i4) - (i6 & i4);
        Object objRememberedValue = composer.rememberedValue();
        if (i7 != 0 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new PlatformRipple(z2, f2, stateRememberUpdatedState, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        PlatformRipple platformRipple = (PlatformRipple) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return platformRipple;
    }

    public static final AnimationSpec<Float> incomingStateLayerAnimationSpecFor(Interaction interaction) {
        if (interaction instanceof HoverInteraction.Enter) {
            return DefaultTweenSpec;
        }
        if (!(interaction instanceof FocusInteraction.Focus) && !(interaction instanceof DragInteraction.Start)) {
            return DefaultTweenSpec;
        }
        return new TweenSpec(45, 0, EasingKt.getLinearEasing(), 2, null);
    }

    public static final AnimationSpec<Float> outgoingStateLayerAnimationSpecFor(Interaction interaction) {
        if (!(interaction instanceof HoverInteraction.Enter) && !(interaction instanceof FocusInteraction.Focus)) {
            return interaction instanceof DragInteraction.Start ? new TweenSpec(150, 0, EasingKt.getLinearEasing(), 2, null) : DefaultTweenSpec;
        }
        return DefaultTweenSpec;
    }
}
