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
/* JADX INFO: compiled from: FilterChipTokens.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005$4\u0012\u000e\u0007nj?1Le^.ZS0\u0010s{B)c$w\u0004CU0}*\tU\fm̨n`ҙ;C=\u0005V}p,֒Yxk\u0012_IPpW3{q\u00818śԓ5\u0004ڶ6*@y\u0013\u00062,N\u0013\u0005~\u0014Z\u001a\u0018H@\u001fAň\u0011S\r܅*\bD(\u000f'-v\\@`l\fEǥ'\tqĩf)e<\u000bZ]Xb5%v\u0010-\u0002¯y߱\u0019+[Έ\u001fTaO\u0011CBL\u0013y?'YTָ[<`Ü,\u00171a\u001bjC8j\u0018i`:6\u0002ՙ&ׂT\u00140»\u0013}\u0013P\u0012\u0012V6VCE\u001a\u0015\u0013ԧ7zzԟXR\btP\rKsD.=\u007fa:\u0010Ӝ)ЂeA!\u05cbO}\u000b%,'Q\u0006/tl\u000e\u000f\u0017ŊSȭϼ0P͘APV\ngB\u0006\u0006v|\u0010.TGU\u001bG{?0ш$ڛڼ8\"\u074co\nPDu{\u001dbnowV\u0019O0\f.7X\u0014ɔ^Jlʍ\u0004RZv:\u001e\u001e3b&\u0016\bA\"иv˓Ȓ$\u000fʽSpqj[b\"'5\u0007E]?}\u001cxQ^aD(ҶRуV|\u001c̳Td\u000bztF$#h\u007f@\"`Jғ\u000fǮմCMܟ\u0017:Gq*9D3\u001f\u0001#LS5Pf\u0015\t\u000e\\Չ\u000fз֗2#ғm,|\t\u000fUtru\u000e\u0007M|\u0014nIEA\u007f7ՠ%Şʡg3č'\u000f\u0007s\u000eL\u007fNMtz\u001aFd\nI.\u001ag\\ȠA\u0019\u0017ȯA4\bWSYCt_x*')\bɍ\u0013Ap֫\u007f\np\u001d:m;a]\u0002/\"%`ҩ\"Ψݦ~xӶJ\u0003Ocb\u0010s@O!\u0011]\r]F,\u001d\u001fL0˽s(\u0005ކEE-M$\u0005dA#\u0013ui\u001e=PʳQ֑xk\fϺ{\u0018u\u0015_a\u0003JF|q~l-ٝp\tJו\u0003y\u000ev\u0017A]EVv|p\u0005G$ߙq̱j\r4ݸ\tXap!sNC<\u0017Bsq\tљbI-ݎeUm&{X-\"XH\"\u000b*3£\u0011Β\u07b4\u001fU͓f\u00118\u0006\u0002\u001dNCA\u001d\u0013@Y;BgT\b9EԆhвڄy~ʮc\u0017\u001f2PxSX\u0014\u0011\u0007`'_\u0013\u001e]`O,ݹ}۰˵\u001dw\u00985\ruFb4{4\u0007\u0012+\rk\u0002]>~%YFɭ8ЉвW\u007fխIeKI\u0010;\u001cI/.ys\\O&>5BF\u001d˼PΙۜu/Ϳ\u000f]lNr{*hX\u00110-O\n\u000bQT\n=\u0016ĢSxwۮENT<EPj\u0018%\nA\u0007:~ߦEɑԇ\u00054ϦAQr\u00145\u0001oUAD\u0016$p6\u0012<9\\\u0006\u0019ҁ\u000ec#ŭ.s\u001c+\u0010\u0016cg.MFJ#t͏-ú̿N\u0001ג\u0006\u001bfYy|9B-uz\n\u0013bvD\"c\u001beÓT̃Կe0ٟ}v5P+\u000e?O4_f^\u000b amp\u0011.\u001fޞ*%>ʊz+\u0016\u001equA\u0003]+%+]m̈́`ɵŁQ\u001dݼ#\u0002}\u00048Y@\u0017A'[B5\u0018j>ZW<1Ɉ,j|׃A\u0016\u0003RV3a\"B\u001c\u000b\u001e\u0013:ё\u001d%cƬ_b\rZSVv0?*W\u001be=цs.~֫\u001b<hM\u000e7\u0013\u0018\u0001Y\u007f,[QÊA /ڒ<oj]4X\u0016GPcD\u0011<\u001c˲^>(ڨt\u001c\"\u0018_@\u0012(\u001f^-84z߁\u001d;r\u070ek'0_\u000b\u000e]N\b\u0011\u0004:\"B«'5\u0017͵3Yl\u001c3B6[5m\u001aex\nߚg\\\u0017ʨDK;(,\u0007&O\u000em7$R\u0011Ñ'\u0006Mʹ`,eANcDf\u0012\fB6\u001dOďKr\u0001݅\".o~\u0002q,pB)\u0013\u0014GOĎ.3t؋]Onb\u0019Q]T\"!'\u0006W>ٽ\u0001\u0016WƀX-O][<-lJ~\f\u0004h=ݦ:\u007fOʟq,\f\u001a a4yx[i_>Cݙ\u0011\u0013\f֓ITfnn*h6Yf^6\u000b\u0004³Eh\u0013ٺ'&d\u001fP\u0019[\u0015$ `\u00170\tߢd\u001b\u001bФ_uG: cL0+\u0005s%40ڃnMGޟ\nZC.A\u0018>Yf+}\\3`٠Oj3ۢ\u0018l1%Uc\u000f)8P\u001e\u000esoэ\u0014J\u0001ؤ@o6)>]OiQW\u0019\u001cMH֘\u0019k\u0007Ʈz9a_\u001f8\bf|Nm#[\u0004߲\u0007\u0016IÈ+\r$PG?s\u0004\u001b/V{6gƖY\u0004u۞(\u0006gį =\u0013\u0010@Oٝknem$ٮC\u0006\u0014Ԍ?'\f٣#ptcz\u001c݅^\u001bLda˚LRa˴~Epقy\u0003\u0019~\u001dF˗\u0005U\u0006?mɲ9BgގD1vīF]wL;sݝe\rY{Pαy FѸ\n\u0014iٝ^\"{\"mfƍ\u0016o&n\u001e̎\u001e$.ȿ\u0014K/ܱ\u0016cp>{\u0002؏_)Ybvơh\u0001zڐ|Aiޤ;Vyiw]ʕ\u001aiD\u0011\u0014ɅtOIŖzo2Ⱦ5Vwi\u0012\u000fɨ`/\u0014eOՇ'n;\u05fb:d(˽\\3T\u001b\u0017\u001cà`\u0010\u0015*hֈ:\u0014wێ\u0015\u0018\u000bÒe\u0001\u0011Ȣ\u0005V8\u0007qΗNtYH\u001c3yÑqȭ\u0007"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006\u0006/;Y\u0007.\u0001N\u001a5\\CHI7\" Wk?\u0007l:$", "", "u(E", "\u0011n]AT0GS&azb.\u007f\u0018", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "5dc\u0010b5MO\u001d\bzk\u000f|\r1h\u000foZ\u0014`\u001cfHW", "u(5", "\u0014", "\u0011n]AT0GS&l}Z7|", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006\u0006/;Y\u0007.\u0001[\u0019*XC!kH\r\u001fnaB\u00159", "5dc\u0010b5MO\u001d\bzk\u001a\u007f\u0005:e", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EH|&\u0017Ts\nCDnDc\u0004 @{_\u001cP?Fk\u001a\u001e)Wk?\u0007l:$", "\u0012hb.U3>R\u007fzw^3k\tBt]2\u0003J\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006\u0006/;Y\u0007.\u0001K 5WP)i7\u001e\u001dhG9\u001bR6Tv0U\"", "5dc\u0011\\::P ~yE(y\t6T\u007f;\u000b\u001e\u000b\u001e!T", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EH|&\u0017Ts\nCDnDc\u0004 @{_\fWJEx\"\u001c\u0018hi9lc@=\u0001-GU\\\u0002", "\u0012hb.U3>R\u007fzw^3k\tBti3w>\u0005&+", "", "5dc\u0011\\::P ~yE(y\t6T\u007f;\u000b*\f\u0013\u0015K~\"", "\u0012hb.U3>R\u007f~v]0\u0006\u000b\u0013c\n1YJ\b!$", "5dc\u0011\\::P ~yE,x\b3n\u0002\fyJ\nt!Ny\u001b", "\u0012hb.U3>R\u007f~v]0\u0006\u000b\u0013c\n1eK|\u0015\u001bV\u0004", "5dc\u0011\\::P ~yE,x\b3n\u0002\fyJ\n\u0001\"Cm\u0012K\u000b", "\u0012hb.U3>R\b\fvb3\u0001\u00121I}2\u0005\u001e\u000b\u001e!T", "5dc\u0011\\::P ~yM9x\r6i\t*_>\u000b tQv\u0018I", "\u0012hb.U3>R\b\fvb3\u0001\u00121I}2\u0005*\f\u0013\u0015K~\"", "5dc\u0011\\::P ~yM9x\r6i\t*_>\u000b \u0001Rk\f@\u00069", "\u0012qP4Z,=1#\b\nZ0\u0006\t<E\u0007(\r<\u0010\u001b!P", "5dc\u0011e(@U\u0019}Xh5\f\u00053n\u007f5[G\u0001(\u0013Vs\u0018E>\u0004\t9\u0003o8U", "\u0013kTCT;>Rv\t\u0004m(\u0001\u0012/r_/{Q|&\u001bQx", "5dc\u0012_,OO(~y<6\u0006\u0018+i\t(\t \b\u0017(C~\u0012F\u007fl\u0014-]%\u0007n}", "\u0013kTCT;>Rw\u0003\tZ)\u0004\t.C\n1\u000b<\u0005 \u0017TM\u0018C\u00012", "5dc\u0012_,OO(~y=0\u000b\u0005,l\u007f'YJ\n&\u0013Kx\u000eIT/<c\u000b", "\u0013kTCT;>Rw\u0003\tZ)\u0004\t.C\n1\u000b<\u0005 \u0017TO\u0015<\b!D]\b)", "5dc\u0012_,OO(~y=0\u000b\u0005,l\u007f'YJ\n&\u0013Kx\u000eIV,5jy/;w\u001fu,\u0017\u001bp\u0004\u001f|", "\u0013kTCT;>Rw\u0003\tZ)\u0004\t.C\n1\u000b<\u0005 \u0017TY\u00198t)Dm", "5dc\u0012_,OO(~y=0\u000b\u0005,l\u007f'YJ\n&\u0013Kx\u000eI`01W\u0002/K", "\u0013kTCT;>Ry\txn:Z\u00138t{,\u0005@\u000ev\u001eG\u0001\nKz/>", "5dc\u0012_,OO(~y?6z\u0019=C\n1\u000b<\u0005 \u0017TO\u0015<\b!D]\b)~Li\u000eR\u0013<S", "\u0013kTCT;>R{\t\f^9Z\u00138t{,\u0005@\u000ev\u001eG\u0001\nKz/>", "5dc\u0012_,OO(~yA6\u000e\t<C\n1\u000b<\u0005 \u0017TO\u0015<\b!D]\b)~Li\u000eR\u0013<S", "\u0013kTCT;>R\u0004\fzl:|\b\ro\t7wD\n\u0017$'v\u000eMr49c\u0007", "5dc\u0012_,OO(~yI9|\u0017=e~\u0006\u0006I\u0010\u0013\u001bPo\u001b\u001c}%FU\r$Av]\r!#@;5\u0006", "\u0013kTCT;>R\u0007~\u0002^*\f\t.C\n1\u000b<\u0005 \u0017TM\u0018C\u00012", "5dc\u0012_,OO(~yL,\u0004\t-t\u007f'YJ\n&\u0013Kx\u000eIT/<c\u000b", "\u0013kTCT;>R\t\b\t^3|\u0007>e~\u0006\u0006I\u0010\u0013\u001bPo\u001b\u001a\u0001,?f", "5dc\u0012_,OO(~yN5\u000b\t6e}7{?^! Vk\u0012Ev2\u0013c\u0005*D", "\u0014kPA66Gb\u0015\u0003\u0004^9\\\u0010/v{7\u007fJ\n", "5dc\u0013_(M1#\b\nZ0\u0006\t<E\u0007(\r<\u0010\u001b!P7l\u0010V*\u0005Ze", "\u0014kPA70LO\u0016\u0006z]\u001a|\u0010/c\u000f(z\u001e\u000b &Cs\u0017<\u0004\u0003?`\b-", "5dc\u0013_(M2\u001d\rv[3|\b\u001de\u0007(yO\u0001\u0016tQx\u001d8z.5f[*>w#", "\u0014kPA70LO\u0016\u0006z]\u001a|\u0010/c\u000f(z\u001e\u000b &Cs\u0017<\u0004\u000f@U{$F\u0002", "5dc\u0013_(M2\u001d\rv[3|\b\u001de\u0007(yO\u0001\u0016tQx\u001d8z.5fg+3k\u001a=a", "\u0014kPA70LO\u0016\u0006z]\u001c\u0006\u0017/l\u007f&\u000b@\u007f\u0001'Vv\u0012Ev\u0003?`\b-", "5dc\u0013_(M2\u001d\rv[3|\b\u001fn\u000e(\u0003@~&\u0017FY\u001eK})>Y[*>w#", "\u0014kPA70LO\u0016\u0006z]\u001c\u0006\u0017/l\u007f&\u000b@\u007f\u0001'Vv\u0012Ev\u000f@U{$F\u0002", "5dc\u0013_(M2\u001d\rv[3|\b\u001fn\u000e(\u0003@~&\u0017FY\u001eK})>Yg+3k\u001a=a", "\u0014kPAF,ES\u0017\u000ez]\n\u0007\u0012>a\u00041{M^!\u001eQ|", "5dc\u0013_(MA\u0019\u0006z\\;|\b\ro\t7wD\n\u0017$%y\u0015F\u0004", "\u0014kPAF,ES\u0017\u000ez]\r\u0007\u0007?s]2\u0005O|\u001b G|mCv61h\u0002*@", "5dc\u0013_(MA\u0019\u0006z\\;|\b\u0010o}8\n\u001e\u000b &Cs\u0017<\u0004\u0005<Y\u000f\u001cFq 7\u0015\"\u000fK9m\u0016P", "\u0014kPAF,ES\u0017\u000ez]\u000f\u0007\u001a/r]2\u0005O|\u001b G|mCv61h\u0002*@", "5dc\u0013_(MA\u0019\u0006z\\;|\b\u0012o\u0011(\t\u001e\u000b &Cs\u0017<\u0004\u0005<Y\u000f\u001cFq 7\u0015\"\u000fK9m\u0016P", "\u0014kPAF,ES\u0017\u000ez]\u0016\r\u00186i\t(mD\u007f&\u001a", "5dc\u0013_(MA\u0019\u0006z\\;|\b\u0019u\u000f/\u007fI\u0001\t\u001bF~\u0011\u0004Ux\u0015^M!\u001f", "\u0014kPAF,ES\u0017\u000ez]\u0017\n\t=s\u007f'YJ\n&\u0013Kx\u000eIV,5jy/;w\u001f", "5dc\u0013_(MA\u0019\u0006z\\;|\b\u001ar\u007f6\n@\u007ft!P~\n@\u007f%B9\u0005 Hi%2WL\u0003J\b}\u001a8b!", "\u0014kPAH5LS ~xm,{i9c\u00106YJ\n&\u0013Kx\u000eIV,5jy/;w\u001f", "5dc\u0013_(MC\"\rze,z\u0018/d`2yP\u000ft!P~\n@\u007f%B9\u0005 Hi%2WL\u0003J\b}\u001a8b!", "\u0014kPAH5LS ~xm,{i9c\u00106eP\u0010\u001e\u001bPokF}/B", "5dc\u0013_(MC\"\rze,z\u0018/d`2yP\u000f\u0001'Vv\u0012Ev\u0003?`\b-", "\u0014kPAH5LS ~xm,{k9v\u007f5YJ\n&\u0013Kx\u000eIV,5jy/;w\u001f", "5dc\u0013_(MC\"\rze,z\u0018/db2\r@\u000et!P~\n@\u007f%B9\u0005 Hi%2WL\u0003J\b}\u001a8b!", "\u0014kPAH5LS ~xm,{r?t\u0007,\u0005@^!\u001eQ|", "5dc\u0013_(MC\"\rze,z\u0018/di8\u000bG\u0005 \u0017%y\u0015F\u0004", "\u0014kPAH5LS ~xm,{r?t\u0007,\u0005@r\u001b\u0016Vr", "5dc\u0013_(MC\"\rze,z\u0018/di8\u000bG\u0005 \u00179s\rKyl\u0014-]%\u0007n}", "\u0014kPAH5LS ~xm,{s<e\u000e6{?^! Vk\u0012Ev2\u0015`}13|\u001a8V", "5dc\u0013_(MC\"\rze,z\u0018/dj5{N\u000f\u0017\u0016%y\u0017Kr)>Y\u000b\u007f>m'*\\GEt{|hHf\t\bK", "\u0014nRBf\u0010GR\u001d|vm6\nf9l\n5", "5dc\u0013b*Na|\byb*x\u00189r]2\u0003J\u000e", "\u0017b^;F0SS", "5dc\u0016V6GA\u001d\u0014z&\u000bPh45\u0001\u0010", "\u001a`Q2_\u001b>f(_\u0005g;", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006\u0006/;Y\u0007.\u0001\\*9WEHg?!)NaMum2N\u007f5\u001d", "5dc\u0019T)>Z\b~\u000em\r\u0007\u0012>", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EH|&\u0017Ts\nCDnDc\u0004 @{_\u001daNEmA\u001a ku\u001f\u0007w\u001bX|'PZ$", "!d[2V;>Rw\fv`.|\b\u0016a|(\u0003/\u0001*&%y\u0015F\u0004", "5dc X3>Q(~y=9x\u000b1e~\u000fw=\u0001\u001e\u0006G\u0003\u001d\u001a\u0001,?f", "!d[2V;>Rw\fv`.|\b\u0016e{'\u007fI\u0003z\u0015QxkF}/B", "5dc X3>Q(~y=9x\u000b1e~\u000f{<\u007f\u001b IS\fF\u007f\u0003?`\b-", "!d[2V;>Rw\fv`.|\b\u001er{,\u0003D\n\u0019zEy\u0017\u001a\u0001,?f", "5dc X3>Q(~y=9x\u000b1e~\u0017\t<\u0005\u001e\u001bPqq:\u0001.\u0013c\u0005*D", "!d[2V;>Ry\txn:c\u0005,e\u0007\u0017{S\u0010t!Ny\u001b", "5dc X3>Q(~y?6z\u0019=L{%{Go\u0017*VM\u0018C\u00012", "!d[2V;>Ry\txn:c\t+d\u00041}$~! %y\u0015F\u0004", "5dc X3>Q(~y?6z\u0019=L\u007f$zD\n\u0019zEy\u0017\u001a\u0001,?f", "!d[2V;>Ry\txn:k\u0016+i\u0007,\u0005Bd\u0015!PM\u0018C\u00012", "5dc X3>Q(~y?6z\u0019=T\r$\u007fG\u0005 \u0019+m\u0018ET/<c\u000b", "!d[2V;>R{\t\f^9c\u0005,e\u0007\u0017{S\u0010t!Ny\u001b", "5dc X3>Q(~yA6\u000e\t<L{%{Go\u0017*VM\u0018C\u00012", "!d[2V;>R{\t\f^9c\t+d\u00041}$~! %y\u0015F\u0004", "5dc X3>Q(~yA6\u000e\t<L\u007f$zD\n\u0019zEy\u0017\u001a\u0001,?f", "!d[2V;>R{\t\f^9k\u0016+i\u0007,\u0005Bd\u0015!PM\u0018C\u00012", "5dc X3>Q(~yA6\u000e\t<T\r$\u007fG\u0005 \u0019+m\u0018ET/<c\u000b", "!d[2V;>R\u007fzw^3k\tBt]2\u0003J\u000e", "5dc X3>Q(~yE(y\t6T\u007f;\u000b\u001e\u000b\u001e!T", "!d[2V;>R\u007f~v]0\u0006\u000b\u0013c\n1YJ\b!$", "5dc X3>Q(~yE,x\b3n\u0002\fyJ\nt!Ny\u001b", "!d[2V;>R\u0004\fzl:|\b\u0016a|(\u0003/\u0001*&%y\u0015F\u0004", "5dc X3>Q(~yI9|\u0017=e~\u000fw=\u0001\u001e\u0006G\u0003\u001d\u001a\u0001,?f", "!d[2V;>R\u0004\fzl:|\b\u0016e{'\u007fI\u0003z\u0015QxkF}/B", "5dc X3>Q(~yI9|\u0017=e~\u000f{<\u007f\u001b IS\fF\u007f\u0003?`\b-", "!d[2V;>R\u0004\fzl:|\b\u001er{,\u0003D\n\u0019zEy\u0017\u001a\u0001,?f", "5dc X3>Q(~yI9|\u0017=e~\u0017\t<\u0005\u001e\u001bPqq:\u0001.\u0013c\u0005*D", "!d[2V;>R\b\fvb3\u0001\u00121I}2\u0005\u001e\u000b\u001e!T", "5dc X3>Q(~yM9x\r6i\t*_>\u000b tQv\u0018I", "#mb2_,<b\u0019}Yk(~\u000b/df$x@\b\u0006\u0017Z~kF}/B", "5dc\"a:>Z\u0019|\n^+[\u0016+g\u0002(z'|\u0014\u0017N^\u000eO\u0006\u0003?`\b-", "#mb2_,<b\u0019}Yk(~\u000b/df(w?\u0005 \u0019+m\u0018ET/<c\u000b", "5dc\"a:>Z\u0019|\n^+[\u0016+g\u0002(z'\u0001\u0013\u0016Kx\u0010 t/>7\b'Az", "#mb2_,<b\u0019}Yk(~\u000b/dn5wD\b\u001b IS\fF\u007f\u0003?`\b-", "5dc\"a:>Z\u0019|\n^+[\u0016+g\u0002(z/\u000e\u0013\u001bNs\u0017>Z#?b[*>w#", "#mb2_,<b\u0019}[h*\r\u0017\u0016a|(\u0003/\u0001*&%y\u0015F\u0004", "5dc\"a:>Z\u0019|\n^+]\u0013-u\u000e\u000fw=\u0001\u001e\u0006G\u0003\u001d\u001a\u0001,?f", "#mb2_,<b\u0019}[h*\r\u0017\u0016e{'\u007fI\u0003z\u0015QxkF}/B", "5dc\"a:>Z\u0019|\n^+]\u0013-u\u000e\u000f{<\u007f\u001b IS\fF\u007f\u0003?`\b-", "#mb2_,<b\u0019}[h*\r\u0017\u001er{,\u0003D\n\u0019zEy\u0017\u001a\u0001,?f", "5dc\"a:>Z\u0019|\n^+]\u0013-u\u000e\u0017\t<\u0005\u001e\u001bPqq:\u0001.\u0013c\u0005*D", "#mb2_,<b\u0019}]h=|\u0016\u0016a|(\u0003/\u0001*&%y\u0015F\u0004", "5dc\"a:>Z\u0019|\n^+_\u0013@e\r\u000fw=\u0001\u001e\u0006G\u0003\u001d\u001a\u0001,?f", "#mb2_,<b\u0019}]h=|\u0016\u0016e{'\u007fI\u0003z\u0015QxkF}/B", "5dc\"a:>Z\u0019|\n^+_\u0013@e\r\u000f{<\u007f\u001b IS\fF\u007f\u0003?`\b-", "#mb2_,<b\u0019}]h=|\u0016\u001er{,\u0003D\n\u0019zEy\u0017\u001a\u0001,?f", "5dc\"a:>Z\u0019|\n^+_\u0013@e\r\u0017\t<\u0005\u001e\u001bPqq:\u0001.\u0013c\u0005*D", "#mb2_,<b\u0019}aZ)|\u0010\u001ee\u00137YJ\b!$", "5dc\"a:>Z\u0019|\n^+c\u0005,e\u0007\u0017{S\u0010t!Ny\u001b", "#mb2_,<b\u0019}a^({\r8gc&\u0006I^!\u001eQ|", "5dc\"a:>Z\u0019|\n^+c\t+d\u00041}$~! %y\u0015F\u0004", "#mb2_,<b\u0019}ek,\u000b\u0017/df$x@\b\u0006\u0017Z~kF}/B", "5dc\"a:>Z\u0019|\n^+g\u0016/s\u000e(z'|\u0014\u0017N^\u000eO\u0006\u0003?`\b-", "#mb2_,<b\u0019}ek,\u000b\u0017/df(w?\u0005 \u0019+m\u0018ET/<c\u000b", "5dc\"a:>Z\u0019|\n^+g\u0016/s\u000e(z'\u0001\u0013\u0016Kx\u0010 t/>7\b'Az", "#mb2_,<b\u0019}ek,\u000b\u0017/dn5wD\b\u001b IS\fF\u007f\u0003?`\b-", "5dc\"a:>Z\u0019|\n^+g\u0016/s\u000e(z/\u000e\u0013\u001bNs\u0017>Z#?b[*>w#", "#mb2_,<b\u0019}ik(\u0001\u00103n\u0002\fyJ\nt!Ny\u001b", "5dc\"a:>Z\u0019|\n^+k\u0016+i\u0007,\u0005Bd\u0015!PM\u0018C\u00012", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class FilterChipTokens {
    public static final int $stable = 0;
    public static final FilterChipTokens INSTANCE = new FilterChipTokens();
    private static final float ContainerHeight = Dp.m6638constructorimpl((float) 32.0d);
    private static final ShapeKeyTokens ContainerShape = ShapeKeyTokens.CornerSmall;
    private static final ColorSchemeKeyTokens DisabledLabelTextColor = ColorSchemeKeyTokens.OnSurface;
    private static final float DisabledLabelTextOpacity = 0.38f;
    private static final float DraggedContainerElevation = ElevationTokens.INSTANCE.m3195getLevel4D9Ej5fM();
    private static final float ElevatedContainerElevation = ElevationTokens.INSTANCE.m3192getLevel1D9Ej5fM();
    private static final ColorSchemeKeyTokens ElevatedDisabledContainerColor = ColorSchemeKeyTokens.OnSurface;
    private static final float ElevatedDisabledContainerElevation = ElevationTokens.INSTANCE.m3191getLevel0D9Ej5fM();
    private static final float ElevatedDisabledContainerOpacity = 0.12f;
    private static final float ElevatedFocusContainerElevation = ElevationTokens.INSTANCE.m3192getLevel1D9Ej5fM();
    private static final float ElevatedHoverContainerElevation = ElevationTokens.INSTANCE.m3193getLevel2D9Ej5fM();
    private static final float ElevatedPressedContainerElevation = ElevationTokens.INSTANCE.m3192getLevel1D9Ej5fM();
    private static final ColorSchemeKeyTokens ElevatedSelectedContainerColor = ColorSchemeKeyTokens.SecondaryContainer;
    private static final ColorSchemeKeyTokens ElevatedUnselectedContainerColor = ColorSchemeKeyTokens.SurfaceContainerLow;
    private static final float FlatContainerElevation = ElevationTokens.INSTANCE.m3191getLevel0D9Ej5fM();
    private static final ColorSchemeKeyTokens FlatDisabledSelectedContainerColor = ColorSchemeKeyTokens.OnSurface;
    private static final float FlatDisabledSelectedContainerOpacity = 0.12f;
    private static final ColorSchemeKeyTokens FlatDisabledUnselectedOutlineColor = ColorSchemeKeyTokens.OnSurface;
    private static final float FlatDisabledUnselectedOutlineOpacity = 0.12f;
    private static final ColorSchemeKeyTokens FlatSelectedContainerColor = ColorSchemeKeyTokens.SecondaryContainer;
    private static final float FlatSelectedFocusContainerElevation = ElevationTokens.INSTANCE.m3191getLevel0D9Ej5fM();
    private static final float FlatSelectedHoverContainerElevation = ElevationTokens.INSTANCE.m3192getLevel1D9Ej5fM();
    private static final float FlatSelectedOutlineWidth = Dp.m6638constructorimpl((float) 0.0d);
    private static final float FlatSelectedPressedContainerElevation = ElevationTokens.INSTANCE.m3191getLevel0D9Ej5fM();
    private static final float FlatUnselectedFocusContainerElevation = ElevationTokens.INSTANCE.m3191getLevel0D9Ej5fM();
    private static final ColorSchemeKeyTokens FlatUnselectedFocusOutlineColor = ColorSchemeKeyTokens.OnSurfaceVariant;
    private static final float FlatUnselectedHoverContainerElevation = ElevationTokens.INSTANCE.m3191getLevel0D9Ej5fM();
    private static final ColorSchemeKeyTokens FlatUnselectedOutlineColor = ColorSchemeKeyTokens.Outline;
    private static final float FlatUnselectedOutlineWidth = Dp.m6638constructorimpl((float) 1.0d);
    private static final float FlatUnselectedPressedContainerElevation = ElevationTokens.INSTANCE.m3191getLevel0D9Ej5fM();
    private static final ColorSchemeKeyTokens FocusIndicatorColor = ColorSchemeKeyTokens.Secondary;
    private static final TypographyKeyTokens LabelTextFont = TypographyKeyTokens.LabelLarge;
    private static final ColorSchemeKeyTokens SelectedDraggedLabelTextColor = ColorSchemeKeyTokens.OnSecondaryContainer;
    private static final ColorSchemeKeyTokens SelectedFocusLabelTextColor = ColorSchemeKeyTokens.OnSecondaryContainer;
    private static final ColorSchemeKeyTokens SelectedHoverLabelTextColor = ColorSchemeKeyTokens.OnSecondaryContainer;
    private static final ColorSchemeKeyTokens SelectedLabelTextColor = ColorSchemeKeyTokens.OnSecondaryContainer;
    private static final ColorSchemeKeyTokens SelectedPressedLabelTextColor = ColorSchemeKeyTokens.OnSecondaryContainer;
    private static final ColorSchemeKeyTokens UnselectedDraggedLabelTextColor = ColorSchemeKeyTokens.OnSurfaceVariant;
    private static final ColorSchemeKeyTokens UnselectedFocusLabelTextColor = ColorSchemeKeyTokens.OnSurfaceVariant;
    private static final ColorSchemeKeyTokens UnselectedHoverLabelTextColor = ColorSchemeKeyTokens.OnSurfaceVariant;
    private static final ColorSchemeKeyTokens UnselectedLabelTextColor = ColorSchemeKeyTokens.OnSurfaceVariant;
    private static final ColorSchemeKeyTokens UnselectedPressedLabelTextColor = ColorSchemeKeyTokens.OnSurfaceVariant;
    private static final float IconSize = Dp.m6638constructorimpl((float) 18.0d);
    private static final ColorSchemeKeyTokens DisabledLeadingIconColor = ColorSchemeKeyTokens.OnSurface;
    private static final float DisabledLeadingIconOpacity = 0.38f;
    private static final ColorSchemeKeyTokens SelectedDraggedLeadingIconColor = ColorSchemeKeyTokens.OnSecondaryContainer;
    private static final ColorSchemeKeyTokens SelectedFocusLeadingIconColor = ColorSchemeKeyTokens.OnSecondaryContainer;
    private static final ColorSchemeKeyTokens SelectedHoverLeadingIconColor = ColorSchemeKeyTokens.OnSecondaryContainer;
    private static final ColorSchemeKeyTokens SelectedLeadingIconColor = ColorSchemeKeyTokens.OnSecondaryContainer;
    private static final ColorSchemeKeyTokens SelectedPressedLeadingIconColor = ColorSchemeKeyTokens.OnSecondaryContainer;
    private static final ColorSchemeKeyTokens UnselectedDraggedLeadingIconColor = ColorSchemeKeyTokens.Primary;
    private static final ColorSchemeKeyTokens UnselectedFocusLeadingIconColor = ColorSchemeKeyTokens.Primary;
    private static final ColorSchemeKeyTokens UnselectedHoverLeadingIconColor = ColorSchemeKeyTokens.Primary;
    private static final ColorSchemeKeyTokens UnselectedLeadingIconColor = ColorSchemeKeyTokens.Primary;
    private static final ColorSchemeKeyTokens UnselectedPressedLeadingIconColor = ColorSchemeKeyTokens.Primary;
    private static final ColorSchemeKeyTokens DisabledTrailingIconColor = ColorSchemeKeyTokens.OnSurface;
    private static final float DisabledTrailingIconOpacity = 0.38f;
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

    private FilterChipTokens() {
    }

    /* JADX INFO: renamed from: getContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m3291getContainerHeightD9Ej5fM() {
        return ContainerHeight;
    }

    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    public final ColorSchemeKeyTokens getDisabledLabelTextColor() {
        return DisabledLabelTextColor;
    }

    public final float getDisabledLabelTextOpacity() {
        return DisabledLabelTextOpacity;
    }

    /* JADX INFO: renamed from: getDraggedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3292getDraggedContainerElevationD9Ej5fM() {
        return DraggedContainerElevation;
    }

    /* JADX INFO: renamed from: getElevatedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3293getElevatedContainerElevationD9Ej5fM() {
        return ElevatedContainerElevation;
    }

    public final ColorSchemeKeyTokens getElevatedDisabledContainerColor() {
        return ElevatedDisabledContainerColor;
    }

    /* JADX INFO: renamed from: getElevatedDisabledContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3294getElevatedDisabledContainerElevationD9Ej5fM() {
        return ElevatedDisabledContainerElevation;
    }

    public final float getElevatedDisabledContainerOpacity() {
        return ElevatedDisabledContainerOpacity;
    }

    /* JADX INFO: renamed from: getElevatedFocusContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3295getElevatedFocusContainerElevationD9Ej5fM() {
        return ElevatedFocusContainerElevation;
    }

    /* JADX INFO: renamed from: getElevatedHoverContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3296getElevatedHoverContainerElevationD9Ej5fM() {
        return ElevatedHoverContainerElevation;
    }

    /* JADX INFO: renamed from: getElevatedPressedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3297getElevatedPressedContainerElevationD9Ej5fM() {
        return ElevatedPressedContainerElevation;
    }

    public final ColorSchemeKeyTokens getElevatedSelectedContainerColor() {
        return ElevatedSelectedContainerColor;
    }

    public final ColorSchemeKeyTokens getElevatedUnselectedContainerColor() {
        return ElevatedUnselectedContainerColor;
    }

    /* JADX INFO: renamed from: getFlatContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3298getFlatContainerElevationD9Ej5fM() {
        return FlatContainerElevation;
    }

    public final ColorSchemeKeyTokens getFlatDisabledSelectedContainerColor() {
        return FlatDisabledSelectedContainerColor;
    }

    public final float getFlatDisabledSelectedContainerOpacity() {
        return FlatDisabledSelectedContainerOpacity;
    }

    public final ColorSchemeKeyTokens getFlatDisabledUnselectedOutlineColor() {
        return FlatDisabledUnselectedOutlineColor;
    }

    public final float getFlatDisabledUnselectedOutlineOpacity() {
        return FlatDisabledUnselectedOutlineOpacity;
    }

    public final ColorSchemeKeyTokens getFlatSelectedContainerColor() {
        return FlatSelectedContainerColor;
    }

    /* JADX INFO: renamed from: getFlatSelectedFocusContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3299getFlatSelectedFocusContainerElevationD9Ej5fM() {
        return FlatSelectedFocusContainerElevation;
    }

    /* JADX INFO: renamed from: getFlatSelectedHoverContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3300getFlatSelectedHoverContainerElevationD9Ej5fM() {
        return FlatSelectedHoverContainerElevation;
    }

    /* JADX INFO: renamed from: getFlatSelectedOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m3301getFlatSelectedOutlineWidthD9Ej5fM() {
        return FlatSelectedOutlineWidth;
    }

    /* JADX INFO: renamed from: getFlatSelectedPressedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3302getFlatSelectedPressedContainerElevationD9Ej5fM() {
        return FlatSelectedPressedContainerElevation;
    }

    /* JADX INFO: renamed from: getFlatUnselectedFocusContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3303getFlatUnselectedFocusContainerElevationD9Ej5fM() {
        return FlatUnselectedFocusContainerElevation;
    }

    public final ColorSchemeKeyTokens getFlatUnselectedFocusOutlineColor() {
        return FlatUnselectedFocusOutlineColor;
    }

    /* JADX INFO: renamed from: getFlatUnselectedHoverContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3304getFlatUnselectedHoverContainerElevationD9Ej5fM() {
        return FlatUnselectedHoverContainerElevation;
    }

    public final ColorSchemeKeyTokens getFlatUnselectedOutlineColor() {
        return FlatUnselectedOutlineColor;
    }

    /* JADX INFO: renamed from: getFlatUnselectedOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m3305getFlatUnselectedOutlineWidthD9Ej5fM() {
        return FlatUnselectedOutlineWidth;
    }

    /* JADX INFO: renamed from: getFlatUnselectedPressedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3306getFlatUnselectedPressedContainerElevationD9Ej5fM() {
        return FlatUnselectedPressedContainerElevation;
    }

    public final ColorSchemeKeyTokens getFocusIndicatorColor() {
        return FocusIndicatorColor;
    }

    public final TypographyKeyTokens getLabelTextFont() {
        return LabelTextFont;
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

    public final ColorSchemeKeyTokens getSelectedPressedLabelTextColor() {
        return SelectedPressedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getUnselectedDraggedLabelTextColor() {
        return UnselectedDraggedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getUnselectedFocusLabelTextColor() {
        return UnselectedFocusLabelTextColor;
    }

    public final ColorSchemeKeyTokens getUnselectedHoverLabelTextColor() {
        return UnselectedHoverLabelTextColor;
    }

    public final ColorSchemeKeyTokens getUnselectedLabelTextColor() {
        return UnselectedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getUnselectedPressedLabelTextColor() {
        return UnselectedPressedLabelTextColor;
    }

    /* JADX INFO: renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m3307getIconSizeD9Ej5fM() {
        return IconSize;
    }

    public final ColorSchemeKeyTokens getDisabledLeadingIconColor() {
        return DisabledLeadingIconColor;
    }

    public final float getDisabledLeadingIconOpacity() {
        return DisabledLeadingIconOpacity;
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

    public final float getDisabledTrailingIconOpacity() {
        return DisabledTrailingIconOpacity;
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
