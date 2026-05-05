package com.biocatch.android.commonsdk.configuration;

import com.biocatch.android.commonsdk.logging.ELogLevel;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005\"4\u0012\u0006\u000bnʑA0RlP.XY2\u000fy\u0005<$a\u0015yCQU\"}(\nUɥg}ñzZ9BO\u000b\u001cx̶0Icx.\u001e\u001d3Zom5$ڕ\u0010˃dt>ӌp>0;\u0012\u0005/\u001c\u0001Ёbͯ~CSÈb<NtRR;R[܌dĂB \tȦ-s\\<`l\fA\u0006ݑUݦFN/ڿ\u0001\t[\u0015^TU\u000fMѴpҋD7=Ֆu_\u0011\u0010j[m\u0005\u0016у\u0010ݾl'/Ǣ\u001a\u007fe@p\u007fB\u001c\u0002̄_ǁv&dӤ\"l\u001a2CO\u0012R'ʲzÞ~{\u0015ɝT\u001a\u00143`.[!=ڣ`\u07baxr[ó!\u000elO\u0018z\u00108mӢRĴ/9#Ƙ\"mI'f7*\u0007c̛uъr!c٪^l#*lw\u007fA(̼\u0010˓R\naƝ>\u0010~s\u001a*2@\u001eĐ\u0002ɨ\u0015.\u001f¦\bgG59k0X\u001bϠIݶdh[֟#TN5\u0007\u0016e:_ȸ-ֈh\u0005s¬%d:%e\u001c\u0003\u0017Tܸeء`wDƙu\u001c\\d\u0001i\u0019]4܊wçj7aʤ<\u001aeOv3ca:ߋ4؏z\u0014Gֺ3\u0011f}ZS:j3̬tĘLj\u0018ǮLP\\$+2m\u0002rـ~֞\u001d\\\u001dǽS*PZ\u0015\t\u000ej?ɴQՁ7$\u000bǭt\u0001\u0017\u001bh\\\u001f\u007f>յ\u001cض\u0001`*Ί\u0012]C4>UPx\u000bñuȷ\u0003s\bø8XUh\u0005\u0016$eR\u0094h׀=Q7ˋc\u001b\rFJ\u0002[U#ǰ8˛Q\u0012/ϕM\u0006\u001dY\u0001.\u0016\u0018AѸ~߯nJWܷg.\u0005}\u000b#6tVן4â~GkҺ[gLi\u000b\u0003\bL%̂Oġ#\u001e-˚@.\u000bVECU-lߗfڏ\u0019aeɐ@:\b\u0005'&#uZЁ6݁sbYϡ\u0003GFlq~l2zОU\u074cLj\u007f٤\u0013\u0015B1KHotGސ\u000bԪ\u000f/\u0006օW8\u001b\u0016n[h#Fϟ\u0007ˀc*{ʕN li=\u0011{c>ơ@љ`\u000bR\u05faZ\u0017\nX\u0007\u0012JMvݏ*ť\r0\u000e\u058chBOcz\u0005j\u0019zҐ~ѧ\f\u000bKҍ:\u0012\u001e$\u0018F\u000e\u001fmϯ\u0015Ǡ?V\u0016֊Ihdr\u001d`spwƨS϶\u00133&֭\u0006=\u0013\u0019^T]s\tܳ&\u009b\r\u001brʪOr3W\\Tg+~߷SխI]K̲RB\u0012tAm\u001a\u007fbՋjԠ!B Ç\n]\u001f\u000e\u000f0\r\u001b,̫!Щz\u0012nŚ\u001f.7.\u0013|<L`ێ]ĢSrwۮ}X\\(OCH\u0011m״{ܰ\u0010|k˪k9\u0014fE=wzjդN\u009cW;\u0006Иp,56\r!\u000bgdѥ\\ܤ\u001f:\u001eފfn\u0010<+PN\u0014\u0005\u0604Gҽ\u000e.\u0010ˆ \u000eA6+^\b{Ń\u0013Ӳ/l\u000eל\u001ct\u0007?{l\u0012~,̊UЂ5V\u0002ҧ}\\+??M\\#/ś\rñW `ҹP #]766r\u007fֈ\"ʍlpsχ,\u00199g\u0004*\u00103\u0007݃pݼ#y}âz`6NSV{@;Ӿ/\u05cfFW\u0016ߜ;4r/$)B\u0002Uģ1ǚ\u00174Nݱnp=r1\u001f\n\u001d\u001e֣YʺII.ϳ\u0002^MWO29\u007f~Ϛcܾ>b|ʔzN\u00170\u0018gZ=\u001d®\u0010Ն+Y,ݦ5\u000f4\n]8p\u0018\u0003ֽ`Ŕ3Z@Ԍ\u000fh([SQaQo֍Sͤ<\u0006wޞiAx\u0012k%X\u0011SӜ_ק}1s\u009fDC\u0001dG\u000f\u001e+.Ƨ\u000eć9eTھ\\\u000es\r\u0017M\u0012feʯ~ޜ9E&\u0099&L\u000eM7$R\u0016L\u0085Rӽ5H2أ-Ld8o\u0004T:\r˛\u0017ďKl\u0001݅Z8w]\fd\nq\u000bШM\u008f\u001dDFϠ}x\u0015\feh(\u001b\u001bՀ\u0018ƌ;\u000f\u000eӽ\u0004#\u000bWgqn; ף Ұ`]DͨD\u0010Hzy6(W\u0017ô|ƭ1\u0012\\ĝ;v{\u001bw\u0010f\"cŶVֶ5Rhٻ1)&qcvtF3ܕ یf\u000bHǃtj<\u000e$\u000b4&\u0005Њiў\u0002Jhňc?U@YG@fR\u05fboǱ_%\u000eȷ8vU\rmq\u0007M\u0010ߙ]ǮNX=ƶ-\u0011cocdY%VӴ}ʜKVFϖzd\u0014]]dv \u001bє\u0017ڍq08ߣ!\u000bh\u0014u\u0001J/\u0014ռg\u05ca\u00032jۙ,p\u001f|OW\u001db,Ʊ\u007fӟ\u0006\u0003\u0018Ýi\u001f\u0019pk9`3Jԣ\u0004Ĩ\u007f\bdų&\t{\u001d(\u0003\u0010ZwǙXܽ3ASА'qMmo?-\u001cvΛvˊ\u0017$jӺcu\u001cww\u0003zF-ʾ\u001bä]\u0011nޞ;\u001b\tK$.:H,Έ\u0010۠\u0015b$ލ\fkN\u0004Fp7W&ǱN۴ionڎ*YS\u0004\u000e\u0019lAH¸6ٷc\u0014vҭ-dLpo&n#X®oĘe{P֢\u0001#c>\u0006j\"d7\u05f9,ۨo0lҵCrr\u001a{>jJCÊ9\u008f\u0002\u001bYɂ3\u0015nM`A>dCԵy̡Lj!ɮQWot,7r}y\u05ce\u0006؞&a*ˬ.1U)\u001e\u000e\u0019hNôNׁ76\u0015ѥ|\t#dVf!\u0006CϽ ܝ\bk7Ȋ\u0017fN|EZUt?Ǡ|Ħ\u0010|\r\u05fb?_`3\u000e\u001f!fUԄp\u05c9EWA݃q\u001f\u0011{T\b`O/\u05f9Aˬ`%6ߖV+ &\u00145\u001bCJډ\u0006ށuO<\u07b7n5\fN\u0010 ;mh˖6˫'Oqαai<3\u0010\u0007\b>0\u0382Tܢ&),ǉe3\u0010/LJ`$yÖaվ\u001cJnÐI1\u0017M$/#wdٹ@ӇwfeØ\u0005MK>u~s/\u0006ʞZߌMm\u0007ճ\u0018\u001aW\u007fROzoLؐ\u0010Ի\u001a2\u000f\u0605T=\u001e^x[p\u0019NÖ5Ըo:\u0004ҞS x7F\u001a\tmEԳI˙e\u0010Eө] \u0013+\f)QG{ߏ3ݦ\u0004;\u0011ލmC_3|\u000br\u0013~Ж\u0005ӟ\u0016\u000fPږ7\u001a)p\u001dK\u0013\u001cl˞\u0018ߡDK\u001d֛TsqA:gvm~ީ\\Ϸ\u001a6%־\u0006E\u001bdh^ci5λ(̓\u0012'vʳX}>$_]\t\"\u0006؈Z;NfTȡ]S\u0015_Fv%\u0003m՜WΠ.K*Ŀ[g\u001f[\u0013+=Gk^kd) Eǡ.܁4}\u000eÊcM-\r&$6\u0002K۶\u0007ѿy\u0001Hޒc\u0018(;F\bB\u0007<թWĹ\u000eA9؉$|'$\u0010_\rD[ʟwԍ,\u000b є2x!i-(PEiؑm̚\r\u0010$Фu\u0015;L\u000fzH4fه(ӨC\n\u001bЎ/\u0004\u000e\u001da0^u_ے\u001fʸ\u0002.rЪ;\u0004l\rgqj_UԮ\tޅ,\u0010.͍\f pZ\\'\n*\u001bܸ`ڏ#*,ח\\{>ٱ[\u0001}\u001ex)\u05f6dī8n=ү\u0011B9Ķ\u007f>\u0001/\u0019yƛ}ÏBY]܇5\u001ctʦO[\u0012\r\u0005\u0015ŶOϯ5\u001d\fַ\u001cr@Ն8ayO{\u000bҵtƅf\u0014,М\\ Z݇,27\u000eԏ!л@#{Ԓ\u0017\u001b\u0017\u058bi\u0003ҥ.ٗ\u0015۔\b"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*@n\u001a0]P7z8(\u001e2?C\u0010d0P\u00074C[R6e1r>\u0010\"a\u001d?'\u0014\u0015Y\u0017", "", "u(E", "\u000fbR2_,K]!~\n^9\\\u001a/n\u000f6i<\t\"\u001eGZ\u000eIz/4", "", "\u000fbR2_,K]!~\n^9\\\u001a/n\u000f6i@\n%!T\\\u000e>z3Dfy/;w\u001f\rMJ7\u007f", "\u000fbR2_,K]!~\n^9\\\u001a/n\u000f6jC\u000e\u0017%Jy\u0015;", "", "\u000ftS6b\fOS\"\u000eXh3\u0004\t-t\u00041}$\n&\u0017T\u0001\nC", "", "\u0010kd2g6Hb\u001cgvf,k\u0016?n}$\u000bD\u000b }Gx\u0010Ky", "\u0011n[9X*M]&]vm(Y\u00190f\u007f5iD\u0016\u0017", "\u0012`c.;(Kd\u0019\r\n^9`\u0012>e\r9wG", "\u0012dU.h3ME)\ngZ;|", "\u0012de6V,\u001a^$[v\\2~\u00169u\t'Z@\b\u0013+/s\u0015Cz3", "\u0012hb=_(Ra\u0002z\u0003^\u001b\n\u00198c{7\u007fJ\n}\u0017Pq\u001d?", "\u0013kT:X5MB\u0015\u0001kZ3\r\t\u0017a\u0013\u000f{I\u0003&\u001a", "\u0013mP/_,\u001a\\\u0018\f\u0005b+`g\u0010e{7\fM\u0001", "", "\u0013mP/_,\u001a^$\u0006~\\(\f\r9nh$\u0004@a\u0017\u0013V\u007f\u001b<", "\u0013mP/_,\u001ac\u0018\u0003\u0005>=|\u0012>F\u007f$\u000bP\u000e\u0017", "\u0013mP/_,\u001ac(\tXh5\f\tBt", "\u0013mP/_,\u001ac(\tZe,\u0005\t8tc'", "\u0013mP/_,\u001c]#\fyb5x\u0018/sg$\nF\u0005 \u0019", "\u0013mP/_,\u001c]&~\t?,x\u0018?r\u007f", "\u0013mP/_,\u001dS*\u0003x^\b\b\u00146i}$\u000bD\u000b %%y\u0015Cv#D]\b)", "\u0013mP/_,\u001dS*\u0003x^\r\u0001\u00121e\r3\tD\n&wGk\u001dL\u0004%", "\u0013mP/_,\u001dS*\u0003x^\u000fx\u0016.w{5{!\u0001\u0013&W|\u000e", "\u0013mP/_,\u001dS*\u0003x^\u0014x\u0012?f{&\u000bP\u000e\u0017$(o\nK\u000725", "\u0013mP/_,\u001dS*\u0003x^\u0014\u0007\b/l`(wO\u0011$\u0017", "\u0013mP/_,\u001dS*\u0003x^\u0017\n\u0013.u}7\\@|&'To", "\u0013mP/_,\u001dW'\n\u0002Z@]\t+t\u00105{", "\u0013mP/_,\u001dW'\n\u0002Z@\u000bf9l\u0007(yO\u0005! ", "\u0013mP/_,\u001eZ\u0019\u0007zg;m\u00056u\u007f6c<\u000f\u001d\u001bPq", "\u0013mP/_,\u001e[)\u0006vm6\ng/t\u007f&\u000bJ\u000ew\u0017C~\u001eIv", "\u0013mP/_, Z#{ve\u001b\u0007\u0019-h]2\u0003G\u0001\u0015&Ky\u0017$\u0001$5", "\u0013mP/_,!g\u0016\f~]\u001a\u0007\u0010?t\u00042\u0005", "\u0013mP/_,\"[\u0019\u0003Xh3\u0004\t-t\u00042\u0005", "\u0013mP/_,\"['\u0003Xh3\u0004\t-t\u00042\u0005", "\u0013mP/_,$S-{\u0005Z9{\u0017\u0010e{7\fM\u0001", "\u0013mP/_,%O\"\u0001\u000bZ.|\u0017\u0010e{7\fM\u0001", "\u0013mP/_,%O(~\tm\bz\u0007/s\u000e\u0013\u0006D\n&%%y\u0015Cv#D]\b)", "\u0013mP/_,%]\u0017z\u0002B\u0017X\b.r\u007f6\n!\u0001\u0013&W|\u000e", "\u0013mP/_,&/vZy]9|\u0017=F\u007f$\u000bP\u000e\u0017", "\u0013mP/_,&O\u001d\baZ5~\u0019+g\u007f\t{<\u0010'$G", "\u0013mP/_,&S!\t\br\r|\u0005>u\r(", "\u0013mP/_,&])\rz>=|\u0012>s`(wO\u0011$\u0017", "\u0013mP/_,&c\u001d}[^(\f\u0019<e", "\u0013mP/_,&c \u000e~L0\u0005g+t{\t{<\u0010'$G", "\u0013mP/_,'S(\u0011\u0005k2`\u0012>e\r)w>\u0001%wGk\u001dL\u0004%", "\u0013mP/_,(A\n~\bl0\u0007\u0012\u0010e{7\fM\u0001", "\u0013mP/_,)Z\u0015\u000e{h9\u0005i/a\u000f8\t@", "\u0013mP/_,+S%\u000fzl;`g\u0010e{7\fM\u0001", "\u0013mP/_,,W!]vm(]\t+t\u00105{", "\u0013mP/_,,])\fx^\r|\u0005>u\r(", "\u0013mP/_,-W!~oh5|i/a\u000f8\t@", "\u0013mP/_,/S&\r~h5]\t+t\u00105{", "\u0013mP/_,0c$fzl:x\u000b/sb$\nC\u0005 \u0019", "\u0015xa<8=>\\(\rhZ4\b\u0010/P\u007f5\u007fJ\u007f", "\u0015xa<8=>\\(\rh^5\u000b\u0013<R\u007f*\u007fN\u0010$\u0013Vs\u0018EU%<U\u0012", "\u0015xa<8=>\\(\ria9|\u00172o\u0007'", "\u0017r00V,ES&\t\u0003^;|\u0016\u000fv\u007f1\u000bN", "\u0017r00V,La\u001d{~e0\f\u001d\u000fv\u007f1\u000bN", "\u0017r0=c\u001cLW\"\u0001g^5~\u001b?x\u0004$\u0005'\u0005\u0014$C|\"\u001a\u00073Dc\u0006}Au!8VCDzB", "\u0017r0=c3BQ\u0015\u000e~h5\\\u001a/n\u000f6", "\u0017r1.g;>`-l\nZ;\r\u0017\u000fv\u007f1\u000bN", "\u0017r19h,M]#\u000e}", "\u0017r2._3\"\\\u001a\t", "\u0017r29\\7;]\u0015\fy>=|\u0012>s", "\u0017r2<a;>f(\\}Z5~\t", "\u0017r32i0<S\u0003\f~^5\f\u0005>i\n1[Q\u0001 &U", "\u0017r49X4>\\(\r", "\u0017r49X4>\\(\rZo,\u0006\u0018=", "\u0017r49X4>\\(\r]b,\n\u0005<c\u0003<", "\u0017r59\\5@3*~\u0004m:", "\u0017r6Fe6\u001ed\u0019\b\nl", "\u0017r:2l\fOS\"\u000e\t", "\u0017r;6Z/M3*~\u0004m:", "\u0017r;<V(MW#\bZo,\u0006\u0018=", "\u0017r;<a.)`\u0019\r\t>=|\u0012>s", "\u0017r<<g0H\\t\f\u0005n5{w9u}+", "\u0017r<<g0H\\\u0003\bh^:\u000b\r9nm7wM\u0010", "\u0017r>?\\,Gb\u0015\u000e~h5\\\u001a/n\u000f6", "\u0017r?.a\fOS\"\u000e\t", "\u0017r?6a*A3*~\u0004m:", "\u0017rB2a:H`\u007f\u0003\tm", "\u0017rB6Z5BT\u001d|vg;d\u0013>i\n1[Q\u0001 &U", "\u0017rC.c\fOS\"\u000e\t", "\u0017rC<h*A3*~\u0004m:", "\u0017rE<\\7", "\u0017rF6Y0!W'\u000e\u0005k@", "\u0017rF6Y0\"\\\u001a\tZo,\u0006\u0018=", "\u0019dh\u0012i,Gb'fvl2j\u0014/c\u0004$\u0003\u001e\u0004\u0013$U", "\u001ahV5g\fOS\"\u000e\tL(\u0005\u00146ej(\tD\u000b\u0016", "\u001ahV5g\fOS\"\u000e\tL,\u0006\u00179rl(}D\u000f&$C~\u0012F\u007f\u00045`y4", "\u001anR.g0H\\x\u0010zg;\u000bu/q\u0010(\nO_\u0017\u001eC\u0004{<t", "\u001anR.g0H\\x\u0010zg;\u000bw3m\u007f2\fOh%\u0017E", "\u001anR.g0H\\\u0006~{k,\u000b\f\u000ei\u000e7wI~\u0017", "\u001anR.g0H\\\u0006~{k,\u000b\f\u001ei\b(", "\u001anV\u000fh-?S&l~s,", "\u001anV\u0010b4Fc\"\u0003xZ;\u0001\u00138B\u0010)|@\u000et\u0013Rk\f@\u00069", "\u001anV\u0016a*KS!~\u0004m(\u0004j<o\u00127~\u001d\u0001&)Go\u0017\u001dr)<i\u000b E", "\u001anV\u001aT?\"\\(~\bo(\u0004e/t\u0012({Ia\u0013\u001bN\u007f\u001b<\u0005", "\u001anV\u001aX:LO\u001b~Yb:\b\u0005>c\u0003\u0015wO\u0001~%Gm", "\u001anV\u001aX:LO\u001b~cn4k\u0013\u001ce\u000f5\u0010", "\u001anV\u001aX:LO\u001b~g^;\n\u001d\u0013n\u000f(\tQ|\u001e", "\u001b`g\u0019b.&S'\rv`,\u000bw9F\u00078\nC", "\u001b`g _(OS\u0004\u0003\u0004`\u0019|\u0018<y]2\fI\u0010", "\u001b`g$h7&S'\rv`,\u000bw9F\u00078\nC", "\u001bnc6b5)O\u0018}~g.X\u00169u\t'jJ\u0011\u0015\u001a/]\u000e:", "\u001bnc6b5)O\u0018}~g.f\u0012\u001de\u000e6\u007fJ\n\u0005&C|\u001d$d%3", "\u001dqX2a;:b\u001d\t\u0004>=|\u0012>sm$\u0004K\b\u0017\u0002G|\u0012Fu", "\u001dqX2a;:b\u001d\t\u0004>=|\u0012>sm(\u0005N\u000b$\u0004Gq\u0012J\u000621h\u0002*@L\u00165IW", "\u001eq^E\\4Bb-^\f^5\f\u0017\u001da\b3\u0003@k\u0017$Ky\r", "\u001eq^E\\4Bb-^\f^5\f\u0017\u001de\t6\u0006Mm\u0017\u0019K}\u001dIr49c\u0007~7t\u0012B", "!d]@b9L2\u0019|~f(\u0004s<e},\nD\u000b \u0002Qs\u0017K\u0005", "!g^B_+(d\u0019\f\bb+|o9c{/bJ\u0003}\u0017Xo\u0015", "5dc [6NZ\u0018h\f^9\n\r.ef2y<\b}!IV\u000eMv,", "u(I", "!kPCX\u0012>S$Z\u0002b=|l8t\u007f5\r<\b", "!rX1G9N\\\u0017z\nb6\u0006o/n\u00027~", "\"nd0[\u001aBh\u0019i\b^*\u0001\u00173o\t", "%dQ#\\,P1#\u0007\u0003n5\u0001\u0007+t\u00042\u0005-\u0001\u0015!Px\u000e:\u0006\t>h}-Hi\u001d", "%t_\u0010b4Fc\"\u0003xZ;\u0001\u00138B\u0010)|@\u000et\u0013Rk\f@\u00069", "%t_\u0016a*KS!~\u0004m(\u0004j<o\u00127~\u001d\u0001&)Go\u0017\u001dr)<i\u000b E", "%t_\u001aT?\"\\(~\bo(\u0004e/t\u0012({Ia\u0013\u001bN\u007f\u001b<\u0005", "%t_\u001aX:LO\u001b~cn4k\u0013\u001ce\u000f5\u0010", "%t_\u001aX:LO\u001b~g^;\n\u001d\u0013n\u000f(\tQ|\u001e", "%t_\u001fX:I]\"\rzM0\u0005\t9u\u000f", "3mP/_,\u001a^$\u0006~\\(\f\r9np(\tN\u0005! ", "3mP/_,#O\u001d\u0006wk,x\u000f\ro\u0007/{>\u0010\u001b!P", "7r??b?B[\u001d\u000e\u000f>=|\u0012>s", ":nV\u0019X=>Z", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#\u0005*9o\u001a7O\r\u001bR> {hr9\u000e9", "5dc\u0019b.%S*~\u0002", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i>w\u00180QL=5\u0014\u0005\u001fjH9\u0018c3$", "1n\\:b5LR\u001fFH'yv\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class ConfigurationDefaultValue {
    public static final int AccelerometerEventsSamplePeriod = 16;
    public static final int AccelerometerEventsSensorRegistrationDelay = 0;
    public static final double AccelerometerEventsThreshold = 0.0d;
    public static final long AudioEventCollectingInterval = 10000;
    public static final int BluetoothNameTruncationLength = 2;
    public static final int CollectorDataBufferSize = 10000;
    public static final long DataHarvesterInterval = 5000;
    public static final long DefaultWupRate = 5000;
    public static final long DeviceAppBackgroundDelayMillis = 100;
    public static final int DisplaysNameTruncationLength = 2;
    public static final int ElementTagValueMaxLength = 128;
    public static final boolean EnableAndroidIDFeature = true;
    public static final boolean EnableApplicationNameFeature = true;
    public static final boolean EnableAudioEventFeature = false;
    public static final boolean EnableAutoContext = false;
    public static final boolean EnableAutoElementId = false;
    public static final boolean EnableCoordinatesMasking = false;
    public static final boolean EnableCoresFeature = true;
    public static final boolean EnableDeviceApplicationsCollection = true;
    public static final boolean EnableDeviceFingerprintFeature = true;
    public static final boolean EnableDeviceHardwareFeature = true;
    public static final boolean EnableDeviceManufacturerFeature = true;
    public static final boolean EnableDeviceModelFeature = true;
    public static final boolean EnableDeviceProductFeature = true;
    public static final boolean EnableDisplayFeature = true;
    public static final boolean EnableDisplaysCollection = true;
    public static final boolean EnableElementValuesMasking = false;
    public static final boolean EnableEmulatorDetectorFeature = true;
    public static final boolean EnableGlobalTouchCollectionMode = true;
    public static final boolean EnableHybridSolution = false;
    public static final boolean EnableImeiCollection = false;
    public static final boolean EnableImsiCollection = false;
    public static final boolean EnableKeyboardsFeature = true;
    public static final boolean EnableLanguagesFeature = true;
    public static final boolean EnableLatestAccessPointsCollection = false;
    public static final boolean EnableLocalIPAddressFeature = true;
    public static final boolean EnableMACAddressFeature = true;
    public static final boolean EnableMainLanguageFeature = true;
    public static final boolean EnableMemoryFeature = true;
    public static final boolean EnableMouseEventsFeature = true;
    public static final boolean EnableMuidFeature = true;
    public static final boolean EnableMultiSimDataFeature = false;
    public static final boolean EnableNetworkInterfacesFeature = true;
    public static final boolean EnableOSVersionFeature = true;
    public static final boolean EnablePlatformFeature = true;
    public static final boolean EnableRequestIDFeature = true;
    public static final boolean EnableSimDataFeature = true;
    public static final boolean EnableSourceFeature = true;
    public static final boolean EnableTimeZoneFeature = true;
    public static final boolean EnableVersionFeature = true;
    public static final boolean EnableWupMessagesHashing = false;
    public static final int GyroEventsSamplePeriod = 16;
    public static final int GyroEventsSensorRegistrationDelay = 0;
    public static final double GyroEventsThreshold = 0.0d;
    public static final boolean IsAccelerometerEvents = true;
    public static final boolean IsAccessibilityEvents = true;
    public static final boolean IsAppUsingRengwuxianLibraryCustomComponents = false;
    public static final boolean IsApplicationEvents = true;
    public static final boolean IsBatteryStatusEvents = true;
    public static final boolean IsBluetooth = true;
    public static final boolean IsCallInfo = false;
    public static final boolean IsClipboardEvents = true;
    public static final boolean IsContextChange = true;
    public static final boolean IsDeviceOrientationEvents = true;
    public static final boolean IsElements = true;
    public static final boolean IsElementsEvents = true;
    public static final boolean IsElementsHierarchy = false;
    public static final boolean IsFlingEvents = true;
    public static final boolean IsGyroEvents = true;
    public static final boolean IsKeyEvents = true;
    public static final boolean IsLightEvents = true;
    public static final boolean IsLocationEvents = false;
    public static final boolean IsLongPressEvents = true;
    public static final boolean IsMotionAroundTouch = true;
    public static final boolean IsMotionOnSessionStart = true;
    public static final boolean IsOrientationEvents = true;
    public static final boolean IsPanEvents = true;
    public static final boolean IsPinchEvents = true;
    public static final boolean IsSensorList = true;
    public static final boolean IsSignificantMotionEvents = true;
    public static final boolean IsTapEvents = true;
    public static final boolean IsTouchEvents = true;
    public static final boolean IsVoip = false;
    public static final boolean IsWifiHistory = true;
    public static final boolean IsWifiInfoEvents = true;
    public static final boolean KeyEventsMaskSpecialChars = false;
    public static final int LightEventsSamplePeriod = 300;
    public static final int LightEventsSensorRegistrationDelay = 0;
    public static final long LocationEventsRequestDelaySec = 5;
    public static final long LocationEventsTimeoutMsec = 10000;
    public static final int LocationRefreshDistance = 1000;
    public static final long LocationRefreshTime = 5000;
    public static final int LogBufferSize = 10000;
    public static final int LogCommunicationBufferCapacity = 1000;
    public static final int LogIncrementalGrowthBetweenFailures = 3500;
    public static final int LogMaxIntervalBetweenFailures = 16000;
    public static final int LogMessageDispatchRateMsec = 5000;
    public static final int LogMessageNumToRetry = 5;
    public static final int LogMessageRetryInterval = 1000;
    public static final int MaxLogMessagesToFlush = 3;
    public static final int MaxSlavePingRetryCount = 10;
    public static final int MaxWupMessagesToFlush = 3;
    public static final long MotionPaddingAroundTouchMSec = 3000;
    public static final long MotionPaddingOnSessionStartMSec = 20000;
    public static final int OrientationEventsSamplePeriod = 16;
    public static final int OrientationEventsSensorRegistrationDelay = 0;
    public static final int ProximityEventsSamplePeriod = 0;
    public static final int ProximityEventsSensorRegistrationDelay = 0;
    public static final int SensorsDecimalPrecisionPoints = 4;
    public static final int SlaveKeepAliveInterval = 1000;
    public static final int SsidTruncationLength = 2;
    public static final int TouchSizePrecision = 3;
    public static final int WebViewCommunicationReconnectInterval = 1000;
    public static final int WupCommunicationBufferCapacity = 1000;
    public static final int WupIncrementalGrowthBetweenFailures = 3500;
    public static final int WupMaxIntervalBetweenFailures = 16000;
    public static final int WupMessageNumToRetry = 5;
    public static final int WupMessageRetryInterval = 1000;
    public static final int WupResponseTimeout = 5000;
    public static final boolean enableApplicationVersion = true;
    public static final boolean enableJailbreakCollection = true;
    public static final boolean isProximityEvents = true;
    public static final ConfigurationDefaultValue INSTANCE = new ConfigurationDefaultValue();
    private static final ELogLevel logLevel = ELogLevel.WARNING;
    private static final boolean ShouldOverrideLocalLogLevel = true;

    private ConfigurationDefaultValue() {
    }

    public final ELogLevel getLogLevel() {
        return logLevel;
    }

    public final boolean getShouldOverrideLocalLogLevel() {
        return ShouldOverrideLocalLogLevel;
    }
}
