package androidx.compose.material3;

import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material3.tokens.PrimaryNavigationTabTokens;
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
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.braze.models.inappmessage.InAppMessageBase;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import java.util.List;
import java.util.NoSuchElementException;
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
/* JADX INFO: compiled from: Tab.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яr\u001d̉=!4i\bDJf|\u0004W\u00068\u000b4E\u0007\":\u0018\u007f\u0007llA0ReP\u008cZS8\u0018sڔ<$q$yّCU0}*\tUNog\u0005Jb\u000bI\u000f\u000e\u0016\u000fj4I[xe\u0012%2JoE7UoS9htL\u0005(288\u0002\u0005\u0007\"2H&v\u0003ŏS\f(0H\u0081BR#M\r\u001a\u0018\rVī\u007f,k\u007fNdX\u001daH@;\u0003\u0018T~1mC\u0015S\u001dHd';\u0007\u00102[OEJ-0c\u0005\u0017R\nO1SџA\u0005n=W:W\u000boAh\u0002$\u0015Y_;qę*\\\u000bg\u0011\u0012-+]{cP<A(\u0001\u0002\rJ\u001e&\u0006UZ^3 f\u0016)Kt!opV\b^P\u001d\u0013ad3U\b9+G9~Sw:Gm}\u0001͕\f̔ţ\u0005p'{b/xڈ\u001ab\u001ai1\u007fPmL\\\u001bq=\u001c\u0016!l\u0010=\u001c6W\u0002?{?>E9ga?#/\u0004\u001aHr\u0001'\u000bfha\u0004jHn4\u001f)=*\u0017!rQt\u0007{P\u0003hB\u0010{0Τ\u000b}\u000e)Po}</<([_jyj{m $]zƠ]nq$\b?d3Cl{\u0010\u0010n'\u001aE<p\"pfpo<bb(0P`l&v*c\u0015\u0011ȇ1ŭۇ 62T'\u0001-A\u0011@ZA+\u0019\u0010^v!\u0017Ta63s2\b!\u0007`^\u0001o\u0016\tw@-f(-OiM\u0019TnRn:|1!\u0017s.Y\u0018RMLz1\u000eU*<F ?Q=Z+\u000f-Eb\n3EZ\u0011}Sc\u0011U\u001a-\u0014\u001d`\u0001Dw\nzpZ\bzL_TE2%\u0005ѓ'\bj\u0016\u05fbeF\u0001o*Y¤ZŬϗv\u0005_e\\b\u0015:-I=\u0001\u001e2-F;X?*&y$/Cqsh\u001eBԃf\u000f,\u000b\u0016\u0015:z.|rSm2iH_X-Rѐ(l\tX\u000fk͎\fB\u0017`%nVn|p\u0005H}\u000f=,~\u0007Z)!Zii+o,P^c8\u0005[}Bps4\u001frkr}o[\\9Z=\u001eν\u007f1t(b>\u05ebṴť\r2\f$&gY}p7T\tRDT<6>sXw:(z.{\u0010\u0013%hZsi\u000e>X\u0007\u0015nH3\u0018ud/c\u0019~=>N|Ck\u001dmt__g@<k\u001d7&\u001bS\r#=+r_\u007f\u001b@r\u000fH]]qY*62zYqy.$8F4MF&UQQ?j=0~\u0019c̤fd%\u0011=ŝPĀ-\u0001\u0003|\u001c<*#\u0019\u001agr\u001ea\u0004ٌPߺ;K\"\u0001%DA\t\u0012~qI;;\u00149E=wojՠ}\u009cW=\u0006\b.&G\u0012\u0003(tW<e`܄\u001dƐ\u001as\u001eb\u0010\t3^.\fFJ#q`ڗ\n˩S\u0004;\u0002!^yy\u0006*X'Yk\\ןMи|\fklqnu\u0017\u0011pIV(y\u0004ǣoԷ+M6߾xfH\u001dk \u0007\u001cVǷgӔ#6\u0010ӳI\u001c]p\u0001p\u001aZ2Á}Խo*iɵP`,\f7y$\u0003\u0001ė*נ?XU>r\tϡlG_\u0011dɇD\u0013s\u05ec-Sό\u0003PlQ+4t\u000ftҖӺ7"}, d2 = {"\u0012nd/_,%W\"~i^?\fe+s\u007f/\u007fI\u0001\t\u001bVrq:\u0001.", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "\u0014", "\u0016na6m6Gb\u0015\u0006i^?\fs+d~,\u0005B", "5dc\u0015b9Bh#\b\nZ3k\tBtj$z?\u0005 \u0019", "u(5", "\u0017b^;70Lb\u0015\bx^\r\n\u00137B{6{G\u0005 \u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9|<\n4%b\u0002/\r", "\u0018", "\u001a`a4X\u001b:P{~~`/\f", "!h]4_,%W\"~i^?\fe+s\u007f/\u007fI\u0001\t\u001bVrq:\u0001.", "!lP9_\u001b:P{~~`/\f", "\"`Q\u0013T+>7\"Z\u0004b4x\u00183o\t\u0007{G|+", "", "\"`Q\u0013T+>7\"Z\u0004b4x\u00183o\t\u0007\fM|&\u001bQx", "\"`Q\u0013T+>=)\u000eVg0\u0005\u0005>i\n1ZP\u000e\u0013&Ky\u0017", "\"dgA70Lb\u0015\bx^\r\n\u00137L\u007f$zD\n\u0019zEy\u0017", "\u001adP1\\5@7\u0017\t\u0004M(y", "", "Ad[2V;>R", "", "=m29\\*D", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "BdgA", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "7b^;", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "3mP/_,=", "Ad[2V;>Rv\t\u0004m,\u0006\u0018\ro\u00072\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "Cmb2_,<b\u0019}Xh5\f\t8t]2\u0003J\u000e", "7mc2e(<b\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005SD-\u0011eh9jl;N\u0004#E[R6e@|M!\u0010Zc", "\u001adP1\\5@7\u0017\t\u0004M(yPAq~(x$p", "uY;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHu\u001es =TGD59/\u001d2bI\u0010a;R\u00010U\u0016/<eP\u0002A\u001e\u001b'c51\u0017\u0014`E-8IH'Q-Y\u000b9w\u0005\u0016\u001f\u001c~K\u0001KT\u001fK\u0004\u001eB\u0017\u0010dOXl\u0004K@X,(n\u0014j'j:\u00044\u0018;\u0001%gT/\u000e{`fg7^NcP\u0018\bB(=\u0001%DOw`F\u0003'hL\u0006\b\u001b1T\u0004/~6M83Ed\u0012Ge'Bh\u0002^\u0014lP##=<vHZc\u0003h<\u001dl)ju\u0018rB/\u0019;L_Q\u000e\u0014g\u001bZH+]\u000b?]\u0010LI9\"7O\u000eFcy^f\u0011,xoWC(*d}45", "\"`Q", "\"`Qyj8=S\u0016bj", "uY;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHu\u001ei\u001f-ZM?jGg\u0013riD\u0011q,\u0018\u0007+\u00114X+`Sv=!gOtT5\u001c\f]JmsU?h\t<R\u007fJl\u000b\u0015$W\u0016zy@e\u0014Q\u0003aK(/rU`c\u0003\u0011FVjse\u001ch\u001bk>D-\";y+qN=\u000e\u0006\\]H7^NcP\u0018\bB(=\u0001%DOw`F\u0003'hL\u0006\b\u001b1T\u0004/~6M83Ed\u0012Ge'Bh\u0002^\u0014lP##=<vHZc\u0003h<\u001dl)ju\u0018rB/\u0019;L_Q\u000e\u0014g\u001bZH+]\u000b?]\u0010LI9\"7O\u000eFcy^f\u0011,xoWC(*d}45", "1n]AX5M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7s8TSCt\"\u001c\u001fsa\u000f", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "\"`QyU6@D'Z|", "uY;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHu\u001ei\u001f-ZM?jGg\u0013riD\u0011q,\u0018\u0007+\u00114X+`Sv=!gOr3\u0012\t\u000eXN.rCJh\u00066Q\rEv\u0001U\u0017\u0018Eso>e\u0014Q\u0003^yJ8hSU]\tKKN,\u0012t\u001b[\u001ac:\u001e-#q&\u0017f_2\u0014\u0005A\u001b\u0003_wg=.\u001f\u0005G+Bv%KVw\u001f=\u00050\u001dZ\u007f\u0002\u001b@\"U;}+\u001384?2Z2c!=k\u0003\u0019+o\u000b%0>G\u001dMK-\u0003|G\u001dl'aQkl=<#sep\u001erj!\b", "\"`Q\u000fT:>Z\u001d\bzE(\u0011\u0013?t", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&S\u0007=w%5QL\u0005pE&^iqB\u0005r0X\u007f5\u0011-^5ZavG\u001d^0tJ4\f\u0012cE#\u0002\u000e5)\u00107S\u0010;2\u000e\u001c\u001f\u001d9rp\f4\u001aO\u0005\u001f\u0004A6>*\u001dP", "\"`Q!e(Ga\u001d\u000e~h5", "/bc6i,\u001c] \t\b", "7mP0g0OSv\t\u0002h9", "\"`Q!e(Ga\u001d\u000e~h5Dn6g\u0013ofB", "uI9'?2Hb \u0003\u0004(1\u000e\u0011xf\u00101yO\u0005! U9nL\u007f#D]\b)\u0004C|*VBHu8\u001d(2_C\u000fn6\\vpT\\W;`Zr\u0007q\u001cb\u0019X9\r\u0012/%g_", ">kP0X\u001b>f(Z\u0004]\u0010z\u00138", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016l8J7i4&\u0015qp'\u0005m7NL", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "BdgAC3:Q\u0019zwe,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016\u0004", "7b^;C3:Q\u0019zwe,", "B`Q$\\+MV", "B`Q\u0015X0@V(", "4ha@g\t:a\u0019\u0006~g,", ":`bA5(LS \u0003\u0004^", ">kP0X\u001b>f(h\bB*\u0007\u0012", "BdgAB9\"Q#\bee(z\t+b\u0007(", ";`c2e0:Zfx\b^3|\u0005=e", "1n[<e"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TabKt {
    private static final int TabFadeInAnimationDelay = 100;
    private static final int TabFadeInAnimationDuration = 150;
    private static final int TabFadeOutAnimationDuration = 100;
    private static final float SmallTabHeight = PrimaryNavigationTabTokens.INSTANCE.m3478getContainerHeightD9Ej5fM();
    private static final float LargeTabHeight = Dp.m6638constructorimpl(72);
    private static final float HorizontalTextPadding = Dp.m6638constructorimpl(16);
    private static final float SingleLineTextBaselineWithIcon = Dp.m6638constructorimpl(14);
    private static final float DoubleLineTextBaselineWithIcon = Dp.m6638constructorimpl(6);
    private static final long IconDistanceFromBaseline = TextUnitKt.getSp(20);
    private static final float TextDistanceFromLeadingIcon = Dp.m6638constructorimpl(8);

    /* JADX INFO: renamed from: Tab-wqdebIU, reason: not valid java name */
    public static final void m2597TabwqdebIU(boolean z2, Function0<Unit> function0, Modifier modifier, boolean z3, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, long j2, long j3, MutableInteractionSource mutableInteractionSource, Composer composer, final int i2, final int i3) {
        int i4;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        long j4 = j3;
        long jM4188unboximpl = j2;
        final Function2<? super Composer, ? super Integer, Unit> function23 = function22;
        final Function2<? super Composer, ? super Integer, Unit> function24 = function2;
        boolean z4 = z3;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-350627181);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Tab)P(5,4,3!1,7!1,6:c#ui.graphics.Color,8:c#ui.graphics.Color)99@4483L7,121@5133L65,113@4964L234:Tab.kt#uh7d8r");
        boolean z5 = z2;
        if ((i3 + 1) - (i3 | 1) != 0) {
            i4 = (-1) - (((-1) - i2) & ((-1) - 6));
        } else if ((i2 + 6) - (i2 | 6) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            i4 = (-1) - (((-1) - (composerStartRestartGroup.changed(z5) ? 4 : 2)) & ((-1) - i2));
        } else {
            i4 = i2;
        }
        Function0<Unit> function02 = function0;
        if ((i3 + 2) - (i3 | 2) != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 48));
        } else if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            int i5 = composerStartRestartGroup.changedInstance(function02) ? 32 : 16;
            i4 = (i4 + i5) - (i4 & i5);
        }
        int i6 = i3 & 4;
        if (i6 != 0) {
            i4 = (i4 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i4 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i2 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(companion) ? 256 : 128)));
        }
        int i7 = i3 & 8;
        if (i7 != 0) {
            i4 = (i4 + 3072) - (i4 & 3072);
        } else if ((-1) - (((-1) - i2) | ((-1) - 3072)) == 0) {
            i4 |= composerStartRestartGroup.changed(z4) ? 2048 : 1024;
        }
        int i8 = (-1) - (((-1) - i3) | ((-1) - 16));
        if (i8 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 24576));
        } else if ((-1) - (((-1) - i2) | ((-1) - 24576)) == 0) {
            int i9 = composerStartRestartGroup.changedInstance(function24) ? 16384 : 8192;
            i4 = (i4 + i9) - (i4 & i9);
        }
        int i10 = i3 & 32;
        if (i10 != 0) {
            i4 = (i4 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        } else if ((ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE + i2) - (196608 | i2) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function23) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 |= ((-1) - (((-1) - i3) | ((-1) - 64)) == 0 && composerStartRestartGroup.changed(jM4188unboximpl)) ? 1048576 : 524288;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 12582912)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (((i3 + 128) - (i3 | 128) == 0 && composerStartRestartGroup.changed(j4)) ? 8388608 : 4194304)));
        }
        int i11 = (i3 + 256) - (i3 | 256);
        if (i11 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 100663296));
        } else if ((i2 + 100663296) - (i2 | 100663296) == 0) {
            i4 |= composerStartRestartGroup.changed(mutableInteractionSource2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i4 & 38347923) != 38347922 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((-1) - (((-1) - i2) | ((-1) - 1)) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i6 != 0) {
                    companion = Modifier.Companion;
                }
                if (i7 != 0) {
                    z4 = true;
                }
                if (i8 != 0) {
                    function24 = null;
                }
                if (i10 != 0) {
                    function23 = null;
                }
                if ((i3 + 64) - (i3 | 64) != 0) {
                    ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object objConsume = composerStartRestartGroup.consume(localContentColor);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    jM4188unboximpl = ((Color) objConsume).m4188unboximpl();
                    i4 &= -3670017;
                }
                if ((i3 & 128) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-29360129)));
                    j4 = jM4188unboximpl;
                }
                if (i11 != 0) {
                    mutableInteractionSource2 = null;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 + 64) - (i3 | 64) != 0) {
                    i4 &= -3670017;
                }
                if ((i3 + 128) - (i3 | 128) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-29360129)));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-350627181, i4, -1, "androidx.compose.material3.Tab (Tab.kt:102)");
            }
            composerStartRestartGroup.startReplaceGroup(79583089);
            ComposerKt.sourceInformation(composerStartRestartGroup, "*105@4702L247");
            final ComposableLambda composableLambdaRememberComposableLambda = function24 != null ? ComposableLambdaKt.rememberComposableLambda(708874428, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabKt$Tab$styledText$1$1
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

                public final void invoke(Composer composer2, int i12) {
                    ComposerKt.sourceInformation(composer2, "C107@4793L5,110@4896L39:Tab.kt#uh7d8r");
                    if ((-1) - (((-1) - i12) | ((-1) - 3)) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(708874428, i12, -1, "androidx.compose.material3.Tab.<anonymous>.<anonymous> (Tab.kt:106)");
                    }
                    TextKt.ProvideTextStyle(TextStyle.m6136copyp1EtxEg$default(TypographyKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getLabelTextFont(), composer2, 6), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.Companion.m6527getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), function24, composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54) : null;
            composerStartRestartGroup.endReplaceGroup();
            ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(1540996038, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabKt$Tab$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                    invoke(columnScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(ColumnScope columnScope, Composer composer2, int i12) {
                    ComposerKt.sourceInformation(composer2, "C122@5143L49:Tab.kt#uh7d8r");
                    if ((i12 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1540996038, i12, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:122)");
                    }
                    TabKt.TabBaselineLayout(composableLambdaRememberComposableLambda, function23, composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54);
            int i12 = (-1) - (((-1) - i4) | ((-1) - 14));
            int i13 = ((-1) - (((-1) - (((i12 + 12582912) - (i12 & 12582912)) | ((i4 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (112 | i4)))) & ((-1) - (896 & i4)))) | ((i4 + 7168) - (7168 | i4));
            int i14 = i4 >> 6;
            int i15 = (-1) - (((-1) - i13) & ((-1) - ((57344 + i14) - (57344 | i14))));
            int i16 = (458752 + i14) - (458752 | i14);
            z5 = z5;
            function02 = function02;
            m2596TabbogVsAg(z5, function02, companion, z4, jM4188unboximpl, j4, mutableInteractionSource2, composableLambdaRememberComposableLambda2, composerStartRestartGroup, (-1) - (((-1) - ((i15 + i16) - (i15 & i16))) & ((-1) - (i14 & 3670016))), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Function2<? super Composer, ? super Integer, Unit> function25 = function24;
            final Function2<? super Composer, ? super Integer, Unit> function26 = function23;
            final long j5 = jM4188unboximpl;
            final long j6 = j4;
            final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
            final boolean z6 = z5;
            final Function0<Unit> function03 = function02;
            final Modifier modifier2 = companion;
            final boolean z7 = z4;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabKt$Tab$2
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
                    TabKt.m2597TabwqdebIU(z6, function03, modifier2, z7, function25, function26, j5, j6, mutableInteractionSource3, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
    }

    /* JADX INFO: renamed from: LeadingIconTab-wqdebIU, reason: not valid java name */
    public static final void m2595LeadingIconTabwqdebIU(final boolean z2, final Function0<Unit> function0, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Modifier modifier, boolean z3, long j2, long j3, MutableInteractionSource mutableInteractionSource, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier.Companion companion = modifier;
        long j4 = j3;
        long jM4188unboximpl = j2;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        boolean z4 = z3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-777316544);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(LeadingIconTab)P(5,4,7,1,3!1,6:c#ui.graphics.Color,8:c#ui.graphics.Color)164@7036L7,171@7399L76,173@7551L950,173@7481L1020:Tab.kt#uh7d8r");
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            i4 = (i2 + 6) - (i2 & 6);
        } else if ((i2 + 6) - (i2 | 6) == 0) {
            i4 = (composerStartRestartGroup.changed(z2) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            i4 |= 48;
        } else if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i2 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function2) ? 256 : 128)));
        }
        if ((i3 & 8) != 0) {
            i4 = (i4 + 3072) - (i4 & 3072);
        } else if ((-1) - (((-1) - i2) | ((-1) - 3072)) == 0) {
            int i5 = composerStartRestartGroup.changedInstance(function22) ? 2048 : 1024;
            i4 = (i4 + i5) - (i4 & i5);
        }
        int i6 = i3 & 16;
        if (i6 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 24576));
        } else if ((i2 + 24576) - (i2 | 24576) == 0) {
            i4 |= composerStartRestartGroup.changed(companion) ? 16384 : 8192;
        }
        int i7 = (-1) - (((-1) - i3) | ((-1) - 32));
        if (i7 != 0) {
            i4 = (i4 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        } else if ((ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE + i2) - (196608 | i2) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(z4) ? 131072 : 65536)));
        }
        if ((-1) - (((-1) - 1572864) | ((-1) - i2)) == 0) {
            i4 |= ((-1) - (((-1) - i3) | ((-1) - 64)) == 0 && composerStartRestartGroup.changed(jM4188unboximpl)) ? 1048576 : 524288;
        }
        if ((12582912 + i2) - (12582912 | i2) == 0) {
            int i8 = ((i3 + 128) - (i3 | 128) == 0 && composerStartRestartGroup.changed(j4)) ? 8388608 : 4194304;
            i4 = (i4 + i8) - (i4 & i8);
        }
        int i9 = (-1) - (((-1) - i3) | ((-1) - 256));
        if (i9 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 100663296));
        } else if ((100663296 + i2) - (100663296 | i2) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(mutableInteractionSource2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432)));
        }
        if ((-1) - (((-1) - i4) | ((-1) - 38347923)) != 38347922 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i2 + 1) - (i2 | 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i6 != 0) {
                    companion = Modifier.Companion;
                }
                if (i7 != 0) {
                    z4 = true;
                }
                if ((i3 + 64) - (i3 | 64) != 0) {
                    ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object objConsume = composerStartRestartGroup.consume(localContentColor);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    jM4188unboximpl = ((Color) objConsume).m4188unboximpl();
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-3670017)));
                }
                if ((-1) - (((-1) - i3) | ((-1) - 128)) != 0) {
                    i4 = (-29360129) & i4;
                    j4 = jM4188unboximpl;
                }
                if (i9 != 0) {
                    mutableInteractionSource2 = null;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 & 64) != 0) {
                    i4 = (i4 - 3670017) - (i4 | (-3670017));
                }
                if ((i3 + 128) - (i3 | 128) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-29360129)));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-777316544, i4, -1, "androidx.compose.material3.LeadingIconTab (Tab.kt:167)");
            }
            int i10 = i4 >> 12;
            final Indication indicationM2425rippleOrFallbackImplementation9IZ8Weo = RippleKt.m2425rippleOrFallbackImplementation9IZ8Weo(true, 0.0f, jM4188unboximpl, composerStartRestartGroup, ((i10 + 896) - (i10 | 896)) | 6, 2);
            Modifier modifier2 = companion;
            final Modifier modifier3 = companion;
            final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
            final boolean z5 = z4;
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-429037564, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabKt$LeadingIconTab$1
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

                public final void invoke(Composer composer2, int i11) {
                    ComposerKt.sourceInformation(composer2, "C174@7561L934:Tab.kt#uh7d8r");
                    if ((3 & i11) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-429037564, i11, -1, "androidx.compose.material3.LeadingIconTab.<anonymous> (Tab.kt:174)");
                        }
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m1020paddingVpY3zN4$default(SelectableKt.m1269selectableO2vRcR0(SizeKt.m1049height3ABfNKs(modifier3, TabKt.SmallTabHeight), z2, mutableInteractionSource3, indicationM2425rippleOrFallbackImplementation9IZ8Weo, z5, Role.m5926boximpl(Role.Companion.m5939getTabo7Vup1c()), function0), TabKt.getHorizontalTextPadding(), 0.0f, 2, null), 0.0f, 1, null);
                        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                        Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                        Function2<Composer, Integer, Unit> function23 = function22;
                        Function2<Composer, Integer, Unit> function24 = function2;
                        ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer2, 54);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default);
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
                        ComposerKt.sourceInformationMarkerStart(composer2, 2028967152, "C191@8233L6,192@8252L59,194@8393L5,195@8446L39:Tab.kt#uh7d8r");
                        function23.invoke(composer2, 0);
                        SpacerKt.Spacer(SizeKt.m1060requiredWidth3ABfNKs(Modifier.Companion, TabKt.TextDistanceFromLeadingIcon), composer2, 6);
                        TextKt.ProvideTextStyle(TextStyle.m6136copyp1EtxEg$default(TypographyKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getLabelTextFont(), composer2, 6), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.Companion.m6527getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), function24, composer2, 0);
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
            int i11 = i4 >> 18;
            int i12 = (i11 + 14) - (i11 | 14);
            m2598TabTransitionKlgxPg(jM4188unboximpl, j4, z2, composableLambdaRememberComposableLambda, composerStartRestartGroup, ((-1) - (((-1) - i11) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION))) | ((i12 + 3072) - (i12 & 3072)) | ((i4 << 6) & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            companion = modifier2;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final long j5 = j4;
            final MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
            final Modifier modifier4 = companion;
            final boolean z6 = z4;
            final long j6 = jM4188unboximpl;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabKt$LeadingIconTab$2
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
                    TabKt.m2595LeadingIconTabwqdebIU(z2, function0, function2, function22, modifier4, z6, j6, j5, mutableInteractionSource4, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
    }

    /* JADX INFO: renamed from: Tab-bogVsAg, reason: not valid java name */
    public static final void m2596TabbogVsAg(final boolean z2, final Function0<Unit> function0, Modifier modifier, boolean z3, long j2, long j3, MutableInteractionSource mutableInteractionSource, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i2, final int i3) {
        int i4;
        long j4 = j3;
        long jM4188unboximpl = j2;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        boolean z4 = z3;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-202735880);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Tab)P(5,4,3,1,6:c#ui.graphics.Color,7:c#ui.graphics.Color,2)238@10306L7,246@10715L76,248@10867L600,248@10797L670:Tab.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (-1) - (((-1) - (composerStartRestartGroup.changed(z2) ? 4 : 2)) & ((-1) - i2));
        } else {
            i4 = i2;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 48));
        } else if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function0) ? 32 : 16)));
        }
        int i5 = (i3 + 4) - (i3 | 4);
        if (i5 != 0) {
            i4 = (i4 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i4 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            int i6 = composerStartRestartGroup.changed(companion) ? 256 : 128;
            i4 = (i4 + i6) - (i4 & i6);
        }
        int i7 = (-1) - (((-1) - i3) | ((-1) - 8));
        if (i7 != 0) {
            i4 = (i4 + 3072) - (i4 & 3072);
        } else if ((-1) - (((-1) - i2) | ((-1) - 3072)) == 0) {
            int i8 = composerStartRestartGroup.changed(z4) ? 2048 : 1024;
            i4 = (i4 + i8) - (i4 & i8);
        }
        if ((i2 & 24576) == 0) {
            int i9 = ((-1) - (((-1) - i3) | ((-1) - 16)) == 0 && composerStartRestartGroup.changed(jM4188unboximpl)) ? 16384 : 8192;
            i4 = (i4 + i9) - (i4 & i9);
        }
        if ((ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE + i2) - (196608 | i2) == 0) {
            i4 |= ((-1) - (((-1) - i3) | ((-1) - 32)) == 0 && composerStartRestartGroup.changed(j4)) ? 131072 : 65536;
        }
        int i10 = (i3 + 64) - (i3 | 64);
        if (i10 != 0) {
            i4 |= 1572864;
        } else if ((-1) - (((-1) - i2) | ((-1) - 1572864)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(mutableInteractionSource2) ? 1048576 : 524288)));
        }
        if ((i3 & 128) != 0) {
            i4 |= 12582912;
        } else if ((i2 + 12582912) - (i2 | 12582912) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function3) ? 8388608 : 4194304;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 4793491)) != 4793490 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i2 + 1) - (i2 | 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    companion = Modifier.Companion;
                }
                if (i7 != 0) {
                    z4 = true;
                }
                if ((i3 + 16) - (i3 | 16) != 0) {
                    ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object objConsume = composerStartRestartGroup.consume(localContentColor);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    jM4188unboximpl = ((Color) objConsume).m4188unboximpl();
                    i4 &= -57345;
                }
                if ((i3 + 32) - (i3 | 32) != 0) {
                    i4 &= -458753;
                    j4 = jM4188unboximpl;
                }
                if (i10 != 0) {
                    mutableInteractionSource2 = null;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 + 16) - (i3 | 16) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-57345)));
                }
                if ((i3 & 32) != 0) {
                    i4 = (i4 - 458753) - (i4 | (-458753));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-202735880, i4, -1, "androidx.compose.material3.Tab (Tab.kt:242)");
            }
            int i11 = (i4 >> 6) & 896;
            final Indication indicationM2425rippleOrFallbackImplementation9IZ8Weo = RippleKt.m2425rippleOrFallbackImplementation9IZ8Weo(true, 0.0f, jM4188unboximpl, composerStartRestartGroup, (i11 + 6) - (i11 & 6), 2);
            final Modifier modifier2 = companion;
            final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
            final boolean z5 = z4;
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-551896140, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabKt$Tab$3
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

                public final void invoke(Composer composer2, int i12) {
                    ComposerKt.sourceInformation(composer2, "C249@10877L584:Tab.kt#uh7d8r");
                    if ((-1) - (((-1) - i12) | ((-1) - 3)) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-551896140, i12, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:249)");
                        }
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SelectableKt.m1269selectableO2vRcR0(modifier2, z2, mutableInteractionSource3, indicationM2425rippleOrFallbackImplementation9IZ8Weo, z5, Role.m5926boximpl(Role.Companion.m5939getTabo7Vup1c()), function0), 0.0f, 1, null);
                        Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
                        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                        Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                        ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, 54);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default);
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
                        function32.invoke(ColumnScopeInstance.INSTANCE, composer2, 6);
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
            int i12 = i4 >> 12;
            int i13 = (i12 + 14) - (i12 | 14);
            int i14 = (-1) - (((-1) - ((-1) - (((-1) - i12) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)))) & ((-1) - ((i13 + 3072) - (i13 & 3072))));
            int i15 = (i4 << 6) & 896;
            m2598TabTransitionKlgxPg(jM4188unboximpl, j4, z2, composableLambdaRememberComposableLambda, composerStartRestartGroup, (i14 + i15) - (i14 & i15));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
            final long j5 = jM4188unboximpl;
            final long j6 = j4;
            final Modifier modifier3 = companion;
            final boolean z6 = z4;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabKt$Tab$4
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
                    TabKt.m2596TabbogVsAg(z2, function0, modifier3, z6, j5, j6, mutableInteractionSource4, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: TabTransition-Klgx-Pg, reason: not valid java name */
    public static final void m2598TabTransitionKlgxPg(final long j2, final long j3, final boolean z2, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(735731848);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TabTransition)P(0:c#ui.graphics.Color,2:c#ui.graphics.Color,3)280@11898L26,282@11961L548,297@12514L77:Tab.kt#uh7d8r");
        if ((i2 & 6) == 0) {
            int i4 = composerStartRestartGroup.changed(j2) ? 4 : 2;
            i3 = (i4 + i2) - (i4 & i2);
        } else {
            i3 = i2;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            int i5 = composerStartRestartGroup.changed(j3) ? 32 : 16;
            i3 = (i3 + i5) - (i3 & i5);
        }
        if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changed(z2) ? 256 : 128)));
        }
        if ((i2 & 3072) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024)));
        }
        if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(735731848, i3, -1, "androidx.compose.material3.TabTransition (Tab.kt:279)");
            }
            int i6 = i3 >> 6;
            Transition transitionUpdateTransition = TransitionKt.updateTransition(Boolean.valueOf(z2), (String) null, composerStartRestartGroup, (i6 + 14) - (14 | i6), 2);
            TabKt$TabTransition$color$2 tabKt$TabTransition$color$2 = new Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material3.TabKt$TabTransition$color$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<Boolean> segment, Composer composer2, Integer num) {
                    return invoke(segment, composer2, num.intValue());
                }

                public final FiniteAnimationSpec<Color> invoke(Transition.Segment<Boolean> segment, Composer composer2, int i7) {
                    TweenSpec tweenSpecTween$default;
                    composer2.startReplaceGroup(-899623535);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-899623535, i7, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:284)");
                    }
                    if (segment.isTransitioningTo(false, true)) {
                        tweenSpecTween$default = AnimationSpecKt.tween(150, 100, EasingKt.getLinearEasing());
                    } else {
                        tweenSpecTween$default = AnimationSpecKt.tween$default(100, 0, EasingKt.getLinearEasing(), 2, null);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return tweenSpecTween$default;
                }
            };
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
            boolean zBooleanValue = ((Boolean) transitionUpdateTransition.getTargetState()).booleanValue();
            composerStartRestartGroup.startReplaceGroup(-1997025499);
            ComposerKt.sourceInformation(composerStartRestartGroup, "C:Tab.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1997025499, 0, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:295)");
            }
            long j4 = zBooleanValue ? j2 : j3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            ColorSpace colorSpaceM4182getColorSpaceimpl = Color.m4182getColorSpaceimpl(j4);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1918408083, "CC(remember):Transition.kt#9igjgp");
            boolean zChanged = composerStartRestartGroup.changed(colorSpaceM4182getColorSpaceimpl);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(colorSpaceM4182getColorSpaceimpl);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            TwoWayConverter twoWayConverter = (TwoWayConverter) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
            boolean zBooleanValue2 = ((Boolean) transitionUpdateTransition.getCurrentState()).booleanValue();
            composerStartRestartGroup.startReplaceGroup(-1997025499);
            ComposerKt.sourceInformation(composerStartRestartGroup, "C:Tab.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1997025499, 0, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:295)");
            }
            long j5 = zBooleanValue2 ? j2 : j3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            Color colorM4168boximpl = Color.m4168boximpl(j5);
            boolean zBooleanValue3 = ((Boolean) transitionUpdateTransition.getTargetState()).booleanValue();
            composerStartRestartGroup.startReplaceGroup(-1997025499);
            ComposerKt.sourceInformation(composerStartRestartGroup, "C:Tab.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1997025499, 0, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:295)");
            }
            long j6 = zBooleanValue3 ? j2 : j3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            State stateCreateTransitionAnimation = TransitionKt.createTransitionAnimation(transitionUpdateTransition, colorM4168boximpl, Color.m4168boximpl(j6), tabKt$TabTransition$color$2.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), twoWayConverter, "ColorAnimation", composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4168boximpl(TabTransition_Klgx_Pg$lambda$2(stateCreateTransitionAnimation))), function2, composerStartRestartGroup, (i6 & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabKt$TabTransition$1
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

                public final void invoke(Composer composer2, int i7) {
                    long j7 = j2;
                    long j8 = j3;
                    boolean z3 = z2;
                    Function2<Composer, Integer, Unit> function22 = function2;
                    int i8 = i2;
                    TabKt.m2598TabTransitionKlgxPg(j7, j8, z3, function22, composer2, RecomposeScopeImplKt.updateChangedFlags((i8 + 1) - (i8 & 1)));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TabBaselineLayout(final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(514131524);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TabBaselineLayout)P(1)314@13233L2042,307@12989L2286:Tab.kt#uh7d8r");
        if ((i2 + 6) - (6 | i2) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 + 48) - (48 | i2) == 0) {
            int i4 = composerStartRestartGroup.changedInstance(function22) ? 32 : 16;
            i3 = (i3 + i4) - (i3 & i4);
        }
        if ((i3 + 19) - (19 | i3) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(514131524, i3, -1, "androidx.compose.material3.TabBaselineLayout (Tab.kt:306)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 370960155, "CC(remember):Tab.kt#9igjgp");
            int i5 = (-1) - (((-1) - i3) | ((-1) - 14));
            int i6 = (-1) - (((-1) - (i5 == 4 ? 1 : 0)) & ((-1) - ((-1) - (((-1) - i3) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)) != 32 ? 0 : 1)));
            MeasurePolicy measurePolicyRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i6 != 0 || measurePolicyRememberedValue == Composer.Companion.getEmpty()) {
                measurePolicyRememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.TabKt$TabBaselineLayout$2$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* JADX INFO: renamed from: measure-3p2s80s */
                    public final MeasureResult mo375measure3p2s80s(final MeasureScope measureScope, List<? extends Measurable> list, long j2) {
                        final Placeable placeableMo5514measureBRTryo0;
                        final Placeable placeableMo5514measureBRTryo02;
                        if (function2 != null) {
                            int size = list.size();
                            for (int i7 = 0; i7 < size; i7++) {
                                Measurable measurable = list.get(i7);
                                if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "text")) {
                                    placeableMo5514measureBRTryo0 = measurable.mo5514measureBRTryo0(Constraints.m6582copyZbe2FdA$default(j2, 0, 0, 0, 0, 11, null));
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        placeableMo5514measureBRTryo0 = null;
                        if (function22 != null) {
                            int size2 = list.size();
                            for (int i8 = 0; i8 < size2; i8++) {
                                Measurable measurable2 = list.get(i8);
                                if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), InAppMessageBase.ICON)) {
                                    placeableMo5514measureBRTryo02 = measurable2.mo5514measureBRTryo0(j2);
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        placeableMo5514measureBRTryo02 = null;
                        final int iMax = Math.max(placeableMo5514measureBRTryo0 != null ? placeableMo5514measureBRTryo0.getWidth() : 0, placeableMo5514measureBRTryo02 != null ? placeableMo5514measureBRTryo02.getWidth() : 0);
                        final int iMax2 = Math.max(measureScope.mo704roundToPx0680j_4((placeableMo5514measureBRTryo0 == null || placeableMo5514measureBRTryo02 == null) ? TabKt.SmallTabHeight : TabKt.LargeTabHeight), (placeableMo5514measureBRTryo02 != null ? placeableMo5514measureBRTryo02.getHeight() : 0) + (placeableMo5514measureBRTryo0 != null ? placeableMo5514measureBRTryo0.getHeight() : 0) + measureScope.mo703roundToPxR2X_6o(TabKt.IconDistanceFromBaseline));
                        final Integer numValueOf = placeableMo5514measureBRTryo0 != null ? Integer.valueOf(placeableMo5514measureBRTryo0.get(AlignmentLineKt.getFirstBaseline())) : null;
                        final Integer numValueOf2 = placeableMo5514measureBRTryo0 != null ? Integer.valueOf(placeableMo5514measureBRTryo0.get(AlignmentLineKt.getLastBaseline())) : null;
                        return MeasureScope.layout$default(measureScope, iMax, iMax2, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TabKt$TabBaselineLayout$2$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Placeable.PlacementScope placementScope) {
                                Placeable placeable;
                                Placeable placeable2 = placeableMo5514measureBRTryo0;
                                if (placeable2 == null || (placeable = placeableMo5514measureBRTryo02) == null) {
                                    if (placeable2 != null) {
                                        TabKt.placeTextOrIcon(placementScope, placeable2, iMax2);
                                        return;
                                    }
                                    Placeable placeable3 = placeableMo5514measureBRTryo02;
                                    if (placeable3 != null) {
                                        TabKt.placeTextOrIcon(placementScope, placeable3, iMax2);
                                        return;
                                    }
                                    return;
                                }
                                MeasureScope measureScope2 = measureScope;
                                int i9 = iMax;
                                int i10 = iMax2;
                                Integer num = numValueOf;
                                Intrinsics.checkNotNull(num);
                                int iIntValue = num.intValue();
                                Integer num2 = numValueOf2;
                                Intrinsics.checkNotNull(num2);
                                TabKt.placeTextAndIcon(placementScope, measureScope2, placeable2, placeable, i9, i10, iIntValue, num2.intValue());
                            }
                        }, 4, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(measurePolicyRememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) measurePolicyRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            Modifier.Companion companion = Modifier.Companion;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3671constructorimpl = Updater.m3671constructorimpl(composerStartRestartGroup);
            Updater.m3678setimpl(composerM3671constructorimpl, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1248753480, "C:Tab.kt#uh7d8r");
            composerStartRestartGroup.startReplaceGroup(871566271);
            ComposerKt.sourceInformation(composerStartRestartGroup, "309@13038L85");
            if (function2 != null) {
                Modifier modifierM1020paddingVpY3zN4$default = PaddingKt.m1020paddingVpY3zN4$default(LayoutIdKt.layoutId(Modifier.Companion, "text"), HorizontalTextPadding, 0.0f, 2, null);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1020paddingVpY3zN4$default);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3671constructorimpl2 = Updater.m3671constructorimpl(composerStartRestartGroup);
                Updater.m3678setimpl(composerM3671constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m3678setimpl(composerM3671constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composerM3671constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM3671constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM3671constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m3678setimpl(composerM3671constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 719667646, "C309@13115L6:Tab.kt#uh7d8r");
                function2.invoke(composerStartRestartGroup, Integer.valueOf(i5));
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(871570579);
            ComposerKt.sourceInformation(composerStartRestartGroup, "312@13174L41");
            if (function22 != null) {
                Modifier modifierLayoutId = LayoutIdKt.layoutId(Modifier.Companion, InAppMessageBase.ICON);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierLayoutId);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3671constructorimpl3 = Updater.m3671constructorimpl(composerStartRestartGroup);
                Updater.m3678setimpl(composerM3671constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m3678setimpl(composerM3671constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composerM3671constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM3671constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM3671constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m3678setimpl(composerM3671constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 719758910, "C312@13207L6:Tab.kt#uh7d8r");
                int i7 = i3 >> 3;
                function22.invoke(composerStartRestartGroup, Integer.valueOf((i7 + 14) - (i7 | 14)));
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabKt.TabBaselineLayout.3
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

                public final void invoke(Composer composer2, int i8) {
                    TabKt.TabBaselineLayout(function2, function22, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i2) & ((-1) - 1))));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeTextOrIcon(Placeable.PlacementScope placementScope, Placeable placeable, int i2) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, (i2 - placeable.getHeight()) / 2, 0.0f, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeTextAndIcon(Placeable.PlacementScope placementScope, Density density, Placeable placeable, Placeable placeable2, int i2, int i3, int i4, int i5) {
        float f2;
        if (i4 == i5) {
            f2 = SingleLineTextBaselineWithIcon;
        } else {
            f2 = DoubleLineTextBaselineWithIcon;
        }
        int iMo704roundToPx0680j_4 = density.mo704roundToPx0680j_4(f2) + density.mo704roundToPx0680j_4(PrimaryNavigationTabTokens.INSTANCE.m3476getActiveIndicatorHeightD9Ej5fM());
        int height = (placeable2.getHeight() + density.mo703roundToPxR2X_6o(IconDistanceFromBaseline)) - i4;
        int i6 = (i3 - i5) - iMo704roundToPx0680j_4;
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, (i2 - placeable.getWidth()) / 2, i6, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, (i2 - placeable2.getWidth()) / 2, i6 - height, 0.0f, 4, null);
    }

    public static final float getHorizontalTextPadding() {
        return HorizontalTextPadding;
    }

    private static final long TabTransition_Klgx_Pg$lambda$2(State<Color> state) {
        return state.getValue().m4188unboximpl();
    }
}
