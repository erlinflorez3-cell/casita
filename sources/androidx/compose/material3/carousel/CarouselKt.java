package androidx.compose.material3.carousel;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: compiled from: Carousel.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я|\u001d̉=!,i\bӵLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007njG5Le^.ZS0\u0010s{J$cҕyCQU\"Ԃ*\t]To˧vJp\u000bK\u000f\u001c\u0016\u0001̓4Ikxe܈\u00172XoG\u074cUoS9htL\u0005(2(D\u0002\u0005\u0017\u001a2H\u0016w\u0003Ca\f\u001a0FuBR#M\r܅\u001a\u0006T \tȦdgd6PǍuƹ.1Ʌ\u0002B|&\u00104\u000bM%F\u0003(=zo C@e8EYa\u0007\u001f\u0003kP\u0013N Cݾl1-2Yy]>h\u0002\u001a\u001bQX\u001dn\u00035\u000b\u000bŌd\u0016-2_iQX\u001e*}\u0001\"\u0017L\u0006\u001e\u0006US\\2Jj\u0016\u001aKt!`pT\u0010lZ\u007f)pf\u001d+\u007fA;Q\u001b\u0015b\u0012A\u001fNE\u0006\u001d\rL51t'[b!x\u0015Ih(\u0001?fXhXP\u001aYk\u0004\u0014\u0002r\u0011X\u0013ΥK\n5\u0003!4\u001d-G]?)G\u0003\u0012JTg%\u0004\u000fmרmRNX̱r\u0016=CO\u000b˧CߟʰoRZr:,eɎS\u0015\u001a \u0013N[(@/%(N}i\u001an[z\"%]xg_tk\u001cgQ^aF\u0002i\u0016a`\u0001,?jt5^lBa\u001fr\\V6bNp\u0010\u0006\u001a\\N:%bEw\u001cBKI\u0019\u000b'x\t$BO\t!_\tu@.bH<.y&\u0005\t/fl\u0002\u007fv'Xض\u0001j(4QW;!6W(nZ\u00143\t\u000fs.F\u0016QܤPl\u001c\u000eʀ\u007f \u001c3\u007fVɶ<Пä\u0003+8\";fdnsse\u0012Uy-}\u001d;\u0001.\u0016\t\u001bt:\u0004\u0003J}fG(|^\u00013 d.\u000b\u0012L\u0001Gq^#[l[#\t_<\\K\u0015\u0005M2U\u0007u\"\u000bAECU*F'\"D-\rmk\u007f.(x\u001f7\u0005t2;І\u001ayhXm8A@Y[\u0005DH;|\u0005RH\u0019v6Gީ8\r9`ыhp\\Q\u0014\u0010ʹ|օ¡0\u000fvzi_+\u0006\fZF_Xys\u0002\"^[%?N\u0004k{\u0015c\\9rUϘ#\u0012?\u0018*\u001ck&\u0007[p\tH\u0006\"\u0019fEI\n\u001d<7Lz+T&\u0019mli4\u0016+\u0004T\u000b'\u0017`n$?d;lx\u000b\u0003x\tnsx!X\u0007E\u000fK5\u0007dI\u0005\u001cL|/\u0012?1W+\u000b3j}\u0002-&ŠHTGK@o\u000f<]]qO*62TYqyq$8F\u007fcCɓ\u001f9_Aw/>\u0011#U\u0013_\rv@w\u0003R0\\\u0017z+\u001dl\u000e\u001d\u000b1O!p\u00137Zu\u0010=S\u001c\u0011\u0017rQ5@-gTPE\u0006ccmMxK?{\u0006\f\u0002ջЛ %/\u0007zևx\u0006\r҇\u000e\u0017"}, d2 = {"\u0011`a<h:>Z", "", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006t!Bc\u000e.7t_\fIPE{B\u001e\u001cVp5\u0016c\u0002", "=qX2a;:b\u001d\t\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w7P?k=-\u0011weC\u00109", "9dh9\\5>:\u001d\r\n", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "/uP6_(;Z\u0019l\u0006Z*|", "7sT:F7:Q\u001d\b|", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006t!Bc\u000e.7t_\u0014MWBo=\u001e{loH\\", "1n]AX5M>\u0015}yb5~", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u0001*LB?t6\u000f\u0011oq9\u00159", ";`g\u001bb5\u001f]\u0017z\u0002O0\u000b\r,l\u007f\f\u000b@\tt!Wx\u001d", "", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "4kX;Z\t>V\u0015\u0010~h9", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w<?Hm4-\u0015gB@\u000bl.+v*C]R6i(", "1n]AX5M", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006t!Bc\u000e.7t_\fIPE{B\u001e\u001cLp9\u000fQ*X\u0002'\u001d", "7sT:<5=S,", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "\u0011`a<h:>Z`oB2{gr-", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@#1f\b0Em\u001dw+?HuD,\u0015oOH\u0003r,$]#PK[6`Q\u0006\u0007\u0012\u001cb\u0019X9\rNZK4wC3.\f6RK=h\u000f\u001b&\u001b5x:,c\u0014G\u0003$qP-rO/F\u007fQPLf3.\u0011p%&;J-\u0012\u0001\u001d%q^wj\f\\\u000f\u0002V\u0004p4\u001d\u007fvA#Kw_EX9SF|2)Y{A\u0013<h}*p<\b>3\u007fk\u0001_q(M(c\u0011+[E0('8\u001aOKqKP%\nq\u001en\u0012\u0012aHz\u0017omnR\u001d\u0007''_~Ii\u007f;S\n>VEu\u000eB\bAh\u0004\u0019\b\u001amkoQN%b\u0001cqN2h\u0010~\u0012j\"%w\u0018=g\u001ex7_E\u0017\u0002\u0005u:\f\u000bYBuwL\u0019o(r^S\u0001(@\u0006f0'=ZCz[\rt!\u001e}\u0002\u001b\b\u001b\u0003mL\u0003D\\\u00065FWGfj8Y=:\u001e\"fE&#,DKPJvi\u00025\u0015G\u001bx\u0006$aF8K\u0011KQu,JcXZ >\u0016\u0001", "\u0016na6m6Gb\u0015\u0006bn3\f\r\fr\n:\n@^\u0013$Q\u007f\u001c<}", ">qT3X9KS\u0018b\n^4n\r.t\u0003", ";h] `(EZ|\u000ezf\u001e\u0001\b>h", ";`g `(EZ|\u000ezf\u001e\u0001\b>h", "\u0016na6m6Gb\u0015\u0006bn3\f\r\fr\n:\n@^\u0013$Q\u007f\u001c<}lJ7a\u0005\u0002V\u001c", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@#1f\b0Em\u001dw+?HuD,\u0015oOH\u0003r,$W\u000eCUM9fVqP]\u0010d\u0016Y5\u001b\u0005#Q(8,A\u001e\f-M\u0002H>ar\u0012\u00174wzFU#\u0011w\u001f}L3vF#`\u0004WJD^9h\u0016hf^:H3$~\u0019)2?*\u0017}S rQZnkP\u001bW8':~_PRE6\u001d[#(J\t\u0002\u00161k>)~5\u000f>86.\u0006Uw!=Z\b\u00196e\u000b.\"JF#N\u0015Nqk=\u0012q!R\u0004\u0015r5?nLkmW\u0016\u000bf``Fi)\u0002G[\u0004MMy\u001e5\u0010_Rdw$\r\u0011-<;0?$S\u000e$tC5)\u000f\r\u000bq\"*._Ji\u0018w.g7\u0017p\u0013pC\u0016\nYPjT,S^", "\u0016na6m6Gb\u0015\u0006jg*\u0007\u0012>a\u00041{?^\u0013$Q\u007f\u001c<}", "7sT:J0=b\u001c", "\u0016na6m6Gb\u0015\u0006jg*\u0007\u0012>a\u00041{?^\u0013$Q\u007f\u001c<}l\tE{\"&Z$", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@#1f\b0Em\u001dw+?HuD,\u0015oOH\u0003r,$W\u000eCUM9fVqP]\u0010d\u0016Y5\u001b\u0005#Q(8,A\u001e\f-M\u0002H>ar\u0012\u00174wzFU#\u0011w\u001f}L3vF#`\u0004WJD^9h\u0016hf^:H3$~\u0019)2?*\u0017}S rQZnkP\u001bW8':~_PRE<8}&,U\u007fv%{V~3\u007f7\u00124s7n\u0015Tf\u0014Mb\u0003\u001euc=;0FK\\*GbtpG\u0010Y\u001bh\u0018\u000ep\u000b\u0018\u001fotjL\u0018Pb(c~bo\n5a\nHR}^\bV\b@j}\u001f\u0012UyTaRB(^\u0005\u0019\u0004\u000e i\u0019\u000e\rt\u0018e;&Fh\u0013p*)\u0015W\u001b\u0014rF\f\t/'x49", "1`[0h3:b\u0019\\\u000bk9|\u0012>S}5\u0006G\b\u0001\u0018H}\u000eK", "Asa.g,@g", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006t!Bc\u000e.7t_\u001c\\P7z4 )>", "1`[0h3:b\u0019fvq\u001az\u00169l\u0007\u0012|A\u000f\u0017&", "5dc\u001de6@`\u0019\r\t", "0dU<e,", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006t!Bc\u000e.7t_\u0014MWBo=\u001ej", "/ec2e", "CmP1]<Lb\u0019}d_-\u000b\t>", "1`[0h3:b\u0019Z{m,\nf9n\u000f(\u0005Ok\u0013\u0016Fs\u0017>", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u0012*G|_\u0019IB:o= \u0006dhI\u0007q\u00025r0FYX0[e<;\u001e\u001ae\u0018\\+V\u0006cQ-m@F#\u00125\u0013\u0004;v\u0010\u001c#\u000eC4ZOZ\u0010P\t\u0011\u0005E3q\u001c@[\u0003FNOf)wU]'dED2\u0014;&+q_2\u0012{\u001dn|Z\u0005quG&P\u001cg\u001f", "1`[0h3:b\u0019[z_6\n\t\ro\t7{I\u0010\u0002\u0013Fn\u0012Ex", "1`a<h:>Z|\u000ezf", "7mS2k", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "1`a<h:>Z|\u000ezf\u0010\u0006\n9", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006t!Bc\u000e.7t_\fIPE{B\u001e\u001cLp9\u000fG5O\u0001\u000bOWU\u0002", "1kX=F/:^\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y+7C", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class CarouselKt {
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
    /* JADX INFO: renamed from: HorizontalMultiBrowseCarousel-zCIJ0Nk, reason: not valid java name */
    public static final void m2902HorizontalMultiBrowseCarouselzCIJ0Nk(final CarouselState carouselState, final float f2, Modifier modifier, float f3, TargetedFlingBehavior targetedFlingBehavior, float f4, float f5, PaddingValues paddingValues, final Function4<? super CarouselItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> function4, Composer composer, final int i2, final int i3) {
        int i4;
        PaddingValues paddingValuesM1011PaddingValues0680j_4 = paddingValues;
        TargetedFlingBehavior targetedFlingBehaviorSingleAdvanceFlingBehavior = targetedFlingBehavior;
        float fM6638constructorimpl = f3;
        float fM2898getMaxSmallItemSizeD9Ej5fM$material3_release = f5;
        float fM2899getMinSmallItemSizeD9Ej5fM$material3_release = f4;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1825706865);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(HorizontalMultiBrowseCarousel)P(8,7:c#ui.unit.Dp,6,3:c#ui.unit.Dp,2,5:c#ui.unit.Dp,4:c#ui.unit.Dp,1)106@5374L41,112@5703L7,116@5816L554,113@5715L1048:Carousel.kt#dcf9yb");
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            i4 = i2 | 6;
        } else if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            int i5 = composerStartRestartGroup.changedInstance(carouselState) ? 4 : 2;
            i4 = (i5 + i2) - (i5 & i2);
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 = (i4 + 48) - (i4 & 48);
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(f2) ? 32 : 16;
        }
        int i6 = (-1) - (((-1) - i3) | ((-1) - 4));
        if (i6 != 0) {
            i4 = (i4 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i4 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i2 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 |= composerStartRestartGroup.changed(companion) ? 256 : 128;
        }
        int i7 = (i3 + 8) - (i3 | 8);
        if (i7 != 0) {
            i4 = (i4 + 3072) - (i4 & 3072);
        } else if ((i2 + 3072) - (i2 | 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(fM6638constructorimpl) ? 2048 : 1024;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 24576)) == 0) {
            int i8 = ((-1) - (((-1) - i3) | ((-1) - 16)) == 0 && composerStartRestartGroup.changed(targetedFlingBehaviorSingleAdvanceFlingBehavior)) ? 16384 : 8192;
            i4 = (i4 + i8) - (i4 & i8);
        }
        int i9 = (-1) - (((-1) - i3) | ((-1) - 32));
        if (i9 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE));
        } else if ((-1) - (((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) | ((-1) - i2)) == 0) {
            int i10 = composerStartRestartGroup.changed(fM2899getMinSmallItemSizeD9Ej5fM$material3_release) ? 131072 : 65536;
            i4 = (i4 + i10) - (i4 & i10);
        }
        int i11 = (i3 + 64) - (i3 | 64);
        if (i11 != 0) {
            i4 = (i4 + 1572864) - (i4 & 1572864);
        } else if ((i2 + 1572864) - (i2 | 1572864) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(fM2898getMaxSmallItemSizeD9Ej5fM$material3_release) ? 1048576 : 524288)));
        }
        int i12 = (-1) - (((-1) - i3) | ((-1) - 128));
        if (i12 != 0) {
            i4 = (i4 + 12582912) - (i4 & 12582912);
        } else if ((-1) - (((-1) - i2) | ((-1) - 12582912)) == 0) {
            i4 |= composerStartRestartGroup.changed(paddingValuesM1011PaddingValues0680j_4) ? 8388608 : 4194304;
        }
        if ((i3 + 256) - (i3 | 256) != 0) {
            i4 |= 100663296;
        } else if ((i2 & 100663296) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function4) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i4 + 38347923) - (38347923 | i4) == 38347922 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            int i13 = 0;
            if ((-1) - (((-1) - i2) | ((-1) - 1)) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i6 != 0) {
                    companion = Modifier.Companion;
                }
                if (i7 != 0) {
                    fM6638constructorimpl = Dp.m6638constructorimpl(0);
                }
                if ((i3 + 16) - (i3 | 16) != 0) {
                    targetedFlingBehaviorSingleAdvanceFlingBehavior = CarouselDefaults.INSTANCE.singleAdvanceFlingBehavior(carouselState, null, composerStartRestartGroup, (-1) - (((-1) - ((i4 + 14) - (14 | i4))) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)), 2);
                    i4 = (i4 - 57345) - (i4 | (-57345));
                }
                if (i9 != 0) {
                    fM2899getMinSmallItemSizeD9Ej5fM$material3_release = CarouselDefaults.INSTANCE.m2899getMinSmallItemSizeD9Ej5fM$material3_release();
                }
                if (i11 != 0) {
                    fM2898getMaxSmallItemSizeD9Ej5fM$material3_release = CarouselDefaults.INSTANCE.m2898getMaxSmallItemSizeD9Ej5fM$material3_release();
                }
                i13 = 0;
                if (i12 != 0) {
                    paddingValuesM1011PaddingValues0680j_4 = PaddingKt.m1011PaddingValues0680j_4(Dp.m6638constructorimpl(0));
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 + 16) - (i3 | 16) != 0) {
                    i4 = (i4 - 57345) - (i4 | (-57345));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1825706865, i4, -1, "androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel (Carousel.kt:111)");
            }
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final Density density = (Density) objConsume;
            Orientation orientation = Orientation.Horizontal;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1995157598, "CC(remember):Carousel.kt#9igjgp");
            int i14 = (-1) - (((-1) - (composerStartRestartGroup.changed(density) ? 1 : 0)) & ((-1) - ((i4 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (112 | i4) == 32 ? 1 : i13)));
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(carouselState);
            int i15 = (-1) - (((-1) - ((-1) - (((-1) - ((i14 + (zChangedInstance ? 1 : 0)) - (i14 & (zChangedInstance ? 1 : 0)) != 1 ? 0 : 1)) & ((-1) - ((-1) - (((-1) - i4) | ((-1) - 458752)) == 131072 ? 1 : i13))))) & ((-1) - ((-1) - (((-1) - 3670016) | ((-1) - i4)) != 1048576 ? i13 : 1)));
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i15 != 0 || objRememberedValue == Composer.Companion.getEmpty()) {
                final float f6 = fM2899getMinSmallItemSizeD9Ej5fM$material3_release;
                final float f7 = fM2898getMaxSmallItemSizeD9Ej5fM$material3_release;
                objRememberedValue = (Function2) new Function2<Float, Float, KeylineList>() { // from class: androidx.compose.material3.carousel.CarouselKt$HorizontalMultiBrowseCarousel$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ KeylineList invoke(Float f8, Float f9) {
                        return invoke(f8.floatValue(), f9.floatValue());
                    }

                    public final KeylineList invoke(float f8, float f9) {
                        Density density2 = density;
                        return KeylinesKt.multiBrowseKeylineList(density2, f8, density2.mo710toPx0680j_4(f2), f9, carouselState.getItemCountState().getValue().invoke().intValue(), density2.mo710toPx0680j_4(f6), density2.mo710toPx0680j_4(f7));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            int i16 = (-1) - (((-1) - ((-1) - (((-1) - i4) | ((-1) - 14)))) & ((-1) - 24624));
            int i17 = (-1) - (((-1) - (i4 >> 12)) | ((-1) - 7168));
            int i18 = i4 << 9;
            int i19 = (-1) - (((-1) - ((i16 + i17) - (i16 & i17))) & ((-1) - ((458752 + i18) - (458752 | i18))));
            int i20 = (3670016 + i18) - (3670016 | i18);
            int i21 = ((i19 + i20) - (i19 & i20)) | (i18 & 29360128);
            int i22 = (-1) - (((-1) - i4) | ((-1) - 234881024));
            m2901CarouselV95POc(carouselState, orientation, (Function2) objRememberedValue, paddingValuesM1011PaddingValues0680j_4, 2, companion, fM6638constructorimpl, targetedFlingBehaviorSingleAdvanceFlingBehavior, function4, composerStartRestartGroup, (i21 + i22) - (i21 & i22), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            final float f8 = fM6638constructorimpl;
            final TargetedFlingBehavior targetedFlingBehavior2 = targetedFlingBehaviorSingleAdvanceFlingBehavior;
            final float f9 = fM2899getMinSmallItemSizeD9Ej5fM$material3_release;
            final float f10 = fM2898getMaxSmallItemSizeD9Ej5fM$material3_release;
            final PaddingValues paddingValues2 = paddingValuesM1011PaddingValues0680j_4;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.carousel.CarouselKt$HorizontalMultiBrowseCarousel$2
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

                public final void invoke(Composer composer2, int i23) {
                    CarouselState carouselState2 = carouselState;
                    float f11 = f2;
                    Modifier modifier3 = modifier2;
                    float f12 = f8;
                    TargetedFlingBehavior targetedFlingBehavior3 = targetedFlingBehavior2;
                    float f13 = f9;
                    float f14 = f10;
                    PaddingValues paddingValues3 = paddingValues2;
                    Function4<CarouselItemScope, Integer, Composer, Integer, Unit> function42 = function4;
                    int i24 = i2;
                    CarouselKt.m2902HorizontalMultiBrowseCarouselzCIJ0Nk(carouselState2, f11, modifier3, f12, targetedFlingBehavior3, f13, f14, paddingValues3, function42, composer2, RecomposeScopeImplKt.updateChangedFlags((i24 + 1) - (i24 & 1)), i3);
                }
            });
        }
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
    /* JADX INFO: renamed from: HorizontalUncontainedCarousel-9QcgTRs, reason: not valid java name */
    public static final void m2903HorizontalUncontainedCarousel9QcgTRs(final CarouselState carouselState, final float f2, Modifier modifier, float f3, TargetedFlingBehavior targetedFlingBehavior, PaddingValues paddingValues, final Function4<? super CarouselItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> function4, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        PaddingValues paddingValuesM1011PaddingValues0680j_4 = paddingValues;
        TargetedFlingBehavior targetedFlingBehaviorNoSnapFlingBehavior = targetedFlingBehavior;
        float fM6638constructorimpl = f3;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(529322840);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(HorizontalUncontainedCarousel)P(6,4:c#ui.unit.Dp,5,3:c#ui.unit.Dp,2,1)175@8483L21,179@8666L7,183@8779L337,180@8678L818:Carousel.kt#dcf9yb");
        if ((i3 + 1) - (i3 | 1) != 0) {
            i4 = (-1) - (((-1) - i2) & ((-1) - 6));
        } else if ((i2 & 6) == 0) {
            i4 = (-1) - (((-1) - (composerStartRestartGroup.changedInstance(carouselState) ? 4 : 2)) & ((-1) - i2));
        } else {
            i4 = i2;
        }
        if ((i3 + 2) - (i3 | 2) != 0) {
            i4 = (i4 + 48) - (i4 & 48);
        } else if ((i2 + 48) - (i2 | 48) == 0) {
            int i6 = composerStartRestartGroup.changed(f2) ? 32 : 16;
            i4 = (i4 + i6) - (i4 & i6);
        }
        int i7 = i3 & 4;
        if (i7 != 0) {
            i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(companion) ? 256 : 128)));
        }
        int i8 = i3 & 8;
        if (i8 != 0) {
            i4 |= 3072;
        } else if ((i2 + 3072) - (i2 | 3072) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(fM6638constructorimpl) ? 2048 : 1024)));
        }
        if ((i2 & 24576) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (((i3 & 16) == 0 && composerStartRestartGroup.changed(targetedFlingBehaviorNoSnapFlingBehavior)) ? 16384 : 8192)));
        }
        int i9 = (-1) - (((-1) - i3) | ((-1) - 32));
        if (i9 != 0) {
            i4 = (i4 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        } else if ((-1) - (((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) | ((-1) - i2)) == 0) {
            i4 |= composerStartRestartGroup.changed(paddingValuesM1011PaddingValues0680j_4) ? 131072 : 65536;
        }
        if ((i3 + 64) - (i3 | 64) != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 1572864));
        } else if ((i2 + 1572864) - (i2 | 1572864) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function4) ? 1048576 : 524288;
        }
        if ((599187 & i4) != 599186 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i2 + 1) - (i2 | 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i7 != 0) {
                    companion = Modifier.Companion;
                }
                if (i8 != 0) {
                    fM6638constructorimpl = Dp.m6638constructorimpl(0);
                }
                if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
                    targetedFlingBehaviorNoSnapFlingBehavior = CarouselDefaults.INSTANCE.noSnapFlingBehavior(composerStartRestartGroup, 6);
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-57345)));
                }
                i5 = 0;
                if (i9 != 0) {
                    paddingValuesM1011PaddingValues0680j_4 = PaddingKt.m1011PaddingValues0680j_4(Dp.m6638constructorimpl(0));
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 & 16) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-57345)));
                }
                i5 = 0;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(529322840, i4, -1, "androidx.compose.material3.carousel.HorizontalUncontainedCarousel (Carousel.kt:178)");
            }
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final Density density = (Density) objConsume;
            Orientation orientation = Orientation.Horizontal;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1883505148, "CC(remember):Carousel.kt#9igjgp");
            boolean zChanged = composerStartRestartGroup.changed(density);
            if ((i4 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (112 | i4) == 32) {
                i5 = 1;
            }
            int i10 = (i5 + (zChanged ? 1 : 0)) - (i5 & (zChanged ? 1 : 0));
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i10 != 0 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = (Function2) new Function2<Float, Float, KeylineList>() { // from class: androidx.compose.material3.carousel.CarouselKt$HorizontalUncontainedCarousel$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ KeylineList invoke(Float f4, Float f5) {
                        return invoke(f4.floatValue(), f5.floatValue());
                    }

                    public final KeylineList invoke(float f4, float f5) {
                        Density density2 = density;
                        return KeylinesKt.uncontainedKeylineList(density2, f4, density2.mo710toPx0680j_4(f2), f5);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            int i11 = i4 >> 6;
            int i12 = (-1) - (((-1) - (((i4 + 14) - (14 | i4)) | 24624)) & ((-1) - ((i11 + 7168) - (i11 | 7168))));
            int i13 = i4 << 9;
            int i14 = (458752 + i13) - (458752 | i13);
            int i15 = (i12 + i14) - (i12 & i14);
            int i16 = (3670016 + i13) - (3670016 | i13);
            int i17 = (i15 + i16) - (i15 & i16);
            int i18 = (i13 + 29360128) - (i13 | 29360128);
            m2901CarouselV95POc(carouselState, orientation, (Function2) objRememberedValue, paddingValuesM1011PaddingValues0680j_4, 0, companion, fM6638constructorimpl, targetedFlingBehaviorNoSnapFlingBehavior, function4, composerStartRestartGroup, ((i17 + i18) - (i17 & i18)) | ((i4 << 6) & 234881024), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            final float f4 = fM6638constructorimpl;
            final TargetedFlingBehavior targetedFlingBehavior2 = targetedFlingBehaviorNoSnapFlingBehavior;
            final PaddingValues paddingValues2 = paddingValuesM1011PaddingValues0680j_4;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.carousel.CarouselKt$HorizontalUncontainedCarousel$2
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

                public final void invoke(Composer composer2, int i19) {
                    CarouselKt.m2903HorizontalUncontainedCarousel9QcgTRs(carouselState, f2, modifier2, f4, targetedFlingBehavior2, paddingValues2, function4, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i2) & ((-1) - 1))), i3);
                }
            });
        }
    }

    /* JADX INFO: renamed from: Carousel-V-95POc, reason: not valid java name */
    public static final void m2901CarouselV95POc(final CarouselState carouselState, final Orientation orientation, final Function2<? super Float, ? super Float, KeylineList> function2, final PaddingValues paddingValues, final int i2, Modifier modifier, float f2, TargetedFlingBehavior targetedFlingBehavior, final Function4<? super CarouselItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> function4, Composer composer, final int i3, final int i4) {
        int i5;
        TargetedFlingBehavior targetedFlingBehaviorSingleAdvanceFlingBehavior = targetedFlingBehavior;
        float fM6638constructorimpl = f2;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2035733443);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Carousel)P(8,7,4,1,5,6,3:c#ui.unit.Dp,2)239@11411L41,242@11572L42,243@11660L41,245@11729L118:Carousel.kt#dcf9yb");
        if ((-1) - (((-1) - i4) | ((-1) - 1)) != 0) {
            i5 = (i3 + 6) - (i3 & 6);
        } else if ((i3 + 6) - (i3 | 6) == 0) {
            i5 = (composerStartRestartGroup.changedInstance(carouselState) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i4 & 2) != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 48));
        } else if ((i3 + 48) - (i3 | 48) == 0) {
            i5 |= composerStartRestartGroup.changed(orientation) ? 32 : 16;
        }
        if ((i4 & 4) != 0) {
            i5 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i3 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changedInstance(function2) ? 256 : 128)));
        }
        if ((i4 & 8) != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 3072));
        } else if ((-1) - (((-1) - i3) | ((-1) - 3072)) == 0) {
            int i6 = composerStartRestartGroup.changed(paddingValues) ? 2048 : 1024;
            i5 = (i5 + i6) - (i5 & i6);
        }
        if ((-1) - (((-1) - i4) | ((-1) - 16)) != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 24576));
        } else if ((i3 & 24576) == 0) {
            int i7 = composerStartRestartGroup.changed(i2) ? 16384 : 8192;
            i5 = (i5 + i7) - (i5 & i7);
        }
        int i8 = (-1) - (((-1) - i4) | ((-1) - 32));
        if (i8 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE));
        } else if ((ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE + i3) - (196608 | i3) == 0) {
            int i9 = composerStartRestartGroup.changed(companion) ? 131072 : 65536;
            i5 = (i5 + i9) - (i5 & i9);
        }
        int i10 = (i4 + 64) - (i4 | 64);
        if (i10 != 0) {
            i5 |= 1572864;
        } else if ((-1) - (((-1) - 1572864) | ((-1) - i3)) == 0) {
            i5 |= composerStartRestartGroup.changed(fM6638constructorimpl) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i5 |= ((-1) - (((-1) - i4) | ((-1) - 128)) == 0 && composerStartRestartGroup.changed(targetedFlingBehaviorSingleAdvanceFlingBehavior)) ? 8388608 : 4194304;
        }
        if ((i4 & 256) != 0) {
            i5 = (i5 + 100663296) - (i5 & 100663296);
        } else if ((i3 & 100663296) == 0) {
            int i11 = composerStartRestartGroup.changedInstance(function4) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
            i5 = (i5 + i11) - (i5 & i11);
        }
        if ((-1) - (((-1) - 38347923) | ((-1) - i5)) == 38347922 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i3 + 1) - (i3 | 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i8 != 0) {
                    companion = Modifier.Companion;
                }
                if (i10 != 0) {
                    fM6638constructorimpl = Dp.m6638constructorimpl(0);
                }
                if ((i4 & 128) != 0) {
                    int i12 = i5 & 14;
                    targetedFlingBehaviorSingleAdvanceFlingBehavior = CarouselDefaults.INSTANCE.singleAdvanceFlingBehavior(carouselState, null, composerStartRestartGroup, (i12 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i12 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT), 2);
                    i5 &= -29360129;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i4 & 128) != 0) {
                    i5 = (i5 - 29360129) - (i5 | (-29360129));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2035733443, i5, -1, "androidx.compose.material3.carousel.Carousel (Carousel.kt:241)");
            }
            int i13 = i5 >> 9;
            int i14 = (-1) - (((-1) - ((i13 + 14) - (i13 | 14))) & ((-1) - ((i5 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (112 | i5))));
            float fCalculateBeforeContentPadding = calculateBeforeContentPadding(paddingValues, orientation, composerStartRestartGroup, i14);
            float fCalculateAfterContentPadding = calculateAfterContentPadding(paddingValues, orientation, composerStartRestartGroup, i14);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2025986753, "CC(remember):Carousel.kt#9igjgp");
            boolean z2 = (i5 + 896) - (896 | i5) == 256;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new CarouselPageSize(function2, fCalculateBeforeContentPadding, fCalculateAfterContentPadding);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final CarouselPageSize carouselPageSize = (CarouselPageSize) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            SnapPosition snapPositionKeylineSnapPosition = KeylineSnapPositionKt.KeylineSnapPosition(carouselPageSize);
            if (orientation == Orientation.Horizontal) {
                composerStartRestartGroup.startReplaceGroup(-1618653092);
                ComposerKt.sourceInformation(composerStartRestartGroup, "266@12589L1014,252@11960L1643");
                PagerState pagerState$material3_release = carouselState.getPagerState$material3_release();
                PaddingValues paddingValuesM1015PaddingValuesa9UjIt4$default = PaddingKt.m1015PaddingValuesa9UjIt4$default(0.0f, paddingValues.mo971calculateTopPaddingD9Ej5fM(), 0.0f, paddingValues.mo968calculateBottomPaddingD9Ej5fM(), 5, null);
                CarouselPageSize carouselPageSize2 = carouselPageSize;
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(687111200, true, new Function4<PagerScope, Integer, Composer, Integer, Unit>() { // from class: androidx.compose.material3.carousel.CarouselKt$Carousel$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(4);
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(PagerScope pagerScope, Integer num, Composer composer2, Integer num2) {
                        invoke(pagerScope, num.intValue(), composer2, num2.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PagerScope pagerScope, int i15, Composer composer2, int i16) {
                        ComposerKt.sourceInformation(composer2, "C267@12634L35,268@12694L63,269@12786L389,286@13376L21,281@13189L404:Carousel.kt#dcf9yb");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(687111200, i16, -1, "androidx.compose.material3.carousel.Carousel.<anonymous> (Carousel.kt:267)");
                        }
                        ComposerKt.sourceInformationMarkerStart(composer2, -685906675, "CC(remember):Carousel.kt#9igjgp");
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                            objRememberedValue2 = new CarouselItemInfoImpl();
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        final CarouselItemInfoImpl carouselItemInfoImpl = (CarouselItemInfoImpl) objRememberedValue2;
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerStart(composer2, -685904727, "CC(remember):Carousel.kt#9igjgp");
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                            objRememberedValue3 = new CarouselItemScopeImpl(carouselItemInfoImpl);
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        CarouselItemScopeImpl carouselItemScopeImpl = (CarouselItemScopeImpl) objRememberedValue3;
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerStart(composer2, -685901457, "CC(remember):Carousel.kt#9igjgp");
                        Object objRememberedValue4 = composer2.rememberedValue();
                        if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                            objRememberedValue4 = new Shape() { // from class: androidx.compose.material3.carousel.CarouselKt$Carousel$1$clipShape$1$1
                                @Override // androidx.compose.ui.graphics.Shape
                                /* JADX INFO: renamed from: createOutline-Pq9zytI */
                                public Outline mo621createOutlinePq9zytI(long j2, LayoutDirection layoutDirection, Density density) {
                                    return new Outline.Rectangle(carouselItemInfoImpl.getMaskRect());
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue4);
                        }
                        CarouselKt$Carousel$1$clipShape$1$1 carouselKt$Carousel$1$clipShape$1$1 = (CarouselKt$Carousel$1$clipShape$1$1) objRememberedValue4;
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        Modifier.Companion companion2 = Modifier.Companion;
                        CarouselState carouselState2 = carouselState;
                        ComposerKt.sourceInformationMarkerStart(composer2, -685882945, "CC(remember):Carousel.kt#9igjgp");
                        boolean zChanged = composer2.changed(carouselPageSize);
                        final CarouselPageSize carouselPageSize3 = carouselPageSize;
                        Object objRememberedValue5 = composer2.rememberedValue();
                        if (zChanged || objRememberedValue5 == Composer.Companion.getEmpty()) {
                            objRememberedValue5 = (Function0) new Function0<Strategy>() { // from class: androidx.compose.material3.carousel.CarouselKt$Carousel$1$1$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final Strategy invoke() {
                                    return carouselPageSize3.getStrategy();
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue5);
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        Modifier modifierCarouselItem = CarouselKt.carouselItem(companion2, i15, carouselState2, (Function0) objRememberedValue5, carouselItemInfoImpl, carouselKt$Carousel$1$clipShape$1$1);
                        Function4<CarouselItemScope, Integer, Composer, Integer, Unit> function42 = function4;
                        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierCarouselItem);
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
                        Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                        if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer2, 1112607687, "C291@13566L13:Carousel.kt#dcf9yb");
                        function42.invoke(carouselItemScopeImpl, Integer.valueOf(i15), composer2, Integer.valueOf(i16 & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION));
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54);
                int i15 = i5 >> 12;
                int i16 = ((i15 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i15 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)) | ((-1) - (((-1) - 57344) | ((-1) - i5)));
                int i17 = (-1) - (((-1) - (i5 >> 3)) | ((-1) - 458752));
                PagerKt.m1255HorizontalPageroI3XNZo(pagerState$material3_release, companion, paddingValuesM1015PaddingValuesa9UjIt4$default, carouselPageSize2, i2, fM6638constructorimpl, null, targetedFlingBehaviorSingleAdvanceFlingBehavior, false, false, null, null, snapPositionKeylineSnapPosition, composableLambdaRememberComposableLambda, composerStartRestartGroup, (-1) - (((-1) - ((i16 + i17) - (i16 & i17))) & ((-1) - ((-1) - (((-1) - 29360128) | ((-1) - i5))))), 3072, 3904);
                composerStartRestartGroup.endReplaceGroup();
            } else if (orientation == Orientation.Vertical) {
                composerStartRestartGroup.startReplaceGroup(-1616959128);
                ComposerKt.sourceInformation(composerStartRestartGroup, "300@13962L7,301@14054L7,309@14347L1014,295@13666L1695");
                PagerState pagerState$material3_release2 = carouselState.getPagerState$material3_release();
                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume = composerStartRestartGroup.consume(localLayoutDirection);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                float fCalculateStartPadding = PaddingKt.calculateStartPadding(paddingValues, (LayoutDirection) objConsume);
                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume2 = composerStartRestartGroup.consume(localLayoutDirection2);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                int i18 = i5 >> 12;
                PagerKt.m1256VerticalPageroI3XNZo(pagerState$material3_release2, companion, PaddingKt.m1015PaddingValuesa9UjIt4$default(fCalculateStartPadding, 0.0f, PaddingKt.calculateEndPadding(paddingValues, (LayoutDirection) objConsume2), 0.0f, 10, null), carouselPageSize, i2, fM6638constructorimpl, null, targetedFlingBehaviorSingleAdvanceFlingBehavior, false, false, null, null, snapPositionKeylineSnapPosition, ComposableLambdaKt.rememberComposableLambda(-817308503, true, new Function4<PagerScope, Integer, Composer, Integer, Unit>() { // from class: androidx.compose.material3.carousel.CarouselKt$Carousel$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(4);
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(PagerScope pagerScope, Integer num, Composer composer2, Integer num2) {
                        invoke(pagerScope, num.intValue(), composer2, num2.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PagerScope pagerScope, int i19, Composer composer2, int i20) {
                        ComposerKt.sourceInformation(composer2, "C310@14392L35,311@14452L63,312@14544L389,329@15134L21,324@14947L404:Carousel.kt#dcf9yb");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-817308503, i20, -1, "androidx.compose.material3.carousel.Carousel.<anonymous> (Carousel.kt:310)");
                        }
                        ComposerKt.sourceInformationMarkerStart(composer2, -685850419, "CC(remember):Carousel.kt#9igjgp");
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                            objRememberedValue2 = new CarouselItemInfoImpl();
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        final CarouselItemInfoImpl carouselItemInfoImpl = (CarouselItemInfoImpl) objRememberedValue2;
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerStart(composer2, -685848471, "CC(remember):Carousel.kt#9igjgp");
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                            objRememberedValue3 = new CarouselItemScopeImpl(carouselItemInfoImpl);
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        CarouselItemScopeImpl carouselItemScopeImpl = (CarouselItemScopeImpl) objRememberedValue3;
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerStart(composer2, -685845201, "CC(remember):Carousel.kt#9igjgp");
                        Object objRememberedValue4 = composer2.rememberedValue();
                        if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                            objRememberedValue4 = new Shape() { // from class: androidx.compose.material3.carousel.CarouselKt$Carousel$2$clipShape$1$1
                                @Override // androidx.compose.ui.graphics.Shape
                                /* JADX INFO: renamed from: createOutline-Pq9zytI */
                                public Outline mo621createOutlinePq9zytI(long j2, LayoutDirection layoutDirection, Density density) {
                                    return new Outline.Rectangle(carouselItemInfoImpl.getMaskRect());
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue4);
                        }
                        CarouselKt$Carousel$2$clipShape$1$1 carouselKt$Carousel$2$clipShape$1$1 = (CarouselKt$Carousel$2$clipShape$1$1) objRememberedValue4;
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        Modifier.Companion companion2 = Modifier.Companion;
                        CarouselState carouselState2 = carouselState;
                        ComposerKt.sourceInformationMarkerStart(composer2, -685826689, "CC(remember):Carousel.kt#9igjgp");
                        boolean zChanged = composer2.changed(carouselPageSize);
                        final CarouselPageSize carouselPageSize3 = carouselPageSize;
                        Object objRememberedValue5 = composer2.rememberedValue();
                        if (zChanged || objRememberedValue5 == Composer.Companion.getEmpty()) {
                            objRememberedValue5 = (Function0) new Function0<Strategy>() { // from class: androidx.compose.material3.carousel.CarouselKt$Carousel$2$1$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final Strategy invoke() {
                                    return carouselPageSize3.getStrategy();
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue5);
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        Modifier modifierCarouselItem = CarouselKt.carouselItem(companion2, i19, carouselState2, (Function0) objRememberedValue5, carouselItemInfoImpl, carouselKt$Carousel$2$clipShape$1$1);
                        Function4<CarouselItemScope, Integer, Composer, Integer, Unit> function42 = function4;
                        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierCarouselItem);
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
                        Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                        if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer2, 1114351623, "C334@15324L13:Carousel.kt#dcf9yb");
                        function42.invoke(carouselItemScopeImpl, Integer.valueOf(i19), composer2, Integer.valueOf(i20 & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION));
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, (-1) - (((-1) - ((-1) - (((-1) - (((i18 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i18 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)) | ((-1) - (((-1) - 57344) | ((-1) - i5))))) & ((-1) - ((i5 >> 3) & 458752))))) & ((-1) - (29360128 & i5))), 3072, 3904);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1615314857);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            final float f3 = fM6638constructorimpl;
            final TargetedFlingBehavior targetedFlingBehavior2 = targetedFlingBehaviorSingleAdvanceFlingBehavior;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.carousel.CarouselKt$Carousel$3
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

                public final void invoke(Composer composer2, int i19) {
                    CarouselKt.m2901CarouselV95POc(carouselState, orientation, function2, paddingValues, i2, modifier2, f3, targetedFlingBehavior2, function4, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i3) & ((-1) - 1))), i4);
                }
            });
        }
    }

    private static final float calculateBeforeContentPadding(PaddingValues paddingValues, Orientation orientation, Composer composer, int i2) {
        float fCalculateStartPadding;
        ComposerKt.sourceInformationMarkerStart(composer, 1896839347, "C(calculateBeforeContentPadding)*349@15698L7:Carousel.kt#dcf9yb");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1896839347, i2, -1, "androidx.compose.material3.carousel.calculateBeforeContentPadding (Carousel.kt:341)");
        }
        composer.startReplaceGroup(295830617);
        ComposerKt.sourceInformation(composer, "346@15649L7");
        if (orientation == Orientation.Vertical) {
            fCalculateStartPadding = paddingValues.mo971calculateTopPaddingD9Ej5fM();
        } else {
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composer.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd(composer);
            fCalculateStartPadding = PaddingKt.calculateStartPadding(paddingValues, (LayoutDirection) objConsume);
        }
        composer.endReplaceGroup();
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume2 = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        float fMo710toPx0680j_4 = ((Density) objConsume2).mo710toPx0680j_4(fCalculateStartPadding);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return fMo710toPx0680j_4;
    }

    private static final float calculateAfterContentPadding(PaddingValues paddingValues, Orientation orientation, Composer composer, int i2) {
        float fCalculateEndPadding;
        ComposerKt.sourceInformationMarkerStart(composer, 1018496720, "C(calculateAfterContentPadding)*361@16056L7:Carousel.kt#dcf9yb");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1018496720, i2, -1, "androidx.compose.material3.carousel.calculateAfterContentPadding (Carousel.kt:353)");
        }
        composer.startReplaceGroup(-587616383);
        ComposerKt.sourceInformation(composer, "358@16007L7");
        if (orientation == Orientation.Vertical) {
            fCalculateEndPadding = paddingValues.mo968calculateBottomPaddingD9Ej5fM();
        } else {
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composer.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd(composer);
            fCalculateEndPadding = PaddingKt.calculateEndPadding(paddingValues, (LayoutDirection) objConsume);
        }
        composer.endReplaceGroup();
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume2 = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        float fMo710toPx0680j_4 = ((Density) objConsume2).mo710toPx0680j_4(fCalculateEndPadding);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return fMo710toPx0680j_4;
    }

    public static final Modifier carouselItem(Modifier modifier, final int i2, final CarouselState carouselState, final Function0<Strategy> function0, final CarouselItemInfoImpl carouselItemInfoImpl, final Shape shape) {
        return LayoutModifierKt.layout(modifier, new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.material3.carousel.CarouselKt.carouselItem.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                return m2904invoke3p2s80s(measureScope, measurable, constraints.m6597unboximpl());
            }

            /* JADX INFO: renamed from: invoke-3p2s80s, reason: not valid java name */
            public final MeasureResult m2904invoke3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
                long jM6581copyZbe2FdA;
                final Strategy strategyInvoke = function0.invoke();
                if (!strategyInvoke.isValid()) {
                    return MeasureScope.layout$default(measureScope, 0, 0, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.carousel.CarouselKt.carouselItem.1.1
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Placeable.PlacementScope placementScope) {
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                            invoke2(placementScope);
                            return Unit.INSTANCE;
                        }
                    }, 4, null);
                }
                final boolean z2 = carouselState.getPagerState$material3_release().getLayoutInfo().getOrientation() == Orientation.Vertical;
                final boolean z3 = measureScope.getLayoutDirection() == LayoutDirection.Rtl;
                float itemMainAxisSize = strategyInvoke.getItemMainAxisSize();
                if (z2) {
                    jM6581copyZbe2FdA = Constraints.m6581copyZbe2FdA(j2, Constraints.m6593getMinWidthimpl(j2), Constraints.m6591getMaxWidthimpl(j2), MathKt.roundToInt(itemMainAxisSize), MathKt.roundToInt(itemMainAxisSize));
                } else {
                    jM6581copyZbe2FdA = Constraints.m6581copyZbe2FdA(j2, MathKt.roundToInt(itemMainAxisSize), MathKt.roundToInt(itemMainAxisSize), Constraints.m6592getMinHeightimpl(j2), Constraints.m6590getMaxHeightimpl(j2));
                }
                final Placeable placeableMo5514measureBRTryo0 = measurable.mo5514measureBRTryo0(jM6581copyZbe2FdA);
                int width = placeableMo5514measureBRTryo0.getWidth();
                int height = placeableMo5514measureBRTryo0.getHeight();
                final CarouselState carouselState2 = carouselState;
                final int i3 = i2;
                final CarouselItemInfoImpl carouselItemInfoImpl2 = carouselItemInfoImpl;
                final Shape shape2 = shape;
                return MeasureScope.layout$default(measureScope, width, height, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.carousel.CarouselKt.carouselItem.1.2
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
                        Placeable placeable = placeableMo5514measureBRTryo0;
                        final CarouselState carouselState3 = carouselState2;
                        final Strategy strategy = strategyInvoke;
                        final int i4 = i3;
                        final boolean z4 = z2;
                        final CarouselItemInfoImpl carouselItemInfoImpl3 = carouselItemInfoImpl2;
                        final Shape shape3 = shape2;
                        final boolean z5 = z3;
                        Placeable.PlacementScope.placeWithLayer$default(placementScope, placeable, 0, 0, 0.0f, new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.carousel.CarouselKt.carouselItem.1.2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                invoke2(graphicsLayerScope);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                                float fCalculateCurrentScrollOffset = CarouselKt.calculateCurrentScrollOffset(carouselState3, strategy);
                                float fCalculateMaxScrollOffset = CarouselKt.calculateMaxScrollOffset(carouselState3, strategy);
                                KeylineList keylineListForScrollOffset$material3_release$default = Strategy.getKeylineListForScrollOffset$material3_release$default(strategy, fCalculateCurrentScrollOffset, fCalculateMaxScrollOffset, false, 4, null);
                                KeylineList keylineListForScrollOffset$material3_release = strategy.getKeylineListForScrollOffset$material3_release(fCalculateCurrentScrollOffset, fCalculateMaxScrollOffset, true);
                                float itemMainAxisSize2 = ((i4 * (strategy.getItemMainAxisSize() + strategy.getItemSpacing())) + (strategy.getItemMainAxisSize() / 2.0f)) - fCalculateCurrentScrollOffset;
                                Keyline keylineBefore = keylineListForScrollOffset$material3_release$default.getKeylineBefore(itemMainAxisSize2);
                                Keyline keylineAfter = keylineListForScrollOffset$material3_release$default.getKeylineAfter(itemMainAxisSize2);
                                Keyline keylineLerp = KeylineListKt.lerp(keylineBefore, keylineAfter, CarouselKt.getProgress(keylineBefore, keylineAfter, itemMainAxisSize2));
                                boolean zAreEqual = Intrinsics.areEqual(keylineBefore, keylineAfter);
                                float fM4003getHeightimpl = (z4 ? Size.m4003getHeightimpl(graphicsLayerScope.mo4365getSizeNHjbRc()) : strategy.getItemMainAxisSize()) / 2.0f;
                                float itemMainAxisSize3 = (z4 ? strategy.getItemMainAxisSize() : Size.m4003getHeightimpl(graphicsLayerScope.mo4365getSizeNHjbRc())) / 2.0f;
                                float fM4006getWidthimpl = (z4 ? Size.m4006getWidthimpl(graphicsLayerScope.mo4365getSizeNHjbRc()) : keylineLerp.getSize()) / 2.0f;
                                float size = (z4 ? keylineLerp.getSize() : Size.m4003getHeightimpl(graphicsLayerScope.mo4365getSizeNHjbRc())) / 2.0f;
                                Rect rect = new Rect(fM4003getHeightimpl - fM4006getWidthimpl, itemMainAxisSize3 - size, fM4003getHeightimpl + fM4006getWidthimpl, itemMainAxisSize3 + size);
                                carouselItemInfoImpl3.setSizeState(keylineLerp.getSize());
                                CarouselItemInfoImpl carouselItemInfoImpl4 = carouselItemInfoImpl3;
                                Iterator<Keyline> it = keylineListForScrollOffset$material3_release.iterator();
                                if (!it.hasNext()) {
                                    throw new NoSuchElementException();
                                }
                                Keyline next = it.next();
                                if (it.hasNext()) {
                                    float size2 = next.getSize();
                                    do {
                                        Keyline next2 = it.next();
                                        float size3 = next2.getSize();
                                        if (Float.compare(size2, size3) > 0) {
                                            next = next2;
                                            size2 = size3;
                                        }
                                    } while (it.hasNext());
                                }
                                carouselItemInfoImpl4.setMinSizeState(next.getSize());
                                carouselItemInfoImpl3.setMaxSizeState(keylineListForScrollOffset$material3_release.getFirstFocal().getSize());
                                carouselItemInfoImpl3.setMaskRectState(rect);
                                graphicsLayerScope.setClip(!Intrinsics.areEqual(rect, new Rect(0.0f, 0.0f, Size.m4006getWidthimpl(graphicsLayerScope.mo4365getSizeNHjbRc()), Size.m4003getHeightimpl(graphicsLayerScope.mo4365getSizeNHjbRc()))));
                                graphicsLayerScope.setShape(shape3);
                                float offset = keylineLerp.getOffset() - itemMainAxisSize2;
                                if (zAreEqual) {
                                    offset += (itemMainAxisSize2 - keylineLerp.getUnadjustedOffset()) / keylineLerp.getSize();
                                }
                                if (z4) {
                                    graphicsLayerScope.setTranslationY(offset);
                                    return;
                                }
                                if (z5) {
                                    offset = -offset;
                                }
                                graphicsLayerScope.setTranslationX(offset);
                            }
                        }, 4, (Object) null);
                    }
                }, 4, null);
            }
        });
    }

    public static final float calculateCurrentScrollOffset(CarouselState carouselState, Strategy strategy) {
        float itemMainAxisSize = strategy.getItemMainAxisSize() + strategy.getItemSpacing();
        return ((carouselState.getPagerState$material3_release().getCurrentPage() * itemMainAxisSize) + (carouselState.getPagerState$material3_release().getCurrentPageOffsetFraction() * itemMainAxisSize)) - KeylineSnapPositionKt.getSnapPositionOffset(strategy, carouselState.getPagerState$material3_release().getCurrentPage(), carouselState.getPagerState$material3_release().getPageCount());
    }

    public static final float calculateMaxScrollOffset(CarouselState carouselState, Strategy strategy) {
        float pageCount = carouselState.getPagerState$material3_release().getPageCount();
        return RangesKt.coerceAtLeast(((strategy.getItemMainAxisSize() * pageCount) + (strategy.getItemSpacing() * (pageCount - 1))) - strategy.getAvailableSpace(), 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getProgress(Keyline keyline, Keyline keyline2, float f2) {
        if (Intrinsics.areEqual(keyline, keyline2)) {
            return 1.0f;
        }
        return (f2 - keyline.getUnadjustedOffset()) / (keyline2.getUnadjustedOffset() - keyline.getUnadjustedOffset());
    }
}
