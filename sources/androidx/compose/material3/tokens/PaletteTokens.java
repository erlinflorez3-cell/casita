package androidx.compose.material3.tokens;

import androidx.compose.ui.graphics.ColorKt;
import com.drew.metadata.exif.makernotes.CanonMakernoteDirectory;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.mp4.media.Mp4VideoDirectory;
import com.facebook.imageutils.JfifUtil;
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
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipMessage(CodedInputStream.java:305)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:251)
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
/* JADX INFO: compiled from: PaletteTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0017\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6C\u0005ԥ+\u0018օ\u0007|ʑi0rd\t3XS֖\u0013k\n4tr2r[;\u0004\u001cջ!ޛӠMf̊rRb\u000bQ\u0014\u001e\u0018~m:M&\u0010k\u0018'2pqѹ2ݹ܇<8žx>\r @'P{\u000b\b(.\u0019'\u0005\u0003[K:\u0014ڌ?\u0081ŦQ\f̂\t\"\u001a\u0006L%\u0019 bp\\:\u0019\u0004kDG#1kƢMϋܸ/{֔\u0011N\\'\u001b{y 1KE9e<a\u000f\u001fR\nAǚ>мޮ\u0004gҊ+3Qse;p\u0002\u001a\"9S]t\u00014t\u0005\u007fbѨ&˃\u05cbbJח\u00120\u007fz\n\u0012T\u0006\u0014\u00155L~D(v \u000eavʺRó҉\u0001]۰\u0004\u0003i6%*\u001851J)j\"xI+f7*\u0007۵\u001dŀҠm ƟX\u0016h\u0015)Y\u0010S7dNA\u0019e\u0018mUm2rŠ\u0001Ï̯/FĬ3\u0004\u0019.%*O]?8/oR_R}\u000f\u0005\u000fjؾhɭΫ?!å\u001a?2\t\u001a_\\f\u000b\u0003^X)C\u001fe4T5\u007fު\u0012\u05feиv;Ƽ)\u0018VOvn\u0003Oc#337Ng\t\u0004\u000e\u0006;Ս2̐ʚb\u000fуV~\u001c?Jg\u001dZl]a\u0010+s6>JH\u0019\u0012ɧzͩā\u000b\u0012\u0558Cy$4:61^\u001be\u0011\"\u0013X\u000b'wZ\u0017\u0012ҰS՜˭\u0002h˨x\u0011\tPju\bi~h:\u000119;ai5G(Ǘ!ֻڍ{\"ȷ\u0003{\bGuQ_Nr7\u0004YL7$<QQ]?Ҙ\u000eȯɴ1\u0001βITze_R*)\u0001 \b\u0013\f\u007f<\f j\u001f.Äi\u07ba؛S\u0016Ȕzfz#\u0016i\u0018{gk\tK4k\u0019\u0002VI!\u0005̔;Ѿʹ{\u0004ȷ\"-\to0\u0002M/IN+\u001aH+==y]\u0018qѼxʬр%sФ\b4k\u0016}gi_8dFM*\u0016LL<l1Dَi̫\u06ddA\bΌ\u0011;PArun:S6=\u00027\u001e:9\tV\n<ޝnϘԧ-^ͫwK\u0006\u0014lH=\u0013S\u0001uq>bj9b\u000f8\r\u06030ޫޗ\u001b<֕Z_j\t>\u000b\f\u001a<pIfUS\u0017TL,j\nֺBҍʤ\u0005\u000fĢ\u0004Ng\u000f%7ZuA\b\u001cXIsdz\u001d`sb֙)܀ь\u000e2\u038b|=9\u0005{Kl1ie\u000fWm )\u001fg~\u0015'ƶCǴܜ\u001a'\u0092\u0005\u0013M]QN\u001a8\n|7q<\u0007\u001an0|KDʩ\u001aʃު\u0010^۞4f\u0013UrS|x\u0018\u001e`Rr@\r3\u0015\u000ej\f݀\nÿݓqnܑ1TVwEH2\u0003\u001d}7\u000b\\\u0014q\u00013-47м<Ɩߖ\u0013&ٖ[[C}\u0016%8)\n0/`(%tFu\u001bh\u0018\u0082\u0015Ȉר\b\u0012ц$\f6J\u0003w\"0\u000es]\u0006\u0004\u0019!\u001dqk&#α&ߜ̓\u0005AƑl\u0001\u0012czh\u0007W\u0011Bt5'\u0011|mh\u001d7)Ն-߾ζY9ñW(`\u0011\u000e\u0019-(%w\u0016fy']&\u0001p\u001aQݹ\fċ֓j)Հ58Z\u001e\f$\u0012w\nmb,eRd\u0012Vd7^إAĠҋ]i܍h|\u0014)\"\u0002\u0017JdV!8\u0017\n,+G7G!̳\fӑؕ\u0006\u0003٣M.)1`D398R},G(\u0011\u0003zt.,Ҟ\bۂоf+\u0082J\\E\u001a5^<ojL4O\u0016OPRD\u0011<\u0013͈Y߀օ=[ӭ CY3O\u001e)\u0003\u001b\u0004\u0014sW0C7iSS,́{ӕĆ>x܊oB{7\u0001(G\u0011uhej\f<C4d':\u0004˿Iӭ¯bUւe4Q5S#\u0012WFO\u0018#t;\u0014F;\u007fs3ٳ)أҀ?Uؾ[\f.*Ds\\%M>\u0007wZCwj\fd\ncǣ@ʯå\u0018CĎ.5t\u0007SR\u0001{\u0011\u0018\u001bIdN\u001dZA3E~ՑNƀ͘*H\u05ffQ7d]J\u0018\f\u0006@\bo:J^N0B\u0006[\u0014͠bÅߐlP̼\u0014@\u001a\r\u001b\t\u00103X8\u000edm/5$\u000fFd^އLکɌ\n?Ǧ(f6B\u001a\u0010\u001e\u00184\"%\u0006Nano+3uuߖF̈Ϙz ͻ\u0015c-\u00063l\u0003IE1\u007f\\\u000ePAg\u0006J\u00077ȯ[հɲ Jߠ/\u001d\bj93_XDw8\\V%SC`\u0010rzڝ'Ғՠ//ʒ\u0003bK]\u000f!7?[ts\u0003\u0003yE<|\u0011Y9ɓmְҭ\",ӟ\u0006\u000b\u0018A'\u0018# Y\u001b@'D$?!\u0014\b\u000bK̉{˷ݗ\u000f\u0002˔N)7\u0006M4YMr:sCinMc$ U&̠\u0012ڡäf\u0012َ\u0012*g\u0003Z;n+N1g\u00157Yxu\u0013t:0ܸ7ˑϺ<\u0005©f$=;mED0vpUS;\u00138N\bf#[ȫDΎޫ\u0018=қu\u0019kOm\u0019\u0007SbBL\u001b(=N}\u001a\u001aK(ʸzś؛/\u0016Ƭgursbe)[:W>hJ\ntQVcl>ĊkÃ̙N|ݑULj\tnu`C\u0016Pz0wMVY1\u0001/Mܒ\u0016֏ЮCuƛk;B\"o'k_+7X\n^\u0002oh-{\f5Ϥ\fѥ݇{\u0014҂Bnz\u0004z\ne2\n]=6\u0017qN\u000fEZUoʒ\u0007Ɏż\u000b{۶0v[R_z7tjr1\"jXe._!A\u0005Ǿ;\u0380ʈLWؕr`d%<\u0001\u001e!\u00188\n9=X\u0002rKW QΝ\\ϰř|h˓$\u0015s\u0012\u0012hb%Uap\u0015.E[p\u001fYj[ϴ\u0001ۿ\u009e(#Ǭ\u0019/\nHBOJ$)z\u001d:hati\u0011%7gف.۲Ԃ\r1ýB{n]u9Y?[Y\rI}F\u007f\u0005cI\u001c\u0001\u05ecF؆ˡ\u00159÷Pu}[KY.4\rm\u00125`\rnܴA/w6d֎jϐÓF\u0002̀nT6\u001ahk\u0007o|ʸ`\u001eAf&\"؍=\f)QBѫ^ΰ\u07bc~:ˣt&?QSi#G\u0017ۤ_@Bb(Vڛe&\u001b0\u0007Ƅc΄Ԫ8DߡDT\u001d[\u0012l{T(ٯGy,\u007f#\u0006צ55\u007fc;ЋrϥԬ4fЋ\r^+\u000e5sg\u000bwȟ1Ua+9=؊\u0007&J\u0015Nʚ\f\u05fcٮk-ֹz{\u001f?#\u0007BH(ŉBs\u001d8\u001eDɞ:uh\u0002fӼ\u001dɮɓZ&ީ\u0002\u000f)\u0013O$.\u0011*ӫ~\u0003_\u0005h\u0004ã?`\u0013:\u001cŕ-\u038dŚ\u0004dօ\t>\u0012A?Dks\u001fݴvmb\u0013\u001e\u001bۆ @\u000bF*±kĪ\u0557\u0014'ɻG\u001c~\u001b{\u000e(\u001fO\u0590\b;UG\u0014(ĭ\u000f8U>Aպ\u0012ЎȈv~̦M98s\u0017Rdp\u0004Җi}nHw\u001e՝pT]-yŪD̮֞%QȺ\u0018kdD5`@G\u001dҲ\u001d-.tK\u001aɮ/3\\\u0017\u007fľuǘ٨\u0011_νr>`@C0;\u0004,ݾ\u007f\u0017'.D\"ůXmF\u0013\u0011Ŏu\u05f7ڤ\u0011]ۀBr\u0005\b?\"\u001c\tQѤ1*=\u001a\u0013/Γ3X\"Xdȶ#Мϻ\fKݥ1#>_J'Q?!˃/\r\u001baYx߱\u0003GF?tҾoީۙH^ͦ#5f)~p\u00122V\u07b3@[r\u007f3%ߎ7y7QMՇ!˪ʍf<Ҫ)\u001e\u0015\u001fx\u0011\r\u0006#ǡpjbzX\u0010є#,B-8ǂBۻ֪t\u001bŧ\u0018}*bw9FEhƈ)$\u00166g5ӏp|\u0013\u00106Ϸ9ͽÌ\u0001]͑\u000b\u0016.#;\u00103-\tϫC_7=|U܅ut\r=3¨h֠ϥKt\u05c8\u0002%:qN|\u000bdqȆD\u000e\u001cy]WЖ1\u001a\f~NȰ{ܞچ\u0011KĞF\u001b\u001b2N#\u0018\u001e\\ܨHBLFuDކ\\\\),\u0010͠5\u05cbʍ\u000bLłZ7\u000e6+d\u0003\u0002yԫUt\u0017\u00100 Ș{\u0017<\u001cgմdöͩ)EǗW<i{eX\u0003\u0012N\u05f61r8\u0013--ĺ\u001dBTN\rݣNۦّ\u001d7ŝ|OVEo\nF% Ԟ'\u001b2A\t^́W\u0019]t;ӓ\u001cуʢ_8ߢd\u007f_'^mO\u0019\u0011Ԭ1QP0w/ح^#\u0013x\u001f֒\u0012عՆP,ȷ?@OY\u0016\\^o\u000eƛ\u001eSmo\t\u0013їmWK\u0019\u0018̷>ǣڒZ_¼D\r\u000b(#I8)\u0018ϭ\fLAn\u0010\"ˆ&\u001d\u000b\u0006R\u05f8\u0001ŷϗ\u0019\u0014\u074cT\u0012?\u0012SB[XfēpI)/c\u001a\u0080$>/7\u001c֚fͺ͞s\u0014ߨh\u0015Y9k5ISh̫h_q`\u0014\u000bÙ3.\"\b\u0014Ǵ\u0015Ӿ̺ 8ݏkR;5\u0012\u0013hSuÁ0fx<\u0007pϼ\u0013J\u0003LEձwڢ\u0378WcП\u007favbT0w1Lү\u000f01z\u007f\u0006ѽ(Q \u0011j٠tĥӼd\u0015ҁ+{?]\r\u0005\bjKơFSQԳ ~Z}\"Ôp\u001b\u000erxZdąhОA"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006\u0006/;Y\u0007.\u0001X\u00125MRJk#(\u001bhjG\\", "", "u(E", "\u0010kP0^", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "5dc\u000f_(<Y`Iy0&b\u000e\u001f", "u(9", "\u0018", "\u0013qa<ev", "5dc\u0012e9H`cFE]}vn4U", "\u0013qa<ew\t", "5dc\u0012e9H`dIB)+N\u0003\u0015jo", "\u0013qa<ew\t\u001e", "5dc\u0012e9H`dIE&v{Z)K\u0005\u0018", "\u0013qa<ex\t", "5dc\u0012e9H`eIB)+N\u0003\u0015jo", "\u0013qa<ey\t", "5dc\u0012e9H`fIB)+N\u0003\u0015jo", "\u0013qa<ez\t", "5dc\u0012e9H`gIB)+N\u0003\u0015jo", "\u0013qa<e{\t", "5dc\u0012e9H`hIB)+N\u0003\u0015jo", "\u0013qa<e|\t", "5dc\u0012e9H`iIB)+N\u0003\u0015jo", "\u0013qa<e}\t", "5dc\u0012e9H`jIB)+N\u0003\u0015jo", "\u0013qa<e~\t", "5dc\u0012e9H`kIB)+N\u0003\u0015jo", "\u0013qa<e\u007f\t", "5dc\u0012e9H`lIB)+N\u0003\u0015jo", "\u0013qa<e\u007f\u000e", "5dc\u0012e9H`lNB)+N\u0003\u0015jo", "\u0013qa<e\u007f\u0012", "5dc\u0012e9H`lRB)+N\u0003\u0015jo", "\u001cddAe(E\u001e", "5dc\u001bX<M`\u0015\u0006E&v{Z)K\u0005\u0018", "\u001cddAe(E\u001fc", "5dc\u001bX<M`\u0015\u0006F)sG\b\u0001_e-k", "\u001cddAe(E\u001fcI", "5dc\u001bX<M`\u0015\u0006F)vDS.7y\u000e\u00010", "\u001cddAe(E\u001fe", "5dc\u001bX<M`\u0015\u0006F+sG\b\u0001_e-k", "\u001cddAe(E\u001fj", "5dc\u001bX<M`\u0015\u0006F0sG\b\u0001_e-k", "\u001cddAe(E c", "5dc\u001bX<M`\u0015\u0006G)sG\b\u0001_e-k", "\u001cddAe(E e", "5dc\u001bX<M`\u0015\u0006G+sG\b\u0001_e-k", "\u001cddAe(E g", "5dc\u001bX<M`\u0015\u0006G-sG\b\u0001_e-k", "\u001cddAe(E!c", "5dc\u001bX<M`\u0015\u0006H)sG\b\u0001_e-k", "\u001cddAe(E\"", "5dc\u001bX<M`\u0015\u0006I&v{Z)K\u0005\u0018", "\u001cddAe(E\"c", "5dc\u001bX<M`\u0015\u0006I)sG\b\u0001_e-k", "\u001cddAe(E#c", "5dc\u001bX<M`\u0015\u0006J)sG\b\u0001_e-k", "\u001cddAe(E$", "5dc\u001bX<M`\u0015\u0006K&v{Z)K\u0005\u0018", "\u001cddAe(E$c", "5dc\u001bX<M`\u0015\u0006K)sG\b\u0001_e-k", "\u001cddAe(E%c", "5dc\u001bX<M`\u0015\u0006L)sG\b\u0001_e-k", "\u001cddAe(E&c", "5dc\u001bX<M`\u0015\u0006M)sG\b\u0001_e-k", "\u001cddAe(E&j", "5dc\u001bX<M`\u0015\u0006M0sG\b\u0001_e-k", "\u001cddAe(E'c", "5dc\u001bX<M`\u0015\u0006N)sG\b\u0001_e-k", "\u001cddAe(E'e", "5dc\u001bX<M`\u0015\u0006N+sG\b\u0001_e-k", "\u001cddAe(E'g", "5dc\u001bX<M`\u0015\u0006N-sG\b\u0001_e-k", "\u001cddAe(E'h", "5dc\u001bX<M`\u0015\u0006N.sG\b\u0001_e-k", "\u001cddAe(E'i", "5dc\u001bX<M`\u0015\u0006N/sG\b\u0001_e-k", "\u001cddAe(E'k", "5dc\u001bX<M`\u0015\u0006N1sG\b\u0001_e-k", "\u001cddAe(E'l", "5dc\u001bX<M`\u0015\u0006N2sG\b\u0001_e-k", "\u001cddAe(ED\u0015\f~Z5\fS", "5dc\u001bX<M`\u0015\u0006kZ9\u0001\u00058tJoF?R\u0011|L_", "\u001cddAe(ED\u0015\f~Z5\fTy", "5dc\u001bX<M`\u0015\u0006kZ9\u0001\u00058tKrC\u000b\u007fh\u0011-t}", "\u001cddAe(ED\u0015\f~Z5\fTy0", "5dc\u001bX<M`\u0015\u0006kZ9\u0001\u00058tKrF\bK\u0016hAU\u0013,", "\u001cddAe(ED\u0015\f~Z5\fUy", "5dc\u001bX<M`\u0015\u0006kZ9\u0001\u00058tLrC\u000b\u007fh\u0011-t}", "\u001cddAe(ED\u0015\f~Z5\fVy", "5dc\u001bX<M`\u0015\u0006kZ9\u0001\u00058tMrC\u000b\u007fh\u0011-t}", "\u001cddAe(ED\u0015\f~Z5\fWy", "5dc\u001bX<M`\u0015\u0006kZ9\u0001\u00058tNrC\u000b\u007fh\u0011-t}", "\u001cddAe(ED\u0015\f~Z5\fXy", "5dc\u001bX<M`\u0015\u0006kZ9\u0001\u00058tOrC\u000b\u007fh\u0011-t}", "\u001cddAe(ED\u0015\f~Z5\fYy", "5dc\u001bX<M`\u0015\u0006kZ9\u0001\u00058tPrC\u000b\u007fh\u0011-t}", "\u001cddAe(ED\u0015\f~Z5\fZy", "5dc\u001bX<M`\u0015\u0006kZ9\u0001\u00058tQrC\u000b\u007fh\u0011-t}", "\u001cddAe(ED\u0015\f~Z5\f[y", "5dc\u001bX<M`\u0015\u0006kZ9\u0001\u00058tRrC\u000b\u007fh\u0011-t}", "\u001cddAe(ED\u0015\f~Z5\f\\y", "5dc\u001bX<M`\u0015\u0006kZ9\u0001\u00058tSrC\u000b\u007fh\u0011-t}", "\u001cddAe(ED\u0015\f~Z5\f\\~", "5dc\u001bX<M`\u0015\u0006kZ9\u0001\u00058tSwC\u000b\u007fh\u0011-t}", "\u001cddAe(ED\u0015\f~Z5\f\\\u0003", "5dc\u001bX<M`\u0015\u0006kZ9\u0001\u00058tS{C\u000b\u007fh\u0011-t}", "\u001eqX:T9R\u001e", "5dc\u001de0FO&\u0013E&v{Z)K\u0005\u0018", "\u001eqX:T9R\u001fc", "5dc\u001de0FO&\u0013F)sG\b\u0001_e-k", "\u001eqX:T9R\u001fcI", "5dc\u001de0FO&\u0013F)vDS.7y\u000e\u00010", "\u001eqX:T9R c", "5dc\u001de0FO&\u0013G)sG\b\u0001_e-k", "\u001eqX:T9R!c", "5dc\u001de0FO&\u0013H)sG\b\u0001_e-k", "\u001eqX:T9R\"c", "5dc\u001de0FO&\u0013I)sG\b\u0001_e-k", "\u001eqX:T9R#c", "5dc\u001de0FO&\u0013J)sG\b\u0001_e-k", "\u001eqX:T9R$c", "5dc\u001de0FO&\u0013K)sG\b\u0001_e-k", "\u001eqX:T9R%c", "5dc\u001de0FO&\u0013L)sG\b\u0001_e-k", "\u001eqX:T9R&c", "5dc\u001de0FO&\u0013M)sG\b\u0001_e-k", "\u001eqX:T9R'c", "5dc\u001de0FO&\u0013N)sG\b\u0001_e-k", "\u001eqX:T9R'h", "5dc\u001de0FO&\u0013N.sG\b\u0001_e-k", "\u001eqX:T9R'l", "5dc\u001de0FO&\u0013N2sG\b\u0001_e-k", "!dR<a+:`-I", "5dc X*H\\\u0018z\brvDS.7y\u000e\u00010", "!dR<a+:`-JE", "5dc X*H\\\u0018z\brwGPydQ\"aEp", "!dR<a+:`-JE)", "5dc X*H\\\u0018z\brwGSv0~yu&\u0006\u0007", "!dR<a+:`-KE", "5dc X*H\\\u0018z\brxGPydQ\"aEp", "!dR<a+:`-LE", "5dc X*H\\\u0018z\bryGPydQ\"aEp", "!dR<a+:`-ME", "5dc X*H\\\u0018z\brzGPydQ\"aEp", "!dR<a+:`-NE", "5dc X*H\\\u0018z\br{GPydQ\"aEp", "!dR<a+:`-OE", "5dc X*H\\\u0018z\br|GPydQ\"aEp", "!dR<a+:`-PE", "5dc X*H\\\u0018z\br}GPydQ\"aEp", "!dR<a+:`-QE", "5dc X*H\\\u0018z\br~GPydQ\"aEp", "!dR<a+:`-RE", "5dc X*H\\\u0018z\br\u007fGPydQ\"aEp", "!dR<a+:`-RJ", "5dc X*H\\\u0018z\br\u007fLPydQ\"aEp", "!dR<a+:`-RN", "5dc X*H\\\u0018z\br\u007fPPydQ\"aEp", "\"daA\\(Kgc", "5dc!X9MW\u0015\f\u000f)sG\b\u0001_e-k", "\"daA\\(KgdI", "5dc!X9MW\u0015\f\u000f*vDS.7y\u000e\u00010", "\"daA\\(KgdIE", "5dc!X9MW\u0015\f\u000f*vGPydQ\"aEp", "\"daA\\(KgeI", "5dc!X9MW\u0015\f\u000f+vDS.7y\u000e\u00010", "\"daA\\(KgfI", "5dc!X9MW\u0015\f\u000f,vDS.7y\u000e\u00010", "\"daA\\(KggI", "5dc!X9MW\u0015\f\u000f-vDS.7y\u000e\u00010", "\"daA\\(KghI", "5dc!X9MW\u0015\f\u000f.vDS.7y\u000e\u00010", "\"daA\\(KgiI", "5dc!X9MW\u0015\f\u000f/vDS.7y\u000e\u00010", "\"daA\\(KgjI", "5dc!X9MW\u0015\f\u000f0vDS.7y\u000e\u00010", "\"daA\\(KgkI", "5dc!X9MW\u0015\f\u000f1vDS.7y\u000e\u00010", "\"daA\\(KglI", "5dc!X9MW\u0015\f\u000f2vDS.7y\u000e\u00010", "\"daA\\(KglN", "5dc!X9MW\u0015\f\u000f2{DS.7y\u000e\u00010", "\"daA\\(KglR", "5dc!X9MW\u0015\f\u000f2\u007fDS.7y\u000e\u00010", "%gXAX", "5dc$[0MS`Iy0&b\u000e\u001f", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PaletteTokens {
    public static final int $stable = 0;
    public static final PaletteTokens INSTANCE = new PaletteTokens();
    private static final long Black = ColorKt.Color$default(0, 0, 0, 0, 8, null);
    private static final long Error0 = ColorKt.Color$default(0, 0, 0, 0, 8, null);
    private static final long Error10 = ColorKt.Color$default(65, 14, 11, 0, 8, null);
    private static final long Error100 = ColorKt.Color$default(255, 255, 255, 0, 8, null);
    private static final long Error20 = ColorKt.Color$default(96, 20, 16, 0, 8, null);
    private static final long Error30 = ColorKt.Color$default(140, 29, 24, 0, 8, null);
    private static final long Error40 = ColorKt.Color$default(179, 38, 30, 0, 8, null);
    private static final long Error50 = ColorKt.Color$default(220, 54, 46, 0, 8, null);
    private static final long Error60 = ColorKt.Color$default(228, 105, 98, 0, 8, null);
    private static final long Error70 = ColorKt.Color$default(236, 146, 142, 0, 8, null);
    private static final long Error80 = ColorKt.Color$default(242, 184, 181, 0, 8, null);
    private static final long Error90 = ColorKt.Color$default(249, 222, 220, 0, 8, null);
    private static final long Error95 = ColorKt.Color$default(252, 238, 238, 0, 8, null);
    private static final long Error99 = ColorKt.Color$default(255, 251, 249, 0, 8, null);
    private static final long Neutral0 = ColorKt.Color$default(0, 0, 0, 0, 8, null);
    private static final long Neutral10 = ColorKt.Color$default(29, 27, 32, 0, 8, null);
    private static final long Neutral100 = ColorKt.Color$default(255, 255, 255, 0, 8, null);
    private static final long Neutral12 = ColorKt.Color$default(33, 31, 38, 0, 8, null);
    private static final long Neutral17 = ColorKt.Color$default(43, 41, 48, 0, 8, null);
    private static final long Neutral20 = ColorKt.Color$default(50, 47, 53, 0, 8, null);
    private static final long Neutral22 = ColorKt.Color$default(54, 52, 59, 0, 8, null);
    private static final long Neutral24 = ColorKt.Color$default(59, 56, 62, 0, 8, null);
    private static final long Neutral30 = ColorKt.Color$default(72, 70, 76, 0, 8, null);
    private static final long Neutral4 = ColorKt.Color$default(15, 13, 19, 0, 8, null);
    private static final long Neutral40 = ColorKt.Color$default(96, 93, 100, 0, 8, null);
    private static final long Neutral50 = ColorKt.Color$default(121, 118, 125, 0, 8, null);
    private static final long Neutral6 = ColorKt.Color$default(20, 18, 24, 0, 8, null);
    private static final long Neutral60 = ColorKt.Color$default(147, 143, 150, 0, 8, null);
    private static final long Neutral70 = ColorKt.Color$default(174, 169, 177, 0, 8, null);
    private static final long Neutral80 = ColorKt.Color$default(202, 197, 205, 0, 8, null);
    private static final long Neutral87 = ColorKt.Color$default(222, JfifUtil.MARKER_SOI, JfifUtil.MARKER_APP1, 0, 8, null);
    private static final long Neutral90 = ColorKt.Color$default(230, CanonMakernoteDirectory.TAG_SENSOR_INFO_ARRAY, 233, 0, 8, null);
    private static final long Neutral92 = ColorKt.Color$default(236, 230, 240, 0, 8, null);
    private static final long Neutral94 = ColorKt.Color$default(243, 237, 247, 0, 8, null);
    private static final long Neutral95 = ColorKt.Color$default(245, 239, 247, 0, 8, null);
    private static final long Neutral96 = ColorKt.Color$default(247, 242, 250, 0, 8, null);
    private static final long Neutral98 = ColorKt.Color$default(254, 247, 255, 0, 8, null);
    private static final long Neutral99 = ColorKt.Color$default(255, 251, 255, 0, 8, null);
    private static final long NeutralVariant0 = ColorKt.Color$default(0, 0, 0, 0, 8, null);
    private static final long NeutralVariant10 = ColorKt.Color$default(29, 26, 34, 0, 8, null);
    private static final long NeutralVariant100 = ColorKt.Color$default(255, 255, 255, 0, 8, null);
    private static final long NeutralVariant20 = ColorKt.Color$default(50, 47, 55, 0, 8, null);
    private static final long NeutralVariant30 = ColorKt.Color$default(73, 69, 79, 0, 8, null);
    private static final long NeutralVariant40 = ColorKt.Color$default(96, 93, 102, 0, 8, null);
    private static final long NeutralVariant50 = ColorKt.Color$default(121, 116, 126, 0, 8, null);
    private static final long NeutralVariant60 = ColorKt.Color$default(147, 143, 153, 0, 8, null);
    private static final long NeutralVariant70 = ColorKt.Color$default(174, 169, 180, 0, 8, null);
    private static final long NeutralVariant80 = ColorKt.Color$default(202, 196, 208, 0, 8, null);
    private static final long NeutralVariant90 = ColorKt.Color$default(231, CanonMakernoteDirectory.TAG_SENSOR_INFO_ARRAY, 236, 0, 8, null);
    private static final long NeutralVariant95 = ColorKt.Color$default(245, 238, 250, 0, 8, null);
    private static final long NeutralVariant99 = ColorKt.Color$default(255, 251, 254, 0, 8, null);
    private static final long Primary0 = ColorKt.Color$default(0, 0, 0, 0, 8, null);
    private static final long Primary10 = ColorKt.Color$default(33, 0, 93, 0, 8, null);
    private static final long Primary100 = ColorKt.Color$default(255, 255, 255, 0, 8, null);
    private static final long Primary20 = ColorKt.Color$default(56, 30, 114, 0, 8, null);
    private static final long Primary30 = ColorKt.Color$default(79, 55, 139, 0, 8, null);
    private static final long Primary40 = ColorKt.Color$default(103, 80, 164, 0, 8, null);
    private static final long Primary50 = ColorKt.Color$default(127, 103, 190, 0, 8, null);
    private static final long Primary60 = ColorKt.Color$default(154, 130, 219, 0, 8, null);
    private static final long Primary70 = ColorKt.Color$default(182, 157, 248, 0, 8, null);
    private static final long Primary80 = ColorKt.Color$default(208, 188, 255, 0, 8, null);
    private static final long Primary90 = ColorKt.Color$default(234, 221, 255, 0, 8, null);
    private static final long Primary95 = ColorKt.Color$default(246, 237, 255, 0, 8, null);
    private static final long Primary99 = ColorKt.Color$default(255, 251, 254, 0, 8, null);
    private static final long Secondary0 = ColorKt.Color$default(0, 0, 0, 0, 8, null);
    private static final long Secondary10 = ColorKt.Color$default(29, 25, 43, 0, 8, null);
    private static final long Secondary100 = ColorKt.Color$default(255, 255, 255, 0, 8, null);
    private static final long Secondary20 = ColorKt.Color$default(51, 45, 65, 0, 8, null);
    private static final long Secondary30 = ColorKt.Color$default(74, 68, 88, 0, 8, null);
    private static final long Secondary40 = ColorKt.Color$default(98, 91, 113, 0, 8, null);
    private static final long Secondary50 = ColorKt.Color$default(122, 114, 137, 0, 8, null);
    private static final long Secondary60 = ColorKt.Color$default(149, 141, 165, 0, 8, null);
    private static final long Secondary70 = ColorKt.Color$default(176, 167, 192, 0, 8, null);
    private static final long Secondary80 = ColorKt.Color$default(204, 194, 220, 0, 8, null);
    private static final long Secondary90 = ColorKt.Color$default(232, 222, 248, 0, 8, null);
    private static final long Secondary95 = ColorKt.Color$default(246, 237, 255, 0, 8, null);
    private static final long Secondary99 = ColorKt.Color$default(255, 251, 254, 0, 8, null);
    private static final long Tertiary0 = ColorKt.Color$default(0, 0, 0, 0, 8, null);
    private static final long Tertiary10 = ColorKt.Color$default(49, 17, 29, 0, 8, null);
    private static final long Tertiary100 = ColorKt.Color$default(255, 255, 255, 0, 8, null);
    private static final long Tertiary20 = ColorKt.Color$default(73, 37, 50, 0, 8, null);
    private static final long Tertiary30 = ColorKt.Color$default(99, 59, 72, 0, 8, null);
    private static final long Tertiary40 = ColorKt.Color$default(125, 82, 96, 0, 8, null);
    private static final long Tertiary50 = ColorKt.Color$default(152, 105, PanasonicMakernoteDirectory.TAG_BURST_SPEED, 0, 8, null);
    private static final long Tertiary60 = ColorKt.Color$default(181, 131, 146, 0, 8, null);
    private static final long Tertiary70 = ColorKt.Color$default(Mp4VideoDirectory.TAG_COMPRESSION_TYPE, 157, 172, 0, 8, null);
    private static final long Tertiary80 = ColorKt.Color$default(239, 184, 200, 0, 8, null);
    private static final long Tertiary90 = ColorKt.Color$default(255, JfifUtil.MARKER_SOI, 228, 0, 8, null);
    private static final long Tertiary95 = ColorKt.Color$default(255, 236, 241, 0, 8, null);
    private static final long Tertiary99 = ColorKt.Color$default(255, 251, 250, 0, 8, null);
    private static final long White = ColorKt.Color$default(255, 255, 255, 0, 8, null);

    private PaletteTokens() {
    }

    /* JADX INFO: renamed from: getBlack-0d7_KjU, reason: not valid java name */
    public final long m3385getBlack0d7_KjU() {
        return Black;
    }

    /* JADX INFO: renamed from: getError0-0d7_KjU, reason: not valid java name */
    public final long m3386getError00d7_KjU() {
        return Error0;
    }

    /* JADX INFO: renamed from: getError10-0d7_KjU, reason: not valid java name */
    public final long m3387getError100d7_KjU() {
        return Error10;
    }

    /* JADX INFO: renamed from: getError100-0d7_KjU, reason: not valid java name */
    public final long m3388getError1000d7_KjU() {
        return Error100;
    }

    /* JADX INFO: renamed from: getError20-0d7_KjU, reason: not valid java name */
    public final long m3389getError200d7_KjU() {
        return Error20;
    }

    /* JADX INFO: renamed from: getError30-0d7_KjU, reason: not valid java name */
    public final long m3390getError300d7_KjU() {
        return Error30;
    }

    /* JADX INFO: renamed from: getError40-0d7_KjU, reason: not valid java name */
    public final long m3391getError400d7_KjU() {
        return Error40;
    }

    /* JADX INFO: renamed from: getError50-0d7_KjU, reason: not valid java name */
    public final long m3392getError500d7_KjU() {
        return Error50;
    }

    /* JADX INFO: renamed from: getError60-0d7_KjU, reason: not valid java name */
    public final long m3393getError600d7_KjU() {
        return Error60;
    }

    /* JADX INFO: renamed from: getError70-0d7_KjU, reason: not valid java name */
    public final long m3394getError700d7_KjU() {
        return Error70;
    }

    /* JADX INFO: renamed from: getError80-0d7_KjU, reason: not valid java name */
    public final long m3395getError800d7_KjU() {
        return Error80;
    }

    /* JADX INFO: renamed from: getError90-0d7_KjU, reason: not valid java name */
    public final long m3396getError900d7_KjU() {
        return Error90;
    }

    /* JADX INFO: renamed from: getError95-0d7_KjU, reason: not valid java name */
    public final long m3397getError950d7_KjU() {
        return Error95;
    }

    /* JADX INFO: renamed from: getError99-0d7_KjU, reason: not valid java name */
    public final long m3398getError990d7_KjU() {
        return Error99;
    }

    /* JADX INFO: renamed from: getNeutral0-0d7_KjU, reason: not valid java name */
    public final long m3399getNeutral00d7_KjU() {
        return Neutral0;
    }

    /* JADX INFO: renamed from: getNeutral10-0d7_KjU, reason: not valid java name */
    public final long m3400getNeutral100d7_KjU() {
        return Neutral10;
    }

    /* JADX INFO: renamed from: getNeutral100-0d7_KjU, reason: not valid java name */
    public final long m3401getNeutral1000d7_KjU() {
        return Neutral100;
    }

    /* JADX INFO: renamed from: getNeutral12-0d7_KjU, reason: not valid java name */
    public final long m3402getNeutral120d7_KjU() {
        return Neutral12;
    }

    /* JADX INFO: renamed from: getNeutral17-0d7_KjU, reason: not valid java name */
    public final long m3403getNeutral170d7_KjU() {
        return Neutral17;
    }

    /* JADX INFO: renamed from: getNeutral20-0d7_KjU, reason: not valid java name */
    public final long m3404getNeutral200d7_KjU() {
        return Neutral20;
    }

    /* JADX INFO: renamed from: getNeutral22-0d7_KjU, reason: not valid java name */
    public final long m3405getNeutral220d7_KjU() {
        return Neutral22;
    }

    /* JADX INFO: renamed from: getNeutral24-0d7_KjU, reason: not valid java name */
    public final long m3406getNeutral240d7_KjU() {
        return Neutral24;
    }

    /* JADX INFO: renamed from: getNeutral30-0d7_KjU, reason: not valid java name */
    public final long m3407getNeutral300d7_KjU() {
        return Neutral30;
    }

    /* JADX INFO: renamed from: getNeutral4-0d7_KjU, reason: not valid java name */
    public final long m3408getNeutral40d7_KjU() {
        return Neutral4;
    }

    /* JADX INFO: renamed from: getNeutral40-0d7_KjU, reason: not valid java name */
    public final long m3409getNeutral400d7_KjU() {
        return Neutral40;
    }

    /* JADX INFO: renamed from: getNeutral50-0d7_KjU, reason: not valid java name */
    public final long m3410getNeutral500d7_KjU() {
        return Neutral50;
    }

    /* JADX INFO: renamed from: getNeutral6-0d7_KjU, reason: not valid java name */
    public final long m3411getNeutral60d7_KjU() {
        return Neutral6;
    }

    /* JADX INFO: renamed from: getNeutral60-0d7_KjU, reason: not valid java name */
    public final long m3412getNeutral600d7_KjU() {
        return Neutral60;
    }

    /* JADX INFO: renamed from: getNeutral70-0d7_KjU, reason: not valid java name */
    public final long m3413getNeutral700d7_KjU() {
        return Neutral70;
    }

    /* JADX INFO: renamed from: getNeutral80-0d7_KjU, reason: not valid java name */
    public final long m3414getNeutral800d7_KjU() {
        return Neutral80;
    }

    /* JADX INFO: renamed from: getNeutral87-0d7_KjU, reason: not valid java name */
    public final long m3415getNeutral870d7_KjU() {
        return Neutral87;
    }

    /* JADX INFO: renamed from: getNeutral90-0d7_KjU, reason: not valid java name */
    public final long m3416getNeutral900d7_KjU() {
        return Neutral90;
    }

    /* JADX INFO: renamed from: getNeutral92-0d7_KjU, reason: not valid java name */
    public final long m3417getNeutral920d7_KjU() {
        return Neutral92;
    }

    /* JADX INFO: renamed from: getNeutral94-0d7_KjU, reason: not valid java name */
    public final long m3418getNeutral940d7_KjU() {
        return Neutral94;
    }

    /* JADX INFO: renamed from: getNeutral95-0d7_KjU, reason: not valid java name */
    public final long m3419getNeutral950d7_KjU() {
        return Neutral95;
    }

    /* JADX INFO: renamed from: getNeutral96-0d7_KjU, reason: not valid java name */
    public final long m3420getNeutral960d7_KjU() {
        return Neutral96;
    }

    /* JADX INFO: renamed from: getNeutral98-0d7_KjU, reason: not valid java name */
    public final long m3421getNeutral980d7_KjU() {
        return Neutral98;
    }

    /* JADX INFO: renamed from: getNeutral99-0d7_KjU, reason: not valid java name */
    public final long m3422getNeutral990d7_KjU() {
        return Neutral99;
    }

    /* JADX INFO: renamed from: getNeutralVariant0-0d7_KjU, reason: not valid java name */
    public final long m3423getNeutralVariant00d7_KjU() {
        return NeutralVariant0;
    }

    /* JADX INFO: renamed from: getNeutralVariant10-0d7_KjU, reason: not valid java name */
    public final long m3424getNeutralVariant100d7_KjU() {
        return NeutralVariant10;
    }

    /* JADX INFO: renamed from: getNeutralVariant100-0d7_KjU, reason: not valid java name */
    public final long m3425getNeutralVariant1000d7_KjU() {
        return NeutralVariant100;
    }

    /* JADX INFO: renamed from: getNeutralVariant20-0d7_KjU, reason: not valid java name */
    public final long m3426getNeutralVariant200d7_KjU() {
        return NeutralVariant20;
    }

    /* JADX INFO: renamed from: getNeutralVariant30-0d7_KjU, reason: not valid java name */
    public final long m3427getNeutralVariant300d7_KjU() {
        return NeutralVariant30;
    }

    /* JADX INFO: renamed from: getNeutralVariant40-0d7_KjU, reason: not valid java name */
    public final long m3428getNeutralVariant400d7_KjU() {
        return NeutralVariant40;
    }

    /* JADX INFO: renamed from: getNeutralVariant50-0d7_KjU, reason: not valid java name */
    public final long m3429getNeutralVariant500d7_KjU() {
        return NeutralVariant50;
    }

    /* JADX INFO: renamed from: getNeutralVariant60-0d7_KjU, reason: not valid java name */
    public final long m3430getNeutralVariant600d7_KjU() {
        return NeutralVariant60;
    }

    /* JADX INFO: renamed from: getNeutralVariant70-0d7_KjU, reason: not valid java name */
    public final long m3431getNeutralVariant700d7_KjU() {
        return NeutralVariant70;
    }

    /* JADX INFO: renamed from: getNeutralVariant80-0d7_KjU, reason: not valid java name */
    public final long m3432getNeutralVariant800d7_KjU() {
        return NeutralVariant80;
    }

    /* JADX INFO: renamed from: getNeutralVariant90-0d7_KjU, reason: not valid java name */
    public final long m3433getNeutralVariant900d7_KjU() {
        return NeutralVariant90;
    }

    /* JADX INFO: renamed from: getNeutralVariant95-0d7_KjU, reason: not valid java name */
    public final long m3434getNeutralVariant950d7_KjU() {
        return NeutralVariant95;
    }

    /* JADX INFO: renamed from: getNeutralVariant99-0d7_KjU, reason: not valid java name */
    public final long m3435getNeutralVariant990d7_KjU() {
        return NeutralVariant99;
    }

    /* JADX INFO: renamed from: getPrimary0-0d7_KjU, reason: not valid java name */
    public final long m3436getPrimary00d7_KjU() {
        return Primary0;
    }

    /* JADX INFO: renamed from: getPrimary10-0d7_KjU, reason: not valid java name */
    public final long m3437getPrimary100d7_KjU() {
        return Primary10;
    }

    /* JADX INFO: renamed from: getPrimary100-0d7_KjU, reason: not valid java name */
    public final long m3438getPrimary1000d7_KjU() {
        return Primary100;
    }

    /* JADX INFO: renamed from: getPrimary20-0d7_KjU, reason: not valid java name */
    public final long m3439getPrimary200d7_KjU() {
        return Primary20;
    }

    /* JADX INFO: renamed from: getPrimary30-0d7_KjU, reason: not valid java name */
    public final long m3440getPrimary300d7_KjU() {
        return Primary30;
    }

    /* JADX INFO: renamed from: getPrimary40-0d7_KjU, reason: not valid java name */
    public final long m3441getPrimary400d7_KjU() {
        return Primary40;
    }

    /* JADX INFO: renamed from: getPrimary50-0d7_KjU, reason: not valid java name */
    public final long m3442getPrimary500d7_KjU() {
        return Primary50;
    }

    /* JADX INFO: renamed from: getPrimary60-0d7_KjU, reason: not valid java name */
    public final long m3443getPrimary600d7_KjU() {
        return Primary60;
    }

    /* JADX INFO: renamed from: getPrimary70-0d7_KjU, reason: not valid java name */
    public final long m3444getPrimary700d7_KjU() {
        return Primary70;
    }

    /* JADX INFO: renamed from: getPrimary80-0d7_KjU, reason: not valid java name */
    public final long m3445getPrimary800d7_KjU() {
        return Primary80;
    }

    /* JADX INFO: renamed from: getPrimary90-0d7_KjU, reason: not valid java name */
    public final long m3446getPrimary900d7_KjU() {
        return Primary90;
    }

    /* JADX INFO: renamed from: getPrimary95-0d7_KjU, reason: not valid java name */
    public final long m3447getPrimary950d7_KjU() {
        return Primary95;
    }

    /* JADX INFO: renamed from: getPrimary99-0d7_KjU, reason: not valid java name */
    public final long m3448getPrimary990d7_KjU() {
        return Primary99;
    }

    /* JADX INFO: renamed from: getSecondary0-0d7_KjU, reason: not valid java name */
    public final long m3449getSecondary00d7_KjU() {
        return Secondary0;
    }

    /* JADX INFO: renamed from: getSecondary10-0d7_KjU, reason: not valid java name */
    public final long m3450getSecondary100d7_KjU() {
        return Secondary10;
    }

    /* JADX INFO: renamed from: getSecondary100-0d7_KjU, reason: not valid java name */
    public final long m3451getSecondary1000d7_KjU() {
        return Secondary100;
    }

    /* JADX INFO: renamed from: getSecondary20-0d7_KjU, reason: not valid java name */
    public final long m3452getSecondary200d7_KjU() {
        return Secondary20;
    }

    /* JADX INFO: renamed from: getSecondary30-0d7_KjU, reason: not valid java name */
    public final long m3453getSecondary300d7_KjU() {
        return Secondary30;
    }

    /* JADX INFO: renamed from: getSecondary40-0d7_KjU, reason: not valid java name */
    public final long m3454getSecondary400d7_KjU() {
        return Secondary40;
    }

    /* JADX INFO: renamed from: getSecondary50-0d7_KjU, reason: not valid java name */
    public final long m3455getSecondary500d7_KjU() {
        return Secondary50;
    }

    /* JADX INFO: renamed from: getSecondary60-0d7_KjU, reason: not valid java name */
    public final long m3456getSecondary600d7_KjU() {
        return Secondary60;
    }

    /* JADX INFO: renamed from: getSecondary70-0d7_KjU, reason: not valid java name */
    public final long m3457getSecondary700d7_KjU() {
        return Secondary70;
    }

    /* JADX INFO: renamed from: getSecondary80-0d7_KjU, reason: not valid java name */
    public final long m3458getSecondary800d7_KjU() {
        return Secondary80;
    }

    /* JADX INFO: renamed from: getSecondary90-0d7_KjU, reason: not valid java name */
    public final long m3459getSecondary900d7_KjU() {
        return Secondary90;
    }

    /* JADX INFO: renamed from: getSecondary95-0d7_KjU, reason: not valid java name */
    public final long m3460getSecondary950d7_KjU() {
        return Secondary95;
    }

    /* JADX INFO: renamed from: getSecondary99-0d7_KjU, reason: not valid java name */
    public final long m3461getSecondary990d7_KjU() {
        return Secondary99;
    }

    /* JADX INFO: renamed from: getTertiary0-0d7_KjU, reason: not valid java name */
    public final long m3462getTertiary00d7_KjU() {
        return Tertiary0;
    }

    /* JADX INFO: renamed from: getTertiary10-0d7_KjU, reason: not valid java name */
    public final long m3463getTertiary100d7_KjU() {
        return Tertiary10;
    }

    /* JADX INFO: renamed from: getTertiary100-0d7_KjU, reason: not valid java name */
    public final long m3464getTertiary1000d7_KjU() {
        return Tertiary100;
    }

    /* JADX INFO: renamed from: getTertiary20-0d7_KjU, reason: not valid java name */
    public final long m3465getTertiary200d7_KjU() {
        return Tertiary20;
    }

    /* JADX INFO: renamed from: getTertiary30-0d7_KjU, reason: not valid java name */
    public final long m3466getTertiary300d7_KjU() {
        return Tertiary30;
    }

    /* JADX INFO: renamed from: getTertiary40-0d7_KjU, reason: not valid java name */
    public final long m3467getTertiary400d7_KjU() {
        return Tertiary40;
    }

    /* JADX INFO: renamed from: getTertiary50-0d7_KjU, reason: not valid java name */
    public final long m3468getTertiary500d7_KjU() {
        return Tertiary50;
    }

    /* JADX INFO: renamed from: getTertiary60-0d7_KjU, reason: not valid java name */
    public final long m3469getTertiary600d7_KjU() {
        return Tertiary60;
    }

    /* JADX INFO: renamed from: getTertiary70-0d7_KjU, reason: not valid java name */
    public final long m3470getTertiary700d7_KjU() {
        return Tertiary70;
    }

    /* JADX INFO: renamed from: getTertiary80-0d7_KjU, reason: not valid java name */
    public final long m3471getTertiary800d7_KjU() {
        return Tertiary80;
    }

    /* JADX INFO: renamed from: getTertiary90-0d7_KjU, reason: not valid java name */
    public final long m3472getTertiary900d7_KjU() {
        return Tertiary90;
    }

    /* JADX INFO: renamed from: getTertiary95-0d7_KjU, reason: not valid java name */
    public final long m3473getTertiary950d7_KjU() {
        return Tertiary95;
    }

    /* JADX INFO: renamed from: getTertiary99-0d7_KjU, reason: not valid java name */
    public final long m3474getTertiary990d7_KjU() {
        return Tertiary99;
    }

    /* JADX INFO: renamed from: getWhite-0d7_KjU, reason: not valid java name */
    public final long m3475getWhite0d7_KjU() {
        return White;
    }
}
