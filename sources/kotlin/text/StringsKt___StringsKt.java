package kotlin.text;

import com.dynatrace.android.agent.AdkSettings;
import com.dynatrace.android.agent.Global;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.TuplesKt;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.Grouping;
import kotlin.collections.IndexedValue;
import kotlin.collections.IndexingIterable;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.collections.SlidingWindowKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯŽ\u0014D߬)\u001ew\tLDq\u007f\fǻ\u000e0!.J~06\u001aw\rfr9>^m߉6Ri*\u0017ӆ\u000442},qI<]\u001a\u0014\"\u0011OTjonX}\u0013C\u0015\f\u001exxJQU\u0007i\u001aƁ:B}E;MuJA`\u000b6\r H\"@y\u000b\u0002\"*^\u0010~zYK\u0014\u00126Hx:`҈U\u0005 \u0018\u000e>.\u001e&\\mV>H\u0003]B/)\u0005qB\\'g0\u0003Q\u0015FbF\u0015Ǹi\u001eA@?5\u001b2[\u0003\u0015_c?\tBy=\u0013l/'9N{W<[\b\u0014++W\rsr.\\\u000bkh\f=+WcQg\u0016(\u000ez\u0004\rB\u0007\u0016\u00065O6Ʀ\"f\u001e\u000e;txSHP\u0018^J\u007f\u0001h>\u0017;\u007f;+O\u001bnQg<!NE\u001c\r\r$&\tn7[\\\u000ef\u00193v\u0006\u0383IQn<pN8Ym}\u0012qz\u000e:\u0006@G.2\f\u0013>\u0017S6\n;iܰqʮGֳ\u007f~\u0013d\u0001S\u0018Qp@Pn.Y8\r$Zrc-k~T\t<\u001fN4`\u0017\u007f\u0018\u0013N_\b>1%>M}j0қSУ\tɘGtE^\u0007q\u001eYI^a8\u007fi8a\u0001v,MJi\u001d^vDc\f\t_V*ZH\u0019\u0010\u0010BRW$\u001fBA\u0002\u001cz7A\u001bl\u0015\u000f\u000fLLa~\u000fݠhs0\u0001Z22\u000f\u0012$#\t1lj}\b\u007f\tK<|\u000f%=OaA)(e\"/?\r%\u0017~:\fuuzI\u0013̅\u001cçTݨ8J(Hi;M\u0015\u001f~o=\u0012/UL!h\u007fW2)\u0001۠\b\u001ach\\g8z~<xvZQd\u0017Pynt3\b+\u000b(c\rڰMуSެs\rW\u0002\u001beLPH|K*.'\u0011oh\tc7c)#ȶ\u0006\u001fO\u0017g\\w{Vy\u0011\u000fV\u0005s\u0014Do&qrQ\f5K:YYEIP&\u001d\u0013PY\u0003\u0004\u0018D\u00194;6XCtp\u001dD{\ru̕l÷+ݸ\t&iL+oDGNa0ϒQ\t4tI$\u001f`{w}qQŌ\u001bJU\u0015\u001b\u007f7ޫ\"\u001ck#\u0005k\u000b\t^\u0006$\u001cDVSbKO94B<T\u0014\u001bEdi4\u0013\u000b\u0002V_U\"`D:İ\\\u05ceSۿחZH\u0013v]J/<\u0019~UF>z;̍\u0013xfV5b@\rs3\u000f\u001bxb'v5/JǴI\u001bnc\u0011\u000fK؏SIHB2[Qm\u001ao<<&\u00125B^.ia\u001fo\u000f<n\red|g\u0007\u0014vR\u0015-W\u0001+\r\u001cM\"\u001b\u001b\u001b_r\u001ee=N^w}OH\u0003]״/ކ\u000bűސJ\u001b;\u001dM\u000fKa\u0003\u0014m\u000fwUAջ\u0016+@)\ns/hw$l\nk.b&\u0002\u001ahկ\u0019\u0013\u0017+\u00142PƓ\u0003\nt\u0014dc*30\u0013\u000f]y\r9@m>\u001d\"PX\u0001\u0011\u001ae|c\u001dX\u001b\u0011v=f{~-\u0017(\u0019)].Yd\tH?Ufǌ\u0017ؠ\u0013ݻӔ#6\u0016xAD]|\u0001|{Qk\rY2{,q1v^L\b?{{â8`P\u0015iV}Nr#txRY\u001e^\u0019+tv\u001c)Z\t-J%ƿ\u0019\u0383Eݱ64=R1\u001f\" gb\rʗSUF77QM._B\u001bs.ϓ!\u0003he\u0005\u00040Х\u0019rFsZAnTk\u001aW]2\u0003|\u0003l^uHP\"D\u001d\u001e\u0013?Zf#N^*\u001c\u0002]aC_֎\u0007κ7ۍ˲\u000b\u0019C\u0001ik3F\u0019\u0003\u0011\u000fOy_\nh\u0011_rQ/?s)v~;SU,Q?>\u0010\u0002b\u0005]ef\u000f(MwRe \u007f\u07baN!2\u001fR$6y1\u001f]1vJ\u0010lNc\fc\u0014(:6\u001dD3I|x:+Zk^x|soVY\u0001$\u001bT>XK\u001b\u000fmM\u0017y;H\u001bd,7=&o8//\u001eq\nF;K\u0003Mu}\fD3u\n͡@\u0003^yu@\n.\u0014L*T\u0012\u000b\u001b}_l(D\"\u000f\u001d\u0004&1bb\u0010`c9UM=KNg\u0007pYb9`7$\r.\tՅ\u0011\u001e8<k/\u0002,j\t\u0015A3w\u0004OH*b\f#-\u0011\n(\u0016'wju>\u0004s\u001f״?Ê\nǋbhC\nt\u0005\u0004!sdY\u00150n9S_Vl:Bh\u00142]dv.lxrF\u001e4>Uh~\tcu\u0011*EUUCe'2\u00117\fh\u001fPOW\u001drm3;\u001f\u001a\u0003>_A\u00139<\u0004=@H\f\r_^\u0014*jpm|\u001cI8\u0003\u0010JQ?\u0014@GM[nfem\u001cgA\u000f\fN&R\bYڨhճ\u0012ث&Dm*d6\u0005GpK\b/\u0017Rx\u0010\u0013\u0001\u001c0\u001c8\u0004\tM\b!bJ4ia\u0007ځ4ö\b\u0097g\r\nR}o\u0015t\u0002Ms+&)L2\n\u001dsQo\u0014\u001dTlZN\u0017\u0006%n\u0015H®#Ů`҅`K>?mc\u001c\t\u001cT\u000f/\nDy1|\u0006\u0003ht>\u0012ALJ|\u0019\u0015N,\u001d\u0018ɉhƴ_͟`k\u001e\f\u0005,U9pjG\u00011OoA,7r\u0017SwAe:m2Um%uj\u0016\u0010za&\u0018*_yͳ\u0013Ӟ+̗-\u001fL\u0013\u000b\u0006\u0003\u0004{3,k]2v^NFEZU\u000e/ǡ0Ħ\u0010|\u0013Y\u0007u`\u007f\u000e\u001f!d'#L\u001aqgGH9\u001f\u0013\u001bL\b`Ph|~X\u000b$\\}LƯ\u0018ݹzҚ\u0005c\u0002*KW m\\]LG.y\u0006!%w\"\u0006sJQRyd!]\\L&\t ߲_ϴ\u0001ۿ:`27-'0H\\J`\"S&\u001d70kv\u007f\t47\u0006\u05eb3~{?BsD&v_m:gge_\u000fE[2\u0002\n[I\u001c}YwTɯ\u001cГNع\u0006-ill\u0016`%\u0018\u0004_.$\u0006iC/\u0019\u0018sDzh\u001cӁ\u0007\u001ep|> `\u0019~n|V\b:M\u0018\u001d\u00143A\u0004+3@S^\u000f\u0018Fê\u000f\u0085\u001cνi\u0018r>\\\u0011n\u0015RH\u0018݊V\r\u000f\u0012I7mKCP>9sxpO#p\u001cg*\u0006R\rVl@P\u001a\t&EK ¡=\u0017y\u0002n;m\u0011\u0019W)\u0014M\u0019_\n\u00020`Jm\\0/\n\u0007<z-ǤV\u0603@\u05f5ؼ2v\u0005*/a#:BEP\u001dkeGg5Fz<utcf\u000b\u001e\u001d^k)@}4 ACeֽ\u0014ɧ\u0007ؓ\r}B\b\u000e\u0001nf;\fHa^\u0018\"\u0006}X\u00157\u001aA_Bcr)+&^\rDKʟ+գ'ӣ0eo&+o[\\BM\u0019؊)\"1\u0014J~\u000e\t\f\b\u001fzH2@$c%W\nY\u0017\u000f\b\u000e\"a<@u\u0019Mzp\u000e0zo\u0019v\r\u0012\u0016ӕB֤}ԧĔI(\u001e`jx\"\u001etDm\u0010HN\u001dҞ,SR(`AW0y\u0013\u0011}\u001ev\u0003f uLn{\rpE9$\u00192\u0011\u0003\u0019#\f.$@iUtc=h=\u05feIڔ]ڝʃm|\u0016k5-\u0014\b}428w|Ikb@R:p\u0015<q\u001c\u000f\\P[\u001dFaL\"g;Iuvߤ\u001dڋ?Ր߹\b/TN\u000b2~oJKu[M/\u0007)\u001fk*?^SYY~1*\u0017T;q93K\u0014!JG.ӁOǓ\u0014ռߜn\f\u0003@5=\u007f\u001cv*m\u0005.$BB\u0017X~\u0003\u0003>$\u001f\\\u0014#\"\u0013yB/Zn_,&\u0012\u0014Q7Y\u0002dA`b\u007f\u0001΄ ԛ]̮\u001f@4cE\u000baK#RJٺA\u000e\fG\u00048\u0005\r=1m{U=d\u0004\u000b\u007f,2 C\bvqmLDF9WF\u0010Ϲ8ߥ\u000bɤδs|>\f*\u0002\u0019\u0006*\u0015H?d!;\\l͟Bi\u001e\\d.\u0006DW}>xDzV\u001a]Gf.49-cz\u0001\nu\u001d\bAA]Μ\u001cַ}êހi\u0005sh;9TDk5wz\u0006V\u0013\u000fv\u0017\u07b6h4PY74,nl\"!\n}j\\\u001efL)V\\Fy\u0011>$*bV\u0010>r\u007fPhW/_\rيA\u07berȩȚ=qn4o[^/O\u001c\u001bsBC\u0013\u0001\r>Ma\u0011ԆX>{\u0013\u0002\u0002\u0002C`HOYi\ngF\u001b\u000b>'Uo/q\u001585`ypD)\u0006Ǫ}ک_\u0099XR\u0011o-J0(\"'S_k;\u0017\u0016<\u0087\u0013,\u007fP\u0013\u0002#u(\"\u0004w\u0019H\"Tkc͵dewl5dP>!',5/D9i|&#\u0018~l\u001cWI_@1\u0017\u00048o\u007f\u001eVߘ\u0003ě3ζΧ]\u0012G^3M/\u0003_g\u0010gU\u0006\u0014ė^\u0011\u001f?^sy\"\u000b`$6\tϼS:?)\u0019#\r\u0019*X\u001ffT@w.\rM@M;7~\u001f`:I/\u0011\t؊y|_\u0017&d-%G_\u0005\u0006\u0016\u0012UhWE{h0}b\u0001,[dlU\f'Zsl+ϩHĨAͻƬ$\u000e\u0012\u001ct\u00057\bYG@lnyIr+ͬpkn_\u0017\u0010\u0002\u000f%,\u000fdCݴ-s|(I]j\u0017)\n\"\u0011gM%t|y}oo.JsJv{\u0001a\u001e#\f$5$^khCK$o:.vʤIΏ@ϋՂ%\u00111;$\u0002W0\u0013y'\u0003JE\rͱ48o\u0001xsxr\u000f\u0011xn\u001dXxL<H\u000b(3\u001d|)Z\rգ1c{\u0018-k>6\r\u0015cJ\t\u001f\u001d\u00137*[\u0010,L\u0019M\u0010tialǅ\u001aє\u001c˗մu\u0004<a\u000bp@S\u0018\u001e|\u0017fczԓ\u0006]mB\fi;RD\u0005\u001e\u000f\u0011u#>>M-\u0003!Tl`#%нHg%X\u001e\u0001\rb-~vkjW\u0012!v/8eŴQ\u0012\u001e [?'\u0014{\u0006{{}7'D[\u0012I\u0003Q\u0005B\u007f\fI\u0019=5חJֹrШϱ_UzefeD>6FXFmftÃ2,8R\u0016:OBXL_N\u0010\u0006=\u0012t.=m]vA2C\u0002#T2\u0010\u0006\\Ҭ{blr\u0006j\u0001\u00107\u00151\u0001\u0002a\u000b7WL#\u0007Qd'ӓ\u0019ȿ!Ǯӄ\u0016:\"C-]\u000e`8H^\"MP8ՈQ\rKq7B!G]?ph=?(\u001dp{]=\u00177FWPKǙ1\u001b\t5r7Z-yIU ;QX-\u001f\u0016Ep`\u001em'\u000e`ʴWn$h\u0010em}\"\u0016.2Ub-Oxop\u0018L\u0003uˣ\u001cղ\u001dͷԥ\u0019'^z,T`X\u0015$ftP\u0002BEL-v?\u0014\u0018=RK;7\u0011^Y\u0001\u0005_:#q9с%ϔ\nރz=\r\u001e`1G\u0006y>Mr\u0015i9AJkS#.>^IŠ\rx?Usq\u000b+\bYm\u001f\nU\u0004@qEr5R\b;\n8jX\t~ڴAӖV߾\u0007=|\\lInk\u001dB\u001d\t@567+P\u0019]kP\\*>|;I=/\u001e=9\u000f\u001f\u0018\u0004Xd%{ƵI˗@ʸ;\u0011Hg;\u0017b\u001a-\r\\BKzA\u007fJsf`\u0014cٮe@\u0004\u001e\u001bpm5Td\u0004V1\"o>zD0Tx66E\u001a(\u0002HQ\u001d?t\u0016ݐ\u0019$iz\u0014c]V\u0017\u0019AEW\u0004]s|v\u001b\u000533]\u00079m5և/ϩhͩKj*OlCOwx!2A\u0014Gi$\u0012k`\u0013X7ZI@(n\nW݊fI\u00102VY\nk@\u0016dF#TAk\r\u000f\u000e&V{xh\u0007o\f>\u0012\u0010B/|bHN!\u001baW\u0005\u0002a\u0004%S$;e\";Eiߝ*ĊhϏS!\u0001BOv.YM\b\u001cӰ2~`.WIh=:Q6huǍ#y v(L[\u001b1\u0006\u001cA%E6N[@WO'Vj`\u0013lsz[eQF~0d\"5\u0012:.\u0003.\"\u0014bl\u0004JmQFϵYƏiȩڨ5!}#*'\u0006goC\u001c\u0019\rGIӒ3\u0013|lMv|\u000b\u007fE[dM1<\u000fONeҹuFxo2\u001ea*\\\"h|\u001b@\u0004&n`|\u000f\rC\"\rD>_o\u000e\u000bAT\u0003Qm++-Kc-iu1U\u0005T6jKU;%C,YR)\u0004\u0019k1\u007f\u0012pI0\u001d\u001cW`ּ\u0002ب\u0012ϐӉUAYl~\u0017\b\"=sc\u0015$,]3\u001e!`j:6\u001c\u0002\u0014u\u0019ڄLma:uiEx\\|'\u0015\u00172X :\u0006FR0-|&|Z\u0016V\u0003Ο\u000fʥR̳\u000f&DB\u0010r#}\u0006\u0019y\u0006UVS\u0003%oou$\u0003\by\u0003JAifQs\u0016jҴFܹzɋIb9K\b\u0006E\u001c\u0005lGe\\8Ne&\u000f\u000b\u0007Zk|S`r)z\u000e|U]%Ƅ\u0019Λ\u0002ڳkJz]^1x[ )C\u0011{\u0010M&WP-.\u001c+,2&Bqre_j\u001c6z\u0014z9\u000eyMn&8@UӶ\u001dȸ ܓ&\u0006\u0017EP\u001a\u0012Bxe\u000bhv5ӱCy~M\u0007G.d16-F\u0011p\u001e31dC;F5c{;[C%C&\u0005\u0004LM\u000b\u00021k3׃L־\rژѳN\b[Fi&[,\u0004wk>a\u0010w#\u0018)P\u0013}ȷ,\u001f|5o{%3\u0006E \u000e+kXi\u0004\u001560A0VB}\u0010\u001bČTħ5͋-fL\u000er`v\u000fI\t@=i, *Rǚ^\u0007!o0N{lgz#zMT\u00193\u0002uʖ\u000bA\u0005;a D\u0012pO\u0010io\u001360\u0017\u0004B84}\u000bu\u0013R8J;Ԟ$ŉ\u0015ȝ%m|>Z0~t\u0017\u0019E}\u00189iT\u000fҫ\u0017o0=1\u000eUs\u001fsDb+\u000e9bkp\u000f$\u0005C\u0082v.~M9Xn-*-\u001c\u001b\u000e\u0017SDQQ/_cRo\u0016\u0012r,S\u007f%BڧMǧ\u0007٠b\u0010\u001a;['R\u0017\u0011M\u007fӨ\u0011/U\u0018Y@{&\tCX\u0018\u000enX;m˝:Rqm\u000fki\u001b#\u001a\u0017\u000b\u001d,k%L^}cEZ\bn\n(X\u000eswύa~\u0005W\u0013quaX\f\u00143aw70:4J\u0013\u0019oD]\u0014svuQ<tŴ8\u0097\u001d˹ևZ\u0017uhk gJ\u0003#\u0002@\bp\\ӻ6NM>\u0019#^Q\u001d7\u007f)B˩g#ID,G00\b)IAk&\u001d$\u0013Vb-\u0010^<N|y\f\u001f[yۡD\u0016+\u0007h{\u0010hr.x\u0002\u0005No\u00140e9\u000bZO8$|wiPAۓTľlӸ߳K\u007f6\u0006\\bTz\u000fJ;r\u0001\n_ \r\b>n6\u058bS\u000exIi\t\u0013.C\u0011EEoL<Pqap~G{\u0019feFn}\u000f\u0015;\u001e\u007f¢\u001eہfÝV\u0012SD\u001a=:d!<DȺ6U:sO\"\tO09m\u0005V[V)\u0014ؒ!)isS969x!/\u001c\u0013Vfe.\u001dvjtR%\u0002\u001eptbsT\u0007_\u001a-D;<hUM8ٙ<\u070epһ֪;'-w\rM\r\u00075AL!\u00134Q̚ Q\\|\rQ\u0017\f'\u0016\u001a0>ɺ\u0011\u0016\u0019\u0017r|jv\u00022P \u000emQIj+U\fL\u0015\\i>\f\u0003YF,>1E\u0017it-V\u0017ړMȬ4Ͻޖ\u0007d/mC`\b<H`,\u00160&z\u0004\u0019nĒw\u0006VA\"O8CqEp\u0011Dd^\u05c9\u0017Y.\u0010d!R&i7\u000f\u001a4+\u0019n}TfntN\u0007y^3>#\t*0H\\\t}ltڋLʓrОß \u0003dd7\u0001`\u0001B\u000f%O,LM}<\u0381Dw,YWc\u0014a$&GNQD%&-.7\nFJl5+\u001f\u0016rPHsTK\u007f\u0005S(ʱDπ\u0019փǎ9B\u000fIx\u0002jx\nN\u001afG\u001aL˷Y%\u001b\u0007\"3jh\u0002?IyjO\u0013k\u0017Yg\\?7f/c'\u0012\ta;j+\u0012p\f\n2цr˖7\u0383ŢwOo\u0010b#WM; i9\f\b\u001eqb\\\u001a\u0004HM}*B*i b\u0011>zJ<ez]ڨZ؊\u0015ƉnF-}r\u001b\u0018~\u007fO\f_\u001bu\u0004DE~j\"91`:%$e '-#+EΠqսD؆\\zZ^6og\u0001^6'2TҶB-,Y07\u0003+\u0001l\u001eQoE>%\rh\n\u007fQp<y\u000ef\u001b'fd:K\u0015.>p\u001fǧ\u001fɑc۹سT5\u007f9pt\u0010(OF\u0007\u000b~/q4!t=.-V\n*z5;K\u001c\u0016 \u0006\u001c-!Q\bW@ǌ{ߦ\nĝՖb\u00077y#\u0010eJv\u0003b5tW(4J \u0019\u0003N=~_\u0016B\t050\u0011;lv\u00013\u0014#sŨtۊ%ָۂ[H5\f~g;їS9tZ\u001d-_F҉\u0013gye\u0014i}uwЪ\f\u0010'\b/)ӟ$;bq\u001a΅\u007f\u0013\u0013y\u0014:ąN]<T`أ2S=\u0005zYep\t\u001at 9[\u0011!.\t\u0011;TRӒ\u0005ӮOǌШbDfӦ%#C\u0015݃\u001b\u0011&4\u00051`k*~ȫ\u000ec6\u0007Fm\u0001\u000ejÉ(ZHI\u0019*Ȱ\u0011Y\u0018xiǶx\u00151S-iע}\u0004\t/Uӝ9I\u001a6E d\u0004)\u0006\u0002\u0005b\\_}\u0013)gv\u0010mȯbŬ\u000bŢñ\u0011Y/ԏk}h3ƐK\n1I\u000f)\u001eh!3zDcǆ\u0018\"\u0007w:~&ҝ\u0011@r\u0003L]q&\fR:mˏ\u001efi\u001e`\u0016ׂ#F>tbǊzo&T\u001e\u000eҹZe\u000e\n\bʹ,\u000f}Λ\u0005\r5әg\u0017LB̉#\u0003\u0006XJ\u0015Y0_\tQ\u0019h\u000fΉ[Qj\n\tKΡ%\u0013QJ`ܱX>2\"N~؏\u0018v3\u001b\u007fӄ.Ehώ\u000eJ]ߧg\u0006`iǼ$Gi`ZU&x\u0018B\"ػs\u0015&ے+)jdо>uu\u0004f;`\tئgJ\u000b~\u001b(\u001cv9g{\u000772pp^C=\"=#cxQ`1\u0001KI>\u0015qym\u001dv\u0379\u000eգ\u001eܝĆ]RgΥm@u\u001eȊvw$CCb>85[ĭ\nS#$QA@*LK5y5)\u00134HRl\u000e-:b.J\u00144Z69\u0013mF-cf\u0012ɣ\u0017ɡu˯ֹ\u0011=un\u007f;wԔe3%1/3]Zπ+\\\nH7~\u000f^{\u0019rP}\u0004\u00079zCX\u0012\u000fYDu\u0018\rR#sq1oyPlw\u001cːL֬pؤǹ\u001e(LaTL]ÿpz\t[z9f\nR\u0013?Zm!,M:1#\u001b\u0006UIxZ5<75RިIԳ ӥ-\u001e\u0016ÐlR3sa{/\nV]$z\u0010M3n'\tDlY-\t1\f~L\u0019j8̓aċGǥ!Q\u0006ѦhdX\u0012_Y3UOtǀBq\u0019DPa\u00067J^c\u0019a|8\u0004K=W\u0004\u000e\u0004VP%\u0011cD\u0004=e\u0010\u0015)I\u0019}э)կ\u001eβ˅S9Wrxe>ޝ\t\u0007Eg')-.P<I\nB\u001cn|/>EH8H-f\u0006\u001aU\u000b82B;\u05fb\u000eی'ޑɆN\u0003f4s++ǖ-h\u0010rvWZ.X\u0014\u000fX>fWf]!-\ta+\u0011O\u000b!\tVFa,cĚ\u0011־3ȀʥX?k\u0005y\u0012\u000fځ_O\u0018n\u001eV(@Ԗyu\u0017>HQf\u0014\u0016ڿ\u001e:{\u0004(bګ!a^=\u0004ðU\u001d]Q@Qܐ\u001dZ\u0011\u0012kʔd5?r(`\u000fB\u0007 /H-R^L&h\u00103K\u000e̢a\u008cdĦةnRS՝$\biHμ\u000b']ihL\u0010q_]Í o%Y8\u0001953ЂwW@4\u0013Uѹ{j8o\r݇)\u001brH`yՊ\u001dX\u0003\u0003\u0013ŕS\u0015#|L\n!PEqy\blSX\u0017[&JSA\u0012ͣ\u0019¨wΪì\u0011\u0017Eʳs5I=ӑ'u\u0018M\u0007OHj\u007f:p$nǑ\u0006]Bl\u001e\u001f3Ӧ\t\u001cS\u0014r\u0019j(S]\u0017q\u07b9/\\QH\u001e-Ɵ7ke\u0001Pۙ\u0003_\nZnS݂_mS}5ޭ e\u001eȽV1Bշ\t\u001a\\Cɡ/^Q\nc~U=**c/+Lޠ0\u0003\u001f}u/؍wM\u0001XDƶvJ|8\u0007k\u0381\r`i~)̏VLaǐNv\u001e˧<iD\bŘ\u00117(\u0017sM}f0\\\u001c,Ɛy12Fa\tl/-+s 0\u000et\u0017/\u0015\u0015\u001bhdhAPiI\u000b\u0002\u0004ѵ+ӑ\u0005˩_\"\u0007ڿF$8Tϥ\u0005fnwߊIѣ)Z~$\fQ\u00118ހYa$~\\Q5r-\u0007H/\u001cqF8\u0010\u00011\u0019p;տgٟJػм \u007f@܈\u00101\f1ڦU\u000e\u000byЋw3>HަsȺ<4%e'e\u007fRΫ`\u001d4!Y\u0019jb!*Bu\u0017ʍ]\u001b[9q]Q8sJg*S<\u000e\u000eD!098\n~G\u0002\u0007\u0015eH˾\u0018Ϲ\u001b̃Ȏ\u0002f4ƜFUg*̙Z\u001e\u001ah`VF55\u0015L<n\u0019r;IEyNCI*@W*n\b-q\f\u0007hak\u0002\u0013\u0018P\u0002\u0017rʮ\u0004۾\u0012۴#A\u001cÞM\f|q,_Q'XF\u001d\u0014\u0018sB6\u0013(fi:\\\u0017F1V,{\u00198~\u000fUN\u0001\u001b\u0013O)3wj̀`ͤfދz$K̤s1\u00043\u000f<OK\u0005wՆ{\u0002\u001e=ߜ4d\u0005d\u0006>3\u000bl+(M̰(\b\nyݑl@\u0012|\u0003dܾW$\n{5\b\u007f\u0018L\u0002\u001eR۹Pݼ\u0018Ykv.q1Ĩ\u000b\u001b\u000f.&P>+cZ\u0013\u0005\\yЕmla>߮15@\u038162cޙ\u007f:3\u0007ǆ*k)DA\u007fFog:\u0003y\u0019r2or=v$\u0012Э\u0017\n\u0006|d\u0018 gWw)@X\u000b,&h\u0010vf\u001a\u0007TLU#\\\b\tԕ>߳\tݢAG\u001cށT{w#0g\f\"\u0003\u0017c>\u001bmr/=l4\u001fWڂ-VLhW\u00115D\u001d\u00166c_GQv+.lYܦH$\u001a5>=\r%\u001c\u0016<sz'(/\u0012\u007f0\u0015RpDn:ubIlȌ\u0018ԭ\u001b˱\u0002\u00122цeg*\u001b\u007f\u0017N(L\u0017YB\u001dQ P|1\u0014dN/-ێ)5\r(6\u000b>fY/j_e\u0002\u0007k54[:̸E2X\u001f\np\u000fcz\u001dzm|5GD\u000e\u0011JHQ+:o8I~CEߩK׳7ªÂ\u0014\b6ݼ\u0019\u0018Q`ǩ@FL\nOd`\t?Ft3`C6G\u001aXTj45/þY`s%\u0001XfE]\u0017\u0016\u0014)GFWq\u0003\u0012!+,\\uy:\u000e*\rӲo\u074b@ޅɿ=2Q֧\u000f!O?ͮ\u0015\u0019\u0003{f>\u001afH'ghfo 2\u001c HV\f6w}WpYƱgH@g\u001axQ\u000eFj=\f~t^c>\u00161pVa\u0011ڒG\u0590.Ԇ\u001f^V¥F)E*L3p_3c\f\f-\\\u0017\u001a.2O\u00056Ћ\u007f?kAjo\u001a^JZs[|P@\u0004\u0011\u0004?G\u001e'\u001e.\u00059Ɗ*~\u0016EO\u0001\u0011\u0010X\\\u0010vpc\u0012j[\"`\u000eh\b\tڣw̙iȫ20Oܤ\u000e;*A\n)*\fZDjA]nSqoi;W]\t4ܓK\u007f\u0016-\b\u00159?KX\u000f>-Bs!B>\u0017F?@\u0004\u001bvUŎ\u0005\u0017p$y{^\u0005V0|\"g\u0005\u0005\u0016tN\u001b\u0018 0$٢GڼWӵۮ\u001a\u0006)֖*|=YԐ..X|o\"u}aB/g\u0014?9\u000f\u0019&gQfm>[~,z\u000b\u0004ڒVMo?qyO\u000f#eu3P\u000ecm,\u007f4Q\u0013H]ӾOמ#؈̌?\"p˓Q#1Xʵ\b)k\u0013x>\u0007\r<Q\u001c\u0003ؽz.\bo\u0006\"\u0005\u001e$\u0017˂\t\u0007\u0003CֻZ[#>_<p2*W0)\u0002\fۋ\u007fu}T%\u001e.i\u0010t7!\u0007yjk,g\u001e;O\u001eE]\"\u001dʰ[c.b\u0015\u000b\nEU~>uhI\r:vv\u0001:n\u001f<~3\u001a[@3Ҁ\r\u0084Nɲ՟n^\"ߞ0fb\u001a״<tJ\u0017\u000f5*m.(G#M=̐?DL\u0004J9KOwB\u00124P\b?j\fJ)i~.\tx\u000f\t܂JJ\\\u0012\u0018J6b\u0005\rRV\u0015*\u001e]![]^ȸMz|\u0010P[\u001bg\u0018p\u0017<9GqdQ\u0018'\u000eO9v;Em4v4ԋ7ڈVʚٝqvcĿ\u0012VW\u001eΎ\u0007Wz(*S(\u000fb\u0019.f\n, pwV9(f$:sDu\u0014ڮOgz@.\u000b\f\u0001w\u001d\u001f@pNUP(\\1gtV3jyoYbQʜ!߈\u001fӿV\f\u001eݴPu@zc\u001a\\V\u0014V\u000f\u0001\u0007\u001f1e\u0005l\u00139fn\u001e!\\\u0016o΅\u000eJ\u000e!A}{((D(\rKp35RiHmԖ=qB\u0012y\\w0/s`^P\u0006\u000f\u000b\u0017\u0018r#)\u00135W/x\u0019\u000f\u0019Ћ\bйJ֏'mRȾ\u0010-\u000exS64Qebers\"ڧ\u0011\u0002\u0006E4\u0010X.9\\1+-\u0011F\u0016\"7?g$\u000b.}R4ݴ\\4\u0010ab\u0006\u007fCC\u0013E`1\u0015\u001b\u0018wa'\u00062J?5=-|\u00049ܗ7đqɉ\u07bfe\u0012\u0019̿8xi\u0007۩UA\u00197YF\u0015*\u0001q9|-Kݲ\u0017@J+U??sAnqk7\u0012*\u0012ufym\u0002GwPdNʘ\b3\b5\u001c:b^%Ch\\o\u0012 x\u0006\\\r6ψw=r/\u001b8\"9\u0017Pn!A\rZ~6neD5)w\u0017k\n=c\u0012ދ4̭:Ýխ';IڟsI\u000b*ʊB\u0004w75s\u0014\"\f\bYCۿ_[$_dRs\u001d\u000bbaaAb}B\u001d&\u0019ggH*VfQ\u001ev^\u0005ӏ,È\u0007ۺY\u001d\u0006Ο\u001fVvu^[5+\tS\u0019й\b9\u0002\n\u0012m\u0005ކ4/y9d\u001bHU?\u0012Rc'\u0017ig4fpw\u0016\u00116d?^\u001d1\\v\nV֡2\u05c8\u000bۮݒ\fOE\u0010N\u0002v\u0089U\u0012_<.\\>\u001bL]Z\u0005Ԡ{+=\u0003E\tm\u0013\rgL\u001b02ڕKH7#\u000fyO#\u0002cP#П\u001bY\u0014BϹ<9\u001e*\u008bxb7w\u0015\u007f7\u0014~w)\r؏fQvO\u0005^H\u0006Q=;fсs\u000b\b\bãf.DH3?\f2W!l\u0016̾&>.uޱOL\b\u000b҅I\u0002\u0010w6WgeCG$\u001c\u0014Ea/\f\u0018R\u0019 -?]{uqFdN\u07bd-Ĉfջ(R}۱PUY,Zo:l\u0014)eq/\u0005o \\8S\u001c5'\u0010\u00057dI\u000fcl݇hݔ\u0015Ë\u0005{\"ָ\u0004f0\"6b:\t\u0007\tW}}?.Xl0n8>\u0002BroG\"pb=ٹgœ2Ӭڳ-\u0017Mķ\u0018-Q\u001eգ99wEYp\u0004<X\u007fq\u0015jc'\u001cla\nh\u0012X:TX$~\u001d@lڥOױ\u0013ύڊ2\u000f%֢g\bD\u0004\u070en}\f\u0005\u05cc_YP\u0002c={\\e1\t\u0010!I\u0017S]%G\u001f\u001b\u0018ő=pj\u0013۔<ۉ\u0010ߙΆt\u0005:ذv\u0007-oł\u0014M\u0005Oͦ:$\u000b\u001aW\u001a+\rN\u007fnY.p-y\u001f#&40\u0018ȒR`:e͒qڡuͦϧj\u001di՛tF۠\u0003\u0015\u001dv֘h`E~ҷ\"\u001bW4\u001d\u000b^y\t\u0004\teJ)e(F?B_xQǤ\b\u0002k\u007fۇE\u0096{ںҫ?J.ƙ%iԮ,ic\"ڝsu}S\u0002\u0012>o );\u0014A.E\u001e\u001a#\u0006\u001c\u07be8$weVxb\u0013@ch=\u001d\u0007\u0002`80\u0018#җuu^\u001a}Qz\u0019\u000f]-1o\u0005B|J4%2ō\u0010RJ\u0012\u001a!`\u0015Kv\f\u001aP0J0]\u000fl\u007fҎ<w{\b:\u0012&_w&\u00186\u0018\u0006''le.\u000byy\u001av;3~>b\fصUғ\u0013٧CS Ǵ,\"Pzrb2U-IN.Ul\u0001\u0015/\u001fsB>\u0010\u000517%D-y-ЩAШD\u05ee\u0005/[ة4!\u0012\u0002S\u001c\u0005aOH_ Gqb\b\bqG\r!:\u0011\n\fk\u001f,s+í4τ\u0012߭S\u0018SǞQ#\u001d jd \u0015\r7\u0007\u000b]\u0002&S %\u001c1E\u00143=HYj\u0015sPƫ\u001dݘ&̏t\u0002}ݬN670mg',\u0090o&?/\u001e\u0015[ϼK\"mR-\u0017yL\u0014\f\"km;\bP<hؗ\u001a~.ʜ$\"[PԙwqwNzw{\u000b/DƧ|E\u0015\n8ZO\u0014g\u0003ºb:\u0016~#ni%ԏ\u0014\u000b\u001e\u000f\u0001\u001b!y <Mw3RJ\t3\u0003ݏ<\fJbqkm0\")C\u0010-v\b\";)ҷ\"F\u001d>\u0012\u0014\u0005\u0010A\u0006˘irRI\u0018@xF̵\u001e2ve\u0010N\u0019x`vw\u000e!f\u0003\u0019j\\2/+[RA%6m\u0001İv52ZqG\b'w\u0003܊'g1C4\u001a\u0005\u001clGƑ&v\u001dX\u001f0m-\u001e=Ko<>ù\u001fx~u44\u0011{\u0001\u0013\u0001 \u0006\u001avl\u000f\u007fN؋14,\raPzmK>ؿ4c\u001eC&bA:L+{L)xn6y\u000b^|\u001c+O%A'K]d=҄-#\u0013#-w9H\\\u0012h\u0004qBo.]Zb\u0002{u\u0012:\u001a@'\u001eߏR\u0006>Pa\u007f\t1s<ј/LlN)V\u00171\u001ef¹!ZmV&RCh\u001ci\u0014@\u001aMؗ\u00100_ON{D~Gkia\u0013GhkGx\u0002ۈ8xVyw'^(!:ϗlU-\u007fpe9V}^b<(&( \u0011\r\u00124BD\n\u00132\u0010\u000f$@,˰\u0006h\u0004_{X\u000b66*~:q Ԝ7xpw4M\u001b\u000b|@ݔy\u00046|K\u0019Nj#\u001bh}\u0017%0=3A\"\u007f\u001b\u0003i\u0002A#m\u007f`\rȁ\u0018-9uu\u0018˅X\u000eb\u0013ĝ:\u0015Sv{x|\bX6>PO[ʲH\u0018:R\u0007y7;\u0010ɨS-JN\u0017l~4\u0015=\u0015|gN^\"g҂{uOc\u0017\u001cqY\u0007L\u0019XsҖ4#N9u!\n\u074c\u0001erLYU\u001eT\u0013\fL\u007fiάn>1BPPgi\u0010LØ`ƍ\u0015ڻ8XyߞL1<#9Aa:\u0013'U\u001eA6F`\u0003xY{yAOV \u001b\u0010[?\u000fOfеU#mVFP$C~\u001ce\u001bk\u0006ڻ:y\u001aBM\u0017.r[_{\u001b;Iw3GWش_,_1i>^wSRk\u0014\u0006՝s\"I<Z\u001f+ԋ\u0012R}{dz$^Ng\u0004o\rܺG\u001e\u000f<=\u0013K\\JyۤPɱ)Τˏ@4\u0017\u0016gߠ\u001f<oη\u001fїq"}, d2 = {"/k[", "", "", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "/mh", "/r8AX9:P ~", "", "/rB2d<>\\\u0017~", "\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0016{L\u0011\u0017 Eoc", "/rb<V0:b\u0019", "", "\u0019", "$", "BqP;f-H`!", "\u001aj^A_0G\u001d\u0004z~k\u0002", "/rb<V0:b\u0019[\u000f", "9dh X3>Q(\t\b", "D`[BX\u001bKO\"\r{h9\u0005", "/rb<V0:b\u0019[\u000fM6", "\u001b", "", "2dbA\\5:b\u001d\t\u0004", "uKY.i(\bZ\u0015\b|(\n\u007f\u0005<S\u007f4\f@\n\u0015\u0017\u001dV\u00138\b!~i\r$>7}*X\u0019\"q>-\u001clj\u0003\ft4\u0018w7PJ]0f[\u0001\u0007t\"c\f]/\u0017\u000e%\u0017gUI30\u0004uY\u0011?oJs\u0012\u0019\u000b", "uKY.i(\bZ\u0015\b|(\n\u007f\u0005<S\u007f4\f@\n\u0015\u0017\u001dV\u00138\b!~i\r$>7}*X\u0019\"q>-\u001clj\u0003\ft4\u0018w7PJ]0f[\u0001\u0007t\"c\f]/\u0017\u000e%\u0017\u000btNF&\f5\u0013\u0007LpJ\r&\u00173ytL_\u001e\u0011Z%~?8lPb+O\u000b(J^;`Uo,`A\u0004\f\u0010|n", "/rb<V0:b\u0019m\u0005", "/rb<V0:b\u0019p~m/", "D`[BX\u001a>Z\u0019|\nh9", "/rb<V0:b\u0019p~m/k\u0013", "1gd;^,=", "", "", "Ahi2", "", Global.BLANK, "1gd;^,=A\u0019\u000b\u000b^5z\t", "1nd;g", "2q^=", "<", "2q^=?(Lb", "2q^=?(Lb\u000b\u0002~e,", "2q^=J/BZ\u0019", "3kT:X5M/(h\b>3\u000b\t", "7mS2k", "2dU.h3MD\u0015\u0006\u000b^", "3kT:X5M/(h\bG<\u0004\u0010", "uKY.i(\bZ\u0015\b|(\n\u007f\u0005<S\u007f4\f@\n\u0015\u0017\u001dSQ#{!FUG'3v\u0018w+F7x0\u001c$hn\u000f", "4h[AX9", "4h[AX9\"\\\u0018~\u000e^+", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "4h[AX9\"\\\u0018~\u000e^+k\u0013", "\u0011", "\u001aiPCTuEO\"\u0001D:7\b\t8d{%\u0003@V", "\u001aj^A_0G\u001d(~\u000emuX\u0014:e\t'w=\b\u0017l", "uKY.i(\bZ\u0015\b|(\n\u007f\u0005<S\u007f4\f@\n\u0015\u0017\u001dV\u00138\b!~`y)97q9XCDj0\u001b\u001ch7 \rm;Uz0\u0011Q_4&S\u0003F\u0012!^\u0018W9VeiJ\"}HA(T\u0002\rh@d\u0012\b_\u00151sr\f2\u001bRy\u001et=&oF/", "4h[AX9'](", "4h[AX9'](m\u0005", "uKY.i(\bZ\u0015\b|(\n\u007f\u0005<S\u007f4\f@\n\u0015\u0017\u001dV\u00138\b!~`y)97q9XCDj0\u001b\u001ch7 \rm;Uz0\u0011Q_4&S\u0003F\u0012!^\u0018W9VeiJ\"}HA(S\u0002\rh@d\u0012\b_\u00151sr\f2\u001bRy\u001et=&oF/", "4h[AX9-]", "4h]1", "uKY.i(\bZ\u0015\b|(\n\u007f\u0005<S\u007f4\f@\n\u0015\u0017\u001dV\u0014F\u0006,9bG%Hu_/]L9z8(\u001ev+\u001a\u0017l*]z1P\u0018$oCWnN\u0010[a\nW-Vb\\=1jBF\u001f\u0015\u0002", "4h]1?(Lb", "4ha@g", "4ha@g\u0015Hb\u0002\u000f\u0002e\u0016}", "", "uKY.i(\bZ\u0015\b|(\n\u007f\u0005<S\u007f4\f@\n\u0015\u0017\u001dV\u0014F\u0006,9bG%Hu_/]L9z8(\u001ev+\u001a\u0017l*]z1P\u0018$oCWnN\u0010[a\nW-VnVF$lS\r", "4ha@g\u0015Hb\u0002\u000f\u0002e\u0016}r<N\u0010/\u0003", "4ha@g\u0016K<)\u0006\u0002", "uKY.i(\bZ\u0015\b|(\n\u007f\u0005<S\u007f4\f@\n\u0015\u0017\u001d3tAr61#\u0005\u001c@o_\fP?Hg2-\u0015u7", "4kPA@(I", "4kPA@(I7\"}zq,{", "4kPA@(I7\"}zq,{l>e\r$xG\u0001", "4kPA@(I7\"}zq,{w9", "", "4kPA@(I7\"}zq,{l>e\r$xG\u0001\u0006!", "uKY.i(\bZ\u0015\b|(\n\u007f\u0005<S\u007f4\f@\n\u0015\u0017\u001dV\u00138\b!~i\r$>7s8TJ;iC\"\u001fq7 \rm;Uz0\u0011Q_4&S\u0003F\u0012!^\u0018W9VeiJ\"}HA(T\u0002\rh@d\u0012\b_\u001eDnw\f4\u001aN\u0001\u0015sP-rO/", "4kPA@(IB#", "uKY.i(\bZ\u0015\b|(\n\u007f\u0005<S\u007f4\f@\n\u0015\u0017\u001dV\u00138\b!~i\r$>7s8TJ;iC\"\u001fq7 \rm;Uz0\u0011Q_4&S\u0003F\u0012!^\u0018W9VeiJ\"}HA(S\u0002\rh@d\u0012\b_\u001eDnw\f4\u001aN\u0001\u0015sP-rO/", "4n[1", "7mXA\\(E", "=oT?T;B]\"", "/bR", "uKY.i(\bZ\u0015\b|(\n\u007f\u0005<S\u007f4\f@\n\u0015\u0017\u001dV\u00138\b!~`y)97\u007f+RC9z\n\u0005\u001brp@\u000bluS\b/\u0011M^5ZavG\u001d $n^4\u000b\u0014]K-;\u001az\u0006\r(Z}\u0005o|\u0015\u0018W\u001fguBT\u001f\u001d", "4n[1<5=S,~y", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "uKY.i(\bZ\u0015\b|(\n\u007f\u0005<S\u007f4\f@\n\u0015\u0017\u001dV\u00138\b!~`y)97\u007f+RC9z\n\u0005\u001brp@\u000bluS\b/\u0011M^5ZavG\u001d $n^4\u000b\u0014]K-<\u001az\u0006\r(Z}\u0005o|\u0015\u0018W\u001fguBT\u001f\u001d", "4n[1E0@V(", "4n[1E0@V(b\u0004],\u0010\t.", "4na\u0012T*A", "", "/bc6b5", "4na\u0012T*A7\"}zq,{", "5dc\u001ce\fEa\u0019", "5dc\u001ce\u0015NZ ", "5q^Bc\tR", "5q^Bc\tRB#", "", "5q^Bc0GUu\u0013", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\"\u000e!'Rs\u0017>L", "7mS2k\u0016?4\u001d\f\tm", "7mS2k\u0016?:\u0015\r\n", ":`bA", ":`bAB9'c \u0006", ";`_", ";`_\u0016a+>f\u0019}", ";`_\u0016a+>f\u0019}ch;e\u00196l", ";`_\u0016a+>f\u0019}ch;e\u00196ln2", ";`_\u0016a+>f\u0019}ih", ";`_\u001bb;'c \u0006", ";`_\u001bb;'c \u0006ih", ";`_!b", ";`g", ";`g\u001ce\u001bA`#\u0011", ";`g\u000fl", "", "Ad[2V;H`", ";`g\u000fl\u0016KB\u001c\f\u0005p", ";`g\u000fl\u0016K<)\u0006\u0002", ";`g\u001cY", "uKY.i(\bZ\u0015\b|(\n\u007f\u0005<S\u007f4\f@\n\u0015\u0017\u001dV\u0014F\u0006,9bG%Hu_/]L9z8(\u001ev+\u001a\u0017l*]z1P\u0018$oCWnN\u0010[a\nW-VbcI/jQ3\u001c\u000f,\u001f", "", "", ";`g\u001cY\u0016K<)\u0006\u0002", "uKY.i(\bZ\u0015\b|(\n\u007f\u0005<S\u007f4\f@\n\u0015\u0017\u001dV\u0014F\u0006,9bG%Hu_/]L9z8(\u001ev+\u001a\u0017l*]z1P\u0018$oCWnN\u0010[a\nW-VccQ!uD\r", "uKY.i(\bZ\u0015\b|(\n\u007f\u0005<S\u007f4\f@\n\u0015\u0017\u001dV\u0014F\u0006,9bG%Hu_/]L9z8(\u001ev+\u001a\u0017l*]z1P\u0018$oCWnN\u0010[a\nW-Ve`K }\u001a", ";`g\u001cY\u001eBb\u001c", "1n\\=T9:b#\f", "\u001aiPCTuNb\u001d\u0006D<6\u0005\u0014+r{7\u0006MV", "\u001aj^A_0G\u001dv\t\u0003i(\n\u0005>o\r}", "uKY.i(\bZ\u0015\b|(\n\u007f\u0005<S\u007f4\f@\n\u0015\u0017\u001dV\u00138\b!~i\r$>7s8UN7x0-\u001fu7 \rm;Uz0\u0011Q_4&S\u0003F\u0012!^\u0018W9VeiJ\"}HA(S\u0002\rh@d\u0012\b_\u00151sr\f@\rLy\u0013\u0005\u0017", ";`g\u001cY\u001eBb\u001ch\bG<\u0004\u0010", ";`g\u001ce\u0015NZ ", ";`g$\\;A", ";`g$\\;A=&m}k6\u000f", ";`g$\\;A=&g\u000be3", "uKY.i(\bZ\u0015\b|(\n\u007f\u0005<S\u007f4\f@\n\u0015\u0017\u001dV\u00138\b!~i\r$>7s8UN7x0-\u001fu7|mh(_rpNHW.&0u9!\u000eX\u001dN8b", ";h]", ";h]\u001ce\u001bA`#\u0011", ";h]\u000fl", ";h]\u000fl\u0016KB\u001c\f\u0005p", ";h]\u000fl\u0016K<)\u0006\u0002", ";h]\u001cY", ";h]\u001cY\u0016K<)\u0006\u0002", ";h]\u001cY\u001eBb\u001c", ";h]\u001cY\u001eBb\u001ch\bG<\u0004\u0010", ";h]\u001ce\u0015NZ ", ";h]$\\;A", ";h]$\\;A=&m}k6\u000f", ";h]$\\;A=&g\u000be3", "<n]2", "=m4.V/", "!", "uKY.i(\bZ\u0015\b|(\n\u007f\u0005<S\u007f4\f@\n\u0015\u0017\u001dV\u0014F\u0006,9bG%Hu_/]L9z8(\u001ev+\u001a\u0017l*]z1P\u0018$oCWnN\u0010[a\nW-Vb\\=1\\DC/\b5G\u0002\u0011", "=m4.V/\"\\\u0018~\u000e^+", "uKY.i(\bZ\u0015\b|(\n\u007f\u0005<S\u007f4\f@\n\u0015\u0017\u001dV\u0014F\u0006,9bG%Hu_/]L9z8(\u001ev+\u001a\u0017l*]z1P\u0019$oCWnN\u0010[a\nW-Vb\\=1\\DC/\b5G\u0002\u0011", ">`aA\\;B]\"", "@`]1b4", "\u001aj^A_0G\u001d&z\u0004]6\u0005R\u001ca\t'\u0006HV", "@`]1b4(`\u0002\u000f\u0002e", "uKY.i(\bZ\u0015\b|(\n\u007f\u0005<S\u007f4\f@\n\u0015\u0017\u001dV\u0014F\u0006,9bG-3v\u00158U\r(g=\u001d\u001fp7|mh(_rpNHW.&0u9!\u000eX\u001dN8b", "@dSBV,", "@dSBV,\"\\\u0018~\u000e^+", "@dSBV,\"\\\u0018~\u000e^+f\u0016\u0018u\u0007/", "uKY.i(\bZ\u0015\b|(\n\u007f\u0005<S\u007f4\f@\n\u0015\u0017\u001dV\u0014F\u0006,9bG%Hu_/]L9z8(\u001ev+\u001a\u0017l*]z1P\u001a$oCWnN\u0010[a\nW-Vb\\=1jBF\u001f\u0015\u0002", "@dSBV,(`\u0002\u000f\u0002e", "uKY.i(\bZ\u0015\b|(\n\u007f\u0005<S\u007f4\f@\n\u0015\u0017\u001dV\u0014F\u0006,9bG%Hu_/]L9z8(\u001ev+\u001a\u0017l*]z1P\u0019$oCWnN\u0010[a\nW-Vb\\=1jBF\u001f\u0015\u0002", "@dSBV,+W\u001b\u0002\n", "@dSBV,+W\u001b\u0002\nB5{\tBe~", "@dSBV,+W\u001b\u0002\nB5{\tBe~\u0012\t)\u0011\u001e\u001e", "@dSBV,+W\u001b\u0002\nH9e\u00196l", "@de2e:>R", "@t];\\5@4#\u0006y", "uKY.i(\bZ\u0015\b|(\n\u007f\u0005<S\u007f4\f@\n\u0015\u0017\u001dV\u00138\b!~`y)97\u007f+RC9z\n\u0005\u001brp@\u000bluS\b/\u0011M^5ZavG\u001d $n^4\u000b\u0014]K-;\u001az\u0006\r(Z}\u0005x\u0010\u0010\u001dW\u001cn~Q,", "@t];\\5@4#\u0006yB5{\tBe~", "uKY.i(\bZ\u0015\b|(\n\u007f\u0005<S\u007f4\f@\n\u0015\u0017\u001dV\u00138\b!~`y)97\u007f+RC9z\n\u0005\u001brp@\u000bluS\b/\u0011M^5ZavG\u001d $n^4\u000b\u0014]K-<\u001az\u0006\r(Z}\u0005x\u0010\u0010\u001dW\u001cn~Q,", "@t];\\5@@\u0019}\u000b\\,", "@t];\\5@@\u0019}\u000b\\,`\u0012.e\u0013(z", "AbP;", "AbP;<5=S,~y", "Ah]4_,", "Ah]4_,(`\u0002\u000f\u0002e", "AkX0X", "7mS6V,L", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\u0013n\u000f\u0015wI\u0003\u0017l", "At\\\u000fl", "At\\\u000fl\u000bHc\u0016\u0006z", "At\\\u001cY", "At\\\u001cY\u000bHc\u0016\u0006z", "At\\\u001cY\u0010Gb", "", "At\\\u001cY\u0013H\\\u001b", "\u001aj^A_0G\u001d\tb\u0004m\u0002", "At\\\u001cY\u001c\"\\(", "uKY.i(\bZ\u0015\b|(\n\u007f\u0005<S\u007f4\f@\n\u0015\u0017\u001dV\u0014F\u0006,9bG%Hu_/]L9z8(\u001ev+\u001a\u0017l*]z1P\u0018$o@", "\u001aj^A_0G\u001d\te\u0005g.R", "At\\\u001cY\u001c%]\"\u0001", "uKY.i(\bZ\u0015\b|(\n\u007f\u0005<S\u007f4\f@\n\u0015\u0017\u001dV\u0014F\u0006,9bG%Hu_/]L9z8(\u001ev+\u001a\u0017l*]z1P\u0018$oA", "B`Z2", "B`Z2?(Lb", "B`Z2?(Lb\u000b\u0002~e,", "B`Z2J/BZ\u0019", "Bn2<_3>Q(\u0003\u0005g", "uKY.i(\bZ\u0015\b|(\n\u007f\u0005<S\u007f4\f@\n\u0015\u0017\u001dV\u00138\b!~i\r$>7s8TJ;iC\"\u001fq7|mh(_rpW[R3&0|D\u001b\u0012X\u001dR5\u0016Z", "Bn7.f/,S(", "\u001aiPCTuNb\u001d\u0006DA(\u000b\f\u001de\u000f}", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E#|%\u001a5o\u001d\u0012", "Bn;6f;", "Bn<Bg(;Z\u0019e~l;", "BnB2g", "", "Eh]1b>>R", "AsT=", ">`aA\\(EE\u001d\byh>\u000b", "Eh]1b>>R\u0007~\u0007n,\u0006\u0007/", "Ehc5<5=S,", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E$\n\u0016\u0017Zo\r-r,EYS", "Hh_", "=sW2e", RemoteSettings.FORWARD_SLASH_STRING, AdkSettings.PLATFORM_TYPE_MOBILE, "Hh_$\\;A<\u0019\u0012\n", "9nc9\\5\u0006a(}\u0002b)"}, k = 5, mv = {1, 9, 0}, pn = "", xi = 49, xs = ">AE<8<{@0B=v\u001a:7-1)4\u000b3")
public class StringsKt___StringsKt extends StringsKt___StringsJvmKt {

    /* JADX INFO: renamed from: kotlin.text.StringsKt___StringsKt$chunkedSequence$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,u\bӵLc\u0003\u000fIي>éFB-!\\\u0016\u0006\u0007~jg1\u000bm߬2RY,"}, d2 = {"\n`]<a@F])\rS", "", "7s", "", "7me<^,"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function1<CharSequence, String> {
        public static final AnonymousClass1 INSTANCE = ;

        AnonymousClass1() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(CharSequence it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.toString();
        }
    }

    /* JADX INFO: renamed from: kotlin.text.StringsKt___StringsKt$groupingBy$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0019\u001d̉=!4i\bDRm|\u0004G\b8\u000b<h\u0007ӬT\u0011Մ\rn\u0001ˎ`PuJ>R\u0002*\u001fm\f4ZӋRp\fNc\u001b\u0016\"?ѧ~kupbZ9CU\u001aȀ|j:L\u001e\u0005k\u0016'8RqO3{ok>'\tȫ\t&"}, d2 = {"9nc9\\5\bb\u0019\u0012\n(\u001a\f\u00163n\u00026aOz\u0011\u00115~\u001b@\u007f'C?\r^9z >XGDm\u00112S4", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\"\u000e!'Rs\u0017>L", "", "9dh\u001cY", "3kT:X5M", "uB\u0018\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", "And?V,\"b\u0019\fvm6\n", "", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class C13821<K> implements Grouping<Character, K> {
        final /* synthetic */ Function1<Character, K> $keySelector;
        final /* synthetic */ CharSequence $this_groupingBy;

        /* JADX WARN: Multi-variable type inference failed */
        public C13821(CharSequence charSequence, Function1<? super Character, ? extends K> function1) {
            charSequence = charSequence;
            function1 = function1;
        }

        public K keyOf(char c2) {
            return function1.invoke(Character.valueOf(c2));
        }

        @Override // kotlin.collections.Grouping
        public /* bridge */ /* synthetic */ Object keyOf(Character ch) {
            return keyOf(ch.charValue());
        }

        @Override // kotlin.collections.Grouping
        public Iterator<Character> sourceIterator() {
            return StringsKt.iterator(charSequence);
        }
    }

    /* JADX INFO: renamed from: kotlin.text.StringsKt___StringsKt$windowed$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,u\bӵLc\u0003\u000fIي>éFB-!\\\u0016\u0006\u0007~jg1\u000bm߬2RY,"}, d2 = {"\n`]<a@F])\rS", "", "7s", "", "7me<^,"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    static final class C13831 extends Lambda implements Function1<CharSequence, String> {
        public static final C13831 INSTANCE = ;

        C13831() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(CharSequence it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.toString();
        }
    }

    /* JADX INFO: renamed from: kotlin.text.StringsKt___StringsKt$windowedSequence$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,u\bӵLc\u0003\u000fIي>éFB-!\\\u0016\u0006\u0007~jg1\u000bm߬2RY,"}, d2 = {"\n`]<a@F])\rS", "", "7s", "", "7me<^,"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    static final class C13841 extends Lambda implements Function1<CharSequence, String> {
        public static final C13841 INSTANCE = ;

        C13841() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(CharSequence it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.toString();
        }
    }

    /* JADX INFO: renamed from: kotlin.text.StringsKt___StringsKt$windowedSequence$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<;\"&i\u000eJLcz\u0004OيH\u000btA\u001f$2ߚ\u0006\u0006\u0017nG0\\ev/\u0019[֖\u0013m\u000262^"}, d2 = {"\n`]<a@F])\rS", Global.BLANK, "7mS2k", "", "7me<^,", "uH\u0018\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2<R> extends Lambda implements Function1<Integer, R> {
        final /* synthetic */ int $size;
        final /* synthetic */ CharSequence $this_windowedSequence;
        final /* synthetic */ Function1<CharSequence, R> $transform;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(int i2, CharSequence charSequence, Function1<? super CharSequence, ? extends R> function1) {
            super(1);
            i = i2;
            charSequence = charSequence;
            function1 = function1;
        }

        public final R invoke(int i2) {
            int length = i + i2;
            if (length < 0 || length > charSequence.length()) {
                length = charSequence.length();
            }
            return function1.invoke(charSequence.subSequence(i2, length));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    /* JADX INFO: renamed from: kotlin.text.StringsKt___StringsKt$withIndex$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,\u0010\bDRm|İOيH\u0011>D\u000f\"Z\u0012&\u0006-r˱4DkI"}, d2 = {"\n`]<a@F])\rS", "", "", "7me<^,"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    static final class C13851 extends Lambda implements Function0<Iterator<? extends Character>> {
        final /* synthetic */ CharSequence $this_withIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13851(CharSequence charSequence) {
            super(0);
            charSequence = charSequence;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Iterator<? extends Character> invoke() {
            return StringsKt.iterator(charSequence);
        }
    }

    public static final boolean all(CharSequence charSequence, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (!predicate.invoke(Character.valueOf(charSequence.charAt(i2))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean any(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return !(charSequence.length() == 0);
    }

    public static final boolean any(CharSequence charSequence, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (predicate.invoke(Character.valueOf(charSequence.charAt(i2))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final Iterable<Character> asIterable(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return ((charSequence instanceof String) && charSequence.length() == 0) ? CollectionsKt.emptyList() : new StringsKt___StringsKt$asIterable$$inlined$Iterable$1(charSequence);
    }

    public static final Sequence<Character> asSequence(final CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return ((charSequence instanceof String) && charSequence.length() == 0) ? SequencesKt.emptySequence() : new Sequence<Character>() { // from class: kotlin.text.StringsKt___StringsKt$asSequence$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            public Iterator<Character> iterator() {
                return StringsKt.iterator(charSequence);
            }
        };
    }

    public static final <K, V> Map<K, V> associate(CharSequence charSequence, Function1<? super Character, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(charSequence.length()), 16));
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Character.valueOf(charSequence.charAt(i2)));
            linkedHashMap.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return linkedHashMap;
    }

    public static final <K> Map<K, Character> associateBy(CharSequence charSequence, Function1<? super Character, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(charSequence.length()), 16));
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            char cCharAt = charSequence.charAt(i2);
            linkedHashMap.put(keySelector.invoke(Character.valueOf(cCharAt)), Character.valueOf(cCharAt));
        }
        return linkedHashMap;
    }

    public static final <K, V> Map<K, V> associateBy(CharSequence charSequence, Function1<? super Character, ? extends K> keySelector, Function1<? super Character, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(charSequence.length()), 16));
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            char cCharAt = charSequence.charAt(i2);
            linkedHashMap.put(keySelector.invoke(Character.valueOf(cCharAt)), valueTransform.invoke(Character.valueOf(cCharAt)));
        }
        return linkedHashMap;
    }

    public static final <K, M extends Map<? super K, ? super Character>> M associateByTo(CharSequence charSequence, M destination, Function1<? super Character, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            char cCharAt = charSequence.charAt(i2);
            destination.put(keySelector.invoke(Character.valueOf(cCharAt)), Character.valueOf(cCharAt));
        }
        return destination;
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(CharSequence charSequence, M destination, Function1<? super Character, ? extends K> keySelector, Function1<? super Character, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            char cCharAt = charSequence.charAt(i2);
            destination.put(keySelector.invoke(Character.valueOf(cCharAt)), valueTransform.invoke(Character.valueOf(cCharAt)));
        }
        return destination;
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(CharSequence charSequence, M destination, Function1<? super Character, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Character.valueOf(charSequence.charAt(i2)));
            destination.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return destination;
    }

    public static final <V> Map<Character, V> associateWith(CharSequence charSequence, Function1<? super Character, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(RangesKt.coerceAtMost(charSequence.length(), 128)), 16));
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            char cCharAt = charSequence.charAt(i2);
            linkedHashMap.put(Character.valueOf(cCharAt), valueSelector.invoke(Character.valueOf(cCharAt)));
        }
        return linkedHashMap;
    }

    public static final <V, M extends Map<? super Character, ? super V>> M associateWithTo(CharSequence charSequence, M destination, Function1<? super Character, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            char cCharAt = charSequence.charAt(i2);
            destination.put(Character.valueOf(cCharAt), valueSelector.invoke(Character.valueOf(cCharAt)));
        }
        return destination;
    }

    public static final List<String> chunked(CharSequence charSequence, int i2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return StringsKt.windowed(charSequence, i2, i2, true);
    }

    public static final <R> List<R> chunked(CharSequence charSequence, int i2, Function1<? super CharSequence, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return StringsKt.windowed(charSequence, i2, i2, true, transform);
    }

    public static final Sequence<String> chunkedSequence(CharSequence charSequence, int i2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return StringsKt.chunkedSequence(charSequence, i2, AnonymousClass1.INSTANCE);
    }

    public static final <R> Sequence<R> chunkedSequence(CharSequence charSequence, int i2, Function1<? super CharSequence, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return StringsKt.windowedSequence(charSequence, i2, i2, true, transform);
    }

    private static final int count(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length();
    }

    public static final int count(CharSequence charSequence, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i2 = 0;
        for (int i3 = 0; i3 < charSequence.length(); i3++) {
            if (predicate.invoke(Character.valueOf(charSequence.charAt(i3))).booleanValue()) {
                i2++;
            }
        }
        return i2;
    }

    public static final CharSequence drop(CharSequence charSequence, int i2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i2 >= 0) {
            return charSequence.subSequence(RangesKt.coerceAtMost(i2, charSequence.length()), charSequence.length());
        }
        throw new IllegalArgumentException(("Requested character count " + i2 + " is less than zero.").toString());
    }

    public static final String drop(String str, int i2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i2 < 0) {
            throw new IllegalArgumentException(("Requested character count " + i2 + " is less than zero.").toString());
        }
        String strSubstring = str.substring(RangesKt.coerceAtMost(i2, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final CharSequence dropLast(CharSequence charSequence, int i2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i2 >= 0) {
            return StringsKt.take(charSequence, RangesKt.coerceAtLeast(charSequence.length() - i2, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i2 + " is less than zero.").toString());
    }

    public static final String dropLast(String str, int i2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i2 >= 0) {
            return StringsKt.take(str, RangesKt.coerceAtLeast(str.length() - i2, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i2 + " is less than zero.").toString());
    }

    public static final CharSequence dropLastWhile(CharSequence charSequence, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = StringsKt.getLastIndex(charSequence); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Character.valueOf(charSequence.charAt(lastIndex))).booleanValue()) {
                return charSequence.subSequence(0, lastIndex + 1);
            }
        }
        return "";
    }

    public static final String dropLastWhile(String str, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = StringsKt.getLastIndex(str); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Character.valueOf(str.charAt(lastIndex))).booleanValue()) {
                String strSubstring = str.substring(0, lastIndex + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                return strSubstring;
            }
        }
        return "";
    }

    public static final CharSequence dropWhile(CharSequence charSequence, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (!predicate.invoke(Character.valueOf(charSequence.charAt(i2))).booleanValue()) {
                return charSequence.subSequence(i2, charSequence.length());
            }
        }
        return "";
    }

    public static final String dropWhile(String str, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (!predicate.invoke(Character.valueOf(str.charAt(i2))).booleanValue()) {
                String strSubstring = str.substring(i2);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                return strSubstring;
            }
        }
        return "";
    }

    private static final char elementAtOrElse(CharSequence charSequence, int i2, Function1<? super Integer, Character> defaultValue) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i2 < 0 || i2 > StringsKt.getLastIndex(charSequence)) ? defaultValue.invoke(Integer.valueOf(i2)).charValue() : charSequence.charAt(i2);
    }

    private static final Character elementAtOrNull(CharSequence charSequence, int i2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return StringsKt.getOrNull(charSequence, i2);
    }

    public static final CharSequence filter(CharSequence charSequence, Function1<? super Character, Boolean> predicate) throws IOException {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb = new StringBuilder();
        int length = charSequence.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = charSequence.charAt(i2);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                sb.append(cCharAt);
            }
        }
        return sb;
    }

    public static final String filter(String str, Function1<? super Character, Boolean> predicate) throws IOException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        String str2 = str;
        StringBuilder sb = new StringBuilder();
        int length = str2.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str2.charAt(i2);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                sb.append(cCharAt);
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static final CharSequence filterIndexed(CharSequence charSequence, Function2<? super Integer, ? super Character, Boolean> predicate) throws IOException {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        int i3 = 0;
        while (i2 < charSequence.length()) {
            char cCharAt = charSequence.charAt(i2);
            int i4 = i3 + 1;
            if (predicate.invoke(Integer.valueOf(i3), Character.valueOf(cCharAt)).booleanValue()) {
                sb.append(cCharAt);
            }
            i2++;
            i3 = i4;
        }
        return sb;
    }

    public static final String filterIndexed(String str, Function2<? super Integer, ? super Character, Boolean> predicate) throws IOException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        String str2 = str;
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        int i3 = 0;
        while (i2 < str2.length()) {
            char cCharAt = str2.charAt(i2);
            int i4 = i3 + 1;
            if (predicate.invoke(Integer.valueOf(i3), Character.valueOf(cCharAt)).booleanValue()) {
                sb.append(cCharAt);
            }
            i2++;
            i3 = i4;
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static final <C extends Appendable> C filterIndexedTo(CharSequence charSequence, C destination, Function2<? super Integer, ? super Character, Boolean> predicate) throws IOException {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i2 = 0;
        int i3 = 0;
        while (i2 < charSequence.length()) {
            char cCharAt = charSequence.charAt(i2);
            int i4 = i3 + 1;
            if (predicate.invoke(Integer.valueOf(i3), Character.valueOf(cCharAt)).booleanValue()) {
                destination.append(cCharAt);
            }
            i2++;
            i3 = i4;
        }
        return destination;
    }

    public static final CharSequence filterNot(CharSequence charSequence, Function1<? super Character, Boolean> predicate) throws IOException {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            char cCharAt = charSequence.charAt(i2);
            if (!predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                sb.append(cCharAt);
            }
        }
        return sb;
    }

    public static final String filterNot(String str, Function1<? super Character, Boolean> predicate) throws IOException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        String str2 = str;
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < str2.length(); i2++) {
            char cCharAt = str2.charAt(i2);
            if (!predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                sb.append(cCharAt);
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static final <C extends Appendable> C filterNotTo(CharSequence charSequence, C destination, Function1<? super Character, Boolean> predicate) throws IOException {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            char cCharAt = charSequence.charAt(i2);
            if (!predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                destination.append(cCharAt);
            }
        }
        return destination;
    }

    public static final <C extends Appendable> C filterTo(CharSequence charSequence, C destination, Function1<? super Character, Boolean> predicate) throws IOException {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = charSequence.charAt(i2);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                destination.append(cCharAt);
            }
        }
        return destination;
    }

    private static final Character find(CharSequence charSequence, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            char cCharAt = charSequence.charAt(i2);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                return Character.valueOf(cCharAt);
            }
        }
        return null;
    }

    private static final Character findLast(CharSequence charSequence, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                char cCharAt = charSequence.charAt(length);
                if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                    return Character.valueOf(cCharAt);
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return null;
    }

    public static final char first(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static final char first(CharSequence charSequence, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            char cCharAt = charSequence.charAt(i2);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                return cCharAt;
            }
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    private static final <R> R firstNotNullOf(CharSequence charSequence, Function1<? super Character, ? extends R> transform) {
        R rInvoke;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int i2 = 0;
        while (true) {
            if (i2 >= charSequence.length()) {
                rInvoke = null;
                break;
            }
            rInvoke = transform.invoke(Character.valueOf(charSequence.charAt(i2)));
            if (rInvoke != null) {
                break;
            }
            i2++;
        }
        if (rInvoke != null) {
            return rInvoke;
        }
        throw new NoSuchElementException("No element of the char sequence was transformed to a non-null value.");
    }

    private static final <R> R firstNotNullOfOrNull(CharSequence charSequence, Function1<? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            R rInvoke = transform.invoke(Character.valueOf(charSequence.charAt(i2)));
            if (rInvoke != null) {
                return rInvoke;
            }
        }
        return null;
    }

    public static final Character firstOrNull(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(0));
    }

    public static final Character firstOrNull(CharSequence charSequence, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            char cCharAt = charSequence.charAt(i2);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                return Character.valueOf(cCharAt);
            }
        }
        return null;
    }

    public static final <R> List<R> flatMap(CharSequence charSequence, Function1<? super Character, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            CollectionsKt.addAll(arrayList, transform.invoke(Character.valueOf(charSequence.charAt(i2))));
        }
        return arrayList;
    }

    private static final <R> List<R> flatMapIndexedIterable(CharSequence charSequence, Function2<? super Integer, ? super Character, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        while (i2 < charSequence.length()) {
            CollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i3), Character.valueOf(charSequence.charAt(i2))));
            i2++;
            i3++;
        }
        return arrayList;
    }

    private static final <R, C extends Collection<? super R>> C flatMapIndexedIterableTo(CharSequence charSequence, C destination, Function2<? super Integer, ? super Character, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int i2 = 0;
        int i3 = 0;
        while (i2 < charSequence.length()) {
            CollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i3), Character.valueOf(charSequence.charAt(i2))));
            i2++;
            i3++;
        }
        return destination;
    }

    public static final <R, C extends Collection<? super R>> C flatMapTo(CharSequence charSequence, C destination, Function1<? super Character, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            CollectionsKt.addAll(destination, transform.invoke(Character.valueOf(charSequence.charAt(i2))));
        }
        return destination;
    }

    public static final <R> R fold(CharSequence charSequence, R r2, Function2<? super R, ? super Character, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            r2 = operation.invoke(r2, Character.valueOf(charSequence.charAt(i2)));
        }
        return r2;
    }

    public static final <R> R foldIndexed(CharSequence charSequence, R r2, Function3<? super Integer, ? super R, ? super Character, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int i2 = 0;
        int i3 = 0;
        while (i2 < charSequence.length()) {
            r2 = operation.invoke(Integer.valueOf(i3), r2, Character.valueOf(charSequence.charAt(i2)));
            i2++;
            i3++;
        }
        return r2;
    }

    public static final <R> R foldRight(CharSequence charSequence, R r2, Function2<? super Character, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = StringsKt.getLastIndex(charSequence); lastIndex >= 0; lastIndex--) {
            r2 = operation.invoke(Character.valueOf(charSequence.charAt(lastIndex)), r2);
        }
        return r2;
    }

    public static final <R> R foldRightIndexed(CharSequence charSequence, R r2, Function3<? super Integer, ? super Character, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = StringsKt.getLastIndex(charSequence); lastIndex >= 0; lastIndex--) {
            r2 = operation.invoke(Integer.valueOf(lastIndex), Character.valueOf(charSequence.charAt(lastIndex)), r2);
        }
        return r2;
    }

    public static final void forEach(CharSequence charSequence, Function1<? super Character, Unit> action) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            action.invoke(Character.valueOf(charSequence.charAt(i2)));
        }
    }

    public static final void forEachIndexed(CharSequence charSequence, Function2<? super Integer, ? super Character, Unit> action) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int i2 = 0;
        int i3 = 0;
        while (i2 < charSequence.length()) {
            action.invoke(Integer.valueOf(i3), Character.valueOf(charSequence.charAt(i2)));
            i2++;
            i3++;
        }
    }

    private static final char getOrElse(CharSequence charSequence, int i2, Function1<? super Integer, Character> defaultValue) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i2 < 0 || i2 > StringsKt.getLastIndex(charSequence)) ? defaultValue.invoke(Integer.valueOf(i2)).charValue() : charSequence.charAt(i2);
    }

    public static final Character getOrNull(CharSequence charSequence, int i2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i2 < 0 || i2 > StringsKt.getLastIndex(charSequence)) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(i2));
    }

    public static final <K> Map<K, List<Character>> groupBy(CharSequence charSequence, Function1<? super Character, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            char cCharAt = charSequence.charAt(i2);
            K kInvoke = keySelector.invoke(Character.valueOf(cCharAt));
            Object obj = linkedHashMap.get(kInvoke);
            if (obj == null) {
                obj = (List) new ArrayList();
                linkedHashMap.put(kInvoke, obj);
            }
            ((List) obj).add(Character.valueOf(cCharAt));
        }
        return linkedHashMap;
    }

    public static final <K, V> Map<K, List<V>> groupBy(CharSequence charSequence, Function1<? super Character, ? extends K> keySelector, Function1<? super Character, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            char cCharAt = charSequence.charAt(i2);
            K kInvoke = keySelector.invoke(Character.valueOf(cCharAt));
            ArrayList arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(valueTransform.invoke(Character.valueOf(cCharAt)));
        }
        return linkedHashMap;
    }

    public static final <K, M extends Map<? super K, List<Character>>> M groupByTo(CharSequence charSequence, M destination, Function1<? super Character, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            char cCharAt = charSequence.charAt(i2);
            K kInvoke = keySelector.invoke(Character.valueOf(cCharAt));
            Object obj = destination.get(kInvoke);
            if (obj == null) {
                obj = (List) new ArrayList();
                destination.put(kInvoke, obj);
            }
            ((List) obj).add(Character.valueOf(cCharAt));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(CharSequence charSequence, M destination, Function1<? super Character, ? extends K> keySelector, Function1<? super Character, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            char cCharAt = charSequence.charAt(i2);
            K kInvoke = keySelector.invoke(Character.valueOf(cCharAt));
            Object obj = destination.get(kInvoke);
            if (obj == null) {
                obj = (List) new ArrayList();
                destination.put(kInvoke, obj);
            }
            ((List) obj).add(valueTransform.invoke(Character.valueOf(cCharAt)));
        }
        return destination;
    }

    public static final <K> Grouping<Character, K> groupingBy(CharSequence charSequence, Function1<? super Character, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        return new Grouping<Character, K>() { // from class: kotlin.text.StringsKt___StringsKt.groupingBy.1
            final /* synthetic */ Function1<Character, K> $keySelector;
            final /* synthetic */ CharSequence $this_groupingBy;

            /* JADX WARN: Multi-variable type inference failed */
            public C13821(CharSequence charSequence2, Function1<? super Character, ? extends K> keySelector2) {
                charSequence = charSequence2;
                function1 = keySelector2;
            }

            public K keyOf(char c2) {
                return function1.invoke(Character.valueOf(c2));
            }

            @Override // kotlin.collections.Grouping
            public /* bridge */ /* synthetic */ Object keyOf(Character ch) {
                return keyOf(ch.charValue());
            }

            @Override // kotlin.collections.Grouping
            public Iterator<Character> sourceIterator() {
                return StringsKt.iterator(charSequence);
            }
        };
    }

    public static final int indexOfFirst(CharSequence charSequence, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (predicate.invoke(Character.valueOf(charSequence.charAt(i2))).booleanValue()) {
                return i2;
            }
        }
        return -1;
    }

    public static final int indexOfLast(CharSequence charSequence, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (predicate.invoke(Character.valueOf(charSequence.charAt(length))).booleanValue()) {
                    return length;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return -1;
    }

    public static final char last(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(StringsKt.getLastIndex(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static final char last(CharSequence charSequence, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                char cCharAt = charSequence.charAt(length);
                if (!predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                    if (i2 < 0) {
                        break;
                    }
                    length = i2;
                } else {
                    return cCharAt;
                }
            }
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    public static final Character lastOrNull(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(charSequence.length() - 1));
    }

    public static final Character lastOrNull(CharSequence charSequence, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i2 = length - 1;
            char cCharAt = charSequence.charAt(length);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                return Character.valueOf(cCharAt);
            }
            if (i2 < 0) {
                return null;
            }
            length = i2;
        }
    }

    public static final <R> List<R> map(CharSequence charSequence, Function1<? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(charSequence.length());
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            arrayList.add(transform.invoke(Character.valueOf(charSequence.charAt(i2))));
        }
        return arrayList;
    }

    public static final <R> List<R> mapIndexed(CharSequence charSequence, Function2<? super Integer, ? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(charSequence.length());
        int i2 = 0;
        int i3 = 0;
        while (i2 < charSequence.length()) {
            arrayList.add(transform.invoke(Integer.valueOf(i3), Character.valueOf(charSequence.charAt(i2))));
            i2++;
            i3++;
        }
        return arrayList;
    }

    public static final <R> List<R> mapIndexedNotNull(CharSequence charSequence, Function2<? super Integer, ? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        while (i2 < charSequence.length()) {
            int i4 = i3 + 1;
            R rInvoke = transform.invoke(Integer.valueOf(i3), Character.valueOf(charSequence.charAt(i2)));
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
            i2++;
            i3 = i4;
        }
        return arrayList;
    }

    public static final <R, C extends Collection<? super R>> C mapIndexedNotNullTo(CharSequence charSequence, C destination, Function2<? super Integer, ? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int i2 = 0;
        int i3 = 0;
        while (i2 < charSequence.length()) {
            int i4 = i3 + 1;
            R rInvoke = transform.invoke(Integer.valueOf(i3), Character.valueOf(charSequence.charAt(i2)));
            if (rInvoke != null) {
                destination.add(rInvoke);
            }
            i2++;
            i3 = i4;
        }
        return destination;
    }

    public static final <R, C extends Collection<? super R>> C mapIndexedTo(CharSequence charSequence, C destination, Function2<? super Integer, ? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int i2 = 0;
        int i3 = 0;
        while (i2 < charSequence.length()) {
            destination.add(transform.invoke(Integer.valueOf(i3), Character.valueOf(charSequence.charAt(i2))));
            i2++;
            i3++;
        }
        return destination;
    }

    public static final <R> List<R> mapNotNull(CharSequence charSequence, Function1<? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            R rInvoke = transform.invoke(Character.valueOf(charSequence.charAt(i2)));
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
        }
        return arrayList;
    }

    public static final <R, C extends Collection<? super R>> C mapNotNullTo(CharSequence charSequence, C destination, Function1<? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            R rInvoke = transform.invoke(Character.valueOf(charSequence.charAt(i2)));
            if (rInvoke != null) {
                destination.add(rInvoke);
            }
        }
        return destination;
    }

    public static final <R, C extends Collection<? super R>> C mapTo(CharSequence charSequence, C destination, Function1<? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            destination.add(transform.invoke(Character.valueOf(charSequence.charAt(i2))));
        }
        return destination;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.collections.IntIterator] */
    public static final <R extends Comparable<? super R>> Character maxByOrNull(CharSequence charSequence, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = StringsKt.getLastIndex(charSequence);
        if (lastIndex == 0) {
            return Character.valueOf(cCharAt);
        }
        R rInvoke = selector.invoke(Character.valueOf(cCharAt));
        ?? it = new IntRange(1, lastIndex).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.nextInt());
            R rInvoke2 = selector.invoke(Character.valueOf(cCharAt2));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                cCharAt = cCharAt2;
                rInvoke = rInvoke2;
            }
        }
        return Character.valueOf(cCharAt);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.collections.IntIterator] */
    public static final <R extends Comparable<? super R>> char maxByOrThrow(CharSequence charSequence, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = StringsKt.getLastIndex(charSequence);
        if (lastIndex == 0) {
            return cCharAt;
        }
        R rInvoke = selector.invoke(Character.valueOf(cCharAt));
        ?? it = new IntRange(1, lastIndex).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.nextInt());
            R rInvoke2 = selector.invoke(Character.valueOf(cCharAt2));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                cCharAt = cCharAt2;
                rInvoke = rInvoke2;
            }
        }
        return cCharAt;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.collections.IntIterator] */
    private static final double maxOf(CharSequence charSequence, Function1<? super Character, Double> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Character.valueOf(charSequence.charAt(0))).doubleValue();
        ?? it = new IntRange(1, StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt()))).doubleValue());
        }
        return dDoubleValue;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator] */
    /* JADX INFO: renamed from: maxOf */
    private static final float m10272maxOf(CharSequence charSequence, Function1<? super Character, Float> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(Character.valueOf(charSequence.charAt(0))).floatValue();
        ?? it = new IntRange(1, StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt()))).floatValue());
        }
        return fFloatValue;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.IntIterator] */
    /* JADX INFO: renamed from: maxOf */
    private static final <R extends Comparable<? super R>> R m10273maxOf(CharSequence charSequence, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Character.valueOf(charSequence.charAt(0)));
        ?? it = new IntRange(1, StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt())));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.IntIterator] */
    private static final <R extends Comparable<? super R>> R maxOfOrNull(CharSequence charSequence, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Character.valueOf(charSequence.charAt(0)));
        ?? it = new IntRange(1, StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt())));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.collections.IntIterator] */
    /* JADX INFO: renamed from: maxOfOrNull */
    private static final Double m10274maxOfOrNull(CharSequence charSequence, Function1<? super Character, Double> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Character.valueOf(charSequence.charAt(0))).doubleValue();
        ?? it = new IntRange(1, StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt()))).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator] */
    /* JADX INFO: renamed from: maxOfOrNull */
    private static final Float m10275maxOfOrNull(CharSequence charSequence, Function1<? super Character, Float> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Character.valueOf(charSequence.charAt(0))).floatValue();
        ?? it = new IntRange(1, StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt()))).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.IntIterator] */
    private static final <R> R maxOfWith(CharSequence charSequence, Comparator<? super R> comparator, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Character.valueOf(charSequence.charAt(0)));
        ?? it = new IntRange(1, StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt())));
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.IntIterator] */
    private static final <R> R maxOfWithOrNull(CharSequence charSequence, Comparator<? super R> comparator, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Character.valueOf(charSequence.charAt(0)));
        ?? it = new IntRange(1, StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt())));
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.IntIterator] */
    public static final Character maxOrNull(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        ?? it = new IntRange(1, StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.nextInt());
            if (Intrinsics.compare((int) cCharAt, (int) cCharAt2) < 0) {
                cCharAt = cCharAt2;
            }
        }
        return Character.valueOf(cCharAt);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.IntIterator] */
    public static final char maxOrThrow(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        ?? it = new IntRange(1, StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.nextInt());
            if (Intrinsics.compare((int) cCharAt, (int) cCharAt2) < 0) {
                cCharAt = cCharAt2;
            }
        }
        return cCharAt;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.collections.IntIterator] */
    public static final Character maxWithOrNull(CharSequence charSequence, Comparator<? super Character> comparator) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        ?? it = new IntRange(1, StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.nextInt());
            if (comparator.compare(Character.valueOf(cCharAt), Character.valueOf(cCharAt2)) < 0) {
                cCharAt = cCharAt2;
            }
        }
        return Character.valueOf(cCharAt);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.collections.IntIterator] */
    public static final char maxWithOrThrow(CharSequence charSequence, Comparator<? super Character> comparator) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        ?? it = new IntRange(1, StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.nextInt());
            if (comparator.compare(Character.valueOf(cCharAt), Character.valueOf(cCharAt2)) < 0) {
                cCharAt = cCharAt2;
            }
        }
        return cCharAt;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.collections.IntIterator] */
    public static final <R extends Comparable<? super R>> Character minByOrNull(CharSequence charSequence, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = StringsKt.getLastIndex(charSequence);
        if (lastIndex == 0) {
            return Character.valueOf(cCharAt);
        }
        R rInvoke = selector.invoke(Character.valueOf(cCharAt));
        ?? it = new IntRange(1, lastIndex).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.nextInt());
            R rInvoke2 = selector.invoke(Character.valueOf(cCharAt2));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                cCharAt = cCharAt2;
                rInvoke = rInvoke2;
            }
        }
        return Character.valueOf(cCharAt);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.collections.IntIterator] */
    public static final <R extends Comparable<? super R>> char minByOrThrow(CharSequence charSequence, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = StringsKt.getLastIndex(charSequence);
        if (lastIndex == 0) {
            return cCharAt;
        }
        R rInvoke = selector.invoke(Character.valueOf(cCharAt));
        ?? it = new IntRange(1, lastIndex).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.nextInt());
            R rInvoke2 = selector.invoke(Character.valueOf(cCharAt2));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                cCharAt = cCharAt2;
                rInvoke = rInvoke2;
            }
        }
        return cCharAt;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.collections.IntIterator] */
    private static final double minOf(CharSequence charSequence, Function1<? super Character, Double> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Character.valueOf(charSequence.charAt(0))).doubleValue();
        ?? it = new IntRange(1, StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt()))).doubleValue());
        }
        return dDoubleValue;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator] */
    /* JADX INFO: renamed from: minOf */
    private static final float m10276minOf(CharSequence charSequence, Function1<? super Character, Float> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(Character.valueOf(charSequence.charAt(0))).floatValue();
        ?? it = new IntRange(1, StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt()))).floatValue());
        }
        return fFloatValue;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.IntIterator] */
    /* JADX INFO: renamed from: minOf */
    private static final <R extends Comparable<? super R>> R m10277minOf(CharSequence charSequence, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Character.valueOf(charSequence.charAt(0)));
        ?? it = new IntRange(1, StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt())));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.IntIterator] */
    private static final <R extends Comparable<? super R>> R minOfOrNull(CharSequence charSequence, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Character.valueOf(charSequence.charAt(0)));
        ?? it = new IntRange(1, StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt())));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.collections.IntIterator] */
    /* JADX INFO: renamed from: minOfOrNull */
    private static final Double m10278minOfOrNull(CharSequence charSequence, Function1<? super Character, Double> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Character.valueOf(charSequence.charAt(0))).doubleValue();
        ?? it = new IntRange(1, StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt()))).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator] */
    /* JADX INFO: renamed from: minOfOrNull */
    private static final Float m10279minOfOrNull(CharSequence charSequence, Function1<? super Character, Float> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Character.valueOf(charSequence.charAt(0))).floatValue();
        ?? it = new IntRange(1, StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt()))).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.IntIterator] */
    private static final <R> R minOfWith(CharSequence charSequence, Comparator<? super R> comparator, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Character.valueOf(charSequence.charAt(0)));
        ?? it = new IntRange(1, StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt())));
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.IntIterator] */
    private static final <R> R minOfWithOrNull(CharSequence charSequence, Comparator<? super R> comparator, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Character.valueOf(charSequence.charAt(0)));
        ?? it = new IntRange(1, StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt())));
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.IntIterator] */
    public static final Character minOrNull(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        ?? it = new IntRange(1, StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.nextInt());
            if (Intrinsics.compare((int) cCharAt, (int) cCharAt2) > 0) {
                cCharAt = cCharAt2;
            }
        }
        return Character.valueOf(cCharAt);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.IntIterator] */
    public static final char minOrThrow(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        ?? it = new IntRange(1, StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.nextInt());
            if (Intrinsics.compare((int) cCharAt, (int) cCharAt2) > 0) {
                cCharAt = cCharAt2;
            }
        }
        return cCharAt;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.collections.IntIterator] */
    public static final Character minWithOrNull(CharSequence charSequence, Comparator<? super Character> comparator) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        ?? it = new IntRange(1, StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.nextInt());
            if (comparator.compare(Character.valueOf(cCharAt), Character.valueOf(cCharAt2)) > 0) {
                cCharAt = cCharAt2;
            }
        }
        return Character.valueOf(cCharAt);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.collections.IntIterator] */
    public static final char minWithOrThrow(CharSequence charSequence, Comparator<? super Character> comparator) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        ?? it = new IntRange(1, StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.nextInt());
            if (comparator.compare(Character.valueOf(cCharAt), Character.valueOf(cCharAt2)) > 0) {
                cCharAt = cCharAt2;
            }
        }
        return cCharAt;
    }

    public static final boolean none(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() == 0;
    }

    public static final boolean none(CharSequence charSequence, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (predicate.invoke(Character.valueOf(charSequence.charAt(i2))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <S extends CharSequence> S onEach(S s2, Function1<? super Character, Unit> action) {
        Intrinsics.checkNotNullParameter(s2, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (int i2 = 0; i2 < s2.length(); i2++) {
            action.invoke(Character.valueOf(s2.charAt(i2)));
        }
        return s2;
    }

    public static final <S extends CharSequence> S onEachIndexed(S s2, Function2<? super Integer, ? super Character, Unit> action) {
        Intrinsics.checkNotNullParameter(s2, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int i2 = 0;
        int i3 = 0;
        while (i2 < s2.length()) {
            action.invoke(Integer.valueOf(i3), Character.valueOf(s2.charAt(i2)));
            i2++;
            i3++;
        }
        return s2;
    }

    public static final Pair<CharSequence, CharSequence> partition(CharSequence charSequence, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            char cCharAt = charSequence.charAt(i2);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                sb.append(cCharAt);
            } else {
                sb2.append(cCharAt);
            }
        }
        return new Pair<>(sb, sb2);
    }

    public static final Pair<String, String> partition(String str, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                sb.append(cCharAt);
            } else {
                sb2.append(cCharAt);
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new Pair<>(string, string2);
    }

    private static final char random(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return StringsKt.random(charSequence, Random.Default);
    }

    public static final char random(CharSequence charSequence, Random random) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (charSequence.length() != 0) {
            return charSequence.charAt(random.nextInt(charSequence.length()));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    private static final Character randomOrNull(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return StringsKt.randomOrNull(charSequence, Random.Default);
    }

    public static final Character randomOrNull(CharSequence charSequence, Random random) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(random.nextInt(charSequence.length())));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.IntIterator] */
    public static final char reduce(CharSequence charSequence, Function2<? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char cCharAt = charSequence.charAt(0);
        ?? it = new IntRange(1, StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            cCharAt = operation.invoke(Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(it.nextInt()))).charValue();
        }
        return cCharAt;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.collections.IntIterator] */
    public static final char reduceIndexed(CharSequence charSequence, Function3<? super Integer, ? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char cCharAt = charSequence.charAt(0);
        ?? it = new IntRange(1, StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            cCharAt = operation.invoke(Integer.valueOf(iNextInt), Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(iNextInt))).charValue();
        }
        return cCharAt;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.collections.IntIterator] */
    public static final Character reduceIndexedOrNull(CharSequence charSequence, Function3<? super Integer, ? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        ?? it = new IntRange(1, StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            cCharAt = operation.invoke(Integer.valueOf(iNextInt), Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(iNextInt))).charValue();
        }
        return Character.valueOf(cCharAt);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.IntIterator] */
    public static final Character reduceOrNull(CharSequence charSequence, Function2<? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        ?? it = new IntRange(1, StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            cCharAt = operation.invoke(Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(it.nextInt()))).charValue();
        }
        return Character.valueOf(cCharAt);
    }

    public static final char reduceRight(CharSequence charSequence, Function2<? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = StringsKt.getLastIndex(charSequence);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char cCharAt = charSequence.charAt(lastIndex);
        for (int i2 = lastIndex - 1; i2 >= 0; i2--) {
            cCharAt = operation.invoke(Character.valueOf(charSequence.charAt(i2)), Character.valueOf(cCharAt)).charValue();
        }
        return cCharAt;
    }

    public static final char reduceRightIndexed(CharSequence charSequence, Function3<? super Integer, ? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = StringsKt.getLastIndex(charSequence);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char cCharAt = charSequence.charAt(lastIndex);
        for (int i2 = lastIndex - 1; i2 >= 0; i2--) {
            cCharAt = operation.invoke(Integer.valueOf(i2), Character.valueOf(charSequence.charAt(i2)), Character.valueOf(cCharAt)).charValue();
        }
        return cCharAt;
    }

    public static final Character reduceRightIndexedOrNull(CharSequence charSequence, Function3<? super Integer, ? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = StringsKt.getLastIndex(charSequence);
        if (lastIndex < 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(lastIndex);
        for (int i2 = lastIndex - 1; i2 >= 0; i2--) {
            cCharAt = operation.invoke(Integer.valueOf(i2), Character.valueOf(charSequence.charAt(i2)), Character.valueOf(cCharAt)).charValue();
        }
        return Character.valueOf(cCharAt);
    }

    public static final Character reduceRightOrNull(CharSequence charSequence, Function2<? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = StringsKt.getLastIndex(charSequence);
        if (lastIndex < 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(lastIndex);
        for (int i2 = lastIndex - 1; i2 >= 0; i2--) {
            cCharAt = operation.invoke(Character.valueOf(charSequence.charAt(i2)), Character.valueOf(cCharAt)).charValue();
        }
        return Character.valueOf(cCharAt);
    }

    public static final CharSequence reversed(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        StringBuilder sbReverse = new StringBuilder(charSequence).reverse();
        Intrinsics.checkNotNullExpressionValue(sbReverse, "reverse(...)");
        return sbReverse;
    }

    private static final String reversed(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return StringsKt.reversed((CharSequence) str).toString();
    }

    public static final <R> List<R> runningFold(CharSequence charSequence, R r2, Function2<? super R, ? super Character, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return CollectionsKt.listOf(r2);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r2);
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            r2 = operation.invoke(r2, Character.valueOf(charSequence.charAt(i2)));
            arrayList.add(r2);
        }
        return arrayList;
    }

    public static final <R> List<R> runningFoldIndexed(CharSequence charSequence, R r2, Function3<? super Integer, ? super R, ? super Character, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return CollectionsKt.listOf(r2);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r2);
        int length = charSequence.length();
        for (int i2 = 0; i2 < length; i2++) {
            r2 = operation.invoke(Integer.valueOf(i2), r2, Character.valueOf(charSequence.charAt(i2)));
            arrayList.add(r2);
        }
        return arrayList;
    }

    public static final List<Character> runningReduce(CharSequence charSequence, Function2<? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return CollectionsKt.emptyList();
        }
        char cCharAt = charSequence.charAt(0);
        ArrayList arrayList = new ArrayList(charSequence.length());
        arrayList.add(Character.valueOf(cCharAt));
        int length = charSequence.length();
        for (int i2 = 1; i2 < length; i2++) {
            cCharAt = operation.invoke(Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(i2))).charValue();
            arrayList.add(Character.valueOf(cCharAt));
        }
        return arrayList;
    }

    public static final List<Character> runningReduceIndexed(CharSequence charSequence, Function3<? super Integer, ? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return CollectionsKt.emptyList();
        }
        char cCharAt = charSequence.charAt(0);
        ArrayList arrayList = new ArrayList(charSequence.length());
        arrayList.add(Character.valueOf(cCharAt));
        int length = charSequence.length();
        for (int i2 = 1; i2 < length; i2++) {
            cCharAt = operation.invoke(Integer.valueOf(i2), Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(i2))).charValue();
            arrayList.add(Character.valueOf(cCharAt));
        }
        return arrayList;
    }

    public static final <R> List<R> scan(CharSequence charSequence, R r2, Function2<? super R, ? super Character, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return CollectionsKt.listOf(r2);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r2);
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            r2 = operation.invoke(r2, Character.valueOf(charSequence.charAt(i2)));
            arrayList.add(r2);
        }
        return arrayList;
    }

    public static final <R> List<R> scanIndexed(CharSequence charSequence, R r2, Function3<? super Integer, ? super R, ? super Character, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return CollectionsKt.listOf(r2);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r2);
        int length = charSequence.length();
        for (int i2 = 0; i2 < length; i2++) {
            r2 = operation.invoke(Integer.valueOf(i2), r2, Character.valueOf(charSequence.charAt(i2)));
            arrayList.add(r2);
        }
        return arrayList;
    }

    public static final char single(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length();
        if (length == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (length == 1) {
            return charSequence.charAt(0);
        }
        throw new IllegalArgumentException("Char sequence has more than one element.");
    }

    public static final char single(CharSequence charSequence, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Character chValueOf = null;
        boolean z2 = false;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            char cCharAt = charSequence.charAt(i2);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                if (z2) {
                    throw new IllegalArgumentException("Char sequence contains more than one matching element.");
                }
                chValueOf = Character.valueOf(cCharAt);
                z2 = true;
            }
        }
        if (!z2) {
            throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
        }
        Intrinsics.checkNotNull(chValueOf, "null cannot be cast to non-null type kotlin.Char");
        return chValueOf.charValue();
    }

    public static final Character singleOrNull(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 1) {
            return Character.valueOf(charSequence.charAt(0));
        }
        return null;
    }

    public static final Character singleOrNull(CharSequence charSequence, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Character chValueOf = null;
        boolean z2 = false;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            char cCharAt = charSequence.charAt(i2);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                if (z2) {
                    return null;
                }
                chValueOf = Character.valueOf(cCharAt);
                z2 = true;
            }
        }
        if (z2) {
            return chValueOf;
        }
        return null;
    }

    public static final CharSequence slice(CharSequence charSequence, Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int iCollectionSizeOrDefault = CollectionsKt.collectionSizeOrDefault(indices, 10);
        if (iCollectionSizeOrDefault == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(iCollectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            sb.append(charSequence.charAt(it.next().intValue()));
        }
        return sb;
    }

    public static final CharSequence slice(CharSequence charSequence, IntRange indices) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? "" : StringsKt.subSequence(charSequence, indices);
    }

    private static final String slice(String str, Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return StringsKt.slice((CharSequence) str, indices).toString();
    }

    public static final String slice(String str, IntRange indices) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? "" : StringsKt.substring(str, indices);
    }

    @Deprecated(message = "\u0018Y\u0001t\u0005\n\"F^\u00071\tc)1O`\u001a", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "", hiddenSince = "", warningSince = "\u000bc@")
    public static final int sumBy(CharSequence charSequence, Function1<? super Character, Integer> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iIntValue = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            iIntValue += selector.invoke(Character.valueOf(charSequence.charAt(i2))).intValue();
        }
        return iIntValue;
    }

    @Deprecated(message = "\u0018Y\u0001t\u0005\n\"F^\u00071\tc)1O`\u001a", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "", hiddenSince = "", warningSince = "\u000bc@")
    public static final double sumByDouble(CharSequence charSequence, Function1<? super Character, Double> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double dDoubleValue = 0.0d;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            dDoubleValue += selector.invoke(Character.valueOf(charSequence.charAt(i2))).doubleValue();
        }
        return dDoubleValue;
    }

    private static final double sumOfDouble(CharSequence charSequence, Function1<? super Character, Double> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double dDoubleValue = 0.0d;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            dDoubleValue += selector.invoke(Character.valueOf(charSequence.charAt(i2))).doubleValue();
        }
        return dDoubleValue;
    }

    private static final int sumOfInt(CharSequence charSequence, Function1<? super Character, Integer> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iIntValue = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            iIntValue += selector.invoke(Character.valueOf(charSequence.charAt(i2))).intValue();
        }
        return iIntValue;
    }

    private static final long sumOfLong(CharSequence charSequence, Function1<? super Character, Long> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long jLongValue = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            jLongValue += selector.invoke(Character.valueOf(charSequence.charAt(i2))).longValue();
        }
        return jLongValue;
    }

    private static final int sumOfUInt(CharSequence charSequence, Function1<? super Character, UInt> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iM9075constructorimpl = UInt.m9075constructorimpl(0);
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            iM9075constructorimpl = UInt.m9075constructorimpl(iM9075constructorimpl + selector.invoke(Character.valueOf(charSequence.charAt(i2))).m9127unboximpl());
        }
        return iM9075constructorimpl;
    }

    private static final long sumOfULong(CharSequence charSequence, Function1<? super Character, ULong> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long jM9154constructorimpl = ULong.m9154constructorimpl(0L);
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            jM9154constructorimpl = ULong.m9154constructorimpl(jM9154constructorimpl + selector.invoke(Character.valueOf(charSequence.charAt(i2))).m9206unboximpl());
        }
        return jM9154constructorimpl;
    }

    public static final CharSequence take(CharSequence charSequence, int i2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i2 >= 0) {
            return charSequence.subSequence(0, RangesKt.coerceAtMost(i2, charSequence.length()));
        }
        throw new IllegalArgumentException(("Requested character count " + i2 + " is less than zero.").toString());
    }

    public static final String take(String str, int i2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i2 < 0) {
            throw new IllegalArgumentException(("Requested character count " + i2 + " is less than zero.").toString());
        }
        String strSubstring = str.substring(0, RangesKt.coerceAtMost(i2, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final CharSequence takeLast(CharSequence charSequence, int i2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i2 < 0) {
            throw new IllegalArgumentException(("Requested character count " + i2 + " is less than zero.").toString());
        }
        int length = charSequence.length();
        return charSequence.subSequence(length - RangesKt.coerceAtMost(i2, length), length);
    }

    public static final String takeLast(String str, int i2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i2 < 0) {
            throw new IllegalArgumentException(("Requested character count " + i2 + " is less than zero.").toString());
        }
        int length = str.length();
        String strSubstring = str.substring(length - RangesKt.coerceAtMost(i2, length));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final CharSequence takeLastWhile(CharSequence charSequence, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = StringsKt.getLastIndex(charSequence); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Character.valueOf(charSequence.charAt(lastIndex))).booleanValue()) {
                return charSequence.subSequence(lastIndex + 1, charSequence.length());
            }
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    public static final String takeLastWhile(String str, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = StringsKt.getLastIndex(str); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Character.valueOf(str.charAt(lastIndex))).booleanValue()) {
                String strSubstring = str.substring(lastIndex + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                return strSubstring;
            }
        }
        return str;
    }

    public static final CharSequence takeWhile(CharSequence charSequence, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (!predicate.invoke(Character.valueOf(charSequence.charAt(i2))).booleanValue()) {
                return charSequence.subSequence(0, i2);
            }
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    public static final String takeWhile(String str, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (!predicate.invoke(Character.valueOf(str.charAt(i2))).booleanValue()) {
                String strSubstring = str.substring(0, i2);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                return strSubstring;
            }
        }
        return str;
    }

    public static final <C extends Collection<? super Character>> C toCollection(CharSequence charSequence, C destination) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            destination.add(Character.valueOf(charSequence.charAt(i2)));
        }
        return destination;
    }

    public static final HashSet<Character> toHashSet(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return (HashSet) StringsKt.toCollection(charSequence, new HashSet(MapsKt.mapCapacity(RangesKt.coerceAtMost(charSequence.length(), 128))));
    }

    public static final List<Character> toList(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length();
        return length != 0 ? length != 1 ? StringsKt.toMutableList(charSequence) : CollectionsKt.listOf(Character.valueOf(charSequence.charAt(0))) : CollectionsKt.emptyList();
    }

    public static final List<Character> toMutableList(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return (List) StringsKt.toCollection(charSequence, new ArrayList(charSequence.length()));
    }

    public static final Set<Character> toSet(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length();
        return length != 0 ? length != 1 ? (Set) StringsKt.toCollection(charSequence, new LinkedHashSet(MapsKt.mapCapacity(RangesKt.coerceAtMost(charSequence.length(), 128)))) : SetsKt.setOf(Character.valueOf(charSequence.charAt(0))) : SetsKt.emptySet();
    }

    public static final List<String> windowed(CharSequence charSequence, int i2, int i3, boolean z2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return StringsKt.windowed(charSequence, i2, i3, z2, C13831.INSTANCE);
    }

    public static final <R> List<R> windowed(CharSequence charSequence, int i2, int i3, boolean z2, Function1<? super CharSequence, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        SlidingWindowKt.checkWindowSizeStep(i2, i3);
        int length = charSequence.length();
        int i4 = 0;
        ArrayList arrayList = new ArrayList((length / i3) + (length % i3 == 0 ? 0 : 1));
        while (i4 >= 0 && i4 < length) {
            int i5 = i4 + i2;
            if (i5 < 0 || i5 > length) {
                if (!z2) {
                    break;
                }
                i5 = length;
            }
            arrayList.add(transform.invoke(charSequence.subSequence(i4, i5)));
            i4 += i3;
        }
        return arrayList;
    }

    public static /* synthetic */ List windowed$default(CharSequence charSequence, int i2, int i3, boolean z2, int i4, Object obj) {
        if ((-1) - (((-1) - i4) | ((-1) - 2)) != 0) {
            i3 = 1;
        }
        if ((i4 + 4) - (i4 | 4) != 0) {
            z2 = false;
        }
        return StringsKt.windowed(charSequence, i2, i3, z2);
    }

    public static /* synthetic */ List windowed$default(CharSequence charSequence, int i2, int i3, boolean z2, Function1 function1, int i4, Object obj) {
        if ((-1) - (((-1) - i4) | ((-1) - 2)) != 0) {
            i3 = 1;
        }
        if ((i4 + 4) - (i4 | 4) != 0) {
            z2 = false;
        }
        return StringsKt.windowed(charSequence, i2, i3, z2, function1);
    }

    public static final Sequence<String> windowedSequence(CharSequence charSequence, int i2, int i3, boolean z2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return StringsKt.windowedSequence(charSequence, i2, i3, z2, C13841.INSTANCE);
    }

    public static final <R> Sequence<R> windowedSequence(CharSequence charSequence, int i2, int i3, boolean z2, Function1<? super CharSequence, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        SlidingWindowKt.checkWindowSizeStep(i2, i3);
        return SequencesKt.map(CollectionsKt.asSequence(RangesKt.step(z2 ? StringsKt.getIndices(charSequence) : RangesKt.until(0, (charSequence.length() - i2) + 1), i3)), new Function1<Integer, R>() { // from class: kotlin.text.StringsKt___StringsKt.windowedSequence.2
            final /* synthetic */ int $size;
            final /* synthetic */ CharSequence $this_windowedSequence;
            final /* synthetic */ Function1<CharSequence, R> $transform;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(int i22, CharSequence charSequence2, Function1<? super CharSequence, ? extends R> transform2) {
                super(1);
                i = i22;
                charSequence = charSequence2;
                function1 = transform2;
            }

            public final R invoke(int i22) {
                int length = i + i22;
                if (length < 0 || length > charSequence.length()) {
                    length = charSequence.length();
                }
                return function1.invoke(charSequence.subSequence(i22, length));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }
        });
    }

    public static /* synthetic */ Sequence windowedSequence$default(CharSequence charSequence, int i2, int i3, boolean z2, int i4, Object obj) {
        if ((-1) - (((-1) - i4) | ((-1) - 2)) != 0) {
            i3 = 1;
        }
        if ((i4 + 4) - (i4 | 4) != 0) {
            z2 = false;
        }
        return StringsKt.windowedSequence(charSequence, i2, i3, z2);
    }

    public static /* synthetic */ Sequence windowedSequence$default(CharSequence charSequence, int i2, int i3, boolean z2, Function1 function1, int i4, Object obj) {
        if ((i4 + 2) - (2 | i4) != 0) {
            i3 = 1;
        }
        if ((i4 & 4) != 0) {
            z2 = false;
        }
        return StringsKt.windowedSequence(charSequence, i2, i3, z2, function1);
    }

    public static final Iterable<IndexedValue<Character>> withIndex(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return new IndexingIterable(new Function0<Iterator<? extends Character>>() { // from class: kotlin.text.StringsKt___StringsKt.withIndex.1
            final /* synthetic */ CharSequence $this_withIndex;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C13851(CharSequence charSequence2) {
                super(0);
                charSequence = charSequence2;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Iterator<? extends Character> invoke() {
                return StringsKt.iterator(charSequence);
            }
        });
    }

    public static final List<Pair<Character, Character>> zip(CharSequence charSequence, CharSequence other) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(charSequence.length(), other.length());
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(TuplesKt.to(Character.valueOf(charSequence.charAt(i2)), Character.valueOf(other.charAt(i2))));
        }
        return arrayList;
    }

    public static final <V> List<V> zip(CharSequence charSequence, CharSequence other, Function2<? super Character, ? super Character, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(charSequence.length(), other.length());
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(transform.invoke(Character.valueOf(charSequence.charAt(i2)), Character.valueOf(other.charAt(i2))));
        }
        return arrayList;
    }

    public static final List<Pair<Character, Character>> zipWithNext(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length() - 1;
        if (length < 1) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(length);
        int i2 = 0;
        while (i2 < length) {
            char cCharAt = charSequence.charAt(i2);
            i2++;
            arrayList.add(TuplesKt.to(Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(i2))));
        }
        return arrayList;
    }

    public static final <R> List<R> zipWithNext(CharSequence charSequence, Function2<? super Character, ? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = charSequence.length() - 1;
        if (length < 1) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(length);
        int i2 = 0;
        while (i2 < length) {
            Character chValueOf = Character.valueOf(charSequence.charAt(i2));
            i2++;
            arrayList.add(transform.invoke(chValueOf, Character.valueOf(charSequence.charAt(i2))));
        }
        return arrayList;
    }
}
