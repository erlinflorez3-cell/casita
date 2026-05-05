package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.content.TransferableContent;
import androidx.compose.foundation.content.TransferableContent_androidKt;
import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextFieldCursorKt;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextFieldCharSequenceKt;
import androidx.compose.foundation.text.input.internal.IndexTransformationType;
import androidx.compose.foundation.text.input.internal.MathUtilsKt;
import androidx.compose.foundation.text.input.internal.SelectionWedgeAffinity;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TextLayoutStateKt;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.WedgeAffinity;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.foundation.text.selection.SelectionGesturesKt;
import androidx.compose.foundation.text.selection.SelectionHandlesKt;
import androidx.compose.foundation.text.selection.SelectionLayout;
import androidx.compose.foundation.text.selection.SelectionLayoutKt;
import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.foundation.text.selection.TextSelectionDelegateKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import cz.msebera.android.httpclient.HttpStatus;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
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
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message tag had invalid wire type.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidWireType(InvalidProtocolBufferException.java:99)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:268)
    	at kotlin.metadata.internal.protobuf.GeneratedMessageLite.parseUnknownField(GeneratedMessageLite.java:73)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:110)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 5 more
    */
/* JADX INFO: compiled from: TextFieldSelectionState.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯŃ\u0014D57\u001eq\u007fR܀kŞ\fA\u001c0\u0013ǞJ~8,\u001aՄ\u000ff\u000198ǏmH<[[*\u0015n\u00044:[,ڎK;k\u001a\u0006\"\u000fPVg}nRZ\u0011H\u0017\u0006,xr,O_\u0001](\u000f:BuC;M\u0006=Aś|6\u0013&:Ĳ@y\u001b\u0001\"*N\u0014~zYK\u0014\u0012F@x:X\u0018U\u00050\u0012\u000e>&\u0002&\\}N>H\u0003]B/)\fqB\\'g0\u0003Q\u0015Fj'\u0015Ǹi\u001eA@?5\u001b-[\u0003\u001dRc?\tAy=\u001bh/'1d{WLX\b\u0014\u001b1W\rsr.\\\u000bUh\f=+WcQY\u0014ߊ\u000e\u07be,\rj\u0003F\nϕG\u0380,խeHICx\u0001SXP0_R\u0004\tcN\u0017S\u0003C/G\u001f~Q\u0010@)RE\u0002\u001d\rL*\u0011r/cl\u000e\u000f\u001c+X\u0006ZIQnDXR\u0018cUm2wĊ\u0006*\u0012;\u0010\u0004=Q).E,\u007f_Gy9k0O\rk\u0005\\xh\u0002p\u001bLNz\u0007\u0016e1Q\u0010h\u001e|\u0005\u001a+\u001df:le\u001c\u0003a.\u000e\u0019 jTT!S\u0017\u0017SvG\u0003M\fdm3t\u0016qn\u001ah =l\u0013MQ\u0012j*X\u0005tW<\u0011f\u001ff\u000bf\u001a=t(P\u0016xn\u001e\\\u0014D|\u0013YԵƐu\u001c:\u0012y\u001dj{`\u0003L$\n\u0018\u0017Grh>\u000e\u000572k\u0002$#\u0010GP̍onИw̢ض\u0001b(\u0017O<}44A:hb`S\u000b\r\\\u0018G\u0016SwPzz\u000eU*'\\֝\u07fcU/C\u007fW97 \u001a-s;#i_=*').*\u0013IYFg6\u001c!2n\\bQj\u0016Pe\u000fv1p|\u007f(hv~UVl\u000b\n2\u0010rľXߢҡ<~\u000b\u0014,\u001bIu0sM-q\u0002c\u0016@\u001a=\ry]\u0018vty+\u00154m}\u0004Z>\\o+\u0001k,S@Y[\u000f>P~\u0003\u0002p\u0003\u001b{\u0016H!4;:xErkn8{Y_\nl\t:\t\t\\k<#o,\u000f\\\u001apϕIF l@=\u0011{..ơ,љ`\u000bX\rR\u0018\nσm*\u001ckz\u001d̳!ס4\u0006\u0002\u0016~NIآ\u0004T\tR\u000frчFդGTw\u0004X\u007f\u000eʎ^'\u0017`\u001d<BdՙS\u0011\\\u0005#K`\u000e|/Ʀ\u007f\u0017\u000fa%):?ܐl^T]rx\u0001Ԯ\u001c̿ƨnS\u0005݁$9פS\u0002 6߹\u007f#E\f\u001e\u0012\u0012D߮FAm\u001aJ<=&Ԉ\u001cZ\u0018I\u001b\u0018\u0011(4>ͨ\nmd|?'\u0016tyf\"W'+\u0001\u001cH\"\u000f9&\u007fv}/EL|EgG(\u0005/DW\f<\u0001qL3-4<]AWr,'*^\u0004?\f\u00128 U\u000b=Dj\u07b3\r~\n\fuj\u001b\u007fтa\u001a\tAkP\t<،s\u000b\n\\\u0017̿N\u05ceג\u0006\u0017d̟j\u0006̋?o\u0004zݻAch'x\u0014rq߮T#\u0004\u0015܆U*s;ǵ\u001c!'{_C]hϦ\u0010k \u0007B0\u0018#\u000f766iY\u0014]V\u0001p\u001aC\f\u00141/yˢ`I0\u0001%.&\u007fu\u0012նS@\u0015i]\u0014>Ʋ\b[إAĠеbn.̈s\u001aã\u0013E\fVո\u0010+4tMNh=\u00071\u001f\n[\u0010s\u0015ʳDa&O\fz@Iν1Q§f϶\u0015\u0004HťsH=P֛q\u0018gZ\bnUkՀ& ށ,҉\u0007'YԵ7\u000b#:ז\r)/\t\u0013H?\u000bӧ\u001bkUA*1\u0011/\u001c~ې.߁\u001d6xܯRmg\u000fϗ\u007f%?(\f\u0014;\"ٟqS7\u001dΘ\u001aoiQ$cֱKW\u0017\u0010ʫI\u0017SsX\u001faZ$c\u007fN\u0005c˔~\"%4&\u0016uQZsk\u000f߲\u001eЪDW\u0002ӹ\u0003n=D˼C;G\u001bS\u001c\u000bZʳ\u0017:߱\u001aɈ8B\t\u008a\u0018\rY8̞k\u001fE{C\"\frՖDD;\u001dnA3E\u0004Vވ0̂/J\u0001٪.%\u007fJΒr\u001c:`<^zuʼXZ\u0011;¿S{pzoa_>\u0013@GSՄ6ٽVa\u000eѮ\u001ch5Y\u0003^8rw{N9ޔLǦ(^6˷\\#\u0014$FHE\u00114\u000b7ŋ\u0015ҝFؓߖF\u0011\u0382\u007f%5\u0013a5\u001468vUCmq\u0007B\u0010ߕ\u0017ǮNX=ƶ-.c5cdY(0n9@_Vl-`\u001dDR\u001cŀй\u0010ͭ|T0o6I>j\u0017\\Ir\u000f2??[,s\u0017\u0003\u0010Ew|\u0013A6\u0006\n\u0003[1?\u0011\u0004\u0019\u000fo4IO\\\u0018\u0010ޮ\u05cesԿ5N\u0004\nbjc\u0017\u0006K\u0016 ohA1\f^=a\u001c~d\bW\u0019\u0006F5LvΗ&ˊ\u0017(zi\u0019\r\u001cF0\u000fZ<n)vR0˷r߁n\u000f\u0003Ǟ\\C\u001a]m\u0006k\u0015G'ˈ4ģޣ?+ɋt\r_Qp\"8v@t\u0003\u0001eGAtGf\bޤ\u001d̑S_\u001cש\"tfG/WTGi˲&ݑ*m\u0004śA2\u001d^q\u0012\u000buZ\n\u001f\u0004\u0005\u0015>\u0010\u0012r\u0015kngLN`lGm\u0006BY\u0016\u001bЅŊ`\u0382LQ\u0018drY5P`l\u001f,\u000fo\u0002\u0019\u001acR!ssAD:aPZ4ՎSͩ\n\u000er˄H#\n\fK8#nZ,kѢJܯv\u0004t϶\u001e<\u0012\u001cG2t\f\u0017˻9ނ+mpǙz\u001c\u001a/\u001d.\u0005R\u0001\u0005Lظ~կ\u0003#&֦\u0012\u0007G{9\u00131(l\f@_pz\u001dg\u0013el<\\ƫ˘Bݦ4Ζσrz٬[\u0002W6cV7\u0018\u0002y&By#$ePY]!3\u001dk6ew5`\u0013հMӫ\u000e\"1ͣX75;`>Z62%\u0017\u000edS`e\u001d3{ߖq\u05eb3\u0001}ʴJoD0t\u001b\b6G{c\u001dOn;o\n\byP\u001e\u00039Y&IDA\u0006\r,62ʘԧ\u0016ߵ\u000b\u007f\f3\u00167nuZ\u0019}IpX\f<\u0002\n\u0011>;z<^rf\u001d{'To\"U\u0016;#;~2iyՏЁ_ЩfՐŜ\boǛ;aMf\u0011\f\u001fBx4DW\u001dYxh\u0014a\u0010<\u001cp(\u0016QE'A\"ч]\u0090kcYڲ8\\ypG\f\u000e\u0015df6u\u0010ΕuЈb9\u007f`\u000f 1Ywz]\n\n0`J4Ф\"ˋ_\b\u0016ε7Z^YY\t\u0003-%DI̡Kʲ\u0006*Mڨmlsh\u007f\u0005d;kave|zL=\u0012\u001cepTօÙ\u0013Ֆ#&\u0016&\u000eT\u0003uLQ{QN\u001a3\u000e \u0016<[ä\u0005nT\b;Ȍ]_>[p\u001fJѥcȵA"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@Pq,Uv%VPX5&ArP#r^\u000eU*z\u0005`A\"}HA(u;E\u0011;>", "", "BdgA90>Z\u0018l\nZ;|", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR9J\u007f5HV[4\\Qa='!;\u0012N2\frh=3n\u001a", "BdgA?(R])\u000ehm(\f\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR,a\u0006\u000eC`X<k@\u00029#\u00120", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "3mP/_,=", "", "@dP1B5Eg", "7r5<V<LS\u0018", "7r?.f:P]&}", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001q\u001f9]R\u0005o=-\u0015uj5\u000e-\u001b[r0UMX9dRq,\u0014%inR+\u0014\u0004GP }D\r\u0006\u00045H\u000fEl\u007f\u001f_\f?r{Ld\u0010\u0011z\u001f\u0006J(dU]i\u0003\u0011PEu9.\u0010h(lI\u0004(\u001d\u0001\u0019(qL5SjS$\u00029u{qW(hG Mm1-AxTI~+\u001e^Eu\u001c:c~9tv\u00148sFm\tZ1v>g\u0007\u0019;p\u0017\u001c\u001b+1V0", "1kX=U6:`\u0018fvg(~\t<", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0013`\u0002+4w\u0012;L+7t0 \u0015u7", "1ta?X5MB\u0019\u0012\nE(\u0011\u0013?tj2\nD\u0010\u001b!PS\u0017.z.4c\u0010", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "5dc\u0010h9KS\"\u000ei^?\fo+y\n8\u000b+\u000b%\u001bVs\u0018EZ.']\u0007\u001fA\u007f]\u000f\u0019!\u000bH&h", "u(9", "\nrTA \u0006\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@Pq,Uv%VPX5&ArP#r^\u000eU*z\u0005`A\"}HA(u;E\u0011;'d\u0015!\u001eDY\u0005MVe", "2ha2V;\u001d`\u0015\u0001\\^:\f\u0019<ec1\u007fO\u0005\u0013&Q|", "5dc\u0011\\9>Q(]\bZ.^\t=t\u00105{$\n\u001b&Kk\u001dF\u0004", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7\u001a7XSJ58'$hnB\u0003ju\\v.GJ]0f[<,\u0014%inR+\u0014\u0004GA+nBF#\u001257\u00117w\u0001Jy\u0017@z\u007f1j\u001bGO", "Adc\u0011\\9>Q(]\bZ.^\t=t\u00105{$\n\u001b&Kk\u001dF\u0004", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001q\u001f9]R\u0005o=-\u0015uj5\u000e-:N}'E[R6e\u001ca='!;\u0012N2\frYH$lS;)\u0011\u001aX}Jh?o\u001f\u0019Ey_Va\u0010\u001d=\u0006", "2ha2V;\u001d`\u0015\u0001\\^:\f\u0019<ec1\u007fO\u0005\u0013&Q|L;v,5[y/7", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri\u001ai\u001f-TC\u0011", "2qP4Z0GU{z\u0004]3|", "5dc\u0011e(@U\u001d\b|A(\u0006\b6e", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7x*VBBk\n", "Adc\u0011e(@U\u001d\b|A(\u0006\b6e", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001P\u00127LJ;Aw\u000f", "2qP4Z0GU{z\u0004]3|G.e\u0007(}<\u0010\u0017", "3cXAT)ES", "5dc\u0012W0MO\u0016\u0006z", "u(I", "6`]1_,\u001d`\u0015\u0001eh:\u0001\u00183o\t", "5dc\u0015T5=Z\u0019]\bZ.g\u0013=i\u000f,\u0006IHwb%?j.A", "6`_A\\*\u001fS\u0019}WZ*\u0003", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0004\u0013\"Vs\f=v%4Vy\u001e=7x*XR?i\u0015\u001e\u0015g^5\u0005i\u0002", "Adc\u0013b*Na\u0019}", "uY\u0018#", "7r8;G6NQ\u001cf\u0005],", "Adc\u0016a\u001bHc\u0017\u0002bh+|", "7r8;G6NQ\u001cf\u0005],;\b/l\u007f*wO\u0001", ">qT@f\u0010Gb\u0019\fv\\;\u0001\u00138", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005VA\u001e#vEB\u0016c9Jt6KVWjG_rK\"g", ">qTC\\6Na\u0006z\r=9x\u000b\u0019f\u00016{O", "", ">qTC\\6Na\u0007~\u0002^*\f\r9nf$\u0010J\u0011&", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r0X\u007f\u000eC`X<k(", "@`f\u0015T5=Z\u0019]\bZ.g\u0013=i\u000f,\u0006I", "5dc\u001fT>!O\"}\u0002^\u000b\n\u00051P\n6\u007fO\u0005! \u000fPY\u001aF\u0002'$", "Adc\u001fT>!O\"}\u0002^\u000b\n\u00051P\n6\u007fO\u0005! \u000fuU\u000b}\u0011\u007fA", "uI\u0018#", "@`f\u0015T5=Z\u0019]\bZ.g\u0013=i\u000f,\u0006I?\u0016\u0017No\u00108\u0006%", "@dR2\\=>1#\b\n^5\ff9n\u0001,}P\u000e\u0013&Ky\u0017", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@#?b\r @|_2VR;x=\u001a\u001c2N9\u0005c0_v\u0005QU],eaPG\u001d\u0013^\u0010^8\t\u0014]K-D", "5dc\u001fX*>W*~Xh5\f\t8t]2\u0005A\u0005\u0019'Tk\u001d@\u0001.", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHu", "Adc\u001fX*>W*~Xh5\f\t8t]2\u0005A\u0005\u0019'Tk\u001d@\u0001.", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$Sc(", "Ag^D6<Ka#\f]Z5{\u0010/", "5dc [6P1)\f\th9_\u00058d\u0007(", "Adc [6P1)\f\th9_\u00058d\u0007(", "Ag^D6<Ka#\f]Z5{\u0010/$~(\u0003@\u0003\u0013&G", "AsP?g\u001b>f(evr6\r\u0018\u001ao\u000e,\u000bD\u000b zPa\u0012Eu/G", "5dc g(Kb\b~\u000em\u0013x\u001d9u\u000f\u0013\u0006N\u0005&\u001bQxqEh)>X\b2~Na\f\u001d -6", "Adc g(Kb\b~\u000em\u0013x\u001d9u\u000f\u0013\u0006N\u0005&\u001bQxqEh)>X\b2~s]|T/\u0006S", "AsP?g\u001b>f(evr6\r\u0018\u001ao\u000e,\u000bD\u000b zPa\u0012Eu/G\u0018| >m\u0018*\\C", "BdgA?(R])\u000eXh6\n\b3n{7{N", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/\u0015w ;LGDgC\u001e#>", "5dc!X?M:\u0015\u0013\u0005n;Z\u00139r~,\u0005<\u0010\u0017%", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n\u001cU\u0012*G|s8WP:o=\u001a$ho\u000f", "BdgAG6HZ\u0016z\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n$Y\u0011/&w 5J?HA", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@Pq,Uv%VPX5&ArP#\u0001d\u0018U(\t\u0012GP }D\r", "BdgAG6HZ\u0016z\bL;x\u0018/", "5dc!X?MB#\t\u0002[(\nv>a\u000f(", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7\u001a7XSJ58'$hnB\u0003ju\\v.GJ]0f[<,\u0014%i|X5\u0014\u0002UN\u0012}@F\u001f]", "Adc!X?MB#\t\u0002[(\nv>a\u000f(", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001q\u001f9]R\u0005o=-\u0015uj5\u000e-:N}'E[R6e\u001ca='!I\u0018X2\n\u0001f/3jS7tK\u001d", "BdgAG6HZ\u0016z\bL;x\u0018/$~(\u0003@\u0003\u0013&G", "1`]\u0010b7R", "1`]\u0010h;", "1`]\u001dT:MS", "1`] X3>Q(Z\u0002e", "1kT.e\u000f:\\\u0018\u0006z=9x\u000b1i\t*", "", "1n_F", "1`]0X3,S ~xm0\u0007\u0012", "1tc", "2db2_,<b", "2hb=b:>", "5dc\u0010b5MS\"\u000eg^*\f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "5dc\u0010h9L]&avg+\u0004\t\u001dt{7{", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@Pq,Uv%VPX5&ArP#r^\u000eU*o\u0001b@+n2F\u001b\u0017,\u001f", "7mR9h+>>#\r~m0\u0007\u0012", "5dc\u0010h9L]&avg+\u0004\t\u001dt{7{~\u0002!'Pn\nKz/>S\u000b >m\u0012<M", "5dc\u0010h9L]&kz\\;", "5dc\u0015T5=Z\u0019i\u0005l0\f\r9n", "7rBAT9M6\u0015\bye,", "5dc\u0015T5=Z\u0019i\u0005l0\f\r9nG7\f-p(\u001c3", "uY\u0018\u0017", "5dc X3>Q(\u0003\u0005g\u000fx\u0012.l\u007f\u0016\u000b<\u0010\u0017", "5dc X3>Q(\u0003\u0005g\u000fx\u0012.l\u007f\u0016\u000b<\u0010\u0017UHy\u001eEu!D]\b)1z\u00165M?Ik", "5dc!X?M4\u001d~\u0002]\u001a|\u0010/c\u000f,\u0006I", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\"U\u0007\"7C", "@`f g(Kb\u0003\u007f{l,\f", "@`f\u0012a+(T\u001a\rzm", ">qTC\\6Na\u0007~\u0002^*\f\r9n", "/cYBf;FS\"\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r0X\u007f\u0003FQ^:kZrF#g", "5dc!X?M4\u001d~\u0002]\u001a|\u0010/c\u000f,\u0006IH#\u0017)i\u001f6|", "uH8\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`Vo!K@\u00145l\r\r3v\u0018.#8\"g=\u001d\"re8\u001a-*X~2QZNu]\\\u0003F\u0013\u000ei\u0012X4V\u0014YT38R7&\b*X\u0006EqJy\u0016\u00155h\u007fF`\u0019#x\u001a\u0006O8pFbnO\u000b&", "6hS2G,Qb\b\t\u0005e)x\u0016", "7r2Be:H`{z\u0004]3|l8V\u00046\u007f=\b\u0017sQ\u007f\u0017;\u0005", ";`a8F;:`(\\\u0005g;|\u0012>V\u00046\u007f=\b\u0017\u0001Hp\u001c<\u0006", ";d]B<;>[", "2db6e,=A(z\n^", "=oT?T;B]\"", "=ab2e=>1\u001cz\u0004`,\u000b", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "=ab2e=>B\u0019\u0012\n</x\u00121e\u000e", "=ab2e=>B\u0019\u0012\nM6\u0007\u0010,a\r\u0019\u007fN\u0005\u0014\u001bNs\u001dP", ">`bAX", ">`bAX\bL> z~g\u001b|\u001c>", ">kP0X\nN`'\t\b:;e\t+r\u007f6\u000b*\u0002\u0018%G~", "=eU@X;", ">kP0X\nN`'\t\b:;e\t+r\u007f6\u000b*\u0002\u0018%G~UB>s<EH\b", "uI\u0018'", "Ad[2V;\u001aZ ", "Ag^DG,Qb\b\t\u0005e)x\u0016", "1n]AX5M@\u0019|\n", "CoS.g,", "CoS.g,!O\"}\u0002^\u000b\n\u00051g\u00041}", "6`]1_,", ">nb6g0H\\", "CoS.g,!O\"}\u0002^\u000b\n\u00051g\u00041}\bp(iR:v\u0018", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001P\u00127LJ;A\u0019a\u0006", "CoS.g,,S ~xm0\u0007\u0012", "BdgA90>Z\u0018\\}Z9j\t;u\u007f1y@", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r*kG-ula@\u0006A/J\u0004\u0015GX^,ePr\u0013", "AsP?g\u0016?T'~\n", "3mS\u001cY-LS(", "/k[<j\u0017KS*\u0003\u0005n:j\t6e}7\u007fJ\nt!Nv\nG\u0005%4", "7rBAT9M=\u001alze,z\u00183o\t", "CoS.g,,S ~xm0\u0007\u0012vS\u000e\u000fC-\u0002i", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001q\u001f9]R\u0005Z41$Ie9\u000eb\nQr45LZ<\\[p=iu>\u00035'\u0016\u0004fK(mW\u0001\u001d\u00124T\fIhJ\r \u001e>ilQZ\u001aPC$uT82TYfyEPIl3.y_$\\8I(\u001ezt\u001am`<\u0019\u0004S\u001a\u0002(n\\+,", "CoS.g,-S,\u000eih6\u0004\u0006+rm7wO\u0001", "1ta@b9!O\"}\u0002^\u000e|\u0017>u\r(\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018' xp'\u0005m7NL", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001b R\u007f\u001d\u0006\u0002/9b\r D7\u00018QLJkA\u0002\u001esqHta6Yv|.RX;cV{\u0007\u0012\u001cg\u0018^:\u0011\u000eYOmLN@.\f5Y}Jl\u000b\u0015kQ\u001colSRYNu\u001ew\u000b\u0013eKY]\t\u001d", "2dc2V;\u001cc&\r\u0005k\u000fx\u0012.l\u007f\u0007\t<\u0003x\u0017U~\u001eIv3", "2dc2V;,S ~xm0\u0007\u0012\u0012a\t'\u0003@_$\u0013IQ\u000eJ\u00065BY\f", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001b R\u007f\u001d\u0006\u0002/9b\r D7\u00018QLJkA\u0002\u001esqHta6Yv|<3T6kYvF]\u0010d\u001bX;\u001c\tbA28\"A(\u00170R\u00127w\u0005\u0016\u001fcxQu>g\f\u0011\u0001\u0011~CrRC^_wV\u0017", "2dc2V;-S,\u000e[b,\u0004\b\u001ea\u000b\n{N\u0010'$G}", "7mc2e(<b\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005SD-\u0011eh9jl;N\u0004#E[R6e@|M!\u0010Zc", "@d`BX:M4#|\u000bl", "Ag^D>,RP#z\b]", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001b R\u007f\u001d\u0006\u0002/9b\r D7\u00018QLJkA\u0002\u001esqHta6Yv|.HW+i\\v<'[X\u0018V6\u0017\u0013Y\u000b%xT@\u001e\u0004;M\fD2\u0005\u0015%\u000eBfnQZ\u001aPC|\u0006P%eMYC\u0003VAR^(s\u0010i&JDJ1\u0012qn\u0002nZ=\u0011\u007f\\Zwc\u00021hW\"xG(Hvi\u0010&\u007f^:\u0004+)TFMx8b\u00042x6M9;>.\u0006[p\u0016Mb\u0003\u001e:&\"7/4K\u0017IT.KSD\u0018w&e\u0011W`?>#utgQ\u000f\u0015'te>pc\nGN\u0015BSxjj-\u0004>lu^\u0010\u0003-o/3@ T~)F", "2dc2V;-])|}F6{\t", "Ad[2V;B]\"avg+\u0004\t\u0011e\u000e7\fM\u0001%", "BdgA90>Z\u0018lze,z\u00183o\t\n{N\u0010'$G}", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001b R\u007f\u001d\u0006\u0002/9b\r D7\u00018QLJkA\u0002\u001esqHta6Yv|.RX;cV{\u0007\u0019#bWO;\u0016\u0003hE.wR\u0001\u007f\u00185G\u0011?r\nVkt;t\u007fIZ\u0019\u0011w\u001f\u0003K9wJb_\b\u0011\u001fOk9h\u0015o\u0019k>D-i5\u007f da*S\u0003O\u001at\u001ccdlG\u0017\n\u000e", "\u0017m_Bg\u001bR^\u0019", "\"dgA90>Z\u0018f\u0005n:|v/l\u007f&\u000bD\u000b \u0001D}\u000eI\b%B", "\"dgA90>Z\u0018mzq;[\u0016+gi%\n@\u000e(\u0017T", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TextFieldSelectionState {
    public static final int $stable = 8;
    private ClipboardManager clipboardManager;
    private Density density;
    private boolean enabled;
    private HapticFeedback hapticFeedBack;
    private boolean isFocused;
    private boolean isPassword;
    private PressInteraction.Press pressInteraction;
    private SelectionLayout previousSelectionLayout;
    private boolean readOnly;
    private Function0<? extends ReceiveContentConfiguration> receiveContentConfiguration;
    private final TransformedTextFieldState textFieldState;
    private final TextLayoutState textLayoutState;
    private TextToolbar textToolbar;
    private final MutableState isInTouchMode$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
    private final MutableState startTextLayoutPositionInWindow$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m3926boximpl(Offset.Companion.m3952getUnspecifiedF1C5BW0()), null, 2, null);
    private final MutableState rawHandleDragPosition$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m3926boximpl(Offset.Companion.m3952getUnspecifiedF1C5BW0()), null, 2, null);
    private final MutableState draggingHandle$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    private final MutableState directDragGestureInitiator$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(InputType.None, null, 2, null);
    private final MutableState showCursorHandle$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    private final MutableState textToolbarState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TextToolbarState.None, null, 2, null);
    private int previousRawDragOffset = -1;

    /* JADX INFO: compiled from: TextFieldSelectionState.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eRLcz\u0007Gّ/!Ǟr\u00052.\"w5߿\u00198pIkH¯VS8\u000fT{:%D$wE$U \u0001͆\rS"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@Pq,Uv%VPX5&ArP#r^\u000eU*z\u0005`A\"}HA(u;E\u0011;'d\u0015!\u001eDY\u0005MVe", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "\u001cn]2", "\"nd0[", "\u001bnd@X", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public enum InputType {
        None,
        Touch,
        Mouse
    }

    /* JADX INFO: compiled from: TextFieldSelectionState.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IndexTransformationType.values().length];
            try {
                iArr[IndexTransformationType.Untransformed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IndexTransformationType.Deletion.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IndexTransformationType.Insertion.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IndexTransformationType.Replacement.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$1 */
    /* JADX INFO: compiled from: TextFieldSelectionState.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0014\u0006\u001a\u0017Q\u000e\u0014\u0017\u001d\u001dW\u0014\u001a!\u0013!\u001e\u0012\u001e`'\u001a\"\u001c\u001b-#**j\u0012$85\b,)1*\u001a-5/.@6==#E3G9", f = "!1C>\u000f1,2)\u0017(.&#3',*\u000e.\u001a,\u001cc (", i = {0, 0, 0}, l = {614}, m = "35E76H\u0018KIKHL#=KBKE%TDK,KZ\\^\\P_", n = {"c^kY", "RktYah&Y7A9>8L3", "RktYah&Y7A*/CN "}, s = {"xQ^", "xQ_", "xQ`"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            int i2 = this.label;
            this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
            return TextFieldSelectionState.this.detectCursorHandleDragGestures(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectSelectionHandleDragGestures$1 */
    /* JADX INFO: compiled from: TextFieldSelectionState.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0014\u0006\u001a\u0017Q\u000e\u0014\u0017\u001d\u001dW\u0014\u001a!\u0013!\u001e\u0012\u001e`'\u001a\"\u001c\u001b-#**j\u0012$85\b,)1*\u001a-5/.@6==#E3G9", f = "!1C>\u000f1,2)\u0017(.&#3',*\u000e.\u001a,\u001cc (", i = {0, 0, 0, 0}, l = {980}, m = "35E76H(;C=<NDKK&@NENH(WGN/N]_a_Sb", n = {"c^kY", "ShcM4[IPD*U=@N(5!", "ShcMFeVHB\u001eO=K;-)\u0018", "WWpJ^["}, s = {"xQ^", "xQ_", "xQ`", "xQa"})
    static final class C05551 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C05551(Continuation<? super C05551> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TextFieldSelectionState.this.detectSelectionHandleDragGestures(null, false, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeChanges$1 */
    /* JADX INFO: compiled from: TextFieldSelectionState.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0014\u0006\u001a\u0017Q\u000e\u0014\u0017\u001d\u001dW\u0014\u001a!\u0013!\u001e\u0012\u001e`'\u001a\"\u001c\u001b-#**j\u0012$85\b,)1*\u001a-5/.@6==#E3G9", f = "!1C>\u000f1,2)\u0017(.&#3',*\u000e.\u001a,\u001cc (", i = {0}, l = {423}, m = ">2D7EJ:\u0019?9GA@O", n = {"c^kY"}, s = {"xQ^"})
    static final class C05641 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C05641(Continuation<? super C05641> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TextFieldSelectionState.this.observeChanges(this);
        }
    }

    public TextFieldSelectionState(TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, Density density, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.textFieldState = transformedTextFieldState;
        this.textLayoutState = textLayoutState;
        this.density = density;
        this.enabled = z2;
        this.readOnly = z3;
        this.isFocused = z4;
        this.isPassword = z5;
    }

    public final boolean isFocused() {
        return this.isFocused;
    }

    public final void setFocused(boolean z2) {
        this.isFocused = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isInTouchMode() {
        return ((Boolean) this.isInTouchMode$delegate.getValue()).booleanValue();
    }

    public final void setInTouchMode(boolean z2) {
        this.isInTouchMode$delegate.setValue(Boolean.valueOf(z2));
    }

    public final Function0<ReceiveContentConfiguration> getReceiveContentConfiguration() {
        return this.receiveContentConfiguration;
    }

    public final void setReceiveContentConfiguration(Function0<? extends ReceiveContentConfiguration> function0) {
        this.receiveContentConfiguration = function0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getStartTextLayoutPositionInWindow-F1C5BW0 */
    private final long m1600getStartTextLayoutPositionInWindowF1C5BW0() {
        return ((Offset) this.startTextLayoutPositionInWindow$delegate.getValue()).m3947unboximpl();
    }

    /* JADX INFO: renamed from: setStartTextLayoutPositionInWindow-k-4lQ0M */
    private final void m1604setStartTextLayoutPositionInWindowk4lQ0M(long j2) {
        this.startTextLayoutPositionInWindow$delegate.setValue(Offset.m3926boximpl(j2));
    }

    /* JADX INFO: renamed from: getCurrentTextLayoutPositionInWindow-F1C5BW0 */
    private final long m1597getCurrentTextLayoutPositionInWindowF1C5BW0() {
        LayoutCoordinates textLayoutCoordinates = getTextLayoutCoordinates();
        return textLayoutCoordinates != null ? LayoutCoordinatesKt.positionInWindow(textLayoutCoordinates) : Offset.Companion.m3952getUnspecifiedF1C5BW0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getRawHandleDragPosition-F1C5BW0 */
    private final long m1599getRawHandleDragPositionF1C5BW0() {
        return ((Offset) this.rawHandleDragPosition$delegate.getValue()).m3947unboximpl();
    }

    /* JADX INFO: renamed from: setRawHandleDragPosition-k-4lQ0M */
    private final void m1603setRawHandleDragPositionk4lQ0M(long j2) {
        this.rawHandleDragPosition$delegate.setValue(Offset.m3926boximpl(j2));
    }

    /* JADX INFO: renamed from: getHandleDragPosition-F1C5BW0 */
    public final long m1607getHandleDragPositionF1C5BW0() {
        if (OffsetKt.m3958isUnspecifiedk4lQ0M(m1599getRawHandleDragPositionF1C5BW0())) {
            return Offset.Companion.m3952getUnspecifiedF1C5BW0();
        }
        if (OffsetKt.m3958isUnspecifiedk4lQ0M(m1600getStartTextLayoutPositionInWindowF1C5BW0())) {
            return TextLayoutStateKt.m1559fromDecorationToTextLayoutUv8p0NA(this.textLayoutState, m1599getRawHandleDragPositionF1C5BW0());
        }
        return Offset.m3942plusMKHz9U(m1599getRawHandleDragPositionF1C5BW0(), Offset.m3941minusMKHz9U(m1600getStartTextLayoutPositionInWindowF1C5BW0(), m1597getCurrentTextLayoutPositionInWindowF1C5BW0()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Handle getDraggingHandle() {
        return (Handle) this.draggingHandle$delegate.getValue();
    }

    public final void setDraggingHandle(Handle handle) {
        this.draggingHandle$delegate.setValue(handle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final InputType getDirectDragGestureInitiator() {
        return (InputType) this.directDragGestureInitiator$delegate.getValue();
    }

    public final void setDirectDragGestureInitiator(InputType inputType) {
        this.directDragGestureInitiator$delegate.setValue(inputType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getShowCursorHandle() {
        return ((Boolean) this.showCursorHandle$delegate.getValue()).booleanValue();
    }

    public final void setShowCursorHandle(boolean z2) {
        this.showCursorHandle$delegate.setValue(Boolean.valueOf(z2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TextToolbarState getTextToolbarState() {
        return (TextToolbarState) this.textToolbarState$delegate.getValue();
    }

    public final void setTextToolbarState(TextToolbarState textToolbarState) {
        this.textToolbarState$delegate.setValue(textToolbarState);
    }

    public final LayoutCoordinates getTextLayoutCoordinates() {
        LayoutCoordinates textLayoutNodeCoordinates = this.textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates == null || !textLayoutNodeCoordinates.isAttached()) {
            return null;
        }
        return textLayoutNodeCoordinates;
    }

    private final boolean getEditable() {
        return this.enabled && !this.readOnly;
    }

    public final TextFieldHandleState getCursorHandleState$foundation_release(boolean z2) {
        TextFieldCharSequence visualText = this.textFieldState.getVisualText();
        boolean showCursorHandle = getShowCursorHandle();
        boolean z3 = getDirectDragGestureInitiator() == InputType.None;
        Handle draggingHandle = getDraggingHandle();
        if (!showCursorHandle || !z3 || !TextRange.m6117getCollapsedimpl(visualText.m1446getSelectiond9O1mEE()) || !visualText.shouldShowSelection() || visualText.length() <= 0 || (draggingHandle != Handle.Cursor && !isCursorHandleInVisibleBounds())) {
            return TextFieldHandleState.Companion.getHidden();
        }
        return new TextFieldHandleState(true, z2 ? getCursorRect().m3964getBottomCenterF1C5BW0() : Offset.Companion.m3952getUnspecifiedF1C5BW0(), ResolvedTextDirection.Ltr, false, null);
    }

    private final boolean isCursorHandleInVisibleBounds() {
        Rect rectVisibleBounds;
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            long jM3964getBottomCenterF1C5BW0 = getCursorRect().m3964getBottomCenterF1C5BW0();
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            LayoutCoordinates textLayoutCoordinates = getTextLayoutCoordinates();
            if (textLayoutCoordinates == null || (rectVisibleBounds = SelectionManagerKt.visibleBounds(textLayoutCoordinates)) == null) {
                return false;
            }
            return SelectionManagerKt.m1718containsInclusiveUv8p0NA(rectVisibleBounds, jM3964getBottomCenterF1C5BW0);
        } catch (Throwable th) {
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            throw th;
        }
    }

    public final Rect getCursorRect() {
        float right;
        TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            return Rect.Companion.getZero();
        }
        TextFieldCharSequence visualText = this.textFieldState.getVisualText();
        if (!TextRange.m6117getCollapsedimpl(visualText.m1446getSelectiond9O1mEE())) {
            return Rect.Companion.getZero();
        }
        Rect cursorRect = layoutResult.getCursorRect(TextRange.m6123getStartimpl(visualText.m1446getSelectiond9O1mEE()));
        float fMo710toPx0680j_4 = this.density.mo710toPx0680j_4(TextFieldCursorKt.getDefaultCursorThickness());
        if (layoutResult.getLayoutInput().getLayoutDirection() == LayoutDirection.Ltr) {
            right = cursorRect.getLeft() + (fMo710toPx0680j_4 / 2);
        } else {
            right = cursorRect.getRight() - (fMo710toPx0680j_4 / 2);
        }
        float f2 = fMo710toPx0680j_4 / 2;
        float fCoerceAtLeast = RangesKt.coerceAtLeast(RangesKt.coerceAtMost(right, IntSize.m6808getWidthimpl(layoutResult.m6096getSizeYbymL2g()) - f2), f2);
        return new Rect(fCoerceAtLeast - f2, cursorRect.getTop(), fCoerceAtLeast + f2, cursorRect.getBottom());
    }

    public final void update(HapticFeedback hapticFeedback, ClipboardManager clipboardManager, TextToolbar textToolbar, Density density, boolean z2, boolean z3, boolean z4) {
        if (!z2) {
            hideTextToolbar();
        }
        this.hapticFeedBack = hapticFeedback;
        this.clipboardManager = clipboardManager;
        this.textToolbar = textToolbar;
        this.density = density;
        this.enabled = z2;
        this.readOnly = z3;
        this.isPassword = z4;
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2 */
    /* JADX INFO: compiled from: TextFieldSelectionState.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!4i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E%\u000b\u0014l", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0014\u0006\u001a\u0017Q\u000e\u0014\u0017\u001d\u001dW\u0014\u001a!\u0013!\u001e\u0012\u001e`'\u001a\"\u001c\u001b-#**j\u0012$85\b,)1*\u001a-5/.@6==#E3G9x9LJLIM$>LCLF)HWY[YM\\\u000e\u001d", f = "!1C>\u000f1,2)\u0017(.&#3',*\u000e.\u001a,\u001cc (", i = {}, l = {}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
        final /* synthetic */ PointerInputScope $this_cursorHandleGestures;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(PointerInputScope pointerInputScope, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$this_cursorHandleGestures = pointerInputScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = TextFieldSelectionState.this.new AnonymousClass2(this.$this_cursorHandleGestures, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$1 */
        /* JADX INFO: compiled from: TextFieldSelectionState.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0014\u0006\u001a\u0017Q\u000e\u0014\u0017\u001d\u001dW\u0014\u001a!\u0013!\u001e\u0012\u001e`'\u001a\"\u001c\u001b-#**j\u0012$85\b,)1*\u001a-5/.@6==#E3G9x9LJLIM$>LCLF)HWY[YM\\\u000e\u001d\u0010\u001e", f = "!1C>\u000f1,2)\u0017(.&#3',*\u000e.\u001a,\u001cc (", i = {}, l = {368}, m = "8>GA>9(KJH>H?", n = {}, s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ PointerInputScope $this_cursorHandleGestures;
            int label;
            final /* synthetic */ TextFieldSelectionState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = textFieldSelectionState;
                this.$this_cursorHandleGestures = pointerInputScope;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$this_cursorHandleGestures, continuation);
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
                    if (this.this$0.detectTouchMode(this.$this_cursorHandleGestures, this) == coroutine_suspended) {
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

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new AnonymousClass1(TextFieldSelectionState.this, this.$this_cursorHandleGestures, null), 1, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new C00592(TextFieldSelectionState.this, this.$this_cursorHandleGestures, null), 1, null);
            return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new AnonymousClass3(this.$this_cursorHandleGestures, TextFieldSelectionState.this, null), 1, null);
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$2 */
        /* JADX INFO: compiled from: TextFieldSelectionState.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0014\u0006\u001a\u0017Q\u000e\u0014\u0017\u001d\u001dW\u0014\u001a!\u0013!\u001e\u0012\u001e`'\u001a\"\u001c\u001b-#**j\u0012$85\b,)1*\u001a-5/.@6==#E3G9x9LJLIM$>LCLF)HWY[YM\\\u000e\u001d\u0010\u001f", f = "!1C>\u000f1,2)\u0017(.&#3',*\u000e.\u001a,\u001cc (", i = {}, l = {371}, m = "8>GA>9(KJH>H?", n = {}, s = {})
        static final class C00592 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ PointerInputScope $this_cursorHandleGestures;
            int label;
            final /* synthetic */ TextFieldSelectionState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00592(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, Continuation<? super C00592> continuation) {
                super(2, continuation);
                this.this$0 = textFieldSelectionState;
                this.$this_cursorHandleGestures = pointerInputScope;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C00592(this.this$0, this.$this_cursorHandleGestures, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C00592) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (this.this$0.detectCursorHandleDragGestures(this.$this_cursorHandleGestures, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$3 */
        /* JADX INFO: compiled from: TextFieldSelectionState.kt */
        /* JADX INFO: loaded from: classes2.dex */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0014\u0006\u001a\u0017Q\u000e\u0014\u0017\u001d\u001dW\u0014\u001a!\u0013!\u001e\u0012\u001e`'\u001a\"\u001c\u001b-#**j\u0012$85\b,)1*\u001a-5/.@6==#E3G9x9LJLIM$>LCLF)HWY[YM\\\u000e\u001d\u0010 ", f = "!1C>\u000f1,2)\u0017(.&#3',*\u000e.\u001a,\u001cc (", i = {}, l = {374}, m = "8>GA>9(KJH>H?", n = {}, s = {})
        static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ PointerInputScope $this_cursorHandleGestures;
            int label;
            final /* synthetic */ TextFieldSelectionState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(PointerInputScope pointerInputScope, TextFieldSelectionState textFieldSelectionState, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$this_cursorHandleGestures = pointerInputScope;
                this.this$0 = textFieldSelectionState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.$this_cursorHandleGestures, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$3$1 */
            /* JADX INFO: compiled from: TextFieldSelectionState.kt */
            /* JADX INFO: loaded from: classes.dex */
            @InterfaceC1492Gx
            @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,i\bӵLc\u000b\u0004I\u00066\u000b<Ȑ\u0017\"Z\u0011(\u000btjQ0rf\u000f6ʂW,\u0015m\n7"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "7me<^,\u0006Y`M\u0002Jvd", "uI\u0018#"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
            static final class AnonymousClass1 extends Lambda implements Function1<Offset, Unit> {
                AnonymousClass1() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                    m1614invokek4lQ0M(offset.m3947unboximpl());
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke-k-4lQ0M */
                public final void m1614invokek4lQ0M(long j2) {
                    TextToolbarState textToolbarState;
                    TextFieldSelectionState textFieldSelectionState = textFieldSelectionState;
                    if (textFieldSelectionState.getTextToolbarState() == TextToolbarState.Cursor) {
                        textToolbarState = TextToolbarState.None;
                    } else {
                        textToolbarState = TextToolbarState.Cursor;
                    }
                    textFieldSelectionState.setTextToolbarState(textToolbarState);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (TapGestureDetectorKt.detectTapGestures$default(this.$this_cursorHandleGestures, null, null, null, new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.cursorHandleGestures.2.3.1
                        AnonymousClass1() {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                            m1614invokek4lQ0M(offset.m3947unboximpl());
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke-k-4lQ0M */
                        public final void m1614invokek4lQ0M(long j2) {
                            TextToolbarState textToolbarState;
                            TextFieldSelectionState textFieldSelectionState = textFieldSelectionState;
                            if (textFieldSelectionState.getTextToolbarState() == TextToolbarState.Cursor) {
                                textToolbarState = TextToolbarState.None;
                            } else {
                                textToolbarState = TextToolbarState.Cursor;
                            }
                            textFieldSelectionState.setTextToolbarState(textToolbarState);
                        }
                    }, this, 7, null) == coroutine_suspended) {
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

    public final Object cursorHandleGestures(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new AnonymousClass2(pointerInputScope, null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2 */
    /* JADX INFO: compiled from: TextFieldSelectionState.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!4i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E%\u000b\u0014l", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0014\u0006\u001a\u0017Q\u000e\u0014\u0017\u001d\u001dW\u0014\u001a!\u0013!\u001e\u0012\u001e`'\u001a\"\u001c\u001b-#**j\u0012$85\b,)1*\u001a-5/.@6==#E3G9xI<D>=OELL'AOFOI,KZ\\^\\P_\u0011 ", f = "!1C>\u000f1,2)\u0017(.&#3',*\u000e.\u001a,\u001cc (", i = {}, l = {}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class C05712 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
        final /* synthetic */ boolean $isStartHandle;
        final /* synthetic */ PointerInputScope $this_selectionHandleGestures;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05712(PointerInputScope pointerInputScope, boolean z2, Continuation<? super C05712> continuation) {
            super(2, continuation);
            this.$this_selectionHandleGestures = pointerInputScope;
            this.$isStartHandle = z2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C05712 c05712 = TextFieldSelectionState.this.new C05712(this.$this_selectionHandleGestures, this.$isStartHandle, continuation);
            c05712.L$0 = obj;
            return c05712;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
            return ((C05712) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$1 */
        /* JADX INFO: compiled from: TextFieldSelectionState.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0014\u0006\u001a\u0017Q\u000e\u0014\u0017\u001d\u001dW\u0014\u001a!\u0013!\u001e\u0012\u001e`'\u001a\"\u001c\u001b-#**j\u0012$85\b,)1*\u001a-5/.@6==#E3G9xI<D>=OELL'AOFOI,KZ\\^\\P_\u0011 \u0013!", f = "!1C>\u000f1,2)\u0017(.&#3',*\u000e.\u001a,\u001cc (", i = {}, l = {391}, m = "8>GA>9(KJH>H?", n = {}, s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ PointerInputScope $this_selectionHandleGestures;
            int label;
            final /* synthetic */ TextFieldSelectionState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = textFieldSelectionState;
                this.$this_selectionHandleGestures = pointerInputScope;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$this_selectionHandleGestures, continuation);
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
                    if (this.this$0.detectTouchMode(this.$this_selectionHandleGestures, this) == coroutine_suspended) {
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

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new AnonymousClass1(TextFieldSelectionState.this, this.$this_selectionHandleGestures, null), 1, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new C00612(this.$this_selectionHandleGestures, TextFieldSelectionState.this, this.$isStartHandle, null), 1, null);
            return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new AnonymousClass3(TextFieldSelectionState.this, this.$this_selectionHandleGestures, this.$isStartHandle, null), 1, null);
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$2 */
        /* JADX INFO: compiled from: TextFieldSelectionState.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0014\u0006\u001a\u0017Q\u000e\u0014\u0017\u001d\u001dW\u0014\u001a!\u0013!\u001e\u0012\u001e`'\u001a\"\u001c\u001b-#**j\u0012$85\b,)1*\u001a-5/.@6==#E3G9xI<D>=OELL'AOFOI,KZ\\^\\P_\u0011 \u0013\"", f = "!1C>\u000f1,2)\u0017(.&#3',*\u000e.\u001a,\u001cc (", i = {}, l = {394}, m = "8>GA>9(KJH>H?", n = {}, s = {})
        static final class C00612 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ boolean $isStartHandle;
            final /* synthetic */ PointerInputScope $this_selectionHandleGestures;
            int label;
            final /* synthetic */ TextFieldSelectionState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00612(PointerInputScope pointerInputScope, TextFieldSelectionState textFieldSelectionState, boolean z2, Continuation<? super C00612> continuation) {
                super(2, continuation);
                this.$this_selectionHandleGestures = pointerInputScope;
                this.this$0 = textFieldSelectionState;
                this.$isStartHandle = z2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C00612(this.$this_selectionHandleGestures, this.this$0, this.$isStartHandle, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C00612) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$2$2 */
            /* JADX INFO: compiled from: TextFieldSelectionState.kt */
            @InterfaceC1492Gx
            @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,i\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
            static final class C00622 extends Lambda implements Function0<Unit> {
                C00622() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke */
                public final void invoke2() {
                    textFieldSelectionState.clearHandleDragging();
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (PressDownGestureKt.detectPressDownGesture(this.$this_selectionHandleGestures, new TapOnPosition() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.selectionHandleGestures.2.2.1
                        final /* synthetic */ boolean $isStartHandle;

                        AnonymousClass1(boolean z2) {
                            z = z2;
                        }

                        @Override // androidx.compose.foundation.text.input.internal.selection.TapOnPosition
                        /* JADX INFO: renamed from: onEvent-k-4lQ0M */
                        public final void mo1578onEventk4lQ0M(long j2) {
                            Handle handle;
                            textFieldSelectionState.markStartContentVisibleOffset();
                            TextFieldSelectionState textFieldSelectionState = textFieldSelectionState;
                            if (z) {
                                handle = Handle.SelectionStart;
                            } else {
                                handle = Handle.SelectionEnd;
                            }
                            textFieldSelectionState.m1608updateHandleDraggingUv8p0NA(handle, SelectionHandlesKt.m1681getAdjustedCoordinatesk4lQ0M(textFieldSelectionState.m1598getHandlePositiontuRUvjQ(z)));
                        }
                    }, new Function0<Unit>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.selectionHandleGestures.2.2.2
                        C00622() {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke */
                        public final void invoke2() {
                            textFieldSelectionState.clearHandleDragging();
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

            /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$2$1 */
            /* JADX INFO: compiled from: TextFieldSelectionState.kt */
            /* JADX INFO: loaded from: classes2.dex */
            @InterfaceC1492Gx
            @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bӵLc\u000b\u0004OيH\u000b\\A/&:\u0012\u0010\u0007\u0015k\u007f8"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
            static final class AnonymousClass1 implements TapOnPosition {
                final /* synthetic */ boolean $isStartHandle;

                AnonymousClass1(boolean z2) {
                    z = z2;
                }

                @Override // androidx.compose.foundation.text.input.internal.selection.TapOnPosition
                /* JADX INFO: renamed from: onEvent-k-4lQ0M */
                public final void mo1578onEventk4lQ0M(long j2) {
                    Handle handle;
                    textFieldSelectionState.markStartContentVisibleOffset();
                    TextFieldSelectionState textFieldSelectionState = textFieldSelectionState;
                    if (z) {
                        handle = Handle.SelectionStart;
                    } else {
                        handle = Handle.SelectionEnd;
                    }
                    textFieldSelectionState.m1608updateHandleDraggingUv8p0NA(handle, SelectionHandlesKt.m1681getAdjustedCoordinatesk4lQ0M(textFieldSelectionState.m1598getHandlePositiontuRUvjQ(z)));
                }
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$3 */
        /* JADX INFO: compiled from: TextFieldSelectionState.kt */
        /* JADX INFO: loaded from: classes2.dex */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0014\u0006\u001a\u0017Q\u000e\u0014\u0017\u001d\u001dW\u0014\u001a!\u0013!\u001e\u0012\u001e`'\u001a\"\u001c\u001b-#**j\u0012$85\b,)1*\u001a-5/.@6==#E3G9xI<D>=OELL'AOFOI,KZ\\^\\P_\u0011 \u0013#", f = "!1C>\u000f1,2)\u0017(.&#3',*\u000e.\u001a,\u001cc (", i = {}, l = {HttpStatus.SC_PRECONDITION_FAILED}, m = "8>GA>9(KJH>H?", n = {}, s = {})
        static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ boolean $isStartHandle;
            final /* synthetic */ PointerInputScope $this_selectionHandleGestures;
            int label;
            final /* synthetic */ TextFieldSelectionState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, boolean z2, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = textFieldSelectionState;
                this.$this_selectionHandleGestures = pointerInputScope;
                this.$isStartHandle = z2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, this.$this_selectionHandleGestures, this.$isStartHandle, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (this.this$0.detectSelectionHandleDragGestures(this.$this_selectionHandleGestures, this.$isStartHandle, this) == coroutine_suspended) {
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

    public final Object selectionHandleGestures(PointerInputScope pointerInputScope, boolean z2, Continuation<? super Unit> continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new C05712(pointerInputScope, z2, null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object observeChanges(kotlin.coroutines.Continuation<? super kotlin.Unit> r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.C05641
            if (r0 == 0) goto L29
            r5 = r7
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeChanges$1 r5 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.C05641) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r2 + r1
            r2 = r2 | r1
            int r0 = r0 - r2
            if (r0 == 0) goto L29
            int r0 = r5.label
            int r0 = r0 - r1
            r5.label = r0
        L16:
            java.lang.Object r1 = r5.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r5.label
            r4 = 0
            r2 = 1
            if (r0 == 0) goto L3b
            if (r0 != r2) goto L33
            java.lang.Object r3 = r5.L$0
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r3 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) r3
            goto L2f
        L29:
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeChanges$1 r5 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeChanges$1
            r5.<init>(r7)
            goto L16
        L2f:
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Throwable -> L66
            goto L52
        L33:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L3b:
            kotlin.ResultKt.throwOnFailure(r1)
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeChanges$2 r1 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeChanges$2     // Catch: java.lang.Throwable -> L63
            r0 = 0
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L63
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1     // Catch: java.lang.Throwable -> L63
            r5.L$0 = r6     // Catch: java.lang.Throwable -> L63
            r5.label = r2     // Catch: java.lang.Throwable -> L63
            java.lang.Object r0 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r1, r5)     // Catch: java.lang.Throwable -> L63
            if (r0 != r3) goto L51
            return r3
        L51:
            r3 = r6
        L52:
            r3.setShowCursorHandle(r4)
            androidx.compose.foundation.text.input.internal.selection.TextToolbarState r1 = r3.getTextToolbarState()
            androidx.compose.foundation.text.input.internal.selection.TextToolbarState r0 = androidx.compose.foundation.text.input.internal.selection.TextToolbarState.None
            if (r1 == r0) goto L60
            r3.hideTextToolbar()
        L60:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L63:
            r2 = move-exception
            r3 = r6
            goto L67
        L66:
            r2 = move-exception
        L67:
            r3.setShowCursorHandle(r4)
            androidx.compose.foundation.text.input.internal.selection.TextToolbarState r1 = r3.getTextToolbarState()
            androidx.compose.foundation.text.input.internal.selection.TextToolbarState r0 = androidx.compose.foundation.text.input.internal.selection.TextToolbarState.None
            if (r1 == r0) goto L75
            r3.hideTextToolbar()
        L75:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.observeChanges(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeChanges$2 */
    /* JADX INFO: compiled from: TextFieldSelectionState.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!4i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E%\u000b\u0014l", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0014\u0006\u001a\u0017Q\u000e\u0014\u0017\u001d\u001dW\u0014\u001a!\u0013!\u001e\u0012\u001e`'\u001a\"\u001c\u001b-#**j\u0012$85\b,)1*\u001a-5/.@6==#E3G9xE9K>LQA F@NHGV\b\u0017", f = "!1C>\u000f1,2)\u0017(.&#3',*\u000e.\u001a,\u001cc (", i = {}, l = {}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class C05652 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C05652(Continuation<? super C05652> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C05652 c05652 = TextFieldSelectionState.this.new C05652(continuation);
            c05652.L$0 = obj;
            return c05652;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
            return ((C05652) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeChanges$2$1 */
        /* JADX INFO: compiled from: TextFieldSelectionState.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0014\u0006\u001a\u0017Q\u000e\u0014\u0017\u001d\u001dW\u0014\u001a!\u0013!\u001e\u0012\u001e`'\u001a\"\u001c\u001b-#**j\u0012$85\b,)1*\u001a-5/.@6==#E3G9xE9K>LQA F@NHGV\b\u0017\n\u0018", f = "!1C>\u000f1,2)\u0017(.&#3',*\u000e.\u001a,\u001cc (", i = {}, l = {424}, m = "8>GA>9(KJH>H?", n = {}, s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ TextFieldSelectionState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(TextFieldSelectionState textFieldSelectionState, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = textFieldSelectionState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
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
                    if (this.this$0.observeTextChanges(this) == coroutine_suspended) {
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

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(TextFieldSelectionState.this, null), 3, null);
            return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C00602(TextFieldSelectionState.this, null), 3, null);
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeChanges$2$2 */
        /* JADX INFO: compiled from: TextFieldSelectionState.kt */
        /* JADX INFO: loaded from: classes2.dex */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0014\u0006\u001a\u0017Q\u000e\u0014\u0017\u001d\u001dW\u0014\u001a!\u0013!\u001e\u0012\u001e`'\u001a\"\u001c\u001b-#**j\u0012$85\b,)1*\u001a-5/.@6==#E3G9xE9K>LQA F@NHGV\b\u0017\n\u0019", f = "!1C>\u000f1,2)\u0017(.&#3',*\u000e.\u001a,\u001cc (", i = {}, l = {TypedValues.CycleType.TYPE_WAVE_PHASE}, m = "8>GA>9(KJH>H?", n = {}, s = {})
        static final class C00602 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ TextFieldSelectionState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00602(TextFieldSelectionState textFieldSelectionState, Continuation<? super C00602> continuation) {
                super(2, continuation);
                this.this$0 = textFieldSelectionState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C00602(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C00602) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (this.this$0.observeTextToolbarVisibility(this) == coroutine_suspended) {
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

    public final void updateTextToolbarState(TextToolbarState textToolbarState) {
        setTextToolbarState(textToolbarState);
    }

    public final void dispose() {
        hideTextToolbar();
        this.textToolbar = null;
        this.clipboardManager = null;
        this.hapticFeedBack = null;
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTouchMode$2 */
    /* JADX INFO: compiled from: TextFieldSelectionState.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001I(*QR&u8'$hn\u0019\u0018c5]d%QWN\u0002"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0014\u0006\u001a\u0017Q\u000e\u0014\u0017\u001d\u001dW\u0014\u001a!\u0013!\u001e\u0012\u001e`'\u001a\"\u001c\u001b-#**j\u0012$85\b,)1*\u001a-5/.@6==#E3G9x:<L>=O0LSBH.QGI\t\u0018", f = "!1C>\u000f1,2)\u0017(.&#3',*\u000e.\u001a,\u001cc (", i = {0}, l = {455}, m = "8>GA>9(KJH>H?", n = {"\u0013jjOe\u001aC^7CZ\u001aFC-:\u0018)\u0007\u001d\u0017%\u001b}y\n\u0017g"}, s = {"xQ^"})
    static final class C05622 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C05622(Continuation<? super C05622> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C05622 c05622 = TextFieldSelectionState.this.new C05622(continuation);
            c05622.L$0 = obj;
            return c05622;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((C05622) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x002d A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x002b -> B:19:0x0012). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r5.label
                r3 = 1
                if (r0 == 0) goto L2e
                if (r0 != r3) goto L36
                java.lang.Object r2 = r5.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r2
                kotlin.ResultKt.throwOnFailure(r6)
            L12:
                androidx.compose.ui.input.pointer.PointerEvent r6 = (androidx.compose.ui.input.pointer.PointerEvent) r6
                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r1 = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this
                boolean r0 = androidx.compose.foundation.text.selection.SelectionGesturesKt.isPrecisePointer(r6)
                r0 = r0 ^ r3
                r1.setInTouchMode(r0)
            L1e:
                androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                r0 = r5
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                r5.L$0 = r2
                r5.label = r3
                java.lang.Object r6 = r2.awaitPointerEvent(r1, r0)
                if (r6 != r4) goto L12
                return r4
            L2e:
                kotlin.ResultKt.throwOnFailure(r6)
                java.lang.Object r2 = r5.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r2
                goto L1e
            L36:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.C05622.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final Object detectTouchMode(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        Object objAwaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new C05622(null), continuation);
        return objAwaitPointerEventScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitPointerEventScope : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$3 */
    /* JADX INFO: compiled from: TextFieldSelectionState.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,i\bӵLc\u000b\u0004I\u00066\u000b<Ȑ\u0017\"Z\u0011(\u000btjQ0rf\u000f6ʂW,\u0015m\n7"}, d2 = {"\n`]<a@F])\rS", "", "=eU@X;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "7me<^,\u0006Y`M\u0002Jvd", "uI\u0018#"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C05613 extends Lambda implements Function1<Offset, Unit> {
        final /* synthetic */ Function0<Unit> $requestFocus;
        final /* synthetic */ Function0<Unit> $showKeyboard;
        final /* synthetic */ TextFieldSelectionState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05613(Function0<Unit> function0, TextFieldSelectionState textFieldSelectionState, Function0<Unit> function02) {
            super(1);
            function0 = function0;
            textFieldSelectionState = textFieldSelectionState;
            function0 = function02;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
            m1620invokek4lQ0M(offset.m3947unboximpl());
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$3$1 */
        /* JADX INFO: compiled from: TextFieldSelectionState.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        static final class AnonymousClass1 extends Lambda implements Function0<String> {
            public static final AnonymousClass1 INSTANCE = ;

            AnonymousClass1() {
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "onTapTextField";
            }
        }

        /* JADX INFO: renamed from: invoke-k-4lQ0M */
        public final void m1620invokek4lQ0M(long j2) {
            TextFieldSelectionStateKt.logDebug(AnonymousClass1.INSTANCE);
            function0.invoke();
            if (textFieldSelectionState.enabled && textFieldSelectionState.isFocused()) {
                if (!textFieldSelectionState.readOnly) {
                    function0.invoke();
                    if (textFieldSelectionState.textFieldState.getVisualText().length() > 0) {
                        textFieldSelectionState.setShowCursorHandle(true);
                    }
                }
                textFieldSelectionState.updateTextToolbarState(TextToolbarState.None);
                long jM1552coercedInVisibleBoundsOfInputTextMKHz9U$foundation_release = textFieldSelectionState.textLayoutState.m1552coercedInVisibleBoundsOfInputTextMKHz9U$foundation_release(j2);
                TextFieldSelectionState textFieldSelectionState = textFieldSelectionState;
                textFieldSelectionState.m1602placeCursorAtNearestOffsetk4lQ0M(TextLayoutStateKt.m1559fromDecorationToTextLayoutUv8p0NA(textFieldSelectionState.textLayoutState, jM1552coercedInVisibleBoundsOfInputTextMKHz9U$foundation_release));
            }
        }
    }

    public final Object detectTextFieldTapGestures(PointerInputScope pointerInputScope, MutableInteractionSource mutableInteractionSource, Function0<Unit> function0, Function0<Unit> function02, Continuation<? super Unit> continuation) {
        Object objDetectTapAndPress = TapGestureDetectorKt.detectTapAndPress(pointerInputScope, new C05602(mutableInteractionSource, this, null), new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.detectTextFieldTapGestures.3
            final /* synthetic */ Function0<Unit> $requestFocus;
            final /* synthetic */ Function0<Unit> $showKeyboard;
            final /* synthetic */ TextFieldSelectionState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C05613(Function0<Unit> function03, TextFieldSelectionState this, Function0<Unit> function022) {
                super(1);
                function0 = function03;
                textFieldSelectionState = this;
                function0 = function022;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                m1620invokek4lQ0M(offset.m3947unboximpl());
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$3$1 */
            /*  JADX ERROR: Failed to generate init code
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0002: CONSTRUCTOR  A[DECLARE_VAR, DONT_GENERATE, MD:():void (m), REMOVE, WRAPPED] call: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.detectTextFieldTapGestures.3.1.<init>():void type: CONSTRUCTOR in method: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.detectTextFieldTapGestures.3.1.<clinit>():void, file: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.ClassGen.addInsnBody(ClassGen.java:549)
                	at jadx.core.codegen.ClassGen.addField(ClassGen.java:455)
                	at jadx.core.codegen.ClassGen.addFields(ClassGen.java:422)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:287)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
                	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:312)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:301)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
                	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:312)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:301)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                	at jadx.core.ProcessClass.process(ProcessClass.java:88)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
                	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                Caused by: jadx.core.utils.exceptions.CodegenException: Anonymous inner class unlimited recursion detected. Convert class to inner: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.detectTextFieldTapGestures.3.1
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:813)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:286)
                	... 49 more
                */
            /* JADX INFO: compiled from: TextFieldSelectionState.kt */
            @InterfaceC1492Gx
            @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
            static final class AnonymousClass1 extends Lambda implements Function0<String> {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                AnonymousClass1() {
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "onTapTextField";
                }
            }

            /* JADX INFO: renamed from: invoke-k-4lQ0M */
            public final void m1620invokek4lQ0M(long j2) {
                TextFieldSelectionStateKt.logDebug(AnonymousClass1.INSTANCE);
                function0.invoke();
                if (textFieldSelectionState.enabled && textFieldSelectionState.isFocused()) {
                    if (!textFieldSelectionState.readOnly) {
                        function0.invoke();
                        if (textFieldSelectionState.textFieldState.getVisualText().length() > 0) {
                            textFieldSelectionState.setShowCursorHandle(true);
                        }
                    }
                    textFieldSelectionState.updateTextToolbarState(TextToolbarState.None);
                    long jM1552coercedInVisibleBoundsOfInputTextMKHz9U$foundation_release = textFieldSelectionState.textLayoutState.m1552coercedInVisibleBoundsOfInputTextMKHz9U$foundation_release(j2);
                    TextFieldSelectionState textFieldSelectionState = textFieldSelectionState;
                    textFieldSelectionState.m1602placeCursorAtNearestOffsetk4lQ0M(TextLayoutStateKt.m1559fromDecorationToTextLayoutUv8p0NA(textFieldSelectionState.textLayoutState, jM1552coercedInVisibleBoundsOfInputTextMKHz9U$foundation_release));
                }
            }
        }, continuation);
        return objDetectTapAndPress == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectTapAndPress : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$2 */
    /* JADX INFO: compiled from: TextFieldSelectionState.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,i\bDZc|İI\u0006F\u000b<Ȑ\u0017\"Z\u0011 \u0007\u0015ji4Rf`.\u0001UpŪ*"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w8P;yB\u007f\u0015vpI\u0014c\u001aL\u00012G\"", "=eU@X;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0014\u0006\u001a\u0017Q\u000e\u0014\u0017\u001d\u001dW\u0014\u001a!\u0013!\u001e\u0012\u001e`'\u001a\"\u001c\u001b-#**j\u0012$85\b,)1*\u001a-5/.@6==#E3G9x:<L>=O0BVS&JGOH9GW/N]_a_Sb\u0014#", f = "!1C>\u000f1,2)\u0017(.&#3',*\u000e.\u001a,\u001cc (", i = {}, l = {491}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class C05602 extends SuspendLambda implements Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> {
        final /* synthetic */ MutableInteractionSource $interactionSource;
        /* synthetic */ long J$0;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ TextFieldSelectionState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05602(MutableInteractionSource mutableInteractionSource, TextFieldSelectionState textFieldSelectionState, Continuation<? super C05602> continuation) {
            super(3, continuation);
            this.$interactionSource = mutableInteractionSource;
            this.this$0 = textFieldSelectionState;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(PressGestureScope pressGestureScope, Offset offset, Continuation<? super Unit> continuation) {
            return m1619invoked4ec7I(pressGestureScope, offset.m3947unboximpl(), continuation);
        }

        /* JADX INFO: renamed from: invoke-d-4ec7I */
        public final Object m1619invoked4ec7I(PressGestureScope pressGestureScope, long j2, Continuation<? super Unit> continuation) {
            C05602 c05602 = new C05602(this.$interactionSource, this.this$0, continuation);
            c05602.L$0 = pressGestureScope;
            c05602.J$0 = j2;
            return c05602.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                PressGestureScope pressGestureScope = (PressGestureScope) this.L$0;
                long j2 = this.J$0;
                MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                if (mutableInteractionSource != null) {
                    TextFieldSelectionState$detectTextFieldTapGestures$2$1$1 textFieldSelectionState$detectTextFieldTapGestures$2$1$1 = new TextFieldSelectionState$detectTextFieldTapGestures$2$1$1(pressGestureScope, this.this$0, j2, mutableInteractionSource, null);
                    this.label = 1;
                    if (CoroutineScopeKt.coroutineScope(textFieldSelectionState$detectTextFieldTapGestures$2$1$1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: placeCursorAtNearestOffset-k-4lQ0M */
    public final boolean m1602placeCursorAtNearestOffsetk4lQ0M(long j2) {
        int iM6095getOffsetForPositionk4lQ0M;
        IndexTransformationType indexTransformationType;
        int iM6123getStartimpl;
        TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null || (iM6095getOffsetForPositionk4lQ0M = layoutResult.m6095getOffsetForPositionk4lQ0M(j2)) == -1) {
            return false;
        }
        TransformedTextFieldState transformedTextFieldState = this.textFieldState;
        long jM1566mapFromTransformedjx7JFs = transformedTextFieldState.m1566mapFromTransformedjx7JFs(iM6095getOffsetForPositionk4lQ0M);
        long jM1569mapToTransformedGEjPoXI = transformedTextFieldState.m1569mapToTransformedGEjPoXI(jM1566mapFromTransformedjx7JFs);
        if (TextRange.m6117getCollapsedimpl(jM1566mapFromTransformedjx7JFs) && TextRange.m6117getCollapsedimpl(jM1569mapToTransformedGEjPoXI)) {
            indexTransformationType = IndexTransformationType.Untransformed;
        } else if (!TextRange.m6117getCollapsedimpl(jM1566mapFromTransformedjx7JFs) && !TextRange.m6117getCollapsedimpl(jM1569mapToTransformedGEjPoXI)) {
            indexTransformationType = IndexTransformationType.Replacement;
        } else if (TextRange.m6117getCollapsedimpl(jM1566mapFromTransformedjx7JFs) && !TextRange.m6117getCollapsedimpl(jM1569mapToTransformedGEjPoXI)) {
            indexTransformationType = IndexTransformationType.Insertion;
        } else {
            indexTransformationType = IndexTransformationType.Deletion;
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[indexTransformationType.ordinal()];
        SelectionWedgeAffinity selectionWedgeAffinity = null;
        if (i2 == 1 || i2 == 2) {
            iM6123getStartimpl = TextRange.m6123getStartimpl(jM1566mapFromTransformedjx7JFs);
        } else if (i2 == 3) {
            if (MathUtilsKt.m1514findClosestRect9KIMszo(j2, layoutResult.getCursorRect(TextRange.m6123getStartimpl(jM1569mapToTransformedGEjPoXI)), layoutResult.getCursorRect(TextRange.m6118getEndimpl(jM1569mapToTransformedGEjPoXI))) < 0) {
                selectionWedgeAffinity = new SelectionWedgeAffinity(WedgeAffinity.Start);
            } else {
                selectionWedgeAffinity = new SelectionWedgeAffinity(WedgeAffinity.End);
            }
            iM6123getStartimpl = TextRange.m6123getStartimpl(jM1566mapFromTransformedjx7JFs);
        } else if (i2 == 4) {
            if (MathUtilsKt.m1514findClosestRect9KIMszo(j2, layoutResult.getCursorRect(TextRange.m6123getStartimpl(jM1569mapToTransformedGEjPoXI)), layoutResult.getCursorRect(TextRange.m6118getEndimpl(jM1569mapToTransformedGEjPoXI))) < 0) {
                iM6123getStartimpl = TextRange.m6123getStartimpl(jM1566mapFromTransformedjx7JFs);
            } else {
                iM6123getStartimpl = TextRange.m6118getEndimpl(jM1566mapFromTransformedjx7JFs);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        long jTextRange = TextRangeKt.TextRange(iM6123getStartimpl);
        if (TextRange.m6116equalsimpl0(jTextRange, this.textFieldState.getUntransformedText().m1446getSelectiond9O1mEE()) && (selectionWedgeAffinity == null || Intrinsics.areEqual(selectionWedgeAffinity, this.textFieldState.getSelectionWedgeAffinity()))) {
            return false;
        }
        this.textFieldState.m1572selectUntransformedCharsIn5zctL8(jTextRange);
        if (selectionWedgeAffinity != null) {
            this.textFieldState.setSelectionWedgeAffinity(selectionWedgeAffinity);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object detectCursorHandleDragGestures(androidx.compose.ui.input.pointer.PointerInputScope r12, kotlin.coroutines.Continuation<? super kotlin.Unit> r13) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r13 instanceof androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.AnonymousClass1
            if (r0 == 0) goto L30
            r10 = r13
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$1 r10 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.AnonymousClass1) r10
            int r2 = r10.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r2 + r1
            r2 = r2 | r1
            int r0 = r0 - r2
            if (r0 == 0) goto L30
            int r0 = r10.label
            int r0 = r0 - r1
            r10.label = r0
        L16:
            java.lang.Object r6 = r10.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r10.label
            r5 = 1
            if (r0 == 0) goto L42
            if (r0 != r5) goto L3a
            java.lang.Object r3 = r10.L$2
            kotlin.jvm.internal.Ref$LongRef r3 = (kotlin.jvm.internal.Ref.LongRef) r3
            java.lang.Object r2 = r10.L$1
            kotlin.jvm.internal.Ref$LongRef r2 = (kotlin.jvm.internal.Ref.LongRef) r2
            java.lang.Object r1 = r10.L$0
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r1 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) r1
            goto L36
        L30:
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$1 r10 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$1
            r10.<init>(r13)
            goto L16
        L36:
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L95
            goto L8c
        L3a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L42:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlin.jvm.internal.Ref$LongRef r2 = new kotlin.jvm.internal.Ref$LongRef
            r2.<init>()
            androidx.compose.ui.geometry.Offset$Companion r0 = androidx.compose.ui.geometry.Offset.Companion
            long r0 = r0.m3952getUnspecifiedF1C5BW0()
            r2.element = r0
            kotlin.jvm.internal.Ref$LongRef r3 = new kotlin.jvm.internal.Ref$LongRef
            r3.<init>()
            androidx.compose.ui.geometry.Offset$Companion r0 = androidx.compose.ui.geometry.Offset.Companion
            long r0 = r0.m3952getUnspecifiedF1C5BW0()
            r3.element = r0
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$2 r6 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$2     // Catch: java.lang.Throwable -> L92
            r6.<init>()     // Catch: java.lang.Throwable -> L92
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6     // Catch: java.lang.Throwable -> L92
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$3 r7 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$3     // Catch: java.lang.Throwable -> L92
            r7.<init>()     // Catch: java.lang.Throwable -> L92
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7     // Catch: java.lang.Throwable -> L92
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$4 r8 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$4     // Catch: java.lang.Throwable -> L92
            r8.<init>()     // Catch: java.lang.Throwable -> L92
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8     // Catch: java.lang.Throwable -> L92
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$5 r9 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$5     // Catch: java.lang.Throwable -> L92
            r9.<init>()     // Catch: java.lang.Throwable -> L92
            kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9     // Catch: java.lang.Throwable -> L92
            r10.L$0 = r11     // Catch: java.lang.Throwable -> L92
            r10.L$1 = r2     // Catch: java.lang.Throwable -> L92
            r10.L$2 = r3     // Catch: java.lang.Throwable -> L92
            r10.label = r5     // Catch: java.lang.Throwable -> L92
            r5 = r12
            java.lang.Object r0 = androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L92
            if (r0 != r4) goto L8b
            return r4
        L8b:
            r1 = r11
        L8c:
            detectCursorHandleDragGestures$onDragStop(r2, r3, r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L92:
            r0 = move-exception
            r1 = r11
            goto L96
        L95:
            r0 = move-exception
        L96:
            detectCursorHandleDragGestures$onDragStop(r2, r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.detectCursorHandleDragGestures(androidx.compose.ui.input.pointer.PointerInputScope, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void detectCursorHandleDragGestures$onDragStop(Ref.LongRef longRef, Ref.LongRef longRef2, TextFieldSelectionState textFieldSelectionState) {
        if (OffsetKt.m3956isSpecifiedk4lQ0M(longRef.element)) {
            longRef.element = Offset.Companion.m3952getUnspecifiedF1C5BW0();
            longRef2.element = Offset.Companion.m3952getUnspecifiedF1C5BW0();
            textFieldSelectionState.clearHandleDragging();
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$2 */
    /* JADX INFO: compiled from: TextFieldSelectionState.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,i\bӵLc\u000b\u0004I\u00066\u000b<Ȑ\u0017\"Z\u0011(\u000btjQ0rf\u000f6ʂW,\u0015m\n7"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "7me<^,\u0006Y`M\u0002Jvd", "uI\u0018#"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C05542 extends Lambda implements Function1<Offset, Unit> {
        final /* synthetic */ Ref.LongRef $cursorDragDelta;
        final /* synthetic */ TextFieldSelectionState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05542(TextFieldSelectionState textFieldSelectionState, Ref.LongRef longRef) {
            super(1);
            textFieldSelectionState = textFieldSelectionState;
            longRef = longRef;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
            m1615invokek4lQ0M(offset.m3947unboximpl());
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke-k-4lQ0M */
        public final void m1615invokek4lQ0M(long j2) {
            longRef.element = SelectionHandlesKt.m1681getAdjustedCoordinatesk4lQ0M(textFieldSelectionState.getCursorRect().m3964getBottomCenterF1C5BW0());
            longRef.element = Offset.Companion.m3953getZeroF1C5BW0();
            textFieldSelectionState.setInTouchMode(true);
            textFieldSelectionState.markStartContentVisibleOffset();
            textFieldSelectionState.m1608updateHandleDraggingUv8p0NA(Handle.Cursor, longRef.element);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$3 */
    /* JADX INFO: compiled from: TextFieldSelectionState.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,i\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass3 extends Lambda implements Function0<Unit> {
        final /* synthetic */ Ref.LongRef $cursorDragDelta;
        final /* synthetic */ TextFieldSelectionState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(Ref.LongRef longRef, TextFieldSelectionState textFieldSelectionState) {
            super(0);
            longRef = longRef;
            textFieldSelectionState = textFieldSelectionState;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
            TextFieldSelectionState.detectCursorHandleDragGestures$onDragStop(longRef, longRef, textFieldSelectionState);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$4 */
    /* JADX INFO: compiled from: TextFieldSelectionState.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,i\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass4 extends Lambda implements Function0<Unit> {
        final /* synthetic */ Ref.LongRef $cursorDragDelta;
        final /* synthetic */ TextFieldSelectionState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(Ref.LongRef longRef, TextFieldSelectionState textFieldSelectionState) {
            super(0);
            longRef = longRef;
            textFieldSelectionState = textFieldSelectionState;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
            TextFieldSelectionState.detectCursorHandleDragGestures$onDragStop(longRef, longRef, textFieldSelectionState);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$5 */
    /* JADX INFO: compiled from: TextFieldSelectionState.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0018\u001d̉=!,i\bӵLc\u000b\u0004Iي8\u000bDB\u0007\"2\u0012\u0006ј~jg/tiV.jSX\u0010\u001c\u007fB&s$ F\u0002]۟\u0002$\u000fS\\l"}, d2 = {"\n`]<a@F])\rS", "", "1gP;Z,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018' xp\u0017\n_5Pv|", "2qP444Hc\"\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "7me<^,\u0006C*Q\u0006)\u0015X", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001b R\u007f\u001d\u0006\u0002/9b\r D7\u00018QLJkA\u0002\u001esqHdf(Wx'\u001d1\u0012\u001d"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass5 extends Lambda implements Function2<PointerInputChange, Offset, Unit> {
        final /* synthetic */ Ref.LongRef $cursorDragStart;
        final /* synthetic */ TextFieldSelectionState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(TextFieldSelectionState textFieldSelectionState, Ref.LongRef longRef) {
            super(2);
            textFieldSelectionState = textFieldSelectionState;
            longRef = longRef;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange, Offset offset) {
            m1616invokeUv8p0NA(pointerInputChange, offset.m3947unboximpl());
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke-Uv8p0NA */
        public final void m1616invokeUv8p0NA(PointerInputChange pointerInputChange, long j2) {
            Ref.LongRef longRef = longRef;
            longRef.element = Offset.m3942plusMKHz9U(longRef.element, j2);
            textFieldSelectionState.m1608updateHandleDraggingUv8p0NA(Handle.Cursor, Offset.m3942plusMKHz9U(longRef.element, longRef.element));
            TextFieldSelectionState textFieldSelectionState = textFieldSelectionState;
            if (textFieldSelectionState.m1602placeCursorAtNearestOffsetk4lQ0M(textFieldSelectionState.m1607getHandleDragPositionF1C5BW0())) {
                pointerInputChange.consume();
                HapticFeedback hapticFeedback = textFieldSelectionState.hapticFeedBack;
                if (hapticFeedback != null) {
                    hapticFeedback.mo4906performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m4915getTextHandleMove5zf0vsI());
                }
            }
        }
    }

    public final Object textFieldSelectionGestures(PointerInputScope pointerInputScope, Function0<Unit> function0, Continuation<? super Unit> continuation) {
        Object objSelectionGesturePointerInputBtf2 = SelectionGesturesKt.selectionGesturePointerInputBtf2(pointerInputScope, new TextFieldMouseSelectionObserver(function0), new TextFieldTextDragObserver(function0), continuation);
        return objSelectionGesturePointerInputBtf2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSelectionGesturePointerInputBtf2 : Unit.INSTANCE;
    }

    /* JADX INFO: compiled from: TextFieldSelectionState.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b<B\u0007\"2\u0012\u007f\u0007tpAӄLe^.ZS0\u000fs{B-c$wCCU0}*\tUXog\u0005Jb\u000bI\u0011\fǠz\u0001ߚyU'\\R BL}?KS\u007f?I`#83!ݨ&8\b\bI:8Q(v)M{\u0010 ;XphY=Q\u0013&*\u0006l-G2תfޮɇLncH=2KoP^?_^~\u0014!\u000fl5\u001e\u000faL5p;C'=S1\u000e\u0019oУ\u0002ӊџA\u0007n:5?\u0012\feKp\u007fB\u001f[S\u001bh\u000b&\u000b\f\u0018tѨ&˃յgMV$6\fC\u001c\u001bS\u001c\u000e41x2;,~\b<:%vaLh\u0002\rOF\u000f̡5ЍӾ\u000451Q)u\u001a\nI2f7*\u001f=\"1\f\u0007!\n[>d#'lw\u007f>\u0002DKcf\n\bG4\u0004ψạò\b2M\u001c=\u0019a:%)O[g(wȀ\u000eҩHg~ݓ1|aojHn)EݮCӠ\bȱ˧CcʰoR\\X:\u0019\u001e.b\u0007\u0016\u000e#\"lwj#S\u0011%лjȬnMe܃ɛ/o?\\tª*\u00068f3;pӘ\u0014\u007f"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@Pq,Uv%VPX5&ArP#r^\u000eU*z\u0005`A\"}HA(u;E\u0011;'o\f)\u001d\u0016npIUwQ\n#u/)oFWn}QJ/_8d\u0019p\u001di\u0010", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g|rqG\u0007Q,Uv%VPX5FO\u0001=!#Z\u001b$", "@d`BX:M4#|\u000bl", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001q\u001f9]R\u0005o=-\u0015uj5\u000e-:N}'E[R6e\u001ca='!;\u0012N2\frYH$lS;)\u0011\u001aX}JhVr\u001c\u0018DqtK \u0015X\u0002^vQ2fU]i\u0003U\u000b&r3b\u001bc'e\u0005\u0010g\u0005", "2qP45,@W\"h{_:|\u0018\u0013nn(\u000fO", "", "2qP45,@W\"i\u0005l0\f\r9n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "\u0018", "=m3?T.", "", "2qP4C6LW(\u0003\u0005g", "/cYBf;FS\"\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r0X\u007f\u0003FQ^:kZrF#g", "=m3?T.\u0006!\u0001\u0007zF|\u0003", "uI;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7$.TC9z8(\u001e2O9\u000ec*]z1P(M1l`\u0002E\u0014\u001bic\u0012 ", "=m3?T.\u001d]\"~", "=m4Eg,GR", "2nf;C6LW(\u0003\u0005g", "=m4Eg,GR`\u0005B-3hS\u0017", "uI\u0018'", "=m4Eg,GRw\fv`", "=m4Eg,GRw\fv`s\u0003P}lkrc", "=mBAT9M", "=mBAT9M\u001bff\u0003^\u0014M\u000f", "CoS.g,,S ~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\"U\u0007\"7C", "7rBAT9M=\u001alze,z\u00183o\t", "CoS.g,,S ~xm0\u0007\u0012vrK\u001a\tP\u0002e", "uI;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7$.TC9z8(\u001e2O9\u000ec*]z1P(M1l`\u0002E\u0014\u001bicCnq", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private final class TextFieldMouseSelectionObserver implements MouseSelectionObserver {
        private int dragBeginOffsetInText = -1;
        private long dragBeginPosition = Offset.Companion.m3952getUnspecifiedF1C5BW0();
        private final Function0<Unit> requestFocus;

        public TextFieldMouseSelectionObserver(Function0<Unit> function0) {
            this.requestFocus = function0;
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        /* JADX INFO: renamed from: onStart-3MmeM6k */
        public boolean mo1613onStart3MmeM6k(long j2, SelectionAdjustment selectionAdjustment) {
            if (TextFieldSelectionState.this.enabled && TextFieldSelectionState.this.textFieldState.getVisualText().length() != 0) {
                TextFieldSelectionStateKt.logDebug(new Function0<String>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldMouseSelectionObserver$onStart$1
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Mouse.onStart";
                    }
                });
                TextFieldSelectionState.this.setDirectDragGestureInitiator(InputType.Mouse);
                this.requestFocus.invoke();
                TextFieldSelectionState.this.previousRawDragOffset = -1;
                this.dragBeginOffsetInText = -1;
                this.dragBeginPosition = j2;
                this.dragBeginOffsetInText = TextRange.m6123getStartimpl(m1609updateSelectionr1Wruf4(j2, selectionAdjustment, true));
                return true;
            }
            return false;
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        /* JADX INFO: renamed from: onDrag-3MmeM6k */
        public boolean mo1610onDrag3MmeM6k(final long j2, SelectionAdjustment selectionAdjustment) {
            if (!TextFieldSelectionState.this.enabled || TextFieldSelectionState.this.textFieldState.getVisualText().length() == 0) {
                return false;
            }
            TextFieldSelectionStateKt.logDebug(new Function0<String>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldMouseSelectionObserver$onDrag$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Mouse.onDrag " + ((Object) Offset.m3945toStringimpl(j2));
                }
            });
            m1609updateSelectionr1Wruf4(j2, selectionAdjustment, false);
            return true;
        }

        /* JADX INFO: renamed from: updateSelection-r1Wruf4 */
        private final long m1609updateSelectionr1Wruf4(long j2, SelectionAdjustment selectionAdjustment, boolean z2) {
            Integer numValueOf = Integer.valueOf(this.dragBeginOffsetInText);
            if (numValueOf.intValue() < 0) {
                numValueOf = null;
            }
            int iIntValue = numValueOf != null ? numValueOf.intValue() : TextFieldSelectionState.this.textLayoutState.m1554getOffsetForPosition3MmeM6k(this.dragBeginPosition, false);
            int iM1554getOffsetForPosition3MmeM6k = TextFieldSelectionState.this.textLayoutState.m1554getOffsetForPosition3MmeM6k(j2, false);
            TextFieldSelectionState textFieldSelectionState = TextFieldSelectionState.this;
            long jM1605updateSelectionSsLRf8 = textFieldSelectionState.m1605updateSelectionSsLRf8(textFieldSelectionState.textFieldState.getVisualText(), iIntValue, iM1554getOffsetForPosition3MmeM6k, false, selectionAdjustment, false, z2);
            if (this.dragBeginOffsetInText == -1 && !TextRange.m6117getCollapsedimpl(jM1605updateSelectionSsLRf8)) {
                this.dragBeginOffsetInText = TextRange.m6123getStartimpl(jM1605updateSelectionSsLRf8);
            }
            if (TextRange.m6122getReversedimpl(jM1605updateSelectionSsLRf8)) {
                jM1605updateSelectionSsLRf8 = TextFieldSelectionStateKt.m1622reverse5zctL8(jM1605updateSelectionSsLRf8);
            }
            TextFieldSelectionState.this.textFieldState.m1571selectCharsIn5zctL8(jM1605updateSelectionSsLRf8);
            TextFieldSelectionState.this.updateTextToolbarState(TextToolbarState.Selection);
            return jM1605updateSelectionSsLRf8;
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        public void onDragDone() {
            TextFieldSelectionStateKt.logDebug(new Function0<String>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldMouseSelectionObserver$onDragDone$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Mouse.onDragDone";
                }
            });
            TextFieldSelectionState.this.setDirectDragGestureInitiator(InputType.None);
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        /* JADX INFO: renamed from: onExtend-k-4lQ0M */
        public boolean mo1611onExtendk4lQ0M(long j2) {
            TextFieldSelectionStateKt.logDebug(new Function0<String>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldMouseSelectionObserver$onExtend$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Mouse.onExtend";
                }
            });
            return true;
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        /* JADX INFO: renamed from: onExtendDrag-k-4lQ0M */
        public boolean mo1612onExtendDragk4lQ0M(long j2) {
            TextFieldSelectionStateKt.logDebug(new Function0<String>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldMouseSelectionObserver$onExtendDrag$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Mouse.onExtendDrag";
                }
            });
            return true;
        }
    }

    /* JADX INFO: compiled from: TextFieldSelectionState.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b<B\u0007\"2\u0012\u007f\u0007|jAӄLeV4Zݷ2\u000f\u0002{<$a3wٔ=kڼ.\"7N\u000fxwxXZ#I\u001f\b&x\u0019.wVޯa\u0012\u001d5\u000buM?eok;'\t~\u001d.?:8(\u00071\u001e8V(v)L\u0012 ݮ/ϋ¤>T\u0013\\\u0013*Z\u001eL1\u0019\u001e\u000bi~:V~u:],I}ƢMϋۢ4~S Tdo\u0013\u0005u6+n9{\u0015mk\u0011\u001cj[m\u0005ouK\u001b\u0001'U4\u0010\bˇ5ݙÿ\u0018\u00171f\u001bm;,j\u001di`:)qc,Q^'@w)}SPT\u001a\u0014+`.[\u001f=ڟ\u001a\u07baxr[ó!\u000elH\u0018z\u0010=mӞ\fĴ/9#Ƙ\"uI!f7*\u000ec̗/ҠmďǵS\r\u05ce\u0019\u001d\\w_;\"TKSf\n\bFDՑ|Š\u0001Ï̯/FĬ3}\u0019.%/\bmG#9q\u0012JTg%\u0007\u000fi*֢T͕D\"vݫն*\u0012\u0014]J\u0080!\u001aO\\X20ܜ n"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@Pq,Uv%VPX5&ArP#r^\u000eU*z\u0005`A\"}HA(u;E\u0011;'o\f)\u001d\u0016npIU~G\r$TN%j0VmyTREo\u007f", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri&m)=,P7m\u001e\u001b#hnJ\u0007p\u0002", "@d`BX:M4#|\u000bl", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001q\u001f9]R\u0005o=-\u0015uj5\u000e-:N}'E[R6e\u001ca='!;\u0012N2\frYH$lS;)\u0011\u001aX}JhVr\u001c\u0018DqtK \u0015X\u0002^vQ2fU]i\u0003U\u000b&r3b\u001bc'e\u0005\u0010g\u0005", "/bc6a.!O\"}\u0002^", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri\u001ai\u001f-TC\u0011", "2qP45,@W\"h{_:|\u0018\u0013nn(\u000fO", "", "2qP45,@W\"i\u0005l0\f\r9n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "\u0018", "2qP4G6MO ]~l;x\u0012-e", "=m2.a*>Z", "=m3<j5", ">nX;g", "=m3<j5\u0006Y`M\u0002Jvd", "uI\u0018#", "=m3?T.", "2d[AT", "=m3?T.\u0006Y`M\u0002Jvd", "=m3?T.,b#\n", "=mBAT9M", "AsP?g\u0017HW\"\u000e", "=mBAT9M\u001b\u001fFIe\u0018Gp", "=mBAb7", "=mD=", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private final class TextFieldTextDragObserver implements TextDragObserver {
        private final Function0<Unit> requestFocus;
        private int dragBeginOffsetInText = -1;
        private long dragBeginPosition = Offset.Companion.m3952getUnspecifiedF1C5BW0();
        private long dragTotalDistance = Offset.Companion.m3953getZeroF1C5BW0();
        private Handle actingHandle = Handle.SelectionEnd;

        @Override // androidx.compose.foundation.text.TextDragObserver
        /* JADX INFO: renamed from: onDown-k-4lQ0M */
        public void mo1395onDownk4lQ0M(long j2) {
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        public void onUp() {
        }

        public TextFieldTextDragObserver(Function0<Unit> function0) {
            this.requestFocus = function0;
        }

        private final void onDragStop() {
            if (OffsetKt.m3956isSpecifiedk4lQ0M(this.dragBeginPosition)) {
                TextFieldSelectionStateKt.logDebug(new Function0<String>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldTextDragObserver$onDragStop$1
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Touch.onDragStop";
                    }
                });
                TextFieldSelectionState.this.clearHandleDragging();
                this.dragBeginOffsetInText = -1;
                this.dragBeginPosition = Offset.Companion.m3952getUnspecifiedF1C5BW0();
                this.dragTotalDistance = Offset.Companion.m3953getZeroF1C5BW0();
                TextFieldSelectionState.this.previousRawDragOffset = -1;
                TextFieldSelectionState.this.setDirectDragGestureInitiator(InputType.None);
                this.requestFocus.invoke();
            }
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        public void onStop() {
            onDragStop();
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        public void onCancel() {
            onDragStop();
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        /* JADX INFO: renamed from: onStart-k-4lQ0M */
        public void mo1397onStartk4lQ0M(final long j2) {
            if (TextFieldSelectionState.this.enabled) {
                TextFieldSelectionStateKt.logDebug(new Function0<String>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldTextDragObserver$onStart$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Touch.onDragStart after longPress at " + ((Object) Offset.m3945toStringimpl(j2));
                    }
                });
                TextFieldSelectionState.this.m1608updateHandleDraggingUv8p0NA(this.actingHandle, j2);
                TextFieldSelectionState.this.setShowCursorHandle(false);
                TextFieldSelectionState.this.setDirectDragGestureInitiator(InputType.Touch);
                this.dragBeginPosition = j2;
                this.dragTotalDistance = Offset.Companion.m3953getZeroF1C5BW0();
                TextFieldSelectionState.this.previousRawDragOffset = -1;
                if (!TextFieldSelectionState.this.textLayoutState.m1555isPositionOnTextk4lQ0M(j2)) {
                    int iM1551getOffsetForPosition3MmeM6k$default = TextLayoutState.m1551getOffsetForPosition3MmeM6k$default(TextFieldSelectionState.this.textLayoutState, j2, false, 2, null);
                    HapticFeedback hapticFeedback = TextFieldSelectionState.this.hapticFeedBack;
                    if (hapticFeedback != null) {
                        hapticFeedback.mo4906performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m4915getTextHandleMove5zf0vsI());
                    }
                    TextFieldSelectionState.this.textFieldState.placeCursorBeforeCharAt(iM1551getOffsetForPosition3MmeM6k$default);
                    TextFieldSelectionState.this.setShowCursorHandle(true);
                    TextFieldSelectionState.this.updateTextToolbarState(TextToolbarState.Cursor);
                    return;
                }
                if (TextFieldSelectionState.this.textFieldState.getVisualText().length() == 0) {
                    return;
                }
                int iM1551getOffsetForPosition3MmeM6k$default2 = TextLayoutState.m1551getOffsetForPosition3MmeM6k$default(TextFieldSelectionState.this.textLayoutState, j2, false, 2, null);
                long jM1606updateSelectionSsLRf8$default = TextFieldSelectionState.m1606updateSelectionSsLRf8$default(TextFieldSelectionState.this, new TextFieldCharSequence(TextFieldSelectionState.this.textFieldState.getVisualText(), TextRange.Companion.m6128getZerod9O1mEE(), null, null, 12, null), iM1551getOffsetForPosition3MmeM6k$default2, iM1551getOffsetForPosition3MmeM6k$default2, false, SelectionAdjustment.Companion.getWord(), false, false, 96, null);
                TextFieldSelectionState.this.textFieldState.m1571selectCharsIn5zctL8(jM1606updateSelectionSsLRf8$default);
                TextFieldSelectionState.this.updateTextToolbarState(TextToolbarState.Selection);
                this.dragBeginOffsetInText = TextRange.m6123getStartimpl(jM1606updateSelectionSsLRf8$default);
            }
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        /* JADX INFO: renamed from: onDrag-k-4lQ0M */
        public void mo1396onDragk4lQ0M(long j2) {
            int iIntValue;
            int iM1554getOffsetForPosition3MmeM6k;
            SelectionAdjustment word;
            Handle handle;
            if (TextFieldSelectionState.this.enabled && TextFieldSelectionState.this.textFieldState.getVisualText().length() != 0) {
                long jM3942plusMKHz9U = Offset.m3942plusMKHz9U(this.dragTotalDistance, j2);
                this.dragTotalDistance = jM3942plusMKHz9U;
                final long jM3942plusMKHz9U2 = Offset.m3942plusMKHz9U(this.dragBeginPosition, jM3942plusMKHz9U);
                TextFieldSelectionStateKt.logDebug(new Function0<String>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldTextDragObserver$onDrag$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Touch.onDrag at " + ((Object) Offset.m3945toStringimpl(jM3942plusMKHz9U2));
                    }
                });
                if (this.dragBeginOffsetInText < 0 && !TextFieldSelectionState.this.textLayoutState.m1555isPositionOnTextk4lQ0M(jM3942plusMKHz9U2)) {
                    iIntValue = TextLayoutState.m1551getOffsetForPosition3MmeM6k$default(TextFieldSelectionState.this.textLayoutState, this.dragBeginPosition, false, 2, null);
                    iM1554getOffsetForPosition3MmeM6k = TextLayoutState.m1551getOffsetForPosition3MmeM6k$default(TextFieldSelectionState.this.textLayoutState, jM3942plusMKHz9U2, false, 2, null);
                    if (iIntValue == iM1554getOffsetForPosition3MmeM6k) {
                        word = SelectionAdjustment.Companion.getNone();
                    } else {
                        word = SelectionAdjustment.Companion.getWord();
                    }
                } else {
                    Integer numValueOf = Integer.valueOf(this.dragBeginOffsetInText);
                    if (numValueOf.intValue() < 0) {
                        numValueOf = null;
                    }
                    iIntValue = numValueOf != null ? numValueOf.intValue() : TextFieldSelectionState.this.textLayoutState.m1554getOffsetForPosition3MmeM6k(this.dragBeginPosition, false);
                    iM1554getOffsetForPosition3MmeM6k = TextFieldSelectionState.this.textLayoutState.m1554getOffsetForPosition3MmeM6k(jM3942plusMKHz9U2, false);
                    if (this.dragBeginOffsetInText < 0 && iIntValue == iM1554getOffsetForPosition3MmeM6k) {
                        return;
                    }
                    word = SelectionAdjustment.Companion.getWord();
                    TextFieldSelectionState.this.updateTextToolbarState(TextToolbarState.Selection);
                }
                long jM1446getSelectiond9O1mEE = TextFieldSelectionState.this.textFieldState.getVisualText().m1446getSelectiond9O1mEE();
                TextFieldSelectionState textFieldSelectionState = TextFieldSelectionState.this;
                long jM1606updateSelectionSsLRf8$default = TextFieldSelectionState.m1606updateSelectionSsLRf8$default(textFieldSelectionState, textFieldSelectionState.textFieldState.getVisualText(), iIntValue, iM1554getOffsetForPosition3MmeM6k, false, word, false, false, 64, null);
                if (this.dragBeginOffsetInText == -1 && !TextRange.m6117getCollapsedimpl(jM1606updateSelectionSsLRf8$default)) {
                    this.dragBeginOffsetInText = TextRange.m6123getStartimpl(jM1606updateSelectionSsLRf8$default);
                }
                if (TextRange.m6122getReversedimpl(jM1606updateSelectionSsLRf8$default)) {
                    jM1606updateSelectionSsLRf8$default = TextFieldSelectionStateKt.m1622reverse5zctL8(jM1606updateSelectionSsLRf8$default);
                }
                if (!TextRange.m6116equalsimpl0(jM1606updateSelectionSsLRf8$default, jM1446getSelectiond9O1mEE)) {
                    if (TextRange.m6123getStartimpl(jM1606updateSelectionSsLRf8$default) != TextRange.m6123getStartimpl(jM1446getSelectiond9O1mEE) && TextRange.m6118getEndimpl(jM1606updateSelectionSsLRf8$default) == TextRange.m6118getEndimpl(jM1446getSelectiond9O1mEE)) {
                        handle = Handle.SelectionStart;
                    } else if ((TextRange.m6123getStartimpl(jM1606updateSelectionSsLRf8$default) == TextRange.m6123getStartimpl(jM1446getSelectiond9O1mEE) && TextRange.m6118getEndimpl(jM1606updateSelectionSsLRf8$default) != TextRange.m6118getEndimpl(jM1446getSelectiond9O1mEE)) || (TextRange.m6123getStartimpl(jM1606updateSelectionSsLRf8$default) + TextRange.m6118getEndimpl(jM1606updateSelectionSsLRf8$default)) / 2.0f > (TextRange.m6123getStartimpl(jM1446getSelectiond9O1mEE) + TextRange.m6118getEndimpl(jM1446getSelectiond9O1mEE)) / 2.0f) {
                        handle = Handle.SelectionEnd;
                    } else {
                        handle = Handle.SelectionStart;
                    }
                    this.actingHandle = handle;
                }
                if (TextRange.m6117getCollapsedimpl(jM1446getSelectiond9O1mEE) || !TextRange.m6117getCollapsedimpl(jM1606updateSelectionSsLRf8$default)) {
                    TextFieldSelectionState.this.textFieldState.m1571selectCharsIn5zctL8(jM1606updateSelectionSsLRf8$default);
                }
                TextFieldSelectionState.this.m1608updateHandleDraggingUv8p0NA(this.actingHandle, jM3942plusMKHz9U2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object detectSelectionHandleDragGestures(androidx.compose.ui.input.pointer.PointerInputScope r20, boolean r21, kotlin.coroutines.Continuation<? super kotlin.Unit> r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.detectSelectionHandleDragGestures(androidx.compose.ui.input.pointer.PointerInputScope, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void detectSelectionHandleDragGestures$onDragStop$5(Ref.LongRef longRef, TextFieldSelectionState textFieldSelectionState, Ref.LongRef longRef2) {
        if (OffsetKt.m3956isSpecifiedk4lQ0M(longRef.element)) {
            textFieldSelectionState.clearHandleDragging();
            longRef.element = Offset.Companion.m3952getUnspecifiedF1C5BW0();
            longRef2.element = Offset.Companion.m3953getZeroF1C5BW0();
            textFieldSelectionState.previousRawDragOffset = -1;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectSelectionHandleDragGestures$2 */
    /* JADX INFO: compiled from: TextFieldSelectionState.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,i\bӵLc\u000b\u0004I\u00066\u000b<Ȑ\u0017\"Z\u0011(\u000btjQ0rf\u000f6ʂW,\u0015m\n7"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "7me<^,\u0006Y`M\u0002Jvd", "uI\u0018#"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C05562 extends Lambda implements Function1<Offset, Unit> {
        final /* synthetic */ Ref.LongRef $dragTotalDistance;
        final /* synthetic */ Handle $handle;
        final /* synthetic */ boolean $isStartHandle;
        final /* synthetic */ TextFieldSelectionState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05562(TextFieldSelectionState textFieldSelectionState, boolean z2, Handle handle, Ref.LongRef longRef) {
            super(1);
            textFieldSelectionState = textFieldSelectionState;
            z = z2;
            handle = handle;
            longRef = longRef;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
            m1617invokek4lQ0M(offset.m3947unboximpl());
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke-k-4lQ0M */
        public final void m1617invokek4lQ0M(long j2) {
            longRef.element = SelectionHandlesKt.m1681getAdjustedCoordinatesk4lQ0M(textFieldSelectionState.m1598getHandlePositiontuRUvjQ(z));
            textFieldSelectionState.m1608updateHandleDraggingUv8p0NA(handle, longRef.element);
            longRef.element = Offset.Companion.m3953getZeroF1C5BW0();
            textFieldSelectionState.previousRawDragOffset = -1;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectSelectionHandleDragGestures$3 */
    /* JADX INFO: compiled from: TextFieldSelectionState.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,i\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C05573 extends Lambda implements Function0<Unit> {
        final /* synthetic */ Ref.LongRef $dragTotalDistance;
        final /* synthetic */ TextFieldSelectionState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05573(TextFieldSelectionState textFieldSelectionState, Ref.LongRef longRef) {
            super(0);
            textFieldSelectionState = textFieldSelectionState;
            longRef = longRef;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
            TextFieldSelectionState.detectSelectionHandleDragGestures$onDragStop$5(longRef, textFieldSelectionState, longRef);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectSelectionHandleDragGestures$4 */
    /* JADX INFO: compiled from: TextFieldSelectionState.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,i\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C05584 extends Lambda implements Function0<Unit> {
        final /* synthetic */ Ref.LongRef $dragTotalDistance;
        final /* synthetic */ TextFieldSelectionState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05584(TextFieldSelectionState textFieldSelectionState, Ref.LongRef longRef) {
            super(0);
            textFieldSelectionState = textFieldSelectionState;
            longRef = longRef;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
            TextFieldSelectionState.detectSelectionHandleDragGestures$onDragStop$5(longRef, textFieldSelectionState, longRef);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectSelectionHandleDragGestures$5 */
    /* JADX INFO: compiled from: TextFieldSelectionState.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0018\u001d̉=!,i\bӵLc\u000b\u0004Iي8\u000bDB\u0007\"2\u0012\u0006ј~jg/tiV.jSX\u0010\u001c\u007fB&s$ F\u0002]۟\u0002$\u000fS\\l"}, d2 = {"\n`]<a@F])\rS", "", "\n`]<a@F])\r5i(\n\u00057e\u000f(\tzKo", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018' xp\u0017\n_5Pv|", "2d[AT", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "7me<^,\u0006C*Q\u0006)\u0015X", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001b R\u007f\u001d\u0006\u0002/9b\r D7\u00018QLJkA\u0002\u001esqHdf(Wx'\u001d1\u0012\u001d"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C05595 extends Lambda implements Function2<PointerInputChange, Offset, Unit> {
        final /* synthetic */ Ref.LongRef $dragBeginPosition;
        final /* synthetic */ Handle $handle;
        final /* synthetic */ boolean $isStartHandle;
        final /* synthetic */ TextFieldSelectionState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05595(TextFieldSelectionState textFieldSelectionState, Handle handle, Ref.LongRef longRef, boolean z2) {
            super(2);
            textFieldSelectionState = textFieldSelectionState;
            handle = handle;
            longRef = longRef;
            z = z2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange, Offset offset) {
            m1618invokeUv8p0NA(pointerInputChange, offset.m3947unboximpl());
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke-Uv8p0NA */
        public final void m1618invokeUv8p0NA(PointerInputChange pointerInputChange, long j2) {
            int iM6123getStartimpl;
            int iM6095getOffsetForPositionk4lQ0M;
            Ref.LongRef longRef = longRef;
            longRef.element = Offset.m3942plusMKHz9U(longRef.element, j2);
            TextLayoutResult layoutResult = textFieldSelectionState.textLayoutState.getLayoutResult();
            if (layoutResult == null) {
                return;
            }
            textFieldSelectionState.m1608updateHandleDraggingUv8p0NA(handle, Offset.m3942plusMKHz9U(longRef.element, longRef.element));
            if (!z) {
                iM6123getStartimpl = TextRange.m6123getStartimpl(textFieldSelectionState.textFieldState.getVisualText().m1446getSelectiond9O1mEE());
            } else {
                iM6123getStartimpl = layoutResult.m6095getOffsetForPositionk4lQ0M(textFieldSelectionState.m1607getHandleDragPositionF1C5BW0());
            }
            if (z) {
                iM6095getOffsetForPositionk4lQ0M = TextRange.m6118getEndimpl(textFieldSelectionState.textFieldState.getVisualText().m1446getSelectiond9O1mEE());
            } else {
                iM6095getOffsetForPositionk4lQ0M = layoutResult.m6095getOffsetForPositionk4lQ0M(textFieldSelectionState.m1607getHandleDragPositionF1C5BW0());
            }
            long jM1446getSelectiond9O1mEE = textFieldSelectionState.textFieldState.getVisualText().m1446getSelectiond9O1mEE();
            TextFieldSelectionState textFieldSelectionState = textFieldSelectionState;
            long jM1606updateSelectionSsLRf8$default = TextFieldSelectionState.m1606updateSelectionSsLRf8$default(textFieldSelectionState, textFieldSelectionState.textFieldState.getVisualText(), iM6123getStartimpl, iM6095getOffsetForPositionk4lQ0M, z, SelectionAdjustment.Companion.getCharacterWithWordAccelerate(), false, false, 96, null);
            if (TextRange.m6117getCollapsedimpl(jM1446getSelectiond9O1mEE) || !TextRange.m6117getCollapsedimpl(jM1606updateSelectionSsLRf8$default)) {
                textFieldSelectionState.textFieldState.m1571selectCharsIn5zctL8(jM1606updateSelectionSsLRf8$default);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectSelectionHandleDragGestures$6 */
    /* JADX INFO: compiled from: TextFieldSelectionState.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass6 extends Lambda implements Function0<String> {
        final /* synthetic */ Handle $handle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass6(Handle handle) {
            super(0);
            handle = handle;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Selection Handle drag cancelled for draggingHandle: " + TextFieldSelectionState.this.getDraggingHandle() + " definedOn: " + handle;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeTextChanges$2 */
    /* JADX INFO: compiled from: TextFieldSelectionState.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!4i\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r*kG-ula@\u0006A/J\u0004\u0015GX^,ePr\u0013", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C05662 extends Lambda implements Function0<TextFieldCharSequence> {
        C05662() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final TextFieldCharSequence invoke() {
            return TextFieldSelectionState.this.textFieldState.getVisualText();
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeTextChanges$3 */
    /* JADX INFO: compiled from: TextFieldSelectionState.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    /* synthetic */ class C05673 extends FunctionReferenceImpl implements Function2<TextFieldCharSequence, CharSequence, Boolean> {
        public static final C05673 INSTANCE = new C05673();

        C05673() {
            super(2, TextFieldCharSequence.class, "contentEquals", "contentEquals(Ljava/lang/CharSequence;)Z", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Boolean invoke(TextFieldCharSequence textFieldCharSequence, CharSequence charSequence) {
            return Boolean.valueOf(textFieldCharSequence.contentEquals(charSequence));
        }
    }

    public final Object observeTextChanges(Continuation<? super Unit> continuation) {
        Object objCollect = FlowKt.drop(FlowKt.distinctUntilChanged(SnapshotStateKt.snapshotFlow(new Function0<TextFieldCharSequence>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.observeTextChanges.2
            C05662() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final TextFieldCharSequence invoke() {
                return TextFieldSelectionState.this.textFieldState.getVisualText();
            }
        }), C05673.INSTANCE), 1).collect(new FlowCollector() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.observeTextChanges.4
            C05684() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation2) {
                return emit((TextFieldCharSequence) obj, (Continuation<? super Unit>) continuation2);
            }

            public final Object emit(TextFieldCharSequence textFieldCharSequence, Continuation<? super Unit> continuation2) {
                TextFieldSelectionState.this.setShowCursorHandle(false);
                TextFieldSelectionState.this.updateTextToolbarState(TextToolbarState.None);
                return Unit.INSTANCE;
            }
        }, continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeTextChanges$4 */
    /* JADX INFO: compiled from: TextFieldSelectionState.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,i\bӵLc\u000b\u0004I\u00066\u000b<Ȑ\u0017\"Z\u0011(\u000btjQ0rf\u000f\u0097\u0011ޚ.\u0011q}B'"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r*kG-ula@\u0006A/J\u0004\u0015GX^,ePr\u0013", "3lXA", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001q\u001f9]R\u0005Z41$Ie9\u000eb\nQr45LZ<\\[p=ix`\u0018]2\u0011\u000e#?.{NG.\f5I\u0010\u0005F\u000b\u0015%\u0012>zlQZ\u001aPOX\\F%yB#fuPC\u000fL'i\f],2"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C05684<T> implements FlowCollector {
        C05684() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation2) {
            return emit((TextFieldCharSequence) obj, (Continuation<? super Unit>) continuation2);
        }

        public final Object emit(TextFieldCharSequence textFieldCharSequence, Continuation<? super Unit> continuation2) {
            TextFieldSelectionState.this.setShowCursorHandle(false);
            TextFieldSelectionState.this.updateTextToolbarState(TextToolbarState.None);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeTextToolbarVisibility$2 */
    /* JADX INFO: compiled from: TextFieldSelectionState.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!4i\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C05692 extends Lambda implements Function0<Rect> {
        C05692() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Rect invoke() {
            Rect rectIntersect;
            boolean zM6117getCollapsedimpl = TextRange.m6117getCollapsedimpl(TextFieldSelectionState.this.textFieldState.getVisualText().m1446getSelectiond9O1mEE());
            if (((zM6117getCollapsedimpl && TextFieldSelectionState.this.getTextToolbarState() == TextToolbarState.Cursor) || (!zM6117getCollapsedimpl && TextFieldSelectionState.this.getTextToolbarState() == TextToolbarState.Selection)) && TextFieldSelectionState.this.getDraggingHandle() == null && TextFieldSelectionState.this.isInTouchMode()) {
                LayoutCoordinates textLayoutCoordinates = TextFieldSelectionState.this.getTextLayoutCoordinates();
                Rect rectVisibleBounds = textLayoutCoordinates != null ? SelectionManagerKt.visibleBounds(textLayoutCoordinates) : null;
                if (rectVisibleBounds != null) {
                    LayoutCoordinates textLayoutCoordinates2 = TextFieldSelectionState.this.getTextLayoutCoordinates();
                    Offset offsetM3926boximpl = textLayoutCoordinates2 != null ? Offset.m3926boximpl(textLayoutCoordinates2.mo5525localToRootMKHz9U(rectVisibleBounds.m3972getTopLeftF1C5BW0())) : null;
                    Intrinsics.checkNotNull(offsetM3926boximpl);
                    Rect rectM3977Recttz77jQw = RectKt.m3977Recttz77jQw(offsetM3926boximpl.m3947unboximpl(), rectVisibleBounds.m3970getSizeNHjbRc());
                    Rect contentRect = TextFieldSelectionState.this.getContentRect();
                    Rect rect = rectM3977Recttz77jQw.overlaps(contentRect) ? contentRect : null;
                    if (rect != null && (rectIntersect = rect.intersect(rectM3977Recttz77jQw)) != null) {
                        return rectIntersect;
                    }
                    return Rect.Companion.getZero();
                }
                return Rect.Companion.getZero();
            }
            return Rect.Companion.getZero();
        }
    }

    public final Object observeTextToolbarVisibility(Continuation<? super Unit> continuation) {
        Object objCollect = SnapshotStateKt.snapshotFlow(new Function0<Rect>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.observeTextToolbarVisibility.2
            C05692() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Rect invoke() {
                Rect rectIntersect;
                boolean zM6117getCollapsedimpl = TextRange.m6117getCollapsedimpl(TextFieldSelectionState.this.textFieldState.getVisualText().m1446getSelectiond9O1mEE());
                if (((zM6117getCollapsedimpl && TextFieldSelectionState.this.getTextToolbarState() == TextToolbarState.Cursor) || (!zM6117getCollapsedimpl && TextFieldSelectionState.this.getTextToolbarState() == TextToolbarState.Selection)) && TextFieldSelectionState.this.getDraggingHandle() == null && TextFieldSelectionState.this.isInTouchMode()) {
                    LayoutCoordinates textLayoutCoordinates = TextFieldSelectionState.this.getTextLayoutCoordinates();
                    Rect rectVisibleBounds = textLayoutCoordinates != null ? SelectionManagerKt.visibleBounds(textLayoutCoordinates) : null;
                    if (rectVisibleBounds != null) {
                        LayoutCoordinates textLayoutCoordinates2 = TextFieldSelectionState.this.getTextLayoutCoordinates();
                        Offset offsetM3926boximpl = textLayoutCoordinates2 != null ? Offset.m3926boximpl(textLayoutCoordinates2.mo5525localToRootMKHz9U(rectVisibleBounds.m3972getTopLeftF1C5BW0())) : null;
                        Intrinsics.checkNotNull(offsetM3926boximpl);
                        Rect rectM3977Recttz77jQw = RectKt.m3977Recttz77jQw(offsetM3926boximpl.m3947unboximpl(), rectVisibleBounds.m3970getSizeNHjbRc());
                        Rect contentRect = TextFieldSelectionState.this.getContentRect();
                        Rect rect = rectM3977Recttz77jQw.overlaps(contentRect) ? contentRect : null;
                        if (rect != null && (rectIntersect = rect.intersect(rectM3977Recttz77jQw)) != null) {
                            return rectIntersect;
                        }
                        return Rect.Companion.getZero();
                    }
                    return Rect.Companion.getZero();
                }
                return Rect.Companion.getZero();
            }
        }).collect(new FlowCollector() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.observeTextToolbarVisibility.3
            C05703() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation2) {
                return emit((Rect) obj, (Continuation<? super Unit>) continuation2);
            }

            public final Object emit(Rect rect, Continuation<? super Unit> continuation2) {
                if (Intrinsics.areEqual(rect, Rect.Companion.getZero())) {
                    TextFieldSelectionState.this.hideTextToolbar();
                } else {
                    TextFieldSelectionState.this.showTextToolbar(rect);
                }
                return Unit.INSTANCE;
            }
        }, continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeTextToolbarVisibility$3 */
    /* JADX INFO: compiled from: TextFieldSelectionState.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,i\bӵLc\u000b\u0004I\u00066\u000b<Ȑ\u0017\"Z\u0011(\u000btjQ0rf\u000f\u0097\u0011ޚ.\u0011q}B'"}, d2 = {"\n`]<a@F])\rS", "", "@dRA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "3lXA", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019\u0017Qw\u000eK\u00049~F}\u001eFC|4WRBo=g\u0013rnC\u0017r0Wv5\u0011*X5kV{M\u0010!^\u0018W\u0001Pk^=5j\u000e>\u001b\u0011.\u0013k8m\u0001\n%c"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C05703<T> implements FlowCollector {
        C05703() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation2) {
            return emit((Rect) obj, (Continuation<? super Unit>) continuation2);
        }

        public final Object emit(Rect rect, Continuation<? super Unit> continuation2) {
            if (Intrinsics.areEqual(rect, Rect.Companion.getZero())) {
                TextFieldSelectionState.this.hideTextToolbar();
            } else {
                TextFieldSelectionState.this.showTextToolbar(rect);
            }
            return Unit.INSTANCE;
        }
    }

    public final Rect getContentRect() {
        float fM3938getYimpl;
        Rect cursorRect;
        Rect cursorRect2;
        TextFieldCharSequence visualText = this.textFieldState.getVisualText();
        if (TextRange.m6117getCollapsedimpl(visualText.m1446getSelectiond9O1mEE())) {
            Rect cursorRect3 = getCursorRect();
            LayoutCoordinates textLayoutCoordinates = getTextLayoutCoordinates();
            return RectKt.m3977Recttz77jQw(textLayoutCoordinates != null ? textLayoutCoordinates.mo5525localToRootMKHz9U(cursorRect3.m3972getTopLeftF1C5BW0()) : Offset.Companion.m3953getZeroF1C5BW0(), cursorRect3.m3970getSizeNHjbRc());
        }
        LayoutCoordinates textLayoutCoordinates2 = getTextLayoutCoordinates();
        long jMo5525localToRootMKHz9U = textLayoutCoordinates2 != null ? textLayoutCoordinates2.mo5525localToRootMKHz9U(m1598getHandlePositiontuRUvjQ(true)) : Offset.Companion.m3953getZeroF1C5BW0();
        LayoutCoordinates textLayoutCoordinates3 = getTextLayoutCoordinates();
        long jMo5525localToRootMKHz9U2 = textLayoutCoordinates3 != null ? textLayoutCoordinates3.mo5525localToRootMKHz9U(m1598getHandlePositiontuRUvjQ(false)) : Offset.Companion.m3953getZeroF1C5BW0();
        LayoutCoordinates textLayoutCoordinates4 = getTextLayoutCoordinates();
        float fM3938getYimpl2 = 0.0f;
        if (textLayoutCoordinates4 != null) {
            TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
            fM3938getYimpl = Offset.m3938getYimpl(textLayoutCoordinates4.mo5525localToRootMKHz9U(OffsetKt.Offset(0.0f, (layoutResult == null || (cursorRect2 = layoutResult.getCursorRect(TextRange.m6123getStartimpl(visualText.m1446getSelectiond9O1mEE()))) == null) ? 0.0f : cursorRect2.getTop())));
        } else {
            fM3938getYimpl = 0.0f;
        }
        LayoutCoordinates textLayoutCoordinates5 = getTextLayoutCoordinates();
        if (textLayoutCoordinates5 != null) {
            TextLayoutResult layoutResult2 = this.textLayoutState.getLayoutResult();
            fM3938getYimpl2 = Offset.m3938getYimpl(textLayoutCoordinates5.mo5525localToRootMKHz9U(OffsetKt.Offset(0.0f, (layoutResult2 == null || (cursorRect = layoutResult2.getCursorRect(TextRange.m6118getEndimpl(visualText.m1446getSelectiond9O1mEE()))) == null) ? 0.0f : cursorRect.getTop())));
        }
        return new Rect(Math.min(Offset.m3937getXimpl(jMo5525localToRootMKHz9U), Offset.m3937getXimpl(jMo5525localToRootMKHz9U2)), Math.min(fM3938getYimpl, fM3938getYimpl2), Math.max(Offset.m3937getXimpl(jMo5525localToRootMKHz9U), Offset.m3937getXimpl(jMo5525localToRootMKHz9U2)), Math.max(Offset.m3938getYimpl(jMo5525localToRootMKHz9U), Offset.m3938getYimpl(jMo5525localToRootMKHz9U2)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0050, code lost:
    
        if (((r0 == null || (r0 = androidx.compose.foundation.text.selection.SelectionManagerKt.visibleBounds(r0)) == null) ? false : androidx.compose.foundation.text.selection.SelectionManagerKt.m1718containsInclusiveUv8p0NA(r0, r6)) != false) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState getSelectionHandleState$foundation_release(boolean r12, boolean r13) {
        /*
            r11 = this;
            if (r12 == 0) goto L13
            androidx.compose.foundation.text.Handle r5 = androidx.compose.foundation.text.Handle.SelectionStart
        L4:
            androidx.compose.foundation.text.input.internal.TextLayoutState r0 = r11.textLayoutState
            androidx.compose.ui.text.TextLayoutResult r2 = r0.getLayoutResult()
            if (r2 != 0) goto L16
            androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState$Companion r0 = androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState.Companion
            androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState r0 = r0.getHidden()
            return r0
        L13:
            androidx.compose.foundation.text.Handle r5 = androidx.compose.foundation.text.Handle.SelectionEnd
            goto L4
        L16:
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState r0 = r11.textFieldState
            androidx.compose.foundation.text.input.TextFieldCharSequence r0 = r0.getVisualText()
            long r3 = r0.m1446getSelectiond9O1mEE()
            boolean r0 = androidx.compose.ui.text.TextRange.m6117getCollapsedimpl(r3)
            if (r0 == 0) goto L2d
            androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState$Companion r0 = androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState.Companion
            androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState r0 = r0.getHidden()
            return r0
        L2d:
            long r6 = r11.m1598getHandlePositiontuRUvjQ(r12)
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$InputType r1 = r11.getDirectDragGestureInitiator()
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$InputType r0 = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.InputType.None
            if (r1 != r0) goto La1
            androidx.compose.foundation.text.Handle r0 = r11.getDraggingHandle()
            r1 = 0
            if (r0 == r5) goto L52
            androidx.compose.ui.layout.LayoutCoordinates r0 = r11.getTextLayoutCoordinates()
            if (r0 == 0) goto L65
            androidx.compose.ui.geometry.Rect r0 = androidx.compose.foundation.text.selection.SelectionManagerKt.visibleBounds(r0)
            if (r0 == 0) goto L65
            boolean r0 = androidx.compose.foundation.text.selection.SelectionManagerKt.m1718containsInclusiveUv8p0NA(r0, r6)
        L50:
            if (r0 == 0) goto La1
        L52:
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState r0 = r11.textFieldState
            androidx.compose.foundation.text.input.TextFieldCharSequence r0 = r0.getVisualText()
            boolean r0 = r0.shouldShowSelection()
            if (r0 != 0) goto L67
            androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState$Companion r0 = androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState.Companion
            androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState r0 = r0.getHidden()
            return r0
        L65:
            r0 = r1
            goto L50
        L67:
            if (r12 == 0) goto L96
            int r0 = androidx.compose.ui.text.TextRange.m6123getStartimpl(r3)
        L6d:
            androidx.compose.ui.text.style.ResolvedTextDirection r8 = r2.getBidiRunDirection(r0)
            boolean r9 = androidx.compose.ui.text.TextRange.m6122getReversedimpl(r3)
            if (r13 == 0) goto L8f
            androidx.compose.ui.layout.LayoutCoordinates r0 = r11.getTextLayoutCoordinates()
            if (r0 == 0) goto L87
            androidx.compose.ui.geometry.Rect r0 = androidx.compose.foundation.text.selection.SelectionManagerKt.visibleBounds(r0)
            if (r0 == 0) goto L87
            long r6 = androidx.compose.foundation.text.input.internal.TextLayoutStateKt.m1558coerceIn3MmeM6k(r6, r0)
        L87:
            androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState r4 = new androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState
            r5 = 1
            r10 = 0
            r4.<init>(r5, r6, r8, r9, r10)
            return r4
        L8f:
            androidx.compose.ui.geometry.Offset$Companion r0 = androidx.compose.ui.geometry.Offset.Companion
            long r6 = r0.m3952getUnspecifiedF1C5BW0()
            goto L87
        L96:
            int r0 = androidx.compose.ui.text.TextRange.m6118getEndimpl(r3)
            int r0 = r0 + (-1)
            int r0 = java.lang.Math.max(r0, r1)
            goto L6d
        La1:
            androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState$Companion r0 = androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState.Companion
            androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState r0 = r0.getHidden()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.getSelectionHandleState$foundation_release(boolean, boolean):androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState");
    }

    /* JADX INFO: renamed from: getHandlePosition-tuRUvjQ */
    public final long m1598getHandlePositiontuRUvjQ(boolean z2) {
        int iM6118getEndimpl;
        TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            return Offset.Companion.m3953getZeroF1C5BW0();
        }
        long jM1446getSelectiond9O1mEE = this.textFieldState.getVisualText().m1446getSelectiond9O1mEE();
        if (z2) {
            iM6118getEndimpl = TextRange.m6123getStartimpl(jM1446getSelectiond9O1mEE);
        } else {
            iM6118getEndimpl = TextRange.m6118getEndimpl(jM1446getSelectiond9O1mEE);
        }
        return TextSelectionDelegateKt.getSelectionHandleCoordinates(layoutResult, iM6118getEndimpl, z2, TextRange.m6122getReversedimpl(jM1446getSelectiond9O1mEE));
    }

    /* JADX INFO: renamed from: updateHandleDragging-Uv8p0NA */
    public final void m1608updateHandleDraggingUv8p0NA(Handle handle, long j2) {
        setDraggingHandle(handle);
        m1603setRawHandleDragPositionk4lQ0M(j2);
    }

    public final void markStartContentVisibleOffset() {
        m1604setStartTextLayoutPositionInWindowk4lQ0M(m1597getCurrentTextLayoutPositionInWindowF1C5BW0());
    }

    public final void clearHandleDragging() {
        setDraggingHandle(null);
        m1603setRawHandleDragPositionk4lQ0M(Offset.Companion.m3952getUnspecifiedF1C5BW0());
        m1604setStartTextLayoutPositionInWindowk4lQ0M(Offset.Companion.m3952getUnspecifiedF1C5BW0());
    }

    public final boolean canCut() {
        return (TextRange.m6117getCollapsedimpl(this.textFieldState.getVisualText().m1446getSelectiond9O1mEE()) || !getEditable() || this.isPassword) ? false : true;
    }

    public final void cut() {
        TextFieldCharSequence visualText = this.textFieldState.getVisualText();
        if (TextRange.m6117getCollapsedimpl(visualText.m1446getSelectiond9O1mEE())) {
            return;
        }
        ClipboardManager clipboardManager = this.clipboardManager;
        if (clipboardManager != null) {
            clipboardManager.setText(new AnnotatedString(TextFieldCharSequenceKt.getSelectedText(visualText).toString(), null, null, 6, null));
        }
        this.textFieldState.deleteSelectedText();
    }

    public final boolean canCopy() {
        return (TextRange.m6117getCollapsedimpl(this.textFieldState.getVisualText().m1446getSelectiond9O1mEE()) || this.isPassword) ? false : true;
    }

    public static /* synthetic */ void copy$default(TextFieldSelectionState textFieldSelectionState, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        textFieldSelectionState.copy(z2);
    }

    public final void copy(boolean z2) {
        TextFieldCharSequence visualText = this.textFieldState.getVisualText();
        if (TextRange.m6117getCollapsedimpl(visualText.m1446getSelectiond9O1mEE())) {
            return;
        }
        ClipboardManager clipboardManager = this.clipboardManager;
        if (clipboardManager != null) {
            clipboardManager.setText(new AnnotatedString(TextFieldCharSequenceKt.getSelectedText(visualText).toString(), null, null, 6, null));
        }
        if (z2) {
            this.textFieldState.collapseSelectionToMax();
        }
    }

    public final boolean canPaste() {
        if (!getEditable()) {
            return false;
        }
        ClipboardManager clipboardManager = this.clipboardManager;
        if (clipboardManager != null && clipboardManager.hasText()) {
            return true;
        }
        Function0<? extends ReceiveContentConfiguration> function0 = this.receiveContentConfiguration;
        if ((function0 != null ? function0.invoke() : null) == null) {
            return false;
        }
        ClipboardManager clipboardManager2 = this.clipboardManager;
        return (clipboardManager2 != null ? clipboardManager2.getClip() : null) != null;
    }

    public final void paste() {
        ReceiveContentConfiguration receiveContentConfigurationInvoke;
        ClipEntry clip;
        ClipEntry clipEntry;
        String plainText;
        Function0<? extends ReceiveContentConfiguration> function0 = this.receiveContentConfiguration;
        if (function0 == null || (receiveContentConfigurationInvoke = function0.invoke()) == null) {
            pasteAsPlainText();
            return;
        }
        ClipboardManager clipboardManager = this.clipboardManager;
        if (clipboardManager == null || (clip = clipboardManager.getClip()) == null) {
            pasteAsPlainText();
            return;
        }
        TransferableContent transferableContentOnReceive = receiveContentConfigurationInvoke.getReceiveContentListener().onReceive(new TransferableContent(clip, clip.getClipMetadata(), TransferableContent.Source.Companion.m673getClipboardkB6V9T0(), null, 8, null));
        if (transferableContentOnReceive == null || (clipEntry = transferableContentOnReceive.getClipEntry()) == null || (plainText = TransferableContent_androidKt.readPlainText(clipEntry)) == null) {
            return;
        }
        TransformedTextFieldState.replaceSelectedText$default(this.textFieldState, plainText, false, TextFieldEditUndoBehavior.NeverMerge, 2, null);
    }

    private final void pasteAsPlainText() {
        AnnotatedString text;
        String text2;
        ClipboardManager clipboardManager = this.clipboardManager;
        if (clipboardManager == null || (text = clipboardManager.getText()) == null || (text2 = text.getText()) == null) {
            return;
        }
        TransformedTextFieldState.replaceSelectedText$default(this.textFieldState, text2, false, TextFieldEditUndoBehavior.NeverMerge, 2, null);
    }

    public final boolean canSelectAll() {
        return TextRange.m6119getLengthimpl(this.textFieldState.getVisualText().m1446getSelectiond9O1mEE()) != this.textFieldState.getVisualText().length();
    }

    public final void selectAll() {
        this.textFieldState.selectAll();
    }

    public final void showTextToolbar(Rect rect) {
        TextToolbar textToolbar = this.textToolbar;
        if (textToolbar != null) {
            boolean zCanCopy = canCopy();
            final TextToolbarState textToolbarState = TextToolbarState.None;
            Function0<Unit> function0 = !zCanCopy ? null : new Function0<Unit>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$showTextToolbar$$inlined$menuItem$1
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
                    TextFieldSelectionState.copy$default(this, false, 1, null);
                    this.this$0$inline_fun.updateTextToolbarState(textToolbarState);
                }
            };
            boolean zCanPaste = canPaste();
            final TextToolbarState textToolbarState2 = TextToolbarState.None;
            Function0<Unit> function02 = !zCanPaste ? null : new Function0<Unit>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$showTextToolbar$$inlined$menuItem$2
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
                    this.paste();
                    this.this$0$inline_fun.updateTextToolbarState(textToolbarState2);
                }
            };
            boolean zCanCut = canCut();
            final TextToolbarState textToolbarState3 = TextToolbarState.None;
            Function0<Unit> function03 = !zCanCut ? null : new Function0<Unit>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$showTextToolbar$$inlined$menuItem$3
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
                    this.cut();
                    this.this$0$inline_fun.updateTextToolbarState(textToolbarState3);
                }
            };
            boolean zCanSelectAll = canSelectAll();
            final TextToolbarState textToolbarState4 = TextToolbarState.Selection;
            textToolbar.showMenu(rect, function0, function02, function03, zCanSelectAll ? new Function0<Unit>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$showTextToolbar$$inlined$menuItem$4
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
                    this.selectAll();
                    this.this$0$inline_fun.updateTextToolbarState(textToolbarState4);
                }
            } : null);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$menuItem$1 */
    /* JADX INFO: compiled from: TextFieldSelectionState.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,i\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class C05631 extends Lambda implements Function0<Unit> {
        final /* synthetic */ TextToolbarState $desiredState;
        final /* synthetic */ Function0<Unit> $operation;
        final /* synthetic */ TextFieldSelectionState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05631(Function0<Unit> function0, TextFieldSelectionState textFieldSelectionState, TextToolbarState textToolbarState) {
            super(0);
            function0 = function0;
            textFieldSelectionState = textFieldSelectionState;
            textToolbarState = textToolbarState;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
            function0.invoke();
            textFieldSelectionState.updateTextToolbarState(textToolbarState);
        }
    }

    private final Function0<Unit> menuItem(boolean z2, TextToolbarState textToolbarState, Function0<Unit> function0) {
        if (z2) {
            return new Function0<Unit>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.menuItem.1
                final /* synthetic */ TextToolbarState $desiredState;
                final /* synthetic */ Function0<Unit> $operation;
                final /* synthetic */ TextFieldSelectionState this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C05631(Function0<Unit> function02, TextFieldSelectionState this, TextToolbarState textToolbarState2) {
                    super(0);
                    function0 = function02;
                    textFieldSelectionState = this;
                    textToolbarState = textToolbarState2;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke */
                public final void invoke2() {
                    function0.invoke();
                    textFieldSelectionState.updateTextToolbarState(textToolbarState);
                }
            };
        }
        return null;
    }

    public final void deselect() {
        if (!TextRange.m6117getCollapsedimpl(this.textFieldState.getVisualText().m1446getSelectiond9O1mEE())) {
            this.textFieldState.collapseSelectionToEnd();
        }
        setShowCursorHandle(false);
        updateTextToolbarState(TextToolbarState.None);
    }

    public final void hideTextToolbar() {
        TextToolbar textToolbar;
        TextToolbar textToolbar2 = this.textToolbar;
        if ((textToolbar2 != null ? textToolbar2.getStatus() : null) != TextToolbarStatus.Shown || (textToolbar = this.textToolbar) == null) {
            return;
        }
        textToolbar.hide();
    }

    /* JADX INFO: renamed from: updateSelection-SsL-Rf8$default */
    static /* synthetic */ long m1606updateSelectionSsLRf8$default(TextFieldSelectionState textFieldSelectionState, TextFieldCharSequence textFieldCharSequence, int i2, int i3, boolean z2, SelectionAdjustment selectionAdjustment, boolean z3, boolean z4, int i4, Object obj) {
        boolean z5 = z3;
        if ((-1) - (((-1) - i4) | ((-1) - 32)) != 0) {
            z5 = false;
        }
        return textFieldSelectionState.m1605updateSelectionSsLRf8(textFieldCharSequence, i2, i3, z2, selectionAdjustment, z5, (i4 + 64) - (i4 | 64) == 0 ? z4 : false);
    }

    /* JADX INFO: renamed from: updateSelection-SsL-Rf8 */
    public final long m1605updateSelectionSsLRf8(TextFieldCharSequence textFieldCharSequence, int i2, int i3, boolean z2, SelectionAdjustment selectionAdjustment, boolean z3, boolean z4) {
        HapticFeedback hapticFeedback;
        TextRange textRangeM6111boximpl = TextRange.m6111boximpl(textFieldCharSequence.m1446getSelectiond9O1mEE());
        long jM6127unboximpl = textRangeM6111boximpl.m6127unboximpl();
        if (z4 || (!z3 && TextRange.m6117getCollapsedimpl(jM6127unboximpl))) {
            textRangeM6111boximpl = null;
        }
        long jM1601getTextFieldSelectionqeG_v_k = m1601getTextFieldSelectionqeG_v_k(i2, i3, textRangeM6111boximpl, z2, selectionAdjustment);
        if (TextRange.m6116equalsimpl0(jM1601getTextFieldSelectionqeG_v_k, textFieldCharSequence.m1446getSelectiond9O1mEE())) {
            return jM1601getTextFieldSelectionqeG_v_k;
        }
        boolean z5 = TextRange.m6122getReversedimpl(jM1601getTextFieldSelectionqeG_v_k) != TextRange.m6122getReversedimpl(textFieldCharSequence.m1446getSelectiond9O1mEE()) && TextRange.m6116equalsimpl0(TextRangeKt.TextRange(TextRange.m6118getEndimpl(jM1601getTextFieldSelectionqeG_v_k), TextRange.m6123getStartimpl(jM1601getTextFieldSelectionqeG_v_k)), textFieldCharSequence.m1446getSelectiond9O1mEE());
        if (isInTouchMode() && !z5 && (hapticFeedback = this.hapticFeedBack) != null) {
            hapticFeedback.mo4906performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m4915getTextHandleMove5zf0vsI());
        }
        return jM1601getTextFieldSelectionqeG_v_k;
    }

    /* JADX INFO: renamed from: getTextFieldSelection-qeG_v_k */
    private final long m1601getTextFieldSelectionqeG_v_k(int i2, int i3, TextRange textRange, boolean z2, SelectionAdjustment selectionAdjustment) {
        int i4 = i2;
        TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            return TextRange.Companion.m6128getZerod9O1mEE();
        }
        if (textRange == null && Intrinsics.areEqual(selectionAdjustment, SelectionAdjustment.Companion.getCharacter())) {
            return TextRangeKt.TextRange(i4, i3);
        }
        SelectionLayout selectionLayoutM1684getTextFieldSelectionLayoutRcvTLA = SelectionLayoutKt.m1684getTextFieldSelectionLayoutRcvTLA(layoutResult, i4, i3, this.previousRawDragOffset, textRange != null ? textRange.m6127unboximpl() : TextRange.Companion.m6128getZerod9O1mEE(), textRange == null, z2);
        if (textRange != null && !selectionLayoutM1684getTextFieldSelectionLayoutRcvTLA.shouldRecomputeSelection(this.previousSelectionLayout)) {
            return textRange.m6127unboximpl();
        }
        long jM1672toTextRanged9O1mEE = selectionAdjustment.adjust(selectionLayoutM1684getTextFieldSelectionLayoutRcvTLA).m1672toTextRanged9O1mEE();
        this.previousSelectionLayout = selectionLayoutM1684getTextFieldSelectionLayoutRcvTLA;
        if (!z2) {
            i4 = i3;
        }
        this.previousRawDragOffset = i4;
        return jM1672toTextRanged9O1mEE;
    }
}
