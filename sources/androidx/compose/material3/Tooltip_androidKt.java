package androidx.compose.material3;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.ElevationTokens;
import androidx.compose.material3.tokens.RichTooltipTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
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
/* JADX INFO: compiled from: Tooltip.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яh\u001d̉=!,i\bDZc|İI\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0L͜P.hS2\u000fq{<$q$yCAU\"}8\tWN}gvJ`\u000fK\u000f\u001c\u0016\u0001j2K]xs\u0012\u00172XoG\u074cUoS9hҚ>\u000562*\u0600\u0002\u0005\u0017\u001a2Ϻ\u0018v\u0011CS\f\u00181X^Hĥ%M3\u0019:\u0006l 1$bg\\7`l\f<_)\tiPQ?_^\u0001}\u0013LT5\u0012\u000faL1p=;\u00153Z\u001b\u0007\u0001co\tEqK\u000e\u0001'U3yy]6f\n,\u0015YZ=cx&j\u0011i`:2[^qXh\u00198y\u000b{;;2\u001cΝ+H4<`kܕ\rޗϢvUF`\u0010oZȩyoH/%.2S9If\u0002gA\u0019\\8\u0014\u0005; S\u0014t!ig&m%\u001ddw\u007f0g?kVݳ\u000eYC|4\u0004h\u00028\u0018HT\u00101\f\u0011\\\u0016;6\nG؝%k\bWtm|\u0005nkki\u0001Lp(t\u0016E/!\f\tJ\u0015\u000bqPbmD\u0011{2\u0005\r\u0004\b!*twj,U\u0016TOvu\u0003M\f\u0015U>tNqy{\u0010g9\r2c_Ӓ\u0014aX\u0006ZDسaڳֽjDY$hu@h@b\u0003\u0010&\u0017lN:/bC\u007f9L,_7\r\u0019V\"6Bo\u001d9ch\n(~\u0003UT\u0007w-\r\t/X\rt}j\u0011IZ\u0001\u0011(;di7/%\u0004F/5ţ\"Ȕҋw\u0002M\rZmƅl\u001b}X\u0002¯2H8׀3d"}, d2 = {"\u001ekP6a\u001bH] \u000e~i", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e/?`\r$B[\u00148XC\u0011", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "1`a2g\u001aBh\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGd)JYS", "AgP=X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y+7C", "1n]AX5M1#\u0006\u0005k", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "1n]AT0GS&\\\u0005e6\n", "Bn]._\fES*z\nb6\u0006", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "AgP1b>\u001eZ\u0019\u0010vm0\u0007\u0012", "1n]AX5M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "\u001ekP6a\u001bH] \u000e~isNt\u00134m%\u0002", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u0014?c\u0005/;x\u0004,WN;A\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001c\u0003A]yd\rR,\u0011\u0005f\u0017\tU@@\u001e\u00156M\u0001N2~\u0016\u001e\u0019?xp\ff\u0014\u0011{\"qL,lDg)gJ=Pb\u007fIp@}C@D3\u001bu\"dma6S|c\u001apa}qpUb[H-<|_PN<+#p0\u001eX\u0006{\u0011E\"r5|8\u000eB*\u007fq\u0015Tv\u001cF^Br6dL146Ih#/'f", " hR5G6HZ(\u0003\u0006", "Bhc9X", "/bc6b5", "1n[<e:", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006c)3\\l*At%2X!Er>+#>", "BdgA", " hR5G6HZ(\u0003\u0006&@[\u001a.m\f:", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u0014?c\u0005/;x\u0004,WN;A\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001c\u0003A]yd\rR,\u0011\u0005f\u0017\u000btNF&\f5\u0013\u0007LpJ\r&\u00173ytL_\u001e\u0011Z%~?8lPb,O.GOq1h\u0015)\"mB\u0004%$z\u0017*lZ7\u0018E4!{P\tkqPeP\u001d\u000b:vZSOsTO>%)S\u0007\u0002 2\"\u0005/>/\u0011059h\u0003Y1\u0006AZ\u0004\u0015\u0002C=0%CF\u0017>^-svF\u0019r-aQ\u0016^D1&iaj\u0016Xsa\u0015^$ki\bFV\u0011\u001cSv\u001f4TT#<`\u001b\u0013\u0016+qn\u0013H,\\J\u001b\u0001M n\u0015\r\fta|>\u001f;h\u0013r3,\r4\u000f\u0012gE\u0016\u007fXV^nR\u0018xU\u0001[!|4?\b\u0015Q!|)F~]M}\u0010#\ndnB\u000e", "2qPD6(KS(p~m/g\u0005>h", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u007f$\u0013Y9lIr7\"Y\f0>|k", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u007f$\u0013Y9k8t(58\u000b\u001cI[\u00148XC\u0011", "1`a2g\u001bR^\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006T!BY\r\u000fKx\u0016\u0004", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "1n]3\\.N`\u0015\u000e~h5", "\u001a`]1e6BRb|\u0005g;|\u0012>/\r(\n\n^! Hs\u0010L\u0004!D]\b)\r", "/mR5b9%O-\t\u000bm\n\u0007\u0013<d\u00041wO\u0001%", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/\u0015w ;LGDgC\u001e#>", "2qPD6(KS(p~m/g\u0005>hG\raPH\u001f\f;", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0016$C\u0002W\u001ar#8Y\\-3\u007f\u0004,WN;A\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001cz9#\u0012g\u0012J2ZN7=1nS&3\u0013,\u001fh7q\u007f\u0019 \u00124}:@`\u0018R\u0004#u\u000b9l\u0010ih}V\u000b$b3r\u0010n12!6-\u0013~#\u001fg\u001a,\u0014\u0005b\u0011{aCtgUbXB-?q]VRkd@~0t0`^\u000e;W\u00025x,\u0017}(@l\u0010Uu\u0018\bn|^3XU16E\u0006y;_m\u0006{\u001c\u0018r,`\f\u0017^D1';)JD\u0018\u0006j!_4t)~AZ\u0011HWo^7JHAhu'Re1iw6C)d\b)F", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Tooltip_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:159:0x03a2 A[PHI: r9
  0x03a2: PHI (r9v6 androidx.compose.runtime.Composer) = (r9v0 androidx.compose.runtime.Composer), (r9v8 androidx.compose.runtime.Composer) binds: [B:19:0x0074, B:21:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: PlainTooltip-7QI4Sbk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m2862PlainTooltip7QI4Sbk(final androidx.compose.material3.TooltipScope r28, androidx.compose.ui.Modifier r29, long r30, androidx.compose.ui.graphics.Shape r32, long r33, long r35, float r37, float r38, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r39, androidx.compose.runtime.Composer r40, final int r41, final int r42) {
        /*
            Method dump skipped, instruction units count: 1011
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.Tooltip_androidKt.m2862PlainTooltip7QI4Sbk(androidx.compose.material3.TooltipScope, androidx.compose.ui.Modifier, long, androidx.compose.ui.graphics.Shape, long, long, float, float, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: RichTooltip-yDvdmqw, reason: not valid java name */
    public static final void m2863RichTooltipyDvdmqw(final TooltipScope tooltipScope, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, long j2, Shape shape, RichTooltipColors richTooltipColors, float f2, float f3, final Function2<? super Composer, ? super Integer, Unit> function23, Composer composer, final int i2, final int i3) {
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function24;
        Modifier modifierThen;
        float fM3489getContainerElevationD9Ej5fM = f3;
        float fM3191getLevel0D9Ej5fM = f2;
        long jM6745getUnspecifiedMYxV2XQ = j2;
        RichTooltipColors richTooltipColors2 = richTooltipColors;
        Function2<? super Composer, ? super Integer, Unit> function25 = function2;
        Shape richTooltipContainerShape = shape;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(1867454921);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(RichTooltip)P(3,7!1,1:c#ui.unit.DpSize,5!1,8:c#ui.unit.Dp,4:c#ui.unit.Dp)255@9959L25,257@10034L19,*148@5873L7,150@5944L11,150@5956L61,178@6991L1595,167@6622L1964:Tooltip.android.kt#uh7d8r");
        if ((Integer.MIN_VALUE + i3) - (Integer.MIN_VALUE | i3) != 0) {
            i4 = (-1) - (((-1) - i2) & ((-1) - 6));
        } else if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            int i5 = (i2 & 8) == 0 ? composerStartRestartGroup.changed(tooltipScope) : composerStartRestartGroup.changedInstance(tooltipScope) ? 4 : 2;
            i4 = (i5 + i2) - (i5 & i2);
        } else {
            i4 = i2;
        }
        int i6 = (i3 + 1) - (i3 | 1);
        if (i6 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 48));
        } else if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            int i7 = composerStartRestartGroup.changed(companion) ? 32 : 16;
            i4 = (i4 + i7) - (i4 & i7);
        }
        int i8 = (i3 + 2) - (i3 | 2);
        if (i8 != 0) {
            i4 = (i4 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i4 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i2 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function25) ? 256 : 128;
        }
        int i9 = i3 & 4;
        if (i9 != 0) {
            i4 |= 3072;
        } else if ((-1) - (((-1) - i2) | ((-1) - 3072)) == 0) {
            int i10 = composerStartRestartGroup.changedInstance(function22) ? 2048 : 1024;
            i4 = (i4 + i10) - (i4 & i10);
        }
        if ((-1) - (((-1) - i2) | ((-1) - 24576)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (((i3 & 8) == 0 && composerStartRestartGroup.changed(jM6745getUnspecifiedMYxV2XQ)) ? 16384 : 8192)));
        }
        if ((ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE + i2) - (196608 | i2) == 0) {
            i4 |= ((-1) - (((-1) - i3) | ((-1) - 16)) == 0 && composerStartRestartGroup.changed(richTooltipContainerShape)) ? 131072 : 65536;
        }
        if ((i2 + 1572864) - (i2 | 1572864) == 0) {
            i4 |= ((-1) - (((-1) - i3) | ((-1) - 32)) == 0 && composerStartRestartGroup.changed(richTooltipColors2)) ? 1048576 : 524288;
        }
        int i11 = i3 & 64;
        if (i11 != 0) {
            i4 |= 12582912;
        } else if ((i2 + 12582912) - (i2 | 12582912) == 0) {
            i4 |= composerStartRestartGroup.changed(fM3191getLevel0D9Ej5fM) ? 8388608 : 4194304;
        }
        int i12 = (i3 + 128) - (i3 | 128);
        if (i12 != 0) {
            i4 |= 100663296;
        } else if ((-1) - (((-1) - i2) | ((-1) - 100663296)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(fM3489getContainerElevationD9Ej5fM) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432)));
        }
        if ((-1) - (((-1) - i3) | ((-1) - 256)) != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 805306368));
        } else if ((i2 + 805306368) - (i2 | 805306368) == 0) {
            int i13 = composerStartRestartGroup.changedInstance(function23) ? 536870912 : 268435456;
            i4 = (i4 + i13) - (i4 & i13);
        }
        if ((306783379 & i4) == 306783378 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            function24 = function22;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 + 1) - (i2 | 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i6 != 0) {
                    companion = Modifier.Companion;
                }
                if (i8 != 0) {
                    function25 = null;
                }
                function24 = i9 == 0 ? function22 : null;
                if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
                    jM6745getUnspecifiedMYxV2XQ = DpSize.Companion.m6745getUnspecifiedMYxV2XQ();
                    i4 = (i4 - 57345) - (i4 | (-57345));
                }
                if ((i3 & 16) != 0) {
                    richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                    i4 = (i4 - 458753) - (i4 | (-458753));
                }
                if ((i3 & 32) != 0) {
                    richTooltipColors2 = TooltipDefaults.INSTANCE.richTooltipColors(composerStartRestartGroup, 6);
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-3670017)));
                }
                if (i11 != 0) {
                    fM3191getLevel0D9Ej5fM = ElevationTokens.INSTANCE.m3191getLevel0D9Ej5fM();
                }
                if (i12 != 0) {
                    fM3489getContainerElevationD9Ej5fM = RichTooltipTokens.INSTANCE.m3489getContainerElevationD9Ej5fM();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 & 8) != 0) {
                    i4 &= -57345;
                }
                if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-458753)));
                }
                if ((-1) - (((-1) - i3) | ((-1) - 32)) != 0) {
                    i4 &= -3670017;
                }
                function24 = function22;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1867454921, i4, -1, "androidx.compose.material3.RichTooltip (Tooltip.android.kt:147)");
            }
            ProvidableCompositionLocal<Dp> localAbsoluteTonalElevation = SurfaceKt.getLocalAbsoluteTonalElevation();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localAbsoluteTonalElevation);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final long jM1945applyTonalElevationRFCenO8 = ColorSchemeKt.m1945applyTonalElevationRFCenO8(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6), richTooltipColors2.m2417getContainerColor0d7_KjU(), Dp.m6638constructorimpl(((Dp) objConsume).m6652unboximpl() + fM3191getLevel0D9Ej5fM), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(1472746423);
            ComposerKt.sourceInformation(composerStartRestartGroup, "153@6122L7,154@6181L7,155@6220L341");
            if (jM6745getUnspecifiedMYxV2XQ != InlineClassHelperKt.UnspecifiedPackedFloats) {
                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume2 = composerStartRestartGroup.consume(localDensity);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                final Density density = (Density) objConsume2;
                ProvidableCompositionLocal<Configuration> localConfiguration = AndroidCompositionLocals_androidKt.getLocalConfiguration();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume3 = composerStartRestartGroup.consume(localConfiguration);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                final Configuration configuration = (Configuration) objConsume3;
                Modifier.Companion companion2 = Modifier.Companion;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1472751513, "CC(remember):Tooltip.android.kt#9igjgp");
                int i14 = (-1) - (((-1) - ((-1) - (((-1) - (composerStartRestartGroup.changed(density) ? 1 : 0)) & ((-1) - (composerStartRestartGroup.changedInstance(configuration) ? 1 : 0))) != 1 ? 0 : 1)) & ((-1) - (composerStartRestartGroup.changed(jM1945applyTonalElevationRFCenO8) ? 1 : 0))) != 1 ? 0 : 1;
                int i15 = (((((-1) - (((-1) - 57344) | ((-1) - i4))) ^ 24576) <= 16384 || !composerStartRestartGroup.changed(jM6745getUnspecifiedMYxV2XQ)) && (24576 & i4) != 16384) ? 0 : 1;
                int i16 = (i14 + i15) - (i14 & i15);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (i16 != 0 || objRememberedValue == Composer.Companion.getEmpty()) {
                    final long j3 = jM6745getUnspecifiedMYxV2XQ;
                    objRememberedValue = (Function2) new Function2<CacheDrawScope, LayoutCoordinates, DrawResult>() { // from class: androidx.compose.material3.Tooltip_androidKt$RichTooltip$drawCaretModifier$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final DrawResult invoke(CacheDrawScope cacheDrawScope, LayoutCoordinates layoutCoordinates) {
                            return Tooltip_androidKt.m2865drawCaretWithPathJKumZY(cacheDrawScope, CaretType.Rich, density, configuration, jM1945applyTonalElevationRFCenO8, j3, layoutCoordinates);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                modifierThen = tooltipScope.drawCaret(companion2, (Function2) objRememberedValue).then(companion);
            } else {
                modifierThen = companion;
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM1067sizeInqDBjuR0$default = SizeKt.m1067sizeInqDBjuR0$default(modifierThen, TooltipKt.getTooltipMinWidth(), TooltipKt.getTooltipMinHeight(), TooltipKt.getRichTooltipMaxWidth(), 0.0f, 8, null);
            long jM2417getContainerColor0d7_KjU = richTooltipColors2.m2417getContainerColor0d7_KjU();
            final Function2<? super Composer, ? super Integer, Unit> function26 = function25;
            final Function2<? super Composer, ? super Integer, Unit> function27 = function24;
            final RichTooltipColors richTooltipColors3 = richTooltipColors2;
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(317290958, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.Tooltip_androidKt$RichTooltip$1
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
                    ComposerKt.sourceInformation(composer2, "C179@7066L5,180@7133L5,181@7210L5,183@7225L1355:Tooltip.android.kt#uh7d8r");
                    if ((i17 + 3) - (3 | i17) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(317290958, i17, -1, "androidx.compose.material3.RichTooltip.<anonymous> (Tooltip.android.kt:179)");
                        }
                        TextStyle value = TypographyKt.getValue(RichTooltipTokens.INSTANCE.getActionLabelTextFont(), composer2, 6);
                        TextStyle value2 = TypographyKt.getValue(RichTooltipTokens.INSTANCE.getSubheadFont(), composer2, 6);
                        TextStyle value3 = TypographyKt.getValue(RichTooltipTokens.INSTANCE.getSupportingTextFont(), composer2, 6);
                        Modifier modifierM1020paddingVpY3zN4$default = PaddingKt.m1020paddingVpY3zN4$default(Modifier.Companion, TooltipKt.getRichTooltipHorizontalPadding(), 0.0f, 2, null);
                        Function2<Composer, Integer, Unit> function28 = function26;
                        Function2<Composer, Integer, Unit> function29 = function27;
                        RichTooltipColors richTooltipColors4 = richTooltipColors3;
                        Function2<Composer, Integer, Unit> function210 = function23;
                        ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer2, 0);
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
                        Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                        if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer2, -459254051, "C193@7718L319:Tooltip.android.kt#uh7d8r");
                        composer2.startReplaceGroup(955016030);
                        ComposerKt.sourceInformation(composer2, "*185@7347L344");
                        if (function28 != null) {
                            Modifier modifierM873paddingFromBaselineVpY3zN4$default = AlignmentLineKt.m873paddingFromBaselineVpY3zN4$default(Modifier.Companion, TooltipKt.getHeightToSubheadFirstLine(), 0.0f, 2, null);
                            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierM873paddingFromBaselineVpY3zN4$default);
                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor2);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM3671constructorimpl2 = Updater.m3671constructorimpl(composer2);
                            Updater.m3678setimpl(composerM3671constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                            Updater.m3678setimpl(composerM3671constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                            if (composerM3671constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM3671constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM3671constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m3678setimpl(composerM3671constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer2, 1468424960, "C186@7446L227:Tooltip.android.kt#uh7d8r");
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m4168boximpl(richTooltipColors4.m2419getTitleContentColor0d7_KjU())), TextKt.getLocalTextStyle().provides(value2)}, function28, composer2, ProvidedValue.$stable);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            Unit unit = Unit.INSTANCE;
                            Unit unit2 = Unit.INSTANCE;
                        }
                        composer2.endReplaceGroup();
                        Modifier modifierTextVerticalPadding = TooltipKt.textVerticalPadding(Modifier.Companion, function28 != null, function29 != null);
                        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierTextVerticalPadding);
                        Function0<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor3);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM3671constructorimpl3 = Updater.m3671constructorimpl(composer2);
                        Updater.m3678setimpl(composerM3671constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.m3678setimpl(composerM3671constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                        if (composerM3671constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            composerM3671constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM3671constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m3678setimpl(composerM3671constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer2, -1959181329, "C194@7812L211:Tooltip.android.kt#uh7d8r");
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m4168boximpl(richTooltipColors4.m2418getContentColor0d7_KjU())), TextKt.getLocalTextStyle().provides(value3)}, function210, composer2, ProvidedValue.$stable);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.startReplaceGroup(955039618);
                        ComposerKt.sourceInformation(composer2, "*201@8080L476");
                        if (function29 != null) {
                            Modifier modifierM1022paddingqDBjuR0$default = PaddingKt.m1022paddingqDBjuR0$default(SizeKt.m1054requiredHeightInVpY3zN4$default(Modifier.Companion, TooltipKt.getActionLabelMinHeight(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, TooltipKt.getActionLabelBottomPadding(), 7, null);
                            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierM1022paddingqDBjuR0$default);
                            Function0<ComposeUiNode> constructor4 = ComposeUiNode.Companion.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor4);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM3671constructorimpl4 = Updater.m3671constructorimpl(composer2);
                            Updater.m3678setimpl(composerM3671constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
                            Updater.m3678setimpl(composerM3671constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                            if (composerM3671constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                composerM3671constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                composerM3671constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                            }
                            Updater.m3678setimpl(composerM3671constructorimpl4, modifierMaterializeModifier4, ComposeUiNode.Companion.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer2, 1469278235, "C206@8306L232:Tooltip.android.kt#uh7d8r");
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m4168boximpl(richTooltipColors4.m2416getActionContentColor0d7_KjU())), TextKt.getLocalTextStyle().provides(value)}, function29, composer2, ProvidedValue.$stable);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            Unit unit3 = Unit.INSTANCE;
                            Unit unit4 = Unit.INSTANCE;
                        }
                        composer2.endReplaceGroup();
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
            int i17 = (-1) - (((-1) - ((-1) - (((-1) - (i4 >> 12)) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)))) & ((-1) - 12582912));
            int i18 = i4 >> 9;
            int i19 = 57344 & i18;
            int i20 = (i17 + i19) - (i17 & i19);
            int i21 = i18 & 458752;
            SurfaceKt.m2561SurfaceT9BRK9s(modifierM1067sizeInqDBjuR0$default, richTooltipContainerShape, jM2417getContainerColor0d7_KjU, 0L, fM3191getLevel0D9Ej5fM, fM3489getContainerElevationD9Ej5fM, null, composableLambdaRememberComposableLambda, composerStartRestartGroup, (i20 + i21) - (i20 & i21), 72);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Shape shape2 = richTooltipContainerShape;
            final RichTooltipColors richTooltipColors4 = richTooltipColors2;
            final float f4 = fM3191getLevel0D9Ej5fM;
            final float f5 = fM3489getContainerElevationD9Ej5fM;
            final Modifier modifier2 = companion;
            final Function2<? super Composer, ? super Integer, Unit> function28 = function25;
            final Function2<? super Composer, ? super Integer, Unit> function29 = function24;
            final long j4 = jM6745getUnspecifiedMYxV2XQ;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.Tooltip_androidKt$RichTooltip$2
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

                public final void invoke(Composer composer2, int i22) {
                    Tooltip_androidKt.m2863RichTooltipyDvdmqw(tooltipScope, modifier2, function28, function29, j4, shape2, richTooltipColors4, f4, f5, function23, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: drawCaretWithPath-JKu-mZY, reason: not valid java name */
    public static final DrawResult m2865drawCaretWithPathJKumZY(CacheDrawScope cacheDrawScope, CaretType caretType, Density density, Configuration configuration, final long j2, long j3, final LayoutCoordinates layoutCoordinates) {
        long jOffset;
        final Path Path = AndroidPath_androidKt.Path();
        if (layoutCoordinates != null) {
            int iMo704roundToPx0680j_4 = density.mo704roundToPx0680j_4(DpSize.m6734getHeightD9Ej5fM(j3));
            int iMo704roundToPx0680j_42 = density.mo704roundToPx0680j_4(DpSize.m6736getWidthD9Ej5fM(j3));
            int iMo704roundToPx0680j_43 = density.mo704roundToPx0680j_4(Dp.m6638constructorimpl(configuration.screenWidthDp));
            int iMo704roundToPx0680j_44 = density.mo704roundToPx0680j_4(TooltipKt.getSpacingBetweenTooltipAndAnchor());
            Rect rectBoundsInWindow = LayoutCoordinatesKt.boundsInWindow(layoutCoordinates);
            float left = rectBoundsInWindow.getLeft();
            float right = rectBoundsInWindow.getRight();
            float top = rectBoundsInWindow.getTop();
            float f2 = 2;
            float f3 = (right + left) / f2;
            float f4 = right - left;
            float fM4006getWidthimpl = Size.m4006getWidthimpl(cacheDrawScope.m3827getSizeNHjbRc());
            float fM4003getHeightimpl = Size.m4003getHeightimpl(cacheDrawScope.m3827getSizeNHjbRc());
            boolean z2 = (top - fM4003getHeightimpl) - ((float) iMo704roundToPx0680j_44) < 0.0f;
            if (z2) {
                fM4003getHeightimpl = 0.0f;
            }
            if (caretType == CaretType.Plain) {
                float f5 = iMo704roundToPx0680j_43;
                if ((fM4006getWidthimpl / f2) + f3 > f5) {
                    jOffset = OffsetKt.Offset(fM4006getWidthimpl - (f5 - f3), fM4003getHeightimpl);
                } else {
                    jOffset = OffsetKt.Offset(f3 - Math.max(left - ((Size.m4006getWidthimpl(cacheDrawScope.m3827getSizeNHjbRc()) / f2) - (f4 / f2)), 0.0f), fM4003getHeightimpl);
                }
            } else {
                jOffset = OffsetKt.Offset(f3 - left, fM4003getHeightimpl);
                float f6 = iMo704roundToPx0680j_43;
                if (left + fM4006getWidthimpl > f6) {
                    float f7 = right - fM4006getWidthimpl;
                    jOffset = OffsetKt.Offset(f3 - f7, fM4003getHeightimpl);
                    if (f7 < 0.0f) {
                        float f8 = fM4006getWidthimpl / f2;
                        float f9 = f4 / f2;
                        if ((left - f8) + f9 <= 0.0f) {
                            jOffset = OffsetKt.Offset(f3, fM4003getHeightimpl);
                        } else if ((right + f8) - f9 >= f6) {
                            jOffset = OffsetKt.Offset(fM4006getWidthimpl - (f6 - f3), fM4003getHeightimpl);
                        } else {
                            jOffset = OffsetKt.Offset(f8, fM4003getHeightimpl);
                        }
                    }
                }
            }
            if (z2) {
                Path.moveTo(Offset.m3937getXimpl(jOffset), Offset.m3938getYimpl(jOffset));
                float f10 = iMo704roundToPx0680j_42 / 2;
                Path.lineTo(Offset.m3937getXimpl(jOffset) + f10, Offset.m3938getYimpl(jOffset));
                Path.lineTo(Offset.m3937getXimpl(jOffset), Offset.m3938getYimpl(jOffset) - iMo704roundToPx0680j_4);
                Path.lineTo(Offset.m3937getXimpl(jOffset) - f10, Offset.m3938getYimpl(jOffset));
                Path.close();
            } else {
                Path.moveTo(Offset.m3937getXimpl(jOffset), Offset.m3938getYimpl(jOffset));
                float f11 = iMo704roundToPx0680j_42 / 2;
                Path.lineTo(Offset.m3937getXimpl(jOffset) + f11, Offset.m3938getYimpl(jOffset));
                Path.lineTo(Offset.m3937getXimpl(jOffset), Offset.m3938getYimpl(jOffset) + iMo704roundToPx0680j_4);
                Path.lineTo(Offset.m3937getXimpl(jOffset) - f11, Offset.m3938getYimpl(jOffset));
                Path.close();
            }
        }
        return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.material3.Tooltip_androidKt$drawCaretWithPath$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ContentDrawScope contentDrawScope) {
                if (layoutCoordinates != null) {
                    contentDrawScope.drawContent();
                    DrawScope.m4724drawPathLG529CI$default(contentDrawScope, Path, j2, 0.0f, null, null, 0, 60, null);
                }
            }
        });
    }
}
