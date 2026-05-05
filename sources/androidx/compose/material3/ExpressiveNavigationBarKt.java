package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
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
/* JADX INFO: compiled from: ExpressiveNavigationBar.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яt\u001d̉=!4i\bDJc|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007f\u0007llA0ZeP.Xe2\u000fy{<řc$\bCC٥\"}8\tWNmgvJp\u000bKƤ\u000e\u0016\u000fj4կ]xs\u0012\u00172XoG3SqE9n}>\u0005&6*8\u0010\u0005\tɝ2H&v\u0003ŏS\f(0Hp@S\u0015M\u0013 \u001a\u0006D!\u0019sj\u0006f6v\f\u000e@5#\u0011\nZNU\u0001`\u0003S\rTv?\r%\u0005N1F7C9=S1*\u0003aE\u0003M\u0017U\u0005\u0017MW1Ose]p\u007fB=[^\u001b\u0007\u000b1l\u0007a`:FYyӍOP\u0014S>yց\fɝǬ\u0012\b-t<Z2ǯ\u0007\u001ca\rr\u0002_\u0001\u0006lq\u0018z\u0010fG/\u000edC?+haai8|a,\u0014\u001bP;\f~#kT<\u007fCEƻ{Q7|pCNN\u0018yUm2\u0012\u0013\b0\u0004>z\u0018/*A^*+7im;.{\u0004XD\u0016\u0016\u001b_\u0017}ׂVHFM\u001f)=*\u0017ArQt\u0007{P\u0003wB\u0010{FΤ\u000b}\u000e>Pb}</[(N} \u001apS]\u0018]Gfe\u0013\u001fs\u0014WG\u0019K7gb>\u001d\u0019uޖ>ֺИ\tZl~aIrr6`JH\u0019O(\u007fR\u000f$\u0013`~\" BmI\u0019\u000bT\u000f\u0003>NOґ!_\tgfкVտ(\u0003q˅\u0015\u0015\u000fPtp\u001efO̥.ʬd\"5ۋqA''m\"\u00176Sɀ\tҋw\u007fOхlSZo.u\u0004zvډ\u001c\u07fcU/EП/\r76\u001a-sQIϏS̊\u0016)\u0003|\b\u0015[t<n j\u001f+7ʇLׅX\u0017*Ԯ~~1\u0010|\u007f(`\u001dڬIϭX\u000bcŬi~\u0011bTNf\u0007[ȗ ݵ\u0005o*ĜU;Q25\u0016&\u0019\u0006֕cԃmq6yp\u0015F\ts\u0010DcDt9Д_щ?@QY\rD:&r\u0010PV\u000b\f\u0016Q!4;8\u001fЩfވZ@U\u000b=\u0004~\t2\u001d~d{H!\u0001\u00164\\d\u0001ϕE\u0382\u0018`K%\u001fSs{{\u007fc\\9Oeϙ\r֭5v\u001a\u001cK&nYh\u001c>\u0014\u0014,DUSb3A_Ә6ʙ@\u0010\u0013Cbo\u001e\u0012\u0001\u0015Tm/+@X\f;\u0005\u0013+܀^ƪL\rhEn'B\u0003\u0005&A,\u0019I?\u001d\u0006F\u00034:ѣ\u0003Ә!\u0011#j]\u0005~'1]bG;6f\u001b#E\fH ͼ8\u0086K+uk}\u0012X&\u000b8Z\u0018I>(Μa۞4`\u0013UrT\u0005\u000b \u0003jNP.UҔ~ɽ@\u0012\u0017\u000b'U\u000bqhJZ\\ߚ7H\"\u0004\u001d؏E5\u000bƚg\t"}, d2 = {"\u000fbc6i,\"Q#\bXh3\u0007\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006\u0006/;Y\u0007.\u0001K 5WP)i7\u001e\u001dhG9\u001bR6Tv0U\"", "\u000fbc6i,\"\\\u0018\u0003xZ;\u0007\u0016\ro\u00072\t", "\u000fbc6i,\"\\\u0018\u0003xZ;\u0007\u0016\u001dh{3{", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006\u0006/;Y\u0007.\u0001[\u0019*XC!kH\r\u001fnaB\u00159", "\u000fbc6i,%O\u0016~\u0002M,\u0010\u0018\ro\u00072\t", "\u0017b^;F0SS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "\u0014", "\u0017mP0g0OS||\u0005g\n\u0007\u00109r", "\u0017mP0g0OS\u007fzw^3k\tBt]2\u0003J\u000e", "\u001a`Q2_\u001b>f(_\u0005g;", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006\u0006/;Y\u0007.\u0001\\*9WEHg?!)NaMum2N\u007f5\u001d", "\u001c`e6Z(MW#\bWZ9_\t3g\u00037", "!sP?g\u0010<]\"b\u0004]0z\u0005>o\r\u000b\u0006M\u0005,!P~\nCa!4X\u0002)9", "5dc g(Kb||\u0005g\u0010\u0006\b3c{7\u0006Mc!$K\u0005\u0018E\u0006!<Dy\u001f6q\u001f0", "u(5", "!sP?g\u0010<]\"b\u0004]0z\u0005>o\r\u0019{M\u0010\u001b\u0015Cvx8u$9b\u007f", "5dc g(Kb||\u0005g\u0010\u0006\b3c{7\u0006Mq\u0017$Vs\f8}\u00101X|$@o", "!sP?g\u0010<]\"b\n^4X\u0007>i\u0011(_I\u007f\u001b\u0015C~\u0018IY%9[\u0001/", "!sP?g\u0010<]\"m\u0005E(y\t6P{'zD\n\u0019", "5dc g(Kb||\u0005g\u001b\u0007o+b\u007f/f<\u007f\u0016\u001bPq", "\"n_\u0016V6G7\"}~\\(\f\u0013<H\n5\u007fU\u000b &Cvx8u$9b\u007f", "5dc!b7\"Q#\b^g+\u0001\u0007+t\n5^J\u000e\u001b,Qx\u001d8}\u00101X|$@o", "\"n_\u0016V6G7\"}~\\(\f\u0013<T\n\u000fw=\u0001\u001e\u0002Cn\r@\u007f'", "5dc!b7\"Q#\b^g+\u0001\u0007+t\n5jJg\u0013\u0014Gvx8u$9b\u007f", "\"n_\u0016V6G7\"}~\\(\f\u0013<V\u007f5\u000bD~\u0013\u001e2k\r;z.7", "5dc!b7\"Q#\b^g+\u0001\u0007+t\n5l@\u000e&\u001bEk\u0015'r$4]\u0007\"", "\"n_\u0016V6G7(~\u0003:*\f\r@ec1zD~\u0013&Q|p<z'8h", "\"n_\u0016V6G7(~\u0003:*\f\r@ec1zD~\u0013&Q|\u007f@u48", "\"n_\u0016V6G7(~\u0003O,\n\u00183c{/f<\u007f\u0016\u001bPq", "5dc!b7\"Q#\b^m,\u0005y/r\u000f,y<\b\u0002\u0013Fn\u0012Ex", "\u0013w_?X:LW*~cZ=\u0001\u000b+t\u00042\u0005\u001d|$", "", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "1n]AT0GS&\\\u0005e6\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "1n]AX5M1#\u0006\u0005k", "Eh]1b>\"\\'~\nl", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\b2VBE}\u0018'#hpG\\", "/qa.a.>[\u0019\b\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006_!F]\u007f\u001cFq 7*?HGA+\u0011qc9\u000fc5]L", "1n]AX5M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "\u0013w_?X:LW*~cZ=\u0001\u000b+t\u00042\u0005\u001d|$^0srKi\u0011\u0004", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b>b\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cuO\u00017PKJ;`\\{\u0007\u001b\u000en\u0018^:Vv]J#xV\u001b(\u0016,X\u0010\u0011Lg\u0012 \u001d<ny\f[!OC\u0016\u0006J'wJch\b\u0011\"Uk(s\u0010i&)\u0010! \u001dp&%lOASy]\u0019}\\\bg1T)\u0004G(Fm%$Ow`F\u0003',!_[U#", "\u0013w_?X:LW*~cZ=\u0001\u000b+t\u00042\u0005\u001d|$zVo\u0016", "Ad[2V;>R", "", "=m29\\*D", "7b^;", "3mP/_,=", ":`Q2_", "0`S4X", "7b^;C6LW(\u0003\u0005g", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006_!F]\u007f\u001cFq 71R;s\u0018\u001c\u001fqLC\u0015g;R\u00010\u001d", "1n[<e:", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006_!F]\u007f\u001cFq 71R;s\u0012(\u001crnG\\", "7mc2e(<b\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005SD-\u0011eh9jl;N\u0004#E[R6e@|M!\u0010Zc", "\u0013w_?X:LW*~cZ=\u0001\u000b+t\u00042\u0005\u001d|$zVo\u0016\u0004\u0002,9!\rp=", "uY;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHu\u001es =TGD59/\u001d2bI\u0010a;R\u00010U\u0016/<eP\u0002A\u001e\u001b'c5'\u0016\u0004fK(mW\u0001\u001d\u00124T\fIhJ\u001c\u001aW\u001dtoFW\u0014G\u0007jj(/rU`c\u0003\u0011FVjse\u001ch\u001bk>D-\";y+qN=\u000e\u0006\\]H9\u007fqvN\u001d\u0004\u0002)Ou%GUxSKx1(YEX\";V\u0004/~6P\n\u000e\u001d`\u000eJt\"B]\f^*fI20D<\\GGruyB\nol+p\ns93\u0015timQr\u0016]\u001f9?hi\u000eE(l:Rn\"1J}U%w\u001f\u0011\u0012.{e\u0013D%d\n\u0019lS&i\u001aL\u0007o'\u001c;\u0012;h\u0013r3)\u001f]\"\u0005e?\f_bR\u0015}D\u000e|O|dEy4Cv\u0011\u001f\b/T;\u0004\\Gn#_2\u000b\u0013\n'\u0002i\f\u0007F\u001c4)EY\u0002@j7\u0016qa\"&=\u001c\u007fb\u001e", "1`[0h3:b\u0019\\zg;|\u0016/d]2\u0005O\u0001 &*y\u001b@\f/>hy'\"i\u0015-QL=", "", "7sT:f\nHc\"\u000e", "0`a$\\+MV", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ExpressiveNavigationBarKt {
    private static final ColorSchemeKeyTokens ActiveIconColor;
    private static final ColorSchemeKeyTokens ActiveIndicatorColor;
    private static final ShapeKeyTokens ActiveIndicatorShape;
    private static final ColorSchemeKeyTokens ActiveLabelTextColor;
    private static final float IconSize;
    private static final ColorSchemeKeyTokens InactiveIconColor;
    private static final ColorSchemeKeyTokens InactiveLabelTextColor;
    private static final TypographyKeyTokens LabelTextFont;
    private static final float NavigationBarHeight;
    private static final float StartIconIndicatorHorizontalPadding;
    private static final float StartIconIndicatorVerticalPadding;
    private static final float StartIconItemActiveIndicatorHeight;
    private static final float StartIconToLabelPadding;
    private static final float TopIconIndicatorHorizontalPadding;
    private static final float TopIconIndicatorToLabelPadding;
    private static final float TopIconIndicatorVerticalPadding;
    private static final float TopIconItemActiveIndicatorHeight;
    private static final float TopIconItemActiveIndicatorWidth;
    private static final float TopIconItemVerticalPadding;

    /* JADX INFO: renamed from: ExpressiveNavigationBar-NiJtXQ4, reason: not valid java name */
    public static final void m2113ExpressiveNavigationBarNiJtXQ4(Modifier modifier, long j2, long j3, WindowInsets windowInsets, int i2, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i3, final int i4) {
        int i5;
        long contentColor = j3;
        long containerColor = j2;
        final int iM2112getArrangementEbr7WPU = i2;
        final WindowInsets windowInsets2 = windowInsets;
        final Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1171105467);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ExpressiveNavigationBar)P(4,1:c#ui.graphics.Color,3:c#ui.graphics.Color,5,0:c#material3.NavigationBarArrangement)83@3944L14,84@4018L12,85@4097L12,92@4328L779,89@4244L863:ExpressiveNavigationBar.kt#uh7d8r");
        int i6 = (i4 + 1) - (i4 | 1);
        if (i6 != 0) {
            i5 = (i3 + 6) - (i3 & 6);
        } else if ((i3 + 6) - (i3 | 6) == 0) {
            i5 = (-1) - (((-1) - (composerStartRestartGroup.changed(companion) ? 4 : 2)) & ((-1) - i3));
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            int i7 = ((i4 + 2) - (i4 | 2) == 0 && composerStartRestartGroup.changed(containerColor)) ? 32 : 16;
            i5 = (i5 + i7) - (i5 & i7);
        }
        if ((-1) - (((-1) - i3) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (((-1) - (((-1) - i4) | ((-1) - 4)) == 0 && composerStartRestartGroup.changed(contentColor)) ? 256 : 128)));
        }
        if ((i3 & 3072) == 0) {
            i5 |= ((i4 & 8) == 0 && composerStartRestartGroup.changed(windowInsets2)) ? 2048 : 1024;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 24576)) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (((-1) - (((-1) - i4) | ((-1) - 16)) == 0 && composerStartRestartGroup.changed(iM2112getArrangementEbr7WPU)) ? 16384 : 8192)));
        }
        if ((i4 & 32) != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE));
        } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function2) ? 131072 : 65536;
        }
        if ((74899 & i5) != 74898 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((-1) - (((-1) - i3) | ((-1) - 1)) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i6 != 0) {
                    companion = Modifier.Companion;
                }
                if ((-1) - (((-1) - i4) | ((-1) - 2)) != 0) {
                    containerColor = ExpressiveNavigationBarDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-113)));
                }
                if ((i4 + 4) - (i4 | 4) != 0) {
                    contentColor = ExpressiveNavigationBarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                    i5 &= -897;
                }
                if ((-1) - (((-1) - i4) | ((-1) - 8)) != 0) {
                    windowInsets2 = ExpressiveNavigationBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    i5 = (i5 - 7169) - (i5 | (-7169));
                }
                if ((i4 + 16) - (i4 | 16) != 0) {
                    iM2112getArrangementEbr7WPU = ExpressiveNavigationBarDefaults.INSTANCE.m2112getArrangementEbr7WPU();
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-57345)));
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((-1) - (((-1) - i4) | ((-1) - 2)) != 0) {
                    i5 = (i5 - 113) - (i5 | (-113));
                }
                if ((i4 + 4) - (i4 | 4) != 0) {
                    i5 &= -897;
                }
                if ((i4 & 8) != 0) {
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-7169)));
                }
                if ((-1) - (((-1) - i4) | ((-1) - 16)) != 0) {
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-57345)));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1171105467, i5, -1, "androidx.compose.material3.ExpressiveNavigationBar (ExpressiveNavigationBar.kt:88)");
            }
            int i8 = i5 << 3;
            SurfaceKt.m2561SurfaceT9BRK9s(null, null, containerColor, contentColor, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1573697866, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ExpressiveNavigationBarKt$ExpressiveNavigationBar$1
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
                    CenteredContentMeasurePolicy centeredContentMeasurePolicy;
                    ComposerKt.sourceInformation(composer2, "C93@4338L763:ExpressiveNavigationBar.kt#uh7d8r");
                    if ((i9 + 3) - (3 | i9) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1573697866, i9, -1, "androidx.compose.material3.ExpressiveNavigationBar.<anonymous> (ExpressiveNavigationBar.kt:93)");
                        }
                        Modifier modifierSelectableGroup = SelectableGroupKt.selectableGroup(SizeKt.m1048defaultMinSizeVpY3zN4$default(WindowInsetsPaddingKt.windowInsetsPadding(companion, windowInsets2), 0.0f, ExpressiveNavigationBarKt.NavigationBarHeight, 1, null));
                        int i10 = iM2112getArrangementEbr7WPU;
                        if (NavigationBarArrangement.m2270equalsimpl0(i10, NavigationBarArrangement.Companion.m2275getEqualWeightEbr7WPU())) {
                            centeredContentMeasurePolicy = new EqualWeightContentMeasurePolicy();
                        } else if (NavigationBarArrangement.m2270equalsimpl0(i10, NavigationBarArrangement.Companion.m2274getCenteredEbr7WPU())) {
                            centeredContentMeasurePolicy = new CenteredContentMeasurePolicy();
                        } else {
                            throw new IllegalArgumentException("Invalid ItemsArrangement value.");
                        }
                        Function2<Composer, Integer, Unit> function22 = function2;
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierSelectableGroup);
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
                        Updater.m3678setimpl(composerM3671constructorimpl, centeredContentMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                        if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                        function22.invoke(composer2, 0);
                        composer2.endNode();
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
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (-1) - (((-1) - ((-1) - (((-1) - (i8 & 896)) & ((-1) - 12582912)))) & ((-1) - ((-1) - (((-1) - i8) | ((-1) - 7168))))), 115);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            final long j4 = containerColor;
            final long j5 = contentColor;
            final WindowInsets windowInsets3 = windowInsets2;
            final int i9 = iM2112getArrangementEbr7WPU;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ExpressiveNavigationBarKt$ExpressiveNavigationBar$2
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

                public final void invoke(Composer composer2, int i10) {
                    Modifier modifier3 = modifier2;
                    long j6 = j4;
                    long j7 = j5;
                    WindowInsets windowInsets4 = windowInsets3;
                    int i11 = i9;
                    Function2<Composer, Integer, Unit> function22 = function2;
                    int i12 = i3;
                    ExpressiveNavigationBarKt.m2113ExpressiveNavigationBarNiJtXQ4(modifier3, j6, j7, windowInsets4, i11, function22, composer2, RecomposeScopeImplKt.updateChangedFlags((i12 + 1) - (i12 & 1)), i4);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ExpressiveNavigationBarItem-pli-t6k, reason: not valid java name */
    public static final void m2114ExpressiveNavigationBarItemplit6k(boolean z2, final Function0<Unit> function0, final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, boolean z3, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, int i2, NavigationItemColors navigationItemColors, MutableInteractionSource mutableInteractionSource, Composer composer, final int i3, final int i4) {
        int i5;
        final MutableInteractionSource mutableInteractionSource2;
        MutableInteractionSource mutableInteractionSource3;
        NavigationItemColors navigationItemColorsColors = navigationItemColors;
        int iM2328getTopxw1Ddg = i2;
        Function2<? super Composer, ? super Integer, Unit> function24 = function23;
        Function2<? super Composer, ? super Integer, Unit> function25 = function22;
        boolean z4 = z3;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(1250474866);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ExpressiveNavigationBarItem)P(9,8,3,7,2,6!1,4:c#material3.NavigationItemIconPosition)195@8610L8,219@9391L5,220@9444L5,215@9259L800:ExpressiveNavigationBar.kt#uh7d8r");
        boolean z5 = z2;
        if ((i4 + 1) - (i4 | 1) != 0) {
            i5 = (-1) - (((-1) - i3) & ((-1) - 6));
        } else if ((-1) - (((-1) - i3) | ((-1) - 6)) == 0) {
            int i6 = composerStartRestartGroup.changed(z5) ? 4 : 2;
            i5 = (i6 + i3) - (i6 & i3);
        } else {
            i5 = i3;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 2)) != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 48));
        } else if ((i3 + 48) - (i3 | 48) == 0) {
            int i7 = composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
            i5 = (i5 + i7) - (i5 & i7);
        }
        if ((i4 + 4) - (i4 | 4) != 0) {
            i5 = (i5 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i5 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((-1) - (((-1) - i3) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        int i8 = (-1) - (((-1) - i4) | ((-1) - 8));
        if (i8 != 0) {
            i5 = (i5 + 3072) - (i5 & 3072);
        } else if ((i3 + 3072) - (i3 | 3072) == 0) {
            int i9 = composerStartRestartGroup.changed(companion) ? 2048 : 1024;
            i5 = (i5 + i9) - (i5 & i9);
        }
        int i10 = i4 & 16;
        if (i10 != 0) {
            i5 |= 24576;
        } else if ((i3 & 24576) == 0) {
            int i11 = composerStartRestartGroup.changed(z4) ? 16384 : 8192;
            i5 = (i5 + i11) - (i5 & i11);
        }
        int i12 = i4 & 32;
        if (i12 != 0) {
            i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((-1) - (((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) | ((-1) - i3)) == 0) {
            int i13 = composerStartRestartGroup.changedInstance(function25) ? 131072 : 65536;
            i5 = (i5 + i13) - (i5 & i13);
        }
        int i14 = (-1) - (((-1) - i4) | ((-1) - 64));
        if (i14 != 0) {
            i5 = (i5 + 1572864) - (i5 & 1572864);
        } else if ((-1) - (((-1) - 1572864) | ((-1) - i3)) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function24) ? 1048576 : 524288;
        }
        int i15 = (i4 + 128) - (i4 | 128);
        if (i15 != 0) {
            i5 = (i5 + 12582912) - (i5 & 12582912);
        } else if ((i3 & 12582912) == 0) {
            i5 |= composerStartRestartGroup.changed(iM2328getTopxw1Ddg) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (((i4 + 256) - (i4 | 256) == 0 && composerStartRestartGroup.changed(navigationItemColorsColors)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432)));
        }
        int i16 = (i4 + 512) - (i4 | 512);
        if (i16 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 805306368));
        } else if ((i3 & 805306368) == 0) {
            int i17 = composerStartRestartGroup.changed(mutableInteractionSource) ? 536870912 : 268435456;
            i5 = (i5 + i17) - (i5 & i17);
        }
        if ((i5 & 306783379) == 306783378 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            mutableInteractionSource2 = mutableInteractionSource;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i3 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i8 != 0) {
                    companion = Modifier.Companion;
                }
                if (i10 != 0) {
                    z4 = true;
                }
                mutableInteractionSource2 = null;
                if (i12 != 0) {
                    function25 = null;
                }
                if (i14 != 0) {
                    function24 = null;
                }
                if (i15 != 0) {
                    iM2328getTopxw1Ddg = NavigationItemIconPosition.Companion.m2328getTopxw1Ddg();
                }
                if ((i4 & 256) != 0) {
                    navigationItemColorsColors = ExpressiveNavigationBarItemDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-234881025)));
                }
                if (i16 == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i4 & 256) != 0) {
                    i5 = (i5 - 234881025) - (i5 | (-234881025));
                }
                mutableInteractionSource2 = mutableInteractionSource;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1250474866, i5, -1, "androidx.compose.material3.ExpressiveNavigationBarItem (ExpressiveNavigationBar.kt:197)");
            }
            composerStartRestartGroup.startReplaceGroup(-986536477);
            ComposerKt.sourceInformation(composerStartRestartGroup, "199@8762L39");
            if (mutableInteractionSource2 == null) {
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -986535826, "CC(remember):ExpressiveNavigationBar.kt#9igjgp");
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            } else {
                mutableInteractionSource3 = mutableInteractionSource2;
            }
            composerStartRestartGroup.endReplaceGroup();
            boolean zM2323equalsimpl0 = NavigationItemIconPosition.m2323equalsimpl0(iM2328getTopxw1Ddg, NavigationItemIconPosition.Companion.m2328getTopxw1Ddg());
            float f2 = zM2323equalsimpl0 ? TopIconIndicatorHorizontalPadding : StartIconIndicatorHorizontalPadding;
            float f3 = zM2323equalsimpl0 ? TopIconIndicatorVerticalPadding : StartIconIndicatorVerticalPadding;
            TextStyle value = TypographyKt.getValue(LabelTextFont, composerStartRestartGroup, 6);
            Shape value2 = ShapesKt.getValue(ActiveIndicatorShape, composerStartRestartGroup, 6);
            float f4 = TopIconItemActiveIndicatorWidth;
            float f5 = TopIconIndicatorToLabelPadding;
            float f6 = StartIconToLabelPadding;
            float f7 = TopIconItemVerticalPadding;
            int i18 = ((-1) - (((-1) - i5) | ((-1) - 14))) | 906166272;
            int i19 = 112 & i5;
            int i20 = (-1) - (((-1) - ((i18 + i19) - (i18 & i19))) & ((-1) - ((-1) - (((-1) - i5) | ((-1) - 896)))));
            int i21 = i5 >> 21;
            int i22 = (i21 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i21 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION);
            int i23 = (6 + i22) - (6 & i22);
            int i24 = i5 >> 3;
            int i25 = (i24 + 896) - (896 | i24);
            int i26 = (-1) - (((-1) - ((((i23 + i25) - (i23 & i25)) | (7168 & i24)) | (57344 & i24))) & ((-1) - ((458752 + i24) - (458752 | i24))));
            int i27 = (-1) - (((-1) - i24) | ((-1) - 3670016));
            z5 = z5;
            NavigationItemKt.m2329NavigationItemSHbi2eg(z5, function0, function2, value, value2, f4, f2, f3, f5, f6, f7, navigationItemColorsColors, companion, z4, function25, function24, iM2328getTopxw1Ddg, mutableInteractionSource3, composerStartRestartGroup, i20, (i26 + i27) - (i26 & i27));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final boolean z6 = z5;
            final Modifier modifier2 = companion;
            final boolean z7 = z4;
            final Function2<? super Composer, ? super Integer, Unit> function26 = function25;
            final Function2<? super Composer, ? super Integer, Unit> function27 = function24;
            final int i28 = iM2328getTopxw1Ddg;
            final NavigationItemColors navigationItemColors2 = navigationItemColorsColors;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ExpressiveNavigationBarKt$ExpressiveNavigationBarItem$1
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

                public final void invoke(Composer composer2, int i29) {
                    boolean z8 = z6;
                    Function0<Unit> function02 = function0;
                    Function2<Composer, Integer, Unit> function28 = function2;
                    Modifier modifier3 = modifier2;
                    boolean z9 = z7;
                    Function2<Composer, Integer, Unit> function29 = function26;
                    Function2<Composer, Integer, Unit> function210 = function27;
                    int i30 = i28;
                    NavigationItemColors navigationItemColors3 = navigationItemColors2;
                    MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                    int i31 = i3;
                    ExpressiveNavigationBarKt.m2114ExpressiveNavigationBarItemplit6k(z8, function02, function28, modifier3, z9, function29, function210, i30, navigationItemColors3, mutableInteractionSource4, composer2, RecomposeScopeImplKt.updateChangedFlags((i31 + 1) - (i31 & 1)), i4);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int calculateCenteredContentHorizontalPadding(int i2, int i3) {
        if (i2 > 6) {
            return 0;
        }
        return MathKt.roundToInt((((100 - ((i2 + 3) * 10)) / 2.0f) / 100) * i3);
    }

    public static final float getTopIconItemVerticalPadding() {
        return TopIconItemVerticalPadding;
    }

    public static final float getTopIconIndicatorVerticalPadding() {
        return TopIconIndicatorVerticalPadding;
    }

    public static final float getTopIconIndicatorHorizontalPadding() {
        return TopIconIndicatorHorizontalPadding;
    }

    public static final float getStartIconIndicatorVerticalPadding() {
        return StartIconIndicatorVerticalPadding;
    }

    public static final float getTopIconIndicatorToLabelPadding() {
        return TopIconIndicatorToLabelPadding;
    }

    public static final float getStartIconIndicatorHorizontalPadding() {
        return StartIconIndicatorHorizontalPadding;
    }

    public static final float getStartIconToLabelPadding() {
        return StartIconToLabelPadding;
    }

    static {
        float fM6638constructorimpl = Dp.m6638constructorimpl((float) 24.0d);
        IconSize = fM6638constructorimpl;
        float fM6638constructorimpl2 = Dp.m6638constructorimpl(56);
        TopIconItemActiveIndicatorWidth = fM6638constructorimpl2;
        float fM6638constructorimpl3 = Dp.m6638constructorimpl(32);
        TopIconItemActiveIndicatorHeight = fM6638constructorimpl3;
        float fM6638constructorimpl4 = Dp.m6638constructorimpl(40);
        StartIconItemActiveIndicatorHeight = fM6638constructorimpl4;
        LabelTextFont = TypographyKeyTokens.LabelMedium;
        ActiveIndicatorShape = ShapeKeyTokens.CornerFull;
        ActiveIconColor = ColorSchemeKeyTokens.Secondary;
        ActiveLabelTextColor = ColorSchemeKeyTokens.Secondary;
        ActiveIndicatorColor = ColorSchemeKeyTokens.SecondaryContainer;
        InactiveIconColor = ColorSchemeKeyTokens.OnSurfaceVariant;
        InactiveLabelTextColor = ColorSchemeKeyTokens.OnSurfaceVariant;
        NavigationBarHeight = Dp.m6638constructorimpl(64);
        TopIconItemVerticalPadding = Dp.m6638constructorimpl(6);
        float fM6638constructorimpl5 = Dp.m6638constructorimpl(fM6638constructorimpl3 - fM6638constructorimpl);
        float f2 = 2;
        TopIconIndicatorVerticalPadding = Dp.m6638constructorimpl(fM6638constructorimpl5 / f2);
        TopIconIndicatorHorizontalPadding = Dp.m6638constructorimpl(Dp.m6638constructorimpl(fM6638constructorimpl2 - fM6638constructorimpl) / f2);
        StartIconIndicatorVerticalPadding = Dp.m6638constructorimpl(Dp.m6638constructorimpl(fM6638constructorimpl4 - fM6638constructorimpl) / f2);
        float f3 = 4;
        TopIconIndicatorToLabelPadding = Dp.m6638constructorimpl(f3);
        StartIconIndicatorHorizontalPadding = Dp.m6638constructorimpl(16);
        StartIconToLabelPadding = Dp.m6638constructorimpl(f3);
    }
}
