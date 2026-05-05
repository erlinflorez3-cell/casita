package androidx.compose.material3;

import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
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
/* JADX INFO: compiled from: TextFieldDefaults.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4J\u0007\"B\u0012\u007f\u0007l:A0RnP.X]2\u000fy\u0002<$a6yCQU\"}(\tUS}˧\u001fJ\t\n\u0004Ȃ\u0006&|x,aU'^\"\u0013@D\b?aN\u007fAGc\r63!B&F}\u001d\u0001H+X\u0014\u0005\u007f[K:\u0013@D~@j\r{\u0006*\u0016\u0014E8\u0001L]wRDP\u0005]h03\u0007wKf'\u000e1\rQ\u001bPl';wq\"9KO5C1c\u0007\u0015_s?1@\u0002A\u0013v?'YJ\u0004[Dg\u0018\u0014C,_\u0011k\u0003>\\3Rp\u00105<gcyQ\u001e,\u0006\r\u0014\rj\u0005\u001e\n5[F-Hg\u0018\u0012A\t\u000bSnQ\u0012bP\u0015\u0013ad\u00185\u0004AAQ\u001b\u0015Rq?'eO{3\u000e.'\u000f\u00079[\u0003\u000fp\u0019)m\u0010Q_RPAVh\"Ykn\u0014tp\u001dB\u0004^H\u00103\n-F\u0017S8k=1>\u0004\u0002vEwz\u0013~\u0001S\u0018SXD0\u000e.7X\n\u001c^R\u0005\u001dk~Uh0\u001fn4T5~\u0018\u0017.~\u0010<O& R]\f\u0002j{^\u001a)=\u000bOY\u001dl\u001e[G\u0004K5\u007fd e`\u001d,?jc\u0015\\tik\f\t]8&@p\u0003\u0010&|TR\u001a<J? \u001dD0?Ct\u0015v\u0004.FO(!_\ti \u0003b_<\u0003\u0018%ڲ\r\u0001^\n9\u001buUa,+aR1O/M\u0019T4RlB\\;\u0007-R0Ku-_L\u001bt<Tߡ\u001f\u0015ؖ8֗ȠA\u0015\u0015`7\u0015JϐFZV}Q{ȼW\u0001\u0003y\u001d;\u0001.\u0016\t\u001bv2`xLgTE#'dx#\u0016g\u0018y\u0010G+MiT\u0019_VI!\u0004\nBT8\u000b\n7\u001eS\u0002 (\u00035;I?\u001dDxD5\u001bakp\b.(c?,ze\u00124{\u0016\u001ec\u0002c8;FRq~l#Tr\tBVt\u0010\bp\nd\u00159HOo\tXNL9;.l\r,\u001b}n[h\u0014 \u0004:.m8\fC,\u0015\u000fI+\u0011[b\u007fm\u001cL\r\u0011P\u000f\u0018\u001b\u00141\u001d\u0013LC&Ves!04tH<G;p\u0017T\tR5\\B\u000e\u000bQg\u0002\u0006>{0Le\u000f%FZsiW>Z~\\d]\u001d`saQ0\u0007~\u001dI6xc25sLT=zJ\u0001\u0002\u001e9!pO\r~=+rUi!.X\u000f$]]qJ2<\nG7\b\u0004o:9H\u0003#B&6QQ?`'6d\u000bc\u0001fd%\u0013\u0017XT\"7\u001c\u0013|<=:\u0015\u0011\u0019]\u0011\bb[M~}=C( /DW\b<\u0003iF)M\u001e5[>yp\u001a'\nxk;,\tP&-\u0004\u0003CtW<g:c!:$\u0015.b0\nCV&\u0004<n\rr8/8<U\u0002A'+^\bl('F'9\u0013\u001eByi)\u0010ilq\u0016m\u000b1ga\\\u007fn;x5\tUN^\u0019^ZH:k \u0007\u00120\u001a\u001b&-` bW\u0011\u007finpyzs\rY0\u001c0g1>~6}Mzɚ\u0003՞ķ,\u0017A;[$-$juZW<_\u001b,rT$)B[EGז\u0010\u0012\u0383Eݱ۠h1=\u007f-CUXno\u001cEw\u0005Q7`)39H\n\u001e'=ׂ\u0003\u0003h\u0003jBB7^F{tXTAU\u001aUZTqr`>Ks\u0017r\f:p&\u0011]9h$L=2\u001ci0y@͋\u0010\u007fκ7ۍ˲\u000b\u001b;X_6mU\u000fk\u0019\rmzaoHQOrQ\u000e?s)7~;S\u0014\u0016P5l\u001aex]\u0014bɷ\u000e`ЫHʿ¹\"{[0\u000elgO2v\u000e#.FaL8=t@\u0005R\b\b4\nNnr\u0002wp\u0007T\",\u0018v:cא`3Қy߭ԯH@0\u001fzi\u000exvl#D;FD;\u001dcA3E[@S\u007f CI!,_`k\u001d+s2\u0019x`\u0605xF̘Xآƭ1\u0014ZWxM6|m\u0005P\u0012;\u000e4{?0x\u007f\u000f{H+YV^6\u000bW}EpkX\u000fR=tAֶ\n\u0005ß-Ѓǩ\u0006\u007fPV#u{r\u00028_\u0012\u0005|Q!\u001f9=\u0006SF\u001bKM5\nXk\u0018c\u000f{+p5\u0014;KTڶJcȌ\u0014ɸԐ/0MNL|r\u0004\u0014\u0007]dv\u0011t|R\u0006\u00060^\u000f\u0001\u0003h#u\u0001J}mY#F\u00172\u0011\u0016\"c˨*6ɓmְї'/~{\u0011r\nD!\u00066Sg3Sw\u001b\u000fV{6;yY\u000bMa\u00101@z%=fW/o*3UΧ>\u0018ۄ>ַǮ$)*\u0002!\u0007+\u0013!f&\"\u000e\u0004|:d\u0007`K\bo\u0017Fxn\u0013t:\r<<cfU\u0006?Ab4Ɯ^?۳-߾ŇKQpy8H8\n\u0003ɿL]+$%f3\b\u0010\u0012[\u0010 |ү[pE'Y6@A\u000eHܱ%(҅ž-1\u001dƍb>\u0002\u0002]x\u0011\b5˂/ٙԮqeΆBkF<V\u001d1hU,)\u0001\u0015y\u0017g\tHo\u0011ڙkԮʨ5Gц\u001d\t\tKoG,9J(1\u0017\u0004Q0p:S\f&ьIԑúi`ߢ\u0019\u0004e3D=\b.\u0003G\u0013m7\n\u0012\b\u001dM^\u0005Ј.ȊׄY?̛1b/mv8B\u0010\u00120\u0013[?j`d\u000e\u001f!eײ\"̎؟@VژK)\u001b\u0003'l 4S\r\t\u001e)s3M\u0014\u0006M\u0013ݹzҚЏ@rڥ7_yOB\u000e6+\u0004\u001f\u0006O]\u0003 +{JQPڻaʣӦ-LȢ\u000baDYO2\"$/Z\u0016Dw\u0019V_b2P$ň\u000e՛МIeó|-\u0011e\u001a_\rw\u0014i{mD}k\u000bLAkVԴ}Ч֕.pۻOQu~9w&K\u001cr]{>\ri@l\u0016`\bپ\u0003έ\u0602r_ݖF\u001f\u007f\bpd\u0004<\u0002\u0001\u0011C;b<1rf\u001dmĦOݍҞ<\u0015Ȍ\u0018\rFs7SX'e\u001bu/\f ~%OQseюCڈݙ_1ӟ\u0016\u0017PXt>3\u0004\u000b\u0007rIfPS\u0003XKC\\æfЇĘ!fʘo07\n\u0006FN\u001f\u0006qG<DglE\u007f^7Vͩ\rގՄN\u0007Ë4:O]hPG]\u000eKX\u0016\u001dg\u001b]\u001fl\\wȈq̞\u05ce\u0014\u0001ȪI*%CsI\u007f\u0007<+I\r9jr\u000f6n\n\\ݗ/۸\u05fb \u0012Ֆ#\u001e\u0016$\u00160\r]:\u000f\u00040\u0011_!,2C\\\tŚ\u0004ߥכ\u00044ȍE9GS~ICye\u001fP4]</P#\u0018Vbܞ\u0012Ӟʲ'!Ȑ\u0017~#m\u0017@4K+J;\u0001G\u0012(^( \u0004\u0011Ұ\tՋ҇]võ%Q80\u00029eNs@<\u001a@\u0002\u0006\u0003(O =֤}ԧŪD'Ո*ZC\u0014p\r\\)akRF^5-.<2:oѴ\u001aՖţ|nٳVj\u001a`B\u001fMZFy9RQ=\u000f\u0019!#\f,ĥ=ϝ˧Ecޒj~XC \u000f\r@oB\u0016`m\u001b\u0014P}2J:ʢxӎϳ3?ۂ.j\u001c$s<%NVs(e0S0FT\u001b\"1Ô\u0016ؒ\u05fdisӀ3N\u0019r\u0017!I4O'jN|u7\n\u0004y]Q\u008f@ƒִ.\u0019ţ*@i71{}$\"\u000eul\u001a<#\u001e7j:uؠ\u001cǃ\u0601[]ʚC\n\u000e$\"r\u00178v\rxmF3B1\r\"\u0011jר-՟\u0086N)Ξ\u0016mV'e\"|\u0015g~\fi\u001e1\u0010\u0004a\u0007;'҅,Ζ¥)\u0002ϬHY;lqwmxbX\u001d`\u000e\u0001UYdu)~ٱ1ڟɡvq߲o>M\u007f&Y\\K7~\u0010;!c}\u001eHI@MŴA¥ݡ1?լ\u0004#^fWd`wb\u0004z\r\u0015@\f\u000e~6\u001c?҆Lğͧ-\u0005ү!gr~\u0002'nh\u0019\u000e%Af\u0014\rQ\u0006e3fů\"ڃٸ~Rށe\u0004_Sx?`\u001984Bqd.\u0019)BTN\u0017܍Sm<ѤPN~\u0017\\\u00172\u001c<(2bV\u000ḛoٳħ9W͟aNA;+$lb?Dn&(>^vO\u00169rۄB֘Â] ءc\u0013\u001bJ+\u0004+U\b%;\u0002\fNUs Wtmէ-\u0604Ҹh\u001eˁ\t@v?Y\u001b.)E,\u0006\u000b1AN\u0016\u001b(CEޱ%éд\f=ɚ\"~\u001c655#YV:\u0010\"\u001b1#\nh\te\u0013ʊ<эϋ_ZǙ?-fJ\u001aA=(5_(X8\u00044\u001b-n\u0013\rЎ8Ǵ́0Oš\u000eqYm\u001e+\u0015\u001e:m0\tbX$E\u0001!gHЫHڋƐ\u0003\rĺTw\u00071f%\u0004oh1\"aS5Q\\\u0011\b\u0019Yé\u0018èԷma֯/g6F'@:/0@\u0006\u007fyP.d\u0001\u0001$sӼdѲӗ&qƲa\u0007\bouu~IK(sOFi\t2qT\u001b\u0010ܓwлϨ;cЄF4JL\u0005P$\u000eVBFNǉK\u00030o.܌E\u001f$dbPm\u0380\u0015ؘr"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e%Hh^$7t\u0015\fWJExBs", "", "4nRBf,=B\u0019\u0012\n<6\u0004\u0013<", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "CmU<V<LS\u0018mzq;Z\u00136o\r", "2hb.U3>R\b~\u000em\n\u0007\u00109r", "3qa<e\u001b>f(\\\u0005e6\n", "4nRBf,=1#\b\nZ0\u0006\t<C\n/\u0006M", "CmU<V<LS\u0018\\\u0005g;x\r8e\r\u0006\u0006G\u000b$", "2hb.U3>Rv\t\u0004m(\u0001\u0012/r]2\u0003J\u000e", "3qa<e\nH\\(z~g,\nf9l\n5", "1ta@b9\u001c] \t\b", "3qa<e\nN`'\t\b<6\u0004\u0013<", "BdgAF,ES\u0017\u000e~h5Z\u00136o\r6", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0004htHtc3Nt6KVW\nfY|J\"g", "4nRBf,=7\"}~\\(\f\u0013<C\n/\u0006M", "CmU<V<LS\u0018b\u0004]0z\u0005>o\r\u0006\u0006G\u000b$", "2hb.U3>R|\byb*x\u00189r]2\u0003J\u000e", "3qa<e\u0010GR\u001d|vm6\nf9l\n5", "4nRBf,=:\u0019zyb5~l-o\t\u0006\u0006G\u000b$", "CmU<V<LS\u0018ezZ+\u0001\u00121I}2\u0005\u001e\u000b\u001e!T", "2hb.U3>R\u007f~v]0\u0006\u000b\u0013c\n1YJ\b!$", "3qa<e\u0013>O\u0018\u0003\u0004`\u0010z\u00138C\n/\u0006M", "4nRBf,=B&z~e0\u0006\u000b\u0013c\n1YJ\b!$", "CmU<V<LS\u0018m\bZ0\u0004\r8gc&\u0006I^!\u001eQ|", "2hb.U3>R\b\fvb3\u0001\u00121I}2\u0005\u001e\u000b\u001e!T", "3qa<e\u001bKO\u001d\u0006~g.`\u00079n]2\u0003J\u000e", "4nRBf,=:\u0015{ze\n\u0007\u00109r", "CmU<V<LS\u0018ev[,\u0004f9l\n5", "2hb.U3>R\u007fzw^3Z\u00136o\r", "3qa<e\u0013:P\u0019\u0006Xh3\u0007\u0016", "4nRBf,=> zx^/\u0007\u0010.e\r\u0006\u0006G\u000b$", "CmU<V<LS\u0018i\u0002Z*|\f9l~(\t\u001e\u000b\u001e!T", "2hb.U3>R\u0004\u0006v\\,\u007f\u00136d\u007f5YJ\b!$", "3qa<e\u0017EO\u0017~}h3{\t<C\n/\u0006M", "4nRBf,=A)\n\u0006h9\f\r8gn(\u000fO^!\u001eQ|", "CmU<V<LS\u0018l\u000bi7\u0007\u0016>i\t*j@\u0014&tQv\u0018I", "2hb.U3>R\u0007\u000f\u0006i6\n\u00183n\u0002\u0017{S\u0010t!Ny\u001b", "3qa<e\u001aN^$\t\bm0\u0006\u000b\u001ee\u00137YJ\b!$", "4nRBf,=>&~{b?Z\u00136o\r", "CmU<V<LS\u0018i\b^-\u0001\u001c\ro\u00072\t", "2hb.U3>R\u0004\fz_0\u0010f9l\n5", "3qa<e\u0017KS\u001a\u0003\u000e<6\u0004\u0013<", "4nRBf,=A)\u007f{b?Z\u00136o\r", "CmU<V<LS\u0018l\u000b_-\u0001\u001c\ro\u00072\t", "2hb.U3>R\u0007\u000f{_0\u0010f9l\n5", "3qa<e\u001aNT\u001a\u0003\u000e<6\u0004\u0013<", "uI9\u0017=\u0011#8}c_E(\u0006\b<o\u0004'\u000f\n~!\u001fRy\u001c<@&?i\u0007\u001f3|\u001a8V\rJkG-^va@\u0007a;R\u00010\u0011;N?k@rD\u0014\u0010i\u0012X4j\u000f`K1|\u001a\u001c\u0004l\u0011.f Mepzr\u001aOU';t,^yZ&\u000eM+>D^,&*I0n\u001bf!e\u0004?5\u001c;\u001d$wP;\u0013wZZQRzcwN(XB-L|hVC~_I\\#,Q{\u0005guI", "5dc\u0010h9L]&\\\u0005e6\nPydQ\"aEp", "u(9", "\u0018", "5dc\u0011\\::P ~y<6\u0006\u0018+i\t(\t\u001e\u000b\u001e!T7X;H\u001f\u001b^m", "5dc\u0011\\::P ~yB5{\r-a\u000f2\t\u001e\u000b\u001e!T7X;H\u001f\u001b^m", "5dc\u0011\\::P ~yE(y\t6C\n/\u0006MHa\u0016\u0019isAf", "5dc\u0011\\::P ~yE,x\b3n\u0002\fyJ\nt!Ny\u001b\u0004A$\u0007Sc%'", "5dc\u0011\\::P ~yI3x\u0007/h\n/z@\u000et!Ny\u001b\u0004A$\u0007Sc%'", "5dc\u0011\\::P ~yI9|\n3x]2\u0003J\u000e^aFA\b\"{\u0015", "5dc\u0011\\::P ~yL<}\n3x]2\u0003J\u000e^aFA\b\"{\u0015", "5dc\u0011\\::P ~yL<\b\u00149r\u000f,\u0005Bo\u0017*VM\u0018C\u00012|$|q1S\u001b\u001e", "5dc\u0011\\::P ~yM,\u0010\u0018\ro\u00072\t\bK\u0016hAU\u0013,", "5dc\u0011\\::P ~yM9x\r6i\t*_>\u000b tQv\u0018I>o4+w\u0006<]", "5dc\u0012e9H`v\t\u0004m(\u0001\u0012/r]2\u0003J\u000e^aFA\b\"{\u0015", "5dc\u0012e9H`v\u000f\bl6\nf9l\n5C\u000b\u007fh\u0011-t}", "5dc\u0012e9H`|\byb*x\u00189r]2\u0003J\u000e^aFA\b\"{\u0015", "5dc\u0012e9H`\u007fzw^3Z\u00136o\roF?R\u0011|L_", "5dc\u0012e9H`\u007f~v]0\u0006\u000b\u0013c\n1YJ\b!$\u000f:\r\u000ep\u000b:I", "5dc\u0012e9H`\u0004\u0006v\\,\u007f\u00136d\u007f5YJ\b!$\u000f:\r\u000ep\u000b:I", "5dc\u0012e9H`\u0004\fz_0\u0010f9l\n5C\u000b\u007fh\u0011-t}", "5dc\u0012e9H`\u0007\u000f{_0\u0010f9l\n5C\u000b\u007fh\u0011-t}", "5dc\u0012e9H`\u0007\u000f\u0006i6\n\u00183n\u0002\u0017{S\u0010t!Ny\u001b\u0004A$\u0007Sc%'", "5dc\u0012e9H`\b~\u000em\n\u0007\u00109rGrz\u0012z|\u001c7", "5dc\u0012e9H`\b\fvb3\u0001\u00121I}2\u0005\u001e\u000b\u001e!T7X;H\u001f\u001b^m", "5dc\u0013b*Na\u0019}Xh5\f\u00053n\u007f5YJ\b!$\u000f:\r\u000ep\u000b:I", "5dc\u0013b*Na\u0019}^g+\u0001\u0007+t\n5YJ\b!$\u000f:\r\u000ep\u000b:I", "5dc\u0013b*Na\u0019}aZ)|\u0010\ro\u00072\t\bK\u0016hAU\u0013,", "5dc\u0013b*Na\u0019}a^({\r8gc&\u0006I^!\u001eQ|U\u0007uv/?\u0003\u0010", "5dc\u0013b*Na\u0019}ee(z\t2o\u0007'{M^!\u001eQ|U\u0007uv/?\u0003\u0010", "5dc\u0013b*Na\u0019}ek,}\rBC\n/\u0006MHa\u0016\u0019isAf", "5dc\u0013b*Na\u0019}hn-}\rBC\n/\u0006MHa\u0016\u0019isAf", "5dc\u0013b*Na\u0019}hn7\b\u0013<t\u00041}/\u0001*&%y\u0015F\u0004l\u007fXO\u001a\u001dr\u0006", "5dc\u0013b*Na\u0019}i^?\ff9l\n5C\u000b\u007fh\u0011-t}", "5dc\u0013b*Na\u0019}ik(\u0001\u00103n\u0002\fyJ\nt!Ny\u001b\u0004A$\u0007Sc%'", "5dc!X?MA\u0019\u0006z\\;\u0001\u00138C\n/\u0006M\u000f", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7$.TC9z8(\u001e2P9\u001ar\u001aN}'E[R6e0|D\u001e\u001fhc", "5dc\"a-HQ)\rz]\n\u0007\u0012>a\u00041{M^!\u001eQ|U\u0007uv/?\u0003\u0010", "5dc\"a-HQ)\rz]\u0010\u0006\b3c{7\u0006M^!\u001eQ|U\u0007uv/?\u0003\u0010", "5dc\"a-HQ)\rz]\u0013x\u0006/l]2\u0003J\u000e^aFA\b\"{\u0015", "5dc\"a-HQ)\rz]\u0013|\u0005.i\t*_>\u000b tQv\u0018I>o4+w\u0006<]", "5dc\"a-HQ)\rz]\u0017\u0004\u0005-e\u00032\u0003?\u0001$tQv\u0018I>o4+w\u0006<]", "5dc\"a-HQ)\rz]\u0017\n\t0i\u0013\u0006\u0006G\u000b$^\u0012n_6\\*%", "5dc\"a-HQ)\rz]\u001a\r\n0i\u0013\u0006\u0006G\u000b$^\u0012n_6\\*%", "5dc\"a-HQ)\rz]\u001a\r\u0014:o\r7\u007fI\u0003\u0006\u0017Z~kF}/B!H\u001f\tg{3=", "5dc\"a-HQ)\rz]\u001b|\u001c>C\n/\u0006MHa\u0016\u0019isAf", "5dc\"a-HQ)\rz]\u001b\n\u00053l\u00041}$~! %y\u0015F\u0004l\u007fXO\u001a\u001dr\u0006", "1n]AT0GS&\\\u0005e6\n", "3mP/_,=", "", "7r4?e6K", "4nRBf,=", "1n]AT0GS&\\\u0005e6\nP\"e[\u001cO'tU\u001fC~\u000eIz!<'w-7t\u0016*[C", "uYI'\u001c\u0011", "1n_F", "1n_F ,C7\u001eiH-", "uI9\u0017=\u0011#8}c_E(\u0006\b<o\u0004'\u000f\n~!\u001fRy\u001c<@&?i\u0007\u001f3|\u001a8V\rJkG-^va@\u0007a;R\u00010\u0011;N?k@rD\u0014\u0010i\u0012X4j\u000f`K1|\u001a\u001c\u0004l\u0011.f Mepzr\u001aOU';t,^yZ&\u000eM+>D^,&*&\u0011`\u0015^*f>97]o##sZ<\nE[\r\u0002R\u0007kcNfD'$Q|<JEvT\u001a~.)X\nM", "1ta@b9\u001c] \t\b&=e\u001c\f0P.:H|&\u0017Ts\nCD\u001fBY\u0005 3{\u0016", "uY\u0018\u0017", "3pd._:", "=sW2e", "6`b566=S", "", "7mS6V(M]&\\\u0005e6\n", "7mS6V(M]&\\\u0005e6\nP\"e[\u001cO'tU\u001fC~\u000eIz!<'w-7t\u0016*[C", ":`Q2_\nHZ#\f", ":`Q2_\nHZ#\fBQ,X|\u0003Lsf\u0004<\u0010\u0017$Kk\u0015\np25`}\u001cEm", ":dP1\\5@7\u0017\t\u0004<6\u0004\u0013<", ":dP1\\5@7\u0017\t\u0004<6\u0004\u0013<-r(W4T}\u000b\u0006w\nKv29U\u0005m1z\u00165M?Ik", ">kP0X/HZ\u0018~\b<6\u0004\u0013<", ">kP0X/HZ\u0018~\b<6\u0004\u0013<-r(W4T}\u000b\u0006w\nKv29U\u0005m1z\u00165M?Ik", ">qT3\\?\u001c] \t\b", ">qT3\\?\u001c] \t\b&\u001f|d#9f\u001c:H|&\u0017Ts\nCD\u001fBY\u0005 3{\u0016", "AtU3\\?\u001c] \t\b", "AtU3\\?\u001c] \t\b&\u001f|d#9f\u001c:H|&\u0017Ts\nCD\u001fBY\u0005 3{\u0016", "At_=b9MW\"\u0001i^?\ff9l\n5", "At_=b9MW\"\u0001i^?\ff9l\n5C3\u0001r\u000b\u001bV\u0002z~!DY\u000b$3tc(ZCBk0,\u0015", "BdgA66E]&", "BdgA66E]&Fm^\bp\\\u0016Y>0wO\u0001$\u001bCv[6\u0004%<Yy.7", "BqP6_0GU||\u0005g\n\u0007\u00109r", "BqP6_0GU||\u0005g\n\u0007\u00109rG\u001b{\u001ctj};.\u00168\u0006%B]y'\u0005g#.TC7y4", "B`Z2B9\u001eZ'~", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "B`Z2B9\u001eZ'~9f(\f\t<i{/I:\u000e\u0017\u001eGk\u001c<", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TextFieldColors {
    public static final int $stable = 0;
    private final long cursorColor;
    private final long disabledContainerColor;
    private final long disabledIndicatorColor;
    private final long disabledLabelColor;
    private final long disabledLeadingIconColor;
    private final long disabledPlaceholderColor;
    private final long disabledPrefixColor;
    private final long disabledSuffixColor;
    private final long disabledSupportingTextColor;
    private final long disabledTextColor;
    private final long disabledTrailingIconColor;
    private final long errorContainerColor;
    private final long errorCursorColor;
    private final long errorIndicatorColor;
    private final long errorLabelColor;
    private final long errorLeadingIconColor;
    private final long errorPlaceholderColor;
    private final long errorPrefixColor;
    private final long errorSuffixColor;
    private final long errorSupportingTextColor;
    private final long errorTextColor;
    private final long errorTrailingIconColor;
    private final long focusedContainerColor;
    private final long focusedIndicatorColor;
    private final long focusedLabelColor;
    private final long focusedLeadingIconColor;
    private final long focusedPlaceholderColor;
    private final long focusedPrefixColor;
    private final long focusedSuffixColor;
    private final long focusedSupportingTextColor;
    private final long focusedTextColor;
    private final long focusedTrailingIconColor;
    private final TextSelectionColors textSelectionColors;
    private final long unfocusedContainerColor;
    private final long unfocusedIndicatorColor;
    private final long unfocusedLabelColor;
    private final long unfocusedLeadingIconColor;
    private final long unfocusedPlaceholderColor;
    private final long unfocusedPrefixColor;
    private final long unfocusedSuffixColor;
    private final long unfocusedSupportingTextColor;
    private final long unfocusedTextColor;
    private final long unfocusedTrailingIconColor;

    public /* synthetic */ TextFieldColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, TextSelectionColors textSelectionColors, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, textSelectionColors, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j40, j41, j42, j43);
    }

    private TextFieldColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, TextSelectionColors textSelectionColors, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43) {
        this.focusedTextColor = j2;
        this.unfocusedTextColor = j3;
        this.disabledTextColor = j4;
        this.errorTextColor = j5;
        this.focusedContainerColor = j6;
        this.unfocusedContainerColor = j7;
        this.disabledContainerColor = j8;
        this.errorContainerColor = j9;
        this.cursorColor = j10;
        this.errorCursorColor = j11;
        this.textSelectionColors = textSelectionColors;
        this.focusedIndicatorColor = j12;
        this.unfocusedIndicatorColor = j13;
        this.disabledIndicatorColor = j14;
        this.errorIndicatorColor = j15;
        this.focusedLeadingIconColor = j16;
        this.unfocusedLeadingIconColor = j17;
        this.disabledLeadingIconColor = j18;
        this.errorLeadingIconColor = j19;
        this.focusedTrailingIconColor = j20;
        this.unfocusedTrailingIconColor = j21;
        this.disabledTrailingIconColor = j22;
        this.errorTrailingIconColor = j23;
        this.focusedLabelColor = j24;
        this.unfocusedLabelColor = j25;
        this.disabledLabelColor = j26;
        this.errorLabelColor = j27;
        this.focusedPlaceholderColor = j28;
        this.unfocusedPlaceholderColor = j29;
        this.disabledPlaceholderColor = j30;
        this.errorPlaceholderColor = j31;
        this.focusedSupportingTextColor = j32;
        this.unfocusedSupportingTextColor = j33;
        this.disabledSupportingTextColor = j34;
        this.errorSupportingTextColor = j35;
        this.focusedPrefixColor = j36;
        this.unfocusedPrefixColor = j37;
        this.disabledPrefixColor = j38;
        this.errorPrefixColor = j39;
        this.focusedSuffixColor = j40;
        this.unfocusedSuffixColor = j41;
        this.disabledSuffixColor = j42;
        this.errorSuffixColor = j43;
    }

    /* JADX INFO: renamed from: getFocusedTextColor-0d7_KjU, reason: not valid java name */
    public final long m2661getFocusedTextColor0d7_KjU() {
        return this.focusedTextColor;
    }

    /* JADX INFO: renamed from: getUnfocusedTextColor-0d7_KjU, reason: not valid java name */
    public final long m2671getUnfocusedTextColor0d7_KjU() {
        return this.unfocusedTextColor;
    }

    /* JADX INFO: renamed from: getDisabledTextColor-0d7_KjU, reason: not valid java name */
    public final long m2640getDisabledTextColor0d7_KjU() {
        return this.disabledTextColor;
    }

    /* JADX INFO: renamed from: getErrorTextColor-0d7_KjU, reason: not valid java name */
    public final long m2651getErrorTextColor0d7_KjU() {
        return this.errorTextColor;
    }

    /* JADX INFO: renamed from: getFocusedContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2653getFocusedContainerColor0d7_KjU() {
        return this.focusedContainerColor;
    }

    /* JADX INFO: renamed from: getUnfocusedContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2663getUnfocusedContainerColor0d7_KjU() {
        return this.unfocusedContainerColor;
    }

    /* JADX INFO: renamed from: getDisabledContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2632getDisabledContainerColor0d7_KjU() {
        return this.disabledContainerColor;
    }

    /* JADX INFO: renamed from: getErrorContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2642getErrorContainerColor0d7_KjU() {
        return this.errorContainerColor;
    }

    /* JADX INFO: renamed from: getCursorColor-0d7_KjU, reason: not valid java name */
    public final long m2631getCursorColor0d7_KjU() {
        return this.cursorColor;
    }

    /* JADX INFO: renamed from: getErrorCursorColor-0d7_KjU, reason: not valid java name */
    public final long m2643getErrorCursorColor0d7_KjU() {
        return this.errorCursorColor;
    }

    public final TextSelectionColors getTextSelectionColors() {
        return this.textSelectionColors;
    }

    /* JADX INFO: renamed from: getFocusedIndicatorColor-0d7_KjU, reason: not valid java name */
    public final long m2654getFocusedIndicatorColor0d7_KjU() {
        return this.focusedIndicatorColor;
    }

    /* JADX INFO: renamed from: getUnfocusedIndicatorColor-0d7_KjU, reason: not valid java name */
    public final long m2664getUnfocusedIndicatorColor0d7_KjU() {
        return this.unfocusedIndicatorColor;
    }

    /* JADX INFO: renamed from: getDisabledIndicatorColor-0d7_KjU, reason: not valid java name */
    public final long m2633getDisabledIndicatorColor0d7_KjU() {
        return this.disabledIndicatorColor;
    }

    /* JADX INFO: renamed from: getErrorIndicatorColor-0d7_KjU, reason: not valid java name */
    public final long m2644getErrorIndicatorColor0d7_KjU() {
        return this.errorIndicatorColor;
    }

    /* JADX INFO: renamed from: getFocusedLeadingIconColor-0d7_KjU, reason: not valid java name */
    public final long m2656getFocusedLeadingIconColor0d7_KjU() {
        return this.focusedLeadingIconColor;
    }

    /* JADX INFO: renamed from: getUnfocusedLeadingIconColor-0d7_KjU, reason: not valid java name */
    public final long m2666getUnfocusedLeadingIconColor0d7_KjU() {
        return this.unfocusedLeadingIconColor;
    }

    /* JADX INFO: renamed from: getDisabledLeadingIconColor-0d7_KjU, reason: not valid java name */
    public final long m2635getDisabledLeadingIconColor0d7_KjU() {
        return this.disabledLeadingIconColor;
    }

    /* JADX INFO: renamed from: getErrorLeadingIconColor-0d7_KjU, reason: not valid java name */
    public final long m2646getErrorLeadingIconColor0d7_KjU() {
        return this.errorLeadingIconColor;
    }

    /* JADX INFO: renamed from: getFocusedTrailingIconColor-0d7_KjU, reason: not valid java name */
    public final long m2662getFocusedTrailingIconColor0d7_KjU() {
        return this.focusedTrailingIconColor;
    }

    /* JADX INFO: renamed from: getUnfocusedTrailingIconColor-0d7_KjU, reason: not valid java name */
    public final long m2672getUnfocusedTrailingIconColor0d7_KjU() {
        return this.unfocusedTrailingIconColor;
    }

    /* JADX INFO: renamed from: getDisabledTrailingIconColor-0d7_KjU, reason: not valid java name */
    public final long m2641getDisabledTrailingIconColor0d7_KjU() {
        return this.disabledTrailingIconColor;
    }

    /* JADX INFO: renamed from: getErrorTrailingIconColor-0d7_KjU, reason: not valid java name */
    public final long m2652getErrorTrailingIconColor0d7_KjU() {
        return this.errorTrailingIconColor;
    }

    /* JADX INFO: renamed from: getFocusedLabelColor-0d7_KjU, reason: not valid java name */
    public final long m2655getFocusedLabelColor0d7_KjU() {
        return this.focusedLabelColor;
    }

    /* JADX INFO: renamed from: getUnfocusedLabelColor-0d7_KjU, reason: not valid java name */
    public final long m2665getUnfocusedLabelColor0d7_KjU() {
        return this.unfocusedLabelColor;
    }

    /* JADX INFO: renamed from: getDisabledLabelColor-0d7_KjU, reason: not valid java name */
    public final long m2634getDisabledLabelColor0d7_KjU() {
        return this.disabledLabelColor;
    }

    /* JADX INFO: renamed from: getErrorLabelColor-0d7_KjU, reason: not valid java name */
    public final long m2645getErrorLabelColor0d7_KjU() {
        return this.errorLabelColor;
    }

    /* JADX INFO: renamed from: getFocusedPlaceholderColor-0d7_KjU, reason: not valid java name */
    public final long m2657getFocusedPlaceholderColor0d7_KjU() {
        return this.focusedPlaceholderColor;
    }

    /* JADX INFO: renamed from: getUnfocusedPlaceholderColor-0d7_KjU, reason: not valid java name */
    public final long m2667getUnfocusedPlaceholderColor0d7_KjU() {
        return this.unfocusedPlaceholderColor;
    }

    /* JADX INFO: renamed from: getDisabledPlaceholderColor-0d7_KjU, reason: not valid java name */
    public final long m2636getDisabledPlaceholderColor0d7_KjU() {
        return this.disabledPlaceholderColor;
    }

    /* JADX INFO: renamed from: getErrorPlaceholderColor-0d7_KjU, reason: not valid java name */
    public final long m2647getErrorPlaceholderColor0d7_KjU() {
        return this.errorPlaceholderColor;
    }

    /* JADX INFO: renamed from: getFocusedSupportingTextColor-0d7_KjU, reason: not valid java name */
    public final long m2660getFocusedSupportingTextColor0d7_KjU() {
        return this.focusedSupportingTextColor;
    }

    /* JADX INFO: renamed from: getUnfocusedSupportingTextColor-0d7_KjU, reason: not valid java name */
    public final long m2670getUnfocusedSupportingTextColor0d7_KjU() {
        return this.unfocusedSupportingTextColor;
    }

    /* JADX INFO: renamed from: getDisabledSupportingTextColor-0d7_KjU, reason: not valid java name */
    public final long m2639getDisabledSupportingTextColor0d7_KjU() {
        return this.disabledSupportingTextColor;
    }

    /* JADX INFO: renamed from: getErrorSupportingTextColor-0d7_KjU, reason: not valid java name */
    public final long m2650getErrorSupportingTextColor0d7_KjU() {
        return this.errorSupportingTextColor;
    }

    /* JADX INFO: renamed from: getFocusedPrefixColor-0d7_KjU, reason: not valid java name */
    public final long m2658getFocusedPrefixColor0d7_KjU() {
        return this.focusedPrefixColor;
    }

    /* JADX INFO: renamed from: getUnfocusedPrefixColor-0d7_KjU, reason: not valid java name */
    public final long m2668getUnfocusedPrefixColor0d7_KjU() {
        return this.unfocusedPrefixColor;
    }

    /* JADX INFO: renamed from: getDisabledPrefixColor-0d7_KjU, reason: not valid java name */
    public final long m2637getDisabledPrefixColor0d7_KjU() {
        return this.disabledPrefixColor;
    }

    /* JADX INFO: renamed from: getErrorPrefixColor-0d7_KjU, reason: not valid java name */
    public final long m2648getErrorPrefixColor0d7_KjU() {
        return this.errorPrefixColor;
    }

    /* JADX INFO: renamed from: getFocusedSuffixColor-0d7_KjU, reason: not valid java name */
    public final long m2659getFocusedSuffixColor0d7_KjU() {
        return this.focusedSuffixColor;
    }

    /* JADX INFO: renamed from: getUnfocusedSuffixColor-0d7_KjU, reason: not valid java name */
    public final long m2669getUnfocusedSuffixColor0d7_KjU() {
        return this.unfocusedSuffixColor;
    }

    /* JADX INFO: renamed from: getDisabledSuffixColor-0d7_KjU, reason: not valid java name */
    public final long m2638getDisabledSuffixColor0d7_KjU() {
        return this.disabledSuffixColor;
    }

    /* JADX INFO: renamed from: getErrorSuffixColor-0d7_KjU, reason: not valid java name */
    public final long m2649getErrorSuffixColor0d7_KjU() {
        return this.errorSuffixColor;
    }

    /* JADX INFO: renamed from: copy-ejIjP34$default, reason: not valid java name */
    public static /* synthetic */ TextFieldColors m2627copyejIjP34$default(TextFieldColors textFieldColors, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, TextSelectionColors textSelectionColors, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, int i2, int i3, Object obj) {
        long j44 = j7;
        long j45 = j5;
        long j46 = j4;
        long j47 = j8;
        long j48 = j3;
        long j49 = j6;
        long j50 = j2;
        long j51 = j42;
        long j52 = j38;
        long j53 = j33;
        long j54 = j32;
        long j55 = j40;
        long j56 = j31;
        long j57 = j20;
        long j58 = j29;
        long j59 = j35;
        long j60 = j26;
        long j61 = j15;
        long j62 = j24;
        long j63 = j39;
        long j64 = j30;
        long j65 = j21;
        long j66 = j37;
        long j67 = j28;
        long j68 = j19;
        long j69 = j17;
        long j70 = j36;
        long j71 = j27;
        long j72 = j41;
        long j73 = j18;
        long j74 = j14;
        long j75 = j16;
        long j76 = j13;
        long j77 = j34;
        long j78 = j25;
        long j79 = j23;
        long j80 = j12;
        long j81 = j10;
        long j82 = j9;
        long j83 = j11;
        long j84 = j22;
        long j85 = j43;
        TextSelectionColors textSelectionColors2 = textSelectionColors;
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            j50 = textFieldColors.focusedTextColor;
        }
        if ((i2 & 2) != 0) {
            j48 = textFieldColors.unfocusedTextColor;
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            j46 = textFieldColors.disabledTextColor;
        }
        if ((i2 & 8) != 0) {
            j45 = textFieldColors.errorTextColor;
        }
        if ((i2 & 16) != 0) {
            j49 = textFieldColors.focusedContainerColor;
        }
        if ((i2 + 32) - (i2 | 32) != 0) {
            j44 = textFieldColors.unfocusedContainerColor;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 64)) != 0) {
            j47 = textFieldColors.disabledContainerColor;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 128)) != 0) {
            j82 = textFieldColors.errorContainerColor;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 256)) != 0) {
            j81 = textFieldColors.cursorColor;
        }
        if ((i2 + 512) - (i2 | 512) != 0) {
            j83 = textFieldColors.errorCursorColor;
        }
        if ((i2 + 1024) - (i2 | 1024) != 0) {
            textSelectionColors2 = textFieldColors.textSelectionColors;
        }
        if ((i2 & 2048) != 0) {
            j80 = textFieldColors.focusedIndicatorColor;
        }
        if ((i2 & 4096) != 0) {
            j76 = textFieldColors.unfocusedIndicatorColor;
        }
        if ((i2 + 8192) - (i2 | 8192) != 0) {
            j74 = textFieldColors.disabledIndicatorColor;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 16384)) != 0) {
            j61 = textFieldColors.errorIndicatorColor;
        }
        if ((32768 + i2) - (32768 | i2) != 0) {
            j75 = textFieldColors.focusedLeadingIconColor;
        }
        if ((65536 + i2) - (65536 | i2) != 0) {
            j69 = textFieldColors.unfocusedLeadingIconColor;
        }
        if ((-1) - (((-1) - 131072) | ((-1) - i2)) != 0) {
            j73 = textFieldColors.disabledLeadingIconColor;
        }
        if ((262144 + i2) - (262144 | i2) != 0) {
            j68 = textFieldColors.errorLeadingIconColor;
        }
        if ((524288 & i2) != 0) {
            j57 = textFieldColors.focusedTrailingIconColor;
        }
        if ((1048576 & i2) != 0) {
            j65 = textFieldColors.unfocusedTrailingIconColor;
        }
        if ((2097152 + i2) - (2097152 | i2) != 0) {
            j84 = textFieldColors.disabledTrailingIconColor;
        }
        if ((4194304 & i2) != 0) {
            j79 = textFieldColors.errorTrailingIconColor;
        }
        if ((8388608 + i2) - (8388608 | i2) != 0) {
            j62 = textFieldColors.focusedLabelColor;
        }
        if ((-1) - (((-1) - 16777216) | ((-1) - i2)) != 0) {
            j78 = textFieldColors.unfocusedLabelColor;
        }
        if ((33554432 + i2) - (33554432 | i2) != 0) {
            j60 = textFieldColors.disabledLabelColor;
        }
        if ((67108864 & i2) != 0) {
            j71 = textFieldColors.errorLabelColor;
        }
        if ((134217728 + i2) - (134217728 | i2) != 0) {
            j67 = textFieldColors.focusedPlaceholderColor;
        }
        if ((268435456 + i2) - (268435456 | i2) != 0) {
            j58 = textFieldColors.unfocusedPlaceholderColor;
        }
        if ((536870912 & i2) != 0) {
            j64 = textFieldColors.disabledPlaceholderColor;
        }
        if ((1073741824 & i2) != 0) {
            j56 = textFieldColors.errorPlaceholderColor;
        }
        if ((-1) - (((-1) - i2) | ((-1) - Integer.MIN_VALUE)) != 0) {
            j54 = textFieldColors.focusedSupportingTextColor;
        }
        if ((i3 + 1) - (i3 | 1) != 0) {
            j53 = textFieldColors.unfocusedSupportingTextColor;
        }
        if ((i3 + 2) - (i3 | 2) != 0) {
            j77 = textFieldColors.disabledSupportingTextColor;
        }
        if ((i3 + 4) - (i3 | 4) != 0) {
            j59 = textFieldColors.errorSupportingTextColor;
        }
        if ((i3 & 8) != 0) {
            j70 = textFieldColors.focusedPrefixColor;
        }
        if ((i3 + 16) - (i3 | 16) != 0) {
            j66 = textFieldColors.unfocusedPrefixColor;
        }
        if ((i3 & 32) != 0) {
            j52 = textFieldColors.disabledPrefixColor;
        }
        if ((i3 + 64) - (i3 | 64) != 0) {
            j63 = textFieldColors.errorPrefixColor;
        }
        if ((i3 & 128) != 0) {
            j55 = textFieldColors.focusedSuffixColor;
        }
        if ((i3 & 256) != 0) {
            j72 = textFieldColors.unfocusedSuffixColor;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 512)) != 0) {
            j51 = textFieldColors.disabledSuffixColor;
        }
        if ((i3 & 1024) != 0) {
            j85 = textFieldColors.errorSuffixColor;
        }
        return textFieldColors.m2629copyejIjP34(j50, j48, j46, j45, j49, j44, j47, j82, j81, j83, textSelectionColors2, j80, j76, j74, j61, j75, j69, j73, j68, j57, j65, j84, j79, j62, j78, j60, j71, j67, j58, j64, j56, j54, j53, j77, j59, j70, j66, j52, j63, j55, j72, j51, j85);
    }

    /* JADX INFO: renamed from: copy-ejIjP34, reason: not valid java name */
    public final TextFieldColors m2629copyejIjP34(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, TextSelectionColors textSelectionColors, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43) {
        long j44 = j12;
        long j45 = j13;
        long j46 = j14;
        long j47 = j15;
        long j48 = j16;
        long j49 = j17;
        long j50 = j18;
        long j51 = j19;
        long j52 = j20;
        long j53 = j21;
        long j54 = j22;
        long j55 = j23;
        long j56 = j24;
        long j57 = j2;
        long j58 = j25;
        long j59 = j3;
        long j60 = j26;
        long j61 = j4;
        long j62 = j27;
        long j63 = j5;
        long j64 = j28;
        long j65 = j6;
        long j66 = j29;
        long j67 = j7;
        long j68 = j30;
        long j69 = j8;
        long j70 = j31;
        long j71 = j9;
        long j72 = j32;
        long j73 = j10;
        long j74 = j33;
        long j75 = j11;
        long j76 = j34;
        long j77 = j35;
        long j78 = j36;
        long j79 = j37;
        long j80 = j38;
        long j81 = j39;
        long j82 = j40;
        long j83 = j41;
        long j84 = j42;
        long j85 = j43;
        if (j57 == 16) {
            j57 = this.focusedTextColor;
        }
        if (j59 == 16) {
            j59 = this.unfocusedTextColor;
        }
        if (j61 == 16) {
            j61 = this.disabledTextColor;
        }
        if (j63 == 16) {
            j63 = this.errorTextColor;
        }
        if (j65 == 16) {
            j65 = this.focusedContainerColor;
        }
        if (j67 == 16) {
            j67 = this.unfocusedContainerColor;
        }
        if (j69 == 16) {
            j69 = this.disabledContainerColor;
        }
        if (j71 == 16) {
            j71 = this.errorContainerColor;
        }
        if (j73 == 16) {
            j73 = this.cursorColor;
        }
        if (j75 == 16) {
            j75 = this.errorCursorColor;
        }
        TextSelectionColors textSelectionColorsTakeOrElse$material3_release = takeOrElse$material3_release(textSelectionColors, new Function0<TextSelectionColors>() { // from class: androidx.compose.material3.TextFieldColors$copy$11
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final TextSelectionColors invoke() {
                return this.this$0.getTextSelectionColors();
            }
        });
        if (j44 == 16) {
            j44 = this.focusedIndicatorColor;
        }
        if (j45 == 16) {
            j45 = this.unfocusedIndicatorColor;
        }
        if (j46 == 16) {
            j46 = this.disabledIndicatorColor;
        }
        if (j47 == 16) {
            j47 = this.errorIndicatorColor;
        }
        if (j48 == 16) {
            j48 = this.focusedLeadingIconColor;
        }
        if (j49 == 16) {
            j49 = this.unfocusedLeadingIconColor;
        }
        if (j50 == 16) {
            j50 = this.disabledLeadingIconColor;
        }
        if (j51 == 16) {
            j51 = this.errorLeadingIconColor;
        }
        if (j52 == 16) {
            j52 = this.focusedTrailingIconColor;
        }
        if (j53 == 16) {
            j53 = this.unfocusedTrailingIconColor;
        }
        if (j54 == 16) {
            j54 = this.disabledTrailingIconColor;
        }
        if (j55 == 16) {
            j55 = this.errorTrailingIconColor;
        }
        if (j56 == 16) {
            j56 = this.focusedLabelColor;
        }
        if (j58 == 16) {
            j58 = this.unfocusedLabelColor;
        }
        if (j60 == 16) {
            j60 = this.disabledLabelColor;
        }
        if (j62 == 16) {
            j62 = this.errorLabelColor;
        }
        if (j64 == 16) {
            j64 = this.focusedPlaceholderColor;
        }
        if (j66 == 16) {
            j66 = this.unfocusedPlaceholderColor;
        }
        if (j68 == 16) {
            j68 = this.disabledPlaceholderColor;
        }
        if (j70 == 16) {
            j70 = this.errorPlaceholderColor;
        }
        if (j72 == 16) {
            j72 = this.focusedSupportingTextColor;
        }
        if (j74 == 16) {
            j74 = this.unfocusedSupportingTextColor;
        }
        if (j76 == 16) {
            j76 = this.disabledSupportingTextColor;
        }
        if (j77 == 16) {
            j77 = this.errorSupportingTextColor;
        }
        if (j78 == 16) {
            j78 = this.focusedPrefixColor;
        }
        if (j79 == 16) {
            j79 = this.unfocusedPrefixColor;
        }
        if (j80 == 16) {
            j80 = this.disabledPrefixColor;
        }
        if (j81 == 16) {
            j81 = this.errorPrefixColor;
        }
        if (j82 == 16) {
            j82 = this.focusedSuffixColor;
        }
        if (j83 == 16) {
            j83 = this.unfocusedSuffixColor;
        }
        if (j84 == 16) {
            j84 = this.disabledSuffixColor;
        }
        if (j85 == 16) {
            j85 = this.errorSuffixColor;
        }
        return new TextFieldColors(j57, j59, j61, j63, j65, j67, j69, j71, j73, j75, textSelectionColorsTakeOrElse$material3_release, j44, j45, j46, j47, j48, j49, j50, j51, j52, j53, j54, j55, j56, j58, j60, j62, j64, j66, j68, j70, j72, j74, j76, j77, j78, j79, j80, j81, j82, j83, j84, j85, null);
    }

    public final TextSelectionColors takeOrElse$material3_release(TextSelectionColors textSelectionColors, Function0<TextSelectionColors> function0) {
        return textSelectionColors == null ? function0.invoke() : textSelectionColors;
    }

    /* JADX INFO: renamed from: leadingIconColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m2675leadingIconColorXeAY9LY$material3_release(boolean z2, boolean z3, boolean z4) {
        if (!z2) {
            return this.disabledLeadingIconColor;
        }
        if (z3) {
            return this.errorLeadingIconColor;
        }
        if (z4) {
            return this.focusedLeadingIconColor;
        }
        return this.unfocusedLeadingIconColor;
    }

    /* JADX INFO: renamed from: trailingIconColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m2681trailingIconColorXeAY9LY$material3_release(boolean z2, boolean z3, boolean z4) {
        if (!z2) {
            return this.disabledTrailingIconColor;
        }
        if (z3) {
            return this.errorTrailingIconColor;
        }
        if (z4) {
            return this.focusedTrailingIconColor;
        }
        return this.unfocusedTrailingIconColor;
    }

    /* JADX INFO: renamed from: indicatorColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m2673indicatorColorXeAY9LY$material3_release(boolean z2, boolean z3, boolean z4) {
        if (!z2) {
            return this.disabledIndicatorColor;
        }
        if (z3) {
            return this.errorIndicatorColor;
        }
        if (z4) {
            return this.focusedIndicatorColor;
        }
        return this.unfocusedIndicatorColor;
    }

    /* JADX INFO: renamed from: containerColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m2628containerColorXeAY9LY$material3_release(boolean z2, boolean z3, boolean z4) {
        if (!z2) {
            return this.disabledContainerColor;
        }
        if (z3) {
            return this.errorContainerColor;
        }
        if (z4) {
            return this.focusedContainerColor;
        }
        return this.unfocusedContainerColor;
    }

    /* JADX INFO: renamed from: placeholderColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m2676placeholderColorXeAY9LY$material3_release(boolean z2, boolean z3, boolean z4) {
        if (!z2) {
            return this.disabledPlaceholderColor;
        }
        if (z3) {
            return this.errorPlaceholderColor;
        }
        if (z4) {
            return this.focusedPlaceholderColor;
        }
        return this.unfocusedPlaceholderColor;
    }

    /* JADX INFO: renamed from: labelColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m2674labelColorXeAY9LY$material3_release(boolean z2, boolean z3, boolean z4) {
        if (!z2) {
            return this.disabledLabelColor;
        }
        if (z3) {
            return this.errorLabelColor;
        }
        if (z4) {
            return this.focusedLabelColor;
        }
        return this.unfocusedLabelColor;
    }

    /* JADX INFO: renamed from: textColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m2680textColorXeAY9LY$material3_release(boolean z2, boolean z3, boolean z4) {
        if (!z2) {
            return this.disabledTextColor;
        }
        if (z3) {
            return this.errorTextColor;
        }
        if (z4) {
            return this.focusedTextColor;
        }
        return this.unfocusedTextColor;
    }

    /* JADX INFO: renamed from: supportingTextColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m2679supportingTextColorXeAY9LY$material3_release(boolean z2, boolean z3, boolean z4) {
        if (!z2) {
            return this.disabledSupportingTextColor;
        }
        if (z3) {
            return this.errorSupportingTextColor;
        }
        if (z4) {
            return this.focusedSupportingTextColor;
        }
        return this.unfocusedSupportingTextColor;
    }

    /* JADX INFO: renamed from: prefixColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m2677prefixColorXeAY9LY$material3_release(boolean z2, boolean z3, boolean z4) {
        if (!z2) {
            return this.disabledPrefixColor;
        }
        if (z3) {
            return this.errorPrefixColor;
        }
        if (z4) {
            return this.focusedPrefixColor;
        }
        return this.unfocusedPrefixColor;
    }

    /* JADX INFO: renamed from: suffixColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m2678suffixColorXeAY9LY$material3_release(boolean z2, boolean z3, boolean z4) {
        if (!z2) {
            return this.disabledSuffixColor;
        }
        if (z3) {
            return this.errorSuffixColor;
        }
        if (z4) {
            return this.focusedSuffixColor;
        }
        return this.unfocusedSuffixColor;
    }

    /* JADX INFO: renamed from: cursorColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m2630cursorColorvNxB06k$material3_release(boolean z2) {
        return z2 ? this.errorCursorColor : this.cursorColor;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof TextFieldColors)) {
            return false;
        }
        TextFieldColors textFieldColors = (TextFieldColors) obj;
        return Color.m4179equalsimpl0(this.focusedTextColor, textFieldColors.focusedTextColor) && Color.m4179equalsimpl0(this.unfocusedTextColor, textFieldColors.unfocusedTextColor) && Color.m4179equalsimpl0(this.disabledTextColor, textFieldColors.disabledTextColor) && Color.m4179equalsimpl0(this.errorTextColor, textFieldColors.errorTextColor) && Color.m4179equalsimpl0(this.focusedContainerColor, textFieldColors.focusedContainerColor) && Color.m4179equalsimpl0(this.unfocusedContainerColor, textFieldColors.unfocusedContainerColor) && Color.m4179equalsimpl0(this.disabledContainerColor, textFieldColors.disabledContainerColor) && Color.m4179equalsimpl0(this.errorContainerColor, textFieldColors.errorContainerColor) && Color.m4179equalsimpl0(this.cursorColor, textFieldColors.cursorColor) && Color.m4179equalsimpl0(this.errorCursorColor, textFieldColors.errorCursorColor) && Intrinsics.areEqual(this.textSelectionColors, textFieldColors.textSelectionColors) && Color.m4179equalsimpl0(this.focusedIndicatorColor, textFieldColors.focusedIndicatorColor) && Color.m4179equalsimpl0(this.unfocusedIndicatorColor, textFieldColors.unfocusedIndicatorColor) && Color.m4179equalsimpl0(this.disabledIndicatorColor, textFieldColors.disabledIndicatorColor) && Color.m4179equalsimpl0(this.errorIndicatorColor, textFieldColors.errorIndicatorColor) && Color.m4179equalsimpl0(this.focusedLeadingIconColor, textFieldColors.focusedLeadingIconColor) && Color.m4179equalsimpl0(this.unfocusedLeadingIconColor, textFieldColors.unfocusedLeadingIconColor) && Color.m4179equalsimpl0(this.disabledLeadingIconColor, textFieldColors.disabledLeadingIconColor) && Color.m4179equalsimpl0(this.errorLeadingIconColor, textFieldColors.errorLeadingIconColor) && Color.m4179equalsimpl0(this.focusedTrailingIconColor, textFieldColors.focusedTrailingIconColor) && Color.m4179equalsimpl0(this.unfocusedTrailingIconColor, textFieldColors.unfocusedTrailingIconColor) && Color.m4179equalsimpl0(this.disabledTrailingIconColor, textFieldColors.disabledTrailingIconColor) && Color.m4179equalsimpl0(this.errorTrailingIconColor, textFieldColors.errorTrailingIconColor) && Color.m4179equalsimpl0(this.focusedLabelColor, textFieldColors.focusedLabelColor) && Color.m4179equalsimpl0(this.unfocusedLabelColor, textFieldColors.unfocusedLabelColor) && Color.m4179equalsimpl0(this.disabledLabelColor, textFieldColors.disabledLabelColor) && Color.m4179equalsimpl0(this.errorLabelColor, textFieldColors.errorLabelColor) && Color.m4179equalsimpl0(this.focusedPlaceholderColor, textFieldColors.focusedPlaceholderColor) && Color.m4179equalsimpl0(this.unfocusedPlaceholderColor, textFieldColors.unfocusedPlaceholderColor) && Color.m4179equalsimpl0(this.disabledPlaceholderColor, textFieldColors.disabledPlaceholderColor) && Color.m4179equalsimpl0(this.errorPlaceholderColor, textFieldColors.errorPlaceholderColor) && Color.m4179equalsimpl0(this.focusedSupportingTextColor, textFieldColors.focusedSupportingTextColor) && Color.m4179equalsimpl0(this.unfocusedSupportingTextColor, textFieldColors.unfocusedSupportingTextColor) && Color.m4179equalsimpl0(this.disabledSupportingTextColor, textFieldColors.disabledSupportingTextColor) && Color.m4179equalsimpl0(this.errorSupportingTextColor, textFieldColors.errorSupportingTextColor) && Color.m4179equalsimpl0(this.focusedPrefixColor, textFieldColors.focusedPrefixColor) && Color.m4179equalsimpl0(this.unfocusedPrefixColor, textFieldColors.unfocusedPrefixColor) && Color.m4179equalsimpl0(this.disabledPrefixColor, textFieldColors.disabledPrefixColor) && Color.m4179equalsimpl0(this.errorPrefixColor, textFieldColors.errorPrefixColor) && Color.m4179equalsimpl0(this.focusedSuffixColor, textFieldColors.focusedSuffixColor) && Color.m4179equalsimpl0(this.unfocusedSuffixColor, textFieldColors.unfocusedSuffixColor) && Color.m4179equalsimpl0(this.disabledSuffixColor, textFieldColors.disabledSuffixColor) && Color.m4179equalsimpl0(this.errorSuffixColor, textFieldColors.errorSuffixColor);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((Color.m4185hashCodeimpl(this.focusedTextColor) * 31) + Color.m4185hashCodeimpl(this.unfocusedTextColor)) * 31) + Color.m4185hashCodeimpl(this.disabledTextColor)) * 31) + Color.m4185hashCodeimpl(this.errorTextColor)) * 31) + Color.m4185hashCodeimpl(this.focusedContainerColor)) * 31) + Color.m4185hashCodeimpl(this.unfocusedContainerColor)) * 31) + Color.m4185hashCodeimpl(this.disabledContainerColor)) * 31) + Color.m4185hashCodeimpl(this.errorContainerColor)) * 31) + Color.m4185hashCodeimpl(this.cursorColor)) * 31) + Color.m4185hashCodeimpl(this.errorCursorColor)) * 31) + this.textSelectionColors.hashCode()) * 31) + Color.m4185hashCodeimpl(this.focusedIndicatorColor)) * 31) + Color.m4185hashCodeimpl(this.unfocusedIndicatorColor)) * 31) + Color.m4185hashCodeimpl(this.disabledIndicatorColor)) * 31) + Color.m4185hashCodeimpl(this.errorIndicatorColor)) * 31) + Color.m4185hashCodeimpl(this.focusedLeadingIconColor)) * 31) + Color.m4185hashCodeimpl(this.unfocusedLeadingIconColor)) * 31) + Color.m4185hashCodeimpl(this.disabledLeadingIconColor)) * 31) + Color.m4185hashCodeimpl(this.errorLeadingIconColor)) * 31) + Color.m4185hashCodeimpl(this.focusedTrailingIconColor)) * 31) + Color.m4185hashCodeimpl(this.unfocusedTrailingIconColor)) * 31) + Color.m4185hashCodeimpl(this.disabledTrailingIconColor)) * 31) + Color.m4185hashCodeimpl(this.errorTrailingIconColor)) * 31) + Color.m4185hashCodeimpl(this.focusedLabelColor)) * 31) + Color.m4185hashCodeimpl(this.unfocusedLabelColor)) * 31) + Color.m4185hashCodeimpl(this.disabledLabelColor)) * 31) + Color.m4185hashCodeimpl(this.errorLabelColor)) * 31) + Color.m4185hashCodeimpl(this.focusedPlaceholderColor)) * 31) + Color.m4185hashCodeimpl(this.unfocusedPlaceholderColor)) * 31) + Color.m4185hashCodeimpl(this.disabledPlaceholderColor)) * 31) + Color.m4185hashCodeimpl(this.errorPlaceholderColor)) * 31) + Color.m4185hashCodeimpl(this.focusedSupportingTextColor)) * 31) + Color.m4185hashCodeimpl(this.unfocusedSupportingTextColor)) * 31) + Color.m4185hashCodeimpl(this.disabledSupportingTextColor)) * 31) + Color.m4185hashCodeimpl(this.errorSupportingTextColor)) * 31) + Color.m4185hashCodeimpl(this.focusedPrefixColor)) * 31) + Color.m4185hashCodeimpl(this.unfocusedPrefixColor)) * 31) + Color.m4185hashCodeimpl(this.disabledPrefixColor)) * 31) + Color.m4185hashCodeimpl(this.errorPrefixColor)) * 31) + Color.m4185hashCodeimpl(this.focusedSuffixColor)) * 31) + Color.m4185hashCodeimpl(this.unfocusedSuffixColor)) * 31) + Color.m4185hashCodeimpl(this.disabledSuffixColor)) * 31) + Color.m4185hashCodeimpl(this.errorSuffixColor);
    }
}
