package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: InputChipTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005#4\u0012\u000e\u0007nj?8LeV3Zݷ2\u000f\u0002{<$a4yCQU\"}(TUɟg}ñzZ9BO\u000b\u001cx̶0Icx.!\u001d3Zom5ޜsCAś\r8\u000b#@&\t\u0011\u0013\u00062*v\u0016υyŏǰ\u000b\u0011ضDxBR\u001bV\u001d\u001c\u0018\rL(Q5jqf6vrԐ9ǂ߃\u0002hŌR/g0\u000bV%HZ2\u001b~259LO5C+ھ\u0002ޗӱZ>ƄCyE\u0005v0?-O\u0001e>)\u000f\"#CO;_ę*b\rĩx\u000e-:]g\u001c\\\u001c8\u0010z*\u001e\u0013ǐ`Ν+H6Ʀju\u0016 Kt!fĖT\bfۍ\u0018|gJ%:P?9O3f\u007fr\u0012ϑ!Ѽ\u007f\u0005\u0015̔s\u0010|8sT<sڠ\u001fZ\u007f\u0383ISFUVcZeK\u0007\u001cp\u0011\u0013\u0001ʽ\u0003Ͻ\u0004/\u0004߾~&3Qs9Q4Ƞ\u0006NLϙ\u000f\u0007f\u0004a~#TN>\u0007\u0016e;_ȸ-ֈh\u0005s¬%g:.e\u001c\u0003\u001aą\f\u0019(ο\u0010>'C\u001ec tw\ne]86\u0006ϐ\n֍rk\u0016ã\nmAUic>t؏z\u001aGֺz\u0007^\bPh\\fjJ:2v{fǵNΌR\f\u001bԵ\u0010\t*WD1GbŢGґەA@Ҵ\rgbh\u001e\bl5*'w,E\u0018\u000futp\u001e\u000e֑M2\u0005ʠ:/GxCAvl0\u0012L|Q\rӡrÒűfKܤPt\u001euc\u00058\u0018 c_7\u000e\"\u001d*A20@։Pxmʸe\u0014-'\u000b\u000f_Jv[\u007f\b\u0019\u0004ݽdpR֢l\u0019(%l\bs\u0017r/\u0012at\u000eĕgZ\u0013ϵVKx3gQ\u001fG\u000b67\u001eS\u0014Ȟ&\u0003=Ԇ[)#H\u0006)\u007f$o\u0011\u0002o\\\rˏ\u0013,|Ё\u001c.iJ}w\"l@pPI\b\u0012й&*t×ZJp.\u0016WYC\u001bj`A\u0013\u0004ެ<S\u0013ɀ\u0016h\rd\u001b\u0006'jHL\b}bAʡ.yK͟,`I_\u001fb$v{)c\\9]؝\u000e\u0011\u0004ς\u0007\u0014\"y.k(q\u0017m\u001esFIװ?h\rµ!&:jJ\u001d[Rb)\u001e\u0010)\u0013ʮc\u0015\u001fϨZuA\u0017\u001ciIkd\n\u001d`ssՃ.\u0007\u0007۰K ~w?\u001a>]br{2/Yñ\bƅ̻N}ݝ)3LTG$@Z\u0007OSe\u0014X\u0010{\u001cGW\u0001Ãs\u0012@\u008e\u0015\u001fH^)N\" m>H^9h͇Rj~ԣ~TTj7\u0014K\f\u001c\u0006\"\u000f9,۽vuj\u03a2dP}\u0002Q/Q&Rt\u001f\f+v̍\u001f3\u000eזE?O7\"<Lna\t\u0016\bN&ۭ\u0003Ȍמ[Vˍj\u0012e\u001bH\u001f\n\u0018hP\u0017\u001b!/\u0012}bt!\u001dڷ\f<W\u05ceK\u0004\u0019/g\u0001H0NxCl4UƑl~\u0012ɨ\u0005et(\u0019\u00187@dM\u0007-~0Է+S6߾p\\@ea5) \u000ei-&MIʭf/\u0018˖{jvB]p]:=CBa_Cݟ\"\u0004'ݗ\u000e\u00060-6*\fe[\u0018|\t\u000b\u007fܣ[\u0014fȥ@fzf7)M\u000eV:)\u0013bYޔ\"j7Ю1!aiUuW\u0013S'>!_e̫\u001f=:У\b*|o\u0011O3\u0004\u000e\nZ\t!\u0013\u05ff03N§U\u001c-:2\u00035\u00124-]8p\u001bЗ\u0015\u0014\u0019ˏr:&!j/lJ_\u0017Y\u0019?\u0014ͤ<\fwޞ17p6a:z\u0010\u000bf%?(Dˬ>y?\u0088;1\u0015V)l7J3\u001d}LU\u001f֮iP\u0007\u07b7{X\u0015J:^\u0006\\,cm@.\u0010ۣ#ڎ֏t\"ǪI9P*meXXyB\u0012.zE|0;G\u001b\fݨ\u000e2qѢ\ffaNBVK#'2V*[\u007fخISpݟ#F\u00134\"L_\u00157#/|>bƣD1Qלe1bNJ(D\u0013H$y6(Z˂]0\u000eЌ*Vi]x\u0003ˬ_\u0019@\u0015\u0013Ƒ &0Z`\u0006\u007f\u009f\u001c\u001b"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006\u0006/;Y\u0007.\u0001Q\u001f9]R\u0019n8)\u0004rg9\u0010q\u0002", "", "u(E", "\u000fuPAT9,V\u0015\nz", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006\u0006/;Y\u0007.\u0001[\u0019*XC!kH\r\u001fnaB\u00159", "5dc\u000ei(MO&l}Z7|", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EH|&\u0017Ts\nCDnDc\u0004 @{_\u001cP?Fk\u001a\u001e)Wk?\u0007l:$", "\u000fuPAT9,W.~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "5dc\u000ei(MO&l~s,Dg\u0003E\u0005w|(", "u(5", "\u0014", "\u0011n]AT0GS&^\u0002^=x\u00183o\t", "5dc\u0010b5MO\u001d\bzk\f\u0004\t@a\u000f,\u0006IHuj't]=^", "\u0011n]AT0GS&azb.\u007f\u0018", "5dc\u0010b5MO\u001d\bzk\u000f|\r1h\u000foZ\u0014`\u001cfHW", "\u0011n]AT0GS&l}Z7|", "5dc\u0010b5MO\u001d\bzk\u001a\u007f\u0005:e", "\u0012hb.U3>Rt\u0010vm(\nr:a},\u000bT", "", "\u0012hb.U3>R\u007fzw^3k\tBt]2\u0003J\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006\u0006/;Y\u0007.\u0001K 5WP)i7\u001e\u001dhG9\u001bR6Tv0U\"", "5dc\u0011\\::P ~yE(y\t6T\u007f;\u000b\u001e\u000b\u001e!T", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EH|&\u0017Ts\nCDnDc\u0004 @{_\fWJEx\"\u001c\u0018hi9lc@=\u0001-GU\\\u0002", "\u0012hb.U3>R\u007fzw^3k\tBti3w>\u0005&+", "\u0012hb.U3>R\u007f~v]0\u0006\u000b\u0013c\n1YJ\b!$", "5dc\u0011\\::P ~yE,x\b3n\u0002\fyJ\nt!Ny\u001b", "\u0012hb.U3>R\u007f~v]0\u0006\u000b\u0013c\n1eK|\u0015\u001bV\u0004", "\u0012hb.U3>R\u0007~\u0002^*\f\t.C\n1\u000b<\u0005 \u0017TM\u0018C\u00012", "5dc\u0011\\::P ~yL,\u0004\t-t\u007f'YJ\n&\u0013Kx\u000eIT/<c\u000b", "\u0012hb.U3>R\u0007~\u0002^*\f\t.C\n1\u000b<\u0005 \u0017TY\u00198t)Dm", "\u0012hb.U3>R\b\fvb3\u0001\u00121I}2\u0005\u001e\u000b\u001e!T", "5dc\u0011\\::P ~yM9x\r6i\t*_>\u000b tQv\u0018I", "\u0012hb.U3>R\b\fvb3\u0001\u00121I}2\u0005*\f\u0013\u0015K~\"", "\u0012hb.U3>R\t\b\t^3|\u0007>e~\u0012\fO\b\u001b GM\u0018C\u00012", "5dc\u0011\\::P ~yN5\u000b\t6e}7{?j'&Ns\u0017<T/<c\u000b", "\u0012hb.U3>R\t\b\t^3|\u0007>e~\u0012\fO\b\u001b GY\u00198t)Dm", "\u0012qP4Z,=1#\b\nZ0\u0006\t<E\u0007(\r<\u0010\u001b!P", "5dc\u0011e(@U\u0019}Xh5\f\u00053n\u007f5[G\u0001(\u0013Vs\u0018E>\u0004\t9\u0003o8U", "\u001a`Q2_\u001b>f(_\u0005g;", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006\u0006/;Y\u0007.\u0001\\*9WEHg?!)NaMum2N\u007f5\u001d", "5dc\u0019T)>Z\b~\u000em\r\u0007\u0012>", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EH|&\u0017Ts\nCDnDc\u0004 @{_\u001daNEmA\u001a ku\u001f\u0007w\u001bX|'PZ$", "\u001adP1\\5@7\u0017\t\u0004L0\u0012\t", "5dc\u0019X(=W\"\u0001^\\6\u0006v3z\u007foZ\u0014`\u001cfHW", "!d[2V;>Rv\t\u0004m(\u0001\u0012/r]2\u0003J\u000e", "5dc X3>Q(~y<6\u0006\u0018+i\t(\t\u001e\u000b\u001e!T", "!d[2V;>Rw\fv`.|\b\u0016a|(\u0003/\u0001*&%y\u0015F\u0004", "5dc X3>Q(~y=9x\u000b1e~\u000fw=\u0001\u001e\u0006G\u0003\u001d\u001a\u0001,?f", "!d[2V;>Rw\fv`.|\b\u0016e{'\u007fI\u0003z\u0015QxkF}/B", "5dc X3>Q(~y=9x\u000b1e~\u000f{<\u007f\u001b IS\fF\u007f\u0003?`\b-", "!d[2V;>Rw\fv`.|\b\u001er{,\u0003D\n\u0019zEy\u0017\u001a\u0001,?f", "5dc X3>Q(~y=9x\u000b1e~\u0017\t<\u0005\u001e\u001bPqq:\u0001.\u0013c\u0005*D", "!d[2V;>Ry\txn:c\u0005,e\u0007\u0017{S\u0010t!Ny\u001b", "5dc X3>Q(~y?6z\u0019=L{%{Go\u0017*VM\u0018C\u00012", "!d[2V;>Ry\txn:c\t+d\u00041}$~! %y\u0015F\u0004", "5dc X3>Q(~y?6z\u0019=L\u007f$zD\n\u0019zEy\u0017\u001a\u0001,?f", "!d[2V;>Ry\txn:k\u0016+i\u0007,\u0005Bd\u0015!PM\u0018C\u00012", "5dc X3>Q(~y?6z\u0019=T\r$\u007fG\u0005 \u0019+m\u0018ET/<c\u000b", "!d[2V;>R{\t\f^9c\u0005,e\u0007\u0017{S\u0010t!Ny\u001b", "5dc X3>Q(~yA6\u000e\t<L{%{Go\u0017*VM\u0018C\u00012", "!d[2V;>R{\t\f^9c\t+d\u00041}$~! %y\u0015F\u0004", "5dc X3>Q(~yA6\u000e\t<L\u007f$zD\n\u0019zEy\u0017\u001a\u0001,?f", "!d[2V;>R{\t\f^9k\u0016+i\u0007,\u0005Bd\u0015!PM\u0018C\u00012", "5dc X3>Q(~yA6\u000e\t<T\r$\u007fG\u0005 \u0019+m\u0018ET/<c\u000b", "!d[2V;>R\u007fzw^3k\tBt]2\u0003J\u000e", "5dc X3>Q(~yE(y\t6T\u007f;\u000b\u001e\u000b\u001e!T", "!d[2V;>R\u007f~v]0\u0006\u000b\u0013c\n1YJ\b!$", "5dc X3>Q(~yE,x\b3n\u0002\fyJ\nt!Ny\u001b", "!d[2V;>R\u0003\u000f\ne0\u0006\t!i~7~", "5dc X3>Q(~yH<\f\u00103n\u007f\u001a\u007f?\u0010\u001a^&CmAF&\u001d", "!d[2V;>R\u0004\fzl:|\b\u0016a|(\u0003/\u0001*&%y\u0015F\u0004", "5dc X3>Q(~yI9|\u0017=e~\u000fw=\u0001\u001e\u0006G\u0003\u001d\u001a\u0001,?f", "!d[2V;>R\u0004\fzl:|\b\u0016e{'\u007fI\u0003z\u0015QxkF}/B", "5dc X3>Q(~yI9|\u0017=e~\u000f{<\u007f\u001b IS\fF\u007f\u0003?`\b-", "!d[2V;>R\u0004\fzl:|\b\u001er{,\u0003D\n\u0019zEy\u0017\u001a\u0001,?f", "5dc X3>Q(~yI9|\u0017=e~\u0017\t<\u0005\u001e\u001bPqq:\u0001.\u0013c\u0005*D", "!d[2V;>R\b\fvb3\u0001\u00121I}2\u0005\u001e\u000b\u001e!T", "5dc X3>Q(~yM9x\r6i\t*_>\u000b tQv\u0018I", "\"qP6_0GU||\u0005g\u001a\u0001\u001e/", "5dc!e(BZ\u001d\b|B*\u0007\u0012\u001di\u0015(C\u001fTv\u001c\u0017pu", "#mb2_,<b\u0019}Yk(~\u000b/df$x@\b\u0006\u0017Z~kF}/B", "5dc\"a:>Z\u0019|\n^+[\u0016+g\u0002(z'|\u0014\u0017N^\u000eO\u0006\u0003?`\b-", "#mb2_,<b\u0019}Yk(~\u000b/df(w?\u0005 \u0019+m\u0018ET/<c\u000b", "5dc\"a:>Z\u0019|\n^+[\u0016+g\u0002(z'\u0001\u0013\u0016Kx\u0010 t/>7\b'Az", "#mb2_,<b\u0019}Yk(~\u000b/dn5wD\b\u001b IS\fF\u007f\u0003?`\b-", "5dc\"a:>Z\u0019|\n^+[\u0016+g\u0002(z/\u000e\u0013\u001bNs\u0017>Z#?b[*>w#", "#mb2_,<b\u0019}[h*\r\u0017\u0016a|(\u0003/\u0001*&%y\u0015F\u0004", "5dc\"a:>Z\u0019|\n^+]\u0013-u\u000e\u000fw=\u0001\u001e\u0006G\u0003\u001d\u001a\u0001,?f", "#mb2_,<b\u0019}[h*\r\u0017\u0016e{'\u007fI\u0003z\u0015QxkF}/B", "5dc\"a:>Z\u0019|\n^+]\u0013-u\u000e\u000f{<\u007f\u001b IS\fF\u007f\u0003?`\b-", "#mb2_,<b\u0019}[h*\r\u0017\u0019u\u000f/\u007fI\u0001t!Ny\u001b", "5dc\"a:>Z\u0019|\n^+]\u0013-u\u000e\u0012\fO\b\u001b GM\u0018C\u00012", "#mb2_,<b\u0019}[h*\r\u0017\u001er{,\u0003D\n\u0019zEy\u0017\u001a\u0001,?f", "5dc\"a:>Z\u0019|\n^+]\u0013-u\u000e\u0017\t<\u0005\u001e\u001bPqq:\u0001.\u0013c\u0005*D", "#mb2_,<b\u0019}]h=|\u0016\u0016a|(\u0003/\u0001*&%y\u0015F\u0004", "5dc\"a:>Z\u0019|\n^+_\u0013@e\r\u000fw=\u0001\u001e\u0006G\u0003\u001d\u001a\u0001,?f", "#mb2_,<b\u0019}]h=|\u0016\u0016e{'\u007fI\u0003z\u0015QxkF}/B", "5dc\"a:>Z\u0019|\n^+_\u0013@e\r\u000f{<\u007f\u001b IS\fF\u007f\u0003?`\b-", "#mb2_,<b\u0019}]h=|\u0016\u001er{,\u0003D\n\u0019zEy\u0017\u001a\u0001,?f", "5dc\"a:>Z\u0019|\n^+_\u0013@e\r\u0017\t<\u0005\u001e\u001bPqq:\u0001.\u0013c\u0005*D", "#mb2_,<b\u0019}aZ)|\u0010\u001ee\u00137YJ\b!$", "5dc\"a:>Z\u0019|\n^+c\u0005,e\u0007\u0017{S\u0010t!Ny\u001b", "#mb2_,<b\u0019}a^({\r8gc&\u0006I^!\u001eQ|", "5dc\"a:>Z\u0019|\n^+c\t+d\u00041}$~! %y\u0015F\u0004", "#mb2_,<b\u0019}dn;\u0004\r8e]2\u0003J\u000e", "5dc\"a:>Z\u0019|\n^+f\u0019>l\u00041{\u001e\u000b\u001e!T", "#mb2_,<b\u0019}dn;\u0004\r8eq,zO\u0004", "5dc\"a:>Z\u0019|\n^+f\u0019>l\u00041{2\u0005\u0016&J7l\u0010V*\u0005Ze", "#mb2_,<b\u0019}ek,\u000b\u0017/df$x@\b\u0006\u0017Z~kF}/B", "5dc\"a:>Z\u0019|\n^+g\u0016/s\u000e(z'|\u0014\u0017N^\u000eO\u0006\u0003?`\b-", "#mb2_,<b\u0019}ek,\u000b\u0017/df(w?\u0005 \u0019+m\u0018ET/<c\u000b", "5dc\"a:>Z\u0019|\n^+g\u0016/s\u000e(z'\u0001\u0013\u0016Kx\u0010 t/>7\b'Az", "#mb2_,<b\u0019}ek,\u000b\u0017/dn5wD\b\u001b IS\fF\u007f\u0003?`\b-", "5dc\"a:>Z\u0019|\n^+g\u0016/s\u000e(z/\u000e\u0013\u001bNs\u0017>Z#?b[*>w#", "#mb2_,<b\u0019}ik(\u0001\u00103n\u0002\fyJ\nt!Ny\u001b", "5dc\"a:>Z\u0019|\n^+k\u0016+i\u0007,\u0005Bd\u0015!PM\u0018C\u00012", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class InputChipTokens {
    public static final int $stable = 0;
    public static final float DisabledAvatarOpacity = 0.38f;
    public static final float DisabledLabelTextOpacity = 0.38f;
    public static final float DisabledLeadingIconOpacity = 0.38f;
    public static final float DisabledSelectedContainerOpacity = 0.12f;
    public static final float DisabledTrailingIconOpacity = 0.38f;
    public static final float DisabledUnselectedOutlineOpacity = 0.12f;
    private static final float LeadingIconSize;
    private static final float TrailingIconSize;
    public static final InputChipTokens INSTANCE = new InputChipTokens();
    private static final float ContainerElevation = ElevationTokens.INSTANCE.m3191getLevel0D9Ej5fM();
    private static final float ContainerHeight = Dp.m6638constructorimpl((float) 32.0d);
    private static final ShapeKeyTokens ContainerShape = ShapeKeyTokens.CornerSmall;
    private static final ColorSchemeKeyTokens DisabledLabelTextColor = ColorSchemeKeyTokens.OnSurface;
    private static final ColorSchemeKeyTokens DisabledSelectedContainerColor = ColorSchemeKeyTokens.OnSurface;
    private static final ColorSchemeKeyTokens DisabledUnselectedOutlineColor = ColorSchemeKeyTokens.OnSurface;
    private static final float DraggedContainerElevation = ElevationTokens.INSTANCE.m3195getLevel4D9Ej5fM();
    private static final TypographyKeyTokens LabelTextFont = TypographyKeyTokens.LabelLarge;
    private static final ColorSchemeKeyTokens SelectedContainerColor = ColorSchemeKeyTokens.SecondaryContainer;
    private static final ColorSchemeKeyTokens SelectedDraggedLabelTextColor = ColorSchemeKeyTokens.OnSecondaryContainer;
    private static final ColorSchemeKeyTokens SelectedFocusLabelTextColor = ColorSchemeKeyTokens.OnSecondaryContainer;
    private static final ColorSchemeKeyTokens SelectedHoverLabelTextColor = ColorSchemeKeyTokens.OnSecondaryContainer;
    private static final ColorSchemeKeyTokens SelectedLabelTextColor = ColorSchemeKeyTokens.OnSecondaryContainer;
    private static final float SelectedOutlineWidth = Dp.m6638constructorimpl((float) 0.0d);
    private static final ColorSchemeKeyTokens SelectedPressedLabelTextColor = ColorSchemeKeyTokens.OnSecondaryContainer;
    private static final ColorSchemeKeyTokens UnselectedDraggedLabelTextColor = ColorSchemeKeyTokens.OnSurfaceVariant;
    private static final ColorSchemeKeyTokens UnselectedFocusLabelTextColor = ColorSchemeKeyTokens.OnSurfaceVariant;
    private static final ColorSchemeKeyTokens UnselectedFocusOutlineColor = ColorSchemeKeyTokens.OnSurfaceVariant;
    private static final ColorSchemeKeyTokens UnselectedHoverLabelTextColor = ColorSchemeKeyTokens.OnSurfaceVariant;
    private static final ColorSchemeKeyTokens UnselectedLabelTextColor = ColorSchemeKeyTokens.OnSurfaceVariant;
    private static final ColorSchemeKeyTokens UnselectedOutlineColor = ColorSchemeKeyTokens.Outline;
    private static final float UnselectedOutlineWidth = Dp.m6638constructorimpl((float) 1.0d);
    private static final ColorSchemeKeyTokens UnselectedPressedLabelTextColor = ColorSchemeKeyTokens.OnSurfaceVariant;
    private static final ShapeKeyTokens AvatarShape = ShapeKeyTokens.CornerFull;
    private static final float AvatarSize = Dp.m6638constructorimpl((float) 24.0d);
    private static final ColorSchemeKeyTokens DisabledLeadingIconColor = ColorSchemeKeyTokens.OnSurface;
    private static final ColorSchemeKeyTokens SelectedDraggedLeadingIconColor = ColorSchemeKeyTokens.OnSecondaryContainer;
    private static final ColorSchemeKeyTokens SelectedFocusLeadingIconColor = ColorSchemeKeyTokens.OnSecondaryContainer;
    private static final ColorSchemeKeyTokens SelectedHoverLeadingIconColor = ColorSchemeKeyTokens.OnSecondaryContainer;
    private static final ColorSchemeKeyTokens SelectedLeadingIconColor = ColorSchemeKeyTokens.OnSecondaryContainer;
    private static final ColorSchemeKeyTokens SelectedPressedLeadingIconColor = ColorSchemeKeyTokens.OnSecondaryContainer;
    private static final ColorSchemeKeyTokens UnselectedDraggedLeadingIconColor = ColorSchemeKeyTokens.OnSurfaceVariant;
    private static final ColorSchemeKeyTokens UnselectedFocusLeadingIconColor = ColorSchemeKeyTokens.OnSurfaceVariant;
    private static final ColorSchemeKeyTokens UnselectedHoverLeadingIconColor = ColorSchemeKeyTokens.OnSurfaceVariant;
    private static final ColorSchemeKeyTokens UnselectedLeadingIconColor = ColorSchemeKeyTokens.OnSurfaceVariant;
    private static final ColorSchemeKeyTokens UnselectedPressedLeadingIconColor = ColorSchemeKeyTokens.OnSurfaceVariant;
    private static final ColorSchemeKeyTokens DisabledTrailingIconColor = ColorSchemeKeyTokens.OnSurface;
    private static final ColorSchemeKeyTokens SelectedDraggedTrailingIconColor = ColorSchemeKeyTokens.OnSecondaryContainer;
    private static final ColorSchemeKeyTokens SelectedFocusTrailingIconColor = ColorSchemeKeyTokens.OnSecondaryContainer;
    private static final ColorSchemeKeyTokens SelectedHoverTrailingIconColor = ColorSchemeKeyTokens.OnSecondaryContainer;
    private static final ColorSchemeKeyTokens SelectedPressedTrailingIconColor = ColorSchemeKeyTokens.OnSecondaryContainer;
    private static final ColorSchemeKeyTokens SelectedTrailingIconColor = ColorSchemeKeyTokens.OnSecondaryContainer;
    private static final ColorSchemeKeyTokens UnselectedDraggedTrailingIconColor = ColorSchemeKeyTokens.OnSurfaceVariant;
    private static final ColorSchemeKeyTokens UnselectedFocusTrailingIconColor = ColorSchemeKeyTokens.OnSurfaceVariant;
    private static final ColorSchemeKeyTokens UnselectedHoverTrailingIconColor = ColorSchemeKeyTokens.OnSurfaceVariant;
    private static final ColorSchemeKeyTokens UnselectedPressedTrailingIconColor = ColorSchemeKeyTokens.OnSurfaceVariant;
    private static final ColorSchemeKeyTokens UnselectedTrailingIconColor = ColorSchemeKeyTokens.OnSurfaceVariant;

    private InputChipTokens() {
    }

    static {
        float f2 = (float) 18.0d;
        LeadingIconSize = Dp.m6638constructorimpl(f2);
        TrailingIconSize = Dp.m6638constructorimpl(f2);
    }

    /* JADX INFO: renamed from: getContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3311getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    /* JADX INFO: renamed from: getContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m3312getContainerHeightD9Ej5fM() {
        return ContainerHeight;
    }

    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    public final ColorSchemeKeyTokens getDisabledLabelTextColor() {
        return DisabledLabelTextColor;
    }

    public final ColorSchemeKeyTokens getDisabledSelectedContainerColor() {
        return DisabledSelectedContainerColor;
    }

    public final ColorSchemeKeyTokens getDisabledUnselectedOutlineColor() {
        return DisabledUnselectedOutlineColor;
    }

    /* JADX INFO: renamed from: getDraggedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3313getDraggedContainerElevationD9Ej5fM() {
        return DraggedContainerElevation;
    }

    public final TypographyKeyTokens getLabelTextFont() {
        return LabelTextFont;
    }

    public final ColorSchemeKeyTokens getSelectedContainerColor() {
        return SelectedContainerColor;
    }

    public final ColorSchemeKeyTokens getSelectedDraggedLabelTextColor() {
        return SelectedDraggedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getSelectedFocusLabelTextColor() {
        return SelectedFocusLabelTextColor;
    }

    public final ColorSchemeKeyTokens getSelectedHoverLabelTextColor() {
        return SelectedHoverLabelTextColor;
    }

    public final ColorSchemeKeyTokens getSelectedLabelTextColor() {
        return SelectedLabelTextColor;
    }

    /* JADX INFO: renamed from: getSelectedOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m3315getSelectedOutlineWidthD9Ej5fM() {
        return SelectedOutlineWidth;
    }

    public final ColorSchemeKeyTokens getSelectedPressedLabelTextColor() {
        return SelectedPressedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getUnselectedDraggedLabelTextColor() {
        return UnselectedDraggedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getUnselectedFocusLabelTextColor() {
        return UnselectedFocusLabelTextColor;
    }

    public final ColorSchemeKeyTokens getUnselectedFocusOutlineColor() {
        return UnselectedFocusOutlineColor;
    }

    public final ColorSchemeKeyTokens getUnselectedHoverLabelTextColor() {
        return UnselectedHoverLabelTextColor;
    }

    public final ColorSchemeKeyTokens getUnselectedLabelTextColor() {
        return UnselectedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getUnselectedOutlineColor() {
        return UnselectedOutlineColor;
    }

    /* JADX INFO: renamed from: getUnselectedOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m3317getUnselectedOutlineWidthD9Ej5fM() {
        return UnselectedOutlineWidth;
    }

    public final ColorSchemeKeyTokens getUnselectedPressedLabelTextColor() {
        return UnselectedPressedLabelTextColor;
    }

    public final ShapeKeyTokens getAvatarShape() {
        return AvatarShape;
    }

    /* JADX INFO: renamed from: getAvatarSize-D9Ej5fM, reason: not valid java name */
    public final float m3310getAvatarSizeD9Ej5fM() {
        return AvatarSize;
    }

    public final ColorSchemeKeyTokens getDisabledLeadingIconColor() {
        return DisabledLeadingIconColor;
    }

    /* JADX INFO: renamed from: getLeadingIconSize-D9Ej5fM, reason: not valid java name */
    public final float m3314getLeadingIconSizeD9Ej5fM() {
        return LeadingIconSize;
    }

    public final ColorSchemeKeyTokens getSelectedDraggedLeadingIconColor() {
        return SelectedDraggedLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getSelectedFocusLeadingIconColor() {
        return SelectedFocusLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getSelectedHoverLeadingIconColor() {
        return SelectedHoverLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getSelectedLeadingIconColor() {
        return SelectedLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getSelectedPressedLeadingIconColor() {
        return SelectedPressedLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getUnselectedDraggedLeadingIconColor() {
        return UnselectedDraggedLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getUnselectedFocusLeadingIconColor() {
        return UnselectedFocusLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getUnselectedHoverLeadingIconColor() {
        return UnselectedHoverLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getUnselectedLeadingIconColor() {
        return UnselectedLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getUnselectedPressedLeadingIconColor() {
        return UnselectedPressedLeadingIconColor;
    }

    public final ColorSchemeKeyTokens getDisabledTrailingIconColor() {
        return DisabledTrailingIconColor;
    }

    public final ColorSchemeKeyTokens getSelectedDraggedTrailingIconColor() {
        return SelectedDraggedTrailingIconColor;
    }

    public final ColorSchemeKeyTokens getSelectedFocusTrailingIconColor() {
        return SelectedFocusTrailingIconColor;
    }

    public final ColorSchemeKeyTokens getSelectedHoverTrailingIconColor() {
        return SelectedHoverTrailingIconColor;
    }

    public final ColorSchemeKeyTokens getSelectedPressedTrailingIconColor() {
        return SelectedPressedTrailingIconColor;
    }

    public final ColorSchemeKeyTokens getSelectedTrailingIconColor() {
        return SelectedTrailingIconColor;
    }

    /* JADX INFO: renamed from: getTrailingIconSize-D9Ej5fM, reason: not valid java name */
    public final float m3316getTrailingIconSizeD9Ej5fM() {
        return TrailingIconSize;
    }

    public final ColorSchemeKeyTokens getUnselectedDraggedTrailingIconColor() {
        return UnselectedDraggedTrailingIconColor;
    }

    public final ColorSchemeKeyTokens getUnselectedFocusTrailingIconColor() {
        return UnselectedFocusTrailingIconColor;
    }

    public final ColorSchemeKeyTokens getUnselectedHoverTrailingIconColor() {
        return UnselectedHoverTrailingIconColor;
    }

    public final ColorSchemeKeyTokens getUnselectedPressedTrailingIconColor() {
        return UnselectedPressedTrailingIconColor;
    }

    public final ColorSchemeKeyTokens getUnselectedTrailingIconColor() {
        return UnselectedTrailingIconColor;
    }
}
