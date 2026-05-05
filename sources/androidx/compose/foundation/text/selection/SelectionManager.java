package androidx.compose.foundation.text.selection;

import androidx.collection.LongIntMapKt;
import androidx.collection.LongObjectMap;
import androidx.collection.LongObjectMapKt;
import androidx.collection.MutableLongIntMap;
import androidx.collection.MutableLongObjectMap;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.input.internal.TextLayoutStateKt;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.unit.IntSize;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
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
/* JADX INFO: compiled from: SelectionManager.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яŉ\u0014D57\u001eq\u007fR܀kŞ\fA\u001c0\u0013.H~*,(w\u000ffxB8ǏmHDR[ճ\u0017k\u00124,[*tK;k\u001a\u0006\"\u000fSVg}nRZ\u0011R\u0017\u0006,xr,O^\u0001](\u000f:BuB;M\u0006=A`zA\r H\"@y\u000b\u0002\"*^\u0010~zQK\u0014\u00126Ex:h\rU\u0005 %\u000e>6\u0001&\\m[>H\u0003]Bǂ+\u0003\u007fBV'e0\u0005M#F\\܋\u0015vw\u001e3@=:\u001d%i\u0003\u000fRaI\u000b?\b=\rh='3ɞ{WD_\b\u0014\u001b2W\rsr.\\\u000b[h\f=+WcQR\u0016(\u000ez\u0004ȞBǉ$ͺWH\\,Zq\u0018\u0012At\u000bSnQؿbB\u000e|*L%\u0016\u00183Y\u0007Kj_SS\u0019|M\u009e\u0004ټ̷'\u0003t\u0014ivV\u0001#\u000flw\u007fG\u0002DK=f\n\bL\u001e\b~X\u001a*2F\u000e\u007fôz߾ѧ\u001b'=RG\u001biv\u0010A\\g%R'åרmRN:j\u0005$2B\u000b\"Yr`5o^Qp,?Kb\u0381Θ\u0002\t\u0019\u05ff[@F/ع\u000ffR~h\u0019ܗ\\P%wvEծm\u0004\u0011m8\rڭ4\u0018үߧeS|ܣ>\u0005\u0010\u0013֡eZS:0\r,0$`j>\u000e,I\\܄\u0012J? 2d1?ǒ[-H1#\tAԊ\bݠ˖l\u0014\u0005Ԩ22ѻhl\u0004\u0017ɢOtq\u001eάwy1\u000bʩ!EA\u007f:a3cȶgL|Q\fE͞õKhRܐK5#\u0004ɭz8\u0016H>\u0018ǽˮ\u0017\u0010\u0005Ȍ1J:Sɵq}Q{\u0017mϕ܃}\u0010Aï-0\rx҅+xjx\u001d\u001d$0Ճ]\u000b#6sFטӶJ{MϠSShLϋq\u001bYj\u001c~وġ#\u001f+˲nj5CԟB?3&{$1+`\fp\u007f7\ni\u001f(\u0005e23\u0012ܹn\u0011Э\\bAF՚X\u0017?Pٗk3IVܑv D\u001f3;:\u000fШяtW>Ԧ\nw\u0017t\u009e+%p\u0005)j\u0018}Ϲ3F_XIs\u0003\"ڍB=\u0011{Z.m6Xj\u05c8I'\n9\u0001wm݁ >&ݬV+7>Ӕr06o\t\u0013\tJz<4ZR8\u0010QҖh\u001e\u0010)\u0005ve\u001dŅ1Ztiڀ\r\u001bxحUޠϖdIfՈ)\u000fϼ\u000e{%\u0007\u009f0\u001dmt\"ucz\ba£\b3j}L-%s{bۏ\u001a@X/\u0010uaQ;\u001a62]Yryƙ\u000bP\u0018+3r\u001d)ʌP)_%5\u000f\u0011c͊M|w@؍Q\u0015ÝƏ}ғէ\u0012@\u0010۴\n'܈q8\u001c;ٷM\u00107q\u001f1\u001eRͷ\u0006$~yEIC69;\u0011ajB=,\\aȕ|  N,4z/ǞV&g8ܨ\u001a\u0001σ\u0082\u0015Ȉ֒\r\u0017Vܰ\u0003<خs;\u0011<Ĭ5g\u0002aOY^\"\u0014\u0006̭??+\u001bSjL\u0017ȁ\t\u0014}q\u008fT#\u000fv3fy\u001dC`\u001f\u0019'{{A%!ϓO\u05c9$Y\u001fם\u0013]A-\u0084\u0007z)>\u0018\fh\u001f4\u007fg\u001bŃ.\u00041q3@RLKMސtJ*%:#>nSNf\u0019\\\u001bG\u0006\u00125Ȩ*̒x\f1حM\u0013Vd)\u001bDJ\u0003 z.e M_cӔbԥ\bEQ\u008eqK`G39H\n\u001e1Mֲ\u000f̯f\u0001\b˟Z\u000bx\nu7MHZI(4*J{t\u001b(aDfQ82\u001f\u001c)1p7NM\u001b^rԤ]ߥE%\u0019۴-:\f\u0001\u0015+UlWf3>Q0\u000f$W{Gjh\ngx1D'q1V\u0015Q[y$\r}ڋ֚e۽}\u07b7\u0087U\u000eˋ0Y=G$\u0016c]\u0018\f%<2\u001f\u0016%\u0006_?cz\u000fj^ns\u0006\u001aV.D\u0004\\#u\u0003/2Hl@ѣńdא`ŪҚy\u0013ԯHN2/r*Sj\u0001{\u0011c\u001be49\u0015'7Ug,\u001es\n@Y_#Q=qu<A\n:xp\"\r̗è@Ŧ)Ɗ҅\u0011SŀnzuSe7F/%\u000f\n\u001d?r\u0001\u0002fC&I\u001c$T_tzc@\u00113p\u00152sFD\"\n4>d\rUBT߆\u0085\u0015Θ7W{CM@d\u00199\u001f\u0017\u000631EipsM\u0003B\fKhK\r\u0004I\u0007K\u0016b\u0013j9Mz*C\u0016!ol\b-Ôϥ*Ծ\u0005چʃcGЄH\tL*sb>Mh\u0001`sk\u001a<!C\u0007#\u0001OJpjsd?_\u000eǡzדY/5Ҽ\u001a\u0005\u0016v'I+ Yp@[D'?w\u0014\nrH\u00047Dۥ\u001cØeV)ǒ\u001eA5|Y)vgEVe}O5.f<\u0006A)\u0013k!~&\"\u000e\b\u0003z\u0015m\u001fÈÍ\u0011ߒFz\u0017|zP<)PW\f}\u0014R\u0003\u001e;}m\u0004|P~N_O\u0019\u0001Zi}t\rY{Ja:W\u0003\bި\u001d̑Si,pW\"f\u007f7Y,\u0007!Ej,4)\u0014HWxM\u001aۣqn\fVfZg~<nrH\u000bttBs@RG\u001b vQ\u000e\u001b\u007f\u0012\u0011U\u0011\u0003V\r(p|078^iG\b\u0011Mq\u0017B\u0005rCa,\n\u0602.ۆ&_eՋ_L\f]x2\u0018\u0017\u0002/A\t]\u0004:P-\u0007Te!\u001aCϹYݳ\u0003ΏϮ1E۾D\u001c5ݟw\u0012v\\B\u0010\"{3\u0002%և\u0011ރLط~կ\u00035&֦QY?\u001e/j\u001b\u001bB`@'x|t3j\u0001~\"\u0014{*D\u00124\u001bH$\u0002Ae\nQJ\\L04.6dc܅\u001e˲gT;Qo@\u001f<NO}fg\u001d*M\u0010\n:)R\tkֵ\u0004ع8J:״s\u0013\u001d\u00180J\u0015s/e_À\u000eؑxy&4s!\u0002(.\nB%UU\f\u0004u1=\u007f Kwr=i\u001e؇Uۢ>[TҬ\u000e]C9$s'q\n\u0017\u001e71\u000fP}\u0010\nx3\u001aP,M\u0011)\u0003MD\u0019\t|%15\u00118ЬĈ\u0016ɢ\u0013؊ڻr(ʤD5gbmiI&\t\u001f=9S}+F\u0017\u0011nM\u000f,\u001d3ph$\u001a0p\"ֱ&Ӕ=Q\u0001ܪc\u0017apuQq$m7y\u0018ޥ\n\u0001\u001e9#נQg\f{PdTڤbϮT"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r0X\u007f\u000fCUJ.\\_H", "", "Ad[2V;B]\"kz`0\u000b\u0018<a\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r0X\u007f\u0014GNR:k_nJw\u001ae\u0015$", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001{\u00165MAJo>'^Va@\u0007a;R\u000104LP0ja\u007f9!ub\u0019U\u0001Pu", "-hb\u0016a\u001bHc\u0017\u0002bh+|", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "", "-rT9X*MW#\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r0X\u007f|", "1kX=U6:`\u0018fvg(~\t<", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0013`\u0002+4w\u0012;L+7t0 \u0015u7", "5dc\u0010_0IP#z\b]\u0014x\u0012+g\u007f5", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\"Nk\u001d=\u00012=#[';x\u00138IP:S0'\u0011jaF\\", "Adc\u0010_0IP#z\b]\u0014x\u0012+g\u007f5", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\"\u001eC~\u000fF\u0004-~7\u0005$Bj *ZB#g=\u001a\u0017hn\u000fJT", "D`[BX", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/\u0015w ;LGDgC\u001e#>", "1n]AT0GS&evr6\r\u0018\ro\n5zD\n\u0013&G}", "5dc\u0010b5MO\u001d\bzk\u0013x\u001d9u\u000f\u0006\u0006J\u000e\u0016\u001bPk\u001d<\u0005", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n\u001cU\u0012*G|s8WP:o=\u001a$ho\u000f", "Adc\u0010b5MO\u001d\bzk\u0013x\u001d9u\u000f\u0006\u0006J\u000e\u0016\u001bPk\u001d<\u0005", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\f1m\b0FK 8ZB?t0-\u0015v7|w", "\nrTA \u0006\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "1ta?X5M2&z|I6\u000b\r>i\n1", "5dc\u0010h9KS\"\u000eYk(~s9s\u00047\u007fJ\n^\u0011OA|\u0010>\u0005", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Gy\u0016<\u00062I#g!8{\u0016=#", "Adc\u0010h9KS\"\u000eYk(~s9s\u00047\u007fJ\n^\u0011MOpJG\u0005", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019\u0017Qw\u000eK\u00049~C~!Em%\u0004\u00114", "1ta?X5M2&z|I6\u000b\r>i\n1:?\u0001\u001e\u0017Ik\u001d<", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "2qP45,@W\"i\u0005l0\f\r9n", "5dc\u0011e(@0\u0019\u0001~g\u0017\u0007\u00173t\u00042\u0005\babt\u0017L\u007f\u00075&?i\u0007\u001f3|\u001a8V=Hk;\u001e\u0011va", "u(9", "Adc\u0011e(@0\u0019\u0001~g\u0017\u0007\u00173t\u00042\u0005\b\u0007^eN[X$", "uI\u0018#", "2qP45,@W\"i\u0005l0\f\r9n>'{G\u0001\u0019\u0013Vo", "2qP4G6MO ]~l;x\u0012-e", "5dc\u0011e(@B#\u000eve\u000b\u0001\u0017>a\t&{\babt\u0017L\u007f\u00075&?i\u0007\u001f3|\u001a8V=Hk;\u001e\u0011va", "Adc\u0011e(@B#\u000eve\u000b\u0001\u0017>a\t&{\b\u0007^eN[X$", "2qP4G6MO ]~l;x\u0012-e>'{G\u0001\u0019\u0013Vo", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri\u001ai\u001f-TC\u0011", "2qP4Z0GU{z\u0004]3|", "5dc\u0011e(@U\u001d\b|A(\u0006\b6e", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7x*VBBk\n", "Adc\u0011e(@U\u001d\b|A(\u0006\b6e", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001P\u00127LJ;Aw\u000f", "2qP4Z0GU{z\u0004]3|G.e\u0007(}<\u0010\u0017", "3mS\u0015T5=Z\u0019i\u0005l0\f\r9n", "5dc\u0012a+!O\"}\u0002^\u0017\u0007\u00173t\u00042\u0005\bz\u001fh6CU\u001c", "Adc\u0012a+!O\"}\u0002^\u0017\u0007\u00173t\u00042\u0005\bz\u001dv*}^\u001c", "3mS\u0015T5=Z\u0019i\u0005l0\f\r9n>'{G\u0001\u0019\u0013Vo", "4nRBf\u0019>_)~\tm,\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Egj C}\u0016<\\CHA", "5dc\u0013b*Na\u0006~\u0007n,\u000b\u0018/r", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0018Qm\u001eJ@\u0006?W\u000e.$m\">MQJkAs", "Adc\u0013b*Na\u0006~\u0007n,\u000b\u0018/r", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0018!E\u007f\u001c\u0006W/3i\f\r7y&.[R;x\na\u0006", "6`_A\\*\u001fS\u0019}WZ*\u0003", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0004\u0013\"Vs\f=v%4Vy\u001e=7x*XR?i\u0015\u001e\u0015g^5\u0005i\u0002", "5dc\u0015T7MW\u0017_z^+Y\u0005-k", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001aCz\u001d@t&5Y|\u001d3k\u001cw0?Fz8\u001cuha8\u0004_*TL", "Adc\u0015T7MW\u0017_z^+Y\u0005-k", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001a\u0013R~\u0012:w%5Xz\u001c5s_\u0011INJo2~\u0015h`6\u0003a2$:\u0018", "6`b\u0013b*Na", "5dc\u0015T:\u001f]\u0017\u000f\t", "u(I", "Adc\u0015T:\u001f]\u0017\u000f\t", "uY\u0018#", "6`b\u0013b*NaW}ze,~\u0005>e", "7r8;G6NQ\u001cf\u0005],", "Adc\u0016a\u001bHc\u0017\u0002bh+|", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "5dc\u001ab+BT\u001d~\b", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`~Qn\u0012=z%B/", "<df\u001ca\u001a>Z\u0019|\nb6\u0006f2a\t*{", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "=mB2_,<b\u001d\t\u0004</x\u00121e", "5dc\u001ca\u001a>Z\u0019|\nb6\u0006f2a\t*{", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "Adc\u001ca\u001a>Z\u0019|\nb6\u0006f2a\t*{", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%Sc(", ">qTC\\6Na\u0004\t\tb;\u0001\u00138", ">qTC\\6Na\u0007~\u0002^*\f\r9nf$\u0010J\u0011&", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r0X\u007f\u000eC`X<k(", "5dc\u001de,OW#\u000f\tL,\u0004\t-t\u00042\u0005'|+!W~L=\u00015>Xy/;w\u001f(ZCBk0,\u0015']B\u0010m;J\u0006+QU\\", "u(E", "5dc\u001de,OW#\u000f\tL,\u0004\t-t\u00042\u0005'|+!W~L=\u00015>Xy/;w\u001f(ZCBk0,\u0015", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7$.TC9z8(\u001e2O9\u000ec*]z1P3J@fb\u0002\u0013", "Adc\u001de,OW#\u000f\tL,\u0004\t-t\u00042\u0005'|+!W~L=\u00015>Xy/;w\u001f(ZCBk0,\u0015", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001{\u00165MAJo>'^Va@\u0007a;R\u00010.Hb6laH\u0001\u0005", "Ad[2V;B]\"", "5dc X3>Q(\u0003\u0005g", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7$.TC9z8(\u001e2O9\u000ec*]z1P\"", "Adc X3>Q(\u0003\u0005g", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001{\u00165MAJo>'^Va@\u0007a;R\u00010\u001d\u0010?", "Ag^B_+,V#\u0011bZ.\u0006\r0i\u007f5", "5dc [6NZ\u0018l}h>d\u00051n\u0004)\u007f@\u000e", "Ag^DG6HZ\u0016z\b", "5dc [6PB#\t\u0002[(\nG0o\u00101z<\u0010\u001b!Pi\u001b<}%1g}", "Adc [6PB#\t\u0002[(\nG0o\u00101z<\u0010\u001b!Pi\u001b<}%1g}", "AsP?g\u000f:\\\u0018\u0006zI6\u000b\r>i\n1", "5dc g(Kb{z\u0004]3|s9s\u00047\u007fJ\n^\u0011OA|\u0010>\u0005", "Adc g(Kb{z\u0004]3|s9s\u00047\u007fJ\n^\u0011MOpJG\u0005", "AsP?g\u000f:\\\u0018\u0006zI6\u000b\r>i\n1:?\u0001\u001e\u0017Ik\u001d<", "BdgAG6HZ\u0016z\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n$Y\u0011/&w 5J?HA", "5dc!X?MB#\t\u0002[(\n", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\"Nk\u001d=\u00012=#l J|\u00058WJ8gAs", "Adc!X?MB#\t\u0002[(\n", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\"\u001eC~\u000fF\u0004-~H}3F\\ 8T@7x\na\u0006", "1n]AX?M;\u0019\b\u000bH7|\u0012\u000bd\u00058\nO\t\u0017 V", ">nb6g0H\\", "1n]AX?M;\u0019\b\u000bH7|\u0012\u000bd\u00058\nO\t\u0017 V7\u0014\u0004E,!$e", "1n]CX9MB#\\\u0005g;x\r8e\r\u0006\u0006J\u000e\u0016\u001bPk\u001d<\u0005", ":`h<h;\u001c]#\fyb5x\u0018/s", "=eU@X;", "1n]CX9MB#\\\u0005g;x\r8e\r\u0006\u0006J\u000e\u0016\u001bPk\u001d<\u0005l\")\\ \t=q", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\f1m\b0FK 8ZB?t0-\u0015v7\u001eJH", "1n_F", "1n_F\u0017-Hc\"}vm0\u0007\u0012)r\u007f/{<\u000f\u0017", "5dc\u000ea*A]&lze,z\u0018+b\u0007(", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r(K}'\u001d", "/mR5b9", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r0X\u007fe#UL/f_VF\u0015\u001c0", "5dc\u000ea*A]&lze,z\u0018+b\u0007(:A\u000b' Fk\u001d@\u0001./f}'7i$.", "5dc\u0010b5MS\"\u000eg^*\f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "5dc X3>Q(~yM,\u0010\u0018", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=A", "5dc X3>Q(~yM,\u0010\u0018mf\n8\u0005?|&\u001bQx\bIv,5U\f ", "5dc X3>Q(\u0003\u0005g\u0013x\u001d9u\u000f", ">qTC\\6Na{z\u0004]3|s9s\u00047\u007fJ\n", "7rBAT9M6\u0015\bye,", "5dc X3>Q(\u0003\u0005g\u0013x\u001d9u\u000fomF\u000bb\u0016\u0019q", "uI9'\u001c\u0013:\\\u0018\f\u0005b+\u0010R-o\b3\u0006N\u0001`\u0018Q\u007f\u0017;r49c\u0007iFm)=\u0017Q;r4\u001c$lkBPQ,Uv%VPX5CN\u0007G$!0", "6`]1_,\u001d`\u0015\u0001d[:|\u0016@e\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri&m)=,P7m\u001e\u001b#hnJ\u0007p\u0002", "7r4;g0KSv\t\u0004m(\u0001\u0012/rm(\u0003@~&\u0017F", "7r4;g0KSv\t\u0004m(\u0001\u0012/rm(\u0003@~&\u0017F.\u000fF\u0007.4U\r$Av\u0010;MJ;gB\u001e", "7r=<a\fF^(\u0013h^3|\u0007>i\n1", "7r=<a\fF^(\u0013h^3|\u0007>i\n1:A\u000b' Fk\u001d@\u0001./f}'7i$.", "7rC?\\=BO \u0006\u000f<6\u0004\u0010+p\u000e(z.\u0001\u001e\u0017E~\u0012F\u007f", "7rC?\\=BO \u0006\u000f<6\u0004\u0010+p\u000e(z.\u0001\u001e\u0017E~\u0012F\u007fc6c\u000e)6i%2WL5x4%\u0015do9", "=mA2_,:a\u0019", "@d`B\\9>1#\b\nZ0\u0006\t<C\n2\t?\u0005 \u0013Vo\u001c", "@d`B\\9>1#\b\nZ0\u0006\t<C\n2\t?\u0005 \u0013Vo\u001czw/Eb|\u001cFq 7GP;r4\u001a#h", "Ad[2V;\u001aZ ", "Ad[2V;\u001aZ ={h<\u0006\b+t\u00042\u0005:\u000e\u0017\u001eGk\u001c<", "Ad[2V;\u001aZ b\u0004L,\u0004\t-t{%\u0003@", "\u001aj^A_0G\u001d\u0004z~k\u0002", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\ng! IY\u000bAv#DAy+\r", "Ad[2V;:P ~^]", "", ">qTC\\6Na\u0007~\u0002^*\f\r9n", "Ad[2V;\u001aZ b\u0004L,\u0004\t-t{%\u0003@?\u0018!Wx\r8\u0006)?bw-7t\u0016*[C", "Ad[2V;B]\"\\}Z5~\t.", "Ad[2V;B]\"evr6\r\u0018", "<df X3>Q(\u0003\u0005g", "Ag^B_+)S&\u007f\u0005k4_\u0005:t\u0004&\n", "Ag^B_+)S&\u007f\u0005k4_\u0005:t\u0004&\n~\u0002!'Pn\nKz/>S\u000b >m\u0012<M", "AsP?g\u001a>Z\u0019|\nb6\u0006", "/cYBf;FS\"\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r0X\u007f\u0003FQ^:kZrF#g", "AsP?g\u001a>Z\u0019|\nb6\u0006P\u0003Kc\u0010\nU\u000b", "uII\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0002!'Pn\nKz/>#\r J|_<MJ;iC\"\u001fq+'\u0007j,L\u0006+QU*+ab\u0001L\u001c\u0012c\u001d$n}", "Bn^9U(K1#\n\u000f", "CoS.g,!O\"}\u0002^\u0016}\n=e\u000f6", "CoS.g,,S ~xm0\u0007\u0012", "CoS.g,,S ~xm0\u0007\u0012vj\u0014\u000fh\u001ez%UHy\u001eEu!D]\b)1z\u00165M?Ik", "uI9'?(GR&\t~]?F\u00079m\u000b2\n@J\u0018!Wx\r8\u0006)?bG/7\u0001%w[CBk2-\u0019rj\u0003tc3Nt6KVW\b[W\u0003K#\u001aZ\u0017]\u0001Py", "<df\u001db:Bb\u001d\t\u0004", "CoS.g,,S ~xm0\u0007\u0012vqh\u000e\u000eM\u0012\u0003UHy\u001eEu!D]\b)1z\u00165M?Ik", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019\u0017Qw\u000eK\u00049~C~!Em%\u000428\"g=\u001d\"re8\u001a-*X~2QZNu]\\\u0003F\u0013\u000ei\u0012X4V\u0014YT38R7&\b*X\u0006EqJy\u0016\u00155h\u007fF`\u0019#x\u001a\u0006O8pFbnO\u000b6", "CoS.g,,S ~xm0\u0007\u0012\u001eo\n/x<\u000e", "2dc2V;']\"\\\u0005g:\r\u00113n\u0002\u0017wK", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018' xp'\u0005m7NL", "=mC.c", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001b R\u007f\u001d\u0006\u0002/9b\r D7\u00018QLJkA\u0002\u001esqHta6Yv|.RX;cV{\u0007\u0019#bWO;\u0016\u0003hE.wR\u0001\u007f\u00185G\u0011?r\nWkt;t\u007fIZ\u0019\u0011w\u001f\u0003K9wJb_\b\u0011\u001fOk9h\u0015o\u0019k>D-i5\u007f da*S\u0003O\u001at\u001ccdlG\u0017\n\u000e", "=m29X(KA\u0019\u0006z\\;\u0001\u00138R\u007f4\f@\u000f&\u0017F", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SelectionManager {
    public static final int $stable = 8;
    private ClipboardManager clipboardManager;
    private LayoutCoordinates containerLayoutCoordinates;
    private HapticFeedback hapticFeedBack;
    private Offset previousPosition;
    private SelectionLayout previousSelectionLayout;
    private final SelectionRegistrarImpl selectionRegistrar;
    private boolean showToolbar;
    private TextToolbar textToolbar;
    private final MutableState<Selection> _selection = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    private final MutableState<Boolean> _isInTouchMode = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
    private Function1<? super Selection, Unit> onSelectionChange = new Function1<Selection, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$onSelectionChange$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Selection selection) {
            invoke2(selection);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Selection selection) {
            this.this$0.setSelection(selection);
        }
    };
    private FocusRequester focusRequester = new FocusRequester();
    private final MutableState hasFocus$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    private final MutableState dragBeginPosition$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m3926boximpl(Offset.Companion.m3953getZeroF1C5BW0()), null, 2, null);
    private final MutableState dragTotalDistance$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m3926boximpl(Offset.Companion.m3953getZeroF1C5BW0()), null, 2, null);
    private final MutableState startHandlePosition$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    private final MutableState endHandlePosition$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    private final MutableState draggingHandle$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    private final MutableState currentDragPosition$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    public static /* synthetic */ void getPreviousSelectionLayout$foundation_release$annotations() {
    }

    public SelectionManager(SelectionRegistrarImpl selectionRegistrarImpl) {
        this.selectionRegistrar = selectionRegistrarImpl;
        selectionRegistrarImpl.setOnPositionChangeCallback$foundation_release(new Function1<Long, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.1
            AnonymousClass1() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l2) {
                invoke(l2.longValue());
                return Unit.INSTANCE;
            }

            public final void invoke(long j2) {
                if (SelectionManager.this.selectionRegistrar.getSubselections().contains(j2)) {
                    SelectionManager.this.updateHandleOffsets();
                    SelectionManager.this.updateSelectionToolbar();
                }
            }
        });
        selectionRegistrarImpl.setOnSelectionUpdateStartCallback$foundation_release(new Function4<Boolean, LayoutCoordinates, Offset, SelectionAdjustment, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.2
            AnonymousClass2() {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, LayoutCoordinates layoutCoordinates, Offset offset, SelectionAdjustment selectionAdjustment) {
                m1713invokeRg1IO4c(bool.booleanValue(), layoutCoordinates, offset.m3947unboximpl(), selectionAdjustment);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke-Rg1IO4c */
            public final void m1713invokeRg1IO4c(boolean z2, LayoutCoordinates layoutCoordinates, long j2, SelectionAdjustment selectionAdjustment) {
                long jMo5522getSizeYbymL2g = layoutCoordinates.mo5522getSizeYbymL2g();
                Rect rect = new Rect(0.0f, 0.0f, IntSize.m6808getWidthimpl(jMo5522getSizeYbymL2g), IntSize.m6807getHeightimpl(jMo5522getSizeYbymL2g));
                if (!SelectionManagerKt.m1718containsInclusiveUv8p0NA(rect, j2)) {
                    j2 = TextLayoutStateKt.m1558coerceIn3MmeM6k(j2, rect);
                }
                long jM1697convertToContainerCoordinatesR5De75A = SelectionManager.this.m1697convertToContainerCoordinatesR5De75A(layoutCoordinates, j2);
                if (OffsetKt.m3956isSpecifiedk4lQ0M(jM1697convertToContainerCoordinatesR5De75A)) {
                    SelectionManager.this.setInTouchMode(z2);
                    SelectionManager.this.m1704startSelection9KIMszo(jM1697convertToContainerCoordinatesR5De75A, false, selectionAdjustment);
                    SelectionManager.this.getFocusRequester().requestFocus();
                    SelectionManager.this.setShowToolbar$foundation_release(false);
                }
            }
        });
        selectionRegistrarImpl.setOnSelectionUpdateSelectAll$foundation_release(new Function2<Boolean, Long, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.3
            AnonymousClass3() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Long l2) {
                invoke(bool.booleanValue(), l2.longValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z2, long j2) {
                SelectionManager selectionManager = SelectionManager.this;
                Pair<Selection, LongObjectMap<Selection>> pairSelectAllInSelectable$foundation_release = selectionManager.selectAllInSelectable$foundation_release(j2, selectionManager.getSelection());
                Selection selectionComponent1 = pairSelectAllInSelectable$foundation_release.component1();
                LongObjectMap<Selection> longObjectMapComponent2 = pairSelectAllInSelectable$foundation_release.component2();
                if (!Intrinsics.areEqual(selectionComponent1, SelectionManager.this.getSelection())) {
                    SelectionManager.this.selectionRegistrar.setSubselections(longObjectMapComponent2);
                    SelectionManager.this.getOnSelectionChange().invoke(selectionComponent1);
                }
                SelectionManager.this.setInTouchMode(z2);
                SelectionManager.this.getFocusRequester().requestFocus();
                SelectionManager.this.setShowToolbar$foundation_release(false);
            }
        });
        selectionRegistrarImpl.setOnSelectionUpdateCallback$foundation_release(new Function6<Boolean, LayoutCoordinates, Offset, Offset, Boolean, SelectionAdjustment, Boolean>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.4
            AnonymousClass4() {
                super(6);
            }

            @Override // kotlin.jvm.functions.Function6
            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool, LayoutCoordinates layoutCoordinates, Offset offset, Offset offset2, Boolean bool2, SelectionAdjustment selectionAdjustment) {
                return m1714invokepGV3PM0(bool.booleanValue(), layoutCoordinates, offset.m3947unboximpl(), offset2.m3947unboximpl(), bool2.booleanValue(), selectionAdjustment);
            }

            /* JADX INFO: renamed from: invoke-pGV3PM0 */
            public final Boolean m1714invokepGV3PM0(boolean z2, LayoutCoordinates layoutCoordinates, long j2, long j3, boolean z3, SelectionAdjustment selectionAdjustment) {
                long jM1697convertToContainerCoordinatesR5De75A = SelectionManager.this.m1697convertToContainerCoordinatesR5De75A(layoutCoordinates, j2);
                long jM1697convertToContainerCoordinatesR5De75A2 = SelectionManager.this.m1697convertToContainerCoordinatesR5De75A(layoutCoordinates, j3);
                SelectionManager.this.setInTouchMode(z2);
                return Boolean.valueOf(SelectionManager.this.m1712updateSelectionqNKwrvQ$foundation_release(Offset.m3926boximpl(jM1697convertToContainerCoordinatesR5De75A), jM1697convertToContainerCoordinatesR5De75A2, z3, selectionAdjustment));
            }
        });
        selectionRegistrarImpl.setOnSelectionUpdateEndCallback$foundation_release(new Function0<Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.5
            AnonymousClass5() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2() {
                SelectionManager.this.setShowToolbar$foundation_release(true);
                SelectionManager.this.setDraggingHandle(null);
                SelectionManager.this.m1699setCurrentDragPosition_kEHs6E(null);
            }
        });
        selectionRegistrarImpl.setOnSelectableChangeCallback$foundation_release(new Function1<Long, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.6
            AnonymousClass6() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l2) {
                invoke(l2.longValue());
                return Unit.INSTANCE;
            }

            public final void invoke(long j2) {
                if (SelectionManager.this.selectionRegistrar.getSubselections().contains(j2)) {
                    SelectionManager.this.onRelease();
                    SelectionManager.this.setSelection(null);
                }
            }
        });
        selectionRegistrarImpl.setAfterSelectableUnsubscribe$foundation_release(new Function1<Long, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.7
            AnonymousClass7() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l2) {
                invoke(l2.longValue());
                return Unit.INSTANCE;
            }

            public final void invoke(long j2) {
                Selection.AnchorInfo end;
                Selection.AnchorInfo start;
                Selection selection = SelectionManager.this.getSelection();
                if (selection != null && (start = selection.getStart()) != null && j2 == start.getSelectableId()) {
                    SelectionManager.this.m1703setStartHandlePosition_kEHs6E(null);
                }
                Selection selection2 = SelectionManager.this.getSelection();
                if (selection2 != null && (end = selection2.getEnd()) != null && j2 == end.getSelectableId()) {
                    SelectionManager.this.m1702setEndHandlePosition_kEHs6E(null);
                }
                if (SelectionManager.this.selectionRegistrar.getSubselections().contains(j2)) {
                    SelectionManager.this.updateSelectionToolbar();
                }
            }
        });
    }

    public final Selection getSelection() {
        return this._selection.getValue();
    }

    public final void setSelection(Selection selection) {
        this._selection.setValue(selection);
        if (selection != null) {
            updateHandleOffsets();
        }
    }

    public final boolean isInTouchMode() {
        return this._isInTouchMode.getValue().booleanValue();
    }

    public final void setInTouchMode(boolean z2) {
        if (this._isInTouchMode.getValue().booleanValue() != z2) {
            this._isInTouchMode.setValue(Boolean.valueOf(z2));
            updateSelectionToolbar();
        }
    }

    public final Function1<Selection, Unit> getOnSelectionChange() {
        return this.onSelectionChange;
    }

    public final void setOnSelectionChange(final Function1<? super Selection, Unit> function1) {
        this.onSelectionChange = new Function1<Selection, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$onSelectionChange$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Selection selection) {
                invoke2(selection);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Selection selection) {
                this.this$0.setSelection(selection);
                function1.invoke(selection);
            }
        };
    }

    public final HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    public final void setHapticFeedBack(HapticFeedback hapticFeedback) {
        this.hapticFeedBack = hapticFeedback;
    }

    public final ClipboardManager getClipboardManager() {
        return this.clipboardManager;
    }

    public final void setClipboardManager(ClipboardManager clipboardManager) {
        this.clipboardManager = clipboardManager;
    }

    public final TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    public final void setTextToolbar(TextToolbar textToolbar) {
        this.textToolbar = textToolbar;
    }

    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    public final void setFocusRequester(FocusRequester focusRequester) {
        this.focusRequester = focusRequester;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getHasFocus() {
        return ((Boolean) this.hasFocus$delegate.getValue()).booleanValue();
    }

    public final void setHasFocus(boolean z2) {
        this.hasFocus$delegate.setValue(Boolean.valueOf(z2));
    }

    public final Modifier getModifier() {
        return KeyInputModifierKt.onKeyEvent(SelectionGesturesKt.updateSelectionTouchMode(FocusableKt.focusable$default(FocusChangedModifierKt.onFocusChanged(FocusRequesterModifierKt.focusRequester(OnGloballyPositionedModifierKt.onGloballyPositioned(onClearSelectionRequested(Modifier.Companion, new Function0<Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$modifier$1
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
                this.this$0.onRelease();
            }
        }), new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$modifier$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                invoke2(layoutCoordinates);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LayoutCoordinates layoutCoordinates) {
                this.this$0.setContainerLayoutCoordinates(layoutCoordinates);
            }
        }), this.focusRequester), new Function1<FocusState, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$modifier$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(FocusState focusState) {
                invoke2(focusState);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(FocusState focusState) {
                if (!focusState.isFocused() && this.this$0.getHasFocus()) {
                    this.this$0.onRelease();
                }
                this.this$0.setHasFocus(focusState.isFocused());
            }
        }), false, null, 3, null), new Function1<Boolean, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$modifier$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z2) {
                this.this$0.setInTouchMode(z2);
            }
        }), new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$modifier$5
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                return m1715invokeZmokQxo(keyEvent.m5232unboximpl());
            }

            /* JADX INFO: renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m1715invokeZmokQxo(android.view.KeyEvent keyEvent) {
                boolean z2;
                if (SelectionManager_androidKt.m1720isCopyKeyEventZmokQxo(keyEvent)) {
                    this.this$0.copy$foundation_release();
                    z2 = true;
                } else {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            }
        }).then(getShouldShowMagnifier() ? SelectionManager_androidKt.selectionMagnifier(Modifier.Companion, this) : Modifier.Companion);
    }

    public final LayoutCoordinates getContainerLayoutCoordinates() {
        return this.containerLayoutCoordinates;
    }

    public final void setContainerLayoutCoordinates(LayoutCoordinates layoutCoordinates) {
        this.containerLayoutCoordinates = layoutCoordinates;
        if (!getHasFocus() || getSelection() == null) {
            return;
        }
        Offset offsetM3926boximpl = layoutCoordinates != null ? Offset.m3926boximpl(LayoutCoordinatesKt.positionInWindow(layoutCoordinates)) : null;
        if (Intrinsics.areEqual(this.previousPosition, offsetM3926boximpl)) {
            return;
        }
        this.previousPosition = offsetM3926boximpl;
        updateHandleOffsets();
        updateSelectionToolbar();
    }

    /* JADX INFO: renamed from: setDragBeginPosition-k-4lQ0M */
    public final void m1700setDragBeginPositionk4lQ0M(long j2) {
        this.dragBeginPosition$delegate.setValue(Offset.m3926boximpl(j2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getDragBeginPosition-F1C5BW0$foundation_release */
    public final long m1707getDragBeginPositionF1C5BW0$foundation_release() {
        return ((Offset) this.dragBeginPosition$delegate.getValue()).m3947unboximpl();
    }

    /* JADX INFO: renamed from: setDragTotalDistance-k-4lQ0M */
    public final void m1701setDragTotalDistancek4lQ0M(long j2) {
        this.dragTotalDistance$delegate.setValue(Offset.m3926boximpl(j2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getDragTotalDistance-F1C5BW0$foundation_release */
    public final long m1708getDragTotalDistanceF1C5BW0$foundation_release() {
        return ((Offset) this.dragTotalDistance$delegate.getValue()).m3947unboximpl();
    }

    /* JADX INFO: renamed from: setStartHandlePosition-_kEHs6E */
    public final void m1703setStartHandlePosition_kEHs6E(Offset offset) {
        this.startHandlePosition$delegate.setValue(offset);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getStartHandlePosition-_m7T9-E */
    public final Offset m1710getStartHandlePosition_m7T9E() {
        return (Offset) this.startHandlePosition$delegate.getValue();
    }

    /* JADX INFO: renamed from: setEndHandlePosition-_kEHs6E */
    public final void m1702setEndHandlePosition_kEHs6E(Offset offset) {
        this.endHandlePosition$delegate.setValue(offset);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getEndHandlePosition-_m7T9-E */
    public final Offset m1709getEndHandlePosition_m7T9E() {
        return (Offset) this.endHandlePosition$delegate.getValue();
    }

    public final void setDraggingHandle(Handle handle) {
        this.draggingHandle$delegate.setValue(handle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Handle getDraggingHandle() {
        return (Handle) this.draggingHandle$delegate.getValue();
    }

    /* JADX INFO: renamed from: setCurrentDragPosition-_kEHs6E */
    public final void m1699setCurrentDragPosition_kEHs6E(Offset offset) {
        this.currentDragPosition$delegate.setValue(offset);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getCurrentDragPosition-_m7T9-E */
    public final Offset m1706getCurrentDragPosition_m7T9E() {
        return (Offset) this.currentDragPosition$delegate.getValue();
    }

    private final boolean getShouldShowMagnifier() {
        return (getDraggingHandle() == null || !isInTouchMode() || isTriviallyCollapsedSelection$foundation_release()) ? false : true;
    }

    public final SelectionLayout getPreviousSelectionLayout$foundation_release() {
        return this.previousSelectionLayout;
    }

    public final void setPreviousSelectionLayout$foundation_release(SelectionLayout selectionLayout) {
        this.previousSelectionLayout = selectionLayout;
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionManager$1 */
    /* JADX INFO: compiled from: SelectionManager.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,i\bӵLc\u0003\u000bIي>éFB-!\\\u0016\u0006\u0007~jg1\u000bm߬2RY,"}, d2 = {"\n`]<a@F])\rS", "", "Ad[2V;:P ~^]", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function1<Long, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l2) {
            invoke(l2.longValue());
            return Unit.INSTANCE;
        }

        public final void invoke(long j2) {
            if (SelectionManager.this.selectionRegistrar.getSubselections().contains(j2)) {
                SelectionManager.this.updateHandleOffsets();
                SelectionManager.this.updateSelectionToolbar();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionManager$2 */
    /* JADX INFO: compiled from: SelectionManager.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я$\u001d̉=!,i\bӵLc\u0003\rIي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP.XS8ş\u0004{b#\f(\u007fCSUH~R\r]P\u007fg\u001dM\u000b\u000fQ\u0013\u001e\u0016'o\\Mc~u\u0012=9\twУ7OuEGi"}, d2 = {"\n`]<a@F])\rS", "", "7r8;G6NQ\u001cf\u0005],", "", ":`h<h;\u001c]#\fyb5x\u0018/s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/\u0015w ;LGDgC\u001e#>", "@`f\u001db:Bb\u001d\t\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "Ad[2V;B]\"f\u0005],", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r0X\u007f\u0003FQ^:kZrF#g", "7me<^,\u0006@\u001bJ^Hzz", "uY;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n\u001cU\u0012*G|s8WP:o=\u001a$ho\u000fkJ(Wu4QPM?&P|E\u001f\u001ch\u000e\u0018,\u0017\u0015b@ }HA(Q;I\u0015J2\u000f\f\u001d\u000e3ytL_Y5y\u001cu?8lPb;xLQSq2d\u0015nr +"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function4<Boolean, LayoutCoordinates, Offset, SelectionAdjustment, Unit> {
        AnonymousClass2() {
            super(4);
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, LayoutCoordinates layoutCoordinates, Offset offset, SelectionAdjustment selectionAdjustment) {
            m1713invokeRg1IO4c(bool.booleanValue(), layoutCoordinates, offset.m3947unboximpl(), selectionAdjustment);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke-Rg1IO4c */
        public final void m1713invokeRg1IO4c(boolean z2, LayoutCoordinates layoutCoordinates, long j2, SelectionAdjustment selectionAdjustment) {
            long jMo5522getSizeYbymL2g = layoutCoordinates.mo5522getSizeYbymL2g();
            Rect rect = new Rect(0.0f, 0.0f, IntSize.m6808getWidthimpl(jMo5522getSizeYbymL2g), IntSize.m6807getHeightimpl(jMo5522getSizeYbymL2g));
            if (!SelectionManagerKt.m1718containsInclusiveUv8p0NA(rect, j2)) {
                j2 = TextLayoutStateKt.m1558coerceIn3MmeM6k(j2, rect);
            }
            long jM1697convertToContainerCoordinatesR5De75A = SelectionManager.this.m1697convertToContainerCoordinatesR5De75A(layoutCoordinates, j2);
            if (OffsetKt.m3956isSpecifiedk4lQ0M(jM1697convertToContainerCoordinatesR5De75A)) {
                SelectionManager.this.setInTouchMode(z2);
                SelectionManager.this.m1704startSelection9KIMszo(jM1697convertToContainerCoordinatesR5De75A, false, selectionAdjustment);
                SelectionManager.this.getFocusRequester().requestFocus();
                SelectionManager.this.setShowToolbar$foundation_release(false);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionManager$3 */
    /* JADX INFO: compiled from: SelectionManager.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d̉=!,i\bӵLc\u0003\rIي8\u000b<I\u0007Ӭ:ߚ\u0010\u0007\u0015ii4Re`.\u0001TZ\u0013y}L$\n'8KтY\u001a\u0004&"}, d2 = {"\n`]<a@F])\rS", "", "7r8;G6NQ\u001cf\u0005],", "", "Ad[2V;:P ~^]", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass3 extends Lambda implements Function2<Boolean, Long, Unit> {
        AnonymousClass3() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Long l2) {
            invoke(bool.booleanValue(), l2.longValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z2, long j2) {
            SelectionManager selectionManager = SelectionManager.this;
            Pair<Selection, LongObjectMap<Selection>> pairSelectAllInSelectable$foundation_release = selectionManager.selectAllInSelectable$foundation_release(j2, selectionManager.getSelection());
            Selection selectionComponent1 = pairSelectAllInSelectable$foundation_release.component1();
            LongObjectMap<Selection> longObjectMapComponent2 = pairSelectAllInSelectable$foundation_release.component2();
            if (!Intrinsics.areEqual(selectionComponent1, SelectionManager.this.getSelection())) {
                SelectionManager.this.selectionRegistrar.setSubselections(longObjectMapComponent2);
                SelectionManager.this.getOnSelectionChange().invoke(selectionComponent1);
            }
            SelectionManager.this.setInTouchMode(z2);
            SelectionManager.this.getFocusRequester().requestFocus();
            SelectionManager.this.setShowToolbar$foundation_release(false);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionManager$4 */
    /* JADX INFO: compiled from: SelectionManager.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\"\u001d̉=!,r\bDJc|\u0004W\u00068é6B\u0015\"4\u0012}\bnjO0LeN.`ݷB\u000f\u001azd(i$\nCiTJ\u00020\ngN\u0016i\u001fNh\u000e[\u000f4\u001a)n:Nmx\f\u0016?6PuW3{nm=n{N\u0005N:h@ѩ\t\u0003 3V\u001a"}, d2 = {"\n`]<a@F])\rS", "", "7r8;G6NQ\u001cf\u0005],", ":`h<h;\u001c]#\fyb5x\u0018/s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/\u0015w ;LGDgC\u001e#>", "<df\u001db:Bb\u001d\t\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", ">qTC\\6Na\u0004\t\tb;\u0001\u00138", "7rBAT9M6\u0015\bye,", "Ad[2V;B]\"f\u0005],", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r0X\u007f\u0003FQ^:kZrF#g", "7me<^,\u0006^zoHI\u0014G", "uY;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n\u001cU\u0012*G|s8WP:o=\u001a$ho\u000fkH!5r0FYX0[e<;\u001e\u001ae\u0018\\+V\u0006cQ-m@F#\u00125\u0013\u0011;{\u0010U$\u000e<jnQZ\u001aPC\u0003uH)fU]i\u0003#@Jr8s\u0014_&k\u0010}\u000b\u0019m*\u00172W*\u0013}\u001dm|\\\u0001gcPn"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass4 extends Lambda implements Function6<Boolean, LayoutCoordinates, Offset, Offset, Boolean, SelectionAdjustment, Boolean> {
        AnonymousClass4() {
            super(6);
        }

        @Override // kotlin.jvm.functions.Function6
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool, LayoutCoordinates layoutCoordinates, Offset offset, Offset offset2, Boolean bool2, SelectionAdjustment selectionAdjustment) {
            return m1714invokepGV3PM0(bool.booleanValue(), layoutCoordinates, offset.m3947unboximpl(), offset2.m3947unboximpl(), bool2.booleanValue(), selectionAdjustment);
        }

        /* JADX INFO: renamed from: invoke-pGV3PM0 */
        public final Boolean m1714invokepGV3PM0(boolean z2, LayoutCoordinates layoutCoordinates, long j2, long j3, boolean z3, SelectionAdjustment selectionAdjustment) {
            long jM1697convertToContainerCoordinatesR5De75A = SelectionManager.this.m1697convertToContainerCoordinatesR5De75A(layoutCoordinates, j2);
            long jM1697convertToContainerCoordinatesR5De75A2 = SelectionManager.this.m1697convertToContainerCoordinatesR5De75A(layoutCoordinates, j3);
            SelectionManager.this.setInTouchMode(z2);
            return Boolean.valueOf(SelectionManager.this.m1712updateSelectionqNKwrvQ$foundation_release(Offset.m3926boximpl(jM1697convertToContainerCoordinatesR5De75A), jM1697convertToContainerCoordinatesR5De75A2, z3, selectionAdjustment));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionManager$5 */
    /* JADX INFO: compiled from: SelectionManager.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,i\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass5 extends Lambda implements Function0<Unit> {
        AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
            SelectionManager.this.setShowToolbar$foundation_release(true);
            SelectionManager.this.setDraggingHandle(null);
            SelectionManager.this.m1699setCurrentDragPosition_kEHs6E(null);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionManager$6 */
    /* JADX INFO: compiled from: SelectionManager.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,i\bӵLc\u0003\u000bIي>éFB-!\\\u0016\u0006\u0007~jg1\u000bm߬2RY,"}, d2 = {"\n`]<a@F])\rS", "", "Ad[2V;:P ~`^@", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass6 extends Lambda implements Function1<Long, Unit> {
        AnonymousClass6() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l2) {
            invoke(l2.longValue());
            return Unit.INSTANCE;
        }

        public final void invoke(long j2) {
            if (SelectionManager.this.selectionRegistrar.getSubselections().contains(j2)) {
                SelectionManager.this.onRelease();
                SelectionManager.this.setSelection(null);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionManager$7 */
    /* JADX INFO: compiled from: SelectionManager.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,i\bӵLc\u0003\u000bIي>éFB-!\\\u0016\u0006\u0007~jg1\u000bm߬2RY,"}, d2 = {"\n`]<a@F])\rS", "", "Ad[2V;:P ~^]", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass7 extends Lambda implements Function1<Long, Unit> {
        AnonymousClass7() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l2) {
            invoke(l2.longValue());
            return Unit.INSTANCE;
        }

        public final void invoke(long j2) {
            Selection.AnchorInfo end;
            Selection.AnchorInfo start;
            Selection selection = SelectionManager.this.getSelection();
            if (selection != null && (start = selection.getStart()) != null && j2 == start.getSelectableId()) {
                SelectionManager.this.m1703setStartHandlePosition_kEHs6E(null);
            }
            Selection selection2 = SelectionManager.this.getSelection();
            if (selection2 != null && (end = selection2.getEnd()) != null && j2 == end.getSelectableId()) {
                SelectionManager.this.m1702setEndHandlePosition_kEHs6E(null);
            }
            if (SelectionManager.this.selectionRegistrar.getSubselections().contains(j2)) {
                SelectionManager.this.updateSelectionToolbar();
            }
        }
    }

    public final Selectable getAnchorSelectable$foundation_release(Selection.AnchorInfo anchorInfo) {
        return this.selectionRegistrar.getSelectableMap$foundation_release().get(anchorInfo.getSelectableId());
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void updateHandleOffsets() {
        /*
            r11 = this;
            androidx.compose.foundation.text.selection.Selection r10 = r11.getSelection()
            androidx.compose.ui.layout.LayoutCoordinates r7 = r11.containerLayoutCoordinates
            r5 = 0
            if (r10 == 0) goto L46
            androidx.compose.foundation.text.selection.Selection$AnchorInfo r0 = r10.getStart()
            if (r0 == 0) goto L46
            androidx.compose.foundation.text.selection.Selectable r1 = r11.getAnchorSelectable$foundation_release(r0)
        L13:
            if (r10 == 0) goto L44
            androidx.compose.foundation.text.selection.Selection$AnchorInfo r0 = r10.getEnd()
            if (r0 == 0) goto L44
            androidx.compose.foundation.text.selection.Selectable r9 = r11.getAnchorSelectable$foundation_release(r0)
        L1f:
            if (r1 == 0) goto L42
            androidx.compose.ui.layout.LayoutCoordinates r3 = r1.getLayoutCoordinates()
        L25:
            if (r9 == 0) goto L40
            androidx.compose.ui.layout.LayoutCoordinates r4 = r9.getLayoutCoordinates()
        L2b:
            if (r10 == 0) goto L39
            if (r7 == 0) goto L39
            boolean r0 = r7.isAttached()
            if (r0 == 0) goto L39
            if (r3 != 0) goto L48
            if (r4 != 0) goto L48
        L39:
            r11.m1703setStartHandlePosition_kEHs6E(r5)
            r11.m1702setEndHandlePosition_kEHs6E(r5)
            return
        L40:
            r4 = r5
            goto L2b
        L42:
            r3 = r5
            goto L25
        L44:
            r9 = r5
            goto L1f
        L46:
            r1 = r5
            goto L13
        L48:
            androidx.compose.ui.geometry.Rect r6 = androidx.compose.foundation.text.selection.SelectionManagerKt.visibleBounds(r7)
            if (r3 == 0) goto L59
            r0 = 1
            long r0 = r1.mo1666getHandlePositiondBAh8RU(r10, r0)
            boolean r2 = androidx.compose.ui.geometry.OffsetKt.m3958isUnspecifiedk4lQ0M(r0)
            if (r2 == 0) goto L8a
        L59:
            r8 = r5
        L5a:
            r11.m1703setStartHandlePosition_kEHs6E(r8)
            if (r4 == 0) goto L6a
            r0 = 0
            long r1 = r9.mo1666getHandlePositiondBAh8RU(r10, r0)
            boolean r0 = androidx.compose.ui.geometry.OffsetKt.m3958isUnspecifiedk4lQ0M(r1)
            if (r0 == 0) goto L6e
        L6a:
            r11.m1702setEndHandlePosition_kEHs6E(r5)
            return
        L6e:
            long r0 = r7.mo5523localPositionOfR5De75A(r4, r1)
            androidx.compose.ui.geometry.Offset r4 = androidx.compose.ui.geometry.Offset.m3926boximpl(r0)
            long r2 = r4.m3947unboximpl()
            androidx.compose.foundation.text.Handle r1 = r11.getDraggingHandle()
            androidx.compose.foundation.text.Handle r0 = androidx.compose.foundation.text.Handle.SelectionEnd
            if (r1 == r0) goto L88
            boolean r0 = androidx.compose.foundation.text.selection.SelectionManagerKt.m1718containsInclusiveUv8p0NA(r6, r2)
            if (r0 == 0) goto L6a
        L88:
            r5 = r4
            goto L6a
        L8a:
            long r0 = r7.mo5523localPositionOfR5De75A(r3, r0)
            androidx.compose.ui.geometry.Offset r8 = androidx.compose.ui.geometry.Offset.m3926boximpl(r0)
            long r1 = r8.m3947unboximpl()
            androidx.compose.foundation.text.Handle r3 = r11.getDraggingHandle()
            androidx.compose.foundation.text.Handle r0 = androidx.compose.foundation.text.Handle.SelectionStart
            if (r3 == r0) goto L5a
            boolean r0 = androidx.compose.foundation.text.selection.SelectionManagerKt.m1718containsInclusiveUv8p0NA(r6, r1)
            if (r0 == 0) goto L59
            goto L5a
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionManager.updateHandleOffsets():void");
    }

    public final LayoutCoordinates requireContainerCoordinates$foundation_release() {
        LayoutCoordinates layoutCoordinates = this.containerLayoutCoordinates;
        if (layoutCoordinates == null) {
            throw new IllegalArgumentException("null coordinates".toString());
        }
        if (layoutCoordinates.isAttached()) {
            return layoutCoordinates;
        }
        throw new IllegalArgumentException("unattached coordinates".toString());
    }

    public final Pair<Selection, LongObjectMap<Selection>> selectAllInSelectable$foundation_release(long j2, Selection selection) {
        HapticFeedback hapticFeedback;
        MutableLongObjectMap mutableLongObjectMapMutableLongObjectMapOf = LongObjectMapKt.mutableLongObjectMapOf();
        List<Selectable> listSort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        int size = listSort.size();
        Selection selectionMerge = null;
        for (int i2 = 0; i2 < size; i2++) {
            Selectable selectable = listSort.get(i2);
            Selection selectAllSelection = selectable.getSelectableId() == j2 ? selectable.getSelectAllSelection() : null;
            if (selectAllSelection != null) {
                mutableLongObjectMapMutableLongObjectMapOf.set(selectable.getSelectableId(), selectAllSelection);
            }
            selectionMerge = SelectionManagerKt.merge(selectionMerge, selectAllSelection);
        }
        if (isInTouchMode() && !Intrinsics.areEqual(selectionMerge, selection) && (hapticFeedback = this.hapticFeedBack) != null) {
            hapticFeedback.mo4906performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m4915getTextHandleMove5zf0vsI());
        }
        return new Pair<>(selectionMerge, mutableLongObjectMapMutableLongObjectMapOf);
    }

    public final boolean isEntireContainerSelected$foundation_release() {
        Selection selection;
        List<Selectable> listSort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        if (listSort.isEmpty()) {
            return true;
        }
        int size = listSort.size();
        for (int i2 = 0; i2 < size; i2++) {
            Selectable selectable = listSort.get(i2);
            AnnotatedString text = selectable.getText();
            if (text.length() != 0 && ((selection = this.selectionRegistrar.getSubselections().get(selectable.getSelectableId())) == null || Math.abs(selection.getStart().getOffset() - selection.getEnd().getOffset()) != text.length())) {
                return false;
            }
        }
        return true;
    }

    public final void selectAll$foundation_release() {
        List<Selectable> listSort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        if (listSort.isEmpty()) {
            return;
        }
        MutableLongObjectMap mutableLongObjectMapMutableLongObjectMapOf = LongObjectMapKt.mutableLongObjectMapOf();
        int size = listSort.size();
        Selection selection = null;
        Selection selection2 = null;
        for (int i2 = 0; i2 < size; i2++) {
            Selectable selectable = listSort.get(i2);
            Selection selectAllSelection = selectable.getSelectAllSelection();
            if (selectAllSelection != null) {
                if (selection == null) {
                    selection = selectAllSelection;
                }
                mutableLongObjectMapMutableLongObjectMapOf.put(selectable.getSelectableId(), selectAllSelection);
                selection2 = selectAllSelection;
            }
        }
        if (mutableLongObjectMapMutableLongObjectMapOf.isEmpty()) {
            return;
        }
        if (selection != selection2) {
            Intrinsics.checkNotNull(selection);
            Selection.AnchorInfo start = selection.getStart();
            Intrinsics.checkNotNull(selection2);
            selection = new Selection(start, selection2.getEnd(), false);
        }
        this.selectionRegistrar.setSubselections(mutableLongObjectMapMutableLongObjectMapOf);
        this.onSelectionChange.invoke(selection);
        this.previousSelectionLayout = null;
    }

    public final boolean isTriviallyCollapsedSelection$foundation_release() {
        Selection selection = getSelection();
        if (selection == null) {
            return true;
        }
        return Intrinsics.areEqual(selection.getStart(), selection.getEnd());
    }

    public final boolean isNonEmptySelection$foundation_release() {
        Selection selection = getSelection();
        if (selection == null || Intrinsics.areEqual(selection.getStart(), selection.getEnd())) {
            return false;
        }
        if (selection.getStart().getSelectableId() == selection.getEnd().getSelectableId()) {
            return true;
        }
        List<Selectable> listSort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        int size = listSort.size();
        for (int i2 = 0; i2 < size; i2++) {
            Selection selection2 = this.selectionRegistrar.getSubselections().get(listSort.get(i2).getSelectableId());
            if (selection2 != null && selection2.getStart().getOffset() != selection2.getEnd().getOffset()) {
                return true;
            }
        }
        return false;
    }

    public final AnnotatedString getSelectedText$foundation_release() {
        AnnotatedString annotatedStringSubSequence;
        if (getSelection() == null || this.selectionRegistrar.getSubselections().isEmpty()) {
            return null;
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        List<Selectable> listSort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        int size = listSort.size();
        for (int i2 = 0; i2 < size; i2++) {
            Selectable selectable = listSort.get(i2);
            Selection selection = this.selectionRegistrar.getSubselections().get(selectable.getSelectableId());
            if (selection != null) {
                AnnotatedString text = selectable.getText();
                if (selection.getHandlesCrossed()) {
                    annotatedStringSubSequence = text.subSequence(selection.getEnd().getOffset(), selection.getStart().getOffset());
                } else {
                    annotatedStringSubSequence = text.subSequence(selection.getStart().getOffset(), selection.getEnd().getOffset());
                }
                builder.append(annotatedStringSubSequence);
            }
        }
        return builder.toAnnotatedString();
    }

    public final void copy$foundation_release() {
        ClipboardManager clipboardManager;
        AnnotatedString selectedText$foundation_release = getSelectedText$foundation_release();
        if (selectedText$foundation_release != null) {
            if (selectedText$foundation_release.length() <= 0) {
                selectedText$foundation_release = null;
            }
            if (selectedText$foundation_release == null || (clipboardManager = this.clipboardManager) == null) {
                return;
            }
            clipboardManager.setText(selectedText$foundation_release);
        }
    }

    public final boolean getShowToolbar$foundation_release() {
        return this.showToolbar;
    }

    public final void setShowToolbar$foundation_release(boolean z2) {
        this.showToolbar = z2;
        updateSelectionToolbar();
    }

    public final void toolbarCopy() {
        copy$foundation_release();
        onRelease();
    }

    public final void updateSelectionToolbar() {
        TextToolbar textToolbar;
        if (getHasFocus() && (textToolbar = this.textToolbar) != null) {
            if (this.showToolbar && isInTouchMode()) {
                Rect contentRect = getContentRect();
                if (contentRect == null) {
                    return;
                }
                TextToolbar.showMenu$default(textToolbar, contentRect, isNonEmptySelection$foundation_release() ? new C05851(this) : null, null, null, isEntireContainerSelected$foundation_release() ? null : new C05862(this), 12, null);
                return;
            }
            if (textToolbar.getStatus() == TextToolbarStatus.Shown) {
                textToolbar.hide();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionManager$updateSelectionToolbar$1 */
    /* JADX INFO: compiled from: SelectionManager.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    /* synthetic */ class C05851 extends FunctionReferenceImpl implements Function0<Unit> {
        C05851(Object obj) {
            super(0, obj, SelectionManager.class, "toolbarCopy", "toolbarCopy()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
            ((SelectionManager) this.receiver).toolbarCopy();
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionManager$updateSelectionToolbar$2 */
    /* JADX INFO: compiled from: SelectionManager.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    /* synthetic */ class C05862 extends FunctionReferenceImpl implements Function0<Unit> {
        C05862(Object obj) {
            super(0, obj, SelectionManager.class, "selectAll", "selectAll$foundation_release()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
            ((SelectionManager) this.receiver).selectAll$foundation_release();
        }
    }

    private final Rect getContentRect() {
        LayoutCoordinates layoutCoordinates;
        if (getSelection() == null || (layoutCoordinates = this.containerLayoutCoordinates) == null || !layoutCoordinates.isAttached()) {
            return null;
        }
        List<Selectable> listSort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        ArrayList arrayList = new ArrayList(listSort.size());
        int size = listSort.size();
        for (int i2 = 0; i2 < size; i2++) {
            Selectable selectable = listSort.get(i2);
            Selection selection = this.selectionRegistrar.getSubselections().get(selectable.getSelectableId());
            Pair pair = selection != null ? TuplesKt.to(selectable, selection) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        List listFirstAndLast = SelectionManagerKt.firstAndLast(arrayList);
        if (listFirstAndLast.isEmpty()) {
            return null;
        }
        Rect selectedRegionRect = SelectionManagerKt.getSelectedRegionRect(listFirstAndLast, layoutCoordinates);
        if (Intrinsics.areEqual(selectedRegionRect, SelectionManagerKt.invertedInfiniteRect)) {
            return null;
        }
        Rect rectIntersect = SelectionManagerKt.visibleBounds(layoutCoordinates).intersect(selectedRegionRect);
        if (rectIntersect.getWidth() < 0.0f || rectIntersect.getHeight() < 0.0f) {
            return null;
        }
        Rect rectM3974translatek4lQ0M = rectIntersect.m3974translatek4lQ0M(LayoutCoordinatesKt.positionInRoot(layoutCoordinates));
        return Rect.copy$default(rectM3974translatek4lQ0M, 0.0f, 0.0f, 0.0f, rectM3974translatek4lQ0M.getBottom() + (SelectionHandlesKt.getHandleHeight() * 4), 7, null);
    }

    public final void onRelease() {
        HapticFeedback hapticFeedback;
        this.selectionRegistrar.setSubselections(LongObjectMapKt.emptyLongObjectMap());
        setShowToolbar$foundation_release(false);
        if (getSelection() != null) {
            this.onSelectionChange.invoke(null);
            if (!isInTouchMode() || (hapticFeedback = this.hapticFeedBack) == null) {
                return;
            }
            hapticFeedback.mo4906performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m4915getTextHandleMove5zf0vsI());
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionManager$handleDragObserver$1 */
    /* JADX INFO: compiled from: SelectionManager.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001d\u001d̉=!4i\bӵLc\u0003\u0004I\u00066\f6B\u0015\"4\u0012}\u0010\u000fiˎ6L{߉^R\u0002)Wq\n4<[Rr\n;\u001e \f$!O|h.\u0003\u0013r\u0019F'\u0006Dy\u001b0WY\u0011]@\u0014xVƜ>\u074cޜs??f\u0003=M8@*Py3\u0002J.V\u0019\u000fzqPR&ڌ?\u0081ĐV\u000fS\u000f(\u0019NV.\f6\\\u0016OfLziR/Q\b0VŰ&ڿ݁\u0001O\u0013Sb.U|o,C@e6[9\u001c\t\u0015as?1@8Qݞh,/.OַsdWą\u0018%"}, d2 = {"/mS?b0=fb|\u0005f7\u0007\u0017//\u00012\fI\u007f\u0013&Ky\u0017\u0006\u0006%HhG.7t\u0016,\\GEt}\f\u0015oa7\u0016g6W^#PHP,i\u0011u9\u001d\u0011a\u000e-8\t\u0007C>2nQH\u001f\u0015j\u0015", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri&m)=,P7m\u001e\u001b#hnJ\u0007p\u0002", "2n]2", "", "=m2.a*>Z", "=m3<j5", ">nX;g", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "=m3<j5\u0006Y`M\u0002Jvd", "uI\u0018#", "=m3?T.", "2d[AT", "=m3?T.\u0006Y`M\u0002Jvd", "=mBAT9M", "AsP?g\u0017HW\"\u000e", "=mBAT9M\u001b\u001fFIe\u0018Gp", "=mBAb7", "=mD=", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class C05831 implements TextDragObserver {
        final /* synthetic */ boolean $isStartHandle;
        final /* synthetic */ SelectionManager this$0;

        C05831(boolean z2, SelectionManager selectionManager) {
            z = z2;
            selectionManager = selectionManager;
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        /* JADX INFO: renamed from: onDown-k-4lQ0M */
        public void mo1395onDownk4lQ0M(long j2) {
            LayoutCoordinates layoutCoordinates;
            Offset offsetM1710getStartHandlePosition_m7T9E = z ? selectionManager.m1710getStartHandlePosition_m7T9E() : selectionManager.m1709getEndHandlePosition_m7T9E();
            if (offsetM1710getStartHandlePosition_m7T9E != null) {
                offsetM1710getStartHandlePosition_m7T9E.m3947unboximpl();
                Selection selection = selectionManager.getSelection();
                if (selection == null) {
                    return;
                }
                Selectable anchorSelectable$foundation_release = selectionManager.getAnchorSelectable$foundation_release(z ? selection.getStart() : selection.getEnd());
                if (anchorSelectable$foundation_release == null || (layoutCoordinates = anchorSelectable$foundation_release.getLayoutCoordinates()) == null) {
                    return;
                }
                long jMo1666getHandlePositiondBAh8RU = anchorSelectable$foundation_release.mo1666getHandlePositiondBAh8RU(selection, z);
                if (OffsetKt.m3958isUnspecifiedk4lQ0M(jMo1666getHandlePositiondBAh8RU)) {
                    return;
                }
                long jM1681getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m1681getAdjustedCoordinatesk4lQ0M(jMo1666getHandlePositiondBAh8RU);
                SelectionManager selectionManager = selectionManager;
                selectionManager.m1699setCurrentDragPosition_kEHs6E(Offset.m3926boximpl(selectionManager.requireContainerCoordinates$foundation_release().mo5523localPositionOfR5De75A(layoutCoordinates, jM1681getAdjustedCoordinatesk4lQ0M)));
                selectionManager.setDraggingHandle(z ? Handle.SelectionStart : Handle.SelectionEnd);
                selectionManager.setShowToolbar$foundation_release(false);
            }
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        /* JADX INFO: renamed from: onStart-k-4lQ0M */
        public void mo1397onStartk4lQ0M(long j2) {
            if (selectionManager.getDraggingHandle() == null) {
                return;
            }
            Selection selection = selectionManager.getSelection();
            Intrinsics.checkNotNull(selection);
            Selectable selectable = selectionManager.selectionRegistrar.getSelectableMap$foundation_release().get((z ? selection.getStart() : selection.getEnd()).getSelectableId());
            if (selectable == null) {
                throw new IllegalStateException("SelectionRegistrar should contain the current selection's selectableIds".toString());
            }
            Selectable selectable2 = selectable;
            LayoutCoordinates layoutCoordinates = selectable2.getLayoutCoordinates();
            if (layoutCoordinates == null) {
                throw new IllegalStateException("Current selectable should have layout coordinates.".toString());
            }
            long jMo1666getHandlePositiondBAh8RU = selectable2.mo1666getHandlePositiondBAh8RU(selection, z);
            if (OffsetKt.m3958isUnspecifiedk4lQ0M(jMo1666getHandlePositiondBAh8RU)) {
                return;
            }
            long jM1681getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m1681getAdjustedCoordinatesk4lQ0M(jMo1666getHandlePositiondBAh8RU);
            SelectionManager selectionManager = selectionManager;
            selectionManager.m1700setDragBeginPositionk4lQ0M(selectionManager.requireContainerCoordinates$foundation_release().mo5523localPositionOfR5De75A(layoutCoordinates, jM1681getAdjustedCoordinatesk4lQ0M));
            selectionManager.m1701setDragTotalDistancek4lQ0M(Offset.Companion.m3953getZeroF1C5BW0());
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        /* JADX INFO: renamed from: onDrag-k-4lQ0M */
        public void mo1396onDragk4lQ0M(long j2) {
            if (selectionManager.getDraggingHandle() == null) {
                return;
            }
            SelectionManager selectionManager = selectionManager;
            selectionManager.m1701setDragTotalDistancek4lQ0M(Offset.m3942plusMKHz9U(selectionManager.m1708getDragTotalDistanceF1C5BW0$foundation_release(), j2));
            long jM3942plusMKHz9U = Offset.m3942plusMKHz9U(selectionManager.m1707getDragBeginPositionF1C5BW0$foundation_release(), selectionManager.m1708getDragTotalDistanceF1C5BW0$foundation_release());
            if (selectionManager.m1712updateSelectionqNKwrvQ$foundation_release(Offset.m3926boximpl(jM3942plusMKHz9U), selectionManager.m1707getDragBeginPositionF1C5BW0$foundation_release(), z, SelectionAdjustment.Companion.getCharacterWithWordAccelerate())) {
                selectionManager.m1700setDragBeginPositionk4lQ0M(jM3942plusMKHz9U);
                selectionManager.m1701setDragTotalDistancek4lQ0M(Offset.Companion.m3953getZeroF1C5BW0());
            }
        }

        private final void done() {
            selectionManager.setShowToolbar$foundation_release(true);
            selectionManager.setDraggingHandle(null);
            selectionManager.m1699setCurrentDragPosition_kEHs6E(null);
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        public void onUp() {
            done();
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        public void onStop() {
            done();
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        public void onCancel() {
            done();
        }
    }

    public final TextDragObserver handleDragObserver(boolean z2) {
        return new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.SelectionManager.handleDragObserver.1
            final /* synthetic */ boolean $isStartHandle;
            final /* synthetic */ SelectionManager this$0;

            C05831(boolean z22, SelectionManager this) {
                z = z22;
                selectionManager = this;
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* JADX INFO: renamed from: onDown-k-4lQ0M */
            public void mo1395onDownk4lQ0M(long j2) {
                LayoutCoordinates layoutCoordinates;
                Offset offsetM1710getStartHandlePosition_m7T9E = z ? selectionManager.m1710getStartHandlePosition_m7T9E() : selectionManager.m1709getEndHandlePosition_m7T9E();
                if (offsetM1710getStartHandlePosition_m7T9E != null) {
                    offsetM1710getStartHandlePosition_m7T9E.m3947unboximpl();
                    Selection selection = selectionManager.getSelection();
                    if (selection == null) {
                        return;
                    }
                    Selectable anchorSelectable$foundation_release = selectionManager.getAnchorSelectable$foundation_release(z ? selection.getStart() : selection.getEnd());
                    if (anchorSelectable$foundation_release == null || (layoutCoordinates = anchorSelectable$foundation_release.getLayoutCoordinates()) == null) {
                        return;
                    }
                    long jMo1666getHandlePositiondBAh8RU = anchorSelectable$foundation_release.mo1666getHandlePositiondBAh8RU(selection, z);
                    if (OffsetKt.m3958isUnspecifiedk4lQ0M(jMo1666getHandlePositiondBAh8RU)) {
                        return;
                    }
                    long jM1681getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m1681getAdjustedCoordinatesk4lQ0M(jMo1666getHandlePositiondBAh8RU);
                    SelectionManager selectionManager = selectionManager;
                    selectionManager.m1699setCurrentDragPosition_kEHs6E(Offset.m3926boximpl(selectionManager.requireContainerCoordinates$foundation_release().mo5523localPositionOfR5De75A(layoutCoordinates, jM1681getAdjustedCoordinatesk4lQ0M)));
                    selectionManager.setDraggingHandle(z ? Handle.SelectionStart : Handle.SelectionEnd);
                    selectionManager.setShowToolbar$foundation_release(false);
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* JADX INFO: renamed from: onStart-k-4lQ0M */
            public void mo1397onStartk4lQ0M(long j2) {
                if (selectionManager.getDraggingHandle() == null) {
                    return;
                }
                Selection selection = selectionManager.getSelection();
                Intrinsics.checkNotNull(selection);
                Selectable selectable = selectionManager.selectionRegistrar.getSelectableMap$foundation_release().get((z ? selection.getStart() : selection.getEnd()).getSelectableId());
                if (selectable == null) {
                    throw new IllegalStateException("SelectionRegistrar should contain the current selection's selectableIds".toString());
                }
                Selectable selectable2 = selectable;
                LayoutCoordinates layoutCoordinates = selectable2.getLayoutCoordinates();
                if (layoutCoordinates == null) {
                    throw new IllegalStateException("Current selectable should have layout coordinates.".toString());
                }
                long jMo1666getHandlePositiondBAh8RU = selectable2.mo1666getHandlePositiondBAh8RU(selection, z);
                if (OffsetKt.m3958isUnspecifiedk4lQ0M(jMo1666getHandlePositiondBAh8RU)) {
                    return;
                }
                long jM1681getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m1681getAdjustedCoordinatesk4lQ0M(jMo1666getHandlePositiondBAh8RU);
                SelectionManager selectionManager = selectionManager;
                selectionManager.m1700setDragBeginPositionk4lQ0M(selectionManager.requireContainerCoordinates$foundation_release().mo5523localPositionOfR5De75A(layoutCoordinates, jM1681getAdjustedCoordinatesk4lQ0M));
                selectionManager.m1701setDragTotalDistancek4lQ0M(Offset.Companion.m3953getZeroF1C5BW0());
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* JADX INFO: renamed from: onDrag-k-4lQ0M */
            public void mo1396onDragk4lQ0M(long j2) {
                if (selectionManager.getDraggingHandle() == null) {
                    return;
                }
                SelectionManager selectionManager = selectionManager;
                selectionManager.m1701setDragTotalDistancek4lQ0M(Offset.m3942plusMKHz9U(selectionManager.m1708getDragTotalDistanceF1C5BW0$foundation_release(), j2));
                long jM3942plusMKHz9U = Offset.m3942plusMKHz9U(selectionManager.m1707getDragBeginPositionF1C5BW0$foundation_release(), selectionManager.m1708getDragTotalDistanceF1C5BW0$foundation_release());
                if (selectionManager.m1712updateSelectionqNKwrvQ$foundation_release(Offset.m3926boximpl(jM3942plusMKHz9U), selectionManager.m1707getDragBeginPositionF1C5BW0$foundation_release(), z, SelectionAdjustment.Companion.getCharacterWithWordAccelerate())) {
                    selectionManager.m1700setDragBeginPositionk4lQ0M(jM3942plusMKHz9U);
                    selectionManager.m1701setDragTotalDistancek4lQ0M(Offset.Companion.m3953getZeroF1C5BW0());
                }
            }

            private final void done() {
                selectionManager.setShowToolbar$foundation_release(true);
                selectionManager.setDraggingHandle(null);
                selectionManager.m1699setCurrentDragPosition_kEHs6E(null);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
                done();
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                done();
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
                done();
            }
        };
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionManager$detectNonConsumingTap$2 */
    /* JADX INFO: compiled from: SelectionManager.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001I(*QR&u8'$hn\u0019\u0018c5]d%QWN\u0002"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0014\u0006\u001a\u0017Q\u0018\u000b\u0013\r\f\u001e\u0014\u001b\u001b[\u0002\u0015\u001d\u0017\u0016(\u001e%%\u0005\u001a(\u001c#\"0b$&6('9\u001466\f99?B;8>8&4Dx\b", f = " 17/,<053\u0011$0\"'$0j'/", i = {}, l = {739}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class C05822 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Offset, Unit> $onTap;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C05822(Function1<? super Offset, Unit> function1, Continuation<? super C05822> continuation) {
            super(2, continuation);
            this.$onTap = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C05822 c05822 = new C05822(this.$onTap, continuation);
            c05822.L$0 = obj;
            return c05822;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((C05822) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = TapGestureDetectorKt.waitForUpOrCancellation$default((AwaitPointerEventScope) this.L$0, null, this, 1, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            PointerInputChange pointerInputChange = (PointerInputChange) obj;
            if (pointerInputChange != null) {
                this.$onTap.invoke(Offset.m3926boximpl(pointerInputChange.m5385getPositionF1C5BW0()));
            }
            return Unit.INSTANCE;
        }
    }

    public final Object detectNonConsumingTap(PointerInputScope pointerInputScope, Function1<? super Offset, Unit> function1, Continuation<? super Unit> continuation) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new C05822(function1, null), continuation);
        return objAwaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1 */
    /* JADX INFO: compiled from: SelectionManager.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018' xp'\u0005m7NL"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0014\u0006\u001a\u0017Q\u0018\u000b\u0013\r\f\u001e\u0014\u001b\u001b[\u0002\u0015\u001d\u0017\u0016(\u001e%%\u0005\u001a(\u001c#\"0b//\u0005/)&8\u001a-5/.@6==\"6CH9HJ<<|\u000b", f = " 17/,<053\u0011$0\"'$0j'/", i = {}, l = {746}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class C05841 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $block;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05841(Function0<Unit> function0, Continuation<? super C05841> continuation) {
            super(2, continuation);
            this.$block = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C05841 c05841 = SelectionManager.this.new C05841(this.$block, continuation);
            c05841.L$0 = obj;
            return c05841;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
            return ((C05841) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1$1 */
        /* JADX INFO: compiled from: SelectionManager.kt */
        /* JADX INFO: loaded from: classes2.dex */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,i\bӵLc\u000b\u0004I\u00066\u000b<Ȑ\u0017\"Z\u0011(\u000btjQ0rf\u000f6ʂW,\u0015m\n7"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "7me<^,\u0006Y`M\u0002Jvd", "uI\u0018#"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        static final class C00661 extends Lambda implements Function1<Offset, Unit> {
            final /* synthetic */ Function0<Unit> $block;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00661(Function0<Unit> function0) {
                super(1);
                function0 = function0;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                m1716invokek4lQ0M(offset.m3947unboximpl());
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke-k-4lQ0M */
            public final void m1716invokek4lQ0M(long j2) {
                function0.invoke();
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                this.label = 1;
                if (SelectionManager.this.detectNonConsumingTap(pointerInputScope, new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.onClearSelectionRequested.1.1
                    final /* synthetic */ Function0<Unit> $block;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C00661(Function0<Unit> function0) {
                        super(1);
                        function0 = function0;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                        m1716invokek4lQ0M(offset.m3947unboximpl());
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke-k-4lQ0M */
                    public final void m1716invokek4lQ0M(long j2) {
                        function0.invoke();
                    }
                }, this) == coroutine_suspended) {
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

    private final Modifier onClearSelectionRequested(Modifier modifier, Function0<Unit> function0) {
        return getHasFocus() ? SuspendingPointerInputFilterKt.pointerInput(modifier, Unit.INSTANCE, new C05841(function0, null)) : modifier;
    }

    /* JADX INFO: renamed from: convertToContainerCoordinates-R5De75A */
    public final long m1697convertToContainerCoordinatesR5De75A(LayoutCoordinates layoutCoordinates, long j2) {
        LayoutCoordinates layoutCoordinates2 = this.containerLayoutCoordinates;
        return (layoutCoordinates2 == null || !layoutCoordinates2.isAttached()) ? Offset.Companion.m3952getUnspecifiedF1C5BW0() : requireContainerCoordinates$foundation_release().mo5523localPositionOfR5De75A(layoutCoordinates, j2);
    }

    /* JADX INFO: renamed from: startSelection-9KIMszo */
    public final void m1704startSelection9KIMszo(long j2, boolean z2, SelectionAdjustment selectionAdjustment) {
        this.previousSelectionLayout = null;
        m1711updateSelectionjyLRC_s$foundation_release(j2, Offset.Companion.m3952getUnspecifiedF1C5BW0(), z2, selectionAdjustment);
    }

    /* JADX INFO: renamed from: updateSelection-qNKwrvQ$foundation_release */
    public final boolean m1712updateSelectionqNKwrvQ$foundation_release(Offset offset, long j2, boolean z2, SelectionAdjustment selectionAdjustment) {
        if (offset == null) {
            return false;
        }
        return m1711updateSelectionjyLRC_s$foundation_release(offset.m3947unboximpl(), j2, z2, selectionAdjustment);
    }

    /* JADX INFO: renamed from: updateSelection-jyLRC_s$foundation_release */
    public final boolean m1711updateSelectionjyLRC_s$foundation_release(long j2, long j3, boolean z2, SelectionAdjustment selectionAdjustment) {
        setDraggingHandle(z2 ? Handle.SelectionStart : Handle.SelectionEnd);
        m1699setCurrentDragPosition_kEHs6E(Offset.m3926boximpl(j2));
        SelectionLayout selectionLayoutM1698getSelectionLayoutWko1d7g = m1698getSelectionLayoutWko1d7g(j2, j3, z2);
        if (!selectionLayoutM1698getSelectionLayoutWko1d7g.shouldRecomputeSelection(this.previousSelectionLayout)) {
            return false;
        }
        Selection selectionAdjust = selectionAdjustment.adjust(selectionLayoutM1698getSelectionLayoutWko1d7g);
        if (!Intrinsics.areEqual(selectionAdjust, getSelection())) {
            selectionChanged(selectionLayoutM1698getSelectionLayoutWko1d7g, selectionAdjust);
        }
        this.previousSelectionLayout = selectionLayoutM1698getSelectionLayoutWko1d7g;
        return true;
    }

    /* JADX INFO: renamed from: getSelectionLayout-Wko1d7g */
    private final SelectionLayout m1698getSelectionLayoutWko1d7g(long j2, long j3, boolean z2) {
        LayoutCoordinates layoutCoordinatesRequireContainerCoordinates$foundation_release = requireContainerCoordinates$foundation_release();
        List<Selectable> listSort = this.selectionRegistrar.sort(layoutCoordinatesRequireContainerCoordinates$foundation_release);
        final MutableLongIntMap mutableLongIntMapMutableLongIntMapOf = LongIntMapKt.mutableLongIntMapOf();
        int size = listSort.size();
        for (int i2 = 0; i2 < size; i2++) {
            mutableLongIntMapMutableLongIntMapOf.set(listSort.get(i2).getSelectableId(), i2);
        }
        SelectionLayoutBuilder selectionLayoutBuilder = new SelectionLayoutBuilder(j2, j3, layoutCoordinatesRequireContainerCoordinates$foundation_release, z2, OffsetKt.m3958isUnspecifiedk4lQ0M(j3) ? null : getSelection(), new Comparator() { // from class: androidx.compose.foundation.text.selection.SelectionManager$getSelectionLayout-Wko1d7g$$inlined$compareBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t3) {
                return ComparisonsKt.compareValues(Integer.valueOf(mutableLongIntMapMutableLongIntMapOf.get(((Number) t2).longValue())), Integer.valueOf(mutableLongIntMapMutableLongIntMapOf.get(((Number) t3).longValue())));
            }
        }, null);
        int size2 = listSort.size();
        for (int i3 = 0; i3 < size2; i3++) {
            listSort.get(i3).appendSelectableInfoToBuilder(selectionLayoutBuilder);
        }
        return selectionLayoutBuilder.build();
    }

    private final void selectionChanged(SelectionLayout selectionLayout, Selection selection) {
        HapticFeedback hapticFeedback;
        if (shouldPerformHaptics$foundation_release() && (hapticFeedback = this.hapticFeedBack) != null) {
            hapticFeedback.mo4906performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m4915getTextHandleMove5zf0vsI());
        }
        this.selectionRegistrar.setSubselections(selectionLayout.createSubSelections(selection));
        this.onSelectionChange.invoke(selection);
    }

    public final boolean shouldPerformHaptics$foundation_release() {
        if (!isInTouchMode()) {
            return false;
        }
        List<Selectable> selectables$foundation_release = this.selectionRegistrar.getSelectables$foundation_release();
        int size = selectables$foundation_release.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (selectables$foundation_release.get(i2).getText().length() > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: contextMenuOpenAdjustment-k-4lQ0M */
    public final void m1705contextMenuOpenAdjustmentk4lQ0M(long j2) {
        Selection selection = getSelection();
        if (selection != null ? TextRange.m6117getCollapsedimpl(selection.m1672toTextRanged9O1mEE()) : true) {
            m1704startSelection9KIMszo(j2, true, SelectionAdjustment.Companion.getWord());
        }
    }
}
