package org.koin.core.module.dsl;

import com.dynatrace.android.agent.Global;
import defpackage.Architecture;
import kotlin.Metadata;
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
import kotlin.jvm.internal.Reflection;
import org.koin.core.scope.Scope;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message end-group tag did not match expected tag.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidEndTag(InvalidProtocolBufferException.java:94)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.checkLastTagWas(CodedInputStream.java:180)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:194)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яŉ\u0014D5'\u001eq\u007fZDkŞ\fA\u001c0\u0013.H~*,(w\u000ffp98D{H6RY*\u0017k\u00124,[*qK;k\u001a\u0006\"\u000fOVg}nRZ\u0011C\u0017\u0006,xr,OU\u0001](\u000f:Bu?;M\u0006=A`z6\r H\"@y\u000b\u0001\"*^\u0010~zIK\u0014\u0012F@x:X\rU\u00050\u0012\u000e>&\u0001&\\}N>Hr]B/9\u0003qBT'g0\u0013M\u0015FZ'\u0015vw\u001e3@=5\u001d%i\u0003\u000fRa?\u000b?\b=\rh-'3I\nW>X\u0006\u0014\u001d+e\rer,\\\rQv\f/+UcSP$(\u007fz\u0002\rT-\u001cͺ?Ht,:j\u000eԄAs\tRhP0^r\n\tbN\u001d5\u0002C+\u007f\u001a\u0015S(ݩ\u001fل6ަ˿\u0011\u001e1\u0004\u0007Xi٪&`[\u001at{Wĸ_?SGn\u000e_<{\b\u0007a**20w\u0010=|):''G[\u007f'1m\u0012H\u000bf%\n'ìYؘQ̲غ&n$=BN\u001aɮ\\dKjpX^\u008c\u001fL2S'\u0002\u000e\u0012.`\u000e;A)\u0016N]o\u007fiu]8%_|EZ\u0007}\u001eYI^y9ae a\u0019}$ALbKW\u0015J\u001aە`ۛ'ίĘLj\u001e\u0001\u0014\u0018\\ۼ+2\u0006p<82ջ'[+G#\"H@\u000b\ruY\t\u0014\u0005TA+\u0019hDx\u000f\u0002^f\u0007n\u0010xw,-|0.YiE\u001b6UhlD~3\u0007Ez\u0010IwL\u000eV|\u0018\u0006UB\u001fD%\u007f֞5̈́\u0012Áɒ-2\u00109].\u0001όiMX&\u001b\u0001\u007fҸIgDf(nv+nn`Nt\u001b(vly9\u0007\u0005\u0004\u007fbT\u0005]bt\u000fa@W\u007f\u0019XdNf|5A,&\u0019\u000e2~E-\n+-\u0018\b\u0014u\u001cq_yot\u0004r\u00116t,\u0011<e&o)P\f@\u0002ͶO̫}Жѐ(l\u0011Q`Z\u0006٤Z\tz\fSLGЬ~UNL+3\u0004e\u00150#ov_@\u0013}\u0005J-\u007f.yD\f\u001etBE\u0015SUuz\u0004J|\u000fP\u0012\u0018\u001b\u00120\u0017\u0012J=P~ec!T\u0016u(6\b?r\u0007L\tj;<>\u0018\u000b\n^y\b zFSo\u0011'2\t\u0004KX\u001eT?[\u0005YKށKɰ ơܣ\u0003\u000fA0\u00113?܊\u0006F\u001b.\u00046\u0007ҵ+\b1io\u0003l$9Hj8;,^\u0001\u0019LsBi\u0006<\u0005U3\u0004j\u0010\u0010>\u001a\u000b*X\u0017;=W\u0014m\u0007F]+YjRr\n(ezNP)/)\u000b\u000fT4\u001f\r)O9sr/\\N>>S\u001c\u0011\u0017\u000b3\u0017\u000e\rc\r(=\bE-\u0004Yz\u00167{\u001efK\u007f\u0018 f&2\tgƿ]̣eŊܤ\u001f:$\u0007.Ȗ\u0001\u0017ސh J-jxx˖<\u0007LN\"7\b\u0012l]\u0002vAD-+z\rXJ\t|\u0010dzm\u0005T+\u0007l3d\u0007\u0005,p!\u000f*[>)Wz>\u0017W.k'~4\u0019,$D\u001ex(8O\u0012h! ]\\%[?m:aw4b \u000e\u001f@|\u0014,d([EfONdOi|Dg\u000e%z8f\u0005\fo'\r\u0001X^W)DH\u0003\u001e+.e0eˁ\u0013Պ_ԂʺII49Iĸ>)ΠJ\u000b6'\u0017\u0015\ťps\u0016)b\rx~u0CEtA 'g+\u0004c#*QFFL\u001e+1\u0012\u00171hE6=|\u001e\">_CW\u00181\u0005\u001b<\u0014\u0003\u001d\u0018UnWX3@\u0017{!\u0011E\u007f?\u0005Pr_rQ/?*)X~q57uLm\u0010\u0012gZ~\u0014jf\u0011q,\u0010?U \nU\u0007\r\u001a!4$L\u00063\u0002U1\u000f=o^PV:m\u0014(:65]3I|x:\tZ\u0004^ļjא`Ūф~\u0014'_VЊ,z؋]M/x+H\u0013ҵ\"6%\u0005I7\u001d{\u001eS\b?KMxM=cs;3w\n;@kLxgD_,\u0014:(S\u0004npp_o&72\u0011\u0013\b\u0006Dh_ d#\u001d5a\rEV`~SO{!?/(d5P(!\u0005>.v\u00172>Xa-OCI\u0004A\u000e\u0016f}1\u001dWb5\b5g1QOW\u0002X\u0004FC\r}J\u001fEu^\u0015Ug^t-%\u007f1A>If>`Ch\b\u001eE+d F\tDnl^Mvɶ\u0005ØBיԀ \u001fKs-ן}@ďO[+\u0010K;]֙`T9,\u0019\u0006\t\u000fO\u001d)\n>W?21z#0^\u007f\u000e]W_\u0013li\u0014\tcX.E\u0005_3GNzf{>9[E\u0003\u001a3=#&\u0017*gu)\u007f\rBc\tRDo?Gk]\u0017mP\u0007%y\u0015\u00104\u0014Ft\u001c<.\u0011\u0011\u001ce\u0002mADp\u0001\u000bWO1\u007f:g\u007ff;`]G;u_HAs!c\u0016l$pa\\\u001fN'Y6@Y\u0015*\u001f6aB^92'U*\u0007zud`WuDm@d@\u0012vfNc\u0005;v\r_ʧÙ\u001aЪɥf\tn\u0012`Ƭ\u000fp۪D'|G\u000b\u001d\u0007ͻY`-\u0013WH|\"u7P!\u0002&Y]3N`\u0005.ngx#\u0006s2V\u0011u.\u000b\"\u001b=\u0007v\no\u0013]F\u0003\f38JhS2,z+sm\u0016@$\u000b\u001d\t2takgt?vj\u00061:0@w=M)!\"/;(6Sa\t\u0011n[M.*\u0006O^P|M5Qu\f3\u001eu_6m\u001eo\u0005yy0\r2\u001c\u0014eZ#\u0016vr\u0013m.\u0014\b\u0017[LY\b\u0015\u001a$9$N+7\u0004X4\u0011K2%\u0011\u000f|4Zh~xk(u\u000e?t<0BoNs-\\\u0016W\bǶ[Դ}ЧԿ3q\u0016oa\u0558}9·&I\\9oPsץi<j\u0015R\u000bu\u0003?\u0014\n_{F\u001dw\u0016iJjZ\u007fM\u0004\"ta-:^lpz\u0004f`0A\u001c\u0010\"\u0015TrI'F)ms}~[\rv\"Eg[c+H\u0017.nKT\u0011/L^m\u001c7\u0018\u0004kh \u001eGd\u000f?k\u0019a\ru\u0006g!\bLq2=/\u000e\u0015^\u001d.5i_\u0002Qv\u0004w`\u0019Ui\u00127p_\b87BImZf9k\n\u001eJ-Y`\u000fQ\u00073>\u0007x\u0003\u0017\u0006(\u0012,U\"cYu\u001bw\u0005|\u0006K_xS+\u0017.pk[mO\u000e\b1\u0013\bA&\u00104\bF\u001ak6_uG?v9R˗IɁ\u0007á֝iL\u0013\\\"Ӏ0M؎\t\u0019qv\u007fbHѪ\u001b$7'+\u001c.`z\u0017\u0006\u0014H&I\u0013\u0005\"\u0004\b0 O&\u00177gu\u001b\u001e8\u0012.b&>*\u0017ha\u0006\u00107HP4y\r[_\u0004|Nnuo\u0006t&N\u0012@c\u0005\u0006O['0*XB\"~rCG_.L%-4\u001eJ(8\u0015|R1[\t\u0002u\u0001`\b(_Tr;cN]A\")&/\u00019{k,,\u0013iWVdUj\u0007RS\u0012%{Nk\r\bw'\u0014\b[ex)IK\n!2DP$:bZ7u\u000e\u001dL\u0017C*8o<hRL\u001d\u00040E3!BztJNV\u0013\u0003\t7SBKo\\eQn+\u0001k@W`TQM5.H@l͖g̨\"Ƨӱ&\u001cS\u0012Uӷ$#ռ7jRs#!;ֈj]@>\"\n*\u0013P\u0003LocnDu*;*sBfo5<LxNJ\u001a\u0018g\\4mp\u0005\u0017g7\fJc\u0019\"bO\u000b\u001b99,+\u001f0\bZZg2\rgM[\u0005u#\u000eQAoN>h\fy\u001e 8yN\u0017\t`\f:K\t&KZHQ6\b\u0016^q\u0006{PM\u0018W\u0019j(\u0012RD$\f)\u0002|H\\H$\\fKkEAX\u001ehFm\u0005\u0010]Gf.L=-az~:\u0001fh#?]\u001f&~\u000f<4u\u0015g6#pY\u0010UCaBmcl\u001fH]Kt6R\u0014e'.,d Q*_iD\u001e~n\tH^E(*>$*bn5>r\u007fP\u0001\u0004\u0011_V9\u0002\u001c\"\u0001'ӒwƥuɱŗThEC#ռ1Q֘w^g,\u007f\u000f\u0019\u008a+R)R\"U3QI;]X([Ll\u001655D\n#u\u0006FxUJ\u000b\u001a-Ae\u0005q_JD\n\u00066%Z\u001fF\u0016-\u0011LP4u4:-\n\u0019mfc\"vP #\u0005f\bW\u0016KDQqvZ\u0012?+fX+'$F3\u000f#7\n\u0003%\u0015\u0019tn\u001avO\\P5Vm\u0018\u0012gl0~\u0003(BA8X2E\u001c(vOOF\u0010Ia54r^Q\b_AZ\u0005k4fh\u0016B\u0003dJJz\u0018j\u001fn)}hn)S;a>F_ 2/:f>c9;0b/\u0017\u0006tie\\w7tG]E\u001c\u007fiUf\u000ed]g0u\u0019\u001d,[dlU\u0010\tVU<+\u001fR.RL=K\u001c\u000e`f~MJM\n(3'sX7ƁbОI˂ͺ\u0015\u0011\u0002\u000b\u0015Ϩ~nɜV\u001d:5'\u001f\u0019ˈ%y p-]>\f\u0003:[Lye'2oA\u000bj!7!\u0014\u0012\u001eE\u0013|_n~8\u0003\u007f\u000bL4*FyQe$A\u0015)p\u001aJ__\u001b}ff8Y\u001d\u0004F\u001bM\u0007X\r^m!DfudS^&Nzx\u000f1+\u0003\u00194oV6g\u0018|\u001c\u0006<\n\u0007!\u0003Zal\u0011\u001728U#\u001bj\rSUafG%,\u0018A*a\u007f\b\u0003N\u0012x\u001f@0\u0016\u001d^uta%N\u0006=])mk\u001bN|8\u0016\u0011ZT9\u000b@}%LWMlS\u0005\u0005%Qm!7\u000eA\u0017@\u001f\rp,W=\u0004 ff\bT\u0010]\b^\b[;1a2 \u0006wgd]a[\u0014+\u007f\b%B\u0002U(1\r~\u000bT\u0016:DN]elUy+8v\u001e\r@5OtnTU\u001b\u0012bg\u0001\u001el|BؠTÂcí٨j\\3\u007fe\u03801@î\u0017\u0013\n!!CA҉\u0006W|@\u0016h\u0001\\5\u0017Ay{\u0013\u00015USrdC8f\u001e!W8R}\u0016@\u0016}\"\u0014~($N\u001b\u000f=d1EGq'\u007f\u001cXocSt]v\r4v\u0003f0K\u0015 <5h&1\u001a;-\u0019\u0003\u00035Z\u0003wfe\u00195+N4\u001d8-lp\u0011c\"Ud]R\u0005\"=\u000bm\u0010a\u00114,2;\u001eHcg\u0010.|+;]d\u0015\u001e\"|\u007f#Xf#46X\u000e\u000bXN\u0019P\u0002BEL\u000evd\u0014x=RK;O\u0012^Y\u0001\u0005wf\u0005q\u0003ee\\\u001bCr\u0006ENX3)+\u0018N/ttDqxBLS\u0012dE@+J\t5R4e{\u0005?\u0014gi)cq\u0013NcUDxd\u0016-\u001a\nVOh:);)\u007fhp#nE\u007fYBxt\t\u001d\u0019\u0012A(SD`lM;\u0007\u0003\u000f(\u0001+\u000e,]%cћ\u0013Ȍ\u0017ۑץ:#C\u0019[ʆAJĳ\u0012:O\"5P!Ӎ\u00183X\u001c\u001b\u0015\u0002;WRvdc7g@\u0004w\u00195\u007fYBS\u0002^7!I7p>.[~3FIq(a;9\u0012?v\u0016}\u0019,Wy\u0006g3K\u0017\u001f?8g\u0006Sy\\\r!\u0002C7\u001d\u0003\u0019\b\u0005:IIoTA52nt5E~vC\u00025$C_(\u0010\u000ff\u00122/27 Fd\u0007qM^J}[fY\u001cc\u001e#Dt\tCS_z\u0011\fU\\zji||\nra\u000441RbHt\u001f\u000eyU#\u0002cw#R,./\u0018\u001dCi\t4ayD\u0002T\u0003cGv.P=\b&jj\u0001P\u0016aJ!:\"?6d6\u0017#{ik^Z[\u00171\u0004RZ\u0007D\u0018lsH?Q\tV\u0001{\u0015Ykz[t18\u0001 \u0013;5\u0012:.\u001bS\"\u0014bl\u0004jOQ\u0010I\u001axz\u0012A1g!\u001d\u0014IwM\fSW\u0016l\fzM'\u0018\\1F&'Eځ1ݹĉގ\u0018zM\u0004wӯeTѾ|\"\\PDP&ҹ\u000bSJTdDRS\u001dbYp):/G}N\u000e\u0010dxGV-%A:\u0004\u0003lg=R\u001b\rK@O(9'H\u0013mF-w'PDn0dOn\u001f\u0004k\u0019=\u007fZ\u0019o1g@kYlg\b[;fs\u0017\u001a4=O$\u001epny4{@\nr3dDlG_]h5j\\\u0006'-\u0015%h\"0\u0012&z6*\r*<\\u\u0003RA)&Ye\u00055L\\\u0018vzlkMa\u0005EJK\u0012\u001b\u001bur4\u0007_\b\u0001\u0003Gh`Rs\u0014T4Nl\u0014EAB;e6\n'}ll_l<*PdT\r\u000b\u0007Zk\u0015]`r)z&\u000e7]n|Y\u0006\u0013\\cB3\rV3ZX>B%\u0013sm\u0006[OR\u000f+:J\u000e4\u00062*\u0014]Uj\u001al uy9\f0uP)\u001a>UR'R1lT%\u0019_H\u0018BtZdrh\u000fivA\npN&.\"\r\u0019zQWd}uy\u0002\u0013Nq\u0094:ǚnٷå7%#_\r߈<[Ǜ\u001b\u00030kQJ\u000eϱ9:`\u0007m\rWv[G\u0002p{@W\u0010?\t\u007f\u000bP\u0015}\u001d,\bj4a\u007fz%\u0006E\u001e\u0001;mNlc\"<-Q4\u0016%]!jKnF<w#9T#z^l\u0013G\"\u0010\u001b[\u0013\u0006/Z\u001cfd\u0019s\bVYfol+]CL\u0017FiT\u001a\u000b=\t\u0018v0=\u007fdS\u0015qq~%N\u000b\n CO\u0012y\u0016P7\u0017(#<\u001dd\u001ag\u001b2 iAJrx\u0016'3rh<MT\u00192@d\u0007]\u0007R>\u0002+\n\u0013[!\u00073M\u0019u}=VQ:#Ӷw**jܨy*-&\u0015.pSDQQGccPo\u0014B}u4atBIW \u0018\u0018\u0011=\u001cQS'Ru\u0001I\npI$=\u001a;~\"1\u0013FZc,\u0003X9w pq;Np!\b=\u0005\u001cv\u0007U<c'\u0016*\u0014dGO\u007fK@BX\u0001UWi\f\u0005\u00016\u00032!?J\u001a\u000eso])>*zS \u000b{4\"8\u00052d#Rkc4 \u001ee~\u0005U.˱Y݅X̎ٹ';\u001a'\u0007Ϡ\u00156͈E0Y#p!zڙ}$R1w'\t\"\f\u0001\u001e/y-\u001f=k\u0018\u001b#l&8\t\u0010[:,\rl\u0002\u0012;fZ?,)[[\u0004\u001aLaLv\u0002b2r(\u001f\u0006\u000f\u000eO[>:5v?&\u0001\u0005gGlZZM\u00076UZ-f\u0011|L9\u0010\u0007\t9\u0003ds,\u000bF'epVSIl\u0001-5\u0015\u001b>og:A\u0002cf\u000b'$\u001fauH^\fV\"#\u001bY5\u001e$u\u001fTCeY\bL\u0002d\u00175^v.D +7_\tE0Km\u000bDRf)\u0014T\u001ff9QEr\u0014LXa\u0015\u0017-A|e\u0018¾Efg]ͬr\u001eptb\fU\u0007]\u001a+tC\u0006I7K8FFQ\u0002/\"D7!9tL\u000f'\u001fQ\u00063\u0006BM\u001a\u0012vR~\tb\t\u001e\u0018\u001e\f<8b\u001d&T\u0006Dxa\u0007UB b\"h;Y$=J\f@\u0018D$V\u001ati\u0018oY?7'#\u001a-dRaGCf{g\u0013dgS;S\nKv\u0018\u000e\u0015\u0018&\u0013>bk3sL\u000e_\f(*\u0017\u001aUD\u001e$\u001fW&J~Ԁ\u0010®\u001e͟ȷ'\u0016nh$ںj|я\\X@[bz}ݳA\u000f6wH$N\u0015uS\u0001-2J3s\u0001\u00122\u0002~r%H`\u0014@\f/T\u0004K;~L2VZ\nVUq\u001a`}\t\u001f^7W\r%\u001d\"/\u001a<Tr2;#muN_yS%b\\Xo5T5:v\u001a=P \"_j`\u0007z\\u[&.JxU\u0012\u0018\u0017\u0011Q^nF,C\u001cAohqrW\u0005}&KZ3`5\u0012\u001cPY^1Y]\u000f\u001ejhp\u001aGG\u0004\nN\u0002\u001bP\u0011W\r9\u001f[Ci\u0019},HK,\u00136S{eH)[!X\"<;2AW|\u001d{b(,q~$M\u0006\u000bԡh\u0012XgǙ^zg\u0006Osvj\"91x>%$e ?<\u0005+\u000fx2rUgTA\u0013r.oa\u0002^(\u0017(^(z\"\u0014U059DJM\u007f]\u000ea 'lXB*If<wD\t|&fbpp^\u000f n\u001f!)\u0002txC{EsPX\u00120<9TpR\u0002EKDr;A.!qqd\"C-[mYJ\u0014\u000e=r\u001e\u0017e{4u-K8en\u0007o@\u001bhgN%\u007fzz\rГ\u0006ɐ\u001bۻ\u058cv@V,˱\u0006E\u00013\rͤ1g[ԽV~"}, d2 = {"<df", Global.BLANK, "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "1n]@g9NQ(\t\b", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]+?h\u0005$@7\u001b?U\r<{=\u001c$lkB\u0015-\r^\u007f%VPX5'(6$\u0019\u000ek\n\u00182\t\u000e[\u000b\u000ekI7\u001d\u0017\u0002", "\"0", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]+?h\u0005$@7\u001b?U\r<{=\u001c$lkB\u0015-\r^\u007f%VPX5((6$\u0019\u000ek\n\u00182\t\u000e[\u000b\u000ekI7\u001d\u0017\u0002", "\"1", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]+?h\u0005$@7\u001b?U\r<{=\u001c$lkB\u0015-\r^\u007f%VPX5)(6$\u0019\u000ek\n\u00182\t\u000e[\u000b\u000ekI7\u001d\u0017\u0002", "\"2", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]+?h\u0005$@7\u001b?U\r<{=\u001c$lkB\u0015-\r^\u007f%VPX5*(6$\u0019\u000ek\n\u00182\t\u000e[\u000b\u000ekI7\u001d\u0017\u0002", "\"3", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001384U", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]+?h\u0005$@7\u001b?U\r<{=\u001c$lkB\u0015-\r^\u007f%VPX5+(6$\u0019\u000ek\n\u00182\t\u000e[\u000b\u000ekI7\u001d\u0017\u0002", "\"4", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001385U", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]+?h\u0005$@7\u001b?U\r<{=\u001c$lkB\u0015-\r^\u007f%VPX5,(6$\u0019\u000ek\n\u00182\t\u000e[\u000b\u000ekI7\u001d\u0017\u0002", "\"5", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001386U", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]+?h\u0005$@7\u001b?U\r<{=\u001c$lkB\u0015-\r^\u007f%VPX5-(6$\u0019\u000ek\n\u00182\t\u000e[\u000b\u000ekI7\u001d\u0017\u0002", "\"6", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001387U", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]+?h\u0005$@7\u001b?U\r<{=\u001c$lkB\u0015-\r^\u007f%VPX5.(6$\u0019\u000ek\n\u00182\t\u000e[\u000b\u000ekI7\u001d\u0017\u0002", "\"7", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001388U", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]+?h\u0005$@7\u001b?U\r<{=\u001c$lkB\u0015-\r^\u007f%VPX5/(6$\u0019\u000ek\n\u00182\t\u000e[\u000b\u000ekI7\u001d\u0017\u0002", "\"8", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001389U", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]+?h\u0005$@7\u001b?U\r<{=\u001c$lkB\u0015-\r^\u007f%VPX50(6$\u0019\u000ek\n\u00182\t\u000e[\u000b\u000ekI7\u001d\u0017\u0002", "\"0\u001f", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381J}", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]+?h\u0005$@7\u001b?U\r<{=\u001c$lkB\u0015-\r^\u007f%VPX5(\u001dH\u0001z\u0017V\u001fJt\u0014\u0001bCmXA<\u001f\u0006;\u001f", "\"0 ", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381K}", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]+?h\u0005$@7\u001b?U\r<{=\u001c$lkB\u0015-\r^\u007f%VPX5(\u001eH\u0001z\u0017V\u001fJt\u0014\u0001bCmXA<\u001f\u0006;\u001f", "\"0!", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381L}", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]+?h\u0005$@7\u001b?U\r<{=\u001c$lkB\u0015-\r^\u007f%VPX5(\u001fH\u0001z\u0017V\u001fJt\u0014\u0001bCmXA<\u001f\u0006;\u001f", "\"0\"", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381M}", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]+?h\u0005$@7\u001b?U\r<{=\u001c$lkB\u0015-\r^\u007f%VPX5( H\u0001z\u0017V\u001fJt\u0014\u0001bCmXA<\u001f\u0006;\u001f", "\"0#", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381N}", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]+?h\u0005$@7\u001b?U\r<{=\u001c$lkB\u0015-\r^\u007f%VPX5(!H\u0001z\u0017V\u001fJt\u0014\u0001bCmXA<\u001f\u0006;\u001f", "\"0$", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381O}", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]+?h\u0005$@7\u001b?U\r<{=\u001c$lkB\u0015-\r^\u007f%VPX5(\"H\u0001z\u0017V\u001fJt\u0014\u0001bCmXA<\u001f\u0006;\u001f", "\"0%", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381P}", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]+?h\u0005$@7\u001b?U\r<{=\u001c$lkB\u0015-\r^\u007f%VPX5(#H\u0001z\u0017V\u001fJt\u0014\u0001bCmXA<\u001f\u0006;\u001f", "\"0&", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381Q}", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]+?h\u0005$@7\u001b?U\r<{=\u001c$lkB\u0015-\r^\u007f%VPX5($H\u0001z\u0017V\u001fJt\u0014\u0001bCmXA<\u001f\u0006;\u001f", "\"0'", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381R}", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]+?h\u0005$@7\u001b?U\r<{=\u001c$lkB\u0015-\r^\u007f%VPX5(%H\u0001z\u0017V\u001fJt\u0014\u0001bCmXA<\u001f\u0006;\u001f", "\"0(", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381S}", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]+?h\u0005$@7\u001b?U\r<{=\u001c$lkB\u0015-\r^\u007f%VPX5(&H\u0001z\u0017V\u001fJt\u0014\u0001bCmXA<\u001f\u0006;\u001f", "\"1\u001f", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382J}", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]+?h\u0005$@7\u001b?U\r<{=\u001c$lkB\u0015-\r^\u007f%VPX5)\u001dH\u0001z\u0017V\u001fJt\u0014\u0001bCmXA<\u001f\u0006;\u001f", "\"1 ", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382K}", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]+?h\u0005$@7\u001b?U\r<{=\u001c$lkB\u0015-\r^\u007f%VPX5)\u001eH\u0001z\u0017V\u001fJt\u0014\u0001bCmXA<\u001f\u0006;\u001f", "\"1!", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382L}", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]+?h\u0005$@7\u001b?U\r<{=\u001c$lkB\u0015-\r^\u007f%VPX5)\u001fH\u0001z\u0017V\u001fJt\u0014\u0001bCmXA<\u001f\u0006;\u001f", "9nX; *H`\u0019"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class NewKt {
    /* JADX INFO: renamed from: new, reason: not valid java name */
    public static final /* synthetic */ <R> R m10825new(Scope scope, Function0<? extends R> constructor) {
        Intrinsics.checkNotNullParameter(scope, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        return constructor.invoke();
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> R m10826new(Scope scope, Function10<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? extends R> constructor) {
        Intrinsics.checkNotNullParameter(scope, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.reifiedOperationMarker(4, "T1");
        Architecture architecture = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T2");
        Architecture architecture2 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T3");
        Architecture architecture3 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T4");
        Architecture architecture4 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T5");
        Architecture architecture5 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T6");
        Architecture architecture6 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T7");
        Architecture architecture7 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T8");
        Architecture architecture8 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T9");
        Architecture architecture9 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T10");
        return constructor.invoke(architecture, architecture2, architecture3, architecture4, architecture5, architecture6, architecture7, architecture8, architecture9, (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> R m10827new(Scope scope, Function11<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? extends R> constructor) {
        Intrinsics.checkNotNullParameter(scope, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.reifiedOperationMarker(4, "T1");
        Architecture architecture = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T2");
        Architecture architecture2 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T3");
        Architecture architecture3 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T4");
        Architecture architecture4 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T5");
        Architecture architecture5 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T6");
        Architecture architecture6 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T7");
        Architecture architecture7 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T8");
        Architecture architecture8 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T9");
        Architecture architecture9 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T10");
        Architecture architecture10 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T11");
        return constructor.invoke(architecture, architecture2, architecture3, architecture4, architecture5, architecture6, architecture7, architecture8, architecture9, architecture10, (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> R m10828new(Scope scope, Function12<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? extends R> constructor) {
        Intrinsics.checkNotNullParameter(scope, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.reifiedOperationMarker(4, "T1");
        Architecture architecture = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T2");
        Architecture architecture2 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T3");
        Architecture architecture3 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T4");
        Architecture architecture4 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T5");
        Architecture architecture5 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T6");
        Architecture architecture6 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T7");
        Architecture architecture7 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T8");
        Architecture architecture8 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T9");
        Architecture architecture9 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T10");
        Architecture architecture10 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T11");
        Architecture architecture11 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T12");
        return constructor.invoke(architecture, architecture2, architecture3, architecture4, architecture5, architecture6, architecture7, architecture8, architecture9, architecture10, architecture11, (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> R m10829new(Scope scope, Function13<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? extends R> constructor) {
        Intrinsics.checkNotNullParameter(scope, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.reifiedOperationMarker(4, "T1");
        Architecture architecture = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T2");
        Architecture architecture2 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T3");
        Architecture architecture3 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T4");
        Architecture architecture4 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T5");
        Architecture architecture5 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T6");
        Architecture architecture6 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T7");
        Architecture architecture7 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T8");
        Architecture architecture8 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T9");
        Architecture architecture9 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T10");
        Architecture architecture10 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T11");
        Architecture architecture11 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T12");
        Architecture architecture12 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T13");
        return constructor.invoke(architecture, architecture2, architecture3, architecture4, architecture5, architecture6, architecture7, architecture8, architecture9, architecture10, architecture11, architecture12, (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> R m10830new(Scope scope, Function14<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? extends R> constructor) {
        Intrinsics.checkNotNullParameter(scope, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.reifiedOperationMarker(4, "T1");
        Architecture architecture = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T2");
        Architecture architecture2 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T3");
        Architecture architecture3 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T4");
        Architecture architecture4 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T5");
        Architecture architecture5 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T6");
        Architecture architecture6 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T7");
        Architecture architecture7 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T8");
        Architecture architecture8 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T9");
        Architecture architecture9 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T10");
        Architecture architecture10 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T11");
        Architecture architecture11 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T12");
        Architecture architecture12 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T13");
        Architecture architecture13 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T14");
        return constructor.invoke(architecture, architecture2, architecture3, architecture4, architecture5, architecture6, architecture7, architecture8, architecture9, architecture10, architecture11, architecture12, architecture13, (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> R m10831new(Scope scope, Function15<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? extends R> constructor) {
        Intrinsics.checkNotNullParameter(scope, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.reifiedOperationMarker(4, "T1");
        Architecture architecture = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T2");
        Architecture architecture2 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T3");
        Architecture architecture3 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T4");
        Architecture architecture4 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T5");
        Architecture architecture5 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T6");
        Architecture architecture6 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T7");
        Architecture architecture7 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T8");
        Architecture architecture8 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T9");
        Architecture architecture9 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T10");
        Architecture architecture10 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T11");
        Architecture architecture11 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T12");
        Architecture architecture12 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T13");
        Architecture architecture13 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T14");
        Architecture architecture14 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T15");
        return constructor.invoke(architecture, architecture2, architecture3, architecture4, architecture5, architecture6, architecture7, architecture8, architecture9, architecture10, architecture11, architecture12, architecture13, architecture14, (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> R m10832new(Scope scope, Function16<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? extends R> constructor) {
        Intrinsics.checkNotNullParameter(scope, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.reifiedOperationMarker(4, "T1");
        Architecture architecture = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T2");
        Architecture architecture2 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T3");
        Architecture architecture3 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T4");
        Architecture architecture4 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T5");
        Architecture architecture5 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T6");
        Architecture architecture6 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T7");
        Architecture architecture7 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T8");
        Architecture architecture8 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T9");
        Architecture architecture9 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T10");
        Architecture architecture10 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T11");
        Architecture architecture11 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T12");
        Architecture architecture12 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T13");
        Architecture architecture13 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T14");
        Architecture architecture14 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T15");
        Architecture architecture15 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T16");
        return constructor.invoke(architecture, architecture2, architecture3, architecture4, architecture5, architecture6, architecture7, architecture8, architecture9, architecture10, architecture11, architecture12, architecture13, architecture14, architecture15, (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> R m10833new(Scope scope, Function17<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? extends R> constructor) {
        Intrinsics.checkNotNullParameter(scope, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.reifiedOperationMarker(4, "T1");
        Architecture architecture = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T2");
        Architecture architecture2 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T3");
        Architecture architecture3 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T4");
        Architecture architecture4 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T5");
        Architecture architecture5 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T6");
        Architecture architecture6 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T7");
        Architecture architecture7 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T8");
        Architecture architecture8 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T9");
        Architecture architecture9 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T10");
        Architecture architecture10 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T11");
        Architecture architecture11 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T12");
        Architecture architecture12 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T13");
        Architecture architecture13 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T14");
        Architecture architecture14 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T15");
        Architecture architecture15 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T16");
        Architecture architecture16 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T17");
        return constructor.invoke(architecture, architecture2, architecture3, architecture4, architecture5, architecture6, architecture7, architecture8, architecture9, architecture10, architecture11, architecture12, architecture13, architecture14, architecture15, architecture16, (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> R m10834new(Scope scope, Function18<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? extends R> constructor) {
        Intrinsics.checkNotNullParameter(scope, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.reifiedOperationMarker(4, "T1");
        Architecture architecture = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T2");
        Architecture architecture2 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T3");
        Architecture architecture3 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T4");
        Architecture architecture4 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T5");
        Architecture architecture5 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T6");
        Architecture architecture6 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T7");
        Architecture architecture7 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T8");
        Architecture architecture8 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T9");
        Architecture architecture9 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T10");
        Architecture architecture10 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T11");
        Architecture architecture11 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T12");
        Architecture architecture12 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T13");
        Architecture architecture13 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T14");
        Architecture architecture14 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T15");
        Architecture architecture15 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T16");
        Architecture architecture16 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T17");
        Architecture architecture17 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T18");
        return constructor.invoke(architecture, architecture2, architecture3, architecture4, architecture5, architecture6, architecture7, architecture8, architecture9, architecture10, architecture11, architecture12, architecture13, architecture14, architecture15, architecture16, architecture17, (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> R m10835new(Scope scope, Function19<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? extends R> constructor) {
        Intrinsics.checkNotNullParameter(scope, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.reifiedOperationMarker(4, "T1");
        Architecture architecture = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T2");
        Architecture architecture2 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T3");
        Architecture architecture3 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T4");
        Architecture architecture4 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T5");
        Architecture architecture5 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T6");
        Architecture architecture6 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T7");
        Architecture architecture7 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T8");
        Architecture architecture8 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T9");
        Architecture architecture9 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T10");
        Architecture architecture10 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T11");
        Architecture architecture11 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T12");
        Architecture architecture12 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T13");
        Architecture architecture13 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T14");
        Architecture architecture14 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T15");
        Architecture architecture15 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T16");
        Architecture architecture16 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T17");
        Architecture architecture17 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T18");
        Architecture architecture18 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T19");
        return constructor.invoke(architecture, architecture2, architecture3, architecture4, architecture5, architecture6, architecture7, architecture8, architecture9, architecture10, architecture11, architecture12, architecture13, architecture14, architecture15, architecture16, architecture17, architecture18, (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public static final /* synthetic */ <R, T1> R m10836new(Scope scope, Function1<? super T1, ? extends R> constructor) {
        Intrinsics.checkNotNullParameter(scope, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.reifiedOperationMarker(4, "T1");
        return constructor.invoke((Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> R m10837new(Scope scope, Function20<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? super T20, ? extends R> constructor) {
        Intrinsics.checkNotNullParameter(scope, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.reifiedOperationMarker(4, "T1");
        Architecture architecture = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T2");
        Architecture architecture2 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T3");
        Architecture architecture3 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T4");
        Architecture architecture4 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T5");
        Architecture architecture5 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T6");
        Architecture architecture6 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T7");
        Architecture architecture7 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T8");
        Architecture architecture8 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T9");
        Architecture architecture9 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T10");
        Architecture architecture10 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T11");
        Architecture architecture11 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T12");
        Architecture architecture12 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T13");
        Architecture architecture13 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T14");
        Architecture architecture14 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T15");
        Architecture architecture15 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T16");
        Architecture architecture16 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T17");
        Architecture architecture17 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T18");
        Architecture architecture18 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T19");
        Architecture architecture19 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T20");
        return constructor.invoke(architecture, architecture2, architecture3, architecture4, architecture5, architecture6, architecture7, architecture8, architecture9, architecture10, architecture11, architecture12, architecture13, architecture14, architecture15, architecture16, architecture17, architecture18, architecture19, (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> R m10838new(Scope scope, Function21<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? super T20, ? super T21, ? extends R> constructor) {
        Intrinsics.checkNotNullParameter(scope, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.reifiedOperationMarker(4, "T1");
        Architecture architecture = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T2");
        Architecture architecture2 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T3");
        Architecture architecture3 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T4");
        Architecture architecture4 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T5");
        Architecture architecture5 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T6");
        Architecture architecture6 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T7");
        Architecture architecture7 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T8");
        Architecture architecture8 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T9");
        Architecture architecture9 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T10");
        Architecture architecture10 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T11");
        Architecture architecture11 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T12");
        Architecture architecture12 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T13");
        Architecture architecture13 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T14");
        Architecture architecture14 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T15");
        Architecture architecture15 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T16");
        Architecture architecture16 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T17");
        Architecture architecture17 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T18");
        Architecture architecture18 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T19");
        Architecture architecture19 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T20");
        Architecture architecture20 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T21");
        return constructor.invoke(architecture, architecture2, architecture3, architecture4, architecture5, architecture6, architecture7, architecture8, architecture9, architecture10, architecture11, architecture12, architecture13, architecture14, architecture15, architecture16, architecture17, architecture18, architecture19, architecture20, (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> R m10839new(Scope scope, Function22<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? super T20, ? super T21, ? super T22, ? extends R> constructor) {
        Intrinsics.checkNotNullParameter(scope, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.reifiedOperationMarker(4, "T1");
        Architecture architecture = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T2");
        Architecture architecture2 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T3");
        Architecture architecture3 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T4");
        Architecture architecture4 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T5");
        Architecture architecture5 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T6");
        Architecture architecture6 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T7");
        Architecture architecture7 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T8");
        Architecture architecture8 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T9");
        Architecture architecture9 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T10");
        Architecture architecture10 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T11");
        Architecture architecture11 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T12");
        Architecture architecture12 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T13");
        Architecture architecture13 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T14");
        Architecture architecture14 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T15");
        Architecture architecture15 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T16");
        Architecture architecture16 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T17");
        Architecture architecture17 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T18");
        Architecture architecture18 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T19");
        Architecture architecture19 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T20");
        Architecture architecture20 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T21");
        Architecture architecture21 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T22");
        return constructor.invoke(architecture, architecture2, architecture3, architecture4, architecture5, architecture6, architecture7, architecture8, architecture9, architecture10, architecture11, architecture12, architecture13, architecture14, architecture15, architecture16, architecture17, architecture18, architecture19, architecture20, architecture21, (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public static final /* synthetic */ <R, T1, T2> R m10840new(Scope scope, Function2<? super T1, ? super T2, ? extends R> constructor) {
        Intrinsics.checkNotNullParameter(scope, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.reifiedOperationMarker(4, "T1");
        Architecture architecture = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T2");
        return constructor.invoke(architecture, (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public static final /* synthetic */ <R, T1, T2, T3> R m10841new(Scope scope, Function3<? super T1, ? super T2, ? super T3, ? extends R> constructor) {
        Intrinsics.checkNotNullParameter(scope, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.reifiedOperationMarker(4, "T1");
        Architecture architecture = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T2");
        Architecture architecture2 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T3");
        return constructor.invoke(architecture, architecture2, (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public static final /* synthetic */ <R, T1, T2, T3, T4> R m10842new(Scope scope, Function4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> constructor) {
        Intrinsics.checkNotNullParameter(scope, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.reifiedOperationMarker(4, "T1");
        Architecture architecture = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T2");
        Architecture architecture2 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T3");
        Architecture architecture3 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T4");
        return constructor.invoke(architecture, architecture2, architecture3, (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public static final /* synthetic */ <R, T1, T2, T3, T4, T5> R m10843new(Scope scope, Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> constructor) {
        Intrinsics.checkNotNullParameter(scope, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.reifiedOperationMarker(4, "T1");
        Architecture architecture = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T2");
        Architecture architecture2 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T3");
        Architecture architecture3 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T4");
        Architecture architecture4 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T5");
        return constructor.invoke(architecture, architecture2, architecture3, architecture4, (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6> R m10844new(Scope scope, Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> constructor) {
        Intrinsics.checkNotNullParameter(scope, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.reifiedOperationMarker(4, "T1");
        Architecture architecture = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T2");
        Architecture architecture2 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T3");
        Architecture architecture3 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T4");
        Architecture architecture4 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T5");
        Architecture architecture5 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T6");
        return constructor.invoke(architecture, architecture2, architecture3, architecture4, architecture5, (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7> R m10845new(Scope scope, Function7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> constructor) {
        Intrinsics.checkNotNullParameter(scope, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.reifiedOperationMarker(4, "T1");
        Architecture architecture = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T2");
        Architecture architecture2 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T3");
        Architecture architecture3 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T4");
        Architecture architecture4 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T5");
        Architecture architecture5 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T6");
        Architecture architecture6 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T7");
        return constructor.invoke(architecture, architecture2, architecture3, architecture4, architecture5, architecture6, (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8> R m10846new(Scope scope, Function8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> constructor) {
        Intrinsics.checkNotNullParameter(scope, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.reifiedOperationMarker(4, "T1");
        Architecture architecture = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T2");
        Architecture architecture2 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T3");
        Architecture architecture3 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T4");
        Architecture architecture4 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T5");
        Architecture architecture5 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T6");
        Architecture architecture6 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T7");
        Architecture architecture7 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T8");
        return constructor.invoke(architecture, architecture2, architecture3, architecture4, architecture5, architecture6, architecture7, (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9> R m10847new(Scope scope, Function9<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> constructor) {
        Intrinsics.checkNotNullParameter(scope, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.reifiedOperationMarker(4, "T1");
        Architecture architecture = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T2");
        Architecture architecture2 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T3");
        Architecture architecture3 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T4");
        Architecture architecture4 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T5");
        Architecture architecture5 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T6");
        Architecture architecture6 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T7");
        Architecture architecture7 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T8");
        Architecture architecture8 = (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T9");
        return constructor.invoke(architecture, architecture2, architecture3, architecture4, architecture5, architecture6, architecture7, architecture8, (Object) scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
    }
}
