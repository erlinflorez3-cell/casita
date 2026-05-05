package com.statsig.androidsdk;

import android.content.SharedPreferences;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.statsig.androidsdk.InitializeResponse;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯĽ\u0014D57\u001eq\u007fR܀kŞ\fA\u001c0\u0013ǞJ~8,\u001aՄ\u000ff\u000198ǏmH<^[ճ\u0017k\u00124,[*qK;k\u001a\u0006\"\u001fOVgmsRZ!C\u0017إ\u001ex\u0001,Qǁ\u0001](\u000f:ԏw?IMw=?c|6\u001b :Ĳ@y\u0013\u0001\"*N\u0012~zQm\u0014۵8@\u0007:Z\rS\u0007\"\u0012\u001c>(\u0001$\\oNLHt]@1+\u0003\u007fBV'e0\u0005M#F\\܋\u0015vo'3@=<\u001d%a\n\u000fRa?\u000b?\b=\rؒ/'AI{W<X\b\u0014++WՕer<\\\rQf%-˃eҪ{P<'8&\f\u0011J\u0004&\u0006UI>1(h \u000eaw\u0003WNT\u001a^p\u0005\u000beD\u001d=\u007fa2I\u001ftYy;GWѼ\u007f\u0005\u001b(k\u0019|CsT<\u0004E\u001fb\u001ci1\u007fGmN\\/q?\u0004\u0003\u001f\u0004H*LPU&G{?QG5E\u0003Q/1m\u0012Hrn\u0007\u0007ph\u0002h\u0001pp&|\u001aO*7\u0011#Pr.\u0004P\u0003\u0003\\\u0015[Gl\u0007,\u000f[&j$T!S\u001d\u0015O1mxzu\nSH/;g\u001d\u0004\u000e\u0006h'CC\u0002{\u0012wQ%!o@p\tpfpXRZ%40c`j>*,H\\?+2mxdD:e1^+G1?rE\u000b>wZ\u0017\u0017ET{(\u0011 <t78\u0019`~(\u007fxw3E\u007f0fYQcSVY0$L|QC/{\u0006Gu\n_N\u0003\u0015$pB\u008dک\u001e9Wm\u0006'\u001d>A20_uP\u0001&iM@.+\u0001\bPSh\\$Px~nxl`N\u0003\u001eRzlv;\b\u0013\u0005BlT>_c\u0003E\"Ŭϗv\u0003_\u0001\u0017K\u000bJ7 ;\u007f\u001eh-9;G?\u001dD|ӄ3\u0015o%2\u0010<Bz\u000fT>\u0016\n:..qxP\f}k<W&\u0017>P+\u001d\tHHx9 B7pUQV\u000f|p\u0005\u0007}\u000f=H~\u0007ZX!Zi\n+o,;^e8{[\u007f*]quY\u007fa9\u0006oa[9k?\u000e\u00191In@#m&d|z\u000bF\u0005\"9fEI$\u001d<7`d0JZ#C\u0003$6\u0014\tS^_=SxB<Sdbl\u0005lXX\u0005\u000fLp#:\u0001-\u0016aF)9?\t\u0006F\u00034,D\u000f)5\u0017+l_~\u0015,;Fd9I'n\u007f9m&QWXN\u0004u0\u001eo}\u0010P\u0018+\"\t\u0018cG_hwv^e;YrR|v@k\u0019Nj9\rS\u0015\u0010R\t=,IS\u0001\u0014z-zU>7\f:\u000fp\\)5>-gTPE\u0006c4mMxf?{\u0006\u000ek\u0004\u0016z8)\u001asO}\u001e\u000e/\u000ekvR\u0016 9+\"\u0017oh 2Qzx\u0001=F\bdV2C\u0010pve{y1@U2|\bRK\u0017w8\f5w|4#\u0003\u0015T\u0007}|Xh\u001d7.}2!6r:?\u0010hx\u001f_,\u0015TBf\fpu(O\u0012o!{]9%7?m:a_7b \u000e\u001f(t2R\u001d7#\u001cnMl\bOϥ+ݹVВ߿n(rVT-\"_\u0017H\r4[@TV6d]ZI#iB_`5\u000b\u000eW4\u0006IRm>g6\u0019\u0014@v?\n\u0001b=\f8(!r.\u000b\\1TXU\u001aU^l\rri>Ks[r\f:x&\u0011]\nh$L`2\u001ciVy\u0085W\u05ff\u007f́Ƭ\no\u0015\u0002}y_==*/ G\u0094}Ȑ0ˉÂw7\u0001\u0005w\u0013}\u0006ofiH\u0006}Z2$\u000euL\u000fM\u0012]\u001fc<IcRL\u0006,ʱ\fˌ#$,ԖF;\u000eSIT:al@\u0005zg\u00066*dur/\u001eؠ\u0005ݨ\u000e,qѢDpipLA)!oܕJЃ1l\u000fŵ\u001et\b\u001b\\\rs\u001b\u000eʗ\u0012Ԡ7\u0017\u0005Ә }N<ar{43ѱH\u038bw\u0004Bߑ2B\bYXYX\r\u0004\u009d`ŀnju˩0\u001cF%%\r2~\bײlڞd\u001d ñ\u001c\u0003TJtx{V9ޔBǦ(^6˷\\\u0017\u0014,FHE\u0019T߂bū\u00173Oؓ\u0012S n\u0014!K*2ܬ\u0012ɚkjOʤ&}fEQ39v!ղ7Ǚ`\u0005]ؽ\u001c|9/\u0018jYI\u001eݑJϹ.d\u000eچ]fN,R\u0016d*sN>O!\u000bhIu\u0001J&\u0014ո\u0017\u05ca\u00032jۙ,p\u001f-OW\u001dU,ƭ/ӟ\u0006\u0003\u0018Ýi\u001f\u0019\u001ek9`$Jԟ3Ĩ\u007f\bdų&\u0015{i(\u000fqL1/4F?C[l\u0005\u0007m%.ä\u000bǮ$',ʧ٣$do\u0013o%ݪcn"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\u0018Ivz", "", "AsPAf0@A\u0017\t\u0006^", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "AgP?X+)`\u0019\u007f\t", "\u001a`]1e6BRb|\u0005g;|\u0012>/m+wM\u0001\u0016\u0002To\u000f<\u0004%>W}.\r", "CrT?", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\nK\u0005)7I\f DC", "AcZ\u0018X@", "", "=oc6b5L", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\nK\u0005)7C\t/;w\u001f<#", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n^!$Q\u007f\u001d@\u007f%#W\b+7C|*VBHu8\u001d^fkB\u0016c5]@\u0015JH[,[=\u007f=\u0015\u0012g\u000eW)\r\u0013/(\"xL\u0001-\u0017(X\u0010?jJ\b\u001f\rBttAd\u000fMC\u0003\u0005=8vJ[O\bGN\u001bI/`\u001d[fc6C&]_((lY0_bQ\u001bz\u001c\bvcV'~:m:vZSOsTJs-h9\u000bs!@\\v\u0015\u007f<\b>3D:H<", "1`R5X\tR7\u0018", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJt!Pm\u001eI\u0004%>h`\u001cEp}*X\u0019", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`%k\f?vz", "1`R5X\u0012>g\u0001z\u0006i0\u0006\u000b", "1ta?X5M1\u0015|}^", "1ta?X5M4)\u0006\u0002N:|\u0016\ra}+{&\u0001+", "1ta?X5MC'~\b", "1ta?X5MC'~\b<(z\f/K\u007f<Z@\f$\u0017Ek\u001d<u", "1ta?X5MC'~\b<(z\f/K\u007f<l\r", "2hb=T;<V\u0019\fek6\u000e\r.e\r", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`%y\u001bF\u000749b}~;{!*\\A>kA\t\"rr=\u0006c9$", "5r^;", "\u001ab^:\".H]\u001b\u0006z(.\u000b\u00138/a6\u0006IV", ":nR._\u0016OS&\f~],\u000b", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\nK\u0005)7C\u000f Dz\u001a-MQ\u0011", "@dP@b5", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`'\u0001\nC\u0007!D]\b)$m\u0012<WL\u0011", "5dc\u001fX(L]\"", "u(;0b4\ba(z\nl0~R+n~5\u0006D\u007f%\u0016M9mMr,EU\r$Av\u0003.IQEt\n", "Adc\u001fX(L]\"", "uKR<`uLb\u0015\u000e\tb.F\u00058d\r2\u007f?\u000f\u0016\u001d\u0011O\u001f8}51h\u0002*@Z\u0016*[MDAw\u000f", "AsX0^@\u001dS*\u0003x^\f\u0010\u0014/r\u00040{I\u0010%", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`#Zq\u001b\u000b.1a\u0002\u001e\u0015w\u001f/QE\u0011", "/sc2`7MB#lvo,j\u00183c\u0006<l<\b'\u0017", "", "3w_\u001bT4>", ":`c2f;/O \u000fz", "0n^Af;KO$", "7mXA\\(EW.~kZ3\r\t=", "", "1gT0^\u000e:b\u0019", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`(o\nK\u000725;y/7C", "5`c2A(FS", "1qT.g,\u001e[$\u000e\u000f<(z\f/", "5dc\u000e_3(d\u0019\f\bb+|\u0017", "5dc\u0010T*AS\u0018b\u0004b;\u0001\u00056i\u0015$\u000bD\u000b \u0004G}\u0019F\u007f35", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`+x\u0012Kz!<]\u0013 $m$9WLIkr\f%f_9\u0015q-^}\u000bPP]0XYvR\u0014~Z\u001cY5\u0016\u0013Y\u0017", "5dc\u0010T*AS\u0018ove<|\u0017\u0010o\r\u0018\n@\u000e", "5dc\u0010b5?W\u001b", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`&\u0004\u00178~)37\b)8q\u0018\u0004", "1n]3\\.'O!~", "5dc\u0010b5?W\u001b]vm(", "<`\\2", "5dc\u0010h9KS\"\u000eXZ*\u007f\t a\u00078{N\\ \u0016'\u0001\nC\u0007!D]\b)$m\u0012<WL", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`'\u0003\u001d<\u0004.1`a);|\u001a*TGPk!\u001e#skB\u0015c\u0002", "5dc\u0010h9KS\"\u000ekZ3\r\t=A\u000e\u0016\u000bM\u0005 \u0019", "5dc\u0012i(Ec\u0015\u000e~h5[\t>a\u0004/\n", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`'\u0001\nC\u0007!D]\b)\u0016m%*QJIA", "D`[BX\fQW'\u000e\t", "", "@dP@b5(d\u0019\f\bb+|", "5dc\u0012i(Ec\u0015\u000e~h5[\t>a\u0004/\n~| \u0016Ty\u0012;p34_w-7t\u0016*[C", "5dc\u0012k7>`\u001d\u0007zg;", "3w_2e0FS\"\u000ecZ4|", "9dT=7,OW\u0017~kZ3\r\t", "5dc\u0013h3E1\u001c~xd:\r\u0011", "5dc\u0014_6;O ^\fZ3\r\u0005>i\n1Z@\u0010\u0013\u001bN}", "5dc\u0014_6;O ^\fZ3\r\u0005>i\n1Z@\u0010\u0013\u001bN}L8\u007f$Bc\u0002\u001f1{\u00154GP;r4\u001a#h", "5dc\u0019T:MC$}vm,k\r7e", "", "uKR<`uLb\u0015\u000e\tb.F\u00058d\r2\u007f?\u000f\u0016\u001d\u0011]\u001d8\u000639[m.7zkq4H7|0g\u001cdj;PJ6Wx|", "5dc\u0019T@>`", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`.k\"<\u0004z", "1kX2a;", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\nK\u0005)77\u0005$7v%\u0004", ":`h2e\u0015:[\u0019", "5dc\u001dT9:[\u0007\u000e\u0005k,", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`2k\u001b8~%DY\u000b\u000eFw#.#", ">`a.`\u001aM]&~cZ4|", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`2k\u001b8~%DY\u000b\u000eFw#.-T7rD\u001a$lkBpn;R\u00010U\"", "5dc\u001db:LW\u0016\u0006\u000fL;\u0001\u00075yp$\u0003P\u0001", "2dc.\\3L", "7r;.l,K", "5dc\u001de,OW#\u000f\t=,\n\r@e~\t\u007f@\b\u0016%", "5dc 7\u0012\u001fZ\u0015\u0001\t", "5dc V6IS\u0018\\v\\/|n/y", "5dc V6IS\u0018_\u000be3l\u0017/r]$yC\u0001|\u0017[", "5dc g0<Y-ove<|", "6xS?T;>2-\bvf0zf9n\u0001,}", "1n]3\\.", ":nP16(<V\u0019_\u0005k\n\r\u0016<e\t7kN\u0001$", "=uT?e0=Sv\t\u0004_0~", "D`[BX", "=uT?e0=Szz\n^", "=uT?e0=S\u007fz\u000f^9", ">da@\\:MA(\u0003xd@m\u00056u\u007f6", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "@d\\<i,\u001aZ h\f^9\n\r.e\u000e", "@d\\<i,(d\u0019\f\bb+|", "@d\\<i,,b\u001d|\u0001r\u001dx\u0010?e", "@db2g\u001cLS&", "A`e2", "2`c.", "uKR<`uLb\u0015\u000e\tb.F\u00058d\r2\u007f?\u000f\u0016\u001d\u0011S\u0017@\u0006)1`\u000257Z\u0016<XMDy4\\\u0003x_7\u0007q:O\u0007.+UR;`NyA)\u0012G\u000e\\6\u0017\u000egAyUBA'Q:X}Jv\u0005\u000e_\n>i}LZ\u000fUx\u001b?/8dUgc{7OEo\u007fK\u0012i,c>Cm\u0012{&%x_2\u0013{aZP\\\u0003vkP)vG(Hv1\n,tQMpp&G\u0005y[\u001cUy+r<Y", "A`e2B=>`&\u0003y^:k\u0013\u0016o}$\u0003.\u0010!$Cq\u000e", "Ax]0?6:Ry\f\u0005f\u0013\u0007\u0007+lm7\u0006M|\u0019\u0017", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class Store {
    private ConcurrentHashMap<String, Cache> cacheById;
    private ConcurrentHashMap<String, String> cacheKeyMapping;
    private Cache currentCache;
    private String currentFullUserCacheKey;
    private StatsigUser currentUser;
    private String currentUserCacheKeyDeprecated;
    private String currentUserCacheKeyV2;
    private final CoroutineDispatcherProvider dispatcherProvider;
    private final Gson gson;
    private StatsigOverrides localOverrides;
    private final StatsigOptions options;
    private EvaluationReason reason;
    private final String sdkKey;
    private final SharedPreferences sharedPrefs;
    private final CoroutineScope statsigScope;
    private ConcurrentHashMap<String, APIDynamicConfig> stickyDeviceExperiments;

    /* JADX INFO: renamed from: com.statsig.androidsdk.Store$persistStickyValues$1 */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            int i2 = this.label;
            this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
            return Store.this.persistStickyValues(this);
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.Store$save$1 */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class C12501 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C12501(Continuation<? super C12501> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
            return Store.this.save(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.Store$syncLoadFromLocalStorage$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class C12511 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C12511(Continuation<? super C12511> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Store.this.new C12511(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C12511) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (StatsigUtil.INSTANCE.removeFromSharedPrefs$android_sdk_release(Store.this.sharedPrefs, "Statsig.CACHE_BY_USER", this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.statsig.androidsdk.Store$syncLoadFromLocalStorage$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Store.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (StatsigUtil.INSTANCE.removeFromSharedPrefs$android_sdk_release(Store.this.sharedPrefs, "Statsig.STICKY_DEVICE_EXPERIMENTS", this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.statsig.androidsdk.Store$syncLoadFromLocalStorage$3 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Store.this.new AnonymousClass3(continuation);
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
                this.label = 1;
                if (StatsigUtil.INSTANCE.removeFromSharedPrefs$android_sdk_release(Store.this.sharedPrefs, "Statsig.LOCAL_OVERRIDES", this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.statsig.androidsdk.Store$syncLoadFromLocalStorage$4 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Store.this.new AnonymousClass4(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (StatsigUtil.INSTANCE.removeFromSharedPrefs$android_sdk_release(Store.this.sharedPrefs, "Statsig.CACHE_KEY_MAPPING", this) == coroutine_suspended) {
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

    public Store(CoroutineScope statsigScope, SharedPreferences sharedPrefs, StatsigUser user, String sdkKey, StatsigOptions options) {
        Intrinsics.checkNotNullParameter(statsigScope, "statsigScope");
        Intrinsics.checkNotNullParameter(sharedPrefs, "sharedPrefs");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(sdkKey, "sdkKey");
        Intrinsics.checkNotNullParameter(options, "options");
        this.statsigScope = statsigScope;
        this.sharedPrefs = sharedPrefs;
        this.sdkKey = sdkKey;
        this.options = options;
        this.gson = StatsigUtil.INSTANCE.getGson$android_sdk_release();
        this.dispatcherProvider = new CoroutineDispatcherProvider(null, null, null, 7, null);
        this.currentUserCacheKeyDeprecated = user.getCacheKeyDEPRECATED$android_sdk_release();
        this.currentUserCacheKeyV2 = getScopedCacheKey(user);
        this.currentFullUserCacheKey = getScopedFullUserCacheKey(user);
        this.cacheById = new ConcurrentHashMap<>();
        this.currentCache = createEmptyCache();
        this.stickyDeviceExperiments = new ConcurrentHashMap<>();
        this.localOverrides = StatsigOverrides.Companion.empty();
        this.reason = EvaluationReason.Uninitialized;
        this.cacheKeyMapping = new ConcurrentHashMap<>();
        this.currentUser = user;
    }

    private final void attemptToSaveStickyValue(String str, APIDynamicConfig aPIDynamicConfig) {
        if (aPIDynamicConfig == null) {
            return;
        }
        String hashedString = Hashing.INSTANCE.getHashedString(str, this.currentCache.getValues().getHashUsed());
        if (aPIDynamicConfig.isExperimentActive() && aPIDynamicConfig.isUserInExperiment()) {
            if (aPIDynamicConfig.isDeviceBased()) {
                this.stickyDeviceExperiments.put(hashedString, aPIDynamicConfig);
            } else {
                this.currentCache.getStickyUserExperiments().getExperiments().put(hashedString, aPIDynamicConfig);
            }
        }
    }

    private final Cache createEmptyCache() {
        return new Cache(new InitializeResponse.SuccessfulInitializeResponse(MapsKt.emptyMap(), MapsKt.emptyMap(), MapsKt.emptyMap(), false, null, 0L, MapsKt.emptyMap(), null, null, null, 768, null), new StickyUserExperiments(new LinkedHashMap()), "", Long.valueOf(System.currentTimeMillis()));
    }

    private final Cache getCachedValuesForUser(StatsigUser statsigUser) {
        Cache cache;
        Cache cache2 = this.cacheById.get(getScopedFullUserCacheKey(statsigUser));
        if (cache2 != null) {
            return cache2;
        }
        Cache cache3 = this.cacheById.get(getScopedCacheKey(statsigUser));
        if (cache3 == null) {
            cache3 = this.cacheById.get(statsigUser.getCacheKeyDEPRECATED$android_sdk_release());
        }
        if (cache3 != null) {
            return cache3;
        }
        String str = this.cacheKeyMapping.get(getScopedCacheKey(statsigUser));
        if (str == null) {
            str = this.cacheKeyMapping.get(statsigUser.getCacheKeyDEPRECATED$android_sdk_release());
        }
        if (str == null || (cache = this.cacheById.get(str)) == null) {
            return null;
        }
        return cache;
    }

    private final APIDynamicConfig getConfigData(String str) {
        InitializeResponse.SuccessfulInitializeResponse values = this.currentCache.getValues();
        Map<String, APIDynamicConfig> configs = values.getConfigs();
        APIDynamicConfig aPIDynamicConfig = configs == null ? null : configs.get(str);
        if (aPIDynamicConfig != null) {
            return aPIDynamicConfig;
        }
        Map<String, APIDynamicConfig> configs2 = values.getConfigs();
        if (configs2 == null) {
            return null;
        }
        return configs2.get(Hashing.INSTANCE.getHashedString(str, this.currentCache.getValues().getHashUsed()));
    }

    public static /* synthetic */ EvaluationDetails getEvaluationDetails$android_sdk_release$default(Store store, boolean z2, EvaluationReason evaluationReason, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            evaluationReason = null;
        }
        return store.getEvaluationDetails$android_sdk_release(z2, evaluationReason);
    }

    public static /* synthetic */ Layer getLayer$default(Store store, StatsigClient statsigClient, String str, boolean z2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            z2 = false;
        }
        return store.getLayer(statsigClient, str, z2);
    }

    private final APIDynamicConfig getPossiblyStickyValue(String str, APIDynamicConfig aPIDynamicConfig, boolean z2, EvaluationDetails evaluationDetails, boolean z3) {
        APIDynamicConfig aPIDynamicConfig2;
        Map<String, APIDynamicConfig> configs;
        if (!z2) {
            removeStickyValue(str);
            return aPIDynamicConfig;
        }
        APIDynamicConfig stickyValue = getStickyValue(str);
        if (stickyValue == null) {
            attemptToSaveStickyValue(str, aPIDynamicConfig);
            return aPIDynamicConfig;
        }
        if (z3) {
            String allocatedExperimentName = stickyValue.getAllocatedExperimentName();
            aPIDynamicConfig2 = (allocatedExperimentName == null || (configs = this.currentCache.getValues().getConfigs()) == null) ? null : configs.get(allocatedExperimentName);
        } else {
            aPIDynamicConfig2 = aPIDynamicConfig;
        }
        if (Intrinsics.areEqual((Object) (aPIDynamicConfig2 == null ? null : Boolean.valueOf(aPIDynamicConfig2.isExperimentActive())), (Object) true)) {
            evaluationDetails.setReason(EvaluationReason.Sticky);
            return stickyValue;
        }
        if (Intrinsics.areEqual((Object) (aPIDynamicConfig != null ? Boolean.valueOf(aPIDynamicConfig.isExperimentActive()) : null), (Object) true)) {
            attemptToSaveStickyValue(str, aPIDynamicConfig);
        } else {
            removeStickyValue(str);
        }
        return aPIDynamicConfig;
    }

    private final String getScopedCacheKey(StatsigUser statsigUser) {
        return this.options.getCustomCacheKey().invoke(this.sdkKey, statsigUser);
    }

    private final String getScopedFullUserCacheKey(StatsigUser statsigUser) {
        return statsigUser.toHashString$android_sdk_release() + AbstractJsonLexerKt.COLON + this.sdkKey;
    }

    private final APIDynamicConfig getStickyValue(String str) {
        String hashedString = Hashing.INSTANCE.getHashedString(str, this.currentCache.getValues().getHashUsed());
        APIDynamicConfig aPIDynamicConfig = this.currentCache.getStickyUserExperiments().getExperiments().get(hashedString);
        return aPIDynamicConfig == null ? this.stickyDeviceExperiments.get(hashedString) : aPIDynamicConfig;
    }

    private final DynamicConfig hydrateDynamicConfig(String str, EvaluationDetails evaluationDetails, APIDynamicConfig aPIDynamicConfig) {
        return aPIDynamicConfig != null ? new DynamicConfig(str, aPIDynamicConfig, evaluationDetails) : new DynamicConfig(str, evaluationDetails, null, null, null, null, false, false, false, null, null, 2044, null);
    }

    private final void removeStickyValue(String str) {
        String hashedString = Hashing.INSTANCE.getHashedString(str, this.currentCache.getValues().getHashUsed());
        this.currentCache.getStickyUserExperiments().getExperiments().remove(hashedString);
        this.stickyDeviceExperiments.remove(hashedString);
    }

    public final void bootstrap(Map<String, ? extends Object> initializeValues, StatsigUser user) {
        Intrinsics.checkNotNullParameter(initializeValues, "initializeValues");
        Intrinsics.checkNotNullParameter(user, "user");
        this.reason = BootstrapValidator.INSTANCE.isValid(initializeValues, user) ? EvaluationReason.Bootstrap : EvaluationReason.InvalidBootstrap;
        try {
            Cache cache = this.currentCache;
            Gson gson = this.gson;
            Object objFromJson = gson.fromJson(gson.toJson(initializeValues), (Class<Object>) InitializeResponse.SuccessfulInitializeResponse.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "gson.fromJson(\n                gson.toJson(initializeValues),\n                InitializeResponse.SuccessfulInitializeResponse::class.java,\n            )");
            cache.setValues((InitializeResponse.SuccessfulInitializeResponse) objFromJson);
            this.cacheKeyMapping.put(this.currentUserCacheKeyV2, this.currentFullUserCacheKey);
            this.cacheById.put(this.currentFullUserCacheKey, this.currentCache);
        } catch (Exception unused) {
        }
    }

    public final FeatureGate checkGate(String gateName) {
        Intrinsics.checkNotNullParameter(gateName, "gateName");
        Boolean bool = this.localOverrides.getGates().get(gateName);
        if (bool != null) {
            return new FeatureGate(gateName, getEvaluationDetails$android_sdk_release(false, EvaluationReason.LocalOverride), bool.booleanValue(), "override", null, null, null, PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION, null);
        }
        Map<String, APIFeatureGate> featureGates = this.currentCache.getValues().getFeatureGates();
        APIFeatureGate aPIFeatureGate = featureGates == null ? null : featureGates.get(gateName);
        if (aPIFeatureGate == null) {
            Map<String, APIFeatureGate> featureGates2 = this.currentCache.getValues().getFeatureGates();
            aPIFeatureGate = featureGates2 == null ? null : featureGates2.get(Hashing.INSTANCE.getHashedString(gateName, this.currentCache.getValues().getHashUsed()));
        }
        return aPIFeatureGate == null ? new FeatureGate(gateName, getEvaluationDetails$android_sdk_release$default(this, false, null, 2, null), false, null, null, null, null, 120, null) : new FeatureGate(gateName, aPIFeatureGate, getEvaluationDetails$android_sdk_release$default(this, true, null, 2, null));
    }

    public final StatsigOverrides getAllOverrides() {
        return new StatsigOverrides(this.localOverrides.getGates(), this.localOverrides.getConfigs(), this.localOverrides.getLayers());
    }

    public final InitializeResponse.SuccessfulInitializeResponse getCachedInitializationResponse() {
        return this.currentCache.getValues();
    }

    public final DynamicConfig getConfig(String configName) {
        Intrinsics.checkNotNullParameter(configName, "configName");
        Map<String, Object> map = this.localOverrides.getConfigs().get(configName);
        if (map != null) {
            return new DynamicConfig(configName, getEvaluationDetails$android_sdk_release(false, EvaluationReason.LocalOverride), map, "override", null, null, false, false, false, null, null, 2032, null);
        }
        APIDynamicConfig configData = getConfigData(configName);
        return hydrateDynamicConfig(configName, getEvaluationDetails$android_sdk_release$default(this, configData != null, null, 2, null), configData);
    }

    public final ExternalInitializeResponse getCurrentCacheValuesAndEvaluationReason() {
        return new ExternalInitializeResponse(this.gson.toJson(this.currentCache.getValues()), getEvaluationDetails$android_sdk_release$default(this, true, null, 2, null));
    }

    public final String getCurrentValuesAsString() {
        String json = this.gson.toJson(this.currentCache.getValues());
        Intrinsics.checkNotNullExpressionValue(json, "gson.toJson(currentCache.values)");
        return json;
    }

    public final EvaluationDetails getEvaluationDetails$android_sdk_release(boolean z2, EvaluationReason evaluationReason) {
        if (z2) {
            return getGlobalEvaluationDetails$android_sdk_release();
        }
        EvaluationReason evaluationReason2 = EvaluationReason.Unrecognized;
        if (this.reason == EvaluationReason.Uninitialized) {
            evaluationReason2 = EvaluationReason.Uninitialized;
        }
        if (evaluationReason != null) {
            evaluationReason2 = evaluationReason;
        }
        return new EvaluationDetails(evaluationReason2, System.currentTimeMillis(), this.currentCache.getValues().getTime());
    }

    public final DynamicConfig getExperiment(String experimentName, boolean z2) {
        Intrinsics.checkNotNullParameter(experimentName, "experimentName");
        Map<String, Object> map = this.localOverrides.getConfigs().get(experimentName);
        if (map != null) {
            return new DynamicConfig(experimentName, getEvaluationDetails$android_sdk_release(false, EvaluationReason.LocalOverride), map, "override", null, null, false, false, false, null, null, 2032, null);
        }
        Map<String, APIDynamicConfig> configs = this.currentCache.getValues().getConfigs();
        APIDynamicConfig aPIDynamicConfig = configs == null ? null : configs.get(experimentName);
        if (aPIDynamicConfig == null) {
            Map<String, APIDynamicConfig> configs2 = this.currentCache.getValues().getConfigs();
            aPIDynamicConfig = configs2 == null ? null : configs2.get(Hashing.INSTANCE.getHashedString(experimentName, this.currentCache.getValues().getHashUsed()));
        }
        EvaluationDetails evaluationDetails$android_sdk_release$default = getEvaluationDetails$android_sdk_release$default(this, aPIDynamicConfig != null, null, 2, null);
        return hydrateDynamicConfig(experimentName, evaluationDetails$android_sdk_release$default, getPossiblyStickyValue(experimentName, aPIDynamicConfig, z2, evaluationDetails$android_sdk_release$default, false));
    }

    public final String getFullChecksum(StatsigUser user) {
        String fullChecksum;
        Intrinsics.checkNotNullParameter(user, "user");
        Cache cachedValuesForUser = getCachedValuesForUser(user);
        InitializeResponse.SuccessfulInitializeResponse values = cachedValuesForUser == null ? null : cachedValuesForUser.getValues();
        if (values == null || (fullChecksum = values.getFullChecksum()) == null) {
            return null;
        }
        return fullChecksum;
    }

    public final EvaluationDetails getGlobalEvaluationDetails$android_sdk_release() {
        EvaluationReason evaluationReason = this.reason;
        Long evaluationTime = this.currentCache.getEvaluationTime();
        return new EvaluationDetails(evaluationReason, evaluationTime == null ? System.currentTimeMillis() : evaluationTime.longValue(), this.currentCache.getValues().getTime());
    }

    public final Long getLastUpdateTime(StatsigUser user) {
        Intrinsics.checkNotNullParameter(user, "user");
        Cache cachedValuesForUser = getCachedValuesForUser(user);
        if (Intrinsics.areEqual(cachedValuesForUser == null ? null : cachedValuesForUser.getUserHash(), user.toHashString$android_sdk_release()) && cachedValuesForUser != null) {
            return Long.valueOf(cachedValuesForUser.getValues().getTime());
        }
        return null;
    }

    public final Layer getLayer(StatsigClient statsigClient, String layerName, boolean z2) {
        Intrinsics.checkNotNullParameter(layerName, "layerName");
        Map<String, Object> map = this.localOverrides.getLayers().get(layerName);
        if (map != null) {
            return new Layer(null, layerName, getEvaluationDetails$android_sdk_release(false, EvaluationReason.LocalOverride), map, "override", null, null, null, false, false, false, null, null, null, 16352, null);
        }
        Map<String, APIDynamicConfig> layerConfigs = this.currentCache.getValues().getLayerConfigs();
        APIDynamicConfig aPIDynamicConfig = layerConfigs == null ? null : layerConfigs.get(layerName);
        if (aPIDynamicConfig == null) {
            Map<String, APIDynamicConfig> layerConfigs2 = this.currentCache.getValues().getLayerConfigs();
            aPIDynamicConfig = layerConfigs2 == null ? null : layerConfigs2.get(Hashing.INSTANCE.getHashedString(layerName, this.currentCache.getValues().getHashUsed()));
        }
        EvaluationDetails evaluationDetails$android_sdk_release$default = getEvaluationDetails$android_sdk_release$default(this, aPIDynamicConfig != null, null, 2, null);
        APIDynamicConfig possiblyStickyValue = getPossiblyStickyValue(layerName, aPIDynamicConfig, z2, evaluationDetails$android_sdk_release$default, true);
        return possiblyStickyValue != null ? new Layer(statsigClient, layerName, possiblyStickyValue, evaluationDetails$android_sdk_release$default) : new Layer(statsigClient, layerName, evaluationDetails$android_sdk_release$default, null, null, null, null, null, false, false, false, null, null, null, 16376, null);
    }

    public final ParameterStore getParamStore(StatsigClient client, String paramStoreName, ParameterStoreEvaluationOptions parameterStoreEvaluationOptions) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(paramStoreName, "paramStoreName");
        InitializeResponse.SuccessfulInitializeResponse values = this.currentCache.getValues();
        if (values.getParamStores() == null) {
            return new ParameterStore(client, new HashMap(), paramStoreName, getEvaluationDetails$android_sdk_release$default(this, false, null, 2, null), parameterStoreEvaluationOptions);
        }
        Map<String, Map<String, Object>> map = values.getParamStores().get(paramStoreName);
        if (map != null) {
            return new ParameterStore(client, map, paramStoreName, getEvaluationDetails$android_sdk_release$default(this, true, null, 2, null), parameterStoreEvaluationOptions);
        }
        Map<String, Map<String, Object>> map2 = values.getParamStores().get(Hashing.INSTANCE.getHashedString(paramStoreName, this.currentCache.getValues().getHashUsed()));
        return new ParameterStore(client, map2 == null ? new HashMap() : map2, paramStoreName, getEvaluationDetails$android_sdk_release$default(this, map2 != null, null, 2, null), parameterStoreEvaluationOptions);
    }

    public final Map<String, String> getPreviousDerivedFields(StatsigUser user) {
        Intrinsics.checkNotNullParameter(user, "user");
        Cache cachedValuesForUser = getCachedValuesForUser(user);
        if (!Intrinsics.areEqual(cachedValuesForUser == null ? null : cachedValuesForUser.getUserHash(), user.toHashString$android_sdk_release())) {
            return MapsKt.emptyMap();
        }
        Map<String, String> derivedFields = cachedValuesForUser != null ? cachedValuesForUser.getValues().getDerivedFields() : null;
        return derivedFields == null ? MapsKt.emptyMap() : derivedFields;
    }

    public final EvaluationReason getReason() {
        return this.reason;
    }

    public final Map<String, Object> getSDKFlags() {
        return this.currentCache.getValues().getSdkFlags();
    }

    public final void loadCacheForCurrentUser() {
        Cache cachedValuesForUser = getCachedValuesForUser(this.currentUser);
        if (cachedValuesForUser == null) {
            this.currentCache = createEmptyCache();
        } else {
            this.currentCache = cachedValuesForUser;
            this.reason = EvaluationReason.Cache;
        }
    }

    public final void overrideConfig(String configName, Map<String, ? extends Object> value) {
        Intrinsics.checkNotNullParameter(configName, "configName");
        Intrinsics.checkNotNullParameter(value, "value");
        this.localOverrides.getConfigs().put(configName, value);
    }

    public final void overrideGate(String gateName, boolean z2) {
        Intrinsics.checkNotNullParameter(gateName, "gateName");
        this.localOverrides.getGates().put(gateName, Boolean.valueOf(z2));
    }

    public final void overrideLayer(String layerName, Map<String, ? extends Object> value) {
        Intrinsics.checkNotNullParameter(layerName, "layerName");
        Intrinsics.checkNotNullParameter(value, "value");
        this.localOverrides.getLayers().put(layerName, value);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object persistStickyValues(kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.statsig.androidsdk.Store.AnonymousClass1
            if (r0 == 0) goto L72
            r5 = r9
            com.statsig.androidsdk.Store$persistStickyValues$1 r5 = (com.statsig.androidsdk.Store.AnonymousClass1) r5
            int r0 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L72
            int r0 = r5.label
            int r0 = r0 - r1
            r5.label = r0
        L13:
            java.lang.Object r1 = r5.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r5.label
            r6 = 2
            r7 = 1
            if (r0 == 0) goto L29
            if (r0 == r7) goto L4c
            if (r0 != r6) goto L78
            kotlin.ResultKt.throwOnFailure(r1)
        L26:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L29:
            kotlin.ResultKt.throwOnFailure(r1)
            com.statsig.androidsdk.StatsigUtil r3 = com.statsig.androidsdk.StatsigUtil.INSTANCE
            android.content.SharedPreferences r2 = r8.sharedPrefs
            com.google.gson.Gson r1 = r8.gson
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.statsig.androidsdk.Cache> r0 = r8.cacheById
            java.lang.String r1 = r1.toJson(r0)
            java.lang.String r0 = "gson.toJson(cacheById)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            r5.L$0 = r8
            r5.label = r7
            java.lang.String r0 = "Statsig.CACHE_BY_USER"
            java.lang.Object r0 = r3.saveStringToSharedPrefs$android_sdk_release(r2, r0, r1, r5)
            if (r0 != r4) goto L4a
            return r4
        L4a:
            r0 = r8
            goto L53
        L4c:
            java.lang.Object r0 = r5.L$0
            com.statsig.androidsdk.Store r0 = (com.statsig.androidsdk.Store) r0
            kotlin.ResultKt.throwOnFailure(r1)
        L53:
            com.statsig.androidsdk.StatsigUtil r3 = com.statsig.androidsdk.StatsigUtil.INSTANCE
            android.content.SharedPreferences r2 = r0.sharedPrefs
            com.google.gson.Gson r1 = r0.gson
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.statsig.androidsdk.APIDynamicConfig> r0 = r0.stickyDeviceExperiments
            java.lang.String r1 = r1.toJson(r0)
            java.lang.String r0 = "gson.toJson(stickyDeviceExperiments)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            r0 = 0
            r5.L$0 = r0
            r5.label = r6
            java.lang.String r0 = "Statsig.STICKY_DEVICE_EXPERIMENTS"
            java.lang.Object r0 = r3.saveStringToSharedPrefs$android_sdk_release(r2, r0, r1, r5)
            if (r0 != r4) goto L26
            return r4
        L72:
            com.statsig.androidsdk.Store$persistStickyValues$1 r5 = new com.statsig.androidsdk.Store$persistStickyValues$1
            r5.<init>(r9)
            goto L13
        L78:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.statsig.androidsdk.Store.persistStickyValues(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void removeAllOverrides() {
        this.localOverrides = StatsigOverrides.Companion.empty();
    }

    public final void removeOverride(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.localOverrides.getConfigs().remove(name);
        this.localOverrides.getGates().remove(name);
        this.localOverrides.getLayers().remove(name);
    }

    public final void resetUser(StatsigUser user) {
        Intrinsics.checkNotNullParameter(user, "user");
        this.reason = EvaluationReason.Uninitialized;
        this.currentUserCacheKeyDeprecated = user.getCacheKeyDEPRECATED$android_sdk_release();
        this.currentUserCacheKeyV2 = getScopedCacheKey(user);
        this.currentFullUserCacheKey = getScopedFullUserCacheKey(user);
        this.currentUser = user;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object save(com.statsig.androidsdk.InitializeResponse.SuccessfulInitializeResponse r10, com.statsig.androidsdk.StatsigUser r11, kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.statsig.androidsdk.Store.save(com.statsig.androidsdk.InitializeResponse$SuccessfulInitializeResponse, com.statsig.androidsdk.StatsigUser, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object saveOverridesToLocalStorage(Continuation<? super Unit> continuation) {
        StatsigUtil statsigUtil = StatsigUtil.INSTANCE;
        SharedPreferences sharedPreferences = this.sharedPrefs;
        String json = this.gson.toJson(this.localOverrides);
        Intrinsics.checkNotNullExpressionValue(json, "gson.toJson(localOverrides)");
        Object objSaveStringToSharedPrefs$android_sdk_release = statsigUtil.saveStringToSharedPrefs$android_sdk_release(sharedPreferences, "Statsig.LOCAL_OVERRIDES", json, continuation);
        return objSaveStringToSharedPrefs$android_sdk_release == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSaveStringToSharedPrefs$android_sdk_release : Unit.INSTANCE;
    }

    public final void setReason(EvaluationReason evaluationReason) {
        Intrinsics.checkNotNullParameter(evaluationReason, "<set-?>");
        this.reason = evaluationReason;
    }

    public final void syncLoadFromLocalStorage() {
        String strSyncGetFromSharedPrefs$android_sdk_release = StatsigUtil.INSTANCE.syncGetFromSharedPrefs$android_sdk_release(this.sharedPrefs, "Statsig.CACHE_BY_USER");
        String strSyncGetFromSharedPrefs$android_sdk_release2 = StatsigUtil.INSTANCE.syncGetFromSharedPrefs$android_sdk_release(this.sharedPrefs, "Statsig.STICKY_DEVICE_EXPERIMENTS");
        String strSyncGetFromSharedPrefs$android_sdk_release3 = StatsigUtil.INSTANCE.syncGetFromSharedPrefs$android_sdk_release(this.sharedPrefs, "Statsig.LOCAL_OVERRIDES");
        String strSyncGetFromSharedPrefs$android_sdk_release4 = StatsigUtil.INSTANCE.syncGetFromSharedPrefs$android_sdk_release(this.sharedPrefs, "Statsig.CACHE_KEY_MAPPING");
        if (strSyncGetFromSharedPrefs$android_sdk_release != null) {
            try {
                Object objFromJson = this.gson.fromJson(strSyncGetFromSharedPrefs$android_sdk_release, new TypeToken<Map<String, Cache>>() { // from class: com.statsig.androidsdk.Store$syncLoadFromLocalStorage$type$1
                }.getType());
                Intrinsics.checkNotNullExpressionValue(objFromJson, "gson.fromJson(cachedResponse, type)");
                this.cacheById = new ConcurrentHashMap<>((Map) objFromJson);
            } catch (Exception unused) {
                BuildersKt__Builders_commonKt.launch$default(this.statsigScope, this.dispatcherProvider.getIo(), null, new C12511(null), 2, null);
            }
        }
        this.stickyDeviceExperiments = new ConcurrentHashMap<>();
        if (strSyncGetFromSharedPrefs$android_sdk_release2 != null) {
            try {
                Object objFromJson2 = this.gson.fromJson(strSyncGetFromSharedPrefs$android_sdk_release2, new TypeToken<Map<String, APIDynamicConfig>>() { // from class: com.statsig.androidsdk.Store$syncLoadFromLocalStorage$type$2
                }.getType());
                Intrinsics.checkNotNullExpressionValue(objFromJson2, "gson.fromJson(cachedDeviceValues, type)");
                this.stickyDeviceExperiments = new ConcurrentHashMap<>((Map) objFromJson2);
            } catch (Exception unused2) {
                BuildersKt__Builders_commonKt.launch$default(this.statsigScope, this.dispatcherProvider.getIo(), null, new AnonymousClass2(null), 2, null);
            }
        }
        this.localOverrides = StatsigOverrides.Companion.empty();
        if (strSyncGetFromSharedPrefs$android_sdk_release3 != null) {
            try {
                Object objFromJson3 = this.gson.fromJson(strSyncGetFromSharedPrefs$android_sdk_release3, (Class<Object>) StatsigOverrides.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson3, "gson.fromJson(cachedLocalOverrides, StatsigOverrides::class.java)");
                this.localOverrides = (StatsigOverrides) objFromJson3;
            } catch (Exception unused3) {
                BuildersKt__Builders_commonKt.launch$default(this.statsigScope, this.dispatcherProvider.getIo(), null, new AnonymousClass3(null), 2, null);
            }
        }
        this.cacheKeyMapping = new ConcurrentHashMap<>();
        if (strSyncGetFromSharedPrefs$android_sdk_release4 != null) {
            try {
                Object objFromJson4 = this.gson.fromJson(strSyncGetFromSharedPrefs$android_sdk_release4, new TypeToken<ConcurrentHashMap<String, String>>() { // from class: com.statsig.androidsdk.Store$syncLoadFromLocalStorage$type$3
                }.getType());
                Intrinsics.checkNotNullExpressionValue(objFromJson4, "gson.fromJson(cachedCacheKeyMapping, type)");
                this.cacheKeyMapping = (ConcurrentHashMap) objFromJson4;
            } catch (Exception unused4) {
                BuildersKt__Builders_commonKt.launch$default(this.statsigScope, this.dispatcherProvider.getIo(), null, new AnonymousClass4(null), 2, null);
            }
        }
        loadCacheForCurrentUser();
    }
}
