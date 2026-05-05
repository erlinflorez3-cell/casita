package androidx.compose.material3;

import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.AccessibilityUtilKt;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.SliderTokens;
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
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.dynatrace.android.agent.AdkSettings;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
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
/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яğ\u0014D߬)\u001ew\u0004L܀kt\u001aA\u000e0\u0011.J~8,\u001aw\rmr9>MmHDR[*\u0015n\u000442[,ڎK;k\u001a\u0006̝\u0011OdgonPZ\u0013C%\u0006\u001eюr,_U\u0001]\u0018\u000f:B\u0006?;M\u0006=A`z8\r H\"@y\u0013\u0006\"*N\u0011~zYK\u0014۵8@~@Z\rS\b\"\u0012\u001c>(\u0001$woNDZt]@1+\u0003\u007fBV'u0\u0005M#F\\܋\u0015vw\u001e3¨?5+%[\u0003\rXsσ\u0002M\u0006U\u0005\u0017<W/W\no6\u0007\u0017D\u001b1O\u001bu\u000b&\u000b\u001e\u0002f\u0012'9i{K~\u001cX}\u0001{\u001bW\u001c\u000e4Cx43\u001at%&3#\u0011\u0004FV\u0002la\u0018z\u0010TG<\u000639Y3wacK\u0019|N\f\u0007\u001d\u001eQ\u0016\u001dBƟX\u000ef7Kk}Q?tXNXP\u001aYk\u0005\u0014rr\u0002X\u0019^hĬ3{\u0017PG<=[GG9|\u0012JTg%\u001cpjci\u0001]nCå\u001a70+R_ֈh\u0005yulѵ+\u001fa4T5\u00138\u001d.\u0003\u0010B1' N}\u0011\u0018\u0012}s\u0018NGxGa~q\u001eYI^a]\u007f\u000b cbvBTj\u00045^lBa$r\\V;bNp\u0010\u0006\u0016\\N:!bKw\u001cBVI\u001fl\u0017X\u0003Ljo$9m`h\u001e*l;4\u0005y$#\u001e\u0017O\u000b\u001d m~I:\u0018x\"[]\u0002;\u001f&c?\u00014+A7\u0005y\u007fU\u0007dGz\u000bF\r[{.62Ja1M\u0013=\u001694\u0012-sa!\u0007˛Q\u0012-\u001d-\u0011\u0015;vQ\u007f\u0019zr<`\u0019a_V'\"%s!Dϋh\u007f\u007f\u0004v\u0012Mcb/sOYt\u0013YjeH~\u0015\u001fL:/\u0011ݕ\u000153eW#\u001cx\"\\-a\f\u001863ԃf\u000f4$}\u0002:w.o\u0011f\u000e<I^a_\u000f@2$\u001b+po\u001b\u000e\u0016k!F\u001d;XGtrf8{3]%v\t<\r\u001fk\n[Cu\u00044<wBsq\u0017DdI%\u001fgkg\u001c{{h\u0011J\u001d4#\u0002Ap\"\u001ckH\u0005~\u0013\u000f6\u0007\u0002ENAi\u00115J\u000f$BWT\u0010\u001bEdi4%\u0011~t\f?\u001d8B\u0002Vn\u000e\u0003\u0015#[߃\t`S\u00119Ƣ\u007f\r@K\u001e'Ja\t{^l/\u0012K1W+\u001f3j}\u0016\u0017)9^l9I6\t\u0005\u0019buCw f\bUH\u0006k\u001e*h-\u000b=Z)+;a\u0011\u000e\u000e@`\u001bU\u0013c\u0013\u0018ՆjRTDY\u0014\t &M\u001a\u0011\u001b\u0019}\n\u007fd=L|\redױ\u0005\u0017JK7!\u000b\b^,=\bE-k`z\u00167{\u0006hi\u001fл$ -&;\"Ǜ[\u000et<u\rHI\n\u0016\u0011\u00179\u0017^6\u001c.x)#\u00104\bDg\u001a30,\u000f_qw/Z?+\u001b\u0014rQnx\u0018~\u0005c\u001dq;\tl1d/\u0007-~;9>S.!\u000frK!U0X?4$\u00176\u001fd\u001d\u0011J֤Scn\u0013\u001cfa\r9S\u0004;q3@RL2/{\u0006\u0004XiV6ͪZMD\u0007Oa\u05cfFW\u001c\u0016\u0003ܞc\u0003?A\u0014+\u0014xb\u001f9LF!F\u0015?EB7g\u001dIp\u00072mY(11\u0001TIXb\u0011u(\u0005)\u001b:\u0011\u000e00H\t\u0001\u001a\u007f,[T\u0005K 'gO\u0006l\u0013([EfW\u001e+?:A5`8.Yt\u001aJW\u00029G\u0019\u001f6-84\u000e7\u001f;k_\u0001=*/+1$Ey?\"R\u0005Gt3/=$+Yv;SJ\u0014mۡ\u0010\u0002kl/diV\u001d\u0006DZEG.y\u0004t\u0010\f/$R\u001b$DǪI1NL\u0010hFV\u0002\u0002\u001c,:8~DQo\u001b :\u000fߢm\u0018\u0002\u001ds]Bt\u0013\u0014GYn.;\u0013\u001fE{\u0011*\u001bR6] G\u0011\u0016)a?\r\u0012_qn@w\u0014}5b]J+\f\u0004hK\u0012<\u007fGNsB\u0006[ \u0005opj{{w\u0016H\u0014\u001d\r2 _y\u0011\u0006f\u001e&Tcvtd\r\u0007SAp6X\u00174`>B: \u001c\u0015\\tG\b\u0004Jn0+3u\u0010qM\u0018V\nV5\u0011\nCL*ڃnGM\u000f\n6KsK\u000b\u001c_\t9st\u001dUOd\u0015/#\u0016\u0003+\\{\u0007B(Dp\u0006<S\u0015L\u001ey\u0011DV\f`E>\u0007\u0017kS_\u0011\u001cMqe\u0017u~`we|܌\u0015+=y\u001fgcGE\n\u0012\u0005 AGG\u001b c9`8\".жB{\u000e~\u0010VߑqI\u001e>ye/k\u001e?]P{pd#W\u0019\u0006g/\u0010.e<\u0006AL)fѸm\u000e0\u001f\u001beD\u0013AHyhApP+'\u0001\u0005\u000e>\ff}4dL\u0010߭ 5I!XJ<3!G}\u0013,.s3~t\buu/\u0004]V1 9\u0014SmY\u0007Q\u000b\u0001\u0005\u0017o^NY\u001a\u001aK5\u0012\u007fVpH\u0017\u0004\f\u001en\u0002\u001dx\u0011\b\\\u001c4rC\u000bf\u0013M\u0014BJ\u0013\u0005\u0019\u0015w.\u001f_\u0010z\t\u000f\u0019\u000fAǏa۪Ց+8N7'N\u0019yo],7r\u001fSkA\u0002:aP{\u000e)U\u0013\u001e\u000e\u0019\n(\u0019\n,K6;\u0018\\\u0001#OVf!,\u001d\t[{\u001ck]Z\rZXB;*?m\u00170Z\u0012\u001aM\u001d,\u001d{\u0003U\u0004p\u000bd-uN\u001eO+QGO;3\u001dJ\\JM\u0007#5Xt3<Q\u001e\u001f@\u0015,9zn\f{a\u00068OL\u0011,\u007f\u0016w\b\"\u001dk@\\sL3O\u0018\u000b'\\\\% \u0007\b\u0016\nE\u0010d:)RcE+\u0010%LJ`\u007fiÒMה\u0017ɗփrz+gskG\u000f\u0004nJml\r\u000f]\u0016MqAcs\u0017E[F\"\fYc\u0006~YUTI.d].\u0006u\nV|\u0016`  \b?&\f`\nYG{\u0016\u007fLkh\u001aw\u0007\"\nc.Hx\u0017rz\u0011ha>K\\\u000e,\u001fLVA#n>\b`\u0016\u0019k\r~3OQs{;H\u001fBx2l UHp\u0001\u001c~\u001a\u0005y}B\u0016g^)DY+s\u0004\u0016\u0018\u0002&ub\u0004(]\u0018>\u0016N?\u000e\u001aQ\r\"i\u00075\u0016w9Y1$?n}<\"4@|uZNM\f\f\u001cd~L~\u001b\b\b\r:\u0005Ə\u000b\u0017m\u0014XȊ\u0018ۋ!Cmޢ\b\u0013DlS]\u0017T;҆ ʑ_]/0\f\bA!O\".\u000eR\fVݻ]ʴSw\t@V\u0018,(Q4 \u00143f#\u05ce7ȍE3GS~\u001bK\fmeZ\u0005;&w˵\rľ,it\u0013}\u0017@$I\u001b\u0005$\u000e\u001d\u001e&a%7.(Ȍ|\u03816\u0018(U\u001eA\"\u0015hi\u0006\tAW><\f\t{MDߑ0źsl\u007f^\u001eQ\u0012Xk\f\u00106s68&\u0001JJ!3É)ɑ,N'\u0010$/85J\u000etB)oí}t~Uhۡ|bmϣ\\&"}, d2 = {"!kX1X9+O\"\u0001zM6\u0004\t<a\t&{", "", "\"gd:U\u000f>W\u001b\u0002\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "\u0014", "\"gd:U\u001aBh\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGd)JYS", "\u0018", "\"gd:U\u001bKO\u0017\u0005\\Z7j\rDe", "\"gd:U\u001eBR(\u0002", "5dc![<FP\u000b\u0003ym/", "u(5", "\"qP0^\u000f>W\u001b\u0002\n", "5dc!e(<Y{~~`/\f", "\"qP0^\u0010Ga\u001d}z<6\n\u0012/rm,\u0011@", "7rB=X*BT\u001d~y", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d,9X}-$i\u001f0M\u0019", "7rB=X*BT\u001d~y&\u0010}T\u001d1iv:<\n !Vk\u001d@\u0001.C", "uI\u0018#", "7rB=X*BT\u001d~y&\u0010}T\u001d1iv", "uI\u0018'", " `]4X\u001aEW\u0018~\b", "", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006c!>[}\u000e>q\u0015.Z1JgC\u001ej", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "3mP/_,=", "1n[<e:", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d,9X}-\u0015w\u001d8ZQ\u0011", "AsP?g\u0010Gb\u0019\fv\\;\u0001\u00138S\n8\t>\u0001", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005SD-\u0011eh9jl;N\u0004#E[R6e@|M!\u0010Zc", "3mS\u0016a;>`\u0015|\nb6\u0006v9u\r&{", "AsP?g\u001bAc!{", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "3mS![<FP", "BqP0^", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u00121b\u007f %t\u001a-MP)z0-\u0015>H5\u0010b9Xz&Z\u0016L6d]|K\u0014[j\u0012\u0018\u0013\u0017\u0004]B(nQ\r\u0014n(R\u0001Hr\u0005\u000b)W3txM`\u001eGC\u001dqP)uJUfG\u0011/Lf)d\u0019='cDG2iX\u0015$g]8\u000ezfZp\\\u0002rqU\u0019D9.NvZBTs_E>+(Z{\u0005\u000e0gx5}vkD92a\fKK!M^\u0006\u0011*kE1/$F#LIcKS:\u0017g,k\f\ru~/#mpmV\u000fP^!k>`[\u0010;\\\u000f\bMx$'Sz@j}\u001f\u0012P\f}tE@\"Td#\u007fD/[\u000f\u0012\u0007p!\n8&JW\u000f>\u0011eA\\\u001a\rq\u0002\u0011\ra\r\u0016\u0001Q\u000e|O|de9\u0005F\u0002\u000fX%=T\nL9Iy\u001f\u001d8\nT\u0004.{3C\n?\u00114)GbF,A?\u0014eb&#p\u0006q\u00063;\u0011YDw(|8\u001dG\u000fx\u0006\u0013lBB\u000bA\u000b*z+:rO\u000fE((v(V\u0014<jx\u0015U%q?Ry\u0018\u000e\u0004t\u0006#%;*}GhE%7q\u0016\u001a\n|r\u0013~DI", "D`[BX", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\rl\n6{?a\u001e!C~\u0012Ex\u0010?]\u0007/$i\u001f0M\u0019", "", "=mE._<>1\u001cz\u0004`,", "D`[BX\u0019:\\\u001b~", "=mE._<>1\u001cz\u0004`,]\r8i\u000e+{?", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "AsT=f", "", "uKZ<g3B\\b\fvg.|\u0017xC\u00072\n@\u007fw\u001eQk\u001d@\u007f' c\u0002)FZ\u00127OC\u0011R:($oeBPh=V@(WUL;`\\{K]rj\u0017L:\u0011\u000fb\ryU@@\u001e\u00156M\u0001N2~\u0016\u001e\u0019?xp\ff\u0014\u0011a\u001ftE*lFf5n.GOq1h\u0015)*XC<$\";v\"r^.\t\\Z\u001bna}pi2#~A3+idHEE<B~6&O\u0005A\u0017C`>,\u00056\u0002C.@m\u0013\u0015H(G\\\b\u00196e\f|\r2E\u0012LUgt\u007f\b\fr'l\u0012\u001cb~9\u0015tepL\u000b\u000e+`I<e^\u0001D0\u0010ES|#|-zKZ\u0007\u001f\r\u000677cSK&^\u000f\u001a:E,o\u001a\u0002~u\u001c&7_Ab\u001eh7[5\\\u0017\u0013q\u0002s\fh?\u0012wHsvZrhSm3:\u0003\u001a7+CX:v(*k\u0019\u0015A\u000b\u000f}0=gL\u0002A\u001d3%\u0007ZBri.\u0007vW,\"1<%.->}POrh\u0001p|\u000e\u001ddy\u001c]\"A\u00113NEh1@mTrFj_\u000e,#{5j\u0004\u001dFd=:[vW\u0001\u00144v\" 6/\u0004\u0011\u007fw$-u\u0010\u0016\u0013=r\u0016!\u000bgU\u001aV\\sYPc~k8\u0003\u001f&Pq#\u0016a9L8]L\u0001(\u0001]dZ\u0010A_;\u0003-?\f)jB\"\u000f\u0006_\u000b)N)%v\n\u0001j]3kZoaX=;\u001fMH\u001f<\u001f-JSO}v\rbdS\u000e<\u001f\u000b=vrX\u001a>b\u0001'?v9?+KQ:\u0012", "uKZ<g3B\\b\fvg.|\u0017xC\u00072\n@\u007fw\u001eQk\u001d@\u007f' c\u0002)FZ\u00127OC\u0011R:($oeBPh=V@(WUL;`\\{K]rj\u0017L:\u0011\u000fb\ryU@@\u001e\u00156M\u0001N2~\u0016\u001e\u0019?xp\ff\u0014\u0011a\u001ftE*lFf5n.GOq1h\u0015)*XC<$\";v\"r^.\t\\Z\u001bna}pi2#~A3+idHEE9#z1.R\u007f\u0001[7i|tu=\r29:n\u000eY1xNgv$0fJq{\u001d8\u001c>XmykQWf)i\u0013\u0018p5z!atcU\u0013\u0003dd%#hc\u007f7_cHPy\"5\u001ce>dx\"\u0013\u000b#\u0001/GM#_\u000b(p\u000e/o\u001a\u0012\u0007n\u0018e\f Ed\u0019v*l\r1vLY", " `]4X\u001aEW\u0018~\bB4\b\u0010", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@y)6z 2LV\u0005i>& ro9Pk(]v4KHUy&?nF\u0016\u0012H\u0015R*\r\u0012GP }D\r\u0014n(R\u0001Hr\u0005\u000b)W3txM`\u001eGC\u0016\u007fQ2gBhc\u0004P\u000bIk9d\u0019[\u001bk>D-]Y)*dM5\n_\\ r_uevK#\u0004&.NzYF\u001bVQEs4)Oz\u000b[0b|6~;\u0004}+@t\u000eJc'Bh\u0002^0eP'32:\"CUl?TN\u001dd\u001ch\bqkD1&acrL\u0019\u0010K!kB__V\u001eX\u0010MPs\u001epK\u0010J%z%\u0012\u00053qoRQd5\u0011#nS&i\u001aPXM\u001e&=\u001dAbXm;g\u0001N#\u0012fG\u0010\u0006bQ^QX\u0019kZve`=y\u001d~\u001bX(7T\u0006{cK9\u0011&=~\u001a\u0003'|w\fZF\u001c#4AcA06\u0016\u0007pR/#k7/h+;\n]J|^A4%\u0007\u001dl\u0005\u0015'\u001cB\n>KWj/\u0012G\u000fu", "!kX1X9", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d,9X}-%|\u0012=M\u0019", "7mc2e(<b\u001d\t\u0004L6\r\u0016-e", "Bgd:U", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u0013<]| D[%*\\C\u0011R0'\u0014uk=\u0006vuL\u0001/RV\\,&bv\u0007{\u001cY\u0012O/\r\u0012/6\u000bjM6,\u00120H\u0015\u0005f\u000b\u0014!\u0018Cj:JR\u001fG\u0007\u0019qHv24`cxGN#l1n\u0019mrC6C#!{\u001d\u001a{\u001a,\u0014\u0004^\u001b\u0001RChqW\"y43Bwd\u0010Ixd<\u0002#\u001dZ\u007f\u0002\u001b{@\u0005:p*\u000b4\u000e?s\u0005Xc\u0016Mb\u0003\u001e\u001afQ4$6\u0012yEUr|pGWm0iQ\u000fr>/(iolVXgm YDei\n\u0005(lDS~\u001c+OHGl\u0002^\n\u0017-ktMM$bJz\u0001M n\u0015\r\f4m\u0003*\u001f<f\u0019l)r\u0001K\u001d\u0011sB\u001a{#P%yW\u0014uK<9aw/@\u0007\u0011Vv\u0017/\u007fg", "uE;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu\u001ei\u001f-ZM?jGg\u0013riD\u0011q,\u0018\u0007+\u00114X+`Sv=!gOtT5\u001c\f]JmsU?h\t<R\u007fJl\u000b\u0015$W\u0016zy@e\u0014Q\u0003_K(%qEfi}FT\u000f`4l\u0017i+\\\u0004B #q&\u001fdW{SiZ\u0015qR\u0007EqN#\bFy%idERyY;\bp\u001dU\u0004\u0003\u001c@X>,~=\r3&Eh\u000fT1\u001cGmx\"(ZP+0?\u0006zOZ_rs>qq.a\u0015\n`D5#nSmX\u001c\u0005]l?\u001cgi\u0010>V\u000f\bN\u0001\u001dpG\u000fKY\t\u0019\u0013\u001027FYL\u0019c\u0005$y\u0012wF\u0017\r\u0012m\u001c%w\u001bNaXi:h5\\\u0017\u0013qFU\\iL\u0013\u007fL\u001av\u0019HB]y3=|\u001a\u0013./T>v`\rM\u0017 B\u0001\n_$}eQ}?\u0015\u0010/AbGO\\8\rg)\t\u0015p7))10\u0015\u001c>xf\u00031#}Wu\r\u001elB@\u0002|\u001fSr-FqK\u0012\u0012>6so>", "uE;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu\u001ei\u001f-ZM?jGg\u0013riD\u0011q,\u0018\u0007+\u00114X+`Sv=!gOtT5\u001c\f]Jm{@@!\b:\u0013_Br\u000f\f\u0015n<tlQZ\u0019Id\u001fyJ8UBbay\u001d%,h4s\u0013c&&?K,]r)$f_2\u0014\u0005aZSb\u0003evK#\u0004\u0003y%idERyY;\bp\u001dU\u0004\u0003\u001c@X>3p<\u0004A.2kR\u0015U\u001fB]x\"\nfH13D\u0012y;Tb\u0003vB\r{h_\u0012\u0016m??\u0019/fmX\u0018\u0006Y&_?j)\u0005@a\u0006KEm$+P\b\fC\n$\u0005\u0004+mIRR\u001ba|\u0018\u007fH,h~\r\u0013s\u0016\u001c\u0004|9b\u000eu4c6`\\\u0007r@\u0017\u0006gC^}X\u0019|Oz[!M.>\u0004\u001bW!@! Z\u00164", "!kX1X9\"[$\u0006", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@y)6z 2LV\u0005i>& ro9Pk(]v4KHUy&@yA\u0013\u0012g{]'\u001c\u0005/6\u000bjM6,\u00120H\u0015\u0005f\u000b\u0014!\u0018Cj:C` Px\u0011\u0005E3q\u0010]h\tGNA`9h\u0016hfDJI \u0011x\u0019~q_.\u0017wQ v\\\u0003UqW&x8y%seULs^\u0006y8'\u0015|\b\u001b0gx5};M\u0015:?b\u0014Oq!\f4_\u001b6kH+/\u007fA$G\u0015d\u0006u<\u001dl)j\u0016WCE:\u0017timQ\\\\D\u0013d4ni\u00056eO<Sw 1T~\fh\n\u001e\u0018\u000b,m/'M#_\u000b(pQwCTs", "!kX1X9+O\"\u0001z", "AsP?g", "3mS\u0016a*Ec'\u0003\f^", "uE5u=", "@`]4X", "uKZ<g3B\\b\fvg.|\u0017xC\u00072\n@\u007fw\u001eQk\u001d@\u007f' c\u0002)FZ\u00127OC\u0011/\u0019", "1`[099:Q(\u0003\u0005g", RemoteSettings.FORWARD_SLASH_STRING, AdkSettings.PLATFORM_TYPE_MOBILE, ">nb", "AbP9X", "/0", "00", "F", "/1", "01", "AbP9XsSW#\u0010l]v", "uE5\u00179\r\u00028", "F0", "AmP=I(Ec\u0019m\u0005M0z\u000f", "1ta?X5M", "BhR899:Q(\u0003\u0005g:", "", ";h]\u001dk", ";`g\u001dk", "AsT=f\u001bHB\u001d|\u0001?9x\u0007>i\n1\n", "/vP6g\u001aE]$", "\u001aj^A_0G\u001d\u0004z~k\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018' xp\u0017\n_5Pv|", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001I(*QR&u8'$hn\u0019\u0018c5]d%QWN\u0002", "7c", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018\u001dj", "Bx_2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x#2 h7", "/vP6g\u001aE]$FMo\u001c\u0006\u0007,I", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001b R\u007f\u001d\u0006\u0002/9b\r D7q@IGJV>\"\u001ewaFft,W\u0006\u0015EVY,27V$\u001a\u001ci\u0015R4V\u0003cN.~S;(\b:\u0013_Eq\u0010\u0010\u001f\u001e1ytL_e\u000b`\u001aqR%2MUh{\u0011+Bg*b\u001b5", "@`]4X\u001aEW\u0018~\b>5{w2u\b%i@\t\u0013 Vs\fJ", "@`]4X\u001aEW\u0018~\bI9|\u0017=D\r$}(\u000b\u0016\u001bHs\u000eI", "@`]4X\u001aEW\u0018~\bL;x\u0016>T\u00038\u0004=n\u0017\u001fCx\u001d@t3", "AkX1X9,S!z\u0004m0z\u0017", "AkX1X9-O$f\u0005]0}\r/r", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SliderKt {
    private static final double SliderRangeTolerance = 1.0E-4d;
    private static final float ThumbHeight;
    private static final long ThumbSize;
    private static final float ThumbTrackGapSize;
    private static final float ThumbWidth;
    private static final float TrackHeight = SliderTokens.INSTANCE.m3515getInactiveTrackHeightD9Ej5fM();
    private static final float TrackInsideCornerSize;

    /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$RangeSlider$11 */
    /* JADX INFO: compiled from: Slider.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass11 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$changed1;
        final /* synthetic */ int $$default;
        final /* synthetic */ SliderColors $colors;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $endInteractionSource;
        final /* synthetic */ Function3<RangeSliderState, Composer, Integer, Unit> $endThumb;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function1<ClosedFloatingPointRange<Float>, Unit> $onValueChange;
        final /* synthetic */ Function0<Unit> $onValueChangeFinished;
        final /* synthetic */ MutableInteractionSource $startInteractionSource;
        final /* synthetic */ Function3<RangeSliderState, Composer, Integer, Unit> $startThumb;
        final /* synthetic */ int $steps;
        final /* synthetic */ Function3<RangeSliderState, Composer, Integer, Unit> $track;
        final /* synthetic */ ClosedFloatingPointRange<Float> $value;
        final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass11(ClosedFloatingPointRange<Float> closedFloatingPointRange, Function1<? super ClosedFloatingPointRange<Float>, Unit> function1, Modifier modifier, boolean z2, ClosedFloatingPointRange<Float> closedFloatingPointRange2, Function0<Unit> function0, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function3, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function32, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function33, int i2, int i3, int i4, int i5) {
            super(2);
            closedFloatingPointRange = closedFloatingPointRange;
            function1 = function1;
            modifier = modifier;
            z = z2;
            closedFloatingPointRange = closedFloatingPointRange2;
            function0 = function0;
            sliderColors = sliderColors;
            mutableInteractionSource = mutableInteractionSource;
            mutableInteractionSource = mutableInteractionSource2;
            function3 = function3;
            function3 = function32;
            function3 = function33;
            i = i2;
            i = i3;
            i = i4;
            i = i5;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            ClosedFloatingPointRange<Float> closedFloatingPointRange = closedFloatingPointRange;
            Function1<ClosedFloatingPointRange<Float>, Unit> function1 = function1;
            Modifier modifier = modifier;
            boolean z2 = z;
            ClosedFloatingPointRange<Float> closedFloatingPointRange2 = closedFloatingPointRange;
            Function0<Unit> function0 = function0;
            SliderColors sliderColors = sliderColors;
            MutableInteractionSource mutableInteractionSource = mutableInteractionSource;
            MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
            Function3<RangeSliderState, Composer, Integer, Unit> function3 = function3;
            Function3<RangeSliderState, Composer, Integer, Unit> function32 = function3;
            Function3<RangeSliderState, Composer, Integer, Unit> function33 = function3;
            int i3 = i;
            int i4 = i;
            SliderKt.RangeSlider(closedFloatingPointRange, function1, modifier, z2, closedFloatingPointRange2, function0, sliderColors, mutableInteractionSource, mutableInteractionSource2, function3, function32, function33, i3, composer, RecomposeScopeImplKt.updateChangedFlags((i4 + 1) - (i4 & 1)), RecomposeScopeImplKt.updateChangedFlags(i), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$RangeSlider$18 */
    /* JADX INFO: compiled from: Slider.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass18 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ SliderColors $colors;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $endInteractionSource;
        final /* synthetic */ Function3<RangeSliderState, Composer, Integer, Unit> $endThumb;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ MutableInteractionSource $startInteractionSource;
        final /* synthetic */ Function3<RangeSliderState, Composer, Integer, Unit> $startThumb;
        final /* synthetic */ Function3<RangeSliderState, Composer, Integer, Unit> $track;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass18(Modifier modifier, boolean z2, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function3, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function32, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function33, int i2, int i3) {
            super(2);
            modifier = modifier;
            z = z2;
            sliderColors = sliderColors;
            mutableInteractionSource = mutableInteractionSource;
            mutableInteractionSource = mutableInteractionSource2;
            function3 = function3;
            function3 = function32;
            function3 = function33;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            SliderKt.RangeSlider(rangeSliderState, modifier, z, sliderColors, mutableInteractionSource, mutableInteractionSource, function3, function3, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$RangeSlider$4 */
    /* JADX INFO: compiled from: Slider.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass4 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ SliderColors $colors;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function1<ClosedFloatingPointRange<Float>, Unit> $onValueChange;
        final /* synthetic */ Function0<Unit> $onValueChangeFinished;
        final /* synthetic */ int $steps;
        final /* synthetic */ ClosedFloatingPointRange<Float> $value;
        final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass4(ClosedFloatingPointRange<Float> closedFloatingPointRange, Function1<? super ClosedFloatingPointRange<Float>, Unit> function1, Modifier modifier, boolean z2, ClosedFloatingPointRange<Float> closedFloatingPointRange2, int i2, Function0<Unit> function0, SliderColors sliderColors, int i3, int i4) {
            super(2);
            closedFloatingPointRange = closedFloatingPointRange;
            function1 = function1;
            modifier = modifier;
            z = z2;
            closedFloatingPointRange = closedFloatingPointRange2;
            i = i2;
            function0 = function0;
            sliderColors = sliderColors;
            i = i3;
            i = i4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            SliderKt.RangeSlider(closedFloatingPointRange, function1, modifier, z, closedFloatingPointRange, i, function0, sliderColors, composer, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$RangeSliderImpl$3 */
    /* JADX INFO: compiled from: Slider.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C06803 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $endInteractionSource;
        final /* synthetic */ Function3<RangeSliderState, Composer, Integer, Unit> $endThumb;
        final /* synthetic */ MutableInteractionSource $startInteractionSource;
        final /* synthetic */ Function3<RangeSliderState, Composer, Integer, Unit> $startThumb;
        final /* synthetic */ RangeSliderState $state;
        final /* synthetic */ Function3<RangeSliderState, Composer, Integer, Unit> $track;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C06803(RangeSliderState rangeSliderState, boolean z2, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function3, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function32, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function33, int i2) {
            super(2);
            rangeSliderState = rangeSliderState;
            z = z2;
            mutableInteractionSource = mutableInteractionSource;
            mutableInteractionSource = mutableInteractionSource2;
            function3 = function3;
            function3 = function32;
            function3 = function33;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            SliderKt.RangeSliderImpl(modifier, rangeSliderState, z, mutableInteractionSource, mutableInteractionSource, function3, function3, function3, composer, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$Slider$13 */
    /* JADX INFO: compiled from: Slider.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass13 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ SliderColors $colors;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function3<SliderState, Composer, Integer, Unit> $thumb;
        final /* synthetic */ Function3<SliderState, Composer, Integer, Unit> $track;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass13(Modifier modifier, boolean z2, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function3, Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function32, int i2, int i3) {
            super(2);
            modifier = modifier;
            z = z2;
            sliderColors = sliderColors;
            mutableInteractionSource = mutableInteractionSource;
            function3 = function3;
            function3 = function32;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            SliderState sliderState = sliderState;
            Modifier modifier = modifier;
            boolean z2 = z;
            SliderColors sliderColors = sliderColors;
            MutableInteractionSource mutableInteractionSource = mutableInteractionSource;
            Function3<SliderState, Composer, Integer, Unit> function3 = function3;
            Function3<SliderState, Composer, Integer, Unit> function32 = function3;
            int i3 = i;
            SliderKt.Slider(sliderState, modifier, z2, sliderColors, mutableInteractionSource, function3, function32, composer, RecomposeScopeImplKt.updateChangedFlags((i3 + 1) - (i3 & 1)), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$Slider$4 */
    /* JADX INFO: compiled from: Slider.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C06844 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ SliderColors $colors;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function1<Float, Unit> $onValueChange;
        final /* synthetic */ Function0<Unit> $onValueChangeFinished;
        final /* synthetic */ int $steps;
        final /* synthetic */ float $value;
        final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C06844(float f2, Function1<? super Float, Unit> function1, Modifier modifier, boolean z2, ClosedFloatingPointRange<Float> closedFloatingPointRange, int i2, Function0<Unit> function0, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, int i3, int i4) {
            super(2);
            f = f2;
            function1 = function1;
            modifier = modifier;
            z = z2;
            closedFloatingPointRange = closedFloatingPointRange;
            i = i2;
            function0 = function0;
            sliderColors = sliderColors;
            mutableInteractionSource = mutableInteractionSource;
            i = i3;
            i = i4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            float f2 = f;
            Function1<Float, Unit> function1 = function1;
            Modifier modifier = modifier;
            boolean z2 = z;
            ClosedFloatingPointRange<Float> closedFloatingPointRange = closedFloatingPointRange;
            int i3 = i;
            Function0<Unit> function0 = function0;
            SliderColors sliderColors = sliderColors;
            MutableInteractionSource mutableInteractionSource = mutableInteractionSource;
            int i4 = i;
            SliderKt.Slider(f2, function1, modifier, z2, closedFloatingPointRange, i3, function0, sliderColors, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags((i4 + 1) - (i4 & 1)), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$Slider$8 */
    /* JADX INFO: compiled from: Slider.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C06868 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$changed1;
        final /* synthetic */ int $$default;
        final /* synthetic */ SliderColors $colors;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function1<Float, Unit> $onValueChange;
        final /* synthetic */ Function0<Unit> $onValueChangeFinished;
        final /* synthetic */ int $steps;
        final /* synthetic */ Function3<SliderState, Composer, Integer, Unit> $thumb;
        final /* synthetic */ Function3<SliderState, Composer, Integer, Unit> $track;
        final /* synthetic */ float $value;
        final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C06868(float f2, Function1<? super Float, Unit> function1, Modifier modifier, boolean z2, Function0<Unit> function0, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, int i2, Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function3, Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function32, ClosedFloatingPointRange<Float> closedFloatingPointRange, int i3, int i4, int i5) {
            super(2);
            f = f2;
            function1 = function1;
            modifier = modifier;
            z = z2;
            function0 = function0;
            sliderColors = sliderColors;
            mutableInteractionSource = mutableInteractionSource;
            i = i2;
            function3 = function3;
            function3 = function32;
            closedFloatingPointRange = closedFloatingPointRange;
            i = i3;
            i = i4;
            i = i5;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            SliderKt.Slider(f, function1, modifier, z, function0, sliderColors, mutableInteractionSource, i, function3, function3, closedFloatingPointRange, composer, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))), RecomposeScopeImplKt.updateChangedFlags(i), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$SliderImpl$3 */
    /* JADX INFO: compiled from: Slider.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C06873 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ SliderState $state;
        final /* synthetic */ Function3<SliderState, Composer, Integer, Unit> $thumb;
        final /* synthetic */ Function3<SliderState, Composer, Integer, Unit> $track;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C06873(SliderState sliderState, boolean z2, MutableInteractionSource mutableInteractionSource, Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function3, Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function32, int i2) {
            super(2);
            sliderState = sliderState;
            z = z2;
            mutableInteractionSource = mutableInteractionSource;
            function3 = function3;
            function3 = function32;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            SliderKt.SliderImpl(modifier, sliderState, z, mutableInteractionSource, function3, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    /* JADX INFO: renamed from: isSpecified-If1S1O4$annotations */
    public static /* synthetic */ void m2524isSpecifiedIf1S1O4$annotations(long j2) {
    }

    public static final void Slider(float f2, Function1<? super Float, Unit> function1, Modifier modifier, boolean z2, ClosedFloatingPointRange<Float> closedFloatingPointRange, int i2, Function0<Unit> function0, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, Composer composer, int i3, int i4) {
        int i5;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        Modifier.Companion companion = modifier;
        SliderColors sliderColorsColors = sliderColors;
        int i6 = i2;
        ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo = closedFloatingPointRange;
        boolean z3 = z2;
        Function0<Unit> function02 = function0;
        Composer composerStartRestartGroup = composer.startRestartGroup(-202044027);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Slider)P(7,4,3,1,8,6,5)167@8058L8,168@8118L39,179@8458L181,186@8657L122,170@8166L652:Slider.kt#uh7d8r");
        if ((-1) - (((-1) - i4) | ((-1) - 1)) != 0) {
            i5 = i3 | 6;
        } else if ((-1) - (((-1) - i3) | ((-1) - 6)) == 0) {
            i5 = (composerStartRestartGroup.changed(f2) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i4 + 2) - (i4 | 2) != 0) {
            i5 = (i5 + 48) - (i5 & 48);
        } else if ((i3 + 48) - (i3 | 48) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i7 = (i4 + 4) - (i4 | 4);
        if (i7 != 0) {
            i5 = (i5 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i5 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((i3 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i3 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            int i8 = composerStartRestartGroup.changed(companion) ? 256 : 128;
            i5 = (i5 + i8) - (i5 & i8);
        }
        int i9 = (-1) - (((-1) - i4) | ((-1) - 8));
        if (i9 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 3072));
        } else if ((-1) - (((-1) - i3) | ((-1) - 3072)) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(z3) ? 2048 : 1024)));
        }
        if ((-1) - (((-1) - i3) | ((-1) - 24576)) == 0) {
            int i10 = ((i4 & 16) == 0 && composerStartRestartGroup.changed(closedFloatingPointRangeRangeTo)) ? 16384 : 8192;
            i5 = (i5 + i10) - (i5 & i10);
        }
        int i11 = (i4 + 32) - (i4 | 32);
        if (i11 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE));
        } else if ((196608 & i3) == 0) {
            i5 |= composerStartRestartGroup.changed(i6) ? 131072 : 65536;
        }
        int i12 = (i4 + 64) - (i4 | 64);
        if (i12 != 0) {
            i5 = (i5 + 1572864) - (i5 & 1572864);
        } else if ((1572864 & i3) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function02) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i5 |= ((i4 & 128) == 0 && composerStartRestartGroup.changed(sliderColorsColors)) ? 8388608 : 4194304;
        }
        int i13 = (i4 + 256) - (i4 | 256);
        if (i13 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 100663296));
        } else if ((-1) - (((-1) - i3) | ((-1) - 100663296)) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(mutableInteractionSource2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432)));
        }
        if ((-1) - (((-1) - i5) | ((-1) - 38347923)) == 38347922 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((-1) - (((-1) - i3) | ((-1) - 1)) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i7 != 0) {
                    companion = Modifier.Companion;
                }
                if (i9 != 0) {
                    z3 = true;
                }
                if ((i4 & 16) != 0) {
                    closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                    i5 = (i5 - 57345) - (i5 | (-57345));
                }
                if (i11 != 0) {
                    i6 = 0;
                }
                if (i12 != 0) {
                    function02 = null;
                }
                if ((-1) - (((-1) - i4) | ((-1) - 128)) != 0) {
                    sliderColorsColors = SliderDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                    i5 &= -29360129;
                }
                if (i13 != 0) {
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -403669397, "CC(remember):Slider.kt#9igjgp");
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i4 & 16) != 0) {
                    i5 &= -57345;
                }
                if ((i4 + 128) - (i4 | 128) != 0) {
                    i5 = (i5 - 29360129) - (i5 | (-29360129));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-202044027, i5, -1, "androidx.compose.material3.Slider (Slider.kt:169)");
            }
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(308249025, true, new Function3<SliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt.Slider.2
                final /* synthetic */ SliderColors $colors;
                final /* synthetic */ boolean $enabled;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C06822(SliderColors sliderColorsColors2, boolean z32) {
                    super(3);
                    sliderColors = sliderColorsColors2;
                    z = z32;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(SliderState sliderState, Composer composer2, Integer num) {
                    invoke(sliderState, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(SliderState sliderState, Composer composer2, int i14) {
                    ComposerKt.sourceInformation(composer2, "C180@8487L142:Slider.kt#uh7d8r");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(308249025, i14, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:180)");
                    }
                    SliderDefaults.INSTANCE.m2510Thumb9LiSoMs(mutableInteractionSource, null, sliderColors, z, 0L, composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54);
            ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(-1843234110, true, new Function3<SliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt.Slider.3
                final /* synthetic */ SliderColors $colors;
                final /* synthetic */ boolean $enabled;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C06833(boolean z32, SliderColors sliderColorsColors2) {
                    super(3);
                    z = z32;
                    sliderColors = sliderColorsColors2;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(SliderState sliderState, Composer composer2, Integer num) {
                    invoke(sliderState, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(SliderState sliderState, Composer composer2, int i14) {
                    ComposerKt.sourceInformation(composer2, "C187@8701L68:Slider.kt#uh7d8r");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1843234110, i14, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:187)");
                    }
                    SliderDefaults.INSTANCE.m2512Track4EFweAY(sliderState, (Modifier) null, z, sliderColors, (Function2<? super DrawScope, ? super Offset, Unit>) null, (Function3<? super DrawScope, ? super Offset, ? super Color, Unit>) null, 0.0f, 0.0f, composer2, (-1) - (((-1) - (i14 & 14)) & ((-1) - 100663296)), 242);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54);
            int i14 = (-1) - (((-1) - ((-1) - (((-1) - i5) | ((-1) - 14)))) & ((-1) - 905969664));
            int i15 = (i5 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (112 | i5);
            int i16 = ((-1) - (((-1) - ((i14 + i15) - (i14 & i15))) & ((-1) - ((-1) - (((-1) - i5) | ((-1) - 896)))))) | ((-1) - (((-1) - i5) | ((-1) - 7168)));
            int i17 = i5 >> 6;
            int i18 = 57344 & i17;
            int i19 = (-1) - (((-1) - (((i16 + i18) - (i16 & i18)) | (458752 & i17))) & ((-1) - (i17 & 3670016)));
            int i20 = i5 << 6;
            Slider(f2, function1, companion, z32, function02, sliderColorsColors2, mutableInteractionSource2, i6, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, closedFloatingPointRangeRangeTo, composerStartRestartGroup, (-1) - (((-1) - i19) & ((-1) - ((i20 + 29360128) - (i20 | 29360128)))), (i5 >> 12) & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt.Slider.4
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ SliderColors $colors;
                final /* synthetic */ boolean $enabled;
                final /* synthetic */ MutableInteractionSource $interactionSource;
                final /* synthetic */ Modifier $modifier;
                final /* synthetic */ Function1<Float, Unit> $onValueChange;
                final /* synthetic */ Function0<Unit> $onValueChangeFinished;
                final /* synthetic */ int $steps;
                final /* synthetic */ float $value;
                final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C06844(float f22, Function1<? super Float, Unit> function12, Modifier companion2, boolean z32, ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo2, int i62, Function0<Unit> function022, SliderColors sliderColorsColors2, MutableInteractionSource mutableInteractionSource22, int i32, int i42) {
                    super(2);
                    f = f22;
                    function1 = function12;
                    modifier = companion2;
                    z = z32;
                    closedFloatingPointRange = closedFloatingPointRangeRangeTo2;
                    i = i62;
                    function0 = function022;
                    sliderColors = sliderColorsColors2;
                    mutableInteractionSource = mutableInteractionSource22;
                    i = i32;
                    i = i42;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    float f22 = f;
                    Function1<Float, Unit> function12 = function1;
                    Modifier modifier2 = modifier;
                    boolean z22 = z;
                    ClosedFloatingPointRange<Float> closedFloatingPointRange2 = closedFloatingPointRange;
                    int i32 = i;
                    Function0<Unit> function03 = function0;
                    SliderColors sliderColors2 = sliderColors;
                    MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource;
                    int i42 = i;
                    SliderKt.Slider(f22, function12, modifier2, z22, closedFloatingPointRange2, i32, function03, sliderColors2, mutableInteractionSource3, composer2, RecomposeScopeImplKt.updateChangedFlags((i42 + 1) - (i42 & 1)), i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$Slider$2 */
    /* JADX INFO: compiled from: Slider.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,i\bӵLc\u000b\u0004I\u00066\u000b<Ȑ\u0017\"Z\u0011(\u000btjQ0rf\u000f7ʂW,\u0015m\n7"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d,9X}-%|\u0012=M\u0019", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u0013<]| D[%*\\C\u0011R0'\u0014uk=\u0006vuL\u0001/RV\\,&_\u0003F#\u0016b\u000e\u0018\t\u0017\rdK2nQ\r\u0003K\u001d"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C06822 extends Lambda implements Function3<SliderState, Composer, Integer, Unit> {
        final /* synthetic */ SliderColors $colors;
        final /* synthetic */ boolean $enabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06822(SliderColors sliderColorsColors2, boolean z32) {
            super(3);
            sliderColors = sliderColorsColors2;
            z = z32;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(SliderState sliderState, Composer composer2, Integer num) {
            invoke(sliderState, composer2, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(SliderState sliderState, Composer composer2, int i14) {
            ComposerKt.sourceInformation(composer2, "C180@8487L142:Slider.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(308249025, i14, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:180)");
            }
            SliderDefaults.INSTANCE.m2510Thumb9LiSoMs(mutableInteractionSource, null, sliderColors, z, 0L, composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$Slider$3 */
    /* JADX INFO: compiled from: Slider.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,i\bӵLc\u000b\u0004I\u00066\u000b<Ȑ\u0017\"Z\u0011(\u000btjQ0rf\u000f7ʂW,\u0015m\n7"}, d2 = {"\n`]<a@F])\rS", "", "AkX1X9,b\u0015\u000ez", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d,9X}-%|\u0012=M\u0019", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u0013<]| D[%*\\C\u0011R0'\u0014uk=\u0006vuL\u0001/RV\\,&_\u0003F#\u0016b\u000e\u0018\t\u0017\rdK2nQ\r\u0003K\u001d"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C06833 extends Lambda implements Function3<SliderState, Composer, Integer, Unit> {
        final /* synthetic */ SliderColors $colors;
        final /* synthetic */ boolean $enabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06833(boolean z32, SliderColors sliderColorsColors2) {
            super(3);
            z = z32;
            sliderColors = sliderColorsColors2;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(SliderState sliderState, Composer composer2, Integer num) {
            invoke(sliderState, composer2, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(SliderState sliderState, Composer composer2, int i14) {
            ComposerKt.sourceInformation(composer2, "C187@8701L68:Slider.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1843234110, i14, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:187)");
            }
            SliderDefaults.INSTANCE.m2512Track4EFweAY(sliderState, (Modifier) null, z, sliderColors, (Function2<? super DrawScope, ? super Offset, Unit>) null, (Function3<? super DrawScope, ? super Offset, ? super Color, Unit>) null, 0.0f, 0.0f, composer2, (-1) - (((-1) - (i14 & 14)) & ((-1) - 100663296)), 242);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$Slider$6 */
    /* JADX INFO: compiled from: Slider.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass6 extends Lambda implements Function3<SliderState, Composer, Integer, Unit> {
        final /* synthetic */ SliderColors $colors;
        final /* synthetic */ boolean $enabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass6(SliderColors sliderColors, boolean z2) {
            super(3);
            sliderColors = sliderColors;
            z = z2;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(SliderState sliderState, Composer composer, Integer num) {
            invoke(sliderState, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(SliderState sliderState, Composer composer, int i2) {
            ComposerKt.sourceInformation(composer, "C260@12397L126:Slider.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1756326375, i2, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:260)");
            }
            SliderDefaults.INSTANCE.m2510Thumb9LiSoMs(mutableInteractionSource, null, sliderColors, z, 0L, composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$Slider$7 */
    /* JADX INFO: compiled from: Slider.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C06857 extends Lambda implements Function3<SliderState, Composer, Integer, Unit> {
        final /* synthetic */ SliderColors $colors;
        final /* synthetic */ boolean $enabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06857(boolean z2, SliderColors sliderColors) {
            super(3);
            z = z2;
            sliderColors = sliderColors;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(SliderState sliderState, Composer composer, Integer num) {
            invoke(sliderState, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(SliderState sliderState, Composer composer, int i2) {
            ComposerKt.sourceInformation(composer, "C267@12618L68:Slider.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2083675534, i2, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:267)");
            }
            int i3 = (i2 + 14) - (i2 | 14);
            SliderDefaults.INSTANCE.m2512Track4EFweAY(sliderState, (Modifier) null, z, sliderColors, (Function2<? super DrawScope, ? super Offset, Unit>) null, (Function3<? super DrawScope, ? super Offset, ? super Color, Unit>) null, 0.0f, 0.0f, composer, (i3 + 100663296) - (i3 & 100663296), 242);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public static final void Slider(float f2, Function1<? super Float, Unit> function1, Modifier modifier, boolean z2, Function0<Unit> function0, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, int i2, Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function3, Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function32, ClosedFloatingPointRange<Float> closedFloatingPointRange, Composer composer, int i3, int i4, int i5) {
        int i6;
        int i7;
        ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo = closedFloatingPointRange;
        ComposableLambda composableLambdaRememberComposableLambda = function32;
        ComposableLambda composableLambdaRememberComposableLambda2 = function3;
        int i8 = i2;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        SliderColors sliderColorsColors = sliderColors;
        Function0<Unit> function02 = function0;
        boolean z3 = z2;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(1191170377);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Slider)P(9,4,3,1,5)256@12184L8,257@12244L39,259@12372L157,266@12578L114,272@12779L92,278@12998L184:Slider.kt#uh7d8r");
        if ((i5 + 1) - (i5 | 1) != 0) {
            i6 = i3 | 6;
        } else if ((-1) - (((-1) - i3) | ((-1) - 6)) == 0) {
            int i9 = composerStartRestartGroup.changed(f2) ? 4 : 2;
            i6 = (i9 + i3) - (i9 & i3);
        } else {
            i6 = i3;
        }
        if ((i5 & 2) != 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - 48));
        } else if ((i3 & 48) == 0) {
            int i10 = composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
            i6 = (i6 + i10) - (i6 & i10);
        }
        int i11 = (-1) - (((-1) - i5) | ((-1) - 4));
        if (i11 != 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((-1) - (((-1) - i3) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i6 |= composerStartRestartGroup.changed(companion) ? 256 : 128;
        }
        int i12 = i5 & 8;
        if (i12 != 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - 3072));
        } else if ((i3 & 3072) == 0) {
            int i13 = composerStartRestartGroup.changed(z3) ? 2048 : 1024;
            i6 = (i6 + i13) - (i6 & i13);
        }
        int i14 = (-1) - (((-1) - i5) | ((-1) - 16));
        if (i14 != 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - 24576));
        } else if ((i3 + 24576) - (i3 | 24576) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192;
        }
        if ((-1) - (((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) | ((-1) - i3)) == 0) {
            int i15 = ((i5 & 32) == 0 && composerStartRestartGroup.changed(sliderColorsColors)) ? 131072 : 65536;
            i6 = (i6 + i15) - (i6 & i15);
        }
        int i16 = i5 & 64;
        if (i16 != 0) {
            i6 |= 1572864;
        } else if ((i3 + 1572864) - (i3 | 1572864) == 0) {
            i6 |= composerStartRestartGroup.changed(mutableInteractionSource2) ? 1048576 : 524288;
        }
        int i17 = (i5 + 128) - (i5 | 128);
        if (i17 != 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - 12582912));
        } else if ((i3 + 12582912) - (i3 | 12582912) == 0) {
            i6 |= composerStartRestartGroup.changed(i8) ? 8388608 : 4194304;
        }
        int i18 = (i5 + 256) - (i5 | 256);
        if (i18 != 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - 100663296));
        } else if ((-1) - (((-1) - i3) | ((-1) - 100663296)) == 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - (composerStartRestartGroup.changedInstance(composableLambdaRememberComposableLambda2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432)));
        }
        int i19 = i5 & 512;
        if (i19 != 0) {
            i6 = (i6 + 805306368) - (i6 & 805306368);
        } else if ((i3 + 805306368) - (i3 | 805306368) == 0) {
            int i20 = composerStartRestartGroup.changedInstance(composableLambdaRememberComposableLambda) ? 536870912 : 268435456;
            i6 = (i6 + i20) - (i6 & i20);
        }
        if ((i4 & 6) == 0) {
            i7 = (-1) - (((-1) - i4) & ((-1) - (((i5 + 1024) - (i5 | 1024) == 0 && composerStartRestartGroup.changed(closedFloatingPointRangeRangeTo)) ? 4 : 2)));
        } else {
            i7 = i4;
        }
        if ((i6 & 306783379) == 306783378 && (-1) - (((-1) - i7) | ((-1) - 3)) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i3 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i11 != 0) {
                    companion = Modifier.Companion;
                }
                if (i12 != 0) {
                    z3 = true;
                }
                if (i14 != 0) {
                    function02 = null;
                }
                if ((i5 + 32) - (i5 | 32) != 0) {
                    sliderColorsColors = SliderDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                    i6 &= -458753;
                }
                if (i16 != 0) {
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -403537365, "CC(remember):Slider.kt#9igjgp");
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                }
                if (i17 != 0) {
                    i8 = 0;
                }
                if (i18 != 0) {
                    composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(-1756326375, true, new Function3<SliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt.Slider.6
                        final /* synthetic */ SliderColors $colors;
                        final /* synthetic */ boolean $enabled;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass6(SliderColors sliderColorsColors2, boolean z32) {
                            super(3);
                            sliderColors = sliderColorsColors2;
                            z = z32;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(SliderState sliderState, Composer composer2, Integer num) {
                            invoke(sliderState, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(SliderState sliderState, Composer composer2, int i22) {
                            ComposerKt.sourceInformation(composer2, "C260@12397L126:Slider.kt#uh7d8r");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1756326375, i22, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:260)");
                            }
                            SliderDefaults.INSTANCE.m2510Thumb9LiSoMs(mutableInteractionSource, null, sliderColors, z, 0L, composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54);
                }
                if (i19 != 0) {
                    composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(2083675534, true, new Function3<SliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt.Slider.7
                        final /* synthetic */ SliderColors $colors;
                        final /* synthetic */ boolean $enabled;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C06857(boolean z32, SliderColors sliderColorsColors2) {
                            super(3);
                            z = z32;
                            sliderColors = sliderColorsColors2;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(SliderState sliderState, Composer composer2, Integer num) {
                            invoke(sliderState, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(SliderState sliderState, Composer composer2, int i22) {
                            ComposerKt.sourceInformation(composer2, "C267@12618L68:Slider.kt#uh7d8r");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2083675534, i22, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:267)");
                            }
                            int i32 = (i22 + 14) - (i22 | 14);
                            SliderDefaults.INSTANCE.m2512Track4EFweAY(sliderState, (Modifier) null, z, sliderColors, (Function2<? super DrawScope, ? super Offset, Unit>) null, (Function3<? super DrawScope, ? super Offset, ? super Color, Unit>) null, 0.0f, 0.0f, composer2, (i32 + 100663296) - (i32 & 100663296), 242);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54);
                }
                if ((i5 & 1024) != 0) {
                    closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                    i7 = (i7 - 15) - (i7 | (-15));
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i5 & 32) != 0) {
                    i6 &= -458753;
                }
                if ((i5 + 1024) - (i5 | 1024) != 0) {
                    i7 = (i7 - 15) - (i7 | (-15));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1191170377, i6, i7, "androidx.compose.material3.Slider (Slider.kt:270)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -403520192, "CC(remember):Slider.kt#9igjgp");
            int i21 = (29360128 + i6) - (29360128 | i6) == 8388608 ? 1 : 0;
            int i22 = (((((i7 + 14) - (14 | i7)) ^ 6) > 4 && composerStartRestartGroup.changed(closedFloatingPointRangeRangeTo)) || (-1) - (((-1) - i7) | ((-1) - 6)) == 4) ? 1 : 0;
            int i23 = (i21 + i22) - (i21 & i22);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (i23 != 0 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new SliderState(f2, i8, function02, closedFloatingPointRangeRangeTo);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            SliderState sliderState = (SliderState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            sliderState.setOnValueChangeFinished(function02);
            sliderState.setOnValueChange$material3_release(function1);
            sliderState.setValue(f2);
            int i24 = (-1) - (((-1) - ((i6 >> 3) & 1008)) & ((-1) - ((-1) - (((-1) - (i6 >> 6)) | ((-1) - 57344)))));
            int i25 = i6 >> 9;
            int i26 = (458752 + i25) - (458752 | i25);
            Slider(sliderState, companion, z32, null, mutableInteractionSource2, composableLambdaRememberComposableLambda2, composableLambdaRememberComposableLambda, composerStartRestartGroup, (-1) - (((-1) - ((i24 + i26) - (i24 & i26))) & ((-1) - ((-1) - (((-1) - i25) | ((-1) - 3670016))))), 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt.Slider.8
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$changed1;
                final /* synthetic */ int $$default;
                final /* synthetic */ SliderColors $colors;
                final /* synthetic */ boolean $enabled;
                final /* synthetic */ MutableInteractionSource $interactionSource;
                final /* synthetic */ Modifier $modifier;
                final /* synthetic */ Function1<Float, Unit> $onValueChange;
                final /* synthetic */ Function0<Unit> $onValueChangeFinished;
                final /* synthetic */ int $steps;
                final /* synthetic */ Function3<SliderState, Composer, Integer, Unit> $thumb;
                final /* synthetic */ Function3<SliderState, Composer, Integer, Unit> $track;
                final /* synthetic */ float $value;
                final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C06868(float f22, Function1<? super Float, Unit> function12, Modifier companion2, boolean z32, Function0<Unit> function022, SliderColors sliderColorsColors2, MutableInteractionSource mutableInteractionSource22, int i82, Function3<? super SliderState, ? super Composer, ? super Integer, Unit> composableLambdaRememberComposableLambda22, Function3<? super SliderState, ? super Composer, ? super Integer, Unit> composableLambdaRememberComposableLambda3, ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo2, int i32, int i42, int i52) {
                    super(2);
                    f = f22;
                    function1 = function12;
                    modifier = companion2;
                    z = z32;
                    function0 = function022;
                    sliderColors = sliderColorsColors2;
                    mutableInteractionSource = mutableInteractionSource22;
                    i = i82;
                    function3 = composableLambdaRememberComposableLambda22;
                    function3 = composableLambdaRememberComposableLambda3;
                    closedFloatingPointRange = closedFloatingPointRangeRangeTo2;
                    i = i32;
                    i = i42;
                    i = i52;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i27) {
                    SliderKt.Slider(f, function1, modifier, z, function0, sliderColors, mutableInteractionSource, i, function3, function3, closedFloatingPointRange, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))), RecomposeScopeImplKt.updateChangedFlags(i), i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$Slider$10 */
    /* JADX INFO: compiled from: Slider.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass10 extends Lambda implements Function3<SliderState, Composer, Integer, Unit> {
        final /* synthetic */ SliderColors $colors;
        final /* synthetic */ boolean $enabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass10(SliderColors sliderColors, boolean z2) {
            super(3);
            sliderColors = sliderColors;
            z = z2;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(SliderState sliderState, Composer composer, Integer num) {
            invoke(sliderState, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(SliderState sliderState, Composer composer, int i2) {
            ComposerKt.sourceInformation(composer, "C342@15855L126:Slider.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1426271326, i2, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:342)");
            }
            SliderDefaults.INSTANCE.m2510Thumb9LiSoMs(mutableInteractionSource, null, sliderColors, z, 0L, composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$Slider$11 */
    /* JADX INFO: compiled from: Slider.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C068111 extends Lambda implements Function3<SliderState, Composer, Integer, Unit> {
        final /* synthetic */ SliderColors $colors;
        final /* synthetic */ boolean $enabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C068111(boolean z2, SliderColors sliderColors) {
            super(3);
            z = z2;
            sliderColors = sliderColors;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(SliderState sliderState, Composer composer, Integer num) {
            invoke(sliderState, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(SliderState sliderState, Composer composer, int i2) {
            ComposerKt.sourceInformation(composer, "C349@16076L68:Slider.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(577038345, i2, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:349)");
            }
            int i3 = (-1) - (((-1) - i2) | ((-1) - 14));
            SliderDefaults.INSTANCE.m2512Track4EFweAY(sliderState, (Modifier) null, z, sliderColors, (Function2<? super DrawScope, ? super Offset, Unit>) null, (Function3<? super DrawScope, ? super Offset, ? super Color, Unit>) null, 0.0f, 0.0f, composer, (i3 + 100663296) - (i3 & 100663296), 242);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public static final void Slider(SliderState sliderState, Modifier modifier, boolean z2, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function3, Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function32, Composer composer, int i2, int i3) {
        int i4;
        ComposableLambda composableLambdaRememberComposableLambda = function32;
        ComposableLambda composableLambdaRememberComposableLambda2 = function3;
        SliderColors sliderColorsColors = sliderColors;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        boolean z3 = z2;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1303883986);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Slider)P(4,3,1)339@15682L8,340@15742L39,341@15830L157,348@16036L114,354@16217L188:Slider.kt#uh7d8r");
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            i4 = (i2 + 6) - (i2 & 6);
        } else if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            i4 = (-1) - (((-1) - (composerStartRestartGroup.changedInstance(sliderState) ? 4 : 2)) & ((-1) - i2));
        } else {
            i4 = i2;
        }
        int i5 = (-1) - (((-1) - i3) | ((-1) - 2));
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            int i6 = composerStartRestartGroup.changed(companion) ? 32 : 16;
            i4 = (i4 + i6) - (i4 & i6);
        }
        int i7 = (-1) - (((-1) - i3) | ((-1) - 4));
        if (i7 != 0) {
            i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i2 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 |= composerStartRestartGroup.changed(z3) ? 256 : 128;
        }
        if ((i2 + 3072) - (i2 | 3072) == 0) {
            i4 |= ((i3 + 8) - (i3 | 8) == 0 && composerStartRestartGroup.changed(sliderColorsColors)) ? 2048 : 1024;
        }
        int i8 = i3 & 16;
        if (i8 != 0) {
            i4 = (i4 + 24576) - (i4 & 24576);
        } else if ((i2 + 24576) - (i2 | 24576) == 0) {
            int i9 = composerStartRestartGroup.changed(mutableInteractionSource2) ? 16384 : 8192;
            i4 = (i4 + i9) - (i4 & i9);
        }
        int i10 = (i3 + 32) - (i3 | 32);
        if (i10 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE));
        } else if ((ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE + i2) - (196608 | i2) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(composableLambdaRememberComposableLambda2) ? 131072 : 65536)));
        }
        int i11 = (i3 + 64) - (i3 | 64);
        if (i11 != 0) {
            i4 |= 1572864;
        } else if ((1572864 + i2) - (1572864 | i2) == 0) {
            int i12 = composerStartRestartGroup.changedInstance(composableLambdaRememberComposableLambda) ? 1048576 : 524288;
            i4 = (i4 + i12) - (i4 & i12);
        }
        if ((i4 & 599187) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    companion = Modifier.Companion;
                }
                if (i7 != 0) {
                    z3 = true;
                }
                if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
                    sliderColorsColors = SliderDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                    i4 = (i4 - 7169) - (i4 | (-7169));
                }
                if (i8 != 0) {
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -403425429, "CC(remember):Slider.kt#9igjgp");
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                }
                if (i10 != 0) {
                    composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(1426271326, true, new Function3<SliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt.Slider.10
                        final /* synthetic */ SliderColors $colors;
                        final /* synthetic */ boolean $enabled;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass10(SliderColors sliderColorsColors2, boolean z32) {
                            super(3);
                            sliderColors = sliderColorsColors2;
                            z = z32;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(SliderState sliderState2, Composer composer2, Integer num) {
                            invoke(sliderState2, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(SliderState sliderState2, Composer composer2, int i22) {
                            ComposerKt.sourceInformation(composer2, "C342@15855L126:Slider.kt#uh7d8r");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1426271326, i22, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:342)");
                            }
                            SliderDefaults.INSTANCE.m2510Thumb9LiSoMs(mutableInteractionSource, null, sliderColors, z, 0L, composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54);
                }
                if (i11 != 0) {
                    composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(577038345, true, new Function3<SliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt.Slider.11
                        final /* synthetic */ SliderColors $colors;
                        final /* synthetic */ boolean $enabled;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C068111(boolean z32, SliderColors sliderColorsColors2) {
                            super(3);
                            z = z32;
                            sliderColors = sliderColorsColors2;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(SliderState sliderState2, Composer composer2, Integer num) {
                            invoke(sliderState2, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(SliderState sliderState2, Composer composer2, int i22) {
                            ComposerKt.sourceInformation(composer2, "C349@16076L68:Slider.kt#uh7d8r");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(577038345, i22, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:349)");
                            }
                            int i32 = (-1) - (((-1) - i22) | ((-1) - 14));
                            SliderDefaults.INSTANCE.m2512Track4EFweAY(sliderState2, (Modifier) null, z, sliderColors, (Function2<? super DrawScope, ? super Offset, Unit>) null, (Function3<? super DrawScope, ? super Offset, ? super Color, Unit>) null, 0.0f, 0.0f, composer2, (i32 + 100663296) - (i32 & 100663296), 242);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54);
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 & 8) != 0) {
                    i4 = (i4 - 7169) - (i4 | (-7169));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1303883986, i4, -1, "androidx.compose.material3.Slider (Slider.kt:351)");
            }
            if (sliderState.getSteps() < 0) {
                throw new IllegalArgumentException("steps should be >= 0".toString());
            }
            int i13 = i4 >> 3;
            int i14 = ((-1) - (((-1) - ((-1) - (((-1) - ((i4 + 896) - (i4 | 896))) & ((-1) - ((i13 & 14) | ((i4 << 3) & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)))))) & ((-1) - ((-1) - (((-1) - i13) | ((-1) - 7168)))))) | (57344 & i13);
            int i15 = i13 & 458752;
            SliderImpl(companion, sliderState, z32, mutableInteractionSource2, composableLambdaRememberComposableLambda2, composableLambdaRememberComposableLambda, composerStartRestartGroup, (i14 + i15) - (i14 & i15));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            boolean z4 = z32;
            Modifier modifier2 = companion;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt.Slider.13
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ SliderColors $colors;
                final /* synthetic */ boolean $enabled;
                final /* synthetic */ MutableInteractionSource $interactionSource;
                final /* synthetic */ Modifier $modifier;
                final /* synthetic */ Function3<SliderState, Composer, Integer, Unit> $thumb;
                final /* synthetic */ Function3<SliderState, Composer, Integer, Unit> $track;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass13(Modifier modifier22, boolean z42, SliderColors sliderColorsColors2, MutableInteractionSource mutableInteractionSource22, Function3<? super SliderState, ? super Composer, ? super Integer, Unit> composableLambdaRememberComposableLambda22, Function3<? super SliderState, ? super Composer, ? super Integer, Unit> composableLambdaRememberComposableLambda3, int i22, int i32) {
                    super(2);
                    modifier = modifier22;
                    z = z42;
                    sliderColors = sliderColorsColors2;
                    mutableInteractionSource = mutableInteractionSource22;
                    function3 = composableLambdaRememberComposableLambda22;
                    function3 = composableLambdaRememberComposableLambda3;
                    i = i22;
                    i = i32;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    SliderState sliderState2 = sliderState;
                    Modifier modifier3 = modifier;
                    boolean z22 = z;
                    SliderColors sliderColors2 = sliderColors;
                    MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource;
                    Function3<SliderState, Composer, Integer, Unit> function33 = function3;
                    Function3<SliderState, Composer, Integer, Unit> function322 = function3;
                    int i32 = i;
                    SliderKt.Slider(sliderState2, modifier3, z22, sliderColors2, mutableInteractionSource3, function33, function322, composer2, RecomposeScopeImplKt.updateChangedFlags((i32 + 1) - (i32 & 1)), i);
                }
            });
        }
    }

    public static final void RangeSlider(ClosedFloatingPointRange<Float> closedFloatingPointRange, Function1<? super ClosedFloatingPointRange<Float>, Unit> function1, Modifier modifier, boolean z2, ClosedFloatingPointRange<Float> closedFloatingPointRange2, int i2, Function0<Unit> function0, SliderColors sliderColors, Composer composer, int i3, int i4) {
        int i5;
        SliderColors sliderColorsColors = sliderColors;
        int i6 = i2;
        ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
        boolean z3 = z2;
        Function0<Unit> function02 = function0;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-743091416);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(RangeSlider)P(6,3,2,1,7,5,4)408@18812L8,410@18884L39,411@18981L39,423@19399L186,430@19606L184,437@19808L199,413@19026L987:Slider.kt#uh7d8r");
        if ((i4 & 1) != 0) {
            i5 = (i3 + 6) - (i3 & 6);
        } else if ((i3 + 6) - (i3 | 6) == 0) {
            i5 = (-1) - (((-1) - (composerStartRestartGroup.changed(closedFloatingPointRange) ? 4 : 2)) & ((-1) - i3));
        } else {
            i5 = i3;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i3 + 48) - (i3 | 48) == 0) {
            int i7 = composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
            i5 = (i5 + i7) - (i5 & i7);
        }
        int i8 = i4 & 4;
        if (i8 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((-1) - (((-1) - i3) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            int i9 = composerStartRestartGroup.changed(companion) ? 256 : 128;
            i5 = (i5 + i9) - (i5 & i9);
        }
        int i10 = i4 & 8;
        if (i10 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 3072));
        } else if ((-1) - (((-1) - i3) | ((-1) - 3072)) == 0) {
            i5 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (((i4 + 16) - (i4 | 16) == 0 && composerStartRestartGroup.changed(closedFloatingPointRangeRangeTo)) ? 16384 : 8192)));
        }
        int i11 = i4 & 32;
        if (i11 != 0) {
            i5 = (i5 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i5 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        } else if ((-1) - (((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) | ((-1) - i3)) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(i6) ? 131072 : 65536)));
        }
        int i12 = (i4 + 64) - (i4 | 64);
        if (i12 != 0) {
            i5 |= 1572864;
        } else if ((1572864 & i3) == 0) {
            int i13 = composerStartRestartGroup.changedInstance(function02) ? 1048576 : 524288;
            i5 = (i5 + i13) - (i5 & i13);
        }
        if ((i3 & 12582912) == 0) {
            int i14 = ((-1) - (((-1) - i4) | ((-1) - 128)) == 0 && composerStartRestartGroup.changed(sliderColorsColors)) ? 8388608 : 4194304;
            i5 = (i5 + i14) - (i5 & i14);
        }
        if ((-1) - (((-1) - i5) | ((-1) - 4793491)) != 4793490 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i3 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i8 != 0) {
                    companion = Modifier.Companion;
                }
                if (i10 != 0) {
                    z3 = true;
                }
                if ((i4 + 16) - (i4 | 16) != 0) {
                    closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-57345)));
                }
                if (i11 != 0) {
                    i6 = 0;
                }
                if (i12 != 0) {
                    function02 = null;
                }
                if ((i4 + 128) - (i4 | 128) != 0) {
                    sliderColorsColors = SliderDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                    i5 = (i5 - 29360129) - (i5 | (-29360129));
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i4 + 16) - (i4 | 16) != 0) {
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-57345)));
                }
                if ((i4 + 128) - (i4 | 128) != 0) {
                    i5 = (i5 - 29360129) - (i5 | (-29360129));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-743091416, i5, -1, "androidx.compose.material3.RangeSlider (Slider.kt:409)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1661051042, "CC(remember):Slider.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1661054146, "CC(remember):Slider.kt#9igjgp");
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableInteractionSource mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-811582901, true, new Function3<RangeSliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt.RangeSlider.1
                final /* synthetic */ SliderColors $colors;
                final /* synthetic */ boolean $enabled;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(SliderColors sliderColorsColors2, boolean z32) {
                    super(3);
                    sliderColors = sliderColorsColors2;
                    z = z32;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer2, Integer num) {
                    invoke(rangeSliderState, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RangeSliderState rangeSliderState, Composer composer2, int i15) {
                    ComposerKt.sourceInformation(composer2, "C424@19428L147:Slider.kt#uh7d8r");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-811582901, i15, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:424)");
                    }
                    SliderDefaults.INSTANCE.m2510Thumb9LiSoMs(mutableInteractionSource, null, sliderColors, z, 0L, composer2, 196614, 18);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54);
            ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(-1832060001, true, new Function3<RangeSliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt.RangeSlider.2
                final /* synthetic */ SliderColors $colors;
                final /* synthetic */ boolean $enabled;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(SliderColors sliderColorsColors2, boolean z32) {
                    super(3);
                    sliderColors = sliderColorsColors2;
                    z = z32;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer2, Integer num) {
                    invoke(rangeSliderState, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RangeSliderState rangeSliderState, Composer composer2, int i15) {
                    ComposerKt.sourceInformation(composer2, "C431@19635L145:Slider.kt#uh7d8r");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1832060001, i15, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:431)");
                    }
                    SliderDefaults.INSTANCE.m2510Thumb9LiSoMs(mutableInteractionSource, null, sliderColors, z, 0L, composer2, 196614, 18);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54);
            ComposableLambda composableLambdaRememberComposableLambda3 = ComposableLambdaKt.rememberComposableLambda(377064480, true, new Function3<RangeSliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt.RangeSlider.3
                final /* synthetic */ SliderColors $colors;
                final /* synthetic */ boolean $enabled;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(boolean z32, SliderColors sliderColorsColors2) {
                    super(3);
                    z = z32;
                    sliderColors = sliderColorsColors2;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer2, Integer num) {
                    invoke(rangeSliderState, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RangeSliderState rangeSliderState, Composer composer2, int i15) {
                    ComposerKt.sourceInformation(composer2, "C438@19857L140:Slider.kt#uh7d8r");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(377064480, i15, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:438)");
                    }
                    SliderDefaults.INSTANCE.m2511Track4EFweAY(rangeSliderState, (Modifier) null, z, sliderColors, (Function2<? super DrawScope, ? super Offset, Unit>) null, (Function3<? super DrawScope, ? super Offset, ? super Color, Unit>) null, 0.0f, 0.0f, composer2, (i15 & 14) | 100663296, 242);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54);
            int i15 = ((-1) - (((-1) - (((-1) - (((-1) - ((-1) - (((-1) - ((i5 + 14) - (14 | i5))) & ((-1) - 918552576)))) & ((-1) - ((-1) - (((-1) - i5) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)))))) | ((i5 + 896) - (896 | i5)))) & ((-1) - (7168 & i5)))) | ((-1) - (((-1) - 57344) | ((-1) - i5)));
            int i16 = (-1) - (((-1) - (i5 >> 3)) | ((-1) - 458752));
            RangeSlider(closedFloatingPointRange, function1, companion, z32, closedFloatingPointRangeRangeTo, function02, null, mutableInteractionSource, mutableInteractionSource2, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, composableLambdaRememberComposableLambda3, i6, composerStartRestartGroup, (i15 + i16) - (i15 & i16), ((-1) - (((-1) - (i5 >> 9)) | ((-1) - 896))) | 54, 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt.RangeSlider.4
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ SliderColors $colors;
                final /* synthetic */ boolean $enabled;
                final /* synthetic */ Modifier $modifier;
                final /* synthetic */ Function1<ClosedFloatingPointRange<Float>, Unit> $onValueChange;
                final /* synthetic */ Function0<Unit> $onValueChangeFinished;
                final /* synthetic */ int $steps;
                final /* synthetic */ ClosedFloatingPointRange<Float> $value;
                final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass4(ClosedFloatingPointRange<Float> closedFloatingPointRange3, Function1<? super ClosedFloatingPointRange<Float>, Unit> function12, Modifier companion2, boolean z32, ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo2, int i62, Function0<Unit> function022, SliderColors sliderColorsColors2, int i32, int i42) {
                    super(2);
                    closedFloatingPointRange = closedFloatingPointRange3;
                    function1 = function12;
                    modifier = companion2;
                    z = z32;
                    closedFloatingPointRange = closedFloatingPointRangeRangeTo2;
                    i = i62;
                    function0 = function022;
                    sliderColors = sliderColorsColors2;
                    i = i32;
                    i = i42;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    SliderKt.RangeSlider(closedFloatingPointRange, function1, modifier, z, closedFloatingPointRange, i, function0, sliderColors, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))), i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$RangeSlider$1 */
    /* JADX INFO: compiled from: Slider.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,i\bӵLc\u000b\u0004I\u00066\u000b<Ȑ\u0017\"Z\u0011(\u000btjQ0rf\u000f7ʂW,\u0015m\n7"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006c!>[}\u000e>q\u0015.Z1JgC\u001ej", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u00121b\u007f %t\u001a-MP)z0-\u0015>H5\u0010b9Xz&Z\u0016L6d]|K\u0014[g\u001eW:\u0011\rY\u000b\u0002xLB)\u0016,VW\u001f,q"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function3<RangeSliderState, Composer, Integer, Unit> {
        final /* synthetic */ SliderColors $colors;
        final /* synthetic */ boolean $enabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SliderColors sliderColorsColors2, boolean z32) {
            super(3);
            sliderColors = sliderColorsColors2;
            z = z32;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer2, Integer num) {
            invoke(rangeSliderState, composer2, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RangeSliderState rangeSliderState, Composer composer2, int i15) {
            ComposerKt.sourceInformation(composer2, "C424@19428L147:Slider.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-811582901, i15, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:424)");
            }
            SliderDefaults.INSTANCE.m2510Thumb9LiSoMs(mutableInteractionSource, null, sliderColors, z, 0L, composer2, 196614, 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$RangeSlider$2 */
    /* JADX INFO: compiled from: Slider.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,i\bӵLc\u000b\u0004I\u00066\u000b<Ȑ\u0017\"Z\u0011(\u000btjQ0rf\u000f7ʂW,\u0015m\n7"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006c!>[}\u000e>q\u0015.Z1JgC\u001ej", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u00121b\u007f %t\u001a-MP)z0-\u0015>H5\u0010b9Xz&Z\u0016L6d]|K\u0014[g\u001eW:\u0011\rY\u000b\u0002xLB)\u0016,VW\u001f,q"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function3<RangeSliderState, Composer, Integer, Unit> {
        final /* synthetic */ SliderColors $colors;
        final /* synthetic */ boolean $enabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(SliderColors sliderColorsColors2, boolean z32) {
            super(3);
            sliderColors = sliderColorsColors2;
            z = z32;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer2, Integer num) {
            invoke(rangeSliderState, composer2, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RangeSliderState rangeSliderState, Composer composer2, int i15) {
            ComposerKt.sourceInformation(composer2, "C431@19635L145:Slider.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1832060001, i15, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:431)");
            }
            SliderDefaults.INSTANCE.m2510Thumb9LiSoMs(mutableInteractionSource, null, sliderColors, z, 0L, composer2, 196614, 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$RangeSlider$3 */
    /* JADX INFO: compiled from: Slider.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,i\bӵLc\u000b\u0004I\u00066\u000b<Ȑ\u0017\"Z\u0011(\u000btjQ0rf\u000f7ʂW,\u0015m\n7"}, d2 = {"\n`]<a@F])\rS", "", "@`]4X\u001aEW\u0018~\bL;x\u0018/", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006c!>[}\u000e>q\u0015.Z1JgC\u001ej", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u00121b\u007f %t\u001a-MP)z0-\u0015>H5\u0010b9Xz&Z\u0016L6d]|K\u0014[g\u001eW:\u0011\rY\u000b\u0002xLB)\u0016,VW\u001f,q"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass3 extends Lambda implements Function3<RangeSliderState, Composer, Integer, Unit> {
        final /* synthetic */ SliderColors $colors;
        final /* synthetic */ boolean $enabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(boolean z32, SliderColors sliderColorsColors2) {
            super(3);
            z = z32;
            sliderColors = sliderColorsColors2;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer2, Integer num) {
            invoke(rangeSliderState, composer2, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RangeSliderState rangeSliderState, Composer composer2, int i15) {
            ComposerKt.sourceInformation(composer2, "C438@19857L140:Slider.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(377064480, i15, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:438)");
            }
            SliderDefaults.INSTANCE.m2511Track4EFweAY(rangeSliderState, (Modifier) null, z, sliderColors, (Function2<? super DrawScope, ? super Offset, Unit>) null, (Function3<? super DrawScope, ? super Offset, ? super Color, Unit>) null, 0.0f, 0.0f, composer2, (i15 & 14) | 100663296, 242);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$RangeSlider$7 */
    /* JADX INFO: compiled from: Slider.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass7 extends Lambda implements Function3<RangeSliderState, Composer, Integer, Unit> {
        final /* synthetic */ SliderColors $colors;
        final /* synthetic */ boolean $enabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass7(SliderColors sliderColors, boolean z2) {
            super(3);
            sliderColors = sliderColors;
            z = z2;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer, Integer num) {
            invoke(rangeSliderState, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RangeSliderState rangeSliderState, Composer composer, int i2) {
            ComposerKt.sourceInformation(composer, "C515@24032L131:Slider.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1963073082, i2, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:515)");
            }
            SliderDefaults.INSTANCE.m2510Thumb9LiSoMs(mutableInteractionSource, null, sliderColors, z, 0L, composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$RangeSlider$8 */
    /* JADX INFO: compiled from: Slider.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass8 extends Lambda implements Function3<RangeSliderState, Composer, Integer, Unit> {
        final /* synthetic */ SliderColors $colors;
        final /* synthetic */ boolean $enabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass8(SliderColors sliderColors, boolean z2) {
            super(3);
            sliderColors = sliderColors;
            z = z2;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer, Integer num) {
            invoke(rangeSliderState, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RangeSliderState rangeSliderState, Composer composer, int i2) {
            ComposerKt.sourceInformation(composer, "C522@24251L129:Slider.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1908709951, i2, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:522)");
            }
            SliderDefaults.INSTANCE.m2510Thumb9LiSoMs(mutableInteractionSource, null, sliderColors, z, 0L, composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$RangeSlider$9 */
    /* JADX INFO: compiled from: Slider.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass9 extends Lambda implements Function3<RangeSliderState, Composer, Integer, Unit> {
        final /* synthetic */ SliderColors $colors;
        final /* synthetic */ boolean $enabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass9(boolean z2, SliderColors sliderColors) {
            super(3);
            z = z2;
            sliderColors = sliderColors;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer, Integer num) {
            invoke(rangeSliderState, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RangeSliderState rangeSliderState, Composer composer, int i2) {
            ComposerKt.sourceInformation(composer, "C529@24485L124:Slider.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-429193201, i2, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:529)");
            }
            SliderDefaults.INSTANCE.m2511Track4EFweAY(rangeSliderState, (Modifier) null, z, sliderColors, (Function2<? super DrawScope, ? super Offset, Unit>) null, (Function3<? super DrawScope, ? super Offset, ? super Color, Unit>) null, 0.0f, 0.0f, composer, ((-1) - (((-1) - i2) | ((-1) - 14))) | 100663296, 242);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public static final void RangeSlider(ClosedFloatingPointRange<Float> closedFloatingPointRange, final Function1<? super ClosedFloatingPointRange<Float>, Unit> function1, Modifier modifier, boolean z2, ClosedFloatingPointRange<Float> closedFloatingPointRange2, Function0<Unit> function0, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function3, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function32, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function33, int i2, Composer composer, int i3, int i4, int i5) {
        int i6;
        int i7;
        boolean z3;
        int i8 = i2;
        ComposableLambda composableLambdaRememberComposableLambda = function33;
        ComposableLambda composableLambdaRememberComposableLambda2 = function32;
        ComposableLambda composableLambdaRememberComposableLambda3 = function3;
        MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
        MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource;
        SliderColors sliderColorsColors = sliderColors;
        Function0<Unit> function02 = function0;
        ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
        boolean z4 = z2;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1048796133);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(RangeSlider)P(11,5,4,1,12,6!1,7!1,8!1,10)511@23750L8,512@23815L39,513@23909L39,514@24007L162,521@24226L160,528@24440L175,538@24684L237,549@25005L44,553@25142L291:Slider.kt#uh7d8r");
        if ((-1) - (((-1) - i5) | ((-1) - 1)) != 0) {
            i6 = (-1) - (((-1) - i3) & ((-1) - 6));
        } else if ((-1) - (((-1) - i3) | ((-1) - 6)) == 0) {
            int i9 = composerStartRestartGroup.changed(closedFloatingPointRange) ? 4 : 2;
            i6 = (i9 + i3) - (i9 & i3);
        } else {
            i6 = i3;
        }
        if ((-1) - (((-1) - i5) | ((-1) - 2)) != 0) {
            i6 |= 48;
        } else if ((-1) - (((-1) - i3) | ((-1) - 48)) == 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - (composerStartRestartGroup.changedInstance(function1) ? 32 : 16)));
        }
        int i10 = (-1) - (((-1) - i5) | ((-1) - 4));
        if (i10 != 0) {
            i6 = (i6 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i6 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((i3 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i3 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            int i11 = composerStartRestartGroup.changed(companion) ? 256 : 128;
            i6 = (i6 + i11) - (i6 & i11);
        }
        int i12 = (i5 + 8) - (i5 | 8);
        if (i12 != 0) {
            i6 |= 3072;
        } else if ((-1) - (((-1) - i3) | ((-1) - 3072)) == 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - (composerStartRestartGroup.changed(z4) ? 2048 : 1024)));
        }
        if ((-1) - (((-1) - i3) | ((-1) - 24576)) == 0) {
            i6 |= ((i5 & 16) == 0 && composerStartRestartGroup.changed(closedFloatingPointRangeRangeTo)) ? 16384 : 8192;
        }
        int i13 = (-1) - (((-1) - i5) | ((-1) - 32));
        if (i13 != 0) {
            i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((-1) - (((-1) - i3) | ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE)) == 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - (composerStartRestartGroup.changedInstance(function02) ? 131072 : 65536)));
        }
        if ((i3 & 1572864) == 0) {
            i6 |= ((i5 + 64) - (i5 | 64) == 0 && composerStartRestartGroup.changed(sliderColorsColors)) ? 1048576 : 524288;
        }
        int i14 = i5 & 128;
        if (i14 != 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - 12582912));
        } else if ((-1) - (((-1) - i3) | ((-1) - 12582912)) == 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - (composerStartRestartGroup.changed(mutableInteractionSource4) ? 8388608 : 4194304)));
        }
        int i15 = (i5 + 256) - (i5 | 256);
        if (i15 != 0) {
            i6 = (i6 + 100663296) - (i6 & 100663296);
        } else if ((-1) - (((-1) - i3) | ((-1) - 100663296)) == 0) {
            int i16 = composerStartRestartGroup.changed(mutableInteractionSource3) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
            i6 = (i6 + i16) - (i6 & i16);
        }
        int i17 = (i5 + 512) - (i5 | 512);
        if (i17 != 0) {
            i6 |= 805306368;
        } else if ((i3 + 805306368) - (i3 | 805306368) == 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - (composerStartRestartGroup.changedInstance(composableLambdaRememberComposableLambda3) ? 536870912 : 268435456)));
        }
        int i18 = (i5 + 1024) - (i5 | 1024);
        if (i18 != 0) {
            i7 = (i4 + 6) - (i4 & 6);
        } else if ((-1) - (((-1) - i4) | ((-1) - 6)) == 0) {
            int i19 = composerStartRestartGroup.changedInstance(composableLambdaRememberComposableLambda2) ? 4 : 2;
            i7 = (i4 + i19) - (i4 & i19);
        } else {
            i7 = i4;
        }
        int i20 = (-1) - (((-1) - i5) | ((-1) - 2048));
        if (i20 != 0) {
            i7 |= 48;
        } else if ((i4 + 48) - (i4 | 48) == 0) {
            int i21 = composerStartRestartGroup.changedInstance(composableLambdaRememberComposableLambda) ? 32 : 16;
            i7 = (i7 + i21) - (i7 & i21);
        }
        int i22 = (i5 + 4096) - (i5 | 4096);
        if (i22 != 0) {
            i7 = (i7 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i7 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((-1) - (((-1) - i4) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i7 = (-1) - (((-1) - i7) & ((-1) - (composerStartRestartGroup.changed(i8) ? 256 : 128)));
        }
        if ((-1) - (((-1) - i6) | ((-1) - 306783379)) == 306783378 && (-1) - (((-1) - i7) | ((-1) - 147)) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i3 + 1) - (i3 | 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i10 != 0) {
                    companion = Modifier.Companion;
                }
                if (i12 != 0) {
                    z4 = true;
                }
                if ((-1) - (((-1) - i5) | ((-1) - 16)) != 0) {
                    closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                    i6 = (i6 - 57345) - (i6 | (-57345));
                }
                if (i13 != 0) {
                    function02 = null;
                }
                if ((i5 & 64) != 0) {
                    sliderColorsColors = SliderDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                    i6 &= -3670017;
                }
                if (i14 != 0) {
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1661208834, "CC(remember):Slider.kt#9igjgp");
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    mutableInteractionSource4 = (MutableInteractionSource) objRememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                }
                if (i15 != 0) {
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1661211842, "CC(remember):Slider.kt#9igjgp");
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                        objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue2;
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                }
                if (i17 != 0) {
                    z3 = true;
                    composableLambdaRememberComposableLambda3 = ComposableLambdaKt.rememberComposableLambda(-1963073082, true, new Function3<RangeSliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt.RangeSlider.7
                        final /* synthetic */ SliderColors $colors;
                        final /* synthetic */ boolean $enabled;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass7(SliderColors sliderColorsColors2, boolean z42) {
                            super(3);
                            sliderColors = sliderColorsColors2;
                            z = z42;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer2, Integer num) {
                            invoke(rangeSliderState, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(RangeSliderState rangeSliderState, Composer composer2, int i23) {
                            ComposerKt.sourceInformation(composer2, "C515@24032L131:Slider.kt#uh7d8r");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1963073082, i23, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:515)");
                            }
                            SliderDefaults.INSTANCE.m2510Thumb9LiSoMs(mutableInteractionSource, null, sliderColors, z, 0L, composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54);
                } else {
                    z3 = true;
                }
                if (i18 != 0) {
                    composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(1908709951, z3, new Function3<RangeSliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt.RangeSlider.8
                        final /* synthetic */ SliderColors $colors;
                        final /* synthetic */ boolean $enabled;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass8(SliderColors sliderColorsColors2, boolean z42) {
                            super(3);
                            sliderColors = sliderColorsColors2;
                            z = z42;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer2, Integer num) {
                            invoke(rangeSliderState, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(RangeSliderState rangeSliderState, Composer composer2, int i23) {
                            ComposerKt.sourceInformation(composer2, "C522@24251L129:Slider.kt#uh7d8r");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1908709951, i23, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:522)");
                            }
                            SliderDefaults.INSTANCE.m2510Thumb9LiSoMs(mutableInteractionSource, null, sliderColors, z, 0L, composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54);
                }
                if (i20 != 0) {
                    composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-429193201, z3, new Function3<RangeSliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt.RangeSlider.9
                        final /* synthetic */ SliderColors $colors;
                        final /* synthetic */ boolean $enabled;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass9(boolean z42, SliderColors sliderColorsColors2) {
                            super(3);
                            z = z42;
                            sliderColors = sliderColorsColors2;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer2, Integer num) {
                            invoke(rangeSliderState, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(RangeSliderState rangeSliderState, Composer composer2, int i23) {
                            ComposerKt.sourceInformation(composer2, "C529@24485L124:Slider.kt#uh7d8r");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-429193201, i23, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:529)");
                            }
                            SliderDefaults.INSTANCE.m2511Track4EFweAY(rangeSliderState, (Modifier) null, z, sliderColors, (Function2<? super DrawScope, ? super Offset, Unit>) null, (Function3<? super DrawScope, ? super Offset, ? super Color, Unit>) null, 0.0f, 0.0f, composer2, ((-1) - (((-1) - i23) | ((-1) - 14))) | 100663296, 242);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54);
                }
                if (i22 != 0) {
                    i8 = 0;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i5 + 16) - (i5 | 16) != 0) {
                    i6 = (i6 - 57345) - (i6 | (-57345));
                }
                if ((i5 & 64) != 0) {
                    i6 &= -3670017;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1048796133, i6, i7, "androidx.compose.material3.RangeSlider (Slider.kt:536)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1661236840, "CC(remember):Slider.kt#9igjgp");
            boolean z5 = ((-1) - (((-1) - i7) | ((-1) - 896)) == 256) | ((((57344 & i6) ^ 24576) > 16384 && composerStartRestartGroup.changed(closedFloatingPointRangeRangeTo)) || (24576 & i6) == 16384);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z5 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new RangeSliderState(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue(), i8, function02, closedFloatingPointRangeRangeTo);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            RangeSliderState rangeSliderState = (RangeSliderState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            rangeSliderState.setOnValueChangeFinished(function02);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1661246919, "CC(remember):Slider.kt#9igjgp");
            boolean z6 = (i6 & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) == 32;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z6 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = (Function1) new Function1<SliderRange, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$10$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SliderRange sliderRange) {
                        m2526invokeIf1S1O4(sliderRange.m2540unboximpl());
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke-If1S1O4, reason: not valid java name */
                    public final void m2526invokeIf1S1O4(long j2) {
                        function1.invoke(RangesKt.rangeTo(SliderRange.m2537getStartimpl(j2), SliderRange.m2536getEndInclusiveimpl(j2)));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            rangeSliderState.setOnValueChange$material3_release((Function1) objRememberedValue4);
            rangeSliderState.setActiveRangeStart(closedFloatingPointRange.getStart().floatValue());
            rangeSliderState.setActiveRangeEnd(closedFloatingPointRange.getEndInclusive().floatValue());
            int i23 = (-1) - (((-1) - (i6 >> 3)) | ((-1) - 1008));
            int i24 = i6 >> 9;
            int i25 = 57344 & i24;
            int i26 = (-1) - (((-1) - ((i24 + 3670016) - (i24 | 3670016))) & ((-1) - ((-1) - (((-1) - ((i23 + i25) - (i23 & i25))) & ((-1) - ((-1) - (((-1) - 458752) | ((-1) - i24))))))));
            int i27 = i7 << 21;
            int i28 = 29360128 & i27;
            int i29 = (i26 + i28) - (i26 & i28);
            int i30 = (-1) - (((-1) - i27) | ((-1) - 234881024));
            RangeSlider(rangeSliderState, companion, z42, null, mutableInteractionSource4, mutableInteractionSource3, composableLambdaRememberComposableLambda3, composableLambdaRememberComposableLambda2, composableLambdaRememberComposableLambda, composerStartRestartGroup, (i30 + i29) - (i30 & i29), 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt.RangeSlider.11
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$changed1;
                final /* synthetic */ int $$default;
                final /* synthetic */ SliderColors $colors;
                final /* synthetic */ boolean $enabled;
                final /* synthetic */ MutableInteractionSource $endInteractionSource;
                final /* synthetic */ Function3<RangeSliderState, Composer, Integer, Unit> $endThumb;
                final /* synthetic */ Modifier $modifier;
                final /* synthetic */ Function1<ClosedFloatingPointRange<Float>, Unit> $onValueChange;
                final /* synthetic */ Function0<Unit> $onValueChangeFinished;
                final /* synthetic */ MutableInteractionSource $startInteractionSource;
                final /* synthetic */ Function3<RangeSliderState, Composer, Integer, Unit> $startThumb;
                final /* synthetic */ int $steps;
                final /* synthetic */ Function3<RangeSliderState, Composer, Integer, Unit> $track;
                final /* synthetic */ ClosedFloatingPointRange<Float> $value;
                final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass11(ClosedFloatingPointRange<Float> closedFloatingPointRange3, final Function1<? super ClosedFloatingPointRange<Float>, Unit> function12, Modifier companion2, boolean z42, ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo2, Function0<Unit> function022, SliderColors sliderColorsColors2, MutableInteractionSource mutableInteractionSource42, MutableInteractionSource mutableInteractionSource32, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> composableLambdaRememberComposableLambda32, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> composableLambdaRememberComposableLambda22, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> composableLambdaRememberComposableLambda4, int i82, int i32, int i42, int i52) {
                    super(2);
                    closedFloatingPointRange = closedFloatingPointRange3;
                    function1 = function12;
                    modifier = companion2;
                    z = z42;
                    closedFloatingPointRange = closedFloatingPointRangeRangeTo2;
                    function0 = function022;
                    sliderColors = sliderColorsColors2;
                    mutableInteractionSource = mutableInteractionSource42;
                    mutableInteractionSource = mutableInteractionSource32;
                    function3 = composableLambdaRememberComposableLambda32;
                    function3 = composableLambdaRememberComposableLambda22;
                    function3 = composableLambdaRememberComposableLambda4;
                    i = i82;
                    i = i32;
                    i = i42;
                    i = i52;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i210) {
                    ClosedFloatingPointRange<Float> closedFloatingPointRange3 = closedFloatingPointRange;
                    Function1<ClosedFloatingPointRange<Float>, Unit> function12 = function1;
                    Modifier modifier2 = modifier;
                    boolean z22 = z;
                    ClosedFloatingPointRange<Float> closedFloatingPointRange22 = closedFloatingPointRange;
                    Function0<Unit> function03 = function0;
                    SliderColors sliderColors2 = sliderColors;
                    MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource;
                    MutableInteractionSource mutableInteractionSource22 = mutableInteractionSource;
                    Function3<RangeSliderState, Composer, Integer, Unit> function34 = function3;
                    Function3<RangeSliderState, Composer, Integer, Unit> function322 = function3;
                    Function3<RangeSliderState, Composer, Integer, Unit> function332 = function3;
                    int i32 = i;
                    int i42 = i;
                    SliderKt.RangeSlider(closedFloatingPointRange3, function12, modifier2, z22, closedFloatingPointRange22, function03, sliderColors2, mutableInteractionSource5, mutableInteractionSource22, function34, function322, function332, i32, composer2, RecomposeScopeImplKt.updateChangedFlags((i42 + 1) - (i42 & 1)), RecomposeScopeImplKt.updateChangedFlags(i), i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$RangeSlider$14 */
    /* JADX INFO: compiled from: Slider.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass14 extends Lambda implements Function3<RangeSliderState, Composer, Integer, Unit> {
        final /* synthetic */ SliderColors $colors;
        final /* synthetic */ boolean $enabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass14(SliderColors sliderColors, boolean z2) {
            super(3);
            sliderColors = sliderColors;
            z = z2;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer, Integer num) {
            invoke(rangeSliderState, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RangeSliderState rangeSliderState, Composer composer, int i2) {
            ComposerKt.sourceInformation(composer, "C620@28439L131:Slider.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1884205643, i2, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:620)");
            }
            SliderDefaults.INSTANCE.m2510Thumb9LiSoMs(mutableInteractionSource, null, sliderColors, z, 0L, composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$RangeSlider$15 */
    /* JADX INFO: compiled from: Slider.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass15 extends Lambda implements Function3<RangeSliderState, Composer, Integer, Unit> {
        final /* synthetic */ SliderColors $colors;
        final /* synthetic */ boolean $enabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass15(SliderColors sliderColors, boolean z2) {
            super(3);
            sliderColors = sliderColors;
            z = z2;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer, Integer num) {
            invoke(rangeSliderState, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RangeSliderState rangeSliderState, Composer composer, int i2) {
            ComposerKt.sourceInformation(composer, "C627@28658L129:Slider.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1016457138, i2, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:627)");
            }
            SliderDefaults.INSTANCE.m2510Thumb9LiSoMs(mutableInteractionSource, null, sliderColors, z, 0L, composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$RangeSlider$16 */
    /* JADX INFO: compiled from: Slider.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass16 extends Lambda implements Function3<RangeSliderState, Composer, Integer, Unit> {
        final /* synthetic */ SliderColors $colors;
        final /* synthetic */ boolean $enabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass16(boolean z2, SliderColors sliderColors) {
            super(3);
            z = z2;
            sliderColors = sliderColors;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer, Integer num) {
            invoke(rangeSliderState, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RangeSliderState rangeSliderState, Composer composer, int i2) {
            ComposerKt.sourceInformation(composer, "C634@28892L124:Slider.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1617375262, i2, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:634)");
            }
            SliderDefaults.INSTANCE.m2511Track4EFweAY(rangeSliderState, (Modifier) null, z, sliderColors, (Function2<? super DrawScope, ? super Offset, Unit>) null, (Function3<? super DrawScope, ? super Offset, ? super Color, Unit>) null, 0.0f, 0.0f, composer, ((i2 + 14) - (i2 | 14)) | 100663296, 242);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public static final void RangeSlider(RangeSliderState rangeSliderState, Modifier modifier, boolean z2, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function3, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function32, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function33, Composer composer, int i2, int i3) {
        int i4;
        ComposableLambda composableLambdaRememberComposableLambda = function33;
        ComposableLambda composableLambdaRememberComposableLambda2 = function32;
        ComposableLambda composableLambdaRememberComposableLambda3 = function3;
        MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
        MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource;
        SliderColors sliderColorsColors = sliderColors;
        boolean z3 = z2;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(511405654);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(RangeSlider)P(7,4,1!1,5!1,6)616@28157L8,617@28222L39,618@28316L39,619@28414L162,626@28633L160,633@28847L175,643@29089L295:Slider.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(rangeSliderState) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = (-1) - (((-1) - i3) | ((-1) - 2));
        if (i5 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 48));
        } else if ((i2 + 48) - (i2 | 48) == 0) {
            int i6 = composerStartRestartGroup.changed(companion) ? 32 : 16;
            i4 = (i4 + i6) - (i4 & i6);
        }
        int i7 = i3 & 4;
        if (i7 != 0) {
            i4 = (i4 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i4 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i4 |= composerStartRestartGroup.changed(z3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= ((-1) - (((-1) - i3) | ((-1) - 8)) == 0 && composerStartRestartGroup.changed(sliderColorsColors)) ? 2048 : 1024;
        }
        int i8 = (i3 + 16) - (i3 | 16);
        if (i8 != 0) {
            i4 |= 24576;
        } else if ((i2 + 24576) - (i2 | 24576) == 0) {
            int i9 = composerStartRestartGroup.changed(mutableInteractionSource4) ? 16384 : 8192;
            i4 = (i4 + i9) - (i4 & i9);
        }
        int i10 = (i3 + 32) - (i3 | 32);
        if (i10 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE));
        } else if ((196608 & i2) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(mutableInteractionSource3) ? 131072 : 65536)));
        }
        int i11 = i3 & 64;
        if (i11 != 0) {
            i4 |= 1572864;
        } else if ((-1) - (((-1) - i2) | ((-1) - 1572864)) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(composableLambdaRememberComposableLambda3) ? 1048576 : 524288;
        }
        int i12 = (i3 + 128) - (i3 | 128);
        if (i12 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 12582912));
        } else if ((i2 & 12582912) == 0) {
            int i13 = composerStartRestartGroup.changedInstance(composableLambdaRememberComposableLambda2) ? 8388608 : 4194304;
            i4 = (i4 + i13) - (i4 & i13);
        }
        int i14 = (i3 + 256) - (i3 | 256);
        if (i14 != 0) {
            i4 = (i4 + 100663296) - (i4 & 100663296);
        } else if ((-1) - (((-1) - i2) | ((-1) - 100663296)) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(composableLambdaRememberComposableLambda) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 38347923)) == 38347922 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 + 1) - (i2 | 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    companion = Modifier.Companion;
                }
                if (i7 != 0) {
                    z3 = true;
                }
                if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
                    sliderColorsColors = SliderDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                    i4 = (i4 - 7169) - (i4 | (-7169));
                }
                if (i8 != 0) {
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1661349858, "CC(remember):Slider.kt#9igjgp");
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    mutableInteractionSource4 = (MutableInteractionSource) objRememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                }
                if (i10 != 0) {
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1661352866, "CC(remember):Slider.kt#9igjgp");
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                        objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue2;
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                }
                if (i11 != 0) {
                    composableLambdaRememberComposableLambda3 = ComposableLambdaKt.rememberComposableLambda(1884205643, true, new Function3<RangeSliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt.RangeSlider.14
                        final /* synthetic */ SliderColors $colors;
                        final /* synthetic */ boolean $enabled;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass14(SliderColors sliderColorsColors2, boolean z32) {
                            super(3);
                            sliderColors = sliderColorsColors2;
                            z = z32;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState2, Composer composer2, Integer num) {
                            invoke(rangeSliderState2, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(RangeSliderState rangeSliderState2, Composer composer2, int i22) {
                            ComposerKt.sourceInformation(composer2, "C620@28439L131:Slider.kt#uh7d8r");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1884205643, i22, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:620)");
                            }
                            SliderDefaults.INSTANCE.m2510Thumb9LiSoMs(mutableInteractionSource, null, sliderColors, z, 0L, composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54);
                }
                if (i12 != 0) {
                    composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(1016457138, true, new Function3<RangeSliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt.RangeSlider.15
                        final /* synthetic */ SliderColors $colors;
                        final /* synthetic */ boolean $enabled;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass15(SliderColors sliderColorsColors2, boolean z32) {
                            super(3);
                            sliderColors = sliderColorsColors2;
                            z = z32;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState2, Composer composer2, Integer num) {
                            invoke(rangeSliderState2, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(RangeSliderState rangeSliderState2, Composer composer2, int i22) {
                            ComposerKt.sourceInformation(composer2, "C627@28658L129:Slider.kt#uh7d8r");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1016457138, i22, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:627)");
                            }
                            SliderDefaults.INSTANCE.m2510Thumb9LiSoMs(mutableInteractionSource, null, sliderColors, z, 0L, composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54);
                }
                if (i14 != 0) {
                    composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1617375262, true, new Function3<RangeSliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt.RangeSlider.16
                        final /* synthetic */ SliderColors $colors;
                        final /* synthetic */ boolean $enabled;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass16(boolean z32, SliderColors sliderColorsColors2) {
                            super(3);
                            z = z32;
                            sliderColors = sliderColorsColors2;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState2, Composer composer2, Integer num) {
                            invoke(rangeSliderState2, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(RangeSliderState rangeSliderState2, Composer composer2, int i22) {
                            ComposerKt.sourceInformation(composer2, "C634@28892L124:Slider.kt#uh7d8r");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1617375262, i22, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:634)");
                            }
                            SliderDefaults.INSTANCE.m2511Track4EFweAY(rangeSliderState2, (Modifier) null, z, sliderColors, (Function2<? super DrawScope, ? super Offset, Unit>) null, (Function3<? super DrawScope, ? super Offset, ? super Color, Unit>) null, 0.0f, 0.0f, composer2, ((i22 + 14) - (i22 | 14)) | 100663296, 242);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54);
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 & 8) != 0) {
                    i4 &= -7169;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(511405654, i4, -1, "androidx.compose.material3.RangeSlider (Slider.kt:640)");
            }
            if (rangeSliderState.getSteps() < 0) {
                throw new IllegalArgumentException("steps should be >= 0".toString());
            }
            int i15 = i4 >> 3;
            int i16 = i4 << 3;
            int i17 = ((-1) - (((-1) - ((-1) - (((-1) - (i4 & 896)) & ((-1) - ((-1) - (((-1) - ((i15 + 14) - (14 | i15))) & ((-1) - ((i16 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i16 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION))))))))) & ((-1) - ((i15 + 7168) - (7168 | i15))))) | (57344 & i15);
            int i18 = (458752 + i15) - (458752 | i15);
            RangeSliderImpl(companion, rangeSliderState, z32, mutableInteractionSource4, mutableInteractionSource3, composableLambdaRememberComposableLambda3, composableLambdaRememberComposableLambda2, composableLambdaRememberComposableLambda, composerStartRestartGroup, (-1) - (((-1) - ((-1) - (((-1) - ((i17 + i18) - (i17 & i18))) & ((-1) - ((3670016 + i15) - (3670016 | i15)))))) & ((-1) - ((-1) - (((-1) - i15) | ((-1) - 29360128))))));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt.RangeSlider.18
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ SliderColors $colors;
                final /* synthetic */ boolean $enabled;
                final /* synthetic */ MutableInteractionSource $endInteractionSource;
                final /* synthetic */ Function3<RangeSliderState, Composer, Integer, Unit> $endThumb;
                final /* synthetic */ Modifier $modifier;
                final /* synthetic */ MutableInteractionSource $startInteractionSource;
                final /* synthetic */ Function3<RangeSliderState, Composer, Integer, Unit> $startThumb;
                final /* synthetic */ Function3<RangeSliderState, Composer, Integer, Unit> $track;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass18(Modifier companion2, boolean z32, SliderColors sliderColorsColors2, MutableInteractionSource mutableInteractionSource42, MutableInteractionSource mutableInteractionSource32, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> composableLambdaRememberComposableLambda32, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> composableLambdaRememberComposableLambda22, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> composableLambdaRememberComposableLambda4, int i22, int i32) {
                    super(2);
                    modifier = companion2;
                    z = z32;
                    sliderColors = sliderColorsColors2;
                    mutableInteractionSource = mutableInteractionSource42;
                    mutableInteractionSource = mutableInteractionSource32;
                    function3 = composableLambdaRememberComposableLambda32;
                    function3 = composableLambdaRememberComposableLambda22;
                    function3 = composableLambdaRememberComposableLambda4;
                    i = i22;
                    i = i32;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    SliderKt.RangeSlider(rangeSliderState, modifier, z, sliderColors, mutableInteractionSource, mutableInteractionSource, function3, function3, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                }
            });
        }
    }

    public static final void SliderImpl(Modifier modifier, final SliderState sliderState, boolean z2, MutableInteractionSource mutableInteractionSource, Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function3, Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function32, Composer composer, int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1390990089);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SliderImpl)P(2,3)665@29717L7,673@30073L28,698@30935L1093,678@30197L1831:Slider.kt#uh7d8r");
        if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            int i4 = composerStartRestartGroup.changed(modifier) ? 4 : 2;
            i3 = (i4 + i2) - (i4 & i2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(sliderState) ? 32 : 16;
        }
        if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changed(z2) ? 256 : 128)));
        }
        if ((-1) - (((-1) - i2) | ((-1) - 3072)) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changed(mutableInteractionSource) ? 2048 : 1024)));
        }
        if ((i2 & 24576) == 0) {
            int i5 = composerStartRestartGroup.changedInstance(function3) ? 16384 : 8192;
            i3 = (i3 + i5) - (i3 & i5);
        }
        if ((ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE + i2) - (196608 | i2) == 0) {
            int i6 = composerStartRestartGroup.changedInstance(function32) ? 131072 : 65536;
            i3 = (i3 + i6) - (i3 & i6);
        }
        if ((-1) - (((-1) - 74899) | ((-1) - i3)) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1390990089, i3, -1, "androidx.compose.material3.SliderImpl (Slider.kt:664)");
            }
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            sliderState.setRtl$material3_release(objConsume == LayoutDirection.Rtl);
            Modifier modifierSliderTapModifier = sliderTapModifier(Modifier.Companion, sliderState, mutableInteractionSource, z2);
            Modifier.Companion companion = Modifier.Companion;
            Orientation orientation = Orientation.Horizontal;
            boolean zIsRtl$material3_release = sliderState.isRtl$material3_release();
            boolean zIsDragging$material3_release = sliderState.isDragging$material3_release();
            Modifier.Companion companion2 = companion;
            SliderState sliderState2 = sliderState;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 174725888, "CC(remember):Slider.kt#9igjgp");
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(sliderState);
            SliderKt$SliderImpl$drag$1$1 sliderKt$SliderImpl$drag$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || sliderKt$SliderImpl$drag$1$1RememberedValue == Composer.Companion.getEmpty()) {
                sliderKt$SliderImpl$drag$1$1RememberedValue = new SliderKt$SliderImpl$drag$1$1(sliderState, null);
                composerStartRestartGroup.updateRememberedValue(sliderKt$SliderImpl$drag$1$1RememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Modifier modifierThen = FocusableKt.focusable(sliderSemantics(SizeKt.m1059requiredSizeInqDBjuR0$default(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier), ThumbWidth, TrackHeight, 0.0f, 0.0f, 12, null), sliderState, z2), z2, mutableInteractionSource).then(modifierSliderTapModifier).then(DraggableKt.draggable$default(companion2, sliderState2, orientation, z2, mutableInteractionSource, zIsDragging$material3_release, null, (Function3) sliderKt$SliderImpl$drag$1$1RememberedValue, zIsRtl$material3_release, 32, null));
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 174754537, "CC(remember):Slider.kt#9igjgp");
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(sliderState);
            MeasurePolicy measurePolicyRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || measurePolicyRememberedValue == Composer.Companion.getEmpty()) {
                measurePolicyRememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.SliderKt$SliderImpl$2$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* JADX INFO: renamed from: measure-3p2s80s */
                    public final MeasureResult mo375measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j2) {
                        int size = list.size();
                        for (int i7 = 0; i7 < size; i7++) {
                            Measurable measurable = list.get(i7);
                            if (LayoutIdKt.getLayoutId(measurable) == SliderComponents.THUMB) {
                                final Placeable placeableMo5514measureBRTryo0 = measurable.mo5514measureBRTryo0(j2);
                                int size2 = list.size();
                                for (int i8 = 0; i8 < size2; i8++) {
                                    Measurable measurable2 = list.get(i8);
                                    if (LayoutIdKt.getLayoutId(measurable2) == SliderComponents.TRACK) {
                                        final Placeable placeableMo5514measureBRTryo02 = measurable2.mo5514measureBRTryo0(Constraints.m6582copyZbe2FdA$default(ConstraintsKt.m6611offsetNN6EwU$default(j2, -placeableMo5514measureBRTryo0.getWidth(), 0, 2, null), 0, 0, 0, 0, 11, null));
                                        int width = placeableMo5514measureBRTryo0.getWidth() + placeableMo5514measureBRTryo02.getWidth();
                                        int iMax = Math.max(placeableMo5514measureBRTryo02.getHeight(), placeableMo5514measureBRTryo0.getHeight());
                                        sliderState.updateDimensions$material3_release(placeableMo5514measureBRTryo02.getHeight(), width);
                                        final int width2 = placeableMo5514measureBRTryo0.getWidth() / 2;
                                        final int iRoundToInt = MathKt.roundToInt(placeableMo5514measureBRTryo02.getWidth() * sliderState.getCoercedValueAsFraction$material3_release());
                                        final int height = (iMax - placeableMo5514measureBRTryo02.getHeight()) / 2;
                                        final int height2 = (iMax - placeableMo5514measureBRTryo0.getHeight()) / 2;
                                        return MeasureScope.layout$default(measureScope, width, iMax, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.SliderKt$SliderImpl$2$1.1
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
                                                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo5514measureBRTryo02, width2, height, 0.0f, 4, null);
                                                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo5514measureBRTryo0, iRoundToInt, height2, 0.0f, 4, null);
                                            }
                                        }, 4, null);
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
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen);
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
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -610171494, "C682@30354L85,680@30227L271,688@30511L74:Slider.kt#uh7d8r");
            Modifier modifierWrapContentWidth$default = SizeKt.wrapContentWidth$default(LayoutIdKt.layoutId(Modifier.Companion, SliderComponents.THUMB), null, false, 3, null);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 534510168, "CC(remember):Slider.kt#9igjgp");
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(sliderState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = (Function1) new Function1<IntSize, Unit>() { // from class: androidx.compose.material3.SliderKt$SliderImpl$1$1$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                        m2529invokeozmzZPI(intSize.m6812unboximpl());
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
                    public final void m2529invokeozmzZPI(long j2) {
                        sliderState.setThumbWidth$material3_release(IntSize.m6808getWidthimpl(j2));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Modifier modifierOnSizeChanged = OnRemeasuredModifierKt.onSizeChanged(modifierWrapContentWidth$default, (Function1) objRememberedValue);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierOnSizeChanged);
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
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -469300363, "C686@30472L12:Slider.kt#uh7d8r");
            int i7 = (i3 >> 3) & 14;
            int i8 = (-1) - (((-1) - (i3 >> 9)) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION));
            function3.invoke(sliderState, composerStartRestartGroup, Integer.valueOf((i8 + i7) - (i8 & i7)));
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Modifier modifierLayoutId = LayoutIdKt.layoutId(Modifier.Companion, SliderComponents.TRACK);
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
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -469202155, "C688@30571L12:Slider.kt#uh7d8r");
            int i9 = (-1) - (((-1) - (i3 >> 12)) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION));
            function32.invoke(sliderState, composerStartRestartGroup, Integer.valueOf((i9 + i7) - (i9 & i7)));
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
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt.SliderImpl.3
                final /* synthetic */ int $$changed;
                final /* synthetic */ boolean $enabled;
                final /* synthetic */ MutableInteractionSource $interactionSource;
                final /* synthetic */ SliderState $state;
                final /* synthetic */ Function3<SliderState, Composer, Integer, Unit> $thumb;
                final /* synthetic */ Function3<SliderState, Composer, Integer, Unit> $track;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C06873(final SliderState sliderState3, boolean z22, MutableInteractionSource mutableInteractionSource2, Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function33, Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function322, int i22) {
                    super(2);
                    sliderState = sliderState3;
                    z = z22;
                    mutableInteractionSource = mutableInteractionSource2;
                    function3 = function33;
                    function3 = function322;
                    i = i22;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    SliderKt.SliderImpl(modifier, sliderState, z, mutableInteractionSource, function3, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void RangeSliderImpl(Modifier modifier, final RangeSliderState rangeSliderState, boolean z2, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function3, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function32, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function33, Composer composer, int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1411725677);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(RangeSliderImpl)P(3,6!1,4!1,5)736@32503L7,746@32756L35,747@32824L33,784@34404L2230,749@32863L3771:Slider.kt#uh7d8r");
        if ((i2 + 6) - (i2 | 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 + 48) - (i2 | 48) == 0) {
            int i4 = composerStartRestartGroup.changedInstance(rangeSliderState) ? 32 : 16;
            i3 = (i3 + i4) - (i3 & i4);
        }
        if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changed(z2) ? 256 : 128)));
        }
        if ((i2 + 3072) - (i2 | 3072) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changed(mutableInteractionSource) ? 2048 : 1024)));
        }
        if ((i2 + 24576) - (i2 | 24576) == 0) {
            int i5 = composerStartRestartGroup.changed(mutableInteractionSource2) ? 16384 : 8192;
            i3 = (i3 + i5) - (i3 & i5);
        }
        Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function34 = function3;
        if ((196608 & i2) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changedInstance(function34) ? 131072 : 65536)));
        }
        if ((1572864 + i2) - (1572864 | i2) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changedInstance(function32) ? 1048576 : 524288)));
        }
        if ((12582912 + i2) - (12582912 | i2) == 0) {
            int i6 = composerStartRestartGroup.changedInstance(function33) ? 8388608 : 4194304;
            i3 = (i3 + i6) - (i3 & i6);
        }
        if ((-1) - (((-1) - 4793491) | ((-1) - i3)) != 4793490 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1411725677, i3, -1, "androidx.compose.material3.RangeSliderImpl (Slider.kt:735)");
            }
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            rangeSliderState.setRtl$material3_release(objConsume == LayoutDirection.Rtl);
            Modifier modifierRangeSliderPressDragModifier = rangeSliderPressDragModifier(Modifier.Companion, rangeSliderState, mutableInteractionSource, mutableInteractionSource2, z2);
            Strings.Companion companion = Strings.Companion;
            final String strM2993getString2EP1pXo = Strings_androidKt.m2993getString2EP1pXo(Strings.m2923constructorimpl(androidx.compose.ui.R.string.range_start), composerStartRestartGroup, 0);
            Strings.Companion companion2 = Strings.Companion;
            final String strM2993getString2EP1pXo2 = Strings_androidKt.m2993getString2EP1pXo(Strings.m2923constructorimpl(androidx.compose.ui.R.string.range_end), composerStartRestartGroup, 0);
            Modifier modifierThen = SizeKt.m1059requiredSizeInqDBjuR0$default(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier), ThumbWidth, TrackHeight, 0.0f, 0.0f, 12, null).then(modifierRangeSliderPressDragModifier);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1662324209, "CC(remember):Slider.kt#9igjgp");
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(rangeSliderState);
            MeasurePolicy measurePolicyRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || measurePolicyRememberedValue == Composer.Companion.getEmpty()) {
                measurePolicyRememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.SliderKt$RangeSliderImpl$2$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* JADX INFO: renamed from: measure-3p2s80s */
                    public final MeasureResult mo375measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j2) {
                        int size = list.size();
                        for (int i7 = 0; i7 < size; i7++) {
                            Measurable measurable = list.get(i7);
                            if (LayoutIdKt.getLayoutId(measurable) == RangeSliderComponents.STARTTHUMB) {
                                final Placeable placeableMo5514measureBRTryo0 = measurable.mo5514measureBRTryo0(j2);
                                int size2 = list.size();
                                for (int i8 = 0; i8 < size2; i8++) {
                                    Measurable measurable2 = list.get(i8);
                                    if (LayoutIdKt.getLayoutId(measurable2) == RangeSliderComponents.ENDTHUMB) {
                                        final Placeable placeableMo5514measureBRTryo02 = measurable2.mo5514measureBRTryo0(j2);
                                        int size3 = list.size();
                                        for (int i9 = 0; i9 < size3; i9++) {
                                            Measurable measurable3 = list.get(i9);
                                            if (LayoutIdKt.getLayoutId(measurable3) == RangeSliderComponents.TRACK) {
                                                final Placeable placeableMo5514measureBRTryo03 = measurable3.mo5514measureBRTryo0(Constraints.m6582copyZbe2FdA$default(ConstraintsKt.m6611offsetNN6EwU$default(j2, (-(placeableMo5514measureBRTryo0.getWidth() + placeableMo5514measureBRTryo02.getWidth())) / 2, 0, 2, null), 0, 0, 0, 0, 11, null));
                                                int width = placeableMo5514measureBRTryo03.getWidth() + ((placeableMo5514measureBRTryo0.getWidth() + placeableMo5514measureBRTryo02.getWidth()) / 2);
                                                int iMax = Math.max(placeableMo5514measureBRTryo03.getHeight(), Math.max(placeableMo5514measureBRTryo0.getHeight(), placeableMo5514measureBRTryo02.getHeight()));
                                                rangeSliderState.setTrackHeight$material3_release(placeableMo5514measureBRTryo03.getHeight());
                                                rangeSliderState.setTotalWidth$material3_release(width);
                                                rangeSliderState.updateMinMaxPx$material3_release();
                                                final int width2 = placeableMo5514measureBRTryo0.getWidth() / 2;
                                                final int iRoundToInt = MathKt.roundToInt(placeableMo5514measureBRTryo03.getWidth() * rangeSliderState.getCoercedActiveRangeStartAsFraction$material3_release());
                                                final int iRoundToInt2 = MathKt.roundToInt((placeableMo5514measureBRTryo03.getWidth() * rangeSliderState.getCoercedActiveRangeEndAsFraction$material3_release()) + ((placeableMo5514measureBRTryo0.getWidth() - placeableMo5514measureBRTryo02.getWidth()) / 2));
                                                final int height = (iMax - placeableMo5514measureBRTryo03.getHeight()) / 2;
                                                final int height2 = (iMax - placeableMo5514measureBRTryo0.getHeight()) / 2;
                                                final int height3 = (iMax - placeableMo5514measureBRTryo02.getHeight()) / 2;
                                                return MeasureScope.layout$default(measureScope, width, iMax, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSliderImpl$2$1.1
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
                                                        Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo5514measureBRTryo03, width2, height, 0.0f, 4, null);
                                                        Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo5514measureBRTryo0, iRoundToInt, height2, 0.0f, 4, null);
                                                        Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo5514measureBRTryo02, iRoundToInt2, height3, 0.0f, 4, null);
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
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen);
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
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2110426496, "C755@33080L46,757@33259L100,751@32893L598,768@33689L44,770@33864L98,764@33504L586,777@34103L79:Slider.kt#uh7d8r");
            Modifier modifierWrapContentWidth$default = SizeKt.wrapContentWidth$default(LayoutIdKt.layoutId(Modifier.Companion, RangeSliderComponents.STARTTHUMB), null, false, 3, null);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1176461672, "CC(remember):Slider.kt#9igjgp");
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(rangeSliderState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = (Function1) new Function1<IntSize, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSliderImpl$1$1$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                        m2527invokeozmzZPI(intSize.m6812unboximpl());
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
                    public final void m2527invokeozmzZPI(long j2) {
                        rangeSliderState.setStartThumbWidth$material3_release(IntSize.m6808getWidthimpl(j2));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Modifier modifierRangeSliderStartThumbSemantics = rangeSliderStartThumbSemantics(OnRemeasuredModifierKt.onSizeChanged(modifierWrapContentWidth$default, (Function1) objRememberedValue), rangeSliderState, z2);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1176467454, "CC(remember):Slider.kt#9igjgp");
            boolean zChanged = composerStartRestartGroup.changed(strM2993getString2EP1pXo);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSliderImpl$1$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM2993getString2EP1pXo);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Modifier modifierFocusable = FocusableKt.focusable(SemanticsModifierKt.semantics(modifierRangeSliderStartThumbSemantics, true, (Function1) objRememberedValue2), z2, mutableInteractionSource);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFocusable);
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
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 259534201, "C762@33460L17:Slider.kt#uh7d8r");
            int i7 = (-1) - (((-1) - (i3 >> 3)) | ((-1) - 14));
            int i8 = i3 >> 12;
            function34 = function34;
            function34.invoke(rangeSliderState, composerStartRestartGroup, Integer.valueOf(((i8 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i8 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)) | i7));
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Modifier modifierWrapContentWidth$default2 = SizeKt.wrapContentWidth$default(LayoutIdKt.layoutId(Modifier.Companion, RangeSliderComponents.ENDTHUMB), null, false, 3, null);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1176481158, "CC(remember):Slider.kt#9igjgp");
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(rangeSliderState);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = (Function1) new Function1<IntSize, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSliderImpl$1$4$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                        m2528invokeozmzZPI(intSize.m6812unboximpl());
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
                    public final void m2528invokeozmzZPI(long j2) {
                        rangeSliderState.setEndThumbWidth$material3_release(IntSize.m6808getWidthimpl(j2));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Modifier modifierRangeSliderEndThumbSemantics = rangeSliderEndThumbSemantics(OnRemeasuredModifierKt.onSizeChanged(modifierWrapContentWidth$default2, (Function1) objRememberedValue3), rangeSliderState, z2);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1176486812, "CC(remember):Slider.kt#9igjgp");
            boolean zChanged2 = composerStartRestartGroup.changed(strM2993getString2EP1pXo2);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSliderImpl$1$5$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM2993getString2EP1pXo2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Modifier modifierFocusable2 = FocusableKt.focusable(SemanticsModifierKt.semantics(modifierRangeSliderEndThumbSemantics, true, (Function1) objRememberedValue4), z2, mutableInteractionSource2);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFocusable2);
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
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 260130331, "C775@34061L15:Slider.kt#uh7d8r");
            int i9 = (i3 >> 15) & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION;
            function32.invoke(rangeSliderState, composerStartRestartGroup, Integer.valueOf((i9 + i7) - (i9 & i7)));
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Modifier modifierLayoutId = LayoutIdKt.layoutId(Modifier.Companion, RangeSliderComponents.TRACK);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierLayoutId);
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
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 260236382, "C777@34168L12:Slider.kt#uh7d8r");
            function33.invoke(rangeSliderState, composerStartRestartGroup, Integer.valueOf((-1) - (((-1) - ((-1) - (((-1) - (i3 >> 18)) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)))) & ((-1) - i7))));
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
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt.RangeSliderImpl.3
                final /* synthetic */ int $$changed;
                final /* synthetic */ boolean $enabled;
                final /* synthetic */ MutableInteractionSource $endInteractionSource;
                final /* synthetic */ Function3<RangeSliderState, Composer, Integer, Unit> $endThumb;
                final /* synthetic */ MutableInteractionSource $startInteractionSource;
                final /* synthetic */ Function3<RangeSliderState, Composer, Integer, Unit> $startThumb;
                final /* synthetic */ RangeSliderState $state;
                final /* synthetic */ Function3<RangeSliderState, Composer, Integer, Unit> $track;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C06803(final RangeSliderState rangeSliderState2, boolean z22, MutableInteractionSource mutableInteractionSource3, MutableInteractionSource mutableInteractionSource22, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function342, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function322, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function332, int i22) {
                    super(2);
                    rangeSliderState = rangeSliderState2;
                    z = z22;
                    mutableInteractionSource = mutableInteractionSource3;
                    mutableInteractionSource = mutableInteractionSource22;
                    function3 = function342;
                    function3 = function322;
                    function3 = function332;
                    i = i22;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    SliderKt.RangeSliderImpl(modifier, rangeSliderState, z, mutableInteractionSource, mutableInteractionSource, function3, function3, function3, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0056  */
    /* JADX INFO: renamed from: awaitSlop-8vUncbI */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m2522awaitSlop8vUncbI(androidx.compose.ui.input.pointer.AwaitPointerEventScope r9, long r10, int r12, kotlin.coroutines.Continuation<? super kotlin.Pair<androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Float>> r13) {
        /*
            boolean r0 = r13 instanceof androidx.compose.material3.SliderKt$awaitSlop$1
            if (r0 == 0) goto L56
            r8 = r13
            androidx.compose.material3.SliderKt$awaitSlop$1 r8 = (androidx.compose.material3.SliderKt$awaitSlop$1) r8
            int r0 = r8.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L56
            int r0 = r8.label
            int r0 = r0 - r1
            r8.label = r0
        L13:
            java.lang.Object r3 = r8.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r8.label
            r1 = 1
            if (r0 == 0) goto L38
            if (r0 != r1) goto L5c
            java.lang.Object r0 = r8.L$0
            kotlin.jvm.internal.Ref$FloatRef r0 = (kotlin.jvm.internal.Ref.FloatRef) r0
            kotlin.ResultKt.throwOnFailure(r3)
        L27:
            androidx.compose.ui.input.pointer.PointerInputChange r3 = (androidx.compose.ui.input.pointer.PointerInputChange) r3
            if (r3 == 0) goto L36
            float r0 = r0.element
            java.lang.Float r0 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r0)
            kotlin.Pair r0 = kotlin.TuplesKt.to(r3, r0)
        L35:
            return r0
        L36:
            r0 = 0
            goto L35
        L38:
            kotlin.ResultKt.throwOnFailure(r3)
            kotlin.jvm.internal.Ref$FloatRef r0 = new kotlin.jvm.internal.Ref$FloatRef
            r0.<init>()
            androidx.compose.material3.SliderKt$awaitSlop$postPointerSlop$1 r7 = new androidx.compose.material3.SliderKt$awaitSlop$postPointerSlop$1
            r7.<init>()
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            r8.L$0 = r0
            r8.label = r1
            r6 = r12
            r4 = r10
            r3 = r9
            java.lang.Object r3 = androidx.compose.material3.internal.DragGestureDetectorCopyKt.m2911awaitHorizontalPointerSlopOrCancellationgDDlDlE(r3, r4, r6, r7, r8)
            if (r3 != r2) goto L55
            return r2
        L55:
            goto L27
        L56:
            androidx.compose.material3.SliderKt$awaitSlop$1 r8 = new androidx.compose.material3.SliderKt$awaitSlop$1
            r8.<init>(r13)
            goto L13
        L5c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.m2522awaitSlop8vUncbI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final float[] stepsToTickFractions(int i2) {
        if (i2 == 0) {
            return new float[0];
        }
        int i3 = i2 + 2;
        float[] fArr = new float[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            fArr[i4] = i4 / (i2 + 1);
        }
        return fArr;
    }

    public static final float scale(float f2, float f3, float f4, float f5, float f6) {
        return MathHelpersKt.lerp(f5, f6, calcFraction(f2, f3, f4));
    }

    /* JADX INFO: renamed from: scale-ziovWd0 */
    public static final long m2525scaleziovWd0(float f2, float f3, long j2, float f4, float f5) {
        return SliderRange(scale(f2, f3, SliderRange.m2537getStartimpl(j2), f4, f5), scale(f2, f3, SliderRange.m2536getEndInclusiveimpl(j2), f4, f5));
    }

    public static final float calcFraction(float f2, float f3, float f4) {
        float f5 = f3 - f2;
        return RangesKt.coerceIn(f5 == 0.0f ? 0.0f : (f4 - f2) / f5, 0.0f, 1.0f);
    }

    /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$sliderSemantics$1 */
    /* JADX INFO: compiled from: Slider.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bDZc|İOيH\u000b\\A'\"Z\u0012>\u000f¡n96E"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G}(3v%2KQ&x>)\u0015upMsc*Nz8GY$", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C06911 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ SliderState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06911(boolean z2, SliderState sliderState) {
            super(1);
            z = z2;
            sliderState = sliderState;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            invoke2(semanticsPropertyReceiver);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$sliderSemantics$1$1 */
        /* JADX INFO: compiled from: Slider.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,r\bӵLc\u0003\tI\u00066\u000b<Ȑ\u0017\"Z\u0011(\u000btjQ0rf\u000f6ʂW,\u0015m\n7"}, d2 = {"\n`]<a@F])\rS", "", "B`a4X;/O \u000fz", "", "7me<^,", "uE\u0018\u0019](OOb\u0006vg.Fe9o\u0007(wIV"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        static final class C00951 extends Lambda implements Function1<Float, Boolean> {
            C00951() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Float f2) {
                return invoke(f2.floatValue());
            }

            public final Boolean invoke(float f2) {
                int steps;
                float fCoerceIn = RangesKt.coerceIn(f2, sliderState.getValueRange().getStart().floatValue(), sliderState.getValueRange().getEndInclusive().floatValue());
                boolean z2 = false;
                if (sliderState.getSteps() > 0 && (steps = sliderState.getSteps() + 1) >= 0) {
                    float fAbs = fCoerceIn;
                    float f3 = fAbs;
                    int i2 = 0;
                    while (true) {
                        float fLerp = MathHelpersKt.lerp(sliderState.getValueRange().getStart().floatValue(), sliderState.getValueRange().getEndInclusive().floatValue(), i2 / (sliderState.getSteps() + 1));
                        float f4 = fLerp - fCoerceIn;
                        if (Math.abs(f4) <= fAbs) {
                            fAbs = Math.abs(f4);
                            f3 = fLerp;
                        }
                        if (i2 == steps) {
                            break;
                        }
                        i2++;
                    }
                    fCoerceIn = f3;
                }
                if (fCoerceIn != sliderState.getValue()) {
                    if (fCoerceIn != sliderState.getValue()) {
                        if (sliderState.getOnValueChange$material3_release() != null) {
                            Function1<Float, Unit> onValueChange$material3_release = sliderState.getOnValueChange$material3_release();
                            if (onValueChange$material3_release != null) {
                                onValueChange$material3_release.invoke(Float.valueOf(fCoerceIn));
                            }
                        } else {
                            sliderState.setValue(fCoerceIn);
                        }
                    }
                    Function0<Unit> onValueChangeFinished = sliderState.getOnValueChangeFinished();
                    if (onValueChangeFinished != null) {
                        onValueChangeFinished.invoke();
                    }
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            }
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            if (!z) {
                SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
            }
            SemanticsPropertiesKt.setProgress$default(semanticsPropertyReceiver, null, new Function1<Float, Boolean>() { // from class: androidx.compose.material3.SliderKt.sliderSemantics.1.1
                C00951() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(Float f2) {
                    return invoke(f2.floatValue());
                }

                public final Boolean invoke(float f2) {
                    int steps;
                    float fCoerceIn = RangesKt.coerceIn(f2, sliderState.getValueRange().getStart().floatValue(), sliderState.getValueRange().getEndInclusive().floatValue());
                    boolean z2 = false;
                    if (sliderState.getSteps() > 0 && (steps = sliderState.getSteps() + 1) >= 0) {
                        float fAbs = fCoerceIn;
                        float f3 = fAbs;
                        int i2 = 0;
                        while (true) {
                            float fLerp = MathHelpersKt.lerp(sliderState.getValueRange().getStart().floatValue(), sliderState.getValueRange().getEndInclusive().floatValue(), i2 / (sliderState.getSteps() + 1));
                            float f4 = fLerp - fCoerceIn;
                            if (Math.abs(f4) <= fAbs) {
                                fAbs = Math.abs(f4);
                                f3 = fLerp;
                            }
                            if (i2 == steps) {
                                break;
                            }
                            i2++;
                        }
                        fCoerceIn = f3;
                    }
                    if (fCoerceIn != sliderState.getValue()) {
                        if (fCoerceIn != sliderState.getValue()) {
                            if (sliderState.getOnValueChange$material3_release() != null) {
                                Function1<Float, Unit> onValueChange$material3_release = sliderState.getOnValueChange$material3_release();
                                if (onValueChange$material3_release != null) {
                                    onValueChange$material3_release.invoke(Float.valueOf(fCoerceIn));
                                }
                            } else {
                                sliderState.setValue(fCoerceIn);
                            }
                        }
                        Function0<Unit> onValueChangeFinished = sliderState.getOnValueChangeFinished();
                        if (onValueChangeFinished != null) {
                            onValueChangeFinished.invoke();
                        }
                        z2 = true;
                    }
                    return Boolean.valueOf(z2);
                }
            }, 1, null);
        }
    }

    private static final Modifier sliderSemantics(Modifier modifier, SliderState sliderState, boolean z2) {
        return ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default(modifier, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.SliderKt.sliderSemantics.1
            final /* synthetic */ boolean $enabled;
            final /* synthetic */ SliderState $state;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C06911(boolean z22, SliderState sliderState2) {
                super(1);
                z = z22;
                sliderState = sliderState2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$sliderSemantics$1$1 */
            /* JADX INFO: compiled from: Slider.kt */
            @InterfaceC1492Gx
            @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,r\bӵLc\u0003\tI\u00066\u000b<Ȑ\u0017\"Z\u0011(\u000btjQ0rf\u000f6ʂW,\u0015m\n7"}, d2 = {"\n`]<a@F])\rS", "", "B`a4X;/O \u000fz", "", "7me<^,", "uE\u0018\u0019](OOb\u0006vg.Fe9o\u0007(wIV"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
            static final class C00951 extends Lambda implements Function1<Float, Boolean> {
                C00951() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(Float f2) {
                    return invoke(f2.floatValue());
                }

                public final Boolean invoke(float f2) {
                    int steps;
                    float fCoerceIn = RangesKt.coerceIn(f2, sliderState.getValueRange().getStart().floatValue(), sliderState.getValueRange().getEndInclusive().floatValue());
                    boolean z2 = false;
                    if (sliderState.getSteps() > 0 && (steps = sliderState.getSteps() + 1) >= 0) {
                        float fAbs = fCoerceIn;
                        float f3 = fAbs;
                        int i2 = 0;
                        while (true) {
                            float fLerp = MathHelpersKt.lerp(sliderState.getValueRange().getStart().floatValue(), sliderState.getValueRange().getEndInclusive().floatValue(), i2 / (sliderState.getSteps() + 1));
                            float f4 = fLerp - fCoerceIn;
                            if (Math.abs(f4) <= fAbs) {
                                fAbs = Math.abs(f4);
                                f3 = fLerp;
                            }
                            if (i2 == steps) {
                                break;
                            }
                            i2++;
                        }
                        fCoerceIn = f3;
                    }
                    if (fCoerceIn != sliderState.getValue()) {
                        if (fCoerceIn != sliderState.getValue()) {
                            if (sliderState.getOnValueChange$material3_release() != null) {
                                Function1<Float, Unit> onValueChange$material3_release = sliderState.getOnValueChange$material3_release();
                                if (onValueChange$material3_release != null) {
                                    onValueChange$material3_release.invoke(Float.valueOf(fCoerceIn));
                                }
                            } else {
                                sliderState.setValue(fCoerceIn);
                            }
                        }
                        Function0<Unit> onValueChangeFinished = sliderState.getOnValueChangeFinished();
                        if (onValueChangeFinished != null) {
                            onValueChangeFinished.invoke();
                        }
                        z2 = true;
                    }
                    return Boolean.valueOf(z2);
                }
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                if (!z) {
                    SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
                }
                SemanticsPropertiesKt.setProgress$default(semanticsPropertyReceiver, null, new Function1<Float, Boolean>() { // from class: androidx.compose.material3.SliderKt.sliderSemantics.1.1
                    C00951() {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Float f2) {
                        return invoke(f2.floatValue());
                    }

                    public final Boolean invoke(float f2) {
                        int steps;
                        float fCoerceIn = RangesKt.coerceIn(f2, sliderState.getValueRange().getStart().floatValue(), sliderState.getValueRange().getEndInclusive().floatValue());
                        boolean z22 = false;
                        if (sliderState.getSteps() > 0 && (steps = sliderState.getSteps() + 1) >= 0) {
                            float fAbs = fCoerceIn;
                            float f3 = fAbs;
                            int i2 = 0;
                            while (true) {
                                float fLerp = MathHelpersKt.lerp(sliderState.getValueRange().getStart().floatValue(), sliderState.getValueRange().getEndInclusive().floatValue(), i2 / (sliderState.getSteps() + 1));
                                float f4 = fLerp - fCoerceIn;
                                if (Math.abs(f4) <= fAbs) {
                                    fAbs = Math.abs(f4);
                                    f3 = fLerp;
                                }
                                if (i2 == steps) {
                                    break;
                                }
                                i2++;
                            }
                            fCoerceIn = f3;
                        }
                        if (fCoerceIn != sliderState.getValue()) {
                            if (fCoerceIn != sliderState.getValue()) {
                                if (sliderState.getOnValueChange$material3_release() != null) {
                                    Function1<Float, Unit> onValueChange$material3_release = sliderState.getOnValueChange$material3_release();
                                    if (onValueChange$material3_release != null) {
                                        onValueChange$material3_release.invoke(Float.valueOf(fCoerceIn));
                                    }
                                } else {
                                    sliderState.setValue(fCoerceIn);
                                }
                            }
                            Function0<Unit> onValueChangeFinished = sliderState.getOnValueChangeFinished();
                            if (onValueChangeFinished != null) {
                                onValueChangeFinished.invoke();
                            }
                            z22 = true;
                        }
                        return Boolean.valueOf(z22);
                    }
                }, 1, null);
            }
        }, 1, null).then(AccessibilityUtilKt.getIncreaseHorizontalSemanticsBounds()), sliderState2.getValue(), RangesKt.rangeTo(sliderState2.getValueRange().getStart().floatValue(), sliderState2.getValueRange().getEndInclusive().floatValue()), sliderState2.getSteps());
    }

    private static final Modifier rangeSliderStartThumbSemantics(Modifier modifier, RangeSliderState rangeSliderState, boolean z2) {
        ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo = RangesKt.rangeTo(rangeSliderState.getValueRange().getStart().floatValue(), rangeSliderState.getActiveRangeEnd());
        return ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default(modifier, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.SliderKt.rangeSliderStartThumbSemantics.1
            final /* synthetic */ boolean $enabled;
            final /* synthetic */ RangeSliderState $state;
            final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C06901(boolean z22, ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo2, RangeSliderState rangeSliderState2) {
                super(1);
                z = z22;
                closedFloatingPointRange = closedFloatingPointRangeRangeTo2;
                rangeSliderState = rangeSliderState2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$rangeSliderStartThumbSemantics$1$1 */
            /* JADX INFO: compiled from: Slider.kt */
            /* JADX INFO: loaded from: classes.dex */
            @InterfaceC1492Gx
            @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,r\bӵLc\u0003\tI\u00066\u000b<Ȑ\u0017\"Z\u0011(\u000btjQ0rf\u000f6ʂW,\u0015m\n7"}, d2 = {"\n`]<a@F])\rS", "", "B`a4X;/O \u000fz", "", "7me<^,", "uE\u0018\u0019](OOb\u0006vg.Fe9o\u0007(wIV"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
            static final class C00941 extends Lambda implements Function1<Float, Boolean> {
                final /* synthetic */ RangeSliderState $state;
                final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C00941(ClosedFloatingPointRange<Float> closedFloatingPointRange, RangeSliderState rangeSliderState) {
                    super(1);
                    closedFloatingPointRange = closedFloatingPointRange;
                    rangeSliderState = rangeSliderState;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(Float f2) {
                    return invoke(f2.floatValue());
                }

                public final Boolean invoke(float f2) {
                    int startSteps$material3_release;
                    float fCoerceIn = RangesKt.coerceIn(f2, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
                    boolean z2 = false;
                    if (rangeSliderState.getStartSteps$material3_release() > 0 && (startSteps$material3_release = rangeSliderState.getStartSteps$material3_release() + 1) >= 0) {
                        float fAbs = fCoerceIn;
                        float f3 = fAbs;
                        int i2 = 0;
                        while (true) {
                            float fLerp = MathHelpersKt.lerp(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue(), i2 / (rangeSliderState.getStartSteps$material3_release() + 1));
                            float f4 = fLerp - fCoerceIn;
                            if (Math.abs(f4) <= fAbs) {
                                fAbs = Math.abs(f4);
                                f3 = fLerp;
                            }
                            if (i2 == startSteps$material3_release) {
                                break;
                            }
                            i2++;
                        }
                        fCoerceIn = f3;
                    }
                    if (fCoerceIn != rangeSliderState.getActiveRangeStart()) {
                        long jSliderRange = SliderKt.SliderRange(fCoerceIn, rangeSliderState.getActiveRangeEnd());
                        if (!SliderRange.m2535equalsimpl0(jSliderRange, SliderKt.SliderRange(rangeSliderState.getActiveRangeStart(), rangeSliderState.getActiveRangeEnd()))) {
                            if (rangeSliderState.getOnValueChange$material3_release() != null) {
                                Function1<SliderRange, Unit> onValueChange$material3_release = rangeSliderState.getOnValueChange$material3_release();
                                if (onValueChange$material3_release != null) {
                                    onValueChange$material3_release.invoke(SliderRange.m2532boximpl(jSliderRange));
                                }
                            } else {
                                rangeSliderState.setActiveRangeStart(SliderRange.m2537getStartimpl(jSliderRange));
                                rangeSliderState.setActiveRangeEnd(SliderRange.m2536getEndInclusiveimpl(jSliderRange));
                            }
                        }
                        Function0<Unit> onValueChangeFinished = rangeSliderState.getOnValueChangeFinished();
                        if (onValueChangeFinished != null) {
                            onValueChangeFinished.invoke();
                        }
                        z2 = true;
                    }
                    return Boolean.valueOf(z2);
                }
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                if (!z) {
                    SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
                }
                SemanticsPropertiesKt.setProgress$default(semanticsPropertyReceiver, null, new Function1<Float, Boolean>() { // from class: androidx.compose.material3.SliderKt.rangeSliderStartThumbSemantics.1.1
                    final /* synthetic */ RangeSliderState $state;
                    final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C00941(ClosedFloatingPointRange<Float> closedFloatingPointRange, RangeSliderState rangeSliderState2) {
                        super(1);
                        closedFloatingPointRange = closedFloatingPointRange;
                        rangeSliderState = rangeSliderState2;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Float f2) {
                        return invoke(f2.floatValue());
                    }

                    public final Boolean invoke(float f2) {
                        int startSteps$material3_release;
                        float fCoerceIn = RangesKt.coerceIn(f2, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
                        boolean z22 = false;
                        if (rangeSliderState.getStartSteps$material3_release() > 0 && (startSteps$material3_release = rangeSliderState.getStartSteps$material3_release() + 1) >= 0) {
                            float fAbs = fCoerceIn;
                            float f3 = fAbs;
                            int i2 = 0;
                            while (true) {
                                float fLerp = MathHelpersKt.lerp(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue(), i2 / (rangeSliderState.getStartSteps$material3_release() + 1));
                                float f4 = fLerp - fCoerceIn;
                                if (Math.abs(f4) <= fAbs) {
                                    fAbs = Math.abs(f4);
                                    f3 = fLerp;
                                }
                                if (i2 == startSteps$material3_release) {
                                    break;
                                }
                                i2++;
                            }
                            fCoerceIn = f3;
                        }
                        if (fCoerceIn != rangeSliderState.getActiveRangeStart()) {
                            long jSliderRange = SliderKt.SliderRange(fCoerceIn, rangeSliderState.getActiveRangeEnd());
                            if (!SliderRange.m2535equalsimpl0(jSliderRange, SliderKt.SliderRange(rangeSliderState.getActiveRangeStart(), rangeSliderState.getActiveRangeEnd()))) {
                                if (rangeSliderState.getOnValueChange$material3_release() != null) {
                                    Function1<SliderRange, Unit> onValueChange$material3_release = rangeSliderState.getOnValueChange$material3_release();
                                    if (onValueChange$material3_release != null) {
                                        onValueChange$material3_release.invoke(SliderRange.m2532boximpl(jSliderRange));
                                    }
                                } else {
                                    rangeSliderState.setActiveRangeStart(SliderRange.m2537getStartimpl(jSliderRange));
                                    rangeSliderState.setActiveRangeEnd(SliderRange.m2536getEndInclusiveimpl(jSliderRange));
                                }
                            }
                            Function0<Unit> onValueChangeFinished = rangeSliderState.getOnValueChangeFinished();
                            if (onValueChangeFinished != null) {
                                onValueChangeFinished.invoke();
                            }
                            z22 = true;
                        }
                        return Boolean.valueOf(z22);
                    }
                }, 1, null);
            }
        }, 1, null).then(AccessibilityUtilKt.getIncreaseHorizontalSemanticsBounds()), rangeSliderState2.getActiveRangeStart(), closedFloatingPointRangeRangeTo2, rangeSliderState2.getStartSteps$material3_release());
    }

    /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$rangeSliderStartThumbSemantics$1 */
    /* JADX INFO: compiled from: Slider.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bDZc|İOيH\u000b\\A'\"Z\u0012>\u000f¡n96E"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G}(3v%2KQ&x>)\u0015upMsc*Nz8GY$", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C06901 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ RangeSliderState $state;
        final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06901(boolean z22, ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo2, RangeSliderState rangeSliderState2) {
            super(1);
            z = z22;
            closedFloatingPointRange = closedFloatingPointRangeRangeTo2;
            rangeSliderState = rangeSliderState2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            invoke2(semanticsPropertyReceiver);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$rangeSliderStartThumbSemantics$1$1 */
        /* JADX INFO: compiled from: Slider.kt */
        /* JADX INFO: loaded from: classes.dex */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,r\bӵLc\u0003\tI\u00066\u000b<Ȑ\u0017\"Z\u0011(\u000btjQ0rf\u000f6ʂW,\u0015m\n7"}, d2 = {"\n`]<a@F])\rS", "", "B`a4X;/O \u000fz", "", "7me<^,", "uE\u0018\u0019](OOb\u0006vg.Fe9o\u0007(wIV"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        static final class C00941 extends Lambda implements Function1<Float, Boolean> {
            final /* synthetic */ RangeSliderState $state;
            final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00941(ClosedFloatingPointRange<Float> closedFloatingPointRange, RangeSliderState rangeSliderState2) {
                super(1);
                closedFloatingPointRange = closedFloatingPointRange;
                rangeSliderState = rangeSliderState2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Float f2) {
                return invoke(f2.floatValue());
            }

            public final Boolean invoke(float f2) {
                int startSteps$material3_release;
                float fCoerceIn = RangesKt.coerceIn(f2, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
                boolean z22 = false;
                if (rangeSliderState.getStartSteps$material3_release() > 0 && (startSteps$material3_release = rangeSliderState.getStartSteps$material3_release() + 1) >= 0) {
                    float fAbs = fCoerceIn;
                    float f3 = fAbs;
                    int i2 = 0;
                    while (true) {
                        float fLerp = MathHelpersKt.lerp(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue(), i2 / (rangeSliderState.getStartSteps$material3_release() + 1));
                        float f4 = fLerp - fCoerceIn;
                        if (Math.abs(f4) <= fAbs) {
                            fAbs = Math.abs(f4);
                            f3 = fLerp;
                        }
                        if (i2 == startSteps$material3_release) {
                            break;
                        }
                        i2++;
                    }
                    fCoerceIn = f3;
                }
                if (fCoerceIn != rangeSliderState.getActiveRangeStart()) {
                    long jSliderRange = SliderKt.SliderRange(fCoerceIn, rangeSliderState.getActiveRangeEnd());
                    if (!SliderRange.m2535equalsimpl0(jSliderRange, SliderKt.SliderRange(rangeSliderState.getActiveRangeStart(), rangeSliderState.getActiveRangeEnd()))) {
                        if (rangeSliderState.getOnValueChange$material3_release() != null) {
                            Function1<SliderRange, Unit> onValueChange$material3_release = rangeSliderState.getOnValueChange$material3_release();
                            if (onValueChange$material3_release != null) {
                                onValueChange$material3_release.invoke(SliderRange.m2532boximpl(jSliderRange));
                            }
                        } else {
                            rangeSliderState.setActiveRangeStart(SliderRange.m2537getStartimpl(jSliderRange));
                            rangeSliderState.setActiveRangeEnd(SliderRange.m2536getEndInclusiveimpl(jSliderRange));
                        }
                    }
                    Function0<Unit> onValueChangeFinished = rangeSliderState.getOnValueChangeFinished();
                    if (onValueChangeFinished != null) {
                        onValueChangeFinished.invoke();
                    }
                    z22 = true;
                }
                return Boolean.valueOf(z22);
            }
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            if (!z) {
                SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
            }
            SemanticsPropertiesKt.setProgress$default(semanticsPropertyReceiver, null, new Function1<Float, Boolean>() { // from class: androidx.compose.material3.SliderKt.rangeSliderStartThumbSemantics.1.1
                final /* synthetic */ RangeSliderState $state;
                final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C00941(ClosedFloatingPointRange<Float> closedFloatingPointRange, RangeSliderState rangeSliderState2) {
                    super(1);
                    closedFloatingPointRange = closedFloatingPointRange;
                    rangeSliderState = rangeSliderState2;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(Float f2) {
                    return invoke(f2.floatValue());
                }

                public final Boolean invoke(float f2) {
                    int startSteps$material3_release;
                    float fCoerceIn = RangesKt.coerceIn(f2, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
                    boolean z22 = false;
                    if (rangeSliderState.getStartSteps$material3_release() > 0 && (startSteps$material3_release = rangeSliderState.getStartSteps$material3_release() + 1) >= 0) {
                        float fAbs = fCoerceIn;
                        float f3 = fAbs;
                        int i2 = 0;
                        while (true) {
                            float fLerp = MathHelpersKt.lerp(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue(), i2 / (rangeSliderState.getStartSteps$material3_release() + 1));
                            float f4 = fLerp - fCoerceIn;
                            if (Math.abs(f4) <= fAbs) {
                                fAbs = Math.abs(f4);
                                f3 = fLerp;
                            }
                            if (i2 == startSteps$material3_release) {
                                break;
                            }
                            i2++;
                        }
                        fCoerceIn = f3;
                    }
                    if (fCoerceIn != rangeSliderState.getActiveRangeStart()) {
                        long jSliderRange = SliderKt.SliderRange(fCoerceIn, rangeSliderState.getActiveRangeEnd());
                        if (!SliderRange.m2535equalsimpl0(jSliderRange, SliderKt.SliderRange(rangeSliderState.getActiveRangeStart(), rangeSliderState.getActiveRangeEnd()))) {
                            if (rangeSliderState.getOnValueChange$material3_release() != null) {
                                Function1<SliderRange, Unit> onValueChange$material3_release = rangeSliderState.getOnValueChange$material3_release();
                                if (onValueChange$material3_release != null) {
                                    onValueChange$material3_release.invoke(SliderRange.m2532boximpl(jSliderRange));
                                }
                            } else {
                                rangeSliderState.setActiveRangeStart(SliderRange.m2537getStartimpl(jSliderRange));
                                rangeSliderState.setActiveRangeEnd(SliderRange.m2536getEndInclusiveimpl(jSliderRange));
                            }
                        }
                        Function0<Unit> onValueChangeFinished = rangeSliderState.getOnValueChangeFinished();
                        if (onValueChangeFinished != null) {
                            onValueChangeFinished.invoke();
                        }
                        z22 = true;
                    }
                    return Boolean.valueOf(z22);
                }
            }, 1, null);
        }
    }

    private static final Modifier rangeSliderEndThumbSemantics(Modifier modifier, RangeSliderState rangeSliderState, boolean z2) {
        ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo = RangesKt.rangeTo(rangeSliderState.getActiveRangeStart(), rangeSliderState.getValueRange().getEndInclusive().floatValue());
        return ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default(modifier, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.SliderKt.rangeSliderEndThumbSemantics.1
            final /* synthetic */ boolean $enabled;
            final /* synthetic */ RangeSliderState $state;
            final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C06881(boolean z22, ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo2, RangeSliderState rangeSliderState2) {
                super(1);
                z = z22;
                closedFloatingPointRange = closedFloatingPointRangeRangeTo2;
                rangeSliderState = rangeSliderState2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                if (!z) {
                    SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
                }
                SemanticsPropertiesKt.setProgress$default(semanticsPropertyReceiver, null, new Function1<Float, Boolean>() { // from class: androidx.compose.material3.SliderKt.rangeSliderEndThumbSemantics.1.1
                    final /* synthetic */ RangeSliderState $state;
                    final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C00911(ClosedFloatingPointRange<Float> closedFloatingPointRange, RangeSliderState rangeSliderState2) {
                        super(1);
                        closedFloatingPointRange = closedFloatingPointRange;
                        rangeSliderState = rangeSliderState2;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Float f2) {
                        return invoke(f2.floatValue());
                    }

                    public final Boolean invoke(float f2) {
                        int endSteps$material3_release;
                        float fCoerceIn = RangesKt.coerceIn(f2, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
                        boolean z3 = false;
                        if (rangeSliderState.getEndSteps$material3_release() > 0 && (endSteps$material3_release = rangeSliderState.getEndSteps$material3_release() + 1) >= 0) {
                            float fAbs = fCoerceIn;
                            float f3 = fAbs;
                            int i2 = 0;
                            while (true) {
                                float fLerp = MathHelpersKt.lerp(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue(), i2 / (rangeSliderState.getEndSteps$material3_release() + 1));
                                float f4 = fLerp - fCoerceIn;
                                if (Math.abs(f4) <= fAbs) {
                                    fAbs = Math.abs(f4);
                                    f3 = fLerp;
                                }
                                if (i2 == endSteps$material3_release) {
                                    break;
                                }
                                i2++;
                            }
                            fCoerceIn = f3;
                        }
                        if (fCoerceIn != rangeSliderState.getActiveRangeEnd()) {
                            long jSliderRange = SliderKt.SliderRange(rangeSliderState.getActiveRangeStart(), fCoerceIn);
                            if (!SliderRange.m2535equalsimpl0(jSliderRange, SliderKt.SliderRange(rangeSliderState.getActiveRangeStart(), rangeSliderState.getActiveRangeEnd()))) {
                                if (rangeSliderState.getOnValueChange$material3_release() != null) {
                                    Function1<SliderRange, Unit> onValueChange$material3_release = rangeSliderState.getOnValueChange$material3_release();
                                    if (onValueChange$material3_release != null) {
                                        onValueChange$material3_release.invoke(SliderRange.m2532boximpl(jSliderRange));
                                    }
                                } else {
                                    rangeSliderState.setActiveRangeStart(SliderRange.m2537getStartimpl(jSliderRange));
                                    rangeSliderState.setActiveRangeEnd(SliderRange.m2536getEndInclusiveimpl(jSliderRange));
                                }
                            }
                            Function0<Unit> onValueChangeFinished = rangeSliderState.getOnValueChangeFinished();
                            if (onValueChangeFinished != null) {
                                onValueChangeFinished.invoke();
                            }
                            z3 = true;
                        }
                        return Boolean.valueOf(z3);
                    }
                }, 1, null);
            }

            /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$rangeSliderEndThumbSemantics$1$1 */
            /* JADX INFO: compiled from: Slider.kt */
            @InterfaceC1492Gx
            @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,r\bӵLc\u0003\tI\u00066\u000b<Ȑ\u0017\"Z\u0011(\u000btjQ0rf\u000f6ʂW,\u0015m\n7"}, d2 = {"\n`]<a@F])\rS", "", "B`a4X;/O \u000fz", "", "7me<^,", "uE\u0018\u0019](OOb\u0006vg.Fe9o\u0007(wIV"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
            static final class C00911 extends Lambda implements Function1<Float, Boolean> {
                final /* synthetic */ RangeSliderState $state;
                final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C00911(ClosedFloatingPointRange<Float> closedFloatingPointRange, RangeSliderState rangeSliderState2) {
                    super(1);
                    closedFloatingPointRange = closedFloatingPointRange;
                    rangeSliderState = rangeSliderState2;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(Float f2) {
                    return invoke(f2.floatValue());
                }

                public final Boolean invoke(float f2) {
                    int endSteps$material3_release;
                    float fCoerceIn = RangesKt.coerceIn(f2, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
                    boolean z3 = false;
                    if (rangeSliderState.getEndSteps$material3_release() > 0 && (endSteps$material3_release = rangeSliderState.getEndSteps$material3_release() + 1) >= 0) {
                        float fAbs = fCoerceIn;
                        float f3 = fAbs;
                        int i2 = 0;
                        while (true) {
                            float fLerp = MathHelpersKt.lerp(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue(), i2 / (rangeSliderState.getEndSteps$material3_release() + 1));
                            float f4 = fLerp - fCoerceIn;
                            if (Math.abs(f4) <= fAbs) {
                                fAbs = Math.abs(f4);
                                f3 = fLerp;
                            }
                            if (i2 == endSteps$material3_release) {
                                break;
                            }
                            i2++;
                        }
                        fCoerceIn = f3;
                    }
                    if (fCoerceIn != rangeSliderState.getActiveRangeEnd()) {
                        long jSliderRange = SliderKt.SliderRange(rangeSliderState.getActiveRangeStart(), fCoerceIn);
                        if (!SliderRange.m2535equalsimpl0(jSliderRange, SliderKt.SliderRange(rangeSliderState.getActiveRangeStart(), rangeSliderState.getActiveRangeEnd()))) {
                            if (rangeSliderState.getOnValueChange$material3_release() != null) {
                                Function1<SliderRange, Unit> onValueChange$material3_release = rangeSliderState.getOnValueChange$material3_release();
                                if (onValueChange$material3_release != null) {
                                    onValueChange$material3_release.invoke(SliderRange.m2532boximpl(jSliderRange));
                                }
                            } else {
                                rangeSliderState.setActiveRangeStart(SliderRange.m2537getStartimpl(jSliderRange));
                                rangeSliderState.setActiveRangeEnd(SliderRange.m2536getEndInclusiveimpl(jSliderRange));
                            }
                        }
                        Function0<Unit> onValueChangeFinished = rangeSliderState.getOnValueChangeFinished();
                        if (onValueChangeFinished != null) {
                            onValueChangeFinished.invoke();
                        }
                        z3 = true;
                    }
                    return Boolean.valueOf(z3);
                }
            }
        }, 1, null).then(AccessibilityUtilKt.getIncreaseHorizontalSemanticsBounds()), rangeSliderState2.getActiveRangeEnd(), closedFloatingPointRangeRangeTo2, rangeSliderState2.getEndSteps$material3_release());
    }

    /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$rangeSliderEndThumbSemantics$1 */
    /* JADX INFO: compiled from: Slider.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bDZc|İOيH\u000b\\A'\"Z\u0012>\u000f¡n96E"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G}(3v%2KQ&x>)\u0015upMsc*Nz8GY$", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C06881 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ RangeSliderState $state;
        final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06881(boolean z22, ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo2, RangeSliderState rangeSliderState2) {
            super(1);
            z = z22;
            closedFloatingPointRange = closedFloatingPointRangeRangeTo2;
            rangeSliderState = rangeSliderState2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            invoke2(semanticsPropertyReceiver);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            if (!z) {
                SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
            }
            SemanticsPropertiesKt.setProgress$default(semanticsPropertyReceiver, null, new Function1<Float, Boolean>() { // from class: androidx.compose.material3.SliderKt.rangeSliderEndThumbSemantics.1.1
                final /* synthetic */ RangeSliderState $state;
                final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C00911(ClosedFloatingPointRange<Float> closedFloatingPointRange, RangeSliderState rangeSliderState2) {
                    super(1);
                    closedFloatingPointRange = closedFloatingPointRange;
                    rangeSliderState = rangeSliderState2;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(Float f2) {
                    return invoke(f2.floatValue());
                }

                public final Boolean invoke(float f2) {
                    int endSteps$material3_release;
                    float fCoerceIn = RangesKt.coerceIn(f2, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
                    boolean z3 = false;
                    if (rangeSliderState.getEndSteps$material3_release() > 0 && (endSteps$material3_release = rangeSliderState.getEndSteps$material3_release() + 1) >= 0) {
                        float fAbs = fCoerceIn;
                        float f3 = fAbs;
                        int i2 = 0;
                        while (true) {
                            float fLerp = MathHelpersKt.lerp(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue(), i2 / (rangeSliderState.getEndSteps$material3_release() + 1));
                            float f4 = fLerp - fCoerceIn;
                            if (Math.abs(f4) <= fAbs) {
                                fAbs = Math.abs(f4);
                                f3 = fLerp;
                            }
                            if (i2 == endSteps$material3_release) {
                                break;
                            }
                            i2++;
                        }
                        fCoerceIn = f3;
                    }
                    if (fCoerceIn != rangeSliderState.getActiveRangeEnd()) {
                        long jSliderRange = SliderKt.SliderRange(rangeSliderState.getActiveRangeStart(), fCoerceIn);
                        if (!SliderRange.m2535equalsimpl0(jSliderRange, SliderKt.SliderRange(rangeSliderState.getActiveRangeStart(), rangeSliderState.getActiveRangeEnd()))) {
                            if (rangeSliderState.getOnValueChange$material3_release() != null) {
                                Function1<SliderRange, Unit> onValueChange$material3_release = rangeSliderState.getOnValueChange$material3_release();
                                if (onValueChange$material3_release != null) {
                                    onValueChange$material3_release.invoke(SliderRange.m2532boximpl(jSliderRange));
                                }
                            } else {
                                rangeSliderState.setActiveRangeStart(SliderRange.m2537getStartimpl(jSliderRange));
                                rangeSliderState.setActiveRangeEnd(SliderRange.m2536getEndInclusiveimpl(jSliderRange));
                            }
                        }
                        Function0<Unit> onValueChangeFinished = rangeSliderState.getOnValueChangeFinished();
                        if (onValueChangeFinished != null) {
                            onValueChangeFinished.invoke();
                        }
                        z3 = true;
                    }
                    return Boolean.valueOf(z3);
                }
            }, 1, null);
        }

        /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$rangeSliderEndThumbSemantics$1$1 */
        /* JADX INFO: compiled from: Slider.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,r\bӵLc\u0003\tI\u00066\u000b<Ȑ\u0017\"Z\u0011(\u000btjQ0rf\u000f6ʂW,\u0015m\n7"}, d2 = {"\n`]<a@F])\rS", "", "B`a4X;/O \u000fz", "", "7me<^,", "uE\u0018\u0019](OOb\u0006vg.Fe9o\u0007(wIV"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        static final class C00911 extends Lambda implements Function1<Float, Boolean> {
            final /* synthetic */ RangeSliderState $state;
            final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00911(ClosedFloatingPointRange<Float> closedFloatingPointRange, RangeSliderState rangeSliderState2) {
                super(1);
                closedFloatingPointRange = closedFloatingPointRange;
                rangeSliderState = rangeSliderState2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Float f2) {
                return invoke(f2.floatValue());
            }

            public final Boolean invoke(float f2) {
                int endSteps$material3_release;
                float fCoerceIn = RangesKt.coerceIn(f2, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
                boolean z3 = false;
                if (rangeSliderState.getEndSteps$material3_release() > 0 && (endSteps$material3_release = rangeSliderState.getEndSteps$material3_release() + 1) >= 0) {
                    float fAbs = fCoerceIn;
                    float f3 = fAbs;
                    int i2 = 0;
                    while (true) {
                        float fLerp = MathHelpersKt.lerp(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue(), i2 / (rangeSliderState.getEndSteps$material3_release() + 1));
                        float f4 = fLerp - fCoerceIn;
                        if (Math.abs(f4) <= fAbs) {
                            fAbs = Math.abs(f4);
                            f3 = fLerp;
                        }
                        if (i2 == endSteps$material3_release) {
                            break;
                        }
                        i2++;
                    }
                    fCoerceIn = f3;
                }
                if (fCoerceIn != rangeSliderState.getActiveRangeEnd()) {
                    long jSliderRange = SliderKt.SliderRange(rangeSliderState.getActiveRangeStart(), fCoerceIn);
                    if (!SliderRange.m2535equalsimpl0(jSliderRange, SliderKt.SliderRange(rangeSliderState.getActiveRangeStart(), rangeSliderState.getActiveRangeEnd()))) {
                        if (rangeSliderState.getOnValueChange$material3_release() != null) {
                            Function1<SliderRange, Unit> onValueChange$material3_release = rangeSliderState.getOnValueChange$material3_release();
                            if (onValueChange$material3_release != null) {
                                onValueChange$material3_release.invoke(SliderRange.m2532boximpl(jSliderRange));
                            }
                        } else {
                            rangeSliderState.setActiveRangeStart(SliderRange.m2537getStartimpl(jSliderRange));
                            rangeSliderState.setActiveRangeEnd(SliderRange.m2536getEndInclusiveimpl(jSliderRange));
                        }
                    }
                    Function0<Unit> onValueChangeFinished = rangeSliderState.getOnValueChangeFinished();
                    if (onValueChangeFinished != null) {
                        onValueChangeFinished.invoke();
                    }
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$sliderTapModifier$1 */
    /* JADX INFO: compiled from: Slider.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018' xp'\u0005m7NL"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0002v\u000b|\u000b\u0003{\bOKq\f\n\u0006\b\u0016o\u001aJ\u001b\u0015\u0013\u000f\u0011\u001f\u0002\u0010 }!\u0017\u001d\u001b\u001f\u001c*\\j", f = " 84..:t19", i = {}, l = {1627}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class C06921 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SliderState $state;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06921(SliderState sliderState, Continuation<? super C06921> continuation) {
            super(2, continuation);
            this.$state = sliderState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C06921 c06921 = new C06921(this.$state, continuation);
            c06921.L$0 = obj;
            return c06921;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
            return ((C06921) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$sliderTapModifier$1$2 */
        /* JADX INFO: compiled from: Slider.kt */
        /* JADX INFO: loaded from: classes2.dex */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,i\bӵLc\u000b\u0004I\u00066\u000b<Ȑ\u0017\"Z\u0011(\u000btjQ0rf\u000f6ʂW,\u0015m\n7"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "7me<^,\u0006Y`M\u0002Jvd", "uI\u0018#"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        static final class AnonymousClass2 extends Lambda implements Function1<Offset, Unit> {
            AnonymousClass2() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                m2531invokek4lQ0M(offset.m3947unboximpl());
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke-k-4lQ0M */
            public final void m2531invokek4lQ0M(long j2) {
                sliderState.dispatchRawDelta(0.0f);
                sliderState.getGestureEndAction$material3_release().invoke();
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (TapGestureDetectorKt.detectTapGestures$default((PointerInputScope) this.L$0, null, null, new C00961(this.$state, null), new Function1<Offset, Unit>() { // from class: androidx.compose.material3.SliderKt.sliderTapModifier.1.2
                    AnonymousClass2() {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                        m2531invokek4lQ0M(offset.m3947unboximpl());
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke-k-4lQ0M */
                    public final void m2531invokek4lQ0M(long j2) {
                        sliderState.dispatchRawDelta(0.0f);
                        sliderState.getGestureEndAction$material3_release().invoke();
                    }
                }, this, 3, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$sliderTapModifier$1$1 */
        /* JADX INFO: compiled from: Slider.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,i\bDZc|İI\u0006F\u000b<Ȑ\u0017\"Z\u0011 \u0007\u0015ji4Rf`.\u0001UpŪ*"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w8P;yB\u007f\u0015vpI\u0014c\u001aL\u00012G\"", "7s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0002v\u000b|\u000b\u0003{\bOKq\f\n\u0006\b\u0016o\u001aJ\u001b\u0015\u0013\u000f\u0011\u001f\u0002\u0010 }!\u0017\u001d\u001b\u001f\u001c*\\j^l", f = " 84..:t19", i = {}, l = {}, m = "8>GA>9(KJH>H?", n = {}, s = {})
        static final class C00961 extends SuspendLambda implements Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> {
            final /* synthetic */ SliderState $state;
            /* synthetic */ long J$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00961(SliderState sliderState, Continuation<? super C00961> continuation) {
                super(3, continuation);
                this.$state = sliderState;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(PressGestureScope pressGestureScope, Offset offset, Continuation<? super Unit> continuation) {
                return m2530invoked4ec7I(pressGestureScope, offset.m3947unboximpl(), continuation);
            }

            /* JADX INFO: renamed from: invoke-d-4ec7I */
            public final Object m2530invoked4ec7I(PressGestureScope pressGestureScope, long j2, Continuation<? super Unit> continuation) {
                C00961 c00961 = new C00961(this.$state, continuation);
                c00961.J$0 = j2;
                return c00961.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.$state.m2543onPressk4lQ0M$material3_release(this.J$0);
                return Unit.INSTANCE;
            }
        }
    }

    private static final Modifier sliderTapModifier(Modifier modifier, SliderState sliderState, MutableInteractionSource mutableInteractionSource, boolean z2) {
        return z2 ? SuspendingPointerInputFilterKt.pointerInput(modifier, sliderState, mutableInteractionSource, new C06921(sliderState, null)) : modifier;
    }

    /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1 */
    /* JADX INFO: compiled from: Slider.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018' xp'\u0005m7NL"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0002v\u000b|\u000b\u0003{\bOKq\f\n\u0006\b\u0016o\u001aJ\u001a\n\u0018\u0012\u0011\u007f\u001a\u0018\u0014\u0016$\u0003&\u001a)*{+\u001b\"\t,\"(&*'5gu", f = " 84..:t19", i = {}, l = {1651}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class C06891 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MutableInteractionSource $endInteractionSource;
        final /* synthetic */ MutableInteractionSource $startInteractionSource;
        final /* synthetic */ RangeSliderState $state;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06891(RangeSliderState rangeSliderState, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, Continuation<? super C06891> continuation) {
            super(2, continuation);
            this.$state = rangeSliderState;
            this.$startInteractionSource = mutableInteractionSource;
            this.$endInteractionSource = mutableInteractionSource2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C06891 c06891 = new C06891(this.$state, this.$startInteractionSource, this.$endInteractionSource, continuation);
            c06891.L$0 = obj;
            return c06891;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
            return ((C06891) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                RangeSliderLogic rangeSliderLogic = new RangeSliderLogic(this.$state, this.$startInteractionSource, this.$endInteractionSource);
                this.label = 1;
                if (CoroutineScopeKt.coroutineScope(new C00921(pointerInputScope, this.$state, rangeSliderLogic, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1 */
        /* JADX INFO: compiled from: Slider.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0002v\u000b|\u000b\u0003{\bOKq\f\n\u0006\b\u0016o\u001aJ\u001a\n\u0018\u0012\u0011\u007f\u001a\u0018\u0014\u0016$\u0003&\u001a)*{+\u001b\"\t,\"(&*'5guiw", f = " 84..:t19", i = {}, l = {1652}, m = "8>GA>9(KJH>H?", n = {}, s = {})
        static final class C00921 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ PointerInputScope $$this$pointerInput;
            final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
            final /* synthetic */ RangeSliderState $state;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00921(PointerInputScope pointerInputScope, RangeSliderState rangeSliderState, RangeSliderLogic rangeSliderLogic, Continuation<? super C00921> continuation) {
                super(2, continuation);
                this.$$this$pointerInput = pointerInputScope;
                this.$state = rangeSliderState;
                this.$rangeSliderLogic = rangeSliderLogic;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C00921 c00921 = new C00921(this.$$this$pointerInput, this.$state, this.$rangeSliderLogic, continuation);
                c00921.L$0 = obj;
                return c00921;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C00921) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1 */
            /* JADX INFO: compiled from: Slider.kt */
            @InterfaceC1492Gx
            @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001I(*QR&u8'$hn\u0019\u0018c5]d%QWN\u0002"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
            @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0002v\u000b|\u000b\u0003{\bOKq\f\n\u0006\b\u0016o\u001aJ\u001a\n\u0018\u0012\u0011\u007f\u001a\u0018\u0014\u0016$\u0003&\u001a)*{+\u001b\"\t,\"(&*'5guiwky", f = " 84..:t19", i = {0, 1, 1, 1, 1, 1, 2, 2}, l = {1653, 1665, 1687}, m = "8>GA>9(KJH>H?", n = {"\u0013jjOe\u001aC^7CZ\u000f8='\r\u0018*6\u001c$\u001c", "\u0013jjOe\u001aC^7CZ\u000f8='\r\u0018*6\u001c$\u001c", "TlgTf", "XdvKdWE[?IT", "_eu>", "ShcMY_PN)NG<K", "XdvKdWE[?IT", "ShcMY_PN)NG<K"}, s = {"xQ^", "xQ^", "xQ_", "xQ`", "xQa", "xQb", "xQ^", "xQ_"})
            static final class C00931 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ CoroutineScope $$this$coroutineScope;
                final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
                final /* synthetic */ RangeSliderState $state;
                private /* synthetic */ Object L$0;
                Object L$1;
                Object L$2;
                Object L$3;
                Object L$4;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C00931(RangeSliderState rangeSliderState, RangeSliderLogic rangeSliderLogic, CoroutineScope coroutineScope, Continuation<? super C00931> continuation) {
                    super(2, continuation);
                    this.$state = rangeSliderState;
                    this.$rangeSliderLogic = rangeSliderLogic;
                    this.$$this$coroutineScope = coroutineScope;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C00931 c00931 = new C00931(this.$state, this.$rangeSliderLogic, this.$$this$coroutineScope, continuation);
                    c00931.L$0 = obj;
                    return c00931;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                    return ((C00931) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Not initialized variable reg: 9, insn: 0x0189: INVOKE 
  (r2v1 ?? I:androidx.compose.foundation.interaction.DragInteraction$Cancel)
  (r9 I:androidx.compose.foundation.interaction.DragInteraction$Start)
 DIRECT call: androidx.compose.foundation.interaction.DragInteraction.Cancel.<init>(androidx.compose.foundation.interaction.DragInteraction$Start):void A[MD:(androidx.compose.foundation.interaction.DragInteraction$Start):void (m)], block:B:118:0x0187 */
                /* JADX WARN: Removed duplicated region for block: B:111:0x016a A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:112:0x016b  */
                /* JADX WARN: Removed duplicated region for block: B:116:0x0177 A[Catch: CancellationException -> 0x0187, TryCatch #0 {CancellationException -> 0x0187, blocks: (B:113:0x016c, B:114:0x016f, B:116:0x0177, B:117:0x017f, B:109:0x0148), top: B:121:0x000f }] */
                /* JADX WARN: Removed duplicated region for block: B:117:0x017f A[Catch: CancellationException -> 0x0187, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0187, blocks: (B:113:0x016c, B:114:0x016f, B:116:0x0177, B:117:0x017f, B:109:0x0148), top: B:121:0x000f }] */
                /* JADX WARN: Removed duplicated region for block: B:95:0x00dd  */
                /* JADX WARN: Type inference failed for: r9v0, types: [androidx.compose.foundation.interaction.DragInteraction$Start] */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r22) {
                    /*
                        Method dump skipped, instruction units count: 434
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.C06891.C00921.C00931.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$2 */
                /* JADX INFO: compiled from: Slider.kt */
                @InterfaceC1492Gx
                @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
                @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0002v\u000b|\u000b\u0003{\bOKq\f\n\u0006\b\u0016o\u001aJ\u001a\n\u0018\u0012\u0011\u007f\u001a\u0018\u0014\u0016$\u0003&\u001a)*{+\u001b\"\t,\"(&*'5guiwkym|", f = " 84..:t19", i = {}, l = {1705}, m = "8>GA>9(KJH>H?", n = {}, s = {})
                static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ Ref.BooleanRef $draggingStart;
                    final /* synthetic */ DragInteraction $finishInteraction;
                    final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass2(RangeSliderLogic rangeSliderLogic, Ref.BooleanRef booleanRef, DragInteraction dragInteraction, Continuation<? super AnonymousClass2> continuation) {
                        super(2, continuation);
                        this.$rangeSliderLogic = rangeSliderLogic;
                        this.$draggingStart = booleanRef;
                        this.$finishInteraction = dragInteraction;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new AnonymousClass2(this.$rangeSliderLogic, this.$draggingStart, this.$finishInteraction, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = this.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj);
                            this.label = 1;
                            if (this.$rangeSliderLogic.activeInteraction(this.$draggingStart.element).emit(this.$finishInteraction, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    }
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    this.label = 1;
                    if (ForEachGestureKt.awaitEachGesture(this.$$this$pointerInput, new C00931(this.$state, this.$rangeSliderLogic, coroutineScope, null), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }
    }

    private static final Modifier rangeSliderPressDragModifier(Modifier modifier, RangeSliderState rangeSliderState, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, boolean z2) {
        return z2 ? SuspendingPointerInputFilterKt.pointerInput(modifier, new Object[]{mutableInteractionSource, mutableInteractionSource2, rangeSliderState}, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) new C06891(rangeSliderState, mutableInteractionSource, mutableInteractionSource2, null)) : modifier;
    }

    static {
        float fM3513getHandleWidthD9Ej5fM = SliderTokens.INSTANCE.m3513getHandleWidthD9Ej5fM();
        ThumbWidth = fM3513getHandleWidthD9Ej5fM;
        float fM3512getHandleHeightD9Ej5fM = SliderTokens.INSTANCE.m3512getHandleHeightD9Ej5fM();
        ThumbHeight = fM3512getHandleHeightD9Ej5fM;
        ThumbSize = DpKt.m6660DpSizeYgX7TsA(fM3513getHandleWidthD9Ej5fM, fM3512getHandleHeightD9Ej5fM);
        ThumbTrackGapSize = SliderTokens.INSTANCE.m3505getActiveHandleLeadingSpaceD9Ej5fM();
        TrackInsideCornerSize = Dp.m6638constructorimpl(2);
    }

    public static final float getTrackHeight() {
        return TrackHeight;
    }

    public static final float getThumbWidth() {
        return ThumbWidth;
    }

    public static final long SliderRange(float f2, float f3) {
        if ((!Float.isNaN(f2) || !Float.isNaN(f3)) && f2 > ((double) f3) + SliderRangeTolerance) {
            throw new IllegalArgumentException(("start(" + f2 + ") must be <= endInclusive(" + f3 + ')').toString());
        }
        return SliderRange.m2533constructorimpl((((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
    }

    public static final long SliderRange(ClosedFloatingPointRange<Float> closedFloatingPointRange) {
        float fFloatValue = closedFloatingPointRange.getStart().floatValue();
        float fFloatValue2 = closedFloatingPointRange.getEndInclusive().floatValue();
        if ((!Float.isNaN(fFloatValue) || !Float.isNaN(fFloatValue2)) && fFloatValue > ((double) fFloatValue2) + SliderRangeTolerance) {
            throw new IllegalArgumentException(("ClosedFloatingPointRange<Float>.start(" + fFloatValue + ") must be <= ClosedFloatingPoint.endInclusive(" + fFloatValue2 + ')').toString());
        }
        return SliderRange.m2533constructorimpl((-1) - (((-1) - (((long) Float.floatToRawIntBits(fFloatValue)) << 32)) & ((-1) - ((-1) - (((-1) - ((long) Float.floatToRawIntBits(fFloatValue2))) | ((-1) - 4294967295L))))));
    }

    /* JADX INFO: renamed from: isSpecified-If1S1O4 */
    public static final boolean m2523isSpecifiedIf1S1O4(long j2) {
        return j2 != SliderRange.Companion.m2542getUnspecifiedFYbKRX4();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.collections.IntIterator] */
    public static final float snapValueToTick(float f2, float[] fArr, float f3, float f4) {
        Float fValueOf;
        if (fArr.length == 0) {
            fValueOf = null;
        } else {
            float f5 = fArr[0];
            int lastIndex = ArraysKt.getLastIndex(fArr);
            if (lastIndex != 0) {
                float fAbs = Math.abs(MathHelpersKt.lerp(f3, f4, f5) - f2);
                ?? it = new IntRange(1, lastIndex).iterator();
                while (it.hasNext()) {
                    float f6 = fArr[it.nextInt()];
                    float fAbs2 = Math.abs(MathHelpersKt.lerp(f3, f4, f6) - f2);
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        f5 = f6;
                        fAbs = fAbs2;
                    }
                }
                fValueOf = Float.valueOf(f5);
            } else {
                fValueOf = Float.valueOf(f5);
            }
        }
        return fValueOf != null ? MathHelpersKt.lerp(f3, f4, fValueOf.floatValue()) : f2;
    }
}
