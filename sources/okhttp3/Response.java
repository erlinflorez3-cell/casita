package okhttp3;

import io.sentry.SentryBaseEvent;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.Headers;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.http.HttpHeaders;
import okio.Buffer;
import okio.BufferedSource;
import okio.Source;
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
@Metadata(bv = {}, d1 = {"Яr\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007tvAӄLeV4Zݷ2\u000f\u0002{<řc$\bCC٥\"}8\tWNmivJh\u0012K\u000f\f\u0016\u0001jBI]xc\u0013\u00172XoG3StE9n}>\u0005&;*8\b#\t\u001a@H\u0018͌\u0003CY\f\u001a0FwBR#M\r\u001a\u0018\u000fTĨ1\u001e\u000bf\u00075\r-W@ǂ3\u0007wBf'\u000e1\rQ\u001bHl';yq\"9DO5C*c\u0007\u0015Xs?1F\u0002C\u0013p?)AH\"`F\\\u000e\u001e-+}\u0018mx4h\u001dSv\u000bU8_iY^&*\u000ey*ȞL\n\u001c\u0015?JD,HǑ\u0018\u0014A\u0005\u000bUVO0މR\u0004\trN\u0017S\u0012C/G.~Q\u0010M)TE\u0010\u001d\u000f4\"/\u0004Ĳ_T\u001cv](b\u0004i3g?kU\u0015\u000fՒAm\n\u001a+\r8\u001cHG.HB\u0016ѧ\u001b%=\u0006\u00020/z\u001aJZf%ݓ'mרmRNkjx$cB\u000f\u001c\\Td3\u001a~\u0002!2\u001f|4T5.N'hg\u0006B9%>U\u0016mȬnMc;m<t?qp\u0002\r\u0006B%8̳Uc\u0016\u0014\u001b\u0013\"rTd\u001bW\u0015G\u0004\u0010h\u0011@\"`M\u001b\u0018}{R\u0004$\u0015H> !z1y$j\u001f`\u0003LM\b\u0002ȤcZnFGfA.\u001bo4v\u0019\u0001~a\u001f\u001d\u0018|W`\u0015`P2\n\\C\u001d>UPmz\u0002ɠ\u000b~y7\u0010tZUdn,t\u0004ݨf\u001b׀=Q5u[\u0013\rbJ\u0002[\u007f\u0015~s\re\u0012U\b-}\u001dw\u0001.\u0016\u001a3}:p\u0003LeSEǱ=cѓ'\bj=BlT|_c\u0003\u000e\"Cϗv\u0003_z\u0017C\u000b\u00187\u001eS\u00136'Ŀ9-Ife!\u0006\u0014G\u0015\u0010^0tЦ}b\u0015f=p\u0012={\u0016\u001et\u0018bщ?8O\u001bGD0f\u0005\u0003pM1\fPF\u0017w%3vL5\u0004dDe\rE|\u0015\u0014b\u0012\u0080ZaBܤ\b\u007f::mADR\f,vCS*\u0004\u0019ܭqqc^\u0011b\u001d$[\u000f?}*\u001eS\u001f\u0005̰\u0019\u000eޘ\ny ܽY=h\u0014J$tE:B \u000bq[ \u000bخ~\u0006Nܪ'\u00198H\u0002W'$b\rtX^\u0004\u000fZ\u0017 \u0001܁\u0001ܓ7$\u0001߶I\u0007sZbL4E\u000f[5\u000b1i}\b\u001d*ŠHZAЉ@Z\u0007\u0013S{\u0014Z\u0010@\u001cGWx\"tɒ<\u001e\u0005܈Z\u001a!C_00\u0006>~#U\u0013o\u001b;ՆjVf$/\u001f\t\u001f^K\u00182#\u0019}\u0014&'υPR\u00109I=\u000f9\u00157\u00150\u0015e\\\u001a[\u001f\fφIƹn\u0014/س(dI\u0002  N,:yֈ`]\u0016ў\"_!>$\u0017fu\u0010\u0017+R6\u0003\\\u05fd+w˹2\u000e>О\u001a5\b!lt<\u000b/P?-\u0003\u0005pŮ\u001f}Ơgrkߛm\r\tv?qJ\u007f;R5\tUPd\u0018͠^@\u0019֦8Z\u0017\u0002\";v0D\u001bz)>a\u001amӗoUc¾C1q=oX\u0001c,}7y$\u0005`YӲ\u0019A^צVf\u000f\\zj(\u001fl{@d#\u001e_\u0019μ\u0003NfƷ+6L\u0004,\fԞ;^"}, d2 = {"\u001anZ5g;I!bkzl7\u0007\u0012=eU", "\u001aiPCTuB]b\\\u0002h:|\u0005,l\u007f}", "@d`BX:M", "\u001anZ5g;I!bkzj<|\u0017>;", ">q^Ab*HZ", "\u001anZ5g;I!bi\bh;\u0007\u00079lU", ";db@T.>", "", "1nS2", "", "6`]1f/:Y\u0019", "\u001anZ5g;I!bavg+\u000b\f+k\u007f}", "6dP1X9L", "\u001anZ5g;I!bazZ+|\u0016=;", "0nSF", "\u001anZ5g;I!bkzl7\u0007\u0012=e\\2zTV", "<dcDb9D@\u0019\r\u0006h5\u000b\t", "1`R5X\u0019>a$\t\u0004l,", ">qX<e\u0019>a$\t\u0004l,", "Ad]AE,Jc\u0019\r\n:;d\r6l\u00046", "", "@dR2\\=>R\u0006~\ti6\u0006\u0017/A\u000f\u0010\u007fG\b\u001b%", "3wR5T5@S", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&\u0006I\n\u0017\u0015Vs\u0018E@\u0005HW\u0001\u001c@o\u0016\u0004", "uK^8[;M^fHg^8\r\t=tU\u000f\u0006F\u0004&&R=W'\u0004/Dc{*>C|3IT75;\u001a\u001ej+'\u0016p0Wx|+3X2_a\u0002Ha[=\nW*\u001b\bUG$D+A%\u000b;X\r\t2c\f\u0012\r5w~\u0018=\u001aM|$\u0005Lv23Ym\u0005QJSb\u0007n\u000bsrCD@'#\u0001$h2=.\u0018\u0007]\u001a\u0001RONqM\u001c\nG/\f7HFSz_E\u0003't2\u0006}\u0015Ag\u007fx>\u001a\u0004B5@m\u0013K=|#E\u0003\u001b/kP2s\u007f@\u001cNKp~hEWf)j\u0011\u000e`D5#n/C[\r\nY ]57#q", "u(;<^/Mb$LDK,\u000b\u00149n\u000e(XJ\u007f+l", "1`R5X\nH\\(\f\u0005e", "\u001anZ5g;I!b\\v\\/|f9n\u000f5\u0006GV", "u(;<^/Mb$LD<(z\f/C\n1\u000bM\u000b\u001el", "u(;<^/Mb$LDK,\u000b\u00149n\u000e(Q", "u(8", "u(;<^/Mb$LDb5\f\t<n{/E>\u000b  Gm\u001d@\u0001.~9\u0011\u001e:i\u001f0M\u0019", "u(;<^/Mb$LDA(\u0006\b=h{.{\u0016", "u(;<^/Mb$LDA,x\b/r\u000e}", "7rA2W0KS\u0017\u000e", "", "u(I", "7rBBV*>a'\u007f\u000be", ":`iF6(<V\u0019\\\u0005g;\n\u00136", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "u(;<^/Mb$LDI9\u0007\u00189c\n/Q", "u(9", "u(;<^/Mb$LDK,\t\u0019/s\u000f}", "zcT=e,<O(~yX)\u0007\bC", "zcT=e,<O(~yX*x\u00072e]2\u0005O\u000e!\u001e", "zcT=e,<O(~yX*x\u00072el(\nK\u000b %G", "1gP9_,GU\u0019\r", "", "\u001anZ5g;I!b\\}Z3\u0004\t8g\u007f}", "1k^@X", "", "zcT=e,<O(~yX*\u0007\b/", "zcT=e,<O(~yX/x\u0012.s\u0003$\u0002@", "6dP1X9", "<`\\2", "2dU.h3MD\u0015\u0006\u000b^", "zcT=e,<O(~yX/|\u0005.e\r6", "zcT=e,<O(~yX4|\u0017=a\u0002(", "zcT=e,<O(~yX5|\u0018Ao\r.h@\u000f\"!P}\u000e", "<df\u000fh0ER\u0019\f", "\u001anZ5g;I!bkzl7\u0007\u0012=e>\u0005\fD\b\u0016\u0017TE", ">dT856=g", "0xc266N\\(", "zcT=e,<O(~yX7\n\r9rl(\nK\u000b %G", "zcT=e,<O(~yX7\n\u0013>o}2\u0003", "zcT=e,<O(~yX9|\u0007/i\u0011(z-\u0001%\"Qx\u001c<R4\u001d]\u0005';{", "zcT=e,<O(~yX9|\u0015?e\u000e7", "zcT=e,<O(~yX:|\u0012>R\u007f4\f@\u000f&rVW\u0012C})C", "BnBAe0GU", "BqP6_,Ka", "\u0010tX9W,K", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Response implements Closeable {
    private final ResponseBody body;
    private final Response cacheResponse;
    private final int code;
    private final Exchange exchange;
    private final Handshake handshake;
    private final Headers headers;
    private CacheControl lazyCacheControl;
    private final String message;
    private final Response networkResponse;
    private final Response priorResponse;
    private final Protocol protocol;
    private final long receivedResponseAtMillis;
    private final Request request;
    private final long sentRequestAtMillis;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Яn\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005\"4\u0012\u000e\u0007nj?7LeV4ZS0\u0012s{J$c$wFCU0}*\tUQog\u0005Jb\u000bI\u0012\u000e\u0016\u0007v4I[\u0002e\u0012%2JoE6UoK@ht<\b(288\u0002\u0005\u0007$2H\u001ev\u0003CQ\f\u001a0VpBR\u0013P\u000b.(ßn /\u001d\u001dlTJՂp]H/c\u0010oP^+m1\u0015M;Hù+\r\u0005dfAN~M\u0015Sم3\u000b`$W\u0003m\u0019m\tvp?+w\u001b\u001eJ!\u0010\"\u0019CO;ƞ#,j\tib\"&YT*_\u0019\u00146B\u0013{;>J\"N7V8E\u001a\u0015ڜ>9\u0003|kBf\u0001\rDF\u000f*F%p\u00183Y\u0006Kl_bS\u001bd6*\u0007S\u001ek\u0019|nsT<-E\u001fb@i1\u007fgmN\\\u000bq?\u0004\u0003\u001fdH*L>U\u000eG{?фG)EiQ#OzH\\\rw\u0005\u001fxh\u0002֟\u0003NN<\u0007\u0018M)7'!X-\u001by\u001flXZҊ} bO\u0016\bAG\r{Jj=\u0010|v/}3[k*=/\u0015Ž\nry.o9\r\u0003{e,#o#\u000f\u0014m\t\u0013\tf8ZS:o#̥ϒ6Hpb@\nRt$\u0013`ŭ\" BRI\u0019\u000b<\u000f\u0017fRO)!_\tӐ@\u0005b_<\u0005\u007f##\u000bGd%\u0001}\u0017\u0011IZʉ\u0011(;pi7/%\u0004$/HE1\u00151\f\u007fuх|KZ\u001f.u\u0004/f*bG_gU\u0013=ȯY6\u0010e]L!\u001f\u0018aZ5\tP\u0012\u000fiÜ^k\u00163\t,\u000f\u0012\u0011c\u001d%05vrQΨ\u0015\u0004\b ^zu#\u001b\u001f$LW7\u001bYjѾh\u0001\u0013c6%/)h\u0011\u0006GQ+5\u0018\u000e\u0013]\u001a8ӡuܓ2\u0006jχ>vk\n:j6qhYk;\fRWc\u0017@8#\u001b\u0005\u0019זv͎\fN\u0011ͩ%5NLr|v:S\u0018=\u00017\u001f:\u001b\tV\nIi̋\nӑ2k2ϒ[\u007f\u001anQ61OYy{\u0001\u001cv\u0019^'\f!z_\u0004hΓI֕Zcj־H\by.DX[d\u000bT\u0017=\u0005FJ\"#Ejh4+QĕRݍ\u0013#:߿\f=\\*b\u0016|XN#nd198!\u0017\u000fa?O߷=ܭqR\\Џ{4\u0007u+,;lU#tJ{^b_3*n\u007f9l4ŞUΜ:\u0010Oӣ\u0006mu4FA\u001d\u001fHB)d\"+m#H`!T\u0013P;ɻ\u001e؉VZ*Ė\u0017|\u0003;J\u0016/\r\u001f}\u0001r3GZ}\u00109Y\u0019/\u0019\u001b͉\u0013Ѽ\u0001oNɑE\b;]KU\u000b\u0016--eV\f\u0018\u0016R8)\u001asO\u0010.ʫrŭa'Bσ\n\u0018h6\u0017Hp\"\ndX,C\"<@NO0lXՃj̲o\u0004)̸?-r@P\u0007\tz\u0010 z!?o\u0019A~3lx\u001dl'ɀ\u0015ߓQ:\u001b̽r<\u0017\u0014.\u001a1\u0002\u001aW4b\u0007 pm(O\u0012\"Gբ[ܣ\u001177մBc7u`Y\u001e!\u007f<\u0012gĽ,i"}, d2 = {"\u001anZ5g;I!bkzl7\u0007\u0012=e>\u0005\fD\b\u0016\u0017TE", "", "u(E", "@db=b5LS", "\u001anZ5g;I!bkzl7\u0007\u0012=eU", "uK^8[;M^fHg^:\b\u00138s\u007f}?1", "0nSF", "\u001anZ5g;I!bkzl7\u0007\u0012=e\\2zTV", "5dc\u000fb+R\u0012#\u0005}m;\b", "u(;<^/Mb$LDK,\u000b\u00149n\u000e(XJ\u007f+l", "Adc\u000fb+R\u0012#\u0005}m;\b", "uK^8[;M^fHg^:\b\u00138s\u007f\u0005\u0006?\u0015lZ8", "1`R5X\u0019>a$\t\u0004l,", "5dc\u0010T*AS\u0006~\ti6\u0006\u0017/$\n.~O\u0010\"", "u(;<^/Mb$LDK,\u000b\u00149n\u000e(Q", "Adc\u0010T*AS\u0006~\ti6\u0006\u0017/$\n.~O\u0010\"", "1nS2", "", "5dc\u0010b+>\u0012#\u0005}m;\b", "u(8", "Adc\u0010b+>\u0012#\u0005}m;\b", "uH\u0018#", "3wR5T5@S", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&\u0006I\n\u0017\u0015Vs\u0018E@\u0005HW\u0001\u001c@o\u0016\u0004", "5dc\u0012k*AO\"\u0001z\u001d6\u0003\f>t\u000b", "u(;<^/Mb$LDb5\f\t<n{/E>\u000b  Gm\u001d@\u0001.~9\u0011\u001e:i\u001f0M\u0019", "Adc\u0012k*AO\"\u0001z\u001d6\u0003\f>t\u000b", "uK^8[;M^fH~g;|\u00168a\u0007qyJ\n \u0017E~\u0012F\u007fn\u0015l{#3v\u0018.#\u0007,", "6`]1f/:Y\u0019", "\u001anZ5g;I!bavg+\u000b\f+k\u007f}", "5dc\u0015T5=a\u001cz\u0001^j\u0007\u000f2t\u000f3", "u(;<^/Mb$LDA(\u0006\b=h{.{\u0016", "Adc\u0015T5=a\u001cz\u0001^j\u0007\u000f2t\u000f3", "uK^8[;M^fH]Z5{\u00172a\u0006(Q\u0004q", "6dP1X9L", "\u001anZ5g;I!bazZ+|\u0016=$\\8\u007fG\u007f\u0017$\u001d", "5dc\u0015X(=S&\r9h2\u007f\u0018>p", "u(;<^/Mb$LDA,x\b/r\u000efXP\u0005\u001e\u0016G|c", "Adc\u0015X(=S&\r9h2\u007f\u0018>p", "uK^8[;M^fH]^({\t<s>\u0005\fD\b\u0016\u0017TEQ-", ";db@T.>", "", "5dc\u001aX:LO\u001b~9h2\u007f\u0018>p", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u001aX:LO\u001b~9h2\u007f\u0018>p", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "<dcDb9D@\u0019\r\u0006h5\u000b\t", "5dc\u001bX;P]&\u0005g^:\b\u00138s\u007ff\u0006F\u0004&&R", "Adc\u001bX;P]&\u0005g^:\b\u00138s\u007ff\u0006F\u0004&&R", ">qX<e\u0019>a$\t\u0004l,", "5dc\u001de0H`\u0006~\ti6\u0006\u0017/$\n.~O\u0010\"", "Adc\u001de0H`\u0006~\ti6\u0006\u0017/$\n.~O\u0010\"", ">q^Ab*HZ", "\u001anZ5g;I!bi\bh;\u0007\u00079lU", "5dc\u001de6M]\u0017\t\u0002\u001d6\u0003\f>t\u000b", "u(;<^/Mb$LDI9\u0007\u00189c\n/Q", "Adc\u001de6M]\u0017\t\u0002\u001d6\u0003\f>t\u000b", "uK^8[;M^fHek6\f\u0013-o\u0007}?1", "@dR2\\=>R\u0006~\ti6\u0006\u0017/A\u000f\u0010\u007fG\b\u001b%", "", "5dc\u001fX*>W*~yK,\u000b\u00149n\u000e(WOh\u001b\u001eNs\u001cz\u0001+8h\r+", "u(9", "Adc\u001fX*>W*~yK,\u000b\u00149n\u000e(WOh\u001b\u001eNs\u001cz\u0001+8h\r+", "uI\u0018#", "@d`BX:M", "\u001anZ5g;I!bkzj<|\u0017>;", "5dc\u001fX8NS'\u000e9h2\u007f\u0018>p", "u(;<^/Mb$LDK,\t\u0019/s\u000f}", "Adc\u001fX8NS'\u000e9h2\u007f\u0018>p", "uK^8[;M^fHg^8\r\t=tUkl", "Ad]AE,Jc\u0019\r\n:;d\r6l\u00046", "5dc X5M@\u0019\u000b\u000b^:\fd>M\u0004/\u0003D\u000fU!Mr\u001dK\u0002", "Adc X5M@\u0019\u000b\u000b^:\fd>M\u0004/\u0003D\u000fU!Mr\u001dK\u0002", "/cS\u0015X(=S&", "<`\\2", "D`[BX", "0tX9W", "1gT0^\u0017KW#\fg^:\b\u00138s\u007f", "", "1gT0^\u001aN^$\t\bm\u0019|\u0017:o\t6{", "6dP1X9", "\u001anZ5g;I!bazZ+|\u0016=;", "7mXA8?<V\u0015\b|^", "2dU2e9>R\b\fvb3|\u0016=", "7mXA8?<V\u0015\b|^j\u0007\u000f2t\u000f3", "@d\\<i,!S\u0015}zk", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static class Builder {
        private ResponseBody body;
        private Response cacheResponse;
        private int code;
        private Exchange exchange;
        private Handshake handshake;
        private Headers.Builder headers;
        private String message;
        private Response networkResponse;
        private Response priorResponse;
        private Protocol protocol;
        private long receivedResponseAtMillis;
        private Request request;
        private long sentRequestAtMillis;

        public Builder() {
            this.code = -1;
            this.headers = new Headers.Builder();
        }

        public Builder(Response response) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.code = -1;
            this.request = response.request();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.handshake = response.handshake();
            this.headers = response.headers().newBuilder();
            this.body = response.body();
            this.networkResponse = response.networkResponse();
            this.cacheResponse = response.cacheResponse();
            this.priorResponse = response.priorResponse();
            this.sentRequestAtMillis = response.sentRequestAtMillis();
            this.receivedResponseAtMillis = response.receivedResponseAtMillis();
            this.exchange = response.exchange();
        }

        private final void checkPriorResponse(Response response) {
            if (response != null && response.body() != null) {
                throw new IllegalArgumentException("priorResponse.body != null".toString());
            }
        }

        private final void checkSupportResponse(String str, Response response) {
            if (response != null) {
                if (response.body() != null) {
                    throw new IllegalArgumentException((str + ".body != null").toString());
                }
                if (response.networkResponse() != null) {
                    throw new IllegalArgumentException((str + ".networkResponse != null").toString());
                }
                if (response.cacheResponse() != null) {
                    throw new IllegalArgumentException((str + ".cacheResponse != null").toString());
                }
                if (response.priorResponse() != null) {
                    throw new IllegalArgumentException((str + ".priorResponse != null").toString());
                }
            }
        }

        public Builder addHeader(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.headers.add(name, value);
            return this;
        }

        public Builder body(ResponseBody responseBody) {
            this.body = responseBody;
            return this;
        }

        public Response build() {
            int i2 = this.code;
            if (i2 < 0) {
                throw new IllegalStateException(("code < 0: " + this.code).toString());
            }
            Request request = this.request;
            if (request == null) {
                throw new IllegalStateException("request == null".toString());
            }
            Protocol protocol = this.protocol;
            if (protocol == null) {
                throw new IllegalStateException("protocol == null".toString());
            }
            String str = this.message;
            if (str != null) {
                return new Response(request, protocol, str, i2, this.handshake, this.headers.build(), this.body, this.networkResponse, this.cacheResponse, this.priorResponse, this.sentRequestAtMillis, this.receivedResponseAtMillis, this.exchange);
            }
            throw new IllegalStateException("message == null".toString());
        }

        public Builder cacheResponse(Response response) {
            checkSupportResponse("cacheResponse", response);
            this.cacheResponse = response;
            return this;
        }

        public Builder code(int i2) {
            this.code = i2;
            return this;
        }

        public final ResponseBody getBody$okhttp() {
            return this.body;
        }

        public final Response getCacheResponse$okhttp() {
            return this.cacheResponse;
        }

        public final int getCode$okhttp() {
            return this.code;
        }

        public final Exchange getExchange$okhttp() {
            return this.exchange;
        }

        public final Handshake getHandshake$okhttp() {
            return this.handshake;
        }

        public final Headers.Builder getHeaders$okhttp() {
            return this.headers;
        }

        public final String getMessage$okhttp() {
            return this.message;
        }

        public final Response getNetworkResponse$okhttp() {
            return this.networkResponse;
        }

        public final Response getPriorResponse$okhttp() {
            return this.priorResponse;
        }

        public final Protocol getProtocol$okhttp() {
            return this.protocol;
        }

        public final long getReceivedResponseAtMillis$okhttp() {
            return this.receivedResponseAtMillis;
        }

        public final Request getRequest$okhttp() {
            return this.request;
        }

        public final long getSentRequestAtMillis$okhttp() {
            return this.sentRequestAtMillis;
        }

        public Builder handshake(Handshake handshake) {
            this.handshake = handshake;
            return this;
        }

        public Builder header(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.headers.set(name, value);
            return this;
        }

        public Builder headers(Headers headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.headers = headers.newBuilder();
            return this;
        }

        public final void initExchange$okhttp(Exchange deferredTrailers) {
            Intrinsics.checkNotNullParameter(deferredTrailers, "deferredTrailers");
            this.exchange = deferredTrailers;
        }

        public Builder message(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
            return this;
        }

        public Builder networkResponse(Response response) {
            checkSupportResponse("networkResponse", response);
            this.networkResponse = response;
            return this;
        }

        public Builder priorResponse(Response response) {
            checkPriorResponse(response);
            this.priorResponse = response;
            return this;
        }

        public Builder protocol(Protocol protocol) {
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            this.protocol = protocol;
            return this;
        }

        public Builder receivedResponseAtMillis(long j2) {
            this.receivedResponseAtMillis = j2;
            return this;
        }

        public Builder removeHeader(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.headers.removeAll(name);
            return this;
        }

        public Builder request(Request request) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.request = request;
            return this;
        }

        public Builder sentRequestAtMillis(long j2) {
            this.sentRequestAtMillis = j2;
            return this;
        }

        public final void setBody$okhttp(ResponseBody responseBody) {
            this.body = responseBody;
        }

        public final void setCacheResponse$okhttp(Response response) {
            this.cacheResponse = response;
        }

        public final void setCode$okhttp(int i2) {
            this.code = i2;
        }

        public final void setExchange$okhttp(Exchange exchange) {
            this.exchange = exchange;
        }

        public final void setHandshake$okhttp(Handshake handshake) {
            this.handshake = handshake;
        }

        public final void setHeaders$okhttp(Headers.Builder builder) {
            Intrinsics.checkNotNullParameter(builder, "<set-?>");
            this.headers = builder;
        }

        public final void setMessage$okhttp(String str) {
            this.message = str;
        }

        public final void setNetworkResponse$okhttp(Response response) {
            this.networkResponse = response;
        }

        public final void setPriorResponse$okhttp(Response response) {
            this.priorResponse = response;
        }

        public final void setProtocol$okhttp(Protocol protocol) {
            this.protocol = protocol;
        }

        public final void setReceivedResponseAtMillis$okhttp(long j2) {
            this.receivedResponseAtMillis = j2;
        }

        public final void setRequest$okhttp(Request request) {
            this.request = request;
        }

        public final void setSentRequestAtMillis$okhttp(long j2) {
            this.sentRequestAtMillis = j2;
        }
    }

    public Response(Request request, Protocol protocol, String message, int i2, Handshake handshake, Headers headers, ResponseBody responseBody, Response response, Response response2, Response response3, long j2, long j3, Exchange exchange) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.request = request;
        this.protocol = protocol;
        this.message = message;
        this.code = i2;
        this.handshake = handshake;
        this.headers = headers;
        this.body = responseBody;
        this.networkResponse = response;
        this.cacheResponse = response2;
        this.priorResponse = response3;
        this.sentRequestAtMillis = j2;
        this.receivedResponseAtMillis = j3;
        this.exchange = exchange;
    }

    public static /* synthetic */ String header$default(Response response, String str, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        return response.header(str, str2);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "body", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_body */
    public final ResponseBody m10777deprecated_body() {
        return this.body;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "cacheControl", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_cacheControl */
    public final CacheControl m10778deprecated_cacheControl() {
        return cacheControl();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "cacheResponse", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_cacheResponse */
    public final Response m10779deprecated_cacheResponse() {
        return this.cacheResponse;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "code", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_code */
    public final int m10780deprecated_code() {
        return this.code;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "handshake", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_handshake */
    public final Handshake m10781deprecated_handshake() {
        return this.handshake;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "headers", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_headers */
    public final Headers m10782deprecated_headers() {
        return this.headers;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "message", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_message */
    public final String m10783deprecated_message() {
        return this.message;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "networkResponse", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_networkResponse */
    public final Response m10784deprecated_networkResponse() {
        return this.networkResponse;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "priorResponse", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_priorResponse */
    public final Response m10785deprecated_priorResponse() {
        return this.priorResponse;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "protocol", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_protocol */
    public final Protocol m10786deprecated_protocol() {
        return this.protocol;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "receivedResponseAtMillis", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_receivedResponseAtMillis */
    public final long m10787deprecated_receivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = SentryBaseEvent.JsonKeys.REQUEST, imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_request */
    public final Request m10788deprecated_request() {
        return this.request;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "sentRequestAtMillis", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_sentRequestAtMillis */
    public final long m10789deprecated_sentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    public final ResponseBody body() {
        return this.body;
    }

    public final CacheControl cacheControl() {
        CacheControl cacheControl = this.lazyCacheControl;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl cacheControl2 = CacheControl.Companion.parse(this.headers);
        this.lazyCacheControl = cacheControl2;
        return cacheControl2;
    }

    public final Response cacheResponse() {
        return this.cacheResponse;
    }

    public final List<Challenge> challenges() {
        String str;
        Headers headers = this.headers;
        int i2 = this.code;
        if (i2 == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i2 != 407) {
                return CollectionsKt.emptyList();
            }
            str = "Proxy-Authenticate";
        }
        return HttpHeaders.parseChallenges(headers, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ResponseBody responseBody = this.body;
        if (responseBody == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
        }
        responseBody.close();
    }

    public final int code() {
        return this.code;
    }

    public final Exchange exchange() {
        return this.exchange;
    }

    public final Handshake handshake() {
        return this.handshake;
    }

    public final String header(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return header$default(this, name, null, 2, null);
    }

    public final String header(String name, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        String str2 = this.headers.get(name);
        return str2 == null ? str : str2;
    }

    public final List<String> headers(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.headers.values(name);
    }

    public final Headers headers() {
        return this.headers;
    }

    public final boolean isRedirect() {
        int i2 = this.code;
        if (i2 != 307 && i2 != 308) {
            switch (i2) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    public final boolean isSuccessful() {
        int i2 = this.code;
        return 200 <= i2 && i2 < 300;
    }

    public final String message() {
        return this.message;
    }

    public final Response networkResponse() {
        return this.networkResponse;
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    public final ResponseBody peekBody(long j2) throws IOException {
        ResponseBody responseBody = this.body;
        Intrinsics.checkNotNull(responseBody);
        BufferedSource bufferedSourcePeek = responseBody.source().peek();
        Buffer buffer = new Buffer();
        bufferedSourcePeek.request(j2);
        buffer.write((Source) bufferedSourcePeek, Math.min(j2, bufferedSourcePeek.getBuffer().size()));
        return ResponseBody.Companion.create(buffer, this.body.contentType(), buffer.size());
    }

    public final Response priorResponse() {
        return this.priorResponse;
    }

    public final Protocol protocol() {
        return this.protocol;
    }

    public final long receivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    public final Request request() {
        return this.request;
    }

    public final long sentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    public String toString() {
        return "Response{protocol=" + this.protocol + ", code=" + this.code + ", message=" + this.message + ", url=" + this.request.url() + AbstractJsonLexerKt.END_OBJ;
    }

    public final Headers trailers() throws IOException {
        Exchange exchange = this.exchange;
        if (exchange != null) {
            return exchange.trailers();
        }
        throw new IllegalStateException("trailers not available".toString());
    }
}
