package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$Record.<init>(JvmProtoBuf.java:368)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$Record.<init>(JvmProtoBuf.java:327)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$Record$1.parsePartialFrom(JvmProtoBuf.java:474)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$Record$1.parsePartialFrom(JvmProtoBuf.java:469)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readMessage(CodedInputStream.java:507)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:121)
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
/* JADX INFO: compiled from: TonalPalette.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0015\u001d<K!&i\u000eӵLш|\u0004W\u00068\f4ɂ}(ܥ(Մ7f\u00198pȍhX2`SB\u000f\u001a|D(i&\nCiV*\u00020\fgN\u0016h~Nh\u000f[\u000f4\u0017\tn:Nmx\f\u0013\u001f6PuW3{pM=n{N\u0005N32<\b\r\u0019\u001aXI z\tLc\f@1PtH\\%M3\u001b\"\nL+\u0019\u001e\u000bh^:Vxu:]$\u0013mP[?_^}]\u0011Tb?\r%b./NFM\u0015ST\u0013\u000b`kW\u0003mrM\tv8?+wtg:f\u0012,\u0015YP\u001da\u00019t\u0005\u007fa\u001c+9c{K~\u000f8{\t\u0011%<2\u000f\u0016+VDE\u001a\u0015\t\u001e7\u0003\nk@~\u0003nF\u000e\u0013y6E&\u001079R3f\u007fbK\u001d\\Q\u0014\u0005;\u001f3\u0005|<sT<a%\u001fb\u0014i1\u007fAML\\'q=\u001c\u0005\u0001f\u0010H\u001c0u\u0001?\u007f\u001fM/%e\\I'/\f\u001aHrh\u0007\tn\nki\u0001IP&|8O*7\rjHr(\u0004P\u0003Y<\u0015[@l\u0007,\t#$j\u001dT!S\u0011^Sv\u0010\u0003M\f\u000b53t^qn\u001a\u000fg=l[MQ\u0012\u0011qV\u0005=W<\u0011\u0006hjP}$Z\u000b)26V\u0016(w*E^\u0010!^WqJ5<5'\n-H1\u001fRE\u000b7wZ\u0017\u0011\u000fXAS\u001biRu\u0019\u0005^\r\to\u0016yY0\u000b\u0012:-oRE\u001d4\b:hb}3\u000b\r'\u0018G\u0016MWPzJ\u000eU*!&\u001eG\u0007G=A\u0010\u000f-@8EEzsuU[I?z+z\u001f?vf\u007f\b\u0019q<dx\u0004gTE#\u0007b\u0001] d.zqJ\t\u0003{T9\\NM\u0001?q<|9\r\t-[=\u0001\u001e#\r9;\u0002?\u001dDx$3#!ui\u001e/\nf\u001df\re2-s\u001a}$i]`<HMgAV\"Rm\u0013FV.\u0010\bp\nD\u0011A\rYd\u001fWHQ\u0019t\u0016f5-\u001dtd\"R\u0013\u001e~D2mq\fC,\u0015nG3YeS\u0016n}OjTb\u000f8\f\f5|\\4=NWgf\u0017{\u001esF7Q?pQT\tR5<@\u0016X[T\u0018\u0007 ~\u000e\u0015w\u000fE3RwI&&T']fL\u00131]`O+\u0011\u0003\u001d\u00056xc2\u0015qT'Gc`\u0002c!\u0017n\u0003O-g5/R)Q\u001bVY\u0011\u000fS3[I07\u0014K7D\u0004o:9(\u0001+\u001a0\u001bgRμcv>7[lrf|v@gǓMÝƏ}yէ\u0012D\u0012\u000f\u0019tgtu<;'\u001f\u000fEX2\u0001EEρ\u0006љǪbEɴ1\u000e=-K%\u0003\u0016-Xe.\f\u0015\u0016 8'2uמ[ަ̣e\tܤ\u001fB\u001eq$>\u001a\u000b\u0019..^~a\u0003\u0007\".67җ\u0001֯ű\u0012]̲o\u007f)@5\u0007\u0005\bH*vSZzzv\u0007U9\u0004ј0ؼԬm,ȃ!\u0011/M<np\\@paz)(\u000e&-&M7̃aϪ\u05faNb\u05cftsW[\u001b\u0007Gm0B?\u000b#5\f0\u0012u2+ƍ'ֽπUL̡h\u0011dlP3&`p\nrO\\@\"\r\u0017H\r\u0012Ի3Иߪ\u001dcԘ;!'[\u001b#x\t\n(W\u0001qH`N37`\fę'ϓؤ\u00029Ūx\b2B\u0017N\u0018i2\u0011T/\u000e15p<m\u0013\u0004ϲJԗҨA\u0007З\u0015\u0016\u0019/h\u00148@b~*\u0016\"JO')\u0001C9݆nޞڋ4iܱW-2\u0001\u000b\\%A\u007f\u0017y\u0015DN\u00010G\u000f\u001e\u001c̩eծŝ4dͺ+\u0014\neXZee\\uo\u0007\u001aLS4\u0012Un\u0001̢\u001e\u07fb܇\u0005t¡\u0004M9H8;tB\\[e^vADz\\#um֦rԁ·h\u0017Řhci4OV,\u001bJ'8\b=\u001eSX\u0001y9EֲDũ˗\u000e\u0005Ԡ7\u001f\u0005\u0010]MX-O\\[\n-tJ\u001d\f\u0004h3\u07bc5̖Œ?Xم\n5\u001aTqF\u0003oWJ\u001e\u0013b$\u001b\r\u00101\u0001a۴_߷ɺ&JŗJ>dx[\u001dz\rFz29~Y\u001a\u0013\u001e\u0016\\Iȿ\u0001Ѫ·_\u0014Θ7O{AUmn}'\n\u001f6u\u001d3n\u0003GmVÆW\u05edڳ2\nǮN`=ej`m#QR9oP\u000294_Vl\u001båWƙۿDcэ\u0014L\u0001D6IH26?\r5\u0014t\u000f!7=\u0004\u0016ؠ}Ʈƈ6Z܌\u00153?W|.m%3h\u0010]`X'\u0017#\u001e\u0002:\u009f\"ё֕0=ϳ\fdQU\u000bIa\u0012\tRX{\u007f\u001dM2YK\u001bWΧ>ϓۄ>}Ǯ$/,\u0006!\u007fzi\u0019[\u001c|0\u001aZ8n)vLķ\u0010ޯ\u0096i\u000eߪx\u00146\fF1\u001e?\f\u0004pv\u0006RmpD.\u001f\nĐNǪ˱)dݸj|aMS\u0007\u000e\u001bD%\u007fk4fmA\u0007Q\u000bYǼ\u0016Ϫܭ?\u0012̎\u001e%.a\n$A2\u001dJqH;\u000bby)YblǷcҵݱecٍgFDHzt~Q\u0004\u0011_\u001f3 n\u001d`A>cݣ+ȯͷGi\u07fb\u0005\tSa%oOF|\u001au\u000e\u000b9oMk]SHο\u0005\u0081Ň`vĐ\u007fe;6\u001bKD~\u001b|LAC\u001bz/e02lϮ1Ջݔ?\u001b\u07b2^/uh\u0016\u0006&\u000e\u0003}:I$i_\u001f7r\u0013\u007fն\u001d֦ӚV8ݦ%\u001b\u000b\u0019JcJO^t|3-<<$\u001e\u001f@Cݦ4Ζσrz٬[yW4kyA\u007for.g<)\u0012\u000bb#}jЪ\u0010ѭůLv˱]DaA\u0010e:+*\u0004#\u0002R_ByJ\"Q\u0002ڬ5Σːemޓ)\u0011m\f=P\u000e\u00108jLN7tuZY=\u0004^͜DԜŃp\u0007ߌMu\u0007+Uia\u0018@MZHFsKy.25p˸0։Ն_Zב\u001b\u0001\u0010bBGR~MǠ\u0013x&~2h\u0015\u0007l%Q߆\u000fùբ\f\u0013حB|1#N\u0001wcmՒ:\u0017KmO_i|\u000br\u0012ݙ_ӮԵ\u0011\u000eǲ\\o\u0016\u001b\u0010`cg Ҵ8SS\u0011c#~\u001cg\u0012Rܫfɵ͟'.ޣ{\u001f>\u001d\u000e\u0011Q\u0010yϩ]CB/!cE&'\u001dPʤpȗ¥F\\ф$8c\b\u001c&~OV֏@\u0015G~\u000f\u0005\u0014/?C\u0003ʀDڨƸBd߅k\u000e>lI9\u0001Vj҉\u001d|6,?>\u001e\u001e!ABݵ\u0015̶ɧ\u0007~ޛ_=Wu\u000f\u001c`\u0016\u0012˗B<bd\u001dsk\u001d58Bم>؎ˍ\u0018*џcgJ\u0005\u001b\u00019+\u0011ģ'oGc\b#F:CAw̭lրé\u001bH֣\r6Yv\tuJ\u0013&ڟ\u000fMdczl\u0015\u0018!w1ەrպ݄Kl߱2swj\u0006:(Rwƌ\\\rR\u0007]6,>Ri\u0015\u00ad[ÇоZ'۳\u001b\u0017&\u001f8\u007fJ\u000ftІ\u001ajCN\b\u0005mz\u0012\u000f5Ͼ4үם4*ŗ\u0005/\t\u0001\u0017~u.\u001aŤXc!5't\u0011hC@_ܖ=ůЦ\u00070ې\b\u000fSe@wQL\u007fӛjB\u001brBpQ<e:\u000eۊO\u009fѭ5^Ԭ&BD\u001b\u0002\f\u0017\u001a\u0017֒i\u0003^\u007f^\u001f/!p_3܀^̓М+]ءtt\u0002/^.YPtȔ\u0019%\u0001\tyETceP\u001dʍfҹԀ$\u0014֟#s\u0014t\u0011xMtbλ)M\\V<\"}\u00176\u001fDݴ=ؚކ3\u0013Ș&kq4<\u001ezR0Ό\u0011s)wo\u007f\u001f+ab~ƸLߔԛ]Hܧ\u0011/+-\u0019vB\u0006RśPAG4_c0t\r=2¨h֠ϥKt\u05c8\u0002%:qNS\u000bdqǵD\u000ery\\WiJ\u0002:QЊnհޗH\u0011χ\u000fK\u001a\u0013@\u001c6\u0003!ަeW\u000f\u0019\u000ejm\u0005]r*ؿ\r˧˒l=аQN^.\u0014\u00125bp͢r\u000517+MM*\u0016+\u007fţlɒմd%̓.O\bSA=\u0014ZYײ\u000eVq\u0003|Bw,\u001f9\u001fߝSɆԴ\nN܉8'@L\u0007\"fHgő-0t3@\u001bb\to~;ة\u007fҩۦ8:ݨw]h9\u007f<\u000fZ-ėgEp[\n@vd_\r\"ٷ^ޚտI\u001cԼ\u0017\\\nQ;.S:M̈\u0007e!= <Q]iMpɯ7ܘϚJiĒ+H_wi<BC\nѩ'#\u001fp> q%>k\u001f˛\u0013ʓĀ\u0004\nزTm\nrXu-nVЪ6  \u000e[c*sqi&ەI¶Ä$%ٓ\r#1gz\u0002\r\u0018tɅ\u000b_\u0014.H?\u000fz\n\u0018RҲ\u000fߐ٠\u001b3ϙ&b\u001aA$v\u0001$?݉fW\u000e\u0006\u001c\u001c\u0019ho-2ҧs˕܈aW֭6\f&CHT m^\u008e\u0018\n3?zTrw.t\u001aɛ!\u07b6ͷevѥ-B(bv\\\u000eu_ߛ\u0015l\u0002COkE\u0018o\u0016FǞFΡ܋d\u001fֲV\u0004$YbH'm~ћDJ?GZ:\bdvN\r\u0605Oԙע\u001e9ڀ}1t(S\u0005\t(bφI\\,a)\u0002\u001f\u0015$-a˕=ǯۧ5\u0006ڊ\u0017K\u001fz\u0018M%\\>̼sD \u001eqodJahu£\u007fˎϼ\u0012\u0003ɤ3\u001dd[vXBxo\u009b+>~\u0014\u0004O\u0012=!?$Ļ\u000b\u008fۏ_y՞dj2C\u0015`>\u001aM֑I\u0002#?\u0019N\"\u0007VeIө-Հƌ\u0006\"һp#\u001ck^\tqxlŐdF^M+k\u0005zL;\u0012ڟ)ϣÂ\u001bIدQR[;?\u0002$\u0017AɉR_LTF\u001c2)2-\u0001ε5ӣƥ`sԶ{EMBkE#Q<۲\u0005\u001d%%\u000b\u0012\b\u0014\u0015z\u0012ғ[ҹԶ\u0004]Ƨa(/\u000e\tbH \u0003\u05cbdR\bR(tv\nD<NØ\u0017ۼل8 ǎo\r}ue@/EQ\u0092\u001a\u000e\u001cSJ\u000e\u0011@j\u0016oىCՀؗ\u001b=ͯYu\u0017N)\u0012~!LҴ$[??&2`(R\u0016;֪=ҐوFM߭h\u0016tfj\u0001dPzל1#Yc[0UW;Mxæeԏ\u05ebcyǘ+\u001c3zij\u00138Mʙ[s}\u0005x+fe\"\u0002^҃9ôң\u0014|Ȳ\f)P\u0018\u000f\tf5+ܱj1LYZ~\u0016gn\u0007i̅\u001dˮɤa)ڨ\u000b\u0010.6V}C\u00163֍\u0002\u0012=\u0002l\t;_OH\u0016\u05c9GωЗ\u0015\u0016ҐT\u0016e\u0018U\u001b_Vjߏ6\u000e:8c d@,]\u0011ޕLڨԯ)u˜18V\u0016\fy\u000ft\u001bƮO2n\u0003j\rL<8H)ڕ\u0013گٱ\u001cg\u07b3\u007f\u00155PI\u0017!\u0011Tڏo\u0013\f0\r}A}\u001f\u0001\f\u07fcaȢֱ@Gϑ\u001d4Y>-N|G1ۘ1X\u001eb6=}A:7oӴ#х۵\u0004w˳[p!c9OVdKɪ1P`{\"\u0018\\BXf\u001aϒa˦öm\u0012ԁ\u0003]Q@vPZq\u000fۧ06g¹PsE>FË\u001bTo3G3Nђ!҉\f"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e/>U\u0005\u000b3t\u0016=\\C\u0011", "", "<ddAe(E\u001fcI", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "<ddAe(E'l", "<ddAe(E'k", "<ddAe(E'i", "<ddAe(E'h", "<ddAe(E'g", "<ddAe(E'e", "<ddAe(E'c", "<ddAe(E&j", "<ddAe(E&c", "<ddAe(E%c", "<ddAe(E$c", "<ddAe(E#c", "<ddAe(E\"c", "<ddAe(E!c", "<ddAe(E g", "<ddAe(E e", "<ddAe(E c", "<ddAe(E\u001fj", "<ddAe(E\u001fe", "<ddAe(E\u001fc", "<ddAe(E$", "<ddAe(E\"", "<ddAe(E\u001e", "<ddAe(ED\u0015\f~Z5\fTy0", "<ddAe(ED\u0015\f~Z5\f\\\u0003", "<ddAe(ED\u0015\f~Z5\f\\\u0002", "<ddAe(ED\u0015\f~Z5\f\\\u007f", "<ddAe(ED\u0015\f~Z5\f\\~", "<ddAe(ED\u0015\f~Z5\f\\}", "<ddAe(ED\u0015\f~Z5\f\\{", "<ddAe(ED\u0015\f~Z5\f\\y", "<ddAe(ED\u0015\f~Z5\f[\u0001", "<ddAe(ED\u0015\f~Z5\f[y", "<ddAe(ED\u0015\f~Z5\fZy", "<ddAe(ED\u0015\f~Z5\fYy", "<ddAe(ED\u0015\f~Z5\fXy", "<ddAe(ED\u0015\f~Z5\fWy", "<ddAe(ED\u0015\f~Z5\fVy", "<ddAe(ED\u0015\f~Z5\fU}", "<ddAe(ED\u0015\f~Z5\fU{", "<ddAe(ED\u0015\f~Z5\fUy", "<ddAe(ED\u0015\f~Z5\fT\u0001", "<ddAe(ED\u0015\f~Z5\fT{", "<ddAe(ED\u0015\f~Z5\fTy", "<ddAe(ED\u0015\f~Z5\fY", "<ddAe(ED\u0015\f~Z5\fW", "<ddAe(ED\u0015\f~Z5\fS", ">qX:T9R\u001fcI", ">qX:T9R'l", ">qX:T9R'h", ">qX:T9R'c", ">qX:T9R&c", ">qX:T9R%c", ">qX:T9R$c", ">qX:T9R#c", ">qX:T9R\"c", ">qX:T9R!c", ">qX:T9R c", ">qX:T9R\u001fc", ">qX:T9R\u001e", "AdR<a+:`-JE)", "AdR<a+:`-RN", "AdR<a+:`-RJ", "AdR<a+:`-RE", "AdR<a+:`-QE", "AdR<a+:`-PE", "AdR<a+:`-OE", "AdR<a+:`-NE", "AdR<a+:`-ME", "AdR<a+:`-LE", "AdR<a+:`-KE", "AdR<a+:`-JE", "AdR<a+:`-I", "BdaA\\(KgdIE", "BdaA\\(KglR", "BdaA\\(KglN", "BdaA\\(KglI", "BdaA\\(KgkI", "BdaA\\(KgjI", "BdaA\\(KgiI", "BdaA\\(KghI", "BdaA\\(KggI", "BdaA\\(KgfI", "BdaA\\(KgeI", "BdaA\\(KgdI", "BdaA\\(Kgc", "uI9\u0017=\u0011#8}c_C\u0011am\u0014Jd\r`%e{{,Tr![\n\u001a>b\u0005\u001cRz\u00132( P\u0019\u0003yMF\u001ekH\u00113[\f,13\u0011A7W\"xv?r3\u0010qi>&\tS)\u001c\u0004l\u0011.f Mepzr\u001aQvLe\u0017K\u0003^zR12JbnyTJAisC\f`\u0019lAI\u0002\u001ez'*u`,\u0019\u0006`xn_\u007fgt\u001d\\k", "5dc\u001bX<M`\u0015\u0006E&v{Z)K\u0005\u0018", "u(9", "\u0018", "5dc\u001bX<M`\u0015\u0006F)sG\b\u0001_e-k", "5dc\u001bX<M`\u0015\u0006F)vDS.7y\u000e\u00010", "5dc\u001bX<M`\u0015\u0006F+sG\b\u0001_e-k", "5dc\u001bX<M`\u0015\u0006F0sG\b\u0001_e-k", "5dc\u001bX<M`\u0015\u0006G)sG\b\u0001_e-k", "5dc\u001bX<M`\u0015\u0006G+sG\b\u0001_e-k", "5dc\u001bX<M`\u0015\u0006G-sG\b\u0001_e-k", "5dc\u001bX<M`\u0015\u0006H)sG\b\u0001_e-k", "5dc\u001bX<M`\u0015\u0006I&v{Z)K\u0005\u0018", "5dc\u001bX<M`\u0015\u0006I)sG\b\u0001_e-k", "5dc\u001bX<M`\u0015\u0006J)sG\b\u0001_e-k", "5dc\u001bX<M`\u0015\u0006K&v{Z)K\u0005\u0018", "5dc\u001bX<M`\u0015\u0006K)sG\b\u0001_e-k", "5dc\u001bX<M`\u0015\u0006L)sG\b\u0001_e-k", "5dc\u001bX<M`\u0015\u0006M)sG\b\u0001_e-k", "5dc\u001bX<M`\u0015\u0006M0sG\b\u0001_e-k", "5dc\u001bX<M`\u0015\u0006N)sG\b\u0001_e-k", "5dc\u001bX<M`\u0015\u0006N+sG\b\u0001_e-k", "5dc\u001bX<M`\u0015\u0006N-sG\b\u0001_e-k", "5dc\u001bX<M`\u0015\u0006N.sG\b\u0001_e-k", "5dc\u001bX<M`\u0015\u0006N/sG\b\u0001_e-k", "5dc\u001bX<M`\u0015\u0006N1sG\b\u0001_e-k", "5dc\u001bX<M`\u0015\u0006N2sG\b\u0001_e-k", "5dc\u001bX<M`\u0015\u0006kZ9\u0001\u00058tJoF?R\u0011|L_", "5dc\u001bX<M`\u0015\u0006kZ9\u0001\u00058tKrC\u000b\u007fh\u0011-t}", "5dc\u001bX<M`\u0015\u0006kZ9\u0001\u00058tKrF\bK\u0016hAU\u0013,", "5dc\u001bX<M`\u0015\u0006kZ9\u0001\u00058tKtC\u000b\u007fh\u0011-t}", "5dc\u001bX<M`\u0015\u0006kZ9\u0001\u00058tKyC\u000b\u007fh\u0011-t}", "5dc\u001bX<M`\u0015\u0006kZ9\u0001\u00058tLrC\u000b\u007fh\u0011-t}", "5dc\u001bX<M`\u0015\u0006kZ9\u0001\u00058tLtC\u000b\u007fh\u0011-t}", "5dc\u001bX<M`\u0015\u0006kZ9\u0001\u00058tLvC\u000b\u007fh\u0011-t}", "5dc\u001bX<M`\u0015\u0006kZ9\u0001\u00058tMrC\u000b\u007fh\u0011-t}", "5dc\u001bX<M`\u0015\u0006kZ9\u0001\u00058tNoF?R\u0011|L_", "5dc\u001bX<M`\u0015\u0006kZ9\u0001\u00058tNrC\u000b\u007fh\u0011-t}", "5dc\u001bX<M`\u0015\u0006kZ9\u0001\u00058tOrC\u000b\u007fh\u0011-t}", "5dc\u001bX<M`\u0015\u0006kZ9\u0001\u00058tPoF?R\u0011|L_", "5dc\u001bX<M`\u0015\u0006kZ9\u0001\u00058tPrC\u000b\u007fh\u0011-t}", "5dc\u001bX<M`\u0015\u0006kZ9\u0001\u00058tQrC\u000b\u007fh\u0011-t}", "5dc\u001bX<M`\u0015\u0006kZ9\u0001\u00058tRrC\u000b\u007fh\u0011-t}", "5dc\u001bX<M`\u0015\u0006kZ9\u0001\u00058tRyC\u000b\u007fh\u0011-t}", "5dc\u001bX<M`\u0015\u0006kZ9\u0001\u00058tSrC\u000b\u007fh\u0011-t}", "5dc\u001bX<M`\u0015\u0006kZ9\u0001\u00058tStC\u000b\u007fh\u0011-t}", "5dc\u001bX<M`\u0015\u0006kZ9\u0001\u00058tSvC\u000b\u007fh\u0011-t}", "5dc\u001bX<M`\u0015\u0006kZ9\u0001\u00058tSwC\u000b\u007fh\u0011-t}", "5dc\u001bX<M`\u0015\u0006kZ9\u0001\u00058tSxC\u000b\u007fh\u0011-t}", "5dc\u001bX<M`\u0015\u0006kZ9\u0001\u00058tSzC\u000b\u007fh\u0011-t}", "5dc\u001bX<M`\u0015\u0006kZ9\u0001\u00058tS{C\u000b\u007fh\u0011-t}", "5dc\u001de0FO&\u0013E&v{Z)K\u0005\u0018", "5dc\u001de0FO&\u0013F)sG\b\u0001_e-k", "5dc\u001de0FO&\u0013F)vDS.7y\u000e\u00010", "5dc\u001de0FO&\u0013G)sG\b\u0001_e-k", "5dc\u001de0FO&\u0013H)sG\b\u0001_e-k", "5dc\u001de0FO&\u0013I)sG\b\u0001_e-k", "5dc\u001de0FO&\u0013J)sG\b\u0001_e-k", "5dc\u001de0FO&\u0013K)sG\b\u0001_e-k", "5dc\u001de0FO&\u0013L)sG\b\u0001_e-k", "5dc\u001de0FO&\u0013M)sG\b\u0001_e-k", "5dc\u001de0FO&\u0013N)sG\b\u0001_e-k", "5dc\u001de0FO&\u0013N.sG\b\u0001_e-k", "5dc\u001de0FO&\u0013N2sG\b\u0001_e-k", "5dc X*H\\\u0018z\brvDS.7y\u000e\u00010", "5dc X*H\\\u0018z\brwGPydQ\"aEp", "5dc X*H\\\u0018z\brwGSv0~yu&\u0006\u0007", "5dc X*H\\\u0018z\brxGPydQ\"aEp", "5dc X*H\\\u0018z\bryGPydQ\"aEp", "5dc X*H\\\u0018z\brzGPydQ\"aEp", "5dc X*H\\\u0018z\br{GPydQ\"aEp", "5dc X*H\\\u0018z\br|GPydQ\"aEp", "5dc X*H\\\u0018z\br}GPydQ\"aEp", "5dc X*H\\\u0018z\br~GPydQ\"aEp", "5dc X*H\\\u0018z\br\u007fGPydQ\"aEp", "5dc X*H\\\u0018z\br\u007fLPydQ\"aEp", "5dc X*H\\\u0018z\br\u007fPPydQ\"aEp", "5dc!X9MW\u0015\f\u000f)sG\b\u0001_e-k", "5dc!X9MW\u0015\f\u000f*vDS.7y\u000e\u00010", "5dc!X9MW\u0015\f\u000f*vGPydQ\"aEp", "5dc!X9MW\u0015\f\u000f+vDS.7y\u000e\u00010", "5dc!X9MW\u0015\f\u000f,vDS.7y\u000e\u00010", "5dc!X9MW\u0015\f\u000f-vDS.7y\u000e\u00010", "5dc!X9MW\u0015\f\u000f.vDS.7y\u000e\u00010", "5dc!X9MW\u0015\f\u000f/vDS.7y\u000e\u00010", "5dc!X9MW\u0015\f\u000f0vDS.7y\u000e\u00010", "5dc!X9MW\u0015\f\u000f1vDS.7y\u000e\u00010", "5dc!X9MW\u0015\f\u000f2vDS.7y\u000e\u00010", "5dc!X9MW\u0015\f\u000f2{DS.7y\u000e\u00010", "5dc!X9MW\u0015\f\u000f2\u007fDS.7y\u000e\u00010", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TonalPalette {
    public static final int $stable = 0;
    private final long neutral0;
    private final long neutral10;
    private final long neutral100;
    private final long neutral12;
    private final long neutral17;
    private final long neutral20;
    private final long neutral22;
    private final long neutral24;
    private final long neutral30;
    private final long neutral4;
    private final long neutral40;
    private final long neutral50;
    private final long neutral6;
    private final long neutral60;
    private final long neutral70;
    private final long neutral80;
    private final long neutral87;
    private final long neutral90;
    private final long neutral92;
    private final long neutral94;
    private final long neutral95;
    private final long neutral96;
    private final long neutral98;
    private final long neutral99;
    private final long neutralVariant0;
    private final long neutralVariant10;
    private final long neutralVariant100;
    private final long neutralVariant12;
    private final long neutralVariant17;
    private final long neutralVariant20;
    private final long neutralVariant22;
    private final long neutralVariant24;
    private final long neutralVariant30;
    private final long neutralVariant4;
    private final long neutralVariant40;
    private final long neutralVariant50;
    private final long neutralVariant6;
    private final long neutralVariant60;
    private final long neutralVariant70;
    private final long neutralVariant80;
    private final long neutralVariant87;
    private final long neutralVariant90;
    private final long neutralVariant92;
    private final long neutralVariant94;
    private final long neutralVariant95;
    private final long neutralVariant96;
    private final long neutralVariant98;
    private final long neutralVariant99;
    private final long primary0;
    private final long primary10;
    private final long primary100;
    private final long primary20;
    private final long primary30;
    private final long primary40;
    private final long primary50;
    private final long primary60;
    private final long primary70;
    private final long primary80;
    private final long primary90;
    private final long primary95;
    private final long primary99;
    private final long secondary0;
    private final long secondary10;
    private final long secondary100;
    private final long secondary20;
    private final long secondary30;
    private final long secondary40;
    private final long secondary50;
    private final long secondary60;
    private final long secondary70;
    private final long secondary80;
    private final long secondary90;
    private final long secondary95;
    private final long secondary99;
    private final long tertiary0;
    private final long tertiary10;
    private final long tertiary100;
    private final long tertiary20;
    private final long tertiary30;
    private final long tertiary40;
    private final long tertiary50;
    private final long tertiary60;
    private final long tertiary70;
    private final long tertiary80;
    private final long tertiary90;
    private final long tertiary95;
    private final long tertiary99;

    public /* synthetic */ TonalPalette(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49, long j50, long j51, long j52, long j53, long j54, long j55, long j56, long j57, long j58, long j59, long j60, long j61, long j62, long j63, long j64, long j65, long j66, long j67, long j68, long j69, long j70, long j71, long j72, long j73, long j74, long j75, long j76, long j77, long j78, long j79, long j80, long j81, long j82, long j83, long j84, long j85, long j86, long j87, long j88, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j40, j41, j42, j43, j44, j45, j46, j47, j48, j49, j50, j51, j52, j53, j54, j55, j56, j57, j58, j59, j60, j61, j62, j63, j64, j65, j66, j67, j68, j69, j70, j71, j72, j73, j74, j75, j76, j77, j78, j79, j80, j81, j82, j83, j84, j85, j86, j87, j88);
    }

    private TonalPalette(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49, long j50, long j51, long j52, long j53, long j54, long j55, long j56, long j57, long j58, long j59, long j60, long j61, long j62, long j63, long j64, long j65, long j66, long j67, long j68, long j69, long j70, long j71, long j72, long j73, long j74, long j75, long j76, long j77, long j78, long j79, long j80, long j81, long j82, long j83, long j84, long j85, long j86, long j87, long j88) {
        this.neutral100 = j2;
        this.neutral99 = j3;
        this.neutral98 = j4;
        this.neutral96 = j5;
        this.neutral95 = j6;
        this.neutral94 = j7;
        this.neutral92 = j8;
        this.neutral90 = j9;
        this.neutral87 = j10;
        this.neutral80 = j11;
        this.neutral70 = j12;
        this.neutral60 = j13;
        this.neutral50 = j14;
        this.neutral40 = j15;
        this.neutral30 = j16;
        this.neutral24 = j17;
        this.neutral22 = j18;
        this.neutral20 = j19;
        this.neutral17 = j20;
        this.neutral12 = j21;
        this.neutral10 = j22;
        this.neutral6 = j23;
        this.neutral4 = j24;
        this.neutral0 = j25;
        this.neutralVariant100 = j26;
        this.neutralVariant99 = j27;
        this.neutralVariant98 = j28;
        this.neutralVariant96 = j29;
        this.neutralVariant95 = j30;
        this.neutralVariant94 = j31;
        this.neutralVariant92 = j32;
        this.neutralVariant90 = j33;
        this.neutralVariant87 = j34;
        this.neutralVariant80 = j35;
        this.neutralVariant70 = j36;
        this.neutralVariant60 = j37;
        this.neutralVariant50 = j38;
        this.neutralVariant40 = j39;
        this.neutralVariant30 = j40;
        this.neutralVariant24 = j41;
        this.neutralVariant22 = j42;
        this.neutralVariant20 = j43;
        this.neutralVariant17 = j44;
        this.neutralVariant12 = j45;
        this.neutralVariant10 = j46;
        this.neutralVariant6 = j47;
        this.neutralVariant4 = j48;
        this.neutralVariant0 = j49;
        this.primary100 = j50;
        this.primary99 = j51;
        this.primary95 = j52;
        this.primary90 = j53;
        this.primary80 = j54;
        this.primary70 = j55;
        this.primary60 = j56;
        this.primary50 = j57;
        this.primary40 = j58;
        this.primary30 = j59;
        this.primary20 = j60;
        this.primary10 = j61;
        this.primary0 = j62;
        this.secondary100 = j63;
        this.secondary99 = j64;
        this.secondary95 = j65;
        this.secondary90 = j66;
        this.secondary80 = j67;
        this.secondary70 = j68;
        this.secondary60 = j69;
        this.secondary50 = j70;
        this.secondary40 = j71;
        this.secondary30 = j72;
        this.secondary20 = j73;
        this.secondary10 = j74;
        this.secondary0 = j75;
        this.tertiary100 = j76;
        this.tertiary99 = j77;
        this.tertiary95 = j78;
        this.tertiary90 = j79;
        this.tertiary80 = j80;
        this.tertiary70 = j81;
        this.tertiary60 = j82;
        this.tertiary50 = j83;
        this.tertiary40 = j84;
        this.tertiary30 = j85;
        this.tertiary20 = j86;
        this.tertiary10 = j87;
        this.tertiary0 = j88;
    }

    /* JADX INFO: renamed from: getNeutral100-0d7_KjU, reason: not valid java name */
    public final long m2773getNeutral1000d7_KjU() {
        return this.neutral100;
    }

    /* JADX INFO: renamed from: getNeutral99-0d7_KjU, reason: not valid java name */
    public final long m2794getNeutral990d7_KjU() {
        return this.neutral99;
    }

    /* JADX INFO: renamed from: getNeutral98-0d7_KjU, reason: not valid java name */
    public final long m2793getNeutral980d7_KjU() {
        return this.neutral98;
    }

    /* JADX INFO: renamed from: getNeutral96-0d7_KjU, reason: not valid java name */
    public final long m2792getNeutral960d7_KjU() {
        return this.neutral96;
    }

    /* JADX INFO: renamed from: getNeutral95-0d7_KjU, reason: not valid java name */
    public final long m2791getNeutral950d7_KjU() {
        return this.neutral95;
    }

    /* JADX INFO: renamed from: getNeutral94-0d7_KjU, reason: not valid java name */
    public final long m2790getNeutral940d7_KjU() {
        return this.neutral94;
    }

    /* JADX INFO: renamed from: getNeutral92-0d7_KjU, reason: not valid java name */
    public final long m2789getNeutral920d7_KjU() {
        return this.neutral92;
    }

    /* JADX INFO: renamed from: getNeutral90-0d7_KjU, reason: not valid java name */
    public final long m2788getNeutral900d7_KjU() {
        return this.neutral90;
    }

    /* JADX INFO: renamed from: getNeutral87-0d7_KjU, reason: not valid java name */
    public final long m2787getNeutral870d7_KjU() {
        return this.neutral87;
    }

    /* JADX INFO: renamed from: getNeutral80-0d7_KjU, reason: not valid java name */
    public final long m2786getNeutral800d7_KjU() {
        return this.neutral80;
    }

    /* JADX INFO: renamed from: getNeutral70-0d7_KjU, reason: not valid java name */
    public final long m2785getNeutral700d7_KjU() {
        return this.neutral70;
    }

    /* JADX INFO: renamed from: getNeutral60-0d7_KjU, reason: not valid java name */
    public final long m2784getNeutral600d7_KjU() {
        return this.neutral60;
    }

    /* JADX INFO: renamed from: getNeutral50-0d7_KjU, reason: not valid java name */
    public final long m2782getNeutral500d7_KjU() {
        return this.neutral50;
    }

    /* JADX INFO: renamed from: getNeutral40-0d7_KjU, reason: not valid java name */
    public final long m2781getNeutral400d7_KjU() {
        return this.neutral40;
    }

    /* JADX INFO: renamed from: getNeutral30-0d7_KjU, reason: not valid java name */
    public final long m2779getNeutral300d7_KjU() {
        return this.neutral30;
    }

    /* JADX INFO: renamed from: getNeutral24-0d7_KjU, reason: not valid java name */
    public final long m2778getNeutral240d7_KjU() {
        return this.neutral24;
    }

    /* JADX INFO: renamed from: getNeutral22-0d7_KjU, reason: not valid java name */
    public final long m2777getNeutral220d7_KjU() {
        return this.neutral22;
    }

    /* JADX INFO: renamed from: getNeutral20-0d7_KjU, reason: not valid java name */
    public final long m2776getNeutral200d7_KjU() {
        return this.neutral20;
    }

    /* JADX INFO: renamed from: getNeutral17-0d7_KjU, reason: not valid java name */
    public final long m2775getNeutral170d7_KjU() {
        return this.neutral17;
    }

    /* JADX INFO: renamed from: getNeutral12-0d7_KjU, reason: not valid java name */
    public final long m2774getNeutral120d7_KjU() {
        return this.neutral12;
    }

    /* JADX INFO: renamed from: getNeutral10-0d7_KjU, reason: not valid java name */
    public final long m2772getNeutral100d7_KjU() {
        return this.neutral10;
    }

    /* JADX INFO: renamed from: getNeutral6-0d7_KjU, reason: not valid java name */
    public final long m2783getNeutral60d7_KjU() {
        return this.neutral6;
    }

    /* JADX INFO: renamed from: getNeutral4-0d7_KjU, reason: not valid java name */
    public final long m2780getNeutral40d7_KjU() {
        return this.neutral4;
    }

    /* JADX INFO: renamed from: getNeutral0-0d7_KjU, reason: not valid java name */
    public final long m2771getNeutral00d7_KjU() {
        return this.neutral0;
    }

    /* JADX INFO: renamed from: getNeutralVariant100-0d7_KjU, reason: not valid java name */
    public final long m2797getNeutralVariant1000d7_KjU() {
        return this.neutralVariant100;
    }

    /* JADX INFO: renamed from: getNeutralVariant99-0d7_KjU, reason: not valid java name */
    public final long m2818getNeutralVariant990d7_KjU() {
        return this.neutralVariant99;
    }

    /* JADX INFO: renamed from: getNeutralVariant98-0d7_KjU, reason: not valid java name */
    public final long m2817getNeutralVariant980d7_KjU() {
        return this.neutralVariant98;
    }

    /* JADX INFO: renamed from: getNeutralVariant96-0d7_KjU, reason: not valid java name */
    public final long m2816getNeutralVariant960d7_KjU() {
        return this.neutralVariant96;
    }

    /* JADX INFO: renamed from: getNeutralVariant95-0d7_KjU, reason: not valid java name */
    public final long m2815getNeutralVariant950d7_KjU() {
        return this.neutralVariant95;
    }

    /* JADX INFO: renamed from: getNeutralVariant94-0d7_KjU, reason: not valid java name */
    public final long m2814getNeutralVariant940d7_KjU() {
        return this.neutralVariant94;
    }

    /* JADX INFO: renamed from: getNeutralVariant92-0d7_KjU, reason: not valid java name */
    public final long m2813getNeutralVariant920d7_KjU() {
        return this.neutralVariant92;
    }

    /* JADX INFO: renamed from: getNeutralVariant90-0d7_KjU, reason: not valid java name */
    public final long m2812getNeutralVariant900d7_KjU() {
        return this.neutralVariant90;
    }

    /* JADX INFO: renamed from: getNeutralVariant87-0d7_KjU, reason: not valid java name */
    public final long m2811getNeutralVariant870d7_KjU() {
        return this.neutralVariant87;
    }

    /* JADX INFO: renamed from: getNeutralVariant80-0d7_KjU, reason: not valid java name */
    public final long m2810getNeutralVariant800d7_KjU() {
        return this.neutralVariant80;
    }

    /* JADX INFO: renamed from: getNeutralVariant70-0d7_KjU, reason: not valid java name */
    public final long m2809getNeutralVariant700d7_KjU() {
        return this.neutralVariant70;
    }

    /* JADX INFO: renamed from: getNeutralVariant60-0d7_KjU, reason: not valid java name */
    public final long m2808getNeutralVariant600d7_KjU() {
        return this.neutralVariant60;
    }

    /* JADX INFO: renamed from: getNeutralVariant50-0d7_KjU, reason: not valid java name */
    public final long m2806getNeutralVariant500d7_KjU() {
        return this.neutralVariant50;
    }

    /* JADX INFO: renamed from: getNeutralVariant40-0d7_KjU, reason: not valid java name */
    public final long m2805getNeutralVariant400d7_KjU() {
        return this.neutralVariant40;
    }

    /* JADX INFO: renamed from: getNeutralVariant30-0d7_KjU, reason: not valid java name */
    public final long m2803getNeutralVariant300d7_KjU() {
        return this.neutralVariant30;
    }

    /* JADX INFO: renamed from: getNeutralVariant24-0d7_KjU, reason: not valid java name */
    public final long m2802getNeutralVariant240d7_KjU() {
        return this.neutralVariant24;
    }

    /* JADX INFO: renamed from: getNeutralVariant22-0d7_KjU, reason: not valid java name */
    public final long m2801getNeutralVariant220d7_KjU() {
        return this.neutralVariant22;
    }

    /* JADX INFO: renamed from: getNeutralVariant20-0d7_KjU, reason: not valid java name */
    public final long m2800getNeutralVariant200d7_KjU() {
        return this.neutralVariant20;
    }

    /* JADX INFO: renamed from: getNeutralVariant17-0d7_KjU, reason: not valid java name */
    public final long m2799getNeutralVariant170d7_KjU() {
        return this.neutralVariant17;
    }

    /* JADX INFO: renamed from: getNeutralVariant12-0d7_KjU, reason: not valid java name */
    public final long m2798getNeutralVariant120d7_KjU() {
        return this.neutralVariant12;
    }

    /* JADX INFO: renamed from: getNeutralVariant10-0d7_KjU, reason: not valid java name */
    public final long m2796getNeutralVariant100d7_KjU() {
        return this.neutralVariant10;
    }

    /* JADX INFO: renamed from: getNeutralVariant6-0d7_KjU, reason: not valid java name */
    public final long m2807getNeutralVariant60d7_KjU() {
        return this.neutralVariant6;
    }

    /* JADX INFO: renamed from: getNeutralVariant4-0d7_KjU, reason: not valid java name */
    public final long m2804getNeutralVariant40d7_KjU() {
        return this.neutralVariant4;
    }

    /* JADX INFO: renamed from: getNeutralVariant0-0d7_KjU, reason: not valid java name */
    public final long m2795getNeutralVariant00d7_KjU() {
        return this.neutralVariant0;
    }

    /* JADX INFO: renamed from: getPrimary100-0d7_KjU, reason: not valid java name */
    public final long m2821getPrimary1000d7_KjU() {
        return this.primary100;
    }

    /* JADX INFO: renamed from: getPrimary99-0d7_KjU, reason: not valid java name */
    public final long m2831getPrimary990d7_KjU() {
        return this.primary99;
    }

    /* JADX INFO: renamed from: getPrimary95-0d7_KjU, reason: not valid java name */
    public final long m2830getPrimary950d7_KjU() {
        return this.primary95;
    }

    /* JADX INFO: renamed from: getPrimary90-0d7_KjU, reason: not valid java name */
    public final long m2829getPrimary900d7_KjU() {
        return this.primary90;
    }

    /* JADX INFO: renamed from: getPrimary80-0d7_KjU, reason: not valid java name */
    public final long m2828getPrimary800d7_KjU() {
        return this.primary80;
    }

    /* JADX INFO: renamed from: getPrimary70-0d7_KjU, reason: not valid java name */
    public final long m2827getPrimary700d7_KjU() {
        return this.primary70;
    }

    /* JADX INFO: renamed from: getPrimary60-0d7_KjU, reason: not valid java name */
    public final long m2826getPrimary600d7_KjU() {
        return this.primary60;
    }

    /* JADX INFO: renamed from: getPrimary50-0d7_KjU, reason: not valid java name */
    public final long m2825getPrimary500d7_KjU() {
        return this.primary50;
    }

    /* JADX INFO: renamed from: getPrimary40-0d7_KjU, reason: not valid java name */
    public final long m2824getPrimary400d7_KjU() {
        return this.primary40;
    }

    /* JADX INFO: renamed from: getPrimary30-0d7_KjU, reason: not valid java name */
    public final long m2823getPrimary300d7_KjU() {
        return this.primary30;
    }

    /* JADX INFO: renamed from: getPrimary20-0d7_KjU, reason: not valid java name */
    public final long m2822getPrimary200d7_KjU() {
        return this.primary20;
    }

    /* JADX INFO: renamed from: getPrimary10-0d7_KjU, reason: not valid java name */
    public final long m2820getPrimary100d7_KjU() {
        return this.primary10;
    }

    /* JADX INFO: renamed from: getPrimary0-0d7_KjU, reason: not valid java name */
    public final long m2819getPrimary00d7_KjU() {
        return this.primary0;
    }

    /* JADX INFO: renamed from: getSecondary100-0d7_KjU, reason: not valid java name */
    public final long m2834getSecondary1000d7_KjU() {
        return this.secondary100;
    }

    /* JADX INFO: renamed from: getSecondary99-0d7_KjU, reason: not valid java name */
    public final long m2844getSecondary990d7_KjU() {
        return this.secondary99;
    }

    /* JADX INFO: renamed from: getSecondary95-0d7_KjU, reason: not valid java name */
    public final long m2843getSecondary950d7_KjU() {
        return this.secondary95;
    }

    /* JADX INFO: renamed from: getSecondary90-0d7_KjU, reason: not valid java name */
    public final long m2842getSecondary900d7_KjU() {
        return this.secondary90;
    }

    /* JADX INFO: renamed from: getSecondary80-0d7_KjU, reason: not valid java name */
    public final long m2841getSecondary800d7_KjU() {
        return this.secondary80;
    }

    /* JADX INFO: renamed from: getSecondary70-0d7_KjU, reason: not valid java name */
    public final long m2840getSecondary700d7_KjU() {
        return this.secondary70;
    }

    /* JADX INFO: renamed from: getSecondary60-0d7_KjU, reason: not valid java name */
    public final long m2839getSecondary600d7_KjU() {
        return this.secondary60;
    }

    /* JADX INFO: renamed from: getSecondary50-0d7_KjU, reason: not valid java name */
    public final long m2838getSecondary500d7_KjU() {
        return this.secondary50;
    }

    /* JADX INFO: renamed from: getSecondary40-0d7_KjU, reason: not valid java name */
    public final long m2837getSecondary400d7_KjU() {
        return this.secondary40;
    }

    /* JADX INFO: renamed from: getSecondary30-0d7_KjU, reason: not valid java name */
    public final long m2836getSecondary300d7_KjU() {
        return this.secondary30;
    }

    /* JADX INFO: renamed from: getSecondary20-0d7_KjU, reason: not valid java name */
    public final long m2835getSecondary200d7_KjU() {
        return this.secondary20;
    }

    /* JADX INFO: renamed from: getSecondary10-0d7_KjU, reason: not valid java name */
    public final long m2833getSecondary100d7_KjU() {
        return this.secondary10;
    }

    /* JADX INFO: renamed from: getSecondary0-0d7_KjU, reason: not valid java name */
    public final long m2832getSecondary00d7_KjU() {
        return this.secondary0;
    }

    /* JADX INFO: renamed from: getTertiary100-0d7_KjU, reason: not valid java name */
    public final long m2847getTertiary1000d7_KjU() {
        return this.tertiary100;
    }

    /* JADX INFO: renamed from: getTertiary99-0d7_KjU, reason: not valid java name */
    public final long m2857getTertiary990d7_KjU() {
        return this.tertiary99;
    }

    /* JADX INFO: renamed from: getTertiary95-0d7_KjU, reason: not valid java name */
    public final long m2856getTertiary950d7_KjU() {
        return this.tertiary95;
    }

    /* JADX INFO: renamed from: getTertiary90-0d7_KjU, reason: not valid java name */
    public final long m2855getTertiary900d7_KjU() {
        return this.tertiary90;
    }

    /* JADX INFO: renamed from: getTertiary80-0d7_KjU, reason: not valid java name */
    public final long m2854getTertiary800d7_KjU() {
        return this.tertiary80;
    }

    /* JADX INFO: renamed from: getTertiary70-0d7_KjU, reason: not valid java name */
    public final long m2853getTertiary700d7_KjU() {
        return this.tertiary70;
    }

    /* JADX INFO: renamed from: getTertiary60-0d7_KjU, reason: not valid java name */
    public final long m2852getTertiary600d7_KjU() {
        return this.tertiary60;
    }

    /* JADX INFO: renamed from: getTertiary50-0d7_KjU, reason: not valid java name */
    public final long m2851getTertiary500d7_KjU() {
        return this.tertiary50;
    }

    /* JADX INFO: renamed from: getTertiary40-0d7_KjU, reason: not valid java name */
    public final long m2850getTertiary400d7_KjU() {
        return this.tertiary40;
    }

    /* JADX INFO: renamed from: getTertiary30-0d7_KjU, reason: not valid java name */
    public final long m2849getTertiary300d7_KjU() {
        return this.tertiary30;
    }

    /* JADX INFO: renamed from: getTertiary20-0d7_KjU, reason: not valid java name */
    public final long m2848getTertiary200d7_KjU() {
        return this.tertiary20;
    }

    /* JADX INFO: renamed from: getTertiary10-0d7_KjU, reason: not valid java name */
    public final long m2846getTertiary100d7_KjU() {
        return this.tertiary10;
    }

    /* JADX INFO: renamed from: getTertiary0-0d7_KjU, reason: not valid java name */
    public final long m2845getTertiary00d7_KjU() {
        return this.tertiary0;
    }
}
