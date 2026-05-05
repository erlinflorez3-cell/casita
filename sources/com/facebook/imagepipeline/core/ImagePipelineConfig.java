package com.facebook.imagepipeline.core;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import com.facebook.cache.common.CacheKey;
import com.facebook.cache.disk.DiskCacheConfig;
import com.facebook.callercontext.CallerContextVerifier;
import com.facebook.common.executors.SerialExecutorService;
import com.facebook.common.internal.Supplier;
import com.facebook.common.internal.Suppliers;
import com.facebook.common.memory.MemoryTrimmableRegistry;
import com.facebook.common.memory.NoOpMemoryTrimmableRegistry;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.webp.BitmapCreator;
import com.facebook.common.webp.WebpBitmapFactory;
import com.facebook.common.webp.WebpSupportStatus;
import com.facebook.imagepipeline.bitmaps.HoneycombBitmapCreator;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.cache.BitmapMemoryCacheFactory;
import com.facebook.imagepipeline.cache.BitmapMemoryCacheTrimStrategy;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.cache.CountingLruBitmapMemoryCacheFactory;
import com.facebook.imagepipeline.cache.CountingMemoryCache;
import com.facebook.imagepipeline.cache.DefaultBitmapMemoryCacheParamsSupplier;
import com.facebook.imagepipeline.cache.DefaultCacheKeyFactory;
import com.facebook.imagepipeline.cache.DefaultEncodedMemoryCacheParamsSupplier;
import com.facebook.imagepipeline.cache.ImageCacheStatsTracker;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.imagepipeline.cache.MemoryCacheParams;
import com.facebook.imagepipeline.cache.NativeMemoryCacheTrimStrategy;
import com.facebook.imagepipeline.cache.NoOpImageCacheStatsTracker;
import com.facebook.imagepipeline.core.ImagePipelineExperiments;
import com.facebook.imagepipeline.debug.CloseableReferenceLeakTracker;
import com.facebook.imagepipeline.debug.NoOpCloseableReferenceLeakTracker;
import com.facebook.imagepipeline.decoder.ImageDecoder;
import com.facebook.imagepipeline.decoder.ImageDecoderConfig;
import com.facebook.imagepipeline.decoder.ProgressiveJpegConfig;
import com.facebook.imagepipeline.decoder.SimpleProgressiveJpegConfig;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.listener.RequestListener;
import com.facebook.imagepipeline.listener.RequestListener2;
import com.facebook.imagepipeline.memory.PoolConfig;
import com.facebook.imagepipeline.memory.PoolFactory;
import com.facebook.imagepipeline.producers.CustomProducerSequenceFactory;
import com.facebook.imagepipeline.producers.HttpUrlConnectionNetworkFetcher;
import com.facebook.imagepipeline.producers.NetworkFetcher;
import com.facebook.imagepipeline.systrace.FrescoSystrace;
import com.facebook.imagepipeline.transcoder.ImageTranscoderFactory;
import cz.msebera.android.httpclient.HttpStatus;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1633zX;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message end-group tag did not match expected tag.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidEndTag(InvalidProtocolBufferException.java:94)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.checkLastTagWas(CodedInputStream.java:180)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:194)
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яħ\u0015D57\u001eq\u007fZDkŞ\fA\u001c0\u0013.H~*,(w\u000ff\u000198D{H6RY+\u0017k\u00124,[*rK;k\u001a\u0006\"\u000fPVg}nRZ\u0011D\u0017\u0006,xr,_U\u0001]\u0018\u0010:B\u0006?;Mu>A`\u000b6\r 8#@y\u001b\u0001\"*N\u0011~zYK\u0014\u00126Ax:h\rU\u0005 \u0013\u000e>.!&\\}N>Hr^B/9\u0003qBT(g0\u000bo\u0015Fb3\u0015vw\u001e3@=6\u001d%a\f\u000fRa?\u000b?\b=\rh-+3I\nW>X\u0006\u0015\u001d+e\rer,]\rQv\f/+UdSP$(\u007fz\u0002\u000eD\u0004\u001c\f/Ξ6-0f\u0010\u000e9uzSVP\n^H\u0001\u0003aL\u0017-\u007f9,A\u001b|Qi;\u001f`?{\u001b\r&#\u0007o)[j\u000eh\u0015!U\u007fQGQH=NO\u0012YSm\fph\u00032\u0004FG\b/\u0002\u00126\u0017;7c9)!s\u0002^Dov\u000be~ׅ\bʇGp\"\u001d\u0015o.·\u000bʈCߺ\u0004,]ZX<\u0015[\u001cl\u0007,\t˙$\\\u0006>qE\u001eQgvyl]]8*?hGY\u001dq$Vgb\ņSӒ\u0014gZΘ,ABi\u0013`7Ta\u0015r\\V,\tʢlݻ{\u0002L\u0088$\u00158J\u007f(\u0005F?&t\u001dX\u0005.Bo\u0002\u001f^\tvfюVտ(\tq˅\r\u000b\u0007_j\u0001@y\u0007ZD|\u000f4\u0004ۢSڤ\u001d,]Ȩ\u00016\u00036\u0015\u0013D\u0018U|dM\\n&u\u0004\u0013N,p߰SȠA\u0019\u0017ȯA4\bESeCw_g*')\u0018Pӏ=ÿ2m\u0010ξ\t.f\u0007Xl%)0\u0015vrQ';ї{ӶJ\u0001Oϊl\ra^W\u0014SmJpP~\u001b\u001eLHWȒ$Ŀ93Kگ5\u0018}8=:2ow\u0016Fy\u00116|܀gנ0i\u001e˱zScZIa\u001ak\rh:$\u001b.\u0019\u05ecl͎\fH\u0011ͩ%5Nmr\u001e'P[9G\u0004v\t<\r\u001f\u0007\nii̡\u007fӑ2e2ϒ[\u007f\u001a\u0010QWa_a\u001b\u0006my\u0011a;\u0011ϻ\u000f\u00029ޫ*\u001eCUd\u000e3)>=\f&FCKb3u\u0019&D,jB!B\u0003\"\\آ|ķJe\u0017ğJDyvdJ%\u0011j\u0014`\u000bpGp!X?-%\nͿz\u00985\u000buۮl1iq\u000flm))+g\rv';D\u0003>+*h\u00019\u0007sBw\u0006\r\u07fbIԆqqwȯP\u001a\u0003_P kQ_Tw|@`\u001bU\u0013e\u0013\rh\u05fdTƬ&/\u0007ғ\u0015\u0010BN\u001d$ia\u00015z-ziN̖Eױ\u0005\u001dL͈\u001f\u000e\u0003*T8}\u001aCtUK\u0001\u0013UD.Į=֞\f&(ٴ\u001cv'&eX7\u001ckfR\u0016 b9ֆ\u000b\u07b3T&\f˸bvxW<V\u0007a\u0010\u0003\u001a\u0013\r*Bփ#͛+1tݩZMnJ\u00186=u|)#\u0003\u0015\u0006-ӊp\u0094T#\u0011ްe0\u0019.h\u0011a_.0)\u007fBm|̂8ʭf)\u0018˖4z~Eg[;\u0006\u0006\u058b,Հ56Zʴ\u0016!\u007fQ\u0012\u0007%<#\u0019nOTc7;CܗYеbp0˯\r\u000e/s\u000b_\u0019r\u001ftLH\t\u001d\u0013\u0012\u000eض!˝\u0011MhԂ\u001cGO\n/\u0016#S)\u001dJ\r\u0006'%wỴd߰\u00040Jռ\u000b\u0002m\u0014;/%[(\u0011q&\u0004c1~\u0002\u001a\u000fܙ\nЗ\u0015\u001c\u0019/h'0@b\u0005*'i5G\u0006\u001fneJ\u0014_\u001f\u0019c)(Ʊ'ݜ\u0005\u0003\t\u008dW{7[Hd\b\u000b1!'u+Yv;Ss\u0014b}ڛ\u0004ʩN\u0005Uޏn\u0011g\u001eWN\u00160\bHX\u007f8]zڥ\bÑ'\u0006Mʹ`,eONGDi\u0012\u001aB6\u001d~yذnՐw\u00104ʖ0ujPo*\u0012\u0015\"\u0010\\>X\u0006#[\u001cޗjނ\u000fP\u0015ҵ$9\u0015}7\u001f/~\u0016H\u007f:{[\u0001HG\\\f8iť\u0006΄6g>̖_B_'\u0014+bnqÆi\u0006Vo\u0010>\u0013;ű\u0003NٱTϵ\u0004h%ȁ?O|˲5jܒL\u0012z\u0019ٿ\u000e<aDA:Ƌ\u0005lǱJǩ\u0006\u0006R߷-\u00179ˁrOگ\u0011'\u0012/͡\u0010s&4ɁfA߆A߂u`EغK\u000fsԽWCǂ[Uk/ʌcC\u0016.ӻ*\u0005ܯXð\u001e2`ƙ&Ijй\u000fRѝCx\t>ߡ/h\u0006jFm\u0002J؍<\u0004D<ܖ4Ĳ;blɯC:]֬QcU}\u0014\u0010Ћ\u000fY #\u000e.Tg\u07bc\"\"<\bĜ}ţ`P]ޮ\u0006L\u0016Ë`XS\u007f\u001aMĞ@cl\u0005 \u0016ϪYĄ\u0003\u0013(Δ<\t\u0019ڹau\tٔ\u0012ݝ^"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/BYG\u0004?i\u0018.8GFk;\"\u001eh?C\u0010d0PL", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/BYG\u0004?i\u0018.8GFk;\"\u001eh?C\u0010d0PZ0VL[-XPr\u0013", "0tX9W,K", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/BYG\u0004?i\u0018.8GFk;\"\u001eh?C\u0010d0P5\u0004WPU+\\_H", "uKR<`u?O\u0017~wh6\u0003R3m{*{K\u0005\"\u0017Ns\u0017<@#?f}i\u001bu\u00120M.?v4%\u0019qa\u0017\u0011l-Rxe$\\R3[R\u007f\u0013W\u0003", "0hc:T7\u001cO\u0017\u0002zH=|\u0016<i~(", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t!3\\}i\u001fm\u001e8ZW\u0019g2!\u0015>", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0007+c\u0003(E>\u000b\u001f\u001fQxW\u001ar#8Yc KC", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006z-1[}i\u0015t <M?8r4\u0002\u001ddc9\\", "5dc\u000f\\;FO$\\v\\/|r@e\r5\u007f?\u0001", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn3U{#77}.UMH\u007f\u0012\u001a\u0013ka\u000f", "0hc:T7\u001c]\"\u007f~`", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0005\u007fO\t\u0013\"\u0006M\u0018Ew)7/", "5dc\u000f\\;FO$\\\u0005g-\u0001\u000b", "u(;.a+K]\u001d}D`9x\u00142i}6E\u001d\u0005&\u001fCzL\u001a\u0001.6]\u007fu", "0hc:T7&S!\t\br\nx\u00072e_1\u000bM\u0015\u0005&C~\u000e&s35f\u000f D", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t!3\\}i\u0015w&7\\GDm\u001c\u001e\u001drnMd_*Qve'U]9p@\u00029#\u0012D\u000b\\+\u001a\u0016YNy", "5dc\u000f\\;FO$fzf6\n\u001d\ra}+{ \n&$[]\u001d8\u0006%\u001fV\f D~\u0016;", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn3U{#77s8]LJo= |hiC\u0014w\nJt*G\u000b.5k_\u0007+#\u000ei\u000e8(\u001b\u0005fR${\u001a", "0hc:T7&S!\t\br\nx\u00072e`$yO\u000b$+", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t!3\\}i\u0014q%6IN#k<(\"|?5\u0005f,/r%VV[@2", "5dc\u000f\\;FO$fzf6\n\u001d\ra}+{!|\u0015&Q|\"", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn3U{#77r2\\K7v\u001c\u001e\u001drnMd_*Qv\bCJ]6ifH", "0hc:T7&S!\t\br\nx\u00072ej$\t<\t%\u0005Wz\u0019Cz%B", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\u0005 &G|\u00178}n#i\t+>q\u0016;#", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t!3\\}i\u001fm\u001e8ZW\u0019g2!\u0015S]F\u0003k:$", "5dc\u000f\\;FO$fzf6\n\u001d\ra}+{+|$\u0013O}{L\u00020<]}-", "u(;0b4\bT\u0015|z[6\u0007\u000fxc\n0\u0004J\n`\u001bP~\u000eI\u007f!<#k0Bx\u001d2MP\u0011", "0hc:T7&S!\t\br\nx\u00072en5\u007fHn&$C~\u000e>\u000b", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t!3\\}i\u001fm\u001e8ZW\u0019g2!\u0015'?5\u0005f,=\u0004+O:]9Xar?(g", "5dc\u000f\\;FO$fzf6\n\u001d\ra}+{/\u000e\u001b\u001f5~\u001b8\u0006%7m", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn3U{#77}.UMH\u007f\u0012\u001a\u0013kawd_*Qv\u0016TPV\u001ak_nL\u0014\u0014nc", "1`R5X\u0012>gyzxm6\n\u001d", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t!3\\}i\u0015i\u00141M);\u007f\u0015\u001a\u0013wkF\u001b9", "5dc\u0010T*AS~~\u000f?(z\u00189r\u0014", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn3U{#77s*KF;Q42ud_H\u0011p@$", "1`[9X9\u001c]\"\u000ezq;m\t<i\u0001,{M", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0007+l\u0007(\t>\u000b &G\u0003\u001d\u0006T!<`}-\u0015w\u001f=MVJ\\4+\u0019ie9\u00149", "5dc\u0010T3ES&\\\u0005g;|\u001c>V\u007f5\u007fA\u0005\u0017$", "u(;0b4\bT\u0015|z[6\u0007\u000fxc{/\u0003@\u000e\u0015!P~\u000eO\u0006n\u0013U\u0005'7zs8VR;~C\u000f\u0015ue:\u000bc9$", "1k^@X(;Z\u0019kz_,\n\t8c\u007f\u000f{<\u0007\u0006$Cm\u0014<\u0004", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006u%2i\u007fi\u0015t <M?8r4\u000b\u0015iaF\u0007l*N]'CR=9XPx=!g", "5dc\u0010_6LS\u0015{\u0002^\u0019|\n/r\u007f1y@g\u0017\u0013M^\u001b8t+5f", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn4Yz097s5WQ;g1%\u0015Ua:\u0007p,Wt'.LJ2K_n;\u001a\u0012gc", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "5dc\u0010b5MS,\u000e", "u(;.a+K]\u001d}D\\6\u0006\u0018/n\u000fqYJ\n&\u0017Z~c", "1tbAb4)`#}\u000b\\,\nv/q\u0010(\u0005>\u0001w\u0013E~\u0018Iz%C", "", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w+SIz>&\u007fuk8\u0017a,[d'S\\N5ZRS9\u0012!d\u001bb\u0001", "5dc\u0010h:M]!i\bh+\r\u0007/rm(\bP\u0001 \u0015GP\n:\u0006/B]}.", "u(;7T=:\u001d)\u000e~euj\t>;", "2nf;f(F^ ~bh+|", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/BYG~A\u007f\u001f<IKFr4\u0006\u001fga\u000f", "5dc\u0011b>Ga\u0015\u0007\u0006e,d\u0013.e", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn3c\u000b \u0001L @VQ7s?%\u0015Pk8\u00079", "2x].`0<2\u001d\r\u0001<(z\f/C\n1|D\u0003~\u0013R", "", "", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0007+c\u0003(E?\u0005%\u001d\u0011N\u0012J|\u00031W\u0001 \u0015w\u001f/QE\u0011", "5dc\u0011l5:[\u001d|Yb:\u0003f+c\u0003(YJ\n\u0018\u001bIW\nG", "u(;7T=:\u001d)\u000e~eud\u0005:;", "3mP/_,\u001e\\\u0017\ty^+`\u0011+g\u007f\u0006\u0006G\u000b$\u0005Rk\f<f31[}", "", "5dc\u0012a(;Z\u0019^\u0004\\6{\t.I\b$}@^!\u001eQ|{Gr#5I\f\u001c9m", "3mR<W,=;\u0019\u0007\u0005k@Z\u0005-h\u007f\u0012\r@\u000e$\u001bFo", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\t\u0017\u001fQ|\"\u0006a/?`}\u001f\u0014\u0002%.*S<l4+j", "5dc\u0012a*HR\u0019}b^4\u0007\u0016CC{&~@j(\u0017T|\u0012;v", "3mR<W,=;\u0019\u0007\u0005k@Z\u0005-h\u007f\u0013wM|\u001f%5\u007f\u0019G})5f", "5dc\u0012a*HR\u0019}b^4\u0007\u0016CC{&~@k\u0013$Cw\u001c*\u00070@`\u0002 D", "3mR<W,=;\u0019\u0007\u0005k@Z\u0005-h\u007f\u0017\tD\t\u0005&Tk\u001d<x9", "5dc\u0012a*HR\u0019}b^4\u0007\u0016CC{&~@o$\u001bO]\u001dIr45[\u0012", "3wT0h;H`\u0007~\bo0z\t\u0010o\r\u0004\u0005D\t\u0013&GnqDr'5g", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\u0001*\u0017E\u007f\u001dF\u00043~G}-;i\u001d\u000e`C9{C(\"VaF\u0018g*NL", "5dc\u0012k,<c(\t\bL,\n\u001a3c\u007f\t\u0006M\\ \u001bOk\u001d<u\t=U\u007f E", "u(;0b4\bT\u0015|z[6\u0007\u000fxc\n0\u0004J\n`\u0017Zo\fL\u0006/BgG\u000e7z\u001a*T#Nk2.$rn'\u0007p=Rt'\u001d", "3wT0h;H`\u0007\u000f\u0006i3\u0001\t<", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/BYG\u007fJm\u0014>\\MHYD) oe9\u00149", "5dc\u0012k,<c(\t\bL<\b\u00146i\u007f5", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn3c\u000b \u0001M).KSJuA\f%sl@\u000bc9$", "3w_2e0FS\"\u000e\t", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/BYG\u0004?i\u0018.8GFk;\"\u001ehAL\u0012c9R~'P[\\\u0002", "5dc\u0012k7>`\u001d\u0007zg;\u000b", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn3c\u000b \u0001Q\u001e*OC&o?\u001e\u001clj9fv7N\u0004+OLW;j(", "4h[26(<V\u0019_v\\;\u0007\u0016C", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/BYG\u0001;t\u0016\fIA>k\u0015\u001a\u0013wkF\u001b9", "5dc\u0013\\3>1\u0015|}^\rx\u0007>o\r<", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn3c\u000b \u0001N\u001a5M!7i7\u001eud_H\u0011p@$", "6sc=A,Me#\f\u0001M0\u0005\t9u\u000f", "", "7lP4X\n:Q\u001c~hm(\f\u0017\u001er{&\u0002@\u000e", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t!3\\}i\u001bu\u00120M!7i7\u001e\u0003w]H\u0015R9Jt-GY$", "5dc\u0016`(@Svzxa,j\u0018+t\u000e\u0017\t<~\u001d\u0017T", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn3U{#77y6IE;I0\u001c\u0018hOH\u0003r:=\u0004#ERN92", "7lP4X\u000b>Q#}zk", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006u%3c| D7y6IE;J4\u001c\u001fgaF\\", "5dc\u0016`(@Sw~xh+|\u0016", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn4Y{*6m#w1K7m4|\u0015fk8\u0007p\u0002", "7lP4X\u000b>Q#}zk\n\u0007\u00120i\u0002", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006u%3c| D7y6IE;J4\u001c\u001fgaFdm5Oz)\u001d", "5dc\u0016`(@Sw~xh+|\u0016\ro\t)\u007fB", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn4Y{*6m#w1K7m4|\u0015fk8\u0007p\nX\u007f(KN$", "7lP4X\u001bKO\"\rxh+|\u0016\u0010a}7\u0006M\u0015", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u000621b\f\u001eAl\u0016;\u0017'Cg6\u001e\u0004u]B\u0015a6Mv4(HL;f_\u0007\u0013", "5dc\u0016`(@S\b\fvg:z\u0013.e\r\tw>\u0010!$[", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012EvnDfy)Ek -MP\u0005O<\u001a\u0017hPF\u0003l:L\u0001&GY/(Za|J(g", "7lP4X\u001bKO\"\rxh+|\u0016\u001ey\u000b(", "5dc\u0016`(@S\b\fvg:z\u0013.e\r\u0017\u0010K\u0001U\u0013Px\u0018Kr49c\u0007.", "u(E", "5dc\u0016`(@S\b\fvg:z\u0013.e\r\u0017\u0010K\u0001", "u(;7T=:\u001d z\u0004`u`\u0012>e\u0002(\t\u0016", "\u001aiPCTuEO\"\u0001DB5\f\t1e\r}", "7r36f2\u001cO\u0017\u0002z>5x\u00066e~", "u(I", "7r??X->b\u0017\u0002Zg(y\u0010/dm8\u0007K\b\u001b\u0017T", "7rA2f0SSt\byK6\f\u0005>e_1w=\b\u0017\u0016(y\u001b%v4Gc\u000b&", ";`X;70LYvzxa,Z\u00138f\u0004*", "5dc\u001aT0G2\u001d\r\u0001<(z\f/C\n1|D\u0003", "u(;0b4\bT\u0015|z[6\u0007\u000fxc{&~@J\u0016\u001bUuW\u001bz3;7y\u001e:ms8VD?m\n", ";d\\<e@\u001cV)\b\u0001M@\b\t", "5dc\u001aX4H`-\\}n5\u0003wCp\u007ffwI\n!&C~\u0012F\u007f3", "5dc\u001aX4H`-\\}n5\u0003wCp\u007f", "u(8", ";d\\<e@-`\u001d\u0007\u0003Z)\u0004\t\u001ce\u0002,\nO\u000e+", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\t\u0017\u001fQ|\"\u0006^%=c\u000b4&z\u001a6U?8r4\u000b\u0015jeG\u0016p@$", "5dc\u001aX4H`-m\bb4\u0005\u0005,l\u007f\u0015{B\u0005%&T\u0004", "u(;0b4\bT\u0015|z[6\u0007\u000fxc\n0\u0004J\n`\u001fGw\u0018I\u000bn\u001dY\u0006*D\u0002\u0005;QKCg1%\u0015Ua;\u000bq;[\u000b|", "<dcDb9D4\u0019\u000exa,\n", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w6CJ}>+\u001bIaH\u0005f,[L", "5dc\u001bX;P]&\u0005[^;z\f/r", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn@f\b\u001fGk\u0016;[\r$kC0\u001fug\u001a\u0007r*Qv4\u001d", ">kPAY6K[u\u0003\nf(\bi+c\u000f2\tT", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006s)Day+E7\u00015IR<uA&qlpA\u0003n\rJt6QYb\u0002", "5dc\u001d_(MT#\f\u0003;0\f\u0011+p`$yO\u000b$+", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn2]\r(3x$w8J7z5(\"p>=\u0016k(YW#E[X9p(", ">n^99(<b#\f\u000f", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006~%=c\u000b4\u0001X 8T$7iC(\"|7", "5dc\u001db6E4\u0015|\nh9\u0011", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn=Y\u0006*D\u0002_\u0019WMBL0\u001c$rnM\\", ">q^4e,La\u001d\u0010zC7|\u000b\ro\t)\u007fB", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006u%3c| D7\u0001;WEHkB,\u0019ya\u001e\u0012c.,\u00010HPP\u0002", "5dc\u001de6@`\u0019\r\tb=|m:e\u0002\u0006\u0006I\u0002\u001b\u0019", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn4Y{*6m#w8PEmA\u001e#veJ\u0007H7Nx\u0005QUO0^(", "@d`BX:M:\u001d\r\n^5|\u0016{s", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006})Ch})7z_\u001bMOKkB-{loH\u0007l,[C|", "5dc\u001fX8NS'\u000eab:\f\t8e\rt\n", "@d`BX:M:\u001d\r\n^5|\u0016=", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006})Ch})7z_\u001bMOKkB-{loH\u0007l,[L", "5dc\u001fX8NS'\u000eab:\f\t8e\r6", "AlP9_\u0010FO\u001b~Yb:\u0003f+c\u0003(YJ\n\u0018\u001bI", "5dc `(EZ|\u0007v`,[\r=k]$yC\u0001t!Pp\u0012>", "\u0010tX9W,K", "\u0011n\\=T5B]\"", "\u0012dU.h3M7!z|^\u0019|\u0015?e\u000e7YJ\n\u0018\u001bI", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ImagePipelineConfig implements ImagePipelineConfigInterface {
    public static final Companion Companion = new Companion(null);
    private static DefaultImageRequestConfig defaultImageRequestConfig = new DefaultImageRequestConfig();
    private final MemoryCache<CacheKey, CloseableImage> bitmapCacheOverride;
    private final Bitmap.Config bitmapConfig;
    private final CountingMemoryCache.EntryStateObserver<CacheKey> bitmapMemoryCacheEntryStateObserver;
    private final BitmapMemoryCacheFactory bitmapMemoryCacheFactory;
    private final Supplier<MemoryCacheParams> bitmapMemoryCacheParamsSupplier;
    private final MemoryCache.CacheTrimStrategy bitmapMemoryCacheTrimStrategy;
    private final CacheKeyFactory cacheKeyFactory;
    private final CallerContextVerifier callerContextVerifier;
    private final CloseableReferenceLeakTracker closeableReferenceLeakTracker;
    private final Context context;
    private final Set<CustomProducerSequenceFactory> customProducerSequenceFactories;
    private final DownsampleMode downsampleMode;
    private final Map<String, DiskCacheConfig> dynamicDiskCacheConfigMap;
    private final Supplier<Boolean> enableEncodedImageColorSpaceUsage;
    private final MemoryCache<CacheKey, PooledByteBuffer> encodedMemoryCacheOverride;
    private final Supplier<MemoryCacheParams> encodedMemoryCacheParamsSupplier;
    private final MemoryCache.CacheTrimStrategy encodedMemoryCacheTrimStrategy;
    private final SerialExecutorService executorServiceForAnimatedImages;
    private final ExecutorSupplier executorSupplier;
    private final ImagePipelineExperiments experiments;
    private final FileCacheFactory fileCacheFactory;
    private final int httpNetworkTimeout;
    private final ImageCacheStatsTracker imageCacheStatsTracker;
    private final ImageDecoder imageDecoder;
    private final ImageDecoderConfig imageDecoderConfig;
    private final ImageTranscoderFactory imageTranscoderFactory;
    private final Integer imageTranscoderType;
    private final boolean isDiskCacheEnabled;
    private final Supplier<Boolean> isPrefetchEnabledSupplier;
    private final boolean isResizeAndRotateEnabledForNetwork;
    private final DiskCacheConfig mainDiskCacheConfig;
    private final int memoryChunkType;
    private final MemoryTrimmableRegistry memoryTrimmableRegistry;
    private final NetworkFetcher<?> networkFetcher;
    private final PlatformBitmapFactory platformBitmapFactory;
    private final PoolFactory poolFactory;
    private final ProgressiveJpegConfig progressiveJpegConfig;
    private final Set<RequestListener2> requestListener2s;
    private final Set<RequestListener> requestListeners;
    private final DiskCacheConfig smallImageDiskCacheConfig;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Яĩ\u0015D57\u001eq\u007fR܀kŞ\fA\u001c0\u0013.H~*,(w\u000ffp:8D{H6Ri*\u0017k\u00124,[*rK;k\u001a\u0006\"\u000fPVg}nRZ\u0011D\u0017\u0006,xr,_U\u0001]\u0018\u0010:B\u0006?;Mu>A`\u000b6\r 8#@y\u001b\u0001\"*N\u0011~zYK\u0014\u00126Cx:`-U\u00050\u0012\u000e>&\u0002&\\uW>Hr^B/9\u0003qBT(g0\u000bo\u0015Fb3\u0015vw\u001e3@=8\u001d%i\u0003\u000fRaC\u000b?\b=\rh-)3I\nW>X\u0006\u0014\u001d+e\rer,]\rQn\u0012/+UdSP$(\u007fz\u0002\u000eD\u0004$\u0006/H4.\"f\u001e\u000e;txTHP\u0018^J\u007f\u0001r>\u0017;\u007f;+?\u001cnQw;!N=|\r\r4#\tn'\\\\\u000ev\u0015#T}R9QV=PN\u0010ZEm\u001apj\u00020\u00048G\u0016/\u0004\u00114\u0019-7q9+!q\u0006PD}v\r`n\u007f\u007fɭx@PmVB:\r\u001aZ\\d3lÏXX:\u0013\u0016\"bΓ| \u0014NϞv\u0005&3ŋMgh\u00189\u0016b\u0018ɹ.~7\b!4\u0013eߌ]K5\u007f\u0016X|`λ\u0013W<\u0011ڳ\txP^$hl*22vs y\fD|\u0016)1mydI:֟\u0018t\u0015vґNNO\f!gjj ~\u0003<:\u0002\u00182=\u0018\u000f˫[\to\u0016ծy2\u000bs:/WPc+nj0ס3\u0015#5Ѩ$\fU\u007fdO\\n&u\u0004\u00136\u0015HO\u001a?Kц\u000e\u0017)`Ĉ]LZȑdiO(&)\u0018B\u001fIą-\u007f\b\u0019ѱ\\gxߤNl\u00198u\rvk\u0017rѫxyF)ò\u0014Z\u0019{VK\t\u0002\b[\u0017G\u000bĪ\u001e6%/ǻR\u0003CQ[)3\u0015&7w\"oԍh\b.(ʬ?*\u0003\u000e\u001c,\u0012=8w_Џ1S8wʲ/J0S\u0005\u000bRJzw6p\u001f3;`\u0011NrޔUPM9ɀ.j\u0015_%p\u0005\u000e\u0003#}Ј3F_Xϒs\u0003\"ڜB=\u0011{\u0006.r6XjחI'\n9֊ar SU \u0005\u000e+\">Ӣr06oݥ\u0013\u0015JF<@<>\u0018\u000bq\u0010y\b z.\u0003\u000eI_GPǱ:n\u000e\u0003ۿ\rbVExMp#:\u0001-AI\u001d'Ky {ܣSGc`ܬ\u0004/\u0017^\u0003]\u000fh5+r]I\u001d8X/M[\\qQJK\u0012ۑ(\u0006k\u001eȯh$\u000bbZ +;a\u0011\u000e\u000eF]9k-^rʱ\u0011~R|ÝY\u0006\tլ\rT\f%\nGj;\u0001pϚKfweƑJ\t%ئ(\u001f\u000f\u0013btɩ,ND;\u05cbH\u0003\u0014Uس\bYIH \"6&2>ike˥e\"]IŭFw$5\u001a\u000b)ONUvX\u0003Ӗ\tF\bdО28\u0010տ]qk&v\t69̈\u0005ZK\u0017Ǎ:iz>\u0007W!\u0002\u0015\u000b\u001f\t|°O5\tUӍ^\u0019f9R\u0013i\u001f\u0007nH##ӱ\u001eN\b\u0011Ϫ@UqK\tmeZ;\rwz8՞0HRLݙO\u007f\u0004jBV>\u0014i<\u0016JrwtlpĠ>bx\u0012|t:~\\\u0012\rŞ])\u0013bИ#*r!O!/]\u001dG\u000f9\u001aDw<i@`͋\u001aO29 X|\u001fuRd\u000b~X~Q~\u000e`D-t§m\u001e5O<m\u0013XnZSѳA ,?ÀA5h38@r\u0019J5\u001aGO̗\u0010\u0019\u0015fۍ \u0012'ƻiiY5*\u0007}\u0017\fmwy|Hޯ6\u000b#]ݩ #eƥ:=8{KUڈ\u0001.[\r߾bn\u000f\u0010βy=SɓxmC\u0016\tM\u0082#N\u00071ȏDIHXأ\rHdبV\u001c)@5\u001dޛ\"\u0010\u0004\u0007ގ\tDiFĵ\u0015iož@\u0013\u001d)GN+[ü\u0006[L\u0017'S[\u001bӿ\u0013O\u000f4ӽc%\u000bӬN\nI;L\u0003N]۪\\R\u0012\"1\u0003@oחx_@\bآ62 ˽b\u0003j\u001c\u0004( Fނ\f%\u0004&ٚ\u0003g\u000eџ\u001c0)autr-\u0019[Fz\rV\u000eRb^H\u001a\u000e\u001e\u0018DGE\u0006<\u000b7ŏ\u001fчKyIڧ*X\u0002'+\u0018,]\u00140\u007fxWAeq\u0007FI5\u001bmxbKd\u000b\r\u00063YgC#\u0010l;.u_N\u001c:X4\u0018[cv\u0018\u00039\u001bٱyԊ46XڄrEc\r*,\u000e\u0002#t\u0017:r9kd?4MV\u001d`\u0006/;{\u001a\u000b C)\u00139'i8`12M\bČ\bţ`O]ޮ\u0006K\u0016\u0013o[qO\u0014RGCak\u0005wo\u001feB\u0017\u000e6&R\u0018Qd9ԁ\u001fَ\u0012(g̜d8\\=V`*=tZ\u0003\u0017\u000bv\u001c.:Ok\u0005k\u001cAn*8SgP.>p7^ei*@$0=ڕeǕI1}ռV3w*qi04|mtZT\u0016\u0006Ap\u0019\u0010\u001d5(wzvDnW,ۇyحwZhײq6qMr\u0018C\u0007r^{@RG\u001b8\u0017U\f\u001eiFx\b\u000f\u0010\u0007\u0002fاxՑ+<PУ1\u0003\u0007lo9dWR\u001b;iI9P\u0005RYk(_L\u001c\r\u0019\u00056UR֥?Ύ\u0011u4̗-\u0007D\f\u0001*=![X\u001ck]Yv^N\u001fEZU\u0015'H\u0001Ċ\u0018Ё\t2vևjS{H\u0001\u000fO2,\u001aYWgH̹\u0017\t!ڽ 4S\u0004\t\u001b)\t3]\u0014\u000e/\u0014R{c\u001bWr*`\b}]7u&9\u007fywN;\u0002\u00112\u0011\tc&ىnˆa4Uǿ\u001f[B\nO3Z>7W \u0015U4x8X5:#/AtX!էzޓ)\u000fm\u05c8Gv{B@#\u000f\u0010t\u0015\u007f4os\u0006a\rHE/ >\n\nDȡ7Ú\u0012O\u001eΚgNs.iv%N@D\b\u0012A\u0012\u0004`\n}'y\u0018bb(Pzu=D|Y12hvp|v~\u001d ?&\rBATrW]~e6ηsճ?\u000fxƸOSK#\u0019\u0004aTnrV\u001a\u001fJhf<M\u0018\u0004yzJ\"GH\u0011H[\u0017k\u0004\u0016\u0016g!\u0016^*h\u0006އ\u0004\u0602:#\b߿Q\u000fy\u0012lO8\u0017\u0017\u0019;\u001c7p_\b 9BImZNqq\u0007<R\u0017^^\u0010Y\u0015|0\u0007v! O\u0017\u0012*sd3B\u0014!&E\rɚG̈lYl҃6pa 5=N2/XY'&\u00104\b.\fq3}\f1LV\u0016$\"S0\u0018\u00143|b\u0004c \u007fq\u0016ؕ|ǂ/}gȆZ\u0007\u0013k/B[86)\u0005\u0015\u0006\u0014V=s\u0019\u0005\u001e\u0006\u000b&\u001bw@Gm(Ȓ\u0007\u03816\u0016(ږ(A\u0010[p|H /\u0014H2\n\b{\u0016\u001e\u0004<m\bl\u000e]>\u00190|4̺\u0004ĔI.\u0018ʟj=\u001a.j\u0011wj6\u0012/\u000eLm\u06dd(8\u0014əH\u001db8\f@Grpdx6\u00054\u0007\u0012e11\u0004>\u0003\u0017\bQ/iT\u0015Ϥaܪh\u0015nʣhE\u00182\u0003\u0013:\u0019\u0016\b5\u00044!\u00166*<ayOAr\u0001xũnǠ(k\u0014̗dR3qD8\rBG\u00173uF}Ejpp\u0003\u0007GH'q7Jor Ɲhφ0d1շ\u0004{5,`\u001e\u001e\u000f=x/(N`e\u0001{k0\u001f]iSHSrK_Aǋ\u0001\u05ca!;y߽v,Ea\u0014\u0005db\r\u0019\tE\u0001=$}d\u001a\u0003%zkJ-pD\u000ejlؚqį+]yõ+c:aH2j\"l0\u001f\u000f<\"[pK0\u0011O\\SIk\u0012-\u001473ȯ\u001b\u07b4AoOͬdw\u0001e*\u001bBb\u0006\\ymLD.m\u007fܢUД6\u0016\u0014PZ`\r2O|ZvZ\u0014\u0019\u001fN\f \u001d\\UW$\u0019\"j(\u0005eT+\u000e\u000e\u0015h\u0004=:cub<\tN%ol\u000fs%\t|\u0012m-PVS҉Hހi\u000bmö;,LqaM2\u001ceF\u0003\u0011^\u0016`!dH\"\"# @SNGI\u0010>ן*ˇP~N֖]c\u000b\"0\u000f3J\u001b$\tqf9\u0007V4ٴEѽ!\b\\`Gbpx]\u001e^TO\u0018\u0011i@1lad\u001a;O[3X\u0018k\u0015i\u0001\u007f'\u0003AEJq\nmE\u001b\u0002l_\u001c\u0083+ˁ\t>v͡cl\u001c#MTH\u0007n\u009a?\u001c\t8\u0015J!<\u0011U\u000bnG,y,<7\u0005\u0011Xfc0p\tZkܰ\\в;\u001aMݿ[YfápIļ]\u001b1\u001fΑ%G\f0(\u0016;%%\u001c|g$TO\\^صO!J@̓yˠ~\u0005$Ր.&_ȏ@$ԅgq^UλHK8\u001a\r~̪n/8fw\u0004pxWBΧ\u0002\\\u0004\u0011\u07b9\u0014̢\\l!èprh֖*m͇Ei50߃)~zf(gǈa\u0019\b\u0004uqh,]Uń6\u001c?VܗsԼjOMڒ}${،y*ÁS=?xݹS]EtyR-p\u038bu6\u000b:}\u0017E-=c\u00038o8FWȡ$rax{\u0010Qgŕf٢(\u0006hɜV yϗ\u0006)D\u0013G\tͤp%bH\u0010\u00057sэXw `\u000fj\u0002y\u0004K$#\u0007$0BؚZ~{X#(L\u0003Ќ0ӼoHWԟ9\u0014)×\u000bEz1\u0019\bۨ`BC57V\u001bU\u0004bsv!?\u00017ͻbŘL.6Հ\u000b\n)үk(I<u;ȋt~ {72\u0097\u0012\u000eKpO%\u0014=)[ߢ\u001b\tI$˻_À5.\u0014ҳS!Yիp\u0012а\rC3@Ѕ~68\fE\u00101\u0014}JHZ_\u007f\n|rrFeρ`Χ\b7\u0004ӵd\u0014IͱP\u0003yуHץ\u001e"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/BYG\u0004?i\u0018.8GFk;\"\u001eh?C\u0010d0P5\u0004WPU+\\_H", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ-", "\nrTA \u0006\u0017", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0005\u007fO\t\u0013\"\u0006M\u0018Ew)7/", "0hc:T7\u001c]\"\u007f~`", "5dc\u000f\\;FO$\\\u0005g-\u0001\u000b", "u(;.a+K]\u001d}D`9x\u00142i}6E\u001d\u0005&\u001fCzL\u001a\u0001.6]\u007fu", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t!3\\}i\u001fm\u001e8ZW\u0019g2!\u0015>", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0007+c\u0003(E>\u000b\u001f\u001fQxW\u001ar#8Yc KC", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006z-1[}i\u0015t <M?8r4\u0002\u001ddc9\\", "0hc:T7&S!\t\br\nx\u00072e", "5dc\u000f\\;FO$fzf6\n\u001d\ra}+{", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn3U{#77}.UMH\u007f\u0012\u001a\u0013ka\u000f", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t!3\\}i\u0015w&7\\GDm\u001c\u001e\u001drnMd_*Qve'U]9p@\u00029#\u0012D\u000b\\+\u001a\u0016YNy", "0hc:T7&S!\t\br\nx\u00072e_1\u000bM\u0015\u0005&C~\u000e&s35f\u000f D", "5dc\u000f\\;FO$fzf6\n\u001d\ra}+{ \n&$[]\u001d8\u0006%\u001fV\f D~\u0016;", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn3U{#77s8]LJo= |hiC\u0014w\nJt*G\u000b.5k_\u0007+#\u000ei\u000e8(\u001b\u0005fR${\u001a", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t!3\\}i\u0014q%6IN#k<(\"|?5\u0005f,/r%VV[@2", "0hc:T7&S!\t\br\nx\u00072e`$yO\u000b$+", "5dc\u000f\\;FO$fzf6\n\u001d\ra}+{!|\u0015&Q|\"", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn3U{#77r2\\K7v\u001c\u001e\u001drnMd_*Qv\bCJ]6ifH", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\u0005 &G|\u00178}n#i\t+>q\u0016;#", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t!3\\}i\u001fm\u001e8ZW\u0019g2!\u0015S]F\u0003k:$", "0hc:T7&S!\t\br\nx\u00072ej$\t<\t%\u0005Wz\u0019Cz%B", "5dc\u000f\\;FO$fzf6\n\u001d\ra}+{+|$\u0013O}{L\u00020<]}-", "u(;0b4\bT\u0015|z[6\u0007\u000fxc\n0\u0004J\n`\u001bP~\u000eI\u007f!<#k0Bx\u001d2MP\u0011", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t!3\\}i\u001fm\u001e8ZW\u0019g2!\u0015'?5\u0005f,=\u0004+O:]9Xar?(g", "0hc:T7&S!\t\br\nx\u00072en5\u007fHn&$C~\u000e>\u000b", "5dc\u000f\\;FO$fzf6\n\u001d\ra}+{/\u000e\u001b\u001f5~\u001b8\u0006%7m", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn3U{#77}.UMH\u007f\u0012\u001a\u0013kawd_*Qv\u0016TPV\u001ak_nL\u0014\u0014nc", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t!3\\}i\u0015i\u00141M);\u007f\u0015\u001a\u0013wkF\u001b9", "1`R5X\u0012>gyzxm6\n\u001d", "5dc\u0010T*AS~~\u000f?(z\u00189r\u0014", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn3U{#77s*KF;Q42ud_H\u0011p@$", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0007+l\u0007(\t>\u000b &G\u0003\u001d\u0006T!<`}-\u0015w\u001f=MVJ\\4+\u0019ie9\u00149", "1`[9X9\u001c]\"\u000ezq;m\t<i\u0001,{M", "5dc\u0010T3ES&\\\u0005g;|\u001c>V\u007f5\u007fA\u0005\u0017$", "u(;0b4\bT\u0015|z[6\u0007\u000fxc{/\u0003@\u000e\u0015!P~\u000eO\u0006n\u0013U\u0005'7zs8VR;~C\u000f\u0015ue:\u000bc9$", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006u%2i\u007fi\u0015t <M?8r4\u000b\u0015iaF\u0007l*N]'CR=9XPx=!g", "1k^@X(;Z\u0019kz_,\n\t8c\u007f\u000f{<\u0007\u0006$Cm\u0014<\u0004", "5dc\u0010_6LS\u0015{\u0002^\u0019|\n/r\u007f1y@g\u0017\u0013M^\u001b8t+5f", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn4Yz097s5WQ;g1%\u0015Ua:\u0007p,Wt'.LJ2K_n;\u001a\u0012gc", "5dc\u0010b5MS,\u000e", "u(;.a+K]\u001d}D\\6\u0006\u0018/n\u000fqYJ\n&\u0017Z~c", "", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w+SIz>&\u007fuk8\u0017a,[d'S\\N5ZRS9\u0012!d\u001bb\u0001", "1tbAb4)`#}\u000b\\,\nv/q\u0010(\u0005>\u0001w\u0013E~\u0018Iz%C", "5dc\u0010h:M]!i\bh+\r\u0007/rm(\bP\u0001 \u0015GP\n:\u0006/B]}.", "u(;7T=:\u001d)\u000e~euj\t>;", "", "2hb86(<V\u0019^\u0004Z)\u0004\t.", "5dc\u0011\\:D1\u0015|}^\f\u0006\u0005,l\u007f'", "u(I", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/BYG~A\u007f\u001f<IKFr4\u0006\u001fga\u000f", "2nf;f(F^ ~bh+|", "5dc\u0011b>Ga\u0015\u0007\u0006e,d\u0013.e", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn3c\u000b \u0001L @VQ7s?%\u0015Pk8\u00079", "", "", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0007+c\u0003(E?\u0005%\u001d\u0011N\u0012J|\u00031W\u0001 \u0015w\u001f/QE\u0011", "2x].`0<2\u001d\r\u0001<(z\f/C\n1|D\u0003~\u0013R", "5dc\u0011l5:[\u001d|Yb:\u0003f+c\u0003(YJ\n\u0018\u001bIW\nG", "u(;7T=:\u001d)\u000e~eud\u0005:;", "3mP/_,\u001e\\\u0017\ty^+`\u0011+g\u007f\u0006\u0006G\u000b$\u0005Rk\f<f31[}", "5dc\u0012a(;Z\u0019^\u0004\\6{\t.I\b$}@^!\u001eQ|{Gr#5I\f\u001c9m", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\t\u0017\u001fQ|\"\u0006a/?`}\u001f\u0014\u0002%.*S<l4+j", "3mR<W,=;\u0019\u0007\u0005k@Z\u0005-h\u007f", "5dc\u0012a*HR\u0019}b^4\u0007\u0016CC{&~@", "3mR<W,=;\u0019\u0007\u0005k@Z\u0005-h\u007f\u0013wM|\u001f%5\u007f\u0019G})5f", "5dc\u0012a*HR\u0019}b^4\u0007\u0016CC{&~@k\u0013$Cw\u001c*\u00070@`\u0002 D", "3mR<W,=;\u0019\u0007\u0005k@Z\u0005-h\u007f\u0017\tD\t\u0005&Tk\u001d<x9", "5dc\u0012a*HR\u0019}b^4\u0007\u0016CC{&~@o$\u001bO]\u001dIr45[\u0012", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/BYG\u007fJm\u0014>\\MHYD) oe9\u00149", "3wT0h;H`\u0007\u000f\u0006i3\u0001\t<", "5dc\u0012k,<c(\t\bL<\b\u00146i\u007f5", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn3c\u000b \u0001M).KSJuA\f%sl@\u000bc9$", "3w_2e0FS\"\u000e\t;<\u0001\u0010.e\r", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/BYG\u0004?i\u0018.8GFk;\"\u001ehAL\u0012c9R~'P[\\j9bvD\u0013\u0012gc", "5dc\u0012k7>`\u001d\u0007zg;\u000be?i\u0007'{M", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn3c\u000b \u0001Q\u001e*OC&o?\u001e\u001clj9fv7N\u0004+OLW;j\u0011OM\u0018\u0019Y\u000e[\u0001", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/BYG\u0001;t\u0016\fIA>k\u0015\u001a\u0013wkF\u001b9", "4h[26(<V\u0019_v\\;\u0007\u0016C", "5dc\u0013\\3>1\u0015|}^\rx\u0007>o\r<", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn3c\u000b \u0001N\u001a5M!7i7\u001eud_H\u0011p@$", "", "6sc=66G\\\u0019|\nb6\u0006w3m\u007f2\fO", "5dc\u0015g;I1#\b\u0004^*\f\r9nn,\u0004@\u000b'&", "u(8", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t!3\\}i\u001bu\u00120M!7i7\u001e\u0003w]H\u0015R9Jt-GY$", "7lP4X\n:Q\u001c~hm(\f\u0017\u001er{&\u0002@\u000e", "5dc\u0016`(@Svzxa,j\u0018+t\u000e\u0017\t<~\u001d\u0017T", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn3U{#77y6IE;I0\u001c\u0018hOH\u0003r:=\u0004#ERN92", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006u%3c| D7y6IE;J4\u001c\u001fgaF\\", "7lP4X\u000b>Q#}zk", "5dc\u0016`(@Sw~xh+|\u0016", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn4Y{*6m#w1K7m4|\u0015fk8\u0007p\u0002", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006u%3c| D7y6IE;J4\u001c\u001fgaFdm5Oz)\u001d", "7lP4X\u000b>Q#}zk\n\u0007\u00120i\u0002", "5dc\u0016`(@Sw~xh+|\u0016\ro\t)\u007fB", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn4Y{*6m#w1K7m4|\u0015fk8\u0007p\nX\u007f(KN$", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u000621b\f\u001eAl\u0016;\u0017'Cg6\u001e\u0004u]B\u0015a6Mv4(HL;f_\u0007\u0013", "7lP4X\u001bKO\"\rxh+|\u0016\u0010a}7\u0006M\u0015", "5dc\u0016`(@S\b\fvg:z\u0013.e\r\tw>\u0010!$[", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012EvnDfy)Ek -MP\u0005O<\u001a\u0017hPF\u0003l:L\u0001&GY/(Za|J(g", "7lP4X\u001bKO\"\rxh+|\u0016\u001ey\u000b(", "5dc\u0016`(@S\b\fvg:z\u0013.e\r\u0017\u0010K\u0001U\u0013Px\u0018Kr49c\u0007.", "u(E", "5dc\u0016`(@S\b\fvg:z\u0013.e\r\u0017\u0010K\u0001", "u(;7T=:\u001d z\u0004`u`\u0012>e\u0002(\t\u0016", "Adc\u0016`(@S\b\fvg:z\u0013.e\r\u0017\u0010K\u0001", "uKY.i(\bZ\u0015\b|(\u0010\u0006\u0018/g\u007f5Q\u0004q", "\u001aiPCTuEO\"\u0001DB5\f\t1e\r}", "7r??X->b\u0017\u0002Zg(y\u0010/dm8\u0007K\b\u001b\u0017T", ";`X;70LYvzxa,Z\u00138f\u0004*", "5dc\u001aT0G2\u001d\r\u0001<(z\f/C\n1|D\u0003", "u(;0b4\bT\u0015|z[6\u0007\u000fxc{&~@J\u0016\u001bUuW\u001bz3;7y\u001e:ms8VD?m\n", ";d\\<e@\u001cV)\b\u0001M@\b\t", "5dc\u001aX4H`-\\}n5\u0003wCp\u007ffwI\n!&C~\u0012F\u007f3", "5dc\u001aX4H`-\\}n5\u0003wCp\u007f", "Adc\u001aX4H`-\\}n5\u0003wCp\u007f", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\t\u0017\u001fQ|\"\u0006^%=c\u000b4&z\u001a6U?8r4\u000b\u0015jeG\u0016p@$", ";d\\<e@-`\u001d\u0007\u0003Z)\u0004\t\u001ce\u0002,\nO\u000e+", "5dc\u001aX4H`-m\bb4\u0005\u0005,l\u007f\u0015{B\u0005%&T\u0004", "u(;0b4\bT\u0015|z[6\u0007\u000fxc\n0\u0004J\n`\u001fGw\u0018I\u000bn\u001dY\u0006*D\u0002\u0005;QKCg1%\u0015Ua;\u000bq;[\u000b|", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w6CJ}>+\u001bIaH\u0005f,[L", "<dcDb9D4\u0019\u000exa,\n", "5dc\u001bX;P]&\u0005[^;z\f/r", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn@f\b\u001fGk\u0016;[\r$kC0\u001fug\u001a\u0007r*Qv4\u001d", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006s)Day+E7\u00015IR<uA&qlpA\u0003n\rJt6QYb\u0002", ">kPAY6K[u\u0003\nf(\bi+c\u000f2\tT", "5dc\u001d_(MT#\f\u0003;0\f\u0011+p`$yO\u000b$+", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn2]\r(3x$w8J7z5(\"p>=\u0016k(YW#E[X9p(", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006~%=c\u000b4\u0001X 8T$7iC(\"|7", ">n^99(<b#\f\u000f", "5dc\u001db6E4\u0015|\nh9\u0011", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn=Y\u0006*D\u0002_\u0019WMBL0\u001c$rnM\\", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006u%3c| D7\u0001;WEHkB,\u0019ya\u001e\u0012c.,\u00010HPP\u0002", ">q^4e,La\u001d\u0010zC7|\u000b\ro\t)\u007fB", "5dc\u001de6@`\u0019\r\tb=|m:e\u0002\u0006\u0006I\u0002\u001b\u0019", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn4Y{*6m#w8PEmA\u001e#veJ\u0007H7Nx\u0005QUO0^(", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006})Ch})7z_\u001bMOKkB-{loH\u0007l,[C|", "@d`BX:M:\u001d\r\n^5|\u0016{s", "5dc\u001fX8NS'\u000eab:\f\t8e\rt\n", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006})Ch})7z_\u001bMOKkB-{loH\u0007l,[L", "@d`BX:M:\u001d\r\n^5|\u0016=", "5dc\u001fX8NS'\u000eab:\f\t8e\r6", "@db6m,\u001a\\\u0018k\u0005m(\f\t\u000fn{%\u0003@\u007fw!TX\u000eK\t/B_", "5dc\u001fX:Bh\u0019Z\u0004]\u0019\u0007\u0018+t\u007f\b\u0005<}\u001e\u0017FP\u0018I_%Dk\b-=", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\u0001*\u0017E\u007f\u001dF\u00043~G}-;i\u001d\u000e`C9{C(\"VaF\u0018g*NL", "Ada6T3\u001ef\u0019|\u000bm6\nv/r\u0011,y@a!$#x\u0012Dr45Xa(3o\u0016<", "5dc X9BO ^\u000e^*\r\u00189rm(\tQ\u0005\u0015\u0017(y\u001b\u0018\u007f)=U\r 6Q\u001e*OCI", "u(;0b4\bT\u0015|z[6\u0007\u000fxc\n0\u0004J\n`\u0017Zo\fL\u0006/BgG\u000e7z\u001a*T#Nk2.$rn'\u0007p=Rt'\u001d", "AlP9_\u0010FO\u001b~Yb:\u0003f+c\u0003(YJ\n\u0018\u001bI", "5dc `(EZ|\u0007v`,[\r=k]$yC\u0001t!Pp\u0012>", "0tX9W", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/BYG\u0004?i\u0018.8GFk;\"\u001eh?C\u0010d0PL", "3w_2e0FS\"\u000e", "7r36f2\u001cO\u0017\u0002z>5x\u00066e~", "7r3<j5LO!\n\u0002^\f\u0006\u0005,l\u007f'", "Adc\u000f\\;FO$fzf6\n\u001d\ra}+{", "Adc\u000f\\;FO$fzf6\n\u001d\ra}+{ \n&$[]\u001d8\u0006%\u001fV\f D~\u0016;", "Adc\u000f\\;FO$fzf6\n\u001d\ra}+{!|\u0015&Q|\"", "Adc\u000f\\;FO$fzf6\n\u001d\ra}+{+|$\u0013O}{L\u00020<]}-", "Adc\u000f\\;FO$fzf6\n\u001d\ra}+{/\u000e\u001b\u001f5~\u001b8\u0006%7m", "BqX:F;KO(~|r", "Adc\u000f\\;FO$\rXh5}\r1", "1n]3\\.", "Adc\u0010T*AS~~\u000f?(z\u00189r\u0014", "Adc\u0010T3ES&\\\u0005g;|\u001c>V\u007f5\u007fA\u0005\u0017$", "Adc\u0010_6LS\u0015{\u0002^\u0019|\n/r\u007f1y@g\u0017\u0013M^\u001b8t+5f", "Adc\u0010h:M]!_zm*\u007fv/q\u0010(\u0005>\u0001w\u0013E~\u0018Iz%C", "Adc\u0011\\:D1\u0015|}^\f\u0006\u0005,l\u007f'", "Adc\u0011b>Ga\u0015\u0007\u0006e,\\\u0012+b\u0007(z", "2nf;f(F^ ~Zg(y\u0010/d", "Adc\u0011b>Ga\u0015\u0007\u0006e,d\u0013.e", "Adc\u0011l5:[\u001d|Yb:\u0003f+c\u0003(YJ\n\u0018\u001bIW\nG", "Adc\u0012a(;Z\u0019^\u0004\\6{\t.I\b$}@^!\u001eQ|{Gr#5I\f\u001c9m", "Adc\u0012a*HR\u0019}b^4\u0007\u0016CC{&~@", "Adc\u0012a*HR\u0019}b^4\u0007\u0016CC{&~@k\u0013$Cw\u001c*\u00070@`\u0002 D", "Adc\u0012a*HR\u0019}b^4\u0007\u0016CC{&~@o$\u001bO]\u001dIr45[\u0012", "Adc\u0012k,<c(\t\bL,\n\u001a3c\u007f\t\u0006M\\ \u001bOk\u001d<u\t=U\u007f E", "Ada6T3\u001ef\u0019|\u000bm6\nv/r\u0011,y@", "Adc\u0012k,<c(\t\bL<\b\u00146i\u007f5", "Adc\u0013\\3>1\u0015|}^\rx\u0007>o\r<", "Adc\u0015g;I1#\b\u0004^*\f\r9nn,\u0004@\u000b'&", "6sc=66G\\\u0019|\nb6\u0006w3m\u007f2\fOh%", "Adc\u0016`(@Svzxa,j\u0018+t\u000e\u0017\t<~\u001d\u0017T", "Adc\u0016`(@Sw~xh+|\u0016", "Adc\u0016`(@Sw~xh+|\u0016\ro\t)\u007fB", "Adc\u0016`(@S\b\fvg:z\u0013.e\r\tw>\u0010!$[", "Adc\u0016f\u0017KS\u001a~\n\\/\\\u0012+b\u0007(z.\u0011\"\"Ns\u000eI", "Adc\u001aT0G2\u001d\r\u0001<(z\f/C\n1|D\u0003", "Adc\u001aX4H`-m\bb4\u0005\u0005,l\u007f\u0015{B\u0005%&T\u0004", "Adc\u001bX;P]&\u0005[^;z\f/r", "Adc\u001d_(MT#\f\u0003;0\f\u0011+p`$yO\u000b$+", "Adc\u001db6E4\u0015|\nh9\u0011", "Adc\u001de6@`\u0019\r\tb=|m:e\u0002\u0006\u0006I\u0002\u001b\u0019", "Adc\u001fX8NS'\u000eab:\f\t8e\rt\n", "Adc\u001fX8NS'\u000eab:\f\t8e\r6", "Adc\u001fX:Bh\u0019Z\u0004]\u0019\u0007\u0018+t\u007f\b\u0005<}\u001e\u0017FP\u0018I_%Dk\b-=", "Adc `(EZ|\u0007v`,[\r=k]$yC\u0001t!Pp\u0012>", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Builder {
        private Bitmap.Config bitmapConfig;
        private MemoryCache<CacheKey, CloseableImage> bitmapMemoryCache;
        private CountingMemoryCache.EntryStateObserver<CacheKey> bitmapMemoryCacheEntryStateObserver;
        private BitmapMemoryCacheFactory bitmapMemoryCacheFactory;
        private Supplier<MemoryCacheParams> bitmapMemoryCacheParamsSupplier;
        private MemoryCache.CacheTrimStrategy bitmapMemoryCacheTrimStrategy;
        private CacheKeyFactory cacheKeyFactory;
        private CallerContextVerifier callerContextVerifier;
        private CloseableReferenceLeakTracker closeableReferenceLeakTracker;
        private final Context context;
        private Set<? extends CustomProducerSequenceFactory> customProducerSequenceFactories;
        private boolean diskCacheEnabled;
        private DownsampleMode downsampleMode;
        private Map<String, ? extends DiskCacheConfig> dynamicDiskCacheConfigMap;
        private Supplier<Boolean> enableEncodedImageColorSpaceUsage;
        private MemoryCache<CacheKey, PooledByteBuffer> encodedMemoryCache;
        private Supplier<MemoryCacheParams> encodedMemoryCacheParamsSupplier;
        private MemoryCache.CacheTrimStrategy encodedMemoryCacheTrimStrategy;
        private ExecutorSupplier executorSupplier;
        private final ImagePipelineExperiments.Builder experimentsBuilder;
        private FileCacheFactory fileCacheFactory;
        private int httpConnectionTimeout;
        private ImageCacheStatsTracker imageCacheStatsTracker;
        private ImageDecoder imageDecoder;
        private ImageDecoderConfig imageDecoderConfig;
        private ImageTranscoderFactory imageTranscoderFactory;
        private Integer imageTranscoderType;
        private Supplier<Boolean> isPrefetchEnabledSupplier;
        private DiskCacheConfig mainDiskCacheConfig;
        private Integer memoryChunkType;
        private MemoryTrimmableRegistry memoryTrimmableRegistry;
        private NetworkFetcher<?> networkFetcher;
        private PlatformBitmapFactory platformBitmapFactory;
        private PoolFactory poolFactory;
        private ProgressiveJpegConfig progressiveJpegConfig;
        private Set<? extends RequestListener2> requestListener2s;
        private Set<? extends RequestListener> requestListeners;
        private boolean resizeAndRotateEnabledForNetwork;
        private SerialExecutorService serialExecutorServiceForAnimatedImages;
        private DiskCacheConfig smallImageDiskCacheConfig;

        public Builder(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.downsampleMode = DownsampleMode.AUTO;
            this.resizeAndRotateEnabledForNetwork = true;
            this.httpConnectionTimeout = -1;
            this.experimentsBuilder = new ImagePipelineExperiments.Builder(this);
            this.diskCacheEnabled = true;
            this.closeableReferenceLeakTracker = new NoOpCloseableReferenceLeakTracker();
            this.context = context;
        }

        public static /* synthetic */ void getImageTranscoderType$annotations() {
        }

        public static /* synthetic */ void getMemoryChunkType$annotations() {
        }

        public final ImagePipelineConfig build() {
            return new ImagePipelineConfig(this, null);
        }

        public final ImagePipelineExperiments.Builder experiment() {
            return this.experimentsBuilder;
        }

        public final Bitmap.Config getBitmapConfig() {
            return this.bitmapConfig;
        }

        public final MemoryCache<CacheKey, CloseableImage> getBitmapMemoryCache() {
            return this.bitmapMemoryCache;
        }

        public final CountingMemoryCache.EntryStateObserver<CacheKey> getBitmapMemoryCacheEntryStateObserver() {
            return this.bitmapMemoryCacheEntryStateObserver;
        }

        public final BitmapMemoryCacheFactory getBitmapMemoryCacheFactory() {
            return this.bitmapMemoryCacheFactory;
        }

        public final Supplier<MemoryCacheParams> getBitmapMemoryCacheParamsSupplier() {
            return this.bitmapMemoryCacheParamsSupplier;
        }

        public final MemoryCache.CacheTrimStrategy getBitmapMemoryCacheTrimStrategy() {
            return this.bitmapMemoryCacheTrimStrategy;
        }

        public final CacheKeyFactory getCacheKeyFactory() {
            return this.cacheKeyFactory;
        }

        public final CallerContextVerifier getCallerContextVerifier() {
            return this.callerContextVerifier;
        }

        public final CloseableReferenceLeakTracker getCloseableReferenceLeakTracker() {
            return this.closeableReferenceLeakTracker;
        }

        public final Context getContext() {
            return this.context;
        }

        public final Set<CustomProducerSequenceFactory> getCustomProducerSequenceFactories() {
            return this.customProducerSequenceFactories;
        }

        public final boolean getDiskCacheEnabled() {
            return this.diskCacheEnabled;
        }

        public final DownsampleMode getDownsampleMode() {
            return this.downsampleMode;
        }

        public final Map<String, DiskCacheConfig> getDynamicDiskCacheConfigMap() {
            return this.dynamicDiskCacheConfigMap;
        }

        public final Supplier<Boolean> getEnableEncodedImageColorSpaceUsage() {
            return this.enableEncodedImageColorSpaceUsage;
        }

        public final MemoryCache<CacheKey, PooledByteBuffer> getEncodedMemoryCache() {
            return this.encodedMemoryCache;
        }

        public final Supplier<MemoryCacheParams> getEncodedMemoryCacheParamsSupplier() {
            return this.encodedMemoryCacheParamsSupplier;
        }

        public final MemoryCache.CacheTrimStrategy getEncodedMemoryCacheTrimStrategy() {
            return this.encodedMemoryCacheTrimStrategy;
        }

        public final ExecutorSupplier getExecutorSupplier() {
            return this.executorSupplier;
        }

        public final ImagePipelineExperiments.Builder getExperimentsBuilder() {
            return this.experimentsBuilder;
        }

        public final FileCacheFactory getFileCacheFactory() {
            return this.fileCacheFactory;
        }

        public final int getHttpConnectionTimeout() {
            return this.httpConnectionTimeout;
        }

        public final ImageCacheStatsTracker getImageCacheStatsTracker() {
            return this.imageCacheStatsTracker;
        }

        public final ImageDecoder getImageDecoder() {
            return this.imageDecoder;
        }

        public final ImageDecoderConfig getImageDecoderConfig() {
            return this.imageDecoderConfig;
        }

        public final ImageTranscoderFactory getImageTranscoderFactory() {
            return this.imageTranscoderFactory;
        }

        public final Integer getImageTranscoderType() {
            return this.imageTranscoderType;
        }

        public final DiskCacheConfig getMainDiskCacheConfig() {
            return this.mainDiskCacheConfig;
        }

        public final Integer getMemoryChunkType() {
            return this.memoryChunkType;
        }

        public final MemoryTrimmableRegistry getMemoryTrimmableRegistry() {
            return this.memoryTrimmableRegistry;
        }

        public final NetworkFetcher<?> getNetworkFetcher() {
            return this.networkFetcher;
        }

        public final PlatformBitmapFactory getPlatformBitmapFactory() {
            return this.platformBitmapFactory;
        }

        public final PoolFactory getPoolFactory() {
            return this.poolFactory;
        }

        public final ProgressiveJpegConfig getProgressiveJpegConfig() {
            return this.progressiveJpegConfig;
        }

        public final Set<RequestListener2> getRequestListener2s() {
            return this.requestListener2s;
        }

        public final Set<RequestListener> getRequestListeners() {
            return this.requestListeners;
        }

        public final boolean getResizeAndRotateEnabledForNetwork() {
            return this.resizeAndRotateEnabledForNetwork;
        }

        public final SerialExecutorService getSerialExecutorServiceForAnimatedImages() {
            return this.serialExecutorServiceForAnimatedImages;
        }

        public final DiskCacheConfig getSmallImageDiskCacheConfig() {
            return this.smallImageDiskCacheConfig;
        }

        public final boolean isDiskCacheEnabled() {
            return this.diskCacheEnabled;
        }

        public final boolean isDownsampleEnabled() {
            return this.downsampleMode == DownsampleMode.ALWAYS;
        }

        public final Supplier<Boolean> isPrefetchEnabledSupplier() {
            return this.isPrefetchEnabledSupplier;
        }

        public final Builder setBitmapMemoryCache(MemoryCache<CacheKey, CloseableImage> memoryCache) {
            this.bitmapMemoryCache = memoryCache;
            return this;
        }

        public final Builder setBitmapMemoryCacheEntryStateObserver(CountingMemoryCache.EntryStateObserver<CacheKey> entryStateObserver) {
            this.bitmapMemoryCacheEntryStateObserver = entryStateObserver;
            return this;
        }

        public final Builder setBitmapMemoryCacheFactory(BitmapMemoryCacheFactory bitmapMemoryCacheFactory) {
            this.bitmapMemoryCacheFactory = bitmapMemoryCacheFactory;
            return this;
        }

        public final Builder setBitmapMemoryCacheParamsSupplier(Supplier<MemoryCacheParams> supplier) {
            if (supplier == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            this.bitmapMemoryCacheParamsSupplier = supplier;
            return this;
        }

        public final Builder setBitmapMemoryCacheTrimStrategy(MemoryCache.CacheTrimStrategy cacheTrimStrategy) {
            this.bitmapMemoryCacheTrimStrategy = cacheTrimStrategy;
            return this;
        }

        public final Builder setBitmapsConfig(Bitmap.Config config) {
            this.bitmapConfig = config;
            return this;
        }

        public final Builder setCacheKeyFactory(CacheKeyFactory cacheKeyFactory) {
            this.cacheKeyFactory = cacheKeyFactory;
            return this;
        }

        public final Builder setCallerContextVerifier(CallerContextVerifier callerContextVerifier) {
            this.callerContextVerifier = callerContextVerifier;
            return this;
        }

        public final Builder setCloseableReferenceLeakTracker(CloseableReferenceLeakTracker closeableReferenceLeakTracker) {
            Intrinsics.checkNotNullParameter(closeableReferenceLeakTracker, "closeableReferenceLeakTracker");
            this.closeableReferenceLeakTracker = closeableReferenceLeakTracker;
            return this;
        }

        public final Builder setCustomFetchSequenceFactories(Set<? extends CustomProducerSequenceFactory> set) {
            this.customProducerSequenceFactories = set;
            return this;
        }

        public final Builder setDiskCacheEnabled(boolean z2) {
            this.diskCacheEnabled = z2;
            return this;
        }

        @Deprecated(message = "\u0018Y\u0001t\u0006|\u001a\u0017fL?:c\u001a@2kc\u0017:\u0006u\u001c^{3}nS<l&uQxJ\\`")
        @InterfaceC1492Gx
        public final Builder setDownsampleEnabled(boolean z2) {
            if (z2) {
                setDownsampleMode(DownsampleMode.ALWAYS);
            } else {
                setDownsampleMode(DownsampleMode.AUTO);
            }
            return this;
        }

        public final Builder setDownsampleMode(DownsampleMode downsampleMode) {
            Intrinsics.checkNotNullParameter(downsampleMode, "downsampleMode");
            this.downsampleMode = downsampleMode;
            return this;
        }

        public final Builder setDynamicDiskCacheConfigMap(Map<String, ? extends DiskCacheConfig> dynamicDiskCacheConfigMap) {
            Intrinsics.checkNotNullParameter(dynamicDiskCacheConfigMap, "dynamicDiskCacheConfigMap");
            this.dynamicDiskCacheConfigMap = dynamicDiskCacheConfigMap;
            return this;
        }

        public final Builder setEnableEncodedImageColorSpaceUsage(Supplier<Boolean> supplier) {
            this.enableEncodedImageColorSpaceUsage = supplier;
            return this;
        }

        public final Builder setEncodedMemoryCache(MemoryCache<CacheKey, PooledByteBuffer> memoryCache) {
            this.encodedMemoryCache = memoryCache;
            return this;
        }

        public final Builder setEncodedMemoryCacheParamsSupplier(Supplier<MemoryCacheParams> supplier) {
            if (supplier == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            this.encodedMemoryCacheParamsSupplier = supplier;
            return this;
        }

        public final Builder setEncodedMemoryCacheTrimStrategy(MemoryCache.CacheTrimStrategy cacheTrimStrategy) {
            this.encodedMemoryCacheTrimStrategy = cacheTrimStrategy;
            return this;
        }

        public final Builder setExecutorServiceForAnimatedImages(SerialExecutorService serialExecutorService) {
            this.serialExecutorServiceForAnimatedImages = serialExecutorService;
            return this;
        }

        public final Builder setExecutorSupplier(ExecutorSupplier executorSupplier) {
            this.executorSupplier = executorSupplier;
            return this;
        }

        public final Builder setFileCacheFactory(FileCacheFactory fileCacheFactory) {
            this.fileCacheFactory = fileCacheFactory;
            return this;
        }

        public final Builder setHttpConnectionTimeout(int i2) {
            this.httpConnectionTimeout = i2;
            return this;
        }

        public final Builder setImageCacheStatsTracker(ImageCacheStatsTracker imageCacheStatsTracker) {
            this.imageCacheStatsTracker = imageCacheStatsTracker;
            return this;
        }

        public final Builder setImageDecoder(ImageDecoder imageDecoder) {
            this.imageDecoder = imageDecoder;
            return this;
        }

        public final Builder setImageDecoderConfig(ImageDecoderConfig imageDecoderConfig) {
            this.imageDecoderConfig = imageDecoderConfig;
            return this;
        }

        public final Builder setImageTranscoderFactory(ImageTranscoderFactory imageTranscoderFactory) {
            this.imageTranscoderFactory = imageTranscoderFactory;
            return this;
        }

        public final Builder setImageTranscoderType(int i2) {
            this.imageTranscoderType = Integer.valueOf(i2);
            return this;
        }

        public final void setImageTranscoderType(Integer num) {
            this.imageTranscoderType = num;
        }

        public final Builder setIsPrefetchEnabledSupplier(Supplier<Boolean> supplier) {
            this.isPrefetchEnabledSupplier = supplier;
            return this;
        }

        public final Builder setMainDiskCacheConfig(DiskCacheConfig diskCacheConfig) {
            this.mainDiskCacheConfig = diskCacheConfig;
            return this;
        }

        public final Builder setMemoryChunkType(int i2) {
            this.memoryChunkType = Integer.valueOf(i2);
            return this;
        }

        public final void setMemoryChunkType(Integer num) {
            this.memoryChunkType = num;
        }

        public final Builder setMemoryTrimmableRegistry(MemoryTrimmableRegistry memoryTrimmableRegistry) {
            this.memoryTrimmableRegistry = memoryTrimmableRegistry;
            return this;
        }

        public final Builder setNetworkFetcher(NetworkFetcher<?> networkFetcher) {
            this.networkFetcher = networkFetcher;
            return this;
        }

        public final Builder setPlatformBitmapFactory(PlatformBitmapFactory platformBitmapFactory) {
            this.platformBitmapFactory = platformBitmapFactory;
            return this;
        }

        public final Builder setPoolFactory(PoolFactory poolFactory) {
            this.poolFactory = poolFactory;
            return this;
        }

        public final Builder setProgressiveJpegConfig(ProgressiveJpegConfig progressiveJpegConfig) {
            this.progressiveJpegConfig = progressiveJpegConfig;
            return this;
        }

        public final Builder setRequestListener2s(Set<? extends RequestListener2> set) {
            this.requestListener2s = set;
            return this;
        }

        public final Builder setRequestListeners(Set<? extends RequestListener> set) {
            this.requestListeners = set;
            return this;
        }

        public final Builder setResizeAndRotateEnabledForNetwork(boolean z2) {
            this.resizeAndRotateEnabledForNetwork = z2;
            return this;
        }

        public final Builder setSmallImageDiskCacheConfig(DiskCacheConfig diskCacheConfig) {
            this.smallImageDiskCacheConfig = diskCacheConfig;
            return this;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯP\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005%4\u0012\u000e\u0007nʑA0ZeP\u008cZS@\u000fsڔ<$q$yّCU(\u0004*ޛWN}gvJ`\u000bK\u000f\u0014\u0016\u0001j2I]xs\u0012\u0017˰JoU3UڎCʧa\u000bȂ5 `!x~\u000b\u0001ʀ.H\u001evCQY\u0013*0nxjV\u001bV\u001d\u001a@\u0010\u0005 I.jrf8^k\fF_'\u0011vZNUmv|\u0016#Tc?\r%qN/NDM\u0015Sa3\u000b`lW\u0003m\u0004\u0004\u0005155>as\u0006D\t\u0004\"\u001eCO;g9+%\u000b_t$'Yd*P\u0019.6\u000e\u0013{;Q4\u0012\u0014>`.[2\u0017\f\u001cD\rr\u0002R\u0001\bl[\u0018|w5E?F3{])iiai\u001b~;\n\u0006%\u001eQ\u0003%%\u001a\u0015dֳ!ôX\u0004YĸaBCL\\\nq?s\t~h͌.\u001f"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/BYG\u0004?i\u0018.8GFk;\"\u001eh?C\u0010d0P5\u0005QTY(eV|Fi", "", "u(E", "\nrTA \u0006\u0017", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/BYG\u0004?i\u0018.8GFk;\"\u001eh?C\u0010d0P5\u0006GMJ<caVE\u0010\u0014ZzN7\u001d\u0005gP\u0002xM8#\n\u0002", "2dU.h3M7!z|^\u0019|\u0015?e\u000e7YJ\n\u0018\u001bI", "5dc\u0011X-:c \u000e^f(~\t\u001ce\f8{N\u0010t!Pp\u0012>5!>b\b/3|\u001a8VQ", "5dc\u0011X-:c \u000e^f(~\t\u001ce\f8{N\u0010t!Pp\u0012>", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn3c\u000b \u0001Q\u001e*OC&o?\u001e\u001clj9dm5Oz)\u0006+N-XbyLw\u001aV\u0010N\u0018\r\u0011iA2}\"A(\t0KW", "5dc\u0011X-:c \u000ebZ0\u0006g3s\u0006\u0006w>\u0004\u0017tQx\u000f@x", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0007+c\u0003(E?\u0005%\u001d\u0011N\u0012J|\u00031W\u0001 \u0015w\u001f/QE\u0011", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "5dc\u0016`(@S\b\fvg:z\u0013.e\r\tw>\u0010!$[", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u000621b\f\u001eAl\u0016;\u0017'Cg6\u001e\u0004u]B\u0015a6Mv4(HL;f_\u0007\u0013", "0tX9W,K", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/BYG\u0004?i\u0018.8GFk;\"\u001eh?C\u0010d0P5\u0004WPU+\\_H", "5dc\u001aX4H`-\\}n5\u0003wCp\u007f", "", "7lP4X\u0017B^\u0019\u0006~g,\\\u001c:e\r,\u0004@\n&%", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/BYG\u0004?i\u0018.8GFk;\"\u001ehAL\u0012c9R~'P[\\\u0002", "<df\u000fh0ER\u0019\f", "@db2g\u000b>T\u0015\u000f\u0002m\u0019|\u0015?e\u000e7YJ\n\u0018\u001bI", "", "Adc$X)I0\u001d\u000e\u0003Z7]\u0005-t\n5\u0010", "EdQ=50M[\u0015\n[Z*\f\u0013<y", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\u0013\u0017\u0014R9\u007f<s0\u0012]\r(3xv*KRExHs", "0hc:T7\u001c`\u0019z\nh9", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\u0013\u0017\u0014R9j@\u0006-1d[-7i%8Z\u0019", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getDefaultImageRequestConfig$annotations() {
        }

        public final DiskCacheConfig getDefaultMainDiskCacheConfig(Context context) {
            DiskCacheConfig diskCacheConfigBuild;
            FrescoSystrace frescoSystrace = FrescoSystrace.INSTANCE;
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.beginSection("DiskCacheConfig.getDefaultMainDiskCacheConfig");
                try {
                    diskCacheConfigBuild = DiskCacheConfig.newBuilder(context).build();
                } finally {
                    FrescoSystrace.endSection();
                }
            } else {
                diskCacheConfigBuild = DiskCacheConfig.newBuilder(context).build();
            }
            Intrinsics.checkNotNullExpressionValue(diskCacheConfigBuild, "traceSection(\"DiskCacheC…ontext).build()\n        }");
            return diskCacheConfigBuild;
        }

        public final ImageTranscoderFactory getImageTranscoderFactory(Builder builder) {
            if (builder.getImageTranscoderFactory() == null || builder.getImageTranscoderType() == null) {
                return builder.getImageTranscoderFactory();
            }
            throw new IllegalStateException("You can't define a custom ImageTranscoderFactory and provide an ImageTranscoderType".toString());
        }

        public final int getMemoryChunkType(Builder builder, ImagePipelineExperiments imagePipelineExperiments) {
            Integer memoryChunkType = builder.getMemoryChunkType();
            if (memoryChunkType != null) {
                return memoryChunkType.intValue();
            }
            if (imagePipelineExperiments.getMemoryType() == 2 && Build.VERSION.SDK_INT >= 27) {
                return 2;
            }
            if (imagePipelineExperiments.getMemoryType() == 1) {
                return 1;
            }
            imagePipelineExperiments.getMemoryType();
            return 0;
        }

        public final void setWebpBitmapFactory(WebpBitmapFactory webpBitmapFactory, ImagePipelineExperiments imagePipelineExperiments, BitmapCreator bitmapCreator) {
            WebpSupportStatus.sWebpBitmapFactory = webpBitmapFactory;
            WebpBitmapFactory.WebpErrorLogger webpErrorLogger = imagePipelineExperiments.getWebpErrorLogger();
            if (webpErrorLogger != null) {
                webpBitmapFactory.setWebpErrorLogger(webpErrorLogger);
            }
            if (bitmapCreator != null) {
                webpBitmapFactory.setBitmapCreator(bitmapCreator);
            }
        }

        public final DefaultImageRequestConfig getDefaultImageRequestConfig() {
            return ImagePipelineConfig.defaultImageRequestConfig;
        }

        @JvmStatic
        public final Builder newBuilder(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new Builder(context);
        }

        @JvmStatic
        public final void resetDefaultRequestConfig() {
            ImagePipelineConfig.defaultImageRequestConfig = new DefaultImageRequestConfig();
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00146B\u0005$Bߚ(\u0007\u0015iy3ǲiH<R$B\u001dl\u00144R]zڕOтY&\u0006̝!QThuqj\\\u0011G\u001d\u000bȆ|p"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/BYG\u0004?i\u0018.8GFk;\"\u001eh?C\u0010d0P5\u0006GMJ<caVE\u0010\u0014ZzN7\u001d\u0005gP\u0002xM8#\n\u0002", "", "u(E", "7r??b.KS'\r~o,i\t8d\u007f5\u007fI\u0003v Cl\u0015<u", "", "u(I", "Adc\u001de6@`\u0019\r\tb=|u/n~(\tD\n\u0019vPk\u000bCv$", "uY\u0018#", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class DefaultImageRequestConfig {
        private boolean isProgressiveRenderingEnabled;

        public final boolean isProgressiveRenderingEnabled() {
            return this.isProgressiveRenderingEnabled;
        }

        public final void setProgressiveRenderingEnabled(boolean z2) {
            this.isProgressiveRenderingEnabled = z2;
        }
    }

    private ImagePipelineConfig(Builder builder) throws Throwable {
        HttpUrlConnectionNetworkFetcher networkFetcher;
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.beginSection(C1593ug.zd("\n/$+*\u001608.64:2\u0011>>7;:{}", (short) (C1580rY.Xd() ^ (-4944)), (short) (C1580rY.Xd() ^ (-18216))));
        }
        this.experiments = builder.getExperimentsBuilder().build();
        DefaultBitmapMemoryCacheParamsSupplier bitmapMemoryCacheParamsSupplier = builder.getBitmapMemoryCacheParamsSupplier();
        String strOd = C1561oA.od("\t\u001b&)\u001c$\u0016\u0014N$\u000e\u0018 \u000fH\u001f\b\u0019D\u0012\u0018\u000e\rM", (short) (C1633zX.Xd() ^ (-4175)));
        if (bitmapMemoryCacheParamsSupplier == null) {
            Context context = builder.getContext();
            String strKd = C1561oA.Kd("\u0019\u001c.$2&28", (short) (OY.Xd() ^ HttpStatus.SC_EXPECTATION_FAILED));
            Class<?> cls = Class.forName(Wg.Zd("S\n+^:]\u007fr\u0013Jr[m\"Mm2\bm\u0019-iH", (short) (FB.Xd() ^ 6056), (short) (FB.Xd() ^ 24442)));
            Class<?>[] clsArr = {Class.forName(C1561oA.Xd("\u0007~\u0015\u0001N\u000e\u0004\u0012\fSy\u001c\u001b\u0013\u0019\u0013", (short) (ZN.Xd() ^ 32745)))};
            Object[] objArr = {strKd};
            short sXd = (short) (ZN.Xd() ^ 15945);
            int[] iArr = new int["-,8\u0018;64&;\"1?@4+.".length()];
            QB qb = new QB("-,8\u0018;64&;\"1?@4+.");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                Object objInvoke = method.invoke(context, objArr);
                if (objInvoke == null) {
                    throw new IllegalStateException(strOd.toString());
                }
                Intrinsics.checkNotNull(objInvoke, Qg.kd("MSIHz=:FEEIs57p30AAk?9h664q28.-_37-!Z\u001b'\u001c)%\u001e\u0018`\u0013! \\n\u0010 \u0014 \u0012\u001c r\u0006\u0012\u0004\t\u0006\u0012", (short) (FB.Xd() ^ 1804), (short) (FB.Xd() ^ 23993)));
                bitmapMemoryCacheParamsSupplier = new DefaultBitmapMemoryCacheParamsSupplier((ActivityManager) objInvoke);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        this.bitmapMemoryCacheParamsSupplier = bitmapMemoryCacheParamsSupplier;
        BitmapMemoryCacheTrimStrategy bitmapMemoryCacheTrimStrategy = builder.getBitmapMemoryCacheTrimStrategy();
        this.bitmapMemoryCacheTrimStrategy = bitmapMemoryCacheTrimStrategy == null ? new BitmapMemoryCacheTrimStrategy() : bitmapMemoryCacheTrimStrategy;
        NativeMemoryCacheTrimStrategy encodedMemoryCacheTrimStrategy = builder.getEncodedMemoryCacheTrimStrategy();
        this.encodedMemoryCacheTrimStrategy = encodedMemoryCacheTrimStrategy == null ? new NativeMemoryCacheTrimStrategy() : encodedMemoryCacheTrimStrategy;
        this.bitmapMemoryCacheEntryStateObserver = builder.getBitmapMemoryCacheEntryStateObserver();
        Bitmap.Config bitmapConfig = builder.getBitmapConfig();
        this.bitmapConfig = bitmapConfig == null ? Bitmap.Config.ARGB_8888 : bitmapConfig;
        DefaultCacheKeyFactory cacheKeyFactory = builder.getCacheKeyFactory();
        String strVd = hg.Vd("$!/\u0003'++\u0017#\u0017\u0018YY", (short) (C1499aX.Xd() ^ (-7218)), (short) (C1499aX.Xd() ^ (-29713)));
        if (cacheKeyFactory == null) {
            DefaultCacheKeyFactory defaultCacheKeyFactory = DefaultCacheKeyFactory.getInstance();
            Intrinsics.checkNotNullExpressionValue(defaultCacheKeyFactory, strVd);
            cacheKeyFactory = defaultCacheKeyFactory;
        }
        this.cacheKeyFactory = cacheKeyFactory;
        Context context2 = builder.getContext();
        if (context2 == null) {
            throw new IllegalStateException(strOd.toString());
        }
        this.context = context2;
        DiskStorageCacheFactory fileCacheFactory = builder.getFileCacheFactory();
        this.fileCacheFactory = fileCacheFactory == null ? new DiskStorageCacheFactory(new DynamicDefaultDiskStorageFactory()) : fileCacheFactory;
        this.downsampleMode = builder.getDownsampleMode();
        DefaultEncodedMemoryCacheParamsSupplier encodedMemoryCacheParamsSupplier = builder.getEncodedMemoryCacheParamsSupplier();
        this.encodedMemoryCacheParamsSupplier = encodedMemoryCacheParamsSupplier == null ? new DefaultEncodedMemoryCacheParamsSupplier() : encodedMemoryCacheParamsSupplier;
        NoOpImageCacheStatsTracker imageCacheStatsTracker = builder.getImageCacheStatsTracker();
        if (imageCacheStatsTracker == null) {
            NoOpImageCacheStatsTracker noOpImageCacheStatsTracker = NoOpImageCacheStatsTracker.getInstance();
            Intrinsics.checkNotNullExpressionValue(noOpImageCacheStatsTracker, strVd);
            imageCacheStatsTracker = noOpImageCacheStatsTracker;
        }
        this.imageCacheStatsTracker = imageCacheStatsTracker;
        this.imageDecoder = builder.getImageDecoder();
        Supplier<Boolean> enableEncodedImageColorSpaceUsage = builder.getEnableEncodedImageColorSpaceUsage();
        if (enableEncodedImageColorSpaceUsage == null) {
            enableEncodedImageColorSpaceUsage = Suppliers.BOOLEAN_FALSE;
            Intrinsics.checkNotNullExpressionValue(enableEncodedImageColorSpaceUsage, C1561oA.ud("\u0016\"!\u001d\u0015\u0010\u001c,\u0012\f\u0016\u001c\r", (short) (C1580rY.Xd() ^ (-3432))));
        }
        this.enableEncodedImageColorSpaceUsage = enableEncodedImageColorSpaceUsage;
        Companion companion = Companion;
        this.imageTranscoderFactory = companion.getImageTranscoderFactory(builder);
        this.imageTranscoderType = builder.getImageTranscoderType();
        Supplier<Boolean> supplierIsPrefetchEnabledSupplier = builder.isPrefetchEnabledSupplier();
        if (supplierIsPrefetchEnabledSupplier == null) {
            supplierIsPrefetchEnabledSupplier = Suppliers.BOOLEAN_TRUE;
            Intrinsics.checkNotNullExpressionValue(supplierIsPrefetchEnabledSupplier, C1561oA.yd("O]^\\NKYkYX\\M", (short) (C1499aX.Xd() ^ (-10496))));
        }
        this.isPrefetchEnabledSupplier = supplierIsPrefetchEnabledSupplier;
        DiskCacheConfig mainDiskCacheConfig = builder.getMainDiskCacheConfig();
        this.mainDiskCacheConfig = mainDiskCacheConfig == null ? companion.getDefaultMainDiskCacheConfig(builder.getContext()) : mainDiskCacheConfig;
        NoOpMemoryTrimmableRegistry memoryTrimmableRegistry = builder.getMemoryTrimmableRegistry();
        if (memoryTrimmableRegistry == null) {
            NoOpMemoryTrimmableRegistry noOpMemoryTrimmableRegistry = NoOpMemoryTrimmableRegistry.getInstance();
            Intrinsics.checkNotNullExpressionValue(noOpMemoryTrimmableRegistry, strVd);
            memoryTrimmableRegistry = noOpMemoryTrimmableRegistry;
        }
        this.memoryTrimmableRegistry = memoryTrimmableRegistry;
        this.memoryChunkType = companion.getMemoryChunkType(builder, getExperiments());
        int httpConnectionTimeout = builder.getHttpConnectionTimeout() < 0 ? HttpUrlConnectionNetworkFetcher.HTTP_DEFAULT_TIMEOUT : builder.getHttpConnectionTimeout();
        this.httpNetworkTimeout = httpConnectionTimeout;
        FrescoSystrace frescoSystrace = FrescoSystrace.INSTANCE;
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.beginSection(C1561oA.Yd("t\u001a\u000f\u0016\u0015\u0001\u001b#\u0019!\u001f%\u001d{))\"&%k}.\u0010(8<593\u000f/?/53A", (short) (FB.Xd() ^ 25210)));
            try {
                networkFetcher = builder.getNetworkFetcher();
                networkFetcher = networkFetcher == null ? new HttpUrlConnectionNetworkFetcher(httpConnectionTimeout) : networkFetcher;
            } finally {
                FrescoSystrace.endSection();
            }
        } else {
            networkFetcher = builder.getNetworkFetcher();
            if (networkFetcher == null) {
                networkFetcher = new HttpUrlConnectionNetworkFetcher(httpConnectionTimeout);
            }
        }
        this.networkFetcher = networkFetcher;
        this.platformBitmapFactory = builder.getPlatformBitmapFactory();
        PoolFactory poolFactory = builder.getPoolFactory();
        this.poolFactory = poolFactory == null ? new PoolFactory(PoolConfig.newBuilder().build()) : poolFactory;
        SimpleProgressiveJpegConfig progressiveJpegConfig = builder.getProgressiveJpegConfig();
        this.progressiveJpegConfig = progressiveJpegConfig == null ? new SimpleProgressiveJpegConfig() : progressiveJpegConfig;
        Set<RequestListener> requestListeners = builder.getRequestListeners();
        this.requestListeners = requestListeners == null ? SetsKt.emptySet() : requestListeners;
        Set<RequestListener2> requestListener2s = builder.getRequestListener2s();
        this.requestListener2s = requestListener2s == null ? SetsKt.emptySet() : requestListener2s;
        Set<CustomProducerSequenceFactory> customProducerSequenceFactories = builder.getCustomProducerSequenceFactories();
        this.customProducerSequenceFactories = customProducerSequenceFactories == null ? SetsKt.emptySet() : customProducerSequenceFactories;
        this.isResizeAndRotateEnabledForNetwork = builder.getResizeAndRotateEnabledForNetwork();
        DiskCacheConfig smallImageDiskCacheConfig = builder.getSmallImageDiskCacheConfig();
        this.smallImageDiskCacheConfig = smallImageDiskCacheConfig == null ? getMainDiskCacheConfig() : smallImageDiskCacheConfig;
        this.imageDecoderConfig = builder.getImageDecoderConfig();
        int flexByteArrayPoolMaxNumThreads = getPoolFactory().getFlexByteArrayPoolMaxNumThreads();
        DefaultExecutorSupplier executorSupplier = builder.getExecutorSupplier();
        this.executorSupplier = executorSupplier == null ? new DefaultExecutorSupplier(flexByteArrayPoolMaxNumThreads) : executorSupplier;
        this.isDiskCacheEnabled = builder.getDiskCacheEnabled();
        this.callerContextVerifier = builder.getCallerContextVerifier();
        this.closeableReferenceLeakTracker = builder.getCloseableReferenceLeakTracker();
        this.bitmapCacheOverride = builder.getBitmapMemoryCache();
        CountingLruBitmapMemoryCacheFactory bitmapMemoryCacheFactory = builder.getBitmapMemoryCacheFactory();
        this.bitmapMemoryCacheFactory = bitmapMemoryCacheFactory == null ? new CountingLruBitmapMemoryCacheFactory() : bitmapMemoryCacheFactory;
        this.encodedMemoryCacheOverride = builder.getEncodedMemoryCache();
        this.executorServiceForAnimatedImages = builder.getSerialExecutorServiceForAnimatedImages();
        this.dynamicDiskCacheConfigMap = builder.getDynamicDiskCacheConfigMap();
        WebpBitmapFactory webpBitmapFactory = getExperiments().getWebpBitmapFactory();
        if (webpBitmapFactory != null) {
            companion.setWebpBitmapFactory(webpBitmapFactory, getExperiments(), new HoneycombBitmapCreator(getPoolFactory()));
        }
        if (FrescoSystrace.isTracing()) {
        }
    }

    public /* synthetic */ ImagePipelineConfig(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    public static final DefaultImageRequestConfig getDefaultImageRequestConfig() {
        return Companion.getDefaultImageRequestConfig();
    }

    public static /* synthetic */ void getImageTranscoderType$annotations() {
    }

    public static /* synthetic */ void getMemoryChunkType$annotations() {
    }

    @JvmStatic
    public static final Builder newBuilder(Context context) {
        return Companion.newBuilder(context);
    }

    @JvmStatic
    public static final void resetDefaultRequestConfig() {
        Companion.resetDefaultRequestConfig();
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public MemoryCache<CacheKey, CloseableImage> getBitmapCacheOverride() {
        return this.bitmapCacheOverride;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public Bitmap.Config getBitmapConfig() {
        return this.bitmapConfig;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public CountingMemoryCache.EntryStateObserver<CacheKey> getBitmapMemoryCacheEntryStateObserver() {
        return this.bitmapMemoryCacheEntryStateObserver;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public BitmapMemoryCacheFactory getBitmapMemoryCacheFactory() {
        return this.bitmapMemoryCacheFactory;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public Supplier<MemoryCacheParams> getBitmapMemoryCacheParamsSupplier() {
        return this.bitmapMemoryCacheParamsSupplier;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public MemoryCache.CacheTrimStrategy getBitmapMemoryCacheTrimStrategy() {
        return this.bitmapMemoryCacheTrimStrategy;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public CacheKeyFactory getCacheKeyFactory() {
        return this.cacheKeyFactory;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public CallerContextVerifier getCallerContextVerifier() {
        return this.callerContextVerifier;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public CloseableReferenceLeakTracker getCloseableReferenceLeakTracker() {
        return this.closeableReferenceLeakTracker;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public Context getContext() {
        return this.context;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public Set<CustomProducerSequenceFactory> getCustomProducerSequenceFactories() {
        return this.customProducerSequenceFactories;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public DownsampleMode getDownsampleMode() {
        return this.downsampleMode;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public Map<String, DiskCacheConfig> getDynamicDiskCacheConfigMap() {
        return this.dynamicDiskCacheConfigMap;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public Supplier<Boolean> getEnableEncodedImageColorSpaceUsage() {
        return this.enableEncodedImageColorSpaceUsage;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public MemoryCache<CacheKey, PooledByteBuffer> getEncodedMemoryCacheOverride() {
        return this.encodedMemoryCacheOverride;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public Supplier<MemoryCacheParams> getEncodedMemoryCacheParamsSupplier() {
        return this.encodedMemoryCacheParamsSupplier;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public MemoryCache.CacheTrimStrategy getEncodedMemoryCacheTrimStrategy() {
        return this.encodedMemoryCacheTrimStrategy;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public SerialExecutorService getExecutorServiceForAnimatedImages() {
        return this.executorServiceForAnimatedImages;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public ExecutorSupplier getExecutorSupplier() {
        return this.executorSupplier;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public ImagePipelineExperiments getExperiments() {
        return this.experiments;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public FileCacheFactory getFileCacheFactory() {
        return this.fileCacheFactory;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public ImageCacheStatsTracker getImageCacheStatsTracker() {
        return this.imageCacheStatsTracker;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public ImageDecoder getImageDecoder() {
        return this.imageDecoder;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public ImageDecoderConfig getImageDecoderConfig() {
        return this.imageDecoderConfig;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public ImageTranscoderFactory getImageTranscoderFactory() {
        return this.imageTranscoderFactory;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public Integer getImageTranscoderType() {
        return this.imageTranscoderType;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public DiskCacheConfig getMainDiskCacheConfig() {
        return this.mainDiskCacheConfig;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public int getMemoryChunkType() {
        return this.memoryChunkType;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public MemoryTrimmableRegistry getMemoryTrimmableRegistry() {
        return this.memoryTrimmableRegistry;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public NetworkFetcher<?> getNetworkFetcher() {
        return this.networkFetcher;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public PlatformBitmapFactory getPlatformBitmapFactory() {
        return this.platformBitmapFactory;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public PoolFactory getPoolFactory() {
        return this.poolFactory;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public ProgressiveJpegConfig getProgressiveJpegConfig() {
        return this.progressiveJpegConfig;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public Set<RequestListener2> getRequestListener2s() {
        return this.requestListener2s;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public Set<RequestListener> getRequestListeners() {
        return this.requestListeners;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public DiskCacheConfig getSmallImageDiskCacheConfig() {
        return this.smallImageDiskCacheConfig;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public boolean isDiskCacheEnabled() {
        return this.isDiskCacheEnabled;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public Supplier<Boolean> isPrefetchEnabledSupplier() {
        return this.isPrefetchEnabledSupplier;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public boolean isResizeAndRotateEnabledForNetwork() {
        return this.isResizeAndRotateEnabledForNetwork;
    }
}
