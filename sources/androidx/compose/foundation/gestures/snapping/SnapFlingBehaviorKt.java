package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.ClosedFloatingPointRange;
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
/* JADX INFO: compiled from: SnapFlingBehavior.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яć\u0014D߬)\u001ew\tL܀kt\u001aA\u000e0\u00110J~01\u001aw\rgr9FDmH4U[*\u001dk\u0004é,[:qK;c&\u0006̝\u0011OdgoñRZ!C\u0017\u0006\u001cyr,_U\u0001ز\u001a\u000fHBwЀ;M\u0006=A`\u000b6\r H\"@y\u000b\u0001\"*^\u0010~ٙKK\"\u00128@\u0007:Z\rS\u000e\"\u0012\u001c>(\u0001$_oNDUt]P/+\u0003oCfOm8\u0015M;L\u0005+\u001b\u007fy\u001eYJg9#0k\u00035X\fC\u0011K\n=3nmݐɛH֕ɱ:Z\u0006!#9g\"k\u0002>\\3a\u0011\u00165<gi[R\u001e(&\u000e*\u001f\u0003ǌ\u0014\u001e:VBE\u001a\u0015\u001d>7\u0003\tk@~\u0019%Gȸ~aD/=(ADQ\u001b\u0015f\u0012?'dO{3$N-\u000f\t9ad\u0010p\u0015IZ&la[NY`T\u001a[Mm2v\u0011\u001fBm>e\u0018;\f\u0013>\u0017S=k;3!\u001a\"vc\u0010v3\u0002\u0019Wwt`@PtFG8,$fTf\u0015k~Zh.!MJt5\"8\u001d.v\u0010B1' N}n\u0018\u0006}|\u0018JG\u0002Gj~z<]ߍb=;xs\u0016gz\u0007\u0016EB\t.hhRS:j\u000bNhø\u0007н\u0014w\nnf}!]W},6<1Gb%J\u0013\u001epa+(\bZ\u00171/XAF\u001biRz9\u0005^\t\to\u0016~y<\u000b\u0004:9QSE\u0019T[2jD|Q'-\u00180Quy_R|\u0018\u0006U*&D7ip=b+*\u000f:B\u0011[KʆvoWt\"-\u0001%\n\u0011AnT\u0011\u0018l\u0001,\u000fzxu\u001bϢ`Ցbr16|c\b\u0011^\u0007Wed\u000b\nDYt\u0013Yjnf\u001c-\u001fLF1s0-M-q-M\u001a\u0006EG\u0015\u0010c\u001a\u007f<,z\u001b6vu\u0004Zi&qrQ\fRikyx\rc:?|\u0014RW\u0019}ڇF\u0013:4CNG\r\u0001X>S1X\u000eh\u0017,;\u0001\u0005\u0002\u0001ܧ.ϻ8.m^\fU\fIvCS\u0017uS\u0016s\u001eOjAb\u000f8\u0011B1\u00078*t8V\u001e\u001b)<\f\u058c&niAr\u0007L\tjlZu0\u0011SVy\u0006V3.\u0001&ʘ\u0017ЋFsI\u0012&z\u0007\u0019nHK\u0019el'ơ\u000f779.zE1K&t\u000eWiB\u0003c\u001dOS\u0019\nEܽ%ŠHTGVHd\u000fՊ]]qHXԐVھ-msƑ,L&|5BF\u001c\u0010ܲ\u0013چz8f\u000bchff|\u0014tUn.7\u0004\u0013|<B`ۈ]ĢSrwۮMX\\~OCH\u0007m\u05ee{ܰ\u0010|k˪ɔ-\u000b=0CƸ\u0007B&ٜ[\u0011"}, d2 = {"\u0012D1\":", "", "\u001bh]\u0013_0GU\n~\u0002h*\u0001\u0018CD\u000b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "5dc\u001a\\5\u001fZ\u001d\b|O,\u0004\u0013-i\u000f<ZK", "u(5", "\u0014", "\u001cn36f;:\\\u0017~", "", "\u001cnE2_6<W(\u0013", "1`[0h3:b\u0019_~g(\u0004r0f\u000e(\u000b", "AmP=c0GU\u0003\u007f{l,\f", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w[L7v?\"\u001ej+\u001a\u000bl(Ud0CWY0eTVL\u0014\u001a0", ":nf2e\tHc\"}", "Co_2e\tHc\"}", "1`[0h3:b\u0019_~g(\u0004r0f\u000e(\u000b\ba\u001a#W;\u000e\u0007", "uH5\u0013\u001c\r", "2dQBZ\u0013HU", "", "5d]2e(MS\u0001\r|", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "@d\\2`)>`\u0007\bvi\r\u0004\r8g\\(~<\u0012\u001b!T", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w<?Hm4-\u0015gB@\u000bl.+v*C]R6i(", "AmP=?(R])\u000e^g-\u0007s<o\u0011,z@\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w[L7v?\"\u001ej+'\u0010_75r;Q\\]\u0010eS|(!\u001ck\u0012M+\u001aZ", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn7Y\f/Gz\u0016<\u0017QDg?)\u0019qc\u0003tl(Y]#[V^;@[sG~\u001fd\u001fR*\r\u0012/( wCD)\f+\\K9r\t\u0017 \u001c54}R_\u001fK\u0002\u0015?\u001f3pQcmyT\u0017)&\u0011`\u0015^*f>97]o##sZ<\nET\u001b\u0003[xcvK#\u0004\u0002&>{jVRoc\u0006c#,M{\u0007\u001219{/}/`4-2u\tUtm", "AmP=93B\\\u001b[za(\u000e\r9r", "2dR.l\bGW!z\nb6\u0006v:e}", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG~7k\u0012B)L?s0-\u0019rj'\u0012c*$", "AmP=45B[\u0015\u000e~h5j\u0014/c", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\")\u0015f7", "/mX:T;>2\u0019|vr", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w[L7v?\"\u001ej+\u0015\u0010g4J\u0006+QU;,jbyLi", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkFRB\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w;AHu;%\u0003fkD\u00079", "B`a4X;(T\u001a\rzm", "/mX:T;B]\"l\nZ;|", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\"-\u0011wa\u000f", "=m0;\\4:b\u001d\t\u0004L;|\u0014", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "2d[AT", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn7Y\f/Gz\u0016<\u001719x>%\u001cV_C\u0012c\u0002/]#PK[6`Q\u0006\u0007\u0012\u001cb\u0019X9\rNUJ(v@F#\u00125\u0013\u007fEu\u0001Uq\u00179rlQZ\u001aPg$qP)>-UhxTKIa=.\ni%gDH$]m\"\u001fpL=\u000e\u0006\\Zp\\\u0007g1&\u0019x48\u001av_NA~YF}\u0015*KyMx8b\u00042x6M9;>.\u0006[p\u0016Mb\u0003\u001e:&\"7/4K\u0017IT/KSD\u0018w&e\u0011W`?>#utgQ\u000f\u0015'te>pc\nGN\u0015BSxjj-\u0004>lu^\u0010\u0003-o/3@ T~)F", "/mX:T;>E\u001d\u000e}M(\n\u000b/t", "1`]0X3(T\u001a\rzm", "/mX:T;B]\"l\u0006^*", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn7Y\f/Gz\u0016<\u001719x>%\u001cV_C\u0012c\u0002/W\u000eCUM9fVqP]\u0010d\u0016Y5\u001b\u0005#=-rL3.\f6RK9r\u000e\f_i>nx>e\u0014Q\u0003\u0003\u0005=8h\u001c@[\u0003FNOf)wU]'dED2\u0014;\u0015$lX*\u0019\u007f]\u001a<P\u0004tg\u0011t\u0004<,:|_PN]`<r|\u0006Q\u0006\u0007\u00196a>0\u00065M5:?b\u0014Oq!L(Y%5ZP+0?\bh&Qm\u0005sB\u00172\u001dk\u0015\u0018rD5\"es-&\u0019\u0010l\u001bdE]n\u0005A[[\u00020t\u00118BHIW\u0003\u0017Rp!reGRp", "/o_?b(<V", "7mXA\\(EB\u0015\f|^;f\n0s\u007f7", "7mXA\\(ED\u0019\u0006\u0005\\0\f\u001d", "/mX:T;B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w[L7v?\"\u001ej+\u0015\u0012n9Xr%J(W0dN\u0002A\u001e\u001b0", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn7Y\f/Gz\u0016<\u001719x>%\u001cV_C\u0012c\u0002/W\u000eCUM9fVqP]\u0010d\u0016Y5\u001b\u0005#B.~M6\u001b\u00170S\u000b\u0005j\u0001\u001a%\u001eBj~\fd\u0019C\u0005 yJ+2\"dj\u0007Q=Ce\u0006m\u0010g\u0019k>D-iX\u001f%wW2\u0013EX\"z\u001czwpE(~B-L7<VNmd@~0j!b}\u001cA_x4>+\u000eA4Fs\tTg&\b<\u0003\u001e;`J7\"E@\u001dH!'\\q:\u001fdhh\u0004\u0017d~\u001b\u0016jeaWd", "1nT?V,-]\bz\b`,\f", "B`a4X;", "1n\\=b5>\\(J", "\"", "", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\rl\n6{?a\u001e!C~\u0012Ex\u0010?]\u0007/$i\u001f0M\u0019", "uKZ<g3B\\b\fvg.|\u0017xC\u00072\n@\u007fw\u001eQk\u001d@\u007f' c\u0002)FZ\u00127OC\u0011/\u001b#\u0011y]\u0003\u000e_5P@\u0005QTY(iNoD\u0014g", "1n\\=b5>\\(K", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SnapFlingBehaviorKt {
    private static final boolean DEBUG = false;
    private static final float MinFlingVelocityDp = Dp.m6638constructorimpl(400);
    public static final float NoDistance = 0.0f;
    public static final float NoVelocity = 0.0f;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1, reason: invalid class name */
    /* JADX INFO: compiled from: SnapFlingBehavior.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0007\u0006\u0015\u0017\u0019\u0017\u000b\u001aU\u001c\u0018\f\u001c\u001d\u0017\u001d\u0017^\u0005!\u0015%{#!'!|!%\u001f5)04\u000e8", f = " :,:\u000f404,\u0006(*\"6(-/i&.", i = {0, 0, 0}, l = {334}, m = "0>:?4H:\u001a<;:S", n = {"PdkSSjKVD-Z+K?", "_hg\\[eWZ,;R?<", "cWtMWj1M<MK>"}, s = {"xQ^", "xQ_", "rQ^"})
    static final class AnonymousClass1 extends ContinuationImpl {
        float F$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SnapFlingBehaviorKt.animateDecay(null, 0.0f, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SnapFlingBehavior.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0007\u0006\u0015\u0017\u0019\u0017\u000b\u001aU\u001c\u0018\f\u001c\u001d\u0017\u001d\u0017^\u0005!\u0015%{#!'!|!%\u001f5)04\u000e8", f = " :,:\u000f404,\u0006(*\"6(-/i&.", i = {0, 0, 0, 0}, l = {379}, m = "0>:?4H:-@LA.<NDCS", n = {"PdkSSjKVD-Z+K?", "RepYgcGK+J:9%I6", "cWtMWj1M<MK>", "XdkZ[WN=;FU-@N8"}, s = {"xQ^", "xQ_", "rQ^", "rQ_"})
    static final class C04761 extends ContinuationImpl {
        float F$0;
        float F$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C04761(Continuation<? super C04761> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            int i2 = this.label;
            this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
            return SnapFlingBehaviorKt.animateWithTarget(null, 0.0f, 0.0f, null, null, null, this);
        }
    }

    private static final boolean calculateFinalOffset_Fhqu1e0$isValidDistance(float f2) {
        return (f2 == Float.POSITIVE_INFINITY || f2 == Float.NEGATIVE_INFINITY) ? false : true;
    }

    private static final void debugLog(Function0<String> function0) {
    }

    public static final TargetedFlingBehavior snapFlingBehavior(SnapLayoutInfoProvider snapLayoutInfoProvider, DecayAnimationSpec<Float> decayAnimationSpec, AnimationSpec<Float> animationSpec) {
        return new SnapFlingBehavior(snapLayoutInfoProvider, decayAnimationSpec, animationSpec);
    }

    public static final TargetedFlingBehavior rememberSnapFlingBehavior(SnapLayoutInfoProvider snapLayoutInfoProvider, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1921733134, "C(rememberSnapFlingBehavior)257@10415L7,258@10485L26,259@10523L340:SnapFlingBehavior.kt#ppz6w6");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1921733134, i2, -1, "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (SnapFlingBehavior.kt:256)");
        }
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Object obj = (Density) objConsume;
        DecayAnimationSpec decayAnimationSpecRememberSplineBasedDecay = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        ComposerKt.sourceInformationMarkerStart(composer, 962717891, "CC(remember):SnapFlingBehavior.kt#9igjgp");
        boolean zChanged = composer.changed(decayAnimationSpecRememberSplineBasedDecay) | (((((-1) - (((-1) - i2) | ((-1) - 14))) ^ 6) > 4 && composer.changed(snapLayoutInfoProvider)) || (i2 + 6) - (i2 | 6) == 4) | composer.changed(obj);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = snapFlingBehavior(snapLayoutInfoProvider, decayAnimationSpecRememberSplineBasedDecay, AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null));
            composer.updateRememberedValue(objRememberedValue);
        }
        TargetedFlingBehavior targetedFlingBehavior = (TargetedFlingBehavior) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return targetedFlingBehavior;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object approach(ScrollScope scrollScope, float f2, float f3, ApproachAnimation<Float, AnimationVector1D> approachAnimation, Function1<? super Float, Unit> function1, Continuation<? super AnimationResult<Float, AnimationVector1D>> continuation) {
        return approachAnimation.approachAnimation(scrollScope, Boxing.boxFloat(f2), Boxing.boxFloat(f3), function1, continuation);
    }

    private static final <T extends Comparable<? super T>> T component1(ClosedFloatingPointRange<T> closedFloatingPointRange) {
        return closedFloatingPointRange.getStart();
    }

    private static final <T extends Comparable<? super T>> T component2(ClosedFloatingPointRange<T> closedFloatingPointRange) {
        return closedFloatingPointRange.getEndInclusive();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object animateDecay(final androidx.compose.foundation.gestures.ScrollScope r6, final float r7, androidx.compose.animation.core.AnimationState<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r8, androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> r9, final kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> r10, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.snapping.AnimationResult<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>> r11) {
        /*
            boolean r0 = r11 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.AnonymousClass1
            if (r0 == 0) goto L6f
            r5 = r11
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1 r5 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r2 + r1
            r2 = r2 | r1
            int r0 = r0 - r2
            if (r0 == 0) goto L6f
            int r0 = r5.label
            int r0 = r0 - r1
            r5.label = r0
        L16:
            java.lang.Object r1 = r5.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L3d
            if (r0 != r3) goto L75
            float r7 = r5.F$0
            java.lang.Object r2 = r5.L$1
            kotlin.jvm.internal.Ref$FloatRef r2 = (kotlin.jvm.internal.Ref.FloatRef) r2
            java.lang.Object r8 = r5.L$0
            androidx.compose.animation.core.AnimationState r8 = (androidx.compose.animation.core.AnimationState) r8
            kotlin.ResultKt.throwOnFailure(r1)
        L30:
            androidx.compose.foundation.gestures.snapping.AnimationResult r1 = new androidx.compose.foundation.gestures.snapping.AnimationResult
            float r0 = r2.element
            float r7 = r7 - r0
            java.lang.Float r0 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r7)
            r1.<init>(r0, r8)
            return r1
        L3d:
            kotlin.ResultKt.throwOnFailure(r1)
            kotlin.jvm.internal.Ref$FloatRef r2 = new kotlin.jvm.internal.Ref$FloatRef
            r2.<init>()
            java.lang.Object r0 = r8.getVelocity()
            java.lang.Number r0 = (java.lang.Number) r0
            float r1 = r0.floatValue()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L6c
            r1 = r3
        L55:
            r1 = r1 ^ r3
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$2 r0 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$2
            r0.<init>()
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r5.L$0 = r8
            r5.L$1 = r2
            r5.F$0 = r7
            r5.label = r3
            java.lang.Object r0 = androidx.compose.animation.core.SuspendAnimationKt.animateDecay(r8, r9, r1, r0, r5)
            if (r0 != r4) goto L6e
            return r4
        L6c:
            r1 = 0
            goto L55
        L6e:
            goto L30
        L6f:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1 r5 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1
            r5.<init>(r11)
            goto L16
        L75:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.animateDecay(androidx.compose.foundation.gestures.ScrollScope, float, androidx.compose.animation.core.AnimationState, androidx.compose.animation.core.DecayAnimationSpec, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateDecay$consumeDelta(AnimationScope<Float, AnimationVector1D> animationScope, ScrollScope scrollScope, Function1<? super Float, Unit> function1, float f2) {
        float fScrollBy = scrollScope.scrollBy(f2);
        function1.invoke(Float.valueOf(fScrollBy));
        if (Math.abs(f2 - fScrollBy) > 0.5f) {
            animationScope.cancelAnimation();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object animateWithTarget(final androidx.compose.foundation.gestures.ScrollScope r12, float r13, final float r14, androidx.compose.animation.core.AnimationState<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r15, androidx.compose.animation.core.AnimationSpec<java.lang.Float> r16, final kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> r17, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.snapping.AnimationResult<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>> r18) {
        /*
            r3 = r18
            r6 = r15
            boolean r0 = r3 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.C04761
            if (r0 == 0) goto La8
            r11 = r3
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$1 r11 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.C04761) r11
            int r0 = r11.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = (-1) - r0
            int r0 = (-1) - r2
            r1 = r1 | r0
            int r0 = (-1) - r1
            if (r0 == 0) goto La8
            int r0 = r11.label
            int r0 = r0 - r2
            r11.label = r0
        L1c:
            java.lang.Object r3 = r11.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r11.label
            r5 = 1
            if (r0 == 0) goto L60
            if (r0 != r5) goto Laf
            float r2 = r11.F$1
            float r13 = r11.F$0
            java.lang.Object r1 = r11.L$1
            kotlin.jvm.internal.Ref$FloatRef r1 = (kotlin.jvm.internal.Ref.FloatRef) r1
            java.lang.Object r6 = r11.L$0
            androidx.compose.animation.core.AnimationState r6 = (androidx.compose.animation.core.AnimationState) r6
            kotlin.ResultKt.throwOnFailure(r3)
        L38:
            java.lang.Object r0 = r6.getVelocity()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            float r8 = coerceToTarget(r0, r2)
            androidx.compose.foundation.gestures.snapping.AnimationResult r2 = new androidx.compose.foundation.gestures.snapping.AnimationResult
            float r0 = r1.element
            float r13 = r13 - r0
            java.lang.Float r1 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r13)
            r14 = 29
            r15 = 0
            r7 = 0
            r9 = 0
            r11 = 0
            r13 = 0
            androidx.compose.animation.core.AnimationState r0 = androidx.compose.animation.core.AnimationStateKt.copy$default(r6, r7, r8, r9, r11, r13, r14, r15)
            r2.<init>(r1, r0)
            return r2
        L60:
            kotlin.ResultKt.throwOnFailure(r3)
            kotlin.jvm.internal.Ref$FloatRef r1 = new kotlin.jvm.internal.Ref$FloatRef
            r1.<init>()
            java.lang.Object r0 = r6.getVelocity()
            java.lang.Number r0 = (java.lang.Number) r0
            float r2 = r0.floatValue()
            java.lang.Float r7 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r13)
            java.lang.Object r0 = r6.getVelocity()
            java.lang.Number r0 = (java.lang.Number) r0
            float r3 = r0.floatValue()
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto La5
            r0 = r5
        L86:
            r9 = r0 ^ 1
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$2 r10 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$2
            r0 = r17
            r10.<init>()
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            r11.L$0 = r6
            r11.L$1 = r1
            r11.F$0 = r13
            r11.F$1 = r2
            r11.label = r5
            r6 = r6
            r8 = r16
            java.lang.Object r0 = androidx.compose.animation.core.SuspendAnimationKt.animateTo(r6, r7, r8, r9, r10, r11)
            if (r0 != r4) goto La7
            return r4
        La5:
            r0 = 0
            goto L86
        La7:
            goto L38
        La8:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$1 r11 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$1
            r11.<init>(r3)
            goto L1c
        Laf:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.animateWithTarget(androidx.compose.foundation.gestures.ScrollScope, float, float, androidx.compose.animation.core.AnimationState, androidx.compose.animation.core.AnimationSpec, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float coerceToTarget(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        return f3 > 0.0f ? RangesKt.coerceAtMost(f2, f3) : RangesKt.coerceAtLeast(f2, f3);
    }

    public static final float getMinFlingVelocityDp() {
        return MinFlingVelocityDp;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    /* JADX INFO: renamed from: calculateFinalOffset-Fhqu1e0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final float m864calculateFinalOffsetFhqu1e0(int r3, float r4, float r5) {
        /*
            androidx.compose.foundation.gestures.snapping.FinalSnappingItem$Companion r0 = androidx.compose.foundation.gestures.snapping.FinalSnappingItem.Companion
            int r0 = r0.m861getClosestItembbeMdSM()
            boolean r0 = androidx.compose.foundation.gestures.snapping.FinalSnappingItem.m857equalsimpl0(r3, r0)
            r2 = 0
            if (r0 == 0) goto L22
            float r1 = java.lang.Math.abs(r5)
            float r0 = java.lang.Math.abs(r4)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L1a
        L19:
            r4 = r5
        L1a:
            boolean r0 = calculateFinalOffset_Fhqu1e0$isValidDistance(r4)
            if (r0 == 0) goto L21
            r2 = r4
        L21:
            return r2
        L22:
            androidx.compose.foundation.gestures.snapping.FinalSnappingItem$Companion r0 = androidx.compose.foundation.gestures.snapping.FinalSnappingItem.Companion
            int r0 = r0.m862getNextItembbeMdSM()
            boolean r0 = androidx.compose.foundation.gestures.snapping.FinalSnappingItem.m857equalsimpl0(r3, r0)
            if (r0 == 0) goto L2f
            goto L19
        L2f:
            androidx.compose.foundation.gestures.snapping.FinalSnappingItem$Companion r0 = androidx.compose.foundation.gestures.snapping.FinalSnappingItem.Companion
            int r0 = r0.m863getPreviousItembbeMdSM()
            boolean r0 = androidx.compose.foundation.gestures.snapping.FinalSnappingItem.m857equalsimpl0(r3, r0)
            if (r0 == 0) goto L3c
            goto L1a
        L3c:
            r4 = r2
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.m864calculateFinalOffsetFhqu1e0(int, float, float):float");
    }
}
