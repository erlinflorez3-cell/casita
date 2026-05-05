package kotlin.collections;

import com.dynatrace.android.agent.Global;
import defpackage.Architecture;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message end-group tag did not match expected tag.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidEndTag(InvalidProtocolBufferException.java:94)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.checkLastTagWas(CodedInputStream.java:180)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:194)
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
@Metadata(bv = {}, d1 = {"Яĉ\u0014D߬)\u001ew\tLDit\fA\u0014R\u0013ǞJ~8,\u001aw\u0015\u000br96DmH<l[ճ\u0017k\u00124,Ӌ,qQA]\u001a\u0004\"\u0011O\\ʴonP\\\u0013C\u001d$\u001exp-QU\u0007z\u001a\u000f8Dw?AMw=?d|6\u0013-:\">|\r\u0001(.P\u0010\u0005\u007fKK\u0012\u00158@\u0007:Z\rc\u0005\"\u0012\fP(\u00014\\oNLHt]@1+\u0003\u007fBVϋwx\u000bձ%F\u0003&-xgӜ9@W7\u001b$a\u0004/`kC\t>\u0002=Kh7);I:XdZ00#.g%m\u00016h\u0015Sp\fm+_e[PT)&\u007f\f\u000fL\u0004<\u0005ULtƭ Ɋ\u0007ԄK\u0017\u0001YXP0]b\u0002\u0001ʨD\u0017E\u00029*G\u001c\u000f_q?\u001fMG{K\r.%\u0011ng\\\u0003\u0010x])Z\u0010Q_P`?Nݐ\u0018Y]o\nop\u0003R\u0012@K\u0006.\f\u0011t\u001759k9i\"\u001a\u0004x`uy\u001dxxay^XB2n\\7:\u000b\u001cZ\u000be3p`Vh,?LJXMé\u000e̯\u001fο\u0010s/,(`_vyv]_\u001a%ufG[~kTXgca=qe\u0016Р`v4ABa\u0013Y\u000fPc\u0010`[8\"xHz\u0012\b{\u000bO:\u0015xŵw4h::1n%V\u0013*RC\r\t&Zx\u0012\u000fTy%1nR~)\u0003Vʔ~o\bzO+\u000baJ;QU;\u00186UhhD~3\u0007Et.I\u007fqUW\u0005\u0016$a\u001c\"\u001c֝GQO?\u0019\u000e\r*Z\u0010=IRquQ\u0014\u00127|\ryU<\u00170.ŕp\ttnubO\u0003#Bxdа1\b\u0005\u0002\u007f`T{oqd\u000fa=YrIYLPH|K L'1\f0\u007fMES5-\"\b\u0016?\u0015(]yq>y)\u0010Tyu\u0006<cDn\u0011U$ЭAϨHʲ\u0017\u001801\u0005\u0003\tV\u000by\u000eȷ\u00174-5N@rqv>S\u000b=\f\u000f\u0007Z\u001c\u0019dk>\u0019n\u000e4t_:uS}Z_q'Akaw\u0006\b[j\u001bV\u001f\f\u001b{wn\"\u001eM \u001dX\u0011\u000e@\n\u0004\u001aL@\u0002p3@Oӟ:˯;ފդGTw\u0017(V\u000eXw\u0011-1\t\u0002[X\u0014֊\u0007\\vJ\u000b_SaA0\u0007~\u001dAFxc@-{VX5bB\u0001\u001a\u001d\u0019\u001dzOEgS-trG+@r\u0011\u0019UiSK\u00126JG9o{oR9F\u0002-F(\u001dOPWm%4%Ο[ΝMІʝ\u0016f`_:\u0004\r\u000e\u0015\u0014L\f\u001f\u000b_]!\u0004\u0003/Rϕ\u00067c\u001c\u0007\u0016R*'\u000e\u0003cT)U\u0014E1CHz\u0014m{gUK}N!N)4\u0017/lo,v\u0018m'J\u0018\u0002\u0016)\u0002\u0019\u0015` J/xy\u0003\u0012>\u000eFQ\u00123H!\ra\u001a{g̿-ÔkݩZ+v\f\"i|e~UQ\u0011\u0015Ev{t߲^\u001d))S-!Yz<\u0017S.f9\u000e$\u0019,\u001eF\b)) Qsh7l}]=M={B\u007fA>b*\u000e!\nuJ*d*%;\u001dNli\u0019d|Hg\u0010njnr#\u0016W\u0018CېNז\u0010ӂ̭Jr$yG+'5s\r\u000ew'\u0006KÒ4!QTE\u001aE3+q.v\u001f\u0011Zpz\u00018Y1z\u0010k2ߠVT\u0004(UqL{t\u0007,JU8\t\b<\u0013\u001e\u0011u[f\"n`(5SQyXI3\u000f%P$\u007f\u0015)AzSc%p\u0001\r\u0003\u001d?@2\u001a?\u0004?\u0003)?\u0011\u007f\u001b\u001eti-ci\u0013ۅ\u0012\u0604dڄԐQcd)y\"WK]\u001e@l`\u0002\u0010٪2$&w)~S2h,e\\Nd\u0014e\n'8M\u0017L3Krԭ\u0004\nrwF\f\riq8Gy$\u0019\u000b>:/|\u0007\fN\u0017{;H\u001b^,7U\u001dYU%\r(m\u0002N;U\u0003O?\\$<#u\u0014:xbd~WHi0\u0016/\"T*x\u0019w\u007fcVن\u0018֍\fԽֶ5Tf\u001bn70oY\u0013^6\u000b\u0016mChޑN\u000fD`4A\u001a\f.$>L\u001d\u0001\u000eJ'\u0015#5Ws\bH@X,=+/s=\u00163wvWAeq\u001f=I5\u001bm\u0011Ycjl\u0007e!y\u0002Y\u0019Fӵ1˲F݊Vn8w\u001e\u0014UfX\u0010\u000b\u0007r<\u000e26ߣ^~zEc\u007f* ]W\u001be\r@\u000bEkh\u0017*GW5Re%=xH\u0004>CI/\u0019.kQB1\u0004\u0019A@\f\b#Ie~}IV\u0004\u0010O11\u0016?uOyp\u001d̵EьVá\u0017f.G<\f#&rgYw<6\u007f\u0005Rܹd)hM_\u0010tC\u000b\u0015\u0001t\u001a<48\u0004\u0015e\u0014!f\"4K_\u0007,>r\u0019G\u0016k*,\u0016\u000et\u0005qgU9\u0006%N3\u0002\u0011*Oo\u0016~Q#Yl\u001cg*P\u0015\u0018\u0019c4\u0010\u007f\u000f֩6ƵTۀ\u0006^\u0002ux\u0011 K\f2jҵ\u0001f\u0005@i=JI\r\u001flO\f)yD\u0011\u0018\u0001~NB\u001ey\u001547:NУ)\u0001GY\u0010/<ETz)fC:ha2Um%\u000eK4\u0010\u001be\u0006.\u0014]yM=\u000e:\r-\u001fNt\u0003\u0010|\u0007]0Jk?4VZ\u0007\u001d[_7qx\n@\rR\u000b305֎X\u07fctصʒh~182/e[_!Y\u001a9>\u000eȏ[X\u001bp^[3/\u001c\b%\u0012P\nUzGt\nJ\u007fy_8cϰ9}0\u0006N%\u0014 \u0014gP\"_i)\u0011m0]wMZj[q\u0006\u0018;A$N,W\u001eVDbJ21\u0011\u001bF\u001aZf5x5\u000bu\fuu$\u0013BoNs-k\u00168\bǶ[Դ}ЧԿ3q\u0016eaW\rN_\u001aY\u0018JO\u0013m\u0006]MT\\35t$3\u0016Ӎn[b\u0019}\u0007p5\fF\u0002G\u0011\"\u0013Q>\u001cjf5z%t\n\u001eM\u001a\u0013\u0013\u0015>:)3B5_'h.=9\r+\\i]t\u0019T\u001d8bB>X\u000fXZv\u000ea\u00033Pt\u001c&9\f\u0007nO[֣\n½b\u009fەkHqNGp\u0006=N+\u00107I\r:Pn7w^OV9\rUso\nwȗ@G}\\&.i\t.VlL^\u001bi\r|0\u0007v9%m9*8U&#Bu\u0019.\u0005FnK]/T\u0013|N\u000bi\u0001?H\u000e\u00141\u001fQ!&\u000ej\b\u0010vk4\u0016v/EX\u0015\u001c\u001a\n<6\u0018K߭Rل4ǪY\u000fM{\t\u0019q\u0006\u007f`HѪ\u001b%A*\u0011\u00176b\r\u001fu\u001560k\u0019\u0007\u001d}\tV*wI1;az\u0001\u0019B\u0010fU A\u001a\u0013)_&\u0002Qe>U\f!]Z}\n>l\u007fj>^ Q\u0002<$\u007f&;U* &\u0019IBf#Ï-ʧ'ېݔ\u0012\u001e-S<z\u001a\u0017H\u001b\u000b\u0013\u001eq|ǘp\u0012\u00016t4fA]93\u0005,\u007f\u0011\ti];\u0016NY\u001cG\u0013\u0011\u0017\u0013^h*v\u0005Ly\t\u00183-\u0004LKu4,9\u0010zOpDB2*\u0011>RiR̟R\u07bb,ϴN(JJQ<I\u001fP\u0001\u001dؒNj\u0015\u00065E\u001fs1~A6O^l\u001fr^9r{yuQ\u0001C}\u000b=?/>HoG/[g2\u001c\fgMK5\u0015S \u0019\u0011\u0005\u0005-5 \b\r.\u0006ڑ\fѝ\u0013ϕ\u0017\u0016~o\u0003@\f\u001bz\"\u0015$hܲB.bdU)$\u0013\u0006Z-W\u007fr;gD\u007fJM`\u0010\rm/\u001b6'3\n+*ILTSCl*H\u0004x\r)\u001dVU\u0002W>\\\u0002\u000b\u007f,28@\btqk|F.\u001d9FY1x\u0010:T\u0013ƿ\u0003ޗHιχ\u000fB <J\u0010,,3X|Hbr\u0016^<ݟkDI\u007f\u0014eDnf\u001a]I\\-\u00166c_z\u0001\u0004v\u001dgAAG.$\"\u0017T}s\u0015q6%:FFSCc\fW\u001ak=M'4t4p>M\u000fdݬZʿ\n۪٢k4,edHTz]c\u001b-PE\u0003*\u0013ʷ~op<^\u007fkGaI-wZ_Iq'vg)`h}\u00179sb_Z\u0005v9=m\u001b\u001fZ\u001fc\u0013\u001a\u0002a/b;}H\b\rgH|\b\\Jsmeʦ\u000bҟm͡Վn\u00165mogi\u0010B@J\u0011H\u0017Jܸ4\u0012G\u000fD<,w48-\u0005\u0019exr\u0012vP\u0019%k\u0017\tG\u0014U=\nV\u000f]\"S3\u000fb !),ذ\u0019\u001aou\u001bW]\u001d~h\u0012ΕI]v?/\u0015:\u0006_\u0013(\u0013\r*D\"2[\"A\\\u001bx#IG.Ja:\u0014\u0010`P6\r_\\;˝sͷW֊ς\u0007\u001eQm\u0011yx\r|\u001b\u0012W5pf-e̼T\u00190$3)txp+? pv)\u0004\u0003]k\u0015n'97m\u0001\u0010o.F\u0015IuesP\u000ef\u000b _ˊ|\u000f1\u0007\u0003v%l\u0007F2Ɔ\\vf\u001aj\u0003\u0017T-_c\u00128z8Q9r5\\)J^S!\u0011:[+)\u000fbM>c\u0002d\u000ba͞HƊy͐Â\u0011YF@\r!S\u0003qm14q:;k\u00115+\u0013J\u0015]\u0019|]nΏ8u\n\u000e2/2D\u0014O_)'\u00103lR7Yb\u000by'bXE754G_-Z\u0004NҮ\u0011Lppf7\u000f'>x\u0003\u0007i\r\u001b\u001fB\u001d9Ai\u0006līuD\u0014~#]\u000bb\\\u000f!'p.;!);\u0014˼YÀ5&\u0012JS\u0005a\t\n\u0012>\u0010\u0003\u0011x~\u0010 Fu\rb\u000bb&AeDc̓\u0019NV6\f\u000eXU\u001b\u0012@\u007f\u001bK!C#Q\u0005\u0007nD$ U\u0010+7>M\u0015\u001duT3Њ r0sT\u000e\u0014\b(p[9gb\u001a\t$'@x'RQߪ+\fQ\u0005B\u007f\f(zi~\t\u000b\u0017\"!\u001d\u000e\u001c̨\u0015f\u0005D\u001f6R\"']d5\u000e4\r R.;MCj}MɫWd-nl[3Mm\u000172#\r;I2\u0003O;e\u0006\u0007\u000bi\u0004t~c&#+A[\u001f|EG\u0013]\u0014%d|+8e:ck\"F$q%}F\b0J(\u0001sO`*Sm3qOP\u001fG\u0016ޭ^կuʒ̑fb0~\u001fm4p`0;\u0015=\u0011I\u0004r3dz0He\u0019C,h-\u0015ř%mp\u000fc\u0017U@g_j\u001eE\u000e\bm[\u0014$(r=>Auv\u007f.|\u001d=/\u0015\u0016\u000e \u0007q[(~&DN`$\u0015<H(8\u000e$G,\u001d/c\f\u000e=P\u0002<7\u0013^Y\u0001\u0005wm#s9т%ϔ\nރzc\r|`1_9q@%¼rDKg8IQ\u0013>;6)H\u0017\u0017?4e{\u0005?\u0006\u0006\fAq;wD`UDxB\u0016-\u001a\nV+\u0007:IWp|p\u0007#|\u000f`YBxt\tn\u0019\u0012A(S\u0014~oM=PNE4\u001f/\u000eޖ5Ң\u001cєЬ\u0013\u0018c~NkC\u001e[#ofC{@ӓ1\u0015l\u001d\u0005\tBCE\t!\u007fBH^`,CCcPu7\u0004da\u0006X`\u0019l927CvL\"^hz&Um5Sq$A$\u0003\u0012\n\u000bGk)i*\u0090Lܓ\bɤQ\u0010\u0010\t\fN\"6#%9Ϻ\n\u000b\fpA(SjtA& uSA?<h1mF\u0004\u0006ZL\u0004\u001al!7CD< .Z\u0018SYX\u0005o@Rj{&\u0019D;VtT3\n 1\u0002jՆ\u0002ۙdũ\u0006[L\b\u001d\u0016CK\u0019H]\u000b\u0015٥ct\"5\u0007\u0014_\u0015[+\u001c\rQ1-*okT;\u0014\u0001\u0010[\u001fuV1\f\u0015z$:@$SZZp\u0013k(\u0015\f\u00128\u0012q{&TW%#\u0014\f\bvR\n|-r0}}f<l\u0005\u001ei)\u0019\u0019ˋ<Ã\u001fݸɠ)\u00108Wlz NjnS>my KYĖx\u0010Q3'n\u001b\u0013a\u0006\u0017[IT\u0016l\fCM'\u0018\\1H&p/{9z|W.\"\u000bKZare\r2t$&QjMN]\rVDUrjzXUŗI߁\bմ̞KoU%)\u0014\u0003}m!1*i\u000f\u001fhkښS\u0005.-BH3,?@$QH&\u0004\u0019\u0004.\u007f\u0012pI0\u0012\u001cWJ9\ny+y(_QWehpy\u0006%wU#\u0014r0^\u0013/RzsY\u0019Lw:εfуa͈۔Ki#\u0015nj'B\u0017&\u000f,J\b\u001e߳.+\r(<NuU\\D\u000f\"ae\u001f\u0012Fa}q\u0005]$\u0019[\b5F\f\u0003;e\u0010\f\"3q\u000b\u0003L7ӪHR\f\"Rh)s\fP7\u07b7;e6\u0014u.\r\t'\u000bD@Pr\u001e\u000f\u000b\u0007Zk\u0015P`r)z&~U`n~#rIh\u0002F3ϲLܩIȃ֭-\u0015\u001f\u0017\u00061M}h\u0001Arq\fRw8ͽ\u007fMs\\ %\tf\u0018+\u0012i[NO\u0018N\u0013-\u0016`!3\u000e\u0007\u000bm8^|qL\u0013zvxMzO}vǫ~\u001ef\u000bGe\u007fOrq{ޤ\u0013dY9\u0017f{\f9~K=%1\u0005\u000eLOl\u0003Ii|3V\bT,iO\u0018O\u0019Q>[qo8αBĠ\u000fӲْm\f>D\u0010\u0007,=lAQ}\u0005#>8\u0018\u0004+i\u000fj\u0004\u0017F07Ò\u001e!o\u0010ZK\\C^\u0001%'D#jZ-\rI\u000b\n\u001c\u0002\u0010.*|0^\u0016\u0011\u001c\u0012^Qٰiy\u001b[MCO$cW\n\u0007}\u007f8VHoHt]\u001aiޅx2>\t\u0014\u0014{$\f|\u0006Lw\u000bHy\u0005P\u000bբgڃ(nY\u0003BV\u0001H1\rlk,I\u0015\t4\u000b^\b\u0004\u0004b,\"u\u0014\u0016AЯ\u000f!_]e}#WKH\u0003(~\u001b9R/z*-&\u0015.mqDq\u0002\u000f\rkzo$\u0002Ҙu>av\f<\u000e\u001e\u0018\u001aZ-RPq,:\u0014Y[\n\u0001\t̻=$;\u0001k\u0018IDZeuf\u000f8\u0016%\t\u0005qǷf9c)72f5\u000e7U+ѭ8M\\9SnYz?V\u000fI]\"mtE&\u0013m\u007f/\u000f\u000b</S\u00165pB4J\u000f)m:ǋ\ftPV)\u000b<TZ\u001e.#\u0006U'gbSS[mji<:i\u001fr#+EE@!4\\-v?ok<BY3\u0003i~+\r@[9\u0019k\\?\tjأ(\u07b9\u0007Ӈi{;0\u0001{VqyFFي3Uxw\u00105p-\u0013\u0010d$mVHs\u001b\fPL8$|VK\"\u000bv\u00152\u001c<~GFli`<d%\u000fT9\u0001|\u001a\u001b\u000f^1\u001ex28E3Qw@Wl>\u0015?2ae\u0006ŅHç^҆٥\u001dx\u0017(m1fE`sS`Y3\u001eوum^FKT\u0010>\u0014D\u00076L7PB\"w'_xAp:oR>S\r&<D9)i\u0017U \u001cWbN\u000f)\u0015P|q\u05cblP^/U\u0013yW~fhKwAk\u0018;:LwW'\u0012qL8_qu\\e,/+\u0005\u0006-4K\tLĕx܂J̚Ǉ4<|Rj=eK&\u001c<F,\r&T\u0006DxB\u0007UB b\u0001\u0007\u0007w8\u0017'\u0002һ\u0016D}0\u0010qg\u0019Q<?9\u001d\"c~\u001bPaI\r52f1fΚ\u001f0Y|QΘ\u0011,\u0012ť*\u001b"}, d2 = {"/k[", "", "\u0019", "$", "", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "/mh", "/r8AX9:P ~", "", "/rB2d<>\\\u0017~", "\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0016{L\u0011\u0017 Eoc", "1nd;g", "", "4ha@g\u0015Hb\u0002\u000f\u0002e\u0016}", Global.BLANK, "", "BqP;f-H`!", "uKY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005L\u00062\u000bG\u0005 `L\u0001\u0016\u0006w5>W\r$Av$w.SDiC\"\u001fq-\u000fJJ1J\b#\u0011SJ5^\u001c\\:\u0019\u0012X\u001d$", "4ha@g\u0015Hb\u0002\u000f\u0002e\u0016}r<N\u0010/\u0003", "4kPA@(I", "", "4kPA@(IA\u0019\u000b\u000b^5z\t", "4kPA@(IB#", "\u0011", "", "2dbA\\5:b\u001d\t\u0004", "uKY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005L\u0005$\r<J'&KvW\u001a\u0001,<Y{/;w\u001f\u00044IEz;\"\u001e2fJ\u000f--^\u007f%VPX5j\u001cSM\u001d\u0010i\u0012X4XZ\u001d()jU3h\u0018;M\t\u0005F\u000b\u0013\u001d\u000e3ytL_e", "4kPA@(IA\u0019\u000b\u000b^5z\t\u001eo", "4na\u0012T*A", "", "/bc6b5", ";`_", ";`_\u001bb;'c \u0006", ";`_\u001bb;'c \u0006ih", ";`_!b", ";`g\u000fl", "", "Ad[2V;H`", ";`g\u000fl\u0016KB\u001c\f\u0005p", ";`g\u000fl\u0016K<)\u0006\u0002", ";`g\u001cY", "uKY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005L\u00062\u000bG\u0005 `L\u0001\u0016\u0006w5>W\r$Av$w.SDiC\"\u001fq-\u000fJJ1J\b#\u0011SJ5^\u001cPG\u001c\u001dV\u001bJ(\u0014\u0005/", "", "", ";`g\u001cY\u0016K<)\u0006\u0002", "uKY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005L\u00062\u000bG\u0005 `L\u0001\u0016\u0006w5>W\r$Av$w.SDiC\"\u001fq-\u000fJJ1J\b#\u0011SJ5^\u001cQG$\u000fa\u000e$", "uKY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005L\u00062\u000bG\u0005 `L\u0001\u0016\u0006w5>W\r$Av$w.SDiC\"\u001fq-\u000fJJ1J\b#\u0011SJ5^\u001cSD\u001e\u000eic", ";`g\u001cY\u001eBb\u001c", "1n\\=T9:b#\f", "\u001aiPCTuNb\u001d\u0006D<6\u0005\u0014+r{7\u0006MV", "\u001aj^A_0G\u001dv\t\u0003i(\n\u0005>o\r}", "uKY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005L\u0005$\r<J'&KvW\u001a\u0001-@U\u000b\u001cFw#\u00044IEz;\"\u001e2fJ\u000f--^\u007f%VPX5j\u001cSM\u001d\u0010i\u0012X4XZ\u001d()jU3h\u000f(R\u0004\u0005R}\u0011\u0016\fD@", ";`g\u001cY\u001eBb\u001ch\bG<\u0004\u0010", ";`g$\\;A", ";`g$\\;A=&m}k6\u000f", ";`g$\\;A=&g\u000be3", ";h]\u000fl", ";h]\u000fl\u0016KB\u001c\f\u0005p", ";h]\u000fl\u0016K<)\u0006\u0002", ";h]\u001cY", ";h]\u001cY\u0016K<)\u0006\u0002", ";h]\u001cY\u001eBb\u001c", ";h]\u001cY\u001eBb\u001ch\bG<\u0004\u0010", ";h]$\\;A", ";h]$\\;A=&m}k6\u000f", ";h]$\\;A=&g\u000be3", "<n]2", "=m4.V/", "\u001b", "uKY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005L\u00062\u000bG\u0005 `L\u0001\u0016\u0006w5>W\r$Av$w.SDiC\"\u001fq-\u000fJJ1J\b#\u0011\\]0c\u001cZ9\u001fg", "=m4.V/\"\\\u0018~\u000e^+", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "7mS2k", "uKY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005L\u00062\u000bG\u0005 `L\u0001\u0016\u0006w5>W\r$Av$w.SDiC\"\u001fq.\u000fJJ1J\b#\u0011\\]0c\u001cZ9\u001fg", "Bn;6f;", "\u001aj^A_0G\u001d\u0004z~k\u0002", "9nc9\\5\u0006a(}\u0002b)"}, k = 5, mv = {1, 9, 0}, pn = "", xi = 49, xs = ">AE<8<{/:65-*:.315o\r .0\u0007/")
public class MapsKt___MapsKt extends MapsKt___MapsJvmKt {
    public static final <K, V> boolean all(Map<? extends K, ? extends V> map, Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        if (map.isEmpty()) {
            return true;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (!predicate.invoke(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <K, V> boolean any(Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return !map.isEmpty();
    }

    public static final <K, V> boolean any(Map<? extends K, ? extends V> map, Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        if (map.isEmpty()) {
            return false;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (predicate.invoke(it.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    private static final <K, V> Iterable<Map.Entry<K, V>> asIterable(Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.entrySet();
    }

    public static final <K, V> Sequence<Map.Entry<K, V>> asSequence(Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return CollectionsKt.asSequence(map.entrySet());
    }

    private static final <K, V> int count(Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.size();
    }

    public static final <K, V> int count(Map<? extends K, ? extends V> map, Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i2 = 0;
        if (map.isEmpty()) {
            return 0;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (predicate.invoke(it.next()).booleanValue()) {
                i2++;
            }
        }
        return i2;
    }

    private static final <K, V, R> R firstNotNullOf(Map<? extends K, ? extends V> map, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        R rInvoke;
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                rInvoke = null;
                break;
            }
            rInvoke = transform.invoke(it.next());
            if (rInvoke != null) {
                break;
            }
        }
        if (rInvoke != null) {
            return rInvoke;
        }
        throw new NoSuchElementException("No element of the map was transformed to a non-null value.");
    }

    private static final <K, V, R> R firstNotNullOfOrNull(Map<? extends K, ? extends V> map, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            R rInvoke = transform.invoke(it.next());
            if (rInvoke != null) {
                return rInvoke;
            }
        }
        return null;
    }

    public static final <K, V, R> List<R> flatMap(Map<? extends K, ? extends V> map, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, transform.invoke(it.next()));
        }
        return arrayList;
    }

    public static final <K, V, R> List<R> flatMapSequence(Map<? extends K, ? extends V> map, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends Sequence<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, transform.invoke(it.next()));
        }
        return arrayList;
    }

    public static final <K, V, R, C extends Collection<? super R>> C flatMapSequenceTo(Map<? extends K, ? extends V> map, C destination, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends Sequence<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(destination, transform.invoke(it.next()));
        }
        return destination;
    }

