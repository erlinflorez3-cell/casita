package kotlinx.coroutines;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import com.dynatrace.android.agent.Global;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancelHandler;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.StackTraceRecoveryKt;
import kotlinx.coroutines.internal.Symbol;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message tag had invalid wire type.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidWireType(InvalidProtocolBufferException.java:99)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:268)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipMessage(CodedInputStream.java:305)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:251)
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
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яš\u0014D57\u001eqܜLDyt\fA\u001c0\u0013.X~*,(w\u000ff\u000198ǏmHDR[ճ\u0017k\n:,[*tK;k\u001a\u0006\"\u000fPVg}nRҙ\u0013C%\u0006\u001exxߚQǁ\u0001](\u000f:BuD;M}FA`z8\r @.@y\u000b\u0002\"*V\u0010~zIO\u0014\u0012F@x:h\rU\u0005 \u0016\u000e>.\u0002&\\mS>H\u0003]B/)\u0003qBd'g0\u0003M\u0015Fj'\u0015vg\u001f3@M5\u001d%i\u0003\u000fRaB\u000b?\b=\rh--3I\nW>X\u0006\u0014\u001d+e\rer,^\rQv\f/+UiSP$(\u007fz\u0002\u0012D\u0004$\u0006/H4-\"f\u0016\r;tx[HP\u0018^J\u007f\u0001i<&;Į[/?ӕtP\u007fݢITG}\u0015\rd\"/nQad\u0010p\u0015aS&RaUn@1Nh[mm2t#\u001d:\u000e>L\u00185\f\u0013>\u0017[ڛ\n?3%y\t`D\u0016~ݶdjYr`R\t(|=O*74!X-\u000byylXZ0\u0014\u001c\u001d\r\f2+ \u000b\u0017\u0003 m#\\}\u0001q\u0001L\f:\u000e1|68\u001e2\"Ć=^Af\u001ap\u001e\u0014jx*>jwKfڋFS\u0012\u000e%E0f`j> ,J\\A+4UpJI\\5'\u0013-H1U\tOҴ\r_`!X\rbl<\u0003\u0018C%\r\u000f\u0007tp\u001e\u001f?It\rn\\EA\u007fTI,cX\u00016\u0013\"56:\u0014\u0010zZ\u0003dlD\u001e\u0006\u007f.L29\u007ff\u0004Пä\u0003)8>uZZ0}Q{:W\u0005\u000b8'Ax0w\b\u0019\u0019Z 1\u07bdU\u001d-07vrQ0\u0015\u0004\b#^zu&\u0005\u0011itat\u0019Xj\u0006\u0001\u0019\u0013b6%/\u0018R\u0005Cq[+-\u0016}\u0015]Z\u0012cw&F{x\u000eT,,\u0004tP$6zQ\fZ[:OX\r\u0006RmzKZ\u000ez\t\u0018Q7k٢7RG/\u0001\\>\u0019\u001b1\u0004l-b\u001d\u0002fj\u0001Z̭\u0002>4*:yII$`I+7\u001acx}|yj\u05c8N\u0019\u0010U\f7t],?&\\}o\u00192\u0016sF^o\u0005\u0013\tJ?<4Zs8\u000fQ!\u0002\u0006VBķJ_\u001ddzP\u0002\nn\u000e\u00030\rZVTxE\u000fqp\u0015G\u0015Ao\u00115_$4F\u001d5q\u0005\u0019SK(aj\u0018\u0007txCFj8I=\u001f\u007fSMk\u0018a\u0004L\u0003u@4k8\u0017Fm\u0015\u001dp@aʃݔ\u0015_|\u0007'$c<fd%:\u0017\\\\zA\u0005\u000b~\u001e<@ۇ9r\u0016\u0007ƚf-Z)@oQu\u0019\u0017rQ7\u0010\u000b0^\u001bcݢeNK\u0012\u000317\rgbi5л$*-N\u0005'b#\u001eh\u0010cAp&s&b01)ON`t^ƶv\n<e~<\u0010\u000f\u001a\u0013\r\u0002\f}'?5r\u0015\u0006xŮ\u0019|\u00180\u0005c5\u001d;NtynA~>`,7^Ӱ2\u001d^%J\u0017Ykh\u0013\u0006\u001a;\\/G\u0018qoW˹grv6_a\u0013v?m0gW|b/\u000e.(\u0004ą.^._K\\S\nt\u000bbrhd\u001e`z(\u0013\u001d\"(BFE\\ր\u0015\u0013B%;8r\u000fO\u0019M\u0004=OnK\u001cIY&'2\u0001\u0005K;@k\b(%\u0019IN+)\u000e\nZ\t!(\u0018Q;\bl^*:i5\u0004c1]ɷIBHR<\u0017\u0014\\?\\>&d\u0013*\u001eKQaiGmi\u0015\u0017g6\u001bص9j_6m=\u000f`\u0019\rm\"aoH5OrQqU͵\u0088[fA\n}sZ\r$\u0002\u0014r/Qq\u0018'aZ^{Ef\u0012c'\u0018\nMLT\n\u0004d\u0018E_]Zej[num\u0003T?|n\r1UT\u0011s8T\u001a\u001c\u0002MsabIA\u0014aܙ=8\u0017\u0005\t[L\u0017\u000f+F\u0013D\"~?\n7N/|>:\"D95\u000bMu$\u000e@!z\u001c:`ifEU\tqq\u0016>\"c\u0012\"ݺq[eZH\u0018\u0013X\u0014y7X\u00076p.(6\u0012>̒:f~\u0018Qh\u0011\f\u001f&d4hX\u001b\u0017&=v%ў\u0002Tf_#9M?QI\u0018\\\".-\u0013k%4M}iu\t\u0006wf*Q5!lxm{eۇ\tU/9- #n\u0003+\\ov@ )fM>Ir4(D?\fXq>7HP-bs+\u0007\u001c-\u0006m\\u\u0010Bqe\u0013܌\u00155=\"~X[n=z\b\t6w)$\u001b-\u001a\u0001ߊ'}\u0013{N\u0002\u000e(YW\u0003so\\\u0013rZ0]\u0014ܽ3KQ7fkEdgA\u0005\u0012F44\b#$\u0011\u0010)h<k&̜Ը:X/8YJY[P\\'|\u000b\u000b\\~XW\f<\u0014X\u0013 C'w@ru!\u000fU<\u0003}@d\u001e{%%[\u000eC=)OA\u0001?\u001bٷc\u001et\u001cl^Dbg(F\u0019(P-7q\u000b\u000fp݉\u001b_i8zyZ,![:qV1\n\u0004vslq\u07ba@RrcvU\u0004faFh\u000f\u0007}XC b\u001bT=5v4_\u0001ΞOa%\b\u007fT\u0005\u0018\u007f3h\u0018\u0012(aI=I`\u0005<\u007f(w]\u0002k*N\r\u001eTC\u0015MItj\u001cl3uvʚβ32LS\t;;-?o~\u0007X#<\u0001\u0013x\u0007S\tރ&%\u0001Q\u0017%4\u0019ol\u007f[̹\u0017\u0003'6P+[+\u0013pn[SC\u001c\f%\u0011PC]lwо,7e>g4$eY\u0004wd8\u000f\u0002\u00112xzn]2zXm?]\u00075\u0011\u008d]K\bT2/*S%)\bNZ\u0001B33\u0010U}φNptC5\u000fkW?v{\u0014X:N\u0005vl\u0016B\u0088A_cIU35=\u0018MOs%8W\u0010Y\u0016hwbl$%\u0004hţ6\u0007}~y \u0002\\sD-v6wdoHx_\u0003B\"\u0012Bbitl\u0005v~\n@B$Ǫ\u0013\u001d>\">iTmyn݅~S\t\u001fE_Rsڛ\nt\u00156-J>H݊\u000flя\u0012\u001c\u0010ܙJ-.$˜D\u0011@y=\u0004\u0005\u0016ЊPRkVh@/8/\\Je Cܜ\f\fP%4\b`\u000fT1\rWt]#\n2HF\fof=ؤ\f\u0012PږK^֒@O\u0006<֟u\u000b\u0019U\u00140au(+^}\u001b}\u0004d\u0002\u0002kՐWe\u0001ʓm$b5ޑ|\u001e!Aee*V+\u0016؟ss4}\u001aGR\u0019+\u001a\u001f[4\u0018\u0016\u0015e\u0003\u05cbc\u0010\u0018\u05cdAرt\u001f3мw`H\u0010\u001b1q:\u0019%@a\u001b!Fɐ*ɻG\u0019~ʴ\u0006\u000b\u0016+W5Y4_\b\u0013\u001a`\"vڙ\u0012\u0010\u0019!uv\u007f\u0010%Y2Fr7bz\u0002T҇l@y\u0006t(W\u0002@m\u0001\u000e5s?>:)Ț\u00163pR?s*Z\u0016<5Ujzך\u000eɼ4\u001ftj\u0004\t\u0005l3&nO\u00077n?c@Y?|ݩ\u0003܆'aC\u0016Ducc5!t\u0015hC@}+\u0013@τ\nӵ!\b\u001eMkP*Y\u001a\f/\rL@PI\u0019hzг\u000e̺PTE\u001c<\u0001JB\nN)\u0016H~E0v?KҴ1ّ\u0015v!r7TW\u007f-1:\u0002Ap\u001a\u001ee\u0011)ҲO՞3\u001e/(>\u0007EI\u001c\u007f0G]oSHS\u0018u!\u0001\u000bS\u0005S\nH\u0093`ʚC\u0006\u001e&\u001an\rcŲG܈="}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e| \u0015Gv\u00158s,57\b)Fq\u001f>IR?u=\u0002\u001dsh\u000f", "\"", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001f\u0005%\"C~\f?v$$U\f&\r", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e| \u0015Gv\u00158s,57\b)Fq\u001f>IR?u=s", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\u0003?f\b0Fq\u001f.;R7i:~\"di9\\", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eq\u0001Q\t`\u001bP~\u000eI\u007f!<#[*Dw&=QL;YC\u001a\u0013nBF\u0003k,$", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E2|\u001b&G|c", "2d[2Z(MS", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "@dbB`,&]\u0018~", "", "\nh]6g\u0005", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bS\u0004z^", "5dc\u0011X3>U\u0015\u000ez\u001d2\u0007\u00186i\t;u>\u000b$!W~\u0012Ev3/W\b-7", "u(;8b;EW\"Hxh9\u0007\u0019>i\t(\n\n^! Vs\u0017Lr49c\u0007u", "1n]AX?M", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "5dc\u0010b5MS,\u000e", "u(;8b;EW\"Hxh9\u0007\u0019>i\t(\n\n^!$Q\u007f\u001d@\u007f%\u0013c\u0007/7\u0001%\u0004", "-cT0\\:B]\"Z\u0004]\u0010\u0006\b/x", "\u001aj^A_0Gfbz\nh4\u0001\u00070uI\u0004\u000bJ\t\u001b\u0015+x\u001d\u0012", "-rc.g,", "\u001aj^A_0Gfbz\nh4\u0001\u00070uI\u0004\u000bJ\t\u001b\u00154o\u000f\u0012", "", "-oP?X5M6\u0015\bye,", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001f\u0005%\"Q}\n9}%\u0018U\u0007\u001f>mk", ">`a2a;!O\"}\u0002^", "5dc\u001dT9>\\(avg+\u0004\t", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJu\u001bUz\u0018Jr\"<Y`\u001c@l\u001d.#", "AsPAX", "5dc g(MSW\u0005\u0005m3\u0001\u0012B_}2\tJ\u0011&\u001bPo\u001c6t/BY", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "7r00g0OS", "", "u(I", "7r2<`7ES(~y", "7r2.a*>Z ~y", "AsPAX\u000b>P)\u0001g^7\n\t=e\t7wO\u0005! ", "", "5dc g(MSw~wn.i\t:r\u007f6{I\u0010\u0013&Ky\u0017", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "7mXA6(GQ\u0019\u0006\u0002Z)\u0001\u00103t\u0014", "", "7rA2h::P ~", "@db2g\u001aMO(~g^<\u000b\u0005,l\u007f", "1`[9X9\u001f`\u0015\u0007z", "5dc\u0010T3ES&_\bZ4|", "u(;8b;EW\"Hxh9\u0007\u0019>i\t(\n\n\u0006(\u001f\u0011s\u0017Kv2>U\u0005i\u0015w#8]R?t4\f$d_?gp(Vv|", "5dc g(<Y\b\fv\\,\\\u0010/m\u007f1\u000b", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\u0013DU{&&z\u0012,M#Bk<\u001e\u001ew7", "\u001aiPCTuEO\"\u0001DL;x\u00075T\r$y@`\u001e\u0017Oo\u0017KL", "u(;7T=:\u001d z\u0004`uj\u0018+c\u0006\u0017\t<~\u0017vNo\u0016<\u007f4\u000b", "B`Z2F;:b\u0019", "B`Z2F;:b\u0019=\u0001h;\u0004\r8xy&\u0006M\u000b'&Kx\u000eJp#?f}", "1`]0X3\u001c]!\n\u0002^;|\b\u001ce\u000e8\u0003O", "B`Z2a\u001aMO(~", "1`d@X", "", "1`]0X3\u001c]!\n\u0002^;|\b\u001ce\u000e8\u0003O?\u001d!Vv\u0012E\n\u001f3c\u000b*G|\u001a7MQ5i>+\u0015", "1`]0X3%O(~\b", "1`]0X3", ">`a2a;\u001cO\"|ze3|\b", ">`a2a;\u001cO\"|ze3|\bmk\n7\u0003D\n*\u0011Ey\u001bF\u000749b}.1k ;M", "1`[96(GQ\u0019\u0006]Z5{\u0010/rm$|@\b+", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "1`[96(GQ\u0019\u0006]Z5{\u0010/r", "6`]1_,K", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e| \u0015Gvp8\u007f$<Y\u000bu", "1`[9F,@[\u0019\b\nH5Z\u00058c\u007f/\u0003<\u0010\u001b!P", "AdV:X5M", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\u00135[\u0006 @|k", "1`[9B5\u001cO\"|ze3x\u00183o\t", Global.BLANK, "=m2.a*>Z z\nb6\u0006", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "D`[BX", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>'S\u0007<i'*\u0017J7t6g\u0004knC\u0019_)Uv|.QJ=X\u001cy9\u001d\u0014$wK0\r\u0003h\u0017g_", "5dc\u0010b5MW\"\u000fvm0\u0007\u0012\ra\t&{G\b\u0013&Ky\u0017\u001ar5CY", ">`a2a;", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E%\u000b\u0014l", "Bqh h:IS\"}", "Bqh\u001fX:N[\u0019", "5dc\u001fX:NZ(", "7mbAT3E>\u0015\fzg;_\u00058d\u0007(", "@d[2T:>1 z~f,{u/u\u000e$xG\u0001t!P~\u0012E\u0007!D]\b)", "@d[2T:>1 z~f,{u/u\u000e$xG\u0001t!P~\u0012E\u0007!D]\b)us =TGD~.\u001c\u001fukI\u0016g5N\u0005!EV[,", "@dbB`,0W(\u0002", "@dbB_;", "\u001aj^A_0G\u001d\u0006~\tn3\f^", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "@dbB`,", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u0010/\u0002\u0012g", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u00101\u0002\u0012g", "7me<^,(\\vz\u0004\\,\u0004\u0010+t\u00042\u0005", "7mS2k", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b\u001f\"No\u001d@\u0001.\u0018U\u0007\u001f>m#\u0004", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%Sc(", "7me<^,(\\vz\u0004\\,\u0004\u0010+t\u00042\u0005$\n&\u0017Tx\nC", "7me<^,(\\vz\u0004\\,\u0004\u0010+t\u00042\u0005$\n&\u0017Tx\nC5+?h\u0005$@\u0001\u0010,WPE{C\"\u001eho3\u0005m9N", "7me<^,(\\vz\u0004\\,\u0004\u0010+t\u00042\u0005$\t\"\u001e", ";t[A\\7ES{z\u0004]3|\u0016=E\r5\u0006M", "2hb=T;<V\u0006~\tn4|", ";nS2", "@dbB`,=A(z\n^", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E)\u000b&tQw\u0019Cv45XS", ">q^=b:>R\t\nyZ;|", "7cT:c6MS\"\u000e", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\ni!&%y\u0016G}%DY|u\u001er\u0012?I\rBg= ^R^>\u0007a;$Z\u000eMV]3`[<B%\u001a$\u000f^4\u000b\u0014]K-|\u000e\u0018/\u0011*X\u0006EqNa|\u00131{l\f]\fP{^_>.hDh5=.FAs&.\u0013[&^\u0004$!\u0019q\u0017*>", "@dbB`,\"[$\u0006", "@dbB`,\"[$\u00069d6\f\u00103n\u0013\"yJ\u000e!'Vs\u0017<\u0005\u001f3c\u000b ", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}_'\u0007!&Ns\u0017\u0006{6=#~0@k%2WLI5\u0015.\u001efp=\u0011ly$:\u0018", "Bqh\u001fX:N[\u0019b\u0003i3", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\u0013Iaz*>C", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|k\u0015SMJr8'^mrAPd<Wt6KVW:&3\u0003F\u0012!^\u0018WxbH@G.}K;(\u001buG\fHr\u0011\u001b\u001a\u00175x:F_\u001fG\u0007\u001eqHrVZa\\\u0004N\u0017", "/ka2T+R@\u0019\r\u000bf,{h<r\n5", "", "2dc.V/\u001cV\u001d\u0006yB-e\u00138R\u007f6\f<}\u001e\u0017", "2dc.V/\u001cV\u001d\u0006y", "2dc.V/\u001cV\u001d\u0006y\u001d2\u0007\u00186i\t;u>\u000b$!W~\u0012Ev3/W\b-7", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq4H7|0g\u001cdj;PM)Sv%V\"", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|k\u0015SMJr8'^mrAPd<Wt6KVW:&3\u0003F\u0012!^\u0018WxbH@F \u007f@\u0001&\u00045KK%e\u0006\f\u0014\u001d\u000b", "Bqh\u001fX:N[\u0019p~m/\\\u001c-e\u000b7\u007fJ\n", "3wR2c;B]\"", "1n\\=_,MS\u0006~\tn4|", "BnZ2a", "@dbB`,.\\\u0018\u0003\ti(\f\u00072e~", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00049g\t\u001cFk\u0019.Z\u0019", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n^!$Q\u007f\u001d@\u007f%\u0014]\f+3|\u00141MP\u0011R9\u001a&d+@\u0003l.\u0018`$LLL;2\u0016c", "@dbB`,.\\\u0018\u0003\ti(\f\u00072e~\u001a\u007fO\u0004v*Eo\u0019Kz/>", "5dc h*<S'\r{n3i\t=u\u00077", "5dc h*<S'\r{n3i\t=u\u00077:F\u000b&\u001eKx!6t/Bc\u000e/;v\u0016<GAEx4", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004", "5dc\u0012k*>^(\u0003\u0005g(\u0004u/s\u0010/\u000b", "5dc\u0012k*>^(\u0003\u0005g(\u0004u/s\u0010/\u000b~\u0007!&Ns\u0017Op#?f\b0Fq\u001f.[=9uA\u001e", "BnBAe0GU", "<`\\2F;KW\"\u0001", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public class CancellableContinuationImpl<T> extends DispatchedTask<T> implements CancellableContinuation<T>, CoroutineStackFrame, Waiter {
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    private final CoroutineContext context;
    private final Continuation<T> delegate;
    private static final /* synthetic */ AtomicIntegerFieldUpdater _decisionAndIndex$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(CancellableContinuationImpl.class, "_decisionAndIndex$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater _state$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(CancellableContinuationImpl.class, Object.class, "_state$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater _parentHandle$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(CancellableContinuationImpl.class, Object.class, "_parentHandle$volatile");

    /* JADX WARN: Multi-variable type inference failed */
    public CancellableContinuationImpl(Continuation<? super T> continuation, int i2) {
        super(i2);
        this.delegate = continuation;
        if (DebugKt.getASSERTIONS_ENABLED() && i2 == -1) {
            throw new AssertionError();
        }
        this.context = continuation.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = Active.INSTANCE;
    }

    private final Void alreadyResumedError(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    private final void callCancelHandlerSafely(Function0<Unit> function0) {
        try {
            function0.invoke();
        } catch (Throwable th) {
            CoroutineExceptionHandlerKt.handleCoroutineException(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th));
        }
    }

    private final void callSegmentOnCancellation(Segment<?> segment, Throwable th) {
        int i2 = (-1) - (((-1) - _decisionAndIndex$volatile$FU.get(this)) | ((-1) - 536870911));
        if (i2 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
        }
        try {
            segment.onCancellation(i2, th, getContext());
        } catch (Throwable th2) {
            CoroutineExceptionHandlerKt.handleCoroutineException(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    private final boolean cancelLater(Throwable th) {
        if (!isReusable()) {
            return false;
        }
        Continuation<T> continuation = this.delegate;
        Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((DispatchedContinuation) continuation).postponeCancellation$kotlinx_coroutines_core(th);
    }

    private final void detachChildIfNonResuable() {
        if (isReusable()) {
            return;
        }
        detachChild$kotlinx_coroutines_core();
    }

    private final void dispatchResume(int i2) {
        if (tryResume()) {
            return;
        }
        DispatchedTaskKt.dispatch(this, i2);
    }

    private final DisposableHandle getParentHandle() {
        return (DisposableHandle) _parentHandle$volatile$FU.get(this);
    }

    private final String getStateDebugRepresentation() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        return state$kotlinx_coroutines_core instanceof NotCompleted ? "Active" : state$kotlinx_coroutines_core instanceof CancelledContinuation ? "Cancelled" : "Completed";
    }

    private final /* synthetic */ int get_decisionAndIndex$volatile() {
        return this._decisionAndIndex$volatile;
    }

    private final /* synthetic */ Object get_parentHandle$volatile() {
        return this._parentHandle$volatile;
    }

    private final /* synthetic */ Object get_state$volatile() {
        return this._state$volatile;
    }

    private final DisposableHandle installParentHandle() {
        Job job = (Job) getContext().get(Job.Key);
        if (job == null) {
            return null;
        }
        DisposableHandle disposableHandleInvokeOnCompletion$default = JobKt__JobKt.invokeOnCompletion$default(job, false, new ChildContinuation(this), 1, null);
        AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_parentHandle$volatile$FU, this, null, disposableHandleInvokeOnCompletion$default);
        return disposableHandleInvokeOnCompletion$default;
    }

    private final void invokeOnCancellationImpl(Object obj) {
        if (DebugKt.getASSERTIONS_ENABLED() && !(obj instanceof CancelHandler) && !(obj instanceof Segment)) {
            throw new AssertionError();
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof Active) {
                if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$volatile$FU, this, obj2, obj)) {
                    return;
                }
            } else if ((obj2 instanceof CancelHandler) || (obj2 instanceof Segment)) {
                multipleHandlersError(obj, obj2);
            } else {
                boolean z2 = obj2 instanceof CompletedExceptionally;
                if (z2) {
                    CompletedExceptionally completedExceptionally = (CompletedExceptionally) obj2;
                    if (!completedExceptionally.makeHandled()) {
                        multipleHandlersError(obj, obj2);
                    }
                    if (obj2 instanceof CancelledContinuation) {
                        if (!z2) {
                            completedExceptionally = null;
                        }
                        Throwable th = completedExceptionally != null ? completedExceptionally.cause : null;
                        if (obj instanceof CancelHandler) {
                            callCancelHandler((CancelHandler) obj, th);
                            return;
                        } else {
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                            callSegmentOnCancellation((Segment) obj, th);
                            return;
                        }
                    }
                    return;
                }
                if (obj2 instanceof CompletedContinuation) {
                    CompletedContinuation completedContinuation = (CompletedContinuation) obj2;
                    if (completedContinuation.cancelHandler != null) {
                        multipleHandlersError(obj, obj2);
                    }
                    if (obj instanceof Segment) {
                        return;
                    }
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    CancelHandler cancelHandler = (CancelHandler) obj;
                    if (completedContinuation.getCancelled()) {
                        callCancelHandler(cancelHandler, completedContinuation.cancelCause);
                        return;
                    } else {
                        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$volatile$FU, this, obj2, CompletedContinuation.copy$default(completedContinuation, null, cancelHandler, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else {
                    if (obj instanceof Segment) {
                        return;
                    }
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$volatile$FU, this, obj2, new CompletedContinuation(obj2, (CancelHandler) obj, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    private final boolean isReusable() {
        if (DispatchedTaskKt.isReusableMode(this.resumeMode)) {
            Continuation<T> continuation = this.delegate;
            Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (((DispatchedContinuation) continuation).isReusable$kotlinx_coroutines_core()) {
                return true;
            }
        }
        return false;
    }

    private final /* synthetic */ void loop$atomicfu(Object obj, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, Function1<? super Integer, Unit> function1) {
        while (true) {
            function1.invoke(Integer.valueOf(atomicIntegerFieldUpdater.get(obj)));
        }
    }

    private final /* synthetic */ void loop$atomicfu(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Function1<Object, Unit> function1) {
        while (true) {
            function1.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private final void multipleHandlersError(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public static final Unit resume$lambda$13$lambda$12(Function1 function1, Throwable th, Object obj, CoroutineContext coroutineContext) {
        function1.invoke(th);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void resumeImpl$kotlinx_coroutines_core$default(CancellableContinuationImpl cancellableContinuationImpl, Object obj, int i2, Function3 function3, int i3, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i3 + 4) - (i3 | 4) != 0) {
            function3 = null;
        }
        cancellableContinuationImpl.resumeImpl$kotlinx_coroutines_core(obj, i2, function3);
    }

    private final <R> Object resumedState(NotCompleted notCompleted, R r2, int i2, Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> function3, Object obj) {
        if (r2 instanceof CompletedExceptionally) {
            if (DebugKt.getASSERTIONS_ENABLED() && obj != null) {
                throw new AssertionError();
            }
            if (!DebugKt.getASSERTIONS_ENABLED() || function3 == null) {
                return r2;
            }
            throw new AssertionError();
        }
        if (!DispatchedTaskKt.isCancellableMode(i2) && obj == null) {
            return r2;
        }
        if (function3 == null && !(notCompleted instanceof CancelHandler) && obj == null) {
            return r2;
        }
        return new CompletedContinuation(r2, notCompleted instanceof CancelHandler ? (CancelHandler) notCompleted : null, function3, obj, null, 16, null);
    }

    private final /* synthetic */ void set_decisionAndIndex$volatile(int i2) {
        this._decisionAndIndex$volatile = i2;
    }

    private final /* synthetic */ void set_parentHandle$volatile(Object obj) {
        this._parentHandle$volatile = obj;
    }

    private final /* synthetic */ void set_state$volatile(Object obj) {
        this._state$volatile = obj;
    }

    private final boolean tryResume() {
        int i2;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = _decisionAndIndex$volatile$FU;
        do {
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!_decisionAndIndex$volatile$FU.compareAndSet(this, i2, 1073741824 + ((-1) - (((-1) - 536870911) | ((-1) - i2)))));
        return true;
    }

    private final <R> Symbol tryResumeImpl(R r2, Object obj, Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> function3) {
        Object obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
        do {
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof NotCompleted)) {
                if (!(obj2 instanceof CompletedContinuation) || obj == null) {
                    return null;
                }
                CompletedContinuation completedContinuation = (CompletedContinuation) obj2;
                if (completedContinuation.idempotentResume != obj) {
                    return null;
                }
                if (!DebugKt.getASSERTIONS_ENABLED() || Intrinsics.areEqual(completedContinuation.result, r2)) {
                    return CancellableContinuationImplKt.RESUME_TOKEN;
                }
                throw new AssertionError();
            }
        } while (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$volatile$FU, this, obj2, resumedState((NotCompleted) obj2, r2, this.resumeMode, function3, obj)));
        detachChildIfNonResuable();
        return CancellableContinuationImplKt.RESUME_TOKEN;
    }

    private final boolean trySuspend() {
        int i2;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = _decisionAndIndex$volatile$FU;
        do {
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!_decisionAndIndex$volatile$FU.compareAndSet(this, i2, 536870912 + ((-1) - (((-1) - 536870911) | ((-1) - i2)))));
        return true;
    }

    private final /* synthetic */ void update$atomicfu(Object obj, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, Function1<? super Integer, Integer> function1) {
        int i2;
        do {
            i2 = atomicIntegerFieldUpdater.get(obj);
        } while (!atomicIntegerFieldUpdater.compareAndSet(obj, i2, function1.invoke(Integer.valueOf(i2)).intValue()));
    }

    public final void callCancelHandler(CancelHandler cancelHandler, Throwable th) {
        try {
            cancelHandler.invoke(th);
        } catch (Throwable th2) {
            CoroutineExceptionHandlerKt.handleCoroutineException(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> void callOnCancellation(Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> function3, Throwable th, R r2) {
        try {
            function3.invoke(th, r2, getContext());
        } catch (Throwable th2) {
            CoroutineExceptionHandlerKt.handleCoroutineException(getContext(), new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean cancel(Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof NotCompleted)) {
                return false;
            }
        } while (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$volatile$FU, this, obj, new CancelledContinuation(this, th, (obj instanceof CancelHandler) || (obj instanceof Segment))));
        NotCompleted notCompleted = (NotCompleted) obj;
        if (notCompleted instanceof CancelHandler) {
            callCancelHandler((CancelHandler) obj, th);
        } else if (notCompleted instanceof Segment) {
            callSegmentOnCancellation((Segment) obj, th);
        }
        detachChildIfNonResuable();
        dispatchResume(this.resumeMode);
        return true;
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public void cancelCompletedResult$kotlinx_coroutines_core(Object obj, Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof NotCompleted) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof CompletedExceptionally) {
                return;
            }
            if (obj2 instanceof CompletedContinuation) {
                CompletedContinuation completedContinuation = (CompletedContinuation) obj2;
                if (completedContinuation.getCancelled()) {
                    throw new IllegalStateException("Must be called at most once".toString());
                }
                if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$volatile$FU, this, obj2, CompletedContinuation.copy$default(completedContinuation, null, null, null, null, th, 15, null))) {
                    completedContinuation.invokeHandlers(this, th);
                    return;
                }
            } else if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$volatile$FU, this, obj2, new CompletedContinuation(obj2, null, null, null, th, 14, null))) {
                return;
            }
        }
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void completeResume(Object obj) {
        if (DebugKt.getASSERTIONS_ENABLED() && obj != CancellableContinuationImplKt.RESUME_TOKEN) {
            throw new AssertionError();
        }
        dispatchResume(this.resumeMode);
    }

    public final void detachChild$kotlinx_coroutines_core() {
        DisposableHandle parentHandle = getParentHandle();
        if (parentHandle == null) {
            return;
        }
        parentHandle.dispose();
        _parentHandle$volatile$FU.set(this, NonDisposableHandle.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public CoroutineStackFrame getCallerFrame() {
        Continuation<T> continuation = this.delegate;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return this.context;
    }

    public Throwable getContinuationCancellationCause(Job job) {
        return job.getCancellationException();
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public final Continuation<T> getDelegate$kotlinx_coroutines_core() {
        return this.delegate;
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public Throwable getExceptionalResult$kotlinx_coroutines_core(Object obj) {
        Throwable exceptionalResult$kotlinx_coroutines_core = super.getExceptionalResult$kotlinx_coroutines_core(obj);
        if (exceptionalResult$kotlinx_coroutines_core == null) {
            return null;
        }
        Continuation<T> continuation = this.delegate;
        return (DebugKt.getRECOVER_STACK_TRACES() && (continuation instanceof CoroutineStackFrame)) ? StackTraceRecoveryKt.recoverFromStackFrame(exceptionalResult$kotlinx_coroutines_core, (CoroutineStackFrame) continuation) : exceptionalResult$kotlinx_coroutines_core;
    }

    public final Object getResult() throws Throwable {
        Job job;
        boolean zIsReusable = isReusable();
        if (trySuspend()) {
            if (getParentHandle() == null) {
                installParentHandle();
            }
            if (zIsReusable) {
                releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            }
            return IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
        if (zIsReusable) {
            releaseClaimedReusableContinuation$kotlinx_coroutines_core();
        }
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof CompletedExceptionally) {
            Throwable th = ((CompletedExceptionally) state$kotlinx_coroutines_core).cause;
            if (!DebugKt.getRECOVER_STACK_TRACES()) {
                throw th;
            }
            CancellableContinuationImpl<T> cancellableContinuationImpl = this;
            if (cancellableContinuationImpl instanceof CoroutineStackFrame) {
                throw StackTraceRecoveryKt.recoverFromStackFrame(th, cancellableContinuationImpl);
            }
            throw th;
        }
        if (!DispatchedTaskKt.isCancellableMode(this.resumeMode) || (job = (Job) getContext().get(Job.Key)) == null || job.isActive()) {
            return getSuccessfulResult$kotlinx_coroutines_core(state$kotlinx_coroutines_core);
        }
        CancellationException cancellationException = job.getCancellationException();
        cancelCompletedResult$kotlinx_coroutines_core(state$kotlinx_coroutines_core, cancellationException);
        if (!DebugKt.getRECOVER_STACK_TRACES()) {
            throw cancellationException;
        }
        CancellableContinuationImpl<T> cancellableContinuationImpl2 = this;
        if (cancellableContinuationImpl2 instanceof CoroutineStackFrame) {
            throw StackTraceRecoveryKt.recoverFromStackFrame(cancellationException, cancellableContinuationImpl2);
        }
        throw cancellationException;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    public final Object getState$kotlinx_coroutines_core() {
        return _state$volatile$FU.get(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.DispatchedTask
    public <T> T getSuccessfulResult$kotlinx_coroutines_core(Object obj) {
        return obj instanceof CompletedContinuation ? (T) ((CompletedContinuation) obj).result : obj;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void initCancellability() {
        DisposableHandle disposableHandleInstallParentHandle = installParentHandle();
        if (disposableHandleInstallParentHandle != null && isCompleted()) {
            disposableHandleInstallParentHandle.dispose();
            _parentHandle$volatile$FU.set(this, NonDisposableHandle.INSTANCE);
        }
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void invokeOnCancellation(Function1<? super Throwable, Unit> function1) {
        CancellableContinuationKt.invokeOnCancellation(this, new CancelHandler.UserSupplied(function1));
    }

    @Override // kotlinx.coroutines.Waiter
    public void invokeOnCancellation(Segment<?> segment, int i2) {
        int i3;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = _decisionAndIndex$volatile$FU;
        do {
            i3 = atomicIntegerFieldUpdater.get(this);
            if ((i3 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, ((i3 >> 29) << 29) + i2));
        invokeOnCancellationImpl(segment);
    }

    public final void invokeOnCancellationInternal$kotlinx_coroutines_core(CancelHandler cancelHandler) {
        invokeOnCancellationImpl(cancelHandler);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean isActive() {
        return getState$kotlinx_coroutines_core() instanceof NotCompleted;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean isCancelled() {
        return getState$kotlinx_coroutines_core() instanceof CancelledContinuation;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean isCompleted() {
        return !(getState$kotlinx_coroutines_core() instanceof NotCompleted);
    }

    protected String nameString() {
        return "CancellableContinuation";
    }

    public final void parentCancelled$kotlinx_coroutines_core(Throwable th) {
        if (cancelLater(th)) {
            return;
        }
        cancel(th);
        detachChildIfNonResuable();
    }

    public final void releaseClaimedReusableContinuation$kotlinx_coroutines_core() {
        Throwable thTryReleaseClaimedContinuation$kotlinx_coroutines_core;
        Continuation<T> continuation = this.delegate;
        DispatchedContinuation dispatchedContinuation = continuation instanceof DispatchedContinuation ? (DispatchedContinuation) continuation : null;
        if (dispatchedContinuation == null || (thTryReleaseClaimedContinuation$kotlinx_coroutines_core = dispatchedContinuation.tryReleaseClaimedContinuation$kotlinx_coroutines_core(this)) == null) {
            return;
        }
        detachChild$kotlinx_coroutines_core();
        cancel(thTryReleaseClaimedContinuation$kotlinx_coroutines_core);
    }

    public final boolean resetStateReusable() {
        if (DebugKt.getASSERTIONS_ENABLED() && this.resumeMode != 2) {
            throw new AssertionError();
        }
        if (DebugKt.getASSERTIONS_ENABLED() && getParentHandle() == NonDisposableHandle.INSTANCE) {
            throw new AssertionError();
        }
        Object obj = _state$volatile$FU.get(this);
        if (DebugKt.getASSERTIONS_ENABLED() && (obj instanceof NotCompleted)) {
            throw new AssertionError();
        }
        if ((obj instanceof CompletedContinuation) && ((CompletedContinuation) obj).idempotentResume != null) {
            detachChild$kotlinx_coroutines_core();
            return false;
        }
        _decisionAndIndex$volatile$FU.set(this, 536870911);
        _state$volatile$FU.set(this, Active.INSTANCE);
        return true;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void resume(T t2, final Function1<? super Throwable, Unit> function1) {
        resumeImpl$kotlinx_coroutines_core(t2, this.resumeMode, function1 != null ? new Function3() { // from class: kotlinx.coroutines.CancellableContinuationImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return CancellableContinuationImpl.resume$lambda$13$lambda$12(function1, (Throwable) obj, obj2, (CoroutineContext) obj3);
            }
        } : null);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public <R extends T> void resume(R r2, Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> function3) {
        resumeImpl$kotlinx_coroutines_core(r2, this.resumeMode, function3);
    }

    public final <R> void resumeImpl$kotlinx_coroutines_core(R r2, int i2, Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> function3) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof NotCompleted)) {
                if (obj instanceof CancelledContinuation) {
                    CancelledContinuation cancelledContinuation = (CancelledContinuation) obj;
                    if (cancelledContinuation.makeResumed()) {
                        if (function3 != null) {
                            callOnCancellation(function3, cancelledContinuation.cause, r2);
                            return;
                        }
                        return;
                    }
                }
                alreadyResumedError(r2);
                throw new KotlinNothingValueException();
            }
        } while (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$volatile$FU, this, obj, resumedState((NotCompleted) obj, r2, i2, function3, null)));
        detachChildIfNonResuable();
        dispatchResume(i2);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void resumeUndispatched(CoroutineDispatcher coroutineDispatcher, T t2) {
        Continuation<T> continuation = this.delegate;
        DispatchedContinuation dispatchedContinuation = continuation instanceof DispatchedContinuation ? (DispatchedContinuation) continuation : null;
        resumeImpl$kotlinx_coroutines_core$default(this, t2, (dispatchedContinuation != null ? dispatchedContinuation.dispatcher : null) == coroutineDispatcher ? 4 : this.resumeMode, null, 4, null);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void resumeUndispatchedWithException(CoroutineDispatcher coroutineDispatcher, Throwable th) {
        Continuation<T> continuation = this.delegate;
        DispatchedContinuation dispatchedContinuation = continuation instanceof DispatchedContinuation ? (DispatchedContinuation) continuation : null;
        resumeImpl$kotlinx_coroutines_core$default(this, new CompletedExceptionally(th, false, 2, null), (dispatchedContinuation != null ? dispatchedContinuation.dispatcher : null) == coroutineDispatcher ? 4 : this.resumeMode, null, 4, null);
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
        resumeImpl$kotlinx_coroutines_core$default(this, CompletionStateKt.toState(obj, this), this.resumeMode, null, 4, null);
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public Object takeState$kotlinx_coroutines_core() {
        return getState$kotlinx_coroutines_core();
    }

    public String toString() {
        return nameString() + '(' + DebugStringsKt.toDebugString(this.delegate) + "){" + getStateDebugRepresentation() + "}@" + DebugStringsKt.getHexAddress(this);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public Object tryResume(T t2, Object obj) {
        return tryResumeImpl(t2, obj, null);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public <R extends T> Object tryResume(R r2, Object obj, Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> function3) {
        return tryResumeImpl(r2, obj, function3);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public Object tryResumeWithException(Throwable th) {
        return tryResumeImpl(new CompletedExceptionally(th, false, 2, null), null, null);
    }
}
