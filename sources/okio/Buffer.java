package okio;

import androidx.compose.animation.core.AnimationKt;
import androidx.exifinterface.media.ExifInterface;
import com.drew.metadata.exif.makernotes.CanonMakernoteDirectory;
import com.dynatrace.android.agent.AdkSettings;
import com.dynatrace.android.agent.events.eventsapi.EnrichmentAttributesGenerator;
import com.google.common.base.Ascii;
import com.squareup.wire.internal.MathMethodsKt;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Typography;
import okhttp3.internal.connection.RealConnection;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яķ\u0014D57\u001eq\u007fZDkt\u001aA\u000e0\u0019FJ~8,\u001aw\rir9FDm߉6Ra1\u0017k\u00027,[2qK;[\u001e\u0006\"\u001fOVgmoRZ!C\u0017إ\u001exx8QU~^\u001a\u000f@KwЀ;M}މA`z7\r @%@y\u000b\u0004\"*V\u0016~zIV\u0014\u0012F@x:X\u0013U\u00050\u0012\u000e>.\u0011&ձoNLHtҗB/9\u0003qBT4g0\u000bU\u0015FZ(\u0015vw\u001e3@==\u001d%i\u0003\u000fѸc?\u0019?y=\u000bn/'AI{W<]\b\u0014++W\rc\b<ؘ5Q\u000f\u000bW+}c{P<)(z*\u000ft\u0004؎\u0005gKͶ1\u001at\u000bV9\u0003vk@~\u061c%VH~oE/%.Cs?)wiaiϊ\u0015KD\u000b\u001b0;\u0001\u001d1\"hVd#.lw\u007f;\u001aDK\\f\n\bƝ6&~w\u001a*2\u0382w\u0004=\u0012).E<ga?#/\u0004\u001aHrq'\u000bfha\u0003jHn,5\u001b\u007f@\u0017!rD\u0013ʍ\u001cTbnD\u0011{ȼ\u0005\r\u0004\b!8twj+m.\\d\u0001i\u0019ܔ\u000e\u000e3E~7\bʤ\u001c\u0014]9lKMQ\u0012\u001a\u0012V\u0005-W<\u0011\u000f!tPm$Z\u000bCR6V\u0007(w*a\u0015\f[8M\u001044Zջ_p]N\u0011=ZA+ȁ&n1!\rtK$1\u000bTz\u0017#h^\u0007n\u0016\u001c\u0010ت|)(;ei5GG\u001c61:\u000bH\u001f~\"\u0010\u000e{\u0015[Z\u0013.u\u0004#P\u001a(ai/k\u001dUȷ)ɨ\u0006-Ku;x_v*')$*\u0013I\u0013Fg6t71߯nJU\u007f_(\u0005\u000b\u000b#6\u0012F\u000e*\\\tu{T9vnM\u0001\u001fq<|U-\t-M=\u0001\u001e=C5uO5M.wBJEek\u0019\b.(}W2\u0003\u0017\u001c,\u00121 f_\rJ;fd\"\u000bLT<l1]xn\u00067Z\tb({VO\u0018\tVfW;3\f\u001b\u001f,;\u0018\u001do\u0003)}1L.\u000e4$G\fHvCS8}Wu#\u0006K\u000b\u0015\u0011#R)\nd\u0007\u0012JGPZe\u0017!04\u001bH:Opz\u0005j\u0013T8:r \u000bq^0\u001aX\t\u000eyw\u000fE<rwI\u000e&T'w\u001d\\MvS\u00149*/\t?7,0M13\tvX=\u0019J\u0001\u0002'O/3]\r\u001f=+r^i\u001f6\u0012\u0019\u000bsx\n]JL\u0012\u007fAm\u001ay<<&65BF6iU\u001f\u0015\u000f0\r\u0015\u001cx\u0017j\u0005L~R|]o\u0013C\u0003\u001cx\"\u000f9:\u0016\u00078f;\nfwe^b\u0007%\u0003A\u0007:\u0014*Zc3\u0014tE=wiZ;Dma{\u0016\bNAW\b\u00039tW<p:a)q.qD}H\u001d[v.DFJ#\u0014:2\u0016Ng\u0002a\fCbg#\u0010!nB[p\u0014\u0004ch'7\u0014pq\bm\u000b1\u0014wjB|;\u00135\tUz^\u0017f\u001eR\u0011\u0002d\u001f%H\"#h766\u0010Y\u0014]'\u0001p\u001a\u0015\"!sMyly1^\u007fN\u0002-=\u000e\u0004X\u001aX\u0019Ine>\u00136\rpPp&^\u0019U+\tT?\"?\u0017H\r\u001bC8T66d]ЮI#i&_`5\u000e\f]n/?\u0019W\u001be<;s6:)\u0003h*;\u0014rR\u0017;\u0018gZvvZC\u001a5$<m\u0013LlP\u000e>PSD\u0011<8un\u0001&L)2\u001ci\u0017yUa\u001f\u000faP\u0006\u001eLI9xjk%X\u000bC\u0015UE\b~\u0004:\"R97w\u001d}hofi@eiZ@$\u0002\u0014TEa,\\\u001d0DIcOd\u000e\u001eL\u000eY7$RԖ&'\u000e\u0016IHX\u001b%TdCo\u0004TġfrRs_l'/:0w1\fd\nk|_\tc1Dl:]p\u0015\u0016eh(Ft\u0011S-O\u000f43c\u001b\u000bagqnL\u0010r\u0016=j0T\u0013\"\u0014j6oy\u0012Gn\u001fp\u001au(b6\u0003j\u001ca\u0010\u0014FU%\r2֓aVn\u0019x\u001dF1\u0012\u000b\u000f<jLeA\u0011\u0015\u0007#ld<\u0017$\u000b4Ct\\_\b\f x\u0015A`\u000e\b\nM -\u0014!K\u001b\"9N+uB_?\u0004{\u001fQ\u00029\u0019FbXc?#\u0019\u001e'Y?C\u0015.DqB\u0010dLuBX4+uhVl\\xr\u00064DxF^ZrC\f\u001eL#Kn-e-<\u0013;iA)+e55f\u001e3;W\u001a\u0003>\u000bI\u0019\u0011\u001ea\u0004J#\"VwCD\u000ej)m|\u001cfV\u0017*X/\u000f\u001e?]^{pd~W\u0019\u0006IE h-2f+$\u0011\u0015Y}V*mdd8l(vh %/Hxq\u0013t:KRL\u001e\u0014Kh)bJRkcN\u0010Fp7Q\u0016~D8sT~t\bnu/\u00042V1 \u001b*c(\"|7tXl'\b*N,\u001a\u001aK0(\u0010\u00117>}mc\u001c\u0018$Xnxq4\u001a\u0019+\u000e;\fr%{@RG3\u0003\u0007U\u0004ܮ_.\u000b\t\u000f\u0014xK\u001eJ\u0005278Xj_j/6(+ֲ;D\u0005\u000f07H\u000fy\"\u0002xmKXs&j\u0010\u0013]\u007fk\"N\r\u001eGE \u0013I~r2vKRܝ\bk5\"\u000fhN\rEZU}\u0019\f8'$|365g\u001bU\u0004\u0011\u000bd->f&OIQGO.3\u001dJ!JM\u0007(7^j\u0018F{4\u0013XVD;z6\f{at8c|p,\u001f\u0016i&(=o z{JQ|0αˆa.SoOgJRY\u00028OY(\u0016\u000f?\u0002vx\u0011Fj1\u000f\bN\u0018xՠ\u001f|3\u0003}\f]:<\"z\fLl~]\u0016ҞqAcW\u0017E[t\"\fYa\u0006~Yt>M$SgL\u001c#\"Q\u001d,@\u007f\b\u0004_ $di</w6ңdoH\u0015_\u0003Bt\u0012Bbhtg\u0005v~ݍ@A$\b,\u0005l\u000fo7\tCmY\u007f\u007fiˀ!!EL]d9_A,nJV\u0012=u\tj\u001c4\u001a\u0005y\u0012`*\u0002[\u00079c\u0015\n߮\u0018g_\u001c\u007fH\u001a$_\u000e\u0006/N\u001d.?\u007f!<^l2\u007f^7_S\u00125hg\b ,x[&h.-s\b<ε\u0017P^AY\u0007\u001b[=\u000b;'Mʐ\u0001BEPĿsj'˭\u0004Nlig/g-\u000b,ɱZs'^۸6&!Ե\u001e.\u000eR\u0012F\t$D]φ\u007fXHA³JH<Β\u0013\u001dez2{\u001e\nAMؔo1+&҂\u000fG\u0013ʝ$9(9Enu5#}ɀ':CA؊Kr\u0017߳\u001ba%77\u0018\u000bC*@ԋ\u001fm\u0010mԁCglݠ~9I^::\u001d\u0016\\{ߗ-\u0003o\u0019Ú\u000f\u0015]Ә;u~&c\f<X6`Ȣ\u0013z\\rυ\f-Rܻ\r6\u001fXQx 7H)բg\u0016o%ǘ\u0013\u0017nΧmMXnR['\u000f\u0003\u0019\u00017\u0001$?\\hgɺE|\u000f\u0015ʣ\u0001H ߲sVi+%a\"\u0012ׅJ}2Jfy~/Ή3X\"X\u0010D(sh%L~\u000b`J(U0Ш;3s^ߜG\u0015N\u0001\r\u0004]]Ax\u000fp?Ka_\u000b)rcq\u0001yہ.hRoƒ\u001f4(ō%Pae@\u0012yj>Sӣ<a%CռOo\u001aŜ\u000255 y\u000f/Mڗ\u0005<\u0014p,fuQ܊=\u000e\u001cbA;6+yBŶAzOXͻBj\\ʆV\ndA\u000fz\u0012\u000b_(\u0006vI5º\\w\u0004έ\u001dܑ\u0007P\\S9qqM&\tj\u0014'3Shu8\u0003ڝ9мrʸ}ȋ{riڝ\u0007i\u000e#ADw;b\u0006\u001aYdo+:\u007fW\u000bI\u0019¬\u001f֠D*\bׇnhO?V\u0002|8rjR7ׯ\u0012˼5"}, d2 = {"\u001anZ6bu\u001bc\u001a\u007fzk\u0002", "\u001anZ6bu\u001bc\u001a\u007fzk,{v9u\r&{\u0016", "\u001anZ6bu\u001bc\u001a\u007fzk,{v3n\u0006}", "", "\u001aiPCTuGW#Hxa(\u0006\u0012/l\u000eqXT\u0010\u0017tJk\u0017Ev,\u000b", "u(E", "0tU3X9", "5dc\u000fh-?S&", "u(;<^0H\u001du\u000f{_,\n^", "6dP1", "\u001anZ6bu,S\u001b\u0007zg;R", "\nrTA \u0006\u0017", "", "Ahi2", "u(9", "Adc \\A>\u0012#\u0005~h", "uI\u0018#", "1kT.e", "", "1k^;X", "1k^@X", "1n\\=_,MS\u0007~|f,\u0006\u0018\fy\u000f(YJ\u0011 &", "1n_F", "1n_FG6", "=tc", "\u001aiPCTuB]bh\u000bm7\r\u0018\u001dt\r(wHV", "=eU@X;", "0xc266N\\(", "2hV2f;", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "/kV<e0MV!", "", "3lXA", "3lXA66F^ ~\n^\u001a|\u000b7e\t7\n", "3pd._:", "", "=sW2e", "", "3wW.h:MS\u0018", "4kd@[", "5dc", "", ">nb", "5dc\u000fl;>", "7mS2k", "zcT=e,<O(~yX.|\u0018\fy\u000f(", "6`b566=S", "", "6lP0", "9dh", "6lP0F/:\u001f", "6lP0F/: hO", "6lP0F/:#dK", "7mS2k\u0016?", AdkSettings.PLATFORM_TYPE_MOBILE, "4q^:<5=S,", "Bn8;W,Q", "0xc2f", "7mS2k\u0016?3 ~\u0003^5\f", "B`a4X;\u001bg(~\t", "7m_Bg\u001aM`\u0019z\u0003", "\u001aiPCTuB]bb\u0004i<\fv>r\u007f$\u0004\u0016", "7r>=X5", ";c$", "=tc=h;,b&~vf", ">dT8", "@`]4X\fJc\u0015\u0006\t", "0xc2f\u0016?T'~\n", "@dP1", "Ah]8", "\u001aiPCTuGW#HWr;|e?f\u0001(\t\u0016", "", "@dP143E", "\u001anZ6bu,W\"\u0005P", "@dP145=E&\u0003\n^\u001c\u0006\u0017+f\u007f", "\u001anZ6bu\u001bc\u001a\u007fzkjl\u0012=a\u0001(YP\u000e%!TE", "Cmb.Y,\u001cc&\r\u0005k", "@dP15@MS", "@dP15@MSt\f\bZ@", "@dP15@MS\u0007\u000e\bb5~", "@dP17,<W!z\u0002E6\u0006\u000b", "@dP199H[", "7m_Bg", "4na2i,K", "@dP19<EZ-", "@dP1;,QO\u0018~xb4x\u0010\u001fn\u000e,}I\u0001\u0016}Qx\u0010", "@dP1<5M", "@dP1<5M:\u0019", "@dP1?6GU", "@dP1?6GU\u007f~", "@dP1F/H`(", "", "@dP1F/H`(ez", "@dP1F;KW\"\u0001", "1gP?f,M", "\u001aiPCTuGW#Hxa(\n\u0017/tI\u0006~<\u000e%\u0017VE", "@dP1H5LO\u001a~", "@dP1H;?&", "@dP1H;?&v\ty^\u0017\u0007\r8t", "@dP1H;?&\u007f\u0003\u0004^", "@dP1H;?&\u007f\u0003\u0004^\u001a\f\u00163c\u000f", ":h\\6g", "@d`BX:M", "@d`B\\9>", "Ad[2V;", "=oc6b5L", "\u001anZ6bu(^(\u0003\u0005g:R", "\"", "\u001anZ6bu-g$~yH7\f\r9n\u000e}", "uK^8\\6\bB-\nz]\u0016\b\u00183o\t6Q\u0004g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#", "AgP}", "AgP~(|", "AgP\u0002$x", "zcT=e,<O(~yX:\u0001\u001e/", "AjX=", "AmP=f/Hb", "Bh\\2b<M", "\u001anZ6bu-W!~\u0005n;R", "BnBAe0GU", "EqXAT)ES\u0007~|f,\u0006\u0018", ";h]6`<F1\u0015\nv\\0\f\u001d", "EqXAT)ES\u0007~|f,\u0006\u0018mo\u0006,\u0006", "EqXAX", "And?V,", "0xc2F;KW\"\u0001", "\u001anZ6bu,])\fx^\u0002", "EqXAX\bEZ", "EqXAX\tRb\u0019", "EqXAX\u000b>Q\u001d\u0007ve\u0013\u0007\u00121", "D", "EqXAX\u000f>f\u0015}z\\0\u0005\u00056U\t6\u007fB\n\u0017\u0016.y\u0017>", "EqXAX\u0010Gb", "7", "EqXAX\u0010Gb\u007f~", "EqXAX\u0013H\\\u001b", "EqXAX\u0013H\\\u001bez", "EqXAX\u001aA]&\u000e", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "EqXAX\u001aA]&\u000ea^", "EqXAX\u001aM`\u001d\b|", "Asa6a.", "0dV6a\u0010GR\u0019\u0012", "3mS\u0016a+>f", "EqXAX\u001bH", "EqXAX\u001cMTk", "EqXAX\u001cMTk\\\u0005],g\u00133n\u000f", "1nS2C6B\\(", "#mb.Y,\u001cc&\r\u0005k", "=jX<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class Buffer implements BufferedSource, BufferedSink, Cloneable, ByteChannel {
    public Segment head;
    private long size;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\"\u007fјnjG6L͜P.`Z2şs{B-cҕyCQU\"}(\rWNugvJ`\u0010YƤ6\u0016'ilLǤ|] \u000fzH}QKM\u001eP\u007ft=B\u00134J\"f\u00025\u0005(?`\u0010%\u0001\fO\u001a(H@\u001f@\u001b\u0019[\u001c2\u00124FP\u0005,t\u007fNdP5iHH;\u0003\u0018H~+m7\u0015M;N%9\u001bwy A?e7K)\u0012\u0007]Ҁgύ\u0007?yܵUz5*CK\nVd\\6\u0018S/&՝ię*\\\rĩ1\u001c50gcyVD,6~RȦHǬ\u0012\u0006/Ξ~=(m \u000ea|)W~TXޑNȸ~a>Ѝu\u0010A4Q\u001b\u0015[\u0018?WR\u000eޮ\u0011ڟ\"#\t͙qub\u0019x\u00171S&]\b҆LףLZ\u0012ԯUo\n}p\u0010J\u00066V\u000e?L!<(=7\n?Y%*\u0006\u001fֻsЛ\t`pׅ\u05c8Vb"}, d2 = {"\u001anZ6bu\u001bc\u001a\u007fzkjl\u0012=a\u0001(YP\u000e%!TE", "\u001aiPCTuB]b\\\u0002h:|\u0005,l\u007f}", "u(E", "0tU3X9", "\u001anZ6bu\u001bc\u001a\u007fzk\u0002", "2`c.", "", "3mS", "", "=eU@X;", "", "@dP1J9Bb\u0019", "", "AdV:X5M", "\u001anZ6bu,S\u001b\u0007zg;R", "5dc X.FS\"\u000e9h2\u0001\u0013", "u(;<^0H\u001d\u0007~|f,\u0006\u0018\u0005", "Adc X.FS\"\u000e9h2\u0001\u0013", "uK^8\\6\bA\u0019\u0001\u0003^5\f^rV", "AsP?g", "1k^@X", "", "3w_.a+\u001bc\u001a\u007fzk", ";h]\u000fl;>1#\u000f\u0004m", "<dgA", "@db6m,\u001bc\u001a\u007fzk", "<df \\A>", "AdT8", "=jX<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class UnsafeCursor implements Closeable {
        public Buffer buffer;
        public byte[] data;
        public boolean readWrite;
        private Segment segment;
        public long offset = -1;
        public int start = -1;
        public int end = -1;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.buffer == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            this.buffer = null;
            setSegment$okio(null);
            this.offset = -1L;
            this.data = null;
            this.start = -1;
            this.end = -1;
        }

        public final long expandBuffer(int i2) {
            if (i2 <= 0) {
                throw new IllegalArgumentException(("minByteCount <= 0: " + i2).toString());
            }
            if (i2 > 8192) {
                throw new IllegalArgumentException(("minByteCount > Segment.SIZE: " + i2).toString());
            }
            Buffer buffer = this.buffer;
            if (buffer == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (!this.readWrite) {
                throw new IllegalStateException("expandBuffer() only permitted for read/write buffers".toString());
            }
            long size = buffer.size();
            Segment segmentWritableSegment$okio = buffer.writableSegment$okio(i2);
            int i3 = 8192 - segmentWritableSegment$okio.limit;
            segmentWritableSegment$okio.limit = 8192;
            long j2 = i3;
            buffer.setSize$okio(size + j2);
            setSegment$okio(segmentWritableSegment$okio);
            this.offset = size;
            this.data = segmentWritableSegment$okio.data;
            this.start = 8192 - i3;
            this.end = 8192;
            return j2;
        }

        public final Segment getSegment$okio() {
            return this.segment;
        }

        public final int next() {
            long j2 = this.offset;
            Buffer buffer = this.buffer;
            Intrinsics.checkNotNull(buffer);
            if (j2 == buffer.size()) {
                throw new IllegalStateException("no more bytes".toString());
            }
            long j3 = this.offset;
            return seek(j3 == -1 ? 0L : j3 + ((long) (this.end - this.start)));
        }

        public final long resizeBuffer(long j2) {
            Buffer buffer = this.buffer;
            if (buffer == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (!this.readWrite) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
            }
            long size = buffer.size();
            if (j2 <= size) {
                if (j2 < 0) {
                    throw new IllegalArgumentException(("newSize < 0: " + j2).toString());
                }
                long j3 = size - j2;
                while (true) {
                    if (j3 <= 0) {
                        break;
                    }
                    Segment segment = buffer.head;
                    Intrinsics.checkNotNull(segment);
                    Segment segment2 = segment.prev;
                    Intrinsics.checkNotNull(segment2);
                    long j4 = segment2.limit - segment2.pos;
                    if (j4 > j3) {
                        segment2.limit -= (int) j3;
                        break;
                    }
                    buffer.head = segment2.pop();
                    SegmentPool.recycle(segment2);
                    j3 -= j4;
                }
                setSegment$okio(null);
                this.offset = j2;
                this.data = null;
                this.start = -1;
                this.end = -1;
            } else if (j2 > size) {
                long j5 = j2 - size;
                boolean z2 = true;
                while (j5 > 0) {
                    Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
                    int iMin = (int) Math.min(j5, 8192 - segmentWritableSegment$okio.limit);
                    segmentWritableSegment$okio.limit += iMin;
                    j5 -= (long) iMin;
                    if (z2) {
                        setSegment$okio(segmentWritableSegment$okio);
                        this.offset = size;
                        this.data = segmentWritableSegment$okio.data;
                        this.start = segmentWritableSegment$okio.limit - iMin;
                        this.end = segmentWritableSegment$okio.limit;
                        z2 = false;
                    }
                }
            }
            buffer.setSize$okio(j2);
            return size;
        }

        public final int seek(long j2) {
            Buffer buffer = this.buffer;
            if (buffer == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (j2 < -1 || j2 > buffer.size()) {
                throw new ArrayIndexOutOfBoundsException("offset=" + j2 + " > size=" + buffer.size());
            }
            if (j2 == -1 || j2 == buffer.size()) {
                setSegment$okio(null);
                this.offset = j2;
                this.data = null;
                this.start = -1;
                this.end = -1;
                return -1;
            }
            long size = buffer.size();
            Segment segmentPush = buffer.head;
            Segment segment$okio = buffer.head;
            long j3 = 0;
            if (getSegment$okio() != null) {
                long j4 = this.offset;
                int i2 = this.start;
                Segment segment$okio2 = getSegment$okio();
                Intrinsics.checkNotNull(segment$okio2);
                long j5 = j4 - ((long) (i2 - segment$okio2.pos));
                if (j5 > j2) {
                    segment$okio = getSegment$okio();
                    size = j5;
                } else {
                    segmentPush = getSegment$okio();
                    j3 = j5;
                }
            }
            if (size - j2 > j2 - j3) {
                while (true) {
                    Intrinsics.checkNotNull(segmentPush);
                    if (j2 < ((long) (segmentPush.limit - segmentPush.pos)) + j3) {
                        break;
                    }
                    j3 += (long) (segmentPush.limit - segmentPush.pos);
                    segmentPush = segmentPush.next;
                }
            } else {
                while (size > j2) {
                    Intrinsics.checkNotNull(segment$okio);
                    segment$okio = segment$okio.prev;
                    Intrinsics.checkNotNull(segment$okio);
                    size -= (long) (segment$okio.limit - segment$okio.pos);
                }
                j3 = size;
                segmentPush = segment$okio;
            }
            if (this.readWrite) {
                Intrinsics.checkNotNull(segmentPush);
                if (segmentPush.shared) {
                    Segment segmentUnsharedCopy = segmentPush.unsharedCopy();
                    if (buffer.head == segmentPush) {
                        buffer.head = segmentUnsharedCopy;
                    }
                    segmentPush = segmentPush.push(segmentUnsharedCopy);
                    Segment segment = segmentPush.prev;
                    Intrinsics.checkNotNull(segment);
                    segment.pop();
                }
            }
            setSegment$okio(segmentPush);
            this.offset = j2;
            Intrinsics.checkNotNull(segmentPush);
            this.data = segmentPush.data;
            this.start = segmentPush.pos + ((int) (j2 - j3));
            int i3 = segmentPush.limit;
            this.end = i3;
            return i3 - this.start;
        }

        public final void setSegment$okio(Segment segment) {
            this.segment = segment;
        }
    }

    /* JADX INFO: renamed from: okio.Buffer$inputStream$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я)\u001d̉=!4i\bӵLc\u0003\nIي8\u000b<B\u0007\"2\u0012\u007f\u0007tzA0JfP.`_2ş\u0014zé*c:ڎs;\u0004\u0019F(\u0017Ofg\u0016o\u0011nSI\u001d\b.x\u0019/\u0010iAc \u0013JB\u001e@ya8[Gd\r63!b&F~\u001d\u0001H0x\u0014\u0005\u0002[K:\u0013`D~Bj\r{\u0006`&ND.\n6\\\u0016X|\\ǶaE"}, d2 = {"=jX<\"\tNT\u001a~\b\u001d0\u0006\u0014?tm7\t@|\u001fU\u0013", "\u001aiPCTuB]bb\u0004i<\fv>r\u007f$\u0004\u0016", "/uP6_(;Z\u0019", "", "1k^@X", "", "@dP1", "Ah]8", "", "=eU@X;", "0xc266N\\(", "BnBAe0GU", "", "=jX<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass1 extends InputStream {
        AnonymousClass1() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(Buffer.this.size(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            if (Buffer.this.size() > 0) {
                return Buffer.this.readByte() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public int read(byte[] sink, int i2, int i3) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            return Buffer.this.read(sink, i2, i3);
        }

        public String toString() {
            return Buffer.this + ".inputStream()";
        }
    }

    /* JADX INFO: renamed from: okio.Buffer$outputStream$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я+\u001d̉=!4i\bӵLc\u0003\u0004I\u00066\u000b6B\r.4\u0012}\u0007njG@L͜P.`Y2\u000fq|\\#Ӌ*yYП\u0006\u001a,!QU\\g\u007fnx[QWW\f$z\u0003,wV?qZ\u0015@E\b?aQ6Q\u0002~\u0003;\u001d `#h}\u0013\u00072*v\u0017'~QS$\u0012^I!>`\u0017e\u0005H\u001bLRh\u000f,a\u007fNdI\u001daH:;\u0003\u0018K\u0015;ۨ4\t"}, d2 = {"=jX<\"\tNT\u001a~\b\u001d6\r\u0018:u\u000f\u0016\u000bM\u0001\u0013\u001f\u0006;", "\u001aiPCTuB]bh\u000bm7\r\u0018\u001dt\r(wHV", "1k^@X", "", "4kd@[", "BnBAe0GU", "", "EqXAX", "2`c.", "", "=eU@X;", "", "0xc266N\\(", AdkSettings.PLATFORM_TYPE_MOBILE, "=jX<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class C14561 extends OutputStream {
        C14561() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }

        public String toString() {
            return Buffer.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i2) {
            Buffer.this.writeByte(i2);
        }

        @Override // java.io.OutputStream
        public void write(byte[] data, int i2, int i3) {
            Intrinsics.checkNotNullParameter(data, "data");
            Buffer.this.write(data, i2, i3);
        }
    }

    public static /* synthetic */ Buffer copyTo$default(Buffer buffer, OutputStream outputStream, long j2, long j3, int i2, Object obj) throws IOException {
        if ((i2 + 2) - (2 | i2) != 0) {
            j2 = 0;
        }
        if ((i2 & 4) != 0) {
            j3 = buffer.size - j2;
        }
        return buffer.copyTo(outputStream, j2, j3);
    }

    public static /* synthetic */ Buffer copyTo$default(Buffer buffer, Buffer buffer2, long j2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = 0;
        }
        return buffer.copyTo(buffer2, j2);
    }

    public static /* synthetic */ Buffer copyTo$default(Buffer buffer, Buffer buffer2, long j2, long j3, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            j2 = 0;
        }
        return buffer.copyTo(buffer2, j2, j3);
    }

    private final ByteString digest(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        Segment segment = this.head;
        if (segment != null) {
            messageDigest.update(segment.data, segment.pos, segment.limit - segment.pos);
            Segment segment2 = segment.next;
            Intrinsics.checkNotNull(segment2);
            while (segment2 != segment) {
                messageDigest.update(segment2.data, segment2.pos, segment2.limit - segment2.pos);
                segment2 = segment2.next;
                Intrinsics.checkNotNull(segment2);
            }
        }
        byte[] bArrDigest = messageDigest.digest();
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "digest(...)");
        return new ByteString(bArrDigest);
    }

    private final ByteString hmac(String str, ByteString byteString) throws NoSuchAlgorithmException {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(byteString.internalArray$okio(), str));
            Segment segment = this.head;
            if (segment != null) {
                mac.update(segment.data, segment.pos, segment.limit - segment.pos);
                Segment segment2 = segment.next;
                Intrinsics.checkNotNull(segment2);
                while (segment2 != segment) {
                    mac.update(segment2.data, segment2.pos, segment2.limit - segment2.pos);
                    segment2 = segment2.next;
                    Intrinsics.checkNotNull(segment2);
                }
            }
            byte[] bArrDoFinal = mac.doFinal();
            Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "doFinal(...)");
            return new ByteString(bArrDoFinal);
        } catch (InvalidKeyException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static /* synthetic */ UnsafeCursor readAndWriteUnsafe$default(Buffer buffer, UnsafeCursor unsafeCursor, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            unsafeCursor = SegmentedByteString.getDEFAULT__new_UnsafeCursor();
        }
        return buffer.readAndWriteUnsafe(unsafeCursor);
    }

    private final void readFrom(InputStream inputStream, long j2, boolean z2) throws IOException {
        while (true) {
            if (j2 <= 0 && !z2) {
                return;
            }
            Segment segmentWritableSegment$okio = writableSegment$okio(1);
            int i2 = inputStream.read(segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, (int) Math.min(j2, 8192 - segmentWritableSegment$okio.limit));
            if (i2 == -1) {
                if (segmentWritableSegment$okio.pos == segmentWritableSegment$okio.limit) {
                    this.head = segmentWritableSegment$okio.pop();
                    SegmentPool.recycle(segmentWritableSegment$okio);
                }
                if (!z2) {
                    throw new EOFException();
                }
                return;
            }
            segmentWritableSegment$okio.limit += i2;
            long j3 = i2;
            this.size += j3;
            j2 -= j3;
        }
    }

    public static /* synthetic */ UnsafeCursor readUnsafe$default(Buffer buffer, UnsafeCursor unsafeCursor, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            unsafeCursor = SegmentedByteString.getDEFAULT__new_UnsafeCursor();
        }
        return buffer.readUnsafe(unsafeCursor);
    }

    public static /* synthetic */ Buffer writeTo$default(Buffer buffer, OutputStream outputStream, long j2, int i2, Object obj) throws IOException {
        if ((i2 + 2) - (i2 | 2) != 0) {
            j2 = buffer.size;
        }
        return buffer.writeTo(outputStream, j2);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018V8\u007fb\u0016@]n\f\u000f<\u0013k [\u0006T", replaceWith = @ReplaceWith(expression = "this[index]", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_getByte */
    public final byte m10795deprecated_getByte(long j2) {
        return getByte(j2);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = RRWebVideoEvent.JsonKeys.SIZE, imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_size */
    public final long m10796deprecated_size() {
        return this.size;
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    public Buffer buffer() {
        return this;
    }

    public final void clear() throws EOFException {
        skip(size());
    }

    public Buffer clone() {
        return copy();
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final long completeSegmentByteCount() {
        long size = size();
        if (size == 0) {
            return 0L;
        }
        Segment segment = this.head;
        Intrinsics.checkNotNull(segment);
        Segment segment2 = segment.prev;
        Intrinsics.checkNotNull(segment2);
        if (segment2.limit < 8192 && segment2.owner) {
            size -= (long) (segment2.limit - segment2.pos);
        }
        return size;
    }

    public final Buffer copy() {
        Buffer buffer = new Buffer();
        if (size() != 0) {
            Segment segment = this.head;
            Intrinsics.checkNotNull(segment);
            Segment segmentSharedCopy = segment.sharedCopy();
            buffer.head = segmentSharedCopy;
            segmentSharedCopy.prev = segmentSharedCopy;
            segmentSharedCopy.next = segmentSharedCopy.prev;
            for (Segment segment2 = segment.next; segment2 != segment; segment2 = segment2.next) {
                Segment segment3 = segmentSharedCopy.prev;
                Intrinsics.checkNotNull(segment3);
                Intrinsics.checkNotNull(segment2);
                segment3.push(segment2.sharedCopy());
            }
            buffer.setSize$okio(size());
        }
        return buffer;
    }

    public final Buffer copyTo(OutputStream out) throws IOException {
        Intrinsics.checkNotNullParameter(out, "out");
        return copyTo$default(this, out, 0L, 0L, 6, (Object) null);
    }

    public final Buffer copyTo(OutputStream out, long j2) throws IOException {
        Intrinsics.checkNotNullParameter(out, "out");
        return copyTo$default(this, out, j2, 0L, 4, (Object) null);
    }

    public final Buffer copyTo(OutputStream out, long j2, long j3) throws IOException {
        long j4 = j3;
        long j5 = j2;
        Intrinsics.checkNotNullParameter(out, "out");
        SegmentedByteString.checkOffsetAndCount(this.size, j5, j4);
        if (j4 == 0) {
            return this;
        }
        Segment segment = this.head;
        while (true) {
            Intrinsics.checkNotNull(segment);
            if (j5 < segment.limit - segment.pos) {
                break;
            }
            j5 -= (long) (segment.limit - segment.pos);
            segment = segment.next;
        }
        while (j4 > 0) {
            Intrinsics.checkNotNull(segment);
            int i2 = (int) (((long) segment.pos) + j5);
            int iMin = (int) Math.min(segment.limit - i2, j4);
            out.write(segment.data, i2, iMin);
            j4 -= (long) iMin;
            segment = segment.next;
            j5 = 0;
        }
        return this;
    }

    public final Buffer copyTo(Buffer out, long j2) {
        Intrinsics.checkNotNullParameter(out, "out");
        return copyTo(out, j2, this.size - j2);
    }

    public final Buffer copyTo(Buffer out, long j2, long j3) {
        long j4 = j3;
        long j5 = j2;
        Intrinsics.checkNotNullParameter(out, "out");
        SegmentedByteString.checkOffsetAndCount(size(), j5, j4);
        if (j4 != 0) {
            out.setSize$okio(out.size() + j4);
            Segment segment = this.head;
            while (true) {
                Intrinsics.checkNotNull(segment);
                if (j5 < segment.limit - segment.pos) {
                    break;
                }
                j5 -= (long) (segment.limit - segment.pos);
                segment = segment.next;
            }
            while (j4 > 0) {
                Intrinsics.checkNotNull(segment);
                Segment segmentSharedCopy = segment.sharedCopy();
                segmentSharedCopy.pos += (int) j5;
                segmentSharedCopy.limit = Math.min(segmentSharedCopy.pos + ((int) j4), segmentSharedCopy.limit);
                Segment segment2 = out.head;
                if (segment2 == null) {
                    segmentSharedCopy.prev = segmentSharedCopy;
                    segmentSharedCopy.next = segmentSharedCopy.prev;
                    out.head = segmentSharedCopy.next;
                } else {
                    Intrinsics.checkNotNull(segment2);
                    Segment segment3 = segment2.prev;
                    Intrinsics.checkNotNull(segment3);
                    segment3.push(segmentSharedCopy);
                }
                j4 -= (long) (segmentSharedCopy.limit - segmentSharedCopy.pos);
                segment = segment.next;
                j5 = 0;
            }
        }
        return this;
    }

    @Override // okio.BufferedSink
    public Buffer emit() {
        return this;
    }

    @Override // okio.BufferedSink
    public Buffer emitCompleteSegments() {
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Buffer) {
            Buffer buffer = (Buffer) obj;
            if (size() == buffer.size()) {
                if (size() == 0) {
                    return true;
                }
                Segment segment = this.head;
                Intrinsics.checkNotNull(segment);
                Segment segment2 = buffer.head;
                Intrinsics.checkNotNull(segment2);
                int i2 = segment.pos;
                int i3 = segment2.pos;
                long j2 = 0;
                while (j2 < size()) {
                    long jMin = Math.min(segment.limit - i2, segment2.limit - i3);
                    long j3 = 0;
                    while (j3 < jMin) {
                        int i4 = i2 + 1;
                        int i5 = i3 + 1;
                        if (segment.data[i2] == segment2.data[i3]) {
                            j3++;
                            i2 = i4;
                            i3 = i5;
                        }
                    }
                    if (i2 == segment.limit) {
                        segment = segment.next;
                        Intrinsics.checkNotNull(segment);
                        i2 = segment.pos;
                    }
                    if (i3 == segment2.limit) {
                        segment2 = segment2.next;
                        Intrinsics.checkNotNull(segment2);
                        i3 = segment2.pos;
                    }
                    j2 += jMin;
                }
                return true;
            }
        }
        return false;
    }

    @Override // okio.BufferedSource
    public boolean exhausted() {
        return this.size == 0;
    }

    @Override // okio.BufferedSink, okio.Sink, java.io.Flushable
    public void flush() {
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    public Buffer getBuffer() {
        return this;
    }

    public final byte getByte(long j2) {
        SegmentedByteString.checkOffsetAndCount(size(), j2, 1L);
        Segment segment = this.head;
        if (segment == null) {
            Segment segment2 = null;
            Intrinsics.checkNotNull(null);
            byte[] bArr = segment2.data;
            throw null;
        }
        if (size() - j2 < j2) {
            long size = size();
            while (size > j2) {
                segment = segment.prev;
                Intrinsics.checkNotNull(segment);
                size -= (long) (segment.limit - segment.pos);
            }
            Intrinsics.checkNotNull(segment);
            return segment.data[(int) ((((long) segment.pos) + j2) - size)];
        }
        long j3 = 0;
        while (true) {
            long j4 = ((long) (segment.limit - segment.pos)) + j3;
            if (j4 > j2) {
                Intrinsics.checkNotNull(segment);
                return segment.data[(int) ((((long) segment.pos) + j2) - j3)];
            }
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            j3 = j4;
        }
    }

    public int hashCode() {
        Segment segment = this.head;
        if (segment == null) {
            return 0;
        }
        int i2 = 1;
        do {
            int i3 = segment.limit;
            for (int i4 = segment.pos; i4 < i3; i4++) {
                i2 = (i2 * 31) + segment.data[i4];
            }
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
        } while (segment != this.head);
        return i2;
    }

    public final ByteString hmacSha1(ByteString key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return hmac("HmacSHA1", key);
    }

    public final ByteString hmacSha256(ByteString key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return hmac("HmacSHA256", key);
    }

    public final ByteString hmacSha512(ByteString key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return hmac("HmacSHA512", key);
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b2) {
        return indexOf(b2, 0L, Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b2, long j2) {
        return indexOf(b2, j2, Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b2, long j2, long j3) {
        Segment segment;
        int i2;
        long size = 0;
        if (0 > j2 || j2 > j3) {
            throw new IllegalArgumentException(("size=" + size() + " fromIndex=" + j2 + " toIndex=" + j3).toString());
        }
        if (j3 > size()) {
            j3 = size();
        }
        if (j2 == j3 || (segment = this.head) == null) {
            return -1L;
        }
        if (size() - j2 < j2) {
            size = size();
            while (size > j2) {
                segment = segment.prev;
                Intrinsics.checkNotNull(segment);
                size -= (long) (segment.limit - segment.pos);
            }
            if (segment == null) {
                return -1L;
            }
            while (size < j3) {
                byte[] bArr = segment.data;
                int iMin = (int) Math.min(segment.limit, (((long) segment.pos) + j3) - size);
                i2 = (int) ((((long) segment.pos) + j2) - size);
                while (i2 < iMin) {
                    if (bArr[i2] != b2) {
                        i2++;
                    }
                }
                size += (long) (segment.limit - segment.pos);
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                j2 = size;
            }
            return -1L;
        }
        while (true) {
            long j4 = ((long) (segment.limit - segment.pos)) + size;
            if (j4 > j2) {
                break;
            }
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            size = j4;
        }
        if (segment == null) {
            return -1L;
        }
        while (size < j3) {
            byte[] bArr2 = segment.data;
            int iMin2 = (int) Math.min(segment.limit, (((long) segment.pos) + j3) - size);
            i2 = (int) ((((long) segment.pos) + j2) - size);
            while (i2 < iMin2) {
                if (bArr2[i2] != b2) {
                    i2++;
                }
            }
            size += (long) (segment.limit - segment.pos);
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            j2 = size;
        }
        return -1L;
        return ((long) (i2 - segment.pos)) + size;
    }

    @Override // okio.BufferedSource
    public long indexOf(ByteString bytes) throws IOException {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return indexOf(bytes, 0L);
    }

    @Override // okio.BufferedSource
    public long indexOf(ByteString bytes, long j2) throws IOException {
        int i2;
        long j3 = j2;
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (bytes.size() <= 0) {
            throw new IllegalArgumentException("bytes is empty".toString());
        }
        long size = 0;
        if (j3 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j3).toString());
        }
        Segment segment = this.head;
        if (segment != null) {
            if (size() - j3 < j3) {
                size = size();
                while (size > j3) {
                    segment = segment.prev;
                    Intrinsics.checkNotNull(segment);
                    size -= (long) (segment.limit - segment.pos);
                }
                if (segment != null) {
                    byte[] bArrInternalArray$okio = bytes.internalArray$okio();
                    byte b2 = bArrInternalArray$okio[0];
                    int size2 = bytes.size();
                    long size3 = (size() - ((long) size2)) + 1;
                    while (size < size3) {
                        byte[] bArr = segment.data;
                        int iMin = (int) Math.min(segment.limit, (((long) segment.pos) + size3) - size);
                        i2 = (int) ((((long) segment.pos) + j3) - size);
                        while (i2 < iMin) {
                            if (bArr[i2] == b2 && okio.internal.Buffer.rangeEquals(segment, i2 + 1, bArrInternalArray$okio, 1, size2)) {
                                return ((long) (i2 - segment.pos)) + size;
                            }
                            i2++;
                        }
                        size += (long) (segment.limit - segment.pos);
                        segment = segment.next;
                        Intrinsics.checkNotNull(segment);
                        j3 = size;
                    }
                }
            } else {
                while (true) {
                    long j4 = ((long) (segment.limit - segment.pos)) + size;
                    if (j4 > j3) {
                        break;
                    }
                    segment = segment.next;
                    Intrinsics.checkNotNull(segment);
                    size = j4;
                }
                if (segment != null) {
                    byte[] bArrInternalArray$okio2 = bytes.internalArray$okio();
                    byte b3 = bArrInternalArray$okio2[0];
                    int size4 = bytes.size();
                    long size5 = (size() - ((long) size4)) + 1;
                    while (size < size5) {
                        byte[] bArr2 = segment.data;
                        int iMin2 = (int) Math.min(segment.limit, (((long) segment.pos) + size5) - size);
                        i2 = (int) ((((long) segment.pos) + j3) - size);
                        while (i2 < iMin2) {
                            if (bArr2[i2] == b3 && okio.internal.Buffer.rangeEquals(segment, i2 + 1, bArrInternalArray$okio2, 1, size4)) {
                                return ((long) (i2 - segment.pos)) + size;
                            }
                            i2++;
                        }
                        size += (long) (segment.limit - segment.pos);
                        segment = segment.next;
                        Intrinsics.checkNotNull(segment);
                        j3 = size;
                    }
                }
            }
        }
        return -1L;
    }

    @Override // okio.BufferedSource
    public long indexOfElement(ByteString targetBytes) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        return indexOfElement(targetBytes, 0L);
    }

    @Override // okio.BufferedSource
    public long indexOfElement(ByteString targetBytes, long j2) {
        int i2;
        int i3;
        long j3 = j2;
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        long size = 0;
        if (j3 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j3).toString());
        }
        Segment segment = this.head;
        if (segment == null) {
            return -1L;
        }
        if (size() - j3 < j3) {
            size = size();
            while (size > j3) {
                segment = segment.prev;
                Intrinsics.checkNotNull(segment);
                size -= (long) (segment.limit - segment.pos);
            }
            if (segment == null) {
                return -1L;
            }
            if (targetBytes.size() == 2) {
                byte b2 = targetBytes.getByte(0);
                byte b3 = targetBytes.getByte(1);
                while (size < size()) {
                    byte[] bArr = segment.data;
                    i2 = (int) ((((long) segment.pos) + j3) - size);
                    int i4 = segment.limit;
                    while (i2 < i4) {
                        byte b4 = bArr[i2];
                        if (b4 == b2 || b4 == b3) {
                            i3 = segment.pos;
                        } else {
                            i2++;
                        }
                    }
                    size += (long) (segment.limit - segment.pos);
                    segment = segment.next;
                    Intrinsics.checkNotNull(segment);
                    j3 = size;
                }
                return -1L;
            }
            byte[] bArrInternalArray$okio = targetBytes.internalArray$okio();
            while (size < size()) {
                byte[] bArr2 = segment.data;
                i2 = (int) ((((long) segment.pos) + j3) - size);
                int i5 = segment.limit;
                while (i2 < i5) {
                    byte b5 = bArr2[i2];
                    for (byte b6 : bArrInternalArray$okio) {
                        if (b5 == b6) {
                            i3 = segment.pos;
                        }
                    }
                    i2++;
                }
                size += (long) (segment.limit - segment.pos);
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                j3 = size;
            }
            return -1L;
        }
        while (true) {
            long j4 = ((long) (segment.limit - segment.pos)) + size;
            if (j4 > j3) {
                break;
            }
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            size = j4;
        }
        if (segment == null) {
            return -1L;
        }
        if (targetBytes.size() == 2) {
            byte b7 = targetBytes.getByte(0);
            byte b8 = targetBytes.getByte(1);
            while (size < size()) {
                byte[] bArr3 = segment.data;
                i2 = (int) ((((long) segment.pos) + j3) - size);
                int i6 = segment.limit;
                while (i2 < i6) {
                    byte b9 = bArr3[i2];
                    if (b9 == b7 || b9 == b8) {
                        i3 = segment.pos;
                    } else {
                        i2++;
                    }
                }
                size += (long) (segment.limit - segment.pos);
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                j3 = size;
            }
            return -1L;
        }
        byte[] bArrInternalArray$okio2 = targetBytes.internalArray$okio();
        while (size < size()) {
            byte[] bArr4 = segment.data;
            i2 = (int) ((((long) segment.pos) + j3) - size);
            int i7 = segment.limit;
            while (i2 < i7) {
                byte b10 = bArr4[i2];
                for (byte b11 : bArrInternalArray$okio2) {
                    if (b10 == b11) {
                        i3 = segment.pos;
                    }
                }
                i2++;
            }
            size += (long) (segment.limit - segment.pos);
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            j3 = size;
        }
        return -1L;
        return ((long) (i2 - i3)) + size;
    }

    @Override // okio.BufferedSource
    public InputStream inputStream() {
        return new InputStream() { // from class: okio.Buffer.inputStream.1
            AnonymousClass1() {
            }

            @Override // java.io.InputStream
            public int available() {
                return (int) Math.min(Buffer.this.size(), Integer.MAX_VALUE);
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // java.io.InputStream
            public int read() {
                if (Buffer.this.size() > 0) {
                    return Buffer.this.readByte() & 255;
                }
                return -1;
            }

            @Override // java.io.InputStream
            public int read(byte[] sink, int i2, int i3) {
                Intrinsics.checkNotNullParameter(sink, "sink");
                return Buffer.this.read(sink, i2, i3);
            }

            public String toString() {
                return Buffer.this + ".inputStream()";
            }
        };
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public final ByteString md5() {
        return digest(MessageDigestAlgorithms.MD5);
    }

    @Override // okio.BufferedSink
    public OutputStream outputStream() {
        return new OutputStream() { // from class: okio.Buffer.outputStream.1
            C14561() {
            }

            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() {
            }

            public String toString() {
                return Buffer.this + ".outputStream()";
            }

            @Override // java.io.OutputStream
            public void write(int i2) {
                Buffer.this.writeByte(i2);
            }

            @Override // java.io.OutputStream
            public void write(byte[] data, int i2, int i3) {
                Intrinsics.checkNotNullParameter(data, "data");
                Buffer.this.write(data, i2, i3);
            }
        };
    }

    @Override // okio.BufferedSource
    public BufferedSource peek() {
        return Okio.buffer(new PeekSource(this));
    }

    @Override // okio.BufferedSource
    public boolean rangeEquals(long j2, ByteString bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return rangeEquals(j2, bytes, 0, bytes.size());
    }

    @Override // okio.BufferedSource
    public boolean rangeEquals(long j2, ByteString bytes, int i2, int i3) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (j2 < 0 || i2 < 0 || i3 < 0 || size() - j2 < i3 || bytes.size() - i2 < i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (getByte(((long) i4) + j2) != bytes.getByte(i2 + i4)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Segment segment = this.head;
        if (segment == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), segment.limit - segment.pos);
        sink.put(segment.data, segment.pos, iMin);
        segment.pos += iMin;
        this.size -= (long) iMin;
        if (segment.pos == segment.limit) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return iMin;
    }

    @Override // okio.BufferedSource
    public int read(byte[] sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        return read(sink, 0, sink.length);
    }

    @Override // okio.BufferedSource
    public int read(byte[] sink, int i2, int i3) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        SegmentedByteString.checkOffsetAndCount(sink.length, i2, i3);
        Segment segment = this.head;
        if (segment == null) {
            return -1;
        }
        int iMin = Math.min(i3, segment.limit - segment.pos);
        ArraysKt.copyInto(segment.data, sink, i2, segment.pos, segment.pos + iMin);
        segment.pos += iMin;
        setSize$okio(size() - ((long) iMin));
        if (segment.pos != segment.limit) {
            return iMin;
        }
        this.head = segment.pop();
        SegmentPool.recycle(segment);
        return iMin;
    }

    @Override // okio.Source
    public long read(Buffer sink, long j2) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j2 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        if (size() == 0) {
            return -1L;
        }
        if (j2 > size()) {
            j2 = size();
        }
        sink.write(this, j2);
        return j2;
    }

    @Override // okio.BufferedSource
    public long readAll(Sink sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long size = size();
        if (size > 0) {
            sink.write(this, size);
        }
        return size;
    }

    public final UnsafeCursor readAndWriteUnsafe() {
        return readAndWriteUnsafe$default(this, null, 1, null);
    }

    public final UnsafeCursor readAndWriteUnsafe(UnsafeCursor unsafeCursor) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        return okio.internal.Buffer.commonReadAndWriteUnsafe(this, unsafeCursor);
    }

    @Override // okio.BufferedSource
    public byte readByte() throws EOFException {
        if (size() == 0) {
            throw new EOFException();
        }
        Segment segment = this.head;
        Intrinsics.checkNotNull(segment);
        int i2 = segment.pos;
        int i3 = segment.limit;
        int i4 = i2 + 1;
        byte b2 = segment.data[i2];
        setSize$okio(size() - 1);
        if (i4 == i3) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i4;
        }
        return b2;
    }

    @Override // okio.BufferedSource
    public byte[] readByteArray() {
        return readByteArray(size());
    }

    @Override // okio.BufferedSource
    public byte[] readByteArray(long j2) throws EOFException {
        if (j2 < 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j2).toString());
        }
        if (size() < j2) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j2];
        readFully(bArr);
        return bArr;
    }

    @Override // okio.BufferedSource
    public ByteString readByteString() {
        return readByteString(size());
    }

    @Override // okio.BufferedSource
    public ByteString readByteString(long j2) throws EOFException {
        if (j2 < 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j2).toString());
        }
        if (size() < j2) {
            throw new EOFException();
        }
        if (j2 < 4096) {
            return new ByteString(readByteArray(j2));
        }
        ByteString byteStringSnapshot = snapshot((int) j2);
        skip(j2);
        return byteStringSnapshot;
    }

    @Override // okio.BufferedSource
    public long readDecimalLong() throws EOFException {
        long j2 = 0;
        if (size() == 0) {
            throw new EOFException();
        }
        int i2 = 0;
        long j3 = -7;
        boolean z2 = false;
        boolean z3 = false;
        do {
            Segment segment = this.head;
            Intrinsics.checkNotNull(segment);
            byte[] bArr = segment.data;
            int i3 = segment.pos;
            int i4 = segment.limit;
            while (i3 < i4) {
                byte b2 = bArr[i3];
                if (b2 >= 48 && b2 <= 57) {
                    int i5 = 48 - b2;
                    if (j2 < okio.internal.Buffer.OVERFLOW_ZONE || (j2 == okio.internal.Buffer.OVERFLOW_ZONE && i5 < j3)) {
                        Buffer bufferWriteByte = new Buffer().writeDecimalLong(j2).writeByte((int) b2);
                        if (!z2) {
                            bufferWriteByte.readByte();
                        }
                        throw new NumberFormatException("Number too large: " + bufferWriteByte.readUtf8());
                    }
                    j2 = (j2 * 10) + ((long) i5);
                } else {
                    if (b2 != 45 || i2 != 0) {
                        z3 = true;
                        break;
                    }
                    j3--;
                    z2 = true;
                }
                i3++;
                i2++;
            }
            if (i3 == i4) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i3;
            }
            if (z3) {
                break;
            }
        } while (this.head != null);
        setSize$okio(size() - ((long) i2));
        if (i2 >= (z2 ? 2 : 1)) {
            return z2 ? j2 : -j2;
        }
        if (size() != 0) {
            throw new NumberFormatException((z2 ? "Expected a digit" : "Expected a digit or '-'") + " but was 0x" + SegmentedByteString.toHexString(getByte(0L)));
        }
        throw new EOFException();
    }

    public final Buffer readFrom(InputStream input) throws IOException {
        Intrinsics.checkNotNullParameter(input, "input");
        readFrom(input, Long.MAX_VALUE, true);
        return this;
    }

    public final Buffer readFrom(InputStream input, long j2) throws IOException {
        Intrinsics.checkNotNullParameter(input, "input");
        if (j2 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        readFrom(input, j2, false);
        return this;
    }

    @Override // okio.BufferedSource
    public void readFully(Buffer sink, long j2) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (size() >= j2) {
            sink.write(this, j2);
        } else {
            sink.write(this, size());
            throw new EOFException();
        }
    }

    @Override // okio.BufferedSource
    public void readFully(byte[] sink) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        int i2 = 0;
        while (i2 < sink.length) {
            int i3 = read(sink, i2, sink.length - i2);
            if (i3 == -1) {
                throw new EOFException();
            }
            i2 += i3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0060 A[EDGE_INSN: B:91:0x0060->B:81:0x0060 BREAK  A[LOOP:0: B:54:0x000d->B:94:?], SYNTHETIC] */
    @Override // okio.BufferedSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long readHexadecimalUnsignedLong() throws java.io.EOFException {
        /*
            r15 = this;
            long r1 = r15.size()
            r13 = 0
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r0 == 0) goto Lac
            r6 = 0
            r12 = r6
            r4 = r13
        Ld:
            okio.Segment r9 = r15.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r9)
            byte[] r10 = r9.data
            int r8 = r9.pos
            int r7 = r9.limit
        L18:
            if (r8 >= r7) goto L4f
            r3 = r10[r8]
            r0 = 48
            if (r3 < r0) goto L36
            r0 = 57
            if (r3 > r0) goto L36
            int r11 = r3 + (-48)
        L26:
            r1 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r1 = r1 & r4
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r0 != 0) goto L6d
            r0 = 4
            long r4 = r4 << r0
            long r0 = (long) r11
            long r4 = r4 | r0
            int r8 = r8 + 1
            int r6 = r6 + 1
            goto L18
        L36:
            r0 = 97
            if (r3 < r0) goto L41
            r0 = 102(0x66, float:1.43E-43)
            if (r3 > r0) goto L41
            int r11 = r3 + (-87)
            goto L26
        L41:
            r0 = 65
            if (r3 < r0) goto L4c
            r0 = 70
            if (r3 > r0) goto L4c
            int r11 = r3 + (-55)
            goto L26
        L4c:
            if (r6 == 0) goto L93
            r12 = 1
        L4f:
            if (r8 != r7) goto L6a
            okio.Segment r0 = r9.pop()
            r15.head = r0
            okio.SegmentPool.recycle(r9)
        L5a:
            if (r12 != 0) goto L60
            okio.Segment r0 = r15.head
            if (r0 != 0) goto Ld
        L60:
            long r2 = r15.size()
            long r0 = (long) r6
            long r2 = r2 - r0
            r15.setSize$okio(r2)
            return r4
        L6a:
            r9.pos = r8
            goto L5a
        L6d:
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            okio.Buffer r0 = r0.writeHexadecimalUnsignedLong(r4)
            okio.Buffer r3 = r0.writeByte(r3)
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "Number too large: "
            r1.<init>(r0)
            java.lang.String r0 = r3.readUtf8()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L93:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.<init>(r0)
            java.lang.String r0 = okio.SegmentedByteString.toHexString(r3)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        Lac:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Buffer.readHexadecimalUnsignedLong():long");
    }

    @Override // okio.BufferedSource
    public int readInt() throws EOFException {
        if (size() < 4) {
            throw new EOFException();
        }
        Segment segment = this.head;
        Intrinsics.checkNotNull(segment);
        int i2 = segment.pos;
        int i3 = segment.limit;
        if (i3 - i2 < 4) {
            byte b2 = readByte();
            int i4 = ((b2 + 255) - (b2 | 255)) << 24;
            int i5 = ((-1) - (((-1) - readByte()) | ((-1) - 255))) << 16;
            return ((-1) - (((-1) - ((i4 + i5) - (i4 & i5))) & ((-1) - ((readByte() & 255) << 8)))) | ((-1) - (((-1) - readByte()) | ((-1) - 255)));
        }
        byte[] bArr = segment.data;
        int i6 = i2 + 3;
        int i7 = ((-1) - (((-1) - ((bArr[i2 + 1] & 255) << 16)) & ((-1) - ((bArr[i2] & 255) << 24)))) | (((-1) - (((-1) - bArr[i2 + 2]) | ((-1) - 255))) << 8);
        int i8 = i2 + 4;
        int i9 = bArr[i6] & 255;
        int i10 = (i9 + i7) - (i9 & i7);
        setSize$okio(size() - 4);
        if (i8 != i3) {
            segment.pos = i8;
            return i10;
        }
        this.head = segment.pop();
        SegmentPool.recycle(segment);
        return i10;
    }

    @Override // okio.BufferedSource
    public int readIntLe() throws EOFException {
        return SegmentedByteString.reverseBytes(readInt());
    }

    @Override // okio.BufferedSource
    public long readLong() throws EOFException {
        if (size() < 8) {
            throw new EOFException();
        }
        Segment segment = this.head;
        Intrinsics.checkNotNull(segment);
        int i2 = segment.pos;
        int i3 = segment.limit;
        if (i3 - i2 < 8) {
            long j2 = readInt();
            return (-1) - (((-1) - (((j2 + 4294967295L) - (j2 | 4294967295L)) << 32)) & ((-1) - (4294967295L & ((long) readInt()))));
        }
        byte[] bArr = segment.data;
        long j3 = bArr[i2];
        long j4 = ((j3 + 255) - (j3 | 255)) << 56;
        long j5 = bArr[i2 + 1];
        long j6 = ((j5 + 255) - (j5 | 255)) << 48;
        long j7 = (-1) - (((-1) - ((j4 + j6) - (j4 & j6))) & ((-1) - (((-1) - (((-1) - ((long) bArr[i2 + 2])) | ((-1) - 255))) << 40)));
        long j8 = bArr[i2 + 3];
        long j9 = ((j8 + 255) - (j8 | 255)) << 32;
        long j10 = bArr[i2 + 4];
        long j11 = ((-1) - (((-1) - ((j7 + j9) - (j7 & j9))) & ((-1) - (((j10 + 255) - (j10 | 255)) << 24)))) | ((((long) bArr[i2 + 5]) & 255) << 16);
        int i4 = i2 + 7;
        long j12 = (((long) bArr[i2 + 6]) & 255) << 8;
        long j13 = (j11 + j12) - (j11 & j12);
        int i5 = i2 + 8;
        long j14 = ((long) bArr[i4]) & 255;
        long j15 = (j13 + j14) - (j13 & j14);
        setSize$okio(size() - 8);
        if (i5 != i3) {
            segment.pos = i5;
            return j15;
        }
        this.head = segment.pop();
        SegmentPool.recycle(segment);
        return j15;
    }

    @Override // okio.BufferedSource
    public long readLongLe() throws EOFException {
        return SegmentedByteString.reverseBytes(readLong());
    }

    @Override // okio.BufferedSource
    public short readShort() throws EOFException {
        if (size() < 2) {
            throw new EOFException();
        }
        Segment segment = this.head;
        Intrinsics.checkNotNull(segment);
        int i2 = segment.pos;
        int i3 = segment.limit;
        if (i3 - i2 < 2) {
            byte b2 = readByte();
            return (short) ((((b2 + 255) - (b2 | 255)) << 8) | ((-1) - (((-1) - readByte()) | ((-1) - 255))));
        }
        byte[] bArr = segment.data;
        int i4 = i2 + 1;
        int i5 = (bArr[i2] & 255) << 8;
        int i6 = i2 + 2;
        int i7 = (-1) - (((-1) - bArr[i4]) | ((-1) - 255));
        int i8 = (i7 + i5) - (i7 & i5);
        setSize$okio(size() - 2);
        if (i6 == i3) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i6;
        }
        return (short) i8;
    }

    @Override // okio.BufferedSource
    public short readShortLe() throws EOFException {
        return SegmentedByteString.reverseBytes(readShort());
    }

    @Override // okio.BufferedSource
    public String readString(long j2, Charset charset) throws EOFException {
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (j2 < 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j2).toString());
        }
        if (this.size < j2) {
            throw new EOFException();
        }
        if (j2 == 0) {
            return "";
        }
        Segment segment = this.head;
        Intrinsics.checkNotNull(segment);
        if (((long) segment.pos) + j2 > segment.limit) {
            return new String(readByteArray(j2), charset);
        }
        int i2 = (int) j2;
        String str = new String(segment.data, segment.pos, i2, charset);
        segment.pos += i2;
        this.size -= j2;
        if (segment.pos == segment.limit) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return str;
    }

    @Override // okio.BufferedSource
    public String readString(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        return readString(this.size, charset);
    }

    public final UnsafeCursor readUnsafe() {
        return readUnsafe$default(this, null, 1, null);
    }

    public final UnsafeCursor readUnsafe(UnsafeCursor unsafeCursor) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        return okio.internal.Buffer.commonReadUnsafe(this, unsafeCursor);
    }

    @Override // okio.BufferedSource
    public String readUtf8() {
        return readString(this.size, Charsets.UTF_8);
    }

    @Override // okio.BufferedSource
    public String readUtf8(long j2) throws EOFException {
        return readString(j2, Charsets.UTF_8);
    }

    @Override // okio.BufferedSource
    public int readUtf8CodePoint() throws EOFException {
        int i2;
        int i3;
        int i4;
        if (size() == 0) {
            throw new EOFException();
        }
        byte b2 = getByte(0L);
        if ((b2 + 128) - (128 | b2) == 0) {
            i2 = b2 & 127;
            i4 = 0;
            i3 = 1;
        } else if ((-1) - (((-1) - b2) | ((-1) - CanonMakernoteDirectory.TAG_SENSOR_INFO_ARRAY)) == 192) {
            i2 = (-1) - (((-1) - b2) | ((-1) - 31));
            i3 = 2;
            i4 = 128;
        } else if ((-1) - (((-1) - b2) | ((-1) - 240)) == 224) {
            i2 = b2 & Ascii.SI;
            i3 = 3;
            i4 = 2048;
        } else {
            if ((-1) - (((-1) - b2) | ((-1) - 248)) != 240) {
                skip(1L);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i2 = (b2 + 7) - (7 | b2);
            i3 = 4;
            i4 = 65536;
        }
        long j2 = i3;
        if (size() < j2) {
            throw new EOFException("size < " + i3 + ": " + size() + " (to read code point prefixed 0x" + SegmentedByteString.toHexString(b2) + ')');
        }
        for (int i5 = 1; i5 < i3; i5++) {
            long j3 = i5;
            byte b3 = getByte(j3);
            if ((192 & b3) != 128) {
                skip(j3);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            int i6 = i2 << 6;
            int i7 = (-1) - (((-1) - b3) | ((-1) - 63));
            i2 = (i6 + i7) - (i6 & i7);
        }
        skip(j2);
        return i2 > 1114111 ? Utf8.REPLACEMENT_CODE_POINT : ((55296 > i2 || i2 >= 57344) && i2 >= i4) ? i2 : Utf8.REPLACEMENT_CODE_POINT;
    }

    @Override // okio.BufferedSource
    public String readUtf8Line() throws EOFException {
        long jIndexOf = indexOf((byte) 10);
        if (jIndexOf != -1) {
            return okio.internal.Buffer.readUtf8Line(this, jIndexOf);
        }
        if (size() != 0) {
            return readUtf8(size());
        }
        return null;
    }

    @Override // okio.BufferedSource
    public String readUtf8LineStrict() throws EOFException {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public String readUtf8LineStrict(long j2) throws EOFException {
        if (j2 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j2).toString());
        }
        long j3 = j2 != Long.MAX_VALUE ? j2 + 1 : Long.MAX_VALUE;
        long jIndexOf = indexOf((byte) 10, 0L, j3);
        if (jIndexOf != -1) {
            return okio.internal.Buffer.readUtf8Line(this, jIndexOf);
        }
        if (j3 < size() && getByte(j3 - 1) == 13 && getByte(j3) == 10) {
            return okio.internal.Buffer.readUtf8Line(this, j3);
        }
        Buffer buffer = new Buffer();
        copyTo(buffer, 0L, Math.min(32, size()));
        throw new EOFException("\\n not found: limit=" + Math.min(size(), j2) + " content=" + buffer.readByteString().hex() + Typography.ellipsis);
    }

    @Override // okio.BufferedSource
    public boolean request(long j2) {
        return this.size >= j2;
    }

    @Override // okio.BufferedSource
    public void require(long j2) throws EOFException {
        if (this.size < j2) {
            throw new EOFException();
        }
    }

    @Override // okio.BufferedSource
    public int select(Options options) throws EOFException {
        Intrinsics.checkNotNullParameter(options, "options");
        int iSelectPrefix$default = okio.internal.Buffer.selectPrefix$default(this, options, false, 2, null);
        if (iSelectPrefix$default == -1) {
            return -1;
        }
        skip(options.getByteStrings$okio()[iSelectPrefix$default].size());
        return iSelectPrefix$default;
    }

    @Override // okio.BufferedSource
    public <T> T select(TypedOptions<T> options) throws IOException {
        Intrinsics.checkNotNullParameter(options, "options");
        int iSelect = select(options.getOptions$okio());
        if (iSelect == -1) {
            return null;
        }
        return options.get(iSelect);
    }

    public final void setSize$okio(long j2) {
        this.size = j2;
    }

    public final ByteString sha1() {
        return digest("SHA-1");
    }

    public final ByteString sha256() {
        return digest("SHA-256");
    }

    public final ByteString sha512() {
        return digest("SHA-512");
    }

    public final long size() {
        return this.size;
    }

    @Override // okio.BufferedSource
    public void skip(long j2) throws EOFException {
        while (j2 > 0) {
            Segment segment = this.head;
            if (segment == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j2, segment.limit - segment.pos);
            long j3 = iMin;
            setSize$okio(size() - j3);
            j2 -= j3;
            segment.pos += iMin;
            if (segment.pos == segment.limit) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            }
        }
    }

    public final ByteString snapshot() {
        if (size() <= 2147483647L) {
            return snapshot((int) size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + size()).toString());
    }

    public final ByteString snapshot(int i2) {
        if (i2 == 0) {
            return ByteString.EMPTY;
        }
        SegmentedByteString.checkOffsetAndCount(size(), 0L, i2);
        Segment segment = this.head;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            Intrinsics.checkNotNull(segment);
            if (segment.limit == segment.pos) {
                throw new AssertionError("s.limit == s.pos");
            }
            i4 += segment.limit - segment.pos;
            i5++;
            segment = segment.next;
        }
        byte[][] bArr = new byte[i5][];
        int[] iArr = new int[i5 * 2];
        Segment segment2 = this.head;
        int i6 = 0;
        while (i3 < i2) {
            Intrinsics.checkNotNull(segment2);
            bArr[i6] = segment2.data;
            i3 += segment2.limit - segment2.pos;
            iArr[i6] = Math.min(i3, i2);
            iArr[bArr.length + i6] = segment2.pos;
            segment2.shared = true;
            i6++;
            segment2 = segment2.next;
        }
        return new C1458SegmentedByteString(bArr, iArr);
    }

    @Override // okio.Source
    public Timeout timeout() {
        return Timeout.NONE;
    }

    public String toString() {
        return snapshot().toString();
    }

    public final Segment writableSegment$okio(int i2) {
        if (i2 < 1 || i2 > 8192) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        Segment segment = this.head;
        if (segment != null) {
            Intrinsics.checkNotNull(segment);
            Segment segment2 = segment.prev;
            Intrinsics.checkNotNull(segment2);
            return (segment2.limit + i2 > 8192 || !segment2.owner) ? segment2.push(SegmentPool.take()) : segment2;
        }
        Segment segmentTake = SegmentPool.take();
        this.head = segmentTake;
        segmentTake.prev = segmentTake;
        segmentTake.next = segmentTake;
        return segmentTake;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        int iRemaining = source.remaining();
        int i2 = iRemaining;
        while (i2 > 0) {
            Segment segmentWritableSegment$okio = writableSegment$okio(1);
            int iMin = Math.min(i2, 8192 - segmentWritableSegment$okio.limit);
            source.get(segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, iMin);
            i2 -= iMin;
            segmentWritableSegment$okio.limit += iMin;
        }
        this.size += (long) iRemaining;
        return iRemaining;
    }

    @Override // okio.BufferedSink
    public Buffer write(ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.write$okio(this, 0, byteString.size());
        return this;
    }

    @Override // okio.BufferedSink
    public Buffer write(ByteString byteString, int i2, int i3) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.write$okio(this, i2, i3);
        return this;
    }

    @Override // okio.BufferedSink
    public Buffer write(Source source, long j2) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        while (j2 > 0) {
            long j3 = source.read(this, j2);
            if (j3 == -1) {
                throw new EOFException();
            }
            j2 -= j3;
        }
        return this;
    }

    @Override // okio.BufferedSink
    public Buffer write(byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return write(source, 0, source.length);
    }

    @Override // okio.BufferedSink
    public Buffer write(byte[] source, int i2, int i3) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j2 = i3;
        SegmentedByteString.checkOffsetAndCount(source.length, i2, j2);
        int i4 = i3 + i2;
        while (i2 < i4) {
            Segment segmentWritableSegment$okio = writableSegment$okio(1);
            int iMin = Math.min(i4 - i2, 8192 - segmentWritableSegment$okio.limit);
            int i5 = i2 + iMin;
            ArraysKt.copyInto(source, segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, i2, i5);
            segmentWritableSegment$okio.limit += iMin;
            i2 = i5;
        }
        setSize$okio(size() + j2);
        return this;
    }

    @Override // okio.Sink
    public void write(Buffer source, long j2) {
        Segment segment;
        long j3 = j2;
        Intrinsics.checkNotNullParameter(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this".toString());
        }
        SegmentedByteString.checkOffsetAndCount(source.size(), 0L, j3);
        while (j3 > 0) {
            Segment segment2 = source.head;
            Intrinsics.checkNotNull(segment2);
            int i2 = segment2.limit;
            Intrinsics.checkNotNull(source.head);
            if (j3 < i2 - r0.pos) {
                Segment segment3 = this.head;
                if (segment3 != null) {
                    Intrinsics.checkNotNull(segment3);
                    segment = segment3.prev;
                } else {
                    segment = null;
                }
                if (segment != null && segment.owner) {
                    if ((((long) segment.limit) + j3) - ((long) (segment.shared ? 0 : segment.pos)) <= 8192) {
                        Segment segment4 = source.head;
                        Intrinsics.checkNotNull(segment4);
                        segment4.writeTo(segment, (int) j3);
                        source.setSize$okio(source.size() - j3);
                        setSize$okio(size() + j3);
                        return;
                    }
                }
                Segment segment5 = source.head;
                Intrinsics.checkNotNull(segment5);
                source.head = segment5.split((int) j3);
            }
            Segment segment6 = source.head;
            Intrinsics.checkNotNull(segment6);
            long j4 = segment6.limit - segment6.pos;
            source.head = segment6.pop();
            Segment segment7 = this.head;
            if (segment7 == null) {
                this.head = segment6;
                segment6.prev = segment6;
                segment6.next = segment6.prev;
            } else {
                Intrinsics.checkNotNull(segment7);
                Segment segment8 = segment7.prev;
                Intrinsics.checkNotNull(segment8);
                segment8.push(segment6).compact();
            }
            source.setSize$okio(source.size() - j4);
            setSize$okio(size() + j4);
            j3 -= j4;
        }
    }

    @Override // okio.BufferedSink
    public long writeAll(Source source) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        long j2 = 0;
        while (true) {
            long j3 = source.read(this, 8192L);
            if (j3 == -1) {
                return j2;
            }
            j2 += j3;
        }
    }

    @Override // okio.BufferedSink
    public Buffer writeByte(int i2) {
        Segment segmentWritableSegment$okio = writableSegment$okio(1);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i3 = segmentWritableSegment$okio.limit;
        segmentWritableSegment$okio.limit = i3 + 1;
        bArr[i3] = (byte) i2;
        setSize$okio(size() + 1);
        return this;
    }

    @Override // okio.BufferedSink
    public Buffer writeDecimalLong(long j2) {
        boolean z2;
        if (j2 == 0) {
            return writeByte(48);
        }
        int i2 = 1;
        if (j2 < 0) {
            j2 = -j2;
            if (j2 < 0) {
                return writeUtf8("-9223372036854775808");
            }
            z2 = true;
        } else {
            z2 = false;
        }
        if (j2 >= 100000000) {
            i2 = j2 < 1000000000000L ? j2 < RealConnection.IDLE_CONNECTION_HEALTHY_NS ? j2 < MathMethodsKt.NANOS_PER_SECOND ? 9 : 10 : j2 < 100000000000L ? 11 : 12 : j2 < 1000000000000000L ? j2 < 10000000000000L ? 13 : j2 < 100000000000000L ? 14 : 15 : j2 < 100000000000000000L ? j2 < 10000000000000000L ? 16 : 17 : j2 < EnrichmentAttributesGenerator.SEND_NOW_PLACEHOLDER ? 18 : 19;
        } else if (j2 >= 10000) {
            i2 = j2 < AnimationKt.MillisToNanos ? j2 < 100000 ? 5 : 6 : j2 < 10000000 ? 7 : 8;
        } else if (j2 >= 100) {
            i2 = j2 < 1000 ? 3 : 4;
        } else if (j2 >= 10) {
            i2 = 2;
        }
        if (z2) {
            i2++;
        }
        Segment segmentWritableSegment$okio = writableSegment$okio(i2);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i3 = segmentWritableSegment$okio.limit + i2;
        while (j2 != 0) {
            long j3 = 10;
            i3--;
            bArr[i3] = okio.internal.Buffer.getHEX_DIGIT_BYTES()[(int) (j2 % j3)];
            j2 /= j3;
        }
        if (z2) {
            bArr[i3 - 1] = 45;
        }
        segmentWritableSegment$okio.limit += i2;
        setSize$okio(size() + ((long) i2));
        return this;
    }

    @Override // okio.BufferedSink
    public Buffer writeHexadecimalUnsignedLong(long j2) {
        if (j2 == 0) {
            return writeByte(48);
        }
        long j3 = (j2 >>> 1) | j2;
        long j4 = j3 >>> 2;
        long j5 = (j3 + j4) - (j3 & j4);
        long j6 = j5 >>> 4;
        long j7 = (j5 + j6) - (j5 & j6);
        long j8 = j7 >>> 8;
        long j9 = (j7 + j8) - (j7 & j8);
        long j10 = j9 | (j9 >>> 16);
        long j11 = j10 | (j10 >>> 32);
        long j12 = j11 >>> 1;
        long j13 = j11 - ((j12 + 6148914691236517205L) - (j12 | 6148914691236517205L));
        long j14 = ((-1) - (((-1) - (j13 >>> 2)) | ((-1) - 3689348814741910323L))) + ((j13 + 3689348814741910323L) - (j13 | 3689348814741910323L));
        long j15 = ((j14 >>> 4) + j14) & 1085102592571150095L;
        long j16 = j15 + (j15 >>> 8);
        long j17 = j16 + (j16 >>> 16);
        int i2 = (int) (((((j17 + 63) - (j17 | 63)) + ((j17 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        Segment segmentWritableSegment$okio = writableSegment$okio(i2);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i3 = segmentWritableSegment$okio.limit;
        for (int i4 = (segmentWritableSegment$okio.limit + i2) - 1; i4 >= i3; i4--) {
            bArr[i4] = okio.internal.Buffer.getHEX_DIGIT_BYTES()[(int) ((15 + j2) - (15 | j2))];
            j2 >>>= 4;
        }
        segmentWritableSegment$okio.limit += i2;
        setSize$okio(size() + ((long) i2));
        return this;
    }

    @Override // okio.BufferedSink
    public Buffer writeInt(int i2) {
        Segment segmentWritableSegment$okio = writableSegment$okio(4);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i3 = segmentWritableSegment$okio.limit;
        bArr[i3] = (byte) ((i2 >>> 24) & 255);
        bArr[i3 + 1] = (byte) ((-1) - (((-1) - (i2 >>> 16)) | ((-1) - 255)));
        int i4 = i2 >>> 8;
        bArr[i3 + 2] = (byte) ((i4 + 255) - (i4 | 255));
        bArr[i3 + 3] = (byte) ((i2 + 255) - (i2 | 255));
        segmentWritableSegment$okio.limit = i3 + 4;
        setSize$okio(size() + 4);
        return this;
    }

    @Override // okio.BufferedSink
    public Buffer writeIntLe(int i2) {
        return writeInt(SegmentedByteString.reverseBytes(i2));
    }

    @Override // okio.BufferedSink
    public Buffer writeLong(long j2) {
        Segment segmentWritableSegment$okio = writableSegment$okio(8);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i2 = segmentWritableSegment$okio.limit;
        bArr[i2] = (byte) ((-1) - (((-1) - (j2 >>> 56)) | ((-1) - 255)));
        long j3 = j2 >>> 48;
        bArr[i2 + 1] = (byte) ((j3 + 255) - (j3 | 255));
        long j4 = j2 >>> 40;
        bArr[i2 + 2] = (byte) ((j4 + 255) - (j4 | 255));
        long j5 = j2 >>> 32;
        bArr[i2 + 3] = (byte) ((j5 + 255) - (j5 | 255));
        bArr[i2 + 4] = (byte) ((-1) - (((-1) - (j2 >>> 24)) | ((-1) - 255)));
        bArr[i2 + 5] = (byte) ((j2 >>> 16) & 255);
        bArr[i2 + 6] = (byte) ((-1) - (((-1) - (j2 >>> 8)) | ((-1) - 255)));
        bArr[i2 + 7] = (byte) ((-1) - (((-1) - j2) | ((-1) - 255)));
        segmentWritableSegment$okio.limit = i2 + 8;
        setSize$okio(size() + 8);
        return this;
    }

    @Override // okio.BufferedSink
    public Buffer writeLongLe(long j2) {
        return writeLong(SegmentedByteString.reverseBytes(j2));
    }

    @Override // okio.BufferedSink
    public Buffer writeShort(int i2) {
        Segment segmentWritableSegment$okio = writableSegment$okio(2);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i3 = segmentWritableSegment$okio.limit;
        int i4 = i2 >>> 8;
        bArr[i3] = (byte) ((i4 + 255) - (i4 | 255));
        bArr[i3 + 1] = (byte) ((i2 + 255) - (i2 | 255));
        segmentWritableSegment$okio.limit = i3 + 2;
        setSize$okio(size() + 2);
        return this;
    }

    @Override // okio.BufferedSink
    public Buffer writeShortLe(int i2) {
        return writeShort((int) SegmentedByteString.reverseBytes((short) i2));
    }

    @Override // okio.BufferedSink
    public Buffer writeString(String string, int i2, int i3, Charset charset) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (i2 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i2).toString());
        }
        if (i3 < i2) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i3 + " < " + i2).toString());
        }
        if (i3 > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i3 + " > " + string.length()).toString());
        }
        if (Intrinsics.areEqual(charset, Charsets.UTF_8)) {
            return writeUtf8(string, i2, i3);
        }
        String strSubstring = string.substring(i2, i3);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        byte[] bytes = strSubstring.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return write(bytes, 0, bytes.length);
    }

    @Override // okio.BufferedSink
    public Buffer writeString(String string, Charset charset) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return writeString(string, 0, string.length(), charset);
    }

    public final Buffer writeTo(OutputStream out) throws IOException {
        Intrinsics.checkNotNullParameter(out, "out");
        return writeTo$default(this, out, 0L, 2, null);
    }

    public final Buffer writeTo(OutputStream out, long j2) throws IOException {
        long j3 = j2;
        Intrinsics.checkNotNullParameter(out, "out");
        SegmentedByteString.checkOffsetAndCount(this.size, 0L, j3);
        Segment segment = this.head;
        while (j3 > 0) {
            Intrinsics.checkNotNull(segment);
            int iMin = (int) Math.min(j3, segment.limit - segment.pos);
            out.write(segment.data, segment.pos, iMin);
            segment.pos += iMin;
            long j4 = iMin;
            this.size -= j4;
            j3 -= j4;
            if (segment.pos == segment.limit) {
                Segment segmentPop = segment.pop();
                this.head = segmentPop;
                SegmentPool.recycle(segment);
                segment = segmentPop;
            }
        }
        return this;
    }

    @Override // okio.BufferedSink
    public Buffer writeUtf8(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        return writeUtf8(string, 0, string.length());
    }

    @Override // okio.BufferedSink
    public Buffer writeUtf8(String string, int i2, int i3) {
        char cCharAt;
        Intrinsics.checkNotNullParameter(string, "string");
        if (i2 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i2).toString());
        }
        if (i3 < i2) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i3 + " < " + i2).toString());
        }
        if (i3 > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i3 + " > " + string.length()).toString());
        }
        while (i2 < i3) {
            char cCharAt2 = string.charAt(i2);
            if (cCharAt2 < 128) {
                Segment segmentWritableSegment$okio = writableSegment$okio(1);
                byte[] bArr = segmentWritableSegment$okio.data;
                int i4 = segmentWritableSegment$okio.limit - i2;
                int iMin = Math.min(i3, 8192 - i4);
                int i5 = i2 + 1;
                bArr[i2 + i4] = (byte) cCharAt2;
                while (true) {
                    i2 = i5;
                    if (i2 >= iMin || (cCharAt = string.charAt(i2)) >= 128) {
                        break;
                    }
                    i5 = i2 + 1;
                    bArr[i2 + i4] = (byte) cCharAt;
                }
                int i6 = (i4 + i2) - segmentWritableSegment$okio.limit;
                segmentWritableSegment$okio.limit += i6;
                setSize$okio(size() + ((long) i6));
            } else {
                if (cCharAt2 < 2048) {
                    Segment segmentWritableSegment$okio2 = writableSegment$okio(2);
                    segmentWritableSegment$okio2.data[segmentWritableSegment$okio2.limit] = (byte) ((cCharAt2 >> 6) | 192);
                    segmentWritableSegment$okio2.data[segmentWritableSegment$okio2.limit + 1] = (byte) (((-1) - ((65535 - cCharAt2) | ((-1) - 63))) | 128);
                    segmentWritableSegment$okio2.limit += 2;
                    setSize$okio(size() + 2);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    Segment segmentWritableSegment$okio3 = writableSegment$okio(3);
                    int i7 = cCharAt2 >> '\f';
                    segmentWritableSegment$okio3.data[segmentWritableSegment$okio3.limit] = (byte) ((i7 + CanonMakernoteDirectory.TAG_SENSOR_INFO_ARRAY) - (i7 & CanonMakernoteDirectory.TAG_SENSOR_INFO_ARRAY));
                    segmentWritableSegment$okio3.data[segmentWritableSegment$okio3.limit + 1] = (byte) ((-1) - (((-1) - ((cCharAt2 >> 6) & 63)) & ((-1) - 128)));
                    segmentWritableSegment$okio3.data[segmentWritableSegment$okio3.limit + 2] = (byte) (((-1) - ((65535 - cCharAt2) | ((-1) - 63))) | 128);
                    segmentWritableSegment$okio3.limit += 3;
                    setSize$okio(size() + 3);
                } else {
                    int i8 = i2 + 1;
                    char cCharAt3 = i8 < i3 ? string.charAt(i8) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        writeByte(63);
                        i2 = i8;
                    } else {
                        int i9 = ((((-1) - ((65535 - cCharAt2) | ((-1) - 1023))) << 10) | (cCharAt3 & 1023)) + 65536;
                        Segment segmentWritableSegment$okio4 = writableSegment$okio(4);
                        segmentWritableSegment$okio4.data[segmentWritableSegment$okio4.limit] = (byte) ((i9 >> 18) | 240);
                        int i10 = i9 >> 12;
                        int i11 = (i10 + 63) - (i10 | 63);
                        segmentWritableSegment$okio4.data[segmentWritableSegment$okio4.limit + 1] = (byte) ((i11 + 128) - (i11 & 128));
                        int i12 = i9 >> 6;
                        segmentWritableSegment$okio4.data[segmentWritableSegment$okio4.limit + 2] = (byte) ((-1) - (((-1) - ((i12 + 63) - (i12 | 63))) & ((-1) - 128)));
                        segmentWritableSegment$okio4.data[segmentWritableSegment$okio4.limit + 3] = (byte) ((-1) - (((-1) - ((i9 + 63) - (i9 | 63))) & ((-1) - 128)));
                        segmentWritableSegment$okio4.limit += 4;
                        setSize$okio(size() + 4);
                        i2 += 2;
                    }
                }
                i2++;
            }
        }
        return this;
    }

    @Override // okio.BufferedSink
    public Buffer writeUtf8CodePoint(int i2) {
        if (i2 < 128) {
            writeByte(i2);
        } else if (i2 < 2048) {
            Segment segmentWritableSegment$okio = writableSegment$okio(2);
            segmentWritableSegment$okio.data[segmentWritableSegment$okio.limit] = (byte) ((-1) - (((-1) - (i2 >> 6)) & ((-1) - 192)));
            segmentWritableSegment$okio.data[segmentWritableSegment$okio.limit + 1] = (byte) ((-1) - (((-1) - ((i2 + 63) - (i2 | 63))) & ((-1) - 128)));
            segmentWritableSegment$okio.limit += 2;
            setSize$okio(size() + 2);
        } else if (55296 <= i2 && i2 < 57344) {
            writeByte(63);
        } else if (i2 < 65536) {
            Segment segmentWritableSegment$okio2 = writableSegment$okio(3);
            int i3 = i2 >> 12;
            segmentWritableSegment$okio2.data[segmentWritableSegment$okio2.limit] = (byte) ((i3 + CanonMakernoteDirectory.TAG_SENSOR_INFO_ARRAY) - (i3 & CanonMakernoteDirectory.TAG_SENSOR_INFO_ARRAY));
            int i4 = i2 >> 6;
            segmentWritableSegment$okio2.data[segmentWritableSegment$okio2.limit + 1] = (byte) (((i4 + 63) - (i4 | 63)) | 128);
            int i5 = (-1) - (((-1) - i2) | ((-1) - 63));
            segmentWritableSegment$okio2.data[segmentWritableSegment$okio2.limit + 2] = (byte) ((i5 + 128) - (i5 & 128));
            segmentWritableSegment$okio2.limit += 3;
            setSize$okio(size() + 3);
        } else {
            if (i2 > 1114111) {
                throw new IllegalArgumentException("Unexpected code point: 0x" + SegmentedByteString.toHexString(i2));
            }
            Segment segmentWritableSegment$okio3 = writableSegment$okio(4);
            int i6 = i2 >> 18;
            segmentWritableSegment$okio3.data[segmentWritableSegment$okio3.limit] = (byte) ((i6 + 240) - (i6 & 240));
            int i7 = i2 >> 12;
            segmentWritableSegment$okio3.data[segmentWritableSegment$okio3.limit + 1] = (byte) ((-1) - (((-1) - ((i7 + 63) - (i7 | 63))) & ((-1) - 128)));
            int i8 = (-1) - (((-1) - (i2 >> 6)) | ((-1) - 63));
            segmentWritableSegment$okio3.data[segmentWritableSegment$okio3.limit + 2] = (byte) ((i8 + 128) - (i8 & 128));
            segmentWritableSegment$okio3.data[segmentWritableSegment$okio3.limit + 3] = (byte) (((-1) - (((-1) - i2) | ((-1) - 63))) | 128);
            segmentWritableSegment$okio3.limit += 4;
            setSize$okio(size() + 4);
        }
        return this;
    }
}
