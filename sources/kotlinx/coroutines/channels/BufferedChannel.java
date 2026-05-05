package kotlinx.coroutines.channels;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import androidx.exifinterface.media.ExifInterface;
import androidx.webkit.ProxyConfig;
import com.dynatrace.android.agent.AdkSettings;
import com.dynatrace.android.agent.Global;
import com.google.common.primitives.Longs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KFunction;
import kotlin.time.DurationKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.internal.ConcurrentLinkedListKt;
import kotlinx.coroutines.internal.ConcurrentLinkedListNode;
import kotlinx.coroutines.internal.InlineList;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.SegmentOrClosed;
import kotlinx.coroutines.internal.StackTraceRecoveryKt;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.selects.SelectClause1;
import kotlinx.coroutines.selects.SelectClause1Impl;
import kotlinx.coroutines.selects.SelectClause2;
import kotlinx.coroutines.selects.SelectClause2Impl;
import kotlinx.coroutines.selects.SelectImplementation;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.selects.TrySelectDetailedResult;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яŝ\u0014D57\u001eqܜLDyt\fǻ\u000e0\u00194Jչ*,(w\u000ff\u000198DsH6RY,\u0017k\u00124,[*rK;c!\u0006\"\u000fUVguwRZ\u0011C\u0017\u0006,xr,_U\u0001]\u0018\u0019:B\u0006?;Mu=A`\u000b6\r 8\"@y\u001b\u0001\"*N\u0015~zQŷ\u0014۵8@\u0007:Z҈U\u00050\u0012\u000e>6\u0001&\\mQ>H\u0003]B/)&qBd'g0\u0003Z\u0015Fj'\u0015vg\"3@M5\u001d%Y\u0007\u000fRq?\u000b?wJ\rh='3IyW>X\u000e\u0015\u001d+e\rer,]\rQv\f/+UnSP$(\u007fz\u0012\rD\u0004\u00145/H<9\"f\u000e\u0010;t\tSHP\bgH\u000e\u0011ʨ^\u0019+ĮA*i!vSq;_Me{=\u000f΄\"Ҙma\rd\u0012n\u00163T&SAqF=VQ\"sMo\u0014p\u0019̣:\u0006@G.5\u0012\u0010\\\u001c\u000e?k;3!\"ȵ^CFzݶdjYp`P\t6|5O*7\u0012\u000bHr%\u0004P\u000bАrҡ\fɟX\u0007\f)[4j\u001aT!S\u0016~Sv\n\u0003M\u0014܃kÇ%Ơ]ny/ klVMQ\u0012\u0016\u0012\\\u00058WBr\u0007hfxͭ:v\r,0W`j>y,H\\,+2uڤL8:W1\\CWIٟ\u0001˩\u0001\tm\u000210\r|K$1oLt7*\u0001f~\u0014\u007f~Y.\r`XΊome\u001d4z:hb~i\u0007G\u0015\u000eq\u007fLuR\u001d\u001a\u0004u\u0014 L֝i[=h+\u0015\u000f+B\u0002[Kz\u001f,Q̊\u0016'\t*B*I\u0017Fm\u0018l\u0001,\u000fpx~\u0005\u001b0\u0017vrYΨ+\u0014\u05fbeH\u0001wq\u0006SqL{\u000b\u0003\bT~<\u000b%7\u001e[˚6݃;ީ1E-P$\u0019\\ۗ\u0014o\u0012\u0002ot/\u0003\u0011,ss9\\g$\u0010zQ\u0014Цk>W\u0010\u0017@8#\u001b:rRx0 H\u00196\u001d3\u000fv\u0013*\u0007r[EG4v\u001e<\"\u0001Xk:I̊,Pˀc4y\u007f\u000e\u001ad\u00015\u0013SY\u000e,}\\l\u001ax\u0011ϻ\u000f\u00067+\"\"C]fYh\u000fVE\u0004\u001aFA\u0002\u00183w9.BlT\u000e\u001bEdiLE)9vF\u0015\u0017@\u0004\f\u001cf%d\u000elXX\u0005\u0017Ѥ\u000f=Ǆ\u0005\t\u0015o.~;n\u0015oLZU\"B\u0012c,7\u001d˥S\tla;JZv+*^\u00071\u0005mTY\u0011lߤھ-wq,\u001c>\u001e:-D\u001e!_q!p\u0007?\r\u001aڀhXj3\"lX\f2+\u0005\u0001#4L\f\u001f\u000b_\u0005!2)ΥRϸ{7Q]I2Rm\u001f\u0012\reV\u001b[\fc\\mMx4?{\u000eė\u0002\u007fл$\"-I\u0003R%.\u001c-\"]I@F{$\u0007\u001a\u000f#R0\u0004d\u05fd#\u000f:2\u0016[g\u0002a\u0004Cbg\f\u0010!vӏ[p\u0014hch'\u0019\u0014pq%m\u000b1\u0010a`\b'EV-\u000b7M\\\u0019\u0007\u0014j\u001ba`p\u0017\u0010\u0016%&M<6\u001coքUʍlpy\u0017$P9w\u0004*\u00103`\\,\"7\u007f\u0006\u0006:T^ֽir}Br.tlpY>bxH|tBÉD\u0001\rnv\u0011ACvx,\u001bG9/\u001e\nDwd\u0015M]IT9wR̫\u001f7@U8k\u0005\\\u001b:\u0011v04P-\u000b\u0006w.=F\u000bشHC\n({\n\u001b&yGhF\u0016L)\u000eGˏ\u000b<.dt\u001aJJ\u00029OO)\u0003+74'7\u001dC4iSSBG|Ӹ\u0011?\b{4H\u0002\u0004\u000b#]' \u001fe4S%ct\u0013(T\u0010s\u0019\u0017M\u0012n?e:\u0019MEL\t\u001c@H\u0015-p<\u0006$;FS˜L*e-\tm\u0002)\u001c&XN\u0017DQ~\u001d|\u0002*DiNĵ+[Ɉ8A\tfaJL}El5K\u0014zB\u0011Ra]\u0014e\u0015L;{#\u000begqvԴ\u0010׳\fҰ`]Ji<=H\nyE0Ù˂]4\fi\"Zi(zoWe6XB\u0017\u001b(\u00107bb\u0010`SȁUg'JD\u0002\u0011Mod;D\u001d|v.p\u001bQʒTǽL\u0017\u0010W\u0013\u0001#mKG\"Go\u0012\u0005%Q'\u001f\u007f=\f5izGuޟ tm=A0\u0006J\u00077,\\Mi/'|+C\u0006\u001b5<rnD*,h\u0006DȊ\u0013tVDAX6JH6@R\u000fZyי/Keߎ\u0014Ȁi\u00018@E2-C9\u0016otbW3-/ߏ1?q#!/6YI43sCГl\u00188`Wz\u0015mw\u00123eXyG\u0006m>\bٞ+ʂiA\u001f7MXT:5\u0005\u001e\u0013Rh\u0018#w9:k\u0013TF\\9J[YGޯp\u001a=';\fv\u001fF7\u001eC\u0016\u0013r\u001ckģ\u000eorB \rIUM\n\u000e.}tYqMs1&\u001dL\u0017\n\u0011\u0012^&\u00167ԥ[f%/Wlu3\u0004 \u001c4\u0017,N7f/Wyl\u0019+\u0005\u007f\u001fAL\u0007@u\n\u0002\u001dٍͣgHB\u0005|\u001fl\r\u000e\u001dWJ\t)prXAV\u0018\u001b1W\u0006V%1L\u0011bq,$9TvYׇaVɬe,Y\u001a5MPC\u001elg};:mDF\u001c\u001e.̺\u0019\u000fD#\u0003\nrB]2\nqUqVkP+[iËqr\u000ef\u001e\u0012\u0003B<pYXwN/tt~iSH*\bCUa+\t)>\u00182\u0014\u000e)(\t.+.\nG7]R\u0013E\u0002Qu\f3\u000eų}Pߚ\"3\u0004&\b&\u0013)\"\u0006iPI\u000eys!l\\OȢ\u000bcB\u0016Q\b\u0010_9&\u000e\u001bMAXEZAP2ò\u0013@\u001e\u0007vt~b\u0019g\u00125\u001bN\u001e4}>:\u001c\fPzߩCϩa~S\u0017wP\u00166am-1w\u0018W:RU\\o\u0006[sԘDN7s\u0012V(s\u000f]r\u001b\u0006`z4\u001aI,K\u0011J\u0003K\\C\u000b\u0006|T\u000fkq!M%CКحB}/_P+e\u001ew\u0002A\u000f\u0017=GSUd9J?-\u0011<LR'Nhh\u001e\u001b0\u000by\u001e`Ҵ?\u000e)N7-]\u001af\u0012\tRqV\u0010@5\u001ay&6S־cU=w^\u0004Mg\r\u000b\u0006'\u001c\u007f\u0007O6\u0001`8U\u0014r\"EZ6E\u0011f\u0015\u0001\u001b.\u001fnDu%*GI#&BK2\u001fSeO˫3R\u001d?k\u000ekd) \u001f_i\u007fH}40CG-L&&\u001e~#\u0013zO>!N6+\fH[V\bB<\u0016V\u0013Y\"GAAcpOݦ&{\u000fF\u00132=!V\r^(*r!^-(PIYvc\u0012\u0017\u007f4IS!][\u0005\u001f28 \"e\u0010uԁA~\u000f{\u000eFa0^u9QZ^\u0016.\u0019~1w'4]cT]-\u0010fO64>XK\u0016r\\zυ\nDt\u001b\u001cC7*R4<r>\fth,~=R+\"n'\u00075\u0007Fe1)\u00014t\u0019\tQlq\u0014\u0007lc;|\u000f\u0015|\u0001G T\r>\u0018\fNӒې\b\u0006Q\\z:GG\u0012!\u001a:p,8ƪ\u0013<j\u001c\rRQ[϶5\u0010B0YT\u001d\n/-NWR3\u0018\u0012ŢE)r7va6W\u007ft\u001fbԒYzyڱ.hWQMt0Hł%~a˒'LsŖ\u001b\u000e\u0007KҌ$-\u000f5i:,3$C֎[v,U\u00014[DI\rծo[lTtJkZtj\u0003wւ-Zb}0F\u001csč&ovt\u0013g5,ŁLJ\tl̴\u0006%(9,9Rp\u0003\u0015Y_þk{G\u0004|\r\u0017\u001dޒ<\u0002L@L{{,\u05fa18@@\u0012oڲ5]\u0002.(r\u0001a9\u0010ґOdq\u0013/wI|\u0012P¬\u0012JB4~I\u000e-I|g\u0004Ǎ5\u0005_Z(,E\u0017={Ț\u000beGl-4mMfx͔r\u000fX|\u0012mNX\u0016E\u001eJݴd\u001dg<\"X}0ZAŭzoU\u0001\u000evNbkḂ\u00137\r4)\u0003WQ\u000b\u0018vB҄7d\u007fVPUa;óPɯanȻ.9v^̿W\u0019]t?\u0002/<gnӷpxv\u0006?\u0001pEΏ\n\n5YK\u000eǰ ssS$XۭR+S0i]ZI\u008dFq\u000bmE\u001bԊ-gJwڃn\u001d8\u001dE\u0014\t$ˬ>ow\nfZO\u0012Ѽ'-N6%@ϫ\f'@4ur˂&ѳ\u000fX^ְ\u0001;c(Ǟjh\te*uEQͿ_stQ$\rǬ\u000bW3݉3\n Քf5B\u0003ۃm|\f\u007fQ\u000e8?ۯa\"lgl>߬{L9$βX*AD3/3\u0002NuÂ2M\u0004<V\u0017oG`f؋j\u0006b\u0007\u001ab',̙9\u0011'zmt,\u0012W\u001dĬEȬc9LU )3gvzV/_ǩax\u0003\u0006r\bkDcm\u0007\u007fd\rȯn\u007fE\u0015M\fM.'\u0004طy4Y\u0003rUjA[SĖc\u000fBZH\u0013vh\u0013\u001aēeP\u001fhQ@(5>Sʗo=brL^QGؓ\"v-)\rˋ<V\u001d\"EM\u001b[R%ݙ\t\n\r\b>=yDØLqaOA(:=x\u000f̎\u001a+\n$1$\\\u0012۱+F<iTB>˞B\u0004A}4Q\u001c1Ą\u000bOOp|\n`\u0018ۍq#K&_]\u000fϜr`n/F\u0011ydŷG?4\u0007t\u0017#B;H02Puw\u0004\u05fe\u001c}82\u0003ChRدK%\u00177,=\rRӁ7iyWI?>\fBJcS\u001a|\u0012њ\r\u000b\u0011`\u0005(\u001ed\u001f\ra=n\u0006ŬDZ]\u0018\u0011v6b/UJ\u001d\u0007\u0012кz-L?I\u0005Q#.\u000fIkȈ&&z5Hc|9~Rӳ\u0001(fN\nt\u0013[°\u0017\u0007Kg0\u0012p\u0012\u05f9todEZ\u0012\u0012c\rOǭ1\u0018EV\u0003.ز׳H\u0017yѽ=$zzشM36\u00156v\u001c3q|t\u001e&\u001b\u0010\tλh;nN\nlfI\u0013\u000f\u001djj\u001bdM#@x\u0015G:Qү\u007fWC/yhfwղzy\fCC0\t߲\u000e\u00135u[\rp1Ɓ_5\u0019]$c]H\u05fdB\f[}H/.د\u0017\u00195^45C\"ҙ\b\bp\rsT|\u0087g\u000f\u001e&q\u00135Sߑ\u0006><X$;\u0013c՟1 )1\u001d+wϫN2\u001d7J;\u000fLٱ\u0004O;yHLM˩R|\u001ee\u000f\u0010rY݃\u0013@2?\u0012-M\u001fҶX\u0013N2≠\u0015\u0016\u001e%\u0001['\u0019C\"хQ\u0017|R>J-\u0010ܦD4\u001d\u0017r,\u0017;Т:S\u000f\u001ePgp;ʕ\u000e\u00116r./`ث@z\u0006-Gx6'žPV\u001f!s\u000b+.BXܗ\u00116/^/j\u000e|Ӛ#{k3\b>W0!qɫrVbsʙ1\t\u001as\u0018\u0018ص)p9Gλa\u001e߾ם\u0017o\u0005ãH\tm\u0003ӎm!\u0010_.U[^̲<Sa^\u00026qYӛ,?w-/\u001d\u0011(U\fğQdrF3BjŐxJ\u000b3\u0015z!-ݼ3j3\u000b\u0013\f<\u007fԇpgS3\u0010F$uk<oWLR*ƃ\u007f&o3ؘ@!\\ȥ3nwy¬RC#A%#\u0016\bĺ\u0018Y{\u0014ɇ,v\u0013\u0017IQM\u0012O\u0004N*ֵ1Rc\u001d\nߣj\u0007<W\u038dh\u00133Χ sZݖ>\u0004ͪ 4\u0002\u0012ޭX6\u001eyS#\u0013YҨ+\"\"^\ngH\u0007u\u007f3`[*ƀ\u0017&8Vrr9\n]+\u00144H\fJ\u001cũ}}NK3\u001a[Q;@M\u000b\u001fQ\f\u07b8`71\u0019_4S\u001fLӯ\n#߹(`wн:\u00165oƋu\u007fa=\t&kRÞ?$SZZ`ٺM)tp2ԃxim(Dy\u001bOֶ\u000bi\rR\n|-bԃ_zf:\u000b\u000b\u0006`c\u001bb#FpVݸt)V*ȏX, فQ5fMȂN\u0018I\u0002P\u001b\u0016?Ӵ \b\u000e@ςv7[Qu\u001el{̺m+\u0016ڜi_x\u001dȎ^qU߲C\u001f\"ת>\u001bkpf^2\u0013$l۽&Խ$X\u0005ڵ\u0005\u007fRCdn\u001f`Sq?մ9I\u007fG&\u0017ZsoZ\b#;=s~\u001dӅEDc\u0012a؝ ֺ-܍6\u0016UB5|iD<y(`wtǧWj$\n`+aF\\\u0018ØW7g\bL=g\u0002\u001ejɾ1\u0001 -^\u0003sY|T2Jήbϭf=RIo%tgK+\u0013\u0011>HL9<V&н-ӭ*:giZOP\u001aree\u000b\u001c6\f\u0007)54Ɇ\u001bӁ\n)^G\b\"qpD\u001b\u0011o\u000frv<@\u07b7T\u0016&2NXk*dg\u0001\u0002ȝqҊ\u001b\u007ftn\u001f|:A\u0011w\u001c\u001d\u0013\u0011Zs^V`r)z\u0016ʙUw\r\u0018i̥\u0005+fP\n\u000fRARh}9\u0017!c$պm[~\u001a\u0002̹-NE\u0004P{}][j 6|uw_ۉ\u0018inB`ߑ\u0011wA^\u0019\u0005 \u0007\u000bm8NРSRrhxJEfuƪ\u001fǫ\u001d\u0017VQoʣ\u0019؛fw\u00065\t^!&P6Qk9V\u0004H#؎s\u001aC]^\u0013\u0003 ٧_ȅ\u0007D\u007f\u0012Ψ\nǍ\r^\bPIŖpi7i\u00147غh\u001aÙ\u0010HE,˗SMN\f|3}H\n\u0012\u001b ՚\u0018\u0005@Ӷ-g\u0005fڀQүXY^E<͙\u001419<^`Ѳ\fG߭xl`\u001dƙ'd\t`i\tq\u0018M\u0002ٰ\bՕ\n\u0010\u0012\u001a͇&ѝY\u0007\u0017:\u0005̇P(9wdSݦbWړ%~ΰ\u0003\"ҵ#\u0014q\u0006cA\u001f*t,\u001fr՜`ڃ(yY~:uxD)\u0002boBתM\u00198\u0019`\u001e<1\u0004¦w{yPK$\u0007^O^e\u0005;ט\"J\u00074\u000b2(\u0001 ־\u001e6\u001cQwsI\u007fQT\u0007by٥^$\u001a\u0004\u0002BT\u0005|jӎ\u001d\u0018\u001cZ/\"Nq^\u001ce\u0001H(ԅ\u0002\u001e/(+-aFkZI\u0012NOKMf~ŢQ\u0002ǲbܜE%|\u001btȿ\u000e'V+ҋ)[7\b]}Ɂx/P\u000fIg%ss-]1\u0007FͲJZ&;؍L?1@3Jۀ\b\"v2ߙv̵X)$2Y˜\u000f,̞~'-u̐R[Z\fٲ\"qN>ʜXԞ,3E4\u0019زO+͛.@;J̑V;\u0004QΤ{>p0ٳ\u001b\u061ca\u0017\u001d(Rج1\u0016ӬPt=zغz(5iHP\u000e;T\u0007-8Q9̙tLr2ؗ\u00118e9 \u0001 ~ک8Ѡ?%\u0013yTālHo\u0018\u001b6ȺCFF;\u000fz\u007fGԔ\fɯ\u0003jz!nÔ'SghLAͫi<.a.Aˏ><B\u0010w\t~G\b?#,\u009bZπLy% ?æ\u0017$Өl\u000f_Sݦ\u0001Us^\u0019l\u0013Ḯ6ʬw-pkGӓ9mKFVLǸ\rP*y<`Мm&9x9'\u00183P\u0005&>µH\u05ecjK%w\u0014ɞcp\u05ebPGv\u0018́-Tuu?\u0002F\u0013\u0081Qǵ3gG*%Ԍs\u0014y/ G݉k\u0001Kϐ\u000eȖ/"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u0002EZ~ Dm\u0015\fP?Dt4%j", "\u0013", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00038U\u0007)7tk", "1`_.V0Mg", "", "=mD;W,EW*~\b^+\\\u0010/m\u007f1\u000b", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\u000f>I\u0007\u001f7t\u001a?MP;j\u0014%\u0015paB\u00169", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "\nh]6g\u0005", "uH;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIuz^", "\u001aj^A_0G\u001d\u001e\u0010\u0003(-\r\u0012-t\u00042\u0005NJw'Pm\u001d@\u0001.\u0001/", "Ad]1X9L/\"}Xe6\u000b\t\u001dt{7\fN", "\u001aj^A_0Gfbz\nh4\u0001\u00070uI\u0004\u000bJ\t\u001b\u0015.y\u0017>L", "@dR2\\=>`'", "0tU3X9\u001e\\\u0018", "Ad]1X9L1#\u000f\u0004m,\n", "", "5dc X5=S&\rXh<\u0006\u0018/r>.\u0006O\b\u001b Zi\fF\u0004/Eh\u0002)7{\u0010,WP;", "u(9", "@dR2\\=>`'\\\u0005n5\f\t<", "5dc\u001fX*>W*~\bl\n\u0007\u00198t\u007f5:F\u000b&\u001eKx!6t/Bc\u000e/;v\u0016<GAEx4", "0tU3X9\u001e\\\u0018\\\u0005n5\f\t<", "5dc\u000fh-?S&^\u0004]\n\u0007\u00198t\u007f5", "1n\\=_,MS\u0018^\u000ei(\u0006\b\fu\u0001){M\u000fr FZ\nL\u0005%\u0016`y\"", "7rA2a+>h*\t\u000bl\u0016\nx8l\u00040\u007fO\u0001\u0016", "", "u(I", "Ad]1F,@[\u0019\b\n", "\u001aj^A_0Gfbz\nh4\u0001\u00070uI\u0004\u000bJ\t\u001b\u00154o\u000f\u0012", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00038U\u0007)7t\u0004.OK;tCs", "@dR2\\=>A\u0019\u0001\u0003^5\f", "0tU3X9\u001e\\\u0018lz`4|\u0012>", "Ad]1", "3kT:X5M", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxW:\u00012?i\r$@m$w+MDz8'%dp=\u0011l\u0002\u0012],C]JucN{?]{W\u0013N)\u001cZ", "=m29b:>R\u0007~\u0004]", "Ad]1B5']\u000bz~m,\nv?s\u000b(\u0005?", "AdV:X5M", "7mS2k", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n~\u001a\u0013Px\u000eC\u0005n\u0013\\y)@m\u001d\u001cMECk=-jLH>\u0003t(\u0018}#PN\u0018\u0016YWr;#g?tT5\u001c\f]JmlND)\u0018;M\u000b;vJi \u0017DnyRR\u001fK\u0004\u001eK\u0005\u0010mBj[CN=NdsN\td\u001dZI\u0010", ">qT=T9>A\u0019\by^9]\u0013<S\u00106\u0007@\n%\u001bQx", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E2|\u001b&G|c", "=m29b:>R\u0007~\u0004]\u0016\u0006q9W{,\u000b@\u000e\u0005'Uz\u000eEu", "1n]A", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e| \u0015Gv\u00158s,57\b)Fq\u001f>IR?u=s", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKx!\u0006t/Bc\u000e/;v\u0016<\u0017!7t2\u001e\u001co]6\u000ec\nX\u007f6KU^(kV|FiUK", "Bqh X5=", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00038U\u0007)7t\u0003.[SBz\n", "Bqh X5=\u001b}iG]\u0012`x", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004", "Ad]159HO\u0018|vl;", "Ad]159HO\u0018|vl;;\u000f9t\u0007,\u0005Sz\u0015!Ty\u001eKz.5gw\u001eAz\u0016", "Ad]1<4IZ", Global.BLANK, "E`XAX9", "", "=mA2a+>h*\t\u000bl\u0016\ne?f\u0001(\t@\u007f", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "=mBBf7>\\\u0018", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "AdV:", "7", "=m29b:>R", "=m=<J(Bb\u0019\fhn:\b\t8d", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001384U", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|k\u0015SMJr8'^mrAPd<Wt6KVW:&3\u0003F\u0012!^\u0018Wubk_K3uH@h\r=QK<x\n\n%\u0012?s~\f7 Pw$yK25\u001c@e\u0004VHIksi\u001dgf]JC\"#u#$v\u001a\u000f\u001a\u0005Q v\\\u00032=.\u001f\u0005G+Bv%KVw\u001f=\u00050\u001dZ\u007f\u0002\u001b@\"U;}+\u001384?3Z\u000fN\u001d:ot^3XJ)o 9\u0018?IrK", "Bqh X5=2&\t\u0006H3{\t=t", "Bqh X5=2&\t\u0006H3{\t=tG\rf\r\u007f|z7", "Ad]1<4IZ\u0003\bch\u001ex\r>e\r", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n~\u001a\u0013Px\u000eC\u0005n\u0013\\y)@m\u001d\u001cMECk=-jLH>\u0003t(\u0018}#PN\u0018\u0016YWr;#g?tT5\u001c\f]J78BA,\u0012<X\u0006Dh\u000fU\b\n9ypO,vM\u0004$|E22KjgCHQN`9h\u0016h+&\u001bJ-\u0012\u0001\u001d%q\u001b\u0004p\u0002] yV\u00031lX!D94GkjJOxc\u0006U7(I\u000b{\u001c;#Jne", "CoS.g,\u001cS \u0006h^5{", "1k^@X+", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n~\u001a\u0013Px\u000eC\u0005n\u0013\\y)@m\u001d\u001cMECk=-jLH>\u0003t(\u0018}#PN\u0018\u0016YWr;#g?tS'\u001e\u0001#H wF\u0001\t\u00051I\u007fJ>uOy", "CoS.g,\u001cS \u0006h^5{v6o\u0012", "Ag^B_+,S\"}hn:\b\t8d", "1ta X5=S&\rVg+Z\u00109s\u007f\u0016\u000b<\u0010'%", "0tU3X9(`\u0006~\u0004],\u0012\u001a9u\u000e\u0016{I\u007f", "1ta X5=S&\r", "Ag^B_+,S\"}hn:\b\t8d>.\u0006O\b\u001b Zi\fF\u0004/Eh\u0002)7{\u0010,WP;", "Bqh\u001fX:N[\u0019kz\\,\u0001\u001a/r", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kqB", "=mA2V,Bd\u0019^\u0004j<|\u0019/d", "=mA2V,Bd\u0019]zj<|\u0019/d", "@dR2\\=>", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "@dR2\\=>=\"g\u0005P(\u0001\u0018/rm8\nK\u0001 \u0016", "@", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n~\u001a\u0013Px\u000eC\u0005n\u0013\\y)@m\u001d\u001cMECk=-jLF \rm;Uz0\u0011JX9fb\u0002A\u001d\u0012hW,5\u0016\u0014]J4jS;)\u0011\u0002\rh@d\u0012\b_\u00151sr\f@\rLy\u0013\u0005\u0017", ">qT=T9>@\u0019|zb=|\u0016\u0010o\r\u0016\fN\f\u0017 Us\u0018E", "=m29b:>R\u0006~x^0\u000e\t\u0019nh2m<\u0005&\u0017T]\u001eJ\u0002%>X", "@dR2\\=>1\u0015\u000exa0\u0006\u000b", "@dR2\\=>1\u0015\u000exa0\u0006\u000bvJjtz&d\u0007", "@dR2\\=>1\u0015\u000exa0\u0006\u000b\u0019nh2m<\u0005&\u0017T]\u001eJ\u0002%>X", "@dR2\\=>1\u0015\u000exa0\u0006\u000b\u0019nh2m<\u0005&\u0017T]\u001eJ\u0002%>XE\u0002\u001dRz\u000fBI", "=m29b:>R\u0006~x^0\u000e\t\ra\u000f&~D\n\u0019\u0001PX\u0018.r)DY\u000b\u000eG{!.VB", "Bqh\u001fX*>W*~", "Bqh\u001fX*>W*~BI;{m$t\u0006", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "2q^=90Ka(^\u0002^4|\u0012>U\t7\u007fGo\u001a\u00175z\u000e:z&9Y|}7t\u001d\u0012['DZ7\u001eqxb:\u0007p", "5k^/T3\u001cS \u0006^g+|\u001c", "@dR2\\=>7!\n\u0002", "=m49X4>\\(kzm9\u0001\t@e~", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u0010/\u00025|1VSR5&W\u0004E]\u0013j\u0017L:\u0011\u000fbOmOT@\u001d\u00170S\u000b\t>g\u0012 \u001d<ny\f[!OC\u0016\u0006J'wJch\b\u0011\"Uk(s\u0010i&'\u0010!*\u001e\u0001 \u001fq\u001a3\u001b\u0004\u001d\u0012\u0003[wvkQ\"\t\u0002\u0005NvYUIy^\nJj\u0006Pw\t\u000e{_p4vvm1/6b\u0014!", "@dR2\\=>7!\n\u0002H5e\u0013!a\u00047{M", "CoS.g,\u001cS \u0006g^*|\r@e", "CoS.g,\u001cS \u0006g^*|\r@em/\u0006R", "Bqh\u001fX:N[\u0019lzg+|\u0016", "3w_.a+\u001bc\u001a\u007fzk", "CoS.g,\u001cS \u0006Zq7x\u0012.B\u0010)|@\u000e", AdkSettings.PLATFORM_TYPE_MOBILE, "CoS.g,\u001cS \u0006Zq7x\u0012.B\u0010)|@\u000e\u0005\u001eQ\u0002", "7mR\u0010b4IZ\u0019\u000ez]\f\u0010\u0014+n~\u0005\fA\u0002\u0017$#~\u001d<~0Dg", "<@cAX4Ib'", "E`XA8?IO\"}Wn-}\t<C\n0\u0007G\u0001&\u001bQx", "5k^/T3\"\\\u0018~\u000e", "E`XA8?IO\"}Wn-}\t<C\n0\u0007G\u0001&\u001bQxLB\u00014<]\u000731k ;WSJo=\u001e#b_C\u0014c", "=mB2a+", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006d%<Y{/\u0015t\u0012>[C\bA", "5dc\u001ca\u001a>\\\u0018=vg5\u0007\u0018+t\u00042\u0005N", "u(E", "5dc\u001ca\u001a>\\\u0018", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJ%\u0017No\fK\u0005n#Y\u0005 5|s5ISIk\u0001s", "@dV6f;>`\u0007~\u0002^*\fi9rm(\u0005?", "Ad[2V;", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006d%<Y{/\u001bv$=IL9k\n", "=m29b:>R\u0007~\u0002^*\fr8S\u007f1z", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKx!\u0006t/Bc\u000e/;v\u0016<\u0017Q;r4\u001c$v+'\u0007j,L\u0006\u000bPZ](ePr\u0013W\u0003", ">q^0X:L@\u0019\r\u000be;j\t6e}7i@\n\u0016", "7f]<e,=>\u0015\fvf", "Ad[2V;+S'\u000f\u0002m", "=mA2V,Bd\u0019", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006d%<Y{/\u0015t\u0012>[C\u0007A", "5dc\u001ca\u0019>Q\u0019\u0003\f^jx\u00128o\u000f$\u000bD\u000b %", "5dc\u001ca\u0019>Q\u0019\u0003\f^", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJ%\u0017No\fK\u0005n#Y\u0005 5|s5ISIk\u007fs", "=mA2V,Bd\u0019\\vm*\u007f\r8g", "5dc\u001ca\u0019>Q\u0019\u0003\f^\nx\u0018-h\u00041}~|  Q~\nKz/>g", "5dc\u001ca\u0019>Q\u0019\u0003\f^\nx\u0018-h\u00041}", "=mA2V,Bd\u0019h\bG<\u0004\u0010", "5dc\u001ca\u0019>Q\u0019\u0003\f^\u0016\nq?l\u0007fwI\n!&C~\u0012F\u007f3", "5dc\u001ca\u0019>Q\u0019\u0003\f^\u0016\nq?l\u0007", "@dV6f;>`\u0007~\u0002^*\fi9rl(y@\u0005(\u0017", "=m29b:>R\u0007~\u0002^*\fr8R\u007f&{D\u0012\u0017", ">q^0X:L@\u0019\r\u000be;j\t6e}7h@~\u0017\u001bXo", ">q^0X:L@\u0019\r\u000be;j\t6e}7h@~\u0017\u001bXowI_5<`", ">q^0X:L@\u0019\r\u000be;j\t6e}7h@~\u0017\u001bXok8\u0006#8]\u0007\"", "=mD;W,EW*~\b^+\\\u0010/m\u007f1\u000b-\u0001\u0015\u0017K\u0001\u000e\u001ar.3Y\u0005'3|\u001a8V!EtB-\"x_H\u0011p", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006`.\u0013U\u0007\u001e7t\u001d*\\GEt\u0012(\u001evpF\u0017a;X\u0004|", ">`a.`", "7mc2e5:Z\u0006~\tn3\f", "", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "5dc\u001ca\u001cGR\u0019\u0006~o,\n\t.E\u0007(\u0004@\n&\u0004Gm\u000e@\b%\u0013U\u0007\u001e7t\u001d*\\GEt\u0012(\u001evpF\u0017a;X\u0004eCUW6kN\u0002A\u001e\u001bh", "\u001aj^A_0G\u001d\u001e\u0010\u0003(-\r\u0012-t\u00042\u0005NJw'Pm\u001d@\u0001.\u0003/", "7sT?T;H`", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00038U\u0007)7ty=MP7z>+j", "-b[<f,\u001cO)\rz", "1k^@X\n:c'~", "5dc\u0010_6LSvz\u000bl,", "u(;7T=:\u001d z\u0004`uk\f<o\u0012$xG\u0001l", "Ad]18?<S$\u000e~h5", "5dc X5=3,|zi;\u0001\u00138", "@dR2\\=>3,|zi;\u0001\u00138", "5dc\u001fX*>W*~Zq*|\u0014>i\n1", "1k^@X\u000f:\\\u0018\u0006zk", "=m29b:>R|}zf7\u0007\u0018/n\u000f", "1k^@X", "1`d@X", "1`]0X3", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e| \u0015Gv\u00158\u0006)?b]35m!=QMDA", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJt\u0013Pm\u000eC}!D]\b)\u0017\u0001\u0014.XR?u=s", "uKY.i(\bc(\u0003\u0002(*\u0007\u0012-u\r5{I\u0010`tCx\f<},1h\u0002*@M),MNJo>'j,R", "1`]0X3\"[$\u0006", "1`]0X3\"[$\u00069d6\f\u00103n\u0013\"yJ\u000e!'Vs\u0017<\u0005\u001f3c\u000b ", "1k^@X\u0016K1\u0015\bx^3`\u0011:l", "7me<^,\u001cZ#\rzA(\u0006\b6e\r", "7me<^,(\\v\u0006\u0005l,", "6`]1_,K", ";`a863Ha\u0019}", ";`a86(GQ\u0019\u0006\u0002^+", ";`a86(GQ\u0019\u0006\u0002Z;\u0001\u00138S\u000f$\tO\u0001\u0016", "1n\\=_,MSv\u0006\u0005l,f\u0016\ra\t&{G", "7r2<a-EO(~y=9\u0007\u0014\u0019l~(\nO", "1n\\=_,MSv\u0006\u0005l,", "Ad]1X9L1)\f", "1n\\=_,MSvz\u0004\\,\u0004", "1k^@X\u0013B\\\u001f~yE0\u000b\u0018", ";`a843E3!\n\nr\n|\u00106s[6YG\u000b%\u0017F", ":`bAF,@[\u0019\b\n", "@d\\<i,.\\$\f\u0005\\,\u000b\u0017/d_/{H\u0001 &U", "1`]0X3,c'\nzg+|\b\u001ce}(\u007fQ\u0001\u0004\u0017S\u007f\u000eJ\u00063", "@dbB`,+S\u0017~~o,\nr8C\u00072\n@\u007ft\u001aCx\u0017<}", "@dbB`,,S\"}zk\u0016\u0006f+n}(\u0003G\u0001\u0016tJk\u0017Ev,", "@dbB`,0O\u001d\u000ezk\u0016\u0006f6o\u000e(z\u001e\u0004\u0013 Po\u0015", "@dR2\\=>`", "7r29b:>Ry\t\bL,\u0006\b", "7r29b:>Ry\t\bL,\u0006\bma\t1\u0006O|&\u001bQx\u001c", "7r29b:>Ry\t\bL,\u0006\by", "uI\u0018'", "7r29b:>Ry\t\bK,z\t3v\u007f", "7r29b:>Ry\t\bK,z\t3v\u007ffwI\n!&C~\u0012F\u007f3", "7r29b:>Ry\t\bK,z\t3v\u007fr", "7r29b:>R", "Ad]1X9L/\"}Xe6\u000b\t\u001dt{7\fN^'$", "7r4:c;R", "7r4:c;R\u0012\u0015\b\u0004h;x\u00183o\t6", "6`b\u0012_,FS\"\u000e\t", "6`b\u0012_,FS\"\u000e\t\u001d2\u0007\u00186i\t;u>\u000b$!W~\u0012Ev3/W\b-7", "7r22_3']\"^\u0003i;\u0011", "4h]1F,@[\u0019\b\nL,\u0006\b", "7c", "AsP?g\rK]!", "4h]1F,@[\u0019\b\nK,z\t3v\u007f", "4h]1F,@[\u0019\b\n;<}\n/r_1z", "1ta?X5M0)\u007f{^9\\\u0012.C\n8\u0005O\u0001$", ";ne2F,@[\u0019\b\n;<}\n/r_1z/\u000b\u0005\"Gm\u0012=z%4C\u000b\u00073{%", "CoS.g,,S\"}zk:Z\u0013?n\u000f(\t$\u0002}!Yo\u001b", "D`[BX", "CoS.g,+S\u0017~~o,\n\u0017\ro\u00101\u000b@\u000ez\u0018.y <\u0004", "BnBAe0GU", "", "BnBAe0GUw~wn.", "BnBAe0GUw~wn.;\u000f9t\u0007,\u0005Sz\u0015!Ty\u001eKz.5gw\u001eAz\u0016", "1gT0^\u001a>U!~\u0004m\u001a\f\u0016?c\u000f8\t@d (C|\u00128\u007f4C", "0h]16(GQ\u0019\u0006\u0002Z;\u0001\u00138F\u00101h@\u000f'\u001eV", "\u001aj^A_0G\u001d&~{e,z\u0018xK`8\u0005>\u0010\u001b!P=c", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%Sc\u001es =TGD5A\u001e\u0016oa7\u0016-\u0012/\u00070E[R6e(", "=m2.a*>Z z\nb6\u0006f2a\t1{Gm\u0017%Wv\u001d ~0<8\b\tA|s*TJ", "1n]AX?M", "=m2.a*>Z z\nb6\u0006f2a\t1{Gm\u0017%Wv\u001d ~0<8\b\tA|s*TJ\u0003;.,tDL\f", "uKY.i(\bZ\u0015\b|(\u001b\u007f\u00169w{%\u0003@V}\u001cC\u0001\n\u0006}!>[G\n4r\u0016,\\\u0019\"q>-\u001clj\u0003\u0005m9X\u00076KUN:&0|J\u001e\"i\u0012W+j\u000fbP$\u0002S\rbx", "0h]16(GQ\u0019\u0006\u0002Z;\u0001\u00138F\u00101", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%S\u0007<i'*\u0017J7t6g~ef9\u0005r\u0002\u0012]-Q[U0e\u001cwN\u001c[[\u001eW)\u001c\tcJ28%G(\u0006;M\fD6V", "=m2.a*>Z z\nb6\u0006l7p\u0007\u0007\u0006)\u000b&tCv\u0015", "!d]159HO\u0018|vl;", "\u0010tU3X9>Rv\u0002vg5|\u0010\u0013t\u007f5wO\u000b$", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public class BufferedChannel<E> implements Channel<E> {
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private final int capacity;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    public final Function1<E, Unit> onUndeliveredElement;
    private final Function3<SelectInstance<?>, Object, Object, Function3<Throwable, Object, CoroutineContext, Unit>> onUndeliveredElementReceiveCancellationConstructor;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;
    private static final /* synthetic */ AtomicLongFieldUpdater sendersAndCloseStatus$volatile$FU = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "sendersAndCloseStatus$volatile");
    private static final /* synthetic */ AtomicLongFieldUpdater receivers$volatile$FU = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "receivers$volatile");
    private static final /* synthetic */ AtomicLongFieldUpdater bufferEnd$volatile$FU = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "bufferEnd$volatile");
    private static final /* synthetic */ AtomicLongFieldUpdater completedExpandBuffersAndPauseFlag$volatile$FU = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "completedExpandBuffersAndPauseFlag$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater sendSegment$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "sendSegment$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater receiveSegment$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "receiveSegment$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater bufferEndSegment$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "bufferEndSegment$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater _closeCause$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "_closeCause$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater closeHandler$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "closeHandler$volatile");

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯD\u001d<K!&i\u0016DLc\u000b\u0004I\u00066\f6B\rӬ4ߚ\u007f\u0007|jA0RnP.XV2\u000f\u0002{<řc$\u007fIC٥\"}0\u0010WNmgvJh\u000bK\u000f\u001c\u0016\u0001j2O[ޏ_(ƁbH\u007fACM&މg_%63 r'أ}\u0007\u0007\u001b8JX\u0003\tKc\f@7\u0007\u0098zň\u0011M\u0013#Z\fL*\u0019\u001e\u000bn\u00156\u0011\u0017kEG#1prX5kH\u0003]\u000fVT]˙%nN/NEM\u0015Sb3\u000b`kW\u0003m\u0003\u0004ݞ'Ҋ++W\u0006 Pf\u0013,\u0015Yc=e\u00012t\ta`\u0012(Yd\u0014O^\u001c@w)\u000bSPL\u0014\u0014=`.[.-\bV?\u0003\nk@\u0007\u061c%ۤ\u007fѐe6%=HD9R3f\u007fhk\u001d\\Q\u0014\u0005C̔ţ\u0005n/v\u001d\u0012n13T&e\u0002_N@`P XkqZ͒n͆.\u00048ϚPC\n\u0016F\u001f59k9Q(\u0002\u0001vJ>ϻ\u0011¾lSqɭ͛D?"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u0002EZ~ Dm\u0015\fP?Dt4%SEq:\bc9Nu\u0005JHW5\\YVL\u0014\u001fV\u001dX8b", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00038U\u0007)7ty=MP7z>+j", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E2|\u001b&G|c", "\nh]6g\u0005", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n~\u001a\u0013Px\u000eC\u0005n\u0012i~!7z\u0016-+F7t=\u001e\u001c>%*", "@dR2\\=>@\u0019\r\u000be;", "", "1n]A\\5NO(\u0003\u0005g", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e| \u0015Gv\u00158s,57\b)Fq\u001f>IR?u=\u0002\u001dsh\u000f", "", "6`b\u001bX?M", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "=m29b:>R{z\tG,\u0010\u0018", "6`b\u001bX?M=\"g\u0005P(\u0001\u0018/rm8\nK\u0001 \u0016", "AdV:X5M", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00038U\u0007)7t\u0004.OK;tCs", "7mS2k", "", "@", "", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n~\u001a\u0013Px\u000eC\u0005n\u0013\\y)@m\u001d\u001cMECk=-jLF \rm;Uz0\u0011JX9fb\u0002A\u001d\u0012hW,5\u0016\u0014]J4jS;)\u0011\u0002\rh@d\u0012\b_\u00151sr\f@\rLy\u0013\u0005\u0017", "7me<^,(\\vz\u0004\\,\u0004\u0010+t\u00042\u0005", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\u00135[\u0006 @|k", "=m29b:>R{z\tG,\u0010\u0018\u0018oq$\u007fO\u0001$\u0005W}\u0019<\u007f$", "<dgA", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "Bqh\u001fX:N[\u0019avl\u0015|\u001c>", "3kT:X5M", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "Bqh\u001fX:N[\u0019avl\u0015|\u001c>O\t\u0006\u0003J\u000f\u0017\u0016%r\nE\u007f%<", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    private final class BufferedChannelIterator implements ChannelIterator<E>, Waiter {
        private CancellableContinuationImpl<? super Boolean> continuation;
        private Object receiveResult = BufferedChannelKt.NO_RECEIVE_RESULT;

        public BufferedChannelIterator() {
        }

        public final Object hasNextOnNoWaiterSuspend(ChannelSegment<E> channelSegment, int i2, long j2, Continuation<? super Boolean> continuation) throws Throwable {
            Boolean boolBoxBoolean;
            BufferedChannel<E> bufferedChannel = BufferedChannel.this;
            CancellableContinuationImpl orCreateCancellableContinuation = CancellableContinuationKt.getOrCreateCancellableContinuation(IntrinsicsKt.intercepted(continuation));
            try {
                this.continuation = orCreateCancellableContinuation;
                Object objUpdateCellReceive = bufferedChannel.updateCellReceive(channelSegment, i2, j2, this);
                if (objUpdateCellReceive == BufferedChannelKt.SUSPEND) {
                    bufferedChannel.prepareReceiverForSuspension(this, channelSegment, i2);
                } else {
                    Function3 function3BindCancellationFun = null;
                    function3BindCancellationFun = null;
                    if (objUpdateCellReceive == BufferedChannelKt.FAILED) {
                        if (j2 < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                            channelSegment.cleanPrev();
                        }
                        ChannelSegment channelSegment2 = (ChannelSegment) BufferedChannel.getReceiveSegment$volatile$FU().get(bufferedChannel);
                        while (true) {
                            if (bufferedChannel.isClosedForReceive()) {
                                onClosedHasNextNoWaiterSuspend();
                                break;
                            }
                            long andIncrement = BufferedChannel.getReceivers$volatile$FU().getAndIncrement(bufferedChannel);
                            long j3 = andIncrement / ((long) BufferedChannelKt.SEGMENT_SIZE);
                            int i3 = (int) (andIncrement % ((long) BufferedChannelKt.SEGMENT_SIZE));
                            if (channelSegment2.id != j3) {
                                ChannelSegment channelSegmentFindSegmentReceive = bufferedChannel.findSegmentReceive(j3, channelSegment2);
                                if (channelSegmentFindSegmentReceive != null) {
                                    channelSegment2 = channelSegmentFindSegmentReceive;
                                }
                            }
                            Object objUpdateCellReceive2 = bufferedChannel.updateCellReceive(channelSegment2, i3, andIncrement, this);
                            if (objUpdateCellReceive2 == BufferedChannelKt.SUSPEND) {
                                BufferedChannelIterator bufferedChannelIterator = this instanceof Waiter ? this : null;
                                if (bufferedChannelIterator != null) {
                                    bufferedChannel.prepareReceiverForSuspension(bufferedChannelIterator, channelSegment2, i3);
                                }
                            } else if (objUpdateCellReceive2 == BufferedChannelKt.FAILED) {
                                if (andIncrement < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                                    channelSegment2.cleanPrev();
                                }
                            } else {
                                if (objUpdateCellReceive2 == BufferedChannelKt.SUSPEND_NO_WAITER) {
                                    throw new IllegalStateException("unexpected".toString());
                                }
                                channelSegment2.cleanPrev();
                                this.receiveResult = objUpdateCellReceive2;
                                this.continuation = null;
                                boolBoxBoolean = Boxing.boxBoolean(true);
                                Function1<E, Unit> function1 = bufferedChannel.onUndeliveredElement;
                                if (function1 != null) {
                                    function3BindCancellationFun = bufferedChannel.bindCancellationFun(function1, objUpdateCellReceive2);
                                }
                            }
                        }
                    } else {
                        channelSegment.cleanPrev();
                        this.receiveResult = objUpdateCellReceive;
                        this.continuation = null;
                        boolBoxBoolean = Boxing.boxBoolean(true);
                        Function1<E, Unit> function12 = bufferedChannel.onUndeliveredElement;
                        if (function12 != null) {
                            function3BindCancellationFun = bufferedChannel.bindCancellationFun(function12, objUpdateCellReceive);
                        }
                    }
                    orCreateCancellableContinuation.resume(boolBoxBoolean, (Function3<? super Throwable, ? super Boolean, ? super CoroutineContext, Unit>) function3BindCancellationFun);
                }
                Object result = orCreateCancellableContinuation.getResult();
                if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(continuation);
                }
                return result;
            } catch (Throwable th) {
                orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
                throw th;
            }
        }

        private final boolean onClosedHasNext() throws Throwable {
            this.receiveResult = BufferedChannelKt.getCHANNEL_CLOSED();
            Throwable closeCause = BufferedChannel.this.getCloseCause();
            if (closeCause == null) {
                return false;
            }
            throw StackTraceRecoveryKt.recoverStackTrace(closeCause);
        }

        public final void onClosedHasNextNoWaiterSuspend() {
            CancellableContinuationImpl<? super Boolean> cancellableContinuationImpl = this.continuation;
            Intrinsics.checkNotNull(cancellableContinuationImpl);
            this.continuation = null;
            this.receiveResult = BufferedChannelKt.getCHANNEL_CLOSED();
            Throwable closeCause = BufferedChannel.this.getCloseCause();
            if (closeCause == null) {
                Result.Companion companion = Result.Companion;
                cancellableContinuationImpl.resumeWith(Result.m8980constructorimpl(false));
                return;
            }
            CancellableContinuationImpl<? super Boolean> cancellableContinuationImpl2 = cancellableContinuationImpl;
            if (DebugKt.getRECOVER_STACK_TRACES() && (cancellableContinuationImpl2 instanceof CoroutineStackFrame)) {
                closeCause = StackTraceRecoveryKt.recoverFromStackFrame(closeCause, cancellableContinuationImpl2);
            }
            Result.Companion companion2 = Result.Companion;
            cancellableContinuationImpl2.resumeWith(Result.m8980constructorimpl(ResultKt.createFailure(closeCause)));
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        public Object hasNext(Continuation<? super Boolean> continuation) throws Throwable {
            boolean zOnClosedHasNext = true;
            if (this.receiveResult == BufferedChannelKt.NO_RECEIVE_RESULT || this.receiveResult == BufferedChannelKt.getCHANNEL_CLOSED()) {
                BufferedChannel<E> bufferedChannel = BufferedChannel.this;
                ChannelSegment<E> channelSegment = (ChannelSegment) BufferedChannel.getReceiveSegment$volatile$FU().get(bufferedChannel);
                while (true) {
                    if (bufferedChannel.isClosedForReceive()) {
                        zOnClosedHasNext = onClosedHasNext();
                        break;
                    }
                    long andIncrement = BufferedChannel.getReceivers$volatile$FU().getAndIncrement(bufferedChannel);
                    long j2 = andIncrement / ((long) BufferedChannelKt.SEGMENT_SIZE);
                    int i2 = (int) (andIncrement % ((long) BufferedChannelKt.SEGMENT_SIZE));
                    if (channelSegment.id != j2) {
                        ChannelSegment<E> channelSegmentFindSegmentReceive = bufferedChannel.findSegmentReceive(j2, channelSegment);
                        if (channelSegmentFindSegmentReceive == null) {
                            continue;
                        } else {
                            channelSegment = channelSegmentFindSegmentReceive;
                        }
                    }
                    Object objUpdateCellReceive = bufferedChannel.updateCellReceive(channelSegment, i2, andIncrement, null);
                    if (objUpdateCellReceive == BufferedChannelKt.SUSPEND) {
                        throw new IllegalStateException("unreachable".toString());
                    }
                    if (objUpdateCellReceive == BufferedChannelKt.FAILED) {
                        if (andIncrement < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                            channelSegment.cleanPrev();
                        }
                    } else {
                        if (objUpdateCellReceive == BufferedChannelKt.SUSPEND_NO_WAITER) {
                            return hasNextOnNoWaiterSuspend(channelSegment, i2, andIncrement, continuation);
                        }
                        channelSegment.cleanPrev();
                        this.receiveResult = objUpdateCellReceive;
                    }
                }
            }
            return Boxing.boxBoolean(zOnClosedHasNext);
        }

        @Override // kotlinx.coroutines.Waiter
        public void invokeOnCancellation(Segment<?> segment, int i2) {
            CancellableContinuationImpl<? super Boolean> cancellableContinuationImpl = this.continuation;
            if (cancellableContinuationImpl != null) {
                cancellableContinuationImpl.invokeOnCancellation(segment, i2);
            }
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        public E next() throws Throwable {
            E e2 = (E) this.receiveResult;
            if (e2 == BufferedChannelKt.NO_RECEIVE_RESULT) {
                throw new IllegalStateException("`hasNext()` has not been invoked".toString());
            }
            this.receiveResult = BufferedChannelKt.NO_RECEIVE_RESULT;
            if (e2 != BufferedChannelKt.getCHANNEL_CLOSED()) {
                return e2;
            }
            throw StackTraceRecoveryKt.recoverStackTrace(BufferedChannel.this.getReceiveException());
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0016O\n8v4e%+\u0015wF\u0010\u00175\\]^\"f\bw\u0019bwZwlW\u0001-z\u0002\f{Kad(OK0FC!d_9}5\b\f3\u0010\u0002*")
        @InterfaceC1492Gx
        public /* synthetic */ Object next(Continuation continuation) {
            return ChannelIterator.DefaultImpls.next(this, continuation);
        }

        public final boolean tryResumeHasNext(E e2) {
            CancellableContinuationImpl<? super Boolean> cancellableContinuationImpl = this.continuation;
            Intrinsics.checkNotNull(cancellableContinuationImpl);
            this.continuation = null;
            this.receiveResult = e2;
            CancellableContinuationImpl<? super Boolean> cancellableContinuationImpl2 = cancellableContinuationImpl;
            Function1<E, Unit> function1 = BufferedChannel.this.onUndeliveredElement;
            return BufferedChannelKt.tryResume0(cancellableContinuationImpl2, true, function1 != null ? BufferedChannel.this.bindCancellationFun(function1, e2) : null);
        }

        public final void tryResumeHasNextOnClosedChannel() {
            CancellableContinuationImpl<? super Boolean> cancellableContinuationImpl = this.continuation;
            Intrinsics.checkNotNull(cancellableContinuationImpl);
            this.continuation = null;
            this.receiveResult = BufferedChannelKt.getCHANNEL_CLOSED();
            Throwable closeCause = BufferedChannel.this.getCloseCause();
            if (closeCause == null) {
                Result.Companion companion = Result.Companion;
                cancellableContinuationImpl.resumeWith(Result.m8980constructorimpl(false));
                return;
            }
            CancellableContinuationImpl<? super Boolean> cancellableContinuationImpl2 = cancellableContinuationImpl;
            if (DebugKt.getRECOVER_STACK_TRACES() && (cancellableContinuationImpl2 instanceof CoroutineStackFrame)) {
                closeCause = StackTraceRecoveryKt.recoverFromStackFrame(closeCause, cancellableContinuationImpl2);
            }
            Result.Companion companion2 = Result.Companion;
            cancellableContinuationImpl2.resumeWith(Result.m8980constructorimpl(ResultKt.createFailure(closeCause)));
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b<K\u0007\"2\u0015\u007f\u0007tjAӄLe^.Zݷ2\u000fy\u0002<řa$\bّkUH|b\u001c_Xug\u0007Pj\rS\u000f4\u0018'k߽MW~` \u0013z]}FKM\u001eEih\u0003?\u001d$B\">z3\u000bJ.V\u001b\u000fzqWR܌/\u0011\u0006HR%S\u0015\u001c\"\u0006l\"/\u001f֔kT>ԟ\u0005_@41\tݬF["}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u0002EZ~ Dm\u0015\fP?Dt4%SVaB\u0006@9Xr&EH\\;2", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E2|\u001b&G|c", "1n]A", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e| \u0015Gv\u00158s,57\b)Fq\u001f>IR?u=s", "", "\nh]6g\u0005", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n^\u0013 Eo\u0015Cr\"<Y[*@|\u001a7]?Jo>'j,R", "5dc\u0010b5M", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJt\u0013Pm\u000eC}!2`}}Av%2VS7z8(\u001e>", "7me<^,(\\vz\u0004\\,\u0004\u0010+t\u00042\u0005", "", "AdV:X5M", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\u00135[\u0006 @|k", "7mS2k", "", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    private static final class SendBroadcast implements Waiter {
        private final /* synthetic */ CancellableContinuationImpl<Boolean> $$delegate_0;
        private final CancellableContinuation<Boolean> cont;

        /* JADX WARN: Multi-variable type inference failed */
        public SendBroadcast(CancellableContinuation<? super Boolean> cancellableContinuation) {
            Intrinsics.checkNotNull(cancellableContinuation, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlin.Boolean>");
            this.$$delegate_0 = (CancellableContinuationImpl) cancellableContinuation;
            this.cont = cancellableContinuation;
        }

        public final CancellableContinuation<Boolean> getCont() {
            return this.cont;
        }

        @Override // kotlinx.coroutines.Waiter
        public void invokeOnCancellation(Segment<?> segment, int i2) {
            this.$$delegate_0.invokeOnCancellation(segment, i2);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.BufferedChannel$bindCancellationFun$2 */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function3<Throwable, E, CoroutineContext, Unit> {
        AnonymousClass2(Object obj) {
            super(3, obj, BufferedChannel.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th, Object obj, CoroutineContext coroutineContext) {
            invoke2(th, obj, coroutineContext);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(Throwable th, E e2, CoroutineContext coroutineContext) {
            ((BufferedChannel) this.receiver).onCancellationImplDoNotCall(th, e2, coroutineContext);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.BufferedChannel$bindCancellationFunResult$1 */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function3<Throwable, ChannelResult<? extends E>, CoroutineContext, Unit> {
        AnonymousClass1(Object obj) {
            super(3, obj, BufferedChannel.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th, Object obj, CoroutineContext coroutineContext) {
            m10494invoke5_sEAP8(th, ((ChannelResult) obj).m10511unboximpl(), coroutineContext);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke-5_sEAP8 */
        public final void m10494invoke5_sEAP8(Throwable th, Object obj, CoroutineContext coroutineContext) {
            ((BufferedChannel) this.receiver).m10488onCancellationChannelResultImplDoNotCall5_sEAP8(th, obj, coroutineContext);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.BufferedChannel$receiveImpl$1 */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class C13861 implements Function3 {
        public static final C13861 INSTANCE = ;

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((ChannelSegment) obj, ((Number) obj2).intValue(), ((Number) obj3).longValue());
        }

        public final Void invoke(ChannelSegment<E> channelSegment, int i2, long j2) {
            throw new IllegalStateException("unexpected".toString());
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.BufferedChannel$sendImpl$1 */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class C13871 implements Function4 {
        public static final C13871 INSTANCE = ;

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return invoke((ChannelSegment<Object>) obj, ((Number) obj2).intValue(), obj3, ((Number) obj4).longValue());
        }

        public final Void invoke(ChannelSegment<E> channelSegment, int i2, E e2, long j2) {
            throw new IllegalStateException("unexpected".toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BufferedChannel(int i2, Function1<? super E, Unit> function1) {
        this.capacity = i2;
        this.onUndeliveredElement = function1;
        if (i2 < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i2 + ", should be >=0").toString());
        }
        this.bufferEnd$volatile = BufferedChannelKt.initialBufferEnd(i2);
        this.completedExpandBuffersAndPauseFlag$volatile = getBufferEndCounter();
        ChannelSegment channelSegment = new ChannelSegment(0L, null, this, 3);
        this.sendSegment$volatile = channelSegment;
        this.receiveSegment$volatile = channelSegment;
        if (isRendezvousOrUnlimited()) {
            channelSegment = BufferedChannelKt.NULL_SEGMENT;
            Intrinsics.checkNotNull(channelSegment, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = channelSegment;
        this.onUndeliveredElementReceiveCancellationConstructor = function1 != 0 ? new Function3() { // from class: kotlinx.coroutines.channels.BufferedChannel$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BufferedChannel.onUndeliveredElementReceiveCancellationConstructor$lambda$57$lambda$56(this.f$0, (SelectInstance) obj, obj2, obj3);
            }
        } : null;
        this._closeCause$volatile = BufferedChannelKt.NO_CLOSE_CAUSE;
    }

    public /* synthetic */ BufferedChannel(int i2, Function1 function1, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, (i3 & 2) != 0 ? null : function1);
    }

    public final Function3<Throwable, Object, CoroutineContext, Unit> bindCancellationFun(final Function1<? super E, Unit> function1, final E e2) {
        return new Function3() { // from class: kotlinx.coroutines.channels.BufferedChannel$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BufferedChannel.bindCancellationFun$lambda$89(function1, e2, (Throwable) obj, obj2, (CoroutineContext) obj3);
            }
        };
    }

    public final KFunction<Unit> bindCancellationFun(Function1<? super E, Unit> function1) {
        return new AnonymousClass2(this);
    }

    public static final Unit bindCancellationFun$lambda$89(Function1 function1, Object obj, Throwable th, Object obj2, CoroutineContext coroutineContext) {
        OnUndeliveredElementKt.callUndeliveredElement(function1, obj, coroutineContext);
        return Unit.INSTANCE;
    }

    public final KFunction<Unit> bindCancellationFunResult(Function1<? super E, Unit> function1) {
        return new AnonymousClass1(this);
    }

    private final boolean bufferOrRendezvousSend(long j2) {
        return j2 < getBufferEndCounter() || j2 < getReceiversCounter$kotlinx_coroutines_core() + ((long) this.capacity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void cancelSuspendedReceiveRequests(ChannelSegment<E> channelSegment, long j2) {
        Object objM10541constructorimpl$default = InlineList.m10541constructorimpl$default(null, 1, null);
        loop0: while (channelSegment != null) {
            for (int i2 = BufferedChannelKt.SEGMENT_SIZE - 1; -1 < i2; i2--) {
                if ((channelSegment.id * ((long) BufferedChannelKt.SEGMENT_SIZE)) + ((long) i2) < j2) {
                    break loop0;
                }
                while (true) {
                    Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i2);
                    if (state$kotlinx_coroutines_core != null && state$kotlinx_coroutines_core != BufferedChannelKt.IN_BUFFER) {
                        if (!(state$kotlinx_coroutines_core instanceof WaiterEB)) {
                            if (!(state$kotlinx_coroutines_core instanceof Waiter)) {
                                break;
                            }
                            if (channelSegment.casState$kotlinx_coroutines_core(i2, state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                                objM10541constructorimpl$default = InlineList.m10546plusFjFbRPM(objM10541constructorimpl$default, state$kotlinx_coroutines_core);
                                channelSegment.onCancelledRequest(i2, true);
                                break;
                            }
                        } else {
                            if (channelSegment.casState$kotlinx_coroutines_core(i2, state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                                objM10541constructorimpl$default = InlineList.m10546plusFjFbRPM(objM10541constructorimpl$default, ((WaiterEB) state$kotlinx_coroutines_core).waiter);
                                channelSegment.onCancelledRequest(i2, true);
                                break;
                            }
                        }
                    } else {
                        if (channelSegment.casState$kotlinx_coroutines_core(i2, state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                            channelSegment.onSlotCleaned();
                            break;
                        }
                    }
                }
            }
            channelSegment = (ChannelSegment) channelSegment.getPrev();
        }
        if (objM10541constructorimpl$default != null) {
            if (!(objM10541constructorimpl$default instanceof ArrayList)) {
                resumeReceiverOnClosedChannel((Waiter) objM10541constructorimpl$default);
                return;
            }
            Intrinsics.checkNotNull(objM10541constructorimpl$default, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
            ArrayList arrayList = (ArrayList) objM10541constructorimpl$default;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                resumeReceiverOnClosedChannel((Waiter) arrayList.get(size));
            }
        }
    }

    private final ChannelSegment<E> closeLinkedList() {
        Object obj = bufferEndSegment$volatile$FU.get(this);
        ChannelSegment channelSegment = (ChannelSegment) sendSegment$volatile$FU.get(this);
        if (channelSegment.id > ((ChannelSegment) obj).id) {
            obj = channelSegment;
        }
        ChannelSegment channelSegment2 = (ChannelSegment) receiveSegment$volatile$FU.get(this);
        if (channelSegment2.id > ((ChannelSegment) obj).id) {
            obj = channelSegment2;
        }
        return (ChannelSegment) ConcurrentLinkedListKt.close((ConcurrentLinkedListNode) obj);
    }

    private final void completeCancel(long j2) {
        removeUnprocessedElements(completeClose(j2));
    }

    private final ChannelSegment<E> completeClose(long j2) {
        ChannelSegment<E> channelSegmentCloseLinkedList = closeLinkedList();
        if (isConflatedDropOldest()) {
            long jMarkAllEmptyCellsAsClosed = markAllEmptyCellsAsClosed(channelSegmentCloseLinkedList);
            if (jMarkAllEmptyCellsAsClosed != -1) {
                dropFirstElementUntilTheSpecifiedCellIsInTheBuffer(jMarkAllEmptyCellsAsClosed);
            }
        }
        cancelSuspendedReceiveRequests(channelSegmentCloseLinkedList, j2);
        return channelSegmentCloseLinkedList;
    }

    private final void completeCloseOrCancel() {
        isClosedForSend();
    }

    private final void expandBuffer() {
        if (isRendezvousOrUnlimited()) {
            return;
        }
        ChannelSegment<E> channelSegment = (ChannelSegment) bufferEndSegment$volatile$FU.get(this);
        while (true) {
            long andIncrement = bufferEnd$volatile$FU.getAndIncrement(this);
            long j2 = andIncrement / ((long) BufferedChannelKt.SEGMENT_SIZE);
            if (getSendersCounter$kotlinx_coroutines_core() <= andIncrement) {
                if (channelSegment.id < j2 && channelSegment.getNext() != 0) {
                    moveSegmentBufferEndToSpecifiedOrLast(j2, channelSegment);
                }
                incCompletedExpandBufferAttempts$default(this, 0L, 1, null);
                return;
            }
            if (channelSegment.id != j2) {
                ChannelSegment<E> channelSegmentFindSegmentBufferEnd = findSegmentBufferEnd(j2, channelSegment, andIncrement);
                if (channelSegmentFindSegmentBufferEnd == null) {
                    continue;
                } else {
                    channelSegment = channelSegmentFindSegmentBufferEnd;
                }
            }
            if (updateCellExpandBuffer(channelSegment, (int) (andIncrement % ((long) BufferedChannelKt.SEGMENT_SIZE)), andIncrement)) {
                incCompletedExpandBufferAttempts$default(this, 0L, 1, null);
                return;
            }
            incCompletedExpandBufferAttempts$default(this, 0L, 1, null);
        }
    }

    private final ChannelSegment<E> findSegmentBufferEnd(long j2, ChannelSegment<E> channelSegment, long j3) {
        Object objFindSegmentInternal;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = bufferEndSegment$volatile$FU;
        Function2 function2 = (Function2) BufferedChannelKt.createSegmentFunction();
        loop0: while (true) {
            objFindSegmentInternal = ConcurrentLinkedListKt.findSegmentInternal(channelSegment, j2, function2);
            if (!SegmentOrClosed.m10558isClosedimpl(objFindSegmentInternal)) {
                Segment segmentM10556getSegmentimpl = SegmentOrClosed.m10556getSegmentimpl(objFindSegmentInternal);
                while (true) {
                    Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                    if (segment.id >= segmentM10556getSegmentimpl.id) {
                        break loop0;
                    }
                    if (!segmentM10556getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, segment, segmentM10556getSegmentimpl)) {
                        if (segment.decPointers$kotlinx_coroutines_core()) {
                            segment.remove();
                        }
                    } else if (segmentM10556getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        segmentM10556getSegmentimpl.remove();
                    }
                }
            } else {
                break;
            }
        }
        if (SegmentOrClosed.m10558isClosedimpl(objFindSegmentInternal)) {
            completeCloseOrCancel();
            moveSegmentBufferEndToSpecifiedOrLast(j2, channelSegment);
            incCompletedExpandBufferAttempts$default(this, 0L, 1, null);
            return null;
        }
        ChannelSegment<E> channelSegment2 = (ChannelSegment) SegmentOrClosed.m10556getSegmentimpl(objFindSegmentInternal);
        if (channelSegment2.id <= j2) {
            if (!DebugKt.getASSERTIONS_ENABLED() || channelSegment2.id == j2) {
                return channelSegment2;
            }
            throw new AssertionError();
        }
        if (bufferEnd$volatile$FU.compareAndSet(this, j3 + 1, channelSegment2.id * ((long) BufferedChannelKt.SEGMENT_SIZE))) {
            incCompletedExpandBufferAttempts((channelSegment2.id * ((long) BufferedChannelKt.SEGMENT_SIZE)) - j3);
            return null;
        }
        incCompletedExpandBufferAttempts$default(this, 0L, 1, null);
        return null;
    }

    public final ChannelSegment<E> findSegmentReceive(long j2, ChannelSegment<E> channelSegment) {
        Object objFindSegmentInternal;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = receiveSegment$volatile$FU;
        Function2 function2 = (Function2) BufferedChannelKt.createSegmentFunction();
        loop0: while (true) {
            objFindSegmentInternal = ConcurrentLinkedListKt.findSegmentInternal(channelSegment, j2, function2);
            if (!SegmentOrClosed.m10558isClosedimpl(objFindSegmentInternal)) {
                Segment segmentM10556getSegmentimpl = SegmentOrClosed.m10556getSegmentimpl(objFindSegmentInternal);
                while (true) {
                    Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                    if (segment.id >= segmentM10556getSegmentimpl.id) {
                        break loop0;
                    }
                    if (!segmentM10556getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, segment, segmentM10556getSegmentimpl)) {
                        if (segment.decPointers$kotlinx_coroutines_core()) {
                            segment.remove();
                        }
                    } else if (segmentM10556getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        segmentM10556getSegmentimpl.remove();
                    }
                }
            } else {
                break;
            }
        }
        if (SegmentOrClosed.m10558isClosedimpl(objFindSegmentInternal)) {
            completeCloseOrCancel();
            if (channelSegment.id * ((long) BufferedChannelKt.SEGMENT_SIZE) >= getSendersCounter$kotlinx_coroutines_core()) {
                return null;
            }
            channelSegment.cleanPrev();
            return null;
        }
        ChannelSegment<E> channelSegment2 = (ChannelSegment) SegmentOrClosed.m10556getSegmentimpl(objFindSegmentInternal);
        if (!isRendezvousOrUnlimited() && j2 <= getBufferEndCounter() / ((long) BufferedChannelKt.SEGMENT_SIZE)) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = bufferEndSegment$volatile$FU;
            while (true) {
                Segment segment2 = (Segment) atomicReferenceFieldUpdater2.get(this);
                ChannelSegment<E> channelSegment3 = channelSegment2;
                if (segment2.id >= channelSegment3.id || !channelSegment3.tryIncPointers$kotlinx_coroutines_core()) {
                    break;
                }
                if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater2, this, segment2, channelSegment3)) {
                    if (segment2.decPointers$kotlinx_coroutines_core()) {
                        segment2.remove();
                    }
                } else if (channelSegment3.decPointers$kotlinx_coroutines_core()) {
                    channelSegment3.remove();
                }
            }
        }
        if (channelSegment2.id <= j2) {
            if (!DebugKt.getASSERTIONS_ENABLED() || channelSegment2.id == j2) {
                return channelSegment2;
            }
            throw new AssertionError();
        }
        updateReceiversCounterIfLower(channelSegment2.id * ((long) BufferedChannelKt.SEGMENT_SIZE));
        if (channelSegment2.id * ((long) BufferedChannelKt.SEGMENT_SIZE) >= getSendersCounter$kotlinx_coroutines_core()) {
            return null;
        }
        channelSegment2.cleanPrev();
        return null;
    }

    public final ChannelSegment<E> findSegmentSend(long j2, ChannelSegment<E> channelSegment) {
        Object objFindSegmentInternal;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = sendSegment$volatile$FU;
        Function2 function2 = (Function2) BufferedChannelKt.createSegmentFunction();
        loop0: while (true) {
            objFindSegmentInternal = ConcurrentLinkedListKt.findSegmentInternal(channelSegment, j2, function2);
            if (!SegmentOrClosed.m10558isClosedimpl(objFindSegmentInternal)) {
                Segment segmentM10556getSegmentimpl = SegmentOrClosed.m10556getSegmentimpl(objFindSegmentInternal);
                while (true) {
                    Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                    if (segment.id >= segmentM10556getSegmentimpl.id) {
                        break loop0;
                    }
                    if (!segmentM10556getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, segment, segmentM10556getSegmentimpl)) {
                        if (segment.decPointers$kotlinx_coroutines_core()) {
                            segment.remove();
                        }
                    } else if (segmentM10556getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        segmentM10556getSegmentimpl.remove();
                    }
                }
            } else {
                break;
            }
        }
        if (SegmentOrClosed.m10558isClosedimpl(objFindSegmentInternal)) {
            completeCloseOrCancel();
            if (channelSegment.id * ((long) BufferedChannelKt.SEGMENT_SIZE) >= getReceiversCounter$kotlinx_coroutines_core()) {
                return null;
            }
            channelSegment.cleanPrev();
            return null;
        }
        ChannelSegment<E> channelSegment2 = (ChannelSegment) SegmentOrClosed.m10556getSegmentimpl(objFindSegmentInternal);
        if (channelSegment2.id <= j2) {
            if (!DebugKt.getASSERTIONS_ENABLED() || channelSegment2.id == j2) {
                return channelSegment2;
            }
            throw new AssertionError();
        }
        updateSendersCounterIfLower(channelSegment2.id * ((long) BufferedChannelKt.SEGMENT_SIZE));
        if (channelSegment2.id * ((long) BufferedChannelKt.SEGMENT_SIZE) >= getReceiversCounter$kotlinx_coroutines_core()) {
            return null;
        }
        channelSegment2.cleanPrev();
        return null;
    }

    private final /* synthetic */ Object getAndUpdate$atomicfu(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Function1<Object, ? extends Object> function1) {
        Object obj2;
        do {
            obj2 = atomicReferenceFieldUpdater.get(obj);
        } while (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, obj, obj2, function1.invoke(obj2)));
        return obj2;
    }

    private final /* synthetic */ long getBufferEnd$volatile() {
        return this.bufferEnd$volatile;
    }

    private final long getBufferEndCounter() {
        return bufferEnd$volatile$FU.get(this);
    }

    private final /* synthetic */ Object getBufferEndSegment$volatile() {
        return this.bufferEndSegment$volatile;
    }

    private final /* synthetic */ Object getCloseHandler$volatile() {
        return this.closeHandler$volatile;
    }

    private final /* synthetic */ long getCompletedExpandBuffersAndPauseFlag$volatile() {
        return this.completedExpandBuffersAndPauseFlag$volatile;
    }

    public static /* synthetic */ void getOnReceive$annotations() {
    }

    public static /* synthetic */ void getOnReceiveCatching$annotations() {
    }

    public static /* synthetic */ void getOnReceiveOrNull$annotations() {
    }

    public static /* synthetic */ void getOnSend$annotations() {
    }

    private static /* synthetic */ void getOnUndeliveredElementReceiveCancellationConstructor$annotations() {
    }

    public final Throwable getReceiveException() {
        Throwable closeCause = getCloseCause();
        return closeCause == null ? new ClosedReceiveChannelException(ChannelsKt.DEFAULT_CLOSE_MESSAGE) : closeCause;
    }

    private final /* synthetic */ Object getReceiveSegment$volatile() {
        return this.receiveSegment$volatile;
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater getReceiveSegment$volatile$FU() {
        return receiveSegment$volatile$FU;
    }

    private final /* synthetic */ long getReceivers$volatile() {
        return this.receivers$volatile;
    }

    public static final /* synthetic */ AtomicLongFieldUpdater getReceivers$volatile$FU() {
        return receivers$volatile$FU;
    }

    private final /* synthetic */ Object getSendSegment$volatile() {
        return this.sendSegment$volatile;
    }

    private final /* synthetic */ long getSendersAndCloseStatus$volatile() {
        return this.sendersAndCloseStatus$volatile;
    }

    private final /* synthetic */ Object get_closeCause$volatile() {
        return this._closeCause$volatile;
    }

    private final void incCompletedExpandBufferAttempts(long j2) {
        long j3;
        if ((-1) - (((-1) - completedExpandBuffersAndPauseFlag$volatile$FU.addAndGet(this, j2)) | ((-1) - Longs.MAX_POWER_OF_TWO)) != 0) {
            do {
                j3 = completedExpandBuffersAndPauseFlag$volatile$FU.get(this);
            } while ((j3 + Longs.MAX_POWER_OF_TWO) - (j3 | Longs.MAX_POWER_OF_TWO) != 0);
        }
    }

    static /* synthetic */ void incCompletedExpandBufferAttempts$default(BufferedChannel bufferedChannel, long j2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i2 & 1) != 0) {
            j2 = 1;
        }
        bufferedChannel.incCompletedExpandBufferAttempts(j2);
    }

    private final void invokeCloseHandler() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = closeHandler$volatile$FU;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, obj, obj == null ? BufferedChannelKt.CLOSE_HANDLER_CLOSED : BufferedChannelKt.CLOSE_HANDLER_INVOKED));
        if (obj == null) {
            return;
        }
        ((Function1) obj).invoke(getCloseCause());
    }

    private final boolean isCellNonEmpty(ChannelSegment<E> channelSegment, int i2, long j2) {
        Object state$kotlinx_coroutines_core;
        do {
            state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i2);
            if (state$kotlinx_coroutines_core != null && state$kotlinx_coroutines_core != BufferedChannelKt.IN_BUFFER) {
                if (state$kotlinx_coroutines_core == BufferedChannelKt.BUFFERED) {
                    return true;
                }
                if (state$kotlinx_coroutines_core == BufferedChannelKt.INTERRUPTED_SEND || state$kotlinx_coroutines_core == BufferedChannelKt.getCHANNEL_CLOSED() || state$kotlinx_coroutines_core == BufferedChannelKt.DONE_RCV || state$kotlinx_coroutines_core == BufferedChannelKt.POISONED) {
                    return false;
                }
                if (state$kotlinx_coroutines_core == BufferedChannelKt.RESUMING_BY_EB) {
                    return true;
                }
                return state$kotlinx_coroutines_core != BufferedChannelKt.RESUMING_BY_RCV && j2 == getReceiversCounter$kotlinx_coroutines_core();
            }
        } while (!channelSegment.casState$kotlinx_coroutines_core(i2, state$kotlinx_coroutines_core, BufferedChannelKt.POISONED));
        expandBuffer();
        return false;
    }

    private final boolean isClosed(long j2, boolean z2) {
        int i2 = (int) (j2 >> 60);
        if (i2 == 0 || i2 == 1) {
            return false;
        }
        if (i2 == 2) {
            completeClose((j2 + 1152921504606846975L) - (j2 | 1152921504606846975L));
            if (z2 && hasElements$kotlinx_coroutines_core()) {
                return false;
            }
        } else {
            if (i2 != 3) {
                throw new IllegalStateException(("unexpected close status: " + i2).toString());
            }
            completeCancel((j2 + 1152921504606846975L) - (j2 | 1152921504606846975L));
        }
        return true;
    }

    public static /* synthetic */ void isClosedForReceive$annotations() {
    }

    private final boolean isClosedForReceive0(long j2) {
        return isClosed(j2, true);
    }

    public static /* synthetic */ void isClosedForSend$annotations() {
    }

    public final boolean isClosedForSend0(long j2) {
        return isClosed(j2, false);
    }

    public static /* synthetic */ void isEmpty$annotations() {
    }

    private final boolean isRendezvousOrUnlimited() {
        long bufferEndCounter = getBufferEndCounter();
        return bufferEndCounter == 0 || bufferEndCounter == Long.MAX_VALUE;
    }

    private final /* synthetic */ void loop$atomicfu(Object obj, AtomicLongFieldUpdater atomicLongFieldUpdater, Function1<? super Long, Unit> function1) {
        while (true) {
            function1.invoke(Long.valueOf(atomicLongFieldUpdater.get(obj)));
        }
    }

    private final /* synthetic */ void loop$atomicfu(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Function1<Object, Unit> function1) {
        while (true) {
            function1.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long markAllEmptyCellsAsClosed(ChannelSegment<E> channelSegment) {
        do {
            for (int i2 = BufferedChannelKt.SEGMENT_SIZE - 1; -1 < i2; i2--) {
                long j2 = (channelSegment.id * ((long) BufferedChannelKt.SEGMENT_SIZE)) + ((long) i2);
                if (j2 < getReceiversCounter$kotlinx_coroutines_core()) {
                    return -1L;
                }
                while (true) {
                    Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i2);
                    if (state$kotlinx_coroutines_core == null || state$kotlinx_coroutines_core == BufferedChannelKt.IN_BUFFER) {
                        if (channelSegment.casState$kotlinx_coroutines_core(i2, state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                            channelSegment.onSlotCleaned();
                            break;
                        }
                    } else if (state$kotlinx_coroutines_core == BufferedChannelKt.BUFFERED) {
                        return j2;
                    }
                }
            }
            channelSegment = (ChannelSegment) channelSegment.getPrev();
        } while (channelSegment != null);
        return -1L;
    }

    private final void markCancellationStarted() {
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = sendersAndCloseStatus$volatile$FU;
        do {
            j2 = atomicLongFieldUpdater.get(this);
            if (((int) (j2 >> 60)) != 0) {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j2, BufferedChannelKt.constructSendersAndCloseStatus(1152921504606846975L & j2, 1)));
    }

    private final void markCancelled() {
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = sendersAndCloseStatus$volatile$FU;
        do {
            j2 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j2, BufferedChannelKt.constructSendersAndCloseStatus((-1) - (((-1) - 1152921504606846975L) | ((-1) - j2)), 3)));
    }

    private final void markClosed() {
        long j2;
        long jConstructSendersAndCloseStatus;
        AtomicLongFieldUpdater atomicLongFieldUpdater = sendersAndCloseStatus$volatile$FU;
        do {
            j2 = atomicLongFieldUpdater.get(this);
            int i2 = (int) (j2 >> 60);
            if (i2 == 0) {
                jConstructSendersAndCloseStatus = BufferedChannelKt.constructSendersAndCloseStatus((j2 + 1152921504606846975L) - (j2 | 1152921504606846975L), 2);
            } else if (i2 != 1) {
                return;
            } else {
                jConstructSendersAndCloseStatus = BufferedChannelKt.constructSendersAndCloseStatus(j2 & 1152921504606846975L, 3);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j2, jConstructSendersAndCloseStatus));
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x000e, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void moveSegmentBufferEndToSpecifiedOrLast(long r9, kotlinx.coroutines.channels.ChannelSegment<E> r11) {
        /*
            r8 = this;
        L0:
            long r1 = r11.id
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 >= 0) goto Le
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r0 = r11.getNext()
            kotlinx.coroutines.channels.ChannelSegment r0 = (kotlinx.coroutines.channels.ChannelSegment) r0
            if (r0 != 0) goto L55
        Le:
            boolean r0 = r11.isRemoved()
            if (r0 == 0) goto L1c
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r0 = r11.getNext()
            kotlinx.coroutines.channels.ChannelSegment r0 = (kotlinx.coroutines.channels.ChannelSegment) r0
            if (r0 != 0) goto L53
        L1c:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = getBufferEndSegment$volatile$FU()
        L20:
            java.lang.Object r6 = r7.get(r8)
            kotlinx.coroutines.internal.Segment r6 = (kotlinx.coroutines.internal.Segment) r6
            long r4 = r6.id
            r3 = r11
            kotlinx.coroutines.internal.Segment r3 = (kotlinx.coroutines.internal.Segment) r3
            long r1 = r3.id
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 < 0) goto L32
        L31:
            return
        L32:
            boolean r0 = r3.tryIncPointers$kotlinx_coroutines_core()
            if (r0 != 0) goto L39
            goto Le
        L39:
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r7, r8, r6, r3)
            if (r0 == 0) goto L49
            boolean r0 = r6.decPointers$kotlinx_coroutines_core()
            if (r0 == 0) goto L31
            r6.remove()
            goto L31
        L49:
            boolean r0 = r3.decPointers$kotlinx_coroutines_core()
            if (r0 == 0) goto L20
            r3.remove()
            goto L20
        L53:
            r11 = r0
            goto Le
        L55:
            r11 = r0
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.moveSegmentBufferEndToSpecifiedOrLast(long, kotlinx.coroutines.channels.ChannelSegment):void");
    }

    /* JADX INFO: renamed from: onCancellationChannelResultImplDoNotCall-5_sEAP8 */
    public final void m10488onCancellationChannelResultImplDoNotCall5_sEAP8(Throwable th, Object obj, CoroutineContext coroutineContext) {
        Function1<E, Unit> function1 = this.onUndeliveredElement;
        Intrinsics.checkNotNull(function1);
        Object objM10504getOrNullimpl = ChannelResult.m10504getOrNullimpl(obj);
        Intrinsics.checkNotNull(objM10504getOrNullimpl);
        OnUndeliveredElementKt.callUndeliveredElement(function1, objM10504getOrNullimpl, coroutineContext);
    }

    public final void onCancellationImplDoNotCall(Throwable th, E e2, CoroutineContext coroutineContext) {
        Function1<E, Unit> function1 = this.onUndeliveredElement;
        Intrinsics.checkNotNull(function1);
        OnUndeliveredElementKt.callUndeliveredElement(function1, e2, coroutineContext);
    }

    public final void onClosedReceiveCatchingOnNoWaiterSuspend(CancellableContinuation<? super ChannelResult<? extends E>> cancellableContinuation) {
        Result.Companion companion = Result.Companion;
        cancellableContinuation.resumeWith(Result.m8980constructorimpl(ChannelResult.m10499boximpl(ChannelResult.Companion.m10512closedJP2dKIU(getCloseCause()))));
    }

    public final void onClosedReceiveOnNoWaiterSuspend(CancellableContinuation<? super E> cancellableContinuation) {
        Result.Companion companion = Result.Companion;
        cancellableContinuation.resumeWith(Result.m8980constructorimpl(ResultKt.createFailure(getReceiveException())));
    }

    private final void onClosedSelectOnReceive(SelectInstance<?> selectInstance) {
        selectInstance.selectInRegistrationPhase(BufferedChannelKt.getCHANNEL_CLOSED());
    }

    private final void onClosedSelectOnSend(E e2, SelectInstance<?> selectInstance) {
        Function1<E, Unit> function1 = this.onUndeliveredElement;
        if (function1 != null) {
            OnUndeliveredElementKt.callUndeliveredElement(function1, e2, selectInstance.getContext());
        }
        selectInstance.selectInRegistrationPhase(BufferedChannelKt.getCHANNEL_CLOSED());
    }

    public final Object onClosedSend(E e2, Continuation<? super Unit> continuation) throws Throwable {
        UndeliveredElementException undeliveredElementExceptionCallUndeliveredElementCatchingException$default;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        Function1<E, Unit> function1 = this.onUndeliveredElement;
        if (function1 == null || (undeliveredElementExceptionCallUndeliveredElementCatchingException$default = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(function1, e2, null, 2, null)) == null) {
            CancellableContinuationImpl cancellableContinuationImpl3 = cancellableContinuationImpl2;
            Throwable sendException = getSendException();
            Result.Companion companion = Result.Companion;
            if (DebugKt.getRECOVER_STACK_TRACES() && (cancellableContinuationImpl3 instanceof CoroutineStackFrame)) {
                sendException = StackTraceRecoveryKt.recoverFromStackFrame(sendException, cancellableContinuationImpl3);
            }
            cancellableContinuationImpl3.resumeWith(Result.m8980constructorimpl(ResultKt.createFailure(sendException)));
        } else {
            UndeliveredElementException undeliveredElementExceptionRecoverFromStackFrame = undeliveredElementExceptionCallUndeliveredElementCatchingException$default;
            ExceptionsKt.addSuppressed(undeliveredElementExceptionRecoverFromStackFrame, getSendException());
            CancellableContinuationImpl cancellableContinuationImpl4 = cancellableContinuationImpl2;
            Result.Companion companion2 = Result.Companion;
            if (DebugKt.getRECOVER_STACK_TRACES() && (cancellableContinuationImpl4 instanceof CoroutineStackFrame)) {
                undeliveredElementExceptionRecoverFromStackFrame = StackTraceRecoveryKt.recoverFromStackFrame(undeliveredElementExceptionRecoverFromStackFrame, cancellableContinuationImpl4);
            }
            cancellableContinuationImpl4.resumeWith(Result.m8980constructorimpl(ResultKt.createFailure(undeliveredElementExceptionRecoverFromStackFrame)));
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    public final void onClosedSendOnNoWaiterSuspend(E e2, CancellableContinuation<? super Unit> cancellableContinuation) {
        Function1<E, Unit> function1 = this.onUndeliveredElement;
        if (function1 != null) {
            OnUndeliveredElementKt.callUndeliveredElement(function1, e2, cancellableContinuation.getContext());
        }
        CancellableContinuation<? super Unit> cancellableContinuation2 = cancellableContinuation;
        Throwable sendException = getSendException();
        if (DebugKt.getRECOVER_STACK_TRACES() && (cancellableContinuation2 instanceof CoroutineStackFrame)) {
            sendException = StackTraceRecoveryKt.recoverFromStackFrame(sendException, (CoroutineStackFrame) cancellableContinuation2);
        }
        Result.Companion companion = Result.Companion;
        cancellableContinuation2.resumeWith(Result.m8980constructorimpl(ResultKt.createFailure(sendException)));
    }

    public static final Function3 onUndeliveredElementReceiveCancellationConstructor$lambda$57$lambda$56(final BufferedChannel bufferedChannel, final SelectInstance selectInstance, Object obj, final Object obj2) {
        return new Function3() { // from class: kotlinx.coroutines.channels.BufferedChannel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                return BufferedChannel.onUndeliveredElementReceiveCancellationConstructor$lambda$57$lambda$56$lambda$55(obj2, bufferedChannel, selectInstance, (Throwable) obj3, obj4, (CoroutineContext) obj5);
            }
        };
    }

    public static final Unit onUndeliveredElementReceiveCancellationConstructor$lambda$57$lambda$56$lambda$55(Object obj, BufferedChannel bufferedChannel, SelectInstance selectInstance, Throwable th, Object obj2, CoroutineContext coroutineContext) {
        if (obj != BufferedChannelKt.getCHANNEL_CLOSED()) {
            OnUndeliveredElementKt.callUndeliveredElement(bufferedChannel.onUndeliveredElement, obj, selectInstance.getContext());
        }
        return Unit.INSTANCE;
    }

    public final void prepareReceiverForSuspension(Waiter waiter, ChannelSegment<E> channelSegment, int i2) {
        onReceiveEnqueued();
        waiter.invokeOnCancellation(channelSegment, i2);
    }

    public final void prepareSenderForSuspension(Waiter waiter, ChannelSegment<E> channelSegment, int i2) {
        waiter.invokeOnCancellation(channelSegment, i2 + BufferedChannelKt.SEGMENT_SIZE);
    }

    public final Object processResultSelectReceive(Object obj, Object obj2) throws Throwable {
        if (obj2 != BufferedChannelKt.getCHANNEL_CLOSED()) {
            return obj2;
        }
        throw getReceiveException();
    }

    public final Object processResultSelectReceiveCatching(Object obj, Object obj2) {
        return ChannelResult.m10499boximpl(obj2 == BufferedChannelKt.getCHANNEL_CLOSED() ? ChannelResult.Companion.m10512closedJP2dKIU(getCloseCause()) : ChannelResult.Companion.m10514successJP2dKIU(obj2));
    }

    public final Object processResultSelectReceiveOrNull(Object obj, Object obj2) throws Throwable {
        if (obj2 != BufferedChannelKt.getCHANNEL_CLOSED()) {
            return obj2;
        }
        if (getCloseCause() == null) {
            return null;
        }
        throw getReceiveException();
    }

    public final Object processResultSelectSend(Object obj, Object obj2) throws Throwable {
        if (obj2 != BufferedChannelKt.getCHANNEL_CLOSED()) {
            return this;
        }
        throw getSendException();
    }

    static /* synthetic */ <E> Object receive$suspendImpl(BufferedChannel<E> bufferedChannel, Continuation<? super E> continuation) throws Throwable {
        ChannelSegment<E> channelSegment = (ChannelSegment) getReceiveSegment$volatile$FU().get(bufferedChannel);
        while (!bufferedChannel.isClosedForReceive()) {
            long andIncrement = getReceivers$volatile$FU().getAndIncrement(bufferedChannel);
            long j2 = andIncrement / ((long) BufferedChannelKt.SEGMENT_SIZE);
            int i2 = (int) (andIncrement % ((long) BufferedChannelKt.SEGMENT_SIZE));
            if (channelSegment.id != j2) {
                ChannelSegment<E> channelSegmentFindSegmentReceive = bufferedChannel.findSegmentReceive(j2, channelSegment);
                if (channelSegmentFindSegmentReceive == null) {
                    continue;
                } else {
                    channelSegment = channelSegmentFindSegmentReceive;
                }
            }
            Object objUpdateCellReceive = bufferedChannel.updateCellReceive(channelSegment, i2, andIncrement, null);
            if (objUpdateCellReceive == BufferedChannelKt.SUSPEND) {
                throw new IllegalStateException("unexpected".toString());
            }
            if (objUpdateCellReceive != BufferedChannelKt.FAILED) {
                if (objUpdateCellReceive == BufferedChannelKt.SUSPEND_NO_WAITER) {
                    return bufferedChannel.receiveOnNoWaiterSuspend(channelSegment, i2, andIncrement, continuation);
                }
                channelSegment.cleanPrev();
                return objUpdateCellReceive;
            }
            if (andIncrement < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                channelSegment.cleanPrev();
            }
        }
        throw StackTraceRecoveryKt.recoverStackTrace(bufferedChannel.getReceiveException());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00a6  */
    /* JADX INFO: renamed from: receiveCatching-JP2dKIU$suspendImpl */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ <E> java.lang.Object m10489receiveCatchingJP2dKIU$suspendImpl(kotlinx.coroutines.channels.BufferedChannel<E> r12, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelResult<? extends E>> r13) throws java.lang.Throwable {
        /*
            r2 = r13
            boolean r0 = r2 instanceof kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1
            r8 = r12
            if (r0 == 0) goto La6
            r5 = r2
            kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1 r5 = (kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1) r5
            int r0 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto La6
            int r0 = r5.label
            int r0 = r0 - r1
            r5.label = r0
        L15:
            java.lang.Object r1 = r5.result
            java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r5.label
            r4 = 1
            if (r0 == 0) goto L2c
            if (r0 != r4) goto Lad
            kotlin.ResultKt.throwOnFailure(r1)
            kotlinx.coroutines.channels.ChannelResult r1 = (kotlinx.coroutines.channels.ChannelResult) r1
            java.lang.Object r0 = r1.m10511unboximpl()
        L2b:
            return r0
        L2c:
            kotlin.ResultKt.throwOnFailure(r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = access$getReceiveSegment$volatile$FU()
            java.lang.Object r9 = r0.get(r8)
            kotlinx.coroutines.channels.ChannelSegment r9 = (kotlinx.coroutines.channels.ChannelSegment) r9
        L39:
            boolean r0 = r8.isClosedForReceive()
            if (r0 == 0) goto L4a
            kotlinx.coroutines.channels.ChannelResult$Companion r1 = kotlinx.coroutines.channels.ChannelResult.Companion
            java.lang.Throwable r0 = r8.getCloseCause()
            java.lang.Object r0 = r1.m10512closedJP2dKIU(r0)
            goto L2b
        L4a:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = access$getReceivers$volatile$FU()
            long r11 = r0.getAndIncrement(r8)
            int r0 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r0 = (long) r0
            long r0 = r11 / r0
            int r2 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r2 = (long) r2
            long r2 = r11 % r2
            int r10 = (int) r2
            long r2 = r9.id
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 == 0) goto L6b
            kotlinx.coroutines.channels.ChannelSegment r0 = access$findSegmentReceive(r8, r0, r9)
            if (r0 != 0) goto L6a
            goto L39
        L6a:
            r9 = r0
        L6b:
            r13 = 0
            java.lang.Object r1 = access$updateCellReceive(r8, r9, r10, r11, r13)
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.BufferedChannelKt.access$getSUSPEND$p()
            if (r1 == r0) goto Lb5
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.BufferedChannelKt.access$getFAILED$p()
            if (r1 != r0) goto L88
            long r1 = r8.getSendersCounter$kotlinx_coroutines_core()
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 >= 0) goto L39
            r9.cleanPrev()
            goto L39
        L88:
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.BufferedChannelKt.access$getSUSPEND_NO_WAITER$p()
            if (r1 != r0) goto L9c
            r5.label = r4
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r5 = r5
            java.lang.Object r0 = r0.m10490receiveCatchingOnNoWaiterSuspendGKJJFZk(r1, r2, r3, r5)
            if (r0 != r6) goto L2b
            return r6
        L9c:
            r9.cleanPrev()
            kotlinx.coroutines.channels.ChannelResult$Companion r0 = kotlinx.coroutines.channels.ChannelResult.Companion
            java.lang.Object r0 = r0.m10514successJP2dKIU(r1)
            goto L2b
        La6:
            kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1 r5 = new kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1
            r5.<init>(r8, r2)
            goto L15
        Lad:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lb5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected"
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.m10489receiveCatchingJP2dKIU$suspendImpl(kotlinx.coroutines.channels.BufferedChannel, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0141  */
    /* JADX INFO: renamed from: receiveCatchingOnNoWaiterSuspend-GKJJFZk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m10490receiveCatchingOnNoWaiterSuspendGKJJFZk(kotlinx.coroutines.channels.ChannelSegment<E> r18, int r19, long r20, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelResult<? extends E>> r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.m10490receiveCatchingOnNoWaiterSuspendGKJJFZk(kotlinx.coroutines.channels.ChannelSegment, int, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final <R> R receiveImpl(Object obj, Function1<? super E, ? extends R> function1, Function3<? super ChannelSegment<E>, ? super Integer, ? super Long, ? extends R> function3, Function0<? extends R> function0, Function3<? super ChannelSegment<E>, ? super Integer, ? super Long, ? extends R> function32) {
        ChannelSegment channelSegment = (ChannelSegment) getReceiveSegment$volatile$FU().get(this);
        while (!isClosedForReceive()) {
            long andIncrement = getReceivers$volatile$FU().getAndIncrement(this);
            long j2 = andIncrement / ((long) BufferedChannelKt.SEGMENT_SIZE);
            int i2 = (int) (andIncrement % ((long) BufferedChannelKt.SEGMENT_SIZE));
            if (channelSegment.id != j2) {
                ChannelSegment channelSegmentFindSegmentReceive = findSegmentReceive(j2, channelSegment);
                if (channelSegmentFindSegmentReceive == null) {
                    continue;
                } else {
                    channelSegment = channelSegmentFindSegmentReceive;
                }
            }
            Symbol symbol = (Object) updateCellReceive(channelSegment, i2, andIncrement, obj);
            if (symbol == BufferedChannelKt.SUSPEND) {
                Waiter waiter = obj instanceof Waiter ? (Waiter) obj : null;
                if (waiter != null) {
                    prepareReceiverForSuspension(waiter, channelSegment, i2);
                }
                return function3.invoke(channelSegment, Integer.valueOf(i2), Long.valueOf(andIncrement));
            }
            if (symbol != BufferedChannelKt.FAILED) {
                if (symbol == BufferedChannelKt.SUSPEND_NO_WAITER) {
                    return function32.invoke(channelSegment, Integer.valueOf(i2), Long.valueOf(andIncrement));
                }
                channelSegment.cleanPrev();
                return function1.invoke(symbol);
            }
            if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                channelSegment.cleanPrev();
            }
        }
        return function0.invoke();
    }

    static /* synthetic */ Object receiveImpl$default(BufferedChannel bufferedChannel, Object obj, Function1 function1, Function3 function3, Function0 function0, Function3 function32, int i2, Object obj2) {
        C13861 c13861 = function32;
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: receiveImpl");
        }
        if ((i2 + 16) - (i2 | 16) != 0) {
            c13861 = C13861.INSTANCE;
        }
        ChannelSegment channelSegment = (ChannelSegment) getReceiveSegment$volatile$FU().get(bufferedChannel);
        while (!bufferedChannel.isClosedForReceive()) {
            long andIncrement = getReceivers$volatile$FU().getAndIncrement(bufferedChannel);
            long j2 = andIncrement / ((long) BufferedChannelKt.SEGMENT_SIZE);
            int i3 = (int) (andIncrement % ((long) BufferedChannelKt.SEGMENT_SIZE));
            if (channelSegment.id != j2) {
                ChannelSegment channelSegmentFindSegmentReceive = bufferedChannel.findSegmentReceive(j2, channelSegment);
                if (channelSegmentFindSegmentReceive == null) {
                    continue;
                } else {
                    channelSegment = channelSegmentFindSegmentReceive;
                }
            }
            Object objUpdateCellReceive = bufferedChannel.updateCellReceive(channelSegment, i3, andIncrement, obj);
            if (objUpdateCellReceive == BufferedChannelKt.SUSPEND) {
                Waiter waiter = obj instanceof Waiter ? (Waiter) obj : null;
                if (waiter != null) {
                    bufferedChannel.prepareReceiverForSuspension(waiter, channelSegment, i3);
                }
                return function3.invoke(channelSegment, Integer.valueOf(i3), Long.valueOf(andIncrement));
            }
            if (objUpdateCellReceive != BufferedChannelKt.FAILED) {
                if (objUpdateCellReceive == BufferedChannelKt.SUSPEND_NO_WAITER) {
                    return c13861.invoke(channelSegment, Integer.valueOf(i3), Long.valueOf(andIncrement));
                }
                channelSegment.cleanPrev();
                return function1.invoke(objUpdateCellReceive);
            }
            if (andIncrement < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                channelSegment.cleanPrev();
            }
        }
        return function0.invoke();
    }

    private final void receiveImplOnNoWaiter(ChannelSegment<E> channelSegment, int i2, long j2, Waiter waiter, Function1<? super E, Unit> function1, Function0<Unit> function0) {
        BufferedChannel<E> bufferedChannel = this;
        Waiter waiter2 = waiter;
        Symbol symbol = (Object) bufferedChannel.updateCellReceive(channelSegment, i2, j2, waiter2);
        if (symbol == BufferedChannelKt.SUSPEND) {
            bufferedChannel.prepareReceiverForSuspension(waiter2, channelSegment, i2);
            return;
        }
        if (symbol != BufferedChannelKt.FAILED) {
            channelSegment.cleanPrev();
            function1.invoke(symbol);
            return;
        }
        if (j2 < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
            channelSegment.cleanPrev();
        }
        ChannelSegment channelSegment2 = (ChannelSegment) getReceiveSegment$volatile$FU().get(bufferedChannel);
        while (!bufferedChannel.isClosedForReceive()) {
            long andIncrement = getReceivers$volatile$FU().getAndIncrement(bufferedChannel);
            long j3 = andIncrement / ((long) BufferedChannelKt.SEGMENT_SIZE);
            int i3 = (int) (andIncrement % ((long) BufferedChannelKt.SEGMENT_SIZE));
            if (channelSegment2.id != j3) {
                ChannelSegment channelSegmentFindSegmentReceive = bufferedChannel.findSegmentReceive(j3, channelSegment2);
                if (channelSegmentFindSegmentReceive == null) {
                    continue;
                } else {
                    channelSegment2 = channelSegmentFindSegmentReceive;
                }
            }
            bufferedChannel = bufferedChannel;
            waiter2 = waiter2;
            Symbol symbol2 = (Object) bufferedChannel.updateCellReceive(channelSegment2, i3, andIncrement, waiter2);
            if (symbol2 == BufferedChannelKt.SUSPEND) {
                if (!(waiter2 instanceof Waiter)) {
                    waiter2 = null;
                }
                if (waiter2 != null) {
                    bufferedChannel.prepareReceiverForSuspension(waiter2, channelSegment2, i3);
                }
                Unit unit = Unit.INSTANCE;
                return;
            }
            if (symbol2 != BufferedChannelKt.FAILED) {
                if (symbol2 == BufferedChannelKt.SUSPEND_NO_WAITER) {
                    throw new IllegalStateException("unexpected".toString());
                }
                channelSegment2.cleanPrev();
                function1.invoke(symbol2);
                return;
            }
            if (andIncrement < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                channelSegment2.cleanPrev();
            }
        }
        function0.invoke();
    }

    public final Object receiveOnNoWaiterSuspend(ChannelSegment<E> channelSegment, int i2, long j2, Continuation<? super E> continuation) throws Throwable {
        Function3 function3;
        CancellableContinuationImpl orCreateCancellableContinuation = CancellableContinuationKt.getOrCreateCancellableContinuation(IntrinsicsKt.intercepted(continuation));
        try {
            Object objUpdateCellReceive = updateCellReceive(channelSegment, i2, j2, orCreateCancellableContinuation);
            if (objUpdateCellReceive == BufferedChannelKt.SUSPEND) {
                prepareReceiverForSuspension(orCreateCancellableContinuation, channelSegment, i2);
            } else {
                if (objUpdateCellReceive == BufferedChannelKt.FAILED) {
                    if (j2 < getSendersCounter$kotlinx_coroutines_core()) {
                        channelSegment.cleanPrev();
                    }
                    ChannelSegment channelSegment2 = (ChannelSegment) getReceiveSegment$volatile$FU().get(this);
                    while (true) {
                        if (isClosedForReceive()) {
                            onClosedReceiveOnNoWaiterSuspend(orCreateCancellableContinuation);
                            break;
                        }
                        long andIncrement = getReceivers$volatile$FU().getAndIncrement(this);
                        long j3 = andIncrement / ((long) BufferedChannelKt.SEGMENT_SIZE);
                        int i3 = (int) (andIncrement % ((long) BufferedChannelKt.SEGMENT_SIZE));
                        if (channelSegment2.id != j3) {
                            ChannelSegment channelSegmentFindSegmentReceive = findSegmentReceive(j3, channelSegment2);
                            if (channelSegmentFindSegmentReceive != null) {
                                channelSegment2 = channelSegmentFindSegmentReceive;
                            }
                        }
                        objUpdateCellReceive = updateCellReceive(channelSegment2, i3, andIncrement, orCreateCancellableContinuation);
                        if (objUpdateCellReceive == BufferedChannelKt.SUSPEND) {
                            CancellableContinuationImpl cancellableContinuationImpl = orCreateCancellableContinuation instanceof Waiter ? orCreateCancellableContinuation : null;
                            if (cancellableContinuationImpl != null) {
                                prepareReceiverForSuspension(cancellableContinuationImpl, channelSegment2, i3);
                            }
                        } else if (objUpdateCellReceive == BufferedChannelKt.FAILED) {
                            if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                                channelSegment2.cleanPrev();
                            }
                        } else {
                            if (objUpdateCellReceive == BufferedChannelKt.SUSPEND_NO_WAITER) {
                                throw new IllegalStateException("unexpected".toString());
                            }
                            channelSegment2.cleanPrev();
                            Function1<E, Unit> function1 = this.onUndeliveredElement;
                            function3 = (Function3) (function1 != null ? bindCancellationFun(function1) : null);
                        }
                    }
                } else {
                    channelSegment.cleanPrev();
                    Function1<E, Unit> function12 = this.onUndeliveredElement;
                    function3 = (Function3) (function12 != null ? bindCancellationFun(function12) : null);
                }
                orCreateCancellableContinuation.resume(objUpdateCellReceive, (Function3<? super Throwable, ? super Object, ? super CoroutineContext, Unit>) function3);
            }
            Object result = orCreateCancellableContinuation.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result;
        } catch (Throwable th) {
            orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw th;
        }
    }

    public final void registerSelectForReceive(SelectInstance<?> selectInstance, Object obj) {
        ChannelSegment channelSegment = (ChannelSegment) getReceiveSegment$volatile$FU().get(this);
        while (!isClosedForReceive()) {
            long andIncrement = getReceivers$volatile$FU().getAndIncrement(this);
            long j2 = andIncrement / ((long) BufferedChannelKt.SEGMENT_SIZE);
            int i2 = (int) (andIncrement % ((long) BufferedChannelKt.SEGMENT_SIZE));
            if (channelSegment.id != j2) {
                ChannelSegment channelSegmentFindSegmentReceive = findSegmentReceive(j2, channelSegment);
                if (channelSegmentFindSegmentReceive == null) {
                    continue;
                } else {
                    channelSegment = channelSegmentFindSegmentReceive;
                }
            }
            Object objUpdateCellReceive = updateCellReceive(channelSegment, i2, andIncrement, selectInstance);
            if (objUpdateCellReceive == BufferedChannelKt.SUSPEND) {
                Waiter waiter = selectInstance instanceof Waiter ? (Waiter) selectInstance : null;
                if (waiter != null) {
                    prepareReceiverForSuspension(waiter, channelSegment, i2);
                    return;
                }
                return;
            }
            if (objUpdateCellReceive != BufferedChannelKt.FAILED) {
                if (objUpdateCellReceive == BufferedChannelKt.SUSPEND_NO_WAITER) {
                    throw new IllegalStateException("unexpected".toString());
                }
                channelSegment.cleanPrev();
                selectInstance.selectInRegistrationPhase(objUpdateCellReceive);
                return;
            }
            if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                channelSegment.cleanPrev();
            }
        }
        onClosedSelectOnReceive(selectInstance);
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x009b, code lost:
    
        r14 = (kotlinx.coroutines.channels.ChannelSegment) r14.getPrev();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void removeUnprocessedElements(kotlinx.coroutines.channels.ChannelSegment<E> r14) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.removeUnprocessedElements(kotlinx.coroutines.channels.ChannelSegment):void");
    }

    private final void resumeReceiverOnClosedChannel(Waiter waiter) {
        resumeWaiterOnClosedChannel(waiter, true);
    }

    private final void resumeSenderOnCancelledChannel(Waiter waiter) {
        resumeWaiterOnClosedChannel(waiter, false);
    }

    private final void resumeWaiterOnClosedChannel(Waiter waiter, boolean z2) {
        if (waiter instanceof SendBroadcast) {
            CancellableContinuation<Boolean> cont = ((SendBroadcast) waiter).getCont();
            Result.Companion companion = Result.Companion;
            cont.resumeWith(Result.m8980constructorimpl(false));
            return;
        }
        if (waiter instanceof CancellableContinuation) {
            Continuation continuation = (Continuation) waiter;
            Result.Companion companion2 = Result.Companion;
            continuation.resumeWith(Result.m8980constructorimpl(ResultKt.createFailure(z2 ? getReceiveException() : getSendException())));
        } else if (waiter instanceof ReceiveCatching) {
            CancellableContinuationImpl<ChannelResult<? extends E>> cancellableContinuationImpl = ((ReceiveCatching) waiter).cont;
            Result.Companion companion3 = Result.Companion;
            cancellableContinuationImpl.resumeWith(Result.m8980constructorimpl(ChannelResult.m10499boximpl(ChannelResult.Companion.m10512closedJP2dKIU(getCloseCause()))));
        } else if (waiter instanceof BufferedChannelIterator) {
            ((BufferedChannelIterator) waiter).tryResumeHasNextOnClosedChannel();
        } else {
            if (!(waiter instanceof SelectInstance)) {
                throw new IllegalStateException(("Unexpected waiter: " + waiter).toString());
            }
            ((SelectInstance) waiter).trySelect(this, BufferedChannelKt.getCHANNEL_CLOSED());
        }
    }

    static /* synthetic */ <E> Object send$suspendImpl(BufferedChannel<E> bufferedChannel, E e2, Continuation<? super Unit> continuation) throws Throwable {
        ChannelSegment<E> channelSegment = (ChannelSegment) sendSegment$volatile$FU.get(bufferedChannel);
        while (true) {
            long andIncrement = sendersAndCloseStatus$volatile$FU.getAndIncrement(bufferedChannel);
            long j2 = (-1) - (((-1) - 1152921504606846975L) | ((-1) - andIncrement));
            boolean zIsClosedForSend0 = bufferedChannel.isClosedForSend0(andIncrement);
            long j3 = j2 / ((long) BufferedChannelKt.SEGMENT_SIZE);
            int i2 = (int) (j2 % ((long) BufferedChannelKt.SEGMENT_SIZE));
            if (channelSegment.id != j3) {
                ChannelSegment<E> channelSegmentFindSegmentSend = bufferedChannel.findSegmentSend(j3, channelSegment);
                if (channelSegmentFindSegmentSend != null) {
                    channelSegment = channelSegmentFindSegmentSend;
                } else if (zIsClosedForSend0) {
                    Object objOnClosedSend = bufferedChannel.onClosedSend(e2, continuation);
                    if (objOnClosedSend == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        return objOnClosedSend;
                    }
                }
            }
            int iUpdateCellSend = bufferedChannel.updateCellSend(channelSegment, i2, e2, j2, null, zIsClosedForSend0);
            if (iUpdateCellSend == 0) {
                channelSegment.cleanPrev();
                break;
            }
            if (iUpdateCellSend == 1) {
                break;
            }
            if (iUpdateCellSend != 2) {
                if (iUpdateCellSend == 3) {
                    Object objSendOnNoWaiterSuspend = bufferedChannel.sendOnNoWaiterSuspend(channelSegment, i2, e2, j2, continuation);
                    if (objSendOnNoWaiterSuspend == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        return objSendOnNoWaiterSuspend;
                    }
                } else if (iUpdateCellSend == 4) {
                    if (j2 < bufferedChannel.getReceiversCounter$kotlinx_coroutines_core()) {
                        channelSegment.cleanPrev();
                    }
                    Object objOnClosedSend2 = bufferedChannel.onClosedSend(e2, continuation);
                    if (objOnClosedSend2 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        return objOnClosedSend2;
                    }
                } else if (iUpdateCellSend == 5) {
                    channelSegment.cleanPrev();
                }
            } else if (zIsClosedForSend0) {
                channelSegment.onSlotCleaned();
                Object objOnClosedSend3 = bufferedChannel.onClosedSend(e2, continuation);
                if (objOnClosedSend3 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    return objOnClosedSend3;
                }
            } else if (DebugKt.getASSERTIONS_ENABLED()) {
                throw new AssertionError();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x00b6, code lost:
    
        r0 = kotlin.Result.Companion;
        r4.resumeWith(kotlin.Result.m8980constructorimpl(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ <E> java.lang.Object sendBroadcast$suspendImpl(kotlinx.coroutines.channels.BufferedChannel<E> r16, E r17, kotlin.coroutines.Continuation<? super java.lang.Boolean> r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.sendBroadcast$suspendImpl(kotlinx.coroutines.channels.BufferedChannel, java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final <R> R sendImpl(E e2, Object obj, Function0<? extends R> function0, Function2<? super ChannelSegment<E>, ? super Integer, ? extends R> function2, Function0<? extends R> function02, Function4<? super ChannelSegment<E>, ? super Integer, ? super E, ? super Long, ? extends R> function4) {
        ChannelSegment channelSegment = (ChannelSegment) sendSegment$volatile$FU.get(this);
        while (true) {
            long andIncrement = sendersAndCloseStatus$volatile$FU.getAndIncrement(this);
            long j2 = (-1) - (((-1) - andIncrement) | ((-1) - 1152921504606846975L));
            boolean zIsClosedForSend0 = isClosedForSend0(andIncrement);
            long j3 = j2 / ((long) BufferedChannelKt.SEGMENT_SIZE);
            int i2 = (int) (j2 % ((long) BufferedChannelKt.SEGMENT_SIZE));
            if (channelSegment.id != j3) {
                ChannelSegment channelSegmentFindSegmentSend = findSegmentSend(j3, channelSegment);
                if (channelSegmentFindSegmentSend != null) {
                    channelSegment = channelSegmentFindSegmentSend;
                } else if (zIsClosedForSend0) {
                    return function02.invoke();
                }
            }
            int iUpdateCellSend = updateCellSend(channelSegment, i2, e2, j2, obj, zIsClosedForSend0);
            if (iUpdateCellSend == 0) {
                channelSegment.cleanPrev();
                return function0.invoke();
            }
            if (iUpdateCellSend == 1) {
                return function0.invoke();
            }
            if (iUpdateCellSend == 2) {
                if (zIsClosedForSend0) {
                    channelSegment.onSlotCleaned();
                    return function02.invoke();
                }
                Waiter waiter = obj instanceof Waiter ? (Waiter) obj : null;
                if (waiter != null) {
                    prepareSenderForSuspension(waiter, channelSegment, i2);
                }
                return function2.invoke(channelSegment, Integer.valueOf(i2));
            }
            if (iUpdateCellSend == 3) {
                return function4.invoke(channelSegment, Integer.valueOf(i2), e2, Long.valueOf(j2));
            }
            if (iUpdateCellSend == 4) {
                if (j2 < getReceiversCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
                return function02.invoke();
            }
            if (iUpdateCellSend == 5) {
                channelSegment.cleanPrev();
            }
        }
    }

    static /* synthetic */ Object sendImpl$default(BufferedChannel bufferedChannel, Object obj, Object obj2, Function0 function0, Function2 function2, Function0 function02, Function4 function4, int i2, Object obj3) {
        C13871 c13871 = function4;
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendImpl");
        }
        if ((i2 + 32) - (i2 | 32) != 0) {
            c13871 = C13871.INSTANCE;
        }
        ChannelSegment channelSegment = (ChannelSegment) sendSegment$volatile$FU.get(bufferedChannel);
        while (true) {
            long andIncrement = sendersAndCloseStatus$volatile$FU.getAndIncrement(bufferedChannel);
            long j2 = (andIncrement + 1152921504606846975L) - (andIncrement | 1152921504606846975L);
            boolean zIsClosedForSend0 = bufferedChannel.isClosedForSend0(andIncrement);
            long j3 = j2 / ((long) BufferedChannelKt.SEGMENT_SIZE);
            int i3 = (int) (j2 % ((long) BufferedChannelKt.SEGMENT_SIZE));
            if (channelSegment.id != j3) {
                ChannelSegment channelSegmentFindSegmentSend = bufferedChannel.findSegmentSend(j3, channelSegment);
                if (channelSegmentFindSegmentSend != null) {
                    channelSegment = channelSegmentFindSegmentSend;
                } else if (zIsClosedForSend0) {
                    return function02.invoke();
                }
            }
            int iUpdateCellSend = bufferedChannel.updateCellSend(channelSegment, i3, obj, j2, obj2, zIsClosedForSend0);
            if (iUpdateCellSend == 0) {
                channelSegment.cleanPrev();
                return function0.invoke();
            }
            if (iUpdateCellSend == 1) {
                return function0.invoke();
            }
            if (iUpdateCellSend == 2) {
                if (zIsClosedForSend0) {
                    channelSegment.onSlotCleaned();
                    return function02.invoke();
                }
                Waiter waiter = obj2 instanceof Waiter ? (Waiter) obj2 : null;
                if (waiter != null) {
                    bufferedChannel.prepareSenderForSuspension(waiter, channelSegment, i3);
                }
                return function2.invoke(channelSegment, Integer.valueOf(i3));
            }
            if (iUpdateCellSend == 3) {
                return c13871.invoke(channelSegment, Integer.valueOf(i3), obj, Long.valueOf(j2));
            }
            if (iUpdateCellSend == 4) {
                if (j2 < bufferedChannel.getReceiversCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
                return function02.invoke();
            }
            if (iUpdateCellSend == 5) {
                channelSegment.cleanPrev();
            }
        }
    }

    private final void sendImplOnNoWaiter(ChannelSegment<E> channelSegment, int i2, E e2, long j2, Waiter waiter, Function0<Unit> function0, Function0<Unit> function02) {
        Unit unitInvoke;
        Waiter waiter2 = waiter;
        int iUpdateCellSend = updateCellSend(channelSegment, i2, e2, j2, waiter2, false);
        if (iUpdateCellSend == 0) {
            channelSegment.cleanPrev();
            function0.invoke();
            return;
        }
        if (iUpdateCellSend == 1) {
            function0.invoke();
            return;
        }
        if (iUpdateCellSend == 2) {
            prepareSenderForSuspension(waiter2, channelSegment, i2);
            return;
        }
        if (iUpdateCellSend == 4) {
            if (j2 < getReceiversCounter$kotlinx_coroutines_core()) {
                channelSegment.cleanPrev();
            }
            function02.invoke();
            return;
        }
        if (iUpdateCellSend != 5) {
            throw new IllegalStateException("unexpected".toString());
        }
        channelSegment.cleanPrev();
        ChannelSegment channelSegment2 = (ChannelSegment) sendSegment$volatile$FU.get(this);
        while (true) {
            long andIncrement = sendersAndCloseStatus$volatile$FU.getAndIncrement(this);
            long j3 = (andIncrement + 1152921504606846975L) - (andIncrement | 1152921504606846975L);
            boolean zIsClosedForSend0 = isClosedForSend0(andIncrement);
            long j4 = j3 / ((long) BufferedChannelKt.SEGMENT_SIZE);
            int i3 = (int) (j3 % ((long) BufferedChannelKt.SEGMENT_SIZE));
            if (channelSegment2.id != j4) {
                ChannelSegment channelSegmentFindSegmentSend = findSegmentSend(j4, channelSegment2);
                if (channelSegmentFindSegmentSend != null) {
                    channelSegment2 = channelSegmentFindSegmentSend;
                } else if (zIsClosedForSend0) {
                    unitInvoke = function02.invoke();
                    break;
                }
            }
            ChannelSegment channelSegment3 = channelSegment2;
            int iUpdateCellSend2 = updateCellSend(channelSegment2, i3, e2, j3, waiter2, zIsClosedForSend0);
            if (iUpdateCellSend2 == 0) {
                channelSegment3.cleanPrev();
                unitInvoke = function0.invoke();
                break;
            }
            if (iUpdateCellSend2 == 1) {
                unitInvoke = function0.invoke();
                break;
            }
            if (iUpdateCellSend2 != 2) {
                if (iUpdateCellSend2 == 3) {
                    throw new IllegalStateException("unexpected".toString());
                }
                if (iUpdateCellSend2 != 4) {
                    if (iUpdateCellSend2 == 5) {
                        channelSegment3.cleanPrev();
                    }
                    channelSegment2 = channelSegment3;
                } else {
                    if (j3 < getReceiversCounter$kotlinx_coroutines_core()) {
                        channelSegment3.cleanPrev();
                    }
                    unitInvoke = function02.invoke();
                }
            } else if (zIsClosedForSend0) {
                channelSegment3.onSlotCleaned();
                unitInvoke = function02.invoke();
            } else {
                if (!(waiter2 instanceof Waiter)) {
                    waiter2 = null;
                }
                if (waiter2 != null) {
                    prepareSenderForSuspension(waiter2, channelSegment3, i3);
                }
                unitInvoke = Unit.INSTANCE;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x014c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object sendOnNoWaiterSuspend(kotlinx.coroutines.channels.ChannelSegment<E> r27, int r28, E r29, long r30, kotlin.coroutines.Continuation<? super kotlin.Unit> r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.sendOnNoWaiterSuspend(kotlinx.coroutines.channels.ChannelSegment, int, java.lang.Object, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final /* synthetic */ void setBufferEnd$volatile(long j2) {
        this.bufferEnd$volatile = j2;
    }

    private final /* synthetic */ void setBufferEndSegment$volatile(Object obj) {
        this.bufferEndSegment$volatile = obj;
    }

    private final /* synthetic */ void setCloseHandler$volatile(Object obj) {
        this.closeHandler$volatile = obj;
    }

    private final /* synthetic */ void setCompletedExpandBuffersAndPauseFlag$volatile(long j2) {
        this.completedExpandBuffersAndPauseFlag$volatile = j2;
    }

    private final /* synthetic */ void setReceiveSegment$volatile(Object obj) {
        this.receiveSegment$volatile = obj;
    }

    private final /* synthetic */ void setReceivers$volatile(long j2) {
        this.receivers$volatile = j2;
    }

    private final /* synthetic */ void setSendSegment$volatile(Object obj) {
        this.sendSegment$volatile = obj;
    }

    private final /* synthetic */ void setSendersAndCloseStatus$volatile(long j2) {
        this.sendersAndCloseStatus$volatile = j2;
    }

    private final /* synthetic */ void set_closeCause$volatile(Object obj) {
        this._closeCause$volatile = obj;
    }

    private final boolean shouldSendSuspend(long j2) {
        if (isClosedForSend0(j2)) {
            return false;
        }
        return !bufferOrRendezvousSend(j2 & 1152921504606846975L);
    }

    private final boolean tryResumeReceiver(Object obj, E e2) {
        if (obj instanceof SelectInstance) {
            return ((SelectInstance) obj).trySelect(this, e2);
        }
        if (obj instanceof ReceiveCatching) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            CancellableContinuationImpl<ChannelResult<? extends E>> cancellableContinuationImpl = ((ReceiveCatching) obj).cont;
            ChannelResult channelResultM10499boximpl = ChannelResult.m10499boximpl(ChannelResult.Companion.m10514successJP2dKIU(e2));
            Function1<E, Unit> function1 = this.onUndeliveredElement;
            return BufferedChannelKt.tryResume0(cancellableContinuationImpl, channelResultM10499boximpl, (Function3) (function1 != null ? bindCancellationFunResult(function1) : null));
        }
        if (obj instanceof BufferedChannelIterator) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((BufferedChannelIterator) obj).tryResumeHasNext(e2);
        }
        if (!(obj instanceof CancellableContinuation)) {
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
        CancellableContinuation cancellableContinuation = (CancellableContinuation) obj;
        Function1<E, Unit> function12 = this.onUndeliveredElement;
        return BufferedChannelKt.tryResume0(cancellableContinuation, e2, (Function3) (function12 != null ? bindCancellationFun(function12) : null));
    }

    private final boolean tryResumeSender(Object obj, ChannelSegment<E> channelSegment, int i2) {
        if (obj instanceof CancellableContinuation) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return BufferedChannelKt.tryResume0$default((CancellableContinuation) obj, Unit.INSTANCE, null, 2, null);
        }
        if (!(obj instanceof SelectInstance)) {
            if (obj instanceof SendBroadcast) {
                return BufferedChannelKt.tryResume0$default(((SendBroadcast) obj).getCont(), true, null, 2, null);
            }
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        TrySelectDetailedResult trySelectDetailedResultTrySelectDetailed = ((SelectImplementation) obj).trySelectDetailed(this, Unit.INSTANCE);
        if (trySelectDetailedResultTrySelectDetailed == TrySelectDetailedResult.REREGISTER) {
            channelSegment.cleanElement$kotlinx_coroutines_core(i2);
        }
        return trySelectDetailedResultTrySelectDetailed == TrySelectDetailedResult.SUCCESSFUL;
    }

    private final /* synthetic */ void update$atomicfu(Object obj, AtomicLongFieldUpdater atomicLongFieldUpdater, Function1<? super Long, Long> function1) {
        long j2;
        do {
            j2 = atomicLongFieldUpdater.get(obj);
        } while (!atomicLongFieldUpdater.compareAndSet(obj, j2, function1.invoke(Long.valueOf(j2)).longValue()));
    }

    private final boolean updateCellExpandBuffer(ChannelSegment<E> channelSegment, int i2, long j2) {
        Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i2);
        if (!(state$kotlinx_coroutines_core instanceof Waiter) || j2 < receivers$volatile$FU.get(this) || !channelSegment.casState$kotlinx_coroutines_core(i2, state$kotlinx_coroutines_core, BufferedChannelKt.RESUMING_BY_EB)) {
            return updateCellExpandBufferSlow(channelSegment, i2, j2);
        }
        if (tryResumeSender(state$kotlinx_coroutines_core, channelSegment, i2)) {
            channelSegment.setState$kotlinx_coroutines_core(i2, BufferedChannelKt.BUFFERED);
            return true;
        }
        channelSegment.setState$kotlinx_coroutines_core(i2, BufferedChannelKt.INTERRUPTED_SEND);
        channelSegment.onCancelledRequest(i2, false);
        return false;
    }

    private final boolean updateCellExpandBufferSlow(ChannelSegment<E> channelSegment, int i2, long j2) {
        while (true) {
            Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i2);
            if (state$kotlinx_coroutines_core instanceof Waiter) {
                if (j2 < receivers$volatile$FU.get(this)) {
                    if (channelSegment.casState$kotlinx_coroutines_core(i2, state$kotlinx_coroutines_core, new WaiterEB((Waiter) state$kotlinx_coroutines_core))) {
                        return true;
                    }
                } else if (channelSegment.casState$kotlinx_coroutines_core(i2, state$kotlinx_coroutines_core, BufferedChannelKt.RESUMING_BY_EB)) {
                    if (tryResumeSender(state$kotlinx_coroutines_core, channelSegment, i2)) {
                        channelSegment.setState$kotlinx_coroutines_core(i2, BufferedChannelKt.BUFFERED);
                        return true;
                    }
                    channelSegment.setState$kotlinx_coroutines_core(i2, BufferedChannelKt.INTERRUPTED_SEND);
                    channelSegment.onCancelledRequest(i2, false);
                    return false;
                }
            } else {
                if (state$kotlinx_coroutines_core == BufferedChannelKt.INTERRUPTED_SEND) {
                    return false;
                }
                if (state$kotlinx_coroutines_core == null) {
                    if (channelSegment.casState$kotlinx_coroutines_core(i2, state$kotlinx_coroutines_core, BufferedChannelKt.IN_BUFFER)) {
                        return true;
                    }
                } else {
                    if (state$kotlinx_coroutines_core == BufferedChannelKt.BUFFERED || state$kotlinx_coroutines_core == BufferedChannelKt.POISONED || state$kotlinx_coroutines_core == BufferedChannelKt.DONE_RCV || state$kotlinx_coroutines_core == BufferedChannelKt.INTERRUPTED_RCV || state$kotlinx_coroutines_core == BufferedChannelKt.getCHANNEL_CLOSED()) {
                        return true;
                    }
                    if (state$kotlinx_coroutines_core != BufferedChannelKt.RESUMING_BY_RCV) {
                        throw new IllegalStateException(("Unexpected cell state: " + state$kotlinx_coroutines_core).toString());
                    }
                }
            }
        }
    }

    public final Object updateCellReceive(ChannelSegment<E> channelSegment, int i2, long j2, Object obj) {
        Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i2);
        if (state$kotlinx_coroutines_core == null) {
            if (j2 >= (sendersAndCloseStatus$volatile$FU.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return BufferedChannelKt.SUSPEND_NO_WAITER;
                }
                if (channelSegment.casState$kotlinx_coroutines_core(i2, state$kotlinx_coroutines_core, obj)) {
                    expandBuffer();
                    return BufferedChannelKt.SUSPEND;
                }
            }
        } else if (state$kotlinx_coroutines_core == BufferedChannelKt.BUFFERED && channelSegment.casState$kotlinx_coroutines_core(i2, state$kotlinx_coroutines_core, BufferedChannelKt.DONE_RCV)) {
            expandBuffer();
            return channelSegment.retrieveElement$kotlinx_coroutines_core(i2);
        }
        return updateCellReceiveSlow(channelSegment, i2, j2, obj);
    }

    private final Object updateCellReceiveSlow(ChannelSegment<E> channelSegment, int i2, long j2, Object obj) {
        while (true) {
            Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i2);
            if (state$kotlinx_coroutines_core == null || state$kotlinx_coroutines_core == BufferedChannelKt.IN_BUFFER) {
                if (j2 < (-1) - (((-1) - sendersAndCloseStatus$volatile$FU.get(this)) | ((-1) - 1152921504606846975L))) {
                    if (channelSegment.casState$kotlinx_coroutines_core(i2, state$kotlinx_coroutines_core, BufferedChannelKt.POISONED)) {
                        expandBuffer();
                        return BufferedChannelKt.FAILED;
                    }
                } else {
                    if (obj == null) {
                        return BufferedChannelKt.SUSPEND_NO_WAITER;
                    }
                    if (channelSegment.casState$kotlinx_coroutines_core(i2, state$kotlinx_coroutines_core, obj)) {
                        expandBuffer();
                        return BufferedChannelKt.SUSPEND;
                    }
                }
            } else {
                if (state$kotlinx_coroutines_core != BufferedChannelKt.BUFFERED) {
                    if (state$kotlinx_coroutines_core != BufferedChannelKt.INTERRUPTED_SEND && state$kotlinx_coroutines_core != BufferedChannelKt.POISONED) {
                        if (state$kotlinx_coroutines_core == BufferedChannelKt.getCHANNEL_CLOSED()) {
                            expandBuffer();
                            return BufferedChannelKt.FAILED;
                        }
                        if (state$kotlinx_coroutines_core != BufferedChannelKt.RESUMING_BY_EB && channelSegment.casState$kotlinx_coroutines_core(i2, state$kotlinx_coroutines_core, BufferedChannelKt.RESUMING_BY_RCV)) {
                            boolean z2 = state$kotlinx_coroutines_core instanceof WaiterEB;
                            if (z2) {
                                state$kotlinx_coroutines_core = ((WaiterEB) state$kotlinx_coroutines_core).waiter;
                            }
                            if (tryResumeSender(state$kotlinx_coroutines_core, channelSegment, i2)) {
                                channelSegment.setState$kotlinx_coroutines_core(i2, BufferedChannelKt.DONE_RCV);
                                expandBuffer();
                                return channelSegment.retrieveElement$kotlinx_coroutines_core(i2);
                            }
                            channelSegment.setState$kotlinx_coroutines_core(i2, BufferedChannelKt.INTERRUPTED_SEND);
                            channelSegment.onCancelledRequest(i2, false);
                            if (z2) {
                                expandBuffer();
                            }
                            return BufferedChannelKt.FAILED;
                        }
                    }
                    return BufferedChannelKt.FAILED;
                }
                if (channelSegment.casState$kotlinx_coroutines_core(i2, state$kotlinx_coroutines_core, BufferedChannelKt.DONE_RCV)) {
                    expandBuffer();
                    return channelSegment.retrieveElement$kotlinx_coroutines_core(i2);
                }
            }
        }
    }

    public final int updateCellSend(ChannelSegment<E> channelSegment, int i2, E e2, long j2, Object obj, boolean z2) {
        channelSegment.storeElement$kotlinx_coroutines_core(i2, e2);
        if (z2) {
            return updateCellSendSlow(channelSegment, i2, e2, j2, obj, z2);
        }
        Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i2);
        if (state$kotlinx_coroutines_core == null) {
            if (bufferOrRendezvousSend(j2)) {
                if (channelSegment.casState$kotlinx_coroutines_core(i2, null, BufferedChannelKt.BUFFERED)) {
                    return 1;
                }
            } else {
                if (obj == null) {
                    return 3;
                }
                if (channelSegment.casState$kotlinx_coroutines_core(i2, null, obj)) {
                    return 2;
                }
            }
        } else if (state$kotlinx_coroutines_core instanceof Waiter) {
            channelSegment.cleanElement$kotlinx_coroutines_core(i2);
            if (tryResumeReceiver(state$kotlinx_coroutines_core, e2)) {
                channelSegment.setState$kotlinx_coroutines_core(i2, BufferedChannelKt.DONE_RCV);
                onReceiveDequeued();
                return 0;
            }
            if (channelSegment.getAndSetState$kotlinx_coroutines_core(i2, BufferedChannelKt.INTERRUPTED_RCV) != BufferedChannelKt.INTERRUPTED_RCV) {
                channelSegment.onCancelledRequest(i2, true);
            }
            return 5;
        }
        return updateCellSendSlow(channelSegment, i2, e2, j2, obj, z2);
    }

    private final int updateCellSendSlow(ChannelSegment<E> channelSegment, int i2, E e2, long j2, Object obj, boolean z2) {
        while (true) {
            Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i2);
            if (state$kotlinx_coroutines_core == null) {
                if (!bufferOrRendezvousSend(j2) || z2) {
                    if (z2) {
                        if (channelSegment.casState$kotlinx_coroutines_core(i2, null, BufferedChannelKt.INTERRUPTED_SEND)) {
                            channelSegment.onCancelledRequest(i2, false);
                            return 4;
                        }
                    } else {
                        if (obj == null) {
                            return 3;
                        }
                        if (channelSegment.casState$kotlinx_coroutines_core(i2, null, obj)) {
                            return 2;
                        }
                    }
                } else if (channelSegment.casState$kotlinx_coroutines_core(i2, null, BufferedChannelKt.BUFFERED)) {
                    return 1;
                }
            } else {
                if (state$kotlinx_coroutines_core != BufferedChannelKt.IN_BUFFER) {
                    if (state$kotlinx_coroutines_core == BufferedChannelKt.INTERRUPTED_RCV) {
                        channelSegment.cleanElement$kotlinx_coroutines_core(i2);
                        return 5;
                    }
                    if (state$kotlinx_coroutines_core == BufferedChannelKt.POISONED) {
                        channelSegment.cleanElement$kotlinx_coroutines_core(i2);
                        return 5;
                    }
                    if (state$kotlinx_coroutines_core == BufferedChannelKt.getCHANNEL_CLOSED()) {
                        channelSegment.cleanElement$kotlinx_coroutines_core(i2);
                        completeCloseOrCancel();
                        return 4;
                    }
                    if (DebugKt.getASSERTIONS_ENABLED() && !(state$kotlinx_coroutines_core instanceof Waiter) && !(state$kotlinx_coroutines_core instanceof WaiterEB)) {
                        throw new AssertionError();
                    }
                    channelSegment.cleanElement$kotlinx_coroutines_core(i2);
                    if (state$kotlinx_coroutines_core instanceof WaiterEB) {
                        state$kotlinx_coroutines_core = ((WaiterEB) state$kotlinx_coroutines_core).waiter;
                    }
                    if (tryResumeReceiver(state$kotlinx_coroutines_core, e2)) {
                        channelSegment.setState$kotlinx_coroutines_core(i2, BufferedChannelKt.DONE_RCV);
                        onReceiveDequeued();
                        return 0;
                    }
                    if (channelSegment.getAndSetState$kotlinx_coroutines_core(i2, BufferedChannelKt.INTERRUPTED_RCV) != BufferedChannelKt.INTERRUPTED_RCV) {
                        channelSegment.onCancelledRequest(i2, true);
                    }
                    return 5;
                }
                if (channelSegment.casState$kotlinx_coroutines_core(i2, state$kotlinx_coroutines_core, BufferedChannelKt.BUFFERED)) {
                    return 1;
                }
            }
        }
    }

    private final void updateReceiversCounterIfLower(long j2) {
        long j3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = receivers$volatile$FU;
        do {
            j3 = atomicLongFieldUpdater.get(this);
            if (j3 >= j2) {
                return;
            }
        } while (!receivers$volatile$FU.compareAndSet(this, j3, j2));
    }

    private final void updateSendersCounterIfLower(long j2) {
        long j3;
        long j4;
        AtomicLongFieldUpdater atomicLongFieldUpdater = sendersAndCloseStatus$volatile$FU;
        do {
            j3 = atomicLongFieldUpdater.get(this);
            j4 = (-1) - (((-1) - 1152921504606846975L) | ((-1) - j3));
            if (j4 >= j2) {
                return;
            }
        } while (!sendersAndCloseStatus$volatile$FU.compareAndSet(this, j3, BufferedChannelKt.constructSendersAndCloseStatus(j4, (int) (j3 >> 60))));
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final void cancel() {
        cancelImpl$kotlinx_coroutines_core(null);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final void cancel(CancellationException cancellationException) {
        cancelImpl$kotlinx_coroutines_core(cancellationException);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final boolean cancel(Throwable th) {
        return cancelImpl$kotlinx_coroutines_core(th);
    }

    public boolean cancelImpl$kotlinx_coroutines_core(Throwable th) {
        if (th == null) {
            th = new CancellationException("Channel was cancelled");
        }
        return closeOrCancelImpl(th, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void checkSegmentStructureInvariants() {
        if (isRendezvousOrUnlimited()) {
            if (bufferEndSegment$volatile$FU.get(this) != BufferedChannelKt.NULL_SEGMENT) {
                throw new IllegalStateException(("bufferEndSegment must be NULL_SEGMENT for rendezvous and unlimited channels; they do not manipulate it.\nChannel state: " + this).toString());
            }
        } else if (((ChannelSegment) receiveSegment$volatile$FU.get(this)).id > ((ChannelSegment) bufferEndSegment$volatile$FU.get(this)).id) {
            throw new IllegalStateException(("bufferEndSegment should not have lower id than receiveSegment.\nChannel state: " + this).toString());
        }
        List listListOf = CollectionsKt.listOf((Object[]) new ChannelSegment[]{receiveSegment$volatile$FU.get(this), sendSegment$volatile$FU.get(this), bufferEndSegment$volatile$FU.get(this)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listListOf) {
            if (((ChannelSegment) obj) != BufferedChannelKt.NULL_SEGMENT) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j2 = ((ChannelSegment) next).id;
            do {
                Object next2 = it.next();
                long j3 = ((ChannelSegment) next2).id;
                if (j2 > j3) {
                    next = next2;
                    j2 = j3;
                }
            } while (it.hasNext());
        }
        ChannelSegment channelSegment = (ChannelSegment) next;
        if (channelSegment.getPrev() != 0) {
            throw new IllegalStateException(("All processed segments should be unreachable from the data structure, but the `prev` link of the leftmost segment is non-null.\nChannel state: " + this).toString());
        }
        while (channelSegment.getNext() != 0) {
            S next3 = channelSegment.getNext();
            Intrinsics.checkNotNull(next3);
            if (((ChannelSegment) next3).getPrev() != 0) {
                S next4 = channelSegment.getNext();
                Intrinsics.checkNotNull(next4);
                if (((ChannelSegment) next4).getPrev() != channelSegment) {
                    throw new IllegalStateException(("The `segment.next.prev === segment` invariant is violated.\nChannel state: " + this).toString());
                }
            }
            int i2 = BufferedChannelKt.SEGMENT_SIZE;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i4);
                if (!Intrinsics.areEqual(state$kotlinx_coroutines_core, BufferedChannelKt.BUFFERED) && !(state$kotlinx_coroutines_core instanceof Waiter)) {
                    if (Intrinsics.areEqual(state$kotlinx_coroutines_core, BufferedChannelKt.INTERRUPTED_RCV) || Intrinsics.areEqual(state$kotlinx_coroutines_core, BufferedChannelKt.INTERRUPTED_SEND) || Intrinsics.areEqual(state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                        if (channelSegment.getElement$kotlinx_coroutines_core(i4) != null) {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                        i3++;
                    } else {
                        if (!Intrinsics.areEqual(state$kotlinx_coroutines_core, BufferedChannelKt.POISONED) && !Intrinsics.areEqual(state$kotlinx_coroutines_core, BufferedChannelKt.DONE_RCV)) {
                            throw new IllegalStateException(("Unexpected segment cell state: " + state$kotlinx_coroutines_core + ".\nChannel state: " + this).toString());
                        }
                        if (channelSegment.getElement$kotlinx_coroutines_core(i4) != null) {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    }
                }
            }
            if (i3 == BufferedChannelKt.SEGMENT_SIZE && channelSegment != receiveSegment$volatile$FU.get(this) && channelSegment != sendSegment$volatile$FU.get(this) && channelSegment != bufferEndSegment$volatile$FU.get(this)) {
                throw new IllegalStateException(("Logically removed segment is reachable.\nChannel state: " + this).toString());
            }
            S next5 = channelSegment.getNext();
            Intrinsics.checkNotNull(next5);
            channelSegment = (ChannelSegment) next5;
        }
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean close(Throwable th) {
        return closeOrCancelImpl(th, false);
    }

    protected boolean closeOrCancelImpl(Throwable th, boolean z2) {
        if (z2) {
            markCancellationStarted();
        }
        boolean zM = AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_closeCause$volatile$FU, this, BufferedChannelKt.NO_CLOSE_CAUSE, th);
        if (z2) {
            markCancelled();
        } else {
            markClosed();
        }
        completeCloseOrCancel();
        onClosedIdempotent();
        if (zM) {
            invokeCloseHandler();
        }
        return zM;
    }

    protected final void dropFirstElementUntilTheSpecifiedCellIsInTheBuffer(long j2) {
        UndeliveredElementException undeliveredElementExceptionCallUndeliveredElementCatchingException$default;
        if (DebugKt.getASSERTIONS_ENABLED() && !isConflatedDropOldest()) {
            throw new AssertionError();
        }
        ChannelSegment<E> channelSegment = (ChannelSegment) receiveSegment$volatile$FU.get(this);
        while (true) {
            long j3 = receivers$volatile$FU.get(this);
            if (j2 < Math.max(((long) this.capacity) + j3, getBufferEndCounter())) {
                return;
            }
            if (receivers$volatile$FU.compareAndSet(this, j3, j3 + 1)) {
                long j4 = j3 / ((long) BufferedChannelKt.SEGMENT_SIZE);
                int i2 = (int) (j3 % ((long) BufferedChannelKt.SEGMENT_SIZE));
                if (channelSegment.id != j4) {
                    ChannelSegment<E> channelSegmentFindSegmentReceive = findSegmentReceive(j4, channelSegment);
                    if (channelSegmentFindSegmentReceive == null) {
                        continue;
                    } else {
                        channelSegment = channelSegmentFindSegmentReceive;
                    }
                }
                Object objUpdateCellReceive = updateCellReceive(channelSegment, i2, j3, null);
                if (objUpdateCellReceive != BufferedChannelKt.FAILED) {
                    channelSegment.cleanPrev();
                    Function1<E, Unit> function1 = this.onUndeliveredElement;
                    if (function1 != null && (undeliveredElementExceptionCallUndeliveredElementCatchingException$default = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(function1, objUpdateCellReceive, null, 2, null)) != null) {
                        throw undeliveredElementExceptionCallUndeliveredElementCatchingException$default;
                    }
                } else if (j3 < getSendersCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
            }
        }
    }

    protected final Throwable getCloseCause() {
        return (Throwable) _closeCause$volatile$FU.get(this);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public SelectClause1<E> getOnReceive() {
        BufferedChannel$onReceive$1 bufferedChannel$onReceive$1 = BufferedChannel$onReceive$1.INSTANCE;
        Intrinsics.checkNotNull(bufferedChannel$onReceive$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        Function3 function3 = (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onReceive$1, 3);
        BufferedChannel$onReceive$2 bufferedChannel$onReceive$2 = BufferedChannel$onReceive$2.INSTANCE;
        Intrinsics.checkNotNull(bufferedChannel$onReceive$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new SelectClause1Impl(this, function3, (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onReceive$2, 3), this.onUndeliveredElementReceiveCancellationConstructor);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public SelectClause1<ChannelResult<E>> getOnReceiveCatching() {
        BufferedChannel$onReceiveCatching$1 bufferedChannel$onReceiveCatching$1 = BufferedChannel$onReceiveCatching$1.INSTANCE;
        Intrinsics.checkNotNull(bufferedChannel$onReceiveCatching$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        Function3 function3 = (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onReceiveCatching$1, 3);
        BufferedChannel$onReceiveCatching$2 bufferedChannel$onReceiveCatching$2 = BufferedChannel$onReceiveCatching$2.INSTANCE;
        Intrinsics.checkNotNull(bufferedChannel$onReceiveCatching$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new SelectClause1Impl(this, function3, (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onReceiveCatching$2, 3), this.onUndeliveredElementReceiveCancellationConstructor);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public SelectClause1<E> getOnReceiveOrNull() {
        BufferedChannel$onReceiveOrNull$1 bufferedChannel$onReceiveOrNull$1 = BufferedChannel$onReceiveOrNull$1.INSTANCE;
        Intrinsics.checkNotNull(bufferedChannel$onReceiveOrNull$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        Function3 function3 = (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onReceiveOrNull$1, 3);
        BufferedChannel$onReceiveOrNull$2 bufferedChannel$onReceiveOrNull$2 = BufferedChannel$onReceiveOrNull$2.INSTANCE;
        Intrinsics.checkNotNull(bufferedChannel$onReceiveOrNull$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new SelectClause1Impl(this, function3, (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onReceiveOrNull$2, 3), this.onUndeliveredElementReceiveCancellationConstructor);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public SelectClause2<E, BufferedChannel<E>> getOnSend() {
        BufferedChannel$onSend$1 bufferedChannel$onSend$1 = BufferedChannel$onSend$1.INSTANCE;
        Intrinsics.checkNotNull(bufferedChannel$onSend$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        Function3 function3 = (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onSend$1, 3);
        BufferedChannel$onSend$2 bufferedChannel$onSend$2 = BufferedChannel$onSend$2.INSTANCE;
        Intrinsics.checkNotNull(bufferedChannel$onSend$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new SelectClause2Impl(this, function3, (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onSend$2, 3), null, 8, null);
    }

    public final long getReceiversCounter$kotlinx_coroutines_core() {
        return receivers$volatile$FU.get(this);
    }

    protected final Throwable getSendException() {
        Throwable closeCause = getCloseCause();
        return closeCause == null ? new ClosedSendChannelException(ChannelsKt.DEFAULT_CLOSE_MESSAGE) : closeCause;
    }

    public final long getSendersCounter$kotlinx_coroutines_core() {
        return sendersAndCloseStatus$volatile$FU.get(this) & 1152921504606846975L;
    }

    public final boolean hasElements$kotlinx_coroutines_core() {
        while (true) {
            ChannelSegment<E> channelSegmentFindSegmentReceive = (ChannelSegment) receiveSegment$volatile$FU.get(this);
            long receiversCounter$kotlinx_coroutines_core = getReceiversCounter$kotlinx_coroutines_core();
            if (getSendersCounter$kotlinx_coroutines_core() <= receiversCounter$kotlinx_coroutines_core) {
                return false;
            }
            long j2 = receiversCounter$kotlinx_coroutines_core / ((long) BufferedChannelKt.SEGMENT_SIZE);
            if (channelSegmentFindSegmentReceive.id == j2 || (channelSegmentFindSegmentReceive = findSegmentReceive(j2, channelSegmentFindSegmentReceive)) != null) {
                channelSegmentFindSegmentReceive.cleanPrev();
                if (isCellNonEmpty(channelSegmentFindSegmentReceive, (int) (receiversCounter$kotlinx_coroutines_core % ((long) BufferedChannelKt.SEGMENT_SIZE)), receiversCounter$kotlinx_coroutines_core)) {
                    return true;
                }
                receivers$volatile$FU.compareAndSet(this, receiversCounter$kotlinx_coroutines_core, 1 + receiversCounter$kotlinx_coroutines_core);
            } else if (((ChannelSegment) receiveSegment$volatile$FU.get(this)).id < j2) {
                return false;
            }
        }
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: invokeOnClose */
    public void mo10566invokeOnClose(Function1<? super Throwable, Unit> function1) {
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(closeHandler$volatile$FU, this, null, function1)) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = closeHandler$volatile$FU;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != BufferedChannelKt.CLOSE_HANDLER_CLOSED) {
                if (obj != BufferedChannelKt.CLOSE_HANDLER_INVOKED) {
                    throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
                }
                throw new IllegalStateException("Another handler was already registered and successfully invoked".toString());
            }
        } while (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(closeHandler$volatile$FU, this, BufferedChannelKt.CLOSE_HANDLER_CLOSED, BufferedChannelKt.CLOSE_HANDLER_INVOKED));
        function1.invoke(getCloseCause());
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public boolean isClosedForReceive() {
        return isClosedForReceive0(sendersAndCloseStatus$volatile$FU.get(this));
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean isClosedForSend() {
        return isClosedForSend0(sendersAndCloseStatus$volatile$FU.get(this));
    }

    protected boolean isConflatedDropOldest() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public boolean isEmpty() {
        if (isClosedForReceive() || hasElements$kotlinx_coroutines_core()) {
            return false;
        }
        return !isClosedForReceive();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public ChannelIterator<E> iterator() {
        return new BufferedChannelIterator();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @Deprecated(level = DeprecationLevel.ERROR, message = "\u0007K\fGvw\u0016k]Kg\u0004^T@Va\f\u000f(\u001bw!d6Ut*\u0015\t6\u007f[QrF\u0014\u001cu>Z&B>", replaceWith = @ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
    @InterfaceC1492Gx
    public boolean offer(E e2) {
        return Channel.DefaultImpls.offer(this, e2);
    }

    protected void onClosedIdempotent() {
    }

    protected void onReceiveDequeued() {
    }

    protected void onReceiveEnqueued() {
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @Deprecated(level = DeprecationLevel.ERROR, message = "\u0007K\fGvw\u0016k]Kg\u0004^T@Va\f\u000f(\u001bw!d6Ut*\u0015\t6\u007fZQgGVrm\u007f\u0014]#F\u0017W_~afWOj}H\u001a\r[SX#{s\u0012\u0005\u001b\u0006@ P\u0002;o'\u0018\bI\u0013D\bF<<pW~@f[|\u000b454I$.\u0011*,J<Z\u0013.-CC,\u000eV)MJib\u000b4\u001ddL7.&sr^\u0010\u0014\u0010;++\u001cM[#I%1\rw\u0011\\\u00026T0.}q\u0004O\u001fr3\u001czi\u000fo%3vb\"\u0005t`O/L&[\u001e`-1 YFKU9M\fhkZ,;\u0014_\rveKtva\u0004'H\\C\"", replaceWith = @ReplaceWith(expression = "tryReceive().getOrNull()", imports = {}))
    @InterfaceC1492Gx
    public E poll() {
        return (E) Channel.DefaultImpls.poll(this);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public Object receive(Continuation<? super E> continuation) {
        return receive$suspendImpl(this, continuation);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* JADX INFO: renamed from: receiveCatching-JP2dKIU */
    public Object mo10491receiveCatchingJP2dKIU(Continuation<? super ChannelResult<? extends E>> continuation) {
        return m10489receiveCatchingJP2dKIU$suspendImpl(this, continuation);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @Deprecated(level = DeprecationLevel.ERROR, message = "\u0007K\fGvw\u0016k]Kg\u0004^T2Or[\u001bf\u0014nK\u0019\tKqoW\u000b)Ii`gJVjo\u007f\u0014]#F\u0017W_~afWOj}H\u001a\r[SX#{s\u0012\u0005\u001b\u0006@ P\u0002;o'\u0018\bI\u0013D\bF<<pW~@f[|\u000b454I$.\u0011*,J<Z\u0013.-CC,\u000eV)MJib\u000b4\u001ddL7.&sr^\u0012\n\u00074m\u0002\u001d3iE\u001f+.Aw\u0001]\u0001B\u0004$8\r(\u0005Rd 2\u0011\u0003i\u0015v\u001d2(`g\u0005t\\Q!TkW-\u001a8+eFJ\u0011\u0001CMR'm\u000b4>\r4\u0011l\"|yvVt/JX#&W;\n+Ka,\u000e\u0005\u0019@\u0003SIhEM#)", replaceWith = @ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
    @InterfaceC1492Gx
    public Object receiveOrNull(Continuation<? super E> continuation) {
        return Channel.DefaultImpls.receiveOrNull(this, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0081, code lost:
    
        r14.selectInRegistrationPhase(kotlin.Unit.INSTANCE);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void registerSelectForSend(kotlinx.coroutines.selects.SelectInstance<?> r14, java.lang.Object r15) {
        /*
            r13 = this;
            r11 = r14
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = access$getSendSegment$volatile$FU()
            java.lang.Object r6 = r0.get(r13)
            kotlinx.coroutines.channels.ChannelSegment r6 = (kotlinx.coroutines.channels.ChannelSegment) r6
        Lb:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = access$getSendersAndCloseStatus$volatile$FU()
            long r0 = r0.getAndIncrement(r13)
            r2 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            r9 = -1
            long r4 = r9 - r2
            long r2 = r9 - r0
            long r4 = r4 | r2
            long r9 = r9 - r4
            boolean r12 = access$isClosedForSend0(r13, r0)
            int r0 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r0 = (long) r0
            long r0 = r9 / r0
            int r2 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r2 = (long) r2
            long r2 = r9 % r2
            int r7 = (int) r2
            long r2 = r6.id
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r8 = r15
            if (r4 == 0) goto L43
            kotlinx.coroutines.channels.ChannelSegment r0 = access$findSegmentSend(r13, r0, r6)
            if (r0 != 0) goto L42
            if (r12 == 0) goto Lb
        L3e:
            r13.onClosedSelectOnSend(r8, r11)
        L41:
            return
        L42:
            r6 = r0
        L43:
            r5 = r13
            int r1 = access$updateCellSend(r5, r6, r7, r8, r9, r11, r12)
            if (r1 == 0) goto L7e
            r0 = 1
            if (r1 == r0) goto L81
            r0 = 2
            if (r1 == r0) goto L6a
            r0 = 3
            if (r1 == r0) goto L87
            r0 = 4
            if (r1 == r0) goto L5e
            r0 = 5
            if (r1 == r0) goto L5a
            goto Lb
        L5a:
            r6.cleanPrev()
            goto Lb
        L5e:
            long r1 = r13.getReceiversCounter$kotlinx_coroutines_core()
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 >= 0) goto L3e
            r6.cleanPrev()
            goto L3e
        L6a:
            if (r12 == 0) goto L70
            r6.onSlotCleaned()
            goto L3e
        L70:
            boolean r0 = r11 instanceof kotlinx.coroutines.Waiter
            if (r0 == 0) goto L7c
            kotlinx.coroutines.Waiter r11 = (kotlinx.coroutines.Waiter) r11
        L76:
            if (r11 == 0) goto L41
            access$prepareSenderForSuspension(r13, r11, r6, r7)
            goto L41
        L7c:
            r11 = 0
            goto L76
        L7e:
            r6.cleanPrev()
        L81:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            r11.selectInRegistrationPhase(r0)
            goto L41
        L87:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected"
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.registerSelectForSend(kotlinx.coroutines.selects.SelectInstance, java.lang.Object):void");
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public Object send(E e2, Continuation<? super Unit> continuation) {
        return send$suspendImpl(this, e2, continuation);
    }

    public Object sendBroadcast$kotlinx_coroutines_core(E e2, Continuation<? super Boolean> continuation) {
        return sendBroadcast$suspendImpl(this, e2, continuation);
    }

    public boolean shouldSendSuspend$kotlinx_coroutines_core() {
        return shouldSendSuspend(sendersAndCloseStatus$volatile$FU.get(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:190:0x01bb, code lost:
    
        r1 = (kotlinx.coroutines.channels.ChannelSegment) r1.getNext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x01c1, code lost:
    
        if (r1 != null) goto L197;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 523
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.toString():java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toStringDebug$kotlinx_coroutines_core() {
        StringBuilder sb = new StringBuilder();
        sb.append("S=" + getSendersCounter$kotlinx_coroutines_core() + ",R=" + getReceiversCounter$kotlinx_coroutines_core() + ",B=" + getBufferEndCounter() + ",B'=" + completedExpandBuffersAndPauseFlag$volatile$FU.get(this) + ",C=" + ((int) (sendersAndCloseStatus$volatile$FU.get(this) >> 60)) + AbstractJsonLexerKt.COMMA);
        int i2 = (int) (sendersAndCloseStatus$volatile$FU.get(this) >> 60);
        if (i2 == 1) {
            sb.append("CANCELLATION_STARTED,");
        } else if (i2 == 2) {
            sb.append("CLOSED,");
        } else if (i2 == 3) {
            sb.append("CANCELLED,");
        }
        sb.append("SEND_SEGM=" + DebugStringsKt.getHexAddress(sendSegment$volatile$FU.get(this)) + ",RCV_SEGM=" + DebugStringsKt.getHexAddress(receiveSegment$volatile$FU.get(this)));
        if (!isRendezvousOrUnlimited()) {
            sb.append(",EB_SEGM=" + DebugStringsKt.getHexAddress(bufferEndSegment$volatile$FU.get(this)));
        }
        sb.append("  ");
        List listListOf = CollectionsKt.listOf((Object[]) new ChannelSegment[]{receiveSegment$volatile$FU.get(this), sendSegment$volatile$FU.get(this), bufferEndSegment$volatile$FU.get(this)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listListOf) {
            if (((ChannelSegment) obj) != BufferedChannelKt.NULL_SEGMENT) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j2 = ((ChannelSegment) next).id;
            do {
                Object next2 = it.next();
                long j3 = ((ChannelSegment) next2).id;
                if (j2 > j3) {
                    next = next2;
                    j2 = j3;
                }
            } while (it.hasNext());
        }
        ChannelSegment channelSegment = (ChannelSegment) next;
        do {
            StringBuilder sbAppend = new StringBuilder().append(DebugStringsKt.getHexAddress(channelSegment)).append("=[").append(channelSegment.isRemoved() ? ProxyConfig.MATCH_ALL_SCHEMES : "").append(channelSegment.id).append(",prev=");
            ChannelSegment channelSegment2 = (ChannelSegment) channelSegment.getPrev();
            sb.append(sbAppend.append(channelSegment2 != null ? DebugStringsKt.getHexAddress(channelSegment2) : null).append(AbstractJsonLexerKt.COMMA).toString());
            int i3 = BufferedChannelKt.SEGMENT_SIZE;
            for (int i4 = 0; i4 < i3; i4++) {
                Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i4);
                sb.append("[" + i4 + "]=(" + (state$kotlinx_coroutines_core instanceof CancellableContinuation ? "cont" : state$kotlinx_coroutines_core instanceof SelectInstance ? "select" : state$kotlinx_coroutines_core instanceof ReceiveCatching ? "receiveCatching" : state$kotlinx_coroutines_core instanceof SendBroadcast ? "send(broadcast)" : state$kotlinx_coroutines_core instanceof WaiterEB ? "EB(" + state$kotlinx_coroutines_core + ')' : String.valueOf(state$kotlinx_coroutines_core)) + AbstractJsonLexerKt.COMMA + channelSegment.getElement$kotlinx_coroutines_core(i4) + "),");
            }
            StringBuilder sb2 = new StringBuilder("next=");
            ChannelSegment channelSegment3 = (ChannelSegment) channelSegment.getNext();
            sb.append(sb2.append(channelSegment3 != null ? DebugStringsKt.getHexAddress(channelSegment3) : null).append("]  ").toString());
            channelSegment = (ChannelSegment) channelSegment.getNext();
        } while (channelSegment != null);
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* JADX INFO: renamed from: tryReceive-PtdJZtk */
    public Object mo10492tryReceivePtdJZtk() {
        long j2 = receivers$volatile$FU.get(this);
        long j3 = sendersAndCloseStatus$volatile$FU.get(this);
        if (isClosedForReceive0(j3)) {
            return ChannelResult.Companion.m10512closedJP2dKIU(getCloseCause());
        }
        if (j2 >= (-1) - (((-1) - j3) | ((-1) - 1152921504606846975L))) {
            return ChannelResult.Companion.m10513failurePtdJZtk();
        }
        Object obj = BufferedChannelKt.INTERRUPTED_RCV;
        ChannelSegment channelSegment = (ChannelSegment) getReceiveSegment$volatile$FU().get(this);
        while (!isClosedForReceive()) {
            long andIncrement = getReceivers$volatile$FU().getAndIncrement(this);
            long j4 = andIncrement / ((long) BufferedChannelKt.SEGMENT_SIZE);
            int i2 = (int) (andIncrement % ((long) BufferedChannelKt.SEGMENT_SIZE));
            if (channelSegment.id != j4) {
                ChannelSegment channelSegmentFindSegmentReceive = findSegmentReceive(j4, channelSegment);
                if (channelSegmentFindSegmentReceive == null) {
                    continue;
                } else {
                    channelSegment = channelSegmentFindSegmentReceive;
                }
            }
            Object objUpdateCellReceive = updateCellReceive(channelSegment, i2, andIncrement, obj);
            if (objUpdateCellReceive == BufferedChannelKt.SUSPEND) {
                Waiter waiter = obj instanceof Waiter ? (Waiter) obj : null;
                if (waiter != null) {
                    prepareReceiverForSuspension(waiter, channelSegment, i2);
                }
                waitExpandBufferCompletion$kotlinx_coroutines_core(andIncrement);
                channelSegment.onSlotCleaned();
                return ChannelResult.Companion.m10513failurePtdJZtk();
            }
            if (objUpdateCellReceive != BufferedChannelKt.FAILED) {
                if (objUpdateCellReceive == BufferedChannelKt.SUSPEND_NO_WAITER) {
                    throw new IllegalStateException("unexpected".toString());
                }
                channelSegment.cleanPrev();
                return ChannelResult.Companion.m10514successJP2dKIU(objUpdateCellReceive);
            }
            if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                channelSegment.cleanPrev();
            }
        }
        return ChannelResult.Companion.m10512closedJP2dKIU(getCloseCause());
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:?, code lost:
    
        return kotlinx.coroutines.channels.ChannelResult.Companion.m10514successJP2dKIU(kotlin.Unit.INSTANCE);
     */
    @Override // kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: trySend-JP2dKIU */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo10484trySendJP2dKIU(E r16) {
        /*
            r15 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = getSendersAndCloseStatus$volatile$FU()
            long r0 = r0.get(r15)
            boolean r0 = r15.shouldSendSuspend(r0)
            if (r0 == 0) goto L15
            kotlinx.coroutines.channels.ChannelResult$Companion r0 = kotlinx.coroutines.channels.ChannelResult.Companion
            java.lang.Object r0 = r0.m10513failurePtdJZtk()
            return r0
        L15:
            kotlinx.coroutines.internal.Symbol r13 = kotlinx.coroutines.channels.BufferedChannelKt.access$getINTERRUPTED_SEND$p()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = access$getSendSegment$volatile$FU()
            java.lang.Object r8 = r0.get(r15)
            kotlinx.coroutines.channels.ChannelSegment r8 = (kotlinx.coroutines.channels.ChannelSegment) r8
        L23:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = access$getSendersAndCloseStatus$volatile$FU()
            long r0 = r0.getAndIncrement(r15)
            r6 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            r11 = -1
            long r4 = r11 - r0
            long r2 = r11 - r6
            long r4 = r4 | r2
            long r11 = r11 - r4
            boolean r14 = access$isClosedForSend0(r15, r0)
            int r0 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r0 = (long) r0
            long r0 = r11 / r0
            int r2 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r2 = (long) r2
            long r2 = r11 % r2
            int r9 = (int) r2
            long r2 = r8.id
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L60
            kotlinx.coroutines.channels.ChannelSegment r0 = access$findSegmentSend(r15, r0, r8)
            if (r0 != 0) goto L61
            if (r14 == 0) goto L23
        L55:
            kotlinx.coroutines.channels.ChannelResult$Companion r1 = kotlinx.coroutines.channels.ChannelResult.Companion
            java.lang.Throwable r0 = r15.getSendException()
            java.lang.Object r0 = r1.m10512closedJP2dKIU(r0)
        L5f:
            return r0
        L60:
            goto L62
        L61:
            r8 = r0
        L62:
            r7 = r15
            r10 = r16
            int r1 = access$updateCellSend(r7, r8, r9, r10, r11, r13, r14)
            if (r1 == 0) goto La8
            r0 = 1
            if (r1 == r0) goto Lab
            r0 = 2
            if (r1 == r0) goto L8b
            r0 = 3
            if (r1 == r0) goto Lb4
            r0 = 4
            if (r1 == r0) goto L7f
            r0 = 5
            if (r1 == r0) goto L7b
        L7a:
            goto L23
        L7b:
            r8.cleanPrev()
            goto L7a
        L7f:
            long r1 = r15.getReceiversCounter$kotlinx_coroutines_core()
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 >= 0) goto L55
            r8.cleanPrev()
            goto L55
        L8b:
            if (r14 == 0) goto L91
            r8.onSlotCleaned()
            goto L55
        L91:
            boolean r0 = r13 instanceof kotlinx.coroutines.Waiter
            if (r0 == 0) goto La6
            kotlinx.coroutines.Waiter r13 = (kotlinx.coroutines.Waiter) r13
        L97:
            if (r13 == 0) goto L9c
            access$prepareSenderForSuspension(r15, r13, r8, r9)
        L9c:
            r8.onSlotCleaned()
            kotlinx.coroutines.channels.ChannelResult$Companion r0 = kotlinx.coroutines.channels.ChannelResult.Companion
            java.lang.Object r0 = r0.m10513failurePtdJZtk()
            goto L5f
        La6:
            r13 = 0
            goto L97
        La8:
            r8.cleanPrev()
        Lab:
            kotlinx.coroutines.channels.ChannelResult$Companion r1 = kotlinx.coroutines.channels.ChannelResult.Companion
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            java.lang.Object r0 = r1.m10514successJP2dKIU(r0)
            goto L5f
        Lb4:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected"
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.mo10484trySendJP2dKIU(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: renamed from: trySendDropOldest-JP2dKIU */
    protected final Object m10493trySendDropOldestJP2dKIU(E e2) {
        Object obj = BufferedChannelKt.BUFFERED;
        ChannelSegment channelSegment = (ChannelSegment) sendSegment$volatile$FU.get(this);
        while (true) {
            long andIncrement = sendersAndCloseStatus$volatile$FU.getAndIncrement(this);
            long j2 = andIncrement & 1152921504606846975L;
            boolean zIsClosedForSend0 = isClosedForSend0(andIncrement);
            long j3 = j2 / ((long) BufferedChannelKt.SEGMENT_SIZE);
            int i2 = (int) (j2 % ((long) BufferedChannelKt.SEGMENT_SIZE));
            if (channelSegment.id != j3) {
                ChannelSegment channelSegmentFindSegmentSend = findSegmentSend(j3, channelSegment);
                if (channelSegmentFindSegmentSend != null) {
                    channelSegment = channelSegmentFindSegmentSend;
                } else if (zIsClosedForSend0) {
                    return ChannelResult.Companion.m10512closedJP2dKIU(getSendException());
                }
            }
            int iUpdateCellSend = updateCellSend(channelSegment, i2, e2, j2, obj, zIsClosedForSend0);
            if (iUpdateCellSend == 0) {
                channelSegment.cleanPrev();
                return ChannelResult.Companion.m10514successJP2dKIU(Unit.INSTANCE);
            }
            if (iUpdateCellSend == 1) {
                return ChannelResult.Companion.m10514successJP2dKIU(Unit.INSTANCE);
            }
            if (iUpdateCellSend == 2) {
                if (zIsClosedForSend0) {
                    channelSegment.onSlotCleaned();
                    return ChannelResult.Companion.m10512closedJP2dKIU(getSendException());
                }
                Waiter waiter = obj instanceof Waiter ? (Waiter) obj : null;
                if (waiter != null) {
                    prepareSenderForSuspension(waiter, channelSegment, i2);
                }
                dropFirstElementUntilTheSpecifiedCellIsInTheBuffer((channelSegment.id * ((long) BufferedChannelKt.SEGMENT_SIZE)) + ((long) i2));
                return ChannelResult.Companion.m10514successJP2dKIU(Unit.INSTANCE);
            }
            if (iUpdateCellSend == 3) {
                throw new IllegalStateException("unexpected".toString());
            }
            if (iUpdateCellSend == 4) {
                if (j2 < getReceiversCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
                return ChannelResult.Companion.m10512closedJP2dKIU(getSendException());
            }
            if (iUpdateCellSend == 5) {
                channelSegment.cleanPrev();
            }
        }
    }

    public final void waitExpandBufferCompletion$kotlinx_coroutines_core(long j2) {
        long j3;
        long j4;
        if (isRendezvousOrUnlimited()) {
            return;
        }
        while (getBufferEndCounter() <= j2) {
        }
        int i2 = BufferedChannelKt.EXPAND_BUFFER_COMPLETION_WAIT_ITERATIONS;
        for (int i3 = 0; i3 < i2; i3++) {
            long bufferEndCounter = getBufferEndCounter();
            long j5 = completedExpandBuffersAndPauseFlag$volatile$FU.get(this);
            if (bufferEndCounter == (j5 + DurationKt.MAX_MILLIS) - (j5 | DurationKt.MAX_MILLIS) && bufferEndCounter == getBufferEndCounter()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = completedExpandBuffersAndPauseFlag$volatile$FU;
        do {
            j3 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j3, BufferedChannelKt.constructEBCompletedAndPauseFlag((j3 + DurationKt.MAX_MILLIS) - (j3 | DurationKt.MAX_MILLIS), true)));
        while (true) {
            long bufferEndCounter2 = getBufferEndCounter();
            long j6 = completedExpandBuffersAndPauseFlag$volatile$FU.get(this);
            long j7 = (-1) - (((-1) - j6) | ((-1) - DurationKt.MAX_MILLIS));
            boolean z2 = (Longs.MAX_POWER_OF_TWO & j6) != 0;
            if (bufferEndCounter2 == j7 && bufferEndCounter2 == getBufferEndCounter()) {
                break;
            } else if (!z2) {
                completedExpandBuffersAndPauseFlag$volatile$FU.compareAndSet(this, j6, BufferedChannelKt.constructEBCompletedAndPauseFlag(j7, true));
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = completedExpandBuffersAndPauseFlag$volatile$FU;
        do {
            j4 = atomicLongFieldUpdater2.get(this);
        } while (!atomicLongFieldUpdater2.compareAndSet(this, j4, BufferedChannelKt.constructEBCompletedAndPauseFlag(j4 & DurationKt.MAX_MILLIS, false)));
    }
}
