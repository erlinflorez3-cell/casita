package androidx.compose.ui.window;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.WindowManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewRootForInspector;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.hg;

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
/* JADX INFO: compiled from: AndroidPopup.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яŋ\u0014D57\u001eq\u007fZDkt\u001aA\u000eֶ\u0013.X~*, w\u000f߿r9FDm߉6Ra6\u0017ӆ\u00044:[,ڎK;k\u001a\u0006̝\u0011OdgoñRZ!C\u0017إ\u001ex\u0001,QU~]\u001a\u000f@ԏwЀ;M}FA`z9\r H\"@y\u000b\u0007\"*V\u0016~zIN\u0014\u0012>SxíZ\rc\u0005\"\u0012\f>(\u00014\\oN<Kt]P/+\u0003\u007fBV'e5\u0005M#F\\'\u0013xi\u001eA@?5\u001b/[\u0003\u001dRc?\t@y=\u001bh/'1O{WLX\b\u0014\u001b/W\rsr.\\\u000b_h\f=+WcQP\u0016(\u000ez\u0004\rB\u000f\u0014\u0005=ΞLƮ\u0019\u0017\b<2%r\u0002@\t\u0002ޑA@HqB%&\u0018;;;+f\u007fdQ\u0018|9\f\t\u001b\";\u0001\u001d&kX\u001cf-\u001b\u0003~a5_HUH|\u0013iA{\u000e\tb05\u00144U\fG{?;')EiQ#Oz\u0012NJg\u0005\u0015xh\u0002zʐL@0\u0001^B8h$ZrgK\u0001ÏXX:q\u0016\"bh\u0016\bAP#w\u0005%3rfO\u0017l3[km=/\u0015M\nryro9\r\u0019{e,Co9\u000f\u0014m?\u0013\tfNZS:p\r,0\u001b`j>\u001d,H\\u+2m\u0017L8:\u001c1\\Cm3\"P-\u0015\t\u000e\u007f/\u001eњX3*o2?\u0003v\u0019P\u000bs k\u00078D|\u000fG]E_%1&\u0004G/Bč'\u0007\u0005dHMu>_L\u001b\u0019<UD&$\rQQ]@Y\u000fG/@uEEzu,c\u0016\u00185o\u0015y=>/@0\u0018xfD`\u0019`\u007fZ%\u0007\u000f`\t\"6[F\u000e*J\t?{T9^\u0007m\u0001#q<|;-\t-\u0017=\u0001\u001e\u001c-D;`?(&y$/Cd\fkܓ2yh+֑xe\u0012',$}^i]`>hMg{V\"R\u0012IV\u0011n\u0006\u0006Z\tb\u0010{WOЭon8{\u000e_\u0002t\u0004D\r\u001f\u0016\":[\u001d\fҰ-w*\"F. lD=\u0019]Uwm\u001cNr\nx\u0011:\u000f\n5\u0007\u0012JBPZeh!04zH:O8z\u0005jHlA:ч\u0007#C\u0003lL\u000fĢ\u0004Geʙ\u0016zO\u0002ĮU&T'_\u0007L\u0013\u0019]`OaI\u000e\u001dʂ\u001d\u00115_\b\u001eJb3{2/Xc\tco]Ʋe=+rW\n)6k\u0019\r[\\q]XԐ\u0010ھ-msƑ\\Q&\u00125BF1o\u0016g٪ۀ0Ϳ\u000f_lPj\u0010 \u0001jP(@\r\u0013M\u001aJ\u0012'\u000bGXIźdυPN\u007f˿\u0014Y\u000f4\\4\u0017\u000e\rct\u001e[\b\u05f91=O\u0007D6\nrkF\u000e\n0 U\u0007##Ǜ[\u000el&\u0014[xVHзȗ\u0002Ƥ\u0017`(\u00064l\u0003\u0016\"0\u000eT]!S\u0004\u0019~g\rH3NKCl4g\u0002)Oƀeؼgrm\r\t\r?}J\u0001;x5\tUrdS/ŗ<ñW$p\u0013\u0006=#MoB\u0016\rA\u0010}\u000f?ҷmϪ_\r3Ԛ<>o]HRL+uݚwś)ĔՈ\u0014:ܑQ@l\tj\u001b\u0013k\u001c_\u00030tv\u001c)B\u007f\u0015G\r\u0013i̍Rޔ\"d7Юi9i<_`54{Ò|ϵ3ĿC'?ָ\u001bq.(\u001f5Rdz38vY\u0001\u000e\u001dD/\\SkP}ڕ0މh\u0003.ɔ\u0016eP@D\u0013$\u0010]\u0012h&Lw2\u001eQPaxOQ?U\u000fې˞\u0007ص9zYU+g\u000f \u0019\u000fE3?&Zu=.1k_\b)\u0016~;St<͞3ڧ\u0006qRӭee\\Oomi7K`\b\u0019\u00113\u0018d<&\u001ctQDu7VEw^VU\"\u001c:jhzEޖûGږw݅պ+h҅wtcc:\f\t71FDp;4'GS1\bT\u0015\u0019S$O\u000f4:\nٝ~ӻSqHԴ\u001a\u000b[zt]j J̣FߴeB\u0002ÙX[0R;_tep9{!0\u001cFb%\r2I\bײbڞd\u001d ñ\u001c\u0003T:tx{F9ޔLǦ(^6˷\\'\u0014hFHE\u0018.Nn0+3u\n\u007f\u0018hʹ\bؗ!\u0017cܩ\u001e'm>UW&}f\u0012Q39C!ղ7Ǚ`\u0005]ؽ\u001cv9k\u0018jY-}+\u0015ϭ,Ө\n\u0012]fNgRQ\u0015@{6H0~\u00061ֳiԀ +Eյ-g\u0005\fp\u0012{f\u0017\u0007E4?^c\u0001Ex0afà\u001bҝ\u000f\u001e[դު#|\u00154Dϲ$\u000bH]|shˆ\u0007ʺI"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0013\u001b Fy \u0006a/@i\t\u00073\u0002 >\\\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011V\f/Di\u0014=+MCv>,\u0015Ye9\u00199", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n&]}2$w =.MHO=, h_H\u0011p\u0002", "=m36f4Ba'kzj<|\u0017>", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", ">q^=X9MW\u0019\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0013\u001b Fy \u0006a/@i\t\u000bDw!.ZR?kBs", "BdbAG(@", "", "1n\\=b:>D\u001d~\r", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "7mXA\\(E>#\r~m0\u0007\u0012\u001ar\n9\u007f?\u0001$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0013\u001b Fy \u0006a/@i\t\u000bA{\u001a=QMDVA(&l`9\u00149", ">n_Bc\u0010=", "\u001aiPCTuNb\u001d\u0006DN\u001c`g\u0005", ">n_Bc\u0013:g#\u000f\nA,\u0004\u0014/r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0013\u001b Fy \u0006a/@i\t\u00073\u0002 >\\&;r?\u001e\">", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu^zpYPW+fd<(\u001e\u001dj\u001998\u0017\u0010YN3rDEtn1E\u001372\b\b\u001f\u0010~X\u007fOZ\u0019IO{qJ(uP]^CXEEtsU\u0010_/2!6-\u0013~#\u001fgcw\b\u0006[\u001c|`y1wKb\u000bA(M7:FN}YK\t|\u0006G\u0005v\u001f<\\s>>+\u000e<5@r\u0005\u0015w\u001c\bp|\u001e+fSp\u0011@G#J6m\u0004pM\u0012r(L\u0015\u0018s90\u0019r;JM\u000b\u0018Y`kDefJ'Bi\u001d\u001fV\u00110E\fL_x(R\u0005.upSQ\u001b\u001e\u0011\u001e:V&h\u0010\r\u00150\u0003&9&H@\u000b|4oF0\u0013\u0010s8\u0019Q\u001d4", "0`R86(EZ\u0016zxd", "", "1`]\u0010T3<c z\n^\u0017\u0007\u00173t\u00042\u0005", "", "5dc\u0010T5\u001cO |\u000be(\f\t\u001ao\u000e,\u000bD\u000b ", "u(I", "1`]\u0010T3<c z\n^\u0017\u0007\u00173t\u00042\u0005~\u007f\u0017\u001eGq\nKv", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", "\nrTA \u0006\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "1n]AX5M", "5dc\u0010b5MS\"\u000e", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bJu", "Adc\u0010b5MS\"\u000e", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&Sc(", "1n]AX5M\u0012\u0018~\u0002^.x\u0018/", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "2hb=_(R6\u0019\u0003|a;", "", "5dc\u0011\\:IZ\u0015\u0013]^0~\f>", "u(8", "2hb=_(RE\u001d}\na", "5dc\u0011\\:IZ\u0015\u0013lb+\f\f", ":nR.g0H\\\u0003\bh\\9|\t8", "", ";`g h7I]&\u000ez]\f\u0004\t@a\u000f,\u0006I", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "\u0014", ">`a.`:", "\u001a`]1e6BRb\u0010~^>Fz3n~2\u000e(| \u0013Io\u001bz]!Ic\u000e/\"i#*UQ\u0011", "5dc\u001dT9:['=\u000bb&\n\t6e{6{~|  Q~\nKz/>g", "u(E", "5dc\u001dT9:['=\u000bb&\n\t6e{6{", "u(;.a+K]\u001d}Do0|\u001bxW\u00041zJ\u0013~\u0013Pk\u0010<\u0004c\u001cU\u0012*G|\u0001*Z?Cy\n", ">`a2a;\u001b])\byl", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00125W\ru", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/\u0015w ;LGDgC\u001e#>", ">`a2a;%O-\t\u000bm\n\u0007\u0013<d\u00041wO\u0001%", "5dc\u001dT9>\\(evr6\r\u0018\ro\n5zD\n\u0013&G}", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n\u001cU\u0012*G|s8WP:o=\u001a$ho\u000f", "Adc\u001dT9>\\(evr6\r\u0018\ro\n5zD\n\u0013&G}", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\f1m\b0FK 8ZB?t0-\u0015v7|w", ">`a2a;%O-\t\u000bm\n\u0007\u0013<d\u00041wO\u0001%UFo\u0015<x!DY", ">`a2a;%O-\t\u000bm\u000b\u0001\u0016/c\u000f,\u0006I", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "5dc\u001dT9>\\(evr6\r\u0018\u000ei\r(yO\u0005! ", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006]!Ic\u000e/\u0016q#.KR?u=s", "Adc\u001dT9>\\(evr6\r\u0018\u000ei\r(yO\u0005! ", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W#r9?i\r~;z\u0016,\\GEt\na\u0006", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", ">n_Bc\nH\\(~\u0004m\u001a\u0001\u001e/", "5dc\u001db7N^v\t\u0004m,\u0006\u0018\u001di\u0015(C=j~gVb ", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006Z.DG\u000257C", "Adc\u001db7N^v\t\u0004m,\u0006\u0018\u001di\u0015(CA\u0004*\u001cTZi", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W \u007f4#]\u0013 \r1\u0007", ">n_Bc\nH\\(~\u0004m\u001a\u0001\u001e/$~(\u0003@\u0003\u0013&G", ">nb6g0H\\\u0004\f\u0005o0{\t<", "5dc\u001db:Bb\u001d\t\u0004I9\u0007\u001a3d\u007f5", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`)Kx\rF\tn c\t0BX <QR?u=\t\"rr=\u0006c9$", "Adc\u001db:Bb\u001d\t\u0004I9\u0007\u001a3d\u007f5", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ)\u001bPn\u0018N@\u0010?d\u000e+\"w$2\\GEt\u001f+\u001fye8\u0007p\u0002\u0012g", ">qTC\\6Na\u000b\u0003\u0004]6\u000fy3s\u0004%\u0003@a$\u0013Oo", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0015{>\u0010l", "Ag^B_+\u001c`\u0019z\n^\n\u0007\u0011:o\u000e,\u000bD\u000b \u0001PK\u001dKr#8Y|\u000fA_\u001a7LMM", "5dc [6NZ\u0018\\\b^(\f\t\ro\b3\u0006N\u0005&\u001bQxwER4DU{#7l\u00058?GDj>0", "AmP=f/Hb\u0007\u000evm,f\u0006=e\r9{M", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u00047INIn>-\u0003w]H\u0007M)\\v4XL[\u0002", "AtQ\u0010b4I]'\u0003\nb6\u0006y3e\u0012", "5dc h)\u001c]!\n\u0005l0\f\r9np,{R", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\"Nk\u001d=\u00012=#Y\u001dE|#*KR\u0019u<)\u001fva*\u000bc>$", "5dc!X:MB\u0015\u0001", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc!X:MB\u0015\u0001", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "Eh]1b>&O\"z|^9", "\u001a`]1e6BRb\u0010~^>Fz3n~2\u000e(| \u0013Io\u001b\u0012", "\u0011n]AX5M", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq>", "1qT.g,%O-\t\u000bm\u0017x\u0016+m\u000e", "2hb:\\:L", "2hb=T;<V~~\u000f>=|\u0012>", "3uT;g", "\u001a`]1e6BRb\u0010~^>Fn/y_9{I\u0010l", "7mc2e5:Z\u0003\baZ@\u0007\u0019>", "1gP;Z,=", ":dUA", "Bn_", "@hV5g", "0ncAb4", "7mc2e5:Z\u0003\baZ@\u0007\u0019>$\u0010,uM\u0001\u001e\u0017C}\u000e", "7mc2e5:Z\u0003\bb^(\u000b\u0019<e", "EhSA[\u0014>O'\u000f\b^\u001a\b\t-", "6dX4[;&S\u0015\r\u000bk,j\u0014/c", "7mc2e5:Z\u0003\bb^(\u000b\u0019<e>8\u007f:\u000e\u0017\u001eGk\u001c<", ";`h/X\u0019>U\u001d\r\n^9Y\u0005-k]$\u0003G}\u0013\u0015M", ";`h/X\u001cG`\u0019\u0001~l;|\u0016\fa}.Y<\b\u001e\u0014Cm\u0014", "=m0Ag(<V\u0019}ih\u001e\u0001\u0012.o\u0012", "=m32g(<V\u0019}[k6\u0005z3n~2\u000e", "=mC<h*A3*~\u0004m", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", ">n[996K:#|vm0\u0007\u0012\u0019nm&\t@\u0001 tJk\u0017>v", ">`a2a;", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g\u0002/;w\u001f\fWLJkG-j", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f$Fq 7+MDz41$>H?\u0011r3R\u007fpL]Vu]b{;#\u0016d\u0017\\tm\u0015b?3rN@k]o:", "Adc\u0019T@Hc(]~k,z\u00183o\t", ":`h<h;\u001dW&~xm0\u0007\u0012", "Ag^D", "At_2e\u001a>b\u007fz\u000fh<\fg3r\u007f&\u000bD\u000b ", "CoS.g,)O&z\u0003^;|\u0016=", "CoS.g,)O&~\u0004m\t\u0007\u00198d\u000e", "CoS.g,)O&~\u0004m\t\u0007\u00198d\u000ef\fDz$\u0017No\nJv", "CoS.g,)O&~\u0004m\u0013x\u001d9u\u000f\u0006\u0006J\u000e\u0016\u001bPk\u001d<\u0005", "CoS.g,)]$\u000f\u0006I9\u0007\u0014/r\u000f,{N", "CoS.g,)]'\u0003\nb6\u0006", "\u0011n\\=T5B]\"", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PopupLayout extends AbstractComposeView implements ViewRootForInspector {
    private Object backCallback;
    private final State canCalculatePosition$delegate;
    private final View composeView;
    private final MutableState content$delegate;
    private final int[] locationOnScreen;
    private final float maxSupportedElevation;
    private Function0<Unit> onDismissRequest;
    private final WindowManager.LayoutParams params;
    private IntRect parentBounds;
    private final MutableState parentLayoutCoordinates$delegate;
    private LayoutDirection parentLayoutDirection;
    private final MutableState popupContentSize$delegate;
    private final PopupLayoutHelper popupLayoutHelper;
    private PopupPositionProvider positionProvider;
    private final Rect previousWindowVisibleFrame;
    private PopupProperties properties;
    private boolean shouldCreateCompositionOnAttachedToWindow;
    private final SnapshotStateObserver snapshotStateObserver;
    private String testTag;
    private final WindowManager windowManager;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final Function1<PopupLayout, Unit> onCommitAffectingPopupPosition = new Function1<PopupLayout, Unit>() { // from class: androidx.compose.ui.window.PopupLayout$Companion$onCommitAffectingPopupPosition$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PopupLayout popupLayout) {
            invoke2(popupLayout);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PopupLayout popupLayout) {
            if (popupLayout.isAttachedToWindow()) {
                popupLayout.updatePosition();
            }
        }
    };

    /* JADX INFO: compiled from: AndroidPopup.android.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    @Override // android.view.View
    public void setLayoutDirection(int i2) {
    }

    public final String getTestTag() {
        return this.testTag;
    }

    public final void setTestTag(String str) {
        this.testTag = str;
    }

    public /* synthetic */ PopupLayout(Function0 function0, PopupProperties popupProperties, String str, View view, Density density, PopupPositionProvider popupPositionProvider, UUID uuid, PopupLayoutHelper popupLayoutHelper, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        PopupLayoutHelperImpl popupLayoutHelperImpl = popupLayoutHelper;
        if ((i2 & 128) != 0) {
            if (Build.VERSION.SDK_INT >= 29) {
                popupLayoutHelperImpl = new PopupLayoutHelperImpl29();
            } else {
                popupLayoutHelperImpl = new PopupLayoutHelperImpl();
            }
        }
        this(function0, popupProperties, str, view, density, popupPositionProvider, uuid, popupLayoutHelperImpl);
    }

    public PopupLayout(Function0<Unit> function0, PopupProperties popupProperties, String str, View view, Density density, PopupPositionProvider popupPositionProvider, UUID uuid, PopupLayoutHelper popupLayoutHelper) throws Throwable {
        super(view.getContext(), null, 0, 6, null);
        this.onDismissRequest = function0;
        this.properties = popupProperties;
        this.testTag = str;
        this.composeView = view;
        this.popupLayoutHelper = popupLayoutHelper;
        Context context = view.getContext();
        short sXd = (short) (C1607wl.Xd() ^ 20183);
        short sXd2 = (short) (C1607wl.Xd() ^ 12328);
        int[] iArr = new int["@\u001cU]\b|".length()];
        QB qb = new QB("@\u001cU]\b|");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
            i2++;
        }
        Object[] objArr = {new String(iArr, 0, i2)};
        Method method = Class.forName(C1626yg.Ud("\u0007\u0007D!X|f\u0005Yr|-\u0018v_a2}ixTm\n", (short) (C1607wl.Xd() ^ 31617), (short) (C1607wl.Xd() ^ 11065))).getMethod(EO.Od("Z2\u000fNM\u001cx:\t\u0003\u0017>\r\u0006\u0004 ", (short) (C1633zX.Xd() ^ (-20443))), Class.forName(Ig.wd("\u0005+~\u0001N8\u0019\u0006<.]\u0019H=bt", (short) (FB.Xd() ^ 17037))));
        try {
            method.setAccessible(true);
            Object objInvoke = method.invoke(context, objArr);
            Intrinsics.checkNotNull(objInvoke, C1561oA.Qd("\u007f\u0006{z-olxww{&gi#ebss\u001eqk\u001bhhf$dj`_\u0012ei_S\rMYN[WPJ\u0013ZLGX\u000e6GK@JQ&9E7<9E", (short) (ZN.Xd() ^ 4867)));
            this.windowManager = (WindowManager) objInvoke;
            this.params = createLayoutParams();
            this.positionProvider = popupPositionProvider;
            this.parentLayoutDirection = LayoutDirection.Ltr;
            this.popupContentSize$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            this.parentLayoutCoordinates$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            this.canCalculatePosition$delegate = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: androidx.compose.ui.window.PopupLayout$canCalculatePosition$2
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    LayoutCoordinates parentLayoutCoordinates = this.this$0.getParentLayoutCoordinates();
                    if (parentLayoutCoordinates == null || !parentLayoutCoordinates.isAttached()) {
                        parentLayoutCoordinates = null;
                    }
                    return Boolean.valueOf((parentLayoutCoordinates == null || this.this$0.m6897getPopupContentSizebOM6tXw() == null) ? false : true);
                }
            });
            float fM6638constructorimpl = Dp.m6638constructorimpl(8);
            this.maxSupportedElevation = fM6638constructorimpl;
            this.previousWindowVisibleFrame = new Rect();
            this.snapshotStateObserver = new SnapshotStateObserver(new PopupLayout$snapshotStateObserver$1(this));
            setId(R.id.content);
            PopupLayout popupLayout = this;
            ViewTreeLifecycleOwner.set(popupLayout, ViewTreeLifecycleOwner.get(view));
            ViewTreeViewModelStoreOwner.set(popupLayout, ViewTreeViewModelStoreOwner.get(view));
            ViewTreeSavedStateRegistryOwner.set(popupLayout, ViewTreeSavedStateRegistryOwner.get(view));
            setTag(androidx.compose.ui.R.id.compose_view_saveable_id_tag, C1593ug.zd("w\u0018\u001a \u001cf", (short) (FB.Xd() ^ 3701), (short) (FB.Xd() ^ 10047)) + uuid);
            setClipChildren(false);
            setElevation(density.mo710toPx0680j_4(fM6638constructorimpl));
            setOutlineProvider(new ViewOutlineProvider() { // from class: androidx.compose.ui.window.PopupLayout.2
                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view2, Outline outline) {
                    outline.setRect(0, 0, view2.getWidth(), view2.getHeight());
                    outline.setAlpha(0.0f);
                }
            });
            this.content$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ComposableSingletons$AndroidPopup_androidKt.INSTANCE.m6896getLambda1$ui_release(), null, 2, null);
            this.locationOnScreen = new int[2];
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.params;
    }

    public final PopupPositionProvider getPositionProvider() {
        return this.positionProvider;
    }

    public final void setPositionProvider(PopupPositionProvider popupPositionProvider) {
        this.positionProvider = popupPositionProvider;
    }

    public final LayoutDirection getParentLayoutDirection() {
        return this.parentLayoutDirection;
    }

    public final void setParentLayoutDirection(LayoutDirection layoutDirection) {
        this.parentLayoutDirection = layoutDirection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final IntSize m6897getPopupContentSizebOM6tXw() {
        return (IntSize) this.popupContentSize$delegate.getValue();
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m6898setPopupContentSizefhxjrPA(IntSize intSize) {
        this.popupContentSize$delegate.setValue(intSize);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutCoordinates getParentLayoutCoordinates() {
        return (LayoutCoordinates) this.parentLayoutCoordinates$delegate.getValue();
    }

    private final void setParentLayoutCoordinates(LayoutCoordinates layoutCoordinates) {
        this.parentLayoutCoordinates$delegate.setValue(layoutCoordinates);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.canCalculatePosition$delegate.getValue()).booleanValue();
    }

    @Override // androidx.compose.ui.platform.ViewRootForInspector
    public AbstractComposeView getSubCompositionView() {
        return this;
    }

    private final Function2<Composer, Integer, Unit> getContent() {
        return (Function2) this.content$delegate.getValue();
    }

    private final void setContent(Function2<? super Composer, ? super Integer, Unit> function2) {
        this.content$delegate.setValue(function2);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    public final void show() {
        this.windowManager.addView(this, this.params);
    }

    public final void setContent(CompositionContext compositionContext, Function2<? super Composer, ? super Integer, Unit> function2) {
        setParentCompositionContext(compositionContext);
        setContent(function2);
        this.shouldCreateCompositionOnAttachedToWindow = true;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void Content(Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-857613600);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Content)573@23861L9:AndroidPopup.android.kt#2oxthz");
        if ((6 & i2) == 0) {
            int i4 = composerStartRestartGroup.changedInstance(this) ? 4 : 2;
            i3 = (i4 + i2) - (i4 & i2);
        } else {
            i3 = i2;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 3)) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-857613600, i3, -1, "androidx.compose.ui.window.PopupLayout.Content (AndroidPopup.android.kt:572)");
            }
            getContent().invoke(composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.window.PopupLayout.Content.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    PopupLayout.this.Content(composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.snapshotStateObserver.start();
        maybeRegisterBackCallback();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.snapshotStateObserver.stop();
        this.snapshotStateObserver.clear();
        maybeUnregisterBackCallback();
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void internalOnMeasure$ui_release(int i2, int i3) {
        if (this.properties.getUsePlatformDefaultWidth()) {
            super.internalOnMeasure$ui_release(i2, i3);
        } else {
            super.internalOnMeasure$ui_release(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), Integer.MIN_VALUE));
        }
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void internalOnLayout$ui_release(boolean z2, int i2, int i3, int i4, int i5) {
        View childAt;
        super.internalOnLayout$ui_release(z2, i2, i3, i4, i5);
        if (this.properties.getUsePlatformDefaultWidth() || (childAt = getChildAt(0)) == null) {
            return;
        }
        this.params.width = childAt.getMeasuredWidth();
        this.params.height = childAt.getMeasuredHeight();
        this.popupLayoutHelper.updateViewLayout(this.windowManager, this, this.params);
    }

    private final int getDisplayWidth() throws Throwable {
        Context context = getContext();
        Object[] objArr = new Object[0];
        Method method = Class.forName(hg.Vd("^j_lha[$XcafV^c\u001c0[Y^N`[", (short) (C1633zX.Xd() ^ (-21985)), (short) (C1633zX.Xd() ^ (-12588)))).getMethod(C1561oA.ud("\n\u0007\u0015q\u0004\u0011\f\u0011\r|}\u000b", (short) (ZN.Xd() ^ 30267)), new Class[0]);
        try {
            method.setAccessible(true);
            float f2 = ((Resources) method.invoke(context, objArr)).getDisplayMetrics().density;
            Context context2 = getContext();
            Object[] objArr2 = new Object[0];
            try {
                Class.forName(C1561oA.yd("@LANRKE\u000eJUSXPX]\u0016\u0012=;@8JE", (short) (C1580rY.Xd() ^ (-430)))).getMethod(C1561oA.Yd("BAQ0DSPWUGJY", (short) (C1633zX.Xd() ^ (-23467))), new Class[0]).setAccessible(true);
                return Math.round(((Resources) r1.invoke(context2, objArr2)).getConfiguration().screenWidthDp * f2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private final int getDisplayHeight() throws Throwable {
        Context context = getContext();
        Object[] objArr = new Object[0];
        Method method = Class.forName(Wg.Zd("%_\u0001Rz@^S=t?h%Q\u0003h1)K\u001d\u0019o\u0018", (short) (C1633zX.Xd() ^ (-24061)), (short) (C1633zX.Xd() ^ (-23294)))).getMethod(C1561oA.Xd("edtSgvszxjm|", (short) (FB.Xd() ^ 16106)), new Class[0]);
        try {
            method.setAccessible(true);
            float f2 = ((Resources) method.invoke(context, objArr)).getDisplayMetrics().density;
            Context context2 = getContext();
            Object[] objArr2 = new Object[0];
            try {
                Class.forName(Wg.vd("9G>MC>:\u00053@@G1;B|+XX_I]Z", (short) (C1633zX.Xd() ^ (-32328)))).getMethod(Qg.kd("iftQcpkpl\\]j", (short) (ZN.Xd() ^ 24580), (short) (ZN.Xd() ^ 20518)), new Class[0]).setAccessible(true);
                return Math.round(((Resources) r1.invoke(context2, objArr2)).getConfiguration().screenHeightDp * f2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        if (keyEvent.getKeyCode() == 4 && this.properties.getDismissOnBackPress()) {
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                }
                return true;
            }
            if (keyEvent.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                Function0<Unit> function0 = this.onDismissRequest;
                if (function0 != null) {
                    function0.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    private final void maybeRegisterBackCallback() {
        if (this.properties.getDismissOnBackPress() && Build.VERSION.SDK_INT >= 33) {
            if (this.backCallback == null) {
                this.backCallback = Api33Impl.createBackCallback(this.onDismissRequest);
            }
            Api33Impl.maybeRegisterBackCallback(this, this.backCallback);
        }
    }

    private final void maybeUnregisterBackCallback() {
        if (Build.VERSION.SDK_INT >= 33) {
            Api33Impl.maybeUnregisterBackCallback(this, this.backCallback);
        }
        this.backCallback = null;
    }

    public final void updateParameters(Function0<Unit> function0, PopupProperties popupProperties, String str, LayoutDirection layoutDirection) {
        this.onDismissRequest = function0;
        this.testTag = str;
        updatePopupProperties(popupProperties);
        superSetLayoutDirection(layoutDirection);
    }

    private final void updatePopupProperties(PopupProperties popupProperties) {
        if (Intrinsics.areEqual(this.properties, popupProperties)) {
            return;
        }
        if (popupProperties.getUsePlatformDefaultWidth() && !this.properties.getUsePlatformDefaultWidth()) {
            this.params.width = -2;
            this.params.height = -2;
        }
        this.properties = popupProperties;
        this.params.flags = AndroidPopup_androidKt.flagsWithSecureFlagInherited(popupProperties, AndroidPopup_androidKt.isFlagSecureEnabled(this.composeView));
        this.popupLayoutHelper.updateViewLayout(this.windowManager, this, this.params);
    }

    public final void updateParentLayoutCoordinates(LayoutCoordinates layoutCoordinates) {
        setParentLayoutCoordinates(layoutCoordinates);
        updateParentBounds$ui_release();
    }

    public final void pollForLocationOnScreenChange() {
        int[] iArr = this.locationOnScreen;
        int i2 = iArr[0];
        int i3 = iArr[1];
        this.composeView.getLocationOnScreen(iArr);
        int[] iArr2 = this.locationOnScreen;
        if (i2 == iArr2[0] && i3 == iArr2[1]) {
            return;
        }
        updateParentBounds$ui_release();
    }

    public final void updateParentBounds$ui_release() {
        LayoutCoordinates parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.isAttached()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates != null) {
                long jMo5522getSizeYbymL2g = parentLayoutCoordinates.mo5522getSizeYbymL2g();
                long jPositionInWindow = LayoutCoordinatesKt.positionInWindow(parentLayoutCoordinates);
                IntRect intRectM6798IntRectVbeCjmY = IntRectKt.m6798IntRectVbeCjmY(IntOffsetKt.IntOffset(Math.round(Offset.m3937getXimpl(jPositionInWindow)), Math.round(Offset.m3938getYimpl(jPositionInWindow))), jMo5522getSizeYbymL2g);
                if (!Intrinsics.areEqual(intRectM6798IntRectVbeCjmY, this.parentBounds)) {
                    this.parentBounds = intRectM6798IntRectVbeCjmY;
                    updatePosition();
                }
            }
        }
    }

    public final void updatePosition() {
        IntSize intSizeM6897getPopupContentSizebOM6tXw;
        final IntRect intRect = this.parentBounds;
        if (intRect == null || (intSizeM6897getPopupContentSizebOM6tXw = m6897getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        final long jM6812unboximpl = intSizeM6897getPopupContentSizebOM6tXw.m6812unboximpl();
        Rect rect = this.previousWindowVisibleFrame;
        this.popupLayoutHelper.getWindowVisibleDisplayFrame(this.composeView, rect);
        IntRect intBounds = AndroidPopup_androidKt.toIntBounds(rect);
        final long jIntSize = IntSizeKt.IntSize(intBounds.getWidth(), intBounds.getHeight());
        final Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = IntOffset.Companion.m6776getZeronOccac();
        this.snapshotStateObserver.observeReads(this, onCommitAffectingPopupPosition, new Function0<Unit>() { // from class: androidx.compose.ui.window.PopupLayout.updatePosition.1
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
                longRef.element = this.getPositionProvider().mo682calculatePositionllwVHH4(intRect, jIntSize, this.getParentLayoutDirection(), jM6812unboximpl);
            }
        });
        this.params.x = IntOffset.m6766getXimpl(longRef.element);
        this.params.y = IntOffset.m6767getYimpl(longRef.element);
        if (this.properties.getExcludeFromSystemGesture()) {
            this.popupLayoutHelper.setGestureExclusionRects(this, IntSize.m6808getWidthimpl(jIntSize), IntSize.m6807getHeightimpl(jIntSize));
        }
        this.popupLayoutHelper.updateViewLayout(this.windowManager, this, this.params);
    }

    public final void dismiss() {
        PopupLayout popupLayout = this;
        ViewTreeLifecycleOwner.set(popupLayout, null);
        this.windowManager.removeViewImmediate(popupLayout);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.properties.getDismissOnClickOutside()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            Function0<Unit> function0 = this.onDismissRequest;
            if (function0 != null) {
                function0.invoke();
            }
            return true;
        }
        if (motionEvent != null && motionEvent.getAction() == 4) {
            Function0<Unit> function02 = this.onDismissRequest;
            if (function02 != null) {
                function02.invoke();
            }
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    private final void superSetLayoutDirection(LayoutDirection layoutDirection) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        int i3 = 1;
        if (i2 == 1) {
            i3 = 0;
        } else if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        super.setLayoutDirection(i3);
    }

    private final WindowManager.LayoutParams createLayoutParams() throws Throwable {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = AndroidPopup_androidKt.flagsWithSecureFlagInherited(this.properties, AndroidPopup_androidKt.isFlagSecureEnabled(this.composeView));
        layoutParams.type = 1002;
        layoutParams.token = this.composeView.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        Context context = this.composeView.getContext();
        Class<?> cls = Class.forName(C1561oA.od("frgtpic,`kin^fk$8cafVhc", (short) (OY.Xd() ^ 29230)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1633zX.Xd() ^ (-12363));
        int[] iArr = new int["87G&:IFMK=@O".length()];
        QB qb = new QB("87G&:IFMK=@O");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            layoutParams.setTitle(((Resources) method.invoke(context, objArr)).getString(androidx.compose.ui.R.string.default_popup_window_title));
            return layoutParams;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX INFO: compiled from: AndroidPopup.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012\u0006\u0007nʑ?ӇE{߉^R\u0002)Op\u00024ż_$\u007fC\fm(~:\u0015_Pwg\u001dMj\rS\u000f4\u001a'l\u0003ղWޯa\u0012\u0017˰ԸsD"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0013\u001b Fy \u0006a/@i\t\u00073\u0002 >\\\u0002\u0019u<)\u0011qeC\u00109", "", "u(E", "=m2<`4Bbt\u007f{^*\f\r8gj2\u0007P\f\u0002!Us\u001d@\u0001.", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0013\u001b Fy \u0006a/@i\t\u00073\u0002 >\\\u0019", "", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
