package com.facebook.imagepipeline.core;

import android.content.Context;
import android.graphics.Bitmap;
import com.facebook.cache.common.CacheKey;
import com.facebook.cache.disk.DiskCacheConfig;
import com.facebook.callercontext.CallerContextVerifier;
import com.facebook.common.executors.SerialExecutorService;
import com.facebook.common.internal.Supplier;
import com.facebook.common.memory.MemoryTrimmableRegistry;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.cache.BitmapMemoryCacheFactory;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.cache.CountingMemoryCache;
import com.facebook.imagepipeline.cache.ImageCacheStatsTracker;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.imagepipeline.cache.MemoryCacheParams;
import com.facebook.imagepipeline.debug.CloseableReferenceLeakTracker;
import com.facebook.imagepipeline.decoder.ImageDecoder;
import com.facebook.imagepipeline.decoder.ImageDecoderConfig;
import com.facebook.imagepipeline.decoder.ProgressiveJpegConfig;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.listener.RequestListener;
import com.facebook.imagepipeline.listener.RequestListener2;
import com.facebook.imagepipeline.memory.PoolFactory;
import com.facebook.imagepipeline.producers.CustomProducerSequenceFactory;
import com.facebook.imagepipeline.producers.NetworkFetcher;
import com.facebook.imagepipeline.transcoder.ImageTranscoderFactory;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 4 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яġ\u0015D57\u001eq\u007fR܀kŞ\fA\u001c0\u0013.X~*,(w\u000ffp:8D{H6RY+\u0017k\u00124,[*rK;k\u001a\u0006\"\u000fPVg}nRZ!C\u0017\u0006\u001cyr,_U\u0001]\u0018\u0010:B\u0006?;Mu>A`\u000b6\r 8#@y\u001b\u0001\"*N\u0011~zYK\u0014\u00126Ax:`-U\u00050\u0012\u000e>&\u0002&\\}N>Hr^B/1%qB\\3g0\u0013M\u0015FZ(\u0015vo'3@=5\u001d%i\u0003\u000fRaC\u000b?\b=\rh-(3I\nW>X\u0006\u0015\u001d+e\rer,]\rQv\f/+UdSP$(\u007fz\u0002\u000eD\u0004$\u0006/H4.\"f\u001e\u000e;txTHP\u0018^J\u007f\u0001b>\u00173\u0006;+?&nQw;!N=|\r\r4#\tn'\\\\\u000ev\u0015#T}R9QV=PN\u0010ZEm\u001apj\u00020\u00058G\u0016/\u0004\u00114\u0017-7q9+!q\u0004N)}ϸ5`\u0017R:pV@:|&9:\t:\\Tf\u0015k~Wn+?NrΨ\tą\f\u00178^}@/*``]n\u0002lc\\8,\u0006ϰ9֍ro&Y?fA>\"{\u001ekj~$ALb3Z|A\u0002\u00171ډ*ϒ6L\u0003\u0012}\bR[\\#@M\n\u001cb;\bǰ^ČL\u00076DG\r\u0017p+~\u001e\u0011l94\u0005y$#\u001d/c3ˀqς|MD~f7;W\"E'=m\"\u0017LSɤ\tҋw\u0004_iR`Z\u0007f\u0006c\u00178\u0016HU(Ȥ?т\u0013\u0003A4\bJSjCw_l*)\u0011{(/\u0012ă0Թ\fn\t.f\fXq%'0\u001avrQ,;ѧ{ӶJ~_eZ0id\u001a\u0003\u0011\u0001TNf%[Ȼ ݵ\u0005s:~;VQQm,\u0006?G\u001bq_yo\\'\u0011;|ܐgנ0g.qh\u007fka\fHW\n\u0017>PUCþD\u05f8n{ D\u000ff\u001bf\u0019_r%nF]\r?}\u0015=<\u000f\u0001V\nq)n,i\u0005ʥ,ϵG\u0002,`I]\u001f\u0007$}{(cb\u001bL\u001f\n97_\u0002hι?֕Z[z\u000b6B\u0002.\u0007_I \u001dJ\u0019&D,j\n\u001bEdi4N\u0011~t`eņ4¡w?n\u0010Z8j[\u0019\u001bn\u0006x':\u0003\u000f\u000fa2'H\bܱoܑX3{4\u0007\u0015+\u001fkz]A~%Y\\+ۊ\u001dϜ\\\u0005#Gc\u0007W\u001c\u0007\u0016Um\u0006m\u0006\u000bf]SܯDɓ\u001f=i\u0013e=>&[er\u0017|v@0)ư$Ĺ\u0003~\u0015\u0010BT\u001dVi_\u0001<z-z\u001cN̦Eױ\u0005\u001b\\+\rZ\u000b3\u0017+;VM-k\u001bA͆)ٖ[WS\u007f\u000er.zT\u0005/1o\u000e\u0015_4ΐ<Ϧu\u001az\u0004\u000fi^wT@XM\u000b\fD\u0007d)Xז\u0004եb]\u0004y'\u001b5\u0007=\u0018P(\u0001z b\u001bAEϐ\rөj5n{t\f^|Y9[\u000f+Zp9?5vǬ\u0013\u05ca\u0018\u0019>!<jp\r`cqM\tmeZ;\u0011eP\u0001Մ3ëV\"\u0016!\u007f\\\u0012\u0012%8#$nMl _Ѕnܣ[\u0012vl.M\u0003uy*\u000bi`d!\u0015DF!Y\u0013B\u000eن!˝\u0011Kx\t\n0W<qA`+37`FFİx\u05ce\u0007>zv\u0006\u0016PrC\u0010u\u0019EF\u0003tpƂ[ޡqh\u001b(Q3F1X>\u001f})/\t\u001eV#3ӱ\u001eՀU7Y\u001b\u0017q#*V\u007f\u0015\fMj\u007fG{ݠ\u0003Ϙ\u0005\u0011W{7`Hi\b\u00071&'s+Wl<S-<;)ڧ\u0006ib\u0001S\\d\t2>W0] \u0010Tn{`ڑ&ڱ\ny;\u0002K.V(0pNѳro\u0005Tģ5E\u07b6%ؼp~\f\u000e2ʙ\u0017\u0002߮Z2HOʴ\u00131ElϦ,CزGޣl\u007f#H\u0013Ҽ\u0013Eʜ\u0005yN%ύ\u000fgzP0Yuc.\u000bѸ;A ZΈ4ݦ:~_C_ح\u0005;A%~xݣlih =\"\u0010#\u0003&٧Q\u000f,7\u009d\u001aĔO{^9bܜLO\u0012[R\u001dĪ]FB:B\\\u008d0Ц\u001b\u0007\u0016MfŘ\u0012A6ؼEڸ\u0011"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/BYG\u0004?i\u0018.8GFk;\"\u001eh?C\u0010d0PZ0VL[-XPr\u0013", "", "0hc:T7\u001cO\u0017\u0002zH=|\u0016<i~(", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t!3\\}i\u001fm\u001e8ZW\u0019g2!\u0015>", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0007+c\u0003(E>\u000b\u001f\u001fQxW\u001ar#8Yc KC", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006z-1[}i\u0015t <M?8r4\u0002\u001ddc9\\", "5dc\u000f\\;FO$\\v\\/|r@e\r5\u007f?\u0001", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn3U{#77}.UMH\u007f\u0012\u001a\u0013ka\u000f", "0hc:T7\u001c]\"\u007f~`", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0005\u007fO\t\u0013\"\u0006M\u0018Ew)7/", "5dc\u000f\\;FO$\\\u0005g-\u0001\u000b", "u(;.a+K]\u001d}D`9x\u00142i}6E\u001d\u0005&\u001fCzL\u001a\u0001.6]\u007fu", "0hc:T7&S!\t\br\nx\u00072e_1\u000bM\u0015\u0005&C~\u000e&s35f\u000f D", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t!3\\}i\u0015w&7\\GDm\u001c\u001e\u001drnMd_*Qve'U]9p@\u00029#\u0012D\u000b\\+\u001a\u0016YNy", "5dc\u000f\\;FO$fzf6\n\u001d\ra}+{ \n&$[]\u001d8\u0006%\u001fV\f D~\u0016;", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn3U{#77s8]LJo= |hiC\u0014w\nJt*G\u000b.5k_\u0007+#\u000ei\u000e8(\u001b\u0005fR${\u001a", "0hc:T7&S!\t\br\nx\u00072e`$yO\u000b$+", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t!3\\}i\u0014q%6IN#k<(\"|?5\u0005f,/r%VV[@2", "5dc\u000f\\;FO$fzf6\n\u001d\ra}+{!|\u0015&Q|\"", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn3U{#77r2\\K7v\u001c\u001e\u001drnMd_*Qv\bCJ]6ifH", "0hc:T7&S!\t\br\nx\u00072ej$\t<\t%\u0005Wz\u0019Cz%B", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\u0005 &G|\u00178}n#i\t+>q\u0016;#", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t!3\\}i\u001fm\u001e8ZW\u0019g2!\u0015S]F\u0003k:$", "5dc\u000f\\;FO$fzf6\n\u001d\ra}+{+|$\u0013O}{L\u00020<]}-", "u(;0b4\bT\u0015|z[6\u0007\u000fxc\n0\u0004J\n`\u001bP~\u000eI\u007f!<#k0Bx\u001d2MP\u0011", "0hc:T7&S!\t\br\nx\u00072en5\u007fHn&$C~\u000e>\u000b", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t!3\\}i\u001fm\u001e8ZW\u0019g2!\u0015'?5\u0005f,=\u0004+O:]9Xar?(g", "5dc\u000f\\;FO$fzf6\n\u001d\ra}+{/\u000e\u001b\u001f5~\u001b8\u0006%7m", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn3U{#77}.UMH\u007f\u0012\u001a\u0013kawd_*Qv\u0016TPV\u001ak_nL\u0014\u0014nc", "1`R5X\u0012>gyzxm6\n\u001d", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t!3\\}i\u0015i\u00141M);\u007f\u0015\u001a\u0013wkF\u001b9", "5dc\u0010T*AS~~\u000f?(z\u00189r\u0014", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn3U{#77s*KF;Q42ud_H\u0011p@$", "1`[9X9\u001c]\"\u000ezq;m\t<i\u0001,{M", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0007+l\u0007(\t>\u000b &G\u0003\u001d\u0006T!<`}-\u0015w\u001f=MVJ\\4+\u0019ie9\u00149", "5dc\u0010T3ES&\\\u0005g;|\u001c>V\u007f5\u007fA\u0005\u0017$", "u(;0b4\bT\u0015|z[6\u0007\u000fxc{/\u0003@\u000e\u0015!P~\u000eO\u0006n\u0013U\u0005'7zs8VR;~C\u000f\u0015ue:\u000bc9$", "1k^@X(;Z\u0019kz_,\n\t8c\u007f\u000f{<\u0007\u0006$Cm\u0014<\u0004", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006u%2i\u007fi\u0015t <M?8r4\u000b\u0015iaF\u0007l*N]'CR=9XPx=!g", "5dc\u0010_6LS\u0015{\u0002^\u0019|\n/r\u007f1y@g\u0017\u0013M^\u001b8t+5f", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn4Yz097s5WQ;g1%\u0015Ua:\u0007p,Wt'.LJ2K_n;\u001a\u0012gc", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "5dc\u0010b5MS,\u000e", "u(;.a+K]\u001d}D\\6\u0006\u0018/n\u000fqYJ\n&\u0017Z~c", "1tbAb4)`#}\u000b\\,\nv/q\u0010(\u0005>\u0001w\u0013E~\u0018Iz%C", "", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w+SIz>&\u007fuk8\u0017a,[d'S\\N5ZRS9\u0012!d\u001bb\u0001", "5dc\u0010h:M]!i\bh+\r\u0007/rm(\bP\u0001 \u0015GP\n:\u0006/B]}.", "u(;7T=:\u001d)\u000e~euj\t>;", "2nf;f(F^ ~bh+|", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/BYG~A\u007f\u001f<IKFr4\u0006\u001fga\u000f", "5dc\u0011b>Ga\u0015\u0007\u0006e,d\u0013.e", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn3c\u000b \u0001L @VQ7s?%\u0015Pk8\u00079", "2x].`0<2\u001d\r\u0001<(z\f/C\n1|D\u0003~\u0013R", "", "", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0007+c\u0003(E?\u0005%\u001d\u0011N\u0012J|\u00031W\u0001 \u0015w\u001f/QE\u0011", "5dc\u0011l5:[\u001d|Yb:\u0003f+c\u0003(YJ\n\u0018\u001bIW\nG", "u(;7T=:\u001d)\u000e~eud\u0005:;", "3mP/_,\u001e\\\u0017\ty^+`\u0011+g\u007f\u0006\u0006G\u000b$\u0005Rk\f<f31[}", "", "5dc\u0012a(;Z\u0019^\u0004\\6{\t.I\b$}@^!\u001eQ|{Gr#5I\f\u001c9m", "3mR<W,=;\u0019\u0007\u0005k@Z\u0005-h\u007f\u0012\r@\u000e$\u001bFo", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\t\u0017\u001fQ|\"\u0006a/?`}\u001f\u0014\u0002%.*S<l4+j", "5dc\u0012a*HR\u0019}b^4\u0007\u0016CC{&~@j(\u0017T|\u0012;v", "3mR<W,=;\u0019\u0007\u0005k@Z\u0005-h\u007f\u0013wM|\u001f%5\u007f\u0019G})5f", "5dc\u0012a*HR\u0019}b^4\u0007\u0016CC{&~@k\u0013$Cw\u001c*\u00070@`\u0002 D", "3mR<W,=;\u0019\u0007\u0005k@Z\u0005-h\u007f\u0017\tD\t\u0005&Tk\u001d<x9", "5dc\u0012a*HR\u0019}b^4\u0007\u0016CC{&~@o$\u001bO]\u001dIr45[\u0012", "3wT0h;H`\u0007~\bo0z\t\u0010o\r\u0004\u0005D\t\u0013&GnqDr'5g", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\u0001*\u0017E\u007f\u001dF\u00043~G}-;i\u001d\u000e`C9{C(\"VaF\u0018g*NL", "5dc\u0012k,<c(\t\bL,\n\u001a3c\u007f\t\u0006M\\ \u001bOk\u001d<u\t=U\u007f E", "u(;0b4\bT\u0015|z[6\u0007\u000fxc\n0\u0004J\n`\u0017Zo\fL\u0006/BgG\u000e7z\u001a*T#Nk2.$rn'\u0007p=Rt'\u001d", "3wT0h;H`\u0007\u000f\u0006i3\u0001\t<", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/BYG\u007fJm\u0014>\\MHYD) oe9\u00149", "5dc\u0012k,<c(\t\bL<\b\u00146i\u007f5", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn3c\u000b \u0001M).KSJuA\f%sl@\u000bc9$", "3w_2e0FS\"\u000e\t", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/BYG\u0004?i\u0018.8GFk;\"\u001ehAL\u0012c9R~'P[\\\u0002", "5dc\u0012k7>`\u001d\u0007zg;\u000b", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn3c\u000b \u0001Q\u001e*OC&o?\u001e\u001clj9fv7N\u0004+OLW;j(", "4h[26(<V\u0019_v\\;\u0007\u0016C", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/BYG\u0001;t\u0016\fIA>k\u0015\u001a\u0013wkF\u001b9", "5dc\u0013\\3>1\u0015|}^\rx\u0007>o\r<", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn3c\u000b \u0001N\u001a5M!7i7\u001eud_H\u0011p@$", "7lP4X\n:Q\u001c~hm(\f\u0017\u001er{&\u0002@\u000e", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t!3\\}i\u001bu\u00120M!7i7\u001e\u0003w]H\u0015R9Jt-GY$", "5dc\u0016`(@Svzxa,j\u0018+t\u000e\u0017\t<~\u001d\u0017T", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn3U{#77y6IE;I0\u001c\u0018hOH\u0003r:=\u0004#ERN92", "7lP4X\u000b>Q#}zk", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006u%3c| D7y6IE;J4\u001c\u001fgaF\\", "5dc\u0016`(@Sw~xh+|\u0016", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn4Y{*6m#w1K7m4|\u0015fk8\u0007p\u0002", "7lP4X\u000b>Q#}zk\n\u0007\u00120i\u0002", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006u%3c| D7y6IE;J4\u001c\u001fgaFdm5Oz)\u001d", "5dc\u0016`(@Sw~xh+|\u0016\ro\t)\u007fB", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn4Y{*6m#w1K7m4|\u0015fk8\u0007p\nX\u007f(KN$", "7lP4X\u001bKO\"\rxh+|\u0016\u0010a}7\u0006M\u0015", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u000621b\f\u001eAl\u0016;\u0017'Cg6\u001e\u0004u]B\u0015a6Mv4(HL;f_\u0007\u0013", "5dc\u0016`(@S\b\fvg:z\u0013.e\r\tw>\u0010!$[", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012EvnDfy)Ek -MP\u0005O<\u001a\u0017hPF\u0003l:L\u0001&GY/(Za|J(g", "7lP4X\u001bKO\"\rxh+|\u0016\u001ey\u000b(", "", "5dc\u0016`(@S\b\fvg:z\u0013.e\r\u0017\u0010K\u0001", "u(;7T=:\u001d z\u0004`u`\u0012>e\u0002(\t\u0016", "7r36f2\u001cO\u0017\u0002z>5x\u00066e~", "u(I", "7r??X->b\u0017\u0002Zg(y\u0010/dm8\u0007K\b\u001b\u0017T", "7rA2f0SSt\byK6\f\u0005>e_1w=\b\u0017\u0016(y\u001b%v4Gc\u000b&", ";`X;70LYvzxa,Z\u00138f\u0004*", "5dc\u001aT0G2\u001d\r\u0001<(z\f/C\n1|D\u0003", "u(;0b4\bT\u0015|z[6\u0007\u000fxc{&~@J\u0016\u001bUuW\u001bz3;7y\u001e:ms8VD?m\n", ";d\\<e@\u001cV)\b\u0001M@\b\t", "5dc\u001aX4H`-\\}n5\u0003wCp\u007f", "u(8", ";d\\<e@-`\u001d\u0007\u0003Z)\u0004\t\u001ce\u0002,\nO\u000e+", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\t\u0017\u001fQ|\"\u0006^%=c\u000b4&z\u001a6U?8r4\u000b\u0015jeG\u0016p@$", "5dc\u001aX4H`-m\bb4\u0005\u0005,l\u007f\u0015{B\u0005%&T\u0004", "u(;0b4\bT\u0015|z[6\u0007\u000fxc\n0\u0004J\n`\u001fGw\u0018I\u000bn\u001dY\u0006*D\u0002\u0005;QKCg1%\u0015Ua;\u000bq;[\u000b|", "<dcDb9D4\u0019\u000exa,\n", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w6CJ}>+\u001bIaH\u0005f,[L", "5dc\u001bX;P]&\u0005[^;z\f/r", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn@f\b\u001fGk\u0016;[\r$kC0\u001fug\u001a\u0007r*Qv4\u001d", ">kPAY6K[u\u0003\nf(\bi+c\u000f2\tT", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006s)Day+E7\u00015IR<uA&qlpA\u0003n\rJt6QYb\u0002", "5dc\u001d_(MT#\f\u0003;0\f\u0011+p`$yO\u000b$+", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn2]\r(3x$w8J7z5(\"p>=\u0016k(YW#E[X9p(", ">n^99(<b#\f\u000f", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006~%=c\u000b4\u0001X 8T$7iC(\"|7", "5dc\u001db6E4\u0015|\nh9\u0011", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn=Y\u0006*D\u0002_\u0019WMBL0\u001c$rnM\\", ">q^4e,La\u001d\u0010zC7|\u000b\ro\t)\u007fB", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006u%3c| D7\u0001;WEHkB,\u0019ya\u001e\u0012c.,\u00010HPP\u0002", "5dc\u001de6@`\u0019\r\tb=|m:e\u0002\u0006\u0006I\u0002\u001b\u0019", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn4Y{*6m#w8PEmA\u001e#veJ\u0007H7Nx\u0005QUO0^(", "@d`BX:M:\u001d\r\n^5|\u0016{s", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006})Ch})7z_\u001bMOKkB-{loH\u0007l,[C|", "5dc\u001fX8NS'\u000eab:\f\t8e\rt\n", "@d`BX:M:\u001d\r\n^5|\u0016=", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006})Ch})7z_\u001bMOKkB-{loH\u0007l,[L", "5dc\u001fX8NS'\u000eab:\f\t8e\r6", "AlP9_\u0010FO\u001b~Yb:\u0003f+c\u0003(YJ\n\u0018\u001bI", "5dc `(EZ|\u0007v`,[\r=k]$yC\u0001t!Pp\u0012>", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface ImagePipelineConfigInterface {
    MemoryCache<CacheKey, CloseableImage> getBitmapCacheOverride();

    Bitmap.Config getBitmapConfig();

    CountingMemoryCache.EntryStateObserver<CacheKey> getBitmapMemoryCacheEntryStateObserver();

    BitmapMemoryCacheFactory getBitmapMemoryCacheFactory();

    Supplier<MemoryCacheParams> getBitmapMemoryCacheParamsSupplier();

    MemoryCache.CacheTrimStrategy getBitmapMemoryCacheTrimStrategy();

    CacheKeyFactory getCacheKeyFactory();

    CallerContextVerifier getCallerContextVerifier();

    CloseableReferenceLeakTracker getCloseableReferenceLeakTracker();

    Context getContext();

    Set<CustomProducerSequenceFactory> getCustomProducerSequenceFactories();

    DownsampleMode getDownsampleMode();

    Map<String, DiskCacheConfig> getDynamicDiskCacheConfigMap();

    Supplier<Boolean> getEnableEncodedImageColorSpaceUsage();

    MemoryCache<CacheKey, PooledByteBuffer> getEncodedMemoryCacheOverride();

    Supplier<MemoryCacheParams> getEncodedMemoryCacheParamsSupplier();

    MemoryCache.CacheTrimStrategy getEncodedMemoryCacheTrimStrategy();

    SerialExecutorService getExecutorServiceForAnimatedImages();

    ExecutorSupplier getExecutorSupplier();

    ImagePipelineExperiments getExperiments();

    FileCacheFactory getFileCacheFactory();

    ImageCacheStatsTracker getImageCacheStatsTracker();

    ImageDecoder getImageDecoder();

    ImageDecoderConfig getImageDecoderConfig();

    ImageTranscoderFactory getImageTranscoderFactory();

    Integer getImageTranscoderType();

    DiskCacheConfig getMainDiskCacheConfig();

    int getMemoryChunkType();

    MemoryTrimmableRegistry getMemoryTrimmableRegistry();

    NetworkFetcher<?> getNetworkFetcher();

    PlatformBitmapFactory getPlatformBitmapFactory();

    PoolFactory getPoolFactory();

    ProgressiveJpegConfig getProgressiveJpegConfig();

    Set<RequestListener2> getRequestListener2s();

    Set<RequestListener> getRequestListeners();

    DiskCacheConfig getSmallImageDiskCacheConfig();

    boolean isDiskCacheEnabled();

    Supplier<Boolean> isPrefetchEnabledSupplier();

    boolean isResizeAndRotateEnabledForNetwork();
}
