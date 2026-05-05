package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextHighlightType;
import androidx.compose.foundation.text.input.internal.selection.AndroidTextFieldMagnifier_androidKt;
import androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNode;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextPainter;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.unit.Constraints;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
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
/* JADX INFO: compiled from: TextFieldCoreModifier.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яś\u0014D57\u001eq\u007fZDkt\u001aA\u000e0!.J~8,\u001aw\u001dfr9FDm߉6Ra3\u0017k\u00024,[:qKП]\u001a\u0014\"\u0011ѧVg}nRҙ\u0013C%\u0006\u001exp,QU\u000f]\u001aƁ:B\u0006?;Mu=A`\u000b6\rړ:\"Ny\rЏ\"*^\u0010~ٙKK\"\u00128ϋx:`\u0013U\u0005 \u0014\u000e>6\u0001&\\mR>Hz]B/)\u0003qBd'g0\u0003N\u0015Fj'\u0015Ǹi\u001eA@?ߎ\u001d%i\u0003\u000fRa?\u000b?\b=\rh='3ɞ{WLX\b\u0014\u001b/W\rsr.\\\u001bQhϯ/+ecSִ\u0016(\u000ez\u0004\rB\t\u0016\u0006=H6- g\u0010\u000eItzSFQ\bމXȕ+ad\u0016U\u007fa+i\u001b\u0015R\u0012;GPg{3\u0010N#/ra'd\u0012n\u001a3T&WAUND`N8_Mq\u0012xz\u0002X\r@K\u000e9\u0014\u0011\\\"5;iE;!\u001a\u000fXHu\u0005\u001d`\u0017byVVP:nD=:\r\u001ak\\d3}`Xf?)MJhΘ\u0002\b!5%\u0018JF=\u0010|n\u0019mxsu\nSL\u0017;g\u0016\u0004\u000e\u0006X%3ΉPүߧeT|<Me+\u000bf\u0011ZS:\u0006#<j@V\u0017(w*o~\u0010!_WqJbrEab#w\u001b\u001eplC\t('v@\u0017TaO3m2y!\u0001~b!su\u007fa,+fR1OYM\u0019T^RlB\u0007;\u0007-~0KuX_L\u001b#&Y\n..\u001ag`_A!\u001f\u0017)`\b]IZ\u0004}Q{$W~\u000b\r';\u0017B0\u0012x\"D`\u0019uwTET=r;-\u0016\u0018\u0018y\u0010q#G\u0012\tQo\u0007S\u00018q<|c%\u0005MTk\u00018H\u000blECUH>wBeEqk\"\b:\nd\u001f&# \u0014.s\u0016\u001e\u007f\u007f\u0017b?F\u0005q~l^jlKfV(\u0010\bp4\\\ra~qh~\u0015PM9L.j\u0015g%p\u0005\u0018\u0001\u0013\u0383|Үˀc,y\u0003\fT'U3ReS\u0016\u0019\u0016K\u000bAz\u0013\u0018F\u00141\u001dNb=hze%!047@6o\u007f\u0013\tJN<4Z\u00038\u000fQ\u001c\u0002\u0006>CFZޣ\u000eğЋFuA \u001c\u001fA\u0001d\u0014\u001d`s$I*/C?7,>M134vX=+J\u0001\u0002eO\u001b̻Nƫݝ)-J!Gep|\u000fX]]q\r*62\fYqy5$8FCMF&bQQ?(=0ϕ\n͇ٝRf|`t\u001d\u0017V7N\u0013|<g2\u000f9i\u007fv}4EL|\u0017gG(S/DW&<\u0001ql3-4R]AW>,'*,\u001a;״\u0007¶Č+\u0006zvj.^t\u0018s3<,pDyXƄ\u001fц$\u00046\u05fdE~\u0018F 6}\u001b\nû\u0015Ȩ]k\u007f˺\u001139z\u001eBywOƀoؼgn]̃Sr?]\u0012n[Vsԗ3Ӱ2\u0013`Ŕ\u000b\u001da%p\u0011.\u001akҴ+߱\fb1ց ov\u0004\u0004O\n!\u0002ԝwˮe18ܼn\n-\u0014\u000e\u0004Xo~׀GܑQ>lӷ-\u0001Ps&`\u0001'\u0013\u0012bÌ В}Ĝז\u0010\u0012̭Jr&ҋ\u007fC'=s\ru\u007f]ʚQõ*!9Ĝ\u0010'EC#oV\tgܞFŪx\u007f2ХY\u0005\u000e\bD-tZsZ}ڕ&މh\u0007>MKYP*|\u001d\u001c4GZfD\u0015ё\u001c̄?Q;߿i\u001d\u000f!P\u0006\u001e\u0014oƽvܱW%2ʈM\r\u001bI\u00121\u001aEJم~ܯ3\u000fwߦ(rI-Mez0b֎qڧ\u0003MkǾ_m:YMEL\u007f,ʱ\fˌ#$,Ԗ±#\tM4N\u008c{\u000b?^s]#ڸ.\u000e"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR,a\u0006\bKLU+:\\\u007f={\u001cY\u0012O/\r\u0012BK#n\u001a", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9l<}%7U\r$@o~8LC\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehe*6q\u00172MP$u3\u001ej", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9lIr7\u001dc|$8q\u0016;6M:k\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9kF~0?g\u0002/;w\u001f\u0015WA7r\u0012(\u001evqA\u0007p\u0014Xu+HPN9E\\q=i", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9oC\u0001\"1`h*Eq%2WL\u0017}0+\u0015Pk8\u000bd0N\u0004\u0010QKN\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9{<~!>h\u0002\u001eEU -QD?kA\u0007\u001fga\u000f", "7r5<V<LS\u0018", "", "7r3?T.!]*~\b^+", "BdgA?(R])\u000ehm(\f\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR,a\u0006\u000eC`X<k@\u00029#\u00120", "BdgA90>Z\u0018l\nZ;|", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR9J\u007f5HV[4\\Qa='!;\u0012N2\frh=3n\u001a", "BdgA90>Z\u0018lze,z\u00183o\t\u0016\u000b<\u0010\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@Pq,Uv%VPX5&ArP#r^\u000eU*z\u0005`A\"}HA(u;E\u0011;>", "1ta@b9\u001b`)\r}", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012f\u000e.:C", "EqXAX(;Z\u0019", "Aba<_3,b\u0015\u000ez", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u00133f\b'>[%*\\C\u0011", "=qX2a;:b\u001d\t\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w7P?k=-\u0011weC\u00109", "uYI\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0002!'Pn\nKz/>#\r J|_2VNKz}\"\u001ewaF\u0010_3\u0018e'Z[5(p\\\u0003L\u0002!V\u001dN\u0001s\u0001b@1xH62Q*S\nFr\u000f\f_\u000f?zyAR\u001fK\u0004\u001e?P){U#c\u0003RQT,.m\u001b_*e6Am\u0003~\u0015$vQ8\u0017\u0004S\u0010aR\rvHK\u0019\u00027\u0012MijF\u001bVQEs4)Oz\u000b[0b|6~;\u0004}+@t\u000eJc'Bh\u0002^;\\T6o:E\u001eOZ-yuM\u000eu(]\u000fWp58\u0019ctgR\u0018PL\u0017nDBc\u0001>Qs>Po\u00136J\tKI\t\u0011\u0018\u0007yTaRB(^\u0005\u0019\u0004\u000e i\u0019\u000e\rt\u0018e>\u001a\u0007[\u001cd5b;K!REE\u001c\n\\\u0019\nWD\u0019lX|_V\u0003m4\u0003\u0019T+AK\u0006w\\Sx\u000f\u0012C\u0005\u0015\bfagO\u0004=\u001a\u001349h88G+\u0014f`,\u001dfKe\u001d79\r\\Nn(x1%\u0007\rd\f\u0019gG\u0002\u00043OXz/<q\u0015nI^R\u0019;I$3j}k\u0006L", "1gP;Z,(P'~\bo,\nm9b", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E%\u000b\u0014l", "1ta@b9\u001a\\\u001d\u0007vm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PA<[\u00051T(W0dN\u0002A\u001e\u001bH\u001dJ:\rZ", ">qTC\\6Nav\u000f\bl6\nu/c\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", ">qTC\\6Na\u0007~\u0002^*\f\r9n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\"U\u0007\"7C", ">qTC\\6Na\b~\u000em\u0013x\u001d9u\u000f\u0016\u007fU\u0001", "", "Ag^D6<Ka#\f", "5dc [6P1)\f\th9", "u(I", "BdgA90>Z\u0018fv`5\u0001\n3e\r\u0011\u0006?\u0001", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@Pq,Uv%VPX5&ArP#r^\u000eU*t\u0001[J(oH7,p6H\u0002\u0011", "1`[0h3:b\u0019h{_:|\u0018\u001eo`2\u0003G\u000b)", "1ta?F,ES\u0017\u000e~h5", "1ta?G,Qb\u007fz\u000fh<\fv3z\u007f", "1`[0h3:b\u0019h{_:|\u0018\u001eo`2\u0003G\u000b)^\u0019<kH`\u0017\u0015", "uI8u<", "=m0Ag(<V", "", "=m69b):Z \u0013eh:\u0001\u00183o\t(z", "1n^?W0GO(~\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/\u0015w ;LGDgC\u001e#>", "AsP?g\nN`'\t\bC6y", "CoS.g,']\u0018~", "/o_9l\u001a>[\u0015\b\nb*\u000b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G}(3v%2KQ&x>)\u0015upMsc*Nz8GY$", "2qPD", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u0019u=-\u0015qp\u0018\u0014_><t1RL$", "2qPD6<Ka#\f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00\u0003fkD\u00079", "2qPD;0@V \u0003|a;", "6hV5_0@V(", "\u001aj^A_0G\u001d\u0004z~k\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r*kG-wlc<\u000eg.Q\u0006\u0016[WN\u0002", "BdgA?(R])\u000eg^:\r\u0010>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u001cU\u0012*G|\u0003.[SBz\n", "2qPDF,ES\u0017\u000e~h5", "Ad[2V;B]\"", "2qPDF,ES\u0017\u000e~h5Dv,-\\&H(", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~X\u000b\u001cI{\u00148XC\u0005JA\u001a'V_C\u0012c\u00023]#PK[6`Q\u0006\u0007\u0012\u001cb\u0019X9\rNiEm}DJ.Q\u001bI\u0015JO|  \u001eDWpPf\u0017VOXf", "2qPDG,Qb", ";dP@h9>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7[\u00148XC\u0011", ";dP@h9:P ~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-3j\u001d.#", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", ";dP@h9>\u001bf\nGl~G\u0017", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\r5U\f0Dm\u0004,WN;A\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001c\u0003A]\u0019V\"X;\u001cNAA |TD\u001b\u00053IW ,g\b\u001f\rBttAiYE\u0004\u001d\u0001K7h\u0010icCN=Yl:sUG\u001dXHJ1\u0014^\u0019)xW=_", ";dP@h9>6#\f~s6\u0006\u0018+lm&\tJ\b\u001e", ";dP@h9>6#\f~s6\u0006\u0018+lm&\tJ\b\u001e^\u0015zZJIoC", ";dP@h9>D\u0019\f\nb*x\u0010\u001dc\r2\u0003G", ";dP@h9>D\u0019\f\nb*x\u0010\u001dc\r2\u0003GHd\"\u0014}`\u0007\u0005", "CoS.g,,Q&\t\u0002e\u001a\f\u0005>e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "1n]AT0GS&l~s,", "BdgA?(R])\u000ehbA|", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "CoS.g,,Q&\t\u0002e\u001a\f\u0005>eG7_Ga,)'", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W\u001bv.C]\r4\rQy\u00134?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016^0&b{A#[A\nb5\u001d\u00148E1nBF#\u00125\u001fE,", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TextFieldCoreModifierNode extends DelegatingNode implements LayoutModifierNode, DrawModifierNode, CompositionLocalConsumerModifierNode, GlobalPositionAwareModifierNode, SemanticsModifierNode {
    public static final int $stable = 8;
    private Job changeObserverJob;
    private Brush cursorBrush;
    private boolean isDragHovered;
    private boolean isFocused;
    private Orientation orientation;
    private TextRange previousSelection;
    private int previousTextLayoutSize;
    private ScrollState scrollState;
    private final TextFieldMagnifierNode textFieldMagnifierNode;
    private TextFieldSelectionState textFieldSelectionState;
    private TransformedTextFieldState textFieldState;
    private TextLayoutState textLayoutState;
    private boolean writeable;
    private final CursorAnimationState cursorAnimation = new CursorAnimationState();
    private Rect previousCursorRect = new Rect(-1.0f, -1.0f, -1.0f, -1.0f);

    public TextFieldCoreModifierNode(boolean z2, boolean z3, TextLayoutState textLayoutState, TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, Brush brush, boolean z4, ScrollState scrollState, Orientation orientation) {
        this.isFocused = z2;
        this.isDragHovered = z3;
        this.textLayoutState = textLayoutState;
        this.textFieldState = transformedTextFieldState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.cursorBrush = brush;
        this.writeable = z4;
        this.scrollState = scrollState;
        this.orientation = orientation;
        this.textFieldMagnifierNode = (TextFieldMagnifierNode) delegate(AndroidTextFieldMagnifier_androidKt.textFieldMagnifierNode(this.textFieldState, this.textFieldSelectionState, this.textLayoutState, this.isFocused || this.isDragHovered));
    }

    private final boolean getShowCursor() {
        return this.writeable && (this.isFocused || this.isDragHovered) && TextFieldCoreModifierKt.isSpecified(this.cursorBrush);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        if (this.isFocused && getShowCursor()) {
            startCursorJob();
        }
    }

    public final void updateNode(boolean z2, boolean z3, TextLayoutState textLayoutState, TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, Brush brush, boolean z4, ScrollState scrollState, Orientation orientation) {
        boolean showCursor = getShowCursor();
        boolean z5 = this.isFocused;
        TransformedTextFieldState transformedTextFieldState2 = this.textFieldState;
        TextLayoutState textLayoutState2 = this.textLayoutState;
        TextFieldSelectionState textFieldSelectionState2 = this.textFieldSelectionState;
        ScrollState scrollState2 = this.scrollState;
        this.isFocused = z2;
        this.isDragHovered = z3;
        this.textLayoutState = textLayoutState;
        this.textFieldState = transformedTextFieldState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.cursorBrush = brush;
        this.writeable = z4;
        this.scrollState = scrollState;
        this.orientation = orientation;
        this.textFieldMagnifierNode.update(transformedTextFieldState, textFieldSelectionState, textLayoutState, z2 || z3);
        if (!getShowCursor()) {
            Job job = this.changeObserverJob;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            this.changeObserverJob = null;
            this.cursorAnimation.cancelAndHide();
        } else if (!z5 || !Intrinsics.areEqual(transformedTextFieldState2, transformedTextFieldState) || !showCursor) {
            startCursorJob();
        }
        if (Intrinsics.areEqual(transformedTextFieldState2, transformedTextFieldState) && Intrinsics.areEqual(textLayoutState2, textLayoutState) && Intrinsics.areEqual(textFieldSelectionState2, textFieldSelectionState) && Intrinsics.areEqual(scrollState2, scrollState)) {
            return;
        }
        LayoutModifierNodeKt.invalidateMeasurement(this);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo428measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
        return this.orientation == Orientation.Vertical ? m1536measureVerticalScroll3p2s80s(measureScope, measurable, j2) : m1535measureHorizontalScroll3p2s80s(measureScope, measurable, j2);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        TextFieldCharSequence visualText = this.textFieldState.getVisualText();
        TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            return;
        }
        Pair<TextHighlightType, TextRange> highlight = visualText.getHighlight();
        if (highlight != null) {
            drawHighlight(contentDrawScope, highlight, layoutResult);
        }
        if (TextRange.m6117getCollapsedimpl(visualText.m1446getSelectiond9O1mEE())) {
            ContentDrawScope contentDrawScope2 = contentDrawScope;
            drawText(contentDrawScope2, layoutResult);
            if (visualText.shouldShowSelection()) {
                drawCursor(contentDrawScope2);
            }
        } else {
            if (visualText.shouldShowSelection()) {
                m1534drawSelectionSbBc2M(contentDrawScope, visualText.m1446getSelectiond9O1mEE(), layoutResult);
            }
            drawText(contentDrawScope, layoutResult);
        }
        this.textFieldMagnifierNode.draw(contentDrawScope);
    }

    /* JADX INFO: renamed from: measureVerticalScroll-3p2s80s, reason: not valid java name */
    private final MeasureResult m1536measureVerticalScroll3p2s80s(final MeasureScope measureScope, Measurable measurable, long j2) {
        final Placeable placeableMo5514measureBRTryo0 = measurable.mo5514measureBRTryo0(Constraints.m6582copyZbe2FdA$default(j2, 0, 0, 0, Integer.MAX_VALUE, 7, null));
        final int iMin = Math.min(placeableMo5514measureBRTryo0.getHeight(), Constraints.m6590getMaxHeightimpl(j2));
        return MeasureScope.layout$default(measureScope, placeableMo5514measureBRTryo0.getWidth(), iMin, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$measureVerticalScroll$1
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
                this.this$0.m1537updateScrollStatetIlFzwE(measureScope, iMin, placeableMo5514measureBRTryo0.getHeight(), this.this$0.textFieldState.getVisualText().m1446getSelectiond9O1mEE(), measureScope.getLayoutDirection());
                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo5514measureBRTryo0, 0, -this.this$0.scrollState.getValue(), 0.0f, 4, null);
            }
        }, 4, null);
    }

    /* JADX INFO: renamed from: measureHorizontalScroll-3p2s80s, reason: not valid java name */
    private final MeasureResult m1535measureHorizontalScroll3p2s80s(final MeasureScope measureScope, Measurable measurable, long j2) {
        final Placeable placeableMo5514measureBRTryo0 = measurable.mo5514measureBRTryo0(Constraints.m6582copyZbe2FdA$default(j2, 0, Integer.MAX_VALUE, 0, 0, 13, null));
        final int iMin = Math.min(placeableMo5514measureBRTryo0.getWidth(), Constraints.m6591getMaxWidthimpl(j2));
        return MeasureScope.layout$default(measureScope, iMin, placeableMo5514measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$measureHorizontalScroll$1
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
                this.this$0.m1537updateScrollStatetIlFzwE(measureScope, iMin, placeableMo5514measureBRTryo0.getWidth(), this.this$0.textFieldState.getVisualText().m1446getSelectiond9O1mEE(), measureScope.getLayoutDirection());
                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo5514measureBRTryo0, -this.this$0.scrollState.getValue(), 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    /* JADX INFO: renamed from: calculateOffsetToFollow-72CqOWE, reason: not valid java name */
    private final int m1533calculateOffsetToFollow72CqOWE(long j2, int i2) {
        TextRange textRange = this.previousSelection;
        if (textRange == null || TextRange.m6118getEndimpl(j2) != TextRange.m6118getEndimpl(textRange.m6127unboximpl())) {
            return TextRange.m6118getEndimpl(j2);
        }
        TextRange textRange2 = this.previousSelection;
        if (textRange2 == null || TextRange.m6123getStartimpl(j2) != TextRange.m6123getStartimpl(textRange2.m6127unboximpl())) {
            return TextRange.m6123getStartimpl(j2);
        }
        if (i2 != this.previousTextLayoutSize) {
            return TextRange.m6123getStartimpl(j2);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0083  */
    /* JADX INFO: renamed from: updateScrollState-tIlFzwE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1537updateScrollStatetIlFzwE(androidx.compose.ui.unit.Density r10, int r11, int r12, long r13, androidx.compose.ui.unit.LayoutDirection r15) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode.m1537updateScrollStatetIlFzwE(androidx.compose.ui.unit.Density, int, int, long, androidx.compose.ui.unit.LayoutDirection):void");
    }

    /* JADX INFO: renamed from: drawSelection-Sb-Bc2M, reason: not valid java name */
    private final void m1534drawSelectionSbBc2M(DrawScope drawScope, long j2, TextLayoutResult textLayoutResult) {
        int iM6121getMinimpl = TextRange.m6121getMinimpl(j2);
        int iM6120getMaximpl = TextRange.m6120getMaximpl(j2);
        if (iM6121getMinimpl != iM6120getMaximpl) {
            DrawScope.m4724drawPathLG529CI$default(drawScope, textLayoutResult.getPathForRange(iM6121getMinimpl, iM6120getMaximpl), ((TextSelectionColors) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, TextSelectionColorsKt.getLocalTextSelectionColors())).m1747getBackgroundColor0d7_KjU(), 0.0f, null, null, 0, 60, null);
        }
    }

    private final void drawHighlight(DrawScope drawScope, Pair<TextHighlightType, TextRange> pair, TextLayoutResult textLayoutResult) {
        int iM1457unboximpl = pair.component1().m1457unboximpl();
        long jM6127unboximpl = pair.component2().m6127unboximpl();
        if (TextRange.m6117getCollapsedimpl(jM6127unboximpl)) {
            return;
        }
        Path pathForRange = textLayoutResult.getPathForRange(TextRange.m6121getMinimpl(jM6127unboximpl), TextRange.m6120getMaximpl(jM6127unboximpl));
        if (TextHighlightType.m1454equalsimpl0(iM1457unboximpl, TextHighlightType.Companion.m1458getHandwritingDeletePreviewsxJuwY())) {
            Brush brush = textLayoutResult.getLayoutInput().getStyle().getBrush();
            if (brush != null) {
                DrawScope.m4723drawPathGBMwjPU$default(drawScope, pathForRange, brush, 0.2f, null, null, 0, 56, null);
                return;
            }
            long jM6153getColor0d7_KjU = textLayoutResult.getLayoutInput().getStyle().m6153getColor0d7_KjU();
            if (jM6153getColor0d7_KjU == 16) {
                jM6153getColor0d7_KjU = Color.Companion.m4204getBlack0d7_KjU();
            }
            DrawScope.m4724drawPathLG529CI$default(drawScope, pathForRange, Color.m4177copywmQWz5c$default(jM6153getColor0d7_KjU, Color.m4180getAlphaimpl(jM6153getColor0d7_KjU) * 0.2f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, null, 0, 60, null);
            return;
        }
        DrawScope.m4724drawPathLG529CI$default(drawScope, pathForRange, ((TextSelectionColors) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, TextSelectionColorsKt.getLocalTextSelectionColors())).m1747getBackgroundColor0d7_KjU(), 0.0f, null, null, 0, 60, null);
    }

    private final void drawCursor(DrawScope drawScope) {
        float cursorAlpha = this.cursorAnimation.getCursorAlpha();
        if (cursorAlpha == 0.0f || !getShowCursor()) {
            return;
        }
        Rect cursorRect = this.textFieldSelectionState.getCursorRect();
        DrawScope.m4719drawLine1RTmtNc$default(drawScope, this.cursorBrush, cursorRect.m3971getTopCenterF1C5BW0(), cursorRect.m3964getBottomCenterF1C5BW0(), cursorRect.getWidth(), 0, null, cursorAlpha, null, 0, 432, null);
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$startCursorJob$1, reason: invalid class name */
    /* JADX INFO: compiled from: TextFieldCoreModifier.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0014\u0006\u001a\u0017Q\u000e\u0014\u0017\u001d\u001dW\u0014\u001a!\u0013!\u001e\u0012\u001e`\b\u001a.+}\"\u001f' \u007f-1%\u000e1'-+/,:\u00179/1pAC1CF\u0016IGIFJ#I=\u007f\u000e", f = "!1C>\u000f1,2)\u000724&\r.\"&\"$\u001f+e\"*", i = {}, l = {563}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TextFieldCoreModifierNode.this.new AnonymousClass1(continuation);
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
                final Ref.IntRef intRef = new Ref.IntRef();
                intRef.element = 1;
                final TextFieldCoreModifierNode textFieldCoreModifierNode = TextFieldCoreModifierNode.this;
                this.label = 1;
                if (FlowKt.collectLatest(SnapshotStateKt.snapshotFlow(new Function0<Integer>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode.startCursorJob.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Integer invoke() {
                        textFieldCoreModifierNode.textFieldState.getVisualText();
                        Integer numValueOf = Integer.valueOf(((textFieldCoreModifierNode.isAttached() && ((WindowInfo) CompositionLocalConsumerModifierNodeKt.currentValueOf(textFieldCoreModifierNode, CompositionLocalsKt.getLocalWindowInfo())).isWindowFocused()) ? 1 : 2) * intRef.element);
                        Ref.IntRef intRef2 = intRef;
                        numValueOf.intValue();
                        intRef2.element *= -1;
                        return numValueOf;
                    }
                }), new AnonymousClass2(TextFieldCoreModifierNode.this, null), this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$startCursorJob$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: TextFieldCoreModifier.kt */
        /* JADX INFO: loaded from: classes2.dex */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bӵLc\u0003\nOيH\u000b\\A/&:\u0012\u0010\u0007\u0015k\u007fӏ\u0003"}, d2 = {"\n`]<a@F])\rS", "", "7rF6a+Hey\txn:|\b", ""}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0014\u0006\u001a\u0017Q\u000e\u0014\u0017\u001d\u001dW\u0014\u001a!\u0013!\u001e\u0012\u001e`\b\u001a.+}\"\u001f' \u007f-1%\u000e1'-+/,:\u00179/1pAC1CF\u0016IGIFJ#I=\u007f\u000e\u0002\u0011", f = "!1C>\u000f1,2)\u000724&\r.\"&\"$\u001f+e\"*", i = {}, l = {565}, m = "8>GA>9(KJH>H?", n = {}, s = {})
        static final class AnonymousClass2 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
            /* synthetic */ int I$0;
            int label;
            final /* synthetic */ TextFieldCoreModifierNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(TextFieldCoreModifierNode textFieldCoreModifierNode, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = textFieldCoreModifierNode;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.I$0 = ((Number) obj).intValue();
                return anonymousClass2;
            }

            public final Object invoke(int i2, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(Integer.valueOf(i2), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Integer num, Continuation<? super Unit> continuation) {
                return invoke(num.intValue(), continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (Math.abs(this.I$0) == 1) {
                        this.label = 1;
                        if (this.this$0.cursorAnimation.snapToVisibleAndAnimate(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
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

    private final void startCursorJob() {
        this.changeObserverJob = BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new AnonymousClass1(null), 3, null);
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates layoutCoordinates) {
        this.textLayoutState.setCoreNodeCoordinates(layoutCoordinates);
        this.textFieldMagnifierNode.onGloballyPositioned(layoutCoordinates);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        this.textFieldMagnifierNode.applySemantics(semanticsPropertyReceiver);
    }

    private final void drawText(DrawScope drawScope, TextLayoutResult textLayoutResult) {
        TextPainter.INSTANCE.paint(drawScope.getDrawContext().getCanvas(), textLayoutResult);
    }
}
