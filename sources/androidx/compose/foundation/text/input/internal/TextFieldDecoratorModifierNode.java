package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import androidx.compose.foundation.content.MediaType;
import androidx.compose.foundation.content.ReceiveContentListener;
import androidx.compose.foundation.content.TransferableContent;
import androidx.compose.foundation.content.TransferableContent_androidKt;
import androidx.compose.foundation.content.internal.DragAndDropRequestPermission_androidKt;
import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.handwriting.StylusHandwritingNode;
import androidx.compose.foundation.text.handwriting.StylusHandwriting_androidKt;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextToolbarState;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.draganddrop.DragAndDropModifierNode;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequesterModifierNode;
import androidx.compose.ui.focus.FocusRequesterModifierNodeKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.ClipMetadata;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.PlatformTextInputModifierNode;
import androidx.compose.ui.platform.PlatformTextInputModifierNodeKt;
import androidx.compose.ui.platform.PlatformTextInputSessionScope;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.drew.metadata.iptc.IptcDirectory;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
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
/* JADX INFO: compiled from: TextFieldDecoratorModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯĈ\u0015D57\u001eq\u007fZDkt\u001aA\u000e0!.J~8,\u001aw\u001dfr9FDmHDR[*%k\u00044:[,qY;]\u001a\u0014\"\u0011OdgoñRZ!C\u0017إ\u001ex\u0001,Qǁ\u0001](\u000f:ԏw?IMwމA`\u0003?\r 8\"@y\u001b\u0001\"ݒP\u0010\rzKK\u0012\u00128@\u0007:Z\rS\u0005\"\u0012\u001c>(\u0001,\\oޮ>H\u0003]Bǂ+\u0003\u007fBV'e9\u0005M#F\\'\u0013\u007fi\u001e1E?5+%[\u0003\rSc?\u0019?y=\u001bh/'1L{WLX\b\u0014\u001b-W\rsr.\\\u000b\\h\f=+WcQV\u0016(\u000ez\u0004\rB\u0004\u0016\u0006=H6- f\u0010\u000eItzSFR\n^X\u007f\u0003a<\u001a-\u007fI+AӕnQw;!\u05cb?{\u001b\r&#\u0007q)[j\u000eh\u0015!V\u007fQGQH׀pMF_Ɲ\u0004Վ!b0)40u\u007f_{?/G%e]i#On2Hrk'\u0005\u000fm\u0004i\u0001Np\"\u001d\u001dg*7\u0014\u000bD\u0013\u000e\u001cP\u0003blh] b\u0012\u0016\bA,l{J.=\u0010|]xmx\\u\nS?v=g\u007f\u0004\u0010m8\rEEUq#yR%(O@p\u001apfpg\u001c^j>:2v\u0002 }\n\\f\u000e)1m\u000b,8:K1\\C\\\u0013\"P\\\u0015\t\u000evӳ\u0014~bPl\tw\u0007\r\t/p#p8m\u0007-D|\u000fBsA\u001a;'\u000bm\"\u0017TC7O\u0005\u0002e_gzg\u0013\u0001^{cb8\u0016HY\u0018C\u0006\u0019\u001dfA20M\fL;s_6*')\u001d*\u0013IRFg6U7@)xX;l\u0017P\u0017\u000fv1t|\u007f(O\r\u000f\u0010{bys>w\u00133]J>P|3\u0010d%͓nܲĿ9/I\u0019+\t@,=\ty]\u0018\u0004^}p\u0004>t\u0014yrwޗn̥жa4A/WQGD0\u001d\u0005\u0003ph1\fPn\u0017.%3va\u0015td3e\u000b]y\u0017\u000b:\n\tV\n8Cu\fү-w+\"ʗ|ZrȲ$ݎߠWksޱJj֩IW$\u0019֏0\u0007\u0012JQPZeW!04i^Jن:ؠƀ@\f*ҏ+J\u007fSKbȲ\u0005({.ʓ^U\u0017zR\u0002ĲU&T'|\u0007M\u0013ބDx!X\u0015E\u000f{w\u0007\u00800\u001dmtt_g@\fk\u001d7'\u001bS\rs=+rbi\u001f6g\u0019\u000bsmsO\u0010G\u001cI?l\u001a\u0002<<&\u00105BF/iU\u001ft\u000f0\r\u001f\u0006h\\z\u000f\u0012\u0015i~(7\u0017\u0013~$;8(;\u001d]\r\bb[`~{E^2\u0001E`q\u0013\u001aŽb^\u001b[&].kƣiZ;LkaY\u0016\u00100\"7\u0004#ArV<\u0006`܄'Ɛ\u001aq\u001eȈR\u0015!q8\u0004\\lKҝ\fڷ\f6W\u05ce\u0004\u0010!\u0002qm\u000e nK\u0002ˍ\u0012\u05ffOh\u0001Ž4~q\u0014m\u000b1zg\u0017PҪ/ȃ!\r?O49f\u0002\u000b)a3p\u0011.(kҸ+߱\fn1ցgen\u0019yv{\u000f1XyT2K>c6\u007f5x$\u0016\u0001ě4נ?bU˾|\u000bb\u0018P\u0004.`pUr#\\7\",\u0017Jt\u0010Ad\u001dݴ*Ү37!ے,%U{\u001f\u0004se|Ϻ=ĿC'?ָ#q.(\u001f5Zdz38vY~\u000e\u001dD-th\u0014Ԧ3ڵ(mlܞv]SnZ\bZ%DQ\u0006է:ԯB`2\u001eA\bAhi+\u000f-P\b\u0006\u0006GNAܕ_К.\r\u0005ӕ%A\u007fhyr\u00149x\\=I@)e\"S%c\"#ہ\u000e֮iL\u0007Mq\u0014_}:_MEL\u0011\u0006D\u000eH7$R\u001d4cVӡ=؝.edǾnu]C4j\u0007|Rd_n\u000fr8\\@ѥ\u007f\u008c_a<СK '\u0007V*[0]ŸO˫}\u000bLԹ\u0016,E$\u001e)a+Sӟ[ƣD7Qלe1b\"J:\u0014\u0006@wo`J[N B\u000e=\u0016de\u0001i\u001c\u001a\u000eW\u000fܹ\u000fƒ\bw9ׯ1\u0012nf0'y\u000b|\u000b3ܥOیf\u000fX\u0011*)<i\\#\u00140FHE\u0016T߆lū\u0017?OؓYI\u0018\"\nH=\u0013aq\u0014O8vU\rmq\u0007\f\u0010ߕ\rǮNX=ƶ-\u001fcpcl;\u0017\u0010jYN]Ul9`\u0019\\ډGŜL\u0014\\zJx{\u0002\u0001<^QrC\fTr\u05fe?֘\u0019e\u0007Ʈ3Ois)+egEַaǍ1\u0005\nϷ(C\u001fg\u0019ss;8y\u0002d\u0002V\n\u0013tI\u0004\tDۥ\u001cØeV)ǒ\u001eA5\u001aYFvgEse\u001bO$.4<\u0006A29ԁ\u001fَ\u0012.g̜d8\\\u0006V)y\u0013l!xnK\u0003\u001a\u000f$:k\u0005kggߍ(ް?_Hٺȫp\u000eORpʚF\u0014nѾxʌL"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR,a\u0006\bKLU+;RpG!\u000ei\u0018[\u0013\u0017\u0004]B(nQ )\u0007,\u001f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9l<}%7U\r$@o~8LC\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n `y/8w#6<CNz\u0018' xp!\u0011b0Oz'T5X+\\(", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9{<~!>h\u0002\u001eEU -QD?kA\u0007\u001fga\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Egj C}\u0016<\\CHS>\u001d\u0019ie9\u0014L6Mv|", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Eg]17v%\u0016WB?l8\u001e\"Qk8\u00079", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9oC\u0001\"1`h*Eq%2WL\u0017}0+\u0015Pk8\u000bd0N\u0004\u0010QKN\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9xFz.DY\u000b\u0004@x&=5M:o5\"\u0015uJC\u0006c\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WBv9~?}4\u001bv!>\\+Ej8\u001f\u0019hn\"\u0011b,$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9kF~0?g\u0002/;w\u001f\u0015WA7r\u0012(\u001evqA\u0007p\u0014Xu+HPN9E\\q=i", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\t!\u0016Kp\u0012<\u0004n\u001dc|$8q\u0016;4M9g;\u0006\u001fge:\u000bc97\u0001&G\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9w9\u0005%Bj}-\u001fw\u00152NG;x\u001d(\u0014h7", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/EhY23z\u0016\u0016WB?l8\u001e\"Qk8\u00079", "BdgA90>Z\u0018l\nZ;|", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR9J\u007f5HV[4\\Qa='!;\u0012N2\frh=3n\u001a", "BdgA?(R])\u000ehm(\f\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR,a\u0006\u000eC`X<k@\u00029#\u00120", "BdgA90>Z\u0018lze,z\u00183o\t\u0016\u000b<\u0010\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@Pq,Uv%VPX5&ArP#r^\u000eU*z\u0005`A\"}HA(u;E\u0011;>", "4h[AX9", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r\u001ft?.$Wn5\u0010q-X\u0004/C[R6e(", "3mP/_,=", "", "@dP1B5Eg", "9dh/b(KR\u0003\n\nb6\u0006\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri\u001dm*+W?Hj\u001e)$lkB\u00159", "9dh/b(KRt|\nb6\u0006k+n~/{M", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r!kH\u001b\u001fdn8ba;R\u00010*HW+cR\u007f\u0013", "Ah]4_,%W\"~", "7mc2e(<b\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005SD-\u0011eh9jl;N\u0004#E[R6e@|M!\u0010Zc", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001q\u001f9]R\u0005o=-\u0015uj5\u000e-\u001b[r0UMX9dRq,\u0014%inR+\u0014\u0004GP }D\r\u0006\u00045H\u000fEl\u007f\u001f_\f?r{Ld\u0010\u0011z\u001f\u0006J(dU]i\u0003\u0011PEu9.\u0010h(lI\u0004(\u001d\u0001\u0019(qL5SjS$\u00029u{qW(hG Mm1-AxTI~+\u001e^Eu\u001c:c~9tv\u0005>:?c\u0001Zk\"G(\b\u0015?k\u000b+/AL\"\tOl\u0005lK\u0017d&+\u0016\u000ei5/(iol\u0012}\u0007p&<9af\u007f%R\r>G~\u00191OlQW\t\u0015^m vdVM\u001fS\u0014cnN*j\u001b\u0011\u00030\u0019&>\u001f<U\u001el4h\u0001\\\u0013\u001cw\u0002\u0010\u0005dS$:,\u0019x[\u0002Jdk-Dy\u001bV)/Z@\u0001[\u0019d\u0005|0\n\n\f'whUC4\u001d-0Gg8,a9\u001bpR\u001e(kB%h<1\u0015a\nT^\f$\u001fy\u001bgf lBB\u000bA\u00170f+;pU\t;m\u001c\u000e6U 9nt_Ce\u0004>Ij\u001d\u0004\u000e4B\"\u001c?5?K(r+>0q\f\u001el'+(\u007f4L%Q\u001dw+D#|b/\u0012e\u0017-d\u001eK\u000e3G9a\u0012t);\u0013\bb\u0006{YA\nl9v0%K\u001bO\fY\u0016\u001fR\u0017Y%}\u0002u\u0018\u0017q`\u001e\t{V#\u001f];\"4\u001e)\u0005_Ncu\u0013ab\nVo\u0007", "0`R8\\5@A(\u0013\u0002n:_\u00058d\u00125\u007fO\u0005 \u00196|\u0012>x%B", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011W\u001eKr\"<Yk#3z\u0016-.JE}\n", "", "2qP445=2&\t\u0006G6{\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u007f$\u0013Ik\u0017;u2?dG~Di\u0018\nVB\u001ax>)|r`=\bg,[_1FL$", "2qP485MS&^\f^5\f", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005N>/\u0015uEB\u0016c9Jt6KVWj<[\u0002=!g", "3cXAT)ES", "5dc\u0012W0MO\u0016\u0006z", "u(I", "5dc\u0012a(;Z\u0019}", "Adc\u0012a(;Z\u0019}", "uY\u0018#", "5dc\u0013\\3MS&", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7\u001a7XSJ5\u0018' xp(\u0014_5\\w1TTJ;`\\{\u0013", "Adc\u0013\\3MS&", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001q\u001f9]R\u0005O=)%wPF\u0003l:O\u00014OH]0f[H\u0001\u0005", "7m_Bg\u001a>a'\u0003\u0005g\u0011\u0007\u0006", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E%\u000b\u0014l", "5dc\u0016a;>`\u0015|\nb6\u0006v9u\r&{", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~]\u0007/7z\u0012,\\GEt}\u0006%w]6\u000ec\u0010W\u0006'THL;`\\{+\u001e\"g\fN\u0001", "Adc\u0016a;>`\u0015|\nb6\u0006v9u\r&{", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn9b\r Di\u0014=QMD5\u001c.$d^@\u0007G5]v4CJ]0f[`G$\u001fX\u000e$n}", "7r49X4>\\(_\u0005\\<\u000b\t.", "7r5<V<LS\u0018", "5dc\u0018X@;]\u0015\fy:*\f\r9nb$\u0005?\b\u0017$", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7\u001a7XSJ5\u001a\u001e)ek5\u0014b\bL\u0006+QU1(eQy=!g", "Adc\u0018X@;]\u0015\fy:*\f\r9nb$\u0005?\b\u0017$", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001q\u001f9]R\u0005Q42\u0012r]F\u0006?*]z1P/J5[YrJiUK", "9dh/b(KRt|\nb6\u0006v-o\u000b(", "/mS?b0=fb|\u0005f7\u0007\u0017//\u00012\fI\u007f\u0013&Ky\u0017\u0006\u0006%HhG$@x&=\u0017GDz4+\u001edh\u0003uc?]W+GSM\u000b\\P|J\u0010!d\u001b65\f\tZE${-A\u001e\bjO\u0002Oe\u000b\b#\r\u0011h\u007fF`\u00195w\u001f\u0001Ag4", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR,a\u0006\bKLU+;RpG!\u000ei\u0018[\u0013\u0017\u0004]B(nQ )\u0007,\b\b;|}\u0016\u0012\u001b4FnQZ\u001aPg\u0013\u007fL)'\u0012/", "\nrTA \u0006\u0017", "5dc\u0018X@;]\u0015\fyH7\f\r9n\u000e", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7{.a@EgA\u001d~sp=\u0011l:$", "=ab2e=>1\u001cz\u0004`,\u000bm9b", ">nX;g,K7\"\n\u000bm\u0015\u0007\b/", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001[&<XCDj8'\u0017Sk=\u0010r,[Z0R\\]\u0014fQv>\u0018\u0012gvX*\rZ", "5dc\u001fX(==\"\u0006\u000f", "Adc\u001fX(==\"\u0006\u000f", "@dR2\\=>1#\b\n^5\ff9n\u0001,}P\u000e\u0013&Ky\u0017'\u0004/F]| D", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@#?b\r @|_2VR;x=\u001a\u001c2N9\u0005c0_v\u0005QU],eaPG\u001d\u0013^\u0010^8\t\u0014]K-D", "Ag^B_+&S&\u0001z=,\u000b\u0007/n~$\u0005On\u0017\u001fCx\u001d@t3", "5dc [6NZ\u0018fzk.|g/s}(\u0005?| &5o\u00168\u007f49W\f", "5dc \\5@Z\u0019e~g,", "Adc \\5@Z\u0019e~g,", "Ash9h:!O\"}\rk0\f\r8gh2z@", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri:i\u001f-_P?z8'\u00172OH\u001bj<\\Y#PK`9`avF\u0016zd\rN\u0001", "Ash9h:!O\"}\rk0\f\r8gn5\u007fB\u0003\u0017$", "5dc g@Ec'avg+\u000f\u00163t\u00041}/\u000e\u001b\u0019Io\u001b", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJ\u0018\u001eQ\u0002W$\u000741V\u0005 %p\u0012;MB\u001cr>0j", "BdgA90>Z\u0018dzr\f\u000e\t8tb$\u0005?\b\u0017$", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR,a\u0006\bKLU+BR\u0007\u001d%\u0012c\u001d1'\u0016\u0004`A1D", "5dc!X?M4\u001d~\u0002]\u001a|\u0010/c\u000f,\u0006In&\u0013Vo", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7\u001a7XSJ58'$hnB\u0003ju\\v.GJ]0f[<,\u0014%inR+\u0014\u0004GA+nBF#\u001257\u00117w\u0001a", "Adc!X?M4\u001d~\u0002]\u001a|\u0010/c\u000f,\u0006In&\u0013Vo", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001q\u001f9]R\u0005o=-\u0015uj5\u000e-:N}'E[R6e\u001ca='!;\u0012N2\frYH$lS;)\u0011\u001aX}JhVO\u0007", "5dc!X?M4\u001d~\u0002]\u001a\f\u0005>e", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7\u001a7XSJ58'$hnB\u0003ju=\u0004#PZO6iZr<\u0003\u0012m\u001d//\r\fX/3jS7t", "Adc!X?M4\u001d~\u0002]\u001a\f\u0005>e", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001q\u001f9]R\u0005o=-\u0015uj5\u000e-\u001b[r0UMX9dRq,\u0014%inR+\u0014\u0004GP }D\rbx", "5dc!X?M:\u0015\u0013\u0005n;j\u0018+t\u007f", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7\u001a7XSJ58'$hnB\u0003ju=v:V3J@fb\u0002+#\u000ei\u000e$", "Adc!X?M:\u0015\u0013\u0005n;j\u0018+t\u007f", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001q\u001f9]R\u0005o=-\u0015uj5\u000e-\u001bN\n6.Hb6la`L\u0010!Zc\u0012\u001c", "Eh]1b>\"\\\u001a\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n']\u0007\u001fA\u007fy7NM\u0011", "2hb=b:>7\"\n\u000bm\u001a|\u0017=i\n1", "3lXA79:Ux\u0012~m\f\u000e\t8t", "=m0Ag(<V", "=m2.a*>Z\u0004\t~g;|\u0016\u0013n\u000b8\u000b", "=m32g(<V", "=m5<V<L1\u001cz\u0004`,", "=m5<V<L3*~\u0004m", "4nRBf\u001aMO(~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Egk/3|\u0016\u0004", "=m69b):Z \u0013eh:\u0001\u00183o\t(z", "1n^?W0GO(~\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/\u0015w ;LGDgC\u001e#>", "=m8:X\b<b\u001d\t\u0004I,\n\n9r\b(z", "7lT\u000eV;B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#a(7I\u0014=QMDA", "=m8:X\b<b\u001d\t\u0004I,\n\n9r\b(z\bf\u001e\u0003PTk\u000f", "uH\u0018#", "=m:2l\fOS\"\u000e", "3uT;g", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WBv9~?}4\u0017~\u00167\\\u0019", "=m:2l\fOS\"\u000eBS4\u0007\u000f\u001bx\n", "uKP;W9HW\u0018H\fb,\u000fR\u0015e\u0014\b\r@\n&l\u000bd", "=m>/f,Kd\u0019}g^({\u0017\rh{1}@\u007f", "=m?<\\5MS&^\f^5\f", ">nX;g,K3*~\u0004m", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0014/\u0015qp\u000f", ">`b@", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0014/\u0015qp$\u0003q:$", "0nd;W:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "=m?<\\5MS&^\f^5\fP\u00120\u000b\u0015\fJt", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001b R\u007f\u001d\u0006\u0002/9b\r D7\u00018QLJkA}&hjH\\J(Wu4QPM?&P|E\u001f\u001ch\u000e\u0018;\u0011N]J/~S\u0001*\u00120R\u0011;uJv \u0012>ypO6!G\u0003$`=7v\u001c>#j", "=m??X\u0012>gx\u0010zg;", "=m??X\u0012>gx\u0010zg;D}7o\u0006\u0014\u000fJ", "@d`B\\9>9\u0019\u0013wh(\n\b\ro\t7\tJ\b\u001e\u0017T", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n#c~/Ii#.3COh>\u001a\"g?C\u0010r9X}.GY$", "AsP?g\u0010G^)\u000eh^:\u000b\r9n", "4q^:G(I", "CoS.g,']\u0018~", "/o_9l\u001a>[\u0015\b\nb*\u000b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G}(3v%2KQ&x>)\u0015upMsc*Nz8GY$", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TextFieldDecoratorModifierNode extends DelegatingNode implements PlatformTextInputModifierNode, SemanticsModifierNode, FocusRequesterModifierNode, FocusEventModifierNode, GlobalPositionAwareModifierNode, PointerInputModifierNode, KeyInputModifierNode, CompositionLocalConsumerModifierNode, ModifierLocalModifierNode, ObserverModifierNode, LayoutAwareModifierNode {
    public static final int $stable = 8;
    private MutableSharedFlow<Unit> backingStylusHandwritingTrigger;
    private HoverInteraction.Enter dragEnterEvent;
    private boolean enabled;
    private InputTransformation filter;
    private Job inputSessionJob;
    private MutableInteractionSource interactionSource;
    private boolean isElementFocused;
    private KeyboardActionHandler keyboardActionHandler;
    private final TextFieldDecoratorModifierNode$keyboardActionScope$1 keyboardActionScope;
    private KeyboardOptions keyboardOptions;
    private Job observeChangesJob;
    private boolean readOnly;
    private final Function0<ReceiveContentConfiguration> receiveContentConfigurationProvider;
    private boolean singleLine;
    private final StylusHandwritingNode stylusHandwritingNode;
    private final TextFieldKeyEventHandler textFieldKeyEventHandler;
    private TextFieldSelectionState textFieldSelectionState;
    private TransformedTextFieldState textFieldState;
    private TextLayoutState textLayoutState;
    private WindowInfo windowInfo;
    private final SuspendingPointerInputModifierNode pointerInputNode = (SuspendingPointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new TextFieldDecoratorModifierNode$pointerInputNode$1(this, null)));
    private final DragAndDropModifierNode dragAndDropNode = (DragAndDropModifierNode) delegate(TextFieldDragAndDropNode_androidKt.textFieldDragAndDropNode$default(new Function0<Set<? extends MediaType>>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Set<? extends MediaType> invoke() {
            return ReceiveContentConfigurationKt.getReceiveContentConfiguration(this.this$0) != null ? TextFieldDecoratorModifierKt.MediaTypesAll : TextFieldDecoratorModifierKt.MediaTypesText;
        }
    }, new Function2<ClipEntry, ClipMetadata, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$2
        {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Boolean invoke(ClipEntry clipEntry, ClipMetadata clipMetadata) {
            ClipEntry clipEntry2;
            this.this$0.emitDragExitEvent();
            this.this$0.getTextFieldSelectionState().clearHandleDragging();
            String plainText = TransferableContent_androidKt.readPlainText(clipEntry);
            ReceiveContentConfiguration receiveContentConfiguration = ReceiveContentConfigurationKt.getReceiveContentConfiguration(this.this$0);
            if (receiveContentConfiguration != null) {
                TransferableContent transferableContentOnReceive = receiveContentConfiguration.getReceiveContentListener().onReceive(new TransferableContent(clipEntry, clipMetadata, TransferableContent.Source.Companion.m674getDragAndDropkB6V9T0(), null, 8, null));
                plainText = (transferableContentOnReceive == null || (clipEntry2 = transferableContentOnReceive.getClipEntry()) == null) ? null : TransferableContent_androidKt.readPlainText(clipEntry2);
            }
            if (plainText != null) {
                TransformedTextFieldState.replaceSelectedText$default(this.this$0.getTextFieldState(), plainText, false, null, 6, null);
            }
            return true;
        }
    }, new Function1<DragAndDropEvent, Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$3
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DragAndDropEvent dragAndDropEvent) {
            invoke2(dragAndDropEvent);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DragAndDropEvent dragAndDropEvent) {
            if (ReceiveContentConfigurationKt.getReceiveContentConfiguration(this.this$0) != null) {
                DragAndDropRequestPermission_androidKt.dragAndDropRequestPermission(this.this$0, dragAndDropEvent);
            }
        }
    }, null, new Function1<DragAndDropEvent, Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$4
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DragAndDropEvent dragAndDropEvent) {
            invoke2(dragAndDropEvent);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DragAndDropEvent dragAndDropEvent) {
            ReceiveContentListener receiveContentListener;
            TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.this$0;
            HoverInteraction.Enter enter = new HoverInteraction.Enter();
            this.this$0.getInteractionSource().tryEmit(enter);
            textFieldDecoratorModifierNode.dragEnterEvent = enter;
            ReceiveContentConfiguration receiveContentConfiguration = ReceiveContentConfigurationKt.getReceiveContentConfiguration(this.this$0);
            if (receiveContentConfiguration == null || (receiveContentListener = receiveContentConfiguration.getReceiveContentListener()) == null) {
                return;
            }
            receiveContentListener.onDragEnter();
        }
    }, new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$5
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
            m1540invokek4lQ0M(offset.m3947unboximpl());
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final void m1540invokek4lQ0M(long j2) {
            long jM1561fromWindowToDecorationUv8p0NA = TextLayoutStateKt.m1561fromWindowToDecorationUv8p0NA(this.this$0.getTextLayoutState(), j2);
            this.this$0.getTextFieldState().m1571selectCharsIn5zctL8(TextRangeKt.TextRange(TextLayoutState.m1551getOffsetForPosition3MmeM6k$default(this.this$0.getTextLayoutState(), jM1561fromWindowToDecorationUv8p0NA, false, 2, null)));
            this.this$0.getTextFieldSelectionState().m1608updateHandleDraggingUv8p0NA(Handle.Cursor, jM1561fromWindowToDecorationUv8p0NA);
        }
    }, null, new Function1<DragAndDropEvent, Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$6
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DragAndDropEvent dragAndDropEvent) {
            invoke2(dragAndDropEvent);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DragAndDropEvent dragAndDropEvent) {
            ReceiveContentListener receiveContentListener;
            this.this$0.emitDragExitEvent();
            this.this$0.getTextFieldSelectionState().clearHandleDragging();
            ReceiveContentConfiguration receiveContentConfiguration = ReceiveContentConfigurationKt.getReceiveContentConfiguration(this.this$0);
            if (receiveContentConfiguration == null || (receiveContentListener = receiveContentConfiguration.getReceiveContentListener()) == null) {
                return;
            }
            receiveContentListener.onDragExit();
        }
    }, new Function1<DragAndDropEvent, Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$7
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DragAndDropEvent dragAndDropEvent) {
            invoke2(dragAndDropEvent);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DragAndDropEvent dragAndDropEvent) {
            this.this$0.emitDragExitEvent();
        }
    }, 72, null));

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public boolean getShouldMergeDescendantSemantics() {
        return true;
    }

    public final TransformedTextFieldState getTextFieldState() {
        return this.textFieldState;
    }

    public final void setTextFieldState(TransformedTextFieldState transformedTextFieldState) {
        this.textFieldState = transformedTextFieldState;
    }

    public final TextLayoutState getTextLayoutState() {
        return this.textLayoutState;
    }

    public final void setTextLayoutState(TextLayoutState textLayoutState) {
        this.textLayoutState = textLayoutState;
    }

    public final TextFieldSelectionState getTextFieldSelectionState() {
        return this.textFieldSelectionState;
    }

    public final void setTextFieldSelectionState(TextFieldSelectionState textFieldSelectionState) {
        this.textFieldSelectionState = textFieldSelectionState;
    }

    public final InputTransformation getFilter() {
        return this.filter;
    }

    public final void setFilter(InputTransformation inputTransformation) {
        this.filter = inputTransformation;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final void setEnabled(boolean z2) {
        this.enabled = z2;
    }

    public final boolean getReadOnly() {
        return this.readOnly;
    }

    public final void setReadOnly(boolean z2) {
        this.readOnly = z2;
    }

    public final KeyboardActionHandler getKeyboardActionHandler() {
        return this.keyboardActionHandler;
    }

    public final void setKeyboardActionHandler(KeyboardActionHandler keyboardActionHandler) {
        this.keyboardActionHandler = keyboardActionHandler;
    }

    public final boolean getSingleLine() {
        return this.singleLine;
    }

    public final void setSingleLine(boolean z2) {
        this.singleLine = z2;
    }

    public final MutableInteractionSource getInteractionSource() {
        return this.interactionSource;
    }

    public final void setInteractionSource(MutableInteractionSource mutableInteractionSource) {
        this.interactionSource = mutableInteractionSource;
    }

    public TextFieldDecoratorModifierNode(TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, TextFieldSelectionState textFieldSelectionState, InputTransformation inputTransformation, boolean z2, boolean z3, final KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, boolean z4, MutableInteractionSource mutableInteractionSource) {
        this.textFieldState = transformedTextFieldState;
        this.textLayoutState = textLayoutState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.filter = inputTransformation;
        this.enabled = z2;
        this.readOnly = z3;
        this.keyboardActionHandler = keyboardActionHandler;
        this.singleLine = z4;
        this.interactionSource = mutableInteractionSource;
        this.stylusHandwritingNode = (StylusHandwritingNode) delegate(new StylusHandwritingNode(new Function0<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$stylusHandwritingNode$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                MutableSharedFlow stylusHandwritingTrigger;
                if (!this.this$0.isFocused()) {
                    FocusRequesterModifierNodeKt.requestFocus(this.this$0);
                }
                if (!KeyboardType.m6341equalsimpl0(keyboardOptions.m1350getKeyboardTypePjHm6EE(), KeyboardType.Companion.m6360getPasswordPjHm6EE()) && !KeyboardType.m6341equalsimpl0(keyboardOptions.m1350getKeyboardTypePjHm6EE(), KeyboardType.Companion.m6359getNumberPasswordPjHm6EE()) && (stylusHandwritingTrigger = this.this$0.getStylusHandwritingTrigger()) != null) {
                    stylusHandwritingTrigger.tryEmit(Unit.INSTANCE);
                }
                return true;
            }
        }));
        InputTransformation inputTransformation2 = this.filter;
        this.keyboardOptions = keyboardOptions.fillUnspecifiedValuesWith$foundation_release(inputTransformation2 != null ? inputTransformation2.getKeyboardOptions() : null);
        this.textFieldKeyEventHandler = TextFieldKeyEventHandler_androidKt.createTextFieldKeyEventHandler();
        this.keyboardActionScope = new TextFieldDecoratorModifierNode$keyboardActionScope$1(this);
        this.receiveContentConfigurationProvider = new Function0<ReceiveContentConfiguration>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$receiveContentConfigurationProvider$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ReceiveContentConfiguration invoke() {
                return ReceiveContentConfigurationKt.getReceiveContentConfiguration(this.this$0);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getEditable() {
        return this.enabled && !this.readOnly;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MutableSharedFlow<Unit> getStylusHandwritingTrigger() {
        MutableSharedFlow<Unit> mutableSharedFlow = this.backingStylusHandwritingTrigger;
        if (mutableSharedFlow != null) {
            return mutableSharedFlow;
        }
        if (!StylusHandwriting_androidKt.isStylusHandwritingSupported()) {
            return null;
        }
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_LATEST, 2, null);
        this.backingStylusHandwritingTrigger = mutableSharedFlowMutableSharedFlow$default;
        return mutableSharedFlowMutableSharedFlow$default;
    }

    public final KeyboardOptions getKeyboardOptions() {
        return this.keyboardOptions;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isFocused() {
        WindowInfo windowInfo = this.windowInfo;
        return this.isElementFocused && (windowInfo != null && windowInfo.isWindowFocused());
    }

    public final void updateNode(TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, TextFieldSelectionState textFieldSelectionState, InputTransformation inputTransformation, boolean z2, boolean z3, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, boolean z4, MutableInteractionSource mutableInteractionSource) {
        boolean z5 = this.enabled;
        boolean z6 = z5 && !this.readOnly;
        boolean z7 = z2 && !z3;
        TransformedTextFieldState transformedTextFieldState2 = this.textFieldState;
        KeyboardOptions keyboardOptions2 = this.keyboardOptions;
        TextFieldSelectionState textFieldSelectionState2 = this.textFieldSelectionState;
        MutableInteractionSource mutableInteractionSource2 = this.interactionSource;
        this.textFieldState = transformedTextFieldState;
        this.textLayoutState = textLayoutState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.filter = inputTransformation;
        this.enabled = z2;
        this.readOnly = z3;
        this.keyboardOptions = keyboardOptions.fillUnspecifiedValuesWith$foundation_release(inputTransformation != null ? inputTransformation.getKeyboardOptions() : null);
        this.keyboardActionHandler = keyboardActionHandler;
        this.singleLine = z4;
        this.interactionSource = mutableInteractionSource;
        if (z7 != z6 || !Intrinsics.areEqual(transformedTextFieldState, transformedTextFieldState2) || !Intrinsics.areEqual(this.keyboardOptions, keyboardOptions2)) {
            if (!z7 || !isFocused()) {
                if (!z7) {
                    disposeInputSession();
                }
            } else {
                startInputSession(false);
            }
        }
        if (z5 != z2) {
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        if (!Intrinsics.areEqual(textFieldSelectionState, textFieldSelectionState2)) {
            this.pointerInputNode.resetPointerInputHandler();
            this.stylusHandwritingNode.resetPointerInputHandler();
            if (isAttached()) {
                textFieldSelectionState.setReceiveContentConfiguration(this.receiveContentConfigurationProvider);
            }
        }
        if (Intrinsics.areEqual(mutableInteractionSource, mutableInteractionSource2)) {
            return;
        }
        this.pointerInputNode.resetPointerInputHandler();
        this.stylusHandwritingNode.resetPointerInputHandler();
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        TextFieldCharSequence outputText = this.textFieldState.getOutputText();
        long jM1446getSelectiond9O1mEE = outputText.m1446getSelectiond9O1mEE();
        SemanticsPropertiesKt.setEditableText(semanticsPropertyReceiver, new AnnotatedString(outputText.toString(), null, null, 6, null));
        SemanticsPropertiesKt.m5953setTextSelectionRangeFDrldGo(semanticsPropertyReceiver, jM1446getSelectiond9O1mEE);
        if (!this.enabled) {
            SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
        }
        SemanticsPropertiesKt.setEditable(semanticsPropertyReceiver, getEditable());
        SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, new Function1<List<TextLayoutResult>, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(List<TextLayoutResult> list) {
                TextLayoutResult layoutResult = TextFieldDecoratorModifierNode.this.getTextLayoutState().getLayoutResult();
                return Boolean.valueOf(layoutResult != null ? list.add(layoutResult) : false);
            }
        }, 1, null);
        if (getEditable()) {
            SemanticsPropertiesKt.setText$default(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(AnnotatedString annotatedString) {
                    if (!TextFieldDecoratorModifierNode.this.getEditable()) {
                        return false;
                    }
                    TextFieldDecoratorModifierNode.this.getTextFieldState().replaceAll(annotatedString);
                    return true;
                }
            }, 1, null);
            SemanticsPropertiesKt.insertTextAtCursor$default(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.3
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(AnnotatedString annotatedString) {
                    if (!TextFieldDecoratorModifierNode.this.getEditable()) {
                        return false;
                    }
                    TransformedTextFieldState.replaceSelectedText$default(TextFieldDecoratorModifierNode.this.getTextFieldState(), annotatedString, true, null, 4, null);
                    return true;
                }
            }, 1, null);
        }
        SemanticsPropertiesKt.setSelection$default(semanticsPropertyReceiver, null, new Function3<Integer, Integer, Boolean, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.4
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Boolean invoke(Integer num, Integer num2, Boolean bool) {
                return invoke(num.intValue(), num2.intValue(), bool.booleanValue());
            }

            public final Boolean invoke(int i2, int i3, boolean z2) {
                TextFieldCharSequence visualText;
                if (z2) {
                    visualText = TextFieldDecoratorModifierNode.this.getTextFieldState().getUntransformedText();
                } else {
                    visualText = TextFieldDecoratorModifierNode.this.getTextFieldState().getVisualText();
                }
                long jM1446getSelectiond9O1mEE2 = visualText.m1446getSelectiond9O1mEE();
                if (!TextFieldDecoratorModifierNode.this.getEnabled() || Math.min(i2, i3) < 0 || Math.max(i2, i3) > visualText.length()) {
                    return false;
                }
                if (i2 == TextRange.m6123getStartimpl(jM1446getSelectiond9O1mEE2) && i3 == TextRange.m6118getEndimpl(jM1446getSelectiond9O1mEE2)) {
                    return true;
                }
                long jTextRange = TextRangeKt.TextRange(i2, i3);
                if (z2 || i2 == i3) {
                    TextFieldDecoratorModifierNode.this.getTextFieldSelectionState().updateTextToolbarState(TextToolbarState.None);
                } else {
                    TextFieldDecoratorModifierNode.this.getTextFieldSelectionState().updateTextToolbarState(TextToolbarState.Selection);
                }
                if (z2) {
                    TextFieldDecoratorModifierNode.this.getTextFieldState().m1572selectUntransformedCharsIn5zctL8(jTextRange);
                } else {
                    TextFieldDecoratorModifierNode.this.getTextFieldState().m1571selectCharsIn5zctL8(jTextRange);
                }
                return true;
            }
        }, 1, null);
        final int iM1349getImeActionOrDefaulteUduSuo$foundation_release = this.keyboardOptions.m1349getImeActionOrDefaulteUduSuo$foundation_release();
        SemanticsPropertiesKt.m5948onImeAction9UiTYpY$default(semanticsPropertyReceiver, iM1349getImeActionOrDefaulteUduSuo$foundation_release, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                TextFieldDecoratorModifierNode.this.m1539onImeActionPerformedKlQnJC8(iM1349getImeActionOrDefaulteUduSuo$foundation_release);
                return true;
            }
        }, 2, null);
        SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.6
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                if (!TextFieldDecoratorModifierNode.this.isFocused()) {
                    FocusRequesterModifierNodeKt.requestFocus(TextFieldDecoratorModifierNode.this);
                } else if (!TextFieldDecoratorModifierNode.this.getReadOnly()) {
                    TextFieldDecoratorModifierNode.this.requireKeyboardController().show();
                }
                return true;
            }
        }, 1, null);
        SemanticsPropertiesKt.onLongClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.7
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                if (!TextFieldDecoratorModifierNode.this.isFocused()) {
                    FocusRequesterModifierNodeKt.requestFocus(TextFieldDecoratorModifierNode.this);
                }
                TextFieldDecoratorModifierNode.this.getTextFieldSelectionState().updateTextToolbarState(TextToolbarState.Selection);
                return true;
            }
        }, 1, null);
        if (!TextRange.m6117getCollapsedimpl(jM1446getSelectiond9O1mEE)) {
            SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.8
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    TextFieldSelectionState.copy$default(TextFieldDecoratorModifierNode.this.getTextFieldSelectionState(), false, 1, null);
                    return true;
                }
            }, 1, null);
            if (this.enabled && !this.readOnly) {
                SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.9
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Boolean invoke() {
                        TextFieldDecoratorModifierNode.this.getTextFieldSelectionState().cut();
                        return true;
                    }
                }, 1, null);
            }
        }
        if (getEditable()) {
            SemanticsPropertiesKt.pasteText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.10
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    TextFieldDecoratorModifierNode.this.getTextFieldSelectionState().paste();
                    return true;
                }
            }, 1, null);
        }
        InputTransformation inputTransformation = this.filter;
        if (inputTransformation != null) {
            inputTransformation.applySemantics(semanticsPropertyReceiver);
        }
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public void onFocusEvent(FocusState focusState) {
        if (this.isElementFocused == focusState.isFocused()) {
            return;
        }
        this.isElementFocused = focusState.isFocused();
        onFocusChange();
        if (focusState.isFocused()) {
            if (getEditable()) {
                startInputSession(false);
            }
        } else {
            disposeInputSession();
            TransformedTextFieldState transformedTextFieldState = this.textFieldState;
            TextFieldState textFieldState = transformedTextFieldState.textFieldState;
            InputTransformation inputTransformation = transformedTextFieldState.inputTransformation;
            TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
            textFieldState.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
            EditCommandKt.finishComposingText(textFieldState.getMainBuffer$foundation_release());
            textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
            this.textFieldState.collapseSelectionToMax();
        }
        this.stylusHandwritingNode.onFocusEvent(focusState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFocusChange() {
        this.textFieldSelectionState.setFocused(isFocused());
        if (isFocused() && this.observeChangesJob == null) {
            this.observeChangesJob = BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new C05511(null), 3, null);
        } else if (!isFocused()) {
            Job job = this.observeChangesJob;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            this.observeChangesJob = null;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$onFocusChange$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TextFieldDecoratorModifier.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0014\u0006\u001a\u0017Q\u000e\u0014\u0017\u001d\u001dW\u0014\u001a!\u0013!\u001e\u0012\u001e`\b\u001a.+}\"\u001f' \u0001#\"/3#737\u00136,2041?\u001c>46uBB\u001bE:ML\u001dC=KED\u0004\u0012", f = "!1C>\u000f1,2)\b(%02 2,.\b)\u001d!\u001d\u001f\u001a&`\u001d%", i = {}, l = {IptcDirectory.TAG_CAPTION_WRITER}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class C05511 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C05511(Continuation<? super C05511> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TextFieldDecoratorModifierNode.this.new C05511(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C05511) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (TextFieldDecoratorModifierNode.this.getTextFieldSelectionState().observeChanges(this) == coroutine_suspended) {
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

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        onObservedReadsChanged();
        this.textFieldSelectionState.setReceiveContentConfiguration(this.receiveContentConfigurationProvider);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        disposeInputSession();
        this.textFieldSelectionState.setReceiveContentConfiguration(null);
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates layoutCoordinates) {
        this.textLayoutState.setDecoratorNodeCoordinates(layoutCoordinates);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* JADX INFO: renamed from: onPointerEvent-H0pRuoY */
    public void mo546onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j2) {
        this.stylusHandwritingNode.mo546onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j2);
        this.pointerInputNode.mo546onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j2);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        this.stylusHandwritingNode.onCancelPointerInput();
        this.pointerInputNode.onCancelPointerInput();
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* JADX INFO: renamed from: onPreKeyEvent-ZmokQxo */
    public boolean mo547onPreKeyEventZmokQxo(KeyEvent keyEvent) {
        return this.textFieldKeyEventHandler.mo1472onPreKeyEventMyFupTE(keyEvent, this.textFieldState, this.textFieldSelectionState, (FocusManager) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalFocusManager()), requireKeyboardController());
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* JADX INFO: renamed from: onKeyEvent-ZmokQxo */
    public boolean mo545onKeyEventZmokQxo(KeyEvent keyEvent) {
        return this.textFieldKeyEventHandler.mo1471onKeyEvent6ptp14s(keyEvent, this.textFieldState, this.textLayoutState, this.textFieldSelectionState, this.enabled && !this.readOnly, this.singleLine, new Function0<Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$onKeyEvent$1
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
                TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.this$0;
                textFieldDecoratorModifierNode.m1539onImeActionPerformedKlQnJC8(textFieldDecoratorModifierNode.getKeyboardOptions().m1349getImeActionOrDefaulteUduSuo$foundation_release());
            }
        });
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        ObserverModifierNodeKt.observeReads(this, new Function0<Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.onObservedReadsChanged.1
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
                TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = TextFieldDecoratorModifierNode.this;
                textFieldDecoratorModifierNode.windowInfo = (WindowInfo) CompositionLocalConsumerModifierNodeKt.currentValueOf(textFieldDecoratorModifierNode, CompositionLocalsKt.getLocalWindowInfo());
                TextFieldDecoratorModifierNode.this.onFocusChange();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startInputSession(boolean z2) {
        if (z2 || this.keyboardOptions.getShowKeyboardOnFocusOrDefault$foundation_release()) {
            this.inputSessionJob = BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new C05531(ReceiveContentConfigurationKt.getReceiveContentConfiguration(this), null), 3, null);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TextFieldDecoratorModifier.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0014\u0006\u001a\u0017Q\u000e\u0014\u0017\u001d\u001dW\u0014\u001a!\u0013!\u001e\u0012\u001e`\b\u001a.+}\"\u001f' \u0001#\"/3#737\u00136,2041?\u001c>46uFH6HK!GJPP0CRSJQQ\b\u0016", f = "!1C>\u000f1,2)\b(%02 2,.\b)\u001d!\u001d\u001f\u001a&`\u001d%", i = {}, l = {TypedValues.TransitionType.TYPE_TRANSITION_FLAGS}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class C05531 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ReceiveContentConfiguration $receiveContentConfiguration;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05531(ReceiveContentConfiguration receiveContentConfiguration, Continuation<? super C05531> continuation) {
            super(2, continuation);
            this.$receiveContentConfiguration = receiveContentConfiguration;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TextFieldDecoratorModifierNode.this.new C05531(this.$receiveContentConfiguration, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C05531) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (PlatformTextInputModifierNodeKt.establishTextInputSession(TextFieldDecoratorModifierNode.this, new C00551(TextFieldDecoratorModifierNode.this, this.$receiveContentConfiguration, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: TextFieldDecoratorModifier.kt */
        /* JADX INFO: loaded from: classes.dex */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,h\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n `y/8w#6<CNz\u0018' xp'\u0007q:R\u000105JX7\\("}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0014\u0006\u001a\u0017Q\u000e\u0014\u0017\u001d\u001dW\u0014\u001a!\u0013!\u001e\u0012\u001e`\b\u001a.+}\"\u001f' \u0001#\"/3#737\u00136,2041?\u001c>46uFH6HK!GJPP0CRSJQQ\b\u0016\n\u0018", f = "!1C>\u000f1,2)\b(%02 2,.\b)\u001d!\u001d\u001f\u001a&`\u001d%", i = {}, l = {708}, m = "8>GA>9(KJH>H?", n = {}, s = {})
        static final class C00551 extends SuspendLambda implements Function2<PlatformTextInputSessionScope, Continuation<?>, Object> {
            final /* synthetic */ ReceiveContentConfiguration $receiveContentConfiguration;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ TextFieldDecoratorModifierNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00551(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, ReceiveContentConfiguration receiveContentConfiguration, Continuation<? super C00551> continuation) {
                super(2, continuation);
                this.this$0 = textFieldDecoratorModifierNode;
                this.$receiveContentConfiguration = receiveContentConfiguration;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C00551 c00551 = new C00551(this.this$0, this.$receiveContentConfiguration, continuation);
                c00551.L$0 = obj;
                return c00551;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(PlatformTextInputSessionScope platformTextInputSessionScope, Continuation<?> continuation) {
                return ((C00551) create(platformTextInputSessionScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (AndroidTextInputSession_androidKt.platformSpecificTextInputSession((PlatformTextInputSessionScope) this.L$0, this.this$0.getTextFieldState(), this.this$0.getTextLayoutState(), this.this$0.getKeyboardOptions().toImeOptions$foundation_release(this.this$0.getSingleLine()), this.$receiveContentConfiguration, new C00561(this.this$0), this.this$0.getStylusHandwritingTrigger(), (ViewConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(this.this$0, CompositionLocalsKt.getLocalViewConfiguration()), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            }

            /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: TextFieldDecoratorModifier.kt */
            @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
            /* synthetic */ class C00561 extends FunctionReferenceImpl implements Function1<ImeAction, Unit> {
                C00561(Object obj) {
                    super(1, obj, TextFieldDecoratorModifierNode.class, "onImeActionPerformed", "onImeActionPerformed-KlQnJC8(I)V", 0);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ImeAction imeAction) {
                    m1541invokeKlQnJC8(imeAction.m6291unboximpl());
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke-KlQnJC8, reason: not valid java name */
                public final void m1541invokeKlQnJC8(int i2) {
                    ((TextFieldDecoratorModifierNode) this.receiver).m1539onImeActionPerformedKlQnJC8(i2);
                }
            }
        }
    }

    private final void disposeInputSession() {
        Job job = this.inputSessionJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.inputSessionJob = null;
        MutableSharedFlow<Unit> stylusHandwritingTrigger = getStylusHandwritingTrigger();
        if (stylusHandwritingTrigger != null) {
            stylusHandwritingTrigger.resetReplayCache();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SoftwareKeyboardController requireKeyboardController() {
        SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalSoftwareKeyboardController());
        if (softwareKeyboardController != null) {
            return softwareKeyboardController;
        }
        throw new IllegalStateException("No software keyboard controller".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitDragExitEvent() {
        HoverInteraction.Enter enter = this.dragEnterEvent;
        if (enter != null) {
            this.interactionSource.tryEmit(new HoverInteraction.Exit(enter));
            this.dragEnterEvent = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onImeActionPerformed-KlQnJC8, reason: not valid java name */
    public final void m1539onImeActionPerformedKlQnJC8(final int i2) {
        KeyboardActionHandler keyboardActionHandler;
        if (!ImeAction.m6288equalsimpl0(i2, ImeAction.Companion.m6305getNoneeUduSuo()) && !ImeAction.m6288equalsimpl0(i2, ImeAction.Companion.m6301getDefaulteUduSuo()) && (keyboardActionHandler = this.keyboardActionHandler) != null) {
            if (keyboardActionHandler != null) {
                keyboardActionHandler.onKeyboardAction(new Function0<Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$onImeActionPerformed$1
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
                        this.this$0.keyboardActionScope.mo1335defaultKeyboardActionKlQnJC8(i2);
                    }
                });
                return;
            }
            return;
        }
        this.keyboardActionScope.mo1335defaultKeyboardActionKlQnJC8(i2);
    }
}
