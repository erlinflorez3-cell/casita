package kotlinx.coroutines;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.StackTraceRecoveryKt;
import kotlinx.coroutines.selects.SelectClause0;
import kotlinx.coroutines.selects.SelectClause0Impl;
import kotlinx.coroutines.selects.SelectClause1;
import kotlinx.coroutines.selects.SelectClause1Impl;
import kotlinx.coroutines.selects.SelectInstance;
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
@Deprecated(level = DeprecationLevel.ERROR, message = "\u0017N\u0005H1}(\u0017aU<\u007fb#-Z\u001c-x\u0010Di\u001aV6So\u0004\u000ev)&zQqQcalxO,rN\u001a[\f\u007f7l]Mj}F\u0017\u0018L\u0015W \n")
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яű\u0014D57\u001eq\u007fZDkt\u001aA\u000e0!.Jչ*, \u0001\u000ffp:8D{H6RY+\u0017k\u00124,[2ڎKП]\u001a\u0014\"\u0011OToonXZ\u0013C\u0015\b\u001exx+Qǁ\u0001](\u000f:BuB;M\u0006=A`z6\r @#@ц\r\u0001(HP\u0010|{KK\"\u00128@v<Z\rc\u0005\"\u0012\fA(\u00014\\oN<Ht]H5+\u0003oBV'u0\u0005M#F\\'\u0013wi\u001e9L?5\u001b*[\u0003\u001dRcΪ\u000b?\b=\rh='3Iy_>X\u0016\u0014\u001dۀW\rsr.\\\u000bUh\f=+WcQT\u0016(\u000ez\u0004\rB\u0013\u0016\u0006=H6- u\u0010\u000eItzSFQ\n^X\u007f\u0003ʨ>\u0017;\u007f;+?3nQw;!N=\u0006\u000b\"4ŀ1nOZ\u0005\u000e\u000f\u0015KT&RiYͯ<˫M̟Xǚl\u058co#\u000f:\b>I\u0018/*\u0014ѧ\u001b'=_G(i{\u0010`\\g%\u001e\u0011na~jJV!\u001d\u0015},Q)ha|\u0005\u001an\u0005j:0e*d\u000b\u000e\n)\u001f\u000b\u0004L#5\u0010|h\u0017\n1ܗcR?=\fO[\u0005j<cibAOic>\b\u0003|\"fTd\u001bW\u0015N\u001a\f#z6JJJ\u0001\u000f&%tR\u001a-J? Bd6?Ct\u001bX\u0005.Bo&7\u000b!hX\u001bb_<\u0003\u0018=%\r\u000f}tp\u001e\u0011)S:'x(=Ca5GO\u0004M/4E;\u0015-\f\u007fuj|KZ\u0007.u\u0004+P\u001c(ii1S\u0012=\u000bo2JES}\u000be\u007ffB+\t\u0017\u0012\u000fi\u0018^m\u0016\u001b\t.vix[\u001b\u0017j\rl%;\b\u0013\u0019*eT._c\u0003?\fBW(\u001bYjw~|M-,[\u0019oP\u007fe1Q\\5\u0016&=u\u0015*qw'Fy\u0011(Nt\u00148\\i$%zSs1ia\u0010YGk0\\\u0005\u0003pa\u001b{\u0016u!4;gxGr&n:c\n]'\u0017\u0017:F\tbk<#o,n>a:sq\u0001B~\nќ\u0017\u0016Wu)\u0006K\u000b\u000e\u0013\u001f\u0018G\u00141\u001dOLC.pod\u001f/4\u007f^6\nApCT\tRMrNP\u0018Q\u0014\u0002\n><hF>Oł6B\u0002}\u001f-b<tZvFIE?aR\u0001-8c&~5?I\u0006Hj.\u0012wGU\u009b\r\u001bx\u0016G\u00193w\\TghX}\u000fY]~S\\\u0012G\u001aFW\u0017Ãs\u0016>h\r#Hi+;W\u0017\u0006,@`\u001bU\u0013g\u0013\u0017zf1\u001eĀ-~\tOV~\u0018[#\u0019}@ f; fweFJ\u0005%\u0019A\u0007:\u007f\u0014k){\u001eV=PY{*&*\u0001ĺ?\b\u000ep0-\nF1^]\u0014\r?m\u001dJ\u0016 /\u0011\"q\u0013/oɯ2J\u0003HRI\u0016\rg\u0002aOCbg@\u0010!n*[p\u0014\u001ach'D*ؙ̼rU\u0011[/ZdS\u0007-~ 9+[\u0006+X\ttAi.3)\u0012$\u00176\u001fd7r+ O\u0012\u001d\u0001m_[;.]GpԠ7x`,Z7y$\u001dZX6/SV{\u001c+\t%zP6&^\u0019A\u0015x\u001aC,|-\u0003%\u0011[@TR6d]P_ۙ\u001aǏK`\u0015d\u000eO4\u0003IRm\u001e}2S{6Y)\u0003h{;ʗhш\rr\u000eHtIT>U\u001aUrTurm>OU8H\tZ|>\u0017=GP\"T[H(\u0002Q{T'~\u0019\u0015f\u001f \u000b'\r\u0003Q\u0002_pʈϘ\u0005\rEhy\u0007HeOrQH?{)\r~C;4\u0014\u000e\u0010\u000e\u0018d)?\u0014wȡ\u0013a:<}K,mm@.Oe6l\u0016\u0004\u0015\u0018E_KZejunum\u0003TS|\u0004\r1Ua\u0011s8E\u001a\u001c\u0002\u001asabjA(aPL El5^}l\b\u0002\\\rs\u0015\u007f\u001d\u0014!K\u0017+\u0013\u007fuN`ar{X#q\u0005!\u0002|R2\u00109*MN\u000fB\bC\u0011\u0003\r3\u007f{Kw\u0010f\u0015=\u0013\u0012-ITv~\u000f)^ñֲzF<WA_O^#B%#\r:r\u0012\u0019;.0^\u00160\n\u0011`]8AD\fAu\u0010\u0007\u0004'\u001d\u001f =\b;f\u0019\ro]wXKnK\r\u0004I\u0007^,ڥ\u000bȜ%LjƔ\u0014Hz9ɻFnBHkA\u0006l\u0006+\\ЄHxRj6A>ߦO\u0017Zq\u00071\"-rm\u0017{}`n}[-$9ŏV\u0007Tk\"[\u00052\t\u001ev1\u0015!\u001d\u0002Ex#<\u001e?Ċz ^_T+\"y\u0014\u0011{b!]5\u0006/\nbzɥdW\u0019\u0006B/\u0010.A<\u0006AS\u0013k!\u0017&\"\u000e,\u00136\u001f@VÈX)fpm?\u0001\u00033F\u000eNT4IL\u0086߭ 6Aܲ?tG~ĭFgl\u0012)\u0014{\u0017zgt]-\f\u0018l=8±̑S`\u001a׳P%uL܍V>B)\u0001H)Vg\nbA2-T\u0012y\u001byb\b)[Jj^p@r/\u007fL͠=TJ\u0003\u0018\u0015[.\u001f_^z\t\u000f xG\u001e\n\u0005.=5vv_\u0001Ioo\u07fb\u0013OD%&\u00187H<y\"\u0002\u0004UMXԢ\r\u0003b&ÿz\u000e9D4\b.\u0013\u00143J-̔\u00125([܍\u0003\u0004/`_\u000bD*Gr'\u001c\u000f80\u001cۼ{\u001d-\u001d֙Q\u0002{-\u001a|\u00019\u001dHM\u001e9\u00100!э\u0018T\u000bHL\u0007\u0604m\u0001]SԂzL\u001fZP\nҵkYs*A\bv]̵\\6),i@6\u001bܚ\u0011\u001ccx<\u007fnpˀ\\FM&0 J\u0590E\u0003\u0010߄(l\u0018#z\u001aHbcb(16'8.I\u0015\u0018?7Qu\u001aؐs\u000e\u000e`pnxtʸfLAk~$\u0011\u000e>=ʺ\u0007cI\u001c\u0018[M\u001cc.<eK\u001c\u0002\"O\u001d'@βn\u001c1>\r\u0011aP1\u0010\nx3\u001aFBYK\u001bxק-2Z\u001543\u000b\u0019h\u001eğ\u0015%\u00143\u0004:.kM3߯_\u007f\u007fiN7+ϠUFjϽCY9nԗ=*\u000fv\u001e\u0017\u0014)\u001c\u001dMz\u0019DE\fx\tR#\u05c8\u0003\u007feg!\u0016q47=ޮv.83~cES߿Јb6mЗ\b\u001e2\u001c\u07bemg\n\b/`S$Ц^ˋ_\b\u001c+/[^ֻ@\u001fnDu%~]\u0558SΠ.E0}\f\u0003'̢\u0004Nliv\u0019[re6rk[-1,qQ\u0019O\f.\u0010:\u0007.\u0001\"4\u0018\u0014\u000fηG+\u000e0B\\\u0014D\u000bs9\u001d7 @_K\u0004w'ޟvw`X\u0004;1g([+6g\u0005\u0017\u007f\u0015.#q\u001a-_̚\r\u00144K+\u0011;ZG\n(<((e\u0014O\f)a\r\u0004., Ւ2D\u0018[Y\u0006\u0006>n\u007fl\u000e]>] G4̶y\u0007k6 >TQ\u0013\u0011jt-i7\\\u0019$\u001dM8ZpJ-\u0007ٱhč\u0002y\u000fTh#nF\u000f7^SC?s\u00154\u0016\u0019\u000b9\\Y\u0013t.,ܞfޒjzhE\u0018t\u0003U:\u0011\u0016K5\u0006\u001cJ\u0014>Rw ١#Ν8D:,h/2\u0002\\\u001fZqE\u001adbrv\u0010ˆ\u001dˌ4\u0003/\u0013F\f\u0003&\u007fU\u001f\u0016!p_5\u007f$ͦ#0v+v\u000f\bQ!aOq\u0007/H\u001a\\|֘;'cg(@S\n\u000e]3\\%!\u0001\u000b#,SwH\u0081`ʚC\u0006\u001e&\u001a\u000b\r\u007fAUx\t\u000e\u001cb\u0017+d9ܷ6ƇFfg,\u001c]spwl\u007fH+abbp\u0012߷\u0006hY\t\u0013\f1\u0014#\u001d0jZ-\"EzS_U%_C]\b߁k׃4P\u000e|\u0004\r@\u0014\u0011\u0015\u0001ߜjNG\u0016\u0017Wmq3H\u0001:\\\u00030SܡKϜP\u0011Z\u0016\u0019\u058b?,Ǥ\u001a'\u007fW\u05cbG\u000ecFnmDW|<˿5$\u0003аQKn2\fҥ\u001cmާ}D\u000bdȧ\u0012W\u0017@\u00193Q\u0013ݲgԞi+;-LǓRA\u0004Lka\u05fc\u000e`\u0017`gj\u0011jО\rͰ.Y8\u000e\u0011٠fB@\te\u0007؇M]a31J\u001a\u0011WCnGٶR̷\\\u0007uJ?҄\u001c\u0002ɔ_\n\u0003n֕V?P\u0017:LOԡ6Hdbd˱,m-ck+Ջ\u0012k\u0007a-X<eބX>\u001a\u001dŌ\nƎ#Ry\"uȪ7|&cn\u001c˳>eُZٮ.ԙ\u0003"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E%\u000b\u0014\u0005Wz\u0019F\u00044\u000b", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E%\u000b\u0014l", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u0004\u001b\u001eFT\u00189L", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E+|$\u0017P~rFsz", "/bc6i,", "", "\nh]6g\u0005", "uY\u0018#", "9dh", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3F,{.a\u0019", "5dc\u0018X@", "u(;8b;EW\"Hxh9\u0007\u0019>i\t(\n\n^!$Q\u007f\u001d@\u007f%\u0013c\u0007/7\u0001%l3COA", "-rc.g,", "\u001aj^A_0Gfbz\nh4\u0001\u00070uI\u0004\u000bJ\t\u001b\u00154o\u000f\u0012", "", "-oP?X5M6\u0015\bye,", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u0004\u001b\u001eFR\nEu,5/", "D`[BX", ">`a2a;!O\"}\u0002^", "5dc\u001dT9>\\(avg+\u0004\tmk\n7\u0003D\n*\u0011Ey\u001bF\u000749b}.1k ;M", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJt\u001aKv\r\u001fr.4`}u", "Adc\u001dT9>\\(avg+\u0004\tmk\n7\u0003D\n*\u0011Ey\u001bF\u000749b}.1k ;M", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n^\u001a\u001bNnp8\u007f$<YSc(", ">`a2a;", "5dc\u001dT9>\\(", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJ{!DE", "7mXAC(KS\"\u000e_h)", "", "AsPAX", "5dc g(MSW\u0005\u0005m3\u0001\u0012B_}2\tJ\u0011&\u001bPo\u001c6t/BY", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", ":n^=B5,b\u0015\u000ez", "", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "7r00g0OS", "u(I", "7r2<`7ES(~y", "7r2.a*>Z ~y", "4h]._0SSy\u0003\u0004b:\u007f\r8gm7wO\u0001", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E%\u000b\u0014\u0005Wz\u0019F\u00044s:\u0002);{\u00192VE\u0011", ">q^=b:>R\t\nyZ;|", "5dc\u0013\\5:Z\u0006\t\u0005m\nx\u0019=e", "", "3wR2c;B]\"\r", "", "/cS h7I`\u0019\r\t^+\\\u001c-e\u000b7\u007fJ\n%", "@n^A6(Na\u0019", "Bqh\u0013\\5:Z\u001d\u0014zL0\u0005\u00146em7wO\u0001", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E$\n\u0015!Oz\u0015<\u0006%\u000b", "CoS.g,", "1n\\=_,MS\u0007\u000evm,]\r8a\u0007,\u0011<\u0010\u001b!P", "<nc6Y@\u001cO\"|ze3\u0001\u00121", ":hbA", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E)\u000b\u0016\u0017.s\u001cKL", "1`d@X", "1`]0X3)O&~\u0004m", "<nc6Y@\u001c]!\n\u0002^;\u0001\u00138", "<nc6Y@!O\"}\u0002^9\u000b", ">qT1\\*:b\u0019", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E%\u000b\u0014\u007fQn\u000e\u0012", "AsP?g", "AsP?g\u0010Gb\u0019\f\u0004Z3", "", "=mBAT9M", "5dc\u0010T5<S \u0006vm0\u0007\u0012\u000fx}(\u0007O\u0005! ", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e| \u0015Gv\u00158\u0006)?b]35m!=QMDA", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJt\u0013Pm\u000eC}!D]\b)\u0017\u0001\u0014.XR?u=s", "u(;7T=:\u001d)\u000e~euz\u00138c\u00105\t@\n&`%k\u0017:v,<U\r$AvuAKCFz8(\u001e>", "Bn2.a*>Z z\nb6\u0006hBc\u007f3\u000bD\u000b ", ";db@T.>", "", "uKY.i(\bZ\u0015\b|(\u001b\u007f\u00169w{%\u0003@V}\u001cC\u0001\n\u0006}!>[G\u000eFz\u001a7O\u0019~R9\u001a&d+I\u0016g3\u0018t1PJ^9iR{L]oV\u0017L+\u0014\fUP(xM\u00172\u0006,T\u0011?r\na", "1n\\=_,MW#\bXZ<\u000b\t", "5dc\u0010b4IZ\u0019\u000e~h5Z\u0005?s\u007f", "u(;7T=:\u001d z\u0004`uk\f<o\u0012$xG\u0001l", "1n\\=_,MW#\bXZ<\u000b\t\u0012a\t'\u0003@\u007f", "5dc\u0010b4IZ\u0019\u000e~h5Z\u0005?s\u007f\u000bwI\u007f\u001e\u0017F", "7me<^,(\\v\t\u0003i3|\u00183o\t", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001f\u0005%\"Q}\n9}%\u0018U\u0007\u001f>mk", "6`]1_,K", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b\u001f\"No\u001d@\u0001.\u0018U\u0007\u001f>m#\u0004", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%Sc\u001es =TGD~}\u001c\u001fukI\u0016g5N\u0005p&P\\7f`n:\u001b\u0012=\nW*\u0014\u0005/", "=m2.a*>Z \u0003\u0004`", "7me<^,\"[!~yb(\f\t6y", "uYI\u0019^6MZ\u001d\bDc=\u0005R0u\t&\u000bD\u000b %\u0011P\u001eEt49c\u0007k\r1|4WRBo=1^fkF\u0011s;R\u007f'U\u0016-0j]|K\u0010\u000fa\u000e1'\u0016\u0004`Ay", "7me<^,(\\v\t\u0003i3|\u00183o\t\f\u0005O\u0001$ Cv", "<nS2", "7me<^,(\\v\t\u0003i3|\u00183o\t\f\u0005O\u0001$ CvLB\u00014<]\u000731k ;WSJo=\u001e#b_C\u0014c", "Bqh\u001dh;']\u0018~^g;\u0007o3s\u000f", "Bqh\u000eW+", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", ">q^:b;>3!\n\nr\u001b\u0007q9d\u007f\u000f\u007fN\u0010", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E \t\"&[E", ">q^:b;>A\u001d\b|e,k\u0013\u0018o~(bD\u000f&", "8nX;", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "8nX;<5MS&\bve", "8nX;F<L^\u0019\by", "=m9<\\5", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006d%<Y{/\u0015t\u0012>[C\u0006A", "5dc\u001ca\u0011HW\"=vg5\u0007\u0018+t\u00042\u0005N", "u(E", "5dc\u001ca\u0011HW\"", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJ%\u0017No\fK\u0005n#Y\u0005 5|s5ISIk~s", "@dV6f;>`\u0007~\u0002^*\fi9ri1`J\u0005 ", "Ad[2V;", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006d%<Y{/\u001bv$=IL9k\n", "7f]<e,=>\u0015\fvf", "@d\\<i,']\u0018~", "@d\\<i,']\u0018~9d6\f\u00103n\u0013\"yJ\u000e!'Vs\u0017<\u0005\u001f3c\u000b ", "=m2.a*>Zv\t\u0003i3|\u0018/", "5dc\u001ca\n:\\\u0017~\u0002<6\u0005\u00146e\u000f(:F\u000b&\u001eKx!6t/Bc\u000e/;v\u0016<GAEx4", "1`]0X3", "uKY.i(\bc(\u0003\u0002(*\u0007\u0012-u\r5{I\u0010`tCx\f<},1h\u0002*@M),MNJo>'j,R", "1`]0X3EO(\u0003\u0005g\f\u0010\u0007/p\u000f,\u0006Ih\u0017%Uk\u0010<", "1`]0X3\"\\(~\bg(\u0004", ">`a2a;\u001cO\"|ze3|\b", ">`a2a;#]\u0016", "1gX9W\n:\\\u0017~\u0002e,{", "1`]0X3\u001c]&\t\u000bm0\u0006\t", "1`]0X3\"[$\u0006", "1`]0X3\"[$\u00069d6\f\u00103n\u0013\"yJ\u000e!'Vs\u0017<\u0005\u001f3c\u000b ", "1`]0X3&O\u001f~Xh4\b\u0010/t\u00041}", "2dU.h3M1\u0015\bx^3\u0004\u0005>i\n1[S~\u0017\"Vs\u0018E", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E%\u000b\u0014tCx\f<},1h\u0002*@M),MNJo>'j", "2dU.h3M1\u0015\bx^3\u0004\u0005>i\n1[S~\u0017\"Vs\u0018E5+?h\u0005$@\u0001\u0010,WPE{C\"\u001eho3\u0005m9N", "5dc\u0010[0ER}\tw<(\u0006\u0007/l\u0007$\u000bD\u000b tC\u007f\u001c<", "1qT.g,\u001cO)\rz>?z\t:t\u00042\u0005", ";`Z26(GQ\u0019\u0006\u0002b5~", "5dc\u001ce\u0017K]!\t\n^\nx\u0012-e\u0007/\u007fI\u0003}\u001bU~", "Bqh\u001aT2>1\u0015\bx^3\u0004\r8g", ";`Z266F^ ~\nb5~", ";`Z266F^ ~\nb5~G5o\u000f/\u007fI\u0014\u0011\u0015Q|\u0018L\u0006)>Y\f\u001a5w#.", ";`Z266F^ ~\nb5~r8c\u007f", ";`Z266F^ ~\nb5~r8c\u007ff\u0002J\u0010\u001e\u001bP\u0003\b:\u00012?i\r$@m$(KMHk", "Bqh\u001aT2>1#\u0007\u0006e,\f\r8g", "Bqh\u001aT2>1#\u0007\u0006e,\f\r8gm/\u0006Rk\u0013&J", "3wR2c;B]\"h\bG<\u0004\u0010", "5dc\u0012k*>^(\u0003\u0005g\u0016\nq?l\u0007", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~H\u0001-A\u007f\u0012+TC\u0011", "Bqh$T0M4#\fXa0\u0004\b", "1gX9W", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u0004\u001b\u001eFR\nEu,5B\b\u001f7C", "1n]A\\5NSv\t\u0003i3|\u00183n\u0002", ":`bA6/BZ\u0018", "<dgA6/BZ\u0018", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\f?W\u0004\u0001Dm\u0016\u0015QLAk3\u0005\u0019vp\"\u0011b,$", "1gX9W9>\\", "\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0016{L\u0011\u0017 Eoc", "5dc\u0010[0ER&~\u0004", "u(;8b;EW\"H\t^8\r\t8c\u007f6E.\u0001#'Gx\f<L", "/sc.V/\u001cV\u001d\u0006y", "6`]1_,(\\v\t\u0003i3|\u00183o\t\b\u000f>\u0001\"&Ky\u0017", "3wR2c;B]\"", "6`]1_,(\\v\t\u0003i3|\u00183o\t\b\u000f>\u0001\"&Ky\u0017z|/D`\u0002)Jg\u00148ZMKz8'\u0015v[7\u0011p,", "7rB0b7>Rv\t\bh<\f\r8e", "6`]1_,L3,|zi;\u0001\u00138", "5dc\u0015T5=Z\u0019\rZq*|\u0014>i\n1:F\u000b&\u001eKx!6t/Bc\u000e/;v\u0016<GAEx4", "6`]1_,#]\u0016^\u000e\\,\b\u00183o\t", "=m2<`7ES(\u0003\u0005g\u0010\u0006\u0018/r\t$\u0003", "/ec2e\nH[$\u0006zm0\u0007\u0012", "BnBAe0GU", "Bn32U<@A(\f~g.", "<`\\2F;KW\"\u0001", "<`\\2F;KW\"\u00019d6\f\u00103n\u0013\"yJ\u000e!'Vs\u0017<\u0005\u001f3c\u000b ", "AsPAX\u001aM`\u001d\b|", "7r2.a*>Z \u0003\u0004`", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\nd \u0015Qw\u0019Cv45/A\u0015", "7r2<`7ES(~y>?z\t:t\u00042\u0005<\b\u001e+", "5dc\u0010b4IZ\u0019\u000e~h5\\\u001c-e\u000b7\u007fJ\n\u0001$0\u007f\u0015C", "5dc\u0010b4IZ\u0019\u000ez]\u0010\u0006\u0018/r\t$\u0003", "5dc\u0010b4IZ\u0019\u000ez]\u0010\u0006\u0018/r\t$\u0003~\u0007!&Ns\u0017Op#?f\b0Fq\u001f.[=9uA\u001e", "/vP6g\u0010Gb\u0019\f\u0004Z3", "/vP6g\u001aNa$~\u0004]", "=m0DT0M7\"\u000ezk5x\u0010", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006d%<Y{/\u0015t\u0012>[C\u0007A", "5dc\u001ca\bPO\u001d\u000e^g;|\u00168a\u0007fwI\n!&C~\u0012F\u007f3", "5dc\u001ca\bPO\u001d\u000e^g;|\u00168a\u0007", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJ%\u0017No\fK\u0005n#Y\u0005 5|s5ISIk\u007fs", "=m0DT0M7\"\u000ezk5x\u0010\u001ce\u0002\t\fI~", "=m0DT0M7\"\u000ezk5x\u0010\u001ar\n&{N\u000f\u0004\u0017UP\u001eEt", "@dbB_;", "!d[2V;(\\}\t~g\n\u0007\u0011:l\u007f7\u007fJ\ny\u0013Pn\u0015<\u0004", "\u0014h]6f/B\\\u001b", "\u0011gX9W\nH[$\u0006zm0\u0007\u0012", "\u000fvP6g\nH\\(\u0003\u0004n(\f\r9n", "!d[2V;(\\t\u0011vb;Z\u00137p\u0007(\u000bD\u000b yCx\rCv2", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public class JobSupport implements Job, ChildJob, ParentJob {
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    private static final /* synthetic */ AtomicReferenceFieldUpdater _state$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(JobSupport.class, Object.class, "_state$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater _parentHandle$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(JobSupport.class, Object.class, "_parentHandle$volatile");

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&˛\bDZc|İI\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007lkA0RfP\u008cZS@\u000fsڔ<$i0yّAU0ԂJ\u000bUȞuf\u001fPj\rS\u000fL\u0015'jlde\u0003k\u0013'8RqO3\u0004ڎk;pxD\b82P<ѩ\t\u0003 /V\u0016?\tQR$\u0012^H!>`\u0016e\u0005H\u001cLRh\u0007,g\u007fNdT3o\u000b;1\u0006\u0002B|+6ܡ~֔\u0011F\\܋̂zn"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E%\u000b\u0014\u0005Wz\u0019F\u00044s5\u0010\u001c;|s8VR?tD\u001a$lkB\\", "\"", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e| \u0015Gv\u00158s,57\b)Fq\u001f>IR?u=\u0002\u001dsh\u000f", "2d[2Z(MS", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "8nQ", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E%\u000b\u0014\u0005Wz\u0019F\u00044\u000b", "\nh]6g\u0005", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bS\u0007=w%5QLN52(\"rqH\u000bl,\\@\fQI<<g]|J#g\u001e~", "5dc\u0010b5MW\"\u000fvm0\u0007\u0012\ra\t&{G\b\u0013&Ky\u0017\u001ar5CY", "", ">`a2a;", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E%\u000b\u0014l", "<`\\2F;KW\"\u0001", "", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    private static final class AwaitContinuation<T> extends CancellableContinuationImpl<T> {
        private final JobSupport job;

        public AwaitContinuation(Continuation<? super T> continuation, JobSupport jobSupport) {
            super(continuation, 1);
            this.job = jobSupport;
        }

        @Override // kotlinx.coroutines.CancellableContinuationImpl
        public Throwable getContinuationCancellationCause(Job job) {
            Throwable rootCause;
            Object state$kotlinx_coroutines_core = this.job.getState$kotlinx_coroutines_core();
            return (!(state$kotlinx_coroutines_core instanceof Finishing) || (rootCause = ((Finishing) state$kotlinx_coroutines_core).getRootCause()) == null) ? state$kotlinx_coroutines_core instanceof CompletedExceptionally ? ((CompletedExceptionally) state$kotlinx_coroutines_core).cause : job.getCancellationException() : rootCause;
        }

        @Override // kotlinx.coroutines.CancellableContinuationImpl
        protected String nameString() {
            return "AwaitContinuation";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLeV\u008cZS0\u0010s{B-c$wDCU(}*ޛWNuhvϺ`\u000bYƤ6\u0016'ilpe|k\u0012'2ppO7[qU9\u000fwF\t.6:8(\n\u0011 8N(x\u0011By\u0013ܘ4BvB`\u0016\u0016\u0015( \u001e>N\u0010Nbu^NJ\u0003\\h@i\u0017:N\\'w0+NcЂVܮ\u0011viӜ{LE7-%\u0002\u0006]ѻ]ύ\u0007?yܵUt5+CI\"\\\rݜ\u0002Џ\u0019+WՕ.\u00014b\u001dSv\u000bU2&ҭMח\u0012(\u007f\u07beL\u001fJ\u000e&\u0006USd\u0002pǨ\nԧ7x\u000bUF\\\u0010k۶\u0004\r"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E%\u000b\u0014\u0005Wz\u0019F\u00044s7\u0001$>ls8UNBkC\"\u001fq7", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E%\u000b\u0014\u007fQn\u000e\u0012", ">`a2a;", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E%\u000b\u0014\u0005Wz\u0019F\u00044\u000b", "AsPAX", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E%\u000b\u0014\u0005Wz\u0019F\u00044s:\u0002);{\u00192VE\u0011", "1gX9W", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u0004\u001b\u001eFR\nEu,5B\b\u001f7C", ">q^=b:>R\t\nyZ;|", "", "\nh]6g\u0005", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\ne!\u00145\u007f\u0019G\u00012D/d&A|\u001d2VV\u0005i>+\u001fxp=\u0010c:\u0018[1D:^7g\\\u007fLRr^\u0017R9\u0010\tbCyUJA.\u000f0R\u0015\u0005f\u000b\u0019 \u001eDnyBdY%|\u0019|@\fdOXfy0KDb\u007fK\u0011[.X\u0004A \u001dsb\u0005eU.\b\u000b)Tc", "=m2.a*>Z \u0003\u0004`", "", "5dc\u001ca\n:\\\u0017~\u0002e0\u0006\u000b", "u(I", "7me<^,", "", "1`d@X", "", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    private static final class ChildCompletion extends JobNode {
        private final ChildHandleNode child;
        private final JobSupport parent;
        private final Object proposedUpdate;
        private final Finishing state;

        public ChildCompletion(JobSupport jobSupport, Finishing finishing, ChildHandleNode childHandleNode, Object obj) {
            this.parent = jobSupport;
            this.state = finishing;
            this.child = childHandleNode;
            this.proposedUpdate = obj;
        }

        @Override // kotlinx.coroutines.JobNode
        public boolean getOnCancelling() {
            return false;
        }

        @Override // kotlinx.coroutines.JobNode
        public void invoke(Throwable th) {
            this.parent.continueCompleting(this.state, this.child, this.proposedUpdate);
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯT\u001d<K!&i\u0016DLc\u0003İI\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjG9L͜P.`T2\u000fq~<$q$yCAX\"}8\tWNmsvJh)K\u000f\f\u0016\u0001j:I]xc\u0012\u00172XoG\u074cUoKEhҚ<\u00056݅R<(\u0005i\u001a\tG@v)D\f+\"4NrRR;P\u0015\u001e \nV /#lm\\<`ns9]*ɨmDT/m9Ea\u001bgl-\u001dxq\u001eYGeWE+a&\u001fTq>1F:I\u0013\r?'Yn$[D~\u0018\u0014C2\u0018\u0019k\u001a>b\u0015Sp\fU2}\f\u0012PV.\u0006$\u0014\rj.T\u001awZ</2f6\u0011\nϖtՂDV\nމZ\u0002\u0001kD\"u\u0007A7Q\u001b\u0015^8ݥ\u001b\u001fY\n\t%\u001eQ\u0006\u001f%ib&`C \u000b<\u0010u(̼I˓R\u0014q?s\b~q\",\n@U\u0011\u007f\u000b\u001f@/-G_I%7j0OrzMݖb9ywX`B8mD>Z\u000f\u001ah\\f\u001bj~[\u000fpO\u0012rΈ\u0013ą\f\u001d8^}P/:0PU~w\u0002\u001el\u0018=GnG]~m$Vg^aH(Ҳ\u00122x\u0005-W>x\u0004\u0007frY\u001aht*81vjF8:\u0005%ۿ\u001f\u0558C{462K'w5J\t:P^M\u0018mx\u0001\u0010-Yihғm(\r\u000b\u0007nj\u007f@v\u0007hD|\u000f'c\u0006پ9\u001d>W(\bB\fs\u0019\r\u0014\u0018G\u0016Q}!C\u05ccwʀ\u007f$.\u001c?q=Lш\u0013*"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E%\u000b\u0014\u0005Wz\u0019F\u00044s:\u0002);{\u00192VE\u0011", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\u0013Ib{#Dw\u001f2bC:U1#\u0015fp\u000f", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E$\n\u0015!Oz\u0015<\u0006%\u000b", ":hbA", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E)\u000b\u0016\u0017.s\u001cKL", "7r2<`7ES(\u0003\u0004`", "", "@n^A6(Na\u0019", "", "\nh]6g\u0005", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\ni!\u0016GV\u0012J\u0006z*@\u0003\u001cHi_5IL=5#!\"rs5\u0004j,$:\u0018", "5dc\u0019\\:M", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJ\u007f!Fot@\u00054\u000b", "-hb\u0010b4IZ\u0019\u000e~g.", "\u001aj^A_0Gfbz\nh4\u0001\u00070uI\u0004\u000bJ\t\u001b\u0015$y\u0018Cv!>/", "D`[BX", "u(I", "Adc\u0010b4IZ\u0019\u000e~g.", "uY\u0018#", "-q^<g\n:c'~", "\u001aj^A_0Gfbz\nh4\u0001\u00070uI\u0004\u000bJ\t\u001b\u00154o\u000f\u0012", "5dc\u001fb6M1\u0015\u000f\t^", "u(;7T=:\u001d z\u0004`uk\f<o\u0012$xG\u0001l", "Adc\u001fb6M1\u0015\u000f\t^", "uKY.i(\bZ\u0015\b|(\u001b\u007f\u00169w{%\u0003@VZ\b", "-dg0X7MW#\b\tA6\u0004\b/r", "3wR2c;B]\"\r]h3{\t<", "5dc\u0012k*>^(\u0003\u0005g:_\u00136d\u007f5", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "Adc\u0012k*>^(\u0003\u0005g:_\u00136d\u007f5", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "7rB2T3>R", "7r2.a*>Z \u0003\u0004`", "7r00g0OS", "AdP9?6<Y\u0019}", "", ">q^=b:>Rx\u0012x^7\f\r9n", "/cS\u0012k*>^(\u0003\u0005g\u0013\u0007\u00075e~", "", "3wR2c;B]\"", "/k[<V(MS\u007f\u0003\tm", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "BnBAe0GU", "", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    private static final class Finishing implements Incomplete {
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile;
        private volatile /* synthetic */ Object _rootCause$volatile;
        private final NodeList list;
        private static final /* synthetic */ AtomicIntegerFieldUpdater _isCompleting$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(Finishing.class, "_isCompleting$volatile");
        private static final /* synthetic */ AtomicReferenceFieldUpdater _rootCause$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(Finishing.class, Object.class, "_rootCause$volatile");
        private static final /* synthetic */ AtomicReferenceFieldUpdater _exceptionsHolder$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(Finishing.class, Object.class, "_exceptionsHolder$volatile");

        public Finishing(NodeList nodeList, boolean z2, Throwable th) {
            this.list = nodeList;
            this._isCompleting$volatile = z2 ? 1 : 0;
            this._rootCause$volatile = th;
        }

        private final ArrayList<Throwable> allocateList() {
            return new ArrayList<>(4);
        }

        private final Object getExceptionsHolder() {
            return _exceptionsHolder$volatile$FU.get(this);
        }

        private final /* synthetic */ Object get_exceptionsHolder$volatile() {
            return this._exceptionsHolder$volatile;
        }

        private final /* synthetic */ int get_isCompleting$volatile() {
            return this._isCompleting$volatile;
        }

        private final /* synthetic */ Object get_rootCause$volatile() {
            return this._rootCause$volatile;
        }

        private final void setExceptionsHolder(Object obj) {
            _exceptionsHolder$volatile$FU.set(this, obj);
        }

        private final /* synthetic */ void set_exceptionsHolder$volatile(Object obj) {
            this._exceptionsHolder$volatile = obj;
        }

        private final /* synthetic */ void set_isCompleting$volatile(int i2) {
            this._isCompleting$volatile = i2;
        }

        private final /* synthetic */ void set_rootCause$volatile(Object obj) {
            this._rootCause$volatile = obj;
        }

        public final void addExceptionLocked(Throwable th) {
            Throwable rootCause = getRootCause();
            if (rootCause == null) {
                setRootCause(th);
                return;
            }
            if (th == rootCause) {
                return;
            }
            Object exceptionsHolder = getExceptionsHolder();
            if (exceptionsHolder == null) {
                setExceptionsHolder(th);
                return;
            }
            if (!(exceptionsHolder instanceof Throwable)) {
                if (!(exceptionsHolder instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + exceptionsHolder).toString());
                }
                ((ArrayList) exceptionsHolder).add(th);
            } else {
                if (th == exceptionsHolder) {
                    return;
                }
                ArrayList<Throwable> arrayListAllocateList = allocateList();
                arrayListAllocateList.add(exceptionsHolder);
                arrayListAllocateList.add(th);
                setExceptionsHolder(arrayListAllocateList);
            }
        }

        @Override // kotlinx.coroutines.Incomplete
        public NodeList getList() {
            return this.list;
        }

        public final Throwable getRootCause() {
            return (Throwable) _rootCause$volatile$FU.get(this);
        }

        @Override // kotlinx.coroutines.Incomplete
        public boolean isActive() {
            return getRootCause() == null;
        }

        public final boolean isCancelling() {
            return getRootCause() != null;
        }

        public final boolean isCompleting() {
            return _isCompleting$volatile$FU.get(this) != 0;
        }

        public final boolean isSealed() {
            return getExceptionsHolder() == JobSupportKt.SEALED;
        }

        public final List<Throwable> sealLocked(Throwable th) {
            ArrayList<Throwable> arrayListAllocateList;
            Object exceptionsHolder = getExceptionsHolder();
            if (exceptionsHolder == null) {
                arrayListAllocateList = allocateList();
            } else if (exceptionsHolder instanceof Throwable) {
                arrayListAllocateList = allocateList();
                arrayListAllocateList.add(exceptionsHolder);
            } else {
                if (!(exceptionsHolder instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + exceptionsHolder).toString());
                }
                arrayListAllocateList = (ArrayList) exceptionsHolder;
            }
            Throwable rootCause = getRootCause();
            if (rootCause != null) {
                arrayListAllocateList.add(0, rootCause);
            }
            if (th != null && !Intrinsics.areEqual(th, rootCause)) {
                arrayListAllocateList.add(th);
            }
            setExceptionsHolder(JobSupportKt.SEALED);
            return arrayListAllocateList;
        }

        public final void setCompleting(boolean z2) {
            _isCompleting$volatile$FU.set(this, z2 ? 1 : 0);
        }

        public final void setRootCause(Throwable th) {
            _rootCause$volatile$FU.set(this, th);
        }

        public String toString() {
            return "Finishing[cancelling=" + isCancelling() + ", completing=" + isCompleting() + ", rootCause=" + getRootCause() + ", exceptions=" + getExceptionsHolder() + ", list=" + getList() + AbstractJsonLexerKt.END_LIST;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4C\u0007\":\u001b\u007f\u0007lkA0ReP\u008cZS8\u0010sڔ:Ŝ]:ڎs;\u0004\u0019>3\u0019W\\g\u007frZZ\u0011D=\u0007Ȁ|l2Kc{&\"\u001d:Zom<}uKCxvL\u0004N=hLJ\u0015\u000f\u001aBL v\u0001Dy\rhؖB¤>R\u0015˟U, \nV /#\u0013<%ȻJǰa>G%\toPUϴc<"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E%\u000b\u0014\u0005Wz\u0019F\u00044sG}'7k%\u0018V\u001fMg8-rriD\u000ec;R\u00010*HW+cR\u007f\u0013", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E%\u000b\u0014\u007fQn\u000e\u0012", "Ad[2V;", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006d%<Y{/\u001bv$=IL9k\n", "\nh]6g\u0005", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\ne!\u00145\u007f\u0019G\u00012D/d&A|\u001d2VV\u0005i>+\u001fxp=\u0010c:\u0018\u0005'NLL;j\u001c`=\u001b\u0012X\u001d24\u001b\u0014UJ\"n\u001az\u0010", "=m2.a*>Z \u0003\u0004`", "", "5dc\u001ca\n:\\\u0017~\u0002e0\u0006\u000b", "u(I", "7me<^,", "", "1`d@X", "", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    private final class SelectOnAwaitCompletionHandler extends JobNode {
        private final SelectInstance<?> select;

        public SelectOnAwaitCompletionHandler(SelectInstance<?> selectInstance) {
            this.select = selectInstance;
        }

        @Override // kotlinx.coroutines.JobNode
        public boolean getOnCancelling() {
            return false;
        }

        @Override // kotlinx.coroutines.JobNode
        public void invoke(Throwable th) {
            Object state$kotlinx_coroutines_core = JobSupport.this.getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof CompletedExceptionally)) {
                state$kotlinx_coroutines_core = JobSupportKt.unboxState(state$kotlinx_coroutines_core);
            }
            this.select.trySelect(JobSupport.this, state$kotlinx_coroutines_core);
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4C\u0007\":\u001b\u007f\u0007lkA0ReP\u008cZS8\u0010sڔ:Ŝ]:ڎs;\u0004\u0019>3\u0019W\\g\u007frZZ\u0011D=\u0007Ȁ|l2Kc{&\"\u001d:Zom<}uKCxvL\u0004N=hLJ\u0015\u000f\u001aBL v\u0001Dy\rhؖB¤>R\u0015˟U, \nV /#\u0013<%ȻJǰa>G%\toPUϴc<"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E%\u000b\u0014\u0005Wz\u0019F\u00044sG}'7k%\u0018V(Eo={\u001fpl@\u0007r0X\u007f\nCUM3\\_H", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E%\u000b\u0014\u007fQn\u000e\u0012", "Ad[2V;", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006d%<Y{/\u001bv$=IL9k\n", "\nh]6g\u0005", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\ne!\u00145\u007f\u0019G\u00012D/d&A|\u001d2VV\u0005i>+\u001fxp=\u0010c:\u0018\u0005'NLL;j\u001c`=\u001b\u0012X\u001d24\u001b\u0014UJ\"n\u001az\u0010", "=m2.a*>Z \u0003\u0004`", "", "5dc\u001ca\n:\\\u0017~\u0002e0\u0006\u000b", "u(I", "7me<^,", "", "1`d@X", "", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    private final class SelectOnJoinCompletionHandler extends JobNode {
        private final SelectInstance<?> select;

        public SelectOnJoinCompletionHandler(SelectInstance<?> selectInstance) {
            this.select = selectInstance;
        }

        @Override // kotlinx.coroutines.JobNode
        public boolean getOnCancelling() {
            return false;
        }

        @Override // kotlinx.coroutines.JobNode
        public void invoke(Throwable th) {
            this.select.trySelect(JobSupport.this, Unit.INSTANCE);
        }
    }

    public JobSupport(boolean z2) {
        this._state$volatile = z2 ? JobSupportKt.EMPTY_ACTIVE : JobSupportKt.EMPTY_NEW;
    }

    private final void addSuppressedExceptions(Throwable th, List<? extends Throwable> list) {
        if (list.size() <= 1) {
            return;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        Throwable thUnwrapImpl = !DebugKt.getRECOVER_STACK_TRACES() ? th : StackTraceRecoveryKt.unwrapImpl(th);
        for (Throwable thUnwrapImpl2 : list) {
            if (DebugKt.getRECOVER_STACK_TRACES()) {
                thUnwrapImpl2 = StackTraceRecoveryKt.unwrapImpl(thUnwrapImpl2);
            }
            if (thUnwrapImpl2 != th && thUnwrapImpl2 != thUnwrapImpl && !(thUnwrapImpl2 instanceof CancellationException) && setNewSetFromMap.add(thUnwrapImpl2)) {
                kotlin.ExceptionsKt.addSuppressed(th, thUnwrapImpl2);
            }
        }
    }

    public final Object awaitSuspend(Continuation<Object> continuation) {
        AwaitContinuation awaitContinuation = new AwaitContinuation(IntrinsicsKt.intercepted(continuation), this);
        awaitContinuation.initCancellability();
        CancellableContinuationKt.disposeOnCancellation(awaitContinuation, JobKt__JobKt.invokeOnCompletion$default(this, false, new ResumeAwaitOnCompletion(awaitContinuation), 1, null));
        Object result = awaitContinuation.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    private final Object cancelMakeCompleting(Object obj) {
        Object objTryMakeCompleting;
        do {
            Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof Incomplete) || ((state$kotlinx_coroutines_core instanceof Finishing) && ((Finishing) state$kotlinx_coroutines_core).isCompleting())) {
                return JobSupportKt.COMPLETING_ALREADY;
            }
            objTryMakeCompleting = tryMakeCompleting(state$kotlinx_coroutines_core, new CompletedExceptionally(createCauseException(obj), false, 2, null));
        } while (objTryMakeCompleting == JobSupportKt.COMPLETING_RETRY);
        return objTryMakeCompleting;
    }

    private final boolean cancelParent(Throwable th) {
        if (isScopedCoroutine()) {
            return true;
        }
        boolean z2 = th instanceof CancellationException;
        ChildHandle parentHandle$kotlinx_coroutines_core = getParentHandle$kotlinx_coroutines_core();
        return (parentHandle$kotlinx_coroutines_core == null || parentHandle$kotlinx_coroutines_core == NonDisposableHandle.INSTANCE) ? z2 : parentHandle$kotlinx_coroutines_core.childCancelled(th) || z2;
    }

    private final void completeStateFinalization(Incomplete incomplete, Object obj) throws Throwable {
        ChildHandle parentHandle$kotlinx_coroutines_core = getParentHandle$kotlinx_coroutines_core();
        if (parentHandle$kotlinx_coroutines_core != null) {
            parentHandle$kotlinx_coroutines_core.dispose();
            setParentHandle$kotlinx_coroutines_core(NonDisposableHandle.INSTANCE);
        }
        CompletedExceptionally completedExceptionally = obj instanceof CompletedExceptionally ? (CompletedExceptionally) obj : null;
        Throwable th = completedExceptionally != null ? completedExceptionally.cause : null;
        if (incomplete instanceof JobNode) {
            try {
                ((JobNode) incomplete).invoke(th);
                return;
            } catch (Throwable th2) {
                handleOnCompletionException$kotlinx_coroutines_core(new CompletionHandlerException("Exception in completion handler " + incomplete + " for " + this, th2));
                return;
            }
        }
        NodeList list = incomplete.getList();
        if (list != null) {
            notifyCompletion(list, th);
        }
    }

    public final void continueCompleting(Finishing finishing, ChildHandleNode childHandleNode, Object obj) {
        if (DebugKt.getASSERTIONS_ENABLED() && getState$kotlinx_coroutines_core() != finishing) {
            throw new AssertionError();
        }
        ChildHandleNode childHandleNode2 = childHandleNode;
        ChildHandleNode childHandleNodeNextChild = nextChild(childHandleNode2);
        if (childHandleNodeNextChild == null || !tryWaitForChild(finishing, childHandleNodeNextChild, obj)) {
            finishing.getList().close(2);
            ChildHandleNode childHandleNodeNextChild2 = nextChild(childHandleNode2);
            if (childHandleNodeNextChild2 == null || !tryWaitForChild(finishing, childHandleNodeNextChild2, obj)) {
                afterCompletion(finalizeFinishingState(finishing, obj));
            }
        }
    }

    private final Throwable createCauseException(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new JobCancellationException(cancellationExceptionMessage(), null, this) : th;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((ParentJob) obj).getChildJobCancellationCause();
    }

    public static /* synthetic */ JobCancellationException defaultCancellationException$kotlinx_coroutines_core$default(JobSupport jobSupport, String str, Throwable th, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: defaultCancellationException");
        }
        if ((i2 + 1) - (1 | i2) != 0) {
            str = null;
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            th = null;
        }
        if (str == null) {
            str = jobSupport.cancellationExceptionMessage();
        }
        return new JobCancellationException(str, th, jobSupport);
    }

    private final Object finalizeFinishingState(Finishing finishing, Object obj) throws Throwable {
        boolean zIsCancelling;
        Throwable finalRootCause;
        if (DebugKt.getASSERTIONS_ENABLED() && getState$kotlinx_coroutines_core() != finishing) {
            throw new AssertionError();
        }
        if (DebugKt.getASSERTIONS_ENABLED() && finishing.isSealed()) {
            throw new AssertionError();
        }
        if (DebugKt.getASSERTIONS_ENABLED() && !finishing.isCompleting()) {
            throw new AssertionError();
        }
        CompletedExceptionally completedExceptionally = obj instanceof CompletedExceptionally ? (CompletedExceptionally) obj : null;
        Throwable th = completedExceptionally != null ? completedExceptionally.cause : null;
        synchronized (finishing) {
            zIsCancelling = finishing.isCancelling();
            List<Throwable> listSealLocked = finishing.sealLocked(th);
            finalRootCause = getFinalRootCause(finishing, listSealLocked);
            if (finalRootCause != null) {
                addSuppressedExceptions(finalRootCause, listSealLocked);
            }
        }
        if (finalRootCause != null && finalRootCause != th) {
            obj = new CompletedExceptionally(finalRootCause, false, 2, null);
        }
        if (finalRootCause != null && (cancelParent(finalRootCause) || handleJobException(finalRootCause))) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((CompletedExceptionally) obj).makeHandled();
        }
        if (!zIsCancelling) {
            onCancelling(finalRootCause);
        }
        onCompletionInternal(obj);
        boolean zM = AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$volatile$FU, this, finishing, JobSupportKt.boxIncomplete(obj));
        if (DebugKt.getASSERTIONS_ENABLED() && !zM) {
            throw new AssertionError();
        }
        completeStateFinalization(finishing, obj);
        return obj;
    }

    private final Throwable getExceptionOrNull(Object obj) {
        CompletedExceptionally completedExceptionally = obj instanceof CompletedExceptionally ? (CompletedExceptionally) obj : null;
        if (completedExceptionally != null) {
            return completedExceptionally.cause;
        }
        return null;
    }

    private final Throwable getFinalRootCause(Finishing finishing, List<? extends Throwable> list) {
        Object next;
        Object obj = null;
        if (list.isEmpty()) {
            if (finishing.isCancelling()) {
                return new JobCancellationException(cancellationExceptionMessage(), null, this);
            }
            return null;
        }
        List<? extends Throwable> list2 = list;
        Iterator<T> it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = list.get(0);
        if (th2 instanceof TimeoutCancellationException) {
            Iterator<T> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                Throwable th3 = (Throwable) next2;
                if (th3 != th2 && (th3 instanceof TimeoutCancellationException)) {
                    obj = next2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    protected static /* synthetic */ void getOnAwaitInternal$annotations() {
    }

    public static /* synthetic */ void getOnJoin$annotations() {
    }

    private final NodeList getOrPromoteCancellingList(Incomplete incomplete) {
        NodeList list = incomplete.getList();
        if (list != null) {
            return list;
        }
        if (incomplete instanceof Empty) {
            return new NodeList();
        }
        if (!(incomplete instanceof JobNode)) {
            throw new IllegalStateException(("State should have list: " + incomplete).toString());
        }
        promoteSingleToNodeList((JobNode) incomplete);
        return null;
    }

    private final /* synthetic */ Object get_parentHandle$volatile() {
        return this._parentHandle$volatile;
    }

    private final /* synthetic */ Object get_state$volatile() {
        return this._state$volatile;
    }

    private final boolean isCancelling(Incomplete incomplete) {
        return (incomplete instanceof Finishing) && ((Finishing) incomplete).isCancelling();
    }

    private final boolean joinInternal() {
        Object state$kotlinx_coroutines_core;
        do {
            state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof Incomplete)) {
                return false;
            }
        } while (startInternal(state$kotlinx_coroutines_core) < 0);
        return true;
    }

    public final Object joinSuspend(Continuation<? super Unit> continuation) throws Throwable {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        CancellableContinuationKt.disposeOnCancellation(cancellableContinuationImpl2, JobKt__JobKt.invokeOnCompletion$default(this, false, new ResumeOnCompletion(cancellableContinuationImpl2), 1, null));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    private final Void loopOnState(Function1<Object, Unit> function1) {
        while (true) {
            function1.invoke(getState$kotlinx_coroutines_core());
        }
    }

    private final Object makeCancelling(Object obj) throws Throwable {
        Throwable thCreateCauseException = null;
        while (true) {
            Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (state$kotlinx_coroutines_core instanceof Finishing) {
                synchronized (state$kotlinx_coroutines_core) {
                    if (((Finishing) state$kotlinx_coroutines_core).isSealed()) {
                        return JobSupportKt.TOO_LATE_TO_CANCEL;
                    }
                    boolean zIsCancelling = ((Finishing) state$kotlinx_coroutines_core).isCancelling();
                    if (obj != null || !zIsCancelling) {
                        if (thCreateCauseException == null) {
                            thCreateCauseException = createCauseException(obj);
                        }
                        ((Finishing) state$kotlinx_coroutines_core).addExceptionLocked(thCreateCauseException);
                    }
                    Throwable rootCause = zIsCancelling ? null : ((Finishing) state$kotlinx_coroutines_core).getRootCause();
                    if (rootCause != null) {
                        notifyCancelling(((Finishing) state$kotlinx_coroutines_core).getList(), rootCause);
                    }
                    return JobSupportKt.COMPLETING_ALREADY;
                }
            }
            if (!(state$kotlinx_coroutines_core instanceof Incomplete)) {
                return JobSupportKt.TOO_LATE_TO_CANCEL;
            }
            if (thCreateCauseException == null) {
                thCreateCauseException = createCauseException(obj);
            }
            Incomplete incomplete = (Incomplete) state$kotlinx_coroutines_core;
            if (!incomplete.isActive()) {
                Object objTryMakeCompleting = tryMakeCompleting(state$kotlinx_coroutines_core, new CompletedExceptionally(thCreateCauseException, false, 2, null));
                if (objTryMakeCompleting == JobSupportKt.COMPLETING_ALREADY) {
                    throw new IllegalStateException(("Cannot happen in " + state$kotlinx_coroutines_core).toString());
                }
                if (objTryMakeCompleting != JobSupportKt.COMPLETING_RETRY) {
                    return objTryMakeCompleting;
                }
            } else if (tryMakeCancelling(incomplete, thCreateCauseException)) {
                return JobSupportKt.COMPLETING_ALREADY;
            }
        }
    }

    private final ChildHandleNode nextChild(LockFreeLinkedListNode lockFreeLinkedListNode) {
        while (lockFreeLinkedListNode.isRemoved()) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.getPrevNode();
        }
        while (true) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.getNextNode();
            if (!lockFreeLinkedListNode.isRemoved()) {
                if (lockFreeLinkedListNode instanceof ChildHandleNode) {
                    return (ChildHandleNode) lockFreeLinkedListNode;
                }
                if (lockFreeLinkedListNode instanceof NodeList) {
                    return null;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void notifyCancelling(kotlinx.coroutines.NodeList r6, java.lang.Throwable r7) throws java.lang.Throwable {
        /*
            r5 = this;
            r5.onCancelling(r7)
            r0 = 4
            r6.close(r0)
            kotlinx.coroutines.internal.LockFreeLinkedListHead r6 = (kotlinx.coroutines.internal.LockFreeLinkedListHead) r6
            java.lang.Object r4 = r6.getNext()
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4, r0)
            kotlinx.coroutines.internal.LockFreeLinkedListNode r4 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r4
            r3 = 0
        L15:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r6)
            if (r0 != 0) goto L5f
            boolean r0 = r4 instanceof kotlinx.coroutines.JobNode
            if (r0 == 0) goto L5a
            r0 = r4
            kotlinx.coroutines.JobNode r0 = (kotlinx.coroutines.JobNode) r0
            boolean r0 = r0.getOnCancelling()
            if (r0 == 0) goto L5a
            r0 = r4
            kotlinx.coroutines.JobNode r0 = (kotlinx.coroutines.JobNode) r0     // Catch: java.lang.Throwable -> L2f
            r0.invoke(r7)     // Catch: java.lang.Throwable -> L2f
            goto L5a
        L2f:
            r2 = move-exception
            r0 = r3
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            if (r0 == 0) goto L3a
            kotlin.ExceptionsKt.addSuppressed(r0, r2)
            if (r0 != 0) goto L5a
        L3a:
            kotlinx.coroutines.CompletionHandlerException r3 = new kotlinx.coroutines.CompletionHandlerException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "Exception in completion handler "
            r1.<init>(r0)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r0 = " for "
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0, r2)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L5a:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r4 = r4.getNextNode()
            goto L15
        L5f:
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            if (r3 == 0) goto L66
            r5.handleOnCompletionException$kotlinx_coroutines_core(r3)
        L66:
            r5.cancelParent(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport.notifyCancelling(kotlinx.coroutines.NodeList, java.lang.Throwable):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void notifyCompletion(kotlinx.coroutines.NodeList r6, java.lang.Throwable r7) throws java.lang.Throwable {
        /*
            r5 = this;
            r0 = 1
            r6.close(r0)
            kotlinx.coroutines.internal.LockFreeLinkedListHead r6 = (kotlinx.coroutines.internal.LockFreeLinkedListHead) r6
            java.lang.Object r4 = r6.getNext()
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4, r0)
            kotlinx.coroutines.internal.LockFreeLinkedListNode r4 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r4
            r3 = 0
        L12:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r6)
            if (r0 != 0) goto L56
            boolean r0 = r4 instanceof kotlinx.coroutines.JobNode
            if (r0 == 0) goto L51
            r0 = r4
            kotlinx.coroutines.JobNode r0 = (kotlinx.coroutines.JobNode) r0
            r0 = r4
            kotlinx.coroutines.JobNode r0 = (kotlinx.coroutines.JobNode) r0     // Catch: java.lang.Throwable -> L26
            r0.invoke(r7)     // Catch: java.lang.Throwable -> L26
            goto L51
        L26:
            r2 = move-exception
            r0 = r3
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            if (r0 == 0) goto L31
            kotlin.ExceptionsKt.addSuppressed(r0, r2)
            if (r0 != 0) goto L51
        L31:
            kotlinx.coroutines.CompletionHandlerException r3 = new kotlinx.coroutines.CompletionHandlerException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "Exception in completion handler "
            r1.<init>(r0)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r0 = " for "
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0, r2)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L51:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r4 = r4.getNextNode()
            goto L12
        L56:
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            if (r3 == 0) goto L5d
            r5.handleOnCompletionException$kotlinx_coroutines_core(r3)
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport.notifyCompletion(kotlinx.coroutines.NodeList, java.lang.Throwable):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void notifyHandlers(kotlinx.coroutines.NodeList r6, java.lang.Throwable r7, kotlin.jvm.functions.Function1<? super kotlinx.coroutines.JobNode, java.lang.Boolean> r8) throws java.lang.Throwable {
        /*
            r5 = this;
            kotlinx.coroutines.internal.LockFreeLinkedListHead r6 = (kotlinx.coroutines.internal.LockFreeLinkedListHead) r6
            java.lang.Object r4 = r6.getNext()
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4, r0)
            kotlinx.coroutines.internal.LockFreeLinkedListNode r4 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r4
            r3 = 0
        Le:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r6)
            if (r0 != 0) goto L5b
            boolean r0 = r4 instanceof kotlinx.coroutines.JobNode
            if (r0 == 0) goto L56
            java.lang.Object r0 = r8.invoke(r4)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L56
            r0 = r4
            kotlinx.coroutines.JobNode r0 = (kotlinx.coroutines.JobNode) r0     // Catch: java.lang.Throwable -> L2b
            r0.invoke(r7)     // Catch: java.lang.Throwable -> L2b
            goto L56
        L2b:
            r2 = move-exception
            r0 = r3
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            if (r0 == 0) goto L36
            kotlin.ExceptionsKt.addSuppressed(r0, r2)
            if (r0 != 0) goto L56
        L36:
            kotlinx.coroutines.CompletionHandlerException r3 = new kotlinx.coroutines.CompletionHandlerException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "Exception in completion handler "
            r1.<init>(r0)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r0 = " for "
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0, r2)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L56:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r4 = r4.getNextNode()
            goto Le
        L5b:
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            if (r3 == 0) goto L62
            r5.handleOnCompletionException$kotlinx_coroutines_core(r3)
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport.notifyHandlers(kotlinx.coroutines.NodeList, java.lang.Throwable, kotlin.jvm.functions.Function1):void");
    }

    public final Object onAwaitInternalProcessResFunc(Object obj, Object obj2) throws Throwable {
        if (obj2 instanceof CompletedExceptionally) {
            throw ((CompletedExceptionally) obj2).cause;
        }
        return obj2;
    }

    public final void onAwaitInternalRegFunc(SelectInstance<?> selectInstance, Object obj) {
        Object state$kotlinx_coroutines_core;
        do {
            state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof Incomplete)) {
                if (!(state$kotlinx_coroutines_core instanceof CompletedExceptionally)) {
                    state$kotlinx_coroutines_core = JobSupportKt.unboxState(state$kotlinx_coroutines_core);
                }
                selectInstance.selectInRegistrationPhase(state$kotlinx_coroutines_core);
                return;
            }
        } while (startInternal(state$kotlinx_coroutines_core) < 0);
        selectInstance.disposeOnCompletion(JobKt__JobKt.invokeOnCompletion$default(this, false, new SelectOnAwaitCompletionHandler(selectInstance), 1, null));
    }

    private final void promoteEmptyToNodeList(Empty empty) {
        NodeList nodeList = new NodeList();
        AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$volatile$FU, this, empty, empty.isActive() ? nodeList : new InactiveNodeList(nodeList));
    }

    private final void promoteSingleToNodeList(JobNode jobNode) {
        jobNode.addOneIfEmpty(new NodeList());
        AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$volatile$FU, this, jobNode, jobNode.getNextNode());
    }

    public final void registerSelectForOnJoin(SelectInstance<?> selectInstance, Object obj) {
        if (joinInternal()) {
            selectInstance.disposeOnCompletion(JobKt__JobKt.invokeOnCompletion$default(this, false, new SelectOnJoinCompletionHandler(selectInstance), 1, null));
        } else {
            selectInstance.selectInRegistrationPhase(Unit.INSTANCE);
        }
    }

    private final /* synthetic */ void set_parentHandle$volatile(Object obj) {
        this._parentHandle$volatile = obj;
    }

    private final /* synthetic */ void set_state$volatile(Object obj) {
        this._state$volatile = obj;
    }

    private final int startInternal(Object obj) {
        if (obj instanceof Empty) {
            if (((Empty) obj).isActive()) {
                return 0;
            }
            if (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$volatile$FU, this, obj, JobSupportKt.EMPTY_ACTIVE)) {
                return -1;
            }
            onStart();
            return 1;
        }
        if (!(obj instanceof InactiveNodeList)) {
            return 0;
        }
        if (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$volatile$FU, this, obj, ((InactiveNodeList) obj).getList())) {
            return -1;
        }
        onStart();
        return 1;
    }

    private final String stateString(Object obj) {
        if (!(obj instanceof Finishing)) {
            return obj instanceof Incomplete ? ((Incomplete) obj).isActive() ? "Active" : "New" : obj instanceof CompletedExceptionally ? "Cancelled" : "Completed";
        }
        Finishing finishing = (Finishing) obj;
        return finishing.isCancelling() ? "Cancelling" : finishing.isCompleting() ? "Completing" : "Active";
    }

    public static /* synthetic */ CancellationException toCancellationException$default(JobSupport jobSupport, Throwable th, String str, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i2 & 1) != 0) {
            str = null;
        }
        return jobSupport.toCancellationException(th, str);
    }

    private final boolean tryFinalizeSimpleState(Incomplete incomplete, Object obj) throws Throwable {
        if (DebugKt.getASSERTIONS_ENABLED() && !(incomplete instanceof Empty) && !(incomplete instanceof JobNode)) {
            throw new AssertionError();
        }
        if (DebugKt.getASSERTIONS_ENABLED() && (obj instanceof CompletedExceptionally)) {
            throw new AssertionError();
        }
        if (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$volatile$FU, this, incomplete, JobSupportKt.boxIncomplete(obj))) {
            return false;
        }
        onCancelling(null);
        onCompletionInternal(obj);
        completeStateFinalization(incomplete, obj);
        return true;
    }

    private final boolean tryMakeCancelling(Incomplete incomplete, Throwable th) throws Throwable {
        if (DebugKt.getASSERTIONS_ENABLED() && (incomplete instanceof Finishing)) {
            throw new AssertionError();
        }
        if (DebugKt.getASSERTIONS_ENABLED() && !incomplete.isActive()) {
            throw new AssertionError();
        }
        NodeList orPromoteCancellingList = getOrPromoteCancellingList(incomplete);
        if (orPromoteCancellingList == null) {
            return false;
        }
        if (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$volatile$FU, this, incomplete, new Finishing(orPromoteCancellingList, false, th))) {
            return false;
        }
        notifyCancelling(orPromoteCancellingList, th);
        return true;
    }

    private final Object tryMakeCompleting(Object obj, Object obj2) {
        return !(obj instanceof Incomplete) ? JobSupportKt.COMPLETING_ALREADY : ((!(obj instanceof Empty) && !(obj instanceof JobNode)) || (obj instanceof ChildHandleNode) || (obj2 instanceof CompletedExceptionally)) ? tryMakeCompletingSlowPath((Incomplete) obj, obj2) : tryFinalizeSimpleState((Incomplete) obj, obj2) ? obj2 : JobSupportKt.COMPLETING_RETRY;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object tryMakeCompletingSlowPath(Incomplete incomplete, Object obj) throws Throwable {
        NodeList orPromoteCancellingList = getOrPromoteCancellingList(incomplete);
        if (orPromoteCancellingList == null) {
            return JobSupportKt.COMPLETING_RETRY;
        }
        Finishing finishing = incomplete instanceof Finishing ? (Finishing) incomplete : null;
        if (finishing == null) {
            finishing = new Finishing(orPromoteCancellingList, false, null);
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        synchronized (finishing) {
            if (finishing.isCompleting()) {
                return JobSupportKt.COMPLETING_ALREADY;
            }
            finishing.setCompleting(true);
            if (finishing != incomplete && !AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$volatile$FU, this, incomplete, finishing)) {
                return JobSupportKt.COMPLETING_RETRY;
            }
            if (DebugKt.getASSERTIONS_ENABLED() && finishing.isSealed()) {
                throw new AssertionError();
            }
            boolean zIsCancelling = finishing.isCancelling();
            CompletedExceptionally completedExceptionally = obj instanceof CompletedExceptionally ? (CompletedExceptionally) obj : null;
            if (completedExceptionally != null) {
                finishing.addExceptionLocked(completedExceptionally.cause);
            }
            objectRef.element = Boolean.valueOf(zIsCancelling ^ true).booleanValue() ? finishing.getRootCause() : 0;
            Unit unit = Unit.INSTANCE;
            Throwable th = (Throwable) objectRef.element;
            if (th != null) {
                notifyCancelling(orPromoteCancellingList, th);
            }
            NodeList nodeList = orPromoteCancellingList;
            ChildHandleNode childHandleNodeNextChild = nextChild(nodeList);
            if (childHandleNodeNextChild != null && tryWaitForChild(finishing, childHandleNodeNextChild, obj)) {
                return JobSupportKt.COMPLETING_WAITING_CHILDREN;
            }
            orPromoteCancellingList.close(2);
            ChildHandleNode childHandleNodeNextChild2 = nextChild(nodeList);
            return (childHandleNodeNextChild2 == null || !tryWaitForChild(finishing, childHandleNodeNextChild2, obj)) ? finalizeFinishingState(finishing, obj) : JobSupportKt.COMPLETING_WAITING_CHILDREN;
        }
    }

    private final boolean tryPutNodeIntoList(JobNode jobNode, Function2<? super Incomplete, ? super NodeList, Boolean> function2) {
        while (true) {
            Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (state$kotlinx_coroutines_core instanceof Empty) {
                Empty empty = (Empty) state$kotlinx_coroutines_core;
                if (!empty.isActive()) {
                    promoteEmptyToNodeList(empty);
                } else if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$volatile$FU, this, state$kotlinx_coroutines_core, jobNode)) {
                    return true;
                }
            } else {
                if (!(state$kotlinx_coroutines_core instanceof Incomplete)) {
                    return false;
                }
                NodeList list = ((Incomplete) state$kotlinx_coroutines_core).getList();
                if (list == null) {
                    Intrinsics.checkNotNull(state$kotlinx_coroutines_core, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    promoteSingleToNodeList((JobNode) state$kotlinx_coroutines_core);
                } else if (function2.invoke(state$kotlinx_coroutines_core, list).booleanValue()) {
                    return true;
                }
            }
        }
    }

    private final boolean tryWaitForChild(Finishing finishing, ChildHandleNode childHandleNode, Object obj) {
        while (JobKt.invokeOnCompletion(childHandleNode.childJob, false, new ChildCompletion(this, finishing, childHandleNode, obj)) == NonDisposableHandle.INSTANCE) {
            childHandleNode = nextChild(childHandleNode);
            if (childHandleNode == null) {
                return false;
            }
        }
        return true;
    }

    protected void afterCompletion(Object obj) {
    }

    @Override // kotlinx.coroutines.Job
    public final ChildHandle attachChild(ChildJob childJob) {
        ChildHandleNode childHandleNode = new ChildHandleNode(childJob);
        childHandleNode.setJob(this);
        while (true) {
            Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (state$kotlinx_coroutines_core instanceof Empty) {
                Empty empty = (Empty) state$kotlinx_coroutines_core;
                if (!empty.isActive()) {
                    promoteEmptyToNodeList(empty);
                } else if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$volatile$FU, this, state$kotlinx_coroutines_core, childHandleNode)) {
                    break;
                }
            } else {
                if (!(state$kotlinx_coroutines_core instanceof Incomplete)) {
                    Object state$kotlinx_coroutines_core2 = getState$kotlinx_coroutines_core();
                    CompletedExceptionally completedExceptionally = state$kotlinx_coroutines_core2 instanceof CompletedExceptionally ? (CompletedExceptionally) state$kotlinx_coroutines_core2 : null;
                    childHandleNode.invoke(completedExceptionally != null ? completedExceptionally.cause : null);
                    return NonDisposableHandle.INSTANCE;
                }
                NodeList list = ((Incomplete) state$kotlinx_coroutines_core).getList();
                if (list == null) {
                    Intrinsics.checkNotNull(state$kotlinx_coroutines_core, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    promoteSingleToNodeList((JobNode) state$kotlinx_coroutines_core);
                } else {
                    ChildHandleNode childHandleNode2 = childHandleNode;
                    if (!list.addLast(childHandleNode2, 7)) {
                        boolean zAddLast = list.addLast(childHandleNode2, 3);
                        Object state$kotlinx_coroutines_core3 = getState$kotlinx_coroutines_core();
                        if (state$kotlinx_coroutines_core3 instanceof Finishing) {
                            rootCause = ((Finishing) state$kotlinx_coroutines_core3).getRootCause();
                        } else {
                            if (DebugKt.getASSERTIONS_ENABLED() && (state$kotlinx_coroutines_core3 instanceof Incomplete)) {
                                throw new AssertionError();
                            }
                            CompletedExceptionally completedExceptionally2 = state$kotlinx_coroutines_core3 instanceof CompletedExceptionally ? (CompletedExceptionally) state$kotlinx_coroutines_core3 : null;
                            if (completedExceptionally2 != null) {
                                rootCause = completedExceptionally2.cause;
                            }
                        }
                        childHandleNode.invoke(rootCause);
                        if (!zAddLast) {
                            return NonDisposableHandle.INSTANCE;
                        }
                        if (DebugKt.getASSERTIONS_ENABLED() && rootCause == null) {
                            throw new AssertionError();
                        }
                    }
                }
            }
        }
        return childHandleNode;
    }

    protected final Object awaitInternal(Continuation<Object> continuation) throws Throwable {
        Object state$kotlinx_coroutines_core;
        do {
            state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof Incomplete)) {
                if (!(state$kotlinx_coroutines_core instanceof CompletedExceptionally)) {
                    return JobSupportKt.unboxState(state$kotlinx_coroutines_core);
                }
                Throwable th = ((CompletedExceptionally) state$kotlinx_coroutines_core).cause;
                if (DebugKt.getRECOVER_STACK_TRACES() && (continuation instanceof CoroutineStackFrame)) {
                    throw StackTraceRecoveryKt.recoverFromStackFrame(th, (CoroutineStackFrame) continuation);
                }
                throw th;
            }
        } while (startInternal(state$kotlinx_coroutines_core) < 0);
        return awaitSuspend(continuation);
    }

    @Override // kotlinx.coroutines.Job
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0016O\n8v4e%*\u0015wF\u0010\u00175\\]^\"f\bw\u0019bwZwlW\u0001-z\u0002\f{Kad(OK0FC!d_9}5\b\f3\u000f\u0002*")
    @InterfaceC1492Gx
    public /* synthetic */ void cancel() {
        cancel((CancellationException) null);
    }

    @Override // kotlinx.coroutines.Job
    public void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(cancellationExceptionMessage(), null, this);
        }
        cancelInternal(cancellationException);
    }

    @Override // kotlinx.coroutines.Job
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0004J\u007f:u4(`fJ-:!b}\u001c,\f\u000f6\u0017(\u000e[\u0005G\u0001\u0004\u000ew3sxMxKOetBZ7rQ\u001bjT98]ZNnMB%K#p\u0004kD\u0005O\u000b")
    @InterfaceC1492Gx
    public /* synthetic */ boolean cancel(Throwable th) {
        JobCancellationException jobCancellationException;
        if (th == null || (jobCancellationException = toCancellationException$default(this, th, null, 1, null)) == null) {
            jobCancellationException = new JobCancellationException(cancellationExceptionMessage(), null, this);
        }
        cancelInternal(jobCancellationException);
        return true;
    }

    public final boolean cancelCoroutine(Throwable th) {
        return cancelImpl$kotlinx_coroutines_core(th);
    }

    public final boolean cancelImpl$kotlinx_coroutines_core(Object obj) throws Throwable {
        Object objMakeCancelling = JobSupportKt.COMPLETING_ALREADY;
        if (getOnCancelComplete$kotlinx_coroutines_core() && (objMakeCancelling = cancelMakeCompleting(obj)) == JobSupportKt.COMPLETING_WAITING_CHILDREN) {
            return true;
        }
        if (objMakeCancelling == JobSupportKt.COMPLETING_ALREADY) {
            objMakeCancelling = makeCancelling(obj);
        }
        if (objMakeCancelling == JobSupportKt.COMPLETING_ALREADY || objMakeCancelling == JobSupportKt.COMPLETING_WAITING_CHILDREN) {
            return true;
        }
        if (objMakeCancelling == JobSupportKt.TOO_LATE_TO_CANCEL) {
            return false;
        }
        afterCompletion(objMakeCancelling);
        return true;
    }

    public void cancelInternal(Throwable th) {
        cancelImpl$kotlinx_coroutines_core(th);
    }

    public String cancellationExceptionMessage() {
        return "Job was cancelled";
    }

    public boolean childCancelled(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return cancelImpl$kotlinx_coroutines_core(th) && getHandlesException$kotlinx_coroutines_core();
    }

    public final JobCancellationException defaultCancellationException$kotlinx_coroutines_core(String str, Throwable th) {
        if (str == null) {
            str = cancellationExceptionMessage();
        }
        return new JobCancellationException(str, th, this);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r2, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) Job.DefaultImpls.fold(this, r2, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(CoroutineContext.Key<E> key) {
        return (E) Job.DefaultImpls.get(this, key);
    }

    @Override // kotlinx.coroutines.Job
    public final CancellationException getCancellationException() {
        CancellationException cancellationException;
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (!(state$kotlinx_coroutines_core instanceof Finishing)) {
            if (state$kotlinx_coroutines_core instanceof Incomplete) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            return state$kotlinx_coroutines_core instanceof CompletedExceptionally ? toCancellationException$default(this, ((CompletedExceptionally) state$kotlinx_coroutines_core).cause, null, 1, null) : new JobCancellationException(DebugStringsKt.getClassSimpleName(this) + " has completed normally", null, this);
        }
        Throwable rootCause = ((Finishing) state$kotlinx_coroutines_core).getRootCause();
        if (rootCause == null || (cancellationException = toCancellationException(rootCause, DebugStringsKt.getClassSimpleName(this) + " is cancelling")) == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        return cancellationException;
    }

    @Override // kotlinx.coroutines.ParentJob
    public CancellationException getChildJobCancellationCause() {
        Throwable rootCause;
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof Finishing) {
            rootCause = ((Finishing) state$kotlinx_coroutines_core).getRootCause();
        } else if (state$kotlinx_coroutines_core instanceof CompletedExceptionally) {
            rootCause = ((CompletedExceptionally) state$kotlinx_coroutines_core).cause;
        } else {
            if (state$kotlinx_coroutines_core instanceof Incomplete) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + state$kotlinx_coroutines_core).toString());
            }
            rootCause = null;
        }
        CancellationException cancellationException = rootCause instanceof CancellationException ? (CancellationException) rootCause : null;
        return cancellationException == null ? new JobCancellationException("Parent job is " + stateString(state$kotlinx_coroutines_core), rootCause, this) : cancellationException;
    }

    @Override // kotlinx.coroutines.Job
    public final Sequence<Job> getChildren() {
        return SequencesKt.sequence(new JobSupport$children$1(this, null));
    }

    public final Object getCompletedInternal$kotlinx_coroutines_core() throws Throwable {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof Incomplete) {
            throw new IllegalStateException("This job has not completed yet".toString());
        }
        if (state$kotlinx_coroutines_core instanceof CompletedExceptionally) {
            throw ((CompletedExceptionally) state$kotlinx_coroutines_core).cause;
        }
        return JobSupportKt.unboxState(state$kotlinx_coroutines_core);
    }

    protected final Throwable getCompletionCause() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof Finishing) {
            Throwable rootCause = ((Finishing) state$kotlinx_coroutines_core).getRootCause();
            if (rootCause != null) {
                return rootCause;
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (state$kotlinx_coroutines_core instanceof Incomplete) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (state$kotlinx_coroutines_core instanceof CompletedExceptionally) {
            return ((CompletedExceptionally) state$kotlinx_coroutines_core).cause;
        }
        return null;
    }

    protected final boolean getCompletionCauseHandled() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        return (state$kotlinx_coroutines_core instanceof CompletedExceptionally) && ((CompletedExceptionally) state$kotlinx_coroutines_core).getHandled();
    }

    public final Throwable getCompletionExceptionOrNull() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof Incomplete) {
            throw new IllegalStateException("This job has not completed yet".toString());
        }
        return getExceptionOrNull(state$kotlinx_coroutines_core);
    }

    public boolean getHandlesException$kotlinx_coroutines_core() {
        return true;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final CoroutineContext.Key<?> getKey() {
        return Job.Key;
    }

    protected final SelectClause1<?> getOnAwaitInternal() {
        JobSupport$onAwaitInternal$1 jobSupport$onAwaitInternal$1 = JobSupport$onAwaitInternal$1.INSTANCE;
        Intrinsics.checkNotNull(jobSupport$onAwaitInternal$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        Function3 function3 = (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(jobSupport$onAwaitInternal$1, 3);
        JobSupport$onAwaitInternal$2 jobSupport$onAwaitInternal$2 = JobSupport$onAwaitInternal$2.INSTANCE;
        Intrinsics.checkNotNull(jobSupport$onAwaitInternal$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new SelectClause1Impl(this, function3, (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(jobSupport$onAwaitInternal$2, 3), null, 8, null);
    }

    public boolean getOnCancelComplete$kotlinx_coroutines_core() {
        return false;
    }

    @Override // kotlinx.coroutines.Job
    public final SelectClause0 getOnJoin() {
        JobSupport$onJoin$1 jobSupport$onJoin$1 = JobSupport$onJoin$1.INSTANCE;
        Intrinsics.checkNotNull(jobSupport$onJoin$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        return new SelectClause0Impl(this, (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(jobSupport$onJoin$1, 3), null, 4, null);
    }

    @Override // kotlinx.coroutines.Job
    public Job getParent() {
        ChildHandle parentHandle$kotlinx_coroutines_core = getParentHandle$kotlinx_coroutines_core();
        if (parentHandle$kotlinx_coroutines_core != null) {
            return parentHandle$kotlinx_coroutines_core.getParent();
        }
        return null;
    }

    public final ChildHandle getParentHandle$kotlinx_coroutines_core() {
        return (ChildHandle) _parentHandle$volatile$FU.get(this);
    }

    public final Object getState$kotlinx_coroutines_core() {
        return _state$volatile$FU.get(this);
    }

    protected boolean handleJobException(Throwable th) {
        return false;
    }

    public void handleOnCompletionException$kotlinx_coroutines_core(Throwable th) throws Throwable {
        throw th;
    }

    protected final void initParentJob(Job job) {
        if (DebugKt.getASSERTIONS_ENABLED() && getParentHandle$kotlinx_coroutines_core() != null) {
            throw new AssertionError();
        }
        if (job == null) {
            setParentHandle$kotlinx_coroutines_core(NonDisposableHandle.INSTANCE);
            return;
        }
        job.start();
        ChildHandle childHandleAttachChild = job.attachChild(this);
        setParentHandle$kotlinx_coroutines_core(childHandleAttachChild);
        if (isCompleted()) {
            childHandleAttachChild.dispose();
            setParentHandle$kotlinx_coroutines_core(NonDisposableHandle.INSTANCE);
        }
    }

    @Override // kotlinx.coroutines.Job
    public final DisposableHandle invokeOnCompletion(Function1<? super Throwable, Unit> function1) {
        return invokeOnCompletionInternal$kotlinx_coroutines_core(true, new InvokeOnCompletion(function1));
    }

    @Override // kotlinx.coroutines.Job
    public final DisposableHandle invokeOnCompletion(boolean z2, boolean z3, Function1<? super Throwable, Unit> function1) {
        return invokeOnCompletionInternal$kotlinx_coroutines_core(z3, z2 ? new InvokeOnCancelling(function1) : new InvokeOnCompletion(function1));
    }

    public final DisposableHandle invokeOnCompletionInternal$kotlinx_coroutines_core(boolean z2, JobNode jobNode) {
        boolean zAddLast;
        jobNode.setJob(this);
        while (true) {
            Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (state$kotlinx_coroutines_core instanceof Empty) {
                Empty empty = (Empty) state$kotlinx_coroutines_core;
                if (!empty.isActive()) {
                    promoteEmptyToNodeList(empty);
                } else if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$volatile$FU, this, state$kotlinx_coroutines_core, jobNode)) {
                    break;
                }
            } else {
                if (!(state$kotlinx_coroutines_core instanceof Incomplete)) {
                    if (z2) {
                        Object state$kotlinx_coroutines_core2 = getState$kotlinx_coroutines_core();
                        CompletedExceptionally completedExceptionally = state$kotlinx_coroutines_core2 instanceof CompletedExceptionally ? (CompletedExceptionally) state$kotlinx_coroutines_core2 : null;
                        jobNode.invoke(completedExceptionally != null ? completedExceptionally.cause : null);
                    }
                    return NonDisposableHandle.INSTANCE;
                }
                Incomplete incomplete = (Incomplete) state$kotlinx_coroutines_core;
                NodeList list = incomplete.getList();
                if (list == null) {
                    Intrinsics.checkNotNull(state$kotlinx_coroutines_core, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    promoteSingleToNodeList((JobNode) state$kotlinx_coroutines_core);
                } else {
                    if (jobNode.getOnCancelling()) {
                        Finishing finishing = incomplete instanceof Finishing ? (Finishing) incomplete : null;
                        Throwable rootCause = finishing != null ? finishing.getRootCause() : null;
                        if (rootCause != null) {
                            if (z2) {
                                jobNode.invoke(rootCause);
                            }
                            return NonDisposableHandle.INSTANCE;
                        }
                        zAddLast = list.addLast(jobNode, 5);
                    } else {
                        zAddLast = list.addLast(jobNode, 1);
                    }
                    if (zAddLast) {
                        break;
                    }
                }
            }
        }
        return jobNode;
    }

    @Override // kotlinx.coroutines.Job
    public boolean isActive() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        return (state$kotlinx_coroutines_core instanceof Incomplete) && ((Incomplete) state$kotlinx_coroutines_core).isActive();
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isCancelled() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        return (state$kotlinx_coroutines_core instanceof CompletedExceptionally) || ((state$kotlinx_coroutines_core instanceof Finishing) && ((Finishing) state$kotlinx_coroutines_core).isCancelling());
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isCompleted() {
        return !(getState$kotlinx_coroutines_core() instanceof Incomplete);
    }

    public final boolean isCompletedExceptionally() {
        return getState$kotlinx_coroutines_core() instanceof CompletedExceptionally;
    }

    protected boolean isScopedCoroutine() {
        return false;
    }

    @Override // kotlinx.coroutines.Job
    public final Object join(Continuation<? super Unit> continuation) throws Throwable {
        if (joinInternal()) {
            Object objJoinSuspend = joinSuspend(continuation);
            return objJoinSuspend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objJoinSuspend : Unit.INSTANCE;
        }
        JobKt.ensureActive(continuation.getContext());
        return Unit.INSTANCE;
    }

    public final boolean makeCompleting$kotlinx_coroutines_core(Object obj) {
        Object objTryMakeCompleting;
        do {
            objTryMakeCompleting = tryMakeCompleting(getState$kotlinx_coroutines_core(), obj);
            if (objTryMakeCompleting == JobSupportKt.COMPLETING_ALREADY) {
                return false;
            }
            if (objTryMakeCompleting == JobSupportKt.COMPLETING_WAITING_CHILDREN) {
                return true;
            }
        } while (objTryMakeCompleting == JobSupportKt.COMPLETING_RETRY);
        afterCompletion(objTryMakeCompleting);
        return true;
    }

    public final Object makeCompletingOnce$kotlinx_coroutines_core(Object obj) {
        Object objTryMakeCompleting;
        do {
            objTryMakeCompleting = tryMakeCompleting(getState$kotlinx_coroutines_core(), obj);
            if (objTryMakeCompleting == JobSupportKt.COMPLETING_ALREADY) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, getExceptionOrNull(obj));
            }
        } while (objTryMakeCompleting == JobSupportKt.COMPLETING_RETRY);
        return objTryMakeCompleting;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key<?> key) {
        return Job.DefaultImpls.minusKey(this, key);
    }

    public String nameString$kotlinx_coroutines_core() {
        return DebugStringsKt.getClassSimpleName(this);
    }

    protected void onCancelling(Throwable th) {
    }

    protected void onCompletionInternal(Object obj) {
    }

    protected void onStart() {
    }

    @Override // kotlinx.coroutines.ChildJob
    public final void parentCancelled(ParentJob parentJob) throws Throwable {
        cancelImpl$kotlinx_coroutines_core(parentJob);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return Job.DefaultImpls.plus(this, coroutineContext);
    }

    @Override // kotlinx.coroutines.Job
    @Deprecated(level = DeprecationLevel.ERROR, message = "\u0012V\u0001Gr\t$i\u0018\u000erA\u0010$:\u000epc\u0018fnw\u000e\u0012\u0006HxoQ\t7&q_$OR]vBT%??%i\u001a9\fgJznQs\u0013KJ#V*\fH\u000b\u0001\u0011/:+Y\u0012\u0001u6G\u0001T\u0015L\u007fOBg2aszSfn;)\taEO9\u0004/a\u001eN_Q//CIf\u000f&8\u0001Aeo\u000b4+aHG\u0003.n8W\u0003\u0014\u0012Ci\u0004,W%\u0017}'':B\fV<\u000bS]=\u0003m0\\hg6 .w\u0012*\u0018xh\u000el\n{o\u000e.LvU\u001a]-2 Y?\u0011\u0001;WNaoS%nY%\u000f{\"Em1S:&\u0002")
    @InterfaceC1492Gx
    public Job plus(Job job) {
        return Job.DefaultImpls.plus((Job) this, job);
    }

    public final void removeNode$kotlinx_coroutines_core(JobNode jobNode) {
        Object state$kotlinx_coroutines_core;
        do {
            state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof JobNode)) {
                if (!(state$kotlinx_coroutines_core instanceof Incomplete) || ((Incomplete) state$kotlinx_coroutines_core).getList() == null) {
                    return;
                }
                jobNode.mo10549remove();
                return;
            }
            if (state$kotlinx_coroutines_core != jobNode) {
                return;
            }
        } while (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$volatile$FU, this, state$kotlinx_coroutines_core, JobSupportKt.EMPTY_ACTIVE));
    }

    public final void setParentHandle$kotlinx_coroutines_core(ChildHandle childHandle) {
        _parentHandle$volatile$FU.set(this, childHandle);
    }

    @Override // kotlinx.coroutines.Job
    public final boolean start() {
        int iStartInternal;
        do {
            iStartInternal = startInternal(getState$kotlinx_coroutines_core());
            if (iStartInternal == 0) {
                return false;
            }
        } while (iStartInternal != 1);
        return true;
    }

    protected final CancellationException toCancellationException(Throwable th, String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (str == null) {
            str = cancellationExceptionMessage();
        }
        return new JobCancellationException(str, th, this);
    }

    public final String toDebugString() {
        return nameString$kotlinx_coroutines_core() + AbstractJsonLexerKt.BEGIN_OBJ + stateString(getState$kotlinx_coroutines_core()) + AbstractJsonLexerKt.END_OBJ;
    }

    public String toString() {
        return toDebugString() + '@' + DebugStringsKt.getHexAddress(this);
    }
}
