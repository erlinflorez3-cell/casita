package kotlinx.coroutines.channels;

import com.dynatrace.android.agent.AdkSettings;
import com.dynatrace.android.agent.Global;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.channels.ReceiveChannel;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯĽ\u0014D5'\u001fq\u007fZDkŞ\fA\u001c0\u0013.X~*,(w\u000ffp98DsH6RY+\u0017k\u00124,[2rK;k\u001a\u0006\"\u000fPVgu}RZ\u0011D\u0017\u0006$~r,Oc\u0001](\u000f:Bu?;M\u0006=A`\u000b6\r @+@y\u0013Џ\"*N\u0011~zYK\u0014\u00126Cx:`*U\u0005 \u0012\u000e>6\u0001&\\mR>Hz\u007fB/)\u0003qBd'gܞ\u0005M\u001bi\\'\u0013vi\u001e9_?ߎ\u001d%a#\u000fRaD\u000b?\b=\rh-)3I\u0002x>X\u0006\u0016\u001d+e\rer<\\\rQf\u0015?l]ҪcPT'\u0018|\u0002ȞJ\u0004.\b-G<,Bl\u0018\u0010Ct9SnQ2yP\u0002\u0013xF\u001f5\u0006C-I\u001b-Q\u0010?)PG{K\fL&ъr!aYTֳ\u001bôXw_7ipKOf\n\bE\u000e\u0006vç\u0010*,6W\u0002?{W.E&gkG,9w\u0012JTg=\u0005pjci\u0001Pn%5ݳ}Ҋ\r\fhN|My[ly<$]-j\u0006,\u0015˙$f}J1+\u0016]_jopsm\u001a'?fea\u001dnvW\u0018jcM_t(mb~\u001a>Lf\u0015XlC\u0002\u0010\tnH&BHp\u0011&\u007f\u000bMܟ\u00172M\u00054X:E1\\[H# Hˆ\u000b\t\b`x\u0012\u000fTy$1mTx\u0017\u0016h\\\u001f\u0006.ն\bض\u0001`0DYwC1>W8gz|C\t\u0005͞\u000eG\u0010RWN|\u0016<U*$F\u001eGfG=A%Eȃpī1EZ\n}m[+?zCy/=n֫u\b\u0013v<bzJ\u0016TE&=ܭ1ן\fd\u000e\u0014yd\tb{V!Z\u0005I\u0013\u0005_ߢ\\8%\u000b/ 5\u00016\"+9sφeޗ\u001aw\"I-\u0006k\u0006\b.(x/(zЁ\u0012,\f\u001c\u007fda]x;fM\n\u0003L?<lIB\u000fۻ6ڇF\tB+KdO\u0004\tV~M+1\u0004օ\u0015,5vf]J\u00136}b2&͐2ʸ\u0002\u0014l]=5[s\u007fm\u001ca|\rP\u05fa\u0018\u000b$7~\u0014,=fV\u0006f94\u0014\u001106\b;)ťzʢ(4:Z )Qu\u0002\b&yFF\u007f\u0011\u001dϨPsc\\\u001eV\t\\\u001dH3d\fǿ_Ǆ\u0005~\u001dM6\u0015CS\u001dm\rTOe8ܬa\u001d1!zQ\u000ffk+rX\u007fБf\u0092\u0005\u000bSw[g\u0010Y\u001cI?l2o,:\u001eӽ+B@!IS!_=0\r\u000f\u001c̬\rЩz\u0012tlfP7#\u0013\u0003\u001e>\u001a\u000fQ\u0019}v\u0010d3ً\\w_I*\u0003'Do\u0007:\u0001\u0014J)R\u001e5[Syp\u001a'\n}k;,/f%?S\u0003It]\u001eh\u001a]a:Du6d\bƁ!PH\n>L\u0005rP.6:\u007f\b9\u0002!\u0005qk&HpG9\u0016\u001e^Qg\t\fsl*ne\u0013\u0013lAX\nn[|K47Q>\u0015nYh>\u0002J\u001f\u0016\u05ca\u0018\u00154MNWpX(Usj\u0001k\u0016[;/Om0ԝ?0z$\u000e!\nuJ*\u0003,EA\\ML\u000b!\\\u001bi\b.l\u0014@\u0001z\u000b9\u0016\r~\u000f^!\u001bDL\u0003 t/eEM\u0007\u001dKp\t\u001aDwSO[\u0019>װ;2\u0019\u001e@[\u001f3Rh\u0005\u0002:BOr.kL/L§K\u001aO_4ot\u0003lKs<r\u000e2\u0011\u001c7GZfGn\u0012(ES\u00039@)\"\u0011$f\u001c˲\u000b#;xaY+9\u0011~\u0007\u0013e\u000fAmJs}r37\u001fu+Yv;Sa\u0014w7\u0010\u0012g`}{\u0011\u0005@(1ޜ9E,,m\u0010\u000e=7*4\b\u0006#FE_LJabǾds\u007f\n6,Fn\u000b#up)y\u0010,w>\fd\n\tda\t=1`D)=n\u0017E\u0014h\n\u0013T\u0013U\u0016G\u000f4UaB\r\u0014_sV*w {Y#bڍ\u0017s\u0012hJ\u0004D._Fi,\u0016-XT\u0012n\u000bsW̙\u001e8:\r;1 9bd\u0010b3\u0017mK%J|[\u0011\nO\u0018#@UZ~4HԽ\u0019\u0006>.vD\"\fP_#I[O\u0004EM̈f{g\u001d?\u0013M\u000e5kzIUT8Xk=c\u000f{\u0003p5,\u0013Kȁ_ʢh+#9\u0003e<|n>``x\f\u0014ȊrH8D'qHy6/>\u0007'`S_\u0011\u001ce=\u0004O\u000e\u0007BfG]z\u0010q7\u0006r\u0003Y1e\u0011\u0002IF\bÐQȝ\"SGm;\"\u001bmV\u0002\u0018^YUCmw\u0014#cPĄ=\u0006g5QM|V,?G[o\u0003\u001aE?$4)Thm\u0013w4:_1s|[A\u0018Y\u0017)lRl\u001fz;\f\\\u0010XW\f۳\u0014\u0011\u000b\"E=o@r.\u001f\rwUp{8\f\bf#\u0001}e9\u001f1Z7p!e__ZnadhD'Y6@A.HH6e\fJ?/E\u0003\u0012\u00181xئd\u0011gb\u0004dr8\u000bf+t\u0004@B\u0091z\u0019\u0007[\u0004\u001a_z\u000b\u000fprXAVb\u001bfO<Xl)\u0001GK\u0010\u001bD;R/;gyphڥ`̏a%U\u0006\u001eDx!\u0010\u0015B\u0014S8\u0013ѥ:|5\u0013De\u0001:\u0015\r]4\nΏ?2\rZnSU`7ox\bp\u000e:\u000150|\fjQ<U9Վ=Ԡ\"\u001aO\u0011Q\u0002/S\u001b%L\nBM\u001f=~Zl%t?4`2D\u0002Қz\u0004\u0014}9V\u007f\u0013\\o.7\u000eu\b\"\u001dkXFsL3O0&?\"\\Q>˖\u0018\u008d]A\u0010$:y2H-'H\u000eTL8״1C/8\u001eIt2\u0019;\u000fe\u001at\u001d\u0006\u001e6sҤ\u0004f$*DECφm~\fp]80]Y{\u000f7W\u0010Y\u0016\u0001\u0012\\o\u0006[\u0004\u0018Dv5s45\u001e,x[\t\\>Ñ!Ըo:\n\u000f\u001b6x\u0014F jh~l=P\u0010Y]\u0018\u0013К\u0013>\u001c/3B5_'g.?Oޕ[ϠUEr%\\36+JD\"\u0011XX-\u000eIM%Mj΄$9m~PM%[Jg\u0012Uhٱ\u0007̉,/\u0018\u0012.\u0012+LM?\u001du`^{f\r\ru%\u0014ގ|O(s61U\\\u0003&?]\u0018\u000e\u0011fzT=G\rl<\u001d\u000frEfE(8\u0013:?Id)i\u001563;mvcp\u000b&~ak)@}L AEMA\u001e(\u0018\u0002\u000bZb|$+\u0007Mײ\u0010\u001aQ\\ i\u00134d\u000bE\fQ1\u0006R\u001f\u001dKyeȆP\u0005-'''\u0019\u0017Pg|\u0015\u007f\u0015n\"q\u0017'!s\t\u001eBa%7T\u0002\u0017\tgJ,&T A\u001a\u0013)^\b\b1O@2\u0004\t\u0014K\u001c)>n\u007fl\u000e]>| f$}Պ:E6>>=IczbT)k(\u000b\u0016<\"?,*ח\u001anP\u001dbg\fn\u001fXr\u0014p455\u0007De1)\u00014'\u0019\tQ\u0005[IL'mwj\u000ev\b`R@tۀBs\u0003\u0016A#\n\u0015[g8\"_^\n#{4\u0007\":j$*u\u000e\u001dL\u0017,Hao@2;R\u001a\"]-HW?ճx\u0004=x)c\u0017AI8Yal\u001fr]Wt\f{5Ô`Amt5\u0019%%`aePsk2\u001eUg\u0004IS\u0019=%p\f\u0003)55 \u0004\u000faMO\u001eW\u001aA\u000fG\u0001R\u0019Tؽ >\u001a\u00032hoC>DhUP+\"g^'\u001eqt\u001dq<\u000e>]\u001c\u0018]\u0010\u0006;Q31\u001b\u001d@\u0002zq\u007fd3hȲYvj?'\rK;_6\\w\u000b}b1 D\u0018tgڝDE \u001e/CW0Z\u0002:}tu\r2Y\u0012\u0013\u000bp\u0016C8F\u001e\u000eAnfw[x\u0018j\u0004\u0005{J(\u000e\u0010v64>\u001cWU^>\nF\u001fuiEr%\u0002v\u0017O\u0019(\u0015+,j\u0018,\n˦*#8t\u0018\u007fA4\u0014ccr\u001fN'4t4\t\u0014M^L.t\"\u0011۪]g\\$HN\tF\u0015E\u0010\t^( b63Fp\u001ew\u0001]\u0019yT\u000eS#\u0004Vp98`%[GRnޜ$\u000b\u001a8SNo^g-\u000e\u000fYO5)!)\u001aW=TK7\u000eY6[fn\u000eū-E\n!u\u0004F1gQz\u00187?\u001ew\ndZF\n\u00036;\\ T9W-L\u00146\u0013\u001a57\u0007\u001bW\u0017d\u0012zZ %m`\t}TshSYp]\b:S\fx6W$݉3\t(W\u007f\u000f4L-tt\u000ea9$0_)\u0003\fǒ{\u0010#\u0003,6&\" \u0012o\u001aa˃_ȸKgWMM \u001c*ho-]xvqڏpX<8\u0013 S:?\b\u0019\\+Є:ӡrbTEwJTs(\"[@\u0007yV֫G \u000bn\u0011w\u0003Y,\u0016\r+9Ɨ\u001c͘\u0004ou_~\u0002S)}\"\fQA\u001cyVrγxx|KLf\u0007BrBzzP$\u001a-~L/>Q̵8lnEWO\u000edrNT͗!\u0011:Z[\u0002Eʕ{ޗ!sDf3MPw\u0013\f\b\f 8-v<\u009a[Y\n'BcJt2\u0001a\u001fC\u001c\"\f,pkl\u0003ܤ\u0006iR,^\u0003,sQS+ǁ!#3\f\u0016''\u06038۵e*Qf\u001dB%)\u0019J\"t\u000f\u0003Fߞ|V_N70\u0007rM#:p`͟*գ1Y\u0004\u00015\bFf\u0015\u0019mFrLS\u0011U.M\u0013\"Ӂ\u0017MqSi^N\u0014$?-UgpJ.<vW7\u0017=,\u001a\u000eXq\u0003s\u0004LGR]0\u000b^8D\u0006UI\u0003724\u001c\u0017RܯQ\\qv\u000b]R\\G-\u001e|\u00170c|\u001fit7\u0010t~&\u0002F\u001eMN\u0017\u001dO\u007fߧc\u0004|\u0004Yoj'D[\u0012aCo\u0007R\u0002Kȃxg\u000f\u000bJ\u0015\u0002\u001b^][l\u001d\u0012C<v V\u0012kM\u0013r>.\u0019tjmJ!NJBF|M\u0015\u0013rfjKdM#XbI\r`[R\u0011PK.>XŞE\u007fj\tm-\u0019:\u000b]\u0015\u0001[-\\mu2z_ӯ\u0017W(am\u0018@#\u007f\u0017\u0004\u0006.\u0007X\u001a\u0011-\u0015uSm2\"\n=PX[p~kx\b4v\u0011oԒI\u0011\r4FN(:#/\u0017\t*rAV\u000biuWH\u0018\u0010H\n\u001b>\u001b}P\u0013^FK\u0006Fغh\u001eEhҴk5"}, d2 = {"1n]@h4>", Global.BLANK, "\u0013", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u0002Bcy\u001f5i$=+F7t=\u001e\u001c>", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00125W}$Hms1ILDk;s", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n~\u001a\u0013Px\u000eC\u0005n\u0012f\b\u001c6k\u0012<\\!>g='\u0015o7 \rm;Uz0\u0011Q_4&S\u0003F\u0012!^\u0018W9VeiJ\"}HA(S\u0002\rh@d\u0012\b_\u00151sr\f@\rLy\u0013\u0005\u0017", "1n]@h4>3\u0015|}", "", "/bc6b5", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n~\u001a\u0013Px\u000eC\u0005n\u0012f\b\u001c6k\u0012<\\!>g='\u0015o7 \rm;Uz0\u0011Q_4&S\u0003F\u0012!^\u0018W9VeiJ\"}HA(S\u00020\bEw\b\u0010\u001fW3t}Lf\u001fK\u0003\u0015\u0004\u000b\u0007rOhc\u0003W=Tf4ma#\u0004a6K ]x\u0015$j\u001a\u0018\u0007\u0001S\u000f\u0002(", "1n]@h4>at\u0006\u0002", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b\u001f\"No\u001d@\u0001.\u0018U\u0007\u001f>m#\u0004", "", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "1`d@X", "1gP;a,Ea", "", "uZ;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJ\u0015\u001aCx\u0017<}3~F}\u001e7q'.+F7t=\u001e\u001c>% \rm;Uz0\u0011Q_4&S\u0003F\u0012!^\u0018W9VeiJ\"}HA(S\u0002", "3kT:X5M/(", "7mS2k", "", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n~\u001a\u0013Px\u000eC\u0005n\"Y{ ;~\u0016\fP?Dt4%jLH?\u0011r3R\u007fpEV[6lavF\u0014 $kX4\u001c\tbQ }HA(]o0\u00077y|U\u001d\n>l:,S\u0015Gw$K", "3kT:X5M/(h\bG<\u0004\u0010", "4ha@g", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n~\u001a\u0013Px\u000eC\u0005n\"Y{ ;~\u0016\fP?Dt4%jOgC\u0016j0W@%QYX<kV{=\"[8\u0018W:\u0011\u000ei=3rN@tK\u0013N}LdJ\u0013\u0012\u001774Z?[\u0010E\tj", "4ha@g\u0016K<)\u0006\u0002", "7mS2k\u0016?", "3kT:X5M", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n~\u001a\u0013Px\u000eC\u0005n\"Y{ ;~\u0016\fP?Dt4%jOf5\u0018_uUr0I\u00168)aRpLix`\u0018]2\u0011\u000e#?.{NG.\f5I\u0010\u0005F\u000b\u0015%\u0012>zlQZ\u001aPOX\\F%yB#fuPC\u000fL'i\f],2", ":`bA", ":`bA<5=S,h{", ":`bAB9'c \u0006", "Ah]4_,", "Ah]4_,(`\u0002\u000f\u0002e", "2q^=", "<", "1n]AX?M", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "2q^=J/BZ\u0019", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "", "", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n~\u001a\u0013Px\u000eC\u0005n\"Y{ ;~\u0016\fP?Dt4%jOgC\u0016j0W@%QYX<kV{=\"[8\u0018[5\u001d\u0014]J$LN@.\b?XW\"n\u000b\u001b\u001d\u0012>4uS^YH\n\u001esP-rOg)ZWJCq.n\u0015,r !@.#x\u001d${\u001a,\u0014\t]!\u0002V\u0003gu\u0011\u0017}4-GmbT\u000f\\U:t+0KYz\u000e;at2J", "4h[AX9", "4h[AX9\"\\\u0018~\u000e^+", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n~\u001a\u0013Px\u000eC\u0005n\"Y{ ;~\u0016\fP?Dt4%jOgC\u0016j0W@%QYX<kV{=\"[8\u0018[5\u001d\u0014]J$LN@.\b?XW\"n\u000b\u001b\u001d\u0012>4uS^YH\n\u001esP-rOg)ZWJCq.n\u0015-r !@.#x\u001d${\u001a,\u0014\t]!\u0002V\u0003gu\u0011\u0017}4-GmbT\u000f\\U:t+0KYz\u000e;at2J", "4h[AX9'](", "4h[AX9'](g\u000be3", "4h[AX9'](g\u000be3k\u0013", "\u0011", "", "2dbA\\5:b\u001d\t\u0004", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n~\u001a\u0013Px\u000eC\u0005n\"Y{ ;~\u0016\fP?Dt4%jOf5\u0018_u^\u0006+N\u0016,6cYr;#\u0016d\u0017$\u0012\u0013\u000fhH(w\u000e5)\u00156Y\u0011?q\u0001\u001a_k?s\u007fF_ C\t\u0019\u007fJ~,-^[\u000bC\u000bL^3fUI\u001aa:83i", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00135b|}:i\u001f7MJ\u0011", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n~\u001a\u0013Px\u000eC\u0005n\"Y{ ;~\u0016\fP?Dt4%jOgC\u0016j0W\npEV[6lavF\u0014 $\fQ'\u0016\u000eYH2827(\u0007\nL}Dq\u0001\u0013kt;t\u007fIZ\u0019\u0011w\u001f\u0003K9wJb_\b\u0011\u001fOk9h\u0015o\u0019k>D-i5\u007f da*S\u0003O\u001at\u001ccdlG\u0017\n\u000e", "B`Z2", "B`Z2J/BZ\u0019", "Bn25T5GS ", "Bn2<_3>Q(\u0003\u0005g", "Bn<.c", "", "\u0019", "$", "\u001aj^A_0G\u001d\u0004z~k\u0002", "\u001b", "", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n~\u001a\u0013Px\u000eC\u0005n\"Y{ ;~\u0016\fP?Dt4%jOf5\u0018_u^\u0006+N\u00166(g(YC\u001e!a\u0012Wt\u000b\u000ffK4}H@\u001f\u0016u'\fDw\u0005\u0015&\nDnzK,S.~\u0011\u0007=roBbaC1>Jb(sa", "Bn<Bg(;Z\u0019e~l;", "", "BnB2g", "", "4kPA@(I", "BqP;f-H`!", ";`_", ";`_\u0016a+>f\u0019}", ";`_\u0016a+>f\u0019}ch;e\u00196l", ";`_\u001bb;'c \u0006", "Ehc5<5=S,", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E$\n\u0016\u0017Zo\r-r,EYS", "2hbA\\5<b", "2hbA\\5<bu\u0013", "Ad[2V;H`", "Bn<Bg(;Z\u0019lzm", "", "/mh", "1nd;g", ";`g$\\;A", "1n\\=T9:b#\f", "\u001aj^A_0G\u001dv\t\u0003i(\n\u0005>o\r}", "\u001aiPCTuNb\u001d\u0006D<6\u0005\u0014+r{7\u0006MV", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n~\u001a\u0013Px\u000eC\u0005n\"Y{ ;~\u0016\fP?Dt4%jOf5\u0018_u^\u0006+N\u0016,6d]nJ\u0010!d\u001b$\u0012\u0013\u000fhH(w\u000e5)\u00156Y\u0011?q\u0001\u001a_k?s\u007fF_ C\t\u0019\u007fJ~,-^[\u000bC\u000bL^3fUI\u001aa:83i", ";h]$\\;A", "<n]2", "@d`B\\9><#g\u000be3\u000b", "Hh_", "=sW2e", RemoteSettings.FORWARD_SLASH_STRING, AdkSettings.PLATFORM_TYPE_MOBILE, "1n]@h4>a", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n~\u001a\u0013Px\u000eC\u0005n\"Y{ ;~\u0016\fP?Dt4%j,H?\u0011r3R\u007fpL]Vu]b{;#\u0016d\u0017\\tm\u0015b?3rN@j]", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 5, mv = {2, 0, 0}, pn = "", xi = 48, xs = ">AE<8<Ez.9;7<:.2(5o#'\u001f+* &,fy\u001e\u0016\"!\u0017\u001d#y\"")
final /* synthetic */ class ChannelsKt__DeprecatedKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$any$1 */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1<E> extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.any(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$consumeEach$1 */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 176, xs = "")
    static final class C13891<E> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C13891(Continuation<? super C13891> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.consumeEach(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$count$1 */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C13901<E> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C13901(Continuation<? super C13901> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            int i2 = this.label;
            this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
            return ChannelsKt__DeprecatedKt.count(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinct$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0006\u001d<;\",˛\u0018D\u000bb\u0015\u0006Gي>\n^F\r\"D\u0012>\u0006-r"}, d2 = {"\n`]<a@F])\rS", "\u0013", "7s"}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C13911<E> extends SuspendLambda implements Function2<E, Continuation<? super E>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C13911(Continuation<? super C13911> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C13911 c13911 = new C13911(continuation);
            c13911.L$0 = obj;
            return c13911;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(E e2, Continuation<? super E> continuation) {
            return ((C13911) create(e2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return this.L$0;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bӵLc\u000b\u0004OيH\u000b\\A\u001f$2ߚ\u0006\u0007\u000fpI2Te\u000f.\u0001Tp\u0017"}, d2 = {"\n`]<a@F])\rS", "", "\u0013", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u0010Bc|05m#\u001cKMFk\n"}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C13921<E> extends SuspendLambda implements Function2<ProducerScope<? super E>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<E, Continuation<? super K>, Object> $selector;
        final /* synthetic */ ReceiveChannel<E> $this_distinctBy;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C13921(ReceiveChannel<? extends E> receiveChannel, Function2<? super E, ? super Continuation<? super K>, ? extends Object> function2, Continuation<? super C13921> continuation) {
            super(2, continuation);
            this.$this_distinctBy = receiveChannel;
            this.$selector = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C13921 c13921 = new C13921(this.$this_distinctBy, this.$selector, continuation);
            c13921.L$0 = obj;
            return c13921;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ProducerScope<? super E> producerScope, Continuation<? super Unit> continuation) {
            return ((C13921) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x003c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x00b5  */
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
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0081 -> B:40:0x0028). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0097 -> B:39:0x0022). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r9.label
                r7 = 3
                r6 = 2
                r5 = 1
                if (r0 == 0) goto L99
                if (r0 == r5) goto L3d
                if (r0 == r6) goto L6c
                if (r0 != r7) goto Lad
                java.lang.Object r1 = r9.L$3
                java.lang.Object r3 = r9.L$2
                kotlinx.coroutines.channels.ChannelIterator r3 = (kotlinx.coroutines.channels.ChannelIterator) r3
                java.lang.Object r4 = r9.L$1
                java.util.HashSet r4 = (java.util.HashSet) r4
                java.lang.Object r2 = r9.L$0
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                kotlin.ResultKt.throwOnFailure(r10)
            L22:
                r0 = r4
                java.util.Collection r0 = (java.util.Collection) r0
                r0.add(r1)
            L28:
                r1 = r9
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                r9.L$0 = r2
                r9.L$1 = r4
                r9.L$2 = r3
                r0 = 0
                r9.L$3 = r0
                r9.label = r5
                java.lang.Object r10 = r3.hasNext(r1)
                if (r10 != r8) goto L4c
                return r8
            L3d:
                java.lang.Object r3 = r9.L$2
                kotlinx.coroutines.channels.ChannelIterator r3 = (kotlinx.coroutines.channels.ChannelIterator) r3
                java.lang.Object r4 = r9.L$1
                java.util.HashSet r4 = (java.util.HashSet) r4
                java.lang.Object r2 = r9.L$0
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                kotlin.ResultKt.throwOnFailure(r10)
            L4c:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r0 = r10.booleanValue()
                if (r0 == 0) goto Lb5
                java.lang.Object r1 = r3.next()
                kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super K>, java.lang.Object> r0 = r9.$selector
                r9.L$0 = r2
                r9.L$1 = r4
                r9.L$2 = r3
                r9.L$3 = r1
                r9.label = r6
                java.lang.Object r10 = r0.invoke(r1, r9)
                if (r10 != r8) goto L6b
                return r8
            L6b:
                goto L7d
            L6c:
                java.lang.Object r1 = r9.L$3
                java.lang.Object r3 = r9.L$2
                kotlinx.coroutines.channels.ChannelIterator r3 = (kotlinx.coroutines.channels.ChannelIterator) r3
                java.lang.Object r4 = r9.L$1
                java.util.HashSet r4 = (java.util.HashSet) r4
                java.lang.Object r2 = r9.L$0
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                kotlin.ResultKt.throwOnFailure(r10)
            L7d:
                boolean r0 = r4.contains(r10)
                if (r0 != 0) goto L28
                r0 = r9
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                r9.L$0 = r2
                r9.L$1 = r4
                r9.L$2 = r3
                r9.L$3 = r10
                r9.label = r7
                java.lang.Object r0 = r2.send(r1, r0)
                if (r0 != r8) goto L97
                return r8
            L97:
                r1 = r10
                goto L22
            L99:
                kotlin.ResultKt.throwOnFailure(r10)
                java.lang.Object r2 = r9.L$0
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                java.util.HashSet r4 = new java.util.HashSet
                r4.<init>()
                kotlinx.coroutines.channels.ReceiveChannel<E> r0 = r9.$this_distinctBy
                kotlinx.coroutines.channels.ChannelIterator r3 = r0.iterator()
                goto L28
            Lad:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            Lb5:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C13921.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bӵLc\u000b\u0004OيH\u000b\\A\u001f$2ߚ\u0006\u0007\u000fpI2Te\u000f.\u0001Tp\u0017"}, d2 = {"\n`]<a@F])\rS", "", "\u0013", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u0010Bc|05m#\u001cKMFk\n"}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C13931<E> extends SuspendLambda implements Function2<ProducerScope<? super E>, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $n;
        final /* synthetic */ ReceiveChannel<E> $this_drop;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C13931(int i2, ReceiveChannel<? extends E> receiveChannel, Continuation<? super C13931> continuation) {
            super(2, continuation);
            this.$n = i2;
            this.$this_drop = receiveChannel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C13931 c13931 = new C13931(this.$n, this.$this_drop, continuation);
            c13931.L$0 = obj;
            return c13931;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ProducerScope<? super E> producerScope, Continuation<? super Unit> continuation) {
            return ((C13931) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:71:0x0096, code lost:
        
            if (r6 == 0) goto L72;
         */
        /* JADX WARN: Removed duplicated region for block: B:50:0x002b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x00aa  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0051 -> B:48:0x001c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0079 -> B:68:0x0089). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instruction units count: 204
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C13931.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bӵLc\u000b\u0004OيH\u000b\\A\u001f$2ߚ\u0006\u0007\u000fpI2Te\u000f.\u0001Tp\u0017"}, d2 = {"\n`]<a@F])\rS", "", "\u0013", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u0010Bc|05m#\u001cKMFk\n"}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C13941<E> extends SuspendLambda implements Function2<ProducerScope<? super E>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<E, Continuation<? super Boolean>, Object> $predicate;
        final /* synthetic */ ReceiveChannel<E> $this_dropWhile;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C13941(ReceiveChannel<? extends E> receiveChannel, Function2<? super E, ? super Continuation<? super Boolean>, ? extends Object> function2, Continuation<? super C13941> continuation) {
            super(2, continuation);
            this.$this_dropWhile = receiveChannel;
            this.$predicate = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C13941 c13941 = new C13941(this.$this_dropWhile, this.$predicate, continuation);
            c13941.L$0 = obj;
            return c13941;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ProducerScope<? super E> producerScope, Continuation<? super Unit> continuation) {
            return ((C13941) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:57:0x0032 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0079 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:72:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x00b8  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x00e3  */
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
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0058 -> B:55:0x0023). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x009f -> B:77:0x00b0). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instruction units count: 230
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C13941.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1 */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C13951<E> extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C13951(Continuation<? super C13951> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
            return ChannelsKt__DeprecatedKt.elementAt(null, 0, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1 */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C13961<E> extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C13961(Continuation<? super C13961> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            int i2 = this.label;
            this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
            return ChannelsKt__DeprecatedKt.elementAtOrNull(null, 0, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bӵLc\u000b\u0004OيH\u000b\\A\u001f$2ߚ\u0006\u0007\u000fpI2Te\u000f.\u0001Tp\u0017"}, d2 = {"\n`]<a@F])\rS", "", "\u0013", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u0010Bc|05m#\u001cKMFk\n"}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C13971<E> extends SuspendLambda implements Function2<ProducerScope<? super E>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<E, Continuation<? super Boolean>, Object> $predicate;
        final /* synthetic */ ReceiveChannel<E> $this_filter;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C13971(ReceiveChannel<? extends E> receiveChannel, Function2<? super E, ? super Continuation<? super Boolean>, ? extends Object> function2, Continuation<? super C13971> continuation) {
            super(2, continuation);
            this.$this_filter = receiveChannel;
            this.$predicate = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C13971 c13971 = new C13971(this.$this_filter, this.$predicate, continuation);
            c13971.L$0 = obj;
            return c13971;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ProducerScope<? super E> producerScope, Continuation<? super Unit> continuation) {
            return ((C13971) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:44:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0096  */
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
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x006b -> B:38:0x001d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x007c -> B:38:0x001d). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r9.label
                r6 = 0
                r5 = 3
                r4 = 2
                r3 = 1
                if (r0 == 0) goto L80
                if (r0 == r3) goto L2f
                if (r0 == r4) goto L58
                if (r0 != r5) goto L8e
                java.lang.Object r8 = r9.L$1
                kotlinx.coroutines.channels.ChannelIterator r8 = (kotlinx.coroutines.channels.ChannelIterator) r8
                java.lang.Object r2 = r9.L$0
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                kotlin.ResultKt.throwOnFailure(r10)
            L1d:
                r0 = r9
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                r9.L$0 = r2
                r9.L$1 = r8
                r9.L$2 = r6
                r9.label = r3
                java.lang.Object r10 = r8.hasNext(r0)
                if (r10 != r7) goto L3a
                return r7
            L2f:
                java.lang.Object r8 = r9.L$1
                kotlinx.coroutines.channels.ChannelIterator r8 = (kotlinx.coroutines.channels.ChannelIterator) r8
                java.lang.Object r2 = r9.L$0
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                kotlin.ResultKt.throwOnFailure(r10)
            L3a:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r0 = r10.booleanValue()
                if (r0 == 0) goto L96
                java.lang.Object r1 = r8.next()
                kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r0 = r9.$predicate
                r9.L$0 = r2
                r9.L$1 = r8
                r9.L$2 = r1
                r9.label = r4
                java.lang.Object r10 = r0.invoke(r1, r9)
                if (r10 != r7) goto L57
                return r7
            L57:
                goto L65
            L58:
                java.lang.Object r1 = r9.L$2
                java.lang.Object r8 = r9.L$1
                kotlinx.coroutines.channels.ChannelIterator r8 = (kotlinx.coroutines.channels.ChannelIterator) r8
                java.lang.Object r2 = r9.L$0
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                kotlin.ResultKt.throwOnFailure(r10)
            L65:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r0 = r10.booleanValue()
                if (r0 == 0) goto L7f
                r0 = r9
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                r9.L$0 = r2
                r9.L$1 = r8
                r9.L$2 = r6
                r9.label = r5
                java.lang.Object r0 = r2.send(r1, r0)
                if (r0 != r7) goto L7f
                return r7
            L7f:
                goto L1d
            L80:
                kotlin.ResultKt.throwOnFailure(r10)
                java.lang.Object r2 = r9.L$0
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                kotlinx.coroutines.channels.ReceiveChannel<E> r0 = r9.$this_filter
                kotlinx.coroutines.channels.ChannelIterator r8 = r0.iterator()
                goto L1d
            L8e:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            L96:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C13971.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bӵLc\u000b\u0004OيH\u000b\\A\u001f$2ߚ\u0006\u0007\u000fpI2Te\u000f.\u0001Tp\u0017"}, d2 = {"\n`]<a@F])\rS", "", "\u0013", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u0010Bc|05m#\u001cKMFk\n"}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C13981<E> extends SuspendLambda implements Function2<ProducerScope<? super E>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function3<Integer, E, Continuation<? super Boolean>, Object> $predicate;
        final /* synthetic */ ReceiveChannel<E> $this_filterIndexed;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C13981(ReceiveChannel<? extends E> receiveChannel, Function3<? super Integer, ? super E, ? super Continuation<? super Boolean>, ? extends Object> function3, Continuation<? super C13981> continuation) {
            super(2, continuation);
            this.$this_filterIndexed = receiveChannel;
            this.$predicate = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C13981 c13981 = new C13981(this.$this_filterIndexed, this.$predicate, continuation);
            c13981.L$0 = obj;
            return c13981;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ProducerScope<? super E> producerScope, Continuation<? super Unit> continuation) {
            return ((C13981) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:44:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00ab  */
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
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x007c -> B:38:0x001f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x008f -> B:38:0x001f). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r10 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r12.label
                r9 = 0
                r8 = 3
                r7 = 2
                r6 = 1
                if (r0 == 0) goto L93
                if (r0 == r6) goto L33
                if (r0 == r7) goto L67
                if (r0 != r8) goto La3
                int r11 = r12.I$0
                java.lang.Object r5 = r12.L$1
                kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
                java.lang.Object r4 = r12.L$0
                kotlinx.coroutines.channels.ProducerScope r4 = (kotlinx.coroutines.channels.ProducerScope) r4
                kotlin.ResultKt.throwOnFailure(r13)
            L1f:
                r0 = r12
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                r12.L$0 = r4
                r12.L$1 = r5
                r12.L$2 = r9
                r12.I$0 = r11
                r12.label = r6
                java.lang.Object r13 = r5.hasNext(r0)
                if (r13 != r10) goto L40
                return r10
            L33:
                int r11 = r12.I$0
                java.lang.Object r5 = r12.L$1
                kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
                java.lang.Object r4 = r12.L$0
                kotlinx.coroutines.channels.ProducerScope r4 = (kotlinx.coroutines.channels.ProducerScope) r4
                kotlin.ResultKt.throwOnFailure(r13)
            L40:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r0 = r13.booleanValue()
                if (r0 == 0) goto Lab
                java.lang.Object r3 = r5.next()
                kotlin.jvm.functions.Function3<java.lang.Integer, E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r2 = r12.$predicate
                int r1 = r11 + 1
                java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r11)
                r12.L$0 = r4
                r12.L$1 = r5
                r12.L$2 = r3
                r12.I$0 = r1
                r12.label = r7
                java.lang.Object r13 = r2.invoke(r0, r3, r12)
                if (r13 != r10) goto L65
                return r10
            L65:
                r11 = r1
                goto L76
            L67:
                int r11 = r12.I$0
                java.lang.Object r3 = r12.L$2
                java.lang.Object r5 = r12.L$1
                kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
                java.lang.Object r4 = r12.L$0
                kotlinx.coroutines.channels.ProducerScope r4 = (kotlinx.coroutines.channels.ProducerScope) r4
                kotlin.ResultKt.throwOnFailure(r13)
            L76:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r0 = r13.booleanValue()
                if (r0 == 0) goto L92
                r0 = r12
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                r12.L$0 = r4
                r12.L$1 = r5
                r12.L$2 = r9
                r12.I$0 = r11
                r12.label = r8
                java.lang.Object r0 = r4.send(r3, r0)
                if (r0 != r10) goto L92
                return r10
            L92:
                goto L1f
            L93:
                kotlin.ResultKt.throwOnFailure(r13)
                java.lang.Object r4 = r12.L$0
                kotlinx.coroutines.channels.ProducerScope r4 = (kotlinx.coroutines.channels.ProducerScope) r4
                kotlinx.coroutines.channels.ReceiveChannel<E> r0 = r12.$this_filterIndexed
                kotlinx.coroutines.channels.ChannelIterator r5 = r0.iterator()
                r11 = 0
                goto L1f
            La3:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            Lab:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C13981.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNot$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,r\bDJc\u0003İY\u0006^\nND\u0005Ӭ:\u0012(\u000btkQ0\u000be\u000f6"}, d2 = {"\n`]<a@F])\rS", "", "\u0013", "7s"}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C13991<E> extends SuspendLambda implements Function2<E, Continuation<? super Boolean>, Object> {
        final /* synthetic */ Function2<E, Continuation<? super Boolean>, Object> $predicate;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C13991(Function2<? super E, ? super Continuation<? super Boolean>, ? extends Object> function2, Continuation<? super C13991> continuation) {
            super(2, continuation);
            this.$predicate = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C13991 c13991 = new C13991(this.$predicate, continuation);
            c13991.L$0 = obj;
            return c13991;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(E e2, Continuation<? super Boolean> continuation) {
            return ((C13991) create(e2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNot$1<E> for r4v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r4.label
                r2 = 1
                if (r0 == 0) goto L1a
                if (r0 != r2) goto L2a
                kotlin.ResultKt.throwOnFailure(r5)
            Le:
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r0 = r5.booleanValue()
                r0 = r0 ^ r2
                java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
                return r0
            L1a:
                kotlin.ResultKt.throwOnFailure(r5)
                java.lang.Object r1 = r4.L$0
                kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r0 = r4.$predicate
                r4.label = r2
                java.lang.Object r5 = r0.invoke(r1, r4)
                if (r5 != r3) goto Le
                return r3
            L2a:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C13991.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNull$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,r\bӵLc\u0003İIي>éFB-!L\u0018}јtja0rfx4`UB\u0011\u0002zz$\","}, d2 = {"\n`]<a@F])\rS", "", "\u0013", "", "7s"}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C14001<E> extends SuspendLambda implements Function2<E, Continuation<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C14001(Continuation<? super C14001> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C14001 c14001 = new C14001(continuation);
            c14001.L$0 = obj;
            return c14001;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(E e2, Continuation<? super Boolean> continuation) {
            return ((C14001) create(e2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(this.L$0 != null);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1 */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C14011<E, C extends Collection<? super E>> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C14011(Continuation<? super C14011> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            int i2 = this.label;
            this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
            return ChannelsKt__DeprecatedKt.filterNotNullTo((ReceiveChannel) null, (Collection) null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3 */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass3<E, C extends SendChannel<? super E>> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            int i2 = this.label;
            this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
            return ChannelsKt__DeprecatedKt.filterNotNullTo((ReceiveChannel) null, (SendChannel) null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$first$1 */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C14021<E> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C14021(Continuation<? super C14021> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
            return ChannelsKt__DeprecatedKt.first(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$firstOrNull$1 */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C14031<E> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C14031(Continuation<? super C14031> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            int i2 = this.label;
            this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
            return ChannelsKt__DeprecatedKt.firstOrNull(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bӵLc\u000b\u0004OيH\u000b\\A\u001f$2ߚ\u0006\u0007\u000fpI2Te\u000f.\u0001Tp\u0017"}, d2 = {"\n`]<a@F])\rS", "", Global.BLANK, "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u0010Bc|05m#\u001cKMFk\n"}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C14041<R> extends SuspendLambda implements Function2<ProducerScope<? super R>, Continuation<? super Unit>, Object> {
        final /* synthetic */ ReceiveChannel<E> $this_flatMap;
        final /* synthetic */ Function2<E, Continuation<? super ReceiveChannel<? extends R>>, Object> $transform;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C14041(ReceiveChannel<? extends E> receiveChannel, Function2<? super E, ? super Continuation<? super ReceiveChannel<? extends R>>, ? extends Object> function2, Continuation<? super C14041> continuation) {
            super(2, continuation);
            this.$this_flatMap = receiveChannel;
            this.$transform = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C14041 c14041 = new C14041(this.$this_flatMap, this.$transform, continuation);
            c14041.L$0 = obj;
            return c14041;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ProducerScope<? super R> producerScope, Continuation<? super Unit> continuation) {
            return ((C14041) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x006f -> B:34:0x001c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1<R> for r8v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r8.label
                r6 = 3
                r5 = 2
                r4 = 1
                if (r0 == 0) goto L72
                if (r0 == r4) goto L2c
                if (r0 == r5) goto L52
                if (r0 != r6) goto L80
                java.lang.Object r3 = r8.L$1
                kotlinx.coroutines.channels.ChannelIterator r3 = (kotlinx.coroutines.channels.ChannelIterator) r3
                java.lang.Object r2 = r8.L$0
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                kotlin.ResultKt.throwOnFailure(r9)
            L1c:
                r0 = r8
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                r8.L$0 = r2
                r8.L$1 = r3
                r8.label = r4
                java.lang.Object r9 = r3.hasNext(r0)
                if (r9 != r7) goto L37
                return r7
            L2c:
                java.lang.Object r3 = r8.L$1
                kotlinx.coroutines.channels.ChannelIterator r3 = (kotlinx.coroutines.channels.ChannelIterator) r3
                java.lang.Object r2 = r8.L$0
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                kotlin.ResultKt.throwOnFailure(r9)
            L37:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r0 = r9.booleanValue()
                if (r0 == 0) goto L88
                java.lang.Object r1 = r3.next()
                kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ReceiveChannel<? extends R>>, java.lang.Object> r0 = r8.$transform
                r8.L$0 = r2
                r8.L$1 = r3
                r8.label = r5
                java.lang.Object r9 = r0.invoke(r1, r8)
                if (r9 != r7) goto L5d
                return r7
            L52:
                java.lang.Object r3 = r8.L$1
                kotlinx.coroutines.channels.ChannelIterator r3 = (kotlinx.coroutines.channels.ChannelIterator) r3
                java.lang.Object r2 = r8.L$0
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                kotlin.ResultKt.throwOnFailure(r9)
            L5d:
                kotlinx.coroutines.channels.ReceiveChannel r9 = (kotlinx.coroutines.channels.ReceiveChannel) r9
                r1 = r2
                kotlinx.coroutines.channels.SendChannel r1 = (kotlinx.coroutines.channels.SendChannel) r1
                r0 = r8
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                r8.L$0 = r2
                r8.L$1 = r3
                r8.label = r6
                java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt.toChannel(r9, r1, r0)
                if (r0 != r7) goto L1c
                return r7
            L72:
                kotlin.ResultKt.throwOnFailure(r9)
                java.lang.Object r2 = r8.L$0
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                kotlinx.coroutines.channels.ReceiveChannel<E> r0 = r8.$this_flatMap
                kotlinx.coroutines.channels.ChannelIterator r3 = r0.iterator()
                goto L1c
            L80:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            L88:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C14041.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$indexOf$1 */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C14051<E> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C14051(Continuation<? super C14051> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
            return ChannelsKt__DeprecatedKt.indexOf(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1 */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C14061<E> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C14061(Continuation<? super C14061> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.last(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastIndexOf$1 */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C14071<E> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        C14071(Continuation<? super C14071> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.lastIndexOf(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1 */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C14081<E> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C14081(Continuation<? super C14081> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            int i2 = this.label;
            this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
            return ChannelsKt__DeprecatedKt.lastOrNull(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bӵLc\u000b\u0004OيH\u000b\\A\u001f$2ߚ\u0006\u0007\u000fpI2Te\u000f.\u0001Tp\u0017"}, d2 = {"\n`]<a@F])\rS", "", Global.BLANK, "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u0010Bc|05m#\u001cKMFk\n"}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C14091<R> extends SuspendLambda implements Function2<ProducerScope<? super R>, Continuation<? super Unit>, Object> {
        final /* synthetic */ ReceiveChannel<E> $this_map;
        final /* synthetic */ Function2<E, Continuation<? super R>, Object> $transform;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C14091(ReceiveChannel<? extends E> receiveChannel, Function2<? super E, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super C14091> continuation) {
            super(2, continuation);
            this.$this_map = receiveChannel;
            this.$transform = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C14091 c14091 = new C14091(this.$this_map, this.$transform, continuation);
            c14091.L$0 = obj;
            return c14091;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ProducerScope<? super R> producerScope, Continuation<? super Unit> continuation) {
            return ((C14091) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:69:0x0086 A[Catch: all -> 0x00bd, TryCatch #1 {all -> 0x00bd, blocks: (B:55:0x0022, B:64:0x006d, B:67:0x007e, B:69:0x0086, B:80:0x00b5, B:61:0x0058, B:63:0x0068), top: B:90:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:75:0x00b0 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:76:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x00b5 A[Catch: all -> 0x00bd, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00bd, blocks: (B:55:0x0022, B:64:0x006d, B:67:0x007e, B:69:0x0086, B:80:0x00b5, B:61:0x0058, B:63:0x0068), top: B:90:0x000a }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x00b1 -> B:64:0x006d). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r10 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r11.label
                r9 = 3
                r8 = 2
                r7 = 1
                r6 = 0
                if (r0 == 0) goto L5d
                if (r0 == r7) goto L48
                if (r0 == r8) goto L2f
                if (r0 != r9) goto L27
                java.lang.Object r1 = r11.L$3
                kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                java.lang.Object r5 = r11.L$2
                kotlinx.coroutines.channels.ReceiveChannel r5 = (kotlinx.coroutines.channels.ReceiveChannel) r5
                java.lang.Object r4 = r11.L$1
                kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
                java.lang.Object r3 = r11.L$0
                kotlinx.coroutines.channels.ProducerScope r3 = (kotlinx.coroutines.channels.ProducerScope) r3
                kotlin.ResultKt.throwOnFailure(r12)     // Catch: java.lang.Throwable -> Lbd
                r2 = r6
                goto L6d
            L27:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            L2f:
                java.lang.Object r0 = r11.L$4
                kotlinx.coroutines.channels.ProducerScope r0 = (kotlinx.coroutines.channels.ProducerScope) r0
                java.lang.Object r1 = r11.L$3
                kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                java.lang.Object r5 = r11.L$2
                kotlinx.coroutines.channels.ReceiveChannel r5 = (kotlinx.coroutines.channels.ReceiveChannel) r5
                java.lang.Object r4 = r11.L$1
                kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
                java.lang.Object r3 = r11.L$0
                kotlinx.coroutines.channels.ProducerScope r3 = (kotlinx.coroutines.channels.ProducerScope) r3
                kotlin.ResultKt.throwOnFailure(r12)     // Catch: java.lang.Throwable -> Lb3
                r2 = r6
                goto L9e
            L48:
                java.lang.Object r1 = r11.L$3
                kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                java.lang.Object r5 = r11.L$2
                kotlinx.coroutines.channels.ReceiveChannel r5 = (kotlinx.coroutines.channels.ReceiveChannel) r5
                java.lang.Object r4 = r11.L$1
                kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
                java.lang.Object r3 = r11.L$0
                kotlinx.coroutines.channels.ProducerScope r3 = (kotlinx.coroutines.channels.ProducerScope) r3
                kotlin.ResultKt.throwOnFailure(r12)     // Catch: java.lang.Throwable -> Lbd
                r2 = r6
                goto L7e
            L5d:
                kotlin.ResultKt.throwOnFailure(r12)
                java.lang.Object r3 = r11.L$0
                kotlinx.coroutines.channels.ProducerScope r3 = (kotlinx.coroutines.channels.ProducerScope) r3
                kotlinx.coroutines.channels.ReceiveChannel<E> r5 = r11.$this_map
                kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r4 = r11.$transform
                kotlinx.coroutines.channels.ChannelIterator r1 = r5.iterator()     // Catch: java.lang.Throwable -> Lbd
                r2 = r6
            L6d:
                r11.L$0 = r3     // Catch: java.lang.Throwable -> Lbd
                r11.L$1 = r4     // Catch: java.lang.Throwable -> Lbd
                r11.L$2 = r5     // Catch: java.lang.Throwable -> Lbd
                r11.L$3 = r1     // Catch: java.lang.Throwable -> Lbd
                r11.label = r7     // Catch: java.lang.Throwable -> Lbd
                java.lang.Object r12 = r1.hasNext(r11)     // Catch: java.lang.Throwable -> Lbd
                if (r12 != r10) goto L7e
                goto Lb2
            L7e:
                java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.lang.Throwable -> Lbd
                boolean r0 = r12.booleanValue()     // Catch: java.lang.Throwable -> Lbd
                if (r0 == 0) goto Lb5
                java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> Lbd
                r11.L$0 = r3     // Catch: java.lang.Throwable -> Lbd
                r11.L$1 = r4     // Catch: java.lang.Throwable -> Lbd
                r11.L$2 = r5     // Catch: java.lang.Throwable -> Lbd
                r11.L$3 = r1     // Catch: java.lang.Throwable -> Lbd
                r11.L$4 = r3     // Catch: java.lang.Throwable -> Lbd
                r11.label = r8     // Catch: java.lang.Throwable -> Lbd
                java.lang.Object r12 = r4.invoke(r0, r11)     // Catch: java.lang.Throwable -> Lbd
                if (r12 != r10) goto L9d
                return r10
            L9d:
                r0 = r3
            L9e:
                r11.L$0 = r3     // Catch: java.lang.Throwable -> Lb3
                r11.L$1 = r4     // Catch: java.lang.Throwable -> Lb3
                r11.L$2 = r5     // Catch: java.lang.Throwable -> Lb3
                r11.L$3 = r1     // Catch: java.lang.Throwable -> Lb3
                r11.L$4 = r6     // Catch: java.lang.Throwable -> Lb3
                r11.label = r9     // Catch: java.lang.Throwable -> Lb3
                java.lang.Object r0 = r0.send(r12, r11)     // Catch: java.lang.Throwable -> Lb3
                if (r0 != r10) goto Lb1
                return r10
            Lb1:
                goto L6d
            Lb2:
                return r10
            Lb3:
                r1 = move-exception
                goto Lbe
            Lb5:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lbd
                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r2)
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            Lbd:
                r1 = move-exception
            Lbe:
                throw r1     // Catch: java.lang.Throwable -> Lbf
            Lbf:
                r0 = move-exception
                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C14091.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bӵLc\u000b\u0004OيH\u000b\\A\u001f$2ߚ\u0006\u0007\u000fpI2Te\u000f.\u0001Tp\u0017"}, d2 = {"\n`]<a@F])\rS", "", Global.BLANK, "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u0010Bc|05m#\u001cKMFk\n"}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C14101<R> extends SuspendLambda implements Function2<ProducerScope<? super R>, Continuation<? super Unit>, Object> {
        final /* synthetic */ ReceiveChannel<E> $this_mapIndexed;
        final /* synthetic */ Function3<Integer, E, Continuation<? super R>, Object> $transform;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C14101(ReceiveChannel<? extends E> receiveChannel, Function3<? super Integer, ? super E, ? super Continuation<? super R>, ? extends Object> function3, Continuation<? super C14101> continuation) {
            super(2, continuation);
            this.$this_mapIndexed = receiveChannel;
            this.$transform = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C14101 c14101 = new C14101(this.$this_mapIndexed, this.$transform, continuation);
            c14101.L$0 = obj;
            return c14101;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ProducerScope<? super R> producerScope, Continuation<? super Unit> continuation) {
            return ((C14101) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0089 -> B:37:0x001e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1<R> for r11v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r9 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r11.label
                r8 = 3
                r7 = 2
                r6 = 1
                if (r0 == 0) goto L8d
                if (r0 == r6) goto L31
                if (r0 == r7) goto L66
                if (r0 != r8) goto L9c
                int r10 = r11.I$0
                java.lang.Object r5 = r11.L$1
                kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
                java.lang.Object r4 = r11.L$0
                kotlinx.coroutines.channels.ProducerScope r4 = (kotlinx.coroutines.channels.ProducerScope) r4
                kotlin.ResultKt.throwOnFailure(r12)
            L1e:
                r0 = r11
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                r11.L$0 = r4
                r11.L$1 = r5
                r11.I$0 = r10
                r11.label = r6
                java.lang.Object r12 = r5.hasNext(r0)
                if (r12 != r9) goto L30
                return r9
            L30:
                goto L3e
            L31:
                int r10 = r11.I$0
                java.lang.Object r5 = r11.L$1
                kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
                java.lang.Object r4 = r11.L$0
                kotlinx.coroutines.channels.ProducerScope r4 = (kotlinx.coroutines.channels.ProducerScope) r4
                kotlin.ResultKt.throwOnFailure(r12)
            L3e:
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r0 = r12.booleanValue()
                if (r0 == 0) goto La4
                java.lang.Object r3 = r5.next()
                kotlin.jvm.functions.Function3<java.lang.Integer, E, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r2 = r11.$transform
                int r1 = r10 + 1
                java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r10)
                r11.L$0 = r4
                r11.L$1 = r5
                r11.L$2 = r4
                r11.I$0 = r1
                r11.label = r7
                java.lang.Object r12 = r2.invoke(r0, r3, r11)
                if (r12 != r9) goto L63
                return r9
            L63:
                r10 = r1
                r2 = r4
                goto L77
            L66:
                int r10 = r11.I$0
                java.lang.Object r2 = r11.L$2
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                java.lang.Object r5 = r11.L$1
                kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
                java.lang.Object r4 = r11.L$0
                kotlinx.coroutines.channels.ProducerScope r4 = (kotlinx.coroutines.channels.ProducerScope) r4
                kotlin.ResultKt.throwOnFailure(r12)
            L77:
                r1 = r11
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                r11.L$0 = r4
                r11.L$1 = r5
                r0 = 0
                r11.L$2 = r0
                r11.I$0 = r10
                r11.label = r8
                java.lang.Object r0 = r2.send(r12, r1)
                if (r0 != r9) goto L8c
                return r9
            L8c:
                goto L1e
            L8d:
                kotlin.ResultKt.throwOnFailure(r12)
                java.lang.Object r4 = r11.L$0
                kotlinx.coroutines.channels.ProducerScope r4 = (kotlinx.coroutines.channels.ProducerScope) r4
                kotlinx.coroutines.channels.ReceiveChannel<E> r0 = r11.$this_mapIndexed
                kotlinx.coroutines.channels.ChannelIterator r5 = r0.iterator()
                r10 = 0
                goto L1e
            L9c:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            La4:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C14101.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$maxWith$1 */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C14111<E> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C14111(Continuation<? super C14111> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
            return ChannelsKt__DeprecatedKt.maxWith(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$minWith$1 */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C14121<E> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C14121(Continuation<? super C14121> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
            return ChannelsKt__DeprecatedKt.minWith(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$none$1 */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C14131<E> extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C14131(Continuation<? super C14131> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
            return ChannelsKt__DeprecatedKt.none(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$requireNoNulls$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d<;!&i\u000eӵLш\u0003İY\u0006v\nNH\u0005Ӭ:\u0011 \u0007\u0015ji6Rf`0hRp\u000e2\u0004"}, d2 = {"\n`]<a@F])\rS", "\u0013", "", "7s"}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C14141<E> extends SuspendLambda implements Function2<E, Continuation<? super E>, Object> {
        final /* synthetic */ ReceiveChannel<E> $this_requireNoNulls;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C14141(ReceiveChannel<? extends E> receiveChannel, Continuation<? super C14141> continuation) {
            super(2, continuation);
            this.$this_requireNoNulls = receiveChannel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C14141 c14141 = new C14141(this.$this_requireNoNulls, continuation);
            c14141.L$0 = obj;
            return c14141;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(E e2, Continuation<? super E> continuation) {
            return ((C14141) create(e2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Object obj2 = this.L$0;
            if (obj2 != null) {
                return obj2;
            }
            throw new IllegalArgumentException("null element found in " + this.$this_requireNoNulls + '.');
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$single$1 */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C14151<E> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C14151(Continuation<? super C14151> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
            return ChannelsKt__DeprecatedKt.single(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$singleOrNull$1 */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C14161<E> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C14161(Continuation<? super C14161> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
            return ChannelsKt__DeprecatedKt.singleOrNull(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bӵLc\u000b\u0004OيH\u000b\\A\u001f$2ߚ\u0006\u0007\u000fpI2Te\u000f.\u0001Tp\u0017"}, d2 = {"\n`]<a@F])\rS", "", "\u0013", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u0010Bc|05m#\u001cKMFk\n"}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C14171<E> extends SuspendLambda implements Function2<ProducerScope<? super E>, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $n;
        final /* synthetic */ ReceiveChannel<E> $this_take;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C14171(int i2, ReceiveChannel<? extends E> receiveChannel, Continuation<? super C14171> continuation) {
            super(2, continuation);
            this.$n = i2;
            this.$this_take = receiveChannel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C14171 c14171 = new C14171(this.$n, this.$this_take, continuation);
            c14171.L$0 = obj;
            return c14171;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ProducerScope<? super E> producerScope, Continuation<? super Unit> continuation) {
            return ((C14171) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:45:0x001f  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x004c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0083  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x0078 -> B:43:0x001b). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r8.label
                r6 = 2
                r5 = 1
                if (r0 == 0) goto L22
                if (r0 == r5) goto L50
                if (r0 != r6) goto L7b
                int r4 = r8.I$0
                java.lang.Object r3 = r8.L$1
                kotlinx.coroutines.channels.ChannelIterator r3 = (kotlinx.coroutines.channels.ChannelIterator) r3
                java.lang.Object r2 = r8.L$0
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                kotlin.ResultKt.throwOnFailure(r9)
            L1b:
                int r4 = r4 + (-1)
                if (r4 != 0) goto L3b
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L22:
                kotlin.ResultKt.throwOnFailure(r9)
                java.lang.Object r2 = r8.L$0
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                int r4 = r8.$n
                if (r4 != 0) goto L30
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L30:
                if (r4 < 0) goto L4d
                r0 = r5
            L33:
                if (r0 == 0) goto L86
                kotlinx.coroutines.channels.ReceiveChannel<E> r0 = r8.$this_take
                kotlinx.coroutines.channels.ChannelIterator r3 = r0.iterator()
            L3b:
                r0 = r8
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                r8.L$0 = r2
                r8.L$1 = r3
                r8.I$0 = r4
                r8.label = r5
                java.lang.Object r9 = r3.hasNext(r0)
                if (r9 != r7) goto L4f
                return r7
            L4d:
                r0 = 0
                goto L33
            L4f:
                goto L5d
            L50:
                int r4 = r8.I$0
                java.lang.Object r3 = r8.L$1
                kotlinx.coroutines.channels.ChannelIterator r3 = (kotlinx.coroutines.channels.ChannelIterator) r3
                java.lang.Object r2 = r8.L$0
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                kotlin.ResultKt.throwOnFailure(r9)
            L5d:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r0 = r9.booleanValue()
                if (r0 == 0) goto L83
                java.lang.Object r1 = r3.next()
                r0 = r8
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                r8.L$0 = r2
                r8.L$1 = r3
                r8.I$0 = r4
                r8.label = r6
                java.lang.Object r0 = r2.send(r1, r0)
                if (r0 != r7) goto L1b
                return r7
            L7b:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            L83:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L86:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r0 = "Requested element count "
                r1.<init>(r0)
                java.lang.StringBuilder r1 = r1.append(r4)
                java.lang.String r0 = " is less than zero."
                java.lang.StringBuilder r0 = r1.append(r0)
                java.lang.String r0 = r0.toString()
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C14171.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bӵLc\u000b\u0004OيH\u000b\\A\u001f$2ߚ\u0006\u0007\u000fpI2Te\u000f.\u0001Tp\u0017"}, d2 = {"\n`]<a@F])\rS", "", "\u0013", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u0010Bc|05m#\u001cKMFk\n"}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C14181<E> extends SuspendLambda implements Function2<ProducerScope<? super E>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<E, Continuation<? super Boolean>, Object> $predicate;
        final /* synthetic */ ReceiveChannel<E> $this_takeWhile;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C14181(ReceiveChannel<? extends E> receiveChannel, Function2<? super E, ? super Continuation<? super Boolean>, ? extends Object> function2, Continuation<? super C14181> continuation) {
            super(2, continuation);
            this.$this_takeWhile = receiveChannel;
            this.$predicate = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C14181 c14181 = new C14181(this.$this_takeWhile, this.$predicate, continuation);
            c14181.L$0 = obj;
            return c14181;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ProducerScope<? super E> producerScope, Continuation<? super Unit> continuation) {
            return ((C14181) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:46:0x003f  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0097  */
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
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x007d -> B:40:0x001c). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r9.label
                r6 = 3
                r5 = 2
                r4 = 1
                if (r0 == 0) goto L81
                if (r0 == r4) goto L2c
                if (r0 == r5) goto L55
                if (r0 != r6) goto L8f
                java.lang.Object r8 = r9.L$1
                kotlinx.coroutines.channels.ChannelIterator r8 = (kotlinx.coroutines.channels.ChannelIterator) r8
                java.lang.Object r3 = r9.L$0
                kotlinx.coroutines.channels.ProducerScope r3 = (kotlinx.coroutines.channels.ProducerScope) r3
                kotlin.ResultKt.throwOnFailure(r10)
            L1c:
                r0 = r9
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                r9.L$0 = r3
                r9.L$1 = r8
                r9.label = r4
                java.lang.Object r10 = r8.hasNext(r0)
                if (r10 != r7) goto L37
                return r7
            L2c:
                java.lang.Object r8 = r9.L$1
                kotlinx.coroutines.channels.ChannelIterator r8 = (kotlinx.coroutines.channels.ChannelIterator) r8
                java.lang.Object r3 = r9.L$0
                kotlinx.coroutines.channels.ProducerScope r3 = (kotlinx.coroutines.channels.ProducerScope) r3
                kotlin.ResultKt.throwOnFailure(r10)
            L37:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r0 = r10.booleanValue()
                if (r0 == 0) goto L97
                java.lang.Object r2 = r8.next()
                kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r0 = r9.$predicate
                r9.L$0 = r3
                r9.L$1 = r8
                r9.L$2 = r2
                r9.label = r5
                java.lang.Object r10 = r0.invoke(r2, r9)
                if (r10 != r7) goto L54
                return r7
            L54:
                goto L62
            L55:
                java.lang.Object r2 = r9.L$2
                java.lang.Object r8 = r9.L$1
                kotlinx.coroutines.channels.ChannelIterator r8 = (kotlinx.coroutines.channels.ChannelIterator) r8
                java.lang.Object r3 = r9.L$0
                kotlinx.coroutines.channels.ProducerScope r3 = (kotlinx.coroutines.channels.ProducerScope) r3
                kotlin.ResultKt.throwOnFailure(r10)
            L62:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r0 = r10.booleanValue()
                if (r0 != 0) goto L6d
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L6d:
                r1 = r9
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                r9.L$0 = r3
                r9.L$1 = r8
                r0 = 0
                r9.L$2 = r0
                r9.label = r6
                java.lang.Object r0 = r3.send(r2, r1)
                if (r0 != r7) goto L80
                return r7
            L80:
                goto L1c
            L81:
                kotlin.ResultKt.throwOnFailure(r10)
                java.lang.Object r3 = r9.L$0
                kotlinx.coroutines.channels.ProducerScope r3 = (kotlinx.coroutines.channels.ProducerScope) r3
                kotlinx.coroutines.channels.ReceiveChannel<E> r0 = r9.$this_takeWhile
                kotlinx.coroutines.channels.ChannelIterator r8 = r0.iterator()
                goto L1c
            L8f:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            L97:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C14181.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1 */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C14191<E, C extends SendChannel<? super E>> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C14191(Continuation<? super C14191> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            int i2 = this.label;
            this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
            return ChannelsKt.toChannel(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1 */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C14201<E, C extends Collection<? super E>> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C14201(Continuation<? super C14201> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            int i2 = this.label;
            this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
            return ChannelsKt.toCollection(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2 */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2<K, V, M extends Map<? super K, ? super V>> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt.toMap(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,i\bӵLc\u000b\u0004I\u0006F\u000b<Ȑ\u0017\"Z\u0011\u0018\tlʑG0lqX6bY:\u0011{{z$\n& D\u0002]"}, d2 = {"\n`]<a@F])\rS", "", "\u0013", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u0010Bc|05m#\u001cKMFk\n", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E$\n\u0016\u0017Zo\r-r,EYS"}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C14211<E> extends SuspendLambda implements Function2<ProducerScope<? super IndexedValue<? extends E>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ ReceiveChannel<E> $this_withIndex;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C14211(ReceiveChannel<? extends E> receiveChannel, Continuation<? super C14211> continuation) {
            super(2, continuation);
            this.$this_withIndex = receiveChannel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C14211 c14211 = new C14211(this.$this_withIndex, continuation);
            c14211.L$0 = obj;
            return c14211;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ProducerScope<? super IndexedValue<? extends E>> producerScope, Continuation<? super Unit> continuation) {
            return ((C14211) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0060 -> B:30:0x001b). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r9.label
                r7 = 2
                r6 = 1
                if (r0 == 0) goto L62
                if (r0 == r6) goto L2e
                if (r0 != r7) goto L71
                int r5 = r9.I$0
                java.lang.Object r4 = r9.L$1
                kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
                java.lang.Object r3 = r9.L$0
                kotlinx.coroutines.channels.ProducerScope r3 = (kotlinx.coroutines.channels.ProducerScope) r3
                kotlin.ResultKt.throwOnFailure(r10)
            L1b:
                r0 = r9
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                r9.L$0 = r3
                r9.L$1 = r4
                r9.I$0 = r5
                r9.label = r6
                java.lang.Object r10 = r4.hasNext(r0)
                if (r10 != r8) goto L2d
                return r8
            L2d:
                goto L3b
            L2e:
                int r5 = r9.I$0
                java.lang.Object r4 = r9.L$1
                kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
                java.lang.Object r3 = r9.L$0
                kotlinx.coroutines.channels.ProducerScope r3 = (kotlinx.coroutines.channels.ProducerScope) r3
                kotlin.ResultKt.throwOnFailure(r10)
            L3b:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r0 = r10.booleanValue()
                if (r0 == 0) goto L79
                java.lang.Object r0 = r4.next()
                kotlin.collections.IndexedValue r2 = new kotlin.collections.IndexedValue
                int r1 = r5 + 1
                r2.<init>(r5, r0)
                r0 = r9
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                r9.L$0 = r3
                r9.L$1 = r4
                r9.I$0 = r1
                r9.label = r7
                java.lang.Object r0 = r3.send(r2, r0)
                if (r0 != r8) goto L60
                return r8
            L60:
                r5 = r1
                goto L1b
            L62:
                kotlin.ResultKt.throwOnFailure(r10)
                java.lang.Object r3 = r9.L$0
                kotlinx.coroutines.channels.ProducerScope r3 = (kotlinx.coroutines.channels.ProducerScope) r3
                kotlinx.coroutines.channels.ReceiveChannel<E> r0 = r9.$this_withIndex
                kotlinx.coroutines.channels.ChannelIterator r4 = r0.iterator()
                r5 = 0
                goto L1b
            L71:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            L79:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C14211.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bӵLc\u000b\u0004OيH\u000b\\A\u001f$2ߚ\u0006\u0007\u000fpI2Te\u000f.\u0001Tp\u0017"}, d2 = {"\n`]<a@F])\rS", "", "$", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u0010Bc|05m#\u001cKMFk\n"}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C14222<V> extends SuspendLambda implements Function2<ProducerScope<? super V>, Continuation<? super Unit>, Object> {
        final /* synthetic */ ReceiveChannel<R> $other;
        final /* synthetic */ ReceiveChannel<E> $this_zip;
        final /* synthetic */ Function2<E, R, V> $transform;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C14222(ReceiveChannel<? extends R> receiveChannel, ReceiveChannel<? extends E> receiveChannel2, Function2<? super E, ? super R, ? extends V> function2, Continuation<? super C14222> continuation) {
            super(2, continuation);
            this.$other = receiveChannel;
            this.$this_zip = receiveChannel2;
            this.$transform = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C14222 c14222 = new C14222(this.$other, this.$this_zip, this.$transform, continuation);
            c14222.L$0 = obj;
            return c14222;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ProducerScope<? super V> producerScope, Continuation<? super Unit> continuation) {
            return ((C14222) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:76:0x0099 A[Catch: all -> 0x00e4, TryCatch #0 {all -> 0x00e4, blocks: (B:74:0x0091, B:76:0x0099, B:89:0x00dc, B:66:0x0049), top: B:99:0x0049 }] */
        /* JADX WARN: Removed duplicated region for block: B:83:0x00bc A[Catch: all -> 0x00da, TryCatch #3 {all -> 0x00da, blocks: (B:81:0x00b4, B:83:0x00bc), top: B:105:0x00b4 }] */
        /* JADX WARN: Removed duplicated region for block: B:86:0x00d9  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x00dc A[Catch: all -> 0x00e4, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00e4, blocks: (B:74:0x0091, B:76:0x0099, B:89:0x00dc, B:66:0x0049), top: B:99:0x0049 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 237
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C14222.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x002b  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "\u0005O\n6\u0004\u000eTZgT8{d\u001e.WhU\u001d@")
    @yg.InterfaceC1492Gx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object any(kotlinx.coroutines.channels.ReceiveChannel r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.AnonymousClass1
            if (r0 == 0) goto L2b
            r4 = r6
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$any$1 r4 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.AnonymousClass1) r4
            int r0 = r4.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = (-1) - r0
            int r0 = (-1) - r2
            r1 = r1 | r0
            int r0 = (-1) - r1
            if (r0 == 0) goto L2b
            int r0 = r4.label
            int r0 = r0 - r2
            r4.label = r0
        L19:
            java.lang.Object r3 = r4.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L3d
            if (r0 != r1) goto L35
            java.lang.Object r5 = r4.L$0
            kotlinx.coroutines.channels.ReceiveChannel r5 = (kotlinx.coroutines.channels.ReceiveChannel) r5
            goto L31
        L2b:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$any$1 r4 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$any$1
            r4.<init>(r6)
            goto L19
        L31:
            kotlin.ResultKt.throwOnFailure(r3)     // Catch: java.lang.Throwable -> L54
            goto L4f
        L35:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L3d:
            kotlin.ResultKt.throwOnFailure(r3)
            kotlinx.coroutines.channels.ChannelIterator r0 = r5.iterator()     // Catch: java.lang.Throwable -> L54
            r4.L$0 = r5     // Catch: java.lang.Throwable -> L54
            r4.label = r1     // Catch: java.lang.Throwable -> L54
            java.lang.Object r3 = r0.hasNext(r4)     // Catch: java.lang.Throwable -> L54
            if (r3 != r2) goto L4f
            return r2
        L4f:
            r0 = 0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r0)
            return r3
        L54:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L56
        L56:
            r0 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.any(kotlinx.coroutines.channels.ReceiveChannel, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\u0005X\u000b6uw\u0016jl*0{^#1Z\u001cU\u001cf\tm\u001cd{Io~Sxcov\fxJR\u001cn:\\-HLQeR9\u0015`IMjB\u001a\u001e\u001b^SE)zs\u000b\u0006K}F[W\r\nd'\u001a;[%O\u000bP@<6W")
    @InterfaceC1492Gx
    public static final <E, R> R consume(BroadcastChannel<E> broadcastChannel, Function1<? super ReceiveChannel<? extends E>, ? extends R> function1) {
        ReceiveChannel<E> receiveChannelOpenSubscription = broadcastChannel.openSubscription();
        try {
            return function1.invoke(receiveChannelOpenSubscription);
        } finally {
            InlineMarker.finallyStart(1);
            ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) receiveChannelOpenSubscription, (CancellationException) null, 1, (Object) null);
            InlineMarker.finallyEnd(1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0062 A[Catch: all -> 0x0078, TryCatch #0 {all -> 0x0078, blocks: (B:63:0x005a, B:65:0x0062, B:66:0x006a), top: B:78:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x006a A[Catch: all -> 0x0078, TRY_LEAVE, TryCatch #0 {all -> 0x0078, blocks: (B:63:0x005a, B:65:0x0062, B:66:0x006a), top: B:78:0x005a }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0057 -> B:78:0x005a). Please report as a decompilation issue!!! */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "\u0005X\u000b6uw\u0016jl*0{^#1Z\u001cU\u001cf\tm\u001cd{Io~Sxcov\fxJR\u001cn:\\-HLQeR9\u0015`IMjB\u001a\u001e\u001b^SE)zs\u000b\u0006K}F[W\r\nd'\u001a;[%O\u000bP@<6W")
    @yg.InterfaceC1492Gx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <E> java.lang.Object consumeEach(kotlinx.coroutines.channels.BroadcastChannel<E> r7, kotlin.jvm.functions.Function1<? super E, kotlin.Unit> r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C13891
            if (r0 == 0) goto L2e
            r6 = r9
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$consumeEach$1 r6 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C13891) r6
            int r0 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2e
            int r0 = r6.label
            int r0 = r0 - r1
            r6.label = r0
        L13:
            java.lang.Object r0 = r6.result
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            r4 = 0
            r3 = 1
            if (r1 == 0) goto L40
            if (r1 != r3) goto L38
            java.lang.Object r1 = r6.L$2
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r2 = r6.L$1
            kotlinx.coroutines.channels.ReceiveChannel r2 = (kotlinx.coroutines.channels.ReceiveChannel) r2
            java.lang.Object r8 = r6.L$0
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            goto L34
        L2e:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$consumeEach$1 r6 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$consumeEach$1
            r6.<init>(r9)
            goto L13
        L34:
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L7e
            goto L5a
        L38:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L40:
            kotlin.ResultKt.throwOnFailure(r0)
            kotlinx.coroutines.channels.ReceiveChannel r2 = r7.openSubscription()
            kotlinx.coroutines.channels.ChannelIterator r1 = r2.iterator()     // Catch: java.lang.Throwable -> L7c
        L4b:
            r6.L$0 = r8     // Catch: java.lang.Throwable -> L7a
            r6.L$1 = r2     // Catch: java.lang.Throwable -> L7a
            r6.L$2 = r1     // Catch: java.lang.Throwable -> L7a
            r6.label = r3     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r0 = r1.hasNext(r6)     // Catch: java.lang.Throwable -> L7a
            if (r0 != r5) goto L5a
            return r5
        L5a:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L78
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L6a
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> L78
            r8.invoke(r0)     // Catch: java.lang.Throwable -> L78
            goto L4b
        L6a:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L78
            kotlin.jvm.internal.InlineMarker.finallyStart(r3)
            kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default(r2, r4, r3, r4)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r3)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L78:
            r0 = move-exception
            goto L7f
        L7a:
            r0 = move-exception
            goto L7f
        L7c:
            r0 = move-exception
            goto L7f
        L7e:
            r0 = move-exception
        L7f:
            kotlin.jvm.internal.InlineMarker.finallyStart(r3)
            kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default(r2, r4, r3, r4)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.consumeEach(kotlinx.coroutines.channels.BroadcastChannel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\u0005X\u000b6uw\u0016jl*0{^#1Z\u001cU\u001cf\tm\u001cd{Io~Sxcov\fxJR\u001cn:\\-HLQeR9\u0015`IMjB\u001a\u001e\u001b^SE)zs\u000b\u0006K}F[W\r\nd'\u001a;[%O\u000bP@<6W")
    @InterfaceC1492Gx
    private static final <E> Object consumeEach$$forInline(BroadcastChannel<E> broadcastChannel, Function1<? super E, Unit> function1, Continuation<? super Unit> continuation) {
        ReceiveChannel<E> receiveChannelOpenSubscription = broadcastChannel.openSubscription();
        try {
            ReceiveChannel<E> receiveChannel = receiveChannelOpenSubscription;
            ChannelIterator<E> it = receiveChannelOpenSubscription.iterator();
            while (true) {
                InlineMarker.mark(3);
                InlineMarker.mark(0);
                Object objHasNext = it.hasNext(null);
                InlineMarker.mark(1);
                if (!((Boolean) objHasNext).booleanValue()) {
                    Unit unit = Unit.INSTANCE;
                    InlineMarker.finallyStart(1);
                    ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) receiveChannelOpenSubscription, (CancellationException) null, 1, (Object) null);
                    InlineMarker.finallyEnd(1);
                    return Unit.INSTANCE;
                }
                function1.invoke(it.next());
            }
        } catch (Throwable th) {
            InlineMarker.finallyStart(1);
            ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) receiveChannelOpenSubscription, (CancellationException) null, 1, (Object) null);
            InlineMarker.finallyEnd(1);
            throw th;
        }
    }

    public static final Function1<Throwable, Unit> consumes(final ReceiveChannel<?> receiveChannel) {
        return new Function1() { // from class: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChannelsKt__DeprecatedKt.consumes$lambda$24$ChannelsKt__DeprecatedKt(receiveChannel, (Throwable) obj);
            }
        };
    }

    public static final Unit consumes$lambda$24$ChannelsKt__DeprecatedKt(ReceiveChannel receiveChannel, Throwable th) {
        ChannelsKt.cancelConsumed(receiveChannel, th);
        return Unit.INSTANCE;
    }

    public static final Function1<Throwable, Unit> consumesAll(final ReceiveChannel<?>... receiveChannelArr) {
        return new Function1() { // from class: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChannelsKt__DeprecatedKt.consumesAll$lambda$2$ChannelsKt__DeprecatedKt(receiveChannelArr, (Throwable) obj);
            }
        };
    }

    public static final Unit consumesAll$lambda$2$ChannelsKt__DeprecatedKt(ReceiveChannel[] receiveChannelArr, Throwable th) throws Throwable {
        Throwable th2 = null;
        for (ReceiveChannel receiveChannel : receiveChannelArr) {
            try {
                ChannelsKt.cancelConsumed(receiveChannel, th);
            } catch (Throwable th3) {
                if (th2 == null) {
                    th2 = th3;
                } else {
                    ExceptionsKt.addSuppressed(th2, th3);
                }
            }
        }
        if (th2 == null) {
            return Unit.INSTANCE;
        }
        throw th2;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0063 A[Catch: all -> 0x0078, TryCatch #0 {all -> 0x0078, blocks: (B:64:0x0058, B:65:0x005b, B:67:0x0063, B:68:0x006c), top: B:80:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x006c A[Catch: all -> 0x0078, TRY_LEAVE, TryCatch #0 {all -> 0x0078, blocks: (B:64:0x0058, B:65:0x005b, B:67:0x0063, B:68:0x006c), top: B:80:0x0058 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0057 -> B:65:0x005b). Please report as a decompilation issue!!! */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "\u0005O\n6\u0004\u000eTZgT8{d\u001e.WhU\u001d@")
    @yg.InterfaceC1492Gx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object count(kotlinx.coroutines.channels.ReceiveChannel r7, kotlin.coroutines.Continuation r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C13901
            if (r0 == 0) goto L2e
            r6 = r8
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$count$1 r6 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C13901) r6
            int r0 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2e
            int r0 = r6.label
            int r0 = r0 - r1
            r6.label = r0
        L13:
            java.lang.Object r0 = r6.result
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            r4 = 0
            r3 = 1
            if (r1 == 0) goto L3c
            if (r1 != r3) goto L34
            java.lang.Object r2 = r6.L$2
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r7 = r6.L$1
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r1 = r6.L$0
            kotlin.jvm.internal.Ref$IntRef r1 = (kotlin.jvm.internal.Ref.IntRef) r1
            goto L58
        L2e:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$count$1 r6 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$count$1
            r6.<init>(r8)
            goto L13
        L34:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L3c:
            kotlin.ResultKt.throwOnFailure(r0)
            kotlin.jvm.internal.Ref$IntRef r1 = new kotlin.jvm.internal.Ref$IntRef
            r1.<init>()
            kotlinx.coroutines.channels.ChannelIterator r2 = r7.iterator()     // Catch: java.lang.Throwable -> L7c
        L48:
            r6.L$0 = r1     // Catch: java.lang.Throwable -> L7a
            r6.L$1 = r7     // Catch: java.lang.Throwable -> L7a
            r6.L$2 = r2     // Catch: java.lang.Throwable -> L7a
            r6.label = r3     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r0 = r2.hasNext(r6)     // Catch: java.lang.Throwable -> L7a
            if (r0 != r5) goto L57
            return r5
        L57:
            goto L5b
        L58:
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L78
        L5b:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L78
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L6c
            r2.next()     // Catch: java.lang.Throwable -> L78
            int r0 = r1.element     // Catch: java.lang.Throwable -> L78
            int r0 = r0 + r3
            r1.element = r0     // Catch: java.lang.Throwable -> L78
            goto L48
        L6c:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L78
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r4)
            int r0 = r1.element
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)
            return r0
        L78:
            r1 = move-exception
            goto L7d
        L7a:
            r1 = move-exception
            goto L7d
        L7c:
            r1 = move-exception
        L7d:
            throw r1     // Catch: java.lang.Throwable -> L7e
        L7e:
            r0 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.count(kotlinx.coroutines.channels.ReceiveChannel, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final <E, K> ReceiveChannel<E> distinctBy(ReceiveChannel<? extends E> receiveChannel, CoroutineContext coroutineContext, Function2<? super E, ? super Continuation<? super K>, ? extends Object> function2) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, coroutineContext, 0, null, ChannelsKt.consumes(receiveChannel), new C13921(receiveChannel, function2, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel distinctBy$default(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function2 function2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        return ChannelsKt.distinctBy(receiveChannel, coroutineContext, function2);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0005O\n6\u0004\u000eTZgT8{d\u001e.WhU\u001d@")
    @InterfaceC1492Gx
    public static final /* synthetic */ ReceiveChannel drop(ReceiveChannel receiveChannel, int i2, CoroutineContext coroutineContext) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, coroutineContext, 0, null, ChannelsKt.consumes(receiveChannel), new C13931(i2, receiveChannel, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel drop$default(ReceiveChannel receiveChannel, int i2, CoroutineContext coroutineContext, int i3, Object obj) {
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        return drop(receiveChannel, i2, coroutineContext);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0005O\n6\u0004\u000eTZgT8{d\u001e.WhU\u001d@")
    @InterfaceC1492Gx
    public static final /* synthetic */ ReceiveChannel dropWhile(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function2 function2) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, coroutineContext, 0, null, ChannelsKt.consumes(receiveChannel), new C13941(receiveChannel, function2, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel dropWhile$default(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function2 function2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        return dropWhile(receiveChannel, coroutineContext, function2);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0085 A[Catch: all -> 0x00ae, TryCatch #2 {all -> 0x00ae, blocks: (B:70:0x007a, B:71:0x007d, B:73:0x0085, B:78:0x0093, B:79:0x00ad), top: B:90:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0093 A[Catch: all -> 0x00ae, TRY_ENTER, TryCatch #2 {all -> 0x00ae, blocks: (B:70:0x007a, B:71:0x007d, B:73:0x0085, B:78:0x0093, B:79:0x00ad), top: B:90:0x007a }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0079 -> B:71:0x007d). Please report as a decompilation issue!!! */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "\u0005O\n6\u0004\u000eTZgT8{d\u001e.WhU\u001d@")
    @yg.InterfaceC1492Gx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object elementAt(kotlinx.coroutines.channels.ReceiveChannel r10, int r11, kotlin.coroutines.Continuation r12) {
        /*
            boolean r0 = r12 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C13951
            if (r0 == 0) goto L38
            r9 = r12
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1 r9 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C13951) r9
            int r0 = r9.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = (-1) - r0
            int r0 = (-1) - r2
            r1 = r1 | r0
            int r0 = (-1) - r1
            if (r0 == 0) goto L38
            int r0 = r9.label
            int r0 = r0 - r2
            r9.label = r0
        L19:
            java.lang.Object r0 = r9.result
            java.lang.Object r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.label
            r4 = 46
            r7 = 0
            r6 = 1
            java.lang.String r5 = "ReceiveChannel doesn't contain element at index "
            if (r1 == 0) goto L46
            if (r1 != r6) goto L3e
            int r2 = r9.I$1
            int r11 = r9.I$0
            java.lang.Object r3 = r9.L$1
            kotlinx.coroutines.channels.ChannelIterator r3 = (kotlinx.coroutines.channels.ChannelIterator) r3
            java.lang.Object r10 = r9.L$0
            kotlinx.coroutines.channels.ReceiveChannel r10 = (kotlinx.coroutines.channels.ReceiveChannel) r10
            goto L7a
        L38:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1 r9 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1
            r9.<init>(r12)
            goto L19
        L3e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L46:
            kotlin.ResultKt.throwOnFailure(r0)
            if (r11 < 0) goto L4c
            goto L63
        L4c:
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException     // Catch: java.lang.Throwable -> Lb0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb0
            r0.<init>(r5)     // Catch: java.lang.Throwable -> Lb0
            java.lang.StringBuilder r0 = r0.append(r11)     // Catch: java.lang.Throwable -> Lb0
            java.lang.StringBuilder r0 = r0.append(r4)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lb0
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lb0
            throw r1     // Catch: java.lang.Throwable -> Lb0
        L63:
            kotlinx.coroutines.channels.ChannelIterator r3 = r10.iterator()     // Catch: java.lang.Throwable -> Lb0
            r2 = 0
        L68:
            r9.L$0 = r10     // Catch: java.lang.Throwable -> Lb0
            r9.L$1 = r3     // Catch: java.lang.Throwable -> Lb0
            r9.I$0 = r11     // Catch: java.lang.Throwable -> Lb0
            r9.I$1 = r2     // Catch: java.lang.Throwable -> Lb0
            r9.label = r6     // Catch: java.lang.Throwable -> Lb0
            java.lang.Object r0 = r3.hasNext(r9)     // Catch: java.lang.Throwable -> Lb0
            if (r0 != r8) goto L79
            return r8
        L79:
            goto L7d
        L7a:
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> Lae
        L7d:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> Lae
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> Lae
            if (r0 == 0) goto L93
            java.lang.Object r1 = r3.next()     // Catch: java.lang.Throwable -> Lae
            int r0 = r2 + 1
            if (r11 != r2) goto L91
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r10, r7)
            return r1
        L91:
            r2 = r0
            goto L68
        L93:
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException     // Catch: java.lang.Throwable -> Lae
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lae
            r0.<init>()     // Catch: java.lang.Throwable -> Lae
            java.lang.StringBuilder r0 = r0.append(r5)     // Catch: java.lang.Throwable -> Lae
            java.lang.StringBuilder r0 = r0.append(r11)     // Catch: java.lang.Throwable -> Lae
            java.lang.StringBuilder r0 = r0.append(r4)     // Catch: java.lang.Throwable -> Lae
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lae
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lae
            throw r1     // Catch: java.lang.Throwable -> Lae
        Lae:
            r1 = move-exception
            goto Lb1
        Lb0:
            r1 = move-exception
        Lb1:
            throw r1     // Catch: java.lang.Throwable -> Lb2
        Lb2:
            r0 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r10, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.elementAt(kotlinx.coroutines.channels.ReceiveChannel, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0071 A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:71:0x0069, B:73:0x0071, B:68:0x0058, B:67:0x0052), top: B:86:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0080 A[DONT_GENERATE] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0066 -> B:71:0x0069). Please report as a decompilation issue!!! */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "\u0005O\n6\u0004\u000eTZgT8{d\u001e.WhU\u001d@")
    @yg.InterfaceC1492Gx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object elementAtOrNull(kotlinx.coroutines.channels.ReceiveChannel r9, int r10, kotlin.coroutines.Continuation r11) {
        /*
            boolean r0 = r11 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C13961
            if (r0 == 0) goto L34
            r8 = r11
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1 r8 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C13961) r8
            int r0 = r8.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = (-1) - r0
            int r0 = (-1) - r2
            r1 = r1 | r0
            int r0 = (-1) - r1
            if (r0 == 0) goto L34
            int r0 = r8.label
            int r0 = r0 - r2
            r8.label = r0
        L19:
            java.lang.Object r1 = r8.result
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r8.label
            r6 = 1
            r5 = 0
            if (r0 == 0) goto L49
            if (r0 != r6) goto L41
            int r4 = r8.I$1
            int r10 = r8.I$0
            java.lang.Object r3 = r8.L$1
            kotlinx.coroutines.channels.ChannelIterator r3 = (kotlinx.coroutines.channels.ChannelIterator) r3
            java.lang.Object r9 = r8.L$0
            kotlinx.coroutines.channels.ReceiveChannel r9 = (kotlinx.coroutines.channels.ReceiveChannel) r9
            goto L3a
        L34:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1 r8 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1
            r8.<init>(r11)
            goto L19
        L3a:
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Throwable -> L3f
            r0 = r5
            goto L69
        L3f:
            r1 = move-exception
            goto L85
        L41:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L49:
            kotlin.ResultKt.throwOnFailure(r1)
            if (r10 >= 0) goto L52
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r9, r5)
            return r5
        L52:
            kotlinx.coroutines.channels.ChannelIterator r3 = r9.iterator()     // Catch: java.lang.Throwable -> L84
            r4 = 0
            r0 = r5
        L58:
            r8.L$0 = r9     // Catch: java.lang.Throwable -> L84
            r8.L$1 = r3     // Catch: java.lang.Throwable -> L84
            r8.I$0 = r10     // Catch: java.lang.Throwable -> L84
            r8.I$1 = r4     // Catch: java.lang.Throwable -> L84
            r8.label = r6     // Catch: java.lang.Throwable -> L84
            java.lang.Object r1 = r3.hasNext(r8)     // Catch: java.lang.Throwable -> L84
            if (r1 != r7) goto L69
            goto L7f
        L69:
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L84
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L84
            if (r1 == 0) goto L80
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Throwable -> L84
            int r1 = r4 + 1
            if (r10 != r4) goto L7d
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r9, r0)
            return r2
        L7d:
            r4 = r1
            goto L58
        L7f:
            return r7
        L80:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r9, r0)
            return r5
        L84:
            r1 = move-exception
        L85:
            throw r1     // Catch: java.lang.Throwable -> L86
        L86:
            r0 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r9, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.elementAtOrNull(kotlinx.coroutines.channels.ReceiveChannel, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final <E> ReceiveChannel<E> filter(ReceiveChannel<? extends E> receiveChannel, CoroutineContext coroutineContext, Function2<? super E, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, coroutineContext, 0, null, ChannelsKt.consumes(receiveChannel), new C13971(receiveChannel, function2, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel filter$default(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function2 function2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        return ChannelsKt.filter(receiveChannel, coroutineContext, function2);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0005O\n6\u0004\u000eTZgT8{d\u001e.WhU\u001d@")
    @InterfaceC1492Gx
    public static final /* synthetic */ ReceiveChannel filterIndexed(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function3 function3) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, coroutineContext, 0, null, ChannelsKt.consumes(receiveChannel), new C13981(receiveChannel, function3, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel filterIndexed$default(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function3 function3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        return filterIndexed(receiveChannel, coroutineContext, function3);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0005O\n6\u0004\u000eTZgT8{d\u001e.WhU\u001d@")
    @InterfaceC1492Gx
    public static final /* synthetic */ ReceiveChannel filterNot(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function2 function2) {
        return ChannelsKt.filter(receiveChannel, coroutineContext, new C13991(function2, null));
    }

    public static /* synthetic */ ReceiveChannel filterNot$default(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function2 function2, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        return filterNot(receiveChannel, coroutineContext, function2);
    }

    public static final <E> ReceiveChannel<E> filterNotNull(ReceiveChannel<? extends E> receiveChannel) {
        ReceiveChannel<E> receiveChannelFilter$default = filter$default(receiveChannel, null, new C14001(null), 1, null);
        Intrinsics.checkNotNull(receiveChannelFilter$default, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveChannel<E of kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.filterNotNull>");
        return receiveChannelFilter$default;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x005e A[Catch: all -> 0x006f, TryCatch #2 {all -> 0x006f, blocks: (B:64:0x0053, B:65:0x0056, B:67:0x005e, B:69:0x0064, B:60:0x0043, B:72:0x0069), top: B:86:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0069 A[Catch: all -> 0x006f, TRY_LEAVE, TryCatch #2 {all -> 0x006f, blocks: (B:64:0x0053, B:65:0x0056, B:67:0x005e, B:69:0x0064, B:60:0x0043, B:72:0x0069), top: B:86:0x0053 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0052 -> B:65:0x0056). Please report as a decompilation issue!!! */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "\u0005O\n6\u0004\u000eTZgT8{d\u001e.WhU\u001d@")
    @yg.InterfaceC1492Gx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object filterNotNullTo(kotlinx.coroutines.channels.ReceiveChannel r6, java.util.Collection r7, kotlin.coroutines.Continuation r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C14011
            if (r0 == 0) goto L2e
            r5 = r8
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1 r5 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C14011) r5
            int r0 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2e
            int r0 = r5.label
            int r0 = r0 - r1
            r5.label = r0
        L13:
            java.lang.Object r0 = r5.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.label
            r3 = 0
            r2 = 1
            if (r1 == 0) goto L3c
            if (r1 != r2) goto L34
            java.lang.Object r1 = r5.L$2
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r6 = r5.L$1
            kotlinx.coroutines.channels.ReceiveChannel r6 = (kotlinx.coroutines.channels.ReceiveChannel) r6
            java.lang.Object r7 = r5.L$0
            java.util.Collection r7 = (java.util.Collection) r7
            goto L53
        L2e:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1 r5 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1
            r5.<init>(r8)
            goto L13
        L34:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L3c:
            kotlin.ResultKt.throwOnFailure(r0)
            kotlinx.coroutines.channels.ChannelIterator r1 = r6.iterator()     // Catch: java.lang.Throwable -> L71
        L43:
            r5.L$0 = r7     // Catch: java.lang.Throwable -> L6f
            r5.L$1 = r6     // Catch: java.lang.Throwable -> L6f
            r5.L$2 = r1     // Catch: java.lang.Throwable -> L6f
            r5.label = r2     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r0 = r1.hasNext(r5)     // Catch: java.lang.Throwable -> L6f
            if (r0 != r4) goto L52
            goto L68
        L52:
            goto L56
        L53:
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L6f
        L56:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L6f
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L69
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L67
            r7.add(r0)     // Catch: java.lang.Throwable -> L6f
        L67:
            goto L43
        L68:
            return r4
        L69:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L6f
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r3)
            return r7
        L6f:
            r1 = move-exception
            goto L72
        L71:
            r1 = move-exception
        L72:
            throw r1     // Catch: java.lang.Throwable -> L73
        L73:
            r0 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.filterNotNullTo(kotlinx.coroutines.channels.ReceiveChannel, java.util.Collection, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0075 A[Catch: all -> 0x0092, TryCatch #0 {all -> 0x0092, blocks: (B:62:0x003a, B:73:0x006d, B:75:0x0075, B:77:0x007b, B:82:0x008c, B:72:0x006a), top: B:92:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x008c A[Catch: all -> 0x0092, TRY_LEAVE, TryCatch #0 {all -> 0x0092, blocks: (B:62:0x003a, B:73:0x006d, B:75:0x0075, B:77:0x007b, B:82:0x008c, B:72:0x006a), top: B:92:0x0021 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x0079 -> B:80:0x008a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x0087 -> B:80:0x008a). Please report as a decompilation issue!!! */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "\u0005O\n6\u0004\u000eTZgT8{d\u001e.WhU\u001d@")
    @yg.InterfaceC1492Gx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object filterNotNullTo(kotlinx.coroutines.channels.ReceiveChannel r7, kotlinx.coroutines.channels.SendChannel r8, kotlin.coroutines.Continuation r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.AnonymousClass3
            if (r0 == 0) goto L34
            r6 = r9
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3 r6 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.AnonymousClass3) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r2 + r1
            r2 = r2 | r1
            int r0 = r0 - r2
            if (r0 == 0) goto L34
            int r0 = r6.label
            int r0 = r0 - r1
            r6.label = r0
        L16:
            java.lang.Object r0 = r6.result
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            r4 = 2
            r3 = 1
            r2 = 0
            if (r1 == 0) goto L53
            if (r1 == r3) goto L46
            if (r1 != r4) goto L3e
            java.lang.Object r1 = r6.L$2
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r7 = r6.L$1
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r8 = r6.L$0
            kotlinx.coroutines.channels.SendChannel r8 = (kotlinx.coroutines.channels.SendChannel) r8
            goto L3a
        L34:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3 r6 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3
            r6.<init>(r9)
            goto L16
        L3a:
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L92
            goto L8a
        L3e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L46:
            java.lang.Object r1 = r6.L$2
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r7 = r6.L$1
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r8 = r6.L$0
            kotlinx.coroutines.channels.SendChannel r8 = (kotlinx.coroutines.channels.SendChannel) r8
            goto L6a
        L53:
            kotlin.ResultKt.throwOnFailure(r0)
            kotlinx.coroutines.channels.ChannelIterator r1 = r7.iterator()     // Catch: java.lang.Throwable -> L94
        L5a:
            r6.L$0 = r8     // Catch: java.lang.Throwable -> L94
            r6.L$1 = r7     // Catch: java.lang.Throwable -> L94
            r6.L$2 = r1     // Catch: java.lang.Throwable -> L94
            r6.label = r3     // Catch: java.lang.Throwable -> L94
            java.lang.Object r0 = r1.hasNext(r6)     // Catch: java.lang.Throwable -> L94
            if (r0 != r5) goto L69
            return r5
        L69:
            goto L6d
        L6a:
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L92
        L6d:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L92
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L92
            if (r0 == 0) goto L8c
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> L92
            if (r0 == 0) goto L8a
            r6.L$0 = r8     // Catch: java.lang.Throwable -> L92
            r6.L$1 = r7     // Catch: java.lang.Throwable -> L92
            r6.L$2 = r1     // Catch: java.lang.Throwable -> L92
            r6.label = r4     // Catch: java.lang.Throwable -> L92
            java.lang.Object r0 = r8.send(r0, r6)     // Catch: java.lang.Throwable -> L92
            if (r0 != r5) goto L8a
            goto L8b
        L8a:
            goto L5a
        L8b:
            return r5
        L8c:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L92
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r2)
            return r8
        L92:
            r1 = move-exception
            goto L95
        L94:
            r1 = move-exception
        L95:
            throw r1     // Catch: java.lang.Throwable -> L96
        L96:
            r0 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.filterNotNullTo(kotlinx.coroutines.channels.ReceiveChannel, kotlinx.coroutines.channels.SendChannel, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x005a A[Catch: all -> 0x006b, TRY_LEAVE, TryCatch #0 {all -> 0x006b, blocks: (B:58:0x004f, B:59:0x0052, B:61:0x005a, B:64:0x0063, B:65:0x006a), top: B:73:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0063 A[Catch: all -> 0x006b, TRY_ENTER, TryCatch #0 {all -> 0x006b, blocks: (B:58:0x004f, B:59:0x0052, B:61:0x005a, B:64:0x0063, B:65:0x006a), top: B:73:0x004f }] */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "\u0005O\n6\u0004\u000eTZgT8{d\u001e.WhU\u001d@")
    @yg.InterfaceC1492Gx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object first(kotlinx.coroutines.channels.ReceiveChannel r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C14021
            if (r0 == 0) goto L2c
            r4 = r6
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$first$1 r4 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C14021) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r2 + r1
            r2 = r2 | r1
            int r0 = r0 - r2
            if (r0 == 0) goto L2c
            int r0 = r4.label
            int r0 = r0 - r1
            r4.label = r0
        L16:
            java.lang.Object r0 = r4.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L32
            java.lang.Object r1 = r4.L$1
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r5 = r4.L$0
            kotlinx.coroutines.channels.ReceiveChannel r5 = (kotlinx.coroutines.channels.ReceiveChannel) r5
            goto L4f
        L2c:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$first$1 r4 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$first$1
            r4.<init>(r6)
            goto L16
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L3a:
            kotlin.ResultKt.throwOnFailure(r0)
            kotlinx.coroutines.channels.ChannelIterator r1 = r5.iterator()     // Catch: java.lang.Throwable -> L6d
            r4.L$0 = r5     // Catch: java.lang.Throwable -> L6d
            r4.L$1 = r1     // Catch: java.lang.Throwable -> L6d
            r4.label = r2     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r0 = r1.hasNext(r4)     // Catch: java.lang.Throwable -> L6d
            if (r0 != r3) goto L4e
            return r3
        L4e:
            goto L52
        L4f:
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L6b
        L52:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L6b
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L6b
            if (r0 == 0) goto L63
            java.lang.Object r1 = r1.next()     // Catch: java.lang.Throwable -> L6b
            r0 = 0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r0)
            return r1
        L63:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L6b
            java.lang.String r0 = "ReceiveChannel is empty."
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L6b
            throw r1     // Catch: java.lang.Throwable -> L6b
        L6b:
            r1 = move-exception
            goto L6e
        L6d:
            r1 = move-exception
        L6e:
            throw r1     // Catch: java.lang.Throwable -> L6f
        L6f:
            r0 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.first(kotlinx.coroutines.channels.ReceiveChannel, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0029  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "\u0005O\n6\u0004\u000eTZgT8{d\u001e.WhU\u001d@")
    @yg.InterfaceC1492Gx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object firstOrNull(kotlinx.coroutines.channels.ReceiveChannel r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C14031
            if (r0 == 0) goto L29
            r4 = r6
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$firstOrNull$1 r4 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C14031) r4
            int r0 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L29
            int r0 = r4.label
            int r0 = r0 - r1
            r4.label = r0
        L13:
            java.lang.Object r0 = r4.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r4.label
            r1 = 1
            if (r2 == 0) goto L37
            if (r2 != r1) goto L2f
            java.lang.Object r2 = r4.L$1
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r5 = r4.L$0
            kotlinx.coroutines.channels.ReceiveChannel r5 = (kotlinx.coroutines.channels.ReceiveChannel) r5
            goto L4c
        L29:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$firstOrNull$1 r4 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$firstOrNull$1
            r4.<init>(r6)
            goto L13
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L37:
            kotlin.ResultKt.throwOnFailure(r0)
            kotlinx.coroutines.channels.ChannelIterator r2 = r5.iterator()     // Catch: java.lang.Throwable -> L66
            r4.L$0 = r5     // Catch: java.lang.Throwable -> L66
            r4.L$1 = r2     // Catch: java.lang.Throwable -> L66
            r4.label = r1     // Catch: java.lang.Throwable -> L66
            java.lang.Object r0 = r2.hasNext(r4)     // Catch: java.lang.Throwable -> L66
            if (r0 != r3) goto L4b
            return r3
        L4b:
            goto L4f
        L4c:
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L64
        L4f:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L64
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L64
            r1 = 0
            if (r0 != 0) goto L5c
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r1)
            return r1
        L5c:
            java.lang.Object r0 = r2.next()     // Catch: java.lang.Throwable -> L64
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r1)
            return r0
        L64:
            r1 = move-exception
            goto L67
        L66:
            r1 = move-exception
        L67:
            throw r1     // Catch: java.lang.Throwable -> L68
        L68:
            r0 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.firstOrNull(kotlinx.coroutines.channels.ReceiveChannel, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0005O\n6\u0004\u000eTZgT8{d\u001e.WhU\u001d@")
    @InterfaceC1492Gx
    public static final /* synthetic */ ReceiveChannel flatMap(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function2 function2) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, coroutineContext, 0, null, ChannelsKt.consumes(receiveChannel), new C14041(receiveChannel, function2, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel flatMap$default(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function2 function2, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        return flatMap(receiveChannel, coroutineContext, function2);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0067 A[Catch: all -> 0x008e, TryCatch #2 {all -> 0x008e, blocks: (B:65:0x005c, B:66:0x005f, B:68:0x0067, B:70:0x0071, B:71:0x0078, B:61:0x004a, B:75:0x0083), top: B:89:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0083 A[Catch: all -> 0x008e, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x008e, blocks: (B:65:0x005c, B:66:0x005f, B:68:0x0067, B:70:0x0071, B:71:0x0078, B:61:0x004a, B:75:0x0083), top: B:89:0x005c }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x005b -> B:66:0x005f). Please report as a decompilation issue!!! */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "\u0005O\n6\u0004\u000eTZgT8{d\u001e.WhU\u001d@")
    @yg.InterfaceC1492Gx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object indexOf(kotlinx.coroutines.channels.ReceiveChannel r7, java.lang.Object r8, kotlin.coroutines.Continuation r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C14051
            if (r0 == 0) goto L30
            r6 = r9
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$indexOf$1 r6 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C14051) r6
            int r0 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L30
            int r0 = r6.label
            int r0 = r0 - r1
            r6.label = r0
        L13:
            java.lang.Object r0 = r6.result
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            r4 = 0
            r3 = 1
            if (r1 == 0) goto L3e
            if (r1 != r3) goto L36
            java.lang.Object r2 = r6.L$3
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r7 = r6.L$2
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r1 = r6.L$1
            kotlin.jvm.internal.Ref$IntRef r1 = (kotlin.jvm.internal.Ref.IntRef) r1
            java.lang.Object r8 = r6.L$0
            goto L5c
        L30:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$indexOf$1 r6 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$indexOf$1
            r6.<init>(r9)
            goto L13
        L36:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L3e:
            kotlin.ResultKt.throwOnFailure(r0)
            kotlin.jvm.internal.Ref$IntRef r1 = new kotlin.jvm.internal.Ref$IntRef
            r1.<init>()
            kotlinx.coroutines.channels.ChannelIterator r2 = r7.iterator()     // Catch: java.lang.Throwable -> L90
        L4a:
            r6.L$0 = r8     // Catch: java.lang.Throwable -> L8e
            r6.L$1 = r1     // Catch: java.lang.Throwable -> L8e
            r6.L$2 = r7     // Catch: java.lang.Throwable -> L8e
            r6.L$3 = r2     // Catch: java.lang.Throwable -> L8e
            r6.label = r3     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r0 = r2.hasNext(r6)     // Catch: java.lang.Throwable -> L8e
            if (r0 != r5) goto L5b
            goto L7e
        L5b:
            goto L5f
        L5c:
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L8e
        L5f:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L8e
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L8e
            if (r0 == 0) goto L83
            java.lang.Object r0 = r2.next()     // Catch: java.lang.Throwable -> L8e
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r0)     // Catch: java.lang.Throwable -> L8e
            if (r0 == 0) goto L78
            int r0 = r1.element     // Catch: java.lang.Throwable -> L8e
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)     // Catch: java.lang.Throwable -> L8e
            goto L7f
        L78:
            int r0 = r1.element     // Catch: java.lang.Throwable -> L8e
            int r0 = r0 + r3
            r1.element = r0     // Catch: java.lang.Throwable -> L8e
            goto L4a
        L7e:
            return r5
        L7f:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r4)
            return r0
        L83:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L8e
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r4)
            r0 = -1
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)
            return r0
        L8e:
            r1 = move-exception
            goto L91
        L90:
            r1 = move-exception
        L91:
            throw r1     // Catch: java.lang.Throwable -> L92
        L92:
            r0 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.indexOf(kotlinx.coroutines.channels.ReceiveChannel, java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0085 A[Catch: all -> 0x008e, TRY_LEAVE, TryCatch #3 {all -> 0x008e, blocks: (B:82:0x007a, B:83:0x007d, B:85:0x0085), top: B:104:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x008a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x0079 -> B:83:0x007d). Please report as a decompilation issue!!! */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "\u0005O\n6\u0004\u000eTZgT8{d\u001e.WhU\u001d@")
    @yg.InterfaceC1492Gx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object last(kotlinx.coroutines.channels.ReceiveChannel r7, kotlin.coroutines.Continuation r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C14061
            if (r0 == 0) goto L2f
            r6 = r8
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1 r6 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C14061) r6
            int r0 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2f
            int r0 = r6.label
            int r0 = r0 - r1
            r6.label = r0
        L13:
            java.lang.Object r0 = r6.result
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r6.label
            r4 = 2
            r1 = 1
            r3 = 0
            if (r2 == 0) goto L46
            if (r2 == r1) goto L3d
            if (r2 != r4) goto L35
            java.lang.Object r1 = r6.L$2
            java.lang.Object r2 = r6.L$1
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r7 = r6.L$0
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            goto L7a
        L2f:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1 r6 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1
            r6.<init>(r8)
            goto L13
        L35:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L3d:
            java.lang.Object r2 = r6.L$1
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r7 = r6.L$0
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            goto L5b
        L46:
            kotlin.ResultKt.throwOnFailure(r0)
            kotlinx.coroutines.channels.ChannelIterator r2 = r7.iterator()     // Catch: java.lang.Throwable -> L9a
            r6.L$0 = r7     // Catch: java.lang.Throwable -> L9a
            r6.L$1 = r2     // Catch: java.lang.Throwable -> L9a
            r6.label = r1     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r0 = r2.hasNext(r6)     // Catch: java.lang.Throwable -> L9a
            if (r0 != r5) goto L5a
            return r5
        L5a:
            goto L5e
        L5b:
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L98
        L5e:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L98
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L98
            if (r0 == 0) goto L90
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> L98
        L6a:
            r6.L$0 = r7     // Catch: java.lang.Throwable -> L9a
            r6.L$1 = r2     // Catch: java.lang.Throwable -> L9a
            r6.L$2 = r1     // Catch: java.lang.Throwable -> L9a
            r6.label = r4     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r0 = r2.hasNext(r6)     // Catch: java.lang.Throwable -> L9a
            if (r0 != r5) goto L79
            return r5
        L79:
            goto L7d
        L7a:
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L8e
        L7d:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L8e
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L8e
            if (r0 == 0) goto L8a
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> L8e
            goto L6a
        L8a:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r3)
            return r1
        L8e:
            r1 = move-exception
            goto L9b
        L90:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L98
            java.lang.String r0 = "ReceiveChannel is empty."
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L98
            throw r1     // Catch: java.lang.Throwable -> L98
        L98:
            r1 = move-exception
            goto L9b
        L9a:
            r1 = move-exception
        L9b:
            throw r1     // Catch: java.lang.Throwable -> L9c
        L9c:
            r0 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.last(kotlinx.coroutines.channels.ReceiveChannel, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0078 A[Catch: all -> 0x0099, TryCatch #0 {all -> 0x0099, blocks: (B:64:0x006d, B:65:0x0070, B:67:0x0078, B:69:0x0082, B:70:0x0086, B:60:0x0059, B:72:0x008d), top: B:82:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x008d A[Catch: all -> 0x0099, TRY_LEAVE, TryCatch #0 {all -> 0x0099, blocks: (B:64:0x006d, B:65:0x0070, B:67:0x0078, B:69:0x0082, B:70:0x0086, B:60:0x0059, B:72:0x008d), top: B:82:0x006d }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x006c -> B:65:0x0070). Please report as a decompilation issue!!! */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "\u0005O\n6\u0004\u000eTZgT8{d\u001e.WhU\u001d@")
    @yg.InterfaceC1492Gx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object lastIndexOf(kotlinx.coroutines.channels.ReceiveChannel r8, java.lang.Object r9, kotlin.coroutines.Continuation r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C14071
            if (r0 == 0) goto L37
            r6 = r10
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastIndexOf$1 r6 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C14071) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r2 + r1
            r2 = r2 | r1
            int r0 = r0 - r2
            if (r0 == 0) goto L37
            int r0 = r6.label
            int r0 = r0 - r1
            r6.label = r0
        L16:
            java.lang.Object r0 = r6.result
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            r5 = 0
            r4 = 1
            if (r1 == 0) goto L45
            if (r1 != r4) goto L3d
            java.lang.Object r3 = r6.L$4
            kotlinx.coroutines.channels.ChannelIterator r3 = (kotlinx.coroutines.channels.ChannelIterator) r3
            java.lang.Object r8 = r6.L$3
            kotlinx.coroutines.channels.ReceiveChannel r8 = (kotlinx.coroutines.channels.ReceiveChannel) r8
            java.lang.Object r2 = r6.L$2
            kotlin.jvm.internal.Ref$IntRef r2 = (kotlin.jvm.internal.Ref.IntRef) r2
            java.lang.Object r1 = r6.L$1
            kotlin.jvm.internal.Ref$IntRef r1 = (kotlin.jvm.internal.Ref.IntRef) r1
            java.lang.Object r9 = r6.L$0
            goto L6d
        L37:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastIndexOf$1 r6 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastIndexOf$1
            r6.<init>(r10)
            goto L16
        L3d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L45:
            kotlin.ResultKt.throwOnFailure(r0)
            kotlin.jvm.internal.Ref$IntRef r1 = new kotlin.jvm.internal.Ref$IntRef
            r1.<init>()
            r0 = -1
            r1.element = r0
            kotlin.jvm.internal.Ref$IntRef r2 = new kotlin.jvm.internal.Ref$IntRef
            r2.<init>()
            kotlinx.coroutines.channels.ChannelIterator r3 = r8.iterator()     // Catch: java.lang.Throwable -> L9b
        L59:
            r6.L$0 = r9     // Catch: java.lang.Throwable -> L99
            r6.L$1 = r1     // Catch: java.lang.Throwable -> L99
            r6.L$2 = r2     // Catch: java.lang.Throwable -> L99
            r6.L$3 = r8     // Catch: java.lang.Throwable -> L99
            r6.L$4 = r3     // Catch: java.lang.Throwable -> L99
            r6.label = r4     // Catch: java.lang.Throwable -> L99
            java.lang.Object r0 = r3.hasNext(r6)     // Catch: java.lang.Throwable -> L99
            if (r0 != r7) goto L6c
            goto L8c
        L6c:
            goto L70
        L6d:
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L99
        L70:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L99
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L99
            if (r0 == 0) goto L8d
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L99
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r9, r0)     // Catch: java.lang.Throwable -> L99
            if (r0 == 0) goto L86
            int r0 = r2.element     // Catch: java.lang.Throwable -> L99
            r1.element = r0     // Catch: java.lang.Throwable -> L99
        L86:
            int r0 = r2.element     // Catch: java.lang.Throwable -> L99
            int r0 = r0 + r4
            r2.element = r0     // Catch: java.lang.Throwable -> L99
            goto L59
        L8c:
            return r7
        L8d:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L99
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r5)
            int r0 = r1.element
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)
            return r0
        L99:
            r1 = move-exception
            goto L9c
        L9b:
            r1 = move-exception
        L9c:
            throw r1     // Catch: java.lang.Throwable -> L9d
        L9d:
            r0 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.lastIndexOf(kotlinx.coroutines.channels.ReceiveChannel, java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x008c A[Catch: all -> 0x0095, TRY_LEAVE, TryCatch #0 {all -> 0x0095, blocks: (B:85:0x0081, B:86:0x0084, B:88:0x008c), top: B:100:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0091  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x0080 -> B:86:0x0084). Please report as a decompilation issue!!! */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "\u0005O\n6\u0004\u000eTZgT8{d\u001e.WhU\u001d@")
    @yg.InterfaceC1492Gx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object lastOrNull(kotlinx.coroutines.channels.ReceiveChannel r7, kotlin.coroutines.Continuation r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C14081
            if (r0 == 0) goto L32
            r6 = r8
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1 r6 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C14081) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r2 + r1
            r2 = r2 | r1
            int r0 = r0 - r2
            if (r0 == 0) goto L32
            int r0 = r6.label
            int r0 = r0 - r1
            r6.label = r0
        L16:
            java.lang.Object r0 = r6.result
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r6.label
            r4 = 2
            r1 = 1
            r3 = 0
            if (r2 == 0) goto L49
            if (r2 == r1) goto L40
            if (r2 != r4) goto L38
            java.lang.Object r1 = r6.L$2
            java.lang.Object r2 = r6.L$1
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r7 = r6.L$0
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            goto L81
        L32:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1 r6 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1
            r6.<init>(r8)
            goto L16
        L38:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L40:
            java.lang.Object r2 = r6.L$1
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r7 = r6.L$0
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            goto L5e
        L49:
            kotlin.ResultKt.throwOnFailure(r0)
            kotlinx.coroutines.channels.ChannelIterator r2 = r7.iterator()     // Catch: java.lang.Throwable -> L99
            r6.L$0 = r7     // Catch: java.lang.Throwable -> L99
            r6.L$1 = r2     // Catch: java.lang.Throwable -> L99
            r6.label = r1     // Catch: java.lang.Throwable -> L99
            java.lang.Object r0 = r2.hasNext(r6)     // Catch: java.lang.Throwable -> L99
            if (r0 != r5) goto L5d
            return r5
        L5d:
            goto L61
        L5e:
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L97
        L61:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L97
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L97
            if (r0 != 0) goto L6d
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r3)
            return r3
        L6d:
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> L97
        L71:
            r6.L$0 = r7     // Catch: java.lang.Throwable -> L99
            r6.L$1 = r2     // Catch: java.lang.Throwable -> L99
            r6.L$2 = r1     // Catch: java.lang.Throwable -> L99
            r6.label = r4     // Catch: java.lang.Throwable -> L99
            java.lang.Object r0 = r2.hasNext(r6)     // Catch: java.lang.Throwable -> L99
            if (r0 != r5) goto L80
            return r5
        L80:
            goto L84
        L81:
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L95
        L84:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L95
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L95
            if (r0 == 0) goto L91
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> L95
            goto L71
        L91:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r3)
            return r1
        L95:
            r1 = move-exception
            goto L9a
        L97:
            r1 = move-exception
            goto L9a
        L99:
            r1 = move-exception
        L9a:
            throw r1     // Catch: java.lang.Throwable -> L9b
        L9b:
            r0 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.lastOrNull(kotlinx.coroutines.channels.ReceiveChannel, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final <E, R> ReceiveChannel<R> map(ReceiveChannel<? extends E> receiveChannel, CoroutineContext coroutineContext, Function2<? super E, ? super Continuation<? super R>, ? extends Object> function2) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, coroutineContext, 0, null, ChannelsKt.consumes(receiveChannel), new C14091(receiveChannel, function2, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel map$default(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function2 function2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        return ChannelsKt.map(receiveChannel, coroutineContext, function2);
    }

    public static final <E, R> ReceiveChannel<R> mapIndexed(ReceiveChannel<? extends E> receiveChannel, CoroutineContext coroutineContext, Function3<? super Integer, ? super E, ? super Continuation<? super R>, ? extends Object> function3) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, coroutineContext, 0, null, ChannelsKt.consumes(receiveChannel), new C14101(receiveChannel, function3, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel mapIndexed$default(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function3 function3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        return ChannelsKt.mapIndexed(receiveChannel, coroutineContext, function3);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0005O\n6\u0004\u000eTZgT8{d\u001e.WhU\u001d@")
    @InterfaceC1492Gx
    public static final /* synthetic */ ReceiveChannel mapIndexedNotNull(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function3 function3) {
        return ChannelsKt.filterNotNull(ChannelsKt.mapIndexed(receiveChannel, coroutineContext, function3));
    }

    public static /* synthetic */ ReceiveChannel mapIndexedNotNull$default(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function3 function3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        return mapIndexedNotNull(receiveChannel, coroutineContext, function3);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0005O\n6\u0004\u000eTZgT8{d\u001e.WhU\u001d@")
    @InterfaceC1492Gx
    public static final /* synthetic */ ReceiveChannel mapNotNull(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function2 function2) {
        return ChannelsKt.filterNotNull(ChannelsKt.map(receiveChannel, coroutineContext, function2));
    }

    public static /* synthetic */ ReceiveChannel mapNotNull$default(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function2 function2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        return mapNotNull(receiveChannel, coroutineContext, function2);
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0098 A[Catch: all -> 0x00ac, TryCatch #1 {all -> 0x00ac, blocks: (B:92:0x0090, B:94:0x0098, B:88:0x007e, B:78:0x0057), top: B:110:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00a6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x008f -> B:92:0x0090). Please report as a decompilation issue!!! */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "\u0005O\n6\u0004\u000eTZgT8{d\u001e.WhU\u001d@")
    @yg.InterfaceC1492Gx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object maxWith(kotlinx.coroutines.channels.ReceiveChannel r8, java.util.Comparator r9, kotlin.coroutines.Continuation r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C14111
            if (r0 == 0) goto L33
            r7 = r10
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$maxWith$1 r7 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C14111) r7
            int r0 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L33
            int r0 = r7.label
            int r0 = r0 - r1
            r7.label = r0
        L13:
            java.lang.Object r0 = r7.result
            java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r7.label
            r5 = 2
            r1 = 1
            r4 = 0
            if (r2 == 0) goto L54
            if (r2 == r1) goto L47
            if (r2 != r5) goto L3f
            java.lang.Object r3 = r7.L$3
            java.lang.Object r2 = r7.L$2
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r8 = r7.L$1
            kotlinx.coroutines.channels.ReceiveChannel r8 = (kotlinx.coroutines.channels.ReceiveChannel) r8
            java.lang.Object r9 = r7.L$0
            java.util.Comparator r9 = (java.util.Comparator) r9
            goto L39
        L33:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$maxWith$1 r7 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$maxWith$1
            r7.<init>(r10)
            goto L13
        L39:
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L3d
            goto L90
        L3d:
            r1 = move-exception
            goto Lad
        L3f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L47:
            java.lang.Object r2 = r7.L$2
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r8 = r7.L$1
            kotlinx.coroutines.channels.ReceiveChannel r8 = (kotlinx.coroutines.channels.ReceiveChannel) r8
            java.lang.Object r9 = r7.L$0
            java.util.Comparator r9 = (java.util.Comparator) r9
            goto L6b
        L54:
            kotlin.ResultKt.throwOnFailure(r0)
            kotlinx.coroutines.channels.ChannelIterator r2 = r8.iterator()     // Catch: java.lang.Throwable -> Lac
            r7.L$0 = r9     // Catch: java.lang.Throwable -> Lac
            r7.L$1 = r8     // Catch: java.lang.Throwable -> Lac
            r7.L$2 = r2     // Catch: java.lang.Throwable -> Lac
            r7.label = r1     // Catch: java.lang.Throwable -> Lac
            java.lang.Object r0 = r2.hasNext(r7)     // Catch: java.lang.Throwable -> Lac
            if (r0 != r6) goto L6a
            return r6
        L6a:
            goto L6e
        L6b:
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> Laa
        L6e:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> Laa
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> Laa
            if (r0 != 0) goto L7a
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r4)
            return r4
        L7a:
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> Laa
        L7e:
            r7.L$0 = r9     // Catch: java.lang.Throwable -> Lac
            r7.L$1 = r8     // Catch: java.lang.Throwable -> Lac
            r7.L$2 = r2     // Catch: java.lang.Throwable -> Lac
            r7.L$3 = r1     // Catch: java.lang.Throwable -> Lac
            r7.label = r5     // Catch: java.lang.Throwable -> Lac
            java.lang.Object r0 = r2.hasNext(r7)     // Catch: java.lang.Throwable -> Lac
            if (r0 != r6) goto L8f
            goto La5
        L8f:
            r3 = r1
        L90:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> Lac
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> Lac
            if (r0 == 0) goto La6
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> Lac
            int r0 = r9.compare(r3, r1)     // Catch: java.lang.Throwable -> Lac
            if (r0 >= 0) goto La3
        La2:
            goto L7e
        La3:
            r1 = r3
            goto La2
        La5:
            return r6
        La6:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r4)
            return r3
        Laa:
            r1 = move-exception
            goto Lad
        Lac:
            r1 = move-exception
        Lad:
            throw r1     // Catch: java.lang.Throwable -> Lae
        Lae:
            r0 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.maxWith(kotlinx.coroutines.channels.ReceiveChannel, java.util.Comparator, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x009b A[Catch: all -> 0x00af, TryCatch #3 {all -> 0x00af, blocks: (B:92:0x0093, B:94:0x009b, B:88:0x0081, B:78:0x005a), top: B:114:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00a9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x0092 -> B:92:0x0093). Please report as a decompilation issue!!! */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "\u0005O\n6\u0004\u000eTZgT8{d\u001e.WhU\u001d@")
    @yg.InterfaceC1492Gx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object minWith(kotlinx.coroutines.channels.ReceiveChannel r8, java.util.Comparator r9, kotlin.coroutines.Continuation r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C14121
            if (r0 == 0) goto L36
            r7 = r10
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$minWith$1 r7 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C14121) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r2 + r1
            r2 = r2 | r1
            int r0 = r0 - r2
            if (r0 == 0) goto L36
            int r0 = r7.label
            int r0 = r0 - r1
            r7.label = r0
        L16:
            java.lang.Object r0 = r7.result
            java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r7.label
            r5 = 2
            r1 = 1
            r4 = 0
            if (r2 == 0) goto L57
            if (r2 == r1) goto L4a
            if (r2 != r5) goto L42
            java.lang.Object r3 = r7.L$3
            java.lang.Object r2 = r7.L$2
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r8 = r7.L$1
            kotlinx.coroutines.channels.ReceiveChannel r8 = (kotlinx.coroutines.channels.ReceiveChannel) r8
            java.lang.Object r9 = r7.L$0
            java.util.Comparator r9 = (java.util.Comparator) r9
            goto L3c
        L36:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$minWith$1 r7 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$minWith$1
            r7.<init>(r10)
            goto L16
        L3c:
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L40
            goto L93
        L40:
            r1 = move-exception
            goto Lb0
        L42:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L4a:
            java.lang.Object r2 = r7.L$2
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r8 = r7.L$1
            kotlinx.coroutines.channels.ReceiveChannel r8 = (kotlinx.coroutines.channels.ReceiveChannel) r8
            java.lang.Object r9 = r7.L$0
            java.util.Comparator r9 = (java.util.Comparator) r9
            goto L6e
        L57:
            kotlin.ResultKt.throwOnFailure(r0)
            kotlinx.coroutines.channels.ChannelIterator r2 = r8.iterator()     // Catch: java.lang.Throwable -> Laf
            r7.L$0 = r9     // Catch: java.lang.Throwable -> Laf
            r7.L$1 = r8     // Catch: java.lang.Throwable -> Laf
            r7.L$2 = r2     // Catch: java.lang.Throwable -> Laf
            r7.label = r1     // Catch: java.lang.Throwable -> Laf
            java.lang.Object r0 = r2.hasNext(r7)     // Catch: java.lang.Throwable -> Laf
            if (r0 != r6) goto L6d
            return r6
        L6d:
            goto L71
        L6e:
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> Lad
        L71:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> Lad
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> Lad
            if (r0 != 0) goto L7d
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r4)
            return r4
        L7d:
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> Lad
        L81:
            r7.L$0 = r9     // Catch: java.lang.Throwable -> Laf
            r7.L$1 = r8     // Catch: java.lang.Throwable -> Laf
            r7.L$2 = r2     // Catch: java.lang.Throwable -> Laf
            r7.L$3 = r1     // Catch: java.lang.Throwable -> Laf
            r7.label = r5     // Catch: java.lang.Throwable -> Laf
            java.lang.Object r0 = r2.hasNext(r7)     // Catch: java.lang.Throwable -> Laf
            if (r0 != r6) goto L92
            goto La8
        L92:
            r3 = r1
        L93:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> Laf
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> Laf
            if (r0 == 0) goto La9
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> Laf
            int r0 = r9.compare(r3, r1)     // Catch: java.lang.Throwable -> Laf
            if (r0 <= 0) goto La6
        La5:
            goto L81
        La6:
            r1 = r3
            goto La5
        La8:
            return r6
        La9:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r4)
            return r3
        Lad:
            r1 = move-exception
            goto Lb0
        Laf:
            r1 = move-exception
        Lb0:
            throw r1     // Catch: java.lang.Throwable -> Lb1
        Lb1:
            r0 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.minWith(kotlinx.coroutines.channels.ReceiveChannel, java.util.Comparator, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0028  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "\u0005O\n6\u0004\u000eTZgT8{d\u001e.WhU\u001d@")
    @yg.InterfaceC1492Gx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object none(kotlinx.coroutines.channels.ReceiveChannel r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C14131
            if (r0 == 0) goto L28
            r4 = r6
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$none$1 r4 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C14131) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r2 + r1
            r2 = r2 | r1
            int r0 = r0 - r2
            if (r0 == 0) goto L28
            int r0 = r4.label
            int r0 = r0 - r1
            r4.label = r0
        L16:
            java.lang.Object r3 = r4.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L36
            if (r0 != r1) goto L2e
            java.lang.Object r5 = r4.L$0
            kotlinx.coroutines.channels.ReceiveChannel r5 = (kotlinx.coroutines.channels.ReceiveChannel) r5
            goto L48
        L28:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$none$1 r4 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$none$1
            r4.<init>(r6)
            goto L16
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L36:
            kotlin.ResultKt.throwOnFailure(r3)
            kotlinx.coroutines.channels.ChannelIterator r0 = r5.iterator()     // Catch: java.lang.Throwable -> L5b
            r4.L$0 = r5     // Catch: java.lang.Throwable -> L5b
            r4.label = r1     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r3 = r0.hasNext(r4)     // Catch: java.lang.Throwable -> L5b
            if (r3 != r2) goto L4b
            return r2
        L48:
            kotlin.ResultKt.throwOnFailure(r3)     // Catch: java.lang.Throwable -> L5b
        L4b:
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L5b
            boolean r0 = r3.booleanValue()     // Catch: java.lang.Throwable -> L5b
            r0 = r0 ^ r1
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)     // Catch: java.lang.Throwable -> L5b
            r0 = 0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r0)
            return r1
        L5b:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L5d
        L5d:
            r0 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.none(kotlinx.coroutines.channels.ReceiveChannel, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0064 A[Catch: all -> 0x0098, TryCatch #0 {all -> 0x0098, blocks: (B:74:0x0059, B:75:0x005c, B:77:0x0064, B:90:0x0090, B:91:0x0097), top: B:99:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0090 A[Catch: all -> 0x0098, TRY_ENTER, TryCatch #0 {all -> 0x0098, blocks: (B:74:0x0059, B:75:0x005c, B:77:0x0064, B:90:0x0090, B:91:0x0097), top: B:99:0x0059 }] */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "\u0005O\n6\u0004\u000eTZgT8{d\u001e.WhU\u001d@")
    @yg.InterfaceC1492Gx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object single(kotlinx.coroutines.channels.ReceiveChannel r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C14151
            if (r0 == 0) goto L2d
            r5 = r7
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$single$1 r5 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C14151) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r2 + r1
            r2 = r2 | r1
            int r0 = r0 - r2
            if (r0 == 0) goto L2d
            int r0 = r5.label
            int r0 = r0 - r1
            r5.label = r0
        L16:
            java.lang.Object r0 = r5.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r5.label
            r3 = 2
            r1 = 1
            if (r2 == 0) goto L44
            if (r2 == r1) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r1 = r5.L$1
            java.lang.Object r6 = r5.L$0
            kotlinx.coroutines.channels.ReceiveChannel r6 = (kotlinx.coroutines.channels.ReceiveChannel) r6
            goto L76
        L2d:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$single$1 r5 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$single$1
            r5.<init>(r7)
            goto L16
        L33:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L3b:
            java.lang.Object r2 = r5.L$1
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r6 = r5.L$0
            kotlinx.coroutines.channels.ReceiveChannel r6 = (kotlinx.coroutines.channels.ReceiveChannel) r6
            goto L59
        L44:
            kotlin.ResultKt.throwOnFailure(r0)
            kotlinx.coroutines.channels.ChannelIterator r2 = r6.iterator()     // Catch: java.lang.Throwable -> L9a
            r5.L$0 = r6     // Catch: java.lang.Throwable -> L9a
            r5.L$1 = r2     // Catch: java.lang.Throwable -> L9a
            r5.label = r1     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r0 = r2.hasNext(r5)     // Catch: java.lang.Throwable -> L9a
            if (r0 != r4) goto L58
            return r4
        L58:
            goto L5c
        L59:
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L98
        L5c:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L98
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L98
            if (r0 == 0) goto L90
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> L98
            r5.L$0 = r6     // Catch: java.lang.Throwable -> L98
            r5.L$1 = r1     // Catch: java.lang.Throwable -> L98
            r5.label = r3     // Catch: java.lang.Throwable -> L98
            java.lang.Object r0 = r2.hasNext(r5)     // Catch: java.lang.Throwable -> L98
            if (r0 != r4) goto L75
            return r4
        L75:
            goto L79
        L76:
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L8e
        L79:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L8e
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L8e
            if (r0 != 0) goto L86
            r0 = 0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r0)
            return r1
        L86:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L8e
            java.lang.String r0 = "ReceiveChannel has more than one element."
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L8e
            throw r1     // Catch: java.lang.Throwable -> L8e
        L8e:
            r1 = move-exception
            goto L9b
        L90:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L98
            java.lang.String r0 = "ReceiveChannel is empty."
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L98
            throw r1     // Catch: java.lang.Throwable -> L98
        L98:
            r1 = move-exception
            goto L9b
        L9a:
            r1 = move-exception
        L9b:
            throw r1     // Catch: java.lang.Throwable -> L9c
        L9c:
            r0 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.single(kotlinx.coroutines.channels.ReceiveChannel, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0087  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "\u0005O\n6\u0004\u000eTZgT8{d\u001e.WhU\u001d@")
    @yg.InterfaceC1492Gx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object singleOrNull(kotlinx.coroutines.channels.ReceiveChannel r7, kotlin.coroutines.Continuation r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C14161
            if (r0 == 0) goto L2b
            r6 = r8
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$singleOrNull$1 r6 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C14161) r6
            int r0 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2b
            int r0 = r6.label
            int r0 = r0 - r1
            r6.label = r0
        L13:
            java.lang.Object r0 = r6.result
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r6.label
            r4 = 2
            r1 = 1
            r3 = 0
            if (r2 == 0) goto L42
            if (r2 == r1) goto L39
            if (r2 != r4) goto L31
            java.lang.Object r1 = r6.L$1
            java.lang.Object r7 = r6.L$0
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            goto L78
        L2b:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$singleOrNull$1 r6 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$singleOrNull$1
            r6.<init>(r8)
            goto L13
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L39:
            java.lang.Object r2 = r6.L$1
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r7 = r6.L$0
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            goto L57
        L42:
            kotlin.ResultKt.throwOnFailure(r0)
            kotlinx.coroutines.channels.ChannelIterator r2 = r7.iterator()     // Catch: java.lang.Throwable -> L8f
            r6.L$0 = r7     // Catch: java.lang.Throwable -> L8f
            r6.L$1 = r2     // Catch: java.lang.Throwable -> L8f
            r6.label = r1     // Catch: java.lang.Throwable -> L8f
            java.lang.Object r0 = r2.hasNext(r6)     // Catch: java.lang.Throwable -> L8f
            if (r0 != r5) goto L56
            return r5
        L56:
            goto L5a
        L57:
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L8d
        L5a:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L8d
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L8d
            if (r0 != 0) goto L66
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r3)
            return r3
        L66:
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> L8d
            r6.L$0 = r7     // Catch: java.lang.Throwable -> L8d
            r6.L$1 = r1     // Catch: java.lang.Throwable -> L8d
            r6.label = r4     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r0 = r2.hasNext(r6)     // Catch: java.lang.Throwable -> L8d
            if (r0 != r5) goto L77
            return r5
        L77:
            goto L7b
        L78:
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L8b
        L7b:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L8b
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto L87
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r3)
            return r3
        L87:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r3)
            return r1
        L8b:
            r1 = move-exception
            goto L90
        L8d:
            r1 = move-exception
            goto L90
        L8f:
            r1 = move-exception
        L90:
            throw r1     // Catch: java.lang.Throwable -> L91
        L91:
            r0 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.singleOrNull(kotlinx.coroutines.channels.ReceiveChannel, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0005O\n6\u0004\u000eTZgT8{d\u001e.WhU\u001d@")
    @InterfaceC1492Gx
    public static final /* synthetic */ ReceiveChannel take(ReceiveChannel receiveChannel, int i2, CoroutineContext coroutineContext) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, coroutineContext, 0, null, ChannelsKt.consumes(receiveChannel), new C14171(i2, receiveChannel, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel take$default(ReceiveChannel receiveChannel, int i2, CoroutineContext coroutineContext, int i3, Object obj) {
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        return take(receiveChannel, i2, coroutineContext);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0005O\n6\u0004\u000eTZgT8{d\u001e.WhU\u001d@")
    @InterfaceC1492Gx
    public static final /* synthetic */ ReceiveChannel takeWhile(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function2 function2) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, coroutineContext, 0, null, ChannelsKt.consumes(receiveChannel), new C14181(receiveChannel, function2, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel takeWhile$default(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, Function2 function2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        return takeWhile(receiveChannel, coroutineContext, function2);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0075 A[Catch: all -> 0x0090, TryCatch #0 {all -> 0x0090, blocks: (B:60:0x003a, B:71:0x006d, B:73:0x0075, B:78:0x008a, B:70:0x006a), top: B:88:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x008a A[Catch: all -> 0x0090, TRY_LEAVE, TryCatch #0 {all -> 0x0090, blocks: (B:60:0x003a, B:71:0x006d, B:73:0x0075, B:78:0x008a, B:70:0x006a), top: B:88:0x0021 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x0085 -> B:76:0x0088). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <E, C extends kotlinx.coroutines.channels.SendChannel<? super E>> java.lang.Object toChannel(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r7, C r8, kotlin.coroutines.Continuation<? super C> r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C14191
            if (r0 == 0) goto L34
            r6 = r9
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1 r6 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C14191) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r2 + r1
            r2 = r2 | r1
            int r0 = r0 - r2
            if (r0 == 0) goto L34
            int r0 = r6.label
            int r0 = r0 - r1
            r6.label = r0
        L16:
            java.lang.Object r0 = r6.result
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            r4 = 2
            r3 = 1
            r2 = 0
            if (r1 == 0) goto L53
            if (r1 == r3) goto L46
            if (r1 != r4) goto L3e
            java.lang.Object r1 = r6.L$2
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r7 = r6.L$1
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r8 = r6.L$0
            kotlinx.coroutines.channels.SendChannel r8 = (kotlinx.coroutines.channels.SendChannel) r8
            goto L3a
        L34:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1 r6 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1
            r6.<init>(r9)
            goto L16
        L3a:
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L90
            goto L88
        L3e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L46:
            java.lang.Object r1 = r6.L$2
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r7 = r6.L$1
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r8 = r6.L$0
            kotlinx.coroutines.channels.SendChannel r8 = (kotlinx.coroutines.channels.SendChannel) r8
            goto L6a
        L53:
            kotlin.ResultKt.throwOnFailure(r0)
            kotlinx.coroutines.channels.ChannelIterator r1 = r7.iterator()     // Catch: java.lang.Throwable -> L92
        L5a:
            r6.L$0 = r8     // Catch: java.lang.Throwable -> L92
            r6.L$1 = r7     // Catch: java.lang.Throwable -> L92
            r6.L$2 = r1     // Catch: java.lang.Throwable -> L92
            r6.label = r3     // Catch: java.lang.Throwable -> L92
            java.lang.Object r0 = r1.hasNext(r6)     // Catch: java.lang.Throwable -> L92
            if (r0 != r5) goto L69
            return r5
        L69:
            goto L6d
        L6a:
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L90
        L6d:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L90
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L90
            if (r0 == 0) goto L8a
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> L90
            r6.L$0 = r8     // Catch: java.lang.Throwable -> L90
            r6.L$1 = r7     // Catch: java.lang.Throwable -> L90
            r6.L$2 = r1     // Catch: java.lang.Throwable -> L90
            r6.label = r4     // Catch: java.lang.Throwable -> L90
            java.lang.Object r0 = r8.send(r0, r6)     // Catch: java.lang.Throwable -> L90
            if (r0 != r5) goto L88
            goto L89
        L88:
            goto L5a
        L89:
            return r5
        L8a:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L90
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r2)
            return r8
        L90:
            r1 = move-exception
            goto L93
        L92:
            r1 = move-exception
        L93:
            throw r1     // Catch: java.lang.Throwable -> L94
        L94:
            r0 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.toChannel(kotlinx.coroutines.channels.ReceiveChannel, kotlinx.coroutines.channels.SendChannel, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0061 A[Catch: all -> 0x0070, TryCatch #0 {all -> 0x0070, blocks: (B:61:0x0056, B:62:0x0059, B:64:0x0061, B:57:0x0046, B:66:0x006a), top: B:76:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x006a A[Catch: all -> 0x0070, TRY_LEAVE, TryCatch #0 {all -> 0x0070, blocks: (B:61:0x0056, B:62:0x0059, B:64:0x0061, B:57:0x0046, B:66:0x006a), top: B:76:0x0056 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0055 -> B:62:0x0059). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <E, C extends java.util.Collection<? super E>> java.lang.Object toCollection(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r6, C r7, kotlin.coroutines.Continuation<? super C> r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C14201
            if (r0 == 0) goto L31
            r5 = r8
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1 r5 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C14201) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r2 + r1
            r2 = r2 | r1
            int r0 = r0 - r2
            if (r0 == 0) goto L31
            int r0 = r5.label
            int r0 = r0 - r1
            r5.label = r0
        L16:
            java.lang.Object r0 = r5.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.label
            r3 = 0
            r2 = 1
            if (r1 == 0) goto L3f
            if (r1 != r2) goto L37
            java.lang.Object r1 = r5.L$2
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r6 = r5.L$1
            kotlinx.coroutines.channels.ReceiveChannel r6 = (kotlinx.coroutines.channels.ReceiveChannel) r6
            java.lang.Object r7 = r5.L$0
            java.util.Collection r7 = (java.util.Collection) r7
            goto L56
        L31:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1 r5 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1
            r5.<init>(r8)
            goto L16
        L37:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L3f:
            kotlin.ResultKt.throwOnFailure(r0)
            kotlinx.coroutines.channels.ChannelIterator r1 = r6.iterator()     // Catch: java.lang.Throwable -> L72
        L46:
            r5.L$0 = r7     // Catch: java.lang.Throwable -> L70
            r5.L$1 = r6     // Catch: java.lang.Throwable -> L70
            r5.L$2 = r1     // Catch: java.lang.Throwable -> L70
            r5.label = r2     // Catch: java.lang.Throwable -> L70
            java.lang.Object r0 = r1.hasNext(r5)     // Catch: java.lang.Throwable -> L70
            if (r0 != r4) goto L55
            goto L69
        L55:
            goto L59
        L56:
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L70
        L59:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L70
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L6a
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> L70
            r7.add(r0)     // Catch: java.lang.Throwable -> L70
            goto L46
        L69:
            return r4
        L6a:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L70
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r3)
            return r7
        L70:
            r1 = move-exception
            goto L73
        L72:
            r1 = move-exception
        L73:
            throw r1     // Catch: java.lang.Throwable -> L74
        L74:
            r0 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.toCollection(kotlinx.coroutines.channels.ReceiveChannel, java.util.Collection, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0064 A[Catch: all -> 0x007d, TryCatch #1 {all -> 0x007d, blocks: (B:61:0x0059, B:62:0x005c, B:64:0x0064, B:57:0x0049, B:66:0x0077), top: B:78:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0077 A[Catch: all -> 0x007d, TRY_LEAVE, TryCatch #1 {all -> 0x007d, blocks: (B:61:0x0059, B:62:0x005c, B:64:0x0064, B:57:0x0049, B:66:0x0077), top: B:78:0x0059 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0058 -> B:62:0x005c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <K, V, M extends java.util.Map<? super K, ? super V>> java.lang.Object toMap(kotlinx.coroutines.channels.ReceiveChannel<? extends kotlin.Pair<? extends K, ? extends V>> r7, M r8, kotlin.coroutines.Continuation<? super M> r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.AnonymousClass2
            if (r0 == 0) goto L34
            r6 = r9
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2 r6 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.AnonymousClass2) r6
            int r0 = r6.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = (-1) - r0
            int r0 = (-1) - r2
            r1 = r1 | r0
            int r0 = (-1) - r1
            if (r0 == 0) goto L34
            int r0 = r6.label
            int r0 = r0 - r2
            r6.label = r0
        L19:
            java.lang.Object r0 = r6.result
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            r4 = 0
            r3 = 1
            if (r1 == 0) goto L42
            if (r1 != r3) goto L3a
            java.lang.Object r2 = r6.L$2
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r7 = r6.L$1
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r8 = r6.L$0
            java.util.Map r8 = (java.util.Map) r8
            goto L59
        L34:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2 r6 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2
            r6.<init>(r9)
            goto L19
        L3a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L42:
            kotlin.ResultKt.throwOnFailure(r0)
            kotlinx.coroutines.channels.ChannelIterator r2 = r7.iterator()     // Catch: java.lang.Throwable -> L7f
        L49:
            r6.L$0 = r8     // Catch: java.lang.Throwable -> L7d
            r6.L$1 = r7     // Catch: java.lang.Throwable -> L7d
            r6.L$2 = r2     // Catch: java.lang.Throwable -> L7d
            r6.label = r3     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r0 = r2.hasNext(r6)     // Catch: java.lang.Throwable -> L7d
            if (r0 != r5) goto L58
            goto L76
        L58:
            goto L5c
        L59:
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L7d
        L5c:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L7d
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L7d
            if (r0 == 0) goto L77
            java.lang.Object r0 = r2.next()     // Catch: java.lang.Throwable -> L7d
            kotlin.Pair r0 = (kotlin.Pair) r0     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r1 = r0.getFirst()     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r0 = r0.getSecond()     // Catch: java.lang.Throwable -> L7d
            r8.put(r1, r0)     // Catch: java.lang.Throwable -> L7d
            goto L49
        L76:
            return r5
        L77:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L7d
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r4)
            return r8
        L7d:
            r1 = move-exception
            goto L80
        L7f:
            r1 = move-exception
        L80:
            throw r1     // Catch: java.lang.Throwable -> L81
        L81:
            r0 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.toMap(kotlinx.coroutines.channels.ReceiveChannel, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final <E> Object toMutableSet(ReceiveChannel<? extends E> receiveChannel, Continuation<? super Set<E>> continuation) {
        return ChannelsKt.toCollection(receiveChannel, new LinkedHashSet(), continuation);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0005O\n6\u0004\u000eTZgT8{d\u001e.WhU\u001d@")
    @InterfaceC1492Gx
    public static final /* synthetic */ ReceiveChannel withIndex(ReceiveChannel receiveChannel, CoroutineContext coroutineContext) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, coroutineContext, 0, null, ChannelsKt.consumes(receiveChannel), new C14211(receiveChannel, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel withIndex$default(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        return withIndex(receiveChannel, coroutineContext);
    }

    public static final <E, R, V> ReceiveChannel<V> zip(ReceiveChannel<? extends E> receiveChannel, ReceiveChannel<? extends R> receiveChannel2, CoroutineContext coroutineContext, Function2<? super E, ? super R, ? extends V> function2) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, coroutineContext, 0, null, ChannelsKt.consumesAll(receiveChannel, receiveChannel2), new C14222(receiveChannel2, receiveChannel, function2, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel zip$default(ReceiveChannel receiveChannel, ReceiveChannel receiveChannel2, CoroutineContext coroutineContext, Function2 function2, int i2, Object obj) {
        if ((i2 + 2) - (i2 | 2) != 0) {
            coroutineContext = Dispatchers.getUnconfined();
        }
        return ChannelsKt.zip(receiveChannel, receiveChannel2, coroutineContext, function2);
    }
}
