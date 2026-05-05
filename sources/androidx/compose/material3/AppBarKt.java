package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.tokens.BottomAppBarTokens;
import androidx.compose.material3.tokens.TopAppBarLargeTokens;
import androidx.compose.material3.tokens.TopAppBarMediumTokens;
import androidx.compose.material3.tokens.TopAppBarSmallTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.photoshop.PhotoshopDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
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
/* JADX INFO: compiled from: AppBar.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯĽ\u0014D߬)\u001e\u007f\u007fLDi}\fA\u001c0\u0013.H\u007f*, w\u000f߿r9FDmHDR[*%k\u00044:[,ڎK;k\u001a\u0006̝\u0011OdgoñRZ!C\u0017\u0006\u001cyr,_U\u0001ز\u001a\u000fHBw?9Nw=O`|6\u000b&:\"Ny\rЏ\"*V\u0015~zIO\u0014\u0012F@x:h\rU\u0005 \u001c\u000e>6\u0001&ձoNDQt]@3+\u0003\u007fBV'e3\u0005M#F\\܋\u0015vw\u001e3¨?5#+[\u0003\r[c?\u0019?y=\u000bh/'AI{W<Y\b\u0014++WՕer<\\\rQf\u0010?ˇNqYh\u000eV\u0007+\u0016\u001bL\u001c$\u0016)X.[,v\n\u001e3#\u0002\u0002Qг\u0006^H\u0013ѐe6\u001d90919){iai/~J\u0002\u0005\u001b5;\u000e~#kT<o+\u001a\u0003\u0010Φ5QFPxT\u0010YK\u0007\u001cp\u0011\u001cZ\n6G\u000eJ\u0014\u0011\\1U=a91=\u0004\u0002vC\u0018|\u000b`vp\u0002Rv^Rt\u001c78($Zr\u0005KpĥSА¯\u0015O\"u\u0015  ˆ\u001fj\u0006T!S\u001f~ivy\u0003cm\f5/\u0015Iip{\u000e\u0006H\rD̳Uc\u0016t؏z\u0014EP\u0013\u000b^fPh$Z\u000b>RENj\u001e\u000f\u0014Q^\u000e#2m\u000123ZIǬ`\u0015N\u0016NHG|\u0017xrh>\u0019\u00059*\u0003w?\r\t/j\rvug\u0007eD|\u000f!]GW5'Cm\"\u0017R-)\r~\u0002\u001f_gzg|t\u001cuc\u001f8\u001808\u007fS\u0004\u0018ĺ}ǻɨ\u0006/Kq\u0001\fi8 5\u0013|(\u001ekn4g\u0016\u007f\t,\u000f\u0001zUZ\u00170\u0010vrQ\"\u0015\u0006\u007faT\u0016_c\u0003%\fDOr\u0011uTNf{5%$%\u000f\r:|cKs-#\u0016\u00063G\u0015\u0010}\u001a\n<!z%6vu\u0004Zu&qrQ\fAiIա]~D5ٝp\u0003H\\1|\u06ddAކΌ\u00115Nir\u001an/[\u0019G}\u0015\u0016\\\u0013vViO+o,J^e0sQ\u0017,^q?ASYg{\tc\\9d?\u0010\u0011{?\u000b*\u001ck\u001f\u0007]h\t>#\f\u0018d_kh\u000b<\u0017CL,j(;KZi\u00143\u0013\u0002\\^=;b\\\u0002bn$dzlVv\u0017pGp!X\u0010- ʟ\"x;DܭqFZC*7ޥR߹͢\u001flU)tPCbbe3(\u0007.;Ikqa\u0002d3w-{\u001c\b\ffG-!PI39\u007f@&{H\\\u0019\b|N\u0013\u0006Bu`\u0002:4\u000f|\r\u000ej\u0019=#ĢSruu]RTwEX2\u0001EZY\u0018\u0012|qz38\u00167==wyB?ٖ[SA\u00118<&'\u0012\u00059rg\u0010v\n\f-J\u0018\u0002\u0016\u0011\u00117$ц$\u00044]ƶv\n4\u001cfU\b3\u00102vY\u001a\u0018QF-+z;ZK\u0017/:krc|x#\u0005|0\u0005152ȃ!\t5\u0006F\u008cWhl)SNgA\u000f\"H>*F\nr)>^\u0012\u0001ӗoOa [5q*oFHRL\u0014O\u000b{\u00048\t@ KX]>\u0013\u0018\u000b\u0005ܣ[\u000ed}X\u0001z\f7$\u0015\u0015X`!\u0013bX\u0003 t/e(MlǏK`\r\u0017٣M&'E\u0003E!7@D\b(%\u00103@ht\u000eIZ\t! \u001823Fbr2'\bZ\u001el\t&YhPD\u001e+?EW4ם7Ԍۋ`\u001c\"u_nY\u0017\u001f=-84~7(C\u001ei^5,\u0011|/\u001cm\u0012܊o:yJ#)5\u000f}0ofi;evR'\u001a6}U\u000fOsV=pZaˢI\u001e\u007fhp\u001c\u0010\u001f24\u001e\f3\u0002U1v<o^PV\"f27ń:nJ6ؼpxy\u001e\\o\u001esrzy4o\u001bD\u001fJ>8b\u0005\u0007s\u0004\u0019\u0002\u0011D\u001bh,9%\u0005Wj]\u0002ӻSqNca\u05f5L=\u0019u<A\u00034I@\u0015N\u0005WBi*4<@lŀnjsd\u0010\u0016>\u0012\u001b\"\u001cw_h\u0011\u0011f\u001d&[c\u0002V8lx{P\u0011#ڝ\u0013$dAr(\u0011\u0006$>`-\u0012\u007fZ`C%CI\u0004Au!\u0005\rؗ!\u0011a8͘)gp[o[wXKvK\u000b\u001cI\t;k\\\u0013\u000f9K\u0013*E\u0006p+<fn>HJ\t\f\u0014Er}(D'zXu60>s\u0017\\Y\\/SeB\u05ee\u0014֧ܢ6d=\u001arPC5e/jUQ<)\u0011\u0011CY$#\r.SgAQ\fԿ5>\u0002\u001b\rO[|{^(\u0003\u0010`Q@\f?=ucwfgO\u0019\u0006N-$ԯ+$\f&T~m\u0013w\u001e:u\u0013NFVWZ[[!fpy=\fȁ\u0010.\u0012K˴\n=\f%\u0013\";;m_D.\u001f)wUp{8\u001b\bf#\u0010}M1u'aIs'b}\u0017ZsӐ`XLOoۍ?!B2\u001dTp,W7c/`sozs\u0003o?qۨo0j\r#lj>qSTH\u001b/\u0017`\u0004\u001b_xz\u0014prXA>q\u001bDɒ:Hp,1\u001dQa%$OZ\u0007%w3h4q$c]SVx\u0017¤na}(ٛa3<! 2\u0003\u0015\u0013{~r2k5S6\u0004yhJF\t?L3`'{\b *<,-\u000b2na\biuM)\u0015\u0007)\u001e(do;] A:_AϹ1ÌĎ~p^\u001e3m\u0014ݳ\u001e \u0005\u00145\u001bP$\u00029W\u007fdL]L?.x\u0006S%v\"\u0006sJQ^\u0018zˆa.S\u000b7]J\u001dY\u00028fY(\u0016Z?\u0002vzzA0W\u0019\u001aF\u001aZf\u001d\bS!à\u0010/z\t>L{N\f|miDAkgm\u0001U-]\u00016\\ɸq~1ZةM\u0016@c|q\u0004\u0015UTD17s\u0012P(s\u000f{r\u001b\u0006=z4\u001ap,M\u00117\u0003MD\u0019\t\u001e5mĦOݍшA\u0018\u0013[\u0013\u0007\f'1\n=_\u000fv0J\u0017$5BaGt\u000br VxԑB\u0012\u0015[\tl\u0014\u001b\u0010\u001acdH,iV~@YIs\u000fwea\"\u0016W\u001a@߅\u000ew\u001cIM\u001c;9\u001b\u0004htEin\t\u00045\u001e)~O6\u0001^CАaZ&Bؤ\f\u000ePz|V\u0013A\u0015\fFv%\u0013GE\u001b\u00028z:\u001dq\u001cIo\u000b6z^ujic)U5`Ь+0\f>9é@-_&$6\u000f%jB\u0003\u000e\fPJ#\fHR\\ Ą\teR\u0018e\u0010G1Mh\t\u0019Y\u000e\u0010oH\u0005\u001bY93\u001b\u001a8a\u001b\"\u001e-ܹ&C\u0019\nK\n\u000f\u0010*Y=\u001f=S\u0007zHD \"e\u0010m\u0019AsƲ{\u007f'\\ղ4s\u000fa|s\u0004.x)\u0003w\r\u000f\u007fwB]\r\u0017NEV0VXA\u0014p\u0012\\'\n^t\u001f\u0014\u001e-M<4\"m^R#mԤnِǻf\u0014f~|ppֈ49n\u0019&/\u00109'k@,>\bkvh\u001d3\u000fPq_\u000fxL8\u0015\b_74\nY5J\u001cgc*%y\u0005X\"X|D3s?%W`/*6\u000eKPQ˒\u001fs6\u0012G\u0015N.\r\u0004]\u000bAv\u0017BI2w\u000f\r#:1Ap\u001aM_T`\u0016en]oG*F8O#y=R S@UIS[=.x@\r\u000e-7\u0002\\\r9m\u001aј(\u0014H\u0012f\u007fQzV\u0001,6$tPq\u0018LƇFbU=\\\u0013̈Mɳӑuf\u0019;BXRγ\u0019\u0010:a\u0007;5S3\u0011\u001b8\u0018dD\u007fI\u001drU\t\u000fg\u001d\u0011A=\u0018V^dۀ~}\"E\"D\u00066ykd\n0\u001c7\u001ba1`\u0001<_ZL\u0015;Y\u0014\\\u000bp!AJĶ\"\u007f!i\u0017MB&\u000e\\d1\u000eS72&qFoN\f{T\u0005Fƶ:\u001de}/\u000e\u0005f~)O\u0019\"\u0016+\u0011Lou\u0005\u00145Q;آ\u0004S9tР[Sp#x\u001b@\"LBB\u001e;\"8\u000e8\u000b9N\u00188,Wdxtnue\u0013c:\u001a\u0011^=4~\u0013h<n\u007f\f}\u007f<\u07berȩȚ=sfUe\u0007h\u0012Ev#q`p|ed!;\u000e#\u0013xL\u0004\u0019Y\u0002_]j;ev\n\u000e]Fz9F\u001fs\u0019etș<nM-\u0003?5\"ow\nDZF\n\u00036C\\ TAW\u0013D=,',6U4;]Vd\u0010$b\u001aC\u001b\u0017\u000e\u05fe\u0016EK(m\u001diWS%\r1<\u00153\u000eG\tH\r\u0018p4]-n\u0013;\u0002Ek\u001aIXr\fyQ\u001c?\u0011{J\u001fF.g}Y\u001e+j19u\u0017_2cpTĚ\u000f\u008d\u00031fb\u0004*pG,21\u0005s>\u0007o\u0003X\u0013F,\\|K^+\u000e]v%\u001e\fE2vy`)gOxg/`#es\u0002v/\u00039m~.\u001f}D\u00154\fڕ$÷yR\t\fybzγ\u0003x\u0003D\u0013ڛxÇ0DTv.\f,dt97:yx~ш*܍-x-\\pJfS\u0017\u0013\u0002]\u001d2\rdU>Kr\rޒ\u001d\u0379F\u0019\u0003\n\u007f\ryF\u001byNE{X8Ż4ٱ>vs\u0001A\u001b3\u0012\"5,\\\ngSܧwϯ\u0010.8$Qka]3()#\u001b\u000b\u000eٙb؞}bi*Q\u0007%4%O\u0019J\"GEԅB\u0080rX?H5.\u0017\u0001\u0015,$lH\u0013BՃ/ȕyh%eF\u0004\u001d%kNzL;\u001c}ڸ/߭ P\u0011ҖaUA=4\u0019Ҷ;\"[TwĀJ<qѱ6oƳ\">\u00048yt\u0012'\u0013ɹߵ]Ͷ\u000fVD'\u001e\u000fxnI¥ϸ{"}, d2 = {"\u0010ncAb4\u001a^$[vk\u000f\u0007\u00163z\n1\u000b<\b\u0002\u0013Fn\u0012Ex", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "\u0014", "\u0010ncAb4\u001a^$[vk\u001d|\u0016>i}$\u0003+|\u0016\u0016Kx\u0010", "5dc\u000fb;M]!Z\u0006i\tx\u0016 e\r7\u007f>|\u001e\u0002Cn\r@\u007f'", "u(5", "\u0014@1\u0015b9Bh#\b\nZ3g\u0005.d\u00041}", "\u0014@1#X9MW\u0017z\u0002I({\b3n\u0002", "\u001a`a4X\u001bBb ~Wh;\f\u00137P{'zD\n\u0019", "\u001bdS6h4-W(\u0006z;6\f\u00189mj$z?\u0005 \u0019", "\"n_\u000ec7\u001bO&a\u0005k0\u0012\u00138t{/f<\u007f\u0016\u001bPq", "\"n_\u000ec7\u001bO&m~m3|l8s\u007f7", "\"n_!\\;ESt\u0006\u0006a(\\\u0005=i\t*", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG}Gj\u001a,*CPo4+tdo=\u0010e\u0002", "5dc!b7-W(\u0006z:3\b\f+E{6\u007fI\u0003", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001K&+QA\u0018kI\"\u0015uA5\u0015g5PL", "\u0010ncAb4\u001a^$[vk", "", "/bc6b5L", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u00038_19u?\u001ej", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "4k^.g0GUt|\nb6\u0006e?t\u000f2\u0005", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "1n]AT0GS&\\\u0005e6\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "1n]AX5M1#\u0006\u0005k", "Bn]._\fES*z\nb6\u0006", "1n]AX5M>\u0015}yb5~", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u0001*LB?t6\u000f\u0011oq9\u00159", "Eh]1b>\"\\'~\nl", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\b2VBE}\u0018'#hpG\\", "\u0010ncAb4\u001a^$[vksj\u0012<_\u0010\u0019c", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>'S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu^zp/VM0]VrJix`\u0018]2\u0011\u000e#F5v\u000e8/\u0011*X\u0006Eq\u000fUv\u001e>h\u007fF`\u0019\u0014OyZ\"\u0010dOXl\u0004K@X,(n\u0014j'j:\u0004%\u001e\u0002\"\u001ad_2\u0014\u0005\u001d\u0018nf\u0004wv\u0011\u0004v7#Bv]7Ave<\u0003|\u0006G\u0005v\u001f<\\s>>+\u000e<5@r\u0005\u0015h\"Ngw\u0011;`K0o=8'I[r?^B\u0017g)sk\u0017p5@';L_Q\u000e\u0014g\u001bZH+]\u000b?]\u0010LI9\"7O\u000eFcy^f\u0011,xoWC(*d}45", "Aba<_3\u001bS\u001cz\fb6\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006S/Dh\b(\u0013x!\u000bIP)iA(\u001co>9\n_=R\u00014\u001d", "\u0010ncAb4\u001a^$[vks\t\f\u0010Bj:J", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>'S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu^zp/VM0]VrJix`\u0018]2\u0011\u000e#F5v\u000e8/\u0011*X\u0006Eq\u000fUv\u001e>h\u007fF`\u0019\u0014OyZ\"\u0010dOXl\u0004K@X,(n\u0014j'j:\u0004%\u001e\u0002\"\u001ad_2\u0014\u0005\u001d\u0018nf\u0004wv\u0011\u0004v7#Bv]7Ave<\u0003|\u0006G\u0005v\u001f<\\s>>+\u000e<5@r\u0005\u0015h\"Ngw\u0011;`K0o=8'I[r?^B\u0017g)sk\u0017p5@';L_Q\u000e\u0014g\u001bZH+]\u000b?]\u0010LI9\u001d#U~O_u\u001cVP\u0001wtXM#0\f%M@/M\u000f\u0010\rm\u001fx.\u00199j\u0013r75\u001eI\u001c\buB\u0010zl\r\u0013zP\u001bwYr%d\u007f-E|\u0019Ij\u0011UD\u0002\\Qo\u001dk\u0018dNo", "1n]AX5M", "\u0010ncAb4\u001a^$[vksH\u0013\u00164\u0006\u001bN", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b>b\u0001\u001ei\u001f-ZM?jGg\u0013riD\u0011q,\u0018w1WUM(kV|F]\u0019V\"X;\u001cND=#mH@!x(P\u0012;vVr\u0012\u00174wzFU#\u0011w\u001f}L3vF#`\u0004WJD^9h\u0016hfc6N.$\u0001b\rlY-\u0014\u000e7\u001a\u0001R\tu=.\u001f\u0005G+Bv%KVw\u001f=\u00050\u001dZ\u007f\u0002\u001b@\"U;}+\u001384?2Z2c!=k\u0003\u0019+o\u000b%0>G\u001dMK-\u0003|G\u001dl'aQkl=<#sep\u001erj!\b", "\u0010ncAb4\u001a^$[vks|P|Wcwc", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b>b\u0001\u001ei\u001f-ZM?jGg\u0013riD\u0011q,\u0018w1WUM(kV|F]\u0019V\"X;\u001cND=#mH@!x(P\u0012;vVr\u0012\u00174wzFU#\u0011w\u001f}L3vF#`\u0004WJD^9h\u0016hfc6N.$\u0001b\rlY-\u0014\u000e7\u001a\u0001R\tu=.\u0015\u000471HqZY\u000fm_D\u007f1-KE\u007f\u000eAX\u0002/p4Q}\u0007@s\u0014UosIiU\u00119J?40=Co?N_\u0007pH\u001b>\u0006g\u0012\u001di9:bjvk\u0012\u0010\u0017f\u0015j9kh\u000f\u00013\u0016GG~\u00191OL\u0018Bu\u001e\b\u0014.qd\\\r\u0019^\t%zR\")\u001e\u0013\fu\u001c$._\u001bc\u0017s4m7ZhlL{|", "\u0010ncAb4\u001a^$[vk\u001a\f\u0005>e", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006S/Dh\b(\u0013x!\u000bIP)z0-\u0015>", "7mXA\\(E6\u0019\u0003|a;f\n0s\u007f7bD\t\u001b&", "", "7mXA\\(E6\u0019\u0003|a;f\n0s\u007f7", "7mXA\\(E1#\b\n^5\fr0f\u000e(\u000b", "\u0011d]AX9\u001aZ\u001d\u0001\u0004^+k\u0013:A\u000b3X<\u000e", "Bhc9X", "<`e6Z(MW#\b^\\6\u0006", "1n[<e:", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e/@5\t+\u0014i#\fWJExBs", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e/@5\t+\u0014i#\u001cKPEr;z\u0015k]J\u000bm9$", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu^zp/VM0]VrJix`\u0018]2\u0011\u000e#F5v\u000e8/\u0011*X\u0006Eq\u000fUv\u001e>h\u007fF`\u0019\u0014O{{K8oJb)~XI\u000fc:m\nn!fCHmt\u0002\"\u0019wT8\u0013I)wn[xtqK\u0018\u000e\u0002\"HufPSo\u001f=~7(Jw\u0007\u0016<a>2pA\u000eD9\u007fV\tTf\"PB\u0002#,kO|\r2E\u0012LUgt\u007f\b\fr'l\u0012\u001cb~9\u0015tepL\u000b\u000e+`J?l;\fB/\u0002K'y\u001c1S\r\u0018Bu\u001e\b\u0014.qd\\\r\u0019^\t%zR\")\u0019~\u0012f% *\u001d\u000b#}r5;BXo\u0005u&\n\tcJ\u001cMH\u0013i\\vedE\u000b2\u0002\u0010V+7JO@PMw\u001b B\u0001T\f-|xF\u00026\\\u0003/EdBp`<`K7e\n", "3w_.a+>R{~~`/\f", "\u0011d]AX9\u001aZ\u001d\u0001\u0004^+k\u0013:A\u000b3X<\u000e^x*^\u0015CD\u0015", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu^zp/VM0]VrJix`\u0018]2\u0011\u000e#F5v\u000e8/\u0011*X\u0006Eq\u000fUv\u001e>h\u007fF`\u0019\u0014O{{K8oJb)~XI\u000fc:m\nn!fCHmt\u0002\"\u0019wT8\u0013I)qYN\u0003ftQ\u001dyKm<wcQO}U\u0006u1/Tzs!6b}t{)\u0018>:E.vOp\u0017Hp\\\u001e:\\P5{\u001d8\u001c>XmykQWf)i\u0013\u0018p5z!atcU\u0013\u0003dd%$kj\\B]b:VM\u001f.P\fP1`\u0011\u0012\u00061wiHVdR\u000b\"{N0_Z\u000b~u\u0018)2\u0012D'XW4j\u0013X\u001eedEyyfM\u001cw%\u0010pG\u0004_a|y\u001dt\u001aH.=O;\n\u001cAy\u0018!>\u000f\u000bH*\u0004rQ}>\u0013n\u0003GaCln/\u0018=7\u0006\\X", "\u001a`a4X\u001bH^t\n\u0006;(\n", "1n[9T7LS\u0018azb.\u007f\u0018", "\u001a`a4X\u001bH^t\n\u0006;(\nP9K_yW\u0014S", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu^zp/VM0]VrJix`\u0018]2\u0011\u000e#F5v\u000e8/\u0011*X\u0006Eq\u000fUv\u001e>h\u007fF`\u0019\u0014O{{K8oJb)~XI\u000fc:m\nn!fCHmt\u0002\"\u0019wT8\u0013I)qS9upfT#~77\bkeNPyc<>()[\u0005v\u000eA\\~4>4\u007fH4FsN=k!=h\u000bx5jA64\f#\u000fHJp\u007fp=!2\u001dk\u0010\u0019lC1bmarH\u001c\u000bY\u001e)~Pi\f\u0013]\u0011\u001bE|r1M\tOiO{\u0005\u0010#zoMB.\u001e~$xO,m\u0011L\u000bb'\u001c;\u001a9`\\2\u0019iB)\u001e\u0014E4\u0019iWP\u001fwOlmNnl[y1\f_\rR @U@ue\rm\u001a\u001e?\u000b\u0019~f\u0001yK\t:\u001b%n\u001bc@mj=\u000bt)\u0006|+)", "\u001bdS6h4-]$Z\u0006i\tx\u0016", "\u001bdS6h4-]$Z\u0006i\tx\u0016voe\bM\u001cTi", "!h]4_,+]+m\u0005i\b\b\u0014\fa\r", "Bhc9X\u001b>f(l\nr3|", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4#h\u0012'7C", "1d]AX9>R\b\u0003\ne,", "", "!h]4_,+]+m\u0005i\b\b\u0014\fa\roy%c\u0003}2_", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@\u0004*Ft\u001a7\u0017HLs}\u001f%q_H\u000bm5\\@\bWUL;`\\{\nixV\u0017M8\u0017\tXTmlN?*\u0012:IKKlJ\u001b\u0016!D4_Bi\u001f5\t)|A~]-_i\tNEN,/u\u0014)\u001elC83\u0018{\")21>\u0013yb\u0015|[F=NM#\n?(G7`WM9VL}%.O\u0006\u0001 {9\u00054r<\b>3\u0004:e2c!=k\u0003\u0019+o\u000b%0>G\u001dMK-vvN\u0017g\u001bp\f\u0018k~8\u0015yosWXxa Z?sC\nER\u0015L\u001fV\u00110E\fL_x(R\u0005.upSQ\u001b\u001e\t\u0016\u007fD/c\r\nP0\u0007&9qHdkd7=AT\u001d\u0016v\u000erwbB\"zL\u000f\u0001\u0015pe_z.DxZQ\u001dBKIzNJ=Y\u0005>\ff\n(PeOg4 /,D68e\\@\u000fq`w\u007fcA\u001b,75\u0001e\nlh\u007f2\u001f\f\u000e2\n%fM<\n3\u000b't*GmY\u0005I06so>", "\"n_\u000ec7\u001bO&", "\"n_\u000ec7\u001bO&F\\A\u001b\u0004\u0010|U", "\"n_\u000ec7\u001bO&evr6\r\u0018", "Aba<_3>R\u0003\u007f{l,\f", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d#Bc\u0005'7l\u007f/NQ;z\n", "<`e6Z(MW#\b^\\6\u0006f9n\u000f(\u0005O^!\u001eQ|", "Bhc9X\nH\\(~\u0004m\n\u0007\u00109r", "/bc6b5\"Q#\bXh5\f\t8t]2\u0003J\u000e", "Bhc9X\bE^\u001cz", "Bhc9X\u001d>`(\u0003xZ3X\u0016<a\t*{H\u0001 &", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7q;Z?Dm4&\u0015qpwwc9]z%CS$", "Bhc9X\u000fH`\u001d\u0014\u0005g;x\u0010\u000br\r$\u0005B\u0001\u001f\u0017P~", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7q;Z?Dm4&\u0015qpwim9R\f1P[J32", "Bhc9X\tHb(\t\u0003I({\b3n\u0002", "", "6hS2G0MZ\u0019lzf(\u0006\u00183c\u000e", "\"n_\u000ec7\u001bO&evr6\r\u0018vkr:c\u0014\u0012v", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@y)6z 2LV\u0005i>& ro9Pk(]v4KHUy&@pJ\u001e\u0019a\u000eM\u0015\u000e\u0006gA3D)\u001c\u0004n2S\u0011Bl\nU\u001b\u001f=4qR_\u000eV}\u001f~OrIVb]\tKKN/\u007fK\bh\u001ciD>#';\u0017%p[8\u0018{\u001d!v\u001c\tgzVbi87M[jZLo+\u001d[#(J\t\u0002\u00161k>)~5\u000f>86.\u0006Uw!=Z\b\u00196e\u000b.\"JF#N\u0015?\u0003y:\u0017j\u001fi\b\u0017qs\"\u0019rtgF\u000b\u000e3}W>`l\u000b;Q\u0019\bGy\u001d2P\rB%z\u001f\u0019\u0010#itMM$\u001e\b\u0016\u0005N2nZ^\u0010s\u0014%0\u0016EY\u0018whBAZ\u0017\u001erA\u001bw`\u0019xe/\u0016wZy_`9)G\u0001ZJ1<IKz\\L}YvD\n\t\u000e!}r\u000fO\u001d\u0019/4D]A,e@\u00131T2\"eG )6?K3Pw\\\u0007+\u001f\u0007Z>c\u0011f=E\f7@\\4 FkV\u000fJZ\u001c\u001d<V$3ht_ e{@T|\u000e\rY\u000f\\V\r", "\"v^\u001fb>LB#\nVi7Y\u0005<", "AlP9_\u001bBb ~", "AlP9_\u001bBb ~i^?\fv>y\u0007(", "\"v^\u001fb>LB#\nVi7Y\u0005<-\t\u0016LPTxe", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@\u0004*Ft\u001a7\u0017HLs}\u001f%q_H\u000bm5\\@\bWUL;`\\{\nixV\u0017M8\u0017\tXTmlN?*\u0012:IKKlJ\u001b\u0016!D4_Bi\u001f5\t)|A~I-_i\tNEN,/u\u0014)\u001elC83\u0018{\")21>\u0013yb\u0015|[F=NC\"yE.Bln\u0010Cy]G~5\u001f\u0015\f{[AX\b:>\u001c\u0004G9$s\u0019Rgm%d\u0003$3`Jp+GD\\@[ls{B\u0018q-+h\u001ek3@\u001don0\u001eu\rg&b9j)\u0006HZO?Yx\u00136J\tKiCu\u0019\u0010\"|iSLh*azW@+^\u001e\r\u0007e+e, Ed\u0019v*)8W#\u0012g4\u001b\u007fcL^wD$w[\u0002%Is-5\u0003#-*AKK\u0005(*k\u0019\u0015A\u000b\u000f}0=gL\u0002A\u001d3%\u0007a4q`<\u000fcZobVB'z8<^NMLh~1\"\fcOx\u001e\\KB\u00062T\u0013h,DnU\u0013<$Z\f;M\"3\\{c\fJ}@&y\u0019\\\u007f8f\u0011)6-|$\u001fj\u0017@j\u0016\u0019_V\u00198\u001a\u000ebR\u0015`\\lRP%\bi/N\u001d2Ow\u0019T\u0001r!DVS\u0001-3\u0015S8i\u0016\u001c(", "@d\\2`)>`u\t\nm6\u0005d:p\\$\t.\u0010\u0013&G", "uE5\u0013?(GR&\t~]?F\u00079m\u000b2\n@J$'P~\u0012Dvn\u0013c\u0006+A{\u0016;#'\u001f/\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001cz9#\u0012g\u0012J2ZN6K3}N?z\u00137&}HV\u0010\b%\u000e\u000b", "@d\\2`)>`\b\t\u0006:7\be+rm7wO\u0001", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e/@5\t+\u0014i#\u001c\\?Jk\n", "uE5\u0013?(GR&\t~]?F\u00079m\u000b2\n@J$'P~\u0012Dvn\u0013c\u0006+A{\u0016;#'\u001f/\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001cz9#\u0012g\u0012J2ZNHK/JOB{\u000497\u00117w\u0001a", "AdcA_,\u001a^$[vk", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9~<}/3]\r4\r", "AsPAX", "Dd[<V0Mg", "4kX;Z\bGW!z\nb6\u0006v:e}", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG~7k\u0012B)L?s0-\u0019rj'\u0012c*$", "AmP=45B[\u0015\u000e~h5j\u0014/c", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\")\u0015f7", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u0014?dY+BJ\u0012;;R7z4suO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\u000ec\u0012V'\u001c\tcJmlND\u001fQ\u000bI\u007f7|\\\u0015\u001a\u00161ytL_}Ry\u0013K(%qEfi}FT\u000f`4l\u0017i+\\\u00046-\u0018y\u0015*lZ7Sy]\u001er\u001cUpkO\u0015\n<.G[fFCE<B~6&O\u0005A\u0010<e~;\u00041\r48\u007fB\u000fTv\u001cGnt$0fJ|i\u001dA\u000fPG-|hG\u00102\t^\r\u000e`D\u0007", "AdcA_,\u001a^$[vk\t\u0007\u0018>o\b", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u0002?h\r*?I!9*?HYC\u001a$h7\u001am_5M\u00041KKauZ\\zH\u001e ZWJ4\u0011\rUP(xM\u0001\u001d\u00129IK\u001ah~\b*i>nx>e\u0014Q\u0003\u0003\u0001A'>-UhxTKIa=.\ni%gDH$]m\"\u001fpL=\u000e\u0006\\Zp\\\u0007g1#\"~@ MqeO3zU:J\u000e%U\u000b~\u0016;\"r5\u00027\u0014C.?d\u0013\u0015E\"Gm|\u001e<XP+0?\u0012V&P_\u0007h\b\u0015d(cQw_:1\u0017t;", ";`c2e0:Zfx\b^3|\u0005=e", "1n[<e\u001bKO\"\r~m0\u0007\u0012\u0010r{&\u000bD\u000b ", "/o_\u000fT9\u001c]\"\u000evb5|\u0016\ro\u00072\t"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AppBarKt {
    private static final float BottomAppBarHorizontalPadding;
    private static final float BottomAppBarVerticalPadding;
    private static final float FABHorizontalPadding;
    private static final float FABVerticalPadding;
    private static final float LargeTitleBottomPadding;
    private static final float MediumTitleBottomPadding;
    private static final float TopAppBarHorizontalPadding;
    private static final float TopAppBarTitleInset;
    private static final CubicBezierEasing TopTitleAlphaEasing;

    /* JADX INFO: renamed from: androidx.compose.material3.AppBarKt$CenterAlignedTopAppBar$1 */
    /* JADX INFO: compiled from: AppBar.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $actions;
        final /* synthetic */ TopAppBarColors $colors;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function2<Composer, Integer, Unit> $navigationIcon;
        final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;
        final /* synthetic */ Function2<Composer, Integer, Unit> $title;
        final /* synthetic */ WindowInsets $windowInsets;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i2, int i3) {
            super(2);
            function2 = function2;
            modifier = modifier;
            function2 = function22;
            function3 = function3;
            windowInsets = windowInsets;
            topAppBarColors = topAppBarColors;
            topAppBarScrollBehavior = topAppBarScrollBehavior;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            Function2<Composer, Integer, Unit> function2 = function2;
            Modifier modifier = modifier;
            Function2<Composer, Integer, Unit> function22 = function2;
            Function3<RowScope, Composer, Integer, Unit> function3 = function3;
            WindowInsets windowInsets = windowInsets;
            TopAppBarColors topAppBarColors = topAppBarColors;
            TopAppBarScrollBehavior topAppBarScrollBehavior = topAppBarScrollBehavior;
            int i3 = i;
            AppBarKt.CenterAlignedTopAppBar(function2, modifier, function22, function3, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer, RecomposeScopeImplKt.updateChangedFlags((i3 + 1) - (i3 & 1)), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.AppBarKt$CenterAlignedTopAppBar$2 */
    /* JADX INFO: compiled from: AppBar.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $actions;
        final /* synthetic */ TopAppBarColors $colors;
        final /* synthetic */ float $expandedHeight;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function2<Composer, Integer, Unit> $navigationIcon;
        final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;
        final /* synthetic */ Function2<Composer, Integer, Unit> $title;
        final /* synthetic */ WindowInsets $windowInsets;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, float f2, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i2, int i3) {
            super(2);
            function2 = function2;
            modifier = modifier;
            function2 = function22;
            function3 = function3;
            f = f2;
            windowInsets = windowInsets;
            topAppBarColors = topAppBarColors;
            topAppBarScrollBehavior = topAppBarScrollBehavior;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            Function2<Composer, Integer, Unit> function2 = function2;
            Modifier modifier = modifier;
            Function2<Composer, Integer, Unit> function22 = function2;
            Function3<RowScope, Composer, Integer, Unit> function3 = function3;
            float f2 = f;
            WindowInsets windowInsets = windowInsets;
            TopAppBarColors topAppBarColors = topAppBarColors;
            TopAppBarScrollBehavior topAppBarScrollBehavior = topAppBarScrollBehavior;
            int i3 = i;
            AppBarKt.m1786CenterAlignedTopAppBarGHTll3U(function2, modifier, function22, function3, f2, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer, RecomposeScopeImplKt.updateChangedFlags((i3 + 1) - (i3 & 1)), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.AppBarKt$LargeTopAppBar$1 */
    /* JADX INFO: compiled from: AppBar.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C05931 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $actions;
        final /* synthetic */ TopAppBarColors $colors;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function2<Composer, Integer, Unit> $navigationIcon;
        final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;
        final /* synthetic */ Function2<Composer, Integer, Unit> $title;
        final /* synthetic */ WindowInsets $windowInsets;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C05931(Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i2, int i3) {
            super(2);
            function2 = function2;
            modifier = modifier;
            function2 = function22;
            function3 = function3;
            windowInsets = windowInsets;
            topAppBarColors = topAppBarColors;
            topAppBarScrollBehavior = topAppBarScrollBehavior;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            AppBarKt.LargeTopAppBar(function2, modifier, function2, function3, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.AppBarKt$LargeTopAppBar$2 */
    /* JADX INFO: compiled from: AppBar.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C05942 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $actions;
        final /* synthetic */ float $collapsedHeight;
        final /* synthetic */ TopAppBarColors $colors;
        final /* synthetic */ float $expandedHeight;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function2<Composer, Integer, Unit> $navigationIcon;
        final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;
        final /* synthetic */ Function2<Composer, Integer, Unit> $title;
        final /* synthetic */ WindowInsets $windowInsets;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C05942(Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, float f2, float f3, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i2, int i3) {
            super(2);
            function2 = function2;
            modifier = modifier;
            function2 = function22;
            function3 = function3;
            f = f2;
            f = f3;
            windowInsets = windowInsets;
            topAppBarColors = topAppBarColors;
            topAppBarScrollBehavior = topAppBarScrollBehavior;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            AppBarKt.m1787LargeTopAppBaroKE7A98(function2, modifier, function2, function3, f, f, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.AppBarKt$MediumTopAppBar$1 */
    /* JADX INFO: compiled from: AppBar.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C05951 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $actions;
        final /* synthetic */ TopAppBarColors $colors;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function2<Composer, Integer, Unit> $navigationIcon;
        final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;
        final /* synthetic */ Function2<Composer, Integer, Unit> $title;
        final /* synthetic */ WindowInsets $windowInsets;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C05951(Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i2, int i3) {
            super(2);
            function2 = function2;
            modifier = modifier;
            function2 = function22;
            function3 = function3;
            windowInsets = windowInsets;
            topAppBarColors = topAppBarColors;
            topAppBarScrollBehavior = topAppBarScrollBehavior;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            Function2<Composer, Integer, Unit> function2 = function2;
            Modifier modifier = modifier;
            Function2<Composer, Integer, Unit> function22 = function2;
            Function3<RowScope, Composer, Integer, Unit> function3 = function3;
            WindowInsets windowInsets = windowInsets;
            TopAppBarColors topAppBarColors = topAppBarColors;
            TopAppBarScrollBehavior topAppBarScrollBehavior = topAppBarScrollBehavior;
            int i3 = i;
            AppBarKt.MediumTopAppBar(function2, modifier, function22, function3, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer, RecomposeScopeImplKt.updateChangedFlags((i3 + 1) - (i3 & 1)), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.AppBarKt$MediumTopAppBar$2 */
    /* JADX INFO: compiled from: AppBar.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C05962 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $actions;
        final /* synthetic */ float $collapsedHeight;
        final /* synthetic */ TopAppBarColors $colors;
        final /* synthetic */ float $expandedHeight;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function2<Composer, Integer, Unit> $navigationIcon;
        final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;
        final /* synthetic */ Function2<Composer, Integer, Unit> $title;
        final /* synthetic */ WindowInsets $windowInsets;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C05962(Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, float f2, float f3, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i2, int i3) {
            super(2);
            function2 = function2;
            modifier = modifier;
            function2 = function22;
            function3 = function3;
            f = f2;
            f = f3;
            windowInsets = windowInsets;
            topAppBarColors = topAppBarColors;
            topAppBarScrollBehavior = topAppBarScrollBehavior;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            AppBarKt.m1788MediumTopAppBaroKE7A98(function2, modifier, function2, function3, f, f, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.AppBarKt$TopAppBar$1 */
    /* JADX INFO: compiled from: AppBar.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C05971 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $actions;
        final /* synthetic */ TopAppBarColors $colors;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function2<Composer, Integer, Unit> $navigationIcon;
        final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;
        final /* synthetic */ Function2<Composer, Integer, Unit> $title;
        final /* synthetic */ WindowInsets $windowInsets;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C05971(Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i2, int i3) {
            super(2);
            function2 = function2;
            modifier = modifier;
            function2 = function22;
            function3 = function3;
            windowInsets = windowInsets;
            topAppBarColors = topAppBarColors;
            topAppBarScrollBehavior = topAppBarScrollBehavior;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            AppBarKt.TopAppBar(function2, modifier, function2, function3, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.AppBarKt$TopAppBar$2 */
    /* JADX INFO: compiled from: AppBar.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C05982 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $actions;
        final /* synthetic */ TopAppBarColors $colors;
        final /* synthetic */ float $expandedHeight;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function2<Composer, Integer, Unit> $navigationIcon;
        final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;
        final /* synthetic */ Function2<Composer, Integer, Unit> $title;
        final /* synthetic */ WindowInsets $windowInsets;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C05982(Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, float f2, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i2, int i3) {
            super(2);
            function2 = function2;
            modifier = modifier;
            function2 = function22;
            function3 = function3;
            f = f2;
            windowInsets = windowInsets;
            topAppBarColors = topAppBarColors;
            topAppBarScrollBehavior = topAppBarScrollBehavior;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            AppBarKt.m1790TopAppBarGHTll3U(function2, modifier, function2, function3, f, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.AppBarKt$settleAppBar$1 */
    /* JADX INFO: compiled from: AppBar.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0002v\u000b|\u000b\u0003{\bOK_\u0010\u0011c\u0004\u0016o\u001a", f = "\u000e<;\f*:t19", i = {0, 0, 0, 1}, l = {2501, 2515}, m = "B5EF?9\u0016FG\u001a:L", n = {"bjcZW", "bdcV3dKT7NO9E-/+\u0016", "a[oG[dKU=0K6F=(:,", "a[oG[dKU=0K6F=(:,"}, s = {"xQ^", "xQ_", "xQ`", "xQ^"})
    static final class C05991 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C05991(Continuation<? super C05991> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
            return AppBarKt.settleAppBar(null, 0.0f, null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.AppBarKt$settleAppBarBottom$1 */
    /* JADX INFO: compiled from: AppBar.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0002v\u000b|\u000b\u0003{\bOK_\u0010\u0011c\u0004\u0016o\u001a", f = "\u000e<;\f*:t19", i = {0, 0, 0, 1}, l = {1803, 1817}, m = "B5EF?9\u0016FG\u001a:L\u001dKQRNM", n = {"bjcZW", "bdcV3dKT7NO9E-/+\u0016", "a[oG[dKU=0K6F=(:,", "a[oG[dKU=0K6F=(:,"}, s = {"xQ^", "xQ_", "xQ`", "xQ^"})
    static final class C06011 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C06011(Continuation<? super C06011> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            int i2 = this.label;
            this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
            return AppBarKt.settleAppBarBottom(null, 0.0f, null, null, this);
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0007K\fGvw\u0016k]Kg\u0004^T2Or[\u001bf\u0014nKF\u0006VOz^V%x(cmVU\u001cmQV\u001fA>\u0017Z4~+_PO%N5$\rT\u0019X \t")
    @InterfaceC1492Gx
    public static final /* synthetic */ void TopAppBar(Function2 function2, Modifier modifier, Function2 function22, Function3 function3, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, int i2, int i3) {
        int i4;
        TopAppBarScrollBehavior topAppBarScrollBehavior2 = topAppBarScrollBehavior;
        TopAppBarColors topAppBarColors2 = topAppBarColors;
        WindowInsets windowInsets2 = windowInsets;
        Function3 function3M1967getLambda2$material3_release = function3;
        Function2 function2M1957getLambda1$material3_release = function22;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(1906353009);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TopAppBar)P(5,2,3!1,6)142@6819L12,143@6881L17,146@6960L306:AppBar.kt#uh7d8r");
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            i4 = (i2 + 6) - (i2 & 6);
        } else if ((i2 + 6) - (i2 | 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = (-1) - (((-1) - i3) | ((-1) - 2));
        if (i5 != 0) {
            i4 = (i4 + 48) - (i4 & 48);
        } else if ((i2 + 48) - (i2 | 48) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(companion) ? 32 : 16)));
        }
        int i6 = (i3 + 4) - (i3 | 4);
        if (i6 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function2M1957getLambda1$material3_release) ? 256 : 128;
        }
        int i7 = i3 & 8;
        if (i7 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 3072));
        } else if ((i2 & 3072) == 0) {
            int i8 = composerStartRestartGroup.changedInstance(function3M1967getLambda2$material3_release) ? 2048 : 1024;
            i4 = (i4 + i8) - (i4 & i8);
        }
        if ((i2 & 24576) == 0) {
            int i9 = ((i3 & 16) == 0 && composerStartRestartGroup.changed(windowInsets2)) ? 16384 : 8192;
            i4 = (i4 + i9) - (i4 & i9);
        }
        if ((196608 & i2) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (((i3 & 32) == 0 && composerStartRestartGroup.changed(topAppBarColors2)) ? 131072 : 65536)));
        }
        int i10 = (i3 + 64) - (i3 | 64);
        if (i10 != 0) {
            i4 |= 1572864;
        } else if ((-1) - (((-1) - 1572864) | ((-1) - i2)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(topAppBarScrollBehavior2) ? 1048576 : 524288)));
        }
        if ((599187 + i4) - (599187 | i4) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 + 1) - (i2 | 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    companion = Modifier.Companion;
                }
                if (i6 != 0) {
                    function2M1957getLambda1$material3_release = ComposableSingletons$AppBarKt.INSTANCE.m1957getLambda1$material3_release();
                }
                if (i7 != 0) {
                    function3M1967getLambda2$material3_release = ComposableSingletons$AppBarKt.INSTANCE.m1967getLambda2$material3_release();
                }
                if ((i3 & 16) != 0) {
                    windowInsets2 = TopAppBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    i4 = (i4 - 57345) - (i4 | (-57345));
                }
                if ((i3 + 32) - (i3 | 32) != 0) {
                    topAppBarColors2 = TopAppBarDefaults.INSTANCE.topAppBarColors(composerStartRestartGroup, 6);
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-458753)));
                }
                if (i10 != 0) {
                    topAppBarScrollBehavior2 = null;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 & 16) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-57345)));
                }
                if ((i3 + 32) - (i3 | 32) != 0) {
                    i4 = (i4 - 458753) - (i4 | (-458753));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1906353009, i4, -1, "androidx.compose.material3.TopAppBar (AppBar.kt:146)");
            }
            int i11 = ((-1) - (((-1) - i4) | ((-1) - 14))) | 24576 | (112 & i4);
            int i12 = (i4 + 896) - (896 | i4);
            int i13 = (-1) - (((-1) - i4) | ((-1) - 7168));
            int i14 = i4 << 3;
            int i15 = ((-1) - (((-1) - ((i11 + i12) - (i11 & i12))) & ((-1) - i13))) | ((458752 + i14) - (458752 | i14)) | ((-1) - (((-1) - 3670016) | ((-1) - i14))) | ((i14 + 29360128) - (i14 | 29360128));
            m1790TopAppBarGHTll3U(function2, companion, function2M1957getLambda1$material3_release, function3M1967getLambda2$material3_release, TopAppBarDefaults.INSTANCE.m2879getTopAppBarExpandedHeightD9Ej5fM(), windowInsets2, topAppBarColors2, topAppBarScrollBehavior2, composerStartRestartGroup, i15, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt.TopAppBar.1
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $actions;
                final /* synthetic */ TopAppBarColors $colors;
                final /* synthetic */ Modifier $modifier;
                final /* synthetic */ Function2<Composer, Integer, Unit> $navigationIcon;
                final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;
                final /* synthetic */ Function2<Composer, Integer, Unit> $title;
                final /* synthetic */ WindowInsets $windowInsets;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C05971(Function2<? super Composer, ? super Integer, Unit> function23, Modifier companion2, Function2<? super Composer, ? super Integer, Unit> function2M1957getLambda1$material3_release2, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3M1967getLambda2$material3_release2, WindowInsets windowInsets22, TopAppBarColors topAppBarColors22, TopAppBarScrollBehavior topAppBarScrollBehavior22, int i22, int i32) {
                    super(2);
                    function2 = function23;
                    modifier = companion2;
                    function2 = function2M1957getLambda1$material3_release2;
                    function3 = function3M1967getLambda2$material3_release2;
                    windowInsets = windowInsets22;
                    topAppBarColors = topAppBarColors22;
                    topAppBarScrollBehavior = topAppBarScrollBehavior22;
                    i = i22;
                    i = i32;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    AppBarKt.TopAppBar(function2, modifier, function2, function3, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))), i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: TopAppBar-GHTll3U */
    public static final void m1790TopAppBarGHTll3U(Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, float f2, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, int i2, int i3) {
        int i4;
        TopAppBarScrollBehavior topAppBarScrollBehavior2 = topAppBarScrollBehavior;
        TopAppBarColors topAppBarColors2 = topAppBarColors;
        WindowInsets windowInsets2 = windowInsets;
        float fM2879getTopAppBarExpandedHeightD9Ej5fM = f2;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3M1969getLambda4$material3_release = function3;
        Function2<? super Composer, ? super Integer, Unit> function2M1968getLambda3$material3_release = function22;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(226148675);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TopAppBar)P(6,3,4!1,2:c#ui.unit.Dp,7)204@9890L12,205@9952L17,211@10162L5,208@10031L579:AppBar.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = (-1) - (((-1) - i2) & ((-1) - 6));
        } else if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = (-1) - (((-1) - i3) | ((-1) - 2));
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(companion) ? 32 : 16;
        }
        int i6 = (i3 + 4) - (i3 | 4);
        if (i6 != 0) {
            i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i2 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function2M1968getLambda3$material3_release) ? 256 : 128;
        }
        int i7 = i3 & 8;
        if (i7 != 0) {
            i4 = (i4 + 3072) - (i4 & 3072);
        } else if ((i2 & 3072) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function3M1969getLambda4$material3_release) ? 2048 : 1024)));
        }
        int i8 = (i3 + 16) - (i3 | 16);
        if (i8 != 0) {
            i4 = (i4 + 24576) - (i4 & 24576);
        } else if ((-1) - (((-1) - i2) | ((-1) - 24576)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(fM2879getTopAppBarExpandedHeightD9Ej5fM) ? 16384 : 8192)));
        }
        if ((ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE + i2) - (196608 | i2) == 0) {
            i4 |= ((i3 & 32) == 0 && composerStartRestartGroup.changed(windowInsets2)) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 |= ((i3 + 64) - (i3 | 64) == 0 && composerStartRestartGroup.changed(topAppBarColors2)) ? 1048576 : 524288;
        }
        int i9 = (i3 + 128) - (i3 | 128);
        if (i9 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 12582912));
        } else if ((-1) - (((-1) - i2) | ((-1) - 12582912)) == 0) {
            i4 |= composerStartRestartGroup.changed(topAppBarScrollBehavior2) ? 8388608 : 4194304;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 4793491)) == 4793490 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 + 1) - (i2 | 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    companion = Modifier.Companion;
                }
                if (i6 != 0) {
                    function2M1968getLambda3$material3_release = ComposableSingletons$AppBarKt.INSTANCE.m1968getLambda3$material3_release();
                }
                if (i7 != 0) {
                    function3M1969getLambda4$material3_release = ComposableSingletons$AppBarKt.INSTANCE.m1969getLambda4$material3_release();
                }
                if (i8 != 0) {
                    fM2879getTopAppBarExpandedHeightD9Ej5fM = TopAppBarDefaults.INSTANCE.m2879getTopAppBarExpandedHeightD9Ej5fM();
                }
                if ((i3 + 32) - (i3 | 32) != 0) {
                    windowInsets2 = TopAppBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    i4 = (i4 - 458753) - (i4 | (-458753));
                }
                if ((i3 + 64) - (i3 | 64) != 0) {
                    topAppBarColors2 = TopAppBarDefaults.INSTANCE.topAppBarColors(composerStartRestartGroup, 6);
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-3670017)));
                }
                if (i9 != 0) {
                    topAppBarScrollBehavior2 = null;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((-1) - (((-1) - i3) | ((-1) - 32)) != 0) {
                    i4 = (i4 - 458753) - (i4 | (-458753));
                }
                if ((i3 & 64) != 0) {
                    i4 &= -3670017;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(226148675, i4, -1, "androidx.compose.material3.TopAppBar (AppBar.kt:208)");
            }
            TextStyle value = TypographyKt.getValue(TopAppBarSmallTokens.INSTANCE.getHeadlineFont(), composerStartRestartGroup, 6);
            float fM2879getTopAppBarExpandedHeightD9Ej5fM2 = (Dp.m6643equalsimpl0(fM2879getTopAppBarExpandedHeightD9Ej5fM, Dp.Companion.m6658getUnspecifiedD9Ej5fM()) || Dp.m6643equalsimpl0(fM2879getTopAppBarExpandedHeightD9Ej5fM, Dp.Companion.m6657getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m2879getTopAppBarExpandedHeightD9Ej5fM() : fM2879getTopAppBarExpandedHeightD9Ej5fM;
            int i10 = i4 >> 3;
            int i11 = (i10 + 14) - (i10 | 14);
            int i12 = (i11 + 3072) - (i11 & 3072);
            int i13 = (-1) - (((-1) - (i4 << 3)) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION));
            int i14 = i4 << 6;
            int i15 = ((-1) - (((-1) - (57344 & i14)) & ((-1) - ((i12 + i13) - (i12 & i13))))) | ((-1) - (((-1) - 458752) | ((-1) - i14))) | ((-1) - (((-1) - 29360128) | ((-1) - i14)));
            int i16 = (234881024 + i14) - (234881024 | i14);
            m1789SingleRowTopAppBarcJHQLPU(companion, function2, value, false, function2M1968getLambda3$material3_release, function3M1969getLambda4$material3_release, fM2879getTopAppBarExpandedHeightD9Ej5fM2, windowInsets2, topAppBarColors2, topAppBarScrollBehavior2, composerStartRestartGroup, ((i15 + i16) - (i15 & i16)) | ((i14 + 1879048192) - (i14 | 1879048192)), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt.TopAppBar.2
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $actions;
                final /* synthetic */ TopAppBarColors $colors;
                final /* synthetic */ float $expandedHeight;
                final /* synthetic */ Modifier $modifier;
                final /* synthetic */ Function2<Composer, Integer, Unit> $navigationIcon;
                final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;
                final /* synthetic */ Function2<Composer, Integer, Unit> $title;
                final /* synthetic */ WindowInsets $windowInsets;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C05982(Function2<? super Composer, ? super Integer, Unit> function23, Modifier companion2, Function2<? super Composer, ? super Integer, Unit> function2M1968getLambda3$material3_release2, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3M1969getLambda4$material3_release2, float fM2879getTopAppBarExpandedHeightD9Ej5fM3, WindowInsets windowInsets22, TopAppBarColors topAppBarColors22, TopAppBarScrollBehavior topAppBarScrollBehavior22, int i22, int i32) {
                    super(2);
                    function2 = function23;
                    modifier = companion2;
                    function2 = function2M1968getLambda3$material3_release2;
                    function3 = function3M1969getLambda4$material3_release2;
                    f = fM2879getTopAppBarExpandedHeightD9Ej5fM3;
                    windowInsets = windowInsets22;
                    topAppBarColors = topAppBarColors22;
                    topAppBarScrollBehavior = topAppBarScrollBehavior22;
                    i = i22;
                    i = i32;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    AppBarKt.m1790TopAppBarGHTll3U(function2, modifier, function2, function3, f, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))), i);
                }
            });
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0007K\fGvw\u0016k]Kg\u0004^T2Or[\u001bf\u0014nK5{T\u0003o`U0ooZiFAkx\u001aV.\u0015;$\u0016c\u00036`\b@}N5 \u0010L\u0018, \u007f;\n\u0007K\u007f8.L\u000b\u0001q'\u001a")
    @InterfaceC1492Gx
    public static final /* synthetic */ void CenterAlignedTopAppBar(Function2 function2, Modifier modifier, Function2 function22, Function3 function3, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, int i2, int i3) {
        int i4;
        TopAppBarScrollBehavior topAppBarScrollBehavior2 = topAppBarScrollBehavior;
        TopAppBarColors topAppBarColorsCenterAlignedTopAppBarColors = topAppBarColors;
        WindowInsets windowInsets2 = windowInsets;
        Function3 function3M1971getLambda6$material3_release = function3;
        Function2 function2M1970getLambda5$material3_release = function22;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2139286460);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(CenterAlignedTopAppBar)P(5,2,3!1,6)269@12968L12,270@13030L30,273@13122L319:AppBar.kt#uh7d8r");
        if ((i3 + 1) - (i3 | 1) != 0) {
            i4 = (-1) - (((-1) - i2) & ((-1) - 6));
        } else if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            i4 = (-1) - (((-1) - (composerStartRestartGroup.changedInstance(function2) ? 4 : 2)) & ((-1) - i2));
        } else {
            i4 = i2;
        }
        int i5 = (i3 + 2) - (i3 | 2);
        if (i5 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 48));
        } else if ((i2 & 48) == 0) {
            int i6 = composerStartRestartGroup.changed(companion) ? 32 : 16;
            i4 = (i4 + i6) - (i4 & i6);
        }
        int i7 = i3 & 4;
        if (i7 != 0) {
            i4 = (i4 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i4 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function2M1970getLambda5$material3_release) ? 256 : 128;
        }
        int i8 = (i3 + 8) - (i3 | 8);
        if (i8 != 0) {
            i4 |= 3072;
        } else if ((i2 + 3072) - (i2 | 3072) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function3M1971getLambda6$material3_release) ? 2048 : 1024)));
        }
        if ((i2 & 24576) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (((-1) - (((-1) - i3) | ((-1) - 16)) == 0 && composerStartRestartGroup.changed(windowInsets2)) ? 16384 : 8192)));
        }
        if ((ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE + i2) - (196608 | i2) == 0) {
            i4 |= ((i3 + 32) - (i3 | 32) == 0 && composerStartRestartGroup.changed(topAppBarColorsCenterAlignedTopAppBarColors)) ? 131072 : 65536;
        }
        int i9 = (-1) - (((-1) - i3) | ((-1) - 64));
        if (i9 != 0) {
            i4 = (i4 + 1572864) - (i4 & 1572864);
        } else if ((1572864 + i2) - (1572864 | i2) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(topAppBarScrollBehavior2) ? 1048576 : 524288)));
        }
        if ((-1) - (((-1) - 599187) | ((-1) - i4)) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((-1) - (((-1) - i2) | ((-1) - 1)) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    companion = Modifier.Companion;
                }
                if (i7 != 0) {
                    function2M1970getLambda5$material3_release = ComposableSingletons$AppBarKt.INSTANCE.m1970getLambda5$material3_release();
                }
                if (i8 != 0) {
                    function3M1971getLambda6$material3_release = ComposableSingletons$AppBarKt.INSTANCE.m1971getLambda6$material3_release();
                }
                if ((i3 & 16) != 0) {
                    windowInsets2 = TopAppBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    i4 &= -57345;
                }
                if ((-1) - (((-1) - i3) | ((-1) - 32)) != 0) {
                    topAppBarColorsCenterAlignedTopAppBarColors = TopAppBarDefaults.INSTANCE.centerAlignedTopAppBarColors(composerStartRestartGroup, 6);
                    i4 = (i4 - 458753) - (i4 | (-458753));
                }
                if (i9 != 0) {
                    topAppBarScrollBehavior2 = null;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 & 16) != 0) {
                    i4 = (i4 - 57345) - (i4 | (-57345));
                }
                if ((i3 + 32) - (i3 | 32) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-458753)));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2139286460, i4, -1, "androidx.compose.material3.CenterAlignedTopAppBar (AppBar.kt:273)");
            }
            int i10 = (-1) - (((-1) - i4) | ((-1) - 14));
            int i11 = (-1) - (((-1) - ((i10 + 24576) - (i10 & 24576))) & ((-1) - (112 & i4)));
            int i12 = 896 & i4;
            int i13 = (-1) - (((-1) - ((i11 + i12) - (i11 & i12))) & ((-1) - ((i4 + 7168) - (7168 | i4))));
            int i14 = i4 << 3;
            int i15 = (-1) - (((-1) - (i13 | (458752 & i14))) & ((-1) - ((3670016 + i14) - (3670016 | i14))));
            int i16 = (-1) - (((-1) - i14) | ((-1) - 29360128));
            Function2 function23 = function2M1970getLambda5$material3_release;
            Modifier modifier2 = companion;
            m1786CenterAlignedTopAppBarGHTll3U(function2, modifier2, function23, function3M1971getLambda6$material3_release, TopAppBarDefaults.INSTANCE.m2879getTopAppBarExpandedHeightD9Ej5fM(), windowInsets2, topAppBarColorsCenterAlignedTopAppBarColors, topAppBarScrollBehavior2, composerStartRestartGroup, (-1) - (((-1) - i15) & ((-1) - i16)), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt.CenterAlignedTopAppBar.1
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $actions;
                final /* synthetic */ TopAppBarColors $colors;
                final /* synthetic */ Modifier $modifier;
                final /* synthetic */ Function2<Composer, Integer, Unit> $navigationIcon;
                final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;
                final /* synthetic */ Function2<Composer, Integer, Unit> $title;
                final /* synthetic */ WindowInsets $windowInsets;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(Function2<? super Composer, ? super Integer, Unit> function24, Modifier companion2, Function2<? super Composer, ? super Integer, Unit> function2M1970getLambda5$material3_release2, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3M1971getLambda6$material3_release2, WindowInsets windowInsets22, TopAppBarColors topAppBarColorsCenterAlignedTopAppBarColors2, TopAppBarScrollBehavior topAppBarScrollBehavior22, int i22, int i32) {
                    super(2);
                    function2 = function24;
                    modifier = companion2;
                    function2 = function2M1970getLambda5$material3_release2;
                    function3 = function3M1971getLambda6$material3_release2;
                    windowInsets = windowInsets22;
                    topAppBarColors = topAppBarColorsCenterAlignedTopAppBarColors2;
                    topAppBarScrollBehavior = topAppBarScrollBehavior22;
                    i = i22;
                    i = i32;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    Function2<Composer, Integer, Unit> function24 = function2;
                    Modifier modifier3 = modifier;
                    Function2<Composer, Integer, Unit> function222 = function2;
                    Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                    WindowInsets windowInsets3 = windowInsets;
                    TopAppBarColors topAppBarColors2 = topAppBarColors;
                    TopAppBarScrollBehavior topAppBarScrollBehavior3 = topAppBarScrollBehavior;
                    int i32 = i;
                    AppBarKt.CenterAlignedTopAppBar(function24, modifier3, function222, function32, windowInsets3, topAppBarColors2, topAppBarScrollBehavior3, composer2, RecomposeScopeImplKt.updateChangedFlags((i32 + 1) - (i32 & 1)), i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: CenterAlignedTopAppBar-GHTll3U */
    public static final void m1786CenterAlignedTopAppBarGHTll3U(Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, float f2, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, int i2, int i3) {
        int i4;
        TopAppBarScrollBehavior topAppBarScrollBehavior2 = topAppBarScrollBehavior;
        TopAppBarColors topAppBarColorsCenterAlignedTopAppBarColors = topAppBarColors;
        WindowInsets windowInsets2 = windowInsets;
        float fM2879getTopAppBarExpandedHeightD9Ej5fM = f2;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3M1973getLambda8$material3_release = function3;
        Function2<? super Composer, ? super Integer, Unit> function2M1972getLambda7$material3_release = function22;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(1952988048);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(CenterAlignedTopAppBar)P(6,3,4!1,2:c#ui.unit.Dp,7)328@16080L12,329@16142L30,335@16365L5,332@16234L578:AppBar.kt#uh7d8r");
        if ((i3 + 1) - (i3 | 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (-1) - (((-1) - (composerStartRestartGroup.changedInstance(function2) ? 4 : 2)) & ((-1) - i2));
        } else {
            i4 = i2;
        }
        int i5 = (i3 + 2) - (i3 | 2);
        if (i5 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 48));
        } else if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(companion) ? 32 : 16)));
        }
        int i6 = (-1) - (((-1) - i3) | ((-1) - 4));
        if (i6 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function2M1972getLambda7$material3_release) ? 256 : 128)));
        }
        int i7 = (i3 + 8) - (i3 | 8);
        if (i7 != 0) {
            i4 |= 3072;
        } else if ((i2 + 3072) - (i2 | 3072) == 0) {
            int i8 = composerStartRestartGroup.changedInstance(function3M1973getLambda8$material3_release) ? 2048 : 1024;
            i4 = (i4 + i8) - (i4 & i8);
        }
        int i9 = (i3 + 16) - (i3 | 16);
        if (i9 != 0) {
            i4 = (i4 + 24576) - (i4 & 24576);
        } else if ((i2 & 24576) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(fM2879getTopAppBarExpandedHeightD9Ej5fM) ? 16384 : 8192)));
        }
        if ((196608 & i2) == 0) {
            int i10 = ((i3 & 32) == 0 && composerStartRestartGroup.changed(windowInsets2)) ? 131072 : 65536;
            i4 = (i4 + i10) - (i4 & i10);
        }
        if ((1572864 + i2) - (1572864 | i2) == 0) {
            int i11 = ((i3 & 64) == 0 && composerStartRestartGroup.changed(topAppBarColorsCenterAlignedTopAppBarColors)) ? 1048576 : 524288;
            i4 = (i4 + i11) - (i4 & i11);
        }
        int i12 = (-1) - (((-1) - i3) | ((-1) - 128));
        if (i12 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 12582912));
        } else if ((i2 & 12582912) == 0) {
            int i13 = composerStartRestartGroup.changed(topAppBarScrollBehavior2) ? 8388608 : 4194304;
            i4 = (i4 + i13) - (i4 & i13);
        }
        if ((-1) - (((-1) - i4) | ((-1) - 4793491)) == 4793490 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((-1) - (((-1) - i2) | ((-1) - 1)) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    companion = Modifier.Companion;
                }
                if (i6 != 0) {
                    function2M1972getLambda7$material3_release = ComposableSingletons$AppBarKt.INSTANCE.m1972getLambda7$material3_release();
                }
                if (i7 != 0) {
                    function3M1973getLambda8$material3_release = ComposableSingletons$AppBarKt.INSTANCE.m1973getLambda8$material3_release();
                }
                if (i9 != 0) {
                    fM2879getTopAppBarExpandedHeightD9Ej5fM = TopAppBarDefaults.INSTANCE.m2879getTopAppBarExpandedHeightD9Ej5fM();
                }
                if ((-1) - (((-1) - i3) | ((-1) - 32)) != 0) {
                    windowInsets2 = TopAppBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-458753)));
                }
                if ((i3 + 64) - (i3 | 64) != 0) {
                    topAppBarColorsCenterAlignedTopAppBarColors = TopAppBarDefaults.INSTANCE.centerAlignedTopAppBarColors(composerStartRestartGroup, 6);
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-3670017)));
                }
                if (i12 != 0) {
                    topAppBarScrollBehavior2 = null;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 + 32) - (i3 | 32) != 0) {
                    i4 &= -458753;
                }
                if ((-1) - (((-1) - i3) | ((-1) - 64)) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-3670017)));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1952988048, i4, -1, "androidx.compose.material3.CenterAlignedTopAppBar (AppBar.kt:332)");
            }
            TextStyle value = TypographyKt.getValue(TopAppBarSmallTokens.INSTANCE.getHeadlineFont(), composerStartRestartGroup, 6);
            float fM2879getTopAppBarExpandedHeightD9Ej5fM2 = (Dp.m6643equalsimpl0(fM2879getTopAppBarExpandedHeightD9Ej5fM, Dp.Companion.m6658getUnspecifiedD9Ej5fM()) || Dp.m6643equalsimpl0(fM2879getTopAppBarExpandedHeightD9Ej5fM, Dp.Companion.m6657getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m2879getTopAppBarExpandedHeightD9Ej5fM() : fM2879getTopAppBarExpandedHeightD9Ej5fM;
            int i14 = i4 << 3;
            int i15 = ((-1) - (((-1) - ((i4 >> 3) & 14)) & ((-1) - 3072))) | ((i14 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i14 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION));
            int i16 = i4 << 6;
            int i17 = 57344 & i16;
            int i18 = (-1) - (((-1) - ((-1) - (((-1) - (((i17 + i15) - (i17 & i15)) | ((-1) - (((-1) - 458752) | ((-1) - i16))))) & ((-1) - ((29360128 + i16) - (29360128 | i16)))))) & ((-1) - (234881024 & i16)));
            int i19 = (-1) - (((-1) - i16) | ((-1) - 1879048192));
            m1789SingleRowTopAppBarcJHQLPU(companion, function2, value, true, function2M1972getLambda7$material3_release, function3M1973getLambda8$material3_release, fM2879getTopAppBarExpandedHeightD9Ej5fM2, windowInsets2, topAppBarColorsCenterAlignedTopAppBarColors, topAppBarScrollBehavior2, composerStartRestartGroup, (-1) - (((-1) - i18) & ((-1) - i19)), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt.CenterAlignedTopAppBar.2
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $actions;
                final /* synthetic */ TopAppBarColors $colors;
                final /* synthetic */ float $expandedHeight;
                final /* synthetic */ Modifier $modifier;
                final /* synthetic */ Function2<Composer, Integer, Unit> $navigationIcon;
                final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;
                final /* synthetic */ Function2<Composer, Integer, Unit> $title;
                final /* synthetic */ WindowInsets $windowInsets;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass2(Function2<? super Composer, ? super Integer, Unit> function23, Modifier companion2, Function2<? super Composer, ? super Integer, Unit> function2M1972getLambda7$material3_release2, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3M1973getLambda8$material3_release2, float fM2879getTopAppBarExpandedHeightD9Ej5fM3, WindowInsets windowInsets22, TopAppBarColors topAppBarColorsCenterAlignedTopAppBarColors2, TopAppBarScrollBehavior topAppBarScrollBehavior22, int i22, int i32) {
                    super(2);
                    function2 = function23;
                    modifier = companion2;
                    function2 = function2M1972getLambda7$material3_release2;
                    function3 = function3M1973getLambda8$material3_release2;
                    f = fM2879getTopAppBarExpandedHeightD9Ej5fM3;
                    windowInsets = windowInsets22;
                    topAppBarColors = topAppBarColorsCenterAlignedTopAppBarColors2;
                    topAppBarScrollBehavior = topAppBarScrollBehavior22;
                    i = i22;
                    i = i32;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    Function2<Composer, Integer, Unit> function23 = function2;
                    Modifier modifier2 = modifier;
                    Function2<Composer, Integer, Unit> function222 = function2;
                    Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                    float f22 = f;
                    WindowInsets windowInsets3 = windowInsets;
                    TopAppBarColors topAppBarColors2 = topAppBarColors;
                    TopAppBarScrollBehavior topAppBarScrollBehavior3 = topAppBarScrollBehavior;
                    int i32 = i;
                    AppBarKt.m1786CenterAlignedTopAppBarGHTll3U(function23, modifier2, function222, function32, f22, windowInsets3, topAppBarColors2, topAppBarScrollBehavior3, composer2, RecomposeScopeImplKt.updateChangedFlags((i32 + 1) - (i32 & 1)), i);
                }
            });
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0007K\fGvw\u0016k]Kg\u0004^T2Or[\u001bf\u0014nK?{Jw\u007f[h3vI\\t$Nn(PO2;y\u0015eX\u0006#h[@i&9\u001b\u0013O(\u0004\u001c\u00058Aw$\u007f8*O\u0003\u007fE'\u0011\u0003P$~\u000bB@)>X\u0004@e/")
    @InterfaceC1492Gx
    public static final /* synthetic */ void MediumTopAppBar(Function2 function2, Modifier modifier, Function2 function22, Function3 function3, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, int i2, int i3) {
        int i4;
        TopAppBarColors topAppBarColorsMediumTopAppBarColors = topAppBarColors;
        WindowInsets windowInsets2 = windowInsets;
        Function2 function2M1974getLambda9$material3_release = function22;
        Function3 function3M1958getLambda10$material3_release = function3;
        TopAppBarScrollBehavior topAppBarScrollBehavior2 = topAppBarScrollBehavior;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(1805417862);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(MediumTopAppBar)P(5,2,3!1,6)396@19336L12,397@19398L23,400@19483L388:AppBar.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = (i2 + 6) - (i2 & 6);
        } else if ((i2 + 6) - (i2 | 6) == 0) {
            i4 = (-1) - (((-1) - (composerStartRestartGroup.changedInstance(function2) ? 4 : 2)) & ((-1) - i2));
        } else {
            i4 = i2;
        }
        int i5 = (-1) - (((-1) - i3) | ((-1) - 2));
        if (i5 != 0) {
            i4 = (i4 + 48) - (i4 & 48);
        } else if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            i4 |= composerStartRestartGroup.changed(companion) ? 32 : 16;
        }
        int i6 = (i3 + 4) - (i3 | 4);
        if (i6 != 0) {
            i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function2M1974getLambda9$material3_release) ? 256 : 128;
        }
        int i7 = (-1) - (((-1) - i3) | ((-1) - 8));
        if (i7 != 0) {
            i4 |= 3072;
        } else if ((-1) - (((-1) - i2) | ((-1) - 3072)) == 0) {
            int i8 = composerStartRestartGroup.changedInstance(function3M1958getLambda10$material3_release) ? 2048 : 1024;
            i4 = (i4 + i8) - (i4 & i8);
        }
        if ((-1) - (((-1) - i2) | ((-1) - 24576)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (((i3 + 16) - (i3 | 16) == 0 && composerStartRestartGroup.changed(windowInsets2)) ? 16384 : 8192)));
        }
        if ((-1) - (((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) | ((-1) - i2)) == 0) {
            i4 |= ((-1) - (((-1) - i3) | ((-1) - 32)) == 0 && composerStartRestartGroup.changed(topAppBarColorsMediumTopAppBarColors)) ? 131072 : 65536;
        }
        int i9 = (-1) - (((-1) - i3) | ((-1) - 64));
        if (i9 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 1572864));
        } else if ((-1) - (((-1) - 1572864) | ((-1) - i2)) == 0) {
            int i10 = composerStartRestartGroup.changed(topAppBarScrollBehavior2) ? 1048576 : 524288;
            i4 = (i4 + i10) - (i4 & i10);
        }
        if ((599187 + i4) - (599187 | i4) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    companion = Modifier.Companion;
                }
                if (i6 != 0) {
                    function2M1974getLambda9$material3_release = ComposableSingletons$AppBarKt.INSTANCE.m1974getLambda9$material3_release();
                }
                if (i7 != 0) {
                    function3M1958getLambda10$material3_release = ComposableSingletons$AppBarKt.INSTANCE.m1958getLambda10$material3_release();
                }
                if ((i3 + 16) - (i3 | 16) != 0) {
                    windowInsets2 = TopAppBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    i4 &= -57345;
                }
                if ((i3 & 32) != 0) {
                    topAppBarColorsMediumTopAppBarColors = TopAppBarDefaults.INSTANCE.mediumTopAppBarColors(composerStartRestartGroup, 6);
                    i4 &= -458753;
                }
                if (i9 != 0) {
                    topAppBarScrollBehavior2 = null;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 + 16) - (i3 | 16) != 0) {
                    i4 &= -57345;
                }
                if ((i3 + 32) - (i3 | 32) != 0) {
                    i4 &= -458753;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1805417862, i4, -1, "androidx.compose.material3.MediumTopAppBar (AppBar.kt:400)");
            }
            float fM2877getMediumAppBarCollapsedHeightD9Ej5fM = TopAppBarDefaults.INSTANCE.m2877getMediumAppBarCollapsedHeightD9Ej5fM();
            float fM2878getMediumAppBarExpandedHeightD9Ej5fM = TopAppBarDefaults.INSTANCE.m2878getMediumAppBarExpandedHeightD9Ej5fM();
            int i11 = ((-1) - (((-1) - ((-1) - (((-1) - i4) | ((-1) - 14)))) & ((-1) - 221184))) | ((i4 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (112 | i4));
            int i12 = (i4 + 896) - (896 | i4);
            int i13 = ((i11 + i12) - (i11 & i12)) | (7168 & i4);
            int i14 = i4 << 6;
            int i15 = 3670016 & i14;
            int i16 = (-1) - (((-1) - ((i13 + i15) - (i13 & i15))) & ((-1) - ((29360128 + i14) - (29360128 | i14))));
            int i17 = i14 & 234881024;
            Function3 function32 = function3M1958getLambda10$material3_release;
            Function2 function23 = function2M1974getLambda9$material3_release;
            Modifier modifier2 = companion;
            m1788MediumTopAppBaroKE7A98(function2, modifier2, function23, function32, fM2877getMediumAppBarCollapsedHeightD9Ej5fM, fM2878getMediumAppBarExpandedHeightD9Ej5fM, windowInsets2, topAppBarColorsMediumTopAppBarColors, topAppBarScrollBehavior2, composerStartRestartGroup, (i16 + i17) - (i16 & i17), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt.MediumTopAppBar.1
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $actions;
                final /* synthetic */ TopAppBarColors $colors;
                final /* synthetic */ Modifier $modifier;
                final /* synthetic */ Function2<Composer, Integer, Unit> $navigationIcon;
                final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;
                final /* synthetic */ Function2<Composer, Integer, Unit> $title;
                final /* synthetic */ WindowInsets $windowInsets;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C05951(Function2<? super Composer, ? super Integer, Unit> function24, Modifier companion2, Function2<? super Composer, ? super Integer, Unit> function2M1974getLambda9$material3_release2, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3M1958getLambda10$material3_release2, WindowInsets windowInsets22, TopAppBarColors topAppBarColorsMediumTopAppBarColors2, TopAppBarScrollBehavior topAppBarScrollBehavior22, int i22, int i32) {
                    super(2);
                    function2 = function24;
                    modifier = companion2;
                    function2 = function2M1974getLambda9$material3_release2;
                    function3 = function3M1958getLambda10$material3_release2;
                    windowInsets = windowInsets22;
                    topAppBarColors = topAppBarColorsMediumTopAppBarColors2;
                    topAppBarScrollBehavior = topAppBarScrollBehavior22;
                    i = i22;
                    i = i32;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    Function2<Composer, Integer, Unit> function24 = function2;
                    Modifier modifier3 = modifier;
                    Function2<Composer, Integer, Unit> function222 = function2;
                    Function3<RowScope, Composer, Integer, Unit> function33 = function3;
                    WindowInsets windowInsets3 = windowInsets;
                    TopAppBarColors topAppBarColors2 = topAppBarColors;
                    TopAppBarScrollBehavior topAppBarScrollBehavior3 = topAppBarScrollBehavior;
                    int i32 = i;
                    AppBarKt.MediumTopAppBar(function24, modifier3, function222, function33, windowInsets3, topAppBarColors2, topAppBarScrollBehavior3, composer2, RecomposeScopeImplKt.updateChangedFlags((i32 + 1) - (i32 & 1)), i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: MediumTopAppBar-oKE7A98 */
    public static final void m1788MediumTopAppBaroKE7A98(Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, float f2, float f3, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, int i2, int i3) {
        int i4;
        TopAppBarScrollBehavior topAppBarScrollBehavior2 = topAppBarScrollBehavior;
        TopAppBarColors topAppBarColorsMediumTopAppBarColors = topAppBarColors;
        WindowInsets windowInsets2 = windowInsets;
        float fM2878getMediumAppBarExpandedHeightD9Ej5fM = f3;
        float fM2877getMediumAppBarCollapsedHeightD9Ej5fM = f2;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3M1960getLambda12$material3_release = function3;
        Function2<? super Composer, ? super Integer, Unit> function2M1959getLambda11$material3_release = function22;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(1879191686);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(MediumTopAppBar)P(7,4,5!1,1:c#ui.unit.Dp,3:c#ui.unit.Dp,8)465@23246L12,466@23308L23,472@23523L5,473@23594L5,469@23393L947:AppBar.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = (-1) - (((-1) - i2) & ((-1) - 6));
        } else if ((i2 + 6) - (i2 | 6) == 0) {
            int i5 = composerStartRestartGroup.changedInstance(function2) ? 4 : 2;
            i4 = (i5 + i2) - (i5 & i2);
        } else {
            i4 = i2;
        }
        int i6 = (-1) - (((-1) - i3) | ((-1) - 2));
        if (i6 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 48));
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(companion) ? 32 : 16;
        }
        int i7 = (-1) - (((-1) - i3) | ((-1) - 4));
        if (i7 != 0) {
            i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function2M1959getLambda11$material3_release) ? 256 : 128)));
        }
        int i8 = (-1) - (((-1) - i3) | ((-1) - 8));
        if (i8 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            int i9 = composerStartRestartGroup.changedInstance(function3M1960getLambda12$material3_release) ? 2048 : 1024;
            i4 = (i4 + i9) - (i4 & i9);
        }
        int i10 = (-1) - (((-1) - i3) | ((-1) - 16));
        if (i10 != 0) {
            i4 |= 24576;
        } else if ((i2 + 24576) - (i2 | 24576) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(fM2877getMediumAppBarCollapsedHeightD9Ej5fM) ? 16384 : 8192)));
        }
        int i11 = (i3 + 32) - (i3 | 32);
        if (i11 != 0) {
            i4 = (i4 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        } else if ((ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE + i2) - (196608 | i2) == 0) {
            int i12 = composerStartRestartGroup.changed(fM2878getMediumAppBarExpandedHeightD9Ej5fM) ? 131072 : 65536;
            i4 = (i4 + i12) - (i4 & i12);
        }
        if ((-1) - (((-1) - i2) | ((-1) - 1572864)) == 0) {
            int i13 = ((-1) - (((-1) - i3) | ((-1) - 64)) == 0 && composerStartRestartGroup.changed(windowInsets2)) ? 1048576 : 524288;
            i4 = (i4 + i13) - (i4 & i13);
        }
        if ((i2 & 12582912) == 0) {
            int i14 = ((-1) - (((-1) - i3) | ((-1) - 128)) == 0 && composerStartRestartGroup.changed(topAppBarColorsMediumTopAppBarColors)) ? 8388608 : 4194304;
            i4 = (i4 + i14) - (i4 & i14);
        }
        int i15 = (-1) - (((-1) - i3) | ((-1) - 256));
        if (i15 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 100663296));
        } else if ((i2 + 100663296) - (i2 | 100663296) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(topAppBarScrollBehavior2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432)));
        }
        if ((i4 + 38347923) - (38347923 | i4) == 38347922 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((-1) - (((-1) - i2) | ((-1) - 1)) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i6 != 0) {
                    companion = Modifier.Companion;
                }
                if (i7 != 0) {
                    function2M1959getLambda11$material3_release = ComposableSingletons$AppBarKt.INSTANCE.m1959getLambda11$material3_release();
                }
                if (i8 != 0) {
                    function3M1960getLambda12$material3_release = ComposableSingletons$AppBarKt.INSTANCE.m1960getLambda12$material3_release();
                }
                if (i10 != 0) {
                    fM2877getMediumAppBarCollapsedHeightD9Ej5fM = TopAppBarDefaults.INSTANCE.m2877getMediumAppBarCollapsedHeightD9Ej5fM();
                }
                if (i11 != 0) {
                    fM2878getMediumAppBarExpandedHeightD9Ej5fM = TopAppBarDefaults.INSTANCE.m2878getMediumAppBarExpandedHeightD9Ej5fM();
                }
                if ((i3 + 64) - (i3 | 64) != 0) {
                    windowInsets2 = TopAppBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    i4 = (i4 - 3670017) - (i4 | (-3670017));
                }
                if ((i3 & 128) != 0) {
                    topAppBarColorsMediumTopAppBarColors = TopAppBarDefaults.INSTANCE.mediumTopAppBarColors(composerStartRestartGroup, 6);
                    i4 &= -29360129;
                }
                if (i15 != 0) {
                    topAppBarScrollBehavior2 = null;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 & 64) != 0) {
                    i4 = (i4 - 3670017) - (i4 | (-3670017));
                }
                if ((-1) - (((-1) - i3) | ((-1) - 128)) != 0) {
                    i4 &= -29360129;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1879191686, i4, -1, "androidx.compose.material3.MediumTopAppBar (AppBar.kt:469)");
            }
            TextStyle value = TypographyKt.getValue(TopAppBarMediumTokens.INSTANCE.getHeadlineFont(), composerStartRestartGroup, 6);
            TextStyle value2 = TypographyKt.getValue(TopAppBarSmallTokens.INSTANCE.getHeadlineFont(), composerStartRestartGroup, 6);
            float f4 = MediumTitleBottomPadding;
            float fM2877getMediumAppBarCollapsedHeightD9Ej5fM2 = (Dp.m6643equalsimpl0(fM2877getMediumAppBarCollapsedHeightD9Ej5fM, Dp.Companion.m6658getUnspecifiedD9Ej5fM()) || Dp.m6643equalsimpl0(fM2877getMediumAppBarCollapsedHeightD9Ej5fM, Dp.Companion.m6657getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m2877getMediumAppBarCollapsedHeightD9Ej5fM() : fM2877getMediumAppBarCollapsedHeightD9Ej5fM;
            float fM2878getMediumAppBarExpandedHeightD9Ej5fM2 = (Dp.m6643equalsimpl0(fM2878getMediumAppBarExpandedHeightD9Ej5fM, Dp.Companion.m6658getUnspecifiedD9Ej5fM()) || Dp.m6643equalsimpl0(fM2878getMediumAppBarExpandedHeightD9Ej5fM, Dp.Companion.m6657getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m2878getMediumAppBarExpandedHeightD9Ej5fM() : fM2878getMediumAppBarExpandedHeightD9Ej5fM;
            int i16 = i4 >> 3;
            int i17 = (-1) - (((-1) - ((-1) - (((-1) - ((i16 + 14) - (i16 | 14))) & ((-1) - 3072)))) & ((-1) - ((-1) - (((-1) - (i4 << 3)) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)))));
            int i18 = i4 << 12;
            int i19 = (i18 + 57344) - (57344 | i18);
            m1792TwoRowsTopAppBarnS6u9G4(companion, function2, value, f4, function2, value2, function2M1959getLambda11$material3_release, function3M1960getLambda12$material3_release, fM2877getMediumAppBarCollapsedHeightD9Ej5fM2, fM2878getMediumAppBarExpandedHeightD9Ej5fM2, windowInsets2, topAppBarColorsMediumTopAppBarColors, topAppBarScrollBehavior2, composerStartRestartGroup, ((i17 + i19) - (i17 & i19)) | (3670016 & i18) | ((i18 + 29360128) - (i18 | 29360128)), (-1) - (((-1) - (i4 >> 18)) | ((-1) - PhotoshopDirectory.TAG_QUICK_MASK_INFORMATION)), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt.MediumTopAppBar.2
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $actions;
                final /* synthetic */ float $collapsedHeight;
                final /* synthetic */ TopAppBarColors $colors;
                final /* synthetic */ float $expandedHeight;
                final /* synthetic */ Modifier $modifier;
                final /* synthetic */ Function2<Composer, Integer, Unit> $navigationIcon;
                final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;
                final /* synthetic */ Function2<Composer, Integer, Unit> $title;
                final /* synthetic */ WindowInsets $windowInsets;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C05962(Function2<? super Composer, ? super Integer, Unit> function23, Modifier companion2, Function2<? super Composer, ? super Integer, Unit> function2M1959getLambda11$material3_release2, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3M1960getLambda12$material3_release2, float fM2877getMediumAppBarCollapsedHeightD9Ej5fM3, float fM2878getMediumAppBarExpandedHeightD9Ej5fM3, WindowInsets windowInsets22, TopAppBarColors topAppBarColorsMediumTopAppBarColors2, TopAppBarScrollBehavior topAppBarScrollBehavior22, int i22, int i32) {
                    super(2);
                    function2 = function23;
                    modifier = companion2;
                    function2 = function2M1959getLambda11$material3_release2;
                    function3 = function3M1960getLambda12$material3_release2;
                    f = fM2877getMediumAppBarCollapsedHeightD9Ej5fM3;
                    f = fM2878getMediumAppBarExpandedHeightD9Ej5fM3;
                    windowInsets = windowInsets22;
                    topAppBarColors = topAppBarColorsMediumTopAppBarColors2;
                    topAppBarScrollBehavior = topAppBarScrollBehavior22;
                    i = i22;
                    i = i32;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    AppBarKt.m1788MediumTopAppBaroKE7A98(function2, modifier, function2, function3, f, f, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))), i);
                }
            });
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0007K\fGvw\u0016k]Kg\u0004^T2Or[\u001bf\u0014nK>wXuoB\u00044Gx\\FC_\u001c\u007fBZ&r=!bXz2kM?MC=\u0019\u0014[SE)zs\u0007\u000b\u001cpE P\u0002cb+\u000f\u0004\\OO{S/56gtMf")
    @InterfaceC1492Gx
    public static final /* synthetic */ void LargeTopAppBar(Function2 function2, Modifier modifier, Function2 function22, Function3 function3, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, int i2, int i3) {
        int i4;
        TopAppBarScrollBehavior topAppBarScrollBehavior2 = topAppBarScrollBehavior;
        Modifier.Companion companion = modifier;
        TopAppBarColors topAppBarColorsLargeTopAppBarColors = topAppBarColors;
        WindowInsets windowInsets2 = windowInsets;
        Function2 function2M1961getLambda13$material3_release = function22;
        Function3 function3M1962getLambda14$material3_release = function3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-474540752);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(LargeTopAppBar)P(5,2,3!1,6)541@26855L12,542@26917L22,545@27001L385:AppBar.kt#uh7d8r");
        if ((i3 + 1) - (i3 | 1) != 0) {
            i4 = (-1) - (((-1) - i2) & ((-1) - 6));
        } else if ((i2 + 6) - (i2 | 6) == 0) {
            i4 = (-1) - (((-1) - (composerStartRestartGroup.changedInstance(function2) ? 4 : 2)) & ((-1) - i2));
        } else {
            i4 = i2;
        }
        int i5 = (-1) - (((-1) - i3) | ((-1) - 2));
        if (i5 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 48));
        } else if ((i2 + 48) - (i2 | 48) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(companion) ? 32 : 16)));
        }
        int i6 = i3 & 4;
        if (i6 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i2 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function2M1961getLambda13$material3_release) ? 256 : 128)));
        }
        int i7 = (i3 + 8) - (i3 | 8);
        if (i7 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 3072));
        } else if ((i2 + 3072) - (i2 | 3072) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function3M1962getLambda14$material3_release) ? 2048 : 1024)));
        }
        if ((i2 & 24576) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (((-1) - (((-1) - i3) | ((-1) - 16)) == 0 && composerStartRestartGroup.changed(windowInsets2)) ? 16384 : 8192)));
        }
        if ((196608 & i2) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (((-1) - (((-1) - i3) | ((-1) - 32)) == 0 && composerStartRestartGroup.changed(topAppBarColorsLargeTopAppBarColors)) ? 131072 : 65536)));
        }
        int i8 = i3 & 64;
        if (i8 != 0) {
            i4 |= 1572864;
        } else if ((1572864 + i2) - (1572864 | i2) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(topAppBarScrollBehavior2) ? 1048576 : 524288)));
        }
        if ((599187 & i4) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((-1) - (((-1) - i2) | ((-1) - 1)) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    companion = Modifier.Companion;
                }
                if (i6 != 0) {
                    function2M1961getLambda13$material3_release = ComposableSingletons$AppBarKt.INSTANCE.m1961getLambda13$material3_release();
                }
                if (i7 != 0) {
                    function3M1962getLambda14$material3_release = ComposableSingletons$AppBarKt.INSTANCE.m1962getLambda14$material3_release();
                }
                if ((i3 & 16) != 0) {
                    windowInsets2 = TopAppBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-57345)));
                }
                if ((i3 & 32) != 0) {
                    topAppBarColorsLargeTopAppBarColors = TopAppBarDefaults.INSTANCE.largeTopAppBarColors(composerStartRestartGroup, 6);
                    i4 = (i4 - 458753) - (i4 | (-458753));
                }
                if (i8 != 0) {
                    topAppBarScrollBehavior2 = null;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
                    i4 &= -57345;
                }
                if ((i3 + 32) - (i3 | 32) != 0) {
                    i4 = (i4 - 458753) - (i4 | (-458753));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-474540752, i4, -1, "androidx.compose.material3.LargeTopAppBar (AppBar.kt:545)");
            }
            float fM2875getLargeAppBarCollapsedHeightD9Ej5fM = TopAppBarDefaults.INSTANCE.m2875getLargeAppBarCollapsedHeightD9Ej5fM();
            float fM2876getLargeAppBarExpandedHeightD9Ej5fM = TopAppBarDefaults.INSTANCE.m2876getLargeAppBarExpandedHeightD9Ej5fM();
            int i9 = ((-1) - (((-1) - ((((i4 + 14) - (14 | i4)) | 221184) | ((-1) - (((-1) - i4) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION))))) & ((-1) - (896 & i4)))) | ((i4 + 7168) - (7168 | i4));
            int i10 = i4 << 6;
            int i11 = (-1) - (((-1) - ((-1) - (((-1) - i9) & ((-1) - ((3670016 + i10) - (3670016 | i10)))))) & ((-1) - ((-1) - (((-1) - 29360128) | ((-1) - i10)))));
            int i12 = (i10 + 234881024) - (i10 | 234881024);
            Function2 function23 = function2M1961getLambda13$material3_release;
            Modifier modifier2 = companion;
            m1787LargeTopAppBaroKE7A98(function2, modifier2, function23, function3M1962getLambda14$material3_release, fM2875getLargeAppBarCollapsedHeightD9Ej5fM, fM2876getLargeAppBarExpandedHeightD9Ej5fM, windowInsets2, topAppBarColorsLargeTopAppBarColors, topAppBarScrollBehavior2, composerStartRestartGroup, (i11 + i12) - (i11 & i12), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt.LargeTopAppBar.1
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $actions;
                final /* synthetic */ TopAppBarColors $colors;
                final /* synthetic */ Modifier $modifier;
                final /* synthetic */ Function2<Composer, Integer, Unit> $navigationIcon;
                final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;
                final /* synthetic */ Function2<Composer, Integer, Unit> $title;
                final /* synthetic */ WindowInsets $windowInsets;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C05931(Function2<? super Composer, ? super Integer, Unit> function24, Modifier companion2, Function2<? super Composer, ? super Integer, Unit> function2M1961getLambda13$material3_release2, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3M1962getLambda14$material3_release2, WindowInsets windowInsets22, TopAppBarColors topAppBarColorsLargeTopAppBarColors2, TopAppBarScrollBehavior topAppBarScrollBehavior22, int i22, int i32) {
                    super(2);
                    function2 = function24;
                    modifier = companion2;
                    function2 = function2M1961getLambda13$material3_release2;
                    function3 = function3M1962getLambda14$material3_release2;
                    windowInsets = windowInsets22;
                    topAppBarColors = topAppBarColorsLargeTopAppBarColors2;
                    topAppBarScrollBehavior = topAppBarScrollBehavior22;
                    i = i22;
                    i = i32;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    AppBarKt.LargeTopAppBar(function2, modifier, function2, function3, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: LargeTopAppBar-oKE7A98 */
    public static final void m1787LargeTopAppBaroKE7A98(Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, float f2, float f3, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, int i2, int i3) {
        int i4;
        TopAppBarScrollBehavior topAppBarScrollBehavior2 = topAppBarScrollBehavior;
        TopAppBarColors topAppBarColorsLargeTopAppBarColors = topAppBarColors;
        WindowInsets windowInsets2 = windowInsets;
        float fM2876getLargeAppBarExpandedHeightD9Ej5fM = f3;
        float fM2875getLargeAppBarCollapsedHeightD9Ej5fM = f2;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3M1964getLambda16$material3_release = function3;
        Function2<? super Composer, ? super Integer, Unit> function2M1963getLambda15$material3_release = function22;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-630005584);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(LargeTopAppBar)P(7,4,5!1,1:c#ui.unit.Dp,3:c#ui.unit.Dp,8)610@30747L12,611@30809L22,616@30993L5,617@31064L5,614@30893L943:AppBar.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = (i2 + 6) - (i2 & 6);
        } else if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = (i3 + 2) - (i3 | 2);
        if (i5 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 48));
        } else if ((i2 + 48) - (i2 | 48) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(companion) ? 32 : 16)));
        }
        int i6 = (i3 + 4) - (i3 | 4);
        if (i6 != 0) {
            i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            int i7 = composerStartRestartGroup.changedInstance(function2M1963getLambda15$material3_release) ? 256 : 128;
            i4 = (i4 + i7) - (i4 & i7);
        }
        int i8 = (-1) - (((-1) - i3) | ((-1) - 8));
        if (i8 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 3072));
        } else if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function3M1964getLambda16$material3_release) ? 2048 : 1024;
        }
        int i9 = (i3 + 16) - (i3 | 16);
        if (i9 != 0) {
            i4 |= 24576;
        } else if ((-1) - (((-1) - i2) | ((-1) - 24576)) == 0) {
            int i10 = composerStartRestartGroup.changed(fM2875getLargeAppBarCollapsedHeightD9Ej5fM) ? 16384 : 8192;
            i4 = (i4 + i10) - (i4 & i10);
        }
        int i11 = (i3 + 32) - (i3 | 32);
        if (i11 != 0) {
            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((-1) - (((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) | ((-1) - i2)) == 0) {
            i4 |= composerStartRestartGroup.changed(fM2876getLargeAppBarExpandedHeightD9Ej5fM) ? 131072 : 65536;
        }
        if ((i2 + 1572864) - (i2 | 1572864) == 0) {
            int i12 = ((-1) - (((-1) - i3) | ((-1) - 64)) == 0 && composerStartRestartGroup.changed(windowInsets2)) ? 1048576 : 524288;
            i4 = (i4 + i12) - (i4 & i12);
        }
        if ((-1) - (((-1) - i2) | ((-1) - 12582912)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (((i3 & 128) == 0 && composerStartRestartGroup.changed(topAppBarColorsLargeTopAppBarColors)) ? 8388608 : 4194304)));
        }
        int i13 = i3 & 256;
        if (i13 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 100663296));
        } else if ((i2 + 100663296) - (i2 | 100663296) == 0) {
            int i14 = composerStartRestartGroup.changed(topAppBarScrollBehavior2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
            i4 = (i4 + i14) - (i4 & i14);
        }
        if ((-1) - (((-1) - i4) | ((-1) - 38347923)) == 38347922 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    companion = Modifier.Companion;
                }
                if (i6 != 0) {
                    function2M1963getLambda15$material3_release = ComposableSingletons$AppBarKt.INSTANCE.m1963getLambda15$material3_release();
                }
                if (i8 != 0) {
                    function3M1964getLambda16$material3_release = ComposableSingletons$AppBarKt.INSTANCE.m1964getLambda16$material3_release();
                }
                if (i9 != 0) {
                    fM2875getLargeAppBarCollapsedHeightD9Ej5fM = TopAppBarDefaults.INSTANCE.m2875getLargeAppBarCollapsedHeightD9Ej5fM();
                }
                if (i11 != 0) {
                    fM2876getLargeAppBarExpandedHeightD9Ej5fM = TopAppBarDefaults.INSTANCE.m2876getLargeAppBarExpandedHeightD9Ej5fM();
                }
                if ((i3 + 64) - (i3 | 64) != 0) {
                    windowInsets2 = TopAppBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    i4 &= -3670017;
                }
                if ((i3 & 128) != 0) {
                    topAppBarColorsLargeTopAppBarColors = TopAppBarDefaults.INSTANCE.largeTopAppBarColors(composerStartRestartGroup, 6);
                    i4 &= -29360129;
                }
                if (i13 != 0) {
                    topAppBarScrollBehavior2 = null;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 & 64) != 0) {
                    i4 &= -3670017;
                }
                if ((-1) - (((-1) - i3) | ((-1) - 128)) != 0) {
                    i4 &= -29360129;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-630005584, i4, -1, "androidx.compose.material3.LargeTopAppBar (AppBar.kt:614)");
            }
            TextStyle value = TypographyKt.getValue(TopAppBarLargeTokens.INSTANCE.getHeadlineFont(), composerStartRestartGroup, 6);
            TextStyle value2 = TypographyKt.getValue(TopAppBarSmallTokens.INSTANCE.getHeadlineFont(), composerStartRestartGroup, 6);
            float f4 = LargeTitleBottomPadding;
            float fM2875getLargeAppBarCollapsedHeightD9Ej5fM2 = (Dp.m6643equalsimpl0(fM2875getLargeAppBarCollapsedHeightD9Ej5fM, Dp.Companion.m6658getUnspecifiedD9Ej5fM()) || Dp.m6643equalsimpl0(fM2875getLargeAppBarCollapsedHeightD9Ej5fM, Dp.Companion.m6657getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m2875getLargeAppBarCollapsedHeightD9Ej5fM() : fM2875getLargeAppBarCollapsedHeightD9Ej5fM;
            float fM2876getLargeAppBarExpandedHeightD9Ej5fM2 = (Dp.m6643equalsimpl0(fM2876getLargeAppBarExpandedHeightD9Ej5fM, Dp.Companion.m6658getUnspecifiedD9Ej5fM()) || Dp.m6643equalsimpl0(fM2876getLargeAppBarExpandedHeightD9Ej5fM, Dp.Companion.m6657getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m2876getLargeAppBarExpandedHeightD9Ej5fM() : fM2876getLargeAppBarExpandedHeightD9Ej5fM;
            int i15 = ((-1) - (((-1) - (i4 >> 3)) | ((-1) - 14))) | 3072 | ((-1) - (((-1) - (i4 << 3)) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)));
            int i16 = i4 << 12;
            int i17 = (-1) - (((-1) - i16) | ((-1) - 57344));
            int i18 = (-1) - (((-1) - ((i15 + i17) - (i15 & i17))) & ((-1) - ((i16 + 3670016) - (3670016 | i16))));
            int i19 = i16 & 29360128;
            m1792TwoRowsTopAppBarnS6u9G4(companion, function2, value, f4, function2, value2, function2M1963getLambda15$material3_release, function3M1964getLambda16$material3_release, fM2875getLargeAppBarCollapsedHeightD9Ej5fM2, fM2876getLargeAppBarExpandedHeightD9Ej5fM2, windowInsets2, topAppBarColorsLargeTopAppBarColors, topAppBarScrollBehavior2, composerStartRestartGroup, (i18 + i19) - (i18 & i19), (-1) - (((-1) - (i4 >> 18)) | ((-1) - PhotoshopDirectory.TAG_QUICK_MASK_INFORMATION)), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt.LargeTopAppBar.2
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $actions;
                final /* synthetic */ float $collapsedHeight;
                final /* synthetic */ TopAppBarColors $colors;
                final /* synthetic */ float $expandedHeight;
                final /* synthetic */ Modifier $modifier;
                final /* synthetic */ Function2<Composer, Integer, Unit> $navigationIcon;
                final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;
                final /* synthetic */ Function2<Composer, Integer, Unit> $title;
                final /* synthetic */ WindowInsets $windowInsets;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C05942(Function2<? super Composer, ? super Integer, Unit> function23, Modifier companion2, Function2<? super Composer, ? super Integer, Unit> function2M1963getLambda15$material3_release2, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3M1964getLambda16$material3_release2, float fM2875getLargeAppBarCollapsedHeightD9Ej5fM3, float fM2876getLargeAppBarExpandedHeightD9Ej5fM3, WindowInsets windowInsets22, TopAppBarColors topAppBarColorsLargeTopAppBarColors2, TopAppBarScrollBehavior topAppBarScrollBehavior22, int i22, int i32) {
                    super(2);
                    function2 = function23;
                    modifier = companion2;
                    function2 = function2M1963getLambda15$material3_release2;
                    function3 = function3M1964getLambda16$material3_release2;
                    f = fM2875getLargeAppBarCollapsedHeightD9Ej5fM3;
                    f = fM2876getLargeAppBarExpandedHeightD9Ej5fM3;
                    windowInsets = windowInsets22;
                    topAppBarColors = topAppBarColorsLargeTopAppBarColors2;
                    topAppBarScrollBehavior = topAppBarScrollBehavior22;
                    i = i22;
                    i = i32;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    AppBarKt.m1787LargeTopAppBaroKE7A98(function2, modifier, function2, function3, f, f, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:200:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x01e5  */
    /* JADX INFO: renamed from: BottomAppBar-Snr_uVM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1783BottomAppBarSnr_uVM(kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r14, androidx.compose.ui.Modifier r15, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r16, long r17, long r19, float r21, androidx.compose.foundation.layout.PaddingValues r22, androidx.compose.foundation.layout.WindowInsets r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instruction units count: 741
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.m1783BottomAppBarSnr_uVM(kotlin.jvm.functions.Function3, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, long, long, float, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.layout.WindowInsets, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: renamed from: BottomAppBar-qhFBPw4 */
    public static final void m1785BottomAppBarqhFBPw4(final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, long j2, long j3, float f2, PaddingValues paddingValues, WindowInsets windowInsets, BottomAppBarScrollBehavior bottomAppBarScrollBehavior, Composer composer, final int i2, final int i3) {
        int i4;
        BottomAppBarScrollBehavior bottomAppBarScrollBehavior2 = bottomAppBarScrollBehavior;
        WindowInsets windowInsets2 = windowInsets;
        PaddingValues contentPadding = paddingValues;
        long jM1947contentColorForek8zF_U = j3;
        long containerColor = j2;
        float fM1807getContainerElevationD9Ej5fM = f2;
        Function2<? super Composer, ? super Integer, Unit> function22 = function2;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1044837119);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(BottomAppBar)P(!1,5,4,1:c#ui.graphics.Color,2:c#ui.graphics.Color,7:c#ui.unit.Dp!1,8)743@37109L14,744@37151L31,747@37377L12,758@37741L539,750@37455L825:AppBar.kt#uh7d8r");
        if ((i3 + 1) - (i3 | 1) != 0) {
            i4 = (i2 + 6) - (i2 & 6);
        } else if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(function3) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = (-1) - (((-1) - i3) | ((-1) - 2));
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 + 48) - (i2 | 48) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(companion) ? 32 : 16)));
        }
        int i6 = (-1) - (((-1) - i3) | ((-1) - 4));
        if (i6 != 0) {
            i4 = (i4 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i4 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            int i7 = composerStartRestartGroup.changedInstance(function22) ? 256 : 128;
            i4 = (i4 + i7) - (i4 & i7);
        }
        if ((i2 + 3072) - (i2 | 3072) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (((i3 + 8) - (i3 | 8) == 0 && composerStartRestartGroup.changed(containerColor)) ? 2048 : 1024)));
        }
        if ((i2 + 24576) - (i2 | 24576) == 0) {
            int i8 = ((i3 & 16) == 0 && composerStartRestartGroup.changed(jM1947contentColorForek8zF_U)) ? 16384 : 8192;
            i4 = (i4 + i8) - (i4 & i8);
        }
        int i9 = (i3 + 32) - (i3 | 32);
        if (i9 != 0) {
            i4 = (i4 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        } else if ((ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE + i2) - (196608 | i2) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(fM1807getContainerElevationD9Ej5fM) ? 131072 : 65536)));
        }
        int i10 = (-1) - (((-1) - i3) | ((-1) - 64));
        if (i10 != 0) {
            i4 = (i4 + 1572864) - (i4 & 1572864);
        } else if ((i2 + 1572864) - (i2 | 1572864) == 0) {
            i4 |= composerStartRestartGroup.changed(contentPadding) ? 1048576 : 524288;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 12582912)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (((-1) - (((-1) - i3) | ((-1) - 128)) == 0 && composerStartRestartGroup.changed(windowInsets2)) ? 8388608 : 4194304)));
        }
        int i11 = (i3 + 256) - (i3 | 256);
        if (i11 != 0) {
            i4 |= 100663296;
        } else if ((i2 & 100663296) == 0) {
            i4 |= composerStartRestartGroup.changed(bottomAppBarScrollBehavior2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 38347923)) == 38347922 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((-1) - (((-1) - i2) | ((-1) - 1)) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    companion = Modifier.Companion;
                }
                if (i6 != 0) {
                    function22 = null;
                }
                if ((i3 + 8) - (i3 | 8) != 0) {
                    containerColor = BottomAppBarDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    i4 &= -7169;
                }
                if ((i3 & 16) != 0) {
                    jM1947contentColorForek8zF_U = ColorSchemeKt.m1947contentColorForek8zF_U(containerColor, composerStartRestartGroup, (-1) - (((-1) - (i4 >> 9)) | ((-1) - 14)));
                    i4 &= -57345;
                }
                if (i9 != 0) {
                    fM1807getContainerElevationD9Ej5fM = BottomAppBarDefaults.INSTANCE.m1807getContainerElevationD9Ej5fM();
                }
                if (i10 != 0) {
                    contentPadding = BottomAppBarDefaults.INSTANCE.getContentPadding();
                }
                if ((i3 + 128) - (i3 | 128) != 0) {
                    windowInsets2 = BottomAppBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    i4 &= -29360129;
                }
                if (i11 != 0) {
                    bottomAppBarScrollBehavior2 = null;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 + 8) - (i3 | 8) != 0) {
                    i4 = (i4 - 7169) - (i4 | (-7169));
                }
                if ((i3 & 16) != 0) {
                    i4 = (i4 - 57345) - (i4 | (-57345));
                }
                if ((i3 + 128) - (i3 | 128) != 0) {
                    i4 &= -29360129;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1044837119, i4, -1, "androidx.compose.material3.BottomAppBar (AppBar.kt:750)");
            }
            final Function2<? super Composer, ? super Integer, Unit> function23 = function22;
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1566394874, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                    invoke(rowScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RowScope rowScope, Composer composer2, int i12) {
                    int i13 = i12;
                    ComposerKt.sourceInformation(composer2, "C759@37751L204,766@38012L252:AppBar.kt#uh7d8r");
                    if ((i13 + 6) - (6 | i13) == 0) {
                        i13 = (-1) - (((-1) - i13) & ((-1) - (composer2.changed(rowScope) ? 4 : 2)));
                    }
                    if ((i13 + 19) - (19 | i13) != 18 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1566394874, i13, -1, "androidx.compose.material3.BottomAppBar.<anonymous> (AppBar.kt:759)");
                        }
                        Modifier modifierWeight$default = RowScope.weight$default(rowScope, Modifier.Companion, 1.0f, false, 2, null);
                        Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                        Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                        Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                        ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, 54);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierWeight$default);
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
                        if (function23 != null) {
                            Modifier modifierM1022paddingqDBjuR0$default = PaddingKt.m1022paddingqDBjuR0$default(SizeKt.fillMaxHeight$default(Modifier.Companion, 0.0f, 1, null), 0.0f, AppBarKt.FABVerticalPadding, AppBarKt.FABHorizontalPadding, 0.0f, 9, null);
                            Alignment topStart = Alignment.Companion.getTopStart();
                            Function2<Composer, Integer, Unit> function24 = function23;
                            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(topStart, false);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierM1022paddingqDBjuR0$default);
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
                            ComposerKt.sourceInformationMarkerStart(composer2, 553416911, "C771@38228L22:AppBar.kt#uh7d8r");
                            function24.invoke(composer2, 0);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54);
            int i12 = (-1) - (((-1) - ((-1) - (((-1) - (i4 >> 3)) | ((-1) - 14)))) & ((-1) - 12582912));
            int i13 = i4 >> 6;
            int i14 = (i13 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (112 | i13);
            int i15 = (-1) - (((-1) - ((-1) - (((-1) - ((i12 + i14) - (i12 & i14))) & ((-1) - ((-1) - (((-1) - i13) | ((-1) - 896))))))) & ((-1) - (7168 & i13)));
            int i16 = 57344 & i13;
            m1784BottomAppBare3WI5M(companion, containerColor, jM1947contentColorForek8zF_U, fM1807getContainerElevationD9Ej5fM, contentPadding, windowInsets2, bottomAppBarScrollBehavior2, composableLambdaRememberComposableLambda, composerStartRestartGroup, ((-1) - (((-1) - ((i15 + i16) - (i15 & i16))) & ((-1) - ((-1) - (((-1) - 458752) | ((-1) - i13)))))) | ((-1) - (((-1) - i13) | ((-1) - 3670016))), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final long j4 = containerColor;
            final long j5 = jM1947contentColorForek8zF_U;
            final float f3 = fM1807getContainerElevationD9Ej5fM;
            final PaddingValues paddingValues2 = contentPadding;
            final WindowInsets windowInsets3 = windowInsets2;
            final BottomAppBarScrollBehavior bottomAppBarScrollBehavior3 = bottomAppBarScrollBehavior2;
            final Modifier modifier2 = companion;
            final Function2<? super Composer, ? super Integer, Unit> function24 = function22;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$3
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
                    AppBarKt.m1785BottomAppBarqhFBPw4(function3, modifier2, function24, j4, j5, f3, paddingValues2, windowInsets3, bottomAppBarScrollBehavior3, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
    }

    /* JADX INFO: renamed from: BottomAppBar-1oL4kX8 */
    public static final void m1782BottomAppBar1oL4kX8(Modifier modifier, long j2, long j3, float f2, PaddingValues paddingValues, WindowInsets windowInsets, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i2, final int i3) {
        int i4;
        long jM1947contentColorForek8zF_U = j3;
        PaddingValues contentPadding = paddingValues;
        WindowInsets windowInsets2 = windowInsets;
        long containerColor = j2;
        float fM1807getContainerElevationD9Ej5fM = f2;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1391700845);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(BottomAppBar)P(4,0:c#ui.graphics.Color,2:c#ui.graphics.Color,5:c#ui.unit.Dp,3,6)807@39959L14,808@40001L31,811@40227L12,814@40294L302:AppBar.kt#uh7d8r");
        int i5 = (i3 + 1) - (i3 | 1);
        if (i5 != 0) {
            i4 = (-1) - (((-1) - i2) & ((-1) - 6));
        } else if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            i4 = (-1) - (((-1) - (composerStartRestartGroup.changed(companion) ? 4 : 2)) & ((-1) - i2));
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (((i3 + 2) - (i3 | 2) == 0 && composerStartRestartGroup.changed(containerColor)) ? 32 : 16)));
        }
        if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 |= ((i3 & 4) == 0 && composerStartRestartGroup.changed(jM1947contentColorForek8zF_U)) ? 256 : 128;
        }
        int i6 = (i3 + 8) - (i3 | 8);
        if (i6 != 0) {
            i4 |= 3072;
        } else if ((i2 + 3072) - (i2 | 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(fM1807getContainerElevationD9Ej5fM) ? 2048 : 1024;
        }
        int i7 = (i3 + 16) - (i3 | 16);
        if (i7 != 0) {
            i4 = (i4 + 24576) - (i4 & 24576);
        } else if ((i2 & 24576) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(contentPadding) ? 16384 : 8192)));
        }
        if ((ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE + i2) - (196608 | i2) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (((i3 + 32) - (i3 | 32) == 0 && composerStartRestartGroup.changed(windowInsets2)) ? 131072 : 65536)));
        }
        if ((-1) - (((-1) - i3) | ((-1) - 64)) != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 1572864));
        } else if ((-1) - (((-1) - i2) | ((-1) - 1572864)) == 0) {
            int i8 = composerStartRestartGroup.changedInstance(function3) ? 1048576 : 524288;
            i4 = (i4 + i8) - (i4 & i8);
        }
        if ((i4 & 599187) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 + 1) - (i2 | 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    companion = Modifier.Companion;
                }
                if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
                    containerColor = BottomAppBarDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-113)));
                }
                if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
                    jM1947contentColorForek8zF_U = ColorSchemeKt.m1947contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i4 >> 3) & 14);
                    i4 = (i4 - 897) - (i4 | (-897));
                }
                if (i6 != 0) {
                    fM1807getContainerElevationD9Ej5fM = BottomAppBarDefaults.INSTANCE.m1807getContainerElevationD9Ej5fM();
                }
                if (i7 != 0) {
                    contentPadding = BottomAppBarDefaults.INSTANCE.getContentPadding();
                }
                if ((i3 + 32) - (i3 | 32) != 0) {
                    windowInsets2 = BottomAppBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-458753)));
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-113)));
                }
                if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-897)));
                }
                if ((i3 + 32) - (i3 | 32) != 0) {
                    i4 &= -458753;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1391700845, i4, -1, "androidx.compose.material3.BottomAppBar (AppBar.kt:814)");
            }
            companion = companion;
            m1784BottomAppBare3WI5M(companion, containerColor, jM1947contentColorForek8zF_U, fM1807getContainerElevationD9Ej5fM, contentPadding, windowInsets2, null, function3, composerStartRestartGroup, (-1) - (((-1) - (((-1) - (((-1) - ((-1) - (((-1) - ((-1) - (((-1) - ((-1) - (((-1) - (((-1) - (((-1) - i4) | ((-1) - 14))) | 1572864)) & ((-1) - (112 & i4))))) & ((-1) - ((-1) - (((-1) - i4) | ((-1) - 896))))))) & ((-1) - ((i4 + 7168) - (7168 | i4)))))) & ((-1) - (57344 & i4)))) | ((-1) - (((-1) - 458752) | ((-1) - i4))))) & ((-1) - ((-1) - (((-1) - (i4 << 3)) | ((-1) - 29360128))))), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            final long j4 = containerColor;
            final long j5 = jM1947contentColorForek8zF_U;
            final float f3 = fM1807getContainerElevationD9Ej5fM;
            final PaddingValues paddingValues2 = contentPadding;
            final WindowInsets windowInsets3 = windowInsets2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$4
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
                    AppBarKt.m1782BottomAppBar1oL4kX8(modifier2, j4, j5, f3, paddingValues2, windowInsets3, function3, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i2) & ((-1) - 1))), i3);
                }
            });
        }
    }

    /* JADX INFO: renamed from: BottomAppBar-e-3WI5M */
    public static final void m1784BottomAppBare3WI5M(Modifier modifier, long j2, long j3, float f2, PaddingValues paddingValues, WindowInsets windowInsets, BottomAppBarScrollBehavior bottomAppBarScrollBehavior, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier.Companion companionDraggable$default;
        final BottomAppBarScrollBehavior bottomAppBarScrollBehavior2 = bottomAppBarScrollBehavior;
        final WindowInsets windowInsets2 = windowInsets;
        long jM1947contentColorForek8zF_U = j3;
        final PaddingValues contentPadding = paddingValues;
        long containerColor = j2;
        float fM1807getContainerElevationD9Ej5fM = f2;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(422438773);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(BottomAppBar)P(4,0:c#ui.graphics.Color,2:c#ui.graphics.Color,6:c#ui.unit.Dp,3,7,5)860@42630L14,861@42672L31,864@42898L12,896@44292L5,899@44363L596,911@45008L364,891@44025L1347:AppBar.kt#uh7d8r");
        int i5 = (-1) - (((-1) - i3) | ((-1) - 1));
        if (i5 != 0) {
            i4 = (i2 + 6) - (i2 & 6);
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(companion) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            int i6 = ((i3 & 2) == 0 && composerStartRestartGroup.changed(containerColor)) ? 32 : 16;
            i4 = (i4 + i6) - (i4 & i6);
        }
        if ((i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i2 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 |= ((i3 & 4) == 0 && composerStartRestartGroup.changed(jM1947contentColorForek8zF_U)) ? 256 : 128;
        }
        int i7 = i3 & 8;
        if (i7 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 3072));
        } else if ((-1) - (((-1) - i2) | ((-1) - 3072)) == 0) {
            int i8 = composerStartRestartGroup.changed(fM1807getContainerElevationD9Ej5fM) ? 2048 : 1024;
            i4 = (i4 + i8) - (i4 & i8);
        }
        int i9 = (-1) - (((-1) - i3) | ((-1) - 16));
        if (i9 != 0) {
            i4 = (i4 + 24576) - (i4 & 24576);
        } else if ((i2 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changed(contentPadding) ? 16384 : 8192;
        }
        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            int i10 = ((i3 + 32) - (i3 | 32) == 0 && composerStartRestartGroup.changed(windowInsets2)) ? 131072 : 65536;
            i4 = (i4 + i10) - (i4 & i10);
        }
        int i11 = i3 & 64;
        if (i11 != 0) {
            i4 = (i4 + 1572864) - (i4 & 1572864);
        } else if ((i2 + 1572864) - (i2 | 1572864) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(bottomAppBarScrollBehavior2) ? 1048576 : 524288)));
        }
        if ((i3 & 128) != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 12582912));
        } else if ((i2 & 12582912) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function3) ? 8388608 : 4194304;
        }
        if ((4793491 + i4) - (4793491 | i4) == 4793490 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((-1) - (((-1) - i2) | ((-1) - 1)) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    companion = Modifier.Companion;
                }
                if ((i3 & 2) != 0) {
                    containerColor = BottomAppBarDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    i4 &= -113;
                }
                if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
                    int i12 = i4 >> 3;
                    jM1947contentColorForek8zF_U = ColorSchemeKt.m1947contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 + 14) - (i12 | 14));
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-897)));
                }
                if (i7 != 0) {
                    fM1807getContainerElevationD9Ej5fM = BottomAppBarDefaults.INSTANCE.m1807getContainerElevationD9Ej5fM();
                }
                if (i9 != 0) {
                    contentPadding = BottomAppBarDefaults.INSTANCE.getContentPadding();
                }
                if ((i3 + 32) - (i3 | 32) != 0) {
                    windowInsets2 = BottomAppBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    i4 = (i4 - 458753) - (i4 | (-458753));
                }
                if (i11 != 0) {
                    bottomAppBarScrollBehavior2 = null;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 & 2) != 0) {
                    i4 = (i4 - 113) - (i4 | (-113));
                }
                if ((i3 & 4) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-897)));
                }
                if ((i3 + 32) - (i3 | 32) != 0) {
                    i4 = (i4 - 458753) - (i4 | (-458753));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(422438773, i4, -1, "androidx.compose.material3.BottomAppBar (AppBar.kt:867)");
            }
            composerStartRestartGroup.startReplaceGroup(1393560009);
            ComposerKt.sourceInformation(composerStartRestartGroup, "874@43358L55,874@43335L78,875@43447L289");
            if (bottomAppBarScrollBehavior2 == null || bottomAppBarScrollBehavior2.isPinned()) {
                companionDraggable$default = Modifier.Companion;
            } else {
                Modifier.Companion companion2 = Modifier.Companion;
                Orientation orientation = Orientation.Vertical;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1393566103, "CC(remember):AppBar.kt#9igjgp");
                int i13 = (i4 + 3670016) - (i4 | 3670016);
                boolean z2 = i13 == 1048576;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z2 || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = (Function1) new Function1<Float, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$appBarDragModifier$1$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Float f3) {
                            invoke(f3.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(float f3) {
                            BottomAppBarState state = bottomAppBarScrollBehavior2.getState();
                            state.setHeightOffset(state.getHeightOffset() - f3);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                DraggableState draggableStateRememberDraggableState = DraggableKt.rememberDraggableState((Function1) objRememberedValue, composerStartRestartGroup, 0);
                Modifier.Companion companion3 = companion2;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1393569185, "CC(remember):AppBar.kt#9igjgp");
                boolean z3 = i13 == 1048576;
                AppBarKt$BottomAppBar$appBarDragModifier$2$1 appBarKt$BottomAppBar$appBarDragModifier$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (z3 || appBarKt$BottomAppBar$appBarDragModifier$2$1RememberedValue == Composer.Companion.getEmpty()) {
                    appBarKt$BottomAppBar$appBarDragModifier$2$1RememberedValue = new AppBarKt$BottomAppBar$appBarDragModifier$2$1(bottomAppBarScrollBehavior2, null);
                    composerStartRestartGroup.updateRememberedValue(appBarKt$BottomAppBar$appBarDragModifier$2$1RememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                companionDraggable$default = DraggableKt.draggable$default(companion3, draggableStateRememberDraggableState, orientation, false, null, false, null, (Function3) appBarKt$BottomAppBar$appBarDragModifier$2$1RememberedValue, false, 188, null);
            }
            composerStartRestartGroup.endReplaceGroup();
            Shape value = ShapesKt.getValue(BottomAppBarTokens.INSTANCE.getContainerShape(), composerStartRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1393598804, "CC(remember):AppBar.kt#9igjgp");
            boolean z4 = (3670016 + i4) - (3670016 | i4) == 1048576;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = (Function3) new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$5$1
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                        return m1796invoke3p2s80s(measureScope, measurable, constraints.m6597unboximpl());
                    }

                    /* JADX INFO: renamed from: invoke-3p2s80s, reason: not valid java name */
                    public final MeasureResult m1796invoke3p2s80s(MeasureScope measureScope, Measurable measurable, long j4) {
                        BottomAppBarState state;
                        BottomAppBarScrollBehavior bottomAppBarScrollBehavior3 = bottomAppBarScrollBehavior2;
                        BottomAppBarState state2 = bottomAppBarScrollBehavior3 != null ? bottomAppBarScrollBehavior3.getState() : null;
                        if (state2 != null) {
                            state2.setHeightOffsetLimit(-measureScope.mo710toPx0680j_4(BottomAppBarTokens.INSTANCE.m3035getContainerHeightD9Ej5fM()));
                        }
                        final Placeable placeableMo5514measureBRTryo0 = measurable.mo5514measureBRTryo0(j4);
                        float height = placeableMo5514measureBRTryo0.getHeight();
                        BottomAppBarScrollBehavior bottomAppBarScrollBehavior4 = bottomAppBarScrollBehavior2;
                        return MeasureScope.layout$default(measureScope, placeableMo5514measureBRTryo0.getWidth(), MathKt.roundToInt(height + ((bottomAppBarScrollBehavior4 == null || (state = bottomAppBarScrollBehavior4.getState()) == null) ? 0.0f : state.getHeightOffset())), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$5$1.1
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
                                Placeable.PlacementScope.place$default(placementScope, placeableMo5514measureBRTryo0, 0, 0, 0.0f, 4, null);
                            }
                        }, 4, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            int i14 = i4 << 3;
            SurfaceKt.m2561SurfaceT9BRK9s(LayoutModifierKt.layout(companion, (Function3) objRememberedValue2).then(companionDraggable$default), value, containerColor, jM1947contentColorForek8zF_U, fM1807getContainerElevationD9Ej5fM, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1243053520, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$6
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

                public final void invoke(Composer composer2, int i15) {
                    ComposerKt.sourceInformation(composer2, "C912@45018L348:AppBar.kt#uh7d8r");
                    if ((i15 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1243053520, i15, -1, "androidx.compose.material3.BottomAppBar.<anonymous> (AppBar.kt:912)");
                        }
                        Modifier modifierPadding = PaddingKt.padding(SizeKt.m1049height3ABfNKs(WindowInsetsPaddingKt.windowInsetsPadding(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), windowInsets2), BottomAppBarTokens.INSTANCE.m3035getContainerHeightD9Ej5fM()), contentPadding);
                        Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                        Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                        Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                        ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, 54);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierPadding);
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
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((-1) - (((-1) - (((i14 + 896) - (896 | i14)) | 12582912)) & ((-1) - ((-1) - (((-1) - i14) | ((-1) - 7168)))))) | ((i14 + 57344) - (i14 | 57344)), 96);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            final long j4 = containerColor;
            final long j5 = jM1947contentColorForek8zF_U;
            final float f3 = fM1807getContainerElevationD9Ej5fM;
            final PaddingValues paddingValues2 = contentPadding;
            final WindowInsets windowInsets3 = windowInsets2;
            final BottomAppBarScrollBehavior bottomAppBarScrollBehavior3 = bottomAppBarScrollBehavior2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$7
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

                public final void invoke(Composer composer2, int i15) {
                    Modifier modifier3 = modifier2;
                    long j6 = j4;
                    long j7 = j5;
                    float f4 = f3;
                    PaddingValues paddingValues3 = paddingValues2;
                    WindowInsets windowInsets4 = windowInsets3;
                    BottomAppBarScrollBehavior bottomAppBarScrollBehavior4 = bottomAppBarScrollBehavior3;
                    Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                    int i16 = i2;
                    AppBarKt.m1784BottomAppBare3WI5M(modifier3, j6, j7, f4, paddingValues3, windowInsets4, bottomAppBarScrollBehavior4, function32, composer2, RecomposeScopeImplKt.updateChangedFlags((i16 + 1) - (i16 & 1)), i3);
                }
            });
        }
    }

    public static final TopAppBarState rememberTopAppBarState(final float f2, final float f3, final float f4, Composer composer, int i2, int i3) {
        ComposerKt.sourceInformationMarkerStart(composer, 1801969826, "C(rememberTopAppBarState)P(2,1)1292@62790L99,1292@62743L146:AppBar.kt#uh7d8r");
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            f2 = -3.4028235E38f;
        }
        if ((i3 & 2) != 0) {
            f3 = 0.0f;
        }
        if ((i3 & 4) != 0) {
            f4 = 0.0f;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1801969826, i2, -1, "androidx.compose.material3.rememberTopAppBarState (AppBar.kt:1291)");
        }
        Object[] objArr = new Object[0];
        Saver<TopAppBarState, ?> saver = TopAppBarState.Companion.getSaver();
        ComposerKt.sourceInformationMarkerStart(composer, 1949255933, "CC(remember):AppBar.kt#9igjgp");
        int i4 = (-1) - (((-1) - ((-1) - (((-1) - (((((14 & i2) ^ 6) <= 4 || !composer.changed(f2)) && (6 & i2) != 4) ? 0 : 1)) & ((-1) - ((((((-1) - (((-1) - i2) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION))) ^ 48) <= 32 || !composer.changed(f3)) && (48 & i2) != 32) ? 0 : 1))))) & ((-1) - ((((((-1) - (((-1) - i2) | ((-1) - 896))) ^ BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) > 256 && composer.changed(f4)) || (i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 256) ? 1 : 0)));
        Object objRememberedValue = composer.rememberedValue();
        if (i4 != 0 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = (Function0) new Function0<TopAppBarState>() { // from class: androidx.compose.material3.AppBarKt$rememberTopAppBarState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final TopAppBarState invoke() {
                    return new TopAppBarState(f2, f3, f4);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        TopAppBarState topAppBarState = (TopAppBarState) RememberSaveableKt.m3764rememberSaveable(objArr, (Saver) saver, (String) null, (Function0) objRememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return topAppBarState;
    }

    public static final BottomAppBarState rememberBottomAppBarState(final float f2, final float f3, final float f4, Composer composer, int i2, int i3) {
        ComposerKt.sourceInformationMarkerStart(composer, 1420874240, "C(rememberBottomAppBarState)P(2,1)1611@75546L102,1611@75496L152:AppBar.kt#uh7d8r");
        if ((1 & i3) != 0) {
            f2 = -3.4028235E38f;
        }
        if ((2 & i3) != 0) {
            f3 = 0.0f;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            f4 = 0.0f;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1420874240, i2, -1, "androidx.compose.material3.rememberBottomAppBarState (AppBar.kt:1610)");
        }
        Object[] objArr = new Object[0];
        Saver<BottomAppBarState, ?> saver = BottomAppBarState.Companion.getSaver();
        ComposerKt.sourceInformationMarkerStart(composer, -1399214710, "CC(remember):AppBar.kt#9igjgp");
        int i4 = (-1) - (((-1) - ((-1) - (((-1) - ((((((-1) - (((-1) - i2) | ((-1) - 14))) ^ 6) <= 4 || !composer.changed(f2)) && (-1) - (((-1) - i2) | ((-1) - 6)) != 4) ? 0 : 1)) & ((-1) - (((((112 & i2) ^ 48) <= 32 || !composer.changed(f3)) && (48 & i2) != 32) ? 0 : 1))))) & ((-1) - (((((896 & i2) ^ BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) > 256 && composer.changed(f4)) || (i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 256) ? 1 : 0)));
        Object objRememberedValue = composer.rememberedValue();
        if (i4 != 0 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = (Function0) new Function0<BottomAppBarState>() { // from class: androidx.compose.material3.AppBarKt$rememberBottomAppBarState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final BottomAppBarState invoke() {
                    return AppBarKt.BottomAppBarState(f2, f3, f4);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        BottomAppBarState bottomAppBarState = (BottomAppBarState) RememberSaveableKt.m3764rememberSaveable(objArr, (Saver) saver, (String) null, (Function0) objRememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return bottomAppBarState;
    }

    public static final BottomAppBarState BottomAppBarState(float f2, float f3, float f4) {
        return new BottomAppBarStateImpl(f2, f3, f4);
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object settleAppBarBottom(androidx.compose.material3.BottomAppBarState r23, float r24, androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> r25, androidx.compose.animation.core.AnimationSpec<java.lang.Float> r26, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> r27) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.settleAppBarBottom(androidx.compose.material3.BottomAppBarState, float, androidx.compose.animation.core.DecayAnimationSpec, androidx.compose.animation.core.AnimationSpec, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: androidx.compose.material3.AppBarKt$settleAppBarBottom$2 */
    /* JADX INFO: compiled from: AppBar.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d̉=!,i\bDZc|\u0004O\u000b8\u000bDB\u0007Ӭ:ߚ\u0010\u0007\u0015ia<TgX.\u0001T:\u0011{{b&\n$8KтY\u001a\u0004%"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\"\u001c\u001fsa\u000f", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkFRB\u0002", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C06022 extends Lambda implements Function1<AnimationScope<Float, AnimationVector1D>, Unit> {
        final /* synthetic */ Ref.FloatRef $remainingVelocity;
        final /* synthetic */ BottomAppBarState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06022(BottomAppBarState bottomAppBarState, Ref.FloatRef floatRef) {
            super(1);
            bottomAppBarState = bottomAppBarState;
            floatRef = floatRef;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
            invoke2(animationScope);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(AnimationScope<Float, AnimationVector1D> animationScope) {
            float fFloatValue = animationScope.getValue().floatValue() - floatRef.element;
            float heightOffset = bottomAppBarState.getHeightOffset();
            bottomAppBarState.setHeightOffset(heightOffset + fFloatValue);
            float fAbs = Math.abs(heightOffset - bottomAppBarState.getHeightOffset());
            floatRef.element = animationScope.getValue().floatValue();
            floatRef.element = animationScope.getVelocity().floatValue();
            if (Math.abs(fFloatValue - fAbs) > 0.5f) {
                animationScope.cancelAnimation();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.AppBarKt$settleAppBarBottom$3 */
    /* JADX INFO: compiled from: AppBar.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d̉=!,i\bDZc|\u0004O\u000b8\u000bDB\u0007Ӭ:ߚ\u0010\u0007\u0015ia<TgX.\u0001T:\u0011{{b&\n$8KтY\u001a\u0004%"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\"\u001c\u001fsa\u000f", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkFRB\u0002", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C06033 extends Lambda implements Function1<AnimationScope<Float, AnimationVector1D>, Unit> {
        C06033() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
            invoke2(animationScope);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(AnimationScope<Float, AnimationVector1D> animationScope) {
            bottomAppBarState.setHeightOffset(animationScope.getValue().floatValue());
        }
    }

    public static final float getBottomAppBarVerticalPadding() {
        return BottomAppBarVerticalPadding;
    }

    /* JADX INFO: renamed from: SingleRowTopAppBar-cJHQLPU */
    public static final void m1789SingleRowTopAppBarcJHQLPU(Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, final TextStyle textStyle, final boolean z2, final Function2<? super Composer, ? super Integer, Unit> function22, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, final float f2, final WindowInsets windowInsets, final TopAppBarColors topAppBarColors, final TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier.Companion companionDraggable$default;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-342194911);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SingleRowTopAppBar)P(4,7,8,1,5!1,3:c#ui.unit.Dp,9)*1865@85622L7,1866@85690L284,1866@85679L295,1879@86382L321,1887@86744L178,1894@87005L197,1926@88369L1014,1926@88285L1098:AppBar.kt#uh7d8r");
        int i5 = (i3 + 1) - (i3 | 1);
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 + 6) - (i2 | 6) == 0) {
            i4 = (composerStartRestartGroup.changed(companion) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 = (i4 + 48) - (i4 & 48);
        } else if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i3 + 4) - (i3 | 4) != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            int i6 = composerStartRestartGroup.changed(textStyle) ? 256 : 128;
            i4 = (i4 + i6) - (i4 & i6);
        }
        if ((i3 & 8) != 0) {
            i4 = (i4 + 3072) - (i4 & 3072);
        } else if ((i2 & 3072) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(z2) ? 2048 : 1024)));
        }
        if ((i3 + 16) - (i3 | 16) != 0) {
            i4 |= 24576;
        } else if ((i2 + 24576) - (i2 | 24576) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function22) ? 16384 : 8192)));
        }
        if ((i3 & 32) != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE));
        } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function3) ? 131072 : 65536)));
        }
        if ((-1) - (((-1) - i3) | ((-1) - 64)) != 0) {
            i4 = (i4 + 1572864) - (i4 & 1572864);
        } else if ((i2 + 1572864) - (i2 | 1572864) == 0) {
            int i7 = composerStartRestartGroup.changed(f2) ? 1048576 : 524288;
            i4 = (i4 + i7) - (i4 & i7);
        }
        if ((i3 & 128) != 0) {
            i4 |= 12582912;
        } else if ((i2 + 12582912) - (i2 | 12582912) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(windowInsets) ? 8388608 : 4194304)));
        }
        if ((-1) - (((-1) - i3) | ((-1) - 256)) != 0) {
            i4 |= 100663296;
        } else if ((i2 & 100663296) == 0) {
            int i8 = composerStartRestartGroup.changed(topAppBarColors) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
            i4 = (i4 + i8) - (i4 & i8);
        }
        if ((i3 & 512) != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 805306368));
        } else if ((-1) - (((-1) - i2) | ((-1) - 805306368)) == 0) {
            int i9 = composerStartRestartGroup.changed(topAppBarScrollBehavior) ? 536870912 : 268435456;
            i4 = (i4 + i9) - (i4 & i9);
        }
        if ((-1) - (((-1) - 306783379) | ((-1) - i4)) != 306783378 || !composerStartRestartGroup.getSkipping()) {
            if (i5 != 0) {
                companion = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-342194911, i4, -1, "androidx.compose.material3.SingleRowTopAppBar (AppBar.kt:1861)");
            }
            if (!Float.isNaN(f2)) {
                if (!(f2 == Float.POSITIVE_INFINITY)) {
                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object objConsume = composerStartRestartGroup.consume(localDensity);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    final float fCoerceAtLeast = RangesKt.coerceAtLeast(((Density) objConsume).mo710toPx0680j_4(f2), 0.0f);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1193658092, "CC(remember):AppBar.kt#9igjgp");
                    int i10 = (-1) - (((-1) - i4) | ((-1) - 1879048192));
                    int i11 = (-1) - (((-1) - (i10 == 536870912 ? 1 : 0)) & ((-1) - (composerStartRestartGroup.changed(fCoerceAtLeast) ? 1 : 0)));
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (i11 != 0 || objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                TopAppBarState state;
                                TopAppBarScrollBehavior topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                                if (Intrinsics.areEqual((topAppBarScrollBehavior2 == null || (state = topAppBarScrollBehavior2.getState()) == null) ? null : Float.valueOf(state.getHeightOffsetLimit()), -fCoerceAtLeast)) {
                                    return;
                                }
                                TopAppBarScrollBehavior topAppBarScrollBehavior3 = topAppBarScrollBehavior;
                                TopAppBarState state2 = topAppBarScrollBehavior3 != null ? topAppBarScrollBehavior3.getState() : null;
                                if (state2 == null) {
                                    return;
                                }
                                state2.setHeightOffsetLimit(-fCoerceAtLeast);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    EffectsKt.SideEffect((Function0) objRememberedValue, composerStartRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1193635911, "CC(remember):AppBar.kt#9igjgp");
                    boolean z3 = i10 == 536870912;
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (z3 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0<Float>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$colorTransitionFraction$2$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Float invoke() {
                                TopAppBarState state;
                                TopAppBarScrollBehavior topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                                return Float.valueOf(((topAppBarScrollBehavior2 == null || (state = topAppBarScrollBehavior2.getState()) == null) ? 0.0f : state.getOverlappedFraction()) > 0.01f ? 1.0f : 0.0f);
                            }
                        });
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    State<Color> stateM451animateColorAsStateeuL9pac = SingleValueAnimationKt.m451animateColorAsStateeuL9pac(topAppBarColors.m2867containerColorvNxB06k$material3_release(SingleRowTopAppBar_cJHQLPU$lambda$9((State) objRememberedValue2)), AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null), null, null, composerStartRestartGroup, 48, 12);
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1370231018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$actionsRow$1
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
                            ComposerKt.sourceInformation(composer2, "C1895@87019L173:AppBar.kt#uh7d8r");
                            if ((-1) - (((-1) - i12) | ((-1) - 3)) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1370231018, i12, -1, "androidx.compose.material3.SingleRowTopAppBar.<anonymous> (AppBar.kt:1895)");
                                }
                                Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                                Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                                Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                                ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                                Modifier.Companion companion2 = Modifier.Companion;
                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(end, centerVertically, composer2, 54);
                                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, companion2);
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
                    }, composerStartRestartGroup, 54);
                    composerStartRestartGroup.startReplaceGroup(-1193605157);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "1908@87542L55,1908@87519L78,1909@87631L283");
                    if (topAppBarScrollBehavior == null || topAppBarScrollBehavior.isPinned()) {
                        companionDraggable$default = Modifier.Companion;
                    } else {
                        Modifier.Companion companion2 = Modifier.Companion;
                        Orientation orientation = Orientation.Vertical;
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1193599057, "CC(remember):AppBar.kt#9igjgp");
                        boolean z4 = i10 == 536870912;
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (z4 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                            objRememberedValue3 = (Function1) new Function1<Float, Unit>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$appBarDragModifier$1$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Float f3) {
                                    invoke(f3.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(float f3) {
                                    TopAppBarState state = topAppBarScrollBehavior.getState();
                                    state.setHeightOffset(state.getHeightOffset() + f3);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        DraggableState draggableStateRememberDraggableState = DraggableKt.rememberDraggableState((Function1) objRememberedValue3, composerStartRestartGroup, 0);
                        Modifier.Companion companion3 = companion2;
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1193595981, "CC(remember):AppBar.kt#9igjgp");
                        boolean z5 = i10 == 536870912;
                        AppBarKt$SingleRowTopAppBar$appBarDragModifier$2$1 appBarKt$SingleRowTopAppBar$appBarDragModifier$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
                        if (z5 || appBarKt$SingleRowTopAppBar$appBarDragModifier$2$1RememberedValue == Composer.Companion.getEmpty()) {
                            appBarKt$SingleRowTopAppBar$appBarDragModifier$2$1RememberedValue = new AppBarKt$SingleRowTopAppBar$appBarDragModifier$2$1(topAppBarScrollBehavior, null);
                            composerStartRestartGroup.updateRememberedValue(appBarKt$SingleRowTopAppBar$appBarDragModifier$2$1RememberedValue);
                        }
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        companionDraggable$default = DraggableKt.draggable$default(companion3, draggableStateRememberDraggableState, orientation, false, null, false, null, (Function3) appBarKt$SingleRowTopAppBar$appBarDragModifier$2$1RememberedValue, false, 188, null);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    SurfaceKt.m2561SurfaceT9BRK9s(companion.then(companionDraggable$default), null, SingleRowTopAppBar_cJHQLPU$lambda$10(stateM451animateColorAsStateeuL9pac), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1943739546, true, new AppBarKt$SingleRowTopAppBar$3(windowInsets, f2, topAppBarScrollBehavior, topAppBarColors, function2, textStyle, z2, function22, composableLambdaRememberComposableLambda), composerStartRestartGroup, 54), composerStartRestartGroup, 12582912, 122);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }
            throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite".toString());
        }
        composerStartRestartGroup.skipToGroupEnd();
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$4
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
                    AppBarKt.m1789SingleRowTopAppBarcJHQLPU(modifier2, function2, textStyle, z2, function22, function3, f2, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i2) & ((-1) - 1))), i3);
                }
            });
        }
    }

    /* JADX INFO: renamed from: TwoRowsTopAppBar-nS6u9G4 */
    public static final void m1792TwoRowsTopAppBarnS6u9G4(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, TextStyle textStyle, final float f2, final Function2<? super Composer, ? super Integer, Unit> function22, final TextStyle textStyle2, final Function2<? super Composer, ? super Integer, Unit> function23, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, final float f3, final float f4, WindowInsets windowInsets, final TopAppBarColors topAppBarColors, final TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        Modifier.Companion companionDraggable$default;
        TopAppBarState state;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(1169193376);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TwoRowsTopAppBar)P(4,9,11,10:c#ui.unit.Dp,7,8,5!1,1:c#ui.unit.Dp,3:c#ui.unit.Dp,12)*1984@90586L7,1992@90915L205,1992@90904L216,2008@91751L197,2042@93233L2309,2042@93149L2393:AppBar.kt#uh7d8r");
        int i7 = (i4 + 1) - (i4 | 1);
        if (i7 != 0) {
            i5 = (i2 + 6) - (i2 & 6);
        } else if ((i2 + 6) - (i2 | 6) == 0) {
            i5 = (-1) - (((-1) - (composerStartRestartGroup.changed(companion) ? 4 : 2)) & ((-1) - i2));
        } else {
            i5 = i2;
        }
        Function2<? super Composer, ? super Integer, Unit> function24 = function2;
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            int i8 = composerStartRestartGroup.changedInstance(function24) ? 32 : 16;
            i5 = (i5 + i8) - (i5 & i8);
        }
        TextStyle textStyle3 = textStyle;
        if ((i4 & 4) != 0) {
            i5 = (i5 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i5 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i5 |= composerStartRestartGroup.changed(textStyle3) ? 256 : 128;
        }
        if ((i4 & 8) != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 3072));
        } else if ((i2 & 3072) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(f2) ? 2048 : 1024)));
        }
        if ((i4 & 16) != 0) {
            i5 = (i5 + 24576) - (i5 & 24576);
        } else if ((-1) - (((-1) - i2) | ((-1) - 24576)) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function22) ? 16384 : 8192;
        }
        if ((i4 + 32) - (i4 | 32) != 0) {
            i5 = (i5 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i5 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i5 |= composerStartRestartGroup.changed(textStyle2) ? 131072 : 65536;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 64)) != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 1572864));
        } else if ((i2 & 1572864) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changedInstance(function23) ? 1048576 : 524288)));
        }
        if ((-1) - (((-1) - i4) | ((-1) - 128)) != 0) {
            i5 |= 12582912;
        } else if ((i2 + 12582912) - (i2 | 12582912) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function3) ? 8388608 : 4194304;
        }
        if ((i4 & 256) != 0) {
            i5 = (i5 + 100663296) - (i5 & 100663296);
        } else if ((i2 & 100663296) == 0) {
            i5 |= composerStartRestartGroup.changed(f3) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i4 & 512) != 0) {
            i5 |= 805306368;
        } else if ((-1) - (((-1) - i2) | ((-1) - 805306368)) == 0) {
            int i9 = composerStartRestartGroup.changed(f4) ? 536870912 : 268435456;
            i5 = (i5 + i9) - (i5 & i9);
        }
        WindowInsets windowInsets2 = windowInsets;
        if ((-1) - (((-1) - i4) | ((-1) - 1024)) != 0) {
            i6 = (-1) - (((-1) - i3) & ((-1) - 6));
        } else if ((i3 & 6) == 0) {
            i6 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changed(windowInsets2) ? 4 : 2)));
        } else {
            i6 = i3;
        }
        if ((i4 + 2048) - (i4 | 2048) != 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - 48));
        } else if ((i3 & 48) == 0) {
            int i10 = composerStartRestartGroup.changed(topAppBarColors) ? 32 : 16;
            i6 = (i6 + i10) - (i6 & i10);
        }
        if ((i4 & 4096) != 0) {
            i6 = (i6 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i6 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((i3 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i3 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            int i11 = composerStartRestartGroup.changed(topAppBarScrollBehavior) ? 256 : 128;
            i6 = (i6 + i11) - (i6 & i11);
        }
        if ((-1) - (((-1) - 306783379) | ((-1) - i5)) != 306783378 || (i6 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i7 != 0) {
                companion = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1169193376, i5, i6, "androidx.compose.material3.TwoRowsTopAppBar (AppBar.kt:1971)");
            }
            if (!Float.isNaN(f3)) {
                if (!(f3 == Float.POSITIVE_INFINITY)) {
                    if (!Float.isNaN(f4)) {
                        if (!(f4 == Float.POSITIVE_INFINITY)) {
                            if (Dp.m6637compareTo0680j_4(f4, f3) < 0) {
                                throw new IllegalArgumentException("The expandedHeight is expected to be greater or equal to the collapsedHeight".toString());
                            }
                            final Ref.FloatRef floatRef = new Ref.FloatRef();
                            final Ref.FloatRef floatRef2 = new Ref.FloatRef();
                            Ref.IntRef intRef = new Ref.IntRef();
                            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object objConsume = composerStartRestartGroup.consume(localDensity);
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            Density density = (Density) objConsume;
                            floatRef.element = density.mo710toPx0680j_4(f4);
                            floatRef2.element = density.mo710toPx0680j_4(f3);
                            intRef.element = density.mo704roundToPx0680j_4(f2);
                            Unit unit = Unit.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1641215730, "CC(remember):AppBar.kt#9igjgp");
                            int i12 = (i6 + 896) - (i6 | 896);
                            int i13 = (-1) - (((-1) - ((-1) - (((-1) - (i12 == 256 ? 1 : 0)) & ((-1) - (composerStartRestartGroup.changed(floatRef2.element) ? 1 : 0))))) & ((-1) - (composerStartRestartGroup.changed(floatRef.element) ? 1 : 0)));
                            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (i13 != 0 || objRememberedValue == Composer.Companion.getEmpty()) {
                                objRememberedValue = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$5$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        TopAppBarState state2;
                                        TopAppBarScrollBehavior topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                                        if (Intrinsics.areEqual((topAppBarScrollBehavior2 == null || (state2 = topAppBarScrollBehavior2.getState()) == null) ? null : Float.valueOf(state2.getHeightOffsetLimit()), floatRef2.element - floatRef.element)) {
                                            return;
                                        }
                                        TopAppBarScrollBehavior topAppBarScrollBehavior3 = topAppBarScrollBehavior;
                                        TopAppBarState state3 = topAppBarScrollBehavior3 != null ? topAppBarScrollBehavior3.getState() : null;
                                        if (state3 == null) {
                                            return;
                                        }
                                        state3.setHeightOffsetLimit(floatRef2.element - floatRef.element);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            EffectsKt.SideEffect((Function0) objRememberedValue, composerStartRestartGroup, 0);
                            float collapsedFraction = (topAppBarScrollBehavior == null || (state = topAppBarScrollBehavior.getState()) == null) ? 0.0f : state.getCollapsedFraction();
                            long jM2867containerColorvNxB06k$material3_release = topAppBarColors.m2867containerColorvNxB06k$material3_release(collapsedFraction);
                            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-89435287, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$actionsRow$1
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

                                public final void invoke(Composer composer2, int i14) {
                                    ComposerKt.sourceInformation(composer2, "C2009@91765L173:AppBar.kt#uh7d8r");
                                    if ((i14 + 3) - (3 | i14) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-89435287, i14, -1, "androidx.compose.material3.TwoRowsTopAppBar.<anonymous> (AppBar.kt:2009)");
                                        }
                                        Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                                        Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                                        Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                                        ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                                        Modifier.Companion companion2 = Modifier.Companion;
                                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(end, centerVertically, composer2, 54);
                                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, companion2);
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
                            }, composerStartRestartGroup, 54);
                            float fTransform = TopTitleAlphaEasing.transform(collapsedFraction);
                            float f5 = 1.0f - collapsedFraction;
                            boolean z2 = collapsedFraction < 0.5f;
                            boolean z3 = !z2;
                            composerStartRestartGroup.startReplaceGroup(1641266888);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "2028@92709L55,2028@92686L78,2029@92798L283");
                            if (topAppBarScrollBehavior == null || topAppBarScrollBehavior.isPinned()) {
                                companionDraggable$default = Modifier.Companion;
                            } else {
                                Modifier.Companion companion2 = Modifier.Companion;
                                Orientation orientation = Orientation.Vertical;
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1641272988, "CC(remember):AppBar.kt#9igjgp");
                                boolean z4 = i12 == 256;
                                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (z4 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                                    objRememberedValue2 = (Function1) new Function1<Float, Unit>() { // from class: androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$appBarDragModifier$1$1
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(Float f6) {
                                            invoke(f6.floatValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(float f6) {
                                            TopAppBarState state2 = topAppBarScrollBehavior.getState();
                                            state2.setHeightOffset(state2.getHeightOffset() + f6);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                DraggableState draggableStateRememberDraggableState = DraggableKt.rememberDraggableState((Function1) objRememberedValue2, composerStartRestartGroup, 0);
                                Modifier.Companion companion3 = companion2;
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1641276064, "CC(remember):AppBar.kt#9igjgp");
                                boolean z5 = i12 == 256;
                                AppBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1 appBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
                                if (z5 || appBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1RememberedValue == Composer.Companion.getEmpty()) {
                                    appBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1RememberedValue = new AppBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1(topAppBarScrollBehavior, null);
                                    composerStartRestartGroup.updateRememberedValue(appBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1RememberedValue);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                companionDraggable$default = DraggableKt.draggable$default(companion3, draggableStateRememberDraggableState, orientation, false, null, false, null, (Function3) appBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1RememberedValue, false, 188, null);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            function24 = function24;
                            textStyle3 = textStyle3;
                            windowInsets2 = windowInsets2;
                            SurfaceKt.m2561SurfaceT9BRK9s(companion.then(companionDraggable$default), null, jM2867containerColorvNxB06k$material3_release, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1350062619, true, new AppBarKt$TwoRowsTopAppBar$6(windowInsets2, f3, topAppBarColors, function22, textStyle2, fTransform, z2, function23, composableLambdaRememberComposableLambda, f4, topAppBarScrollBehavior, function24, textStyle3, f5, intRef, z3), composerStartRestartGroup, 54), composerStartRestartGroup, 12582912, 122);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }
                    throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite".toString());
                }
            }
            throw new IllegalArgumentException("The collapsedHeight is expected to be specified and finite".toString());
        }
        composerStartRestartGroup.skipToGroupEnd();
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            final Function2<? super Composer, ? super Integer, Unit> function25 = function24;
            final TextStyle textStyle4 = textStyle3;
            final WindowInsets windowInsets3 = windowInsets2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$7
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

                public final void invoke(Composer composer2, int i14) {
                    AppBarKt.m1792TwoRowsTopAppBarnS6u9G4(modifier2, function25, textStyle4, f2, function22, textStyle2, function23, function3, f3, f4, windowInsets3, topAppBarColors, topAppBarScrollBehavior, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i2) & ((-1) - 1))), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                }
            });
        }
    }

    /* JADX INFO: renamed from: TopAppBarLayout-kXwM9vE */
    public static final void m1791TopAppBarLayoutkXwM9vE(final Modifier modifier, final ScrolledOffset scrolledOffset, final long j2, final long j3, final long j4, final Function2<? super Composer, ? super Integer, Unit> function2, final TextStyle textStyle, final float f2, final Arrangement.Vertical vertical, final Arrangement.Horizontal horizontal, final int i2, final boolean z2, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, Composer composer, final int i3, final int i4) {
        int i5;
        int i6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-742442296);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TopAppBarLayout)P(3,6,5:c#ui.graphics.Color,10:c#ui.graphics.Color,0:c#ui.graphics.Color,7,12,8,13,11,9,2,4)2163@98873L5882,2135@97725L7030:AppBar.kt#uh7d8r");
        if ((-1) - (((-1) - i3) | ((-1) - 6)) == 0) {
            i5 = (-1) - (((-1) - (composerStartRestartGroup.changed(modifier) ? 4 : 2)) & ((-1) - i3));
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            int i7 = (-1) - (((-1) - i3) | ((-1) - 64)) == 0 ? composerStartRestartGroup.changed(scrolledOffset) : composerStartRestartGroup.changedInstance(scrolledOffset) ? 32 : 16;
            i5 = (i5 + i7) - (i5 & i7);
        }
        if ((i3 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i3 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            int i8 = composerStartRestartGroup.changed(j2) ? 256 : 128;
            i5 = (i5 + i8) - (i5 & i8);
        }
        if ((-1) - (((-1) - i3) | ((-1) - 3072)) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            int i9 = composerStartRestartGroup.changed(j3) ? 2048 : 1024;
            i5 = (i5 + i9) - (i5 & i9);
        }
        if ((i3 & 24576) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(j4) ? 16384 : 8192)));
        }
        if ((-1) - (((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) | ((-1) - i3)) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            i5 |= composerStartRestartGroup.changedInstance(function2) ? 131072 : 65536;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 1572864)) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            int i10 = composerStartRestartGroup.changed(textStyle) ? 1048576 : 524288;
            i5 = (i5 + i10) - (i5 & i10);
        }
        if ((i3 & 12582912) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(f2) ? 8388608 : 4194304)));
        }
        if ((i3 & 100663296) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            i5 |= composerStartRestartGroup.changed(vertical) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i3 + 805306368) - (i3 | 805306368) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(horizontal) ? 536870912 : 268435456)));
        }
        if ((i4 + 6) - (i4 | 6) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            int i11 = composerStartRestartGroup.changed(i2) ? 4 : 2;
            i6 = (i4 + i11) - (i4 & i11);
        } else {
            i6 = i4;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 48)) == 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - (composerStartRestartGroup.changed(z2) ? 32 : 16)));
        }
        if ((i4 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i4 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(function22) ? 256 : 128;
        }
        if ((i4 + 3072) - (i4 | 3072) == 0) {
            int i12 = composerStartRestartGroup.changedInstance(function23) ? 2048 : 1024;
            i6 = (i6 + i12) - (i6 & i12);
        }
        if ((306783379 & i5) == 306783378 && (-1) - (((-1) - i6) | ((-1) - 1171)) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-742442296, i5, i6, "androidx.compose.material3.TopAppBarLayout (AppBar.kt:2134)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1539011656, "CC(remember):AppBar.kt#9igjgp");
            int i13 = ((i5 & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) == 32 || ((-1) - (((-1) - i5) | ((-1) - 64)) != 0 && composerStartRestartGroup.changedInstance(scrolledOffset))) ? 1 : 0;
            int i14 = (1879048192 & i5) == 536870912 ? 1 : 0;
            int i15 = (-1) - (((-1) - (((i13 + i14) - (i13 & i14)) | ((234881024 & i5) == 67108864 ? 1 : 0))) & ((-1) - ((i6 + 14) - (14 | i6) == 4 ? 1 : 0)));
            MeasurePolicy measurePolicyRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i15 != 0 || measurePolicyRememberedValue == Composer.Companion.getEmpty()) {
                measurePolicyRememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.AppBarKt$TopAppBarLayout$2$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* JADX INFO: renamed from: measure-3p2s80s */
                    public final MeasureResult mo375measure3p2s80s(final MeasureScope measureScope, List<? extends Measurable> list, final long j5) {
                        int iCoerceAtLeast;
                        final int iM6590getMaxHeightimpl;
                        int size = list.size();
                        for (int i16 = 0; i16 < size; i16++) {
                            Measurable measurable = list.get(i16);
                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "navigationIcon")) {
                                final Placeable placeableMo5514measureBRTryo0 = measurable.mo5514measureBRTryo0(Constraints.m6582copyZbe2FdA$default(j5, 0, 0, 0, 0, 14, null));
                                int size2 = list.size();
                                for (int i17 = 0; i17 < size2; i17++) {
                                    Measurable measurable2 = list.get(i17);
                                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "actionIcons")) {
                                        final Placeable placeableMo5514measureBRTryo02 = measurable2.mo5514measureBRTryo0(Constraints.m6582copyZbe2FdA$default(j5, 0, 0, 0, 0, 14, null));
                                        if (Constraints.m6591getMaxWidthimpl(j5) == Integer.MAX_VALUE) {
                                            iCoerceAtLeast = Constraints.m6591getMaxWidthimpl(j5);
                                        } else {
                                            iCoerceAtLeast = RangesKt.coerceAtLeast((Constraints.m6591getMaxWidthimpl(j5) - placeableMo5514measureBRTryo0.getWidth()) - placeableMo5514measureBRTryo02.getWidth(), 0);
                                        }
                                        int size3 = list.size();
                                        for (int i18 = 0; i18 < size3; i18++) {
                                            Measurable measurable3 = list.get(i18);
                                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable3), "title")) {
                                                final Placeable placeableMo5514measureBRTryo03 = measurable3.mo5514measureBRTryo0(Constraints.m6582copyZbe2FdA$default(j5, 0, iCoerceAtLeast, 0, 0, 12, null));
                                                final int i19 = placeableMo5514measureBRTryo03.get(AlignmentLineKt.getLastBaseline()) != Integer.MIN_VALUE ? placeableMo5514measureBRTryo03.get(AlignmentLineKt.getLastBaseline()) : 0;
                                                float fOffset = scrolledOffset.offset();
                                                int iRoundToInt = Float.isNaN(fOffset) ? 0 : MathKt.roundToInt(fOffset);
                                                if (Constraints.m6590getMaxHeightimpl(j5) == Integer.MAX_VALUE) {
                                                    iM6590getMaxHeightimpl = Constraints.m6590getMaxHeightimpl(j5);
                                                } else {
                                                    iM6590getMaxHeightimpl = Constraints.m6590getMaxHeightimpl(j5) + iRoundToInt;
                                                }
                                                int iM6591getMaxWidthimpl = Constraints.m6591getMaxWidthimpl(j5);
                                                final Arrangement.Horizontal horizontal2 = horizontal;
                                                final Arrangement.Vertical vertical2 = vertical;
                                                final int i20 = i2;
                                                return MeasureScope.layout$default(measureScope, iM6591getMaxWidthimpl, iM6590getMaxHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.AppBarKt$TopAppBarLayout$2$1.1
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
                                                        int iMax;
                                                        int height;
                                                        int iM6591getMaxWidthimpl2;
                                                        Placeable placeable = placeableMo5514measureBRTryo0;
                                                        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, (iM6590getMaxHeightimpl - placeable.getHeight()) / 2, 0.0f, 4, null);
                                                        Placeable placeable2 = placeableMo5514measureBRTryo03;
                                                        Arrangement.Horizontal horizontal3 = horizontal2;
                                                        if (Intrinsics.areEqual(horizontal3, Arrangement.INSTANCE.getCenter())) {
                                                            iMax = (Constraints.m6591getMaxWidthimpl(j5) - placeableMo5514measureBRTryo03.getWidth()) / 2;
                                                            if (iMax < placeableMo5514measureBRTryo0.getWidth()) {
                                                                iM6591getMaxWidthimpl2 = placeableMo5514measureBRTryo0.getWidth() - iMax;
                                                            } else if (placeableMo5514measureBRTryo03.getWidth() + iMax > Constraints.m6591getMaxWidthimpl(j5) - placeableMo5514measureBRTryo02.getWidth()) {
                                                                iM6591getMaxWidthimpl2 = (Constraints.m6591getMaxWidthimpl(j5) - placeableMo5514measureBRTryo02.getWidth()) - (placeableMo5514measureBRTryo03.getWidth() + iMax);
                                                            }
                                                            iMax += iM6591getMaxWidthimpl2;
                                                        } else if (!Intrinsics.areEqual(horizontal3, Arrangement.INSTANCE.getEnd())) {
                                                            iMax = Math.max(measureScope.mo704roundToPx0680j_4(AppBarKt.TopAppBarTitleInset), placeableMo5514measureBRTryo0.getWidth());
                                                        } else {
                                                            iMax = (Constraints.m6591getMaxWidthimpl(j5) - placeableMo5514measureBRTryo03.getWidth()) - placeableMo5514measureBRTryo02.getWidth();
                                                        }
                                                        Arrangement.Vertical vertical3 = vertical2;
                                                        if (Intrinsics.areEqual(vertical3, Arrangement.INSTANCE.getCenter())) {
                                                            height = (iM6590getMaxHeightimpl - placeableMo5514measureBRTryo03.getHeight()) / 2;
                                                        } else if (Intrinsics.areEqual(vertical3, Arrangement.INSTANCE.getBottom())) {
                                                            int i21 = i20;
                                                            if (i21 == 0) {
                                                                height = iM6590getMaxHeightimpl - placeableMo5514measureBRTryo03.getHeight();
                                                            } else {
                                                                int height2 = i21 - (placeableMo5514measureBRTryo03.getHeight() - i19);
                                                                int height3 = placeableMo5514measureBRTryo03.getHeight() + height2;
                                                                if (height3 > Constraints.m6590getMaxHeightimpl(j5)) {
                                                                    height2 -= height3 - Constraints.m6590getMaxHeightimpl(j5);
                                                                }
                                                                height = (iM6590getMaxHeightimpl - placeableMo5514measureBRTryo03.getHeight()) - Math.max(0, height2);
                                                            }
                                                        } else {
                                                            height = 0;
                                                        }
                                                        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, iMax, height, 0.0f, 4, null);
                                                        Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo5514measureBRTryo02, Constraints.m6591getMaxWidthimpl(j5) - placeableMo5514measureBRTryo02.getWidth(), (iM6590getMaxHeightimpl - placeableMo5514measureBRTryo02.getHeight()) / 2, 0.0f, 4, null);
                                                    }
                                                }, 4, null);
                                            }
                                        }
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                composerStartRestartGroup.updateRememberedValue(measurePolicyRememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) measurePolicyRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
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
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 9049318, "C2137@97755L280,2143@98048L502,2155@98563L264:AppBar.kt#uh7d8r");
            Modifier modifierLayoutId = LayoutIdKt.layoutId(Modifier.Companion, "navigationIcon");
            float f3 = TopAppBarHorizontalPadding;
            Modifier modifierM1022paddingqDBjuR0$default = PaddingKt.m1022paddingqDBjuR0$default(modifierLayoutId, f3, 0.0f, 0.0f, 0.0f, 14, null);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1022paddingqDBjuR0$default);
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
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 249765716, "C2138@97858L163:AppBar.kt#uh7d8r");
            ProvidedValue<Color> providedValueProvides = ContentColorKt.getLocalContentColor().provides(Color.m4168boximpl(j2));
            int i16 = ProvidedValue.$stable;
            int i17 = i6 >> 3;
            int i18 = (i17 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i17 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION);
            CompositionLocalKt.CompositionLocalProvider(providedValueProvides, function22, composerStartRestartGroup, (i16 + i18) - (i16 & i18));
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Modifier modifierM1020paddingVpY3zN4$default = PaddingKt.m1020paddingVpY3zN4$default(LayoutIdKt.layoutId(Modifier.Companion, "title"), f3, 0.0f, 2, null);
            Modifier.Companion companionClearAndSetSemantics = Modifier.Companion;
            if (z2) {
                companionClearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(companionClearAndSetSemantics, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.AppBarKt$TopAppBarLayout$1$2
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }
                });
            }
            Modifier modifierM4339graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m4339graphicsLayerAp8cVGQ$default(modifierM1020paddingVpY3zN4$default.then(companionClearAndSetSemantics), 0.0f, 0.0f, f2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131067, null);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM4339graphicsLayerAp8cVGQ$default);
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
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 250255454, "C2149@98351L185:AppBar.kt#uh7d8r");
            int i19 = i5 >> 9;
            int i20 = i5 >> 15;
            ProvideContentColorTextStyleKt.m2921ProvideContentColorTextStyle3JVO9M(j3, textStyle, function2, composerStartRestartGroup, ((-1) - (((-1) - ((i20 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i20 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION))) & ((-1) - (i19 & 14)))) | ((-1) - (((-1) - i19) | ((-1) - 896))));
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Modifier modifierM1022paddingqDBjuR0$default2 = PaddingKt.m1022paddingqDBjuR0$default(LayoutIdKt.layoutId(Modifier.Companion, "actionIcons"), 0.0f, 0.0f, f3, 0.0f, 11, null);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1022paddingqDBjuR0$default2);
            Function0<ComposeUiNode> constructor4 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor4);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3671constructorimpl4 = Updater.m3671constructorimpl(composerStartRestartGroup);
            Updater.m3678setimpl(composerM3671constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composerM3671constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composerM3671constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m3678setimpl(composerM3671constructorimpl4, modifierMaterializeModifier4, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 250561951, "C2156@98661L152:AppBar.kt#uh7d8r");
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4168boximpl(j4)), function23, composerStartRestartGroup, ((i6 >> 6) & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) | ProvidedValue.$stable);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$TopAppBarLayout$3
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

                public final void invoke(Composer composer2, int i21) {
                    AppBarKt.m1791TopAppBarLayoutkXwM9vE(modifier, scrolledOffset, j2, j3, j4, function2, textStyle, f2, vertical, horizontal, i2, z2, function22, function23, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object settleAppBar(androidx.compose.material3.TopAppBarState r23, float r24, androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> r25, androidx.compose.animation.core.AnimationSpec<java.lang.Float> r26, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> r27) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.settleAppBar(androidx.compose.material3.TopAppBarState, float, androidx.compose.animation.core.DecayAnimationSpec, androidx.compose.animation.core.AnimationSpec, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: androidx.compose.material3.AppBarKt$settleAppBar$2 */
    /* JADX INFO: compiled from: AppBar.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d̉=!,i\bDZc|\u0004O\u000b8\u000bDB\u0007Ӭ:ߚ\u0010\u0007\u0015ia<TgX.\u0001T:\u0011{{b&\n$8KтY\u001a\u0004%"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\"\u001c\u001fsa\u000f", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkFRB\u0002", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C06002 extends Lambda implements Function1<AnimationScope<Float, AnimationVector1D>, Unit> {
        final /* synthetic */ Ref.FloatRef $remainingVelocity;
        final /* synthetic */ TopAppBarState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06002(TopAppBarState topAppBarState, Ref.FloatRef floatRef) {
            super(1);
            topAppBarState = topAppBarState;
            floatRef = floatRef;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
            invoke2(animationScope);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(AnimationScope<Float, AnimationVector1D> animationScope) {
            float fFloatValue = animationScope.getValue().floatValue() - floatRef.element;
            float heightOffset = topAppBarState.getHeightOffset();
            topAppBarState.setHeightOffset(heightOffset + fFloatValue);
            float fAbs = Math.abs(heightOffset - topAppBarState.getHeightOffset());
            floatRef.element = animationScope.getValue().floatValue();
            floatRef.element = animationScope.getVelocity().floatValue();
            if (Math.abs(fFloatValue - fAbs) > 0.5f) {
                animationScope.cancelAnimation();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.AppBarKt$settleAppBar$3 */
    /* JADX INFO: compiled from: AppBar.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d̉=!,i\bDZc|\u0004O\u000b8\u000bDB\u0007Ӭ:ߚ\u0010\u0007\u0015ia<TgX.\u0001T:\u0011{{b&\n$8KтY\u001a\u0004%"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\"\u001c\u001fsa\u000f", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkFRB\u0002", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass3 extends Lambda implements Function1<AnimationScope<Float, AnimationVector1D>, Unit> {
        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
            invoke2(animationScope);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(AnimationScope<Float, AnimationVector1D> animationScope) {
            topAppBarState.setHeightOffset(animationScope.getValue().floatValue());
        }
    }

    public static final CubicBezierEasing getTopTitleAlphaEasing() {
        return TopTitleAlphaEasing;
    }

    private static final float SingleRowTopAppBar_cJHQLPU$lambda$9(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final long SingleRowTopAppBar_cJHQLPU$lambda$10(State<Color> state) {
        return state.getValue().m4188unboximpl();
    }

    static {
        float f2 = 16;
        float f3 = 12;
        float fM6638constructorimpl = Dp.m6638constructorimpl(Dp.m6638constructorimpl(f2) - Dp.m6638constructorimpl(f3));
        BottomAppBarHorizontalPadding = fM6638constructorimpl;
        float fM6638constructorimpl2 = Dp.m6638constructorimpl(Dp.m6638constructorimpl(f2) - Dp.m6638constructorimpl(f3));
        BottomAppBarVerticalPadding = fM6638constructorimpl2;
        FABHorizontalPadding = Dp.m6638constructorimpl(Dp.m6638constructorimpl(f2) - fM6638constructorimpl);
        FABVerticalPadding = Dp.m6638constructorimpl(Dp.m6638constructorimpl(f3) - fM6638constructorimpl2);
        TopTitleAlphaEasing = new CubicBezierEasing(0.8f, 0.0f, 0.8f, 0.15f);
        MediumTitleBottomPadding = Dp.m6638constructorimpl(24);
        LargeTitleBottomPadding = Dp.m6638constructorimpl(28);
        float fM6638constructorimpl3 = Dp.m6638constructorimpl(4);
        TopAppBarHorizontalPadding = fM6638constructorimpl3;
        TopAppBarTitleInset = Dp.m6638constructorimpl(Dp.m6638constructorimpl(f2) - fM6638constructorimpl3);
    }
}
