package androidx.compose.runtime;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScatterSetWrapperKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.snapshots.MutableSnapshot;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotApplyResult;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.exifinterface.media.ExifInterface;
import com.drew.metadata.iptc.IptcDirectory;
import com.drew.metadata.photoshop.PhotoshopDirectory;
import com.google.zxing.pdf417.PDF417Common;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExceptionsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
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
/* JADX INFO: compiled from: Recomposer.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яġ\u0015D57\u001eq\u007fZDkŞ\fA\u001c0\u0013.H~*, \u0017\u000ff\u000198ǏmH<p[ճ\u0017k\u00124,[:qKП]\u001a\u0014\"\u0011ѧVguuRZ\u0011E\u0017\u0006$yrߚQU\u0007f\u001a\u000f8Gw?IMwމA`\u0003Y\r H\"@y\u001b\u0001\"*N\u0010~zYK\u0014\u0012>ϋx:X\rU\u0005(3\u000ē(\u0001,boN<Jt]P/+\u0003oEV'u0\u0005ձ\u0015Fj'\u0015vg13@M5\u001dǬ[\u0003\u001dRc?\t@y=\u001bh/ݐ3I\nW>X\u0006\u0018\u001d+e\rer4\\\rQf\u000e/+ecSִ\u0016(\u000ez\u0004\rB\n\u0016\u0006=H6-0f\u0010\u000e9\u0005zSVP\n^H\f\u0003aL\u0017-\u007fI+A\u001blRi;/N?ަ\r\r4#\tn7[\\\u000ev\u0015#T\u000eQ9QF=PN YEm\u001apj\u00020\b8G\u0016/\u0004\u00114\"-7q9+!q\rNI}ϸ#Ùg\u0004i\u0001Gx*Ā\u0015ֲ)Þ\u000bʯC \u0004,[d\\:\u0011e\u001c\u0003\bą\f\u0013.^@J/\u0004(N}F\u001an[=\"%]k}Y7y\u001c8Q^a\u0013\u0002g\u001eCjvB\"\u0003bM\\t&k\f\tAp.@.\u0003\u0010&Y\u000b\u008fJƱ6?\u007f\u0003|8?\u0001t\u0015v`dՖ\u007fҴ\r_hOX\u0003b\u001c<\u0003\u0018\u0002=\u000f\u000f:tp\u001eE?It\u0001n\rEA\u007f\u0013aNc\u000e\u00014+\u00017\u0003\u0002__gzL|{$bm\u00070\u0018*9\u007f\rk\u0001ä\u0003)8psSʆvgW= \u0018C5\b\u0001ShtZ(lvݚn]zSbv:v\rwS\u0014rs\u0012iV|Wc\u00030q=wF3cJCP\u0003\u0015!.%GbPj{ԉIے!\u0016\u0006\nw(oT\u0002o\\W\u0013\u00134l}\u0004Z\u0004\\}͈U]84\u0001WgxV*4n\u0013BvH\u000e\u0007pez\r{NO_\tVf+Q/Fy\u0015(%p\u00059j\u0017}uL.\u000eJ:Q\u0382\u0018^I\"Yaae\u0006my:;N\u001di#{_sX*ݞ$W]Ń\bx\u001d\u0002̺5Y;\u0011bl\u000f2Ҍ+T\t9͓S0\u0014خ~\u0001Lܯ\u000e_?Pǃ:n\u000e\u0003V#Ǝ\u0007ϖdEn\br\u001f\r۷26xc\u000f5qTLGc`!\u0004\"\u0017ƍig~\u0015FqRȗ=\u001c.߹\u007fS\\kŧH\u001a8\u001aFW\u000f\u001cs\u001a00|Kb^)ʦU\u0012eۆ/'\u0010c̰M|v@D\u001b]0ģ}\u0013|<\u001a:\u0013\u0019xgr\u001egsL\u0017$EƟ\u0019\u0019\u001dT+\u0017\f+ht\"]\u0011Cϒ<ap$)\fW\u0002[,\u000fP,5w\r)lY\u001ef8\u000319DE\\bJ*!г\u001f\u001c0`s!\u000f^\fD/\u001a30\u0018\u000feyk9H7-|\u0006pp~w873c7\u0004\u0019ӗeIV(L][+Ԧ&e4A͐Y#\u00122ބWA\t\u001a\u00154̔5 d?\u000f}h\u0019wqOiÔ*GkXvw0\u001b:\fμx\u000e\u0011:V8\u0015i{]@t\t\u000bJpĸ\r\u000fn6D\r\fW\u0019C~\u00113\u001fӛ3^rLB_y'\u0014sKM_\u0017\u0007UJTЎ0bT+J`пnĬz\u001e\t̩a\u0005\b0у\b\u0003\u0003m2SĔSM#7`4ot\u0003T)sяA\u00180!\u0010'.\t]Nۂ[ӭ <Wߣ@_։?ͤ<\u0007}߀\u0018}q_ƽ$B\u0001+\u0016S?BOyÂrOrQ\r?\u0002)˔eS2Eg\\':\u0007uL\u000fM\u00124=ˀ+\u0010˂Kf\tc˓~\"\u001fR\u00026y1_]1v/&\\\ts\u0002Ӹ\u0003>*dLt/Uلw\f\u0011<l(t\u0013տ`biA\"ԯH?0̞kOZ[˲x#D;#D;\u001deA3E\u0002V]ƣD,O؇Lwlkږ\u0012\f\u0004h\u0010\u0012;\bĆ?q*4|XT,yxұPw\u0010fo=\u0011\u0012WIR\u000f\u0005'\u001d`<YţEN\\'+qf\u0019 '$\r3\t\u001aƨ\n\u00174г\u0016J\u0007X§\u0014+5]ro~XVD&+ȀZ=\u0006SE3NMߒpp=g\u0011Qm\u0013zCǪ[\u001dUO)\u00151#ʗiC/uݦ=J0fǎ\r]evЗC?اfҵ41>ʦ}#Pkԕ\u001b7=\u0004r,܆pĲ;[rwsMeגQm#[V2\u0007\u001e\f1\u00139\u001f\u001aլpעw\u000e?ĿzPqWˋ{\u0006I>`\u0012N/\u000f\u001e?]F\u0012zʂi@\u001fڇ>G8.ϑ#\u001e 4dw\u0013\u001832a\u0013Ld4WۇJ\n\u0015t\"\u0003\u000f)y<:\u001a,m\u000eM\b!bJZQ^n\u007ftpYY]m\u00140uqvt\bRs/Lտ@қu\u0011kٔ0(|Wt`N\u0019g&n\u0018\u0018\u0019K-8҈Tׅ4\u0017]ۀ>|\u0002\\x\u0017i6{0\u0013\u0004!o;حe\u07ba@HtÃ7[\f&iD\u0011\u00157͢JƉ\u0014btԮwRVy1\u0001/Y\u0012\u001b\"D\\vQuqzxڪ.̏a+O͆\u001e\u0010pq\u0006&LkAH%qB{C\u0018\u0015\u070f~ûp\u0005UۺT}=F^Zn1c)}ьjǼ.\u0012$~\u000bB|j#c\u00047\u000bd-8Th\u0018\u009f;ݦ%\u0017\u001b\u001bB!@d)\r|rt%\\\u0011<mhܑ}ҽpE\f}9r\u007ff\u0005o,E\u0016o\b\"\u001dk@\t\u0012gyӾkϔ\u0015]6ֽH\u001fgZqM\u0012\f2)R(%)\u0012Hbk`AyÒ\u0011վ\u001cJnÐI7\u0017\b$5\u0005w\u001e2\u001c^\"j4Û6\u0088AUeˣ\u0016S=\u0015 eYw\u000f3W\u0012Y\u0018PNz\u0013$\u007fM\\&8\u0017q\u00141>\u0014\u000f_p6NÒdԸo:\u0004ҞS&xqF jh~l%U\u0010\u0014\u0014Ӭ\u000fн\t>{ޮsT3\u0007xo\u0010=\u0019pK<gD\u00133\u001bڋ4в6>\u001a݊\u0019jt73\u00023u\u001bhl˨GߡDO-]\n\u0013q}rsV\u0019@/8\"l\u0090)ס99\u0015߿!sC\u0016v\u000fe%\u001e'\u001dY6!fvАa^81a8\u001c{7^^\rY\u0007\u001b/MƦt́C\u001b\nȇ]$#usL8\u0011D!S]\u0017\t;҆ ʑ_[/ކN\u0014/IY!,\rR?VݻgʴSu\tͿ\u0019'\u001aR[6\u0018\u0016\u0015ez\nK\to5\u0016ؑ|ǂ/wgȆ\u0013\u0011\u001b^9(9-~\u07bcxōs\u00150ɘ\u0014%\u0005U\u0006\t>1\u007fe_իSȮ~\u001eJ\u0012&\u0011\u001eVZ%p\u001b\u0010\u007fO^fpJսO֒q\u0002Flu(\u0006u`a\u007fzu~&K{hfʢTȺ\u0018ftF-\u001b6[g ,_B$`!%pqՙjӎszjd\u0018\"B\u0006\u0006gNwC#/;7E܆'aC\u0016D\u001dc]5!t;hC@s+~@ΰ\nӵ!\b\u001eMkw*P\u001a\u0006/2L@P?9ǀ0п\u0010\rT݂}2D'T(I>+s^\u0004E\u0018v+KҠ1ّ\u0015v!r7zW)-1:)Ap\u001aze\u001f)ӀO՞3\u001e/(>-EV\u001cu0h]kk\u0017u\u0015;\u07b9AǇv\u05ca!5y߽/8MP\u001e&*A-\u0006GĢvՔy\u001c<שE4p:L.pw\u0006jlؖgį+[\nf\u00193B\u0015\u000b_(TvO\u0017\u000f6#[0I}YόPڝ7lkȏ&\u0015ja'7MkW0z\u007f)SRvHǰy܄euFG\u0006n7\u001ca38Z\u001a*\u001d{\u000b\u000ba\u0012z0\u0019¨\u0015֠D\u001e\bׇ'zW\u0010`}l8|]r\u0007\u0014\r\u0015\u0013Dȗ\u0018ʹIV6Ɠҵ!Իi"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<t/=d\b.7zk", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g\u0002/;w\u001f\fWLJkG-j", "3eU2V;\u001c]&\t\u000bm0\u0006\t\ro\t7{S\u0010", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u0003?b\r J|kq>", "-j]<j5\u001c]!\n\u0005l0\f\r9n\u000e", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF\u007f4Bc\u0005'7ls8UNEy8-\u0019rj\u000f", "-j]<j5\u001c]!\n\u0005l0\f\r9n\u000e\u0006w>\u0004\u0017", "", "-rc.g,", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011W\u001eKr\"<Yk/3|\u0016\u000fTMMA", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<t/=d\b.7zT\u001c\\?Jk\n", "0q^.W*:a(_\bZ4|f6o}.", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9jI\u0001!4Wy.FN#*UC\u0019r>\u001c\u001b>", "\nrTA \u0006\u0017", "", "1gP;Z,\u001c])\b\n", "5dc\u0010[(GU\u0019\\\u0005n5\f", "u(9", "1k^@X\n:c'~", "", "1n[9X*MW\"\u0001XZ3\u0004eCI\t)\u0006M\t\u0013&Ky\u0017", "", "5dc\u0010b3ES\u0017\u000e~g.Z\u00056l\\<_I\u0002!$Ok\u001d@\u0001.sf\u000e)Fq\u001e.GP;r4\u001a#h", "u(I", "1n[9X*MW\"\u0001eZ9x\u0011/t\u007f5_I\u0002!$Ok\u001d@\u0001.", "5dc\u0010b3ES\u0017\u000e~g.g\u0005<a\b(\u000b@\u000ez Hy\u001bDr49c\u0007^D}\u001f=QK;eA\u001e\u001ch]G\u0007", "1n[9X*MW\"\u0001hh<\n\u0007/I\t)\u0006M\t\u0013&Ky\u0017", "5dc\u0010b3ES\u0017\u000e~g.j\u0013?r}(_I\u0002!$Ok\u001d@\u0001.sf\u000e)Fq\u001e.GP;r4\u001a#h", "1n\\=b:Bb\u001d\t\u0004B5\u000e\u00056i~$\u000bD\u000b %", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\fF},5W\r$Av_\u0016]R7h;\u001e\u0006h_H\u0011p\u0002", "1n\\=b:Bb\u001d\t\u0004O(\u0004\u0019/S\u000f$\u000b@\u000fr(Cs\u00158s,5", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uF\b!2`}}Av%.VR)z0-\u0015Ua:\u0007p,Wt'\u001d", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uF\b!2`}}Av%.VR)z0-\u0015>", "1n\\=b:Bb\u001d\t\u0004O(\u0004\u0019/s[:wD\u0010\u001b IS\u0017Jv2D", "1n\\=b:Bb\u001d\t\u0004O(\u0004\u0019/sl(\u0004J\u0012\u0017\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uF\b!2`}}Av%.VR\u0011", "", "1n\\=b:Bb\u001d\t\u0004l\b\u000f\u00053t\u00041}\u001c\f\"\u001e[", "1n\\=b:Bb\u001d\t\u0004l\u0019|\u00119v\u007f'", "", "1n\\=b<GR{z\ta\u0012|\u001d", "", "5dc\u0010b4I])\byA(\u000b\f\u0015e\u0014f\tP\n&\u001bOo\bIv,5U\f ", "u(8", "1n]0h9KS\"\u000eXh4\b\u0013=i\u000f,\u0006I\u000f\u0001'V}\u001d8\u007f$9b\u007f", "1ta?X5MA(z\n^", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011]\u001d8\u0006%\u0016`\b2\r", "5dc\u0010h9KS\"\u000ehm(\f\t", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJ\u0018\u001eQ\u0002W*\u0006!DY^'A\u007fk", "5dc\u0012Y->Q(\\\u0005k6\r\u00183n\u007f\u0006\u0006I\u0010\u0017*V", "u(;8b;EW\"Hxh9\u0007\u0019>i\t(\n\n^!$Q\u007f\u001d@\u007f%\u0013c\u0007/7\u0001%\u0004", "3eU2V;#]\u0016", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b\u001f\"No\u001d8s,5>\b\u001d\r", "3qa<e\u001aMO(~", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<t/=d\b.7zT\u001bMAEs?(#hn\u0019\u0014p6[d6C[N\u0002", "4`X9X+\u001c]!\n\u0005l0\f\r9n\u000e", "4qP:X\nE]\u0017\u0005eZ<\u000b\t.", "6`b\u000fe6:R\u0017z\tm\r\n\u00057e]/\u0006>\u0007r)Cs\u001d<\u00043", "5dc\u0015T:\u001b`#zy\\(\u000b\u0018\u0010r{0{\u001e\b!\u0015MK 8z45f\f", "6`b\u000fe6:R\u0017z\tm\r\n\u00057e]/\u0006>\u0007r)Cs\u001d<\u00043\u001cc{&7l", "5dc\u0015T:\u001b`#zy\\(\u000b\u0018\u0010r{0{\u001e\b!\u0015MK 8z45f\f\u0007Ak\u001c.L", "6`b\u0010b5<c&\fzg;]\u0016+m\u007f\u001a\u0006M\u0007}!Eu\u000e;", "5dc\u0015T:\u001c]\"|\u000bk9|\u0012>F\r$\u0004@r!$MV\u0018:|%4", "6`b\u0013e(FS\u000b\t\bd\u0013\u0007\u00075e~", "5dc\u0015T:\u001f`\u0015\u0007zP6\n\u000f\u0016o}.{?", "6`b\u001dX5=W\"\u0001lh9\u0003", "5dc\u0015T:)S\"}~g.n\u0013<k", "6`b V/>R)\u0006~g.n\u0013<k", "5dc\u0015T:,Q\u001c~yn3\u0001\u00121W\n5\u0002", "7r29b:>R", "9m^Da\nH[$\t\tb;\u0001\u00138s", "5dc\u0018a6P\\v\t\u0003i6\u000b\r>i\n1\n", "u(;7T=:\u001d)\u000e~euc\r=tU", "@dR<`7Ha\u0019\\\u0005k6\r\u00183n\u007f\u0006\u0006I\u0010\u0017*V", "5dc\u001fX*H[$\t\t^\n\u0007\u00169u\u000f,\u0005@^! Vo!K52Eb\r$?m\u0010;MJ;gB\u001e", "@dR<`7Ha\u0019\f^g-\u0007", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<t/=d\b.7zT\u001bMAEs?(#hn\u001d\u0010d62~2N\"", "@t];X9#]\u0016", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E%\u000b\u0014l", "Ag^B_+$S\u0019\ng^*\u0007\u0011:o\u000e,\u0005B", "5dc [6NZ\u0018dz^7i\t-o\b3\u0006N\u0005 \u0019", "AmP=f/Hb|\b\fZ3\u0001\b+t\u00042\u0005N", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<d#1h\r D[\u0016=#", "AsPAX", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\tz", "5dc g(MSWz\u0004g6\f\u0005>i\n1\n", "u(E", "5dc g(MS", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJ\u0018\u001eQ\u0002W\u001d}/G/", "AsPAX\u0013HQ\u001f", "Ena866Gb\u001d\b\u000bZ;\u0001\u00138", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e| \u0015Gv\u00158s,57\b)Fq\u001f>IR?u=s", "", "/cS\u0018a6P\\v\t\u0003i6\u000b\r>i\n1bJ~\u001d\u0017F", "1n\\=b:Bb\u001d\t\u0004", "/o_9l\bGRv\u0002z\\2", "AmP=f/Hb", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7}>\\?8r4\f\u001edlG\nm;$", "/rA2V6F^#\rzk\u0010\u0006\n9", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<t/=d\b.7zy7NM\u0011", "/vP6g\u0010=Z\u0019", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "/vP6g\u001eH`\u001fZ\fZ0\u0004\u0005,l\u007f", "1`]0X3", "1kT.e\u0012G]+\bXh4\b\u0013=i\u000f,\u0006I\u000f}!Eu\u000e;", "1k^@X", "1n\\=b:>7\"\u0003\nb(\u0004", "1n]AX5M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "1n\\=b:>7\"\u0003\nb(\u0004G<u\t7\u007fH\u0001\u0011$Gv\u000e8\u0005%", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001.Df\b'>m\u0015\fWKFuB\"$lkB\\J2X\u0006.KU\u00181mZ<>$\u001bX\u001dR5\u0016\u0013#\"4wBF#\u00125\u0016W~Y", "1n\\=b:B\\\u001b", "\"", ";nS6Y0>R\nz\u0002n,\u000b", "0k^0^", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001.Df\b'>m\u0015\fWKFuB\"$lkB\\J(Wu4QPM?&P|D\u001b\u0012X\u001dR5\u0016NAQ3jA>\u001fu*E\u0011Jh\u000ey\u0016\u001d\u000bQvLe\u0017K\u0003^zR12GihwVEOk8.lo&ZI>.\u001d<n^OU*\u001bw\u001d\u0018n[{1QD\u001ez63\u0014", "2d[2g,=;#\u0010v[3|f9n\u000f(\u0005O", "@dU2e,GQ\u0019", "2d[2g,=;#\u0010v[3|f9n\u000f(\u0005O?$'P~\u0012Dv\u001fBY\u0005 3{\u0016", "2da6i,,b\u0015\u000ezE6z\u000f/d", "2hb0T9=C\"\u000f\t^+m\u00056u\u007f6", "7mb2e;&]*zwe,Z\u00138t\u007f1\u000b", "7mb2e;&]*zwe,Z\u00138t\u007f1\u000b~\u000e' Vs\u0016<p25`}\u001cEm", "7me._0=O(~", "7me._0=O(~9k<\u0006\u00183m\u007f\"\t@\b\u0017\u0013Uo", "7me._0=O(~h\\6\b\t", "Ab^=X", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<t/=d\b.7[\u00148XC\u001fs?%j", "7me._0=O(~h\\6\b\tmr\u00101\u000bD\t\u0017\u0011To\u0015<r35", "8nX;", ";ne.U3>1#\b\n^5\fv>a\u000f(h@\b\u0017\u0013Uo\r", "2`c.", ";ne.U3>1#\b\n^5\fv>a\u000f(h@\b\u0017\u0013Uo\rz\u00045>h\u0002(7g#.TC7y4", ";ne.U3>1#\b\n^5\fv>a\u000f(h@\u000f!\u001eXo", ";ne.U3>1#\b\n^5\fv>a\u000f(h@\u000f!\u001eXoLI\u0007.D]\u0006 1z\u00165M?Ik", ">`d@X\nH[$\t\tb;\u0001\u00138F\r$\u0004@^\u001e!Eu", ">da3b9F7\"\u0003\nb(\u0004p9v{%\u0003@^! Vo\u0017KZ.CY\u000b/E", ">da3b9F7\"\rzk;m\u00056u\u007f6", "@dU2e,GQ\u0019\r", ">da3b9F@\u0019|\u0005f7\u0007\u0017/", ">q^0X:L1#\u0007\u0006h:\u0001\u00183o\t\b\tM\u000b$", ExifInterface.GPS_MEASUREMENT_3D, "\u001aiPCTuEO\"\u0001D>?z\t:t\u00042\u0005\u0016", "\u001aj^A_0G\u001dx\u0012x^7\f\r9nU", "4`X9X+\"\\\u001d\u000e~Z3Z\u00137p\n6\u007fO\u0005! ", "@dR<i,KO\u0016\u0006z", "@dP1B)LS&\u0010zk\u0016}", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "@dR<`7Ha\u001d\u000e~h5i\u00198n\u007f5", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uF\u007f/Dc\u0007$5N#*UC\u0019r>\u001c\u001b>", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", ">`a2a;\u001f`\u0015\u0007z<3\u0007\u00075", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>'S\u0007=w%5QL\u0005i>+\u001fxp=\u0010c:\u0018T1P[R5lN\u0002A\u001e\u001b0Q50\t\u0016U\u000b+jM9hq)N\u00029wV", "@dR<e+\u001c]!\n\u0005l,\np9d\u0004)\u007f>|&\u001bQx\u001c", "=m4.V/\"\\*z\u0002b+Z\u00137p\n6\u007fO\u0005! ", "@dR<e+\u001fO\u001d\u0006z]\n\u0007\u0011:o\u000e,\u000bD\u000b }Qm\u0014<u", "@dR<e+\"\\'\nz\\;\u0001\u00138T{%\u0003@", "B`Q9X", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001dF\u0001,9b\u007fi\u0015w\u001e9WQ?z8(\u001eG]H\u00039", "@dR<e+\"\\'\nz\\;\u0001\u00138T{%\u0003@?$'P~\u0012Dv\u001fBY\u0005 3{\u0016", "@dV6f;>`v\t\u0003i6\u000b\r>i\n1", "@dV6f;>`v\t\u0003i6\u000b\r>i\n1:M\u0011 &Kw\u000e6\u0004%<Yy.7", "@dV6f;>`\u0006\u000f\u0004g,\nm9b", "1`[9\\5@8#{", "@d\\<i,$\\#\u0011\u0004<6\u0005\u00149s\u00047\u007fJ\n}!Eu\u000e;", "@d_<e;+S!\t\f^+Z\u00137p\n6\u007fO\u0005! ", "@d_<e;+S!\t\f^+Z\u00137p\n6\u007fO\u0005! \u0006|\u001eE\u0006)=Yw-7t\u0016*[C", "@db2g\fK`#\fhm(\f\t", "@dbB`,\u001c]!\n\u0005l0\f\r9n`5wH\u0001t\u001eQm\u0014", "@dc?l\r:W ~y<6\u0005\u00149s\u00047\u007fJ\n%", "@t]\u0013e(FS\u007f\t\u0005i", "4qP:X\u001aBU\"z\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9xI\u0001$EW}\u0001Di\u001e.;G=t0%j", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW$\u0001.?h\b);kv;IK;I;(\u0013n7 \u0003l+[\u0001+F_\u0018*fZ}G\"\u0012$\u001b^4\u001c\taAmYQA\u001e\u0018*IbHd\t\f\u0004\u00127slI,vM\u0004$|E22Dcl\u0004WPIk*rU='eI>-$m(\u001frY\u0004MbX\r\u0004NCncP\u001bD\"!CmYU\u001b", "@t]\u001fX*H[$\t\t^\b\u0006\b\u000bp\u000b/\u0010\u001e\u0004\u0013 Io\u001c", "@t]\u001fX*H[$\t\t^\n\u0007\u0012-u\r5{I\u0010\u001e+#x\r\u0018\u00020<m[#3v\u0018.[", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u0003?b\r J|k\u0015SMJr8'^fkF\u0011s;R\u007f'U\u0016,6eavF$\u000ei\u0012X4bH@F \u007f@\u0001&\u00045KK%e\u0006\f\u0014\u001d\u000b", "Cma2Z0Lb\u0019\fXh4\b\u0013=i\u000f,\u0006I", "Cma2Z0Lb\u0019\fXh4\b\u0013=i\u000f,\u0006I?$'P~\u0012Dv\u001fBY\u0005 3{\u0016", "EqXAX\u0016;a\u0019\f\f^9f\n", "\u0011n\\=T5B]\"", "\u0016nc\u001fX3HO\u0018zwe,", " dR<`7Ha\u0019\fZk9\u0007\u0016\u001dt{7{", " dR<`7Ha\u0019\f^g-\u0007l7p\u0007", "!sPAX", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Recomposer extends CompositionContext {
    private final List<ControlledComposition> _knownCompositions;
    private List<? extends ControlledComposition> _knownCompositionsCache;
    private final MutableStateFlow<State> _state;
    private final BroadcastFrameClock broadcastFrameClock;
    private long changeCount;
    private Throwable closeCause;
    private final MutableVector<ControlledComposition> compositionInvalidations;
    private final Map<MovableContentStateReference, MovableContentState> compositionValueStatesAvailable;
    private final List<MovableContentStateReference> compositionValuesAwaitingInsert;
    private final Map<MovableContent<Object>, List<MovableContentStateReference>> compositionValuesRemoved;
    private final List<ControlledComposition> compositionsAwaitingApply;
    private Set<ControlledComposition> compositionsRemoved;
    private int concurrentCompositionsOutstanding;
    private final CoroutineContext effectCoroutineContext;
    private final CompletableJob effectJob;
    private RecomposerErrorState errorState;
    private List<ControlledComposition> failedCompositions;
    private boolean frameClockPaused;
    private boolean isClosed;
    private final RecomposerInfoImpl recomposerInfo;
    private Job runnerJob;
    private MutableScatterSet<Object> snapshotInvalidations;
    private final Object stateLock;
    private CancellableContinuation<? super Unit> workContinuation;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final MutableStateFlow<PersistentSet<RecomposerInfoImpl>> _runningRecomposers = StateFlowKt.MutableStateFlow(ExtensionsKt.persistentSetOf());
    private static final AtomicReference<Boolean> _hotReloadEnabled = new AtomicReference<>(false);

    /* JADX INFO: compiled from: Recomposer.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eRLcz\nGّ/!Ǟr\u00052.\"w5߿\u00198pIkH¯VS8\u000fT{:%D$wE$U \u0001\u000b\tURPgtOC\u000bI\u0015َ\u001a\u007f"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<t/=d\b.7zT\u001c\\?Jk\n", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "!gdA76P\\", "!gdAg0GUw\t\rg", "\u0017mP0g0OS", "\u0017mP0g0OS\u0004~\u0004]0\u0006\u000b!o\r.", "\u0017c[2", "\u001ed]1\\5@E#\f\u0001", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public enum State {
        ShutDown,
        ShuttingDown,
        Inactive,
        InactivePendingWork,
        Idle,
        PendingWork
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.Recomposer$runFrameLoop$1 */
    /* JADX INFO: compiled from: Recomposer.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0007\u000b\u0005\f\u0002\u0007\u007fIn\u0003\u0002\u000f\u000e\u0012\u0012\u0017\n\u0018", f = "\u001f1.96869*6p-5", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {921, PDF417Common.MAX_CODEWORDS_IN_BARCODE}, m = "AE?\u0018E5B;#GHJ", n = {"c^kY", "_WtK`j(Y7GK\rCI\"1", "UhcSWIKND;R", "ceTKUeOWEMK", "ceCVbb[", "c^kY", "_WtK`j(Y7GK\rCI\"1", "UhcSWIKND;R", "ceTKUeOWEMK", "ceCVbb["}, s = {"xQ^", "xQ_", "xQ`", "xQa", "xQb", "xQ^", "xQ_", "xQ`", "xQa", "xQb"})
    static final class C07411 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        C07411(Continuation<? super C07411> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
            return Recomposer.this.runFrameLoop(null, null, this);
        }
    }

    @Deprecated(message = "\u0015K\fArw\u001a[\u0018IA:S*>`aZ\u001d\u001a\u0019i W6G\u0002*O4\u0017zi`i(Yk\u007f", replaceWith = @ReplaceWith(expression = "currentState", imports = {}))
    @InterfaceC1492Gx
    public static /* synthetic */ void getState$annotations() {
    }

    @Override // androidx.compose.runtime.CompositionContext
    public boolean getCollectingParameterInformation$runtime_release() {
        return false;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public boolean getCollectingSourceInformation$runtime_release() {
        return false;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public int getCompoundHashKey$runtime_release() {
        return 1000;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void recordInspectionTable$runtime_release(Set<CompositionData> set) {
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void registerComposition$runtime_release(ControlledComposition controlledComposition) {
    }

    public Recomposer(CoroutineContext coroutineContext) {
        BroadcastFrameClock broadcastFrameClock = new BroadcastFrameClock(new Function0<Unit>() { // from class: androidx.compose.runtime.Recomposer$broadcastFrameClock$1
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
                CancellableContinuation cancellableContinuationDeriveStateLocked;
                Object obj = this.this$0.stateLock;
                Recomposer recomposer = this.this$0;
                synchronized (obj) {
                    cancellableContinuationDeriveStateLocked = recomposer.deriveStateLocked();
                    if (((Recomposer.State) recomposer._state.getValue()).compareTo(Recomposer.State.ShuttingDown) <= 0) {
                        throw ExceptionsKt.CancellationException("Recomposer shutdown; frame clock awaiter will never resume", recomposer.closeCause);
                    }
                }
                if (cancellableContinuationDeriveStateLocked != null) {
                    Result.Companion companion = Result.Companion;
                    cancellableContinuationDeriveStateLocked.resumeWith(Result.m8980constructorimpl(Unit.INSTANCE));
                }
            }
        });
        this.broadcastFrameClock = broadcastFrameClock;
        this.stateLock = new Object();
        this._knownCompositions = new ArrayList();
        this.snapshotInvalidations = new MutableScatterSet<>(0, 1, null);
        this.compositionInvalidations = new MutableVector<>(new ControlledComposition[16], 0);
        this.compositionsAwaitingApply = new ArrayList();
        this.compositionValuesAwaitingInsert = new ArrayList();
        this.compositionValuesRemoved = new LinkedHashMap();
        this.compositionValueStatesAvailable = new LinkedHashMap();
        this._state = StateFlowKt.MutableStateFlow(State.Inactive);
        CompletableJob completableJobJob = JobKt.Job((Job) coroutineContext.get(Job.Key));
        completableJobJob.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.runtime.Recomposer$effectJob$1$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(final Throwable th) {
                CancellableContinuation cancellableContinuation;
                CancellableContinuation cancellableContinuation2;
                CancellationException CancellationException = ExceptionsKt.CancellationException("Recomposer effect job completed", th);
                Object obj = this.this$0.stateLock;
                final Recomposer recomposer = this.this$0;
                synchronized (obj) {
                    Job job = recomposer.runnerJob;
                    cancellableContinuation = null;
                    if (job != null) {
                        recomposer._state.setValue(Recomposer.State.ShuttingDown);
                        if (recomposer.isClosed) {
                            if (recomposer.workContinuation != null) {
                                cancellableContinuation2 = recomposer.workContinuation;
                            }
                            recomposer.workContinuation = null;
                            job.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.runtime.Recomposer$effectJob$1$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                                    invoke2(th2);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(Throwable th2) {
                                    Object obj2 = recomposer.stateLock;
                                    Recomposer recomposer2 = recomposer;
                                    Throwable th3 = th;
                                    synchronized (obj2) {
                                        if (th3 != null) {
                                            if (th2 != null) {
                                                if (th2 instanceof CancellationException) {
                                                    th2 = null;
                                                }
                                                if (th2 != null) {
                                                    kotlin.ExceptionsKt.addSuppressed(th3, th2);
                                                }
                                            }
                                        }
                                        th3 = null;
                                        recomposer2.closeCause = th3;
                                        recomposer2._state.setValue(Recomposer.State.ShutDown);
                                        Unit unit = Unit.INSTANCE;
                                    }
                                }
                            });
                            cancellableContinuation = cancellableContinuation2;
                        } else {
                            job.cancel(CancellationException);
                        }
                        cancellableContinuation2 = null;
                        recomposer.workContinuation = null;
                        job.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.runtime.Recomposer$effectJob$1$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                                invoke2(th2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Throwable th2) {
                                Object obj2 = recomposer.stateLock;
                                Recomposer recomposer2 = recomposer;
                                Throwable th3 = th;
                                synchronized (obj2) {
                                    if (th3 != null) {
                                        if (th2 != null) {
                                            if (th2 instanceof CancellationException) {
                                                th2 = null;
                                            }
                                            if (th2 != null) {
                                                kotlin.ExceptionsKt.addSuppressed(th3, th2);
                                            }
                                        }
                                    }
                                    th3 = null;
                                    recomposer2.closeCause = th3;
                                    recomposer2._state.setValue(Recomposer.State.ShutDown);
                                    Unit unit = Unit.INSTANCE;
                                }
                            }
                        });
                        cancellableContinuation = cancellableContinuation2;
                    } else {
                        recomposer.closeCause = CancellationException;
                        recomposer._state.setValue(Recomposer.State.ShutDown);
                        Unit unit = Unit.INSTANCE;
                    }
                }
                if (cancellableContinuation != null) {
                    Result.Companion companion = Result.Companion;
                    cancellableContinuation.resumeWith(Result.m8980constructorimpl(Unit.INSTANCE));
                }
            }
        });
        this.effectJob = completableJobJob;
        this.effectCoroutineContext = coroutineContext.plus(broadcastFrameClock).plus(completableJobJob);
        this.recomposerInfo = new RecomposerInfoImpl();
    }

    public final long getChangeCount() {
        return this.changeCount;
    }

    public final List<ControlledComposition> getKnownCompositions() {
        List listEmptyList = this._knownCompositionsCache;
        if (listEmptyList == null) {
            List<ControlledComposition> list = this._knownCompositions;
            listEmptyList = list.isEmpty() ? CollectionsKt.emptyList() : new ArrayList(list);
            this._knownCompositionsCache = listEmptyList;
        }
        return listEmptyList;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public CoroutineContext getEffectCoroutineContext() {
        return this.effectCoroutineContext;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public CoroutineContext getRecomposeCoroutineContext$runtime_release() {
        return EmptyCoroutineContext.INSTANCE;
    }

    private final boolean getHasBroadcastFrameClockAwaitersLocked() {
        return !this.frameClockPaused && this.broadcastFrameClock.getHasAwaiters();
    }

    public final boolean getHasBroadcastFrameClockAwaiters() {
        boolean hasBroadcastFrameClockAwaitersLocked;
        synchronized (this.stateLock) {
            hasBroadcastFrameClockAwaitersLocked = getHasBroadcastFrameClockAwaitersLocked();
        }
        return hasBroadcastFrameClockAwaitersLocked;
    }

    public final CancellableContinuation<Unit> deriveStateLocked() {
        State state;
        if (this._state.getValue().compareTo(State.ShuttingDown) <= 0) {
            clearKnownCompositionsLocked();
            this.snapshotInvalidations = new MutableScatterSet<>(0, 1, null);
            this.compositionInvalidations.clear();
            this.compositionsAwaitingApply.clear();
            this.compositionValuesAwaitingInsert.clear();
            this.failedCompositions = null;
            CancellableContinuation<? super Unit> cancellableContinuation = this.workContinuation;
            if (cancellableContinuation != null) {
                CancellableContinuation.DefaultImpls.cancel$default(cancellableContinuation, null, 1, null);
            }
            this.workContinuation = null;
            this.errorState = null;
            return null;
        }
        if (this.errorState != null) {
            state = State.Inactive;
        } else if (this.runnerJob == null) {
            this.snapshotInvalidations = new MutableScatterSet<>(0, 1, null);
            this.compositionInvalidations.clear();
            state = getHasBroadcastFrameClockAwaitersLocked() ? State.InactivePendingWork : State.Inactive;
        } else {
            state = (this.compositionInvalidations.isNotEmpty() || this.snapshotInvalidations.isNotEmpty() || !this.compositionsAwaitingApply.isEmpty() || !this.compositionValuesAwaitingInsert.isEmpty() || this.concurrentCompositionsOutstanding > 0 || getHasBroadcastFrameClockAwaitersLocked()) ? State.PendingWork : State.Idle;
        }
        this._state.setValue(state);
        if (state != State.PendingWork) {
            return null;
        }
        CancellableContinuation cancellableContinuation2 = this.workContinuation;
        this.workContinuation = null;
        return cancellableContinuation2;
    }

    public final boolean getShouldKeepRecomposing() {
        boolean z2;
        synchronized (this.stateLock) {
            z2 = this.isClosed;
        }
        if (z2) {
            Iterator<Job> it = this.effectJob.getChildren().iterator();
            while (it.hasNext()) {
                if (it.next().isActive()) {
                }
            }
            return false;
        }
        return true;
    }

    public final Flow<State> getState() {
        return getCurrentState();
    }

    public final StateFlow<State> getCurrentState() {
        return this._state;
    }

    /* JADX INFO: compiled from: Recomposer.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯP\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00126B\u0005#4\u0012\u000e\u0007nj?1LeV7ZS0\u0010s{J$c$\bCCU ~*\t]No˧vJh\u0011KƤ\u000e\u0016\u000fj4I[xe\u0012\u001dPJoU3UڎCʣb\u000bȂ5 `!x|ڱ\u0005\u001a8HX\u0003\tUc\f@CptHf%M3/Z\fL6\u0019 rf|M\u0011pkRG#1|\u000bX5xH\u0003]\u000fVTU(%{n=N8M\u0015SU9[)ÐAƄCuU\u0007n*5/\u001a\u0005e;p\u0002*\u0014YUC\"ę*`\u001dSf\u001353 uYY&(&\u00052a\u0013Ǡ\u0010Ν+LF/ q\u0016\u001a\u0004\r\u0001`XV\u0012`R\u007f)pd%[T\nږ;ӸjUy=\u001f^E\r̅\u0011:"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<t/=d\b.7zT\u001bMAEs?(#hn\u001d\u0010d62~2N\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<t/=d\b.7zy7NM\u0011", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW)v#?a\t*Em#\u0004\u00114", "1gP;Z,\u001c])\b\n", "", "5dc\u0010[(GU\u0019\\\u0005n5\f", "u(9", "1ta?X5M3&\f\u0005k", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<t/=d\b.7zu;ZMHO=\u001f\u001f>", "5dc\u0010h9KS\"\u000eZk9\u0007\u0016", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006c%3c\u0006+A{\u0016;-PHuA\u0002\u001eik\u000f", "6`b\u001dX5=W\"\u0001lh9\u0003", "", "5dc\u0015T:)S\"}~g.n\u0013<k", "u(I", "AsPAX", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\tz", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<t/=d\b.7zT\u001c\\?Jk\n", "5dc g(MS", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJ\u0018\u001eQ\u0002W\u001d}/G/", "7me._0=O(~\\k6\r\u0014=W\u00047~&\u0001+", "", "9dh", "", "@db2g\fK`#\fhm(\f\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<t/=d\b.7zT\u001bMAEs?(#hn\u0019\u0014p6[d6C[N\u0002", "@dc?l\r:W ~y<6\u0005\u00149s\u00047\u007fJ\n%", "A`e2F;:b\u0019Z\u0004]\u000b\u0001\u0017:o\u000e(\\J\u000ey!V\\\u000eC\u0001!4", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<t/=d\b.7zT\u0011WR(k;(\u0011g]6\u000ec\u0002", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private final class RecomposerInfoImpl implements RecomposerInfo {
        public RecomposerInfoImpl() {
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        public Flow<State> getState() {
            return Recomposer.this.getCurrentState();
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        public boolean getHasPendingWork() {
            return Recomposer.this.getHasPendingWork();
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        public long getChangeCount() {
            return Recomposer.this.getChangeCount();
        }

        public final RecomposerErrorInfo getCurrentError() {
            RecomposerErrorState recomposerErrorState;
            Object obj = Recomposer.this.stateLock;
            Recomposer recomposer = Recomposer.this;
            synchronized (obj) {
                recomposerErrorState = recomposer.errorState;
            }
            return recomposerErrorState;
        }

        public final void invalidateGroupsWithKey(int i2) {
            List knownCompositions;
            Object obj = Recomposer.this.stateLock;
            Recomposer recomposer = Recomposer.this;
            synchronized (obj) {
                knownCompositions = recomposer.getKnownCompositions();
            }
            ArrayList arrayList = new ArrayList(knownCompositions.size());
            int size = knownCompositions.size();
            for (int i3 = 0; i3 < size; i3++) {
                ControlledComposition controlledComposition = (ControlledComposition) knownCompositions.get(i3);
                CompositionImpl compositionImpl = controlledComposition instanceof CompositionImpl ? (CompositionImpl) controlledComposition : null;
                if (compositionImpl != null) {
                    arrayList.add(compositionImpl);
                }
            }
            ArrayList arrayList2 = arrayList;
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                ((CompositionImpl) arrayList2.get(i4)).invalidateGroupsWithKey(i2);
            }
        }

        public final List<HotReloadable> saveStateAndDisposeForHotReload() {
            List knownCompositions;
            Object obj = Recomposer.this.stateLock;
            Recomposer recomposer = Recomposer.this;
            synchronized (obj) {
                knownCompositions = recomposer.getKnownCompositions();
            }
            ArrayList arrayList = new ArrayList(knownCompositions.size());
            int size = knownCompositions.size();
            for (int i2 = 0; i2 < size; i2++) {
                ControlledComposition controlledComposition = (ControlledComposition) knownCompositions.get(i2);
                CompositionImpl compositionImpl = controlledComposition instanceof CompositionImpl ? (CompositionImpl) controlledComposition : null;
                if (compositionImpl != null) {
                    arrayList.add(compositionImpl);
                }
            }
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList(arrayList2.size());
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                HotReloadable hotReloadable = new HotReloadable((CompositionImpl) arrayList2.get(i3));
                hotReloadable.clearContent();
                arrayList3.add(hotReloadable);
            }
            return arrayList3;
        }

        public final RecomposerErrorState resetErrorState() {
            return Recomposer.this.resetErrorState();
        }

        public final void retryFailedCompositions() {
            Recomposer.this.retryFailedCompositions();
        }
    }

    /* JADX INFO: compiled from: Recomposer.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007f\u0007tjA0ZeP.XV0\u000f\u0002ڔd$\n#2NKY(}:\t}O˗knX\\SG\u001d\u000e.x\u00191\u0012Y\u0007f*\u000f`G8CAW\b=geEO\u0013#J-H{\u0015\u0001H/v\u0014ͯ~CQ\u0012hؖL¤>T\u0015M\u0013!b\u0012L \u0019\u001e\u000bh%ȧJǰa:7݊ɮmM"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<t/=d\b.7zT\u0011WR(k;(\u0011g]6\u000ec\u0002", "", "1n\\=b:Bb\u001d\t\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g\u0002/;w\u001f\u0012UNBA", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f$Fq 71KFr\na\u0006", "1n\\=b::P ~", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "\u001aj^A_0G\u001d\u001e\u0010\u0003(-\r\u0012-t\u00042\u0005NJw'Pm\u001d@\u0001.\u0002/", "1kT.e\nH\\(~\u0004m", "@dR<`7Ha\u0019", "@db2g\nH\\(~\u0004m", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class HotReloadable {
        private Function2<? super Composer, ? super Integer, Unit> composable;
        private final CompositionImpl composition;

        public HotReloadable(CompositionImpl compositionImpl) {
            this.composition = compositionImpl;
            this.composable = compositionImpl.getComposable();
        }

        public final void clearContent() {
            if (this.composition.isRoot()) {
                this.composition.setContent(ComposableSingletons$RecomposerKt.INSTANCE.m3637getLambda1$runtime_release());
            }
        }

        public final void resetContent() {
            this.composition.setComposable(this.composable);
        }

        public final void recompose() {
            if (this.composition.isRoot()) {
                this.composition.setContent(this.composable);
            }
        }
    }

    /* JADX INFO: compiled from: Recomposer.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u0016DLш|\u0004O\u000f8é6B\u0015\"4\u0012\u000e\u0007nj?4Je^\u008c\u0003SX\u000e,\u0013D(i$\nCiV*\u00060\u000bgR\u0016jWJ9\u000fß\u0013\u0006$};BWW\u0011a@\u0012\u001bBNC\nސqެ=f|Ȃ\u001d\"8(F\u0001U\u0013(*`\u0010%{\u001aƎ\u000eܘ4Fxíj\u000fS\r(\u001bĈB*"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<t/=d\b.7zT\u001bMAEs?(#hn\u0019\u0014p6[d6C[N\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<t/=d\b.7zu;ZMHO=\u001f\u001f>", "@dR<i,KO\u0016\u0006z", "", "1`d@X", "\u001aiPCTuEO\"\u0001D>?z\t:t\u00042\u0005\u0016", "\u001aj^A_0G\u001dx\u0012x^7\f\r9nU", "uY;7T=:\u001d z\u0004`u\\\u001c-e\u000b7\u007fJ\nlZ8", "5dc\u0010T<LS", "u(;7T=:\u001d z\u0004`u\\\u001c-e\u000b7\u007fJ\nl", "5dc\u001fX*Hd\u0019\fv[3|", "u(I", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class RecomposerErrorState implements RecomposerErrorInfo {
        private final Exception cause;
        private final boolean recoverable;

        public RecomposerErrorState(boolean z2, Exception exc) {
            this.recoverable = z2;
            this.cause = exc;
        }

        @Override // androidx.compose.runtime.RecomposerErrorInfo
        public boolean getRecoverable() {
            return this.recoverable;
        }

        @Override // androidx.compose.runtime.RecomposerErrorInfo
        public Exception getCause() {
            return this.cause;
        }
    }

    public final RecomposerInfo asRecomposerInfo() {
        return this.recomposerInfo;
    }

    public final boolean recordComposerModifications() {
        List<ControlledComposition> knownCompositions;
        boolean hasFrameWorkLocked;
        synchronized (this.stateLock) {
            if (this.snapshotInvalidations.isEmpty()) {
                return getHasFrameWorkLocked();
            }
            Set<? extends Object> setWrapIntoSet = ScatterSetWrapperKt.wrapIntoSet(this.snapshotInvalidations);
            this.snapshotInvalidations = new MutableScatterSet<>(0, 1, null);
            synchronized (this.stateLock) {
                knownCompositions = getKnownCompositions();
            }
            try {
                Recomposer recomposer = this;
                int size = knownCompositions.size();
                for (int i2 = 0; i2 < size; i2++) {
                    knownCompositions.get(i2).recordModificationsOf(setWrapIntoSet);
                    if (this._state.getValue().compareTo(State.ShuttingDown) <= 0) {
                        break;
                    }
                }
                synchronized (this.stateLock) {
                    this.snapshotInvalidations = new MutableScatterSet<>(0, 1, null);
                    Unit unit = Unit.INSTANCE;
                }
                synchronized (this.stateLock) {
                    if (deriveStateLocked() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());
                    }
                    hasFrameWorkLocked = getHasFrameWorkLocked();
                }
                return hasFrameWorkLocked;
            } catch (Throwable th) {
                synchronized (this.stateLock) {
                    this.snapshotInvalidations.addAll(setWrapIntoSet);
                    throw th;
                }
            }
        }
    }

    private final void recordComposerModifications(Function1<? super ControlledComposition, Unit> function1) {
        MutableScatterSet mutableScatterSet;
        int i2;
        synchronized (this.stateLock) {
            try {
                mutableScatterSet = this.snapshotInvalidations;
                i2 = 0;
                if (mutableScatterSet.isNotEmpty()) {
                    this.snapshotInvalidations = new MutableScatterSet(0, 1, null);
                }
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
        Set<? extends Object> setWrapIntoSet = ScatterSetWrapperKt.wrapIntoSet(mutableScatterSet);
        if (!setWrapIntoSet.isEmpty()) {
            List knownCompositions = getKnownCompositions();
            int size = knownCompositions.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((ControlledComposition) knownCompositions.get(i3)).recordModificationsOf(setWrapIntoSet);
            }
        }
        MutableVector mutableVector = this.compositionInvalidations;
        int size2 = mutableVector.getSize();
        if (size2 > 0) {
            Object[] content = mutableVector.getContent();
            do {
                function1.invoke(content[i2]);
                i2++;
            } while (i2 < size2);
        }
        this.compositionInvalidations.clear();
        synchronized (this.stateLock) {
            try {
                if (deriveStateLocked() != null) {
                    throw new IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());
                }
                Unit unit = Unit.INSTANCE;
                InlineMarker.finallyStart(1);
            } catch (Throwable th2) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th2;
            }
        }
        InlineMarker.finallyEnd(1);
    }

    public final void registerRunnerJob(Job job) {
        synchronized (this.stateLock) {
            Throwable th = this.closeCause;
            if (th != null) {
                throw th;
            }
            if (this._state.getValue().compareTo(State.ShuttingDown) <= 0) {
                throw new IllegalStateException("Recomposer shut down".toString());
            }
            if (this.runnerJob != null) {
                throw new IllegalStateException("Recomposer already running".toString());
            }
            this.runnerJob = job;
            deriveStateLocked();
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2 */
    /* JADX INFO: compiled from: Recomposer.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,i\bDZc|İI\u0006F\u000b<Ȑ\u0017\"Z\u0011 \u0007\u0015ji4Rf`.\u0001UpŪ*"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", ">`a2a;\u001f`\u0015\u0007z<3\u0007\u00075", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uF\u007f/Dc\u0007$5N#*UC\u0019r>\u001c\u001b>"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0007\u000b\u0005\f\u0002\u0007\u007fIn\u0003\u0002\u000f\u000e\u0012\u0012\u0017\n\u0018J\u001a\u001e\u0018|\u0011\u0010\u001d\u001c  %\u0018t#\u001aw()&4~%\u001f-'&5fu", f = "\u001f1.96869*6p-5", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {IptcDirectory.TAG_DIGITAL_DATE_CREATED, 585}, m = "8>GA>9(KJH>H?", n = {"_WtK`j(Y7GK\rCI\"1", "ceTKUeOWEMK", "ceKTe[T[", "ceCVbb[", "ceNGf[#WFF_", "ceEU_fNLJ?", "\\efOX_GK,;R?<M", "\\efOX_GK,;R?<M\u0012+'", "PbtKSZ[*EGV9J?#", "_WtK`j(Y7GK\rCI\"1", "ceTKUeOWEMK", "ceKTe[T[", "ceCVbb[", "ceNGf[#WFF_", "ceEU_fNLJ?", "\\efOX_GK,;R?<M", "\\efOX_GK,;R?<M\u0012+'", "PbtKSZ[*EGV9J?#"}, s = {"xQ^", "xQ_", "xQ`", "xQa", "xQb", "xQc", "xQd", "xQe", "xQf", "xQ^", "xQ_", "xQ`", "xQa", "xQb", "xQc", "xQd", "xQe", "xQf"})
    static final class C07432 extends SuspendLambda implements Function3<CoroutineScope, MonotonicFrameClock, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        int label;

        C07432(Continuation<? super C07432> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(CoroutineScope coroutineScope, MonotonicFrameClock monotonicFrameClock, Continuation<? super Unit> continuation) {
            C07432 c07432 = Recomposer.this.new C07432(continuation);
            c07432.L$0 = monotonicFrameClock;
            return c07432.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0106  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0093 -> B:36:0x003c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00c9 -> B:35:0x0037). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instruction units count: 273
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.C07432.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: Removed duplicated region for block: B:108:0x00d3  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x0082  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final void invokeSuspend$clearRecompositionState(androidx.compose.runtime.Recomposer r22, java.util.List<androidx.compose.runtime.ControlledComposition> r23, java.util.List<androidx.compose.runtime.MovableContentStateReference> r24, java.util.List<androidx.compose.runtime.ControlledComposition> r25, androidx.collection.MutableScatterSet<androidx.compose.runtime.ControlledComposition> r26, androidx.collection.MutableScatterSet<androidx.compose.runtime.ControlledComposition> r27, androidx.collection.MutableScatterSet<java.lang.Object> r28, androidx.collection.MutableScatterSet<androidx.compose.runtime.ControlledComposition> r29) {
            /*
                Method dump skipped, instruction units count: 320
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.C07432.invokeSuspend$clearRecompositionState(androidx.compose.runtime.Recomposer, java.util.List, java.util.List, java.util.List, androidx.collection.MutableScatterSet, androidx.collection.MutableScatterSet, androidx.collection.MutableScatterSet, androidx.collection.MutableScatterSet):void");
        }

        public static final void invokeSuspend$fillToInsert(List<MovableContentStateReference> list, Recomposer recomposer) {
            list.clear();
            synchronized (recomposer.stateLock) {
                List list2 = recomposer.compositionValuesAwaitingInsert;
                int size = list2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    list.add((MovableContentStateReference) list2.get(i2));
                }
                recomposer.compositionValuesAwaitingInsert.clear();
                Unit unit = Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2$1 */
        /* JADX INFO: compiled from: Recomposer.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,i\bӵLc\u0003\u000bIي>éFB-!\\\u0016\u0006\u0007~jg1\u000bm߬2RY,"}, d2 = {"\n`]<a@F])\rS", "", "4qP:X\u001bB[\u0019", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        static final class AnonymousClass1 extends Lambda implements Function1<Long, Unit> {
            final /* synthetic */ MutableScatterSet<ControlledComposition> $alreadyComposed;
            final /* synthetic */ MutableScatterSet<Object> $modifiedValues;
            final /* synthetic */ Set<Object> $modifiedValuesSet;
            final /* synthetic */ List<ControlledComposition> $toApply;
            final /* synthetic */ MutableScatterSet<ControlledComposition> $toComplete;
            final /* synthetic */ List<MovableContentStateReference> $toInsert;
            final /* synthetic */ MutableScatterSet<ControlledComposition> $toLateApply;
            final /* synthetic */ List<ControlledComposition> $toRecompose;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(MutableScatterSet<Object> mutableScatterSet, MutableScatterSet<ControlledComposition> mutableScatterSet2, List<ControlledComposition> list, List<MovableContentStateReference> list2, MutableScatterSet<ControlledComposition> mutableScatterSet3, List<ControlledComposition> list3, MutableScatterSet<ControlledComposition> mutableScatterSet4, Set<? extends Object> set) {
                super(1);
                mutableScatterSet = mutableScatterSet;
                mutableScatterSet = mutableScatterSet2;
                list = list;
                list = list2;
                mutableScatterSet = mutableScatterSet3;
                list = list3;
                mutableScatterSet = mutableScatterSet4;
                set = set;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l2) throws Throwable {
                invoke(l2.longValue());
                return Unit.INSTANCE;
            }

            /* JADX WARN: Removed duplicated region for block: B:335:0x022e  */
            /* JADX WARN: Removed duplicated region for block: B:347:0x0259  */
            /* JADX WARN: Removed duplicated region for block: B:410:0x02e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:422:0x01e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:427:0x0263 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void invoke(long r25) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 850
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.C07432.AnonymousClass1.invoke(long):void");
            }
        }
    }

    public final Object runRecomposeAndApplyChanges(Continuation<? super Unit> continuation) {
        Object objRecompositionRunner = recompositionRunner(new C07432(null), continuation);
        return objRecompositionRunner == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRecompositionRunner : Unit.INSTANCE;
    }

    static /* synthetic */ void processCompositionError$default(Recomposer recomposer, Exception exc, ControlledComposition controlledComposition, boolean z2, int i2, Object obj) throws Exception {
        if ((2 & i2) != 0) {
            controlledComposition = null;
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            z2 = false;
        }
        recomposer.processCompositionError(exc, controlledComposition, z2);
    }

    private final void processCompositionError(Exception exc, ControlledComposition controlledComposition, boolean z2) throws Exception {
        if (_hotReloadEnabled.get().booleanValue() && !(exc instanceof ComposeRuntimeError)) {
            synchronized (this.stateLock) {
                ActualAndroid_androidKt.logError("Error was captured in composition while live edit was enabled.", exc);
                this.compositionsAwaitingApply.clear();
                this.compositionInvalidations.clear();
                this.snapshotInvalidations = new MutableScatterSet<>(0, 1, null);
                this.compositionValuesAwaitingInsert.clear();
                this.compositionValuesRemoved.clear();
                this.compositionValueStatesAvailable.clear();
                this.errorState = new RecomposerErrorState(z2, exc);
                if (controlledComposition != null) {
                    recordFailedCompositionLocked(controlledComposition);
                }
                deriveStateLocked();
            }
            return;
        }
        synchronized (this.stateLock) {
            RecomposerErrorState recomposerErrorState = this.errorState;
            if (recomposerErrorState == null) {
                this.errorState = new RecomposerErrorState(false, exc);
                Unit unit = Unit.INSTANCE;
            } else {
                throw recomposerErrorState.getCause();
            }
        }
        throw exc;
    }

    private final void clearKnownCompositionsLocked() {
        this._knownCompositions.clear();
        this._knownCompositionsCache = CollectionsKt.emptyList();
    }

    private final void removeKnownCompositionLocked(ControlledComposition controlledComposition) {
        this._knownCompositions.remove(controlledComposition);
        this._knownCompositionsCache = null;
    }

    private final void addKnownCompositionLocked(ControlledComposition controlledComposition) {
        this._knownCompositions.add(controlledComposition);
        this._knownCompositionsCache = null;
    }

    public final RecomposerErrorState resetErrorState() {
        RecomposerErrorState recomposerErrorState;
        synchronized (this.stateLock) {
            recomposerErrorState = this.errorState;
            if (recomposerErrorState != null) {
                this.errorState = null;
                deriveStateLocked();
            }
        }
        return recomposerErrorState;
    }

    public final void retryFailedCompositions() {
        List<ControlledComposition> list;
        int i2;
        synchronized (this.stateLock) {
            list = this.failedCompositions;
            this.failedCompositions = null;
        }
        if (list == null) {
            return;
        }
        while (true) {
            i2 = 0;
            try {
                if (list.isEmpty()) {
                    break;
                }
                ControlledComposition controlledComposition = (ControlledComposition) CollectionsKt.removeLast(list);
                if (controlledComposition instanceof CompositionImpl) {
                    controlledComposition.invalidateAll();
                    controlledComposition.setContent(((CompositionImpl) controlledComposition).getComposable());
                    if (this.errorState != null) {
                        break;
                    }
                }
            } catch (Throwable th) {
                if (!list.isEmpty()) {
                    synchronized (this.stateLock) {
                        int size = list.size();
                        while (i2 < size) {
                            recordFailedCompositionLocked(list.get(i2));
                            i2++;
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                }
                throw th;
            }
        }
        if (list.isEmpty()) {
            return;
        }
        synchronized (this.stateLock) {
            int size2 = list.size();
            while (i2 < size2) {
                recordFailedCompositionLocked(list.get(i2));
                i2++;
            }
            Unit unit2 = Unit.INSTANCE;
        }
    }

    public final void recordFailedCompositionLocked(ControlledComposition controlledComposition) {
        ArrayList arrayList = this.failedCompositions;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.failedCompositions = arrayList;
        }
        if (!arrayList.contains(controlledComposition)) {
            arrayList.add(controlledComposition);
        }
        removeKnownCompositionLocked(controlledComposition);
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2 */
    /* JADX INFO: compiled from: Recomposer.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,i\bDZc|İI\u0006F\u000b<Ȑ\u0017\"Z\u0011 \u0007\u0015ji4Rf`.\u0001UpŪ*"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", ">`a2a;\u001f`\u0015\u0007z<3\u0007\u00075", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uF\u007f/Dc\u0007$5N#*UC\u0019r>\u001c\u001b>"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0007\u000b\u0005\f\u0002\u0007\u007fIn\u0003\u0002\u000f\u000e\u0012\u0012\u0017\n\u0018J\u001a\u001e\u0018|\u0011\u0010\u001d\u001c  %\u0018v$$\u001a-+, *1*8\u0001/&\u0004452@\u000b1+932Ar\u0002", f = "\u001f1.96869*6p-5", i = {0, 0, 0, 1}, l = {890, 910, 911}, m = "8>GA>9(KJH>H?", n = {"a[eU_fQZ;\u001dU<FO3/!\u001c\u0015\n!'\f", "UhcSWIKND;R", "UhcSWBQVF", "UhcSWBQVF"}, s = {"xQ^", "xQ_", "xQ`", "xQ^"})
    static final class C07442 extends SuspendLambda implements Function3<CoroutineScope, MonotonicFrameClock, Continuation<? super Unit>, Object> {
        final /* synthetic */ CoroutineContext $recomposeCoroutineContext;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ Recomposer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07442(CoroutineContext coroutineContext, Recomposer recomposer, Continuation<? super C07442> continuation) {
            super(3, continuation);
            this.$recomposeCoroutineContext = coroutineContext;
            this.this$0 = recomposer;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(CoroutineScope coroutineScope, MonotonicFrameClock monotonicFrameClock, Continuation<? super Unit> continuation) {
            C07442 c07442 = new C07442(this.$recomposeCoroutineContext, this.this$0, continuation);
            c07442.L$0 = coroutineScope;
            c07442.L$1 = monotonicFrameClock;
            return c07442.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:115:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:159:0x0176  */
        /* JADX WARN: Removed duplicated region for block: B:165:0x01a4 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:184:0x00be A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:116:0x00a5 -> B:119:0x00b7). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                Method dump skipped, instruction units count: 453
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.C07442.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final Object runRecomposeConcurrentlyAndApplyChanges(CoroutineContext coroutineContext, Continuation<? super Unit> continuation) {
        Object objRecompositionRunner = recompositionRunner(new C07442(coroutineContext, this, null), continuation);
        return objRecompositionRunner == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRecompositionRunner : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0084 -> B:36:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object runFrameLoop(androidx.compose.runtime.MonotonicFrameClock r10, androidx.compose.runtime.ProduceFrameSignal r11, kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof androidx.compose.runtime.Recomposer.C07411
            if (r0 == 0) goto L9a
            r7 = r12
            androidx.compose.runtime.Recomposer$runFrameLoop$1 r7 = (androidx.compose.runtime.Recomposer.C07411) r7
            int r0 = r7.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = (-1) - r0
            int r0 = (-1) - r2
            r1 = r1 | r0
            int r0 = (-1) - r1
            if (r0 == 0) goto L9a
            int r0 = r7.label
            int r0 = r0 - r2
            r7.label = r0
        L19:
            java.lang.Object r8 = r7.result
            java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r7.label
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L87
            if (r0 == r4) goto L56
            if (r0 != r5) goto La1
            java.lang.Object r3 = r7.L$4
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r2 = r7.L$3
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r11 = r7.L$2
            androidx.compose.runtime.ProduceFrameSignal r11 = (androidx.compose.runtime.ProduceFrameSignal) r11
            java.lang.Object r10 = r7.L$1
            androidx.compose.runtime.MonotonicFrameClock r10 = (androidx.compose.runtime.MonotonicFrameClock) r10
            java.lang.Object r1 = r7.L$0
            androidx.compose.runtime.Recomposer r1 = (androidx.compose.runtime.Recomposer) r1
            kotlin.ResultKt.throwOnFailure(r8)
        L40:
            java.lang.Object r0 = r1.stateLock
            r7.L$0 = r1
            r7.L$1 = r10
            r7.L$2 = r11
            r7.L$3 = r2
            r7.L$4 = r3
            r7.label = r4
            java.lang.Object r0 = r11.awaitFrameRequest(r0, r7)
            if (r0 != r6) goto L55
            return r6
        L55:
            goto L6d
        L56:
            java.lang.Object r3 = r7.L$4
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r2 = r7.L$3
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r11 = r7.L$2
            androidx.compose.runtime.ProduceFrameSignal r11 = (androidx.compose.runtime.ProduceFrameSignal) r11
            java.lang.Object r10 = r7.L$1
            androidx.compose.runtime.MonotonicFrameClock r10 = (androidx.compose.runtime.MonotonicFrameClock) r10
            java.lang.Object r1 = r7.L$0
            androidx.compose.runtime.Recomposer r1 = (androidx.compose.runtime.Recomposer) r1
            kotlin.ResultKt.throwOnFailure(r8)
        L6d:
            androidx.compose.runtime.Recomposer$runFrameLoop$2 r0 = new androidx.compose.runtime.Recomposer$runFrameLoop$2
            r0.<init>()
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r7.L$0 = r1
            r7.L$1 = r10
            r7.L$2 = r11
            r7.L$3 = r2
            r7.L$4 = r3
            r7.label = r5
            java.lang.Object r0 = r10.withFrameNanos(r0, r7)
            if (r0 != r6) goto L40
            return r6
        L87:
            kotlin.ResultKt.throwOnFailure(r8)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r2 = (java.util.List) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.List r3 = (java.util.List) r3
            r1 = r9
            goto L40
        L9a:
            androidx.compose.runtime.Recomposer$runFrameLoop$1 r7 = new androidx.compose.runtime.Recomposer$runFrameLoop$1
            r7.<init>(r12)
            goto L19
        La1:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.runFrameLoop(androidx.compose.runtime.MonotonicFrameClock, androidx.compose.runtime.ProduceFrameSignal, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.Recomposer$runFrameLoop$2 */
    /* JADX INFO: compiled from: Recomposer.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d̉=!4i\bDRc|İI\u0006>\u00126Ȑ\rӬD\u001a\b\tvjg0Zdv-\u0003W8\u0010\u0004{b&\",ڱG;[\u001d"}, d2 = {"\n`]<a@F])\rS", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e| \u0015Gv\u00158s,57\b)Fq\u001f>IR?u=s", "", "4qP:X\u001bB[\u0019", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C07422 extends Lambda implements Function1<Long, CancellableContinuation<? super Unit>> {
        final /* synthetic */ ProduceFrameSignal $frameSignal;
        final /* synthetic */ List<ControlledComposition> $toApply;
        final /* synthetic */ List<ControlledComposition> $toRecompose;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07422(List<ControlledComposition> list, List<ControlledComposition> list2, ProduceFrameSignal produceFrameSignal) {
            super(1);
            list = list;
            list = list2;
            produceFrameSignal = produceFrameSignal;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ CancellableContinuation<? super Unit> invoke(Long l2) {
            return invoke(l2.longValue());
        }

        public final CancellableContinuation<Unit> invoke(long j2) {
            Object objBeginSection;
            int i2;
            CancellableContinuation<Unit> cancellableContinuationDeriveStateLocked;
            if (Recomposer.this.getHasBroadcastFrameClockAwaiters()) {
                Recomposer recomposer = Recomposer.this;
                objBeginSection = Trace.INSTANCE.beginSection("Recomposer:animation");
                try {
                    recomposer.broadcastFrameClock.sendFrame(j2);
                    Snapshot.Companion.sendApplyNotifications();
                    Unit unit = Unit.INSTANCE;
                } finally {
                }
            }
            Recomposer recomposer2 = Recomposer.this;
            List<ControlledComposition> list = list;
            List<ControlledComposition> list2 = list;
            ProduceFrameSignal produceFrameSignal = produceFrameSignal;
            objBeginSection = Trace.INSTANCE.beginSection("Recomposer:recompose");
            try {
                recomposer2.recordComposerModifications();
                synchronized (recomposer2.stateLock) {
                    List list3 = recomposer2.compositionsAwaitingApply;
                    int size = list3.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        list2.add((ControlledComposition) list3.get(i3));
                    }
                    recomposer2.compositionsAwaitingApply.clear();
                    MutableVector mutableVector = recomposer2.compositionInvalidations;
                    int size2 = mutableVector.getSize();
                    if (size2 > 0) {
                        Object[] content = mutableVector.getContent();
                        int i4 = 0;
                        do {
                            list.add((ControlledComposition) content[i4]);
                            i4++;
                        } while (i4 < size2);
                    }
                    recomposer2.compositionInvalidations.clear();
                    produceFrameSignal.takeFrameRequestLocked();
                    Unit unit2 = Unit.INSTANCE;
                }
                MutableScatterSet mutableScatterSet = new MutableScatterSet(0, 1, null);
                try {
                    int size3 = list.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        ControlledComposition controlledCompositionPerformRecompose = recomposer2.performRecompose(list.get(i5), mutableScatterSet);
                        if (controlledCompositionPerformRecompose != null) {
                            list2.add(controlledCompositionPerformRecompose);
                        }
                    }
                    list.clear();
                    if (!list2.isEmpty()) {
                        recomposer2.changeCount = recomposer2.getChangeCount() + 1;
                    }
                    try {
                        int size4 = list2.size();
                        for (i2 = 0; i2 < size4; i2++) {
                            list2.get(i2).applyChanges();
                        }
                        list2.clear();
                        synchronized (recomposer2.stateLock) {
                            cancellableContinuationDeriveStateLocked = recomposer2.deriveStateLocked();
                        }
                        return cancellableContinuationDeriveStateLocked;
                    } catch (Throwable th) {
                        list2.clear();
                        throw th;
                    }
                } catch (Throwable th2) {
                    list.clear();
                    throw th2;
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean getHasSchedulingWork() {
        /*
            r2 = this;
            java.lang.Object r1 = r2.stateLock
            monitor-enter(r1)
            androidx.collection.MutableScatterSet<java.lang.Object> r0 = r2.snapshotInvalidations     // Catch: java.lang.Throwable -> L1e
            boolean r0 = r0.isNotEmpty()     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto L19
            androidx.compose.runtime.collection.MutableVector<androidx.compose.runtime.ControlledComposition> r0 = r2.compositionInvalidations     // Catch: java.lang.Throwable -> L1e
            boolean r0 = r0.isNotEmpty()     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto L19
            boolean r0 = r2.getHasBroadcastFrameClockAwaitersLocked()     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L1c
        L19:
            r0 = 1
        L1a:
            monitor-exit(r1)
            return r0
        L1c:
            r0 = 0
            goto L1a
        L1e:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.getHasSchedulingWork():boolean");
    }

    public final Object awaitWorkAvailable(Continuation<? super Unit> continuation) throws Throwable {
        if (getHasSchedulingWork()) {
            return Unit.INSTANCE;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        synchronized (this.stateLock) {
            if (!getHasSchedulingWork()) {
                this.workContinuation = cancellableContinuationImpl2;
                cancellableContinuationImpl2 = null;
            }
        }
        if (cancellableContinuationImpl2 != null) {
            Result.Companion companion = Result.Companion;
            cancellableContinuationImpl2.resumeWith(Result.m8980constructorimpl(Unit.INSTANCE));
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.Recomposer$recompositionRunner$2 */
    /* JADX INFO: compiled from: Recomposer.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0007\u000b\u0005\f\u0002\u0007\u007fIn\u0003\u0002\u000f\u000e\u0012\u0012\u0017\n\u0018J\u001a\u000e\r\u001a\u0019\u001d\u001d\"\u0019%\u001b\"\"\u0007+%&\u001e,^m", f = "\u001f1.96869*6p-5", i = {0, 0}, l = {PhotoshopDirectory.TAG_URL_LIST}, m = "8>GA>9(KJH>H?", n = {"RWnR[dI1E<", "ddtKY_U[;L':GF8\u0015\u0015*'\u0019(\u001c\u0019"}, s = {"xQ^", "xQ_"})
    static final class C07402 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function3<CoroutineScope, MonotonicFrameClock, Continuation<? super Unit>, Object> $block;
        final /* synthetic */ MonotonicFrameClock $parentFrameClock;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C07402(Function3<? super CoroutineScope, ? super MonotonicFrameClock, ? super Continuation<? super Unit>, ? extends Object> function3, MonotonicFrameClock monotonicFrameClock, Continuation<? super C07402> continuation) {
            super(2, continuation);
            this.$block = function3;
            this.$parentFrameClock = monotonicFrameClock;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C07402 c07402 = Recomposer.this.new C07402(this.$block, this.$parentFrameClock, continuation);
            c07402.L$0 = obj;
            return c07402;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C07402) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:110:0x0096 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:117:0x00c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 226
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.C07402.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: androidx.compose.runtime.Recomposer$recompositionRunner$2$3 */
        /* JADX INFO: compiled from: Recomposer.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0007\u000b\u0005\f\u0002\u0007\u007fIn\u0003\u0002\u000f\u000e\u0012\u0012\u0017\n\u0018J\u001a\u000e\r\u001a\u0019\u001d\u001d\"\u0019%\u001b\"\"\u0007+%&\u001e,^m`p", f = "\u001f1.96869*6p-5", i = {}, l = {1055}, m = "8>GA>9(KJH>H?", n = {}, s = {})
        static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function3<CoroutineScope, MonotonicFrameClock, Continuation<? super Unit>, Object> $block;
            final /* synthetic */ MonotonicFrameClock $parentFrameClock;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass3(Function3<? super CoroutineScope, ? super MonotonicFrameClock, ? super Continuation<? super Unit>, ? extends Object> function3, MonotonicFrameClock monotonicFrameClock, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$block = function3;
                this.$parentFrameClock = monotonicFrameClock;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$block, this.$parentFrameClock, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    Function3<CoroutineScope, MonotonicFrameClock, Continuation<? super Unit>, Object> function3 = this.$block;
                    MonotonicFrameClock monotonicFrameClock = this.$parentFrameClock;
                    this.label = 1;
                    if (function3.invoke(coroutineScope, monotonicFrameClock, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }
    }

    public final Object recompositionRunner(Function3<? super CoroutineScope, ? super MonotonicFrameClock, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(this.broadcastFrameClock, new C07402(function3, MonotonicFrameClockKt.getMonotonicFrameClock(continuation.getContext()), null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    public final void cancel() {
        synchronized (this.stateLock) {
            if (this._state.getValue().compareTo(State.Idle) >= 0) {
                this._state.setValue(State.ShuttingDown);
            }
            Unit unit = Unit.INSTANCE;
        }
        Job.DefaultImpls.cancel$default((Job) this.effectJob, (CancellationException) null, 1, (Object) null);
    }

    public final void close() {
        if (this.effectJob.complete()) {
            synchronized (this.stateLock) {
                this.isClosed = true;
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.Recomposer$join$2 */
    /* JADX INFO: compiled from: Recomposer.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,r\bӵLc\u000b\u0004OيH\u000b\\A/&:\u0012\u0010\u0007\u0015k\u007fӏ\u0003"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<t/=d\b.7zT\u001c\\?Jk\n"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0007\u000b\u0005\f\u0002\u0007\u007fIn\u0003\u0002\u000f\u000e\u0012\u0012\u0017\n\u0018J\u0012\u0018\u0013\u0019O^", f = "\u001f1.96869*6p-5", i = {}, l = {}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class C07392 extends SuspendLambda implements Function2<State, Continuation<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C07392(Continuation<? super C07392> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C07392 c07392 = new C07392(continuation);
            c07392.L$0 = obj;
            return c07392;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(State state, Continuation<? super Boolean> continuation) {
            return ((C07392) create(state, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(((State) this.L$0) == State.ShutDown);
        }
    }

    public final Object join(Continuation<? super Unit> continuation) {
        Object objFirst = FlowKt.first(getCurrentState(), new C07392(null), continuation);
        return objFirst == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objFirst : Unit.INSTANCE;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void composeInitial$runtime_release(ControlledComposition controlledComposition, Function2<? super Composer, ? super Integer, Unit> function2) throws Exception {
        boolean zIsComposing = controlledComposition.isComposing();
        try {
            MutableSnapshot mutableSnapshotTakeMutableSnapshot = Snapshot.Companion.takeMutableSnapshot(readObserverOf(controlledComposition), writeObserverOf(controlledComposition, null));
            try {
                MutableSnapshot mutableSnapshot = mutableSnapshotTakeMutableSnapshot;
                Snapshot snapshotMakeCurrent = mutableSnapshot.makeCurrent();
                try {
                    controlledComposition.composeContent(function2);
                    Unit unit = Unit.INSTANCE;
                    if (!zIsComposing) {
                        Snapshot.Companion.notifyObjectsInitialized();
                    }
                    synchronized (this.stateLock) {
                        if (this._state.getValue().compareTo(State.ShuttingDown) > 0 && !getKnownCompositions().contains(controlledComposition)) {
                            addKnownCompositionLocked(controlledComposition);
                        }
                        Unit unit2 = Unit.INSTANCE;
                    }
                    try {
                        performInitialMovableContentInserts(controlledComposition);
                        try {
                            controlledComposition.applyChanges();
                            controlledComposition.applyLateChanges();
                            if (zIsComposing) {
                                return;
                            }
                            Snapshot.Companion.notifyObjectsInitialized();
                        } catch (Exception e2) {
                            processCompositionError$default(this, e2, null, false, 6, null);
                        }
                    } catch (Exception e3) {
                        processCompositionError(e3, controlledComposition, true);
                    }
                } finally {
                    mutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                }
            } finally {
                applyAndCheck(mutableSnapshotTakeMutableSnapshot);
            }
        } catch (Exception e4) {
            processCompositionError(e4, controlledComposition, true);
        }
    }

    private final void performInitialMovableContentInserts(ControlledComposition controlledComposition) {
        synchronized (this.stateLock) {
            List<MovableContentStateReference> list = this.compositionValuesAwaitingInsert;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (Intrinsics.areEqual(list.get(i2).getComposition$runtime_release(), controlledComposition)) {
                    Unit unit = Unit.INSTANCE;
                    ArrayList arrayList = new ArrayList();
                    performInitialMovableContentInserts$fillToInsert(arrayList, this, controlledComposition);
                    while (!arrayList.isEmpty()) {
                        performInsertValues(arrayList, null);
                        performInitialMovableContentInserts$fillToInsert(arrayList, this, controlledComposition);
                    }
                    return;
                }
            }
        }
    }

    private static final void performInitialMovableContentInserts$fillToInsert(List<MovableContentStateReference> list, Recomposer recomposer, ControlledComposition controlledComposition) {
        list.clear();
        synchronized (recomposer.stateLock) {
            Iterator<MovableContentStateReference> it = recomposer.compositionValuesAwaitingInsert.iterator();
            while (it.hasNext()) {
                MovableContentStateReference next = it.next();
                if (Intrinsics.areEqual(next.getComposition$runtime_release(), controlledComposition)) {
                    list.add(next);
                    it.remove();
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final ControlledComposition performRecompose(final ControlledComposition controlledComposition, final MutableScatterSet<Object> mutableScatterSet) {
        Set<ControlledComposition> set;
        if (controlledComposition.isComposing() || controlledComposition.isDisposed() || ((set = this.compositionsRemoved) != null && set.contains(controlledComposition))) {
            return null;
        }
        MutableSnapshot mutableSnapshotTakeMutableSnapshot = Snapshot.Companion.takeMutableSnapshot(readObserverOf(controlledComposition), writeObserverOf(controlledComposition, mutableScatterSet));
        try {
            MutableSnapshot mutableSnapshot = mutableSnapshotTakeMutableSnapshot;
            Snapshot snapshotMakeCurrent = mutableSnapshot.makeCurrent();
            if (mutableScatterSet != null) {
                try {
                    if (mutableScatterSet.isNotEmpty()) {
                        controlledComposition.prepareCompose(new Function0<Unit>() { // from class: androidx.compose.runtime.Recomposer$performRecompose$1$1
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
                                MutableScatterSet<Object> mutableScatterSet2 = mutableScatterSet;
                                ControlledComposition controlledComposition2 = controlledComposition;
                                Object[] objArr = mutableScatterSet2.elements;
                                long[] jArr = mutableScatterSet2.metadata;
                                int length = jArr.length - 2;
                                if (length < 0) {
                                    return;
                                }
                                int i2 = 0;
                                while (true) {
                                    long j2 = jArr[i2];
                                    long j3 = (~j2) << 7;
                                    if ((-1) - (((-1) - ((j3 + j2) - (j3 | j2))) | ((-1) - (-9187201950435737472L))) != -9187201950435737472L) {
                                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                                        for (int i4 = 0; i4 < i3; i4++) {
                                            if ((255 & j2) < 128) {
                                                controlledComposition2.recordWriteOf(objArr[(i2 << 3) + i4]);
                                            }
                                            j2 >>= 8;
                                        }
                                        if (i3 != 8) {
                                            return;
                                        }
                                    }
                                    if (i2 == length) {
                                        return;
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                        });
                    }
                } finally {
                    mutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                }
            }
            if (controlledComposition.recompose()) {
                return controlledComposition;
            }
            return null;
        } finally {
            applyAndCheck(mutableSnapshotTakeMutableSnapshot);
        }
    }

    public final void discardUnusedValues() {
        int i2;
        ArrayList arrayListEmptyList;
        synchronized (this.stateLock) {
            if (!this.compositionValuesRemoved.isEmpty()) {
                List listFlatten = CollectionsKt.flatten(this.compositionValuesRemoved.values());
                this.compositionValuesRemoved.clear();
                ArrayList arrayList = new ArrayList(listFlatten.size());
                int size = listFlatten.size();
                for (int i3 = 0; i3 < size; i3++) {
                    MovableContentStateReference movableContentStateReference = (MovableContentStateReference) listFlatten.get(i3);
                    arrayList.add(TuplesKt.to(movableContentStateReference, this.compositionValueStatesAvailable.get(movableContentStateReference)));
                }
                arrayListEmptyList = arrayList;
                this.compositionValueStatesAvailable.clear();
            } else {
                arrayListEmptyList = CollectionsKt.emptyList();
            }
        }
        int size2 = arrayListEmptyList.size();
        for (i2 = 0; i2 < size2; i2++) {
            Pair pair = (Pair) arrayListEmptyList.get(i2);
            MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) pair.component1();
            MovableContentState movableContentState = (MovableContentState) pair.component2();
            if (movableContentState != null) {
                movableContentStateReference2.getComposition$runtime_release().disposeUnusedMovableContent(movableContentState);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.Recomposer$readObserverOf$1 */
    /* JADX INFO: compiled from: Recomposer.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,i\bӵLc\u0003İIي>éFB-!\\\u0016\u0006\u0007~jg1\u000bm߬2RY,"}, d2 = {"\n`]<a@F])\rS", "", "D`[BX", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function1<Object, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2(obj);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(Object obj) {
            controlledComposition.recordReadOf(obj);
        }
    }

    private final Function1<Object, Unit> readObserverOf(ControlledComposition controlledComposition) {
        return new Function1<Object, Unit>() { // from class: androidx.compose.runtime.Recomposer.readObserverOf.1
            AnonymousClass1() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(obj);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2(Object obj) {
                controlledComposition.recordReadOf(obj);
            }
        };
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.Recomposer$writeObserverOf$1 */
    /* JADX INFO: compiled from: Recomposer.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,i\bӵLc\u0003İIي>éFB-!\\\u0016\u0006\u0007~jg1\u000bm߬2RY,"}, d2 = {"\n`]<a@F])\rS", "", "D`[BX", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C07451 extends Lambda implements Function1<Object, Unit> {
        final /* synthetic */ MutableScatterSet<Object> $modifiedValues;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07451(MutableScatterSet<Object> mutableScatterSet) {
            super(1);
            mutableScatterSet = mutableScatterSet;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2(obj);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(Object obj) {
            controlledComposition.recordWriteOf(obj);
            MutableScatterSet<Object> mutableScatterSet = mutableScatterSet;
            if (mutableScatterSet != null) {
                mutableScatterSet.add(obj);
            }
        }
    }

    private final Function1<Object, Unit> writeObserverOf(ControlledComposition controlledComposition, MutableScatterSet<Object> mutableScatterSet) {
        return new Function1<Object, Unit>() { // from class: androidx.compose.runtime.Recomposer.writeObserverOf.1
            final /* synthetic */ MutableScatterSet<Object> $modifiedValues;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C07451(MutableScatterSet<Object> mutableScatterSet2) {
                super(1);
                mutableScatterSet = mutableScatterSet2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(obj);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2(Object obj) {
                controlledComposition.recordWriteOf(obj);
                MutableScatterSet<Object> mutableScatterSet2 = mutableScatterSet;
                if (mutableScatterSet2 != null) {
                    mutableScatterSet2.add(obj);
                }
            }
        };
    }

    private final <T> T composing(ControlledComposition controlledComposition, MutableScatterSet<Object> mutableScatterSet, Function0<? extends T> function0) {
        MutableSnapshot mutableSnapshotTakeMutableSnapshot = Snapshot.Companion.takeMutableSnapshot(readObserverOf(controlledComposition), writeObserverOf(controlledComposition, mutableScatterSet));
        try {
            MutableSnapshot mutableSnapshot = mutableSnapshotTakeMutableSnapshot;
            Snapshot snapshotMakeCurrent = mutableSnapshot.makeCurrent();
            try {
                return function0.invoke();
            } finally {
                InlineMarker.finallyStart(1);
                mutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                InlineMarker.finallyEnd(1);
            }
        } finally {
            InlineMarker.finallyStart(1);
            applyAndCheck(mutableSnapshotTakeMutableSnapshot);
            InlineMarker.finallyEnd(1);
        }
    }

    private final void applyAndCheck(MutableSnapshot mutableSnapshot) {
        try {
            if (mutableSnapshot.apply() instanceof SnapshotApplyResult.Failure) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.".toString());
            }
        } finally {
            mutableSnapshot.dispose();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean getHasPendingWork() {
        /*
            r2 = this;
            java.lang.Object r1 = r2.stateLock
            monitor-enter(r1)
            androidx.collection.MutableScatterSet<java.lang.Object> r0 = r2.snapshotInvalidations     // Catch: java.lang.Throwable -> L2c
            boolean r0 = r0.isNotEmpty()     // Catch: java.lang.Throwable -> L2c
            if (r0 != 0) goto L27
            androidx.compose.runtime.collection.MutableVector<androidx.compose.runtime.ControlledComposition> r0 = r2.compositionInvalidations     // Catch: java.lang.Throwable -> L2c
            boolean r0 = r0.isNotEmpty()     // Catch: java.lang.Throwable -> L2c
            if (r0 != 0) goto L27
            int r0 = r2.concurrentCompositionsOutstanding     // Catch: java.lang.Throwable -> L2c
            if (r0 > 0) goto L27
            java.util.List<androidx.compose.runtime.ControlledComposition> r0 = r2.compositionsAwaitingApply     // Catch: java.lang.Throwable -> L2c
            java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L2c
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L27
            boolean r0 = r2.getHasBroadcastFrameClockAwaitersLocked()     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L2a
        L27:
            r0 = 1
        L28:
            monitor-exit(r1)
            return r0
        L2a:
            r0 = 0
            goto L28
        L2c:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.getHasPendingWork():boolean");
    }

    private final boolean getHasFrameWorkLocked() {
        return this.compositionInvalidations.isNotEmpty() || getHasBroadcastFrameClockAwaitersLocked();
    }

    public final boolean getHasConcurrentFrameWorkLocked() {
        return !this.compositionsAwaitingApply.isEmpty() || getHasBroadcastFrameClockAwaitersLocked();
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.Recomposer$awaitIdle$2 */
    /* JADX INFO: compiled from: Recomposer.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,r\bӵLc\u000b\u0004OيH\u000b\\A/&:\u0012\u0010\u0007\u0015k\u007fӏ\u0003"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<t/=d\b.7zT\u001c\\?Jk\n"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0007\u000b\u0005\f\u0002\u0007\u007fIn\u0003\u0002\u000f\u000e\u0012\u0012\u0017\n\u0018J\t \u000b\u0014 u\u0012\u001b\u0015Tc", f = "\u001f1.96869*6p-5", i = {}, l = {}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<State, Continuation<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(State state, Continuation<? super Boolean> continuation) {
            return ((AnonymousClass2) create(state, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(((State) this.L$0).compareTo(State.Idle) > 0);
        }
    }

    public final Object awaitIdle(Continuation<? super Unit> continuation) {
        Object objCollect = FlowKt.collect(FlowKt.takeWhile(getCurrentState(), new AnonymousClass2(null)), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }

    public final void pauseCompositionFrameClock() {
        synchronized (this.stateLock) {
            this.frameClockPaused = true;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void resumeCompositionFrameClock() {
        CancellableContinuation<Unit> cancellableContinuationDeriveStateLocked;
        synchronized (this.stateLock) {
            if (this.frameClockPaused) {
                this.frameClockPaused = false;
                cancellableContinuationDeriveStateLocked = deriveStateLocked();
            } else {
                cancellableContinuationDeriveStateLocked = null;
            }
        }
        if (cancellableContinuationDeriveStateLocked != null) {
            Result.Companion companion = Result.Companion;
            cancellableContinuationDeriveStateLocked.resumeWith(Result.m8980constructorimpl(Unit.INSTANCE));
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public boolean getCollectingCallByInformation$runtime_release() {
        return _hotReloadEnabled.get().booleanValue();
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void unregisterComposition$runtime_release(ControlledComposition controlledComposition) {
        synchronized (this.stateLock) {
            removeKnownCompositionLocked(controlledComposition);
            this.compositionInvalidations.remove(controlledComposition);
            this.compositionsAwaitingApply.remove(controlledComposition);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void invalidate$runtime_release(ControlledComposition controlledComposition) {
        CancellableContinuation<Unit> cancellableContinuationDeriveStateLocked;
        synchronized (this.stateLock) {
            if (this.compositionInvalidations.contains(controlledComposition)) {
                cancellableContinuationDeriveStateLocked = null;
            } else {
                this.compositionInvalidations.add(controlledComposition);
                cancellableContinuationDeriveStateLocked = deriveStateLocked();
            }
        }
        if (cancellableContinuationDeriveStateLocked != null) {
            Result.Companion companion = Result.Companion;
            cancellableContinuationDeriveStateLocked.resumeWith(Result.m8980constructorimpl(Unit.INSTANCE));
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void invalidateScope$runtime_release(RecomposeScopeImpl recomposeScopeImpl) {
        CancellableContinuation<Unit> cancellableContinuationDeriveStateLocked;
        synchronized (this.stateLock) {
            this.snapshotInvalidations.add(recomposeScopeImpl);
            cancellableContinuationDeriveStateLocked = deriveStateLocked();
        }
        if (cancellableContinuationDeriveStateLocked != null) {
            Result.Companion companion = Result.Companion;
            cancellableContinuationDeriveStateLocked.resumeWith(Result.m8980constructorimpl(Unit.INSTANCE));
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void insertMovableContent$runtime_release(MovableContentStateReference movableContentStateReference) {
        CancellableContinuation<Unit> cancellableContinuationDeriveStateLocked;
        synchronized (this.stateLock) {
            this.compositionValuesAwaitingInsert.add(movableContentStateReference);
            cancellableContinuationDeriveStateLocked = deriveStateLocked();
        }
        if (cancellableContinuationDeriveStateLocked != null) {
            Result.Companion companion = Result.Companion;
            cancellableContinuationDeriveStateLocked.resumeWith(Result.m8980constructorimpl(Unit.INSTANCE));
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void deletedMovableContent$runtime_release(MovableContentStateReference movableContentStateReference) {
        synchronized (this.stateLock) {
            RecomposerKt.addMultiValue(this.compositionValuesRemoved, movableContentStateReference.getContent$runtime_release(), movableContentStateReference);
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void movableContentStateReleased$runtime_release(MovableContentStateReference movableContentStateReference, MovableContentState movableContentState) {
        synchronized (this.stateLock) {
            this.compositionValueStatesAvailable.put(movableContentStateReference, movableContentState);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void reportRemovedComposition$runtime_release(ControlledComposition controlledComposition) {
        synchronized (this.stateLock) {
            LinkedHashSet linkedHashSet = this.compositionsRemoved;
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
                this.compositionsRemoved = linkedHashSet;
            }
            linkedHashSet.add(controlledComposition);
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public MovableContentState movableContentStateResolve$runtime_release(MovableContentStateReference movableContentStateReference) {
        MovableContentState movableContentStateRemove;
        synchronized (this.stateLock) {
            movableContentStateRemove = this.compositionValueStatesAvailable.remove(movableContentStateReference);
        }
        return movableContentStateRemove;
    }

    /* JADX INFO: compiled from: Recomposer.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\\\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\r+4ߚ\u007f\u0007|jAӄLe^.ZS@\u000fs{J$c$\bCC٥\"}8\tWNu\bvJp\u000bK\u000f\f\u0017\u0001j:I]xc\u0014\u00172P\u000eG3coE9fu>\u0005.8*8\u007f\u000e\u0007ɥ+^Ƶ'zqJL\u00176@¤>R\u001bMM, \u0017V /0\ro\\I`p\fC\u007f#1s\tNoj>\u0011e\rtfm˙țe\u001e1U\u007fF#;k\t\u0017Tk?1W TKؒҊ++O\r If\u001a,\u0015Ya=a\u0001At\u0005\u007f|Rʬ˦ScQmV;\u0006\u0019\u0014\rj\u0016>\n5gF-HeNԄ\u07baxrY`\u0019\u0014lc\u0018z\u0010HG-\u000eFC=Io\"ai#\u00157D\u0010\u001b@;\u0001\u001d \"٪\u05f8d\u0015!w@d?uX=v`:]K\u0013\u001cp\u0011\u0005pʶΥK\u007f5\"aZ%&O{I-1s Lli\r\u0004\u000fk\u0002l\u0001J)0~ G2'\u0010\u0003Fz\u0004\u001aS\u0003[\u000b\u0016$ȿVΘ\u0002\b\u001b\u05fe-\u0014J'= ^[xszSm\u000eS877\bx\u001a\u0016\u0006@5ګ7Ʉg\u0010i\u05ecG/MGz\u0011hnRY\u001c\\l(P@vw>\u00042\t«\u0010\u0017JAw+B<֤\u001d\u0004"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<t/=d\b.7zT\fWKFg=\"\u001fq7", "", "u(E", "-g^AE,E]\u0015}Zg(y\u0010/d", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0013&Qw\u0012:@\u0001Dc\u0006$5Z\u0016/MP;t2\u001ej", "", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iK\u0001-9Wj 8m#.VA;A", "-qd;a0GU\u0006~xh4\b\u0013=e\r6", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011W\u001eKr\"<Yk/3|\u0016\u000fTMMA", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$xN8\u001b\tgP$wS%\u001f\u0017\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<t/=d\b.7zT\u001bMAEs?(#hn\u001d\u0010d62~2N\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<t/=d\b.7zk", "@t];\\5@@\u0019|\u0005f7\u0007\u0017/r\u000e", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011]\u001d8\u0006%\u0016`\b2\r", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<t/=d\b.7zy7NM\u0011", "5dc\u001fh5GW\"\u0001g^*\u0007\u0011:o\u000e(\tN", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJ\u0018\u001eQ\u0002W*\u0006!DY^'A\u007fk", "/cS\u001fh5GW\"\u0001", "", "7mU<", "1kT.e\fK`#\f\t", "1kT.e\fK`#\f\t\u001d9\r\u0012>i\b(uM\u0001\u001e\u0017C}\u000e", "5dc\u0010h9KS\"\u000eZk9\u0007\u0016=", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<t/=d\b.7zu;ZMHO=\u001f\u001f>", "5dc\u0010h9KS\"\u000eZk9\u0007\u0016=$\r8\u0005O\u0005\u001f\u0017A|\u000eCv!CY", "7me._0=O(~\\k6\r\u0014=W\u00047~&\u0001+", "9dh", "", "7me._0=O(~\\k6\r\u0014=W\u00047~&\u0001+UT\u007f\u0017Kz-5S\u000b >m\u0012<M", ":nP1F;:b\u0019Z\u0004]\n\u0007\u0011:o\u000e(\\J\u000ey!V\\\u000eC\u0001!4", "BnZ2a", ":nP1F;:b\u0019Z\u0004]\n\u0007\u0011:o\u000e(\\J\u000ey!V\\\u000eC\u0001!4\u0018\u000b0@|\u001a6M=Hk;\u001e\u0011va", "@d\\<i,+c\"\b~g.", "A`e2F;:b\u0019Z\u0004]\u000b\u0001\u0017:o\u000e(\\J\u000ey!V\\\u000eC\u0001!4", "A`e2F;:b\u0019Z\u0004]\u000b\u0001\u0017:o\u000e(\\J\u000ey!V\\\u000eC\u0001!4\u0018\u000b0@|\u001a6M=Hk;\u001e\u0011va", "Adc\u0015b;+S \tv]\f\u0006\u0005,l\u007f'", "D`[BX", "Adc\u0015b;+S \tv]\f\u0006\u0005,l\u007f':M\u0011 &Kw\u000e6\u0004%<Yy.7", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final StateFlow<Set<RecomposerInfo>> getRunningRecomposers() {
            return Recomposer._runningRecomposers;
        }

        public final void setHotReloadEnabled$runtime_release(boolean z2) {
            Recomposer._hotReloadEnabled.set(Boolean.valueOf(z2));
        }

        public final void addRunning(RecomposerInfoImpl recomposerInfoImpl) {
            PersistentSet persistentSet;
            PersistentSet persistentSetAdd;
            do {
                persistentSet = (PersistentSet) Recomposer._runningRecomposers.getValue();
                persistentSetAdd = persistentSet.add(recomposerInfoImpl);
                if (persistentSet == persistentSetAdd) {
                    return;
                }
            } while (!Recomposer._runningRecomposers.compareAndSet(persistentSet, persistentSetAdd));
        }

        public final void removeRunning(RecomposerInfoImpl recomposerInfoImpl) {
            PersistentSet persistentSet;
            PersistentSet persistentSetRemove;
            do {
                persistentSet = (PersistentSet) Recomposer._runningRecomposers.getValue();
                persistentSetRemove = persistentSet.remove(recomposerInfoImpl);
                if (persistentSet == persistentSetRemove) {
                    return;
                }
            } while (!Recomposer._runningRecomposers.compareAndSet(persistentSet, persistentSetRemove));
        }

        public final Object saveStateAndDisposeForHotReload$runtime_release() {
            Recomposer._hotReloadEnabled.set(true);
            Iterable iterable = (Iterable) Recomposer._runningRecomposers.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(arrayList, ((RecomposerInfoImpl) it.next()).saveStateAndDisposeForHotReload());
            }
            return arrayList;
        }

        public final void loadStateAndComposeForHotReload$runtime_release(Object obj) {
            Recomposer._hotReloadEnabled.set(true);
            Iterator it = ((Iterable) Recomposer._runningRecomposers.getValue()).iterator();
            while (it.hasNext()) {
                ((RecomposerInfoImpl) it.next()).resetErrorState();
            }
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.runtime.Recomposer.HotReloadable>");
            List list = (List) obj;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((HotReloadable) list.get(i2)).resetContent();
            }
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((HotReloadable) list.get(i3)).recompose();
            }
            Iterator it2 = ((Iterable) Recomposer._runningRecomposers.getValue()).iterator();
            while (it2.hasNext()) {
                ((RecomposerInfoImpl) it2.next()).retryFailedCompositions();
            }
        }

        public final void invalidateGroupsWithKey$runtime_release(int i2) {
            Recomposer._hotReloadEnabled.set(true);
            for (RecomposerInfoImpl recomposerInfoImpl : (Iterable) Recomposer._runningRecomposers.getValue()) {
                RecomposerErrorInfo currentError = recomposerInfoImpl.getCurrentError();
                if (currentError == null || currentError.getRecoverable()) {
                    recomposerInfoImpl.resetErrorState();
                    recomposerInfoImpl.invalidateGroupsWithKey(i2);
                    recomposerInfoImpl.retryFailedCompositions();
                }
            }
        }

        public final List<RecomposerErrorInfo> getCurrentErrors$runtime_release() {
            Iterable iterable = (Iterable) Recomposer._runningRecomposers.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                RecomposerErrorInfo currentError = ((RecomposerInfoImpl) it.next()).getCurrentError();
                if (currentError != null) {
                    arrayList.add(currentError);
                }
            }
            return arrayList;
        }

        public final void clearErrors$runtime_release() {
            Iterable iterable = (Iterable) Recomposer._runningRecomposers.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                RecomposerErrorState recomposerErrorStateResetErrorState = ((RecomposerInfoImpl) it.next()).resetErrorState();
                if (recomposerErrorStateResetErrorState != null) {
                    arrayList.add(recomposerErrorStateResetErrorState);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x00c3, code lost:
    
        r2 = r9.size();
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x00c8, code lost:
    
        if (r1 >= r2) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x00d4, code lost:
    
        if (r9.get(r1).getSecond() == null) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x00d6, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x00d9, code lost:
    
        r4 = new java.util.ArrayList(r9.size());
        r3 = r9.size();
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x00e7, code lost:
    
        if (r2 >= r3) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x00e9, code lost:
    
        r1 = r9.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x00f3, code lost:
    
        if (r1.getSecond() != null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x00f5, code lost:
    
        r1 = r1.getFirst();
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x00fc, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x00fd, code lost:
    
        if (r1 == null) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x00ff, code lost:
    
        r4.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0105, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0108, code lost:
    
        r4 = r4;
        r1 = r16.stateLock;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x010c, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x010d, code lost:
    
        kotlin.collections.CollectionsKt.addAll(r16.compositionValuesAwaitingInsert, r4);
        r0 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0118, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0119, code lost:
    
        r4 = new java.util.ArrayList(r9.size());
        r3 = r9.size();
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0127, code lost:
    
        if (r2 >= r3) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0129, code lost:
    
        r1 = r9.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0134, code lost:
    
        if (r1.getSecond() == null) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0136, code lost:
    
        r4.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x013c, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x013f, code lost:
    
        r9 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<androidx.compose.runtime.ControlledComposition> performInsertValues(java.util.List<androidx.compose.runtime.MovableContentStateReference> r17, androidx.collection.MutableScatterSet<java.lang.Object> r18) {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.performInsertValues(java.util.List, androidx.collection.MutableScatterSet):java.util.List");
    }
}
