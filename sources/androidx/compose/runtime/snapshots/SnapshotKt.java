package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.AtomicInt;
import androidx.compose.runtime.SnapshotThreadLocal;
import androidx.compose.runtime.WeakReference;
import androidx.compose.runtime.collection.ScatterSetWrapperKt;
import com.dynatrace.android.agent.Global;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
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
/* JADX INFO: compiled from: Snapshot.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яĝ\u0014D߬)\u001ew\u0006L܀kt\u0012_\u000e0!.J~0L\u001aw\u0015߿r9FDmH<R[ճ\u0017k\u00124,[:qKП]\u001a\u0014\"\u0011ѧVg}nRZ!C\u0017\u0006,xr,OV\u0001](\u000f:B\u0006?;MuDA`\u000b6\rړ:\"Ny\r\u0001 -P\u0010\rzKK\u0012\u00198@~CZ҈U\u00050\u0012\u000e>&\f&\\up>H\u0003]B/)\u0006qB\\&g0\u0003R\u0015Fj'\u0015vg53@M5\u001d%Y\u000b\u001fXif\u001b? CKh?[9p\fW|\u0001 \u0016\u001bۀ]5\u000e\u00124\u0006\u001dlp\u001d7:}qׂT\u0018.\u0007\u000b\u0002\u0013L\u0014\u0010\f-n?=\u001cv\bT[#\u007f\u001a@г\u0006^P*\u0013gDB=\u007fa1\u007f\u001b~\u0004og1Ne\u00015\u0013,P\u0019p7Z\u0003\u0013\u0011)!T\u0006\u007fI_P?XN8]Mo\u0014p\u0011\b@\u0003^T05\u0002\u0011<F=7\nii!\u0004\u001fVu\u007fvK\t\tYoɭVhJnDiZ\r\u001a\u000e\\dK\u0014\u0017Sг0\u0011[Pl,\f9+ # \\'+ī\\w\u0011i\u0019\u007f\u000e\u000e3b~7 \u0017\u001c\u0012env3cV*\u000fуVv\"uTh\u0013\u0010~B\u0002\u0011!٢@l@\u0001\u0003\u001e\b}TN:\u0017BA\u0002\u001cb2G\u0018\u000b\"x\u0015,pY\u000b\u0019ajh>\u0003d54\u0003\u0018*\u000b\b/]\r\u0003}!\u0011W<~p\"[Ea7)&\u0004(~3+07\u0005y\u007fU\"dGz\u001d\\um<.Q2Ga1M\u0013=\u000394\u0012-sR\td\u007fZB9\t9\u0012\u001dKj>g6n\u0001.pjxUj\u0016P\u0004\u000f\u00051A|\u000e\ncVzugd\rk>wx\u0019Xj[~|\u001d5,b\u0019oP\u0003e1Q\\5\u0016&\u0019_\u0019o\u001c\u0002o\\\u000e)\u000e>!sCDq&qrQ\fdK:YY-p8#\u001bCrLx/ B7u=7V\u0004|p\u0005y}\u000f=A~\u0007Z\u001b7VsH!4\u00164\\\u0010ZwQ<,^q9WMku{3c\\9P?\u000e\u0019:In@0\u0004 n]pOH\u0006\"_|AS\u0012\u0013\u0005!&J+\u00030+IZȫ\u00148#\u007ft\u0012?\u001b@u\f;\u001d6\u0005|j `\u0005\u000fD\u0011%8\u0012\u0017\u000fa,?5̰\tmT\u001fGq@Lk\u001d7!\u001bS\r3=+rS\u007fЉ@^\u000fX]]q\u0011H6\u001cg7<\u0004oR`8~#\u00ad&Ci[\u001f\t\u000f6n\red\u0015\r%a-ŜTĀ-~\tM&x\u0018`#\u0019\u0016\u001b\u0010d3ً\\ gG(S/DW\f<\u001cqo3H\u0016F=Lwx͂+\u0006]bK\u0004\u000e00)\nzGmg\u0010v\n$Ch#8\u0016ȫ\u0006\t!$8<<\u001f\rrPV(<U\u05ceA*;^\bp(@NPC\b\u0016S[w'\u0018ʋpmtd\u001b\tlAf{t3v.\u0019)].Y\u0001\tGWSޓ\\\u0011\u000ei-<-\r bW\u000f\u007fgv:\u0004O\n\f[3y;y1^`dݙ7\n\u0004[BV>\u0014i\t}BrGtlpkT^\u0003FrM$)B-/Llj+4t%Nh=l1\u001f\n\fwd\u0015\u0015]IT/wRW9E\u000b#oV'A\u0007H\u001a\r\u007fXA9v\u000eBD-tSm\u001e5j<m\u0013\u0011lK]FPcD\u0011<\u0017_^FUV\\H!\u0002QK['m\u0019\u0015f\u0014\u0018\u0007GC\u001bUa\u0003B\u0001+\u007f=C\b\u0010\u0004:\"69܌G.}zofiW]ezY<\u0012s+\u0017YsX\u001faZ{EG.y\u0004p.\u0017e߾*\u001e\u00171a]1\u000fR\u007fbFѲ\u0002\u007f,&Xh\u0017Dio\u001d|\u0002HDiF\b+\u0557Ɉ8A\tv1mL\u000eElMmmn\u007fޠR5m\u0014eA.)y?-\u0014]0X+w\u0007}3j\u0013T\u0013\"\t\u0001ߑݦ:yU%qS\u0014\u0013*T*\u0013\u000bsW̙\u001e`:\r;6 1\u0019\t0d+V?K%Zf`\u0007\u0003Yb9EU$ۮ2B\u001ao\u001e_<//\u0002D2\u0001\u001b\u0019ФU\u001ciG@\t\u001c##\u0010i\r.%.\u0013wCc0p=gG;qXAMe#-\u00066Y\u000eC&\u0010l;.\u000e~N\u001c:XLusqэ\u0014D~.nғ6߳4P\rE[\u000f\u000f\b7=\u001c=\u0006\u00058ďE\u0004\r\u0011Yi\u007fn\u0019}S1\u0007@\u001b\u0010o-C\u000f,\tQ2Qx=5Ld \\\u0010}C˷܁\u0014\u0003o79N\u0014\bGA\u0012\u0015vkEϓeg'\fNYL\u0006YL\u0013k!(&\"\u000e\u0017Ը:V7+c\u0001\u001f/ZjU#\u0015\u00124ڿF}.=4C\u000b\u001c{c\u0010D:l\t\tuc\u001b\u007f8\u001b\bf#^ǕI+\u0004}Vt\u007f~{O&{\u000fWbЙL?\u007f&nE\"\u001c#%ocp)v?\u0006\u0003{\u0014\fop\"iC2Xټ}|lsNiDLXn\u001flu1+STbOH\u001fU\bŝh܍0'D7\u0003Z\u000fpca]{WJ|Ÿu[b\"\u0010Ts_+FXm6j( E\u007fkqN\r\u001e@-*\u0013g~\u0004\u0014n\u0015Mv,{1BF!(J:ނ+mnqpĊ\u0012Ё\t,|Dj\u001b\u0004\u000f\u000bdE\u000b> G\u008eGoI\u00131K\\\n8Lfb\u0017X#M^\u007f\u0014]*B*I\u001dE\u00021KW Tdr,R\u0016z\b\"\u001dkX,sL3O0J?jęQw\rC\u0003մGӫ\u000e\"7\u0016 >5t`4\u0011ZB)\u0007سD@rf\u001d+M\t,4_x\u0004LJml\b\u0017auiY=\u0004bEDԿ3q\u00160iy\rճ_\u000ew\u0015\u0011×\u001fӏy[EԘ6\\\u0015o\u001cO \u000epsR\u001f\b\u000er6{:*K1\u0017zM>\u001a\tk~n\u0007P\u0010\u0016k\u0018;\u0015[م\u007fߑ'@-߈\u0001\u0014\u000eB!\u0011-AaM\u0003\u0015l\u0013>_`G@\u0018v`O\u001c+\f\u0015S\u0003$>;[wnTCdbr:¢$ڌLk0ޢ*\u001f$B5\u001bEJ\u001d\u0003~lڪkh\u000fd3\u0014-~_\nw6XXm\\0/\n\u000e<W=ǠR֭E\u0007tͣ\u0017\t\u0001)W\u001b\u0012,U\"KW\u0014,>ֵ8ɶ?]pƯ\u0005\u0019,\u0004sm7>\u000e\u00121\u0015Q\u001fD\u00124\n\u0010t\n:}\u0003/A\u001fג\u0018˳G.\u0010á%\u007fZ\u001bM\no5u؎Gơ-џcjJѪ\u001d''?\u00190@cr,}/H.Q.\u000f\u001b\u001c\bf\u0092U֣\r-Yȋ\u001b&@,8U>M`ՎnƲ{\u007f)θP<\u0002&eL\u001c\u001c\u0005Ś{ȫ{^\u0018Պ\u0012Hk\u001e\u00106sHfʢTȺ\u0018bdÇGu6e/\u000eL$`ſ\tҕpО\u001fhpҫ\u007fxX\u0005 xLp;{NYK5\u000fK\u0019\u0007\u0019%m+BC\b{\u001dŅ\u0011øzPK؛\u008dx2"}, d2 = {"\u0017ME\u000e?\u0010\u001dM\u0007gVI\u001a_r\u001e", "", "/o_9l\u0016;a\u0019\f\f^9\u000b", "", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u00047INIn>-j", "", "1ta?X5M5 \twZ3j\u0012+p\u000e+\u0006O", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0013&Qw\u0012:@\u0001Dc\u0006$5Z\u0016/MP;t2\u001ej", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7w5W@7r\"'\u0011so<\u0011r\u0002", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iK\u0001-9Wj 8m#.VA;A", "3l_Al\u0013:[\u0016}v", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u00047INIn>-xgO9\u00169", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "7me._0=", "3wc?T\u001aMO(~d[1|\u0007>s", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u00047INIn>-\u0007h]?tc;$", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u0004=IR;U1#\u0015fp\u000f", "5k^/T30`\u001d\u000ezH)\u000b\t<v\u007f5\n", ":nR8", "5dc\u0019b*D\u0012\u0015\b\u0004h;x\u00183o\t6", "u(E", "5dc\u0019b*D", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "<dgAF5:^'\u0002\u0005m\u0010{", "=oT;F5:^'\u0002\u0005m:", ">d]1\\5@/$\n\u0002r\u0016y\u0017/r\u0011(\t\u001e\u000b' V", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iK\u0001-9Wa)FC", ">h];\\5@B\u0015{\u0002^", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u00047INIn>-srq6\u000ec\u0010Wu'Z/N(g(", "AmP=f/Hb|\b~m0x\u00103z\u007f5", "5dc a(Ia\u001c\t\nB5\u0001\u00183a\u0007,\u0011@\u000eU\u0013Px\u0018Kr49c\u0007.", "5dc a(Ia\u001c\t\nB5\u0001\u00183a\u0007,\u0011@\u000e", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006\u0005.1d\f#A|$w;L7vB!\u001fw7", "Bga2T+,\\\u0015\n\ta6\f", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Er0C\\\b/&p#.IB\"u2\u001a\u001c>", "/ce.a*>5 \twZ3j\u0012+p\u000e+\u0006O", "\"", "0k^0^", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%Sc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "1gT0^\bGR\u0003\u0010zk>\n\r>eo1\fN\u0001\u0016\u0004Gm\u0018Iu3\u001cc{&7l", "1qT.g,-`\u0015\b\ti(\n\t8tm1wK\u000f\u001a!Va\u0012Ky\u000e?Dy-7v%\u001bM?:U1,\u0015ur9\u0014", ">qTC\\6Na\u0007\bvi:\u007f\u0013>", "@dP1B)LS&\u0010zk", "=v]@C9>d\u001d\t\u000bl\u001a\u0006\u0005:s\u00032\u000b", "", "1ta?X5M", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u0004=IR;X4\u001c\u001fu`\u000f", "@", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoWJ\u007f!@g\u0001*F{_\u001c\\?Jk!\u001e\u0013rn8\\'\u0013J\u007f&TVR+o\u001cpG\u001c\u001dd\u001cNt\u001a\u0015bP(vD\u0001-\u0011(T\u0010>r\u0010\u001a_{Df\u007fBC\u0010E\u0004\"t\u0017", "AmP=f/Hb", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoWJ\u007f!@g\u0001*F{_\u001c\\?Jk!\u001e\u0013rn8\\J(Wu4QPM?&P|E\u001f\u001ch\u000e\u00188\u001d\u000ehE,n\u000eE(\u00047W\u0005Ew\u000fU\u0004\u00171u~E`\u001f\u001d={qJ(uP]^\r\u0011?Oj5n\u001a_fiJC3\u0018y\u0019dvY*\u0015\nV\u001b\u0002`CUvC(z%$<whE\u001b", "1ta?X5MA\"z\u0006l/\u0007\u0018", ";da4X++S\u0015}d[:|\u0016@e\r", ">`a2a;(P'~\bo,\n", ";da4X\u0019>O\u0018hwl,\n\u001a/r", ";da4X+0`\u001d\u000ezH)\u000b\t<v\u007f5", "EqXAX\u0016;a\u0019\f\f^9", "<nc6Y@0`\u001d\u000ez", "AsPAX", "=oc6`0Lb\u001d|b^9~\t=", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7}>\\?8r4\f\u001edlG\nm;$", "/o_9l0GU\u0007\bvi:\u007f\u0013>", "7me._0=A\"z\u0006l/\u0007\u0018=", "=uT?j9Bb\u0019n\u0004n:|\b\u001ce}2\t?\u000f}!Eu\u000e;", ">q^0X:L4#\fjg<\u000b\t.R\u007f&\u0006M\u007f%}Qm\u0014<u", "@dP189K]&", "", "@dP1T)ES", "7c", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoWJ\u007f!@g\u0001*F{_\u001c\\?Jk!\u001e\u0013rn8\\G\u0013J\u007f&TVR+o\u001cpG\u001c\u001dd\u001cNt\u001a\u0015bP(vD\u0001-\u0011(T\u0010>r\u0010\u001a_{>f{PY\u001aV]\u0014cA8>\n@[\u0003FNOf)wU]'dED2\u0014;&+q_2\u0012{\u001d\u001f{N\u0005ujQ(\t\u0002\u0012MijF2oSF\u0002&t", "@d[2T:>>\u001d\b\u0004b5~o9c\u0006(z", "6`]1_,", "@d_<e;+S\u0015}\u0005g3\u0011v8a\u000b6~J\u0010\t$K~\u000e", "Ax]0", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$Sc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "B`Z2A,P5 \twZ3j\u0012+p\u000e+\u0006O", ">qTC\\6Naz\u0006\u0005[(\u0004v8a\u000b6~J\u0010", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoWJ\u007f!@g\u0001*F{_\u001cV?Fy7($>H?\u0011r3R\u007fpL]Vu]b{;#\u0016d\u0017\\tm\u0015b?3rN@j]o0\u00077y|U\u001d\n>l:,S\u0015Gw$K", "B`Z2A,PA\"z\u0006l/\u0007\u0018", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%Sc\u001ei\u001f-ZM?jGg\u0013riD\u0011q,\u0018\u00047P[R4\\\u001c\u0001F\u0010\u001dh\u0011X:\u001bNGJ yR:)\u0017\u0002", "BqP0^\u0017B\\\"\u0003\u0004`", "CrT1?6<Y\u0019}", "D`[6W", "2`c.", "1`]1\\+:b\u0019l\u0004Z7\u000b\f9t", "D`[6W(MS\u0003\nzg", "/cS\u001fT5@S", "4q^:", "Cmc6_", "4h]1L6N\\\u001b~\tm\u0016\n", ">qT1\\*:b\u0019", "<df\u001ci,Ke&\u0003\nZ)\u0004\t\u001ce}2\t?g!\u0015Mo\r", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoWJ\u007f!@g\u0001*F{_\u001c\\?Jk!\u001e\u0013rn8\\J(Wu4QPM?&P|E\u001f\u001ch\u000e\u00188\u001d\u000ehE,n\u000eE(\u00047W\u0005Ew\u000fU\u0004\u001d1yp,S\u0015Gw$K\u0005\u0010dOXl\u0004K@X,(n\u0014j'j:\u00041$z(\u001fpPw\u0018\u0005O\u001c\u0001U\u0004vu\u0011\u0007\n43>Z[DO|T\u0012", "<df$e0MO\u0016\u0006zK,z\u0013<d", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoWJ\u007f!@g\u0001*F{_\u001c\\?Jk!\u001e\u0013rn8\\J(Wu4QPM?&P|E\u001f\u001ch\u000e\u00188\u001d\u000ehE,n\u000eE(\u00047W\u0005Ew\u000fU\u0004\u001d1yp,S\u0015Gw$K(%qEfi}FT\u000f`4l\u0017i+\\\u0004G4\u001d\u0001\u001d#h\u001a<\u0013w^\u001fu\\\tu15\"vC2Awj\u001c\tVQEs4)Oz\u000b[0b|6~;\u0004}7Fm\u0014Oo\u0018\bl\u0002\u00117jD15D\u0006\u0001NGruY>\fr,`]", "<df$e0MO\u0016\u0006zK,z\u0013<df2yF\u0001\u0016", "=uT?j9Bb\u0015{\u0002^", Global.BLANK, "1`]1\\+:b\u0019", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoWJ\u007f!@g\u0001*F{_\u001c\\?Jk!\u001e\u0013rn8\\J(Wu4QPM?&P|E\u001f\u001ch\u000e\u00188\u001d\u000ehE,n\u000eE(\u00047W\u0005Ew\u000fU\u0004\u001d1yp,S\u0015Gw$K(%qEfi}FT\u000f`4l\u0017i+\\\u0004G4\u001d\u0001\u001d#h\u001a<\u0013w^\u001fu\\\tu15(vG$+mYPRn+#z1.R\u007f\u0001[7i|tu=\r29:n\u000eY1xNgv$0fJr{y#\u0018;\\_?s:\u0017jhK\u0005\u0013b3@n", "=uT?j9Bb\u0015{\u0002^\u0019|\u00079r~", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoWJ\u007f!@g\u0001*F{_\u001c\\?Jk!\u001e\u0013rn8\\J(Wu4QPM?&P|E\u001f\u001ch\u000e\u00188\u001d\u000ehE,n\u000eE(\u00047W\u0005Ew\u000fU\u0004\u001d1yp,S\u0015Gw$K(%qEfi}FT\u000f`4l\u0017i+\\\u0004G4\u001d\u0001\u001d#h\u001a<\u0013w^\u001fu\\\tu15\"vC2Awj\u001c,k^;\u00021#J\u000fA\u0010<`\u007f5\u0003-MA:?s\tSgaLgt :_K64\u007f*\";Zcbl<\u0018u\u001e7Kt^>0&oib[X\u0005g\u001ff?o_JDb\u000fMMw\u0015pT\b>f\b\u0018\u0013\u001627SX?*Tm\u001anN/^f", "Ehc56<K`\u0019\b\n", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoWJ\u007f!@g\u0001*F{_\u001c\\?Jk!\u001e\u0013rn8\\J2X\u0006.KU\u00181mZ<>$\u001bX\u001dR5\u0016\u0013#\"4wBF#\u00125\u0015W~O\u0006\b'\n~qlKXY1v\u001au?8>", "EqXAT)ES", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoWJ\u007f!@g\u0001*F{_\u001c\\?Jk!\u001e\u0013rn8\\J(Wu4QPM?&P|E\u001f\u001ch\u000e\u00188\u001d\u000ehE,n\u000eE(\u00047W\u0005Ew\u000fU\u0004\u001d1yp,S\u0015Gw$K(/rU`c\u0003\u0011FVjse\u001ch\u001bk>D-\";y+qN=\u000e\u0006\\\\H\u0016`lcX\u0015D? Go%0BtU:\u0004|", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoWJ\u007f!@g\u0001*F{_\u001c\\?Jk!\u001e\u0013rn8\\J(Wu4QPM?&P|E\u001f\u001ch\u000e\u00188\u001d\u000ehE,n\u000eE(\u00047W\u0005Ew\u000fU\u0004\u001d1yp,S\u0015Gw$K(%qEfi}FT\u000f`4l\u0017i+\\\u0004G4\u001d\u0001\u001d#h\u001a<\u0013w^\u001fu\\\tu15\"vC2Awj\u001c,u_K{+(\u0015\u0001\t\u001a{Y\u00054r<\b>3D.e[p\u0016Mb\u0003\u001ew2\u0005\u000e+2M\u000f\tR_~n\bwe$a\u0006\u001d8", "EqXAT)ES\u0006~xh9{", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SnapshotKt {
    private static final int INVALID_SNAPSHOT = 0;
    private static final AtomicReference<GlobalSnapshot> currentGlobalSnapshot;
    private static int nextSnapshotId = 0;
    private static SnapshotIdSet openSnapshots = null;
    private static AtomicInt pendingApplyObserverCount = null;
    private static final Snapshot snapshotInitializer;
    private static final Function1<SnapshotIdSet, Unit> emptyLambda = new Function1<SnapshotIdSet, Unit>() { // from class: androidx.compose.runtime.snapshots.SnapshotKt$emptyLambda$1
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(SnapshotIdSet snapshotIdSet) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SnapshotIdSet snapshotIdSet) {
            invoke2(snapshotIdSet);
            return Unit.INSTANCE;
        }
    };
    private static final SnapshotThreadLocal<Snapshot> threadSnapshot = new SnapshotThreadLocal<>();
    private static final Object lock = new Object();
    private static final SnapshotDoubleIndexHeap pinningTable = new SnapshotDoubleIndexHeap();
    private static final SnapshotWeakSet<StateObject> extraStateObjects = new SnapshotWeakSet<>();
    private static List<? extends Function2<? super Set<? extends Object>, ? super Snapshot, Unit>> applyObservers = CollectionsKt.emptyList();
    private static List<? extends Function1<Object, Unit>> globalWriteObservers = CollectionsKt.emptyList();

    public static /* synthetic */ void getLock$annotations() {
    }

    public static /* synthetic */ void getSnapshotInitializer$annotations() {
    }

    public static final int trackPinning(int i2, SnapshotIdSet snapshotIdSet) {
        int iAdd;
        int iLowest = snapshotIdSet.lowest(i2);
        synchronized (getLock()) {
            iAdd = pinningTable.add(iLowest);
        }
        return iAdd;
    }

    public static final void releasePinningLocked(int i2) {
        pinningTable.remove(i2);
    }

    public static final Snapshot currentSnapshot() {
        Snapshot snapshot = threadSnapshot.get();
        return snapshot == null ? currentGlobalSnapshot.get() : snapshot;
    }

    static {
        openSnapshots = SnapshotIdSet.Companion.getEMPTY();
        nextSnapshotId = 2;
        int i2 = nextSnapshotId;
        nextSnapshotId = i2 + 1;
        GlobalSnapshot globalSnapshot = new GlobalSnapshot(i2, SnapshotIdSet.Companion.getEMPTY());
        openSnapshots = openSnapshots.set(globalSnapshot.getId());
        AtomicReference<GlobalSnapshot> atomicReference = new AtomicReference<>(globalSnapshot);
        currentGlobalSnapshot = atomicReference;
        snapshotInitializer = atomicReference.get();
        pendingApplyObserverCount = new AtomicInt(0);
    }

    static /* synthetic */ Snapshot createTransparentSnapshotWithNoParentReadObserver$default(Snapshot snapshot, Function1 function1, boolean z2, int i2, Object obj) {
        if ((i2 + 2) - (2 | i2) != 0) {
            function1 = null;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return createTransparentSnapshotWithNoParentReadObserver(snapshot, function1, z2);
    }

    public static final Snapshot createTransparentSnapshotWithNoParentReadObserver(Snapshot snapshot, Function1<Object, Unit> function1, boolean z2) {
        boolean z3 = snapshot instanceof MutableSnapshot;
        if (z3 || snapshot == null) {
            return new TransparentObserverMutableSnapshot(z3 ? (MutableSnapshot) snapshot : null, function1, null, false, z2);
        }
        return new TransparentObserverSnapshot(snapshot, function1, false, z2);
    }

    static /* synthetic */ Function1 mergedReadObserver$default(Function1 function1, Function1 function12, boolean z2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            z2 = true;
        }
        return mergedReadObserver(function1, function12, z2);
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.SnapshotKt$mergedReadObserver$1 */
    /* JADX INFO: compiled from: Snapshot.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,i\bӵLc\u0003İIي>éFB-!\\\u0016\u0006\u0007~jg1\u000bm߬2RY,"}, d2 = {"\n`]<a@F])\rS", "", "AsPAX", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function1<Object, Unit> {
        final /* synthetic */ Function1<Object, Unit> $parentObserver;
        final /* synthetic */ Function1<Object, Unit> $readObserver;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
            super(1);
            function1 = function1;
            function1 = function12;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2(obj);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(Object obj) {
            function1.invoke(obj);
            function1.invoke(obj);
        }
    }

    public static final Function1<Object, Unit> mergedReadObserver(Function1<Object, Unit> function1, Function1<Object, Unit> function12, boolean z2) {
        if (!z2) {
            function12 = null;
        }
        if (function1 == null || function12 == null || function1 == function12) {
            return function1 == null ? function12 : function1;
        }
        return new Function1<Object, Unit>() { // from class: androidx.compose.runtime.snapshots.SnapshotKt.mergedReadObserver.1
            final /* synthetic */ Function1<Object, Unit> $parentObserver;
            final /* synthetic */ Function1<Object, Unit> $readObserver;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Function1<Object, Unit> function13, Function1<Object, Unit> function122) {
                super(1);
                function1 = function13;
                function1 = function122;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(obj);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2(Object obj) {
                function1.invoke(obj);
                function1.invoke(obj);
            }
        };
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.SnapshotKt$mergedWriteObserver$1 */
    /* JADX INFO: compiled from: Snapshot.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,i\bӵLc\u0003İIي>éFB-!\\\u0016\u0006\u0007~jg1\u000bm߬2RY,"}, d2 = {"\n`]<a@F])\rS", "", "AsPAX", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C07481 extends Lambda implements Function1<Object, Unit> {
        final /* synthetic */ Function1<Object, Unit> $parentObserver;
        final /* synthetic */ Function1<Object, Unit> $writeObserver;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07481(Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
            super(1);
            function1 = function1;
            function1 = function12;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2(obj);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(Object obj) {
            function1.invoke(obj);
            function1.invoke(obj);
        }
    }

    public static final Function1<Object, Unit> mergedWriteObserver(Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
        if (function1 == null || function12 == null || function1 == function12) {
            return function1 == null ? function12 : function1;
        }
        return new Function1<Object, Unit>() { // from class: androidx.compose.runtime.snapshots.SnapshotKt.mergedWriteObserver.1
            final /* synthetic */ Function1<Object, Unit> $parentObserver;
            final /* synthetic */ Function1<Object, Unit> $writeObserver;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C07481(Function1<Object, Unit> function13, Function1<Object, Unit> function122) {
                super(1);
                function1 = function13;
                function1 = function122;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(obj);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2(Object obj) {
                function1.invoke(obj);
                function1.invoke(obj);
            }
        };
    }

    public static final Object getLock() {
        return lock;
    }

    public static final <T> T sync(Function0<? extends T> function0) {
        T tInvoke;
        synchronized (getLock()) {
            try {
                tInvoke = function0.invoke();
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
        return tInvoke;
    }

    public static final Snapshot getSnapshotInitializer() {
        return snapshotInitializer;
    }

    public static final <T> T takeNewGlobalSnapshot(Snapshot snapshot, Function1<? super SnapshotIdSet, ? extends T> function1) {
        T tInvoke = function1.invoke(openSnapshots.clear(snapshot.getId()));
        synchronized (getLock()) {
            int i2 = nextSnapshotId;
            nextSnapshotId = i2 + 1;
            openSnapshots = openSnapshots.clear(snapshot.getId());
            currentGlobalSnapshot.set(new GlobalSnapshot(i2, openSnapshots));
            snapshot.dispose();
            openSnapshots = openSnapshots.set(i2);
            Unit unit = Unit.INSTANCE;
        }
        return tInvoke;
    }

    public static final <T> T advanceGlobalSnapshot(Function1<? super SnapshotIdSet, ? extends T> function1) {
        GlobalSnapshot globalSnapshot;
        MutableScatterSet<StateObject> modified$runtime_release;
        T t2;
        Snapshot snapshot = snapshotInitializer;
        Intrinsics.checkNotNull(snapshot, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot");
        synchronized (getLock()) {
            globalSnapshot = currentGlobalSnapshot.get();
            modified$runtime_release = globalSnapshot.getModified$runtime_release();
            if (modified$runtime_release != null) {
                pendingApplyObserverCount.add(1);
            }
            t2 = (T) takeNewGlobalSnapshot(globalSnapshot, function1);
        }
        if (modified$runtime_release != null) {
            try {
                List<? extends Function2<? super Set<? extends Object>, ? super Snapshot, Unit>> list = applyObservers;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    list.get(i2).invoke(ScatterSetWrapperKt.wrapIntoSet(modified$runtime_release), globalSnapshot);
                }
            } finally {
                pendingApplyObserverCount.add(-1);
            }
        }
        synchronized (getLock()) {
            checkAndOverwriteUnusedRecordsLocked();
            if (modified$runtime_release != null) {
                MutableScatterSet<StateObject> mutableScatterSet = modified$runtime_release;
                Object[] objArr = mutableScatterSet.elements;
                long[] jArr = mutableScatterSet.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j2 = jArr[i3];
                        long j3 = (-1) - (((-1) - ((~j2) << 7)) | ((-1) - j2));
                        if ((j3 - 9187201950435737472L) - (j3 | (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((255 & j2) < 128) {
                                    processForUnusedRecordsLocked((StateObject) objArr[(i3 << 3) + i5]);
                                }
                                j2 >>= 8;
                            }
                            if (i4 != 8) {
                                break;
                            }
                        }
                        if (i3 == length) {
                            break;
                        }
                        i3++;
                    }
                }
                Unit unit = Unit.INSTANCE;
            }
        }
        return t2;
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.SnapshotKt$advanceGlobalSnapshot$3 */
    /* JADX INFO: compiled from: Snapshot.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,i\bӵLc\u000b\u0004Iي>éFB-!\\\u0016\u0006\u0007~jg1\u000bm߬2RY,"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u00047INIn>-xgO9\u00169", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass3 extends Lambda implements Function1<SnapshotIdSet, Unit> {
        public static final AnonymousClass3 INSTANCE = ;

        AnonymousClass3() {
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(SnapshotIdSet snapshotIdSet) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SnapshotIdSet snapshotIdSet) {
            invoke2(snapshotIdSet);
            return Unit.INSTANCE;
        }
    }

    public static final void advanceGlobalSnapshot() {
        advanceGlobalSnapshot(AnonymousClass3.INSTANCE);
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.SnapshotKt$takeNewSnapshot$1 */
    /* JADX INFO: compiled from: Snapshot.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<;!&i\u0016DLш|\u0004W\u00068\u000b4B\rӬD\u0012>\u0006\u0007p?ӄRdp.\u0001SZ\u0013y|L$\n&8KтY\u001c\u0004%\u0017S"}, d2 = {"\n`]<a@F])\rS", "\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u00047INIn>-j", "7me._0=", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u00047INIn>-xgO9\u00169", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoWJ\u007f!@g\u0001*F{_\u001cV?Fy7($L`'\u0007r\u0002\u0012]#PK[6`Q\u0006\u0007\u0012\u001cb\u0019X9\rNfQ-}H?\u001fQ:R}Fv\u0004\u0016%\u001c~Xy>a\u001eJ\u0004$K"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C07491<T> extends Lambda implements Function1<SnapshotIdSet, T> {
        final /* synthetic */ Function1<SnapshotIdSet, T> $block;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C07491(Function1<? super SnapshotIdSet, ? extends T> function1) {
            super(1);
            function1 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Snapshot invoke(SnapshotIdSet snapshotIdSet) {
            Snapshot snapshot = (Snapshot) function1.invoke(snapshotIdSet);
            synchronized (SnapshotKt.getLock()) {
                SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(snapshot.getId());
                Unit unit = Unit.INSTANCE;
            }
            return snapshot;
        }
    }

    public static final <T extends Snapshot> T takeNewSnapshot(Function1<? super SnapshotIdSet, ? extends T> function1) {
        return (T) advanceGlobalSnapshot(new Function1<SnapshotIdSet, T>() { // from class: androidx.compose.runtime.snapshots.SnapshotKt.takeNewSnapshot.1
            final /* synthetic */ Function1<SnapshotIdSet, T> $block;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C07491(Function1<? super SnapshotIdSet, ? extends T> function12) {
                super(1);
                function1 = function12;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Snapshot invoke(SnapshotIdSet snapshotIdSet) {
                Snapshot snapshot = (Snapshot) function1.invoke(snapshotIdSet);
                synchronized (SnapshotKt.getLock()) {
                    SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(snapshot.getId());
                    Unit unit = Unit.INSTANCE;
                }
                return snapshot;
            }
        });
    }

    public static final void validateOpen(Snapshot snapshot) {
        int iLowestOrDefault;
        if (openSnapshots.get(snapshot.getId())) {
            return;
        }
        StringBuilder sbAppend = new StringBuilder("Snapshot is not open: id=").append(snapshot.getId()).append(", disposed=").append(snapshot.getDisposed$runtime_release()).append(", applied=");
        MutableSnapshot mutableSnapshot = snapshot instanceof MutableSnapshot ? (MutableSnapshot) snapshot : null;
        StringBuilder sbAppend2 = sbAppend.append(mutableSnapshot != null ? Boolean.valueOf(mutableSnapshot.getApplied$runtime_release()) : "read-only").append(", lowestPin=");
        synchronized (getLock()) {
            iLowestOrDefault = pinningTable.lowestOrDefault(-1);
        }
        throw new IllegalStateException(sbAppend2.append(iLowestOrDefault).toString().toString());
    }

    private static final boolean valid(int i2, int i3, SnapshotIdSet snapshotIdSet) {
        return (i3 == 0 || i3 > i2 || snapshotIdSet.get(i3)) ? false : true;
    }

    private static final boolean valid(StateRecord stateRecord, int i2, SnapshotIdSet snapshotIdSet) {
        return valid(i2, stateRecord.getSnapshotId$runtime_release(), snapshotIdSet);
    }

    public static final <T extends StateRecord> T readable(T t2, int i2, SnapshotIdSet snapshotIdSet) {
        T t3 = null;
        while (t2 != null) {
            if (valid(t2, i2, snapshotIdSet) && (t3 == null || t3.getSnapshotId$runtime_release() < t2.getSnapshotId$runtime_release())) {
                t3 = t2;
            }
            t2 = (T) t2.getNext$runtime_release();
        }
        if (t3 != null) {
            return t3;
        }
        return null;
    }

    public static final <T extends StateRecord> T readable(T t2, StateObject stateObject) {
        Snapshot current = Snapshot.Companion.getCurrent();
        Function1<Object, Unit> readObserver = current.getReadObserver();
        if (readObserver != null) {
            readObserver.invoke(stateObject);
        }
        T t3 = (T) readable(t2, current.getId(), current.getInvalid$runtime_release());
        if (t3 == null) {
            synchronized (getLock()) {
                Snapshot current2 = Snapshot.Companion.getCurrent();
                StateRecord firstStateRecord = stateObject.getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable$lambda$9");
                t3 = (T) readable(firstStateRecord, current2.getId(), current2.getInvalid$runtime_release());
                if (t3 == null) {
                    readError();
                    throw new KotlinNothingValueException();
                }
            }
        }
        return t3;
    }

    public static final <T extends StateRecord> T readable(T t2, StateObject stateObject, Snapshot snapshot) {
        Function1<Object, Unit> readObserver = snapshot.getReadObserver();
        if (readObserver != null) {
            readObserver.invoke(stateObject);
        }
        T t3 = (T) readable(t2, snapshot.getId(), snapshot.getInvalid$runtime_release());
        if (t3 != null) {
            return t3;
        }
        readError();
        throw new KotlinNothingValueException();
    }

    public static final Void readError() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied".toString());
    }

    private static final StateRecord usedLocked(StateObject stateObject) {
        int iLowestOrDefault = pinningTable.lowestOrDefault(nextSnapshotId) - 1;
        SnapshotIdSet empty = SnapshotIdSet.Companion.getEMPTY();
        StateRecord stateRecord = null;
        for (StateRecord firstStateRecord = stateObject.getFirstStateRecord(); firstStateRecord != null; firstStateRecord = firstStateRecord.getNext$runtime_release()) {
            if (firstStateRecord.getSnapshotId$runtime_release() == 0) {
                return firstStateRecord;
            }
            if (valid(firstStateRecord, iLowestOrDefault, empty)) {
                if (stateRecord != null) {
                    return firstStateRecord.getSnapshotId$runtime_release() < stateRecord.getSnapshotId$runtime_release() ? firstStateRecord : stateRecord;
                }
                stateRecord = firstStateRecord;
            }
        }
        return null;
    }

    private static final boolean overwriteUnusedRecordsLocked(StateObject stateObject) {
        StateRecord stateRecord;
        int iLowestOrDefault = pinningTable.lowestOrDefault(nextSnapshotId);
        StateRecord stateRecord2 = null;
        StateRecord firstStateRecord = null;
        int i2 = 0;
        for (StateRecord firstStateRecord2 = stateObject.getFirstStateRecord(); firstStateRecord2 != null; firstStateRecord2 = firstStateRecord2.getNext$runtime_release()) {
            int snapshotId$runtime_release = firstStateRecord2.getSnapshotId$runtime_release();
            if (snapshotId$runtime_release != 0) {
                if (snapshotId$runtime_release >= iLowestOrDefault) {
                    i2++;
                } else if (stateRecord2 == null) {
                    i2++;
                    stateRecord2 = firstStateRecord2;
                } else {
                    if (firstStateRecord2.getSnapshotId$runtime_release() < stateRecord2.getSnapshotId$runtime_release()) {
                        stateRecord = stateRecord2;
                        stateRecord2 = firstStateRecord2;
                    } else {
                        stateRecord = firstStateRecord2;
                    }
                    if (firstStateRecord == null) {
                        firstStateRecord = stateObject.getFirstStateRecord();
                        StateRecord stateRecord3 = firstStateRecord;
                        while (true) {
                            if (firstStateRecord == null) {
                                firstStateRecord = stateRecord3;
                                break;
                            }
                            if (firstStateRecord.getSnapshotId$runtime_release() >= iLowestOrDefault) {
                                break;
                            }
                            if (stateRecord3.getSnapshotId$runtime_release() < firstStateRecord.getSnapshotId$runtime_release()) {
                                stateRecord3 = firstStateRecord;
                            }
                            firstStateRecord = firstStateRecord.getNext$runtime_release();
                        }
                    }
                    stateRecord2.setSnapshotId$runtime_release(0);
                    stateRecord2.assign(firstStateRecord);
                    stateRecord2 = stateRecord;
                }
            }
        }
        return i2 > 1;
    }

    private static final StateRecord findYoungestOr(StateRecord stateRecord, Function1<? super StateRecord, Boolean> function1) {
        StateRecord stateRecord2 = stateRecord;
        while (stateRecord != null) {
            if (function1.invoke(stateRecord).booleanValue()) {
                return stateRecord;
            }
            if (stateRecord2.getSnapshotId$runtime_release() < stateRecord.getSnapshotId$runtime_release()) {
                stateRecord2 = stateRecord;
            }
            stateRecord = stateRecord.getNext$runtime_release();
        }
        return stateRecord2;
    }

    public static final void checkAndOverwriteUnusedRecordsLocked() {
        SnapshotWeakSet<StateObject> snapshotWeakSet = extraStateObjects;
        int size$runtime_release = snapshotWeakSet.getSize$runtime_release();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= size$runtime_release) {
                break;
            }
            WeakReference<StateObject> weakReference = snapshotWeakSet.getValues$runtime_release()[i2];
            Object obj = weakReference != null ? weakReference.get() : null;
            if (obj != null && overwriteUnusedRecordsLocked((StateObject) obj)) {
                if (i3 != i2) {
                    snapshotWeakSet.getValues$runtime_release()[i3] = weakReference;
                    snapshotWeakSet.getHashes$runtime_release()[i3] = snapshotWeakSet.getHashes$runtime_release()[i2];
                }
                i3++;
            }
            i2++;
        }
        for (int i4 = i3; i4 < size$runtime_release; i4++) {
            snapshotWeakSet.getValues$runtime_release()[i4] = null;
            snapshotWeakSet.getHashes$runtime_release()[i4] = 0;
        }
        if (i3 != size$runtime_release) {
            snapshotWeakSet.setSize$runtime_release(i3);
        }
    }

    public static final void processForUnusedRecordsLocked(StateObject stateObject) {
        if (overwriteUnusedRecordsLocked(stateObject)) {
            extraStateObjects.add(stateObject);
        }
    }

    public static final <T extends StateRecord> T writableRecord(T t2, StateObject stateObject, Snapshot snapshot) {
        T t3;
        if (snapshot.getReadOnly()) {
            snapshot.mo3767recordModified$runtime_release(stateObject);
        }
        int id = snapshot.getId();
        T t4 = (T) readable(t2, id, snapshot.getInvalid$runtime_release());
        if (t4 == null) {
            readError();
            throw new KotlinNothingValueException();
        }
        if (t4.getSnapshotId$runtime_release() == snapshot.getId()) {
            return t4;
        }
        synchronized (getLock()) {
            t3 = (T) readable(stateObject.getFirstStateRecord(), id, snapshot.getInvalid$runtime_release());
            if (t3 == null) {
                readError();
                throw new KotlinNothingValueException();
            }
            if (t3.getSnapshotId$runtime_release() != id) {
                t3 = (T) newWritableRecordLocked(t3, stateObject, snapshot);
            }
        }
        Intrinsics.checkNotNull(t3, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.writableRecord");
        if (t4.getSnapshotId$runtime_release() != 1) {
            snapshot.mo3767recordModified$runtime_release(stateObject);
        }
        return t3;
    }

    public static final <T extends StateRecord> T overwritableRecord(T t2, StateObject stateObject, Snapshot snapshot, T t3) {
        T t4;
        if (snapshot.getReadOnly()) {
            snapshot.mo3767recordModified$runtime_release(stateObject);
        }
        int id = snapshot.getId();
        if (t3.getSnapshotId$runtime_release() == id) {
            return t3;
        }
        synchronized (getLock()) {
            t4 = (T) newOverwritableRecordLocked(t2, stateObject);
        }
        t4.setSnapshotId$runtime_release(id);
        if (t3.getSnapshotId$runtime_release() != 1) {
            snapshot.mo3767recordModified$runtime_release(stateObject);
        }
        return t4;
    }

    private static final <T extends StateRecord> T newWritableRecordLocked(T t2, StateObject stateObject, Snapshot snapshot) {
        T t3 = (T) newOverwritableRecordLocked(t2, stateObject);
        t3.assign(t2);
        t3.setSnapshotId$runtime_release(snapshot.getId());
        return t3;
    }

    public static final <T extends StateRecord> T newOverwritableRecordLocked(T t2, StateObject stateObject) {
        T t3 = (T) usedLocked(stateObject);
        if (t3 != null) {
            t3.setSnapshotId$runtime_release(Integer.MAX_VALUE);
            return t3;
        }
        T t4 = (T) t2.create();
        t4.setSnapshotId$runtime_release(Integer.MAX_VALUE);
        t4.setNext$runtime_release(stateObject.getFirstStateRecord());
        Intrinsics.checkNotNull(t4, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked$lambda$16");
        stateObject.prependStateRecord(t4);
        Intrinsics.checkNotNull(t4, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked");
        return t4;
    }

    public static final void notifyWrite(Snapshot snapshot, StateObject stateObject) {
        snapshot.setWriteCount$runtime_release(snapshot.getWriteCount$runtime_release() + 1);
        Function1<Object, Unit> writeObserver$runtime_release = snapshot.getWriteObserver$runtime_release();
        if (writeObserver$runtime_release != null) {
            writeObserver$runtime_release.invoke(stateObject);
        }
    }

    public static final <T extends StateRecord, R> R writable(T t2, StateObject stateObject, Function1<? super T, ? extends R> function1) {
        Snapshot current;
        R rInvoke;
        getSnapshotInitializer();
        synchronized (getLock()) {
            try {
                current = Snapshot.Companion.getCurrent();
                rInvoke = function1.invoke(writableRecord(t2, stateObject, current));
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
        notifyWrite(current, stateObject);
        return rInvoke;
    }

    public static final <T extends StateRecord, R> R overwritable(T t2, StateObject stateObject, T t3, Function1<? super T, ? extends R> function1) {
        Snapshot current;
        R rInvoke;
        getSnapshotInitializer();
        synchronized (getLock()) {
            try {
                current = Snapshot.Companion.getCurrent();
                rInvoke = function1.invoke(overwritableRecord(t2, stateObject, current, t3));
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
        notifyWrite(current, stateObject);
        return rInvoke;
    }

    public static final Map<StateRecord, StateRecord> optimisticMerges(MutableSnapshot mutableSnapshot, MutableSnapshot mutableSnapshot2, SnapshotIdSet snapshotIdSet) {
        HashMap map;
        StateRecord stateRecord;
        MutableScatterSet<StateObject> modified$runtime_release = mutableSnapshot2.getModified$runtime_release();
        int id = mutableSnapshot.getId();
        HashMap map2 = null;
        if (modified$runtime_release == null) {
            return null;
        }
        SnapshotIdSet snapshotIdSetOr = mutableSnapshot2.getInvalid$runtime_release().set(mutableSnapshot2.getId()).or(mutableSnapshot2.getPreviousIds$runtime_release());
        MutableScatterSet<StateObject> mutableScatterSet = modified$runtime_release;
        Object[] objArr = mutableScatterSet.elements;
        long[] jArr = mutableScatterSet.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            map = null;
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                long j3 = ((~j2) << 7) & j2;
                if ((j3 - 9187201950435737472L) - (j3 | (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 + j2) - (255 | j2) < 128) {
                            StateObject stateObject = (StateObject) objArr[(i2 << 3) + i5];
                            StateRecord firstStateRecord = stateObject.getFirstStateRecord();
                            StateRecord stateRecord2 = readable(firstStateRecord, id, snapshotIdSet);
                            if (stateRecord2 != null && (stateRecord = readable(firstStateRecord, id, snapshotIdSetOr)) != null && !Intrinsics.areEqual(stateRecord2, stateRecord)) {
                                StateRecord stateRecord3 = readable(firstStateRecord, mutableSnapshot2.getId(), mutableSnapshot2.getInvalid$runtime_release());
                                if (stateRecord3 == null) {
                                    readError();
                                    throw new KotlinNothingValueException();
                                }
                                StateRecord stateRecordMergeRecords = stateObject.mergeRecords(stateRecord, stateRecord2, stateRecord3);
                                if (stateRecordMergeRecords == null) {
                                    return null;
                                }
                                HashMap map3 = map;
                                if (map3 == null) {
                                    map = new HashMap();
                                    map3 = map;
                                }
                                map3.put(stateRecord2, stateRecordMergeRecords);
                            }
                            i3 = 8;
                        }
                        j2 >>= i3;
                    }
                    if (i4 != i3) {
                        break;
                    }
                }
                if (i2 == length) {
                    map2 = map;
                    break;
                }
                i2++;
            }
            map = map2;
        } else {
            map = map2;
        }
        return map;
    }

    public static final Void reportReadonlySnapshotWrite() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot".toString());
    }

    public static final <T extends StateRecord> T current(T t2, Snapshot snapshot) {
        T t3 = (T) readable(t2, snapshot.getId(), snapshot.getInvalid$runtime_release());
        if (t3 != null) {
            return t3;
        }
        readError();
        throw new KotlinNothingValueException();
    }

    public static final <T extends StateRecord> T current(T t2) {
        Snapshot current = Snapshot.Companion.getCurrent();
        T t3 = (T) readable(t2, current.getId(), current.getInvalid$runtime_release());
        if (t3 == null) {
            synchronized (getLock()) {
                Snapshot current2 = Snapshot.Companion.getCurrent();
                t3 = (T) readable(t2, current2.getId(), current2.getInvalid$runtime_release());
            }
            if (t3 == null) {
                readError();
                throw new KotlinNothingValueException();
            }
        }
        return t3;
    }

    public static final <T extends StateRecord, R> R withCurrent(T t2, Function1<? super T, ? extends R> function1) {
        return function1.invoke(current(t2));
    }

    public static final SnapshotIdSet addRange(SnapshotIdSet snapshotIdSet, int i2, int i3) {
        while (i2 < i3) {
            snapshotIdSet = snapshotIdSet.set(i2);
            i2++;
        }
        return snapshotIdSet;
    }

    public static final <T extends StateRecord> T newWritableRecord(T t2, StateObject stateObject, Snapshot snapshot) {
        T t3;
        synchronized (getLock()) {
            t3 = (T) newWritableRecordLocked(t2, stateObject, snapshot);
        }
        return t3;
    }

    public static final <T extends StateRecord, R> R writable(T t2, StateObject stateObject, Snapshot snapshot, Function1<? super T, ? extends R> function1) {
        R rInvoke;
        synchronized (getLock()) {
            try {
                rInvoke = function1.invoke(writableRecord(t2, stateObject, snapshot));
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
        notifyWrite(snapshot, stateObject);
        return rInvoke;
    }
}
