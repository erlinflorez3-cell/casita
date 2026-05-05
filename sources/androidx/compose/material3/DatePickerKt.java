package androidx.compose.material3;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemInfo;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.grid.LazyGridStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.ArrowDropDownKt;
import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.material3.tokens.MotionTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.drew.metadata.exif.makernotes.OlympusCameraSettingsMakernoteDirectory;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.dynatrace.android.agent.Global;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import cz.msebera.android.httpclient.HttpStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
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
/* JADX INFO: compiled from: DatePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яœ\u0014D߬)\u001e\u007f\u007fL܀kt\u001aA\u000e0\u00114J~02\u001aw\rkr9>Dm߉6Ri*\u0017ӆ\u00044:[,qY;]\u001a\u0004#\u0011OdgoñRZ!C\u0017\u0006\u001c|r,_U\u0001ز\u001a\u000fHBwЀ;M}FA`z7\r @)@y\u000b\u0001\"*^\u0010~zYK\u0014\u00126Cx:h\rUĨ\"\u0012\u001c>(ҵ&\\}N>Hr^B/9\u0003qBT+g0\u0013M\u0015Fj'\u0015vg\u001f3@M5\u001d%Y\u000b\u000fRiK\u000b?wC\rh='3IyX>X\u0016\u0014\u001d+U\u000fer<\\\rQf$/+]\u0002SP$(\u007fz\u0012\rDǉ\u0016\u0006=H6- t ԉ2\u0003\u0004k@~\u0014\u000fF\u000e\u000ey6E90D9N3sacK\u0019|I\u0012\u0004;4ţ\u0005n'r\u0005\u001fn-3a\bSAQnO^M8oǀq\u0004vy2;\u0012I_\r?}!.E7MZg9\u074co\u0002N[\u0018z\u0013z\u0001S\u0018mxD0\u000b.7X&<^R\u0003\u001dk~U\t;\u001fl4_\u0017\u007f\u0018\u0013Nn&RƼ)\u0010Tf/hԍLΪܦ)1lWg\u0010\u0004we[v3cc\u0014\u0014ou\u000f\u0014m`\u0013\u000b^fPf$Z\u000b<R8Nj\u001e\u001d\u0014D|2CEEq*ID>)^%H10X@+\u001fރ^h\u0016\u0016\u0005F*\u0003w<\r\u0016\u0011Rlp\u001ey\u000fHZ\u0013˃&-Ghe\u001f,U0\u0010L|Q//y\u0006Guf_L\u001b1<Zދ$\u0016(biȋ<!9\u0017)`\u0014]KZ\u001e}Sc\u0011U'-}\u001dh\u0001.\u00164\u001b\u0010:\u000f\u0003e_e'1%\u000bѓ'\u0012j0\ngL,WeZ\u0011\u0002pYt\u0013Yj`f,5>,X\u0019\u000b2\u000eE<qSޗ\u001a\u0002\u001a_%gc\u001b\u007f0\u007fh5Z\u0005g\u0014,\u0012(\u001e\u0012\u0002a@pPI\b5n&2$\u001bBv#(\fP.L\ranqh~\u0010PM9i.j\u0015F%p\u0005v\u0001\u0014̭\u00024<\u001bBLQ:,^q7AQaz\u0006myp;[\u001d\u001f#\tAp\"\u001ck2lV\u0011\u001fޘ\ns\u001eMq?pBT\tRr\\@\u0016J[T\u0018D@~\u000e\u0007w\u000fE3r\u0003Iu&_\t^fH3rsvՃ.\u0001\u0005&y\u001dئ4̍ܭqHZpqt\u0019&+L3j}#\u0017-9\tl=ImA\u0001i\f\u000eKO\u0002DK_+\u0004j\u001e8h \u0003\u001dP`3;g\u0010\u000e#`d\u0011Ur\u0006|v@\u001f\u0003T()\rD\u0015\u000ejT?\u0011\u001fO\u0001)z-z\t><Ȋ\u0019݅ӢH+\rW\u000b0^\b;SM-k[\u001b\u00185\u000foSi\u00128$.u\u001ctO\u0005\b\u0018tYu!J\u0018\u0002\u0016\u0011\u00147)\u0001$\u0012~bt!2^\fD!\u001a30;\u000f]yJ9@US\u001d\nP\u001f\u0001x8\f\u001dg|*#\u0003\u0015\u0007\u0007}|Gh\u001d7B}=!wrE!U0X?\u0012B+Ӕ#6\u000eyo\u0011˹gh~Bg\u0010\u001b\u0003GkXsa4`1\u0016\u001f(\n4.b\u0001-;\u0005\u0018nt\u00176\u0005Ng\u0010njV/\u0005\u000e9\u0014+\u0011v\u000eW\u0012\u0383Eݱ۠h1=s-7%ӟ_\u0015`]IT3aVMxO29NX|\u001f.Rd\u000b~Xn9\u0012\u000e\u0016DHVeM)U\u0006ޡqn\tV[K>s\u0018.\u0017\u00147aj:0>\u000b,Jj\u0002ROL)\u001c%I\u0016~5Eǝn[YU:\u0007\u00032\u001dA\u007f7\u0012n\u00049\u0003#]!\u001eJ\bjIZMez]<\u0006s\u0002\u0017M\u0012\u000f?e:nMEL \u0006D\u000eC7$R@&'\u000e_IHXz#AҕwW\u0012\u0006B+|%;G\u001b\u000b$\u000e:K0s\u0013>\u0012SO),4TO:<\u001b3ƘQr\u007f;T\u0013KEG\u0011\f/YI\r\u0012_qn=w\"}3jAT\u0013\"0j8o\u001b\u0012IVXX2]\u0018bI\u0003l\u0004P\u000e<h\u0018\u001bs\u001cyGQ\u000fg\u0011!&Lcvt\\\r|[zz\u000bnITb<\\$\u000b41tGǩ\u0006}XI-xA1\fAu$\u0007\u007f/0)[S\u001aUkx2WU \u0001m=Av\u0006J\u0007]\u0016`\u0013B9K\u0013SE\u0004x\u0019FG\u0005\u0014J4ft&KtJ D'VV\u0004`:>@\u0017`S_\u0011\u001cMO\u0004+\u0016\t@SOat\u0013;7\u0006\u0001\u0001kS1\u0007\u001c\u001b\u0010o4Y\f͞W9@\u0015\fԹ0Ln \\wg-sW;\u001bc` ]2o3Ox\u0005V\u0014kI[MW$ Un642\u0011\u007f0y!2p\u0019Kd\u0003˚LU_AvHp@\u000bv\u001242je\bM\u0006?tJdk~N_F\f\u0019X_y*Vڿspz\n]K1')@7w7\u0018_a$n\u007fn\u0007mG[4u+\u0002HSVe\n\u007fA0E\u000e\u0014qx\u0019l`?\u007fdo>\u001e\u0012r\u0015\u001fngLV`lG\u0002\u0016~ާPɂС\rbv<O\u0005z\b:\u001dNH\u0019+1\u0005Y{/\u0014e_''uhR\"\u0010X\u001a\\ծKJ\u0014\u0005\u0003>\u0006\r\u0014]aH=s:\u0010-\u0005lz#\bzSe02\u0014_6TSX\u001c[\u0003WwvWB\u0014\u001c~\u0015,\u001de\u0001g&#\u00016\u0017#LBq[G\u001c9\u00131nl\f@gpz\u001ds\r4<\u001b\u001e*\"D\f5\u001bS\"\u0012٬[qUK$\u001fă\u0002i\u0006\u001a%J ~{JQa\u001af\u001fpFM&\u001b\n@gn\u001a\nPUT'##\u001acD[B1Q\u000bٖ:\"P\u0017~~+:u\u000e5z\u001c\u000bBoNs\u0015o\u0016cqAc\u0017\u0017E[i\"\fY~\u0006~Y}>M$qgL\u001c.\fAb0J\u0007\u001e\u001fw\u0011Ӱd[P\u0015\u0010IpԖjR{u\u0015DtY}2`vp|v~s>SF\u0012\"،=\f)QhUefg\u000eN!pKK\u0002Tr*\\\u001c8bB>@!vnя\u0012\u001b\b\u001c\u0012eΧ\u001a:S߁?cIi߲f{Y2jXlVި\t&פ5M\u0005C\\%t~Һ4\u0018d\u0017Ե\"&(\u001dʼ\u0007\"5@Ϸ\\r ]18\u0013XښKh\ro\\3.\u000f3\u0001̪>-\u0004@DPrsj'˸\u0004Nli\u0006\u0019Xrґ\u001d\u0007[\nO`\u0003\u0014Ù\u0012Y\u001fD6T\r\u000eވZLO$)pM!Ä\u0019[.6<Kfօ\t6\u0018Ѱ0Wb~Ʋ*\u0010_\rL5\u00113X@\u000bF`(ڥ+9#ܪ![\u0013%?\u001e\u0011\u0016\u001cWl!/gu)Fb\u0018&U\u001e\b\"\u0015x]&,QO60\u0002@eL\u001c6^puj\u0006((O \u0007\u000e\u0005}6Sa(&\u0001uZgɅCυɑ,H\u001dҳ\u001d-ې#JU|В\u001ath,\u0002'Vpox4\u001d\u0014\t_C^;\u001c6\u0012\u0011\u0018Q\ñ\u0018H_\u0006Vj\u0015\u0018\u0007RI\u0018\u0005)Nk\r\b_/25{i@QQI(W\u001c8NYBbB\\,\u0383KٴT.(֨^\\.Gʯ3s^}mؕBճx\u00047خ1\u0007\u0017pI2w`3Τ.Ե-xsy=TjCSp=\u001d78FfO#ydx˫GӵAO-ޏ%!p\u0012\u0003\n=A\u007fdv*m\u0001\\ϧ\u0016ϸ\u00036xğ\u000bJ\u0004%L\u0014#,9ܵ\u0007ƇFbWέ6&sY?W eiʲ6Ρ>U\"\u0002lM\u001f\u000f,/;\u000e;>\u0011Y\\Qam:ȐWя`\u0015\u00171Km_2R\u0004\t\u0001<>\u007fO\u0010r\u0010u\rحRʘ-DQϱR\u0010\u001a`do+1 μNĞF\u0014\u001b2N\"ǘ\u001b[nL:ˡ\u0012\u000b5ވa̋(\u05f9\u0012nDZV\f{m-µƢ6"}, d2 = {"\u0012`c2C0<Y\u0019\f]^({\u00103n\u007f\u0013w?\u007f\u001b I", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u0001*LB?t6\u000f\u0011oq9\u00159", "\u0012`c2C0<Y\u0019\f]h9\u0001\u001e9n\u000f$\u0003+|\u0016\u0016Kx\u0010", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "5dc\u0011T;>>\u001d|\u0001^9_\u0013<i\u00152\u0005O|\u001e\u0002Cn\r@\u007f'", "u(5", "\u0014", "\u0012`c2C0<Y\u0019\fbh+|w9g\u0002/{+|\u0016\u0016Kx\u0010", "5dc\u0011T;>>\u001d|\u0001^9d\u0013.en2}B\b\u0017\u0002Cn\r@\u007f'", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y4A}%w8?:j8'\u0017Y]@\u0017c:$", "\u0012`c2C0<Y\u0019\fib;\u0004\t\u001aa~'\u007fI\u0003", "\u001b`g\u0010T3>\\\u0018z\bK6\u000f\u0017", "", "\u001bn]A[ >O&azb.\u007f\u0018", "5dc\u001ab5MV\r~vk\u000f|\r1h\u000f", " dR<`4>\\\u0018~yL0\u0012\t\u0010o\r\u0004y>\u0001%%Kl\u0012Cz4I", "5dc\u001fX*H[!~\u0004],{v3z\u007f\t\u0006M\\\u0015\u0015G}\u001c@s)<]\r4", "'dP?f\u0010G@#\u0011", "'dP?f\u001d>`(\u0003xZ3g\u0005.d\u00041}", "\u0012`c285M`-\\\u0005g;x\r8e\r", "", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "Bhc9X", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "6dP1_0GS", ";nS2G6@U ~Wn;\f\u00138", "1n[<e:", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006U!DYh$5s\u0016;+MBuA,j", "6dP1_0GS\b~\u000em\u001a\f\u001d6e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4#h\u0012'7C", "6dP1X9&W\"azb.\u007f\u0018", "1n]AX5M", "\u0012`c285M`-\\\u0005g;x\r8e\rowPN\u0011yKK", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@\u0004*Ft\u001a7\u0017HLs}\u001f%q_H\u000bm5\\@\bWUL;`\\{\nix`\u0018]2\u0011\u000e#F5v\u000e8/\u0011*X\u0006Eq\u000fUv\u001e>h\u007fF`\u0019\u0014O{{K8oJb)~XI\u000fc:m\nn!fCHmt\u0002\"\u0019wT8\u0013H)wn[xtqK\u0018\u000e\u0002\"HufPSo\u001fDp6\u001fX\u007fs\u0019\u007f\"S'\u0004-n8(<d\u0012)q\u001fHk\u0007j\u0013XJ&3@@\u0012R\u0015a\u007ftI\u0018v\u001f+\u0018\u0012,D1,t/RH\"\u0016K&o<a5a\u001eX\u0010MPs\u001epK\u0010J%z%\u0012\u00053qoRQd5\u0011#nS&i\u001aOXM\u0014%-#G]\u000e{s]AU\u001e\u0013v8U\tiL$tP\u00107)|cby26\u0006f-d$", "\u0012`c2C0<Y\u0019\f", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006U!DYh$5s\u0016;;R7z4s", "2`c296K[\u0015\u000e\n^9", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006U!DYh$5s\u0016;.MHs0-$hn\u000f", "Ag^D@6=S\b\t|`3|", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u00041h}\u000b;k\u001c.Z1JgC\u001ejO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\"^W65\f\tZE${\u001a\u001e\u001b\u0011+V\f?g\u0014U\u0014\u0018=uzPVYOu$uN-dM')XCPEM.b\u0012_*=DG,\u0010\u0001(\u001bu&\u0015\u0010\u0006b\u0018v[ClxOb{H-<|_PN}\u001f\u001d\u00050\u001dZ\u007f\u0002\u001b~.[1~<\u000b83\u007fi\u0016S1\u0019Ngv$0fJ5o\u0017L\u001c=Zg\u007fu\u000bc]\u0006]\u0011\ro?5\u0018x/aR\u0017\u0012g%[~i[\u00107_\n:P=^\u0006B\u000eBF}\u0013\u000f\u00071KoPM(bV\u0001lM!l\u001b\u0007\u0002ya\u001a8\u001eHc\u001dhslGV\"\rp8UYcK zV\u0010z!V?\u001b`", "\u0012`c2C0<Y\u0019\fXh5\f\t8t", "Ad[2V;>Rwz\n^\u0014\u0001\u00106i\u000e", "", "2hb=_(RS\u0018f\u0005g;\u007fp3l\u0007,\n", "=m3.g,,S ~xm0\u0007\u0012\rh{1}@", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "2`c2<5&W \u0006~l", "=m36f7EO-~yF6\u0006\u00182C\u0003$\u0005B\u0001", ";n]A[\u0010G;\u001d\u0006\u0002b:", "1`[2a+:`\u0001\ty^3", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\fIJ;t3\u001a\"Pk8\u0007j\u0002", "GdP?E(GU\u0019", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\u0013n\u000f\u0015wI\u0003\u0017l", "Ad[2V;:P ~YZ;|\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d%<Y{/3j\u001d.,?JkBs", "uKY.i(\bZ\u0015\b|(\u0013\u0007\u00121;d\u000f\u0002J\u0010\u001e\u001bP9\u0013M~n6i\u0007\u001eFq 7[\r\u001c{=\u001c$lkBR9\u0013T\u00016NPWuacz\u0007\u0015\"c\f]/\u0017\u000eg\u000b\u0005~M5.\f6RM\u0011O|\u0015\u0015\u001b?noU \u000eQ\u0002 \u007fO)2NUnyTEAiw.\u0010h,\\GC \u001b;v\u0017oP7\tw`x|Qyn=.\u001f\u0005G+Bv%SAxW<\u0003p\u0003T\u000bd\u000e;Zt\u0001[)\r37@h\u0004^1\u0016Hf\u0004\u001f:\\\u000b/\"E< CGjC6\u001d\nw\u001fL\f\fh5>yorkD\u001e\u0016]$1\u001c]h\u007fD\\\n=\\9\u00131N\nLiy^\u0011\u00033mrM?\"\"J\bpK\"] ~\u007fm\u0018z*%=gdO&h6Z\u001d\rgKUycK zV\u00107SnjW|(2\u007f^\u0013\u007f/Z<aVAu\u0010#\u0012\u000b\u0012\t*\u0002?)u?\u00122/AXK,^9\u0013r]0\u00191E,(<5\nR\nLh\u007f2\u001f\f\u000euRx!/", "\u0012`c2C0<Y\u0019\f]^({\t<", "Bhc9X\nH\\(~\u0004m\n\u0007\u00109r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "6dP1_0GSv\t\u0004m,\u0006\u0018\ro\u00072\t", ";h]\u0015X0@V(", "\u0012`c2C0<Y\u0019\f]^({\t<-\u000b&K-d\u0003\u0003", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@\u0004*Ft\u001a7\u0017HLs}\u001f%q_H\u000bm5\\@\bWUL;`\\{\niv?n51\u0017\u0014`E-8IH'Q-Y\u000b9w\u0005\u0016\u001f\u001c~K\u0001KT\u001fK\u0004\u001eB\u0017\u0010dOXl\u0004K@X,(n\u0014j'j:\u00041$z(\u001fpPwg\u0006[\u001c|`yt=+\\k", "\u0012`c2C0<Y\u0019\fhm(\f\t", ":nR._,", "\u001aiPCTuNb\u001d\u0006DE6z\u00056eU", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006T!<Y\u0007\u001f3z|8K?Bk\n", "7mXA\\(EA\u0019\u0006z\\;|\b\u000ea\u000f(cD\b\u001e\u001bU", "7mXA\\(E2\u001d\r\u0006e(\u0011\t.M\n1\u000bCh\u001b\u001eNs\u001c", "7mXA\\(E2\u001d\r\u0006e(\u0011p9d\u007f", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006U)Cd\u0005\u001cKU -M\u0019", "\u0012`c2C0<Y\u0019\fhm(\f\tvsb,\u0005\u000e])", "uKY.i(\bc(\u0003\u0002(\u0013\u0007\u0007+l\u007f}bE|(\u0013\u0011v\nExn\u001cc\u0007\"\rT\u001b*^?\u0005r0'\u00172HC\u0010e\u00025|1VSR5&_nF\u0016\u0012hW24\u001cqUJ&n\u001a\u001b\u0006\u00045H\u000fEl\u007f\u001f_\f?r{Ld\u0010\u0011\u0002\u0011\u0005A6lB`-C5ALb(s\b\\$\\\u001963\u0014\u007fn^OL7\t\t]\u0015qeCeqO$\u0005F$\buWUE|Y8{th*w\u0007\u0012\u001d\\r1t:qC&EdZ", "\u0012`h", "Ad[2V;>R", "=m29\\*D", "/mX:T;>1\u001c~xd,{", "3mP/_,=", "BnS.l", "7mA.a.>", "2db0e0Ib\u001d\t\u0004", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000bNd&A|\u001d2V\r@|<g\u0016xj7\u0016g6W\u0005p(\\W*kV|F^gO\u0003C s\nUR 8K3(\nu7\u0011Hl\n\u000ekt1soO`\u0014F\r^sK1sPg_CO=Tb7h\bfj&\u001963\u0014\\\u001d\u0019nP;g\u0006Z\u001b\u007f`ONmQ(\u0002<-\brlN\u000fpeEr6#U\u0005\u0006[\u0013h})\u00041\u000e=v\fK\u0001Tf%Hbw(uZK/1@J\u0013\tXs~{B\u0016hh?\u0012\u0016m??\u0019r;G\f\u007f", "\u0012hb=_(R;#}zM6~\u000b6e\\8\u000bO\u000b ", "2hb=_(R;#}z", "=m36f7EO-f\u0005],Z\f+n\u0002(", "\u0012hb=_(R;#}zM6~\u000b6e\\8\u000bO\u000b ^VOz\tiwC", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b=d&A|\u001d2V\r@|<g\u0016xj7\u0016g6W\u0005p(\\W*kV|F_gA\nW*\u001a\u000f]@78BA'\u00136W\u0002\u0005u\u0011\u0015%\u0012=j: `\u0018R\u0004#uN~L\nJ", "\u0016na6m6Gb\u0015\u0006bh5\f\f=L\u00046\u000b", ":`iF?0Lb\u0007\u000evm,", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i\u001ei+B4GIz\"-\u0011wa\u000f", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001T\u0012Ca*?yC\f$dp9\\J1J\b#\u0011SJ5^\u001cYG\u001d\u00140tT5\u001c\f]JmsU?h\t<R\u007fJl\u000b\u0015$W\u0016zy@e\u0014Q\u0003`K(/rU`c\u0003\u0011FVjse\u001ch\u001bk>D-\";y+qN=\u000e\u0006\\\\H9upfT#~77\bkeNPyc<>/\u001bZ{\u0005\u0016._Btx6\u001347?`\f\u0015E\u0014E^\u0002\u0014(i)1%6Ch&Qm\u0005sB\u00172,]\u0011\u0010bCz|ntPD\u0018\t]lB1j^\u000eAV\u0005Q\u0013m\u001f/Q\tP[C\u001d\u0005\u0016$ziEJh\u001e_\u0016\u007fD\rc\u000f\t\u0003sx&;\u001e9h\u001eh75\u001eI\u001c\buB\u0010zl\r\u0013zP\u001bwYr%_k36\u0006\u0015E(\u0001\u0015*vYCm\u001f\u00121\b\u000b]\u0019\u0003iPO\u001d\u000f.$Jc<asx\tq[-#u8e')@\u0002_DjeEpsy\u001dhg\u0019[D8\u000f\u0011KPt/J92\u0001EY_\u001a0L(x^~\u001eMe\u00025\u0014{\u001e\t\u0013/\u0001\u0013e\n0}R)u\u001b<<oOz", "\u001bn]A[", ";n]A[", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\fIJ;t3\u001a\"PkB\u0016f\u0002", "BnS.l\u0014BZ \u0003\t", "AsP?g\u000b:b\u0019f~e3\u0001\u0017", "3mS\u0011T;>;\u001d\u0006\u0002b:", "@`]4X\u001a>Z\u0019|\nb6\u0006l8f\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d%<Y{/7l\u0003*VE;O=\u001f\u001f>", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@)>h}-@i\u001dw+?Bk=\u001d\u0011uIC\u0010r/$]-Q[U0e\u001cwN\u001c[[\u001eW)\u001c\tcJ28%G(\u0006;M\fD4Vp|\u00131{l\f]\fP{^\\K2j\u001c@duX=\u000fi&m\u000e)\u0004fC<yzm\"\u001auZ2\t\u000f\u001d\u000f|Z\u0005quGb\u000343>z_BL=\u001f*t.\u001fI\u000bw\u0011\u001fT}-t\u0011\r54\fK\u0001Tf%Hbw(uZK/1@J\u0013\tS_\u0005lK\u0012d&/Ql^D1\u0004iciH\u001cgg$c1pn\u0001D(l:Rn\"1J}U%w\u001f\u0011\u0012.{e\u0013K\u0017c\u0001't@)-Zp\u0003m\u0018\u001a=\u0012:`\u000fG&n7[hodA\u000b\tcG\u0014\u0004\u0012\u000ewS}eeom>t I.7GCD\u001c\"k\u001f\u0016\u001f\u0005\t\u0005\u001d\u0001GL\u0001@ 3z$UAam9\u000fffk\u0017q@');1K_Pwm{/\u0015Gkr\u0005 gL8\u000f\t%\r[", "\u001bn]A[:'O*\u0003|Z;\u0001\u00138", "<dgA4=:W zwe,", ">qTC\\6Nat\u0010vb3x\u00066e", "GdP?C0<Y\u0019\fkb:\u0001\u00066e", "GdP?C0<Y\u0019\fi^?\f", "=m=2k;\u001cZ\u001d|\u0001^+", "=m??X=B])\rXe0z\u000f/d", "=mH2T9)W\u0017\u0005zk\t\r\u0018>o\t\u0006\u0003D~\u001d\u0017F", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000bNr\u0015\u001er\u0012?I\rBg= ^VpF\u000bl.$]-Q[U0e\u001cwN\u001c[[\u001eW)\u001c\tcJ28%G(\u0006;M\fD3Vr\u001c\u0018DqtK \u0015X\u0002^vQ2fU]i\u0003U\u000b&r3b\u001bc'e\u0005\u0010\u000b\u001a{(\"lYw\u000f\r[Zsb\u0003evK#\u0004Fm\u001f}dDTs_E?|\u0006G\u0005v\u001f<\\s>>+\u000e<5@r\u0005\u0015o\u0014M^\u0006\u0019(c\u000fp\u00052K\u0013*Oa{lKkr&k\u0015\u001c8\u001c-\"drmL\u000e\u001a'\u0015e=li\u000f7\u001c\u0013NR~\u0019/FH e\u0002 \u0013\u0015$z;-\u0007\f", "!vXAV/:P ~YZ;|h8t\r<YJ\n&\u0017P~", "!vXAV/:P ~YZ;|h8t\r<YJ\n&\u0017P~U;H)1j\u000f\"", "uKY.i(\bZ\u0015\b|(\u0013\u0007\u00121;d\fbF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u0010/\u00025|1VSR5&W\u0004E]\u0013j\u0017L:\u0011\u000fbOmOT@\u001d\u00170S\u000b\u0007>g\b\u001f\rBttAiYE\u0004\u001d\u0001K7h\u0010a[\tGNI^12Uc&k:G-\u0010xbxdW.\u0013zO\u001eZ\\xgn\u001d\u007f\u0001B3Eqd\u0010Rk^>t5h/\u0005\u0007~.av+J\u0014\u007f=)Cn\tJza<h\u0001 6jAp.2K\u0013LO_|:\bld.ar\u0012`;1&FopP\u000b\u0016l\u0017h\u000bH[\n6_\u0010BH\u0003^%P\u0007Me\b\u0015R\u000f |eVG\u0017[Nc^D)_\u000f\u0012~c\u001f\u001c\r\u0012LY\u001d>\u0011[@L \u0013l7\u001fEWM\u001d{R\u001em\u0015zWfo1:t\u0018\u0017j\u0012GKv=Gm\u0016\u0016A^\u0015\u0006'\u0001w\u0018`2\u001c$2G]7u*-\u0015o^,'g\u0002)/6@\u0006Z@8<\u0002/ \b\u001ch\njA\u0002)", "%dT87(Ra", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u00041h}\u000b;k\u001c.Z!Er>+#>H5\u0010b9Xz&Z\u0016L6d]|K\u0014[b\n]+\u001a\tUHq8H@.\b9R}B2^\b\u001d\u000e>ilO>\u001aFy\u001cK(%qEfi}FT\u000f`4l\u0017i+\\\u0004G4\u001d\u0001\u001d#h\u001a\f\u0014\u0004^\u001b\u0001R\u0007=K\u000b\n", "'dP?", "1ta?X5MG\u0019z\b", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000bNr\u0007=w%5QL\u0005pE&^iqB\u0005r0X\u007f5\u0011-^5ZavG\u001d\\0\u000350\t\u0016U\u000b+jM9hu;V\u0006DjVr\u0012\u00174wzFU#\u0011w\u001f}L3vF#guVARf&kY){XI:\u000f\u0018o\u001f\u001bu.8\u0011\u0006`\u001fH9\u007fqvN\u001d\u0004\u0002)Ou%GUxSKx1(YEX\";V\u0004/~6P\n\u00112m\u0004Xq\u001c=qB\u00136dL146\u0006 OTryt>WF)i\u0013\u0018p5>nI)T", "'dP?C0<Y\u0019\f", "=mH2T9,S ~xm,{", "GdP?", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b>d&A|\u001d2V\r@|<g\u0016xj7\u0016g6W\u0005p(\\W*kV|F_gA\nW*\u001a\u000f]@78BA'\u00136W\u0002\u0005p|\u001b\u0016\u001b9fw\u0010 }G\u0001\u0015sP%eMY>uVAS8\u0011`\u0015^*f>97]o##sZ<\nE[\r\u0002R\u0007kcNfD<-MmhOAv\u001f\u001ap.\u001fTzs\u001f\u001abs+{\u0003j:4Ek\tT1%:gz\u0015:&%05#8\u001cAK9\\hG\ru)e\u0007!,3;!poqHX\u000fY&[Be[\b\u0005\u001cd:Xo\u007f+D\u0005BhW\u001f\u0010\u00111{;0?$S\u000e$tC5)\u000f\r\u000bq\"*._Ji\u0018w.g7\u0017p\u0013pC\u0016\nYPjT\f\u0001", "'dP?C0<Y\u0019\fb^5\re?t\u000f2\u0005", "3w_.a+>R", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$S\u0015\u001ei\u001f-ZM?jGg\u0013riD\u0011q,\u0018\u0007+\u00114X+`Sv=!gA\u0014X:\u0014\tb\u000b)\u007fL\u0001 \u00185G\u0011?r\n\u001a_nEsnQZ\u001aPFj\\=2gSccxZ\u000bCl2o\u0016m\u001d&GJ-#u!\u001b2.8\u0012\u0007]\u001fr_OKK\u000b\n", "1tbAb4,Q&\t\u0002e\bz\u00183o\t6", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~7\u000e.Fw\u001e\nKA;yB\"\u0012lh=\u0016w\bL\u0006+QU$", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`'\u0016_;NL", "1na<h;B\\\u0019lxh7|", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "Aba<_3.^\u007fzw^3", "Aba<_3\u001d]+\baZ)|\u0010", "2`h\u0010b5MS\"\u000eY^:z\u00163p\u000f,\u0006I", "@`]4X\u001a>Z\u0019|\nb6\u0006h8a|/{?", "7rC<W(R", "7rBAT9M2\u0015\u000ez", "7r4;W\u000b:b\u0019", "7r8;E(GU\u0019", "uYI'M!%O\"}\bh0{\u001cxc\n0\u0007J\u000f\u0017`T\u007f\u0017Kz-5#[*?x <MP\u0011Ow\u0005\u001adr5Pj(Wxp5[[0eTH", "<t\\/X9(T\u0001\t\u0004m/\u000bl8R{1}@", "@d\\2`)>`wz\n^\u0017\u0001\u00075e\r\u0016\u000b<\u0010\u0017", "@d\\2`)>`wz\n^\u0017\u0001\u00075e\r\u0016\u000b<\u0010\u0017^'_X;T\u0007\u0015", "uKY.i(\bZ\u0015\b|(\u0013\u0007\u00121;f-wQ|`\u001eCx\u0010\u0006]/>[S\u0007=w%5QL\u0005x0'\u0017ho\u0003jl;;r0IL$\u0010CN{<!\u001c^\rat\u000b\u000faL.|D\u0001'\u0004;I\u000f?d\bY_{5qp@e\fD\u0001\u0015T=8hT/FuP@Rl.c\u001f)\u001bfBE.\"qb(xY=\u000e\u0004SZP\\\u0002rqU\u0019\b\u000e\b\"1BBNnbFx&2\u0015y\u0002\u001a=b\u0003+>5\u007fC*Ch\u0001R5a\u001dZ\b\u0015\u0017`?-&C*\";ZcK", "CoS.g,\u001dW'\n\u0002Z@|\b\u0017o\t7~", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001T\u0012Ca*?yC\f$dp9\\J2X\u0006.KU\u00181mZ<>$\u001bX\u001dR5\u0016\u0013#\"4wBF#\u00125\u0015W\"d\n\u000b#\u00189i\u0004\fT\u001aO\u0005\u001f\u0004ArpBh_\u0007K=L0sh\u0015n\u001diC6+]O\u0015\"hY-\u0006\t;\u001bqR\u0001=NM#\n?(G7hBNqUJ>\u000b(Zhs\u001b4XJ\u0012z7\u0013;.?.\u0003Ut\"Nm|\u001e,j\u000b\u00050?K\u0017H[_\u0005pH\u0017>bH\r\ns1z ane\u0012x\u0004b\u0017YD7", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class DatePickerKt {
    private static final PaddingValues DatePickerHeadlinePadding;
    private static final float DatePickerHorizontalPadding;
    private static final PaddingValues DatePickerModeTogglePadding;
    private static final PaddingValues DatePickerTitlePadding;
    private static final int MaxCalendarRows = 6;
    private static final int YearsInRow = 3;
    private static final float YearsVerticalPadding;
    private static final float RecommendedSizeForAccessibility = Dp.m6638constructorimpl(48);
    private static final float MonthYearHeight = Dp.m6638constructorimpl(56);

    /* JADX WARN: Removed duplicated region for block: B:113:0x02b5  */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void DatePicker(final androidx.compose.material3.DatePickerState r16, androidx.compose.ui.Modifier r17, androidx.compose.material3.DatePickerFormatter r18, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r19, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r20, boolean r21, androidx.compose.material3.DatePickerColors r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instruction units count: 749
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerKt.DatePicker(androidx.compose.material3.DatePickerState, androidx.compose.ui.Modifier, androidx.compose.material3.DatePickerFormatter, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.material3.DatePickerColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: renamed from: rememberDatePickerState-EU0dCGE, reason: not valid java name */
    public static final DatePickerState m2050rememberDatePickerStateEU0dCGE(Long l2, Long l3, IntRange intRange, int i2, SelectableDates selectableDates, Composer composer, int i3, int i4) {
        final int iM2087getPickerjFl4v0 = i2;
        final SelectableDates allDates = selectableDates;
        final Long l4 = l3;
        final IntRange yearRange = intRange;
        final Long l5 = l2;
        ComposerKt.sourceInformationMarkerStart(composer, 2065763010, "C(rememberDatePickerState)P(2,1,4,0:c#material3.DisplayMode)365@15667L15,*366@15771L383,366@15694L460:DatePicker.kt#uh7d8r");
        if ((-1) - (((-1) - i4) | ((-1) - 1)) != 0) {
            l5 = null;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 2)) != 0) {
            l4 = l5;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 4)) != 0) {
            yearRange = DatePickerDefaults.INSTANCE.getYearRange();
        }
        if ((i4 + 8) - (i4 | 8) != 0) {
            iM2087getPickerjFl4v0 = DisplayMode.Companion.m2087getPickerjFl4v0();
        }
        if ((-1) - (((-1) - i4) | ((-1) - 16)) != 0) {
            allDates = DatePickerDefaults.INSTANCE.getAllDates();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2065763010, i3, -1, "androidx.compose.material3.rememberDatePickerState (DatePicker.kt:364)");
        }
        final Locale localeDefaultLocale = CalendarLocale_androidKt.defaultLocale(composer, 0);
        Object[] objArr = new Object[0];
        Saver<DatePickerStateImpl, Object> Saver = DatePickerStateImpl.Companion.Saver(allDates, localeDefaultLocale);
        ComposerKt.sourceInformationMarkerStart(composer, -390857660, "CC(remember):DatePicker.kt#9igjgp");
        int i5 = ((-1) - (((-1) - ((-1) - (((-1) - (((((14 & i3) ^ 6) <= 4 || !composer.changed(l5)) && (-1) - (((-1) - i3) | ((-1) - 6)) != 4) ? 0 : 1)) & ((-1) - (((((112 & i3) ^ 48) <= 32 || !composer.changed(l4)) && (i3 + 48) - (48 | i3) != 32) ? 0 : 1))))) & ((-1) - (composer.changedInstance(yearRange) ? 1 : 0)))) | ((((((i3 + 7168) - (7168 | i3)) ^ 3072) <= 2048 || !composer.changed(iM2087getPickerjFl4v0)) && (-1) - (((-1) - i3) | ((-1) - 3072)) != 2048) ? 0 : 1) | ((((((-1) - (((-1) - 57344) | ((-1) - i3))) ^ 24576) > 16384 && composer.changed(allDates)) || (i3 & 24576) == 16384) ? 1 : 0);
        boolean zChangedInstance = composer.changedInstance(localeDefaultLocale);
        int i6 = (i5 + (zChangedInstance ? 1 : 0)) - (i5 & (zChangedInstance ? 1 : 0));
        Object objRememberedValue = composer.rememberedValue();
        if (i6 != 0 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = (Function0) new Function0<DatePickerStateImpl>() { // from class: androidx.compose.material3.DatePickerKt$rememberDatePickerState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final DatePickerStateImpl invoke() {
                    return new DatePickerStateImpl(l5, l4, yearRange, iM2087getPickerjFl4v0, allDates, localeDefaultLocale, null);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        DatePickerStateImpl datePickerStateImpl = (DatePickerStateImpl) RememberSaveableKt.m3764rememberSaveable(objArr, (Saver) Saver, (String) null, (Function0) objRememberedValue, composer, 0, 4);
        datePickerStateImpl.setSelectableDates(allDates);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return datePickerStateImpl;
    }

    /* JADX INFO: renamed from: DatePickerState-sHin3Bw$default, reason: not valid java name */
    public static /* synthetic */ DatePickerState m2046DatePickerStatesHin3Bw$default(Locale locale, Long l2, Long l3, IntRange intRange, int i2, SelectableDates selectableDates, int i3, Object obj) {
        if ((i3 + 2) - (2 | i3) != 0) {
            l2 = null;
        }
        if ((i3 + 4) - (4 | i3) != 0) {
            l3 = l2;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
            intRange = DatePickerDefaults.INSTANCE.getYearRange();
        }
        if ((16 & i3) != 0) {
            i2 = DisplayMode.Companion.m2087getPickerjFl4v0();
        }
        if ((i3 & 32) != 0) {
            selectableDates = DatePickerDefaults.INSTANCE.getAllDates();
        }
        return m2045DatePickerStatesHin3Bw(locale, l2, l3, intRange, i2, selectableDates);
    }

    /* JADX INFO: renamed from: DatePickerState-sHin3Bw, reason: not valid java name */
    public static final DatePickerState m2045DatePickerStatesHin3Bw(Locale locale, Long l2, Long l3, IntRange intRange, int i2, SelectableDates selectableDates) {
        return new DatePickerStateImpl(l2, l3, intRange, i2, selectableDates, locale, null);
    }

    /* JADX INFO: renamed from: DateEntryContainer-au3_HiA, reason: not valid java name */
    public static final void m2043DateEntryContainerau3_HiA(Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final DatePickerColors datePickerColors, final TextStyle textStyle, final float f2, final Function2<? super Composer, ? super Integer, Unit> function24, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1507356255);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(DateEntryContainer)P(6,7,3,5!1,4,2:c#ui.unit.Dp)1309@61230L1775:DatePicker.kt#uh7d8r");
        Modifier modifier2 = modifier;
        if ((i2 & 6) == 0) {
            int i4 = composerStartRestartGroup.changed(modifier2) ? 4 : 2;
            i3 = (i4 + i2) - (i4 & i2);
        } else {
            i3 = i2;
        }
        if ((i2 + 48) - (i2 | 48) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changedInstance(function2) ? 32 : 16)));
        }
        if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changedInstance(function22) ? 256 : 128)));
        }
        if ((i2 & 3072) == 0) {
            int i5 = composerStartRestartGroup.changedInstance(function23) ? 2048 : 1024;
            i3 = (i3 + i5) - (i3 & i5);
        }
        if ((i2 & 24576) == 0) {
            int i6 = composerStartRestartGroup.changed(datePickerColors) ? 16384 : 8192;
            i3 = (i3 + i6) - (i3 & i6);
        }
        if ((196608 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(textStyle) ? 131072 : 65536;
        }
        if ((1572864 + i2) - (1572864 | i2) == 0) {
            int i7 = composerStartRestartGroup.changed(f2) ? 1048576 : 524288;
            i3 = (i3 + i7) - (i3 & i7);
        }
        if ((12582912 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function24) ? 8388608 : 4194304;
        }
        if ((-1) - (((-1) - 4793491) | ((-1) - i3)) != 4793490 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1507356255, i3, -1, "androidx.compose.material3.DateEntryContainer (DatePicker.kt:1308)");
            }
            modifier2 = modifier2;
            Modifier modifierM573backgroundbw27NRU$default = BackgroundKt.m573backgroundbw27NRU$default(SemanticsModifierKt.semantics$default(SizeKt.m1067sizeInqDBjuR0$default(modifier2, DatePickerModalTokens.INSTANCE.m3159getContainerWidthD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DatePickerKt$DateEntryContainer$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    SemanticsPropertiesKt.setContainer(semanticsPropertyReceiver, true);
                }
            }, 1, null), datePickerColors.m2014getContainerColor0d7_KjU(), null, 2, null);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM573backgroundbw27NRU$default);
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
            Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384862393, "C87@4365L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 133465402, "C1325@61799L1182,1319@61549L1432,1351@62990L9:DatePicker.kt#uh7d8r");
            Modifier.Companion companion = Modifier.Companion;
            long jM2033getTitleContentColor0d7_KjU = datePickerColors.m2033getTitleContentColor0d7_KjU();
            long jM2026getHeadlineContentColor0d7_KjU = datePickerColors.m2026getHeadlineContentColor0d7_KjU();
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-229007058, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$DateEntryContainer$2$1
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
                    Arrangement.HorizontalOrVertical end;
                    ComposerKt.sourceInformation(composer2, "C1326@61813L1158:DatePicker.kt#uh7d8r");
                    if ((-1) - (((-1) - i8) | ((-1) - 3)) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-229007058, i8, -1, "androidx.compose.material3.DateEntryContainer.<anonymous>.<anonymous> (DatePicker.kt:1326)");
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
                    final Function2<Composer, Integer, Unit> function25 = function22;
                    Function2<Composer, Integer, Unit> function26 = function23;
                    Function2<Composer, Integer, Unit> function27 = function2;
                    DatePickerColors datePickerColors2 = datePickerColors;
                    TextStyle textStyle2 = textStyle;
                    ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer2, 0);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default);
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
                    Updater.m3678setimpl(composerM3671constructorimpl2, measurePolicyColumnMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m3678setimpl(composerM3671constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                    if (composerM3671constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM3671constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM3671constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m3678setimpl(composerM3671constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, 1718813547, "C1333@62174L520:DatePicker.kt#uh7d8r");
                    if (function25 == null || function26 == null) {
                        if (function25 != null) {
                            end = Arrangement.INSTANCE.getStart();
                        } else {
                            end = Arrangement.INSTANCE.getEnd();
                        }
                    } else {
                        end = Arrangement.INSTANCE.getSpaceBetween();
                    }
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
                    Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                    ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(end, centerVertically, composer2, 48);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default2);
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
                    Updater.m3678setimpl(composerM3671constructorimpl3, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m3678setimpl(composerM3671constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                    if (composerM3671constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM3671constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM3671constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m3678setimpl(composerM3671constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                    final RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, -1252979940, "C:DatePicker.kt#uh7d8r");
                    composer2.startReplaceGroup(-1287344744);
                    ComposerKt.sourceInformation(composer2, "1339@62501L106,1339@62457L150");
                    if (function25 != null) {
                        TextKt.ProvideTextStyle(textStyle2, ComposableLambdaKt.rememberComposableLambda(-962031352, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$DateEntryContainer$2$1$1$1$1
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

                            public final void invoke(Composer composer3, int i9) {
                                ComposerKt.sourceInformation(composer3, "C1340@62531L50:DatePicker.kt#uh7d8r");
                                if ((i9 + 3) - (3 | i9) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-962031352, i9, -1, "androidx.compose.material3.DateEntryContainer.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1340)");
                                }
                                Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, Modifier.Companion, 1.0f, false, 2, null);
                                Function2<Composer, Integer, Unit> function28 = function25;
                                ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                                ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer3, modifierWeight$default);
                                Function0<ComposeUiNode> constructor4 = ComposeUiNode.Companion.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor4);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM3671constructorimpl4 = Updater.m3671constructorimpl(composer3);
                                Updater.m3678setimpl(composerM3671constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                                Updater.m3678setimpl(composerM3671constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                                if (composerM3671constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                    composerM3671constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                    composerM3671constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                }
                                Updater.m3678setimpl(composerM3671constructorimpl4, modifierMaterializeModifier4, ComposeUiNode.Companion.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(composer3, 1398677055, "C1340@62569L10:DatePicker.kt#uh7d8r");
                                function28.invoke(composer3, 0);
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
                        }, composer2, 54), composer2, 48);
                    }
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(-1287336668);
                    ComposerKt.sourceInformation(composer2, "1343@62668L8");
                    if (function26 != null) {
                        function26.invoke(composer2, 0);
                    }
                    composer2.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.startReplaceGroup(1995137078);
                    ComposerKt.sourceInformation(composer2, "1347@62893L46");
                    if (function27 != null || function25 != null || function26 != null) {
                        DividerKt.m2090HorizontalDivider9IZ8Weo(null, 0.0f, datePickerColors2.m2025getDividerColor0d7_KjU(), composer2, 0, 3);
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
                    }
                }
            }, composerStartRestartGroup, 54);
            int i8 = (i3 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (112 | i3);
            m2044DatePickerHeaderpc5RIQQ(companion, function2, jM2033getTitleContentColor0d7_KjU, jM2026getHeadlineContentColor0d7_KjU, f2, composableLambdaRememberComposableLambda, composerStartRestartGroup, (-1) - (((-1) - ((i8 + 196614) - (i8 & 196614))) & ((-1) - ((-1) - (((-1) - 57344) | ((-1) - (i3 >> 6)))))));
            function24.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 21) & 14));
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
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
            final Modifier modifier3 = modifier2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$DateEntryContainer$3
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
                    Modifier modifier4 = modifier3;
                    Function2<Composer, Integer, Unit> function25 = function2;
                    Function2<Composer, Integer, Unit> function26 = function22;
                    Function2<Composer, Integer, Unit> function27 = function23;
                    DatePickerColors datePickerColors2 = datePickerColors;
                    TextStyle textStyle2 = textStyle;
                    float f3 = f2;
                    Function2<Composer, Integer, Unit> function28 = function24;
                    int i10 = i2;
                    DatePickerKt.m2043DateEntryContainerau3_HiA(modifier4, function25, function26, function27, datePickerColors2, textStyle2, f3, function28, composer2, RecomposeScopeImplKt.updateChangedFlags((i10 + 1) - (i10 & 1)));
                }
            });
        }
    }

    /* JADX INFO: renamed from: DisplayModeToggleButton-tER2X8s, reason: not valid java name */
    public static final void m2047DisplayModeToggleButtontER2X8s(final Modifier modifier, final int i2, final Function1<? super DisplayMode, Unit> function1, Composer composer, final int i3) {
        int i4;
        boolean z2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1393846115);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(DisplayModeToggleButton)P(1,0:c#material3.DisplayMode):DatePicker.kt#uh7d8r");
        if ((-1) - (((-1) - i3) | ((-1) - 6)) == 0) {
            int i5 = composerStartRestartGroup.changed(modifier) ? 4 : 2;
            i4 = (i5 + i3) - (i5 & i3);
        } else {
            i4 = i3;
        }
        if ((48 & i3) == 0) {
            i4 |= composerStartRestartGroup.changed(i2) ? 32 : 16;
        }
        if ((i3 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (384 | i3) == 0) {
            int i6 = composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
            i4 = (i4 + i6) - (i4 & i6);
        }
        if ((i4 + 147) - (147 | i4) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1393846115, i4, -1, "androidx.compose.material3.DisplayModeToggleButton (DatePicker.kt:1361)");
            }
            if (DisplayMode.m2082equalsimpl0(i2, DisplayMode.Companion.m2087getPickerjFl4v0())) {
                composerStartRestartGroup.startReplaceGroup(-411219388);
                ComposerKt.sourceInformation(composerStartRestartGroup, "1363@63278L42,1363@63257L262");
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -428906382, "CC(remember):DatePicker.kt#9igjgp");
                z2 = (-1) - (((-1) - i4) | ((-1) - 896)) == 256;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z2 || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.DatePickerKt$DisplayModeToggleButton$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
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
                            function1.invoke(DisplayMode.m2079boximpl(DisplayMode.Companion.m2086getInputjFl4v0()));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                IconButtonKt.IconButton((Function0) objRememberedValue, modifier, false, null, null, ComposableSingletons$DatePickerKt.INSTANCE.m1978getLambda1$material3_release(), composerStartRestartGroup, (-1) - (((-1) - ((i4 << 3) & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)) & ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE)), 28);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-410937381);
                ComposerKt.sourceInformation(composerStartRestartGroup, "1370@63562L43,1370@63541L271");
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -428897293, "CC(remember):DatePicker.kt#9igjgp");
                z2 = (i4 + 896) - (896 | i4) == 256;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.DatePickerKt$DisplayModeToggleButton$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
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
                            function1.invoke(DisplayMode.m2079boximpl(DisplayMode.Companion.m2087getPickerjFl4v0()));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                int i7 = i4 << 3;
                IconButtonKt.IconButton((Function0) objRememberedValue2, modifier, false, null, null, ComposableSingletons$DatePickerKt.INSTANCE.m1979getLambda2$material3_release(), composerStartRestartGroup, (-1) - (((-1) - ((i7 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i7 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION))) & ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE)), 28);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$DisplayModeToggleButton$3
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
                    DatePickerKt.m2047DisplayModeToggleButtontER2X8s(modifier, i2, function1, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i3) & ((-1) - 1))));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: SwitchableDateEntryContent-d7iavvg, reason: not valid java name */
    public static final void m2048SwitchableDateEntryContentd7iavvg(Long l2, final long j2, final int i2, Function1<? super Long, Unit> function1, final Function1<? super Long, Unit> function12, final CalendarModel calendarModel, final IntRange intRange, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, Composer composer, final int i3) {
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-895379221);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SwitchableDateEntryContent)P(8,4,3:c#material3.DisplayMode,5,6!1,9,2,7)*1399@64608L7,1407@64864L2301,1451@67222L1081,1400@64644L3659:DatePicker.kt#uh7d8r");
        final Long l3 = l2;
        if ((i3 & 6) == 0) {
            int i5 = composerStartRestartGroup.changed(l3) ? 4 : 2;
            i4 = (i5 + i3) - (i5 & i3);
        } else {
            i4 = i3;
        }
        if ((i3 + 48) - (i3 | 48) == 0) {
            i4 |= composerStartRestartGroup.changed(j2) ? 32 : 16;
        }
        if ((-1) - (((-1) - i3) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            i4 |= composerStartRestartGroup.changed(i2) ? 256 : 128;
        }
        final Function1<? super Long, Unit> function13 = function1;
        if ((i3 & 3072) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            i4 |= composerStartRestartGroup.changedInstance(function13) ? 2048 : 1024;
        }
        if ((i3 + 24576) - (i3 | 24576) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function12) ? 16384 : 8192;
        }
        if ((-1) - (((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) | ((-1) - i3)) == 0) {
            int i6 = composerStartRestartGroup.changedInstance(calendarModel) ? 131072 : 65536;
            i4 = (i4 + i6) - (i4 & i6);
        }
        if ((1572864 & i3) == 0) {
            int i7 = composerStartRestartGroup.changedInstance(intRange) ? 1048576 : 524288;
            i4 = (i4 + i7) - (i4 & i7);
        }
        if ((12582912 & i3) == 0) {
            int i8 = (16777216 & i3) == 0 ? composerStartRestartGroup.changed(datePickerFormatter) : composerStartRestartGroup.changedInstance(datePickerFormatter) ? 8388608 : 4194304;
            i4 = (i4 + i8) - (i4 & i8);
        }
        if ((100663296 & i3) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(selectableDates) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432)));
        }
        if ((805306368 + i3) - (805306368 | i3) == 0) {
            i4 |= composerStartRestartGroup.changed(datePickerColors) ? 536870912 : 268435456;
        }
        if ((-1) - (((-1) - 306783379) | ((-1) - i4)) == 306783378 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-895379221, i4, -1, "androidx.compose.material3.SwitchableDateEntryContent (DatePicker.kt:1396)");
            }
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final int i9 = -((Density) objConsume).mo704roundToPx0680j_4(Dp.m6638constructorimpl(48));
            DisplayMode displayModeM2079boximpl = DisplayMode.m2079boximpl(i2);
            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(Modifier.Companion, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    SemanticsPropertiesKt.setContainer(semanticsPropertyReceiver, true);
                }
            }, 1, null);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -742566717, "CC(remember):DatePicker.kt#9igjgp");
            boolean zChanged = composerStartRestartGroup.changed(i9);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = (Function1) new Function1<AnimatedContentTransitionScope<DisplayMode>, ContentTransform>() { // from class: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final ContentTransform invoke(AnimatedContentTransitionScope<DisplayMode> animatedContentTransitionScope) {
                        ContentTransform contentTransform;
                        if (DisplayMode.m2082equalsimpl0(animatedContentTransitionScope.getTargetState().m2085unboximpl(), DisplayMode.Companion.m2086getInputjFl4v0())) {
                            EnterTransition enterTransitionPlus = EnterExitTransitionKt.slideInVertically$default(null, new Function1<Integer, Integer>() { // from class: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$2$1.1
                                public final Integer invoke(int i10) {
                                    return Integer.valueOf(i10);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                                    return invoke(num.intValue());
                                }
                            }, 1, null).plus(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(100, 100, null, 4, null), 0.0f, 2, null));
                            ExitTransition exitTransitionFadeOut$default = EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(100, 0, null, 6, null), 0.0f, 2, null);
                            final int i10 = i9;
                            contentTransform = AnimatedContentKt.togetherWith(enterTransitionPlus, exitTransitionFadeOut$default.plus(EnterExitTransitionKt.slideOutVertically$default(null, new Function1<Integer, Integer>() { // from class: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$2$1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                public final Integer invoke(int i11) {
                                    return Integer.valueOf(i10);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                                    return invoke(num.intValue());
                                }
                            }, 1, null)));
                        } else {
                            TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(0, 50, null, 5, null);
                            final int i11 = i9;
                            contentTransform = AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInVertically(tweenSpecTween$default, new Function1<Integer, Integer>() { // from class: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$2$1.3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                                    return invoke(num.intValue());
                                }

                                public final Integer invoke(int i12) {
                                    return Integer.valueOf(i11);
                                }
                            }).plus(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(100, 100, null, 4, null), 0.0f, 2, null)), EnterExitTransitionKt.slideOutVertically$default(null, new Function1<Integer, Integer>() { // from class: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$2$1.4
                                public final Integer invoke(int i12) {
                                    return Integer.valueOf(i12);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                                    return invoke(num.intValue());
                                }
                            }, 1, null).plus(EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(100, 0, null, 6, null), 0.0f, 2, null)));
                        }
                        return animatedContentTransitionScope.using(contentTransform, AnimatedContentKt.SizeTransform(true, new Function2<IntSize, IntSize, FiniteAnimationSpec<IntSize>>() { // from class: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$2$1.5
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ FiniteAnimationSpec<IntSize> invoke(IntSize intSize, IntSize intSize2) {
                                return m2052invokeTemP2vQ(intSize.m6812unboximpl(), intSize2.m6812unboximpl());
                            }

                            /* JADX INFO: renamed from: invoke-TemP2vQ, reason: not valid java name */
                            public final FiniteAnimationSpec<IntSize> m2052invokeTemP2vQ(long j3, long j4) {
                                return AnimationSpecKt.tween$default(500, 0, MotionTokens.INSTANCE.getEasingEmphasizedDecelerateCubicBezier(), 2, null);
                            }
                        }));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            l3 = l3;
            function13 = function13;
            int i10 = i4 >> 6;
            AnimatedContentKt.AnimatedContent(displayModeM2079boximpl, modifierSemantics$default, (Function1) objRememberedValue, null, "DatePickerDisplayModeAnimation", null, ComposableLambdaKt.rememberComposableLambda(-459778869, true, new Function4<AnimatedContentScope, DisplayMode, Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, DisplayMode displayMode, Composer composer2, Integer num) {
                    m2053invokefYndouo(animatedContentScope, displayMode.m2085unboximpl(), composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke-fYndouo, reason: not valid java name */
                public final void m2053invokefYndouo(AnimatedContentScope animatedContentScope, int i11, Composer composer2, int i12) {
                    ComposerKt.sourceInformation(composer2, "CP(0:c#material3.DisplayMode):DatePicker.kt#uh7d8r");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-459778869, i12, -1, "androidx.compose.material3.SwitchableDateEntryContent.<anonymous> (DatePicker.kt:1452)");
                    }
                    if (DisplayMode.m2082equalsimpl0(i11, DisplayMode.Companion.m2087getPickerjFl4v0())) {
                        composer2.startReplaceGroup(-1870116901);
                        ComposerKt.sourceInformation(composer2, "1454@67304L534");
                        DatePickerKt.DatePickerContent(l3, j2, function13, function12, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, composer2, 0);
                        composer2.endReplaceGroup();
                    } else if (DisplayMode.m2082equalsimpl0(i11, DisplayMode.Companion.m2086getInputjFl4v0())) {
                        composer2.startReplaceGroup(-1870098348);
                        ComposerKt.sourceInformation(composer2, "1466@67888L399");
                        DateInputKt.DateInputContent(l3, function13, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, composer2, 0);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(-2138080579);
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (-1) - (((-1) - ((i10 + 14) - (i10 | 14))) & ((-1) - 1597440)), 40);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Function1<? super Long, Unit> function14 = function13;
            final Long l4 = l3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$4
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
                    DatePickerKt.m2048SwitchableDateEntryContentd7iavvg(l4, j2, i2, function14, function12, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DatePickerContent(final Long l2, final long j2, final Function1<? super Long, Unit> function1, final Function1<? super Long, Unit> function12, final CalendarModel calendarModel, final IntRange intRange, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-434467002);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(DatePickerContent)P(7,3,4,5!1,8,2,6)1494@68907L64,1497@69061L466,1497@69034L493,1509@69554L24,1510@69608L42,1511@69675L15,1512@69695L5031:DatePicker.kt#uh7d8r");
        if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            i3 = (composerStartRestartGroup.changed(l2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            int i4 = composerStartRestartGroup.changed(j2) ? 32 : 16;
            i3 = (i3 + i4) - (i3 & i4);
        }
        if ((i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i2 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changedInstance(function1) ? 256 : 128)));
        }
        if ((-1) - (((-1) - i2) | ((-1) - 3072)) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024)));
        }
        if ((i2 & 24576) == 0) {
            int i5 = composerStartRestartGroup.changedInstance(calendarModel) ? 16384 : 8192;
            i3 = (i3 + i5) - (i3 & i5);
        }
        if ((196608 & i2) == 0) {
            int i6 = composerStartRestartGroup.changedInstance(intRange) ? 131072 : 65536;
            i3 = (i3 + i6) - (i3 & i6);
        }
        if ((1572864 & i2) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - ((-1) - (((-1) - 2097152) | ((-1) - i2)) == 0 ? composerStartRestartGroup.changed(datePickerFormatter) : composerStartRestartGroup.changedInstance(datePickerFormatter) ? 1048576 : 524288)));
        }
        if ((12582912 + i2) - (12582912 | i2) == 0) {
            int i7 = composerStartRestartGroup.changed(selectableDates) ? 8388608 : 4194304;
            i3 = (i3 + i7) - (i3 & i7);
        }
        if ((100663296 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(datePickerColors) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((38347923 + i3) - (38347923 | i3) == 38347922 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-434467002, i3, -1, "androidx.compose.material3.DatePickerContent (DatePicker.kt:1491)");
            }
            final CalendarMonth month = calendarModel.getMonth(j2);
            int iCoerceAtLeast = RangesKt.coerceAtLeast(month.indexIn(intRange), 0);
            final LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(iCoerceAtLeast, 0, composerStartRestartGroup, 0, 2);
            Integer numValueOf = Integer.valueOf(iCoerceAtLeast);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1235295380, "CC(remember):DatePicker.kt#9igjgp");
            boolean z2 = (-1) - (((-1) - (composerStartRestartGroup.changed(lazyListStateRememberLazyListState) ? 1 : 0)) & ((-1) - (composerStartRestartGroup.changed(iCoerceAtLeast) ? 1 : 0))) == 1;
            DatePickerKt$DatePickerContent$1$1 datePickerKt$DatePickerContent$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || datePickerKt$DatePickerContent$1$1RememberedValue == Composer.Companion.getEmpty()) {
                datePickerKt$DatePickerContent$1$1RememberedValue = new DatePickerKt$DatePickerContent$1$1(lazyListStateRememberLazyListState, iCoerceAtLeast, null);
                composerStartRestartGroup.updateRememberedValue(datePickerKt$DatePickerContent$1$1RememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            EffectsKt.LaunchedEffect(numValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) datePickerKt$DatePickerContent$1$1RememberedValue, composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 773894976, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -954363344, "CC(remember):Effects.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final MutableState mutableState = (MutableState) RememberSaveableKt.m3764rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) new Function0<MutableState<Boolean>>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$yearPickerVisible$2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final MutableState<Boolean> invoke() {
                    return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                }
            }, composerStartRestartGroup, 3072, 6);
            Locale localeDefaultLocale = CalendarLocale_androidKt.defaultLocale(composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
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
            Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384862393, "C87@4365L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1436856422, "C1523@70222L511,1535@70767L520,1547@71329L42,1513@69712L1698,1551@71420L3300:DatePicker.kt#uh7d8r");
            Modifier.Companion companion2 = Modifier.Companion;
            float f2 = DatePickerHorizontalPadding;
            Modifier modifierM1020paddingVpY3zN4$default = PaddingKt.m1020paddingVpY3zN4$default(companion2, f2, 0.0f, 2, null);
            boolean canScrollForward = lazyListStateRememberLazyListState.getCanScrollForward();
            boolean canScrollBackward = lazyListStateRememberLazyListState.getCanScrollBackward();
            boolean zDatePickerContent$lambda$10 = DatePickerContent$lambda$10(mutableState);
            String monthYear = datePickerFormatter.formatMonthYear(Long.valueOf(j2), localeDefaultLocale);
            if (monthYear == null) {
                monthYear = Global.HYPHEN;
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 230756280, "CC(remember):DatePicker.kt#9igjgp");
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changed(lazyListStateRememberLazyListState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$2$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: androidx.compose.material3.DatePickerKt$DatePickerContent$2$1$1$1, reason: invalid class name */
                    /* JADX INFO: compiled from: DatePicker.kt */
                    @InterfaceC1492Gx
                    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
                    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0002v\u000b|\u000b\u0003{\bOKb\u0001\u0015\u0007r\r\b\u0011\f\u001as\u001eNo\u000e\"\u0014\u007f\u001a\u0015\u001e\u0019'x&&-\u001f)0`obpdrft", f = "\u0011-?/\u00191*1*6p-5", i = {}, l = {1527}, m = "8>GA>9(KJH>H?", n = {}, s = {})
                    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ LazyListState $monthsListState;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(LazyListState lazyListState, Continuation<? super AnonymousClass1> continuation) {
                            super(2, continuation);
                            this.$monthsListState = lazyListState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new AnonymousClass1(this.$monthsListState, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = this.label;
                            try {
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    LazyListState lazyListState = this.$monthsListState;
                                    this.label = 1;
                                    if (LazyListState.animateScrollToItem$default(lazyListState, lazyListState.getFirstVisibleItemIndex() + 1, 0, this, 2, null) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj);
                                }
                            } catch (IllegalArgumentException unused) {
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(lazyListStateRememberLazyListState, null), 3, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Function0 function0 = (Function0) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 230773729, "CC(remember):DatePicker.kt#9igjgp");
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changed(lazyListStateRememberLazyListState);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$2$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: androidx.compose.material3.DatePickerKt$DatePickerContent$2$2$1$1, reason: invalid class name */
                    /* JADX INFO: compiled from: DatePicker.kt */
                    @InterfaceC1492Gx
                    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
                    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0002v\u000b|\u000b\u0003{\bOKb\u0001\u0015\u0007r\r\b\u0011\f\u001as\u001eNo\u000e\"\u0014\u007f\u001a\u0015\u001e\u0019'x&&-\u001f)0`obqdrft", f = "\u0011-?/\u00191*1*6p-5", i = {}, l = {OlympusCameraSettingsMakernoteDirectory.TagImageQuality2}, m = "8>GA>9(KJH>H?", n = {}, s = {})
                    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ LazyListState $monthsListState;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(LazyListState lazyListState, Continuation<? super AnonymousClass1> continuation) {
                            super(2, continuation);
                            this.$monthsListState = lazyListState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new AnonymousClass1(this.$monthsListState, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = this.label;
                            try {
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    LazyListState lazyListState = this.$monthsListState;
                                    this.label = 1;
                                    if (LazyListState.animateScrollToItem$default(lazyListState, lazyListState.getFirstVisibleItemIndex() - 1, 0, this, 2, null) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj);
                                }
                            } catch (IllegalArgumentException unused) {
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(lazyListStateRememberLazyListState, null), 3, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Function0 function02 = (Function0) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 230791235, "CC(remember):DatePicker.kt#9igjgp");
            boolean zChanged = composerStartRestartGroup.changed(mutableState);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$2$3$1
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
                        DatePickerKt.DatePickerContent$lambda$11(mutableState, !DatePickerKt.DatePickerContent$lambda$10(r1));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            int i8 = (-1) - (((-1) - i3) | ((-1) - 234881024));
            MonthsNavigation(modifierM1020paddingVpY3zN4$default, canScrollForward, canScrollBackward, zDatePickerContent$lambda$10, monthYear, function0, function02, (Function0) objRememberedValue4, datePickerColors, composerStartRestartGroup, i8 | 6);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            Modifier.Companion companion3 = Modifier.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion3);
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
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2145982723, "C1552@71438L683,1571@72420L2290,1566@72161L2549:DatePicker.kt#uh7d8r");
            Modifier modifierM1020paddingVpY3zN4$default2 = PaddingKt.m1020paddingVpY3zN4$default(Modifier.Companion, f2, 0.0f, 2, null);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1020paddingVpY3zN4$default2);
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
            Updater.m3678setimpl(composerM3671constructorimpl3, measurePolicyColumnMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM3671constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM3671constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m3678setimpl(composerM3671constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384862393, "C87@4365L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 455260175, "C1553@71534L31,1554@71582L525:DatePicker.kt#uh7d8r");
            WeekDays(datePickerColors, calendarModel, composerStartRestartGroup, ((i3 >> 24) & 14) | ((i3 >> 9) & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION));
            int i9 = (-1) - (((-1) - ((-1) - (((-1) - (i3 << 3)) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)))) & ((-1) - ((-1) - (((-1) - i3) | ((-1) - 896)))));
            int i10 = 7168 & i3;
            int i11 = (i9 + i10) - (i9 & i10);
            int i12 = (57344 + i3) - (57344 | i3);
            int i13 = ((-1) - (((-1) - ((-1) - (((-1) - ((i11 + i12) - (i11 & i12))) & ((-1) - ((-1) - (((-1) - 458752) | ((-1) - i3))))))) & ((-1) - (3670016 & i3)))) | (i3 & 29360128) | i8;
            composer2 = composerStartRestartGroup;
            HorizontalMonthsList(lazyListStateRememberLazyListState, l2, function1, function12, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, composerStartRestartGroup, i13);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            AnimatedVisibilityKt.AnimatedVisibility(DatePickerContent$lambda$10(mutableState), ClipKt.clipToBounds(Modifier.Companion), EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.6f, 1, null)), EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)), (String) null, ComposableLambdaKt.rememberComposableLambda(1193716082, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$2$4$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, Integer num) {
                    invoke(animatedVisibilityScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, int i14) {
                    ComposerKt.sourceInformation(composer3, "C1576@72744L48,1577@72846L30,1577@72809L1887:DatePicker.kt#uh7d8r");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1193716082, i14, -1, "androidx.compose.material3.DatePickerContent.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1576)");
                    }
                    Strings.Companion companion4 = Strings.Companion;
                    final String strM2993getString2EP1pXo = Strings_androidKt.m2993getString2EP1pXo(Strings.m2923constructorimpl(R.string.m3c_date_picker_year_picker_pane_title), composer3, 0);
                    Modifier.Companion companion5 = Modifier.Companion;
                    ComposerKt.sourceInformationMarkerStart(composer3, 14727253, "CC(remember):DatePicker.kt#9igjgp");
                    boolean zChanged2 = composer3.changed(strM2993getString2EP1pXo);
                    Object objRememberedValue5 = composer3.rememberedValue();
                    if (zChanged2 || objRememberedValue5 == Composer.Companion.getEmpty()) {
                        objRememberedValue5 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$2$4$2$1$1
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
                                SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, strM2993getString2EP1pXo);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue5);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(companion5, false, (Function1) objRememberedValue5, 1, null);
                    long j3 = j2;
                    final MutableState<Boolean> mutableState2 = mutableState;
                    final CoroutineScope coroutineScope2 = coroutineScope;
                    final LazyListState lazyListState = lazyListStateRememberLazyListState;
                    final IntRange intRange2 = intRange;
                    final CalendarMonth calendarMonth = month;
                    SelectableDates selectableDates2 = selectableDates;
                    CalendarModel calendarModel2 = calendarModel;
                    DatePickerColors datePickerColors2 = datePickerColors;
                    ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer3, 0);
                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer3, modifierSemantics$default);
                    Function0<ComposeUiNode> constructor4 = ComposeUiNode.Companion.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor4);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM3671constructorimpl4 = Updater.m3671constructorimpl(composer3);
                    Updater.m3678setimpl(composerM3671constructorimpl4, measurePolicyColumnMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m3678setimpl(composerM3671constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                    if (composerM3671constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        composerM3671constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        composerM3671constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    Updater.m3678setimpl(composerM3671constructorimpl4, modifierMaterializeModifier4, ComposeUiNode.Companion.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer3, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer3, 536387483, "C1589@73620L767,1578@72900L1711,1606@74632L46:DatePicker.kt#uh7d8r");
                    Modifier modifierM1020paddingVpY3zN4$default3 = PaddingKt.m1020paddingVpY3zN4$default(SizeKt.m1052requiredHeight3ABfNKs(Modifier.Companion, Dp.m6638constructorimpl(Dp.m6638constructorimpl(DatePickerKt.getRecommendedSizeForAccessibility() * 7) - DividerDefaults.INSTANCE.m2088getThicknessD9Ej5fM())), DatePickerKt.getDatePickerHorizontalPadding(), 0.0f, 2, null);
                    ComposerKt.sourceInformationMarkerStart(composer3, -2060885131, "CC(remember):DatePicker.kt#9igjgp");
                    boolean zChanged3 = composer3.changed(mutableState2);
                    boolean zChangedInstance3 = composer3.changedInstance(coroutineScope2);
                    boolean zChanged4 = ((-1) - (((-1) - ((-1) - (((-1) - (((zChanged3 ? 1 : 0) + (zChangedInstance3 ? 1 : 0)) - ((zChanged3 ? 1 : 0) & (zChangedInstance3 ? 1 : 0)) != 1 ? 0 : 1)) & ((-1) - (composer3.changed(lazyListState) ? 1 : 0))) != 1 ? 0 : 1)) & ((-1) - (composer3.changedInstance(intRange2) ? 1 : 0))) == 1) | composer3.changed(calendarMonth);
                    Object objRememberedValue6 = composer3.rememberedValue();
                    if (zChanged4 || objRememberedValue6 == Composer.Companion.getEmpty()) {
                        objRememberedValue6 = (Function1) new Function1<Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$2$4$2$2$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                                invoke(num.intValue());
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: androidx.compose.material3.DatePickerKt$DatePickerContent$2$4$2$2$1$1$1, reason: invalid class name */
                            /* JADX INFO: compiled from: DatePicker.kt */
                            @InterfaceC1492Gx
                            @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
                            @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0002v\u000b|\u000b\u0003{\bOKb\u0001\u0015\u0007r\r\b\u0011\f\u001as\u001eNo\u000e\"\u0014\u007f\u001a\u0015\u001e\u0019'x&&-\u001f)0`obsdsfuhvjxlz", f = "\u0011-?/\u00191*1*6p-5", i = {}, l = {1597}, m = "8>GA>9(KJH>H?", n = {}, s = {})
                            static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ CalendarMonth $displayedMonth;
                                final /* synthetic */ LazyListState $monthsListState;
                                final /* synthetic */ int $year;
                                final /* synthetic */ IntRange $yearRange;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                AnonymousClass1(LazyListState lazyListState, int i2, IntRange intRange, CalendarMonth calendarMonth, Continuation<? super AnonymousClass1> continuation) {
                                    super(2, continuation);
                                    this.$monthsListState = lazyListState;
                                    this.$year = i2;
                                    this.$yearRange = intRange;
                                    this.$displayedMonth = calendarMonth;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    return new AnonymousClass1(this.$monthsListState, this.$year, this.$yearRange, this.$displayedMonth, continuation);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i2 = this.label;
                                    if (i2 == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        this.label = 1;
                                        if (LazyListState.scrollToItem$default(this.$monthsListState, (((this.$year - this.$yearRange.getFirst()) * 12) + this.$displayedMonth.getMonth()) - 1, 0, this, 2, null) == coroutine_suspended) {
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

                            public final void invoke(int i15) {
                                DatePickerKt.DatePickerContent$lambda$11(mutableState2, !DatePickerKt.DatePickerContent$lambda$10(r1));
                                BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass1(lazyListState, i15, intRange2, calendarMonth, null), 3, null);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue6);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    DatePickerKt.YearPicker(modifierM1020paddingVpY3zN4$default3, j3, (Function1) objRememberedValue6, selectableDates2, calendarModel2, intRange2, datePickerColors2, composer3, 6);
                    DividerKt.m2090HorizontalDivider9IZ8Weo(null, 0.0f, datePickerColors2.m2025getDividerColor0d7_KjU(), composer3, 0, 3);
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
            }, composer2, 54), composer2, 200112, 16);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
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
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt.DatePickerContent.3
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
                    Long l3 = l2;
                    long j3 = j2;
                    Function1<Long, Unit> function13 = function1;
                    Function1<Long, Unit> function14 = function12;
                    CalendarModel calendarModel2 = calendarModel;
                    IntRange intRange2 = intRange;
                    DatePickerFormatter datePickerFormatter2 = datePickerFormatter;
                    SelectableDates selectableDates2 = selectableDates;
                    DatePickerColors datePickerColors2 = datePickerColors;
                    int i15 = i2;
                    DatePickerKt.DatePickerContent(l3, j3, function13, function14, calendarModel2, intRange2, datePickerFormatter2, selectableDates2, datePickerColors2, composer3, RecomposeScopeImplKt.updateChangedFlags((i15 + 1) - (i15 & 1)));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean DatePickerContent$lambda$10(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DatePickerContent$lambda$11(MutableState<Boolean> mutableState, boolean z2) {
        mutableState.setValue(Boolean.valueOf(z2));
    }

    /* JADX INFO: renamed from: DatePickerHeader-pc5RIQQ, reason: not valid java name */
    public static final void m2044DatePickerHeaderpc5RIQQ(final Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, final long j2, final long j3, final float f2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i2) {
        int i3;
        Modifier.Companion companionM1048defaultMinSizeVpY3zN4$default;
        Composer composerStartRestartGroup = composer.startRestartGroup(-996037719);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(DatePickerHeader)P(3,4,5:c#ui.graphics.Color,1:c#ui.graphics.Color,2:c#ui.unit.Dp)1629@75185L539:DatePicker.kt#uh7d8r");
        if ((i2 + 6) - (i2 | 6) == 0) {
            int i4 = composerStartRestartGroup.changed(modifier) ? 4 : 2;
            i3 = (i4 + i2) - (i4 & i2);
        } else {
            i3 = i2;
        }
        if ((i2 + 48) - (i2 | 48) == 0) {
            int i5 = composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
            i3 = (i3 + i5) - (i3 & i5);
        }
        if ((i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i2 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changed(j2) ? 256 : 128)));
        }
        if ((-1) - (((-1) - i2) | ((-1) - 3072)) == 0) {
            int i6 = composerStartRestartGroup.changed(j3) ? 2048 : 1024;
            i3 = (i3 + i6) - (i3 & i6);
        }
        if ((i2 & 24576) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changed(f2) ? 16384 : 8192)));
        }
        if ((196608 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function22) ? 131072 : 65536;
        }
        if ((74899 + i3) - (74899 | i3) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-996037719, i3, -1, "androidx.compose.material3.DatePickerHeader (DatePicker.kt:1621)");
            }
            if (function2 != null) {
                companionM1048defaultMinSizeVpY3zN4$default = SizeKt.m1048defaultMinSizeVpY3zN4$default(Modifier.Companion, 0.0f, f2, 1, null);
            } else {
                companionM1048defaultMinSizeVpY3zN4$default = Modifier.Companion;
            }
            Modifier modifierThen = SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null).then(companionM1048defaultMinSizeVpY3zN4$default);
            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(spaceBetween, Alignment.Companion.getStart(), composerStartRestartGroup, 6);
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
            Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384862393, "C87@4365L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1244227240, "C1639@75626L92:DatePicker.kt#uh7d8r");
            composerStartRestartGroup.startReplaceGroup(594325590);
            ComposerKt.sourceInformation(composerStartRestartGroup, "1634@75414L5,1635@75518L89,1635@75432L175");
            if (function2 != null) {
                ProvideContentColorTextStyleKt.m2921ProvideContentColorTextStyle3JVO9M(j2, TypographyKt.getValue(DatePickerModalTokens.INSTANCE.getHeaderSupportingTextFont(), composerStartRestartGroup, 6), ComposableLambdaKt.rememberComposableLambda(1936268514, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerHeader$1$1
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
                        ComposerKt.sourceInformation(composer2, "C1636@75536L57:DatePicker.kt#uh7d8r");
                        if ((i7 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1936268514, i7, -1, "androidx.compose.material3.DatePickerHeader.<anonymous>.<anonymous> (DatePicker.kt:1636)");
                        }
                        Alignment bottomStart = Alignment.Companion.getBottomStart();
                        Function2<Composer, Integer, Unit> function23 = function2;
                        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        Modifier.Companion companion = Modifier.Companion;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(bottomStart, false);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, companion);
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
                        ComposerKt.sourceInformationMarkerStart(composer2, -397532909, "C1636@75584L7:DatePicker.kt#uh7d8r");
                        function23.invoke(composer2, 0);
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
                }, composerStartRestartGroup, 54), composerStartRestartGroup, (-1) - (((-1) - ((-1) - (((-1) - (i3 >> 6)) | ((-1) - 14)))) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)));
            }
            composerStartRestartGroup.endReplaceGroup();
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4168boximpl(j3)), function22, composerStartRestartGroup, (-1) - (((-1) - ProvidedValue.$stable) & ((-1) - ((i3 >> 12) & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION))));
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerHeader$2
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
                    DatePickerKt.m2044DatePickerHeaderpc5RIQQ(modifier, function2, j2, j3, f2, function22, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i2) & ((-1) - 1))));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HorizontalMonthsList(final LazyListState lazyListState, Long l2, final Function1<? super Long, Unit> function1, final Function1<? super Long, Unit> function12, final CalendarModel calendarModel, final IntRange intRange, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1994757941);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(HorizontalMonthsList)P(3,7,4,5!1,8,2,6)1659@76284L158,1665@76504L5,1665@76511L1365,1665@76447L1429,1696@77912L228,1696@77882L258:DatePicker.kt#uh7d8r");
        if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            i3 = (composerStartRestartGroup.changed(lazyListState) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        final Long l3 = l2;
        if ((i2 + 48) - (i2 | 48) == 0) {
            int i4 = composerStartRestartGroup.changed(l3) ? 32 : 16;
            i3 = (i3 + i4) - (i3 & i4);
        }
        if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            int i5 = composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
            i3 = (i3 + i5) - (i3 & i5);
        }
        if ((i2 & 3072) == 0) {
            int i6 = composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024;
            i3 = (i3 + i6) - (i3 & i6);
        }
        if ((i2 + 24576) - (i2 | 24576) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changedInstance(calendarModel) ? 16384 : 8192)));
        }
        if ((196608 & i2) == 0) {
            int i7 = composerStartRestartGroup.changedInstance(intRange) ? 131072 : 65536;
            i3 = (i3 + i7) - (i3 & i7);
        }
        if ((1572864 & i2) == 0) {
            i3 |= (-1) - (((-1) - 2097152) | ((-1) - i2)) == 0 ? composerStartRestartGroup.changed(datePickerFormatter) : composerStartRestartGroup.changedInstance(datePickerFormatter) ? 1048576 : 524288;
        }
        if ((-1) - (((-1) - 12582912) | ((-1) - i2)) == 0) {
            int i8 = composerStartRestartGroup.changed(selectableDates) ? 8388608 : 4194304;
            i3 = (i3 + i8) - (i3 & i8);
        }
        if ((100663296 + i2) - (100663296 | i2) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changed(datePickerColors) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432)));
        }
        if ((38347923 + i3) - (38347923 | i3) == 38347922 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1994757941, i3, -1, "androidx.compose.material3.HorizontalMonthsList (DatePicker.kt:1656)");
            }
            final CalendarDate today = calendarModel.getToday();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1217520394, "CC(remember):DatePicker.kt#9igjgp");
            boolean zChanged = composerStartRestartGroup.changed(intRange);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = calendarModel.getMonth(intRange.getFirst(), 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final CalendarMonth calendarMonth = (CalendarMonth) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            l3 = l3;
            TextKt.ProvideTextStyle(TypographyKt.getValue(DatePickerModalTokens.INSTANCE.getDateLabelTextFont(), composerStartRestartGroup, 6), ComposableLambdaKt.rememberComposableLambda(1504086906, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt.HorizontalMonthsList.1
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
                    ComposerKt.sourceInformation(composer2, "C1675@77032L40,1676@77083L787,1666@76521L1349:DatePicker.kt#uh7d8r");
                    if ((-1) - (((-1) - i9) | ((-1) - 3)) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1504086906, i9, -1, "androidx.compose.material3.HorizontalMonthsList.<anonymous> (DatePicker.kt:1666)");
                    }
                    Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(Modifier.Companion, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DatePickerKt.HorizontalMonthsList.1.1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.setHorizontalScrollAxisRange(semanticsPropertyReceiver, new ScrollAxisRange(new Function0<Float>() { // from class: androidx.compose.material3.DatePickerKt.HorizontalMonthsList.1.1.1
                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final Float invoke() {
                                    return Float.valueOf(0.0f);
                                }
                            }, new Function0<Float>() { // from class: androidx.compose.material3.DatePickerKt.HorizontalMonthsList.1.1.2
                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final Float invoke() {
                                    return Float.valueOf(0.0f);
                                }
                            }, false, 4, null));
                        }
                    }, 1, null);
                    LazyListState lazyListState2 = lazyListState;
                    FlingBehavior flingBehaviorRememberSnapFlingBehavior$material3_release = DatePickerDefaults.INSTANCE.rememberSnapFlingBehavior$material3_release(lazyListState, null, composer2, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 2);
                    ComposerKt.sourceInformationMarkerStart(composer2, 1232814410, "CC(remember):DatePicker.kt#9igjgp");
                    boolean zChangedInstance = composer2.changedInstance(intRange);
                    boolean zChangedInstance2 = composer2.changedInstance(calendarModel);
                    int i10 = (-1) - (((-1) - ((((zChangedInstance ? 1 : 0) + (zChangedInstance2 ? 1 : 0)) - ((zChangedInstance ? 1 : 0) & (zChangedInstance2 ? 1 : 0)) != 1 ? 0 : 1) | (composer2.changed(calendarMonth) ? 1 : 0))) & ((-1) - (composer2.changed(function1) ? 1 : 0))) != 1 ? 0 : 1;
                    boolean zChanged2 = composer2.changed(today);
                    int i11 = (-1) - (((-1) - ((i10 + (zChanged2 ? 1 : 0)) - (i10 & (zChanged2 ? 1 : 0)) != 1 ? 0 : 1)) & ((-1) - (composer2.changed(l3) ? 1 : 0))) != 1 ? 0 : 1;
                    boolean zChangedInstance3 = composer2.changedInstance(datePickerFormatter);
                    boolean z2 = (-1) - (((-1) - (((i11 + (zChangedInstance3 ? 1 : 0)) - (i11 & (zChangedInstance3 ? 1 : 0)) != 1 ? 0 : 1) | (composer2.changed(selectableDates) ? 1 : 0))) & ((-1) - (composer2.changed(datePickerColors) ? 1 : 0))) == 1;
                    final IntRange intRange2 = intRange;
                    final CalendarModel calendarModel2 = calendarModel;
                    final CalendarMonth calendarMonth2 = calendarMonth;
                    final Function1<Long, Unit> function13 = function1;
                    final CalendarDate calendarDate = today;
                    final Long l4 = l3;
                    final DatePickerFormatter datePickerFormatter2 = datePickerFormatter;
                    final SelectableDates selectableDates2 = selectableDates;
                    final DatePickerColors datePickerColors2 = datePickerColors;
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (z2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                        objRememberedValue2 = (Function1) new Function1<LazyListScope, Unit>() { // from class: androidx.compose.material3.DatePickerKt$HorizontalMonthsList$1$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(LazyListScope lazyListScope) {
                                invoke2(lazyListScope);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(LazyListScope lazyListScope) {
                                int iNumberOfMonthsInRange = DatePickerKt.numberOfMonthsInRange(intRange2);
                                final CalendarModel calendarModel3 = calendarModel2;
                                final CalendarMonth calendarMonth3 = calendarMonth2;
                                final Function1<Long, Unit> function14 = function13;
                                final CalendarDate calendarDate2 = calendarDate;
                                final Long l5 = l4;
                                final DatePickerFormatter datePickerFormatter3 = datePickerFormatter2;
                                final SelectableDates selectableDates3 = selectableDates2;
                                final DatePickerColors datePickerColors3 = datePickerColors2;
                                LazyListScope.items$default(lazyListScope, iNumberOfMonthsInRange, null, null, ComposableLambdaKt.composableLambdaInstance(1137566309, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$HorizontalMonthsList$1$2$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(4);
                                    }

                                    @Override // kotlin.jvm.functions.Function4
                                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer3, Integer num2) {
                                        invoke(lazyItemScope, num.intValue(), composer3, num2.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(LazyItemScope lazyItemScope, int i12, Composer composer3, int i13) {
                                        int i14;
                                        ComposerKt.sourceInformation(composer3, "C1679@77250L596:DatePicker.kt#uh7d8r");
                                        if ((i13 + 6) - (i13 | 6) == 0) {
                                            i14 = i13 | (composer3.changed(lazyItemScope) ? 4 : 2);
                                        } else {
                                            i14 = i13;
                                        }
                                        if ((i13 & 48) == 0) {
                                            int i15 = composer3.changed(i12) ? 32 : 16;
                                            i14 = (i14 + i15) - (i14 & i15);
                                        }
                                        if ((i14 + 147) - (147 | i14) != 146 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1137566309, i14, -1, "androidx.compose.material3.HorizontalMonthsList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1678)");
                                            }
                                            CalendarMonth calendarMonthPlusMonths = calendarModel3.plusMonths(calendarMonth3, i12);
                                            Modifier modifierFillParentMaxWidth$default = LazyItemScope.fillParentMaxWidth$default(lazyItemScope, Modifier.Companion, 0.0f, 1, null);
                                            Function1<Long, Unit> function15 = function14;
                                            CalendarDate calendarDate3 = calendarDate2;
                                            Long l6 = l5;
                                            DatePickerFormatter datePickerFormatter4 = datePickerFormatter3;
                                            SelectableDates selectableDates4 = selectableDates3;
                                            DatePickerColors datePickerColors4 = datePickerColors3;
                                            ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                                            ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierFillParentMaxWidth$default);
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
                                            ComposerKt.sourceInformationMarkerStart(composer3, 32177554, "C1680@77318L510:DatePicker.kt#uh7d8r");
                                            DatePickerKt.Month(calendarMonthPlusMonths, function15, calendarDate3.getUtcTimeMillis(), l6, null, null, datePickerFormatter4, selectableDates4, datePickerColors4, composer3, 221184);
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
                                }), 6, null);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    LazyDslKt.LazyRow(modifierSemantics$default, lazyListState2, null, false, null, null, flingBehaviorRememberSnapFlingBehavior$material3_release, false, (Function1) objRememberedValue2, composer2, 0, 188);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1217468228, "CC(remember):DatePicker.kt#9igjgp");
            int i9 = (-1) - (((-1) - i3) | ((-1) - 14));
            int i10 = i9 == 4 ? 1 : 0;
            int i11 = (i3 + 7168) - (i3 | 7168) != 2048 ? 0 : 1;
            boolean z2 = (-1) - (((-1) - ((-1) - (((-1) - ((i10 + i11) - (i10 & i11) != 1 ? 0 : 1)) & ((-1) - (composerStartRestartGroup.changedInstance(calendarModel) ? 1 : 0))) != 1 ? 0 : 1)) & ((-1) - (composerStartRestartGroup.changedInstance(intRange) ? 1 : 0))) == 1;
            DatePickerKt$HorizontalMonthsList$2$1 datePickerKt$HorizontalMonthsList$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || datePickerKt$HorizontalMonthsList$2$1RememberedValue == Composer.Companion.getEmpty()) {
                datePickerKt$HorizontalMonthsList$2$1RememberedValue = new DatePickerKt$HorizontalMonthsList$2$1(lazyListState, function12, calendarModel, intRange, null);
                composerStartRestartGroup.updateRememberedValue(datePickerKt$HorizontalMonthsList$2$1RememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            EffectsKt.LaunchedEffect(lazyListState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) datePickerKt$HorizontalMonthsList$2$1RememberedValue, composerStartRestartGroup, i9);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Long l4 = l3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt.HorizontalMonthsList.3
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
                    LazyListState lazyListState2 = lazyListState;
                    Long l5 = l4;
                    Function1<Long, Unit> function13 = function1;
                    Function1<Long, Unit> function14 = function12;
                    CalendarModel calendarModel2 = calendarModel;
                    IntRange intRange2 = intRange;
                    DatePickerFormatter datePickerFormatter2 = datePickerFormatter;
                    SelectableDates selectableDates2 = selectableDates;
                    DatePickerColors datePickerColors2 = datePickerColors;
                    int i13 = i2;
                    DatePickerKt.HorizontalMonthsList(lazyListState2, l5, function13, function14, calendarModel2, intRange2, datePickerFormatter2, selectableDates2, datePickerColors2, composer2, RecomposeScopeImplKt.updateChangedFlags((i13 + 1) - (i13 & 1)));
                }
            });
        }
    }

    public static final Object updateDisplayedMonth(final LazyListState lazyListState, final Function1<? super Long, Unit> function1, final CalendarModel calendarModel, final IntRange intRange, Continuation<? super Unit> continuation) {
        Object objCollect = SnapshotStateKt.snapshotFlow(new Function0<Integer>() { // from class: androidx.compose.material3.DatePickerKt.updateDisplayedMonth.2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                return Integer.valueOf(lazyListState.getFirstVisibleItemIndex());
            }
        }).collect(new FlowCollector() { // from class: androidx.compose.material3.DatePickerKt.updateDisplayedMonth.3
            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation2) {
                return emit(((Number) obj).intValue(), (Continuation<? super Unit>) continuation2);
            }

            public final Object emit(int i2, Continuation<? super Unit> continuation2) {
                int firstVisibleItemIndex = lazyListState.getFirstVisibleItemIndex() / 12;
                function1.invoke(Boxing.boxLong(calendarModel.getMonth(intRange.getFirst() + firstVisibleItemIndex, (lazyListState.getFirstVisibleItemIndex() % 12) + 1).getStartUtcTimeMillis()));
                return Unit.INSTANCE;
            }
        }, continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public static final void WeekDays(final DatePickerColors datePickerColors, final CalendarModel calendarModel, Composer composer, final int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1849465391);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(WeekDays)P(1)1739@79443L5,1741@79454L974:DatePicker.kt#uh7d8r");
        int i3 = (-1) - (((-1) - i2) | ((-1) - 6)) == 0 ? (composerStartRestartGroup.changed(datePickerColors) ? 4 : 2) | i2 : i2;
        if ((i2 + 48) - (48 | i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(calendarModel) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1849465391, i3, -1, "androidx.compose.material3.WeekDays (DatePicker.kt:1728)");
            }
            int firstDayOfWeek = calendarModel.getFirstDayOfWeek();
            List<Pair<String, String>> weekdayNames = calendarModel.getWeekdayNames();
            ArrayList arrayList = new ArrayList();
            int i4 = firstDayOfWeek - 1;
            int size = weekdayNames.size();
            for (int i5 = i4; i5 < size; i5++) {
                arrayList.add(weekdayNames.get(i5));
            }
            ?? r1 = 0;
            for (int i6 = 0; i6 < i4; i6++) {
                arrayList.add(weekdayNames.get(i6));
            }
            TextStyle value = TypographyKt.getValue(DatePickerModalTokens.INSTANCE.getWeekdaysLabelTextFont(), composerStartRestartGroup, 6);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m1048defaultMinSizeVpY3zN4$default(Modifier.Companion, 0.0f, RecommendedSizeForAccessibility, 1, null), 0.0f, 1, null);
            Arrangement.HorizontalOrVertical spaceEvenly = Arrangement.INSTANCE.getSpaceEvenly();
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceEvenly, centerVertically, composerStartRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407918630, "C100@5047L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -602795257, "C:DatePicker.kt#uh7d8r");
            composerStartRestartGroup.startReplaceGroup(396197267);
            ComposerKt.sourceInformation(composerStartRestartGroup, "*1750@79820L33,1748@79738L674");
            ArrayList arrayList2 = arrayList;
            int size2 = arrayList2.size();
            for (int i7 = 0; i7 < size2; i7++) {
                final Pair pair = (Pair) arrayList2.get(i7);
                Modifier.Companion companion = Modifier.Companion;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1458700563, "CC(remember):DatePicker.kt#9igjgp");
                boolean zChanged = composerStartRestartGroup.changed(pair);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DatePickerKt$WeekDays$1$1$1$1
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
                            SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, pair.getFirst());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                Modifier modifierClearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(companion, (Function1) objRememberedValue);
                float f2 = RecommendedSizeForAccessibility;
                Modifier modifierM1065sizeVpY3zN4 = SizeKt.m1065sizeVpY3zN4(modifierClearAndSetSemantics, f2, f2);
                Alignment center = Alignment.Companion.getCenter();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, r1);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, r1);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1065sizeVpY3zN4);
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
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 87886672, "C1757@80134L264:DatePicker.kt#uh7d8r");
                r1 = 0;
                TextKt.m2711Text4IGK_g((String) pair.getSecond(), SizeKt.wrapContentSize$default(Modifier.Companion, null, false, 3, null), datePickerColors.m2036getWeekdayContentColor0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6520boximpl(TextAlign.Companion.m6527getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, value, composerStartRestartGroup, 48, 0, 65016);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt.WeekDays.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i8) {
                    DatePickerKt.WeekDays(datePickerColors, calendarModel, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:182:0x0554  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void Month(final androidx.compose.material3.internal.CalendarMonth r54, final kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> r55, final long r56, final java.lang.Long r58, final java.lang.Long r59, final androidx.compose.material3.SelectedRangeInfo r60, final androidx.compose.material3.DatePickerFormatter r61, final androidx.compose.material3.SelectableDates r62, final androidx.compose.material3.DatePickerColors r63, androidx.compose.runtime.Composer r64, final int r65) {
        /*
            Method dump skipped, instruction units count: 1601
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerKt.Month(androidx.compose.material3.internal.CalendarMonth, kotlin.jvm.functions.Function1, long, java.lang.Long, java.lang.Long, androidx.compose.material3.SelectedRangeInfo, androidx.compose.material3.DatePickerFormatter, androidx.compose.material3.SelectableDates, androidx.compose.material3.DatePickerColors, androidx.compose.runtime.Composer, int):void");
    }

    public static final int numberOfMonthsInRange(IntRange intRange) {
        return ((intRange.getLast() - intRange.getFirst()) + 1) * 12;
    }

    private static final String dayContentDescription(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 502032503, "C(dayContentDescription)P(4,3,2):DatePicker.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(502032503, i2, -1, "androidx.compose.material3.dayContentDescription (DatePicker.kt:1909)");
        }
        StringBuilder sb = new StringBuilder();
        composer.startReplaceGroup(-647730741);
        ComposerKt.sourceInformation(composer, "");
        if (z2) {
            if (z4) {
                composer.startReplaceGroup(-647727716);
                ComposerKt.sourceInformation(composer, "1914@87077L56");
                Strings.Companion companion = Strings.Companion;
                sb.append(Strings_androidKt.m2993getString2EP1pXo(Strings.m2923constructorimpl(R.string.m3c_date_range_picker_start_headline), composer, 0));
                composer.endReplaceGroup();
            } else if (z5) {
                composer.startReplaceGroup(-647723718);
                ComposerKt.sourceInformation(composer, "1916@87202L54");
                Strings.Companion companion2 = Strings.Companion;
                sb.append(Strings_androidKt.m2993getString2EP1pXo(Strings.m2923constructorimpl(R.string.m3c_date_range_picker_end_headline), composer, 0));
                composer.endReplaceGroup();
            } else if (z6) {
                composer.startReplaceGroup(-647719783);
                ComposerKt.sourceInformation(composer, "1918@87325L53");
                Strings.Companion companion3 = Strings.Companion;
                sb.append(Strings_androidKt.m2993getString2EP1pXo(Strings.m2923constructorimpl(R.string.m3c_date_range_picker_day_in_range), composer, 0));
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1395591750);
                composer.endReplaceGroup();
            }
        }
        composer.endReplaceGroup();
        composer.startReplaceGroup(-647717033);
        ComposerKt.sourceInformation(composer, "1923@87526L54");
        if (z3) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            Strings.Companion companion4 = Strings.Companion;
            sb.append(Strings_androidKt.m2993getString2EP1pXo(Strings.m2923constructorimpl(R.string.m3c_date_picker_today_description), composer, 0));
        }
        composer.endReplaceGroup();
        String string = sb.length() == 0 ? null : sb.toString();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Day(final Modifier modifier, final boolean z2, final Function0<Unit> function0, final boolean z3, final boolean z4, final boolean z5, final boolean z6, final String str, final DatePickerColors datePickerColors, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1434777861);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Day)P(6,8,7!1,4,9,5,3)1951@88438L114,1956@88638L5,1959@88697L83,1963@88864L190,1979@89366L319,1942@88009L1676:DatePicker.kt#uh7d8r");
        if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changed(z2) ? 32 : 16)));
        }
        if ((i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i2 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            int i4 = composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
            i3 = (i3 + i4) - (i3 & i4);
        }
        if ((i2 + 3072) - (i2 | 3072) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changed(z3) ? 2048 : 1024)));
        }
        if ((-1) - (((-1) - i2) | ((-1) - 24576)) == 0) {
            int i5 = composerStartRestartGroup.changed(z4) ? 16384 : 8192;
            i3 = (i3 + i5) - (i3 & i5);
        }
        if ((-1) - (((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) | ((-1) - i2)) == 0) {
            int i6 = composerStartRestartGroup.changed(z5) ? 131072 : 65536;
            i3 = (i3 + i6) - (i3 & i6);
        }
        if ((-1) - (((-1) - 1572864) | ((-1) - i2)) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changed(z6) ? 1048576 : 524288)));
        }
        if ((-1) - (((-1) - 12582912) | ((-1) - i2)) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 8388608 : 4194304;
        }
        if ((-1) - (((-1) - 100663296) | ((-1) - i2)) == 0) {
            int i7 = composerStartRestartGroup.changed(datePickerColors) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
            i3 = (i3 + i7) - (i3 & i7);
        }
        if ((-1) - (((-1) - 805306368) | ((-1) - i2)) == 0) {
            int i8 = composerStartRestartGroup.changedInstance(function2) ? 536870912 : 268435456;
            i3 = (i3 + i8) - (i3 & i8);
        }
        if ((306783379 & i3) == 306783378 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1434777861, i3, -1, "androidx.compose.material3.Day (DatePicker.kt:1941)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 67509195, "CC(remember):DatePicker.kt#9igjgp");
            boolean z7 = (-1) - (((-1) - 29360128) | ((-1) - i3)) == 8388608;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z7 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DatePickerKt$Day$1$1
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
                        SemanticsPropertiesKt.setText(semanticsPropertyReceiver, new AnnotatedString(str, null, null, 6, null));
                        SemanticsPropertiesKt.m5952setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m5933getButtono7Vup1c());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Modifier modifierSemantics = SemanticsModifierKt.semantics(modifier, true, (Function1) objRememberedValue);
            Shape value = ShapesKt.getValue(DatePickerModalTokens.INSTANCE.getDateContainerShape(), composerStartRestartGroup, 6);
            int i9 = i3 >> 3;
            int i10 = (-1) - (((-1) - ((i9 + 14) - (i9 | 14))) & ((-1) - ((i3 >> 9) & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)));
            int i11 = (-1) - (((-1) - i9) | ((-1) - 896));
            int i12 = (i10 + i11) - (i10 & i11);
            int i13 = i3 >> 15;
            long jM4188unboximpl = datePickerColors.dayContainerColor$material3_release(z2, z4, z3, composerStartRestartGroup, (-1) - (((-1) - ((-1) - (((-1) - i13) | ((-1) - 7168)))) & ((-1) - i12))).getValue().m4188unboximpl();
            int i14 = ((-1) - (((-1) - i13) | ((-1) - 14))) | ((-1) - (((-1) - i3) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)));
            int i15 = i3 >> 12;
            int i16 = i15 & 896;
            int i17 = (i14 + i16) - (i14 & i16);
            int i18 = (i9 + 7168) - (i9 | 7168);
            SurfaceKt.m2562Surfaced85dljk(z2, function0, modifierSemantics, z4, value, jM4188unboximpl, datePickerColors.dayContentColor$material3_release(z5, z2, z6, z4, composerStartRestartGroup, (-1) - (((-1) - ((i17 + i18) - (i17 & i18))) & ((-1) - (i15 & 57344)))).getValue().m4188unboximpl(), 0.0f, 0.0f, (!z5 || z2) ? null : BorderStrokeKt.m600BorderStrokecXLIe8U(DatePickerModalTokens.INSTANCE.m3164getDateTodayContainerOutlineWidthD9Ej5fM(), datePickerColors.m2035getTodayDateBorderColor0d7_KjU()), (MutableInteractionSource) null, ComposableLambdaKt.rememberComposableLambda(-2031780827, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt.Day.2
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
                    ComposerKt.sourceInformation(composer2, "C1980@89376L303:DatePicker.kt#uh7d8r");
                    if ((i19 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2031780827, i19, -1, "androidx.compose.material3.Day.<anonymous> (DatePicker.kt:1980)");
                        }
                        Modifier modifierM1057requiredSizeVpY3zN4 = SizeKt.m1057requiredSizeVpY3zN4(Modifier.Companion, DatePickerModalTokens.INSTANCE.m3163getDateStateLayerWidthD9Ej5fM(), DatePickerModalTokens.INSTANCE.m3162getDateStateLayerHeightD9Ej5fM());
                        Alignment center = Alignment.Companion.getCenter();
                        Function2<Composer, Integer, Unit> function22 = function2;
                        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM1057requiredSizeVpY3zN4);
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
                        ComposerKt.sourceInformationMarkerStart(composer2, 2118753635, "C1988@89660L9:DatePicker.kt#uh7d8r");
                        function22.invoke(composer2, 0);
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
            }, composerStartRestartGroup, 54), composerStartRestartGroup, i9 & 7294, 48, 1408);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt.Day.3
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
                    DatePickerKt.Day(modifier, z2, function0, z3, z4, z5, z6, str, datePickerColors, function2, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i2) & ((-1) - 1))));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void YearPicker(final Modifier modifier, final long j2, final Function1<? super Integer, Unit> function1, final SelectableDates selectableDates, final CalendarModel calendarModel, final IntRange intRange, final DatePickerColors datePickerColors, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1286899812);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(YearPicker)P(3,2,4,5!1,6)2004@90070L5,2004@90077L4227,2004@89996L4308:DatePicker.kt#uh7d8r");
        if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            int i4 = composerStartRestartGroup.changed(modifier) ? 4 : 2;
            i3 = (i4 + i2) - (i4 & i2);
        } else {
            i3 = i2;
        }
        if ((i2 + 48) - (i2 | 48) == 0) {
            int i5 = composerStartRestartGroup.changed(j2) ? 32 : 16;
            i3 = (i3 + i5) - (i3 & i5);
        }
        if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changed(selectableDates) ? 2048 : 1024)));
        }
        if ((i2 + 24576) - (i2 | 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(calendarModel) ? 16384 : 8192;
        }
        if ((-1) - (((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) | ((-1) - i2)) == 0) {
            int i6 = composerStartRestartGroup.changedInstance(intRange) ? 131072 : 65536;
            i3 = (i3 + i6) - (i3 & i6);
        }
        if ((1572864 + i2) - (1572864 | i2) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changed(datePickerColors) ? 1048576 : 524288)));
        }
        if ((599187 + i3) - (599187 | i3) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1286899812, i3, -1, "androidx.compose.material3.YearPicker (DatePicker.kt:2003)");
            }
            TextKt.ProvideTextStyle(TypographyKt.getValue(DatePickerModalTokens.INSTANCE.getSelectionYearLabelTextFont(), composerStartRestartGroup, 6), ComposableLambdaKt.rememberComposableLambda(1301915789, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt.YearPicker.1
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
                    ComposerKt.sourceInformation(composer2, "C2008@90272L281,2015@90734L24,2016@90799L53,2017@90891L51,2032@91637L2661,2018@90951L3347:DatePicker.kt#uh7d8r");
                    if ((-1) - (((-1) - i7) | ((-1) - 3)) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1301915789, i7, -1, "androidx.compose.material3.YearPicker.<anonymous> (DatePicker.kt:2005)");
                    }
                    CalendarModel calendarModel2 = calendarModel;
                    final int year = calendarModel2.getMonth(calendarModel2.getToday()).getYear();
                    final int year2 = calendarModel.getMonth(j2).getYear();
                    final LazyGridState lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(Math.max(0, (year2 - intRange.getFirst()) - 3), 0, composer2, 0, 2);
                    long jM2014getContainerColor0d7_KjU = datePickerColors.m2014getContainerColor0d7_KjU();
                    ComposerKt.sourceInformationMarkerStart(composer2, 773894976, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
                    ComposerKt.sourceInformationMarkerStart(composer2, -954363344, "CC(remember):Effects.kt#9igjgp");
                    Object objRememberedValue = composer2.rememberedValue();
                    if (objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2));
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    Strings.Companion companion = Strings.Companion;
                    final String strM2993getString2EP1pXo = Strings_androidKt.m2993getString2EP1pXo(Strings.m2923constructorimpl(R.string.m3c_date_picker_scroll_to_earlier_years), composer2, 0);
                    Strings.Companion companion2 = Strings.Companion;
                    final String strM2993getString2EP1pXo2 = Strings_androidKt.m2993getString2EP1pXo(Strings.m2923constructorimpl(R.string.m3c_date_picker_scroll_to_later_years), composer2, 0);
                    GridCells.Fixed fixed = new GridCells.Fixed(3);
                    Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(BackgroundKt.m573backgroundbw27NRU$default(modifier, jM2014getContainerColor0d7_KjU, null, 2, null), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DatePickerKt.YearPicker.1.1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.setVerticalScrollAxisRange(semanticsPropertyReceiver, new ScrollAxisRange(new Function0<Float>() { // from class: androidx.compose.material3.DatePickerKt.YearPicker.1.1.1
                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final Float invoke() {
                                    return Float.valueOf(0.0f);
                                }
                            }, new Function0<Float>() { // from class: androidx.compose.material3.DatePickerKt.YearPicker.1.1.2
                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final Float invoke() {
                                    return Float.valueOf(0.0f);
                                }
                            }, false, 4, null));
                        }
                    }, 1, null);
                    Arrangement.HorizontalOrVertical spaceEvenly = Arrangement.INSTANCE.getSpaceEvenly();
                    GridCells.Fixed fixed2 = fixed;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM898spacedBy0680j_4 = Arrangement.INSTANCE.m898spacedBy0680j_4(DatePickerKt.YearsVerticalPadding);
                    Arrangement.HorizontalOrVertical horizontalOrVertical = spaceEvenly;
                    ComposerKt.sourceInformationMarkerStart(composer2, 15784914, "CC(remember):DatePicker.kt#9igjgp");
                    int i8 = (-1) - (((-1) - (((composer2.changedInstance(intRange) ? 1 : 0) | (composer2.changed(lazyGridStateRememberLazyGridState) ? 1 : 0)) | (composer2.changedInstance(coroutineScope) ? 1 : 0))) & ((-1) - (composer2.changed(strM2993getString2EP1pXo) ? 1 : 0))) != 1 ? 0 : 1;
                    boolean zChanged = composer2.changed(strM2993getString2EP1pXo2);
                    int i9 = (-1) - (((-1) - (((i8 + (zChanged ? 1 : 0)) - (i8 & (zChanged ? 1 : 0)) != 1 ? 0 : 1) | (composer2.changed(year2) ? 1 : 0))) & ((-1) - (composer2.changed(year) ? 1 : 0))) != 1 ? 0 : 1;
                    boolean zChanged2 = composer2.changed(function1);
                    boolean zChanged3 = ((-1) - (((-1) - ((i9 + (zChanged2 ? 1 : 0)) - (i9 & (zChanged2 ? 1 : 0)) != 1 ? 0 : 1)) & ((-1) - (composer2.changed(selectableDates) ? 1 : 0))) == 1) | composer2.changed(datePickerColors);
                    final IntRange intRange2 = intRange;
                    final Function1<Integer, Unit> function12 = function1;
                    final SelectableDates selectableDates2 = selectableDates;
                    final DatePickerColors datePickerColors2 = datePickerColors;
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged3 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                        objRememberedValue2 = (Function1) new Function1<LazyGridScope, Unit>() { // from class: androidx.compose.material3.DatePickerKt$YearPicker$1$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(LazyGridScope lazyGridScope) {
                                invoke2(lazyGridScope);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(LazyGridScope lazyGridScope) {
                                int iCount = CollectionsKt.count(intRange2);
                                final IntRange intRange3 = intRange2;
                                final LazyGridState lazyGridState = lazyGridStateRememberLazyGridState;
                                final CoroutineScope coroutineScope2 = coroutineScope;
                                final String str = strM2993getString2EP1pXo;
                                final String str2 = strM2993getString2EP1pXo2;
                                final int i10 = year2;
                                final int i11 = year;
                                final Function1<Integer, Unit> function13 = function12;
                                final SelectableDates selectableDates3 = selectableDates2;
                                final DatePickerColors datePickerColors3 = datePickerColors2;
                                LazyGridScope.items$default(lazyGridScope, iCount, null, null, null, ComposableLambdaKt.composableLambdaInstance(1040623618, true, new Function4<LazyGridItemScope, Integer, Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$YearPicker$1$2$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(4);
                                    }

                                    @Override // kotlin.jvm.functions.Function4
                                    public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer3, Integer num2) {
                                        invoke(lazyGridItemScope, num.intValue(), composer3, num2.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(LazyGridItemScope lazyGridItemScope, final int i12, Composer composer3, int i13) {
                                        int i14 = i13;
                                        ComposerKt.sourceInformation(composer3, "C2042@92151L1332,2067@93640L32,*2070@93810L54,2073@93971L303,2036@91815L2459:DatePicker.kt#uh7d8r");
                                        if ((i14 + 48) - (48 | i14) == 0) {
                                            i14 |= composer3.changed(i12) ? 32 : 16;
                                        }
                                        if ((i14 & 145) == 144 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1040623618, i14, -1, "androidx.compose.material3.YearPicker.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:2034)");
                                        }
                                        final int first = i12 + intRange3.getFirst();
                                        final String localString$default = CalendarLocale_jvmKt.toLocalString$default(first, 0, 0, false, 7, null);
                                        Modifier modifierM1057requiredSizeVpY3zN4 = SizeKt.m1057requiredSizeVpY3zN4(Modifier.Companion, DatePickerModalTokens.INSTANCE.m3171getSelectionYearContainerWidthD9Ej5fM(), DatePickerModalTokens.INSTANCE.m3170getSelectionYearContainerHeightD9Ej5fM());
                                        ComposerKt.sourceInformationMarkerStart(composer3, -213653794, "CC(remember):DatePicker.kt#9igjgp");
                                        int i15 = ((i14 & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) == 32 ? 1 : 0) | (composer3.changed(lazyGridState) ? 1 : 0);
                                        boolean zChangedInstance = composer3.changedInstance(coroutineScope2);
                                        int i16 = (-1) - (((-1) - ((i15 + (zChangedInstance ? 1 : 0)) - (i15 & (zChangedInstance ? 1 : 0)))) & ((-1) - (composer3.changed(str) ? 1 : 0)));
                                        boolean zChanged4 = composer3.changed(str2);
                                        int i17 = (i16 + (zChanged4 ? 1 : 0)) - (i16 & (zChanged4 ? 1 : 0));
                                        final LazyGridState lazyGridState2 = lazyGridState;
                                        final CoroutineScope coroutineScope3 = coroutineScope2;
                                        final String str3 = str;
                                        final String str4 = str2;
                                        Object objRememberedValue3 = composer3.rememberedValue();
                                        if (i17 != 0 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                                            objRememberedValue3 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DatePickerKt$YearPicker$1$2$1$1$1$1
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
                                                    List listCustomScrollActions;
                                                    LazyGridItemInfo lazyGridItemInfo;
                                                    if (lazyGridState2.getFirstVisibleItemIndex() == i12 || ((lazyGridItemInfo = (LazyGridItemInfo) CollectionsKt.lastOrNull((List) lazyGridState2.getLayoutInfo().getVisibleItemsInfo())) != null && lazyGridItemInfo.getIndex() == i12)) {
                                                        listCustomScrollActions = DatePickerKt.customScrollActions(lazyGridState2, coroutineScope3, str3, str4);
                                                    } else {
                                                        listCustomScrollActions = CollectionsKt.emptyList();
                                                    }
                                                    SemanticsPropertiesKt.setCustomActions(semanticsPropertyReceiver, listCustomScrollActions);
                                                }
                                            };
                                            composer3.updateRememberedValue(objRememberedValue3);
                                        }
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        Modifier modifierSemantics$default2 = SemanticsModifierKt.semantics$default(modifierM1057requiredSizeVpY3zN4, false, (Function1) objRememberedValue3, 1, null);
                                        boolean z2 = first == i10;
                                        boolean z3 = first == i11;
                                        ComposerKt.sourceInformationMarkerStart(composer3, -213607446, "CC(remember):DatePicker.kt#9igjgp");
                                        boolean z4 = (-1) - (((-1) - (composer3.changed(function13) ? 1 : 0)) & ((-1) - (composer3.changed(first) ? 1 : 0))) == 1;
                                        final Function1<Integer, Unit> function14 = function13;
                                        Object objRememberedValue4 = composer3.rememberedValue();
                                        if (z4 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                                            objRememberedValue4 = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.DatePickerKt$YearPicker$1$2$1$1$2$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
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
                                                    function14.invoke(Integer.valueOf(first));
                                                }
                                            };
                                            composer3.updateRememberedValue(objRememberedValue4);
                                        }
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        boolean zIsSelectableYear = selectableDates3.isSelectableYear(first);
                                        Strings.Companion companion3 = Strings.Companion;
                                        String str5 = String.format(Strings_androidKt.m2993getString2EP1pXo(Strings.m2923constructorimpl(R.string.m3c_date_picker_navigate_to_year_description), composer3, 0), Arrays.copyOf(new Object[]{localString$default}, 1));
                                        Intrinsics.checkNotNullExpressionValue(str5, "format(this, *args)");
                                        DatePickerKt.Year(modifierSemantics$default2, z2, z3, (Function0) objRememberedValue4, zIsSelectableYear, str5, datePickerColors3, ComposableLambdaKt.rememberComposableLambda(882189459, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt.YearPicker.1.2.1.1.3
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                invoke(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer4, int i18) {
                                                ComposerKt.sourceInformation(composer4, "C2074@93993L263:DatePicker.kt#uh7d8r");
                                                if ((i18 & 3) != 2 || !composer4.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(882189459, i18, -1, "androidx.compose.material3.YearPicker.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:2074)");
                                                    }
                                                    TextKt.m2711Text4IGK_g(localString$default, SemanticsModifierKt.clearAndSetSemantics(Modifier.Companion, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DatePickerKt.YearPicker.1.2.1.1.3.1
                                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                            invoke2(semanticsPropertyReceiver);
                                                            return Unit.INSTANCE;
                                                        }
                                                    }), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6520boximpl(TextAlign.Companion.m6527getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 0, 0, 130556);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer4.skipToGroupEnd();
                                            }
                                        }, composer3, 54), composer3, 12582912);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }), 14, null);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    LazyGridDslKt.LazyVerticalGrid(fixed2, modifierSemantics$default, lazyGridStateRememberLazyGridState, null, false, horizontalOrVerticalM898spacedBy0680j_4, horizontalOrVertical, null, false, (Function1) objRememberedValue2, composer2, 1769472, HttpStatus.SC_REQUEST_TIMEOUT);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt.YearPicker.2
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
                    DatePickerKt.YearPicker(modifier, j2, function1, selectableDates, calendarModel, intRange, datePickerColors, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i2) & ((-1) - 1))));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Year(final Modifier modifier, final boolean z2, final boolean z3, final Function0<Unit> function0, final boolean z4, final String str, final DatePickerColors datePickerColors, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(238547184);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Year)P(5,7,2,6,4,3)2099@94618L393,2117@95386L102,2122@95584L5,2123@95614L58,2126@95739L83,2129@95878L106,2110@95016L968:DatePicker.kt#uh7d8r");
        if ((i2 + 6) - (i2 | 6) == 0) {
            i3 = (-1) - (((-1) - (composerStartRestartGroup.changed(modifier) ? 4 : 2)) & ((-1) - i2));
        } else {
            i3 = i2;
        }
        if ((i2 + 48) - (i2 | 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i3 |= composerStartRestartGroup.changed(z3) ? 256 : 128;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 3072)) == 0) {
            int i4 = composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
            i3 = (i3 + i4) - (i3 & i4);
        }
        if ((i2 & 24576) == 0) {
            int i5 = composerStartRestartGroup.changed(z4) ? 16384 : 8192;
            i3 = (i3 + i5) - (i3 & i5);
        }
        if ((ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE + i2) - (196608 | i2) == 0) {
            int i6 = composerStartRestartGroup.changed(str) ? 131072 : 65536;
            i3 = (i3 + i6) - (i3 & i6);
        }
        if ((1572864 + i2) - (1572864 | i2) == 0) {
            i3 |= composerStartRestartGroup.changed(datePickerColors) ? 1048576 : 524288;
        }
        if ((12582912 + i2) - (12582912 | i2) == 0) {
            int i7 = composerStartRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
            i3 = (i3 + i7) - (i3 & i7);
        }
        if ((4793491 + i3) - (4793491 | i3) == 4793490 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(238547184, i3, -1, "androidx.compose.material3.Year (DatePicker.kt:2097)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1682587287, "CC(remember):DatePicker.kt#9igjgp");
            int i8 = (i3 + 896) - (896 | i3) == 256 ? 1 : 0;
            int i9 = (i3 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (112 | i3);
            int i10 = i9 == 32 ? 1 : 0;
            int i11 = (i8 + i10) - (i8 & i10);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i11 != 0 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = (!z3 || z2) ? null : BorderStrokeKt.m600BorderStrokecXLIe8U(DatePickerModalTokens.INSTANCE.m3164getDateTodayContainerOutlineWidthD9Ej5fM(), datePickerColors.m2035getTodayDateBorderColor0d7_KjU());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            BorderStroke borderStroke = (BorderStroke) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1682563002, "CC(remember):DatePicker.kt#9igjgp");
            boolean z5 = (458752 + i3) - (458752 | i3) == 131072;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z5 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DatePickerKt$Year$1$1
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
                        SemanticsPropertiesKt.setText(semanticsPropertyReceiver, new AnnotatedString(str, null, null, 6, null));
                        SemanticsPropertiesKt.m5952setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m5933getButtono7Vup1c());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Modifier modifierSemantics = SemanticsModifierKt.semantics(modifier, true, (Function1) objRememberedValue2);
            Shape value = ShapesKt.getValue(DatePickerModalTokens.INSTANCE.getSelectionYearStateLayerShape(), composerStartRestartGroup, 6);
            int i12 = i3 >> 3;
            int i13 = (i12 + 14) - (i12 | 14);
            int i14 = i3 >> 9;
            int i15 = 112 & i14;
            long jM4188unboximpl = datePickerColors.yearContainerColor$material3_release(z2, z4, composerStartRestartGroup, (-1) - (((-1) - ((i13 + i15) - (i13 & i15))) & ((-1) - ((-1) - (((-1) - (i3 >> 12)) | ((-1) - 896)))))).getValue().m4188unboximpl();
            int i16 = i3 >> 6;
            int i17 = (i16 + 14) - (14 | i16);
            long jM4188unboximpl2 = datePickerColors.yearContentColor$material3_release(z3, z2, z4, composerStartRestartGroup, ((-1) - (((-1) - ((i17 + i9) - (i17 & i9))) & ((-1) - ((i16 + 896) - (896 | i16))))) | (i14 & 7168)).getValue().m4188unboximpl();
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1573188346, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt.Year.2
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

                public final void invoke(Composer composer2, int i18) {
                    ComposerKt.sourceInformation(composer2, "C2130@95888L90:DatePicker.kt#uh7d8r");
                    if ((-1) - (((-1) - i18) | ((-1) - 3)) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1573188346, i18, -1, "androidx.compose.material3.Year.<anonymous> (DatePicker.kt:2130)");
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
                    Alignment center = Alignment.Companion.getCenter();
                    Function2<Composer, Integer, Unit> function22 = function2;
                    ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
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
                    ComposerKt.sourceInformationMarkerStart(composer2, -2124301604, "C2130@95967L9:DatePicker.kt#uh7d8r");
                    function22.invoke(composer2, 0);
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
            int i18 = (-1) - (((-1) - i13) & ((-1) - ((-1) - (((-1) - i16) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)))));
            int i19 = (-1) - (((-1) - i12) | ((-1) - 7168));
            SurfaceKt.m2562Surfaced85dljk(z2, function0, modifierSemantics, z4, value, jM4188unboximpl, jM4188unboximpl2, 0.0f, 0.0f, borderStroke, (MutableInteractionSource) null, composableLambdaRememberComposableLambda, composerStartRestartGroup, (i18 + i19) - (i18 & i19), 48, 1408);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt.Year.3
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
                    Modifier modifier2 = modifier;
                    boolean z6 = z2;
                    boolean z7 = z3;
                    Function0<Unit> function02 = function0;
                    boolean z8 = z4;
                    String str2 = str;
                    DatePickerColors datePickerColors2 = datePickerColors;
                    Function2<Composer, Integer, Unit> function22 = function2;
                    int i21 = i2;
                    DatePickerKt.Year(modifier2, z6, z7, function02, z8, str2, datePickerColors2, function22, composer2, RecomposeScopeImplKt.updateChangedFlags((i21 + 1) - (i21 & 1)));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MonthsNavigation(final Modifier modifier, final boolean z2, final boolean z3, final boolean z4, final String str, final Function0<Unit> function0, final Function0<Unit> function02, final Function0<Unit> function03, final DatePickerColors datePickerColors, Composer composer, final int i2) {
        int i3;
        Arrangement.HorizontalOrVertical spaceBetween;
        Composer composerStartRestartGroup = composer.startRestartGroup(-773929258);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(MonthsNavigation)P(1,2,6,8,7,3,4,5)2151@96490L2049:DatePicker.kt#uh7d8r");
        if ((i2 & 6) == 0) {
            i3 = (-1) - (((-1) - (composerStartRestartGroup.changed(modifier) ? 4 : 2)) & ((-1) - i2));
        } else {
            i3 = i2;
        }
        if ((i2 + 48) - (i2 | 48) == 0) {
            int i4 = composerStartRestartGroup.changed(z2) ? 32 : 16;
            i3 = (i3 + i4) - (i3 & i4);
        }
        if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changed(z3) ? 256 : 128)));
        }
        if ((i2 & 3072) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changed(z4) ? 2048 : 1024)));
        }
        if ((-1) - (((-1) - i2) | ((-1) - 24576)) == 0) {
            int i5 = composerStartRestartGroup.changed(str) ? 16384 : 8192;
            i3 = (i3 + i5) - (i3 & i5);
        }
        if ((196608 & i2) == 0) {
            int i6 = composerStartRestartGroup.changedInstance(function0) ? 131072 : 65536;
            i3 = (i3 + i6) - (i3 & i6);
        }
        if ((1572864 + i2) - (1572864 | i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function02) ? 1048576 : 524288;
        }
        if ((-1) - (((-1) - 12582912) | ((-1) - i2)) == 0) {
            int i7 = composerStartRestartGroup.changedInstance(function03) ? 8388608 : 4194304;
            i3 = (i3 + i7) - (i3 & i7);
        }
        if ((-1) - (((-1) - 100663296) | ((-1) - i2)) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changed(datePickerColors) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432)));
        }
        if ((-1) - (((-1) - 38347923) | ((-1) - i3)) != 38347922 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-773929258, i3, -1, "androidx.compose.material3.MonthsNavigation (DatePicker.kt:2150)");
            }
            Modifier modifierM1052requiredHeight3ABfNKs = SizeKt.m1052requiredHeight3ABfNKs(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), MonthYearHeight);
            if (z4) {
                spaceBetween = Arrangement.INSTANCE.getStart();
            } else {
                spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            }
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composerStartRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1052requiredHeight3ABfNKs);
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
            Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407918630, "C100@5047L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -856633141, "C2161@96905L1628,2161@96822L1711:DatePicker.kt#uh7d8r");
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4168boximpl(datePickerColors.m2027getNavigationContentColor0d7_KjU())), ComposableLambdaKt.rememberComposableLambda(-962805198, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$MonthsNavigation$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i8) {
                    ComposerKt.sourceInformation(composer2, "C2166@97104L559,2163@96970L693,2181@97813L696:DatePicker.kt#uh7d8r");
                    if ((i8 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-962805198, i8, -1, "androidx.compose.material3.MonthsNavigation.<anonymous>.<anonymous> (DatePicker.kt:2163)");
                        }
                        Function0<Unit> function04 = function03;
                        boolean z5 = z4;
                        final String str2 = str;
                        DatePickerKt.YearPickerMenuButton(function04, z5, null, ComposableLambdaKt.rememberComposableLambda(1377272806, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$MonthsNavigation$1$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i9) {
                                ComposerKt.sourceInformation(composer3, "C2170@97245L386,2167@97122L527:DatePicker.kt#uh7d8r");
                                if ((i9 & 3) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1377272806, i9, -1, "androidx.compose.material3.MonthsNavigation.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:2167)");
                                    }
                                    String str3 = str2;
                                    Modifier.Companion companion = Modifier.Companion;
                                    ComposerKt.sourceInformationMarkerStart(composer3, -557901719, "CC(remember):DatePicker.kt#9igjgp");
                                    boolean zChanged = composer3.changed(str2);
                                    final String str4 = str2;
                                    Object objRememberedValue = composer3.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                                        objRememberedValue = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DatePickerKt$MonthsNavigation$1$1$1$1$1
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
                                                SemanticsPropertiesKt.m5951setLiveRegionhR3wRGc(semanticsPropertyReceiver, LiveRegionMode.Companion.m5925getPolite0phEisY());
                                                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str4);
                                            }
                                        };
                                        composer3.updateRememberedValue(objRememberedValue);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    TextKt.m2711Text4IGK_g(str3, SemanticsModifierKt.semantics$default(companion, false, (Function1) objRememberedValue, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131068);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }, composer2, 54), composer2, 3072, 4);
                        if (!z4) {
                            Function0<Unit> function05 = function02;
                            boolean z6 = z3;
                            Function0<Unit> function06 = function0;
                            boolean z7 = z2;
                            ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                            Modifier.Companion companion = Modifier.Companion;
                            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composer2, 0);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, companion);
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
                            Updater.m3678setimpl(composerM3671constructorimpl2, measurePolicyRowMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                            Updater.m3678setimpl(composerM3671constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                            if (composerM3671constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM3671constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM3671constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m3678setimpl(composerM3671constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer2, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer2, -114486608, "C2182@97839L321,2188@98181L310:DatePicker.kt#uh7d8r");
                            IconButtonKt.IconButton(function05, null, z6, null, null, ComposableSingletons$DatePickerKt.INSTANCE.m1980getLambda3$material3_release(), composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 26);
                            IconButtonKt.IconButton(function06, null, z7, null, null, ComposableSingletons$DatePickerKt.INSTANCE.m1981getLambda4$material3_release(), composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 26);
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
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (-1) - (((-1) - ProvidedValue.$stable) & ((-1) - 48)));
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt.MonthsNavigation.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i8) {
                    Modifier modifier2 = modifier;
                    boolean z5 = z2;
                    boolean z6 = z3;
                    boolean z7 = z4;
                    String str2 = str;
                    Function0<Unit> function04 = function0;
                    Function0<Unit> function05 = function02;
                    Function0<Unit> function06 = function03;
                    DatePickerColors datePickerColors2 = datePickerColors;
                    int i9 = i2;
                    DatePickerKt.MonthsNavigation(modifier2, z5, z6, z7, str2, function04, function05, function06, datePickerColors2, composer2, RecomposeScopeImplKt.updateChangedFlags((i9 + 1) - (i9 & 1)));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void YearPickerMenuButton(final Function0<Unit> function0, final boolean z2, Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(409654418);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(YearPickerMenuButton)P(3,1,2)2212@98959L7,2212@98909L58,2215@99024L453,2208@98780L697:DatePicker.kt#uh7d8r");
        if ((i3 + 1) - (i3 | 1) != 0) {
            i4 = (i2 + 6) - (i2 & 6);
        } else if ((i2 & 6) == 0) {
            int i5 = composerStartRestartGroup.changedInstance(function0) ? 4 : 2;
            i4 = (i5 + i2) - (i5 & i2);
        } else {
            i4 = i2;
        }
        if ((i3 + 2) - (i3 | 2) != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 48));
        } else if ((i2 & 48) == 0) {
            int i6 = composerStartRestartGroup.changed(z2) ? 32 : 16;
            i4 = (i4 + i6) - (i4 & i6);
        }
        int i7 = (-1) - (((-1) - i3) | ((-1) - 4));
        if (i7 != 0) {
            i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i4 |= composerStartRestartGroup.changed(companion) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 3072));
        } else if ((-1) - (((-1) - i2) | ((-1) - 3072)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024)));
        }
        if ((-1) - (((-1) - i4) | ((-1) - 1171)) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (i7 != 0) {
                companion = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(409654418, i4, -1, "androidx.compose.material3.YearPickerMenuButton (DatePicker.kt:2207)");
            }
            RoundedCornerShape circleShape = RoundedCornerShapeKt.getCircleShape();
            ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
            ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localContentColor);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ButtonKt.TextButton(function0, companion, false, circleShape, buttonDefaults.m1837textButtonColorsro_MJ88(0L, ((Color) objConsume).m4188unboximpl(), 0L, 0L, composerStartRestartGroup, 24576, 13), null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1899012021, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt.YearPickerMenuButton.1
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

                public final void invoke(RowScope rowScope, Composer composer2, int i8) {
                    String strM2993getString2EP1pXo;
                    ComposerKt.sourceInformation(composer2, "C2216@99034L9,2217@99052L49,2218@99110L361:DatePicker.kt#uh7d8r");
                    if ((i8 & 17) != 16 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1899012021, i8, -1, "androidx.compose.material3.YearPickerMenuButton.<anonymous> (DatePicker.kt:2216)");
                        }
                        function2.invoke(composer2, 0);
                        SpacerKt.Spacer(SizeKt.m1063size3ABfNKs(Modifier.Companion, ButtonDefaults.INSTANCE.m1833getIconSpacingD9Ej5fM()), composer2, 6);
                        ImageVector arrowDropDown = ArrowDropDownKt.getArrowDropDown(Icons.Filled.INSTANCE);
                        if (z2) {
                            composer2.startReplaceGroup(-1360040181);
                            ComposerKt.sourceInformation(composer2, "2222@99241L49");
                            Strings.Companion companion2 = Strings.Companion;
                            strM2993getString2EP1pXo = Strings_androidKt.m2993getString2EP1pXo(Strings.m2923constructorimpl(R.string.m3c_date_picker_switch_to_day_selection), composer2, 0);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(-1359945910);
                            ComposerKt.sourceInformation(composer2, "2224@99336L50");
                            Strings.Companion companion3 = Strings.Companion;
                            strM2993getString2EP1pXo = Strings_androidKt.m2993getString2EP1pXo(Strings.m2923constructorimpl(R.string.m3c_date_picker_switch_to_year_selection), composer2, 0);
                            composer2.endReplaceGroup();
                        }
                        IconKt.m2168Iconww6aTOc(arrowDropDown, strM2993getString2EP1pXo, RotateKt.rotate(Modifier.Companion, z2 ? 180.0f : 0.0f), 0L, composer2, 0, 8);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (-1) - (((-1) - ((-1) - (((-1) - ((-1) - (((-1) - i4) | ((-1) - 14)))) & ((-1) - 807075840)))) & ((-1) - ((i4 >> 3) & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION))), 388);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt.YearPickerMenuButton.2
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
                    DatePickerKt.YearPickerMenuButton(function0, z2, modifier2, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<CustomAccessibilityAction> customScrollActions(final LazyGridState lazyGridState, final CoroutineScope coroutineScope, String str, String str2) {
        return CollectionsKt.listOf((Object[]) new CustomAccessibilityAction[]{new CustomAccessibilityAction(str, new Function0<Boolean>() { // from class: androidx.compose.material3.DatePickerKt$customScrollActions$scrollUpAction$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                boolean z2;
                if (lazyGridState.getCanScrollBackward()) {
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(lazyGridState, null), 3, null);
                    z2 = true;
                } else {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            }

            /* JADX INFO: renamed from: androidx.compose.material3.DatePickerKt$customScrollActions$scrollUpAction$1$1, reason: invalid class name */
            /* JADX INFO: compiled from: DatePicker.kt */
            @InterfaceC1492Gx
            @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
            @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0002v\u000b|\u000b\u0003{\bOKb\u0001\u0015\u0007r\r\b\u0011\f\u001as\u001eN\u000f\"!#\u001f\u001e\u0005\u0016&$\"#x\u001c.$++1b3$4201\u001b7\t,>4;;q\u007fs\u0002", f = "\u0011-?/\u00191*1*6p-5", i = {}, l = {2242}, m = "8>GA>9(KJH>H?", n = {}, s = {})
            static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ LazyGridState $state;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(LazyGridState lazyGridState, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$state = lazyGridState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.$state, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        LazyGridState lazyGridState = this.$state;
                        this.label = 1;
                        if (LazyGridState.scrollToItem$default(lazyGridState, lazyGridState.getFirstVisibleItemIndex() - 3, 0, this, 2, null) == coroutine_suspended) {
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
        }), new CustomAccessibilityAction(str2, new Function0<Boolean>() { // from class: androidx.compose.material3.DatePickerKt$customScrollActions$scrollDownAction$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                boolean z2;
                if (lazyGridState.getCanScrollForward()) {
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(lazyGridState, null), 3, null);
                    z2 = true;
                } else {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            }

            /* JADX INFO: renamed from: androidx.compose.material3.DatePickerKt$customScrollActions$scrollDownAction$1$1, reason: invalid class name */
            /* JADX INFO: compiled from: DatePicker.kt */
            @InterfaceC1492Gx
            @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
            @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0002v\u000b|\u000b\u0003{\bOKb\u0001\u0015\u0007r\r\b\u0011\f\u001as\u001eN\u000f\"!#\u001f\u001e\u0005\u0016&$\"#x\u001c.$++1b3$4201\n6?7\u000b.@6==s\u0002u\u0004", f = "\u0011-?/\u00191*1*6p-5", i = {}, l = {2250}, m = "8>GA>9(KJH>H?", n = {}, s = {})
            static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ LazyGridState $state;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(LazyGridState lazyGridState, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$state = lazyGridState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.$state, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        LazyGridState lazyGridState = this.$state;
                        this.label = 1;
                        if (LazyGridState.scrollToItem$default(lazyGridState, lazyGridState.getFirstVisibleItemIndex() + 3, 0, this, 2, null) == coroutine_suspended) {
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
        })});
    }

    public static final float getRecommendedSizeForAccessibility() {
        return RecommendedSizeForAccessibility;
    }

    public static final float getMonthYearHeight() {
        return MonthYearHeight;
    }

    public static final float getDatePickerHorizontalPadding() {
        return DatePickerHorizontalPadding;
    }

    public static final PaddingValues getDatePickerModeTogglePadding() {
        return DatePickerModeTogglePadding;
    }

    static {
        float f2 = 12;
        DatePickerHorizontalPadding = Dp.m6638constructorimpl(f2);
        DatePickerModeTogglePadding = PaddingKt.m1015PaddingValuesa9UjIt4$default(0.0f, 0.0f, Dp.m6638constructorimpl(f2), Dp.m6638constructorimpl(f2), 3, null);
        float f3 = 24;
        float f4 = 16;
        DatePickerTitlePadding = PaddingKt.m1015PaddingValuesa9UjIt4$default(Dp.m6638constructorimpl(f3), Dp.m6638constructorimpl(f4), Dp.m6638constructorimpl(f2), 0.0f, 8, null);
        DatePickerHeadlinePadding = PaddingKt.m1015PaddingValuesa9UjIt4$default(Dp.m6638constructorimpl(f3), 0.0f, Dp.m6638constructorimpl(f2), Dp.m6638constructorimpl(f2), 2, null);
        YearsVerticalPadding = Dp.m6638constructorimpl(f4);
    }
}
