package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableList;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
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
/* JADX INFO: compiled from: PersistentVectorBuilder.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0001\u001d<K!&˛\bDZc|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007tyA0R͜P.XS2\u000fy\u0002<$a$yCQU\"}(\u0015WNupvJ`\u000bK\u000f\u0014\u0016\u0001j2K]xk.\u00172HtG3[\u0016E9fz>\u000562*8\u007f\u000e\t\u001a8o\u0018͌\u0003CY4\u001aؓHpH{\u0015M\u000b5\u001a\u0006T \t\u001ebiV6V\fe:59\t݃X÷Oa6ŧ[\fvZ7\u000f\u0007ad*n7e\u001b5U\u0013\u0007\u0019Zm\u0004\u007f-M\u000fv)?1Yug6\u000fÜB\u0018;]\u001ba\u000b0l\tab\"&YUyJ~\u00138\u0004\t\u0003%D\u0014\u0012\u0016)^-[ \u0015\r\u001e7\u0003zk@~\u000bެF\u007f\tk~*3\u001aK+g6\u0017UoW1NmަK!̷'\u0001|>$o\u001cz-\u001b\u0003\u0016\u00025__UH|\u0013\nA{ \tb8ÏJDϽ\u0004/\n1v33Xs9Q<\u001c\u0006Vc\u007fv3i\u0019]wt`F2p&7`\u009e:}\u000bxM\u007f^up,?hL^\u0015  \u00190^\b<Wط>q\u0016|2\u0006[\u0002\"-?jG[\u0005j<]gcc9_\u0003(a\u0001\u007fZ?םf\u0005f\f\u000b_\u001a\u0001t.24XjFǮ*G\u0015 [mM\u00194<<5)^+G1$pF-\u0015m\u0003\u0001\u0018\u000fXC&\u0019hRz7\u0006\u0001`~\u0019\u007fxw5-l0WYYE\u001d6W8gb\u0003Q2EsõKgZs\u0015\u0001$#m{VچJ=_NU\u0013=\boɜ\u0002βIL\u0001\u0014\u001aX V\u0013|(\u0018\u0002Ü\u05cek\bp!t&x{g\\'&\u0007`\t\"6j.~\u0012R\tU{\\\u001b_NK\t\u0002\bB|=-\t-P=\u0001\u001e+-9;b?\u001dD\u0001D5#}uk\u0006-(h?*\u0003\u0019\u001c,\u0012J6bжa2Im\u00123\ro:$\u001b!rRx\u001a H\u00196\u001d3~Ш\u0013\u0014\u0007<[*G}\u0015\u0010\\\u0011~\rs:Ax.H<\u0017B\u0004S\n$hS)!Oif\u001csa[9O=\u000f;\u007f?'*\u001ck)\u0007cpBH\u000e\u0004\u001cFCQa3B7)z,ѧ\f\u000bQ\u000f23\u001e6\u0018F\u000e-G@P\u0002S`\u001eX\t^lG3f[_O/1\u0003\u001dR6xc:5qTpGchܬ\u001a\u001d͢\u001fj];/@9\u0002l9IC\t\r\u0019muKY\u0006F\u0006](\u001cq\u001e\u0011~\u0018Ԡ!B&Y\u0002^\u001f\u001f\u000f6n\red\u0005І%R-űNjE\r<\u0015\u001cL\u0014\u001f\u0013)S\u0003qx,zT&<q\\1\u001bRH\u001f\f+l\r\u001bu\u0012CpUOz\u00167{\u000eėiBN4h;\u001289bg\u0010v\n\u0014ͩhZ\"\u001ap!!\u0013~)JB\u0013\u001a\u0001OF\u0010FS\u00125\u0018\u0012\r_\u001a|QN5S\u0005\u0010ROxz b\u001bi\u0005T9\b-1ٟ}n;\u0017e45\u0015F\u001bh^J\u0013i\u001f\u0007\u0017.\u0019E2-^ j9\u0014_e~o\u001aU\n\u0012[3yry1^[d}ψ}u\u0012s\u001d;#\u0006nUNh\u0019^\u0003A\u0006\u0014\rondé\u0010)\"\rGel\\+<Vv.fE6G%\n\u0012wf\u0015 ]K< _X\u0006\u001bσ6\u000b}t?D\u0011\bz|\u0010.R\u000b\t~\u00162[K\u0005I(5q,}h\u0013(aDfH61A\u0012\u001fNr8NG\r\u001e*mi3o\"W\u0001ͤ<\u0006}Uarx!k/:\u0005\r\u0003#>(7\u00029\"<#/=\u001d\b#gjK'Kdz-:\u0007\u0016N\r\u007f{V=j\\MC\u00166y\u0004I0\u000e-u<\u0006$WFE˜L*m/\t\u0004\u0002+\u001c&XT\u001fR1U\u0005\u0003\u0004\u000e<k.r\u0013aw3o\u007fD\u001dR\u000fB-\u001b\u0010uQv,#D;NZ7ʷ\n)AkE[]GX3Yv]1r\\j\u0019\"\tj@oD\u0012QP]:\bC\u0011\u0003i\u0001i\u001cV\u0010\u0014Fb%\r2\u0001aVn2x\u001dF0{\tT\rt\u0007]Kr\u0013P\u00134`DA:\u00114\u001b\\s]\u0002ҍN`#j{\u000b\u0002\u001a_\u001af\u007f1\u001f'ZS\fSl\u001bUMc\nbM=C\r\u0004I\u0007;{[3ZQOr{-\u007f\u00194^Ydu28h\u0010\u001eMtL F\u000fCVs^5^UEZ\u05cfa\u0001*x\u0006\u0013#@\u00172\u0011U\fr\u001f9Oa~Ve%Cw0\t&@G\u0018;*a\u0015J+\u0004\u0011A@\u0012\u0007\u000bO\u0004\u0002\u001eU\u001e_yR13\u0016AE@yr\u0005j\u0006\u0019ٮC~\u001a}oa\u0014q<jw\u0017y\u00108^1Rd[YVYg)pRn\u001f|\u000b\u000b\\\u0012NT4B6\u001dp4MCoD<0\u0007\buU\u0019\u0001Zi}\u0019\rY{Nqu֟B1\u007fp,Cmt\u0007Q\u000ban'e\bX\u001f\u0012\u001c-&\u0018҅X+@\u0017\u0004~\u001cM$`n9q<{4t{\te\u0013D\u0012ClLz|~O,$\u0002HpmxpvJ@fz\u0012?6v\u001fI\u0013\u000f2y%$AT~3kC<8`PY\f*u26 x\u0019\u0010#\fgC>\u001ds<~+\u0004ll!\t\u001bl\u00140ʽo/@/#Z*\u0017r'\u001c\u00048:\u001cm\u0015\u0011<pcR\b;/tt~Q9H$\u001e9\u0010`!l1<6;}h\tPph50\f\u0006UˉR}Elo\u000f*\u0016\b}]\\u&9\u0002yy6\f\u001a\u00182hz']Mz\u0011\f7}{\u0015?TYo6P\"˙(\b#\u0012J\\B4J\"Q\u001c?@&l~t\t'\u0019eB\u05ee#\u0019TF6h\u0002RugbJmek`]9?s\u0018K\u007fԄ\u000f-W\u000ew1h2|q\u0004HUTD;7s\u0012\u0017(s\u000f\u0010\t\u0017@ p\"\u0004:*b3$x-F&jh~l-ʶq\u0012M\u0016;/3!<<1/=_\u0017݃0?\u0017\u001057\u007fN+\u001fӡ\u0015(n`\u0007M\u001d8pn\u001e\u001f\u0012\u0007acH\u001cgJ)LY#s\fwga$}G\u001a.]\u000f(\u001aDO\u00185g\u0016$TlT\u007f^7^S\u00125@g\b dxGʗ^ =.PEXWdR#@5r^\u0005\u0005\u0001/I%\u0006:G8\u001cqk/f3;\u001d?k9kd)'\u001f_iYH}4*CE-5&$6\t;[ʴSu\u000f2\u0011@\u001a\r[8\u0018\u0018\u0015gb\u0004c\u0010W0mX!%9\u0006wfR\t\u001d'7'9\u001eVf\u001d\u0017}+@\"q\u001c=\u001b̚\r\u0010*\u0013m\u000f;\"\u000fzH;V \u001e,M}+b\u0015ݞ0%WOHs7V|q\fJ\u0003o!Ú%ƚOӱ@]\rl~\t6\u0006>ZK\u0018r^Z&\n.r\u001c>*-8<:\u001cr@\u001drg,u%W\u0013\u0016nf\u00075\u0007Ie/1 >\u0001/\u0012Sa9\u000bVY\f܇\u0015\u0013tnhC@\u0013;>ƒ\u0001\b?RLYY^J$IM\n#\u00023n(XgD(s\u0006%L~6J:mr:9j$$D\rN)Pz\u0001\u00149V\u0015\u0003\u000b\u00070`Ou[M1\r.!o\bghRoV\u001f;(P>@q;3M{!JK\u0016B\u0010%\u07b2\u0011\u001fx\u0007=m+1\n\\\rHo\f\u0014F,H\u000f8\u0001C!Ա$?d\u0018\u0003Azib7rn]'.\u001auR7Y\bcAgb\u0003jQ(\u007fvI5\u0016V7;B3:\u0013XT[CpsIku\u000b\u0013%0knu5|y\t642 I(~o%NM\u0010\u001c9F_0`\b:U\u0013o֓4J Υ\n\u000b\u0018!\u001fX\u001e.$\u001df\u0012BVbt6\u001bft-\f$~6\u001cGRM\u0016b<\u0011N\u001d\u000evUߚ\u0003ƌj\u0013GֶbH\u000b\rTwu\tu(9)t\u0006i2\u0010\u0001\bax\u001c`!BhDD*\u001e9$@SN\u0010I\u0010>י*ˇP\u0001NNSr\u001d0()p8]F~wh:\u0007\n4ٮEѽ!\u007f\\ǷQsf\te:pj=*\u0019\u0007\u0003_Zuv![h;\u0017X*k\u0013\u0002\u000b\u0010})\u05edCݴ]\u000e_ν\u0005\n46S|o\u001e\u0013P\u0007G[n&)UV&a\u000f/p\u0010\u00115-L0*\")#=k$%\u0019tg[ۓcƧh\nzJ(&\u0004R\u000fP U\u000eUcbswK'nJBߌS)\u0006»&Մkl.ܚe\u0007r\u0010iCm4ARx\t\u0018W\u0004\u000f)\u0002rՓ\"Χ]\u0014I\u0016)yqOUna;E\b\u001eRfn-7\u0007yBڒnϦ\u00184\u000b\u001eQKߛ\f́W"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WK?p\t\u001c%\n2qp)Z\u001eVC\u007fuN7lTh_\u0003V2E`9n\u0019<-`A9$!G", "\u0013", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c}%&Tk\fK^5DUz'7T\u001a<\\\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$xN8\u001b\tgP$wS\u001e#\u0016;\b^Kl\b\u000b\u0016\u001b\u000b", "DdRAb9", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$xN8\u001b\tgP$wS\u001e#\u0016;\u001f", "DdRAb9+]#\u000e", "", "", "DdRAb9-O\u001d\u0006", "@n^AF/BT(", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW<\n45f\u0007\u001c>7\u001c8\\J?tGg\u0013rh@\u0007a;R\u00010U\u0016R4db\u00029\u0011\u0019ZW9+\u001a\u0013]O3nMF\u0006\f:XW1O\u0006\b'\n~qlKXY1v\u001au?8><@duX=\u000fi&m\u000e)\u0007Y?:\"#G|^Y", "=v]2e:AW$", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012W:\r\u0012b=+8,G.\u0004)M\t?w\u0015u(\u00175w~EZ\u001b\u001d", "\nrTA \u0006\u0017", "@n^A", "5dc\u001fb6M\u0012&\u000f\u0004m0\u0005\t)r\u007f/{<\u000f\u0017", "u(J\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", ")KY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}", "5dc\u001fb6MA\u001c\u0003{mj\n\u00198t\u00040{:\u000e\u0017\u001eGk\u001c<", "u(8", "Adc\u001fb6MA\u001c\u0003{mj\n\u00198t\u00040{:\u000e\u0017\u001eGk\u001c<", "uH\u0018#", "Ahi2", "5dc \\A>", "B`X9", "5dc!T0E\u0012&\u000f\u0004m0\u0005\t)r\u007f/{<\u000f\u0017", "/cS", "", "3kT:X5M", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "", "7mS2k", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004q", "/cS\u000e_3", "3kT:X5Ma", "", "0tU3X9\u001f]&", "uH\u0018(?1:d\u0015H\u0002Z5~R\u0019b\u0005(yOV", "0tX9W", "1n_FG6\u001bc\u001a\u007fzk", "0tU3X9", "0tU3X9\"\\\u0018~\u000e", "And?V,\"b\u0019\fvm6\n", "", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q$g\u001c\u0013XkWL\u0006)<#a/7z\u0012=WP\u0011/*\u0005\u001adr5Pj(Wxp1IS,ZaH", "5dc", "uH\u0018\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", "5dc\u001ab+\u001c])\b\n", "5dc\u001ab+\u001c])\b\n\u001d9\r\u0012>i\b(uM\u0001\u001e\u0017C}\u000e", "7mb2e;\"\\(\tgh6\f", "AgX3g", "3kT:X5M1\u0015\f\br", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WK?p\t\u001c%\n2qp)Z\u001eVC~rF)fUF_z\u001d", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q$d}\u001cC\u0001\n\u0006}!>[G\n4r\u0016,\\\u0019\"g=\u001d\"re8\u001a-*X~2QZNuib{L\u0018\u001aZWN>\u001c\u0005fJ u\u000e=)\u00173M\u000bN2~\u0016\u001d\u00155h\u007fF`\u0019UC\u0019}I9wBVfy\u0011EMm1d\u0014_&k6I(\u001ez'dlX6\u001a\u000bO\u000eyR`kuVbd5)>kj3Ep+\u007fj\u000e$G\rs[9T}->\u0017\u00019*4sZ", "@hV5g\u001aAW\u001a\u000e", "0tU3X9L", "<t[95<?T\u0019\f\t", "<dgA5<?T\u0019\f", "uKY.i(\bc(\u0003\u0002(\n\u0007\u00106e}7\u007fJ\nlz+e\u0004#{!FUG'3v\u0018w7@@k2-jLW \f_=J@.CUPuFOw=\u0012!0Q?", "7mb2e;\"\\(\tiZ0\u0004", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q$g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#\u0007,", "7r<Bg(;Z\u0019", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "7sT?T;H`", "", ":dP35<?T\u0019\f^m,\n\u0005>o\r", "", ":hbA<;>`\u0015\u000e\u0005k", "", ";`Z2@<MO\u0016\u0006z", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004v}\u001cC\u0001\n\u0006}!>[G\n4r\u0016,\\\u0019", ";`Z2@<MO\u0016\u0006zL/\u0001\n>i\t*hD\u0003\u001a&", "2hbAT5<S", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q$D\r}Lk\u001f8@,1b\u007fi!j\u001b.KR\u0011", ";tc.U3>0)\u007f{^9", ";tc.U3>0)\u007f{^9n\r>h", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?6g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#", "<t[9\\-R/\u001a\u000ezk", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q$dZ\r.t\nMrn<U\u0007\"\u0001W\u00133MAJA", ">t[9?(Lbu\u000f{_,\n", "@n^AF0SS", "B`X96(K`-", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q$d}\u0013Pn\u001bFz$H#{*?x <M\rH{=-\u0019pa\u0003\u0007v;N\u00040CS\u00182fayA\u001d%$\fX2\u0014\u0005WP(xMEh\f4Q\u0012Jd}\u0013\u0016W9r{IV\u0018G\u0003$qP-rOg)}OIUq&a\u0013_\u0004`HIm}n\u001e\u001bf_\u001b\n|)Th9~cxCb\u00024-@7ECJoSKJ", ">t[9?(Lbu\u000f{_,\ni<o\b\u0015\u0006J\u0010", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q$dZ\b", ">tb55<?T\u0019\f\t", "0tU3X9L7(~\bZ;\u0007\u0016", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q$d}\u001cC\u0001\n\u0006\u000749`G\u0004Fm#*\\MHAw\u0014{m]J\u0003-3J\u007f)\u00116K1\\P\u0002\u0013", ">tb55<?T\u0019\f\tB5z\u0016/a\u000e,\u0005Bc\u0017\u001bIr\u001d w\u000e5Y| 6", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q$v\r}Lk\u001f8@,1b\u007fi!j\u001b.KR\u0011/*\u0005\u001adr5Pj(Wxp1IS,ZaH", ">tb590EZ\u0019}iZ0\u0004", "4h[9X+-O\u001d\u0006", "<df!T0E", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q6g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#9\"p0/\u00112h5\u0010eu8s,GJ]\u0002 C", ">tb5G(BZ", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q6g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#'~a\u001b#\u0011y]\u0003\u000e_5P@\u0011DQN*k(", "@dRFV3:P ~g^4\u0007\u001a/A\u0007/", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "0tU3X9,W.~", "Bn1BY->`\u0007\u0003\u0010^", "0tU3X9+S\u001a", "@dRFV3:P ~Wn-}\t<s", "", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%S\u0016\u001er\u0012?I\rBg= ^R^>\u0007a;$Z\u000b.HW+i\\v<'[X\u0018V6\u0017\u0013Y\u000b1~MF#\u0010,\u0013\u0002Nw\u0001\u0019\u001f\n<4vLe\u0017K\u0003(??3oMY]\tKKNpsh\u0014g-k67+\u0014;\u001d#sW.\u0012{\\ na}qpUb~@,N|WCLo<@\u00036h5x|\u00120ga+u\u0003j9&G`N[v\u001cE(_\u0019:k\u0017\u000e+2M\u000f\t[rys\btl-p]QF", "@d\\<i,\u001aZ ", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%S\u0016\u001er\u0012?I\rBg= ^R^>\u0007a;$Z\u000eCUM9fVqP]\u0010d\u0016Y5\u001b\u0005#N4wS;'\buI\u0015Jh\u000e\u0015\u0012\u0015~pzQ]\u0014P\r^sK0oFWn}QJS,.l\u0014o,X7A$]u!&oP6\n\u0005b\r\u0002V\u0004pu\u0011\u001d\u0003@4MiXMEVYJ\u0004p\tH\u0001w\u0010AEt,Jpg", "@d\\<i,\u001aZ _\bh4k\u00053l", "B`X9F0SS", "@d\\<i,\u001aZ p~m/g\u0016/d\u0004&wO\u0001", "@d\\<i,\u001ab", "@d\\<i,\u001f`#\u0007gh6\fd>", "@d\\<i,\u001f`#\u0007iZ0\u0004d>", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q$dzZ.t\nMrn<U\u0007\"\u0001W\u00133MAJA", "@dc.\\5\u001fW&\r\n", "Adc", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#", "Adc\u0016a\u0019H](", ExifInterface.GPS_MEASUREMENT_3D, "=kS\u0012_,FS\"\u000eXZ9\n\u001d", "AgX3g\u0013>O\u001a[\u000b_-|\u0016=", "AsP?g\u0013>O\u001ab\u0004],\u0010", "uH8(N\u0013CO*zDe(\u0006\u000bxO|-{>\u0010lz=V\u00138\b!~`y)97\u007f+RC9z\na\u000bOf5\u0018_uUr0I\u00168)aRpLi", "Ao[6g\u001bH0)\u007f{^9\u000b", "AsP?g\tNT\u001a~\b", "AsP?g\tNT\u001a~\bL0\u0012\t", "uKY.i(\bc(\u0003\u0002(\n\u0007\u00106e}7\u007fJ\nlz=V\u00138\b!~`y)97\u007f+RC9z\n\u0002\u000b^H>\u0003t(\u0018}#PN\u0018\u0016YWr;#g>\u000450\t\u0016U\u000b+jM9hq)N\u00029wVO\u0007", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PersistentVectorBuilder<E> extends AbstractMutableList<E> implements PersistentList.Builder<E> {
    public static final int $stable = 8;
    private MutabilityOwnership ownership = new MutabilityOwnership();
    private Object[] root;
    private int rootShift;
    private int size;
    private Object[] tail;
    private PersistentList<? extends E> vector;
    private Object[] vectorRoot;
    private Object[] vectorTail;

    public PersistentVectorBuilder(PersistentList<? extends E> persistentList, Object[] objArr, Object[] objArr2, int i2) {
        this.vector = persistentList;
        this.vectorRoot = objArr;
        this.vectorTail = objArr2;
        this.rootShift = i2;
        this.root = this.vectorRoot;
        this.tail = this.vectorTail;
        this.size = this.vector.size();
    }

    public final int getRootShift$runtime_release() {
        return this.rootShift;
    }

    public final void setRootShift$runtime_release(int i2) {
        this.rootShift = i2;
    }

    public final Object[] getRoot$runtime_release() {
        return this.root;
    }

    public final Object[] getTail$runtime_release() {
        return this.tail;
    }

    @Override // kotlin.collections.AbstractMutableList
    public int getSize() {
        return this.size;
    }

    public final int getModCount$runtime_release() {
        return this.modCount;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder
    public PersistentList<E> build() {
        PersistentVector persistentVector;
        if (this.root == this.vectorRoot && this.tail == this.vectorTail) {
            persistentVector = this.vector;
        } else {
            this.ownership = new MutabilityOwnership();
            Object[] objArr = this.root;
            this.vectorRoot = objArr;
            Object[] objArr2 = this.tail;
            this.vectorTail = objArr2;
            if (objArr == null) {
                if (objArr2.length == 0) {
                    persistentVector = UtilsKt.persistentVectorOf();
                } else {
                    Object[] objArrCopyOf = Arrays.copyOf(this.tail, size());
                    Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
                    persistentVector = new SmallPersistentVector(objArrCopyOf);
                }
            } else {
                Object[] objArr3 = this.root;
                Intrinsics.checkNotNull(objArr3);
                persistentVector = new PersistentVector(objArr3, this.tail, size(), this.rootShift);
            }
        }
        this.vector = persistentVector;
        return (PersistentList<E>) persistentVector;
    }

    private final int rootSize() {
        if (size() <= 32) {
            return 0;
        }
        return UtilsKt.rootSize(size());
    }

    private final int tailSize(int i2) {
        return i2 <= 32 ? i2 : i2 - UtilsKt.rootSize(i2);
    }

    private final int tailSize() {
        return tailSize(size());
    }

    private final boolean isMutable(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.ownership;
    }

    private final Object[] makeMutable(Object[] objArr) {
        if (objArr == null) {
            return mutableBuffer();
        }
        return isMutable(objArr) ? objArr : ArraysKt.copyInto$default(objArr, mutableBuffer(), 0, 0, RangesKt.coerceAtMost(objArr.length, 32), 6, (Object) null);
    }

    private final Object[] makeMutableShiftingRight(Object[] objArr, int i2) {
        if (isMutable(objArr)) {
            return ArraysKt.copyInto(objArr, objArr, i2, 0, 32 - i2);
        }
        return ArraysKt.copyInto(objArr, mutableBuffer(), i2, 0, 32 - i2);
    }

    private final Object[] mutableBufferWith(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.ownership;
        return objArr;
    }

    private final Object[] mutableBuffer() {
        Object[] objArr = new Object[33];
        objArr[32] = this.ownership;
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e2) {
        this.modCount++;
        int iTailSize = tailSize();
        if (iTailSize < 32) {
            Object[] objArrMakeMutable = makeMutable(this.tail);
            objArrMakeMutable[iTailSize] = e2;
            this.tail = objArrMakeMutable;
            this.size = size() + 1;
        } else {
            pushFilledTail(this.root, this.tail, mutableBufferWith(e2));
        }
        return true;
    }

    private final void pushFilledTail(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i2 = this.rootShift;
        if (size > (1 << i2)) {
            this.root = pushTail(mutableBufferWith(objArr), objArr2, this.rootShift + 5);
            this.tail = objArr3;
            this.rootShift += 5;
            this.size = size() + 1;
            return;
        }
        if (objArr == null) {
            this.root = objArr2;
            this.tail = objArr3;
            this.size = size() + 1;
        } else {
            this.root = pushTail(objArr, objArr2, i2);
            this.tail = objArr3;
            this.size = size() + 1;
        }
    }

    private final Object[] pushTail(Object[] objArr, Object[] objArr2, int i2) {
        int iIndexSegment = UtilsKt.indexSegment(size() - 1, i2);
        Object[] objArrMakeMutable = makeMutable(objArr);
        if (i2 == 5) {
            objArrMakeMutable[iIndexSegment] = objArr2;
        } else {
            objArrMakeMutable[iIndexSegment] = pushTail((Object[]) objArrMakeMutable[iIndexSegment], objArr2, i2 - 5);
        }
        return objArrMakeMutable;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        this.modCount++;
        int iTailSize = tailSize();
        Iterator<? extends E> it = collection.iterator();
        if (32 - iTailSize >= collection.size()) {
            this.tail = copyToBuffer(makeMutable(this.tail), iTailSize, it);
            this.size = size() + collection.size();
        } else {
            int size = ((collection.size() + iTailSize) - 1) / 32;
            Object[][] objArr = new Object[size][];
            objArr[0] = copyToBuffer(makeMutable(this.tail), iTailSize, it);
            for (int i2 = 1; i2 < size; i2++) {
                objArr[i2] = copyToBuffer(mutableBuffer(), 0, it);
            }
            this.root = pushBuffersIncreasingHeightIfNeeded(this.root, rootSize(), objArr);
            this.tail = copyToBuffer(mutableBuffer(), 0, it);
            this.size = size() + collection.size();
        }
        return true;
    }

    private final Object[] copyToBuffer(Object[] objArr, int i2, Iterator<? extends Object> it) {
        while (i2 < 32 && it.hasNext()) {
            objArr[i2] = it.next();
            i2++;
        }
        return objArr;
    }

    private final Object[] pushBuffersIncreasingHeightIfNeeded(Object[] objArr, int i2, Object[][] objArr2) {
        Object[] objArrMakeMutable;
        Iterator<Object[]> it = ArrayIteratorKt.iterator(objArr2);
        int i3 = i2 >> 5;
        int i4 = this.rootShift;
        if (i3 < (1 << i4)) {
            objArrMakeMutable = pushBuffers(objArr, i2, i4, it);
        } else {
            objArrMakeMutable = makeMutable(objArr);
        }
        while (it.hasNext()) {
            this.rootShift += 5;
            objArrMakeMutable = mutableBufferWith(objArrMakeMutable);
            int i5 = this.rootShift;
            pushBuffers(objArrMakeMutable, 1 << i5, i5, it);
        }
        return objArrMakeMutable;
    }

    private final Object[] pushBuffers(Object[] objArr, int i2, int i3, Iterator<Object[]> it) {
        if (!it.hasNext()) {
            PreconditionsKt.throwIllegalArgumentException("invalid buffersIterator");
        }
        if (!(i3 >= 0)) {
            PreconditionsKt.throwIllegalArgumentException("negative shift");
        }
        if (i3 == 0) {
            return it.next();
        }
        Object[] objArrMakeMutable = makeMutable(objArr);
        int iIndexSegment = UtilsKt.indexSegment(i2, i3);
        int i4 = i3 - 5;
        objArrMakeMutable[iIndexSegment] = pushBuffers((Object[]) objArrMakeMutable[iIndexSegment], i2, i4, it);
        while (true) {
            iIndexSegment++;
            if (iIndexSegment >= 32 || !it.hasNext()) {
                break;
            }
            objArrMakeMutable[iIndexSegment] = pushBuffers((Object[]) objArrMakeMutable[iIndexSegment], 0, i4, it);
        }
        return objArrMakeMutable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public void add(int i2, E e2) {
        ListImplementation.checkPositionIndex$runtime_release(i2, size());
        if (i2 == size()) {
            add(e2);
            return;
        }
        this.modCount++;
        int iRootSize = rootSize();
        if (i2 >= iRootSize) {
            insertIntoTail(this.root, i2 - iRootSize, e2);
            return;
        }
        ObjectRef objectRef = new ObjectRef(null);
        Object[] objArr = this.root;
        Intrinsics.checkNotNull(objArr);
        insertIntoTail(insertIntoRoot(objArr, this.rootShift, i2, e2, objectRef), 0, objectRef.getValue());
    }

    private final void insertIntoTail(Object[] objArr, int i2, E e2) {
        int iTailSize = tailSize();
        Object[] objArrMakeMutable = makeMutable(this.tail);
        if (iTailSize < 32) {
            ArraysKt.copyInto(this.tail, objArrMakeMutable, i2 + 1, i2, iTailSize);
            objArrMakeMutable[i2] = e2;
            this.root = objArr;
            this.tail = objArrMakeMutable;
            this.size = size() + 1;
            return;
        }
        Object[] objArr2 = this.tail;
        Object obj = objArr2[31];
        ArraysKt.copyInto(objArr2, objArrMakeMutable, i2 + 1, i2, 31);
        objArrMakeMutable[i2] = e2;
        pushFilledTail(objArr, objArrMakeMutable, mutableBufferWith(obj));
    }

    private final Object[] insertIntoRoot(Object[] objArr, int i2, int i3, Object obj, ObjectRef objectRef) {
        Object obj2;
        int iIndexSegment = UtilsKt.indexSegment(i3, i2);
        if (i2 == 0) {
            objectRef.setValue(objArr[31]);
            Object[] objArrCopyInto = ArraysKt.copyInto(objArr, makeMutable(objArr), iIndexSegment + 1, iIndexSegment, 31);
            objArrCopyInto[iIndexSegment] = obj;
            return objArrCopyInto;
        }
        Object[] objArrMakeMutable = makeMutable(objArr);
        int i4 = i2 - 5;
        Object obj3 = objArrMakeMutable[iIndexSegment];
        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrMakeMutable[iIndexSegment] = insertIntoRoot((Object[]) obj3, i4, i3, obj, objectRef);
        while (true) {
            iIndexSegment++;
            if (iIndexSegment >= 32 || (obj2 = objArrMakeMutable[iIndexSegment]) == null) {
                break;
            }
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrMakeMutable[iIndexSegment] = insertIntoRoot((Object[]) obj2, i4, 0, objectRef.getValue(), objectRef);
        }
        return objArrMakeMutable;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i2, Collection<? extends E> collection) {
        Object[] objArrCopyInto;
        ListImplementation.checkPositionIndex$runtime_release(i2, size());
        if (i2 == size()) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        this.modCount++;
        int i3 = (i2 >> 5) << 5;
        int size = (((size() - i3) + collection.size()) - 1) / 32;
        if (size == 0) {
            CommonFunctionsKt.m3763assert(i2 >= rootSize());
            int i4 = (i2 + 31) - (31 | i2);
            int size2 = (i2 + collection.size()) - 1;
            Object[] objArr = this.tail;
            Object[] objArrCopyInto2 = ArraysKt.copyInto(objArr, makeMutable(objArr), ((size2 + 31) - (size2 | 31)) + 1, i4, tailSize());
            copyToBuffer(objArrCopyInto2, i4, collection.iterator());
            this.tail = objArrCopyInto2;
            this.size = size() + collection.size();
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iTailSize = tailSize();
        int iTailSize2 = tailSize(size() + collection.size());
        if (i2 >= rootSize()) {
            objArrCopyInto = mutableBuffer();
            splitToBuffers(collection, i2, this.tail, iTailSize, objArr2, size, objArrCopyInto);
        } else if (iTailSize2 > iTailSize) {
            int i5 = iTailSize2 - iTailSize;
            objArrCopyInto = makeMutableShiftingRight(this.tail, i5);
            insertIntoRoot(collection, i2, i5, objArr2, size, objArrCopyInto);
        } else {
            int i6 = iTailSize - iTailSize2;
            objArrCopyInto = ArraysKt.copyInto(this.tail, mutableBuffer(), 0, i6, iTailSize);
            int i7 = 32 - i6;
            Object[] objArrMakeMutableShiftingRight = makeMutableShiftingRight(this.tail, i7);
            int i8 = size - 1;
            objArr2[i8] = objArrMakeMutableShiftingRight;
            insertIntoRoot(collection, i2, i7, objArr2, i8, objArrMakeMutableShiftingRight);
        }
        this.root = pushBuffersIncreasingHeightIfNeeded(this.root, i3, objArr2);
        this.tail = objArrCopyInto;
        this.size = size() + collection.size();
        return true;
    }

    private final void insertIntoRoot(Collection<? extends E> collection, int i2, int i3, Object[][] objArr, int i4, Object[] objArr2) {
        Object[] objArr3 = objArr2;
        if (this.root == null) {
            throw new IllegalStateException("root is null".toString());
        }
        int i5 = i2 >> 5;
        Object[] objArrShiftLeafBuffers = shiftLeafBuffers(i5, i3, objArr, i4, objArr3);
        int iRootSize = i4 - (((rootSize() >> 5) - 1) - i5);
        if (iRootSize < i4) {
            objArr3 = objArr[iRootSize];
            Intrinsics.checkNotNull(objArr3);
        }
        splitToBuffers(collection, i2, objArrShiftLeafBuffers, 32, objArr, iRootSize, objArr3);
    }

    private final Object[] shiftLeafBuffers(int i2, int i3, Object[][] objArr, int i4, Object[] objArr2) {
        if (this.root == null) {
            throw new IllegalStateException("root is null".toString());
        }
        ListIterator<Object[]> listIteratorLeafBufferIterator = leafBufferIterator(rootSize() >> 5);
        while (listIteratorLeafBufferIterator.previousIndex() != i2) {
            Object[] objArrPrevious = listIteratorLeafBufferIterator.previous();
            ArraysKt.copyInto(objArrPrevious, objArr2, 0, 32 - i3, 32);
            objArr2 = makeMutableShiftingRight(objArrPrevious, i3);
            i4--;
            objArr[i4] = objArr2;
        }
        return listIteratorLeafBufferIterator.previous();
    }

    private final void splitToBuffers(Collection<? extends E> collection, int i2, Object[] objArr, int i3, Object[][] objArr2, int i4, Object[] objArr3) {
        Object[] objArrMutableBuffer;
        if (!(i4 >= 1)) {
            PreconditionsKt.throwIllegalArgumentException("requires at least one nullBuffer");
        }
        Object[] objArrMakeMutable = makeMutable(objArr);
        objArr2[0] = objArrMakeMutable;
        int i5 = (i2 + 31) - (31 | i2);
        int size = ((i2 + collection.size()) - 1) & 31;
        int i6 = (i3 - i5) + size;
        if (i6 < 32) {
            ArraysKt.copyInto(objArrMakeMutable, objArr3, size + 1, i5, i3);
        } else {
            int i7 = i6 - 31;
            if (i4 == 1) {
                objArrMutableBuffer = objArrMakeMutable;
            } else {
                objArrMutableBuffer = mutableBuffer();
                i4--;
                objArr2[i4] = objArrMutableBuffer;
            }
            int i8 = i3 - i7;
            ArraysKt.copyInto(objArrMakeMutable, objArr3, 0, i8, i3);
            ArraysKt.copyInto(objArrMakeMutable, objArrMutableBuffer, size + 1, i5, i8);
            objArr3 = objArrMutableBuffer;
        }
        Iterator<? extends E> it = collection.iterator();
        copyToBuffer(objArrMakeMutable, i5, it);
        for (int i9 = 1; i9 < i4; i9++) {
            objArr2[i9] = copyToBuffer(mutableBuffer(), 0, it);
        }
        copyToBuffer(objArr3, 0, it);
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i2) {
        ListImplementation.checkElementIndex$runtime_release(i2, size());
        return (E) bufferFor(i2)[(i2 + 31) - (i2 | 31)];
    }

    private final Object[] bufferFor(int i2) {
        if (rootSize() <= i2) {
            return this.tail;
        }
        Object[] objArr = this.root;
        Intrinsics.checkNotNull(objArr);
        for (int i3 = this.rootShift; i3 > 0; i3 -= 5) {
            Object[] objArr2 = objArr[UtilsKt.indexSegment(i2, i3)];
            Intrinsics.checkNotNull(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    @Override // kotlin.collections.AbstractMutableList
    public E removeAt(int i2) {
        ListImplementation.checkElementIndex$runtime_release(i2, size());
        this.modCount++;
        int iRootSize = rootSize();
        if (i2 >= iRootSize) {
            return (E) removeFromTailAt(this.root, iRootSize, this.rootShift, i2 - iRootSize);
        }
        ObjectRef objectRef = new ObjectRef(this.tail[0]);
        Object[] objArr = this.root;
        Intrinsics.checkNotNull(objArr);
        removeFromTailAt(removeFromRootAt(objArr, this.rootShift, i2, objectRef), iRootSize, this.rootShift, 0);
        return (E) objectRef.getValue();
    }

    private final Object removeFromTailAt(Object[] objArr, int i2, int i3, int i4) {
        int size = size() - i2;
        CommonFunctionsKt.m3763assert(i4 < size);
        if (size == 1) {
            Object obj = this.tail[0];
            pullLastBufferFromRoot(objArr, i2, i3);
            return obj;
        }
        Object[] objArr2 = this.tail;
        Object obj2 = objArr2[i4];
        Object[] objArrCopyInto = ArraysKt.copyInto(objArr2, makeMutable(objArr2), i4, i4 + 1, size);
        objArrCopyInto[size - 1] = null;
        this.root = objArr;
        this.tail = objArrCopyInto;
        this.size = (i2 + size) - 1;
        this.rootShift = i3;
        return obj2;
    }

    private final Object[] removeFromRootAt(Object[] objArr, int i2, int i3, ObjectRef objectRef) {
        int iIndexSegment = UtilsKt.indexSegment(i3, i2);
        if (i2 == 0) {
            Object obj = objArr[iIndexSegment];
            Object[] objArrCopyInto = ArraysKt.copyInto(objArr, makeMutable(objArr), iIndexSegment, iIndexSegment + 1, 32);
            objArrCopyInto[31] = objectRef.getValue();
            objectRef.setValue(obj);
            return objArrCopyInto;
        }
        int iIndexSegment2 = objArr[31] == null ? UtilsKt.indexSegment(rootSize() - 1, i2) : 31;
        Object[] objArrMakeMutable = makeMutable(objArr);
        int i4 = i2 - 5;
        int i5 = iIndexSegment + 1;
        if (i5 <= iIndexSegment2) {
            while (true) {
                Object obj2 = objArrMakeMutable[iIndexSegment2];
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrMakeMutable[iIndexSegment2] = removeFromRootAt((Object[]) obj2, i4, 0, objectRef);
                if (iIndexSegment2 == i5) {
                    break;
                }
                iIndexSegment2--;
            }
        }
        Object obj3 = objArrMakeMutable[iIndexSegment];
        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrMakeMutable[iIndexSegment] = removeFromRootAt((Object[]) obj3, i4, i3, objectRef);
        return objArrMakeMutable;
    }

    private final void pullLastBufferFromRoot(Object[] objArr, int i2, int i3) {
        if (i3 == 0) {
            this.root = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.tail = objArr;
            this.size = i2;
            this.rootShift = i3;
            return;
        }
        ObjectRef objectRef = new ObjectRef(null);
        Intrinsics.checkNotNull(objArr);
        Object[] objArrPullLastBuffer = pullLastBuffer(objArr, i3, i2, objectRef);
        Intrinsics.checkNotNull(objArrPullLastBuffer);
        Object value = objectRef.getValue();
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.tail = (Object[]) value;
        this.size = i2;
        if (objArrPullLastBuffer[1] == null) {
            this.root = (Object[]) objArrPullLastBuffer[0];
            this.rootShift = i3 - 5;
        } else {
            this.root = objArrPullLastBuffer;
            this.rootShift = i3;
        }
    }

    private final Object[] pullLastBuffer(Object[] objArr, int i2, int i3, ObjectRef objectRef) {
        Object[] objArrPullLastBuffer;
        int iIndexSegment = UtilsKt.indexSegment(i3 - 1, i2);
        if (i2 == 5) {
            objectRef.setValue(objArr[iIndexSegment]);
            objArrPullLastBuffer = null;
        } else {
            Object obj = objArr[iIndexSegment];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrPullLastBuffer = pullLastBuffer((Object[]) obj, i2 - 5, i3, objectRef);
        }
        if (objArrPullLastBuffer == null && iIndexSegment == 0) {
            return null;
        }
        Object[] objArrMakeMutable = makeMutable(objArr);
        objArrMakeMutable[iIndexSegment] = objArrPullLastBuffer;
        return objArrMakeMutable;
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder$removeAll$1 */
    /* JADX INFO: compiled from: PersistentVectorBuilder.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,r\bDJe\u0003İY\u0006^\nND\u0005Ӭ:\u0012(\u000btkQ0\u000be\u000f6ʂW,\u0015m\n7"}, d2 = {"\n`]<a@F])\rS", "", "\u0013", "7s", "7me<^,", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~6\b*>m\u00127#"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function1<E, Boolean> {
        final /* synthetic */ Collection<E> $elements;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Collection<? extends E> collection) {
            super(1);
            collection = collection;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(E e2) {
            return Boolean.valueOf(collection.contains(e2));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<? extends Object> collection) {
        return removeAllWithPredicate(new Function1<E, Boolean>() { // from class: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder.removeAll.1
            final /* synthetic */ Collection<E> $elements;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(Collection<? extends E> collection2) {
                super(1);
                collection = collection2;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(E e2) {
                return Boolean.valueOf(collection.contains(e2));
            }
        });
    }

    public final boolean removeAllWithPredicate(Function1<? super E, Boolean> function1) {
        boolean zRemoveAll = removeAll(function1);
        if (zRemoveAll) {
            this.modCount++;
        }
        return zRemoveAll;
    }

    private final boolean removeAll(Function1<? super E, Boolean> function1) {
        Object[] objArrPushBuffers;
        int iTailSize = tailSize();
        ObjectRef objectRef = new ObjectRef(null);
        if (this.root == null) {
            return removeAllFromTail(function1, iTailSize, objectRef) != iTailSize;
        }
        ListIterator<Object[]> listIteratorLeafBufferIterator = leafBufferIterator(0);
        int iRecyclableRemoveAll = 32;
        while (iRecyclableRemoveAll == 32 && listIteratorLeafBufferIterator.hasNext()) {
            iRecyclableRemoveAll = removeAll(function1, listIteratorLeafBufferIterator.next(), 32, objectRef);
        }
        if (iRecyclableRemoveAll == 32) {
            CommonFunctionsKt.m3763assert(!listIteratorLeafBufferIterator.hasNext());
            int iRemoveAllFromTail = removeAllFromTail(function1, iTailSize, objectRef);
            if (iRemoveAllFromTail == 0) {
                pullLastBufferFromRoot(this.root, size(), this.rootShift);
            }
            return iRemoveAllFromTail != iTailSize;
        }
        int iPreviousIndex = listIteratorLeafBufferIterator.previousIndex() << 5;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        while (listIteratorLeafBufferIterator.hasNext()) {
            iRecyclableRemoveAll = recyclableRemoveAll(function1, listIteratorLeafBufferIterator.next(), 32, iRecyclableRemoveAll, objectRef, arrayList2, arrayList);
        }
        int iRecyclableRemoveAll2 = recyclableRemoveAll(function1, this.tail, iTailSize, iRecyclableRemoveAll, objectRef, arrayList2, arrayList);
        Object value = objectRef.getValue();
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) value;
        ArraysKt.fill(objArr, (Object) null, iRecyclableRemoveAll2, 32);
        if (arrayList.isEmpty()) {
            objArrPushBuffers = this.root;
            Intrinsics.checkNotNull(objArrPushBuffers);
        } else {
            objArrPushBuffers = pushBuffers(this.root, iPreviousIndex, this.rootShift, arrayList.iterator());
        }
        int size = iPreviousIndex + (arrayList.size() << 5);
        this.root = retainFirst(objArrPushBuffers, size);
        this.tail = objArr;
        this.size = size + iRecyclableRemoveAll2;
        return true;
    }

    private final Object[] retainFirst(Object[] objArr, int i2) {
        if (!((31 & i2) == 0)) {
            PreconditionsKt.throwIllegalArgumentException("invalid size");
        }
        if (i2 == 0) {
            this.rootShift = 0;
            return null;
        }
        int i3 = i2 - 1;
        while (true) {
            int i4 = this.rootShift;
            if ((i3 >> i4) == 0) {
                this.rootShift = i4 - 5;
                Object[] objArr2 = objArr[0];
                Intrinsics.checkNotNull(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = objArr2;
            } else {
                return nullifyAfter(objArr, i3, i4);
            }
        }
    }

    private final Object[] nullifyAfter(Object[] objArr, int i2, int i3) {
        if (!(i3 >= 0)) {
            PreconditionsKt.throwIllegalArgumentException("shift should be positive");
        }
        if (i3 == 0) {
            return objArr;
        }
        int iIndexSegment = UtilsKt.indexSegment(i2, i3);
        Object obj = objArr[iIndexSegment];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object objNullifyAfter = nullifyAfter((Object[]) obj, i2, i3 - 5);
        if (iIndexSegment < 31) {
            int i4 = iIndexSegment + 1;
            if (objArr[i4] != null) {
                if (isMutable(objArr)) {
                    ArraysKt.fill(objArr, (Object) null, i4, 32);
                }
                objArr = ArraysKt.copyInto(objArr, mutableBuffer(), 0, 0, i4);
            }
        }
        if (objNullifyAfter == objArr[iIndexSegment]) {
            return objArr;
        }
        Object[] objArrMakeMutable = makeMutable(objArr);
        objArrMakeMutable[iIndexSegment] = objNullifyAfter;
        return objArrMakeMutable;
    }

    private final int removeAllFromTail(Function1<? super E, Boolean> function1, int i2, ObjectRef objectRef) {
        int iRemoveAll = removeAll(function1, this.tail, i2, objectRef);
        if (iRemoveAll == i2) {
            CommonFunctionsKt.m3763assert(objectRef.getValue() == this.tail);
            return i2;
        }
        Object value = objectRef.getValue();
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) value;
        ArraysKt.fill(objArr, (Object) null, iRemoveAll, i2);
        this.tail = objArr;
        this.size = size() - (i2 - iRemoveAll);
        return iRemoveAll;
    }

    private final int removeAll(Function1<? super E, Boolean> function1, Object[] objArr, int i2, ObjectRef objectRef) {
        Object[] objArrMakeMutable = objArr;
        int i3 = i2;
        boolean z2 = false;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (function1.invoke(obj).booleanValue()) {
                if (!z2) {
                    objArrMakeMutable = makeMutable(objArr);
                    z2 = true;
                    i3 = i4;
                }
            } else if (z2) {
                objArrMakeMutable[i3] = obj;
                i3++;
            }
        }
        objectRef.setValue(objArrMakeMutable);
        return i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int recyclableRemoveAll(Function1<? super E, Boolean> function1, Object[] objArr, int i2, int i3, ObjectRef objectRef, List<Object[]> list, List<Object[]> list2) {
        if (isMutable(objArr)) {
            list.add(objArr);
        }
        Object value = objectRef.getValue();
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) value;
        Object[] objArrMutableBuffer = objArr2;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (!function1.invoke(obj).booleanValue()) {
                if (i3 == 32) {
                    if (!list.isEmpty()) {
                        objArrMutableBuffer = list.remove(list.size() - 1);
                    } else {
                        objArrMutableBuffer = mutableBuffer();
                    }
                    i3 = 0;
                }
                objArrMutableBuffer[i3] = obj;
                i3++;
            }
        }
        objectRef.setValue(objArrMutableBuffer);
        if (objArr2 != objectRef.getValue()) {
            list2.add(objArr2);
        }
        return i3;
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public E set(int i2, E e2) {
        ListImplementation.checkElementIndex$runtime_release(i2, size());
        if (rootSize() <= i2) {
            Object[] objArrMakeMutable = makeMutable(this.tail);
            if (objArrMakeMutable != this.tail) {
                this.modCount++;
            }
            int i3 = (-1) - (((-1) - i2) | ((-1) - 31));
            E e3 = (E) objArrMakeMutable[i3];
            objArrMakeMutable[i3] = e2;
            this.tail = objArrMakeMutable;
            return e3;
        }
        ObjectRef objectRef = new ObjectRef(null);
        Object[] objArr = this.root;
        Intrinsics.checkNotNull(objArr);
        this.root = setInRoot(objArr, this.rootShift, i2, e2, objectRef);
        return (E) objectRef.getValue();
    }

    private final Object[] setInRoot(Object[] objArr, int i2, int i3, E e2, ObjectRef objectRef) {
        int iIndexSegment = UtilsKt.indexSegment(i3, i2);
        Object[] objArrMakeMutable = makeMutable(objArr);
        if (i2 == 0) {
            if (objArrMakeMutable != objArr) {
                this.modCount++;
            }
            objectRef.setValue(objArrMakeMutable[iIndexSegment]);
            objArrMakeMutable[iIndexSegment] = e2;
            return objArrMakeMutable;
        }
        Object obj = objArrMakeMutable[iIndexSegment];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrMakeMutable[iIndexSegment] = setInRoot((Object[]) obj, i2 - 5, i3, e2, objectRef);
        return objArrMakeMutable;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int i2) {
        ListImplementation.checkPositionIndex$runtime_release(i2, size());
        return new PersistentVectorMutableIterator(this, i2);
    }

    private final ListIterator<Object[]> leafBufferIterator(int i2) {
        Object[] objArr = this.root;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root".toString());
        }
        int iRootSize = rootSize() >> 5;
        ListImplementation.checkPositionIndex$runtime_release(i2, iRootSize);
        int i3 = this.rootShift;
        if (i3 == 0) {
            return new SingleElementListIterator(objArr, i2);
        }
        return new TrieIterator(objArr, i2, iRootSize, i3 / 5);
    }
}
