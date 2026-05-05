package org.koin.androidx.fragment.dsl;

import androidx.fragment.app.Fragment;
import com.dynatrace.android.agent.Global;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function12;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function14;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.functions.Function16;
import kotlin.jvm.functions.Function17;
import kotlin.jvm.functions.Function18;
import kotlin.jvm.functions.Function19;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function20;
import kotlin.jvm.functions.Function21;
import kotlin.jvm.functions.Function22;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.FactoryInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.module.dsl.OptionDSLKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
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
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яĵ\u0014D߬)\u001e\u007f\u007fL܀kt\u001aA\u000e0!.Jչ*,(w\u000f߿r9FDmHDR[*\u001dk\u00044:[,qY;]\u001a\u0004\"\u0011OdgoñRZ!C\u0017إ\u001ex\u0001,Qǁ\u0001](\u000f:ԏw?IMwމA`\u000b6\rړ:\"Ny\rЏ\"*^\u0010~ٙKK\"\u00128ϋx:h\rUĨ\"\u0012\u001c>(ҵ&\\}N>ԟt]P/+ɅqBd'gܞ\u0005M#F\\܋\u0015vw\u001e3¨?5+%[Έ\u000fRq?\u000bӊy=\u001bh/ݐ3I\nW>ݙ\b\u0014++WՕuR4ؘ\u001dWp\u000e7+\u0016cyO.0}\u07be\n\rR\u00036\u0006UIV-Hh8\u001a9v\u0001VXV\u0012`R\u007fAad\u001bU+93G ~vqC)TG}\u0015\rd#/u1]d\u000e\u000f\u001d1S&W\u001aYP?XNPYSlbyĊ\u0006*\n:\u000eĐ5ʾ\u0010ф/\u0013EكQ)1m\u0012H\u000bg%\u0004\u0001pY֟`HV!\u0017\u0016e+)\u0010`Cr\u0010\u0002O|XZ\u0013}.Z\t\f\u000b+,lyL!k\u001b^Qxi1M\f\u0010UZl?gs\u00043gAn9ESs\u0010(R%\u001bO>r\u0005\u0007nXR:`E024XjVw\u0012C-\u0015Ʊ6?w&zπ7ɂ[é`~,ՓY\u0003\u0019ajhV~\u00032D\u000bo˅\u0003\t\u0017O\u0005p\u001eh\u0019M2{n-C@q9\u001f&c.~3%#5\u0001$\u0018MiZJd~&we{f!*;a/\u0004\u001f\u001f\u000192H-sY#\u0011WU ,\u0013\"\n\u0017Kn>i\u0018j7,\u000fqZQd\u0017P~tqQ\u000eM\b\ncVz\u000ecj\n:Gϗv\u0003_F\u0015̂\u0003ŷ\u001eǇ=˦n0ĜM3S)-\u0016>\u0014]\u0014\u0002eo۰<yx\u000eNt\u0014\u0005Lg\u001cnp\\s1[<OY\rJ8#\r\u0007HIx\u0006\u001eA14;5x_jrd;e#?\u007fv\u0007r\u0018\u0001Xk:Y{\u000e6>_p\u0002S\u007f$^\n%?\\\u0004\u0013suYa#o\u001f\u0012\u001b\u0002Ap\"\u001c\u0004 \u0005^r\u000b@\u0006\" L@ihmD\u0019&D,\u0003\b!B3rѕ\u0014z\u0006P&ʜ\u001dѡAƽSٳ\rbۿt\\X\u0007pE'!X\u007f\u001f\u00179ͨ\u00075G\u0004\u0016F\u00030\u00046\u0007R+\u00141io\u0003l%9Pj8;,^\u0002\u0019SsBi\u0006<\u0006U9\u0004j\u0018\ff\u001a-AH\u001a)<i/ox@^Q`tPtvXrbP2)E\t\r\u0010L\nU\u001b)Q\u0003o)-z_(bI\"\u000f\u001c\\N\u0017\u0014\riV\u001d=\u0006{-kPz\u00167{\u0006[Q|6&\t/\u0014v1\\\u001e\u000e|\t<$Ɛ\u001aq\u001clHƈ\u0019Ҝ\u001fɌFإs\u0001˖F\u000eFQ\u00123H\u0013\rX\f\u007f'̸5+\u0003\u0005jK\u0017y*grb|`!\u0002\u00075\\y|9f\u001c)+S/!fp91W&Z\u001f\u0010*\u0014F#<\u000bp;&N\fh\u001fm\u007f\u0006\u0013-=nB\u0006A2b\u001eD*\nw\u0014*\u001b4%=fM\u0005r\u0019^|B\u001e\u001enl8d;\u001e9\u0016\r~\u000f^?&dqx&r4O>/c\u001dMp\t\u0014E\u0010&O8bA+7`\u0013\u0006'%\u0017kBrv\u0010*\t\t\t~F5\u0082JTC$mڙ*ߟcܞ>ʊDF܂ 2!\u0010!/!8N=|\"\"ԝ_3W\u00189\u0001C9&s\r\u0018CugRE.\u0007|\u000f\u0019UxQo@tE\u00019./s!YtK;4\u0006P-\u000f\u0010w`}mg\\\u0013o@_4m\u001e(Wp0\u0010!2'\u001e 3\u0002U1\u000f5o^PV:c\u0014(:65R3I|x:\u001a<k(s+mq6QzZ-T@:-3\u0007sb\u0019%\u0011L\u001bJ,\\\u001f\u000e99'~ O8@YP\u0003O?\\\fD)r2@\u001biF{W@ *\u001c,p]ŀnjs[&ݗ>ޯ\fů\u001cח0`ϒ\u0018f-\u001a7K=Fd[\u0019UGǓ\u0019@%#\u0007.p\r+\n\u001c-V\"\u0018|jd\u001b\u0013AS\n@g\u0016\\|/+'ZE\n+ixWUT\u0012\\C<A\u001d\u0004Ix9k`\u0013i7J\u0005/\u001b\u0005xADF~>H,\t<\u0014GrK(t\tF8mv;@R\u000fZ\ni\u0011\u001e/=\u001c#u\u0001Bb}kt\u0013;7\u001e\u0001bW3-?\u0016\u0013\u0012Q\u0019Y!.UI2is;Hn'\u000edWZ\u0015\u0013Y\u0018\u0013gZ#?\u0006\u0006/oR|Xu?G_U}:&\u0010,\u0016\u00154b.\u0013\u007f\r\u0001h̿P6\\3\u000fÈ_ͭeޞ\u0003ڏy\u0003ޛF\u0012HW\u0016=L\u0011\u0011\u001bUCeގ:.\u0007\boO\u0019|Jiue\u0003dcDKy\u001f>?}'boc\u001ao_jn=7[,B!\u00120\u001cFe\u0002K7B-T\u0004qpwbt'XTo6i\b\t|c^gDBV\u0005/ew}ISt\u001f\u000fb~KYFrn<'|Sz\u001b\u0011\u0001\u0012m'\u0016GD=1w5J\"(2c_5G\u0011\u0018\u001elqw[\u0010m5F\r6B\r\u0017\u0015>-\u000b\u0014n\u0015Mv\u0004\u001aHbq`H*2rL}p\u00180\u001e\u000e\r\u0005rn\u0002Yaw/r\u0013\u00079\u001dHG@AW##\u0003_<\u001e1,aؕrXb/tߝ\fȡ\u0011܀\u0014ӺkOо\u00149gs_4$\u001eW|\n\u007f&Ȩy\u0012\u001abr#}j\u0003\u0015c-[\u0003\u001dX\\]G\u0002\u0018.?#(\u0019-\u0003VB`1B'\u0007\u0011D(`e\u000f|+\fs\u001eEs\u0016\u00128qL\b|\\\b8GBcs\u0015DM3w\u000eYa\u0004}KK\u0014P$TeK\u0016u\n?\u0005X8\t}\u0007IL\u0004bkB]\u0003\u0018dDk\u0001\bW\u0005$j\u0012<*\\vn3\u0007`c =\\\u001f$\u0007Nso7P'o`.\u0016K\u000b\u0001\u001d}iUf\u001bDWBp4N\u0012UH\u0007\u0002>F\b\rYi2;IM\tF[\u0017k\u0004.c\u007f)wJ{(]\u0012\u000e\u0015d#h=I\u000f\u0004P%5}]g^̓\u0012'tYN¯6¥Fɴr˷.i\u05cd&PvN`\r\b\u0007\u001b-\u0017~x̞M\u0015\u0018)m\"KD\u0006\u001dm\u0004DwQ\\\tWjz,zqZG4\u0004\u0007/!W\u001e6\u0012*\n\u000e\u0005q3oy\u0007CV%\"\u0019c2\u000e\u0018\u0013yb\u0004U\u000eG6Mi\u0007\u0018K{edP\u001d#$A,\u0011\u001f6{\u0003\u0012\u0010\u0019.*Q/\r\u001a\u0016\t>\u001eym\u000f/_y\u0013\\B\u00120UVJ\u001a\u0015r^>\f1K@0:\u0017]N}}tz\u007fl\b^Va\u0002>m~>JU* &\u0019Q$dlDms8F'\u000ed9:&B\f5L+^x}6v\u0001\u007fB\f:vC]XZ;+\u0011,\u0011\u0003\u0019#$+BEiWVd=n\rOq\u0018G|Nk\r\bw\u001d\u001a\u0005*nۙ 9O\u0004g\u0381:ԧ!Ţzȹ#s\u0382%R`/*6&<P8\\#yԒ\r\u0017'?\u0013t20f\u0015x\b~<HH\u007f`%,l5\u0007j\u001a3VSO[\u0005.:\u001b,:oG9J\u0006&\"HuO_$5\u0011%n\u001a\t\u0019\u001cUubc8U\u0018\u0005D\u0018H\u0005D\tYi^y\";\"\u000f8a\n84Jpk@\u00152iT0e\u0010z\u0012\n4,<}h\b`W\n%n3/\u001b\u001bp\u000e\\Fa33oWW\u0007\\S\u001dA?yGv\\\u0006|\u000e\u001cx\u0004Py\u0003a2JU\u0002()\u000b_A4\u0012\f\u0017d\u007f~@IXf\u001bD\"\u0013x\\.\u0002+V-gDJ\u0006\\|l\fcY)\u0014nDrV1]Mf4\u00168-_1~\"}fh#?E\u001a,{-BVm\u0015g6#pF\u0016R\u0012jР[Sp\u0019\u000fד8Ȼ3̀,З\u000b,ݤl&\u001b\r_gz\u001efK\u0019NTʖo\u0005D!BbV\u000eNtuOHc\u0017\\f=A\u001d\u0002`v8\u0012d|X5^~66\u000fw4Q\\u]A1e\u000e!\\3R3W\bU;fQ6g]\u000e\\T\u0003\u001e-?Io%}\u001dNm_Op\u001d5Ymv{d0H\u0012\u001f>\u0014d$,\u001b5+T<>z\u001a@5%!Vxd0tzn\u001bm^\fO`U?SU'f\u0002=5^\u0011\u0018!'6/O(9i|&;%~f\u001cQ\u007fo@3`bP}ao zC2D\u00182YXY&\u001dx!\u007fawKC5J*`R\u007f~wv\u0005m}b\u001f4B\u0005.C\u0001x6\f\t\u0010\u001f\u0004fszk;g>L)\u00122-pf&W9;0b\u0017\t\fq\bk~f7tG]E\u007f\u0006f$o¹IMk*<\u0605\u0001ЧXˊ\u0005ϋj\u0007л]BtxR,\tL%\u001f,\u0014VԙF\u001fPJ\"(\u001b)e-v$jm`Mq\u0015\u0017sh\t:}\u0001AD\u001e\u0002D\u001d\u001a3F\u001d|\u0018\u0002#XX\u0011z9S_o`A6g>\u0003\u007f\u00172;\u0017\n\u0019=*rZ\t\u00010{w$B/DGqH]?7\u0010Cp\u0012?W|\u0011x\u0001e0L\u0015#<\u0016g\u0005P}V\u000f\u0017?\u0001r\\BVIDu\u001b\u0007Q\u000e\u001dt\u001am^0qJv\u001fu8J\b#_Tb\u0013\u0019!):-S*Z\u000b]I\u001aKA(\u001c\u0014\u0002/cS\u0002\u0004t\"\u0003\u0013B~F4FwVa;{\b>UB$\u0004\u001bPF4L+ZV\u0003\u0004v\u001a%N!C#q\u0005\u0007nD$A7\u0010\u000b\u0007v\u001d+\u0014\u0016o3\n\u001ek8\u0017T\u0016]\u000e(p[9ga\u001a\u000b\u0006wgdEJa\u0011I\u0006*\u000bB\u0002U(1g\u0005\b#\u001fׁ >a_3ץTϸ5ڇ6Ū\u00123ߐ|t\u001e&\u001b\u0010\u0019gh\u001e^R\u0002ؙ\\Iz\f\u0015f\u000b&lQz0@ \u0015\u0012c&\u0007?I+\u000eW\u0007E{e\tk=\u0012K~a\u0011\tE]K|i)7n/)LBWc\u0016H(\u0006\u0014\u001e\u0004\u000e%V.\u0017,n6+Iy;\b\bbtIV|r~u>{hj8a\u001d\u0006F:N+91C\u0010#\bh;b\u001b\u007fFo\u001e\u001b2VM%\u00157qV\u0019k<]>oS\u0013 g`eiY\u0015,\u0003<1 \u001d\u0014s\u007f,\u0007\u001es;^\u0018\u000e\u001e=\u007f%)`$ZBb\u0001\r$~,8\u0004$Eb1xe\f\fsfK=\u0019\u000e\u0015o\u0001\u0007A_;\n\u0003g/RQ]r\b\u000fA\u000fO)-a>e\u0013tF;exlS\u0014./vMJ\u000b~9jc\u001a*)#]o'hC\u0019NiUJBD\u0016+P\n>1h:);\u0011_nmAtg\\YBxt\tn\u001f\u000f\u00101э\u0017PpG\u0002\u0080Tՙ%ǺCӳ-=Щ5/\u001d\u0011(U\u001c6Q4\u0003K) J#\u001091#CM;\u0003\u00103P(\u0011\u0010\u001c@ONnqY2\u0002D{q\u0011DuT\\VyV/2?2\u000b@&QvF<D\f)Y/1'5q0}\u0011\u001eO\u0011{bMJ\u000f\u000f7Q]\u0001mwTz\u0019\u001d927\u007f\u0011s|W?D\nP9\u001f*\u000ej0_yn+yV\u001a>y\"\bt^5(*L0\u0018*\\,gHxBu=^\u0001\u0012^@\u0016dH#+9]\u0003\u0006\u0016\u0005V}Ze=x\f@[\u0005Z9\\TJ=O\u001daW\u0005\u0002y\u0011%S$;e(\u001dE3\u0005jsyFKM9wGxwFs\u001e&l4s\u0007.aLj*XY6f\u007f\u0004Y\u0018im(D\u001251\u0006\u001cA=d\u0018n=,us\tXJ\\K}k|%Rg6\u001fG|A+\u001883lP\"\u001abrMAOOFI\u0002Qz\u0012A1Ow#\u0011g}o_SW\u0016l\fCS$feڒKwt\t&̈́[Ç>ݫ,׀?XШzkV4t\"\\QRK@`\u0003ڵBUZ?tT=_cu\u000f57R\u0006F\u0018\u0015JtOa5\u001aK?i\u007ftsED%\u00121>W5A\u0016R\u0018SE5\u0006/<Ns\u0016dW}'lu\u001e#\u0001b)w\u0017qEQ[tx\u0010>EkY\u001a\"FE/.#Vr\u0002G\u0004\u001d\u0014w\u0019iL\u0001O9gm\u001bpd\u001b/\u0004\u001f*N)8(.N@/r2Ds}S\\F\u000f/a}\r\u0003Va}\u0001\u0003\u0006s\u0018s\u0006SHun\u0013emv,iix\u0003HwtHTU\u0014jCPm\fLwN;g\u007f\u0006]\fln)er:Pf\u001e\u0003A\u0019Zm^P\u0017\u0007)|o}msn~#rItcD|v\rMZZ\b)[/soO?\u0006p\u000f-\u0004+DT\u00064sq\u0014wj\u001c6z,\u001e9\u000eyM\u0007O\u001a@\u001f']PO\u0016>\"\u000feF\u001d\u0014hZjrnX7v?@p6u.\"\r\u0019b\u001f]a\u001c{\u001c\u000bt\u0015;8zK\u0006*8<ϭ\u0019#z\f\u0003åb˼\u0002ݒ\u0005،F\u0016ϱCAZ\n]\t\u0018w{B\fyaܶ_\u0010G\u0001\u0012\f^\u0012\u0018 $|b@Wz\u0015'}8\u0016\u000e1hhm[\u00134<G/0%U\u0010b\\dAVv\u001b&L6pY\u0007\u0011?\r\b0Q\u000e ,R\u0005^{\u000fn\"RQMg\u0006!X]G\u000f+ao\u0010\u0006W\u0003\u0010Y(Zu_m\u000eiRvDD\u0006$\u0018;.\n\u001b\fKQ\u000e \u007f4@Z\u0015\u0002\u0011*zaf@m\u0013\u000b\u001f\fj\u00102Hn\r*\u0017\\0S\u0002l1y\u007f\u0002>Q\u001c)!m]\u0010q\u001bX1=\u000b\u0011\t\u001e9R/\u0006*-&\u0015.xSDQQGjcPo\u0014B\u0004u4atBNW \u0018\u0018\u0011A\u001cQS'Rx\u0001I\npI&=\u001a;~\"2\u0013FZc,\u0003X9w pp;Np!\b;\u0005\u001cv\u0007U9c'\u0016*\u0014`GO\u007fK@=X\u0001UWi\u0006\u0005\u00016\u00032\u001a?J\u001a\u000es;{R^U:$\u001e\u000e\u0004Yk\u0006\u00056d%\u001c.\u001a2>%/\u0002f\u0017\u0016$iB\bcS+K\u000ewn\u001d\u0015>,\f9Ɨ(P#~uӷ+Ž1͜;ϗ#\fױ 6i+)=$\u00113#l*8ē\u0010Q:,\u0015h*\u0011M]J?\u001a0kW\u0016\u000e<b:~\u0012]Dc\u0018!s\u0019\u001eIm,*8dK6y\u0017R7pHh]~H=J2T!\rCKtv\u000f'\u0015ti>l6.S\u0005fH[Kp5#++2\u0002C*Jo{v}9|\u000fkcbn}hw\u0013&GQ.\u0015\bqDOSw\u0018<\u00144\u0007BL\u0017>32w'mvg@9\u007fT4aTM$A1-)a3\u0019$8j%\u0005(\u0013mdd\u0010htZ\u0017>\u0013u\u001cq|UUS\u0007[P6>>\u0006GmW\u0002>FO8=k97\u001fo\u0005\u0016\u0001'\u001d\b\u0018|tBKP&@>~\u0007\u0019\u001fg\u0001\u001e\nrP,\u0003&R<^BD\u0007Sx<,\u0002h9\u0010B\u0007'\f>Ndm0\u001ar :90?5]Gc\u0001dP\u0018m\r7{eI\r1!;Q@u@b\u000e\u0013NR\\\u0006biis4}\u007f5\u001e2^^]g\u001e,h^\b\u000bH\u0006PTMI6%&`T\u0014Ai\u001dS-`\n^Rv>NI\u000f~\u0002ɾ$H\u001cq\u0016Ѥ4ۼEȚ\fҋ\u000b*ɲvt/Ib\np\r=O\u001eQ3\u07b3D3LU,Sub$ec\u0004'e?C\u0017*\u0003\u001e7!D=|7! u}VE\u0004X\u000b`daw\u0018^: u\"GX\u007f,dP`\u000f\u0006dRe+\u0014K\u0001a\u001aq!\u00167`vS4\u001a&FUky\u0001_X\b+1^;o=b&U?c9ie\\(oNv\"XON\u0014Sg\"X#_TC$AKq,\u0006pRP\u0012\u001c>g\u0004'R.A+`7Dy<F=\b%\u0012jc6v\\4-2p\u001a\n\b]`k\u000e\u0001d\u001eO[t\u000bȦ(74E\u0018:N0zBto\n\tmuE,PQNr\u001e4_\u0012\u001a%\u0007l^86\u001c\u0004\u001a2Et;:\u0012\u0004mIU\u0010krh}\u001b9+D\b\u007fvljpr,[NS,~Z\t\u0019F\u0003\t~`58`hM\u0012,}f\u0001\u000e`5\u0010X\u0003v\u001d\u001ee\b\u0002 z3qs}\u0015 \u0004RW\u0003YiU@P\u0006h\u001b(*\r\u0017+\r\u000b-W|\u000e1w<Nj\u0005LA0p\u0003FXhc\u0006\u0007x^\u000e=\u0003I\\%ZNdO3\\v\r(#h\u001eH=\rE\"ފ)T'~Zԧ\u0013Ԝ?҉\u001dͱQsߜ\u0002SjkV\r>\u0011&*C\u0010\u001aŻ*P\u0002o)*8j08@=k\u0001I\u0001W7)-\u0005\u0012WX\u0001\u000b\u0010u\u007fDa\u000e12Hq\u001bb\"[\u001fXVw\rpYW;*\u0011v\u0015K2wD\"\foMa>wO\u0004H\u0014\u00150\u0004O\u0013`'0PLO\u0014DZ\u0007a_sQ@\u001a0.L7\u0002wl$F\u0014\u0001/Z/\tHT\u000ec\u0002I\f\u0001vcRi{7xEh\u0012-\u0004j%\";$\u0011^/U\u0015{UEnR\u0001=]&y;D'\u0015\t*t64&~C0|.f2,xfWe\bv4\"Ma!ܮMY\u0010j\u0013mȫE sDzB\u0012-F*\brVua\u0017)';Xz@\u0001R?gj\u000f\u001az14l\u0014B\u0012zf\noZ\u0018~]\u0003\u000b\\\u007fl\n\u0007UN[-3IB\r q9\u0014Zx\u001a&\u0007\u0007(!cO\u000fe3\n\u0010qxj}O\"\u001151y2\u001eS6L({c\u001a\u007f\u00160Lr;AXL?$\"ee+TI{i+rxQV\u001cx\u0003F\u0014\u0013=cr\u001c4;=2=<c~Qf\u0013\u007fKGt\u0015Y_O\u001d@!6r5n8_:i}p8;Vk\u000e^\u00016˙8;\u001e3\u001cĴ\u0002ԣyˋYճ18ƊB\r\u0016\u000f9dz\u0018p]9\u001d4ē::*\u0005\u007f&e\u0004\u000e\u0004\u00124rVe\u0010Jze|\u001bI}0\b\u0007o0t);i.\u0017WV?-Q`b+\u0003\u0002lG\u000eC|Y\n\\G^II=zS9\u0002\u001e##@gu'}KE=\u0016YZM`\fi\u001d:,DpJEei\u0012f\u000f6\u000f/|Zrf5V\u0007)6<X%)w\u0011g]gz\u000bH\u0015A0CB %?\"\t.\u007flZ7KtaWqUM\u0018r*CQt$\u0019HDf+37\u000bpUpy\u007fyqlh\u0016\u000f)\u0006 \u007fKv\u007ff& gYmt4~rnӯ^{9\u0012@Mź8\r\f\u0014\u001bsT\u001fw\bF\u0015!!7Qs\u0002c P\u0018\u001b]GS%\u0014\u001f\"|_;Yy'O@(\u001an\ng8|C\u0006\u0017&Y[B\u000e@~30S8~6:X\u0014\n\u001czN\u0006Pt1({*:.\u0011%h9k\u0001c<>R\u001e\\>Oo\bheUP>ZrN\u0018;;zq|Tk\u0019\u0013\u0019(\u0012a:\u001fw\u000bWd\u0004wd?$9qE\u0011\u0002'7F[-a,B,pl\u0014N\"a<\t\n \u001fhe\"+lY!aF$k\u0006\u0005:=ILMo\r!J\u0007\fPn·3d9RIÃ\u000bڸ.АBͳ]Jػ:t\u0015KWh\"\b\u0014jvrWߴO%\u0006\u0018b+:\u0010{Wo\u0005|\\sVO\u0016T|g\u0016\u0017\b:)eyM8:\u000eoVql\u007f^t\fJ6o;j\u0006~\fx@g8Bhz\u0012\u000f[w\u001aNYwxymI\\\u0015su(ECQr!\u0011\u000fFq\u0011\u001c?R\u001136O6.f$U\u001e eF\u0006\u0016~}\u007f\u0010\"a:2\u0014\u0011;r*\bYq}\u0015\u0001xs1\u0002p1VZ:X\u001e-f5\u0014M|B\b\n\u0006\u000ft\u0001LjSs5\t\u0003\u0015 ?\u001d6c>j.\t\".;\u0019>ver\u0005TX(8.y}0BoEx=\u0004pQ_\u0016O\u0003ڌ\u0015\u001byov@ݷd\u0011~p;BUtY\u0016\\\bV\u0006\u0012l=\u0018I\n\n\"\u001fnx\u0005'\u000e8vV\t 'z_F(dplGC\u000be\"/<\u0001\u0017/\u0015\u00153\u007fdhAP\u0002fl\u0002M%k\u000e\u0016MWk?+W\u000eG\u000e|(Vi\u0002Y\u0002r:4\u000fuRO sgZw<\u0001\u0003I))U\u0007J\u0011\u0019(p8\u0012bV1\u001d\u0005Rq\u000e\u0012B\u001d\u001e\u000f26C)B3W\u001d*\u001a5\u0017xY7ps\u0016%C\u00143<?b\u000f\u0014Vg|\u0011#}GI\u0001\u0017*5Wvna'T6g@S\u0016eXaj-(|j=ό\u00066.\u00125ضYǉeңٰR\u0017\u0014\u001fsȅ.\u0014%ƧKs"}, d2 = {"4qP4`,Gb\u0003\u007f", "\u001ana4\"2HW\"Hxh9|R.e\u0001,\u0005D\u0010\u001b!P9sFz.\u0014Y~$@q%2WL\u0011", Global.BLANK, "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.D/", "\u001ana4\"2HW\"Hxh9|R7o~8\u0003@J~!F\u007f\u0015<L", "1n]@g9NQ(\t\b", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "=oc6b5L", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001ana4\"2HW\"Hxh9|R.e\u0001,\u0005D\u0010\u001b!P9j<r.\u0014Y~$@q%2WL\u0011", "", "\u001ana4\"2HW\"Hxh9|R7o~8\u0003@J\u0016%N9l<w)>]\r$Av\u007f9\\GEtBs", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "\"0", "\"1", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\"2", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "\"3", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001384U", "\"4", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001385U", "\"5", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001386U", "\"6", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001387U", "\"7", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001388U", "\"8", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001389U", "\"0\u001f", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381J}", "\"0 ", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381K}", "\"0!", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381L}", "\"0\"", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381M}", "\"0#", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381N}", "\"0$", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381O}", "\"0%", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381P}", "\"0&", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381Q}", "\"0'", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381R}", "\"0(", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381S}", "\"1\u001f", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382J}", "\"1 ", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382K}", "\"1!", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382L}", "9nX; (GR&\t~]&\n\t6e{6{"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class FragmentOfKt {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.androidx.fragment.dsl.FragmentOfKt$fragmentOf$1, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0018\u001d<;!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007\"2\u0012\u0006ј~j\u007f/dmN\u008c`R@\u000e\u0014{b$\u0004$ DkY(\u007f:\t}Q.oĔN\\\u0011G\u001d\u000b"}, d2 = {"\n`]<a@F])\rS", Global.BLANK, "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.D/", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "7s", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "7me<^,", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]/B[G&Aq\u001fwKMHk})\u0011u]A\u0007r,[@\u0012CYJ4\\arJ\"td\u0015M+\u001aZ\u001d( wCD)\f+\\K<u|\u000e\u001e\u000e>y:>a\u001b\u0011Z\"qC1hOh5"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass1<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function0<R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function0<? extends R> function0) {
            super(2);
            this.$constructor = function0;
        }

        /* JADX WARN: Incorrect return type in method signature: (Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)TR; */
        @Override // kotlin.jvm.functions.Function2
        public final Fragment invoke(Scope fragment, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(fragment, "$this$fragment");
            Intrinsics.checkNotNullParameter(it, "it");
            return (Fragment) this.$constructor.invoke();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.androidx.fragment.dsl.FragmentOfKt$fragmentOf$10, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<;!&i\u0016DLcz\u000bI\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007ljGӄ\\e\u000f-r[0şyzJ#\u0004$ C[Y |0\neM\bktJh\rY\u000e&\u001a~k:Lkw}\u0016\u00154PsU2msC<nyL\u0004@6(<\b\u000b\u0017\u0019JL\u0016{\tJa\u000b24FvHZ#L%\u001e\u0018\rL)\u0017\u001d\u0005g|@xpkEG#1u\tVϮc2\u0003Z\u001bT"}, d2 = {"\n`]<a@F])\rS", Global.BLANK, "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.D/", "\"0", "\"1", "\"2", "\"3", "\"4", "\"5", "\"6", "\"7", "\"8", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "7s", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "7me<^,", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]/B[G&Aq\u001fwKMHk})\u0011u]A\u0007r,[@\u0012CYJ4\\arJ\"td\u0015M+\u001aZ\u001d( wCD)\f+\\K<u|\u000e\u001e\u000e>y:>a\u001b\u0011Z\"qC1hOh5"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass10<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass10(Function9<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> function9) {
            super(2);
            this.$constructor = function9;
        }

        /* JADX WARN: Incorrect return type in method signature: (Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)TR; */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function2
        public final Fragment invoke(Scope fragment, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(fragment, "$this$fragment");
            Intrinsics.checkNotNullParameter(it, "it");
            Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> function9 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            Object obj = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T2");
            Object obj2 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T3");
            Object obj3 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T4");
            Object obj4 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T5");
            Object obj5 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T6");
            Object obj6 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T7");
            Object obj7 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T8");
            Object obj8 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T9");
            return (Fragment) function9.invoke((T1) obj, (T2) obj2, (T3) obj3, (T4) obj4, (T5) obj5, (T6) obj6, (T7) obj7, (T8) obj8, (T9) fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.androidx.fragment.dsl.FragmentOfKt$fragmentOf$11, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<;!&i\u0016DLcz\fI\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007ljGӄ\\e\u000f-r[0şyzJ#\u0004$ C[Y |0\neM\bktJh\rY\u000e&\u001a~k:Lkw}\u0016\u00154PsU2msC<nyL\u0004@6(<\b\u000b\u0017\u0019JL\u0016{\tJa\u000b24FvHZ#L%\u001e\u0018\rL)\u0017\u001d|kT>Vvs9W#1trR5kH|{\u001a\r\\ܮ\u0011xg,9O"}, d2 = {"\n`]<a@F])\rS", Global.BLANK, "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.D/", "\"0", "\"1", "\"2", "\"3", "\"4", "\"5", "\"6", "\"7", "\"8", "\"0\u001f", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "7s", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "7me<^,", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]/B[G&Aq\u001fwKMHk})\u0011u]A\u0007r,[@\u0012CYJ4\\arJ\"td\u0015M+\u001aZ\u001d( wCD)\f+\\K<u|\u000e\u001e\u000e>y:>a\u001b\u0011Z\"qC1hOh5"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass11<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass11(Function10<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? extends R> function10) {
            super(2);
            this.$constructor = function10;
        }

        /* JADX WARN: Incorrect return type in method signature: (Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)TR; */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function2
        public final Fragment invoke(Scope fragment, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(fragment, "$this$fragment");
            Intrinsics.checkNotNullParameter(it, "it");
            Function10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R> function10 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            Object obj = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T2");
            Object obj2 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T3");
            Object obj3 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T4");
            Object obj4 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T5");
            Object obj5 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T6");
            Object obj6 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T7");
            Object obj7 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T8");
            Object obj8 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T9");
            Object obj9 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T10");
            return (Fragment) function10.invoke((T1) obj, (T2) obj2, (T3) obj3, (T4) obj4, (T5) obj5, (T6) obj6, (T7) obj7, (T8) obj8, (T9) obj9, (T10) fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.androidx.fragment.dsl.FragmentOfKt$fragmentOf$12, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<;!&i\u0016DLcz\rI\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007ljGӄ\\e\u000f-r[0şyzJ#\u0004$ C[Y |0\neM\bktJh\rY\u000e&\u001a~k:Lkw}\u0016\u00154PsU2msC<nyL\u0004@6(<\b\u000b\u0017\u0019JL\u0016{\tJa\u000b24FvHZ#L%\u001e\u0018\rL)\u0017\u001d|kT>Vvs9O'\trPY=^X|{\u0019vX5\u001a\u000faL9\u0007?߱\u0019'Y\u0012\u0015b"}, d2 = {"\n`]<a@F])\rS", Global.BLANK, "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.D/", "\"0", "\"1", "\"2", "\"3", "\"4", "\"5", "\"6", "\"7", "\"8", "\"0\u001f", "\"0 ", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "7s", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "7me<^,", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]/B[G&Aq\u001fwKMHk})\u0011u]A\u0007r,[@\u0012CYJ4\\arJ\"td\u0015M+\u001aZ\u001d( wCD)\f+\\K<u|\u000e\u001e\u000e>y:>a\u001b\u0011Z\"qC1hOh5"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass12<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass12(Function11<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? extends R> function11) {
            super(2);
            this.$constructor = function11;
        }

        /* JADX WARN: Incorrect return type in method signature: (Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)TR; */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function2
        public final Fragment invoke(Scope fragment, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(fragment, "$this$fragment");
            Intrinsics.checkNotNullParameter(it, "it");
            Function11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, R> function11 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            Object obj = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T2");
            Object obj2 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T3");
            Object obj3 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T4");
            Object obj4 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T5");
            Object obj5 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T6");
            Object obj6 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T7");
            Object obj7 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T8");
            Object obj8 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T9");
            Object obj9 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T10");
            Object obj10 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T11");
            return (Fragment) function11.invoke((T1) obj, (T2) obj2, (T3) obj3, (T4) obj4, (T5) obj5, (T6) obj6, (T7) obj7, (T8) obj8, (T9) obj9, (T10) obj10, (T11) fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.androidx.fragment.dsl.FragmentOfKt$fragmentOf$13, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<;!&i\u0016DLcz\u000eI\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007ljGӄ\\e\u000f-r[0şyzJ#\u0004$ C[Y |0\neM\bktJh\rY\u000e&\u001a~k:Lkw}\u0016\u00154PsU2msC<nyL\u0004@6(<\b\u000b\u0017\u0019JL\u0016{\tJa\u000b24FvHZ#L%\u001e\u0018\rL)\u0017\u001d|kT>Vvs9O'\trPY=^P\u0001S\u0017T`=\f\u001faL8p;C#=S1\u0016\u0019cύ\u0007AwM\u0013y"}, d2 = {"\n`]<a@F])\rS", Global.BLANK, "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.D/", "\"0", "\"1", "\"2", "\"3", "\"4", "\"5", "\"6", "\"7", "\"8", "\"0\u001f", "\"0 ", "\"0!", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "7s", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "7me<^,", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]/B[G&Aq\u001fwKMHk})\u0011u]A\u0007r,[@\u0012CYJ4\\arJ\"td\u0015M+\u001aZ\u001d( wCD)\f+\\K<u|\u000e\u001e\u000e>y:>a\u001b\u0011Z\"qC1hOh5"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass13<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass13(Function12<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? extends R> function12) {
            super(2);
            this.$constructor = function12;
        }

        /* JADX WARN: Incorrect return type in method signature: (Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)TR; */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function2
        public final Fragment invoke(Scope fragment, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(fragment, "$this$fragment");
            Intrinsics.checkNotNullParameter(it, "it");
            Function12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, R> function12 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            Object obj = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T2");
            Object obj2 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T3");
            Object obj3 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T4");
            Object obj4 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T5");
            Object obj5 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T6");
            Object obj6 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T7");
            Object obj7 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T8");
            Object obj8 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T9");
            Object obj9 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T10");
            Object obj10 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T11");
            Object obj11 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T12");
            return (Fragment) function12.invoke((T1) obj, (T2) obj2, (T3) obj3, (T4) obj4, (T5) obj5, (T6) obj6, (T7) obj7, (T8) obj8, (T9) obj9, (T10) obj10, (T11) obj11, (T12) fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.androidx.fragment.dsl.FragmentOfKt$fragmentOf$14, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<;!&i\u0016DLcz\u000fI\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007ljGӄ\\e\u000f-r[0şyzJ#\u0004$ C[Y |0\neM\bktJh\rY\u000e&\u001a~k:Lkw}\u0016\u00154PsU2msC<nyL\u0004@6(<\b\u000b\u0017\u0019JL\u0016{\tJa\u000b24FvHZ#L%\u001e\u0018\rL)\u0017\u001d|kT>Vvs9O'\trPY=^P\u0001S\u0017T`=\f\u0017e$6NDK\u0014MS1\u0015\u0003_M\u0012Wqk\u0015//ݳ/KyhDj"}, d2 = {"\n`]<a@F])\rS", Global.BLANK, "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.D/", "\"0", "\"1", "\"2", "\"3", "\"4", "\"5", "\"6", "\"7", "\"8", "\"0\u001f", "\"0 ", "\"0!", "\"0\"", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "7s", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "7me<^,", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]/B[G&Aq\u001fwKMHk})\u0011u]A\u0007r,[@\u0012CYJ4\\arJ\"td\u0015M+\u001aZ\u001d( wCD)\f+\\K<u|\u000e\u001e\u000e>y:>a\u001b\u0011Z\"qC1hOh5"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass14<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass14(Function13<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? extends R> function13) {
            super(2);
            this.$constructor = function13;
        }

        /* JADX WARN: Incorrect return type in method signature: (Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)TR; */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function2
        public final Fragment invoke(Scope fragment, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(fragment, "$this$fragment");
            Intrinsics.checkNotNullParameter(it, "it");
            Function13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R> function13 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            Object obj = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T2");
            Object obj2 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T3");
            Object obj3 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T4");
            Object obj4 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T5");
            Object obj5 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T6");
            Object obj6 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T7");
            Object obj7 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T8");
            Object obj8 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T9");
            Object obj9 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T10");
            Object obj10 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T11");
            Object obj11 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T12");
            Object obj12 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T13");
            return (Fragment) function13.invoke((T1) obj, (T2) obj2, (T3) obj3, (T4) obj4, (T5) obj5, (T6) obj6, (T7) obj7, (T8) obj8, (T9) obj9, (T10) obj10, (T11) obj11, (T12) obj12, (T13) fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.androidx.fragment.dsl.FragmentOfKt$fragmentOf$15, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<;!&i\u0016DLcz\u0010I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007ljGӄ\\e\u000f-r[0şyzJ#\u0004$ C[Y |0\neM\bktJh\rY\u000e&\u001a~k:Lkw}\u0016\u00154PsU2msC<nyL\u0004@6(<\b\u000b\u0017\u0019JL\u0016{\tJa\u000b24FvHZ#L%\u001e\u0018\rL)\u0017\u001d|kT>Vvs9O'\trPY=^P\u0001S\u0017T`=\f\u0017e$6NDK\u0014EW\t\u0013`iU\u0002gqk\u0014\u0019+5;as\u0006G\u001f\bЏ\u0019-U\u001fk\u0006"}, d2 = {"\n`]<a@F])\rS", Global.BLANK, "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.D/", "\"0", "\"1", "\"2", "\"3", "\"4", "\"5", "\"6", "\"7", "\"8", "\"0\u001f", "\"0 ", "\"0!", "\"0\"", "\"0#", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "7s", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "7me<^,", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]/B[G&Aq\u001fwKMHk})\u0011u]A\u0007r,[@\u0012CYJ4\\arJ\"td\u0015M+\u001aZ\u001d( wCD)\f+\\K<u|\u000e\u001e\u000e>y:>a\u001b\u0011Z\"qC1hOh5"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass15<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass15(Function14<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? extends R> function14) {
            super(2);
            this.$constructor = function14;
        }

        /* JADX WARN: Incorrect return type in method signature: (Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)TR; */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function2
        public final Fragment invoke(Scope fragment, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(fragment, "$this$fragment");
            Intrinsics.checkNotNullParameter(it, "it");
            Function14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, R> function14 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            Object obj = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T2");
            Object obj2 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T3");
            Object obj3 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T4");
            Object obj4 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T5");
            Object obj5 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T6");
            Object obj6 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T7");
            Object obj7 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T8");
            Object obj8 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T9");
            Object obj9 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T10");
            Object obj10 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T11");
            Object obj11 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T12");
            Object obj12 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T13");
            Object obj13 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T14");
            return (Fragment) function14.invoke((T1) obj, (T2) obj2, (T3) obj3, (T4) obj4, (T5) obj5, (T6) obj6, (T7) obj7, (T8) obj8, (T9) obj9, (T10) obj10, (T11) obj11, (T12) obj12, (T13) obj13, (T14) fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.androidx.fragment.dsl.FragmentOfKt$fragmentOf$16, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<;!&i\u0016DLcz\u0011I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007ljGӄ\\e\u000f-r[0şyzJ#\u0004$ C[Y |0\neM\bktJh\rY\u000e&\u001a~k:Lkw}\u0016\u00154PsU2msC<nyL\u0004@6(<\b\u000b\u0017\u0019JL\u0016{\tJa\u000b24FvHZ#L%\u001e\u0018\rL)\u0017\u001d|kT>Vvs9O'\trPY=^P\u0001S\u0017T`=\f\u0017e$6NDK\u0014EW\t\u0013`iU\u0002_uC\u0012v6=*qs\u0006F\t\u0004\"&CO;o9.ػ\tSf\u001f5?"}, d2 = {"\n`]<a@F])\rS", Global.BLANK, "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.D/", "\"0", "\"1", "\"2", "\"3", "\"4", "\"5", "\"6", "\"7", "\"8", "\"0\u001f", "\"0 ", "\"0!", "\"0\"", "\"0#", "\"0$", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "7s", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "7me<^,", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]/B[G&Aq\u001fwKMHk})\u0011u]A\u0007r,[@\u0012CYJ4\\arJ\"td\u0015M+\u001aZ\u001d( wCD)\f+\\K<u|\u000e\u001e\u000e>y:>a\u001b\u0011Z\"qC1hOh5"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass16<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass16(Function15<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? extends R> function15) {
            super(2);
            this.$constructor = function15;
        }

        /* JADX WARN: Incorrect return type in method signature: (Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)TR; */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function2
        public final Fragment invoke(Scope fragment, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(fragment, "$this$fragment");
            Intrinsics.checkNotNullParameter(it, "it");
            Function15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, R> function15 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            Object obj = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T2");
            Object obj2 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T3");
            Object obj3 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T4");
            Object obj4 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T5");
            Object obj5 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T6");
            Object obj6 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T7");
            Object obj7 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T8");
            Object obj8 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T9");
            Object obj9 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T10");
            Object obj10 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T11");
            Object obj11 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T12");
            Object obj12 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T13");
            Object obj13 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T14");
            Object obj14 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T15");
            return (Fragment) function15.invoke((T1) obj, (T2) obj2, (T3) obj3, (T4) obj4, (T5) obj5, (T6) obj6, (T7) obj7, (T8) obj8, (T9) obj9, (T10) obj10, (T11) obj11, (T12) obj12, (T13) obj13, (T14) obj14, (T15) fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.androidx.fragment.dsl.FragmentOfKt$fragmentOf$17, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<;!&i\u0016DLcz\u0012I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007ljGӄ\\e\u000f-r[0şyzJ#\u0004$ C[Y |0\neM\bktJh\rY\u000e&\u001a~k:Lkw}\u0016\u00154PsU2msC<nyL\u0004@6(<\b\u000b\u0017\u0019JL\u0016{\tJa\u000b24FvHZ#L%\u001e\u0018\rL)\u0017\u001d|kT>Vvs9O'\trPY=^P\u0001S\u0017T`=\f\u0017e$6NDK\u0014EW\t\u0013`iU\u0002_uC\u0012v6=*iw]Df\u0010*\u0014SO;n#*j\u0017i`::qWӍOR\u0014<\u0006\u0010"}, d2 = {"\n`]<a@F])\rS", Global.BLANK, "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.D/", "\"0", "\"1", "\"2", "\"3", "\"4", "\"5", "\"6", "\"7", "\"8", "\"0\u001f", "\"0 ", "\"0!", "\"0\"", "\"0#", "\"0$", "\"0%", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "7s", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "7me<^,", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]/B[G&Aq\u001fwKMHk})\u0011u]A\u0007r,[@\u0012CYJ4\\arJ\"td\u0015M+\u001aZ\u001d( wCD)\f+\\K<u|\u000e\u001e\u000e>y:>a\u001b\u0011Z\"qC1hOh5"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass17<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass17(Function16<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? extends R> function16) {
            super(2);
            this.$constructor = function16;
        }

        /* JADX WARN: Incorrect return type in method signature: (Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)TR; */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function2
        public final Fragment invoke(Scope fragment, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(fragment, "$this$fragment");
            Intrinsics.checkNotNullParameter(it, "it");
            Function16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, R> function16 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            Object obj = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T2");
            Object obj2 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T3");
            Object obj3 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T4");
            Object obj4 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T5");
            Object obj5 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T6");
            Object obj6 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T7");
            Object obj7 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T8");
            Object obj8 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T9");
            Object obj9 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T10");
            Object obj10 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T11");
            Object obj11 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T12");
            Object obj12 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T13");
            Object obj13 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T14");
            Object obj14 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T15");
            Object obj15 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T16");
            return (Fragment) function16.invoke((T1) obj, (T2) obj2, (T3) obj3, (T4) obj4, (T5) obj5, (T6) obj6, (T7) obj7, (T8) obj8, (T9) obj9, (T10) obj10, (T11) obj11, (T12) obj12, (T13) obj13, (T14) obj14, (T15) obj15, (T16) fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.androidx.fragment.dsl.FragmentOfKt$fragmentOf$18, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<;!&i\u0016DLcz\u0013I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007ljGӄ\\e\u000f-r[0şyzJ#\u0004$ C[Y |0\neM\bktJh\rY\u000e&\u001a~k:Lkw}\u0016\u00154PsU2msC<nyL\u0004@6(<\b\u000b\u0017\u0019JL\u0016{\tJa\u000b24FvHZ#L%\u001e\u0018\rL)\u0017\u001d|kT>Vvs9O'\trPY=^P\u0001S\u0017T`=\f\u0017e$6NDK\u0014EW\t\u0013`iU\u0002_uC\u0012v6=*iw]Df\u0010*\u0014KS\u0013l\u00017r\u0004y`:9[Sq^h\u000eV\fA\u0004Ɂ@\u0006\u0014\u001b5^"}, d2 = {"\n`]<a@F])\rS", Global.BLANK, "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.D/", "\"0", "\"1", "\"2", "\"3", "\"4", "\"5", "\"6", "\"7", "\"8", "\"0\u001f", "\"0 ", "\"0!", "\"0\"", "\"0#", "\"0$", "\"0%", "\"0&", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "7s", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "7me<^,", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]/B[G&Aq\u001fwKMHk})\u0011u]A\u0007r,[@\u0012CYJ4\\arJ\"td\u0015M+\u001aZ\u001d( wCD)\f+\\K<u|\u000e\u001e\u000e>y:>a\u001b\u0011Z\"qC1hOh5"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass18<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass18(Function17<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? extends R> function17) {
            super(2);
            this.$constructor = function17;
        }

        /* JADX WARN: Incorrect return type in method signature: (Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)TR; */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function2
        public final Fragment invoke(Scope fragment, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(fragment, "$this$fragment");
            Intrinsics.checkNotNullParameter(it, "it");
            Function17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, R> function17 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            Object obj = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T2");
            Object obj2 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T3");
            Object obj3 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T4");
            Object obj4 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T5");
            Object obj5 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T6");
            Object obj6 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T7");
            Object obj7 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T8");
            Object obj8 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T9");
            Object obj9 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T10");
            Object obj10 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T11");
            Object obj11 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T12");
            Object obj12 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T13");
            Object obj13 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T14");
            Object obj14 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T15");
            Object obj15 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T16");
            Object obj16 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T17");
            return (Fragment) function17.invoke((T1) obj, (T2) obj2, (T3) obj3, (T4) obj4, (T5) obj5, (T6) obj6, (T7) obj7, (T8) obj8, (T9) obj9, (T10) obj10, (T11) obj11, (T12) obj12, (T13) obj13, (T14) obj14, (T15) obj15, (T16) obj16, (T17) fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.androidx.fragment.dsl.FragmentOfKt$fragmentOf$19, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<;!&i\u0016DLcz\u0014I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007ljGӄ\\e\u000f-r[0şyzJ#\u0004$ C[Y |0\neM\bktJh\rY\u000e&\u001a~k:Lkw}\u0016\u00154PsU2msC<nyL\u0004@6(<\b\u000b\u0017\u0019JL\u0016{\tJa\u000b24FvHZ#L%\u001e\u0018\rL)\u0017\u001d|kT>Vvs9O'\trPY=^P\u0001S\u0017T`=\f\u0017e$6NDK\u0014EW\t\u0013`iU\u0002_uC\u0012v6=*iw]Df\u0010*\u0014KS\u0013l\u00017r\u0004qd\u001279ayJx\u000eV\u000b+\u007f\u001bP\u001c\u000e4<\u000f6ǉ\u001eh\u000e$A\f"}, d2 = {"\n`]<a@F])\rS", Global.BLANK, "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.D/", "\"0", "\"1", "\"2", "\"3", "\"4", "\"5", "\"6", "\"7", "\"8", "\"0\u001f", "\"0 ", "\"0!", "\"0\"", "\"0#", "\"0$", "\"0%", "\"0&", "\"0'", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "7s", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "7me<^,", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]/B[G&Aq\u001fwKMHk})\u0011u]A\u0007r,[@\u0012CYJ4\\arJ\"td\u0015M+\u001aZ\u001d( wCD)\f+\\K<u|\u000e\u001e\u000e>y:>a\u001b\u0011Z\"qC1hOh5"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass19<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function18<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass19(Function18<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? extends R> function18) {
            super(2);
            this.$constructor = function18;
        }

        /* JADX WARN: Incorrect return type in method signature: (Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)TR; */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function2
        public final Fragment invoke(Scope fragment, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(fragment, "$this$fragment");
            Intrinsics.checkNotNullParameter(it, "it");
            Function18<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, R> function18 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            Object obj = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T2");
            Object obj2 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T3");
            Object obj3 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T4");
            Object obj4 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T5");
            Object obj5 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T6");
            Object obj6 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T7");
            Object obj7 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T8");
            Object obj8 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T9");
            Object obj9 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T10");
            Object obj10 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T11");
            Object obj11 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T12");
            Object obj12 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T13");
            Object obj13 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T14");
            Object obj14 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T15");
            Object obj15 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T16");
            Object obj16 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T17");
            Object obj17 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T18");
            return (Fragment) function18.invoke((T1) obj, (T2) obj2, (T3) obj3, (T4) obj4, (T5) obj5, (T6) obj6, (T7) obj7, (T8) obj8, (T9) obj9, (T10) obj10, (T11) obj11, (T12) obj12, (T13) obj13, (T14) obj14, (T15) obj15, (T16) obj16, (T17) obj17, (T18) fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.androidx.fragment.dsl.FragmentOfKt$fragmentOf$2, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<;!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007tʑQ0\u000bdh6Xݷ8\u000e\u0002z\\$\n$\u0012GAT(~8\bwN\u0016i\u001fNh\u000e[\u000f4\u001a?r߽MW~b \u0015"}, d2 = {"\n`]<a@F])\rS", Global.BLANK, "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.D/", "\"0", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "7s", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "7me<^,", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]/B[G&Aq\u001fwKMHk})\u0011u]A\u0007r,[@\u0012CYJ4\\arJ\"td\u0015M+\u001aZ\u001d( wCD)\f+\\K<u|\u000e\u001e\u000e>y:>a\u001b\u0011Z\"qC1hOh5"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass2<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function1<T1, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Function1<? super T1, ? extends R> function1) {
            super(2);
            this.$constructor = function1;
        }

        /* JADX WARN: Incorrect return type in method signature: (Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)TR; */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function2
        public final Fragment invoke(Scope fragment, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(fragment, "$this$fragment");
            Intrinsics.checkNotNullParameter(it, "it");
            Function1<T1, R> function1 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            return (Fragment) function1.invoke((T1) fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.androidx.fragment.dsl.FragmentOfKt$fragmentOf$20, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<;!&i\u0016DLcz\u0015I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007ljGӄ\\e\u000f-r[0şyzJ#\u0004$ C[Y |0\neM\bktJh\rY\u000e&\u001a~k:Lkw}\u0016\u00154PsU2msC<nyL\u0004@6(<\b\u000b\u0017\u0019JL\u0016{\tJa\u000b24FvHZ#L%\u001e\u0018\rL)\u0017\u001d|kT>Vvs9O'\trPY=^P\u0001S\u0017T`=\f\u0017e$6NDK\u0014EW\t\u0013`iU\u0002_uC\u0012v6=*iw]Df\u0010*\u0014KS\u0013l\u00017r\u0004qd\u001279ayJp\u0012.\t\t\u000f#;,\u000e4;x2;/~\b<I;zՂDR\buP\u0018"}, d2 = {"\n`]<a@F])\rS", Global.BLANK, "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.D/", "\"0", "\"1", "\"2", "\"3", "\"4", "\"5", "\"6", "\"7", "\"8", "\"0\u001f", "\"0 ", "\"0!", "\"0\"", "\"0#", "\"0$", "\"0%", "\"0&", "\"0'", "\"0(", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "7s", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "7me<^,", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]/B[G&Aq\u001fwKMHk})\u0011u]A\u0007r,[@\u0012CYJ4\\arJ\"td\u0015M+\u001aZ\u001d( wCD)\f+\\K<u|\u000e\u001e\u000e>y:>a\u001b\u0011Z\"qC1hOh5"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass20<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass20(Function19<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? extends R> function19) {
            super(2);
            this.$constructor = function19;
        }

        /* JADX WARN: Incorrect return type in method signature: (Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)TR; */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function2
        public final Fragment invoke(Scope fragment, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(fragment, "$this$fragment");
            Intrinsics.checkNotNullParameter(it, "it");
            Function19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, R> function19 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            Object obj = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T2");
            Object obj2 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T3");
            Object obj3 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T4");
            Object obj4 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T5");
            Object obj5 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T6");
            Object obj6 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T7");
            Object obj7 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T8");
            Object obj8 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T9");
            Object obj9 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T10");
            Object obj10 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T11");
            Object obj11 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T12");
            Object obj12 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T13");
            Object obj13 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T14");
            Object obj14 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T15");
            Object obj15 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T16");
            Object obj16 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T17");
            Object obj17 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T18");
            Object obj18 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T19");
            return (Fragment) function19.invoke((T1) obj, (T2) obj2, (T3) obj3, (T4) obj4, (T5) obj5, (T6) obj6, (T7) obj7, (T8) obj8, (T9) obj9, (T10) obj10, (T11) obj11, (T12) obj12, (T13) obj13, (T14) obj14, (T15) obj15, (T16) obj16, (T17) obj17, (T18) obj18, (T19) fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.androidx.fragment.dsl.FragmentOfKt$fragmentOf$21, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<;!&i\u0016DLcz\u0016I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007ljGӄ\\e\u000f-r[0şyzJ#\u0004$ C[Y |0\neM\bktJh\rY\u000e&\u001a~k:Lkw}\u0016\u00154PsU2msC<nyL\u0004@6(<\b\u000b\u0017\u0019JL\u0016{\tJa\u000b24FvHZ#L%\u001e\u0018\rL)\u0017\u001d|kT>Vvs9O'\trPY=^P\u0001S\u0017T`=\f\u0017e$6NDK\u0014EW\t\u0013`iU\u0002_uC\u0012v6=*iw]Df\u0010*\u0014KS\u0013l\u00017r\u0004qd\u001279ayJp\u0012.\t\t\u000f#;$\u0012\f9VBC\u0019\u000f\b<H%vaVh\u0002\rYF\u0003ˋ:\u0019+\u0018AD"}, d2 = {"\n`]<a@F])\rS", Global.BLANK, "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.D/", "\"0", "\"1", "\"2", "\"3", "\"4", "\"5", "\"6", "\"7", "\"8", "\"0\u001f", "\"0 ", "\"0!", "\"0\"", "\"0#", "\"0$", "\"0%", "\"0&", "\"0'", "\"0(", "\"1\u001f", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "7s", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "7me<^,", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]/B[G&Aq\u001fwKMHk})\u0011u]A\u0007r,[@\u0012CYJ4\\arJ\"td\u0015M+\u001aZ\u001d( wCD)\f+\\K<u|\u000e\u001e\u000e>y:>a\u001b\u0011Z\"qC1hOh5"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass21<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function20<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass21(Function20<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? super T20, ? extends R> function20) {
            super(2);
            this.$constructor = function20;
        }

        /* JADX WARN: Incorrect return type in method signature: (Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)TR; */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function2
        public final Fragment invoke(Scope fragment, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(fragment, "$this$fragment");
            Intrinsics.checkNotNullParameter(it, "it");
            Function20<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, R> function20 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            Object obj = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T2");
            Object obj2 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T3");
            Object obj3 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T4");
            Object obj4 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T5");
            Object obj5 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T6");
            Object obj6 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T7");
            Object obj7 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T8");
            Object obj8 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T9");
            Object obj9 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T10");
            Object obj10 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T11");
            Object obj11 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T12");
            Object obj12 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T13");
            Object obj13 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T14");
            Object obj14 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T15");
            Object obj15 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T16");
            Object obj16 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T17");
            Object obj17 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T18");
            Object obj18 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T19");
            Object obj19 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T20");
            return (Fragment) function20.invoke((T1) obj, (T2) obj2, (T3) obj3, (T4) obj4, (T5) obj5, (T6) obj6, (T7) obj7, (T8) obj8, (T9) obj9, (T10) obj10, (T11) obj11, (T12) obj12, (T13) obj13, (T14) obj14, (T15) obj15, (T16) obj16, (T17) obj17, (T18) obj18, (T19) obj19, (T20) fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.androidx.fragment.dsl.FragmentOfKt$fragmentOf$22, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<;!&i\u0016DLcz\u0017I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007ljGӄ\\e\u000f-r[0şyzJ#\u0004$ C[Y |0\neM\bktJh\rY\u000e&\u001a~k:Lkw}\u0016\u00154PsU2msC<nyL\u0004@6(<\b\u000b\u0017\u0019JL\u0016{\tJa\u000b24FvHZ#L%\u001e\u0018\rL)\u0017\u001d|kT>Vvs9O'\trPY=^P\u0001S\u0017T`=\f\u0017e$6NDK\u0014EW\t\u0013`iU\u0002_uC\u0012v6=*iw]Df\u0010*\u0014KS\u0013l\u00017r\u0004qd\u001279ayJp\u0012.\t\t\u000f#;$\u0012\f9VBC\u0019\u0007\f\u0014F\u0003\bi?x\u0002\rX0~oM/%.KqAӸjSgT'h"}, d2 = {"\n`]<a@F])\rS", Global.BLANK, "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.D/", "\"0", "\"1", "\"2", "\"3", "\"4", "\"5", "\"6", "\"7", "\"8", "\"0\u001f", "\"0 ", "\"0!", "\"0\"", "\"0#", "\"0$", "\"0%", "\"0&", "\"0'", "\"0(", "\"1\u001f", "\"1 ", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "7s", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "7me<^,", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]/B[G&Aq\u001fwKMHk})\u0011u]A\u0007r,[@\u0012CYJ4\\arJ\"td\u0015M+\u001aZ\u001d( wCD)\f+\\K<u|\u000e\u001e\u000e>y:>a\u001b\u0011Z\"qC1hOh5"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass22<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function21<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass22(Function21<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? super T20, ? super T21, ? extends R> function21) {
            super(2);
            this.$constructor = function21;
        }

        /* JADX WARN: Incorrect return type in method signature: (Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)TR; */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function2
        public final Fragment invoke(Scope fragment, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(fragment, "$this$fragment");
            Intrinsics.checkNotNullParameter(it, "it");
            Function21<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, R> function21 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            Object obj = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T2");
            Object obj2 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T3");
            Object obj3 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T4");
            Object obj4 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T5");
            Object obj5 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T6");
            Object obj6 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T7");
            Object obj7 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T8");
            Object obj8 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T9");
            Object obj9 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T10");
            Object obj10 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T11");
            Object obj11 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T12");
            Object obj12 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T13");
            Object obj13 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T14");
            Object obj14 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T15");
            Object obj15 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T16");
            Object obj16 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T17");
            Object obj17 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T18");
            Object obj18 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T19");
            Object obj19 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T20");
            Object obj20 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T21");
            return (Fragment) function21.invoke((T1) obj, (T2) obj2, (T3) obj3, (T4) obj4, (T5) obj5, (T6) obj6, (T7) obj7, (T8) obj8, (T9) obj9, (T10) obj10, (T11) obj11, (T12) obj12, (T13) obj13, (T14) obj14, (T15) obj15, (T16) obj16, (T17) obj17, (T18) obj18, (T19) obj19, (T20) obj20, (T21) fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.androidx.fragment.dsl.FragmentOfKt$fragmentOf$23, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<;!&i\u0016DLcz\u0018I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007ljGӄ\\e\u000f-r[0şyzJ#\u0004$ C[Y |0\neM\bktJh\rY\u000e&\u001a~k:Lkw}\u0016\u00154PsU2msC<nyL\u0004@6(<\b\u000b\u0017\u0019JL\u0016{\tJa\u000b24FvHZ#L%\u001e\u0018\rL)\u0017\u001d|kT>Vvs9O'\trPY=^P\u0001S\u0017T`=\f\u0017e$6NDK\u0014EW\t\u0013`iU\u0002_uC\u0012v6=*iw]Df\u0010*\u0014KS\u0013l\u00017r\u0004qd\u001279ayJp\u0012.\t\t\u000f#;$\u0012\f9VBC\u0019\u0007\f\u0014F\u0003\bi?p\u0006dV\u000e\u0011w5?%.J[=)~iai2\u0015?߉\t\u000f$=\u000f\n"}, d2 = {"\n`]<a@F])\rS", Global.BLANK, "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.D/", "\"0", "\"1", "\"2", "\"3", "\"4", "\"5", "\"6", "\"7", "\"8", "\"0\u001f", "\"0 ", "\"0!", "\"0\"", "\"0#", "\"0$", "\"0%", "\"0&", "\"0'", "\"0(", "\"1\u001f", "\"1 ", "\"1!", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "7s", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "7me<^,", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]/B[G&Aq\u001fwKMHk})\u0011u]A\u0007r,[@\u0012CYJ4\\arJ\"td\u0015M+\u001aZ\u001d( wCD)\f+\\K<u|\u000e\u001e\u000e>y:>a\u001b\u0011Z\"qC1hOh5"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass23<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function22<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass23(Function22<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? super T20, ? super T21, ? super T22, ? extends R> function22) {
            super(2);
            this.$constructor = function22;
        }

        /* JADX WARN: Incorrect return type in method signature: (Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)TR; */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function2
        public final Fragment invoke(Scope fragment, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(fragment, "$this$fragment");
            Intrinsics.checkNotNullParameter(it, "it");
            Function22<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, R> function22 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            Object obj = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T2");
            Object obj2 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T3");
            Object obj3 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T4");
            Object obj4 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T5");
            Object obj5 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T6");
            Object obj6 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T7");
            Object obj7 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T8");
            Object obj8 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T9");
            Object obj9 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T10");
            Object obj10 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T11");
            Object obj11 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T12");
            Object obj12 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T13");
            Object obj13 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T14");
            Object obj14 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T15");
            Object obj15 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T16");
            Object obj16 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T17");
            Object obj17 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T18");
            Object obj18 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T19");
            Object obj19 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T20");
            Object obj20 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T21");
            Object obj21 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T22");
            return (Fragment) function22.invoke((T1) obj, (T2) obj2, (T3) obj3, (T4) obj4, (T5) obj5, (T6) obj6, (T7) obj7, (T8) obj8, (T9) obj9, (T10) obj10, (T11) obj11, (T12) obj12, (T13) obj13, (T14) obj14, (T15) obj15, (T16) obj16, (T17) obj17, (T18) obj18, (T19) obj19, (T20) obj20, (T21) obj21, (T22) fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.androidx.fragment.dsl.FragmentOfKt$fragmentOf$3, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<;!&i\u0016DLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007ljGӄ\\e\u000f-r[0şyzJ#\u0004$ C[Y |0\neM\bktJh\rY\u000e.\u0016'm\\Mc|u\u0012=7\twУ7OuCGg"}, d2 = {"\n`]<a@F])\rS", Global.BLANK, "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.D/", "\"0", "\"1", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "7s", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "7me<^,", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]/B[G&Aq\u001fwKMHk})\u0011u]A\u0007r,[@\u0012CYJ4\\arJ\"td\u0015M+\u001aZ\u001d( wCD)\f+\\K<u|\u000e\u001e\u000e>y:>a\u001b\u0011Z\"qC1hOh5"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass3<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function2<T1, T2, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(Function2<? super T1, ? super T2, ? extends R> function2) {
            super(2);
            this.$constructor = function2;
        }

        /* JADX WARN: Incorrect return type in method signature: (Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)TR; */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function2
        public final Fragment invoke(Scope fragment, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(fragment, "$this$fragment");
            Intrinsics.checkNotNullParameter(it, "it");
            Function2<T1, T2, R> function2 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            Object obj = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T2");
            return (Fragment) function2.invoke((T1) obj, (T2) fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.androidx.fragment.dsl.FragmentOfKt$fragmentOf$4, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<;!&i\u0016DLcz\u0005I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007ljGӄ\\e\u000f-r[0şyzJ#\u0004$ C[Y |0\neM\bktJh\rY\u000e&\u001a~k:Lkw\u0006\u0012=6rsM8eok?'|ȥ\t\"8)F\u0002"}, d2 = {"\n`]<a@F])\rS", Global.BLANK, "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.D/", "\"0", "\"1", "\"2", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "7s", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "7me<^,", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]/B[G&Aq\u001fwKMHk})\u0011u]A\u0007r,[@\u0012CYJ4\\arJ\"td\u0015M+\u001aZ\u001d( wCD)\f+\\K<u|\u000e\u001e\u000e>y:>a\u001b\u0011Z\"qC1hOh5"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass4<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function3<T1, T2, T3, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(Function3<? super T1, ? super T2, ? super T3, ? extends R> function3) {
            super(2);
            this.$constructor = function3;
        }

        /* JADX WARN: Incorrect return type in method signature: (Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)TR; */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function2
        public final Fragment invoke(Scope fragment, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(fragment, "$this$fragment");
            Intrinsics.checkNotNullParameter(it, "it");
            Function3<T1, T2, T3, R> function3 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            Object obj = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T2");
            Object obj2 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T3");
            return (Fragment) function3.invoke((T1) obj, (T2) obj2, (T3) fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.androidx.fragment.dsl.FragmentOfKt$fragmentOf$5, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<;!&i\u0016DLcz\u0006I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007ljGӄ\\e\u000f-r[0şyzJ#\u0004$ C[Y |0\neM\bktJh\rY\u000e&\u001a~k:Lkw}\u0016\u00154PsU2uok>\u0011xD\u000b82P?@\rв\u001e,N\u0018\u0005\u0004"}, d2 = {"\n`]<a@F])\rS", Global.BLANK, "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.D/", "\"0", "\"1", "\"2", "\"3", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "7s", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "7me<^,", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]/B[G&Aq\u001fwKMHk})\u0011u]A\u0007r,[@\u0012CYJ4\\arJ\"td\u0015M+\u001aZ\u001d( wCD)\f+\\K<u|\u000e\u001e\u000e>y:>a\u001b\u0011Z\"qC1hOh5"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass5<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function4<T1, T2, T3, T4, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(Function4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> function4) {
            super(2);
            this.$constructor = function4;
        }

        /* JADX WARN: Incorrect return type in method signature: (Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)TR; */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function2
        public final Fragment invoke(Scope fragment, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(fragment, "$this$fragment");
            Intrinsics.checkNotNullParameter(it, "it");
            Function4<T1, T2, T3, T4, R> function4 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            Object obj = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T2");
            Object obj2 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T3");
            Object obj3 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T4");
            return (Fragment) function4.invoke((T1) obj, (T2) obj2, (T3) obj3, (T4) fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.androidx.fragment.dsl.FragmentOfKt$fragmentOf$6, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<;!&i\u0016DLcz\u0007I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007ljGӄ\\e\u000f-r[0şyzJ#\u0004$ C[Y |0\neM\bktJh\rY\u000e&\u001a~k:Lkw}\u0016\u00154PsU2msC<nyL\u0004H2P>*\t\u000f!BH>~AKƚ\u0010\u00146I~D"}, d2 = {"\n`]<a@F])\rS", Global.BLANK, "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.D/", "\"0", "\"1", "\"2", "\"3", "\"4", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "7s", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "7me<^,", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]/B[G&Aq\u001fwKMHk})\u0011u]A\u0007r,[@\u0012CYJ4\\arJ\"td\u0015M+\u001aZ\u001d( wCD)\f+\\K<u|\u000e\u001e\u000e>y:>a\u001b\u0011Z\"qC1hOh5"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass6<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function5<T1, T2, T3, T4, T5, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass6(Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> function5) {
            super(2);
            this.$constructor = function5;
        }

        /* JADX WARN: Incorrect return type in method signature: (Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)TR; */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function2
        public final Fragment invoke(Scope fragment, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(fragment, "$this$fragment");
            Intrinsics.checkNotNullParameter(it, "it");
            Function5<T1, T2, T3, T4, T5, R> function5 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            Object obj = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T2");
            Object obj2 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T3");
            Object obj3 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T4");
            Object obj4 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T5");
            return (Fragment) function5.invoke((T1) obj, (T2) obj2, (T3) obj3, (T4) obj4, (T5) fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.androidx.fragment.dsl.FragmentOfKt$fragmentOf$7, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<;!&i\u0016DLcz\bI\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007ljGӄ\\e\u000f-r[0şyzJ#\u0004$ C[Y |0\neM\bktJh\rY\u000e&\u001a~k:Lkw}\u0016\u00154PsU2msC<nyL\u0004@6(<\b\u000b\u0017\u0019RH>}+GY\u0014*0ny\u0001ZҫQ\u0007 \u001c\u0014I"}, d2 = {"\n`]<a@F])\rS", Global.BLANK, "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.D/", "\"0", "\"1", "\"2", "\"3", "\"4", "\"5", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "7s", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "7me<^,", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]/B[G&Aq\u001fwKMHk})\u0011u]A\u0007r,[@\u0012CYJ4\\arJ\"td\u0015M+\u001aZ\u001d( wCD)\f+\\K<u|\u000e\u001e\u000e>y:>a\u001b\u0011Z\"qC1hOh5"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass7<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function6<T1, T2, T3, T4, T5, T6, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass7(Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> function6) {
            super(2);
            this.$constructor = function6;
        }

        /* JADX WARN: Incorrect return type in method signature: (Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)TR; */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function2
        public final Fragment invoke(Scope fragment, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(fragment, "$this$fragment");
            Intrinsics.checkNotNullParameter(it, "it");
            Function6<T1, T2, T3, T4, T5, T6, R> function6 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            Object obj = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T2");
            Object obj2 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T3");
            Object obj3 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T4");
            Object obj4 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T5");
            Object obj5 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T6");
            return (Fragment) function6.invoke((T1) obj, (T2) obj2, (T3) obj3, (T4) obj4, (T5) obj5, (T6) fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.androidx.fragment.dsl.FragmentOfKt$fragmentOf$8, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<;!&i\u0016DLcz\tI\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007ljGӄ\\e\u000f-r[0şyzJ#\u0004$ C[Y |0\neM\bktJh\rY\u000e&\u001a~k:Lkw}\u0016\u00154PsU2msC<nyL\u0004@6(<\b\u000b\u0017\u0019JL\u0016{\tJa\u000b:0nxjV\u001bV\u001d\u001a@\u0010\u0005(Ә\"^mYDT"}, d2 = {"\n`]<a@F])\rS", Global.BLANK, "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.D/", "\"0", "\"1", "\"2", "\"3", "\"4", "\"5", "\"6", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "7s", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "7me<^,", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]/B[G&Aq\u001fwKMHk})\u0011u]A\u0007r,[@\u0012CYJ4\\arJ\"td\u0015M+\u001aZ\u001d( wCD)\f+\\K<u|\u000e\u001e\u000e>y:>a\u001b\u0011Z\"qC1hOh5"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass8<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function7<T1, T2, T3, T4, T5, T6, T7, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass8(Function7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> function7) {
            super(2);
            this.$constructor = function7;
        }

        /* JADX WARN: Incorrect return type in method signature: (Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)TR; */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function2
        public final Fragment invoke(Scope fragment, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(fragment, "$this$fragment");
            Intrinsics.checkNotNullParameter(it, "it");
            Function7<T1, T2, T3, T4, T5, T6, T7, R> function7 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            Object obj = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T2");
            Object obj2 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T3");
            Object obj3 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T4");
            Object obj4 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T5");
            Object obj5 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T6");
            Object obj6 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T7");
            return (Fragment) function7.invoke((T1) obj, (T2) obj2, (T3) obj3, (T4) obj4, (T5) obj5, (T6) obj6, (T7) fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.androidx.fragment.dsl.FragmentOfKt$fragmentOf$9, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<;!&i\u0016DLcz\nI\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007ljGӄ\\e\u000f-r[0şyzJ#\u0004$ C[Y |0\neM\bktJh\rY\u000e&\u001a~k:Lkw}\u0016\u00154PsU2msC<nyL\u0004@6(<\b\u000b\u0017\u0019JL\u0016{\tJa\u000b24FvHZ#L-\u001a@\u000fn$\u000f(tg|A\u000ftҺ>1)\u000fwO"}, d2 = {"\n`]<a@F])\rS", Global.BLANK, "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.D/", "\"0", "\"1", "\"2", "\"3", "\"4", "\"5", "\"6", "\"7", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "7s", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "7me<^,", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]/B[G&Aq\u001fwKMHk})\u0011u]A\u0007r,[@\u0012CYJ4\\arJ\"td\u0015M+\u001aZ\u001d( wCD)\f+\\K<u|\u000e\u001e\u000e>y:>a\u001b\u0011Z\"qC1hOh5"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass9<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function8<T1, T2, T3, T4, T5, T6, T7, T8, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass9(Function8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> function8) {
            super(2);
            this.$constructor = function8;
        }

        /* JADX WARN: Incorrect return type in method signature: (Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)TR; */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function2
        public final Fragment invoke(Scope fragment, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(fragment, "$this$fragment");
            Intrinsics.checkNotNullParameter(it, "it");
            Function8<T1, T2, T3, T4, T5, T6, T7, T8, R> function8 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            Object obj = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T2");
            Object obj2 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T3");
            Object obj3 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T4");
            Object obj4 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T5");
            Object obj5 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T6");
            Object obj6 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T7");
            Object obj7 = fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T8");
            return (Fragment) function8.invoke((T1) obj, (T2) obj2, (T3) obj3, (T4) obj4, (T5) obj5, (T6) obj6, (T7) obj7, (T8) fragment.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    public static final /* synthetic */ <R extends Fragment> KoinDefinition<R> fragmentOf(Module module, Function0<? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.Companion.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass1, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R extends Fragment, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> KoinDefinition<R> fragmentOf(Module module, Function10<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass11 anonymousClass11 = new AnonymousClass11(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.Companion.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass11, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R extends Fragment, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> KoinDefinition<R> fragmentOf(Module module, Function11<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass12 anonymousClass12 = new AnonymousClass12(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.Companion.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass12, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R extends Fragment, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> KoinDefinition<R> fragmentOf(Module module, Function12<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass13 anonymousClass13 = new AnonymousClass13(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.Companion.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass13, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R extends Fragment, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> KoinDefinition<R> fragmentOf(Module module, Function13<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass14 anonymousClass14 = new AnonymousClass14(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.Companion.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass14, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R extends Fragment, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> KoinDefinition<R> fragmentOf(Module module, Function14<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass15 anonymousClass15 = new AnonymousClass15(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.Companion.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass15, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R extends Fragment, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> KoinDefinition<R> fragmentOf(Module module, Function15<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass16 anonymousClass16 = new AnonymousClass16(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.Companion.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass16, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R extends Fragment, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> KoinDefinition<R> fragmentOf(Module module, Function16<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass17 anonymousClass17 = new AnonymousClass17(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.Companion.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass17, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R extends Fragment, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> KoinDefinition<R> fragmentOf(Module module, Function17<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass18 anonymousClass18 = new AnonymousClass18(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.Companion.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass18, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R extends Fragment, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> KoinDefinition<R> fragmentOf(Module module, Function18<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass19 anonymousClass19 = new AnonymousClass19(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.Companion.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass19, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R extends Fragment, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> KoinDefinition<R> fragmentOf(Module module, Function19<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass20 anonymousClass20 = new AnonymousClass20(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.Companion.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass20, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R extends Fragment, T1> KoinDefinition<R> fragmentOf(Module module, Function1<? super T1, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.Companion.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass2, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R extends Fragment, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> KoinDefinition<R> fragmentOf(Module module, Function20<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? super T20, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass21 anonymousClass21 = new AnonymousClass21(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.Companion.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass21, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R extends Fragment, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> KoinDefinition<R> fragmentOf(Module module, Function21<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? super T20, ? super T21, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass22 anonymousClass22 = new AnonymousClass22(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.Companion.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass22, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R extends Fragment, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> KoinDefinition<R> fragmentOf(Module module, Function22<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? super T20, ? super T21, ? super T22, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass23 anonymousClass23 = new AnonymousClass23(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.Companion.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass23, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R extends Fragment, T1, T2> KoinDefinition<R> fragmentOf(Module module, Function2<? super T1, ? super T2, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.Companion.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass3, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R extends Fragment, T1, T2, T3> KoinDefinition<R> fragmentOf(Module module, Function3<? super T1, ? super T2, ? super T3, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.Companion.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass4, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R extends Fragment, T1, T2, T3, T4> KoinDefinition<R> fragmentOf(Module module, Function4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass5 anonymousClass5 = new AnonymousClass5(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.Companion.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass5, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R extends Fragment, T1, T2, T3, T4, T5> KoinDefinition<R> fragmentOf(Module module, Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass6 anonymousClass6 = new AnonymousClass6(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.Companion.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass6, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R extends Fragment, T1, T2, T3, T4, T5, T6> KoinDefinition<R> fragmentOf(Module module, Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass7 anonymousClass7 = new AnonymousClass7(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.Companion.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass7, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R extends Fragment, T1, T2, T3, T4, T5, T6, T7> KoinDefinition<R> fragmentOf(Module module, Function7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass8 anonymousClass8 = new AnonymousClass8(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.Companion.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass8, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R extends Fragment, T1, T2, T3, T4, T5, T6, T7, T8> KoinDefinition<R> fragmentOf(Module module, Function8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass9 anonymousClass9 = new AnonymousClass9(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.Companion.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass9, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static final /* synthetic */ <R extends Fragment, T1, T2, T3, T4, T5, T6, T7, T8, T9> KoinDefinition<R> fragmentOf(Module module, Function9<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass10 anonymousClass10 = new AnonymousClass10(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.Companion.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass10, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition fragmentOf$default(Module module, Function0 constructor, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.Companion.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass1, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition fragmentOf$default(Module module, Function10 constructor, Function1 function1, int i2, Object obj) {
        if ((i2 + 2) - (i2 | 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass11 anonymousClass11 = new AnonymousClass11(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.Companion.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass11, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition fragmentOf$default(Module module, Function11 constructor, Function1 function1, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass12 anonymousClass12 = new AnonymousClass12(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.Companion.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass12, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition fragmentOf$default(Module module, Function12 constructor, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass13 anonymousClass13 = new AnonymousClass13(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.Companion.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass13, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition fragmentOf$default(Module module, Function13 constructor, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass14 anonymousClass14 = new AnonymousClass14(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.Companion.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass14, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition fragmentOf$default(Module module, Function14 constructor, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass15 anonymousClass15 = new AnonymousClass15(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.Companion.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass15, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition fragmentOf$default(Module module, Function15 constructor, Function1 function1, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass16 anonymousClass16 = new AnonymousClass16(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.Companion.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass16, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition fragmentOf$default(Module module, Function16 constructor, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass17 anonymousClass17 = new AnonymousClass17(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.Companion.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass17, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition fragmentOf$default(Module module, Function17 constructor, Function1 function1, int i2, Object obj) {
        if ((i2 + 2) - (i2 | 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass18 anonymousClass18 = new AnonymousClass18(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.Companion.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass18, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition fragmentOf$default(Module module, Function18 constructor, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass19 anonymousClass19 = new AnonymousClass19(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.Companion.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass19, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition fragmentOf$default(Module module, Function19 constructor, Function1 function1, int i2, Object obj) {
        if ((i2 + 2) - (i2 | 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass20 anonymousClass20 = new AnonymousClass20(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.Companion.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass20, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition fragmentOf$default(Module module, Function1 constructor, Function1 function1, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.Companion.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass2, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition fragmentOf$default(Module module, Function20 constructor, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass21 anonymousClass21 = new AnonymousClass21(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.Companion.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass21, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition fragmentOf$default(Module module, Function21 constructor, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass22 anonymousClass22 = new AnonymousClass22(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.Companion.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass22, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition fragmentOf$default(Module module, Function22 constructor, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass23 anonymousClass23 = new AnonymousClass23(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.Companion.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass23, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition fragmentOf$default(Module module, Function2 constructor, Function1 function1, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.Companion.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass3, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition fragmentOf$default(Module module, Function3 constructor, Function1 function1, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.Companion.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass4, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition fragmentOf$default(Module module, Function4 constructor, Function1 function1, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass5 anonymousClass5 = new AnonymousClass5(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.Companion.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass5, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition fragmentOf$default(Module module, Function5 constructor, Function1 function1, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass6 anonymousClass6 = new AnonymousClass6(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.Companion.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass6, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition fragmentOf$default(Module module, Function6 constructor, Function1 function1, int i2, Object obj) {
        if ((i2 + 2) - (i2 | 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass7 anonymousClass7 = new AnonymousClass7(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.Companion.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass7, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition fragmentOf$default(Module module, Function7 constructor, Function1 function1, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass8 anonymousClass8 = new AnonymousClass8(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.Companion.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass8, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition fragmentOf$default(Module module, Function8 constructor, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass9 anonymousClass9 = new AnonymousClass9(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.Companion.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass9, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }

    public static /* synthetic */ KoinDefinition fragmentOf$default(Module module, Function9 constructor, Function1 function1, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass10 anonymousClass10 = new AnonymousClass10(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.Companion.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass10, kind, listEmptyList));
        module.indexPrimaryType(factoryInstanceFactory);
        return OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), function1);
    }
}
