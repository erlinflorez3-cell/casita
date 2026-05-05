package com.facebook.react.internal.featureflags;

import kotlin.Metadata;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00146B\u0005S4\u0012\u0006\u0007nj?OLe^.ZS0\u001b\u0002ڔd$\n#2FтY\u001a\f\"QU\\\u001a\u007fnx\\QWW\f$,\u0003,wW?qZ\u0015@v\b?aO6Q\u0002f\u0003k\u001d `X~\u000eM\u0007(a`\u0010%|\n_T\u0018>x\t:\u0001\u000f\u0014\u0019b\u0018\u0014w8\u0001L^.b~Nz\u0018R/Q\u00050V\u0017-mk\u0015M;H\u001b;U|oZC@e7[9\u001c\t\u0015\u0010s?1A8QMn5eCI\"Y|lH\u001a#jg\r\ftlpMWnL?+}e\u0012dV.\u0006<\u0014\rj\u0006T\u001aoN<o2f6\u0010y\t;YN\u0014\u001a^p\u0002Au~\u001d3DK+g\u001d-e*A'\u0014O{3\u000fd7It/\"l\u000e\u000f\u0017ah@W?\u0019X=vPPm\u0006s\u00129z\u0002X\u0006v[H5\nZF\u0017S9\"Mk'yL`D\u0016xKt1Yw\u001e`@Pp\\Kr\u000f\u001a'\\d3m\u0017h!2\u001f\u001b4T5\u007fN'hb\u0006\u000b9%>P\u0016|2p[-\"%]h}m7q\u001c(Q^a7\u0018wXg`H,?jdKl/Ha^r\\V$x\\3\u0016\u0006O\\N:\u0015xS:\"B\u0001I\u0019\u000b\u0017\u000f\u0017fHOR!_\tjV\u0013\u001dA2Y\u0002$#?1TjH\bg'\"r\u0011)(;\u001bi5G(\u001c61:\u000b}\u001f~\"\u0002\u000e{\u0015MZH.u\u0004}f*b?_\fU\u0013=\u0001oFJ3S*\u000be\u007fOX;C\u0003\bmSh\\iN~92nJbO\u0003\u0019h\u000b'x1h|\u007f(c\r\u000f\u0010ibls>wtIm\u0005TF_\u001d\u001fL'G\u0004j\u0003C\u0011['K\u0018>(w\u001boB\u0002o\\{)#nzsiDcDq)e.BI9a[\u0015=P&CÚN\u05f8ny\u0010B\u00177]CVE|rl7{\r\u0006̑r¡0\u000fxVi=c\u007f\f9Fa@rq\u007fjٮOѼ\u0015O[g{p\u001cl\u0019P'\f!z_phΕI֕ZYj\t>\tD(DHSd\u001b;7&\u000bɹHޭ\u000fE\\i\u0014\u0013K\u0010Tg'\u0019HA\"=-\u0558`ܢ`XP\u0005nH118\n\u0017\u0011I\u001d'7\b܍yܑX1k2\u000fVm\u0019)tg\u0001|$YF+ڦ'Ϝ\\\u0003\u0013EkF\u001a\u0012D\u000f_+\u0004j\u001e\u000e\u000f\u0091\tܫF\u001a#9_\u00140\u0007>j#WzM\u0013xhש^Ƭ&+\u0007z\u000b\u0011\r\u001a\u001d\u00181Q\tn\u0011/#Ϙ\u0004̢G\u001c\t\u0017R,W\u001c\u000bq^\u001dC\u0005c/\u0014ƙv͂+}_SI\u0001X0.6\u001cv7[\u0006\u0010=ōiΌ>\u0018y\u0016p\u0005Y#^0\u001c0`s!\f\u0005ýBс\u00065\n\u0013l\\<\b/Q?-\u0003\u0005pM?ǐ\u0016ʋpevU\u0019\u00067Ad\f\u0007/f\u001c7)$ܛ\u001f͠^<\u0019S.[a\u0010\"(>!L\u0007\u0011+f˙o\u05cftmW[\u001b.\u007f{8uI2h\u001d,!PǤ\u0010ցX*\u001d;dP\u000ft\u0017q\u0005Dm\r\rl~˲\u0001צ-\u0016\u0005~Vaa#B\\\u000b z.e\u001buʽ\u0019Ӵd\t\fEW)qA`V39H\n\u001e*M֮\u000f̯fv\b*P\fC\u0010uDEHj<H)0ށy҉\u0007(SEFEX<\u001f')1p7N@3Ӎ(ՀU5I\u0019\u001f\u0004eH\u0014\n\u001f\u001bKi\u007fU{ܼ\rϘ\u0005\u000fGy?n\u000b\u0004E\u000e;1%nIY=ձ1̂iN/\f\u0010h\u001b\u000f[\u007fn\u0011w+w7\u001cɍ\u0006ߝD\u0002\u0012\u001f2'V\u00061\u001d]3^)\u000e^\u0017ѵ\u007fӵ\b(26|GsWz\u0017\f\fBhFu;՚mƍE|\u001c\u0019RAz=z&]O~x9FcҸ ʁ\u0013\b13%\u007f`_\u007f`CK\tL]^4٭\u001fű\b<:aD|\u0018PgK\u001e/(S\u0012lA҆]̼\u0014:\u001a\r\u001b\u0007HA`\u0003\u0018b3\u0017UMM˲B̊|OIb\u0019C_4lQZ\u000e!\u0005D0\u001fǉ\u000eҍNb\u001d\u0013AJDQU6n}7\u001c?]{̸1ڃnIGU\u007f[\u000eIA0\u0006Ln4\u0014^[Ǽ-ʢh-\u001d\u007fx.~Wdd2,n\u0005<G;Э\u001cͭ|F0m>3\u0001`\r\u0002[_\u0017\u001bM?,Ǡqܢ6d?[r\u0014{Ge\u0017jW9,'\u0004Y\u07b3Më\u0017\r&SG5s\u0004\u001bZV}\u001e[wWS˺Uˀ\u0007cR!=\t\u0010?Ou\u0005X{>GY\u0016ֺ\u0018ԯ+&\u000e\u00132e8#w9:a\u0019KdX\u007fڲWá\u0015hJj\u001d}E\u001c<8PW\u001c<4\u00139ɒAņcB4.~\f\u0018_x)Bg\u0006e#[$Қ7ݕ\u001d@9q\u001ff o\"\u001di^n=EY|Ď\u001f̎\u001e\u001f.a\nKy@%\u0005{o\u0001r\u0003bgס@ɬ4f\u0002rtg\u000fsLl`n/e}\u007fqЭPС\rbxHO\u00133|:XNJ\u0001\u0018/\u0003\"ڜ#ֲ;F~#u6ؤ&H"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7ED\n&\u0017Tx\nC@&5U\r0Dm\u00175IEI5!\u001e\u0011fp\"\u0003r0_v\bGH]<iRSD\u0010\u0014hka>h\u0003WA2|NDt", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7ED\n&\u0017Tx\nC@&5U\r0Dm\u00175IEI5!\u001e\u0011fp\"\u0003r0_v\bGH]<iRSD\u0010\u0014hiL)\r\u0013gK1D", "u(E", "0`c0[\u0019>\\\u0018~\bb5~x:d{7{Nd vXo\u0017K]/?d[\u001c5p\u0016", "", "\u001aiPCTuEO\"\u0001D;6\u0007\u0010/a\t}", "1n\\:b5-S'\u000e[e(~f+c\u0003(", "1n\\=_,MS\u0006~v\\;`\u0012=t{1y@^$\u0017C~\u0012F\u007f\u000f>6\u007f\u000f:z\u0016*L-DG=\u001d\"re8d_*Qv", "2dbAe6R4\u0015{\bb*j\u0019<f{&{Nd \u0004Gk\fKZ.Chy)5m}*V?=kA{\u0011fd9", "3mP/_,\u001aZ\u001d\u0001\u0004B;|\u0011=B{6{G\u0005 \u00171xn8s29Wa\n%K\u0012,PC", "3mP/_,\u001a\\\u0018\f\u0005b+d\rBB\u0007(\u0005?h!\u0016GZ\u001bF\u0002\u00031W\u0001 ", "3mP/_,\u001bO\u0017\u0005|k6\r\u0012.S\u000f<\u0003@\\\"\"Ns\f8\u0006/B7y\u001e:m", "3mP/_,\u001cZ\u0019z\u0004M,\u0010\u0018\u0013n\u000b8\u000b4\u000b\u0019\u00130y\r<T!3\\}", "3mP/_,\u001eO\u001b~\bK6\u0007\u0018 i\u007f:WO\u0010\u0013\u0015Jw\u000eE\u0006\u00031W\u0001 ", "3mP/_,\u001ed\u0019\b\n>4\u0001\u0018>e\r\u0015{O\u0001 &Ky\u0017\u001b\u000729b\u007f\u00027{%>ZCIU=y\u001egnC\u000bb\nJt*G", "3mP/_,\u001fO\u0016\f~\\\u0013\u0007\u000b=C{&~@", "3mP/_,\u001fO\u0016\f~\\\u0019|\u0012.e\r(\t \u0014\u0015\u001eW}\u0012Mv,I7y\u001e:m", "3mP/_, `\u0015\b\u000be(\nv2a~2\u000e/\u000e\u0017\u00175~\nKv\u00125W\b)5q\u001d2IR?u={\u0011fd9", "3mP/_,\"=\u0007o~^>Z\u00103pn2f<\u007f\u0016\u001bPqjF\n\u00031W\u0001 ", "3mP/_,%O-\t\u000bm\b\u0006\r7a\u000f,\u0006I\u000f\u0001 +Y{\u001ar#8Y", "3mP/_,%]\"\u0001iZ:\u0003d\u001aI]$yC\u0001", "3mP/_,&W\u0017\f\u0005m(\u000b\u000f=C{&~@", "3mP/_,)`#\n\tN7{\u0005>el(yJ\n\u0015\u001bNs\nKz/>5\u0007\u001fDw\u001a-+?9n4", "3mP/_,+S$\t\bm\f\u000e\t8tj$\u007fI\u0010\u0006\u001bOok8t(5", "3mP/_,,g\"|}k6\u0006\u0013?sm7wO\u0001\u0007\"Fk\u001d<\u0005\u00031W\u0001 ", "3mP/_,.7v\t\u0004l0\u000b\u0018/n}<Y<~\u001a\u0017", "3mP/_,/W\u0019\u0011g^*\u0011\u00076i\t*Y<~\u001a\u0017", "3wR9h+>G#\u0001v?9\u0007\u0011\u001ca\u0012\u0013\tJ\f%tCm\u0011<", "4dc0[\u0010FO\u001b~\tB5m\r/wj5{<\b\u001e!Ek\u001d@\u0001.\u0013U{#7", "4hg\u0016a*H`&~xm\u001az\u00169l\u0007\u0019\u007f@\u0013\u0005&C~\u000e,\u0002$1h}\n@I\u001f-ZM?j\u0012\u001a\u0013ka", "4hg\u001aT7IW\"\u0001d_\f\u000e\t8tj5\u007fJ\u000e\u001b&Ko\u001c\u0019v4GY})\u0018i\u0013;QA\u0017t3\u000b\u0015d_Hd_*Qv", "4hg\u001a\\:LS\u0018_v[9\u0001\u0007\u001dt{7{0\f\u0016\u0013Vo\u001c&\u007f\u0001>X\u000b*;ls*KF;", "4hg\u001ab<Gb\u001d\b|<6\u0007\u0016.i\t$\u000bJ\u000e\u0004\u0017Ry\u001bKv$ Y\u0007\u001f;v\u0018\u001dZ?Dy0\u001c$lkB\u0015M5*\u007f&TVR+:Np@\u0014", "4na0X\t:b\u0017\u0002~g.d\u0013?n\u000f\f\u000b@\t%\u0001PK\u0017;\u0004/9X[\u001c5p\u0016", "4tb2U6Q3\"zwe,{g/b\u0010*Y<~\u001a\u0017", "4tb2U6Q3\"zwe,{u/l\u007f$\n@^\u0013\u0015Jo", "7mXA8(@S&m\u000bk)\u0007p9d\u0010/{Nj \u007fC~\u0012Mv\r?X\u000e'7{\u0002>MS;G=\u001d\"re8d_*Qv", ":`iF45B[\u0015\u000e~h5Z\u00056l|$yF\u000ft\u0013Er\u000e", ":nP1I,<b#\fYk(\u000f\u0005,l\u007f6eId\u001f\u0013Io\u001c\u001ar#8Y", "Adc\u000ea+K]\u001d}aZ@\u0007\u0019>D\u00045{>\u0010\u001b!PM\n:y%", "BqP0X\u001bN`\u0016\tbh+\r\u0010/P\r2\u0004D\u000f\u0017\u0004Gt\u000e:\u0006)?b\f\n@I\u001f-ZM?j\u0012\u001a\u0013ka", "CrT\u0013T)KW\u0017b\u0004m,\n\u0013:C{&~@", "CrT\u0016`4>R\u001dz\n^\f\u0010\t-u\u000f2\t$\nr F|\u0018@u\u0002B]|\"7t\u0016<[!7i7\u001e", "CrT\u001ab+>`\"k\u000bg;\u0001\u0011/S}+{?\u0011\u001e\u0017TM\n:y%", "CrT\u001bT;Bd\u0019o~^>Z\u00138f\u0004*\n$\ns$Kn\u0010<}%Cge*6ms*KF;", "CrT\u001bX>+S\u0015|\nB4x\u000b/V\u0004(\u000e\u001d|\u0015\u001dI|\u0018L\u007f$\u0014fy2;v\u0018\fIA>k", "CrT\u001cc;B[\u001d\rz]\u001d\u0001\tAP\r(wG\b!\u0015C~\u0012F\u007f\u000f>5\u0007\u001fDw\u001a-+?9n4", "CrT\u001cc;B[\u001d\u0014z]\f\u000e\t8t\\$\u000b>\u0004\u001b IY\u0017\u0018\u007f$Bc\u0002\u001f\u0015i\u00141M", "CrT\u001fh5MW!~ha({\u0013AN\n'{-\u0001\u0018\u0017To\u0017:v\u0015@Xy/7K\u0012,PC", "CrT\u001fh5MW!~ha({\u0013AN\n'{-\u0001\u0018\u0017To\u0017:v\u0015@Xy/7W\u001f\u0015IWE{C{\u0011fd9", "CrT g(MSt\u0006~`5\u0005\t8tg(yC| \u001bUwk8t(5", "CrT!h9;]\u0001\tyn3|l8t\u007f5\u0006K^\u0013\u0015Jo", "0`c0[\u0019>\\\u0018~\bb5~x:d{7{Nd vXo\u0017K]/?d", "1n\\:b5-S'\u000e[e(~", "1n\\=_,MS\u0006~v\\;`\u0012=t{1y@^$\u0017C~\u0012F\u007f\u000f>6\u007f\u000f:z\u0016*L-DG=\u001d\"re8", "2`]4X9Hc'\u0006\u000fK,\u000b\t>", "", "2dbAe6R4\u0015{\bb*j\u0019<f{&{Nd \u0004Gk\fKZ.Chy)5m}*V?=kA", "3mP/_,\u001aZ\u001d\u0001\u0004B;|\u0011=B{6{G\u0005 \u00171xn8s29Wa\n%", "3mP/_,\u001a\\\u0018\f\u0005b+d\rBB\u0007(\u0005?h!\u0016GZ\u001bF\u0002", "3mP/_,\u001bO\u0017\u0005|k6\r\u0012.S\u000f<\u0003@\\\"\"Ns\f8\u0006/B", "3mP/_,\u001cZ\u0019z\u0004M,\u0010\u0018\u0013n\u000b8\u000b4\u000b\u0019\u00130y\r<", "3mP/_,\u001eO\u001b~\bK6\u0007\u0018 i\u007f:WO\u0010\u0013\u0015Jw\u000eE\u0006", "3mP/_,\u001ed\u0019\b\n>4\u0001\u0018>e\r\u0015{O\u0001 &Ky\u0017\u001b\u000729b\u007f\u00027{%>ZCIU=y\u001egnC\u000bb", "3mP/_,\u001fO\u0016\f~\\\u0013\u0007\u000b=", "3mP/_,\u001fO\u0016\f~\\\u0019|\u0012.e\r(\t \u0014\u0015\u001eW}\u0012Mv,I", "3mP/_, `\u0015\b\u000be(\nv2a~2\u000e/\u000e\u0017\u00175~\nKv\u00125W\b)5q\u001d2IR?u=", "3mP/_,\"=\u0007o~^>Z\u00103pn2f<\u007f\u0016\u001bPqjF\n", "3mP/_,%O-\t\u000bm\b\u0006\r7a\u000f,\u0006I\u000f\u0001 +Y{", "3mP/_,%]\"\u0001iZ:\u0003d\u001aI", "3mP/_,&W\u0017\f\u0005m(\u000b\u000f=", "3mP/_,)`#\n\tN7{\u0005>el(yJ\n\u0015\u001bNs\nKz/>5\u0007\u001fDw\u001a-", "3mP/_,+S$\t\bm\f\u000e\t8tj$\u007fI\u0010\u0006\u001bOo", "3mP/_,,g\"|}k6\u0006\u0013?sm7wO\u0001\u0007\"Fk\u001d<\u0005", "3mP/_,.7v\t\u0004l0\u000b\u0018/n}<", "3mP/_,/W\u0019\u0011g^*\u0011\u00076i\t*", "3wR9h+>G#\u0001v?9\u0007\u0011\u001ca\u0012\u0013\tJ\f%", "4dc0[\u0010FO\u001b~\tB5m\r/wj5{<\b\u001e!Ek\u001d@\u0001.", "4hg\u0016a*H`&~xm\u001az\u00169l\u0007\u0019\u007f@\u0013\u0005&C~\u000e,\u0002$1h}\n@I\u001f-ZM?j", "4hg\u001aT7IW\"\u0001d_\f\u000e\t8tj5\u007fJ\u000e\u001b&Ko\u001c\u0019v4GY})\u0018i\u0013;QA\u0017t3\u000b\u0015d_H", "4hg\u001a\\:LS\u0018_v[9\u0001\u0007\u001dt{7{0\f\u0016\u0013Vo\u001c&\u007f\u0001>X\u000b*;l", "4hg\u001ab<Gb\u001d\b|<6\u0007\u0016.i\t$\u000bJ\u000e\u0004\u0017Ry\u001bKv$ Y\u0007\u001f;v\u0018\u001dZ?Dy0\u001c$lkB\u0015M5*\u007f&TVR+", "4na0X\t:b\u0017\u0002~g.d\u0013?n\u000f\f\u000b@\t%\u0001PK\u0017;\u0004/9X", "4tb2U6Q3\"zwe,{g/b\u0010*", "4tb2U6Q3\"zwe,{u/l\u007f$\n@", "7mXA8(@S&m\u000bk)\u0007p9d\u0010/{Nj \u007fC~\u0012Mv\r?X\u000e'7{\u0002>MS;G=\u001d\"re8", ":`iF45B[\u0015\u000e~h5Z\u00056l|$yF\u000f", ":nP1I,<b#\fYk(\u000f\u0005,l\u007f6eId\u001f\u0013Io\u001c", "=uT?e0=S", ">q^C\\+>`", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7ED\n&\u0017Tx\nC@&5U\r0Dm\u00175IEI5!\u001e\u0011fp\"\u0003r0_v\bGH]<iRSD\u0010\u0014hx[5\u001e\tXA1D", "Adc\u000ea+K]\u001d}aZ@\u0007\u0019>D\u00045{>\u0010\u001b!P", "BqP0X\u001bN`\u0016\tbh+\r\u0010/P\r2\u0004D\u000f\u0017\u0004Gt\u000e:\u0006)?b\f\n@I\u001f-ZM?j", "CrT\u0013T)KW\u0017b\u0004m,\n\u0013:", "CrT\u0016`4>R\u001dz\n^\f\u0010\t-u\u000f2\t$\nr F|\u0018@u\u0002B]|\"7t\u0016<[", "CrT\u001ab+>`\"k\u000bg;\u0001\u0011/S}+{?\u0011\u001e\u0017T", "CrT\u001bT;Bd\u0019o~^>Z\u00138f\u0004*\n$\ns$Kn\u0010<}%Cge*6m", "CrT\u001bX>+S\u0015|\nB4x\u000b/V\u0004(\u000e\u001d|\u0015\u001dI|\u0018L\u007f$\u0014fy2;v\u0018", "CrT\u001cc;B[\u001d\rz]\u001d\u0001\tAP\r(wG\b!\u0015C~\u0012F\u007f\u000f>5\u0007\u001fDw\u001a-", "CrT\u001cc;B[\u001d\u0014z]\f\u000e\t8t\\$\u000b>\u0004\u001b IY\u0017\u0018\u007f$Bc\u0002\u001f", "CrT\u001fh5MW!~ha({\u0013AN\n'{-\u0001\u0018\u0017To\u0017:v\u0015@Xy/7", "CrT\u001fh5MW!~ha({\u0013AN\n'{-\u0001\u0018\u0017To\u0017:v\u0015@Xy/7W\u001f\u0015IWE{C", "CrT g(MSt\u0006~`5\u0005\t8tg(yC| \u001bUw", "CrT!h9;]\u0001\tyn3|l8t\u007f5\u0006K", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ReactNativeFeatureFlagsCxxAccessor implements ReactNativeFeatureFlagsAccessor {
    private Boolean batchRenderingUpdatesInEventLoopCache;
    private Boolean commonTestFlagCache;
    private Boolean completeReactInstanceCreationOnBgThreadOnAndroidCache;
    private Boolean destroyFabricSurfacesInReactInstanceManagerCache;
    private Boolean enableAlignItemsBaselineOnFabricIOSCache;
    private Boolean enableAndroidMixBlendModePropCache;
    private Boolean enableBackgroundStyleApplicatorCache;
    private Boolean enableCleanTextInputYogaNodeCache;
    private Boolean enableEagerRootViewAttachmentCache;
    private Boolean enableEventEmitterRetentionDuringGesturesOnAndroidCache;
    private Boolean enableFabricLogsCache;
    private Boolean enableFabricRendererExclusivelyCache;
    private Boolean enableGranularShadowTreeStateReconciliationCache;
    private Boolean enableIOSViewClipToPaddingBoxCache;
    private Boolean enableLayoutAnimationsOnIOSCache;
    private Boolean enableLongTaskAPICache;
    private Boolean enableMicrotasksCache;
    private Boolean enablePropsUpdateReconciliationAndroidCache;
    private Boolean enableReportEventPaintTimeCache;
    private Boolean enableSynchronousStateUpdatesCache;
    private Boolean enableUIConsistencyCache;
    private Boolean enableViewRecyclingCache;
    private Boolean excludeYogaFromRawPropsCache;
    private Boolean fetchImagesInViewPreallocationCache;
    private Boolean fixIncorrectScrollViewStateUpdateOnAndroidCache;
    private Boolean fixMappingOfEventPrioritiesBetweenFabricAndReactCache;
    private Boolean fixMissedFabricStateUpdatesOnAndroidCache;
    private Boolean fixMountingCoordinatorReportedPendingTransactionsOnAndroidCache;
    private Boolean forceBatchingMountItemsOnAndroidCache;
    private Boolean fuseboxEnabledDebugCache;
    private Boolean fuseboxEnabledReleaseCache;
    private Boolean initEagerTurboModulesOnNativeModulesQueueAndroidCache;
    private Boolean lazyAnimationCallbacksCache;
    private Boolean loadVectorDrawablesOnImagesCache;
    private Boolean setAndroidLayoutDirectionCache;
    private Boolean traceTurboModulePromiseRejectionsOnAndroidCache;
    private Boolean useFabricInteropCache;
    private Boolean useImmediateExecutorInAndroidBridgelessCache;
    private Boolean useModernRuntimeSchedulerCache;
    private Boolean useNativeViewConfigsInBridgelessModeCache;
    private Boolean useNewReactImageViewBackgroundDrawingCache;
    private Boolean useOptimisedViewPreallocationOnAndroidCache;
    private Boolean useOptimizedEventBatchingOnAndroidCache;
    private Boolean useRuntimeShadowNodeReferenceUpdateCache;
    private Boolean useRuntimeShadowNodeReferenceUpdateOnLayoutCache;
    private Boolean useStateAlignmentMechanismCache;
    private Boolean useTurboModuleInteropCache;

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean batchRenderingUpdatesInEventLoop() {
        Boolean boolValueOf = this.batchRenderingUpdatesInEventLoopCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.batchRenderingUpdatesInEventLoop());
            this.batchRenderingUpdatesInEventLoopCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean commonTestFlag() {
        Boolean boolValueOf = this.commonTestFlagCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.commonTestFlag());
            this.commonTestFlagCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean completeReactInstanceCreationOnBgThreadOnAndroid() {
        Boolean boolValueOf = this.completeReactInstanceCreationOnBgThreadOnAndroidCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.completeReactInstanceCreationOnBgThreadOnAndroid());
            this.completeReactInstanceCreationOnBgThreadOnAndroidCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsAccessor
    public void dangerouslyReset() {
        ReactNativeFeatureFlagsCxxInterop.dangerouslyReset();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean destroyFabricSurfacesInReactInstanceManager() {
        Boolean boolValueOf = this.destroyFabricSurfacesInReactInstanceManagerCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.destroyFabricSurfacesInReactInstanceManager());
            this.destroyFabricSurfacesInReactInstanceManagerCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableAlignItemsBaselineOnFabricIOS() {
        Boolean boolValueOf = this.enableAlignItemsBaselineOnFabricIOSCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableAlignItemsBaselineOnFabricIOS());
            this.enableAlignItemsBaselineOnFabricIOSCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableAndroidMixBlendModeProp() {
        Boolean boolValueOf = this.enableAndroidMixBlendModePropCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableAndroidMixBlendModeProp());
            this.enableAndroidMixBlendModePropCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableBackgroundStyleApplicator() {
        Boolean boolValueOf = this.enableBackgroundStyleApplicatorCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableBackgroundStyleApplicator());
            this.enableBackgroundStyleApplicatorCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableCleanTextInputYogaNode() {
        Boolean boolValueOf = this.enableCleanTextInputYogaNodeCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableCleanTextInputYogaNode());
            this.enableCleanTextInputYogaNodeCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableEagerRootViewAttachment() {
        Boolean boolValueOf = this.enableEagerRootViewAttachmentCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableEagerRootViewAttachment());
            this.enableEagerRootViewAttachmentCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableEventEmitterRetentionDuringGesturesOnAndroid() {
        Boolean boolValueOf = this.enableEventEmitterRetentionDuringGesturesOnAndroidCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableEventEmitterRetentionDuringGesturesOnAndroid());
            this.enableEventEmitterRetentionDuringGesturesOnAndroidCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableFabricLogs() {
        Boolean boolValueOf = this.enableFabricLogsCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableFabricLogs());
            this.enableFabricLogsCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableFabricRendererExclusively() {
        Boolean boolValueOf = this.enableFabricRendererExclusivelyCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableFabricRendererExclusively());
            this.enableFabricRendererExclusivelyCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableGranularShadowTreeStateReconciliation() {
        Boolean boolValueOf = this.enableGranularShadowTreeStateReconciliationCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableGranularShadowTreeStateReconciliation());
            this.enableGranularShadowTreeStateReconciliationCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableIOSViewClipToPaddingBox() {
        Boolean boolValueOf = this.enableIOSViewClipToPaddingBoxCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableIOSViewClipToPaddingBox());
            this.enableIOSViewClipToPaddingBoxCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableLayoutAnimationsOnIOS() {
        Boolean boolValueOf = this.enableLayoutAnimationsOnIOSCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableLayoutAnimationsOnIOS());
            this.enableLayoutAnimationsOnIOSCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableLongTaskAPI() {
        Boolean boolValueOf = this.enableLongTaskAPICache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableLongTaskAPI());
            this.enableLongTaskAPICache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableMicrotasks() {
        Boolean boolValueOf = this.enableMicrotasksCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableMicrotasks());
            this.enableMicrotasksCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enablePropsUpdateReconciliationAndroid() {
        Boolean boolValueOf = this.enablePropsUpdateReconciliationAndroidCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enablePropsUpdateReconciliationAndroid());
            this.enablePropsUpdateReconciliationAndroidCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableReportEventPaintTime() {
        Boolean boolValueOf = this.enableReportEventPaintTimeCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableReportEventPaintTime());
            this.enableReportEventPaintTimeCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableSynchronousStateUpdates() {
        Boolean boolValueOf = this.enableSynchronousStateUpdatesCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableSynchronousStateUpdates());
            this.enableSynchronousStateUpdatesCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableUIConsistency() {
        Boolean boolValueOf = this.enableUIConsistencyCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableUIConsistency());
            this.enableUIConsistencyCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableViewRecycling() {
        Boolean boolValueOf = this.enableViewRecyclingCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableViewRecycling());
            this.enableViewRecyclingCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean excludeYogaFromRawProps() {
        Boolean boolValueOf = this.excludeYogaFromRawPropsCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.excludeYogaFromRawProps());
            this.excludeYogaFromRawPropsCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fetchImagesInViewPreallocation() {
        Boolean boolValueOf = this.fetchImagesInViewPreallocationCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.fetchImagesInViewPreallocation());
            this.fetchImagesInViewPreallocationCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fixIncorrectScrollViewStateUpdateOnAndroid() {
        Boolean boolValueOf = this.fixIncorrectScrollViewStateUpdateOnAndroidCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.fixIncorrectScrollViewStateUpdateOnAndroid());
            this.fixIncorrectScrollViewStateUpdateOnAndroidCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fixMappingOfEventPrioritiesBetweenFabricAndReact() {
        Boolean boolValueOf = this.fixMappingOfEventPrioritiesBetweenFabricAndReactCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.fixMappingOfEventPrioritiesBetweenFabricAndReact());
            this.fixMappingOfEventPrioritiesBetweenFabricAndReactCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fixMissedFabricStateUpdatesOnAndroid() {
        Boolean boolValueOf = this.fixMissedFabricStateUpdatesOnAndroidCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.fixMissedFabricStateUpdatesOnAndroid());
            this.fixMissedFabricStateUpdatesOnAndroidCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fixMountingCoordinatorReportedPendingTransactionsOnAndroid() {
        Boolean boolValueOf = this.fixMountingCoordinatorReportedPendingTransactionsOnAndroidCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.fixMountingCoordinatorReportedPendingTransactionsOnAndroid());
            this.fixMountingCoordinatorReportedPendingTransactionsOnAndroidCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean forceBatchingMountItemsOnAndroid() {
        Boolean boolValueOf = this.forceBatchingMountItemsOnAndroidCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.forceBatchingMountItemsOnAndroid());
            this.forceBatchingMountItemsOnAndroidCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fuseboxEnabledDebug() {
        Boolean boolValueOf = this.fuseboxEnabledDebugCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.fuseboxEnabledDebug());
            this.fuseboxEnabledDebugCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fuseboxEnabledRelease() {
        Boolean boolValueOf = this.fuseboxEnabledReleaseCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.fuseboxEnabledRelease());
            this.fuseboxEnabledReleaseCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean initEagerTurboModulesOnNativeModulesQueueAndroid() {
        Boolean boolValueOf = this.initEagerTurboModulesOnNativeModulesQueueAndroidCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.initEagerTurboModulesOnNativeModulesQueueAndroid());
            this.initEagerTurboModulesOnNativeModulesQueueAndroidCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean lazyAnimationCallbacks() {
        Boolean boolValueOf = this.lazyAnimationCallbacksCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.lazyAnimationCallbacks());
            this.lazyAnimationCallbacksCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean loadVectorDrawablesOnImages() {
        Boolean boolValueOf = this.loadVectorDrawablesOnImagesCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.loadVectorDrawablesOnImages());
            this.loadVectorDrawablesOnImagesCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsAccessor
    public void override(ReactNativeFeatureFlagsProvider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        ReactNativeFeatureFlagsCxxInterop.override(provider);
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean setAndroidLayoutDirection() {
        Boolean boolValueOf = this.setAndroidLayoutDirectionCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.setAndroidLayoutDirection());
            this.setAndroidLayoutDirectionCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean traceTurboModulePromiseRejectionsOnAndroid() {
        Boolean boolValueOf = this.traceTurboModulePromiseRejectionsOnAndroidCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.traceTurboModulePromiseRejectionsOnAndroid());
            this.traceTurboModulePromiseRejectionsOnAndroidCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useFabricInterop() {
        Boolean boolValueOf = this.useFabricInteropCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useFabricInterop());
            this.useFabricInteropCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useImmediateExecutorInAndroidBridgeless() {
        Boolean boolValueOf = this.useImmediateExecutorInAndroidBridgelessCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useImmediateExecutorInAndroidBridgeless());
            this.useImmediateExecutorInAndroidBridgelessCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useModernRuntimeScheduler() {
        Boolean boolValueOf = this.useModernRuntimeSchedulerCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useModernRuntimeScheduler());
            this.useModernRuntimeSchedulerCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useNativeViewConfigsInBridgelessMode() {
        Boolean boolValueOf = this.useNativeViewConfigsInBridgelessModeCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useNativeViewConfigsInBridgelessMode());
            this.useNativeViewConfigsInBridgelessModeCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useNewReactImageViewBackgroundDrawing() {
        Boolean boolValueOf = this.useNewReactImageViewBackgroundDrawingCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useNewReactImageViewBackgroundDrawing());
            this.useNewReactImageViewBackgroundDrawingCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useOptimisedViewPreallocationOnAndroid() {
        Boolean boolValueOf = this.useOptimisedViewPreallocationOnAndroidCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useOptimisedViewPreallocationOnAndroid());
            this.useOptimisedViewPreallocationOnAndroidCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useOptimizedEventBatchingOnAndroid() {
        Boolean boolValueOf = this.useOptimizedEventBatchingOnAndroidCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useOptimizedEventBatchingOnAndroid());
            this.useOptimizedEventBatchingOnAndroidCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useRuntimeShadowNodeReferenceUpdate() {
        Boolean boolValueOf = this.useRuntimeShadowNodeReferenceUpdateCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useRuntimeShadowNodeReferenceUpdate());
            this.useRuntimeShadowNodeReferenceUpdateCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useRuntimeShadowNodeReferenceUpdateOnLayout() {
        Boolean boolValueOf = this.useRuntimeShadowNodeReferenceUpdateOnLayoutCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useRuntimeShadowNodeReferenceUpdateOnLayout());
            this.useRuntimeShadowNodeReferenceUpdateOnLayoutCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useStateAlignmentMechanism() {
        Boolean boolValueOf = this.useStateAlignmentMechanismCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useStateAlignmentMechanism());
            this.useStateAlignmentMechanismCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useTurboModuleInterop() {
        Boolean boolValueOf = this.useTurboModuleInteropCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useTurboModuleInterop());
            this.useTurboModuleInteropCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }
}