    public static final <K, V, R, C extends Collection<? super R>> C flatMapTo(Map<? extends K, ? extends V> map, C destination, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(destination, transform.invoke(it.next()));
        }
        return destination;
    }

    public static final <K, V> void forEach(Map<? extends K, ? extends V> map, Function1<? super Map.Entry<? extends K, ? extends V>, Unit> action) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            action.invoke(it.next());
        }
    }

    public static final <K, V, R> List<R> map(Map<? extends K, ? extends V> map, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(map.size());
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(transform.invoke(it.next()));
        }
        return arrayList;
    }

    public static final <K, V, R> List<R> mapNotNull(Map<? extends K, ? extends V> map, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            R rInvoke = transform.invoke(it.next());
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
        }
        return arrayList;
    }

    public static final <K, V, R, C extends Collection<? super R>> C mapNotNullTo(Map<? extends K, ? extends V> map, C destination, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            R rInvoke = transform.invoke(it.next());
            if (rInvoke != null) {
                destination.add(rInvoke);
            }
        }
        return destination;
    }

    public static final <K, V, R, C extends Collection<? super R>> C mapTo(Map<? extends K, ? extends V> map, C destination, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            destination.add(transform.invoke(it.next()));
        }
        return destination;
    }

    private static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> maxByOrNull(Map<? extends K, ? extends V> map, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        Map.Entry<K, V> entry;
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            entry = (Object) it.next();
            if (it.hasNext()) {
                R rInvoke = selector.invoke(entry);
                do {
                    Map.Entry<K, V> entry2 = (Object) it.next();
                    R rInvoke2 = selector.invoke(entry2);
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        entry = entry2;
                        rInvoke = rInvoke2;
                    }
                } while (it.hasNext());
            }
        } else {
            entry = null;
        }
        return entry;
    }

    private static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> maxByOrThrow(Map<? extends K, ? extends V> map, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Map.Entry<K, V> entry = (Object) it.next();
        if (it.hasNext()) {
            R rInvoke = selector.invoke(entry);
            do {
                Map.Entry<K, V> entry2 = (Object) it.next();
                R rInvoke2 = selector.invoke(entry2);
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    entry = entry2;
                    rInvoke = rInvoke2;
                }
            } while (it.hasNext());
        }
        return entry;
    }

    private static final <K, V> double maxOf(Map<? extends K, ? extends V> map, Function1<? super Map.Entry<? extends K, ? extends V>, Double> selector) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke((Object) it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke((Object) it.next()).doubleValue());
        }
        return dDoubleValue;
    }

    /* JADX INFO: renamed from: maxOf, reason: collision with other method in class */
    private static final <K, V> float m9427maxOf(Map<? extends K, ? extends V> map, Function1<? super Map.Entry<? extends K, ? extends V>, Float> selector) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke((Object) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke((Object) it.next()).floatValue());
        }
        return fFloatValue;
    }

    /* JADX INFO: renamed from: maxOf, reason: collision with other method in class */
    private static final <K, V, R extends Comparable<? super R>> R m9428maxOf(Map<? extends K, ? extends V> map, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke((Object) it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke((Object) it.next());
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    private static final <K, V, R extends Comparable<? super R>> R maxOfOrNull(Map<? extends K, ? extends V> map, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = selector.invoke((Object) it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke((Object) it.next());
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    /* JADX INFO: renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final <K, V> Double m9429maxOfOrNull(Map<? extends K, ? extends V> map, Function1<? super Map.Entry<? extends K, ? extends V>, Double> selector) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = selector.invoke((Object) it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke((Object) it.next()).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    /* JADX INFO: renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final <K, V> Float m9430maxOfOrNull(Map<? extends K, ? extends V> map, Function1<? super Map.Entry<? extends K, ? extends V>, Float> selector) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = selector.invoke((Object) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke((Object) it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    private static final <K, V, R> R maxOfWith(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke((Object) it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke((Object) it.next());
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    private static final <K, V, R> R maxOfWithOrNull(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = selector.invoke((Object) it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke((Object) it.next());
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    private static final <K, V> Map.Entry<K, V> maxWithOrNull(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return (Map.Entry) CollectionsKt.maxWithOrNull(map.entrySet(), comparator);
    }

    private static final <K, V> Map.Entry<K, V> maxWithOrThrow(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return (Map.Entry) CollectionsKt.maxWithOrThrow(map.entrySet(), comparator);
    }

    private static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> minByOrNull(Map<? extends K, ? extends V> map, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        Map.Entry<K, V> entry;
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            entry = (Object) it.next();
            if (it.hasNext()) {
                R rInvoke = selector.invoke(entry);
                do {
                    Map.Entry<K, V> entry2 = (Object) it.next();
                    R rInvoke2 = selector.invoke(entry2);
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        entry = entry2;
                        rInvoke = rInvoke2;
                    }
                } while (it.hasNext());
            }
        } else {
            entry = null;
        }
        return entry;
    }

    private static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> minByOrThrow(Map<? extends K, ? extends V> map, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Map.Entry<K, V> entry = (Object) it.next();
        if (it.hasNext()) {
            R rInvoke = selector.invoke(entry);
            do {
                Map.Entry<K, V> entry2 = (Object) it.next();
                R rInvoke2 = selector.invoke(entry2);
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    entry = entry2;
                    rInvoke = rInvoke2;
                }
            } while (it.hasNext());
        }
        return entry;
    }

    private static final <K, V> double minOf(Map<? extends K, ? extends V> map, Function1<? super Map.Entry<? extends K, ? extends V>, Double> selector) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke((Object) it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke((Object) it.next()).doubleValue());
        }
        return dDoubleValue;
    }

    /* JADX INFO: renamed from: minOf, reason: collision with other method in class */
    private static final <K, V> float m9431minOf(Map<? extends K, ? extends V> map, Function1<? super Map.Entry<? extends K, ? extends V>, Float> selector) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke((Object) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke((Object) it.next()).floatValue());
        }
        return fFloatValue;
    }

    /* JADX INFO: renamed from: minOf, reason: collision with other method in class */
    private static final <K, V, R extends Comparable<? super R>> R m9432minOf(Map<? extends K, ? extends V> map, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke((Object) it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke((Object) it.next());
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    private static final <K, V, R extends Comparable<? super R>> R minOfOrNull(Map<? extends K, ? extends V> map, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = selector.invoke((Object) it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke((Object) it.next());
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    /* JADX INFO: renamed from: minOfOrNull, reason: collision with other method in class */
    private static final <K, V> Double m9433minOfOrNull(Map<? extends K, ? extends V> map, Function1<? super Map.Entry<? extends K, ? extends V>, Double> selector) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = selector.invoke((Object) it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke((Object) it.next()).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    /* JADX INFO: renamed from: minOfOrNull, reason: collision with other method in class */
    private static final <K, V> Float m9434minOfOrNull(Map<? extends K, ? extends V> map, Function1<? super Map.Entry<? extends K, ? extends V>, Float> selector) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = selector.invoke((Object) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke((Object) it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    private static final <K, V, R> R minOfWith(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke((Object) it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke((Object) it.next());
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    private static final <K, V, R> R minOfWithOrNull(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = selector.invoke((Object) it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke((Object) it.next());
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    private static final <K, V> Map.Entry<K, V> minWithOrNull(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return (Map.Entry) CollectionsKt.minWithOrNull(map.entrySet(), comparator);
    }

    private static final <K, V> Map.Entry<K, V> minWithOrThrow(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return (Map.Entry) CollectionsKt.minWithOrThrow(map.entrySet(), comparator);
    }

    public static final <K, V> boolean none(Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.isEmpty();
    }

    public static final <K, V> boolean none(Map<? extends K, ? extends V> map, Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        if (map.isEmpty()) {
            return true;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (predicate.invoke(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <K, V, M extends Map<? extends K, ? extends V>> M onEach(M m2, Function1<? super Map.Entry<? extends K, ? extends V>, Unit> action) {
        Intrinsics.checkNotNullParameter(m2, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        Iterator<Map.Entry<K, V>> it = m2.entrySet().iterator();
        while (it.hasNext()) {
            action.invoke(it.next());
        }
        return m2;
    }

    public static final <K, V, M extends Map<? extends K, ? extends V>> M onEachIndexed(M m2, Function2<? super Integer, ? super Map.Entry<? extends K, ? extends V>, Unit> action) {
        Intrinsics.checkNotNullParameter(m2, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        Iterator<T> it = m2.entrySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Architecture architecture = (Object) it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            action.invoke(Integer.valueOf(i2), architecture);
            i2 = i3;
        }
        return m2;
    }

    public static final <K, V> List<Pair<K, V>> toList(Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        if (map.size() == 0) {
            return CollectionsKt.emptyList();
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return CollectionsKt.emptyList();
        }
        Map.Entry<? extends K, ? extends V> next = it.next();
        if (!it.hasNext()) {
            return CollectionsKt.listOf(new Pair(next.getKey(), next.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new Pair(next.getKey(), next.getValue()));
        do {
            Map.Entry<? extends K, ? extends V> next2 = it.next();
            arrayList.add(new Pair(next2.getKey(), next2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }
}
