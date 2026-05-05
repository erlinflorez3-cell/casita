package okhttp3.internal.http2;

import androidx.exifinterface.media.ExifInterface;
import cz.msebera.android.httpclient.message.TokenParser;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http2.Http2Reader;
import okhttp3.internal.platform.Platform;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
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
@Metadata(bv = {}, d1 = {"ЯĻ\u0014D57\u001eq\u007fZDkŞ\fA\u001c0\u0013.H~*, ~\u000ffp98DsQ6RY+\u0017k\n@,[*rK;c;\u0006\"\u0017UVgmxRZ!C\u0017\u0006\u001c|r,_U\u0001]\u0018\u0014:B\u0006?;ݹw=O`|6\u000b%:\"Ny\r\u0001 ,P\u0010\rzKK\u0012\u00138@~]Z\rc\u0005\"\u0012\f?(\u00014\\oN<Kt]P/+\u0003oDV'm0\u0005M\u0013F\\'#vi\u001e1@?5+%[\u0003\r[c?\u0011]y=\u001bh/'1L{WLX\b\u0014\u001bFW\rsr.\\\u000bcvϯE˝N\u0014K~\r`}ߗzȸ;Ǥ\rΖ&\t;3Կv\f\u001c3\rr\u0002Aг\u0006^P\u0002CeDe=\u007faz\u0002!t\"y;G\u001e}\u0010M2,s\u0019nO+\u0005\u0012nf3T&$aUN\u0011`N8,ms\u0012Ez\u0004@\u0003^\u001dF\u07fcɨ\u0015.\u001d{\u007fkGz9k0\u0018tm\u0005]xjih\u0001\u001e\u0007\"7\u001aE\u0004!\f\t\u0014-\u0013y+lZB\u0010{\\\u0005\u000b\fc+ \u000b\b\u0005-3lfO\u0017p\u001bQkg=/\u0015;\"\u0013ylo9\rseUqoyR%$oFpeplRU\u001cZ\u000b\u000bP\u0014xn\u001e[\u0014D|\u0013Y2\b\f*\u0013D1G\u001dER\u0011~ZG\r\u000boZ\u0017r-6c(\u0011M<t7\b\u0019`~T\u007fxw<E\f0\u0013YQchVY0OL|Q\u0017/w\u000e/\u007fLu5\u001d\u001a\u0004?\u0014 D*iU=(+\u000f-0xĈβILxQ\u001av \u0014\u0013|(^kl<N j\u001f<\u0011tX0l\u001d2xnrQj\u0013a*eTe_c\u0003\u0012\"Ŭϗv\u0003_*\u0017Y\u000bs7\u001eSP &\u000b\u001cECU-F\u0002\"\u0010-gmk\u007f.(E=\b;Ёנ0c\u001c_+lk#S8w)/B0\u000b\u0005\u0003pX\u001b{\u00164!4;\u0006\u000fШяtV>@SQ\fZ\u001f,;1\u0007_Hr\b}b>\u00104\u0002$\u0016\u001anE5\u0011{6\u0016O\u001eOjnb\u000f8\u0012DD|\u00074=N]\bf\u0017\u0017\u001esFF\bݥك\t<\u000f\u001a|AJ~#Ejh4P+\u0004TF'\u0017`R:ĩټ\u0012T~T\u001fS\u0013Y]`OyGϓܓ7\u001e~/y\u0011{Al/\u0012\u00021W+\u00053j}#/19Al9Iw\t\u0005\u0019CuCwT~ UӤl\u0004o:\bH\u0004#B&É8i\u0011\u000e}`d\u0011Ur\u0012|v@+\u0019Sj?\rҖ{&<8^;\u001e]Ηnz-zR>˿ƴ\u001e\u0002\u001dײ(O6\u000bݳE3-4\u0005]AWQ,'*g\u0004@\fП\u001f8'2{Qdeʲe\"`19Dޓ\u0015\u0013\u0006\u0017|h 22\u0013\"\u0001ˠ- 6}Qc\u0006!Eqk&1p,9ˑ\u0005ZK\u0017\u007f:nz̤mm\u0011\u0013hAV(Q[2cԔߓQ/\u0019͉Y\u0003\u0016aݽW)\u007fBdn?DʗaA\u0010}3\u0019uyϕZ%+]rZf?×Q6}M\n&\t8Ĥ'-;\u0005]\u0007i\u0017ϯkZW<.3ErØ\u000bA\u0014+Nxb\u001fyLF!.\u00153E\u00177[;\u001a'ԂʺIJ,І0\u001b\\)δ1#oVFA\u0007HI\r\u007fXR9v\u000eYD-t'\u0004ԣž]%sѻ\u0002niSхA ,?]A3h\u001f8>\u000b*L@_ߙ@1\u0011/\u0019~ۍ˲\u000b\u001a;֏P$18\u0004\u0015\u0001;CP۪wÂw7z܌\u007f\u001b} ofi)\f\u0590Xۡ\u0010\u0002mڄO_q\\'aZP\f\u0097 ¼YF\bʩ7&*\u000e\u0004,PW?RB_\u000bK-\u061cYǋ*0>˔\\%Mx\u0007\u0001Z>w&\fjkcDA)$GS\u0015ϣ/ď\u000bEUˈJ\u0017R\u001e]\u0014e\u0013\\Ԁ?ٽ\u0001\u0010Wƀ\u00117W\u0005e/\u000ba\u0013ͫ\u007f̿>2i\u058cJSNlB\u0006[\u0016+ĠvݺqQgݐ\t\u001e\u001b!\u001cw_V7پl\u0099\u001c'SĴ\u0017Bj\u000eeA\u0011\u000f\u0017ǆ0ۮ2B\u0014ƅV\"<^/\u0002,Q7ŋ\u001fчKsIڧbn\n85\u0011\n5\\ȸs\u0095KK]ߎp??K\u0019\u0007jZ;\u007fj &3Y\u0001C\u0015.\b\u0002ɺIݭB 2Ӆ\u001e\u0010K\u0003V/\u0015\u0011RH\u00060^@'څf\u05cfa\r$\u05fbUW\u001b\u0007\rK\u00039a\u0007\u001fF\bf|um#[\u001d߲\u0007\u0016IÈ+\r$xGXs\f\u001bXV{6\u0001 ʗ\t̚M\u001c\u000bʱb#5.MUaMr\u007fsiicM*$ UP\\٣&\u008ek\u0013qپrk\u0011yNVWv\"Á\u0013ߒFj\u0017߇E(<<PU4A6\u0015pKM;\u000eDjnGīSۅn\u00022ڜ\bhz\u000b[w{\u0012'qIq?g\u007fc\"\u001ei\\\u0007BU\u0018|Ē\u001f̎\u001e#.ȿ\u0014J/d%\b4\u0001x)ld?\u0010\u0005k^ٙӘvllت{@B\u007fzQ7[\fTiD\u001177͢JƉ\u0014btԮwHV%1\u0001/\u00078߬\u0016ϘH|+ׇK<(\u001e0\u0011.CU\t\u001e\u001azc\b\u0015*mC8\u001doZ=CD\u0015܍tûp\u000bUۺ\u001cm5sT\u001d\u0011(;\u001e?m\u0017L\u0001Ć\u000eЁ\t,vև#m\u0004d\u000bd-'N\u001eO\u0007QGO\u0017AY\u0013·>ï\\\u0001vˉt'4B\u0014Qb^\n|\u0005A\"\u007fc[\u007f~L]L-<*N߄\u0019ܡ\u0016\nkˈ;Qo+\u001f\u0010~\\\u0006Pq<\b\fӫ\u000e(1ͣ \u0017-MV\u0001\u001b>0p\u0019\u000fdF!գpޓ)\tm\u05c8ؗxҦ\r"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`*~\u001dGC\u0003?b\u0007 5|\u001a8V\u0019", "\u001aiPCTuB]b\\\u0002h:|\u0005,l\u007f}", "0tX9W,K", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`*~\u001dGC\u0003?b\u0007 5|\u001a8V\u0002\u0018{8%\u0014hn\u000f", "uK^8[;M^fH~g;|\u00168a\u0007q~O\u0010\"c\u0011R\u001dK\u0002q\u0013c\u0007)7k%2WLyHD\"\u001cgaF\\'\u001d", "/vP6g\u0017B\\\u001b\rh^5\f", "", "/vP6g\u0017H\\\u001b\rg^*|\r@e~", "1kX2a;", "", "5dc\u0010_0>\\(=\u0005d/\f\u0018:", "u(I", "1n];X*MW#\bcZ4|", "", "5dc\u0010b5GS\u0017\u000e~h5e\u00057e>2\u0002C\u0010&\"", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1ta?X5M>)\r}K,\t\u0019/s\u000f6", "", "", "2dV?T+>R\u0004\u0003\u0004`:j\t8t", "2dV?T+>R\u0004\t\u0004`\u000b|\u0005.l\u00041{)\u000f", "2dV?T+>R\u0004\t\u0004`:i\t-e\u00049{?", "7mc2e=:Z\u0004\u0003\u0004`:j\t8t", "7mc2e=:Z\u0004\t\u0004`:i\t-e\u00049{?", "7rB5h;=]+\b", ":`bA:6HR\u0007\u000e\b^(\u0005l.", "5dc\u0019T:M5#\tyL;\n\t+mc':J\u0007\u001a&Vz", "u(8", "Adc\u0019T:M5#\tyL;\n\t+mc':J\u0007\u001a&Vz", "uH\u0018#", ":hbAX5>`", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`*~\u001dGC\u0003?b\u0007 5|\u001a8V\u0002\"oB-\u0015qaF\\", "5dc\u0019\\:MS\"~\b\u001d6\u0003\f>t\u000b", "u(;<^/Mb$LDb5\f\t<n{/EC\u0010&\"\u00149pK\u00060\u00027\b)@m\u0014=QMD*\u001b\"#waB\u0007p\u0002", "<dgAF;KS\u0015\u0007^]", "5dc\u001bX?MA(\fzZ4`\bmo\u0006+\u000bO\f", "Adc\u001bX?MA(\fzZ4`\bmo\u0006+\u000bO\f", "=j7Ag7,S(\u000e~g.\u000b", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`5o\u001dKz.7gS", "5dc\u001c^\u000fMb$lzm;\u0001\u00121s", "u(;<^/Mb$LDb5\f\t<n{/EC\u0010&\"\u00149{<\u000649b\u007f.\r", ">dT?F,Mb\u001d\b|l", "5dc\u001dX,KA\u0019\u000e\nb5~\u0017", "Adc\u001dX,KA\u0019\u000e\nb5~\u0017", "uK^8[;M^fH~g;|\u00168a\u0007q~O\u0010\"c\u0011]\u000eK\u0006)>[\fuz^", ">tb5B)LS&\u0010zk", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`2\u007f\u001c?`\"CY\u000b17zk", ">tb5D<>c\u0019", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&\u0006I~'$To\u0017K@\u00141g\u0004\fGm&.#", "\nrTA \u0006\u0017", "@dP15@MS'Zxd5\u0007\u001b6e~*{?", "5dc\u001fX(=0-\u000ezl\bz\u000f8o\u0012/{?\u0003\u0017\u0016", "u(9", "@dP15@MS'm\u0005m(\u0004", "5dc\u001fX(=0-\u000ezl\u001b\u0007\u0018+l", "@dP1X9+c\"\bv[3|", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`*~\u001dGC\u0003?b\u0007 5|\u001a8V\u0002(k0\u001d\u0015uNI\u0010l(K}'\u001d", "5dc\u001fX(=S&k\u000bg5x\u00066e", "u(;<^/Mb$LDb5\f\t<n{/EC\u0010&\"\u00149pK\u00060\u00027\b)@m\u0014=QMD*!\u001e\u0011gaFss5Wr$NL$", "AdcA\\5@a\u007f\u0003\tm,\u0006\t<Q\u0010(\f@", "AnR8X;", "\u001aiPCTuGS(Hhh*\u0003\t>;", "5dc b*DS(=\u0005d/\f\u0018:", "u(;7T=:\u001d\"~\n(\u001a\u0007\u00075e\u000f}", "Asa2T4L", "", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`*~\u001dGC\u0013Df}\u001c?C", "5dc g9>O!\r9h2\u007f\u0018>p", "u(;7T=:\u001d)\u000e~eud\u0005:;", "B`b8E<G\\\u0019\f", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&\u0006I~'$To\u0017K@\u00141g\u0004\rGv\u001f.Z\u0019", "EqXAX\tRb\u0019\rbZ?\u0001\u0011?m", "5dc$e0MSu\u0013\n^:d\u0005Bi\b8\u0004", "EqXAX\tRb\u0019\rih;x\u0010", "5dc$e0MSu\u0013\n^:k\u0013>a\u0007", "EqXAX9", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`*~\u001dGC\u0017B]\r DC", "5dc$e0MS&", "u(;<^/Mb$LDb5\f\t<n{/EC\u0010&\"\u00149pK\u00060\u0002K\u000b$Fm#\u0004", "EqXAX9*c\u0019\u000fz", "/vP6g\u0017H\\\u001b", "", "1k^@X", "1n];X*MW#\bXh+|", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`'|\u001bF\u0004\u0003?X}u", "Asa2T4\u001c]\u0018~", "1`d@X", "\u001aiPCTuB]bbd>?z\t:t\u00042\u0005\u0016", "1k^@XjHY\u001c\u000e\ni", "4`X966G\\\u0019|\nb6\u0006", ExifInterface.GPS_MEASUREMENT_3D, "4kd@[", "5dc g9>O!", "7c", "7r72T3MV-", "<nf\u001bf", "<df g9>O!", "/rb<V0:b\u0019}hm9|\u00057I~", "@d`BX:M6\u0019zy^9\u000b", "", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`*o\n;v2\u000b", "=tc", "=oT;F;KS\u0015\u0007Xh<\u0006\u0018", ">tb57(MO\u007fz\n^9", "Asa2T4\"R", "And?V,", "\u001anZ6bu\u001bc\u001a\u007fzk,{v9u\r&{\u0016", "0xc266N\\(", "7m56a0LV\u0019}", ">tb57(MO\u007fz\n^9;\u00135h\u000f7\u0007", ">tb5;,:R\u0019\f\tE(\f\t<", ">tb5;,:R\u0019\f\tE(\f\t<$\n.~O\u0010\"", ">tb5E,Jc\u0019\r\nE(\f\t<", ">tb5E,Jc\u0019\r\nE(\f\t<$\n.~O\u0010\"", ">tb5E,LS(evm,\n", "3qa<e\nHR\u0019", ">tb5E,LS(evm,\nG9k\u00037\u000bK", ">tb5F;KS\u0015\u0007", ">tb5X+,b&~vf", ">tb5X+,b&~vfj\u0007\u000f2t\u000f3", "@d\\<i,,b&~vf", "@d\\<i,,b&~vfj\u0007\u000f2t\u000f3", "Ad]17,@`\u0015}z]\u0017\u0001\u00121L{7{M", "Ad]17,@`\u0015}z]\u0017\u0001\u00121L{7{M?!\u001dJ~\u001dG", "Adc X;MW\"\u0001\t", "AdcA\\5@a", "AgdAW6P\\", "AsPAh:\u001c]\u0018~", "AsP?g", "Ad]166G\\\u0019|\nb6\u0006s<e\u0001$y@", "CoS.g,\u001c]\"\bz\\;\u0001\u00138F\u00072\u000e\u001e\u000b &Ty\u0015", "@dP1", "CoS.g,\u001c]\"\bz\\;\u0001\u00138F\u00072\u000e\u001e\u000b &Ty\u0015z\u0001+8h\r+", "EqXAX\u000b:b\u0015", "=tc\u0013\\5Ba\u001c~y", "0tU3X9", "\u001anZ6bu\u001bc\u001a\u007fzk\u0002", "EqXAX\u000f>O\u0018~\bl", "/kc2e5:b\u001d\b|", "EqXAX\u000f>O\u0018~\blj\u0007\u000f2t\u000f3", "EqXAX\u0017B\\\u001b", "@d_9l", ">`h9b(=\u001f", ">`h9b(= ", "EqXAX\u0017B\\\u001bZ\u0004]\b\u000f\u00053tj2\u0005B", "EqXAX\u001aR\\\u0006~\t^;", "EqXAX\u001aR\\\u0006~\t^;;\u00135h\u000f7\u0007", "EqXAX\u001aR\\\u0006~\t^;c\u0005>e\r", "EqXAX\u001aR\\\u0006~\t^;c\u0005>e\rf\u0006F\u0004&&R", "EqXAX\u001eB\\\u0018\t\rN7{\u0005>ef$\u000b@\u000e", "CmP0^5He ~y`,{eCt\u007f6h@|\u0016", "EqXAX\u001eB\\\u0018\t\rN7{\u0005>ef$\u000b@\u000eU!Mr\u001dK\u0002", "\u0010tX9W,K", "\u0011n\\=T5B]\"", "\u001ahbAX5>`", " dP1X9+c\"\bv[3|", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Http2Connection implements Closeable {
    public static final int AWAIT_PING = 3;
    public static final Companion Companion = new Companion(null);
    private static final Settings DEFAULT_SETTINGS;
    public static final int DEGRADED_PING = 2;
    public static final int DEGRADED_PONG_TIMEOUT_NS = 1000000000;
    public static final int INTERVAL_PING = 1;
    public static final int OKHTTP_CLIENT_WINDOW_SIZE = 16777216;
    private long awaitPingsSent;
    private long awaitPongsReceived;
    private final boolean client;
    private final String connectionName;
    private final Set<Integer> currentPushRequests;
    private long degradedPingsSent;
    private long degradedPongDeadlineNs;
    private long degradedPongsReceived;
    private long intervalPingsSent;
    private long intervalPongsReceived;
    private boolean isShutdown;
    private int lastGoodStreamId;
    private final Listener listener;
    private int nextStreamId;
    private final Settings okHttpSettings;
    private Settings peerSettings;
    private final PushObserver pushObserver;
    private final TaskQueue pushQueue;
    private long readBytesAcknowledged;
    private long readBytesTotal;
    private final ReaderRunnable readerRunnable;
    private final TaskQueue settingsListenerQueue;
    private final Socket socket;
    private final Map<Integer, Http2Stream> streams;
    private final TaskRunner taskRunner;
    private long writeBytesMaximum;
    private long writeBytesTotal;
    private final Http2Writer writer;
    private final TaskQueue writerQueue;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯZ\u001d<K!&i\u000eӵLш|\u0004O\u000f8é6B\u0015\"4\u0012}\u000bnjG<LeN1ZS@\u000fs{:'c$\u007fICU \u0001*\teNogtMb\u000bY\u000f\u000e\u0016~m4Ikxe\u0012\u00155JoU3UoC>htL\u0005(2(8\u0010ڎ1\u001aXGP\n\u000bGY\f*0nqJV\u001bO\u001d\u001a@\ţ$\u0001,`0RD}\u0005]hek\u000fwQf'\u000eܞ-Q\u001bUl';\u0007**9UO5CǬ\u0004\u0007\u0015gs?1U:I\u0013\u0004?'Yɞ$[Ds\u0018\u0014CG\u00189k\u001a>\\3ĩ\u0011\u00105Rgcyx>.}z\nDT\u0004<\u0010WN4-(\u0014 \u000ea##YFP\u0010\u007fZ\u007f)\u0004|\u001cu\u0018A+Q\u001b\u0015R8ݣ%\u05ee;\b\rټ6%\u0007s/at\u0010f\u001c)\\Hi?ZX=vX`\u0530iъ\b|j̣B\u00066R\u000e;\u001c\u00134$3E,Q10\u0004\u0002vT>Ϲ\u0011¾l_qɭ`B(\u007f$IJ\u000b\u0012mRxU\u0004^ip,?cr\u0382\u0013ą\f\u001f(ο\u0010>'<\u001efojo\u0004[wZ==\u0002OY\u001d\bdäEӷ7AYү(cX\u0014\"]\\d\u000bwtb$$h}@\"`jAݙ$ԞHZ\u0014ƎJAw?BPQ\u001bb:V)nZO$!_\t\u0011fи\u0001տ(\u000fq˅\r\u000b\u0007yj\u001b\u0010i~t:)1:;ni5GT,ȩ\u0015ط\u0001/\u000fѨ\f\u0002M\u0017Zwln\u001c'c.p((;i/k\u0016eȰ+ɨ\u00063Mɣ\u000bgW\u0001 [Ͼ\u00012"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`*~\u001dGC\u0003?b\u0007 5|\u001a8V\u0002\u0018{8%\u0014hn\u000f", "", "1kX2a;", "", "B`b8E<G\\\u0019\f", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&\u0006I~'$To\u0017K@\u00141g\u0004\rGv\u001f.Z\u0019", "uY;<^/Mb$LDb5\f\t<n{/E>\u000b \u0015W|\u001b<\u007f4~Hy.=Z&7VCHAw\u000f", "5dc\u0010_0>\\(=\u0005d/\f\u0018:", "u(I", "Adc\u0010_0>\\(=\u0005d/\f\u0018:", "uY\u0018#", "1n];X*MW#\bcZ4|", "", "5dc\u0010b5GS\u0017\u000e~h5e\u00057e>2\u0002C\u0010&\"", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u0010b5GS\u0017\u000e~h5e\u00057e>2\u0002C\u0010&\"", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", ":hbAX5>`", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`*~\u001dGC\u0003?b\u0007 5|\u001a8V\u0002\"oB-\u0015qaF\\", "5dc\u0019\\:MS\"~\b\u001d6\u0003\f>t\u000b", "u(;<^/Mb$LDb5\f\t<n{/EC\u0010&\"\u00149pK\u00060\u00027\b)@m\u0014=QMD*\u001b\"#waB\u0007p\u0002", "Adc\u0019\\:MS\"~\b\u001d6\u0003\f>t\u000b", "uK^8[;M^fH~g;|\u00168a\u0007q~O\u0010\"c\u0011R\u001dK\u0002q\u0013c\u0007)7k%2WLyR8,$hj9\u00149o?", ">h]4<5MS&\u0010ve\u0014\u0001\u00106i\u000e", "", "5dc\u001d\\5@7\"\u000ezk=x\u0010\u0017i\u0007/\u007fN?!\u001dJ~\u001dG", "u(8", "Adc\u001d\\5@7\"\u000ezk=x\u0010\u0017i\u0007/\u007fN?!\u001dJ~\u001dG", "uH\u0018#", ">tb5B)LS&\u0010zk", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`2\u007f\u001c?`\"CY\u000b17zk", "5dc\u001dh:A=\u0016\rzk=|\u0016mo\u0006+\u000bO\f", "u(;<^/Mb$LDb5\f\t<n{/EC\u0010&\"\u00149xL\u0005(\u001fV\f D~\u0016;#", "Adc\u001dh:A=\u0016\rzk=|\u0016mo\u0006+\u000bO\f", "uK^8[;M^fH~g;|\u00168a\u0007q~O\u0010\"c\u0011Z\u001eJy\u000f2g}-Hm#\u0004\u00114", "Ah]8", "\u001anZ6bu\u001bc\u001a\u007fzk,{v3n\u0006}", "5dc \\5D\u0012#\u0005}m;\b", "u(;<^0H\u001du\u000f{_,\n\t.S\u00041\u0002\u0016", "Adc \\5D\u0012#\u0005}m;\b", "uK^8\\6\b0)\u007f{^9|\b\u001di\t.Q\u0004q", "AnR8X;", "\u001aiPCTuGS(Hhh*\u0003\t>;", "5dc b*DS(=\u0005d/\f\u0018:", "u(;7T=:\u001d\"~\n(\u001a\u0007\u00075e\u000f}", "Adc b*DS(=\u0005d/\f\u0018:", "uKY.i(\b\\\u0019\u000eDL6z\u000f/tUkl", "And?V,", "\u001anZ6bu\u001bc\u001a\u007fzk,{v9u\r&{\u0016", "5dc b<KQ\u0019=\u0005d/\f\u0018:", "u(;<^0H\u001du\u000f{_,\n\t.S\n8\t>\u0001l", "Adc b<KQ\u0019=\u0005d/\f\u0018:", "uK^8\\6\b0)\u007f{^9|\b\u001do\u00105y@VZ\b", "5dc!T:D@)\b\u0004^9;\u00135h\u000f7\u0007", "u(;<^/Mb$LDb5\f\t<n{/E>\u000b \u0015W|\u001b<\u007f4~Hy.=Z&7VCHA", "0tX9W", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`*~\u001dGC\u0003?b\u0007 5|\u001a8V\u0019", ">dT?A(FS", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Builder {
        private boolean client;
        public String connectionName;
        private Listener listener;
        private int pingIntervalMillis;
        private PushObserver pushObserver;
        public BufferedSink sink;
        public Socket socket;
        public BufferedSource source;
        private final TaskRunner taskRunner;

        public Builder(boolean z2, TaskRunner taskRunner) {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            this.client = z2;
            this.taskRunner = taskRunner;
            this.listener = Listener.REFUSE_INCOMING_STREAMS;
            this.pushObserver = PushObserver.CANCEL;
        }

        public static /* synthetic */ Builder socket$default(Builder builder, Socket socket, String str, BufferedSource bufferedSource, BufferedSink bufferedSink, int i2, Object obj) throws IOException {
            if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
                str = Util.peerName(socket);
            }
            if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
                bufferedSource = Okio.buffer(Okio.source(socket));
            }
            if ((i2 & 8) != 0) {
                bufferedSink = Okio.buffer(Okio.sink(socket));
            }
            return builder.socket(socket, str, bufferedSource, bufferedSink);
        }

        public final Http2Connection build() {
            return new Http2Connection(this);
        }

        public final boolean getClient$okhttp() {
            return this.client;
        }

        public final String getConnectionName$okhttp() {
            String str = this.connectionName;
            if (str != null) {
                return str;
            }
            Intrinsics.throwUninitializedPropertyAccessException("connectionName");
            return null;
        }

        public final Listener getListener$okhttp() {
            return this.listener;
        }

        public final int getPingIntervalMillis$okhttp() {
            return this.pingIntervalMillis;
        }

        public final PushObserver getPushObserver$okhttp() {
            return this.pushObserver;
        }

        public final BufferedSink getSink$okhttp() {
            BufferedSink bufferedSink = this.sink;
            if (bufferedSink != null) {
                return bufferedSink;
            }
            Intrinsics.throwUninitializedPropertyAccessException("sink");
            return null;
        }

        public final Socket getSocket$okhttp() {
            Socket socket = this.socket;
            if (socket != null) {
                return socket;
            }
            Intrinsics.throwUninitializedPropertyAccessException("socket");
            return null;
        }

        public final BufferedSource getSource$okhttp() {
            BufferedSource bufferedSource = this.source;
            if (bufferedSource != null) {
                return bufferedSource;
            }
            Intrinsics.throwUninitializedPropertyAccessException("source");
            return null;
        }

        public final TaskRunner getTaskRunner$okhttp() {
            return this.taskRunner;
        }

        public final Builder listener(Listener listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.listener = listener;
            return this;
        }

        public final Builder pingIntervalMillis(int i2) {
            this.pingIntervalMillis = i2;
            return this;
        }

        public final Builder pushObserver(PushObserver pushObserver) {
            Intrinsics.checkNotNullParameter(pushObserver, "pushObserver");
            this.pushObserver = pushObserver;
            return this;
        }

        public final void setClient$okhttp(boolean z2) {
            this.client = z2;
        }

        public final void setConnectionName$okhttp(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.connectionName = str;
        }

        public final void setListener$okhttp(Listener listener) {
            Intrinsics.checkNotNullParameter(listener, "<set-?>");
            this.listener = listener;
        }

        public final void setPingIntervalMillis$okhttp(int i2) {
            this.pingIntervalMillis = i2;
        }

        public final void setPushObserver$okhttp(PushObserver pushObserver) {
            Intrinsics.checkNotNullParameter(pushObserver, "<set-?>");
            this.pushObserver = pushObserver;
        }

        public final void setSink$okhttp(BufferedSink bufferedSink) {
            Intrinsics.checkNotNullParameter(bufferedSink, "<set-?>");
            this.sink = bufferedSink;
        }

        public final void setSocket$okhttp(Socket socket) {
            Intrinsics.checkNotNullParameter(socket, "<set-?>");
            this.socket = socket;
        }

        public final void setSource$okhttp(BufferedSource bufferedSource) {
            Intrinsics.checkNotNullParameter(bufferedSource, "<set-?>");
            this.source = bufferedSource;
        }

        public final Builder socket(Socket socket) throws IOException {
            Intrinsics.checkNotNullParameter(socket, "socket");
            return socket$default(this, socket, null, null, null, 14, null);
        }

        public final Builder socket(Socket socket, String peerName) throws IOException {
            Intrinsics.checkNotNullParameter(socket, "socket");
            Intrinsics.checkNotNullParameter(peerName, "peerName");
            return socket$default(this, socket, peerName, null, null, 12, null);
        }

        public final Builder socket(Socket socket, String peerName, BufferedSource source) throws IOException {
            Intrinsics.checkNotNullParameter(socket, "socket");
            Intrinsics.checkNotNullParameter(peerName, "peerName");
            Intrinsics.checkNotNullParameter(source, "source");
            return socket$default(this, socket, peerName, source, null, 8, null);
        }

        public final Builder socket(Socket socket, String peerName, BufferedSource source, BufferedSink sink) throws IOException {
            Intrinsics.checkNotNullParameter(socket, "socket");
            Intrinsics.checkNotNullParameter(peerName, "peerName");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(sink, "sink");
            setSocket$okhttp(socket);
            setConnectionName$okhttp(this.client ? Util.okHttpName + TokenParser.SP + peerName : "MockWebServer " + peerName);
            setSource$okhttp(source);
            setSink$okhttp(sink);
            return this;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116Ȑ\u0007\"B\u0012\u007f\u0007lo?ӋE{߉^R\u0002)Op\u00024ż_$\u007fC\fa(~:\t}P>ˮAН^\u000bKƤV%\u0007mDI\u0004|ٕ\u0016\u0015:ԏ\bA9R}C\nl\u0003=\u001d `$\u000fэWв\u001e*PƵG\u0007QS$\u0012^BGô%ҫQ\u0005\"ŇVJ.\n6\\\u0016P\rԦ?Һ>/+Ʌ:N\\1w0+OcІ'ܮ\u0011viӜґDB"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`*~\u001dGC\u0003?b\u0007 5|\u001a8V\u0002\u0019u<)\u0011qeC\u00109", "", "u(E", "\u000fV0\u0016G&)7\u0002`", "", "\u0012D5\u000eH\u0013-M\u0007^iM\u0010ej\u001d", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`5o\u001dKz.7gS", "5dc\u00118\r\u001aC\u007fmtL\fkw\u0013Na\u0016", "u(;<^/Mb$LDb5\f\t<n{/EC\u0010&\"\u00149{<\u000649b\u007f.\r", "\u0012D6\u001f4\u000b\u001e2\u0013i^G\u000e", "\u0012D6\u001f4\u000b\u001e2\u0013idG\u000evw\u0013M_\u0012k/z\u007f\u0005", "\u0017MC\u0012E\u001d\u001a:\u0013i^G\u000e", "\u001dJ7!G\u001781\u007fbZG\u001bvz\u0013N^\u0012m:nz\f'", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Settings getDEFAULT_SETTINGS() {
            return Http2Connection.DEFAULT_SETTINGS;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0LeN.ZS@\u000fs{:$aH\bّY_J}P\b\bMq(qН^\u000bQ\u000fN,\u0007kDI\u0004z\u000e\u0016\u001d5Zom7}sK>xtd\u000bfFjF\b\f\u0019\u001aXJ@z\tKc\f@9\u0007\u0015ĖV\u0018"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`*~\u001dGC\u0003?b\u0007 5|\u001a8V\u0002\"oB-\u0015qaF\\", "", "u(E", "=mB2g;B\\\u001b\r", "", "1n];X*MW#\b", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`*~\u001dGC\u0003?b\u0007 5|\u001a8V\u0019", "AdcA\\5@a", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`5o\u001dKz.7gS", "=mBAe,:[", "Asa2T4", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`*~\u001dGC\u0013Df}\u001c?C", "\u0011n\\=T5B]\"", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static abstract class Listener {
        public static final Companion Companion = new Companion(null);
        public static final Listener REFUSE_INCOMING_STREAMS = new Listener() { // from class: okhttp3.internal.http2.Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1
            @Override // okhttp3.internal.http2.Http2Connection.Listener
            public void onStream(Http2Stream stream) throws IOException {
                Intrinsics.checkNotNullParameter(stream, "stream");
                stream.close(ErrorCode.REFUSED_STREAM, null);
            }
        };

        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0005ӳ-(Մ7f\u00198pIkH¯VS8\u000f<\nB%s$ EqYpԊ$\u07beSNo˧ĚN]"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`*~\u001dGC\u0003?b\u0007 5|\u001a8V\u0002\"oB-\u0015qaFEA6V\u0002#PPX52", "", "u(E", " D5\"F\f87\u0002\\dF\u0010ej)Sn\u0015[\u001ch\u0005", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`*~\u001dGC\u0003?b\u0007 5|\u001a8V\u0002\"oB-\u0015qaF\\", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public void onSettings(Http2Connection connection, Settings settings) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(settings, "settings");
        }

        public abstract void onStream(Http2Stream http2Stream) throws IOException;
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Яb\u001d<K!&i\u0016DLc\u000b\u0004I\u0006>\u000b6Ȑ\u0007\"B\u0012\u007f\u0007lnA0RkP\u008cZS8\u001bsڔ<$q$yCAV\"}0\u0010WNmgvJh\u0014KƤ\u000e\u0016\u000fj4I[ye\u0012%2JoE5UoS9ht<\u0007(20V\u0002\u0005\u0017\u001a2H\u0016\u0005\u0001ŖM\"۵`@\u001f9\u0003\u0013]\u0007*\u00124?N\u0001^imޮFLz_R/Q\u0006ݦFN5cx\u0003[\u0014^TU\u000e=ufaN?M\u0015ST3\u000b`dW\u0003m{m\tv2?+w\u007f\b:f\r,\u0015Y]=a\u00015t\u0005\u007fl<+9_{K~\u0018X{\t\r%<2 L;\u0011B;-~\b<4%vaTh\u0002\rW0~oL/%.Js_)~iai\u001a~;\n\u001e%\u001eQ\u0016\u001f%i]&`C%\u0005{_Ki@kc~\u000egY\u0006\u0004\u001flH>LNU\u001dG{?/G)EyQ#Ou2LR\u0007\u000f\u0005\u000f\t\u0004m`iX\"\u001d$}>Q8hf|\u0005\u001aQ\u0005\\:*e\u001c\u0003\u001c.\f!)twj+U\u0014\\r\u0001i\u0019W\u000e\u00143S~=ip{\u000e\u0006_\rX{e,\u0017oy\u000f\u0014m=)ۊX/`a4r\\V#bLx9\u0010{rc<\u0017@i\n\u001cb6a\u001dj@`\u0003LL\b\u0011Q\u0006h\u0015(~\u00034T\u0007w-\r\t/Z\rt}\u0015\u0011IZ\u0007\u0011&;oi5G0\u0006&vc\u0015#5\u0014:\u0014\u0010\fZwdlDv\u0006\u007f.\u001f29\u007f9m\u0017\u001d0A207uV\u0001\u0018iS\")\u000b|(5i\u000et{P\u0001~_xjxP\u0005\u001b0\u007fvrQ\u0012\u0015\u0004\b\u0001^zu\u0004\u001b\u001f$TW\t\u001bYjOh\u0001\u001336%/\u0005R\u0001CC['K->(w+o\u0012\u0002o\\z\u0013\u00134}}\u0004ZmFsp\u0007u2iJ\u0010mOP0&\u0005\u0003pKA̬\nɚ\r:\u0015Ή`Cjud>\u0530\u000fe"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`*~\u001dGC\u0003?b\u0007 5|\u001a8V\u0002(k0\u001d\u0015uNI\u0010l(K}'\u001d", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`*~\u001dGC\u00125U| D,x*VBBkAs", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "@dP1X9", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`*~\u001dGC\u00125U| DC", "uK^8[;M^fH~g;|\u00168a\u0007q~O\u0010\"c\u0011R\u001dK\u0002q\u0013c\u0007)7k%2WL\u0011R>$\u0018wpDT-0W\u0006'TUJ3&U\u0002L\u001f^$p]:\u0018QFA mDDtK\u001d", "5dc\u001fX(=S&=\u0005d/\f\u0018:", "u(;<^/Mb$LDb5\f\t<n{/EC\u0010&\"\u00149pK\u00060\u0002F}\u001c6m#\u0004", "/bZ X;MW\"\u0001\t", "/kc2e5:b\u0019lzk=\u0001\u0007/", "Asa2T4\"R", "", "=qX4\\5", "", ">q^Ab*HZ", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "6nbA", ">naA", ";`g\u000eZ,", "", "/o_9l\bGRt|\u0001L,\f\u00183n\u00026", "1kT.e\u0017KS*\u0003\u0005n:", "", "AdcA\\5@a", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`5o\u001dKz.7gS", "2`c.", "7m56a0LV\u0019}", "And?V,", "\u001anZ6bu\u001bc\u001a\u007fzk,{v9u\r&{\u0016", ":d]4g/", "5n0DT@", ":`bA:6HR\u0007\u000e\b^(\u0005l.", "3qa<e\nHR\u0019", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`'|\u001bF\u0004\u0003?X}u", "2dQBZ\u000b:b\u0015", "6dP1X9L", "/rb<V0:b\u0019}hm9|\u00057I~", "6dP1X9\u001bZ#|\u0001", "", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`*o\n;v2\u000b", "7me<^,", ">h]4", "/bZ", ">`h9b(=\u001f", ">`h9b(= ", ">qX<e0Mg", "Asa2T4\u001dS$~\u0004],\u0006\u0007C", "EdX4[;", "3wR9h:Bd\u0019", ">tb5C9H[\u001d\rz", ">q^:\\:>R\u0007\u000e\b^(\u0005l.", "@d`BX:M6\u0019zy^9\u000b", "@rc g9>O!", "Eh]1b>.^\u0018z\n^", "Eh]1b>,W.~^g*\n\t7e\t7", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public final class ReaderRunnable implements Http2Reader.Handler, Function0<Unit> {
        private final Http2Reader reader;
        final /* synthetic */ Http2Connection this$0;

        public ReaderRunnable(Http2Connection http2Connection, Http2Reader reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            this.this$0 = http2Connection;
            this.reader = reader;
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void ackSettings() {
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void alternateService(int i2, String origin, ByteString protocol, String host, int i3, long j2) {
            Intrinsics.checkNotNullParameter(origin, "origin");
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            Intrinsics.checkNotNullParameter(host, "host");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void applyAndAckSettings(boolean z2, Settings settings) {
            long initialWindowSize;
            int i2;
            Http2Stream[] http2StreamArr;
            Intrinsics.checkNotNullParameter(settings, "settings");
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            Http2Writer writer = this.this$0.getWriter();
            final Http2Connection http2Connection = this.this$0;
            synchronized (writer) {
                synchronized (http2Connection) {
                    Settings peerSettings = http2Connection.getPeerSettings();
                    T t2 = settings;
                    if (!z2) {
                        Settings settings2 = new Settings();
                        settings2.merge(peerSettings);
                        settings2.merge(settings);
                        t2 = settings2;
                    }
                    objectRef.element = t2;
                    initialWindowSize = ((long) ((Settings) objectRef.element).getInitialWindowSize()) - ((long) peerSettings.getInitialWindowSize());
                    http2StreamArr = (initialWindowSize == 0 || http2Connection.getStreams$okhttp().isEmpty()) ? null : (Http2Stream[]) http2Connection.getStreams$okhttp().values().toArray(new Http2Stream[0]);
                    http2Connection.setPeerSettings((Settings) objectRef.element);
                    TaskQueue taskQueue = http2Connection.settingsListenerQueue;
                    final String str = http2Connection.getConnectionName$okhttp() + " onSettings";
                    final boolean z3 = true;
                    taskQueue.schedule(new Task(str, z3) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$applyAndAckSettings$lambda$7$lambda$6$$inlined$execute$default$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // okhttp3.internal.concurrent.Task
                        public long runOnce() {
                            http2Connection.getListener$okhttp().onSettings(http2Connection, (Settings) objectRef.element);
                            return -1L;
                        }
                    }, 0L);
                    Unit unit = Unit.INSTANCE;
                }
                try {
                    http2Connection.getWriter().applyAndAckSettings((Settings) objectRef.element);
                } catch (IOException e2) {
                    http2Connection.failConnection(e2);
                }
                Unit unit2 = Unit.INSTANCE;
            }
            if (http2StreamArr != null) {
                for (Http2Stream http2Stream : http2StreamArr) {
                    synchronized (http2Stream) {
                        http2Stream.addBytesToWriteWindow(initialWindowSize);
                        Unit unit3 = Unit.INSTANCE;
                    }
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void data(boolean z2, int i2, BufferedSource source, int i3) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.this$0.pushedStream$okhttp(i2)) {
                this.this$0.pushDataLater$okhttp(i2, source, i3, z2);
                return;
            }
            Http2Stream stream = this.this$0.getStream(i2);
            if (stream == null) {
                this.this$0.writeSynResetLater$okhttp(i2, ErrorCode.PROTOCOL_ERROR);
                long j2 = i3;
                this.this$0.updateConnectionFlowControl$okhttp(j2);
                source.skip(j2);
                return;
            }
            stream.receiveData(source, i3);
            if (z2) {
                stream.receiveHeaders(Util.EMPTY_HEADERS, true);
            }
        }

        public final Http2Reader getReader$okhttp() {
            return this.reader;
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void goAway(int i2, ErrorCode errorCode, ByteString debugData) {
            int i3;
            Object[] array;
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            Intrinsics.checkNotNullParameter(debugData, "debugData");
            debugData.size();
            Http2Connection http2Connection = this.this$0;
            synchronized (http2Connection) {
                array = http2Connection.getStreams$okhttp().values().toArray(new Http2Stream[0]);
                http2Connection.isShutdown = true;
                Unit unit = Unit.INSTANCE;
            }
            for (Http2Stream http2Stream : (Http2Stream[]) array) {
                if (http2Stream.getId() > i2 && http2Stream.isLocallyInitiated()) {
                    http2Stream.receiveRstStream(ErrorCode.REFUSED_STREAM);
                    this.this$0.removeStream$okhttp(http2Stream.getId());
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void headers(boolean z2, int i2, int i3, List<Header> headerBlock) {
            Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
            if (this.this$0.pushedStream$okhttp(i2)) {
                this.this$0.pushHeadersLater$okhttp(i2, headerBlock, z2);
                return;
            }
            final Http2Connection http2Connection = this.this$0;
            synchronized (http2Connection) {
                Http2Stream stream = http2Connection.getStream(i2);
                if (stream != null) {
                    Unit unit = Unit.INSTANCE;
                    stream.receiveHeaders(Util.toHeaders(headerBlock), z2);
                    return;
                }
                if (http2Connection.isShutdown) {
                    return;
                }
                if (i2 <= http2Connection.getLastGoodStreamId$okhttp()) {
                    return;
                }
                if (i2 % 2 == http2Connection.getNextStreamId$okhttp() % 2) {
                    return;
                }
                final Http2Stream http2Stream = new Http2Stream(i2, http2Connection, false, z2, Util.toHeaders(headerBlock));
                http2Connection.setLastGoodStreamId$okhttp(i2);
                http2Connection.getStreams$okhttp().put(Integer.valueOf(i2), http2Stream);
                TaskQueue taskQueueNewQueue = http2Connection.taskRunner.newQueue();
                final String str = http2Connection.getConnectionName$okhttp() + AbstractJsonLexerKt.BEGIN_LIST + i2 + "] onStream";
                final boolean z3 = true;
                taskQueueNewQueue.schedule(new Task(str, z3) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$headers$lambda$2$$inlined$execute$default$1
                    @Override // okhttp3.internal.concurrent.Task
                    public long runOnce() {
                        try {
                            http2Connection.getListener$okhttp().onStream(http2Stream);
                            return -1L;
                        } catch (IOException e2) {
                            Platform.Companion.get().log("Http2Connection.Listener failure for " + http2Connection.getConnectionName$okhttp(), 4, e2);
                            try {
                                http2Stream.close(ErrorCode.PROTOCOL_ERROR, e2);
                                return -1L;
                            } catch (IOException unused) {
                                return -1L;
                            }
                        }
                    }
                }, 0L);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public void invoke2() {
            ErrorCode errorCode;
            ErrorCode errorCode2 = ErrorCode.INTERNAL_ERROR;
            ErrorCode errorCode3 = ErrorCode.INTERNAL_ERROR;
            IOException e2 = null;
            try {
                try {
                    this.reader.readConnectionPreface(this);
                    while (this.reader.nextFrame(false, this)) {
                    }
                    errorCode2 = ErrorCode.NO_ERROR;
                    errorCode = ErrorCode.CANCEL;
                } catch (IOException e3) {
                    e2 = e3;
                    errorCode2 = ErrorCode.PROTOCOL_ERROR;
                    errorCode = ErrorCode.PROTOCOL_ERROR;
                }
                this.this$0.close$okhttp(errorCode2, errorCode, e2);
                Util.closeQuietly(this.reader);
            } catch (Throwable th) {
                this.this$0.close$okhttp(errorCode2, errorCode3, e2);
                Util.closeQuietly(this.reader);
                throw th;
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void ping(boolean z2, final int i2, final int i3) {
            if (!z2) {
                TaskQueue taskQueue = this.this$0.writerQueue;
                final String str = this.this$0.getConnectionName$okhttp() + " ping";
                final Http2Connection http2Connection = this.this$0;
                final boolean z3 = true;
                taskQueue.schedule(new Task(str, z3) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$ping$$inlined$execute$default$1
                    @Override // okhttp3.internal.concurrent.Task
                    public long runOnce() {
                        http2Connection.writePing(true, i2, i3);
                        return -1L;
                    }
                }, 0L);
                return;
            }
            Http2Connection http2Connection2 = this.this$0;
            synchronized (http2Connection2) {
                if (i2 == 1) {
                    long j2 = http2Connection2.intervalPongsReceived;
                    http2Connection2.intervalPongsReceived = 1 + j2;
                    Long.valueOf(j2);
                } else if (i2 != 2) {
                    if (i2 == 3) {
                        http2Connection2.awaitPongsReceived++;
                        Intrinsics.checkNotNull(http2Connection2, "null cannot be cast to non-null type java.lang.Object");
                        http2Connection2.notifyAll();
                    }
                    Unit unit = Unit.INSTANCE;
                } else {
                    long j3 = http2Connection2.degradedPongsReceived;
                    http2Connection2.degradedPongsReceived = 1 + j3;
                    Long.valueOf(j3);
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void priority(int i2, int i3, int i4, boolean z2) {
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void pushPromise(int i2, int i3, List<Header> requestHeaders) {
            Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
            this.this$0.pushRequestLater$okhttp(i3, requestHeaders);
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void rstStream(int i2, ErrorCode errorCode) {
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            if (this.this$0.pushedStream$okhttp(i2)) {
                this.this$0.pushResetLater$okhttp(i2, errorCode);
                return;
            }
            Http2Stream http2StreamRemoveStream$okhttp = this.this$0.removeStream$okhttp(i2);
            if (http2StreamRemoveStream$okhttp != null) {
                http2StreamRemoveStream$okhttp.receiveRstStream(errorCode);
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void settings(final boolean z2, final Settings settings) {
            Intrinsics.checkNotNullParameter(settings, "settings");
            TaskQueue taskQueue = this.this$0.writerQueue;
            final String str = this.this$0.getConnectionName$okhttp() + " applyAndAckSettings";
            final boolean z3 = true;
            taskQueue.schedule(new Task(str, z3) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$settings$$inlined$execute$default$1
                @Override // okhttp3.internal.concurrent.Task
                public long runOnce() {
                    this.applyAndAckSettings(z2, settings);
                    return -1L;
                }
            }, 0L);
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void windowUpdate(int i2, long j2) {
            if (i2 == 0) {
                Http2Connection http2Connection = this.this$0;
                synchronized (http2Connection) {
                    http2Connection.writeBytesMaximum = http2Connection.getWriteBytesMaximum() + j2;
                    Intrinsics.checkNotNull(http2Connection, "null cannot be cast to non-null type java.lang.Object");
                    http2Connection.notifyAll();
                    Unit unit = Unit.INSTANCE;
                }
                return;
            }
            Http2Stream stream = this.this$0.getStream(i2);
            if (stream != null) {
                synchronized (stream) {
                    stream.addBytesToWriteWindow(j2);
                    Unit unit2 = Unit.INSTANCE;
                }
            }
        }
    }

    static {
        Settings settings = new Settings();
        settings.set(7, 65535);
        settings.set(5, 16384);
        DEFAULT_SETTINGS = settings;
    }

    public Http2Connection(Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        boolean client$okhttp = builder.getClient$okhttp();
        this.client = client$okhttp;
        this.listener = builder.getListener$okhttp();
        this.streams = new LinkedHashMap();
        String connectionName$okhttp = builder.getConnectionName$okhttp();
        this.connectionName = connectionName$okhttp;
        this.nextStreamId = builder.getClient$okhttp() ? 3 : 2;
        TaskRunner taskRunner$okhttp = builder.getTaskRunner$okhttp();
        this.taskRunner = taskRunner$okhttp;
        TaskQueue taskQueueNewQueue = taskRunner$okhttp.newQueue();
        this.writerQueue = taskQueueNewQueue;
        this.pushQueue = taskRunner$okhttp.newQueue();
        this.settingsListenerQueue = taskRunner$okhttp.newQueue();
        this.pushObserver = builder.getPushObserver$okhttp();
        Settings settings = new Settings();
        if (builder.getClient$okhttp()) {
            settings.set(7, 16777216);
        }
        this.okHttpSettings = settings;
        this.peerSettings = DEFAULT_SETTINGS;
        this.writeBytesMaximum = r0.getInitialWindowSize();
        this.socket = builder.getSocket$okhttp();
        this.writer = new Http2Writer(builder.getSink$okhttp(), client$okhttp);
        this.readerRunnable = new ReaderRunnable(this, new Http2Reader(builder.getSource$okhttp(), client$okhttp));
        this.currentPushRequests = new LinkedHashSet();
        if (builder.getPingIntervalMillis$okhttp() != 0) {
            final long nanos = TimeUnit.MILLISECONDS.toNanos(builder.getPingIntervalMillis$okhttp());
            final String str = connectionName$okhttp + " ping";
            taskQueueNewQueue.schedule(new Task(str) { // from class: okhttp3.internal.http2.Http2Connection$special$$inlined$schedule$1
                @Override // okhttp3.internal.concurrent.Task
                public long runOnce() {
                    boolean z2;
                    synchronized (this) {
                        if (this.intervalPongsReceived < this.intervalPingsSent) {
                            z2 = true;
                        } else {
                            this.intervalPingsSent++;
                            z2 = false;
                        }
                    }
                    if (z2) {
                        this.failConnection(null);
                        return -1L;
                    }
                    this.writePing(false, 1, 0);
                    return nanos;
                }
            }, nanos);
        }
    }

    public final void failConnection(IOException iOException) {
        close$okhttp(ErrorCode.PROTOCOL_ERROR, ErrorCode.PROTOCOL_ERROR, iOException);
    }

    private final Http2Stream newStream(int i2, List<Header> list, boolean z2) throws IOException {
        int i3;
        Http2Stream http2Stream;
        boolean z3;
        boolean z4 = !z2;
        synchronized (this.writer) {
            synchronized (this) {
                if (this.nextStreamId > 1073741823) {
                    shutdown(ErrorCode.REFUSED_STREAM);
                }
                if (this.isShutdown) {
                    throw new ConnectionShutdownException();
                }
                i3 = this.nextStreamId;
                this.nextStreamId = i3 + 2;
                http2Stream = new Http2Stream(i3, this, z4, false, null);
                z3 = !z2 || this.writeBytesTotal >= this.writeBytesMaximum || http2Stream.getWriteBytesTotal() >= http2Stream.getWriteBytesMaximum();
                if (http2Stream.isOpen()) {
                    this.streams.put(Integer.valueOf(i3), http2Stream);
                }
                Unit unit = Unit.INSTANCE;
            }
            if (i2 == 0) {
                this.writer.headers(z4, i3, list);
            } else {
                if (this.client) {
                    throw new IllegalArgumentException("client streams shouldn't have associated stream IDs".toString());
                }
                this.writer.pushPromise(i2, i3, list);
            }
            Unit unit2 = Unit.INSTANCE;
        }
        if (z3) {
            this.writer.flush();
        }
        return http2Stream;
    }

    public static /* synthetic */ void start$default(Http2Connection http2Connection, boolean z2, TaskRunner taskRunner, int i2, Object obj) throws IOException {
        if ((i2 + 1) - (1 | i2) != 0) {
            z2 = true;
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            taskRunner = TaskRunner.INSTANCE;
        }
        http2Connection.start(z2, taskRunner);
    }

    public final synchronized void awaitPong() throws InterruptedException {
        while (this.awaitPongsReceived < this.awaitPingsSent) {
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            wait();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        close$okhttp(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }

    public final void close$okhttp(ErrorCode connectionCode, ErrorCode streamCode, IOException iOException) {
        int i2;
        Object[] array;
        Intrinsics.checkNotNullParameter(connectionCode, "connectionCode");
        Intrinsics.checkNotNullParameter(streamCode, "streamCode");
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        try {
            shutdown(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.streams.isEmpty()) {
                array = null;
            } else {
                array = this.streams.values().toArray(new Http2Stream[0]);
                this.streams.clear();
            }
            Unit unit = Unit.INSTANCE;
        }
        Http2Stream[] http2StreamArr = (Http2Stream[]) array;
        if (http2StreamArr != null) {
            for (Http2Stream http2Stream : http2StreamArr) {
                try {
                    http2Stream.close(streamCode, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.writer.close();
        } catch (IOException unused3) {
        }
        try {
            this.socket.close();
        } catch (IOException unused4) {
        }
        this.writerQueue.shutdown();
        this.pushQueue.shutdown();
        this.settingsListenerQueue.shutdown();
    }

    public final void flush() throws IOException {
        this.writer.flush();
    }

    public final boolean getClient$okhttp() {
        return this.client;
    }

    public final String getConnectionName$okhttp() {
        return this.connectionName;
    }

    public final int getLastGoodStreamId$okhttp() {
        return this.lastGoodStreamId;
    }

    public final Listener getListener$okhttp() {
        return this.listener;
    }

    public final int getNextStreamId$okhttp() {
        return this.nextStreamId;
    }

    public final Settings getOkHttpSettings() {
        return this.okHttpSettings;
    }

    public final Settings getPeerSettings() {
        return this.peerSettings;
    }

    public final long getReadBytesAcknowledged() {
        return this.readBytesAcknowledged;
    }

    public final long getReadBytesTotal() {
        return this.readBytesTotal;
    }

    public final ReaderRunnable getReaderRunnable() {
        return this.readerRunnable;
    }

    public final Socket getSocket$okhttp() {
        return this.socket;
    }

    public final synchronized Http2Stream getStream(int i2) {
        return this.streams.get(Integer.valueOf(i2));
    }

    public final Map<Integer, Http2Stream> getStreams$okhttp() {
        return this.streams;
    }

    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    public final Http2Writer getWriter() {
        return this.writer;
    }

    public final synchronized boolean isHealthy(long j2) {
        if (this.isShutdown) {
            return false;
        }
        if (this.degradedPongsReceived < this.degradedPingsSent) {
            if (j2 >= this.degradedPongDeadlineNs) {
                return false;
            }
        }
        return true;
    }

    public final Http2Stream newStream(List<Header> requestHeaders, boolean z2) throws IOException {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        return newStream(0, requestHeaders, z2);
    }

    public final synchronized int openStreamCount() {
        return this.streams.size();
    }

    public final void pushDataLater$okhttp(final int i2, BufferedSource source, final int i3, final boolean z2) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        final Buffer buffer = new Buffer();
        long j2 = i3;
        source.require(j2);
        source.read(buffer, j2);
        TaskQueue taskQueue = this.pushQueue;
        final String str = this.connectionName + AbstractJsonLexerKt.BEGIN_LIST + i2 + "] onData";
        final boolean z3 = true;
        taskQueue.schedule(new Task(str, z3) { // from class: okhttp3.internal.http2.Http2Connection$pushDataLater$$inlined$execute$default$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                try {
                    boolean zOnData = this.pushObserver.onData(i2, buffer, i3, z2);
                    if (zOnData) {
                        this.getWriter().rstStream(i2, ErrorCode.CANCEL);
                    }
                    if (!zOnData && !z2) {
                        return -1L;
                    }
                    synchronized (this) {
                        this.currentPushRequests.remove(Integer.valueOf(i2));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            }
        }, 0L);
    }

    public final void pushHeadersLater$okhttp(final int i2, final List<Header> requestHeaders, final boolean z2) {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        TaskQueue taskQueue = this.pushQueue;
        final String str = this.connectionName + AbstractJsonLexerKt.BEGIN_LIST + i2 + "] onHeaders";
        final boolean z3 = true;
        taskQueue.schedule(new Task(str, z3) { // from class: okhttp3.internal.http2.Http2Connection$pushHeadersLater$$inlined$execute$default$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                boolean zOnHeaders = this.pushObserver.onHeaders(i2, requestHeaders, z2);
                if (zOnHeaders) {
                    try {
                        this.getWriter().rstStream(i2, ErrorCode.CANCEL);
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
                if (!zOnHeaders && !z2) {
                    return -1L;
                }
                synchronized (this) {
                    this.currentPushRequests.remove(Integer.valueOf(i2));
                }
                return -1L;
            }
        }, 0L);
    }

    public final void pushRequestLater$okhttp(final int i2, final List<Header> requestHeaders) {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        synchronized (this) {
            if (this.currentPushRequests.contains(Integer.valueOf(i2))) {
                writeSynResetLater$okhttp(i2, ErrorCode.PROTOCOL_ERROR);
                return;
            }
            this.currentPushRequests.add(Integer.valueOf(i2));
            TaskQueue taskQueue = this.pushQueue;
            final String str = this.connectionName + AbstractJsonLexerKt.BEGIN_LIST + i2 + "] onRequest";
            final boolean z2 = true;
            taskQueue.schedule(new Task(str, z2) { // from class: okhttp3.internal.http2.Http2Connection$pushRequestLater$$inlined$execute$default$1
                @Override // okhttp3.internal.concurrent.Task
                public long runOnce() {
                    if (!this.pushObserver.onRequest(i2, requestHeaders)) {
                        return -1L;
                    }
                    try {
                        this.getWriter().rstStream(i2, ErrorCode.CANCEL);
                        synchronized (this) {
                            this.currentPushRequests.remove(Integer.valueOf(i2));
                        }
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            }, 0L);
        }
    }

    public final void pushResetLater$okhttp(final int i2, final ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        TaskQueue taskQueue = this.pushQueue;
        final String str = this.connectionName + AbstractJsonLexerKt.BEGIN_LIST + i2 + "] onReset";
        final boolean z2 = true;
        taskQueue.schedule(new Task(str, z2) { // from class: okhttp3.internal.http2.Http2Connection$pushResetLater$$inlined$execute$default$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                this.pushObserver.onReset(i2, errorCode);
                synchronized (this) {
                    this.currentPushRequests.remove(Integer.valueOf(i2));
                    Unit unit = Unit.INSTANCE;
                }
                return -1L;
            }
        }, 0L);
    }

    public final Http2Stream pushStream(int i2, List<Header> requestHeaders, boolean z2) throws IOException {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        if (this.client) {
            throw new IllegalStateException("Client cannot push requests.".toString());
        }
        return newStream(i2, requestHeaders, z2);
    }

    public final boolean pushedStream$okhttp(int i2) {
        return i2 != 0 && (i2 & 1) == 0;
    }

    public final synchronized Http2Stream removeStream$okhttp(int i2) {
        Http2Stream http2StreamRemove;
        http2StreamRemove = this.streams.remove(Integer.valueOf(i2));
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return http2StreamRemove;
    }

    public final void sendDegradedPingLater$okhttp() {
        synchronized (this) {
            long j2 = this.degradedPongsReceived;
            long j3 = this.degradedPingsSent;
            if (j2 < j3) {
                return;
            }
            this.degradedPingsSent = j3 + 1;
            this.degradedPongDeadlineNs = System.nanoTime() + ((long) 1000000000);
            Unit unit = Unit.INSTANCE;
            TaskQueue taskQueue = this.writerQueue;
            final String str = this.connectionName + " ping";
            final boolean z2 = true;
            taskQueue.schedule(new Task(str, z2) { // from class: okhttp3.internal.http2.Http2Connection$sendDegradedPingLater$$inlined$execute$default$1
                @Override // okhttp3.internal.concurrent.Task
                public long runOnce() {
                    this.writePing(false, 2, 0);
                    return -1L;
                }
            }, 0L);
        }
    }

    public final void setLastGoodStreamId$okhttp(int i2) {
        this.lastGoodStreamId = i2;
    }

    public final void setNextStreamId$okhttp(int i2) {
        this.nextStreamId = i2;
    }

    public final void setPeerSettings(Settings settings) {
        Intrinsics.checkNotNullParameter(settings, "<set-?>");
        this.peerSettings = settings;
    }

    public final void setSettings(Settings settings) throws IOException {
        Intrinsics.checkNotNullParameter(settings, "settings");
        synchronized (this.writer) {
            synchronized (this) {
                if (this.isShutdown) {
                    throw new ConnectionShutdownException();
                }
                this.okHttpSettings.merge(settings);
                Unit unit = Unit.INSTANCE;
            }
            this.writer.settings(settings);
            Unit unit2 = Unit.INSTANCE;
        }
    }

    public final void shutdown(ErrorCode statusCode) throws IOException {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        synchronized (this.writer) {
            Ref.IntRef intRef = new Ref.IntRef();
            synchronized (this) {
                if (this.isShutdown) {
                    return;
                }
                this.isShutdown = true;
                intRef.element = this.lastGoodStreamId;
                Unit unit = Unit.INSTANCE;
                this.writer.goAway(intRef.element, statusCode, Util.EMPTY_BYTE_ARRAY);
                Unit unit2 = Unit.INSTANCE;
            }
        }
    }

    public final void start() throws IOException {
        start$default(this, false, null, 3, null);
    }

    public final void start(boolean z2) throws IOException {
        start$default(this, z2, null, 2, null);
    }

    public final void start(boolean z2, TaskRunner taskRunner) throws IOException {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        if (z2) {
            this.writer.connectionPreface();
            this.writer.settings(this.okHttpSettings);
            if (this.okHttpSettings.getInitialWindowSize() != 65535) {
                this.writer.windowUpdate(0, r1 - 65535);
            }
        }
        taskRunner.newQueue().schedule(new TaskQueue.AnonymousClass1(this.connectionName, true, this.readerRunnable), 0L);
    }

    public final synchronized void updateConnectionFlowControl$okhttp(long j2) {
        long j3 = this.readBytesTotal + j2;
        this.readBytesTotal = j3;
        long j4 = j3 - this.readBytesAcknowledged;
        if (j4 >= this.okHttpSettings.getInitialWindowSize() / 2) {
            writeWindowUpdateLater$okhttp(0, j4);
            this.readBytesAcknowledged += j4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0033, code lost:
    
        r5 = java.lang.Math.min((int) java.lang.Math.min(r12, r0 - r2), r8.writer.maxDataLength());
        r0 = r5;
        r8.writeBytesTotal += r0;
        r2 = kotlin.Unit.INSTANCE;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void writeData(int r9, boolean r10, okio.Buffer r11, long r12) throws java.io.IOException {
        /*
            r8 = this;
            r6 = 0
            int r0 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            r4 = 0
            if (r0 != 0) goto Ld
            okhttp3.internal.http2.Http2Writer r0 = r8.writer
            r0.data(r10, r9, r11, r4)
            return
        Ld:
            int r0 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r0 <= 0) goto L73
            monitor-enter(r8)
        L12:
            long r2 = r8.writeBytesTotal     // Catch: java.lang.InterruptedException -> L63 java.lang.Throwable -> L70
            long r0 = r8.writeBytesMaximum     // Catch: java.lang.InterruptedException -> L63 java.lang.Throwable -> L70
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 < 0) goto L32
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r1 = r8.streams     // Catch: java.lang.InterruptedException -> L63 java.lang.Throwable -> L70
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.InterruptedException -> L63 java.lang.Throwable -> L70
            boolean r0 = r1.containsKey(r0)     // Catch: java.lang.InterruptedException -> L63 java.lang.Throwable -> L70
            if (r0 == 0) goto L5b
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r8, r0)     // Catch: java.lang.InterruptedException -> L63 java.lang.Throwable -> L70
            r0 = r8
            java.lang.Object r0 = (java.lang.Object) r0     // Catch: java.lang.InterruptedException -> L63 java.lang.Throwable -> L70
            r0.wait()     // Catch: java.lang.InterruptedException -> L63 java.lang.Throwable -> L70
            goto L12
        L32:
            long r0 = r0 - r2
            long r0 = java.lang.Math.min(r12, r0)     // Catch: java.lang.Throwable -> L70
            int r2 = (int) r0     // Catch: java.lang.Throwable -> L70
            okhttp3.internal.http2.Http2Writer r0 = r8.writer     // Catch: java.lang.Throwable -> L70
            int r0 = r0.maxDataLength()     // Catch: java.lang.Throwable -> L70
            int r5 = java.lang.Math.min(r2, r0)     // Catch: java.lang.Throwable -> L70
            long r2 = r8.writeBytesTotal     // Catch: java.lang.Throwable -> L70
            long r0 = (long) r5     // Catch: java.lang.Throwable -> L70
            long r2 = r2 + r0
            r8.writeBytesTotal = r2     // Catch: java.lang.Throwable -> L70
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L70
            monitor-exit(r8)
            long r12 = r12 - r0
            okhttp3.internal.http2.Http2Writer r1 = r8.writer
            if (r10 == 0) goto L59
            int r0 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r0 != 0) goto L59
            r0 = 1
        L55:
            r1.data(r0, r9, r11, r5)
            goto Ld
        L59:
            r0 = r4
            goto L55
        L5b:
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.InterruptedException -> L63 java.lang.Throwable -> L70
            java.lang.String r0 = "stream closed"
            r1.<init>(r0)     // Catch: java.lang.InterruptedException -> L63 java.lang.Throwable -> L70
            throw r1     // Catch: java.lang.InterruptedException -> L63 java.lang.Throwable -> L70
        L63:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L70
            r0.interrupt()     // Catch: java.lang.Throwable -> L70
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L70
            r0.<init>()     // Catch: java.lang.Throwable -> L70
            throw r0     // Catch: java.lang.Throwable -> L70
        L70:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.writeData(int, boolean, okio.Buffer, long):void");
    }

    public final void writeHeaders$okhttp(int i2, boolean z2, List<Header> alternating) throws IOException {
        Intrinsics.checkNotNullParameter(alternating, "alternating");
        this.writer.headers(z2, i2, alternating);
    }

    public final void writePing() throws InterruptedException {
        synchronized (this) {
            this.awaitPingsSent++;
        }
        writePing(false, 3, 1330343787);
    }

    public final void writePing(boolean z2, int i2, int i3) {
        try {
            this.writer.ping(z2, i2, i3);
        } catch (IOException e2) {
            failConnection(e2);
        }
    }

    public final void writePingAndAwaitPong() throws InterruptedException {
        writePing();
        awaitPong();
    }

    public final void writeSynReset$okhttp(int i2, ErrorCode statusCode) throws IOException {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        this.writer.rstStream(i2, statusCode);
    }

    public final void writeSynResetLater$okhttp(final int i2, final ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        TaskQueue taskQueue = this.writerQueue;
        final String str = this.connectionName + AbstractJsonLexerKt.BEGIN_LIST + i2 + "] writeSynReset";
        final boolean z2 = true;
        taskQueue.schedule(new Task(str, z2) { // from class: okhttp3.internal.http2.Http2Connection$writeSynResetLater$$inlined$execute$default$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                try {
                    this.writeSynReset$okhttp(i2, errorCode);
                    return -1L;
                } catch (IOException e2) {
                    this.failConnection(e2);
                    return -1L;
                }
            }
        }, 0L);
    }

    public final void writeWindowUpdateLater$okhttp(final int i2, final long j2) {
        TaskQueue taskQueue = this.writerQueue;
        final String str = this.connectionName + AbstractJsonLexerKt.BEGIN_LIST + i2 + "] windowUpdate";
        final boolean z2 = true;
        taskQueue.schedule(new Task(str, z2) { // from class: okhttp3.internal.http2.Http2Connection$writeWindowUpdateLater$$inlined$execute$default$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                try {
                    this.getWriter().windowUpdate(i2, j2);
                    return -1L;
                } catch (IOException e2) {
                    this.failConnection(e2);
                    return -1L;
                }
            }
        }, 0L);
    }
}
