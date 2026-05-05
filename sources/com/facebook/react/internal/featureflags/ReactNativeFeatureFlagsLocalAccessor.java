package com.facebook.react.internal.featureflags;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
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
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u0016DLcz\u0004I\u0006>,6B\r.4ߚ\u007f\u0007tsA0JgP.hS2\u000fq*<$i$yCA\u00030ԂR\t}M(jĔNZ\u0019CW\f$0\u0003,wZ?qZ\u0015@z\b?aR6Q\u0002f\u0003o\u001d `'~\u000eM\u0007(d`\u0010%6\n_T\u0018>|\t:\u0001\u0012\u0014\u0019b\u0018\u0014{8\u0001La.b~Nz\u001cR/Q\b0V\u0017-mo\u0015M;K\u001b;U|o^C@e:[9\u001c\t\u0015\u0014s?1D8QMn5iCI\"\\|lH\u001a#ng\r\fwlpMWnP?+}h\u0012dV.\u0006@\u0014\rj\tT\u001aoN<s2f6\u0013y\t;YN\u0018\u001a^p\u0005Au~\u001d3HK+g -e*A'\u0018O{3\u0012d7It/&l\u000e\u000f\u001aah@W?\u001dX=vSPm\u0006s\u0012=z\u0002X\tv[H5\n^F\u0017S<\"Mk'yP`D\u0016{Kt1Yw\"`@Ps\\Kr\u000f\u001a+\\d3p\u0017h!2\u001f\u001f4T5\u0003N'hb\u0006\u000f9%>S\u0016|2p[1\"%]k}m7q\u001c,Q^a:\u0018wXg`L,?jgKl/Habr\\V'x\\3\u0016\u0006S\\N:\u0018xS:\"B\u0005I\u0019\u000b\u001a\u000f\u0017fHOV!_\tmV\u0013\u001d92]\u0002$#\u000eGd%~}C\u0011IZ8\u0011&;\u001ei5G0\u001c61:\u000b\u0001\u001f~\"\u0005\u000e{\u0015MZK.u\u0004\u0001f*b?_\u000fU\u0013=\u0004oFJ3S-\u000be\u007fRX;C\u0003\bpSh\\lN~92nMbO\u0003\u001ch\u000b'x1k|\u007f(f\r\u000f\u0010ibos>wwIm\u0005TFb\u001d\u001fL*G\u0004j\u0003C\u0014['K\u001b>(w\u001boE\u0002o\\~)#nzslDcDt)e&8I\"aY-Ch8=\u0015PI\u0003}\u0018D\u00194;6vC;ݨXиQ\u000b7̎7\u0017:\u0011\tXq9AtTұ:ʡ.uK}\"d\u00145\u001fTki\u0004lyaaͪ\u001bϻ\u000f}9n \"\u000e0d_z\u000bF\u0005\"\u001d\rאGك\t>\u0011$B2\r\u0014\u0019Lli4\u001aQėRݍ\u0013\u0017:߿DKd\u0019lzrUv\n7ѧlՃ.\u0003\u0007\u000fA$IE?\u0011\u0006Hj.\u00127WҸ)͢\u001flW~t+{TbF3*n\u007f9J4ŠUΜ:\u0006O){q@\u001cF&\u0015\u001fX\u0017I>(Μk۞4`\u0013UrT5\u0007 ujP8(-\u007fSɝH\u009f\u0013\r!O\u0001u3=Z^\u00109Y\u0019/\u001c\u001b͋\u0013Ѽ\u0001eN\u001b;\f\u0006=KZ\u0003\u0016=z\u0006X\u0012վ\u0014Ù$)\ft/b(\u001et\u001cu\u001dP\u0015 \u001b9ղ\u0015\u07b3T\"\f.XzC\u001a<\u001bNQ\u001820\u00185̒w֏%B/+z\f\u0013[v\r\"e\u0003b\u001dZaӉrܕZ{v-^#Y7[C+Zp9?Xvǈ\u001d\u05ca\u0018\u0017.\u001fD\u000e39\u001ee{j\u0007j}`cĎ;֗.c90`$N/\b\r\u001c,j'C@-שJŜ\r^tBe\u0014/z6|\r\u000e?\u0013+\u0004\u001fՠ\u001dӥ8Hz\u001er5\b)-t%Iv\u00062J \u0091-ܳVA#7@\u0011@8\u0005+\u001b<xs./\u0019տ~Ϩk.5FbCj7g?\u0006f\u0019%yJ\u000f܅\u0014З\u0015\u0010\u0019/h>pNj64=g2o\u001eg۷!Ƭ\nq\u000f\u0019Cp\"c3G\u0019~\u0017\fm~\bˌFތ;t+/\u001dukgtY=7{KU\u0011XʉVԐQe^\u000fo2\u001aES=\u0012WV~8$zڑ\u0012Ñ'\u0002M1V00lNv\fY\u001a%X;Eޒ/ؼpz{\n:oh\u0004r|y6WyB\u001e\u001bî6̘p\tMMv\u007f[T\u001bg,9%\u0005W8mχ\u001cޤuB3I\u0001S\u007flk_+u\u001a9`f\r̙S˂],\u000e- Z4zx\u0012ia&7@\u0012cՀ\u0004ٽVb\b`+\u001ew[\u0005kN^\u000fLogaٽ\u001bľb0J\f\u0019\ff>V=\u001a\u007f`_C\u0018\nʽ\u007fހK\u0014^{/#ak3-=i\u0001FmZHجIٝ7\ruJf;6l\u0013}9Mz*C\u0005Aݟ:ܻZ@\"*f\f^Urq(F\u000fCVr\u0007ߓ<ʒ\u0003\\K]\u000f\"oMc?}\u0001Hae`;ɲ7Ů[pZU13I\u0012\u0011;Y\u001b)\nLX\u0010ު/Ѵ\u00113F{\u0016b\u001ae\u000b\u001aa\u0012\u0019`x&\u0006ΩKĪEMtVsEigM,$\"=#4\u0018z߯sѸm\u0010*_\u0011R\u0007f7vc['epoeߊ\u0001\u07be2\u000e@U\u0014CV!pKM=u?Z3GħSۅn}2e}lEi[uCw/=_vg˱[ȓ\u0018pY\\fDgg4q+\u00040\u001cTfRŞ5݉\u001bWkmxy%p\u001f\fLmFc(w=ͦJͷB>Pl'l \u000e)\u0005\\d\u001f_\u001fM\u0018řn܍0)>Hx\u001fQ\u0011Y\u0016/\u0016MC%(>ʫFɬe$[]3M\u001b\u0016\u001c yy+z\f8\rŪ{۱\u0001\u0017\r>txT|\u0013\u0004H\u0006\u0002.`K1ݳ(\u07b2^)uh\u00160Ĭ\u0010g"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7ED\n&\u0017Tx\nC@&5U\r0Dm\u00175IEI5!\u001e\u0011fp\"\u0003r0_v\bGH]<iRSD\u0010\u0014htX)\t\f5?\"nRE)\u0015\u0002", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7ED\n&\u0017Tx\nC@&5U\r0Dm\u00175IEI5!\u001e\u0011fp\"\u0003r0_v\bGH]<iRSD\u0010\u0014hiL)\r\u0013gK1D", "u(E", "/bR2f:>Ry~vm<\n\t\u0010l{*\n", "", "", "0`c0[\u0019>\\\u0018~\bb5~x:d{7{Nd vXo\u0017K]/?d[\u001c5p\u0016", "", "\u001aiPCTuEO\"\u0001D;6\u0007\u0010/a\t}", "1n\\:b5-S'\u000e[e(~f+c\u0003(", "1n\\=_,MS\u0006~v\\;`\u0012=t{1y@^$\u0017C~\u0012F\u007f\u000f>6\u007f\u000f:z\u0016*L-DG=\u001d\"re8d_*Qv", "1ta?X5M>&\t\fb+|\u0016", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7ED\n&\u0017Tx\nC@&5U\r0Dm\u00175IEI5!\u001e\u0011fp\"\u0003r0_v\bGH]<iRSD\u0010\u0014hx[5\u001e\tXA1D", "2dbAe6R4\u0015{\bb*j\u0019<f{&{Nd \u0004Gk\fKZ.Chy)5m}*V?=kA{\u0011fd9", "3mP/_,\u001aZ\u001d\u0001\u0004B;|\u0011=B{6{G\u0005 \u00171xn8s29Wa\n%K\u0012,PC", "3mP/_,\u001a\\\u0018\f\u0005b+d\rBB\u0007(\u0005?h!\u0016GZ\u001bF\u0002\u00031W\u0001 ", "3mP/_,\u001bO\u0017\u0005|k6\r\u0012.S\u000f<\u0003@\\\"\"Ns\f8\u0006/B7y\u001e:m", "3mP/_,\u001cZ\u0019z\u0004M,\u0010\u0018\u0013n\u000b8\u000b4\u000b\u0019\u00130y\r<T!3\\}", "3mP/_,\u001eO\u001b~\bK6\u0007\u0018 i\u007f:WO\u0010\u0013\u0015Jw\u000eE\u0006\u00031W\u0001 ", "3mP/_,\u001ed\u0019\b\n>4\u0001\u0018>e\r\u0015{O\u0001 &Ky\u0017\u001b\u000729b\u007f\u00027{%>ZCIU=y\u001egnC\u000bb\nJt*G", "3mP/_,\u001fO\u0016\f~\\\u0013\u0007\u000b=C{&~@", "3mP/_,\u001fO\u0016\f~\\\u0019|\u0012.e\r(\t \u0014\u0015\u001eW}\u0012Mv,I7y\u001e:m", "3mP/_, `\u0015\b\u000be(\nv2a~2\u000e/\u000e\u0017\u00175~\nKv\u00125W\b)5q\u001d2IR?u={\u0011fd9", "3mP/_,\"=\u0007o~^>Z\u00103pn2f<\u007f\u0016\u001bPqjF\n\u00031W\u0001 ", "3mP/_,%O-\t\u000bm\b\u0006\r7a\u000f,\u0006I\u000f\u0001 +Y{\u001ar#8Y", "3mP/_,%]\"\u0001iZ:\u0003d\u001aI]$yC\u0001", "3mP/_,&W\u0017\f\u0005m(\u000b\u000f=C{&~@", "3mP/_,)`#\n\tN7{\u0005>el(yJ\n\u0015\u001bNs\nKz/>5\u0007\u001fDw\u001a-+?9n4", "3mP/_,+S$\t\bm\f\u000e\t8tj$\u007fI\u0010\u0006\u001bOok8t(5", "3mP/_,,g\"|}k6\u0006\u0013?sm7wO\u0001\u0007\"Fk\u001d<\u0005\u00031W\u0001 ", "3mP/_,.7v\t\u0004l0\u000b\u0018/n}<Y<~\u001a\u0017", "3mP/_,/W\u0019\u0011g^*\u0011\u00076i\t*Y<~\u001a\u0017", "3wR9h+>G#\u0001v?9\u0007\u0011\u001ca\u0012\u0013\tJ\f%tCm\u0011<", "4dc0[\u0010FO\u001b~\tB5m\r/wj5{<\b\u001e!Ek\u001d@\u0001.\u0013U{#7", "4hg\u0016a*H`&~xm\u001az\u00169l\u0007\u0019\u007f@\u0013\u0005&C~\u000e,\u0002$1h}\n@I\u001f-ZM?j\u0012\u001a\u0013ka", "4hg\u001aT7IW\"\u0001d_\f\u000e\t8tj5\u007fJ\u000e\u001b&Ko\u001c\u0019v4GY})\u0018i\u0013;QA\u0017t3\u000b\u0015d_Hd_*Qv", "4hg\u001a\\:LS\u0018_v[9\u0001\u0007\u001dt{7{0\f\u0016\u0013Vo\u001c&\u007f\u0001>X\u000b*;ls*KF;", "4hg\u001ab<Gb\u001d\b|<6\u0007\u0016.i\t$\u000bJ\u000e\u0004\u0017Ry\u001bKv$ Y\u0007\u001f;v\u0018\u001dZ?Dy0\u001c$lkB\u0015M5*\u007f&TVR+:Np@\u0014", "4na0X\t:b\u0017\u0002~g.d\u0013?n\u000f\f\u000b@\t%\u0001PK\u0017;\u0004/9X[\u001c5p\u0016", "4tb2U6Q3\"zwe,{g/b\u0010*Y<~\u001a\u0017", "4tb2U6Q3\"zwe,{u/l\u007f$\n@^\u0013\u0015Jo", "7mXA8(@S&m\u000bk)\u0007p9d\u0010/{Nj \u007fC~\u0012Mv\r?X\u000e'7{\u0002>MS;G=\u001d\"re8d_*Qv", ":`iF45B[\u0015\u000e~h5Z\u00056l|$yF\u000ft\u0013Er\u000e", ":nP1I,<b#\fYk(\u000f\u0005,l\u007f6eId\u001f\u0013Io\u001c\u001ar#8Y", "Adc\u000ea+K]\u001d}aZ@\u0007\u0019>D\u00045{>\u0010\u001b!PM\n:y%", "BqP0X\u001bN`\u0016\tbh+\r\u0010/P\r2\u0004D\u000f\u0017\u0004Gt\u000e:\u0006)?b\f\n@I\u001f-ZM?j\u0012\u001a\u0013ka", "CrT\u0013T)KW\u0017b\u0004m,\n\u0013:C{&~@", "CrT\u0016`4>R\u001dz\n^\f\u0010\t-u\u000f2\t$\nr F|\u0018@u\u0002B]|\"7t\u0016<[!7i7\u001e", "CrT\u001ab+>`\"k\u000bg;\u0001\u0011/S}+{?\u0011\u001e\u0017TM\n:y%", "CrT\u001bT;Bd\u0019o~^>Z\u00138f\u0004*\n$\ns$Kn\u0010<}%Cge*6ms*KF;", "CrT\u001bX>+S\u0015|\nB4x\u000b/V\u0004(\u000e\u001d|\u0015\u001dI|\u0018L\u007f$\u0014fy2;v\u0018\fIA>k", "CrT\u001cc;B[\u001d\rz]\u001d\u0001\tAP\r(wG\b!\u0015C~\u0012F\u007f\u000f>5\u0007\u001fDw\u001a-+?9n4", "CrT\u001cc;B[\u001d\u0014z]\f\u000e\t8t\\$\u000b>\u0004\u001b IY\u0017\u0018\u007f$Bc\u0002\u001f\u0015i\u00141M", "CrT\u001fh5MW!~ha({\u0013AN\n'{-\u0001\u0018\u0017To\u0017:v\u0015@Xy/7K\u0012,PC", "CrT\u001fh5MW!~ha({\u0013AN\n'{-\u0001\u0018\u0017To\u0017:v\u0015@Xy/7W\u001f\u0015IWE{C{\u0011fd9", "CrT g(MSt\u0006~`5\u0005\t8tg(yC| \u001bUwk8t(5", "CrT!h9;]\u0001\tyn3|l8t\u007f5\u0006K^\u0013\u0015Jo", "0`c0[\u0019>\\\u0018~\bb5~x:d{7{Nd vXo\u0017K]/?d", "1n\\:b5-S'\u000e[e(~", "1n\\=_,MS\u0006~v\\;`\u0012=t{1y@^$\u0017C~\u0012F\u007f\u000f>6\u007f\u000f:z\u0016*L-DG=\u001d\"re8", "2`]4X9Hc'\u0006\u000fK,\u000b\t>", "", "2dbAe6R4\u0015{\bb*j\u0019<f{&{Nd \u0004Gk\fKZ.Chy)5m}*V?=kA", "3mP/_,\u001aZ\u001d\u0001\u0004B;|\u0011=B{6{G\u0005 \u00171xn8s29Wa\n%", "3mP/_,\u001a\\\u0018\f\u0005b+d\rBB\u0007(\u0005?h!\u0016GZ\u001bF\u0002", "3mP/_,\u001bO\u0017\u0005|k6\r\u0012.S\u000f<\u0003@\\\"\"Ns\f8\u0006/B", "3mP/_,\u001cZ\u0019z\u0004M,\u0010\u0018\u0013n\u000b8\u000b4\u000b\u0019\u00130y\r<", "3mP/_,\u001eO\u001b~\bK6\u0007\u0018 i\u007f:WO\u0010\u0013\u0015Jw\u000eE\u0006", "3mP/_,\u001ed\u0019\b\n>4\u0001\u0018>e\r\u0015{O\u0001 &Ky\u0017\u001b\u000729b\u007f\u00027{%>ZCIU=y\u001egnC\u000bb", "3mP/_,\u001fO\u0016\f~\\\u0013\u0007\u000b=", "3mP/_,\u001fO\u0016\f~\\\u0019|\u0012.e\r(\t \u0014\u0015\u001eW}\u0012Mv,I", "3mP/_, `\u0015\b\u000be(\nv2a~2\u000e/\u000e\u0017\u00175~\nKv\u00125W\b)5q\u001d2IR?u=", "3mP/_,\"=\u0007o~^>Z\u00103pn2f<\u007f\u0016\u001bPqjF\n", "3mP/_,%O-\t\u000bm\b\u0006\r7a\u000f,\u0006I\u000f\u0001 +Y{", "3mP/_,%]\"\u0001iZ:\u0003d\u001aI", "3mP/_,&W\u0017\f\u0005m(\u000b\u000f=", "3mP/_,)`#\n\tN7{\u0005>el(yJ\n\u0015\u001bNs\nKz/>5\u0007\u001fDw\u001a-", "3mP/_,+S$\t\bm\f\u000e\t8tj$\u007fI\u0010\u0006\u001bOo", "3mP/_,,g\"|}k6\u0006\u0013?sm7wO\u0001\u0007\"Fk\u001d<\u0005", "3mP/_,.7v\t\u0004l0\u000b\u0018/n}<", "3mP/_,/W\u0019\u0011g^*\u0011\u00076i\t*", "3wR9h+>G#\u0001v?9\u0007\u0011\u001ca\u0012\u0013\tJ\f%", "4dc0[\u0010FO\u001b~\tB5m\r/wj5{<\b\u001e!Ek\u001d@\u0001.", "4hg\u0016a*H`&~xm\u001az\u00169l\u0007\u0019\u007f@\u0013\u0005&C~\u000e,\u0002$1h}\n@I\u001f-ZM?j", "4hg\u001aT7IW\"\u0001d_\f\u000e\t8tj5\u007fJ\u000e\u001b&Ko\u001c\u0019v4GY})\u0018i\u0013;QA\u0017t3\u000b\u0015d_H", "4hg\u001a\\:LS\u0018_v[9\u0001\u0007\u001dt{7{0\f\u0016\u0013Vo\u001c&\u007f\u0001>X\u000b*;l", "4hg\u001ab<Gb\u001d\b|<6\u0007\u0016.i\t$\u000bJ\u000e\u0004\u0017Ry\u001bKv$ Y\u0007\u001f;v\u0018\u001dZ?Dy0\u001c$lkB\u0015M5*\u007f&TVR+", "4na0X\t:b\u0017\u0002~g.d\u0013?n\u000f\f\u000b@\t%\u0001PK\u0017;\u0004/9X", "4tb2U6Q3\"zwe,{g/b\u0010*", "4tb2U6Q3\"zwe,{u/l\u007f$\n@", "7mXA8(@S&m\u000bk)\u0007p9d\u0010/{Nj \u007fC~\u0012Mv\r?X\u000e'7{\u0002>MS;G=\u001d\"re8", ":`iF45B[\u0015\u000e~h5Z\u00056l|$yF\u000f", ":nP1I,<b#\fYk(\u000f\u0005,l\u007f6eId\u001f\u0013Io\u001c", "=uT?e0=S", ">q^C\\+>`", "Adc\u000ea+K]\u001d}aZ@\u0007\u0019>D\u00045{>\u0010\u001b!P", "BqP0X\u001bN`\u0016\tbh+\r\u0010/P\r2\u0004D\u000f\u0017\u0004Gt\u000e:\u0006)?b\f\n@I\u001f-ZM?j", "CrT\u0013T)KW\u0017b\u0004m,\n\u0013:", "CrT\u0016`4>R\u001dz\n^\f\u0010\t-u\u000f2\t$\nr F|\u0018@u\u0002B]|\"7t\u0016<[", "CrT\u001ab+>`\"k\u000bg;\u0001\u0011/S}+{?\u0011\u001e\u0017T", "CrT\u001bT;Bd\u0019o~^>Z\u00138f\u0004*\n$\ns$Kn\u0010<}%Cge*6m", "CrT\u001bX>+S\u0015|\nB4x\u000b/V\u0004(\u000e\u001d|\u0015\u001dI|\u0018L\u007f$\u0014fy2;v\u0018", "CrT\u001cc;B[\u001d\rz]\u001d\u0001\tAP\r(wG\b!\u0015C~\u0012F\u007f\u000f>5\u0007\u001fDw\u001a-", "CrT\u001cc;B[\u001d\u0014z]\f\u000e\t8t\\$\u000b>\u0004\u001b IY\u0017\u0018\u007f$Bc\u0002\u001f", "CrT\u001fh5MW!~ha({\u0013AN\n'{-\u0001\u0018\u0017To\u0017:v\u0015@Xy/7", "CrT\u001fh5MW!~ha({\u0013AN\n'{-\u0001\u0018\u0017To\u0017:v\u0015@Xy/7W\u001f\u0015IWE{C", "CrT g(MSt\u0006~`5\u0005\t8tg(yC| \u001bUw", "CrT!h9;]\u0001\tyn3|l8t\u007f5\u0006K", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ReactNativeFeatureFlagsLocalAccessor implements ReactNativeFeatureFlagsAccessor {
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
    private ReactNativeFeatureFlagsProvider currentProvider = new ReactNativeFeatureFlagsDefaults();
    private final Set<String> accessedFeatureFlags = new LinkedHashSet();

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean batchRenderingUpdatesInEventLoop() {
        Boolean boolValueOf = this.batchRenderingUpdatesInEventLoopCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.batchRenderingUpdatesInEventLoop());
            this.accessedFeatureFlags.add("batchRenderingUpdatesInEventLoop");
            this.batchRenderingUpdatesInEventLoopCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean commonTestFlag() {
        Boolean boolValueOf = this.commonTestFlagCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.commonTestFlag());
            this.accessedFeatureFlags.add("commonTestFlag");
            this.commonTestFlagCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean completeReactInstanceCreationOnBgThreadOnAndroid() {
        Boolean boolValueOf = this.completeReactInstanceCreationOnBgThreadOnAndroidCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.completeReactInstanceCreationOnBgThreadOnAndroid());
            this.accessedFeatureFlags.add("completeReactInstanceCreationOnBgThreadOnAndroid");
            this.completeReactInstanceCreationOnBgThreadOnAndroidCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsAccessor
    public void dangerouslyReset() {
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean destroyFabricSurfacesInReactInstanceManager() {
        Boolean boolValueOf = this.destroyFabricSurfacesInReactInstanceManagerCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.destroyFabricSurfacesInReactInstanceManager());
            this.accessedFeatureFlags.add("destroyFabricSurfacesInReactInstanceManager");
            this.destroyFabricSurfacesInReactInstanceManagerCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableAlignItemsBaselineOnFabricIOS() {
        Boolean boolValueOf = this.enableAlignItemsBaselineOnFabricIOSCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.enableAlignItemsBaselineOnFabricIOS());
            this.accessedFeatureFlags.add("enableAlignItemsBaselineOnFabricIOS");
            this.enableAlignItemsBaselineOnFabricIOSCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableAndroidMixBlendModeProp() {
        Boolean boolValueOf = this.enableAndroidMixBlendModePropCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.enableAndroidMixBlendModeProp());
            this.accessedFeatureFlags.add("enableAndroidMixBlendModeProp");
            this.enableAndroidMixBlendModePropCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableBackgroundStyleApplicator() {
        Boolean boolValueOf = this.enableBackgroundStyleApplicatorCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.enableBackgroundStyleApplicator());
            this.accessedFeatureFlags.add("enableBackgroundStyleApplicator");
            this.enableBackgroundStyleApplicatorCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableCleanTextInputYogaNode() {
        Boolean boolValueOf = this.enableCleanTextInputYogaNodeCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.enableCleanTextInputYogaNode());
            this.accessedFeatureFlags.add("enableCleanTextInputYogaNode");
            this.enableCleanTextInputYogaNodeCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableEagerRootViewAttachment() {
        Boolean boolValueOf = this.enableEagerRootViewAttachmentCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.enableEagerRootViewAttachment());
            this.accessedFeatureFlags.add("enableEagerRootViewAttachment");
            this.enableEagerRootViewAttachmentCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableEventEmitterRetentionDuringGesturesOnAndroid() {
        Boolean boolValueOf = this.enableEventEmitterRetentionDuringGesturesOnAndroidCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.enableEventEmitterRetentionDuringGesturesOnAndroid());
            this.accessedFeatureFlags.add("enableEventEmitterRetentionDuringGesturesOnAndroid");
            this.enableEventEmitterRetentionDuringGesturesOnAndroidCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableFabricLogs() {
        Boolean boolValueOf = this.enableFabricLogsCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.enableFabricLogs());
            this.accessedFeatureFlags.add("enableFabricLogs");
            this.enableFabricLogsCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableFabricRendererExclusively() {
        Boolean boolValueOf = this.enableFabricRendererExclusivelyCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.enableFabricRendererExclusively());
            this.accessedFeatureFlags.add("enableFabricRendererExclusively");
            this.enableFabricRendererExclusivelyCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableGranularShadowTreeStateReconciliation() {
        Boolean boolValueOf = this.enableGranularShadowTreeStateReconciliationCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.enableGranularShadowTreeStateReconciliation());
            this.accessedFeatureFlags.add("enableGranularShadowTreeStateReconciliation");
            this.enableGranularShadowTreeStateReconciliationCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableIOSViewClipToPaddingBox() {
        Boolean boolValueOf = this.enableIOSViewClipToPaddingBoxCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.enableIOSViewClipToPaddingBox());
            this.accessedFeatureFlags.add("enableIOSViewClipToPaddingBox");
            this.enableIOSViewClipToPaddingBoxCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableLayoutAnimationsOnIOS() {
        Boolean boolValueOf = this.enableLayoutAnimationsOnIOSCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.enableLayoutAnimationsOnIOS());
            this.accessedFeatureFlags.add("enableLayoutAnimationsOnIOS");
            this.enableLayoutAnimationsOnIOSCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableLongTaskAPI() {
        Boolean boolValueOf = this.enableLongTaskAPICache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.enableLongTaskAPI());
            this.accessedFeatureFlags.add("enableLongTaskAPI");
            this.enableLongTaskAPICache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableMicrotasks() {
        Boolean boolValueOf = this.enableMicrotasksCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.enableMicrotasks());
            this.accessedFeatureFlags.add("enableMicrotasks");
            this.enableMicrotasksCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enablePropsUpdateReconciliationAndroid() {
        Boolean boolValueOf = this.enablePropsUpdateReconciliationAndroidCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.enablePropsUpdateReconciliationAndroid());
            this.accessedFeatureFlags.add("enablePropsUpdateReconciliationAndroid");
            this.enablePropsUpdateReconciliationAndroidCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableReportEventPaintTime() {
        Boolean boolValueOf = this.enableReportEventPaintTimeCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.enableReportEventPaintTime());
            this.accessedFeatureFlags.add("enableReportEventPaintTime");
            this.enableReportEventPaintTimeCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableSynchronousStateUpdates() {
        Boolean boolValueOf = this.enableSynchronousStateUpdatesCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.enableSynchronousStateUpdates());
            this.accessedFeatureFlags.add("enableSynchronousStateUpdates");
            this.enableSynchronousStateUpdatesCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableUIConsistency() {
        Boolean boolValueOf = this.enableUIConsistencyCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.enableUIConsistency());
            this.accessedFeatureFlags.add("enableUIConsistency");
            this.enableUIConsistencyCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableViewRecycling() {
        Boolean boolValueOf = this.enableViewRecyclingCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.enableViewRecycling());
            this.accessedFeatureFlags.add("enableViewRecycling");
            this.enableViewRecyclingCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean excludeYogaFromRawProps() {
        Boolean boolValueOf = this.excludeYogaFromRawPropsCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.excludeYogaFromRawProps());
            this.accessedFeatureFlags.add("excludeYogaFromRawProps");
            this.excludeYogaFromRawPropsCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fetchImagesInViewPreallocation() {
        Boolean boolValueOf = this.fetchImagesInViewPreallocationCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.fetchImagesInViewPreallocation());
            this.accessedFeatureFlags.add("fetchImagesInViewPreallocation");
            this.fetchImagesInViewPreallocationCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fixIncorrectScrollViewStateUpdateOnAndroid() {
        Boolean boolValueOf = this.fixIncorrectScrollViewStateUpdateOnAndroidCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.fixIncorrectScrollViewStateUpdateOnAndroid());
            this.accessedFeatureFlags.add("fixIncorrectScrollViewStateUpdateOnAndroid");
            this.fixIncorrectScrollViewStateUpdateOnAndroidCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fixMappingOfEventPrioritiesBetweenFabricAndReact() {
        Boolean boolValueOf = this.fixMappingOfEventPrioritiesBetweenFabricAndReactCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.fixMappingOfEventPrioritiesBetweenFabricAndReact());
            this.accessedFeatureFlags.add("fixMappingOfEventPrioritiesBetweenFabricAndReact");
            this.fixMappingOfEventPrioritiesBetweenFabricAndReactCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fixMissedFabricStateUpdatesOnAndroid() {
        Boolean boolValueOf = this.fixMissedFabricStateUpdatesOnAndroidCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.fixMissedFabricStateUpdatesOnAndroid());
            this.accessedFeatureFlags.add("fixMissedFabricStateUpdatesOnAndroid");
            this.fixMissedFabricStateUpdatesOnAndroidCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fixMountingCoordinatorReportedPendingTransactionsOnAndroid() {
        Boolean boolValueOf = this.fixMountingCoordinatorReportedPendingTransactionsOnAndroidCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.fixMountingCoordinatorReportedPendingTransactionsOnAndroid());
            this.accessedFeatureFlags.add("fixMountingCoordinatorReportedPendingTransactionsOnAndroid");
            this.fixMountingCoordinatorReportedPendingTransactionsOnAndroidCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean forceBatchingMountItemsOnAndroid() {
        Boolean boolValueOf = this.forceBatchingMountItemsOnAndroidCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.forceBatchingMountItemsOnAndroid());
            this.accessedFeatureFlags.add("forceBatchingMountItemsOnAndroid");
            this.forceBatchingMountItemsOnAndroidCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fuseboxEnabledDebug() {
        Boolean boolValueOf = this.fuseboxEnabledDebugCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.fuseboxEnabledDebug());
            this.accessedFeatureFlags.add("fuseboxEnabledDebug");
            this.fuseboxEnabledDebugCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fuseboxEnabledRelease() {
        Boolean boolValueOf = this.fuseboxEnabledReleaseCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.fuseboxEnabledRelease());
            this.accessedFeatureFlags.add("fuseboxEnabledRelease");
            this.fuseboxEnabledReleaseCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean initEagerTurboModulesOnNativeModulesQueueAndroid() {
        Boolean boolValueOf = this.initEagerTurboModulesOnNativeModulesQueueAndroidCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.initEagerTurboModulesOnNativeModulesQueueAndroid());
            this.accessedFeatureFlags.add("initEagerTurboModulesOnNativeModulesQueueAndroid");
            this.initEagerTurboModulesOnNativeModulesQueueAndroidCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean lazyAnimationCallbacks() {
        Boolean boolValueOf = this.lazyAnimationCallbacksCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.lazyAnimationCallbacks());
            this.accessedFeatureFlags.add("lazyAnimationCallbacks");
            this.lazyAnimationCallbacksCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean loadVectorDrawablesOnImages() {
        Boolean boolValueOf = this.loadVectorDrawablesOnImagesCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.loadVectorDrawablesOnImages());
            this.accessedFeatureFlags.add("loadVectorDrawablesOnImages");
            this.loadVectorDrawablesOnImagesCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsAccessor
    public void override(ReactNativeFeatureFlagsProvider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        if (this.accessedFeatureFlags.isEmpty()) {
            this.currentProvider = provider;
        } else {
            throw new IllegalStateException("Feature flags were accessed before being overridden: " + CollectionsKt.joinToString$default(this.accessedFeatureFlags, ", ", null, null, 0, null, new Function1<String, CharSequence>() { // from class: com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsLocalAccessor$override$accessedFeatureFlagsStr$1
                @Override // kotlin.jvm.functions.Function1
                public final CharSequence invoke(String it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return it;
                }
            }, 30, null));
        }
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean setAndroidLayoutDirection() {
        Boolean boolValueOf = this.setAndroidLayoutDirectionCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.setAndroidLayoutDirection());
            this.accessedFeatureFlags.add("setAndroidLayoutDirection");
            this.setAndroidLayoutDirectionCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean traceTurboModulePromiseRejectionsOnAndroid() {
        Boolean boolValueOf = this.traceTurboModulePromiseRejectionsOnAndroidCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.traceTurboModulePromiseRejectionsOnAndroid());
            this.accessedFeatureFlags.add("traceTurboModulePromiseRejectionsOnAndroid");
            this.traceTurboModulePromiseRejectionsOnAndroidCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useFabricInterop() {
        Boolean boolValueOf = this.useFabricInteropCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.useFabricInterop());
            this.accessedFeatureFlags.add("useFabricInterop");
            this.useFabricInteropCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useImmediateExecutorInAndroidBridgeless() {
        Boolean boolValueOf = this.useImmediateExecutorInAndroidBridgelessCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.useImmediateExecutorInAndroidBridgeless());
            this.accessedFeatureFlags.add("useImmediateExecutorInAndroidBridgeless");
            this.useImmediateExecutorInAndroidBridgelessCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useModernRuntimeScheduler() {
        Boolean boolValueOf = this.useModernRuntimeSchedulerCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.useModernRuntimeScheduler());
            this.accessedFeatureFlags.add("useModernRuntimeScheduler");
            this.useModernRuntimeSchedulerCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useNativeViewConfigsInBridgelessMode() {
        Boolean boolValueOf = this.useNativeViewConfigsInBridgelessModeCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.useNativeViewConfigsInBridgelessMode());
            this.accessedFeatureFlags.add("useNativeViewConfigsInBridgelessMode");
            this.useNativeViewConfigsInBridgelessModeCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useNewReactImageViewBackgroundDrawing() {
        Boolean boolValueOf = this.useNewReactImageViewBackgroundDrawingCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.useNewReactImageViewBackgroundDrawing());
            this.accessedFeatureFlags.add("useNewReactImageViewBackgroundDrawing");
            this.useNewReactImageViewBackgroundDrawingCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useOptimisedViewPreallocationOnAndroid() {
        Boolean boolValueOf = this.useOptimisedViewPreallocationOnAndroidCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.useOptimisedViewPreallocationOnAndroid());
            this.accessedFeatureFlags.add("useOptimisedViewPreallocationOnAndroid");
            this.useOptimisedViewPreallocationOnAndroidCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useOptimizedEventBatchingOnAndroid() {
        Boolean boolValueOf = this.useOptimizedEventBatchingOnAndroidCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.useOptimizedEventBatchingOnAndroid());
            this.accessedFeatureFlags.add("useOptimizedEventBatchingOnAndroid");
            this.useOptimizedEventBatchingOnAndroidCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useRuntimeShadowNodeReferenceUpdate() {
        Boolean boolValueOf = this.useRuntimeShadowNodeReferenceUpdateCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.useRuntimeShadowNodeReferenceUpdate());
            this.accessedFeatureFlags.add("useRuntimeShadowNodeReferenceUpdate");
            this.useRuntimeShadowNodeReferenceUpdateCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useRuntimeShadowNodeReferenceUpdateOnLayout() {
        Boolean boolValueOf = this.useRuntimeShadowNodeReferenceUpdateOnLayoutCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.useRuntimeShadowNodeReferenceUpdateOnLayout());
            this.accessedFeatureFlags.add("useRuntimeShadowNodeReferenceUpdateOnLayout");
            this.useRuntimeShadowNodeReferenceUpdateOnLayoutCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useStateAlignmentMechanism() {
        Boolean boolValueOf = this.useStateAlignmentMechanismCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.useStateAlignmentMechanism());
            this.accessedFeatureFlags.add("useStateAlignmentMechanism");
            this.useStateAlignmentMechanismCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useTurboModuleInterop() {
        Boolean boolValueOf = this.useTurboModuleInteropCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.currentProvider.useTurboModuleInterop());
            this.accessedFeatureFlags.add("useTurboModuleInterop");
            this.useTurboModuleInteropCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }
}
