package kotlin.io.path;

import androidx.exifinterface.media.ExifInterface;
import androidx.webkit.ProxyConfig;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.IOException;
import java.net.URI;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileStore;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.UserPrincipal;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;
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
@Metadata(bv = {}, d1 = {"Яœ\u0014D߬)\u001ew\fLDyt\fA\fE\u0013.P\u000e*,\u0018z\u000ff\u000198DkM6Ra)\u0017ӆ\u00044:[,ڎK;k\u001a\u0006̝\u0011Odgon`Z\u0013C\u001d\u0006\u001ex\u0001,QU~`\u001a\u000fHBw?9Mw=Gi|6\u000b+:\"Ny\r\u0001 +P\u0010\rzKK\u0012\u00138@~AZ҈U\u00050\u0012\u000e>&\u0003&\\uޮ>Hr^B/9\u0003qBT'g0\u0013M\u0015FZ'\u0015vo>3@M5\u001d%Y\u000b\u000fRi]\u000b?w?\rh='3ɞ{WDz\b\u0014\u001b5W\rsr.\\\u000bRh\f=+WcQR\u0016(\u0006\u0001\u0004\rB\u0004\u0016\u0006=H6- f \u001dA\t\u000bSnP2bP\u0015\u0013ad\u0016kĶ9Ca)ziai\u0019~;\n\u001b%\u001eQ\u007f\u001f1ik&h%\u001fZva1\u007f?k`n\n\b<4ՖvĊ\u0006*\u0012I_==\u0016).E%gaG>9m\u0018Grg'\rfha\u0006jJV!\u001d\u0015gB\u0017)rPt\rqOd\\<\u0011S\u001d\u0003%, 3$lwB\"S.\u0015TŹmj[|\"Y=\u0001OY\u001dk>_?^AQie&`\u0001uDWJ\u007f\u001ddvJY\u000bj`8\"8I\u0019.&\u0014dR\u001c\u00138@ :zρ7Ǭ`\u0015V#6\fO\u001e!_\th@\u0005bN<\u0005\u007f##\t1Xbp}\u0004\u0011KB{\u000f!]IW5'Hm$~3+\"7\u0017\u0002\u001d_s\\ORk&ye{&\u0017HW\u007fG]\u0017\u001f~/30K\fQȌiQ[5?;\u000b\u001b';\u0017.\u0018\u0010pp:|\u0003LeSE!'fx#\u0016\u0007\u0018{wE)F\u0014l\u0019xVU\u0003\u000b_;^<\r\u0005%\u001fS\u001f\u001e:\u001d9=C-\u001eD\u0016Zٴ\u001b˸ai}R\u0012|\u001dK\re2R\u0014\u001a}wi]`;hQg&V&4l\tCv\u0013>\u0007Z;B6KNQf\u0001VfM9Y.{\u0015W%\u0002f]J\u0013\u001e+D0o*\"q,@ڎG%\u0017|\u001alƝmSd\u0011P\u000e\u001a\u000b\n0\r\u00114H.\u0007ob70.sF6\bݭh\u001dG\u0017UL,j\u00073C\u0003iLؓ\u0001\u0018rmA/2pscV<T)`d{\u001d`s`Q:\u000f3';.|;0\u0015mt\n]{R\u0001\u0002ROƍpˍ\u0003f3a\\qGM@X/\u000bm]qI2:\u0012zAm\u001ao<>\u001e|+y0\u001bg\nW٫|H\u000b\u0019\u000f|N\u0013v:f\u0001NRA\r\u0018\u0015\u001aL\u0012\u0015\n)S\u0003oh.zl&Oc\u001e\u0011\u0017J*5*CݵLɴ1\u0006CgUuxO?{\u0006Sc}6 P?\u0012\u00129hg\u0016l\tm\u001fJ\u0016w\u0017\u0011 7+p$\u0014.Pu!(tĂ<с\u00063\u0010Mv\u0006y49@U+\u0015\u0006pK\u0019\u0011\u0018\u0001\u0005o~]\u0011\u0002v5fyt.~;7?m2#X`;?qfǍ\u0017\u05ca\u0018\u00154YN\u001bpf(O\u0012h\u0019k}[=/=\u001fBa_0\u0019ʼ\u00047%\u0004BBTV\u0015cV{>\u0015!j\nZc\u001efp'tx\u001c)\u001a}-f\r)38Vr$e]U_$˝\u0011GnA\u001cyWe91\u0001?C7`\u000b ,\u0005D\u001b:\u0011t0BP&\u000b\fw43EdA*'_%\u001c\u00031>kIHB\u000e-?,W˗`ߣ$>jZ4F_tY\u0019?/=84oMؚ;\u0003\\agB\u0001+95?(12§yO\u00061r'oIW\u000f;S5\u0016P5P\u001aex~\u0014ޗ^'t:\rMELy}@.\nO(2J\u000e#.Dw\u06022w\u0001N\u001c\fW2^R6\u001dDSWz-\f\u0012<m\u001ert[\u0010zo\u00134\u0019r\u0005p˽rخIMvA#t\u001b\u000e,7UOI;\u001dτ\u001e\u0019\b?SI!\u0018W\\\f<C\u0004\u0012nJiF}M?i*4s@l\u0004j\u00194\u0018̡\u0016١\u0016\r\u001bO\u0010c`-\u0018b3\u0017m\u0015\u0017N<˧\u0007\u0017Wa3@=n\u0007.p\f;\u0016$b`\u001f\u0012\u0002P_%\u0013a\u000e\"Yg\u0012\u0005Bg͠\u0017ئ)\u000633\u0003RM#\nXk\b[\u000b\u001cJ\u001fˊkt\u0010cpcdYe(jY.\u000eݒD2VfW&E\u0013v8D'DXs60>#\u0017Zq\\1,-\u0011m!u\u0001Bbe[t\u0013;7\u0006\u001d\u0001\u0002iْ~Ç\u0002ްYG!_6UO1QI51l{8`W,\u0015mw\u000f3qXUG\u000eO3GJ|V\u0014\u0006Go_~:fmՉ\fڃ(buj\u0002208\u001bLd0QHyYAvP\u001f'\u0003\u0005\u00104\u000bHU4\u00044)\u0003\u001cc\u0002&ޖ2ɋt\tU*\u0003\"8A\bh\u000bX{\"SuG>a\u0002\u001f\u0018gg$rW[h>E\u001eTX3\u0002Hclɇ\u0002ž-0%3{\u0018xRlf![Dk^E(R\u000fdlcnLV!1n_\u0002!PTb7'\u001f`a\u0010\u00113rȷ<ƕn\u0019\u000fbc\u0006%vOD%[\u00103h\"\u00122a\u0012=OZ\n\u0014iqwCB\fKV\r\u001erCϷ\u000bâjr\u00124\u001dX>g\u0004/`~\u0003@J-!°s\u0001\u00138r$|3d\u0017S\u0001Q<ؽx|\n1\u00042A\u0006qo!A\u0003_ۅ\u000eJqfa\u0007X\u000b]V{4\u001fBR\ni\u0005I\u0004\u007f9V\u0002Ob$LA\u001ei&fS܆\u0018˲gJ1\u0017\u0002u\u001fEFM&?\u0002<\bA2\u000e0m<\bC'H؞:b=0\f\u0019\u000fdPrf\u001dxkߗk$:\u0003_&2\u001cv\u001cf\fgz߮Cmw\r0E5\u0002\n[I\u001c~Y36ID:\u007fRsui\u0010l\u0016`\u00066\tI<\u0002MsBEw0bbkj\u007fU6,jy.Jjt#\u0005~`e\u0016<&\rB:l\fI#nZ&θmճ?\t~SOnSQ#D?(\t2l\u0012?Lf\u001a&\u001b0\u0005{j \u0016G|\u0011@yM\"߶m{u0U`kVg2wD6M\u0010Cm%{`b;fn\t\u0004i<?\u000fO68v\u07b5Mʗ^ =# >XUdPS1't4֖\u0005b->=\u0002X6J\u001dqeIw\u0013j\u0005CmlYc\u000b\u001e\u001d\"\n?P}4gYԻ%י\u0012$\u0016q\r\u0016B>\u000e\u000fPJ#\fHB>\f$\u0007{K3\u000b84Y?\u0002pI/\u0006|vB3\fU16?00qp\u0019n%(P\nA\u000f;m7VbЬ+ï1Q\u0005n2=\u001e\u0015m\u0010m\n;b\rwF̋OHB\u0002~eL\u001c}Vj\u001ej(b\u001ee\n<\f~>;]<\u001e\u001dj=*a\u000bDO[VDG\u0012,5B$`\f553nvu\bv\u0001b:`bne\\NKC#/&G\u0006!Yk$,>\bUnd=f'TQhvtlh-\u000e?\u0017\u001c\bad`qiY\bU\u0004<P&0a$$\u0014R;dp-H|&ԑ(л@\u001b\u0002+\u0017*\u001f<\u0003t2/n\u0011!\t!5@Cw\\M\u0006%؆v\u0004\r=MjA{nW\u001aE&heE\u001dcePx\fӚCa>#\u000b7j:t+\u001dcq\rh89\u001a\f4\u0016R~dQqJ\u0005آ\"L!\u0003߸a\u00024\\B\u000bPXͽ\u0011,Ĕ-o6rݫ`L~\u0001\u0381\u0019\"aO܄\u001b՝\"U\u000bI*3RJQA?{G\u0004u\r&\u001dޖ<\u0002[@U\u0006\u0002\u000e\u001eBqnw!ߕjFH\u0010\u0019oܟH_^HғVЊnհ݁M\u0013ZĂA*D@ě\u001d\u0018\u001b\u0005\u0015q4vu\rAzҀCA\u0004\u001ehFml\f{o\u00076\f6+Ԃi\u0017t%ŴeCF\u001d\u0012$Պ}Tm\u0014=,+;rTƼRKa*\u0006{j=HG:j4PǏ\u001e#\u001fXŴ\u001f;\u0012UgBѰ7dxt\u0007uv\u0013Y:+r*\u001d.\u001f\u001d`<h\u0001\ftggݨwTfh8eլW/Xn=\u0015\u001bq@Dj^vO;ρ\n+Q-U#S0Q[Ț:_G\b\b\bXz<F(Un%n\u00159\u001dͯJ\u0019.G@\u0006اZ'/ӽ\b\u00046ؿC@B λ%>k\u001d\u001f\u0014d';O.ƌfّvT*\u0017qQ\u00179*GCFcd{\u000fI*vJ:\u0010M&]\tPըgC˭vڲrn\u001cS?c>3hd\u0010p_q0\u0017\u000b$L\u0016PX:AD\u001b\u001fe\u0010ܴi°7?\u0014\u0010VY}\u0001IZzu{fx0@\u000e6Chw0j\u0007dO@/ʀd֯/i>H\u001f\u001c0/Bh}]7=@~v\u000f\u000er\bd>^Urm\"UǿqƗIpWGSt.wj|\"ibp/\b\u0007e]<\u0013uj,pL-¯\fbàh\u058c#D[{.~6GAr+opN˅Q\u0016\u0019v`ٙT-_ʅBǿr"}, d2 = {"3wc2a:B]\"", "", "\u001aiPCTuGW#H{b3|R\u001aa\u000f+Q", "5dc\u0012k;>\\'\u0003\u0005gjx\u00128o\u000f$\u000bD\u000b %", "uKY.i(\b\\\u001d\tD_0\u0004\txP{7~\u0016D\b", "5dc\u0012k;>\\'\u0003\u0005g", "uKY.i(\b\\\u001d\tD_0\u0004\txP{7~\u0016D}\u001cC\u0001\n\u0006}!>[G\u000eFz\u001a7O\u0019", "7me.e0:\\(lzi(\n\u0005>o\r6f<\u0010\u001a", "5dc\u0016a=:`\u001dz\u0004m\u001a|\u0014+r{7\u0006M\u000f\u0002\u0013VrL8\u007f.?hy/;w\u001f<", "5dc\u0016a=:`\u001dz\u0004m\u001a|\u0014+r{7\u0006M\u000f\u0002\u0013Vr", "7me.e0:\\(lzi(\n\u0005>o\r6f<\u0010\u001a\u0005V|\u0012Ex", "5dc\u0016a=:`\u001dz\u0004m\u001a|\u0014+r{7\u0006M\u000f\u0002\u0013Vr{K\u0004)>[<\u001c@v =IR?u=,", "5dc\u0016a=:`\u001dz\u0004m\u001a|\u0014+r{7\u0006M\u000f\u0002\u0013Vr{K\u0004)>[", "<`\\2", "5dc\u001bT4>\u0012\u0015\b\u0004h;x\u00183o\t6", "5dc\u001bT4>", "<`\\2J0MV#\u000f\n>?\f\t8s\u00042\u0005", "5dc\u001bT4>E\u001d\u000e}h<\fhBt\u007f1\nD\u000b UCx\u0017F\u0006!D]\b)E", "5dc\u001bT4>E\u001d\u000e}h<\fhBt\u007f1\nD\u000b ", ">`c5F;KW\"\u0001", "5dc\u001dT;AA(\f~g.;\u00058n\n7wO\u0005! U", "5dc\u001dT;AA(\f~g.", "\u001e`c5", ">`c5", "0`b2", "AtQ=T;Aa", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}q'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u0004\u0011*@gE\u001a^qeCPd0Uvp2H]/2", "1qT.g,-S!\nYb9|\u0007>o\r<", "2ha2V;H`-", ">qT3\\?", "/sc?\\)Nb\u0019\r", "\u001aiPCTuGW#H{b3|R+t\u000f5\u007f=\u0011&\u0017\u0011P\u0012Cv\u0001Dh\u000b$4}%.#", "uKY.i(\b\\\u001d\tD_0\u0004\txP{7~\u0016g\u001c\u0013XkWCr.7#k/Dq\u001f0#9\"p0/\u00112j=\u0011--R}'\u0011H];iVoM#\u0012$nR2\r`hP1rAG.\b\u0002\rh@d\u0012\b_\u00179t:CZ\u0017GC\u007fqP,>", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}q'\u0006\u0013(C9\u0017@\u0001n6]\u0005 \u0001i%=ZG8{C\u001e^Ie@\u0007?;]\u0004+D\\],2\u0016YB\u0010#VWW/\u0017NZE+n\u000e\"\u001b\u0017/\u001f", "1qT.g,-S!\n[b3|", "AtU3\\?", "uKY.i(\b\\\u001d\tD_0\u0004\txP{7~\u0016g\u001c\u0013XkWCr.7#k/Dq\u001f0#*@gE\u001a^o]B\t-\u001a]\u0004+PN$\"CWnN\u0010[c\u0012Xt\u000e\t`AmjSF,\f)Y\u0011;2a\u0010\u001d\u000e\u0011y\u007fOZ\rW\t\u0015K\u0005\u0010mBj[CPEO,+h\u0013_fG6I'i", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok$4H7|0g\u001elk\u0003\bg3N@#V[[0Yb\u0002=]r^\u0015N\u0007\u001c\u0014fE!~S7tK\u0013N}LdJ\u0015\u001a\u0018~ktIVY2u$x\u0017", "4h[24;M`\u001d{\u000bm,m\r/wh2\u000b\u001c\u0012\u0013\u001bNk\u000bCv", "", "/sc?\\)Nb\u0019o~^>Z\u0010+s\u000e", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "4h[2I0LW(\t\b", "\u001aiPCTuGW#H{b3|R\u0010i\u0007(lD\u000f\u001b&Q|c", "0tX9W,K/\u0017\u000e~h5", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001d\u001d\tDi(\f\fxF\u0004/{1\u0005%\u001bVy\u001b\u0019\u0007)<X}-\r", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "/ab<_<MS", "/ab<_<MS\u0004z\na\u001a\f\u00163n\u0002", "1n_FG6", "B`a4X;", "=oc6b5L", "\u001aiPCTuGW#H{b3|R\ro\u000b<eK\u0010\u001b!PE", "uKY.i(\b\\\u001d\tD_0\u0004\txP{7~\u0016g\u001c\u0013XkWEz/~Z\u0002'77\u0001*\\F\u0011a\u001b#\u0011y]\u0003\u0010g6\u0018w+NL\u0018\nf]\u0007'\u001f!^\u0018W\u0001Pk^=5j\u000e@#\u0012uJ\u0006BhJv\u0012\u001d8@", "=uT?j9Bb\u0019", "", "1qT.g,\u001dW&~xm6\n\r/s", "uKY.i(\b\\\u001d\tD_0\u0004\txP{7~\u0016v}\u001cC\u0001\n\u0006\u007f)?#~$>m_*\\RHo1.$h+\u001a\u000bj,*\u00066TPK<kRH\u0001z\u0017V\u001fJt\u0016\tc\u000b%rK7hr(X\u0005\u0011", "1qT.g,\u001dW&~xm6\n\u001d", "1qT.g,\u001fW ~", "1qT.g,%W\"\u0005eh0\u0006\u00183n\u0002\u0017\u0006", "1qT.g,)O&~\u0004m\u000b\u0001\u0016/c\u000f2\tD\u0001%", "1qT.g,,g!{\u0005e0zo3n\u0006\u0013\u0006D\n&\u001bPq|F", "uKY.i(\b\\\u001d\tD_0\u0004\txP{7~\u0016g\u001c\u0013XkWEz/~Z\u0002'77\u0001*\\F\u0011a\u001b#\u0011y]\u0003\u0010g6\u0018w+NL\u0018(ka\u007fA\u0011\"i\u000e\u0018\f\u0011\fY\u001d3}Q;\u001c\u0018;IW~O\u0006\b'\n~stL \u0011K\u0001\u0015?,%wI/", "2d[2g,\u001ef\u001d\r\nb5~", "2d[2g,\"Tx\u0012~l;\u000b", "2he", "=sW2e", "3wX@g:", "\u001aiPCTuGW#H{b3|R\u0016i\t.eK\u0010\u001b!PE", "uKY.i(\b\\\u001d\tD_0\u0004\txP{7~\u0016v}\u001cC\u0001\n\u0006\u007f)?#~$>m_\u0015QLAU?-\u0019rj\u000fJX", "4h[24;M`\u001d{\u000bm,\u000by3e\u0012", "$", "\u001aiPCTuGW#H{b3|R+t\u000f5\u007f=\u0011&\u0017\u0011P\u0012Cv\u0001Dh\u000b$4}%.>G;}\n", "uKY.i(\b\\\u001d\tD_0\u0004\txP{7~\u0016v}\u001cC\u0001\n\u0006\u007f)?#~$>m_\u0015QLAU?-\u0019rj\u000fJJ1J\b#\u0011UR6&SvD\u0014[V\u001d]8\u0011\u0002iP$8%;&\b\bX\u0011Hl}\u001c%\u000e&npT,", "4h[24;M`\u001d{\u000bm,\u000by3e\u0012\u0012\t)\u0011\u001e\u001e", "4h[2F0SS", "", "4h[2F;H`\u0019", "\u001aiPCTuGW#H{b3|R\u0010i\u0007(iO\u000b$\u0017\u001d", "4na\u0012T*A2\u001d\fz\\;\u0007\u0016CE\t7\tT", "5k^/", "/bc6b5", "5dc\u000eg;KW\u0016\u000f\n^", "", "/sc?\\)Nb\u0019", "uKY.i(\b\\\u001d\tD_0\u0004\txP{7~\u0016g\u001c\u0013XkWCr.7#k/Dq\u001f0#9\"p0/\u00112j=\u0011--R}'\u00113R5b<}L\u0018\u001ccc\u0012\u0012\u0012\u0001j=mu@@!Q\u0016F\u0007;f\u0010a", "5dc\u0019T:M;#}~_0|\b\u001ei\b(", "\u001aiPCTuGW#H{b3|R+t\u000f5\u007f=\u0011&\u0017\u0011P\u0012Cv\u00149a}u", "uKY.i(\b\\\u001d\tD_0\u0004\txP{7~\u0016v}\u001cC\u0001\n\u0006\u007f)?#~$>m_\u0015QLAU?-\u0019rj\u000fJJ1J\b#\u0011UR6&SvD\u0014[V\u001d]8\u0011\u0002iP$8%;&\b\u001bM\n;>", "5dc\u001cj5>`", "\u001aiPCTuGW#H{b3|R+t\u000f5\u007f=\u0011&\u0017\u0011_\u001c<\u0004\u0010B]\u0007\u001e;x\u00125#", "uKY.i(\b\\\u001d\tD_0\u0004\txP{7~\u0016v}\u001cC\u0001\n\u0006\u007f)?#~$>m_\u0015QLAU?-\u0019rj\u000fJJ1J\b#\u0011UR6&SvD\u0014[V\u001d]8\u0011\u0002iP$84E\u001f\u0015\u0017V\u0006Df\u0005\u0017\u0012\u0015\u000b", "5dc\u001db:Bfy\u0003\u0002^\u0017|\u00167i\u000e6\u007fJ\n%", "", "\u001aiPCTuGW#H{b3|R+t\u000f5\u007f=\u0011&\u0017\u0011Z\u0018Jz8\u0016]\u0005 \"m#6QQIo>'j", "uKY.i(\b\\\u001d\tD_0\u0004\txP{7~\u0016v}\u001cC\u0001\n\u0006\u007f)?#~$>m_\u0015QLAU?-\u0019rj\u000fJJ1J\b#\u0011\\]0c\u001c`=#g", "7r36e,<b#\f\u000f", "7r4EX*Nb\u0015{\u0002^", "7r76W+>\\", "7rA2T+:P ~", "7rA2Z<EO&_~e,", "7rB.`,\u001fW ~Vl", "7rBF`)HZ\u001d|ab5\u0003", "7rF?\\;:P ~", ":hbA70KS\u0017\u000e\u0005k@\\\u0012>r\u0004(\n", "", ";ne2G6", "<nc\u0012k0Lb'", "@dP14;M`\u001d{\u000bm,\u000b", "\u000f", "\u001aiPCTuGW#H{b3|R+t\u000f5\u007f=\u0011&\u0017\u0011L\nJz#\u0016]\u0005 \u0013|%;Q@Kz4,j", "uKY.i(\b\\\u001d\tD_0\u0004\txP{7~\u0016v}\u001cC\u0001\n\u0006\u007f)?#~$>m_\u0015QLAU?-\u0019rj\u000fJJ1J\b#\u0011UR6&SvD\u0014[V\u001d]8\u0011\u0002iP$8!3-\f**\u0006Bh\\\u001b%\u001b9g\u0001QV\u001e\u001d", "", "uKY.i(\b\\\u001d\tD_0\u0004\txP{7~\u0016g\u001c\u0013XkWCr.7#k/Dq\u001f0#9\"p0/\u00112j=\u0011--R}'\u00113R5b<}L\u0018\u001ccc\u0012\u0012\u0012\u0001j=m~S;&Q\u0014E\r\u0011", "@dP1F@FP#\u0006~\\\u0013\u0001\u00125", "@d[.g0OS\b\t", "@d[.g0OS\b\tdk\u0015\r\u00106", "@d[.g0OS\b\tdk\u001a|\u00100", "Adc\u000eg;KW\u0016\u000f\n^", "D`[BX", "uKY.i(\b\\\u001d\tD_0\u0004\txP{7~\u0016g\u001c\u0013XkWCr.7#k/Dq\u001f0#*@gE\u001a^o]B\t-\u0016K{'E[$\"CWnN\u0010[c\u0012Xt\u000e\t`AmUH@%q7X\u0006EqVO|\u00131{l\f_\u0014QC\u0016yH)21Un|\u001d", "Adc\u0019T:M;#}~_0|\b\u001ei\b(", "Adc\u001cj5>`", "Adc\u001db:Bfy\u0003\u0002^\u0017|\u00167i\u000e6\u007fJ\n%", "Bn?.g/", "\u001aiPCTuGS(HjK\u0010R", "CrT\u0011\\9>Q(\t\br\f\u0006\u0018<i\u007f6", "\"", "0k^0^", "\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0016{L\u0011\u0017 Eoc", "uKY.i(\b\\\u001d\tD_0\u0004\txP{7~\u0016g\u001c\u0013XkWCr.7#k/Dq\u001f0#*AuC%\u0019q+>\u0018kuO\u00070E[R6e`<\u001e$\u001bX\u001dR5\u0016P/\u0005\u000bs@H\u001bQ3E\u000b=2j\t\u001b\u000e3yF", "Dhb6g\rBZ\u0019m\b^,", "Dhb6g6K", ";`g\u0011X7MV", "", "4n[9b>%W\"\u0005\t", "E`[8", "\u001aj^A_0G\u001d\u001d\tDi(\f\fxP{7~2|\u001e\u001d1z\u001d@\u0001.\u000b", "uKY.i(\b\\\u001d\tD_0\u0004\txP{7~\u0016v}\u001dQ~\u0015@\u007fn9cG+3|\u0019w8?Jn&\u001a\u001cnKD\u0016g6WLj.RX;cV{\u0007\"\u0012f\u001eN4\u000b\u0005g\u000b\u0012nPG\u001f\u0011*IW", "9nc9\\5\u0006a(}\u0002b)D\u000e.kQ"}, k = 5, mv = {1, 9, 0}, pn = "", xi = 49, xs = ">AE<8<{5:x9);.s\u0014$6)3\n2")
public class PathsKt__PathUtilsKt extends PathsKt__PathRecursiveFunctionsKt {
    private static final Path Path(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        Path path2 = Paths.get(path, new String[0]);
        Intrinsics.checkNotNullExpressionValue(path2, "get(...)");
        return path2;
    }

