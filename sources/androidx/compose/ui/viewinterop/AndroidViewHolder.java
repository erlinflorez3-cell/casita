package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.OwnerScope;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.NestedScrollInteropConnectionKt;
import androidx.compose.ui.platform.WindowRecomposer_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.dynatrace.android.agent.AdkSettings;
import com.dynatrace.android.agent.Global;
import java.util.List;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
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
/* JADX INFO: compiled from: AndroidViewHolder.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яŉ\u0014D57\u001eq\u007fZDkt\u001aA\u000e0!.J~8,\u001aՄ\u000ff\u000198ǏmHDR[ճ\u0017k\n:,Ӌ,qY;]ڼ\u0006\"\u001fOVʴon`Z\u0013C\u0015\u0006\u001ex\u0001,QU~a\u001a\u000f@Kw?9Qw=O`|6\u000b :\"Ny\r\u0001 .P\u0010\u0005\u000eKK\"\u00128@v>Z\rc\u0005\"Ň\u000e>6\u0001&\\uN>HrfB/9\u0003qBT/g0\u0013M\u0015FZ+\u0015vw\u001e3@=<\u001d%i\u0003\u000fѸc?\u0011Jyܵ\rh='3ɞ{WLX\b\u0014\u001b+W\rsr.ؘ\rQv\f/+UxSP\u001c-\u007fz\u0002%B\u0012$ͺEι-]\u001a\u0015\u0007>3#r\u0004@~\u0003\u000fB.|\u001a6Ш$@h;=)iiai\u001d^=\n\n% 9\u007f\u001d'kX\u001cg-\u001b\u0003\u007fa5_IUH|\u0014iA{\u000f\tb06\u00144U\rG{?<ϲ)7iHk1y\\`D\u0016\u000f5fv/\u0002T^?PK\\Kr\u000f\u001a8\\d3J\u0017h!8\u001f-4\\\u001d|6\u001f\t^\u000e;\u007f\u0006XV]J\u0002lc\\8\buz\u007f_|O&WgfyI\u001a\u007f\u001eFjx*>jH5^tjk\u000ep[VKbNxv\u0010}ZM:zxS: B\u0015I\u0019\u000bI\u0011\t,,Y|7w!|X\u001db\u001e<\u0003\u0018,%\r\u000f<tp\u001eo)M:ix\"[I\u00029'\u0014m\"\u0017<C#O\u0005\u0002n_gz{\u0013~^{ck8\u0016Hm\u0018C\u0006)\u001doA20auP\u0001WiM@3+\u0001\b\u0002Sh\\sN~92n^bO\u0003Kh\t'!1||\u007f(\u0016v~UYl\u000b\nVyv\u0011PTNf\u00055#,\u001d\u0019oP\u0005e1Q 5\u0016&\u001c_\u0019oW\u0002o\\\u0002)!n\u000bs~DcD$\u0013Uk.S8wa/B0!\u0005\u0003pP1\nPm\u00172%3vY\u0015td+e\u000b]\n\u0017\r:ݹon\\hܦn.:<ʁ)\fD,и]s*\u001f߁R\u007fm\u001cc#\u001f\u00132\u0018ΟzIn@4m$dJz\t^\u0012$\u001eD\u05ce:z\u0006jʁ#d2Jލ\n[U\u0018д\u000fA\u0014\u000f\u0013\u001dĥ1Zsi\u000b>X\u0007OnH3lue/ƨ\u007f\u0017\u000fa&):?ܒl^T]kb\u0006a߽\b3j}(\u0017*9ץSQ\u001bV`G\u001f\u000e\u001aQ̼\u0001N\u0004u]\u001eo}~P\u0018+)r\u001d)ʎP)_%8\u000f\u0010c̰M|v@n\u0003S0ģ}\u0013|<D:\u0014\u0019čN\u000bo\u00115|S\u0006̈B2\u0001ELo\u001bTBq˴\u001aE\u0006camMx\u0007?{\u0006_k\u0003\u0016Á\u001f?\u0004#)\r\\\u001cѪ\tu\u001bh\u001e\"\u001bpռ\b+PN\f^O\u0003Ҩ\tF\bdW28\u0010Ջ]qk&)p,9ˎ\u0005ZK\u0017\"Pw5\r|θ\n\u001bf_\u000b*r;B5\tUY^\u0017fMR\u0011\u0002,\t\u0016\u000eȄ\u0014>\u001fd\u0010\u0013.\u001e˟b\u0001p\u001aW\"!s6y˜`I0\u0001RD3B|\u0012հS@\u0015i\u000b\u0014R-2jֿAo\u000e\r\u0003Xh\u0003}A\u0014+\u000bxb\u001f\u0006LF!*\u00154Eد\u001es\ruh7\tSÛ%91\u0001GaKz#}ĝu)\u0003h\u0017%\u000485!r.s\\2T°<2'\b,4xK6YԬ7Z\bZE>\u0016=պ78>\u000b\"bM\u001a8O˩\u0010\u0019\u0015f:8\u0017'ǒiiSS^1\u0002\u000f¦>\u00121\u001aR:K;*=ރn3W\u0015SkI6X5\u0013\u001aex\u0007$ޒXւe,Qʿ\u0016@\bgX\u007f80T(\u0014\u0006;\u007fsB\u0007n6ЎLҕwc\fڏB8tW1[\rzy\u001f:\u007fh\u007frdy4o\u0005jԏFĎ.-t؋\u0016Yv\u0011#D;]jɡ\u001bҋ-3\u001fτ`[\u007fYCI!e\u0006ۚiڍ\u0017s\f͡\u0003sD\u0014_@\bB<\u0002h˾eènqia\u0016R (]\u0010\u0006Mj`.hsȄ3ֲzF>˧IYO\u007f#@=,5ܾNՠ\u000f\u0006\u001eǚ\u0019&\u0010\u001cb`C2чKyIڧ*X\u0002A+2,K\u0014H\u007fl]>\u0004\u0014\tCGC#o`Wc\b\u001bI,لWߠ/!\bӭC0MzL?JZ\f4S\f\u0019\u001cR!\\(\u001cY\u0007ߦRڧ^CeӝlAK\u0001-e-\\\u0013;it)+e\u0002-\u0017,Ʊ9ӟ\u0006\u000f\u0018Ý1\u0015\u0011JafR%y;?mL\u0014jym|\u001czf¸cő%/\u000eܚ\u007fgY\u001fnsO\u001bg?-\u001d0)4\u0006AXxfA\u001dd݂k̿PB^ʷ`M_Ftx\u000b\u0011\u0001,\u001af\\^c?U\u0014!d,5i\nP.>p7{ei*]<ݖrڱ]YMΎ\u000e\u001bDk\u007fG\u0004QeO|\n-~LSo4P\u0015\u0012\u001aK>q}X)^Kkb\u001c\u001eJ\u0604lؕ]@sž|{x$rt\u0004@B\u0007zQ7[\f(iD\u0011\u00177͢JƉ\u0014btԮwdV,1\u0007\u0011Mq\u0017Bkr7SqAy:g2Um%u~4N)$Nô\bׁ7B\u0015ѥD~\u001bGL*\u0013\u0006rI[uT\u001a=x^`P\u001e=ZU\"\u0017HZ\u0018\u001a<\u001d2~UbQ$S!%=et֭M±=S)ˊ\u001b\u001bBO@\u0011x|t!jj~\u000e\u0014h*H\f7|A\"0a\u0018Hؽ6ߚ\")\u0006\u0093H2\u001b6*\nsL3O\u0018\u0017?\u001e\u0005׀y˱]<aͻR00u<\n+&0\u0014dP@2;\u0003%5F\u0016%3OΜ\u0015à\u0010;|҉&4s\f\u00025}i:\u0011K&.\u0011S~Gq6\u001e\u007f.UնIةM\u001aRQRA\u00040\u000e\u0003$\b\u001fu\u00143 s\u000f\u0010pW(\u0012pD\u0004@\fI\u0013\u0014\u0019\u007f\\Z\u0019)EԳ\u0003˙e\u001cEө%\u0016\u000b\u0015\u0002lCB+7n-PJ\u0017{57\u007fQڻ\u000fJ\u0019۠x4Dj\u001d\"ڿjÖ\u001a"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0012\u001b\u0017Ys\u0017Kv2?dG{@l#8QB,o40wrh8\u0007p\u0002", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\n\tJ\u0011\"l", "\u001a`]1e6BR,Hxh9|R@i\u007f:E)\u0001%&Gn{:\u0004/<`\u0002)9X\u0012;MLJ9\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g}\tAl\u0016\u0015QD;iH\u001c\u001ch?5\u000ej)Jt-\u001d", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9wN\u007f%BG{*Bmk", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", ">`a2a;\u001c]\"\u000ezq;", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g\u0002/;w\u001f\fWLJkG-j", "1n\\=b:Bb\u0019dzr\u000fx\u00172", "", "2hb=T;<V\u0019\f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WEv3DY|.5z 5T\r$kB-\u0015gO7\u0014m3UU+UWJ;ZUrJi", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "=v]2e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9wN\u007f%B/", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt8\u007f$Bc\u0002\u001fJ7\u00148UNEy4g\"xjH\u000bk,\u0018T1OWX:`avG\u001dod\u0017]+ \u0014/%\u000bjM6,\u00120H\u0015\u0005f\u000b\u0014!\u0018Cj:RZYK\u0003 \u0006PrqFgnyFOCo4k\u0013)\u0006\\HI$\u0013_\u0017(rW5h\u007fa\u001cnawjgTna4-=zeJD9f@t9h<\u007fw$\b?p4s:\u000e8)I.\u0003Uo#Hlx^<`\u000b005<\\)]luy\u0014QY", "D`[BX", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "2d]@\\;R", "5dc\u0011X5LW(\u0013", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006U%>g\u0002/KC", "Adc\u0011X5LW(\u0013", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W\u001bv.C]\r4\r1\u0007", "6`b\"c+:b\u0019[\u0002h*\u0003", "", "7r3?T>B\\\u001b", "7rE._0==+\bzk\u001az\u0013:e", "u(I", ":`bA;,BU\u001c\u000eb^(\u000b\u0019<em3{>", ":`bAJ0=b\u001cfzZ:\r\u0016/S\u000b(y", ":`h<h;']\u0018~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehf*6mk", "5dc\u0019T@Hc(g\u0005],", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006]!Ic\u000e/ w\u0015.#", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCv\u000fGb}-\r", ":hU2V@<Z\u0019h\rg,\n", "5dc\u0019\\->Q-|\u0002^\u0016\u000f\u0012/r", "u(;.a+K]\u001d}\u000e(3\u0001\n/c\u0014&\u0003@J}\u001bHo\fPt,5C\u0010)7zk", "Adc\u0019\\->Q-|\u0002^\u0016\u000f\u0012/r", "uKP;W9HW\u0018\u0012De0}\t-y}/{\ng\u001b\u0018Gm\":}%\u001fk\u0007 DCY\u001f", ":nR.g0H\\", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", ";nS6Y0>`", "5dc\u001ab+BT\u001d~\b", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`~Qn\u0012=z%B/", "Adc\u001ab+BT\u001d~\b", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b\u001dn", "<dbAX+,Q&\t\u0002e0\u0006\u000b\u001aa\r(\u0005Oc\u0017\u001eRo\u001b", "\u001a`]1e6BR,Hxh9|R@i\u007f:E)\u0001%&Gn{:\u0004/<`\u0002)9X\u0012;MLJN4% hn\u000f", "=m32a:Bb-\\}Z5~\t.", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "5dc\u001ca\u000b>\\'\u0003\nr\n\u007f\u00058g\u007f':P\u0005\u0011$Gv\u000e8\u0005%", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "Adc\u001ca\u000b>\\'\u0003\nr\n\u007f\u00058g\u007f':P\u0005\u0011$Gv\u000e8\u0005%", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%Sc(", "=m<<W0?W\u0019\fXa(\u0006\u000b/d", "5dc\u001ca\u0014HR\u001d\u007f~^9Z\f+n\u0002(z~\u0011\u001b\u0011To\u0015<r35", "Adc\u001ca\u0014HR\u001d\u007f~^9Z\f+n\u0002(z~\u0011\u001b\u0011To\u0015<r35", "=mA2d<>a(]~l(\u0004\u00109wc1\u000b@\u000e\u0015\u0017R~|F\u0007#89\u000f @|", "5dc\u001ca\u0019>_)~\tm\u000b\u0001\u0017+l\u00072\u000e$\n&\u0017Tm\u000eG\u0006\u0014?i{#\u0017~\u00167\\\u0002Ko.+\u0015oa5\u0015c", "Adc\u001ca\u0019>_)~\tm\u000b\u0001\u0017+l\u00072\u000e$\n&\u0017Tm\u000eG\u0006\u0014?i{#\u0017~\u00167\\\u0002Ko.+\u0015oa5\u0015c", "\nrTA \u0006\u0017", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "@d[2T:>", "5dc\u001fX3>O'~", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHu", "Adc\u001fX3>O'~", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$Sc(", "@db2g", "5dc\u001fX:>b", "Adc\u001fX:>b", "@t]\u0016a=:Z\u001d}vm,", "@t]\"c+:b\u0019", "\u001a`]1e6BR,H\tZ=|\b=t{7{\nn\u0013(Gn{Kr45F}\";{%;a-Mt4+j", "A`e2W\u001aMO(~g^.\u0001\u0017>r\u0014\u0012\u000eI\u0001$", "5dc T=>R\u0007\u000evm,i\t1i\u000e7\tTj) G|", "u(;.a+K]\u001d}\u000e(:x\u001a/d\u000e7wO\u0001`\u0005C\u0001\u000e;d41h}\r7o\u001a<\\POUF'\u0015u7", "Adc T=>R\u0007\u000evm,i\t1i\u000e7\tTj) G|", "uKP;W9HW\u0018\u0012Dl(\u000e\t.s\u000f$\u000b@J\u0005\u0013Xo\r*\u0006!DYj 9q$=ZW%}=\u001e\">%*", "AmP=f/Hb\u0003{\t^9\u000e\t<", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9wN\u007f%BG\u0007\u001cB{\u00198\\-8y4+&hn\u000f", "5dc a(Ia\u001c\t\nH)\u000b\t<v\u007f5", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006`7>Y\u000b\u000e@i!<PMJU1,\u0015ur9\u00149", "CoS.g,", "5dc\"c+:b\u0019", "Adc\"c+:b\u0019", "5dc#\\,P", "u(;.a+K]\u001d}Do0|\u001bxV\u0004(\u000e\u0016", "5`c5X9-`\u0015\b\ti(\n\t8tl(}D\u000b ", "@dV6b5", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0015{B\u0005! \u001d", "5dc\u000eV*>a'\u0003wb3\u0001\u0018CC\u0007$\nNi\u0013\u001fG", "", "5dc\u0016a;>`#\nkb,\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0012\u001b\u0017Ys\u0017Kv2?dG\u0004@|\u0016;WN,o40j", "5dc\u0019T@Hc(ivk(\u0005\u0017", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\n\tJ\u0011\"U.k\"F\u00074 U\u000b\u001c?{k", "5dc\u001bX:MS\u0018lxk6\u0004\u0010\u000bx\u007f6", "7me._0=O(~Xa0\u0004\b\u0013nj$\t@\n&", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\u0013wM\u0001 &\u001d", "2haAl", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0015{>\u0010l", "7me._0=O(~dk\u000b|\n/r", "7r=2f;>R\u0007|\bh3\u0004\r8g_1w=\b\u0017\u0016", "=ac.\\5&S\u0015\r\u000bk,j\u0014/c", ";h]", ";`g", ">qT3X9KS\u0018", "=m0Ag(<V\u0019}ih\u001e\u0001\u0012.o\u0012", "=m32T*MW*z\n^", "=m32f*>\\\u0018z\u0004m\u0010\u0006\u001a+l\u0004'wO\u0001\u0016", "1gX9W", "B`a4X;", "=m32g(<V\u0019}[k6\u0005z3n~2\u000e", "=m;.l6Nb", "1gP;Z,=", Global.COLON, "B", "@", AdkSettings.PLATFORM_TYPE_MOBILE, "=m<2T:N`\u0019", "EhSA[\u0014>O'\u000f\b^\u001a\b\t-", "6dX4[;&S\u0015\r\u000bk,j\u0014/c", "=m=2f;>Ry\u0006~g.", "Dd[<V0Mg\f", "", "Dd[<V0Mg\r", "1n]@h4>R", "=m=2f;>R\u0004\fz?3\u0001\u00121", "=m=2f;>R\u0004\fzL*\n\u00136l", "2w", "2x", "Bx_2", "=m=2f;>R\u0007|\bh3\u0004", "2w2<a:N[\u0019}", "2x2<a:N[\u0019}", "2wD;V6Ga)\u0007z]", "2xD;V6Ga)\u0007z]", "=m=2f;>R\u0007|\bh3\u0004d-c\u007f3\u000b@\u007f", "/wT@", "=mA2_,:a\u0019", "=mA2h:>", "=mBAT9M<\u0019\r\n^+j\u0007<o\u0007/", "=mBAb7'S'\u000ez]\u001az\u00169l\u0007", "=mF6a+He\n\u0003\tb)\u0001\u00103t\u0014\u0006~<\n\u0019\u0017F", "Dhb6U0EW(\u0013", "@d\\2T:N`\u0019", "@d`BX:M2\u001d\rve3\u0007\u001b\u0013n\u000f(\t>\u0001\"&6y\u001e:y\u0005FY\u0007/", "2hb._3He|\b\n^9z\t:t", "Ag^B_+\u001dS z\u000f</\u0001\u0010.P\r(\nN\u0001\u0016\u0005Vk\u001d<", "\u0011n\\=T5B]\"", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class AndroidViewHolder extends ViewGroup implements NestedScrollingParent3, ComposeNodeLifecycleCallback, OwnerScope {
    private final int compositeKeyHash;
    private Density density;
    private final NestedScrollDispatcher dispatcher;
    private boolean hasUpdateBlock;
    private boolean isDrawing;
    private int lastHeightMeasureSpec;
    private int lastWidthMeasureSpec;
    private final LayoutNode layoutNode;
    private LifecycleOwner lifecycleOwner;
    private final int[] location;
    private Modifier modifier;
    private final NestedScrollingParentHelper nestedScrollingParentHelper;
    private Function1<? super Density, Unit> onDensityChanged;
    private Function1<? super Modifier, Unit> onModifierChanged;
    private Function1<? super Boolean, Unit> onRequestDisallowInterceptTouchEvent;
    private final Owner owner;
    private Function0<Unit> release;
    private Function0<Unit> reset;
    private final Function0<Unit> runInvalidate;
    private final Function0<Unit> runUpdate;
    private SavedStateRegistryOwner savedStateRegistryOwner;
    private Function0<Unit> update;
    private final View view;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final Function1<AndroidViewHolder, Unit> OnCommitAffectingUpdate = AndroidViewHolder$Companion$OnCommitAffectingUpdate$1.INSTANCE;

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(View view, View view2, int i2, int i3) {
        return ((i2 + 2) - (2 | i2) == 0 && (i2 & 1) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public final View getView() {
        return this.view;
    }

    public AndroidViewHolder(Context context, CompositionContext compositionContext, int i2, NestedScrollDispatcher nestedScrollDispatcher, View view, Owner owner) {
        super(context);
        this.compositeKeyHash = i2;
        this.dispatcher = nestedScrollDispatcher;
        this.view = view;
        this.owner = owner;
        if (compositionContext != null) {
            WindowRecomposer_androidKt.setCompositionContext(this, compositionContext);
        }
        setSaveFromParentEnabled(false);
        addView(view);
        this.update = new Function0<Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$update$1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        };
        this.reset = new Function0<Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$reset$1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        };
        this.release = new Function0<Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$release$1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        };
        this.modifier = Modifier.Companion;
        this.density = DensityKt.Density$default(1.0f, 0.0f, 2, null);
        this.runUpdate = new Function0<Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$runUpdate$1
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
                if (this.this$0.hasUpdateBlock && this.this$0.isAttachedToWindow()) {
                    ViewParent parent = this.this$0.getView().getParent();
                    AndroidViewHolder androidViewHolder = this.this$0;
                    if (parent == androidViewHolder) {
                        androidViewHolder.getSnapshotObserver().observeReads$ui_release(this.this$0, AndroidViewHolder.OnCommitAffectingUpdate, this.this$0.getUpdate());
                    }
                }
            }
        };
        this.runInvalidate = new Function0<Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$runInvalidate$1
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
                this.this$0.getLayoutNode().invalidateLayer$ui_release();
            }
        };
        this.location = new int[2];
        this.lastWidthMeasureSpec = Integer.MIN_VALUE;
        this.lastHeightMeasureSpec = Integer.MIN_VALUE;
        this.nestedScrollingParentHelper = new NestedScrollingParentHelper(this);
        byte b2 = 0 == true ? 1 : 0;
        final LayoutNode layoutNode = new LayoutNode(false, b2, 3, null);
        layoutNode.setInteropViewFactoryHolder$ui_release(this);
        final Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(DrawModifierKt.drawBehind(PointerInteropFilter_androidKt.pointerInteropFilter(SemanticsModifierKt.semantics(NestedScrollModifierKt.nestedScroll(Modifier.Companion, AndroidViewHolder_androidKt.NoOpScrollConnection, this.dispatcher), true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }
        }), this), new Function1<DrawScope, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                invoke2(drawScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DrawScope drawScope) {
                AndroidViewHolder androidViewHolder = this.$this_run;
                LayoutNode layoutNode2 = layoutNode;
                AndroidViewHolder androidViewHolder2 = this;
                Canvas canvas = drawScope.getDrawContext().getCanvas();
                if (androidViewHolder.getView().getVisibility() != 8) {
                    androidViewHolder.isDrawing = true;
                    Owner owner$ui_release = layoutNode2.getOwner$ui_release();
                    AndroidComposeView androidComposeView = owner$ui_release instanceof AndroidComposeView ? (AndroidComposeView) owner$ui_release : null;
                    if (androidComposeView != null) {
                        androidComposeView.drawAndroidView(androidViewHolder2, AndroidCanvas_androidKt.getNativeCanvas(canvas));
                    }
                    androidViewHolder.isDrawing = false;
                }
            }
        }), new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                AndroidViewHolder_androidKt.layoutAccordingTo(this.$this_run, layoutNode);
                this.$this_run.owner.onInteropViewLayoutChange(this.$this_run);
            }
        });
        layoutNode.setCompositeKeyHash(this.compositeKeyHash);
        layoutNode.setModifier(this.modifier.then(modifierOnGloballyPositioned));
        this.onModifierChanged = new Function1<Modifier, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier) {
                invoke2(modifier);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Modifier modifier) {
                layoutNode.setModifier(modifier.then(modifierOnGloballyPositioned));
            }
        };
        layoutNode.setDensity(this.density);
        this.onDensityChanged = new Function1<Density, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Density density) {
                invoke2(density);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Density density) {
                layoutNode.setDensity(density);
            }
        };
        layoutNode.setOnAttach$ui_release(new Function1<Owner, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Owner owner2) {
                invoke2(owner2);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Owner owner2) {
                AndroidComposeView androidComposeView = owner2 instanceof AndroidComposeView ? (AndroidComposeView) owner2 : null;
                if (androidComposeView != null) {
                    androidComposeView.addAndroidView(this.$this_run, layoutNode);
                }
                ViewParent parent = this.$this_run.getView().getParent();
                AndroidViewHolder androidViewHolder = this.$this_run;
                if (parent != androidViewHolder) {
                    androidViewHolder.addView(androidViewHolder.getView());
                }
            }
        });
        layoutNode.setOnDetach$ui_release(new Function1<Owner, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Owner owner2) {
                invoke2(owner2);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Owner owner2) {
                AndroidComposeView androidComposeView = owner2 instanceof AndroidComposeView ? (AndroidComposeView) owner2 : null;
                if (androidComposeView != null) {
                    androidComposeView.removeAndroidView(this.$this_run);
                }
                this.$this_run.removeAllViewsInLayout();
            }
        });
        layoutNode.setMeasurePolicy(new MeasurePolicy() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5
            @Override // androidx.compose.ui.layout.MeasurePolicy
            /* JADX INFO: renamed from: measure-3p2s80s */
            public MeasureResult mo375measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j2) {
                if (this.$this_run.getChildCount() == 0) {
                    return MeasureScope.layout$default(measureScope, Constraints.m6593getMinWidthimpl(j2), Constraints.m6592getMinHeightimpl(j2), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5$measure$1
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
                if (Constraints.m6593getMinWidthimpl(j2) != 0) {
                    this.$this_run.getChildAt(0).setMinimumWidth(Constraints.m6593getMinWidthimpl(j2));
                }
                if (Constraints.m6592getMinHeightimpl(j2) != 0) {
                    this.$this_run.getChildAt(0).setMinimumHeight(Constraints.m6592getMinHeightimpl(j2));
                }
                AndroidViewHolder androidViewHolder = this.$this_run;
                int iM6593getMinWidthimpl = Constraints.m6593getMinWidthimpl(j2);
                int iM6591getMaxWidthimpl = Constraints.m6591getMaxWidthimpl(j2);
                ViewGroup.LayoutParams layoutParams = this.$this_run.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams);
                int iObtainMeasureSpec = androidViewHolder.obtainMeasureSpec(iM6593getMinWidthimpl, iM6591getMaxWidthimpl, layoutParams.width);
                AndroidViewHolder androidViewHolder2 = this.$this_run;
                int iM6592getMinHeightimpl = Constraints.m6592getMinHeightimpl(j2);
                int iM6590getMaxHeightimpl = Constraints.m6590getMaxHeightimpl(j2);
                ViewGroup.LayoutParams layoutParams2 = this.$this_run.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams2);
                androidViewHolder.measure(iObtainMeasureSpec, androidViewHolder2.obtainMeasureSpec(iM6592getMinHeightimpl, iM6590getMaxHeightimpl, layoutParams2.height));
                int measuredWidth = this.$this_run.getMeasuredWidth();
                int measuredHeight = this.$this_run.getMeasuredHeight();
                final AndroidViewHolder androidViewHolder3 = this.$this_run;
                final LayoutNode layoutNode2 = layoutNode;
                return MeasureScope.layout$default(measureScope, measuredWidth, measuredHeight, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5$measure$2
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
                        AndroidViewHolder_androidKt.layoutAccordingTo(androidViewHolder3, layoutNode2);
                    }
                }, 4, null);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i3) {
                return intrinsicWidth(i3);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i3) {
                return intrinsicWidth(i3);
            }

            private final int intrinsicWidth(int i3) {
                AndroidViewHolder androidViewHolder = this.$this_run;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                AndroidViewHolder androidViewHolder2 = this.$this_run;
                ViewGroup.LayoutParams layoutParams = androidViewHolder2.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams);
                androidViewHolder.measure(iMakeMeasureSpec, androidViewHolder2.obtainMeasureSpec(0, i3, layoutParams.height));
                return this.$this_run.getMeasuredWidth();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i3) {
                return intrinsicHeight(i3);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i3) {
                return intrinsicHeight(i3);
            }

            private final int intrinsicHeight(int i3) {
                AndroidViewHolder androidViewHolder = this.$this_run;
                ViewGroup.LayoutParams layoutParams = androidViewHolder.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams);
                androidViewHolder.measure(androidViewHolder.obtainMeasureSpec(0, i3, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
                return this.$this_run.getMeasuredHeight();
            }
        });
        this.layoutNode = layoutNode;
    }

    public final View getInteropView() {
        return this.view;
    }

    public final Function0<Unit> getUpdate() {
        return this.update;
    }

    protected final void setUpdate(Function0<Unit> function0) {
        this.update = function0;
        this.hasUpdateBlock = true;
        this.runUpdate.invoke();
    }

    public final Function0<Unit> getReset() {
        return this.reset;
    }

    protected final void setReset(Function0<Unit> function0) {
        this.reset = function0;
    }

    public final Function0<Unit> getRelease() {
        return this.release;
    }

    protected final void setRelease(Function0<Unit> function0) {
        this.release = function0;
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    public final void setModifier(Modifier modifier) {
        if (modifier != this.modifier) {
            this.modifier = modifier;
            Function1<? super Modifier, Unit> function1 = this.onModifierChanged;
            if (function1 != null) {
                function1.invoke(modifier);
            }
        }
    }

    public final Function1<Modifier, Unit> getOnModifierChanged$ui_release() {
        return this.onModifierChanged;
    }

    public final void setOnModifierChanged$ui_release(Function1<? super Modifier, Unit> function1) {
        this.onModifierChanged = function1;
    }

    public final Density getDensity() {
        return this.density;
    }

    public final void setDensity(Density density) {
        if (density != this.density) {
            this.density = density;
            Function1<? super Density, Unit> function1 = this.onDensityChanged;
            if (function1 != null) {
                function1.invoke(density);
            }
        }
    }

    public final Function1<Density, Unit> getOnDensityChanged$ui_release() {
        return this.onDensityChanged;
    }

    public final void setOnDensityChanged$ui_release(Function1<? super Density, Unit> function1) {
        this.onDensityChanged = function1;
    }

    public final LifecycleOwner getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    public final void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner != this.lifecycleOwner) {
            this.lifecycleOwner = lifecycleOwner;
            ViewTreeLifecycleOwner.set(this, lifecycleOwner);
        }
    }

    public final SavedStateRegistryOwner getSavedStateRegistryOwner() {
        return this.savedStateRegistryOwner;
    }

    public final void setSavedStateRegistryOwner(SavedStateRegistryOwner savedStateRegistryOwner) {
        if (savedStateRegistryOwner != this.savedStateRegistryOwner) {
            this.savedStateRegistryOwner = savedStateRegistryOwner;
            ViewTreeSavedStateRegistryOwner.set(this, savedStateRegistryOwner);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OwnerSnapshotObserver getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            InlineClassHelperKt.throwIllegalStateException("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return this.owner.getSnapshotObserver();
    }

    public final Function1<Boolean, Unit> getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.onRequestDisallowInterceptTouchEvent;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(Function1<? super Boolean, Unit> function1) {
        this.onRequestDisallowInterceptTouchEvent = function1;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return isAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onReuse() {
        if (this.view.getParent() != this) {
            addView(this.view);
        } else {
            this.reset.invoke();
        }
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onDeactivate() {
        this.reset.invoke();
        removeAllViewsInLayout();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onRelease() {
        this.release.invoke();
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        if (this.view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i2), View.MeasureSpec.getSize(i3));
            return;
        }
        if (this.view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        this.view.measure(i2, i3);
        setMeasuredDimension(this.view.getMeasuredWidth(), this.view.getMeasuredHeight());
        this.lastWidthMeasureSpec = i2;
        this.lastHeightMeasureSpec = i3;
    }

    public final void remeasure() {
        int i2;
        int i3 = this.lastWidthMeasureSpec;
        if (i3 == Integer.MIN_VALUE || (i2 = this.lastHeightMeasureSpec) == Integer.MIN_VALUE) {
            return;
        }
        measure(i3, i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        this.view.layout(0, 0, i4 - i2, i5 - i3);
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
        Function1<? super Boolean, Unit> function1 = this.onRequestDisallowInterceptTouchEvent;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z2));
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.runUpdate.invoke();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().clear$ui_release(this);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        invalidateOrDefer();
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidateOrDefer();
    }

    public final void invalidateOrDefer() {
        if (this.isDrawing) {
            View view = this.view;
            final Function0<Unit> function0 = this.runInvalidate;
            view.postOnAnimation(new Runnable() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    function0.invoke();
                }
            });
            return;
        }
        this.layoutNode.invalidateLayer$ui_release();
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow(this.location);
        int[] iArr = this.location;
        int i2 = iArr[0];
        region.op(i2, iArr[1], i2 + getWidth(), this.location[1] + getHeight(), Region.Op.DIFFERENCE);
        return true;
    }

    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int obtainMeasureSpec(int i2, int i3, int i4) {
        if (i4 >= 0 || i2 == i3) {
            return View.MeasureSpec.makeMeasureSpec(RangesKt.coerceIn(i4, i2, i3), 1073741824);
        }
        if (i4 == -2 && i3 != Integer.MAX_VALUE) {
            return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        if (i4 == -1 && i3 != Integer.MAX_VALUE) {
            return View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(0, 0);
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.nestedScrollingParentHelper.getNestedScrollAxes();
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(View view, View view2, int i2, int i3) {
        this.nestedScrollingParentHelper.onNestedScrollAccepted(view, view2, i2, i3);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(View view, int i2) {
        this.nestedScrollingParentHelper.onStopNestedScroll(view, i2);
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        if (isNestedScrollingEnabled()) {
            long jM5262dispatchPostScrollDzOQY0M = this.dispatcher.m5262dispatchPostScrollDzOQY0M(OffsetKt.Offset(AndroidViewHolder_androidKt.toComposeOffset(i2), AndroidViewHolder_androidKt.toComposeOffset(i3)), OffsetKt.Offset(AndroidViewHolder_androidKt.toComposeOffset(i4), AndroidViewHolder_androidKt.toComposeOffset(i5)), AndroidViewHolder_androidKt.toNestedScrollSource(i6));
            iArr[0] = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m3937getXimpl(jM5262dispatchPostScrollDzOQY0M));
            iArr[1] = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m3938getYimpl(jM5262dispatchPostScrollDzOQY0M));
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5, int i6) {
        if (isNestedScrollingEnabled()) {
            this.dispatcher.m5262dispatchPostScrollDzOQY0M(OffsetKt.Offset(AndroidViewHolder_androidKt.toComposeOffset(i2), AndroidViewHolder_androidKt.toComposeOffset(i3)), OffsetKt.Offset(AndroidViewHolder_androidKt.toComposeOffset(i4), AndroidViewHolder_androidKt.toComposeOffset(i5)), AndroidViewHolder_androidKt.toNestedScrollSource(i6));
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr, int i4) {
        if (isNestedScrollingEnabled()) {
            long jM5264dispatchPreScrollOzD1aCk = this.dispatcher.m5264dispatchPreScrollOzD1aCk(OffsetKt.Offset(AndroidViewHolder_androidKt.toComposeOffset(i2), AndroidViewHolder_androidKt.toComposeOffset(i3)), AndroidViewHolder_androidKt.toNestedScrollSource(i4));
            iArr[0] = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m3937getXimpl(jM5264dispatchPreScrollOzD1aCk));
            iArr[1] = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m3938getYimpl(jM5264dispatchPreScrollOzD1aCk));
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        BuildersKt__Builders_commonKt.launch$default(this.dispatcher.getCoroutineScope(), null, null, new AnonymousClass1(z2, this, VelocityKt.Velocity(AndroidViewHolder_androidKt.toComposeVelocity(f2), AndroidViewHolder_androidKt.toComposeVelocity(f3)), null), 3, null);
        return false;
    }

    /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidViewHolder.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\n~D\u000e\u0002~\u0012\u0005\u000b\u0012\u0004\u0012\u0010\u0012Pd\u0013\n\u0019\u0017\u0012\u000e\u0001\u0015\u0012%v\u001f\u001d\u0016\u0018&X%%\u0006\u001e-/!!\u0004+)/)ft", f = "\u000e:/<81+\u001c.):\n0,##/i\u001c(\u001d*&\u001f\u0019a\u001e&", i = {}, l = {565, 570}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $consumed;
        final /* synthetic */ long $viewVelocity;
        int label;
        final /* synthetic */ AndroidViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(boolean z2, AndroidViewHolder androidViewHolder, long j2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$consumed = z2;
            this.this$0 = androidViewHolder;
            this.$viewVelocity = j2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$consumed, this.this$0, this.$viewVelocity, continuation);
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
                if (!this.$consumed) {
                    this.label = 1;
                    if (this.this$0.dispatcher.m5261dispatchPostFlingRZ2iAVY(Velocity.Companion.m6886getZero9UxMQ8M(), this.$viewVelocity, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    this.label = 2;
                    if (this.this$0.dispatcher.m5261dispatchPostFlingRZ2iAVY(this.$viewVelocity, Velocity.Companion.m6886getZero9UxMQ8M(), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i2 != 1 && i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(View view, float f2, float f3) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        BuildersKt__Builders_commonKt.launch$default(this.dispatcher.getCoroutineScope(), null, null, new C07831(VelocityKt.Velocity(AndroidViewHolder_androidKt.toComposeVelocity(f2), AndroidViewHolder_androidKt.toComposeVelocity(f3)), null), 3, null);
        return false;
    }

    /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidViewHolder.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\n~D\u000e\u0002~\u0012\u0005\u000b\u0012\u0004\u0012\u0010\u0012Pd\u0013\n\u0019\u0017\u0012\u000e\u0001\u0015\u0012%v\u001f\u001d\u0016\u0018&X%%\u0006\u001e-/!!\u000e1%\u0007.,2,iw", f = "\u000e:/<81+\u001c.):\n0,##/i\u001c(\u001d*&\u001f\u0019a\u001e&", i = {}, l = {583}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class C07831 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $toBeConsumed;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07831(long j2, Continuation<? super C07831> continuation) {
            super(2, continuation);
            this.$toBeConsumed = j2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AndroidViewHolder.this.new C07831(this.$toBeConsumed, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C07831) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (AndroidViewHolder.this.dispatcher.m5263dispatchPreFlingQWom1Mo(this.$toBeConsumed, this) == coroutine_suspended) {
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

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.view.isNestedScrollingEnabled();
    }

    /* JADX INFO: compiled from: AndroidViewHolder.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012\u0006\u0007nʑ?ӋE{߉^R\u0002)Op\u00024ż_$\u007fC\fm(~:\u0015_Pwg\u001dMj\rS\u000f4\u001a'l\u0003ղWޯa\u0012\u0017˰ԸsD"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0012\u001b\u0017Ys\u0017Kv2?dG{@l#8QB,o40wrh8\u0007pj,\u0001/RHW0f[H", "", "u(E", "\u001dm2<`4Bbt\u007f{^*\f\r8go3z<\u0010\u0017", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0012\u001b\u0017Ys\u0017Kv2?dG{@l#8QB,o40wrh8\u0007p\u0002", "", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
