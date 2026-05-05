package com.facebook.imagepipeline.core;

import android.net.Uri;
import bolts.Continuation;
import bolts.Task;
import com.facebook.cache.common.CacheKey;
import com.facebook.callercontext.CallerContextVerifier;
import com.facebook.common.internal.Objects;
import com.facebook.common.internal.Predicate;
import com.facebook.common.internal.Supplier;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.util.UriUtil;
import com.facebook.datasource.DataSource;
import com.facebook.datasource.DataSources;
import com.facebook.datasource.SimpleDataSource;
import com.facebook.imagepipeline.cache.BufferedDiskCache;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.datasource.CloseableProducerToDataSourceAdapter;
import com.facebook.imagepipeline.datasource.ProducerToDataSourceAdapter;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.listener.ForwardingRequestListener;
import com.facebook.imagepipeline.listener.ForwardingRequestListener2;
import com.facebook.imagepipeline.listener.RequestListener;
import com.facebook.imagepipeline.listener.RequestListener2;
import com.facebook.imagepipeline.producers.InternalRequestListener;
import com.facebook.imagepipeline.producers.Producer;
import com.facebook.imagepipeline.producers.SettableProducerContext;
import com.facebook.imagepipeline.producers.ThreadHandoffProducerQueue;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.imagepipeline.systrace.FrescoSystrace;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"Яŝ\u0014D57\u001eq\u007fR܀kŞ\fA\u001c0\u0013ǞJ~0L\u001aw\u001dfrˎ8D{H6ɟ[*%k\u000442d,ڎK;k\u001a\u0006\"\u001fOVg}nRҙ\u0013C%\u0006\u001eюr,_U\u0001]\u0018\u000f:B\u0006?;ݹw=O`|6\u000b!:\"Ny\rЏ\"*^\u0010~zIQ\u0014\u0012F@x:X\u0014U\u0005(\u0019\u000e>&\u0002&\\uN>Hr_B/9\u0003qBT'g0\u0013M\u0015FZ'\u0015vw\u001e3@M5\u001d%Y\u0003\u000fRq?\u000bӊy=\u0013t/ݐ3I\u0002y>X\u0006$\u001d+e\rer,]\rQv\f/˃WcaP\u0016(}z\u0004\rR\u0004\u0016\u0006-K6-0f\u0010Ԅ;t\tSHP\b_H\u0005\u0011ʨT\u0004U\u007fa*q\u001aS\u0012ŗ:)RE{\u001d\rL$\u0011z/]l\u0016p\u0019+V\u000eP_Un@XZ\u0018^Uu\u0014tr\u0004@\u0003^M.2\f\u001b<\u001e==k;3!\u001a\u000bvLw\u0007\u0013j\u0001_yTX@Pz&9:\t:gro\u0015{^bp8!O,T5\n\u0018\u00150\\&KO0 R]x\u0002j{n\u001a)=xOY\u001d|\u001e[GqK5\u007fw e`\f,?jx\u0015btYk\u0012j^8\"`Q\u0019\u0018\b\u0006Rf$\u0019BA\u0002\u001cb5_!l\u001bV\u001c6DW{7yjl\u001e\u001al3R\u001fȐ(t\u0017\u001e\u0019`~\"\u007fxw_Ed0aYQcLnY0\u001eL|Q:G\u007f\u000e}\u007fLu\u007f\u001d\u001a\u0004\r\u0014 DR\u0002_=v+\u000f-\\b\b;|dt{P{Jo\t\u000b3';\u0017a\u0018\u000ex+Db\u0001I}\u0010_.\u0005\u001b\u000b#6\u00180}o}\u0013G\u0012\rS\u007fL\u0007\u000b\u000fiD^>\r\u0007/\u001eS\u000e\u001ea+s]I5W.y*.C\u001d\u000eo}n\u0012d%%#dLXqS\bnaeBAHKi~l/R,1\u0001xp\u0006BZ\u000bJ\fa\u0004qj~\u0017PO!.,e70\u001b\u001dn[h\u00178*Bkw6\u0004K\u000e\u001anE5\u0011{`\u0016-\u001c\n\r\u0011XI\"\r\u00120\u001dMLC.\u0017od\u001f/4rH:O|z\u0005jKl\t:y \u0017S\\y\f |\u0010F\u000e\u001cEqp2k\\\u001c\u000f\u0011^lG3\u001cuf/j\u0019\u0001%2Lwe5\u0013/^T]&b\u0007aI!\u001d\u0001N-jU1R\u0018Q\u001d>W/OumQ\u000f\u001aB\u0014I9m\u001a4\u001c8\u001e}3AFa\u0002\u001a\u001f\u001d\u000f<n\u0013ej^f\u0007\u0012\u0015_|aW=+\u0003\u001cv\"\u0011!\u0018}. h;\rfyMBH\u007fGL/\u0007\u001a>{H1,4w]EOj\"S\u0014Yi:,\fP(-\u0004\u0003dtY$e8\"c\\$9.n\u0012\u0011#V0\u0006>J#\u00028m6t\u007f\u0006A<+^\b'('NgCn\u001cAygA6q4{ze\u0013\u0013lAX\nn[_KHU\f^\u0017f\u0015R\u0011\u0002[\t\u0017\u000eT-(556aY\u0016]\u0010\u0001r\u0002N\n\u0011sQyry=@Z.\u0004/{\u0006\u0004XaVTi\u0015}BrCtlp\u0013>dxh|v\"(B{GLlZ+4t7f~=\u00021!q\ful7\nS\u0004>#GQmVg8\u00190@x'\u0002ha=\u00168\u000e!z\u0010i<-taS\u0019U\u0019TsrO>M[7p\u0014t\u001f\u001c^GZf$nb(jSSI@G\u0015IGFU\b\u0019)Cz]c-:\u0007\r\u0003\u001d?(>\u001ay\"u!+_\u0013}Uofi`ekZg$\u0004{I-L\u0014\\\u001d2DKKDL<\u001e|\u000eY764\u0014\u0006/\u0010MAN:al@\u0005\u0001\u0006CThdvt'U'\u0011s8g\u001a\u001e\u0002%scJ@)\u0013IJLzEn\u001dD{+*\u0011R9]\u0016M\u000e4-{]\u000b_g\u0004P9Y~]7lcL\u0015\u0004\u0004h?\u0010u(\u0006naZ\n;Llc\u0019&\u001eWmPP\u0014#\f2vaXnPx\u001f.&y9v<j%eCx\nn\u0013Td<\u0006$\r\u001c\u0015\\\r_*\f\u001cx'#AW\u007fQO\"\\\f#-\u0011\n44d\u0016)uG\u0006ufwQ39)z^C&t\u0007k ycs-\u000e=C.uZn 8\u0013\u001e\u0010[cvKt~RT\u00062F/~\u0003#QkT4\u001fk^Ek\r~z9qc?7\u007f[|'m#[,J\u0011\u001e\u00171\u00139'\u0004?@Z\f\u000fG=*@%WcR\u0006I>\f\u0012P/i\u001eAE@y(\u001fyMooE\u000f\u000e0'R\u000fAb\u0013m!!&$u\u0002zn\u001f=V\"q\u0017vDz\u000f)}:l<>c@U\b'aJp\u0004mN\u0004Fp7P\u007fp\na}q|s\b\u0006\u000eC\u0004pV1 \u001a\u0014UmK\u0007SrWlO\b,Nk\u001a\u001c3%\u0010U\u00115>nmc\u001cs$XnKq4\u001ak-\b\u0001A|>\u0012GlNzP~Q\u0014\u001a\u007f|+\u0017nK`A>k\u001d25p`l/\u007f/\u0007*\u001b\"\u0013\\vQ\u001b{N0>:Ym'WJ4\u001a\u0019?(\u0019\n\u0015K6;(r|]'LE\u000b\f|\t]2\u001aj]\u0012t\u0019p\";\u0015?o~\u0007XI<\u0003\u0013l\u0007UhP$\u001e9iGO,xY_IK1\u0015\u0019\u0018jg`\f\t\u0001|\u0013t'Dz4ZBH\nu\u0005C\nzaV\"UB\n6+\u0014h&$SpZ$q+;Wyf!_DL&f\bz\nG\u0010D:+:\u0007Cb2NB\u000bJ$9\u007f=5`rtO\u0011-\u0019i\u001c1\u000bt<\u0012\u001c|$lk\"LCST\f:u3=2 M_l-*w\u0012WwROzP>\u0010K5.:\u0017s\u00143&r\u000f;pU(\u000epn\u0004<\u0012F1O\u001bQ<Zrh\u0005k%O\u0012\u0014Kw%\u00143!$/1l=avf.?Ouea_&|\u0013T\u00158bH=@nv\u0017\u0017\u0014)<\u001dMz\u0019Dtu~N\f-]\u001af\u0012PRmV\u0018@1 vD:e8C\u001d%{`bEit\b\u0004\u0003<e\u001fU\u0016,H4]\\\t[_a\u0016NbhbO;@7r4v\u0005T/?CdZM(\u001dQ\u00121i\u001b5\u001b?$m\u001c\u000f\t\u0002\u0007ck+@\u007f\u001c A!MT>*\u0016:\r]JN$<pN!L2ED\u0007B\u0004\u0016R\u0013a\"CG>\u0002ta/\u0006DvB3@m{6p04qt#u%*2CY]I-7N<K+Ì;8'\u000b(\u001a(,e\u0018O\u0010#dnwF\bwo^\\9QZ(\u0016.\u0019+\u001b{lQgqj /}D\u0006@\u0012<Qi\u0013\u0013bRSs*Z\u0016<\"O02u$pF\u001a\u000b-Do?Apwx@~=hFE-3\u0001lg/HQ\u001cK\u0016Dϝc-\u0015\u001ft^hO\"f\u0005Dy~\u00181cj4\u000b\u0014\u001bL=W49kb{R.pU<e:O|V;ZNaR!g;Ky>+/\u0013Vi#\b_L\u001f6!rG1w$\r/:$A|{{?P\u0001\u0006]n5\u001b-%f(}#\u0014J0\u0002]sMQ5\u001b\u001d!z\f;iKt \u001b~,Eډ\u0014\u000bDR\r\u001e\tOzF\u0006\"D\u0016\u0005\")PbmpK\u007f.$L}NU\u0013\"h!#L}h\u0010J\bl\n\u001f\u000f<\"[\nK0\u0011x\\SIk\u0012K\u0006\u0007jR'=MkW0z:\u000b}\"3\b?&9(k~\u0004\u000e}APY9B\b\u001cR\\oC\u0017wQzIb\u0014\u0019սN\u00050-dNaBX\u007fl>|_T)Dt|5\u001c}:6uZ<oN\u001d\u000eU/y\u0005\u0003~\u0015U\u0016@\u001aEIJY}\ru*3,\\~\u0002\u0013\u0010:\b_xv`\u001fBhDD*\u001e9}X=P\u000f\u0019\n\u007f4Ls||T\u0010]a3pR ph%0\u0007n~9\t\u0005k(Q;KV\u0005fG\u001exxm&~l}\u0016[\r@Mdkn#=_9\u001fZ\u001fc\u0013\u0002\u000f\u007f8ȷ?=O˯ YL\u000b\u0016MoTw2\b\u0005f\u0003΄Op\u001eʾWY}{nK\u0011\u0012\u0011A-F6%@Acϧ?ْz\u0014>\u0087U\u001aek|\u0002!fܸ\u0019qXЏO\u0014K_Qx1s\u007fI=jZ\u000e!%T;\u0019\u001c9g\u001b5# EȬ\u000eθ=]8ر!n\u0018\u000eim> S¥6ϙ&Y\u001aŻf0vGQMwKC52\u0017~X\u008d\u00037`ו\u0004oh~\"YS-Qb\u0011\b\u0019a\u001b]ċ\\rzH1\b<oi\"04Bl\bR99Nk\u0017\tLĨ[ߟ\u001a^/ĸ\bi\r\u0010\bgsw\u001eΤOՓ$uZ҈lhbl'j'UΒ@j~¤DDR!.7\\\\td7:y}~ъ*܍-p-ͬ3V\\~)\u0011\"`Sϟ\u0001ʰA>%ٮ\u0007\u0013)%Z\u0017)\u001bH۠[Υ\u0011t>\u009a\u001eko8JgJv{\u0001a$A\fjЏ\u0016ت_h\u0005ܤFu\u001aAH$q\u0002\u0018ώ'Ǥ\u0015#t։\bXn)\u0012`\u0010YyKΔ*\u001b_\u0003P$V ԫDN"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/BYG\u0004?i\u0018.8GFk;\"\u001eh7", "", ">q^1h*>`\u0007~\u0007n,\u0006\u0007/F{&\u000bJ\u000e+", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/BYG\u000bDw\u0015>KCHY4*%hj7\u0007D(L\u00061T`$", "@d`BX:M:\u001d\r\n^5|\u0016=", "", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006})Ch})7z_\u001bMOKkB-{loH\u0007l,[L", "@d`BX:M:\u001d\r\n^5|\u0016{s", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006})Ch})7z_\u001bMOKkB-{loH\u0007l,[C|", "7r??X->b\u0017\u0002Zg(y\u0010/dm8\u0007K\b\u001b\u0017T", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\u0005 &G|\u00178}n#i\t+>q\u0016;#", "", "0hc:T7&S!\t\br\nx\u00072e", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t!3\\}i\u001fm\u001e8ZW\u0019g2!\u0015>", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0007+c\u0003(E>\u000b\u001f\u001fQxW\u001ar#8Yc KC", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006z-1[}i\u0015t <M?8r4\u0002\u001ddc9\\", "3mR<W,=;\u0019\u0007\u0005k@Z\u0005-h\u007f", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\t\u0017\u001fQ|\"\u0006a/?`}\u001f\u0014\u0002%.*S<l4+j", ";`X;5<?T\u0019\fz]\u000b\u0001\u00175C{&~@", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t!3\\}i\u0014}\u0017/MP;j\u0013\"#n?5\u0005f,$", "AlP9_\u0010FO\u001b~Wn-}\t<e~\u0007\u007fN\u0007t\u0013Er\u000e", "1`R5X\u0012>gyzxm6\n\u001d", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t!3\\}i\u0015i\u00141M);\u007f\u0015\u001a\u0013wkF\u001b9", "Bga2T+!O\"}\u0005_-g\u00169d\u0010&{Ml'\u0017Wo", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w<FHk0\u001dwdj8\u0011d-9\u00041F\\L,i>\u0003=$\u00120", "At_=e,Lau\u0003\nf(\bs<e\u0001(\u000b>\u0004\u001b I]\u001eG\u0002,9Y\u000b", ":`iF7(MO\u0007\t\u000bk*|", "1`[9X9\u001c]\"\u000ezq;m\t<i\u0001,{M", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0007+l\u0007(\t>\u000b &G\u0003\u001d\u0006T!<`}-\u0015w\u001f=MVJ\\4+\u0019ie9\u00149", "1n]3\\.", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/BYG\u0004?i\u0018.8GFk;\"\u001eh?C\u0010d0PZ0VL[-XPr\u0013", "uKR<`u?O\u0017~wh6\u0003R3m{*{K\u0005\"\u0017Ns\u0017<@#?f}i\"z -]A;x\"\u001e!xaB\u0005c\rJt6QYb\u0002CWnN\u0010[j\u001dR2VrYPyUI30\u0004uY\u0011?oJy\u0016\u001d\u000bQnL^YHu\u0013u>3rL#]\u0004OIOksh\u0015n\u001diC6+]_)&sW2\n\t)wp\\\u00021hC\u0017z5.Hs%JMkW<\u007f+*K\u0003{\u001b2\"r'r0\u0004}\u00126l\u000fX{u:\\{\u0015\u0002C?1.\u007f=\u000f=K`\u007fvDWl']\n\u000em9<\u0019lilHX\u0005Y\u0015^5+G\u0001?\\\u0013R'k\u0013*FT)Y\u0004\u001dR\b keFM%ZJ\u001ex@$_\u001c\u0007\u000ef\u001f 7\u0016\u0007W\u000bf-_\u0001*#\ni8\u0019{X\"\u0019~NmiIu[-V\"@\u0001ZJ\u001d1K9\u0001\\I9\u0014\u001e0\u0003\u000b\n!~iI}?\u0013n#9W;b*\f\u001bhT\"&g7z#;7_N>q^M\u000e\u0013\b\u00162}\u0011[>5\f=G\u0013n*8eK\u0010@eR\u00170V\u0015x^p\u0014E[=\u0013Fl\u0011\u007fi+\rs\u0018*5\u007fT3=\u0002-p\u0014U\u000bk\u001b/\u0018\u000bbT_Q\u001bjJH%\u0002f/\f\u0014+F2 Y\u000b(S8NU\u0005h\"\u000b\u000bT\u00021;3\u0003bD{\"\fN\u001c\u0005\u0018N\u0007,1+[&yMSL9i\u001b#\brV< XA^6*\"\t_N?o\fcd\u0017\n(\u001dE'~}\u001aC8Z\u0003r\u0018t6q\u0011hit!9\u00162YG\u0019?xp.\u000f1j{\u0004R\u0011\u0019'@zhVG]%DM4R[Z82m\u0005GA\u0019z@|#fGm\u001bEt\u0014%Ql\u0019A\u0007'\u00021ALd*-x\u0011h\u00169p=Ap.YKL*c.[Y\f\u001c\u0016!`#\u000b\u0010]M(BNA\u0015\u007fQG\u0017d2\u0012\u0006!\u0010xV\u0005MTWAs\u000b\u00023uvOW`{RO\u001dr9'\u00023VWo@3\u0017s)\u0019@\u0006\u001d", "5dc\u000f\\;FO$fzf6\n\u001d\ra}+{", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn3U{#77}.UMH\u007f\u0012\u001a\u0013ka\u000f", "5dc\u0010T*AS~~\u000f?(z\u00189r\u0014", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn3U{#77s*KF;Q42ud_H\u0011p@$", "5dc\u0010b5?W\u001b", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn3c\u000b \u0001Q\u001e*OC&o?\u001e\u001clj9dm5Oz)+U],iSn;\u0014g", "7c2<h5MS&", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0013&Qw\u0012:@\u0001Dc\u0006$5T 7O\u0019", "7r;.m@\u001dO(zhh<\n\u0007/", "u(;0b4\bT\u0015|z[6\u0007\u000fxc\n0\u0004J\n`\u001bP~\u000eI\u007f!<#k0Bx\u001d2MP\u0011", "7r?.h:>R", "u(I", "5dc\u001de6=c\u0017~\bL,\t\u0019/n}(\\<~&!T\u0004", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn3c\u000b \u0001X#8LS9kA\f\u0015tq9\u0010a,/r%VV[@2", "@d`BX:M:\u001d\r\n^5|\u0016", "@d`BX:M:\u001d\r\n^5|\u0016{", "CrT170LYvzxa,j\rDe", "", "5dc\"f,=2\u001d\r\u0001<(z\f/S\u0004={", "u(9", "1kT.e\n:Q\u001c~\t", "", "1kT.e\u000bBa\u001f\\v\\/|\u0017", "1kT.e\u0014>[#\f\u000f<(z\f/s", "3uX0g\rK]!\\v\\/|", "CqX", "\u001a`]1e6BRb\bzmul\u00163;", "3uX0g\rK]!]~l2Z\u0005-h\u007f", "7lP4X\u0019>_)~\tm", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u0004%Ai}.F7y6IE;X4*%hoH\\", "3uX0g\rK]!fzf6\n\u001d\ra}+{", "4dc0[\u000b>Q#}z]\u0010\u0005\u00051e", "\u001ab^:\"-:Q\u0019{\u0005h2F\b+t{6\u0006P\u000e\u0015\u0017\u0011N\nKr\u0013?i\u000b\u001e7C", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\u000e\u0017\u0018G|\u000eEt%C#['A{\u0016*JJ;X4\u001f\u0015uaB\u0005c\u0002", "1`[9X9\u001c]\"\u000ezq;", ":nf2f;)S&\u0007~m;|\b\u001ce\f8{N\u0010}\u0017Xo\u0015&\u007f\u0013EV\u0006$F", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u0004%Ai}.F7y6IE;X4*%hoHEP,Z\u0007'U[5,mRy\u0013", "Ch2<`7H\\\u0019\b\nB+", "", "3wc?T:", "", "4dc0[\fGQ#}z]\u0010\u0005\u00051e", "4dc0[\u0010FO\u001b~[k6\u0005e3t\b$\u0007\u001e|\u0015\u001aG", "5d]2e(MS\t\b~j<|i?t\u00105{$\u007f", "5dc\u0010T*AS~~\u000f", "5dc\u0010T*AS\u0018b\u0003Z.|", "1`R5X\u0012>g", "5dc\u0010b4;W\"~yK,\t\u0019/s\u000f\u000f\u007fN\u0010\u0017 G|", ":hbAX5>`", "5dc\u0011T;:A#\u000f\b\\,j\u0019:p\u0007,{M", "@d`BX:M:\u0019\u0010ze", "5dc\u0012a*HR\u0019}^f(~\t\u000ea\u000f$iJ\u0011$\u0015G]\u001eG\u0002,9Y\u000b", "5dc\u001fX8NS'\u000eab:\f\t8e\r\t\u0006Mm\u0017#Wo\u001cK", "6`b\u0010T*AS\u0018b\u0003Z.|", "7mXA", "7r8;50M[\u0015\nb^4\u0007\u0016CC{&~@", "7r8;70LYvzxa,", "7r8;70LYvzxa,j\u001d8c", "1`R5X\nA]\u001d|z", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u0004%Ai}.F7y6IE;X4*%hoHEA(Ly'%OX0ZRH", "7r8;85<]\u0018~yF,\u0005\u0013<y]$yC\u0001", ">`d@X", ">qT1\\*:b\u0019_\u0005k\u001c\n\r", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\u0005 &G|\u00178}n f}\u001f;k\u0012=M\u0019", ">qT3X;<V\b\tWb;\u0005\u0005:C{&~@", "\u001aiPCTuEO\"\u0001DO6\u0001\b\u0005", ">qT3X;<V\b\tYb:\u0003f+c\u0003(", ">qX<e0Mg", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/=a\b)\u0001X#2WP?zHs", ">qT3X;<V\b\tZg*\u0007\b/d]$yC\u0001", "@dbB`,", "AtQ:\\;\u001fS(|}K,\t\u0019/s\u000f", "\"", ">q^1h*>`\u0007~\u0007n,\u0006\u0007/", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w8PEjD\u001c\u0015u7", "AdcAT)ES\u0004\f\u0005]<z\t<C\n1\u000b@\u0014&", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w;CJz0\u001b\u001chLF\u0011b<Lv4%VW;\\e\u0002\u0013", "AtQ:\\;)`\u0019\u007fzm*\u007fu/q\u0010(\nO", "\u0011n\\=T5B]\"", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ImagePipeline {
    private final MemoryCache<CacheKey, CloseableImage> bitmapMemoryCache;
    private final CacheKeyFactory cacheKeyFactory;
    private final CallerContextVerifier callerContextVerifier;
    private final ImagePipelineConfigInterface config;
    private final MemoryCache<CacheKey, PooledByteBuffer> encodedMemoryCache;
    private final AtomicLong idCounter;
    private final Supplier<Boolean> isLazyDataSource;
    private final Supplier<Boolean> isPrefetchEnabledSupplier;
    private final BufferedDiskCache mainBufferedDiskCache;
    private final ProducerSequenceFactory producerSequenceFactory;
    private final RequestListener requestListener;
    private final RequestListener2 requestListener2;
    private final BufferedDiskCache smallImageBufferedDiskCache;
    private final Supplier<Boolean> suppressBitmapPrefetchingSupplier;
    private final ThreadHandoffProducerQueue threadHandoffProducerQueue;
    public static final Companion Companion = new Companion(null);
    private static final CancellationException PREFETCH_EXCEPTION = new CancellationException("Prefetching is not enabled");
    private static final CancellationException NULL_IMAGEREQUEST_EXCEPTION = new CancellationException("ImageRequest is null");

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005\"2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00050i%\nCiWpԅ$\u07beSNo˧?Vh\u000e[\u000f4\u0018O̖.֒Yxe܈ƪ6F"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/BYG\u0004?i\u0018.8GFk;\"\u001eh \u0017\u0011k7J\u007f+QU$", "", "u(E", "\u001cT;\u0019R\u0010&/z^g>\u0018lh\u001dTy\bn\u001e`\u0002\u0006+Yv", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJt\u0013Pm\u000eC}!D]\b)\u0017\u0001\u0014.XR?u=s", "\u001eQ4\u00138\u001b\u001c6\u0013^m<\fgw\u0013Oh", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImageRequest.CacheChoice.values().length];
            try {
                iArr[ImageRequest.CacheChoice.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageRequest.CacheChoice.SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.core.ImagePipeline$getDataSourceSupplier$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я!\u001d̉=!4i\bDZc|\u0004W\u00068\u000bDB\u0007\"2\u0012\u007f\u0007tvAӄld߉4Ziճ?}\fB4g4ySAe\u001c\u000e\"7Q|h\u0016nxYSU\u001d\t.\u0005z4Y[\t_\"\u000f`D\u001e@aM6Q\u0002f\u0003:\u001d `'~\u000eڷ\u0005 "}, d2 = {"1n\\{Y(<S\u0016\t\u0005du\u0001\u0011+g\u007f3\u007fK\u0001\u001e\u001bPoW:\u000125#a(3o\u0016\u0019QN;r8'\u0015'c9\u0016B(]r\u0015Q\\[*\\@\u0003H\u001f\u0019^\u000e[iX", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\u0005 &G|\u00178}n#i\t+>q\u0016;#", "\u001ab^:\"-:Q\u0019{\u0005h2F\b+t{6\u0006P\u000e\u0015\u0017\u0011N\nKr\u0013?i\u000b\u001e7C", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\u000e\u0017\u0018G|\u000eEt%C#['A{\u0016*JJ;X4\u001f\u0015uaB\u0005c\u0002", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006z-1[}i\u0015t <M?8r4\u0002\u001ddc9\\", "5dc", "BnBAe0GU", "", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass1 implements Supplier<DataSource<CloseableReference<CloseableImage>>> {
        final /* synthetic */ Object $callerContext;
        final /* synthetic */ ImageRequest $imageRequest;
        final /* synthetic */ ImageRequest.RequestLevel $requestLevel;

        AnonymousClass1(ImageRequest imageRequest, Object obj, ImageRequest.RequestLevel requestLevel) {
            imageRequest = imageRequest;
            obj = obj;
            requestLevel = requestLevel;
        }

        @Override // com.facebook.common.internal.Supplier
        public DataSource<CloseableReference<CloseableImage>> get() {
            return ImagePipeline.fetchDecodedImage$default(ImagePipeline.this, imageRequest, obj, requestLevel, null, null, 24, null);
        }

        public String toString() {
            String string = Objects.toStringHelper(this).add("uri", imageRequest.getSourceUri()).toString();
            Intrinsics.checkNotNullExpressionValue(string, "toStringHelper(this).add…est.sourceUri).toString()");
            return string;
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.core.ImagePipeline$getDataSourceSupplier$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я!\u001d̉=!4i\bDZc|\u0004W\u00068\u000bDB\u0007\"2\u0012\u007f\u0007tvAӄld߉4Ziճ?}\fB4g4ySAe\u001c\u000e\"7Q|h\u0016nxYSU\u001d\t.\u0005z4Y[\t_\"\u000f`D\u001e@aM6Q\u0002f\u0003:\u001d `'~\u000eڷ\u0005 "}, d2 = {"1n\\{Y(<S\u0016\t\u0005du\u0001\u0011+g\u007f3\u007fK\u0001\u001e\u001bPoW:\u000125#a(3o\u0016\u0019QN;r8'\u0015'c9\u0016B(]r\u0015Q\\[*\\@\u0003H\u001f\u0019^\u000e[iY", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\u0005 &G|\u00178}n#i\t+>q\u0016;#", "\u001ab^:\"-:Q\u0019{\u0005h2F\b+t{6\u0006P\u000e\u0015\u0017\u0011N\nKr\u0013?i\u000b\u001e7C", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\u000e\u0017\u0018G|\u000eEt%C#['A{\u0016*JJ;X4\u001f\u0015uaB\u0005c\u0002", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006z-1[}i\u0015t <M?8r4\u0002\u001ddc9\\", "5dc", "BnBAe0GU", "", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass2 implements Supplier<DataSource<CloseableReference<CloseableImage>>> {
        final /* synthetic */ Object $callerContext;
        final /* synthetic */ ImageRequest $imageRequest;
        final /* synthetic */ ImageRequest.RequestLevel $requestLevel;
        final /* synthetic */ RequestListener $requestListener;

        AnonymousClass2(ImageRequest imageRequest, Object obj, ImageRequest.RequestLevel requestLevel, RequestListener requestListener) {
            imageRequest = imageRequest;
            obj = obj;
            requestLevel = requestLevel;
            requestListener = requestListener;
        }

        @Override // com.facebook.common.internal.Supplier
        public DataSource<CloseableReference<CloseableImage>> get() {
            return ImagePipeline.fetchDecodedImage$default(ImagePipeline.this, imageRequest, obj, requestLevel, requestListener, null, 16, null);
        }

        public String toString() {
            String string = Objects.toStringHelper(this).add("uri", imageRequest.getSourceUri()).toString();
            Intrinsics.checkNotNullExpressionValue(string, "toStringHelper(this).add…est.sourceUri).toString()");
            return string;
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.core.ImagePipeline$getDataSourceSupplier$3 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я!\u001d̉=!4i\bDZc|\u0004W\u00068\u000bDB\u0007\"2\u0012\u007f\u0007tvAӄld߉4Ziճ?}\fB4g4ySAe\u001c\u000e\"7Q|h\u0016nxYSU\u001d\t.\u0005z4Y[\t_\"\u000f`D\u001e@aM6Q\u0002f\u0003:\u001d `'~\u000eڷ\u0005 "}, d2 = {"1n\\{Y(<S\u0016\t\u0005du\u0001\u0011+g\u007f3\u007fK\u0001\u001e\u001bPoW:\u000125#a(3o\u0016\u0019QN;r8'\u0015'c9\u0016B(]r\u0015Q\\[*\\@\u0003H\u001f\u0019^\u000e[iZ", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\u0005 &G|\u00178}n#i\t+>q\u0016;#", "\u001ab^:\"-:Q\u0019{\u0005h2F\b+t{6\u0006P\u000e\u0015\u0017\u0011N\nKr\u0013?i\u000b\u001e7C", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\u000e\u0017\u0018G|\u000eEt%C#['A{\u0016*JJ;X4\u001f\u0015uaB\u0005c\u0002", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006z-1[}i\u0015t <M?8r4\u0002\u001ddc9\\", "5dc", "BnBAe0GU", "", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass3 implements Supplier<DataSource<CloseableReference<CloseableImage>>> {
        final /* synthetic */ Object $callerContext;
        final /* synthetic */ ImageRequest $imageRequest;
        final /* synthetic */ ImageRequest.RequestLevel $requestLevel;
        final /* synthetic */ RequestListener $requestListener;
        final /* synthetic */ String $uiComponentId;

        AnonymousClass3(ImageRequest imageRequest, Object obj, ImageRequest.RequestLevel requestLevel, RequestListener requestListener, String str) {
            imageRequest = imageRequest;
            obj = obj;
            requestLevel = requestLevel;
            requestListener = requestListener;
            str = str;
        }

        @Override // com.facebook.common.internal.Supplier
        public DataSource<CloseableReference<CloseableImage>> get() {
            return ImagePipeline.this.fetchDecodedImage(imageRequest, obj, requestLevel, requestListener, str);
        }

        public String toString() {
            String string = Objects.toStringHelper(this).add("uri", imageRequest.getSourceUri()).toString();
            Intrinsics.checkNotNullExpressionValue(string, "toStringHelper(this).add…est.sourceUri).toString()");
            return string;
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.core.ImagePipeline$getEncodedImageDataSourceSupplier$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я!\u001d̉=!4i\bDZc|\u0004W\u00068\u000bDB\u0007\"2\u0012\u007f\u0007tvAӄld߉4Ziճ?}\fB4g4ySAe\u001c\u000e\"7Q|h\u0016nxYSU\u001d\t.\u0005z4Y[\t_\"\u000f`D\u001e@aM6Q\u0002f\u0003:\u001d `'~\u000eڷ\u0005 "}, d2 = {"1n\\{Y(<S\u0016\t\u0005du\u0001\u0011+g\u007f3\u007fK\u0001\u001e\u001bPoW:\u000125#a(3o\u0016\u0019QN;r8'\u0015'c9\u0016C5L\u0001&GK24XTr\u001c\u0010!V{X;\u001a\u0003Y/4yO>#\b9\bM", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\u0005 &G|\u00178}n#i\t+>q\u0016;#", "\u001ab^:\"-:Q\u0019{\u0005h2F\b+t{6\u0006P\u000e\u0015\u0017\u0011N\nKr\u0013?i\u000b\u001e7C", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\u000e\u0017\u0018G|\u000eEt%C#['A{\u0016*JJ;X4\u001f\u0015uaB\u0005c\u0002", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\t\u0017\u001fQ|\"\u0006a/?`}\u001f\u0014\u0002%.*S<l4+j", "5dc", "BnBAe0GU", "", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class C11451 implements Supplier<DataSource<CloseableReference<PooledByteBuffer>>> {
        final /* synthetic */ Object $callerContext;
        final /* synthetic */ ImageRequest $imageRequest;

        C11451(ImageRequest imageRequest, Object obj) {
            imageRequest = imageRequest;
            obj = obj;
        }

        @Override // com.facebook.common.internal.Supplier
        public DataSource<CloseableReference<PooledByteBuffer>> get() {
            return ImagePipeline.this.fetchEncodedImage(imageRequest, obj);
        }

        public String toString() {
            String string = Objects.toStringHelper(this).add("uri", imageRequest.getSourceUri()).toString();
            Intrinsics.checkNotNullExpressionValue(string, "toStringHelper(this).add…est.sourceUri).toString()");
            return string;
        }
    }

    public ImagePipeline(ProducerSequenceFactory producerSequenceFactory, Set<? extends RequestListener> requestListeners, Set<? extends RequestListener2> requestListener2s, Supplier<Boolean> isPrefetchEnabledSupplier, MemoryCache<CacheKey, CloseableImage> bitmapMemoryCache, MemoryCache<CacheKey, PooledByteBuffer> encodedMemoryCache, BufferedDiskCache mainBufferedDiskCache, BufferedDiskCache smallImageBufferedDiskCache, CacheKeyFactory cacheKeyFactory, ThreadHandoffProducerQueue threadHandoffProducerQueue, Supplier<Boolean> suppressBitmapPrefetchingSupplier, Supplier<Boolean> lazyDataSource, CallerContextVerifier callerContextVerifier, ImagePipelineConfigInterface config) {
        Intrinsics.checkNotNullParameter(producerSequenceFactory, "producerSequenceFactory");
        Intrinsics.checkNotNullParameter(requestListeners, "requestListeners");
        Intrinsics.checkNotNullParameter(requestListener2s, "requestListener2s");
        Intrinsics.checkNotNullParameter(isPrefetchEnabledSupplier, "isPrefetchEnabledSupplier");
        Intrinsics.checkNotNullParameter(bitmapMemoryCache, "bitmapMemoryCache");
        Intrinsics.checkNotNullParameter(encodedMemoryCache, "encodedMemoryCache");
        Intrinsics.checkNotNullParameter(mainBufferedDiskCache, "mainBufferedDiskCache");
        Intrinsics.checkNotNullParameter(smallImageBufferedDiskCache, "smallImageBufferedDiskCache");
        Intrinsics.checkNotNullParameter(cacheKeyFactory, "cacheKeyFactory");
        Intrinsics.checkNotNullParameter(threadHandoffProducerQueue, "threadHandoffProducerQueue");
        Intrinsics.checkNotNullParameter(suppressBitmapPrefetchingSupplier, "suppressBitmapPrefetchingSupplier");
        Intrinsics.checkNotNullParameter(lazyDataSource, "lazyDataSource");
        Intrinsics.checkNotNullParameter(config, "config");
        this.producerSequenceFactory = producerSequenceFactory;
        this.isPrefetchEnabledSupplier = isPrefetchEnabledSupplier;
        this.requestListener = new ForwardingRequestListener((Set<RequestListener>) requestListeners);
        this.requestListener2 = new ForwardingRequestListener2(requestListener2s);
        this.idCounter = new AtomicLong();
        this.bitmapMemoryCache = bitmapMemoryCache;
        this.encodedMemoryCache = encodedMemoryCache;
        this.mainBufferedDiskCache = mainBufferedDiskCache;
        this.smallImageBufferedDiskCache = smallImageBufferedDiskCache;
        this.cacheKeyFactory = cacheKeyFactory;
        this.threadHandoffProducerQueue = threadHandoffProducerQueue;
        this.suppressBitmapPrefetchingSupplier = suppressBitmapPrefetchingSupplier;
        this.isLazyDataSource = lazyDataSource;
        this.callerContextVerifier = callerContextVerifier;
        this.config = config;
    }

    public static final boolean clearMemoryCaches$lambda$2(CacheKey it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return true;
    }

    public static /* synthetic */ DataSource fetchDecodedImage$default(ImagePipeline imagePipeline, ImageRequest imageRequest, Object obj, ImageRequest.RequestLevel requestLevel, RequestListener requestListener, String str, int i2, Object obj2) {
        RequestListener requestListener2 = requestListener;
        ImageRequest.RequestLevel requestLevel2 = requestLevel;
        if ((i2 + 4) - (4 | i2) != 0) {
            requestLevel2 = null;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            requestListener2 = null;
        }
        return imagePipeline.fetchDecodedImage(imageRequest, obj, requestLevel2, requestListener2, (-1) - (((-1) - i2) | ((-1) - 16)) == 0 ? str : null);
    }

    public static final Task isInDiskCache$lambda$3(ImagePipeline this$0, CacheKey cacheKey, Task task) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!task.isCancelled() && !task.isFaulted()) {
            Object result = task.getResult();
            Intrinsics.checkNotNullExpressionValue(result, "task.result");
            if (((Boolean) result).booleanValue()) {
                return Task.forResult(true);
            }
        }
        BufferedDiskCache bufferedDiskCache = this$0.smallImageBufferedDiskCache;
        Intrinsics.checkNotNullExpressionValue(cacheKey, "cacheKey");
        return bufferedDiskCache.contains(cacheKey);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Void isInDiskCache$lambda$4(com.facebook.datasource.SimpleDataSource r2, bolts.Task r3) {
        /*
            boolean r0 = r3.isCancelled()
            if (r0 != 0) goto L28
            boolean r0 = r3.isFaulted()
            if (r0 != 0) goto L28
            java.lang.Object r1 = r3.getResult()
            java.lang.String r0 = "task.result"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto L28
            r0 = 1
        L1f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.setResult(r0)
            r0 = 0
            return r0
        L28:
            r0 = 0
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.core.ImagePipeline.isInDiskCache$lambda$4(com.facebook.datasource.SimpleDataSource, bolts.Task):java.lang.Void");
    }

    private final Predicate<CacheKey> predicateForUri(final Uri uri) {
        return new Predicate() { // from class: com.facebook.imagepipeline.core.ImagePipeline$$ExternalSyntheticLambda2
            @Override // com.facebook.common.internal.Predicate
            public final boolean apply(Object obj) {
                return ImagePipeline.predicateForUri$lambda$10(uri, (CacheKey) obj);
            }
        };
    }

    public static final boolean predicateForUri$lambda$10(Uri uri, CacheKey key) {
        Intrinsics.checkNotNullParameter(uri, "$uri");
        Intrinsics.checkNotNullParameter(key, "key");
        return key.containsUri(uri);
    }

    public static /* synthetic */ DataSource prefetchToEncodedCache$default(ImagePipeline imagePipeline, ImageRequest imageRequest, Object obj, Priority priority, RequestListener requestListener, int i2, Object obj2) {
        if ((4 & i2) != 0) {
            priority = Priority.MEDIUM;
        }
        if ((i2 & 8) != 0) {
            requestListener = null;
        }
        return imagePipeline.prefetchToEncodedCache(imageRequest, obj, priority, requestListener);
    }

    private final <T> DataSource<CloseableReference<T>> submitFetchRequest(Producer<CloseableReference<T>> producer, ImageRequest imageRequest, ImageRequest.RequestLevel requestLevel, Object obj, RequestListener requestListener, String str) {
        return submitFetchRequest(producer, imageRequest, requestLevel, obj, requestListener, str, null);
    }

    private final <T> DataSource<CloseableReference<T>> submitFetchRequest(Producer<CloseableReference<T>> producer, ImageRequest imageRequest, ImageRequest.RequestLevel requestLevel, Object obj, RequestListener requestListener, String str, Map<String, ?> map) {
        DataSource<CloseableReference<T>> dataSourceImmediateFailedDataSource;
        FrescoSystrace frescoSystrace = FrescoSystrace.INSTANCE;
        boolean z2 = false;
        if (!FrescoSystrace.isTracing()) {
            InternalRequestListener internalRequestListener = new InternalRequestListener(getRequestListenerForRequest(imageRequest, requestListener), this.requestListener2);
            CallerContextVerifier callerContextVerifier = this.callerContextVerifier;
            if (callerContextVerifier != null) {
                callerContextVerifier.verifyCallerContext(obj, false);
            }
            try {
                ImageRequest.RequestLevel max = ImageRequest.RequestLevel.getMax(imageRequest.getLowestPermittedRequestLevel(), requestLevel);
                Intrinsics.checkNotNullExpressionValue(max, "getMax(\n                …ttedRequestLevelOnSubmit)");
                String strGenerateUniqueFutureId = generateUniqueFutureId();
                InternalRequestListener internalRequestListener2 = internalRequestListener;
                if (imageRequest.getProgressiveRenderingEnabled() || !UriUtil.isNetworkUri(imageRequest.getSourceUri())) {
                    z2 = true;
                }
                SettableProducerContext settableProducerContext = new SettableProducerContext(imageRequest, strGenerateUniqueFutureId, str, internalRequestListener2, obj, max, false, z2, imageRequest.getPriority(), this.config);
                settableProducerContext.putExtras(map);
                DataSource<CloseableReference<T>> dataSourceCreate = CloseableProducerToDataSourceAdapter.create(producer, settableProducerContext, internalRequestListener);
                Intrinsics.checkNotNullExpressionValue(dataSourceCreate, "{\n          val lowestPe…questListener2)\n        }");
                return dataSourceCreate;
            } catch (Exception e2) {
                DataSource<CloseableReference<T>> dataSourceImmediateFailedDataSource2 = DataSources.immediateFailedDataSource(e2);
                Intrinsics.checkNotNullExpressionValue(dataSourceImmediateFailedDataSource2, "{\n          DataSources.…urce(exception)\n        }");
                return dataSourceImmediateFailedDataSource2;
            }
        }
        FrescoSystrace.beginSection("ImagePipeline#submitFetchRequest");
        try {
            InternalRequestListener internalRequestListener3 = new InternalRequestListener(getRequestListenerForRequest(imageRequest, requestListener), this.requestListener2);
            CallerContextVerifier callerContextVerifier2 = this.callerContextVerifier;
            if (callerContextVerifier2 != null) {
                callerContextVerifier2.verifyCallerContext(obj, false);
            }
            try {
                ImageRequest.RequestLevel max2 = ImageRequest.RequestLevel.getMax(imageRequest.getLowestPermittedRequestLevel(), requestLevel);
                Intrinsics.checkNotNullExpressionValue(max2, "getMax(\n                …ttedRequestLevelOnSubmit)");
                String strGenerateUniqueFutureId2 = generateUniqueFutureId();
                InternalRequestListener internalRequestListener4 = internalRequestListener3;
                if (imageRequest.getProgressiveRenderingEnabled() || !UriUtil.isNetworkUri(imageRequest.getSourceUri())) {
                    z2 = true;
                }
                SettableProducerContext settableProducerContext2 = new SettableProducerContext(imageRequest, strGenerateUniqueFutureId2, str, internalRequestListener4, obj, max2, false, z2, imageRequest.getPriority(), this.config);
                settableProducerContext2.putExtras(map);
                dataSourceImmediateFailedDataSource = CloseableProducerToDataSourceAdapter.create(producer, settableProducerContext2, internalRequestListener3);
                Intrinsics.checkNotNullExpressionValue(dataSourceImmediateFailedDataSource, "{\n          val lowestPe…questListener2)\n        }");
            } catch (Exception e3) {
                dataSourceImmediateFailedDataSource = DataSources.immediateFailedDataSource(e3);
                Intrinsics.checkNotNullExpressionValue(dataSourceImmediateFailedDataSource, "{\n          DataSources.…urce(exception)\n        }");
            }
            return dataSourceImmediateFailedDataSource;
        } finally {
            FrescoSystrace.endSection();
        }
    }

    private final <T> DataSource<CloseableReference<T>> submitFetchRequest(Producer<CloseableReference<T>> producer, ImageRequest imageRequest, ImageRequest.RequestLevel requestLevel, Object obj, RequestListener requestListener, Map<String, ?> map) {
        DataSource<CloseableReference<T>> dataSourceImmediateFailedDataSource;
        FrescoSystrace frescoSystrace = FrescoSystrace.INSTANCE;
        boolean z2 = false;
        if (!FrescoSystrace.isTracing()) {
            InternalRequestListener internalRequestListener = new InternalRequestListener(getRequestListenerForRequest(imageRequest, requestListener), this.requestListener2);
            CallerContextVerifier callerContextVerifier = this.callerContextVerifier;
            if (callerContextVerifier != null) {
                callerContextVerifier.verifyCallerContext(obj, false);
            }
            try {
                ImageRequest.RequestLevel max = ImageRequest.RequestLevel.getMax(imageRequest.getLowestPermittedRequestLevel(), requestLevel);
                Intrinsics.checkNotNullExpressionValue(max, "getMax(\n                …ttedRequestLevelOnSubmit)");
                String strGenerateUniqueFutureId = generateUniqueFutureId();
                InternalRequestListener internalRequestListener2 = internalRequestListener;
                if (imageRequest.getProgressiveRenderingEnabled() || !UriUtil.isNetworkUri(imageRequest.getSourceUri())) {
                    z2 = true;
                }
                DataSource<CloseableReference<T>> dataSourceCreate = CloseableProducerToDataSourceAdapter.create(producer, new SettableProducerContext(imageRequest, strGenerateUniqueFutureId, null, internalRequestListener2, obj, max, false, z2, imageRequest.getPriority(), this.config), internalRequestListener);
                Intrinsics.checkNotNullExpressionValue(dataSourceCreate, "{\n          val lowestPe…questListener2)\n        }");
                return dataSourceCreate;
            } catch (Exception e2) {
                DataSource<CloseableReference<T>> dataSourceImmediateFailedDataSource2 = DataSources.immediateFailedDataSource(e2);
                Intrinsics.checkNotNullExpressionValue(dataSourceImmediateFailedDataSource2, "{\n          DataSources.…urce(exception)\n        }");
                return dataSourceImmediateFailedDataSource2;
            }
        }
        FrescoSystrace.beginSection("ImagePipeline#submitFetchRequest");
        try {
            InternalRequestListener internalRequestListener3 = new InternalRequestListener(getRequestListenerForRequest(imageRequest, requestListener), this.requestListener2);
            CallerContextVerifier callerContextVerifier2 = this.callerContextVerifier;
            if (callerContextVerifier2 != null) {
                callerContextVerifier2.verifyCallerContext(obj, false);
            }
            try {
                ImageRequest.RequestLevel max2 = ImageRequest.RequestLevel.getMax(imageRequest.getLowestPermittedRequestLevel(), requestLevel);
                Intrinsics.checkNotNullExpressionValue(max2, "getMax(\n                …ttedRequestLevelOnSubmit)");
                String strGenerateUniqueFutureId2 = generateUniqueFutureId();
                InternalRequestListener internalRequestListener4 = internalRequestListener3;
                if (imageRequest.getProgressiveRenderingEnabled() || !UriUtil.isNetworkUri(imageRequest.getSourceUri())) {
                    z2 = true;
                }
                dataSourceImmediateFailedDataSource = CloseableProducerToDataSourceAdapter.create(producer, new SettableProducerContext(imageRequest, strGenerateUniqueFutureId2, null, internalRequestListener4, obj, max2, false, z2, imageRequest.getPriority(), this.config), internalRequestListener3);
                Intrinsics.checkNotNullExpressionValue(dataSourceImmediateFailedDataSource, "{\n          val lowestPe…questListener2)\n        }");
            } catch (Exception e3) {
                dataSourceImmediateFailedDataSource = DataSources.immediateFailedDataSource(e3);
                Intrinsics.checkNotNullExpressionValue(dataSourceImmediateFailedDataSource, "{\n          DataSources.…urce(exception)\n        }");
            }
            return dataSourceImmediateFailedDataSource;
        } finally {
            FrescoSystrace.endSection();
        }
    }

    private final DataSource<Void> submitPrefetchRequest(Producer<Void> producer, ImageRequest imageRequest, ImageRequest.RequestLevel requestLevel, Object obj, Priority priority, RequestListener requestListener) {
        InternalRequestListener internalRequestListener = new InternalRequestListener(getRequestListenerForRequest(imageRequest, requestListener), this.requestListener2);
        CallerContextVerifier callerContextVerifier = this.callerContextVerifier;
        boolean z2 = true;
        if (callerContextVerifier != null) {
            callerContextVerifier.verifyCallerContext(obj, true);
        }
        try {
            ImageRequest.RequestLevel max = ImageRequest.RequestLevel.getMax(imageRequest.getLowestPermittedRequestLevel(), requestLevel);
            Intrinsics.checkNotNullExpressionValue(max, "getMax(\n              im…ttedRequestLevelOnSubmit)");
            String strGenerateUniqueFutureId = generateUniqueFutureId();
            InternalRequestListener internalRequestListener2 = internalRequestListener;
            ImagePipelineExperiments experiments = this.config.getExperiments();
            if (experiments == null || !experiments.getAllowProgressiveOnPrefetch() || !imageRequest.getProgressiveRenderingEnabled()) {
                z2 = false;
            }
            return ProducerToDataSourceAdapter.Companion.create(producer, new SettableProducerContext(imageRequest, strGenerateUniqueFutureId, internalRequestListener2, obj, max, true, z2, priority, this.config), internalRequestListener);
        } catch (Exception e2) {
            DataSource<Void> dataSourceImmediateFailedDataSource = DataSources.immediateFailedDataSource(e2);
            Intrinsics.checkNotNullExpressionValue(dataSourceImmediateFailedDataSource, "{\n      DataSources.imme…taSource(exception)\n    }");
            return dataSourceImmediateFailedDataSource;
        }
    }

    public final void clearCaches() {
        clearMemoryCaches();
        clearDiskCaches();
    }

    public final void clearDiskCaches() {
        this.mainBufferedDiskCache.clearAll();
        this.smallImageBufferedDiskCache.clearAll();
    }

    public final void clearMemoryCaches() {
        Predicate<CacheKey> predicate = new Predicate() { // from class: com.facebook.imagepipeline.core.ImagePipeline$$ExternalSyntheticLambda3
            @Override // com.facebook.common.internal.Predicate
            public final boolean apply(Object obj) {
                return ImagePipeline.clearMemoryCaches$lambda$2((CacheKey) obj);
            }
        };
        this.bitmapMemoryCache.removeAll(predicate);
        this.encodedMemoryCache.removeAll(predicate);
    }

    public final void evictFromCache(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        evictFromMemoryCache(uri);
        evictFromDiskCache(uri);
    }

    public final void evictFromDiskCache(Uri uri) {
        ImageRequest imageRequestFromUri = ImageRequest.fromUri(uri);
        if (imageRequestFromUri == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        evictFromDiskCache(imageRequestFromUri);
    }

    public final void evictFromDiskCache(ImageRequest imageRequest) {
        if (imageRequest == null) {
            return;
        }
        CacheKey cacheKey = this.cacheKeyFactory.getEncodedCacheKey(imageRequest, null);
        BufferedDiskCache bufferedDiskCache = this.mainBufferedDiskCache;
        Intrinsics.checkNotNullExpressionValue(cacheKey, "cacheKey");
        bufferedDiskCache.remove(cacheKey);
        this.smallImageBufferedDiskCache.remove(cacheKey);
    }

    public final void evictFromMemoryCache(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Predicate<CacheKey> predicatePredicateForUri = predicateForUri(uri);
        this.bitmapMemoryCache.removeAll(predicatePredicateForUri);
        this.encodedMemoryCache.removeAll(predicatePredicateForUri);
    }

    public final DataSource<CloseableReference<CloseableImage>> fetchDecodedImage(ImageRequest imageRequest, Object obj) {
        return fetchDecodedImage$default(this, imageRequest, obj, null, null, null, 24, null);
    }

    public final DataSource<CloseableReference<CloseableImage>> fetchDecodedImage(ImageRequest imageRequest, Object obj, RequestListener requestListener) {
        Intrinsics.checkNotNullParameter(requestListener, "requestListener");
        return fetchDecodedImage$default(this, imageRequest, obj, null, requestListener, null, 16, null);
    }

    public final DataSource<CloseableReference<CloseableImage>> fetchDecodedImage(ImageRequest imageRequest, Object obj, ImageRequest.RequestLevel lowestPermittedRequestLevelOnSubmit) {
        Intrinsics.checkNotNullParameter(lowestPermittedRequestLevelOnSubmit, "lowestPermittedRequestLevelOnSubmit");
        return fetchDecodedImage$default(this, imageRequest, obj, lowestPermittedRequestLevelOnSubmit, null, null, 16, null);
    }

    public final DataSource<CloseableReference<CloseableImage>> fetchDecodedImage(ImageRequest imageRequest, Object obj, ImageRequest.RequestLevel requestLevel, RequestListener requestListener, String str) {
        ImageRequest.RequestLevel requestLevel2 = requestLevel;
        if (imageRequest == null) {
            DataSource<CloseableReference<CloseableImage>> dataSourceImmediateFailedDataSource = DataSources.immediateFailedDataSource(new NullPointerException());
            Intrinsics.checkNotNullExpressionValue(dataSourceImmediateFailedDataSource, "immediateFailedDataSource(NullPointerException())");
            return dataSourceImmediateFailedDataSource;
        }
        try {
            Producer<CloseableReference<CloseableImage>> decodedImageProducerSequence = this.producerSequenceFactory.getDecodedImageProducerSequence(imageRequest);
            if (requestLevel2 == null) {
                requestLevel2 = ImageRequest.RequestLevel.FULL_FETCH;
            }
            return submitFetchRequest(decodedImageProducerSequence, imageRequest, requestLevel2, obj, requestListener, str);
        } catch (Exception e2) {
            DataSource<CloseableReference<CloseableImage>> dataSourceImmediateFailedDataSource2 = DataSources.immediateFailedDataSource(e2);
            Intrinsics.checkNotNullExpressionValue(dataSourceImmediateFailedDataSource2, "{\n      DataSources.imme…taSource(exception)\n    }");
            return dataSourceImmediateFailedDataSource2;
        }
    }

    public final DataSource<CloseableReference<CloseableImage>> fetchDecodedImage(ImageRequest imageRequest, Object obj, ImageRequest.RequestLevel lowestPermittedRequestLevelOnSubmit, RequestListener requestListener, String str, Map<String, ?> map) {
        Intrinsics.checkNotNullParameter(lowestPermittedRequestLevelOnSubmit, "lowestPermittedRequestLevelOnSubmit");
        if (imageRequest == null) {
            DataSource<CloseableReference<CloseableImage>> dataSourceImmediateFailedDataSource = DataSources.immediateFailedDataSource(new NullPointerException());
            Intrinsics.checkNotNullExpressionValue(dataSourceImmediateFailedDataSource, "immediateFailedDataSource(NullPointerException())");
            return dataSourceImmediateFailedDataSource;
        }
        try {
            return submitFetchRequest(this.producerSequenceFactory.getDecodedImageProducerSequence(imageRequest), imageRequest, lowestPermittedRequestLevelOnSubmit, obj, requestListener, str, map);
        } catch (Exception e2) {
            DataSource<CloseableReference<CloseableImage>> dataSourceImmediateFailedDataSource2 = DataSources.immediateFailedDataSource(e2);
            Intrinsics.checkNotNullExpressionValue(dataSourceImmediateFailedDataSource2, "{\n      DataSources.imme…taSource(exception)\n    }");
            return dataSourceImmediateFailedDataSource2;
        }
    }

    public final DataSource<CloseableReference<PooledByteBuffer>> fetchEncodedImage(ImageRequest imageRequest, Object obj) {
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        return fetchEncodedImage(imageRequest, obj, null);
    }

    public final DataSource<CloseableReference<PooledByteBuffer>> fetchEncodedImage(ImageRequest imageRequest, Object obj, RequestListener requestListener) {
        ImageRequest imageRequest2 = imageRequest;
        Intrinsics.checkNotNullParameter(imageRequest2, "imageRequest");
        if (imageRequest2.getSourceUri() == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        try {
            Producer<CloseableReference<PooledByteBuffer>> encodedImageProducerSequence = this.producerSequenceFactory.getEncodedImageProducerSequence(imageRequest2);
            if (imageRequest2.getResizeOptions() != null) {
                imageRequest2 = ImageRequestBuilder.fromRequest(imageRequest2).setResizeOptions(null).build();
                Intrinsics.checkNotNullExpressionValue(imageRequest2, "fromRequest(imageRequest…sizeOptions(null).build()");
            }
            return submitFetchRequest(encodedImageProducerSequence, imageRequest2, ImageRequest.RequestLevel.FULL_FETCH, obj, requestListener, null, null);
        } catch (Exception e2) {
            DataSource<CloseableReference<PooledByteBuffer>> dataSourceImmediateFailedDataSource = DataSources.immediateFailedDataSource(e2);
            Intrinsics.checkNotNullExpressionValue(dataSourceImmediateFailedDataSource, "{\n      DataSources.imme…taSource(exception)\n    }");
            return dataSourceImmediateFailedDataSource;
        }
    }

    public final DataSource<CloseableReference<CloseableImage>> fetchImageFromBitmapCache(ImageRequest imageRequest, Object obj) {
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        return fetchDecodedImage(imageRequest, obj, ImageRequest.RequestLevel.BITMAP_MEMORY_CACHE);
    }

    public final String generateUniqueFutureId() {
        return String.valueOf(this.idCounter.getAndIncrement());
    }

    public final MemoryCache<CacheKey, CloseableImage> getBitmapMemoryCache() {
        return this.bitmapMemoryCache;
    }

    public final CacheKey getCacheKey(ImageRequest imageRequest, Object obj) {
        FrescoSystrace frescoSystrace = FrescoSystrace.INSTANCE;
        CacheKey postprocessedBitmapCacheKey = null;
        if (!FrescoSystrace.isTracing()) {
            if (imageRequest != null) {
                return imageRequest.getPostprocessor() != null ? this.cacheKeyFactory.getPostprocessedBitmapCacheKey(imageRequest, obj) : this.cacheKeyFactory.getBitmapCacheKey(imageRequest, obj);
            }
            return null;
        }
        FrescoSystrace.beginSection("ImagePipeline#getCacheKey");
        if (imageRequest != null) {
            try {
                postprocessedBitmapCacheKey = imageRequest.getPostprocessor() != null ? this.cacheKeyFactory.getPostprocessedBitmapCacheKey(imageRequest, obj) : this.cacheKeyFactory.getBitmapCacheKey(imageRequest, obj);
            } finally {
                FrescoSystrace.endSection();
            }
        }
        return postprocessedBitmapCacheKey;
    }

    public final CacheKeyFactory getCacheKeyFactory() {
        return this.cacheKeyFactory;
    }

    public final CloseableReference<CloseableImage> getCachedImage(CacheKey cacheKey) {
        if (cacheKey == null) {
            return null;
        }
        CloseableReference<CloseableImage> closeableReference = this.bitmapMemoryCache.get(cacheKey);
        if (closeableReference == null || closeableReference.get().getQualityInfo().isOfFullQuality()) {
            return closeableReference;
        }
        closeableReference.close();
        return null;
    }

    public final RequestListener getCombinedRequestListener(RequestListener requestListener) {
        return requestListener != null ? new ForwardingRequestListener(this.requestListener, requestListener) : this.requestListener;
    }

    public final ImagePipelineConfigInterface getConfig() {
        return this.config;
    }

    public final Supplier<DataSource<CloseableReference<CloseableImage>>> getDataSourceSupplier(ImageRequest imageRequest, Object obj, ImageRequest.RequestLevel requestLevel) {
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        return new Supplier<DataSource<CloseableReference<CloseableImage>>>() { // from class: com.facebook.imagepipeline.core.ImagePipeline.getDataSourceSupplier.1
            final /* synthetic */ Object $callerContext;
            final /* synthetic */ ImageRequest $imageRequest;
            final /* synthetic */ ImageRequest.RequestLevel $requestLevel;

            AnonymousClass1(ImageRequest imageRequest2, Object obj2, ImageRequest.RequestLevel requestLevel2) {
                imageRequest = imageRequest2;
                obj = obj2;
                requestLevel = requestLevel2;
            }

            @Override // com.facebook.common.internal.Supplier
            public DataSource<CloseableReference<CloseableImage>> get() {
                return ImagePipeline.fetchDecodedImage$default(ImagePipeline.this, imageRequest, obj, requestLevel, null, null, 24, null);
            }

            public String toString() {
                String string = Objects.toStringHelper(this).add("uri", imageRequest.getSourceUri()).toString();
                Intrinsics.checkNotNullExpressionValue(string, "toStringHelper(this).add…est.sourceUri).toString()");
                return string;
            }
        };
    }

    public final Supplier<DataSource<CloseableReference<CloseableImage>>> getDataSourceSupplier(ImageRequest imageRequest, Object obj, ImageRequest.RequestLevel requestLevel, RequestListener requestListener) {
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        return new Supplier<DataSource<CloseableReference<CloseableImage>>>() { // from class: com.facebook.imagepipeline.core.ImagePipeline.getDataSourceSupplier.2
            final /* synthetic */ Object $callerContext;
            final /* synthetic */ ImageRequest $imageRequest;
            final /* synthetic */ ImageRequest.RequestLevel $requestLevel;
            final /* synthetic */ RequestListener $requestListener;

            AnonymousClass2(ImageRequest imageRequest2, Object obj2, ImageRequest.RequestLevel requestLevel2, RequestListener requestListener2) {
                imageRequest = imageRequest2;
                obj = obj2;
                requestLevel = requestLevel2;
                requestListener = requestListener2;
            }

            @Override // com.facebook.common.internal.Supplier
            public DataSource<CloseableReference<CloseableImage>> get() {
                return ImagePipeline.fetchDecodedImage$default(ImagePipeline.this, imageRequest, obj, requestLevel, requestListener, null, 16, null);
            }

            public String toString() {
                String string = Objects.toStringHelper(this).add("uri", imageRequest.getSourceUri()).toString();
                Intrinsics.checkNotNullExpressionValue(string, "toStringHelper(this).add…est.sourceUri).toString()");
                return string;
            }
        };
    }

    public final Supplier<DataSource<CloseableReference<CloseableImage>>> getDataSourceSupplier(ImageRequest imageRequest, Object obj, ImageRequest.RequestLevel requestLevel, RequestListener requestListener, String str) {
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        return new Supplier<DataSource<CloseableReference<CloseableImage>>>() { // from class: com.facebook.imagepipeline.core.ImagePipeline.getDataSourceSupplier.3
            final /* synthetic */ Object $callerContext;
            final /* synthetic */ ImageRequest $imageRequest;
            final /* synthetic */ ImageRequest.RequestLevel $requestLevel;
            final /* synthetic */ RequestListener $requestListener;
            final /* synthetic */ String $uiComponentId;

            AnonymousClass3(ImageRequest imageRequest2, Object obj2, ImageRequest.RequestLevel requestLevel2, RequestListener requestListener2, String str2) {
                imageRequest = imageRequest2;
                obj = obj2;
                requestLevel = requestLevel2;
                requestListener = requestListener2;
                str = str2;
            }

            @Override // com.facebook.common.internal.Supplier
            public DataSource<CloseableReference<CloseableImage>> get() {
                return ImagePipeline.this.fetchDecodedImage(imageRequest, obj, requestLevel, requestListener, str);
            }

            public String toString() {
                String string = Objects.toStringHelper(this).add("uri", imageRequest.getSourceUri()).toString();
                Intrinsics.checkNotNullExpressionValue(string, "toStringHelper(this).add…est.sourceUri).toString()");
                return string;
            }
        };
    }

    public final Supplier<DataSource<CloseableReference<PooledByteBuffer>>> getEncodedImageDataSourceSupplier(ImageRequest imageRequest, Object obj) {
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        return new Supplier<DataSource<CloseableReference<PooledByteBuffer>>>() { // from class: com.facebook.imagepipeline.core.ImagePipeline.getEncodedImageDataSourceSupplier.1
            final /* synthetic */ Object $callerContext;
            final /* synthetic */ ImageRequest $imageRequest;

            C11451(ImageRequest imageRequest2, Object obj2) {
                imageRequest = imageRequest2;
                obj = obj2;
            }

            @Override // com.facebook.common.internal.Supplier
            public DataSource<CloseableReference<PooledByteBuffer>> get() {
                return ImagePipeline.this.fetchEncodedImage(imageRequest, obj);
            }

            public String toString() {
                String string = Objects.toStringHelper(this).add("uri", imageRequest.getSourceUri()).toString();
                Intrinsics.checkNotNullExpressionValue(string, "toStringHelper(this).add…est.sourceUri).toString()");
                return string;
            }
        };
    }

    public final ProducerSequenceFactory getProducerSequenceFactory() {
        return this.producerSequenceFactory;
    }

    public final RequestListener getRequestListenerForRequest(ImageRequest imageRequest, RequestListener requestListener) {
        if (imageRequest == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        if (requestListener == null) {
            return imageRequest.getRequestListener() == null ? this.requestListener : new ForwardingRequestListener(this.requestListener, imageRequest.getRequestListener());
        }
        return imageRequest.getRequestListener() == null ? new ForwardingRequestListener(this.requestListener, requestListener) : new ForwardingRequestListener(this.requestListener, requestListener, imageRequest.getRequestListener());
    }

    public final long getUsedDiskCacheSize() {
        return this.mainBufferedDiskCache.getSize() + this.smallImageBufferedDiskCache.getSize();
    }

    public final boolean hasCachedImage(CacheKey cacheKey) {
        if (cacheKey == null) {
            return false;
        }
        return this.bitmapMemoryCache.contains(cacheKey);
    }

    public final void init() {
    }

    public final boolean isInBitmapMemoryCache(Uri uri) {
        if (uri == null) {
            return false;
        }
        return this.bitmapMemoryCache.contains(predicateForUri(uri));
    }

    public final boolean isInBitmapMemoryCache(ImageRequest imageRequest) {
        if (imageRequest == null) {
            return false;
        }
        CacheKey cacheKey = this.cacheKeyFactory.getBitmapCacheKey(imageRequest, null);
        MemoryCache<CacheKey, CloseableImage> memoryCache = this.bitmapMemoryCache;
        Intrinsics.checkNotNullExpressionValue(cacheKey, "cacheKey");
        CloseableReference<CloseableImage> closeableReference = memoryCache.get(cacheKey);
        try {
            return CloseableReference.isValid(closeableReference);
        } finally {
            CloseableReference.closeSafely(closeableReference);
        }
    }

    public final DataSource<Boolean> isInDiskCache(Uri uri) {
        ImageRequest imageRequestFromUri = ImageRequest.fromUri(uri);
        if (imageRequestFromUri != null) {
            return isInDiskCache(imageRequestFromUri);
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public final DataSource<Boolean> isInDiskCache(ImageRequest imageRequest) {
        final CacheKey cacheKey = this.cacheKeyFactory.getEncodedCacheKey(imageRequest, null);
        final SimpleDataSource dataSource = SimpleDataSource.create();
        BufferedDiskCache bufferedDiskCache = this.mainBufferedDiskCache;
        Intrinsics.checkNotNullExpressionValue(cacheKey, "cacheKey");
        bufferedDiskCache.contains(cacheKey).continueWithTask(new Continuation() { // from class: com.facebook.imagepipeline.core.ImagePipeline$$ExternalSyntheticLambda0
            @Override // bolts.Continuation
            public final Object then(Task task) {
                return ImagePipeline.isInDiskCache$lambda$3(this.f$0, cacheKey, task);
            }
        }).continueWith(new Continuation() { // from class: com.facebook.imagepipeline.core.ImagePipeline$$ExternalSyntheticLambda1
            @Override // bolts.Continuation
            public final Object then(Task task) {
                return ImagePipeline.isInDiskCache$lambda$4(dataSource, task);
            }
        });
        Intrinsics.checkNotNullExpressionValue(dataSource, "dataSource");
        return dataSource;
    }

    public final boolean isInDiskCacheSync(Uri uri) {
        return isInDiskCacheSync(uri, ImageRequest.CacheChoice.SMALL) || isInDiskCacheSync(uri, ImageRequest.CacheChoice.DEFAULT);
    }

    public final boolean isInDiskCacheSync(Uri uri, ImageRequest.CacheChoice cacheChoice) {
        ImageRequest imageRequest = ImageRequestBuilder.newBuilderWithSource(uri).setCacheChoice(cacheChoice).build();
        Intrinsics.checkNotNullExpressionValue(imageRequest, "imageRequest");
        return isInDiskCacheSync(imageRequest);
    }

    public final boolean isInDiskCacheSync(ImageRequest imageRequest) {
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        CacheKey cacheKey = this.cacheKeyFactory.getEncodedCacheKey(imageRequest, null);
        ImageRequest.CacheChoice cacheChoice = imageRequest.getCacheChoice();
        Intrinsics.checkNotNullExpressionValue(cacheChoice, "imageRequest.cacheChoice");
        int i2 = WhenMappings.$EnumSwitchMapping$0[cacheChoice.ordinal()];
        if (i2 == 1) {
            BufferedDiskCache bufferedDiskCache = this.mainBufferedDiskCache;
            Intrinsics.checkNotNullExpressionValue(cacheKey, "cacheKey");
            return bufferedDiskCache.diskCheckSync(cacheKey);
        }
        if (i2 != 2) {
            return false;
        }
        BufferedDiskCache bufferedDiskCache2 = this.smallImageBufferedDiskCache;
        Intrinsics.checkNotNullExpressionValue(cacheKey, "cacheKey");
        return bufferedDiskCache2.diskCheckSync(cacheKey);
    }

    public final boolean isInEncodedMemoryCache(Uri uri) {
        if (uri == null) {
            return false;
        }
        return this.encodedMemoryCache.contains(predicateForUri(uri));
    }

    public final boolean isInEncodedMemoryCache(ImageRequest imageRequest) {
        if (imageRequest == null) {
            return false;
        }
        CacheKey cacheKey = this.cacheKeyFactory.getEncodedCacheKey(imageRequest, null);
        MemoryCache<CacheKey, PooledByteBuffer> memoryCache = this.encodedMemoryCache;
        Intrinsics.checkNotNullExpressionValue(cacheKey, "cacheKey");
        CloseableReference<PooledByteBuffer> closeableReference = memoryCache.get(cacheKey);
        try {
            return CloseableReference.isValid(closeableReference);
        } finally {
            CloseableReference.closeSafely(closeableReference);
        }
    }

    public final Supplier<Boolean> isLazyDataSource() {
        return this.isLazyDataSource;
    }

    public final boolean isPaused() {
        return this.threadHandoffProducerQueue.isQueueing();
    }

    public final void pause() {
        this.threadHandoffProducerQueue.startQueueing();
    }

    public final DataSource<Void> prefetchToBitmapCache(ImageRequest imageRequest, Object obj) {
        return prefetchToBitmapCache(imageRequest, obj, null);
    }

    public final DataSource<Void> prefetchToBitmapCache(ImageRequest imageRequest, Object obj, RequestListener requestListener) {
        DataSource<Void> dataSourceImmediateFailedDataSource;
        FrescoSystrace frescoSystrace = FrescoSystrace.INSTANCE;
        boolean zBooleanValue = true;
        if (!FrescoSystrace.isTracing()) {
            if (!this.isPrefetchEnabledSupplier.get().booleanValue()) {
                DataSource<Void> dataSourceImmediateFailedDataSource2 = DataSources.immediateFailedDataSource(PREFETCH_EXCEPTION);
                Intrinsics.checkNotNullExpressionValue(dataSourceImmediateFailedDataSource2, "immediateFailedDataSource(PREFETCH_EXCEPTION)");
                return dataSourceImmediateFailedDataSource2;
            }
            try {
                if (this.config.getExperiments().getPrefetchShortcutEnabled() && isInBitmapMemoryCache(imageRequest)) {
                    DataSource<Void> dataSourceImmediateSuccessfulDataSource = DataSources.immediateSuccessfulDataSource();
                    Intrinsics.checkNotNullExpressionValue(dataSourceImmediateSuccessfulDataSource, "immediateSuccessfulDataSource()");
                    return dataSourceImmediateSuccessfulDataSource;
                }
                if (imageRequest == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                Boolean boolShouldDecodePrefetches = imageRequest.shouldDecodePrefetches();
                if (boolShouldDecodePrefetches == null) {
                    Boolean bool = this.suppressBitmapPrefetchingSupplier.get();
                    Intrinsics.checkNotNullExpressionValue(bool, "suppressBitmapPrefetchin…                   .get()");
                    zBooleanValue = bool.booleanValue();
                } else if (boolShouldDecodePrefetches.booleanValue()) {
                    zBooleanValue = false;
                }
                return submitPrefetchRequest(zBooleanValue ? this.producerSequenceFactory.getEncodedImagePrefetchProducerSequence(imageRequest) : this.producerSequenceFactory.getDecodedImagePrefetchProducerSequence(imageRequest), imageRequest, ImageRequest.RequestLevel.FULL_FETCH, obj, Priority.MEDIUM, requestListener);
            } catch (Exception e2) {
                DataSource<Void> dataSourceImmediateFailedDataSource3 = DataSources.immediateFailedDataSource(e2);
                Intrinsics.checkNotNullExpressionValue(dataSourceImmediateFailedDataSource3, "{\n          DataSources.…urce(exception)\n        }");
                return dataSourceImmediateFailedDataSource3;
            }
        }
        FrescoSystrace.beginSection("ImagePipeline#prefetchToBitmapCache");
        try {
            if (!this.isPrefetchEnabledSupplier.get().booleanValue()) {
                DataSource<Void> dataSourceImmediateFailedDataSource4 = DataSources.immediateFailedDataSource(PREFETCH_EXCEPTION);
                Intrinsics.checkNotNullExpressionValue(dataSourceImmediateFailedDataSource4, "immediateFailedDataSource(PREFETCH_EXCEPTION)");
                return dataSourceImmediateFailedDataSource4;
            }
            try {
            } catch (Exception e3) {
                dataSourceImmediateFailedDataSource = DataSources.immediateFailedDataSource(e3);
                Intrinsics.checkNotNullExpressionValue(dataSourceImmediateFailedDataSource, "{\n          DataSources.…urce(exception)\n        }");
            }
            if (this.config.getExperiments().getPrefetchShortcutEnabled() && isInBitmapMemoryCache(imageRequest)) {
                DataSource<Void> dataSourceImmediateSuccessfulDataSource2 = DataSources.immediateSuccessfulDataSource();
                Intrinsics.checkNotNullExpressionValue(dataSourceImmediateSuccessfulDataSource2, "immediateSuccessfulDataSource()");
                return dataSourceImmediateSuccessfulDataSource2;
            }
            if (imageRequest == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            Boolean boolShouldDecodePrefetches2 = imageRequest.shouldDecodePrefetches();
            if (boolShouldDecodePrefetches2 == null) {
                Boolean bool2 = this.suppressBitmapPrefetchingSupplier.get();
                Intrinsics.checkNotNullExpressionValue(bool2, "suppressBitmapPrefetchin…                   .get()");
                zBooleanValue = bool2.booleanValue();
            } else if (boolShouldDecodePrefetches2.booleanValue()) {
                zBooleanValue = false;
            }
            dataSourceImmediateFailedDataSource = submitPrefetchRequest(zBooleanValue ? this.producerSequenceFactory.getEncodedImagePrefetchProducerSequence(imageRequest) : this.producerSequenceFactory.getDecodedImagePrefetchProducerSequence(imageRequest), imageRequest, ImageRequest.RequestLevel.FULL_FETCH, obj, Priority.MEDIUM, requestListener);
            return dataSourceImmediateFailedDataSource;
        } finally {
            FrescoSystrace.endSection();
        }
    }

    public final DataSource<Void> prefetchToDiskCache(ImageRequest imageRequest, Object obj) {
        return prefetchToDiskCache(imageRequest, obj, Priority.MEDIUM, null);
    }

    public final DataSource<Void> prefetchToDiskCache(ImageRequest imageRequest, Object obj, Priority priority) {
        Intrinsics.checkNotNullParameter(priority, "priority");
        return prefetchToDiskCache(imageRequest, obj, priority, null);
    }

    public final DataSource<Void> prefetchToDiskCache(ImageRequest imageRequest, Object obj, Priority priority, RequestListener requestListener) {
        Intrinsics.checkNotNullParameter(priority, "priority");
        if (!this.isPrefetchEnabledSupplier.get().booleanValue()) {
            DataSource<Void> dataSourceImmediateFailedDataSource = DataSources.immediateFailedDataSource(PREFETCH_EXCEPTION);
            Intrinsics.checkNotNullExpressionValue(dataSourceImmediateFailedDataSource, "immediateFailedDataSource(PREFETCH_EXCEPTION)");
            return dataSourceImmediateFailedDataSource;
        }
        if (imageRequest == null) {
            DataSource<Void> dataSourceImmediateFailedDataSource2 = DataSources.immediateFailedDataSource(new NullPointerException("imageRequest is null"));
            Intrinsics.checkNotNullExpressionValue(dataSourceImmediateFailedDataSource2, "{\n      DataSources.imme…eRequest is null\"))\n    }");
            return dataSourceImmediateFailedDataSource2;
        }
        try {
            return submitPrefetchRequest(this.producerSequenceFactory.getEncodedImagePrefetchProducerSequence(imageRequest), imageRequest, ImageRequest.RequestLevel.FULL_FETCH, obj, priority, requestListener);
        } catch (Exception e2) {
            DataSource<Void> dataSourceImmediateFailedDataSource3 = DataSources.immediateFailedDataSource(e2);
            Intrinsics.checkNotNullExpressionValue(dataSourceImmediateFailedDataSource3, "{\n        DataSources.im…Source(exception)\n      }");
            return dataSourceImmediateFailedDataSource3;
        }
    }

    public final DataSource<Void> prefetchToDiskCache(ImageRequest imageRequest, Object obj, RequestListener requestListener) {
        return prefetchToDiskCache(imageRequest, obj, Priority.MEDIUM, requestListener);
    }

    public final DataSource<Void> prefetchToEncodedCache(ImageRequest imageRequest, Object obj) {
        return prefetchToEncodedCache$default(this, imageRequest, obj, null, null, 12, null);
    }

    public final DataSource<Void> prefetchToEncodedCache(ImageRequest imageRequest, Object obj, Priority priority) {
        Intrinsics.checkNotNullParameter(priority, "priority");
        return prefetchToEncodedCache$default(this, imageRequest, obj, priority, null, 8, null);
    }

    public final DataSource<Void> prefetchToEncodedCache(ImageRequest imageRequest, Object obj, Priority priority, RequestListener requestListener) {
        DataSource<Void> dataSourceImmediateFailedDataSource;
        Intrinsics.checkNotNullParameter(priority, "priority");
        FrescoSystrace frescoSystrace = FrescoSystrace.INSTANCE;
        if (!FrescoSystrace.isTracing()) {
            if (!this.isPrefetchEnabledSupplier.get().booleanValue()) {
                DataSource<Void> dataSourceImmediateFailedDataSource2 = DataSources.immediateFailedDataSource(PREFETCH_EXCEPTION);
                Intrinsics.checkNotNullExpressionValue(dataSourceImmediateFailedDataSource2, "immediateFailedDataSource(PREFETCH_EXCEPTION)");
                return dataSourceImmediateFailedDataSource2;
            }
            if (imageRequest == null) {
                DataSource<Void> dataSourceImmediateFailedDataSource3 = DataSources.immediateFailedDataSource(NULL_IMAGEREQUEST_EXCEPTION);
                Intrinsics.checkNotNullExpressionValue(dataSourceImmediateFailedDataSource3, "immediateFailedDataSourc…L_IMAGEREQUEST_EXCEPTION)");
                return dataSourceImmediateFailedDataSource3;
            }
            try {
                if (!this.config.getExperiments().getPrefetchShortcutEnabled() || !isInEncodedMemoryCache(imageRequest)) {
                    return submitPrefetchRequest(this.producerSequenceFactory.getEncodedImagePrefetchProducerSequence(imageRequest), imageRequest, ImageRequest.RequestLevel.FULL_FETCH, obj, priority, requestListener);
                }
                DataSource<Void> dataSourceImmediateSuccessfulDataSource = DataSources.immediateSuccessfulDataSource();
                Intrinsics.checkNotNullExpressionValue(dataSourceImmediateSuccessfulDataSource, "immediateSuccessfulDataSource()");
                return dataSourceImmediateSuccessfulDataSource;
            } catch (Exception e2) {
                DataSource<Void> dataSourceImmediateFailedDataSource4 = DataSources.immediateFailedDataSource(e2);
                Intrinsics.checkNotNullExpressionValue(dataSourceImmediateFailedDataSource4, "{\n          DataSources.…urce(exception)\n        }");
                return dataSourceImmediateFailedDataSource4;
            }
        }
        FrescoSystrace.beginSection("ImagePipeline#prefetchToEncodedCache");
        try {
            if (!this.isPrefetchEnabledSupplier.get().booleanValue()) {
                DataSource<Void> dataSourceImmediateFailedDataSource5 = DataSources.immediateFailedDataSource(PREFETCH_EXCEPTION);
                Intrinsics.checkNotNullExpressionValue(dataSourceImmediateFailedDataSource5, "immediateFailedDataSource(PREFETCH_EXCEPTION)");
                return dataSourceImmediateFailedDataSource5;
            }
            if (imageRequest == null) {
                DataSource<Void> dataSourceImmediateFailedDataSource6 = DataSources.immediateFailedDataSource(NULL_IMAGEREQUEST_EXCEPTION);
                Intrinsics.checkNotNullExpressionValue(dataSourceImmediateFailedDataSource6, "immediateFailedDataSourc…L_IMAGEREQUEST_EXCEPTION)");
                return dataSourceImmediateFailedDataSource6;
            }
            try {
            } catch (Exception e3) {
                dataSourceImmediateFailedDataSource = DataSources.immediateFailedDataSource(e3);
                Intrinsics.checkNotNullExpressionValue(dataSourceImmediateFailedDataSource, "{\n          DataSources.…urce(exception)\n        }");
            }
            if (!this.config.getExperiments().getPrefetchShortcutEnabled() || !isInEncodedMemoryCache(imageRequest)) {
                dataSourceImmediateFailedDataSource = submitPrefetchRequest(this.producerSequenceFactory.getEncodedImagePrefetchProducerSequence(imageRequest), imageRequest, ImageRequest.RequestLevel.FULL_FETCH, obj, priority, requestListener);
                return dataSourceImmediateFailedDataSource;
            }
            DataSource<Void> dataSourceImmediateSuccessfulDataSource2 = DataSources.immediateSuccessfulDataSource();
            Intrinsics.checkNotNullExpressionValue(dataSourceImmediateSuccessfulDataSource2, "immediateSuccessfulDataSource()");
            return dataSourceImmediateSuccessfulDataSource2;
        } finally {
            FrescoSystrace.endSection();
        }
    }

    public final DataSource<Void> prefetchToEncodedCache(ImageRequest imageRequest, Object obj, RequestListener requestListener) {
        return prefetchToEncodedCache(imageRequest, obj, Priority.MEDIUM, requestListener);
    }

    public final void resume() {
        this.threadHandoffProducerQueue.stopQueuing();
    }

    public final <T> DataSource<CloseableReference<T>> submitFetchRequest(Producer<CloseableReference<T>> producerSequence, SettableProducerContext settableProducerContext, RequestListener requestListener) {
        DataSource<CloseableReference<T>> dataSourceImmediateFailedDataSource;
        Intrinsics.checkNotNullParameter(producerSequence, "producerSequence");
        Intrinsics.checkNotNullParameter(settableProducerContext, "settableProducerContext");
        FrescoSystrace frescoSystrace = FrescoSystrace.INSTANCE;
        if (!FrescoSystrace.isTracing()) {
            try {
                DataSource<CloseableReference<T>> dataSourceCreate = CloseableProducerToDataSourceAdapter.create(producerSequence, settableProducerContext, new InternalRequestListener(requestListener, this.requestListener2));
                Intrinsics.checkNotNullExpressionValue(dataSourceCreate, "{\n          val requestL…questListener2)\n        }");
                return dataSourceCreate;
            } catch (Exception e2) {
                DataSource<CloseableReference<T>> dataSourceImmediateFailedDataSource2 = DataSources.immediateFailedDataSource(e2);
                Intrinsics.checkNotNullExpressionValue(dataSourceImmediateFailedDataSource2, "{\n          DataSources.…urce(exception)\n        }");
                return dataSourceImmediateFailedDataSource2;
            }
        }
        FrescoSystrace.beginSection("ImagePipeline#submitFetchRequest");
        try {
            try {
                dataSourceImmediateFailedDataSource = CloseableProducerToDataSourceAdapter.create(producerSequence, settableProducerContext, new InternalRequestListener(requestListener, this.requestListener2));
                Intrinsics.checkNotNullExpressionValue(dataSourceImmediateFailedDataSource, "{\n          val requestL…questListener2)\n        }");
            } finally {
                FrescoSystrace.endSection();
            }
        } catch (Exception e3) {
            dataSourceImmediateFailedDataSource = DataSources.immediateFailedDataSource(e3);
            Intrinsics.checkNotNullExpressionValue(dataSourceImmediateFailedDataSource, "{\n          DataSources.…urce(exception)\n        }");
        }
        return dataSourceImmediateFailedDataSource;
    }
}
