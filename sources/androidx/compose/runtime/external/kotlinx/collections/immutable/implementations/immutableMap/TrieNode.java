package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
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
/* JADX INFO: compiled from: TrieNode.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯZ\u001d<K!&i\u0006DLc\u0003İIي8\u000b<H\u0007\"2\u0012\u007f\u0007tyA0JeP.hS2\u000fq\u007f<$i$yّCU0}*\teNogtNb\u000bY\u000f\u000e\u0016~s4Ic\u0002e\u0012\u0015ZJoU3UoC:htL\u0005(2(^\u007fڎ\u0017ɝHD8x\u0001ŏY\u000b:2FoHR=M3\u001bJ\u0006:\u001dACb{^:Vnu:]&\u0013mPR?_^\u007f]\u0019TY?\u0015\u0007e.-V6c\u0016SYΫ\u000bRiFCl\u0002A\u0013j?'YL\u0004[D\\\u0018\u0014C._\u0019kw>d\u0015Up\u000e=*}dyV\u001e.\u0006\u0003\u0014\u000fR\u0003<\u000fόL.;$/ڮ\rA\u0004\u000bSn`2ދA\u000e\fy2'B\u0010N;;+f\bĥK\u001b^72\u0004;̔ţ\u0005x'nd\u0014f)+V}WWfPNX]8\\ǀq\u000evu\u00120\nDW\u00025\u00027D'6Gjg&\u074co\fNWw|\u000btxUoXnW2\u007f&FX\fɔ^Nj\u0018{VZl<\u0013S\"z\t\u000e\u0019#/\u000bz˶%/\u0016a_no~]_\u0010+UjG[~k<ggpy̐Ʉg\u0010gj?ܺ>Jq\u001dX\u0015R\u0004ېYj9:.X\b \u0013\fF^\fIԵOs,4b0G¢ČL\r$UQ\u0003\u000fsjj\u0016\u0005zH4\u0014y3#\fɹTfv\u0003w~O@\rb(3ggE*6dPkط\u0001-\r\u0012\u0004\u0006M{\\IRr<\re\r0%H<ֺ3G\u0019\"\u000f/8\u0016=GRx\fS]#7\n+|ӛ?r4z\u0018pv@plPUz\u001b2xnrQ\u0018\u0013\u0012*eT\u0012_c\u0003\u000e\fBW\t\u001bYjQ~|M1,>\u0019{2~E-yگ-\u0018\b\u0014e\u0014\u0010w0ov\fp*>\u0001u\u0006<cL˱rSm2q7wsE>jqz\u001fZPz{\u0018D\u001f3;4vG\u0015tdUe\u000b]\u0001\u0017\u000b:+\tV\n=Cs\fSF_Xvs\u0002\"~[%G\u07bd\u0004k{\u000fc\\AI?\u000e\u0019\u0012In@\u001fm&dyz\u000bF\u0005\"!|Aވf\u0005J,l::` \u000bqW0\u0006X\u000e\u000ekw\u000fEXrwI}&T/ִ\u001dHϖdEnIr\u0016\r8K \u000f4g\u0004\u001eJbV{27ҵc\tƨnO\r\u0011mTR\u007fQ)8Z\u0011\u000b{؏SK\u00126:F?l\u001a\n<<&$5BNÇiU\u001f\f\u000f0\u0015\n\u001cd͒hv \u0014\u001bo0W\u0017\t\r\u0010L\nEԥ)Q\u0003o\u0019,bM&˿s\u001e\u000f>\\)=љCc̍\u001f-\u0014dufW\u0019,5\fYc;4И0\"7\u0004+ rV<ў:a)a.qLȈ2\r!|8\u0004dI;r˹2\bD\u007fJO\u0010Dvg{y1@]ߜ|\bRK\u001fw b\u001b̙\u001fY\u00195~1\u0005|5-\u0019>\u0017Ze.A~\u000b>\u001f\b8X?\u0003D\u00194FN\b\u0019Ϫ@Sq~\tk}^á//y_*K>\t6}M &\u00148\f@!KX]>\u001bӷlnRWD]\u0019۪+tT4\"5\u0017H\r\u0014Y̊лv\u001ejh\u007f,-\u0016%G\u000f\n4IWD91\u0001BaΠכ\u000fo.2Y&H\u001f\r\u0002@A?q0k:a^Tk\u001dW]2\u0015|\u0003\\ɔu<P\u001eD\u0011<\u0014˲^8.{%-*yi3o?A\u0005#V\u001eo5\u001c{շܱW%0@E\u000f\u001b\u007f\u00121\u001a`$;\u0001AG\u000f\u001e\u001e\u001ef\u0004TC'd3\u001c\u0004uJ5\u07b7sX\u001fabHc\u0096N}c^\u0018\nM'T\n\u0004J\u0018Eg\u05faZcjlns\u000e\u0003l*߂rD1\n5\f\u0002MDiNĵ\u0015_oQYzB\u001c\u000b>Ѓ1l\u0015\n\u0016B\bP\\\u0019U\u0016G\u000f<ӽC\u0019\r\u0010\u0006pnԴyv[ut]j\u0016$\bHyy60Ùp]8NE\u0012\u000bb\u001bn{\u001bw\u0010f\u0015=\u0011\u0012BIR\u0017ٻ\u0011!&rcv|5\r|[Wz\u000bn\u0012Td<d$\r\u001c\u0015\\Q]\u0002ҍN`#_{\u000f\u0002\u000f_\u001ef}1\u001dG\u06035\b5g!Fmޟ\"\\KVK\u000b\u001cM\t9sz\u001dUON\u0015/#\u001f\u0003+\\J\u0007B(Jp\u0006DȊ\u0015L\u001ee\u0011D^l`4>f\u0017Zq`G\u001c؞AU#4Gmp\u0007sp!-GW%ְe%=x8\u0002>ÝI\u0017\u0019Ek9hֿ$\u0011?j\u0014\b\u0013H\u0006\r{\u001a(\u000fqL1/<ܚ?C[l\rdmj\u001e?ך\u0010 5vNI26\u007f\u001fy\u00102_9ԕFX9H\u0002X?ޯrz\u001d2\r\u0018>\u000eHU<۳\u0016\u0013r\u001ck:\u000eގ\\2~]_O\u0019QZi}\t\rY{Nqua{?H)q_a$n\bƁh@'W\\?)\u0001HܮVe\noA0MƉ\u0014qx l`GXd{>5\u0012~vfNct̡Xn)f\u0006|I#\u000bbŞdpV\u0014X\u0018z\u0003?DXl)\u00017ɘq\u0019$7zu9fa\u05fbRe0zu%}͆6\u001ex2\u0010!\f_C6Cѥ<~%\u0005te!U3\u0005Վ4\u0004y\u0007zvh\u00194;j)}h>Ɏ\u001e\u000e\r\u0005bmiQ\u007f;Ovr1;\u001eHD\bIUq+\u000f)>\u00182\u0004ë\u000bph\\[-*We\u0012\u000b3CFY\u007f\f5gq\u0006̤m 9} vNȨ\u001c\u0016\u0012\u0002b#}l\u0013\u0015kUew=Ƃl]O.\"\"_#8\u00195$`4x;h#ò\u00136&%/>\u0007\u0001!q\u001c1\u0005uDٲ}@\u0004f\u0014fbߦmYk\u001c]-]t8OW\f\u0017+u\u0011y\u001aHndm$^mX$R\u001fo:έ@wn|Z\u0017.\u0007\u00138yP\u0014G1\u0017\u001bO<<rf\u001du=Pݰ\u0014=$i\\NLQA/P'o`\u001eՐK\u000b\u0001\u001dmPsژ;H\u001f\\x2l\u0015?Lf\u000e&\u001b8ܕ{h(BQE/?{\u0019i\u001a\u007fc\u007f%\u0018XyxG\u0016\b\u0018F\u001d6߿I\u000f\u0004P\u00154\u00160ϗY#\u001c\u00067\u0018\u0016QH>W_j e\u0601\u0018\u0010Zf\u0003O;\u05fc7|<.\u000f~'A%\u0002`ԝ2\u001fSeOf3ۢ\u001d?k~kd)!\u001f_i{H}4vCQ-f&0\u0018\u0002\u0005[jќ\u0006\u0003PHI\u000bH\u0015vZ\"e}X\u00157\u001aAg؉cr)+.^\rȝ5\u001d3X@\u0017(*qlIӞ%*2CIuI˷9\u0014*g=\t[T'~(H( \u0004\u0013o\u000e!7vw.vy@>D!Y\\o\u000e.!Ъzyn\u0010\u0006pj/Ew~\u00116q>`K\u0016r\\zυk*T\u0017D\u001d5)Rח<r>Oth,r'Vp9x4%κ\tDCW;\u0001\\\u007f1\r1sC\u0014l\\\u0006Vr_~\u0003`E\"^+ɠy~\u00181S\u00034\u001dѯ6\u001cG(Bdy\u0016X0:d$$\u001c\u0382\u001dN`-P5u;PИl\u001f\u0002d\u0017\u0017?C\u001bx\u0012V^\u0011)х!5@_w\\M/\u000f9~<\u0012;`TQM%ȅ*\u001968\u00186Q\u001dӱ&\u001cSJ\u0006\u00023x%-z\u000e\u0005\u0003Sǃ\u0002^n*u\u0001\u001c#Bϕ/:~`\u0003>$\u001fd\u0018\u0003@zib1rr]z.\u001euP7W(õ#cD}pLHS%IO94\bE\u0019+,\u0013LzٺCnsG\fur\f=ޑmmU\u0016du)\u0001L6\u007f^\u0010r\u0010nfI\u000e:ADw:x\u0002T'ZV\u0015>Y\u0014\\\u000bx¥#4P\u001e6\u001alewִx\u0006j\u001e\u0005iT+\u000e\u000e\u001də}@\u001cM{U\\Ɠf/mS\u0017\u0002\u0007Xv\u0013uֶ\"\u0018\r~rl{\u0004\u0014öS.Tek3\u0010~\bWx-`\u0017`gdF\"A#\u001eX]f\u000bS\u0006u\u001e6D\\zVN{ю\u001502\u001a\u0019';ʷ!s^ p\u0001\fIiK+\\llIspv\u000eĴ`jG\u0016Ap`Ÿ|clCE_9\u001c\u0011\u001d\u001cNali9b=GG\u0010܄gH|\bd\u001es߽Os\u0013U\u0007?ymF+M\u0004\u0010[\u0017)p\u0014\u0011x-P0(\"'CϤM \u0007\u0014l&3\\\u001eP֢\u0006rX\u0006]\u000b^uO\u001eU?SU\u0017ß\u0002=5^\u0001\u000b?ΌV3\u0017\u007fAg\u001b);ڏߨh\fW'&C?6z\n\u0018T\u001e\u0014\t\u001b44D% ȉƞ\u001a\u001bn\u0010\u0002~u9KC\u0014\u0010`P&\u0089AZ\u0005k$an\u0013`\u001dNGH- j\u0007gI\u007ff\u0016zFa߳^J'<:-`e(T7O8b\u0017\u0004ܜvYs\u0007'^\u0001)u\r\u0010qwE\u001d\u0096UOu ,Q\u0011\u001b\bˊ\u001d\u0013x-lEjg'F:idvV͝<Ttd7:\u0002xXp6[ApS_ψNN_\u0004Y#hn<\rp?N\u001d*υ\u0017\u001d#BMy p;γh\u0011\u0003j]M\bdQ6oa\rk7ˎK\u0017\u0012*G\u0014\u000b^ܔ\u0001*\u0004]TP>\u0019[yQQ5!G\u05fd|\u000eGI\u0017y\u0010_\u0010ۍs\u000b\u0013C/G/M$L|\u001fX`\u001dY}HoR\u0005h\u001f1\u001cn*\u0014\"Հ=[\u0006fSdN\u0003+Ŗ\u000eHp2%\u0011U-]\u0011*h!MwV\u00021nZ\"25aas\u0014.D̽!4\u000f\u007fT5\fE\u0010Х\u0014\bJ-Ziy\r^6jԟ\u001fLdr:/*ӵ|#QEi\u0003\u0015`T]Uד\u001e|\u00170S{\u0007drң2\u0014t\u0006\nD<P8\u001c|iQ!\u0010nJu>\u000er\u000fZW\"\u001d\u0010A9\u00ad\u0010G8j\u001em7ţFw*$sU\u001b\u0012~\u001fD\u00056F@(}t|v<\u0017 Tw:UŗZ}WN\u007fc;م-\\ms[mI>%\u0001#CXȾO=/w\u000feoղ\u0015~kD++)^?~Csd\\\u001c\"z`ӯ\u0017M0M&%H\u000f\b\u00154~8$V5\u0019-|5kCӓ'q\u0017\u0007Aq]spp\u0007\"\bdx)s\b5,fT06+5!\u0007\u0014dGS)juUXU}۞7ρ\u001a\u001fuP\u001bk0IESaqnC\u000ea\u007fK@\u0017~ל;Ά!MpҶz\u0003,1GND\u0001tͺ}ڔ+P,˝\u0003`\r\u0005<:0'0\u001d\u001c\u05fb\u001fکg{\u0014ߪϲ?9"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WK?p\t\u001c%\n2qp*R\u001b\u0011h\"yA\u0012rEY5", "\u0019", "$", "", "2`c.@(I", "", "<nS2@(I", "0tU3X9", "", "uH8(?1:d\u0015H\u0002Z5~R\u0019b\u0005(yOVZ\b", "=v]2W\tR", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012W:\r\u0012b=+8,G.\u0004)M\t?w\u0015u(\u00175w~EZ\u001b\u001d", "uH8(?1:d\u0015H\u0002Z5~R\u0019b\u0005(yOV}\u0013Pn\u001bFz$H#{*?x <M\rH{=-\u0019pa\u0003\u0007v;N\u00040CS\u00182fayA\u001d%$\fX2\u0014\u0005WP(xMEh\f4Q\u0012Jd}\u0013\u0016W9s\u007fBc\u0019C\u0001^]Q8dC]f}VU/t3d\u0019m `E\u0010g\u0005", "\nrTA \u0006\u0017", "5dc\u000fh-?S&=\bn5\f\r7ey5{G\u0001\u0013%G", "u(J\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", ")KY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}", "/bR2c;", "", "Dhb6g6K", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001385U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "<nS2", "AgX3g", "6`b5", "/bR2c;|`)\b\nb4|\u0003<e\u0007(wN\u0001", "/r8;f,Kb\u0006~\tn3\f", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WK?p\t\u001c%\n2qp*R\u001b\u0011h\"yA\u0012rEY\u001eaQ@Ic.b\bn!fC'$\"\u0002 *>", "/rD=W(MS\u0006~\tn3\f", "0tU3X9&]*~Zg;\n\u001d\u001eoh2z@", "9dh\u0016a+>f", ">nb6g0H\\\u0001z\td", "<df\u0018X@!O'\u0002", "<df\u0018X@", "<df#T3NS", "=v]2e", "uH8\u0016?1:d\u0015H\u0002Z5~R\u0019b\u0005(yOV}\u001cC\u0001\n\u0006}!>[G\n4r\u0016,\\\u0019\u001fR0'\u0014uk=\u0006vuL\u0001/RV\\,&_\u0003F#\u0016b\u000e\u0018+ \u0014YN-jK\u0001%\u0012;P\u0006D{J\n \u0015<jnQZ\u001aP\b^yI1xUU\\\u0001G\u000bIk9d\u0019h\u0019c\u0004\"4#m\u0016\u001foT=\u001eee\u001ar_\bjkRn>.\u000bCilB\u000fvQEvp\tH\u0001w\u0010A.", "1`[0h3:b\u0019l~s,", "1n[9\\:B]\"\\\u0005g;x\r8se(\u0010", "", "9dh", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "1n[9\\:B]\"`zm", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004", "1n[9\\:B]\"i\u000bm", "D`[BX", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016[<eavE\u0014[Z!]+\u001a\u000eUHmtNF&\f5\\K9r\b\u0013\u0016\fDnzKdYK\u0002\u001d\u0006P%eMY)}OLLb2d\u0015n\u0019k>D-\";\u001d#p`=\u0006xZ\u0011ZN\u00051VT\u001dz!.=m\u001a.OnY=x%\u001bZ\u007f\u0002\u001b\u001fX\u0003;{<Y", "1n[9\\:B]\"kzf6\u000e\t", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'| \u0016Ty\u0012;\nn3c\u0006+A{\u0016wZSDz8&\u00152aL\u0016c9Wr.\u0011RX;cV{P]\u0010d\u0015U+\u000b\u0014]K-|\u000e;'\u0010<X}8o\u0001U\u001a\u0016@qpJV\u0019Vu$yK2v\u0010]g\u0002WPA_1ds[(&)G(\u0014Z#\u001ah&", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016[<eavE\u0014[Z!]+\u001a\u000eUHmtNF&\f5\\K9r\b\u0013\u0016\fDnzKdYK\u0002\u001d\u0006P%eMY)}OLLb2d\u0015n\u0019k>D-\";\u001d#p`=\u0006xZ\u0011ZN\u00051VT\u001dz!.=m1", "1n[9\\:B]\"kzf6\u000e\t\u000fn\u000f5\u0010\u001c\u0010z Fo!", "7", "1n]AT0Ga~~\u000f", "9dh\u0015T:A", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q$D\f", "3kT:X5Ma|}zg;\u0001\u0018CE\f8wG\u000f", "=sW2e\u0015HR\u0019", "3mc?l\nHc\"\u000e", "3mc?l\nHc\"\u000e9k<\u0006\u00183m\u007f\"\t@\b\u0017\u0013Uo", "3mc?l\u0012>g|\by^?", "3mc?l\u0012>g|\by^?;\u0016?n\u000f,\u0004@z$\u0017No\nJv", "5dc", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q$D}\u001cC\u0001\n\u0006}!>[G\n4r\u0016,\\\u0019", "6`b\u0012a;Kgt\u000e", "6`b\u0012a;Kgt\u000e9k<\u0006\u00183m\u007f\"\t@\b\u0017\u0013Uo", "6`b\u001bb+>/(", "7mb2e;\u001e\\(\f\u000f:;", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004\u0011*7t3+\u001fl`LPa6V\u00021UL\u00189l[\u0002A\u001c\u0012$\u000ea:\r\u0012b=+8JA.\u000f0R\u0015\u0005f\u000b\u0013\u001d\u000e3ytL_\u001e\u0011}\u001d}Q8dC`_CKIPi*l\fh,XI>.\u001d\u007fb\u001fpX>\u0019wP\u0018r:ur16&~8\rHl[\u001c", "9dh\u000eg\u0010GR\u0019\u0012", "uH\u0018\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", ";`Z2A6=S", "9dh\u0015T:A\u001f", "9dh}", "D`[BXw", "9dh\u0015T:A ", "9dh~", "D`[BXx", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u00041*@gE\u001a^o]B\t-\u0016K{'E[$\u0013aN\u00049]\u0019V\u0017Ptv\u0002^A\"}\u001a\u001b\u0006\u00045H\u000fEl\u007f\u001f_\f?r{Ld\u0010\u0011\u0007%~P-pF#_\rVARk&kUe'kA>-';\u0017%oW.\b\u000bW\u001b{`CkoO)\n4!Em%JN~UI}#&\u0015c\b!.Ux2x<\u0018\u001e<?d\u0012Yj\u001cI4<{(e@40:;&\tIm}wH\u001chhn\u0018\u0017q99\u0019/evW\u000f\u0014f\u0013b~gi\u0010>V\u000fQ\u0013m\u001f.M~@j}\u001f\u0012\u0015mqmQS*P}!p\u000e&g\u001c\n\u0003n\u0018%=\u0012L]\u0019q8);U\u001b\u0019w4\t\u0003Y+\u0011{\u0012~zOrDan$\f", ";ne285M`-m\u0005G6{\t", "uH8\u0016?1:d\u0015H\u0002Z5~R\u0019b\u0005(yOV}\u001cC\u0001\n\u0006}!>[G\n4r\u0016,\\\u0019\u001f/\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001c\u007fM\u001d!^\u0016Nt\r\u0018hA1w@>h\u000e6X\t?q\u0014U\u0014\u0018<qp@e\u0014Q\u0003#?E1pVh[vNA\u000ff2o\u0013_%\\CI #u#$v\u001a2\u0012\u0004c nO\u0001gOC$D'1BmDPDo+", ";tc.U3>1#\u0006\u0002b:\u0001\u00138P\u00107", ";tc.g6K", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WK?p\t\u001c%\n2qp*R\u001b\u0011d\u0015\u0003O-vUYh\t*=Se\u0012`\u0017<-`A9$!G", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|k\u0015IL:x>\"\u0014{+7\u0011k7X\u0005'\u0011Y^5kVz=]\u0012m\u001dN8\u0016\u0001`\u000b*xS>#\u0011?\u0013\u007fEo\b\f\u0014\u001d9tyP \u0014O\u0002%\u0005=&oF#c\u0002RHEj*m\u001b[,`DC2]u!#x_*\u0007\u0003Sxn]CRgT'~F3>vj)A}X$p2{[\u007f~\u00112eJn[)\r37@h\u0004^1\u0016Hf\u0004\u001f:\\\u000b46?K\u0017GK-u\u007fM\u000eu(]\u000fWh?@ inv\u0012\r\u0011d\u001e[3pc\u000b@`OBQw%6B{I[C\u0019\u0011\u0012+mmIL*P\u0010\u001ezM0)\u0015\u000b\u000bv'\u0018+\u001d=A\u000bssNDQ\u0013qr7\fQ", ";tc.U3>1#\u0006\u0002b:\u0001\u00138P\u00107WG\b", "7mc2e:>Q(\u0003\u0005g\n\u0007\u00198t\u007f5", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012W:\r\u0012b=+8#7&\u0017('\fKq\u0010\f#c", ";tc.U3>1#\u0006\u0002b:\u0001\u00138R\u007f0\u0006Q\u0001", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}b<\n\u0016$Qs\rO@#?a\t*Em_;]LJo<\u001e^htH\u0007p5J}pMV]3`[\u0006\u0007\u0012\u001ca\u0015N)\u001c\tcJ28H?'\u0018;E~BhJ\u0010\u001e\u0019<jxB_\u001fC\t\u0019\u007fJ72Jag\nV=Bi*L\bjfG:G2\u0018\u007f(\u001bq_\u0011\u0006\nVxn]VwkN\u0018zEy\u0002TWOD|_@s:hI\u0006\u007f\u001d<ftt\u0002=\rC.>dNKz'>k\u0002\u00113&G15=@\u001cR\u0015a\u007fsE\u000ef.e\u0012\u0017p~5!murD\f\u000e]`_=lf\u0001?R\u000fME~\u00191O\r\f_\u0002\u001d\u0019\u0016 jlI+\u0017_J\t}H\"H\u001b\u0002\u0003<", ";tc.U3>1#\u0006\u0002b:\u0001\u00138R\u007f0\u0006Q\u0001v V|\"\u0018\u0006\t>X}3", ";tc.U3>7\"\rzk;\\\u0012>r\u0014\u0004\u000b", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u00044?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016[<eavE\u0014[Z!]+\u001a\u000eUHmtNF&\f5\\K9r\b\u0013\u0016\fDnzKdYK\u0002\u001d\u0006P%eMY)}PPEo3`\u0013)\u0005lI6!\u0018x\u001d*|:@\u0013{`\u001fuV\u0005=+.\u0015\u000471HqZY\u000fm_D\u007f1-KE\u0005\";gx3tv\u0004G96q\u000eGnaDh\b\u001c0eTp$@C\u001a?IryvG\u001c2#i\u0010\u001eq1. e/gP\u001a\u000e]\u001f[>p[\u0010;\\\u000fL\u0013s\u001d/V\u000e>X\u0001\u0015p\u0003/7TVG\u001b=\u000b\u0019p\u001a", ";tc.U3>;#\u0010z>5\f\u0016CT\n\u0011\u0006?\u0001", "uH8\u0016?1:d\u0015H\u0002Z5~R\u0019b\u0005(yOV}\u001cC\u0001\n\u0006}!>[G\n4r\u0016,\\\u0019\u001fR0'\u0014uk=\u0006vuL\u0001/RV\\,&_\u0003F#\u0016b\u000e\u0018+ \u0014YN-jK\u0001%\u0012;P\u0006D{J\n \u0015<jnQZ\u001aP\b^yI1xUU\\\u0001G\u000bIk9d\u0019h\u0019c\u0004\"4#m\u0016\u001foT=\u001eee\u001ar_\bjkRn>\u001f GlhPInh\u0006r1'V\u0006\u0006\u0012{e\u00054\u00041\f4s6w\u0014Kt!:eB\u001b6kH+/I\u0006\u0011IRjujM\u0012r(oQ\u0012j=A(abjHX\u000be\"b5i_\nFN\u0015BSx#pJ\u0007Jk\t\u0011\u0006\u000e$UaT\r\na\u0005\u001aYN!_f", ";tc.U3>>)\u000e", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u00041*7t3+\u001fl`LPa6V\u00021UL\u00189l[\u0002A\u001c\u0012$\u000ea:\r\u0012b=+8JA.\u000f0R\u0015\u0005f\u000b\u0013\u001d\u000e3ytL_\u001e\u0011}\u001d}Q8dC`_CKIPi*l\fh,XI>.\u001d\u007fb\u001fpX>\u0019wP\u0018r:ur12\u0019\bF(L|[OTRQJw\u000f\u001bVX\b\u00169Wt8Jpj035q\u000fOf+\b\\\u0003\u001d7fO'oCL\u001cNOku6>!w\u001fn\u0011\ni~7#tlgQ\"P[!b<a]\u0010;\\\u000fL\u0013s\u001d/V\u000e>X\u0001\u0015R\u000b,xlIK\u001b]\u0010\u0016\u007fH,h\u001fL\u0007n ,=\u0012:`\u000fP&j\u0001< \rh!\u0016zY\u0019", ";tc.U3>>)\u000eVe3", ";tc.U3>>)\u000eVe3]\u00169mi7~@\u000e\u007f!Fok<},", ";tc.U3>@\u0019\u0007\u0005o,", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q$g\u0013 F|\u0018@u8~W\b(Bw$.\u0017PKtC\"\u001dh+9\u001ar,[\u007f#N\u0016T6kYvF'[X\u0018U2\r\u0003hE.wR\u0001#\u00104Y\u00117e\b\f_\u0012=uwB^\u0010P\t\u0011\u0005E3qT#c\u0002OQT^'k\fG\u0019g\u0004%$!\u007f\u001d)wP7\u0019^O\u001fu:urDW\u001d\u00027$KC\u001f-AxTI~+\u001e^Eu\u001c:c~9tv\u0011D3Eh\rK1\u0018Qmx\"5XHp,@K\u001aCTv?jH\u0015o\u001f_\u0017\u0012l>?bimkX\u001e\u0003Z\u001e[~eg\f>R\u000e>R~\u00116J\tKiC\u0019\u0011\u000f4|aFJ\u001b<|%:3/c\u0011k\re\u0018q", ";tc.U3>@\u0019\u0007\u0005o,\\\u0012>r\u0014\u0004\u000b$\n\u0016\u0017Z", ";tc.U3>@\u0019\u0007\u0005o,e\u0013.e[7_I\u007f\u0017*", "<nS2<5=S,", ";tc.U3>@\u0019\n\u0002Z*|q9d\u007f", "B`a4X;']\u0018~", "<df\u001bb+>", ";tc.U3>C$}vm,e\u0013.e[7_I\u007f\u0017*", ";tc.U3>C$}vm,m\u00056u\u007f\u0004\u000b$\n\u0016\u0017Z", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q'| \u0016Ty\u0012;\nn3c\u0006+A{\u0016wZSDz8&\u00152aL\u0016c9Wr.\u0011RX;cV{P]\u0010d\u0015U+\u000b\u0014]K-|\u000e;'\u0010<X}8o\u0001U\u001a\u0016@qpJV\u0019Vu$yK2v\u0010]g\u0002WPA_1ds[(&%:1\"u'*hY=lwa\u0014ZN\u0005DwK y81\u00141BBNnbFx&2\u0015y\u0002\u001a=b\u0003+>:\u0014=9:l\u0005\u0015g+M^\u0006\u001e(c\u000b-0EC\u0017H^-svE\u0015h\u001dp\f\u0018kCz\u001dmmsW\u000b\u0004d\u0017%9ij\b7Z\u0006GXk$+P\bP%}\u001d\u0011\u00173ibPC\u0003P\fc_Q&_y\r\u0002fm", "<nS24;\"\\\u0018~\u000e", "<nS24;\"\\\u0018~\u000e\u001d9\r\u0012>i\b(uM\u0001\u001e\u0017C}\u000e", "<nS2<5=S,=\bn5\f\r7ey5{G\u0001\u0013%G", ">tc", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u00041\u0007\"g=\u001d\"re8\u001a-*X~2QZNuib{L\u0018\u001aZWN>\u001c\u0005fJ u\u000e=)\u00173M\u000bN2~\u0016\u001d\u00155h\u007fF`\u0019UC\u0019}I9wBVfy\u0011EMm1d\u0014_&k6I(\u001ez'dlX6\u001a\u000bO\u000eyRacr\u0011\b\b<$'wZF\u0004W_;x(#Iw\u0007\u0016<aa+\u0003=\u000bC\u007f", "@d\\<i,", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u00041\u0007\"g=\u001d\"re8\u001a-*X~2QZNuib{L\u0018\u001aZWN>\u001c\u0005fJ u\u000e=)\u00173M\u000bN2~\u0016\u001d\u00155h\u007fF`\u0019UC\u0019}I9wBVfy\u0011EMm1d\u0014_&k6I(\u001ez'dlX6\u001a\u000bO\u000eyRacr\u0011\b\b<$'wZF\u001b", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q$D}\u0013Pn\u001bFz$H#{*?x <M\rH{=-\u0019pa\u0003\u0007v;N\u00040CS\u00182fayA\u001d%$\fX2\u0014\u0005WP(xMEh\f4Q\u0012Jd}\u0013\u0016W9r{IV\u0018G\u0003$qP-rOg)}OIUq&a\u0013_\u0005XE\u0004\u0013!u\u0019\u0004rO._", "@d\\<i,\u001e\\(\f\u000f:;`\u0012.e\u0013", "@d\\<i,']\u0018~Vm\u0010\u0006\b/x", "@d_9T*><#}z", "CoS.g,']\u0018~Vm\u0010\u0006\b/x", "CoS.g,/O \u000fz:;`\u0012.e\u0013", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004g\u0013 F|\u0018@u8~W\b(Bw$.\u0017PKtC\"\u001dh+9\u001ar,[\u007f#N\u0016T6kYvF'[X\u0018U2\r\u0003hE.wR\u0001#\u00104Y\u00117e\b\f_\u0012=uwB^\u0010P\t\u0011\u0005E3qT#c\u0002OQT^'k\fG\u0019g\u0004)1\u0018q\u0002%gP\u0004", "D`[BX\bM9\u0019\u0013^g+|\u001c", "\u0011n\\=T5B]\"", "\u001bnS6Y0<O(\u0003\u0005g\u0019|\u0017?l\u000f", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TrieNode<K, V> {
    private Object[] buffer;
    private int dataMap;
    private int nodeMap;
    private final MutabilityOwnership ownedBy;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final TrieNode EMPTY = new TrieNode(0, 0, new Object[0]);

    public TrieNode(int i2, int i3, Object[] objArr, MutabilityOwnership mutabilityOwnership) {
        this.dataMap = i2;
        this.nodeMap = i3;
        this.ownedBy = mutabilityOwnership;
        this.buffer = objArr;
    }

    public TrieNode(int i2, int i3, Object[] objArr) {
        this(i2, i3, objArr, null);
    }

    /* JADX INFO: compiled from: TrieNode.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u0006DLc\u0003İIي8\u000bDB\u0007Ӭ4\u0012\u0006\rnj?7Le^.Zݷ0ş\u0002ڔ\\&a$\u007fBcW ~0\t\u007fN\u0016h/ij\u001bQ\u0011\u001e\"\tl<I\fxm\u0014\u001f2xpm6]sK=xtd\nڶ6\"F\u007fM@(7`\u001c\u0007|SKB\u0012@B\u0001:\t\u000e{ĨJ:\u0014L8%.jwZFJ|]p/3\u0005yB\u0005(\u000e3\r[\u001dRd)\u001dv\u0018\u001e;BG5K&\u0002\u00065a\"α\t\u0010\u0016K\u0007\u000137-Ys\u000e6h\u0002$\u0015aP;`I̭hԇUl\u0014ʬCQiR^\u0016Hy\u0001\u0005\u001bFT\u001d\u0014+`.[\u001fǴ\f\u0014;ο\u000bUF[\u0010j۶\u0004\u000b"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WK?p\t\u001c%\n2qp*R\u001b\u0011h\"yA\u0012rEY\u001eaQ@Ic.b\bn!fC'$\"\u0002 *>", "\u0019", "$", "", "<nS2", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WK?p\t\u001c%\n2qp*R\u001b\u0011h\"yA\u0012rEY5", "Ahi27,Eb\u0015", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW<\n45f\u0007\u001c>7\u001c8\\J?tGg\u0013rh@\u0007a;R\u00010U\u0016R4db\u00029\u0011\u0019ZWR3\u0018\fYI$wS3.\f6R\u0010\u0005l\t\u0014&\u001d1gwB>\fRC\u0004\u0003E)QPX_O+\u00056", "5dc\u001bb+>", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006v8DY\u000b)3t_4WRBo=1^fk@\u000ec*]z1PZ\u00180dZ\u0003L\u0010\u000fa\u000e\u0018/\u0015\u0010`A,nMF\u001b\u00170S\u000bI2\u0005\u0014\u001e\u001eDfmIVwC\u0005^dN-h/c^y\u001d", "Adc\u001bb+>", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW<\n45f\u0007\u001c>7\u001c8\\J?tGg\u0013rh@\u0007a;R\u00010U\u0016R4db\u00029\u0011\u0019ZWR3\u0018\fYI$wS3.\f6R\u0010\u0005l\t\u0014&\u001d1gwB>\fRC\u0004\u0003E)QPX_O\u000b2", "5dc \\A>2\u0019\u0006\nZ", "u(8", "@d_9T*><#}z", "=oT?T;B]\"", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class ModificationResult<K, V> {
        public static final int $stable = 8;
        private TrieNode<K, V> node;
        private final int sizeDelta;

        public ModificationResult(TrieNode<K, V> trieNode, int i2) {
            this.node = trieNode;
            this.sizeDelta = i2;
        }

        public final TrieNode<K, V> getNode() {
            return this.node;
        }

        public final int getSizeDelta() {
            return this.sizeDelta;
        }

        public final void setNode(TrieNode<K, V> trieNode) {
            this.node = trieNode;
        }

        public final ModificationResult<K, V> replaceNode(Function1<? super TrieNode<K, V>, TrieNode<K, V>> function1) {
            setNode(function1.invoke(getNode()));
            return this;
        }
    }

    private final ModificationResult<K, V> asInsertResult() {
        return new ModificationResult<>(this, 1);
    }

    private final ModificationResult<K, V> asUpdateResult() {
        return new ModificationResult<>(this, 0);
    }

    public final Object[] getBuffer$runtime_release() {
        return this.buffer;
    }

    public final int entryCount$runtime_release() {
        return Integer.bitCount(this.dataMap);
    }

    public final boolean hasEntryAt$runtime_release(int i2) {
        return (-1) - (((-1) - i2) | ((-1) - this.dataMap)) != 0;
    }

    private final boolean hasNodeAt(int i2) {
        return (i2 & this.nodeMap) != 0;
    }

    public final int entryKeyIndex$runtime_release(int i2) {
        return Integer.bitCount((-1) - (((-1) - (i2 - 1)) | ((-1) - this.dataMap))) * 2;
    }

    public final int nodeIndex$runtime_release(int i2) {
        return (this.buffer.length - 1) - Integer.bitCount((-1) - (((-1) - (i2 - 1)) | ((-1) - this.nodeMap)));
    }

    private final K keyAtIndex(int i2) {
        return (K) this.buffer[i2];
    }

    private final V valueAtKeyIndex(int i2) {
        return (V) this.buffer[i2 + 1];
    }

    public final TrieNode<K, V> nodeAtIndex$runtime_release(int i2) {
        Object obj = this.buffer[i2];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (TrieNode) obj;
    }

    private final TrieNode<K, V> insertEntryAt(int i2, K k2, V v2) {
        Object[] objArrInsertEntryAtIndex = TrieNodeKt.insertEntryAtIndex(this.buffer, entryKeyIndex$runtime_release(i2), k2, v2);
        int i3 = this.dataMap;
        return new TrieNode<>((i2 + i3) - (i2 & i3), this.nodeMap, objArrInsertEntryAtIndex);
    }

    private final TrieNode<K, V> mutableInsertEntryAt(int i2, K k2, V v2, MutabilityOwnership mutabilityOwnership) {
        int iEntryKeyIndex$runtime_release = entryKeyIndex$runtime_release(i2);
        if (this.ownedBy == mutabilityOwnership) {
            this.buffer = TrieNodeKt.insertEntryAtIndex(this.buffer, iEntryKeyIndex$runtime_release, k2, v2);
            this.dataMap = i2 | this.dataMap;
            return this;
        }
        return new TrieNode<>((-1) - (((-1) - i2) & ((-1) - this.dataMap)), this.nodeMap, TrieNodeKt.insertEntryAtIndex(this.buffer, iEntryKeyIndex$runtime_release, k2, v2), mutabilityOwnership);
    }

    private final TrieNode<K, V> updateValueAtIndex(int i2, V v2) {
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[i2 + 1] = v2;
        return new TrieNode<>(this.dataMap, this.nodeMap, objArrCopyOf);
    }

    private final TrieNode<K, V> mutableUpdateValueAtIndex(int i2, V v2, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        if (this.ownedBy == persistentHashMapBuilder.getOwnership()) {
            this.buffer[i2 + 1] = v2;
            return this;
        }
        persistentHashMapBuilder.setModCount$runtime_release(persistentHashMapBuilder.getModCount$runtime_release() + 1);
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[i2 + 1] = v2;
        return new TrieNode<>(this.dataMap, this.nodeMap, objArrCopyOf, persistentHashMapBuilder.getOwnership());
    }

    private final TrieNode<K, V> updateNodeAtIndex(int i2, int i3, TrieNode<K, V> trieNode) {
        Object[] objArr = trieNode.buffer;
        if (objArr.length == 2 && trieNode.nodeMap == 0) {
            if (this.buffer.length == 1) {
                trieNode.dataMap = this.nodeMap;
                return trieNode;
            }
            return new TrieNode<>(this.dataMap ^ i3, i3 ^ this.nodeMap, TrieNodeKt.replaceNodeWithEntry(this.buffer, i2, entryKeyIndex$runtime_release(i3), objArr[0], objArr[1]));
        }
        Object[] objArr2 = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[i2] = trieNode;
        return new TrieNode<>(this.dataMap, this.nodeMap, objArrCopyOf);
    }

    private final TrieNode<K, V> mutableUpdateNodeAtIndex(int i2, TrieNode<K, V> trieNode, MutabilityOwnership mutabilityOwnership) {
        Object[] objArr = this.buffer;
        if (objArr.length == 1 && trieNode.buffer.length == 2 && trieNode.nodeMap == 0) {
            trieNode.dataMap = this.nodeMap;
            return trieNode;
        }
        if (this.ownedBy == mutabilityOwnership) {
            objArr[i2] = trieNode;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[i2] = trieNode;
        return new TrieNode<>(this.dataMap, this.nodeMap, objArrCopyOf, mutabilityOwnership);
    }

    private final TrieNode<K, V> removeNodeAtIndex(int i2, int i3) {
        Object[] objArr = this.buffer;
        if (objArr.length == 1) {
            return null;
        }
        return new TrieNode<>(this.dataMap, i3 ^ this.nodeMap, TrieNodeKt.removeNodeAtIndex(objArr, i2));
    }

    private final TrieNode<K, V> mutableRemoveNodeAtIndex(int i2, int i3, MutabilityOwnership mutabilityOwnership) {
        Object[] objArr = this.buffer;
        if (objArr.length == 1) {
            return null;
        }
        if (this.ownedBy == mutabilityOwnership) {
            this.buffer = TrieNodeKt.removeNodeAtIndex(objArr, i2);
            this.nodeMap ^= i3;
            return this;
        }
        return new TrieNode<>(this.dataMap, i3 ^ this.nodeMap, TrieNodeKt.removeNodeAtIndex(objArr, i2), mutabilityOwnership);
    }

    private final Object[] bufferMoveEntryToNode(int i2, int i3, int i4, K k2, V v2, int i5, MutabilityOwnership mutabilityOwnership) {
        K kKeyAtIndex = keyAtIndex(i2);
        return TrieNodeKt.replaceEntryWithNode(this.buffer, i2, nodeIndex$runtime_release(i3) + 1, makeNode(kKeyAtIndex != null ? kKeyAtIndex.hashCode() : 0, kKeyAtIndex, valueAtKeyIndex(i2), i4, k2, v2, i5 + 5, mutabilityOwnership));
    }

    private final TrieNode<K, V> moveEntryToNode(int i2, int i3, int i4, K k2, V v2, int i5) {
        Object[] objArrBufferMoveEntryToNode = bufferMoveEntryToNode(i2, i3, i4, k2, v2, i5, null);
        int i6 = this.dataMap ^ i3;
        int i7 = this.nodeMap;
        return new TrieNode<>(i6, (i3 + i7) - (i3 & i7), objArrBufferMoveEntryToNode);
    }

    private final TrieNode<K, V> mutableMoveEntryToNode(int i2, int i3, int i4, K k2, V v2, int i5, MutabilityOwnership mutabilityOwnership) {
        if (this.ownedBy == mutabilityOwnership) {
            this.buffer = bufferMoveEntryToNode(i2, i3, i4, k2, v2, i5, mutabilityOwnership);
            this.dataMap ^= i3;
            this.nodeMap = (-1) - (((-1) - this.nodeMap) & ((-1) - i3));
            return this;
        }
        return new TrieNode<>(this.dataMap ^ i3, i3 | this.nodeMap, bufferMoveEntryToNode(i2, i3, i4, k2, v2, i5, mutabilityOwnership), mutabilityOwnership);
    }

    private final TrieNode<K, V> makeNode(int i2, K k2, V v2, int i3, K k3, V v3, int i4, MutabilityOwnership mutabilityOwnership) {
        Object[] objArr;
        if (i4 > 30) {
            return new TrieNode<>(0, 0, new Object[]{k2, v2, k3, v3}, mutabilityOwnership);
        }
        int iIndexSegment = TrieNodeKt.indexSegment(i2, i4);
        int iIndexSegment2 = TrieNodeKt.indexSegment(i3, i4);
        if (iIndexSegment != iIndexSegment2) {
            if (iIndexSegment < iIndexSegment2) {
                objArr = new Object[]{k2, v2, k3, v3};
            } else {
                objArr = new Object[]{k3, v3, k2, v2};
            }
            return new TrieNode<>((-1) - (((-1) - (1 << iIndexSegment)) & ((-1) - (1 << iIndexSegment2))), 0, objArr, mutabilityOwnership);
        }
        return new TrieNode<>(0, 1 << iIndexSegment, new Object[]{makeNode(i2, k2, v2, i3, k3, v3, i4 + 5, mutabilityOwnership)}, mutabilityOwnership);
    }

    private final TrieNode<K, V> removeEntryAtIndex(int i2, int i3) {
        Object[] objArr = this.buffer;
        if (objArr.length == 2) {
            return null;
        }
        return new TrieNode<>(i3 ^ this.dataMap, this.nodeMap, TrieNodeKt.removeEntryAtIndex(objArr, i2));
    }

    private final TrieNode<K, V> mutableRemoveEntryAtIndex(int i2, int i3, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        persistentHashMapBuilder.setSize(persistentHashMapBuilder.size() - 1);
        persistentHashMapBuilder.setOperationResult$runtime_release(valueAtKeyIndex(i2));
        if (this.buffer.length == 2) {
            return null;
        }
        if (this.ownedBy == persistentHashMapBuilder.getOwnership()) {
            this.buffer = TrieNodeKt.removeEntryAtIndex(this.buffer, i2);
            this.dataMap ^= i3;
            return this;
        }
        return new TrieNode<>(i3 ^ this.dataMap, this.nodeMap, TrieNodeKt.removeEntryAtIndex(this.buffer, i2), persistentHashMapBuilder.getOwnership());
    }

    private final TrieNode<K, V> collisionRemoveEntryAtIndex(int i2) {
        Object[] objArr = this.buffer;
        if (objArr.length == 2) {
            return null;
        }
        return new TrieNode<>(0, 0, TrieNodeKt.removeEntryAtIndex(objArr, i2));
    }

    private final TrieNode<K, V> mutableCollisionRemoveEntryAtIndex(int i2, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        persistentHashMapBuilder.setSize(persistentHashMapBuilder.size() - 1);
        persistentHashMapBuilder.setOperationResult$runtime_release(valueAtKeyIndex(i2));
        if (this.buffer.length == 2) {
            return null;
        }
        if (this.ownedBy == persistentHashMapBuilder.getOwnership()) {
            this.buffer = TrieNodeKt.removeEntryAtIndex(this.buffer, i2);
            return this;
        }
        return new TrieNode<>(0, 0, TrieNodeKt.removeEntryAtIndex(this.buffer, i2), persistentHashMapBuilder.getOwnership());
    }

    private final boolean collisionContainsKey(K k2) {
        IntProgression intProgressionStep = RangesKt.step(RangesKt.until(0, this.buffer.length), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (!Intrinsics.areEqual(k2, this.buffer[first])) {
                if (first != last) {
                    first += step;
                }
            }
            return true;
        }
        return false;
    }

    private final V collisionGet(K k2) {
        IntProgression intProgressionStep = RangesKt.step(RangesKt.until(0, this.buffer.length), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
            return null;
        }
        while (!Intrinsics.areEqual(k2, keyAtIndex(first))) {
            if (first == last) {
                return null;
            }
            first += step;
        }
        return valueAtKeyIndex(first);
    }

    private final ModificationResult<K, V> collisionPut(K k2, V v2) {
        IntProgression intProgressionStep = RangesKt.step(RangesKt.until(0, this.buffer.length), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (!Intrinsics.areEqual(k2, keyAtIndex(first))) {
                if (first != last) {
                    first += step;
                }
            }
            if (v2 == valueAtKeyIndex(first)) {
                return null;
            }
            Object[] objArr = this.buffer;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, size)");
            objArrCopyOf[first + 1] = v2;
            return new TrieNode(0, 0, objArrCopyOf).asUpdateResult();
        }
        return new TrieNode(0, 0, TrieNodeKt.insertEntryAtIndex(this.buffer, 0, k2, v2)).asInsertResult();
    }

    private final TrieNode<K, V> mutableCollisionPut(K k2, V v2, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        IntProgression intProgressionStep = RangesKt.step(RangesKt.until(0, this.buffer.length), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (!Intrinsics.areEqual(k2, keyAtIndex(first))) {
                if (first != last) {
                    first += step;
                }
            }
            persistentHashMapBuilder.setOperationResult$runtime_release(valueAtKeyIndex(first));
            if (this.ownedBy == persistentHashMapBuilder.getOwnership()) {
                this.buffer[first + 1] = v2;
                return this;
            }
            persistentHashMapBuilder.setModCount$runtime_release(persistentHashMapBuilder.getModCount$runtime_release() + 1);
            Object[] objArr = this.buffer;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, size)");
            objArrCopyOf[first + 1] = v2;
            return new TrieNode<>(0, 0, objArrCopyOf, persistentHashMapBuilder.getOwnership());
        }
        persistentHashMapBuilder.setSize(persistentHashMapBuilder.size() + 1);
        return new TrieNode<>(0, 0, TrieNodeKt.insertEntryAtIndex(this.buffer, 0, k2, v2), persistentHashMapBuilder.getOwnership());
    }

    private final TrieNode<K, V> collisionRemove(K k2) {
        IntProgression intProgressionStep = RangesKt.step(RangesKt.until(0, this.buffer.length), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (!Intrinsics.areEqual(k2, keyAtIndex(first))) {
                if (first != last) {
                    first += step;
                }
            }
            return collisionRemoveEntryAtIndex(first);
        }
        return this;
    }

    private final TrieNode<K, V> mutableCollisionRemove(K k2, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        IntProgression intProgressionStep = RangesKt.step(RangesKt.until(0, this.buffer.length), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (!Intrinsics.areEqual(k2, keyAtIndex(first))) {
                if (first != last) {
                    first += step;
                }
            }
            return mutableCollisionRemoveEntryAtIndex(first, persistentHashMapBuilder);
        }
        return this;
    }

    private final TrieNode<K, V> collisionRemove(K k2, V v2) {
        IntProgression intProgressionStep = RangesKt.step(RangesKt.until(0, this.buffer.length), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (true) {
                if (!Intrinsics.areEqual(k2, keyAtIndex(first)) || !Intrinsics.areEqual(v2, valueAtKeyIndex(first))) {
                    if (first == last) {
                        break;
                    }
                    first += step;
                } else {
                    return collisionRemoveEntryAtIndex(first);
                }
            }
        }
        return this;
    }

    private final TrieNode<K, V> mutableCollisionRemove(K k2, V v2, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        IntProgression intProgressionStep = RangesKt.step(RangesKt.until(0, this.buffer.length), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (true) {
                if (!Intrinsics.areEqual(k2, keyAtIndex(first)) || !Intrinsics.areEqual(v2, valueAtKeyIndex(first))) {
                    if (first == last) {
                        break;
                    }
                    first += step;
                } else {
                    return mutableCollisionRemoveEntryAtIndex(first, persistentHashMapBuilder);
                }
            }
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final TrieNode<K, V> mutableCollisionPutAll(TrieNode<K, V> trieNode, DeltaCounter deltaCounter, MutabilityOwnership mutabilityOwnership) {
        CommonFunctionsKt.m3763assert(this.nodeMap == 0);
        CommonFunctionsKt.m3763assert(this.dataMap == 0);
        CommonFunctionsKt.m3763assert(trieNode.nodeMap == 0);
        CommonFunctionsKt.m3763assert(trieNode.dataMap == 0);
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + trieNode.buffer.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        int length = this.buffer.length;
        IntProgression intProgressionStep = RangesKt.step(RangesKt.until(0, trieNode.buffer.length), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (true) {
                if (collisionContainsKey(trieNode.buffer[first])) {
                    deltaCounter.setCount(deltaCounter.getCount() + 1);
                } else {
                    Object[] objArr2 = trieNode.buffer;
                    objArrCopyOf[length] = objArr2[first];
                    objArrCopyOf[length + 1] = objArr2[first + 1];
                    length += 2;
                }
                if (first == last) {
                    break;
                }
                first += step;
            }
        }
        if (length == this.buffer.length) {
            return this;
        }
        if (length != trieNode.buffer.length) {
            if (length == objArrCopyOf.length) {
                return new TrieNode<>(0, 0, objArrCopyOf, mutabilityOwnership);
            }
            Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(this, newSize)");
            return new TrieNode<>(0, 0, objArrCopyOf2, mutabilityOwnership);
        }
        return trieNode;
    }

    private final TrieNode<K, V> mutablePutAllFromOtherNodeCell(TrieNode<K, V> trieNode, int i2, int i3, DeltaCounter deltaCounter, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        if (hasNodeAt(i2)) {
            TrieNode<K, V> trieNodeNodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release(i2));
            if (trieNode.hasNodeAt(i2)) {
                return trieNodeNodeAtIndex$runtime_release.mutablePutAll(trieNode.nodeAtIndex$runtime_release(trieNode.nodeIndex$runtime_release(i2)), i3 + 5, deltaCounter, persistentHashMapBuilder);
            }
            if (trieNode.hasEntryAt$runtime_release(i2)) {
                int iEntryKeyIndex$runtime_release = trieNode.entryKeyIndex$runtime_release(i2);
                K kKeyAtIndex = trieNode.keyAtIndex(iEntryKeyIndex$runtime_release);
                V vValueAtKeyIndex = trieNode.valueAtKeyIndex(iEntryKeyIndex$runtime_release);
                int size = persistentHashMapBuilder.size();
                TrieNode<K, V> trieNodeMutablePut = trieNodeNodeAtIndex$runtime_release.mutablePut(kKeyAtIndex != null ? kKeyAtIndex.hashCode() : 0, kKeyAtIndex, vValueAtKeyIndex, i3 + 5, persistentHashMapBuilder);
                if (persistentHashMapBuilder.size() == size) {
                    deltaCounter.setCount(deltaCounter.getCount() + 1);
                    return trieNodeMutablePut;
                }
                return trieNodeMutablePut;
            }
            return trieNodeNodeAtIndex$runtime_release;
        }
        if (trieNode.hasNodeAt(i2)) {
            TrieNode<K, V> trieNodeNodeAtIndex$runtime_release2 = trieNode.nodeAtIndex$runtime_release(trieNode.nodeIndex$runtime_release(i2));
            if (hasEntryAt$runtime_release(i2)) {
                int iEntryKeyIndex$runtime_release2 = entryKeyIndex$runtime_release(i2);
                K kKeyAtIndex2 = keyAtIndex(iEntryKeyIndex$runtime_release2);
                int i4 = i3 + 5;
                if (!trieNodeNodeAtIndex$runtime_release2.containsKey(kKeyAtIndex2 != null ? kKeyAtIndex2.hashCode() : 0, kKeyAtIndex2, i4)) {
                    return trieNodeNodeAtIndex$runtime_release2.mutablePut(kKeyAtIndex2 != null ? kKeyAtIndex2.hashCode() : 0, kKeyAtIndex2, valueAtKeyIndex(iEntryKeyIndex$runtime_release2), i4, persistentHashMapBuilder);
                }
                deltaCounter.setCount(deltaCounter.getCount() + 1);
                return trieNodeNodeAtIndex$runtime_release2;
            }
            return trieNodeNodeAtIndex$runtime_release2;
        }
        int iEntryKeyIndex$runtime_release3 = entryKeyIndex$runtime_release(i2);
        K kKeyAtIndex3 = keyAtIndex(iEntryKeyIndex$runtime_release3);
        V vValueAtKeyIndex2 = valueAtKeyIndex(iEntryKeyIndex$runtime_release3);
        int iEntryKeyIndex$runtime_release4 = trieNode.entryKeyIndex$runtime_release(i2);
        K kKeyAtIndex4 = trieNode.keyAtIndex(iEntryKeyIndex$runtime_release4);
        return makeNode(kKeyAtIndex3 != null ? kKeyAtIndex3.hashCode() : 0, kKeyAtIndex3, vValueAtKeyIndex2, kKeyAtIndex4 != null ? kKeyAtIndex4.hashCode() : 0, kKeyAtIndex4, trieNode.valueAtKeyIndex(iEntryKeyIndex$runtime_release4), i3 + 5, persistentHashMapBuilder.getOwnership());
    }

    private final int calculateSize() {
        if (this.nodeMap == 0) {
            return this.buffer.length / 2;
        }
        int iBitCount = Integer.bitCount(this.dataMap);
        int length = this.buffer.length;
        for (int i2 = iBitCount * 2; i2 < length; i2++) {
            iBitCount += nodeAtIndex$runtime_release(i2).calculateSize();
        }
        return iBitCount;
    }

    private final boolean elementsIdentityEquals(TrieNode<K, V> trieNode) {
        if (this == trieNode) {
            return true;
        }
        if (this.nodeMap != trieNode.nodeMap || this.dataMap != trieNode.dataMap) {
            return false;
        }
        int length = this.buffer.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (this.buffer[i2] != trieNode.buffer[i2]) {
                return false;
            }
        }
        return true;
    }

    public final boolean containsKey(int i2, K k2, int i3) {
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(i2, i3);
        if (hasEntryAt$runtime_release(iIndexSegment)) {
            return Intrinsics.areEqual(k2, keyAtIndex(entryKeyIndex$runtime_release(iIndexSegment)));
        }
        if (!hasNodeAt(iIndexSegment)) {
            return false;
        }
        TrieNode<K, V> trieNodeNodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release(iIndexSegment));
        if (i3 == 30) {
            return trieNodeNodeAtIndex$runtime_release.collisionContainsKey(k2);
        }
        return trieNodeNodeAtIndex$runtime_release.containsKey(i2, k2, i3 + 5);
    }

    public final V get(int i2, K k2, int i3) {
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(i2, i3);
        if (hasEntryAt$runtime_release(iIndexSegment)) {
            int iEntryKeyIndex$runtime_release = entryKeyIndex$runtime_release(iIndexSegment);
            if (Intrinsics.areEqual(k2, keyAtIndex(iEntryKeyIndex$runtime_release))) {
                return valueAtKeyIndex(iEntryKeyIndex$runtime_release);
            }
            return null;
        }
        if (!hasNodeAt(iIndexSegment)) {
            return null;
        }
        TrieNode<K, V> trieNodeNodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release(iIndexSegment));
        if (i3 == 30) {
            return trieNodeNodeAtIndex$runtime_release.collisionGet(k2);
        }
        return trieNodeNodeAtIndex$runtime_release.get(i2, k2, i3 + 5);
    }

    public final TrieNode<K, V> mutablePutAll(TrieNode<K, V> trieNode, int i2, DeltaCounter deltaCounter, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        if (this == trieNode) {
            deltaCounter.plusAssign(calculateSize());
            return this;
        }
        if (i2 > 30) {
            return mutableCollisionPutAll(trieNode, deltaCounter, persistentHashMapBuilder.getOwnership());
        }
        int i3 = (-1) - (((-1) - this.nodeMap) & ((-1) - trieNode.nodeMap));
        int i4 = this.dataMap;
        int i5 = trieNode.dataMap;
        int i6 = (-1) - (((-1) - (i4 ^ i5)) | ((-1) - (~i3)));
        int i7 = i4 & i5;
        while (i7 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i7);
            if (Intrinsics.areEqual(keyAtIndex(entryKeyIndex$runtime_release(iLowestOneBit)), trieNode.keyAtIndex(trieNode.entryKeyIndex$runtime_release(iLowestOneBit)))) {
                i6 |= iLowestOneBit;
            } else {
                i3 |= iLowestOneBit;
            }
            i7 ^= iLowestOneBit;
        }
        int i8 = 0;
        if (!((-1) - (((-1) - i3) | ((-1) - i6)) == 0)) {
            PreconditionsKt.throwIllegalStateException("Check failed.");
        }
        TrieNode<K, V> trieNode2 = (Intrinsics.areEqual(this.ownedBy, persistentHashMapBuilder.getOwnership()) && this.dataMap == i6 && this.nodeMap == i3) ? this : new TrieNode<>(i6, i3, new Object[(Integer.bitCount(i6) * 2) + Integer.bitCount(i3)]);
        int i9 = 0;
        while (i3 != 0) {
            int iLowestOneBit2 = Integer.lowestOneBit(i3);
            Object[] objArr = trieNode2.buffer;
            objArr[(objArr.length - 1) - i9] = mutablePutAllFromOtherNodeCell(trieNode, iLowestOneBit2, i2, deltaCounter, persistentHashMapBuilder);
            i9++;
            i3 ^= iLowestOneBit2;
        }
        while (i6 != 0) {
            int iLowestOneBit3 = Integer.lowestOneBit(i6);
            int i10 = i8 * 2;
            if (!trieNode.hasEntryAt$runtime_release(iLowestOneBit3)) {
                int iEntryKeyIndex$runtime_release = entryKeyIndex$runtime_release(iLowestOneBit3);
                trieNode2.buffer[i10] = keyAtIndex(iEntryKeyIndex$runtime_release);
                trieNode2.buffer[i10 + 1] = valueAtKeyIndex(iEntryKeyIndex$runtime_release);
            } else {
                int iEntryKeyIndex$runtime_release2 = trieNode.entryKeyIndex$runtime_release(iLowestOneBit3);
                trieNode2.buffer[i10] = trieNode.keyAtIndex(iEntryKeyIndex$runtime_release2);
                trieNode2.buffer[i10 + 1] = trieNode.valueAtKeyIndex(iEntryKeyIndex$runtime_release2);
                if (hasEntryAt$runtime_release(iLowestOneBit3)) {
                    deltaCounter.setCount(deltaCounter.getCount() + 1);
                }
            }
            i8++;
            i6 ^= iLowestOneBit3;
        }
        return elementsIdentityEquals(trieNode2) ? this : trieNode.elementsIdentityEquals(trieNode2) ? trieNode : trieNode2;
    }

    public final ModificationResult<K, V> put(int i2, K k2, V v2, int i3) {
        ModificationResult<K, V> modificationResultPut;
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(i2, i3);
        if (hasEntryAt$runtime_release(iIndexSegment)) {
            int iEntryKeyIndex$runtime_release = entryKeyIndex$runtime_release(iIndexSegment);
            if (Intrinsics.areEqual(k2, keyAtIndex(iEntryKeyIndex$runtime_release))) {
                if (valueAtKeyIndex(iEntryKeyIndex$runtime_release) == v2) {
                    return null;
                }
                return updateValueAtIndex(iEntryKeyIndex$runtime_release, v2).asUpdateResult();
            }
            return moveEntryToNode(iEntryKeyIndex$runtime_release, iIndexSegment, i2, k2, v2, i3).asInsertResult();
        }
        if (hasNodeAt(iIndexSegment)) {
            int iNodeIndex$runtime_release = nodeIndex$runtime_release(iIndexSegment);
            TrieNode<K, V> trieNodeNodeAtIndex$runtime_release = nodeAtIndex$runtime_release(iNodeIndex$runtime_release);
            if (i3 == 30) {
                modificationResultPut = trieNodeNodeAtIndex$runtime_release.collisionPut(k2, v2);
                if (modificationResultPut == null) {
                    return null;
                }
            } else {
                modificationResultPut = trieNodeNodeAtIndex$runtime_release.put(i2, k2, v2, i3 + 5);
                if (modificationResultPut == null) {
                    return null;
                }
            }
            modificationResultPut.setNode(updateNodeAtIndex(iNodeIndex$runtime_release, iIndexSegment, modificationResultPut.getNode()));
            return modificationResultPut;
        }
        return insertEntryAt(iIndexSegment, k2, v2).asInsertResult();
    }

    public final TrieNode<K, V> mutablePut(int i2, K k2, V v2, int i3, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        TrieNode<K, V> trieNodeMutablePut;
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(i2, i3);
        if (hasEntryAt$runtime_release(iIndexSegment)) {
            int iEntryKeyIndex$runtime_release = entryKeyIndex$runtime_release(iIndexSegment);
            if (Intrinsics.areEqual(k2, keyAtIndex(iEntryKeyIndex$runtime_release))) {
                persistentHashMapBuilder.setOperationResult$runtime_release(valueAtKeyIndex(iEntryKeyIndex$runtime_release));
                return valueAtKeyIndex(iEntryKeyIndex$runtime_release) == v2 ? this : mutableUpdateValueAtIndex(iEntryKeyIndex$runtime_release, v2, persistentHashMapBuilder);
            }
            persistentHashMapBuilder.setSize(persistentHashMapBuilder.size() + 1);
            return mutableMoveEntryToNode(iEntryKeyIndex$runtime_release, iIndexSegment, i2, k2, v2, i3, persistentHashMapBuilder.getOwnership());
        }
        if (hasNodeAt(iIndexSegment)) {
            int iNodeIndex$runtime_release = nodeIndex$runtime_release(iIndexSegment);
            TrieNode<K, V> trieNodeNodeAtIndex$runtime_release = nodeAtIndex$runtime_release(iNodeIndex$runtime_release);
            if (i3 == 30) {
                trieNodeMutablePut = trieNodeNodeAtIndex$runtime_release.mutableCollisionPut(k2, v2, persistentHashMapBuilder);
            } else {
                trieNodeMutablePut = trieNodeNodeAtIndex$runtime_release.mutablePut(i2, k2, v2, i3 + 5, persistentHashMapBuilder);
            }
            return trieNodeNodeAtIndex$runtime_release == trieNodeMutablePut ? this : mutableUpdateNodeAtIndex(iNodeIndex$runtime_release, trieNodeMutablePut, persistentHashMapBuilder.getOwnership());
        }
        persistentHashMapBuilder.setSize(persistentHashMapBuilder.size() + 1);
        return mutableInsertEntryAt(iIndexSegment, k2, v2, persistentHashMapBuilder.getOwnership());
    }

    public final TrieNode<K, V> remove(int i2, K k2, int i3) {
        TrieNode<K, V> trieNodeRemove;
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(i2, i3);
        if (hasEntryAt$runtime_release(iIndexSegment)) {
            int iEntryKeyIndex$runtime_release = entryKeyIndex$runtime_release(iIndexSegment);
            return Intrinsics.areEqual(k2, keyAtIndex(iEntryKeyIndex$runtime_release)) ? removeEntryAtIndex(iEntryKeyIndex$runtime_release, iIndexSegment) : this;
        }
        if (hasNodeAt(iIndexSegment)) {
            int iNodeIndex$runtime_release = nodeIndex$runtime_release(iIndexSegment);
            TrieNode<K, V> trieNodeNodeAtIndex$runtime_release = nodeAtIndex$runtime_release(iNodeIndex$runtime_release);
            if (i3 == 30) {
                trieNodeRemove = trieNodeNodeAtIndex$runtime_release.collisionRemove(k2);
            } else {
                trieNodeRemove = trieNodeNodeAtIndex$runtime_release.remove(i2, k2, i3 + 5);
            }
            return replaceNode(trieNodeNodeAtIndex$runtime_release, trieNodeRemove, iNodeIndex$runtime_release, iIndexSegment);
        }
        return this;
    }

    private final TrieNode<K, V> replaceNode(TrieNode<K, V> trieNode, TrieNode<K, V> trieNode2, int i2, int i3) {
        if (trieNode2 == null) {
            return removeNodeAtIndex(i2, i3);
        }
        return trieNode != trieNode2 ? updateNodeAtIndex(i2, i3, trieNode2) : this;
    }

    public final TrieNode<K, V> mutableRemove(int i2, K k2, int i3, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        TrieNode<K, V> trieNodeMutableRemove;
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(i2, i3);
        if (hasEntryAt$runtime_release(iIndexSegment)) {
            int iEntryKeyIndex$runtime_release = entryKeyIndex$runtime_release(iIndexSegment);
            return Intrinsics.areEqual(k2, keyAtIndex(iEntryKeyIndex$runtime_release)) ? mutableRemoveEntryAtIndex(iEntryKeyIndex$runtime_release, iIndexSegment, persistentHashMapBuilder) : this;
        }
        if (hasNodeAt(iIndexSegment)) {
            int iNodeIndex$runtime_release = nodeIndex$runtime_release(iIndexSegment);
            TrieNode<K, V> trieNodeNodeAtIndex$runtime_release = nodeAtIndex$runtime_release(iNodeIndex$runtime_release);
            if (i3 == 30) {
                trieNodeMutableRemove = trieNodeNodeAtIndex$runtime_release.mutableCollisionRemove(k2, persistentHashMapBuilder);
            } else {
                trieNodeMutableRemove = trieNodeNodeAtIndex$runtime_release.mutableRemove(i2, k2, i3 + 5, persistentHashMapBuilder);
            }
            return mutableReplaceNode(trieNodeNodeAtIndex$runtime_release, trieNodeMutableRemove, iNodeIndex$runtime_release, iIndexSegment, persistentHashMapBuilder.getOwnership());
        }
        return this;
    }

    private final TrieNode<K, V> mutableReplaceNode(TrieNode<K, V> trieNode, TrieNode<K, V> trieNode2, int i2, int i3, MutabilityOwnership mutabilityOwnership) {
        if (trieNode2 == null) {
            return mutableRemoveNodeAtIndex(i2, i3, mutabilityOwnership);
        }
        if (this.ownedBy != mutabilityOwnership && trieNode == trieNode2) {
            return this;
        }
        return mutableUpdateNodeAtIndex(i2, trieNode2, mutabilityOwnership);
    }

    public final TrieNode<K, V> remove(int i2, K k2, V v2, int i3) {
        TrieNode<K, V> trieNodeRemove;
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(i2, i3);
        if (hasEntryAt$runtime_release(iIndexSegment)) {
            int iEntryKeyIndex$runtime_release = entryKeyIndex$runtime_release(iIndexSegment);
            return (Intrinsics.areEqual(k2, keyAtIndex(iEntryKeyIndex$runtime_release)) && Intrinsics.areEqual(v2, valueAtKeyIndex(iEntryKeyIndex$runtime_release))) ? removeEntryAtIndex(iEntryKeyIndex$runtime_release, iIndexSegment) : this;
        }
        if (hasNodeAt(iIndexSegment)) {
            int iNodeIndex$runtime_release = nodeIndex$runtime_release(iIndexSegment);
            TrieNode<K, V> trieNodeNodeAtIndex$runtime_release = nodeAtIndex$runtime_release(iNodeIndex$runtime_release);
            if (i3 == 30) {
                trieNodeRemove = trieNodeNodeAtIndex$runtime_release.collisionRemove(k2, v2);
            } else {
                trieNodeRemove = trieNodeNodeAtIndex$runtime_release.remove(i2, k2, v2, i3 + 5);
            }
            return replaceNode(trieNodeNodeAtIndex$runtime_release, trieNodeRemove, iNodeIndex$runtime_release, iIndexSegment);
        }
        return this;
    }

    public final TrieNode<K, V> mutableRemove(int i2, K k2, V v2, int i3, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        TrieNode<K, V> trieNodeMutableRemove;
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(i2, i3);
        if (hasEntryAt$runtime_release(iIndexSegment)) {
            int iEntryKeyIndex$runtime_release = entryKeyIndex$runtime_release(iIndexSegment);
            return (Intrinsics.areEqual(k2, keyAtIndex(iEntryKeyIndex$runtime_release)) && Intrinsics.areEqual(v2, valueAtKeyIndex(iEntryKeyIndex$runtime_release))) ? mutableRemoveEntryAtIndex(iEntryKeyIndex$runtime_release, iIndexSegment, persistentHashMapBuilder) : this;
        }
        if (!hasNodeAt(iIndexSegment)) {
            return this;
        }
        int iNodeIndex$runtime_release = nodeIndex$runtime_release(iIndexSegment);
        TrieNode<K, V> trieNodeNodeAtIndex$runtime_release = nodeAtIndex$runtime_release(iNodeIndex$runtime_release);
        if (i3 != 30) {
            trieNodeMutableRemove = trieNodeNodeAtIndex$runtime_release.mutableRemove(i2, k2, v2, i3 + 5, persistentHashMapBuilder);
        } else {
            trieNodeMutableRemove = trieNodeNodeAtIndex$runtime_release.mutableCollisionRemove(k2, v2, persistentHashMapBuilder);
        }
        return mutableReplaceNode(trieNodeNodeAtIndex$runtime_release, trieNodeMutableRemove, iNodeIndex$runtime_release, iIndexSegment, persistentHashMapBuilder.getOwnership());
    }

    public final void accept$runtime_release(Function5<? super TrieNode<K, V>, ? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> function5) {
        accept(function5, 0, 0);
    }

    private final void accept(Function5<? super TrieNode<K, V>, ? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> function5, int i2, int i3) {
        function5.invoke(this, Integer.valueOf(i3), Integer.valueOf(i2), Integer.valueOf(this.dataMap), Integer.valueOf(this.nodeMap));
        int i4 = this.nodeMap;
        while (i4 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i4);
            nodeAtIndex$runtime_release(nodeIndex$runtime_release(iLowestOneBit)).accept(function5, (Integer.numberOfTrailingZeros(iLowestOneBit) << i3) + i2, i3 + 5);
            i4 -= iLowestOneBit;
        }
    }

    /* JADX INFO: compiled from: TrieNode.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\r!4\u0012}\blʒ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$BaIV2\n2\u000b_N\u0016j~Lj\u000bq\u00124\u0018O̔.֒Y~e܈'4HsM8ޢsC"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WK?p\t\u001c%\n2qp*R\u001b\u0011h\"yA\u0012rEY\u001eWQIP^3h\u0016hr", "", "u(E", "\u0013L?!L", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WK?p\t\u001c%\n2qp*R\u001b\u0011h\"yA\u0012rEY5", "", "5dc\u0012@\u0017-GW\f\u000bg;\u0001\u0011/_\r(\u0003@|%\u0017", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006v8DY\u000b)3t_4WRBo=1^fk@\u000ec*]z1PZ\u00180dZ\u0003L\u0010\u000fa\u000e\u0018/\u0015\u0010`A,nMF\u001b\u00170S\u000bI2\u0005\u0014\u001e\u001eDfmIVwC\u0005^dN-h/c^y\u001d", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final TrieNode getEMPTY$runtime_release() {
            return TrieNode.EMPTY;
        }
    }
}
