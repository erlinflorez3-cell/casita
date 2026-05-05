package kotlin.ranges;

import androidx.compose.ui.layout.LayoutKt;
import java.util.NoSuchElementException;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.random.RandomKt;
import kotlin.ranges.CharProgression;
import kotlin.ranges.IntProgression;
import kotlin.ranges.LongProgression;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$MultiFileClassPart.<init>(KotlinClassMetadata.kt:308)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:54)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яv\u001d<;!&i\u000eQLcz\u0004I\u0006>\u000e6B\r&4\u0012\u0006\fnjG6LeV5ZS8\u0017s{:'c$\bCC٥\"}8\tWNmgvJh\u0014K\u000f\u001c\u0016\u0001̓4Ic\u0003e\u0012\u00158JoU3UڎE9vt>ӌ(288\u0002ڎ\t\u001a@H\u0018͌\u0003Ca\f\u001a0VpBR\u0013S\r\u001a(\u0006F \u00079t\r\\Ȥ`l$9O/\t݃PMOe@~]\r\rSU\r\u001fad*p;C\u0016=SI\u0006қ_?\u0011A\nM\u0013ؒ?'YL\u001cWd[0\u0018#,g\r\fu>l\u0013ĩx\fU/wcyT>,\u0006{\u0014\rj\b&\u00165ΞF-Hk0\u000eay#WNQ\u001a^p\u0005\u0013qDЍ=\u007fa1a\u001b\u0015W\u0012?'OO{3\u001363\u000f͙9[\u0003\u0015\t\u0015I[(U?RX=vU\"iKЧ\u001cp\u0011\nR\u0004^O03\n\u0012F\u0017S?s^1*\u0004\u0002\u000fC\b\u0003\u000b\u009bvR\u0012XXB2n\\6X\t4Z\u000bc5o^^p,WLɟX\u0007\f\n+0j\u0001T!S\u0013vO\u0017l\u001bQk\u0014=/\u0015:q~y\u0017o9\r7]Q\u0012\u0014\u0012V\u0005\u001eW<\u0011\tpvP\\$Z\u000b-J2vo@{\nNf\fA7W\u0002*=D1Gb=H1$rE\u000b\u0013wZ\u0017\u0016\u0017dA-\u001biR{1\u0001~c!su\u0003a,+g:=OZM\u0019T]Jhb\u0005S\u000b\r}\u0018G\u0016T_}z!\u000eUB\u001f6&?֗=<;\u0015\u000f+B\u0002sDzr\u000eQ\u0014\u0011W\u0001\u000bz'=~-.\u0007\u001bv:j\u0003LeS]!Ցbr1\u0014|-\bl^z\u000ebt\u0017aŬWq+_LPH|K\u001eL%)oh{e7Q45\u001c\b\u0016?\u0015(\\\u0018}t~ˏ\u0013&\u0003t\u001cWq!\bb\u0018\\RG>Ծg}f(4n\u0013B\u000fi&\bj\tz\fcROq\t\\HO\u001b/De5<ޛtViK+\b\f?F_Xvk}Bas)\u001fNkg\u001cp{`\u0019T'\n9~I\u0007 'U \u0005[\u000b\t^\n$\u001cDBSb3@9(B6T\b9Gl\u0002\u0014\u001b\u0013\u007ftd7\u0017`G$?d\u000flx\u000b[x\tnOx!X\u0006\u0017'A)\u00115_\u000b\u0016F\u00035\u00146\u000fT5\tIp\u007f\u0003t/CD\u0003?3>f\f#E\fIq\u0002d\nw3{x\b\u0012H\u001a\r\u001dp\u001eIIi)m\u0002H^9\\\rN\u0013}Bj`O:)-\u0002-\u0012J\u0014'\u000bGV\u000b\u0006p8dN&>k\u001a/\u001et3\u0015\u0019\u0015iV\u001d=\u0006c4kY\u0003,5\u0007oSi\u00060 N/4x/]o\u000e\u0015\u0012\u000e\u001fH \n\u0016\u0011\n!-^2\u001c.x\b\u001b\n\\\u001cfU\u0010H\u001a\u0015tX\u001a\u000eg̀/߿p\u0006Pb\u0001\u0017\u0018u\u0005c\u001dh3\tv3fy\u001d0~-9+[F+X\t>W֮ Ǩ\u0015\u007f\u001a.>=D\u001az)>b\fn\u0001m_[;.]{Ze?Hj\u001e,$@ǩ\u0004ցX(\u001bTnkLv!\\\u001bU\u007f\u0014nl8d#\u000fW$-\u0003Vv)\u0013bL9ۅdԘ;\u0019%t%en\u0019\u001cEw9I7bA+7`\u000e\u001e8'\u0015\u0011Rzt.1\tքrϨk,3_l[(9q$\u001cw+,[GHB6/?\u001eA3hP8>\u000b\"bԥQߥE\u0019\u0017\u001a-V\u0014\u0002\u001f\u0019c}yY5,\u0011|/\u0011m\naoH\fOrQ2Uͽ\u001b˓j;+O}j5\u001e\u001aex\u0012uif\u0011q,w9s.*YN\u0018\"\u001fR)L¶#ǪI1NDwzNh\fW29R<~F3G\u001b|\"\u001a\\m&\f|[\u0010:\bʷ\u0014ԯH>0G\u0005%S_\u0001y9W5K$9\u001f\u0006W7E\r@S\u007fXCI!Tu۟]ڍ\u0017s\nTJ\u007fD\f_@\b=.3\"Vsj\u0019q\u007fo@< %%\u0004&9\u0019Ϛ\u007fѦ!\u0018-e\u000fdDn\u0011Mou3F\u001f&n.p\u00119\u0016F2V/\u001a}xc[ͽ3˝wAM-n\u001a//)[S\u0019MmzIOU ]kIc\u000f{bp5\u0014`Kȁ!ʢh+\u001b\u001b\u0003I<Yn>H=\u0001\f\u001eGtH>I'TXq>HHP-`\nס\u0001\u0097#=[0}\u001d@tO[\u0013$S=gpbUQ2'\u00123\u0014O1+\u000bLZ\u007fޯ#Ѵ\u00111D\u0017 zWg\u0015mw#+gZ#?\u0006m4o[\u001dZsW1Wm\u0007RԔ'դ\n\u0013*}\u007f1w :_1_^\\9J[Y?lpz?~\u0003$F\ffXLۻ\u0006©f\u001c;Ww^:@\t\tub\u0013\u0002:g\u007ff#_{U[y'VIq?g\u0016Ǹ\u0014،U\\^Z/u4R+\u0002H0Ng\fJ90E[\u0012}\u001bwbx)Ybpv١yܛjdD\u007fVZV~1f}\u0011CWTd\u0019`\u001fNo \u0013p:?NH\u0019 G\u0383Kڼ\u001b\u0014=`\u000fAuER\"\u00105{c5IZ\u0006<p\u0010\bE\u007fkKN\r\u001e4CϷ\u0005âjr\n\t\u001dk>\u0016\u0004/`Y\u0003F,/j'\u001co6:>\u0010\u000b\u001dDn\u0002U\u0018Ά\u001fʒh~);2_eK_!A\u0016AB\u00184]X)u\u0007lU2\n\u001e7\u0012p\u007f{ΞAѡ\u007f3]\u000fgRk0A}\u0018\u000bH\u0013{\u0014\u0014cx*}y\u0013\u0015kFew5^\u0003յAӫ\u000e\"/A 35\u0014`4xEJ)\u0011\u0011F\u0018xm\u001d\tU\rs$Gt$\u0014xâ>ԝj]mQY[co\u0017E[B\u001a\u000e[K}~YN<YF>]d\u0006u\nE\u001bň2αs\u00047-\f~iT/w6u\\qJ}W\u0003Bry>J^t\u0007\u0005v~dVā\u0016Ȍ\u0018\u0005D\u0012AAN7w`\u0016\u0013c\u000f\u0001\u001fGQsl9TA,nJV\u0012=L\u001fд\u000eܝ\u0006\u0005Q\u000324GW\u0011@y(\u0004\nwea\"\u0016P\u001a8_\u000e\u0006.N\u001d.:\u007fΚsЈb5m|!s1 ?n}\u001b\u001a6BImZN7\n\u0018>Ntdh\ro\r3ͫvƲv\u0017E3\u001aHS45C\u0014,\u0010\u000bFnK]\u0017[\u0013\u000bNris?0,\rgâAܟ\u001a\u000e*&\u0018\biFgu/Sp\u0013:9s2\u0016,\u001dez\b{ǲIIYa\u00031+&r\u0007B3,U'6 0*wkAu[ܞ*Ȑ\u0017v)\u000e!#*[=\t[d\u001fzHQ@$c(W\nAi%ݦ\b9\\>B\f\t{_\u0016}\\\n n\u0006v(O D$̻\u007fNX6\">Ri'\u000b\\rH\f,R/&\u001eM-jן\u0014\u0007C)n\u0001}\u001e\nzb@\u0002drCpX5Y)Gʜ\t\u0019#1oC\u0014ll}F\u00130\u0017|^X*`\u000b=\u0018\u0004NӚ%ύ\nKsT4LW\f9kbSJ*\u00115Ti\u001a%dP[\"|ΤD:WJ-\f0-*9Fzv\u0014/t\u0014!,!5@aw\\M2%؆p\u0378}/VkYk|A2\u0017TK\n=3Mu\"JH\u0016`y)#%7j:{I¢5֫`^0X\u001a$2&Z~d\u0004kpNw,4BwP\u0006\u001a8<ZzOX\u001eXʗNʖ[qj,yR\fLe\u001a0qq\r\u001d(3-9\u001fX&|H_K\u0005cuZ=͚\rش5=oaHj\u0004\r\u0016\u001c`\u0005h}\u0003c{6s\u0006FLtM?J\u001a\f~O6ո0ذ\u0016L\u0011^*1@R6\u007fIi\u000fODJ\u0006\\dr\fgY\u0002\u001c~Nml\u0013\u0014ħVÍ\n6#{\u0003\u001d\u0002\tnfAR?\u0018&~\u000f<\u001ck3\tV'8^\u0018SaiBԐS\u05ff\u0013H\u001dN|RP&7\u000bL=|&\u001b\r_gb%fo)J\\]y\u0005\\%`Ӻ(ɇ2pumRv\u000fo^9i0\u001cZp;\u0002`%^Us\u0019;$#\n2qR&ǜ!ءc\u000b\u0019g5q!e\u001aQ[ec=W[\u0018Wts6QOIw7\b\u0005fv\u0006ԳjĒ+?]\u0015s~8R\u001c\u0003V(l&6\u00147\rlEL\u001aD:5\u001d#W~gHſJܸ\u0019kV'O0SO[U\u000fn\u001aA5`Z\f?-TR9\u001e7\u007f\u0005&#\u001b5ȱ\fθ=]6Oh\u0001\u0018{im>\u000e%\"D\u00182Y@ID>\u0019%G_\u007fIa<JܭPͅs~7v\r~{\u0007p\u0014`(FCh{8nf\u000b1{\u0007q)֓-wAT=(\"[O\u000fw~,i$p\u000f\u0019u!_,ѹ`?\u0006E\u0002\u0017\u007f\u001e\u000fmfuH}i.\u001cjzJ`\u001bü\u0011\u0003\fbiTd%gTBzyP\u0010\u001av~8MB\u0012̼*\u0005;SM\t%\u000b\u000brN\u007f'Awh#<~\u000fS\u0005ǶuN\u001a)7Z\u0017)/\u001a\r\b>=xDkeY\u0010$xٕ<\r~\u000fW3\u001329W\u0014\u000ba\u0019\u00018\u001c\u0002\fZ6jӠmYb3E)#\u001b3_I\u000f\u0001*doP[\u00073-]և\u0003b\u0007V\u0013\u0019@\u000f\u0014~7v-^z\u0001-;\f\u001b\"ZǚREl\u0004\u000b5ef+%\u0013\fK\u0013P\u001b7?*[\u0010bӈ\u000be\\a_I&:;c\u001d\u0002X\"\b<4\u000b\u0011`\u0005F̓8\u000eYo\u0019{wjlj]\u0018\u0012~:B,'J\u0003yJϺ}-_\u001fgtQ#,\u0007D\f&W\u0012\t-H\u001d+x,ح/\u001a#tD\nD<r0\u0018\u001dSi%o\u0012\u001cu$Z+̛Dc%)$Y\u0003`%m(\u0019o\u001f\rR<\f\u001cla\u001ç\u0011f.D\u000b6F@Lud\u001d\u0016T\u000f\u001ex\u007f:ME\u0011זIf\\r1\u0005f\u000bJtM#9b\u0019\r9[\"/G\u0002ҐyppO\u001f|z\f=;+)\u0004U\u007fMQZ\u0006}#bfE\u0013{G\u001ab*D\"\u0019-}.\u000fHHF(sSJ6Q\u0016;s\u001fA\u001fYwn\u0007\u0011=#̑fb8p\u001f\u00184``$A\u0012[\u0017+\u0004\u0011V\u001b\u007f\u07fcKO(A?Y99.\u0019\u0004O;d@Gmn\u001ai߃;\u007fm\u0015c\u001c\"VD/>3uh\u001eR=#E9\\D\u0016\u001e%w='~IZ7j\t\u000bRP\u001aV\t<EJD/h\u0014\u001d;\u007fS=\u001f\r|m\u0019\u0005_\b;tŭi\u001f`6Ys\u0014.YJG\u0018YWf\u001f!\n\u000b0ۉ6JQ>6@>XR\u000b\u00058Rj\u0014\u0005'\u001f\u001elבg+\u0002kyPRbZ\u0006Y 2\u0010Xl~ڵAzif\u001f+n-jq@\u0017\trr\u0017@I(;D\u0017oUFN~\u0017&\u001f1o-]\u000fcќ\u0013'*c\u0006N#chk#o[S}H9;\u0015zLE\u000fLM++){jPv`\u0014dy̫F\u000e\u0003\u0011fwUjY\u001cTOCY7xl8N\u0017elJ\u00047a];\u00155q>\u00103\u0019o\u000f,ȳ3Պ\r\t7l_\u001b[&fu!\u0002QI?{9\u007f\u001f?7u\u0002LaGbtΧ5?\u0004\u001d9}D6W[4\u0001\u0018V;\u0012YKrʍ$ʗ\fQW\u000eV\t>\u0003r}u\u0017D<nrrR\fx\u0011.<F*{,{ٺ\u007f>Y;,?Z\u0005R?\u001f\u000e\u007f\\\u001d\u0002a\"[Ȭ\u001aͱ#\u0016\u001bz;\u001e2\u0012\u0002FQL!h_v\u0016g]\n$\u001b<snE\u0018OԚ.\u0012K^|w\u0012L\u0012Y\u001a@lKCI\u001c\u0014O0Z\b\u001bRT/}\u001enBj>o[)<z!d\u00188_$_(*\\|S\u0012@z\u001dAMyg\u007fwY\u0011ӕ\u0012ID/*%\u0012g\u001d/Wqz6pS}U%6b1ωy\u0007\u0012memdmE<zmq\u0010fs\u0001JdP\u001d\u0018ۗN8i\u000b\u0010LWZ?zW7^quOմ̞KoU4)U\u0003|m!1*if'f\u00144\fȫա/<WbC(@OeD=rG@Vo>f\u0010ϿƿqU([\u0014e!\u001d0SWJ\u0004i\tym,.ɐ݉\u0018,=o&0^&\f-\u0004\u001d\"v;`lj\u007fڱՕm\u0015t\u0017\u0013*\u0013@>J4)4\u001ew YplЖʵkTJ\u0005!3a\u0019\u000f\u0006L\\&x\u001d]\f\u001e\u0012߃̎JE\u0010P{p\u0002U\u001b[\rqv7\u00128\u0001LZԨӐDk\n\u0011IQ9+\b\b-z\u000bsAeZ,\u0007٫ه\u0007z\u0013\u0011\u0004_^\u0016\t\u001b\u0011^,.\u0004^+\u00189џۖWBz>^BX!\u0010++\u0010\u0012ug?mTE֊͙/}@?Jt\u007f\u0016k\\0%)m ):n\u0014߬ڊ\u000e>\u001dq/a/5&x\u001f\\f $Cxh)ӿƈ9fME\t\u0019|f8~/3EO\u000bm$:I՞܋/8B\u0018\b>g\u0001=\u0015Q\u0014*<{_3\u0007w\u0013IF6\u0011qїL `\u0017\u001f\u0010Mq\u000b\u001a[jT@5\u0010\u0010$0?}bߖ\u007flHOI\r#&Y0\u0002Ilxmc8>._7VٰQ&gZ\u001cZ6!4K>R]\u000bj\u001b_!yJCUƐ*d\u0013^3\u0011o0bsG\b\u0004;]Ki!$\u0002k@س9\u0017\u001d_gV_\u000fl2cwnV2\u0015*,5R~AҹNI\u001d(B>\u001er5\n\rRt\u0004F8\u0015\u000b\u0007G\u0005#ϥ\u001eaa\u0017q!N6^+L[y!w\"a5\u0001OF\"Ǣ\u0001-i1\b\u000b$';QR\u0017\u0001J/$;\u007flqJ\bΆ\u0003tf\\-,{\"\u0007ZQ#\u0003lK,.0J[\u000f\u0016Н)$u~\u0015\u0012p1/U\u0018Y\u0006\f\u001c\u0011jbc\u0014l\u000fہi8=`xd`ObCtHm7\u0013%y=\u0006XT\u0003نO\b^\bd`~sxK]#\u0006V\u0007y\u0016GH8\u0016sױO?A8\u00024\u00107\u000b\\[,|`X12FS`\u0013d̀\u0002n*uikC\b|\u0013#i\u0014\u0018rd;@-[6YؒR5\b===<`xK\u0003Q\u0006-\f>\u007fA\u0019kdW֪&d5@U\u001aQRL\u0015h*\u0018]]Rf$%\u0004`<Մ8ԓ0A"}, d2 = {"1nT?V,\u001ab\u007f~vl;", "\"", "", ";h]6`<FD\u0015\u0006\u000b^", "uKY.i(\bZ\u0015\b|(\n\u0007\u0011:a\r$xG\u0001l}Lk\u001f8@,1b\u007fi\u0015w\u001e9IP7h;\u001ej,H>\u0003t(\u0018}#PN\u0018\nfZ}9!\u000eW\u0015N\u0001", "", "", "", "", "", "", "1nT?V,\u001ab\u0001\t\tm", ";`g6`<FD\u0015\u0006\u000b^", "1nT?V,\"\\", "uKY.i(\bZ\u0015\b|(\n\u0007\u0011:a\r$xG\u0001l}Lk\u001f8@,1b\u007fi\u0015w\u001e9IP7h;\u001ejOf5\u0018_uUr0I\u0016,6d]nJ\u0010\u000fa\u000e$ns\nUR 8K3(\nu'\fCs|\u0019\u0012\u000b<jF", "@`]4X", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\rl\n6{?a\u001e!C~\u0012Ex\u0010?]\u0007/$i\u001f0M\u0019", "uKY.i(\bZ\u0015\b|(\n\u0007\u0011:a\r$xG\u0001l}My\u001dCz.~fy)9m$w+JEy4\u001duok5\u0016g5Pa1KU]\u0019X[t=iUA\u0013J<\tN`=-p\u000e\u0015)\u00107E\u000f7e\b\fk", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\rl\n6{?m\u0013 Ioc", "uKY.i(\bZ\u0015\b|(\n\u0007\u0011:a\r$xG\u0001l}My\u001dCz.~fy)9m$w+JEy4\u001d\u0002dj;\u00079o5{#XH\u00183X[t\u0007q\u001cb\u0019J8\t\u0002`Ay", "1n]AT0Ga", "", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\rh{5h<\n\u0019\u0017\u001d", "3kT:X5M", "", "uKZ<g3B\\b\fvg.|\u0017xC\u0003$\t-| \u0019GEtAr61#\u0005\u001c@o_\fP?Hg2-\u0015u7|{", "D`[BX", "0xc2E(GU\u0019\\\u0005g;x\r8s", "2nd/_,+O\"\u0001z<6\u0006\u0018+i\t6", "4k^.g\u0019:\\\u001b~Xh5\f\u00053n\u000e", "7mc\u001fT5@Sv\t\u0004m(\u0001\u0012=", ":n]4E(GU\u0019\\\u0005g;x\r8s", "Ag^?g\u0019:\\\u001b~Xh5\f\u00053n\u000e", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\u0013n\u000f\u0015wI\u0003\u0017l", "uKZ<g3B\\b\fvg.|\u0017xI\t7h<\n\u0019\u0017\u001dV\u00138\b!~`y)97y7\\C=kAsX]", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\u0016o\t*h<\n\u0019\u0017\u001d", "uKZ<g3B\\b\fvg.|\u0017xL\n1}-| \u0019GEtAr61#\u0005\u001c@o_\u0015WL=Aw\u0013", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\u0019p\u007f1[I\u007f\u0004\u0013Pq\u000e\u0012", "2nf;G6", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\u0013n\u000f\u0013\tJ\u0003$\u0017U}\u0012F\u007fz", "Bn", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\u0016o\t*fM\u000b\u0019$G}\u001c@\u0001.\u000b", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\rh{5fM\u000b\u0019$G}\u001c@\u0001.\u000b", "4ha@g", "4ha@g\u0016K<)\u0006\u0002", "uKZ<g3B\\b\fvg.|\u0017xC\u0003$\t+\u000e!\u0019To\u001cJz/>/A\u0007<i'*\u0017J7t6grk]F\u0003a;N\u0004|", "uKZ<g3B\\b\fvg.|\u0017xI\t7fM\u000b\u0019$G}\u001c@\u0001.\u000b\u001dd%3~\u0012wT?Dm}\u0002\u001ewa;\u0007p\u0002", "uKZ<g3B\\b\fvg.|\u0017xL\n1}+\u000e!\u0019To\u001cJz/>/A\u0007<i'*\u0017J7t6g{rj;\\", ":`bA", ":`bAB9'c \u0006", "@`]1b4", "\u001aj^A_0G\u001d&z\u0004]6\u0005R\u001ca\t'\u0006HV", "@`]1b4(`\u0002\u000f\u0002e", "uKZ<g3B\\b\fvg.|\u0017xC\u0003$\t-| \u0019GEQ#{!FUG'3v\u0018w+F7x0\u001c$hn\u000f", "uKZ<g3B\\b\fvg.|\u0017xC\u0003$\t-| \u0019GEtB\u00014<]\u0007iDi\u001f-WK\u0005X0'\u0014ri\u000fJJ1J\b#\u0011SJ5^\u001cP@\u0010\u001fV\f]+\u001aZ", "uKZ<g3B\\b\fvg.|\u0017xI\t7h<\n\u0019\u0017\u001d3tAr61#\u0005\u001c@o_\u0012VR;m4+j", "uKZ<g3B\\b\fvg.|\u0017xI\t7h<\n\u0019\u0017\u001dV\u0014F\u0006,9bG-3v\u00158U\r(g=\u001d\u001fp7|mh(_rpNHW.&6{L\u0014\u0014Z\u001b$", "uKZ<g3B\\b\fvg.|\u0017xL\n1}-| \u0019GEQ#{!FUG'3v\u0018w4MDm\n", "uKZ<g3B\\b\fvg.|\u0017xL\n1}-| \u0019GEtB\u00014<]\u0007iDi\u001f-WK\u0005X0'\u0014ri\u000fJJ1J\b#\u0011SJ5^\u001cYG\u001d\u00140", "@de2e:>R", "AsT=", "Bn1Fg,\u001ef\u0015|\nH9e\u00196l", "uC\u0018\u0019](OOb\u0006vg.FeCt\u007f}", "uE\u0018\u0019](OOb\u0006vg.FeCt\u007f}", "uH\u0018\u0019](OOb\u0006vg.FeCt\u007f}", "uI\u0018\u0019](OOb\u0006vg.FeCt\u007f}", "uR\u0018\u0019](OOb\u0006vg.FeCt\u007f}", "Bn8;g\fQO\u0017\u000edk\u0015\r\u00106", "uC\u0018\u0019](OOb\u0006vg.Fl8t\u007f*{MV", "uE\u0018\u0019](OOb\u0006vg.Fl8t\u007f*{MV", "uI\u0018\u0019](OOb\u0006vg.Fl8t\u007f*{MV", "Bn;<a.\u001ef\u0015|\nH9e\u00196l", "uC\u0018\u0019](OOb\u0006vg.Fo9n\u0002}", "uE\u0018\u0019](OOb\u0006vg.Fo9n\u0002}", "BnB5b9M3,zxm\u0016\nq?l\u0007", "uC\u0018\u0019](OOb\u0006vg.Fv2o\r7Q", "uE\u0018\u0019](OOb\u0006vg.Fv2o\r7Q", "uH\u0018\u0019](OOb\u0006vg.Fv2o\r7Q", "uI\u0018\u0019](OOb\u0006vg.Fv2o\r7Q", "Cmc6_", "9nc9\\5\u0006a(}\u0002b)"}, k = 5, mv = {1, 9, 0}, pn = "", xi = 49, xs = ">AE<8<{>,80-:t\u0017%1)&3\n2")
public class RangesKt___RangesKt extends RangesKt__RangesKt {
    @Deprecated(message = "\u0017N\u0005H1t\u0018ff[)\u0004^(,\u000ek\\\u000e9\u0006|\u0015a\u0005\u0006{sf}2m(UrVRcmK\u0006\u001fA>Q\\X\t#lQIl}D!\u0015U(\u0004\u001c\t;\u0017\u007f\u0011}K/\u000b\u0006|pa\t\tJ\u0019F\u0010PC;pftHT*\u0003\u0005#\taE\u001e*>$(J@a\u001b.&}Kt:\u0019+\u0001M[jZG!S\u0007")
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpF", hiddenSince = "\tq.", warningSince = "\u000bc>")
    public static final /* synthetic */ boolean byteRangeContains(ClosedRange closedRange, double d2) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Byte byteExactOrNull = RangesKt.toByteExactOrNull(d2);
        if (byteExactOrNull != null) {
            return closedRange.contains(byteExactOrNull);
        }
        return false;
    }

    @Deprecated(message = "\u0017N\u0005H1t\u0018ff[)\u0004^(,\u000ek\\\u000e9\u0006|\u0015a\u0005\u0006{sf}2m(UrVRcmK\u0006\u001fA>Q\\X\t#lQIl}D!\u0015U(\u0004\u001c\t;\u0017\u007f\u0011}K/\u000b\u0006|pa\t\tJ\u0019F\u0010PC;pftHT*\u0003\u0005#\taE\u001e*>$(J@a\u001b.&}Kt:\u0019+\u0001M[jZG!S\u0007")
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpF", hiddenSince = "\tq.", warningSince = "\u000bc>")
    public static final /* synthetic */ boolean byteRangeContains(ClosedRange closedRange, float f2) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Byte byteExactOrNull = RangesKt.toByteExactOrNull(f2);
        if (byteExactOrNull != null) {
            return closedRange.contains(byteExactOrNull);
        }
        return false;
    }

    public static final boolean byteRangeContains(ClosedRange<Byte> closedRange, int i2) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Byte byteExactOrNull = RangesKt.toByteExactOrNull(i2);
        if (byteExactOrNull != null) {
            return closedRange.contains(byteExactOrNull);
        }
        return false;
    }

    public static final boolean byteRangeContains(ClosedRange<Byte> closedRange, long j2) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Byte byteExactOrNull = RangesKt.toByteExactOrNull(j2);
        if (byteExactOrNull != null) {
            return closedRange.contains(byteExactOrNull);
        }
        return false;
    }

    public static final boolean byteRangeContains(ClosedRange<Byte> closedRange, short s2) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Byte byteExactOrNull = RangesKt.toByteExactOrNull(s2);
        if (byteExactOrNull != null) {
            return closedRange.contains(byteExactOrNull);
        }
        return false;
    }

    public static final boolean byteRangeContains(OpenEndRange<Byte> openEndRange, int i2) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        Byte byteExactOrNull = RangesKt.toByteExactOrNull(i2);
        if (byteExactOrNull != null) {
            return openEndRange.contains(byteExactOrNull);
        }
        return false;
    }

    public static final boolean byteRangeContains(OpenEndRange<Byte> openEndRange, long j2) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        Byte byteExactOrNull = RangesKt.toByteExactOrNull(j2);
        if (byteExactOrNull != null) {
            return openEndRange.contains(byteExactOrNull);
        }
        return false;
    }

    public static final boolean byteRangeContains(OpenEndRange<Byte> openEndRange, short s2) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        Byte byteExactOrNull = RangesKt.toByteExactOrNull(s2);
        if (byteExactOrNull != null) {
            return openEndRange.contains(byteExactOrNull);
        }
        return false;
    }

    public static final byte coerceAtLeast(byte b2, byte b3) {
        return b2 < b3 ? b3 : b2;
    }

    public static final double coerceAtLeast(double d2, double d3) {
        return d2 < d3 ? d3 : d2;
    }

    public static final float coerceAtLeast(float f2, float f3) {
        return f2 < f3 ? f3 : f2;
    }

    public static final int coerceAtLeast(int i2, int i3) {
        return i2 < i3 ? i3 : i2;
    }

    public static final long coerceAtLeast(long j2, long j3) {
        return j2 < j3 ? j3 : j2;
    }

    public static final <T extends Comparable<? super T>> T coerceAtLeast(T t2, T minimumValue) {
        Intrinsics.checkNotNullParameter(t2, "<this>");
        Intrinsics.checkNotNullParameter(minimumValue, "minimumValue");
        return t2.compareTo(minimumValue) < 0 ? minimumValue : t2;
    }

    public static final short coerceAtLeast(short s2, short s3) {
        return s2 < s3 ? s3 : s2;
    }

    public static final byte coerceAtMost(byte b2, byte b3) {
        return b2 > b3 ? b3 : b2;
    }

    public static final double coerceAtMost(double d2, double d3) {
        return d2 > d3 ? d3 : d2;
    }

    public static final float coerceAtMost(float f2, float f3) {
        return f2 > f3 ? f3 : f2;
    }

    public static final int coerceAtMost(int i2, int i3) {
        return i2 > i3 ? i3 : i2;
    }

    public static final long coerceAtMost(long j2, long j3) {
        return j2 > j3 ? j3 : j2;
    }

    public static final <T extends Comparable<? super T>> T coerceAtMost(T t2, T maximumValue) {
        Intrinsics.checkNotNullParameter(t2, "<this>");
        Intrinsics.checkNotNullParameter(maximumValue, "maximumValue");
        return t2.compareTo(maximumValue) > 0 ? maximumValue : t2;
    }

    public static final short coerceAtMost(short s2, short s3) {
        return s2 > s3 ? s3 : s2;
    }

    public static final byte coerceIn(byte b2, byte b3, byte b4) {
        if (b3 <= b4) {
            return b2 < b3 ? b3 : b2 > b4 ? b4 : b2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int) b4) + " is less than minimum " + ((int) b3) + '.');
    }

    public static final double coerceIn(double d2, double d3, double d4) {
        if (d3 <= d4) {
            return d2 < d3 ? d3 : d2 > d4 ? d4 : d2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d4 + " is less than minimum " + d3 + '.');
    }

    public static final float coerceIn(float f2, float f3, float f4) {
        if (f3 <= f4) {
            return f2 < f3 ? f3 : f2 > f4 ? f4 : f2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f4 + " is less than minimum " + f3 + '.');
    }

    public static final int coerceIn(int i2, int i3, int i4) {
        if (i3 <= i4) {
            return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i4 + " is less than minimum " + i3 + '.');
    }

    public static final int coerceIn(int i2, ClosedRange<Integer> range) {
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof ClosedFloatingPointRange) {
            return ((Number) RangesKt.coerceIn(Integer.valueOf(i2), (ClosedFloatingPointRange<Integer>) range)).intValue();
        }
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
        }
        return i2 < ((Number) range.getStart()).intValue() ? ((Number) range.getStart()).intValue() : i2 > ((Number) range.getEndInclusive()).intValue() ? ((Number) range.getEndInclusive()).intValue() : i2;
    }

    public static final long coerceIn(long j2, long j3, long j4) {
        if (j3 <= j4) {
            return j2 < j3 ? j3 : j2 > j4 ? j4 : j2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j4 + " is less than minimum " + j3 + '.');
    }

    public static final long coerceIn(long j2, ClosedRange<Long> range) {
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof ClosedFloatingPointRange) {
            return ((Number) RangesKt.coerceIn(Long.valueOf(j2), (ClosedFloatingPointRange<Long>) range)).longValue();
        }
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
        }
        return j2 < ((Number) range.getStart()).longValue() ? ((Number) range.getStart()).longValue() : j2 > ((Number) range.getEndInclusive()).longValue() ? ((Number) range.getEndInclusive()).longValue() : j2;
    }

    public static final <T extends Comparable<? super T>> T coerceIn(T t2, T t3, T t4) {
        Intrinsics.checkNotNullParameter(t2, "<this>");
        if (t3 == null || t4 == null) {
            if (t3 != null && t2.compareTo(t3) < 0) {
                return t3;
            }
            if (t4 != null && t2.compareTo(t4) > 0) {
                return t4;
            }
        } else {
            if (t3.compareTo(t4) > 0) {
                throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + t4 + " is less than minimum " + t3 + '.');
            }
            if (t2.compareTo(t3) < 0) {
                return t3;
            }
            if (t2.compareTo(t4) > 0) {
                return t4;
            }
        }
        return t2;
    }

    public static final <T extends Comparable<? super T>> T coerceIn(T t2, ClosedFloatingPointRange<T> range) {
        Intrinsics.checkNotNullParameter(t2, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
        }
        return (!range.lessThanOrEquals(t2, range.getStart()) || range.lessThanOrEquals(range.getStart(), t2)) ? (!range.lessThanOrEquals(range.getEndInclusive(), t2) || range.lessThanOrEquals(t2, range.getEndInclusive())) ? t2 : range.getEndInclusive() : range.getStart();
    }

    public static final <T extends Comparable<? super T>> T coerceIn(T t2, ClosedRange<T> range) {
        Intrinsics.checkNotNullParameter(t2, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof ClosedFloatingPointRange) {
            return (T) RangesKt.coerceIn((Comparable) t2, (ClosedFloatingPointRange) range);
        }
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
        }
        return t2.compareTo(range.getStart()) < 0 ? (T) range.getStart() : t2.compareTo(range.getEndInclusive()) > 0 ? (T) range.getEndInclusive() : t2;
    }

    public static final short coerceIn(short s2, short s3, short s4) {
        if (s3 <= s4) {
            return s2 < s3 ? s3 : s2 > s4 ? s4 : s2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int) s4) + " is less than minimum " + ((int) s3) + '.');
    }

    private static final boolean contains(CharRange charRange, Character ch) {
        Intrinsics.checkNotNullParameter(charRange, "<this>");
        return ch != null && charRange.contains(ch.charValue());
    }

    private static final boolean contains(IntRange intRange, byte b2) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        return RangesKt.intRangeContains((ClosedRange<Integer>) intRange, b2);
    }

    private static final boolean contains(IntRange intRange, long j2) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        return RangesKt.intRangeContains((ClosedRange<Integer>) intRange, j2);
    }

    private static final boolean contains(IntRange intRange, Integer num) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        return num != null && intRange.contains(num.intValue());
    }

    private static final boolean contains(IntRange intRange, short s2) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        return RangesKt.intRangeContains((ClosedRange<Integer>) intRange, s2);
    }

    private static final boolean contains(LongRange longRange, byte b2) {
        Intrinsics.checkNotNullParameter(longRange, "<this>");
        return RangesKt.longRangeContains((ClosedRange<Long>) longRange, b2);
    }

    private static final boolean contains(LongRange longRange, int i2) {
        Intrinsics.checkNotNullParameter(longRange, "<this>");
        return RangesKt.longRangeContains((ClosedRange<Long>) longRange, i2);
    }

    private static final boolean contains(LongRange longRange, Long l2) {
        Intrinsics.checkNotNullParameter(longRange, "<this>");
        return l2 != null && longRange.contains(l2.longValue());
    }

    private static final boolean contains(LongRange longRange, short s2) {
        Intrinsics.checkNotNullParameter(longRange, "<this>");
        return RangesKt.longRangeContains((ClosedRange<Long>) longRange, s2);
    }

    @Deprecated(message = "\u0017N\u0005H1t\u0018ff[)\u0004^(,\u000ek\\\u000e9\u0006|\u0015a\u0005\u0006{sf}2m(UrVRcmK\u0006\u001fA>Q\\X\t#lQIl}D!\u0015U(\u0004\u001c\t;\u0017\u007f\u0011}K/\u000b\u0006|pa\t\tJ\u0019F\u0010PC;pftHT*\u0003\u0005#\taE\u001e*>$(J@a\u001b.&}Kt:\u0019+\u0001M[jZG!S\u0007")
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpF", hiddenSince = "\tq.", warningSince = "\u000bc>")
    public static final /* synthetic */ boolean doubleRangeContains(ClosedRange closedRange, byte b2) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Double.valueOf(b2));
    }

    public static final boolean doubleRangeContains(ClosedRange<Double> closedRange, float f2) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Double.valueOf(f2));
    }

    @Deprecated(message = "\u0017N\u0005H1t\u0018ff[)\u0004^(,\u000ek\\\u000e9\u0006|\u0015a\u0005\u0006{sf}2m(UrVRcmK\u0006\u001fA>Q\\X\t#lQIl}D!\u0015U(\u0004\u001c\t;\u0017\u007f\u0011}K/\u000b\u0006|pa\t\tJ\u0019F\u0010PC;pftHT*\u0003\u0005#\taE\u001e*>$(J@a\u001b.&}Kt:\u0019+\u0001M[jZG!S\u0007")
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpF", hiddenSince = "\tq.", warningSince = "\u000bc>")
    public static final /* synthetic */ boolean doubleRangeContains(ClosedRange closedRange, int i2) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Double.valueOf(i2));
    }

    @Deprecated(message = "\u0017N\u0005H1t\u0018ff[)\u0004^(,\u000ek\\\u000e9\u0006|\u0015a\u0005\u0006{sf}2m(UrVRcmK\u0006\u001fA>Q\\X\t#lQIl}D!\u0015U(\u0004\u001c\t;\u0017\u007f\u0011}K/\u000b\u0006|pa\t\tJ\u0019F\u0010PC;pftHT*\u0003\u0005#\taE\u001e*>$(J@a\u001b.&}Kt:\u0019+\u0001M[jZG!S\u0007")
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpF", hiddenSince = "\tq.", warningSince = "\u000bc>")
    public static final /* synthetic */ boolean doubleRangeContains(ClosedRange closedRange, long j2) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Double.valueOf(j2));
    }

    @Deprecated(message = "\u0017N\u0005H1t\u0018ff[)\u0004^(,\u000ek\\\u000e9\u0006|\u0015a\u0005\u0006{sf}2m(UrVRcmK\u0006\u001fA>Q\\X\t#lQIl}D!\u0015U(\u0004\u001c\t;\u0017\u007f\u0011}K/\u000b\u0006|pa\t\tJ\u0019F\u0010PC;pftHT*\u0003\u0005#\taE\u001e*>$(J@a\u001b.&}Kt:\u0019+\u0001M[jZG!S\u0007")
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpF", hiddenSince = "\tq.", warningSince = "\u000bc>")
    public static final /* synthetic */ boolean doubleRangeContains(ClosedRange closedRange, short s2) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Double.valueOf(s2));
    }

    public static final boolean doubleRangeContains(OpenEndRange<Double> openEndRange, float f2) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        return openEndRange.contains(Double.valueOf(f2));
    }

    public static final CharProgression downTo(char c2, char c3) {
        return CharProgression.Companion.fromClosedRange(c2, c3, -1);
    }

    public static final IntProgression downTo(byte b2, byte b3) {
        return IntProgression.Companion.fromClosedRange(b2, b3, -1);
    }

    public static final IntProgression downTo(byte b2, int i2) {
        return IntProgression.Companion.fromClosedRange(b2, i2, -1);
    }

    public static final IntProgression downTo(byte b2, short s2) {
        return IntProgression.Companion.fromClosedRange(b2, s2, -1);
    }

    public static final IntProgression downTo(int i2, byte b2) {
        return IntProgression.Companion.fromClosedRange(i2, b2, -1);
    }

    public static final IntProgression downTo(int i2, int i3) {
        return IntProgression.Companion.fromClosedRange(i2, i3, -1);
    }

    public static final IntProgression downTo(int i2, short s2) {
        return IntProgression.Companion.fromClosedRange(i2, s2, -1);
    }

    public static final IntProgression downTo(short s2, byte b2) {
        return IntProgression.Companion.fromClosedRange(s2, b2, -1);
    }

    public static final IntProgression downTo(short s2, int i2) {
        return IntProgression.Companion.fromClosedRange(s2, i2, -1);
    }

    public static final IntProgression downTo(short s2, short s3) {
        return IntProgression.Companion.fromClosedRange(s2, s3, -1);
    }

    public static final LongProgression downTo(byte b2, long j2) {
        return LongProgression.Companion.fromClosedRange(b2, j2, -1L);
    }

    public static final LongProgression downTo(int i2, long j2) {
        return LongProgression.Companion.fromClosedRange(i2, j2, -1L);
    }

    public static final LongProgression downTo(long j2, byte b2) {
        return LongProgression.Companion.fromClosedRange(j2, b2, -1L);
    }

    public static final LongProgression downTo(long j2, int i2) {
        return LongProgression.Companion.fromClosedRange(j2, i2, -1L);
    }

    public static final LongProgression downTo(long j2, long j3) {
        return LongProgression.Companion.fromClosedRange(j2, j3, -1L);
    }

    public static final LongProgression downTo(long j2, short s2) {
        return LongProgression.Companion.fromClosedRange(j2, s2, -1L);
    }

    public static final LongProgression downTo(short s2, long j2) {
        return LongProgression.Companion.fromClosedRange(s2, j2, -1L);
    }

    public static final char first(CharProgression charProgression) {
        Intrinsics.checkNotNullParameter(charProgression, "<this>");
        if (charProgression.isEmpty()) {
            throw new NoSuchElementException("Progression " + charProgression + " is empty.");
        }
        return charProgression.getFirst();
    }

    public static final int first(IntProgression intProgression) {
        Intrinsics.checkNotNullParameter(intProgression, "<this>");
        if (intProgression.isEmpty()) {
            throw new NoSuchElementException("Progression " + intProgression + " is empty.");
        }
        return intProgression.getFirst();
    }

    public static final long first(LongProgression longProgression) {
        Intrinsics.checkNotNullParameter(longProgression, "<this>");
        if (longProgression.isEmpty()) {
            throw new NoSuchElementException("Progression " + longProgression + " is empty.");
        }
        return longProgression.getFirst();
    }

    public static final Character firstOrNull(CharProgression charProgression) {
        Intrinsics.checkNotNullParameter(charProgression, "<this>");
        if (charProgression.isEmpty()) {
            return null;
        }
        return Character.valueOf(charProgression.getFirst());
    }

    public static final Integer firstOrNull(IntProgression intProgression) {
        Intrinsics.checkNotNullParameter(intProgression, "<this>");
        if (intProgression.isEmpty()) {
            return null;
        }
        return Integer.valueOf(intProgression.getFirst());
    }

    public static final Long firstOrNull(LongProgression longProgression) {
        Intrinsics.checkNotNullParameter(longProgression, "<this>");
        if (longProgression.isEmpty()) {
            return null;
        }
        return Long.valueOf(longProgression.getFirst());
    }

    @Deprecated(message = "\u0017N\u0005H1t\u0018ff[)\u0004^(,\u000ek\\\u000e9\u0006|\u0015a\u0005\u0006{sf}2m(UrVRcmK\u0006\u001fA>Q\\X\t#lQIl}D!\u0015U(\u0004\u001c\t;\u0017\u007f\u0011}K/\u000b\u0006|pa\t\tJ\u0019F\u0010PC;pftHT*\u0003\u0005#\taE\u001e*>$(J@a\u001b.&}Kt:\u0019+\u0001M[jZG!S\u0007")
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpF", hiddenSince = "\tq.", warningSince = "\u000bc>")
    public static final /* synthetic */ boolean floatRangeContains(ClosedRange closedRange, byte b2) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Float.valueOf(b2));
    }

    public static final boolean floatRangeContains(ClosedRange<Float> closedRange, double d2) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Float.valueOf((float) d2));
    }

    @Deprecated(message = "\u0017N\u0005H1t\u0018ff[)\u0004^(,\u000ek\\\u000e9\u0006|\u0015a\u0005\u0006{sf}2m(UrVRcmK\u0006\u001fA>Q\\X\t#lQIl}D!\u0015U(\u0004\u001c\t;\u0017\u007f\u0011}K/\u000b\u0006|pa\t\tJ\u0019F\u0010PC;pftHT*\u0003\u0005#\taE\u001e*>$(J@a\u001b.&}Kt:\u0019+\u0001M[jZG!S\u0007")
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpF", hiddenSince = "\tq.", warningSince = "\u000bc>")
    public static final /* synthetic */ boolean floatRangeContains(ClosedRange closedRange, int i2) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Float.valueOf(i2));
    }

    @Deprecated(message = "\u0017N\u0005H1t\u0018ff[)\u0004^(,\u000ek\\\u000e9\u0006|\u0015a\u0005\u0006{sf}2m(UrVRcmK\u0006\u001fA>Q\\X\t#lQIl}D!\u0015U(\u0004\u001c\t;\u0017\u007f\u0011}K/\u000b\u0006|pa\t\tJ\u0019F\u0010PC;pftHT*\u0003\u0005#\taE\u001e*>$(J@a\u001b.&}Kt:\u0019+\u0001M[jZG!S\u0007")
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpF", hiddenSince = "\tq.", warningSince = "\u000bc>")
    public static final /* synthetic */ boolean floatRangeContains(ClosedRange closedRange, long j2) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Float.valueOf(j2));
    }

    @Deprecated(message = "\u0017N\u0005H1t\u0018ff[)\u0004^(,\u000ek\\\u000e9\u0006|\u0015a\u0005\u0006{sf}2m(UrVRcmK\u0006\u001fA>Q\\X\t#lQIl}D!\u0015U(\u0004\u001c\t;\u0017\u007f\u0011}K/\u000b\u0006|pa\t\tJ\u0019F\u0010PC;pftHT*\u0003\u0005#\taE\u001e*>$(J@a\u001b.&}Kt:\u0019+\u0001M[jZG!S\u0007")
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpF", hiddenSince = "\tq.", warningSince = "\u000bc>")
    public static final /* synthetic */ boolean floatRangeContains(ClosedRange closedRange, short s2) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Float.valueOf(s2));
    }

    public static final boolean intRangeContains(ClosedRange<Integer> closedRange, byte b2) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Integer.valueOf(b2));
    }

    @Deprecated(message = "\u0017N\u0005H1t\u0018ff[)\u0004^(,\u000ek\\\u000e9\u0006|\u0015a\u0005\u0006{sf}2m(UrVRcmK\u0006\u001fA>Q\\X\t#lQIl}D!\u0015U(\u0004\u001c\t;\u0017\u007f\u0011}K/\u000b\u0006|pa\t\tJ\u0019F\u0010PC;pftHT*\u0003\u0005#\taE\u001e*>$(J@a\u001b.&}Kt:\u0019+\u0001M[jZG!S\u0007")
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpF", hiddenSince = "\tq.", warningSince = "\u000bc>")
    public static final /* synthetic */ boolean intRangeContains(ClosedRange closedRange, double d2) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Integer intExactOrNull = RangesKt.toIntExactOrNull(d2);
        if (intExactOrNull != null) {
            return closedRange.contains(intExactOrNull);
        }
        return false;
    }

    @Deprecated(message = "\u0017N\u0005H1t\u0018ff[)\u0004^(,\u000ek\\\u000e9\u0006|\u0015a\u0005\u0006{sf}2m(UrVRcmK\u0006\u001fA>Q\\X\t#lQIl}D!\u0015U(\u0004\u001c\t;\u0017\u007f\u0011}K/\u000b\u0006|pa\t\tJ\u0019F\u0010PC;pftHT*\u0003\u0005#\taE\u001e*>$(J@a\u001b.&}Kt:\u0019+\u0001M[jZG!S\u0007")
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpF", hiddenSince = "\tq.", warningSince = "\u000bc>")
    public static final /* synthetic */ boolean intRangeContains(ClosedRange closedRange, float f2) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Integer intExactOrNull = RangesKt.toIntExactOrNull(f2);
        if (intExactOrNull != null) {
            return closedRange.contains(intExactOrNull);
        }
        return false;
    }

    public static final boolean intRangeContains(ClosedRange<Integer> closedRange, long j2) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Integer intExactOrNull = RangesKt.toIntExactOrNull(j2);
        if (intExactOrNull != null) {
            return closedRange.contains(intExactOrNull);
        }
        return false;
    }

    public static final boolean intRangeContains(ClosedRange<Integer> closedRange, short s2) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Integer.valueOf(s2));
    }

    public static final boolean intRangeContains(OpenEndRange<Integer> openEndRange, byte b2) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        return openEndRange.contains(Integer.valueOf(b2));
    }

    public static final boolean intRangeContains(OpenEndRange<Integer> openEndRange, long j2) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        Integer intExactOrNull = RangesKt.toIntExactOrNull(j2);
        if (intExactOrNull != null) {
            return openEndRange.contains(intExactOrNull);
        }
        return false;
    }

    public static final boolean intRangeContains(OpenEndRange<Integer> openEndRange, short s2) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        return openEndRange.contains(Integer.valueOf(s2));
    }

    public static final char last(CharProgression charProgression) {
        Intrinsics.checkNotNullParameter(charProgression, "<this>");
        if (charProgression.isEmpty()) {
            throw new NoSuchElementException("Progression " + charProgression + " is empty.");
        }
        return charProgression.getLast();
    }

    public static final int last(IntProgression intProgression) {
        Intrinsics.checkNotNullParameter(intProgression, "<this>");
        if (intProgression.isEmpty()) {
            throw new NoSuchElementException("Progression " + intProgression + " is empty.");
        }
        return intProgression.getLast();
    }

    public static final long last(LongProgression longProgression) {
        Intrinsics.checkNotNullParameter(longProgression, "<this>");
        if (longProgression.isEmpty()) {
            throw new NoSuchElementException("Progression " + longProgression + " is empty.");
        }
        return longProgression.getLast();
    }

    public static final Character lastOrNull(CharProgression charProgression) {
        Intrinsics.checkNotNullParameter(charProgression, "<this>");
        if (charProgression.isEmpty()) {
            return null;
        }
        return Character.valueOf(charProgression.getLast());
    }

    public static final Integer lastOrNull(IntProgression intProgression) {
        Intrinsics.checkNotNullParameter(intProgression, "<this>");
        if (intProgression.isEmpty()) {
            return null;
        }
        return Integer.valueOf(intProgression.getLast());
    }

    public static final Long lastOrNull(LongProgression longProgression) {
        Intrinsics.checkNotNullParameter(longProgression, "<this>");
        if (longProgression.isEmpty()) {
            return null;
        }
        return Long.valueOf(longProgression.getLast());
    }

    public static final boolean longRangeContains(ClosedRange<Long> closedRange, byte b2) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Long.valueOf(b2));
    }

    @Deprecated(message = "\u0017N\u0005H1t\u0018ff[)\u0004^(,\u000ek\\\u000e9\u0006|\u0015a\u0005\u0006{sf}2m(UrVRcmK\u0006\u001fA>Q\\X\t#lQIl}D!\u0015U(\u0004\u001c\t;\u0017\u007f\u0011}K/\u000b\u0006|pa\t\tJ\u0019F\u0010PC;pftHT*\u0003\u0005#\taE\u001e*>$(J@a\u001b.&}Kt:\u0019+\u0001M[jZG!S\u0007")
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpF", hiddenSince = "\tq.", warningSince = "\u000bc>")
    public static final /* synthetic */ boolean longRangeContains(ClosedRange closedRange, double d2) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Long longExactOrNull = RangesKt.toLongExactOrNull(d2);
        if (longExactOrNull != null) {
            return closedRange.contains(longExactOrNull);
        }
        return false;
    }

    @Deprecated(message = "\u0017N\u0005H1t\u0018ff[)\u0004^(,\u000ek\\\u000e9\u0006|\u0015a\u0005\u0006{sf}2m(UrVRcmK\u0006\u001fA>Q\\X\t#lQIl}D!\u0015U(\u0004\u001c\t;\u0017\u007f\u0011}K/\u000b\u0006|pa\t\tJ\u0019F\u0010PC;pftHT*\u0003\u0005#\taE\u001e*>$(J@a\u001b.&}Kt:\u0019+\u0001M[jZG!S\u0007")
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpF", hiddenSince = "\tq.", warningSince = "\u000bc>")
    public static final /* synthetic */ boolean longRangeContains(ClosedRange closedRange, float f2) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Long longExactOrNull = RangesKt.toLongExactOrNull(f2);
        if (longExactOrNull != null) {
            return closedRange.contains(longExactOrNull);
        }
        return false;
    }

    public static final boolean longRangeContains(ClosedRange<Long> closedRange, int i2) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Long.valueOf(i2));
    }

    public static final boolean longRangeContains(ClosedRange<Long> closedRange, short s2) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Long.valueOf(s2));
    }

    public static final boolean longRangeContains(OpenEndRange<Long> openEndRange, byte b2) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        return openEndRange.contains(Long.valueOf(b2));
    }

    public static final boolean longRangeContains(OpenEndRange<Long> openEndRange, int i2) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        return openEndRange.contains(Long.valueOf(i2));
    }

    public static final boolean longRangeContains(OpenEndRange<Long> openEndRange, short s2) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        return openEndRange.contains(Long.valueOf(s2));
    }

    private static final char random(CharRange charRange) {
        Intrinsics.checkNotNullParameter(charRange, "<this>");
        return RangesKt.random(charRange, Random.Default);
    }

    public static final char random(CharRange charRange, Random random) {
        Intrinsics.checkNotNullParameter(charRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        try {
            return (char) random.nextInt(charRange.getFirst(), charRange.getLast() + 1);
        } catch (IllegalArgumentException e2) {
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    private static final int random(IntRange intRange) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        return RangesKt.random(intRange, Random.Default);
    }

    public static final int random(IntRange intRange, Random random) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        try {
            return RandomKt.nextInt(random, intRange);
        } catch (IllegalArgumentException e2) {
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    private static final long random(LongRange longRange) {
        Intrinsics.checkNotNullParameter(longRange, "<this>");
        return RangesKt.random(longRange, Random.Default);
    }

    public static final long random(LongRange longRange, Random random) {
        Intrinsics.checkNotNullParameter(longRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        try {
            return RandomKt.nextLong(random, longRange);
        } catch (IllegalArgumentException e2) {
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    private static final Character randomOrNull(CharRange charRange) {
        Intrinsics.checkNotNullParameter(charRange, "<this>");
        return RangesKt.randomOrNull(charRange, Random.Default);
    }

    public static final Character randomOrNull(CharRange charRange, Random random) {
        Intrinsics.checkNotNullParameter(charRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (charRange.isEmpty()) {
            return null;
        }
        return Character.valueOf((char) random.nextInt(charRange.getFirst(), charRange.getLast() + 1));
    }

    private static final Integer randomOrNull(IntRange intRange) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        return RangesKt.randomOrNull(intRange, Random.Default);
    }

    public static final Integer randomOrNull(IntRange intRange, Random random) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (intRange.isEmpty()) {
            return null;
        }
        return Integer.valueOf(RandomKt.nextInt(random, intRange));
    }

    private static final Long randomOrNull(LongRange longRange) {
        Intrinsics.checkNotNullParameter(longRange, "<this>");
        return RangesKt.randomOrNull(longRange, Random.Default);
    }

    public static final Long randomOrNull(LongRange longRange, Random random) {
        Intrinsics.checkNotNullParameter(longRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (longRange.isEmpty()) {
            return null;
        }
        return Long.valueOf(RandomKt.nextLong(random, longRange));
    }

    public static final CharProgression reversed(CharProgression charProgression) {
        Intrinsics.checkNotNullParameter(charProgression, "<this>");
        return CharProgression.Companion.fromClosedRange(charProgression.getLast(), charProgression.getFirst(), -charProgression.getStep());
    }

    public static final IntProgression reversed(IntProgression intProgression) {
        Intrinsics.checkNotNullParameter(intProgression, "<this>");
        return IntProgression.Companion.fromClosedRange(intProgression.getLast(), intProgression.getFirst(), -intProgression.getStep());
    }

    public static final LongProgression reversed(LongProgression longProgression) {
        Intrinsics.checkNotNullParameter(longProgression, "<this>");
        return LongProgression.Companion.fromClosedRange(longProgression.getLast(), longProgression.getFirst(), -longProgression.getStep());
    }

    public static final boolean shortRangeContains(ClosedRange<Short> closedRange, byte b2) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Short.valueOf(b2));
    }

    @Deprecated(message = "\u0017N\u0005H1t\u0018ff[)\u0004^(,\u000ek\\\u000e9\u0006|\u0015a\u0005\u0006{sf}2m(UrVRcmK\u0006\u001fA>Q\\X\t#lQIl}D!\u0015U(\u0004\u001c\t;\u0017\u007f\u0011}K/\u000b\u0006|pa\t\tJ\u0019F\u0010PC;pftHT*\u0003\u0005#\taE\u001e*>$(J@a\u001b.&}Kt:\u0019+\u0001M[jZG!S\u0007")
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpF", hiddenSince = "\tq.", warningSince = "\u000bc>")
    public static final /* synthetic */ boolean shortRangeContains(ClosedRange closedRange, double d2) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Short shortExactOrNull = RangesKt.toShortExactOrNull(d2);
        if (shortExactOrNull != null) {
            return closedRange.contains(shortExactOrNull);
        }
        return false;
    }

    @Deprecated(message = "\u0017N\u0005H1t\u0018ff[)\u0004^(,\u000ek\\\u000e9\u0006|\u0015a\u0005\u0006{sf}2m(UrVRcmK\u0006\u001fA>Q\\X\t#lQIl}D!\u0015U(\u0004\u001c\t;\u0017\u007f\u0011}K/\u000b\u0006|pa\t\tJ\u0019F\u0010PC;pftHT*\u0003\u0005#\taE\u001e*>$(J@a\u001b.&}Kt:\u0019+\u0001M[jZG!S\u0007")
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpF", hiddenSince = "\tq.", warningSince = "\u000bc>")
    public static final /* synthetic */ boolean shortRangeContains(ClosedRange closedRange, float f2) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Short shortExactOrNull = RangesKt.toShortExactOrNull(f2);
        if (shortExactOrNull != null) {
            return closedRange.contains(shortExactOrNull);
        }
        return false;
    }

    public static final boolean shortRangeContains(ClosedRange<Short> closedRange, int i2) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Short shortExactOrNull = RangesKt.toShortExactOrNull(i2);
        if (shortExactOrNull != null) {
            return closedRange.contains(shortExactOrNull);
        }
        return false;
    }

    public static final boolean shortRangeContains(ClosedRange<Short> closedRange, long j2) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Short shortExactOrNull = RangesKt.toShortExactOrNull(j2);
        if (shortExactOrNull != null) {
            return closedRange.contains(shortExactOrNull);
        }
        return false;
    }

    public static final boolean shortRangeContains(OpenEndRange<Short> openEndRange, byte b2) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        return openEndRange.contains(Short.valueOf(b2));
    }

    public static final boolean shortRangeContains(OpenEndRange<Short> openEndRange, int i2) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        Short shortExactOrNull = RangesKt.toShortExactOrNull(i2);
        if (shortExactOrNull != null) {
            return openEndRange.contains(shortExactOrNull);
        }
        return false;
    }

    public static final boolean shortRangeContains(OpenEndRange<Short> openEndRange, long j2) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        Short shortExactOrNull = RangesKt.toShortExactOrNull(j2);
        if (shortExactOrNull != null) {
            return openEndRange.contains(shortExactOrNull);
        }
        return false;
    }

    public static final CharProgression step(CharProgression charProgression, int i2) {
        Intrinsics.checkNotNullParameter(charProgression, "<this>");
        RangesKt.checkStepIsPositive(i2 > 0, Integer.valueOf(i2));
        CharProgression.Companion companion = CharProgression.Companion;
        char first = charProgression.getFirst();
        char last = charProgression.getLast();
        if (charProgression.getStep() <= 0) {
            i2 = -i2;
        }
        return companion.fromClosedRange(first, last, i2);
    }

    public static final IntProgression step(IntProgression intProgression, int i2) {
        Intrinsics.checkNotNullParameter(intProgression, "<this>");
        RangesKt.checkStepIsPositive(i2 > 0, Integer.valueOf(i2));
        IntProgression.Companion companion = IntProgression.Companion;
        int first = intProgression.getFirst();
        int last = intProgression.getLast();
        if (intProgression.getStep() <= 0) {
            i2 = -i2;
        }
        return companion.fromClosedRange(first, last, i2);
    }

    public static final LongProgression step(LongProgression longProgression, long j2) {
        long j3 = j2;
        Intrinsics.checkNotNullParameter(longProgression, "<this>");
        RangesKt.checkStepIsPositive(j3 > 0, Long.valueOf(j3));
        LongProgression.Companion companion = LongProgression.Companion;
        long first = longProgression.getFirst();
        long last = longProgression.getLast();
        if (longProgression.getStep() <= 0) {
            j3 = -j3;
        }
        return companion.fromClosedRange(first, last, j3);
    }

    public static final Byte toByteExactOrNull(double d2) {
        if (-128.0d > d2 || d2 > 127.0d) {
            return null;
        }
        return Byte.valueOf((byte) d2);
    }

    public static final Byte toByteExactOrNull(float f2) {
        if (-128.0f > f2 || f2 > 127.0f) {
            return null;
        }
        return Byte.valueOf((byte) f2);
    }

    public static final Byte toByteExactOrNull(int i2) {
        if (new IntRange(-128, 127).contains(i2)) {
            return Byte.valueOf((byte) i2);
        }
        return null;
    }

    public static final Byte toByteExactOrNull(long j2) {
        if (new LongRange(-128L, 127L).contains(j2)) {
            return Byte.valueOf((byte) j2);
        }
        return null;
    }

    public static final Byte toByteExactOrNull(short s2) {
        if (RangesKt.intRangeContains((ClosedRange<Integer>) new IntRange(-128, 127), s2)) {
            return Byte.valueOf((byte) s2);
        }
        return null;
    }

    public static final Integer toIntExactOrNull(double d2) {
        if (-2.147483648E9d > d2 || d2 > 2.147483647E9d) {
            return null;
        }
        return Integer.valueOf((int) d2);
    }

    public static final Integer toIntExactOrNull(float f2) {
        if (-2.1474836E9f > f2 || f2 > 2.1474836E9f) {
            return null;
        }
        return Integer.valueOf((int) f2);
    }

    public static final Integer toIntExactOrNull(long j2) {
        if (new LongRange(-2147483648L, 2147483647L).contains(j2)) {
            return Integer.valueOf((int) j2);
        }
        return null;
    }

    public static final Long toLongExactOrNull(double d2) {
        if (-9.223372036854776E18d > d2 || d2 > 9.223372036854776E18d) {
            return null;
        }
        return Long.valueOf((long) d2);
    }

    public static final Long toLongExactOrNull(float f2) {
        if (-9.223372E18f > f2 || f2 > 9.223372E18f) {
            return null;
        }
        return Long.valueOf((long) f2);
    }

    public static final Short toShortExactOrNull(double d2) {
        if (-32768.0d > d2 || d2 > 32767.0d) {
            return null;
        }
        return Short.valueOf((short) d2);
    }

    public static final Short toShortExactOrNull(float f2) {
        if (-32768.0f > f2 || f2 > 32767.0f) {
            return null;
        }
        return Short.valueOf((short) f2);
    }

    public static final Short toShortExactOrNull(int i2) {
        if (new IntRange(-32768, LayoutKt.LargeDimension).contains(i2)) {
            return Short.valueOf((short) i2);
        }
        return null;
    }

    public static final Short toShortExactOrNull(long j2) {
        if (new LongRange(-32768L, 32767L).contains(j2)) {
            return Short.valueOf((short) j2);
        }
        return null;
    }

    public static final CharRange until(char c2, char c3) {
        return Intrinsics.compare((int) c3, 0) <= 0 ? CharRange.Companion.getEMPTY() : new CharRange(c2, (char) (c3 - 1));
    }

    public static final IntRange until(byte b2, byte b3) {
        return new IntRange(b2, b3 - 1);
    }

    public static final IntRange until(byte b2, int i2) {
        return i2 <= Integer.MIN_VALUE ? IntRange.Companion.getEMPTY() : new IntRange(b2, i2 - 1);
    }

    public static final IntRange until(byte b2, short s2) {
        return new IntRange(b2, s2 - 1);
    }

    public static final IntRange until(int i2, byte b2) {
        return new IntRange(i2, b2 - 1);
    }

    public static final IntRange until(int i2, int i3) {
        return i3 <= Integer.MIN_VALUE ? IntRange.Companion.getEMPTY() : new IntRange(i2, i3 - 1);
    }

    public static final IntRange until(int i2, short s2) {
        return new IntRange(i2, s2 - 1);
    }

    public static final IntRange until(short s2, byte b2) {
        return new IntRange(s2, b2 - 1);
    }

    public static final IntRange until(short s2, int i2) {
        return i2 <= Integer.MIN_VALUE ? IntRange.Companion.getEMPTY() : new IntRange(s2, i2 - 1);
    }

    public static final IntRange until(short s2, short s3) {
        return new IntRange(s2, s3 - 1);
    }

    public static final LongRange until(byte b2, long j2) {
        return j2 <= Long.MIN_VALUE ? LongRange.Companion.getEMPTY() : new LongRange(b2, j2 - 1);
    }

    public static final LongRange until(int i2, long j2) {
        return j2 <= Long.MIN_VALUE ? LongRange.Companion.getEMPTY() : new LongRange(i2, j2 - 1);
    }

    public static final LongRange until(long j2, byte b2) {
        return new LongRange(j2, ((long) b2) - 1);
    }

    public static final LongRange until(long j2, int i2) {
        return new LongRange(j2, ((long) i2) - 1);
    }

    public static final LongRange until(long j2, long j3) {
        return j3 <= Long.MIN_VALUE ? LongRange.Companion.getEMPTY() : new LongRange(j2, j3 - 1);
    }

    public static final LongRange until(long j2, short s2) {
        return new LongRange(j2, ((long) s2) - 1);
    }

    public static final LongRange until(short s2, long j2) {
        return j2 <= Long.MIN_VALUE ? LongRange.Companion.getEMPTY() : new LongRange(s2, j2 - 1);
    }
}