    private static final Path Path(String base, String... subpaths) {
        Intrinsics.checkNotNullParameter(base, "base");
        Intrinsics.checkNotNullParameter(subpaths, "subpaths");
        Path path = Paths.get(base, (String[]) Arrays.copyOf(subpaths, subpaths.length));
        Intrinsics.checkNotNullExpressionValue(path, "get(...)");
        return path;
    }

    private static final Path absolute(Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Path absolutePath = path.toAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "toAbsolutePath(...)");
        return absolutePath;
    }

    private static final String absolutePathString(Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return path.toAbsolutePath().toString();
    }

    private static final Path copyTo(Path path, Path target, boolean z2) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        CopyOption[] copyOptionArr = z2 ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path pathCopy = Files.copy(path, target, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        Intrinsics.checkNotNullExpressionValue(pathCopy, "copy(...)");
        return pathCopy;
    }

    private static final Path copyTo(Path path, Path target, CopyOption... options) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(options, "options");
        Path pathCopy = Files.copy(path, target, (CopyOption[]) Arrays.copyOf(options, options.length));
        Intrinsics.checkNotNullExpressionValue(pathCopy, "copy(...)");
        return pathCopy;
    }

    static /* synthetic */ Path copyTo$default(Path path, Path target, boolean z2, int i2, Object obj) throws IOException {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        CopyOption[] copyOptionArr = z2 ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path pathCopy = Files.copy(path, target, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        Intrinsics.checkNotNullExpressionValue(pathCopy, "copy(...)");
        return pathCopy;
    }

    private static final Path createDirectories(Path path, FileAttribute<?>... attributes) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Path pathCreateDirectories = Files.createDirectories(path, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        Intrinsics.checkNotNullExpressionValue(pathCreateDirectories, "createDirectories(...)");
        return pathCreateDirectories;
    }

    private static final Path createDirectory(Path path, FileAttribute<?>... attributes) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Path pathCreateDirectory = Files.createDirectory(path, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        Intrinsics.checkNotNullExpressionValue(pathCreateDirectory, "createDirectory(...)");
        return pathCreateDirectory;
    }

    private static final Path createFile(Path path, FileAttribute<?>... attributes) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Path pathCreateFile = Files.createFile(path, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        Intrinsics.checkNotNullExpressionValue(pathCreateFile, "createFile(...)");
        return pathCreateFile;
    }

    private static final Path createLinkPointingTo(Path path, Path target) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        Path pathCreateLink = Files.createLink(path, target);
        Intrinsics.checkNotNullExpressionValue(pathCreateLink, "createLink(...)");
        return pathCreateLink;
    }

    public static final Path createParentDirectories(Path path, FileAttribute<?>... attributes) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Path parent = path.getParent();
        if (parent != null && !Files.isDirectory(parent, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
            try {
                FileAttribute[] fileAttributeArr = (FileAttribute[]) Arrays.copyOf(attributes, attributes.length);
                Intrinsics.checkNotNullExpressionValue(Files.createDirectories(parent, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length)), "createDirectories(...)");
            } catch (FileAlreadyExistsException e2) {
                if (!Files.isDirectory(parent, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
                    throw e2;
                }
            }
        }
        return path;
    }

    private static final Path createSymbolicLinkPointingTo(Path path, Path target, FileAttribute<?>... attributes) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Path pathCreateSymbolicLink = Files.createSymbolicLink(path, target, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        Intrinsics.checkNotNullExpressionValue(pathCreateSymbolicLink, "createSymbolicLink(...)");
        return pathCreateSymbolicLink;
    }

    private static final Path createTempDirectory(String str, FileAttribute<?>... attributes) throws IOException {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Path pathCreateTempDirectory = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        Intrinsics.checkNotNullExpressionValue(pathCreateTempDirectory, "createTempDirectory(...)");
        return pathCreateTempDirectory;
    }

    public static final Path createTempDirectory(Path path, String str, FileAttribute<?>... attributes) throws IOException {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        if (path != null) {
            Path pathCreateTempDirectory = Files.createTempDirectory(path, str, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
            Intrinsics.checkNotNullExpressionValue(pathCreateTempDirectory, "createTempDirectory(...)");
            return pathCreateTempDirectory;
        }
        Path pathCreateTempDirectory2 = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        Intrinsics.checkNotNullExpressionValue(pathCreateTempDirectory2, "createTempDirectory(...)");
        return pathCreateTempDirectory2;
    }

    static /* synthetic */ Path createTempDirectory$default(String str, FileAttribute[] attributes, int i2, Object obj) throws IOException {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            str = null;
        }
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Path pathCreateTempDirectory = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        Intrinsics.checkNotNullExpressionValue(pathCreateTempDirectory, "createTempDirectory(...)");
        return pathCreateTempDirectory;
    }

    public static /* synthetic */ Path createTempDirectory$default(Path path, String str, FileAttribute[] fileAttributeArr, int i2, Object obj) throws IOException {
        if ((i2 + 2) - (i2 | 2) != 0) {
            str = null;
        }
        return PathsKt.createTempDirectory(path, str, fileAttributeArr);
    }

    private static final Path createTempFile(String str, String str2, FileAttribute<?>... attributes) throws IOException {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Path pathCreateTempFile = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        Intrinsics.checkNotNullExpressionValue(pathCreateTempFile, "createTempFile(...)");
        return pathCreateTempFile;
    }

    public static final Path createTempFile(Path path, String str, String str2, FileAttribute<?>... attributes) throws IOException {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        if (path != null) {
            Path pathCreateTempFile = Files.createTempFile(path, str, str2, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
            Intrinsics.checkNotNullExpressionValue(pathCreateTempFile, "createTempFile(...)");
            return pathCreateTempFile;
        }
        Path pathCreateTempFile2 = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        Intrinsics.checkNotNullExpressionValue(pathCreateTempFile2, "createTempFile(...)");
        return pathCreateTempFile2;
    }

    static /* synthetic */ Path createTempFile$default(String str, String str2, FileAttribute[] attributes, int i2, Object obj) throws IOException {
        if ((i2 + 1) - (1 | i2) != 0) {
            str = null;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            str2 = null;
        }
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Path pathCreateTempFile = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        Intrinsics.checkNotNullExpressionValue(pathCreateTempFile, "createTempFile(...)");
        return pathCreateTempFile;
    }

    public static /* synthetic */ Path createTempFile$default(Path path, String str, String str2, FileAttribute[] fileAttributeArr, int i2, Object obj) throws IOException {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            str = null;
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            str2 = null;
        }
        return PathsKt.createTempFile(path, str, str2, fileAttributeArr);
    }

    private static final void deleteExisting(Path path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Files.delete(path);
    }

    private static final boolean deleteIfExists(Path path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return Files.deleteIfExists(path);
    }

    private static final Path div(Path path, String other) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Path pathResolve = path.resolve(other);
        Intrinsics.checkNotNullExpressionValue(pathResolve, "resolve(...)");
        return pathResolve;
    }

    private static final Path div(Path path, Path other) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Path pathResolve = path.resolve(other);
        Intrinsics.checkNotNullExpressionValue(pathResolve, "resolve(...)");
        return pathResolve;
    }

    private static final boolean exists(Path path, LinkOption... options) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        return Files.exists(path, (LinkOption[]) Arrays.copyOf(options, options.length));
    }

    public static final Void fileAttributeViewNotAvailable(Path path, Class<?> attributeViewClass) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(attributeViewClass, "attributeViewClass");
        throw new UnsupportedOperationException("The desired attribute view type " + attributeViewClass + " is not available for the file " + path + '.');
    }

    private static final /* synthetic */ <V extends FileAttributeView> V fileAttributesView(Path path, LinkOption... options) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_MEASUREMENT_INTERRUPTED);
        V v2 = (V) Files.getFileAttributeView(path, FileAttributeView.class, (LinkOption[]) Arrays.copyOf(options, options.length));
        if (v2 != null) {
            return v2;
        }
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_MEASUREMENT_INTERRUPTED);
        PathsKt.fileAttributeViewNotAvailable(path, FileAttributeView.class);
        throw new KotlinNothingValueException();
    }

    private static final /* synthetic */ <V extends FileAttributeView> V fileAttributesViewOrNull(Path path, LinkOption... options) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_MEASUREMENT_INTERRUPTED);
        return (V) Files.getFileAttributeView(path, FileAttributeView.class, (LinkOption[]) Arrays.copyOf(options, options.length));
    }

    private static final long fileSize(Path path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return Files.size(path);
    }

    private static final FileStore fileStore(Path path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        FileStore fileStore = Files.getFileStore(path);
        Intrinsics.checkNotNullExpressionValue(fileStore, "getFileStore(...)");
        return fileStore;
    }

    public static final FileVisitor<Path> fileVisitor(Function1<? super FileVisitorBuilder, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        FileVisitorBuilderImpl fileVisitorBuilderImpl = new FileVisitorBuilderImpl();
        builderAction.invoke(fileVisitorBuilderImpl);
        return fileVisitorBuilderImpl.build();
    }

    private static final void forEachDirectoryEntry(Path path, String glob, Function1<? super Path, Unit> action) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(glob, "glob");
        Intrinsics.checkNotNullParameter(action, "action");
        DirectoryStream<Path> directoryStreamNewDirectoryStream = Files.newDirectoryStream(path, glob);
        try {
            DirectoryStream<Path> directoryStream = directoryStreamNewDirectoryStream;
            Intrinsics.checkNotNull(directoryStream);
            Iterator<Path> it = directoryStream.iterator();
            while (it.hasNext()) {
                action.invoke(it.next());
            }
            Unit unit = Unit.INSTANCE;
            InlineMarker.finallyStart(1);
            if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
                CloseableKt.closeFinally(directoryStreamNewDirectoryStream, null);
            } else if (directoryStreamNewDirectoryStream != null) {
                directoryStreamNewDirectoryStream.close();
            }
            InlineMarker.finallyEnd(1);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                InlineMarker.finallyStart(1);
                if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
                    CloseableKt.closeFinally(directoryStreamNewDirectoryStream, th);
                } else if (directoryStreamNewDirectoryStream != null) {
                    try {
                        directoryStreamNewDirectoryStream.close();
                    } catch (Throwable unused) {
                    }
                }
                InlineMarker.finallyEnd(1);
                throw th2;
            }
        }
    }

    static /* synthetic */ void forEachDirectoryEntry$default(Path path, String glob, Function1 action, int i2, Object obj) throws IOException {
        if ((i2 & 1) != 0) {
            glob = ProxyConfig.MATCH_ALL_SCHEMES;
        }
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(glob, "glob");
        Intrinsics.checkNotNullParameter(action, "action");
        DirectoryStream<Path> directoryStreamNewDirectoryStream = Files.newDirectoryStream(path, glob);
        try {
            DirectoryStream<Path> directoryStream = directoryStreamNewDirectoryStream;
            Intrinsics.checkNotNull(directoryStream);
            Iterator<Path> it = directoryStream.iterator();
            while (it.hasNext()) {
                action.invoke(it.next());
            }
            Unit unit = Unit.INSTANCE;
            InlineMarker.finallyStart(1);
            if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
                CloseableKt.closeFinally(directoryStreamNewDirectoryStream, null);
            } else if (directoryStreamNewDirectoryStream != null) {
                directoryStreamNewDirectoryStream.close();
            }
            InlineMarker.finallyEnd(1);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                InlineMarker.finallyStart(1);
                if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
                    CloseableKt.closeFinally(directoryStreamNewDirectoryStream, th);
                } else if (directoryStreamNewDirectoryStream != null) {
                    try {
                        directoryStreamNewDirectoryStream.close();
                    } catch (Throwable unused) {
                    }
                }
                InlineMarker.finallyEnd(1);
                throw th2;
            }
        }
    }

    private static final Object getAttribute(Path path, String attribute, LinkOption... options) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        Intrinsics.checkNotNullParameter(options, "options");
        return Files.getAttribute(path, attribute, (LinkOption[]) Arrays.copyOf(options, options.length));
    }

    public static final String getExtension(Path path) {
        String string;
        String strSubstringAfterLast;
        Intrinsics.checkNotNullParameter(path, "<this>");
        Path fileName = path.getFileName();
        return (fileName == null || (string = fileName.toString()) == null || (strSubstringAfterLast = StringsKt.substringAfterLast(string, '.', "")) == null) ? "" : strSubstringAfterLast;
    }

    public static /* synthetic */ void getExtension$annotations(Path path) {
    }

    private static final String getInvariantSeparatorsPath(Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return PathsKt.getInvariantSeparatorsPathString(path);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\u0018Y\u0001tz\u0003+XjP)\td\b1^]^\n;\u0014z\u001fBwZv]b\u0007-to\ftT\\lmKZ7rC i`~#\\\u0016", replaceWith = @ReplaceWith(expression = "invariantSeparatorsPathString", imports = {}))
    @InterfaceC1492Gx
    public static /* synthetic */ void getInvariantSeparatorsPath$annotations(Path path) {
    }

    public static final String getInvariantSeparatorsPathString(Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        String separator = path.getFileSystem().getSeparator();
        if (Intrinsics.areEqual(separator, RemoteSettings.FORWARD_SLASH_STRING)) {
            return path.toString();
        }
        String string = path.toString();
        Intrinsics.checkNotNull(separator);
        return StringsKt.replace$default(string, separator, RemoteSettings.FORWARD_SLASH_STRING, false, 4, (Object) null);
    }

    public static /* synthetic */ void getInvariantSeparatorsPathString$annotations(Path path) {
    }

    private static final FileTime getLastModifiedTime(Path path, LinkOption... options) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        FileTime lastModifiedTime = Files.getLastModifiedTime(path, (LinkOption[]) Arrays.copyOf(options, options.length));
        Intrinsics.checkNotNullExpressionValue(lastModifiedTime, "getLastModifiedTime(...)");
        return lastModifiedTime;
    }

    public static final String getName(Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Path fileName = path.getFileName();
        String string = fileName != null ? fileName.toString() : null;
        return string == null ? "" : string;
    }

    public static /* synthetic */ void getName$annotations(Path path) {
    }

    public static final String getNameWithoutExtension(Path path) {
        String string;
        String strSubstringBeforeLast$default;
        Intrinsics.checkNotNullParameter(path, "<this>");
        Path fileName = path.getFileName();
        return (fileName == null || (string = fileName.toString()) == null || (strSubstringBeforeLast$default = StringsKt.substringBeforeLast$default(string, ".", (String) null, 2, (Object) null)) == null) ? "" : strSubstringBeforeLast$default;
    }

    public static /* synthetic */ void getNameWithoutExtension$annotations(Path path) {
    }

    private static final UserPrincipal getOwner(Path path, LinkOption... options) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        return Files.getOwner(path, (LinkOption[]) Arrays.copyOf(options, options.length));
    }

    private static final String getPathString(Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return path.toString();
    }

    public static /* synthetic */ void getPathString$annotations(Path path) {
    }

    private static final Set<PosixFilePermission> getPosixFilePermissions(Path path, LinkOption... options) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        Set<PosixFilePermission> posixFilePermissions = Files.getPosixFilePermissions(path, (LinkOption[]) Arrays.copyOf(options, options.length));
        Intrinsics.checkNotNullExpressionValue(posixFilePermissions, "getPosixFilePermissions(...)");
        return posixFilePermissions;
    }

    private static final boolean isDirectory(Path path, LinkOption... options) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        return Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(options, options.length));
    }

    private static final boolean isExecutable(Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return Files.isExecutable(path);
    }

    private static final boolean isHidden(Path path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return Files.isHidden(path);
    }

    private static final boolean isReadable(Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return Files.isReadable(path);
    }

    private static final boolean isRegularFile(Path path, LinkOption... options) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        return Files.isRegularFile(path, (LinkOption[]) Arrays.copyOf(options, options.length));
    }

    private static final boolean isSameFileAs(Path path, Path other) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return Files.isSameFile(path, other);
    }

    private static final boolean isSymbolicLink(Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return Files.isSymbolicLink(path);
    }

    private static final boolean isWritable(Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return Files.isWritable(path);
    }

    public static final List<Path> listDirectoryEntries(Path path, String glob) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(glob, "glob");
        DirectoryStream<Path> directoryStreamNewDirectoryStream = Files.newDirectoryStream(path, glob);
        try {
            DirectoryStream<Path> directoryStream = directoryStreamNewDirectoryStream;
            Intrinsics.checkNotNull(directoryStream);
            List<Path> list = CollectionsKt.toList(directoryStream);
            CloseableKt.closeFinally(directoryStreamNewDirectoryStream, null);
            return list;
        } finally {
        }
    }

    public static /* synthetic */ List listDirectoryEntries$default(Path path, String str, int i2, Object obj) throws IOException {
        if ((i2 & 1) != 0) {
            str = ProxyConfig.MATCH_ALL_SCHEMES;
        }
        return PathsKt.listDirectoryEntries(path, str);
    }

    private static final Path moveTo(Path path, Path target, boolean z2) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        CopyOption[] copyOptionArr = z2 ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path pathMove = Files.move(path, target, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        Intrinsics.checkNotNullExpressionValue(pathMove, "move(...)");
        return pathMove;
    }

    private static final Path moveTo(Path path, Path target, CopyOption... options) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(options, "options");
        Path pathMove = Files.move(path, target, (CopyOption[]) Arrays.copyOf(options, options.length));
        Intrinsics.checkNotNullExpressionValue(pathMove, "move(...)");
        return pathMove;
    }

    static /* synthetic */ Path moveTo$default(Path path, Path target, boolean z2, int i2, Object obj) throws IOException {
        if ((i2 + 2) - (i2 | 2) != 0) {
            z2 = false;
        }
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        CopyOption[] copyOptionArr = z2 ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path pathMove = Files.move(path, target, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        Intrinsics.checkNotNullExpressionValue(pathMove, "move(...)");
        return pathMove;
    }

    private static final boolean notExists(Path path, LinkOption... options) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        return Files.notExists(path, (LinkOption[]) Arrays.copyOf(options, options.length));
    }

    private static final /* synthetic */ <A extends BasicFileAttributes> A readAttributes(Path path, LinkOption... options) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS);
        A a2 = (A) Files.readAttributes(path, BasicFileAttributes.class, (LinkOption[]) Arrays.copyOf(options, options.length));
        Intrinsics.checkNotNullExpressionValue(a2, "readAttributes(...)");
        return a2;
    }

    private static final Map<String, Object> readAttributes(Path path, String attributes, LinkOption... options) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(options, "options");
        Map<String, Object> attributes2 = Files.readAttributes(path, attributes, (LinkOption[]) Arrays.copyOf(options, options.length));
        Intrinsics.checkNotNullExpressionValue(attributes2, "readAttributes(...)");
        return attributes2;
    }

    private static final Path readSymbolicLink(Path path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Path symbolicLink = Files.readSymbolicLink(path);
        Intrinsics.checkNotNullExpressionValue(symbolicLink, "readSymbolicLink(...)");
        return symbolicLink;
    }

    public static final Path relativeTo(Path path, Path base) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(base, "base");
        try {
            return PathRelativizer.INSTANCE.tryRelativeTo(path, base);
        } catch (IllegalArgumentException e2) {
            throw new IllegalArgumentException(e2.getMessage() + "\nthis path: " + path + "\nbase path: " + base, e2);
        }
    }

    public static final Path relativeToOrNull(Path path, Path base) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(base, "base");
        try {
            return PathRelativizer.INSTANCE.tryRelativeTo(path, base);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static final Path relativeToOrSelf(Path path, Path base) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(base, "base");
        Path pathRelativeToOrNull = PathsKt.relativeToOrNull(path, base);
        return pathRelativeToOrNull == null ? path : pathRelativeToOrNull;
    }

    private static final Path setAttribute(Path path, String attribute, Object obj, LinkOption... options) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        Intrinsics.checkNotNullParameter(options, "options");
        Path attribute2 = Files.setAttribute(path, attribute, obj, (LinkOption[]) Arrays.copyOf(options, options.length));
        Intrinsics.checkNotNullExpressionValue(attribute2, "setAttribute(...)");
        return attribute2;
    }

    private static final Path setLastModifiedTime(Path path, FileTime value) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        Path lastModifiedTime = Files.setLastModifiedTime(path, value);
        Intrinsics.checkNotNullExpressionValue(lastModifiedTime, "setLastModifiedTime(...)");
        return lastModifiedTime;
    }

    private static final Path setOwner(Path path, UserPrincipal value) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        Path owner = Files.setOwner(path, value);
        Intrinsics.checkNotNullExpressionValue(owner, "setOwner(...)");
        return owner;
    }

    private static final Path setPosixFilePermissions(Path path, Set<? extends PosixFilePermission> value) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        Path posixFilePermissions = Files.setPosixFilePermissions(path, value);
        Intrinsics.checkNotNullExpressionValue(posixFilePermissions, "setPosixFilePermissions(...)");
        return posixFilePermissions;
    }

    private static final Path toPath(URI uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Path path = Paths.get(uri);
        Intrinsics.checkNotNullExpressionValue(path, "get(...)");
        return path;
    }

    private static final <T> T useDirectoryEntries(Path path, String glob, Function1<? super Sequence<? extends Path>, ? extends T> block) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(glob, "glob");
        Intrinsics.checkNotNullParameter(block, "block");
        DirectoryStream<Path> directoryStreamNewDirectoryStream = Files.newDirectoryStream(path, glob);
        try {
            DirectoryStream<Path> directoryStream = directoryStreamNewDirectoryStream;
            Intrinsics.checkNotNull(directoryStream);
            T tInvoke = block.invoke(CollectionsKt.asSequence(directoryStream));
            InlineMarker.finallyStart(1);
            if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
                CloseableKt.closeFinally(directoryStreamNewDirectoryStream, null);
            } else if (directoryStreamNewDirectoryStream != null) {
                directoryStreamNewDirectoryStream.close();
            }
            InlineMarker.finallyEnd(1);
            return tInvoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                InlineMarker.finallyStart(1);
                if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
                    CloseableKt.closeFinally(directoryStreamNewDirectoryStream, th);
                } else if (directoryStreamNewDirectoryStream != null) {
                    try {
                        directoryStreamNewDirectoryStream.close();
                    } catch (Throwable unused) {
                    }
                }
                InlineMarker.finallyEnd(1);
                throw th2;
            }
        }
    }

    static /* synthetic */ Object useDirectoryEntries$default(Path path, String glob, Function1 block, int i2, Object obj) throws IOException {
        if ((i2 & 1) != 0) {
            glob = ProxyConfig.MATCH_ALL_SCHEMES;
        }
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(glob, "glob");
        Intrinsics.checkNotNullParameter(block, "block");
        DirectoryStream<Path> directoryStreamNewDirectoryStream = Files.newDirectoryStream(path, glob);
        try {
            DirectoryStream<Path> directoryStream = directoryStreamNewDirectoryStream;
            Intrinsics.checkNotNull(directoryStream);
            Object objInvoke = block.invoke(CollectionsKt.asSequence(directoryStream));
            InlineMarker.finallyStart(1);
            if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
                CloseableKt.closeFinally(directoryStreamNewDirectoryStream, null);
            } else if (directoryStreamNewDirectoryStream != null) {
                directoryStreamNewDirectoryStream.close();
            }
            InlineMarker.finallyEnd(1);
            return objInvoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                InlineMarker.finallyStart(1);
                if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
                    CloseableKt.closeFinally(directoryStreamNewDirectoryStream, th);
                } else if (directoryStreamNewDirectoryStream != null) {
                    try {
                        directoryStreamNewDirectoryStream.close();
                    } catch (Throwable unused) {
                    }
                }
                InlineMarker.finallyEnd(1);
                throw th2;
            }
        }
    }

    public static final void visitFileTree(Path path, int i2, boolean z2, Function1<? super FileVisitorBuilder, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        PathsKt.visitFileTree(path, PathsKt.fileVisitor(builderAction), i2, z2);
    }

    public static final void visitFileTree(Path path, FileVisitor<Path> visitor, int i2, boolean z2) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        Files.walkFileTree(path, z2 ? SetsKt.setOf(FileVisitOption.FOLLOW_LINKS) : SetsKt.emptySet(), i2, visitor);
    }

    public static /* synthetic */ void visitFileTree$default(Path path, int i2, boolean z2, Function1 function1, int i3, Object obj) {
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i3 + 2) - (i3 | 2) != 0) {
            z2 = false;
        }
        PathsKt.visitFileTree(path, i2, z2, (Function1<? super FileVisitorBuilder, Unit>) function1);
    }

    public static /* synthetic */ void visitFileTree$default(Path path, FileVisitor fileVisitor, int i2, boolean z2, int i3, Object obj) {
        if ((2 & i3) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i3 + 4) - (i3 | 4) != 0) {
            z2 = false;
        }
        PathsKt.visitFileTree(path, (FileVisitor<Path>) fileVisitor, i2, z2);
    }

    public static final Sequence<Path> walk(Path path, PathWalkOption... options) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        return new PathTreeWalk(path, options);
    }
}
