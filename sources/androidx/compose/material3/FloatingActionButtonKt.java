package androidx.compose.material3;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.tokens.ExtendedFabPrimaryTokens;
import androidx.compose.material3.tokens.FabPrimaryLargeTokens;
import androidx.compose.material3.tokens.FabPrimarySmallTokens;
import androidx.compose.material3.tokens.FabPrimaryTokens;
import androidx.compose.material3.tokens.MotionTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: FloatingActionButton.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яb\u001d̉=!4i\bӵLc\u000b\u0004I\u00066\u000b6B\u0015\"4\u0012}\tnjG0L͜P.hS2şs{J$cҕyCQU\"Ԃ*\teNogtJb\u000bY\u000f\u000eǝ\u0001jBI]ތe\u0012%2JoU3UoS9htL\u0005(2(;\u0002\u0005\u000f#2H\u0016~\u0013>Y\u0014*0nyj\\\u001bW\u001d \"\bN /'\u000br~<NlkFG#1vrT-_>\u000be\rtcW\u0013|a,;X7c&UY\t\u0007`mW\u0003m\u0003m\u000bn'5>as\u0006J\t\b\u001a\u00159d%_\t%\u000b\u001b\u0002z\u001a>CesM`\u000eV\u0011\u000b}\u001d<2\u00174?ρ2- \u0001ڿ\u00123z\u000e\u001aE҉\u0001މ۰\u0004|gR%B\u0018Ġ*G#~Q\u0010DI]E\u001a\u001d\u0018.%\u0011nOd\u0003\u0019\u05ce\u0019\u001bZ\u0012\u0002@__US^\fi=\u001c\r\u001fm͆.\u00046a09\n\u001bF\u001d59k9Q*\u001a\rxJmv\u0013l\u0001S\u0018_xF(n$WB\t:{tj\u000bk^bp,?\\LZ\r}\u0016#8\\&MQ+\u0016N]z\u0002j{n:+5fEl\u0007k<kif95_x(chuBU\u0003gܬW٨͞W\u000e`~6EJ8x4\u0010{rW<\u001d@I\n\"D.A\u0019\u000b\u001ev\u000eNHG|\u0017krh>\f\u00059*\u0003w2\r\t/_\rvug\u0007YD|\u000f3]GW5'8m\"\u0017E-)\r~\u0002\u0013_gz[|t\u001cuc\u00118\u001808\u007fEm\"\u001d\u0016A=\u0012/UL!n\u007fXɟ+z\u0003\u0014U@ŕ-ԖŰnr2\u0006xpgD%I\u000f^!,8n\u000e\u0004yL\u000bIsT9dlT#\t_<\\D\u0015\u0005M+U\u0007u\"\u000bCECU,F}\u001a/#qui\u001e?*h\u0015&\u0003w\u001c,\u0012' hW]@NPI\b\u0013n**l\u0011W`l\u000e\u0007p\u001fd\u001cA_Yo\u0001XHM98,q¡0\rvp\"?ޝnϘӑ2a0\u001cQ$,NQN)M\u0002p\u001ewYf#P\u001f\f\u001b{_w@'m&\\Wp\u0015H\u0006\"%fGAb\u0013J!$b;l\u000e\u0011Cby\u001e\u0010)\u0011ve\u0015\u0017@T\f;\u0005\u001f\u0005~bVV\u0018xE\u000f5Z\t\u0005\u000fA3\u00117G\u0004\u001c\\\u0005>qI\u0019^-\u000b+j}\b\u00150ŠHT?5n]ݗ\nԵزGK\b`\u0012mIyyƑ$8F{s°\u001aê=Q\u0019٣\u0017>l\u000bmd|eMԦhŽR$1~\t~.H\u0018\u0012#\u0019}vF۱/ٮRw?Ƒ:\u000f%IA\u0007:}:˭\u001dұ\n75=Wl45\n]k;,\tvì)ؗx#dW\u001ch*k)A.qDcXƄ\u0015ц$\u00066J\u0003t˙.\r>R\bב\u001eA]̸o#"}, d2 = {"\u0013wc2a+>Ryzw<6\u0004\u0010+p\u000e(WI\u0005\u001f\u0013Vs\u0018E", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006V89hl-3v$2\\GEt\n", "\u0013wc2a+>Ryzw>5{l-o\t\u0013w?\u007f\u001b I", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "\u0014", "\u0013wc2a+>Ryzw>?\b\u00058d[1\u007fH|&\u001bQx", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006V.DY\u000b\u000fDi\u001f<QR?u=s", "\u0013wc2a+>RyzwF0\u0006\r7u\b\u001a\u007f?\u0010\u001a", "\u0013wc2a+>RyzwL;x\u0016>I}2\u0005+|\u0016\u0016Kx\u0010", "\u0013wc2a+>RyzwM,\u0010\u0018\u001aa~'\u007fI\u0003", "\u0013wc2a+>Ry\u0006\u0005Z;\u0001\u00121A}7\u007fJ\ns'V~\u0018E", "", "=m29\\*D", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "AgP=X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y+7C", "1n]AT0GS&\\\u0005e6\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "1n]AX5M1#\u0006\u0005k", "3kTCT;B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006W,?U\r$@oq,\\GEt\u0011.$wkBfj,_r6KVW\u0002", "7mc2e(<b\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005SD-\u0011eh9jl;N\u0004#E[R6e@|M!\u0010Zc", "1n]AX5M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u00038_19u?\u001ej", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "\u0013wc2a+>Ry\u0006\u0005Z;\u0001\u00121A}7\u007fJ\ns'V~\u0018E>\u0018|nN~;I", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu^zp/VM0]VrJixV\u0017M8\u0017\tXTmlN?*\u0012:IKKlJ\u000e#\n@mt@dY5|\u0011\u0001A~M+@[\u0003FNOf)wU]'dED2\u0014;!\u0017wP;\u000ewZ^<3\u0001qcV\u001d\u0004:\u007f<|_PNLeK\u00041(+\u0003w#.gx5}\u0003j035q\u000fOf+\b\\\u0003\u001d7fO'o7F#HJ_\u0005pH\u00172#j\u0017\u000eo1/(iol\u0012v\u0017l\u0013X<aC\nFR\u0013:G~\u00191OlLk\u0007\u0013\t\\\u000bsoXJ\u001f]J\u001f\u0002Lk`!\f\u0001u\u001c&7$\u0007:\u001fq(n;W\u001cV>\u001f\b\u0005XP\u001ftG#7I|cby26B\u001eY*BODv\u001c!y\u0018!>\u000f\u000b\frWM\u0006j", "BdgA", "7b^;", "3w_.a+>R", "", "\u0013wc2a+>Ry\u0006\u0005Z;\u0001\u00121A}7\u007fJ\ns'V~\u0018E>\u0005<=Mg\ts", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&S\u0007=w%5QL\u0005pE&^iqB\u0005r0X\u007f5\u0011-^5ZavG\u001d^0tT5\u001c\f]JmsU?h\t<R\u007fJl\u000b\u0015$W\u0016zy@e\u0014Q\u0003_K(%qEfi}FT\u000f`4l\u0017i+\\\u0004J(]Y#\u001alQ2\n\t)\u0006YN\u0003ftQ\u001dyKm<wcQO}U\u0006\u0005+hM\ts\u001d5\\r9>\u001b\u0007056:i0N\u0014G]\u0006\u001f0[Tp$@D\u001eIYc?t:\u001dh,e\u0004\u00150~\u0012 oarL\u0018\t9\u0015j9kh]Ga\u0015HRO\u001c'WzQ_\u0004\u001e^m vdVM\u001fS\u0014cnN*j\u001b\u0011\u00030\u0019&>\u001f<U\u001el4h\u0001Q\u001c\u0018hE\byhG\u001fy\u0012w}ZnX^o\b?\b\u0011V\u001d1Z@\u0001[1y #2\u0001`e\u0019|hO\u0004:\u00128n;c@mj=\u000b1`2\"v<$\u001fv\u000f\fZKxlw4jaq,m", "\u0014k^.g0GUt|\nb6\u0006e?t\u000f2\u0005", "\u0014k^.g0GUt|\nb6\u0006e?t\u000f2\u0005\bs^,\u0018N\u0012\u0018", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu^zp/VM0]VrJixV\u0017M8\u0017\tXTmlN?*\u0012:IKKlJ\u000e#\n@mt@dY5|\u0011\u0001A~M+@[\u0003FNOf)wU]'dED2\u0014;!\u0017wP;\u000ewZ^<3\u0001qcV\u001d\u0004:\u007f<|_PNLeK\u00041(+\u0003w#.gx5}\u0003j035q\u000fOf+\b\\\u0003\u001d7fO'o7F#HJ_\u0005pH\u00172#j\u0017\u000eo1/(iol\u0012v\u0017l\u0013X<aC\nFR\u0013:G~\u00191OlLk\u0007\u0013\t\\\u000bsoXJ\u001f]J\u001f\u0002Lk`!\f\u0001u\u001c&7$\u0007:\u001fq(n;W\u001cU>\u001f\b\u0005XP\u001ftG#7I|cby26B\u001eY*BODv\u001c!y\u0018!>\u000f\u000b\frWM\u0006j", "\u001a`a4X\rE]\u0015\u000e~g.X\u0007>i\n1XP\u0010&!P", "\u001a`a4X\rE]\u0015\u000e~g.X\u0007>i\n1XP\u0010&!P7\u0001\u0004\fu\u0014]Y", "!lP9_\rE]\u0015\u000e~g.X\u0007>i\n1XP\u0010&!P", "!lP9_\rE]\u0015\u000e~g.X\u0007>i\n1XP\u0010&!P7\u0001\u0004\fu\u0014]Y", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class FloatingActionButtonKt {
    private static final float ExtendedFabStartIconPadding = Dp.m6638constructorimpl(16);
    private static final float ExtendedFabEndIconPadding = Dp.m6638constructorimpl(12);
    private static final float ExtendedFabTextPadding = Dp.m6638constructorimpl(20);
    private static final float ExtendedFabMinimumWidth = Dp.m6638constructorimpl(80);
    private static final ExitTransition ExtendedFabCollapseAnimation = EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(100, 0, MotionTokens.INSTANCE.getEasingLinearCubicBezier(), 2, null), 0.0f, 2, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(AnimationSpecKt.tween$default(500, 0, MotionTokens.INSTANCE.getEasingEmphasizedCubicBezier(), 2, null), Alignment.Companion.getStart(), false, null, 12, null));
    private static final EnterTransition ExtendedFabExpandAnimation = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween(200, 100, MotionTokens.INSTANCE.getEasingLinearCubicBezier()), 0.0f, 2, null).plus(EnterExitTransitionKt.expandHorizontally$default(AnimationSpecKt.tween$default(500, 0, MotionTokens.INSTANCE.getEasingEmphasizedCubicBezier(), 2, null), Alignment.Companion.getStart(), false, null, 12, null));

    /* JADX INFO: renamed from: FloatingActionButton-X-z6DiA, reason: not valid java name */
    public static final void m2143FloatingActionButtonXz6DiA(final Function0<Unit> function0, Modifier modifier, Shape shape, long j2, long j3, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource;
        final long jM1947contentColorForek8zF_U = j3;
        FloatingActionButtonElevation floatingActionButtonElevationM2135elevationxZ9QkE = floatingActionButtonElevation;
        long containerColor = j2;
        Shape shape2 = shape;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-731723913);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(FloatingActionButton)P(6,5,7,0:c#ui.graphics.Color,2:c#ui.graphics.Color,3,4)100@4948L5,101@5012L14,102@5054L31,103@5163L11,116@5678L54,118@5792L536,109@5399L929:FloatingActionButton.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = (i2 + 6) - (i2 & 6);
        } else if ((i2 + 6) - (i2 | 6) == 0) {
            i4 = (-1) - (((-1) - (composerStartRestartGroup.changedInstance(function0) ? 4 : 2)) & ((-1) - i2));
        } else {
            i4 = i2;
        }
        int i6 = (-1) - (((-1) - i3) | ((-1) - 2));
        if (i6 != 0) {
            i4 |= 48;
        } else if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            i4 |= composerStartRestartGroup.changed(companion) ? 32 : 16;
        }
        if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            int i7 = ((i3 & 4) == 0 && composerStartRestartGroup.changed(shape2)) ? 256 : 128;
            i4 = (i4 + i7) - (i4 & i7);
        }
        if ((i2 & 3072) == 0) {
            i4 |= ((i3 & 8) == 0 && composerStartRestartGroup.changed(containerColor)) ? 2048 : 1024;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 24576)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (((-1) - (((-1) - i3) | ((-1) - 16)) == 0 && composerStartRestartGroup.changed(jM1947contentColorForek8zF_U)) ? 16384 : 8192)));
        }
        if ((196608 & i2) == 0) {
            int i8 = ((i3 & 32) == 0 && composerStartRestartGroup.changed(floatingActionButtonElevationM2135elevationxZ9QkE)) ? 131072 : 65536;
            i4 = (i4 + i8) - (i4 & i8);
        }
        int i9 = i3 & 64;
        if (i9 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 1572864));
        } else if ((i2 + 1572864) - (i2 | 1572864) == 0) {
            i4 |= composerStartRestartGroup.changed(mutableInteractionSource3) ? 1048576 : 524288;
        }
        if ((i3 & 128) != 0) {
            i4 |= 12582912;
        } else if ((i2 + 12582912) - (i2 | 12582912) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
        }
        if ((-1) - (((-1) - 4793491) | ((-1) - i4)) == 4793490 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((-1) - (((-1) - i2) | ((-1) - 1)) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i6 != 0) {
                    companion = Modifier.Companion;
                }
                if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
                    shape2 = FloatingActionButtonDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-897)));
                }
                if ((i3 & 8) != 0) {
                    containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-7169)));
                }
                if ((i3 & 16) != 0) {
                    jM1947contentColorForek8zF_U = ColorSchemeKt.m1947contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i4 >> 9) & 14);
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-57345)));
                }
                if ((i3 & 32) != 0) {
                    floatingActionButtonElevationM2135elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m2135elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                    i5 = (i4 - 458753) - (i4 | (-458753));
                } else {
                    i5 = i4;
                }
                if (i9 != 0) {
                    mutableInteractionSource3 = null;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 & 4) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-897)));
                }
                if ((i3 + 8) - (i3 | 8) != 0) {
                    i4 &= -7169;
                }
                if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-57345)));
                }
                if ((i3 & 32) != 0) {
                    i4 = (i4 - 458753) - (i4 | (-458753));
                }
                i5 = i4;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-731723913, i5, -1, "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:106)");
            }
            composerStartRestartGroup.startReplaceGroup(519755085);
            ComposerKt.sourceInformation(composerStartRestartGroup, "108@5355L39");
            if (mutableInteractionSource3 == null) {
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 519755736, "CC(remember):FloatingActionButton.kt#9igjgp");
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            } else {
                mutableInteractionSource2 = mutableInteractionSource3;
            }
            composerStartRestartGroup.endReplaceGroup();
            int i10 = (i5 + 14) - (14 | i5);
            int i11 = i5 << 3;
            int i12 = 7168 & i11;
            SurfaceKt.m2564Surfaceo_FOJdg(function0, SemanticsModifierKt.semantics$default(companion, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    SemanticsPropertiesKt.m5952setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m5933getButtono7Vup1c());
                }
            }, 1, null), false, shape2, containerColor, jM1947contentColorForek8zF_U, floatingActionButtonElevationM2135elevationxZ9QkE.m2138tonalElevationD9Ej5fM$material3_release(), floatingActionButtonElevationM2135elevationxZ9QkE.shadowElevation$material3_release(mutableInteractionSource2, composerStartRestartGroup, (-1) - (((-1) - (i5 >> 12)) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION))).getValue().m6652unboximpl(), null, mutableInteractionSource2, ComposableLambdaKt.rememberComposableLambda(1249316354, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$2
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

                public final void invoke(Composer composer2, int i13) {
                    ComposerKt.sourceInformation(composer2, "C121@5936L5,122@5952L370,119@5802L520:FloatingActionButton.kt#uh7d8r");
                    if ((i13 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1249316354, i13, -1, "androidx.compose.material3.FloatingActionButton.<anonymous> (FloatingActionButton.kt:119)");
                        }
                        long j4 = jM1947contentColorForek8zF_U;
                        TextStyle value = TypographyKt.getValue(ExtendedFabPrimaryTokens.INSTANCE.getLabelTextFont(), composer2, 6);
                        final Function2<Composer, Integer, Unit> function22 = function2;
                        ProvideContentColorTextStyleKt.m2921ProvideContentColorTextStyle3JVO9M(j4, value, ComposableLambdaKt.rememberComposableLambda(-1771489750, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i14) {
                                ComposerKt.sourceInformation(composer3, "C123@5966L346:FloatingActionButton.kt#uh7d8r");
                                if ((-1) - (((-1) - i14) | ((-1) - 3)) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1771489750, i14, -1, "androidx.compose.material3.FloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:123)");
                                    }
                                    Modifier modifierM1047defaultMinSizeVpY3zN4 = SizeKt.m1047defaultMinSizeVpY3zN4(Modifier.Companion, FabPrimaryTokens.INSTANCE.m3231getContainerWidthD9Ej5fM(), FabPrimaryTokens.INSTANCE.m3230getContainerHeightD9Ej5fM());
                                    Alignment center = Alignment.Companion.getCenter();
                                    Function2<Composer, Integer, Unit> function23 = function22;
                                    ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierM1047defaultMinSizeVpY3zN4);
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM3671constructorimpl = Updater.m3671constructorimpl(composer3);
                                    Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                                    Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                                    if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(composer3, -1494899604, "C131@6289L9:FloatingActionButton.kt#uh7d8r");
                                    function23.invoke(composer3, 0);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }, composer2, 54), composer2, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i10 + i12) - (i10 & i12)) | ((-1) - (((-1) - 57344) | ((-1) - i11))) | ((-1) - (((-1) - i11) | ((-1) - 458752))), 6, 260);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            final Shape shape3 = shape2;
            final long j4 = containerColor;
            final long j5 = jM1947contentColorForek8zF_U;
            final FloatingActionButtonElevation floatingActionButtonElevation2 = floatingActionButtonElevationM2135elevationxZ9QkE;
            final MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$3
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

                public final void invoke(Composer composer2, int i13) {
                    FloatingActionButtonKt.m2143FloatingActionButtonXz6DiA(function0, modifier2, shape3, j4, j5, floatingActionButtonElevation2, mutableInteractionSource4, function2, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i2) & ((-1) - 1))), i3);
                }
            });
        }
    }

    /* JADX INFO: renamed from: SmallFloatingActionButton-X-z6DiA, reason: not valid java name */
    public static final void m2145SmallFloatingActionButtonXz6DiA(final Function0<Unit> function0, Modifier modifier, Shape shape, long j2, long j3, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        FloatingActionButtonElevation floatingActionButtonElevationM2135elevationxZ9QkE = floatingActionButtonElevation;
        long containerColor = j2;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        Shape smallShape = shape;
        long jM1947contentColorForek8zF_U = j3;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(1444748300);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SmallFloatingActionButton)P(6,5,7,0:c#ui.graphics.Color,2:c#ui.graphics.Color,3,4)170@8224L10,171@8293L14,172@8335L31,173@8444L11,177@8559L455:FloatingActionButton.kt#uh7d8r");
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            i4 = i2 | 6;
        } else if ((i2 + 6) - (i2 | 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i6 = (i3 + 2) - (i3 | 2);
        if (i6 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 48));
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(companion) ? 32 : 16;
        }
        if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (((i3 & 4) == 0 && composerStartRestartGroup.changed(smallShape)) ? 256 : 128)));
        }
        if ((i2 & 3072) == 0) {
            i4 |= ((-1) - (((-1) - i3) | ((-1) - 8)) == 0 && composerStartRestartGroup.changed(containerColor)) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= ((-1) - (((-1) - i3) | ((-1) - 16)) == 0 && composerStartRestartGroup.changed(jM1947contentColorForek8zF_U)) ? 16384 : 8192;
        }
        if ((-1) - (((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) | ((-1) - i2)) == 0) {
            i4 |= ((-1) - (((-1) - i3) | ((-1) - 32)) == 0 && composerStartRestartGroup.changed(floatingActionButtonElevationM2135elevationxZ9QkE)) ? 131072 : 65536;
        }
        int i7 = (i3 + 64) - (i3 | 64);
        if (i7 != 0) {
            i4 = (i4 + 1572864) - (i4 & 1572864);
        } else if ((1572864 + i2) - (1572864 | i2) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(mutableInteractionSource2) ? 1048576 : 524288)));
        }
        if ((i3 + 128) - (i3 | 128) != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 12582912));
        } else if ((i2 + 12582912) - (i2 | 12582912) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
        }
        if ((i4 + 4793491) - (i4 | 4793491) != 4793490 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i2 + 1) - (i2 | 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i6 != 0) {
                    companion = Modifier.Companion;
                }
                if ((i3 + 4) - (i3 | 4) != 0) {
                    smallShape = FloatingActionButtonDefaults.INSTANCE.getSmallShape(composerStartRestartGroup, 6);
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-897)));
                }
                if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
                    containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    i4 = (i4 - 7169) - (i4 | (-7169));
                }
                if ((i3 + 16) - (i3 | 16) != 0) {
                    int i8 = i4 >> 9;
                    jM1947contentColorForek8zF_U = ColorSchemeKt.m1947contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i8 + 14) - (i8 | 14));
                    i5 = (i4 - 57345) - (i4 | (-57345));
                } else {
                    i5 = i4;
                }
                if ((i3 & 32) != 0) {
                    floatingActionButtonElevationM2135elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m2135elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-458753)));
                }
                if (i7 != 0) {
                    mutableInteractionSource2 = null;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
                    i4 = (i4 - 897) - (i4 | (-897));
                }
                if ((i3 & 8) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-7169)));
                }
                if ((i3 & 16) != 0) {
                    i4 &= -57345;
                }
                if ((i3 & 32) != 0) {
                    i4 = (i4 - 458753) - (i4 | (-458753));
                }
                i5 = i4;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1444748300, i5, -1, "androidx.compose.material3.SmallFloatingActionButton (FloatingActionButton.kt:176)");
            }
            Shape shape2 = smallShape;
            m2143FloatingActionButtonXz6DiA(function0, SizeKt.m1067sizeInqDBjuR0$default(companion, FabPrimarySmallTokens.INSTANCE.m3220getContainerWidthD9Ej5fM(), FabPrimarySmallTokens.INSTANCE.m3219getContainerHeightD9Ej5fM(), 0.0f, 0.0f, 12, null), shape2, containerColor, jM1947contentColorForek8zF_U, floatingActionButtonElevationM2135elevationxZ9QkE, mutableInteractionSource2, function2, composerStartRestartGroup, (i5 + 33554318) - (i5 | 33554318), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            final Shape shape3 = smallShape;
            final long j4 = containerColor;
            final long j5 = jM1947contentColorForek8zF_U;
            final FloatingActionButtonElevation floatingActionButtonElevation2 = floatingActionButtonElevationM2135elevationxZ9QkE;
            final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.FloatingActionButtonKt$SmallFloatingActionButton$1
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

                public final void invoke(Composer composer2, int i9) {
                    Function0<Unit> function02 = function0;
                    Modifier modifier3 = modifier2;
                    Shape shape4 = shape3;
                    long j6 = j4;
                    long j7 = j5;
                    FloatingActionButtonElevation floatingActionButtonElevation3 = floatingActionButtonElevation2;
                    MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
                    Function2<Composer, Integer, Unit> function22 = function2;
                    int i10 = i2;
                    FloatingActionButtonKt.m2145SmallFloatingActionButtonXz6DiA(function02, modifier3, shape4, j6, j7, floatingActionButtonElevation3, mutableInteractionSource4, function22, composer2, RecomposeScopeImplKt.updateChangedFlags((i10 + 1) - (i10 & 1)), i3);
                }
            });
        }
    }

    /* JADX INFO: renamed from: LargeFloatingActionButton-X-z6DiA, reason: not valid java name */
    public static final void m2144LargeFloatingActionButtonXz6DiA(final Function0<Unit> function0, Modifier modifier, Shape shape, long j2, long j3, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i2, final int i3) {
        int i4;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        Shape largeShape = shape;
        FloatingActionButtonElevation floatingActionButtonElevationM2135elevationxZ9QkE = floatingActionButtonElevation;
        long jM1947contentColorForek8zF_U = j3;
        long containerColor = j2;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1650866856);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(LargeFloatingActionButton)P(6,5,7,0:c#ui.graphics.Color,2:c#ui.graphics.Color,3,4)226@10910L10,227@10979L14,228@11021L31,229@11130L11,233@11245L455:FloatingActionButton.kt#uh7d8r");
        if ((i3 + 1) - (i3 | 1) != 0) {
            i4 = (-1) - (((-1) - i2) & ((-1) - 6));
        } else if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            i4 = (-1) - (((-1) - (composerStartRestartGroup.changedInstance(function0) ? 4 : 2)) & ((-1) - i2));
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 48));
        } else if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            i4 |= composerStartRestartGroup.changed(companion) ? 32 : 16;
        }
        if ((i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i2 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            int i6 = ((i3 & 4) == 0 && composerStartRestartGroup.changed(largeShape)) ? 256 : 128;
            i4 = (i4 + i6) - (i4 & i6);
        }
        if ((i2 & 3072) == 0) {
            i4 |= ((i3 & 8) == 0 && composerStartRestartGroup.changed(containerColor)) ? 2048 : 1024;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 24576)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (((i3 & 16) == 0 && composerStartRestartGroup.changed(jM1947contentColorForek8zF_U)) ? 16384 : 8192)));
        }
        if ((ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE + i2) - (196608 | i2) == 0) {
            int i7 = ((i3 & 32) == 0 && composerStartRestartGroup.changed(floatingActionButtonElevationM2135elevationxZ9QkE)) ? 131072 : 65536;
            i4 = (i4 + i7) - (i4 & i7);
        }
        int i8 = (-1) - (((-1) - i3) | ((-1) - 64));
        if (i8 != 0) {
            i4 = (i4 + 1572864) - (i4 & 1572864);
        } else if ((-1) - (((-1) - 1572864) | ((-1) - i2)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(mutableInteractionSource2) ? 1048576 : 524288)));
        }
        if ((i3 + 128) - (i3 | 128) != 0) {
            i4 |= 12582912;
        } else if ((i2 & 12582912) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
        }
        if ((i4 + 4793491) - (4793491 | i4) != 4793490 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    companion = Modifier.Companion;
                }
                if ((i3 & 4) != 0) {
                    largeShape = FloatingActionButtonDefaults.INSTANCE.getLargeShape(composerStartRestartGroup, 6);
                    i4 &= -897;
                }
                if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
                    containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-7169)));
                }
                if ((i3 + 16) - (i3 | 16) != 0) {
                    jM1947contentColorForek8zF_U = ColorSchemeKt.m1947contentColorForek8zF_U(containerColor, composerStartRestartGroup, (-1) - (((-1) - (i4 >> 9)) | ((-1) - 14)));
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-57345)));
                }
                if ((i3 + 32) - (i3 | 32) != 0) {
                    floatingActionButtonElevationM2135elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m2135elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-458753)));
                }
                if (i8 != 0) {
                    mutableInteractionSource2 = null;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 & 4) != 0) {
                    i4 = (i4 - 897) - (i4 | (-897));
                }
                if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
                    i4 &= -7169;
                }
                if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
                    i4 = (i4 - 57345) - (i4 | (-57345));
                }
                if ((i3 + 32) - (i3 | 32) != 0) {
                    i4 &= -458753;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1650866856, i4, -1, "androidx.compose.material3.LargeFloatingActionButton (FloatingActionButton.kt:232)");
            }
            m2143FloatingActionButtonXz6DiA(function0, SizeKt.m1067sizeInqDBjuR0$default(companion, FabPrimaryLargeTokens.INSTANCE.m3209getContainerWidthD9Ej5fM(), FabPrimaryLargeTokens.INSTANCE.m3208getContainerHeightD9Ej5fM(), 0.0f, 0.0f, 12, null), largeShape, containerColor, jM1947contentColorForek8zF_U, floatingActionButtonElevationM2135elevationxZ9QkE, mutableInteractionSource2, function2, composerStartRestartGroup, i4 & 33554318, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            final Shape shape2 = largeShape;
            final long j4 = containerColor;
            final long j5 = jM1947contentColorForek8zF_U;
            final FloatingActionButtonElevation floatingActionButtonElevation2 = floatingActionButtonElevationM2135elevationxZ9QkE;
            final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.FloatingActionButtonKt$LargeFloatingActionButton$1
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

                public final void invoke(Composer composer2, int i9) {
                    FloatingActionButtonKt.m2144LargeFloatingActionButtonXz6DiA(function0, modifier2, shape2, j4, j5, floatingActionButtonElevation2, mutableInteractionSource3, function2, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i2) & ((-1) - 1))), i3);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ExtendedFloatingActionButton-X-z6DiA, reason: not valid java name */
    public static final void m2142ExtendedFloatingActionButtonXz6DiA(final Function0<Unit> function0, Modifier modifier, Shape shape, long j2, long j3, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        FloatingActionButtonElevation floatingActionButtonElevationM2135elevationxZ9QkE = floatingActionButtonElevation;
        long containerColor = j2;
        long jM1947contentColorForek8zF_U = j3;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        Shape extendedFabShape = shape;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-326283107);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ExtendedFloatingActionButton)P(6,5,7,0:c#ui.graphics.Color,2:c#ui.graphics.Color,3,4)285@13734L16,286@13809L14,287@13851L31,288@13960L11,300@14347L335,292@14084L598:FloatingActionButton.kt#uh7d8r");
        if ((i3 + 1) - (i3 | 1) != 0) {
            i4 = (-1) - (((-1) - i2) & ((-1) - 6));
        } else if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            i4 = (-1) - (((-1) - (composerStartRestartGroup.changedInstance(function0) ? 4 : 2)) & ((-1) - i2));
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 = (i4 + 48) - (i4 & 48);
        } else if ((i2 & 48) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(companion) ? 32 : 16)));
        }
        if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            int i7 = ((i3 & 4) == 0 && composerStartRestartGroup.changed(extendedFabShape)) ? 256 : 128;
            i4 = (i4 + i7) - (i4 & i7);
        }
        if ((i2 + 3072) - (i2 | 3072) == 0) {
            i4 |= ((i3 + 8) - (i3 | 8) == 0 && composerStartRestartGroup.changed(containerColor)) ? 2048 : 1024;
        }
        if ((i2 + 24576) - (i2 | 24576) == 0) {
            int i8 = ((i3 & 16) == 0 && composerStartRestartGroup.changed(jM1947contentColorForek8zF_U)) ? 16384 : 8192;
            i4 = (i4 + i8) - (i4 & i8);
        }
        if ((ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE + i2) - (196608 | i2) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (((i3 + 32) - (i3 | 32) == 0 && composerStartRestartGroup.changed(floatingActionButtonElevationM2135elevationxZ9QkE)) ? 131072 : 65536)));
        }
        int i9 = (-1) - (((-1) - i3) | ((-1) - 64));
        if (i9 != 0) {
            i4 |= 1572864;
        } else if ((i2 + 1572864) - (i2 | 1572864) == 0) {
            int i10 = composerStartRestartGroup.changed(mutableInteractionSource2) ? 1048576 : 524288;
            i4 = (i4 + i10) - (i4 & i10);
        }
        if ((i3 & 128) != 0) {
            i4 |= 12582912;
        } else if ((i2 + 12582912) - (i2 | 12582912) == 0) {
            int i11 = composerStartRestartGroup.changedInstance(function3) ? 8388608 : 4194304;
            i4 = (i4 + i11) - (i4 & i11);
        }
        if ((4793491 + i4) - (4793491 | i4) != 4793490 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((-1) - (((-1) - i2) | ((-1) - 1)) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i6 != 0) {
                    companion = Modifier.Companion;
                }
                if ((i3 & 4) != 0) {
                    extendedFabShape = FloatingActionButtonDefaults.INSTANCE.getExtendedFabShape(composerStartRestartGroup, 6);
                    i4 &= -897;
                }
                if ((i3 + 8) - (i3 | 8) != 0) {
                    containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-7169)));
                }
                if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
                    jM1947contentColorForek8zF_U = ColorSchemeKt.m1947contentColorForek8zF_U(containerColor, composerStartRestartGroup, (-1) - (((-1) - (i4 >> 9)) | ((-1) - 14)));
                    i4 &= -57345;
                }
                if ((-1) - (((-1) - i3) | ((-1) - 32)) != 0) {
                    floatingActionButtonElevationM2135elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m2135elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                    i5 = (i4 - 458753) - (i4 | (-458753));
                } else {
                    i5 = i4;
                }
                if (i9 != 0) {
                    mutableInteractionSource2 = null;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 + 4) - (i3 | 4) != 0) {
                    i4 = (i4 - 897) - (i4 | (-897));
                }
                if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
                    i4 = (i4 - 7169) - (i4 | (-7169));
                }
                if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
                    i4 = (i4 - 57345) - (i4 | (-57345));
                }
                if ((i3 & 32) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-458753)));
                }
                i5 = i4;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-326283107, i5, -1, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:291)");
            }
            int i12 = (-1) - (((-1) - (14 & i5)) & ((-1) - 12582912));
            int i13 = 112 & i5;
            int i14 = (-1) - (((-1) - (((-1) - (((-1) - (((i12 + i13) - (i12 & i13)) | ((-1) - (((-1) - i5) | ((-1) - 896))))) & ((-1) - ((i5 + 7168) - (7168 | i5))))) | (57344 & i5))) & ((-1) - (458752 & i5)));
            int i15 = (i5 + 3670016) - (i5 | 3670016);
            int i16 = (i14 + i15) - (i14 & i15);
            m2143FloatingActionButtonXz6DiA(function0, companion, extendedFabShape, containerColor, jM1947contentColorForek8zF_U, floatingActionButtonElevationM2135elevationxZ9QkE, mutableInteractionSource2, ComposableLambdaKt.rememberComposableLambda(398457247, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$1
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

                public final void invoke(Composer composer2, int i17) {
                    ComposerKt.sourceInformation(composer2, "C301@14357L319:FloatingActionButton.kt#uh7d8r");
                    if ((3 & i17) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(398457247, i17, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:301)");
                        }
                        Modifier modifierM1020paddingVpY3zN4$default = PaddingKt.m1020paddingVpY3zN4$default(SizeKt.m1067sizeInqDBjuR0$default(Modifier.Companion, FloatingActionButtonKt.ExtendedFabMinimumWidth, 0.0f, 0.0f, 0.0f, 14, null), FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, 2, null);
                        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                        Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                        Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                        ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer2, 54);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM1020paddingVpY3zN4$default);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM3671constructorimpl = Updater.m3671constructorimpl(composer2);
                        Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                        if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                        function32.invoke(RowScopeInstance.INSTANCE, composer2, 6);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, i16, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            final Shape shape2 = extendedFabShape;
            final long j4 = containerColor;
            final long j5 = jM1947contentColorForek8zF_U;
            final FloatingActionButtonElevation floatingActionButtonElevation2 = floatingActionButtonElevationM2135elevationxZ9QkE;
            final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$2
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

                public final void invoke(Composer composer2, int i17) {
                    Function0<Unit> function02 = function0;
                    Modifier modifier3 = modifier2;
                    Shape shape3 = shape2;
                    long j6 = j4;
                    long j7 = j5;
                    FloatingActionButtonElevation floatingActionButtonElevation3 = floatingActionButtonElevation2;
                    MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
                    Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                    int i18 = i2;
                    FloatingActionButtonKt.m2142ExtendedFloatingActionButtonXz6DiA(function02, modifier3, shape3, j6, j7, floatingActionButtonElevation3, mutableInteractionSource4, function32, composer2, RecomposeScopeImplKt.updateChangedFlags((i18 + 1) - (i18 & 1)), i3);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ExtendedFloatingActionButton-ElI5-7k, reason: not valid java name */
    public static final void m2141ExtendedFloatingActionButtonElI57k(final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final Function0<Unit> function0, Modifier modifier, boolean z2, Shape shape, long j2, long j3, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, Composer composer, final int i2, final int i3) {
        int i4;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        FloatingActionButtonElevation floatingActionButtonElevationM2135elevationxZ9QkE = floatingActionButtonElevation;
        long containerColor = j2;
        Shape extendedFabShape = shape;
        boolean z3 = z2;
        long jM1947contentColorForek8zF_U = j3;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1387401842);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ExtendedFloatingActionButton)P(9,4,7,6,3,8,0:c#ui.graphics.Color,1:c#ui.graphics.Color)359@17300L16,360@17375L14,361@17417L31,362@17526L11,373@17867L1053,365@17604L1316:FloatingActionButton.kt#uh7d8r");
        if ((i3 + 1) - (i3 | 1) != 0) {
            i4 = (i2 + 6) - (i2 & 6);
        } else if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 = (i4 + 48) - (i4 & 48);
        } else if ((i2 & 48) == 0) {
            int i5 = composerStartRestartGroup.changedInstance(function22) ? 32 : 16;
            i4 = (i4 + i5) - (i4 & i5);
        }
        if ((i3 & 4) != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i2 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            int i6 = composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
            i4 = (i4 + i6) - (i4 & i6);
        }
        int i7 = (i3 + 8) - (i3 | 8);
        if (i7 != 0) {
            i4 = (i4 + 3072) - (i4 & 3072);
        } else if ((i2 + 3072) - (i2 | 3072) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(companion) ? 2048 : 1024)));
        }
        int i8 = i3 & 16;
        if (i8 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 24576));
        } else if ((i2 & 24576) == 0) {
            int i9 = composerStartRestartGroup.changed(z3) ? 16384 : 8192;
            i4 = (i4 + i9) - (i4 & i9);
        }
        if ((-1) - (((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) | ((-1) - i2)) == 0) {
            int i10 = ((i3 + 32) - (i3 | 32) == 0 && composerStartRestartGroup.changed(extendedFabShape)) ? 131072 : 65536;
            i4 = (i4 + i10) - (i4 & i10);
        }
        if ((-1) - (((-1) - 1572864) | ((-1) - i2)) == 0) {
            int i11 = ((-1) - (((-1) - i3) | ((-1) - 64)) == 0 && composerStartRestartGroup.changed(containerColor)) ? 1048576 : 524288;
            i4 = (i4 + i11) - (i4 & i11);
        }
        if ((-1) - (((-1) - i2) | ((-1) - 12582912)) == 0) {
            int i12 = ((i3 & 128) == 0 && composerStartRestartGroup.changed(jM1947contentColorForek8zF_U)) ? 8388608 : 4194304;
            i4 = (i4 + i12) - (i4 & i12);
        }
        if ((i2 & 100663296) == 0) {
            int i13 = ((-1) - (((-1) - i3) | ((-1) - 256)) == 0 && composerStartRestartGroup.changed(floatingActionButtonElevationM2135elevationxZ9QkE)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
            i4 = (i4 + i13) - (i4 & i13);
        }
        int i14 = (-1) - (((-1) - i3) | ((-1) - 512));
        if (i14 != 0) {
            i4 = (i4 + 805306368) - (i4 & 805306368);
        } else if ((-1) - (((-1) - 805306368) | ((-1) - i2)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(mutableInteractionSource2) ? 536870912 : 268435456)));
        }
        if ((i4 + 306783379) - (306783379 | i4) != 306783378 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((-1) - (((-1) - i2) | ((-1) - 1)) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i7 != 0) {
                    companion = Modifier.Companion;
                }
                if (i8 != 0) {
                    z3 = true;
                }
                if ((-1) - (((-1) - i3) | ((-1) - 32)) != 0) {
                    extendedFabShape = FloatingActionButtonDefaults.INSTANCE.getExtendedFabShape(composerStartRestartGroup, 6);
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-458753)));
                }
                if ((i3 & 64) != 0) {
                    containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-3670017)));
                }
                if ((i3 + 128) - (i3 | 128) != 0) {
                    int i15 = i4 >> 18;
                    jM1947contentColorForek8zF_U = ColorSchemeKt.m1947contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i15 + 14) - (i15 | 14));
                    i4 = (i4 - 29360129) - (i4 | (-29360129));
                }
                if ((i3 & 256) != 0) {
                    floatingActionButtonElevationM2135elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m2135elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                    i4 &= -234881025;
                }
                if (i14 != 0) {
                    mutableInteractionSource2 = null;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((-1) - (((-1) - i3) | ((-1) - 32)) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-458753)));
                }
                if ((i3 & 64) != 0) {
                    i4 = (i4 - 3670017) - (i4 | (-3670017));
                }
                if ((-1) - (((-1) - i3) | ((-1) - 128)) != 0) {
                    i4 = (i4 - 29360129) - (i4 | (-29360129));
                }
                if ((i3 & 256) != 0) {
                    i4 &= -234881025;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1387401842, i4, -1, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:364)");
            }
            final boolean z4 = z3;
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1172118032, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$3
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

                public final void invoke(Composer composer2, int i16) {
                    float fM6638constructorimpl;
                    float fM6638constructorimpl2;
                    float fM3231getContainerWidthD9Ej5fM;
                    ComposerKt.sourceInformation(composer2, "C377@18029L885:FloatingActionButton.kt#uh7d8r");
                    if ((i16 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1172118032, i16, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:374)");
                        }
                        if (z4) {
                            fM6638constructorimpl = FloatingActionButtonKt.ExtendedFabStartIconPadding;
                        } else {
                            fM6638constructorimpl = Dp.m6638constructorimpl(0);
                        }
                        if (z4) {
                            fM6638constructorimpl2 = FloatingActionButtonKt.ExtendedFabTextPadding;
                        } else {
                            fM6638constructorimpl2 = Dp.m6638constructorimpl(0);
                        }
                        Modifier.Companion companion2 = Modifier.Companion;
                        if (z4) {
                            fM3231getContainerWidthD9Ej5fM = FloatingActionButtonKt.ExtendedFabMinimumWidth;
                        } else {
                            fM3231getContainerWidthD9Ej5fM = FabPrimaryTokens.INSTANCE.m3231getContainerWidthD9Ej5fM();
                        }
                        Modifier modifierM1022paddingqDBjuR0$default = PaddingKt.m1022paddingqDBjuR0$default(SizeKt.m1067sizeInqDBjuR0$default(companion2, fM3231getContainerWidthD9Ej5fM, 0.0f, 0.0f, 0.0f, 14, null), fM6638constructorimpl, 0.0f, fM6638constructorimpl2, 0.0f, 10, null);
                        Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                        Arrangement.HorizontalOrVertical start = z4 ? Arrangement.INSTANCE.getStart() : Arrangement.INSTANCE.getCenter();
                        Function2<Composer, Integer, Unit> function23 = function22;
                        boolean z5 = z4;
                        final Function2<Composer, Integer, Unit> function24 = function2;
                        ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, 48);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM1022paddingqDBjuR0$default);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM3671constructorimpl = Updater.m3671constructorimpl(composer2);
                        Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                        if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer2, 1618821151, "C388@18524L6,393@18718L186,389@18543L361:FloatingActionButton.kt#uh7d8r");
                        function23.invoke(composer2, 0);
                        AnimatedVisibilityKt.AnimatedVisibility(rowScopeInstance, z5, (Modifier) null, FloatingActionButtonKt.ExtendedFabExpandAnimation, FloatingActionButtonKt.ExtendedFabCollapseAnimation, (String) null, ComposableLambdaKt.rememberComposableLambda(176242764, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$3$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, Integer num) {
                                invoke(animatedVisibilityScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, int i17) {
                                ComposerKt.sourceInformation(composer3, "C394@18736L154:FloatingActionButton.kt#uh7d8r");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(176242764, i17, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous>.<anonymous>.<anonymous> (FloatingActionButton.kt:394)");
                                }
                                Modifier modifierClearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(Modifier.Companion, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$3$1$1.1
                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        invoke2(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }
                                });
                                Function2<Composer, Integer, Unit> function25 = function24;
                                ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composer3, 0);
                                ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierClearAndSetSemantics);
                                Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor2);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM3671constructorimpl2 = Updater.m3671constructorimpl(composer3);
                                Updater.m3678setimpl(composerM3671constructorimpl2, measurePolicyRowMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                                Updater.m3678setimpl(composerM3671constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                                if (composerM3671constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM3671constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM3671constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m3678setimpl(composerM3671constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer3, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(composer3, 1967858577, "C395@18796L49,396@18866L6:FloatingActionButton.kt#uh7d8r");
                                SpacerKt.Spacer(SizeKt.m1068width3ABfNKs(Modifier.Companion, FloatingActionButtonKt.ExtendedFabEndIconPadding), composer3, 6);
                                function25.invoke(composer3, 0);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                composer3.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 1600518, 18);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54);
            int i16 = i4 >> 6;
            int i17 = (i16 & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) | ((i16 + 14) - (i16 | 14)) | 12582912;
            int i18 = i4 >> 9;
            int i19 = (-1) - (((-1) - i18) | ((-1) - 896));
            m2143FloatingActionButtonXz6DiA(function0, companion, extendedFabShape, containerColor, jM1947contentColorForek8zF_U, floatingActionButtonElevationM2135elevationxZ9QkE, mutableInteractionSource2, composableLambdaRememberComposableLambda, composerStartRestartGroup, (-1) - (((-1) - (((-1) - (((-1) - ((-1) - (((-1) - ((i17 + i19) - (i17 & i19))) & ((-1) - ((i18 + 7168) - (7168 | i18)))))) & ((-1) - ((-1) - (((-1) - 57344) | ((-1) - i18)))))) | (458752 & i18))) & ((-1) - ((-1) - (((-1) - i18) | ((-1) - 3670016))))), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final long j4 = containerColor;
            final long j5 = jM1947contentColorForek8zF_U;
            final FloatingActionButtonElevation floatingActionButtonElevation2 = floatingActionButtonElevationM2135elevationxZ9QkE;
            final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
            final Modifier modifier2 = companion;
            final boolean z5 = z3;
            final Shape shape2 = extendedFabShape;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$4
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

                public final void invoke(Composer composer2, int i20) {
                    FloatingActionButtonKt.m2141ExtendedFloatingActionButtonElI57k(function2, function22, function0, modifier2, z5, shape2, j4, j5, floatingActionButtonElevation2, mutableInteractionSource3, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
    }
}
