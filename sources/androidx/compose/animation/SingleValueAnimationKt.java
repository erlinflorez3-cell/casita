package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: SingleValueAnimation.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я<\u001d̉=!4i\bDZc|İI\u0006F\u000b6B\u0015\"4\u0012}\tnjO0LeN.ZS@\u000fsڔ<$q$yCIU\"}(\nWNusvJ`\f[1\u0014\u0017\u0011v<Kex\f\u0012\u001f4Rom6{qm=nxN\u0005N2ƫ7цڱ\u0005\u001c0M\u001e|\u0013\nY\u0013*6PrJR;M3\"B\nL)\u0019\u001e\u000bg~BNlkDG)\u0013kRNU_^\b}!LT5\u0019\u000fo.-P7c\u00155U\u0013\u0007\u0001iU\u0002m~\u0004\nڋ&ݐȅMu]Ef\u0010,e9V%c\u0003(l\u0005\u007f`:/[SqTh\u000eVw+\b\u0013<\u0012\u0018\u001e-X0=\u001a\u0015\b<>%xY@^\u0013vB.\r\u0012J\u001d%\u000e?CG+haai\u0019^9\f\u0005;,9\u007f\u001d.\"Yَ_ٽôXyWD_T]Z\\ˣqC}\u0006\u0001b0*2/\u001eČ1ɨ\u0015.\u001f¦ڞ[>+$qɗdrfС\tu"}, d2 = {"1n[<e\u000b>T\u0015\u000f\u0002m\u001a\b\u00163n\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000eBz\u001a7O1Fk2s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "\u000fmX:T;:P ~", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\?8r4s", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkFUB\u0002", "7mXA\\(ED\u0015\u0006\u000b^", "\u000fmX:T;:P ~B1&OT6l[", "uI\u0018\u0019T5=`#\u0003yquz\u00137p\n6{\n| \u001bOk\u001d@\u0001.~W\b-77q7QK7z0\u001b\u001ch7", "/mX:T;>1#\u0006\u0005k\b\u000bv>a\u000f(", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", "B`a4X;/O \u000fz", "/mX:T;B]\"l\u0006^*", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\")\u0015f7", "4h]6f/>R\u007f\u0003\tm,\u0006\t<", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "/mX:T;>1#\u0006\u0005k\b\u000bv>a\u000f(C&o)*);\u0002", "uI;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001I\u001f2U?Jo>'\u0003sa7\\J2X\u0006.KU\u00181mZ<>$\u001bX\u001dR5\u0016\u0013#\"4wBF#\u00125\u0015W\"d\n\u000b#\u00189i\u0004\fT\u001aO\u0005\u001f\u0004AruVbn}OA\u000f@4l\u0017i+\\G\u0010\bw5\u007f\u0017qO;\u0014\u007fR$<P\u0004orQ'z\u00021NvjJMo\u001f*\u0004#.KQ", ":`Q2_", "", "/mX:T;>1#\u0006\u0005k\b\u000bv>a\u000f(C@\u0011}jRk\f", "uI;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001I\u001f2U?Jo>'\u0003sa7\\J1J\b#\u0011SJ5^\u001c`L!\u0016c\u0010$\u0012\u0013\u000fhH(w\u000e<0\u0010uJ\u0012Df\u0010\u0010 \u0017C4QR_\u000eV}\u001f~\r~OBb^\u0007QEDusb\u0016g(fH:m!\u0002\"*lX.SY]\u0019}\\\bgt\u001d|^{\u000b:vZSOsTO>%)S\u0007\u0002 2\"\u0002;}<\b<*\u007fR\u0014Gv\u0018\u0014", "/mX:T;B]\"x\b^3|\u0005=e"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SingleValueAnimationKt {
    private static final SpringSpec<Color> colorDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);

    /* JADX INFO: renamed from: animateColorAsState-euL9pac */
    public static final State<Color> m451animateColorAsStateeuL9pac(long j2, AnimationSpec<Color> animationSpec, String str, Function1<? super Color, Unit> function1, Composer composer, int i2, int i3) {
        Function1<? super Color, Unit> function12 = function1;
        String str2 = str;
        SpringSpec<Color> springSpec = animationSpec;
        ComposerKt.sourceInformationMarkerStart(composer, -451899108, "C(animateColorAsState)P(3:c#ui.graphics.Color!1,2)62@2847L96,65@2955L124:SingleValueAnimation.kt#xbi5r1");
        if ((i3 & 2) != 0) {
            springSpec = colorDefaultSpring;
        }
        if ((i3 & 4) != 0) {
            str2 = "ColorAnimation";
        }
        if ((i3 + 8) - (i3 | 8) != 0) {
            function12 = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-451899108, i2, -1, "androidx.compose.animation.animateColorAsState (SingleValueAnimation.kt:61)");
        }
        ColorSpace colorSpaceM4182getColorSpaceimpl = Color.m4182getColorSpaceimpl(j2);
        ComposerKt.sourceInformationMarkerStart(composer, -1018619694, "CC(remember):SingleValueAnimation.kt#9igjgp");
        boolean zChanged = composer.changed(colorSpaceM4182getColorSpaceimpl);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(Color.m4182getColorSpaceimpl(j2));
            composer.updateRememberedValue(objRememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        int i4 = i2 << 6;
        State<Color> stateAnimateValueAsState = AnimateAsStateKt.animateValueAsState(Color.m4168boximpl(j2), (TwoWayConverter) objRememberedValue, springSpec, null, str2, function12, composer, ((-1) - (((-1) - (((-1) - (((-1) - i2) | ((-1) - 14))) | ((-1) - (((-1) - (i2 << 3)) | ((-1) - 896))))) & ((-1) - ((-1) - (((-1) - 57344) | ((-1) - i4)))))) | (i4 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stateAnimateValueAsState;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "$T\u0005Br\t\u001a!9Z\u001b\u000fQ)1\u000e=<q:Dv\u001bi6No\u0001S4%&vQ{\u0002Y]j>R]C;$WY~6]ZzfB8\u0017\u0010\u0015")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: animateColorAsState-KTwxG1Y */
    public static final /* synthetic */ State m450animateColorAsStateKTwxG1Y(long j2, AnimationSpec animationSpec, Function1 function1, Composer composer, int i2, int i3) {
        Function1 function12 = function1;
        SpringSpec<Color> springSpec = animationSpec;
        ComposerKt.sourceInformationMarkerStart(composer, -1942442407, "C(animateColorAsState)P(2:c#ui.graphics.Color)80@3400L98:SingleValueAnimation.kt#xbi5r1");
        if ((i3 & 2) != 0) {
            springSpec = colorDefaultSpring;
        }
        if ((i3 & 4) != 0) {
            function12 = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1942442407, i2, -1, "androidx.compose.animation.animateColorAsState (SingleValueAnimation.kt:79)");
        }
        int i4 = i2 & 126;
        int i5 = (-1) - (((-1) - (i2 << 3)) | ((-1) - 7168));
        State<Color> stateM451animateColorAsStateeuL9pac = m451animateColorAsStateeuL9pac(j2, springSpec, null, function12, composer, (i4 + i5) - (i4 & i5), 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stateM451animateColorAsStateeuL9pac;
    }

    /* JADX INFO: renamed from: Animatable-8_81llA */
    public static final Animatable<Color, AnimationVector4D> m449Animatable8_81llA(long j2) {
        return new Animatable<>(Color.m4168boximpl(j2), ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(Color.m4182getColorSpaceimpl(j2)), null, null, 12, null);
    }
}
