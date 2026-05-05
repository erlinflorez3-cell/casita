package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.truncatedMessage(InvalidProtocolBufferException.java:70)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.refillBuffer(CodedInputStream.java:1094)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.ensureAvailable(CodedInputStream.java:1080)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readRawBytesSlowPath(CodedInputStream.java:1215)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readBytes(CodedInputStream.java:529)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:244)
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
/* JADX INFO: compiled from: SpanStyle.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яĕ\u0014D57\u001eq\u007fR܀kŞ\fA\u001c0\u0013ǞJ~8,\u001aՄ\u000ff\u000198ǏmHDR[ճ\u0017k\u00124,Ӌ,qY;]ڼ\u0006\"\u0017[VgmnRZ!C\u0017إ\u001ex\u0001,Qǁ\u0001](\u000f:Bu?;M\u0006=Aś|6\u001b :\">y\r\u00010*P\u0010|zKK\"\u00128@v:Z\rc\u0005\"Ň\u000e>.\u0006&\\mN>H\u0003]B/)0qB\\0g0\u0003Q\u0015Fb-\u0015vg\"1EMߎE%\u0002\u0002GҠZE\u0018OwC\u0005v'?+wtg<^\u007f\"\u0017CO;`\u0003.b\u0005_d$)AN\u0012P`\u0016.w\t\u0002%>\u001a\r4.X63\u001at\u0010&5\u000bq\u0002I`\ndB\u000e\u0005y8-$.>;A!f_mS\u001bd6*\u0012\u001d$)\u0001|/sT<c%#Zw_@iBSG|\u001aiEs\u0004~s\u001a,\u001a/u\u0012?\u0004\u0017.%8O]O\"O\u007f\u0012NJg\u0005\u001axh\u0002jbPF\"|,O,\u001f\u000b\t[t\rqPbpD\u0013c\u001b\u0003 ą\f\u0013.v8̇ +%^UnixMu\nS0v=_ny\u0010o9\r6EYi\u0010oV\u000f\u0016U;\u0011\nhnHS\u001a`t*81vq \u007f\u0002D\\\u0014+4UpJ=<9\u001f\\#R\u001b X@+\u0014obn\u0010\r`K&\u0019hR\u0002\u0019\u0007V\\~}\u007fxw/\rh(-O`M\u001b<TPxD\u0005)\u0007\r\u0005\u0018I}Ku^|\u001e{U\n3.\u001cOP]Q#\u0015\u0005)@\u0017EEzsuYS\u00125\u0011\u0015{%:\u0017Ew\u0010pp:x\u0003LeSE;\u0007fx#\u0016\u007f\u0018{wE)cϭX\u000bi[\nο\u0002_P^>\u0003\u0005-\u001e=\u0001\u001e#\r;3C5\u001f.wB2%ici}2\u0012d%%#j\u00144i\u0016}hi_H:fPi\u0007D\"2t\u001bD^i&\u0011R\u0011:\rARYf\u0007UfX\u001b7\u0004f\u00158%rlZh \u007f\u0004:.m8\fC,\u0017nK+\u0011[b\u007fo\u0004J\u000b\u001bZ\u0017\u0010\u000b\nB\u0007\u00142<Nhgj\u000f0\u0014\u000708W:\u0011\u0019L\u000f*4:Q \u000bqUy\u000e\u0016z\u000e\\w\u0011-1p\u000bK^\u0014T\u0007tnJ\u001b_sy12\u0007~\u001dN6zK03\nV\\5c@\u001fk\u001f\u001f\u001a\u0019nǎj%9d\u0015ۭ\u001a.l\u0011\u0011S~[K\u001852i9sqo\u001a[0|Kf(!?Q\u001fa\u000f0\r\u000eelTd\u0005\u0016~Td!W\u0004\u000b\u0005\u0014<\u0018\u0015#\u001beq\u001ei=TTwEK2\u0003-CW\u0010\u001c\u0005iF)7\u001e7C<wu$/\u0002WaG\u0016\n6\u001fU\u0011\u0005'bW\u001ct\"]I=&y\u001cb\u0010\u0018+R6\u0003\\Z\u0005z\u0010.\u0016Gg\u0004I\u0001Apis}!N:Cn\u001cAy|\t\u0010ilq\u0004m\u000b1gA^\u007fn;f5\u000b=L\\*hb@\u0011a8p\u0013\u0016\u0013C?/>\u000eb7+ge~o\u001akk\u00151/yHy3FQL\u001dψ}u\u0012O\u0015ԍ\u0014Aۮ]Br/tlp~\u001edp(rv$)B\u007f\u000fPd\u0011!8^t4c]<)'a\rUf\u001f\u0006[HT(AZE\u001bE:#q>u?\fJjz\u007f8L!t\u0016fZ8V\\C\u001a5e<oz\u0002TXU>H\b:\u001f&\u0011]]H(D\\(+SSI@G!\u0011\u001d>\u0006}\u001817\u0001P\u00027:\t\u0003\u0001\u001bR\u00123\u00029\"K\u0003)5\u000f}0ofi&EmR'\u001a\u0018}L\u0015L\u0012m\u001fi2IC]6{k?.#/,*\u0006\u0004>\u0018GGGX{lH\\se\">,LmrBؼpx\u00022t˩\u0017\u00022sabС+\u001a'eV,Ck5g}n\u007f\u000bR0]\u0014e36/9\u0017\u000b\u0012gqn.yzS/jaT\u0015\n\u0003h7\u0012>\u007fGN_B\bC\u0011\u0003j\u001brsQm\u0018P\u0014#\f2\u0001aZf\u007fn'0)autA\r\u0001SAp\u0017X\u0011:]\\O<\u0011\f\u0016<V/\u0002,M\u0011\u001d\u00193U\u0003YI(U*1M\u0019a%\u00146\u007fl]>\u0004\u0004\tE?3\u0019\u0001bZKd\u000b\u0019\u0006'Qd9*\u0018jY/w^D\u001a8n\u001e\u0010[cv't\u0001J({HH2f}\t\\\u000e\t\"\u001fKp-g\u00151\u0011S\fl\u0017+Eu\u0007Tk\"[\u0018Ç\u0002ްĀ\u001d\u0015\u0011la\tzײr\u001b~V{6֟y[\u0003mW\u0010\u001bax\"_\fE/OM\u0005V\u0014BI_E~\u001a$?&\u001c\u0012Rg\u0018\u001bo\u000e0e\u001bNLUWO{a\u0017fPr'|\u000b\u000b\\\u0015h]\f=\u0014\u001bz\u001eK:\u000eK\\6v\tU[\u0003}@d\u001es%_SE9\u00041>_tAkU_\"}i^n=EgVH\u0019\u0002(.>c\u0012GWBG]imx\u0007lb'Xb\u007f`j\u007frtyVcl=xt\u001ff]\u00143SZa7w!PG\u0010p\u0005D)LG\u00192G\u0006ˑ`ֲ߫;F|su\u0005\u0003ʈ`0!u%u͆6\u0014pa\u0006\u0015\u0014]a7=u2|#\u0007Vf!\u0007\u001d\rS0\u0012oG4\\Yn!]b-mv\u000eB\u0010\"{33\u001f[XQ\u0004'\u000bf\u0015\"L#q_?G/\u001d\u001b\u001bR\u0007`X\t\u0003tXj1F}\u001c\u001e@O,;rA\u0002\nKW Rde$)\fx\u0010\"#j@\u0014\u0014R)Ows)_DL&\u0019\nD_A\u0010\u001d:+:\u0007C;2N:J@7;\u0001=7HRln\u0007;!g\".#\r>:s>\u0002~uiJ@kn\u000e\u0007K-=\r M_l-G\u000e\u0013ˡ\u0015Κ÷Po{.K(^\u009a\u0006}QI\u0010\"ԛ\fH\u001dw\u0016bLkh|w\t\u001ajY02Z\u0015q\u001d~Va\u001eA.\u000f*\u0004lxY+F%mf\u007f\u0002Q\b\u001f$gYKd\u0019L)*v1l\u001b?P^f\u001c%\u001a\u0007acH!iM~@Y!s\u0006}b\u007f/\u0018Nq(=\u0018\u0010\u0016d 0=?\r\u0002_v7}]7eS\u0016-n]\u0019\n2HF\flP7a\b\u001c]~Nf\fo\u001b\u001d4|v\u0001,W\u00150+u*#Cs/\u007f\u0007Lkit\u0019[jz,\u0007s]=/,\u001fQ\u001bG\u001f$)<\n\u0016s\nP\u007f}\u0007@V1$\u001cY-63׳dբ\u05ee9\fG\u0006M)9*9Nw^p\\=+/\u0001#\u001a>`\u001b\u00126ɐ(jV!P3m7gLM3aEQ%Ģ`ĜԦ$U\u0016\u001aR&p:\u0010\u007fO!`4\u0002aeL\u001cߎtŗэnwdl\u0018wJ;\u0017wd$n$n]Isz\\r\u0006\"ϸ۳\u001b\u000e$\u007fr6@m\u00070IՖ\u0019\u0006uv`;*bJmcү\u0007:s2\u000f\t\u0019\u00017՟\u000e/\"\u0017qUtłUÝv\u0019I B\r>\u0018\nNEm\u0013\u0014n}2J]\u007f>ӱo8X$0\f\"N6#\u001bah-H7Е;מґ;\u001aˌ4\u0007\u001f\u0011N\u0018\r\u00065q\u001f\u001fY\b?Aaar\u001eZnٷo͕ܩ.O\u07baESvȅ2\u0019,fofs\\sC4G}<wGKQߜn\u0010\r\u0005#e\u007f\u000e/?M\u0002\u001e$BC5zǂBۻ֪t\u001bŧ\u0018x:dof<n3`84*gd&\u0006\u0011Ę\u0017g<;RO 5l}W\u001e4-E\r1)1WŬU9t˶_W|\u0012\u001bE\u0002NwSHN\fy,)˙uF\u007fۡym<|\u000ePy[W3J\u0002:SЊnհޗH\u0011χ\u000fJ\u001a\u0013@m6\u0002!\u0010tu\u0005_\u0004bNnsCW\u0005\u008ceəل=\u000bʹI\\6ƓN\u001fe%\r/Gmt\u001bW\u0019(\u0015+\bţlɒմd%̓.L\bկKc\u0002\u0014a(_Y%6|6X\u0013M\u0010Ͱ.Z(һ#Qmr,w\u001d\u0010T\\]a31ɑ\u0019Ӳֳ\f-܃sXBX\u000f\u000b^;A]\u0002\u00011J\u007fs\u000fY=O\u0017K΅\u000fw:Ÿdadb;\"[$X8k\u0015i\u0001\u007fIȷ?=O˯ YL0\u0016roVw7\b\u0007Nmmdȃ\u001a-Gǣ\u0010]foNJS9#Z8((&;Uɚ\"|\u001cʓ?\u0007\u0011\u001f^-R\u0005X@-k~0\u000eȯGޢG[hß\n=+(XVa64@!\u001c?f\u001b8ܽ\u0019tlΜi;c{?\u001dŁ\nrYp\u0016߲\u0019J3\u001e\"_1Ƥ\u001a\u007f"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9{Gr.#h\u0012'7C", "", "1n[<e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "4n]AF0SS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9|<\n4%b\u0002/\r", "4n]AJ,BU\u001c\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F_\u00162OFJA", "4n]AF;RZ\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F[%BTC\u0011", "4n]AF@Gb\u001c~\tb:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F[*7\\F;y8,j", "4n]A9(FW \u0013", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FN\u00126QJOA", "4n]A9,:b)\fzL,\f\u00183n\u00026", "", ":dcAX9,^\u0015|~g.", "0`b2_0GS\u0007\u0002~_;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#Z\u001cEm\u001d2VC)n8\u001f$>", "BdgA:,H[\u0019\u000e\bb*k\u0016+n\u000e)\u0006M\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|w.WK;zA\"\u0013Wn5\u0010q-X\u0004/\u001d", ":nR._,%W'\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u0006,~@\b\u001e3t\u0016\u0015QQJA", "0`R8Z9Hc\"}", "BdgA7,<]&z\nb6\u0006", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|t.KMHgC\"\u001fq7", "AgP1b>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y\u001fA\u007fk", "uI9\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`Vo!K@&?b\ri\u0018w\u001f=?C?m7-jO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\"^W]+ \u0014#B.wS\u0001\u007f\u00125XoJ|\b\fkt1soO`\u0014F\r^sK1sPg_CWE\u000fq*w\u001b)\u001efCImt{\"*Vd7\u0019~S\u001fv`ONcP\u0018\bB(=\u0001%DOw`F\u0003'h[\u007fA!2k\u0004tu7\rCs\u0017n\u000eZH\u0014Fb\u007f)\u0002CF#72\u0006\u001a;Te?ZM\u001bl(c]rI1:\u0018rogG\"P[!c@km\u0001\u0001b\n\bXo(6\u0010\rQo\u0001\u0015Rc {ePG$Tn\u001dtE15w~\fe%&2\u0015P#\rr2jA[\u0013Rx<U\u000bYV$:V\u001f\u0002Rr%Fo7EZ\u0011S)3ZIzP2|\f\u001fB\u0002\u0015\f%IP>\u00035 /)<l\u0002`j7\u0016qa\"bw<e.-D\u0011\u001cDwm~p{\b\fd\u0004\u0015DBF\u0011\t&0f+;pU\t;m\u001c\u000e6U 9nt_R_=DJ\u0002\u001dI\u0012:\r\u001a\u001cu\u0015uZ.F\u001b-p\u0019\b\u0019s'8pgTW\u0015Z\u001drG[c{e7\u0010\u001a0F2%PJ+P6YKz\u001dAQkW\u00021bIOJ@\u00050(E\u001bO\ra\u000fhI$j\u0016\u0007\u0001hUx@Q#\b\u0005]NsXD#G-*~dO\u0003S~aj\n\u000e\u0002Yl", ">kPAY6K[\u0007\u000e\u000fe,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9xCr46c\u000b(%x\u00127;ROr4s", "uI9\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`Vo!K@&?b\ri\u0018w\u001f=?C?m7-jO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\"^W]+ \u0014#B.wS\u0001\u007f\u00125XoJ|\b\fkt1soO`\u0014F\r^sK1sPg_CWE\u000fq*w\u001b)\u001efCImt{\"*Vd7\u0019~S\u001fv`ONcP\u0018\bB(=\u0001%DOw`F\u0003'h[\u007fA!2k\u0004tu7\rCs\u0017n\u000eZH\u0014Fb\u007f)\u0002CF#72\u0006\u001a;Te?ZM\u001bl(c]rI1:\u0018rogG\"P[!c@km\u0001\u0001b\n\bXo(6\u0010\rQo\u0001\u0015Rc {ePG$Tn\u001dtE15w~\fe%&2\u0015P#\rr2jA[\u0013Rx<U\u000bYV$:V\u001f\u0002Rr%Fo7EZ\u0011S)3ZIzP2|\f\u001fB\u0002\u0015\f%IP>\u00035 /)<l\u0002`j7\u0016qa\"bw<e.-D\u0011\u001cDwm~p{\b\fd\u0004\u0015DBF\u0011\t&0f+;pU\t;m\u001c\u000e6U 9nt_R_=DJ\u0002\u001dI\u0012:\r\u001a\u001cu\u0015uZ.F\u001b-p\u0019\b\u0019s'8pgTW\u0015Z\u001drG[c{e7\u0010\u001a0F2%PJ+P6YKz\u001dAQkW\u00021bIOJ6\u0004 .K\u0016\u0005\u001b\u001a\u0005)M&e$yA|RxpQ5\u001b>AF\u0012]<\u001fE(\b\fQNcz\u0017[d_g2 \u000b@r{XAEb?!:\u0006,vPct@\u007f<\r$c\u0005*\u0013zq2\u0015tvp\u0004\\\u0011w'F7zS\u0012\u0016\u000f", "2qPDF;RZ\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00\u0003wu@\u00079", "uI9\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`Vo!K@&?b\ri\u0018w\u001f=?C?m7-jO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\"^W]+ \u0014#B.wS\u0001\u007f\u00125XoJ|\b\fkt1soO`\u0014F\r^sK1sPg_CWE\u000fq*w\u001b)\u001efCImt{\"*Vd7\u0019~S\u001fv`ONcP\u0018\bB(=\u0001%DOw`F\u0003'h[\u007fA!2k\u0004tu7\rCs\u0017n\u000eZH\u0014Fb\u007f)\u0002CF#72\u0006\u001a;Te?ZM\u001bl(c]rI1:\u0018rogG\"P[!c@km\u0001\u0001b\n\bXo(6\u0010\rQo\u0001\u0015Rc {ePG$Tn\u001dtE15w~\fe%&2\u0015P#\rr2jA[\u0013Rx<U\u000bYV$:V\u001f\u0002Rr%Fo7EZ\u0011S)3ZIzP2|\f\u001fB\u0002\u0015\f%IP>\u00035 /)<l\u0002`j7\u0016qa\"bw<e.-D\u0011\u001cDwm~p{\b\fd\u0004\u0015DBF\u0011\t&0f+;pU\t;m\u001c\u000e6U 9nt_R_=DJ\u0002\u001dI\u0012:\r\u001a\u001cu\u0015uZ.F\u001b-p\u0019\b\u0019s'8pgTW\u0015Z\u001drG[c{e7\u0010\u001a0F2%PJ+P6YKz\u001dAQkW\u00021bIOJ6\u0004 .K\u0016\u0005\u001b\u001a\u0005)M&e$yA|RxpQ5\u001b>AF\u0012]<\u001fE(\b\fQNcz\u0017[d_g(\u001fzFxv\u000eO}X\u007f%<\u0001:i\u0011wq@#I\b3V\u0002\u0019C:g1\u0002ytp~]\u0004Y\nF-\r4Kf%@#\u000e\u0003~k5.-MPT!G:{,\u001dVz\u0010E>e'H_\u001aH\u0003uB\\STj:\u001e*\u0011ln5j4P}v\u0019;", "0qd@[", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012f\u000e.:C", "/k_5T", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~6\u000b0Epk\u000f2*7t3+\u001fl`LPa6V\u00021UL\u0018<`\u001c\u0002='!$\u000fX4\u001cN:K-}67#\n/XW\"d\n\u000b#\u00189i\u0004\fT\u001aO\u0005\u001f\u0004ArxJ#nyZP\u000fc4m\u001b)}fCI\u0012#\u0006 \u001b>7*\u0013z`\u001bvQ\r1eQ!\u0006B2>7kJ\u000f~UO\u0004p U\u0005\u0007[\u0013b}:bA\rC-6r\tY=~:gw\"6`@:o4F\u001bJUqu6N\u00122.a\u001b\u001d,6;\"t/DR\u0018\u0016>\u0013c9hsV\u001eW\u0002OE9\u001c#O\u0001\fI\t\"\r\u0010&CJ0?$S\u000e$tC5)\u000f\r\u000bq\"*._M]Xw*rF\u0017!\u0018|?\fE6?#pO\u0014vK`^[p3\f_\rR @U@ue\rm\u001a\u001e?\u000b\u0019~f\u0004m\f\t6&4nKhLi`xygf1zgB$\u001f<>\u0006P/{Z\u00015\u0016\b\u001bpR{YG7\u000f=EH}k:mS\u0010FhRY<Q^>`\b%\f_|DQ8t\n\u0002'\u007f\u0013\u000304\u0005\u001d\u0004N\u00178e\u0019\u0016\u000en0x\u0019\u000b`Y [\u00138XLc\r[B\u0014Y0U|\u001cLJ\u0018CM]'v\u001d=\u0015yc\n<a\r`_Cy.+E\u0011\u0019QN\u0011'P%i\u0016C\bp\u00181nM-\u000fxTM_<>\u00117*,V<A~j\u0010^h\t\u0014u\u0014\u0006Ay|\u001d<}jyf@v?x\u0011Rtr0=\u00165[k&1yV3\u001anfH[N\r\u000f8C5yY\u0006P(HX1\u000bt&>.m\u0006X?$\u0001:p+fH~\u0010P\u0003\u00051RcS \u0001\u0014JATYd*u\u0002\ri\u0016@a7\u001au2]\u0014L3eX\u0002d}\u001b\u0016~d&\u0007#ZR\u007f\u0003SG(\u000ba:\"c?r}%\u0016/eP\u0004E", "BdgA96KS\u001b\f\u0005n5{v>y\u0007(", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|v8ZC=x>.\u001egOH\u001bj,$", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~WJ\u00069<YG\u000f7\u0001%\u000fWP;mA(%q`'\u0016w3NL\f.HW+i\\v<'[X\u0018V6\u0017\u0013Y\u000b4r\u000eF\u001f\u001b;\u0013\u0003Eq\u0010Uv\u0018>ybBZ\u0012J\tj\\=2gSccxZ\u000bCl2o\u0016m\u001d&J>m#q,*2Q8\u0013\u000b\u001dq|[\tUv[ z\u000e\u000b:vZSOsTO>%)S\u0007\u0002 2\"\u0005/><\u0004G9\u007fe\u000fTva\u001fh\u0002$\u001apJ6)6J\u0017M!Jqu=\u001br#`\u001bW`?9$osc\u0012\u001f\u000b'&[Hp)\u0002A[\u0015\b*y\u001e6'zJ_\u0001)^m)ivE\r\"P\n\u001c:21l\u0015\f\u0005<|\u0003*\u001f<f\u0019l)r\u0001K\u001d\u0011sB\u001a{#S\u0019:W\u0010\u0001Z<if\u0004+6BmE/3R@\u007fR1r\u0014\u0017CVqz&rvL}5&n#GaCln/TwWk(gK+h;@\u0016Y@8Mw:$_\u000er\u0005\u0015lK<\u007f\"NEs0=mX\r\u0012AN\u0019+Z\u001f3_\b_@e{@T|\u000eI\u0014/B\"\u001c?5?K(v\"xM\u0016\n\u0006v\u001d\u0016\u001f\u000fg$z4\u000fwGU$\u0002ZBN\u000e,Ns\u001fZ\u0001rS>\u0018Wv2BQ\fc\u001a9X\u0001hcM\n\u007f!?\u001c\u0013\u0004_\u000b)NpB\u0012\u0003vyX3`dk\n~^J \\;^H$c\u0003bA\u0001n\u0007RrSn/\u0012zC\u0001Hu8=Y\u0003'5u?3Equ\u0002+J\fqc\u0002dDp{3ORmn\u0004S\u000e\u001d3'<vO*a2GM|cpe-7.\bJVb{@z('Wq]NxP)T_\u0015Dw\u0016F\u001dDRY<.\u0019\u0011j\u0007\u0003<;L\u0003\u000fd^O*,?ze\u0011\u001bP).*\u001c\u001b\u001dG+\bJF\"yX\u0006qY3\u0007\u0012\u001f\u001f\rb\u0004Nc\u001bmi\u001e\n@rnQ]Y\u0005\u001f\u00130", "5dc\u000e_7AO", "u(5", "5dc\u000fT*DU&\t\u000bg+DS.7y\u000e\u00010", "u(9", "\u0018", "5dc\u000fT:>Z\u001d\bzL/\u0001\n>-O\u0016i@s{a", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006\u00054I`}i\u0014i$.TGDk\"!\u0019ip\u000f", "5dc\u000fe<LV", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#Z-G{\u0019\u0004", "5dc\u0010b3H``Iy0&b\u000e\u001f", "5dc\u0011e(PA(\u0013\u0002^", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#|-3\u007f$,WN;5\u0013+\u0011zOH\u001bj,$", "5dc\u0013b5M4\u0015\u0007~e@", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006w/>hG\u0001Av%\u000fIK?rHs", "5dc\u0013b5M4\u0019z\nn9|v/t\u000f,\u0005B\u000f", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u0013b5MA\u001d\u0014z&\u001fjd\u0013It\b", "5dc\u0013b5MA(\u0013\u0002^sKo<2[y\u000e", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006w/>hG\u0001Av%\u001c\\WBk\n", "5dc\u0013b5MA-\b\na,\u000b\r=-t\u0014]%\u0006\b!", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006w/>hG\u0001Av%\u001caLJn4,\u0019v7", "5dc\u0013b5ME\u0019\u0003|a;", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006w/>hG\u0001Av% MG=nCs", "5dc\u0019X;MS&l\u0006Z*\u0001\u00121-r\u0016W$d\fv", "5dc\u0019b*:Z\u0019e~l;", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006z.D`G\u0007Ak\u00125M*?yCs", "5dc\u001d_(MT#\f\u0003L;\u0011\u0010/", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006a,1h~*Du\u00049IL)zH%\u0015>", "5dc [(=]+", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#k#3l @#", "5dc!X?M2\u0019|\u0005k(\f\r9n", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006\u00054I`}i&m)=,C9uA\u001a$lkB\\", "5dc!X?M4#\fz`9\u0007\u00198dm7\u0010G\u0001U'Ki\u001d<\n4/f}'7i$.", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006\u00054I`}i&m)=.MHk6+\u001fxj8tr@Uv|", "5dc!X?M5\u0019\t\u0003^;\n\r-T\r$\u0005N\u0002!$O", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006\u00054I`}i&m)=/CEs4-\"l_(\u0014_5\\w1TT$", "1n_F", "1n_F \u0015<5eNb1", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~6\u000b0Epk\u000f2*7t3+\u001fl`LPa6V\u00021UL\u0018<`\u001c\u0002='!$\u000fX4\u001cN:K-}67#\n/XW\"d\n\u000b#\u00189i\u0004\fT\u001aO\u0005\u001f\u0004ArxJ#nyZP\u000fc4m\u001b)}fCI\u0012#\u0006 \u001b>7*\u0013z`\u001bvQ\r1eQ!\u0006B2>7kJ\u000f~UO\u0004p U\u0005\u0007[\u0013b}:bA\rC-6r\tY=~:gw\"6`@:o4F\u001bJUqu6N\u00122.a\u001b\u001d,6;\"t/DR\u0018\u0016>\u0013c9hsV\u001eW\u0002OE9\u001c#O\u0001\fI\t\"\r\u0010&CJ0?$S\u000e$tC5)\u000f\r\u000bq\"*._M]Xw*rF\u0017!\u0018|?\fE6?#pO\u0014vK`^[p3\f_\rR @U@ue\rm\u001a\u001e?\u000b\u0019~f\u0004m\f\t6&4nKhLi`xygf1zgB$\u001f<>\u0006P/{Z\u00015\u0016\b\u001bpR{YG7\u000f=EH}k:mS\u0010FhRY<Q^>`\b%\f_|DQ8t\n\u0002'\u007f\u0013\u000304\u0005\u001d\u0004N\u00178e\u0019\u0016\u000en0x\u0019\u000b`Y [\u00138XLc\r[B\u0014Y0U|\u001cLJ\u0018CM]'v\u001d=\u0015yc\n<a\r`_Cy.+E\u0011\u0019QN\u0011'P%i\u0016C\bp\u00181nM-\u000fxTM_<>\u00117*,V<A~j\u0010^h\t\u0014u\u0014\u0006Ay|\u001d<}jyf@v?x\u0011Rtr0=\u00165[k&1yV3\u001anfH[N\r\u000f8C5yY\u0006P(HX1\u000bt&>.m\u0006X?$\u0001:p+fH~\u0010P\u0003\u00051RcS \u0001\u0014JATYd*u^m[\u00108j8To4\u001fHR2ab\u0003[K$Pis%\u001e\"\u001d1-tS'(\u0012X<h", "1n_F \u0010N_-qy`", "uI9\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`Vo!K@&?b\ri\u0018w\u001f=?C?m7-jO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\"^W]+ \u0014#B.wS\u0001\u007f\u00125XoJ|\b\fkt1soO`\u0014F\r^sK1sPg_CWE\u000fq*w\u001b)\u001efCImt{\"*Vd7\u0019~S\u001fv`ONcP\u0018\bB(=\u0001%DOw`F\u0003'h[\u007fA!2k\u0004tu7\rCs\u0017n\u000eZH\u0014Fb\u007f)\u0002CF#72\u0006\u001a;Te?ZM\u001bl(c]rI1:\u0018rogG\"P[!c@km\u0001\u0001b\n\bXo(6\u0010\rQo\u0001\u0015Rc {ePG$Tn\u001dtE15w~\fe%&2\u0015P#\rr2jA[\u0013Rx<U\u000bYV$:V\u001f\u0002Rr%Fo7EZ\u0011S)3ZIzP2|\f\u001fB\u0002\u0015\f%IP>\u00035 /)<l\u0002`j7\u0016qa\"bw<e.-D\u0011\u001cDwm~p{\b\fd\u0004\u0015DBF\u0011\t&0f+;pU\t;m\u001c\u000e6U 9nt_R_=DJ\u0002\u001dI\u0012:\r\u001a\u001cu\u0015uZ.F\u001b-p\u0019\b\u0019s'8pgTW\u0015Z\u001drG[c{e7\u0010\u001a0F2%PJ+P6YKz\u001dAQkW\u00021bIO'!v* N\u001c\n\u0007cP\u001dO#f \bw6^3+`\"\u001f\u0004 -!JD\u0003G4!\u0001+", "1n_F x\u001bY\u0004\u0007tp", "uI9\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`Vo!K@&?b\ri\u0018w\u001f=?C?m7-jO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\"^W]+ \u0014#B.wS\u0001\u007f\u00125XoJ|\b\fkt1soO`\u0014F\r^sK1sPg_CWE\u000fq*w\u001b)\u001efCImt{\"*Vd7\u0019~S\u001fv`ONcP\u0018\bB(=\u0001%DOw`F\u0003'h[\u007fA!2k\u0004tu7\rCs\u0017n\u000eZH\u0014Fb\u007f)\u0002CF#72\u0006\u001a;Te?ZM\u001bl(c]rI1:\u0018rogG\"P[!c@km\u0001\u0001b\n\bXo(6\u0010\rQo\u0001\u0015Rc {ePG$Tn\u001dtE15w~\fe%&2\u0015P#\rr2jA[\u0013Rx<U\u000bYV$:V\u001f\u0002Rr%Fo7EZ\u0011S)3ZIzP2|\f\u001fB\u0002\u0015\f%IP>\u00035 /)<l\u0002`j7\u0016qa\"bw<e.-D\u0011\u001cDwm~p{\b\fd\u0004\u0015DBF\u0011\t&0f+;pU\t;m\u001c\u000e6U 9nt_R_=DJ\u0002\u001dI\u0012:\r\u001a\u001cu\u0015uZ.F\u001b-p\u0019\b\u0019s'8pgTW\u0015Z\u001drG[c{e7\u0010\u001a0F2%PJ+P6YKz\u001dAQkW\u00021bIOJ6\u0004 .K\u0016\u0005\u001b\u001a\u0005)M&e$yA|RxpQ5\u001b>AF\u0012]<\u001fE(\b\fQNcz\u0017[d_D\u0013\u0012\u00058{|\u0013;G$s'9\u00026wG1}zjK\f;bG\t@lq\u0012\u0015{mrJ", "1n_F \u000e,4k\u0005\u0003`", "uI9\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`Vo!K@&?b\ri\u0018w\u001f=?C?m7-jO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\"^W]+ \u0014#B.wS\u0001\u007f\u00125XoJ|\b\fkt1soO`\u0014F\r^sK1sPg_CWE\u000fq*w\u001b)\u001efCImt{\"*Vd7\u0019~S\u001fv`ONcP\u0018\bB(=\u0001%DOw`F\u0003'h[\u007fA!2k\u0004tu7\rCs\u0017n\u000eZH\u0014Fb\u007f)\u0002CF#72\u0006\u001a;Te?ZM\u001bl(c]rI1:\u0018rogG\"P[!c@km\u0001\u0001b\n\bXo(6\u0010\rQo\u0001\u0015Rc {ePG$Tn\u001dtE15w~\fe%&2\u0015P#\rr2jA[\u0013Rx<U\u000bYV$:V\u001f\u0002Rr%Fo7EZ\u0011S)3ZIzP2|\f\u001fB\u0002\u0015\f%IP>\u00035 /)<l\u0002`j7\u0016qa\"bw<e.-D\u0011\u001cDwm~p{\b\fd\u0004\u0015DBF\u0011\t&0f+;pU\t;m\u001c\u000e6U 9nt_R_=DJ\u0002\u001dI\u0012:\r\u001a\u001cu\u0015uZ.F\u001b-p\u0019\b\u0019s'8pgTW\u0015Z\u001drG[c{e7\u0010\u001a0F2%PJ+P6YKz\u001dAQkW\u00021bIOJ6\u0004 .K\u0016\u0005\u001b\u001a\u0005)M&e$yA|RxpQ5\u001b>AF\u0012]<\u001fE(\b\fQNcz\u0017[d_g(\u001fzFxv\u000eO}X\u007f%<\u0001:i\u0011wq@#I\b3V\u0002\u0019C:g1\u0002ytp~]\u0004Y\nF-\r4Kf%@#jcpe-7.\bJVb{@z('Wq]NxP6Gv\u0019\u000ba#4\\3Tq1 p", "3pd._:", "", "=sW2e", "6`b T4>:\u0015\u0013\u0005n;X\n0e}7\u007fI\u0003r&V|\u00129\u000745g", "6`b T4>:\u0015\u0013\u0005n;X\n0e}7\u007fI\u0003r&V|\u00129\u000745g<0;g%.`R5x4%\u0015do9", "6`b T4><#\baZ@\u0007\u0019>A\u000f7\tD}'&G}", "6`b T4><#\baZ@\u0007\u0019>A\u000f7\tD}'&G}LLz\u001fDY\u0011/1z\u00165M?Ik", "6`b566=S", "", "6`b566=S\u007fz\u000fh<\fd0f\u007f&\u000bD\n\u0019rV~\u001b@s5DY\f", "6`b566=S\u007fz\u000fh<\fd0f\u007f&\u000bD\n\u0019rV~\u001b@s5DY\f^Gq\u0010=MVJeA\u001e\u001ch]G\u0007", ";da4X", ">kd@", "BnBAe0GU", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SpanStyle {
    public static final int $stable = 0;
    private final long background;
    private final BaselineShift baselineShift;
    private final DrawStyle drawStyle;
    private final FontFamily fontFamily;
    private final String fontFeatureSettings;
    private final long fontSize;
    private final FontStyle fontStyle;
    private final FontSynthesis fontSynthesis;
    private final FontWeight fontWeight;
    private final long letterSpacing;
    private final LocaleList localeList;
    private final PlatformSpanStyle platformStyle;
    private final Shadow shadow;
    private final TextDecoration textDecoration;
    private final TextForegroundStyle textForegroundStyle;
    private final TextGeometricTransform textGeometricTransform;

    public /* synthetic */ SpanStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, platformSpanStyle, drawStyle);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0016V|Cd\t.c]\u0007+\n^(@`qO\u001d6\u0017{Kf~G\u0003*R\u0004ctw`$VNgmxT#Jy%jM{.]\bKfP5\u001f\u0011[\u0019V.6@\u000b}\u0011/'(L\u0012\u0002l4\u0015n\\)K\u007f\rm\fCT\u0007.g5z\u0001_v4IO*\u0004+'\u0010<S&%#\fvU\u0007\u001c'T@\u0016r^6[cA7.3eJW\u0013\u0019\u00051ppWGfe\u001d34\u0010;\u0011c\u000fD")
    @InterfaceC1492Gx
    public /* synthetic */ SpanStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, platformSpanStyle);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0016V|Cd\t.c]\u0007+\n^(@`qO\u001d6\u0017{Kf~G\u0003*R\u0004ctw`$VNgmxT#Jy%jM{.]\bKfP5\u001f\u0011[\u0019V.6@\u000b}\u0011/'(L\u0012\u0002l4\u0015n\\)K\u007f\rm\fCT\u0007.g5z\u0001_v4IO*\u0004+'\u0010<S&%#\fvU\u0007\u001c'T@\u0016r^6[cA7.3eJW\u0013\u0019\u00051ppWGfe\u001d34\u0010;\u0011c\u000fD")
    @InterfaceC1492Gx
    public /* synthetic */ SpanStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow);
    }

    public /* synthetic */ SpanStyle(Brush brush, float f2, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, DefaultConstructorMarker defaultConstructorMarker) {
        this(brush, f2, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformSpanStyle, drawStyle);
    }

    public /* synthetic */ SpanStyle(TextForegroundStyle textForegroundStyle, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, DefaultConstructorMarker defaultConstructorMarker) {
        this(textForegroundStyle, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformSpanStyle, drawStyle);
    }

    private SpanStyle(TextForegroundStyle textForegroundStyle, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle) {
        this.textForegroundStyle = textForegroundStyle;
        this.fontSize = j2;
        this.fontWeight = fontWeight;
        this.fontStyle = fontStyle;
        this.fontSynthesis = fontSynthesis;
        this.fontFamily = fontFamily;
        this.fontFeatureSettings = str;
        this.letterSpacing = j3;
        this.baselineShift = baselineShift;
        this.textGeometricTransform = textGeometricTransform;
        this.localeList = localeList;
        this.background = j4;
        this.textDecoration = textDecoration;
        this.shadow = shadow;
        this.platformStyle = platformSpanStyle;
        this.drawStyle = drawStyle;
    }

    public final TextForegroundStyle getTextForegroundStyle$ui_text_release() {
        return this.textForegroundStyle;
    }

    public /* synthetic */ SpanStyle(TextForegroundStyle textForegroundStyle, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(textForegroundStyle, (i2 & 2) != 0 ? TextUnit.Companion.m6842getUnspecifiedXSAIIZE() : j2, (i2 & 4) != 0 ? null : fontWeight, (i2 & 8) != 0 ? null : fontStyle, (i2 + 16) - (i2 | 16) != 0 ? null : fontSynthesis, (i2 + 32) - (i2 | 32) != 0 ? null : fontFamily, (i2 + 64) - (i2 | 64) != 0 ? null : str, (i2 + 128) - (i2 | 128) != 0 ? TextUnit.Companion.m6842getUnspecifiedXSAIIZE() : j3, (i2 & 256) != 0 ? null : baselineShift, (i2 + 512) - (i2 | 512) != 0 ? null : textGeometricTransform, (-1) - (((-1) - i2) | ((-1) - 1024)) != 0 ? null : localeList, (-1) - (((-1) - i2) | ((-1) - 2048)) != 0 ? Color.Companion.m4214getUnspecified0d7_KjU() : j4, (i2 + 4096) - (i2 | 4096) != 0 ? null : textDecoration, (-1) - (((-1) - i2) | ((-1) - 8192)) != 0 ? null : shadow, (i2 + 16384) - (i2 | 16384) != 0 ? null : platformSpanStyle, (i2 + 32768) - (i2 | 32768) == 0 ? drawStyle : null, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: getFontSize-XSAIIZE, reason: not valid java name */
    public final long m6074getFontSizeXSAIIZE() {
        return this.fontSize;
    }

    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    /* JADX INFO: renamed from: getFontStyle-4Lr2A7w, reason: not valid java name */
    public final FontStyle m6075getFontStyle4Lr2A7w() {
        return this.fontStyle;
    }

    /* JADX INFO: renamed from: getFontSynthesis-ZQGJjVo, reason: not valid java name */
    public final FontSynthesis m6076getFontSynthesisZQGJjVo() {
        return this.fontSynthesis;
    }

    public final FontFamily getFontFamily() {
        return this.fontFamily;
    }

    public final String getFontFeatureSettings() {
        return this.fontFeatureSettings;
    }

    /* JADX INFO: renamed from: getLetterSpacing-XSAIIZE, reason: not valid java name */
    public final long m6077getLetterSpacingXSAIIZE() {
        return this.letterSpacing;
    }

    /* JADX INFO: renamed from: getBaselineShift-5SSeXJ0, reason: not valid java name */
    public final BaselineShift m6072getBaselineShift5SSeXJ0() {
        return this.baselineShift;
    }

    public final TextGeometricTransform getTextGeometricTransform() {
        return this.textGeometricTransform;
    }

    public final LocaleList getLocaleList() {
        return this.localeList;
    }

    /* JADX INFO: renamed from: getBackground-0d7_KjU, reason: not valid java name */
    public final long m6071getBackground0d7_KjU() {
        return this.background;
    }

    public final TextDecoration getTextDecoration() {
        return this.textDecoration;
    }

    public final Shadow getShadow() {
        return this.shadow;
    }

    public final PlatformSpanStyle getPlatformStyle() {
        return this.platformStyle;
    }

    public final DrawStyle getDrawStyle() {
        return this.drawStyle;
    }

    public /* synthetic */ SpanStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 + 1) - (i2 | 1) != 0 ? Color.Companion.m4214getUnspecified0d7_KjU() : j2, (i2 & 2) != 0 ? TextUnit.Companion.m6842getUnspecifiedXSAIIZE() : j3, (i2 + 4) - (i2 | 4) != 0 ? null : fontWeight, (i2 & 8) != 0 ? null : fontStyle, (i2 + 16) - (i2 | 16) != 0 ? null : fontSynthesis, (i2 & 32) != 0 ? null : fontFamily, (i2 & 64) != 0 ? null : str, (-1) - (((-1) - i2) | ((-1) - 128)) != 0 ? TextUnit.Companion.m6842getUnspecifiedXSAIIZE() : j4, (i2 + 256) - (i2 | 256) != 0 ? null : baselineShift, (-1) - (((-1) - i2) | ((-1) - 512)) != 0 ? null : textGeometricTransform, (i2 & 1024) != 0 ? null : localeList, (-1) - (((-1) - i2) | ((-1) - 2048)) != 0 ? Color.Companion.m4214getUnspecified0d7_KjU() : j5, (-1) - (((-1) - i2) | ((-1) - 4096)) != 0 ? null : textDecoration, (i2 & 8192) != 0 ? null : shadow, (DefaultConstructorMarker) null);
    }

    private SpanStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow) {
        this(TextForegroundStyle.Companion.m6548from8_81llA(j2), j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, (PlatformSpanStyle) null, (DrawStyle) null, 32768, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ SpanStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 + 1) - (i2 | 1) != 0 ? Color.Companion.m4214getUnspecified0d7_KjU() : j2, (i2 & 2) != 0 ? TextUnit.Companion.m6842getUnspecifiedXSAIIZE() : j3, (i2 & 4) != 0 ? null : fontWeight, (i2 + 8) - (i2 | 8) != 0 ? null : fontStyle, (i2 & 16) != 0 ? null : fontSynthesis, (-1) - (((-1) - i2) | ((-1) - 32)) != 0 ? null : fontFamily, (i2 + 64) - (i2 | 64) != 0 ? null : str, (i2 + 128) - (i2 | 128) != 0 ? TextUnit.Companion.m6842getUnspecifiedXSAIIZE() : j4, (i2 + 256) - (i2 | 256) != 0 ? null : baselineShift, (-1) - (((-1) - i2) | ((-1) - 512)) != 0 ? null : textGeometricTransform, (i2 & 1024) != 0 ? null : localeList, (i2 & 2048) != 0 ? Color.Companion.m4214getUnspecified0d7_KjU() : j5, (i2 & 4096) != 0 ? null : textDecoration, (i2 & 8192) != 0 ? null : shadow, (-1) - (((-1) - i2) | ((-1) - 16384)) != 0 ? null : platformSpanStyle, (DefaultConstructorMarker) null);
    }

    private SpanStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle) {
        this(TextForegroundStyle.Companion.m6548from8_81llA(j2), j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, platformSpanStyle, (DrawStyle) null, 32768, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ SpanStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 + 1) - (i2 | 1) != 0 ? Color.Companion.m4214getUnspecified0d7_KjU() : j2, (-1) - (((-1) - i2) | ((-1) - 2)) != 0 ? TextUnit.Companion.m6842getUnspecifiedXSAIIZE() : j3, (-1) - (((-1) - i2) | ((-1) - 4)) != 0 ? null : fontWeight, (i2 + 8) - (i2 | 8) != 0 ? null : fontStyle, (i2 & 16) != 0 ? null : fontSynthesis, (-1) - (((-1) - i2) | ((-1) - 32)) != 0 ? null : fontFamily, (-1) - (((-1) - i2) | ((-1) - 64)) != 0 ? null : str, (-1) - (((-1) - i2) | ((-1) - 128)) != 0 ? TextUnit.Companion.m6842getUnspecifiedXSAIIZE() : j4, (i2 + 256) - (i2 | 256) != 0 ? null : baselineShift, (i2 & 512) != 0 ? null : textGeometricTransform, (-1) - (((-1) - i2) | ((-1) - 1024)) != 0 ? null : localeList, (-1) - (((-1) - i2) | ((-1) - 2048)) != 0 ? Color.Companion.m4214getUnspecified0d7_KjU() : j5, (i2 & 4096) != 0 ? null : textDecoration, (i2 & 8192) != 0 ? null : shadow, (i2 + 16384) - (i2 | 16384) != 0 ? null : platformSpanStyle, (i2 & 32768) != 0 ? null : drawStyle, (DefaultConstructorMarker) null);
    }

    private SpanStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle) {
        this(TextForegroundStyle.Companion.m6548from8_81llA(j2), j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, platformSpanStyle, drawStyle, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ SpanStyle(Brush brush, float f2, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(brush, (i2 + 2) - (i2 | 2) != 0 ? Float.NaN : f2, (-1) - (((-1) - i2) | ((-1) - 4)) != 0 ? TextUnit.Companion.m6842getUnspecifiedXSAIIZE() : j2, (i2 + 8) - (i2 | 8) != 0 ? null : fontWeight, (-1) - (((-1) - i2) | ((-1) - 16)) != 0 ? null : fontStyle, (i2 & 32) != 0 ? null : fontSynthesis, (-1) - (((-1) - i2) | ((-1) - 64)) != 0 ? null : fontFamily, (i2 & 128) != 0 ? null : str, (i2 & 256) != 0 ? TextUnit.Companion.m6842getUnspecifiedXSAIIZE() : j3, (i2 & 512) != 0 ? null : baselineShift, (i2 & 1024) != 0 ? null : textGeometricTransform, (i2 & 2048) != 0 ? null : localeList, (i2 + 4096) - (i2 | 4096) != 0 ? Color.Companion.m4214getUnspecified0d7_KjU() : j4, (i2 & 8192) != 0 ? null : textDecoration, (i2 & 16384) != 0 ? null : shadow, (-1) - (((-1) - 32768) | ((-1) - i2)) != 0 ? null : platformSpanStyle, (i2 + 65536) - (i2 | 65536) == 0 ? drawStyle : null, (DefaultConstructorMarker) null);
    }

    private SpanStyle(Brush brush, float f2, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle) {
        this(TextForegroundStyle.Companion.from(brush, f2), j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformSpanStyle, drawStyle, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m6073getColor0d7_KjU() {
        return this.textForegroundStyle.mo6425getColor0d7_KjU();
    }

    public final Brush getBrush() {
        return this.textForegroundStyle.getBrush();
    }

    public final float getAlpha() {
        return this.textForegroundStyle.getAlpha();
    }

    public static /* synthetic */ SpanStyle merge$default(SpanStyle spanStyle, SpanStyle spanStyle2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            spanStyle2 = null;
        }
        return spanStyle.merge(spanStyle2);
    }

    public final SpanStyle merge(SpanStyle spanStyle) {
        return spanStyle == null ? this : SpanStyleKt.m6078fastMergedSHsh3o(this, spanStyle.textForegroundStyle.mo6425getColor0d7_KjU(), spanStyle.textForegroundStyle.getBrush(), spanStyle.textForegroundStyle.getAlpha(), spanStyle.fontSize, spanStyle.fontWeight, spanStyle.fontStyle, spanStyle.fontSynthesis, spanStyle.fontFamily, spanStyle.fontFeatureSettings, spanStyle.letterSpacing, spanStyle.baselineShift, spanStyle.textGeometricTransform, spanStyle.localeList, spanStyle.background, spanStyle.textDecoration, spanStyle.shadow, spanStyle.platformStyle, spanStyle.drawStyle);
    }

    public final SpanStyle plus(SpanStyle spanStyle) {
        return merge(spanStyle);
    }

    /* JADX INFO: renamed from: copy-IuqyXdg$default, reason: not valid java name */
    public static /* synthetic */ SpanStyle m6065copyIuqyXdg$default(SpanStyle spanStyle, long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, int i2, Object obj) {
        long jM6073getColor0d7_KjU = j2;
        long j6 = j3;
        FontFamily fontFamily2 = fontFamily;
        FontSynthesis fontSynthesis2 = fontSynthesis;
        FontStyle fontStyle2 = fontStyle;
        FontWeight fontWeight2 = fontWeight;
        TextGeometricTransform textGeometricTransform2 = textGeometricTransform;
        BaselineShift baselineShift2 = baselineShift;
        long j7 = j4;
        String str2 = str;
        TextDecoration textDecoration2 = textDecoration;
        Shadow shadow2 = shadow;
        long j8 = j5;
        LocaleList localeList2 = localeList;
        if ((i2 + 1) - (i2 | 1) != 0) {
            jM6073getColor0d7_KjU = spanStyle.m6073getColor0d7_KjU();
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            j6 = spanStyle.fontSize;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            fontWeight2 = spanStyle.fontWeight;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            fontStyle2 = spanStyle.fontStyle;
        }
        if ((i2 + 16) - (i2 | 16) != 0) {
            fontSynthesis2 = spanStyle.fontSynthesis;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 32)) != 0) {
            fontFamily2 = spanStyle.fontFamily;
        }
        if ((i2 & 64) != 0) {
            str2 = spanStyle.fontFeatureSettings;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 128)) != 0) {
            j7 = spanStyle.letterSpacing;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 256)) != 0) {
            baselineShift2 = spanStyle.baselineShift;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 512)) != 0) {
            textGeometricTransform2 = spanStyle.textGeometricTransform;
        }
        if ((i2 & 1024) != 0) {
            localeList2 = spanStyle.localeList;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2048)) != 0) {
            j8 = spanStyle.background;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4096)) != 0) {
            textDecoration2 = spanStyle.textDecoration;
        }
        if ((i2 + 8192) - (i2 | 8192) != 0) {
            shadow2 = spanStyle.shadow;
        }
        FontStyle fontStyle3 = fontStyle2;
        return spanStyle.m6069copyIuqyXdg(jM6073getColor0d7_KjU, j6, fontWeight2, fontStyle3, fontSynthesis2, fontFamily2, str2, j7, baselineShift2, textGeometricTransform2, localeList2, j8, textDecoration2, shadow2);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0016V|Cd\t.c]\u0007+\n`.kQkZ\u001c;\u0017}\u000ff\u0006X\u0002*b|%z(Ps\u0002[k|xZ\u001f>?QdQ\u0011ak\\<gJ9Q\u001cH&E({H\u0007\u0005\u001f/C%V\u0003;M.\t\u0010N\u001fQ\b4BA=X;z7.o\u0013\u0013\n;P\u0015e\u007f-\u001aJ=W\"2$A8y\u007f\u001bs\u0001+bbLD!\u000fNEsdt;\u001d?\u0013\tF$~,EYc\u000f^%\nH\u0016\u0014\u007f\u0006R1=\r}s^nr{")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: copy-IuqyXdg, reason: not valid java name */
    public final /* synthetic */ SpanStyle m6069copyIuqyXdg(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow) {
        TextForegroundStyle textForegroundStyleM6548from8_81llA;
        if (Color.m4179equalsimpl0(j2, m6073getColor0d7_KjU())) {
            textForegroundStyleM6548from8_81llA = this.textForegroundStyle;
        } else {
            textForegroundStyleM6548from8_81llA = TextForegroundStyle.Companion.m6548from8_81llA(j2);
        }
        return new SpanStyle(textForegroundStyleM6548from8_81llA, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, this.platformStyle, this.drawStyle, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: copy-2BkPm_w$default, reason: not valid java name */
    public static /* synthetic */ SpanStyle m6063copy2BkPm_w$default(SpanStyle spanStyle, long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, int i2, Object obj) {
        FontSynthesis fontSynthesis2 = fontSynthesis;
        FontStyle fontStyle2 = fontStyle;
        FontWeight fontWeight2 = fontWeight;
        long j6 = j3;
        TextGeometricTransform textGeometricTransform2 = textGeometricTransform;
        long j7 = j4;
        BaselineShift baselineShift2 = baselineShift;
        String str2 = str;
        FontFamily fontFamily2 = fontFamily;
        PlatformSpanStyle platformSpanStyle2 = platformSpanStyle;
        TextDecoration textDecoration2 = textDecoration;
        Shadow shadow2 = shadow;
        long j8 = j5;
        LocaleList localeList2 = localeList;
        if ((i2 & 1) != 0) {
            j2 = spanStyle.m6073getColor0d7_KjU();
        }
        if ((i2 & 2) != 0) {
            j6 = spanStyle.fontSize;
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            fontWeight2 = spanStyle.fontWeight;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            fontStyle2 = spanStyle.fontStyle;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 16)) != 0) {
            fontSynthesis2 = spanStyle.fontSynthesis;
        }
        if ((i2 & 32) != 0) {
            fontFamily2 = spanStyle.fontFamily;
        }
        if ((i2 + 64) - (i2 | 64) != 0) {
            str2 = spanStyle.fontFeatureSettings;
        }
        if ((i2 + 128) - (i2 | 128) != 0) {
            j7 = spanStyle.letterSpacing;
        }
        if ((i2 & 256) != 0) {
            baselineShift2 = spanStyle.baselineShift;
        }
        if ((i2 & 512) != 0) {
            textGeometricTransform2 = spanStyle.textGeometricTransform;
        }
        if ((i2 + 1024) - (i2 | 1024) != 0) {
            localeList2 = spanStyle.localeList;
        }
        if ((i2 + 2048) - (i2 | 2048) != 0) {
            j8 = spanStyle.background;
        }
        if ((i2 & 4096) != 0) {
            textDecoration2 = spanStyle.textDecoration;
        }
        if ((i2 & 8192) != 0) {
            shadow2 = spanStyle.shadow;
        }
        if ((i2 + 16384) - (i2 | 16384) != 0) {
            platformSpanStyle2 = spanStyle.platformStyle;
        }
        return spanStyle.m6067copy2BkPm_w(j2, j6, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str2, j7, baselineShift2, textGeometricTransform2, localeList2, j8, textDecoration2, shadow2, platformSpanStyle2);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0016V|Cd\t.c]\u0007+\n`.kQkZ\u001c;\u0017}\u000ff\u0006X\u0002*b|%z(Ps\u0002[k|xZ\u001f>?QdQ\u0011ak\\<gJ9Q\u001cH&E({H\u0007\u0005\u001f/C%V\u0003;M.\t\u0010N\u001fQ\b4BA=X;z7.o\u0013\u0013\n;P\u0015e\u007f-\u001aJ=W\"2$A8y\u007f\u001bs\u0001+bbLD!\u000fNEsdt;\u001d?\u0013\tF$~,EYc\u000f^%\nH\u0016\u0014\u007f\u0006R1=\r}s^nr{")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: copy-2BkPm_w, reason: not valid java name */
    public final /* synthetic */ SpanStyle m6067copy2BkPm_w(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle) {
        TextForegroundStyle textForegroundStyleM6548from8_81llA;
        if (Color.m4179equalsimpl0(j2, m6073getColor0d7_KjU())) {
            textForegroundStyleM6548from8_81llA = this.textForegroundStyle;
        } else {
            textForegroundStyleM6548from8_81llA = TextForegroundStyle.Companion.m6548from8_81llA(j2);
        }
        return new SpanStyle(textForegroundStyleM6548from8_81llA, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, platformSpanStyle, (DrawStyle) null, 32768, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: copy-GSF8kmg$default, reason: not valid java name */
    public static /* synthetic */ SpanStyle m6064copyGSF8kmg$default(SpanStyle spanStyle, long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, int i2, Object obj) {
        long jM6073getColor0d7_KjU = j2;
        FontWeight fontWeight2 = fontWeight;
        FontStyle fontStyle2 = fontStyle;
        long j6 = j3;
        TextGeometricTransform textGeometricTransform2 = textGeometricTransform;
        long j7 = j4;
        BaselineShift baselineShift2 = baselineShift;
        String str2 = str;
        FontFamily fontFamily2 = fontFamily;
        FontSynthesis fontSynthesis2 = fontSynthesis;
        DrawStyle drawStyle2 = drawStyle;
        TextDecoration textDecoration2 = textDecoration;
        Shadow shadow2 = shadow;
        long j8 = j5;
        PlatformSpanStyle platformSpanStyle2 = platformSpanStyle;
        LocaleList localeList2 = localeList;
        if ((i2 + 1) - (i2 | 1) != 0) {
            jM6073getColor0d7_KjU = spanStyle.m6073getColor0d7_KjU();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            j6 = spanStyle.fontSize;
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            fontWeight2 = spanStyle.fontWeight;
        }
        if ((i2 & 8) != 0) {
            fontStyle2 = spanStyle.fontStyle;
        }
        if ((i2 + 16) - (i2 | 16) != 0) {
            fontSynthesis2 = spanStyle.fontSynthesis;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 32)) != 0) {
            fontFamily2 = spanStyle.fontFamily;
        }
        if ((i2 + 64) - (i2 | 64) != 0) {
            str2 = spanStyle.fontFeatureSettings;
        }
        if ((i2 & 128) != 0) {
            j7 = spanStyle.letterSpacing;
        }
        if ((i2 + 256) - (i2 | 256) != 0) {
            baselineShift2 = spanStyle.baselineShift;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 512)) != 0) {
            textGeometricTransform2 = spanStyle.textGeometricTransform;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 1024)) != 0) {
            localeList2 = spanStyle.localeList;
        }
        if ((i2 & 2048) != 0) {
            j8 = spanStyle.background;
        }
        if ((i2 & 4096) != 0) {
            textDecoration2 = spanStyle.textDecoration;
        }
        if ((i2 & 8192) != 0) {
            shadow2 = spanStyle.shadow;
        }
        if ((i2 & 16384) != 0) {
            platformSpanStyle2 = spanStyle.platformStyle;
        }
        if ((i2 + 32768) - (i2 | 32768) != 0) {
            drawStyle2 = spanStyle.drawStyle;
        }
        FontFamily fontFamily3 = fontFamily2;
        return spanStyle.m6068copyGSF8kmg(jM6073getColor0d7_KjU, j6, fontWeight2, fontStyle2, fontSynthesis2, fontFamily3, str2, j7, baselineShift2, textGeometricTransform2, localeList2, j8, textDecoration2, shadow2, platformSpanStyle2, drawStyle2);
    }

    /* JADX INFO: renamed from: copy-GSF8kmg, reason: not valid java name */
    public final SpanStyle m6068copyGSF8kmg(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle) {
        TextForegroundStyle textForegroundStyleM6548from8_81llA;
        if (Color.m4179equalsimpl0(j2, m6073getColor0d7_KjU())) {
            textForegroundStyleM6548from8_81llA = this.textForegroundStyle;
        } else {
            textForegroundStyleM6548from8_81llA = TextForegroundStyle.Companion.m6548from8_81llA(j2);
        }
        return new SpanStyle(textForegroundStyleM6548from8_81llA, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, platformSpanStyle, drawStyle, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: copy-NcG25M8$default, reason: not valid java name */
    public static /* synthetic */ SpanStyle m6066copyNcG25M8$default(SpanStyle spanStyle, Brush brush, float f2, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, int i2, Object obj) {
        float alpha = f2;
        FontWeight fontWeight2 = fontWeight;
        FontStyle fontStyle2 = fontStyle;
        long j5 = j2;
        BaselineShift baselineShift2 = baselineShift;
        String str2 = str;
        long j6 = j3;
        TextGeometricTransform textGeometricTransform2 = textGeometricTransform;
        FontFamily fontFamily2 = fontFamily;
        FontSynthesis fontSynthesis2 = fontSynthesis;
        long j7 = j4;
        PlatformSpanStyle platformSpanStyle2 = platformSpanStyle;
        DrawStyle drawStyle2 = drawStyle;
        TextDecoration textDecoration2 = textDecoration;
        Shadow shadow2 = shadow;
        LocaleList localeList2 = localeList;
        if ((i2 + 2) - (i2 | 2) != 0) {
            alpha = spanStyle.getAlpha();
        }
        if ((i2 & 4) != 0) {
            j5 = spanStyle.fontSize;
        }
        if ((i2 & 8) != 0) {
            fontWeight2 = spanStyle.fontWeight;
        }
        if ((i2 + 16) - (i2 | 16) != 0) {
            fontStyle2 = spanStyle.fontStyle;
        }
        if ((i2 + 32) - (i2 | 32) != 0) {
            fontSynthesis2 = spanStyle.fontSynthesis;
        }
        if ((i2 + 64) - (i2 | 64) != 0) {
            fontFamily2 = spanStyle.fontFamily;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 128)) != 0) {
            str2 = spanStyle.fontFeatureSettings;
        }
        if ((i2 & 256) != 0) {
            j6 = spanStyle.letterSpacing;
        }
        if ((i2 + 512) - (i2 | 512) != 0) {
            baselineShift2 = spanStyle.baselineShift;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 1024)) != 0) {
            textGeometricTransform2 = spanStyle.textGeometricTransform;
        }
        if ((i2 & 2048) != 0) {
            localeList2 = spanStyle.localeList;
        }
        if ((i2 + 4096) - (i2 | 4096) != 0) {
            j7 = spanStyle.background;
        }
        if ((i2 & 8192) != 0) {
            textDecoration2 = spanStyle.textDecoration;
        }
        if ((i2 & 16384) != 0) {
            shadow2 = spanStyle.shadow;
        }
        if ((i2 & 32768) != 0) {
            platformSpanStyle2 = spanStyle.platformStyle;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 65536)) != 0) {
            drawStyle2 = spanStyle.drawStyle;
        }
        FontFamily fontFamily3 = fontFamily2;
        return spanStyle.m6070copyNcG25M8(brush, alpha, j5, fontWeight2, fontStyle2, fontSynthesis2, fontFamily3, str2, j6, baselineShift2, textGeometricTransform2, localeList2, j7, textDecoration2, shadow2, platformSpanStyle2, drawStyle2);
    }

    /* JADX INFO: renamed from: copy-NcG25M8, reason: not valid java name */
    public final SpanStyle m6070copyNcG25M8(Brush brush, float f2, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle) {
        return new SpanStyle(TextForegroundStyle.Companion.from(brush, f2), j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformSpanStyle, drawStyle, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpanStyle)) {
            return false;
        }
        SpanStyle spanStyle = (SpanStyle) obj;
        return hasSameLayoutAffectingAttributes$ui_text_release(spanStyle) && hasSameNonLayoutAttributes$ui_text_release(spanStyle);
    }

    public final boolean hasSameLayoutAffectingAttributes$ui_text_release(SpanStyle spanStyle) {
        if (this == spanStyle) {
            return true;
        }
        return TextUnit.m6828equalsimpl0(this.fontSize, spanStyle.fontSize) && Intrinsics.areEqual(this.fontWeight, spanStyle.fontWeight) && Intrinsics.areEqual(this.fontStyle, spanStyle.fontStyle) && Intrinsics.areEqual(this.fontSynthesis, spanStyle.fontSynthesis) && Intrinsics.areEqual(this.fontFamily, spanStyle.fontFamily) && Intrinsics.areEqual(this.fontFeatureSettings, spanStyle.fontFeatureSettings) && TextUnit.m6828equalsimpl0(this.letterSpacing, spanStyle.letterSpacing) && Intrinsics.areEqual(this.baselineShift, spanStyle.baselineShift) && Intrinsics.areEqual(this.textGeometricTransform, spanStyle.textGeometricTransform) && Intrinsics.areEqual(this.localeList, spanStyle.localeList) && Color.m4179equalsimpl0(this.background, spanStyle.background) && Intrinsics.areEqual(this.platformStyle, spanStyle.platformStyle);
    }

    public final boolean hasSameNonLayoutAttributes$ui_text_release(SpanStyle spanStyle) {
        return Intrinsics.areEqual(this.textForegroundStyle, spanStyle.textForegroundStyle) && Intrinsics.areEqual(this.textDecoration, spanStyle.textDecoration) && Intrinsics.areEqual(this.shadow, spanStyle.shadow) && Intrinsics.areEqual(this.drawStyle, spanStyle.drawStyle);
    }

    public int hashCode() {
        int iM4185hashCodeimpl = Color.m4185hashCodeimpl(m6073getColor0d7_KjU()) * 31;
        Brush brush = getBrush();
        int iHashCode = (((((iM4185hashCodeimpl + (brush != null ? brush.hashCode() : 0)) * 31) + Float.hashCode(getAlpha())) * 31) + TextUnit.m6832hashCodeimpl(this.fontSize)) * 31;
        FontWeight fontWeight = this.fontWeight;
        int iHashCode2 = (iHashCode + (fontWeight != null ? fontWeight.hashCode() : 0)) * 31;
        FontStyle fontStyle = this.fontStyle;
        int iM6234hashCodeimpl = (iHashCode2 + (fontStyle != null ? FontStyle.m6234hashCodeimpl(fontStyle.m6236unboximpl()) : 0)) * 31;
        FontSynthesis fontSynthesis = this.fontSynthesis;
        int iM6245hashCodeimpl = (iM6234hashCodeimpl + (fontSynthesis != null ? FontSynthesis.m6245hashCodeimpl(fontSynthesis.m6249unboximpl()) : 0)) * 31;
        FontFamily fontFamily = this.fontFamily;
        int iHashCode3 = (iM6245hashCodeimpl + (fontFamily != null ? fontFamily.hashCode() : 0)) * 31;
        String str = this.fontFeatureSettings;
        int iHashCode4 = (((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + TextUnit.m6832hashCodeimpl(this.letterSpacing)) * 31;
        BaselineShift baselineShift = this.baselineShift;
        int iM6415hashCodeimpl = (iHashCode4 + (baselineShift != null ? BaselineShift.m6415hashCodeimpl(baselineShift.m6417unboximpl()) : 0)) * 31;
        TextGeometricTransform textGeometricTransform = this.textGeometricTransform;
        int iHashCode5 = (iM6415hashCodeimpl + (textGeometricTransform != null ? textGeometricTransform.hashCode() : 0)) * 31;
        LocaleList localeList = this.localeList;
        int iHashCode6 = (((iHashCode5 + (localeList != null ? localeList.hashCode() : 0)) * 31) + Color.m4185hashCodeimpl(this.background)) * 31;
        TextDecoration textDecoration = this.textDecoration;
        int iHashCode7 = (iHashCode6 + (textDecoration != null ? textDecoration.hashCode() : 0)) * 31;
        Shadow shadow = this.shadow;
        int iHashCode8 = (iHashCode7 + (shadow != null ? shadow.hashCode() : 0)) * 31;
        PlatformSpanStyle platformSpanStyle = this.platformStyle;
        int iHashCode9 = (iHashCode8 + (platformSpanStyle != null ? platformSpanStyle.hashCode() : 0)) * 31;
        DrawStyle drawStyle = this.drawStyle;
        return iHashCode9 + (drawStyle != null ? drawStyle.hashCode() : 0);
    }

    public final int hashCodeLayoutAffectingAttributes$ui_text_release() {
        int iM6832hashCodeimpl = TextUnit.m6832hashCodeimpl(this.fontSize) * 31;
        FontWeight fontWeight = this.fontWeight;
        int iHashCode = (iM6832hashCodeimpl + (fontWeight != null ? fontWeight.hashCode() : 0)) * 31;
        FontStyle fontStyle = this.fontStyle;
        int iM6234hashCodeimpl = (iHashCode + (fontStyle != null ? FontStyle.m6234hashCodeimpl(fontStyle.m6236unboximpl()) : 0)) * 31;
        FontSynthesis fontSynthesis = this.fontSynthesis;
        int iM6245hashCodeimpl = (iM6234hashCodeimpl + (fontSynthesis != null ? FontSynthesis.m6245hashCodeimpl(fontSynthesis.m6249unboximpl()) : 0)) * 31;
        FontFamily fontFamily = this.fontFamily;
        int iHashCode2 = (iM6245hashCodeimpl + (fontFamily != null ? fontFamily.hashCode() : 0)) * 31;
        String str = this.fontFeatureSettings;
        int iHashCode3 = (((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + TextUnit.m6832hashCodeimpl(this.letterSpacing)) * 31;
        BaselineShift baselineShift = this.baselineShift;
        int iM6415hashCodeimpl = (iHashCode3 + (baselineShift != null ? BaselineShift.m6415hashCodeimpl(baselineShift.m6417unboximpl()) : 0)) * 31;
        TextGeometricTransform textGeometricTransform = this.textGeometricTransform;
        int iHashCode4 = (iM6415hashCodeimpl + (textGeometricTransform != null ? textGeometricTransform.hashCode() : 0)) * 31;
        LocaleList localeList = this.localeList;
        int iHashCode5 = (((iHashCode4 + (localeList != null ? localeList.hashCode() : 0)) * 31) + Color.m4185hashCodeimpl(this.background)) * 31;
        PlatformSpanStyle platformSpanStyle = this.platformStyle;
        return iHashCode5 + (platformSpanStyle != null ? platformSpanStyle.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        sb.append((Object) Color.m4186toStringimpl(m6073getColor0d7_KjU())).append(", brush=").append(getBrush()).append(", alpha=").append(getAlpha()).append(", fontSize=").append((Object) TextUnit.m6838toStringimpl(this.fontSize)).append(", fontWeight=").append(this.fontWeight).append(", fontStyle=").append(this.fontStyle).append(", fontSynthesis=").append(this.fontSynthesis).append(", fontFamily=").append(this.fontFamily).append(", fontFeatureSettings=").append(this.fontFeatureSettings).append(", letterSpacing=").append((Object) TextUnit.m6838toStringimpl(this.letterSpacing)).append(", baselineShift=").append(this.baselineShift).append(", textGeometricTransform=");
        sb.append(this.textGeometricTransform).append(", localeList=").append(this.localeList).append(", background=").append((Object) Color.m4186toStringimpl(this.background)).append(", textDecoration=").append(this.textDecoration).append(", shadow=").append(this.shadow).append(", platformStyle=").append(this.platformStyle).append(", drawStyle=").append(this.drawStyle).append(')');
        return sb.toString();
    }
}
