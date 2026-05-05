package com.facebook.imagepipeline.core;

import android.content.Context;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.Supplier;
import com.facebook.common.internal.Suppliers;
import com.facebook.common.memory.ByteArrayPool;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.common.memory.PooledByteStreams;
import com.facebook.common.webp.WebpBitmapFactory;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.cache.BufferedDiskCache;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.facebook.imagepipeline.decoder.ImageDecoder;
import com.facebook.imagepipeline.decoder.ProgressiveJpegConfig;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.platform.PlatformDecoderOptions;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯT\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\":\u001b\u007f\u0007lmA0RkP.Xi2\u000f\u0002{<$a+yCI\\\"}(\nWN}gvJ`\u000eK\u000f\u001c\u0016\u0001j2Z]xs\u0012\u00172HpG3coE9fyLӌ>\u0006R8(\u00049\u001c|\u001cdL;PQ\f\"4NpRR;Nŋ\u001e\u0012\u0014@p\u0010,_\u007fNdLǰa@7݊\u001bkHS5e\u0001\f[\u0014^TU\u0011țe$3¨O7\u001b-a\tWaiH\u001b? Gݾl-/Ǣau]Af\fd$9\\%]!*ػ\tWhϯ?-UqYV^7\u0006\n\u0014\rj\u000e؝\n-P͓E\u001cl\u0018\u001c?E\u0002aQh\u0002\rLȸ~g>Ѝ=\u00029=G'7`oN1Ne\u007f˿\u0011$+Ч\u0007#ah\u001cfe*b\ri1\u007fDףLT\u0012ԯUo\n\u0007p\bz\u0013>^\u0018/*\u0015ѧ\u001b+?كQ%'\u0004\u0010N\u0015v\u0005\u001exh\u0002mʐLF*Â.90#\u001a`\u0015s\u0013\u0007hT\u00070ҭQ\"\\͵\u0016\n\u0019;j}\r03,fO\u0017mҷQc\u0012ɘGh=u|q^fG{K5\u007fgߧeX~ܝW>h\"fl\u0013b\u001axt(P6ʮn\u0016\u007fӻ\\P\u00121@EB+BKI\u0019\u000b\u0019Ƞ\u0007$Jˆ\u0015\u000beyv\u0016OcAD\u001biRx֊\u0005Vdʙ\bi~i:\u000311;bi5G*Ɓ&n<ê;\t\u0005\u0015\u000eM8aUn\u0005\u001c\u0006W\f D\u001egtȠA\u0019\u0017ȯA4\bOSpCt_r*')\u0001ɍ\u0013Ap֫\u007f\np\u0016:f;Y]z/\"%bѓ'\u000elр\u0012cL!Ui%\u001aiear1]\u0084R>\u0005þ7 +(}(MD;k?\u001dD{ӄ3\u001biӠ\u0002q4#p\u0015v\u0004s.DcDy͈Uc:ծPK_*L.t{\u0011n`j&5ɚ\r:\u0015Ή`Cj\u001fdg\u001e\u001a=.~\u0007Z>\u0080ZaBܤ\b\u007f:`m]DR\fHvCS\u0015ߠWmuޮc^\u0011\u007f\u001d\u0010[\u000b?%*\u001ckWݫ[h\u0011ݵ\u001eu\u001enOt3\u0014JC<4Z@ޭ\u000fI\\ȫ\u001e\u0012\u0001;Te_&@~\f;\u0005\u0012֭|b^ޠ\u001dbK\u001e/0Q\u000e\u001dq6xc5ܭqL\\Џ{4\u0007\u0013+\u000fk\u007f]?~+;Fd9I,\u0007$խIcK̲\u001a8\n\t7\u0012<~\u001az0|KLɓ\u001f?YΙwx6\"\u0019a5]r;*f\u0001RĀ-\u0005\u0003Մ&>\u0010T\u0019\u001f \u0002})EL|{̢G \tҿ\\+\rS\u000bi\u0017*;NM-kMހ\u0018-\u0004ߺk=\u0004Q.&w\u0015\u0003ktY$e8)Ό>\u001cyдz\u0004\u000f_^mT?XC\u000b\fD\u0007d\u001fױ7\b\u001bȅqm}qNx\u0084p\\"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/BYG\u0004?i\u0018.8GFk;\"\u001ehAL\u0012c9R~'P[\\\u0002", "", "0tX9W,K", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/BYG\u0004?i\u0018.8GFk;\"\u001ehAL\u0012c9R~'P[\\j9bvD\u0013\u0012gc", "uKR<`u?O\u0017~wh6\u0003R3m{*{K\u0005\"\u0017Ns\u0017<@#?f}i\u001bu\u00120M.?v4%\u0019qa\u0019\u001an,[z/GU]:\u001b/\u0003A\u001b\u0011Z\u001b$n}", "/k[<j\u000b>Z\u0015\u0013", "", "5dc\u000e_3Hew~\u0002Z@", "u(I", "/k[<j\u0017K]\u001b\fzl:\u0001\u001a/O\t\u0013\t@\u0002\u0017&Er", "5dc\u000e_3He\u0004\f\u0005`9|\u0017=i\u0011(eIk$\u0017Ho\u001d:y", "/mX:T;B]\"kzg+|\u0016\u0010p\u000e\u000f\u007fH\u0005&", "", "5dc\u000ea0FO(\u0003\u0005g\u0019|\u0012.e\r\t\u0007Ng\u001b\u001fK~", "u(8", "0hc:T7)`\u0019\nvk,k\u0013\u000er{:\\J\u000e\u0002$Gp\u000eKt(", "5dc\u000f\\;FO$i\b^7x\u0016/T\n\u0007\t<\u0013w!TZ\u001b<w%DW\u0001", "0hc:T7)`\u0019\nvk,k\u0013\u000er{:c<\u0014\u0005\u001b\\ojP\u0006%C", "5dc\u000f\\;FO$i\b^7x\u0016/T\n\u0007\t<\u0013~\u0013Z]\u0012Qv\u0002Ih}.", "0hc:T7)`\u0019\nvk,k\u0013\u000er{:cD\n\u0005\u001b\\ojP\u0006%C", "5dc\u000f\\;FO$i\b^7x\u0016/T\n\u0007\t<\u0013~\u001bP]\u0012Qv\u0002Ih}.", "1`]0X3\u001dS\u0017\ty^\u0016\u0006f+c\u0003(cD\u000f%", "5dc\u0010T5<S ]z\\6{\t\u0019n]$yC\u0001~\u001bU}", "2nf;f(F^ ~^_\u0013x\u00161e\\,\u000bH|\"", "5dc\u0011b>Ga\u0015\u0007\u0006e,`\n\u0016a\r*{\u001d\u0005&\u001fCz", "2nf;f*:Z\u0019_\bZ4|w9D\r$\u000e<}\u001e\u0017&s\u0016<\u007f39c\u0007.", "5dc\u0011b>Ga\u0017z\u0002^\r\n\u00057en2ZM|)\u0013Dv\u000e\u001bz-5b\f$Av$", "6`]1B-?=\"n~M/\n\t+di1\u0003T", "5dc\u0015T5==\u001a\u007fdg\u001c\u0001w2r\u007f$z*\n\u001e+", "7r32V6=Svz\u0004\\,\u0004\u0010+t\u00042\u0005 \n\u0013\u0014No\r", "7r36f2\u001cO\u0017\u0002zI9\u0007\u00063n\u0002\b\u0005<}\u001e\u0017F", "7r4;V6=S\u0018\\v\\/|h8a|/{?", "7r4;V6=S\u0018fzf6\n\u001d\ra}+{+\u000e!\u0014Kx\u0010\u001c\u007f!2`}\u001f", "7r4;f<KS\b\fvg:z\u0013.e\r\u000f\u007f=\u000e\u0013$[V\u00188u%4", "7r4Ec,KW!~\u0004m(\u0004w2r\u007f$z#| \u0016Qp\u000f(\u0007%EY])3j\u001d.L", "7r66a.>`\u0016\fzZ+[\t-o~(\t \n\u0013\u0014No\r", "7r;.m@\u001dO(zhh<\n\u0007/", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\u0005 &G|\u00178}n#i\t+>q\u0016;#", "u(;0b4\bT\u0015|z[6\u0007\u000fxc\n0\u0004J\n`\u001bP~\u000eI\u007f!<#k0Bx\u001d2MP\u0011", "7r=.g0OSv\ty^\u000b\u0001\u0017+b\u0007(z", "7r?.e;BO b\u0003Z.|f+c\u0003,\u0005B` \u0013Dv\u000e;", "7rF2U7,c$\n\u0005k;\\\u0012+b\u0007(z", "9dT=6(GQ\u0019\u0006\u0002^+]\t>c\u0003\u0004\n'\u000b)\u0002Ts\u0018Iz4I", "5dc\u0018X,I1\u0015\bx^3\u0004\t.F\u007f7yC\\%}Q\u0002xIz/B]\r4", ";`g\u000f\\;FO$l~s,", "5dc\u001aT?\u001bW(\u0007vi\u001a\u0001\u001e/", ";d\\<e@-g$~", "", "5dc\u001aX4H`-m\u000fi,", "u(9", ">kPAY6K[w~xh+|\u0016\u0019p\u000f,\u0006I\u000f", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u0002,1h~*Du_\u0019T?Jl>+\u001dGa7\u0011b,[`2VPX5j(", "5dc\u001d_(MT#\f\u0003=,z\u0013.e\r\u0012\u0007O\u0005! U", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn@`y/8w#6\u0017.BgC\u001f\u001fui\u0018\u0007a6Mv41W]0f[\u0001\u0013", ">qT3X;<V\u0007\u0002\u0005k;z\u0019>E\t$xG\u0001\u0016", "5dc\u001de,?S(|}L/\u0007\u0016>c\u00107[I|\u0014\u001eGn", ">q^1h*>`yzxm6\n\u001d\u0017e\u000f+\u0006?", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/BYG\u0004?i\u0018.8GFk;\"\u001ehAL\u0012c9R~'P[\\jG_|<$\u0010Z\u001b/'\u000b\u0014cN8VDF\"\u0012+\u001f", "5dc\u001de6=c\u0017~\b?(z\u00189r\u0014\u0010{O\u0004!\u0016", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn3c\u000b \u0001Q\u001e*OC&o?\u001e\u001clj9fv7N\u0004+OLW;j\u0011]J\u001e\u0011j\fN8m\u0001WP.{X\u001f\u001f\u0017/S\u0001\u0011", "Ag^B_+\"U\"\t\b^\nx\u00072em,\u0011@h\u001b%Ok\u001d:y", "5dc [6NZ\u0018b|g6\n\t\ra}+{.\u0005,\u0017/s\u001cDr43\\", "Ag^B_+,b#\fz<(z\f/E\t7\tTn\u001b,G", "5dc [6NZ\u0018l\nh9|f+c\u0003([I\u0010$+5s#<", "Ag^B_+.a\u0019]z\\6{\r8g\\8|A\u0001$yGv\u0019<\u0004", "5dc [6NZ\u0018n\t^\u000b|\u00079d\u00041}\u001d\u0011\u0018\u0018G|p<}05f", "At_=e,Lau\u0003\nf(\bs<e\u0001(\u000b>\u0004\u001b I]\u001eG\u0002,9Y\u000b", "5dc h7I`\u0019\r\t;0\f\u0011+pj5{A\u0001&\u0015Js\u0017>d5@d\u0005$7z", "BqP0^,=9\u0019\u0013\tL0\u0012\t", "5dc!e(<Y\u0019}`^@\u000bv3z\u007f", "CrT\u000fT3:\\\u0017~y:5\u0001\u0011+t\u00042\u0005.\u0010$\u0013Vo\u0010P", "5dc\"f,\u001bO z\u0004\\,{d8i\b$\u000bD\u000b \u0005V|\nKv'I", "CrT\u000f\\;FO$i\b^7x\u0016/T\n\u0007\t<\u0013", "5dc\"f,\u001bW(\u0007vi\u0017\n\t:a\r(jJ_$\u0013Y", "CrT\u0011b>Ga\u0015\u0007\u0006e0\u0006\u000b\u001ca\u000f,\u0006!\u000b$\u0004G}\u0012Qz.7", "5dc\"f,\u001d]+\b\tZ4\b\u00103n\u0002\u0015wO\u0005!wQ|z<\u0005)J]\u0007\"", "EdQ=50M[\u0015\n[Z*\f\u0013<y", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\u0013\u0017\u0014R9\u007f<s0\u0012]\r(3xv*KRExHs", "5dc$X)I0\u001d\u000e\u0003Z7]\u0005-t\n5\u0010", "u(;0b4\bT\u0015|z[6\u0007\u000fxc\n0\u0004J\n`)Gl\u0019\u0006h%2dZ$Fu\u00129.?9z>+)>", "EdQ=89K]&e\u0005`.|\u0016", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\u0013\u0017\u0014R9\u007f<s0\u0012]\r(3xv*KRExH\\\u0007h^Dfp9X\u0004\u000eQNP,i(", "5dc$X)I3&\f\u0005k\u0013\u0007\u000b1e\r", "u(;0b4\bT\u0015|z[6\u0007\u000fxc\n0\u0004J\n`)Gl\u0019\u0006h%2dZ$Fu\u00129.?9z>+)'S9\u0004n\f[\u00041T3X.^R\u007f\u0013", "\u0010tX9W,K", "\u0011n\\=T5B]\"", "\u0012dU.h3M>&\tyn*|\u0016\u0010a}7\u0006M\u0015~\u0017Vr\u0018;", "\u001eq^1h*>`yzxm6\n\u001d\u0017e\u000f+\u0006?", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ImagePipelineExperiments {
    public static final Companion Companion = new Companion(null);
    private final boolean allowDelay;
    private final boolean allowProgressiveOnPrefetch;
    private final int animationRenderFpsLimit;
    private final boolean bitmapPrepareToDrawForPrefetch;
    private final int bitmapPrepareToDrawMaxSizeBytes;
    private final int bitmapPrepareToDrawMinSizeBytes;
    private final boolean cancelDecodeOnCacheMiss;
    private final boolean downsampleIfLargeBitmap;
    private final boolean downscaleFrameToDrawableDimensions;
    private final boolean handOffOnUiThreadOnly;
    private final boolean isDecodeCancellationEnabled;
    private final boolean isDiskCacheProbingEnabled;
    private final boolean isEncodedCacheEnabled;
    private final boolean isEncodedMemoryCacheProbingEnabled;
    private final boolean isEnsureTranscoderLibraryLoaded;
    private final boolean isExperimentalThreadHandoffQueueEnabled;
    private final boolean isGingerbreadDecoderEnabled;
    private final Supplier<Boolean> isLazyDataSource;
    private final boolean isNativeCodeDisabled;
    private final boolean isPartialImageCachingEnabled;
    private final boolean isWebpSupportEnabled;
    private final boolean keepCancelledFetchAsLowPriority;
    private final int maxBitmapSize;
    private final long memoryType;
    private final PlatformDecoderOptions platformDecoderOptions;
    private final boolean prefetchShortcutEnabled;
    private final ProducerFactoryMethod producerFactoryMethod;
    private final boolean shouldIgnoreCacheSizeMismatch;
    private final boolean shouldStoreCacheEntrySize;
    private final boolean shouldUseDecodingBufferHelper;
    private final Supplier<Boolean> suppressBitmapPrefetchingSupplier;
    private final int trackedKeysSize;
    private final boolean useBalancedAnimationStrategy;
    private final boolean useBitmapPrepareToDraw;
    private final boolean useDownsamplingRatioForResizing;
    private final WebpBitmapFactory webpBitmapFactory;
    private final WebpBitmapFactory.WebpErrorLogger webpErrorLogger;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Яd\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\":\u001b\u007f\u0007ljA0RkP.Xb2\u000f\u0002{<$a$yCI\\\"}(\tWN}gvJ`\u000bK\u000f\u001c\u0016\u0001j2Q]xs\u0012\u0017˰JoU3UoC:htL\u0005(208\u0002ڎ\t\u001a@H\u0018v\u0001iaÈB0noz]\u001dQ\u0013\u001a*\u0006l!Ә\"\\uP~\\z\u000fR/QɅ\u001aL\\Yw6\rO\u001dF\u0003[;*(\u001esDEj-%\u00029O^iv\u001b? ܵ5l5*CI\"[~d\u000eL-+}Օ\u000ev4a\u001dQ\u000f\u0010o7]\u001dcP<ߊ(~\n\u0013T\u0004<\roT<g2f6Ԅcx\u0001|XP0b\u000b$\t\u001dN\u0017SĮc/GE~Q\u0010?IRE8\u001d\rL*1r/\u0019l\u000e\u000f\u001cKX\u0006\u0010IQnA\u0011Z\u0018\u0019Um2͏\u0013\u00068\u000fHG.3D\u001d<W=7\nݽS%y\u000e`D\u0016zMlv\u0015\u0002RvؗRr$DB\t:^\rp\u0013.hT\u0007\u008cAQ*c\u001f}6\u0017hh\u0006\u007f9%>ʚ\u007flwze]8)wrE\u001e\u0007k<ãibAzic>}\u001b\u0003\"\u0006Tb3֚\u0017Fa\u001dr\\V&zTxW\u0010{r\u0088<\u0017@Q\n\u001cb0y%j]`\u0003LՓq\u0001\u0017rrh>\u0003\u001d?2L\u0002$#է1Tj\u0014\bg'Mt\tnlEA\u007fځI*c6\u00014+'O\u000b\u0002K_gz܁|p$\u000bm{N\u001abE_{U\u0013=ȯY6\u0010D]L!i\u001aa t\u0013|(Ҹkt<\u007f r\u0001.pjxSj\u0016P\u0010'~1V|\u007f(ӓv~U}l\u000b\nE\u0012~\u0011)TNfو5#,B\u0019oP\u0001}9Qw5\u0016&ҡ_\u0019o/\u0002o\\}+\u001b4G}\u0004ZϣFspou2iW\u0012e\r\u0012:$\u001b×rLx\u0018 B78UAV\u0016|p\u0005Е}\u0011=\u001f~\tB\f\u001fx$F!E\u00164\\ɾZwQ\f,^q)YYa>\u0006myŌ;N\u001d/#{_rZ(KwnW\u0011־`\n\u0002<NAifMN\u0017|L,jފ;Mb\u0010\u001e\u0016\u000b\u0002V_=\u001b`[<Gdglx\u000bƇx\tnmx!X\bG\u001bAx\u00115_܊\u001eJbZ{2/We\u0017)Fg~\u0015އ[Jbe3*n\u007f9r&QW^N\u0004uӣ\u001eq}:P\u001a\u0013\u001cpGcE_nwv^͜;Yr~|v@j\u001bR0N\u0017z+\u0012\r\u001a\u001d\u000e1O!s\u00191\u000bRṄOױ\u0005\u0017L͈W\u001c\u000bh^\u001b[\nk1{MA̧3ٖ[SCջX0.-\u001ctOc\u000e\u0012%\u000e4ͱFϦu\u0016jկY#^(\u001c.xx)\u000el\f\rЦ\u000eג\u0006\u0013f̏<\b/I?+\u001b\rxO'|`ɰx̼rU\u0013ӆ7Ad\u0004\u0007-~$?+\f2iͅfϳ\u0015S(ǅa\u0010\" >\u001fd\f\u0019-NS:ִ|քS[\u0015ċ\u007fw8aI0\u0001\u001fTΨ{Ȅ\b*\\ӏeKdYVd7`#F\u0016\u00125ȭ4̒x\f1حM\u000fVk)\u0013bJ)\"#3\u000eا+˝\u0011GhԂTUW491\u0001CQ;p\u000fFđ\u0003\u05ce\u0007:jߍP:P\u0018\u000b\u007f\u00160cJ\u0013Apţeޡqd\u000b\u0379\u001cUFR ,?\u0012G3\u0019<vڰhӭ ;Y߂\u0012)\u001f\u0012-84s=\u001dsn(Ƣ1ݜ\u0005|\t\u008d\u0010\n?}RsevY3Msqʸr֑)5m͗w\u001c\u0010xb~{g\r\u0013 0 ˇQɭ}UH\u0094Z/28\u001euQ\u0004{5\u0007.6ЏLҕwW\fڏzF|Y;G\u001b|*\u000ejmnĽpպe4Iʯd)RTB-\u001b\u000b{Q'}aޕ\u0019Ә\u00187\u0017ѨyC%\u0014(O DaM1Q\u0006۟iڍ\u0017s\f͡\u0003yD\u0012_Hi,\u0016-@Xyi\u0019\u0007\bcN<hԜ\u0019ՠ{1ZϒPp+2?K%Ml`7Q\u0018Ǜ\u0017ڝ\u0013$fܻ\u0013\u001c\u0019!..v38\u0002\tdkͽ?˝wAÖ'\f/:)[S\n[k)K\u0016ާ}ٌA9;َ>ZfS}\\3tWO#/kʀvݿ2G^Íj:f&&E\u0013LFH7H~Қ<߳4P\u0007ߠ\u0014o\u000f=7?k\u0014\u0014!hfu_;ɷ7Ů[nZдs=\u0007%\u001b\u0010o\u001dI\u000f\\W\u0010ޯ/Ѵ\u00111FϐXlWy\u0015mw\u00149e\t%\u0006ήKĪEKtɟ6O'|W~:$](D\u0017zߴsѸm\u000e*ΩSjD|AV[c!n`\u00127|\u000b\u000b\\\u0010fY4V<\u0015! \fīkޱ0.xĤ\u0018_x$Be\u001em+]\fI\u0002ܺ%҅5q\u0019ˮ o\"\u0018i\\\u0007BM[dDi˳&ݑ*a\u0004śy@%\u007f{m\u0019w\u000bdO]\u000bɑ<ټ}rnͣ\u000fsLg`lGj\u0006\u0002YU\u001bІ\u0015ɅtHIŖ3~:SNJ\u0001\u0018/.\u0002eU\u0018\u000eݶ\u0003ƛk3Bɉ24a\f=I`\u0005<\u001a\u0018{S\u007f4խBƊs,\u0005ϯUNt#\u001cl3Qf\b*3\tՓfޓ -b¨Ѥlf"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/BYG\u0004?i\u0018.8GFk;\"\u001ehAL\u0012c9R~'P[\\j9bvD\u0013\u0012gc", "", "1n]3\\.\u001bc\u001d\u0006y^9", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/BYG\u0004?i\u0018.8GFk;\"\u001eh?C\u0010d0P5\u0004WPU+\\_H", "uKR<`u?O\u0017~wh6\u0003R3m{*{K\u0005\"\u0017Ns\u0017<@#?f}i\u001bu\u00120M.?v4%\u0019qa\u0017\u0011l-Rxe$\\R3[R\u007f\u0013W\u0003", "/k[<j\u000b>Z\u0015\u0013", "", "/k[<j\u0017K]\u001b\fzl:\u0001\u001a/O\t\u0013\t@\u0002\u0017&Er", "/mX:T;B]\"kzg+|\u0016\u0010p\u000e\u000f\u007fH\u0005&", "", "0hc:T7)`\u0019\nvk,k\u0013\u000er{:\\J\u000e\u0002$Gp\u000eKt(", "0hc:T7)`\u0019\nvk,k\u0013\u000er{:c<\u0014\u0005\u001b\\ojP\u0006%C", "0hc:T7)`\u0019\nvk,k\u0013\u000er{:cD\n\u0005\u001b\\ojP\u0006%C", "1`]0X3\u001dS\u0017\ty^\u0016\u0006f+c\u0003(cD\u000f%", "2dR<W,\u001cO\"|ze3x\u00183o\t\b\u0005<}\u001e\u0017F", "2nf;f(F^ ~^_\u0013x\u00161e\\,\u000bH|\"", "2nf;f*:Z\u0019_\bZ4|w9D\r$\u000e<}\u001e\u0017&s\u0016<\u007f39c\u0007.", "3mR<W,=1\u0015|}^\f\u0006\u0005,l\u007f'", "3mbBe,-`\u0015\b\t\\6{\t<L\u0004%\t<\u000e+}Qk\r<u", "3w_2e0FS\"\u000eve\u001b\u007f\u0016/a~\u000bwI\u007f!\u0018H[\u001e<\u0007%\u0015by\u001d>m\u0015", "5h]4X9;`\u0019zy=,z\u0013.e\r\b\u0005<}\u001e\u0017F", "6`]1B-?=\"n~M/\n\t+di1\u0003T", "7r36f2\u001cO\u0017\u0002zI9\u0007\u00063n\u0002\b\u0005<}\u001e\u0017F", "7r4;V6=S\u0018fzf6\n\u001d\ra}+{+\u000e!\u0014Kx\u0010\u001c\u007f!2`}\u001f", "7r?.e;BO b\u0003Z.|f+c\u0003,\u0005B` \u0013Dv\u000e;", "9dT=6(GQ\u0019\u0006\u0002^+]\t>c\u0003\u0004\n'\u000b)\u0002Ts\u0018Iz4I", ":`iF7(MO\u0007\t\u000bk*|", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\u0005 &G|\u00178}n#i\t+>q\u0016;#", ";`g\u000f\\;FO$l~s,", ";d\\<e@-g$~", "", "<`c6i,\u001c]\u0018~Yb:x\u00066e~", ">kPAY6K[w~xh+|\u0016\u0019p\u000f,\u0006I\u000f", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u0002,1h~*Du_\u0019T?Jl>+\u001dGa7\u0011b,[`2VPX5j(", ">qT3X;<V\u0007\u0002\u0005k;z\u0019>E\t$xG\u0001\u0016", ">q^1h*>`yzxm6\n\u001d\u0017e\u000f+\u0006?", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/BYG\u0004?i\u0018.8GFk;\"\u001ehAL\u0012c9R~'P[\\jG_|<$\u0010Z\u001b/'\u000b\u0014cN8VDF\"\u0012+\u001f", "Ag^B_+\"U\"\t\b^\nx\u00072em,\u0011@h\u001b%Ok\u001d:y", "Ag^B_+,b#\fz<(z\f/E\t7\tTn\u001b,G", "Ag^B_+.a\u0019]z\\6{\r8g\\8|A\u0001$yGv\u0019<\u0004", "At_=e,Lau\u0003\nf(\bs<e\u0001(\u000b>\u0004\u001b I]\u001eG\u0002,9Y\u000b", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "BqP0^,=9\u0019\u0013\tL0\u0012\t", "CrT\u000fT3:\\\u0017~y:5\u0001\u0011+t\u00042\u0005.\u0010$\u0013Vo\u0010P", "CrT\u000f\\;FO$i\b^7x\u0016/T\n\u0007\t<\u0013", "CrT\u0011b>Ga\u0015\u0007\u0006e0\u0006\u000b\u001ca\u000f,\u0006!\u000b$\u0004G}\u0012Qz.7", "EdQ=50M[\u0015\n[Z*\f\u0013<y", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\u0013\u0017\u0014R9\u007f<s0\u0012]\r(3xv*KRExHs", "EdQ=89K]&e\u0005`.|\u0016", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\u0013\u0017\u0014R9\u007f<s0\u0012]\r(3xv*KRExH\\\u0007h^Dfp9X\u0004\u000eQNP,i(", "EdQ=F<I^#\f\n>5x\u00066e~", "/r1B\\3=S&", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "0tX9W", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/BYG\u0004?i\u0018.8GFk;\"\u001ehAL\u0012c9R~'P[\\\u0002", "Adc\u000e_3Hew~\u0002Z@", "Adc\u000e_3He\u0004\f\u0005`9|\u0017=i\u0011(eIk$\u0017Ho\u001d:y", "Adc\u000ea0FO(\u0003\u0005g\u0019|\u0012.e\r\t\u0007Ng\u001b\u001fK~", "Adc\u000fT3:\\\u0017~y:5\u0001\u0011+t\u00042\u0005.\u0010$\u0013Vo\u0010P", "Adc\u000f\\;FO$i\b^7x\u0016/T\n\u0007\t<\u0013", ";h]\u000f\\;FO$l~s,Y\u001d>e\u000e", ";`g\u000f\\;FO$l~s,Y\u001d>e\u000e", ">qT=T9>>&~{^;z\f", "Adc\u0010T5<S ]z\\6{\t\u0019n]$yC\u0001~\u001bU}", "Adc\u0011X*HR\u0019\\vg*|\u00106a\u000f,\u0006I` \u0013Dv\u000e;", "Adc\u0011b>Ga\u0015\u0007\u0006e,`\n\u0016a\r*{\u001d\u0005&\u001fCz", "Adc\u0012a*HR\u0019}XZ*\u007f\t\u000fn{%\u0003@\u007f", "Adc\u0012a:N`\u0019m\bZ5\u000b\u00079d\u007f5bD}$\u0013T\u0004tFr$5X", "Adc\u0012k7>`\u001d\u0007zg;x\u0010\u0017e\b2\tTo+\"G", "\u001bd\\<e@-g$~", "Adc\u0012k7>`\u001d\u0007zg;x\u0010\u001eh\r(w?c\u0013 Fy\u000f=b55i}\u007f@i\u00135MB", "Adc\u0014\\5@S&{\b^({g/c\n'{M` \u0013Dv\u000e;", "Adc\u0015T5==\u001a\u007fdg\u001c\u0001w2r\u007f$z*\n\u001e+", "Adc\u0016Z5H`\u0019\\v\\/|v3z\u007f\u0010\u007fN\t\u0013&Er", "Adc\u0016f\u000bBa\u001f\\v\\/|s<o|,\u0005B` \u0013Dv\u000e;", "Adc\u0016f\fGQ#}z]\u0014|\u00119r\u0014\u0006w>\u0004\u0017\u0002Ty\u000b@\u007f'\u0015by\u001d>m\u0015", "Adc\u0018X,I1\u0015\bx^3\u0004\t.F\u007f7yC\\%}Q\u0002xIz/B]\r4", "Adc\u0019TAR2\u0015\u000evL6\r\u0016-e", "Adc\u001aT?\u001bW(\u0007vi\u001a\u0001\u001e/", "Adc\u001bT;Bd\u0019\\\u0005],[\r=a|/{?", "Adc\u001dT9MW\u0015\u0006^f(~\t\ra}+\u007fI\u0003v Cl\u0015<u", ">`aA\\(E7!z|^\nx\u00072i\t*[I|\u0014\u001eGn", "Adc\u001d_(MT#\f\u0003=,z\u0013.e\r\u0012\u0007O\u0005! U", "Adc\u001de,?S(|}L/\u0007\u0016>c\u00107[I|\u0014\u001eGn", "Adc\u001de6=c\u0017~\b?(z\u00189r\u0014\u0010{O\u0004!\u0016", "Adc [6NZ\u0018]\u0005p5\u000b\u0007+l\u007f\t\t<\t\u0017\u0006QN\u001b8\t!2`}~;u\u00167[GEtB", "Adc [6NZ\u0018n\t^\u000b|\u00079d\u00041}\u001d\u0011\u0018\u0018G|p<}05f", "Adc g6KSvzxa,\\\u0012>r\u0014\u0016\u007fU\u0001", "Adc h7I`\u0019\r\t;0\f\u0011+pj5{A\u0001&\u0015Js\u0017>d5@d\u0005$7z", "Adc!e(<Y\u0019}`^@\u000bv3z\u007f", "Adc\"f,\u001d]+\b\tZ4\b\u00103gl$\u000bD\u000bw!T\\\u000eJz:9b\u007f", "Adc$X)I0\u001d\u000e\u0003Z7]\u0005-t\n5\u0010", "Adc$X)I3&\f\u0005k\u0013\u0007\u000b1e\r", "Adc$X)IA)\n\u0006h9\fh8a|/{?", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Builder {
        public boolean allowDelay;
        public boolean allowProgressiveOnPrefetch;
        public int animationRenderFpsLimit;
        public boolean bitmapPrepareToDrawForPrefetch;
        public int bitmapPrepareToDrawMaxSizeBytes;
        public int bitmapPrepareToDrawMinSizeBytes;
        public boolean cancelDecodeOnCacheMiss;
        private final ImagePipelineConfig.Builder configBuilder;
        public boolean decodeCancellationEnabled;
        public boolean downsampleIfLargeBitmap;
        public boolean downscaleFrameToDrawableDimensions;
        public boolean encodedCacheEnabled;
        public boolean ensureTranscoderLibraryLoaded;
        public boolean experimentalThreadHandoffQueueEnabled;
        public boolean gingerbreadDecoderEnabled;
        public boolean handOffOnUiThreadOnly;
        public boolean isDiskCacheProbingEnabled;
        public boolean isEncodedMemoryCacheProbingEnabled;
        public boolean isPartialImageCachingEnabled;
        public boolean keepCancelledFetchAsLowPriority;
        public Supplier<Boolean> lazyDataSource;
        public int maxBitmapSize;
        public long memoryType;
        public boolean nativeCodeDisabled;
        public PlatformDecoderOptions platformDecoderOptions;
        public boolean prefetchShortcutEnabled;
        public ProducerFactoryMethod producerFactoryMethod;
        public boolean shouldIgnoreCacheSizeMismatch;
        public boolean shouldStoreCacheEntrySize;
        public boolean shouldUseDecodingBufferHelper;
        public Supplier<Boolean> suppressBitmapPrefetchingSupplier;
        public int trackedKeysSize;
        public boolean useBalancedAnimationStrategy;
        public boolean useBitmapPrepareToDraw;
        public boolean useDownsamplingRatioForResizing;
        public WebpBitmapFactory webpBitmapFactory;
        public WebpBitmapFactory.WebpErrorLogger webpErrorLogger;
        public boolean webpSupportEnabled;

        public Builder(ImagePipelineConfig.Builder configBuilder) {
            Intrinsics.checkNotNullParameter(configBuilder, "configBuilder");
            this.configBuilder = configBuilder;
            this.maxBitmapSize = 2048;
            Supplier<Boolean> supplierOf = Suppliers.of(false);
            Intrinsics.checkNotNullExpressionValue(supplierOf, "of(false)");
            this.suppressBitmapPrefetchingSupplier = supplierOf;
            this.encodedCacheEnabled = true;
            this.ensureTranscoderLibraryLoaded = true;
            this.trackedKeysSize = 20;
            this.animationRenderFpsLimit = 30;
            this.platformDecoderOptions = new PlatformDecoderOptions(false, false, 3, null);
        }

        private final Builder asBuilder(Function0<Unit> function0) {
            function0.invoke();
            return this;
        }

        public final ImagePipelineExperiments build() {
            return new ImagePipelineExperiments(this, null);
        }

        public final Builder setAllowDelay(final boolean z2) {
            return asBuilder(new Function0<Unit>() { // from class: com.facebook.imagepipeline.core.ImagePipelineExperiments$Builder$setAllowDelay$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.allowDelay = z2;
                }
            });
        }

        public final Builder setAllowProgressiveOnPrefetch(final boolean z2) {
            return asBuilder(new Function0<Unit>() { // from class: com.facebook.imagepipeline.core.ImagePipelineExperiments$Builder$setAllowProgressiveOnPrefetch$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.allowProgressiveOnPrefetch = z2;
                }
            });
        }

        public final Builder setAnimationRenderFpsLimit(final int i2) {
            return asBuilder(new Function0<Unit>() { // from class: com.facebook.imagepipeline.core.ImagePipelineExperiments$Builder$setAnimationRenderFpsLimit$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.animationRenderFpsLimit = i2;
                }
            });
        }

        public final Builder setBalancedAnimationStrategy(final boolean z2) {
            return asBuilder(new Function0<Unit>() { // from class: com.facebook.imagepipeline.core.ImagePipelineExperiments$Builder$setBalancedAnimationStrategy$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.useBalancedAnimationStrategy = z2;
                }
            });
        }

        public final Builder setBitmapPrepareToDraw(final boolean z2, final int i2, final int i3, final boolean z3) {
            return asBuilder(new Function0<Unit>() { // from class: com.facebook.imagepipeline.core.ImagePipelineExperiments$Builder$setBitmapPrepareToDraw$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.useBitmapPrepareToDraw = z2;
                    this.this$0.bitmapPrepareToDrawMinSizeBytes = i2;
                    this.this$0.bitmapPrepareToDrawMaxSizeBytes = i3;
                    this.this$0.bitmapPrepareToDrawForPrefetch = z3;
                }
            });
        }

        public final Builder setCancelDecodeOnCacheMiss(final boolean z2) {
            return asBuilder(new Function0<Unit>() { // from class: com.facebook.imagepipeline.core.ImagePipelineExperiments$Builder$setCancelDecodeOnCacheMiss$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.cancelDecodeOnCacheMiss = z2;
                }
            });
        }

        public final Builder setDecodeCancellationEnabled(final boolean z2) {
            return asBuilder(new Function0<Unit>() { // from class: com.facebook.imagepipeline.core.ImagePipelineExperiments$Builder$setDecodeCancellationEnabled$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.decodeCancellationEnabled = z2;
                }
            });
        }

        public final Builder setDownsampleIfLargeBitmap(final boolean z2) {
            return asBuilder(new Function0<Unit>() { // from class: com.facebook.imagepipeline.core.ImagePipelineExperiments$Builder$setDownsampleIfLargeBitmap$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.downsampleIfLargeBitmap = z2;
                }
            });
        }

        public final Builder setEncodedCacheEnabled(final boolean z2) {
            return asBuilder(new Function0<Unit>() { // from class: com.facebook.imagepipeline.core.ImagePipelineExperiments$Builder$setEncodedCacheEnabled$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.encodedCacheEnabled = z2;
                }
            });
        }

        public final Builder setEnsureTranscoderLibraryLoaded(final boolean z2) {
            return asBuilder(new Function0<Unit>() { // from class: com.facebook.imagepipeline.core.ImagePipelineExperiments$Builder$setEnsureTranscoderLibraryLoaded$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.ensureTranscoderLibraryLoaded = z2;
                }
            });
        }

        public final Builder setExperimentalMemoryType(final long j2) {
            return asBuilder(new Function0<Unit>() { // from class: com.facebook.imagepipeline.core.ImagePipelineExperiments$Builder$setExperimentalMemoryType$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.memoryType = j2;
                }
            });
        }

        public final Builder setExperimentalThreadHandoffQueueEnabled(final boolean z2) {
            return asBuilder(new Function0<Unit>() { // from class: com.facebook.imagepipeline.core.ImagePipelineExperiments$Builder$setExperimentalThreadHandoffQueueEnabled$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.experimentalThreadHandoffQueueEnabled = z2;
                }
            });
        }

        public final Builder setGingerbreadDecoderEnabled(final boolean z2) {
            return asBuilder(new Function0<Unit>() { // from class: com.facebook.imagepipeline.core.ImagePipelineExperiments$Builder$setGingerbreadDecoderEnabled$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.gingerbreadDecoderEnabled = z2;
                }
            });
        }

        public final Builder setHandOffOnUiThreadOnly(final boolean z2) {
            return asBuilder(new Function0<Unit>() { // from class: com.facebook.imagepipeline.core.ImagePipelineExperiments$Builder$setHandOffOnUiThreadOnly$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.handOffOnUiThreadOnly = z2;
                }
            });
        }

        public final Builder setIgnoreCacheSizeMismatch(final boolean z2) {
            return asBuilder(new Function0<Unit>() { // from class: com.facebook.imagepipeline.core.ImagePipelineExperiments$Builder$setIgnoreCacheSizeMismatch$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.shouldIgnoreCacheSizeMismatch = z2;
                }
            });
        }

        public final Builder setIsDiskCacheProbingEnabled(final boolean z2) {
            return asBuilder(new Function0<Unit>() { // from class: com.facebook.imagepipeline.core.ImagePipelineExperiments$Builder$setIsDiskCacheProbingEnabled$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.isDiskCacheProbingEnabled = z2;
                }
            });
        }

        public final Builder setIsEncodedMemoryCacheProbingEnabled(final boolean z2) {
            return asBuilder(new Function0<Unit>() { // from class: com.facebook.imagepipeline.core.ImagePipelineExperiments$Builder$setIsEncodedMemoryCacheProbingEnabled$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.isEncodedMemoryCacheProbingEnabled = z2;
                }
            });
        }

        public final Builder setKeepCancelledFetchAsLowPriority(final boolean z2) {
            return asBuilder(new Function0<Unit>() { // from class: com.facebook.imagepipeline.core.ImagePipelineExperiments$Builder$setKeepCancelledFetchAsLowPriority$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.keepCancelledFetchAsLowPriority = z2;
                }
            });
        }

        public final Builder setLazyDataSource(final Supplier<Boolean> supplier) {
            return asBuilder(new Function0<Unit>() { // from class: com.facebook.imagepipeline.core.ImagePipelineExperiments$Builder$setLazyDataSource$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.lazyDataSource = supplier;
                }
            });
        }

        public final Builder setMaxBitmapSize(final int i2) {
            return asBuilder(new Function0<Unit>() { // from class: com.facebook.imagepipeline.core.ImagePipelineExperiments$Builder$setMaxBitmapSize$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.maxBitmapSize = i2;
                }
            });
        }

        public final Builder setNativeCodeDisabled(final boolean z2) {
            return asBuilder(new Function0<Unit>() { // from class: com.facebook.imagepipeline.core.ImagePipelineExperiments$Builder$setNativeCodeDisabled$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.nativeCodeDisabled = z2;
                }
            });
        }

        public final Builder setPartialImageCachingEnabled(final boolean z2) {
            return asBuilder(new Function0<Unit>() { // from class: com.facebook.imagepipeline.core.ImagePipelineExperiments$Builder$setPartialImageCachingEnabled$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.isPartialImageCachingEnabled = z2;
                }
            });
        }

        public final Builder setPlatformDecoderOptions(final PlatformDecoderOptions platformDecoderOptions) {
            Intrinsics.checkNotNullParameter(platformDecoderOptions, "platformDecoderOptions");
            return asBuilder(new Function0<Unit>() { // from class: com.facebook.imagepipeline.core.ImagePipelineExperiments$Builder$setPlatformDecoderOptions$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.platformDecoderOptions = platformDecoderOptions;
                }
            });
        }

        public final Builder setPrefetchShortcutEnabled(final boolean z2) {
            return asBuilder(new Function0<Unit>() { // from class: com.facebook.imagepipeline.core.ImagePipelineExperiments$Builder$setPrefetchShortcutEnabled$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.prefetchShortcutEnabled = z2;
                }
            });
        }

        public final Builder setProducerFactoryMethod(final ProducerFactoryMethod producerFactoryMethod) {
            return asBuilder(new Function0<Unit>() { // from class: com.facebook.imagepipeline.core.ImagePipelineExperiments$Builder$setProducerFactoryMethod$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.producerFactoryMethod = producerFactoryMethod;
                }
            });
        }

        public final Builder setShouldDownscaleFrameToDrawableDimensions(final boolean z2) {
            return asBuilder(new Function0<Unit>() { // from class: com.facebook.imagepipeline.core.ImagePipelineExperiments$Builder$setShouldDownscaleFrameToDrawableDimensions$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.downscaleFrameToDrawableDimensions = z2;
                }
            });
        }

        public final Builder setShouldUseDecodingBufferHelper(final boolean z2) {
            return asBuilder(new Function0<Unit>() { // from class: com.facebook.imagepipeline.core.ImagePipelineExperiments$Builder$setShouldUseDecodingBufferHelper$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.shouldUseDecodingBufferHelper = z2;
                }
            });
        }

        public final Builder setStoreCacheEntrySize(final boolean z2) {
            return asBuilder(new Function0<Unit>() { // from class: com.facebook.imagepipeline.core.ImagePipelineExperiments$Builder$setStoreCacheEntrySize$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.shouldStoreCacheEntrySize = z2;
                }
            });
        }

        public final Builder setSuppressBitmapPrefetchingSupplier(final Supplier<Boolean> suppressBitmapPrefetchingSupplier) {
            Intrinsics.checkNotNullParameter(suppressBitmapPrefetchingSupplier, "suppressBitmapPrefetchingSupplier");
            return asBuilder(new Function0<Unit>() { // from class: com.facebook.imagepipeline.core.ImagePipelineExperiments$Builder$setSuppressBitmapPrefetchingSupplier$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.suppressBitmapPrefetchingSupplier = suppressBitmapPrefetchingSupplier;
                }
            });
        }

        public final Builder setTrackedKeysSize(final int i2) {
            return asBuilder(new Function0<Unit>() { // from class: com.facebook.imagepipeline.core.ImagePipelineExperiments$Builder$setTrackedKeysSize$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.trackedKeysSize = i2;
                }
            });
        }

        public final Builder setUseDownsampligRatioForResizing(final boolean z2) {
            return asBuilder(new Function0<Unit>() { // from class: com.facebook.imagepipeline.core.ImagePipelineExperiments$Builder$setUseDownsampligRatioForResizing$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.useDownsamplingRatioForResizing = z2;
                }
            });
        }

        public final Builder setWebpBitmapFactory(final WebpBitmapFactory webpBitmapFactory) {
            return asBuilder(new Function0<Unit>() { // from class: com.facebook.imagepipeline.core.ImagePipelineExperiments$Builder$setWebpBitmapFactory$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.webpBitmapFactory = webpBitmapFactory;
                }
            });
        }

        public final Builder setWebpErrorLogger(final WebpBitmapFactory.WebpErrorLogger webpErrorLogger) {
            return asBuilder(new Function0<Unit>() { // from class: com.facebook.imagepipeline.core.ImagePipelineExperiments$Builder$setWebpErrorLogger$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.webpErrorLogger = webpErrorLogger;
                }
            });
        }

        public final Builder setWebpSupportEnabled(final boolean z2) {
            return asBuilder(new Function0<Unit>() { // from class: com.facebook.imagepipeline.core.ImagePipelineExperiments$Builder$setWebpSupportEnabled$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.webpSupportEnabled = z2;
                }
            });
        }

        public final boolean shouldUseDecodingBufferHelper() {
            return this.shouldUseDecodingBufferHelper;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјlʘ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$:QIV2}P\u000b\u007fRuj\u0007J\t\u000f\n\u0014َ\u001a}"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/BYG\u0004?i\u0018.8GFk;\"\u001ehAL\u0012c9R~'P[\\j:\\zH\u0010\u001b^\u0018W\u0001", "", "u(E", "<df\u000fh0ER\u0019\f", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/BYG\u0004?i\u0018.8GFk;\"\u001ehAL\u0012c9R~'P[\\j9bvD\u0013\u0012gc", "1n]3\\.\u001bc\u001d\u0006y^9", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/BYG\u0004?i\u0018.8GFk;\"\u001eh?C\u0010d0P5\u0004WPU+\\_H", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final Builder newBuilder(ImagePipelineConfig.Builder configBuilder) {
            Intrinsics.checkNotNullParameter(configBuilder, "configBuilder");
            return new Builder(configBuilder);
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Яē\u0014D57\u001eq\u007fZDkt\nA\u000e0!.Jչ*,(w\u000f߿r9FDm߉6Ri*\u0017ӆ\u00044:[,ڎK;k\u001a\u0006̝\u0011O\\ponPZ\u0013C%\u0006\u001eюr,_U\u0001ز\u001a\u000fHBwЀ;M\u0006=A`\u000b6\r H\"@ц\r\u00010*PƵ~zYK\u0014\u00126@x:`/U\u0005(\u001e\u000ē(\u00014\\oޮ>H\u0003]Bǂ+\u0003wHV'e2\u0005M#F\\'\u0013wwӜ[@e4U(٨\u0007\u0007`[\bǘ>\u007f>\u001dhU)[M\u0002ZNX.\u0018E/]\u0012urTb5Un\u0013?+}k{T\u001c1\u0010z*\u0017l\b\u001c\u0011?H\\9Jj\u0016\u001bKt!apT\u0010mZ\u007f)of\u001b3\u0010K+g,\u0017UoM1Ne\u000f5\u0011,7\u0019nOp\u0005\"n+3d\bUASV<vf\u001a]Mo\u001ao\u0011\u001bX\u001b`[\u000eI\u0014!>\u001b59q8Q9{\u0006XF}u3{\u0017j\u001aVV\\:nDTZ\r\u001ax\\d3\t\u0001ffK)[,V\u0017}640^\b<OB&M}\t\u001an[\u007f\"%]\ng]|\u0010&Wg\u0004c9_\n(a\u0001\u001eDCJ\u000b\u001dX\u0015i\u0004\u0010h\u0006@\"`V\u001b\u0014\u0006&\\N::bC\u007fGL,_E\r\u0019V06Bo\u000b9ch\u0017(~\u0003Zj\u0017Ȗ($"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/BYG\u0004?i\u0018.8GFk;\"\u001ehAL\u0012c9R~'P[\\j;Rs9$\u0019ix[5\f\u0015WA1O@5.\u00129]i;w\u0004\u0016\u0015c", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/BYG\u0004?i\u0018.8GFk;\"\u001ehAL\u0012c9R~'P[\\jG_|<$\u0010Z\u001b/'\u000b\u0014cN8VDF\"\u0012+\u001f", "u(E", "1qT.g,)`#}\u000b\\,\ni+c\u000f2\tT", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/BYG\u000bDw\u0015>KCHL0\u001c$rnM\\", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "0xc249KO-i\u0005h3", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\t\u0017\u001fQ|\"\u0006S9DYY-Di*\u0019WMBA", "7lP4X\u000b>Q#}zk", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006u%3c| D7y6IE;J4\u001c\u001fgaF\\", ">q^4e,La\u001d\u0010zC7|\u000b\ro\t)\u007fB", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006u%3c| D7\u0001;WEHkB,\u0019ya\u001e\u0012c.,\u00010HPP\u0002", "2nf;f(F^ ~bh+|", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/BYG~A\u007f\u001f<IKFr4\u0006\u001fga\u000f", "@db6m,\u001a\\\u0018k\u0005m(\f\t\u000fn{%\u0003@\u007fw!TX\u000eK\t/B_", "", "2dR<W,\u001cO\"|ze3x\u00183o\t\b\u0005<}\u001e\u0017F", "3wT0h;H`\u0007\u000f\u0006i3\u0001\t<", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/BYG\u007fJm\u0014>\\MHYD) oe9\u00149", ">n^9X+\u001bg(~Wn-}\t<F{&\u000bJ\u000e+", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\t\u0017\u001fQ|\"\u0006a/?`}\u001f\u0014\u0002%.*S<l4+ud_H\u0011p@$", ">n^9X+\u001bg(~hm9|\u00057s", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\t\u0017\u001fQ|\"\u0006a/?`}\u001f\u0014\u0002%.;RHk0&#>", "0hc:T7&S!\t\br\nx\u00072e", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t!3\\}i\u001fm\u001e8ZW\u0019g2!\u0015>", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0007+c\u0003(E>\u000b\u001f\u001fQxW\u001ar#8Yc KC", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006z-1[}i\u0015t <M?8r4\u0002\u001ddc9\\", "3mR<W,=;\u0019\u0007\u0005k@Z\u0005-h\u007f", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\t\u0017\u001fQ|\"\u0006a/?`}\u001f\u0014\u0002%.*S<l4+j", "2dU.h3M0)\u007f{^9|\b\u000ei\u000e.Y<~\u001a\u0017", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t!3\\}i\u0014}\u0017/MP;j\u0013\"#n?5\u0005f,$", "AlP9_\u0010FO\u001b~Wn-}\t<e~\u0007\u007fN\u0007t\u0013Er\u000e", "2x].`0<0)\u007f{^9|\b\u000ei\u000e.Y<~\u001a\u0017U", "", "", "1`R5X\u0012>gyzxm6\n\u001d", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t!3\\}i\u0015i\u00141M);\u007f\u0015\u001a\u0013wkF\u001b9", ">kPAY6K[u\u0003\nf(\bi+c\u000f2\tT", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006s)Day+E7\u00015IR<uA&qlpA\u0003n\rJt6QYb\u0002", "0hc:T7)`\u0019\nvk,k\u0013\u000er{:cD\n\u0005\u001b\\ojP\u0006%C", "", "0hc:T7)`\u0019\nvk,k\u0013\u000er{:c<\u0014\u0005\u001b\\ojP\u0006%C", "0hc:T7)`\u0019\nvk,k\u0013\u000er{:\\J\u000e\u0002$Gp\u000eKt(", ";`g\u000f\\;FO$l~s,", "1k^@X(;Z\u0019kz_,\n\t8c\u007f\tw>\u0010!$[", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/BYG}>w$.I@Bk!\u001e\u0016hn9\u0010a,/r%VV[@2", "9dT=6(GQ\u0019\u0006\u0002^+]\t>c\u0003\u0004\n'\u000b)\u0002Ts\u0018Iz4I", "BqP0^,=9\u0019\u0013\tL0\u0012\t", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class DefaultProducerFactoryMethod implements ProducerFactoryMethod {
        @Override // com.facebook.imagepipeline.core.ImagePipelineExperiments.ProducerFactoryMethod
        public ProducerFactory createProducerFactory(Context context, ByteArrayPool byteArrayPool, ImageDecoder imageDecoder, ProgressiveJpegConfig progressiveJpegConfig, DownsampleMode downsampleMode, boolean z2, boolean z3, ExecutorSupplier executorSupplier, PooledByteBufferFactory pooledByteBufferFactory, PooledByteStreams pooledByteStreams, MemoryCache<CacheKey, CloseableImage> bitmapMemoryCache, MemoryCache<CacheKey, PooledByteBuffer> encodedMemoryCache, BufferedDiskCache defaultBufferedDiskCache, BufferedDiskCache smallImageBufferedDiskCache, Map<String, BufferedDiskCache> map, CacheKeyFactory cacheKeyFactory, PlatformBitmapFactory platformBitmapFactory, int i2, int i3, boolean z4, int i4, CloseableReferenceFactory closeableReferenceFactory, boolean z5, int i5) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(byteArrayPool, "byteArrayPool");
            Intrinsics.checkNotNullParameter(imageDecoder, "imageDecoder");
            Intrinsics.checkNotNullParameter(progressiveJpegConfig, "progressiveJpegConfig");
            Intrinsics.checkNotNullParameter(downsampleMode, "downsampleMode");
            Intrinsics.checkNotNullParameter(executorSupplier, "executorSupplier");
            Intrinsics.checkNotNullParameter(pooledByteBufferFactory, "pooledByteBufferFactory");
            Intrinsics.checkNotNullParameter(pooledByteStreams, "pooledByteStreams");
            Intrinsics.checkNotNullParameter(bitmapMemoryCache, "bitmapMemoryCache");
            Intrinsics.checkNotNullParameter(encodedMemoryCache, "encodedMemoryCache");
            Intrinsics.checkNotNullParameter(defaultBufferedDiskCache, "defaultBufferedDiskCache");
            Intrinsics.checkNotNullParameter(smallImageBufferedDiskCache, "smallImageBufferedDiskCache");
            Intrinsics.checkNotNullParameter(cacheKeyFactory, "cacheKeyFactory");
            Intrinsics.checkNotNullParameter(platformBitmapFactory, "platformBitmapFactory");
            Intrinsics.checkNotNullParameter(closeableReferenceFactory, "closeableReferenceFactory");
            return new ProducerFactory(context, byteArrayPool, imageDecoder, progressiveJpegConfig, downsampleMode, z2, z3, executorSupplier, pooledByteBufferFactory, bitmapMemoryCache, encodedMemoryCache, defaultBufferedDiskCache, smallImageBufferedDiskCache, map, cacheKeyFactory, platformBitmapFactory, i2, i3, z4, i4, closeableReferenceFactory, z5, i5);
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Яđ\u0014D57\u001eq\u007fR܀kŞ\fA\u001c0\u0013ǞJ~8,\u001aՄ\u000ff\u000198ǏmHDR[ճ\u0017k\u00124,Ӌ,qY;]ڼ\u0006\"\u0017XVgmnRZ!C\u0017إ\u001ex\u0001,Qǁ\u0001](\u000f:ԏw?IMw=O`|6\u001b :Ĳ@y\u001b\u0001\"ݒP\u0010\rzKK\u0012\u00128@~\\Z\r[\u0011\"Ň\u000e>6\u0001&ձoNLHtҗB/1\tqBT)g0\u0013M\u0015FZ(\u0013[wӜ[@e4]ɣR\u0011\u0007j[m\u0004ouK\u0007\u0001'U.ywe:p\u007fB\u001a[S\u001bc\u000b&\u000b\f\u0002d\u001a/CO\u0012T\u0001\u00126\u0002\u0013{;G4\u0012\u00143`.['\u0017\f\u001cA\rr\u0002M\u0001\u0006lQ\u0018z\u0010FG)\u000eDC9Ix\u0002eI,f7*\u0019=21\u0016\u00071kX\u001eb+\u001a\u0003\u000fa5aBSG|\"\bS\u001e\u0018~{\u001a:\u00144W\u0002Ez?E')G]O\"O\u00060^tk\u0005 xh\u0002\u0006\u0003LN?\u0007\u0016eF9\u001ehb|\u0013{RdXZ1]\u001ed\u0007,$)\u001f\u000b\u0017l%31fO\u0017\f\u001bQk-=/\u0015[\nry3o9\rYeUq7yR%:o@p-pfp`<^jQ:2v\u0011@{\nnf\fA]ou*`D1GiEL\u0011KZA+/&~ӹ\u0014-"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/BYG\u0004?i\u0018.8GFk;\"\u001ehAL\u0012c9R~'P[\\jG_|<$\u0010Z\u001b/'\u000b\u0014cN8VDF\"\u0012+\u001f", "", "1qT.g,)`#}\u000b\\,\ni+c\u000f2\tT", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/BYG\u000bDw\u0015>KCHL0\u001c$rnM\\", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "0xc249KO-i\u0005h3", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\t\u0017\u001fQ|\"\u0006S9DYY-Di*\u0019WMBA", "7lP4X\u000b>Q#}zk", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006u%3c| D7y6IE;J4\u001c\u001fgaF\\", ">q^4e,La\u001d\u0010zC7|\u000b\ro\t)\u007fB", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006u%3c| D7\u0001;WEHkB,\u0019ya\u001e\u0012c.,\u00010HPP\u0002", "2nf;f(F^ ~bh+|", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/BYG~A\u007f\u001f<IKFr4\u0006\u001fga\u000f", "@db6m,\u001a\\\u0018k\u0005m(\f\t\u000fn{%\u0003@\u007fw!TX\u000eK\t/B_", "", "2dR<W,\u001cO\"|ze3x\u00183o\t\b\u0005<}\u001e\u0017F", "3wT0h;H`\u0007\u000f\u0006i3\u0001\t<", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/BYG\u007fJm\u0014>\\MHYD) oe9\u00149", ">n^9X+\u001bg(~Wn-}\t<F{&\u000bJ\u000e+", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\t\u0017\u001fQ|\"\u0006a/?`}\u001f\u0014\u0002%.*S<l4+ud_H\u0011p@$", ">n^9X+\u001bg(~hm9|\u00057s", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\t\u0017\u001fQ|\"\u0006a/?`}\u001f\u0014\u0002%.;RHk0&#>", "0hc:T7&S!\t\br\nx\u00072e", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t!3\\}i\u001fm\u001e8ZW\u0019g2!\u0015>", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0007+c\u0003(E>\u000b\u001f\u001fQxW\u001ar#8Yc KC", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006z-1[}i\u0015t <M?8r4\u0002\u001ddc9\\", "3mR<W,=;\u0019\u0007\u0005k@Z\u0005-h\u007f", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\t\u0017\u001fQ|\"\u0006a/?`}\u001f\u0014\u0002%.*S<l4+j", "2dU.h3M0)\u007f{^9|\b\u000ei\u000e.Y<~\u001a\u0017", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t!3\\}i\u0014}\u0017/MP;j\u0013\"#n?5\u0005f,$", "AlP9_\u0010FO\u001b~Wn-}\t<e~\u0007\u007fN\u0007t\u0013Er\u000e", "2x].`0<0)\u007f{^9|\b\u000ei\u000e.Y<~\u001a\u0017U", "", "", "1`R5X\u0012>gyzxm6\n\u001d", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t!3\\}i\u0015i\u00141M);\u007f\u0015\u001a\u0013wkF\u001b9", ">kPAY6K[u\u0003\nf(\bi+c\u000f2\tT", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006s)Day+E7\u00015IR<uA&qlpA\u0003n\rJt6QYb\u0002", "0hc:T7)`\u0019\nvk,k\u0013\u000er{:cD\n\u0005\u001b\\ojP\u0006%C", "", "0hc:T7)`\u0019\nvk,k\u0013\u000er{:c<\u0014\u0005\u001b\\ojP\u0006%C", "0hc:T7)`\u0019\nvk,k\u0013\u000er{:\\J\u000e\u0002$Gp\u000eKt(", ";`g\u000f\\;FO$l~s,", "1k^@X(;Z\u0019kz_,\n\t8c\u007f\tw>\u0010!$[", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/BYG}>w$.I@Bk!\u001e\u0016hn9\u0010a,/r%VV[@2", "9dT=6(GQ\u0019\u0006\u0002^+]\t>c\u0003\u0004\n'\u000b)\u0002Ts\u0018Iz4I", "BqP0^,=9\u0019\u0013\tL0\u0012\t", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public interface ProducerFactoryMethod {
        ProducerFactory createProducerFactory(Context context, ByteArrayPool byteArrayPool, ImageDecoder imageDecoder, ProgressiveJpegConfig progressiveJpegConfig, DownsampleMode downsampleMode, boolean z2, boolean z3, ExecutorSupplier executorSupplier, PooledByteBufferFactory pooledByteBufferFactory, PooledByteStreams pooledByteStreams, MemoryCache<CacheKey, CloseableImage> memoryCache, MemoryCache<CacheKey, PooledByteBuffer> memoryCache2, BufferedDiskCache bufferedDiskCache, BufferedDiskCache bufferedDiskCache2, Map<String, BufferedDiskCache> map, CacheKeyFactory cacheKeyFactory, PlatformBitmapFactory platformBitmapFactory, int i2, int i3, boolean z4, int i4, CloseableReferenceFactory closeableReferenceFactory, boolean z5, int i5);
    }

    private ImagePipelineExperiments(Builder builder) {
        this.isWebpSupportEnabled = builder.webpSupportEnabled;
        this.webpErrorLogger = builder.webpErrorLogger;
        this.isDecodeCancellationEnabled = builder.decodeCancellationEnabled;
        this.webpBitmapFactory = builder.webpBitmapFactory;
        this.useDownsamplingRatioForResizing = builder.useDownsamplingRatioForResizing;
        this.useBitmapPrepareToDraw = builder.useBitmapPrepareToDraw;
        this.useBalancedAnimationStrategy = builder.useBalancedAnimationStrategy;
        this.bitmapPrepareToDrawMinSizeBytes = builder.bitmapPrepareToDrawMinSizeBytes;
        this.bitmapPrepareToDrawMaxSizeBytes = builder.bitmapPrepareToDrawMaxSizeBytes;
        this.bitmapPrepareToDrawForPrefetch = builder.bitmapPrepareToDrawForPrefetch;
        this.maxBitmapSize = builder.maxBitmapSize;
        this.isNativeCodeDisabled = builder.nativeCodeDisabled;
        this.isPartialImageCachingEnabled = builder.isPartialImageCachingEnabled;
        DefaultProducerFactoryMethod defaultProducerFactoryMethod = builder.producerFactoryMethod;
        this.producerFactoryMethod = defaultProducerFactoryMethod == null ? new DefaultProducerFactoryMethod() : defaultProducerFactoryMethod;
        Supplier<Boolean> BOOLEAN_FALSE = builder.lazyDataSource;
        if (BOOLEAN_FALSE == null) {
            BOOLEAN_FALSE = Suppliers.BOOLEAN_FALSE;
            Intrinsics.checkNotNullExpressionValue(BOOLEAN_FALSE, "BOOLEAN_FALSE");
        }
        this.isLazyDataSource = BOOLEAN_FALSE;
        this.isGingerbreadDecoderEnabled = builder.gingerbreadDecoderEnabled;
        this.downscaleFrameToDrawableDimensions = builder.downscaleFrameToDrawableDimensions;
        this.suppressBitmapPrefetchingSupplier = builder.suppressBitmapPrefetchingSupplier;
        this.isExperimentalThreadHandoffQueueEnabled = builder.experimentalThreadHandoffQueueEnabled;
        this.memoryType = builder.memoryType;
        this.keepCancelledFetchAsLowPriority = builder.keepCancelledFetchAsLowPriority;
        this.downsampleIfLargeBitmap = builder.downsampleIfLargeBitmap;
        this.isEncodedCacheEnabled = builder.encodedCacheEnabled;
        this.isEnsureTranscoderLibraryLoaded = builder.ensureTranscoderLibraryLoaded;
        this.isEncodedMemoryCacheProbingEnabled = builder.isEncodedMemoryCacheProbingEnabled;
        this.isDiskCacheProbingEnabled = builder.isDiskCacheProbingEnabled;
        this.trackedKeysSize = builder.trackedKeysSize;
        this.allowProgressiveOnPrefetch = builder.allowProgressiveOnPrefetch;
        this.animationRenderFpsLimit = builder.animationRenderFpsLimit;
        this.allowDelay = builder.allowDelay;
        this.handOffOnUiThreadOnly = builder.handOffOnUiThreadOnly;
        this.shouldStoreCacheEntrySize = builder.shouldStoreCacheEntrySize;
        this.shouldIgnoreCacheSizeMismatch = builder.shouldIgnoreCacheSizeMismatch;
        this.shouldUseDecodingBufferHelper = builder.shouldUseDecodingBufferHelper;
        this.cancelDecodeOnCacheMiss = builder.cancelDecodeOnCacheMiss;
        this.prefetchShortcutEnabled = builder.prefetchShortcutEnabled;
        this.platformDecoderOptions = builder.platformDecoderOptions;
    }

    public /* synthetic */ ImagePipelineExperiments(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    @JvmStatic
    public static final Builder newBuilder(ImagePipelineConfig.Builder builder) {
        return Companion.newBuilder(builder);
    }

    public final boolean getAllowDelay() {
        return this.allowDelay;
    }

    public final boolean getAllowProgressiveOnPrefetch() {
        return this.allowProgressiveOnPrefetch;
    }

    public final int getAnimationRenderFpsLimit() {
        return this.animationRenderFpsLimit;
    }

    public final boolean getBitmapPrepareToDrawForPrefetch() {
        return this.bitmapPrepareToDrawForPrefetch;
    }

    public final int getBitmapPrepareToDrawMaxSizeBytes() {
        return this.bitmapPrepareToDrawMaxSizeBytes;
    }

    public final int getBitmapPrepareToDrawMinSizeBytes() {
        return this.bitmapPrepareToDrawMinSizeBytes;
    }

    public final boolean getCancelDecodeOnCacheMiss() {
        return this.cancelDecodeOnCacheMiss;
    }

    public final boolean getDownsampleIfLargeBitmap() {
        return this.downsampleIfLargeBitmap;
    }

    public final boolean getDownscaleFrameToDrawableDimensions() {
        return this.downscaleFrameToDrawableDimensions;
    }

    public final boolean getHandOffOnUiThreadOnly() {
        return this.handOffOnUiThreadOnly;
    }

    public final boolean getKeepCancelledFetchAsLowPriority() {
        return this.keepCancelledFetchAsLowPriority;
    }

    public final int getMaxBitmapSize() {
        return this.maxBitmapSize;
    }

    public final long getMemoryType() {
        return this.memoryType;
    }

    public final PlatformDecoderOptions getPlatformDecoderOptions() {
        return this.platformDecoderOptions;
    }

    public final boolean getPrefetchShortcutEnabled() {
        return this.prefetchShortcutEnabled;
    }

    public final ProducerFactoryMethod getProducerFactoryMethod() {
        return this.producerFactoryMethod;
    }

    public final boolean getShouldIgnoreCacheSizeMismatch() {
        return this.shouldIgnoreCacheSizeMismatch;
    }

    public final boolean getShouldStoreCacheEntrySize() {
        return this.shouldStoreCacheEntrySize;
    }

    public final boolean getShouldUseDecodingBufferHelper() {
        return this.shouldUseDecodingBufferHelper;
    }

    public final Supplier<Boolean> getSuppressBitmapPrefetchingSupplier() {
        return this.suppressBitmapPrefetchingSupplier;
    }

    public final int getTrackedKeysSize() {
        return this.trackedKeysSize;
    }

    public final boolean getUseBalancedAnimationStrategy() {
        return this.useBalancedAnimationStrategy;
    }

    public final boolean getUseBitmapPrepareToDraw() {
        return this.useBitmapPrepareToDraw;
    }

    public final boolean getUseDownsamplingRatioForResizing() {
        return this.useDownsamplingRatioForResizing;
    }

    public final WebpBitmapFactory getWebpBitmapFactory() {
        return this.webpBitmapFactory;
    }

    public final WebpBitmapFactory.WebpErrorLogger getWebpErrorLogger() {
        return this.webpErrorLogger;
    }

    public final boolean isDecodeCancellationEnabled() {
        return this.isDecodeCancellationEnabled;
    }

    public final boolean isDiskCacheProbingEnabled() {
        return this.isDiskCacheProbingEnabled;
    }

    public final boolean isEncodedCacheEnabled() {
        return this.isEncodedCacheEnabled;
    }

    public final boolean isEncodedMemoryCacheProbingEnabled() {
        return this.isEncodedMemoryCacheProbingEnabled;
    }

    public final boolean isEnsureTranscoderLibraryLoaded() {
        return this.isEnsureTranscoderLibraryLoaded;
    }

    public final boolean isExperimentalThreadHandoffQueueEnabled() {
        return this.isExperimentalThreadHandoffQueueEnabled;
    }

    public final boolean isGingerbreadDecoderEnabled() {
        return this.isGingerbreadDecoderEnabled;
    }

    public final Supplier<Boolean> isLazyDataSource() {
        return this.isLazyDataSource;
    }

    public final boolean isNativeCodeDisabled() {
        return this.isNativeCodeDisabled;
    }

    public final boolean isPartialImageCachingEnabled() {
        return this.isPartialImageCachingEnabled;
    }

    public final boolean isWebpSupportEnabled() {
        return this.isWebpSupportEnabled;
    }
}
